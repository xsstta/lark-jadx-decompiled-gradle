package com.ss.android.lark.mine.impl.custom_status.setting;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ak;
import androidx.navigation.C1259g;
import androidx.navigation.NavDestination;
import androidx.navigation.fragment.C1254b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.contact.v1.UserCustomStatus;
import com.google.firebase.messaging.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.jaeger.library.StatusBarUtil;
import com.larksuite.arch.jack.Async;
import com.larksuite.arch.jack.Disposable;
import com.larksuite.arch.jack.ISubscriber;
import com.larksuite.arch.jack.JackView;
import com.larksuite.arch.jack.JackViewModel;
import com.larksuite.arch.jack.LifecycleAwareLazy;
import com.larksuite.arch.jack.LifecycleOwnerHolder;
import com.larksuite.arch.jack.State;
import com.larksuite.arch.jack.SubscriptionConfig;
import com.larksuite.arch.jack.Tuple1;
import com.larksuite.arch.jack.Tuple2;
import com.larksuite.arch.jack.Tuple3;
import com.larksuite.arch.jack.Tuple4;
import com.larksuite.component.ignition.widget.setting_group.SettingGroupHelper;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.mine.impl.custom_status.CustomStatusUIUtils;
import com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment;
import com.ss.android.lark.mine.impl.custom_status.model.CustomStatusState;
import com.ss.android.lark.mine.impl.custom_status.model.CustomStatusViewModel;
import com.ss.android.lark.mine.impl.custom_status.model.ErrorEvent;
import com.ss.android.lark.mine.impl.custom_status.model.FetchSource;
import com.ss.android.lark.mine.impl.custom_status.setting.ExpandableAdapter;
import com.ss.android.lark.mine.impl.custom_status.setting.UserStatusSettingAdapter;
import com.ss.android.lark.mine.impl.custom_status.statistics.UserCustomStatusHitPoint;
import com.ss.android.lark.pb.im_settings.IsAllowedCreateUserCustomStatusResponse;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0001TB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0002J\u0010\u00104\u001a\u0002012\u0006\u00105\u001a\u00020\u0007H\u0002J\u0010\u00106\u001a\u0002012\u0006\u00107\u001a\u000208H\u0002J\b\u00109\u001a\u000201H\u0002J\u0010\u0010:\u001a\u0002012\u0006\u0010;\u001a\u00020<H\u0002J\u0016\u0010\u0017\u001a\u00020\u00182\f\u0010=\u001a\b\u0012\u0004\u0012\u00020?0>H\u0002J\u0010\u0010@\u001a\u0002012\u0006\u0010A\u001a\u00020?H\u0002J\b\u0010B\u001a\u000201H\u0002J\u0012\u0010C\u001a\u0002012\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J&\u0010F\u001a\u0004\u0018\u00010G2\u0006\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010K2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\b\u0010L\u001a\u000201H\u0016J\u001a\u0010M\u001a\u0002012\u0006\u0010N\u001a\u00020G2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\b\u0010O\u001a\u000201H\u0002J\b\u0010P\u001a\u000201H\u0002J\u0010\u0010Q\u001a\u0002012\u0006\u0010R\u001a\u00020SH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0012\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0015\u0010\u000eR\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001e\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X.¢\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b&\u0010\u0010\u001a\u0004\b%\u0010\u000eR\u001b\u0010'\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b)\u0010\u0010\u001a\u0004\b(\u0010\u000eR\u001b\u0010*\u001a\u00020+8BX\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b,\u0010-¨\u0006U"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/setting/UserCustomStatusSettingFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "Lcom/larksuite/arch/jack/JackView;", "()V", "createNewContent", "Landroid/widget/TextView;", "createNewLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "createNewLeftIcon", "Landroidx/appcompat/widget/AppCompatImageView;", "createNewRightIcon", "iconDisableColor", "", "getIconDisableColor", "()I", "iconDisableColor$delegate", "Lkotlin/Lazy;", "iconLeftEnableColor", "getIconLeftEnableColor", "iconLeftEnableColor$delegate", "iconRightEnableColor", "getIconRightEnableColor", "iconRightEnableColor$delegate", "isOverMaxCustomStatusSize", "", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "navController$delegate", "onLeaveSync", "Lcom/ss/android/lark/mine/impl/custom_status/setting/SettingSwitchItemView;", "onMeetingSync", "onScheduleSync", "settingAdapter", "Lcom/ss/android/lark/mine/impl/custom_status/setting/UserStatusSettingAdapter;", "textDisableColor", "getTextDisableColor", "textDisableColor$delegate", "textEnableColor", "getTextEnableColor", "textEnableColor$delegate", "viewModel", "Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusViewModel;", "getViewModel", "()Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusViewModel;", "viewModel$delegate", "Lcom/larksuite/arch/jack/LifecycleAwareLazy;", "initAutoSyncSetting", "", "linearLayout", "Landroid/widget/LinearLayout;", "initNewCustomStatus", "layout", "initRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "initSubscribers", "initTitleBar", "titleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "list", "", "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "navModify", UpdateKey.STATUS, "navNew", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onResume", "onViewCreated", "view", "setNewStatusDisable", "setNewStatusEnable", "toastErrorEvent", "event", "Lcom/ss/android/lark/mine/impl/custom_status/model/ErrorEvent;", "Companion", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UserCustomStatusSettingFragment extends BaseFragment implements JackView {

    /* renamed from: f */
    public static final Companion f115244f = new Companion(null);

    /* renamed from: a */
    public UserStatusSettingAdapter f115245a;

    /* renamed from: b */
    public SettingSwitchItemView f115246b;

    /* renamed from: c */
    public SettingSwitchItemView f115247c;

    /* renamed from: d */
    public SettingSwitchItemView f115248d;

    /* renamed from: e */
    public boolean f115249e;

    /* renamed from: g */
    private final Lazy f115250g = LazyKt.lazy(new C45635r(this));

    /* renamed from: h */
    private final LifecycleAwareLazy f115251h;

    /* renamed from: i */
    private ConstraintLayout f115252i;

    /* renamed from: j */
    private AppCompatImageView f115253j;

    /* renamed from: k */
    private TextView f115254k;

    /* renamed from: l */
    private AppCompatImageView f115255l;

    /* renamed from: m */
    private final Lazy f115256m;

    /* renamed from: n */
    private final Lazy f115257n;

    /* renamed from: o */
    private final Lazy f115258o;

    /* renamed from: p */
    private final Lazy f115259p;

    /* renamed from: q */
    private final Lazy f115260q;

    /* renamed from: r */
    private HashMap f115261r;

    /* renamed from: i */
    private final int m180981i() {
        return ((Number) this.f115256m.getValue()).intValue();
    }

    /* renamed from: j */
    private final int m180982j() {
        return ((Number) this.f115257n.getValue()).intValue();
    }

    /* renamed from: k */
    private final int m180983k() {
        return ((Number) this.f115258o.getValue()).intValue();
    }

    /* renamed from: l */
    private final int m180984l() {
        return ((Number) this.f115259p.getValue()).intValue();
    }

    /* renamed from: m */
    private final int m180985m() {
        return ((Number) this.f115260q.getValue()).intValue();
    }

    /* renamed from: c */
    public final C1259g mo160729c() {
        return (C1259g) this.f115250g.getValue();
    }

    /* renamed from: d */
    public final CustomStatusViewModel mo160730d() {
        return (CustomStatusViewModel) this.f115251h.getValue();
    }

    /* renamed from: h */
    public void mo160734h() {
        HashMap hashMap = this.f115261r;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo160734h();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/setting/UserCustomStatusSettingFragment$Companion;", "", "()V", "ITEM_THRESHOLD", "", "MAX_CUSTOM_STATUS_SIZE", "TAG", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.UserCustomStatusSettingFragment$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A, B, C> Disposable mo86224a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, KProperty1<S, ? extends C> eVar3, SubscriptionConfig<Tuple3<A, B, C>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(eVar3, "prop3");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87833a(this, lVar, eVar, eVar2, eVar3, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A, B, C, D> Disposable mo86225a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, KProperty1<S, ? extends C> eVar3, KProperty1<S, ? extends D> eVar4, SubscriptionConfig<Tuple4<A, B, C, D>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(eVar3, "prop3");
        Intrinsics.checkParameterIsNotNull(eVar4, "prop4");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87834a(this, lVar, eVar, eVar2, eVar3, eVar4, vVar, function1);
    }

    /* renamed from: a */
    public final void mo160726a(UserCustomStatus userCustomStatus) {
        NavDestination d = mo160729c().mo6341d();
        if (d != null && d.mo6254h() == R.id.customStatusSettingFragment) {
            mo160729c().mo6336b(R.id.action_modify_custom_status_from_setting, ModifyCustomStatusFragment.f115029d.mo160340a(userCustomStatus));
        }
    }

    /* renamed from: a */
    public final boolean mo160728a(List<UserCustomStatus> list) {
        int i;
        List<UserCustomStatus> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            i = 0;
            while (it.hasNext()) {
                if ((it.next().type == UserCustomStatus.Type.CUSTOM) && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        } else {
            i = 0;
        }
        if (i >= 20) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo160727a(ErrorEvent hVar) {
        String displayMsg = hVar.mo160537a().getDisplayMsg();
        if (displayMsg != null) {
            Context requireContext = requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
            Intrinsics.checkExpressionValueIsNotNull(displayMsg, "it");
            UDToast.show(requireContext, displayMsg);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.UserCustomStatusSettingFragment$b */
    static final class C45617b extends Lambda implements Function0<Integer> {
        public static final C45617b INSTANCE = new C45617b();

        C45617b() {
            super(0);
        }

        /* Return type fixed from 'int' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return UIHelper.getColor(R.color.icon_disable);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.UserCustomStatusSettingFragment$c */
    static final class C45618c extends Lambda implements Function0<Integer> {
        public static final C45618c INSTANCE = new C45618c();

        C45618c() {
            super(0);
        }

        /* Return type fixed from 'int' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return UIHelper.getColor(R.color.icon_n1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.UserCustomStatusSettingFragment$d */
    static final class C45619d extends Lambda implements Function0<Integer> {
        public static final C45619d INSTANCE = new C45619d();

        C45619d() {
            super(0);
        }

        /* Return type fixed from 'int' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return UIHelper.getColor(R.color.icon_n3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/navigation/NavController;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.UserCustomStatusSettingFragment$r */
    static final class C45635r extends Lambda implements Function0<C1259g> {
        final /* synthetic */ UserCustomStatusSettingFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45635r(UserCustomStatusSettingFragment userCustomStatusSettingFragment) {
            super(0);
            this.this$0 = userCustomStatusSettingFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C1259g invoke() {
            return C1254b.m5698a(this.this$0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.UserCustomStatusSettingFragment$s */
    static final class C45636s extends Lambda implements Function0<Integer> {
        public static final C45636s INSTANCE = new C45636s();

        C45636s() {
            super(0);
        }

        /* Return type fixed from 'int' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return UIHelper.getColor(R.color.text_disable);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.UserCustomStatusSettingFragment$t */
    static final class C45637t extends Lambda implements Function0<Integer> {
        public static final C45637t INSTANCE = new C45637t();

        C45637t() {
            super(0);
        }

        /* Return type fixed from 'int' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return UIHelper.getColor(R.color.text_title);
        }
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public LifecycleOwnerHolder mo86226a() {
        return JackView.C24027a.m87835a(this);
    }

    @Override // com.larksuite.arch.jack.LifecycleOwnerHolder
    public LifecycleOwner aZ_() {
        return JackView.C24027a.m87836b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.UserCustomStatusSettingFragment$u */
    static final class C45638u extends Lambda implements Function0<ak> {
        final /* synthetic */ UserCustomStatusSettingFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45638u(UserCustomStatusSettingFragment userCustomStatusSettingFragment) {
            super(0);
            this.this$0 = userCustomStatusSettingFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ak invoke() {
            FragmentActivity requireActivity = this.this$0.requireActivity();
            Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
            ak viewModelStore = requireActivity.getViewModelStore();
            Intrinsics.checkExpressionValueIsNotNull(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: e */
    public final void mo160731e() {
        NavDestination d = mo160729c().mo6341d();
        if (d != null && d.mo6254h() == R.id.customStatusSettingFragment) {
            mo160729c().mo6340c(R.id.action_new_custom_status_from_setting);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        StatusBarUtil.setColor(requireActivity(), ContextCompat.getColor(requireActivity(), R.color.bg_base), 0);
    }

    /* renamed from: f */
    public final void mo160732f() {
        AppCompatImageView appCompatImageView = this.f115253j;
        if (appCompatImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createNewLeftIcon");
        }
        appCompatImageView.setColorFilter(m180981i());
        TextView textView = this.f115254k;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createNewContent");
        }
        textView.setTextColor(m180982j());
        AppCompatImageView appCompatImageView2 = this.f115255l;
        if (appCompatImageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createNewRightIcon");
        }
        appCompatImageView2.setColorFilter(m180981i());
    }

    /* renamed from: g */
    public final void mo160733g() {
        AppCompatImageView appCompatImageView = this.f115253j;
        if (appCompatImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createNewLeftIcon");
        }
        appCompatImageView.setColorFilter(m180983k());
        TextView textView = this.f115254k;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createNewContent");
        }
        textView.setTextColor(m180985m());
        AppCompatImageView appCompatImageView2 = this.f115255l;
        if (appCompatImageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createNewRightIcon");
        }
        appCompatImageView2.setColorFilter(m180984l());
    }

    public UserCustomStatusSettingFragment() {
        C45638u uVar = new C45638u(this);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CustomStatusViewModel.class);
        this.f115251h = new LifecycleAwareLazy(orCreateKotlinClass, new UserCustomStatusSettingFragment$$special$$inlined$viewModel$1(orCreateKotlinClass), uVar, UserCustomStatusSettingFragment$$special$$inlined$viewModel$3.INSTANCE, UserCustomStatusSettingFragment$$special$$inlined$viewModel$2.INSTANCE);
        this.f115256m = LazyKt.lazy(C45617b.INSTANCE);
        this.f115257n = LazyKt.lazy(C45636s.INSTANCE);
        this.f115258o = LazyKt.lazy(C45618c.INSTANCE);
        this.f115259p = LazyKt.lazy(C45619d.INSTANCE);
        this.f115260q = LazyKt.lazy(C45637t.INSTANCE);
    }

    /* renamed from: n */
    private final void m180986n() {
        ISubscriber.C24024a.m87810a(this, mo160730d(), C45642d.INSTANCE, (SubscriptionConfig) null, new C45629m(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo160730d(), C45644f.INSTANCE, (SubscriptionConfig) null, new C45630n(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo160730d(), C45645g.INSTANCE, (SubscriptionConfig) null, new C45631o(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo160730d(), C45646h.INSTANCE, (SubscriptionConfig) null, new C45632p(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo160730d(), C45647i.INSTANCE, (SubscriptionConfig) null, new C45627k(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo160730d(), C45643e.INSTANCE, (SubscriptionConfig) null, new C45628l(this), 2, (Object) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/mine/impl/custom_status/setting/UserCustomStatusSettingFragment$initRecyclerView$1", "Lcom/ss/android/lark/mine/impl/custom_status/setting/UserStatusSettingAdapter$OnStatusClickListener;", "onClick", "", "context", "Landroid/content/Context;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.UserCustomStatusSettingFragment$i */
    public static final class C45624i implements UserStatusSettingAdapter.OnStatusClickListener {

        /* renamed from: a */
        final /* synthetic */ UserCustomStatusSettingFragment f115265a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.UserCustomStatusSettingFragment$i$a */
        static final class C45625a extends Lambda implements Function1<CustomStatusState, Unit> {
            final /* synthetic */ UserCustomStatus $data;
            final /* synthetic */ C45624i this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C45625a(C45624i iVar, UserCustomStatus userCustomStatus) {
                super(1);
                this.this$0 = iVar;
                this.$data = userCustomStatus;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CustomStatusState dVar) {
                invoke(dVar);
                return Unit.INSTANCE;
            }

            public final void invoke(CustomStatusState dVar) {
                Map<Long, UserCustomStatus> first;
                UserCustomStatus userCustomStatus;
                Intrinsics.checkParameterIsNotNull(dVar, "it");
                Pair<Map<Long, UserCustomStatus>, Long> a = dVar.mo160494i().mo86206a();
                if (a != null && (first = a.getFirst()) != null && (userCustomStatus = first.get(this.$data.id)) != null) {
                    UserCustomStatusHitPoint aVar = UserCustomStatusHitPoint.f115066a;
                    String str = userCustomStatus.event_name;
                    Intrinsics.checkExpressionValueIsNotNull(str, "status.event_name");
                    aVar.mo160427f(str);
                    this.this$0.f115265a.mo160726a(userCustomStatus);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45624i(UserCustomStatusSettingFragment userCustomStatusSettingFragment) {
            this.f115265a = userCustomStatusSettingFragment;
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.setting.UserStatusSettingAdapter.OnStatusClickListener
        /* renamed from: a */
        public void mo160739a(Context context, UserCustomStatus userCustomStatus) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(userCustomStatus, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f115265a.mo160730d().withState(new C45625a(this, userCustomStatus));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.UserCustomStatusSettingFragment$h */
    public static final class C45623h extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ UserCustomStatusSettingFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45623h(UserCustomStatusSettingFragment userCustomStatusSettingFragment) {
            super(1);
            this.this$0 = userCustomStatusSettingFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            UserCustomStatusHitPoint.f115066a.mo160433j();
            if (this.this$0.f115249e) {
                Context requireContext = this.this$0.requireContext();
                Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
                UDToast.show(requireContext, (int) R.string.Lark_Profile_CustomStatusLimit);
                return;
            }
            this.this$0.mo160730d().checkIsAllowCreateUserCustomStatus();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.UserCustomStatusSettingFragment$k */
    public static final class C45627k extends Lambda implements Function1<CustomStatusState, Unit> {
        final /* synthetic */ UserCustomStatusSettingFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45627k(UserCustomStatusSettingFragment userCustomStatusSettingFragment) {
            super(1);
            this.this$0 = userCustomStatusSettingFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CustomStatusState dVar) {
            invoke(dVar);
            return Unit.INSTANCE;
        }

        public final void invoke(CustomStatusState dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
            Boolean e = dVar.mo160488e();
            if (e != null) {
                UserCustomStatusSettingFragment.m180979c(this.this$0).setSwitchCheckedIgnoreEvent(e.booleanValue());
                UserCustomStatusSettingFragment.m180979c(this.this$0).setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.UserCustomStatusSettingFragment$l */
    public static final class C45628l extends Lambda implements Function1<CustomStatusState, Unit> {
        final /* synthetic */ UserCustomStatusSettingFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45628l(UserCustomStatusSettingFragment userCustomStatusSettingFragment) {
            super(1);
            this.this$0 = userCustomStatusSettingFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CustomStatusState dVar) {
            invoke(dVar);
            return Unit.INSTANCE;
        }

        public final void invoke(CustomStatusState dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
            Boolean f = dVar.mo160490f();
            if (f != null) {
                UserCustomStatusSettingFragment.m180980d(this.this$0).setSwitchCheckedIgnoreEvent(f.booleanValue());
                UserCustomStatusSettingFragment.m180980d(this.this$0).setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.UserCustomStatusSettingFragment$m */
    public static final class C45629m extends Lambda implements Function1<CustomStatusState, Unit> {
        final /* synthetic */ UserCustomStatusSettingFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45629m(UserCustomStatusSettingFragment userCustomStatusSettingFragment) {
            super(1);
            this.this$0 = userCustomStatusSettingFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CustomStatusState dVar) {
            invoke(dVar);
            return Unit.INSTANCE;
        }

        public final void invoke(CustomStatusState dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
            List<UserCustomStatus> a = dVar.mo160484a();
            if (a != null) {
                if (dVar.mo160491g()) {
                    ExpandableAdapter.m180955b(UserCustomStatusSettingFragment.m180973a(this.this$0), a, ExpandableAdapter.DisplayState.ShowCollapse, false, 4, null);
                } else {
                    ExpandableAdapter.m180955b(UserCustomStatusSettingFragment.m180973a(this.this$0), a, null, false, 6, null);
                }
                if (this.this$0.mo160728a(a)) {
                    this.this$0.f115249e = true;
                    this.this$0.mo160732f();
                    return;
                }
                this.this$0.f115249e = false;
                this.this$0.mo160733g();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.UserCustomStatusSettingFragment$n */
    public static final class C45630n extends Lambda implements Function1<CustomStatusState, Unit> {
        final /* synthetic */ UserCustomStatusSettingFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45630n(UserCustomStatusSettingFragment userCustomStatusSettingFragment) {
            super(1);
            this.this$0 = userCustomStatusSettingFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CustomStatusState dVar) {
            invoke(dVar);
            return Unit.INSTANCE;
        }

        public final void invoke(CustomStatusState dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
            IsAllowedCreateUserCustomStatusResponse a = dVar.mo160495j().mo86215a();
            if (a != null) {
                Boolean bool = a.mis_allowed;
                Intrinsics.checkExpressionValueIsNotNull(bool, "it.mis_allowed");
                if (bool.booleanValue()) {
                    this.this$0.mo160731e();
                    return;
                }
                Context requireContext = this.this$0.requireContext();
                Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
                UDToast.show(requireContext, (int) R.string.Lark_Profile_CustomStatusLimit);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.UserCustomStatusSettingFragment$o */
    public static final class C45631o extends Lambda implements Function1<CustomStatusState, Unit> {
        final /* synthetic */ UserCustomStatusSettingFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45631o(UserCustomStatusSettingFragment userCustomStatusSettingFragment) {
            super(1);
            this.this$0 = userCustomStatusSettingFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CustomStatusState dVar) {
            invoke(dVar);
            return Unit.INSTANCE;
        }

        public final void invoke(CustomStatusState dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
            ErrorEvent a = dVar.mo160496k().mo86215a();
            if (a instanceof ErrorEvent.IsAllowedToCreateStatus) {
                this.this$0.mo160727a(a);
            } else if (a instanceof ErrorEvent.GetUserStatus) {
                this.this$0.mo160727a(a);
            } else if (a instanceof ErrorEvent.SettingSync) {
                int i = C45641c.f115271a[((ErrorEvent.SettingSync) a).mo160538b().ordinal()];
                if (i == 1) {
                    UserCustomStatusSettingFragment.m180978b(this.this$0).mo160715a();
                } else if (i == 2) {
                    UserCustomStatusSettingFragment.m180979c(this.this$0).mo160715a();
                } else if (i == 3) {
                    UserCustomStatusSettingFragment.m180980d(this.this$0).mo160715a();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.UserCustomStatusSettingFragment$p */
    public static final class C45632p extends Lambda implements Function1<CustomStatusState, Unit> {
        final /* synthetic */ UserCustomStatusSettingFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45632p(UserCustomStatusSettingFragment userCustomStatusSettingFragment) {
            super(1);
            this.this$0 = userCustomStatusSettingFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CustomStatusState dVar) {
            invoke(dVar);
            return Unit.INSTANCE;
        }

        public final void invoke(CustomStatusState dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
            Boolean d = dVar.mo160487d();
            if (d != null) {
                UserCustomStatusSettingFragment.m180978b(this.this$0).setSwitchCheckedIgnoreEvent(d.booleanValue());
                UserCustomStatusSettingFragment.m180978b(this.this$0).setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "pos", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.UserCustomStatusSettingFragment$j */
    public static final class C45626j extends Lambda implements Function1<Integer, Boolean> {
        final /* synthetic */ UserCustomStatusSettingFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45626j(UserCustomStatusSettingFragment userCustomStatusSettingFragment) {
            super(1);
            this.this$0 = userCustomStatusSettingFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(invoke(num.intValue()));
        }

        public final boolean invoke(int i) {
            if (UserCustomStatusSettingFragment.m180973a(this.this$0).getItemViewType(i) == ExpandableAdapter.DisplayState.Normal.ordinal()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ UserStatusSettingAdapter m180973a(UserCustomStatusSettingFragment userCustomStatusSettingFragment) {
        UserStatusSettingAdapter jVar = userCustomStatusSettingFragment.f115245a;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settingAdapter");
        }
        return jVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ SettingSwitchItemView m180978b(UserCustomStatusSettingFragment userCustomStatusSettingFragment) {
        SettingSwitchItemView settingSwitchItemView = userCustomStatusSettingFragment.f115246b;
        if (settingSwitchItemView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onLeaveSync");
        }
        return settingSwitchItemView;
    }

    /* renamed from: c */
    public static final /* synthetic */ SettingSwitchItemView m180979c(UserCustomStatusSettingFragment userCustomStatusSettingFragment) {
        SettingSwitchItemView settingSwitchItemView = userCustomStatusSettingFragment.f115247c;
        if (settingSwitchItemView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onMeetingSync");
        }
        return settingSwitchItemView;
    }

    /* renamed from: d */
    public static final /* synthetic */ SettingSwitchItemView m180980d(UserCustomStatusSettingFragment userCustomStatusSettingFragment) {
        SettingSwitchItemView settingSwitchItemView = userCustomStatusSettingFragment.f115248d;
        if (settingSwitchItemView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onScheduleSync");
        }
        return settingSwitchItemView;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo160730d().fetchUserCustomStatus(FetchSource.PersonalStatusSetting);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/mine/impl/custom_status/setting/UserCustomStatusSettingFragment$initTitleBar$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.UserCustomStatusSettingFragment$q */
    public static final class View$OnClickListenerC45633q implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UserCustomStatusSettingFragment f115266a;

        View$OnClickListenerC45633q(UserCustomStatusSettingFragment userCustomStatusSettingFragment) {
            this.f115266a = userCustomStatusSettingFragment;
        }

        public final void onClick(View view) {
            this.f115266a.mo160730d().withState(new Function1<CustomStatusState, Unit>(this) {
                /* class com.ss.android.lark.mine.impl.custom_status.setting.UserCustomStatusSettingFragment.View$OnClickListenerC45633q.C456341 */
                final /* synthetic */ View$OnClickListenerC45633q this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CustomStatusState dVar) {
                    invoke(dVar);
                    return Unit.INSTANCE;
                }

                public final void invoke(CustomStatusState dVar) {
                    boolean z;
                    boolean z2;
                    Intrinsics.checkParameterIsNotNull(dVar, "it");
                    UserCustomStatusHitPoint aVar = UserCustomStatusHitPoint.f115066a;
                    Boolean d = dVar.mo160487d();
                    boolean z3 = false;
                    if (d != null) {
                        z = d.booleanValue();
                    } else {
                        z = false;
                    }
                    Boolean e = dVar.mo160488e();
                    if (e != null) {
                        z2 = e.booleanValue();
                    } else {
                        z2 = false;
                    }
                    Boolean f = dVar.mo160490f();
                    if (f != null) {
                        z3 = f.booleanValue();
                    }
                    aVar.mo160410a(z, z2, z3);
                    if (!this.this$0.f115266a.mo160729c().mo6337b()) {
                        this.this$0.f115266a.finish();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private final void m180977a(CommonTitleBar commonTitleBar) {
        commonTitleBar.setLeftClickListener(new View$OnClickListenerC45633q(this));
        commonTitleBar.setBackgroundColor(UIHelper.getColor(R.color.bg_base));
    }

    /* renamed from: a */
    private final void m180974a(LinearLayout linearLayout) {
        View findViewById = linearLayout.findViewById(R.id.on_leave);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.on_leave)");
        this.f115246b = (SettingSwitchItemView) findViewById;
        View findViewById2 = linearLayout.findViewById(R.id.on_meeting);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.on_meeting)");
        this.f115247c = (SettingSwitchItemView) findViewById2;
        View findViewById3 = linearLayout.findViewById(R.id.on_calendar);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.on_calendar)");
        this.f115248d = (SettingSwitchItemView) findViewById3;
        SettingSwitchItemView settingSwitchItemView = this.f115246b;
        if (settingSwitchItemView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onLeaveSync");
        }
        settingSwitchItemView.setOnCheckedChangeListener(new C45620e(this));
        SettingSwitchItemView settingSwitchItemView2 = this.f115247c;
        if (settingSwitchItemView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onMeetingSync");
        }
        settingSwitchItemView2.setOnCheckedChangeListener(new C45621f(this));
        SettingSwitchItemView settingSwitchItemView3 = this.f115248d;
        if (settingSwitchItemView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onScheduleSync");
        }
        settingSwitchItemView3.setOnCheckedChangeListener(new C45622g(this));
    }

    /* renamed from: a */
    private final void m180975a(ConstraintLayout constraintLayout) {
        this.f115252i = constraintLayout;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createNewLayout");
        }
        View findViewById = constraintLayout.findViewById(R.id.left_image);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "createNewLayout.findViewById(R.id.left_image)");
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById;
        this.f115253j = appCompatImageView;
        if (appCompatImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createNewLeftIcon");
        }
        AppCompatImageView appCompatImageView2 = this.f115253j;
        if (appCompatImageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createNewLeftIcon");
        }
        appCompatImageView.setColorFilter(ContextCompat.getColor(appCompatImageView2.getContext(), R.color.ud_B500), PorterDuff.Mode.SRC_IN);
        ConstraintLayout constraintLayout2 = this.f115252i;
        if (constraintLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createNewLayout");
        }
        View findViewById2 = constraintLayout2.findViewById(R.id.center_content);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "createNewLayout.findViewById(R.id.center_content)");
        this.f115254k = (TextView) findViewById2;
        ConstraintLayout constraintLayout3 = this.f115252i;
        if (constraintLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createNewLayout");
        }
        View findViewById3 = constraintLayout3.findViewById(R.id.right_image);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "createNewLayout.findViewById(R.id.right_image)");
        this.f115255l = (AppCompatImageView) findViewById3;
        CustomStatusUIUtils.f115068a.mo160435a(constraintLayout, new C45623h(this));
    }

    /* renamed from: a */
    private final void m180976a(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "recyclerView.context");
        UserStatusSettingAdapter jVar = new UserStatusSettingAdapter(context, 6, new C45624i(this));
        this.f115245a = jVar;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settingAdapter");
        }
        recyclerView.setAdapter(jVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        SettingGroupHelper.m88818a(recyclerView, false, 0, new C45626j(this), 6, null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.UserCustomStatusSettingFragment$e */
    public static final class C45620e implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ UserCustomStatusSettingFragment f115262a;

        C45620e(UserCustomStatusSettingFragment userCustomStatusSettingFragment) {
            this.f115262a = userCustomStatusSettingFragment;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f115262a.mo160730d().updateOnLeaveSyncSetting(z);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.UserCustomStatusSettingFragment$f */
    public static final class C45621f implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ UserCustomStatusSettingFragment f115263a;

        C45621f(UserCustomStatusSettingFragment userCustomStatusSettingFragment) {
            this.f115263a = userCustomStatusSettingFragment;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f115263a.mo160730d().updateMeetingSyncSetting(z);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.UserCustomStatusSettingFragment$g */
    public static final class C45622g implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ UserCustomStatusSettingFragment f115264a;

        C45622g(UserCustomStatusSettingFragment userCustomStatusSettingFragment) {
            this.f115264a = userCustomStatusSettingFragment;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f115264a.mo160730d().updateScheduleSyncSetting(z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.title_bar);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.title_bar)");
        m180977a((CommonTitleBar) findViewById);
        View findViewById2 = view.findViewById(R.id.custom_status_recycler);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.custom_status_recycler)");
        m180976a((RecyclerView) findViewById2);
        View findViewById3 = view.findViewById(R.id.new_custom_status);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.findViewById(R.id.new_custom_status)");
        m180975a((ConstraintLayout) findViewById3);
        View findViewById4 = view.findViewById(R.id.auto_sync_setting_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "view.findViewById(R.id.a…o_sync_setting_container)");
        m180974a((LinearLayout) findViewById4);
        m180986n();
        UserCustomStatusHitPoint.f115066a.mo160432i();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_setting_custom_status, viewGroup, false);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State> Disposable mo86220a(JackViewModel<S> lVar, SubscriptionConfig<S> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$subscribe");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87829a(this, lVar, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A> Disposable mo86221a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, SubscriptionConfig<Tuple1<A>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87830a(this, lVar, eVar, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A, B> Disposable mo86223a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, SubscriptionConfig<Tuple2<A, B>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87832a(this, lVar, eVar, eVar2, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, T> Disposable mo86222a(JackViewModel<S> lVar, KProperty1<S, ? extends Async<? extends T>> eVar, SubscriptionConfig<Tuple1<Async<T>>> vVar, Function1<? super Throwable, Unit> function1, Function0<Unit> function0, Function1<? super T, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$asyncSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        return JackView.C24027a.m87831a(this, lVar, eVar, vVar, function1, function0, function12);
    }
}
