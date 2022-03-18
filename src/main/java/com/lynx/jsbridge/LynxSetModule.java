package com.lynx.jsbridge;

import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.C26681j;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class LynxSetModule extends LynxContextModule {
    @LynxMethod
    public boolean getDevtoolDebug() {
        return LynxEnv.m96123e().mo94105l();
    }

    @LynxMethod
    public boolean getDevtoolNextSupport() {
        return LynxEnv.m96123e().mo94094b("enable_devtool_next", true);
    }

    @LynxMethod
    public boolean getRedBoxSupport() {
        return LynxEnv.m96123e().mo94106m();
    }

    @LynxMethod
    public boolean isDevtoolBadgeEnabled() {
        return LynxEnv.m96123e().mo94094b("show_devtool_badge", true);
    }

    @LynxMethod
    public boolean isQuickjsCacheEnabled() {
        return LynxEnv.m96123e().mo94094b("enable_quickjs_cache", true);
    }

    @LynxMethod
    public boolean getLogToSystemStatus() {
        try {
            Class<?> cls = Class.forName("com.ss.android.agilelogger.ALog");
            Field declaredField = cls.getDeclaredField("sDebug");
            declaredField.setAccessible(true);
            return declaredField.getBoolean(cls);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return false;
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
            return false;
        }
    }

    public LynxSetModule(AbstractC26684l lVar) {
        super(lVar);
    }

    @LynxMethod
    public void switchDevtoolBadge(Boolean bool) {
        LynxEnv.m96123e().mo94090a("show_devtool_badge", bool.booleanValue());
    }

    @LynxMethod
    public void switchDevtoolDebug(Boolean bool) {
        LynxEnv.m96123e().mo94093b(bool.booleanValue());
    }

    @LynxMethod
    public void switchDevtoolNextSupport(Boolean bool) {
        LynxEnv.m96123e().mo94090a("enable_devtool_next", bool.booleanValue());
    }

    @LynxMethod
    public void switchQuickjsCache(Boolean bool) {
        LynxEnv.m96123e().mo94090a("enable_quickjs_cache", bool.booleanValue());
    }

    @LynxMethod
    public void switchRedBoxSupport(Boolean bool) {
        LynxEnv.m96123e().mo94096c(bool.booleanValue());
    }

    @LynxMethod
    public void switchKeyBoardDetect(boolean z) {
        if (z) {
            C26681j.m96609a().mo94644a(this.mLynxContext);
        } else {
            C26681j.m96609a().mo94645b(this.mLynxContext);
        }
    }

    @LynxMethod
    public void switchLogToSystem(boolean z) {
        try {
            Class.forName("com.ss.android.agilelogger.ALog").getMethod("setDebug", Boolean.TYPE).invoke(null, Boolean.valueOf(z));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
        }
    }
}
