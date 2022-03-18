package com.ss.android.appcenter.business.tab.business.blockit;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.larksuite.component.universe_design.tab.UDTab;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.tab.business.widget.BlockLogTracer;
import com.ss.android.appcenter.business.tab.business.widget.C27952c;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 !2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001!B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0006\u0010\u0010\u001a\u00020\u000fJ\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001a\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/appcenter/business/tab/business/blockit/BlockLogFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/lifecycle/Observer;", "Lcom/ss/android/appcenter/business/tab/business/widget/BlockLogTracer$LogText;", "Lcom/larksuite/component/universe_design/tab/UDTabLayout$OnTabSelectedListener;", "()V", "key", "", "logTracer", "Lcom/ss/android/appcenter/business/tab/business/widget/BlockLogTracer;", "mEmptyView", "Landroid/view/View;", "mTextView", "Lcom/ss/android/appcenter/business/tab/business/blockit/BlockLogTextView;", "hideThis", "", "initParams", "onChanged", "t", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onTabReselected", "tab", "Lcom/larksuite/component/universe_design/tab/UDTab;", "onTabSelected", "onTabUnselected", "onViewCreated", "view", "Companion", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.business.tab.business.blockit.a */
public final class BlockLogFragment extends Fragment implements AbstractC1178x<BlockLogTracer.LogText>, UDTabLayout.OnTabSelectedListener {

    /* renamed from: b */
    public static final Companion f69538b = new Companion(null);

    /* renamed from: a */
    public BlockLogTracer f69539a;

    /* renamed from: c */
    private BlockLogTextView f69540c;

    /* renamed from: d */
    private View f69541d;

    /* renamed from: e */
    private String f69542e;

    /* renamed from: f */
    private HashMap f69543f;

    @Override // com.larksuite.component.universe_design.tab.UDTabLayout.OnTabSelectedListener
    /* renamed from: a */
    public void mo53906a(UDTab bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "tab");
    }

    @Override // com.larksuite.component.universe_design.tab.UDTabLayout.OnTabSelectedListener
    /* renamed from: b */
    public void mo53907b(UDTab bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "tab");
    }

    /* renamed from: c */
    public void mo99300c() {
        HashMap hashMap = this.f69543f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo99300c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/appcenter/business/tab/business/blockit/BlockLogFragment$Companion;", "", "()V", "FRAGMENT_TAG", "", "LOG_KEY", "showMenuDialog", "", "appCompatActivity", "Landroidx/fragment/app/FragmentActivity;", "key", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo99301a(FragmentActivity fragmentActivity, String str) {
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "appCompatActivity");
            Intrinsics.checkParameterIsNotNull(str, "key");
            if (fragmentActivity.getSupportFragmentManager().findFragmentByTag("BLOCK_LOG_FRAGMENT") == null) {
                BlockLogFragment aVar = new BlockLogFragment();
                Bundle bundle = new Bundle();
                bundle.putString("LOG_KEY", str);
                aVar.setArguments(bundle);
                fragmentActivity.getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.dialog_in_from_bottom, R.anim.dialog_out_to_bottom, R.anim.dialog_in_from_bottom, R.anim.dialog_out_to_bottom).add(16908290, aVar, "BLOCK_LOG_FRAGMENT").addToBackStack("log").commit();
            }
        }
    }

    /* renamed from: a */
    public final void mo99297a() {
        String str;
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("LOG_KEY");
        } else {
            str = null;
        }
        this.f69542e = str;
    }

    /* renamed from: b */
    public final void mo99299b() {
        FragmentManager fragmentManager;
        FragmentTransaction beginTransaction;
        FragmentTransaction customAnimations;
        FragmentTransaction remove;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            fragmentManager = activity.getSupportFragmentManager();
        } else {
            fragmentManager = null;
        }
        if (!(fragmentManager == null || (beginTransaction = fragmentManager.beginTransaction()) == null || (customAnimations = beginTransaction.setCustomAnimations(R.anim.dialog_in_from_bottom, R.anim.dialog_out_to_bottom)) == null || (remove = customAnimations.remove(this)) == null)) {
            remove.commit();
        }
        if (fragmentManager != null) {
            fragmentManager.popBackStack();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.a$c */
    static final class View$OnClickListenerC27820c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BlockLogFragment f69545a;

        View$OnClickListenerC27820c(BlockLogFragment aVar) {
            this.f69545a = aVar;
        }

        public final void onClick(View view) {
            this.f69545a.mo99299b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.a$d */
    static final class View$OnClickListenerC27821d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BlockLogFragment f69546a;

        View$OnClickListenerC27821d(BlockLogFragment aVar) {
            this.f69546a = aVar;
        }

        public final void onClick(View view) {
            this.f69546a.mo99299b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.a$b */
    static final class View$OnClickListenerC27819b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BlockLogFragment f69544a;

        View$OnClickListenerC27819b(BlockLogFragment aVar) {
            this.f69544a = aVar;
        }

        public final void onClick(View view) {
            BlockLogTracer dVar = this.f69544a.f69539a;
            if (dVar != null) {
                dVar.mo99668d();
            }
        }
    }

    @Override // com.larksuite.component.universe_design.tab.UDTabLayout.OnTabSelectedListener
    /* renamed from: c */
    public void mo53908c(UDTab bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "tab");
        BlockLogTracer dVar = this.f69539a;
        if (dVar != null) {
            dVar.mo99664a(bVar.mo91343d());
        }
    }

    /* renamed from: a */
    public void onChanged(BlockLogTracer.LogText bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "t");
        BlockLogTextView blockLogTextView = this.f69540c;
        if (blockLogTextView != null) {
            blockLogTextView.setText(bVar.mo99670a());
        }
        BlockLogTextView blockLogTextView2 = this.f69540c;
        if (blockLogTextView2 != null) {
            blockLogTextView2.setLineEndSet(bVar.mo99671b());
        }
        if (StringsKt.isBlank(bVar.mo99670a())) {
            View view = this.f69541d;
            if (view != null) {
                view.setVisibility(0);
                return;
            }
            return;
        }
        View view2 = this.f69541d;
        if (view2 != null) {
            view2.setVisibility(4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C1177w<BlockLogTracer.LogText> b;
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        mo99297a();
        this.f69540c = (BlockLogTextView) view.findViewById(R.id.log_text);
        this.f69541d = view.findViewById(R.id.empty_layout);
        View findViewById = view.findViewById(R.id.tab_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.tab_layout)");
        ((UDTabLayout) findViewById).addOnTabSelectedListener(this);
        BlockLogTracer b2 = C27952c.m102076a().mo99661b(this.f69542e);
        this.f69539a = b2;
        if (!(b2 == null || (b = b2.mo99666b()) == null)) {
            Context context = getContext();
            if (context != null) {
                b.mo5923a((FragmentActivity) context, this);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            }
        }
        view.findViewById(R.id.clear_log).setOnClickListener(new View$OnClickListenerC27819b(this));
        view.findViewById(R.id.root_view).setOnClickListener(new View$OnClickListenerC27820c(this));
        view.findViewById(R.id.hide_log).setOnClickListener(new View$OnClickListenerC27821d(this));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_block_log, viewGroup, false);
    }
}
