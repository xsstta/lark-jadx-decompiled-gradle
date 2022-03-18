package com.ss.android.vc.meeting.module.tab.history.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

public class TimerTextView extends AppCompatTextView {

    /* renamed from: a */
    private final Handler f159663a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private AbstractC63293a f159664b;

    /* renamed from: c */
    private boolean f159665c = false;

    /* renamed from: e */
    private String f159666e = "";

    /* renamed from: com.ss.android.vc.meeting.module.tab.history.view.TimerTextView$a */
    public interface AbstractC63293a {
    }

    public void setTimeChangeListener(AbstractC63293a aVar) {
        this.f159664b = aVar;
    }

    public TimerTextView(Context context) {
        super(context);
    }

    public TimerTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TimerTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
