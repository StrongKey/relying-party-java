# relying-party-java
This project is a sample Relying Party (RP) Java Servlet written to work with the [StrongKey FIDO Server](https://github.com/StrongKey/FIDO-Server).


#### Installation Instructions ####

## Prerequisites

- This Relying Party example must have a means of connecting with a [StrongKey FIDO Server](https://github.com/StrongKey/FIDO-Server). You can install a FIDO Server either on the same server as your RP or a different server.
- You must have a Java Application Server. These instructions assume you are using Payara (GlassFish).
- The instructions assume the default ports for all the applications installed; Payara runs https on port 8181 by default, so make sure all firewall rules allow that port to be accessible.
- **The sample commands below assume you are installing this RP on the same server where [StrongKey FIDO Server](https://github.com/StrongKey/FIDO-Server) was perviously installed.** If you are installing on a separate server, you may have to adjust the commands accordingly.

1. Switch to (or login as) the _strongkey_ user.

```sh
su strongkey
```

2. Change Directory to _/usr/local/strongkey_ (the home directory for the _strongkey_ user).

```sh
cd /usr/local/strongkey
```

3. Create the following directories to configure the WebAuthn servlet home folder.

```sh
mkdir -p /usr/local/strongkey/webauthntutorial/etc
```

4. Create a configuration file for the Relying Party application to configure a FIDO server.

```sh
vi /usr/local/strongkey/webauthntutorial/etc/webauthntutorial.properties
```

5. Add the following configuration to the file and replace <FQDN> with the FIDO server FQDN.

```sh
webauthntutorial.cfg.property.apiuri=https://<FQDN>:8181/api
```

6. Download the Relying Party .war file [webauthntutorial.war](https://github.com/StrongKey/relying-party-java/blob/master/webauthntutorial.war).

```sh
wget https://github.com/StrongKey/relying-party-java/raw/master/webauthntutorial.war
```

7. Add the .war file to Payara.

```sh
asadmin deploy webauthntutorial.war
```

**NOTE: The default administrative username/password as set by the install script for the FIDO Server is _admin/adminadmin_.**

8. Test that the servlet is running by executing the following curl command and confirming that you get a HTTP 405 error.

```sh
curl -k https://localhost:8181/webauthntutorial/preregister
```

9. For further testing, check out the sample [StrongKey WebAuthn client](https://github.com/StrongKey/WebAuthn).


If you would like to contribute to the [FIDO2 Relying Party](https://github.com/StrongKey/FIDO-Server) project, please read [CONTRIBUTING.md](https://github.com/StrongKey/relying-party-java/blob/master/CONTRIBUTING.md), then sign and return the [Contributor License Agreement (CLA)](https://cla-assistant.io/StrongKey/FIDO-Server).

## Other Samples
* [WebAuthn](https://github.com/StrongKey/WebAuthn)&emdash;JavaScript sample

## Licensing
This project is currently licensed under the [GNU Lesser General Public License v2.1](https://github.com/StrongKey/relying-party-java/blob/master/LICENSE).


