package com.ss.android.lark.widget.textview;

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0002J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0014J\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0013J\u001c\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/lark/widget/textview/TailTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mEllipsizeFinal", "", "getMEllipsizeFinal", "()Z", "setMEllipsizeFinal", "(Z)V", "mHeightMeasureSpec", "mTailContent", "", "mWidthMeasureSpec", "doMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "setTailContent", "tailContent", "setText", "text", "", ShareHitPoint.f121869d, "Landroid/widget/TextView$BufferType;", "Companion", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
public class TailTextView extends AppCompatTextView {

    /* renamed from: a */
    public static final Companion f147021a = new Companion(null);

    /* renamed from: b */
    private int f147022b;

    /* renamed from: c */
    private int f147023c;

    /* renamed from: e */
    private String f147024e = "";

    /* renamed from: f */
    private boolean f147025f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/widget/textview/TailTextView$Companion;", "", "()V", "LINE_BREAKER", "", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.textview.TailTextView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean getMEllipsizeFinal() {
        return this.f147025f;
    }

    /* access modifiers changed from: protected */
    public final void setMEllipsizeFinal(boolean z) {
        this.f147025f = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TailTextView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setTailContent(String str) {
        Intrinsics.checkParameterIsNotNull(str, "tailContent");
        this.f147024e = str;
        this.f147025f = false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m229973a(i, i2);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f147025f = false;
        super.setText(charSequence, bufferType);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TailTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m229973a(int i, int i2) {
        boolean z;
        CharSequence charSequence;
        if (this.f147022b == i && this.f147023c == i2) {
            z = true;
        } else {
            z = false;
        }
        if (TextUtils.isEmpty(this.f147024e)) {
            return;
        }
        if (!this.f147025f || !z) {
            this.f147022b = i;
            this.f147023c = i2;
            int lineCount = getLineCount();
            Layout layout = getLayout();
            int maxLines = getMaxLines();
            if (maxLines != 0 && lineCount >= maxLines && !TextUtils.isEmpty(getText())) {
                int i3 = maxLines - 1;
                int lineEnd = layout.getLineEnd(i3);
                int lineStart = layout.getLineStart(i3);
                if (lineEnd < getText().length()) {
                    CharSequence subSequence = getText().subSequence(0, lineStart);
                    String str = this.f147024e;
                    float measureText = getPaint().measureText(str);
                    int i4 = lineEnd - 1;
                    if (Intrinsics.areEqual("\n", String.valueOf(getText().charAt(i4)))) {
                        charSequence = getText().subSequence(lineStart, i4);
                    } else {
                        charSequence = getText().subSequence(lineStart, lineEnd);
                    }
                    CharSequence ellipsize = TextUtils.ellipsize(charSequence, getPaint(), ((float) getMeasuredWidth()) - measureText, TextUtils.TruncateAt.END);
                    StringBuilder sb = new StringBuilder(subSequence);
                    sb.append(ellipsize);
                    sb.append(str);
                    setText(sb);
                    this.f147025f = true;
                    measure(i, i2);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TailTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
