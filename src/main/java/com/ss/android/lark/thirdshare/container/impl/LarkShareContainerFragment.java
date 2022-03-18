package com.ss.android.lark.thirdshare.container.impl;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC1045n;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.component.universe_design.tab.UDTabLayoutCoordinator;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.thirdshare.container.LarkShareContainer;
import com.ss.android.lark.thirdshare.container.LarkShareContainerConfig;
import com.ss.android.lark.thirdshare.container.p2743a.AbstractC55729a;
import com.ss.android.lark.thirdshare.container.p2744b.C55730a;
import com.ss.android.lark.ui.AbstractC57604f;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57768af;
import com.ss.android.lark.utils.ViewUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0003 !\"B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u001c\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u001d\u001a\u00020\u000fH\u0016J\u001a\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0016H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX.¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0003¨\u0006#"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/impl/LarkShareContainerFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "Lcom/ss/android/lark/ui/IActionCallback;", "()V", "fragmentInfo", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/thirdshare/container/impl/LarkShareContainerFragment$FragmentInfo;", "isSingleSelectMode", "", "rootView", "Landroid/view/View;", "selectedTab", "", "selectedTab$annotations", "fetchData", "", "initView", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/thirdshare/container/LarkShareContainer;", "onActionPerform", "methodName", "extra", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "onDestroy", "onViewCreated", "view", "Companion", "FragmentAdapter", "FragmentInfo", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.thirdshare.container.impl.a */
public final class LarkShareContainerFragment extends BaseFragment implements AbstractC57604f {

    /* renamed from: b */
    public static final Companion f137498b = new Companion(null);

    /* renamed from: a */
    public final ArrayList<FragmentInfo> f137499a = new ArrayList<>();

    /* renamed from: c */
    private View f137500c;

    /* renamed from: d */
    private String f137501d;

    /* renamed from: e */
    private boolean f137502e;

    /* renamed from: f */
    private HashMap f137503f;

