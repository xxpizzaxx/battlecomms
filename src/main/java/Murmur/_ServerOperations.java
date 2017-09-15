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
 * Per-server interface. This includes all methods for configuring and altering
 * the state of a single virtual server. You can retrieve a pointer to this interface
 * from one of the methods in {@link Meta}.
 **/
public interface _ServerOperations
{
    /**
     * Shows if the server currently running (accepting users).
     * 
     * @param __cb The callback object for the operation.
     * @param __current The Current object for the invocation.
     **/
    void isRunning_async(AMD_Server_isRunning __cb, Ice.Current __current)
        throws InvalidSecretException;

    /**
     * Start server.
     * @param __cb The callback object for the operation.
     * @param __current The Current object for the invocation.
     **/
    void start_async(AMD_Server_start __cb, Ice.Current __current)
        throws InvalidSecretException,
               ServerBootedException,
               ServerFailureException;

    /**
     * Stop server.
     * Note: Server will be restarted on Murmur restart unless explicitly disabled
     * with setConf("boot", false)
     * @param __cb The callback object for the operation.
     * @param __current The Current object for the invocation.
     **/
    void stop_async(AMD_Server_stop __cb, Ice.Current __current)
        throws InvalidSecretException,
               ServerBootedException;

    /**
     * Delete server and all it's configuration.
     * @param __cb The callback object for the operation.
     * @param __current The Current object for the invocation.
     **/
    void delete_async(AMD_Server_delete __cb, Ice.Current __current)
        throws InvalidSecretException,
               ServerBootedException;

    /**
     * Fetch the server id.
     * 
     * @param __cb The callback object for the operation.
     * @param __current The Current object for the invocation.
     **/
    void id_async(AMD_Server_id __cb, Ice.Current __current)
        throws InvalidSecretException;

    /**
     * Add a callback. The callback will receive notifications about changes to users and channels.
     * 
     * @param __cb The callback object for the operation.
     * @param cb Callback interface which will receive notifications.
     * @param __current The Current object for the invocation.
     **/
    void addCallback_async(AMD_Server_addCallback __cb, ServerCallbackPrx cb, Ice.Current __current)
        throws InvalidCallbackException,
               InvalidSecretException,
               ServerBootedException;

    /**
     * Remove a callback.
     * 
     * @param __cb The callback object for the operation.
     * @param cb Callback interface to be removed.
     * @param __current The Current object for the invocation.
     **/
    void removeCallback_async(AMD_Server_removeCallback __cb, ServerCallbackPrx cb, Ice.Current __current)
        throws InvalidCallbackException,
               InvalidSecretException,
               ServerBootedException;

    /**
     * Set external authenticator. If set, all authentications from clients are forwarded to this
     * proxy.
     * 
     * @param __cb The callback object for the operation.
     * @param auth Authenticator object to perform subsequent authentications.
     * @param __current The Current object for the invocation.
     **/
    void setAuthenticator_async(AMD_Server_setAuthenticator __cb, ServerAuthenticatorPrx auth, Ice.Current __current)
        throws InvalidCallbackException,
               InvalidSecretException,
               ServerBootedException;

    /**
     * Retrieve configuration item.
     * @param __cb The callback object for the operation.
     * @param key Configuration key.
     * @param __current The Current object for the invocation.
     **/
    void getConf_async(AMD_Server_getConf __cb, String key, Ice.Current __current)
        throws InvalidSecretException;

    /**
     * Retrieve all configuration items.
     * @param __cb The callback object for the operation.
     * @param __current The Current object for the invocation.
     **/
    void getAllConf_async(AMD_Server_getAllConf __cb, Ice.Current __current)
        throws InvalidSecretException;

    /**
     * Set a configuration item.
     * @param __cb The callback object for the operation.
     * @param key Configuration key.
     * @param __current The Current object for the invocation.
     **/
    void setConf_async(AMD_Server_setConf __cb, String key, String value, Ice.Current __current)
        throws InvalidSecretException;

