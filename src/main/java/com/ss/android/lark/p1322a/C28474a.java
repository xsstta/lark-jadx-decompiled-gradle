package com.ss.android.lark.p1322a;

import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.abtest.api.p1324a.C28491b;

/* renamed from: com.ss.android.lark.a.a */
public class C28474a extends AbstractC28490a<Boolean> {
    /* renamed from: a */
    public Boolean getDefault() {
        return true;
    }

    @Override // com.ss.android.lark.abtest.api.p1324a.AbstractC28490a
    public C28491b getLarkExperimentInfo() {
        return new C28491b("startupAot", "lark启动阶段主动触发aot", "zhuzhengtao", "对开启lark启动阶段主动触发aot 做abtest");
    }

    /* renamed from: b */
    public static boolean m104340b() {
        return ((Boolean) C28476b.m104344a().mo101335a(C28474a.class, true)).booleanValue();
    }
}
