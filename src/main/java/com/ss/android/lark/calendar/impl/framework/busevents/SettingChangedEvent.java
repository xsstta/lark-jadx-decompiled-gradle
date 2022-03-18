package com.ss.android.lark.calendar.impl.framework.busevents;

import com.ss.android.eventbus.BaseEvent;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\u0006\u0010\u0017\u001a\u00020\u0003R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u000b\"\u0004\b\u0012\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/busevents/SettingChangedEvent;", "Lcom/ss/android/eventbus/BaseEvent;", "skinTypeChanged", "", "pastEventsMaskChanged", "firstDayOfWeekChanged", "alternateCalendarChanged", "defaultEventDurationChanged", "isRefreshBySdk", "(ZZZZZZ)V", "getAlternateCalendarChanged", "()Z", "setAlternateCalendarChanged", "(Z)V", "getDefaultEventDurationChanged", "setDefaultEventDurationChanged", "getFirstDayOfWeekChanged", "setFirstDayOfWeekChanged", "setRefreshBySdk", "getPastEventsMaskChanged", "setPastEventsMaskChanged", "getSkinTypeChanged", "setSkinTypeChanged", "needReLoadEvent", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.a.m */
public final class SettingChangedEvent extends BaseEvent {

    /* renamed from: a */
    private boolean f83298a;

    /* renamed from: b */
    private boolean f83299b;

    /* renamed from: c */
    private boolean f83300c;

    /* renamed from: d */
    private boolean f83301d;

    /* renamed from: e */
    private boolean f83302e;

    /* renamed from: f */
    private boolean f83303f;

    public SettingChangedEvent() {
        this(false, false, false, false, false, false, 63, null);
    }

    /* renamed from: b */
    public final boolean mo118648b() {
        return this.f83300c;
    }

    /* renamed from: c */
    public final boolean mo118649c() {
        return this.f83301d;
    }

    /* renamed from: d */
    public final boolean mo118650d() {
        return this.f83302e;
    }

    /* renamed from: a */
    public final boolean mo118647a() {
        if (this.f83298a || this.f83299b || this.f83303f) {
            return true;
        }
        return false;
    }

    public SettingChangedEvent(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f83298a = z;
        this.f83299b = z2;
        this.f83300c = z3;
        this.f83301d = z4;
        this.f83302e = z5;
        this.f83303f = z6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SettingChangedEvent(boolean r6, boolean r7, boolean r8, boolean r9, boolean r10, boolean r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = 0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x000e
            r1 = 0
            goto L_0x000f
        L_0x000e:
            r1 = r7
        L_0x000f:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0015
            r2 = 0
            goto L_0x0016
        L_0x0015:
            r2 = r8
        L_0x0016:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001c
            r3 = 0
            goto L_0x001d
        L_0x001c:
            r3 = r9
        L_0x001d:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0023
            r4 = 0
            goto L_0x0024
        L_0x0023:
            r4 = r10
        L_0x0024:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002a
            r12 = 0
            goto L_0x002b
        L_0x002a:
            r12 = r11
        L_0x002b:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.framework.busevents.SettingChangedEvent.<init>(boolean, boolean, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
