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
 * This is thrown when you supply an invalid callback.
 **/
public class InvalidCallbackException extends MurmurException
{
    public InvalidCallbackException()
    {
        super();
    }

    public InvalidCallbackException(Throwable __cause)
    {
        super(__cause);
    }

    public String
    ice_name()
    {
        return "Murmur::InvalidCallbackException";
    }

    protected void
    __writeImpl(IceInternal.BasicStream __os)
    {
        __os.startWriteSlice("::Murmur::InvalidCallbackException", -1, false);
        __os.endWriteSlice();
        super.__writeImpl(__os);
    }

    protected void
    __readImpl(IceInternal.BasicStream __is)
    {
        __is.startReadSlice();
        __is.endReadSlice();
        super.__readImpl(__is);
    }

    public static final long serialVersionUID = -2708950834526954200L;
}
