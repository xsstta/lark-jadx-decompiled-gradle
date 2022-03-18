package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.solver.C0630e;
import androidx.constraintlayout.solver.widgets.C0667d;
import androidx.constraintlayout.solver.widgets.C0670f;
import androidx.constraintlayout.solver.widgets.C0674i;
import androidx.constraintlayout.solver.widgets.C0675j;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.p025a.C0642b;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout extends ViewGroup {
    SparseArray<View> mChildrenByIds = new SparseArray<>();
    public ArrayList<ConstraintHelper> mConstraintHelpers = new ArrayList<>(4);
    protected C0686a mConstraintLayoutSpec = null;
    private C0689b mConstraintSet = null;
    private int mConstraintSetId = -1;
    private AbstractC0695c mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds = new HashMap<>();
    protected boolean mDirtyHierarchy = true;
    private int mLastMeasureHeight = -1;
    int mLastMeasureHeightMode = 0;
    int mLastMeasureHeightSize = -1;
    private int mLastMeasureWidth = -1;
    int mLastMeasureWidthMode = 0;
    int mLastMeasureWidthSize = -1;
    public C0667d mLayoutWidget = new C0667d();
    private int mMaxHeight = Integer.MAX_VALUE;
    private int mMaxWidth = Integer.MAX_VALUE;
    C0685a mMeasurer = new C0685a(this);
    private C0630e mMetrics;
    private int mMinHeight = 0;
    private int mMinWidth = 0;
    private int mOnMeasureHeightMeasureSpec = 0;
    private int mOnMeasureWidthMeasureSpec = 0;
    public int mOptimizationLevel = 257;
    private SparseArray<ConstraintWidget> mTempMapIdToWidget = new SparseArray<>();

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public float f2783A = 0.5f;

        /* renamed from: B */
        public String f2784B;

        /* renamed from: C */
        float f2785C;

        /* renamed from: D */
        int f2786D = 1;

        /* renamed from: E */
        public float f2787E = -1.0f;

        /* renamed from: F */
        public float f2788F = -1.0f;

        /* renamed from: G */
        public int f2789G;

        /* renamed from: H */
        public int f2790H;

        /* renamed from: I */
        public int f2791I;

        /* renamed from: J */
        public int f2792J;

        /* renamed from: K */
        public int f2793K;

        /* renamed from: L */
        public int f2794L;

        /* renamed from: M */
        public int f2795M;

        /* renamed from: N */
        public int f2796N;

        /* renamed from: O */
        public float f2797O = 1.0f;

        /* renamed from: P */
        public float f2798P = 1.0f;

        /* renamed from: Q */
        public int f2799Q = -1;

        /* renamed from: R */
        public int f2800R = -1;

        /* renamed from: S */
        public int f2801S = -1;

        /* renamed from: T */
        public boolean f2802T;

        /* renamed from: U */
        public boolean f2803U;

        /* renamed from: V */
        public String f2804V;

        /* renamed from: W */
        boolean f2805W = true;

        /* renamed from: X */
        boolean f2806X = true;

        /* renamed from: Y */
        boolean f2807Y;

        /* renamed from: Z */
        boolean f2808Z;

        /* renamed from: a */
        public int f2809a = -1;
        boolean aa;
        boolean ab;
        boolean ac;
        int ad = -1;
        int ae = -1;
        int af = -1;
        int ag = -1;
        int ah = -1;

        /* renamed from: ai  reason: collision with root package name */
        int f175414ai = -1;
        float aj = 0.5f;
        int ak;
        int al;
        float am;
        ConstraintWidget an = new ConstraintWidget();
        public boolean ao = false;

        /* renamed from: b */
        public int f2810b = -1;

        /* renamed from: c */
        public float f2811c = -1.0f;

        /* renamed from: d */
        public int f2812d = -1;

        /* renamed from: e */
        public int f2813e = -1;

        /* renamed from: f */
        public int f2814f = -1;

        /* renamed from: g */
        public int f2815g = -1;

        /* renamed from: h */
        public int f2816h = -1;

        /* renamed from: i */
        public int f2817i = -1;

        /* renamed from: j */
        public int f2818j = -1;

        /* renamed from: k */
        public int f2819k = -1;

        /* renamed from: l */
        public int f2820l = -1;

        /* renamed from: m */
        public int f2821m = -1;

        /* renamed from: n */
        public int f2822n;

        /* renamed from: o */
        public float f2823o;

        /* renamed from: p */
        public int f2824p = -1;

        /* renamed from: q */
        public int f2825q = -1;

        /* renamed from: r */
        public int f2826r = -1;

        /* renamed from: s */
        public int f2827s = -1;

        /* renamed from: t */
        public int f2828t = -1;

        /* renamed from: u */
        public int f2829u = -1;

        /* renamed from: v */
        public int f2830v = -1;

        /* renamed from: w */
        public int f2831w = -1;

        /* renamed from: x */
        public int f2832x = -1;

        /* renamed from: y */
        public int f2833y = -1;

        /* renamed from: z */
        public float f2834z = 0.5f;

        /* renamed from: a */
        public ConstraintWidget mo3844a() {
            return this.an;
        }

        /* renamed from: c */
        public String mo3846c() {
            return this.f2804V;
        }

        /* renamed from: b */
        public void mo3845b() {
            this.f2808Z = false;
            this.f2805W = true;
            this.f2806X = true;
            if (this.width == -2 && this.f2802T) {
                this.f2805W = false;
                if (this.f2791I == 0) {
                    this.f2791I = 1;
                }
            }
            if (this.height == -2 && this.f2803U) {
                this.f2806X = false;
                if (this.f2792J == 0) {
                    this.f2792J = 1;
                }
            }
            if (this.width == 0 || this.width == -1) {
                this.f2805W = false;
                if (this.width == 0 && this.f2791I == 1) {
                    this.width = -2;
                    this.f2802T = true;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.f2806X = false;
                if (this.height == 0 && this.f2792J == 1) {
                    this.height = -2;
                    this.f2803U = true;
                }
            }
            if (this.f2811c != -1.0f || this.f2809a != -1 || this.f2810b != -1) {
                this.f2808Z = true;
                this.f2805W = true;
                this.f2806X = true;
                if (!(this.an instanceof C0670f)) {
                    this.an = new C0670f();
                }
                ((C0670f) this.an).mo3602a(this.f2801S);
            }
        }

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$LayoutParams$a */
        private static class C0684a {

            /* renamed from: a */
            public static final SparseIntArray f2835a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f2835a = sparseIntArray;
                sparseIntArray.append(64, 8);
                sparseIntArray.append(65, 9);
                sparseIntArray.append(67, 10);
                sparseIntArray.append(68, 11);
                sparseIntArray.append(74, 12);
                sparseIntArray.append(73, 13);
                sparseIntArray.append(46, 14);
                sparseIntArray.append(45, 15);
                sparseIntArray.append(43, 16);
                sparseIntArray.append(47, 2);
                sparseIntArray.append(49, 3);
                sparseIntArray.append(48, 4);
                sparseIntArray.append(82, 49);
                sparseIntArray.append(83, 50);
                sparseIntArray.append(53, 5);
                sparseIntArray.append(54, 6);
                sparseIntArray.append(55, 7);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(69, 17);
                sparseIntArray.append(70, 18);
                sparseIntArray.append(52, 19);
                sparseIntArray.append(51, 20);
                sparseIntArray.append(86, 21);
                sparseIntArray.append(89, 22);
                sparseIntArray.append(87, 23);
                sparseIntArray.append(84, 24);
                sparseIntArray.append(88, 25);
                sparseIntArray.append(85, 26);
                sparseIntArray.append(60, 29);
                sparseIntArray.append(75, 30);
                sparseIntArray.append(50, 44);
                sparseIntArray.append(62, 45);
                sparseIntArray.append(77, 46);
                sparseIntArray.append(61, 47);
                sparseIntArray.append(76, 48);
                sparseIntArray.append(41, 27);
                sparseIntArray.append(40, 28);
                sparseIntArray.append(78, 31);
                sparseIntArray.append(56, 32);
                sparseIntArray.append(80, 33);
                sparseIntArray.append(79, 34);
                sparseIntArray.append(81, 35);
                sparseIntArray.append(58, 36);
                sparseIntArray.append(57, 37);
                sparseIntArray.append(59, 38);
                sparseIntArray.append(63, 39);
                sparseIntArray.append(72, 40);
                sparseIntArray.append(66, 41);
                sparseIntArray.append(44, 42);
                sparseIntArray.append(42, 43);
                sparseIntArray.append(71, 51);
            }
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0098  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x003f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r10) {
            /*
            // Method dump skipped, instructions count: 263
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842948, 16842965, 16842966, 16842967, 16842968, 16842969, 16842972, 16843039, 16843040, 16843071, 16843072, 16843699, 16843700, 16843840, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraintSet, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.layoutDescription, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_optimizationLevel});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = C0684a.f2835a.get(index);
                switch (i3) {
                    case 1:
                        this.f2801S = obtainStyledAttributes.getInt(index, this.f2801S);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f2821m);
                        this.f2821m = resourceId;
                        if (resourceId == -1) {
                            this.f2821m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f2822n = obtainStyledAttributes.getDimensionPixelSize(index, this.f2822n);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.f2823o) % 360.0f;
                        this.f2823o = f;
                        if (f < BitmapDescriptorFactory.HUE_RED) {
                            this.f2823o = (360.0f - f) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f2809a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2809a);
                        break;
                    case 6:
                        this.f2810b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2810b);
                        break;
                    case 7:
                        this.f2811c = obtainStyledAttributes.getFloat(index, this.f2811c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f2812d);
                        this.f2812d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f2812d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f2813e);
                        this.f2813e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f2813e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f2814f);
                        this.f2814f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f2814f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f2815g);
                        this.f2815g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f2815g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f2816h);
                        this.f2816h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f2816h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f2817i);
                        this.f2817i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f2817i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f2818j);
                        this.f2818j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f2818j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f2819k);
                        this.f2819k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f2819k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f2820l);
                        this.f2820l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f2820l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f2824p);
                        this.f2824p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f2824p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f2825q);
                        this.f2825q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f2825q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f2826r);
                        this.f2826r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f2826r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f2827s);
                        this.f2827s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f2827s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f2828t = obtainStyledAttributes.getDimensionPixelSize(index, this.f2828t);
                        break;
                    case 22:
                        this.f2829u = obtainStyledAttributes.getDimensionPixelSize(index, this.f2829u);
                        break;
                    case 23:
                        this.f2830v = obtainStyledAttributes.getDimensionPixelSize(index, this.f2830v);
                        break;
                    case 24:
                        this.f2831w = obtainStyledAttributes.getDimensionPixelSize(index, this.f2831w);
                        break;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                        this.f2832x = obtainStyledAttributes.getDimensionPixelSize(index, this.f2832x);
                        break;
                    case 26:
                        this.f2833y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2833y);
                        break;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                        this.f2802T = obtainStyledAttributes.getBoolean(index, this.f2802T);
                        break;
                    case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                        this.f2803U = obtainStyledAttributes.getBoolean(index, this.f2803U);
                        break;
                    case 29:
                        this.f2834z = obtainStyledAttributes.getFloat(index, this.f2834z);
                        break;
                    case 30:
                        this.f2783A = obtainStyledAttributes.getFloat(index, this.f2783A);
                        break;
                    case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.f2791I = i4;
                        if (i4 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i5 = obtainStyledAttributes.getInt(index, 0);
                        this.f2792J = i5;
                        if (i5 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.f2793K = obtainStyledAttributes.getDimensionPixelSize(index, this.f2793K);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f2793K) == -2) {
                                this.f2793K = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f2795M = obtainStyledAttributes.getDimensionPixelSize(index, this.f2795M);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f2795M) == -2) {
                                this.f2795M = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.f2797O = Math.max((float) BitmapDescriptorFactory.HUE_RED, obtainStyledAttributes.getFloat(index, this.f2797O));
                        this.f2791I = 2;
                        break;
                    case 36:
                        try {
                            this.f2794L = obtainStyledAttributes.getDimensionPixelSize(index, this.f2794L);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f2794L) == -2) {
                                this.f2794L = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f2796N = obtainStyledAttributes.getDimensionPixelSize(index, this.f2796N);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f2796N) == -2) {
                                this.f2796N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.f2798P = Math.max((float) BitmapDescriptorFactory.HUE_RED, obtainStyledAttributes.getFloat(index, this.f2798P));
                        this.f2792J = 2;
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.f2784B = string;
                                this.f2785C = Float.NaN;
                                this.f2786D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int indexOf = this.f2784B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String substring = this.f2784B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.f2786D = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.f2786D = 1;
                                        }
                                        i = indexOf + 1;
                                    }
                                    int indexOf2 = this.f2784B.indexOf(58);
                                    if (indexOf2 < 0 || indexOf2 >= length - 1) {
                                        String substring2 = this.f2784B.substring(i);
                                        if (substring2.length() > 0) {
                                            this.f2785C = Float.parseFloat(substring2);
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        String substring3 = this.f2784B.substring(i, indexOf2);
                                        String substring4 = this.f2784B.substring(indexOf2 + 1);
                                        if (substring3.length() > 0 && substring4.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring3);
                                                float parseFloat2 = Float.parseFloat(substring4);
                                                if (parseFloat > BitmapDescriptorFactory.HUE_RED && parseFloat2 > BitmapDescriptorFactory.HUE_RED) {
                                                    if (this.f2786D == 1) {
                                                        this.f2785C = Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    } else {
                                                        this.f2785C = Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    continue;
                                }
                                break;
                            case 45:
                                this.f2787E = obtainStyledAttributes.getFloat(index, this.f2787E);
                                continue;
                            case 46:
                                this.f2788F = obtainStyledAttributes.getFloat(index, this.f2788F);
                                continue;
                            case 47:
                                this.f2789G = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.f2790H = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.f2799Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2799Q);
                                continue;
                            case MmListControl.f116813f /*{ENCODED_INT: 50}*/:
                                this.f2800R = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2800R);
                                continue;
                            case 51:
                                this.f2804V = obtainStyledAttributes.getString(index);
                                continue;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            mo3845b();
        }
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.mo3682h();
    }

    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    private void markHierarchyDirty() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private boolean updateHierarchy() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            setChildrenConstraints();
        }
        return z;
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$1 */
    static /* synthetic */ class C06831 {

        /* renamed from: a */
        static final /* synthetic */ int[] f2782a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.widget.ConstraintLayout.C06831.f2782a = r0
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = androidx.constraintlayout.widget.ConstraintLayout.C06831.f2782a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = androidx.constraintlayout.widget.ConstraintLayout.C06831.f2782a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = androidx.constraintlayout.widget.ConstraintLayout.C06831.f2782a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C06831.<clinit>():void");
        }
    }

    private int getPaddingWidth() {
        int i = 0;
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        if (Build.VERSION.SDK_INT >= 17) {
            i = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        }
        return i > 0 ? i : max;
    }

    public boolean isRtl() {
        boolean z;
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        if ((getContext().getApplicationInfo().flags & 4194304) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    public class C0685a implements C0642b.AbstractC0644b {

        /* renamed from: a */
        ConstraintLayout f2836a;

        /* renamed from: b */
        int f2837b;

        /* renamed from: c */
        int f2838c;

        /* renamed from: d */
        int f2839d;

        /* renamed from: e */
        int f2840e;

        /* renamed from: f */
        int f2841f;

        /* renamed from: g */
        int f2842g;

        @Override // androidx.constraintlayout.solver.widgets.p025a.C0642b.AbstractC0644b
        /* renamed from: a */
        public final void mo3613a() {
            int childCount = this.f2836a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f2836a.getChildAt(i);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).mo3865b(this.f2836a);
                }
            }
            int size = this.f2836a.mConstraintHelpers.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    this.f2836a.mConstraintHelpers.get(i2).mo3806f(this.f2836a);
                }
            }
        }

        public C0685a(ConstraintLayout constraintLayout) {
            this.f2836a = constraintLayout;
        }

        @Override // androidx.constraintlayout.solver.widgets.p025a.C0642b.AbstractC0644b
        /* renamed from: a */
        public final void mo3614a(ConstraintWidget constraintWidget, C0642b.C0643a aVar) {
            int i;
            int i2;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            int i3;
            int i4;
            int i5;
            int i6;
            boolean z7;
            boolean z8;
            int i7;
            int i8;
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            if (constraintWidget != null) {
                if (constraintWidget.mo3596w() == 8 && !constraintWidget.mo3580o()) {
                    aVar.f2596h = 0;
                    aVar.f2597i = 0;
                    aVar.f2598j = 0;
                } else if (constraintWidget.mo3595v() != null) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.f2592d;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = aVar.f2593e;
                    int i9 = aVar.f2594f;
                    int i10 = aVar.f2595g;
                    int i11 = this.f2837b + this.f2838c;
                    int i12 = this.f2839d;
                    View view = (View) constraintWidget.mo3511M();
                    int i13 = C06831.f2782a[dimensionBehaviour.ordinal()];
                    if (i13 == 1) {
                        i = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                    } else if (i13 == 2) {
                        i = ViewGroup.getChildMeasureSpec(this.f2841f, i12, -2);
                    } else if (i13 == 3) {
                        i = ViewGroup.getChildMeasureSpec(this.f2841f, i12 + constraintWidget.mo3505G(), -1);
                    } else if (i13 != 4) {
                        i = 0;
                    } else {
                        i = ViewGroup.getChildMeasureSpec(this.f2841f, i12, -2);
                        if (constraintWidget.f2568l == 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (aVar.f2601m == C0642b.C0643a.f2590b || aVar.f2601m == C0642b.C0643a.f2591c) {
                            if (view.getMeasuredHeight() == constraintWidget.mo3500B()) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (aVar.f2601m == C0642b.C0643a.f2591c || !z13 || ((z13 && z14) || (view instanceof Placeholder) || constraintWidget.mo3559d())) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z15) {
                                i = View.MeasureSpec.makeMeasureSpec(constraintWidget.mo3499A(), 1073741824);
                            }
                        }
                    }
                    int i14 = C06831.f2782a[dimensionBehaviour2.ordinal()];
                    if (i14 == 1) {
                        i2 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                    } else if (i14 == 2) {
                        i2 = ViewGroup.getChildMeasureSpec(this.f2842g, i11, -2);
                    } else if (i14 == 3) {
                        i2 = ViewGroup.getChildMeasureSpec(this.f2842g, i11 + constraintWidget.mo3506H(), -1);
                    } else if (i14 != 4) {
                        i2 = 0;
                    } else {
                        i2 = ViewGroup.getChildMeasureSpec(this.f2842g, i11, -2);
                        if (constraintWidget.f2569m == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (aVar.f2601m == C0642b.C0643a.f2590b || aVar.f2601m == C0642b.C0643a.f2591c) {
                            if (view.getMeasuredWidth() == constraintWidget.mo3499A()) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (aVar.f2601m == C0642b.C0643a.f2591c || !z10 || ((z10 && z11) || (view instanceof Placeholder) || constraintWidget.mo3564e())) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                i2 = View.MeasureSpec.makeMeasureSpec(constraintWidget.mo3500B(), 1073741824);
                            }
                        }
                    }
                    C0667d dVar = (C0667d) constraintWidget.mo3595v();
                    if (dVar != null && C0674i.m3295a(ConstraintLayout.this.mOptimizationLevel, DynamicModule.f58006b) && view.getMeasuredWidth() == constraintWidget.mo3499A() && view.getMeasuredWidth() < dVar.mo3499A() && view.getMeasuredHeight() == constraintWidget.mo3500B() && view.getMeasuredHeight() < dVar.mo3500B() && view.getBaseline() == constraintWidget.mo3510L() && !constraintWidget.mo3582p()) {
                        if (!m3367a(constraintWidget.mo3583q(), i, constraintWidget.mo3499A()) || !m3367a(constraintWidget.mo3585r(), i2, constraintWidget.mo3500B())) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (z9) {
                            aVar.f2596h = constraintWidget.mo3499A();
                            aVar.f2597i = constraintWidget.mo3500B();
                            aVar.f2598j = constraintWidget.mo3510L();
                            return;
                        }
                    }
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_PARENT || dimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z || constraintWidget.f2544M <= BitmapDescriptorFactory.HUE_RED) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (!z2 || constraintWidget.f2544M <= BitmapDescriptorFactory.HUE_RED) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    if (view != null) {
                        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                        if (aVar.f2601m == C0642b.C0643a.f2590b || aVar.f2601m == C0642b.C0643a.f2591c || !z || constraintWidget.f2568l != 0 || !z2 || constraintWidget.f2569m != 0) {
                            if (!(view instanceof VirtualLayout) || !(constraintWidget instanceof C0675j)) {
                                view.measure(i, i2);
                            } else {
                                ((VirtualLayout) view).mo3062a((C0675j) constraintWidget, i, i2);
                            }
                            constraintWidget.mo3553c(i, i2);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            i5 = view.getBaseline();
                            if (constraintWidget.f2571o > 0) {
                                i4 = Math.max(constraintWidget.f2571o, measuredWidth);
                            } else {
                                i4 = measuredWidth;
                            }
                            if (constraintWidget.f2572p > 0) {
                                i4 = Math.min(constraintWidget.f2572p, i4);
                            }
                            if (constraintWidget.f2574r > 0) {
                                i3 = Math.max(constraintWidget.f2574r, measuredHeight);
                                i7 = i2;
                            } else {
                                i7 = i2;
                                i3 = measuredHeight;
                            }
                            if (constraintWidget.f2575s > 0) {
                                i3 = Math.min(constraintWidget.f2575s, i3);
                            }
                            if (!C0674i.m3295a(ConstraintLayout.this.mOptimizationLevel, 1)) {
                                if (z5 && z3) {
                                    i4 = (int) ((((float) i3) * constraintWidget.f2544M) + 0.5f);
                                } else if (z6 && z4) {
                                    i3 = (int) ((((float) i4) / constraintWidget.f2544M) + 0.5f);
                                }
                            }
                            if (!(measuredWidth == i4 && measuredHeight == i3)) {
                                if (measuredWidth != i4) {
                                    i = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                                }
                                if (measuredHeight != i3) {
                                    i8 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                                } else {
                                    i8 = i7;
                                }
                                view.measure(i, i8);
                                constraintWidget.mo3553c(i, i8);
                                i4 = view.getMeasuredWidth();
                                i3 = view.getMeasuredHeight();
                                i5 = view.getBaseline();
                            }
                            i6 = -1;
                        } else {
                            i6 = -1;
                            i5 = 0;
                            i4 = 0;
                            i3 = 0;
                        }
                        if (i5 != i6) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (i4 == aVar.f2594f && i3 == aVar.f2595g) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        aVar.f2600l = z8;
                        if (layoutParams.f2807Y) {
                            z7 = true;
                        }
                        if (!(!z7 || i5 == -1 || constraintWidget.mo3510L() == i5)) {
                            aVar.f2600l = true;
                        }
                        aVar.f2596h = i4;
                        aVar.f2597i = i3;
                        aVar.f2599k = z7;
                        aVar.f2598j = i5;
                    }
                }
            }
        }

        /* renamed from: a */
        private boolean m3367a(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                return false;
            }
            if ((mode == Integer.MIN_VALUE || mode == 0) && i3 == size) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public void mo3848a(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f2837b = i3;
            this.f2838c = i4;
            this.f2839d = i5;
            this.f2840e = i6;
            this.f2841f = i;
            this.f2842g = i2;
        }
    }

    private void setChildrenConstraints() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ConstraintWidget viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.mo3587s();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).mo3539a(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof Constraints)) {
                    this.mConstraintSet = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        C0689b bVar = this.mConstraintSet;
        if (bVar != null) {
            bVar.mo3892a(this, true);
        }
        this.mLayoutWidget.ad();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.mConstraintHelpers.get(i4).mo3804d(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).mo3864a(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            ConstraintWidget viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                LayoutParams layoutParams = (LayoutParams) childAt5.getLayoutParams();
                this.mLayoutWidget.mo3747b(viewWidget2);
                applyConstraintsFromLayoutParams(isInEditMode, childAt5, viewWidget2, layoutParams, this.mTempMapIdToWidget);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void setConstraintSet(C0689b bVar) {
        this.mConstraintSet = bVar;
    }

    public void fillMetrics(C0630e eVar) {
        this.mMetrics = eVar;
        this.mLayoutWidget.mo3664a(eVar);
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        this.mLayoutWidget.mo3602a(i);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    /* access modifiers changed from: protected */
    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new C0686a(getContext(), this, i);
    }

    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void setMaxHeight(int i) {
        if (i != this.mMaxHeight) {
            this.mMaxHeight = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.mMaxWidth) {
            this.mMaxWidth = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.mMinHeight) {
            this.mMinHeight = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.mMinWidth) {
            this.mMinWidth = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(AbstractC0695c cVar) {
        this.mConstraintsChangedListener = cVar;
        C0686a aVar = this.mConstraintLayoutSpec;
        if (aVar != null) {
            aVar.mo3874a(cVar);
        }
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public final ConstraintWidget getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).an;
    }

    public void loadLayoutDescription(int i) {
        if (i != 0) {
            try {
                this.mConstraintLayoutSpec = new C0686a(getContext(), this, i);
            } catch (Resources.NotFoundException unused) {
                this.mConstraintLayoutSpec = null;
            }
        } else {
            this.mConstraintLayoutSpec = null;
        }
    }

    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    private final ConstraintWidget getTargetWidget(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View view = this.mChildrenByIds.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).an;
    }

    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.mChildrenByIds.remove(view.getId());
        this.mLayoutWidget.mo3748c(getViewWidget(view));
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public ConstraintLayout(Context context) {
        super(context);
        init(null, 0, 0);
    }

    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        ConstraintWidget viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof C0670f)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.an = new C0670f();
            layoutParams.f2808Z = true;
            ((C0670f) layoutParams.an).mo3602a(layoutParams.f2801S);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.mo3801c();
            ((LayoutParams) view.getLayoutParams()).aa = true;
            if (!this.mConstraintHelpers.contains(constraintHelper)) {
                this.mConstraintHelpers.add(constraintHelper);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.mConstraintHelpers.get(i).mo3086a(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i4 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = (float) i3;
                        float f2 = (float) i4;
                        float f3 = (float) (i3 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = (float) (i4 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.mDesignIds;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet, 0, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                } else if (getChildAt(i3).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                } else {
                    i3++;
                }
            }
        }
        if (!this.mDirtyHierarchy) {
            int i4 = this.mOnMeasureWidthMeasureSpec;
            if (i4 == i && this.mOnMeasureHeightMeasureSpec == i2) {
                resolveMeasuredDimension(i, i2, this.mLayoutWidget.mo3499A(), this.mLayoutWidget.mo3500B(), this.mLayoutWidget.mo3683i(), this.mLayoutWidget.mo3659X());
                return;
            } else if (i4 == i && View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.mOnMeasureHeightMeasureSpec) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i2) >= this.mLayoutWidget.mo3500B()) {
                this.mOnMeasureWidthMeasureSpec = i;
                this.mOnMeasureHeightMeasureSpec = i2;
                resolveMeasuredDimension(i, i2, this.mLayoutWidget.mo3499A(), this.mLayoutWidget.mo3500B(), this.mLayoutWidget.mo3683i(), this.mLayoutWidget.mo3659X());
                return;
            }
        }
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.mo3681g(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                this.mLayoutWidget.mo3678f();
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        resolveMeasuredDimension(i, i2, this.mLayoutWidget.mo3499A(), this.mLayoutWidget.mo3500B(), this.mLayoutWidget.mo3683i(), this.mLayoutWidget.mo3659X());
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    public void setState(int i, int i2, int i3) {
        C0686a aVar = this.mConstraintLayoutSpec;
        if (aVar != null) {
            aVar.mo3873a(i, (float) i2, (float) i3);
        }
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.mDesignIds.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet, i, 0);
    }

    private void init(AttributeSet attributeSet, int i, int i2) {
        this.mLayoutWidget.mo3538a(this);
        this.mLayoutWidget.mo3667a((C0642b.AbstractC0644b) this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{16842948, 16842965, 16842966, 16842967, 16842968, 16842969, 16842972, 16843039, 16843040, 16843071, 16843072, 16843699, 16843700, 16843840, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraintSet, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.layoutDescription, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_optimizationLevel}, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 9) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == 10) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == 7) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == 8) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == 90) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == 39) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0689b bVar = new C0689b();
                        this.mConstraintSet = bVar;
                        bVar.mo3900b(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.mo3602a(this.mOptimizationLevel);
    }

    public void resolveSystem(C0667d dVar, int i, int i2, int i3) {
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i5 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.mMeasurer.mo3848a(i2, i3, max, max2, paddingWidth, i5);
        if (Build.VERSION.SDK_INT >= 17) {
            int max3 = Math.max(0, getPaddingStart());
            int max4 = Math.max(0, getPaddingEnd());
            if (max3 <= 0 && max4 <= 0) {
                max3 = Math.max(0, getPaddingLeft());
            } else if (isRtl()) {
                max3 = max4;
            }
            i4 = max3;
        } else {
            i4 = Math.max(0, getPaddingLeft());
        }
        int i6 = size - paddingWidth;
        int i7 = size2 - i5;
        setSelfDimensionBehaviour(dVar, mode, i6, mode2, i7);
        dVar.mo3662a(i, mode, i6, mode2, i7, this.mLastMeasureWidth, this.mLastMeasureHeight, i4, max);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(attributeSet, i, i2);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.an;
            if ((childAt.getVisibility() != 8 || layoutParams.f2808Z || layoutParams.aa || layoutParams.ac || isInEditMode) && !layoutParams.ab) {
                int y = constraintWidget.mo3600y();
                int z2 = constraintWidget.mo3601z();
                int A = constraintWidget.mo3499A() + y;
                int B = constraintWidget.mo3500B() + z2;
                childAt.layout(y, z2, A, B);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(y, z2, A, B);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.mConstraintHelpers.get(i6).mo3087b(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setSelfDimensionBehaviour(C0667d dVar, int i, int i2, int i3, int i4) {
        int i5 = this.mMeasurer.f2840e;
        int i6 = this.mMeasurer.f2839d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        int childCount = getChildCount();
        if (i != Integer.MIN_VALUE) {
            if (i == 0) {
                dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (childCount == 0) {
                    i2 = Math.max(0, this.mMinWidth);
                }
            } else if (i == 1073741824) {
                i2 = Math.min(this.mMaxWidth - i6, i2);
            }
            i2 = 0;
        } else {
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.mMinWidth);
            }
        }
        if (i3 != Integer.MIN_VALUE) {
            if (i3 == 0) {
                dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (childCount == 0) {
                    i4 = Math.max(0, this.mMinHeight);
                }
            } else if (i3 == 1073741824) {
                i4 = Math.min(this.mMaxHeight - i5, i4);
            }
            i4 = 0;
        } else {
            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.mMinHeight);
            }
        }
        if (!(i2 == dVar.mo3499A() && i4 == dVar.mo3500B())) {
            dVar.mo3675c();
        }
        dVar.mo3576m(0);
        dVar.mo3578n(0);
        dVar.mo3568h(this.mMaxWidth - i6);
        dVar.mo3569i(this.mMaxHeight - i5);
        dVar.mo3584q(0);
        dVar.mo3586r(0);
        dVar.mo3534a(dimensionBehaviour);
        dVar.mo3579o(i2);
        dVar.mo3548b(dimensionBehaviour2);
        dVar.mo3581p(i4);
        dVar.mo3584q(this.mMinWidth - i6);
        dVar.mo3586r(this.mMinHeight - i5);
    }

    public void applyConstraintsFromLayoutParams(boolean z, View view, ConstraintWidget constraintWidget, LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        int i;
        int i2;
        float f;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5;
        layoutParams.mo3845b();
        layoutParams.ao = false;
        constraintWidget.mo3570j(view.getVisibility());
        if (layoutParams.ab) {
            constraintWidget.mo3558d(true);
            constraintWidget.mo3570j(8);
        }
        constraintWidget.mo3538a(view);
        if (view instanceof ConstraintHelper) {
            ((ConstraintHelper) view).mo3061a(constraintWidget, this.mLayoutWidget.mo3660Y());
        }
        if (layoutParams.f2808Z) {
            C0670f fVar = (C0670f) constraintWidget;
            int i3 = layoutParams.ak;
            int i4 = layoutParams.al;
            float f2 = layoutParams.am;
            if (Build.VERSION.SDK_INT < 17) {
                i3 = layoutParams.f2809a;
                i4 = layoutParams.f2810b;
                f2 = layoutParams.f2811c;
            }
            if (f2 != -1.0f) {
                fVar.mo3715e(f2);
            } else if (i3 != -1) {
                fVar.mo3713b(i3);
            } else if (i4 != -1) {
                fVar.mo3719y(i4);
            }
        } else {
            int i5 = layoutParams.ad;
            int i6 = layoutParams.ae;
            int i7 = layoutParams.af;
            int i8 = layoutParams.ag;
            int i9 = layoutParams.ah;
            int i10 = layoutParams.f175414ai;
            float f3 = layoutParams.aj;
            if (Build.VERSION.SDK_INT < 17) {
                i5 = layoutParams.f2812d;
                int i11 = layoutParams.f2813e;
                int i12 = layoutParams.f2814f;
                i8 = layoutParams.f2815g;
                int i13 = layoutParams.f2828t;
                int i14 = layoutParams.f2830v;
                f3 = layoutParams.f2834z;
                if (i5 == -1 && i11 == -1) {
                    if (layoutParams.f2825q != -1) {
                        i5 = layoutParams.f2825q;
                    } else if (layoutParams.f2824p != -1) {
                        i11 = layoutParams.f2824p;
                    }
                }
                if (i12 == -1 && i8 == -1) {
                    if (layoutParams.f2826r != -1) {
                        i12 = layoutParams.f2826r;
                    } else if (layoutParams.f2827s != -1) {
                        i8 = layoutParams.f2827s;
                    }
                }
                i2 = i12;
                i = i14;
                i9 = i13;
                i6 = i11;
            } else {
                i = i10;
                i2 = i7;
            }
            if (layoutParams.f2821m != -1) {
                ConstraintWidget constraintWidget6 = sparseArray.get(layoutParams.f2821m);
                if (constraintWidget6 != null) {
                    constraintWidget.mo3535a(constraintWidget6, layoutParams.f2823o, layoutParams.f2822n);
                }
            } else {
                if (i5 != -1) {
                    ConstraintWidget constraintWidget7 = sparseArray.get(i5);
                    if (constraintWidget7 != null) {
                        f = f3;
                        constraintWidget.mo3532a(ConstraintAnchor.Type.LEFT, constraintWidget7, ConstraintAnchor.Type.LEFT, layoutParams.leftMargin, i9);
                    } else {
                        f = f3;
                    }
                } else {
                    f = f3;
                    if (!(i6 == -1 || (constraintWidget5 = sparseArray.get(i6)) == null)) {
                        constraintWidget.mo3532a(ConstraintAnchor.Type.LEFT, constraintWidget5, ConstraintAnchor.Type.RIGHT, layoutParams.leftMargin, i9);
                    }
                }
                if (i2 != -1) {
                    ConstraintWidget constraintWidget8 = sparseArray.get(i2);
                    if (constraintWidget8 != null) {
                        constraintWidget.mo3532a(ConstraintAnchor.Type.RIGHT, constraintWidget8, ConstraintAnchor.Type.LEFT, layoutParams.rightMargin, i);
                    }
                } else if (!(i8 == -1 || (constraintWidget4 = sparseArray.get(i8)) == null)) {
                    constraintWidget.mo3532a(ConstraintAnchor.Type.RIGHT, constraintWidget4, ConstraintAnchor.Type.RIGHT, layoutParams.rightMargin, i);
                }
                if (layoutParams.f2816h != -1) {
                    ConstraintWidget constraintWidget9 = sparseArray.get(layoutParams.f2816h);
                    if (constraintWidget9 != null) {
                        constraintWidget.mo3532a(ConstraintAnchor.Type.TOP, constraintWidget9, ConstraintAnchor.Type.TOP, layoutParams.topMargin, layoutParams.f2829u);
                    }
                } else if (!(layoutParams.f2817i == -1 || (constraintWidget3 = sparseArray.get(layoutParams.f2817i)) == null)) {
                    constraintWidget.mo3532a(ConstraintAnchor.Type.TOP, constraintWidget3, ConstraintAnchor.Type.BOTTOM, layoutParams.topMargin, layoutParams.f2829u);
                }
                if (layoutParams.f2818j != -1) {
                    ConstraintWidget constraintWidget10 = sparseArray.get(layoutParams.f2818j);
                    if (constraintWidget10 != null) {
                        constraintWidget.mo3532a(ConstraintAnchor.Type.BOTTOM, constraintWidget10, ConstraintAnchor.Type.TOP, layoutParams.bottomMargin, layoutParams.f2831w);
                    }
                } else if (!(layoutParams.f2819k == -1 || (constraintWidget2 = sparseArray.get(layoutParams.f2819k)) == null)) {
                    constraintWidget.mo3532a(ConstraintAnchor.Type.BOTTOM, constraintWidget2, ConstraintAnchor.Type.BOTTOM, layoutParams.bottomMargin, layoutParams.f2831w);
                }
                if (layoutParams.f2820l != -1) {
                    View view2 = this.mChildrenByIds.get(layoutParams.f2820l);
                    ConstraintWidget constraintWidget11 = sparseArray.get(layoutParams.f2820l);
                    if (!(constraintWidget11 == null || view2 == null || !(view2.getLayoutParams() instanceof LayoutParams))) {
                        LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
                        layoutParams.f2807Y = true;
                        layoutParams2.f2807Y = true;
                        constraintWidget.mo3522a(ConstraintAnchor.Type.BASELINE).mo3483a(constraintWidget11.mo3522a(ConstraintAnchor.Type.BASELINE), 0, -1, true);
                        constraintWidget.mo3554c(true);
                        layoutParams2.an.mo3554c(true);
                        constraintWidget.mo3522a(ConstraintAnchor.Type.TOP).mo3495l();
                        constraintWidget.mo3522a(ConstraintAnchor.Type.BOTTOM).mo3495l();
                    }
                }
                if (f >= BitmapDescriptorFactory.HUE_RED) {
                    constraintWidget.mo3523a(f);
                }
                if (layoutParams.f2783A >= BitmapDescriptorFactory.HUE_RED) {
                    constraintWidget.mo3544b(layoutParams.f2783A);
                }
            }
            if (z && !(layoutParams.f2799Q == -1 && layoutParams.f2800R == -1)) {
                constraintWidget.mo3557d(layoutParams.f2799Q, layoutParams.f2800R);
            }
            if (layoutParams.f2805W) {
                constraintWidget.mo3534a(ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidget.mo3579o(layoutParams.width);
                if (layoutParams.width == -2) {
                    constraintWidget.mo3534a(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                }
            } else if (layoutParams.width == -1) {
                if (layoutParams.f2802T) {
                    constraintWidget.mo3534a(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                } else {
                    constraintWidget.mo3534a(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                }
                constraintWidget.mo3522a(ConstraintAnchor.Type.LEFT).f2524d = layoutParams.leftMargin;
                constraintWidget.mo3522a(ConstraintAnchor.Type.RIGHT).f2524d = layoutParams.rightMargin;
            } else {
                constraintWidget.mo3534a(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                constraintWidget.mo3579o(0);
            }
            if (layoutParams.f2806X) {
                constraintWidget.mo3548b(ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidget.mo3581p(layoutParams.height);
                if (layoutParams.height == -2) {
                    constraintWidget.mo3548b(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                }
            } else if (layoutParams.height == -1) {
                if (layoutParams.f2803U) {
                    constraintWidget.mo3548b(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                } else {
                    constraintWidget.mo3548b(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                }
                constraintWidget.mo3522a(ConstraintAnchor.Type.TOP).f2524d = layoutParams.topMargin;
                constraintWidget.mo3522a(ConstraintAnchor.Type.BOTTOM).f2524d = layoutParams.bottomMargin;
            } else {
                constraintWidget.mo3548b(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                constraintWidget.mo3581p(0);
            }
            constraintWidget.mo3549b(layoutParams.f2784B);
            constraintWidget.mo3552c(layoutParams.f2787E);
            constraintWidget.mo3555d(layoutParams.f2788F);
            constraintWidget.mo3589t(layoutParams.f2789G);
            constraintWidget.mo3593u(layoutParams.f2790H);
            constraintWidget.mo3525a(layoutParams.f2791I, layoutParams.f2793K, layoutParams.f2795M, layoutParams.f2797O);
            constraintWidget.mo3546b(layoutParams.f2792J, layoutParams.f2794L, layoutParams.f2796N, layoutParams.f2798P);
        }
    }

    public void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        int i5 = this.mMeasurer.f2840e;
        int i6 = i3 + this.mMeasurer.f2839d;
        int i7 = i4 + i5;
        if (Build.VERSION.SDK_INT >= 11) {
            int resolveSizeAndState = resolveSizeAndState(i6, i, 0);
            int min = Math.min(this.mMaxWidth, resolveSizeAndState & 16777215);
            int min2 = Math.min(this.mMaxHeight, resolveSizeAndState(i7, i2, 0) & 16777215);
            if (z) {
                min |= 16777216;
            }
            if (z2) {
                min2 |= 16777216;
            }
            setMeasuredDimension(min, min2);
            this.mLastMeasureWidth = min;
            this.mLastMeasureHeight = min2;
            return;
        }
        setMeasuredDimension(i6, i7);
        this.mLastMeasureWidth = i6;
        this.mLastMeasureHeight = i7;
    }
}
