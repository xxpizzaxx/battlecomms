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

final class _AMD_Meta_getSliceChecksums extends IceInternal.IncomingAsync implements AMD_Meta_getSliceChecksums
{
    public _AMD_Meta_getSliceChecksums(IceInternal.Incoming in)
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
                com.zeroc.Ice.SliceChecksumDictHelper.write(__os, __ret);
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
}