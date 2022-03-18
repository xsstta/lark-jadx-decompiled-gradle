package com.ss.android.lark.integrator.calendar.dependency;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30055u;
import com.ss.android.lark.integrator.calendar.CalendarModuleProvider;
import com.ss.android.lark.utils.ApiUtils;

/* renamed from: com.ss.android.lark.integrator.calendar.dependency.t */
public class C39223t implements AbstractC30055u {

    /* renamed from: a */
    private final ICoreApi f100523a = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30055u
    /* renamed from: b */
    public void mo108279b() {
        this.f100523a.notifyBootMileStoneFirstDataLoaded("calendar");
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30055u
    /* renamed from: c */
    public void mo108280c() {
        this.f100523a.notifyBootMileStoneFirstFrameDraw("calendar");
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30055u
    /* renamed from: d */
    public void mo108281d() {
        this.f100523a.notifyBootMileStoneFirstContentDraw("calendar");
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30055u
    /* renamed from: e */
    public void mo108282e() {
        this.f100523a.notifyMainTabFragmentContentDraw("calendar");
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30055u
    /* renamed from: a */
    public <T extends View> T mo108277a() {
        return (T) this.f100523a.getTabView("calendar");
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30055u
    /* renamed from: a */
    public void mo108278a(Context context, Bundle bundle) {
        bundle.putBoolean("transition", true);
        this.f100523a.getMainLauncher().mo105707b(context, CalendarModuleProvider.m154500a().mo108131e(), bundle);
    }
}
