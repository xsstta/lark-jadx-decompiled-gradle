package com.ss.android.lark.notification.setting.impl.zen;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.notification.setting.impl.zen.C48675a;
import com.ss.android.lark.notification.setting.impl.zen.ZenSettingView;

/* renamed from: com.ss.android.lark.notification.setting.impl.zen.b */
public class C48680b extends BaseFragment {

    /* renamed from: a */
    public View f122400a;

    /* renamed from: b */
    private Activity f122401b;

    /* renamed from: c */
    private C48685d f122402c;

    /* renamed from: d */
    private final ZenSettingView.AbstractC48673b f122403d = new ZenSettingView.AbstractC48673b() {
        /* class com.ss.android.lark.notification.setting.impl.zen.C48680b.C486811 */

        @Override // com.ss.android.lark.notification.setting.impl.zen.ZenSettingView.AbstractC48673b
        /* renamed from: a */
        public void mo169886a() {
            C48680b.this.finish();
        }

        @Override // com.ss.android.lark.notification.setting.impl.zen.ZenSettingView.AbstractC48673b
        /* renamed from: a */
        public void mo169887a(C48675a.AbstractC48678b bVar) {
            ButterKnife.bind(bVar, C48680b.this.f122400a);
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f122402c.destroy();
        super.onDestroy();
    }

    /* renamed from: a */
    private void m191856a() {
        C48685d dVar = new C48685d(new C48682c(), new ZenSettingView(this.f122401b, this.f122403d));
        this.f122402c = dVar;
        dVar.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (UIUtils.isActivityRunning(this.f122401b) && !DesktopUtil.m144301a((Context) this.f122401b)) {
            this.f122401b.getWindow().setBackgroundDrawable(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m191856a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122400a = layoutInflater.inflate(R.layout.activity_zen_setting, viewGroup, false);
        this.f122401b = getActivity();
        return this.f122400a;
    }
}
