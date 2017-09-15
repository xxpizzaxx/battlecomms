// **********************************************************************
//
// Copyright (c) 2003-2013 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.5.1
//
// <auto-generated>
//
// Generated from file `Murmur.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package Murmur;

/**
 * Callback interface for server authentication and registration. This allows you to support both authentication
 * and account updating.
 * You do not need to implement this if all you want is authentication, you only need this if other scripts
 * connected to the same server calls e.g. {@link Server.setTexture}.
 * Almost all of these methods support fall through, meaning murmur should continue the operation against its
 * own database.
 **/
public interface _ServerUpdatingAuthenticatorOperationsNC extends _ServerAuthenticatorOperationsNC
{
    /**
     * Register a new user.
     * @param info Information about user to register.
     * @return User id of new user, -1 for registration failure, or -2 to fall through.
     **/
    int registerUser(java.util.Map<UserInfo, java.lang.String> info);

    /**
     * Unregister a user.
     * @param id Userid to unregister.
     * @return 1 for successfull unregistration, 0 for unsuccessfull unregistration, -1 to fall through.
     **/
    int unregisterUser(int id);

    /**
     * Get a list of registered users matching filter.
     * @param filter Substring usernames must contain. If empty, return all registered users.
     * @return List of matching registered users.
     **/
    java.util.Map<java.lang.Integer, java.lang.String> getRegisteredUsers(String filter);

    /**
     * Set additional information for user registration.
     * @param id Userid of registered user.
     * @param info Information to set about user. This should be merged with existing information.
     * @return 1 for successfull update, 0 for unsuccessfull update, -1 to fall through.
     **/
    int setInfo(int id, java.util.Map<UserInfo, java.lang.String> info);

    /**
     * Set texture (now called avatar) of user registration.
     * @param id registrationId of registered user.
     * @param tex New texture.
     * @return 1 for successfull update, 0 for unsuccessfull update, -1 to fall through.
     **/
    int setTexture(int id, byte[] tex);
}
