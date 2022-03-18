package com.larksuite.component.universe_design.checkbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.util.TintDrawablePool;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0005GHIJKB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0002\u0010\rJ(\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\nH\u0002J\b\u0010'\u001a\u00020!H\u0014J\b\u0010(\u001a\u00020\nH\u0007J\u0012\u0010(\u001a\u00020\n2\b\b\u0001\u0010)\u001a\u00020\nH\u0003J\u001e\u0010*\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010+\u001a\u00020\n2\b\b\u0001\u0010,\u001a\u00020\nH\u0002J\u0006\u0010-\u001a\u00020\u001dJ\u0006\u0010.\u001a\u00020\u001fJ\"\u0010/\u001a\u00020!2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\b\u00100\u001a\u00020\u0014H\u0016J\u0006\u00101\u001a\u00020\u0014J\u0010\u00102\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0014J\u0018\u00103\u001a\u00020!2\u0006\u00104\u001a\u00020\n2\u0006\u00105\u001a\u00020\nH\u0014J\b\u00106\u001a\u00020\u0014H\u0016J\u0010\u00107\u001a\u00020!2\u0006\u00108\u001a\u00020\u0014H\u0016J\u0010\u00109\u001a\u00020!2\b\b\u0001\u0010,\u001a\u00020\nJ\u000e\u0010:\u001a\u00020!2\u0006\u0010;\u001a\u00020\u0014J\u0010\u0010<\u001a\u00020!2\b\u0010=\u001a\u0004\u0018\u00010\u001bJ\u000e\u0010>\u001a\u00020!2\u0006\u0010%\u001a\u00020\u001dJ\u000e\u0010?\u001a\u00020!2\u0006\u0010@\u001a\u00020\u001fJ\b\u0010A\u001a\u00020!H\u0002J\u0010\u0010A\u001a\u00020!2\u0006\u0010B\u001a\u00020CH\u0002J\b\u0010D\u001a\u00020!H\u0002J\b\u0010E\u001a\u00020!H\u0016J\b\u0010F\u001a\u00020\u0014H\u0002R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000¨\u0006L"}, d2 = {"Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "Landroid/view/View;", "Landroid/widget/Checkable;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "mBackgroundDrawable", "Landroid/graphics/drawable/Drawable;", "mBorderDrawable", "mColor", "mDrawableSize", "mIndetermined", "", "mIsChecked", "mMarkDrawable", "mMarkOffset", "mMarkSize", "mNeedSetupDrawable", "mOnCheckedChangeListener", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox$OnCheckedChangeListener;", "mSize", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox$CheckBoxSize;", "mType", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox$CheckBoxType;", "doDrawDrawable", "", "canvas", "Landroid/graphics/Canvas;", "drawable", "size", "offset", "drawableStateChanged", "getColor", "colorRes", "getDrawable", "resId", "color", "getSize", "getType", "init", "isChecked", "isIndetermined", "onDraw", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "performClick", "setChecked", "checked", "setColor", "setIndetermined", "indetermined", "setOnCheckedChangeListener", "listener", "setSize", "setType", "value", "setupCurrDrawable", "res", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox$ICheckBoxRes;", "setupSize", "toggle", "useCustomColor", "CheckBoxSize", "CheckBoxType", "Companion", "ICheckBoxRes", "OnCheckedChangeListener", "universe-ui-checkbox_release"}, mo238835k = 1, mv = {1, 1, 16})
public class UDCheckBox extends View implements Checkable {

    /* renamed from: a */
    public static final Lazy f63122a = LazyKt.lazy(C25722c.INSTANCE);

    /* renamed from: b */
    public static final Lazy f63123b = LazyKt.lazy(C25724d.INSTANCE);

    /* renamed from: c */
    public static final Lazy f63124c = LazyKt.lazy(C25726e.INSTANCE);

    /* renamed from: d */
    public static final Lazy f63125d = LazyKt.lazy(C25720b.INSTANCE);

    /* renamed from: e */
    public static final Companion f63126e = new Companion(null);

    /* renamed from: s */
    private static TintDrawablePool f63127s = new TintDrawablePool();

    /* renamed from: f */
    private CheckBoxType f63128f;

    /* renamed from: g */
    private CheckBoxSize f63129g;

    /* renamed from: h */
    private int f63130h;

    /* renamed from: i */
    private boolean f63131i;

    /* renamed from: j */
    private boolean f63132j;

    /* renamed from: k */
    private int f63133k;

    /* renamed from: l */
    private int f63134l;

    /* renamed from: m */
    private int f63135m;

    /* renamed from: n */
    private Drawable f63136n;

    /* renamed from: o */
    private Drawable f63137o;

    /* renamed from: p */
    private Drawable f63138p;

    /* renamed from: q */
    private OnCheckedChangeListener f63139q;

    /* renamed from: r */
    private boolean f63140r;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/larksuite/component/universe_design/checkbox/UDCheckBox$CheckBoxSize;", "", "(Ljava/lang/String;I)V", "NORMAL_SIZE", "SMALL_SIZE", "universe-ui-checkbox_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum CheckBoxSize {
        NORMAL_SIZE,
        SMALL_SIZE
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/larksuite/component/universe_design/checkbox/UDCheckBox$CheckBoxType;", "", "(Ljava/lang/String;I)V", "CHECK_BOX", "RADIO", "CHECK_MARK", "universe-ui-checkbox_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum CheckBoxType {
        CHECK_BOX,
        RADIO,
        CHECK_MARK
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bb\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H'J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H'J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H'J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H'J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H'J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H'¨\u0006\f"}, d2 = {"Lcom/larksuite/component/universe_design/checkbox/UDCheckBox$ICheckBoxRes;", "", "backgroundColorRes", "", "isChecked", "", "isEnabled", "backgroundDrawableRes", "borderColorRes", "borderDrawableRes", "markColorRes", "markDrawableRes", "universe-ui-checkbox_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.checkbox.UDCheckBox$f */
    public interface ICheckBoxRes {
        /* renamed from: a */
        int mo90383a(boolean z, boolean z2);

        /* renamed from: b */
        int mo90384b(boolean z, boolean z2);

        /* renamed from: c */
        int mo90385c(boolean z, boolean z2);

        /* renamed from: d */
        int mo90386d(boolean z, boolean z2);

        /* renamed from: e */
        int mo90387e(boolean z, boolean z2);

        /* renamed from: f */
        int mo90388f(boolean z, boolean z2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/larksuite/component/universe_design/checkbox/UDCheckBox$OnCheckedChangeListener;", "", "onCheckedChanged", "", "buttonView", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "isChecked", "", "universe-ui-checkbox_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.checkbox.UDCheckBox$g */
    public interface OnCheckedChangeListener {
        void onCheckedChanged(UDCheckBox uDCheckBox, boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/larksuite/component/universe_design/checkbox/UDCheckBox$Companion;", "", "()V", "checkMarkRes", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox$ICheckBoxRes;", "getCheckMarkRes", "()Lcom/larksuite/component/universe_design/checkbox/UDCheckBox$ICheckBoxRes;", "checkMarkRes$delegate", "Lkotlin/Lazy;", "checkboxRes", "getCheckboxRes", "checkboxRes$delegate", "indeterminedCheckBoxRes", "getIndeterminedCheckBoxRes", "indeterminedCheckBoxRes$delegate", "mDrawables", "Lcom/larksuite/component/universe_design/util/TintDrawablePool;", "radioRes", "getRadioRes", "radioRes$delegate", "universe-ui-checkbox_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.checkbox.UDCheckBox$a */
    public static final class Companion {
        /* renamed from: a */
        public final ICheckBoxRes mo90379a() {
            Lazy lazy = UDCheckBox.f63122a;
            Companion aVar = UDCheckBox.f63126e;
            return (ICheckBoxRes) lazy.getValue();
        }

        /* renamed from: b */
        public final ICheckBoxRes mo90380b() {
            Lazy lazy = UDCheckBox.f63123b;
            Companion aVar = UDCheckBox.f63126e;
            return (ICheckBoxRes) lazy.getValue();
        }

        /* renamed from: c */
        public final ICheckBoxRes mo90381c() {
            Lazy lazy = UDCheckBox.f63124c;
            Companion aVar = UDCheckBox.f63126e;
            return (ICheckBoxRes) lazy.getValue();
        }

        /* renamed from: d */
        public final ICheckBoxRes mo90382d() {
            Lazy lazy = UDCheckBox.f63125d;
            Companion aVar = UDCheckBox.f63126e;
            return (ICheckBoxRes) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getColor() {
        return this.f63130h;
    }

    public final CheckBoxSize getSize() {
        return this.f63129g;
    }

    public final CheckBoxType getType() {
        return this.f63128f;
    }

    public boolean isChecked() {
        return this.f63132j;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/larksuite/component/universe_design/checkbox/UDCheckBox$Companion$checkMarkRes$2$1", "invoke", "()Lcom/larksuite/component/universe_design/checkbox/UDCheckBox$Companion$checkMarkRes$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.checkbox.UDCheckBox$b */
    static final class C25720b extends Lambda implements Function0<C257211> {
        public static final C25720b INSTANCE = new C25720b();

        C25720b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C257211 invoke() {
            return new ICheckBoxRes() {
                /* class com.larksuite.component.universe_design.checkbox.UDCheckBox.C25720b.C257211 */

                @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.ICheckBoxRes
                /* renamed from: a */
                public int mo90383a(boolean z, boolean z2) {
                    return 0;
                }

                @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.ICheckBoxRes
                /* renamed from: b */
                public int mo90384b(boolean z, boolean z2) {
                    return 0;
                }

                @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.ICheckBoxRes
                /* renamed from: c */
                public int mo90385c(boolean z, boolean z2) {
                    if (z) {
                        return z2 ? R.drawable.ic_checkbox_checkmark_enable : R.drawable.ic_checkbox_checkmark_disable;
                    }
                    return 0;
                }

                @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.ICheckBoxRes
                /* renamed from: d */
                public int mo90386d(boolean z, boolean z2) {
                    return 0;
                }

                @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.ICheckBoxRes
                /* renamed from: e */
                public int mo90387e(boolean z, boolean z2) {
                    return 0;
                }

                @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.ICheckBoxRes
                /* renamed from: f */
                public int mo90388f(boolean z, boolean z2) {
                    return 0;
                }
            };
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/larksuite/component/universe_design/checkbox/UDCheckBox$Companion$checkboxRes$2$1", "invoke", "()Lcom/larksuite/component/universe_design/checkbox/UDCheckBox$Companion$checkboxRes$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.checkbox.UDCheckBox$c */
    static final class C25722c extends Lambda implements Function0<C257231> {
        public static final C25722c INSTANCE = new C25722c();

        C25722c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C257231 invoke() {
            return new ICheckBoxRes() {
                /* class com.larksuite.component.universe_design.checkbox.UDCheckBox.C25722c.C257231 */

                @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.ICheckBoxRes
                /* renamed from: a */
                public int mo90383a(boolean z, boolean z2) {
                    if (z) {
                        return R.drawable.ic_checkbox_mark;
                    }
                    return 0;
                }

                @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.ICheckBoxRes
                /* renamed from: b */
                public int mo90384b(boolean z, boolean z2) {
                    if (z) {
                        return 0;
                    }
                    return R.drawable.ic_checkbox_border;
                }

                @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.ICheckBoxRes
                /* renamed from: c */
                public int mo90385c(boolean z, boolean z2) {
                    return R.drawable.bg_checkbox;
                }

                @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.ICheckBoxRes
                /* renamed from: d */
                public int mo90386d(boolean z, boolean z2) {
                    if (z) {
                        return z2 ? R.color.static_white : R.color.ud_N200;
                    }
                    return 0;
                }

                @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.ICheckBoxRes
                /* renamed from: e */
                public int mo90387e(boolean z, boolean z2) {
                    if (z) {
                        return 0;
                    }
                    return z2 ? R.color.ud_N500 : R.color.ud_N400;
                }

                @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.ICheckBoxRes
                /* renamed from: f */
                public int mo90388f(boolean z, boolean z2) {
                    return z ? z2 ? R.color.primary_pri_500 : R.color.fill_disable : z2 ? R.color.udtoken_component_outlined_bg : R.color.ud_N200;
                }
            };
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/larksuite/component/universe_design/checkbox/UDCheckBox$Companion$indeterminedCheckBoxRes$2$1", "invoke", "()Lcom/larksuite/component/universe_design/checkbox/UDCheckBox$Companion$indeterminedCheckBoxRes$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.checkbox.UDCheckBox$d */
    static final class C25724d extends Lambda implements Function0<C257251> {
        public static final C25724d INSTANCE = new C25724d();

        C25724d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C257251 invoke() {
            return new ICheckBoxRes() {
                /* class com.larksuite.component.universe_design.checkbox.UDCheckBox.C25724d.C257251 */

                @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.ICheckBoxRes
                /* renamed from: a */
                public int mo90383a(boolean z, boolean z2) {
                    if (z) {
                        return R.drawable.ic_indetermined_mark;
                    }
                    return 0;
                }

                @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.ICheckBoxRes
                /* renamed from: b */
                public int mo90384b(boolean z, boolean z2) {
                    return UDCheckBox.f63126e.mo90379a().mo90384b(z, z2);
                }

                @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.ICheckBoxRes
                /* renamed from: c */
                public int mo90385c(boolean z, boolean z2) {
                    return UDCheckBox.f63126e.mo90379a().mo90385c(z, z2);
                }

                @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.ICheckBoxRes
                /* renamed from: d */
                public int mo90386d(boolean z, boolean z2) {
                    return UDCheckBox.f63126e.mo90379a().mo90386d(z, z2);
                }

                @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.ICheckBoxRes
                /* renamed from: e */
                public int mo90387e(boolean z, boolean z2) {
                    return UDCheckBox.f63126e.mo90379a().mo90387e(z, z2);
                }

                @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.ICheckBoxRes
                /* renamed from: f */
                public int mo90388f(boolean z, boolean z2) {
                    return UDCheckBox.f63126e.mo90379a().mo90388f(z, z2);
                }
            };
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/larksuite/component/universe_design/checkbox/UDCheckBox$Companion$radioRes$2$1", "invoke", "()Lcom/larksuite/component/universe_design/checkbox/UDCheckBox$Companion$radioRes$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.checkbox.UDCheckBox$e */
    static final class C25726e extends Lambda implements Function0<C257271> {
        public static final C25726e INSTANCE = new C25726e();

        C25726e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C257271 invoke() {
            return new ICheckBoxRes() {
                /* class com.larksuite.component.universe_design.checkbox.UDCheckBox.C25726e.C257271 */

                @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.ICheckBoxRes
                /* renamed from: a */
                public int mo90383a(boolean z, boolean z2) {
                    if (z) {
                        return R.drawable.ic_radio_mark;
                    }
                    return 0;
                }

                @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.ICheckBoxRes
                /* renamed from: b */
                public int mo90384b(boolean z, boolean z2) {
                    if (z) {
                        return 0;
                    }
                    return R.drawable.ic_checkbox_border;
                }

                @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.ICheckBoxRes
                /* renamed from: c */
                public int mo90385c(boolean z, boolean z2) {
                    return R.drawable.bg_checkbox;
                }

                @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.ICheckBoxRes
                /* renamed from: d */
                public int mo90386d(boolean z, boolean z2) {
                    if (z) {
                        return z2 ? R.color.static_white : R.color.ud_N200;
                    }
                    return 0;
                }

                @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.ICheckBoxRes
                /* renamed from: e */
                public int mo90387e(boolean z, boolean z2) {
                    if (z) {
                        return 0;
                    }
                    return z2 ? R.color.ud_N500 : R.color.fill_disable;
                }

                @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.ICheckBoxRes
                /* renamed from: f */
                public int mo90388f(boolean z, boolean z2) {
                    return z ? z2 ? R.color.primary_pri_500 : R.color.fill_disable : z2 ? R.color.udtoken_component_outlined_bg : R.color.ud_N200;
                }
            };
        }
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void toggle() {
        setChecked(!this.f63132j);
    }

    /* renamed from: c */
    private final boolean m92513c() {
        if (this.f63130h == 0 || this.f63128f == CheckBoxType.CHECK_MARK) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f63140r = true;
        invalidate();
    }

    /* renamed from: a */
    private final void m92509a() {
        int i;
        int i2 = C25728a.f63141a[this.f63129g.ordinal()];
        if (i2 == 1) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            i = UDDimenUtils.m93313d(context, R.dimen.ud_checkbox_size_small);
        } else if (i2 == 2) {
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            i = UDDimenUtils.m93313d(context2, R.dimen.ud_checkbox_size_normal);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.f63133k = i;
        int i3 = (int) (((double) i) * 0.6d);
        this.f63134l = i3;
        this.f63135m = (i - i3) / 2;
        invalidate();
    }

    /* renamed from: b */
    private final void m92512b() {
        int i = C25728a.f63142b[this.f63128f.ordinal()];
        if (i != 1) {
            if (i == 2) {
                setupCurrDrawable(f63126e.mo90381c());
            } else if (i == 3) {
                setupCurrDrawable(f63126e.mo90382d());
            }
        } else if (this.f63131i) {
            setupCurrDrawable(f63126e.mo90380b());
        } else {
            setupCurrDrawable(f63126e.mo90379a());
        }
        invalidate();
        this.f63140r = false;
    }

    public final void setOnCheckedChangeListener(OnCheckedChangeListener gVar) {
        this.f63139q = gVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDCheckBox(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setColor(int i) {
        this.f63130h = i;
        this.f63140r = true;
        invalidate();
    }

    public final void setIndetermined(boolean z) {
        if (this.f63128f == CheckBoxType.CHECK_BOX) {
            this.f63131i = z;
            this.f63140r = true;
            invalidate();
        }
    }

    /* renamed from: a */
    private final int m92507a(int i) {
        if (i == 0) {
            return 0;
        }
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        return UDColorUtils.getColor(context, i);
    }

    public void setChecked(boolean z) {
        if (this.f63132j != z) {
            this.f63132j = z;
            OnCheckedChangeListener gVar = this.f63139q;
            if (gVar != null) {
                gVar.onCheckedChanged(this, z);
            }
            refreshDrawableState();
        }
    }

    public final void setSize(CheckBoxSize checkBoxSize) {
        Intrinsics.checkParameterIsNotNull(checkBoxSize, "size");
        if (checkBoxSize != this.f63129g) {
            this.f63129g = checkBoxSize;
            if (this.f63128f == CheckBoxType.CHECK_MARK) {
                this.f63129g = CheckBoxSize.NORMAL_SIZE;
            }
            m92509a();
        }
    }

    public final void setType(CheckBoxType checkBoxType) {
        Intrinsics.checkParameterIsNotNull(checkBoxType, "value");
        if (this.f63128f != checkBoxType) {
            this.f63128f = checkBoxType;
            if (checkBoxType == CheckBoxType.CHECK_MARK) {
                setSize(CheckBoxSize.NORMAL_SIZE);
            }
            this.f63140r = true;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        if (this.f63140r) {
            m92512b();
        }
        Drawable drawable = this.f63138p;
        if (drawable != null) {
            m92510a(canvas, drawable, this.f63133k, 0);
        }
        Drawable drawable2 = this.f63137o;
        if (drawable2 != null) {
            m92510a(canvas, drawable2, this.f63133k, 0);
        }
        Drawable drawable3 = this.f63136n;
        if (drawable3 != null) {
            m92510a(canvas, drawable3, this.f63134l, this.f63135m);
        }
        if (this.f63128f != CheckBoxType.CHECK_MARK) {
        }
    }

    private final void setupCurrDrawable(ICheckBoxRes fVar) {
        int i;
        int i2;
        int a = m92507a(fVar.mo90386d(this.f63132j, isEnabled()));
        if (!m92513c() || !isEnabled()) {
            i = m92507a(fVar.mo90387e(this.f63132j, isEnabled()));
        } else {
            i = this.f63130h;
        }
        if (!m92513c() || !this.f63132j || !isEnabled()) {
            i2 = m92507a(fVar.mo90388f(this.f63132j, isEnabled()));
        } else {
            i2 = this.f63130h;
        }
        this.f63136n = m92508a(fVar.mo90383a(this.f63132j, isEnabled()), a);
        this.f63137o = m92508a(fVar.mo90384b(this.f63132j, isEnabled()), i);
        this.f63138p = m92508a(fVar.mo90385c(this.f63132j, isEnabled()), i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final Drawable m92508a(int i, int i2) {
        if (i == 0) {
            return null;
        }
        TintDrawablePool dVar = f63127s;
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        return dVar.mo91837a(context, i, i2);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            int i3 = this.f63133k;
            if (layoutParams.width == -2) {
                i = View.MeasureSpec.makeMeasureSpec(getPaddingLeft() + i3 + getPaddingRight(), 1073741824);
            }
            if (layoutParams.height == -2) {
                i2 = View.MeasureSpec.makeMeasureSpec(i3 + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDCheckBox(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.UDCheckBox);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m92511a(AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{16842766, 16842981, 16843014, R.attr.ud_checkbox_color, R.attr.ud_checkbox_indetermined, R.attr.ud_checkbox_size, R.attr.ud_checkbox_type}, i, i2);
        Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "context.obtainStyledAttr…efStyleAttr, defStyleRes)");
        setClickable(obtainStyledAttributes.getBoolean(1, true));
        setChecked(obtainStyledAttributes.getBoolean(2, this.f63132j));
        setEnabled(obtainStyledAttributes.getBoolean(0, isEnabled()));
        this.f63128f = CheckBoxType.values()[obtainStyledAttributes.getInt(6, 0)];
        this.f63130h = obtainStyledAttributes.getColor(3, this.f63130h);
        setIndetermined(obtainStyledAttributes.getBoolean(4, this.f63131i));
        setSize(CheckBoxSize.values()[obtainStyledAttributes.getInt(5, 0)]);
        m92509a();
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDCheckBox(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f63128f = CheckBoxType.CHECK_BOX;
        this.f63129g = CheckBoxSize.NORMAL_SIZE;
        m92511a(attributeSet, i, i2);
    }

    /* renamed from: a */
    private final void m92510a(Canvas canvas, Drawable drawable, int i, int i2) {
        int paddingLeft = getPaddingLeft() + i2;
        int paddingTop = getPaddingTop() + i2;
        drawable.setBounds(new Rect(paddingLeft, paddingTop, paddingLeft + i, i + paddingTop));
        drawable.draw(canvas);
        canvas.save();
    }
}
