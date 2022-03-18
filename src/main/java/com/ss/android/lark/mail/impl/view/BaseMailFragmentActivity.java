package com.ss.android.lark.mail.impl.view;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.TextUtils;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.entity.C42093e;
import com.ss.android.lark.mail.impl.home.p2178a.C42365c;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.p2171h.p2176d.C42348a;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.service.C43345c;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43333t;
import com.ss.android.lark.mail.impl.utils.C43849u;

public abstract class BaseMailFragmentActivity extends BaseFragmentActivity implements AbstractC43333t {

    /* renamed from: a */
    private String f111380a;

    /* renamed from: r */
    public long f111381r;

    /* renamed from: s */
    public String f111382s;

    /* renamed from: a */
    public abstract String mo150444a();

    /* access modifiers changed from: protected */
    public boolean aK_() {
        return false;
    }

    public boolean aL_() {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean aM_() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onResume() {
        super.onResume();
        C42187a.m168562p(mo150444a());
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        if (aM_()) {
            C42344d.m169097c(this);
        }
        super.onStop();
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        if (aL_()) {
            return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
        }
        return super.getEnterAnimationConfig();
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        if (aL_()) {
            return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
        }
        return super.getExitAnimationConfig();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        C42344d.m169093a(this);
        super.onDestroy();
        C42348a.m169098a().mo152456b(this);
        Watchers.m167209b(this);
        C43345c.m172076m().mo155006l();
    }

    /* renamed from: e */
    private void mo150716e() {
        this.f111381r = System.currentTimeMillis();
        CoreThreadPool.getBackgroundHandler().post(new Runnable() {
            /* class com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity.RunnableC439061 */

            public void run() {
                BaseMailFragmentActivity.this.f111382s = C43277a.m171921a().mo154950n();
            }
        });
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            mo156319e(extras.getString("key_page_key"));
        }
        Watchers.m167206a(this);
        C42348a.m169098a().mo152455a(this);
        C43345c.m172076m().mo155005k();
    }

    /* renamed from: e */
    public void mo156319e(String str) {
        this.f111380a = str;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo150716e();
    }

    public void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        super.onCreate(bundle, persistableBundle);
        mo150716e();
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43333t
    public void onSharedAccountChange(final String str, final C42093e eVar, final boolean z) {
        if (!aK_()) {
            if (TextUtils.isEmpty(this.f111382s)) {
                this.f111382s = C43277a.m171921a().mo154950n();
            }
            C43849u.m173826a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity.RunnableC439072 */

                public void run() {
                    C42365c a = C42365c.m169155a();
                    BaseMailFragmentActivity baseMailFragmentActivity = BaseMailFragmentActivity.this;
                    a.mo152525a(baseMailFragmentActivity, str, eVar, z, baseMailFragmentActivity.f111381r, new DialogInterface.OnClickListener() {
                        /* class com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity.RunnableC439072.DialogInterface$OnClickListenerC439081 */

                        public void onClick(DialogInterface dialogInterface, int i) {
                            if (!z && !BaseMailFragmentActivity.this.isFinishing() && TextUtils.equals(eVar.mo151848b(), BaseMailFragmentActivity.this.f111382s)) {
                                BaseMailFragmentActivity.this.finish();
                            }
                        }
                    });
                }
            });
        }
    }
}
