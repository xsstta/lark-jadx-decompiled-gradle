package com.ss.android.lark.moments.impl.common.widget.keyboard.identity;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.lark.pb.moments.v1.AnonymityPolicy;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.impl.common.utils.C47282k;
import com.ss.android.lark.moments.impl.common.widget.BorderOvalImageView;
import com.ss.android.lark.moments.impl.rustadapter.setting.UserGlobalConfigAndSettingsManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 ;2\u00020\u0001:\u0001;B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\rH\u0002J\b\u0010\"\u001a\u00020\rH\u0016J\u0006\u0010#\u001a\u00020 J\u0018\u0010$\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020 H\u0016J\u0010\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020\nH\u0016J\u0018\u0010+\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010,\u001a\u00020 H\u0016J\u0006\u0010-\u001a\u00020 J\u0010\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u00020\u0018H\u0016J\u000e\u00100\u001a\u00020 2\u0006\u00101\u001a\u00020\nJ\u0006\u00102\u001a\u00020 J\u0010\u00103\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\rH\u0002J\u001e\u00104\u001a\u00020 2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u000206J\u0006\u00109\u001a\u00020 J\u0010\u0010:\u001a\u00020 2\u0006\u0010!\u001a\u00020\rH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\rXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/widget/keyboard/identity/MomentsIdentitySelectedPlugin;", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportAdditionPlugin;", "dependency", "Lcom/ss/android/lark/moments/impl/common/widget/keyboard/identity/IMomentsIdentityDependency;", "(Lcom/ss/android/lark/moments/impl/common/widget/keyboard/identity/IMomentsIdentityDependency;)V", "activity", "Landroid/content/Context;", "arrowView", "Landroid/widget/ImageView;", "categoryEnableAnonymous", "", "forceDisable", "mLayoutId", "", "mRotateValueAnimator", "Landroid/animation/ValueAnimator;", "getMRotateValueAnimator", "()Landroid/animation/ValueAnimator;", "setMRotateValueAnimator", "(Landroid/animation/ValueAnimator;)V", "mRotationValue", "onPanelChangeListener", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportAdditionPlugin$OnPanelChangeListener;", "pluginContext", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportAdditionPlugin$IAdditionSupportContext;", "rootView", "Landroid/view/View;", "scope", "Lcom/bytedance/lark/pb/moments/v1/AnonymityPolicy$Scope;", "selectorStatus", "visibility", "doArrowRotateAnim", "", "state", "getLayoutId", "hide", "onCreateView", "Landroid/app/Activity;", "parent", "Landroid/view/ViewGroup;", "onDestroy", "onEnableChanged", "enable", "onInitView", "onStop", "refreshIdentityVisible", "setAdditionSupportContext", "context", "setCategoryEnableAnonymous", "enableAnonymous", "setForceDisableAnonymous", "setVisibility", "showAnonymousIdentity", "name", "", "avatarKey", "entityId", "showRealIdentity", "updateArrow", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.b.d */
public final class MomentsIdentitySelectedPlugin implements IInputSupportAdditionPlugin {

    /* renamed from: e */
    public static final Companion f119340e = new Companion(null);

    /* renamed from: a */
    public final int f119341a = 180;

    /* renamed from: b */
    public ImageView f119342b;

    /* renamed from: c */
    public int f119343c = 1;

    /* renamed from: d */
    public final IMomentsIdentityDependency f119344d;

    /* renamed from: f */
    private IInputSupportAdditionPlugin.IAdditionSupportContext f119345f;

    /* renamed from: g */
    private ValueAnimator f119346g;

    /* renamed from: h */
    private Context f119347h;

    /* renamed from: i */
    private View f119348i;

    /* renamed from: j */
    private final int f119349j = R.layout.moments_anonymity_identity;

    /* renamed from: k */
    private int f119350k = 8;

    /* renamed from: l */
    private boolean f119351l;

    /* renamed from: m */
    private AnonymityPolicy.Scope f119352m;

    /* renamed from: n */
    private boolean f119353n;

