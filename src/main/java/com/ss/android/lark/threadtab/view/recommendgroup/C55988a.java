package com.ss.android.lark.threadtab.view.recommendgroup;

import androidx.recyclerview.widget.C1356d;
import com.ss.android.lark.threadtab.view.p2759a.C55987b;
import com.ss.android.lark.widget.recyclerview.AbstractView$OnClickListenerC58987e;
import java.util.List;

/* renamed from: com.ss.android.lark.threadtab.view.recommendgroup.a */
public class C55988a extends AbstractView$OnClickListenerC58987e<C55987b> {

    /* renamed from: a */
    private final C1356d<C55987b> f138377a;

    @Override // com.ss.android.lark.widget.recyclerview.AbstractC58983c, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f138377a.mo7374a().size();
    }

    /* renamed from: a */
    public void mo190832a(List<C55987b> list) {
        this.f138377a.mo7376a(list);
    }

    /* renamed from: b */
    public C55987b mo31276a(int i) {
        return this.f138377a.mo7374a().get(i);
    }
}
