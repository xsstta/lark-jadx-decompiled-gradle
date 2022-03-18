package com.bytedance.ee.bear.document;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.C0760e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.aj;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.p282f.C5171a;
import com.bytedance.ee.bear.contract.route.parcelable.WikiInfo;
import com.bytedance.ee.bear.document.multitask.DocActivityTaskWrapper;
import com.bytedance.ee.bear.document.offline.C5890a;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5955d;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5968f;
import com.bytedance.ee.bear.document.record.C6078a;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.facade.common.C7661a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9493f;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.common.C13608f;
import com.bytedance.ee.util.deviceinfo.C13653a;
import com.bytedance.ee.util.p718t.C13741f;
import com.bytedance.ee.util.p718t.C13742g;
import com.larksuite.suite.R;
import com.ss.android.lark.multitask.MultitaskHelper;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.Set;
import org.koin.java.KoinJavaComponent;

public class DocActivity extends BaseActivity {

    /* renamed from: a */
    private Bundle f15838a;

    /* renamed from: b */
    private MultitaskHelper f15839b;

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m22651g() {
        AbstractC10550f.AbstractC10551a.m43717b(this);
    }

    /* renamed from: c */
    public MultitaskHelper mo22316c() {
        return this.f15839b;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onResume() {
        super.onResume();
    }

    public Intent getIntent() {
        Intent intent = super.getIntent();
        if (intent != null) {
            return intent;
        }
        Intent intent2 = new Intent();
        setIntent(intent2);
        return intent2;
    }

    /* renamed from: e */
    private void mo22413e() {
        AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.document.$$Lambda$DocActivity$a6mWtvk1pgYhFPPrlP5P7HWxKM */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DocActivity.this.m22643a((DocActivity) ((String) obj));
            }
        }, $$Lambda$DocActivity$YpByDr0B4wPBja9lG2mmp51Qhw.INSTANCE);
    }

    /* renamed from: a */
    public DocViewModel mo22312a() {
        C5869m b = mo22314b();
        if (b == null) {
            return null;
        }
        return b.mo22586k();
    }

    /* renamed from: com.bytedance.ee.bear.document.DocActivity$a */
    public class C5593a extends C7661a {
        @Override // com.bytedance.ee.bear.facade.common.C7661a
        /* renamed from: a */
        public boolean mo22318a() {
            FragmentManager supportFragmentManager = DocActivity.this.getSupportFragmentManager();
            boolean a = DocActivity.this.mo22313a(supportFragmentManager);
            C13479a.m54764b("DocActivity", "onDispatchFragmentBackPress , documentAtTopBackStack:" + a);
            if (!a) {
                return super.mo22318a();
            }
            C13741f.m55704a(supportFragmentManager);
            supportFragmentManager.popBackStack();
            return true;
        }

        private C5593a(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
        }
    }

    /* renamed from: d */
    private void mo22412d() {
        ((AbstractC9493f) KoinJavaComponent.m268610a(AbstractC9493f.class)).mo35940b();
        AbstractC5233x b = C5234y.m21391b();
        b.mo21077a("start_open");
        b.mo21078a("start_open", "start_time", String.valueOf(System.currentTimeMillis()));
        DocBridgeWebViewV2.f15842j = System.currentTimeMillis();
        C5084ad.m20847d().mo20037a().mo5923a(this, $$Lambda$DocActivity$cenbKPcTxnUKTIs3GFAbiSHvNEU.INSTANCE);
    }

    /* renamed from: f */
    private boolean mo22414f() {
        boolean z;
        BearUrl bearUrl = (BearUrl) getIntent().getParcelableExtra("bear_url");
        if (bearUrl == null || bearUrl.f17450e == null) {
            z = C5171a.m21150a(getIntent().getStringExtra("url"));
        } else {
            z = TextUtils.equals(bearUrl.f17448c, "announce");
        }
        return !z;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.LifeCycleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        super.onDestroy();
        C6078a.m24584a().mo24575b();
        DocBridgeWebViewV2 b = ak.m22924b();
        if (b != null) {
            b.mo30814o();
            b.mo22350g();
        }
        C5890a.m23715e();
        if (mo30076n() != null) {
            ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31519c();
        }
    }

    /* renamed from: b */
    public C5869m mo22314b() {
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.documentFragment);
        if (findFragmentById instanceof C5869m) {
            return (C5869m) findFragmentById;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m22642a(ConnectionService.NetworkState networkState) {
        C13608f.m55249a(new Runnable() {
            /* class com.bytedance.ee.bear.document.$$Lambda$DocActivity$4TrgZPGgJ4SpfQpI0AdPWHxU */

            public final void run() {
                DocActivity.m22645b(ConnectionService.NetworkState.this);
            }
        });
    }

    /* renamed from: b */
    private boolean m22646b(Intent intent) {
        if (!TextUtils.isEmpty(intent.getStringExtra("url"))) {
            return false;
        }
        C13479a.m54758a("DocActivity", "validateIntent EMPTY URL");
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.bytedance.ee.bear.facade.common.BaseCommonActivity
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (C13653a.m55399c(this)) {
            C13742g.m55706a(new Runnable() {
                /* class com.bytedance.ee.bear.document.$$Lambda$DocActivity$hbAxk0tSGmq2B45H2BqwUIQtvdE */

                public final void run() {
                    DocActivity.this.m22651g();
                }
            }, 100);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (mo22414f()) {
            this.f15839b = MultitaskHelper.m190623b(new DocActivityTaskWrapper(this, getIntent(), new DocActivityTaskWrapper.MultiTaskWrapperDelegate() {
                /* class com.bytedance.ee.bear.document.$$Lambda$LDzkB6cY0rDlGkOIc5AfxdMKf8 */

                @Override // com.bytedance.ee.bear.document.multitask.DocActivityTaskWrapper.MultiTaskWrapperDelegate
                public final DocViewModel getDocViewModel() {
                    return DocActivity.this.mo22312a();
                }
            }));
        }
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

    /* renamed from: a */
    public static Fragment m22640a(Intent intent) {
        String stringExtra = intent.getStringExtra("url");
        BearUrl bearUrl = (BearUrl) intent.getParcelableExtra("bear_url");
        Bundle extras = intent.getExtras();
        if (bearUrl == null || bearUrl.f17450e == null) {
            return C5869m.m23602a(stringExtra, extras);
        }
        return C5869m.m23601a(bearUrl, extras);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m22645b(ConnectionService.NetworkState networkState) {
        if (networkState != null) {
            C13479a.m54764b("DocActivity", "onChanged: network state = " + networkState);
            ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31512b();
        }
    }

    /* renamed from: c */
    private boolean m22647c(Intent intent) {
        if (m22646b(intent)) {
            return false;
        }
        BearUrl g = C6313i.m25327a().mo25399g(intent.getStringExtra("url"));
        if (g == null) {
            C13479a.m54758a("DocActivity", "Empty bear url ,ignore !");
            return false;
        }
        DocViewModel a = mo22312a();
        if (a == null) {
            C13479a.m54758a("DocActivity", "No top document found !");
            return true;
        } else if (!TextUtils.equals(g.f17447b, a.getToken())) {
            return true;
        } else {
            C13479a.m54775e("DocActivity", "Same document, ignore !");
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        boolean booleanExtra = intent.getBooleanExtra("popLastDocument", false);
        C13479a.m54764b("DocActivity", "onNewIntent popLastDocument?" + booleanExtra);
        if (m22647c(intent)) {
            if (this.f15839b != null && mo22414f()) {
                this.f15839b = this.f15839b.mo169042a(new DocActivityTaskWrapper(this, intent, new DocActivityTaskWrapper.MultiTaskWrapperDelegate() {
                    /* class com.bytedance.ee.bear.document.$$Lambda$LDzkB6cY0rDlGkOIc5AfxdMKf8 */

                    @Override // com.bytedance.ee.bear.document.multitask.DocActivityTaskWrapper.MultiTaskWrapperDelegate
                    public final DocViewModel getDocViewModel() {
                        return DocActivity.this.mo22312a();
                    }
                }));
            }
            setIntent(intent);
            mo22413e();
            m22641a(intent, booleanExtra);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        C13479a.m54764b("DocActivity", "onCreate version is " + C4511g.m18594d().mo17364n());
        if (m22646b(getIntent())) {
            C13479a.m54775e("DocActivity", "Bad intent !");
            finish();
            return;
        }
        mo22413e();
        mo22412d();
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(R.id.documentFragment);
        setContentView(frameLayout);
        m22641a(getIntent(), false);
        mo30077a(new C5593a(this));
        setResult(SmEvents.EVENT_HB_NOTICE_DISCONNECT);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseCommonActivity
    /* renamed from: b */
    public void mo22315b(Bundle bundle) {
        super.mo22315b(bundle);
        Parcelable parcelable = null;
        getWindow().setBackgroundDrawable(new ColorDrawable(C0760e.m3684b(getResources(), R.color.space_kit_n00, null)));
        this.f15838a = bundle;
        if (bundle != null) {
            parcelable = bundle.getParcelable("SavedIntent");
        }
        if (parcelable instanceof Bundle) {
            getIntent().putExtras((Bundle) parcelable);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m22643a(String str) throws Exception {
        String str2;
        String str3;
        Exception e;
        C5968f b;
        AccountService.Account f = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
        String stringExtra = getIntent().getStringExtra("url");
        BearUrl bearUrl = (BearUrl) getIntent().getParcelableExtra("bear_url");
        if (bearUrl == null || bearUrl.f17450e == null) {
            bearUrl = C6313i.m25327a().mo25399g(C6313i.m25327a().mo25398f(stringExtra));
        }
        if (!(f == null || bearUrl == null)) {
            C5955d.m24025b().mo24075a(f, bearUrl.f17447b);
            if (!TextUtils.isEmpty(bearUrl.f17447b)) {
                Set<String> d = C5890a.m23713d(bearUrl.f17446a);
                if (d != null) {
                    JSONObject jSONObject = new JSONObject();
                    for (String str4 : d) {
                        if (!(str4 == null || (b = C5955d.m24025b().mo24086b(str4, bearUrl.f17447b)) == null || b.mo24137d() == null)) {
                            jSONObject.put(str4, (Object) b.mo24137d());
                        }
                    }
                    if (jSONObject.size() > 0) {
                        C5890a.m23704a(bearUrl.f17447b, jSONObject);
                    }
                }
                String str5 = null;
                if (!TextUtils.equals(bearUrl.f17446a, C8275a.f22377j.mo32553a())) {
                    str5 = bearUrl.f17446a;
                    str2 = bearUrl.f17447b;
                } else {
                    C5968f b2 = C5955d.m24025b().mo24086b(f.f14592i + "_" + f.f14584a + "_WIKI_INFO", bearUrl.f17447b);
                    if (!(b2 == null || b2.mo24137d() == null)) {
                        try {
                            WikiInfo wikiInfo = (WikiInfo) JSONObject.parseObject(b2.mo24137d(), WikiInfo.class);
                            C13479a.m54764b("DocActivity", "cachedWikiInfo " + wikiInfo);
                            if (wikiInfo != null) {
                                str3 = wikiInfo.getObjTypeString();
                                try {
                                    str2 = wikiInfo.getObjToken();
                                } catch (Exception e2) {
                                    e = e2;
                                }
                                str5 = str3;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            str3 = null;
                            C13479a.m54758a("DocActivity", "parse wikiInfo exception! str = ");
                            C13606d.m55245a("DocActivity", e);
                            str2 = null;
                            str5 = str3;
                            C5955d.m24025b().mo24086b(f.f14592i + "_" + f.f14584a + C8275a.m34053c(str5), str2);
                            C13479a.m54764b("DocActivity", "loadDataToCache end");
                        }
                    }
                    str2 = null;
                }
                if (!(str5 == null || str2 == null)) {
                    C5955d.m24025b().mo24086b(f.f14592i + "_" + f.f14584a + C8275a.m34053c(str5), str2);
                }
            }
        }
        C13479a.m54764b("DocActivity", "loadDataToCache end");
    }

    /* renamed from: a */
    public boolean mo22313a(FragmentManager fragmentManager) {
        int backStackEntryCount = fragmentManager.getBackStackEntryCount();
        if (backStackEntryCount > 0) {
            return "document_stack".equals(fragmentManager.getBackStackEntryAt(backStackEntryCount - 1).mo5399d());
        }
        return false;
    }

    /* renamed from: a */
    private void m22641a(Intent intent, boolean z) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment findFragmentById = supportFragmentManager.findFragmentById(R.id.documentFragment);
        Fragment a = m22640a(intent);
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
        if (i == 16 && i2 == -1 && intent != null && intent.getExtras() != null) {
            for (String str : intent.getExtras().keySet()) {
                Object obj = intent.getExtras().get(str);
                if (obj != null) {
                    ((DocViewModel) aj.m5366a(this).mo6005a(DocViewModel.class)).setExtraData(str, obj);
                }
            }
        }
    }
}
