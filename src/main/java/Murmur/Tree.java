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
 * User and subchannel state. Read-only.
 **/
public class Tree extends Ice.ObjectImpl
{
    public Tree()
    {
    }

    public Tree(Channel c, Tree[] children, User[] users)
    {
        this.c = c;
        this.children = children;
        this.users = users;
    }

    private static class __F implements Ice.ObjectFactory
    {
        public Ice.Object create(String type)
        {
            assert(type.equals(ice_staticId()));
            return new Tree();
        }

        public void destroy()
        {
        }
    }
    private static Ice.ObjectFactory _factory = new __F();

    public static Ice.ObjectFactory
    ice_factory()
    {
        return _factory;
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::Murmur::Tree"
    };

    public boolean ice_isA(String s)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public boolean ice_isA(String s, Ice.Current __current)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public String[] ice_ids()
    {
        return __ids;
    }

    public String[] ice_ids(Ice.Current __current)
    {
        return __ids;
    }

    public String ice_id()
    {
        return __ids[1];
    }

    public String ice_id(Ice.Current __current)
    {
        return __ids[1];
    }

    public static String ice_staticId()
    {
        return __ids[1];
    }

    protected void __writeImpl(IceInternal.BasicStream __os)
    {
        __os.startWriteSlice(ice_staticId(), -1, true);
        c.__write(__os);
        TreeListHelper.write(__os, children);
        UserListHelper.write(__os, users);
        __os.endWriteSlice();
    }

    protected void __readImpl(IceInternal.BasicStream __is)
    {
        __is.startReadSlice();
        c = new Channel();
        c.__read(__is);
        children = TreeListHelper.read(__is);
        users = UserListHelper.read(__is);
        __is.endReadSlice();
    }

    /**
     * Channel definition of current channel.
     **/
    public Channel c;

    /**
     * List of subchannels.
     **/
    public Tree[] children;

    /**
     * Users in this channel.
     **/
    public User[] users;

    public static final long serialVersionUID = -6734201072128765534L;
}
