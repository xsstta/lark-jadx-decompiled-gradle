package com.larksuite.component.universe_design.timepicker.impl.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.C0917s;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 ¯\u00012\u00020\u0001:\u0006®\u0001¯\u0001°\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J \u0010f\u001a\u00020\u00142\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010g\u001a\u00020\u0014H\u0002J\u0006\u0010h\u001a\u00020iJ\u000e\u0010j\u001a\u00020i2\u0006\u0010k\u001a\u00020\u0010J\u0010\u0010l\u001a\u00020i2\u0006\u0010m\u001a\u00020nH\u0002J-\u0010o\u001a\u00020i2\u0006\u0010m\u001a\u00020n2\u0006\u0010p\u001a\u00020\u00102\u000e\u0010q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0FH\u0002¢\u0006\u0002\u0010rJ\b\u0010s\u001a\u00020\u0010H\u0014J\u0012\u0010t\u001a\u0002072\b\u0010u\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010v\u001a\u00020\u00142\u0006\u0010w\u001a\u00020\u0014H\u0002J\u0010\u0010x\u001a\u00020\u00102\u0006\u0010y\u001a\u00020\u0010H\u0002J\b\u0010z\u001a\u00020\u0010H\u0014J\b\u0010{\u001a\u00020iH\u0002J\u0010\u0010|\u001a\u00020i2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010}\u001a\u00020iH\u0002J\b\u0010~\u001a\u00020iH\u0002J\b\u0010\u001a\u00020iH\u0014J\u0011\u0010\u0001\u001a\u00020i2\u0006\u0010m\u001a\u00020nH\u0014J\u0013\u0010\u0001\u001a\u00020$2\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u0007\u0010\u0001\u001a\u00020iJ6\u0010\u0001\u001a\u00020i2\u0007\u0010\u0001\u001a\u00020$2\u0007\u0010\u0001\u001a\u00020\u00142\u0007\u0010\u0001\u001a\u00020\u00142\u0007\u0010\u0001\u001a\u00020\u00142\u0007\u0010\u0001\u001a\u00020\u0014H\u0014J\u001a\u0010\u0001\u001a\u00020i2\u0006\u0010e\u001a\u00020\u00142\u0007\u0010\u0001\u001a\u00020\u0014H\u0014J\u0013\u0010\u0001\u001a\u00020$2\b\u0010\u0001\u001a\u00030\u0001H\u0016J\t\u0010\u0001\u001a\u00020iH\u0002J\u0010\u0010\u0001\u001a\u00020i2\u0007\u0010\u0001\u001a\u00020\u0010J\u0007\u0010\u0001\u001a\u00020iJ\u0010\u0010\u0001\u001a\u00020i2\u0007\u0010\u0001\u001a\u00020$J\u000f\u0010\u0001\u001a\u00020i2\u0006\u0010\u0019\u001a\u00020\u0014J\u000f\u0010\u0001\u001a\u00020i2\u0006\u0010\u001a\u001a\u00020\u0014J\u0011\u0010\u0001\u001a\u00020i2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010\u0001\u001a\u00020i2\u0007\u0010\u0001\u001a\u00020\u0014J\u0011\u0010\u0001\u001a\u00020i2\b\u00106\u001a\u0004\u0018\u000107J\u0012\u0010\u0001\u001a\u00020i2\t\u0010\u0001\u001a\u0004\u0018\u00010AJ\u0012\u0010\u0001\u001a\u00020i2\t\u0010\u0001\u001a\u0004\u0018\u00010.J\u0010\u0010\u0001\u001a\u00020i2\u0007\u0010\u0001\u001a\u00020$J\u000f\u0010 \u0001\u001a\u00020i2\u0006\u0010V\u001a\u00020\u0014J\u0010\u0010¡\u0001\u001a\u00020i2\u0007\u0010¢\u0001\u001a\u00020\u0010J\u0010\u0010£\u0001\u001a\u00020i2\u0007\u0010¢\u0001\u001a\u00020\u0010J\u0010\u0010¤\u0001\u001a\u00020i2\u0007\u0010¥\u0001\u001a\u00020\\J\u0011\u0010¦\u0001\u001a\u00020i2\b\u0010§\u0001\u001a\u00030¨\u0001J\u001d\u0010©\u0001\u001a\u00020i2\u0007\u0010ª\u0001\u001a\u00020\u00102\t\u0010«\u0001\u001a\u0004\u0018\u00010\tH\u0002J+\u0010¬\u0001\u001a\u00020\u00102\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\b2\u000e\u0010q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0FH\u0002¢\u0006\u0003\u0010­\u0001R8\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\b2\u0010\u0010\u0007\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108BX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00148F@FX\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001a\u0010#\u001a\u00020$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010%\"\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0012\"\u0004\b+\u0010,R\u001c\u0010-\u001a\u0004\u0018\u00010.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0011\u00103\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b4\u0010\u0016R\u000e\u00105\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u000e¢\u0006\u0002\n\u0000R\u0016\u00108\u001a\n :*\u0004\u0018\u00010909X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010;\u001a\b\u0012\u0002\b\u0003\u0018\u00010<X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020?X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010@\u001a\u0004\u0018\u00010AX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R$\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0FX\u000e¢\u0006\u0010\n\u0002\u0010K\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u000e\u0010L\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010N\u001a\u0004\u0018\u00010OX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010P\u001a\u0004\u0018\u00010OX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010Q\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0016\"\u0004\bS\u0010\u0018R\u000e\u0010T\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010X\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u0012\"\u0004\bZ\u0010,R\u0016\u0010[\u001a\n :*\u0004\u0018\u00010\\0\\X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010]\u001a\u00020^X.¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u000e\u0010c\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006±\u0001"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/base/WheelView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "Lcom/larksuite/component/universe_design/timepicker/impl/base/BaseWheelAdapter;", "", "adapter", "getAdapter", "()Lcom/larksuite/component/universe_design/timepicker/impl/base/BaseWheelAdapter;", "setAdapter", "(Lcom/larksuite/component/universe_design/timepicker/impl/base/BaseWheelAdapter;)V", "centerTextBaseLine", "", "getCenterTextBaseLine", "()F", "currentItem", "", "getCurrentItem", "()I", "setCurrentItem", "(I)V", "dividerColor", "dividerExtraStart", "dividerType", "Lcom/larksuite/component/universe_design/timepicker/impl/base/WheelView$DividerType;", "firstLineY", "gestureDetector", "Landroid/view/GestureDetector;", "initPosition", "getInitPosition", "setInitPosition", "isLoop", "", "()Z", "setLoop", "(Z)V", "isScrollChangeDrawn", "itemHeight", "getItemHeight", "setItemHeight", "(F)V", "itemSelectedListener", "Lcom/larksuite/component/universe_design/timepicker/impl/base/OnItemSelectedListener;", "getItemSelectedListener", "()Lcom/larksuite/component/universe_design/timepicker/impl/base/OnItemSelectedListener;", "setItemSelectedListener", "(Lcom/larksuite/component/universe_design/timepicker/impl/base/OnItemSelectedListener;)V", "itemsCount", "getItemsCount", "itemsVisible", "label", "", "mExecutor", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "mFuture", "Ljava/util/concurrent/ScheduledFuture;", "mLastDownEventY", "mLastDownTime", "", "mLoopChangeListener", "Lcom/larksuite/component/universe_design/timepicker/impl/base/ILoopChangeListener;", "mOffset", "mScaledVerticalScrollFactor", "mShowTwoFigure", "mVisibleItems", "", "getMVisibleItems", "()[Ljava/lang/Object;", "setMVisibleItems", "([Ljava/lang/Object;)V", "[Ljava/lang/Object;", "maxTextHeight", "outTextSize", "paintCenterText", "Landroid/graphics/Paint;", "paintIndicator", "preCurrentIndex", "getPreCurrentIndex", "setPreCurrentIndex", "secondLineY", "selectedItemIndex", "textColorCenter", "textSize", "totalScrollY", "getTotalScrollY", "setTotalScrollY", "typeface", "Landroid/graphics/Typeface;", "wheelHandler", "Landroid/os/Handler;", "getWheelHandler", "()Landroid/os/Handler;", "setWheelHandler", "(Landroid/os/Handler;)V", "wheelMeasuredHeight", "wheelMeasuredWidth", "widthMeasureSpec", "calculateLoopNextIndex", "nextCurrentIndex", "cancelFuture", "", "checkLoopChange", "scrollDy", "drawDivider", "canvas", "Landroid/graphics/Canvas;", "drawWheelContent", "itemHeightOffset", "visibleItems", "(Landroid/graphics/Canvas;F[Ljava/lang/Object;)V", "getBottomFadingEdgeStrength", "getContentText", "item", "getLoopMappingIndex", "index", "getScaleTextSize", "translateY", "getTopFadingEdgeStrength", "initPaints", "initView", "initializeFadingEdges", "measureTextWidthHeight", "onDetachedFromWindow", "onDraw", "onGenericMotionEvent", "event", "Landroid/view/MotionEvent;", "onItemSelected", "onLayout", "changed", "left", "top", "right", "bottom", "onMeasure", "heightMeasureSpec", "onTouchEvent", "remeasure", "scrollBy", "velocityY", "selectCurrentItem", "setCyclic", "cyclic", "setDividerColor", "setDividerExtraStart", "setDividerType", "setItemVisible", "itemVisible", "setLabel", "setLoopChangeListener", "listener", "setOnItemSelectedListener", "onItemSelectedListener", "setShowTwoFigure", "showTwoFigure", "setTextColorCenter", "setTextSize", "dpSize", "setTextSizeOuter", "setTypeface", "font", "smoothScroll", "action", "Lcom/larksuite/component/universe_design/timepicker/impl/base/WheelView$ACTION;", "updateSelectedItem", "itemCenterY", "visibleItem", "updateVisibleItems", "(Lcom/larksuite/component/universe_design/timepicker/impl/base/BaseWheelAdapter;[Ljava/lang/Object;)F", "ACTION", "Companion", "DividerType", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
public class WheelView extends View {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private BaseWheelAdapter<? extends Object> adapter;
    private int dividerColor;
    private int dividerExtraStart;
    private DividerType dividerType;
    private float firstLineY;
    private GestureDetector gestureDetector;
    private int initPosition;
    private boolean isLoop;
    private boolean isScrollChangeDrawn;
    private float itemHeight;
    private OnItemSelectedListener itemSelectedListener;
    private int itemsVisible;
    private String label;
    private final ScheduledExecutorService mExecutor;
    private ScheduledFuture<?> mFuture;
    private float mLastDownEventY;
    private long mLastDownTime;
    public ILoopChangeListener mLoopChangeListener;
    private float mOffset;
    private final float mScaledVerticalScrollFactor;
    private boolean mShowTwoFigure;
    private Object[] mVisibleItems;
    private int maxTextHeight;
    private float outTextSize;
    private Paint paintCenterText;
    private Paint paintIndicator;
    private int preCurrentIndex;
    private float secondLineY;
    private int selectedItemIndex;
    private int textColorCenter;
    private float textSize;
    private float totalScrollY;
    private Typeface typeface;
    public Handler wheelHandler;
    private int wheelMeasuredHeight;
    private int wheelMeasuredWidth;
    private int widthMeasureSpec;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/base/WheelView$ACTION;", "", "(Ljava/lang/String;I)V", "CLICK", "FLING", "DAGGLE", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ACTION {
        CLICK,
        FLING,
        DAGGLE
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/base/WheelView$DividerType;", "", "(Ljava/lang/String;I)V", "FILL", "EXTRA", "NONE", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum DividerType {
        FILL,
        EXTRA,
        NONE
    }

    public WheelView(Context context) {
        this(context, null, 2, null);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/base/WheelView$Companion;", "", "()V", "DEFAULT_WHEEL_CENTER_TEXT_SIZE_DP", "", "DEFAULT_WHEEL_OUTER_TEXT_SIZE_DP", "IGNORE_SCROLL_OFFSET_THRESHOLD", "", "TAG", "", "TOP_AND_BOTTOM_FADING_EDGE_STRENGTH", "VELOCITY_FLING", "WHEEL_ITEM_HEIGHT", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.timepicker.impl.base.WheelView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final BaseWheelAdapter<? extends Object> getAdapter() {
        return this.adapter;
    }

    public final int getCurrentItem() {
        return this.selectedItemIndex;
    }

    public final int getInitPosition() {
        return this.initPosition;
    }

    public final float getItemHeight() {
        return this.itemHeight;
    }

    public final OnItemSelectedListener getItemSelectedListener() {
        return this.itemSelectedListener;
    }

    /* access modifiers changed from: protected */
    public final Object[] getMVisibleItems() {
        return this.mVisibleItems;
    }

    public final int getPreCurrentIndex() {
        return this.preCurrentIndex;
    }

    public final float getTotalScrollY() {
        return this.totalScrollY;
    }

    public final boolean isLoop() {
        return this.isLoop;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cancelFuture();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.timepicker.impl.base.WheelView$b */
    public static final class RunnableC25791b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WheelView f63722a;

        RunnableC25791b(WheelView wheelView) {
            this.f63722a = wheelView;
        }

        public final void run() {
            ILoopChangeListener bVar = this.f63722a.mLoopChangeListener;
            if (bVar != null) {
                bVar.mo91557a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/larksuite/component/universe_design/timepicker/impl/base/WheelView$onItemSelected$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.timepicker.impl.base.WheelView$c */
    public static final class RunnableC25792c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ OnItemSelectedListener f63723a;

        /* renamed from: b */
        final /* synthetic */ WheelView f63724b;

        RunnableC25792c(OnItemSelectedListener onItemSelectedListener, WheelView wheelView) {
            this.f63723a = onItemSelectedListener;
            this.f63724b = wheelView;
        }

        public final void run() {
            this.f63723a.onItemSelected(this.f63724b.getCurrentItem());
        }
    }

    private final void initializeFadingEdges() {
        setVerticalFadingEdgeEnabled(true);
        setFadingEdgeLength((int) this.firstLineY);
    }

    public final int getItemsCount() {
        BaseWheelAdapter<? extends Object> aVar = this.adapter;
        if (aVar != null) {
            return aVar.mo91448a();
        }
        return 0;
    }

    public final Handler getWheelHandler() {
        Handler handler = this.wheelHandler;
        if (handler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("wheelHandler");
        }
        return handler;
    }

    public final void onItemSelected() {
        OnItemSelectedListener onItemSelectedListener = this.itemSelectedListener;
        if (onItemSelectedListener != null) {
            post(new RunnableC25792c(onItemSelectedListener, this));
        }
    }

    public final void selectCurrentItem() {
        OnItemSelectedListener onItemSelectedListener = this.itemSelectedListener;
        if (onItemSelectedListener != null) {
            onItemSelectedListener.onItemSelected(getCurrentItem());
        }
    }

    private final float getCenterTextBaseLine() {
        Paint.FontMetrics fontMetrics;
        Paint paint = this.paintCenterText;
        if (paint == null || (fontMetrics = paint.getFontMetrics()) == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return ((fontMetrics.bottom - fontMetrics.top) / ((float) 2)) - fontMetrics.bottom;
    }

    public final synchronized void cancelFuture() {
        ScheduledFuture<?> scheduledFuture = this.mFuture;
        if (scheduledFuture != null && (scheduledFuture == null || !scheduledFuture.isCancelled())) {
            ScheduledFuture<?> scheduledFuture2 = this.mFuture;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(true);
            }
            this.mFuture = null;
        }
    }

    private final void initPaints() {
        Paint paint = new Paint();
        paint.setColor(this.textColorCenter);
        paint.setAntiAlias(true);
        paint.setTypeface(paint.getTypeface());
        paint.setTextSize(paint.getTextSize());
        paint.setTextAlign(Paint.Align.CENTER);
        this.paintCenterText = paint;
        Paint paint2 = new Paint();
        paint2.setColor(this.dividerColor);
        paint2.setAntiAlias(true);
        this.paintIndicator = paint2;
    }

    private final void measureTextWidthHeight() {
        Paint paint = this.paintCenterText;
        if (paint != null) {
            paint.setTextSize(this.textSize);
        }
        Rect rect = new Rect();
        Paint paint2 = this.paintCenterText;
        if (paint2 != null) {
            paint2.getTextBounds("星期", 0, 2, rect);
        }
        this.maxTextHeight = rect.height() + 2;
    }

    private final void remeasure() {
        int i;
        if (this.adapter != null) {
            measureTextWidthHeight();
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            float a = UDDimenUtils.m93308a(context, 48);
            this.itemHeight = a;
            this.wheelMeasuredHeight = (int) (a * ((float) (this.itemsVisible - 2)));
            this.wheelMeasuredWidth = View.MeasureSpec.getSize(this.widthMeasureSpec);
            int i2 = this.wheelMeasuredHeight;
            float f = this.itemHeight;
            this.firstLineY = (((float) i2) - f) / 2.0f;
            this.secondLineY = (((float) i2) + f) / 2.0f;
            if (this.initPosition == -1) {
                BaseWheelAdapter<? extends Object> aVar = this.adapter;
                if (!this.isLoop || aVar == null) {
                    i = 0;
                } else {
                    i = (aVar.mo91448a() + 1) / 2;
                }
                this.initPosition = i;
                this.preCurrentIndex = i;
            }
        }
    }

    public final void setCyclic(boolean z) {
        this.isLoop = z;
    }

    public final void setDividerExtraStart(int i) {
        this.dividerExtraStart = i;
    }

    public final void setDividerType(DividerType dividerType2) {
        this.dividerType = dividerType2;
    }

    public final void setInitPosition(int i) {
        this.initPosition = i;
    }

    public final void setItemHeight(float f) {
        this.itemHeight = f;
    }

    public final void setItemSelectedListener(OnItemSelectedListener onItemSelectedListener) {
        this.itemSelectedListener = onItemSelectedListener;
    }

    public final void setLabel(String str) {
        this.label = str;
    }

    public final void setLoop(boolean z) {
        this.isLoop = z;
    }

    public final void setLoopChangeListener(ILoopChangeListener bVar) {
        this.mLoopChangeListener = bVar;
    }

    public final void setOnItemSelectedListener(OnItemSelectedListener onItemSelectedListener) {
        this.itemSelectedListener = onItemSelectedListener;
    }

    public final void setPreCurrentIndex(int i) {
        this.preCurrentIndex = i;
    }

    public final void setShowTwoFigure(boolean z) {
        this.mShowTwoFigure = z;
    }

    public final void setTotalScrollY(float f) {
        this.totalScrollY = f;
    }

    public final void setAdapter(BaseWheelAdapter<? extends Object> aVar) {
        this.adapter = aVar;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void setMVisibleItems(Object[] objArr) {
        Intrinsics.checkParameterIsNotNull(objArr, "<set-?>");
        this.mVisibleItems = objArr;
    }

    public final void setWheelHandler(Handler handler) {
        Intrinsics.checkParameterIsNotNull(handler, "<set-?>");
        this.wheelHandler = handler;
    }

    public final void setCurrentItem(int i) {
        this.selectedItemIndex = i;
        this.initPosition = i;
        this.totalScrollY = BitmapDescriptorFactory.HUE_RED;
        invalidate();
    }

    public final void setDividerColor(int i) {
        if (i != 0) {
            this.dividerColor = i;
            Paint paint = this.paintIndicator;
            if (paint != null) {
                paint.setColor(i);
            }
        }
    }

    public final void setItemVisible(int i) {
        if (i != this.itemsVisible) {
            this.mVisibleItems = new Object[i];
        }
        this.itemsVisible = i;
        requestLayout();
    }

    public final void setTextColorCenter(int i) {
        if (i != 0) {
            this.textColorCenter = i;
            Paint paint = this.paintCenterText;
            if (paint != null) {
                paint.setColor(i);
            }
        }
    }

    public final void setTypeface(Typeface typeface2) {
        Intrinsics.checkParameterIsNotNull(typeface2, "font");
        this.typeface = typeface2;
        Paint paint = this.paintCenterText;
        if (paint != null) {
            paint.setTypeface(typeface2);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        BaseWheelAdapter<? extends Object> aVar = this.adapter;
        if (aVar != null) {
            Object[] objArr = this.mVisibleItems;
            float updateVisibleItems = updateVisibleItems(aVar, objArr);
            drawDivider(canvas);
            drawWheelContent(canvas, updateVisibleItems, objArr);
        }
    }

    public final void scrollBy(float f) {
        cancelFuture();
        this.mFuture = this.mExecutor.scheduleWithFixedDelay(new InertiaTask(this, f), 0, (long) 5, TimeUnit.MILLISECONDS);
    }

    public final void setTextSize(float f) {
        if (f > BitmapDescriptorFactory.HUE_RED) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            float a = UDDimenUtils.m93307a(context, f);
            this.textSize = a;
            Paint paint = this.paintCenterText;
            if (paint != null) {
                paint.setTextSize(a);
            }
        }
    }

    public final void setTextSizeOuter(float f) {
        if (f > BitmapDescriptorFactory.HUE_RED) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            this.outTextSize = UDDimenUtils.m93307a(context, f);
        }
    }

    private final String getContentText(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof IPickerViewData) {
            return ((IPickerViewData) obj).mo91459a();
        }
        if (!(obj instanceof Integer) || !this.mShowTwoFigure) {
            return obj.toString();
        }
        StringCompanionObject mVar = StringCompanionObject.f173215a;
        Locale locale = Locale.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
        String format = String.format(locale, "%02d", Arrays.copyOf(new Object[]{obj}, 1));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    private final int getLoopMappingIndex(int i) {
        BaseWheelAdapter<? extends Object> aVar = this.adapter;
        if (aVar == null || aVar.mo91448a() <= 0) {
            return 0;
        }
        if (i < 0) {
            return getLoopMappingIndex(i + aVar.mo91448a());
        }
        if (i > aVar.mo91448a() - 1) {
            return getLoopMappingIndex(i - aVar.mo91448a());
        }
        return i;
    }

    private final float getScaleTextSize(float f) {
        float f2 = this.textSize;
        return Math.min(Math.max(f2 - (Math.abs(f - (((float) this.wheelMeasuredHeight) / 2.0f)) * ((f2 - this.outTextSize) / this.itemHeight)), this.outTextSize), this.textSize);
    }

    private final void initView(Context context) {
        this.wheelHandler = new MessageHandler(this);
        GestureDetector gestureDetector2 = new GestureDetector(context, new LoopViewGestureListener(this));
        this.gestureDetector = gestureDetector2;
        if (gestureDetector2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gestureDetector");
        }
        gestureDetector2.setIsLongpressEnabled(false);
        this.isLoop = true;
        this.totalScrollY = BitmapDescriptorFactory.HUE_RED;
        this.initPosition = -1;
        initPaints();
    }

    public final void smoothScroll(ACTION action) {
        float f;
        Intrinsics.checkParameterIsNotNull(action, "action");
        cancelFuture();
        if (action == ACTION.FLING || action == ACTION.DAGGLE) {
            float f2 = this.totalScrollY;
            float f3 = this.itemHeight;
            float f4 = ((f2 % f3) + f3) % f3;
            this.mOffset = f4;
            if (f4 > f3 / 2.0f) {
                f = f3 - f4;
            } else {
                f = -f4;
            }
            this.mOffset = f;
        }
        this.mFuture = this.mExecutor.scheduleWithFixedDelay(new SmoothScrollTask(this, this.mOffset), 0, 10, TimeUnit.MILLISECONDS);
    }

    private final void drawDivider(Canvas canvas) {
        float f;
        Paint paint = this.paintIndicator;
        if (paint == null) {
            return;
        }
        if (this.dividerType == DividerType.EXTRA) {
            float f2 = (float) this.dividerExtraStart;
            int i = this.wheelMeasuredWidth;
            if (f2 > ((float) i) || f2 < ((float) 0)) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = f2;
            }
            float f3 = ((float) i) - f;
            float f4 = this.firstLineY;
            canvas.drawLine(f, f4, f3, f4, paint);
            float f5 = this.secondLineY;
            canvas.drawLine(f, f5, f3, f5, paint);
        } else if (this.dividerType == DividerType.FILL) {
            float f6 = this.firstLineY;
            canvas.drawLine(BitmapDescriptorFactory.HUE_RED, f6, (float) this.wheelMeasuredWidth, f6, paint);
            float f7 = this.secondLineY;
            canvas.drawLine(BitmapDescriptorFactory.HUE_RED, f7, (float) this.wheelMeasuredWidth, f7, paint);
        }
    }

    public final void checkLoopChange(float f) {
        BaseWheelAdapter<? extends Object> aVar = this.adapter;
        if (aVar != null && this.isLoop && this.mLoopChangeListener != null) {
            int a = this.initPosition + (((int) (this.totalScrollY / this.itemHeight)) % aVar.mo91448a());
            float f2 = this.totalScrollY % this.itemHeight;
            if (Math.abs(f2) > this.itemHeight - ((float) 10)) {
                if (f2 > ((float) 0)) {
                    a++;
                } else {
                    a--;
                }
            }
            int calculateLoopNextIndex = calculateLoopNextIndex(aVar, a);
            boolean z = true;
            if (f <= ((float) 0) ? calculateLoopNextIndex <= this.preCurrentIndex : calculateLoopNextIndex >= this.preCurrentIndex) {
                z = false;
            }
            if (z && this.mLoopChangeListener != null && this.isScrollChangeDrawn) {
                this.isScrollChangeDrawn = false;
                post(new RunnableC25791b(this));
            }
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        GestureDetector gestureDetector2 = this.gestureDetector;
        if (gestureDetector2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gestureDetector");
        }
        boolean onTouchEvent = gestureDetector2.onTouchEvent(motionEvent);
        if (motionEvent.isFromSource(2) && motionEvent.getAction() == 8) {
            float f = (-motionEvent.getAxisValue(9)) * this.mScaledVerticalScrollFactor;
            this.totalScrollY += f;
            BaseWheelAdapter<? extends Object> aVar = this.adapter;
            if (!this.isLoop && aVar != null) {
                float f2 = ((float) (-this.initPosition)) * this.itemHeight;
                float f3 = this.itemHeight;
                float a = ((float) ((aVar.mo91448a() - 1) - this.initPosition)) * f3;
                float f4 = this.totalScrollY;
                if (((double) f4) - (((double) f3) * 0.25d) < ((double) f2)) {
                    f2 = f4 - f;
                } else if (((double) f4) + (((double) f3) * 0.25d) > ((double) a)) {
                    a = f4 - f;
                }
                if (f4 < f2) {
                    this.totalScrollY = f2;
                } else if (f4 > a) {
                    this.totalScrollY = a;
                }
            }
            checkLoopChange(f);
            if (!onTouchEvent) {
                smoothScroll(ACTION.DAGGLE);
                return true;
            }
        }
        invalidate();
        return super.onGenericMotionEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        GestureDetector gestureDetector2 = this.gestureDetector;
        if (gestureDetector2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gestureDetector");
        }
        boolean onTouchEvent = gestureDetector2.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mLastDownTime = System.currentTimeMillis();
            cancelFuture();
            this.mLastDownEventY = motionEvent.getRawY();
        } else if (action == 2) {
            float rawY = this.mLastDownEventY - motionEvent.getRawY();
            this.mLastDownEventY = motionEvent.getRawY();
            this.totalScrollY += rawY;
            BaseWheelAdapter<? extends Object> aVar = this.adapter;
            if (!this.isLoop && aVar != null) {
                float f2 = ((float) (-this.initPosition)) * this.itemHeight;
                float f3 = this.itemHeight;
                float a = ((float) ((aVar.mo91448a() - 1) - this.initPosition)) * f3;
                float f4 = this.totalScrollY;
                if (((double) f4) - (((double) f3) * 0.25d) < ((double) f2)) {
                    f2 = f4 - rawY;
                } else if (((double) f4) + (((double) f3) * 0.25d) > ((double) a)) {
                    a = f4 - rawY;
                }
                if (f4 < f2) {
                    this.totalScrollY = f2;
                } else if (f4 > a) {
                    this.totalScrollY = a;
                }
            }
            checkLoopChange(rawY);
        } else if (!onTouchEvent) {
            float y = motionEvent.getY();
            float f5 = this.itemHeight;
            int i = (int) (y / f5);
            if (Math.abs(this.totalScrollY % f5) < ((float) 10)) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                float f6 = this.totalScrollY;
                float f7 = this.itemHeight;
                float f8 = ((f6 % f7) + f7) % f7;
                if (f8 > f7 / 2.0f) {
                    f = f7 - f8;
                } else {
                    f = -f8;
                }
            }
            this.mOffset = (((float) (i - ((this.itemsVisible - 2) / 2))) * this.itemHeight) + f;
            if (System.currentTimeMillis() - this.mLastDownTime > ((long) SmEvents.EVENT_NW)) {
                smoothScroll(ACTION.DAGGLE);
            } else {
                smoothScroll(ACTION.CLICK);
            }
        }
        invalidate();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.widthMeasureSpec = i;
        remeasure();
        setMeasuredDimension(this.wheelMeasuredWidth, this.wheelMeasuredHeight);
    }

    private final int calculateLoopNextIndex(BaseWheelAdapter<? extends Object> aVar, int i) {
        if (i < 0) {
            i += aVar.mo91448a();
        }
        if (i > aVar.mo91448a() - 1) {
            return i - aVar.mo91448a();
        }
        return i;
    }

    private final void updateSelectedItem(float f, Object obj) {
        BaseWheelAdapter<? extends Object> aVar;
        if (obj != null && (aVar = this.adapter) != null) {
            float f2 = this.firstLineY;
            if (f <= f2) {
                int i = this.maxTextHeight;
                if ((((float) i) / 2.0f) + f >= f2) {
                    if (f2 - f < (f + ((float) i)) - f2) {
                        this.selectedItemIndex = aVar.mo91452b(obj);
                        return;
                    }
                    return;
                }
            }
            float f3 = this.secondLineY;
            if (f <= f3) {
                int i2 = this.maxTextHeight;
                if ((((float) i2) / 2.0f) + f >= f3) {
                    if (f3 - f > (f + ((float) i2)) - f3) {
                        this.selectedItemIndex = aVar.mo91452b(obj);
                        return;
                    }
                    return;
                }
            }
            int i3 = this.maxTextHeight;
            if (f >= f2 + (((float) i3) / 2.0f) && (((float) i3) / 2.0f) + f <= f3) {
                this.selectedItemIndex = aVar.mo91452b(obj);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.mExecutor = Executors.newSingleThreadScheduledExecutor();
        this.typeface = Typeface.DEFAULT;
        this.itemsVisible = 5;
        this.mVisibleItems = new Object[5];
        this.isScrollChangeDrawn = true;
        this.mScaledVerticalScrollFactor = C0917s.m4407b(ViewConfiguration.get(context), context);
        this.textSize = UDDimenUtils.m93307a(context, 17.0f);
        this.outTextSize = UDDimenUtils.m93307a(context, 14.0f);
        this.dividerColor = context.getResources().getColor(R.color.line_border_card);
        this.textColorCenter = context.getResources().getColor(R.color.text_title);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ud_wheelView_dividerColor, R.attr.ud_wheelView_textColorCenter, R.attr.ud_wheelView_textSize}, 0, 0);
            this.textColorCenter = obtainStyledAttributes.getColor(1, this.textColorCenter);
            this.dividerColor = obtainStyledAttributes.getColor(0, this.dividerColor);
            this.textSize = (float) obtainStyledAttributes.getDimensionPixelOffset(2, (int) this.textSize);
            obtainStyledAttributes.recycle();
        }
        initView(context);
    }

    private final float updateVisibleItems(BaseWheelAdapter<?> aVar, Object[] objArr) {
        int i = 0;
        if (this.initPosition < 0) {
            this.initPosition = 0;
        }
        if (this.initPosition >= aVar.mo91448a()) {
            this.initPosition = aVar.mo91448a() - 1;
        }
        try {
            this.preCurrentIndex = this.initPosition + (((int) (this.totalScrollY / this.itemHeight)) % aVar.mo91448a());
        } catch (ArithmeticException unused) {
        }
        float f = this.totalScrollY % this.itemHeight;
        float abs = Math.abs(f);
        float f2 = this.itemHeight;
        if (abs > f2 - ((float) 10)) {
            if (f > ((float) 0)) {
                this.preCurrentIndex++;
                f = -(f2 - Math.abs(f));
            } else {
                this.preCurrentIndex--;
                f = f2 - Math.abs(f);
            }
        }
        if (!this.isLoop) {
            if (this.preCurrentIndex < 0) {
                this.preCurrentIndex = 0;
            }
            if (this.preCurrentIndex > aVar.mo91448a() - 1) {
                this.preCurrentIndex = aVar.mo91448a() - 1;
            }
        } else {
            int i2 = this.preCurrentIndex;
            if (i2 < 0) {
                this.preCurrentIndex = i2 + aVar.mo91448a();
            }
            if (this.preCurrentIndex > aVar.mo91448a() - 1) {
                this.preCurrentIndex -= aVar.mo91448a();
            }
        }
        this.isScrollChangeDrawn = true;
        while (true) {
            int i3 = this.itemsVisible;
            if (i >= i3) {
                return f;
            }
            int i4 = this.preCurrentIndex - ((i3 / 2) - i);
            if (this.isLoop) {
                objArr[i] = aVar.mo91453b(getLoopMappingIndex(i4));
            } else if (i4 < 0) {
                objArr[i] = "";
            } else if (i4 > aVar.mo91448a() - 1) {
                objArr[i] = "";
            } else {
                objArr[i] = aVar.mo91453b(i4);
            }
            i++;
        }
    }

    private final void drawWheelContent(Canvas canvas, float f, Object[] objArr) {
        Paint paint = this.paintCenterText;
        if (paint != null) {
            int i = this.itemsVisible;
            for (int i2 = 0; i2 < i; i2++) {
                if (Math.abs(f) >= ((float) 5) || !(i2 == 0 || i2 == this.itemsVisible - 1)) {
                    float f2 = this.itemHeight;
                    float f3 = ((((float) (i2 - 1)) * f2) - f) + (f2 / 2.0f);
                    Object obj = objArr[i2];
                    String contentText = getContentText(obj);
                    if (!TextUtils.isEmpty(this.label)) {
                        contentText = contentText + this.label;
                    }
                    paint.setTextSize(getScaleTextSize(f3));
                    canvas.drawText(contentText, ((float) this.wheelMeasuredWidth) / 2.0f, getCenterTextBaseLine() + f3, paint);
                    updateSelectedItem(f3, obj);
                    paint.setTextSize(this.textSize);
                }
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WheelView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            initializeFadingEdges();
        }
    }
}