    /**
     * Set superuser password. This is just a convenience for using {@link updateRegistration} on user id 0.
     * @param __cb The callback object for the operation.
     * @param pw Password.
     * @param __current The Current object for the invocation.
     **/
    void setSuperuserPassword_async(AMD_Server_setSuperuserPassword __cb, String pw, Ice.Current __current)
        throws InvalidSecretException;

    /**
     * Fetch log entries.
     * @param __cb The callback object for the operation.
     * @param first Lowest numbered entry to fetch. 0 is the most recent item.
     * @param __current The Current object for the invocation.
     **/
    void getLog_async(AMD_Server_getLog __cb, int first, int last, Ice.Current __current)
        throws InvalidSecretException;

    /**
     * Fetch length of log
     * @param __cb The callback object for the operation.
     * @param __current The Current object for the invocation.
     **/
    void getLogLen_async(AMD_Server_getLogLen __cb, Ice.Current __current)
        throws InvalidSecretException;

    /**
     * Fetch all users. This returns all currently connected users on the server.
     * @param __cb The callback object for the operation.
     * @param __current The Current object for the invocation.
     **/
    void getUsers_async(AMD_Server_getUsers __cb, Ice.Current __current)
        throws InvalidSecretException,
               ServerBootedException;

    /**
     * Fetch all channels. This returns all defined channels on the server. The root channel is always channel 0.
     * @param __cb The callback object for the operation.
     * @param __current The Current object for the invocation.
     **/
    void getChannels_async(AMD_Server_getChannels __cb, Ice.Current __current)
        throws InvalidSecretException,
               ServerBootedException;

    /**
     * Fetch certificate of user. This returns the complete certificate chain of a user.
     * @param __cb The callback object for the operation.
     * @param session Connection ID of user. See {@link User.session}.
     * @param __current The Current object for the invocation.
     **/
    void getCertificateList_async(AMD_Server_getCertificateList __cb, int session, Ice.Current __current)
        throws InvalidSecretException,
               InvalidSessionException,
               ServerBootedException;

    /**
     * Fetch all channels and connected users as a tree. This retrieves an easy-to-use representation of the server
     * as a tree. This is primarily used for viewing the state of the server on a webpage.
     * @param __cb The callback object for the operation.
     * @param __current The Current object for the invocation.
     **/
    void getTree_async(AMD_Server_getTree __cb, Ice.Current __current)
        throws InvalidSecretException,
               ServerBootedException;

    /**
     * Fetch all current IP bans on the server.
     * @param __cb The callback object for the operation.
     * @param __current The Current object for the invocation.
     **/
    void getBans_async(AMD_Server_getBans __cb, Ice.Current __current)
        throws InvalidSecretException,
               ServerBootedException;

    /**
     * Set all current IP bans on the server. This will replace any bans already present, so if you want to add a ban, be sure to call {@link getBans} and then
     * append to the returned list before calling this method.
     * @param __cb The callback object for the operation.
     * @param bans List of bans.
     * @param __current The Current object for the invocation.
     **/
    void setBans_async(AMD_Server_setBans __cb, Ban[] bans, Ice.Current __current)
        throws InvalidSecretException,
               ServerBootedException;

    /**
     * Kick a user. The user is not banned, and is free to rejoin the server.
     * @param __cb The callback object for the operation.
     * @param session Connection ID of user. See {@link User.session}.
     * @param __current The Current object for the invocation.
     **/
    void kickUser_async(AMD_Server_kickUser __cb, int session, String reason, Ice.Current __current)
        throws InvalidSecretException,
               InvalidSessionException,
               ServerBootedException;

    /**
     * Get state of a single connected user.
     * @param __cb The callback object for the operation.
     * @param session Connection ID of user. See {@link User.session}.
     * @param __current The Current object for the invocation.
     **/
    void getState_async(AMD_Server_getState __cb, int session, Ice.Current __current)
        throws InvalidSecretException,
               InvalidSessionException,
               ServerBootedException;

