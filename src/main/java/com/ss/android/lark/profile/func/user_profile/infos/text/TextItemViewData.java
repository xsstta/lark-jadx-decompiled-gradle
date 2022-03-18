package com.ss.android.lark.profile.func.user_profile.infos.text;

import com.ss.android.lark.profile.func.user_profile.base.TextStyle;
import com.ss.android.lark.profile.func.user_profile.infos.BaseInfoViewData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/infos/text/TextItemViewData;", "Lcom/ss/android/lark/profile/func/user_profile/infos/BaseInfoViewData;", "id", "", "name", "value", "textStyle", "Lcom/ss/android/lark/profile/func/user_profile/base/TextStyle;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/profile/func/user_profile/base/TextStyle;)V", "getTextStyle", "()Lcom/ss/android/lark/profile/func/user_profile/base/TextStyle;", "getValue", "()Ljava/lang/String;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.infos.g.c */
public final class TextItemViewData extends BaseInfoViewData {

    /* renamed from: a */
    private final String f130331a;

    /* renamed from: b */
    private final TextStyle f130332b;

    /* renamed from: b */
    public final String mo179928b() {
        return this.f130331a;
    }

    /* renamed from: c */
    public final TextStyle mo179929c() {
        return this.f130332b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextItemViewData(String str, String str2, String str3, TextStyle eVar) {
        super(str, str2);
        Intrinsics.checkParameterIsNotNull(str, "id");
        this.f130331a = str3;
        this.f130332b = eVar;
    }
}
