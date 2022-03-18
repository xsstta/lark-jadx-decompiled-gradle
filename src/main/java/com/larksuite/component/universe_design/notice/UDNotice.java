package com.larksuite.component.universe_design.notice;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.component.universe_design.drawable.UDRoundDrawable;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.radius.UDRadius;
import com.larksuite.component.universe_design.span.UDClickableSpan;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0003fghB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010)\u001a\u00020*H\u0002J\u001e\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u0018J\"\u0010/\u001a\u00020*2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u00100\u001a\u00020\tH\u0002J\b\u00101\u001a\u00020*H\u0002J\b\u00102\u001a\u00020*H\u0002J\u0006\u00103\u001a\u00020*J\b\u00104\u001a\u0004\u0018\u00010\u0011J\b\u00105\u001a\u00020\tH\u0007J\b\u00106\u001a\u0004\u0018\u00010\u0014J\b\u00107\u001a\u00020\tH\u0007J\b\u00108\u001a\u0004\u0018\u00010\u0011J\b\u00109\u001a\u00020\tH\u0007J\u0006\u0010:\u001a\u00020 J\b\u0010;\u001a\u00020\tH\u0007J\u0006\u0010<\u001a\u00020'J\b\u0010=\u001a\u00020\tH\u0007J\"\u0010>\u001a\u00020*2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u00100\u001a\u00020\tH\u0002J\b\u0010?\u001a\u00020*H\u0002J\u0006\u0010@\u001a\u00020\fJ\u0006\u0010A\u001a\u00020\fJ\u0006\u0010B\u001a\u00020\fJ\u0006\u0010C\u001a\u00020\fJ\u0010\u0010D\u001a\u00020*2\b\b\u0001\u0010E\u001a\u00020\tJ\u0010\u0010F\u001a\u00020*2\b\b\u0001\u0010G\u001a\u00020\tJ\u0010\u0010H\u001a\u00020*2\b\b\u0001\u0010G\u001a\u00020\tJ\u0010\u0010I\u001a\u00020*2\b\b\u0001\u0010E\u001a\u00020\tJ\u000e\u0010J\u001a\u00020*2\u0006\u0010K\u001a\u00020\u0018J\u0010\u0010L\u001a\u00020*2\b\b\u0001\u0010E\u001a\u00020\tJ\u000e\u0010M\u001a\u00020*2\u0006\u0010N\u001a\u00020\fJ\u000e\u0010O\u001a\u00020*2\u0006\u0010P\u001a\u00020QJ\u000e\u0010R\u001a\u00020*2\u0006\u0010S\u001a\u00020 J\u0010\u0010R\u001a\u00020*2\b\b\u0001\u0010G\u001a\u00020\tJ\u0010\u0010T\u001a\u00020*2\b\b\u0001\u0010E\u001a\u00020\tJ\u000e\u0010U\u001a\u00020*2\u0006\u0010S\u001a\u00020\u0014J\u0010\u0010V\u001a\u00020*2\b\b\u0001\u0010E\u001a\u00020\tJ\u000e\u0010W\u001a\u00020*2\u0006\u0010K\u001a\u00020\u0018J\u000e\u0010X\u001a\u00020*2\u0006\u0010Y\u001a\u00020'J\u0010\u0010Z\u001a\u00020*2\b\b\u0001\u0010E\u001a\u00020\tJ\u000e\u0010[\u001a\u00020*2\u0006\u0010\\\u001a\u00020]J\b\u0010^\u001a\u00020*H\u0002J\u000e\u0010_\u001a\u00020*2\u0006\u0010`\u001a\u00020\fJ\u000e\u0010a\u001a\u00020*2\u0006\u0010`\u001a\u00020\fJ\u000e\u0010b\u001a\u00020*2\u0006\u0010`\u001a\u00020\fJ\u0018\u0010c\u001a\u00020*2\u0006\u0010d\u001a\u00020e2\u0006\u0010`\u001a\u00020\fH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010!\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010(\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000¨\u0006i"}, d2 = {"Lcom/larksuite/component/universe_design/notice/UDNotice;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isGlobalLayoutListenerAdded", "", "mBackgroundColor", "mBackgroundDrawable", "Lcom/larksuite/component/universe_design/drawable/UDRoundDrawable;", "mButtonIcon", "Landroid/graphics/drawable/Drawable;", "mButtonIconColor", "mButtonText", "", "mButtonTextColor", "mIcon", "mIconButtonListener", "Landroid/view/View$OnClickListener;", "mIconColor", "mIconColorful", "mRadius", "mShowIcon", "mShowIconButton", "mShowTextButton", "mText", "", "mTextActionColor", "mTextActions", "", "Lcom/larksuite/component/universe_design/notice/UDNotice$TextAction;", "mTextButtonListener", "mTextButtonPosition", "Lcom/larksuite/component/universe_design/notice/UDNotice$TextButtonPosition;", "mTextColor", "addGlobalLayoutListenerIfNeed", "", "addTextAction", "start", "end", "listener", "applyAttrs", "defStyleRes", "applyBackground", "buildSpans", "clearTextActions", "getButtonIcon", "getButtonIconColor", "getButtonText", "getButtonTextColor", "getIcon", "getIconColor", "getText", "getTextActionColor", "getTextButtonPosition", "getTextColor", "init", "initView", "isIconButtonShow", "isIconColorful", "isIconShow", "isTextButtonShow", "setBackground", "color", "setIcon", "resId", "setIconButton", "setIconButtonColor", "setIconButtonListener", "onClickListener", "setIconColor", "setIconColorful", "isColorful", "setRadius", "radius", "Lcom/larksuite/component/universe_design/radius/UDRadius;", "setText", "text", "setTextActionColor", "setTextButton", "setTextButtonColor", "setTextButtonListener", "setTextButtonPosition", "position", "setTextColor", "setType", ShareHitPoint.f121869d, "Lcom/larksuite/component/universe_design/notice/UDNotice$Type;", "setupViews", "showIcon", "isShow", "showIconButton", "showTextButton", "showView", "view", "Landroid/view/View;", "TextAction", "TextButtonPosition", "Type", "universe-ui-notice_release"}, mo238835k = 1, mv = {1, 1, 16})
public class UDNotice extends ConstraintLayout {