    /**
     * Set user state. You can use this to move, mute and deafen users.
     * @param __cb The callback object for the operation.
     * @param state User state to set.
     * @param __current The Current object for the invocation.
     **/
    void setState_async(AMD_Server_setState __cb, User state, Ice.Current __current)
        throws InvalidChannelException,
               InvalidSecretException,
               InvalidSessionException,
               ServerBootedException;

    /**
     * Send text message to a single user.
     * @param __cb The callback object for the operation.
     * @param session Connection ID of user. See {@link User.session}.
     * @param __current The Current object for the invocation.
     **/
    void sendMessage_async(AMD_Server_sendMessage __cb, int session, String text, Ice.Current __current)
        throws InvalidSecretException,
               InvalidSessionException,
               ServerBootedException;

    /**
     * Check if user is permitted to perform action.
     * @param __cb The callback object for the operation.
     * @param session Connection ID of user. See {@link User.session}.
     * @param perm Permission bits to check.
     * @param __current The Current object for the invocation.
     **/
    void hasPermission_async(AMD_Server_hasPermission __cb, int session, int channelid, int perm, Ice.Current __current)
        throws InvalidChannelException,
               InvalidSecretException,
               InvalidSessionException,
               ServerBootedException;

    /**
     * Return users effective permissions
     * @param __cb The callback object for the operation.
     * @param session Connection ID of user. See {@link User.session}.
     * @param __current The Current object for the invocation.
     **/
    void effectivePermissions_async(AMD_Server_effectivePermissions __cb, int session, int channelid, Ice.Current __current)
        throws InvalidChannelException,
               InvalidSecretException,
               InvalidSessionException,
               ServerBootedException;

    /**
     * Add a context callback. This is done per user, and will add a context menu action for the user.
     * 
     * @param __cb The callback object for the operation.
     * @param session Session of user which should receive context entry.
     * @param text Name of action shown to user.
     * @param ctx Context this should be used in. Needs to be one or a combination of {@link ContextServer}, {@link ContextChannel} and {@link ContextUser}.
     * @param __current The Current object for the invocation.
     **/
    void addContextCallback_async(AMD_Server_addContextCallback __cb, int session, String action, String text, ServerContextCallbackPrx cb, int ctx, Ice.Current __current)
        throws InvalidCallbackException,
               InvalidSecretException,
               ServerBootedException;

    /**
     * Remove a callback.
     * 
     * @param __cb The callback object for the operation.
     * @param cb Callback interface to be removed. This callback will be removed from all from all users.
     * @param __current The Current object for the invocation.
     **/
    void removeContextCallback_async(AMD_Server_removeContextCallback __cb, ServerContextCallbackPrx cb, Ice.Current __current)
        throws InvalidCallbackException,
               InvalidSecretException,
               ServerBootedException;

    /**
     * Get state of single channel.
     * @param __cb The callback object for the operation.
     * @param channelid ID of Channel. See {@link Channel.id}.
     * @param __current The Current object for the invocation.
     **/
    void getChannelState_async(AMD_Server_getChannelState __cb, int channelid, Ice.Current __current)
        throws InvalidChannelException,
               InvalidSecretException,
               ServerBootedException;

    /**
     * Set state of a single channel. You can use this to move or relink channels.
     * @param __cb The callback object for the operation.
     * @param state Channel state to set.
     * @param __current The Current object for the invocation.
     **/
    void setChannelState_async(AMD_Server_setChannelState __cb, Channel state, Ice.Current __current)
        throws InvalidChannelException,
               InvalidSecretException,
               NestingLimitException,
               ServerBootedException;

    /**
     * Remove a channel and all its subchannels.
     * @param __cb The callback object for the operation.
     * @param channelid ID of Channel. See {@link Channel.id}.
     * @param __current The Current object for the invocation.
     **/
    void removeChannel_async(AMD_Server_removeChannel __cb, int channelid, Ice.Current __current)
        throws InvalidChannelException,
               InvalidSecretException,
               ServerBootedException;

