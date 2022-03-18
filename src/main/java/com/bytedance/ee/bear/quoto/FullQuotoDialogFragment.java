package com.bytedance.ee.bear.quoto;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.bizwidget.p271a.C4860a;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.C13655e;
import com.bytedance.ee.util.p718t.C13742g;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J&\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/quoto/FullQuotoDialogFragment;", "Lcom/bytedance/ee/bear/bizwidget/dialogfragment/BaseBottomSheetDialogFragment;", "config", "Lcom/bytedance/ee/bear/quoto/FullQuotoConfig;", "(Lcom/bytedance/ee/bear/quoto/FullQuotoConfig;)V", "getConfig", "()Lcom/bytedance/ee/bear/quoto/FullQuotoConfig;", "gotoContactService", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "Companion", "quoto_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.quoto.h */
public final class FullQuotoDialogFragment extends C4860a {

    /* renamed from: c */
    public static long f28360c;

    /* renamed from: d */
    public static final Companion f28361d = new Companion(null);

    /* renamed from: e */
    private final FullQuotoConfig f28362e;

    /* renamed from: f */
    private HashMap f28363f;

    public FullQuotoDialogFragment() {
        this(null, 1, null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m43795a(FragmentActivity fragmentActivity, FullQuotoConfig fullQuotoConfig) {
        f28361d.mo40024a(fragmentActivity, fullQuotoConfig);
    }

    /* renamed from: g */
    public void mo40023g() {
        HashMap hashMap = this.f28363f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo40023g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/quoto/FullQuotoDialogFragment$Companion;", "", "()V", "BOE_CONTACT_SERVICE_URL", "", "CONTACT_SERVICE_URL", "TAG", "lastShowTime", "", "isOversea", "", "report", "", "event", "map", "", "show", "activity", "Landroidx/fragment/app/FragmentActivity;", "config", "Lcom/bytedance/ee/bear/quoto/FullQuotoConfig;", "quoto_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.quoto.h$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        private final boolean m43799a() {
            al d = C4511g.m18594d();
            Intrinsics.checkExpressionValueIsNotNull(d, "InfoProvideServiceImp.getInstance()");
            return d.mo17345F();
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.quoto.h$a$a */
        public static final class RunnableC10570a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ FullQuotoConfig f28364a;

            /* renamed from: b */
            final /* synthetic */ FragmentActivity f28365b;

            RunnableC10570a(FullQuotoConfig fullQuotoConfig, FragmentActivity fragmentActivity) {
                this.f28364a = fullQuotoConfig;
                this.f28365b = fragmentActivity;
            }

            public final void run() {
                new FullQuotoDialogFragment(this.f28364a).mo5511a(this.f28365b.getSupportFragmentManager(), "FullQuotoDialogFragment");
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final void m43798a(String str, Map<String, Object> map) {
            new C10917c(new C10929e());
            AccountService.Account f = ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f();
            Intrinsics.checkExpressionValueIsNotNull(f, "KoinJavaComponent.get(Lo…java).findUserFromCache()");
            if (f != null) {
                map.put("admin_flag", String.valueOf(f.f14603t) + "");
            }
            map.put("target", "none");
            C5234y.m21391b().mo21079a(str, map);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo40024a(FragmentActivity fragmentActivity, FullQuotoConfig fullQuotoConfig) {
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
            Intrinsics.checkParameterIsNotNull(fullQuotoConfig, "config");
            C13479a.m54764b("FullQuotoDialogFragment", "show config == " + fullQuotoConfig.name());
            Lifecycle lifecycle = fragmentActivity.getLifecycle();
            Intrinsics.checkExpressionValueIsNotNull(lifecycle, "activity.lifecycle");
            Lifecycle.State currentState = lifecycle.getCurrentState();
            Intrinsics.checkExpressionValueIsNotNull(currentState, "activity.lifecycle.currentState");
            C13479a.m54764b("FullQuotoDialogFragment", "currentState +=" + currentState);
            if (currentState.isAtLeast(Lifecycle.State.RESUMED)) {
                if (System.currentTimeMillis() - FullQuotoDialogFragment.f28360c <= ((long) 2000)) {
                    C13479a.m54764b("FullQuotoDialogFragment", "return by deconded");
                } else if (fullQuotoConfig.getMainTitleId() == R.string.CreationMobile_ECM_SpaceMaxToast && m43799a()) {
                    C13479a.m54764b("FullQuotoDialogFragment", "isOverSea && isStorage return");
                } else if (fragmentActivity.getSupportFragmentManager().findFragmentByTag("FullQuotoDialogFragment") == null) {
                    FullQuotoDialogFragment.f28360c = System.currentTimeMillis();
                    m43798a("common_pricing_popup_view", MapsKt.mutableMapOf(new Pair("function_type", fullQuotoConfig.getReportType())));
                    C13742g.m55711d(new RunnableC10570a(fullQuotoConfig, fragmentActivity));
                } else {
                    C13479a.m54764b("FullQuotoDialogFragment", "already has fragment");
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo40022f() {
        String str;
        if (((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20121b() != 1) {
            str = "https://applink.feishu.cn/client/helpdesk/open?id=6934871265543159828&extra=%7B%22channel%22%3A14%2C%22created_at%22%3A1617246713%2C%22human_service%22%3Atrue%2C%22scenario_id%22%3A6937491551345967123%2C%22signature%22%3A%229df9ed53d1cd7fd62be8055f37ab2f8b8cf71583%22%7D";
        } else {
            str = "https://applink.feishu.cn/client/helpdesk/open?id=6626260912531570952&extra=%7B%22channel%22%3A14%2C%22created_at%22%3A1616898084%2C%22human_service%22%3Atrue%2C%22scenario_id%22%3A6888204905589325826%2C%22signature%22%3A%2278b0c5156b727a66d02c9b689ea0785d1a865bb5%22%7D";
        }
        ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17292a(str);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        View findViewById;
        if (this.f28362e != null) {
            super.onStart();
        }
        Dialog v_ = v_();
        if (v_ != null && (window = v_.getWindow()) != null && (findViewById = window.findViewById(R.id.design_bottom_sheet)) != null) {
            TextView textView = new TextView(findViewById.getContext());
            FullQuotoConfig fullQuotoConfig = this.f28362e;
            if (fullQuotoConfig == null) {
                Intrinsics.throwNpe();
            }
            textView.setText(fullQuotoConfig.getSubTitleId());
            int a = C13655e.m55409a() - C57582a.m223600a(32);
            textView.measure(View.MeasureSpec.makeMeasureSpec(a, 1073741824), View.MeasureSpec.makeMeasureSpec(a, Integer.MIN_VALUE));
            int lineCount = textView.getLineCount();
            int i = 348;
            if (lineCount > 2) {
                i = 348 + ((lineCount - 2) * 20);
            }
            findViewById.getLayoutParams().height = C13655e.m55411a(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/quoto/FullQuotoDialogFragment$onCreateView$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.quoto.h$b */
    static final class View$OnClickListenerC10571b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FullQuotoDialogFragment f28366a;

        View$OnClickListenerC10571b(FullQuotoDialogFragment hVar) {
            this.f28366a = hVar;
        }

        public final void onClick(View view) {
            this.f28366a.mo40022f();
            this.f28366a.mo5513b();
        }
    }

    public FullQuotoDialogFragment(FullQuotoConfig fullQuotoConfig) {
        this.f28362e = fullQuotoConfig;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FullQuotoDialogFragment(FullQuotoConfig fullQuotoConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fullQuotoConfig);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.full_quoto_dialog, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.placeHolder);
        FullQuotoConfig fullQuotoConfig = this.f28362e;
        if (fullQuotoConfig == null) {
            Intrinsics.throwNpe();
        }
        imageView.setImageResource(fullQuotoConfig.getPlaceHolderId());
        ((TextView) inflate.findViewById(R.id.mainTitle)).setText(this.f28362e.getMainTitleId());
        ((TextView) inflate.findViewById(R.id.subTitle)).setText(this.f28362e.getSubTitleId());
        inflate.findViewById(R.id.done).setOnClickListener(new View$OnClickListenerC10571b(this));
        return inflate;
    }
}
