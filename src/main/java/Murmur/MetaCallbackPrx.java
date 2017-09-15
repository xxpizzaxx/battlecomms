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
 * Callback interface for Meta. You can supply an implementation of this to receive notifications
 * when servers are stopped or started.
 * If an added callback ever throws an exception or goes away, it will be automatically removed.
 * Please note that all callbacks are done asynchronously; murmur does not wait for the callback to
 * complete before continuing processing.
 * @see ServerCallback
 * @see Meta.addCallback
 **/
public interface MetaCallbackPrx extends Ice.ObjectPrx
{
    /**
     * Called when a server is started. The server is up and running when this event is sent, so all methods that
     * need a running server will work.
     * @param srv Interface for started server.
     **/
    public void started(ServerPrx srv);

    /**
     * Called when a server is started. The server is up and running when this event is sent, so all methods that
     * need a running server will work.
     * @param srv Interface for started server.
     * @param __ctx The Context map to send with the invocation.
     **/
    public void started(ServerPrx srv, java.util.Map<String, String> __ctx);

    /**
     * Called when a server is started. The server is up and running when this event is sent, so all methods that
     * need a running server will work.
     * @param srv Interface for started server.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_started(ServerPrx srv);

    /**
     * Called when a server is started. The server is up and running when this event is sent, so all methods that
     * need a running server will work.
     * @param srv Interface for started server.
     * @param __ctx The Context map to send with the invocation.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_started(ServerPrx srv, java.util.Map<String, String> __ctx);

    /**
     * Called when a server is started. The server is up and running when this event is sent, so all methods that
     * need a running server will work.
     * @param srv Interface for started server.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_started(ServerPrx srv, Ice.Callback __cb);

    /**
     * Called when a server is started. The server is up and running when this event is sent, so all methods that
     * need a running server will work.
     * @param srv Interface for started server.
     * @param __ctx The Context map to send with the invocation.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_started(ServerPrx srv, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    /**
     * Called when a server is started. The server is up and running when this event is sent, so all methods that
     * need a running server will work.
     * @param srv Interface for started server.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_started(ServerPrx srv, Callback_MetaCallback_started __cb);

    /**
     * Called when a server is started. The server is up and running when this event is sent, so all methods that
     * need a running server will work.
     * @param srv Interface for started server.
     * @param __ctx The Context map to send with the invocation.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_started(ServerPrx srv, java.util.Map<String, String> __ctx, Callback_MetaCallback_started __cb);

    /**
     * Called when a server is started. The server is up and running when this event is sent, so all methods that
     * need a running server will work.
     * @param __result The asynchronous result object.
     **/
    public void end_started(Ice.AsyncResult __result);

    /**
     * Called when a server is stopped. The server is already stopped when this event is sent, so no methods that
     * need a running server will work.
     * @param srv Interface for started server.
     **/
    public void stopped(ServerPrx srv);

    /**
     * Called when a server is stopped. The server is already stopped when this event is sent, so no methods that
     * need a running server will work.
     * @param srv Interface for started server.
     * @param __ctx The Context map to send with the invocation.
     **/
    public void stopped(ServerPrx srv, java.util.Map<String, String> __ctx);

    /**
     * Called when a server is stopped. The server is already stopped when this event is sent, so no methods that
     * need a running server will work.
     * @param srv Interface for started server.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_stopped(ServerPrx srv);

    /**
     * Called when a server is stopped. The server is already stopped when this event is sent, so no methods that
     * need a running server will work.
     * @param srv Interface for started server.
     * @param __ctx The Context map to send with the invocation.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_stopped(ServerPrx srv, java.util.Map<String, String> __ctx);

    /**
     * Called when a server is stopped. The server is already stopped when this event is sent, so no methods that
     * need a running server will work.
     * @param srv Interface for started server.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_stopped(ServerPrx srv, Ice.Callback __cb);

    /**
     * Called when a server is stopped. The server is already stopped when this event is sent, so no methods that
     * need a running server will work.
     * @param srv Interface for started server.
     * @param __ctx The Context map to send with the invocation.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_stopped(ServerPrx srv, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    /**
     * Called when a server is stopped. The server is already stopped when this event is sent, so no methods that
     * need a running server will work.
     * @param srv Interface for started server.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_stopped(ServerPrx srv, Callback_MetaCallback_stopped __cb);

    /**
     * Called when a server is stopped. The server is already stopped when this event is sent, so no methods that
     * need a running server will work.
     * @param srv Interface for started server.
     * @param __ctx The Context map to send with the invocation.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_stopped(ServerPrx srv, java.util.Map<String, String> __ctx, Callback_MetaCallback_stopped __cb);

    /**
     * Called when a server is stopped. The server is already stopped when this event is sent, so no methods that
     * need a running server will work.
     * @param __result The asynchronous result object.
     **/
    public void end_stopped(Ice.AsyncResult __result);
}
