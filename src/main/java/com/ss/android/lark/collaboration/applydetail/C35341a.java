package com.ss.android.lark.collaboration.applydetail;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.collaboration.applydetail.mvp.ApplyCollabDetailView;
import com.ss.android.lark.collaboration.applydetail.mvp.C35344a;
import com.ss.android.lark.collaboration.applydetail.mvp.C35345b;

/* renamed from: com.ss.android.lark.collaboration.applydetail.a */
public class C35341a extends BaseFragment {

    /* renamed from: a */
    public View f91372a;

    /* renamed from: b */
    private ApplyCollabDetailView.AbstractC35343a f91373b = new ApplyCollabDetailView.AbstractC35343a() {
        /* class com.ss.android.lark.collaboration.applydetail.C35341a.C353421 */

        @Override // com.ss.android.lark.collaboration.applydetail.mvp.ApplyCollabDetailView.AbstractC35343a
        /* renamed from: a */
        public Context mo130074a() {
            return C35341a.this.getContext();
        }

        @Override // com.ss.android.lark.collaboration.applydetail.mvp.ApplyCollabDetailView.AbstractC35343a
        /* renamed from: a */
        public void mo130075a(ApplyCollabDetailView applyCollabDetailView) {
            ButterKnife.bind(applyCollabDetailView, C35341a.this.f91372a);
        }
    };

    /* renamed from: a */
    private void m138099a(Bundle bundle) {
        new C35345b(new C35344a(bundle), new ApplyCollabDetailView(this.f91373b)).create();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m138099a(getArguments());
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f91372a = layoutInflater.inflate(R.layout.activity_apply_collab_detail, viewGroup, false);
        int screenWidth = (int) (((double) DeviceUtils.getScreenWidth(getContext())) * 0.1d);
        UIUtils.setMargins(this.f91372a, screenWidth, (int) (((double) DeviceUtils.getScreenHeight(getContext())) * 0.2d), screenWidth, 0);
        return this.f91372a;
    }
}
