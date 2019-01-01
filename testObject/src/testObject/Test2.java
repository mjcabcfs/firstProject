package testObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.stream.IntStream;

public class Test2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		IntStream.range(0, 10).forEach(i -> System.out.println("Java!"));
		String strA = "ABC";
		String strB = strA.repeat(3);
		System.out.println(strB);
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
		                                 .uri(URI.create("http://openjdk.java.net/"))
		                                 .build();
		client.sendAsync(request, BodyHandlers.ofString())
		      .thenApply(HttpResponse::body)
		      .thenAccept(System.out::println)
		      .join();

	}

}
