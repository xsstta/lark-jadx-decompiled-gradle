package com.ss.android.lark.setting.page.v2;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.export.AbstractC54125a;
import com.ss.android.lark.setting.export.C54127c;
import com.ss.android.lark.setting.export.ComponentManager;
import com.ss.android.lark.setting.page.content.common.C54154b;
import com.ss.android.lark.setting.page.content.general.C54435b;
import com.ss.android.lark.setting.page.content.internal.C54533a;
import com.ss.android.lark.setting.page.content.logout.NewLogoutComponent;
import com.ss.android.lark.setting.page.content.p2659a.C54135a;
import com.ss.android.lark.setting.page.statistics.SettingHitPoint;
import com.ss.android.lark.setting.page.v2.AbstractC54591a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;

public class MineSystemSettingView2 implements AbstractC54591a.AbstractC54593b {

    /* renamed from: a */
    private AbstractC54591a.AbstractC54593b.AbstractC54594a f134913a;

    /* renamed from: b */
    private final Activity f134914b;

    /* renamed from: c */
    private final ComponentManager f134915c;

    /* renamed from: d */
    private final AbstractC54590a f134916d;

    /* renamed from: e */
    private View f134917e;
    LinearLayout mContainer;
    ScrollView mScrollView;
    public CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.setting.page.v2.MineSystemSettingView2$a */
    public interface AbstractC54590a {
        /* renamed from: a */
        void mo186506a(AbstractC54591a.AbstractC54593b bVar);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.setting.page.v2.AbstractC54591a.AbstractC54593b
    /* renamed from: a */
    public void mo186501a() {
        this.f134915c.aA_();
    }

    @Override // com.ss.android.lark.setting.page.v2.AbstractC54591a.AbstractC54593b
    /* renamed from: b */
    public void mo186503b() {
        this.f134915c.mo132391a();
    }

    @Override // com.ss.android.lark.setting.page.v2.AbstractC54591a.AbstractC54593b
    /* renamed from: c */
    public void mo186504c() {
        this.f134915c.mo132399g();
    }

    @Override // com.ss.android.lark.setting.page.v2.AbstractC54591a.AbstractC54593b
    /* renamed from: d */
    public void mo186505d() {
        this.f134915c.mo132397e();
        this.mContainer.removeAllViews();
    }

    /* renamed from: f */
    private void m211784f() {
        List<AbstractC54125a> a = C54115c.m210080a().mo178276a(this.f134914b);
        a.addAll(m211785g());
        m211782a(a);
    }

    /* renamed from: g */
    private List<AbstractC54125a> m211785g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C54435b(this.f134914b));
        arrayList.add(new C54135a(this.f134914b, 16));
        arrayList.add(new C54533a(this.f134914b));
        arrayList.add(new C54154b(this.f134914b));
        arrayList.add(new NewLogoutComponent(this.f134914b));
        return arrayList;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f134916d.mo186506a(this);
        m211783e();
        m211784f();
        this.f134915c.mo185299a(C54600e.m211803a());
        this.f134915c.mo132396d();
        this.mContainer.addView(this.f134915c.mo185297a(this.f134914b));
        SettingHitPoint.m211618a();
    }

    /* renamed from: e */
    private void m211783e() {
        if (DesktopUtil.m144301a((Context) this.f134914b)) {
            this.mTitleBar.setLeftVisible(true);
            this.mTitleBar.getLeftText().setText(R.string.Lark_Legacy_SystemSetting);
            this.mTitleBar.getLeftText().setTextColor(UIHelper.getColor(R.color.text_title));
            this.mTitleBar.getLeftText().setTextSize((float) CommonTitleBarConstants.DEFAULT_MAIN_TEXT_SIZE);
            this.mTitleBar.setLeftImageDrawable(null);
            this.mTitleBar.getCenterLayout().setVisibility(8);
            this.mTitleBar.setLeftClickListener(null);
            this.mTitleBar.setBackgroundColor(UIHelper.getColor(R.color.bg_body));
            this.mTitleBar.setLeftTextPadding(16, 12, 0, 12);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mScrollView.getLayoutParams();
            marginLayoutParams.setMargins(0, UIHelper.dp2px((float) 8), 0, 0);
            this.mScrollView.setLayoutParams(marginLayoutParams);
            return;
        }
        this.mTitleBar.setLeftVisible(true);
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC54591a.AbstractC54593b.AbstractC54594a aVar) {
        this.f134913a = aVar;
    }

    /* renamed from: a */
    private void m211782a(List<AbstractC54125a> list) {
        for (AbstractC54125a aVar : list) {
            if (aVar instanceof C54127c) {
                ((C54127c) aVar).mo185302a(new C54127c.AbstractC54128a(aVar) {
                    /* class com.ss.android.lark.setting.page.v2.$$Lambda$MineSystemSettingView2$gLNbbRd6XHi2sjuPma3ydtnEw_c */
                    public final /* synthetic */ AbstractC54125a f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.ss.android.lark.setting.export.C54127c.AbstractC54128a
                    public final void selectComponent(String str, View view) {
                        MineSystemSettingView2.lambda$gLNbbRd6XHi2sjuPma3ydtnEw_c(MineSystemSettingView2.this, this.f$1, str, view);
                    }
                });
            }
            this.f134915c.mo185298a(aVar);
        }
    }

    public MineSystemSettingView2(Activity activity, AbstractC54590a aVar) {
        this.f134914b = activity;
        this.f134916d = aVar;
        this.f134915c = new ComponentManager(DesktopUtil.m144301a(activity) ? 1 : 0);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m211781a(AbstractC54125a aVar, String str, View view) {
        View view2 = this.f134917e;
        if (view2 != null) {
            ((C54127c) aVar).mo185301a(view2, false);
        }
        this.f134917e = view;
    }
}
