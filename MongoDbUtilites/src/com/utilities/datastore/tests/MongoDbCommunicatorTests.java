package com.utilities.datastore.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.bson.Document;
import org.junit.Test;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;
import com.utilities.datastore.communications.MongoDbCommunicator;

/**
 * 
 * @author Viswanatha
 *
 */

public class MongoDbCommunicatorTests {
		
	private static MongoDbCommunicator _communicator = new MongoDbCommunicator();
	private static MongoDatabase _database;
	FindIterable<Document> _documentsCollection;
	
	@Test
	public void testGet_test_Database() {
		_database = _communicator.getDatabase("test");
		assertNotNull(_database);
		System.out.printf("\nName: " + _database.getName());
	}

	@Test
	public void testGet_dailywork_Database() {
		_database = _communicator.getDatabase("dailywork");
		assertNotNull(_database);
		System.out.printf("\nName: " + _database.getName());
	}
	
	@Test
	public void testGetCollection() {
		_documentsCollection = _communicator.getCollection(_database, "restaurants");
		System.out.printf("\nDocument: " + _documentsCollection.first());
	}

	@Test
	public void testShowData() {
		_documentsCollection = _communicator.getCollection(_database, "restaurants");
		_communicator.showData(_documentsCollection);
		//fail("Not yet implemented");
	}
}
