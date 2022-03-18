package com.ss.android.lark.widget.status;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import com.ss.android.lark.widget.span.AtInfo;
import java.util.HashMap;
import java.util.Map;

public class UserStatusTextView extends LinkEmojiTextView {

    /* renamed from: E */
    boolean f146923E;

    /* renamed from: F */
    private boolean f146924F;

    /* renamed from: b */
    private void m229895b() {
        setShowTail(true);
        setNeedToRecognize(false);
        setShouldEllipsized(true);
    }

    /* renamed from: c */
    private void m229896c() {
        if (!this.f146923E) {
            this.f146923E = true;
            Log.m165379d("showTextEndWithCloseImage", this.f144437m + " -->" + ((Object) getText()));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
            spannableStringBuilder.append(" ");
            setText(m229894a(R.drawable.contact_profile_description_close, spannableStringBuilder));
            this.f144437m = true;
            mo198361a();
        }
    }

    public void setShowArrow(boolean z) {
        this.f146924F = z;
    }

    public UserStatusTextView(Context context) {
        super(context);
        m229895b();
    }

    public void setMaxLines(int i) {
        this.f146923E = false;
        super.setMaxLines(i);
    }

    @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView
    /* renamed from: a */
    public void mo198364a(String str) {
        this.f144437m = false;
        this.f144438n = true;
        super.mo198364a(str.toString());
    }

    public UserStatusTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m229895b();
    }

    /* renamed from: a */
    private SpannableStringBuilder m229894a(int i, SpannableStringBuilder spannableStringBuilder) {
        spannableStringBuilder.append(" ");
        Drawable drawable = getResources().getDrawable(i);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        ImageSpan imageSpan = new ImageSpan(drawable, 1);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(imageSpan, length - 1, length, 33);
        return spannableStringBuilder;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView
    /* renamed from: a */
    public void mo198362a(int i, int i2) {
        CharSequence charSequence;
        if (this.f144439o && !this.f144437m) {
            int lineCount = getLineCount();
            Layout layout = getLayout();
            int maxLines = getMaxLines();
            if (maxLines != 0 && lineCount > maxLines && !TextUtils.isEmpty(getText())) {
                int i3 = maxLines - 1;
                int lineEnd = layout.getLineEnd(i3);
                int lineStart = layout.getLineStart(i3);
                if (lineEnd < getText().length() || this.f146924F) {
                    CharSequence subSequence = getText().subSequence(0, lineStart);
                    DeviceUtils.getScreenWidth(getContext());
                    if ("\n".equals(String.valueOf(getText().charAt(getText().length() - 1)))) {
                        charSequence = getText().subSequence(lineStart, getText().length() - 1);
                    } else {
                        charSequence = getText().subSequence(lineStart, getText().length());
                    }
                    CharSequence ellipsize = TextUtils.ellipsize(charSequence, getPaint(), (float) getMeasuredWidth(), TextUtils.TruncateAt.END);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(subSequence);
                    if (!this.f146924F) {
                        spannableStringBuilder.append(ellipsize);
                    } else {
                        if (ellipsize.length() > 3) {
                            spannableStringBuilder.append(ellipsize.subSequence(0, ellipsize.length() - 3));
                            spannableStringBuilder.append(ellipsize.charAt(ellipsize.length() - 1));
                        } else {
                            spannableStringBuilder.append(ellipsize);
                        }
                        spannableStringBuilder.append(" ");
                        spannableStringBuilder = m229894a(R.drawable.contact_profile_description_more, spannableStringBuilder);
                    }
                    setText(spannableStringBuilder);
                    this.f144437m = true;
                    mo198361a();
                    measure(i, i2);
                }
            } else if (!this.f146924F) {
                setText(new SpannableStringBuilder(getText()));
                this.f144437m = true;
            } else if (lineCount > 1) {
                m229896c();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView
    /* renamed from: a */
    public Map<String, Object> mo198360a(Context context, String str, AtInfo atInfo) {
        return new HashMap();
    }

    public UserStatusTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m229895b();
    }
}
