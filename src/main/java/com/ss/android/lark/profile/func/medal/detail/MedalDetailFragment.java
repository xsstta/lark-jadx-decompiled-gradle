package com.ss.android.lark.profile.func.medal.detail;

import android.graphics.Outline;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ak;
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
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.PassThroughImage;
import com.ss.android.lark.pb.entities.ImageSetPassThrough;
import com.ss.android.lark.profile.func.medal.utils.StatusBarUtil;
import com.ss.android.lark.profile.func.v3.userprofile.p2537d.C52743a;
import com.ss.android.lark.profile.statistics.UserProfileHitPointV3;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\r\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/ss/android/lark/profile/func/medal/detail/MedalDetailFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "Lcom/larksuite/arch/jack/JackView;", "()V", "roundRadius", "", "viewModel", "Lcom/ss/android/lark/profile/func/medal/detail/MedalDetailViewModel;", "getViewModel", "()Lcom/ss/android/lark/profile/func/medal/detail/MedalDetailViewModel;", "viewModel$delegate", "Lcom/larksuite/arch/jack/LifecycleAwareLazy;", "viewModelFactory", "com/ss/android/lark/profile/func/medal/detail/MedalDetailFragment$viewModelFactory$2$1", "getViewModelFactory", "()Lcom/ss/android/lark/profile/func/medal/detail/MedalDetailFragment$viewModelFactory$2$1;", "viewModelFactory$delegate", "Lkotlin/Lazy;", "initSubscribe", "", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.medal.detail.a */
public final class MedalDetailFragment extends BaseFragment implements JackView {

    /* renamed from: b */
    public static final Companion f129801b = new Companion(null);

    /* renamed from: a */
    public final float f129802a = ((float) C52743a.m204272a(16));

    /* renamed from: c */
    private final Lazy f129803c = LazyKt.lazy(new C52371l(this));

    /* renamed from: d */
    private final LifecycleAwareLazy f129804d;

    /* renamed from: e */
    private HashMap f129805e;

