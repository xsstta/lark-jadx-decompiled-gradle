package com.ss.android.lark.calendar.impl.features.calendars.subscribe.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeMeetingRoomData;", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeBaseData;", "calendarId", "", "title", "subTitle", "isPrivate", "", "isMember", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "capacity", "getCapacity", "()Ljava/lang/String;", "setCapacity", "(Ljava/lang/String;)V", "isDisabled", "()Z", "setDisabled", "(Z)V", "isShowApprovalLabel", "setShowApprovalLabel", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.b.e */
public final class SubscribeMeetingRoomData extends SubscribeBaseData {

    /* renamed from: a */
    private String f76585a;

    /* renamed from: b */
    private boolean f76586b;

    /* renamed from: c */
    private boolean f76587c;

    /* renamed from: l */
    public final String mo110462l() {
        return this.f76585a;
    }

    /* renamed from: m */
    public final boolean mo110463m() {
        return this.f76586b;
    }

    /* renamed from: n */
    public final boolean mo110464n() {
        return this.f76587c;
    }

    /* renamed from: b */
    public final void mo110459b(String str) {
        this.f76585a = str;
    }

    /* renamed from: g */
    public final void mo110460g(boolean z) {
        this.f76586b = z;
    }

    /* renamed from: h */
    public final void mo110461h(boolean z) {
        this.f76587c = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubscribeMeetingRoomData(String str, String str2, String str3, boolean z, boolean z2) {
        super(str, str2, str3, z, z2);
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
    }
}
