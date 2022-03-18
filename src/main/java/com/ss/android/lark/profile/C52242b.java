package com.ss.android.lark.profile;

import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.utils.LarkContext;
import dagger.hilt.android.C68119b;

/* renamed from: com.ss.android.lark.profile.b */
public class C52242b {

    /* renamed from: com.ss.android.lark.profile.b$a */
    public interface AbstractC52243a {
        /* renamed from: d */
        C52239a mo102453d();
    }

    /* renamed from: b */
    public static IProfileModuleDependency m202631b() {
        return m202630a().mo178823e();
    }

    /* renamed from: a */
    public static C52239a m202630a() {
        return ((AbstractC52243a) C68119b.m264753a(LarkContext.getApplication(), AbstractC52243a.class)).mo102453d();
    }
}
