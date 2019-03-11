# relying-party-java
This project is a sample WebAuthn Relying Party (shortened herein to Relying Party, or RP) web application written in Java to work with StrongKey's [FIDO2 Server, Community Edition](https://github.com/StrongKey/FIDO-Server) and sample [JavaScript WebAuthn client](https://github.com/StrongKey/WebAuthn).

The goals of this project are to demonstrate how to call StrongKey's FIDO2 Server APIs and how to properly manage users' FIDO2 keys. It is meant to serve as a reference implementation of a project that leverages StrongKey's FIDO2 Server to enable FIDO2 authentication. **If you are an application developer looking to FIDO2-enable an application, look at this code.**

The cybersecurity term, "Relying Party," originating from the jurisprudential term, was intended to represent legal entities that have a standing within a court of law where disputes related to digital signatures and non-repudiation could be argued; *a web application has no legal standing in court, but its owner does*. For additional information on WebAuthn Relying Parties, visit the technical specification:

- [Definition of WebAuthn Relying Party](https://www.w3.org/TR/webauthn/#webauthn-relying-party)
- [Complete WebAuthn Specification](https://www.w3.org/TR/webauthn)

For more information on the originating jargon and related terms:

- [Relying Party](https://ldapwiki.com/wiki/Relying%20Party)
- [Entity](https://ldapwiki.com/wiki/Entity)

Follow the instructions below to install this sample.

## Prerequisites

- This Relying Party web application example must have a means of connecting with a StrongKey FIDO2 Server. You can install a FIDO2 Server either on the same machine as your RP web application or a different one.
- You must have a Java web application server. These instructions assume you are using Payara (GlassFish).
- The instructions assume the default ports for all the applications installed; Payara runs HTTPS on port 8181 by default, so make sure all firewall rules allow that port to be accessible.
- **The sample commands below assume you are installing this RP web application on the same machine where StrongKey FIDO2 Server has been installed.** If you are installing on a separate machine, you may have to adjust the commands accordingly.

## Installation Instructions

1. Switch to (or login as) the _strongkey_ user. The default password for the _strongkey_ user is _ShaZam123_.

    ```sh
    su - strongkey
    ```

2. Create the following directories to configure the WebAuthn servlet home folder.

    ```sh
    mkdir -p /usr/local/strongkey/webauthntutorial/etc
    ```

3. Create a configuration file for the Relying Party web application to configure a FIDO2 Server.

    ```sh
    vi /usr/local/strongkey/webauthntutorial/etc/webauthntutorial.properties
    ```

4. Add the following configuration to the file and replace &lt;FQDN&gt; with the FIDO2 Server FQDN.

    ```sh
    webauthntutorial.cfg.property.apiuri=https://<FQDN>:8181/api
    ```

5. Download the Relying Party web application .war file [webauthntutorial.war](https://github.com/StrongKey/relying-party-java/blob/master/webauthntutorial.war).

    ```sh
    wget https://github.com/StrongKey/relying-party-java/raw/master/webauthntutorial.war
    ```

6. Add the .war file to Payara.

    ```sh
    asadmin deploy webauthntutorial.war
    ```

    **NOTE: The default administrative username/password as set by the install script for the FIDO2 Server is _admin/adminadmin_.**

7. Test that the servlet is running by executing the following Curl command.  You should get the API Web Application Definition Language (WADL) file back in response.

    ```sh
    curl -k https://localhost:8181/webauthntutorial/application.wadl
    ```

8. To test this installation of the FIDO2 server, check out the sample [StrongKey WebAuthn client](https://github.com/StrongKey/WebAuthn).

## Contributing to the Sample Relying Party Web Application 

If you would like to contribute to the sample Relying Party web application project, please read [CONTRIBUTING.md](https://github.com/StrongKey/relying-party-java/blob/master/CONTRIBUTING.md), then sign and return the [Contributor License Agreement (CLA)](https://cla-assistant.io/StrongKey/FIDO-Server).

## Licensing
This project is currently licensed under the [GNU Lesser General Public License v2.1](https://github.com/StrongKey/relying-party-java/blob/master/LICENSE).
