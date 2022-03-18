package com.ss.android.lark.chatwindow.view.viewholder;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.base.view.AbstractC32939b;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.widget.EllipsizeFrameLayout;
import com.ss.android.lark.widget.richtext.RichTextView;

public class TextMessageContentHolder extends RecyclerView.ViewHolder implements AbstractC32939b {

    /* renamed from: a */
    LinearLayout f91305a;

    /* renamed from: b */
    View f91306b;

    /* renamed from: c */
    TextView f91307c;

    /* renamed from: d */
    TextView f91308d;
    @BindView(7603)
    ViewGroup docCardContainer;

    /* renamed from: e */
    ImageView f91309e;

    /* renamed from: f */
    View f91310f;

    /* renamed from: g */
    ImageView f91311g;
    @BindView(7595)
    public Group mDividerGroup;
    @BindView(8189)
    public EllipsizeFrameLayout mMessageContaner;
    @BindView(8191)
    public Group mMessageGroup;
    @BindView(8188)
    public RichTextView mMessageTV;
    @BindView(8871)
    public View mPreviewLayout;
    @BindView(8599)
    public ConstraintLayout mRootView;
    @BindView(8135)
    public View mShowMoreMask;
    @BindView(9148)
    public TextView mShowMoreTV;
    @BindView(9065)
    public View mTranslateDivider;
    @BindView(9069)
    public Group mTranslateGroup;
    @BindView(9068)
    public TextView mTranslateLabel;
    @BindView(9072)
    public RichTextView mTranslateMessageTV;
    @BindView(9070)
    public View mTranslateShowMoreMask;
    @BindView(9081)
    public TextView mTranslateShowMoreTV;
    @BindView(9228)
    ViewGroup mUrlNetPreviewCardContainer;
    @BindView(9229)
    ViewGroup mUrlNetPreviewMarginContainer;
    @BindView(9231)
    ViewStub mUrlPreviewStub;

    @Override // com.ss.android.lark.chat.base.view.AbstractC32939b
    /* renamed from: f */
    public int mo121631f() {
        return 30;
    }

    @Override // com.ss.android.lark.chat.base.view.AbstractC32939b
    /* renamed from: a */
    public ViewGroup mo121626a() {
        return this.docCardContainer;
    }

    @Override // com.ss.android.lark.chat.base.view.AbstractC32939b
    /* renamed from: b */
    public ViewGroup mo121627b() {
        return this.mUrlNetPreviewCardContainer;
    }

    @Override // com.ss.android.lark.chat.base.view.AbstractC32939b
    /* renamed from: c */
    public ViewGroup mo121628c() {
        return this.mUrlNetPreviewMarginContainer;
    }

    @Override // com.ss.android.lark.chat.base.view.AbstractC32939b
    /* renamed from: d */
    public ViewGroup mo121629d() {
        return this.f91305a;
    }

    @Override // com.ss.android.lark.chat.base.view.AbstractC32939b
    /* renamed from: g */
    public LarkFont mo121632g() {
        return LarkFont.BODY1;
    }

    @Override // com.ss.android.lark.chat.base.view.AbstractC32939b
    /* renamed from: h */
    public LarkFont mo121633h() {
        return LarkFont.BODY1;
    }

    @Override // com.ss.android.lark.chat.base.view.AbstractC32939b
    /* renamed from: e */
    public ViewGroup mo121630e() {
        if (this.f91305a == null) {
            View inflate = this.mUrlPreviewStub.inflate();
            this.f91305a = (LinearLayout) inflate.findViewById(R.id.url_preview_layout);
            this.f91306b = inflate.findViewById(R.id.divider_preview);
            this.f91307c = (TextView) inflate.findViewById(R.id.url_title);
            this.f91308d = (TextView) inflate.findViewById(R.id.url_description);
            this.f91309e = (ImageView) inflate.findViewById(R.id.url_icon);
            this.f91310f = inflate.findViewById(R.id.play_video);
            this.f91311g = (ImageView) inflate.findViewById(R.id.video_preview);
            if (!DesktopUtil.m144307b()) {
                C25649b.m91853a(this.f91309e, 30);
                C25649b.m91857a(this.f91307c, LarkFont.BODY1);
                C25649b.m91857a(this.f91308d, LarkFont.BODY1);
            }
        }
        return this.f91305a;
    }
}
