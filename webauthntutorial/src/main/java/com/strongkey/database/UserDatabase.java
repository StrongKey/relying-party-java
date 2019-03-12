/**
 * Copyright StrongAuth, Inc. All Rights Reserved.
 *
 * Use of this source code is governed by the Gnu Lesser General Public License 2.3.
 * The license can be found at https://github.com/StrongKey/relying-party-java/LICENSE
 */

package com.strongkey.database;

import java.util.HashSet;
import java.util.Set;
import javax.ejb.Singleton;

// A mock database for "user accounts". It is expected that RPs will have their
// own concept of what a "user" means in their application and will need to
// create similar functionality according to their use cases.
@Singleton
public class UserDatabase {
    private final Set<String> users = new HashSet();
    
    // Checks if a user exists in the "database"
    public synchronized boolean doesUserExist(String username){
        return users.contains(username);
    }
    
    // Adds a user to the "database"
    public synchronized void addUser(String username){
        users.add(username);
    }
    
    // Removes a user from the "database"
    public synchronized void deleteUser(String username) {
        users.remove(username);
    }
}
