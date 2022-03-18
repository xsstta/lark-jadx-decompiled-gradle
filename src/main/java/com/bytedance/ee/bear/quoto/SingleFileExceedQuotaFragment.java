package com.bytedance.ee.bear.quoto;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.bytedance.ee.bear.bizwidget.p271a.C4860a;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\u0006\u0010\u0012\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\u000fJ\u0012\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001d\u001a\u00020\u000fH\u0016J\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u001a\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010#\u001a\u00020\u000fH\u0002R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/bytedance/ee/bear/quoto/SingleFileExceedQuotaFragment;", "Lcom/bytedance/ee/bear/bizwidget/dialogfragment/BaseBottomSheetDialogFragment;", "()V", "mFileSize", "", "Ljava/lang/Long;", "mNeedReportClose", "", "mPresenter", "Lcom/bytedance/ee/bear/quoto/SingleFileExceedQuotaPresenter;", "mQuotaConfig", "Lcom/bytedance/ee/bear/quoto/SingleFileQuotaConfig;", "mRootView", "Landroid/view/View;", "gotoContactService", "", "gotoLarkCertExplain", "initMVP", "onClickContactService", "onClickDissAllowingStateLoss", "onClickLarkCertExplain", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onViewCreated", "view", "parseArgs", "Companion", "quoto_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.quoto.q */
public final class SingleFileExceedQuotaFragment extends C4860a {

    /* renamed from: c */
    public static final Companion f28370c = new Companion(null);

    /* renamed from: d */
    private View f28371d;

    /* renamed from: e */
    private C10586t f28372e;

    /* renamed from: f */
    private Long f28373f;

    /* renamed from: g */
    private SingleFileQuotaConfig f28374g;

    /* renamed from: h */
    private boolean f28375h = true;

    /* renamed from: i */
    private HashMap f28376i;

    @JvmStatic
    /* renamed from: a */
    public static final void m43823a(FragmentActivity fragmentActivity, SingleFileQuotaConfig singleFileQuotaConfig, long j) {
        f28370c.mo40039a(fragmentActivity, singleFileQuotaConfig, j);
    }

    /* renamed from: i */
    public void mo40038i() {
        HashMap hashMap = this.f28376i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo40038i();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/quoto/SingleFileExceedQuotaFragment$Companion;", "", "()V", "BOE_CONTACT_SERVICE_URL", "", "CONTACT_SERVICE_URL", "KEY_FILE_SIZE", "KEY_QUOTA_CONFIG", "LAKR_CERT_EXPLAIN_URL", "TAG", "show", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "quotaConfig", "Lcom/bytedance/ee/bear/quoto/SingleFileQuotaConfig;", "bytesTotal", "", "quoto_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.quoto.q$a */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.quoto.q$a$a */
        public static final class RunnableC10584a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ long f28377a;

            /* renamed from: b */
            final /* synthetic */ SingleFileQuotaConfig f28378b;

            /* renamed from: c */
            final /* synthetic */ FragmentActivity f28379c;

            RunnableC10584a(long j, SingleFileQuotaConfig singleFileQuotaConfig, FragmentActivity fragmentActivity) {
                this.f28377a = j;
                this.f28378b = singleFileQuotaConfig;
                this.f28379c = fragmentActivity;
            }

            public final void run() {
                Bundle bundle = new Bundle();
                bundle.putLong("key_file_size", this.f28377a);
                bundle.putParcelable("key_quota_config", this.f28378b);
                Fragment instantiate = C4860a.instantiate(this.f28379c, SingleFileExceedQuotaFragment.class.getName(), bundle);
                if (instantiate != null) {
                    ((SingleFileExceedQuotaFragment) instantiate).mo5511a(this.f28379c.getSupportFragmentManager(), "SingleFileExceedQuotaFragment");
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.quoto.SingleFileExceedQuotaFragment");
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo40039a(FragmentActivity fragmentActivity, SingleFileQuotaConfig singleFileQuotaConfig, long j) {
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
            Intrinsics.checkParameterIsNotNull(singleFileQuotaConfig, "quotaConfig");
            C13479a.m54764b("SingleFileExceedQuotaFragment", "SingleFileExceedQuotaFragment show");
            Lifecycle lifecycle = fragmentActivity.getLifecycle();
            Intrinsics.checkExpressionValueIsNotNull(lifecycle, "activity.lifecycle");
            Lifecycle.State currentState = lifecycle.getCurrentState();
            Intrinsics.checkExpressionValueIsNotNull(currentState, "activity.lifecycle.currentState");
            C13479a.m54764b("SingleFileExceedQuotaFragment", "currentState +=" + currentState);
            if (fragmentActivity.getSupportFragmentManager().findFragmentByTag("SingleFileExceedQuotaFragment") == null) {
                C13742g.m55711d(new RunnableC10584a(j, singleFileQuotaConfig, fragmentActivity));
            } else {
                C13479a.m54764b("SingleFileExceedQuotaFragment", "already has fragment");
            }
        }
    }

    /* renamed from: h */
    public final void mo40037h() {
        this.f28375h = false;
        mo5513b();
    }

    /* renamed from: m */
    private final void m43827m() {
        ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17292a("https://www.feishu.cn/hc/zh-CN/articles/360034114413");
    }

    /* renamed from: f */
    public final void mo40035f() {
        this.f28375h = false;
        m43826l();
        mo5513b();
    }

    /* renamed from: g */
    public final void mo40036g() {
        this.f28375h = false;
        m43827m();
        mo5513b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C10586t tVar = this.f28372e;
        if (tVar != null) {
            tVar.destroy();
        }
    }

    /* renamed from: j */
    private final void m43824j() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f28373f = Long.valueOf(arguments.getLong("key_file_size"));
            this.f28374g = (SingleFileQuotaConfig) arguments.getParcelable("key_quota_config");
        }
    }

