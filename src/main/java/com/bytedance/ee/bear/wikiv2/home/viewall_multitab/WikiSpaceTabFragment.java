package com.bytedance.ee.bear.wikiv2.home.viewall_multitab;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.wikiv2.home.viewall.WikiSpaceListArgs;
import com.bytedance.ee.bear.wikiv2.p589c.C12237b;
import com.bytedance.ee.bear.wikiv2.report.WikiReportV2;
import com.bytedance.ee.bear.wikiv2.searchv2.enh.WikiSearchbar;
import com.bytedance.ee.util.p718t.C13727b;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0003J\b\u0010\u000e\u001a\u00020\fH\u0002J\"\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006$"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceTabFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "()V", "titleBarHeight", "", "viewModel", "Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceTabViewModel;", "getViewModel", "()Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceTabViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bindListener", "", "bindView", "initView", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setTitleBarVisible", "visible", "Companion", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.f */
public final class WikiSpaceTabFragment extends C7667e {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f33106a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(WikiSpaceTabFragment.class), "viewModel", "getViewModel()Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceTabViewModel;"))};

    /* renamed from: b */
    public static final Companion f33107b = new Companion(null);

    /* renamed from: c */
    private int f33108c;

    /* renamed from: d */
    private final Lazy f33109d = LazyKt.lazy(new C12331d(this));

    /* renamed from: e */
    private HashMap f33110e;

    /* renamed from: a */
    public View mo47009a(int i) {
        if (this.f33110e == null) {
            this.f33110e = new HashMap();
        }
        View view = (View) this.f33110e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f33110e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final WikiSpaceTabViewModel mo47010a() {
        Lazy lazy = this.f33109d;
        KProperty kProperty = f33106a[0];
        return (WikiSpaceTabViewModel) lazy.getValue();
    }

    /* renamed from: b */
    public void mo47012b() {
        HashMap hashMap = this.f33110e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo47012b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceTabFragment$Companion;", "", "()V", "TAG", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceTabViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.f$d */
    static final class C12331d extends Lambda implements Function0<WikiSpaceTabViewModel> {
        final /* synthetic */ WikiSpaceTabFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12331d(WikiSpaceTabFragment fVar) {
            super(0);
            this.this$0 = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final WikiSpaceTabViewModel invoke() {
            return WikiSpaceTabViewModel.Companion.mo47024a(this.this$0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceTabFragment$bindListener$1", "Lcom/bytedance/ee/bear/wikiv2/searchv2/enh/WikiSearchbar$ViewDelegate;", "onEnterSearch", "", "onExitSearch", "onSearchInput", "input", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.f$b */
    public static final class C12329b implements WikiSearchbar.ViewDelegate {

        /* renamed from: a */
        final /* synthetic */ WikiSpaceTabFragment f33111a;

        @Override // com.bytedance.ee.bear.wikiv2.searchv2.enh.WikiSearchbar.ViewDelegate
        /* renamed from: a */
        public void mo47013a() {
            this.f33111a.mo47011a(false);
            this.f33111a.mo47010a().setInSearching(true);
            C12237b.m50900a("wiki_all_space", "wiki_pages_view", "search_button");
        }

        @Override // com.bytedance.ee.bear.wikiv2.searchv2.enh.WikiSearchbar.ViewDelegate
        /* renamed from: b */
        public void mo47015b() {
            this.f33111a.mo47011a(true);
            this.f33111a.mo47010a().setInSearching(false);
            this.f33111a.mo47010a().clearSearchInput();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C12329b(WikiSpaceTabFragment fVar) {
            this.f33111a = fVar;
        }

        @Override // com.bytedance.ee.bear.wikiv2.searchv2.enh.WikiSearchbar.ViewDelegate
        /* renamed from: a */
        public void mo47014a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "input");
            this.f33111a.mo47010a().setSearchInput(str);
        }
    }

    /* renamed from: d */
    private final void m51359d() {
        mo47010a().getTitle().mo5923a(getViewLifecycleOwner(), new C12330c(this));
    }

    /* renamed from: e */
    private final void m51360e() {
        ((WikiSearchbar) mo47009a(R.id.search_bar)).setViewDelegate(new C12329b(this));
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d, com.bytedance.ee.bear.facade.common.C7667e
    public boolean onBackPressed() {
        if (((WikiSearchbar) mo47009a(R.id.search_bar)).mo47122g() || super.onBackPressed()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final void m51358c() {
        ((WikiSearchbar) mo47009a(R.id.search_bar)).mo47115a();
        ((WikiSearchbar) mo47009a(R.id.search_bar)).setInputHint(R.string.Doc_Wiki_SearchWorkspace);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(childFragmentManager, "childFragmentManager");
        ((WikiSpaceTabViewPager) mo47009a(R.id.view_pager)).mo46981a(childFragmentManager, C12318c.m51335a());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.f$c */
    public static final class C12330c<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ WikiSpaceTabFragment f33112a;

        C12330c(WikiSpaceTabFragment fVar) {
            this.f33112a = fVar;
        }

        /* renamed from: a */
        public final void onChanged(Integer num) {
            Intrinsics.checkExpressionValueIsNotNull(num, "it");
            ((BaseTitleBar) this.f33112a.mo47009a(R.id.title_bar)).setTitle(num.intValue());
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WikiSpaceListArgs args = mo47010a().getArgs();
        if (args != null && args.getPageMode() == 0) {
            WikiReportV2.m50917b();
        }
    }

    /* renamed from: a */
    public final void mo47011a(boolean z) {
        int i;
        if (this.f33108c <= 0) {
            BaseTitleBar baseTitleBar = (BaseTitleBar) mo47009a(R.id.title_bar);
            Intrinsics.checkExpressionValueIsNotNull(baseTitleBar, "title_bar");
            this.f33108c = baseTitleBar.getHeight();
        }
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = this.f33108c;
        }
        if (z) {
            i2 = this.f33108c;
        }
        C13727b.m55679a((View) ((BaseTitleBar) mo47009a(R.id.title_bar)), i, i2, (int) LocationRequest.PRIORITY_HD_ACCURACY).start();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m51358c();
        m51359d();
        m51360e();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.wiki_space_tab_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        FragmentActivity activity;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && (activity = getActivity()) != null) {
            activity.setResult(i2, intent);
            activity.finish();
        }
    }
}
