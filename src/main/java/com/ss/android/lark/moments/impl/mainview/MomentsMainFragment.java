package com.ss.android.lark.moments.impl.mainview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.C1067t;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.lark.pb.moments.v1.FeedOrder;
import com.bytedance.lark.pb.moments.v1.ManageMode;
import com.bytedance.lark.pb.moments.v1.Tab;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.shadow.UDShadowLayout;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.component.universe_design.tab.UDTabLayoutCoordinator;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.impl.categoryedit.MomentsCategoryEditActivity;
import com.ss.android.lark.moments.impl.common.utils.C47282k;
import com.ss.android.lark.moments.impl.feed.MomentsFeedFragment;
import com.ss.android.lark.moments.impl.hitpoint.MomentsAppreciableHitPoint;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitHelper;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPoint;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPointNew;
import com.ss.android.lark.moments.impl.mainview.title.IMomentsTitleControllerProxy;
import com.ss.android.lark.moments.impl.notice.MomentsNotificationActivity;
import com.ss.android.lark.moments.impl.personal.MomentsProfileActivity;
import com.ss.android.lark.moments.impl.publish.MomentsPublishActivity;
import com.ss.android.lark.moments.impl.rustadapter.setting.UserGlobalConfigAndSettingsManager;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f*\u0002\u000e\u0015\u0018\u0000 C2\u00020\u0001:\u0001CB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010#\u001a\u00020$H\u0002J\u0016\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'J\b\u0010)\u001a\u00020$H\u0003J\b\u0010*\u001a\u00020$H\u0002J\"\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J&\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u00109\u001a\u00020$H\u0016J\u001a\u0010:\u001a\u00020$2\u0006\u0010;\u001a\u0002022\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u000e\u0010<\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010=\u001a\u00020$2\u0006\u0010>\u001a\u000208J\u000e\u0010?\u001a\u00020$2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010@\u001a\u00020$2\u0006\u0010A\u001a\u00020'H\u0016J\u000e\u0010B\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020\u001dR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0010\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b\"\u0010\f\u001a\u0004\b \u0010!¨\u0006D"}, d2 = {"Lcom/ss/android/lark/moments/impl/mainview/MomentsMainFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "activity", "Landroid/app/Activity;", "baseContext", "Landroid/content/Context;", "coordinator", "Lcom/larksuite/component/universe_design/tab/UDTabLayoutCoordinator;", "getCoordinator", "()Lcom/larksuite/component/universe_design/tab/UDTabLayoutCoordinator;", "coordinator$delegate", "Lkotlin/Lazy;", "disableTabListener", "com/ss/android/lark/moments/impl/mainview/MomentsMainFragment$disableTabListener$1", "Lcom/ss/android/lark/moments/impl/mainview/MomentsMainFragment$disableTabListener$1;", "fragmentDestroyListener", "Lcom/ss/android/lark/moments/impl/mainview/OnFragmentDestroyListener;", "lastClickTime", "", "onPopupWindowListener", "com/ss/android/lark/moments/impl/mainview/MomentsMainFragment$onPopupWindowListener$1", "Lcom/ss/android/lark/moments/impl/mainview/MomentsMainFragment$onPopupWindowListener$1;", "pagerAdapter", "Lcom/ss/android/lark/moments/impl/mainview/MomentsFeedPagerAdapter;", "getPagerAdapter", "()Lcom/ss/android/lark/moments/impl/mainview/MomentsFeedPagerAdapter;", "pagerAdapter$delegate", "titleController", "Lcom/ss/android/lark/moments/impl/mainview/title/IMomentsTitleControllerProxy;", "viewModel", "Lcom/ss/android/lark/moments/impl/mainview/MomentsMainFragmentViewModel;", "getViewModel", "()Lcom/ss/android/lark/moments/impl/mainview/MomentsMainFragmentViewModel;", "viewModel$delegate", "bindViewPagerListener", "", "handlePageSwitch", "preIsMomentsTab", "", "curIsMomentsTab", "initCreatePostBt", "initTabs", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "setActivity", "setArgumentsFromSpec", "args", "setOnDestroyListener", "setUserVisibleHint", "isVisibleToUser", "updateTitleController", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.mainview.d */
public final class MomentsMainFragment extends BaseFragment {

