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
 * A connected user.
 **/
public class User implements java.lang.Cloneable, java.io.Serializable
{
    /**
     * Session ID. This identifies the connection to the server.
     **/
    public int session;

    /**
     * User ID. -1 if the user is anonymous.
     **/
    public int userid;

    /**
     * Is user muted by the server?
     **/
    public boolean mute;

    /**
     * Is user deafened by the server? If true, this implies mute.
     **/
    public boolean deaf;

    /**
     * Is the user suppressed by the server? This means the user is not muted, but does not have speech privileges in the current channel.
     **/
    public boolean suppress;

    /**
     * Is the user a priority speaker?
     **/
    public boolean prioritySpeaker;

    /**
     * Is the user self-muted?
     **/
    public boolean selfMute;

    /**
     * Is the user self-deafened? If true, this implies mute.
     **/
    public boolean selfDeaf;

    /**
     * Is the User recording? (This flag is read-only and cannot be changed using setState().)
     **/
    public boolean recording;

    /**
     * Channel ID the user is in. Matches {@link Channel.id}.
     **/
    public int channel;

    /**
     * The name of the user.
     **/
    public String name;

    /**
     * Seconds user has been online.
     **/
    public int onlinesecs;

    /**
     * Average transmission rate in bytes per second over the last few seconds.
     **/
    public int bytespersec;

    /**
     * Client version. Major version in upper 16 bits, followed by 8 bits of minor version and 8 bits of patchlevel. Version 1.2.3 = 0x010203.
     **/
    public int version;

    /**
     * Client release. For official releases, this equals the version. For snapshots and git compiles, this will be something else.
     **/
    public String release;

    /**
     * Client OS.
     **/
    public String os;

    /**
     * Client OS Version.
     **/
    public String osversion;

    /**
     * Plugin Identity. This will be the user's unique ID inside the current game.
     **/
    public String identity;

    /**
     * Plugin context. This is a binary blob identifying the game and team the user is on.
     **/
    public String context;

    /**
     * User comment. Shown as tooltip for this user.
     **/
    public String comment;

    /**
     * Client address.
     **/
    public byte[] address;

    /**
     * TCP only. True until UDP connectivity is established.
     **/
    public boolean tcponly;

    /**
     * Idle time. This is how many seconds it is since the user last spoke. Other activity is not counted.
     **/
    public int idlesecs;

    /**
     * UDP Ping Average. This is the average ping for the user via UDP over the duration of the connection.
     **/
    public float udpPing;

    /**
     * TCP Ping Average. This is the average ping for the user via TCP over the duration of the connection.
     **/
    public float tcpPing;

    public User()
    {
    }

