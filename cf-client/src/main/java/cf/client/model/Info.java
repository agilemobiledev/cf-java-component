/*
 *   Copyright (c) 2013 Intellectual Reserve, Inc.  All rights reserved.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */
package cf.client.model;

import cf.common.JsonObject;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.URI;

/**
 * @author Mike Heath <elcapo@gmail.com>
 */
public class Info extends JsonObject {

	private final String name;
	private final Integer version;
	private final URI authorizationEndpoint;
	private final URI tokenEndpoint;

	public Info(
			@JsonProperty("name") String name,
			@JsonProperty("version") Integer version,
			@JsonProperty("authorization_endpoint") URI authorizationEndpoint,
			@JsonProperty("token_endpoint") URI tokenEndpoint) {
		this.name = name;
		this.version = version;
		this.authorizationEndpoint = authorizationEndpoint;
		this.tokenEndpoint = tokenEndpoint;
	}

	public String getName() {
		return name;
	}

	public Integer getVersion() {
		return version;
	}

	public URI getAuthorizationEndpoint() {
		return authorizationEndpoint;
	}

	public URI getTokenEndpoint() {
		return tokenEndpoint;
	}
}
