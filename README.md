# relying-party-java
Sample Java code for FIDO relying party

To run this application on GlassFish:
```
asadmin deploy webauthntutorial.war
```

This .war file can either come from the precompiled .war file in this project or compiled from source.


Additional configuration:
If the FIDO server to be tested is not Strongkey's publicly availible server, a webauthntutorial.properties file must be created in the directory path /usr/local/strongkey/webauthntutorial/etc/ with the following values:
```
webauthntutorial.cfg.property.apiuri=<Your StrongKey FIDO Server URL>/api
webauthntutorial.cfg.property.did=1
webauthntutorial.cfg.property.accesskey=<Your configured access key>
webauthntutorial.cfg.property.secretkey=<Your configured secret key>
```


If the FIDO server to be tested uses a self-signed certificate (or a certificate not trusted by your application server), the FIDO server's certificate must be added to your application's TrustStore. In GlassFish this can be done via the command:
```
keytool -importcert -noprompt -keystore <GlassFish Install location>/domains/domain1/config/cacerts.jks -storepass <Keystore Password> -alias <FIDO server's hostname> -file <FIDO server's certificate>
```

## API docs
[Open API documentation for FIDO2/WebAuthn](https://github.com/StrongKey/FIDO-Server/blob/master/docs/fido-openapi.yaml)

## Contributing
If you would like to contribute to the FIDO2 Community Edition Server project, please sign and return the [Contributor License Agreement (CLA)](https://cla-assistant.io/StrongKey/FIDO-Server).

## Other Samples
Sample WebAuthn code is also provided with a brief explanation:

* [WebAuthn](https://github.com/StrongKey/WebAuthn) - JavaScript sample

## Licensing
This project is currently licensed under the [GNU Lesser General Public License v2.1](https://github.com/StrongKey/FIDO-Server/blob/master/LICENSE).


