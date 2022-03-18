package com.ss.android.lark.profile.func.v3.userprofile.fields.link;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.profile.func.user_profile.base.TextStyle;
import com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseInfoViewDataV3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/link/LinkItemViewDataV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseInfoViewDataV3;", "id", "", "name", "key", ShareHitPoint.f121869d, "value", "url", "textStyle", "Lcom/ss/android/lark/profile/func/user_profile/base/TextStyle;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/profile/func/user_profile/base/TextStyle;)V", "getKey", "()Ljava/lang/String;", "getTextStyle", "()Lcom/ss/android/lark/profile/func/user_profile/base/TextStyle;", "getType", "getUrl", "getValue", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.f.c */
public final class LinkItemViewDataV3 extends BaseInfoViewDataV3 {

    /* renamed from: a */
    private final String f130519a;

    /* renamed from: b */
    private final String f130520b;

    /* renamed from: c */
    private final String f130521c;

    /* renamed from: d */
    private final String f130522d;

    /* renamed from: e */
    private final TextStyle f130523e;

    /* renamed from: a */
    public final String mo180274a() {
        return this.f130519a;
    }

    /* renamed from: b */
    public final String mo180275b() {
        return this.f130521c;
    }

    /* renamed from: e */
    public final String mo180276e() {
        return this.f130522d;
    }

    /* renamed from: f */
    public final TextStyle mo180277f() {
        return this.f130523e;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinkItemViewDataV3(String str, String str2, String str3, String str4, String str5, String str6, TextStyle eVar) {
        super(str, str2);
        Intrinsics.checkParameterIsNotNull(str, "id");
        this.f130519a = str3;
        this.f130520b = str4;
        this.f130521c = str5;
        this.f130522d = str6;
        this.f130523e = eVar;
    }
}