    /* renamed from: o */
    private final IInputSupportAdditionPlugin.OnPanelChangeListener f119354o = new C47318d(this);

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin
    /* renamed from: b */
    public void mo102080b() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/widget/keyboard/identity/MomentsIdentitySelectedPlugin$Companion;", "", "()V", "ROTATE_DURATION", "", "TAG", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.b.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin
    /* renamed from: a */
    public int mo102073a() {
        return this.f119349j;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin
    /* renamed from: c */
    public void mo102082c() {
        this.f119346g = null;
    }

    /* renamed from: f */
    public final void mo166317f() {
        this.f119353n = true;
        m187405c(8);
    }

    /* renamed from: g */
    public final void mo166318g() {
        m187405c(8);
        this.f119343c = 1;
    }

    /* renamed from: d */
    public final void mo166315d() {
        AnonymityPolicy b = UserGlobalConfigAndSettingsManager.f120180a.mo167299b();
        if (b == null) {
            m187405c(8);
        } else if (this.f119353n) {
            m187405c(8);
        } else {
            boolean areEqual = Intrinsics.areEqual((Object) b.enabled, (Object) true);
            AnonymityPolicy.AnonymousType anonymousType = b.type;
            this.f119352m = b.scope;
            if (!areEqual || (!(anonymousType == AnonymityPolicy.AnonymousType.NICKNAME || anonymousType == AnonymityPolicy.AnonymousType.ANONYMOUS) || (this.f119352m != AnonymityPolicy.Scope.GLOBAL && (this.f119352m != AnonymityPolicy.Scope.CATEGORY || !this.f119351l)))) {
                m187405c(8);
            } else {
                m187405c(0);
            }
        }
    }

    /* renamed from: e */
    public final void mo166316e() {
        View view = this.f119348i;
        if (view != null) {
            TextView textView = (TextView) view.findViewById(R.id.name);
            Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.name");
            textView.setText(MomentsDependencyHolder.f118998b.mo165899a().accountDependency().mo144689b());
            int dp2px = UIUtils.dp2px(view.getContext(), 24.0f);
            IRequestCreator load = ImageLoader.with(view.getContext()).load(AvatarImage.Builder.obtain(MomentsDependencyHolder.f118998b.mo165899a().accountDependency().mo144690c(), MomentsDependencyHolder.f118998b.mo165899a().accountDependency().mo144688a(), dp2px, dp2px).build());
            Intrinsics.checkExpressionValueIsNotNull(load, "ImageLoader.with(rootVie…       .load(avatarImage)");
            C47282k.m187256a(load, ListenerParams.FromType.AVATAR, dp2px, dp2px, false, null, 24, null).placeholder(R.drawable.common_chat_window_image_item_holder).override(dp2px, dp2px).into((BorderOvalImageView) view.findViewById(R.id.avatar));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/moments/impl/common/widget/keyboard/identity/MomentsIdentitySelectedPlugin$onPanelChangeListener$1", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportAdditionPlugin$OnPanelChangeListener;", "onNewStateChanged", "", "newState", "", "onPanelSlide", "onPanelStateChanged", "state", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.b.d$d */
    public static final class C47318d implements IInputSupportAdditionPlugin.OnPanelChangeListener {

        /* renamed from: a */
        final /* synthetic */ MomentsIdentitySelectedPlugin f119358a;

        @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin.OnPanelChangeListener
        /* renamed from: a */
        public void mo102083a() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47318d(MomentsIdentitySelectedPlugin dVar) {
            this.f119358a = dVar;
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin.OnPanelChangeListener
        /* renamed from: a */
        public void mo102084a(int i) {
            this.f119358a.mo166312a(i);
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin.OnPanelChangeListener
        /* renamed from: b */
        public void mo102085b(int i) {
            this.f119358a.mo166312a(i);
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin
    /* renamed from: a */
    public void mo102078a(IInputSupportAdditionPlugin.IAdditionSupportContext aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "context");
        this.f119345f = aVar;
    }

    /* renamed from: c */
    private final void m187405c(int i) {
        this.f119350k = i;
        View view = this.f119348i;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    public final void mo166312a(int i) {
        if (this.f119342b != null) {
            m187404b(i);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.b.d$c */
    public static final class View$OnClickListenerC47317c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsIdentitySelectedPlugin f119357a;

        View$OnClickListenerC47317c(MomentsIdentitySelectedPlugin dVar) {
            this.f119357a = dVar;
        }

        public final void onClick(View view) {
            int i;
            MomentsIdentitySelectedPlugin dVar = this.f119357a;
            boolean z = false;
            if (dVar.f119343c == 1) {
                i = 0;
            } else {
                i = 1;
            }
            dVar.f119343c = i;
            IMomentsIdentityDependency aVar = this.f119357a.f119344d;
            if (this.f119357a.f119343c == 0) {
                z = true;
            }
            aVar.mo166296a(z);
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin
    /* renamed from: a */
    public void mo102079a(boolean z) {
        View view = this.f119348i;
        if (view != null) {
            view.setEnabled(z);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.b.d$b */
    public static final class C47316b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ MomentsIdentitySelectedPlugin f119355a;

        /* renamed from: b */
        final /* synthetic */ int f119356b;

        C47316b(MomentsIdentitySelectedPlugin dVar, int i) {
            this.f119355a = dVar;
            this.f119356b = i;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ImageView imageView;
            Intrinsics.checkParameterIsNotNull(valueAnimator, "animation");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            int i = this.f119356b;
            if (i == 0) {
                ImageView imageView2 = this.f119355a.f119342b;
                if (imageView2 != null) {
                    imageView2.setRotation(((float) this.f119355a.f119341a) * animatedFraction);
                }
            } else if (i == 1 && (imageView = this.f119355a.f119342b) != null) {
                imageView.setRotation(((float) this.f119355a.f119341a) * (((float) 1) - animatedFraction));
            }
        }
    }

    public MomentsIdentitySelectedPlugin(IMomentsIdentityDependency aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        this.f119344d = aVar;
    }

    /* renamed from: b */
    public final void mo166314b(boolean z) {
        this.f119351l = z;
        if (this.f119353n) {
            m187405c(8);
        } else if (this.f119352m == AnonymityPolicy.Scope.GLOBAL || (this.f119352m == AnonymityPolicy.Scope.CATEGORY && z)) {
            m187405c(0);
        } else {
            m187405c(8);
        }
    }

    /* renamed from: b */
    private final void m187404b(int i) {
        ImageView imageView = this.f119342b;
        if (imageView == null || imageView.getRotation() != ((float) this.f119341a) || i != 0) {
            ImageView imageView2 = this.f119342b;
            if (imageView2 == null || imageView2.getRotation() != BitmapDescriptorFactory.HUE_RED || i != 1) {
                ValueAnimator duration = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration((long) 100);
                this.f119346g = duration;
                if (duration != null) {
                    duration.addUpdateListener(new C47316b(this, i));
                }
                ValueAnimator valueAnimator = this.f119346g;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
            }
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin
    /* renamed from: a */
    public View mo102075a(Activity activity, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(activity).inflate(this.f119349j, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "contentView");
        return mo102074a(activity, inflate);
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin
    /* renamed from: a */
    public View mo102074a(Activity activity, View view) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Activity activity2 = activity;
        this.f119347h = activity2;
        this.f119348i = view;
        view.setVisibility(this.f119350k);
        this.f119342b = (ImageView) view.findViewById(R.id.indicator);
        ((ImageView) view.findViewById(R.id.indicator)).setImageDrawable(UDIconUtils.getIconDrawable(activity2, (int) R.drawable.ud_icon_expand_down_filled, UIUtils.getColor(activity2, R.color.icon_n3)));
        view.setOnClickListener(new View$OnClickListenerC47317c(this));
        mo166315d();
        mo166316e();
        IInputSupportAdditionPlugin.IAdditionSupportContext aVar = this.f119345f;
        if (aVar != null) {
            aVar.mo146898a(this.f119354o);
        }
        IInputSupportAdditionPlugin.IAdditionSupportContext aVar2 = this.f119345f;
        if (aVar2 != null) {
            aVar2.mo146897a();
        }
        return view;
    }

    /* renamed from: a */
    public final void mo166313a(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(str2, "avatarKey");
        Intrinsics.checkParameterIsNotNull(str3, "entityId");
        View view = this.f119348i;
        if (view != null) {
            TextView textView = (TextView) view.findViewById(R.id.name);
            Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.name");
            textView.setText(str);
            int dp2px = UIUtils.dp2px(view.getContext(), 24.0f);
            IRequestCreator override = ImageLoader.with(view.getContext()).load(AvatarImage.Builder.obtain(str2, str3, dp2px, dp2px).build()).placeholder(R.drawable.common_chat_window_image_item_holder).override(dp2px, dp2px);
            Intrinsics.checkExpressionValueIsNotNull(override, "ImageLoader.with(rootVie…e(avatarSize, avatarSize)");
            C47282k.m187256a(override, ListenerParams.FromType.AVATAR, dp2px, dp2px, false, null, 24, null).into((BorderOvalImageView) view.findViewById(R.id.avatar));
        }
    }
}
