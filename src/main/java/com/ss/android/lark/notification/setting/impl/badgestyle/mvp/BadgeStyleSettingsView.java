package com.ss.android.lark.notification.setting.impl.badgestyle.mvp;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.notification.C48398a;
import com.ss.android.lark.notification.setting.impl.badgestyle.mvp.C48587b;
import com.ss.android.lark.notification.setting.impl.badgestyle.mvp.C48592c;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;

public class BadgeStyleSettingsView implements C48592c.AbstractC48595b {

    /* renamed from: a */
    C48592c.AbstractC48595b.AbstractC48596a f122227a;

    /* renamed from: b */
    C48587b.AbstractC48591a f122228b;

    /* renamed from: c */
    Activity f122229c;
    @BindView(6923)
    ImageView hideIconView;
    @BindView(7242)
    View mBadgeStyleTitle;
    @BindView(6921)
    View mHideBadgeLayout;
    @BindView(6922)
    UDCheckBox mHideBadgeSelector;
    @BindView(7252)
    View mNavMuteBadgeGrayView;
    @BindView(7253)
    View mNavMuteBadgeRedView;
    @BindView(7248)
    View mNavMuteBadgeTitle;
    @BindView(7586)
    View mShowBadgeLayout;
    @BindView(7587)
    UDCheckBox mShowBadgeSelector;
    @BindView(7645)
    View mStrongRemindLayout;
    @BindView(7649)
    UDCheckBox mStrongRemindSelector;
    @BindView(7746)
    CommonTitleBar mTitleBar;
    @BindView(7934)
    View mWeakRemindLayout;
    @BindView(7938)
    UDCheckBox mWeakRemindSelector;
    @BindView(7589)
    ImageView showIconView;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: a */
    private void m191522a() {
        m191524b();
        m191529d();
    }

    /* renamed from: c */
    private boolean m191528c() {
        return C48398a.m190922a().mo169352o().mo169386a("setting_navigation_mute_badge");
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f122228b.mo169678a(this);
        m191522a();
    }

    /* renamed from: d */
    private void m191529d() {
        if (DesktopUtil.m144301a((Context) this.f122229c)) {
            DesktopUtil.m144299a((TextView) this.mWeakRemindLayout.findViewById(R.id.weak_remind_title), (TextView) this.mWeakRemindLayout.findViewById(R.id.weak_remind_preview_title), (TextView) this.mStrongRemindLayout.findViewById(R.id.strong_remind_title), (TextView) this.mStrongRemindLayout.findViewById(R.id.strong_remind_preview_title));
            DesktopUtil.m144306b((TextView) this.mWeakRemindLayout.findViewById(R.id.weak_remind_preview_content), (TextView) this.mStrongRemindLayout.findViewById(R.id.strong_remind_preview_content));
        }
    }

