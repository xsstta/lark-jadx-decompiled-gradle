package com.ss.android.lark.mail.impl.widget.time.multitimezone;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\bJ\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bJ\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneItemData;", "", "timezoneId", "", "timezoneName", "timezoneOffset", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "cityNames", "Ljava/util/ArrayList;", "isSelected", "", "isSwiped", "()Z", "setSwiped", "(Z)V", "getTimezoneId", "()Ljava/lang/String;", "getTimezoneName", "getTimezoneOffset", "getCityNames", "setCityNames", "", "setIsSelected", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.i */
public final class TimeZoneItemData {

    /* renamed from: a */
    private boolean f112037a;

    /* renamed from: b */
    private ArrayList<String> f112038b = new ArrayList<>();

    /* renamed from: c */
    private final String f112039c;

    /* renamed from: d */
    private final String f112040d;

    /* renamed from: e */
    private final String f112041e;

    /* renamed from: b */
    public final ArrayList<String> mo157045b() {
        return this.f112038b;
    }

    /* renamed from: c */
    public final String mo157046c() {
        return this.f112039c;
    }

    /* renamed from: d */
    public final String mo157047d() {
        return this.f112040d;
    }

    /* renamed from: e */
    public final String mo157048e() {
        return this.f112041e;
    }

    /* renamed from: a */
    public final boolean mo157044a() {
        return this.f112037a;
    }

    /* renamed from: a */
    public final void mo157043a(boolean z) {
        this.f112037a = z;
    }

    /* renamed from: a */
    public final void mo157042a(ArrayList<String> arrayList) {
        if (arrayList != null) {
            this.f112038b.clear();
            this.f112038b.addAll(arrayList);
        }
    }

    public TimeZoneItemData(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "timezoneId");
        Intrinsics.checkParameterIsNotNull(str2, "timezoneName");
        Intrinsics.checkParameterIsNotNull(str3, "timezoneOffset");
        this.f112039c = str;
        this.f112040d = str2;
        this.f112041e = str3;
    }
}
