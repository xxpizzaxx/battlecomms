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

public enum UserInfo implements java.io.Serializable
{
    
    UserName(0),
    
    UserEmail(1),
    
    UserComment(2),
    
    UserHash(3),
    
    UserPassword(4),
    
    UserLastActive(5);

    public int
    value()
    {
        return __value;
    }

    public static UserInfo
    valueOf(int __v)
    {
        switch(__v)
        {
        case 0:
            return UserName;
        case 1:
            return UserEmail;
        case 2:
            return UserComment;
        case 3:
            return UserHash;
        case 4:
            return UserPassword;
        case 5:
            return UserLastActive;
        }
        return null;
    }

    private
    UserInfo(int __v)
    {
        __value = __v;
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeEnum(value(), 5);
    }

    public static UserInfo
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readEnum(5);
        return __validate(__v);
    }

    private static UserInfo
    __validate(int __v)
    {
        final UserInfo __e = valueOf(__v);
        if(__e == null)
        {
            throw new Ice.MarshalException("enumerator value " + __v + " is out of range");
        }
        return __e;
    }

    private final int __value;
}
