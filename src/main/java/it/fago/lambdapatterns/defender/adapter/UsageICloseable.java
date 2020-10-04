package it.fago.lambdapatterns.defender.adapter;

import static it.fago.lambdapatterns.defender.adapter.ICloseable.fromResource;

import java.util.Arrays;

public class UsageICloseable {

	public static void main(String[] args) {
		
		Service service = dummyService();
		
		try (ICloseable<Service> closeable = fromResource(service, Service::destroy)) {
			service.execute("Hello World!");
		}
	}

	protected static Service dummyService() {
		return new Service() {
			
			@Override
			public void execute(Object... arguments) {
				System.out.printf("Executing with %s...\n",Arrays.toString(arguments));
			}
			
			@Override
			public void destroy() {
				System.out.println("Destroying...");
			}
		};
	}
}
