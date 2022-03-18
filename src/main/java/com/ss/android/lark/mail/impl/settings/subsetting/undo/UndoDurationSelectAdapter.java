package com.ss.android.lark.mail.impl.settings.subsetting.undo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.C42105q;
import com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel;
import java.util.List;

public class UndoDurationSelectAdapter extends LarkRecyclerViewBaseAdapter<UndoDurationItemViewHolder, C42105q> {

    /* renamed from: a */
    protected AbstractC43617a f110665a;

    /* renamed from: b */
    private Context f110666b;

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.undo.UndoDurationSelectAdapter$a */
    public interface AbstractC43617a {
        /* renamed from: a */
        void mo155635a(C42105q qVar);
    }

    public class UndoDurationItemViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private UndoDurationItemViewHolder f110670a;

        @Override // butterknife.Unbinder
        public void unbind() {
            UndoDurationItemViewHolder undoDurationItemViewHolder = this.f110670a;
            if (undoDurationItemViewHolder != null) {
                this.f110670a = null;
                undoDurationItemViewHolder.mUndoDurationLayout = null;
                undoDurationItemViewHolder.mUndoDurationName = null;
                undoDurationItemViewHolder.mUndoDurationSelectedRB = null;
                undoDurationItemViewHolder.mUndoDurationDivider = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public UndoDurationItemViewHolder_ViewBinding(UndoDurationItemViewHolder undoDurationItemViewHolder, View view) {
            this.f110670a = undoDurationItemViewHolder;
            undoDurationItemViewHolder.mUndoDurationLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.mail_undo_duration_layout, "field 'mUndoDurationLayout'", RelativeLayout.class);
            undoDurationItemViewHolder.mUndoDurationName = (TextView) Utils.findRequiredViewAsType(view, R.id.mail_undo_duration_name, "field 'mUndoDurationName'", TextView.class);
            undoDurationItemViewHolder.mUndoDurationSelectedRB = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.mail_undo_duration_selected_image, "field 'mUndoDurationSelectedRB'", UDCheckBox.class);
            undoDurationItemViewHolder.mUndoDurationDivider = Utils.findRequiredView(view, R.id.mail_undo_duration_divider, "field 'mUndoDurationDivider'");
        }
    }

    /* renamed from: a */
    public void mo155641a(AbstractC43617a aVar) {
        this.f110665a = aVar;
    }

    public static class UndoDurationItemViewHolder extends RecyclerView.ViewHolder {
        @BindView(9577)
        public View mUndoDurationDivider;
        @BindView(9578)
        public RelativeLayout mUndoDurationLayout;
        @BindView(9580)
        public TextView mUndoDurationName;
        @BindView(9581)
        public UDCheckBox mUndoDurationSelectedRB;

        public UndoDurationItemViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public long getItemId(int i) {
        return ((C42105q) getItem(i)).mo152029b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo155637a(int i) {
        List<C42105q> items = getItems();
        for (C42105q qVar : items) {
            qVar.mo152028a(false);
        }
        ((C42105q) items.get(i)).mo152028a(true);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void mo155638a(long j) {
        boolean z;
        for (C42105q qVar : getItems()) {
            if (j == qVar.mo152029b()) {
                z = true;
            } else {
                z = false;
            }
            qVar.mo152028a(z);
        }
        notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo155640a(UndoDurationItemViewHolder undoDurationItemViewHolder, boolean z) {
        undoDurationItemViewHolder.mUndoDurationSelectedRB.setChecked(z);
    }

    /* renamed from: a */
    public UndoDurationItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        this.f110666b = context;
        return new UndoDurationItemViewHolder(LayoutInflater.from(context).inflate(R.layout.mail_setting_undo_duration_item, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(UndoDurationItemViewHolder undoDurationItemViewHolder, final int i) {
        AbsSettingItemViewModel.ItemBackgroundType itemBackgroundType;
        final C42105q qVar = (C42105q) getItem(i);
        undoDurationItemViewHolder.mUndoDurationName.setText(qVar.mo152027a());
        undoDurationItemViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.undo.UndoDurationSelectAdapter.View$OnClickListenerC436161 */

            public void onClick(View view) {
                if (UndoDurationSelectAdapter.this.f110665a != null) {
                    Log.m165389i("UndoDurationSelectAdapter", "===========selected:" + ((C42105q) UndoDurationSelectAdapter.this.getItem(i)).mo152027a() + "==========");
                    UndoDurationSelectAdapter.this.mo155637a(i);
                    UndoDurationSelectAdapter.this.f110665a.mo155635a(qVar);
                }
            }
        });
        mo155640a(undoDurationItemViewHolder, qVar.mo152030c());
        if (i != this.items.size() - 1) {
            undoDurationItemViewHolder.mUndoDurationDivider.setVisibility(0);
        } else {
            undoDurationItemViewHolder.mUndoDurationDivider.setVisibility(8);
        }
        if (this.items.size() == 1) {
            itemBackgroundType = AbsSettingItemViewModel.ItemBackgroundType.CIRCLE;
        } else if (i == 0) {
            itemBackgroundType = AbsSettingItemViewModel.ItemBackgroundType.TOP_CIRCLE;
        } else if (i == this.items.size() - 1) {
            itemBackgroundType = AbsSettingItemViewModel.ItemBackgroundType.BOTTOM_CIRCLE;
        } else {
            itemBackgroundType = AbsSettingItemViewModel.ItemBackgroundType.SQUARE;
        }
        AbsSettingItemViewModel.m172345a(undoDurationItemViewHolder.itemView, itemBackgroundType);
    }
}
