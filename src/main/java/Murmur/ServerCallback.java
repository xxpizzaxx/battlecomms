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
 * Callback interface for servers. You can supply an implementation of this to receive notification
 * messages from the server.
 * If an added callback ever throws an exception or goes away, it will be automatically removed.
 * Please note that all callbacks are done asynchronously; murmur does not wait for the callback to
 * complete before continuing processing.
 * Note that callbacks are removed when a server is stopped, so you should have a callback for
 * {@link MetaCallback.started} which calls {@link Server.addCallback}.
 * @see MetaCallback
 * @see Server.addCallback
 **/
public interface ServerCallback extends Ice.Object,
                                        _ServerCallbackOperations, _ServerCallbackOperationsNC
{
    public static final long serialVersionUID = 2628831156946420561L;
}
