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

package microsoft.cloud.accesscontrol.management;


import microsoft.cloud.accesscontrol.management.Issuer;
import microsoft.cloud.accesscontrol.management.RuleGroup;

/**
* Generated by the generator tool for the OData extension for the Restlet framework.<br>
*
* @see <a href="https://cloudninjajava.accesscontrol.windows.net/v2/mgmt/service/$metadata">Metadata of the target OData service</a>
*
*/
public class Rule {

    private String description;
    private long id;
    private String inputClaimType;
    private String inputClaimValue;
    private long issuerId;
    private String outputClaimType;
    private String outputClaimValue;
    private long ruleGroupId;
    private boolean systemReserved;
    private byte[] version;
    private Issuer issuer;
    private RuleGroup ruleGroup;

    /**
     * Constructor without parameter.
     * 
     */
    public Rule() {
        super();
    }

    /**
     * Constructor.
     * 
     * @param id
     *            The identifiant value of the entity.
     */
    public Rule(long id) {
        this();
        this.id = id;
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
    * Returns the value of the "id" attribute.
    *
    * @return The value of the "id" attribute.
    */
   public long getId() {
      return id;
   }
   /**
    * Returns the value of the "inputClaimType" attribute.
    *
    * @return The value of the "inputClaimType" attribute.
    */
   public String getInputClaimType() {
      return inputClaimType;
   }
   /**
    * Returns the value of the "inputClaimValue" attribute.
    *
    * @return The value of the "inputClaimValue" attribute.
    */
   public String getInputClaimValue() {
      return inputClaimValue;
   }
   /**
    * Returns the value of the "issuerId" attribute.
    *
    * @return The value of the "issuerId" attribute.
    */
   public long getIssuerId() {
      return issuerId;
   }
   /**
    * Returns the value of the "outputClaimType" attribute.
    *
    * @return The value of the "outputClaimType" attribute.
    */
   public String getOutputClaimType() {
      return outputClaimType;
   }
   /**
    * Returns the value of the "outputClaimValue" attribute.
    *
    * @return The value of the "outputClaimValue" attribute.
    */
   public String getOutputClaimValue() {
      return outputClaimValue;
   }
   /**
    * Returns the value of the "ruleGroupId" attribute.
    *
    * @return The value of the "ruleGroupId" attribute.
    */
   public long getRuleGroupId() {
      return ruleGroupId;
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
    * Returns the value of the "issuer" attribute.
    *
    * @return The value of the "issuer" attribute.
    */
   public Issuer getIssuer() {
      return issuer;
   }
   
   /**
    * Returns the value of the "ruleGroup" attribute.
    *
    * @return The value of the "ruleGroup" attribute.
    */
   public RuleGroup getRuleGroup() {
      return ruleGroup;
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
    * Sets the value of the "id" attribute.
    *
    * @param id
    *     The value of the "id" attribute.
    */
   public void setId(long id) {
      this.id = id;
   }
   /**
    * Sets the value of the "inputClaimType" attribute.
    *
    * @param inputClaimType
    *     The value of the "inputClaimType" attribute.
    */
   public void setInputClaimType(String inputClaimType) {
      this.inputClaimType = inputClaimType;
   }
   /**
    * Sets the value of the "inputClaimValue" attribute.
    *
    * @param inputClaimValue
    *     The value of the "inputClaimValue" attribute.
    */
   public void setInputClaimValue(String inputClaimValue) {
      this.inputClaimValue = inputClaimValue;
   }
   /**
    * Sets the value of the "issuerId" attribute.
    *
    * @param issuerId
    *     The value of the "issuerId" attribute.
    */
   public void setIssuerId(long issuerId) {
      this.issuerId = issuerId;
   }
   /**
    * Sets the value of the "outputClaimType" attribute.
    *
    * @param outputClaimType
    *     The value of the "outputClaimType" attribute.
    */
   public void setOutputClaimType(String outputClaimType) {
      this.outputClaimType = outputClaimType;
   }
   /**
    * Sets the value of the "outputClaimValue" attribute.
    *
    * @param outputClaimValue
    *     The value of the "outputClaimValue" attribute.
    */
   public void setOutputClaimValue(String outputClaimValue) {
      this.outputClaimValue = outputClaimValue;
   }
   /**
    * Sets the value of the "ruleGroupId" attribute.
    *
    * @param ruleGroupId
    *     The value of the "ruleGroupId" attribute.
    */
   public void setRuleGroupId(long ruleGroupId) {
      this.ruleGroupId = ruleGroupId;
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
    * Sets the value of the "issuer" attribute.
    *
    * @param issuer"
    *     The value of the "issuer" attribute.
    */
   public void setIssuer(Issuer issuer) {
      this.issuer = issuer;
   }

   /**
    * Sets the value of the "ruleGroup" attribute.
    *
    * @param ruleGroup"
    *     The value of the "ruleGroup" attribute.
    */
   public void setRuleGroup(RuleGroup ruleGroup) {
      this.ruleGroup = ruleGroup;
   }

}