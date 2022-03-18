package com.ss.android.lark.mail.impl.settings;

import android.os.Bundle;
import com.jaeger.library.StatusBarUtil;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity;

public abstract class BaseMailSettingActivity extends BaseMailFragmentActivity {

    /* renamed from: a */
    protected String f110274a;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public boolean aK_() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f110274a = getIntent().getStringExtra("t_a_id");
        StatusBarUtil.setColorNoTranslucent(this, getResources().getColor(R.color.bg_base));
    }
}
