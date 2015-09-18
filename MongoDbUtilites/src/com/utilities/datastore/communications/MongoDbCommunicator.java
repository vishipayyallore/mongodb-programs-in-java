package com.utilities.datastore.communications;

import org.bson.Document;

import com.mongodb.Block;
import com.mongodb.client.*;
import com.utilities.datastore.connection.*;

/**
 * 
 * @author Viswanatha
 *
 */

public class MongoDbCommunicator {

	MongoDbConnectionManager _mongoDbManager;
	MongoDatabase _database;
	
	public MongoDbCommunicator(){
		_mongoDbManager = new MongoDbConnectionManager();
	}
	
	
	public MongoDatabase getDatabase(String databaseName){
		_database = _mongoDbManager
				.getConnection()
				.getDatabase(databaseName);
		return _database;
	}
	
	public FindIterable<Document> getCollection(MongoDatabase _database, String collectionName){
		return _database.getCollection(collectionName).find();
	}
	
	public void showData(FindIterable<Document> documentCollection){
		documentCollection.forEach(new Block<Document>() {
		    @Override
		    public void apply(final Document document) {
		        System.out.println(document);
		    }
		});
	}
}
