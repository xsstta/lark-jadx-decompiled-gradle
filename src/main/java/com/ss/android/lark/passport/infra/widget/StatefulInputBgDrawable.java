package com.ss.android.lark.passport.infra.widget;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Application;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.utils.C26284k;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.util.p2442d.C49186a;
import com.ss.android.lark.passport.infra.widget.StatefulInput;
import com.ss.android.lark.utils.LarkContext;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.TypeCastException;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\rJ\u0010\u0010\u0012\u001a\u00020\t2\b\b\u0001\u0010\u0013\u001a\u00020\rJ\u001a\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\r2\b\b\u0001\u0010\u0013\u001a\u00020\rH\u0002J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J\u000e\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0006R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/passport/infra/widget/StatefulInputBgDrawable;", "Landroid/graphics/drawable/GradientDrawable;", "Lcom/ss/android/lark/passport/infra/widget/StatefulInput;", "context", "Landroid/content/Context;", "initState", "Lcom/ss/android/lark/passport/infra/widget/StatefulInput$InputState;", "(Landroid/content/Context;Lcom/ss/android/lark/passport/infra/widget/StatefulInput$InputState;)V", "animator", "Landroid/animation/ValueAnimator;", "currentState", "stateColorMap", "", "", "registerState", "", "state", "colorInt", "setStrokeColorWithAnimation", "targetColor", "setStrokeWithAnimation", "width", "toState", "toStateWithAnimation", "Companion", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.widget.d */
public final class StatefulInputBgDrawable extends GradientDrawable implements StatefulInput {

    /* renamed from: a */
    public static final Companion f123655a = new Companion(null);

    /* renamed from: f */
    private static final int f123656f = R.color.udtoken_component_outlined_bg;

    /* renamed from: g */
    private static final Map<StatefulInput.InputState, Integer> f123657g;

    /* renamed from: b */
    private StatefulInput.InputState f123658b;

    /* renamed from: c */
    private ValueAnimator f123659c;

    /* renamed from: d */
    private final Map<StatefulInput.InputState, Integer> f123660d;

    /* renamed from: e */
    private final Context f123661e;

    public StatefulInputBgDrawable(Context context) {
        this(context, null, 2, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/passport/infra/widget/StatefulInputBgDrawable$Companion;", "", "()V", "ANIMATION_DURATION", "", "BORDER_AROUND", "", "SHAPE_RADIUS", "bgColorRes", "", "defaultStateColorResMap", "", "Lcom/ss/android/lark/passport/infra/widget/StatefulInput$InputState;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.widget.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public void mo171824a() {
        StatefulInput.C49251a.m194104a(this);
    }

    /* renamed from: b */
    public void mo171827b() {
        StatefulInput.C49251a.m194105b(this);
    }

    static {
        StatefulInput.InputState[] a = StatefulInput.InputState.f123627d.mo171809a();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(a.length), 16));
        for (StatefulInput.InputState bVar : a) {
            linkedHashMap.put(bVar, Integer.valueOf(bVar.mo171808a()));
        }
        f123657g = linkedHashMap;
    }

