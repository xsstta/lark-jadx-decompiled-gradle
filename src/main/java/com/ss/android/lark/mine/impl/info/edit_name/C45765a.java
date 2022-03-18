package com.ss.android.lark.mine.impl.info.edit_name;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mine.impl.info.MineInfoActivity;
import com.ss.android.lark.mine.impl.info.edit_name.mvp.MineUpdateNameModel;
import com.ss.android.lark.mine.impl.info.edit_name.mvp.MineUpdateNamePresenter;
import com.ss.android.lark.mine.impl.info.edit_name.mvp.MineUpdateNameView;
import com.ss.android.lark.monitor.p2372a.C48211b;

/* renamed from: com.ss.android.lark.mine.impl.info.edit_name.a */
public class C45765a extends BaseFragment {

    /* renamed from: b */
    static final /* synthetic */ boolean f115519b = true;

    /* renamed from: a */
    public View f115520a;

    /* renamed from: c */
    private MineUpdateNamePresenter f115521c;

    /* renamed from: d */
    private MineUpdateNameView.ViewDependency f115522d = new MineUpdateNameView.ViewDependency() {
        /* class com.ss.android.lark.mine.impl.info.edit_name.C45765a.C457661 */

        @Override // com.ss.android.lark.mine.impl.info.edit_name.mvp.MineUpdateNameView.ViewDependency
        /* renamed from: a */
        public void mo160960a(MineUpdateNameView mineUpdateNameView) {
            ButterKnife.bind(mineUpdateNameView, C45765a.this.f115520a);
        }

        @Override // com.ss.android.lark.mine.impl.info.edit_name.mvp.MineUpdateNameView.ViewDependency
        /* renamed from: a */
        public void mo160961a(String str) {
            if (C45765a.this.getActivity() == null) {
                Log.m165383e(C45765a.this.TAG, "setNewMineNameResult failed: getActivity is null");
                return;
            }
            Intent intent = new Intent(C45765a.this.getActivity(), MineInfoActivity.class);
            intent.putExtra("key/new_mine_name", str);
            C45765a.this.setResult(-1, intent);
            C45765a.this.finish();
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        MineUpdateNamePresenter cVar = this.f115521c;
        if (cVar != null) {
            cVar.destroy();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C48211b.m190251a().mo168692d();
    }

    /* renamed from: a */
    private boolean m181357a() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return false;
        }
        return TextUtils.isEmpty(arguments.getString("key/mine_init_name")) ^ f115519b;
    }

    /* renamed from: b */
    private void m181358b() {
        boolean z = f115519b;
        if (z || getArguments() != null) {
            String string = getArguments().getString("key/mine_init_name");
            if (z || string != null) {
                MineUpdateNameModel bVar = new MineUpdateNameModel(string);
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    MineUpdateNamePresenter cVar = new MineUpdateNamePresenter(bVar, new MineUpdateNameView(activity, this.f115522d));
                    this.f115521c = cVar;
                    cVar.create();
                    return;
                }
                return;
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!m181357a()) {
            finish();
            return;
        }
        C48211b.m190251a().mo168689b("initMVP");
        m181358b();
        C48211b.m190251a().mo168691c("initMVP");
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C48211b.m190251a().mo168689b("onCreateView");
        this.f115520a = layoutInflater.inflate(R.layout.activity_mine_update_name, viewGroup, false);
        C48211b.m190251a().mo168691c("onCreateView");
        return this.f115520a;
    }
}
