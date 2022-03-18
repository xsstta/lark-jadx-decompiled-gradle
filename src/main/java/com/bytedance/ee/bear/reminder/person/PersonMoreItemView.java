package com.bytedance.ee.bear.reminder.person;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;

/* access modifiers changed from: package-private */
public class PersonMoreItemView extends FrameLayout {

    /* renamed from: a */
    private TextView f28541a;

    /* renamed from: a */
    private void m44096a() {
        setPadding(C13749l.m55738a(4), 0, C13749l.m55738a(8), 0);
        LayoutInflater.from(getContext()).inflate(R.layout.reminder_person_more_item, this);
        this.f28541a = (TextView) findViewById(R.id.tv_reminder_person_more);
    }

    public PersonMoreItemView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo40239a(String str) {
        this.f28541a.setText(str);
    }

    public PersonMoreItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PersonMoreItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m44096a();
    }
}
