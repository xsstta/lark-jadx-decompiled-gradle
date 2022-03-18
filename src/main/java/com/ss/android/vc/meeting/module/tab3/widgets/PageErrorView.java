package com.ss.android.vc.meeting.module.tab3.widgets;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3083e.C60773o;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PageErrorView extends FrameLayout {

    /* renamed from: a */
    private TextView f160186a;

    /* renamed from: b */
    private View f160187b;

    /* renamed from: a */
    public void mo219446a() {
        setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.tab3.widgets.PageErrorView$a */
    public static final class C63435a extends ClickableSpan {

        /* renamed from: a */
        private OnSingleClickListener f160188a;

        private C63435a(OnSingleClickListener onSingleClickListener) {
            this.f160188a = onSingleClickListener;
        }

        public void onClick(View view) {
            OnSingleClickListener onSingleClickListener = this.f160188a;
            if (onSingleClickListener != null) {
                onSingleClickListener.onSingleClick(view);
            }
        }

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(C60773o.m236126d(R.color.text_link_normal));
            textPaint.setUnderlineText(false);
        }
    }

    public PageErrorView(Context context) {
        this(context, null);
    }

    public void setTryReloadingClickListener(OnSingleClickListener onSingleClickListener) {
        m248508a(this.f160186a, onSingleClickListener);
    }

    /* renamed from: a */
    public void mo219447a(int i) {
        setBackgroundColor(C60773o.m236126d(i));
        setVisibility(0);
    }

    public PageErrorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m248507a(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(R.layout.vc_tab_list_error_view, this);
        this.f160187b = findViewById(R.id.container);
        this.f160186a = (TextView) findViewById(R.id.tv_try_reloading);
    }

    /* renamed from: a */
    private void m248508a(TextView textView, OnSingleClickListener onSingleClickListener) {
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
        spannableString.setSpan(new C63435a(onSingleClickListener), i, i2, 33);
        textView.setText(spannableString);
        textView.setTextColor(C60773o.m236126d(R.color.text_caption));
        textView.setTextSize(1, 14.0f);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
    }

    public PageErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m248507a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int height = (i4 - i2) - this.f160187b.getHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f160187b.getLayoutParams();
            layoutParams.setMargins(0, (height * 2) / 5, 0, 0);
            this.f160187b.setLayoutParams(layoutParams);
            this.f160187b.setVisibility(0);
        }
    }
}
