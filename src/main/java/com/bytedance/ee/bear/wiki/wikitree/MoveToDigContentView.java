package com.bytedance.ee.bear.wiki.wikitree;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import com.larksuite.suite.R;

public class MoveToDigContentView extends LinearLayout {

    /* renamed from: a */
    private static final int f32529a = 2131304498;

    /* renamed from: b */
    private RadioGroup f32530b;

    /* renamed from: a */
    public boolean mo46149a() {
        if (this.f32530b.getCheckedRadioButtonId() == f32529a) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m49902b() {
        LayoutInflater.from(getContext()).inflate(R.layout.wiki_moveto_dig_content, this);
        this.f32530b = (RadioGroup) findViewById(R.id.radio_group);
    }

    public MoveToDigContentView(Context context) {
        super(context);
        m49902b();
    }

    public MoveToDigContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49902b();
    }

    public MoveToDigContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m49902b();
    }
}
