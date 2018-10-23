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

package it.dontesta.labs.liferay.crm.suitecrm;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.module.configuration.ConfigurationException;
import com.liferay.portal.kernel.module.configuration.ConfigurationProvider;

import it.dontesta.labs.liferay.crm.api.exception.LeadException;
import it.dontesta.labs.liferay.crm.api.model.Lead;
import it.dontesta.labs.liferay.crm.api.service.CRMBaseService;
import it.dontesta.labs.liferay.crm.suitecrm.configuration.SuiteCRMClientGroupConfiguration;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Antonio Musarra
 */
@Component(immediate = true, service = CRMBaseService.class)
public class SuiteCRMBaseService implements CRMBaseService {

	/**
	 * Create a new Lead on the CRM System
	 *
	 * @param lead The lead object that you want create
	 * @param companyId The Liferay companyId
	 * @return Return the object lead identifier
	 * @throws LeadException In case of error in the creation of the lead
	 */
	@Override
	public String createLead(Lead lead, long companyId) throws LeadException {
		throw new LeadException("Method not implement");
	}

	/**
	 * Create a new Lead on the CRM System
	 *
	 * @param salutation  The salutation string (es.: Mr., Ms., Mrs., Prof.)
	 * @param firstName   The lead first name
	 * @param lastName    The lead last name
	 * @param company     The lead company name
	 * @param title       The lead title
	 * @param leadSource  The lead source (es.: Web, Phone Inquiry, Other)
	 * @param phone       The lead phone
	 * @param mobile      The lead mobile phone number
	 * @param fax         The lead fax number
	 * @param email       The lead email
	 * @param webSite     The lead web site
	 * @param street      The lead street
	 * @param zip         The lead zip postal code
	 * @param city        The lead city
	 * @param state       The lead state
	 * @param country     The lead country
	 * @param description The lead description
	 * @param companyId The Liferay companyId
	 * @return Return the object lead identifier
	 * @throws LeadException In case of error in the creation of the lead
	 */
	@Override
	public String createLead(
			String salutation, String firstName, String lastName,
			String company, String title, String leadSource, String phone,
			String mobile, String fax, String email, String webSite,
			String street, String zip, String city, String state,
			String country, String description, long companyId)
		throws LeadException {

		throw new LeadException("Method not implement");
	}

	/**
	 * Delete the specified lead on the CRM System
	 *
	 * @param leadId    The lead identifier
	 * @param companyId The Liferay companyId
	 * @return Return the object lead identifier
	 */
	@Override
	public String deleteLead(String leadId, long companyId)
		throws LeadException {

		throw new LeadException("Method not implement");
	}

	/**
	 * Retrieve and return the lead object
	 *
	 * @param leadId The lead identifier
	 * @param companyId The Liferay companyId
	 * @return Return the lead object
	 * @throws LeadException In case of error in the get of the lead
	 */
	@Override
	public Lead getLead(String leadId, long companyId) throws LeadException {
		throw new LeadException("Method not implement");
	}

	/**
	 * Update the exits lead object
	 *
	 * @param lead The lead object that you want update
	 * @param companyId The Liferay companyId
	 * @return Return the object lead identifier
	 * @throws LeadException In case of error in the update of the lead
	 */
	@Override
	public String updateLead(Lead lead, long companyId) throws LeadException {
		throw new LeadException("Method not implement");
	}

	/**
	 * Update the exits lead object
	 *
	 * @param leadId      The object lead identifier.
	 * @param salutation  The salutation string (es.: Mr., Ms., Mrs., Prof.)
	 * @param firstName   The lead first name
	 * @param lastName    The lead last name
	 * @param company     The lead company name
	 * @param title       The lead title
	 * @param leadSource  The lead source (es.: Web, Phone Inquiry, Other)
	 * @param phone       The lead phone
	 * @param mobile      The lead mobile phone number
	 * @param fax         The lead fax number
	 * @param email       The lead email
	 * @param webSite     The lead web site
	 * @param street      The lead street
	 * @param zip         The lead zip postal code
	 * @param city        The lead city
	 * @param state       The lead state
	 * @param country     The lead country
	 * @param description The lead description
	 * @param companyId The Liferay companyId
	 * @return Return the object lead identifier
	 * @throws LeadException In case of error in the update of the lead
	 */
	@Override
	public String updateLead(
		String leadId, String salutation, String firstName, String lastName,
		String company, String title, String leadSource, String phone,
		String mobile, String fax, String email, String webSite, String street,
		String zip, String city, String state, String country,
		String description, long companyId) throws LeadException {

		throw new LeadException("Method not implement");
	}

	private SuiteCRMClientGroupConfiguration _getSuiteCRMClientGroupConfiguration(
		long companyId) throws ConfigurationException {

		return _configurationProvider.getCompanyConfiguration(
			SuiteCRMClientGroupConfiguration.class, companyId);
	}

	@Reference
	private ConfigurationProvider _configurationProvider;

	private Log _log = LogFactoryUtil.getLog(SuiteCRMBaseService.class);

}