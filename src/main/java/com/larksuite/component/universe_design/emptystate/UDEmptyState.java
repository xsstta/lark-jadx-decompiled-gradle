package com.larksuite.component.universe_design.emptystate;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.p017a.p018a.C0215a;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0016\u0018\u0000 R2\u00020\u0001:\u0003QRSB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eJ\"\u0010\u000f\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0010J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010 \u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010\"J\u0010\u0010#\u001a\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010%J\u0010\u0010#\u001a\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010&J\u000e\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\tJ\u0015\u0010)\u001a\u00020\u00102\b\u0010*\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010+J\u0015\u0010,\u001a\u00020\u00102\b\u0010-\u001a\u0004\u0018\u00010.¢\u0006\u0002\u0010/J\u0010\u00100\u001a\u00020\u00102\u0006\u00101\u001a\u00020\tH\u0002J\u0010\u00102\u001a\u00020\u00102\b\b\u0001\u0010*\u001a\u00020\tJ\u000e\u00103\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u000eJ\u0010\u00105\u001a\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010%J\u0010\u00105\u001a\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010&J\u000e\u00106\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u0016J\u0010\u00108\u001a\u00020\u00102\b\u00109\u001a\u0004\u0018\u00010:J\u000e\u0010;\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u0016J\u000e\u0010<\u001a\u00020\u00102\u0006\u0010=\u001a\u00020>J\u000e\u0010?\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\tJ\u0010\u0010@\u001a\u00020\u00102\b\u00109\u001a\u0004\u0018\u00010:J\u0010\u0010A\u001a\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010%J\u0010\u0010A\u001a\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010&J\u000e\u0010B\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u0016J\u000e\u0010C\u001a\u00020\u00102\u0006\u0010=\u001a\u00020>J\u000e\u0010D\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\tJ\u0010\u0010E\u001a\u00020\u00102\b\u00109\u001a\u0004\u0018\u00010:J\u0010\u0010F\u001a\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010%J\u0010\u0010F\u001a\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010&J\u0010\u0010G\u001a\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010%J\u0010\u0010G\u001a\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010&J\u000e\u0010H\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\tJ\u0018\u0010I\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u000e2\u0006\u0010J\u001a\u00020\u0016H\u0002J\u000e\u0010K\u001a\u00020\u00102\u0006\u0010L\u001a\u00020\u0016J\u000e\u0010M\u001a\u00020\u00102\u0006\u0010L\u001a\u00020\u0016J\u000e\u0010N\u001a\u00020\u00102\u0006\u0010L\u001a\u00020\u0016J\u000e\u0010O\u001a\u00020\u00102\u0006\u0010L\u001a\u00020\u0016J\u000e\u0010P\u001a\u00020\u00102\u0006\u0010L\u001a\u00020\u0016¨\u0006T"}, d2 = {"Lcom/larksuite/component/universe_design/emptystate/UDEmptyState;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "getImageView", "Landroid/view/View;", "init", "", "initProperty", "ta", "Landroid/content/res/TypedArray;", "initStyle", "isLinkActionEnabled", "", "isPrimaryActionEnabled", "isSecondaryActionEnabled", "reset", "setButtonPrimaryButtonStyle", "button", "Lcom/larksuite/component/universe_design/button/UDButton;", "setButtonPrimaryTextLinkStyle", "setButtonSecondaryButtonStyle", "setButtonSecondaryTextLinkStyle", "setContainer", "container", "Landroid/view/ViewGroup;", "setDesc", "text", "", "", "setImageBottomMargin", "margin", "setImageRes", "resId", "(Ljava/lang/Integer;)V", "setImageSize", "dp", "", "(Ljava/lang/Float;)V", "setImageSizeInternal", "px", "setImageSizeResource", "setImageView", "view", "setLinkAction", "setLinkActionEnabled", "enabled", "setOnLinkActionClickListener", "listener", "Landroid/view/View$OnClickListener;", "setPrimaryActionEnabled", "setPrimaryActionStyle", "style", "Lcom/larksuite/component/universe_design/emptystate/UDEmptyState$ButtonStyle;", "setPrimaryActionTopMargin", "setPrimaryClickListener", "setPrimaryText", "setSecondaryActionEnabled", "setSecondaryActionStyle", "setSecondaryActionTopMargin", "setSecondaryClickListener", "setSecondaryText", "setTitle", "setTitleBottomMargin", "setViewVisibility", "isVisible", "showDescription", "isShow", "showLinkAction", "showPrimaryAction", "showSecondaryAction", "showTitle", "ButtonStyle", "Companion", "OperableTextSpan", "universe-ui-emptystate_release"}, mo238835k = 1, mv = {1, 1, 16})
public class UDEmptyState extends LinearLayout {

    /* renamed from: b */
    public static final float f63429b = 245.0f;

    /* renamed from: c */
    public static final float f63430c = 100.0f;

    /* renamed from: d */
    public static final Companion f63431d = new Companion(null);

    /* renamed from: a */
    private HashMap f63432a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/larksuite/component/universe_design/emptystate/UDEmptyState$ButtonStyle;", "", "(Ljava/lang/String;I)V", "BUTTON", "TEXT_LINK", "universe-ui-emptystate_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ButtonStyle {
        BUTTON,
        TEXT_LINK
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/larksuite/component/universe_design/emptystate/UDEmptyState$OperableTextSpan;", "Landroid/text/style/ClickableSpan;", "onClickListener", "Landroid/view/View$OnClickListener;", "(Landroid/view/View$OnClickListener;)V", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "drawState", "Landroid/text/TextPaint;", "Companion", "universe-ui-emptystate_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.emptystate.UDEmptyState$b */
    public static final class OperableTextSpan extends ClickableSpan {

        /* renamed from: a */
        public static int f63433a;

        /* renamed from: b */
        public static final Companion f63434b = new Companion(null);

        /* renamed from: c */
        private final View.OnClickListener f63435c;

        public OperableTextSpan() {
            this(null, 1, null);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/larksuite/component/universe_design/emptystate/UDEmptyState$OperableTextSpan$Companion;", "", "()V", "COLOR", "", "getCOLOR", "()I", "setCOLOR", "(I)V", "universe-ui-emptystate_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.universe_design.emptystate.UDEmptyState$b$a */
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: a */
            public final void mo90984a(int i) {
                OperableTextSpan.f63433a = i;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public OperableTextSpan(View.OnClickListener onClickListener) {
            this.f63435c = onClickListener;
        }

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "widget");
            View.OnClickListener onClickListener = this.f63435c;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkParameterIsNotNull(textPaint, "drawState");
            super.updateDrawState(textPaint);
            textPaint.setColor(f63433a);
            textPaint.setUnderlineText(false);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ OperableTextSpan(View.OnClickListener onClickListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : onClickListener);
        }
    }

    /* renamed from: a */
    public View mo90949a(int i) {
        if (this.f63432a == null) {
            this.f63432a = new HashMap();
        }
        View view = (View) this.f63432a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f63432a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/larksuite/component/universe_design/emptystate/UDEmptyState$Companion;", "", "()V", "IMAGE_LARGE", "", "getIMAGE_LARGE", "()F", "IMAGE_SMALL", "getIMAGE_SMALL", "universe-ui-emptystate_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.emptystate.UDEmptyState$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final View getImageView() {
        ImageView imageView = (ImageView) mo90949a(R.id.image);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "image");
        return imageView;
    }

    public final void setDesc(String str) {
        setDesc((CharSequence) str);
    }

    public final void setLinkAction(String str) {
        setLinkAction((CharSequence) str);
    }

    public final void setPrimaryText(String str) {
        setPrimaryText((CharSequence) str);
    }

    public final void setSecondaryText(String str) {
        setSecondaryText((CharSequence) str);
    }

    public final void setTitle(String str) {
        setTitle((CharSequence) str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDEmptyState(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setOnLinkActionClickListener(View.OnClickListener onClickListener) {
        ((UDButton) mo90949a(R.id.btnLink)).setOnClickListener(onClickListener);
    }

    public final void setPrimaryClickListener(View.OnClickListener onClickListener) {
        ((UDButton) mo90949a(R.id.btnPrimary)).setOnClickListener(onClickListener);
    }

    public final void setSecondaryClickListener(View.OnClickListener onClickListener) {
        ((UDButton) mo90949a(R.id.btnSecondary)).setOnClickListener(onClickListener);
    }

    /* renamed from: b */
    public final void mo90950b(boolean z) {
        TextView textView = (TextView) mo90949a(R.id.title);
        Intrinsics.checkExpressionValueIsNotNull(textView, "title");
        m92850a(textView, z);
    }

    /* renamed from: c */
    public final void mo90951c(boolean z) {
        TextView textView = (TextView) mo90949a(R.id.desc);
        Intrinsics.checkExpressionValueIsNotNull(textView, "desc");
        m92850a(textView, z);
    }

    /* renamed from: d */
    public final void mo90952d(boolean z) {
        UDButton uDButton = (UDButton) mo90949a(R.id.btnPrimary);
        Intrinsics.checkExpressionValueIsNotNull(uDButton, "btnPrimary");
        m92850a(uDButton, z);
    }

    /* renamed from: e */
    public final void mo90953e(boolean z) {
        UDButton uDButton = (UDButton) mo90949a(R.id.btnSecondary);
        Intrinsics.checkExpressionValueIsNotNull(uDButton, "btnSecondary");
        m92850a(uDButton, z);
    }

    public final void setImageSize(Float f) {
        if (f != null) {
            f.floatValue();
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            setImageSizeInternal((int) UDDimenUtils.m93307a(context, f.floatValue()));
        }
    }

    public final void setImageSizeResource(int i) {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        setImageSizeInternal((int) context.getResources().getDimension(i));
    }

    public final void setImageView(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        View imageView = getImageView();
        if (imageView != null) {
            removeView(imageView);
            addView(view, 0, imageView.getLayoutParams());
        }
    }

    public final void setLinkActionEnabled(boolean z) {
        UDButton uDButton = (UDButton) mo90949a(R.id.btnLink);
        Intrinsics.checkExpressionValueIsNotNull(uDButton, "btnLink");
        uDButton.setEnabled(z);
    }

    public final void setPrimaryActionEnabled(boolean z) {
        UDButton uDButton = (UDButton) mo90949a(R.id.btnPrimary);
        Intrinsics.checkExpressionValueIsNotNull(uDButton, "btnPrimary");
        uDButton.setEnabled(z);
    }

    public final void setSecondaryActionEnabled(boolean z) {
        UDButton uDButton = (UDButton) mo90949a(R.id.btnSecondary);
        Intrinsics.checkExpressionValueIsNotNull(uDButton, "btnSecondary");
        uDButton.setEnabled(z);
    }

    private final void setButtonPrimaryButtonStyle(UDButton uDButton) {
        uDButton.setBackgroundColor(C0215a.m652a(getContext(), R.color.ud_button_blue_bg));
        uDButton.setTextColor(C0215a.m652a(getContext(), R.color.static_white));
        ColorStateList a = C0215a.m652a(getContext(), 17170445);
        Intrinsics.checkExpressionValueIsNotNull(a, "AppCompatResources.getCo…roid.R.color.transparent)");
        uDButton.setStrokeColor(a);
    }

    private final void setButtonPrimaryTextLinkStyle(UDButton uDButton) {
        uDButton.setBackgroundColor(C0215a.m652a(getContext(), R.color.ud_button_text_primary_bg));
        uDButton.setTextColor(C0215a.m652a(getContext(), R.color.ud_button_blue_text));
        ColorStateList a = C0215a.m652a(getContext(), 17170445);
        Intrinsics.checkExpressionValueIsNotNull(a, "AppCompatResources.getCo…roid.R.color.transparent)");
        uDButton.setStrokeColor(a);
    }

    private final void setButtonSecondaryButtonStyle(UDButton uDButton) {
        uDButton.setBackgroundColor(C0215a.m652a(getContext(), R.color.ud_button_text_secondary_bg));
        uDButton.setTextColor(C0215a.m652a(getContext(), R.color.ud_button_grey_text));
        ColorStateList a = C0215a.m652a(getContext(), R.color.line_border_component);
        Intrinsics.checkExpressionValueIsNotNull(a, "AppCompatResources.getCo…or.line_border_component)");
        uDButton.setStrokeColor(a);
    }

    private final void setButtonSecondaryTextLinkStyle(UDButton uDButton) {
        uDButton.setBackgroundColor(C0215a.m652a(getContext(), R.color.ud_button_text_secondary_bg));
        uDButton.setTextColor(C0215a.m652a(getContext(), R.color.ud_button_grey_text));
        ColorStateList a = C0215a.m652a(getContext(), 17170445);
        Intrinsics.checkExpressionValueIsNotNull(a, "AppCompatResources.getCo…roid.R.color.transparent)");
        uDButton.setStrokeColor(a);
    }

    private final void setImageSizeInternal(int i) {
        ImageView imageView = (ImageView) mo90949a(R.id.image);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "image");
        imageView.getLayoutParams().width = i;
        ImageView imageView2 = (ImageView) mo90949a(R.id.image);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "image");
        imageView2.getLayoutParams().height = i;
    }

    public final void setContainer(ViewGroup viewGroup) {
        int i;
        if (getParent() != null) {
            ViewParent parent = getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
        if (viewGroup != null) {
            if (viewGroup instanceof LinearLayout) {
                i = 0;
            } else {
                i = viewGroup.getChildCount() - 1;
            }
            viewGroup.addView(this, i, new LinearLayout.LayoutParams(-1, -1));
        }
    }

    public final void setDesc(CharSequence charSequence) {
        boolean z;
        TextView textView = (TextView) mo90949a(R.id.desc);
        Intrinsics.checkExpressionValueIsNotNull(textView, "desc");
        textView.setText(charSequence);
        TextView textView2 = (TextView) mo90949a(R.id.desc);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "desc");
        int i = 0;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 8;
        }
        textView2.setVisibility(i);
        TextView textView3 = (TextView) mo90949a(R.id.desc);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "desc");
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void setImageBottomMargin(int i) {
        ImageView imageView = (ImageView) mo90949a(R.id.image);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "image");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = i;
                ((ImageView) mo90949a(R.id.image)).requestLayout();
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void setImageRes(Integer num) {
        int i;
        View imageView = getImageView();
        if (num != null && num.intValue() == 0) {
            imageView.setVisibility(8);
        } else if (imageView instanceof ImageView) {
            ImageView imageView2 = (ImageView) imageView;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            imageView2.setImageResource(i);
            imageView2.setVisibility(0);
        }
    }

    public final void setLinkAction(CharSequence charSequence) {
        boolean z;
        UDButton uDButton = (UDButton) mo90949a(R.id.btnLink);
        Intrinsics.checkExpressionValueIsNotNull(uDButton, "btnLink");
        uDButton.setText(charSequence);
        UDButton uDButton2 = (UDButton) mo90949a(R.id.btnLink);
        Intrinsics.checkExpressionValueIsNotNull(uDButton2, "btnLink");
        int i = 0;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 8;
        }
        uDButton2.setVisibility(i);
    }

    public final void setPrimaryActionStyle(ButtonStyle buttonStyle) {
        Intrinsics.checkParameterIsNotNull(buttonStyle, "style");
        int i = C25757a.f63438a[buttonStyle.ordinal()];
        if (i == 1) {
            UDButton uDButton = (UDButton) mo90949a(R.id.btnPrimary);
            Intrinsics.checkExpressionValueIsNotNull(uDButton, "btnPrimary");
            setButtonPrimaryButtonStyle(uDButton);
        } else if (i == 2) {
            UDButton uDButton2 = (UDButton) mo90949a(R.id.btnPrimary);
            Intrinsics.checkExpressionValueIsNotNull(uDButton2, "btnPrimary");
            setButtonPrimaryTextLinkStyle(uDButton2);
        }
    }

    public final void setPrimaryActionTopMargin(int i) {
        UDButton uDButton = (UDButton) mo90949a(R.id.btnPrimary);
        Intrinsics.checkExpressionValueIsNotNull(uDButton, "btnPrimary");
        ViewGroup.LayoutParams layoutParams = uDButton.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = i;
                ((UDButton) mo90949a(R.id.btnPrimary)).requestLayout();
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void setPrimaryText(CharSequence charSequence) {
        boolean z;
        UDButton uDButton = (UDButton) mo90949a(R.id.btnPrimary);
        Intrinsics.checkExpressionValueIsNotNull(uDButton, "btnPrimary");
        uDButton.setText(charSequence);
        UDButton uDButton2 = (UDButton) mo90949a(R.id.btnPrimary);
        Intrinsics.checkExpressionValueIsNotNull(uDButton2, "btnPrimary");
        UDButton uDButton3 = (UDButton) mo90949a(R.id.btnPrimary);
        Intrinsics.checkExpressionValueIsNotNull(uDButton3, "btnPrimary");
        CharSequence text = uDButton3.getText();
        int i = 0;
        if (text == null || text.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 8;
        }
        uDButton2.setVisibility(i);
    }

    public final void setSecondaryActionStyle(ButtonStyle buttonStyle) {
        Intrinsics.checkParameterIsNotNull(buttonStyle, "style");
        int i = C25757a.f63439b[buttonStyle.ordinal()];
        if (i == 1) {
            UDButton uDButton = (UDButton) mo90949a(R.id.btnSecondary);
            Intrinsics.checkExpressionValueIsNotNull(uDButton, "btnSecondary");
            setButtonSecondaryButtonStyle(uDButton);
        } else if (i == 2) {
            UDButton uDButton2 = (UDButton) mo90949a(R.id.btnSecondary);
            Intrinsics.checkExpressionValueIsNotNull(uDButton2, "btnSecondary");
            setButtonSecondaryTextLinkStyle(uDButton2);
        }
    }

    public final void setSecondaryActionTopMargin(int i) {
        UDButton uDButton = (UDButton) mo90949a(R.id.btnSecondary);
        Intrinsics.checkExpressionValueIsNotNull(uDButton, "btnSecondary");
        ViewGroup.LayoutParams layoutParams = uDButton.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = i;
            ((UDButton) mo90949a(R.id.btnSecondary)).requestLayout();
        }
    }

    public final void setSecondaryText(CharSequence charSequence) {
        boolean z;
        UDButton uDButton = (UDButton) mo90949a(R.id.btnSecondary);
        Intrinsics.checkExpressionValueIsNotNull(uDButton, "btnSecondary");
        uDButton.setText(charSequence);
        UDButton uDButton2 = (UDButton) mo90949a(R.id.btnSecondary);
        Intrinsics.checkExpressionValueIsNotNull(uDButton2, "btnSecondary");
        UDButton uDButton3 = (UDButton) mo90949a(R.id.btnSecondary);
        Intrinsics.checkExpressionValueIsNotNull(uDButton3, "btnSecondary");
        CharSequence text = uDButton3.getText();
        int i = 0;
        if (text == null || text.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 8;
        }
        uDButton2.setVisibility(i);
    }

    public final void setTitle(CharSequence charSequence) {
        boolean z;
        TextView textView = (TextView) mo90949a(R.id.title);
        Intrinsics.checkExpressionValueIsNotNull(textView, "title");
        textView.setText(charSequence);
        TextView textView2 = (TextView) mo90949a(R.id.title);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "title");
        int i = 0;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 8;
        }
        textView2.setVisibility(i);
    }

    public final void setTitleBottomMargin(int i) {
        TextView textView = (TextView) mo90949a(R.id.title);
        Intrinsics.checkExpressionValueIsNotNull(textView, "title");
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = i;
                ((TextView) mo90949a(R.id.title)).requestLayout();
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: a */
    private final void m92848a(TypedArray typedArray) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        setImageRes(Integer.valueOf(typedArray.getResourceId(2, 0)));
        CharSequence text = typedArray.getText(10);
        if (text == null || (str = text.toString()) == null) {
            str = typedArray.getString(10);
        }
        setTitle(str);
        CharSequence text2 = typedArray.getText(0);
        if (text2 == null || (str2 = text2.toString()) == null) {
            str2 = typedArray.getString(0);
        }
        setDesc(str2);
        CharSequence text3 = typedArray.getText(6);
        if (text3 == null || (str3 = text3.toString()) == null) {
            str3 = typedArray.getString(6);
        }
        setPrimaryText(str3);
        CharSequence text4 = typedArray.getText(8);
        if (text4 == null || (str4 = text4.toString()) == null) {
            str4 = typedArray.getString(8);
        }
        setSecondaryText(str4);
        CharSequence text5 = typedArray.getText(4);
        if (text5 == null || (str5 = text5.toString()) == null) {
            str5 = typedArray.getString(4);
        }
        setLinkAction(str5);
    }

    /* renamed from: b */
    private final void m92851b(TypedArray typedArray) {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        int dimensionPixelSize = typedArray.getDimensionPixelSize(3, (int) UDDimenUtils.m93307a(context, f63430c));
        ImageView imageView = (ImageView) mo90949a(R.id.image);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "image");
        imageView.getLayoutParams().width = dimensionPixelSize;
        ImageView imageView2 = (ImageView) mo90949a(R.id.image);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "image");
        imageView2.getLayoutParams().height = dimensionPixelSize;
        ((UDButton) mo90949a(R.id.btnPrimary)).setTextSize(0, (float) typedArray.getDimensionPixelSize(7, 14));
        ((UDButton) mo90949a(R.id.btnSecondary)).setTextSize(0, (float) typedArray.getDimensionPixelSize(9, 14));
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        ((TextView) mo90949a(R.id.title)).setTextColor(typedArray.getColor(11, UDColorUtils.getColor(context2, R.color.text_title)));
        Context context3 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context3, "context");
        ((TextView) mo90949a(R.id.desc)).setTextColor(typedArray.getColor(1, UDColorUtils.getColor(context3, R.color.text_caption)));
        OperableTextSpan.Companion aVar = OperableTextSpan.f63434b;
        Context context4 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context4, "context");
        aVar.mo90984a(typedArray.getInt(5, UDColorUtils.getColor(context4, R.color.primary_pri_500)));
    }

    /* renamed from: a */
    private final void m92850a(View view, boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDEmptyState(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDEmptyState(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.UDEmptyState);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m92849a(AttributeSet attributeSet, int i, int i2) {
        LayoutInflater.from(getContext()).inflate(R.layout.ud_layout_emptystate, this);
        TextView textView = (TextView) mo90949a(R.id.desc);
        Intrinsics.checkExpressionValueIsNotNull(textView, "desc");
        textView.setHighlightColor(0);
        ((UDButton) mo90949a(R.id.btnPrimary)).addOnLayoutChangeListener(new View$OnLayoutChangeListenerC25755c(this));
        ((UDButton) mo90949a(R.id.btnSecondary)).addOnLayoutChangeListener(new View$OnLayoutChangeListenerC25756d(this));
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ud_empty_desc, R.attr.ud_empty_descTextColor, R.attr.ud_empty_imageRes, R.attr.ud_empty_imageSize, R.attr.ud_empty_linkText, R.attr.ud_empty_operableTextColor, R.attr.ud_empty_primaryText, R.attr.ud_empty_primaryTextSize, R.attr.ud_empty_secondaryText, R.attr.ud_empty_secondaryTextSize, R.attr.ud_empty_title, R.attr.ud_empty_titleTextColor}, i, i2);
        Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "ta");
        m92848a(obtainStyledAttributes);
        m92851b(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDEmptyState(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m92849a(attributeSet, i, i2);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\n¢\u0006\u0002\b\u000e"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "<anonymous parameter 3>", "<anonymous parameter 4>", "<anonymous parameter 5>", "<anonymous parameter 6>", "<anonymous parameter 7>", "<anonymous parameter 8>", "onLayoutChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.emptystate.UDEmptyState$c */
    public static final class View$OnLayoutChangeListenerC25755c implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ UDEmptyState f63436a;

        View$OnLayoutChangeListenerC25755c(UDEmptyState uDEmptyState) {
            this.f63436a = uDEmptyState;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            UDButton uDButton = (UDButton) this.f63436a.mo90949a(R.id.btnSecondary);
            Intrinsics.checkExpressionValueIsNotNull(uDButton, "btnSecondary");
            UDButton uDButton2 = (UDButton) this.f63436a.mo90949a(R.id.btnPrimary);
            Intrinsics.checkExpressionValueIsNotNull(uDButton2, "btnPrimary");
            C25758b.m92858a(uDButton, uDButton2);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\n¢\u0006\u0002\b\u000e"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "<anonymous parameter 3>", "<anonymous parameter 4>", "<anonymous parameter 5>", "<anonymous parameter 6>", "<anonymous parameter 7>", "<anonymous parameter 8>", "onLayoutChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.emptystate.UDEmptyState$d */
    public static final class View$OnLayoutChangeListenerC25756d implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ UDEmptyState f63437a;

        View$OnLayoutChangeListenerC25756d(UDEmptyState uDEmptyState) {
            this.f63437a = uDEmptyState;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            UDButton uDButton = (UDButton) this.f63437a.mo90949a(R.id.btnPrimary);
            Intrinsics.checkExpressionValueIsNotNull(uDButton, "btnPrimary");
            UDButton uDButton2 = (UDButton) this.f63437a.mo90949a(R.id.btnSecondary);
            Intrinsics.checkExpressionValueIsNotNull(uDButton2, "btnSecondary");
            C25758b.m92858a(uDButton, uDButton2);
        }
    }
}
