package com.day1.main;

import java.util.List;

/**
 * 
 * @author Viswanatha
 *
 */

import org.bson.Document;
import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;

public class Day2Main {

	public static void main(String[] args) {

		MongoClient mongoClient = new MongoClient();
				
		MongoDatabase db = mongoClient.getDatabase("dailywork");
		
		FindIterable<Document> iterable = db.getCollection("restaurants").find();

		iterable.forEach(new Block<Document>() {
		    @Override
		    public void apply(final Document document) {
		        System.out.println(document);
		    }
		});

		mongoClient.close();
	}

}
