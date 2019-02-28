# relying-party-java
This project is a sample WebAuthn Relying Party (shortened herein to Relying Party, or RP) written in Java to work with StrongKey's [FIDO Server, Community Edition](https://github.com/StrongKey/FIDO-Server) and sample [WebAuthn JavaScript code](https://github.com/StrongKey/WebAuthn).

The goals of this project are to demonstrate how to call StrongKey's FIDO Server APIs and how to properly manage users' FIDO keys. It is meant to serve as a reference implementation of a project that leverages StrongKey's FIDO Server to enable FIDO authentication. **If you are an application developer looking to FIDO enable their application, look at this code.**

For additional information on WebAuthn Relying Parties, visit the technical specification:
- [Definition of WebAuthn Relying Party](https://www.w3.org/TR/webauthn/#webauthn-relying-party)
- [Complete WebAuthn Specification](https://www.w3.org/TR/webauthn)

Follow the instructions below to install this sample.

## Prerequisites

- This Relying Party example must have a means of connecting with a StrongKey FIDO Server. You can install a FIDO Server either on the same server as your RP or a different server.
- You must have a Java Application Server. These instructions assume you are using Payara (GlassFish).
- The instructions assume the default ports for all the applications installed; Payara runs HTTPS on port 8181 by default, so make sure all firewall rules allow that port to be accessible.
- **The sample commands below assume you are installing this RP on the same server where StrongKey FIDO Server has been installed.** If you are installing on a separate server, you may have to adjust the commands accordingly.

## Installation Instructions

1. Switch to (or login as) the _strongkey_ user. The default password for the _strongkey_ user is _ShaZam123_.

    ```sh
    su strongkey
    ```

2. Change directory to _/usr/local/strongkey_ (the home directory for the _strongkey_ user).

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

5. Add the following configuration to the file and replace &lt;FQDN&gt; with the FIDO server FQDN.

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

8. Test that the servlet is running by executing the following Curl command and confirming that you get an HTTP 405 error.

    ```sh
    curl -k https://localhost:8181/webauthntutorial/preregister
    ```

9. For further testing, check out the sample [StrongKey WebAuthn client](https://github.com/StrongKey/WebAuthn).

## Contributing to the Sample Relying Party

If you would like to contribute to the sample Relying Party project, please read [CONTRIBUTING.md](https://github.com/StrongKey/relying-party-java/blob/master/CONTRIBUTING.md), then sign and return the [Contributor License Agreement (CLA)](https://cla-assistant.io/StrongKey/FIDO-Server).

## Licensing
This project is currently licensed under the [GNU Lesser General Public License v2.1](https://github.com/StrongKey/relying-party-java/blob/master/LICENSE).
