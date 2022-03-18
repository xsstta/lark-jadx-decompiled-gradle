package com.ss.android.lark.feed.app.guide;

import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/feed/app/guide/TenantSwitchGuideAgent;", "", "()V", "isTenantSwitchGuidanceV3FgEnable", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.guide.d */
public final class TenantSwitchGuideAgent {

    /* renamed from: a */
    public static final TenantSwitchGuideAgent f96449a = new TenantSwitchGuideAgent();

    private TenantSwitchGuideAgent() {
    }

    /* renamed from: a */
    public final boolean mo137998a() {
        AbstractC38037a a = C37262a.m146726a();
        Intrinsics.checkExpressionValueIsNotNull(a, "FeedModule.getDependency()");
        return a.mo139198q().mo139256a("ug.guide.teamswitch");
    }
}
