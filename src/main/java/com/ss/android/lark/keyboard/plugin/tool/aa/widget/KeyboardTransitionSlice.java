package com.ss.android.lark.keyboard.plugin.tool.aa.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.transition.C1562y;
import androidx.transition.Transition;
import androidx.transition.Visibility;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p3466b.C69029a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\u00020\u0001:\u0002 !B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002JB\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J2\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\nH\u0016J2\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/aa/widget/KeyboardTransitionSlice;", "Landroidx/transition/Visibility;", "animationMode", "", "(I)V", "interpolator", "Landroid/view/animation/DecelerateInterpolator;", "captureEndValues", "", "transitionValues", "Landroidx/transition/TransitionValues;", "captureStartValues", "captureValues", "createAnimation", "Landroid/animation/Animator;", "view", "Landroid/view/View;", "values", "viewPos", "", "startY", "", "endY", "Landroid/animation/TimeInterpolator;", "transition", "Landroidx/transition/Transition;", "onAppear", "sceneRoot", "Landroid/view/ViewGroup;", "startValues", "endValues", "onDisappear", "Companion", "TransitionPositionListener", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.b.c */
public final class KeyboardTransitionSlice extends Visibility {

    /* renamed from: a */
    public static final Companion f103726a = new Companion(null);

    /* renamed from: i */
    private final DecelerateInterpolator f103727i;

    /* renamed from: j */
    private final int f103728j;

