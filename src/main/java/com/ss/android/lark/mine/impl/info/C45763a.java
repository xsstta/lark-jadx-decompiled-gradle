package com.ss.android.lark.mine.impl.info;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.mine.C45398a;
import com.ss.android.lark.mine.C45421b;
import com.ss.android.lark.mine.impl.info.mvp.C45789c;
import com.ss.android.lark.mine.impl.info.mvp.MineInfoView;
import com.ss.android.lark.sdk.C53241h;

/* renamed from: com.ss.android.lark.mine.impl.info.a */
public class C45763a extends BaseFragment {

    /* renamed from: a */
    public View f115514a;

    /* renamed from: b */
    public Activity f115515b;

    /* renamed from: c */
    private C45789c f115516c;

    /* renamed from: d */
    private MineInfoView.AbstractC45777a f115517d = new MineInfoView.AbstractC45777a() {
        /* class com.ss.android.lark.mine.impl.info.C45763a.C457641 */

        @Override // com.ss.android.lark.mine.impl.info.mvp.MineInfoView.AbstractC45777a
        /* renamed from: a */
        public Context mo160948a() {
            return C45763a.this.f115515b;
        }

        @Override // com.ss.android.lark.mine.impl.info.mvp.MineInfoView.AbstractC45777a
        /* renamed from: b */
        public void mo160952b() {
            C45763a.this.finish();
        }

        @Override // com.ss.android.lark.mine.impl.info.mvp.MineInfoView.AbstractC45777a
        /* renamed from: a */
        public void mo160950a(MineInfoView mineInfoView) {
            ButterKnife.bind(mineInfoView, C45763a.this.f115514a);
        }

        @Override // com.ss.android.lark.mine.impl.info.mvp.MineInfoView.AbstractC45777a
        /* renamed from: a */
        public void mo160951a(String str) {
            Bundle bundle = new Bundle();
            bundle.putString("key/mine_init_name", str);
            C45398a.m180320a(C45763a.this.f115515b, C45763a.this, bundle, 1);
        }

        @Override // com.ss.android.lark.mine.impl.info.mvp.MineInfoView.AbstractC45777a
        /* renamed from: a */
        public void mo160949a(Context context, String str) {
            C45421b.m180420a().mo133455n().mo133492a(context, str);
        }
    };

    /* renamed from: a */
    private boolean m181340a(int i, Intent intent) {
        return i == -1 && intent != null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C45789c cVar = this.f115516c;
        if (cVar != null) {
            cVar.destroy();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C45789c cVar = new C45789c(this.f115515b, this.f115517d);
        this.f115516c = cVar;
        cVar.create();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!m181340a(i2, intent)) {
            C53241h.m205894a(this.TAG, "activity result is invalid");
        } else if (i == 1) {
            String stringExtra = intent.getStringExtra("key/new_mine_name");
            C45789c cVar = this.f115516c;
            if (cVar != null) {
                cVar.mo161008a(stringExtra);
            }
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f115514a = layoutInflater.inflate(R.layout.mine_activity_mine_infox, viewGroup, false);
        this.f115515b = getActivity();
        return this.f115514a;
    }
}
