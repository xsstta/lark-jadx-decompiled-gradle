package com.ss.android.lark.setting.page.v1.mvp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26323w;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.ding.helper.C36644b;
import com.ss.android.lark.monitor.p2372a.C48211b;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.page.C54129a;
import com.ss.android.lark.setting.page.content.common.C54150a;
import com.ss.android.lark.setting.page.statistics.SettingHitPoint;
import com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView;

/* renamed from: com.ss.android.lark.setting.page.v1.mvp.b */
public class C54571b extends BaseFragment {

    /* renamed from: a */
    public View f134877a;

    /* renamed from: b */
    private C54578d f134878b;

    /* renamed from: c */
    private Activity f134879c;

    /* renamed from: d */
    private final MineSystemSettingView.AbstractC54565a f134880d = new MineSystemSettingView.AbstractC54565a() {
        /* class com.ss.android.lark.setting.page.v1.mvp.C54571b.C545721 */

        @Override // com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView.AbstractC54565a
        /* renamed from: c */
        public void mo186449c() {
            m211716p();
        }

        @Override // com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView.AbstractC54565a
        /* renamed from: e */
        public void mo186451e() {
            m211717q();
        }

        @Override // com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView.AbstractC54565a
        /* renamed from: b */
        public void mo186448b() {
            C54150a.m210222a(C54571b.this.mContext);
        }

        @Override // com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView.AbstractC54565a
        /* renamed from: d */
        public void mo186450d() {
            C36644b.m144618a().mo135225h();
        }

        /* renamed from: p */
        private void m211716p() {
            C54129a.m210151c(C54571b.this.getContext());
        }

        @Override // com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView.AbstractC54565a
        /* renamed from: a */
        public void mo186445a() {
            C54115c.m210080a().mo178277a(C54571b.this.getContext(), "system_setting");
        }

        @Override // com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView.AbstractC54565a
        /* renamed from: h */
        public void mo186454h() {
            C54115c.m210080a().mo178287c(C54571b.this.getActivity());
        }

        @Override // com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView.AbstractC54565a
        /* renamed from: i */
        public void mo186455i() {
            C54115c.m210080a().mo178294f(C54571b.this.getActivity());
        }

        @Override // com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView.AbstractC54565a
        /* renamed from: k */
        public void mo186457k() {
            C54129a.m210150b(C54571b.this.getActivity());
        }

        @Override // com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView.AbstractC54565a
        /* renamed from: m */
        public void mo186459m() {
            C54115c.m210080a().mo178300l().mo178383a(C54571b.this.mContext);
        }

        /* renamed from: q */
        private void m211717q() {
            C54115c.m210080a().mo178301m().mo178366a(C54571b.this.mContext, false);
        }

        @Override // com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView.AbstractC54565a
        /* renamed from: f */
        public void mo186452f() {
            C54115c.m210080a().mo178306r().mo178324a(C54571b.this.getActivity());
        }

        @Override // com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView.AbstractC54565a
        /* renamed from: g */
        public void mo186453g() {
            C54115c.m210080a().mo178283b(C54571b.this.getActivity());
            CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.setting.page.v1.mvp.C54571b.C545721.RunnableC545731 */

                public void run() {
                    SettingHitPoint.f134851a.mo186401d();
                }
            });
        }

        @Override // com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView.AbstractC54565a
        /* renamed from: j */
        public void mo186456j() {
            C54115c.m210080a().mo178290d(C54571b.this.getActivity());
            CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.setting.page.v1.mvp.C54571b.C545721.RunnableC545742 */

                public void run() {
                    SettingHitPoint.f134851a.mo186403e();
                }
            });
        }

        @Override // com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView.AbstractC54565a
        /* renamed from: l */
        public void mo186458l() {
            C54115c.m210080a().mo178292e(C54571b.this.getActivity());
            CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.setting.page.v1.mvp.C54571b.C545721.RunnableC545753 */

                public void run() {
                    SettingHitPoint.f134851a.mo186405f();
                }
            });
        }

        @Override // com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView.AbstractC54565a
        /* renamed from: n */
        public void mo186460n() {
            if (C54115c.m210080a().mo178301m().mo178367a()) {
                C54129a.m210152d(C54571b.this.mContext);
            }
        }

        @Override // com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView.AbstractC54565a
        /* renamed from: o */
        public void mo186461o() {
            if (DesktopUtil.m144301a(C54571b.this.getContext())) {
                C26323w.m95329b(C54571b.this.getContext(), 268435456);
            } else {
                C26323w.m95328b(C54571b.this.getContext());
            }
        }

        @Override // com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView.AbstractC54565a
        /* renamed from: a */
        public void mo186446a(MineSystemSettingView mineSystemSettingView) {
            ButterKnife.bind(mineSystemSettingView, C54571b.this.f134877a);
        }

        @Override // com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView.AbstractC54565a
        /* renamed from: a */
        public void mo186447a(String str) {
            C54115c.m210080a().mo178299k().mo178321a(C54571b.this.getContext(), str, true);
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f134878b.destroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f134878b.mo186477b();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        C48211b.m190251a().mo168690c();
    }

    /* renamed from: a */
    private void m211715a() {
        MineSystemSettingView mineSystemSettingView = new MineSystemSettingView(getActivity(), this.f134880d);
        C54578d dVar = new C54578d(getActivity(), new C54576c(), mineSystemSettingView);
        this.f134878b = dVar;
        dVar.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        C48211b.m190252a("MineSystemSetting").mo168688b();
        super.onCreate(bundle);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C54578d dVar = this.f134878b;
        if (dVar != null) {
            dVar.mo186477b();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (UIUtils.isActivityRunning(this.f134879c) && !DesktopUtil.m144301a((Context) this.f134879c)) {
            this.f134879c.getWindow().setBackgroundDrawable(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C48211b.m190251a().mo168689b("initMVP");
        m211715a();
        C48211b.m190251a().mo168691c("initMVP");
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        C48211b.m190251a().mo168689b("onCreateView");
        View view = this.f134877a;
        if (view == null) {
            if (DesktopUtil.m144301a(viewGroup.getContext())) {
                i = R.layout.activity_mine_systemsetting_desktop;
            } else {
                i = R.layout.activity_mine_systemsetting;
            }
            this.f134877a = layoutInflater.inflate(i, viewGroup, false);
        } else if (view.getParent() != null) {
            ((ViewGroup) this.f134877a.getParent()).removeView(this.f134877a);
        }
        this.f134879c = getActivity();
        C48211b.m190251a().mo168691c("onCreateView");
        return this.f134877a;
    }
}
