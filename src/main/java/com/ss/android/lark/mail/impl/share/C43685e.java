package com.ss.android.lark.mail.impl.share;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mail.impl.share.e */
public class C43685e extends RecyclerView.Adapter {

    /* renamed from: a */
    public AbstractC43687a f110836a;

    /* renamed from: b */
    private final String f110837b = "ShareMemberSelectedListAdapter";

    /* renamed from: c */
    private Context f110838c;

    /* renamed from: d */
    private int f110839d;

    /* renamed from: e */
    private int f110840e;

    /* renamed from: f */
    private int f110841f;

    /* renamed from: g */
    private int f110842g;

    /* renamed from: h */
    private ArrayList<C43689g> f110843h;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.share.e$a */
    public interface AbstractC43687a {
        /* renamed from: a */
        void mo155765a(int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList<C43689g> arrayList = this.f110843h;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo155763a(ArrayList<C43689g> arrayList) {
        Log.m165389i("ShareMemberSelectedListAdapter", "update list");
        this.f110843h = arrayList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C43688f(this.f110838c, LayoutInflater.from(this.f110838c).inflate(R.layout.mail_share_add_member_selected_item, (ViewGroup) null));
    }

    C43685e(Context context, AbstractC43687a aVar) {
        this.f110838c = context;
        this.f110836a = aVar;
        this.f110839d = context.getResources().getDimensionPixelSize(R.dimen.mail_share_member_selected_item_horizontal_margin);
        this.f110840e = context.getResources().getDimensionPixelSize(R.dimen.mail_share_member_selected_item_vertical_margin);
        this.f110841f = context.getResources().getDimensionPixelSize(R.dimen.mail_share_member_selected_avatar_size);
        this.f110842g = UIHelper.dp2px(16.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        ArrayList<C43689g> arrayList;
        if ((viewHolder instanceof C43688f) && (arrayList = this.f110843h) != null && arrayList.size() > i) {
            ((C43688f) viewHolder).mo155766a(this.f110843h.get(i));
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.share.C43685e.View$OnClickListenerC436861 */

                public void onClick(View view) {
                    if (C43685e.this.f110836a != null) {
                        C43685e.this.f110836a.mo155765a(i);
                    }
                }
            });
            ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
            if (layoutParams == null) {
                int i2 = this.f110841f;
                layoutParams = new RecyclerView.LayoutParams(i2, i2);
            }
            if (layoutParams instanceof RecyclerView.LayoutParams) {
                if (i == 0) {
                    int i3 = this.f110842g;
                    int i4 = this.f110839d;
                    ((RecyclerView.LayoutParams) layoutParams).setMargins(i3, i4, this.f110840e, i4);
                } else if (i == this.f110843h.size() - 1) {
                    int i5 = this.f110840e;
                    int i6 = this.f110839d;
                    ((RecyclerView.LayoutParams) layoutParams).setMargins(i5, i6, this.f110842g, i6);
                } else {
                    int i7 = this.f110840e;
                    int i8 = this.f110839d;
                    ((RecyclerView.LayoutParams) layoutParams).setMargins(i7, i8, i7, i8);
                }
                viewHolder.itemView.setLayoutParams(layoutParams);
            }
        }
    }
}
