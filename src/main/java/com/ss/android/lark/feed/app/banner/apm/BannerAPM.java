package com.ss.android.lark.feed.app.banner.apm;

import com.bytedance.apm.ApmAgent;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/feed/app/banner/apm/BannerAPM;", "", "()V", "FIND_TITLE_AVATAR_FAILED", "", "sendFindTitleAvatarFailed", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.banner.a.a */
public final class BannerAPM {

    /* renamed from: a */
    public static final BannerAPM f95813a = new BannerAPM();

    private BannerAPM() {
    }

    /* renamed from: a */
    public final void mo137154a() {
        ApmAgent.monitorEvent("ug_find_title_avatar_failed", null, null, null);
    }
}
