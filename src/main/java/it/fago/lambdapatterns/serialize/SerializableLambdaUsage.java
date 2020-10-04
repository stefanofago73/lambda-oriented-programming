package it.fago.lambdapatterns.serialize;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableLambdaUsage {

	public static void main(String[] args)throws Exception {
		
		// Local usage
		GreetCommand cmd = ()-> "Hello World from: %s";		
		System.out.println(cmd.messageFor("John"));
		
		// Remote Usage
		byte [] data = serialize((Serializable) cmd.serializable());
		cmd = (GreetCommand) deserialize(data);
		System.out.println(cmd.messageFor("John"));
	}

	private static byte[] serialize(Serializable obj) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try (ObjectOutputStream outputStream = new ObjectOutputStream(baos)) {
			outputStream.writeObject(obj);
		}
		return baos.toByteArray();
	}

	private static Object deserialize(byte[] data) throws IOException, ClassNotFoundException {
		ByteArrayInputStream bais = new ByteArrayInputStream(data);
		try (ObjectInputStream inputStream = new ObjectInputStream(bais)) {
			return inputStream.readObject();
		}
	}
}