    /* renamed from: a */
    public View.OnClickListener f63468a;

    /* renamed from: b */
    public View.OnClickListener f63469b;

    /* renamed from: c */
    public boolean f63470c;

    /* renamed from: d */
    public boolean f63471d;

    /* renamed from: e */
    private CharSequence f63472e;

    /* renamed from: f */
    private int f63473f;

    /* renamed from: g */
    private List<TextAction> f63474g;

    /* renamed from: h */
    private int f63475h;

    /* renamed from: i */
    private Drawable f63476i;

    /* renamed from: j */
    private int f63477j;

    /* renamed from: k */
    private boolean f63478k;

    /* renamed from: l */
    private String f63479l;

    /* renamed from: m */
    private int f63480m;

    /* renamed from: n */
    private TextButtonPosition f63481n;

    /* renamed from: o */
    private Drawable f63482o;

    /* renamed from: p */
    private int f63483p;

    /* renamed from: q */
    private int f63484q;

    /* renamed from: r */
    private boolean f63485r;

    /* renamed from: s */
    private boolean f63486s;

    /* renamed from: t */
    private int f63487t;

    /* renamed from: u */
    private final UDRoundDrawable f63488u;

    /* renamed from: v */
    private HashMap f63489v;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/larksuite/component/universe_design/notice/UDNotice$TextButtonPosition;", "", "(Ljava/lang/String;I)V", "value", "", "RIGHT", "BOTTOM", "AUTO", "Companion", "universe-ui-notice_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum TextButtonPosition {
        RIGHT,
        BOTTOM,
        AUTO;
        
        public static final Companion Companion = new Companion(null);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/larksuite/component/universe_design/notice/UDNotice$TextButtonPosition$Companion;", "", "()V", "of", "Lcom/larksuite/component/universe_design/notice/UDNotice$TextButtonPosition;", "value", "", "universe-ui-notice_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.universe_design.notice.UDNotice$TextButtonPosition$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final TextButtonPosition mo91063a(int i) {
                if (i == 0) {
                    return TextButtonPosition.RIGHT;
                }
                if (i == 1) {
                    return TextButtonPosition.BOTTOM;
                }
                if (i != 2) {
                    return TextButtonPosition.RIGHT;
                }
                return TextButtonPosition.AUTO;
            }
        }