    /* renamed from: k */
    private final void m43825k() {
        C10586t tVar = new C10586t(new C10585s(), new C10589v(this.f28371d, this, getContext(), this.f28374g), this.f28373f);
        this.f28372e = tVar;
        if (tVar != null) {
            tVar.create();
        }
    }

    /* renamed from: l */
    private final void m43826l() {
        String str;
        if (((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20121b() != 1) {
            str = "https://applink.feishu.cn/client/helpdesk/open?id=6934871265543159828&extra=%7B%22channel%22%3A14%2C%22created_at%22%3A1617246713%2C%22human_service%22%3Atrue%2C%22scenario_id%22%3A6937491551345967123%2C%22signature%22%3A%229df9ed53d1cd7fd62be8055f37ab2f8b8cf71583%22%7D";
        } else {
            str = "https://applink.feishu.cn/client/helpdesk/open?id=6626260912531570952&extra=%7B%22channel%22%3A14%2C%22created_at%22%3A1616898084%2C%22human_service%22%3Atrue%2C%22scenario_id%22%3A6888204905589325826%2C%22signature%22%3A%2278b0c5156b727a66d02c9b689ea0785d1a865bb5%22%7D";
        }
        ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17292a(str);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m43824j();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    public void onDismiss(DialogInterface dialogInterface) {
        String str;
        Boolean bool;
        Intrinsics.checkParameterIsNotNull(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        if (this.f28375h) {
            AbstractC5233x b = C5234y.m21391b();
            C10586t tVar = this.f28372e;
            String str2 = null;
            if (tVar != null) {
                str = tVar.mo40044d();
            } else {
                str = null;
            }
            C10586t tVar2 = this.f28372e;
            if (tVar2 != null) {
                bool = tVar2.mo40042b();
            } else {
                bool = null;
            }
            C10586t tVar3 = this.f28372e;
            if (tVar3 != null) {
                str2 = tVar3.mo40043c();
            }
            C10583p.m43821a(b, str, bool, str2, "close");
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m43825k();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_single_file_quota_layout, viewGroup, true);
        this.f28371d = inflate;
        return inflate;
    }
}
