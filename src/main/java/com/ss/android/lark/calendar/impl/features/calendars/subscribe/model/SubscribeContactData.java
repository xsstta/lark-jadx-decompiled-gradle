package com.ss.android.lark.calendar.impl.features.calendars.subscribe.model;

import com.bytedance.ee.bear.document.tips.BottomDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeContactData;", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeBaseData;", "calendarId", "", "title", "subTitle", "isPrivate", "", "isMember", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "avatarKey", "getAvatarKey", "()Ljava/lang/String;", "setAvatarKey", "(Ljava/lang/String;)V", "avatarUrl", "getAvatarUrl", "setAvatarUrl", BottomDialog.f17198f, "getChatterId", "setChatterId", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.b.d */
public final class SubscribeContactData extends SubscribeBaseData {

    /* renamed from: a */
    private String f76582a;

    /* renamed from: b */
    private String f76583b;

    /* renamed from: c */
    private String f76584c;

    /* renamed from: l */
    public final String mo110457l() {
        return this.f76582a;
    }

    /* renamed from: m */
    public final String mo110458m() {
        return this.f76584c;
    }

    /* renamed from: b */
    public final void mo110454b(String str) {
        this.f76582a = str;
    }

    /* renamed from: c */
    public final void mo110455c(String str) {
        this.f76583b = str;
    }

    /* renamed from: d */
    public final void mo110456d(String str) {
        this.f76584c = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubscribeContactData(String str, String str2, String str3, boolean z, boolean z2) {
        super(str, str2, str3, z, z2);
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
    }
}
