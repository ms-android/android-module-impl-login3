package com.ms.module.impl.login3;

import android.app.Activity;

import com.ms.module.supers.inter.login3.IAliPayLogin;
import com.ms.module.supers.inter.login3.IAliPayLoginAdapter;
import com.ms.module.supers.inter.login3.ILogin3Adapter;
import com.ms.module.supers.inter.login3.IQQLogin;
import com.ms.module.supers.inter.login3.IQQLoginAdapter;
import com.ms.module.supers.inter.login3.IWeChatLogin;
import com.ms.module.supers.inter.login3.IWeChatLoginAdapter;


public class Login3Impl extends ILogin3Adapter {

    private static final String QQ = "com.ms.module.impl.login3.qq.QQImpl";
    private static final String WECHAT = "com.ms.module.impl.login3.wechat.WeChatImpl";
    private static final String ALIPAY = "com.ms.module.impl.login3.alipay.AliPayImpl";


    private IQQLogin iqqLogin;
    private IWeChatLogin iWeChatLogin;
    private IAliPayLogin iAliPayLogin;

    @Override
    public IQQLogin qq() {

        if (iqqLogin != null) {
            return iqqLogin;
        }

        Class<?> aClass = null;
        try {
            aClass = Class.forName(QQ);
            Object o = null;
            try {
                o = aClass.newInstance();

                if (o instanceof IQQLogin) {
                    iqqLogin = (IQQLogin) o;
                } else {
                    iqqLogin = new IQQLoginAdapter();
                }

            } catch (IllegalAccessException e) {
                e.printStackTrace();
                iqqLogin = new IQQLoginAdapter();
            } catch (InstantiationException e) {
                e.printStackTrace();
                iqqLogin = new IQQLoginAdapter();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            iqqLogin = new IQQLoginAdapter();
        }
        return iqqLogin;
    }

    @Override
    public IWeChatLogin wechat() {
        if (iWeChatLogin != null) {
            return iWeChatLogin;
        }
        Class<?> aClass = null;
        try {
            aClass = Class.forName(WECHAT);
            Object o = null;
            try {
                o = aClass.newInstance();

                if (o instanceof IQQLogin) {
                    iWeChatLogin = (IWeChatLogin) o;
                } else {
                    iWeChatLogin = new IWeChatLoginAdapter();
                }

            } catch (IllegalAccessException e) {
                e.printStackTrace();
                iWeChatLogin = new IWeChatLoginAdapter();
            } catch (InstantiationException e) {
                e.printStackTrace();
                iWeChatLogin = new IWeChatLoginAdapter();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            iWeChatLogin = new IWeChatLoginAdapter();
        }
        return iWeChatLogin;
    }

    @Override
    public IAliPayLogin alipay() {
        if (iAliPayLogin != null) {
            return iAliPayLogin;
        }
        Class<?> aClass = null;
        try {
            aClass = Class.forName(ALIPAY);
            Object o = null;
            try {
                o = aClass.newInstance();

                if (o instanceof IAliPayLogin) {
                    iAliPayLogin = (IAliPayLogin) o;
                } else {
                    iAliPayLogin = new IAliPayLoginAdapter();
                }

            } catch (IllegalAccessException e) {
                e.printStackTrace();
                iAliPayLogin = new IAliPayLoginAdapter();
            } catch (InstantiationException e) {
                e.printStackTrace();
                iAliPayLogin = new IAliPayLoginAdapter();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            iAliPayLogin = new IAliPayLoginAdapter();
        }
        return iAliPayLogin;
    }
}
