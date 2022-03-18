package com.ss.android.openbusiness.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import com.p078b.p079a.C2052c;
import com.p078b.p079a.C2057g;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.openbusiness.AbstractC59446a;
import com.ss.android.openbusiness.C59480b;
import com.ss.android.openbusiness.OpbScene;
import com.ss.android.openbusiness.data.C59566a;
import com.ss.android.openbusiness.event.EventManager;
import com.ss.android.openbusiness.event.p3008a.C59594b;
import com.ss.android.openbusiness.p3003a.C59457d;
import com.ss.android.openbusiness.ui.C59602b;
import com.ss.android.openbusiness.ui.StatusController;

public class OpbActivity extends BaseActivity {

    /* renamed from: b */
    public C2057g f147659b;

    /* renamed from: c */
    public FrameLayout f147660c;

    /* renamed from: d */
    public RecyclerView f147661d;

    /* renamed from: e */
    public OpbScene f147662e;

    /* renamed from: f */
    private StatusController f147663f;

    /* renamed from: g */
    private C59457d f147664g;

    /* renamed from: h */
    private EventManager f147665h;

    /* renamed from: i */
    private String f147666i;

    /* renamed from: a */
    public Context mo202774a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo202775a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m230839a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m230836a(this, configuration);
    }

    /* renamed from: d */
    public Resources mo202779d() {
        return super.getResources();
    }

    /* renamed from: e */
    public void mo202780e() {
        super.onStop();
    }

    /* renamed from: f */
    public AssetManager mo202781f() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m230841c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m230837a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m230840b(this);
    }

    /* renamed from: c */
    public void mo202777c() {
        finish();
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void finish() {
        setResult(-1, new Intent());
        super.finish();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        this.f147665h.mo202986b();
    }

    /* renamed from: g */
    private void m230842g() {
        Bundle extras = getIntent().getExtras();
        this.f147662e = (OpbScene) extras.getSerializable("scene");
        this.f147666i = extras.getString("uuid");
    }

    /* renamed from: b */
    public void mo202776b() {
        this.f147663f.mo203016a(StatusController.Status.LOADING);
        EventBus.getDefault().trigger(new C59594b(this.f147662e));
    }

    /* renamed from: i */
    private void m230844i() {
        StatusController statusController = new StatusController(findViewById(R.id.opb_content), findViewById(R.id.opb_error_wrapper), new StatusController.AbstractC59600b() {
            /* class com.ss.android.openbusiness.activity.OpbActivity.C594754 */

            @Override // com.ss.android.openbusiness.ui.StatusController.AbstractC59600b
            /* renamed from: b */
            public void mo202787b() {
                OpbActivity.this.f147659b.mo10130b();
            }

            @Override // com.ss.android.openbusiness.ui.StatusController.AbstractC59600b
            /* renamed from: a */
            public void mo202786a() {
                OpbActivity opbActivity = OpbActivity.this;
                opbActivity.f147659b = C2052c.m8961a(opbActivity.f147660c).mo10151a(R.layout.opb_activity_skeleton).mo10152a(false).mo10153a();
                OpbActivity.this.f147661d.setVisibility(0);
            }
        });
        this.f147663f = statusController;
        statusController.mo203015a(findViewById(R.id.opb_empty_wrapper), StatusController.Status.EMPTY);
        this.f147663f.mo203019a(true);
    }

    /* renamed from: h */
    private void m230843h() {
        int i;
        this.f147660c = (FrameLayout) findViewById(R.id.opb_content);
        this.f147661d = (RecyclerView) findViewById(R.id.recycler);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new C59476a());
        itemTouchHelper.attachToRecyclerView(this.f147661d);
        C59457d dVar = new C59457d(this, itemTouchHelper, this.f147666i, this.f147662e);
        this.f147664g = dVar;
        this.f147661d.setAdapter(dVar);
        this.f147661d.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        findViewById(R.id.tv_retry).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.openbusiness.activity.OpbActivity.View$OnClickListenerC594721 */

            public void onClick(View view) {
                OpbActivity.this.mo202776b();
            }
        });
        findViewById(R.id.opb_title_back).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.openbusiness.activity.OpbActivity.View$OnClickListenerC594732 */

            public void onClick(View view) {
                OpbActivity.this.mo202777c();
            }
        });
        findViewById(R.id.tv_retry).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.openbusiness.activity.$$Lambda$OpbActivity$lcCJjFiRIQBMDXZThOijpbAqUw */

            public final void onClick(View view) {
                OpbActivity.this.m230838a((OpbActivity) view);
            }
        });
        m230845j();
        TextView textView = (TextView) findViewById(R.id.opb_title_text);
        if (this.f147662e == OpbScene.MESSAGE_ACTION) {
            i = R.string.Lark_OpenPlatform_MsgScBttn;
        } else {
            i = R.string.Lark_OpenPlatform_InputScMoreBttn;
        }
        textView.setText(i);
        final TextView textView2 = (TextView) findViewById(R.id.empty_tip_text);
        Context context = textView2.getContext();
        C59478b.m230864a(context, textView2, textView2.getContext().getString(R.string.Lark_OpenPlatform_ScTryCustomAppsDesc) + " ", R.color.text_caption, textView2.getContext().getString(R.string.Lark_OpenPlatform_ScCustomAppsBpHyperlink), R.color.text_link_normal, new View.OnClickListener() {
            /* class com.ss.android.openbusiness.activity.OpbActivity.View$OnClickListenerC594743 */

            public void onClick(View view) {
                String str;
                AbstractC59446a a = C59480b.m230865a();
                Context context = textView2.getContext();
                if (OpbActivity.this.f147662e == OpbScene.MESSAGE_ACTION) {
                    str = C59566a.m231079a().mo202959b();
                } else {
                    str = C59566a.m231079a().mo202960c();
                }
                a.mo144873a(context, str, null, false, null, null);
            }
        });
    }

    /* renamed from: j */
    private void m230845j() {
        String str;
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append("OpbActivity_GUIDE_");
        if (this.f147662e == OpbScene.MESSAGE_ACTION) {
            str = "msg_action";
        } else {
            str = "plus_menu";
        }
        sb.append(str);
        String sb2 = sb.toString();
        if (!UserSP.getInstance().getBoolean(sb2, false)) {
            UserSP.getInstance().putBoolean(sb2, true);
            if (this.f147662e == OpbScene.MESSAGE_ACTION) {
                i = R.string.Lark_OpenPlatform_ScOnboardingMsgTtl;
            } else {
                i = R.string.Lark_OpenPlatform_InputScOnboardingMsgTtl;
            }
            ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this).contentLayoutRes(R.layout.opb_guide_layout)).controller(new C59602b(this, this.f147662e))).title(i)).titlePadding(-1, -1, -1, 20)).titleGravity(3)).backgroundColor(R.color.bg_float)).cancelOnTouchOutside(false)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_OpenPlatform_ScContinueBttn, (DialogInterface.OnClickListener) null)).show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m230838a(View view) {
        mo202776b();
    }

    /* renamed from: a */
    public static Resources m230837a(OpbActivity opbActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(opbActivity);
        }
        return opbActivity.mo202779d();
    }

    /* renamed from: c */
    public static AssetManager m230841c(OpbActivity opbActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(opbActivity);
        }
        return opbActivity.mo202781f();
    }

    /* renamed from: b */
    public static void m230840b(OpbActivity opbActivity) {
        opbActivity.mo202780e();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            OpbActivity opbActivity2 = opbActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    opbActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.openbusiness.activity.BaseActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.opb_activity);
        m230842g();
        m230843h();
        m230844i();
        EventManager eventManager = new EventManager(this, this.f147664g, this.f147663f, this.f147661d, this.f147662e);
        this.f147665h = eventManager;
        eventManager.mo202983a();
        this.f147663f.mo203016a(StatusController.Status.LOADING);
        EventBus.getDefault().trigger(new C59594b(this.f147662e));
    }

    /* renamed from: a */
    public static void m230839a(OpbActivity opbActivity, Context context) {
        opbActivity.mo202775a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(opbActivity);
        }
    }

    /* renamed from: a */
    public static Context m230836a(OpbActivity opbActivity, Configuration configuration) {
        Context a = opbActivity.mo202774a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
