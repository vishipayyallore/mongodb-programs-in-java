package com.utilities.datastore.interfaces;

import com.mongodb.MongoClient;

/**
 * 
 * @author Viswanatha
 *
 */

public interface IManager {

	/**
	 * 
	 * @return
	 */
	MongoClient getConnection();
	
	/**
	 * 
	 */
	void closeConnection();
	
}
