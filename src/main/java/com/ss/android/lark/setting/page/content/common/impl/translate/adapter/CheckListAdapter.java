package com.ss.android.lark.setting.page.content.common.impl.translate.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.setting.page.content.common.impl.translate.adapter.CheckListAdapter;
import com.ss.android.lark.setting.page.content.common.impl.translate.p2665a.C54226a;
import java.util.HashSet;
import java.util.Set;

public class CheckListAdapter extends LarkRecyclerViewBaseAdapter<ViewHolder, C54226a> {

    /* renamed from: a */
    private final LayoutInflater f134241a;

    /* renamed from: b */
    private int f134242b;

    /* renamed from: c */
    private AbstractC54227a f134243c;

    /* renamed from: d */
    private Set<String> f134244d;

    /* renamed from: e */
    private boolean f134245e;

    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.adapter.CheckListAdapter$a */
    public interface AbstractC54227a {
        void onCheckChanged(Set<String> set);
    }

    /* renamed from: a */
    public Set<String> mo185606a() {
        return this.f134244d;
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f134247a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ViewHolder viewHolder = this.f134247a;
            if (viewHolder != null) {
                this.f134247a = null;
                viewHolder.mItemNameTV = null;
                viewHolder.mSelectRB = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f134247a = viewHolder;
            viewHolder.mItemNameTV = (TextView) Utils.findRequiredViewAsType(view, R.id.language_name, "field 'mItemNameTV'", TextView.class);
            viewHolder.mSelectRB = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.select_state, "field 'mSelectRB'", UDCheckBox.class);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(7172)
        public TextView mItemNameTV;
        @BindView(7675)
        public UDCheckBox mSelectRB;

        /* renamed from: a */
        public void mo185611a(boolean z) {
            this.mSelectRB.setChecked(z);
        }

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
            this.mSelectRB.setClickable(false);
        }
    }

    /* renamed from: a */
    public void mo185608a(AbstractC54227a aVar) {
        this.f134243c = aVar;
    }

    /* renamed from: a */
    public void mo185609a(Set<String> set) {
        this.f134244d = set;
    }

    public CheckListAdapter(Context context) {
        this.f134244d = new HashSet();
        this.f134245e = true;
        this.f134241a = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public void mo185610a(boolean z) {
        this.f134245e = z;
    }

    public CheckListAdapter(Context context, int i) {
        this(context);
        this.f134242b = i;
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.f134241a;
        int i2 = this.f134242b;
        if (i2 == 0) {
            i2 = R.layout.item_translate_language_layout;
        }
        return new ViewHolder(layoutInflater.inflate(i2, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        C54226a aVar = (C54226a) getItem(i);
        if (aVar != null) {
            viewHolder.mItemNameTV.setText(aVar.mo185601b());
            boolean contains = this.f134244d.contains(aVar.mo185600a());
            viewHolder.mo185611a(contains);
            viewHolder.itemView.setTag(Boolean.valueOf(contains));
            viewHolder.itemView.setOnClickListener(new View.OnClickListener(viewHolder, aVar) {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.adapter.$$Lambda$CheckListAdapter$bvi_E_tPCgAPR0aOcCdD6lfwYJA */
                public final /* synthetic */ CheckListAdapter.ViewHolder f$1;
                public final /* synthetic */ C54226a f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(View view) {
                    CheckListAdapter.lambda$bvi_E_tPCgAPR0aOcCdD6lfwYJA(CheckListAdapter.this, this.f$1, this.f$2, view);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m210603a(ViewHolder viewHolder, C54226a aVar, View view) {
        boolean booleanValue = ((Boolean) viewHolder.itemView.getTag()).booleanValue();
        String a = aVar.mo185600a();
        boolean z = true;
        if (this.f134245e) {
            if (!booleanValue) {
                this.f134244d.clear();
                this.f134244d.add(a);
            } else {
                z = false;
            }
        } else if (booleanValue) {
            this.f134244d.remove(a);
        } else {
            this.f134244d.add(a);
        }
        if (z) {
            notifyDataSetChanged();
            AbstractC54227a aVar2 = this.f134243c;
            if (aVar2 != null) {
                aVar2.onCheckChanged(this.f134244d);
            }
        }
    }
}
