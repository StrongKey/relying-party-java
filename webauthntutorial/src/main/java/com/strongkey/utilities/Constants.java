package com.strongkey.utilities;

/*
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License, as published by the Free Software Foundation and
 * available at http://www.fsf.org/licensing/licenses/lgpl.html,
 * version 2.1 or above.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * Copyright (c) 2001-2019 StrongAuth, Inc.
 *
 * $Date: 
 * $Revision:
 * $Author: mishimoto $
 * $URL: 
 *
 * *********************************************
 *                    888
 *                    888
 *                    888
 *  88888b.   .d88b.  888888  .d88b.  .d8888b
 *  888 "88b d88""88b 888    d8P  Y8b 88K
 *  888  888 888  888 888    88888888 "Y8888b.
 *  888  888 Y88..88P Y88b.  Y8b.          X88
 *  888  888  "Y88P"   "Y888  "Y8888   88888P'
 *
 * *********************************************
 * 
 *
 *
 */

public class Constants {
    // Webauthn tutorial (Relying Party (RP)) Path names
    public static final String RP_PREGISTER_PATH = "preregister";
    public static final String RP_PREGISTER_EXISTING_PATH = "preregisterExisting";
    public static final String RP_REGISTER_PATH = "register";
    public static final String RP_REGISTER_EXISTING_PATH = "registerExisting";
    public static final String RP_PREAUTHENTICATE_PATH = "preauthenticate";
    public static final String RP_AUTHENTICATE_PATH = "authenticate";
    public static final String RP_ISLOGGEDIN_PATH = "isLoggedIn";
    public static final String RP_LOGOUT_PATH = "logout";
    public static final String RP_PATH_DELETEACCOUNT = "deleteAccount";
    public static final String RP_PATH_GETKEYS = "getkeysinfo";
    public static final String RP_PATH_REMOVEKEYS = "removeKeys";
    
    
    // SKFS web service names
    public static final String SKFS_PATH_DOMAINS = "domains";
    public static final String SKFS_PATH_FIDOKEYS = "fidokeys";
    public static final String SKFS_PATH_CHALLENGE = "challenge";
    public static final String SKFS_PATH_REGISTRATION = "registration";
    public static final String SKFS_PATH_AUTHENTICATION = "authentication";
    
    // Session Information
    public static final String SESSION_USERNAME = "username";
    public static final String SESSION_ISAUTHENTICATED = "isAuthenticated";
    
    // Frontend <-> Webauthn tutorial (Relaying Party (RP)) JSON mappings
    public static final String RP_JSON_KEY_USERNAME = "username";
    public static final String RP_JSON_KEY_DISPLAYNAME = "displayName";
    public static final String RP_JSON_KEY_KEYIDS = "keyIds";
    public static final String RP_JSON_KEY_RESPONSE = "Response";
    public static final String RP_JSON_KEY_MESSAGE = "Message";
    public static final String RP_JSON_KEY_ERROR = "Error";
    
    public static final String RP_JSON_VALUE_TRUE_STRING = "True";
    public static final String RP_JSON_VALUE_FALSE_STRING = "False";
   
    //Webauthn tutorial <-> SKFS Query Parameters
    public static final String SKFS_QUERY_KEY_USERNAME = "username";
    
    // Webauthn tutorial <-> SKFS JSON mappings
    public static final String SKFS_JSON_KEY_PROTOCOL = "protocol";
    
    public static final String SKFS_JSON_KEY_USERNAME = "username";
    public static final String SKFS_JSON_KEY_DISPLAYNAME = "displayname";
    public static final String SKFS_JSON_KEY_RESPONSE = "response";
    
    public static final String SKFS_JSON_KEY_OPTIONS = "options";
    public static final String SKFS_JSON_KEY_OPTIONS_AUTHSELECTION = "authenticatorSelection";
    public static final String SKFS_JSON_KEY_OPTIONS_ATTACHMENT = "authenticatorAttachment";
    public static final String SKFS_JSON_KEY_OPTIONS_RESIDENTKEY = "requireResidentKey";
    public static final String SKFS_JSON_KEY_OPTIONS_USERVERIFICATION = "userVerification";
    public static final String SKFS_JSON_KEY_OPTIONS_ATTESTATION = "attestation";
    
    public static final String SKFS_JSON_KEY_METADATA = "metadata";
    public static final String SKFS_JSON_KEY_VERSION = "version";
    public static final String SKFS_JSON_KEY_CREATELOC = "create_location";
    public static final String SKFS_JSON_KEY_USEDLOC = "last_used_location";
    public static final String SKFS_JSON_KEY_ORIGIN = "origin";
    
    public static final String SKFS_JSON_KEY_REQUEST = "request";
    public static final String SKFS_JSON_KEY_KEYID = "randomid";
    
    public static final String SKFS_RESPONSE_JSON_KEY_RESPONSE = "Response";
    public static final String SKFS_RESPONSE_JSON_KEY_CHALLENGE = "Challenge";
    public static final String SKFS_RESPONSE_JSON_KEY_MESSAGE = "Message";
    public static final String SKFS_RESPONSE_JSON_KEY_ERROR = "Error";
    public static final String SKFS_RESPONSE_JSON_KEY_KEYS = "keys";
    
    //  Miscellaneous
    public static final String CREATE_LOCATION = "N/A";
    public static final String LAST_USED_LOCATION = "N/A";
    public static final int SESSION_TIMEOUT_VALUE = 600;
    public static final int SKFS_TIMEOUT_VALUE = 30000;
}
