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
 * Map a list of {@link User.userid} to a matching name.
 **/

public interface AMD_Server_getUserNames extends Ice.AMDCallback
{
    /**
     * ice_response indicates that
     * the operation completed successfully.
     * @param __ret (return value) Matching list of names, with an empty string representing invalid or unknown ids.
     **/
    void ice_response(java.util.Map<java.lang.Integer, java.lang.String> __ret);
}