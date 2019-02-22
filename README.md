# relying-party-java
Sample Java code for FIDO relying party

To run this application on GlassFish:
asadmin deploy webauthntutorial.war

This .war file can either come from the precompiled .war file in this project or compiled from source.


Additional configuration:
If the FIDO server being tested against is not Strongkey's publicly availible server, a webauthntutorial.properties file must be created in the directory path /usr/local/strongkey/webauthntutorial/etc/ with the following values:
webauthntutorial.cfg.property.apiuri=<Your StrongKey FIDO Server URL>/api
webauthntutorial.cfg.property.did=1
webauthntutorial.cfg.property.accesskey=<Your configured access key>
webauthntutorial.cfg.property.secretkey=<Your configured secret key>

If the FIDO server being tested against uses a self signed certificate (or a certificate not trusted by your application server), the FIDO server's certificate must be added to your application's truststore. In GlassFish this can be done via the command:
keytool -importcert -noprompt -keystore <GlassFish Install location>/domains/domain1/config/cacerts.jks -storepass <Keystore Password> -alias <FIDO server's hostname> -file <FIDO server's certificate>
