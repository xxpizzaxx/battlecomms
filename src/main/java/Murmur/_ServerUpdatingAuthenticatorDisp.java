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
 * Callback interface for server authentication and registration. This allows you to support both authentication
 * and account updating.
 * You do not need to implement this if all you want is authentication, you only need this if other scripts
 * connected to the same server calls e.g. {@link Server.setTexture}.
 * Almost all of these methods support fall through, meaning murmur should continue the operation against its
 * own database.
 **/
public abstract class _ServerUpdatingAuthenticatorDisp extends Ice.ObjectImpl implements ServerUpdatingAuthenticator
{
    protected void
    ice_copyStateFrom(Ice.Object __obj)
        throws java.lang.CloneNotSupportedException
    {
        throw new java.lang.CloneNotSupportedException();
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::Murmur::ServerAuthenticator",
        "::Murmur::ServerUpdatingAuthenticator"
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
        return __ids[2];
    }

    public String ice_id(Ice.Current __current)
    {
        return __ids[2];
    }

    public static String ice_staticId()
    {
        return __ids[2];
    }

    /**
     * Called to authenticate a user. If you do not know the username in question, always return -2 from this
     * method to fall through to normal database authentication.
     * Note that if authentication succeeds, murmur will create a record of the user in it's database, reserving
     * the username and id so it cannot be used for normal database authentication.
     * The data in the certificate (name, email addresses etc), as well as the list of signing certificates,
     * should only be trusted if certstrong is true.
     * 
     * @param name Username to authenticate.
     * @param pw Password to authenticate with.
     * @param certificates List of der encoded certificates the user connected with.
     * @param certhash Hash of user certificate, as used by murmur internally when matching.
     * @param certstrong True if certificate was valid and signed by a trusted CA.
     * @param newname Set this to change the username from the supplied one.
     * @param groups List of groups on the root channel that the user will be added to for the duration of the connection.
     * @return UserID of authenticated user, -1 for authentication failures and -2 for unknown user (fallthrough).
     **/
    public final int authenticate(String name, String pw, byte[][] certificates, String certhash, boolean certstrong, Ice.StringHolder newname, GroupNameListHolder groups)
    {
        return authenticate(name, pw, certificates, certhash, certstrong, newname, groups, null);
    }

    /**
     * Fetch information about a user. This is used to retrieve information like email address, keyhash etc. If you
     * want murmur to take care of this information itself, simply return false to fall through.
     * @param id User id.
     * @param info Information about user. This needs to include at least "name".
     * @return true if information is present, false to fall through.
     **/
    public final boolean getInfo(int id, UserInfoMapHolder info)
    {
        return getInfo(id, info, null);
    }

    /**
     * Map a user id to a username.
     * @param id User id to map.
     * @return Name of user or empty string for unknown id.
     **/
    public final String idToName(int id)
    {
        return idToName(id, null);
    }

    /**
     * Map a user to a custom Texture.
     * @param id User id to map.
     * @return User texture or an empty texture for unknwon users or users without textures.
     **/
    public final byte[] idToTexture(int id)
    {
        return idToTexture(id, null);
    }

    /**
     * Map a name to a user id.
     * @param name Username to map.
     * @return User id or -2 for unknown name.
     **/
    public final int nameToId(String name)
    {
        return nameToId(name, null);
    }

    /**
     * Get a list of registered users matching filter.
     * @param filter Substring usernames must contain. If empty, return all registered users.
     * @return List of matching registered users.
     **/
    public final java.util.Map<java.lang.Integer, java.lang.String> getRegisteredUsers(String filter)
    {
        return getRegisteredUsers(filter, null);
    }

    /**
     * Register a new user.
     * @param info Information about user to register.
     * @return User id of new user, -1 for registration failure, or -2 to fall through.
     **/
    public final int registerUser(java.util.Map<UserInfo, java.lang.String> info)
    {
        return registerUser(info, null);
    }

    /**
     * Set additional information for user registration.
     * @param id Userid of registered user.
     * @param info Information to set about user. This should be merged with existing information.
     * @return 1 for successfull update, 0 for unsuccessfull update, -1 to fall through.
     **/
    public final int setInfo(int id, java.util.Map<UserInfo, java.lang.String> info)
    {
        return setInfo(id, info, null);
    }

