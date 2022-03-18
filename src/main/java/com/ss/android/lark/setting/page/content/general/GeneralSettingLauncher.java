package com.ss.android.lark.setting.page.content.general;

import android.content.Context;
import android.content.Intent;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.page.content.general.feedfilter.AtFeedFilterDetailActivity;
import com.ss.android.lark.setting.page.content.general.feedfilter.FeedMessageFilterActivity;
import com.ss.android.lark.setting.page.content.general.feedfilter.FeedMessageFilterActivityV2;
import com.ss.android.lark.setting.page.content.general.feedfilter.FeedMessageFilterSortFragment;
import com.ss.android.lark.setting.page.content.general.wheniviewachat.WhenIViewAChatActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/GeneralSettingLauncher;", "", "()V", "KEY_HIGHLIGHTED_FILTER", "", "openAtFeedDetailPage", "", "context", "Landroid/content/Context;", "openFeedFilterSortPage", "highlightedFilter", "", "openFeedMessageFilterPage", "openWhenIViewAChatPage", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.general.d */
public final class GeneralSettingLauncher {

    /* renamed from: a */
    public static final GeneralSettingLauncher f134644a = new GeneralSettingLauncher();

    private GeneralSettingLauncher() {
    }

    /* renamed from: b */
    public final void mo186112b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        context.startActivity(new Intent(context, WhenIViewAChatActivity.class));
    }

    /* renamed from: a */
    public final void mo186110a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intent intent = new Intent(context, AtFeedFilterDetailActivity.class);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public final void mo186111a(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (C54115c.m210080a().mo178288c("lark.feed.setting_filter_only_at_me") || C54115c.m210080a().mo178273I()) {
            Intent intent = new Intent(context, FeedMessageFilterActivityV2.class);
            intent.setFlags(268435456);
            intent.putExtra("HIGHLIGHTED_FILTER", i);
            context.startActivity(intent);
            return;
        }
        mo186113b(context, i);
    }

    /* renamed from: b */
    public final void mo186113b(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (DesktopUtil.m144307b()) {
            C36512a.m144041a().mo134762a(new FeedMessageFilterSortFragment(), new FloatWindowParams.C36567a().mo134930b());
            return;
        }
        Intent intent = new Intent(context, FeedMessageFilterActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("HIGHLIGHTED_FILTER", i);
        context.startActivity(intent);
    }
}
