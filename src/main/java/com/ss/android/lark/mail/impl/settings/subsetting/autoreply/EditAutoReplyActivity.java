package com.ss.android.lark.mail.impl.settings.subsetting.autoreply;

import android.os.Bundle;
import butterknife.ButterKnife;
import com.jaeger.library.StatusBarUtil;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.settings.BaseMailSettingActivity;
import com.ss.android.lark.mail.impl.settings.subsetting.autoreply.EditAutoReplyView;

public class EditAutoReplyActivity extends BaseMailSettingActivity {

    /* renamed from: b */
    private C43496d f110430b;

    /* renamed from: c */
    private EditAutoReplyView.AbstractC43490a f110431c = new EditAutoReplyView.AbstractC43490a() {
        /* class com.ss.android.lark.mail.impl.settings.subsetting.autoreply.EditAutoReplyActivity.C434801 */

        @Override // com.ss.android.lark.mail.impl.settings.subsetting.autoreply.EditAutoReplyView.AbstractC43490a
        /* renamed from: a */
        public void mo155320a(EditAutoReplyView editAutoReplyView) {
            ButterKnife.bind(editAutoReplyView, EditAutoReplyActivity.this);
        }
    };

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public boolean aL_() {
        return true;
    }

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    /* renamed from: a */
    public String mo150444a() {
        return C42187a.C42190b.f107419v;
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        if (this.f110430b.mo155366c()) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        C43496d dVar = this.f110430b;
        if (dVar != null) {
            dVar.destroy();
            this.f110430b = null;
        }
    }

    /* renamed from: e */
    private void mo150716e() {
        C43496d dVar = new C43496d(this, new C43495c(this.f110274a), new EditAutoReplyView(this, this.f110431c));
        this.f110430b = dVar;
        dVar.create();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.settings.BaseMailSettingActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        StatusBarUtil.setColorNoTranslucent(this, getResources().getColor(R.color.bg_body));
        setContentView(R.layout.mail_setting_auto_reply_edit_activity);
        mo150716e();
    }
}
