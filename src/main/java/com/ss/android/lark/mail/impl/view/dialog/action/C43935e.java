package com.ss.android.lark.mail.impl.view.dialog.action;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mail.impl.view.dialog.action.e */
public class C43935e extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private Context f111482a;

    /* renamed from: b */
    private RecyclerView f111483b;

    /* renamed from: c */
    private C43938g f111484c;

    /* renamed from: d */
    private List<ActionDialog.AbstractC43928c> f111485d;

    /* renamed from: a */
    private void m174073a() {
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.action_dialog_quick_access_list);
        this.f111483b = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f111482a, 0, false));
        C43938g gVar = new C43938g(this.f111482a);
        this.f111484c = gVar;
        this.f111483b.setAdapter(gVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo156377a(List<ActionDialog.AbstractC43928c> list) {
        this.f111485d = list;
        this.f111484c.mo156382a(list);
    }

    C43935e(Context context, View view) {
        super(view);
        this.f111482a = context;
        m174073a();
    }
}
