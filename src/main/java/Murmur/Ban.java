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
 * A single ip mask for a ban.
 **/
public class Ban implements java.lang.Cloneable, java.io.Serializable
{
    /**
     * Address to ban.
     **/
    public byte[] address;

    /**
     * Number of bits in ban to apply.
     **/
    public int bits;

    /**
     * Username associated with ban.
     **/
    public String name;

    /**
     * Hash of banned user.
     **/
    public String hash;

    /**
     * Reason for ban.
     **/
    public String reason;

    /**
     * Date ban was applied in unix time format.
     **/
    public int start;

    /**
     * Duration of ban.
     **/
    public int duration;

    public Ban()
    {
    }

    public Ban(byte[] address, int bits, String name, String hash, String reason, int start, int duration)
    {
        this.address = address;
        this.bits = bits;
        this.name = name;
        this.hash = hash;
        this.reason = reason;
        this.start = start;
        this.duration = duration;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        Ban _r = null;
        if(rhs instanceof Ban)
        {
            _r = (Ban)rhs;
        }

        if(_r != null)
        {
            if(!java.util.Arrays.equals(address, _r.address))
            {
                return false;
            }
            if(bits != _r.bits)
            {
                return false;
            }
            if(name != _r.name)
            {
                if(name == null || _r.name == null || !name.equals(_r.name))
                {
                    return false;
                }
            }
            if(hash != _r.hash)
            {
                if(hash == null || _r.hash == null || !hash.equals(_r.hash))
                {
                    return false;
                }
            }
            if(reason != _r.reason)
            {
                if(reason == null || _r.reason == null || !reason.equals(_r.reason))
                {
                    return false;
                }
            }
            if(start != _r.start)
            {
                return false;
            }
            if(duration != _r.duration)
            {
                return false;
            }

            return true;
        }

        return false;
    }

    public int
    hashCode()
    {
        int __h = 5381;
        __h = IceInternal.HashUtil.hashAdd(__h, "::Murmur::Ban");
        __h = IceInternal.HashUtil.hashAdd(__h, address);
        __h = IceInternal.HashUtil.hashAdd(__h, bits);
        __h = IceInternal.HashUtil.hashAdd(__h, name);
        __h = IceInternal.HashUtil.hashAdd(__h, hash);
        __h = IceInternal.HashUtil.hashAdd(__h, reason);
        __h = IceInternal.HashUtil.hashAdd(__h, start);
        __h = IceInternal.HashUtil.hashAdd(__h, duration);
        return __h;
    }

    public java.lang.Object
    clone()
    {
        java.lang.Object o = null;
        try
        {
            o = super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return o;
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        NetAddressHelper.write(__os, address);
        __os.writeInt(bits);
        __os.writeString(name);
        __os.writeString(hash);
        __os.writeString(reason);
        __os.writeInt(start);
        __os.writeInt(duration);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        address = NetAddressHelper.read(__is);
        bits = __is.readInt();
        name = __is.readString();
        hash = __is.readString();
        reason = __is.readString();
        start = __is.readInt();
        duration = __is.readInt();
    }

    public static final long serialVersionUID = -4645042658623756492L;
}
