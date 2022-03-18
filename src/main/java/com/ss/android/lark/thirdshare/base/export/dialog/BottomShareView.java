package com.ss.android.lark.thirdshare.base.export.dialog;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.thirdshare.base.export.OnShareCallback;
import com.ss.android.lark.thirdshare.base.export.ShareEntity;
import com.ss.android.lark.thirdshare.base.export.p2741c.C55718b;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001,B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0011H\u0003J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\u0012\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010\u001e\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010\u001f\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010 \u001a\u00020\u00172\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010!\u001a\u00020\u0017H\u0014J\b\u0010\"\u001a\u00020\u0017H\u0014J\u001a\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010'\u001a\u00020\u0017H\u0002J\u0010\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*H\u0002J\u0006\u0010+\u001a\u00020\u0017R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/ss/android/lark/thirdshare/base/export/dialog/BottomShareView;", "Landroid/widget/FrameLayout;", "Lcom/ss/android/lark/thirdshare/base/export/dialog/IShareDialog;", "Landroid/animation/Animator$AnimatorListener;", "container", "Landroid/view/ViewGroup;", "shareEntity", "Lcom/ss/android/lark/thirdshare/base/export/ShareEntity;", "(Landroid/view/ViewGroup;Lcom/ss/android/lark/thirdshare/base/export/ShareEntity;)V", "animationRunning", "", "animationType", "", "animator", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "bottomShareView", "Landroid/view/View;", "isClickItem", "()Z", "setClickItem", "(Z)V", "dismiss", "", "getBottomShareView", "handleDismiss", "onAnimationCancel", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "onAnimationUpdate", "onAttachedToWindow", "onDetachedFromWindow", "onKeyDown", "keyCode", "event", "Landroid/view/KeyEvent;", "playEnterAnimation", "processTranslation", "value", "", "show", "Companion", "components_third-share_base_export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.thirdshare.base.export.b.a */
public final class BottomShareView extends FrameLayout implements Animator.AnimatorListener, IShareDialog {

    /* renamed from: b */
    public static final Companion f137390b = new Companion(null);

    /* renamed from: a */
    public final ValueAnimator f137391a;

    /* renamed from: c */
    private int f137392c;

    /* renamed from: d */
    private boolean f137393d;

    /* renamed from: e */
    private boolean f137394e;

    /* renamed from: f */
    private final View f137395f;

    /* renamed from: g */
    private final ViewGroup f137396g;

    /* renamed from: h */
    private final ShareEntity f137397h;

