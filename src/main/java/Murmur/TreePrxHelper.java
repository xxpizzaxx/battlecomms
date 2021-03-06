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
public final class TreePrxHelper extends Ice.ObjectPrxHelperBase implements TreePrx
{
    public static TreePrx checkedCast(Ice.ObjectPrx __obj)
    {
        TreePrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof TreePrx)
            {
                __d = (TreePrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId()))
                {
                    TreePrxHelper __h = new TreePrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static TreePrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        TreePrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof TreePrx)
            {
                __d = (TreePrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId(), __ctx))
                {
                    TreePrxHelper __h = new TreePrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static TreePrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        TreePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId()))
                {
                    TreePrxHelper __h = new TreePrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static TreePrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        TreePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId(), __ctx))
                {
                    TreePrxHelper __h = new TreePrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static TreePrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        TreePrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof TreePrx)
            {
                __d = (TreePrx)__obj;
            }
            else
            {
                TreePrxHelper __h = new TreePrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static TreePrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        TreePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            TreePrxHelper __h = new TreePrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::Murmur::Tree"
    };

    public static String ice_staticId()
    {
        return __ids[1];
    }

    protected Ice._ObjectDelM __createDelegateM()
    {
        return new _TreeDelM();
    }

    protected Ice._ObjectDelD __createDelegateD()
    {
        return new _TreeDelD();
    }

    public static void __write(IceInternal.BasicStream __os, TreePrx v)
    {
        __os.writeProxy(v);
    }

    public static TreePrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            TreePrxHelper result = new TreePrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
