package com.ss.android.lark.member_manage.impl.atselector.list;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class AtFrameLayout extends FrameLayout {

    /* renamed from: a */
    private AbstractC44979a f113889a;

    /* renamed from: com.ss.android.lark.member_manage.impl.atselector.list.AtFrameLayout$a */
    public interface AbstractC44979a {
        /* renamed from: a */
        void mo159200a(boolean z);
    }

    public AtFrameLayout(Context context) {
        super(context);
    }

    public void setOnSelectedListener(AbstractC44979a aVar) {
        this.f113889a = aVar;
    }

    public void setSelected(boolean z) {
        AbstractC44979a aVar = this.f113889a;
        if (aVar != null) {
            aVar.mo159200a(z);
        }
    }

    public AtFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AtFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
