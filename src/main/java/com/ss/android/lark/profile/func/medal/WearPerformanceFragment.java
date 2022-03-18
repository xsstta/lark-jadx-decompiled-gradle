package com.ss.android.lark.profile.func.medal;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.arch.jack.Async;
import com.larksuite.arch.jack.Disposable;
import com.larksuite.arch.jack.ISubscriber;
import com.larksuite.arch.jack.JackView;
import com.larksuite.arch.jack.JackViewModel;
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
import com.larksuite.component.universe_design.shadow.UDShadowLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.pb.entities.ImageSetPassThrough;
import com.ss.android.lark.profile.func.medal.wall.MedalWallState;
import com.ss.android.lark.profile.func.medal.wall.MedalWallViewModel;
import com.ss.android.lark.profile.func.v3.userprofile.p2537d.C52743a;
import com.ss.android.lark.profile.statistics.UserProfileHitPointV3;
import com.ss.android.lark.utils.UIHelper;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u001cH\u0002J\b\u0010\u001f\u001a\u00020\u001cH\u0002J\b\u0010 \u001a\u00020\u001cH\u0002J&\u0010!\u001a\u0004\u0018\u00010\t2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u001a\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010*\u001a\u00020\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u0018\u0010\u0019¨\u0006,"}, d2 = {"Lcom/ss/android/lark/profile/func/medal/WearPerformanceFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "Lcom/larksuite/arch/jack/JackView;", "()V", "avatarSize", "", "levelOneHeight", "levelThirdHeight", "rootView", "Landroid/view/View;", "sunshineAnimator", "Landroid/animation/ObjectAnimator;", "getSunshineAnimator", "()Landroid/animation/ObjectAnimator;", "sunshineAnimator$delegate", "Lkotlin/Lazy;", "sunshineHeight", "userAvatarView", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "getUserAvatarView", "()Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "userAvatarView$delegate", "viewModel", "Lcom/ss/android/lark/profile/func/medal/wall/MedalWallViewModel;", "getViewModel", "()Lcom/ss/android/lark/profile/func/medal/wall/MedalWallViewModel;", "viewModel$delegate", "initAvatarView", "", "initListener", "initSubscribe", "initSunshine", "initView", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "sendMedalWearViewPoint", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.medal.b */
public final class WearPerformanceFragment extends BaseFragment implements JackView {

    /* renamed from: e */
    public static final Companion f129786e = new Companion(null);

    /* renamed from: a */
    public View f129787a;

    /* renamed from: b */
    public final int f129788b = C52743a.m204272a(108);

    /* renamed from: c */
    public final int f129789c = C52743a.m204272a(773);

    /* renamed from: d */
    public final int f129790d = C52743a.m204272a(780);

    /* renamed from: f */
    private final int f129791f = C52743a.m204272a(977);

    /* renamed from: g */
    private final Lazy f129792g;

    /* renamed from: h */
    private final Lazy f129793h;

    /* renamed from: i */
    private final Lazy f129794i;

    /* renamed from: j */
    private HashMap f129795j;

    /* renamed from: f */
    private final LKUIRoundedImageView2 m203065f() {
        return (LKUIRoundedImageView2) this.f129794i.getValue();
    }

