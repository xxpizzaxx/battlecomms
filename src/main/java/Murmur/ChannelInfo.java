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

public enum ChannelInfo implements java.io.Serializable
{
    
    ChannelDescription(0),
    
    ChannelPosition(1);

    public int
    value()
    {
        return __value;
    }

    public static ChannelInfo
    valueOf(int __v)
    {
        switch(__v)
        {
        case 0:
            return ChannelDescription;
        case 1:
            return ChannelPosition;
        }
        return null;
    }

    private
    ChannelInfo(int __v)
    {
        __value = __v;
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeEnum(value(), 1);
    }

    public static ChannelInfo
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readEnum(1);
        return __validate(__v);
    }

    private static ChannelInfo
    __validate(int __v)
    {
        final ChannelInfo __e = valueOf(__v);
        if(__e == null)
        {
            throw new Ice.MarshalException("enumerator value " + __v + " is out of range");
        }
        return __e;
    }

    private final int __value;
}
