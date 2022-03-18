package com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.calendar.impl.framework.viewmodel.DataStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/LoadStatus;", "", UpdateKey.STATUS, "", "isEnd", "", "isFirst", "(IZZ)V", "()Z", "getStatus", "()I", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.b.j */
public final class LoadStatus {

    /* renamed from: a */
    private final int f75653a;

    /* renamed from: b */
    private final boolean f75654b;

    /* renamed from: c */
    private final boolean f75655c;

    /* renamed from: a */
    public final int mo109241a() {
        return this.f75653a;
    }

    /* renamed from: b */
    public final boolean mo109242b() {
        return this.f75654b;
    }

    /* renamed from: c */
    public final boolean mo109243c() {
        return this.f75655c;
    }

    public LoadStatus(@DataStatus int i, boolean z, boolean z2) {
        this.f75653a = i;
        this.f75654b = z;
        this.f75655c = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoadStatus(int i, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2);
    }
}