    /* renamed from: a */
    public View mo179247a(int i) {
        if (this.f129795j == null) {
            this.f129795j = new HashMap();
        }
        View view = (View) this.f129795j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f129795j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public final MedalWallViewModel mo179248c() {
        return (MedalWallViewModel) this.f129792g.getValue();
    }

    /* renamed from: d */
    public final ObjectAnimator mo179249d() {
        return (ObjectAnimator) this.f129793h.getValue();
    }

    /* renamed from: e */
    public void mo179250e() {
        HashMap hashMap = this.f129795j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo179250e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/profile/func/medal/WearPerformanceFragment$Companion;", "", "()V", "KEY_MEDAL_IMAGE_KEY", "", "TAG", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
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

    /* renamed from: g */
    private final void m203066g() {
        m203069j();
        m203070k();
        m203071l();
        m203067h();
    }

    /* renamed from: h */
    private final void m203067h() {
        mo179248c().withState(C52353h.INSTANCE);
    }

    /* renamed from: k */
    private final void m203070k() {
        ((DecoratedAvatar) mo179247a(R.id.decorate_avatar_performance)).mo86670a(m203065f());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/animation/ObjectAnimator;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.b$i */
    static final class C52354i extends Lambda implements Function0<ObjectAnimator> {
        final /* synthetic */ WearPerformanceFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52354i(WearPerformanceFragment bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ObjectAnimator invoke() {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((SunshineImageView) this.this$0.mo179247a(R.id.iv_sunshine), "rotation", BitmapDescriptorFactory.HUE_RED, 360.0f);
            ofFloat.setDuration(8000L);
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new LinearInterpolator());
            return ofFloat;
        }
    }

    /* renamed from: i */
    private final void m203068i() {
        ((TextView) mo179247a(R.id.tv_cancel)).setOnClickListener(new View$OnClickListenerC52344b(this));
        ((TextView) mo179247a(R.id.tv_wear)).setOnClickListener(new View$OnClickListenerC52346c(this));
    }

    /* renamed from: j */
    private final void m203069j() {
        ViewTreeObserver$OnGlobalLayoutListenerC52352g gVar = new ViewTreeObserver$OnGlobalLayoutListenerC52352g(this);
        UDShadowLayout uDShadowLayout = (UDShadowLayout) mo179247a(R.id.shadow_layout);
        Intrinsics.checkExpressionValueIsNotNull(uDShadowLayout, "shadow_layout");
        uDShadowLayout.getViewTreeObserver().addOnGlobalLayoutListener(gVar);
        mo179249d().start();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.b$j */
    static final class C52355j extends Lambda implements Function0<LKUIRoundedImageView2> {
        final /* synthetic */ WearPerformanceFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52355j(WearPerformanceFragment bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LKUIRoundedImageView2 invoke() {
            FragmentActivity requireActivity = this.this$0.requireActivity();
            Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
            LKUIRoundedImageView2 lKUIRoundedImageView2 = new LKUIRoundedImageView2(requireActivity, null, 0, 6, null);
            lKUIRoundedImageView2.setLayoutParams(new FrameLayout.LayoutParams(this.this$0.f129788b, this.this$0.f129788b));
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

    public WearPerformanceFragment() {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MedalWallViewModel.class);
        this.f129792g = LazyKt.lazy(new WearPerformanceFragment$$special$$inlined$activityViewModel$1(this, orCreateKotlinClass, orCreateKotlinClass));
        this.f129793h = LazyKt.lazy(new C52354i(this));
        this.f129794i = LazyKt.lazy(new C52355j(this));
    }

    /* renamed from: l */
    private final void m203071l() {
        ISubscriber.C24024a.m87810a(this, mo179248c(), C52358c.INSTANCE, (SubscriptionConfig) null, new C52348d(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo179248c(), C52359d.INSTANCE, (SubscriptionConfig) null, new C52349e(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo179248c(), C52386e.INSTANCE, (SubscriptionConfig) null, new C52351f(this), 2, (Object) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/profile/func/medal/WearPerformanceFragment$initSunshine$shadowLayoutListener$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.b$g */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC52352g implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ WearPerformanceFragment f129798a;

        public void onGlobalLayout() {
            UDShadowLayout uDShadowLayout = (UDShadowLayout) this.f129798a.mo179247a(R.id.shadow_layout);
            Intrinsics.checkExpressionValueIsNotNull(uDShadowLayout, "shadow_layout");
            uDShadowLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ImageView imageView = (ImageView) this.f129798a.mo179247a(R.id.iv_level_one);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "iv_level_one");
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = null;
            if (!(layoutParams instanceof ConstraintLayout.LayoutParams)) {
                layoutParams = null;
            }
            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams;
            if (layoutParams3 != null) {
                UDShadowLayout uDShadowLayout2 = (UDShadowLayout) this.f129798a.mo179247a(R.id.shadow_layout);
                Intrinsics.checkExpressionValueIsNotNull(uDShadowLayout2, "shadow_layout");
                int bottom = uDShadowLayout2.getBottom();
                int i = this.f129798a.f129790d;
                UDShadowLayout uDShadowLayout3 = (UDShadowLayout) this.f129798a.mo179247a(R.id.shadow_layout);
                Intrinsics.checkExpressionValueIsNotNull(uDShadowLayout3, "shadow_layout");
                layoutParams3.bottomMargin = bottom - ((i - uDShadowLayout3.getHeight()) / 2);
            }
            ImageView imageView2 = (ImageView) this.f129798a.mo179247a(R.id.iv_level_third);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "iv_level_third");
            ViewGroup.LayoutParams layoutParams4 = imageView2.getLayoutParams();
            if (layoutParams4 instanceof ConstraintLayout.LayoutParams) {
                layoutParams2 = layoutParams4;
            }
            ConstraintLayout.LayoutParams layoutParams5 = layoutParams2;
            if (layoutParams5 != null) {
                UDShadowLayout uDShadowLayout4 = (UDShadowLayout) this.f129798a.mo179247a(R.id.shadow_layout);
                Intrinsics.checkExpressionValueIsNotNull(uDShadowLayout4, "shadow_layout");
                int bottom2 = uDShadowLayout4.getBottom();
                int i2 = this.f129798a.f129789c;
                UDShadowLayout uDShadowLayout5 = (UDShadowLayout) this.f129798a.mo179247a(R.id.shadow_layout);
                Intrinsics.checkExpressionValueIsNotNull(uDShadowLayout5, "shadow_layout");
                layoutParams5.bottomMargin = bottom2 - ((i2 - uDShadowLayout5.getHeight()) / 2);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC52352g(WearPerformanceFragment bVar) {
            this.f129798a = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/medal/wall/MedalWallState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.b$d */
    public static final class C52348d extends Lambda implements Function1<MedalWallState, Unit> {
        final /* synthetic */ WearPerformanceFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52348d(WearPerformanceFragment bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MedalWallState nVar) {
            invoke(nVar);
            return Unit.INSTANCE;
        }

        public final void invoke(MedalWallState nVar) {
            ImageSetPassThrough b;
            boolean z;
            Intrinsics.checkParameterIsNotNull(nVar, "$receiver");
            Medal o = nVar.mo179371o();
            if (o != null && (b = o.mo179231b()) != null) {
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
                    ((DecoratedAvatar) this.this$0.mo179247a(R.id.decorate_avatar_performance)).mo86672a(b.mkey, b.mfs_unit);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/medal/wall/MedalWallState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.b$e */
    public static final class C52349e extends Lambda implements Function1<MedalWallState, Unit> {
        final /* synthetic */ WearPerformanceFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52349e(WearPerformanceFragment bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MedalWallState nVar) {
            invoke(nVar);
            return Unit.INSTANCE;
        }

        public final void invoke(final MedalWallState nVar) {
            Intrinsics.checkParameterIsNotNull(nVar, "$receiver");
            this.this$0.mo179248c().withState(new Function1<MedalWallState, Unit>(this) {
                /* class com.ss.android.lark.profile.func.medal.WearPerformanceFragment.C52349e.C523501 */
                final /* synthetic */ C52349e this$0;

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
                    boolean z;
                    Intrinsics.checkParameterIsNotNull(nVar, "it");
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
                        ImageLoader.with(this.this$0.this$0.getContext()).load(AvatarImage.Builder.obtain(b, nVar.mo179367k(), this.this$0.this$0.f129788b, this.this$0.this$0.f129788b).build()).into(((DecoratedAvatar) this.this$0.this$0.mo179247a(R.id.decorate_avatar_performance)).getAvatarView());
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/medal/wall/MedalWallState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.b$f */
    public static final class C52351f extends Lambda implements Function1<MedalWallState, Unit> {
        final /* synthetic */ WearPerformanceFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52351f(WearPerformanceFragment bVar) {
            super(1);
            this.this$0 = bVar;
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
            Drawable n = nVar.mo179370n();
            if (n != null) {
                WearPerformanceFragment.m203064a(this.this$0).setBackground(n);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/profile/func/medal/wall/MedalWallState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.b$h */
    public static final class C52353h extends Lambda implements Function1<MedalWallState, Unit> {
        public static final C52353h INSTANCE = new C52353h();

        C52353h() {
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
            String str;
            Intrinsics.checkParameterIsNotNull(nVar, "it");
            UserProfileHitPointV3.Companion aVar = UserProfileHitPointV3.f130746c;
            Medal o = nVar.mo179371o();
            if (o == null || (str = o.mo179230a()) == null) {
                str = "";
            }
            aVar.mo180584e(str);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ View m203064a(WearPerformanceFragment bVar) {
        View view = bVar.f129787a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.b$b */
    public static final class View$OnClickListenerC52344b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WearPerformanceFragment f129796a;

        View$OnClickListenerC52344b(WearPerformanceFragment bVar) {
            this.f129796a = bVar;
        }

        public final void onClick(View view) {
            this.f129796a.mo179249d().end();
            this.f129796a.mo179248c().withState(C523451.INSTANCE);
            MedalWallViewModel c = this.f129796a.mo179248c();
            FragmentActivity requireActivity = this.f129796a.requireActivity();
            Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
            FragmentManager supportFragmentManager = requireActivity.getSupportFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "requireActivity().supportFragmentManager");
            c.removeWearFragment(supportFragmentManager);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.b$c */
    public static final class View$OnClickListenerC52346c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WearPerformanceFragment f129797a;

        View$OnClickListenerC52346c(WearPerformanceFragment bVar) {
            this.f129797a = bVar;
        }

        public final void onClick(View view) {
            this.f129797a.mo179249d().end();
            this.f129797a.mo179248c().wearMedal();
            this.f129797a.mo179248c().withState(C523471.INSTANCE);
            MedalWallViewModel c = this.f129797a.mo179248c();
            FragmentActivity requireActivity = this.f129797a.requireActivity();
            Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
            FragmentManager supportFragmentManager = requireActivity.getSupportFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "requireActivity().supportFragmentManager");
            c.removeWearFragment(supportFragmentManager);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m203066g();
        m203068i();
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
        View inflate = layoutInflater.inflate(R.layout.fragment_wear_medal_performance, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…rmance, container, false)");
        this.f129787a = inflate;
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
