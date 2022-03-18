package com.ss.android.lark.ug.common;

import com.ss.android.lark.guide.C38548a;
import com.ss.android.lark.guide.p1911a.AbstractC38549a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/ug/common/ChatOpener;", "", "()V", "guideContentText", "", "guideTitleText", "getGuideContentText", "getGuideTitleText", "openSpotlightChat", "", "chatId", "titleText", "contentText", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.common.c */
public final class ChatOpener {

    /* renamed from: a */
    public static final ChatOpener f141337a = new ChatOpener();

    /* renamed from: b */
    private static String f141338b;

    /* renamed from: c */
    private static String f141339c;

    private ChatOpener() {
    }

    /* renamed from: a */
    public final String mo194684a() {
        return f141338b;
    }

    /* renamed from: b */
    public final String mo194686b() {
        return f141339c;
    }

    /* renamed from: a */
    public final void mo194685a(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        f141338b = str2;
        f141339c = str3;
        AbstractC38549a a = C38548a.m152027a();
        Intrinsics.checkExpressionValueIsNotNull(a, "GuideModule.getDependency()");
        a.mo141263m().mo141268a(str, 3);
    }
}