    /* renamed from: d */
    public static final Companion f120273d = new Companion(null);

    /* renamed from: a */
    public Context f120274a;

    /* renamed from: b */
    public Activity f120275b;

    /* renamed from: c */
    public final C47731d f120276c = new C47731d(this);

    /* renamed from: e */
    private IMomentsTitleControllerProxy f120277e;

    /* renamed from: f */
    private OnFragmentDestroyListener f120278f;

    /* renamed from: g */
    private final Lazy f120279g = LazyKt.lazy(new C47742n(this));

    /* renamed from: h */
    private final Lazy f120280h = LazyKt.lazy(new C47730c(this));

    /* renamed from: i */
    private final Lazy f120281i = C1067t.m5172a(this, Reflection.getOrCreateKotlinClass(MomentsMainFragmentViewModel.class), new MomentsMainFragment$$special$$inlined$viewModels$2(new MomentsMainFragment$$special$$inlined$viewModels$1(this)), null);

    /* renamed from: j */
    private C47741m f120282j = new C47741m(this);

    /* renamed from: k */
    private long f120283k;

    /* renamed from: l */
    private HashMap f120284l;

    /* renamed from: d */
    private final UDTabLayoutCoordinator m188733d() {
        return (UDTabLayoutCoordinator) this.f120280h.getValue();
    }

