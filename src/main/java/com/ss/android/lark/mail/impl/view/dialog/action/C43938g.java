package com.ss.android.lark.mail.impl.view.dialog.action;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mail.impl.view.dialog.action.g */
public class C43938g extends RecyclerView.Adapter<C43936f> {

    /* renamed from: a */
    private final String f111491a = "QuickAccessListAdapter";

    /* renamed from: b */
    private Context f111492b;

    /* renamed from: c */
    private List<ActionDialog.AbstractC43928c> f111493c;

    /* renamed from: d */
    private int f111494d;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (CollectionUtils.isEmpty(this.f111493c)) {
            return 0;
        }
        return this.f111493c.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo156382a(List<ActionDialog.AbstractC43928c> list) {
        this.f111493c = list;
        notifyDataSetChanged();
    }

    public C43938g(Context context) {
        this.f111492b = context;
        this.f111494d = context.getResources().getDimensionPixelSize(R.dimen.mail_action_dialog_quick_access_item_width);
    }

    /* renamed from: a */
    public C43936f onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(this.f111492b).inflate(R.layout.mail_action_dialog_quick_access_item, (ViewGroup) null);
        inflate.setLayoutParams(new RecyclerView.LayoutParams(this.f111494d, -1));
        return new C43936f(this.f111492b, inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(C43936f fVar, int i) {
        List<ActionDialog.AbstractC43928c> list;
        int i2;
        if (fVar != null && (list = this.f111493c) != null && list.size() > i) {
            fVar.mo156378a(this.f111493c.get(i));
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) fVar.itemView.getLayoutParams();
            if (layoutParams != null) {
                if (i == 0) {
                    i2 = UIHelper.dp2px(4.0f);
                } else {
                    i2 = 0;
                }
                layoutParams.setMargins(i2, 0, 0, 0);
                fVar.itemView.setLayoutParams(layoutParams);
            }
        }
    }
}
