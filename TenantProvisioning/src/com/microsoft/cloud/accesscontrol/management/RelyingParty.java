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


import java.util.List;

import com.microsoft.cloud.accesscontrol.management.Delegation;
import com.microsoft.cloud.accesscontrol.management.RelyingPartyAddress;
import com.microsoft.cloud.accesscontrol.management.RelyingPartyIdentityProvider;
import com.microsoft.cloud.accesscontrol.management.RelyingPartyKey;
import com.microsoft.cloud.accesscontrol.management.RelyingPartyRuleGroup;

/**
* Generated by the generator tool for the OData extension for the Restlet framework.<br>
*
* @see <a href="https://cloudninjajava.accesscontrol.windows.net/v2/mgmt/service/$metadata">Metadata of the target OData service</a>
*
*/
public class RelyingParty {

    private boolean asymmetricTokenEncryptionRequired;
    private String description;
    private String displayName;
    private long id;
    private String name;
    private boolean systemReserved;
    private int tokenLifetime;
    private String tokenType;
    private byte[] version;
    private List<Delegation> delegations;
    private List<RelyingPartyAddress> relyingPartyAddresses;
    private List<RelyingPartyIdentityProvider> relyingPartyIdentityProviders;
    private List<RelyingPartyKey> relyingPartyKeys;
    private List<RelyingPartyRuleGroup> relyingPartyRuleGroups;

    /**
     * Constructor without parameter.
     * 
     */
    public RelyingParty() {
        super();
    }

    /**
     * Constructor.
     * 
     * @param id
     *            The identifiant value of the entity.
     */
    public RelyingParty(long id) {
        this();
        this.id = id;
    }

   /**
    * Returns the value of the "asymmetricTokenEncryptionRequired" attribute.
    *
    * @return The value of the "asymmetricTokenEncryptionRequired" attribute.
    */
   public boolean getAsymmetricTokenEncryptionRequired() {
      return asymmetricTokenEncryptionRequired;
   }
   /**
    * Returns the value of the "description" attribute.
    *
    * @return The value of the "description" attribute.
    */
   public String getDescription() {
      return description;
   }
   /**
    * Returns the value of the "displayName" attribute.
    *
    * @return The value of the "displayName" attribute.
    */
   public String getDisplayName() {
      return displayName;
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
    * Returns the value of the "name" attribute.
    *
    * @return The value of the "name" attribute.
    */
   public String getName() {
      return name;
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
    * Returns the value of the "tokenLifetime" attribute.
    *
    * @return The value of the "tokenLifetime" attribute.
    */
   public int getTokenLifetime() {
      return tokenLifetime;
   }
   /**
    * Returns the value of the "tokenType" attribute.
    *
    * @return The value of the "tokenType" attribute.
    */
   public String getTokenType() {
      return tokenType;
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
    * Returns the value of the "delegations" attribute.
    *
    * @return The value of the "delegations" attribute.
    */
   public List<Delegation> getDelegations() {
      return delegations;
   }
   
   /**
    * Returns the value of the "relyingPartyAddresses" attribute.
    *
    * @return The value of the "relyingPartyAddresses" attribute.
    */
   public List<RelyingPartyAddress> getRelyingPartyAddresses() {
      return relyingPartyAddresses;
   }
   
   /**
    * Returns the value of the "relyingPartyIdentityProviders" attribute.
    *
    * @return The value of the "relyingPartyIdentityProviders" attribute.
    */
   public List<RelyingPartyIdentityProvider> getRelyingPartyIdentityProviders() {
      return relyingPartyIdentityProviders;
   }
   
   /**
    * Returns the value of the "relyingPartyKeys" attribute.
    *
    * @return The value of the "relyingPartyKeys" attribute.
    */
   public List<RelyingPartyKey> getRelyingPartyKeys() {
      return relyingPartyKeys;
   }
   
   /**
    * Returns the value of the "relyingPartyRuleGroups" attribute.
    *
    * @return The value of the "relyingPartyRuleGroups" attribute.
    */
   public List<RelyingPartyRuleGroup> getRelyingPartyRuleGroups() {
      return relyingPartyRuleGroups;
   }
   
   /**
    * Sets the value of the "asymmetricTokenEncryptionRequired" attribute.
    *
    * @param asymmetricTokenEncryptionRequired
    *     The value of the "asymmetricTokenEncryptionRequired" attribute.
    */
   public void setAsymmetricTokenEncryptionRequired(boolean asymmetricTokenEncryptionRequired) {
      this.asymmetricTokenEncryptionRequired = asymmetricTokenEncryptionRequired;
   }
   /**
    * Sets the value of the "description" attribute.
    *
    * @param description
    *     The value of the "description" attribute.
    */
   public void setDescription(String description) {
      this.description = description;
   }
   /**
    * Sets the value of the "displayName" attribute.
    *
    * @param displayName
    *     The value of the "displayName" attribute.
    */
   public void setDisplayName(String displayName) {
      this.displayName = displayName;
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
    * Sets the value of the "name" attribute.
    *
    * @param name
    *     The value of the "name" attribute.
    */
   public void setName(String name) {
      this.name = name;
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
    * Sets the value of the "tokenLifetime" attribute.
    *
    * @param tokenLifetime
    *     The value of the "tokenLifetime" attribute.
    */
   public void setTokenLifetime(int tokenLifetime) {
      this.tokenLifetime = tokenLifetime;
   }
   /**
    * Sets the value of the "tokenType" attribute.
    *
    * @param tokenType
    *     The value of the "tokenType" attribute.
    */
   public void setTokenType(String tokenType) {
      this.tokenType = tokenType;
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
    * Sets the value of the "delegations" attribute.
    *
    * @param delegations"
    *     The value of the "delegations" attribute.
    */
   public void setDelegations(List<Delegation> delegations) {
      this.delegations = delegations;
   }

   /**
    * Sets the value of the "relyingPartyAddresses" attribute.
    *
    * @param relyingPartyAddresses"
    *     The value of the "relyingPartyAddresses" attribute.
    */
   public void setRelyingPartyAddresses(List<RelyingPartyAddress> relyingPartyAddresses) {
      this.relyingPartyAddresses = relyingPartyAddresses;
   }

   /**
    * Sets the value of the "relyingPartyIdentityProviders" attribute.
    *
    * @param relyingPartyIdentityProviders"
    *     The value of the "relyingPartyIdentityProviders" attribute.
    */
   public void setRelyingPartyIdentityProviders(List<RelyingPartyIdentityProvider> relyingPartyIdentityProviders) {
      this.relyingPartyIdentityProviders = relyingPartyIdentityProviders;
   }

   /**
    * Sets the value of the "relyingPartyKeys" attribute.
    *
    * @param relyingPartyKeys"
    *     The value of the "relyingPartyKeys" attribute.
    */
   public void setRelyingPartyKeys(List<RelyingPartyKey> relyingPartyKeys) {
      this.relyingPartyKeys = relyingPartyKeys;
   }

   /**
    * Sets the value of the "relyingPartyRuleGroups" attribute.
    *
    * @param relyingPartyRuleGroups"
    *     The value of the "relyingPartyRuleGroups" attribute.
    */
   public void setRelyingPartyRuleGroups(List<RelyingPartyRuleGroup> relyingPartyRuleGroups) {
      this.relyingPartyRuleGroups = relyingPartyRuleGroups;
   }

}