package com.bytedance.ee.bear.wikiv2;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.core.content.res.C0760e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.ee.bear.AbstractC7586e;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.wikiv2.extension.C12249b;
import com.bytedance.ee.bear.wikiv2.extension.C12250d;
import com.bytedance.ee.bear.wikiv2.extension.C12251e;
import com.bytedance.ee.bear.wikiv2.extension.LoadDataToCacheExtension;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import com.ss.android.lark.multitask.MultitaskHelper;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;

public class WikiActivity extends BaseActivity implements AbstractC7586e {

    /* renamed from: a */
    private Bundle f32806a;

    public Intent getIntent() {
        Intent intent = super.getIntent();
        if (intent != null) {
            return intent;
        }
        Intent intent2 = new Intent();
        setIntent(intent2);
        return intent2;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.LifeCycleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        C13479a.m54764b("WikiActivity", "onDestroy");
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onResume() {
        super.onResume();
        setResult(SmEvents.EVENT_HB_NOTICE_DISCONNECT);
    }

    @Override // com.bytedance.ee.bear.AbstractC7586e
    /* renamed from: a */
    public MultitaskHelper mo29850a() {
        C12251e eVar = (C12251e) mo17222a(C12251e.class);
        if (eVar != null) {
            return eVar.mo46810b();
        }
        return null;
    }

    /* renamed from: a */
    public static Fragment m50733a(Intent intent) {
        return WikiFragment.m50750a(intent.getStringExtra("url"), intent.getExtras());
    }

    /* renamed from: c */
    private boolean m50736c(Intent intent) {
        if (m50735b(intent)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        C13479a.m54764b("WikiActivity", "onPostCreate");
        C12250d.m50993a(this, bundle);
    }

    /* renamed from: b */
    private boolean m50735b(Intent intent) {
        if (!TextUtils.isEmpty(intent.getStringExtra("url"))) {
            return false;
        }
        C13479a.m54758a("WikiActivity", "validateIntent EMPTY URL");
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.clear();
        Intent intent = getIntent();
        intent.removeExtra("bear_url");
        bundle.putBundle("SavedIntent", intent.getExtras());
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseCommonActivity
    /* renamed from: b */
    public void mo22315b(Bundle bundle) {
        super.mo22315b(bundle);
        Parcelable parcelable = null;
        getWindow().setBackgroundDrawable(new ColorDrawable(C0760e.m3684b(getResources(), R.color.space_kit_n00, null)));
        this.f32806a = bundle;
        if (bundle != null) {
            parcelable = bundle.getParcelable("SavedIntent");
        }
        if (parcelable instanceof Bundle) {
            getIntent().putExtras((Bundle) parcelable);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        boolean booleanExtra = intent.getBooleanExtra("popLastDocument", false);
        C13479a.m54764b("WikiActivity", "onNewIntent popLastDocument?" + booleanExtra);
        if (m50736c(intent)) {
            C12250d.m50992a(this, intent);
            setIntent(intent);
            m50734a(intent, booleanExtra);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        C13479a.m54764b("WikiActivity", "onCreate version is " + C4511g.m18594d().mo17364n());
        if (m50735b(getIntent())) {
            C13479a.m54775e("WikiActivity", "Bad intent !");
            finish();
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(R.id.documentFragment);
        setContentView(frameLayout);
        m50734a(getIntent(), false);
        mo30077a(new C12251e(this));
        mo30077a(new C12249b(this));
        mo30077a(new LoadDataToCacheExtension(this));
    }

    /* renamed from: a */
    private void m50734a(Intent intent, boolean z) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment findFragmentById = supportFragmentManager.findFragmentById(R.id.documentFragment);
        Fragment a = m50733a(intent);
        if (findFragmentById == null) {
            supportFragmentManager.beginTransaction().add(R.id.documentFragment, a).commit();
            return;
        }
        if (z) {
            supportFragmentManager.beginTransaction().remove(findFragmentById).commitNowAllowingStateLoss();
        }
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        if (intent.getBooleanExtra("addToBackStack", true) && !z) {
            beginTransaction.addToBackStack("document_stack");
        }
        beginTransaction.replace(R.id.documentFragment, a).commitAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity, com.bytedance.ee.bear.facade.common.BaseCommonActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }
}
