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
 * A text message between users.
 **/
public class TextMessage implements java.lang.Cloneable, java.io.Serializable
{
    /**
     * Sessions (connected users) who were sent this message.
     **/
    public int[] sessions;

    /**
     * Channels who were sent this message.
     **/
    public int[] channels;

    /**
     * Trees of channels who were sent this message.
     **/
    public int[] trees;

    /**
     * The contents of the message.
     **/
    public String text;

    public TextMessage()
    {
    }

    public TextMessage(int[] sessions, int[] channels, int[] trees, String text)
    {
        this.sessions = sessions;
        this.channels = channels;
        this.trees = trees;
        this.text = text;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        TextMessage _r = null;
        if(rhs instanceof TextMessage)
        {
            _r = (TextMessage)rhs;
        }

        if(_r != null)
        {
            if(!java.util.Arrays.equals(sessions, _r.sessions))
            {
                return false;
            }
            if(!java.util.Arrays.equals(channels, _r.channels))
            {
                return false;
            }
            if(!java.util.Arrays.equals(trees, _r.trees))
            {
                return false;
            }
            if(text != _r.text)
            {
                if(text == null || _r.text == null || !text.equals(_r.text))
                {
                    return false;
                }
            }

            return true;
        }

        return false;
    }

    public int
    hashCode()
    {
        int __h = 5381;
        __h = IceInternal.HashUtil.hashAdd(__h, "::Murmur::TextMessage");
        __h = IceInternal.HashUtil.hashAdd(__h, sessions);
        __h = IceInternal.HashUtil.hashAdd(__h, channels);
        __h = IceInternal.HashUtil.hashAdd(__h, trees);
        __h = IceInternal.HashUtil.hashAdd(__h, text);
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
        IntListHelper.write(__os, sessions);
        IntListHelper.write(__os, channels);
        IntListHelper.write(__os, trees);
        __os.writeString(text);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        sessions = IntListHelper.read(__is);
        channels = IntListHelper.read(__is);
        trees = IntListHelper.read(__is);
        text = __is.readString();
    }

    public static final long serialVersionUID = -5316767516995731448L;
}
