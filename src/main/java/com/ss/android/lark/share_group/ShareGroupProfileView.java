package com.ss.android.lark.share_group;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.utils.C34336c;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.share_group.C54807b;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.ZoomInScrollView;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

public class ShareGroupProfileView implements C54807b.AbstractC54809b {

    /* renamed from: a */
    Activity f135304a;

    /* renamed from: b */
    AbstractC54802a f135305b;

    /* renamed from: c */
    C54807b.AbstractC54809b.AbstractC54810a f135306c;
    TextView mBtGroupChatJoin;
    LinearLayout mCardWrapper;
    ImageView mChatOwnerAvator;
    TextView mChatterAllCountTV;
    RelativeLayout mGroupDetailLayout;
    TextView mGroupDetailTv;
    RelativeLayout mGroupMemberLayout;
    TextView mGroupNameTV;
    ImageView mHeaderIV;
    RelativeLayout mHeaderWrapperRL;
    CommonTitleBar mTitleBar;
    ZoomInScrollView mZoomWrapperZV;

    /* renamed from: com.ss.android.lark.share_group.ShareGroupProfileView$a */
    public interface AbstractC54802a {
        /* renamed from: a */
        void mo187013a();

        /* renamed from: a */
        void mo187014a(Chatter chatter, Chat chat);

        /* renamed from: a */
        void mo187015a(ShareGroupProfileView shareGroupProfileView);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f135305b.mo187015a(this);
        m212609a();
    }

    /* renamed from: a */
    private void m212609a() {
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.share_group.$$Lambda$ShareGroupProfileView$xx86VLxE8MrBMVa3jKQMCAkVg */

            public final void onClick(View view) {
                ShareGroupProfileView.m270984lambda$xx86VLxE8MrBMVa3jKQMCAkVg(ShareGroupProfileView.this, view);
            }
        });
        this.mTitleBar.setBackgroundColor(UIHelper.getColor(R.color.lkui_transparent));
        this.mTitleBar.setDividerVisible(false);
        if (DesktopUtil.m144301a((Context) this.f135304a)) {
            ViewGroup.LayoutParams layoutParams = this.mHeaderIV.getLayoutParams();
            layoutParams.height = UIHelper.dp2px(300.0f);
            this.mHeaderIV.setLayoutParams(layoutParams);
            this.mCardWrapper.setMinimumHeight(UIHelper.dp2px(300.0f));
            this.mTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_CLOSE, R.color.static_white);
        } else {
            this.mTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_BACK, R.color.static_white);
            C29990c.m110930b().mo134533a(this.f135304a, (View) this.mTitleBar);
        }
        this.mChatOwnerAvator.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.share_group.ShareGroupProfileView.C548011 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ShareGroupProfileView.this.f135306c.mo187021a();
            }
        });
    }

    /* renamed from: a */
    public void setViewDelegate(C54807b.AbstractC54809b.AbstractC54810a aVar) {
        this.f135306c = aVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m212610a(View view) {
        this.f135306c.mo187022b();
    }

    /* renamed from: a */
    private void m212611a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mGroupDetailTv.setText(str);
        } else {
            this.mGroupDetailTv.setText(UIHelper.getString(R.string.Lark_Legacy_ShareGroupChatNoDescription));
        }
    }

    @Override // com.ss.android.lark.share_group.C54807b.AbstractC54809b
    /* renamed from: a */
    public void mo187009a(Chat chat) {
        this.mGroupNameTV.setText(chat.getName());
        TextView textView = this.mChatterAllCountTV;
        textView.setText(String.valueOf(chat.getUserCount()) + UIHelper.getString(R.string.Lark_Legacy_People));
        m212611a(chat.getDescription());
        this.mBtGroupChatJoin.setVisibility(8);
    }

    public ShareGroupProfileView(Activity activity, AbstractC54802a aVar) {
        this.f135304a = activity;
        this.f135305b = aVar;
    }

    @Override // com.ss.android.lark.share_group.C54807b.AbstractC54809b
    /* renamed from: a */
    public void mo187010a(Chat chat, Chatter chatter) {
        Scene scene = Scene.Chat;
        if (chat != null) {
            if (chat.isSecret()) {
                scene = Scene.SecretChat;
            } else if (chat.isThread()) {
                scene = Scene.Thread;
            }
        }
        C34336c.m133130a(this.f135304a, this.mChatOwnerAvator, chatter.getAvatarKey(), chatter.getId(), UIHelper.dp2px(40.0f), UIHelper.dp2px(40.0f), scene);
    }

    @Override // com.ss.android.lark.share_group.C54807b.AbstractC54809b
    /* renamed from: a */
    public void mo187011a(GroupProfileData groupProfileData, boolean z) {
        int i;
        Chat chat = groupProfileData.getChat();
        Message message = groupProfileData.getMessage();
        this.mGroupNameTV.setText(chat.getName());
        TextView textView = this.mChatterAllCountTV;
        textView.setText(String.valueOf(chat.getUserCount()) + UIHelper.getString(R.string.Lark_Legacy_People));
        m212611a(chat.getDescription());
        Activity activity = this.f135304a;
        TextView textView2 = this.mBtGroupChatJoin;
        if (z) {
            i = 4;
        } else {
            i = 2;
        }
        C54821f.m212664a(activity, textView2, (TextView) null, message, i);
        if (!z && C54821f.m212680a(message)) {
            this.mBtGroupChatJoin.setOnClickListener(null);
        }
    }
}