    public KeyboardTransitionSlice() {
        this(0, 1, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/aa/widget/KeyboardTransitionSlice$Companion;", "", "()V", "MODE_IN", "", "MODE_OUT", "SCREEN_POSITION", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.b.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/aa/widget/KeyboardTransitionSlice$TransitionPositionListener;", "Landroid/animation/AnimatorListenerAdapter;", "Landroidx/transition/Transition$TransitionListener;", "movingView", "Landroid/view/View;", "viewInHierarchy", "startY", "", "terminalY", "", "(Landroid/view/View;Landroid/view/View;IF)V", "pausedY", "transitionPosition", "", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationPause", "animator", "onAnimationResume", "onTransitionCancel", "transition", "Landroidx/transition/Transition;", "onTransitionEnd", "onTransitionPause", "onTransitionResume", "onTransitionStart", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.b.c$b */
    public static final class TransitionPositionListener extends AnimatorListenerAdapter implements Transition.AbstractC1505d {

        /* renamed from: a */
        private final int f103729a;

        /* renamed from: b */
        private int[] f103730b;

        /* renamed from: c */
        private float f103731c;

        /* renamed from: d */
        private final View f103732d;

        /* renamed from: e */
        private final View f103733e;

        /* renamed from: f */
        private final float f103734f;

        @Override // androidx.transition.Transition.AbstractC1505d
        /* renamed from: a */
        public void mo7815a(Transition transition) {
            Intrinsics.checkParameterIsNotNull(transition, "transition");
        }

        @Override // androidx.transition.Transition.AbstractC1505d
        /* renamed from: c */
        public void mo7817c(Transition transition) {
            Intrinsics.checkParameterIsNotNull(transition, "transition");
        }

        @Override // androidx.transition.Transition.AbstractC1505d
        /* renamed from: d */
        public void mo7818d(Transition transition) {
            Intrinsics.checkParameterIsNotNull(transition, "transition");
        }

        @Override // androidx.transition.Transition.AbstractC1505d
        /* renamed from: e */
        public void mo7931e(Transition transition) {
            Intrinsics.checkParameterIsNotNull(transition, "transition");
        }

        public void onAnimationResume(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animator");
            this.f103732d.setTranslationY(this.f103731c);
        }

        @Override // androidx.transition.Transition.AbstractC1505d
        /* renamed from: b */
        public void mo7816b(Transition transition) {
            Intrinsics.checkParameterIsNotNull(transition, "transition");
            this.f103732d.setTranslationY(this.f103734f);
            transition.mo7898b(this);
        }

        public void onAnimationPause(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animator");
            this.f103731c = this.f103732d.getTranslationY();
            this.f103732d.setTranslationY(this.f103734f);
        }

        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            if (this.f103730b == null) {
                this.f103730b = new int[2];
            }
            int[] iArr = this.f103730b;
            if (iArr == null) {
                Intrinsics.throwNpe();
            }
            iArr[1] = C69029a.m265653a(((float) this.f103729a) + this.f103732d.getTranslationY());
            this.f103733e.setTag(R.id.transition_position, this.f103730b);
        }

        public TransitionPositionListener(View view, View view2, int i, float f) {
            Intrinsics.checkParameterIsNotNull(view, "movingView");
            Intrinsics.checkParameterIsNotNull(view2, "viewInHierarchy");
            this.f103732d = view;
            this.f103733e = view2;
            this.f103734f = f;
            this.f103729a = i - C69029a.m265653a(view.getTranslationY());
            int[] iArr = (int[]) view2.getTag(R.id.transition_position);
            this.f103730b = iArr;
            if (iArr != null) {
                view2.setTag(R.id.transition_position, null);
            }
        }
    }

    @Override // androidx.transition.Transition, androidx.transition.Visibility
    /* renamed from: a */
    public void mo7807a(C1562y yVar) {
        Intrinsics.checkParameterIsNotNull(yVar, "transitionValues");
        super.mo7807a(yVar);
        m161514d(yVar);
    }

    @Override // androidx.transition.Transition, androidx.transition.Visibility
    /* renamed from: b */
    public void mo7810b(C1562y yVar) {
        Intrinsics.checkParameterIsNotNull(yVar, "transitionValues");
        super.mo7810b(yVar);
        m161514d(yVar);
    }

    public KeyboardTransitionSlice(int i) {
        this.f103728j = i;
        this.f103727i = new DecelerateInterpolator();
        mo7878a(300L);
    }

    /* renamed from: d */
    private final void m161514d(C1562y yVar) {
        int[] iArr = new int[2];
        yVar.f5459b.getLocationOnScreen(iArr);
        Map<String, Object> map = yVar.f5458a;
        Intrinsics.checkExpressionValueIsNotNull(map, "transitionValues.values");
        map.put("keyboard_slide_screenPosition", iArr);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KeyboardTransitionSlice(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i);
    }

    @Override // androidx.transition.Visibility
    /* renamed from: b */
    public Animator mo7870b(ViewGroup viewGroup, View view, C1562y yVar, C1562y yVar2) {
        float f;
        if (viewGroup == null || view == null || yVar2 == null) {
            return null;
        }
        view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        float translationY = view.getTranslationY();
        if (this.f103728j == 1) {
            f = translationY - ((float) viewGroup.getHeight());
        } else {
            f = ((float) viewGroup.getHeight()) + translationY;
        }
        int[] iArr = (int[]) yVar2.f5458a.get("keyboard_slide_screenPosition");
        if (iArr == null) {
            iArr = new int[2];
        }
        return m161513a(view, yVar2, iArr, translationY, f, this.f103727i, this);
    }

    @Override // androidx.transition.Visibility
    /* renamed from: a */
    public Animator mo7869a(ViewGroup viewGroup, View view, C1562y yVar, C1562y yVar2) {
        float f;
        if (viewGroup == null || view == null || yVar2 == null) {
            return null;
        }
        view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        float translationY = view.getTranslationY();
        if (this.f103728j == 1) {
            f = ((float) viewGroup.getHeight()) + translationY;
        } else {
            f = translationY - ((float) viewGroup.getHeight());
        }
        int[] iArr = (int[]) yVar2.f5458a.get("keyboard_slide_screenPosition");
        if (iArr == null) {
            iArr = new int[2];
        }
        return m161513a(view, yVar2, iArr, f, translationY, this.f103727i, this);
    }

    /* renamed from: a */
    private final Animator m161513a(View view, C1562y yVar, int[] iArr, float f, float f2, TimeInterpolator timeInterpolator, Transition transition) {
        float translationY = view.getTranslationY();
        int i = iArr[1];
        int[] iArr2 = (int[]) yVar.f5459b.getTag(R.id.transition_position);
        if (iArr2 != null) {
            f = ((float) (iArr2[1] - i)) + translationY;
        }
        int a = i + C69029a.m265653a(f - translationY);
        view.setTranslationY(f);
        if (f == f2) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f, f2));
        Intrinsics.checkExpressionValueIsNotNull(ofPropertyValuesHolder, "ObjectAnimator.ofPropert…, startY, endY)\n        )");
        View view2 = yVar.f5459b;
        Intrinsics.checkExpressionValueIsNotNull(view2, "values.view");
        TransitionPositionListener bVar = new TransitionPositionListener(view, view2, a, translationY);
        transition.mo7880a(bVar);
        ofPropertyValuesHolder.addListener(bVar);
        ofPropertyValuesHolder.addPauseListener(bVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
