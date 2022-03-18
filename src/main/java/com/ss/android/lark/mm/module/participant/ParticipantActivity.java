package com.ss.android.lark.mm.module.participant;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.gson.Gson;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mm.base.IFragmentManager;
import com.ss.android.lark.mm.base.MmBaseActivity;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.mm.module.participant.add.MmParticipantAddFragment;
import com.ss.android.lark.mm.module.share.fragment.FragmentType;
import com.ss.android.lark.mm.statistics.hitpoint.C47084f;
import com.ss.android.lark.mm.statistics.hitpoint.MmHitPointContextProvider;
import com.ss.android.lark.mm.utils.C47098d;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ParticipantActivity extends MmBaseActivity implements IFragmentManager, MmHitPointContextProvider {

    /* renamed from: b */
    public static final Companion f117145b = new Companion(null);

    /* renamed from: c */
    private String f117146c;

    /* renamed from: d */
    private int f117147d = 14;

    /* renamed from: e */
    private C47084f f117148e;

    /* renamed from: f */
    private HashMap f117149f;

    /* renamed from: a */
    public Context mo163465a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    @Override // com.ss.android.lark.mm.base.MmBaseActivity
    /* renamed from: a */
    public View mo161162a(int i) {
        if (this.f117149f == null) {
            this.f117149f = new HashMap();
        }
        View view = (View) this.f117149f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f117149f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo163466a(Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m184088a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m184086a(this, configuration);
    }

    /* renamed from: d */
    public Resources mo163468d() {
        return super.getResources();
    }

    /* renamed from: f */
    public void mo163469f() {
        super.onStop();
    }

    /* renamed from: g */
    public AssetManager mo163470g() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m184090c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m184087a(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m184089b(this);
    }

    /* renamed from: com.ss.android.lark.mm.module.participant.ParticipantActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo163472a(Context context, String str, String str2, String str3, MmBaseInfo mmBaseInfo, FragmentType fragmentType) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "host");
            Intrinsics.checkParameterIsNotNull(str2, "objectToken");
            Intrinsics.checkParameterIsNotNull(str3, "trackContext");
            Intrinsics.checkParameterIsNotNull(mmBaseInfo, "baseInfo");
            Intrinsics.checkParameterIsNotNull(fragmentType, "fragmentType");
            Intent intent = new Intent(context, ParticipantActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.putExtra(ShareHitPoint.f121869d, fragmentType.toString());
            intent.putExtra("host", str);
            intent.putExtra("objectToken", str2);
            intent.putExtra("fromSource", 0);
            intent.putExtra("trackContext", str3);
            intent.putExtra("baseInfo_extra", mmBaseInfo);
            context.startActivity(intent);
        }

        /* renamed from: a */
        public static /* synthetic */ void m184099a(Companion aVar, Context context, String str, String str2, String str3, MmBaseInfo mmBaseInfo, FragmentType fragmentType, int i, Object obj) {
            if ((i & 32) != 0) {
                fragmentType = FragmentType.Participant;
            }
            aVar.mo163472a(context, str, str2, str3, mmBaseInfo, fragmentType);
        }
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        bj_();
    }

    @Override // com.ss.android.lark.mm.statistics.hitpoint.MmHitPointContextProvider
    /* renamed from: e */
    public C47084f mo161231e() {
        C47084f fVar = this.f117148e;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trackContext");
        }
        return fVar;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mm.base.MmBaseActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        super.onDestroy();
        ParticipantRepo.Companion aVar = ParticipantRepo.f117152e;
        String str = this.f117146c;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("repoId");
        }
        aVar.mo163489a(str);
    }

    @Override // com.ss.android.lark.mm.base.IFragmentManager
    public void bj_() {
        if (C47098d.m186535b(this)) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "supportFragmentManager");
            if (supportFragmentManager.getFragments().size() == 1) {
                finish();
                return;
            }
            Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.containerFragment);
            if (findFragmentById != null) {
                FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
                beginTransaction.setCustomAnimations(0, R.anim.slide_right_out);
                beginTransaction.remove(findFragmentById);
                beginTransaction.commit();
            }
        }
    }

    /* renamed from: a */
    public static Resources m184087a(ParticipantActivity participantActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(participantActivity);
        }
        return participantActivity.mo163468d();
    }

    /* renamed from: c */
    public static AssetManager m184090c(ParticipantActivity participantActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(participantActivity);
        }
        return participantActivity.mo163470g();
    }

    /* renamed from: b */
    public static void m184089b(ParticipantActivity participantActivity) {
        participantActivity.mo163469f();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ParticipantActivity participantActivity2 = participantActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    participantActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.ss.android.lark.mm.base.IFragmentManager
    /* renamed from: a */
    public void mo161184a(FragmentType fragmentType) {
        Intrinsics.checkParameterIsNotNull(fragmentType, ShareHitPoint.f121869d);
        if (fragmentType == FragmentType.Participant) {
            String str = this.f117146c;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("repoId");
            }
            ParticipantFragment aVar = new ParticipantFragment(str, this, this.f117147d);
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
            beginTransaction.add(R.id.containerFragment, aVar).commit();
            Intrinsics.checkExpressionValueIsNotNull(beginTransaction.addToBackStack(null), "ft.addToBackStack(null)");
        } else if (fragmentType == FragmentType.AddParticipant) {
            String str2 = this.f117146c;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("repoId");
            }
            MmParticipantAddFragment bVar = new MmParticipantAddFragment(str2, this);
            FragmentTransaction beginTransaction2 = getSupportFragmentManager().beginTransaction();
            Intrinsics.checkExpressionValueIsNotNull(beginTransaction2, "supportFragmentManager.beginTransaction()");
            beginTransaction2.setCustomAnimations(R.anim.common_slide_right_in, 0);
            beginTransaction2.add(R.id.containerFragment, bVar).commit();
            beginTransaction2.addToBackStack("123");
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mm.base.MmBaseActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mm_activity_invite);
        bd_();
        FrameLayout frameLayout = (FrameLayout) mo161162a(R.id.containerFragment);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "containerFragment");
        mo161163a(frameLayout);
        this.f117147d = getIntent().getIntExtra("fromSource", 14);
        String stringExtra = getIntent().getStringExtra("host");
        String stringExtra2 = getIntent().getStringExtra("objectToken");
        Serializable serializableExtra = getIntent().getSerializableExtra("baseInfo_extra");
        if (!(serializableExtra instanceof MmBaseInfo)) {
            serializableExtra = null;
        }
        MmBaseInfo mmBaseInfo = (MmBaseInfo) serializableExtra;
        if (stringExtra == null || stringExtra2 == null || mmBaseInfo == null) {
            finish();
            return;
        }
        this.f117146c = ParticipantRepo.f117152e.mo163488a(stringExtra, stringExtra2, mmBaseInfo);
        Object fromJson = new Gson().fromJson(getIntent().getStringExtra("trackContext"), C47084f.class);
        Intrinsics.checkExpressionValueIsNotNull(fromJson, "Gson().fromJson(\n       …ext::class.java\n        )");
        this.f117148e = (C47084f) fromJson;
        String stringExtra3 = getIntent().getStringExtra(ShareHitPoint.f121869d);
        if (stringExtra3 != null) {
            Intrinsics.checkExpressionValueIsNotNull(stringExtra3, "intent.getStringExtra(INTENT_PARAM_TYPE) ?: return");
            mo161184a(FragmentType.valueOf(stringExtra3));
        }
    }

    /* renamed from: a */
    public static void m184088a(ParticipantActivity participantActivity, Context context) {
        participantActivity.mo163466a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(participantActivity);
        }
    }

    /* renamed from: a */
    public static Context m184086a(ParticipantActivity participantActivity, Configuration configuration) {
        Context a = participantActivity.mo163465a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
