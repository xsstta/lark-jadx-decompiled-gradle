package com.bytedance.ee.bear.debug;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.document.security.SecurityUtils;
import com.larksuite.suite.R;
import java.util.List;

public class DebugActivity extends BasePreferenceActivity {

    /* renamed from: a */
    private C5261d f15004a;

    /* renamed from: a */
    private static boolean m21450a(Context context) {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean isValidFragment(String str) {
        return false;
    }

    @Override // android.preference.PreferenceActivity
    public void onBuildHeaders(List<PreferenceActivity.Header> list) {
    }

    public boolean onIsMultiPane() {
        return false;
    }

    public void onBackPressed() {
        C5261d dVar = this.f15004a;
        if (dVar == null || !dVar.mo21203a()) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C5261d dVar = this.f15004a;
        if (dVar != null) {
            dVar.mo21206c();
        }
    }

    /* renamed from: b */
    private void mo21154b() {
        if (m21450a(this)) {
            addPreferencesFromResource(R.xml.debug_pref_general);
            C5261d dVar = new C5261d(getPreferenceScreen(), this, mo21144a());
            this.f15004a = dVar;
            dVar.mo21205b();
        }
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo21154b();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!SecurityUtils.m23555a(this, C4511g.m18594d())) {
            finish();
        }
    }
}
