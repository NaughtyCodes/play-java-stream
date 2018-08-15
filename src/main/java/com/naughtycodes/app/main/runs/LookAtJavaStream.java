package com.naughtycodes.app.main.runs;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LookAtJavaStream {

	public static final String filePath = "D:\\WorkSpaceOxygen\\play-java-stream\\src\\main\\resources\\static\\data.json";
	public static List<Comment> comments;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loadData();
		comments.stream()
			.filter(c->c.getEmail().startsWith("A"))
			.collect(Collectors.toList())
			;//.forEach(System.out::println);
		
		comments.stream()
			.filter(c->c.getEmail().startsWith("A"))
			.map(Comment::formatData)
			.collect(Collectors.toList())
			.forEach(System.out::println);

	}
	
	static String formatData(Comment s) {
		return s.getEmail().substring(0, 5);
	}
	
	static void loadData() {
		
		try {
			System.out.println("starting...!!!");
			ObjectMapper mapper = new ObjectMapper();
			comments = mapper.readValue(new File(filePath), new TypeReference<List<Comment>>() {});
			System.out.println(comments.size());
			System.out.println("ending...!!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
