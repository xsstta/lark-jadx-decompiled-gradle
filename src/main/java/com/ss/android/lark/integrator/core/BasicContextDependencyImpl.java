package com.ss.android.lark.integrator.core;

import android.content.Context;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.ss.android.lark.core.dependency.AbstractC36116a;
import com.ss.android.lark.integrator.p1999b.C39113a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;

@ClaymoreImpl(AbstractC36116a.class)
public class BasicContextDependencyImpl implements AbstractC36116a {
    @Override // com.ss.android.lark.core.dependency.AbstractC36116a
    public Context getContext() {
        return LarkContext.getApplication();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36116a
    public boolean isUsPackage() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isUsPackage();
    }

    public ClassLoader getPathClassLoader() {
        ClassLoader classLoader = getContext().getClassLoader();
        if (!(classLoader instanceof C39113a)) {
            return classLoader;
        }
        Log.m165389i("HackLibPath", "change classloader from " + classLoader);
        ClassLoader parent = classLoader.getParent();
        Log.m165389i("HackLibPath", "change classloader to " + parent);
        return parent;
    }
}
