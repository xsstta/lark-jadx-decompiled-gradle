package com.ss.android.vc.meeting.module.reaction.livewidget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.ss.android.lark.log.Log;

public class VCEllipsizedEmojiconTextView extends VCEmojiconTextView {

    /* renamed from: b */
    private boolean f158043b;

    /* renamed from: c */
    private boolean f158044c;

    /* renamed from: b */
    private void mo216977b() {
        if (getMeasuredWidth() != 0) {
            layout(0, 0, 0, getMeasuredHeight());
        }
    }

    public String getContentText() {
        return C62842c.m245983a(super.getText().toString());
    }

    public void setShouldEllipsized(boolean z) {
        this.f158043b = z;
    }

    public VCEllipsizedEmojiconTextView(Context context) {
        this(context, null);
    }

    public VCEllipsizedEmojiconTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    @Override // android.widget.TextView, com.ss.android.vc.meeting.module.reaction.livewidget.VCEmojiconTextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (!this.f158043b) {
            super.setText(charSequence, bufferType);
            return;
        }
        if (mo216964a()) {
            charSequence = C62842c.m245982a(charSequence);
        }
        CharSequence charSequence2 = charSequence;
        if (this.f158044c) {
            this.f158044c = false;
        } else {
            mo216977b();
        }
        int maxLines = getMaxLines();
        if (getWidth() != 0 && maxLines <= 1000) {
            charSequence2 = TextUtils.ellipsize(charSequence2, getPaint(), (float) (getWidth() * maxLines), TextUtils.TruncateAt.END, false, null);
        }
        super.setText(charSequence2, bufferType);
        requestLayout();
    }

    public VCEllipsizedEmojiconTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f158043b = true;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (!this.f158043b) {
            super.onSizeChanged(i, i2, i3, i4);
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i3 != i) {
            this.f158044c = true;
            setText(getText());
            requestLayout();
        } else if (i == 0 && i3 == 0) {
            Log.m165383e("EllipsizedTextView", "onSizeChanged, width == 0 and oldWidth == 0");
        }
    }
}
