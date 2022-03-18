package com.ss.android.lark.share.impl.systemshare.mvp;

import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.share.impl.systemshare.widget.AdaptiveMaxHeightScrollView;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;

public class ShareContentView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ShareContentView f135254a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ShareContentView shareContentView = this.f135254a;
        if (shareContentView != null) {
            this.f135254a = null;
            shareContentView.mTitleBar = null;
            shareContentView.mAdaptiveMaxHeightScrollView = null;
            shareContentView.mShareTextTV = null;
            shareContentView.mShareImageGV = null;
            shareContentView.mShareImageIV = null;
            shareContentView.mShareToMyself = null;
            shareContentView.mShareToChat = null;
            shareContentView.mShareToTouTiaoQuan = null;
            shareContentView.mRootView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ShareContentView_ViewBinding(ShareContentView shareContentView, View view) {
        this.f135254a = shareContentView;
        shareContentView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        shareContentView.mAdaptiveMaxHeightScrollView = (AdaptiveMaxHeightScrollView) Utils.findRequiredViewAsType(view, R.id.share_text_sv, "field 'mAdaptiveMaxHeightScrollView'", AdaptiveMaxHeightScrollView.class);
        shareContentView.mShareTextTV = (LinkEmojiTextView) Utils.findRequiredViewAsType(view, R.id.share_text_tv, "field 'mShareTextTV'", LinkEmojiTextView.class);
        shareContentView.mShareImageGV = (GridView) Utils.findRequiredViewAsType(view, R.id.share_image_gv, "field 'mShareImageGV'", GridView.class);
        shareContentView.mShareImageIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.share_image_iv, "field 'mShareImageIV'", ImageView.class);
        shareContentView.mShareToMyself = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.share_to_myself, "field 'mShareToMyself'", LinearLayout.class);
        shareContentView.mShareToChat = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.share_to_chat, "field 'mShareToChat'", LinearLayout.class);
        shareContentView.mShareToTouTiaoQuan = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.share_to_toutiaoquan, "field 'mShareToTouTiaoQuan'", LinearLayout.class);
        shareContentView.mRootView = Utils.findRequiredView(view, R.id.root, "field 'mRootView'");
    }
}
