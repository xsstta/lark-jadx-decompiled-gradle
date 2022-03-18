package com.ss.android.lark.profile.func.user_profile.infos.phone_number;

import com.ss.android.lark.profile.func.user_profile.infos.BaseInfoViewData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/infos/phone_number/PhoneNumberItemViewData;", "Lcom/ss/android/lark/profile/func/user_profile/infos/BaseInfoViewData;", "name", "", "phoneNumber", "isCompleted", "", "rateLimited", "key", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "()Z", "setCompleted", "(Z)V", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "getPhoneNumber", "setPhoneNumber", "getRateLimited", "setRateLimited", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.infos.e.c */
public final class PhoneNumberItemViewData extends BaseInfoViewData {

    /* renamed from: a */
    private String f130311a;

    /* renamed from: b */
    private boolean f130312b;

    /* renamed from: c */
    private boolean f130313c;

    /* renamed from: d */
    private String f130314d;

    /* renamed from: b */
    public final String mo179909b() {
        return this.f130311a;
    }

    /* renamed from: c */
    public final boolean mo179910c() {
        return this.f130312b;
    }

    /* renamed from: e */
    public final String mo179911e() {
        return this.f130314d;
    }

    /* renamed from: a */
    public final void mo179907a(String str) {
        this.f130311a = str;
    }

    /* renamed from: a */
    public final void mo179908a(boolean z) {
        this.f130312b = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoneNumberItemViewData(String str, String str2, boolean z, boolean z2, String str3) {
        super(str3, str);
        Intrinsics.checkParameterIsNotNull(str3, "key");
        this.f130311a = str2;
        this.f130312b = z;
        this.f130313c = z2;
        this.f130314d = str3;
    }
}