    public User(int session, int userid, boolean mute, boolean deaf, boolean suppress, boolean prioritySpeaker, boolean selfMute, boolean selfDeaf, boolean recording, int channel, String name, int onlinesecs, int bytespersec, int version, String release, String os, String osversion, String identity, String context, String comment, byte[] address, boolean tcponly, int idlesecs, float udpPing, float tcpPing)
    {
        this.session = session;
        this.userid = userid;
        this.mute = mute;
        this.deaf = deaf;
        this.suppress = suppress;
        this.prioritySpeaker = prioritySpeaker;
        this.selfMute = selfMute;
        this.selfDeaf = selfDeaf;
        this.recording = recording;
        this.channel = channel;
        this.name = name;
        this.onlinesecs = onlinesecs;
        this.bytespersec = bytespersec;
        this.version = version;
        this.release = release;
        this.os = os;
        this.osversion = osversion;
        this.identity = identity;
        this.context = context;
        this.comment = comment;
        this.address = address;
        this.tcponly = tcponly;
        this.idlesecs = idlesecs;
        this.udpPing = udpPing;
        this.tcpPing = tcpPing;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        User _r = null;
        if(rhs instanceof User)
        {
            _r = (User)rhs;
        }

        if(_r != null)
        {
            if(session != _r.session)
            {
                return false;
            }
            if(userid != _r.userid)
            {
                return false;
            }
            if(mute != _r.mute)
            {
                return false;
            }
            if(deaf != _r.deaf)
            {
                return false;
            }
            if(suppress != _r.suppress)
            {
                return false;
            }
            if(prioritySpeaker != _r.prioritySpeaker)
            {
                return false;
            }
            if(selfMute != _r.selfMute)
            {
                return false;
            }
            if(selfDeaf != _r.selfDeaf)
            {
                return false;
            }
            if(recording != _r.recording)
            {
                return false;
            }
            if(channel != _r.channel)
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
            if(onlinesecs != _r.onlinesecs)
            {
                return false;
            }
            if(bytespersec != _r.bytespersec)
            {
                return false;
            }
            if(version != _r.version)
            {
                return false;
            }
            if(release != _r.release)
            {
                if(release == null || _r.release == null || !release.equals(_r.release))
                {
                    return false;
                }
            }
            if(os != _r.os)
            {
                if(os == null || _r.os == null || !os.equals(_r.os))
                {
                    return false;
                }
            }
            if(osversion != _r.osversion)
            {
                if(osversion == null || _r.osversion == null || !osversion.equals(_r.osversion))
                {
                    return false;
                }
            }
            if(identity != _r.identity)
            {
                if(identity == null || _r.identity == null || !identity.equals(_r.identity))
                {
                    return false;
                }
            }
            if(context != _r.context)
            {
                if(context == null || _r.context == null || !context.equals(_r.context))
                {
                    return false;
                }
            }
            if(comment != _r.comment)
            {
                if(comment == null || _r.comment == null || !comment.equals(_r.comment))
                {
                    return false;
                }
            }
            if(!java.util.Arrays.equals(address, _r.address))
            {
                return false;
            }
            if(tcponly != _r.tcponly)
            {
                return false;
            }
            if(idlesecs != _r.idlesecs)
            {
                return false;
            }
            if(udpPing != _r.udpPing)
            {
                return false;
            }
            if(tcpPing != _r.tcpPing)
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
        __h = IceInternal.HashUtil.hashAdd(__h, "::Murmur::User");
        __h = IceInternal.HashUtil.hashAdd(__h, session);
        __h = IceInternal.HashUtil.hashAdd(__h, userid);
        __h = IceInternal.HashUtil.hashAdd(__h, mute);
        __h = IceInternal.HashUtil.hashAdd(__h, deaf);
        __h = IceInternal.HashUtil.hashAdd(__h, suppress);
        __h = IceInternal.HashUtil.hashAdd(__h, prioritySpeaker);
        __h = IceInternal.HashUtil.hashAdd(__h, selfMute);
        __h = IceInternal.HashUtil.hashAdd(__h, selfDeaf);
        __h = IceInternal.HashUtil.hashAdd(__h, recording);
        __h = IceInternal.HashUtil.hashAdd(__h, channel);
        __h = IceInternal.HashUtil.hashAdd(__h, name);
        __h = IceInternal.HashUtil.hashAdd(__h, onlinesecs);
        __h = IceInternal.HashUtil.hashAdd(__h, bytespersec);
        __h = IceInternal.HashUtil.hashAdd(__h, version);
        __h = IceInternal.HashUtil.hashAdd(__h, release);
        __h = IceInternal.HashUtil.hashAdd(__h, os);
        __h = IceInternal.HashUtil.hashAdd(__h, osversion);
        __h = IceInternal.HashUtil.hashAdd(__h, identity);
        __h = IceInternal.HashUtil.hashAdd(__h, context);
        __h = IceInternal.HashUtil.hashAdd(__h, comment);
        __h = IceInternal.HashUtil.hashAdd(__h, address);
        __h = IceInternal.HashUtil.hashAdd(__h, tcponly);
        __h = IceInternal.HashUtil.hashAdd(__h, idlesecs);
        __h = IceInternal.HashUtil.hashAdd(__h, udpPing);
        __h = IceInternal.HashUtil.hashAdd(__h, tcpPing);
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
        __os.writeInt(session);
        __os.writeInt(userid);
        __os.writeBool(mute);
        __os.writeBool(deaf);
        __os.writeBool(suppress);
        __os.writeBool(prioritySpeaker);
        __os.writeBool(selfMute);
        __os.writeBool(selfDeaf);
        __os.writeBool(recording);
        __os.writeInt(channel);
        __os.writeString(name);
        __os.writeInt(onlinesecs);
        __os.writeInt(bytespersec);
        __os.writeInt(version);
        __os.writeString(release);
        __os.writeString(os);
        __os.writeString(osversion);
        __os.writeString(identity);
        __os.writeString(context);
        __os.writeString(comment);
        NetAddressHelper.write(__os, address);
        __os.writeBool(tcponly);
        __os.writeInt(idlesecs);
        __os.writeFloat(udpPing);
        __os.writeFloat(tcpPing);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        session = __is.readInt();
        userid = __is.readInt();
        mute = __is.readBool();
        deaf = __is.readBool();
        suppress = __is.readBool();
        prioritySpeaker = __is.readBool();
        selfMute = __is.readBool();
        selfDeaf = __is.readBool();
        recording = __is.readBool();
        channel = __is.readInt();
        name = __is.readString();
        onlinesecs = __is.readInt();
        bytespersec = __is.readInt();
        version = __is.readInt();
        release = __is.readString();
        os = __is.readString();
        osversion = __is.readString();
        identity = __is.readString();
        context = __is.readString();
        comment = __is.readString();
        address = NetAddressHelper.read(__is);
        tcponly = __is.readBool();
        idlesecs = __is.readInt();
        udpPing = __is.readFloat();
        tcpPing = __is.readFloat();
    }

    public static final long serialVersionUID = 7235133000075702206L;
}