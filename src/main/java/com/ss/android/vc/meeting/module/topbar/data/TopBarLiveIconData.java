package com.ss.android.vc.meeting.module.topbar.data;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ss/android/vc/meeting/module/topbar/data/TopBarLiveIconData;", "", "isLiving", "", "audienceCount", "", "(ZI)V", "getAudienceCount", "()I", "setAudienceCount", "(I)V", "()Z", "setLiving", "(Z)V", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.topbar.a.c */
public final class TopBarLiveIconData {

    /* renamed from: a */
    private boolean f160216a;

    /* renamed from: b */
    private int f160217b;

    /* renamed from: b */
    public final int mo219514b() {
        return this.f160217b;
    }

    /* renamed from: a */
    public final boolean mo219513a() {
        return this.f160216a;
    }

    /* renamed from: a */
    public final void mo219511a(int i) {
        this.f160217b = i;
    }

    /* renamed from: a */
    public final void mo219512a(boolean z) {
        this.f160216a = z;
    }

    public TopBarLiveIconData(boolean z, int i) {
        this.f160216a = z;
        this.f160217b = i;
    }
}
