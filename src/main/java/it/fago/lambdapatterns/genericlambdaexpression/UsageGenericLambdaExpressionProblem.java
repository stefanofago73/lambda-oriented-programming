package it.fago.lambdapatterns.genericlambdaexpression;

public class UsageGenericLambdaExpressionProblem {

	public static void main(String[] args) {
		
		//Factory f1 = ()->new Product<>(); 
		//Factory f2 = ()->new Product<?>(); 
		//Factory f3 = ()->new Product<Long>();
		
		Factory f4 = Product::new;
		
		System.out.println(f4.<Integer>make());
		
		Factory f5 = new Factory() {
			
			@Override
			public <T> Product<T> make() {
				return new Product<T>();
			}
		};
		
		System.out.println(f5.<Integer>make());
	}
}
