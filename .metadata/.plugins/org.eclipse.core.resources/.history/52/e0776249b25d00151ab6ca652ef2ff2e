package com.utilities.datastore.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.mongodb.MongoClient;
import com.utilities.datastore.connection.*;

/**
 * 
 * @author Viswanatha
 *
 */

public class MongoDbConnectionTests {

	private static MongoDbConnectionManager _connectionManager = new MongoDbConnectionManager();
	
	@Before
	public void setUp() throws Exception {
		//_connectionManager = new MongoDbConnectionManager();
	}

	@After
	public void tearDown() throws Exception {
		//_connectionManager = null;
	}
	
	@Test
	public void testGetConnection() {
		MongoClient mongoClient = _connectionManager.getConnection();
		assertNotNull("Object Created", mongoClient);
		System.out.printf("%s", mongoClient.getAddress());
	}

	@Test
	public void testsecondGetConnection() {
		MongoClient mongoClient = _connectionManager.getConnection();
		assertNotNull("Object Created", mongoClient);
		System.out.printf("%s", mongoClient.getAddress());
	}
	
	@Test
	public void testCloseConnection() {
		_connectionManager.closeConnection();
	}

}
