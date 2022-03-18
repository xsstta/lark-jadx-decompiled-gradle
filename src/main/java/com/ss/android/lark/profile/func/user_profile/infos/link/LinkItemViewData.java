package com.ss.android.lark.profile.func.user_profile.infos.link;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.profile.func.user_profile.base.TextStyle;
import com.ss.android.lark.profile.func.user_profile.infos.BaseInfoViewData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/infos/link/LinkItemViewData;", "Lcom/ss/android/lark/profile/func/user_profile/infos/BaseInfoViewData;", "id", "", "name", "key", ShareHitPoint.f121869d, "value", "url", "textStyle", "Lcom/ss/android/lark/profile/func/user_profile/base/TextStyle;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/profile/func/user_profile/base/TextStyle;)V", "getKey", "()Ljava/lang/String;", "getTextStyle", "()Lcom/ss/android/lark/profile/func/user_profile/base/TextStyle;", "getType", "getUrl", "getValue", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.infos.b.c */
public final class LinkItemViewData extends BaseInfoViewData {

    /* renamed from: a */
    private final String f130261a;

    /* renamed from: b */
    private final String f130262b;

    /* renamed from: c */
    private final String f130263c;

    /* renamed from: d */
    private final String f130264d;

    /* renamed from: e */
    private final TextStyle f130265e;

    /* renamed from: b */
    public final String mo179862b() {
        return this.f130261a;
    }

    /* renamed from: c */
    public final String mo179863c() {
        return this.f130262b;
    }

    /* renamed from: e */
    public final String mo179864e() {
        return this.f130263c;
    }

    /* renamed from: f */
    public final String mo179865f() {
        return this.f130264d;
    }

    /* renamed from: g */
    public final TextStyle mo179866g() {
        return this.f130265e;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinkItemViewData(String str, String str2, String str3, String str4, String str5, String str6, TextStyle eVar) {
        super(str, str2);
        Intrinsics.checkParameterIsNotNull(str, "id");
        this.f130261a = str3;
        this.f130262b = str4;
        this.f130263c = str5;
        this.f130264d = str6;
        this.f130265e = eVar;
    }
}
