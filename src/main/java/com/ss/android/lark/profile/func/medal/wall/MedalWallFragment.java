package com.ss.android.lark.profile.func.medal.wall;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1143ag;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ak;
import androidx.recyclerview.widget.GridLayoutManager;
import com.larksuite.arch.jack.Async;
import com.larksuite.arch.jack.Disposable;
import com.larksuite.arch.jack.Event;
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
import com.larksuite.component.decoration.avatar.DecoratedAvatar;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.C38818i;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.image.entity.PassThroughImage;
import com.ss.android.lark.pb.entities.ImageSetPassThrough;
import com.ss.android.lark.profile.func.medal.Medal;
import com.ss.android.lark.profile.func.medal.utils.StatusBarUtil;
import com.ss.android.lark.profile.func.medal.wall.MedalWallAdapter;
import com.ss.android.lark.profile.service.C52904e;
import com.ss.android.lark.profile.statistics.UserProfileHitPointV3;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty1;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0019\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00012B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u001eH\u0002J\b\u0010\"\u001a\u00020\u001eH\u0002J\b\u0010#\u001a\u00020\u001eH\u0002J\b\u0010$\u001a\u00020\u001eH\u0002J\b\u0010%\u001a\u00020\u001eH\u0002J\b\u0010&\u001a\u00020\u001eH\u0002J\u0012\u0010'\u001a\u00020\u001e2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J&\u0010*\u001a\u0004\u0018\u00010\t2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u001a\u0010/\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0006\u00101\u001a\u00020\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001a\u0010\u001b¨\u00063"}, d2 = {"Lcom/ss/android/lark/profile/func/medal/wall/MedalWallFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "Lcom/larksuite/arch/jack/JackView;", "()V", "avatarSize", "", "medalWallAdapter", "Lcom/ss/android/lark/profile/func/medal/wall/MedalWallAdapter;", "rootView", "Landroid/view/View;", "userAvatarView", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "getUserAvatarView", "()Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "userAvatarView$delegate", "Lkotlin/Lazy;", "userId", "", "viewModel", "Lcom/ss/android/lark/profile/func/medal/wall/MedalWallViewModel;", "getViewModel", "()Lcom/ss/android/lark/profile/func/medal/wall/MedalWallViewModel;", "viewModel$delegate", "Lcom/larksuite/arch/jack/LifecycleAwareLazy;", "viewModelFactory", "com/ss/android/lark/profile/func/medal/wall/MedalWallFragment$viewModelFactory$2$1", "getViewModelFactory", "()Lcom/ss/android/lark/profile/func/medal/wall/MedalWallFragment$viewModelFactory$2$1;", "viewModelFactory$delegate", "displayEmptyPage", "", "isShow", "", "initAvatarView", "initRVMedalsLayoutListener", "initRecyclerView", "initSubscribe", "initTitleBar", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "removeWearFragment", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.medal.wall.c */
public final class MedalWallFragment extends BaseFragment implements JackView {

    /* renamed from: e */
    public static final Companion f129846e = new Companion(null);

    /* renamed from: a */
    public String f129847a = "";

    /* renamed from: b */
    public int f129848b = UIHelper.dp2px(108.0f);

    /* renamed from: c */
    public View f129849c;

    /* renamed from: d */
    public MedalWallAdapter f129850d;

    /* renamed from: f */
    private final Lazy f129851f = LazyKt.lazy(new C52412l(this));

    /* renamed from: g */
    private final Lazy f129852g = LazyKt.lazy(new C52415o(this));

    /* renamed from: h */
    private final LifecycleAwareLazy f129853h;

    /* renamed from: i */
    private HashMap f129854i;

    /* renamed from: i */
    private final LKUIRoundedImageView2 m203143i() {
        return (LKUIRoundedImageView2) this.f129851f.getValue();
    }

    /* renamed from: a */
    public View mo179330a(int i) {
        if (this.f129854i == null) {
            this.f129854i = new HashMap();
        }
        View view = (View) this.f129854i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f129854i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public final C52415o.C524161 mo179332c() {
        return (C52415o.C524161) this.f129852g.getValue();
    }

    /* renamed from: d */
    public final MedalWallViewModel mo179333d() {
        return (MedalWallViewModel) this.f129853h.getValue();
    }

    /* renamed from: h */
    public void mo179337h() {
        HashMap hashMap = this.f129854i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo179337h();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/profile/func/medal/wall/MedalWallFragment$Companion;", "", "()V", "HEADER_IMAGE_RATIO", "", "KEY_IS_RESIGNED", "", "KEY_IS_SAME_TENANT", "KEY_USER_ID", "MEDAL_COLUMN_NUM", "", "TAG", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.wall.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo179331a(boolean z) {
        UIUtils.display((AppCompatImageView) mo179330a(R.id.iv_empty), z);
        UIUtils.display((TextView) mo179330a(R.id.tv_empty_tip), z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/lark/profile/func/medal/wall/MedalWallFragment$viewModelFactory$2$1", "invoke", "()Lcom/ss/android/lark/profile/func/medal/wall/MedalWallFragment$viewModelFactory$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.wall.c$n */
    static final class C52414n extends Lambda implements Function0<C52415o.C524161> {
        final /* synthetic */ MedalWallFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52414n(MedalWallFragment cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C52415o.C524161 invoke() {
            return this.this$0.mo179332c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/lark/profile/func/medal/wall/MedalWallFragment$viewModelFactory$2$1", "invoke", "()Lcom/ss/android/lark/profile/func/medal/wall/MedalWallFragment$viewModelFactory$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.wall.c$o */
    static final class C52415o extends Lambda implements Function0<C524161> {
        final /* synthetic */ MedalWallFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52415o(MedalWallFragment cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C524161 invoke() {
            return new C1144ai.AbstractC1146b(this) {
                /* class com.ss.android.lark.profile.func.medal.wall.MedalWallFragment.C52415o.C524161 */

                /* renamed from: a */
                final /* synthetic */ C52415o f129863a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f129863a = r1;
                }

                @Override // androidx.lifecycle.C1144ai.AbstractC1146b
                public <T extends AbstractC1142af> T create(Class<T> cls) {
                    Intrinsics.checkParameterIsNotNull(cls, "modelClass");
                    if (this.f129863a.this$0.getArguments() == null) {
                        return new MedalWallViewModel(this.f129863a.this$0.f129847a, false, false, 6, null);
                    }
                    MedalWallFragment cVar = this.f129863a.this$0;
                    String string = this.f129863a.this$0.requireArguments().getString("key_user_id", "");
                    Intrinsics.checkExpressionValueIsNotNull(string, "requireArguments().getString(KEY_USER_ID, \"\")");
                    cVar.f129847a = string;
                    return new MedalWallViewModel(this.f129863a.this$0.f129847a, this.f129863a.this$0.requireArguments().getBoolean("key_is_resigned", false), this.f129863a.this$0.requireArguments().getBoolean("is_same_tenant", true));
                }
            };
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

    /* renamed from: j */
    private final void m203144j() {
        m203147m();
        m203146l();
        m203145k();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.wall.c$m */
    static final class C52413m extends Lambda implements Function0<ak> {
        final /* synthetic */ MedalWallFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52413m(MedalWallFragment cVar) {
            super(0);
            this.this$0 = cVar;
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

    /* renamed from: k */
    private final void m203145k() {
        ViewTreeObserver$OnGlobalLayoutListenerC52394b bVar = new ViewTreeObserver$OnGlobalLayoutListenerC52394b(this);
        CommonRecyclerView commonRecyclerView = (CommonRecyclerView) mo179330a(R.id.rv_medals);
        Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView, "rv_medals");
        commonRecyclerView.getViewTreeObserver().addOnGlobalLayoutListener(bVar);
    }

    /* renamed from: l */
    private final void m203146l() {
        ((DecoratedAvatar) mo179330a(R.id.decorated_avatar)).mo86670a(m203143i());
    }

    /* renamed from: g */
    public final void mo179336g() {
        MedalWallViewModel d = mo179333d();
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
        FragmentManager supportFragmentManager = requireActivity.getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "requireActivity().supportFragmentManager");
        d.removeWearFragment(supportFragmentManager);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/profile/func/medal/wall/MedalWallFragment$initRVMedalsLayoutListener$listener$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.wall.c$b */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC52394b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ MedalWallFragment f129855a;

        public void onGlobalLayout() {
            CommonRecyclerView commonRecyclerView = (CommonRecyclerView) this.f129855a.mo179330a(R.id.rv_medals);
            Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView, "rv_medals");
            commonRecyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f129855a.mo179335f();
            this.f129855a.mo179334e();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC52394b(MedalWallFragment cVar) {
            this.f129855a = cVar;
        }
    }

    /* renamed from: m */
    private final void m203147m() {
        Context requireContext = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
        mo179333d().withState(new C52409k((CommonTitleBar) mo179330a(R.id.title_bar), this, UDIconUtils.getIconDrawable(requireContext, (int) R.drawable.ud_icon_left_outlined, C57582a.m223616d(getContext(), R.color.static_white))));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/medal/wall/MedalWallState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.wall.c$h */
    public static final class C52402h extends Lambda implements Function1<MedalWallState, Unit> {
        final /* synthetic */ MedalWallFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52402h(MedalWallFragment cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/profile/func/medal/wall/MedalWallFragment$initSubscribe$2$2$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.medal.wall.c$h$a */
        public static final class RunnableC52403a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ ImageSetPassThrough f129857a;

            /* renamed from: b */
            final /* synthetic */ C52402h f129858b;

            RunnableC52403a(ImageSetPassThrough imageSetPassThrough, C52402h hVar) {
                this.f129857a = imageSetPassThrough;
                this.f129858b = hVar;
            }

            public final void run() {
                ImageLoader.with(this.f129858b.this$0.getContext()).load(new PassThroughImage(this.f129857a.mkey, this.f129857a.mfs_unit)).override(MedalWallFragment.m203141a(this.f129858b.this$0).getWidth(), (int) (((float) MedalWallFragment.m203141a(this.f129858b.this$0).getWidth()) / 1.44f)).asBitmap().centerCrop().into(new C38818i<Bitmap>(this) {
                    /* class com.ss.android.lark.profile.func.medal.wall.MedalWallFragment.C52402h.RunnableC52403a.C524041 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC52403a f129859a;

                    {
                        this.f129859a = r1;
                    }

                    /* renamed from: a */
                    public void mo49248a(final Bitmap bitmap) {
                        UICallbackExecutor.execute(new Runnable(this) {
                            /* class com.ss.android.lark.profile.func.medal.wall.MedalWallFragment.C52402h.RunnableC52403a.C524041.RunnableC524051 */

                            /* renamed from: a */
                            final /* synthetic */ C524041 f129860a;

                            {
                                this.f129860a = r1;
                            }

                            public final void run() {
                                final Bitmap bitmap = bitmap;
                                if (bitmap != null) {
                                    Job unused = C69553g.m266944a(C1143ag.m5356a(this.f129860a.f129859a.f129858b.this$0.mo179333d()), null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) {
                                        /* class com.ss.android.lark.profile.func.medal.wall.MedalWallFragment.C52402h.RunnableC52403a.C524041.RunnableC524051.C524061 */
                                        int I$0;
                                        Object L$0;
                                        int label;
                                        private CoroutineScope p$;

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                                            Intrinsics.checkParameterIsNotNull(cVar, "completion");
                                            C524061 r0 = 

                                            /* Return type fixed from 'java.lang.Object' to match base method */
                                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(MedalWallState nVar) {
                                                invoke(nVar);
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(MedalWallState nVar) {
                                                boolean z;
                                                Intrinsics.checkParameterIsNotNull(nVar, "$receiver");
                                                ImageSetPassThrough a = nVar.mo179354a();
                                                if (a != null) {
                                                    String str = a.mkey;
                                                    if (str == null || str.length() == 0) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    if (!(!z)) {
                                                        a = null;
                                                    }
                                                    if (a != null) {
                                                        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
                                                        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
                                                        coreThreadPool.getCachedThreadPool().execute(new RunnableC52403a(a, this));
                                                    }
                                                }
                                            }
                                        }

                                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
                                        /* renamed from: com.ss.android.lark.profile.func.medal.wall.c$l */
                                        static final class C52412l extends Lambda implements Function0<LKUIRoundedImageView2> {
                                            final /* synthetic */ MedalWallFragment this$0;

                                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                            C52412l(MedalWallFragment cVar) {
                                                super(0);
                                                this.this$0 = cVar;
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public final LKUIRoundedImageView2 invoke() {
                                                FragmentActivity requireActivity = this.this$0.requireActivity();
                                                Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
                                                LKUIRoundedImageView2 lKUIRoundedImageView2 = new LKUIRoundedImageView2(requireActivity, null, 0, 6, null);
                                                lKUIRoundedImageView2.setLayoutParams(new FrameLayout.LayoutParams(this.this$0.f129848b, this.this$0.f129848b));
                                                lKUIRoundedImageView2.setOval(true);
                                                Context context = lKUIRoundedImageView2.getContext();
                                                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                                                lKUIRoundedImageView2.setBorderColor(UDColorUtils.getColor(context, R.color.static_white));
                                                lKUIRoundedImageView2.setBorderWidth((float) UIHelper.dp2px(2.0f));
                                                Context context2 = lKUIRoundedImageView2.getContext();
                                                Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                                                lKUIRoundedImageView2.setBackgroundColor(UDColorUtils.getColor(context2, R.color.bg_body_overlay));
                                                return lKUIRoundedImageView2;
                                            }
                                        }

                                        public MedalWallFragment() {
                                            C52413m mVar = new C52413m(this);
                                            C52414n nVar = new C52414n(this);
                                            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MedalWallViewModel.class);
                                            this.f129853h = new LifecycleAwareLazy(orCreateKotlinClass, new MedalWallFragment$$special$$inlined$viewModel$1(orCreateKotlinClass), mVar, nVar, MedalWallFragment$$special$$inlined$viewModel$2.INSTANCE);
                                        }

                                        /* renamed from: f */
                                        public final void mo179335f() {
                                            CommonRecyclerView commonRecyclerView = (CommonRecyclerView) mo179330a(R.id.rv_medals);
                                            Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView, "rv_medals");
                                            int measuredWidth = commonRecyclerView.getMeasuredWidth() / MedalItemDecoration.f129840b.mo179329a();
                                            CommonRecyclerView commonRecyclerView2 = (CommonRecyclerView) mo179330a(R.id.rv_medals);
                                            Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView2, "rv_medals");
                                            commonRecyclerView2.setLayoutManager(new GridLayoutManager(getContext(), measuredWidth));
                                            this.f129850d = new MedalWallAdapter(new C52395c(this));
                                            CommonRecyclerView commonRecyclerView3 = (CommonRecyclerView) mo179330a(R.id.rv_medals);
                                            Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView3, "rv_medals");
                                            MedalWallAdapter medalWallAdapter = this.f129850d;
                                            if (medalWallAdapter == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException("medalWallAdapter");
                                            }
                                            commonRecyclerView3.setAdapter(medalWallAdapter);
                                            ((CommonRecyclerView) mo179330a(R.id.rv_medals)).addItemDecoration(new MedalItemDecoration());
                                        }

                                        /* renamed from: e */
                                        public final void mo179334e() {
                                            ISubscriber.C24024a.m87810a(this, mo179333d(), C52417d.INSTANCE, (SubscriptionConfig) null, new C52402h(this), 2, (Object) null);
                                            ISubscriber.C24024a.m87810a(this, mo179333d(), C52422i.INSTANCE, (SubscriptionConfig) null, new C52407i(this), 2, (Object) null);
                                            ISubscriber.C24024a.m87816a(this, mo179333d(), C52423j.INSTANCE, C52424k.INSTANCE, C52425l.INSTANCE, (SubscriptionConfig) null, new C52408j(this), 8, (Object) null);
                                            ISubscriber.C24024a.m87814a(this, mo179333d(), C52426m.INSTANCE, C52418e.INSTANCE, (SubscriptionConfig) null, new C52397d(this), 4, (Object) null);
                                            ISubscriber.C24024a.m87810a(this, mo179333d(), C52419f.INSTANCE, (SubscriptionConfig) null, new C52398e(this), 2, (Object) null);
                                            ISubscriber.C24024a.m87810a(this, mo179333d(), C52420g.INSTANCE, (SubscriptionConfig) null, new C52399f(this), 2, (Object) null);
                                            ISubscriber.C24024a.m87810a(this, mo179333d(), C52421h.INSTANCE, (SubscriptionConfig) null, new C52400g(this), 2, (Object) null);
                                        }

                                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/profile/func/medal/wall/MedalWallFragment$initRecyclerView$1", "Lcom/ss/android/lark/profile/func/medal/wall/MedalWallAdapter$IMedalDependency;", "onMedalClick", "", "medalId", "", "grantId", "takeOffMedal", "medal", "Lcom/ss/android/lark/profile/func/medal/Medal;", "wearMedal", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
                                        /* renamed from: com.ss.android.lark.profile.func.medal.wall.c$c */
                                        public static final class C52395c implements MedalWallAdapter.IMedalDependency {

                                            /* renamed from: a */
                                            final /* synthetic */ MedalWallFragment f129856a;

                                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/profile/func/medal/wall/MedalWallState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
                                            /* renamed from: com.ss.android.lark.profile.func.medal.wall.c$c$a */
                                            static final class C52396a extends Lambda implements Function1<MedalWallState, Unit> {
                                                final /* synthetic */ String $grantId;
                                                final /* synthetic */ String $medalId;
                                                final /* synthetic */ C52395c this$0;

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                C52396a(C52395c cVar, String str, String str2) {
                                                    super(1);
                                                    this.this$0 = cVar;
                                                    this.$medalId = str;
                                                    this.$grantId = str2;
                                                }

                                                /* Return type fixed from 'java.lang.Object' to match base method */
                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(MedalWallState nVar) {
                                                    invoke(nVar);
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(MedalWallState nVar) {
                                                    Intrinsics.checkParameterIsNotNull(nVar, "it");
                                                    C52904e.m204638a().mo180525a(this.this$0.f129856a.requireActivity(), nVar.mo179367k(), this.$medalId, this.$grantId);
                                                    UserProfileHitPointV3.f130746c.mo180581d(this.$medalId);
                                                }
                                            }

                                            /* JADX WARN: Incorrect args count in method signature: ()V */
                                            C52395c(MedalWallFragment cVar) {
                                                this.f129856a = cVar;
                                            }

                                            @Override // com.ss.android.lark.profile.func.medal.wall.MedalWallAdapter.IMedalDependency
                                            /* renamed from: a */
                                            public void mo179318a(Medal aVar) {
                                                Intrinsics.checkParameterIsNotNull(aVar, "medal");
                                                this.f129856a.mo179333d().updateSelectedMedal(aVar);
                                                this.f129856a.mo179333d().takeOffMedal();
                                                UserProfileHitPointV3.f130746c.mo180577c(aVar.mo179230a());
                                            }

                                            @Override // com.ss.android.lark.profile.func.medal.wall.MedalWallAdapter.IMedalDependency
                                            /* renamed from: b */
                                            public void mo179320b(Medal aVar) {
                                                Intrinsics.checkParameterIsNotNull(aVar, "medal");
                                                this.f129856a.mo179333d().updateSelectedMedal(aVar);
                                                MedalWallViewModel d = this.f129856a.mo179333d();
                                                FragmentActivity requireActivity = this.f129856a.requireActivity();
                                                Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
                                                d.prepareMedalBackground(requireActivity);
                                                MedalWallViewModel d2 = this.f129856a.mo179333d();
                                                FragmentActivity requireActivity2 = this.f129856a.requireActivity();
                                                Intrinsics.checkExpressionValueIsNotNull(requireActivity2, "requireActivity()");
                                                FragmentManager supportFragmentManager = requireActivity2.getSupportFragmentManager();
                                                Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "requireActivity().supportFragmentManager");
                                                d2.showWearPerformanceFragment(supportFragmentManager);
                                                UserProfileHitPointV3.f130746c.mo180573b(aVar.mo179230a());
                                            }

                                            @Override // com.ss.android.lark.profile.func.medal.wall.MedalWallAdapter.IMedalDependency
                                            /* renamed from: a */
                                            public void mo179319a(String str, String str2) {
                                                Intrinsics.checkParameterIsNotNull(str, "medalId");
                                                Intrinsics.checkParameterIsNotNull(str2, "grantId");
                                                this.f129856a.mo179333d().withState(new C52396a(this, str, str2));
                                            }
                                        }

                                        /* access modifiers changed from: package-private */
                                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/medal/wall/MedalWallState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
                                        /* renamed from: com.ss.android.lark.profile.func.medal.wall.c$g */
                                        public static final class C52400g extends Lambda implements Function1<MedalWallState, Unit> {
                                            final /* synthetic */ MedalWallFragment this$0;

                                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                            C52400g(MedalWallFragment cVar) {
                                                super(1);
                                                this.this$0 = cVar;
                                            }

                                            /* access modifiers changed from: package-private */
                                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/profile/func/medal/wall/MedalWallState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
                                            /* renamed from: com.ss.android.lark.profile.func.medal.wall.c$g$a */
                                            public static final class C52401a extends Lambda implements Function1<MedalWallState, Unit> {
                                                public static final C52401a INSTANCE = new C52401a();

                                                C52401a() {
                                                    super(1);
                                                }

                                                /* Return type fixed from 'java.lang.Object' to match base method */
                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(MedalWallState nVar) {
                                                    invoke(nVar);
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(MedalWallState nVar) {
                                                    Intrinsics.checkParameterIsNotNull(nVar, "it");
                                                    UserProfileHitPointV3.f130746c.mo180572b(nVar.mo179359e(), nVar.mo179361f(), nVar.mo179362g());
                                                }
                                            }

                                            /* Return type fixed from 'java.lang.Object' to match base method */
                                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(MedalWallState nVar) {
                                                invoke(nVar);
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(MedalWallState nVar) {
                                                Intrinsics.checkParameterIsNotNull(nVar, "$receiver");
                                                Event<Unit> q = nVar.mo179373q();
                                                if (q != null && q.mo86215a() != null) {
                                                    this.this$0.mo179333d().withState(C52401a.INSTANCE);
                                                }
                                            }
                                        }

                                        /* access modifiers changed from: package-private */
                                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/medal/wall/MedalWallState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
                                        /* renamed from: com.ss.android.lark.profile.func.medal.wall.c$d */
                                        public static final class C52397d extends Lambda implements Function1<MedalWallState, Unit> {
                                            final /* synthetic */ MedalWallFragment this$0;

                                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                            C52397d(MedalWallFragment cVar) {
                                                super(1);
                                                this.this$0 = cVar;
                                            }

                                            /* Return type fixed from 'java.lang.Object' to match base method */
                                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(MedalWallState nVar) {
                                                invoke(nVar);
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(MedalWallState nVar) {
                                                boolean z;
                                                Intrinsics.checkParameterIsNotNull(nVar, "$receiver");
                                                List<Medal> d = nVar.mo179358d();
                                                List<Medal> list = d;
                                                if (list == null || list.isEmpty()) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                if (!(!z)) {
                                                    d = null;
                                                }
                                                if (d != null) {
                                                    MedalWallFragment.m203142b(this.this$0).mo179317a(nVar.mo179363h());
                                                    UIUtils.show((CommonRecyclerView) this.this$0.mo179330a(R.id.rv_medals));
                                                    MedalWallFragment.m203142b(this.this$0).diff(d);
                                                }
                                            }
                                        }

                                        /* access modifiers changed from: package-private */
                                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/medal/wall/MedalWallState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
                                        /* renamed from: com.ss.android.lark.profile.func.medal.wall.c$e */
                                        public static final class C52398e extends Lambda implements Function1<MedalWallState, Unit> {
                                            final /* synthetic */ MedalWallFragment this$0;

                                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                            C52398e(MedalWallFragment cVar) {
                                                super(1);
                                                this.this$0 = cVar;
                                            }

                                            /* Return type fixed from 'java.lang.Object' to match base method */
                                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(MedalWallState nVar) {
                                                invoke(nVar);
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(MedalWallState nVar) {
                                                Intrinsics.checkParameterIsNotNull(nVar, "$receiver");
                                                if (nVar.mo179365i()) {
                                                    UIUtils.hide((CommonRecyclerView) this.this$0.mo179330a(R.id.rv_medals));
                                                    this.this$0.mo179331a(true);
                                                    return;
                                                }
                                                this.this$0.mo179331a(false);
                                            }
                                        }

                                        /* access modifiers changed from: package-private */
                                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/medal/wall/MedalWallState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
                                        /* renamed from: com.ss.android.lark.profile.func.medal.wall.c$f */
                                        public static final class C52399f extends Lambda implements Function1<MedalWallState, Unit> {
                                            final /* synthetic */ MedalWallFragment this$0;

                                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                            C52399f(MedalWallFragment cVar) {
                                                super(1);
                                                this.this$0 = cVar;
                                            }

                                            /* Return type fixed from 'java.lang.Object' to match base method */
                                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(MedalWallState nVar) {
                                                invoke(nVar);
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(MedalWallState nVar) {
                                                boolean z;
                                                Intrinsics.checkParameterIsNotNull(nVar, "$receiver");
                                                String a = nVar.mo179372p().mo86215a();
                                                if (a != null) {
                                                    if (a.length() > 0) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    if (!z) {
                                                        a = null;
                                                    }
                                                    if (a != null) {
                                                        FragmentActivity requireActivity = this.this$0.requireActivity();
                                                        Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
                                                        UDToast.show(requireActivity, a);
                                                    }
                                                }
                                            }
                                        }

                                        /* access modifiers changed from: package-private */
                                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/medal/wall/MedalWallState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
                                        /* renamed from: com.ss.android.lark.profile.func.medal.wall.c$i */
                                        public static final class C52407i extends Lambda implements Function1<MedalWallState, Unit> {
                                            final /* synthetic */ MedalWallFragment this$0;

                                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                            C52407i(MedalWallFragment cVar) {
                                                super(1);
                                                this.this$0 = cVar;
                                            }

                                            /* Return type fixed from 'java.lang.Object' to match base method */
                                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(MedalWallState nVar) {
                                                invoke(nVar);
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(MedalWallState nVar) {
                                                boolean z;
                                                Intrinsics.checkParameterIsNotNull(nVar, "$receiver");
                                                String b = nVar.mo179356b();
                                                if (b.length() > 0) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                if (!z) {
                                                    b = null;
                                                }
                                                if (b != null) {
                                                    ImageLoader.with(this.this$0.getContext()).load(AvatarImage.Builder.obtain(b, this.this$0.mo179333d().getUserId(), this.this$0.f129848b, this.this$0.f129848b).build()).into(((DecoratedAvatar) this.this$0.mo179330a(R.id.decorated_avatar)).getAvatarView());
                                                }
                                            }
                                        }

                                        /* access modifiers changed from: package-private */
                                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/medal/wall/MedalWallState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
                                        /* renamed from: com.ss.android.lark.profile.func.medal.wall.c$j */
                                        public static final class C52408j extends Lambda implements Function1<MedalWallState, Unit> {
                                            final /* synthetic */ MedalWallFragment this$0;

                                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                            C52408j(MedalWallFragment cVar) {
                                                super(1);
                                                this.this$0 = cVar;
                                            }

                                            /* Return type fixed from 'java.lang.Object' to match base method */
                                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(MedalWallState nVar) {
                                                invoke(nVar);
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(MedalWallState nVar) {
                                                boolean z;
                                                Intrinsics.checkParameterIsNotNull(nVar, "$receiver");
                                                if (nVar.mo179357c() == null || nVar.mo179368l() || !nVar.mo179369m()) {
                                                    ((DecoratedAvatar) this.this$0.mo179330a(R.id.decorated_avatar)).mo86669a();
                                                    return;
                                                }
                                                ImageSetPassThrough c = nVar.mo179357c();
                                                if (c != null) {
                                                    String str = c.mkey;
                                                    if (str == null || str.length() == 0) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    if (!(!z)) {
                                                        c = null;
                                                    }
                                                    if (c != null) {
                                                        ((DecoratedAvatar) this.this$0.mo179330a(R.id.decorated_avatar)).mo86672a(c.mkey, c.mfs_unit);
                                                    }
                                                }
                                            }
                                        }

                                        /* access modifiers changed from: package-private */
                                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "state", "Lcom/ss/android/lark/profile/func/medal/wall/MedalWallState;", "invoke", "com/ss/android/lark/profile/func/medal/wall/MedalWallFragment$initTitleBar$1$1"}, mo238835k = 3, mv = {1, 1, 16})
                                        /* renamed from: com.ss.android.lark.profile.func.medal.wall.c$k */
                                        public static final class C52409k extends Lambda implements Function1<MedalWallState, Unit> {
                                            final /* synthetic */ Drawable $backIcon$inlined;
                                            final /* synthetic */ CommonTitleBar $this_apply;
                                            final /* synthetic */ MedalWallFragment this$0;

                                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                            C52409k(CommonTitleBar commonTitleBar, MedalWallFragment cVar, Drawable drawable) {
                                                super(1);
                                                this.$this_apply = commonTitleBar;
                                                this.this$0 = cVar;
                                                this.$backIcon$inlined = drawable;
                                            }

                                            /* Return type fixed from 'java.lang.Object' to match base method */
                                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(MedalWallState nVar) {
                                                invoke(nVar);
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(MedalWallState nVar) {
                                                String str;
                                                Intrinsics.checkParameterIsNotNull(nVar, "state");
                                                if (nVar.mo179363h()) {
                                                    str = UIHelper.getString(R.string.Lark_Profile_MyBadges);
                                                } else {
                                                    str = UIHelper.getString(R.string.Lark_Profile_BadgeWallet_PageTitle);
                                                }
                                                this.$this_apply.setTitle(str);
                                                this.$this_apply.setLeftImageDrawable(this.$backIcon$inlined);
                                                this.$this_apply.setLeftClickListener(new View.OnClickListener(this) {
                                                    /* class com.ss.android.lark.profile.func.medal.wall.MedalWallFragment.C52409k.View$OnClickListenerC524101 */

                                                    /* renamed from: a */
                                                    final /* synthetic */ C52409k f129862a;

                                                    {
                                                        this.f129862a = r1;
                                                    }

                                                    public final void onClick(View view) {
                                                        this.f129862a.this$0.mo179333d().withState(new Function1<MedalWallState, Unit>(this) {
                                                            /* class com.ss.android.lark.profile.func.medal.wall.MedalWallFragment.C52409k.View$OnClickListenerC524101.C524111 */
                                                            final /* synthetic */ View$OnClickListenerC524101 this$0;

                                                            {
                                                                this.this$0 = r1;
                                                            }

                                                            /* Return type fixed from 'java.lang.Object' to match base method */
                                                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(MedalWallState nVar) {
                                                                invoke(nVar);
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(MedalWallState nVar) {
                                                                Intrinsics.checkParameterIsNotNull(nVar, "it");
                                                                UserProfileHitPointV3.f130746c.mo180578c(nVar.mo179362g());
                                                                this.this$0.f129862a.this$0.finish();
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        }

                                        /* renamed from: a */
                                        public static final /* synthetic */ View m203141a(MedalWallFragment cVar) {
                                            View view = cVar.f129849c;
                                            if (view == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException("rootView");
                                            }
                                            return view;
                                        }

                                        /* renamed from: b */
                                        public static final /* synthetic */ MedalWallAdapter m203142b(MedalWallFragment cVar) {
                                            MedalWallAdapter medalWallAdapter = cVar.f129850d;
                                            if (medalWallAdapter == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException("medalWallAdapter");
                                            }
                                            return medalWallAdapter;
                                        }

                                        @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
                                        public void onCreate(Bundle bundle) {
                                            super.onCreate(bundle);
                                            mo179333d().start();
                                        }

                                        @Override // androidx.fragment.app.Fragment
                                        public void onViewCreated(View view, Bundle bundle) {
                                            boolean z;
                                            Intrinsics.checkParameterIsNotNull(view, "view");
                                            super.onViewCreated(view, bundle);
                                            StatusBarUtil.f129800a.mo179261a(requireActivity());
                                            if (this.f129847a.length() == 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            if (z) {
                                                finish();
                                            } else {
                                                m203144j();
                                            }
                                        }

                                        @Override // com.larksuite.arch.jack.ISubscriber
                                        /* renamed from: a */
                                        public <S extends State> Disposable mo86220a(JackViewModel<S> lVar, SubscriptionConfig<S> vVar, Function1<? super S, Unit> function1) {
                                            Intrinsics.checkParameterIsNotNull(lVar, "$this$subscribe");
                                            Intrinsics.checkParameterIsNotNull(vVar, "config");
                                            Intrinsics.checkParameterIsNotNull(function1, "subscriber");
                                            return JackView.C24027a.m87829a(this, lVar, vVar, function1);
                                        }

                                        @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
                                        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
                                            Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
                                            View inflate = layoutInflater.inflate(R.layout.fragment_medal_wall, viewGroup, false);
                                            Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…l_wall, container, false)");
                                            this.f129849c = inflate;
                                            if (inflate == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException("rootView");
                                            }
                                            return inflate;
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
                                    }
