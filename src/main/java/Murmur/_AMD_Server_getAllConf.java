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

final class _AMD_Server_getAllConf extends IceInternal.IncomingAsync implements AMD_Server_getAllConf
{
    public _AMD_Server_getAllConf(IceInternal.Incoming in)
    {
        super(in);
    }

    public void ice_response(java.util.Map<java.lang.String, java.lang.String> __ret)
    {
        if(__validateResponse(true))
        {
            try
            {
                IceInternal.BasicStream __os = this.__startWriteParams(Ice.FormatType.DefaultFormat);
                ConfigMapHelper.write(__os, __ret);
                this.__endWriteParams(true);
            }
            catch(Ice.LocalException __ex)
            {
                __exception(__ex);
                return;
            }
            __response();
        }
    }

    public void ice_exception(java.lang.Exception ex)
    {
        try
        {
            throw ex;
        }
        catch(InvalidSecretException __ex)
        {
            if(__validateResponse(false))
            {
                __writeUserException(__ex, Ice.FormatType.DefaultFormat);
                __response();
            }
        }
        catch(java.lang.Exception __ex)
        {
            super.ice_exception(__ex);
        }
    }
}
