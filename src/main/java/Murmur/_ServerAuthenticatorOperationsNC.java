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
 * Callback interface for server authentication. You need to supply one of these for {@link Server.setAuthenticator}.
 * If an added callback ever throws an exception or goes away, it will be automatically removed.
 * Please note that unlike {@link ServerCallback} and {@link ServerContextCallback}, these methods are called
 * synchronously. If the response lags, the entire murmur server will lag.
 * Also note that, as the method calls are synchronous, making a call to {@link Server} or {@link Meta} will
 * deadlock the server.
 **/
public interface _ServerAuthenticatorOperationsNC
{
    /**
     * Called to authenticate a user. If you do not know the username in question, always return -2 from this
     * method to fall through to normal database authentication.
     * Note that if authentication succeeds, murmur will create a record of the user in it's database, reserving
     * the username and id so it cannot be used for normal database authentication.
     * The data in the certificate (name, email addresses etc), as well as the list of signing certificates,
     * should only be trusted if certstrong is true.
     * 
     * @param name Username to authenticate.
     * @param pw Password to authenticate with.
     * @param certificates List of der encoded certificates the user connected with.
     * @param certhash Hash of user certificate, as used by murmur internally when matching.
     * @param certstrong True if certificate was valid and signed by a trusted CA.
     * @param newname Set this to change the username from the supplied one.
     * @param groups List of groups on the root channel that the user will be added to for the duration of the connection.
     * @return UserID of authenticated user, -1 for authentication failures and -2 for unknown user (fallthrough).
     **/
    int authenticate(String name, String pw, byte[][] certificates, String certhash, boolean certstrong, Ice.StringHolder newname, GroupNameListHolder groups);

    /**
     * Fetch information about a user. This is used to retrieve information like email address, keyhash etc. If you
     * want murmur to take care of this information itself, simply return false to fall through.
     * @param id User id.
     * @param info Information about user. This needs to include at least "name".
     * @return true if information is present, false to fall through.
     **/
    boolean getInfo(int id, UserInfoMapHolder info);

    /**
     * Map a name to a user id.
     * @param name Username to map.
     * @return User id or -2 for unknown name.
     **/
    int nameToId(String name);

    /**
     * Map a user id to a username.
     * @param id User id to map.
     * @return Name of user or empty string for unknown id.
     **/
    String idToName(int id);

    /**
     * Map a user to a custom Texture.
     * @param id User id to map.
     * @return User texture or an empty texture for unknwon users or users without textures.
     **/
    byte[] idToTexture(int id);
}