    @JvmStatic
    /* renamed from: a */
    public static final void m215758a(ViewGroup viewGroup, ShareEntity shareEntity) {
        f137390b.mo189834a(viewGroup, shareEntity);
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/thirdshare/base/export/dialog/BottomShareView$Companion;", "", "()V", "TYPE_ENTER", "", "TYPE_EXIT", "show", "", "container", "Landroid/view/ViewGroup;", "shareEntity", "Lcom/ss/android/lark/thirdshare/base/export/ShareEntity;", "components_third-share_base_export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.thirdshare.base.export.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo189834a(ViewGroup viewGroup, ShareEntity shareEntity) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "container");
            new BottomShareView(viewGroup, shareEntity, null).mo189823c();
        }
    }

    /* renamed from: a */
    public boolean mo189821a() {
        return this.f137394e;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.thirdshare.base.export.b.a$d */
    static final class RunnableC55705d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BottomShareView f137400a;

        RunnableC55705d(BottomShareView aVar) {
            this.f137400a = aVar;
        }

        public final void run() {
            this.f137400a.mo189822b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.thirdshare.base.export.b.a$e */
    public static final class RunnableC55706e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BottomShareView f137401a;

        RunnableC55706e(BottomShareView aVar) {
            this.f137401a = aVar;
        }

        public final void run() {
            this.f137401a.f137391a.start();
        }
    }

    /* renamed from: c */
    public final void mo189823c() {
        this.f137396g.addView(this);
        bringToFront();
    }

    @Override // com.ss.android.lark.thirdshare.base.export.dialog.IShareDialog
    /* renamed from: d */
    public void mo189824d() {
        if (!this.f137393d) {
            this.f137392c = 1;
            this.f137393d = true;
            this.f137391a.start();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(new RunnableC55705d(this));
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f137391a.cancel();
    }

    /* renamed from: e */
    private final void m215759e() {
        OnShareCallback callback;
        ShareEntity shareEntity = this.f137397h;
        if (!(shareEntity == null || (callback = shareEntity.getCallback()) == null)) {
            callback.onDismiss(mo189821a());
        }
        View rootView = getRootView();
        if (rootView != null) {
            ((ViewGroup) rootView).removeView(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: b */
    public final void mo189822b() {
        if (!this.f137393d) {
            this.f137392c = 0;
            this.f137393d = true;
            if (true ^ Intrinsics.areEqual(this.f137395f.getParent(), this)) {
                addView(this.f137395f);
                this.f137395f.setTranslationY((float) getHeight());
            }
            post(new RunnableC55706e(this));
        }
    }

    private final View getBottomShareView() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.ts_share_dialog, (ViewGroup) null, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        inflate.setLayoutParams(layoutParams);
        List<C55712e> a = C55712e.m215771a(this.f137397h, this);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.tsShareRv);
        ((TextView) inflate.findViewById(R.id.tsShareCancelTv)).setOnClickListener(new View$OnClickListenerC55704c(this));
        C55718b bVar = new C55718b();
        bVar.mo189862a(a);
        recyclerView.setAdapter(bVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        Intrinsics.checkExpressionValueIsNotNull(inflate, "shareContent");
        return inflate;
    }

    @Override // com.ss.android.lark.thirdshare.base.export.dialog.IShareDialog
    public void setClickItem(boolean z) {
        this.f137394e = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Landroid/animation/ValueAnimator;", "Lkotlin/ParameterName;", "name", "animator", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.thirdshare.base.export.b.a$b */
    static final /* synthetic */ class C55703b extends FunctionReference implements Function1<ValueAnimator, Unit> {
        C55703b(BottomShareView aVar) {
            super(1, aVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "onAnimationUpdate";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(BottomShareView.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "onAnimationUpdate(Landroid/animation/ValueAnimator;)V";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ValueAnimator valueAnimator) {
            invoke(valueAnimator);
            return Unit.INSTANCE;
        }

        public final void invoke(ValueAnimator valueAnimator) {
            ((BottomShareView) this.receiver).mo189820a(valueAnimator);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.thirdshare.base.export.b.a$c */
    public static final class View$OnClickListenerC55704c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BottomShareView f137399a;

        View$OnClickListenerC55704c(BottomShareView aVar) {
            this.f137399a = aVar;
        }

        public final void onClick(View view) {
            this.f137399a.mo189824d();
        }
    }

    public void onAnimationCancel(Animator animator) {
        if (this.f137392c == 1) {
            m215759e();
        }
    }

    /* renamed from: a */
    private final void m215757a(float f) {
        this.f137395f.setTranslationY((f / 1000.0f) * ((float) this.f137395f.getHeight()));
    }

    public void onAnimationEnd(Animator animator) {
        this.f137393d = false;
        m215757a((float) (this.f137392c * 1000));
        if (this.f137392c == 1) {
            m215759e();
        }
    }

    /* renamed from: a */
    public final void mo189820a(ValueAnimator valueAnimator) {
        Object obj;
        if (valueAnimator != null) {
            obj = valueAnimator.getAnimatedValue();
        } else {
            obj = null;
        }
        if (obj != null) {
            float floatValue = ((Float) obj).floatValue();
            int i = this.f137392c;
            if (i == 0) {
                m215757a(((float) 1000) - floatValue);
            } else if (i == 1) {
                m215757a(floatValue);
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        mo189824d();
        return super.onKeyDown(i, keyEvent);
    }

    private BottomShareView(ViewGroup viewGroup, ShareEntity shareEntity) {
        super(viewGroup.getContext());
        this.f137396g = viewGroup;
        this.f137397h = shareEntity;
        this.f137395f = getBottomShareView();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1000.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new C55707b(new C55703b(this)));
        ofFloat.addListener(this);
        this.f137391a = ofFloat;
        setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.lark.thirdshare.base.export.dialog.BottomShareView.View$OnClickListenerC557021 */

            /* renamed from: a */
            final /* synthetic */ BottomShareView f137398a;

            {
                this.f137398a = r1;
            }

            public final void onClick(View view) {
                this.f137398a.mo189824d();
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(8, 8, 8, 8);
        setLayoutParams(layoutParams);
        setBackgroundColor(Color.argb(55, 0, 0, 0));
    }

    public /* synthetic */ BottomShareView(ViewGroup viewGroup, ShareEntity shareEntity, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, shareEntity);
    }
}