    /**
     * Add a new channel.
     * @param __cb The callback object for the operation.
     * @param name Name of new channel.
     * @param __current The Current object for the invocation.
     **/
    void addChannel_async(AMD_Server_addChannel __cb, String name, int parent, Ice.Current __current)
        throws InvalidChannelException,
               InvalidSecretException,
               NestingLimitException,
               ServerBootedException;

    /**
     * Send text message to channel or a tree of channels.
     * @param __cb The callback object for the operation.
     * @param channelid Channel ID of channel to send to. See {@link Channel.id}.
     * @param text Message to send.
     * @param __current The Current object for the invocation.
     **/
    void sendMessageChannel_async(AMD_Server_sendMessageChannel __cb, int channelid, boolean tree, String text, Ice.Current __current)
        throws InvalidChannelException,
               InvalidSecretException,
               ServerBootedException;

    /**
     * Retrieve ACLs and Groups on a channel.
     * @param __cb The callback object for the operation.
     * @param channelid Channel ID of channel to fetch from. See {@link Channel.id}.
     * @param __current The Current object for the invocation.
     **/
    void getACL_async(AMD_Server_getACL __cb, int channelid, Ice.Current __current)
        throws InvalidChannelException,
               InvalidSecretException,
               ServerBootedException;

    /**
     * Set ACLs and Groups on a channel. Note that this will replace all existing ACLs and groups on the channel.
     * @param __cb The callback object for the operation.
     * @param channelid Channel ID of channel to fetch from. See {@link Channel.id}.
     * @param groups List of groups on the channel.
     * @param __current The Current object for the invocation.
     **/
    void setACL_async(AMD_Server_setACL __cb, int channelid, ACL[] acls, Group[] groups, boolean inherit, Ice.Current __current)
        throws InvalidChannelException,
               InvalidSecretException,
               ServerBootedException;

    /**
     * Temporarily add a user to a group on a channel. This state is not saved, and is intended for temporary memberships.
     * @param __cb The callback object for the operation.
     * @param channelid Channel ID of channel to add to. See {@link Channel.id}.
     * @param group Group name to add to.
     * @param __current The Current object for the invocation.
     **/
    void addUserToGroup_async(AMD_Server_addUserToGroup __cb, int channelid, int session, String group, Ice.Current __current)
        throws InvalidChannelException,
               InvalidSecretException,
               InvalidSessionException,
               ServerBootedException;

    /**
     * Remove a user from a temporary group membership on a channel. This state is not saved, and is intended for temporary memberships.
     * @param __cb The callback object for the operation.
     * @param channelid Channel ID of channel to add to. See {@link Channel.id}.
     * @param group Group name to remove from.
     * @param __current The Current object for the invocation.
     **/
    void removeUserFromGroup_async(AMD_Server_removeUserFromGroup __cb, int channelid, int session, String group, Ice.Current __current)
        throws InvalidChannelException,
               InvalidSecretException,
               InvalidSessionException,
               ServerBootedException;

    /**
     * Redirect whisper targets for user. If set, whenever a user tries to whisper to group "source", the whisper will be redirected to group "target".
     * To remove a redirect pass an empty target string. This is intended for context groups.
     * @param __cb The callback object for the operation.
     * @param session Connection ID of user. See {@link User.session}.
     * @param target Group name to redirect to.
     * @param __current The Current object for the invocation.
     **/
    void redirectWhisperGroup_async(AMD_Server_redirectWhisperGroup __cb, int session, String source, String target, Ice.Current __current)
        throws InvalidSecretException,
               InvalidSessionException,
               ServerBootedException;

    /**
     * Map a list of {@link User.userid} to a matching name.
     * @param __cb The callback object for the operation.
     * @param __current The Current object for the invocation.
     **/
    void getUserNames_async(AMD_Server_getUserNames __cb, int[] ids, Ice.Current __current)
        throws InvalidSecretException,
               ServerBootedException;

