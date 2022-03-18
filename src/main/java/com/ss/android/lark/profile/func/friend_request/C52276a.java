package com.ss.android.lark.profile.func.friend_request;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.profile.func.friend_request.mvp.C52287b;
import com.ss.android.lark.profile.func.friend_request.mvp.C52291c;
import com.ss.android.lark.profile.func.friend_request.mvp.ReasonEditView;
import com.ss.android.lark.profile.statistics.ProfileHitPoint;

/* renamed from: com.ss.android.lark.profile.func.friend_request.a */
public class C52276a extends BaseFragment {

    /* renamed from: a */
    public View f129657a;

    /* renamed from: b */
    private C52291c f129658b;

    /* renamed from: c */
    private Bundle f129659c;

    /* renamed from: d */
    private ReasonEditView.AbstractC52282a f129660d = new ReasonEditView.AbstractC52282a() {
        /* class com.ss.android.lark.profile.func.friend_request.C52276a.C522771 */

        @Override // com.ss.android.lark.profile.func.friend_request.mvp.ReasonEditView.AbstractC52282a
        /* renamed from: a */
        public void mo179098a(ReasonEditView reasonEditView) {
            ButterKnife.bind(reasonEditView, C52276a.this.f129657a);
        }

        @Override // com.ss.android.lark.profile.func.friend_request.mvp.ReasonEditView.AbstractC52282a
        /* renamed from: a */
        public void mo179099a(boolean z) {
            if (z) {
                C52276a.this.setResult(-1);
            }
            C52276a.this.finish();
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C52291c cVar = this.f129658b;
        if (cVar != null) {
            cVar.destroy();
        }
        this.f129660d = null;
    }

    /* renamed from: a */
    private void m202869a() {
        C52291c cVar = new C52291c(new C52287b(), new ReasonEditView(this.f129660d));
        this.f129658b = cVar;
        cVar.create();
        this.f129658b.mo179120a(this.f129659c);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f129659c = arguments;
        if (!m202870a(arguments)) {
            finish();
        }
    }

    /* renamed from: a */
    private boolean m202870a(Bundle bundle) {
        if (bundle == null) {
            Log.m165382e("It's failed to open ReasonEditActivity: bundle is null");
            return false;
        }
        String string = bundle.getString("contact_add_friend_token");
        if (!TextUtils.isEmpty(string)) {
            return true;
        }
        Log.m165382e("It's failed to open ReasonEditActivity: requestToken is " + string);
        return false;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f129657a = layoutInflater.inflate(R.layout.activity_friend_request_reason_edit, viewGroup, false);
        m202869a();
        ProfileHitPoint.m204732l();
        return this.f129657a;
    }
}
