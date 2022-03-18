package com.ss.android.lark.mm.module.detail.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hms.actions.SearchIntents;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.base.BaseFragment;
import com.ss.android.lark.mm.module.detail.search.model.FindResponse;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.utils.SoftKeyboardUtil;
import com.ss.android.lark.mm.utils.ViewTreeObserver$OnGlobalLayoutListenerC47104h;
import com.ss.android.lark.mm.utils.ktextensions.C47108b;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\u0010\rJ&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010\u001c\u001a\u00020\fH\u0016J\u0010\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0004H\u0016J\u001a\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010!\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\"\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/search/MmSearchFragment;", "Lcom/ss/android/lark/mm/base/BaseFragment;", "Lcom/ss/android/lark/mm/utils/MmKeyboardUtils$SoftKeyboardToggleListener;", "bottomPanelHeight", "", "keyword", "", "dependency", "Lcom/ss/android/lark/mm/module/detail/search/IMmDetailSearchDependency;", "dismissCallback", "Lkotlin/Function1;", "Landroidx/fragment/app/Fragment;", "", "(ILjava/lang/String;Lcom/ss/android/lark/mm/module/detail/search/IMmDetailSearchDependency;Lkotlin/jvm/functions/Function1;)V", "isSearching", "", "()Z", "setSearching", "(Z)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onStart", "onToggleSoftKeyboard", "height", "onViewCreated", "view", "searchKeyword", "watchKeyboardVisibility", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.search.h */
public final class MmSearchFragment extends BaseFragment implements ViewTreeObserver$OnGlobalLayoutListenerC47104h.AbstractC47105a {

    /* renamed from: a */
    public final IMmDetailSearchDependency f116259a;

    /* renamed from: b */
    public final Function1<Fragment, Unit> f116260b;

    /* renamed from: c */
    private boolean f116261c;

    /* renamed from: d */
    private final int f116262d;

    /* renamed from: e */
    private final String f116263e;

    /* renamed from: f */
    private HashMap f116264f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005 \u0006*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Triple;", "", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.search.h$b */
    static final class C46134b<T> implements Consumer<Triple<? extends String, ? extends Boolean, ? extends Boolean>> {

        /* renamed from: a */
        public static final C46134b f116266a = new C46134b();

        C46134b() {
        }

        /* renamed from: a */
        public final void accept(Triple<String, Boolean, Boolean> triple) {
        }
    }

