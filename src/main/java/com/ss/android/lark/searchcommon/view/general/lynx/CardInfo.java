package com.ss.android.lark.searchcommon.view.general.lynx;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/general/lynx/CardInfo;", "", "templateName", "", "baseUrl", "channel", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBaseUrl", "()Ljava/lang/String;", "getChannel", "getTemplateName", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.general.lynx.b */
public final class CardInfo {

    /* renamed from: a */
    private final String f133780a;

    /* renamed from: b */
    private final String f133781b;

    /* renamed from: c */
    private final String f133782c;

    /* renamed from: a */
    public final String mo184967a() {
        return this.f133780a;
    }

    /* renamed from: b */
    public final String mo184968b() {
        return this.f133781b;
    }

    /* renamed from: c */
    public final String mo184969c() {
        return this.f133782c;
    }

    public CardInfo(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "templateName");
        Intrinsics.checkParameterIsNotNull(str2, "baseUrl");
        Intrinsics.checkParameterIsNotNull(str3, "channel");
        this.f133780a = str;
        this.f133781b = str2;
        this.f133782c = str3;
    }
}
