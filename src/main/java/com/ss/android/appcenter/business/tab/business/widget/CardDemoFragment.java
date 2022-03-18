package com.ss.android.appcenter.business.tab.business.widget;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.larksuite.component.universe_design.tab.UDTab;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001a\u0010\u001d\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/ss/android/appcenter/business/tab/business/widget/CardDemoFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/larksuite/component/universe_design/tab/UDTabLayout$OnTabSelectedListener;", "()V", "url", "", "vp2", "Landroidx/viewpager2/widget/ViewPager2;", "getVp2", "()Landroidx/viewpager2/widget/ViewPager2;", "setVp2", "(Landroidx/viewpager2/widget/ViewPager2;)V", "configTabView", "", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onTabReselected", "tab", "Lcom/larksuite/component/universe_design/tab/UDTab;", "onTabSelected", "onTabUnselected", "onViewCreated", "Companion", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.business.tab.business.widget.g */
public final class CardDemoFragment extends Fragment implements UDTabLayout.OnTabSelectedListener {

    /* renamed from: a */
    public static final Companion f69958a = new Companion(null);

    /* renamed from: b */
    private String f69959b;

    /* renamed from: c */
    private ViewPager2 f69960c;

    /* renamed from: d */
    private HashMap f69961d;

    @JvmStatic
    /* renamed from: a */
    public static final CardDemoFragment m102093a(String str) {
        return f69958a.mo99678a(str);
    }

    /* renamed from: a */
    public void mo99677a() {
        HashMap hashMap = this.f69961d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

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

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo99677a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/appcenter/business/tab/business/widget/CardDemoFragment$Companion;", "", "()V", "TAG", "", "newInstance", "Lcom/ss/android/appcenter/business/tab/business/widget/CardDemoFragment;", "param1", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.widget.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final CardDemoFragment mo99678a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "param1");
            CardDemoFragment gVar = new CardDemoFragment();
            Bundle bundle = new Bundle();
            bundle.putString("param1", str);
            gVar.setArguments(bundle);
            return gVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.widget.g$c */
    public static final class View$OnClickListenerC27960c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UDTabLayout f69963a;

        View$OnClickListenerC27960c(UDTabLayout uDTabLayout) {
            this.f69963a = uDTabLayout;
        }

        public final void onClick(View view) {
            this.f69963a.selectTabAt(0);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.widget.g$d */
    public static final class View$OnClickListenerC27961d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UDTabLayout f69964a;

        View$OnClickListenerC27961d(UDTabLayout uDTabLayout) {
            this.f69964a = uDTabLayout;
        }

        public final void onClick(View view) {
            this.f69964a.selectTabAt(1);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.widget.g$b */
    public static final class View$OnClickListenerC27959b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardDemoFragment f69962a;

        View$OnClickListenerC27959b(CardDemoFragment gVar) {
            this.f69962a = gVar;
        }

        public final void onClick(View view) {
            FragmentActivity activity = this.f69962a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Override // com.larksuite.component.universe_design.tab.UDTabLayout.OnTabSelectedListener
    /* renamed from: c */
    public void mo53908c(UDTab bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "tab");
        ViewPager2 viewPager2 = this.f69960c;
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(bVar.mo91343d(), false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f69959b = arguments.getString("param1");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0109  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m102094a(android.view.View r10) {
        /*
        // Method dump skipped, instructions count: 272
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.appcenter.business.tab.business.widget.CardDemoFragment.m102094a(android.view.View):void");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m102094a(view);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_card_demo, viewGroup, false);
    }
}
