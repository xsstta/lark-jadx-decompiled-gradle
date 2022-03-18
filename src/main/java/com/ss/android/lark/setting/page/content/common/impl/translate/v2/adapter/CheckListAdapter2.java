package com.ss.android.lark.setting.page.content.common.impl.translate.v2.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.adapter.CheckListAdapter2;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.C54375a;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashSet;
import java.util.Set;

public class CheckListAdapter2 extends LarkRecyclerViewBaseAdapter<ViewHolder, C54375a> {

    /* renamed from: a */
    private final LayoutInflater f134386a;

    /* renamed from: b */
    private int f134387b;

    /* renamed from: c */
    private AbstractC54308a f134388c;

    /* renamed from: d */
    private Set<String> f134389d = new HashSet();

    /* renamed from: e */
    private boolean f134390e = true;

    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.adapter.CheckListAdapter2$a */
    public interface AbstractC54308a {
        void onCheckChanged(Set<String> set);
    }

    /* renamed from: a */
    public Set<String> mo185828a() {
        return this.f134389d;
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f134392a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ViewHolder viewHolder = this.f134392a;
            if (viewHolder != null) {
                this.f134392a = null;
                viewHolder.mTitleTV = null;
                viewHolder.mDescTV = null;
                viewHolder.mSelectRB = null;
                viewHolder.mDivider = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f134392a = viewHolder;
            viewHolder.mTitleTV = (TextView) Utils.findRequiredViewAsType(view, R.id.item_title, "field 'mTitleTV'", TextView.class);
            viewHolder.mDescTV = (TextView) Utils.findRequiredViewAsType(view, R.id.item_desc, "field 'mDescTV'", TextView.class);
            viewHolder.mSelectRB = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.language_selected_tick, "field 'mSelectRB'", UDCheckBox.class);
            viewHolder.mDivider = Utils.findRequiredView(view, R.id.item_divider, "field 'mDivider'");
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(7097)
        public TextView mDescTV;
        @BindView(7098)
        public View mDivider;
        @BindView(7174)
        public UDCheckBox mSelectRB;
        @BindView(7105)
        public TextView mTitleTV;

        /* renamed from: a */
        public void mo185833a(boolean z) {
            this.mSelectRB.setChecked(z);
        }

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
            this.mSelectRB.setClickable(false);
        }
    }

    /* renamed from: a */
    public void mo185830a(AbstractC54308a aVar) {
        this.f134388c = aVar;
    }

    /* renamed from: a */
    public void mo185831a(Set<String> set) {
        this.f134389d = set;
    }

    public CheckListAdapter2(Context context) {
        this.f134386a = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public int mo185826a(String str) {
        int itemCount = getItemCount();
        for (int i = 0; i < itemCount; i++) {
            C54375a aVar = (C54375a) getItem(i);
            if (aVar != null && TextUtils.equals(aVar.mo185970a(), str)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void mo185832a(boolean z) {
        this.f134390e = z;
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.f134386a;
        int i2 = this.f134387b;
        if (i2 == 0) {
            i2 = R.layout.item_translate_language_layout2;
        }
        View inflate = layoutInflater.inflate(i2, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(inflate);
        if (DesktopUtil.m144307b() && this.f134387b == 0) {
            DesktopUtil.m144299a(viewHolder.mTitleTV);
            ((ConstraintLayout) inflate.findViewById(R.id.language_layout)).setMinHeight(UIHelper.dp2px(48.0f));
        }
        return viewHolder;
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        C54375a aVar = (C54375a) getItem(i);
        if (aVar != null) {
            viewHolder.mTitleTV.setText(aVar.mo185971b());
            if (TextUtils.isEmpty(aVar.mo185972c())) {
                viewHolder.mDescTV.setVisibility(8);
            } else {
                viewHolder.mDescTV.setVisibility(0);
                viewHolder.mDescTV.setText(aVar.mo185972c());
            }
            viewHolder.mDescTV.setVisibility(8);
            boolean contains = this.f134389d.contains(aVar.mo185970a());
            viewHolder.mo185833a(contains);
            viewHolder.itemView.setTag(Boolean.valueOf(contains));
            viewHolder.itemView.setOnClickListener(new View.OnClickListener(viewHolder, aVar) {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.adapter.$$Lambda$CheckListAdapter2$6fn_UeFKZyqecWv5LCzC4vyGEk */
                public final /* synthetic */ CheckListAdapter2.ViewHolder f$1;
                public final /* synthetic */ C54375a f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(View view) {
                    CheckListAdapter2.m270965lambda$6fn_UeFKZyqecWv5LCzC4vyGEk(CheckListAdapter2.this, this.f$1, this.f$2, view);
                }
            });
            if (i == this.items.size() - 1) {
                viewHolder.mDivider.setVisibility(4);
            } else {
                viewHolder.mDivider.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m210868a(ViewHolder viewHolder, C54375a aVar, View view) {
        boolean booleanValue = ((Boolean) viewHolder.itemView.getTag()).booleanValue();
        String a = aVar.mo185970a();
        boolean z = true;
        if (this.f134390e) {
            if (!booleanValue) {
                this.f134389d.clear();
                this.f134389d.add(a);
            } else {
                z = false;
            }
        } else if (booleanValue) {
            this.f134389d.remove(a);
        } else {
            this.f134389d.add(a);
        }
        if (z) {
            notifyDataSetChanged();
            AbstractC54308a aVar2 = this.f134388c;
            if (aVar2 != null) {
                aVar2.onCheckChanged(this.f134389d);
            }
        }
    }
}
