package com.ss.android.lark.widget.select;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;

public abstract class SelectableView extends View {

    /* renamed from: k */
    protected State f146627k;

    public enum State {
        NORMAL,
        SELECTED,
        HIGHLIGHTED
    }

    public abstract CharSequence getContent();

    public abstract Layout getLayout();

    public abstract void setContentText(CharSequence charSequence);

    public abstract void setHighlightedColor(int i);

    public abstract void setSelectedColor(int i);

    public State getState() {
        return this.f146627k;
    }

    public SelectableView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo200853a(State state) {
        this.f146627k = state;
        invalidate();
    }

    public SelectableView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SelectableView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f146627k = State.NORMAL;
    }
}
