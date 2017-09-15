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
 * Fetch all current IP bans on the server.
 **/

public abstract class Callback_Server_getBans extends Ice.TwowayCallback
{
    public abstract void response(Ban[] __ret);
    public abstract void exception(Ice.UserException __ex);

    public final void __completed(Ice.AsyncResult __result)
    {
        ServerPrx __proxy = (ServerPrx)__result.getProxy();
        Ban[] __ret = null;
        try
        {
            __ret = __proxy.end_getBans(__result);
        }
        catch(Ice.UserException __ex)
        {
            exception(__ex);
            return;
        }
        catch(Ice.LocalException __ex)
        {
            exception(__ex);
            return;
        }
        response(__ret);
    }
}
