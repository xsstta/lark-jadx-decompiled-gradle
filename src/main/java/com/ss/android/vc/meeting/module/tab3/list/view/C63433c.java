package com.ss.android.vc.meeting.module.tab3.list.view;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.ui.p1198b.C26186b;
import com.larksuite.framework.ui.p1198b.C26198f;
import com.ss.android.vc.meeting.module.tab3.widgets.StickyHeaderView;

/* renamed from: com.ss.android.vc.meeting.module.tab3.list.view.c */
public class C63433c extends C26186b {

    /* renamed from: c */
    private final RecyclerView f160182c;

    /* renamed from: d */
    private final C26198f f160183d;

    /* renamed from: e */
    private int f160184e = -1;

    public C63433c(RecyclerView recyclerView, C26198f fVar) {
        super(recyclerView, fVar);
        this.f160182c = recyclerView;
        this.f160183d = fVar;
    }

    @Override // com.larksuite.framework.ui.p1198b.C26186b, androidx.recyclerview.widget.RecyclerView.AbstractC1338g
    /* renamed from: b */
    public void mo6563b(RecyclerView recyclerView, MotionEvent motionEvent) {
        View a;
        super.mo6563b(recyclerView, motionEvent);
        int a2 = this.f160183d.mo93180a((int) motionEvent.getX(), (int) motionEvent.getY());
        if (motionEvent.getAction() == 0) {
            this.f160184e = a2;
        }
        int i = this.f160184e;
        if (!(i == -1 || (a = this.f160183d.mo93181a(this.f160182c, i)) == null || !(a instanceof StickyHeaderView))) {
            ((StickyHeaderView) a).mo219460a(motionEvent);
        }
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f160184e = -1;
        }
    }
}
