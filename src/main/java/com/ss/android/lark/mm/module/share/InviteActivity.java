package com.ss.android.lark.mm.module.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mm.base.IFragmentManager;
import com.ss.android.lark.mm.base.MmBaseActivity;
import com.ss.android.lark.mm.module.floatwindow.api.ForbiddenMini;
import com.ss.android.lark.mm.module.share.fragment.FragmentType;
import com.ss.android.lark.mm.module.share.fragment.ShareBaseFragment;
import com.ss.android.lark.mm.module.share.fragment.ShareFragmentFactory;
import com.ss.android.lark.mm.module.share.model.SharePermission;
import com.ss.android.lark.mm.module.share.repo.ShareRepo;
import com.ss.android.lark.mm.statistics.hitpoint.C47084f;
import com.ss.android.lark.mm.statistics.hitpoint.MmHitPointContextProvider;
import com.ss.android.lark.mm.utils.C47103g;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@ForbiddenMini
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\u0012\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/mm/module/share/InviteActivity;", "Lcom/ss/android/lark/mm/base/MmBaseActivity;", "Lcom/ss/android/lark/mm/base/IFragmentManager;", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContextProvider;", "()V", "allowExternalShare", "", "canTransfer", "fromSource", "", "repoId", "", "selfPermission", "Lcom/ss/android/lark/mm/module/share/model/SharePermission;", "add", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/mm/module/share/fragment/FragmentType;", "getMmHitPointContext", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "pop", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InviteActivity extends MmBaseActivity implements IFragmentManager, MmHitPointContextProvider {

    /* renamed from: b */
    public static final Companion f118242b = new Companion(null);

    /* renamed from: c */
    private String f118243c;

    /* renamed from: d */
    private boolean f118244d;

    /* renamed from: e */
    private boolean f118245e;

    /* renamed from: f */
    private SharePermission f118246f = SharePermission.NONE;

    /* renamed from: g */
    private int f118247g = 14;

    /* renamed from: h */
    private HashMap f118248h;

    /* renamed from: a */
    public Context mo164942a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    @Override // com.ss.android.lark.mm.base.MmBaseActivity
    /* renamed from: a */
    public View mo161162a(int i) {
        if (this.f118248h == null) {
            this.f118248h = new HashMap();
        }
        View view = (View) this.f118248h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f118248h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo164943a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m185990a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m185988a(this, configuration);
    }

    /* renamed from: d */
    public Resources mo164945d() {
        return super.getResources();
    }

    /* renamed from: f */
    public void mo164946f() {
        super.onStop();
    }

    /* renamed from: g */
    public AssetManager mo164947g() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m185992c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m185989a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m185991b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J>\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/mm/module/share/InviteActivity$Companion;", "", "()V", "INTENT_PARAM_ALLOW_EXTERNAL_SHARE", "", "INTENT_PARAM_CAN_TRANSFER", "INTENT_PARAM_FROM_SOURCE", "INTENT_PARAM_REPO_ID", "INTENT_PARAM_SELF_PERMISSION", "INTENT_PARAM_TYPE", "start", "", "context", "Landroid/content/Context;", "repoId", ShareHitPoint.f121869d, "Lcom/ss/android/lark/mm/module/share/fragment/FragmentType;", "allowExternalShare", "", "canTransfer", "selfPermission", "Lcom/ss/android/lark/mm/module/share/model/SharePermission;", "fromSource", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.InviteActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo164949a(Context context, String str, FragmentType fragmentType, boolean z, boolean z2, SharePermission sharePermission, int i) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "repoId");
            Intrinsics.checkParameterIsNotNull(fragmentType, ShareHitPoint.f121869d);
            Intrinsics.checkParameterIsNotNull(sharePermission, "selfPermission");
            Intent intent = new Intent(context, InviteActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.putExtra("repoId", str);
            intent.putExtra(ShareHitPoint.f121869d, fragmentType.toString());
            intent.putExtra("allowExternalShare", z);
            intent.putExtra("canTransfer", z2);
            intent.putExtra("SharePermission", sharePermission.toString());
            intent.putExtra("fromSource", i);
            context.startActivity(intent);
        }
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        bj_();
    }

    @Override // com.ss.android.lark.mm.statistics.hitpoint.MmHitPointContextProvider
    /* renamed from: e */
    public C47084f mo161231e() {
        ShareRepo.Companion aVar = ShareRepo.f118326e;
        String str = this.f118243c;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("repoId");
        }
        ShareRepo b = aVar.mo165209b(str);
        if (b != null) {
            return b.mo165206i();
        }
        return null;
    }

    @Override // com.ss.android.lark.mm.base.IFragmentManager
    public void bj_() {
        if (!isDestroyed() && !isFinishing()) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "supportFragmentManager");
            if (supportFragmentManager.getFragments().size() == 2) {
                FragmentManager supportFragmentManager2 = getSupportFragmentManager();
                Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager2, "supportFragmentManager");
                List<Fragment> fragments = supportFragmentManager2.getFragments();
                Intrinsics.checkExpressionValueIsNotNull(fragments, "supportFragmentManager.fragments");
                Iterator<T> it = fragments.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof ShareBaseFragment)) {
                        finish();
                        return;
                    }
                }
            }
            FragmentManager supportFragmentManager3 = getSupportFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager3, "supportFragmentManager");
            if (supportFragmentManager3.getFragments().size() == 1) {
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
    public static Resources m185989a(InviteActivity inviteActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteActivity);
        }
        return inviteActivity.mo164945d();
    }

    /* renamed from: c */
    public static AssetManager m185992c(InviteActivity inviteActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteActivity);
        }
        return inviteActivity.mo164947g();
    }

    /* renamed from: b */
    public static void m185991b(InviteActivity inviteActivity) {
        inviteActivity.mo164946f();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            InviteActivity inviteActivity2 = inviteActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    inviteActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mm.base.MmBaseActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C47103g.m186549b(this);
        setContentView(R.layout.mm_activity_invite);
        this.f118244d = getIntent().getBooleanExtra("allowExternalShare", false);
        this.f118245e = getIntent().getBooleanExtra("canTransfer", false);
        String stringExtra = getIntent().getStringExtra("SharePermission");
        if (stringExtra == null) {
            stringExtra = "0";
        }
        this.f118246f = SharePermission.valueOf(stringExtra);
        this.f118247g = getIntent().getIntExtra("fromSource", 14);
        String stringExtra2 = getIntent().getStringExtra("repoId");
        if (stringExtra2 != null) {
            this.f118243c = stringExtra2;
            String stringExtra3 = getIntent().getStringExtra(ShareHitPoint.f121869d);
            if (stringExtra3 != null) {
                Intrinsics.checkExpressionValueIsNotNull(stringExtra3, "intent.getStringExtra(INTENT_PARAM_TYPE) ?: return");
                mo161184a(FragmentType.valueOf(stringExtra3));
            }
        }
    }

    @Override // com.ss.android.lark.mm.base.IFragmentManager
    /* renamed from: a */
    public void mo161184a(FragmentType fragmentType) {
        Intrinsics.checkParameterIsNotNull(fragmentType, ShareHitPoint.f121869d);
        if (!(isDestroyed() || isFinishing())) {
            if (fragmentType == FragmentType.Permission) {
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "supportFragmentManager");
                List<Fragment> fragments = supportFragmentManager.getFragments();
                Intrinsics.checkExpressionValueIsNotNull(fragments, "supportFragmentManager.fragments");
                for (T t : fragments) {
                    if (t instanceof ShareBaseFragment) {
                        getSupportFragmentManager().beginTransaction().remove(t).commit();
                    }
                }
            }
            ShareFragmentFactory eVar = ShareFragmentFactory.f118301a;
            String str = this.f118243c;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("repoId");
            }
            ShareBaseFragment a = eVar.mo164992a(str, fragmentType, this.f118244d, this.f118245e, this.f118246f, this, this.f118247g);
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
            beginTransaction.setCustomAnimations(R.anim.common_slide_right_in, 0);
            beginTransaction.add(R.id.containerFragment, a).commit();
            beginTransaction.addToBackStack(null);
        }
    }

    /* renamed from: a */
    public static void m185990a(InviteActivity inviteActivity, Context context) {
        inviteActivity.mo164943a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteActivity);
        }
    }

    /* renamed from: a */
    public static Context m185988a(InviteActivity inviteActivity, Configuration configuration) {
        Context a = inviteActivity.mo164942a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
