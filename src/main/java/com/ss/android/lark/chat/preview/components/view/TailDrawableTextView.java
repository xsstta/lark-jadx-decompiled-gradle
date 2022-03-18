package com.ss.android.lark.chat.preview.components.view;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 22\u00020\u0001:\u00012B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J \u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0002J\u0018\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\tH\u0002J\u0018\u0010'\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\tH\u0014J\u000e\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u0015J \u0010*\u001a\u00020\u001c2\b\u0010+\u001a\u0004\u0018\u00010\u00172\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\tJ\u001c\u0010.\u001a\u00020\u001c2\b\u0010/\u001a\u0004\u0018\u00010\u001e2\b\u00100\u001a\u0004\u0018\u000101H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/view/TailDrawableTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mEllipsizeFinal", "", "mHeightMeasureSpec", "mImageLoaderListener", "Lcom/ss/android/lark/chat/preview/components/view/RemoteImageLoadListener;", "getMImageLoaderListener", "()Lcom/ss/android/lark/chat/preview/components/view/RemoteImageLoadListener;", "mImageLoaderListener$delegate", "Lkotlin/Lazy;", "mTailContent", "", "mTailDrawable", "Landroid/graphics/drawable/Drawable;", "mTailDrawablePaddingLeft", "mTailDrawablePaddingRight", "mWidthMeasureSpec", "bindDrawableCallback", "", "content", "", "calculateLastLineText", "lastLineStartIndex", "lastLineText", "tailWidth", "", "doMeasure", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "setTailContent", "tailContent", "setTailDrawable", "drawable", "drawablePaddingLeft", "drawablePaddingRight", "setText", "text", ShareHitPoint.f121869d, "Landroid/widget/TextView$BufferType;", "Companion", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
public class TailDrawableTextView extends AppCompatTextView {

    /* renamed from: a */
    public static final Companion f88224a = new Companion(null);

    /* renamed from: b */
    private int f88225b;

    /* renamed from: c */
    private int f88226c;

    /* renamed from: e */
    private String f88227e = "";

    /* renamed from: f */
    private Drawable f88228f;

    /* renamed from: g */
    private int f88229g;

    /* renamed from: h */
    private int f88230h;

    /* renamed from: i */
    private boolean f88231i;

    /* renamed from: j */
    private final Lazy f88232j = LazyKt.lazy(new C34112b(this));

    private final RemoteImageLoadListener getMImageLoaderListener() {
        return (RemoteImageLoadListener) this.f88232j.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/view/TailDrawableTextView$Companion;", "", "()V", "LINE_BREAKER", "", "LOG_TAG", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.components.view.TailDrawableTextView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/preview/components/view/RemoteImageLoadListener;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.components.view.TailDrawableTextView$b */
    static final class C34112b extends Lambda implements Function0<RemoteImageLoadListener> {
        final /* synthetic */ TailDrawableTextView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34112b(TailDrawableTextView tailDrawableTextView) {
            super(0);
            this.this$0 = tailDrawableTextView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final RemoteImageLoadListener invoke() {
            return new RemoteImageLoadListener(new WeakReference(this.this$0));
        }
    }

    public final void setTailContent(String str) {
        Intrinsics.checkParameterIsNotNull(str, "tailContent");
        this.f88227e = str;
        this.f88231i = false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TailDrawableTextView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m132442a(CharSequence charSequence) {
        boolean z;
        if (charSequence instanceof Spannable) {
            CenterSpaceRemoteImageSpan[] aVarArr = (CenterSpaceRemoteImageSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), CenterSpaceRemoteImageSpan.class);
            if (aVarArr != null) {
                if (aVarArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    for (CenterSpaceRemoteImageSpan aVar : aVarArr) {
                        aVar.mo126332a(getMImageLoaderListener());
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m132441a(i, i2);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f88231i = false;
        m132442a(charSequence);
        super.setText(charSequence, bufferType);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TailDrawableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m132441a(int i, int i2) {
        boolean z;
        int i3;
        int lineEnd;
        CharSequence charSequence;
        int i4;
        Rect bounds;
        if (this.f88225b == i && this.f88226c == i2) {
            z = true;
        } else {
            z = false;
        }
        if (TextUtils.isEmpty(this.f88227e)) {
            return;
        }
        if (!this.f88231i || !z) {
            this.f88225b = i;
            this.f88226c = i2;
            int lineCount = getLineCount();
            Layout layout = getLayout();
            int maxLines = getMaxLines();
            if (maxLines != 0 && lineCount >= maxLines && !TextUtils.isEmpty(getText()) && (lineEnd = layout.getLineEnd((i3 = maxLines - 1))) < getText().length()) {
                int lineStart = layout.getLineStart(i3);
                int i5 = lineEnd - 1;
                if (Intrinsics.areEqual("\n", String.valueOf(getText().charAt(i5)))) {
                    charSequence = getText().subSequence(lineStart, i5);
                } else {
                    charSequence = getText().subSequence(lineStart, lineEnd);
                }
                String str = this.f88227e;
                float measureText = getPaint().measureText(str);
                Drawable drawable = this.f88228f;
                if (drawable == null || (bounds = drawable.getBounds()) == null) {
                    i4 = 0;
                } else {
                    i4 = bounds.width();
                }
                int a = m132440a(lineStart, charSequence, measureText + ((float) (i4 + this.f88230h + this.f88229g)));
                CharSequence subSequence = getText().subSequence(0, (lineStart + a) - 1);
                Log.m165379d("TailTextView", "index is: " + a + ", mustShowText is: " + subSequence);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(subSequence);
                spannableStringBuilder.append((CharSequence) str);
                Drawable drawable2 = this.f88228f;
                if (drawable2 != null) {
                    Context context = getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "context");
                    spannableStringBuilder.append("$", new CenterSpaceRemoteImageSpan(context, null, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight(), UIHelper.dp2px(4.0f), 0, drawable2, null, SmActions.ACTION_ONTHECALL_EXIT, null), 33);
                }
                setText(spannableStringBuilder);
                this.f88231i = true;
                measure(i, i2);
            }
        }
    }

    /* renamed from: a */
    public final void mo126329a(Drawable drawable, int i, int i2) {
        this.f88228f = drawable;
        this.f88229g = i;
        this.f88230h = i2;
        this.f88231i = false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TailDrawableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final int m132440a(int i, CharSequence charSequence, float f) {
        float measuredWidth = ((float) getMeasuredWidth()) - f;
        Log.m165379d("TailTextView", "measureWidth is:" + getMeasuredWidth() + ", tailWidth is:" + f + ", widthAvailable:" + measuredWidth);
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            float primaryHorizontal = getLayout().getPrimaryHorizontal(i + i2);
            Log.m165379d("TailTextView", "index is:" + i2 + ", text is:" + charSequence.charAt(i2) + ", offset is:" + primaryHorizontal);
            if (primaryHorizontal > measuredWidth) {
                return i2;
            }
        }
        if (getLayout().getPrimaryHorizontal((i + charSequence.length()) - 1) + getPaint().measureText(charSequence.subSequence(charSequence.length() - 1, charSequence.length()).toString()) > measuredWidth) {
            return charSequence.length();
        }
        return charSequence.length() + 1;
    }
}
