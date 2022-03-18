package com.ss.android.vc.meeting.module.subtitle.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.vc.common.widget.LineHeightTextView;

public class SelectableTextView extends LineHeightTextView implements View.OnClickListener {

    /* renamed from: a */
    private Context f159344a;

    /* renamed from: b */
    private AbstractC63205a f159345b;

    /* renamed from: com.ss.android.vc.meeting.module.subtitle.widget.SelectableTextView$a */
    public interface AbstractC63205a {
        /* renamed from: a */
        void mo218691a(SelectableTextView selectableTextView);

        /* renamed from: b */
        void mo218692b(SelectableTextView selectableTextView);
    }

    /* renamed from: a */
    private void m247520a() {
        m247522b();
        setOnClickListener(this);
    }

    /* renamed from: b */
    private void m247522b() {
        setTextIsSelectable(false);
        setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.android.vc.meeting.module.subtitle.widget.$$Lambda$SelectableTextView$S2roQpxBZJapVdBj2SzhdFJApo */

            public final boolean onLongClick(View view) {
                return SelectableTextView.this.m247521a(view);
            }
        });
    }

    public void setCallBack(AbstractC63205a aVar) {
        this.f159345b = aVar;
    }

    public SelectableTextView(Context context) {
        this(context, null);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onClick(View view) {
        AbstractC63205a aVar = this.f159345b;
        if (aVar != null) {
            aVar.mo218692b(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m247521a(View view) {
        AbstractC63205a aVar = this.f159345b;
        if (aVar == null) {
            return false;
        }
        aVar.mo218691a(this);
        return true;
    }

    public SelectableTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SelectableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f159344a = context;
        m247520a();
    }
}
