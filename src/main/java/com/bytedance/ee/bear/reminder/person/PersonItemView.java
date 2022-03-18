package com.bytedance.ee.bear.reminder.person;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bytedance.ee.util.p703f.C13664a;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;

/* access modifiers changed from: package-private */
public class PersonItemView extends FrameLayout {

    /* renamed from: a */
    private ImageView f28540a;

    /* renamed from: a */
    private void m44094a() {
        setPadding(0, 0, C13749l.m55738a(8), 0);
        LayoutInflater.from(getContext()).inflate(R.layout.reminder_person_item, this);
        this.f28540a = (ImageView) findViewById(R.id.iv_reminder_person);
    }

    public PersonItemView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo40238a(String str) {
        ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(getContext()).mo10414a(new C13664a(str)).mo11123a((int) R.drawable.facade_common_avatar_place_holder)).mo11143c(R.drawable.facade_common_avatar_place_holder)).mo10399a(this.f28540a);
    }

    public PersonItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PersonItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m44094a();
    }
}
