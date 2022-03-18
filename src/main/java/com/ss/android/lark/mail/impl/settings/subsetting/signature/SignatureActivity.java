package com.ss.android.lark.mail.impl.settings.subsetting.signature;

import android.os.Bundle;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.settings.BaseMailSettingActivity;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.SignatureView;

public class SignatureActivity extends BaseMailSettingActivity {

    /* renamed from: b */
    private C43594m f110581b;

    /* renamed from: c */
    private SignatureView.AbstractC43564a f110582c = new SignatureView.AbstractC43564a() {
        /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.SignatureActivity.C435611 */

        @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.SignatureView.AbstractC43564a
        /* renamed from: a */
        public void mo155537a(SignatureView signatureView) {
            ButterKnife.bind(signatureView, SignatureActivity.this);
        }
    };

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    /* renamed from: a */
    public String mo150444a() {
        return C42187a.C42190b.f107414q;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        C43594m mVar = this.f110581b;
        if (mVar != null) {
            mVar.destroy();
            this.f110581b = null;
        }
    }

    /* renamed from: e */
    private void mo150716e() {
        C43594m mVar = new C43594m(new C43593l(this.f110274a), new SignatureView(this, this.f110582c));
        this.f110581b = mVar;
        mVar.create();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.settings.BaseMailSettingActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mail_setting_signature_activity);
        mo150716e();
    }
}
