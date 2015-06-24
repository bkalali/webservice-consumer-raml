<snippet>
<content>
## Consuming back-end SOAP APIs from front end RAML APIs
This example application is used to consume two SOAP APIs from CloudHub http://tshirt-service.cloudhub.io/?wsdl SOAP service
   
 
## Prerequisite
1. Anypoint Studio 5.1.2
2. JavaSE-1.7.0_71
3. Apache Maven 3.1.1
4. Mule Runtime 3.6.1 EE
    Note: Do not use 3.6.2 EE. As of writing this article, the ApiKit 1.6.1 still is not compatible with 3.6.2 EE
5. Mule Module APIKit 1.6.1



## Build, Install and run
1. You van either use "mvn clean install" and install the app in an standalone mule instance 3.6.1 EE     
2. Or, you can run it on  Anypoint Studio 5.1.2, using "Run as->Mule Application with Maven" 


## The RAML Rest APIs  
There are two RAML Rest APIs:

1. Create an order   
   POST: https://localhost:8082/api/order
2. Get a list of order inventory
   GET: https://localhost:8082/api/inventory

For more information using these APIs, please see APIKit Console (https://localhost:8082/console/) with details examples and schema.            

</content>
<tabTrigger>readme</tabTrigger>
</snippet> 