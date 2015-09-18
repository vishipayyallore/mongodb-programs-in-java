package com.utilities.datastore.connection;

import com.mongodb.MongoClient;
import com.utilities.datastore.interfaces.IManager;

/**
 * 
 * @author Viswanatha
 *
 */

public class MongoDbConnectionManager implements IManager {

	//Variables.
	MongoClient _mongoClient = null;
	
	@Override
	public MongoClient getConnection() {
		if(_mongoClient == null) {
			_mongoClient = new MongoClient();
		}
		return _mongoClient;
	}

	@Override
	public void closeConnection() {
		if(_mongoClient != null )
		{
			_mongoClient.close();
			_mongoClient = null;
		}
	}

}
