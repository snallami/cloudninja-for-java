###  Domain branch
  The purpose of this branch is to access the Dashboard application with the tenantID as a subdomain in the application URL.
  e.g. http://{tenantID}.cloudninja.com/TenantDashBoard

### Project Description

The ClounNinja for Java Project is a Windows Azure multi-tenant sample application demonstrating common multi-tenant features (provisioning, monitoring, metering, customization and third party identity providers). A multi-tenant application serves multiple clients while providing a virtual space for isolating each client (tenant). The isolation is achieved by preventing the tenants from seeing each other�s data.

### Key Features
CloudNinja sample will demonstrate how to design a multi-tenant application for managing tasks by leveraging windows azure platform and provide the following features:

1. Tenant Provisioning
  *       Register new tenants.
  *       Remove an existing tenant.
2. Monitoring
  *       Collect key performance indicators to report the performance and health of the application.
3. Customization
                *        Allow tenants to include branding information.
                *        Allow each tenant to manage its list of users.
4. Metering Charts
5. Support for third party identity providers including Windows Live ID, Google, Yahoo! and CustomSTS.
     
The sample will use a control database for registering tenants, members, metering and monitoring. Each tenant will be provided with a dedicated database at the time of provisioning.

### Deployment and Development notes
   Deployment and development instruction for master branch are summarized at [document](https://github.com/PersistentSys/cloudninja-for-java/blob/domain/Documents/Deployment%20&%20Development%20Environment%20document.docx)
