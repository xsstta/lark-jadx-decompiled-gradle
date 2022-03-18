package com.ss.android.lark.feed.app;

import android.app.Activity;
import android.content.DialogInterface;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.suite.R;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.util.share_preference.UserSP;

/* renamed from: com.ss.android.lark.feed.app.m */
public class C37631m {
    /* renamed from: a */
    public static void m148017a(Activity activity) {
        new C25639g(activity).mo89254m(R.string.Lark_Legacy_FirstDoneDelayedFeedMessage).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_FirstDoneDelayedFeedOk, (DialogInterface.OnClickListener) null).mo89239c();
    }

    /* renamed from: a */
    public static boolean m148018a(UIFeedCard uIFeedCard) {
        if (!(uIFeedCard instanceof FeedPreview) || !((FeedPreview) uIFeedCard).isDelayed() || UserSP.getInstance().getBoolean("key_has_show_done_hint", false)) {
            return false;
        }
        UserSP.getInstance().putBoolean("key_has_show_done_hint", true);
        return true;
    }
}
