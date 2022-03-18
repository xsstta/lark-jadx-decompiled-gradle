package com.ss.android.vc.meeting.module.tab3.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.ss.android.vc.meeting.module.tab3.list.view.C63409b;

public class RefreshLayout extends SmartRefreshLayout {
    /* renamed from: y */
    public void mo219456y() {
        ((C63409b) getRefreshFooter()).mo219418b(true);
    }

    public RefreshLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo219455a(View.OnClickListener onClickListener) {
        C63409b bVar = new C63409b(new LoadMoreView(getContext()));
        bVar.mo219416a(new View.OnClickListener(onClickListener) {
            /* class com.ss.android.vc.meeting.module.tab3.widgets.$$Lambda$RefreshLayout$8aJAIlnhZCnbztGaPYIQesCNM9c */
            public final /* synthetic */ View.OnClickListener f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                RefreshLayout.m248514a(C63409b.this, this.f$1, view);
            }
        });
        mo96367b(bVar);
        mo96363b((float) 48);
    }

    public RefreshLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m248514a(C63409b bVar, View.OnClickListener onClickListener, View view) {
        bVar.mo219418b(false);
        onClickListener.onClick(view);
    }

    public RefreshLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public RefreshLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