    @Override // com.ss.android.lark.mm.base.BaseFragment
    /* renamed from: a */
    public View mo161166a(int i) {
        if (this.f116264f == null) {
            this.f116264f = new HashMap();
        }
        View view = (View) this.f116264f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f116264f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.mm.base.BaseFragment
    /* renamed from: c */
    public void mo161170c() {
        HashMap hashMap = this.f116264f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: d */
    public final boolean mo162054d() {
        return this.f116261c;
    }

    /* renamed from: e */
    private final void m182715e() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewTreeObserver$OnGlobalLayoutListenerC47104h.m186555a(activity, this);
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.mm.base.BaseFragment
    public void onDestroyView() {
        ViewTreeObserver$OnGlobalLayoutListenerC47104h.m186556a(this);
        super.onDestroyView();
        mo161170c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.search.h$a */
    static final class RunnableC46133a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmSearchFragment f116265a;

        RunnableC46133a(MmSearchFragment hVar) {
            this.f116265a = hVar;
        }

        public final void run() {
            SoftKeyboardUtil.f118667a.mo165514b((EditText) this.f116265a.mo161166a(R.id.etKeyword));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/mm/module/detail/search/MmSearchFragment$searchKeyword$1", "Lcom/ss/android/lark/mm/module/detail/search/IFindDelegate;", "onFindResult", "", "findResponse", "Lcom/ss/android/lark/mm/module/detail/search/model/FindResponse;", "onFindResultFocus", "index", "", "onStopFind", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.search.h$c */
    public static final class C46135c implements IFindDelegate {

        /* renamed from: a */
        final /* synthetic */ MmSearchFragment f116267a;

        @Override // com.ss.android.lark.mm.module.detail.search.IFindDelegate
        /* renamed from: a */
        public void mo162025a() {
            this.f116267a.mo162053b(false);
            this.f116267a.f116259a.mo162034d();
            this.f116267a.f116260b.invoke(this.f116267a);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46135c(MmSearchFragment hVar) {
            this.f116267a = hVar;
        }

        @Override // com.ss.android.lark.mm.module.detail.search.IFindDelegate
        /* renamed from: a */
        public void mo162026a(int i) {
            this.f116267a.f116259a.mo162029a(i);
        }

        @Override // com.ss.android.lark.mm.module.detail.search.IFindDelegate
        /* renamed from: a */
        public void mo162027a(FindResponse findResponse) {
            if (findResponse != null) {
                this.f116267a.f116259a.mo162032b();
            }
            this.f116267a.f116259a.mo162030a(findResponse);
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.mm.base.BaseFragment
    public void onStart() {
        Window window;
        super.onStart();
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
    }

    /* renamed from: b */
    public final void mo162053b(boolean z) {
        this.f116261c = z;
    }

    @Override // com.ss.android.lark.mm.utils.ViewTreeObserver$OnGlobalLayoutListenerC47104h.AbstractC47105a
    /* renamed from: b */
    public void mo161814b(int i) {
        boolean z;
        ViewParent viewParent;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        View view = getView();
        View view2 = null;
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof View) {
            view2 = viewParent;
        }
        View view3 = view2;
        if (z) {
            if (view3 != null) {
                view3.animate().translationY(-(((float) i) - ((float) this.f116262d))).alpha(1.0f).start();
            }
        } else if (view3 != null) {
            view3.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        }
    }

    /* renamed from: a */
    public final void mo162052a(String str) {
        MmSearchBar mmSearchBar = (MmSearchBar) mo161166a(R.id.searchBar);
        if (mmSearchBar != null) {
            mmSearchBar.mo162005a(this.f116259a.mo162028a(), new C46135c(this), str, this.f116259a.mo162035e(), new C46136d(this));
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.mm.base.BaseFragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        boolean z = true;
        this.f116261c = true;
        this.f116259a.mo162033c();
        String str = this.f116263e;
        if (str != null && !StringsKt.isBlank(str)) {
            z = false;
        }
        if (z) {
            ((EditText) mo161166a(R.id.etKeyword)).requestFocus();
            C45859k.m181686a(new RunnableC46133a(this), 100);
        } else {
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                parent = null;
            }
            View view2 = (View) parent;
            if (view2 != null) {
                view2.setAlpha(1.0f);
            }
        }
        mo162052a(this.f116263e);
        Disposable subscribe = ((MmSearchBar) mo161166a(R.id.searchBar)).getKeywordSubject().subscribe(C46134b.f116266a);
        Intrinsics.checkExpressionValueIsNotNull(subscribe, "searchBar.keywordSubject…cond, it.third)\n        }");
        C47108b.m186566a(subscribe, getContext());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000528\u0010\u0006\u001a4\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\u0007H\n¢\u0006\u0002\b\u000e"}, d2 = {"<anonymous>", "", SearchIntents.EXTRA_QUERY, "", "isFindKeyword", "", "onResponse", "Lkotlin/Function2;", "Lcom/ss/android/lark/mm/module/detail/search/model/FindResponse;", "Lkotlin/ParameterName;", "name", "res", "", "total", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.search.h$d */
    public static final class C46136d extends Lambda implements Function3<String, Boolean, Function2<? super FindResponse, ? super Integer, ? extends Unit>, Unit> {
        final /* synthetic */ MmSearchFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46136d(MmSearchFragment hVar) {
            super(3);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function3
        public /* synthetic */ Unit invoke(String str, Boolean bool, Function2<? super FindResponse, ? super Integer, ? extends Unit> kVar) {
            invoke(str, bool.booleanValue(), (Function2<? super FindResponse, ? super Integer, Unit>) kVar);
            return Unit.INSTANCE;
        }

        public final void invoke(String str, boolean z, Function2<? super FindResponse, ? super Integer, Unit> kVar) {
            Intrinsics.checkParameterIsNotNull(str, SearchIntents.EXTRA_QUERY);
            Intrinsics.checkParameterIsNotNull(kVar, "onResponse");
            this.this$0.f116259a.mo162031a(str, z, kVar);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.mm_search_subtitle_dialog, viewGroup, false);
        m182715e();
        return inflate;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super androidx.fragment.app.Fragment, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public MmSearchFragment(int i, String str, IMmDetailSearchDependency bVar, Function1<? super Fragment, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        Intrinsics.checkParameterIsNotNull(function1, "dismissCallback");
        this.f116262d = i;
        this.f116263e = str;
        this.f116259a = bVar;
        this.f116260b = function1;
    }
}
