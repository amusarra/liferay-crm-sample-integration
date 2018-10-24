/*
 * Copyright (c) 2018 Antonio Musarra's Blog - https://www.dontesta.it
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package it.dontesta.labs.liferay.crm.suitecrm.configuration;

import aQute.bnd.annotation.metatype.Meta;

import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;

/**
 * @author Antonio Musarra
 */
@ExtendedObjectClassDefinition(
	category = "crm-services", scope = ExtendedObjectClassDefinition.Scope.COMPANY
)
@Meta.OCD(
	id = "it.dontesta.labs.liferay.crm.suitecrm.configuration.SuiteCRMClientGroupConfiguration",
	localization = "content/Language",
	name = "suitecrm-client-configuration-name"
)
public interface SuiteCRMClientGroupConfiguration {

	@Meta.AD(
		deflt = "https://suitecrm.example.org/Api/access_token",
		name = "access-token-url", description = "access-token-url-description",
		required = false
	)
	public String accessTokenURL();

	@Meta.AD(
		deflt = "", name = "client-id", description = "client-id-description",
		required = false
	)
	public String clientId();

	@Meta.AD(
		deflt = "", name = "client-secret",
		description = "client-secret-description", required = false,
		type = Meta.Type.Password
	)
	public String clientSecret();

	@Meta.AD(
		deflt = "", name = "scopes", description = "scopes-description",
		required = false, type = Meta.Type.Password
	)
	public String scopes();

	@Meta.AD(
		deflt = "", name = "username", description = "username-description",
		required = false
	)
	public String username();

	@Meta.AD(
		deflt = "", name = "password", description = "password-description",
		required = false, type = Meta.Type.Password
	)
	public String password();

	@Meta.AD(
		deflt = "https://suitecrm.example.org/",
		name = "suitecrm-root-instance-url",
		description = "suitecrm-root-instance-url-description", required = false
	)
	public String suitecrmRootInstanceURL();

}