    /* renamed from: b */
    private void m191524b() {
        this.mWeakRemindLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.notification.setting.impl.badgestyle.mvp.$$Lambda$BadgeStyleSettingsView$i05t7Mwwdf03Y8V7TNGCXTXJ94 */

            public final void onClick(View view) {
                BadgeStyleSettingsView.this.m191530d(view);
            }
        });
        this.mStrongRemindLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.notification.setting.impl.badgestyle.mvp.$$Lambda$BadgeStyleSettingsView$iZFrSqpbndYrcSSN5_OlOy2iEE */

            public final void onClick(View view) {
                BadgeStyleSettingsView.this.m191526c((BadgeStyleSettingsView) view);
            }
        });
        this.mShowBadgeLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.notification.setting.impl.badgestyle.mvp.$$Lambda$BadgeStyleSettingsView$mDCCKkoKPB2laXZdxWPQ2d00Q8 */

            public final void onClick(View view) {
                BadgeStyleSettingsView.this.m191525b((BadgeStyleSettingsView) view);
            }
        });
        this.mHideBadgeLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.notification.setting.impl.badgestyle.mvp.$$Lambda$BadgeStyleSettingsView$d73qT0Gt3B0BYscbC1nbL6y5hE */

            public final void onClick(View view) {
                BadgeStyleSettingsView.this.m191523a((BadgeStyleSettingsView) view);
            }
        });
        this.mStrongRemindSelector.setClickable(false);
        this.mStrongRemindSelector.setEnabled(true);
        this.mWeakRemindSelector.setEnabled(true);
        this.mWeakRemindSelector.setClickable(false);
        this.mShowBadgeSelector.setClickable(false);
        this.mShowBadgeSelector.setEnabled(true);
        this.mHideBadgeSelector.setClickable(false);
        this.mHideBadgeSelector.setEnabled(true);
        ImageView imageView = this.showIconView;
        Activity activity = this.f122229c;
        imageView.setImageDrawable(UDIconUtils.getIconDrawable(activity, (int) R.drawable.ud_icon_tab_chat_filled, activity.getResources().getColor(R.color.icon_n3)));
        ImageView imageView2 = this.hideIconView;
        Activity activity2 = this.f122229c;
        imageView2.setImageDrawable(UDIconUtils.getIconDrawable(activity2, (int) R.drawable.ud_icon_tab_chat_filled, activity2.getResources().getColor(R.color.icon_n3)));
        if (!m191528c()) {
            this.mHideBadgeLayout.setVisibility(8);
            this.mShowBadgeLayout.setVisibility(8);
            this.mNavMuteBadgeTitle.setVisibility(8);
            this.mBadgeStyleTitle.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void setViewDelegate(C48592c.AbstractC48595b.AbstractC48596a aVar) {
        this.f122227a = aVar;
    }

    @Override // com.ss.android.lark.notification.setting.impl.badgestyle.mvp.C48592c.AbstractC48595b
    /* renamed from: a */
    public void mo169687a(String str) {
        C48587b.AbstractC48591a aVar = this.f122228b;
        if (aVar != null) {
            aVar.mo169679a(false, str);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m191523a(View view) {
        if (!this.mHideBadgeSelector.isChecked()) {
            mo169689b(false);
            this.f122227a.mo169698b(false);
            mo169687a(UIHelper.getString(R.string.Lark_Settings_BadgeStyleChangeSuccess));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m191525b(View view) {
        if (!this.mShowBadgeSelector.isChecked()) {
            mo169689b(true);
            this.f122227a.mo169698b(true);
            mo169687a(UIHelper.getString(R.string.Lark_Settings_BadgeStyleChangeSuccess));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m191526c(View view) {
        this.mWeakRemindSelector.setChecked(false);
        this.mStrongRemindSelector.setChecked(true);
        this.f122227a.mo169697a(true);
        mo169687a(UIHelper.getString(R.string.Lark_Settings_BadgeStyleChangeSuccess));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m191530d(View view) {
        this.mWeakRemindSelector.setChecked(true);
        this.mStrongRemindSelector.setChecked(false);
        this.f122227a.mo169697a(false);
        mo169687a(UIHelper.getString(R.string.Lark_Settings_BadgeStyleChangeSuccess));
    }

    /* renamed from: c */
    private void m191527c(boolean z) {
        int i;
        if (m191528c()) {
            View view = this.mNavMuteBadgeRedView;
            int i2 = 0;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            View view2 = this.mNavMuteBadgeGrayView;
            if (z) {
                i2 = 8;
            }
            view2.setVisibility(i2);
        }
    }

    @Override // com.ss.android.lark.notification.setting.impl.badgestyle.mvp.C48592c.AbstractC48595b
    /* renamed from: a */
    public void mo169688a(boolean z) {
        if (z) {
            this.mStrongRemindSelector.setChecked(true);
            this.mWeakRemindSelector.setChecked(false);
        } else {
            this.mStrongRemindSelector.setChecked(false);
            this.mWeakRemindSelector.setChecked(true);
        }
        m191527c(z);
    }

    @Override // com.ss.android.lark.notification.setting.impl.badgestyle.mvp.C48592c.AbstractC48595b
    /* renamed from: b */
    public void mo169689b(boolean z) {
        if (m191528c()) {
            this.mShowBadgeSelector.setChecked(z);
            this.mHideBadgeSelector.setChecked(!z);
        }
    }

    public BadgeStyleSettingsView(Activity activity, C48587b.AbstractC48591a aVar) {
        this.f122228b = aVar;
        this.f122229c = activity;
    }
}
