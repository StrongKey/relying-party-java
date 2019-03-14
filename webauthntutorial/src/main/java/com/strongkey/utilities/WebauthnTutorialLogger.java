/**
 * Copyright StrongAuth, Inc. All Rights Reserved.
 *
 * Use of this source code is governed by the Gnu Lesser General Public License 2.3.
 * The license can be found at https://github.com/StrongKey/relying-party-java/LICENSE
 */

package com.strongkey.utilities;

import java.util.Locale;
import java.util.ResourceBundle;

// Provides basic logging functionality
public class WebauthnTutorialLogger {
    // Logger for the application
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger("WEBAUTHNTUTORIAL", "resources.webauthntutorial-messages");
    
    // Load messages for Exceptions
    private static final ResourceBundle MESSAGEBUNDLE = ResourceBundle.getBundle("resources.webauthntutorial-messages");
    
    public static final String getMessageProperty(String key) {
        return MESSAGEBUNDLE.getString(key);
    }
    
    public static void logp(java.util.logging.Level level,
            String sourceClass, String sourceMethod, String key, Object param) {
        LOGGER.logp(level, sourceClass, sourceMethod, key, param);
    }
}