    /**
     * Set texture (now called avatar) of user registration.
     * @param id registrationId of registered user.
     * @param tex New texture.
     * @return 1 for successfull update, 0 for unsuccessfull update, -1 to fall through.
     **/
    public final int setTexture(int id, byte[] tex)
    {
        return setTexture(id, tex, null);
    }

    /**
     * Unregister a user.
     * @param id Userid to unregister.
     * @return 1 for successfull unregistration, 0 for unsuccessfull unregistration, -1 to fall through.
     **/
    public final int unregisterUser(int id)
    {
        return unregisterUser(id, null);
    }

    public static Ice.DispatchStatus ___registerUser(ServerUpdatingAuthenticator __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        java.util.Map<UserInfo, java.lang.String> info;
        info = UserInfoMapHelper.read(__is);
        __inS.endReadParams();
        int __ret = __obj.registerUser(info, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        __os.writeInt(__ret);
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___unregisterUser(ServerUpdatingAuthenticator __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        int id;
        id = __is.readInt();
        __inS.endReadParams();
        int __ret = __obj.unregisterUser(id, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        __os.writeInt(__ret);
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___getRegisteredUsers(ServerUpdatingAuthenticator __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        String filter;
        filter = __is.readString();
        __inS.endReadParams();
        java.util.Map<java.lang.Integer, java.lang.String> __ret = __obj.getRegisteredUsers(filter, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        NameMapHelper.write(__os, __ret);
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___setInfo(ServerUpdatingAuthenticator __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        int id;
        java.util.Map<UserInfo, java.lang.String> info;
        id = __is.readInt();
        info = UserInfoMapHelper.read(__is);
        __inS.endReadParams();
        int __ret = __obj.setInfo(id, info, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        __os.writeInt(__ret);
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___setTexture(ServerUpdatingAuthenticator __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        int id;
        byte[] tex;
        id = __is.readInt();
        tex = TextureHelper.read(__is);
        __inS.endReadParams();
        int __ret = __obj.setTexture(id, tex, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        __os.writeInt(__ret);
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    private final static String[] __all =
    {
        "authenticate",
        "getInfo",
        "getRegisteredUsers",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping",
        "idToName",
        "idToTexture",
        "nameToId",
        "registerUser",
        "setInfo",
        "setTexture",
        "unregisterUser"
    };

    public Ice.DispatchStatus __dispatch(IceInternal.Incoming in, Ice.Current __current)
    {
        int pos = java.util.Arrays.binarySearch(__all, __current.operation);
        if(pos < 0)
        {
            throw new Ice.OperationNotExistException(__current.id, __current.facet, __current.operation);
        }

        switch(pos)
        {
            case 0:
            {
                return _ServerAuthenticatorDisp.___authenticate(this, in, __current);
            }
            case 1:
            {
                return _ServerAuthenticatorDisp.___getInfo(this, in, __current);
            }
            case 2:
            {
                return ___getRegisteredUsers(this, in, __current);
            }
            case 3:
            {
                return ___ice_id(this, in, __current);
            }
            case 4:
            {
                return ___ice_ids(this, in, __current);
            }
            case 5:
            {
                return ___ice_isA(this, in, __current);
            }
            case 6:
            {
                return ___ice_ping(this, in, __current);
            }
            case 7:
            {
                return _ServerAuthenticatorDisp.___idToName(this, in, __current);
            }
            case 8:
            {
                return _ServerAuthenticatorDisp.___idToTexture(this, in, __current);
            }
            case 9:
            {
                return _ServerAuthenticatorDisp.___nameToId(this, in, __current);
            }
            case 10:
            {
                return ___registerUser(this, in, __current);
            }
            case 11:
            {
                return ___setInfo(this, in, __current);
            }
            case 12:
            {
                return ___setTexture(this, in, __current);
            }
            case 13:
            {
                return ___unregisterUser(this, in, __current);
            }
        }

        assert(false);
        throw new Ice.OperationNotExistException(__current.id, __current.facet, __current.operation);
    }

    protected void __writeImpl(IceInternal.BasicStream __os)
    {
        __os.startWriteSlice(ice_staticId(), -1, true);
        __os.endWriteSlice();
    }

    protected void __readImpl(IceInternal.BasicStream __is)
    {
        __is.startReadSlice();
        __is.endReadSlice();
    }

    public static final long serialVersionUID = 0L;
}
