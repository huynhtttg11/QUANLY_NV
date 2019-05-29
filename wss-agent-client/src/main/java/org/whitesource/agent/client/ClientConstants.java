/**
 * Copyright (C) 2012 White Source Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.whitesource.agent.client;

/**
 * WhiteSource service API client constants.
 * 
 * @author tom.shapira
 */
public final class ClientConstants {
	
	/* --- Service info --- */

    public static final String SERVICE_URL_KEYWORD = "wss.url";

	public static final String CONNECTION_TIMEOUT_KEYWORD = "wss.connectionTimeoutMinutes";

	public static final String DEFAULT_SERVICE_URL = "https://saas.whitesourcesoftware.com/agent";

	public static final String APPLICATION_JSON = "application/json";

	public static final int DEFAULT_CONNECTION_TIMEOUT_MINUTES = 60;

	/* --- Constructors --- */
	
	/**
	 * Private default constructor
	 */
	private ClientConstants() {
		// avoid instantiation
	}

}