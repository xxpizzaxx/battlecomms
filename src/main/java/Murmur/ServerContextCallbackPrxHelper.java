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
 * Callback interface for context actions. You need to supply one of these for {@link Server.addContext}.
 * If an added callback ever throws an exception or goes away, it will be automatically removed.
 * Please note that all callbacks are done asynchronously; murmur does not wait for the callback to
 * complete before continuing processing.
 **/
public final class ServerContextCallbackPrxHelper extends Ice.ObjectPrxHelperBase implements ServerContextCallbackPrx
{
    private static final String __contextAction_name = "contextAction";

    /**
     * Called when a context action is performed.
     * @param action Action to be performed.
     * @param usr User which initiated the action.
     * @param session If nonzero, session of target user.
     * @param channelid If nonzero, session of target channel.
     **/
    public void contextAction(String action, User usr, int session, int channelid)
    {
        contextAction(action, usr, session, channelid, null, false);
    }

    /**
     * Called when a context action is performed.
     * @param action Action to be performed.
     * @param usr User which initiated the action.
     * @param session If nonzero, session of target user.
     * @param channelid If nonzero, session of target channel.
     * @param __ctx The Context map to send with the invocation.
     **/
    public void contextAction(String action, User usr, int session, int channelid, java.util.Map<String, String> __ctx)
    {
        contextAction(action, usr, session, channelid, __ctx, true);
    }

    private void contextAction(String action, User usr, int session, int channelid, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "contextAction", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __delBase = __getDelegate(false);
                    _ServerContextCallbackDel __del = (_ServerContextCallbackDel)__delBase;
                    __del.contextAction(action, usr, session, channelid, __ctx, __observer);
                    return;
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, null, __cnt, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    /**
     * Called when a context action is performed.
     * @param __cb The callback object for the operation.
     * @param action Action to be performed.
     * @param session If nonzero, session of target user.
     **/
    public Ice.AsyncResult begin_contextAction(String action, User usr, int session, int channelid)
    {
        return begin_contextAction(action, usr, session, channelid, null, false, null);
    }

    /**
     * Called when a context action is performed.
     * @param __cb The callback object for the operation.
     * @param action Action to be performed.
     * @param session If nonzero, session of target user.
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_contextAction(String action, User usr, int session, int channelid, java.util.Map<String, String> __ctx)
    {
        return begin_contextAction(action, usr, session, channelid, __ctx, true, null);
    }

    /**
     * Called when a context action is performed.
     * @param __cb The callback object for the operation.
     * @param action Action to be performed.
     * @param session If nonzero, session of target user.
     **/
    public Ice.AsyncResult begin_contextAction(String action, User usr, int session, int channelid, Ice.Callback __cb)
    {
        return begin_contextAction(action, usr, session, channelid, null, false, __cb);
    }

    /**
     * Called when a context action is performed.
     * @param __cb The callback object for the operation.
     * @param action Action to be performed.
     * @param session If nonzero, session of target user.
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_contextAction(String action, User usr, int session, int channelid, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_contextAction(action, usr, session, channelid, __ctx, true, __cb);
    }

    /**
     * Called when a context action is performed.
     * @param __cb The callback object for the operation.
     * @param action Action to be performed.
     * @param session If nonzero, session of target user.
     **/
    public Ice.AsyncResult begin_contextAction(String action, User usr, int session, int channelid, Callback_ServerContextCallback_contextAction __cb)
    {
        return begin_contextAction(action, usr, session, channelid, null, false, __cb);
    }

    /**
     * Called when a context action is performed.
     * @param __cb The callback object for the operation.
     * @param action Action to be performed.
     * @param session If nonzero, session of target user.
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_contextAction(String action, User usr, int session, int channelid, java.util.Map<String, String> __ctx, Callback_ServerContextCallback_contextAction __cb)
    {
        return begin_contextAction(action, usr, session, channelid, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_contextAction(String action, User usr, int session, int channelid, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __contextAction_name, __cb);
        try
        {
            __result.__prepare(__contextAction_name, Ice.OperationMode.Idempotent, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(action);
            usr.__write(__os);
            __os.writeInt(session);
            __os.writeInt(channelid);
            __result.__endWriteParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    /**
     * ice_response indicates that
     * the operation completed successfully.
     **/
    public void end_contextAction(Ice.AsyncResult __result)
    {
        __end(__result, __contextAction_name);
    }

    public static ServerContextCallbackPrx checkedCast(Ice.ObjectPrx __obj)
    {
        ServerContextCallbackPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof ServerContextCallbackPrx)
            {
                __d = (ServerContextCallbackPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId()))
                {
                    ServerContextCallbackPrxHelper __h = new ServerContextCallbackPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static ServerContextCallbackPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        ServerContextCallbackPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof ServerContextCallbackPrx)
            {
                __d = (ServerContextCallbackPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId(), __ctx))
                {
                    ServerContextCallbackPrxHelper __h = new ServerContextCallbackPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static ServerContextCallbackPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        ServerContextCallbackPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId()))
                {
                    ServerContextCallbackPrxHelper __h = new ServerContextCallbackPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static ServerContextCallbackPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        ServerContextCallbackPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId(), __ctx))
                {
                    ServerContextCallbackPrxHelper __h = new ServerContextCallbackPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static ServerContextCallbackPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        ServerContextCallbackPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof ServerContextCallbackPrx)
            {
                __d = (ServerContextCallbackPrx)__obj;
            }
            else
            {
                ServerContextCallbackPrxHelper __h = new ServerContextCallbackPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static ServerContextCallbackPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        ServerContextCallbackPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            ServerContextCallbackPrxHelper __h = new ServerContextCallbackPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::Murmur::ServerContextCallback"
    };

    public static String ice_staticId()
    {
        return __ids[1];
    }

    protected Ice._ObjectDelM __createDelegateM()
    {
        return new _ServerContextCallbackDelM();
    }

    protected Ice._ObjectDelD __createDelegateD()
    {
        return new _ServerContextCallbackDelD();
    }

    public static void __write(IceInternal.BasicStream __os, ServerContextCallbackPrx v)
    {
        __os.writeProxy(v);
    }

    public static ServerContextCallbackPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            ServerContextCallbackPrxHelper result = new ServerContextCallbackPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}