    /* renamed from: a */
    public View mo179271a(int i) {
        if (this.f129805e == null) {
            this.f129805e = new HashMap();
        }
        View view = (View) this.f129805e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f129805e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public final C52371l.C523721 mo179272c() {
        return (C52371l.C523721) this.f129803c.getValue();
    }

    /* renamed from: d */
    public final MedalDetailViewModel mo179273d() {
        return (MedalDetailViewModel) this.f129804d.getValue();
    }

    /* renamed from: e */
    public void mo179274e() {
        HashMap hashMap = this.f129805e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo179274e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/profile/func/medal/detail/MedalDetailFragment$Companion;", "", "()V", "KEY_GRANT_ID", "", "KEY_MEDAL_ID", "KEY_USER_ID", "TAG", "TYPE_SOURCE", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.detail.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/lark/profile/func/medal/detail/MedalDetailFragment$viewModelFactory$2$1", "invoke", "()Lcom/ss/android/lark/profile/func/medal/detail/MedalDetailFragment$viewModelFactory$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.detail.a$k */
    static final class C52370k extends Lambda implements Function0<C52371l.C523721> {
        final /* synthetic */ MedalDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52370k(MedalDetailFragment aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C52371l.C523721 invoke() {
            return this.this$0.mo179272c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/lark/profile/func/medal/detail/MedalDetailFragment$viewModelFactory$2$1", "invoke", "()Lcom/ss/android/lark/profile/func/medal/detail/MedalDetailFragment$viewModelFactory$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.detail.a$l */
    static final class C52371l extends Lambda implements Function0<C523721> {
        final /* synthetic */ MedalDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52371l(MedalDetailFragment aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C523721 invoke() {
            return new C1144ai.AbstractC1146b(this) {
                /* class com.ss.android.lark.profile.func.medal.detail.MedalDetailFragment.C52371l.C523721 */

                /* renamed from: a */
                final /* synthetic */ C52371l f129808a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f129808a = r1;
                }

                @Override // androidx.lifecycle.C1144ai.AbstractC1146b
                public <T extends AbstractC1142af> T create(Class<T> cls) {
                    Intrinsics.checkParameterIsNotNull(cls, "modelClass");
                    if (this.f129808a.this$0.getArguments() == null) {
                        return new MedalDetailViewModel(null, null, null, 0, 15, null);
                    }
                    String string = this.f129808a.this$0.requireArguments().getString("user_id", "");
                    int i = this.f129808a.this$0.requireArguments().getInt("type_source", MedalDetailSource.SOURCE_MEDAL_WALL.getValue());
                    String string2 = this.f129808a.this$0.requireArguments().getString("medal_id", "");
                    String string3 = this.f129808a.this$0.requireArguments().getString("grant_id", "");
                    Intrinsics.checkExpressionValueIsNotNull(string, "userId");
                    Intrinsics.checkExpressionValueIsNotNull(string2, "medalId");
                    Intrinsics.checkExpressionValueIsNotNull(string3, "grantId");
                    return new MedalDetailViewModel(string, string2, string3, i);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.detail.a$j */
    static final class C52369j extends Lambda implements Function0<ak> {
        final /* synthetic */ MedalDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52369j(MedalDetailFragment aVar) {
            super(0);
            this.this$0 = aVar;
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

    /* renamed from: f */
    private final void m203097f() {
        ((CommonTitleBar) mo179271a(R.id.title_bar)).setLeftClickListener(new View$OnClickListenerC52367h(this));
        RelativeLayout relativeLayout = (RelativeLayout) mo179271a(R.id.cl_meal_detail);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "cl_meal_detail");
        relativeLayout.setOutlineProvider(new C52368i(this));
        RelativeLayout relativeLayout2 = (RelativeLayout) mo179271a(R.id.cl_meal_detail);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "cl_meal_detail");
        relativeLayout2.setClipToOutline(true);
    }

    public MedalDetailFragment() {
        C52369j jVar = new C52369j(this);
        C52370k kVar = new C52370k(this);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MedalDetailViewModel.class);
        this.f129804d = new LifecycleAwareLazy(orCreateKotlinClass, new MedalDetailFragment$$special$$inlined$viewModel$1(orCreateKotlinClass), jVar, kVar, MedalDetailFragment$$special$$inlined$viewModel$2.INSTANCE);
    }

    /* renamed from: g */
    private final void m203098g() {
        ISubscriber.C24024a.m87810a(this, mo179273d(), C52373b.INSTANCE, (SubscriptionConfig) null, new C52363d(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo179273d(), C52376e.INSTANCE, (SubscriptionConfig) null, new C52364e(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo179273d(), C52377f.INSTANCE, (SubscriptionConfig) null, new C52365f(this), 2, (Object) null);
        ISubscriber.C24024a.m87814a(this, mo179273d(), C52378g.INSTANCE, C52379h.INSTANCE, (SubscriptionConfig) null, new C52366g(this), 4, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo179273d(), C52374c.INSTANCE, (SubscriptionConfig) null, new C52360b(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo179273d(), C52375d.INSTANCE, (SubscriptionConfig) null, new C52361c(this), 2, (Object) null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/medal/detail/MedalDetailState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.detail.a$c */
    public static final class C52361c extends Lambda implements Function1<MedalDetailState, Unit> {
        final /* synthetic */ MedalDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52361c(MedalDetailFragment aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/profile/func/medal/detail/MedalDetailState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.medal.detail.a$c$a */
        public static final class C52362a extends Lambda implements Function1<MedalDetailState, Unit> {
            public static final C52362a INSTANCE = new C52362a();

            C52362a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MedalDetailState iVar) {
                invoke(iVar);
                return Unit.INSTANCE;
            }

            public final void invoke(MedalDetailState iVar) {
                Intrinsics.checkParameterIsNotNull(iVar, "it");
                UserProfileHitPointV3.f130746c.mo180568a(!iVar.mo179292g(), iVar.mo179293h());
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MedalDetailState iVar) {
            invoke(iVar);
            return Unit.INSTANCE;
        }

        public final void invoke(MedalDetailState iVar) {
            Intrinsics.checkParameterIsNotNull(iVar, "$receiver");
            Event<Unit> i = iVar.mo179295i();
            if (i != null && i.mo86215a() != null) {
                this.this$0.mo179273d().withState(C52362a.INSTANCE);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/medal/detail/MedalDetailState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.detail.a$b */
    public static final class C52360b extends Lambda implements Function1<MedalDetailState, Unit> {
        final /* synthetic */ MedalDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52360b(MedalDetailFragment aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MedalDetailState iVar) {
            invoke(iVar);
            return Unit.INSTANCE;
        }

        public final void invoke(MedalDetailState iVar) {
            Intrinsics.checkParameterIsNotNull(iVar, "$receiver");
            UIUtils.display((FrameLayout) this.this$0.mo179271a(R.id.fl_invalid_container), iVar.mo179292g());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/medal/detail/MedalDetailState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.detail.a$d */
    public static final class C52363d extends Lambda implements Function1<MedalDetailState, Unit> {
        final /* synthetic */ MedalDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52363d(MedalDetailFragment aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MedalDetailState iVar) {
            invoke(iVar);
            return Unit.INSTANCE;
        }

        public final void invoke(MedalDetailState iVar) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(iVar, "$receiver");
            ImageSetPassThrough b = iVar.mo179286b();
            if (b != null) {
                String str = b.mkey;
                if (str == null || str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(!z)) {
                    b = null;
                }
                if (b != null) {
                    ImageLoader.with(this.this$0.getContext()).load(new PassThroughImage(b.mkey, b.mfs_unit)).into((ImageView) this.this$0.mo179271a(R.id.iv_medal_detail));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/medal/detail/MedalDetailState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.detail.a$e */
    public static final class C52364e extends Lambda implements Function1<MedalDetailState, Unit> {
        final /* synthetic */ MedalDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52364e(MedalDetailFragment aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MedalDetailState iVar) {
            invoke(iVar);
            return Unit.INSTANCE;
        }

        public final void invoke(MedalDetailState iVar) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(iVar, "$receiver");
            String c = iVar.mo179287c();
            if (c.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                c = null;
            }
            if (c != null) {
                TextView textView = (TextView) this.this$0.mo179271a(R.id.tv_medal_name);
                Intrinsics.checkExpressionValueIsNotNull(textView, "tv_medal_name");
                textView.setText(iVar.mo179287c());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/medal/detail/MedalDetailState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.detail.a$f */
    public static final class C52365f extends Lambda implements Function1<MedalDetailState, Unit> {
        final /* synthetic */ MedalDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52365f(MedalDetailFragment aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MedalDetailState iVar) {
            invoke(iVar);
            return Unit.INSTANCE;
        }

        public final void invoke(MedalDetailState iVar) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(iVar, "$receiver");
            String d = iVar.mo179288d();
            if (d.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                d = null;
            }
            if (d != null) {
                TextView textView = (TextView) this.this$0.mo179271a(R.id.tv_medal_detail);
                Intrinsics.checkExpressionValueIsNotNull(textView, "tv_medal_detail");
                textView.setText(iVar.mo179288d());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/medal/detail/MedalDetailState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.detail.a$g */
    public static final class C52366g extends Lambda implements Function1<MedalDetailState, Unit> {
        final /* synthetic */ MedalDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52366g(MedalDetailFragment aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MedalDetailState iVar) {
            invoke(iVar);
            return Unit.INSTANCE;
        }

        public final void invoke(MedalDetailState iVar) {
            Date date;
            String str;
            String format;
            Long f;
            Intrinsics.checkParameterIsNotNull(iVar, "$receiver");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd");
            Long e = iVar.mo179289e();
            Date date2 = null;
            if (e != null) {
                date = new Date(e.longValue() * ((long) 1000));
            } else {
                date = null;
            }
            String str2 = "";
            if (date == null || (str = simpleDateFormat.format(date)) == null) {
                str = str2;
            }
            if (iVar.mo179291f() == null || (f = iVar.mo179291f()) == null || f.longValue() != -1) {
                Long f2 = iVar.mo179291f();
                if (f2 != null) {
                    date2 = new Date(f2.longValue() * ((long) 1000));
                }
                if (!(date2 == null || (format = simpleDateFormat.format(date2)) == null)) {
                    str2 = format;
                }
            } else {
                str2 = UIHelper.getString(R.string.Lark_Profile_BadgeNeverExpires);
            }
            TextView textView = (TextView) this.this$0.mo179271a(R.id.tv_duration);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tv_duration");
            textView.setText(UIHelper.getString(R.string.Lark_Profile_ValidFor) + str + " - " + str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/profile/func/medal/detail/MedalDetailFragment$initView$2", "Landroid/view/ViewOutlineProvider;", "getOutline", "", "view", "Landroid/view/View;", "outline", "Landroid/graphics/Outline;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.detail.a$i */
    public static final class C52368i extends ViewOutlineProvider {

        /* renamed from: a */
        final /* synthetic */ MedalDetailFragment f129807a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52368i(MedalDetailFragment aVar) {
            this.f129807a = aVar;
        }

        public void getOutline(View view, Outline outline) {
            boolean z;
            Outline outline2;
            if (outline != null) {
                if (view != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    outline2 = outline;
                } else {
                    outline2 = null;
                }
                if (outline2 != null) {
                    if (view == null) {
                        Intrinsics.throwNpe();
                    }
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f129807a.f129802a);
                }
            }
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo179273d().loadMedalDetail();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.detail.a$h */
    public static final class View$OnClickListenerC52367h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MedalDetailFragment f129806a;

        View$OnClickListenerC52367h(MedalDetailFragment aVar) {
            this.f129806a = aVar;
        }

        public final void onClick(View view) {
            UserProfileHitPointV3.f130746c.mo180587f(this.f129806a.mo179273d().getMedalId());
            this.f129806a.finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        StatusBarUtil.f129800a.mo179261a(requireActivity());
        m203097f();
        m203098g();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_medal_detail, viewGroup, false);
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
