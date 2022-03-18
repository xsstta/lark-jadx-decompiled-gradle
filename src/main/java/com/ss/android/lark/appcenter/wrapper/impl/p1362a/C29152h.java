package com.ss.android.lark.appcenter.wrapper.impl.p1362a;

import com.ss.android.appcenter.p1262a.p1263a.AbstractC27542g;
import com.ss.android.lark.appcenter.wrapper.AppCenterModule;

/* renamed from: com.ss.android.lark.appcenter.wrapper.impl.a.h */
public class C29152h implements AbstractC27542g {
    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27542g
    /* renamed from: a */
    public void mo98188a() {
        AppCenterModule.m107044a().notifyBootMileStoneFirstDataLoaded("appCenter");
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27542g
    /* renamed from: b */
    public void mo98189b() {
        AppCenterModule.m107044a().notifyBootMileStoneFirstFrameDraw("appCenter");
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27542g
    /* renamed from: c */
    public void mo98190c() {
        AppCenterModule.m107044a().notifyBootMileStoneFirstContentDraw("appCenter");
    }
}
