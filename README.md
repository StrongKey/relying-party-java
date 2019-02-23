# relying-party-java
This project is a sample Relying Party Java Servlet written to work with the [StrongKey FIDO Server](https://github.com/StrongKey/FIDO-Server).


#### Installation Instructions ####

## Prerequisites

- This Relying Party (RP) example has to have a [StrongKey FIDO Server](https://github.com/StrongKey/FIDO-Server) to talk to.  You can install a FIDO Server either on the same server as your RP or a different server.
- You must have a Java Application Server. These instructions assume you are using Payara (GlassFish).
- **The sample commands below assume you are installing this RP on the same server as you have previously installed the [StrongKey FIDO Server](https://github.com/StrongKey/FIDO-Server).** If you are installing on a separate server, you may have to adjust the commands accordingly.

1. Login as the strongkey user

```sh
su strongkey
```

2. cd to _/usr/local/strongkey_ (the home directory for the _strongkey_ user).

```sh
cd /usr/local/strongkey
```

3.  Download the Relying Party war file [webauthntutorial.war](https://github.com/StrongKey/relying-party-java/blob/master/webauthntutorial.war).

```sh
wget https://github.com/StrongKey/relying-party-java/raw/master/webauthntutorial.war
```

4. Add the war file to Payara 

```sh
asadmin deploy webauthntutorial.war
```

(Note that the default admin username/password as set by the install script for the FIDO Server is admin/adminadmin.)

5. Test that the servlet is running by running the following curl command and confirming that you get a HTTP 405 error.

```sh
curl -k https://localhost:8181/webauthntutorial/preregister
```

6. For further testing, check out the sample [StrongKey WebAuthn client](https://github.com/StrongKey/WebAuthn).


If you would like to contribute to the [FIDO2 Relying Party](https://github.com/StrongKey/FIDO-Server) project, please read [CONTRIBUTING.md](https://github.com/StrongKey/relying-party-java/blob/master/CONTRIBUTING.md), then sign and return the [Contributor License Agreement (CLA)](https://cla-assistant.io/StrongKey/FIDO-Server).

## Other Samples
* [WebAuthn](https://github.com/StrongKey/WebAuthn) - JavaScript sample

## Licensing
This project is currently licensed under the [GNU Lesser General Public License v2.1](https://github.com/StrongKey/relying-party-java/blob/master/LICENSE).