    /* renamed from: a */
    public View mo189963a(int i) {
        if (this.f137503f == null) {
            this.f137503f = new HashMap();
        }
        View view = (View) this.f137503f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f137503f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo189964a() {
        HashMap hashMap = this.f137503f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo189964a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/impl/LarkShareContainerFragment$Companion;", "", "()V", "TAG", "", "newInstance", "Lcom/ss/android/lark/thirdshare/container/impl/LarkShareContainerFragment;", "args", "Landroid/os/Bundle;", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.impl.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final LarkShareContainerFragment mo189966a(Bundle bundle) {
            LarkShareContainerFragment aVar = new LarkShareContainerFragment();
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/impl/LarkShareContainerFragment$FragmentInfo;", "", "fragment", "Landroidx/fragment/app/Fragment;", "title", "", "tabType", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/String;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "getTabType", "()Ljava/lang/String;", "getTitle", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.impl.a$c */
    public static final class FragmentInfo {

        /* renamed from: a */
        private final Fragment f137505a;

        /* renamed from: b */
        private final String f137506b;

        /* renamed from: c */
        private final String f137507c;

        /* renamed from: a */
        public final Fragment mo189967a() {
            return this.f137505a;
        }

        /* renamed from: b */
        public final String mo189968b() {
            return this.f137506b;
        }

        /* renamed from: c */
        public final String mo189969c() {
            return this.f137507c;
        }

        public FragmentInfo(Fragment fragment, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(fragment, "fragment");
            Intrinsics.checkParameterIsNotNull(str, "title");
            Intrinsics.checkParameterIsNotNull(str2, "tabType");
            this.f137505a = fragment;
            this.f137506b = str;
            this.f137507c = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/impl/LarkShareContainerFragment$FragmentAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "fragmentInfo", "", "Lcom/ss/android/lark/thirdshare/container/impl/LarkShareContainerFragment$FragmentInfo;", "(Landroidx/fragment/app/FragmentManager;Ljava/util/List;)V", "getCount", "", "getItem", "Landroidx/fragment/app/Fragment;", "position", "getPageTitle", "", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.impl.a$b */
    public static final class FragmentAdapter extends AbstractC1045n {

        /* renamed from: a */
        private final List<FragmentInfo> f137504a;

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.f137504a.size();
        }

        @Override // androidx.fragment.app.AbstractC1045n
        /* renamed from: a */
        public Fragment mo5615a(int i) {
            return this.f137504a.get(i).mo189967a();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int i) {
            return this.f137504a.get(i).mo189968b();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FragmentAdapter(FragmentManager fragmentManager, List<FragmentInfo> list) {
            super(fragmentManager);
            Intrinsics.checkParameterIsNotNull(fragmentManager, "fm");
            Intrinsics.checkParameterIsNotNull(list, "fragmentInfo");
            this.f137504a = list;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/thirdshare/container/impl/LarkShareContainerFragment$fetchData$1", "Lcom/ss/android/lark/utils/TaskUtils$Task;", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainer;", "onDo", "onDone", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.impl.a$d */
    public static final class C55736d extends C57768af.AbstractRunnableC57773c<LarkShareContainer> {

        /* renamed from: a */
        final /* synthetic */ LarkShareContainerFragment f137508a;

        /* renamed from: a */
        public LarkShareContainer mo130916b() {
            LarkShareContainer.LarkShareContainerSupplier a = LarkShareContainer.f137484c.mo189938a();
            if (a != null) {
                return a.mo146279a();
            }
            return null;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55736d(LarkShareContainerFragment aVar) {
            this.f137508a = aVar;
        }

        /* renamed from: a */
        public void mo130914a(LarkShareContainer aVar) {
            if (aVar == null) {
                ViewUtils.m224144a();
                Log.m165383e("LarkShareContainer", "LarkShareContainer is null!");
                this.f137508a.finish();
                return;
            }
            LarkShareContainer.f137484c.mo189941a(aVar);
            this.f137508a.mo189965a(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.impl.a$e */
    public static final class RunnableC55737e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LarkShareContainerFragment f137509a;

        RunnableC55737e(LarkShareContainerFragment aVar) {
            this.f137509a = aVar;
        }

        public final void run() {
            FragmentActivity activity = this.f137509a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        LarkShareContainer.f137484c.mo189943c();
    }

    /* renamed from: b */
    private final void m215937b() {
        C57768af.m224218a(getContext(), new C55736d(this).mo196075a((Runnable) new RunnableC55737e(this)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/thirdshare/container/impl/LarkShareContainerFragment$initView$3", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.impl.a$h */
    public static final class C55740h implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        final /* synthetic */ LarkShareContainerFragment f137514a;

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55740h(LarkShareContainerFragment aVar) {
            this.f137514a = aVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (Intrinsics.areEqual(this.f137514a.f137499a.get(i).mo189969c(), "inapp")) {
                ((CommonTitleBar) this.f137514a.mo189963a(R.id.lscTb)).setRightVisible(true);
            } else {
                ((CommonTitleBar) this.f137514a.mo189963a(R.id.lscTb)).setRightVisible(false);
            }
            KeyboardUtils.hideKeyboard(this.f137514a.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/thirdshare/container/impl/LarkShareContainerFragment$initView$2", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.impl.a$g */
    public static final class C55739g extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ LarkShareContainerFragment f137512a;

        /* renamed from: b */
        final /* synthetic */ FragmentInfo f137513b;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            if (this.f137513b.mo189967a() instanceof AbstractC57604f) {
                Fragment a = this.f137513b.mo189967a();
                if (a != null) {
                    ((AbstractC57604f) a).mo128968a("multiSelect", null);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.ui.IActionCallback");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55739g(LarkShareContainerFragment aVar, FragmentInfo cVar, String str) {
            super(str);
            this.f137512a = aVar;
            this.f137513b = cVar;
        }
    }

    /* renamed from: a */
    public final void mo189965a(LarkShareContainer aVar) {
        LarkShareContainerConfig.ForwardCallback bVar;
        LarkShareContainerConfig.InappConfig a;
        aVar.mo189936a().mo189928d().mo146280a();
        ((CommonTitleBar) mo189963a(R.id.lscTb)).setLeftTextOnly(CommonTitleBarConstants.Lark_Legacy_Cancel);
        ((CommonTitleBar) mo189963a(R.id.lscTb)).setTitle(aVar.mo189936a().mo189925a());
        this.f137501d = aVar.mo189936a().mo189926b();
        int i = 0;
        int i2 = 0;
        for (T t : aVar.mo189936a().mo189927c()) {
            String str = this.f137501d;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("selectedTab");
            }
            if (Intrinsics.areEqual(str, t.mo189929a())) {
                i = i2;
            }
            String a2 = t.mo189929a();
            int hashCode = a2.hashCode();
            if (hashCode != -951532658) {
                if (hashCode != 3321850) {
                    if (hashCode == 100343516 && a2.equals("inapp")) {
                        LarkShareContainerConfig.InappConfig a3 = aVar.mo189937b().mo189875a();
                        if (a3 != null) {
                            bVar = a3.mo189889c();
                        } else {
                            bVar = null;
                        }
                        if (!(bVar == null || (a = aVar.mo189937b().mo189875a()) == null)) {
                            a.mo189887a(new C55738f(this, bVar));
                        }
                        Fragment shareContainerForwardPickFragment = ((AbstractC55729a) ApiUtils.getApi(AbstractC55729a.class)).getShareContainerForwardPickFragment(aVar.mo189937b().mo189875a());
                        Intrinsics.checkExpressionValueIsNotNull(shareContainerForwardPickFragment, "ApiUtils.getApi(LarkShar…(data.config.inappConfig)");
                        FragmentInfo cVar = new FragmentInfo(shareContainerForwardPickFragment, t.mo189932d(), "inapp");
                        this.f137499a.add(cVar);
                        if (Intrinsics.areEqual(t.mo189930b(), "all")) {
                            ((CommonTitleBar) mo189963a(R.id.lscTb)).addAction(new C55739g(this, cVar, UIUtils.getString(this.mContext, R.string.Lark_Legacy_Select)));
                        } else {
                            this.f137502e = true;
                        }
                        i2++;
                    }
                } else if (a2.equals("link")) {
                    this.f137499a.add(new FragmentInfo(LarkShareContainerLinkFragment.f137515a.mo189977a(t.mo189931c()), t.mo189932d(), "link"));
                    i2++;
                }
            } else if (a2.equals("qrcode")) {
                this.f137499a.add(new FragmentInfo(LarkShareContainerQrcodeFragment.f137544c.mo189989a(t.mo189931c()), t.mo189932d(), "qrcode"));
                i2++;
            }
            Log.m165383e("LarkShareContainer", "tabType <" + t.mo189929a() + "> is wrong");
            i2++;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(childFragmentManager, "childFragmentManager");
        FragmentAdapter bVar2 = new FragmentAdapter(childFragmentManager, this.f137499a);
        UDTabLayout uDTabLayout = (UDTabLayout) mo189963a(R.id.lscTl);
        Intrinsics.checkExpressionValueIsNotNull(uDTabLayout, "lscTl");
        ViewPager viewPager = (ViewPager) mo189963a(R.id.lscVp);
        Intrinsics.checkExpressionValueIsNotNull(viewPager, "lscVp");
        new UDTabLayoutCoordinator(uDTabLayout, viewPager).attach();
        ViewPager viewPager2 = (ViewPager) mo189963a(R.id.lscVp);
        Intrinsics.checkExpressionValueIsNotNull(viewPager2, "lscVp");
        viewPager2.setAdapter(bVar2);
        ViewPager viewPager3 = (ViewPager) mo189963a(R.id.lscVp);
        Intrinsics.checkExpressionValueIsNotNull(viewPager3, "lscVp");
        viewPager3.setOffscreenPageLimit(2);
        ((ViewPager) mo189963a(R.id.lscVp)).addOnPageChangeListener(new C55740h(this));
        ViewPager viewPager4 = (ViewPager) mo189963a(R.id.lscVp);
        Intrinsics.checkExpressionValueIsNotNull(viewPager4, "lscVp");
        viewPager4.setCurrentItem(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/thirdshare/container/impl/LarkShareContainerFragment$initView$1", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$ForwardCallback;", "onForward", "", "targets", "", "Lcom/ss/android/lark/thirdshare/container/bean/ForwardTarget4Container;", "extraMsg", "", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.impl.a$f */
    public static final class C55738f implements LarkShareContainerConfig.ForwardCallback {

        /* renamed from: a */
        final /* synthetic */ LarkShareContainerFragment f137510a;

        /* renamed from: b */
        final /* synthetic */ LarkShareContainerConfig.ForwardCallback f137511b;

        C55738f(LarkShareContainerFragment aVar, LarkShareContainerConfig.ForwardCallback bVar) {
            this.f137510a = aVar;
            this.f137511b = bVar;
        }

        @Override // com.ss.android.lark.thirdshare.container.LarkShareContainerConfig.ForwardCallback
        /* renamed from: a */
        public void mo146275a(List<? extends C55730a> list, String str) {
            Intrinsics.checkParameterIsNotNull(list, "targets");
            Intrinsics.checkParameterIsNotNull(str, "extraMsg");
            this.f137511b.mo146275a(list, str);
            this.f137510a.finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m215937b();
    }

    @Override // com.ss.android.lark.ui.AbstractC57604f
    /* renamed from: a */
    public void mo128968a(String str, Bundle bundle) {
        String str2;
        if (!this.f137502e) {
            if (bundle != null) {
                str2 = bundle.getString("actionName");
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                ((CommonTitleBar) mo189963a(R.id.lscTb)).setRightText(str2);
                ((CommonTitleBar) mo189963a(R.id.lscTb)).setRightVisible(true);
                return;
            }
            ((CommonTitleBar) mo189963a(R.id.lscTb)).setRightText(str2);
            ((CommonTitleBar) mo189963a(R.id.lscTb)).setRightVisible(false);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.lark_share_container_fragment, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…agment, container, false)");
        this.f137500c = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        return inflate;
    }
}
