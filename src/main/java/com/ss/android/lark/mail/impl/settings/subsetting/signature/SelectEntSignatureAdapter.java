package com.ss.android.lark.mail.impl.settings.subsetting.signature;

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
import com.ss.android.lark.mail.impl.entity.MailEntSignature;
import com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel;
import java.util.Collection;

public class SelectEntSignatureAdapter extends LarkRecyclerViewBaseAdapter<SelectEntSignatureItemViewHolder, MailEntSignature> {

    /* renamed from: a */
    Context f110569a;

    /* renamed from: b */
    AbstractC43559a f110570b;

    /* renamed from: c */
    boolean[] f110571c;

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.SelectEntSignatureAdapter$a */
    public interface AbstractC43559a {
        void onSignatureSelect(MailEntSignature mailEntSignature);
    }

    public class SelectEntSignatureItemViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private SelectEntSignatureItemViewHolder f110575a;

        @Override // butterknife.Unbinder
        public void unbind() {
            SelectEntSignatureItemViewHolder selectEntSignatureItemViewHolder = this.f110575a;
            if (selectEntSignatureItemViewHolder != null) {
                this.f110575a = null;
                selectEntSignatureItemViewHolder.mEntSignatureLayout = null;
                selectEntSignatureItemViewHolder.mEntSignatureName = null;
                selectEntSignatureItemViewHolder.mEntSignatureSelectedCB = null;
                selectEntSignatureItemViewHolder.mEntSignatureDivider = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public SelectEntSignatureItemViewHolder_ViewBinding(SelectEntSignatureItemViewHolder selectEntSignatureItemViewHolder, View view) {
            this.f110575a = selectEntSignatureItemViewHolder;
            selectEntSignatureItemViewHolder.mEntSignatureLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.ent_signature_select_layout, "field 'mEntSignatureLayout'", RelativeLayout.class);
            selectEntSignatureItemViewHolder.mEntSignatureName = (TextView) Utils.findRequiredViewAsType(view, R.id.ent_signature_select_name, "field 'mEntSignatureName'", TextView.class);
            selectEntSignatureItemViewHolder.mEntSignatureSelectedCB = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.ent_signature_selected_image, "field 'mEntSignatureSelectedCB'", UDCheckBox.class);
            selectEntSignatureItemViewHolder.mEntSignatureDivider = Utils.findRequiredView(view, R.id.ent_signature_select_divider, "field 'mEntSignatureDivider'");
        }
    }

    /* renamed from: a */
    public void mo155531a(AbstractC43559a aVar) {
        this.f110570b = aVar;
    }

    public static class SelectEntSignatureItemViewHolder extends RecyclerView.ViewHolder {
        @BindView(8779)
        public View mEntSignatureDivider;
        @BindView(8780)
        public RelativeLayout mEntSignatureLayout;
        @BindView(8781)
        public TextView mEntSignatureName;
        @BindView(8784)
        public UDCheckBox mEntSignatureSelectedCB;

        public SelectEntSignatureItemViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    /* renamed from: a */
    public void mo155529a(int i) {
        boolean[] zArr = new boolean[getItems().size()];
        this.f110571c = zArr;
        zArr[i] = true;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void mo155532a(Collection<? extends MailEntSignature> collection, int i) {
        boolean[] zArr = new boolean[collection.size()];
        this.f110571c = zArr;
        zArr[i] = true;
        resetAll(collection);
    }

    /* renamed from: a */
    public SelectEntSignatureItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        this.f110569a = context;
        return new SelectEntSignatureItemViewHolder(LayoutInflater.from(context).inflate(R.layout.mail_setting_ent_signature_select_item, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(SelectEntSignatureItemViewHolder selectEntSignatureItemViewHolder, final int i) {
        AbsSettingItemViewModel.ItemBackgroundType itemBackgroundType;
        final MailEntSignature mailEntSignature = (MailEntSignature) getItem(i);
        selectEntSignatureItemViewHolder.mEntSignatureName.setText(mailEntSignature.mo151386b());
        selectEntSignatureItemViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.SelectEntSignatureAdapter.View$OnClickListenerC435581 */

            public void onClick(View view) {
                if (SelectEntSignatureAdapter.this.f110570b != null) {
                    SelectEntSignatureAdapter.this.mo155529a(i);
                    SelectEntSignatureAdapter.this.f110570b.onSignatureSelect(mailEntSignature);
                }
            }
        });
        selectEntSignatureItemViewHolder.mEntSignatureSelectedCB.setChecked(this.f110571c[i]);
        if (i != this.items.size() - 1) {
            selectEntSignatureItemViewHolder.mEntSignatureDivider.setVisibility(0);
        } else {
            selectEntSignatureItemViewHolder.mEntSignatureDivider.setVisibility(8);
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
        AbsSettingItemViewModel.m172345a(selectEntSignatureItemViewHolder.itemView, itemBackgroundType);
    }
}
