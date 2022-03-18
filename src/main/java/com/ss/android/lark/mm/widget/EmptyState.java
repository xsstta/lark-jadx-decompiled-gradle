package com.ss.android.lark.mm.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 82\u00020\u0001:\u000289B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\"\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u0010\u0018\u001a\u00020\u000eJ\u0010\u0010\u0019\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u000e\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\tJ\u000e\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020#J\u0015\u0010&\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010(J\u0015\u0010)\u001a\u00020\u000e2\b\u0010*\u001a\u0004\u0018\u00010#¢\u0006\u0002\u0010+J\u000e\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u0010J\u000e\u0010.\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\tJ\u0010\u0010/\u001a\u00020\u000e2\b\u00100\u001a\u0004\u0018\u000101J\u0010\u00102\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0012J\u000e\u00103\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\tJ\u0010\u00104\u001a\u00020\u000e2\b\u00100\u001a\u0004\u0018\u000101J\u0010\u00105\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0012J\u0010\u00106\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0012J\u000e\u00107\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\t¨\u0006:"}, d2 = {"Lcom/ss/android/lark/mm/widget/EmptyState;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "enableRemark", "", "getImageView", "Landroid/view/View;", "getRemarkText", "", "init", "initProperty", "ta", "Landroid/content/res/TypedArray;", "initStyle", "reset", "setContainer", "container", "Landroid/view/ViewGroup;", "setDesc", "text", "", "setDescTextColor", "color", "setDescTextSize", "size", "", "setImageBottomMargin", "margin", "setImageRes", "resId", "(Ljava/lang/Integer;)V", "setImageSize", "dp", "(Ljava/lang/Float;)V", "setImageView", "view", "setPrimaryActionTopMargin", "setPrimaryClickListener", "listener", "Landroid/view/View$OnClickListener;", "setPrimaryText", "setSecondaryActionTopMargin", "setSecondaryClickListener", "setSecondaryText", "setTitle", "setTitleBottomMargin", "Companion", "OperableTextSpan", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class EmptyState extends LinearLayout {

    /* renamed from: a */
    public static final float f118672a = 126.0f;

    /* renamed from: b */
    public static final float f118673b = 114.0f;

    /* renamed from: c */
    public static final Companion f118674c = new Companion(null);

    /* renamed from: d */
    private HashMap f118675d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/mm/widget/EmptyState$OperableTextSpan;", "Landroid/text/style/ClickableSpan;", "onClickListener", "Landroid/view/View$OnClickListener;", "(Landroid/view/View$OnClickListener;)V", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "drawState", "Landroid/text/TextPaint;", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.EmptyState$b */
    public static class OperableTextSpan extends ClickableSpan {

        /* renamed from: d */
        public static int f118676d;

        /* renamed from: e */
        public static final Companion f118677e = new Companion(null);

        /* renamed from: a */
        private final View.OnClickListener f118678a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mm/widget/EmptyState$OperableTextSpan$Companion;", "", "()V", "COLOR", "", "getCOLOR", "()I", "setCOLOR", "(I)V", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.widget.EmptyState$b$a */
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: a */
            public final void mo165543a(int i) {
                OperableTextSpan.f118676d = i;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public OperableTextSpan(View.OnClickListener onClickListener) {
            this.f118678a = onClickListener;
        }

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "widget");
            View.OnClickListener onClickListener = this.f118678a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkParameterIsNotNull(textPaint, "drawState");
            super.updateDrawState(textPaint);
            textPaint.setColor(f118676d);
            textPaint.setUnderlineText(false);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ OperableTextSpan(View.OnClickListener onClickListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : onClickListener);
        }
    }

    /* renamed from: a */
    public View mo165521a(int i) {
        if (this.f118675d == null) {
            this.f118675d = new HashMap();
        }
        View view = (View) this.f118675d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f118675d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mm/widget/EmptyState$Companion;", "", "()V", "IMAGE_LARGE", "", "getIMAGE_LARGE", "()F", "IMAGE_SMALL", "getIMAGE_SMALL", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.EmptyState$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final float mo165541a() {
            return EmptyState.f118673b;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo165522a() {
        EditText editText = (EditText) mo165521a(R.id.remark);
        Intrinsics.checkExpressionValueIsNotNull(editText, "remark");
        editText.setVisibility(0);
    }

    public final View getImageView() {
        ImageView imageView = (ImageView) mo165521a(R.id.image);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "image");
        return imageView;
    }

    public final String getRemarkText() {
        EditText editText = (EditText) mo165521a(R.id.remark);
        Intrinsics.checkExpressionValueIsNotNull(editText, "remark");
        return editText.getText().toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EmptyState(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setDescTextColor(int i) {
        ((TextView) mo165521a(R.id.desc)).setTextColor(i);
    }

    public final void setDescTextSize(float f) {
        ((TextView) mo165521a(R.id.desc)).setTextSize(0, f);
    }

    public final void setPrimaryClickListener(View.OnClickListener onClickListener) {
        ((TextView) mo165521a(R.id.btnPrimary)).setOnClickListener(onClickListener);
    }

    public final void setSecondaryClickListener(View.OnClickListener onClickListener) {
        ((TextView) mo165521a(R.id.btnSecondary)).setOnClickListener(onClickListener);
    }

    public final void setImageView(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        View imageView = getImageView();
        if (imageView != null) {
            removeView(imageView);
            addView(view, 0, imageView.getLayoutParams());
        }
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
        TextView textView = (TextView) mo165521a(R.id.desc);
        Intrinsics.checkExpressionValueIsNotNull(textView, "desc");
        textView.setText(charSequence);
        TextView textView2 = (TextView) mo165521a(R.id.desc);
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
        TextView textView3 = (TextView) mo165521a(R.id.desc);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "desc");
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void setImageBottomMargin(float f) {
        ImageView imageView = (ImageView) mo165521a(R.id.image);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "image");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = UIUtils.dp2px(getContext(), f);
                ((ImageView) mo165521a(R.id.image)).requestLayout();
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

    public final void setImageSize(Float f) {
        if (f != null) {
            f.floatValue();
            int dp2px = UIUtils.dp2px(getContext(), f.floatValue());
            ImageView imageView = (ImageView) mo165521a(R.id.image);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "image");
            imageView.getLayoutParams().width = dp2px;
            ImageView imageView2 = (ImageView) mo165521a(R.id.image);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "image");
            imageView2.getLayoutParams().height = dp2px;
        }
    }

    public final void setPrimaryActionTopMargin(int i) {
        TextView textView = (TextView) mo165521a(R.id.btnPrimary);
        Intrinsics.checkExpressionValueIsNotNull(textView, "btnPrimary");
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = i;
                ((TextView) mo165521a(R.id.btnPrimary)).requestLayout();
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void setPrimaryText(String str) {
        boolean z;
        TextView textView = (TextView) mo165521a(R.id.btnPrimary);
        Intrinsics.checkExpressionValueIsNotNull(textView, "btnPrimary");
        textView.setText(str);
        TextView textView2 = (TextView) mo165521a(R.id.btnPrimary);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "btnPrimary");
        TextView textView3 = (TextView) mo165521a(R.id.btnPrimary);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "btnPrimary");
        CharSequence text = textView3.getText();
        int i = 0;
        if (text == null || text.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 8;
        }
        textView2.setVisibility(i);
    }

    public final void setSecondaryActionTopMargin(int i) {
        TextView textView = (TextView) mo165521a(R.id.btnSecondary);
        Intrinsics.checkExpressionValueIsNotNull(textView, "btnSecondary");
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = i;
            ((TextView) mo165521a(R.id.btnSecondary)).requestLayout();
        }
    }

    public final void setSecondaryText(String str) {
        boolean z;
        TextView textView = (TextView) mo165521a(R.id.btnSecondary);
        Intrinsics.checkExpressionValueIsNotNull(textView, "btnSecondary");
        textView.setText(str);
        TextView textView2 = (TextView) mo165521a(R.id.btnSecondary);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "btnSecondary");
        TextView textView3 = (TextView) mo165521a(R.id.btnSecondary);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "btnSecondary");
        CharSequence text = textView3.getText();
        int i = 0;
        if (text == null || text.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 8;
        }
        textView2.setVisibility(i);
    }

    public final void setTitle(String str) {
        boolean z;
        BoldTextView boldTextView = (BoldTextView) mo165521a(R.id.title);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView, "title");
        String str2 = str;
        boldTextView.setText(str2);
        BoldTextView boldTextView2 = (BoldTextView) mo165521a(R.id.title);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView2, "title");
        int i = 0;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 8;
        }
        boldTextView2.setVisibility(i);
    }

    public final void setTitleBottomMargin(int i) {
        BoldTextView boldTextView = (BoldTextView) mo165521a(R.id.title);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView, "title");
        ViewGroup.LayoutParams layoutParams = boldTextView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = i;
                ((BoldTextView) mo165521a(R.id.title)).requestLayout();
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: a */
    private final void m186602a(TypedArray typedArray) {
        String str;
        String str2;
        String str3;
        String str4;
        setImageRes(Integer.valueOf(typedArray.getResourceId(2, 0)));
        CharSequence text = typedArray.getText(9);
        if (text == null || (str = text.toString()) == null) {
            str = typedArray.getString(9);
        }
        setTitle(str);
        CharSequence text2 = typedArray.getText(0);
        if (text2 == null || (str2 = text2.toString()) == null) {
            str2 = typedArray.getString(0);
        }
        setDesc(str2);
        CharSequence text3 = typedArray.getText(5);
        if (text3 == null || (str3 = text3.toString()) == null) {
            str3 = typedArray.getString(5);
        }
        setPrimaryText(str3);
        CharSequence text4 = typedArray.getText(7);
        if (text4 == null || (str4 = text4.toString()) == null) {
            str4 = typedArray.getString(7);
        }
        setSecondaryText(str4);
    }

    /* renamed from: b */
    private final void m186604b(TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(3, UIUtils.dp2px(getContext(), f118673b));
        ImageView imageView = (ImageView) mo165521a(R.id.image);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "image");
        imageView.getLayoutParams().width = dimensionPixelSize;
        ImageView imageView2 = (ImageView) mo165521a(R.id.image);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "image");
        imageView2.getLayoutParams().height = dimensionPixelSize;
        ((BoldTextView) mo165521a(R.id.title)).setTextColor(typedArray.getColor(10, UIUtils.getColor(getContext(), R.color.text_title)));
        ((TextView) mo165521a(R.id.desc)).setTextColor(typedArray.getColor(1, UIUtils.getColor(getContext(), R.color.text_caption)));
        OperableTextSpan.f118677e.mo165543a(typedArray.getInt(4, UIUtils.getColor(getContext(), R.color.ud_B500)));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EmptyState(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EmptyState(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m186603a(AttributeSet attributeSet, int i, int i2) {
        LayoutInflater.from(getContext()).inflate(R.layout.mm_view_emptystate, this);
        TextView textView = (TextView) mo165521a(R.id.desc);
        Intrinsics.checkExpressionValueIsNotNull(textView, "desc");
        textView.setHighlightColor(0);
        ((TextView) mo165521a(R.id.btnPrimary)).addOnLayoutChangeListener(new View$OnLayoutChangeListenerC47121c(this));
        ((TextView) mo165521a(R.id.btnSecondary)).addOnLayoutChangeListener(new View$OnLayoutChangeListenerC47122d(this));
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.empty_desc, R.attr.empty_descTextColor, R.attr.empty_imageRes, R.attr.empty_imageSize, R.attr.empty_operableTextColor, R.attr.empty_primaryText, R.attr.empty_primaryTextSize, R.attr.empty_secondaryText, R.attr.empty_secondaryTextSize, R.attr.empty_title, R.attr.empty_titleTextColor}, i, i2);
        Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "context.obtainStyledAttr…\n            defStyleRes)");
        m186602a(obtainStyledAttributes);
        m186604b(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmptyState(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m186603a(attributeSet, i, i2);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\n¢\u0006\u0002\b\u000e"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "<anonymous parameter 3>", "<anonymous parameter 4>", "<anonymous parameter 5>", "<anonymous parameter 6>", "<anonymous parameter 7>", "<anonymous parameter 8>", "onLayoutChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.EmptyState$c */
    public static final class View$OnLayoutChangeListenerC47121c implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ EmptyState f118679a;

        View$OnLayoutChangeListenerC47121c(EmptyState emptyState) {
            this.f118679a = emptyState;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            TextView textView = (TextView) this.f118679a.mo165521a(R.id.btnSecondary);
            Intrinsics.checkExpressionValueIsNotNull(textView, "btnSecondary");
            TextView textView2 = (TextView) this.f118679a.mo165521a(R.id.btnPrimary);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "btnPrimary");
            C47144b.m186711a(textView, textView2);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\n¢\u0006\u0002\b\u000e"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "<anonymous parameter 3>", "<anonymous parameter 4>", "<anonymous parameter 5>", "<anonymous parameter 6>", "<anonymous parameter 7>", "<anonymous parameter 8>", "onLayoutChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.EmptyState$d */
    public static final class View$OnLayoutChangeListenerC47122d implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ EmptyState f118680a;

        View$OnLayoutChangeListenerC47122d(EmptyState emptyState) {
            this.f118680a = emptyState;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            TextView textView = (TextView) this.f118680a.mo165521a(R.id.btnPrimary);
            Intrinsics.checkExpressionValueIsNotNull(textView, "btnPrimary");
            TextView textView2 = (TextView) this.f118680a.mo165521a(R.id.btnSecondary);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "btnSecondary");
            C47144b.m186711a(textView, textView2);
        }
    }
}
