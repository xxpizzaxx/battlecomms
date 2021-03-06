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
public interface ServerAuthenticator extends Ice.Object,
                                             _ServerAuthenticatorOperations, _ServerAuthenticatorOperationsNC
{
    public static final long serialVersionUID = -6383738775945325747L;
}
