package com.bytedance.ee.bear.reminder.person;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.ee.bear.reminder.model.ReminderUserEntity;
import java.util.List;

public class ReminderPersonView extends LinearLayout {

    /* renamed from: a */
    private PersonMoreItemView f28542a;

    public ReminderPersonView(Context context) {
        this(context, null);
    }

    public void setUserEntityList(List<ReminderUserEntity> list) {
        removeAllViews();
        if (!(list == null || list.isEmpty())) {
            int min = Math.min(3, list.size());
            for (int i = 0; i < min; i++) {
                PersonItemView personItemView = new PersonItemView(getContext());
                personItemView.mo40238a(list.get(i).getAvatarUrl());
                addView(personItemView);
            }
            if (list.size() > 3) {
                if (this.f28542a == null) {
                    this.f28542a = new PersonMoreItemView(getContext());
                }
                this.f28542a.mo40239a(String.format("%s+", Integer.valueOf(list.size() - 3)));
                addView(this.f28542a);
            }
        }
    }

    public ReminderPersonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ReminderPersonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(0);
    }
}
