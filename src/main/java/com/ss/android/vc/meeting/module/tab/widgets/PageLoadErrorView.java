package com.ss.android.vc.meeting.module.tab.widgets;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3083e.C60773o;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PageLoadErrorView extends FrameLayout {

    /* renamed from: a */
    private TextView f159749a;

    /* renamed from: a */
    public void mo219090a() {
        setVisibility(0);
    }

    /* renamed from: b */
    public void mo219091b() {
        setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.tab.widgets.PageLoadErrorView$a */
    public static final class C63314a extends ClickableSpan {

        /* renamed from: a */
        private OnSingleClickListener f159750a;

        private C63314a(OnSingleClickListener onSingleClickListener) {
            this.f159750a = onSingleClickListener;
        }

        public void onClick(View view) {
            OnSingleClickListener onSingleClickListener = this.f159750a;
            if (onSingleClickListener != null) {
                onSingleClickListener.onSingleClick(view);
            }
        }

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(C60773o.m236126d(R.color.text_link_normal));
            textPaint.setUnderlineText(false);
        }
    }

    public PageLoadErrorView(Context context) {
        this(context, null);
    }

    public void setTryReloadingClickListener(OnSingleClickListener onSingleClickListener) {
        m248008a(this.f159749a, onSingleClickListener);
    }

    public PageLoadErrorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m248007a(Context context, AttributeSet attributeSet) {
        this.f159749a = (TextView) LayoutInflater.from(context).inflate(R.layout.layout_vc_page_load_error_view, (ViewGroup) this, true).findViewById(R.id.tv_try_reloading);
    }

    /* renamed from: a */
    private void m248008a(TextView textView, OnSingleClickListener onSingleClickListener) {
        String charSequence = textView.getText().toString();
        Matcher matcher = Pattern.compile("@@.*?@@").matcher(charSequence);
        String str = charSequence;
        int i = 0;
        int i2 = 0;
        while (matcher.find()) {
            CharSequence group = matcher.group();
            String substring = charSequence.substring(matcher.start() + 2, matcher.end() - 2);
            str = charSequence.replace(group, substring);
            int start = matcher.start();
            i2 = substring.length() + start;
            i = start;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new C63314a(onSingleClickListener), i, i2, 33);
        textView.setText(spannableString);
        textView.setTextColor(C60773o.m236126d(R.color.text_caption));
        textView.setTextSize(1, 14.0f);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
    }

    public PageLoadErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m248007a(context, attributeSet);
    }
}