    /**
     * Map a list of user names to a matching id.
     * @param __cb The callback object for the operation.
     * @param __current The Current object for the invocation.
     **/
    void getUserIds_async(AMD_Server_getUserIds __cb, String[] names, Ice.Current __current)
        throws InvalidSecretException,
               ServerBootedException;

    /**
     * Register a new user.
     * @param __cb The callback object for the operation.
     * @param info Information about new user. Must include at least "name".
     * @param __current The Current object for the invocation.
     **/
    void registerUser_async(AMD_Server_registerUser __cb, java.util.Map<UserInfo, java.lang.String> info, Ice.Current __current)
        throws InvalidSecretException,
               InvalidUserException,
               ServerBootedException;

    /**
     * Remove a user registration.
     * @param __cb The callback object for the operation.
     * @param userid ID of registered user. See {@link RegisteredUser.userid}.
     * @param __current The Current object for the invocation.
     **/
    void unregisterUser_async(AMD_Server_unregisterUser __cb, int userid, Ice.Current __current)
        throws InvalidSecretException,
               InvalidUserException,
               ServerBootedException;

    /**
     * Update the registration for a user. You can use this to set the email or password of a user,
     * and can also use it to change the user's name.
     * @param __cb The callback object for the operation.
     * @param __current The Current object for the invocation.
     **/
    void updateRegistration_async(AMD_Server_updateRegistration __cb, int userid, java.util.Map<UserInfo, java.lang.String> info, Ice.Current __current)
        throws InvalidSecretException,
               InvalidUserException,
               ServerBootedException;

    /**
     * Fetch registration for a single user.
     * @param __cb The callback object for the operation.
     * @param userid ID of registered user. See {@link RegisteredUser.userid}.
     * @param __current The Current object for the invocation.
     **/
    void getRegistration_async(AMD_Server_getRegistration __cb, int userid, Ice.Current __current)
        throws InvalidSecretException,
               InvalidUserException,
               ServerBootedException;

    /**
     * Fetch a group of registered users.
     * @param __cb The callback object for the operation.
     * @param filter Substring of user name. If blank, will retrieve all registered users.
     * @param __current The Current object for the invocation.
     **/
    void getRegisteredUsers_async(AMD_Server_getRegisteredUsers __cb, String filter, Ice.Current __current)
        throws InvalidSecretException,
               ServerBootedException;

    /**
     * Verify the password of a user. You can use this to verify a user's credentials.
     * @param __cb The callback object for the operation.
     * @param name User name. See {@link RegisteredUser.name}.
     * @param __current The Current object for the invocation.
     **/
    void verifyPassword_async(AMD_Server_verifyPassword __cb, String name, String pw, Ice.Current __current)
        throws InvalidSecretException,
               ServerBootedException;

    /**
     * Fetch user texture. Textures are stored as zlib compress()ed 600x60 32-bit BGRA data.
     * @param __cb The callback object for the operation.
     * @param userid ID of registered user. See {@link RegisteredUser.userid}.
     * @param __current The Current object for the invocation.
     **/
    void getTexture_async(AMD_Server_getTexture __cb, int userid, Ice.Current __current)
        throws InvalidSecretException,
               InvalidUserException,
               ServerBootedException;

    /**
     * Set a user texture (now called avatar).
     * @param __cb The callback object for the operation.
     * @param userid ID of registered user. See {@link RegisteredUser.userid}.
     * @param __current The Current object for the invocation.
     **/
    void setTexture_async(AMD_Server_setTexture __cb, int userid, byte[] tex, Ice.Current __current)
        throws InvalidSecretException,
               InvalidTextureException,
               InvalidUserException,
               ServerBootedException;

    /**
     * Get virtual server uptime.
     * @param __cb The callback object for the operation.
     * @param __current The Current object for the invocation.
     **/
    void getUptime_async(AMD_Server_getUptime __cb, Ice.Current __current)
        throws InvalidSecretException,
               ServerBootedException;
}
