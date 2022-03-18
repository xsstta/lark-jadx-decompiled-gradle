package com.ss.android.lark.invitation.v2.feat.external.p2054a;

import android.app.Activity;
import android.view.MotionEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.dialog.AbstractC58413a;
import com.ss.android.lark.widget.recyclerview.PullDownRecyclerView;
import com.ss.android.lark.widget.recyclerview.p2964a.C58973b;
import java.util.List;

/* renamed from: com.ss.android.lark.invitation.v2.feat.external.a.b */
public class C40203b extends AbstractC58413a<C40203b> {

    /* renamed from: a */
    private C58973b<C40201a> f102141a;

    /* renamed from: b */
    private List<C40201a> f102142b;

    /* renamed from: c */
    private PullDownRecyclerView f102143c;

    @Override // com.ss.android.lark.widget.dialog.AbstractC58413a
    /* renamed from: a */
    public int mo145866a() {
        return R.layout.inv_invite_external_search_drawer_dialog_more_than_one;
    }

    @Override // com.ss.android.lark.widget.dialog.AbstractC58413a
    /* renamed from: a */
    public C25639g mo145867a(C25639g gVar) {
        return gVar.mo89234b(1.0f);
    }

    @Override // com.ss.android.lark.widget.dialog.AbstractC58413a
    /* renamed from: c */
    public void mo145868c(DialogC25637f fVar) {
        this.f102143c = (PullDownRecyclerView) fVar.findViewById(R.id.iesmtoRv);
        C58973b<C40201a> bVar = new C58973b<>();
        this.f102141a = bVar;
        bVar.mo200080a(this.f102142b);
        this.f102143c.setAdapter(this.f102141a);
        this.f102143c.setLayoutManager(new LinearLayoutManager(this.f143774l));
        this.f102143c.setOnPullDownListener(new PullDownRecyclerView.AbstractC58966a() {
            /* class com.ss.android.lark.invitation.v2.feat.external.p2054a.C40203b.C402041 */

            @Override // com.ss.android.lark.widget.recyclerview.PullDownRecyclerView.AbstractC58966a
            /* renamed from: a */
            public void mo145869a(MotionEvent motionEvent) {
                C40203b.this.f143778p.dispatchTouchEvent(motionEvent);
            }

            @Override // com.ss.android.lark.widget.recyclerview.PullDownRecyclerView.AbstractC58966a
            /* renamed from: b */
            public void mo145870b(MotionEvent motionEvent) {
                C40203b.this.f143778p.dispatchTouchEvent(motionEvent);
            }
        });
    }

    public C40203b(Activity activity, List<C40201a> list) {
        super(activity);
        this.f102142b = list;
    }
}
