package com.ss.android.lark.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.linked_emojicon.base.EmojiconTextView;

public class EllipsizedEmojiconTextView extends EmojiconTextView {

    /* renamed from: a */
    private boolean f143385a;

    /* renamed from: b */
    private boolean f143386b;

    /* renamed from: c */
    private CharSequence f143387c;

    /* renamed from: a */
    private void mo198361a() {
        if (getMeasuredWidth() != 0) {
            layout(0, 0, 0, getMeasuredHeight());
        }
    }

    public String getContentText() {
        return super.getText().toString();
    }

    public void setShouldEllipsized(boolean z) {
        this.f143385a = z;
    }

    public EllipsizedEmojiconTextView(Context context) {
        this(context, null);
    }

    public EllipsizedEmojiconTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    @Override // com.ss.android.lark.widget.linked_emojicon.base.EmojiconTextView, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f143387c = charSequence;
        if (!this.f143385a) {
            super.setText(charSequence, bufferType);
            return;
        }
        if (this.f143386b) {
            this.f143386b = false;
        } else {
            mo198361a();
        }
        int maxLines = getMaxLines();
        if (getWidth() != 0 && maxLines <= 1000) {
            charSequence = TextUtils.ellipsize(charSequence, getPaint(), (float) (getWidth() * maxLines), TextUtils.TruncateAt.END, false, null);
        }
        super.setText(charSequence, bufferType);
        requestLayout();
    }

    public EllipsizedEmojiconTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f143385a = true;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (!this.f143385a) {
            super.onSizeChanged(i, i2, i3, i4);
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i3 != i) {
            this.f143386b = true;
            setText(this.f143387c);
            requestLayout();
        } else if (i == 0 && i3 == 0) {
            Log.m165383e("EllipsizedTextView", "onSizeChanged, width == 0 and oldWidth == 0");
        }
    }
}
