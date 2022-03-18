package com.ss.android.lark.keyboard.plugin.input;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.base.EmojiHandler;

public class EmojiconAutoCompleteEditText extends AppCompatAutoCompleteTextView {

    /* renamed from: a */
    private int f103331a;

    /* renamed from: b */
    private int f103332b;

    /* renamed from: c */
    private int f103333c;

    /* renamed from: d */
    private boolean f103334d;

    /* renamed from: e */
    private boolean f103335e;

    /* renamed from: a */
    private void mo146921a() {
        if (this.f103335e) {
            EmojiHandler.m226947a(getContext(), getText(), this.f103331a, this.f103332b, this.f103333c);
        }
    }

    public void setTranslateEmojiCode(boolean z) {
        this.f103335e = z;
    }

    public void setUseSystemDefault(boolean z) {
        this.f103334d = z;
    }

    public void setEmojiconSize(int i) {
        this.f103331a = i;
        mo146921a();
    }

    public void setEmojiconTextSize(int i) {
        this.f103333c = i;
        mo146921a();
    }

    public EmojiconAutoCompleteEditText(Context context) {
        super(context);
        this.f103335e = true;
        this.f103332b = 1;
        this.f103331a = (int) UIHelper.sp2px(16.0f);
        this.f103333c = (int) UIHelper.sp2px(16.0f);
    }

    /* renamed from: a */
    private void m160878a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.emojiconAlignment, R.attr.emojiconSize, R.attr.emojiconTextLength, R.attr.emojiconTextStart, R.attr.emojiconUseSystemDefault});
        this.f103331a = (int) obtainStyledAttributes.getDimension(1, getTextSize());
        this.f103332b = obtainStyledAttributes.getInt(0, 1);
        this.f103334d = obtainStyledAttributes.getBoolean(4, false);
        obtainStyledAttributes.recycle();
        this.f103333c = (int) getTextSize();
        setText(getText());
    }

    public EmojiconAutoCompleteEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f103335e = true;
        m160878a(attributeSet);
    }

    /* renamed from: a */
    private void mo146910a(int i, int i2) {
        if (this.f103335e) {
            EmojiHandler.m226948a(getContext(), getText(), this.f103331a, this.f103332b, this.f103333c, i, i2);
        }
    }

    public EmojiconAutoCompleteEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f103335e = true;
        m160878a(attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (i3 > i2) {
            mo146910a(i, i3 - i2);
        }
    }
}