    /* renamed from: a */
    public View mo167405a(int i) {
        if (this.f120284l == null) {
            this.f120284l = new HashMap();
        }
        View view = (View) this.f120284l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f120284l.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final MomentsFeedPagerAdapter mo167406a() {
        return (MomentsFeedPagerAdapter) this.f120279g.getValue();
    }

    /* renamed from: b */
    public final MomentsMainFragmentViewModel mo167412b() {
        return (MomentsMainFragmentViewModel) this.f120281i.getValue();
    }

    /* renamed from: c */
    public void mo167413c() {
        HashMap hashMap = this.f120284l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo167413c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/moments/impl/mainview/MomentsMainFragment$Companion;", "", "()V", "ARGUMENTS_KEY_FROM", "", "ARGUMENTS_KEY_NEED_REFRESH", "ARGUMENTS_VALUE_FROM_APP_LINK", "ARGUMENTS_VALUE_FROM_DETAIL_TITLE", "ARGUMENTS_VALUE_FROM_PROFILE_CREATE_POST", "CACHE_PAGER_COUNT", "", "DOUBLE_CLICK_DURATION", "TAG_LOG", "newInstance", "Lcom/ss/android/lark/moments/impl/mainview/MomentsMainFragment;", "context", "Landroid/content/Context;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final MomentsMainFragment mo167414a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            MomentsMainFragment dVar = new MomentsMainFragment();
            dVar.f120274a = context;
            Log.m165389i("MomentsMainFragment", "MomentsMainFragment newInstance");
            return dVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/mainview/MomentsMainFragment$onPopupWindowListener$1", "Lcom/ss/android/lark/moments/impl/mainview/OnPopupWindowListener;", "onClickNotificationBtn", "", "onClickPersonalBtn", "onClickSearchBtn", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.d$m */
    public static final class C47741m implements OnPopupWindowListener {

        /* renamed from: a */
        final /* synthetic */ MomentsMainFragment f120298a;

        @Override // com.ss.android.lark.moments.impl.mainview.OnPopupWindowListener
        /* renamed from: a */
        public void mo167422a() {
            this.f120298a.startActivity(new Intent(this.f120298a.f120275b, MomentsNotificationActivity.class));
            MomentsAppreciableHitPoint.f119684a.mo166737V();
        }

        @Override // com.ss.android.lark.moments.impl.mainview.OnPopupWindowListener
        /* renamed from: b */
        public void mo167423b() {
            String a = MomentsDependencyHolder.f118998b.mo165899a().accountDependency().mo144688a();
            MomentsHitPointNew.Companion.m188109a(MomentsHitPointNew.f119721a, "moments_profile", "moments_feed_page_view", (String) null, (String) null, (Integer) null, 28, (Object) null);
            MomentsHitPoint.f119720a.mo166850g("feed_profile_btn");
            Context context = this.f120298a.getContext();
            if (context != null) {
                MomentsProfileActivity.Companion aVar = MomentsProfileActivity.f120464g;
                Intrinsics.checkExpressionValueIsNotNull(context, "it");
                aVar.mo167631a(a, context, this.f120298a);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47741m(MomentsMainFragment dVar) {
            this.f120298a = dVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/moments/impl/mainview/MomentsFeedPagerAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.d$n */
    static final class C47742n extends Lambda implements Function0<MomentsFeedPagerAdapter> {
        final /* synthetic */ MomentsMainFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47742n(MomentsMainFragment dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentsFeedPagerAdapter invoke() {
            FragmentManager childFragmentManager = this.this$0.getChildFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(childFragmentManager, "childFragmentManager");
            return new MomentsFeedPagerAdapter(childFragmentManager, false, 2, null);
        }
    }

    /* renamed from: g */
    private final void m188736g() {
        ((ViewPager) mo167405a(R.id.viewPager)).addOnPageChangeListener(new C47729b(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        IMomentsTitleControllerProxy aVar = this.f120277e;
        if (aVar != null) {
            aVar.mo167346a((OnPopupWindowListener) null);
        }
        OnFragmentDestroyListener fVar = this.f120278f;
        if (fVar != null) {
            fVar.mo167433a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/larksuite/component/universe_design/tab/UDTabLayoutCoordinator;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.d$c */
    static final class C47730c extends Lambda implements Function0<UDTabLayoutCoordinator> {
        final /* synthetic */ MomentsMainFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47730c(MomentsMainFragment dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final UDTabLayoutCoordinator invoke() {
            UDTabLayout uDTabLayout = (UDTabLayout) this.this$0.mo167405a(R.id.tabLayout);
            Intrinsics.checkExpressionValueIsNotNull(uDTabLayout, "tabLayout");
            ViewPager viewPager = (ViewPager) this.this$0.mo167405a(R.id.viewPager);
            Intrinsics.checkExpressionValueIsNotNull(viewPager, "viewPager");
            return new UDTabLayoutCoordinator(uDTabLayout, viewPager);
        }
    }

    /* renamed from: e */
    private final void m188734e() {
        Drawable findDrawableByLayerId;
        ((UDShadowLayout) mo167405a(R.id.ivCreatePost)).setOnClickListener(new C47732e(this));
        ImageView imageView = (ImageView) mo167405a(R.id.create_bt);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "create_bt");
        Drawable drawable = imageView.getDrawable();
        if (!(drawable instanceof LayerDrawable)) {
            drawable = null;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        if (layerDrawable != null && (findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.add_bold)) != null) {
            findDrawableByLayerId.setTint(UIUtils.getColor(getContext(), R.color.static_white));
        }
    }

    /* renamed from: f */
    private final void m188735f() {
        ImageView imageView = (ImageView) mo167405a(R.id.icMoreTabs);
        ImageView imageView2 = (ImageView) mo167405a(R.id.icMoreTabs);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "icMoreTabs");
        Context context = imageView2.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "icMoreTabs.context");
        BitmapDrawable a = C47282k.m187254a(context, (int) R.drawable.ud_icon_menu_outlined, 18.0f, 18.0f, (Integer) null, 8, (Object) null);
        if (a != null) {
            a.mutate();
            ImageView imageView3 = (ImageView) mo167405a(R.id.icMoreTabs);
            Intrinsics.checkExpressionValueIsNotNull(imageView3, "icMoreTabs");
            a.setTint(UIUtils.getColor(imageView3.getContext(), R.color.icon_n1));
        } else {
            a = null;
        }
        imageView.setImageDrawable(a);
        ((ImageView) mo167405a(R.id.icMoreTabs)).setOnClickListener(new C47733f(this));
        ViewPager viewPager = (ViewPager) mo167405a(R.id.viewPager);
        Intrinsics.checkExpressionValueIsNotNull(viewPager, "viewPager");
        viewPager.setAdapter(mo167406a());
        ViewPager viewPager2 = (ViewPager) mo167405a(R.id.viewPager);
        Intrinsics.checkExpressionValueIsNotNull(viewPager2, "viewPager");
        viewPager2.setOffscreenPageLimit(2);
        m188733d().attach();
        m188736g();
        mo167412b().getTabListLiveData().mo5923a(getViewLifecycleOwner(), new C47734g(this));
        mo167412b().getNeedShowTab().mo5923a(getViewLifecycleOwner(), new C47736h(this));
        mo167412b().getNeedShowTabEdit().mo5923a(getViewLifecycleOwner(), new C47737i(this));
        mo167412b().getPositionToPage().mo5923a(getViewLifecycleOwner(), new C47738j(this));
        mo167412b().getShowInvalidConfigToast().mo5923a(getViewLifecycleOwner(), new C47739k(this));
        UserGlobalConfigAndSettingsManager aVar = UserGlobalConfigAndSettingsManager.f120180a;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkExpressionValueIsNotNull(viewLifecycleOwner, "viewLifecycleOwner");
        aVar.mo167297a(viewLifecycleOwner, new C47740l(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/moments/impl/mainview/MomentsMainFragment$bindViewPagerListener$1", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.d$b */
    public static final class C47729b implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        final /* synthetic */ MomentsMainFragment f120285a;

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47729b(MomentsMainFragment dVar) {
            this.f120285a = dVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            List<Tab> b = this.f120285a.mo167412b().getTabListLiveData().mo5927b();
            if (b != null) {
                Intrinsics.checkExpressionValueIsNotNull(b, "viewModel.tabListLiveData.value ?: return");
                if (b.size() > i) {
                    MomentsHitPointNew.Companion.m188109a(MomentsHitPointNew.f119721a, "category", "moments_feed_page_view", (String) null, (String) null, (Integer) null, 28, (Object) null);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/mainview/MomentsMainFragment$disableTabListener$1", "Lcom/ss/android/lark/moments/impl/feed/MomentsFeedFragment$OnDisableTabListener;", "onDisableTab", "", "tabId", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.d$d */
    public static final class C47731d implements MomentsFeedFragment.OnDisableTabListener {

        /* renamed from: a */
        final /* synthetic */ MomentsMainFragment f120286a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47731d(MomentsMainFragment dVar) {
            this.f120286a = dVar;
        }

        @Override // com.ss.android.lark.moments.impl.feed.MomentsFeedFragment.OnDisableTabListener
        /* renamed from: a */
        public void mo166904a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "tabId");
            this.f120286a.mo167412b().removeTab(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/mainview/MomentsMainFragment$initCreatePostBt$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.d$e */
    public static final class C47732e extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsMainFragment f120287a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47732e(MomentsMainFragment dVar) {
            this.f120287a = dVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            Integer num;
            MomentsHitPointNew.Companion.m188109a(MomentsHitPointNew.f119721a, "post_edit", "moments_edit_page_view", (String) null, (String) null, (Integer) null, 28, (Object) null);
            Activity activity = this.f120287a.f120275b;
            if (activity != null) {
                MomentsHitPoint.f119720a.mo166846d("feed_send_btn");
                MomentsHitPoint.f119720a.mo166848e("feed_page");
                Intent intent = new Intent(activity, MomentsPublishActivity.class);
                MomentsFeedPagerAdapter a = this.f120287a.mo167406a();
                UDTabLayout uDTabLayout = (UDTabLayout) this.f120287a.mo167405a(R.id.tabLayout);
                if (uDTabLayout != null) {
                    num = Integer.valueOf(uDTabLayout.getSelectPosition());
                } else {
                    num = null;
                }
                if (!C47282k.m187260a(a.mo167401a(num), intent, 211)) {
                    C47282k.m187260a(this.f120287a, intent, 211);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/moments/impl/mainview/MomentsMainFragment$initTabs$2$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.d$f */
    public static final class C47733f extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsMainFragment f120288a;

        C47733f(MomentsMainFragment dVar) {
            this.f120288a = dVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            Integer num;
            ArrayList b = this.f120288a.mo167412b().getTabListLiveData().mo5927b();
            if (b == null) {
                b = new ArrayList();
            }
            Intrinsics.checkExpressionValueIsNotNull(b, "viewModel.tabListLiveData.value ?: ArrayList()");
            MomentsFeedPagerAdapter a = this.f120288a.mo167406a();
            UDTabLayout uDTabLayout = (UDTabLayout) this.f120288a.mo167405a(R.id.tabLayout);
            if (uDTabLayout != null) {
                num = Integer.valueOf(uDTabLayout.getSelectPosition());
            } else {
                num = null;
            }
            String b2 = a.mo167403b(num);
            if (b2 == null) {
                b2 = "";
            }
            MomentsHitPointNew.Companion.m188109a(MomentsHitPointNew.f119721a, "category_setting", "moments_category_setting_view", (String) null, (String) null, (Integer) null, 28, (Object) null);
            MomentsCategoryEditActivity.f119206a.mo166127a(this.f120288a, b, b2);
        }
    }

    /* renamed from: a */
    public final void mo167407a(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.f120275b = activity;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "pos", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.d$j */
    public static final class C47738j<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ MomentsMainFragment f120295a;

        C47738j(MomentsMainFragment dVar) {
            this.f120295a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(Integer num) {
            Intrinsics.checkExpressionValueIsNotNull(num, "pos");
            ((UDTabLayout) this.f120295a.mo167405a(R.id.tabLayout)).selectTabAt(num.intValue());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.d$k */
    public static final class C47739k<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsMainFragment f120296a;

        C47739k(MomentsMainFragment dVar) {
            this.f120296a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            LKUIToast.show(this.f120296a.getContext(), UIUtils.getString(this.f120296a.getContext(), R.string.Lark_Community_OopsSmthWrong));
        }
    }

    /* renamed from: a */
    public final void mo167409a(IMomentsTitleControllerProxy aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "titleController");
        Log.m165389i("MomentsMainFragment", "MomentsMainFragment updateTitleController");
        this.f120277e = aVar;
        if (aVar != null) {
            aVar.mo167346a(this.f120282j);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "tabs", "", "Lcom/bytedance/lark/pb/moments/v1/Tab;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.d$g */
    public static final class C47734g<T> implements AbstractC1178x<List<? extends Tab>> {

        /* renamed from: a */
        final /* synthetic */ MomentsMainFragment f120289a;

        C47734g(MomentsMainFragment dVar) {
            this.f120289a = dVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\b¸\u0006\u0000"}, d2 = {"com/ss/android/lark/moments/impl/mainview/MomentsMainFragment$initTabs$3$2$1", "Landroid/view/View$OnClickListener;", "lastClickTime", "", "onClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.mainview.d$g$a */
        public static final class View$OnClickListenerC47735a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f120290a;

            /* renamed from: b */
            final /* synthetic */ C47734g f120291b;

            /* renamed from: c */
            private long f120292c;

            public void onClick(View view) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = this.f120292c;
                if (j == 0 || currentTimeMillis - j > ((long) ParticipantRepo.f117150c)) {
                    this.f120292c = currentTimeMillis;
                    return;
                }
                Fragment a = this.f120291b.f120289a.mo167406a().mo167401a(Integer.valueOf(this.f120290a));
                if (!(a instanceof MomentsFeedFragment)) {
                    a = null;
                }
                MomentsFeedFragment momentsFeedFragment = (MomentsFeedFragment) a;
                if (momentsFeedFragment != null) {
                    momentsFeedFragment.mo166901f();
                }
                this.f120292c = 0;
            }

            View$OnClickListenerC47735a(int i, C47734g gVar) {
                this.f120290a = i;
                this.f120291b = gVar;
            }
        }

        /* renamed from: a */
        public final void onChanged(List<Tab> list) {
            int indexOf;
            this.f120289a.mo167406a().mo167402a().clear();
            Tab tab = null;
            Intrinsics.checkExpressionValueIsNotNull(list, "tabs");
            List<Tab> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (T t : list2) {
                int value = FeedOrder.UNSPECIFIED.getValue();
                if (Intrinsics.areEqual(t.id, String.valueOf(Tab.FeedTabId.FEED_RECOMMEND.getValue()))) {
                    tab = t;
                } else if ((!Intrinsics.areEqual(t.id, String.valueOf(Tab.FeedTabId.FEED_FOLLOWING.getValue()))) && UserGlobalConfigAndSettingsManager.f120180a.mo167310h() == ManageMode.STRONG_INTERVENTION) {
                    value = FeedOrder.RECOMMEND.getValue();
                }
                String str = t.id;
                Intrinsics.checkExpressionValueIsNotNull(str, "it.id");
                String str2 = t.name;
                Intrinsics.checkExpressionValueIsNotNull(str2, "it.name");
                arrayList.add(new TabFragmentInfo(str, str2, value, null, null, this.f120289a.f120276c, "value_from_tab", null, false, 384, null));
            }
            ArrayList arrayList2 = arrayList;
            this.f120289a.mo167406a().mo167402a().addAll(arrayList2);
            this.f120289a.mo167406a().notifyDataSetChanged();
            int i = 0;
            if (tab != null && (indexOf = list.indexOf(tab)) >= 0 && indexOf < arrayList2.size()) {
                ((ViewPager) this.f120289a.mo167405a(R.id.viewPager)).setCurrentItem(indexOf, false);
            }
            for (T t2 : this.f120289a.mo167406a().mo167402a()) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ((UDTabLayout) this.f120289a.mo167405a(R.id.tabLayout)).getTabAt(i).mo91341c().setOnClickListener(new View$OnClickListenerC47735a(i, this));
                i = i2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.d$h */
    public static final class C47736h<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsMainFragment f120293a;

        C47736h(MomentsMainFragment dVar) {
            this.f120293a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            int i;
            UDTabLayout uDTabLayout = (UDTabLayout) this.f120293a.mo167405a(R.id.tabLayout);
            Intrinsics.checkExpressionValueIsNotNull(uDTabLayout, "tabLayout");
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            if (bool.booleanValue()) {
                i = 0;
            } else {
                i = 8;
            }
            uDTabLayout.setVisibility(i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        Integer num;
        super.setUserVisibleHint(z);
        if (z) {
            MomentsAppreciableHitPoint.f119684a.mo166760l();
            MomentsFeedPagerAdapter a = mo167406a();
            UDTabLayout uDTabLayout = (UDTabLayout) mo167405a(R.id.tabLayout);
            MomentsFeedFragment momentsFeedFragment = null;
            if (uDTabLayout != null) {
                num = Integer.valueOf(uDTabLayout.getSelectPosition());
            } else {
                num = null;
            }
            Fragment a2 = a.mo167401a(num);
            if (a2 instanceof MomentsFeedFragment) {
                momentsFeedFragment = a2;
            }
            MomentsFeedFragment momentsFeedFragment2 = momentsFeedFragment;
            if (momentsFeedFragment2 != null) {
                momentsFeedFragment2.mo166899d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.d$i */
    public static final class C47737i<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsMainFragment f120294a;

        C47737i(MomentsMainFragment dVar) {
            this.f120294a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            int i;
            ImageView imageView = (ImageView) this.f120294a.mo167405a(R.id.icMoreTabs);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "icMoreTabs");
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            int i2 = 0;
            if (bool.booleanValue()) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
            ImageView imageView2 = (ImageView) this.f120294a.mo167405a(R.id.icMoreTabsShadow);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "icMoreTabsShadow");
            if (!bool.booleanValue()) {
                i2 = 8;
            }
            imageView2.setVisibility(i2);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "names", "", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.d$l */
    public static final class C47740l<T> implements AbstractC1178x<Map<String, ? extends String>> {

        /* renamed from: a */
        final /* synthetic */ MomentsMainFragment f120297a;

        C47740l(MomentsMainFragment dVar) {
            this.f120297a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(Map<String, String> map) {
            boolean z;
            boolean z2 = false;
            for (T t : this.f120297a.mo167406a().mo167402a()) {
                String str = map.get(t.mo167434a());
                String str2 = str;
                if (str2 == null || str2.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && (!Intrinsics.areEqual(t.mo167436b(), str))) {
                    t.mo167435a(str);
                    z2 = true;
                }
            }
            if (z2) {
                this.f120297a.mo167406a().notifyDataSetChanged();
            }
        }
    }

    /* renamed from: a */
    public final void mo167410a(OnFragmentDestroyListener fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "fragmentDestroyListener");
        this.f120278f = fVar;
    }

    /* renamed from: a */
    public final void mo167408a(Bundle bundle) {
        Activity activity;
        Intrinsics.checkParameterIsNotNull(bundle, "args");
        Log.m165389i("MomentsMainFragment", "setArgumentsFromSpec");
        Integer num = null;
        if (Intrinsics.areEqual(bundle.get("arguments_key_from"), "from_detail_title")) {
            Fragment a = mo167406a().mo167401a(Integer.valueOf(((UDTabLayout) mo167405a(R.id.tabLayout)).getSelectPosition()));
            if (a instanceof MomentsFeedFragment) {
                num = a;
            }
            MomentsFeedFragment momentsFeedFragment = (MomentsFeedFragment) num;
            if (momentsFeedFragment != null) {
                momentsFeedFragment.mo166901f();
            }
        } else if (!Intrinsics.areEqual(bundle.get("arguments_key_from"), "from_app_link") || !Intrinsics.areEqual(bundle.get("arguments_key_need_refresh"), (Object) true)) {
            if (Intrinsics.areEqual(bundle.get("arguments_key_from"), "from_profile_create_post") && (activity = this.f120275b) != null) {
                Intent intent = new Intent(activity, MomentsPublishActivity.class);
                MomentsFeedPagerAdapter a2 = mo167406a();
                UDTabLayout uDTabLayout = (UDTabLayout) mo167405a(R.id.tabLayout);
                if (uDTabLayout != null) {
                    num = Integer.valueOf(uDTabLayout.getSelectPosition());
                }
                if (!C47282k.m187260a(a2.mo167401a(num), intent, 211)) {
                    C47282k.m187260a(this, intent, 211);
                }
            }
            MomentsFeedFragment momentsFeedFragment2 = MomentsFeedPagerAdapter.f120270c.mo167404a().get();
            if (momentsFeedFragment2 != null) {
                momentsFeedFragment2.mo166890a(bundle);
            }
        } else {
            int i = 0;
            for (T t : mo167406a().mo167402a()) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (Intrinsics.areEqual(t.mo167434a(), String.valueOf(Tab.FeedTabId.FEED_RECOMMEND.getValue()))) {
                    ((UDTabLayout) mo167405a(R.id.tabLayout)).selectTabAt(i);
                    Fragment a3 = mo167406a().mo167401a(Integer.valueOf(i));
                    if (a3 instanceof MomentsFeedFragment) {
                        num = a3;
                    }
                    MomentsFeedFragment momentsFeedFragment3 = (MomentsFeedFragment) num;
                    if (momentsFeedFragment3 != null) {
                        momentsFeedFragment3.mo166901f();
                        return;
                    }
                    return;
                }
                i = i2;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        m188734e();
        m188735f();
    }

    /* renamed from: a */
    public final void mo167411a(boolean z, boolean z2) {
        Log.m165389i("MomentsMainFragment", "handlePageSwitch preIsCurrentsTab = " + z + " curIsCurrentsTab = " + z2);
        if (!z && !z2) {
            this.f120283k = 0;
        } else if (!z || !z2) {
            if (z2) {
                this.f120283k = 0;
                IMomentsTitleControllerProxy aVar = this.f120277e;
                if (aVar != null) {
                    aVar.mo167347a(MomentsAppNameHolder.m188686a());
                }
                MomentsHitPoint.f119720a.mo166835a(MomentsHitHelper.f119719r.mo166798b());
                MomentsHitHelper.f119719r.mo166818k();
            }
            if (z) {
                this.f120283k = 0;
            }
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f120283k < ((long) ParticipantRepo.f117150c)) {
                this.f120283k = 0;
                Fragment a = mo167406a().mo167401a(Integer.valueOf(((UDTabLayout) mo167405a(R.id.tabLayout)).getSelectPosition()));
                if (!(a instanceof MomentsFeedFragment)) {
                    a = null;
                }
                MomentsFeedFragment momentsFeedFragment = (MomentsFeedFragment) a;
                if (momentsFeedFragment != null) {
                    momentsFeedFragment.mo166901f();
                    return;
                }
                return;
            }
            this.f120283k = currentTimeMillis;
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        mo167412b().getUserGlobalConfigAndSettings();
        return layoutInflater.inflate(R.layout.fragment_moments_main_view, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1879) {
            List<Tab> list = null;
            List<Tab> serializableExtra = intent != null ? intent.getSerializableExtra("key_ordered_tabs") : null;
            String stringExtra = intent != null ? intent.getStringExtra("key_clicked_id") : null;
            if (serializableExtra instanceof List) {
                list = serializableExtra;
            }
            boolean z = true;
            int i3 = 0;
            if (list != null) {
                mo167412b().getTabListLiveData().mo5929b(serializableExtra);
                String str = stringExtra;
                if (!(str == null || str.length() == 0)) {
                    z = false;
                }
                if (!z) {
                    for (T t : serializableExtra) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (Intrinsics.areEqual(t.id, stringExtra)) {
                            mo167412b().getPositionToPage().mo5926a(Integer.valueOf(i3));
                            return;
                        }
                        i3 = i4;
                    }
                    return;
                }
                return;
            }
            String str2 = stringExtra;
            if (!(str2 == null || str2.length() == 0)) {
                z = false;
            }
            if (!z) {
                int i5 = 0;
                for (T t2 : mo167406a().mo167402a()) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    if (Intrinsics.areEqual(t2.mo167434a(), stringExtra)) {
                        ((ViewPager) mo167405a(R.id.viewPager)).setCurrentItem(i5, false);
                        return;
                    }
                    i5 = i6;
                }
                return;
            }
            return;
        }
        ArrayList<Fragment> arrayList = mo167406a().f120218a;
        Intrinsics.checkExpressionValueIsNotNull(arrayList, "pagerAdapter.mFragments");
        for (Fragment fragment : arrayList) {
            fragment.onActivityResult(i, i2, intent);
        }
        MomentsFeedFragment momentsFeedFragment = MomentsFeedPagerAdapter.f120270c.mo167404a().get();
        if (momentsFeedFragment != null) {
            momentsFeedFragment.onActivityResult(i, i2, intent);
        }
    }
}
