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
 * Fetch default configuraion. This returns the configuration items that were set in the configuration file, or
 * the built-in default. The individual servers will use these values unless they have been overridden in the
 * server specific configuration. The only special case is the port, which defaults to the value defined here +
 * the servers ID - 1 (so that virtual server #1 uses the defined port, server #2 uses port+1 etc).
 **/

public abstract class Callback_Meta_getDefaultConf extends Ice.TwowayCallback
{
    public abstract void response(java.util.Map<java.lang.String, java.lang.String> __ret);
    public abstract void exception(Ice.UserException __ex);

    public final void __completed(Ice.AsyncResult __result)
    {
        MetaPrx __proxy = (MetaPrx)__result.getProxy();
        java.util.Map<java.lang.String, java.lang.String> __ret = null;
        try
        {
            __ret = __proxy.end_getDefaultConf(__result);
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