        public final int value() {
            int i = C25766a.f63499a[ordinal()];
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 3) {
                return 2;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    public View mo37766a(int i) {
        if (this.f63489v == null) {
            this.f63489v = new HashMap();
        }
        View view = (View) this.f63489v.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f63489v.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/larksuite/component/universe_design/notice/UDNotice$Type;", "", "styleRes", "", "(Ljava/lang/String;II)V", "getStyleRes$universe_ui_notice_release", "()I", "INFO", "SUCCESS", "WARNING", "ERROR", "universe-ui-notice_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Type {
        INFO(2131887125),
        SUCCESS(2131887126),
        WARNING(2131887127),
        ERROR(2131887124);
        
        private final int styleRes;

        public final int getStyleRes$universe_ui_notice_release() {
            return this.styleRes;
        }

        private Type(int i) {
            this.styleRes = i;
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/larksuite/component/universe_design/notice/UDNotice$TextAction;", "", "start", "", "end", "listener", "Landroid/view/View$OnClickListener;", "(IILandroid/view/View$OnClickListener;)V", "getEnd", "()I", "getListener", "()Landroid/view/View$OnClickListener;", "getStart", "universe-ui-notice_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.notice.UDNotice$a */
    public static final class TextAction {

        /* renamed from: a */
        private final int f63490a;

        /* renamed from: b */
        private final int f63491b;

        /* renamed from: c */
        private final View.OnClickListener f63492c;

        /* renamed from: a */
        public final int mo91065a() {
            return this.f63490a;
        }

        /* renamed from: b */
        public final int mo91066b() {
            return this.f63491b;
        }

        /* renamed from: c */
        public final View.OnClickListener mo91067c() {
            return this.f63492c;
        }

        public TextAction(int i, int i2, View.OnClickListener onClickListener) {
            Intrinsics.checkParameterIsNotNull(onClickListener, "listener");
            this.f63490a = i;
            this.f63491b = i2;
            this.f63492c = onClickListener;
        }
    }

    public final Drawable getButtonIcon() {
        return this.f63482o;
    }

    public final int getButtonIconColor() {
        return this.f63483p;
    }

    public final String getButtonText() {
        return this.f63479l;
    }

    public final int getButtonTextColor() {
        return this.f63480m;
    }

    public final Drawable getIcon() {
        return this.f63476i;
    }

    public final int getIconColor() {
        return this.f63477j;
    }

    public final CharSequence getText() {
        return this.f63472e;
    }

    public final int getTextActionColor() {
        return this.f63475h;
    }

    public final TextButtonPosition getTextButtonPosition() {
        return this.f63481n;
    }

    public final int getTextColor() {
        return this.f63473f;
    }

    /* renamed from: a */
    private final void mo37767a() {
        LayoutInflater.from(getContext()).inflate(R.layout.ud_layout_notice, (ViewGroup) this, true);
    }

    /* renamed from: e */
    private final void m92888e() {
        UDRoundDrawable aVar = this.f63488u;
        aVar.setColor(this.f63484q);
        if (this.f63487t < 0) {
            this.f63487t = 0;
        }
        aVar.setCornerRadius((float) this.f63487t);
        setBackground(aVar);
    }

    /* renamed from: f */
    private final void m92889f() {
        if (!this.f63471d) {
            this.f63471d = true;
            getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC25760b(this));
        }
    }

    /* renamed from: c */
    public final void mo91033c() {
        ((TextView) mo37766a(R.id.ud_notice_text)).setText(this.f63472e);
        this.f63474g.clear();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/larksuite/component/universe_design/notice/UDNotice$addGlobalLayoutListenerIfNeed$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "universe-ui-notice_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.notice.UDNotice$b */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC25760b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ UDNotice f63493a;

        public void onGlobalLayout() {
            this.f63493a.f63471d = false;
            this.f63493a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            TextView textView = (TextView) this.f63493a.mo37766a(R.id.ud_notice_text);
            Intrinsics.checkExpressionValueIsNotNull(textView, "ud_notice_text");
            if (textView.getLineCount() == 1) {
                UDNotice uDNotice = this.f63493a;
                TextView textView2 = (TextView) uDNotice.mo37766a(R.id.ud_notice_text_btn_right);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "ud_notice_text_btn_right");
                uDNotice.mo91030a(textView2, this.f63493a.f63470c);
                UDNotice uDNotice2 = this.f63493a;
                TextView textView3 = (TextView) uDNotice2.mo37766a(R.id.ud_notice_text_btn_bottom);
                Intrinsics.checkExpressionValueIsNotNull(textView3, "ud_notice_text_btn_bottom");
                uDNotice2.mo91030a(textView3, false);
                return;
            }
            UDNotice uDNotice3 = this.f63493a;
            TextView textView4 = (TextView) uDNotice3.mo37766a(R.id.ud_notice_text_btn_right);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "ud_notice_text_btn_right");
            uDNotice3.mo91030a(textView4, false);
            UDNotice uDNotice4 = this.f63493a;
            TextView textView5 = (TextView) uDNotice4.mo37766a(R.id.ud_notice_text_btn_bottom);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "ud_notice_text_btn_bottom");
            uDNotice4.mo91030a(textView5, this.f63493a.f63470c);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC25760b(UDNotice uDNotice) {
            this.f63493a = uDNotice;
        }
    }

    /* renamed from: d */
    private final void m92887d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f63472e);
        for (TextAction aVar : this.f63474g) {
            spannableStringBuilder.setSpan(new UDClickableSpan(this.f63475h, aVar.mo91067c()), aVar.mo91065a(), aVar.mo91066b(), 34);
        }
        ((TextView) mo37766a(R.id.ud_notice_text)).setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        TextView textView = (TextView) mo37766a(R.id.ud_notice_text);
        Intrinsics.checkExpressionValueIsNotNull(textView, "ud_notice_text");
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView2 = (TextView) mo37766a(R.id.ud_notice_text);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "ud_notice_text");
        textView2.setHighlightColor(0);
    }

    /* renamed from: b */
    private final void mo37769b() {
        TextView textView = (TextView) mo37766a(R.id.ud_notice_text);
        if (this.f63474g.isEmpty()) {
            textView.setText(this.f63472e);
        } else {
            m92887d();
        }
        textView.setTextColor(this.f63473f);
        ImageView imageView = (ImageView) mo37766a(R.id.ud_notice_icon);
        Drawable drawable = this.f63476i;
        if (drawable != null) {
            if (this.f63478k) {
                drawable.setTintList(null);
            } else {
                drawable.mutate();
                drawable.setTint(this.f63477j);
            }
        }
        imageView.setImageDrawable(this.f63476i);
        ImageView imageView2 = (ImageView) mo37766a(R.id.ud_notice_icon_btn);
        Drawable drawable2 = this.f63482o;
        if (drawable2 != null) {
            drawable2.mutate();
            drawable2.setTint(this.f63483p);
        }
        imageView2.setImageDrawable(this.f63482o);
        TextView textView2 = (TextView) mo37766a(R.id.ud_notice_text_btn_right);
        textView2.setText(this.f63479l);
        textView2.setTextColor(this.f63480m);
        textView2.setOnClickListener(new View$OnClickListenerC25764f(this));
        TextView textView3 = (TextView) mo37766a(R.id.ud_notice_text_btn_bottom);
        textView3.setText(this.f63479l);
        textView3.setTextColor(this.f63480m);
        textView3.setOnClickListener(new View$OnClickListenerC25765g(this));
        mo91034c(this.f63470c);
        m92888e();
    }

    public final void setBackground(int i) {
        this.f63484q = i;
        m92888e();
    }

    public final void setTextActionColor(int i) {
        this.f63475h = i;
        m92887d();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.notice.UDNotice$c */
    public static final class View$OnClickListenerC25761c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UDNotice f63494a;

        View$OnClickListenerC25761c(UDNotice uDNotice) {
            this.f63494a = uDNotice;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener = this.f63494a.f63469b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.notice.UDNotice$d */
    public static final class View$OnClickListenerC25762d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UDNotice f63495a;

        View$OnClickListenerC25762d(UDNotice uDNotice) {
            this.f63495a = uDNotice;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener = this.f63495a.f63468a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.notice.UDNotice$e */
    public static final class View$OnClickListenerC25763e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UDNotice f63496a;

        View$OnClickListenerC25763e(UDNotice uDNotice) {
            this.f63496a = uDNotice;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener = this.f63496a.f63468a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/larksuite/component/universe_design/notice/UDNotice$setupViews$4$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.notice.UDNotice$f */
    public static final class View$OnClickListenerC25764f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UDNotice f63497a;

        View$OnClickListenerC25764f(UDNotice uDNotice) {
            this.f63497a = uDNotice;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener = this.f63497a.f63468a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/larksuite/component/universe_design/notice/UDNotice$setupViews$5$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.notice.UDNotice$g */
    public static final class View$OnClickListenerC25765g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UDNotice f63498a;

        View$OnClickListenerC25765g(UDNotice uDNotice) {
            this.f63498a = uDNotice;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener = this.f63498a.f63468a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDNotice(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setIconButtonColor(int i) {
        this.f63483p = i;
        Drawable drawable = this.f63482o;
        if (drawable != null) {
            drawable.mutate();
            drawable.setTint(this.f63483p);
        }
    }

    public final void setTextButtonPosition(TextButtonPosition textButtonPosition) {
        Intrinsics.checkParameterIsNotNull(textButtonPosition, "position");
        this.f63481n = textButtonPosition;
        mo91034c(this.f63470c);
    }

    /* renamed from: b */
    public final void mo91032b(boolean z) {
        this.f63486s = z;
        ImageView imageView = (ImageView) mo37766a(R.id.ud_notice_icon_btn);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "ud_notice_icon_btn");
        mo91030a(imageView, this.f63486s);
    }

    public final void setIconButtonListener(View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "onClickListener");
        this.f63469b = onClickListener;
        ((ImageView) mo37766a(R.id.ud_notice_icon_btn)).setOnClickListener(new View$OnClickListenerC25761c(this));
    }

    public final void setIconColor(int i) {
        this.f63477j = i;
        Drawable drawable = this.f63476i;
        if (drawable != null && !this.f63478k) {
            drawable.mutate();
            drawable.setTint(this.f63477j);
        }
    }

    public final void setIconColorful(boolean z) {
        this.f63478k = z;
        Drawable drawable = this.f63476i;
        if (drawable == null) {
            return;
        }
        if (z) {
            drawable.setTintList(null);
            return;
        }
        drawable.mutate();
        drawable.setTint(this.f63477j);
    }

    public final void setRadius(UDRadius uDRadius) {
        Intrinsics.checkParameterIsNotNull(uDRadius, "radius");
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        this.f63487t = uDRadius.getRadiusSize(context);
        m92888e();
    }

    public final void setText(int i) {
        CharSequence text = getContext().getText(i);
        Intrinsics.checkExpressionValueIsNotNull(text, "context.getText(resId)");
        setText(text);
    }

    public final void setTextButtonColor(int i) {
        this.f63480m = i;
        ((TextView) mo37766a(R.id.ud_notice_text_btn_right)).setTextColor(this.f63480m);
        ((TextView) mo37766a(R.id.ud_notice_text_btn_bottom)).setTextColor(this.f63480m);
    }

    public final void setTextColor(int i) {
        this.f63473f = i;
        ((TextView) mo37766a(R.id.ud_notice_text)).setTextColor(this.f63473f);
    }

    public final void setType(Type type) {
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        m92886b(null, 0, type.getStyleRes$universe_ui_notice_release());
        mo37769b();
    }

    public final void setIcon(int i) {
        mo91031a(true);
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        Drawable iconDrawable = UDIconUtils.getIconDrawable(context, i);
        if (!this.f63478k) {
            iconDrawable.mutate();
            iconDrawable.setTint(this.f63477j);
        }
        this.f63476i = iconDrawable;
        ((ImageView) mo37766a(R.id.ud_notice_icon)).setImageDrawable(this.f63476i);
    }

    public final void setIconButton(int i) {
        mo91032b(true);
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        Drawable iconDrawable = UDIconUtils.getIconDrawable(context, i);
        iconDrawable.mutate();
        iconDrawable.setTint(this.f63483p);
        this.f63482o = iconDrawable;
        ((ImageView) mo37766a(R.id.ud_notice_icon_btn)).setImageDrawable(this.f63482o);
    }

    public final void setText(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "text");
        this.f63472e = charSequence;
        TextView textView = (TextView) mo37766a(R.id.ud_notice_text);
        Intrinsics.checkExpressionValueIsNotNull(textView, "ud_notice_text");
        textView.setText(this.f63472e);
    }

    public final void setTextButton(String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        mo91034c(true);
        this.f63479l = str;
        TextView textView = (TextView) mo37766a(R.id.ud_notice_text_btn_right);
        Intrinsics.checkExpressionValueIsNotNull(textView, "ud_notice_text_btn_right");
        textView.setText(this.f63479l);
        TextView textView2 = (TextView) mo37766a(R.id.ud_notice_text_btn_bottom);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "ud_notice_text_btn_bottom");
        textView2.setText(this.f63479l);
    }

    public final void setTextButtonListener(View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "onClickListener");
        this.f63468a = onClickListener;
        ((TextView) mo37766a(R.id.ud_notice_text_btn_right)).setOnClickListener(new View$OnClickListenerC25762d(this));
        ((TextView) mo37766a(R.id.ud_notice_text_btn_bottom)).setOnClickListener(new View$OnClickListenerC25763e(this));
    }

    /* renamed from: c */
    public final void mo91034c(boolean z) {
        this.f63470c = z;
        int i = C25767b.f63500a[this.f63481n.ordinal()];
        if (i == 1) {
            TextView textView = (TextView) mo37766a(R.id.ud_notice_text_btn_right);
            Intrinsics.checkExpressionValueIsNotNull(textView, "ud_notice_text_btn_right");
            mo91030a(textView, this.f63470c);
            TextView textView2 = (TextView) mo37766a(R.id.ud_notice_text_btn_bottom);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "ud_notice_text_btn_bottom");
            mo91030a(textView2, false);
        } else if (i == 2) {
            TextView textView3 = (TextView) mo37766a(R.id.ud_notice_text_btn_right);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "ud_notice_text_btn_right");
            mo91030a(textView3, false);
            TextView textView4 = (TextView) mo37766a(R.id.ud_notice_text_btn_bottom);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "ud_notice_text_btn_bottom");
            mo91030a(textView4, this.f63470c);
        } else if (i == 3) {
            TextView textView5 = (TextView) mo37766a(R.id.ud_notice_text_btn_right);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "ud_notice_text_btn_right");
            mo91030a(textView5, this.f63470c);
            TextView textView6 = (TextView) mo37766a(R.id.ud_notice_text_btn_bottom);
            Intrinsics.checkExpressionValueIsNotNull(textView6, "ud_notice_text_btn_bottom");
            mo91030a(textView6, false);
            m92889f();
        }
    }

    /* renamed from: a */
    public final void mo91031a(boolean z) {
        this.f63485r = z;
        ImageView imageView = (ImageView) mo37766a(R.id.ud_notice_icon);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "ud_notice_icon");
        mo91030a(imageView, this.f63485r);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDNotice(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo91030a(View view, boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: a */
    private final void m92884a(AttributeSet attributeSet, int i, int i2) {
        mo37767a();
        m92886b(attributeSet, i, i2);
        mo37769b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDNotice(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f63472e = "";
        this.f63474g = new ArrayList(2);
        this.f63481n = TextButtonPosition.RIGHT;
        this.f63488u = new UDRoundDrawable();
        m92884a(attributeSet, i, 2131887125);
    }

    /* renamed from: a */
    public final void mo91029a(int i, int i2, View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "listener");
        this.f63474g.add(new TextAction(i, i2, onClickListener));
        m92887d();
    }

    /* renamed from: b */
    private final void m92886b(AttributeSet attributeSet, int i, int i2) {
        String str;
        boolean z;
        boolean z2;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ud_notice_backgroundColor, R.attr.ud_notice_icon, R.attr.ud_notice_iconBtn, R.attr.ud_notice_iconBtnColor, R.attr.ud_notice_iconColor, R.attr.ud_notice_iconColorful, R.attr.ud_notice_text, R.attr.ud_notice_textActionColor, R.attr.ud_notice_textBtn, R.attr.ud_notice_textBtnColor, R.attr.ud_notice_textBtnPosition, R.attr.ud_notice_textColor, R.attr.ud_radius}, i, i2);
        String string = obtainStyledAttributes.getString(6);
        if (string != null) {
            str = string;
        } else {
            str = this.f63472e;
        }
        this.f63472e = str;
        this.f63473f = obtainStyledAttributes.getColor(11, this.f63473f);
        boolean z3 = true;
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable == null) {
            drawable = this.f63476i;
        }
        this.f63476i = drawable;
        this.f63477j = obtainStyledAttributes.getColor(4, this.f63477j);
        this.f63478k = obtainStyledAttributes.getBoolean(5, this.f63478k);
        Drawable drawable2 = obtainStyledAttributes.getDrawable(2);
        if (drawable2 == null) {
            drawable2 = this.f63482o;
        }
        this.f63482o = drawable2;
        this.f63483p = obtainStyledAttributes.getColor(3, this.f63483p);
        String string2 = obtainStyledAttributes.getString(8);
        if (string2 == null) {
            string2 = this.f63479l;
        }
        this.f63479l = string2;
        this.f63480m = obtainStyledAttributes.getColor(9, this.f63480m);
        this.f63481n = TextButtonPosition.Companion.mo91063a(obtainStyledAttributes.getInt(10, this.f63481n.value()));
        this.f63475h = obtainStyledAttributes.getColor(7, this.f63475h);
        this.f63484q = obtainStyledAttributes.getColor(0, this.f63484q);
        int i3 = obtainStyledAttributes.getInt(12, -1);
        if (i3 >= 0) {
            UDRadius a = UDRadius.Companion.mo91123a(i3);
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            this.f63487t = a.getRadiusSize(context);
        }
        if (this.f63479l != null) {
            z = true;
        } else {
            z = false;
        }
        mo91034c(z);
        if (this.f63482o != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        mo91032b(z2);
        if (this.f63476i == null) {
            z3 = false;
        }
        mo91031a(z3);
        obtainStyledAttributes.recycle();
    }
}
