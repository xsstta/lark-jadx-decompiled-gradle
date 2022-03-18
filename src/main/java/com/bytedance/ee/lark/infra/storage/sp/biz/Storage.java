package com.bytedance.ee.lark.infra.storage.sp.biz;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.ee.lark.infra.foundation.dependency.DependencyMgr;
import com.bytedance.ee.lark.infra.storage.p640c.C12899a;
import com.bytedance.ee.lark.infra.storage.sp.base.AbstractC12903a;
import com.bytedance.ee.lark.infra.storage.sp.base.C12909f;

public class Storage {
    private static AbstractC12903a mUserScopeStorage;

    public static String getStorageFilePrefix(String str) {
        return DependencyMgr.f34159a.mo48297a() + str;
    }

    public static AbstractC12903a getUserScopeStorage(Context context) {
        if (mUserScopeStorage == null) {
            synchronized (C12909f.class) {
                if (mUserScopeStorage == null) {
                    mUserScopeStorage = new C12909f(context);
                }
            }
        }
        return mUserScopeStorage;
    }

    public static SharedPreferences getStorageByName(Context context, String str) {
        return C12899a.m53203a(context, str);
    }
}
