package com.ss.android.lark.mm.module.player.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.widget.BoldTextView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\"\u0010\u0015\u001a\u00020\u00162\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u000eR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/mm/module/player/core/widget/PlayerSpeedItem;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "showValue", "", "speed", "", "getSpeed", "()F", "setSpeed", "(F)V", "init", "", "select", "isSelected", "isByClick", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PlayerSpeedItem extends RelativeLayout {

    /* renamed from: a */
    public static String f117459a = "";

    /* renamed from: b */
    public static final Companion f117460b = new Companion(null);

    /* renamed from: e */
    private static WeakReference<PlayerSpeedItem> f117461e;

    /* renamed from: c */
    private float f117462c;

    /* renamed from: d */
    private boolean f117463d;

    /* renamed from: f */
    private HashMap f117464f;

    /* renamed from: a */
    public View mo163999a(int i) {
        if (this.f117464f == null) {
            this.f117464f = new HashMap();
        }
        View view = (View) this.f117464f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f117464f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/mm/module/player/core/widget/PlayerSpeedItem$Companion;", "", "()V", "BAR_LARGE", "", "BAR_MIDDLE", "BAR_SMALL", "CurrentFocus", "Ljava/lang/ref/WeakReference;", "Lcom/ss/android/lark/mm/module/player/core/widget/PlayerSpeedItem;", "url", "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.core.widget.PlayerSpeedItem$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final float getSpeed() {
        return this.f117462c;
    }

    public final void setSpeed(float f) {
        this.f117462c = f;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.core.widget.PlayerSpeedItem$b */
    public static final class View$OnClickListenerC46696b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PlayerSpeedItem f117465a;

        View$OnClickListenerC46696b(PlayerSpeedItem playerSpeedItem) {
            this.f117465a = playerSpeedItem;
        }

        public final void onClick(View view) {
            this.f117465a.mo164000a(true, true);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PlayerSpeedItem(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PlayerSpeedItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo164000a(boolean z, boolean z2) {
        String str;
        PlayerSpeedItem playerSpeedItem;
        ViewParent viewParent;
        PlayerSpeedItem playerSpeedItem2;
        int i = 0;
        if (z) {
            WeakReference<PlayerSpeedItem> weakReference = f117461e;
            OnPlayerSpeedListener bVar = null;
            if (weakReference != null) {
                playerSpeedItem = weakReference.get();
            } else {
                playerSpeedItem = null;
            }
            if (!Intrinsics.areEqual(playerSpeedItem, this)) {
                WeakReference<PlayerSpeedItem> weakReference2 = f117461e;
                if (!(weakReference2 == null || (playerSpeedItem2 = weakReference2.get()) == null)) {
                    m184751a(playerSpeedItem2, false, false, 2, null);
                }
                f117461e = new WeakReference<>(this);
                if (z2) {
                    ViewParent parent = getParent();
                    if (parent != null) {
                        viewParent = parent.getParent();
                    } else {
                        viewParent = null;
                    }
                    if (viewParent instanceof OnPlayerSpeedListener) {
                        bVar = viewParent;
                    }
                    OnPlayerSpeedListener bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.onSpeed(this.f117462c);
                    }
                }
            } else {
                return;
            }
        }
        ImageView imageView = (ImageView) mo163999a(R.id.ivBar);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "ivBar");
        imageView.setSelected(z);
        BoldTextView boldTextView = (BoldTextView) mo163999a(R.id.tvValue);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView, "tvValue");
        if (!this.f117463d && !z) {
            i = 4;
        }
        boldTextView.setVisibility(i);
        BoldTextView boldTextView2 = (BoldTextView) mo163999a(R.id.tvValue);
        if (z) {
            str = "#0085FF";
        } else {
            str = "#FFFFFF";
        }
        boldTextView2.setTextColor(Color.parseColor(str));
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
    public PlayerSpeedItem(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m184750a(AttributeSet attributeSet, int i, int i2) {
        int i3;
        LayoutInflater.from(getContext()).inflate(R.layout.mm_view_player_speed_item, this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.bar_size, R.attr.show_value, R.attr.value}, i, i2);
        Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "context.obtainStyledAttr…efStyleAttr, defStyleRes)");
        this.f117462c = obtainStyledAttributes.getFloat(2, 1.0f);
        BoldTextView boldTextView = (BoldTextView) mo163999a(R.id.tvValue);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView, "tvValue");
        StringBuilder sb = new StringBuilder();
        sb.append(this.f117462c);
        sb.append('X');
        boldTextView.setText(sb.toString());
        this.f117463d = obtainStyledAttributes.getBoolean(1, false);
        BoldTextView boldTextView2 = (BoldTextView) mo163999a(R.id.tvValue);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView2, "tvValue");
        if (this.f117463d) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        boldTextView2.setVisibility(i3);
        int i4 = obtainStyledAttributes.getInt(0, 2);
        if (i4 == 0) {
            ((ImageView) mo163999a(R.id.ivBar)).setImageResource(R.drawable.mm_player_speed_item_small);
        } else if (i4 == 1) {
            ((ImageView) mo163999a(R.id.ivBar)).setImageResource(R.drawable.mm_player_speed_item_middle);
        } else if (i4 == 2) {
            ((ImageView) mo163999a(R.id.ivBar)).setImageResource(R.drawable.mm_player_speed_item_large);
        }
        setOnClickListener(new View$OnClickListenerC46696b(this));
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayerSpeedItem(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f117462c = 1.0f;
        m184750a(attributeSet, i, i2);
    }

    /* renamed from: a */
    public static /* synthetic */ void m184751a(PlayerSpeedItem playerSpeedItem, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        playerSpeedItem.mo164000a(z, z2);
    }
}
