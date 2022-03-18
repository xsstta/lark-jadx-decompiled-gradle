package com.ss.android.lark.main.app.widgets.desktop.avatar;

import android.content.Context;
import android.view.View;
import butterknife.BindView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.app.widgets.desktop.avatar.C44434a;
import com.ss.android.lark.utils.UIHelper;

public class MainAvatarView implements C44434a.AbstractC44437b {

    /* renamed from: a */
    private Context f112758a;

    /* renamed from: b */
    private AbstractC44433a f112759b;

    /* renamed from: c */
    private int f112760c;
    @BindView(6667)
    LKUIRoundedImageView mAvatar;
    @BindView(7948)
    View mUpdateTipView;
    @BindView(6709)
    View mZenModeTipView;

    /* renamed from: com.ss.android.lark.main.app.widgets.desktop.avatar.MainAvatarView$a */
    public interface AbstractC44433a {
        /* renamed from: a */
        void mo157825a(MainAvatarView mainAvatarView);
    }

    /* renamed from: a */
    public void setViewDelegate(C44434a.AbstractC44437b.AbstractC44438a aVar) {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        AbstractC44433a aVar = this.f112759b;
        if (aVar != null) {
            aVar.mo157825a(this);
        }
    }

    /* renamed from: a */
    private void m176348a() {
        this.f112760c |= 1;
        m176352e();
    }

    /* renamed from: b */
    private void m176349b() {
        this.f112760c |= 2;
        m176352e();
    }

    /* renamed from: c */
    private void m176350c() {
        this.f112760c &= -3;
        m176352e();
    }

    /* renamed from: d */
    private void m176351d() {
        this.f112760c &= -2;
        m176352e();
    }

    /* renamed from: e */
    private void m176352e() {
        int i = this.f112760c;
        if ((i & 2) == 2) {
            this.mZenModeTipView.setVisibility(0);
            this.mUpdateTipView.setVisibility(8);
        } else if ((i & 1) == 1) {
            this.mUpdateTipView.setVisibility(0);
            this.mZenModeTipView.setVisibility(8);
        } else {
            this.mUpdateTipView.setVisibility(8);
            this.mZenModeTipView.setVisibility(8);
        }
    }

    @Override // com.ss.android.lark.main.app.widgets.desktop.avatar.C44434a.AbstractC44437b
    /* renamed from: b */
    public void mo157829b(boolean z) {
        if (z) {
            m176349b();
        } else {
            m176350c();
        }
    }

    @Override // com.ss.android.lark.main.app.widgets.desktop.avatar.C44434a.AbstractC44437b
    /* renamed from: a */
    public void mo157828a(boolean z) {
        if (z) {
            m176348a();
        } else {
            m176351d();
        }
    }

    public MainAvatarView(Context context, AbstractC44433a aVar) {
        this.f112758a = context;
        this.f112759b = aVar;
    }

    @Override // com.ss.android.lark.main.app.widgets.desktop.avatar.C44434a.AbstractC44437b
    /* renamed from: a */
    public void mo157827a(String str, String str2) {
        C44134a.m174959a().mo133231b().mo133271a(this.f112758a, str, str2, this.mAvatar, UIHelper.dp2px(32.0f), UIHelper.dp2px(32.0f));
    }
}
