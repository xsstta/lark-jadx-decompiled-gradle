package com.ss.android.lark.passport.infra.base.architecture;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.desktopmode.p1787a.AbstractC36518c;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.p2069j.p2070a.C40633aa;
import com.ss.android.lark.p2069j.p2070a.C40652s;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.statistics.AbstractC49137a;
import com.ss.android.lark.passport.infra.util.C49146ab;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.passport.infra.base.architecture.b */
public class C49029b extends C36516a implements AbstractC49137a {

    /* renamed from: a */
    protected UniContext f123086a;

    /* renamed from: b */
    protected PassportLog f123087b = PassportLog.m193684a(mo171191c());

    /* renamed from: c */
    protected String f123088c;

    /* renamed from: d */
    protected String f123089d;

    /* renamed from: com.ss.android.lark.passport.infra.base.architecture.b$a */
    private static class C49031a implements AbstractC36518c {
        @Override // com.ss.android.lark.desktopmode.p1787a.AbstractC36518c
        /* renamed from: a */
        public void mo134791a() {
        }

        @Override // com.ss.android.lark.desktopmode.p1787a.AbstractC36518c
        /* renamed from: a */
        public void mo134792a(Context context) {
        }

        @Override // com.ss.android.lark.desktopmode.p1787a.AbstractC36518c
        /* renamed from: a */
        public void mo134793a(Bundle bundle) {
        }

        @Override // com.ss.android.lark.desktopmode.p1787a.AbstractC36518c
        /* renamed from: a */
        public void mo134794a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        }

        @Override // com.ss.android.lark.desktopmode.p1787a.AbstractC36518c
        /* renamed from: b */
        public void mo134795b() {
        }

        @Override // com.ss.android.lark.desktopmode.p1787a.AbstractC36518c
        /* renamed from: b */
        public void mo134796b(Bundle bundle) {
        }

        @Override // com.ss.android.lark.desktopmode.p1787a.AbstractC36518c
        /* renamed from: c */
        public void mo134797c() {
        }

        @Override // com.ss.android.lark.desktopmode.p1787a.AbstractC36518c
        /* renamed from: c */
        public void mo134798c(Bundle bundle) {
        }

        @Override // com.ss.android.lark.desktopmode.p1787a.AbstractC36518c
        /* renamed from: d */
        public void mo134799d() {
        }

        private C49031a() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public OPMonitorCode mo171191c() {
        return C40633aa.f103061a;
    }

    /* renamed from: d */
    private Intent mo185117d() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity.getIntent();
        }
        return null;
    }

    @Override // com.ss.android.lark.passport.infra.statistics.AbstractC49137a
    /* renamed from: k */
    public String mo171139k() {
        return C49146ab.m193803a(mo185117d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo171189a() {
        if (TextUtils.isEmpty(this.f123088c) && (getActivity() instanceof BaseActivity)) {
            this.f123088c = ((BaseActivity) getActivity()).mo171140l();
        }
        return this.f123088c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo171190b() {
        String str;
        if (TextUtils.isEmpty(this.f123089d)) {
            RouterAnno routerAnno = (RouterAnno) getClass().getAnnotation(RouterAnno.class);
            if (routerAnno != null) {
                str = routerAnno.teaName();
            } else {
                str = "";
            }
            this.f123089d = str;
        }
        return this.f123089d;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (getArguments() != null) {
            bundle.putAll(getArguments());
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            if (getArguments() != null) {
                getArguments().putAll(bundle);
            } else {
                setArguments(bundle);
            }
        }
        Intent d = mo185117d();
        if (d != null) {
            try {
                this.f123086a = (UniContext) d.getSerializableExtra("key_of_uni_context");
            } catch (Throwable th) {
                this.f123087b.mo171462a("BaseFragment", "can not read uniContext from intent", th);
            }
        }
        setLifecycleCallback(new C49031a() {
            /* class com.ss.android.lark.passport.infra.base.architecture.C49029b.C490301 */

            @Override // com.ss.android.lark.desktopmode.p1787a.AbstractC36518c, com.ss.android.lark.passport.infra.base.architecture.C49029b.C49031a
            /* renamed from: d */
            public void mo134799d() {
                HashMap hashMap = new HashMap();
                hashMap.put("step_name", C49029b.this.mo171189a());
                hashMap.put("tag_name", C49029b.this.mo171190b());
                hashMap.put("stage_name", "onDestroyView");
                WatcherHelper.m193665a(C49029b.this.f123086a, C40652s.f103163f, hashMap);
            }

            @Override // com.ss.android.lark.desktopmode.p1787a.AbstractC36518c, com.ss.android.lark.passport.infra.base.architecture.C49029b.C49031a
            /* renamed from: a */
            public void mo134793a(Bundle bundle) {
                HashMap hashMap = new HashMap();
                hashMap.put("step_name", C49029b.this.mo171189a());
                hashMap.put("tag_name", C49029b.this.mo171190b());
                hashMap.put("stage_name", "onCreate");
                WatcherHelper.m193665a(C49029b.this.f123086a, C40652s.f103163f, hashMap);
            }

            @Override // com.ss.android.lark.desktopmode.p1787a.AbstractC36518c, com.ss.android.lark.passport.infra.base.architecture.C49029b.C49031a
            /* renamed from: a */
            public void mo134794a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
                HashMap hashMap = new HashMap();
                hashMap.put("step_name", C49029b.this.mo171189a());
                hashMap.put("tag_name", C49029b.this.mo171190b());
                hashMap.put("stage_name", "onCreateView");
                WatcherHelper.m193665a(C49029b.this.f123086a, C40652s.f103163f, hashMap);
            }
        });
    }
}
