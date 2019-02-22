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

package com.strongkey.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.MissingResourceException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.logging.Level;

public class Configurations {
    
    private static final ResourceBundle DEFAULTCONFIGS = ResourceBundle.getBundle("resources.webauthntutorial-configuration");
    private static ResourceBundle customConfigs = null;
    private static final String CLASSNAME = Configurations.class.getName();
    
    // Load customizedConfigs from the filesystem if they exist
    static{
        try {
            logConfigurations(DEFAULTCONFIGS);
            File customConfigFile = new File(DEFAULTCONFIGS.getString("webauthntutorial.cfg.property.configlocation"));
            if(customConfigFile.exists() && customConfigFile.isFile()){
                customConfigs = new PropertyResourceBundle(new FileInputStream(customConfigFile));
                logConfigurations(customConfigs);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static String getConfigurationProperty(String configName){
        try{
            if (customConfigs != null && customConfigs.containsKey(configName)) {
                return customConfigs.getString(configName);
            }
            return DEFAULTCONFIGS.getString(configName);
        }
        catch(MissingResourceException ex){
            return null;
        }
    }
    
    // Debug function
    private static void logConfigurations(ResourceBundle configs){
        if(configs == null){
            return;
        }
        
        StringBuilder configString = new StringBuilder();
        for(String key: configs.keySet()){
            if(!key.contains("secretkey")){
                configString.append("\n\t")
                        .append(key)
                        .append(": ")
                        .append(configs.getString(key));
            }
        }
        
        WebauthnTutorialLogger.logp(Level.FINE, CLASSNAME, "logConfigurations", "WEBAUTHN-MSG-1000", configString.toString());
    }
}
