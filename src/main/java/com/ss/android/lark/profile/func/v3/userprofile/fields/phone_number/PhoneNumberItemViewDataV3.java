package com.ss.android.lark.profile.func.v3.userprofile.fields.phone_number;

import com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseInfoViewDataV3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/phone_number/PhoneNumberItemViewDataV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseInfoViewDataV3;", "name", "", "phoneNumber", "isCompleted", "", "rateLimited", "key", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "()Z", "setCompleted", "(Z)V", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "getPhoneNumber", "setPhoneNumber", "getRateLimited", "setRateLimited", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.i.c */
public final class PhoneNumberItemViewDataV3 extends BaseInfoViewDataV3 {

    /* renamed from: a */
    private String f130572a;

    /* renamed from: b */
    private boolean f130573b;

    /* renamed from: c */
    private boolean f130574c;

    /* renamed from: d */
    private String f130575d;

    /* renamed from: a */
    public final String mo180327a() {
        return this.f130572a;
    }

    /* renamed from: b */
    public final boolean mo180330b() {
        return this.f130573b;
    }

    /* renamed from: e */
    public final String mo180331e() {
        return this.f130575d;
    }

    /* renamed from: a */
    public final void mo180328a(String str) {
        this.f130572a = str;
    }

    /* renamed from: a */
    public final void mo180329a(boolean z) {
        this.f130573b = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoneNumberItemViewDataV3(String str, String str2, boolean z, boolean z2, String str3) {
        super(str3, str);
        Intrinsics.checkParameterIsNotNull(str3, "key");
        this.f130572a = str2;
        this.f130573b = z;
        this.f130574c = z2;
        this.f130575d = str3;
    }
}
