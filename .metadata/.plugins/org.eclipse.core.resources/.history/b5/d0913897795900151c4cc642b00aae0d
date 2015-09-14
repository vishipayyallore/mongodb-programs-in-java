package com.day1.main;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Day1Main {

	public static void main(String[] args) {
		System.out.printf("\n\nHello MongoDB World!");
		
		MongoClient mongoClient = new MongoClient();
		
		MongoDatabase db = mongoClient.getDatabase("test");

		System.out.println(db.getReadPreference().toString());
		
		MongoCollection<Document> _documents = db.getCollection("restaurants");
		
		System.out.printf(_documents.toString());
		
		mongoClient.close();
		
		System.out.printf("\n\nAll Is Well!");
	}

}
