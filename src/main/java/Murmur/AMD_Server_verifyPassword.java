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
 * Verify the password of a user. You can use this to verify a user's credentials.
 **/

public interface AMD_Server_verifyPassword extends Ice.AMDCallback
{
    /**
     * ice_response indicates that
     * the operation completed successfully.
     * @param __ret (return value) User ID of registered user (See {@link RegisteredUser.userid}), -1 for failed authentication or -2 for unknown usernames.
     **/
    void ice_response(int __ret);
}
