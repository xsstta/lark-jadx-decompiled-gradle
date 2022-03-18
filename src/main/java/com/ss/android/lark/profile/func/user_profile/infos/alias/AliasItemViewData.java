package com.ss.android.lark.profile.func.user_profile.infos.alias;

import com.ss.android.lark.profile.func.user_profile.base.TextStyle;
import com.ss.android.lark.profile.func.user_profile.infos.BaseInfoViewData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/infos/alias/AliasItemViewData;", "Lcom/ss/android/lark/profile/func/user_profile/infos/BaseInfoViewData;", "key", "", "typeName", "aliasName", "textStyle", "Lcom/ss/android/lark/profile/func/user_profile/base/TextStyle;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/profile/func/user_profile/base/TextStyle;)V", "getAliasName", "()Ljava/lang/String;", "setAliasName", "(Ljava/lang/String;)V", "getTextStyle", "()Lcom/ss/android/lark/profile/func/user_profile/base/TextStyle;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.infos.a.b */
public final class AliasItemViewData extends BaseInfoViewData {

    /* renamed from: a */
    private String f130250a;

    /* renamed from: b */
    private final TextStyle f130251b;

    /* renamed from: b */
    public final String mo179854b() {
        return this.f130250a;
    }

    /* renamed from: c */
    public final TextStyle mo179855c() {
        return this.f130251b;
    }

    /* renamed from: a */
    public final void mo179853a(String str) {
        this.f130250a = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AliasItemViewData(String str, String str2, String str3, TextStyle eVar) {
        super(str, str2);
        Intrinsics.checkParameterIsNotNull(str, "key");
        this.f130250a = str3;
        this.f130251b = eVar;
    }
}
