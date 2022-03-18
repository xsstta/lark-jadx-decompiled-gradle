package com.ss.android.lark.mm.module.player.speed.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.utils.FormatUtil;
import com.ss.android.lark.mm.widget.BoldTextView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\b\u0010\u0015\u001a\u00020\tH\u0014J\b\u0010\u0016\u001a\u00020\tH\u0014J\b\u0010\u0017\u001a\u00020\tH\u0014J\b\u0010\u0018\u001a\u00020\tH\u0014J\b\u0010\u0019\u001a\u00020\tH\u0014J\"\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u001e\u001a\u00020\u000eR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/ss/android/lark/mm/module/player/speed/view/SpeedItem;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "showValue", "", "speed", "", "getSpeed", "()F", "setSpeed", "(F)V", "getLargeImageResource", "getMiddleImageResource", "getNormalColor", "getSelectedColor", "getSmallImageResource", "init", "", "select", "isSelected", "isByClick", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public class SpeedItem extends RelativeLayout {

    /* renamed from: a */
    public static String f117533a = "";

    /* renamed from: b */
    public static final Companion f117534b = new Companion(null);

    /* renamed from: e */
    private static WeakReference<SpeedItem> f117535e;

    /* renamed from: c */
    private float f117536c;

    /* renamed from: d */
    private boolean f117537d;

    /* renamed from: f */
    private HashMap f117538f;

    /* renamed from: a */
    public View mo164107a(int i) {
        if (this.f117538f == null) {
            this.f117538f = new HashMap();
        }
        View view = (View) this.f117538f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f117538f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public int getLargeImageResource() {
        return R.drawable.mm_speed_item_bar_large;
    }

    /* access modifiers changed from: protected */
    public int getMiddleImageResource() {
        return R.drawable.mm_speed_item_bar_middle;
    }

    /* access modifiers changed from: protected */
    public int getSmallImageResource() {
        return R.drawable.mm_speed_item_bar_small;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/mm/module/player/speed/view/SpeedItem$Companion;", "", "()V", "BAR_LARGE", "", "BAR_MIDDLE", "BAR_SMALL", "CurrentFocus", "Ljava/lang/ref/WeakReference;", "Lcom/ss/android/lark/mm/module/player/speed/view/SpeedItem;", "url", "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.speed.view.SpeedItem$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final float getSpeed() {
        return this.f117536c;
    }

    /* access modifiers changed from: protected */
    public int getNormalColor() {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        return UDColorUtils.getColor(context, R.color.text_title);
    }

    /* access modifiers changed from: protected */
    public int getSelectedColor() {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        return UDColorUtils.getColor(context, R.color.primary_pri_500);
    }

    public final void setSpeed(float f) {
        this.f117536c = f;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.speed.view.SpeedItem$b */
    public static final class View$OnClickListenerC46721b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SpeedItem f117539a;

        View$OnClickListenerC46721b(SpeedItem speedItem) {
            this.f117539a = speedItem;
        }

        public final void onClick(View view) {
            C45855f.m181664c("SpeedItem", "click speed item");
            this.f117539a.mo164114a(true, true);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SpeedItem(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SpeedItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo164114a(boolean z, boolean z2) {
        Object obj;
        int i;
        boolean z3;
        String str;
        String str2;
        String str3;
        int i2;
        SpeedItem speedItem;
        SpeedItem speedItem2;
        int i3 = 0;
        if (z) {
            WeakReference<SpeedItem> weakReference = f117535e;
            OnSpeedListener aVar = null;
            if (weakReference != null) {
                speedItem = weakReference.get();
            } else {
                speedItem = null;
            }
            if (!Intrinsics.areEqual(speedItem, this)) {
                WeakReference<SpeedItem> weakReference2 = f117535e;
                if (!(weakReference2 == null || (speedItem2 = weakReference2.get()) == null)) {
                    m184915a(speedItem2, false, false, 2, null);
                }
                f117535e = new WeakReference<>(this);
                if (z2) {
                    ViewParent parent = getParent();
                    if (parent instanceof OnSpeedListener) {
                        aVar = parent;
                    }
                    OnSpeedListener aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.mo164118a(this.f117536c);
                    }
                }
            } else {
                return;
            }
        }
        ImageView imageView = (ImageView) mo164107a(R.id.ivBar);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "ivBar");
        imageView.setSelected(z);
        BoldTextView boldTextView = (BoldTextView) mo164107a(R.id.tvValue);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView, "tvValue");
        if (z) {
            BoldTextView boldTextView2 = (BoldTextView) mo164107a(R.id.tvValue);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView2, "tvValue");
            str3 = boldTextView2.getText().toString();
            z3 = false;
            i = 4;
            obj = null;
            str2 = "x";
            str = "X";
        } else {
            BoldTextView boldTextView3 = (BoldTextView) mo164107a(R.id.tvValue);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView3, "tvValue");
            str3 = boldTextView3.getText().toString();
            z3 = false;
            i = 4;
            obj = null;
            str2 = "X";
            str = "x";
        }
        boldTextView.setText(StringsKt.replace$default(str3, str2, str, z3, i, obj));
        BoldTextView boldTextView4 = (BoldTextView) mo164107a(R.id.tvValue);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView4, "tvValue");
        if (!this.f117537d && !z) {
            i3 = 4;
        }
        boldTextView4.setVisibility(i3);
        BoldTextView boldTextView5 = (BoldTextView) mo164107a(R.id.tvValue);
        if (z) {
            i2 = getSelectedColor();
        } else {
            i2 = getNormalColor();
        }
        boldTextView5.setTextColor(i2);
        if (z2) {
            Object systemService = getContext().getSystemService("vibrator");
            if (systemService != null) {
                ((Vibrator) systemService).vibrate(50);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.os.Vibrator");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SpeedItem(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m184914a(AttributeSet attributeSet, int i, int i2) {
        int i3;
        int i4;
        LayoutInflater.from(getContext()).inflate(R.layout.mm_view_speed_item, this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.bar_size, R.attr.show_value, R.attr.value}, i, i2);
        Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "context.obtainStyledAttr…tr, defStyleRes\n        )");
        this.f117536c = obtainStyledAttributes.getFloat(2, 1.0f);
        BoldTextView boldTextView = (BoldTextView) mo164107a(R.id.tvValue);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView, "tvValue");
        boldTextView.setText(FormatUtil.f118607a.mo165482a(this.f117536c) + 'x');
        this.f117537d = obtainStyledAttributes.getBoolean(1, false);
        BoldTextView boldTextView2 = (BoldTextView) mo164107a(R.id.tvValue);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView2, "tvValue");
        if (this.f117537d) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        boldTextView2.setVisibility(i3);
        BoldTextView boldTextView3 = (BoldTextView) mo164107a(R.id.tvValue);
        if (isSelected()) {
            i4 = getSelectedColor();
        } else {
            i4 = getNormalColor();
        }
        boldTextView3.setTextColor(i4);
        int i5 = obtainStyledAttributes.getInt(0, 2);
        if (i5 == 0) {
            ((ImageView) mo164107a(R.id.ivBar)).setImageResource(getSmallImageResource());
        } else if (i5 == 1) {
            ((ImageView) mo164107a(R.id.ivBar)).setImageResource(getMiddleImageResource());
        } else if (i5 == 2) {
            ((ImageView) mo164107a(R.id.ivBar)).setImageResource(getLargeImageResource());
        }
        setOnClickListener(new View$OnClickListenerC46721b(this));
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpeedItem(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f117536c = 1.0f;
        m184914a(attributeSet, i, i2);
    }

    /* renamed from: a */
    public static /* synthetic */ void m184915a(SpeedItem speedItem, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z2 = false;
            }
            speedItem.mo164114a(z, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: select");
    }
}
