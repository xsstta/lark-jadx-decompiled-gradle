package com.bytedance.ee.bear.facade.common.widget.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.util.p718t.C13747j;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27128g;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1237d.C27144b;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002FGB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000b0\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0000H\u0016J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u000fH\u0016J\u0018\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000fH\u0016J \u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\rH\u0016J \u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\rH\u0016J(\u00100\u001a\u00020!2\u0006\u00101\u001a\u00020)2\u0006\u00102\u001a\u00020\r2\u0006\u00103\u001a\u00020\r2\u0006\u0010/\u001a\u00020\rH\u0016J \u00104\u001a\u00020!2\u0006\u0010$\u001a\u00020%2\u0006\u00105\u001a\u00020\r2\u0006\u0010/\u001a\u00020\rH\u0016J(\u00106\u001a\u00020!2\u0006\u00101\u001a\u00020)2\u0006\u00102\u001a\u00020\r2\u0006\u00103\u001a\u00020\r2\u0006\u0010/\u001a\u00020\rH\u0016J \u00107\u001a\u00020!2\u0006\u0010$\u001a\u00020%2\u0006\u00103\u001a\u00020\r2\u0006\u0010/\u001a\u00020\rH\u0016J \u00108\u001a\u00020!2\u0006\u00109\u001a\u00020%2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;H\u0016J\u0012\u0010=\u001a\u00020!2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010>\u001a\u00020!2\u0006\u0010?\u001a\u00020@H\u0016J\u0016\u0010A\u001a\u00020!2\f\b\u0001\u0010B\u001a\u00020C\"\u00020\rH\u0017J\u0010\u0010D\u001a\u00020!2\u0006\u0010E\u001a\u00020\rH\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\rXD¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lcom/bytedance/ee/bear/facade/common/widget/recyclerview/DigitDanceHeader;", "Landroid/widget/FrameLayout;", "Lcom/bytedance/ee/bear/facade/common/widget/recyclerview/AssociatedHeader;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "associatedHeader", "digitalText", "Landroid/widget/TextView;", "endNumber", "", "inited", "", "mChoreographer", "Lcom/bytedance/ee/bear/facade/common/widget/recyclerview/DigitDanceHeader$Choreographer;", "getMChoreographer", "()Lcom/bytedance/ee/bear/facade/common/widget/recyclerview/DigitDanceHeader$Choreographer;", "mChoreographer$delegate", "Lkotlin/Lazy;", "mFinishDuration", "mRefreshKernel", "Lcom/scwang/smartrefresh/layout/api/RefreshKernel;", "startNumber", "createLayout", "Lkotlin/Pair;", "Landroid/view/ViewGroup;", "getSpinnerStyle", "Lcom/scwang/smartrefresh/layout/constant/SpinnerStyle;", "getView", "initView", "", "isSupportHorizontalDrag", "onFinish", "layout", "Lcom/scwang/smartrefresh/layout/api/RefreshLayout;", "success", "onHorizontalDrag", "percentX", "", "offsetX", "offsetMax", "onInitialized", "kernel", "height", "extendHeight", "onPullingDown", "percent", "offset", "headHeight", "onRefreshReleased", "headerHeight", "onReleasing", "onStartAnimator", "onStateChanged", "refreshLayout", "oldState", "Lcom/scwang/smartrefresh/layout/constant/RefreshState;", "newState", "setAssociatedHeader", "setCustomText", "text", "", "setPrimaryColors", "colors", "", "setStartNumber", "number", "Choreographer", "Dancer", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DigitDanceHeader extends FrameLayout implements AbstractC7741a {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f20933a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DigitDanceHeader.class), "mChoreographer", "getMChoreographer()Lcom/bytedance/ee/bear/facade/common/widget/recyclerview/DigitDanceHeader$Choreographer;"))};

    /* renamed from: b */
    private final int f20934b = ParticipantRepo.f117150c;

    /* renamed from: c */
    private TextView f20935c;

    /* renamed from: d */
    private AbstractC27128g f20936d;

    /* renamed from: e */
    private final Lazy f20937e = LazyKt.lazy(new C7736b(this));

    /* renamed from: f */
    private int f20938f;

    /* renamed from: g */
    private int f20939g;

    /* renamed from: h */
    private boolean f20940h;

    /* renamed from: i */
    private AbstractC7741a f20941i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001:\u00013B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020\u0000J\u0006\u0010+\u001a\u00020)J\u0006\u0010,\u001a\u00020)J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0015\u001a\u00020\u00002\b\b\u0001\u0010.\u001a\u00020\u000bJ\u0010\u0010/\u001a\u00020)2\b\b\u0001\u00100\u001a\u00020!J\u0010\u00101\u001a\u00020\u00002\b\b\u0001\u0010.\u001a\u00020\u000bJ\u0010\u00102\u001a\u00020)2\b\b\u0001\u0010.\u001a\u00020\u000bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00064"}, d2 = {"Lcom/bytedance/ee/bear/facade/common/widget/recyclerview/DigitDanceHeader$Dancer;", "", "factory", "Landroid/view/ViewGroup;", "step", "Lcom/bytedance/ee/bear/facade/common/widget/BearLottieView;", "stepIcon", "Landroid/widget/ImageView;", "(Landroid/view/ViewGroup;Lcom/bytedance/ee/bear/facade/common/widget/BearLottieView;Landroid/widget/ImageView;)V", "animationTable", "Landroid/util/SparseArray;", "", "getAnimationTable", "()Landroid/util/SparseArray;", "setAnimationTable", "(Landroid/util/SparseArray;)V", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Lcom/bytedance/ee/bear/facade/common/widget/recyclerview/DigitDanceHeader$Dancer$Type;", "endDigit", "getEndDigit", "()I", "setEndDigit", "(I)V", "item", "Landroid/view/View;", "getItem", "()Landroid/view/View;", "setItem", "(Landroid/view/View;)V", "processTable", "", "startDigit", "startProgress", "", "getStartProgress", "()F", "getStep", "()Lcom/bytedance/ee/bear/facade/common/widget/BearLottieView;", "getStepIcon", "()Landroid/widget/ImageView;", "cancelAnimation", "", "init", "pauseAnimation", "resumeAnimation", "setDirection", "digit", "setProgress", "progress", "setStartDigit", "stepToDigit", "Type", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class Dancer {

        /* renamed from: a */
        private View f20942a;

        /* renamed from: b */
        private Type f20943b = Type.DOWNWARD;

        /* renamed from: c */
        private int f20944c;

        /* renamed from: d */
        private int f20945d;

        /* renamed from: e */
        private SparseArray<float[]> f20946e = new C7735b();

        /* renamed from: f */
        private SparseArray<Integer> f20947f = new C7734a();

        /* renamed from: g */
        private final BearLottieView f20948g;

        /* renamed from: h */
        private final ImageView f20949h;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/facade/common/widget/recyclerview/DigitDanceHeader$Dancer$Type;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "setValue", "(I)V", "DOWNWARD", "UPWARD", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
        public enum Type {
            DOWNWARD(1),
            UPWARD(2);
            
            private int value;

            public final int getValue() {
                return this.value;
            }

            public final void setValue(int i) {
                this.value = i;
            }

            private Type(int i) {
                this.value = i;
            }
        }

        /* renamed from: a */
        public final View mo30313a() {
            return this.f20942a;
        }

        /* renamed from: b */
        public final int mo30317b() {
            return this.f20945d;
        }

        /* renamed from: h */
        public final BearLottieView mo30325h() {
            return this.f20948g;
        }

        /* renamed from: e */
        public final void mo30322e() {
            this.f20948g.pauseAnimation();
        }

        /* renamed from: f */
        public final void mo30323f() {
            this.f20948g.resumeAnimation();
        }

        /* renamed from: g */
        public final void mo30324g() {
            this.f20948g.cancelAnimation();
        }

        /* renamed from: c */
        public final float mo30319c() {
            return this.f20946e.get(this.f20943b.getValue())[this.f20944c];
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/bytedance/ee/bear/facade/common/widget/recyclerview/DigitDanceHeader$Dancer$animationTable$1", "Landroid/util/SparseArray;", "", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.facade.common.widget.recyclerview.DigitDanceHeader$Dancer$a */
        public static final class C7734a extends SparseArray<Integer> {
            C7734a() {
                put(Type.DOWNWARD.getValue(), Integer.valueOf((int) R.raw.facade_digit_dance_up));
                put(Type.UPWARD.getValue(), Integer.valueOf((int) R.raw.facade_digit_dance_down));
            }
        }

        /* renamed from: d */
        public final Dancer mo30321d() {
            BearLottieView bearLottieView = this.f20948g;
            Integer num = this.f20947f.get(this.f20943b.getValue());
            Intrinsics.checkExpressionValueIsNotNull(num, "animationTable[direction.value]");
            bearLottieView.setAnimation(num.intValue());
            mo30318b(this.f20944c);
            return this;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/bytedance/ee/bear/facade/common/widget/recyclerview/DigitDanceHeader$Dancer$processTable$1", "Landroid/util/SparseArray;", "", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.facade.common.widget.recyclerview.DigitDanceHeader$Dancer$b */
        public static final class C7735b extends SparseArray<float[]> {
            C7735b() {
                put(Type.DOWNWARD.getValue(), new float[]{BitmapDescriptorFactory.HUE_RED, 0.09907074f, 0.19644612f, 0.29474813f, 0.39013934f, 0.48821008f, 0.58949625f, 0.69346195f, 0.79742765f, 0.8981779f});
                put(Type.UPWARD.getValue(), new float[]{BitmapDescriptorFactory.HUE_RED, 0.11158617f, 0.21403643f, 0.31652793f, 0.42318326f, 0.52316946f, 0.62154025f, 0.71793145f, 0.8170021f, 0.9147729f});
            }
        }

        /* renamed from: c */
        public final Dancer mo30320c(int i) {
            this.f20944c = i;
            return this;
        }

        /* renamed from: a */
        public final Dancer mo30314a(Type type) {
            Intrinsics.checkParameterIsNotNull(type, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION);
            this.f20943b = type;
            return this;
        }

        /* renamed from: a */
        public final void mo30316a(int i) {
            this.f20945d = i;
        }

        /* renamed from: a */
        public final void mo30315a(float f) {
            this.f20949h.setVisibility(4);
            this.f20948g.setVisibility(0);
            this.f20948g.setProgress(f);
        }

        /* renamed from: b */
        public final void mo30318b(int i) {
            mo30315a(this.f20946e.get(this.f20943b.getValue())[i]);
            this.f20949h.setVisibility(0);
            Context context = this.f20942a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "item.context");
            this.f20949h.setImageResource(this.f20942a.getResources().getIdentifier("facade_digit_" + i, "drawable", context.getPackageName()));
            this.f20948g.setVisibility(4);
        }

        public Dancer(ViewGroup viewGroup, BearLottieView bearLottieView, ImageView imageView) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "factory");
            Intrinsics.checkParameterIsNotNull(bearLottieView, "step");
            Intrinsics.checkParameterIsNotNull(imageView, "stepIcon");
            this.f20948g = bearLottieView;
            this.f20949h = imageView;
            this.f20942a = viewGroup;
        }
    }

    private final Choreographer getMChoreographer() {
        Lazy lazy = this.f20937e;
        KProperty kProperty = f20933a[0];
        return (Choreographer) lazy.getValue();
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public void mo30298a(float f, int i, int i2) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public boolean mo30301a() {
        return false;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: b */
    public void mo30304b(AbstractC27129h hVar, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(hVar, "layout");
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27126e
    public void b_(float f, int i, int i2, int i3) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    public DigitDanceHeader getView() {
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    @Deprecated(message = "")
    public void setPrimaryColors(int... iArr) {
        Intrinsics.checkParameterIsNotNull(iArr, "colors");
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    public SpinnerStyle getSpinnerStyle() {
        return SpinnerStyle.FixedBehind;
    }

    /* renamed from: c */
    private final void m30936c() {
        getMChoreographer().mo30328a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0002J\u0014\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H\u0002J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\fH\u0002J\b\u0010\u001d\u001a\u00020\tH\u0002J\u0006\u0010\u001e\u001a\u00020\u000fJ\b\u0010\u001f\u001a\u00020\u000fH\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\tH\u0002J\u0006\u0010#\u001a\u00020\u000fJ\u0006\u0010$\u001a\u00020\u000fJ\u0010\u0010%\u001a\u00020\u000f2\b\b\u0001\u0010&\u001a\u00020'J\u0010\u0010(\u001a\u00020\u000f2\b\b\u0001\u0010)\u001a\u00020\fJ\u0006\u0010*\u001a\u00020\u000fJ\u0010\u0010+\u001a\u00020\u000f2\b\b\u0001\u0010,\u001a\u00020'J\u0010\u0010-\u001a\u00020\u000f2\b\b\u0001\u0010)\u001a\u00020\fR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/bytedance/ee/bear/facade/common/widget/recyclerview/DigitDanceHeader$Choreographer;", "", "mContainer", "Landroid/view/ViewGroup;", "mTitle", "Landroid/widget/TextView;", "(Landroid/view/ViewGroup;Landroid/widget/TextView;)V", "dancers", "Ljava/util/LinkedList;", "Lcom/bytedance/ee/bear/facade/common/widget/recyclerview/DigitDanceHeader$Dancer;", "mDancerPool", "mEndNumber", "", "mStartNumber", "attachToContainer", "", "item", "Landroid/view/View;", "convertStr2Digit", "numInString", "", "index", "createLayout", "Lkotlin/Pair;", "Lcom/bytedance/ee/bear/facade/common/widget/BearLottieView;", "Landroid/widget/ImageView;", "detachFromContainer", "getDirection", "Lcom/bytedance/ee/bear/facade/common/widget/recyclerview/DigitDanceHeader$Dancer$Type;", "obtainOneDancer", "pauseAnimation", "recycleAllDancers", "recycleOneDancer", "", "dancer", "reset", "resumeAnimation", "setDancersAlpha", "alpha", "", "setEndNumber", "number", "setNumber", "setProgress", "progress", "setStartNumber", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.facade.common.widget.recyclerview.DigitDanceHeader$a */
    public static final class Choreographer {

        /* renamed from: a */
        private LinkedList<Dancer> f20950a = new LinkedList<>();

        /* renamed from: b */
        private LinkedList<Dancer> f20951b = new LinkedList<>();

        /* renamed from: c */
        private int f20952c;

        /* renamed from: d */
        private int f20953d;

        /* renamed from: e */
        private ViewGroup f20954e;

        /* renamed from: f */
        private TextView f20955f;

        /* renamed from: c */
        public final void mo30334c() {
            Iterator<Dancer> it = this.f20950a.iterator();
            while (it.hasNext()) {
                it.next().mo30323f();
            }
        }

        /* renamed from: f */
        private final void m30964f() {
            this.f20954e.removeAllViews();
            Iterator<Dancer> it = this.f20950a.iterator();
            while (it.hasNext()) {
                Dancer next = it.next();
                next.mo30318b(0);
                next.mo30324g();
            }
            this.f20951b.addAll(this.f20950a);
            this.f20950a.clear();
        }

        /* renamed from: a */
        public final void mo30328a() {
            this.f20953d = 0;
            this.f20952c = 0;
            this.f20955f.setAlpha(BitmapDescriptorFactory.HUE_RED);
            mo30329a(BitmapDescriptorFactory.HUE_RED);
            m30964f();
        }

        /* renamed from: b */
        public final void mo30331b() {
            int size = this.f20950a.size();
            for (int i = 0; i < size; i++) {
                Dancer dancer = this.f20950a.get(i);
                Intrinsics.checkExpressionValueIsNotNull(dancer, "dancers[i]");
                Dancer dancer2 = dancer;
                dancer2.mo30322e();
                dancer2.mo30318b(dancer2.mo30317b());
            }
            this.f20955f.setAlpha(1.0f);
        }

        /* renamed from: d */
        private final Dancer m30962d() {
            if (this.f20951b.size() > 0) {
                Dancer remove = this.f20951b.remove(0);
                Intrinsics.checkExpressionValueIsNotNull(remove, "mDancerPool.removeAt(0)");
                return remove;
            }
            Pair<BearLottieView, ImageView> e = m30963e();
            ViewParent parent = e.getFirst().getParent();
            if (parent != null) {
                return new Dancer((ViewGroup) parent, e.getFirst(), e.getSecond());
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }

        /* renamed from: e */
        private final Pair<BearLottieView, ImageView> m30963e() {
            RelativeLayout relativeLayout = new RelativeLayout(this.f20954e.getContext());
            relativeLayout.setGravity(17);
            relativeLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            BearLottieView bearLottieView = new BearLottieView(this.f20954e.getContext());
            bearLottieView.setId(View.generateViewId());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            bearLottieView.setRepeatCount(-1);
            relativeLayout.addView(bearLottieView, layoutParams);
            AppCompatImageView appCompatImageView = new AppCompatImageView(this.f20954e.getContext());
            appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            appCompatImageView.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(5, bearLottieView.getId());
            layoutParams2.addRule(7, bearLottieView.getId());
            layoutParams2.addRule(6, bearLottieView.getId());
            layoutParams2.addRule(8, bearLottieView.getId());
            relativeLayout.addView(appCompatImageView, layoutParams2);
            AppCompatImageView appCompatImageView2 = new AppCompatImageView(this.f20954e.getContext());
            appCompatImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
            appCompatImageView2.setImageResource(R.drawable.list_digit_dance_mask_top);
            C13747j.m55728a((ImageView) appCompatImageView2, (int) R.color.bg_body);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.topMargin = C13749l.m55738a(-8);
            layoutParams3.addRule(18, bearLottieView.getId());
            layoutParams3.addRule(19, bearLottieView.getId());
            layoutParams3.addRule(5, bearLottieView.getId());
            layoutParams3.addRule(7, bearLottieView.getId());
            layoutParams3.addRule(6, bearLottieView.getId());
            relativeLayout.addView(appCompatImageView2, layoutParams3);
            AppCompatImageView appCompatImageView3 = new AppCompatImageView(this.f20954e.getContext());
            appCompatImageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
            C13747j.m55728a((ImageView) appCompatImageView3, (int) R.color.bg_body);
            appCompatImageView3.setImageResource(R.drawable.list_digit_dance_mask_bottom);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams4.bottomMargin = C13749l.m55738a(-16);
            layoutParams4.addRule(18, bearLottieView.getId());
            layoutParams4.addRule(19, bearLottieView.getId());
            layoutParams4.addRule(5, bearLottieView.getId());
            layoutParams4.addRule(7, bearLottieView.getId());
            layoutParams4.addRule(8, bearLottieView.getId());
            relativeLayout.addView(appCompatImageView3, layoutParams4);
            return new Pair<>(bearLottieView, appCompatImageView);
        }

        /* renamed from: a */
        private final void m30958a(View view) {
            this.f20954e.addView(view);
        }

        /* renamed from: b */
        private final void m30960b(View view) {
            this.f20954e.removeView(view);
        }

        /* renamed from: a */
        private final boolean m30959a(Dancer dancer) {
            return this.f20951b.add(dancer);
        }

        /* renamed from: c */
        private final Dancer.Type m30961c(int i) {
            if (i % 2 == 0) {
                return Dancer.Type.DOWNWARD;
            }
            return Dancer.Type.UPWARD;
        }

        /* renamed from: a */
        public final void mo30329a(float f) {
            this.f20954e.setAlpha(f);
        }

        /* renamed from: b */
        public final void mo30332b(float f) {
            int size = this.f20950a.size();
            int i = 0;
            while (i < size) {
                i++;
                this.f20950a.get(i).mo30315a((this.f20950a.get(i).mo30319c() + ((((float) i) * f) * 1.3f)) % 1.0f);
            }
        }

        /* renamed from: a */
        public final void mo30330a(int i) {
            this.f20952c = i;
            String valueOf = String.valueOf(i);
            int length = valueOf.length();
            for (int i2 = 0; i2 < length; i2++) {
                Dancer d = m30962d().mo30320c(m30957a(valueOf, i2)).mo30314a(m30961c(i2)).mo30321d();
                this.f20950a.add(d);
                m30958a(d.mo30313a());
            }
        }

        /* renamed from: b */
        public final void mo30333b(int i) {
            this.f20953d = i;
            int length = String.valueOf(i).length() - String.valueOf(this.f20952c).length();
            String valueOf = String.valueOf(i);
            int length2 = valueOf.length();
            if (length > 0) {
                for (int i2 = 0; i2 < length; i2++) {
                    Dancer d = m30962d().mo30320c(m30957a(valueOf, i2)).mo30314a(m30961c((length2 - length) + i2)).mo30321d();
                    this.f20950a.add(d);
                    m30958a(d.mo30313a());
                    d.mo30323f();
                }
            } else if (length < 0) {
                int i3 = -length;
                for (int i4 = 0; i4 < i3; i4++) {
                    Dancer removeLast = this.f20950a.removeLast();
                    Intrinsics.checkExpressionValueIsNotNull(removeLast, "dancer");
                    m30959a(removeLast);
                    m30960b(removeLast.mo30313a());
                    if (removeLast.mo30325h().isAnimating()) {
                        removeLast.mo30325h().pauseAnimation();
                    }
                }
            }
            int size = this.f20950a.size();
            for (int i5 = 0; i5 < size; i5++) {
                this.f20950a.get(i5).mo30316a(m30957a(valueOf, i5));
            }
        }

        public Choreographer(ViewGroup viewGroup, TextView textView) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "mContainer");
            Intrinsics.checkParameterIsNotNull(textView, "mTitle");
            this.f20954e = viewGroup;
            this.f20955f = textView;
        }

        /* renamed from: a */
        private final int m30957a(String str, int i) {
            int i2 = i + 1;
            if (str != null) {
                String substring = str.substring(i, i2);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return Integer.parseInt(substring);
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/facade/common/widget/recyclerview/DigitDanceHeader$Choreographer;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.facade.common.widget.recyclerview.DigitDanceHeader$b */
    static final class C7736b extends Lambda implements Function0<Choreographer> {
        final /* synthetic */ DigitDanceHeader this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7736b(DigitDanceHeader digitDanceHeader) {
            super(0);
            this.this$0 = digitDanceHeader;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Choreographer invoke() {
            Pair<ViewGroup, TextView> b = this.this$0.mo30312b();
            return new Choreographer(b.getFirst(), b.getSecond());
        }
    }

    /* renamed from: b */
    public final Pair<ViewGroup, TextView> mo30312b() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        addView(linearLayout, layoutParams);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setBackgroundColor(C13749l.m55755c(getContext(), R.color.bg_body));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.bottomMargin = C13749l.m55738a(-10);
        linearLayout2.setLayoutParams(layoutParams2);
        linearLayout.addView(linearLayout2);
        TextView textView = new TextView(getContext());
        this.f20935c = textView;
        if (textView == null) {
            Intrinsics.throwNpe();
        }
        textView.setTextColor(C13749l.m55755c(getContext(), R.color.text_placeholder));
        TextView textView2 = this.f20935c;
        if (textView2 == null) {
            Intrinsics.throwNpe();
        }
        textView2.setTextSize(13.0f);
        TextView textView3 = this.f20935c;
        if (textView3 == null) {
            Intrinsics.throwNpe();
        }
        textView3.setGravity(17);
        linearLayout.addView(this.f20935c, new LinearLayout.LayoutParams(-2, -2));
        TextView textView4 = this.f20935c;
        if (textView4 == null) {
            Intrinsics.throwNpe();
        }
        return new Pair<>(linearLayout2, textView4);
    }

    @Override // com.bytedance.ee.bear.facade.common.widget.recyclerview.AbstractC7741a
    public void setAssociatedHeader(AbstractC7741a aVar) {
        this.f20941i = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DigitDanceHeader(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m30936c();
    }

    @Override // com.bytedance.ee.bear.facade.common.widget.recyclerview.AbstractC7741a
    public void setCustomText(String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        TextView textView = this.f20935c;
        if (textView != null) {
            textView.setText(str);
        }
        AbstractC7741a aVar = this.f20941i;
        if (aVar != null) {
            aVar.setCustomText(str);
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.widget.recyclerview.AbstractC7741a
    public void setStartNumber(int i) {
        if (!this.f20940h) {
            this.f20940h = true;
            this.f20939g = i;
            this.f20938f = i;
            getMChoreographer().mo30328a();
            getMChoreographer().mo30330a(this.f20938f);
        } else {
            this.f20939g = i;
        }
        AbstractC7741a aVar = this.f20941i;
        if (aVar != null) {
            aVar.setStartNumber(i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DigitDanceHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        m30936c();
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public int mo30297a(AbstractC27129h hVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(hVar, "layout");
        getMChoreographer().mo30333b(this.f20939g);
        getMChoreographer().mo30331b();
        this.f20938f = this.f20939g;
        AbstractC7741a aVar = this.f20941i;
        if (aVar != null) {
            aVar.mo30297a(hVar, z);
        }
        return this.f20934b;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public void mo30299a(AbstractC27128g gVar, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(gVar, "kernel");
        this.f20936d = gVar;
        AbstractC7741a aVar = this.f20941i;
        if (aVar != null) {
            aVar.mo30299a(gVar, i, i2);
        }
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27126e
    public void a_(AbstractC27129h hVar, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(hVar, "layout");
        AbstractC7741a aVar = this.f20941i;
        if (aVar != null) {
            aVar.a_(hVar, i, i2);
        }
    }

    @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27141e
    /* renamed from: a */
    public void mo30300a(AbstractC27129h hVar, RefreshState refreshState, RefreshState refreshState2) {
        Intrinsics.checkParameterIsNotNull(hVar, "refreshLayout");
        Intrinsics.checkParameterIsNotNull(refreshState, "oldState");
        Intrinsics.checkParameterIsNotNull(refreshState2, "newState");
        int i = C7742b.f21000a[refreshState2.ordinal()];
        if (i == 1) {
            getMChoreographer().mo30328a();
            getMChoreographer().mo30330a(this.f20938f);
        } else if (i == 5) {
            getMChoreographer().mo30334c();
        }
        AbstractC7741a aVar = this.f20941i;
        if (aVar != null) {
            aVar.mo30300a(hVar, refreshState, refreshState2);
        }
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27126e
    public void a_(float f, int i, int i2, int i3) {
        RefreshState refreshState;
        AbstractC27129h a;
        AbstractC27129h a2;
        AbstractC27128g gVar = this.f20936d;
        if (gVar == null || (a2 = gVar.mo96459a()) == null || !a2.mo96426q()) {
            AbstractC27128g gVar2 = this.f20936d;
            if (gVar2 == null || (a = gVar2.mo96459a()) == null) {
                refreshState = null;
            } else {
                refreshState = a.getState();
            }
            if (refreshState != RefreshState.RefreshFinish) {
                float b = C27144b.m98679b((float) i);
                if (b >= 50.0f) {
                    getMChoreographer().mo30332b(((b - 50.0f) / (((float) i2) - 50.0f)) * 1.0f);
                    getMChoreographer().mo30329a(1.0f);
                }
                if (b >= 30.0f && b <= 50.0f) {
                    getMChoreographer().mo30329a((b - 30.0f) / 20.0f);
                }
                if (b < 30.0f) {
                    getMChoreographer().mo30329a(BitmapDescriptorFactory.HUE_RED);
                }
                if (b < 50.0f) {
                    getMChoreographer().mo30332b(BitmapDescriptorFactory.HUE_RED);
                }
                AbstractC7741a aVar = this.f20941i;
                if (aVar != null) {
                    aVar.a_(f, i, i2, i3);
                }
            }
        }
    }
}