    @Override // com.ss.android.lark.passport.infra.widget.StatefulInput
    /* renamed from: a */
    public void mo171807a(StatefulInput.InputState bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "state");
        mo171826b(bVar);
    }

    /* renamed from: a */
    public final ValueAnimator mo171823a(int i) {
        return m194138a(C49154ag.m193828a((Context) LarkContext.getApplication(), 1.0f), i);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.widget.d$b */
    public static final class C49265b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ StatefulInputBgDrawable f123662a;

        /* renamed from: b */
        final /* synthetic */ int f123663b;

        C49265b(StatefulInputBgDrawable dVar, int i) {
            this.f123662a = dVar;
            this.f123663b = i;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            StatefulInputBgDrawable dVar = this.f123662a;
            int i = this.f123663b;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                dVar.setStroke(i, ((Integer) animatedValue).intValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: b */
    public final ValueAnimator mo171826b(StatefulInput.InputState bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "state");
        Map<StatefulInput.InputState, Integer> map = this.f123660d;
        Integer num = map.get(bVar);
        if (num == null) {
            num = Integer.valueOf(UDColorUtils.getColor(this.f123661e, bVar.mo171808a()));
            map.put(bVar, num);
        }
        ValueAnimator a = m194138a(C49154ag.m193828a((Context) LarkContext.getApplication(), 1.0f), num.intValue());
        this.f123658b = bVar;
        return a;
    }

    /* renamed from: a */
    public final void mo171825a(StatefulInput.InputState bVar, int i) {
        Intrinsics.checkParameterIsNotNull(bVar, "state");
        this.f123660d.put(bVar, Integer.valueOf(i));
    }

    public StatefulInputBgDrawable(Context context, StatefulInput.InputState bVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bVar, "initState");
        this.f123661e = context;
        this.f123658b = bVar;
        Map<StatefulInput.InputState, Integer> map = f123657g;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        for (T t : map.entrySet()) {
            linkedHashMap.put(t.getKey(), Integer.valueOf(UDColorUtils.getColor(this.f123661e, ((Number) t.getValue()).intValue())));
        }
        Map<StatefulInput.InputState, Integer> mutableMap = MapsKt.toMutableMap(linkedHashMap);
        this.f123660d = mutableMap;
        Context context2 = this.f123661e;
        if ((context2 instanceof Application) && C26284k.m95186b(context2)) {
            UDToast.show(this.f123661e, "InputBgUtils.setStrokeColor(), don't use application context");
        }
        Integer num = mutableMap.get(bVar);
        if (num == null) {
            num = Integer.valueOf(UDColorUtils.getColor(this.f123661e, bVar.mo171808a()));
            mutableMap.put(bVar, num);
        }
        setStroke(C49154ag.m193828a(this.f123661e, 1.0f), num.intValue());
        setColor(UDColorUtils.getColor(this.f123661e, f123656f));
        setCornerRadius((float) C49154ag.m193828a(this.f123661e, 6.0f));
    }

    /* renamed from: a */
    private final ValueAnimator m194138a(int i, int i2) {
        Object obj;
        Map<StatefulInput.InputState, Integer> map = this.f123660d;
        StatefulInput.InputState bVar = this.f123658b;
        Integer num = map.get(bVar);
        if (num == null) {
            num = Integer.valueOf(UDColorUtils.getColor(this.f123661e, this.f123658b.mo171808a()));
            map.put(bVar, num);
        }
        int intValue = num.intValue();
        ValueAnimator valueAnimator = this.f123659c;
        if (valueAnimator != null) {
            try {
                Result.Companion aVar = Result.Companion;
                StatefulInputBgDrawable dVar = this;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    obj = Result.m271569constructorimpl(Integer.valueOf(((Integer) animatedValue).intValue()));
                    if (Result.m271572exceptionOrNullimpl(obj) != null) {
                        obj = Integer.valueOf(intValue);
                    }
                    intValue = ((Number) obj).intValue();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                }
            } catch (Throwable th) {
                Result.Companion aVar2 = Result.Companion;
                obj = Result.m271569constructorimpl(C69097g.m265890a(th));
            }
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(intValue, i2);
        Intrinsics.checkExpressionValueIsNotNull(ofInt, "valueAnimator");
        ofInt.setDuration(300L);
        ofInt.setInterpolator(C49186a.m193930a());
        ofInt.setEvaluator(new ArgbEvaluator());
        ofInt.addUpdateListener(new C49265b(this, i));
        ofInt.start();
        this.f123659c = ofInt;
        return ofInt;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StatefulInputBgDrawable(Context context, StatefulInput.InputState bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? StatefulInput.InputState.f123624a : bVar);
    }
}
