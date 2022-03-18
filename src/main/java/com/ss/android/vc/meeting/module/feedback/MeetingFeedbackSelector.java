package com.ss.android.vc.meeting.module.feedback;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;

public class MeetingFeedbackSelector extends LinearLayout {

    /* renamed from: a */
    private TextView f154712a;

    /* renamed from: b */
    private ImageView f154713b;

    public MeetingFeedbackSelector(Context context) {
        super(context);
        m240709a(context, null);
    }

    public void setIconVisibility(int i) {
        this.f154713b.setVisibility(i);
    }

    public void setText(String str) {
        this.f154712a.setText(str);
    }

    public void setTextColor(int i) {
        this.f154712a.setTextColor(i);
    }

    public MeetingFeedbackSelector(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m240709a(context, attributeSet);
    }

    /* renamed from: a */
    private void m240709a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes;
        View inflate = inflate(getContext(), R.layout.meeting_feedback_type_selector, this);
        this.f154712a = (TextView) inflate.findViewById(R.id.type_selector_textview);
        this.f154713b = (ImageView) inflate.findViewById(R.id.type_selector_iconview);
        if (attributeSet != null && (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.selectorText})) != null) {
            this.f154712a.setText(obtainStyledAttributes.getString(0));
            obtainStyledAttributes.recycle();
        }
    }

    public MeetingFeedbackSelector(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m240709a(context, attributeSet);
    }
}
