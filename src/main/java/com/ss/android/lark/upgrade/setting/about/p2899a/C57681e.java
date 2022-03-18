package com.ss.android.lark.upgrade.setting.about.p2899a;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.setting.IndicatorItemView;
import com.ss.android.lark.upgrade.C57607a;
import com.ss.android.lark.upgrade.p2893a.AbstractC57608a;
import com.ss.android.lark.upgrade.setting.about.p2899a.C57670b;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

/* renamed from: com.ss.android.lark.upgrade.setting.about.a.e */
public class C57681e implements C57670b.AbstractC57673b {

    /* renamed from: a */
    public AbstractC57683a f142141a;

    /* renamed from: b */
    public C57670b.AbstractC57673b.AbstractC57674a f142142b;

    /* renamed from: c */
    private Context f142143c;

    /* renamed from: d */
    private IndicatorItemView f142144d;

    /* renamed from: e */
    private AbstractC57608a.AbstractC57614f f142145e = C57607a.m223662a().mo177724r();

    /* renamed from: com.ss.android.lark.upgrade.setting.about.a.e$a */
    public interface AbstractC57683a {
        /* renamed from: a */
        void mo195774a();

        /* renamed from: a */
        void mo195775a(View view);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.upgrade.setting.about.p2899a.C57670b.AbstractC57673b
    /* renamed from: a */
    public View mo195780a() {
        return this.f142144d;
    }

    @Override // com.ss.android.lark.upgrade.setting.about.p2899a.C57670b.AbstractC57673b
    /* renamed from: b */
    public void mo195783b() {
        this.f142141a.mo195774a();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        IndicatorItemView indicatorItemView = (IndicatorItemView) new IndicatorItemView.C54112a(this.f142143c).mo185193c(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_AboutApp_V2, "appName", UIUtils.getString(this.f142143c, R.string.Lark_App_Name))).mo185191a(new OnSingleClickListener() {
            /* class com.ss.android.lark.upgrade.setting.about.p2899a.C57681e.C576821 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C57681e.this.f142141a.mo195775a(view);
                C57681e.this.f142142b.mo195784a();
            }
        }).mo185176a(true).mo185179b(!DesktopUtil.m144301a(this.f142143c)).mo185177a();
        this.f142144d = indicatorItemView;
        indicatorItemView.setClickable(true);
    }

    /* renamed from: a */
    public void setViewDelegate(C57670b.AbstractC57673b.AbstractC57674a aVar) {
        this.f142142b = aVar;
    }

    @Override // com.ss.android.lark.upgrade.setting.about.p2899a.C57670b.AbstractC57673b
    /* renamed from: a */
    public void mo195781a(boolean z) {
        this.f142144d.mo185189a(z);
        if (z) {
            ((ConstraintLayout.LayoutParams) ((ImageView) this.f142144d.findViewById(R.id.setting_item_right_drawable)).getLayoutParams()).height = UIHelper.dp2px(16.0f);
        }
    }

    public C57681e(Context context, AbstractC57683a aVar) {
        this.f142143c = context;
        this.f142141a = aVar;
    }

    @Override // com.ss.android.lark.upgrade.setting.about.p2899a.C57670b.AbstractC57673b
    /* renamed from: a */
    public void mo195782a(boolean z, boolean z2) {
        this.f142144d.mo185190a(z, z2);
        if (!z && z2) {
            ImageView imageView = (ImageView) this.f142144d.findViewById(R.id.setting_item_right_drawable);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.setMargins(0, 0, UIHelper.dp2px(8.0f), 0);
            imageView.setLayoutParams(layoutParams);
        }
    }
}
