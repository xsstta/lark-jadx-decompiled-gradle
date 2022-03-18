package com.ss.android.lark.passport.infra.base.architecture;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.base.watermark.IWatermarkable;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterFieldAnno;
import com.ss.android.lark.passport.infra.base.router.RouterScene;

public class ReturnMarkerBaseActivity extends BaseActivity implements IWatermarkable {
    @RouterFieldAnno

    /* renamed from: h */
    public JSONObject f123062h;

    /* renamed from: i */
    public String f123063i;

    /* renamed from: j */
    public int f123064j;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    public boolean cA_() {
        return false;
    }

    @Override // com.ss.android.lark.base.watermark.IWatermarkable
    public boolean enableGlobalWatermark() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    /* renamed from: f */
    public boolean mo171133f() {
        return true;
    }

    @Override // com.ss.android.lark.base.watermark.IWatermarkable
    public int getWatermarkMode() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo171166w() {
        this.f123052c.mo171465b("ReturnMarkerBaseActivity", "startJump");
        C49092f.m193523a(this, 0, this.f123063i, this.f123062h, this.f123064j, this.f123055f, this.f123052c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo171163a(String str) {
        this.f123052c.mo171465b("ReturnMarkerBaseActivity", str);
        finish();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            mo171163a("onCreate received, savedInstanceState is not null");
            return;
        }
        C49092f.m193525a(this, getIntent());
        String stringExtra = getIntent().getStringExtra("next_step");
        this.f123063i = stringExtra;
        if (this.f123062h == null || TextUtils.isEmpty(stringExtra)) {
            mo171163a("onCreate received, but stepData is null");
            return;
        }
        int intExtra = getIntent().getIntExtra("step_scene", RouterScene.ALL.value);
        this.f123064j = intExtra;
        if (!C49092f.m193533a(this.f123063i, intExtra, this.f123055f)) {
            mo171163a("cannot handle step: " + this.f123063i + " scene: " + this.f123064j);
            return;
        }
        this.f123052c.mo171465b("ReturnMarkerBaseActivity", "ReturnMarkerBaseActivity startForResult");
        mo171166w();
    }
}
