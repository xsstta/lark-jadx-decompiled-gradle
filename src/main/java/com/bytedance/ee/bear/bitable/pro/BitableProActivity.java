package com.bytedance.ee.bear.bitable.pro;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.ee.bear.TableSimpleInfo;
import com.bytedance.ee.bear.bitable.pro.member.BitableRoleMemberManagerFragment;
import com.bytedance.ee.bear.bitable.pro.roledetail.BitableProRoleDetailFragment;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/bitable/pro/BitableProActivity;", "Lcom/bytedance/ee/bear/facade/common/BaseActivity;", "Lcom/bytedance/ee/bear/bitable/pro/IBitableProPageTrigger;", "()V", "ownerId", "", "tableList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/TableSimpleInfo;", "Lkotlin/collections/ArrayList;", "token", "onDoCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "triggerToInviteMember", "role", "Lcom/bytedance/ee/bear/bitable/pro/Role;", "triggerToMemberManager", "triggerToRoleDetail", "Companion", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BitableProActivity extends BaseActivity implements IBitableProPageTrigger {

    /* renamed from: a */
    public static final Companion f14142a = new Companion(null);

    /* renamed from: b */
    private String f14143b = "";

    /* renamed from: c */
    private ArrayList<TableSimpleInfo> f14144c = new ArrayList<>();

    /* renamed from: d */
    private String f14145d = "";

    /* renamed from: a */
    public Context mo18859a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo18860a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo18861a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m19897a(this, context);
    }

    /* renamed from: b */
    public void mo18863b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo18865c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m19895a(this, configuration);
    }

    public AssetManager getAssets() {
        return m19899c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m19896a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m19898b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/bitable/pro/BitableProActivity$Companion;", "", "()V", "EXTRA_OWNER_ID", "", "EXTRA_TABLE_LIST", "EXTRA_TOKEN", "TAG", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.BitableProActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public static Resources m19896a(BitableProActivity bitableProActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(bitableProActivity);
        }
        return bitableProActivity.mo18860a();
    }

    /* renamed from: c */
    public static AssetManager m19899c(BitableProActivity bitableProActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(bitableProActivity);
        }
        return bitableProActivity.mo18865c();
    }

    /* renamed from: b */
    public static void m19898b(BitableProActivity bitableProActivity) {
        bitableProActivity.mo18863b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            BitableProActivity bitableProActivity2 = bitableProActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    bitableProActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.bytedance.ee.bear.bitable.pro.IBitableProPageTrigger
    /* renamed from: c */
    public void mo18866c(Role role) {
        Intrinsics.checkParameterIsNotNull(role, "role");
        getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.facade_slide_right_in, R.anim.facade_slide_left_out, R.anim.facade_slide_left_in, R.anim.facade_slide_right_out).add(16908290, BitableRoleMemberManagerFragment.f14165f.mo18924a(this.f14143b, this.f14144c, role)).addToBackStack(null).commitAllowingStateLoss();
    }

    @Override // com.bytedance.ee.bear.bitable.pro.IBitableProPageTrigger
    /* renamed from: b */
    public void mo18864b(Role role) {
        Intrinsics.checkParameterIsNotNull(role, "role");
        ((AbstractC10157c) KoinJavaComponent.m268613a(AbstractC10157c.class, null, null, 6, null)).mo36639b().mo36674a(this, this.f14143b, role.getRoleId(), this.f14145d, role.getMembers());
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        String stringExtra = getIntent().getStringExtra("extra_token");
        String str = "";
        if (stringExtra == null) {
            stringExtra = str;
        }
        this.f14143b = stringExtra;
        Serializable serializableExtra = getIntent().getSerializableExtra("extra_table_list");
        if (serializableExtra != null) {
            this.f14144c = (ArrayList) serializableExtra;
            String stringExtra2 = getIntent().getStringExtra("extra_owner_id");
            if (stringExtra2 != null) {
                str = stringExtra2;
            }
            this.f14145d = str;
            getSupportFragmentManager().beginTransaction().replace(16908290, BitableProFragment.f14197c.mo18939a(this.f14143b, this.f14144c)).commitAllowingStateLoss();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<com.bytedance.ee.bear.TableSimpleInfo> /* = java.util.ArrayList<com.bytedance.ee.bear.TableSimpleInfo> */");
    }

    @Override // com.bytedance.ee.bear.bitable.pro.IBitableProPageTrigger
    /* renamed from: a */
    public void mo18862a(Role role) {
        Intrinsics.checkParameterIsNotNull(role, "role");
        getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.facade_slide_right_in, R.anim.facade_slide_left_out, R.anim.facade_slide_left_in, R.anim.facade_slide_right_out).add(16908290, BitableProRoleDetailFragment.f14190b.mo18934a(role)).addToBackStack(null).commitAllowingStateLoss();
    }

    /* renamed from: a */
    public static void m19897a(BitableProActivity bitableProActivity, Context context) {
        bitableProActivity.mo18861a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(bitableProActivity);
        }
    }

    /* renamed from: a */
    public static Context m19895a(BitableProActivity bitableProActivity, Configuration configuration) {
        Context a = bitableProActivity.mo18859a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
