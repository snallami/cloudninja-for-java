/**
 * Copyright 2005-2010 Noelios Technologies.
 * 
 * The contents of this file are subject to the terms of one of the following
 * open source licenses: LGPL 3.0 or LGPL 2.1 or CDDL 1.0 or EPL 1.0 (the
 * "Licenses"). You can select the license that you prefer but you may not use
 * this file except in compliance with one of these Licenses.
 * 
 * You can obtain a copy of the LGPL 3.0 license at
 * http://www.opensource.org/licenses/lgpl-3.0.html
 * 
 * You can obtain a copy of the LGPL 2.1 license at
 * http://www.opensource.org/licenses/lgpl-2.1.php
 * 
 * You can obtain a copy of the CDDL 1.0 license at
 * http://www.opensource.org/licenses/cddl1.php
 * 
 * You can obtain a copy of the EPL 1.0 license at
 * http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * See the Licenses for the specific language governing permissions and
 * limitations under the Licenses.
 * 
 * Alternatively, you can obtain a royalty free commercial license with less
 * limitations, transferable or non-transferable, directly at
 * http://www.noelios.com/products/restlet-engine
 * 
 * Restlet is a registered trademark of Noelios Technologies.
 */

package com.microsoft.cloud.accesscontrol.management;


import com.microsoft.cloud.accesscontrol.management.IdentityProvider;

/**
* Generated by the generator tool for the OData extension for the Restlet framework.<br>
*
* @see <a href="https://cloudninjajava.accesscontrol.windows.net/v2/mgmt/service/$metadata">Metadata of the target OData service</a>
*
*/
public class IdentityProviderAddress {

    private String address;
    private String endpointType;
    private long id;
    private long identityProviderId;
    private boolean systemReserved;
    private byte[] version;
    private IdentityProvider identityProvider;

    /**
     * Constructor without parameter.
     * 
     */
    public IdentityProviderAddress() {
        super();
    }

    /**
     * Constructor.
     * 
     * @param id
     *            The identifiant value of the entity.
     */
    public IdentityProviderAddress(long id) {
        this();
        this.id = id;
    }

   /**
    * Returns the value of the "address" attribute.
    *
    * @return The value of the "address" attribute.
    */
   public String getAddress() {
      return address;
   }
   /**
    * Returns the value of the "endpointType" attribute.
    *
    * @return The value of the "endpointType" attribute.
    */
   public String getEndpointType() {
      return endpointType;
   }
   /**
    * Returns the value of the "id" attribute.
    *
    * @return The value of the "id" attribute.
    */
   public long getId() {
      return id;
   }
   /**
    * Returns the value of the "identityProviderId" attribute.
    *
    * @return The value of the "identityProviderId" attribute.
    */
   public long getIdentityProviderId() {
      return identityProviderId;
   }
   /**
    * Returns the value of the "systemReserved" attribute.
    *
    * @return The value of the "systemReserved" attribute.
    */
   public boolean getSystemReserved() {
      return systemReserved;
   }
   /**
    * Returns the value of the "version" attribute.
    *
    * @return The value of the "version" attribute.
    */
   public byte[] getVersion() {
      return version;
   }
   /**
    * Returns the value of the "identityProvider" attribute.
    *
    * @return The value of the "identityProvider" attribute.
    */
   public IdentityProvider getIdentityProvider() {
      return identityProvider;
   }
   
   /**
    * Sets the value of the "address" attribute.
    *
    * @param address
    *     The value of the "address" attribute.
    */
   public void setAddress(String address) {
      this.address = address;
   }
   /**
    * Sets the value of the "endpointType" attribute.
    *
    * @param endpointType
    *     The value of the "endpointType" attribute.
    */
   public void setEndpointType(String endpointType) {
      this.endpointType = endpointType;
   }
   /**
    * Sets the value of the "id" attribute.
    *
    * @param id
    *     The value of the "id" attribute.
    */
   public void setId(long id) {
      this.id = id;
   }
   /**
    * Sets the value of the "identityProviderId" attribute.
    *
    * @param identityProviderId
    *     The value of the "identityProviderId" attribute.
    */
   public void setIdentityProviderId(long identityProviderId) {
      this.identityProviderId = identityProviderId;
   }
   /**
    * Sets the value of the "systemReserved" attribute.
    *
    * @param systemReserved
    *     The value of the "systemReserved" attribute.
    */
   public void setSystemReserved(boolean systemReserved) {
      this.systemReserved = systemReserved;
   }
   /**
    * Sets the value of the "version" attribute.
    *
    * @param version
    *     The value of the "version" attribute.
    */
   public void setVersion(byte[] version) {
      this.version = version;
   }
   /**
    * Sets the value of the "identityProvider" attribute.
    *
    * @param identityProvider"
    *     The value of the "identityProvider" attribute.
    */
   public void setIdentityProvider(IdentityProvider identityProvider) {
      this.identityProvider = identityProvider;
   }

}