package com.ss.android.vc.meeting.module.meetingdialog.labs.widget;

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
import android.widget.ProgressBar;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62221d;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LabsLoading extends FrameLayout {

    /* renamed from: a */
    public AbstractC62221d f156534a;

    /* renamed from: b */
    private ProgressBar f156535b;

    /* renamed from: c */
    private TextView f156536c;

    /* renamed from: b */
    public void mo215455b() {
        ProgressBar progressBar = this.f156535b;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo215454a() {
        this.f156536c.setText(R.string.View_MV_LoadingSpecialEffects);
        this.f156536c.setTextColor(C60773o.m236126d(R.color.text_caption));
        this.f156535b.setVisibility(0);
    }

    /* renamed from: d */
    private void m243375d() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.vc_labs_loading_layout, (ViewGroup) null, false);
        addView(inflate, new FrameLayout.LayoutParams(-1, -1));
        this.f156535b = (ProgressBar) inflate.findViewById(R.id.labs_loading_image);
        this.f156536c = (TextView) inflate.findViewById(R.id.labs_loading_text);
        mo215454a();
    }

    /* renamed from: c */
    public void mo215456c() {
        mo215455b();
        this.f156536c.setTextColor(C60773o.m236126d(R.color.text_placeholder));
        String string = getContext().getString(R.string.View_MV_InternetErrorTryAgain);
        Matcher matcher = Pattern.compile("@@.*?@@").matcher(string);
        int i = 0;
        String str = string;
        int i2 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            String substring = string.substring(matcher.start() + 2, matcher.end() - 2);
            str = string.replace(group, substring);
            int start = matcher.start();
            int length = substring.length() + start;
            i2 = start;
            i = length;
        }
        if (i > 0) {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new ClickableSpan() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.widget.LabsLoading.C623011 */

                public void onClick(View view) {
                    LabsLoading.this.mo215454a();
                    LabsLoading.this.f156534a.mo215252a();
                }

                public void updateDrawState(TextPaint textPaint) {
                    textPaint.setColor(C60773o.m236126d(R.color.primary_pri_500));
                    textPaint.setUnderlineText(false);
                }
            }, i2, i, 33);
            this.f156536c.setText(spannableString);
            this.f156536c.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public void setListener(AbstractC62221d dVar) {
        this.f156534a = dVar;
    }

    public LabsLoading(Context context) {
        super(context);
        m243375d();
    }

    public LabsLoading(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m243375d();
    }

    public LabsLoading(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m243375d();
    }
}
