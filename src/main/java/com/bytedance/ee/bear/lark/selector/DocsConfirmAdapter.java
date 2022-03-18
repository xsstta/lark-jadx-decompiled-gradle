package com.bytedance.ee.bear.lark.selector;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.avatar.AvatarType;
import com.larksuite.component.ui.avatar.DocAvatarModel;
import com.larksuite.component.ui.avatar.LarkAvatar;
import com.larksuite.component.ui.badge.miniicon.MiniIconModel;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.utils.UIHelper;

public class DocsConfirmAdapter extends LarkRecyclerViewBaseAdapter<ViewHolder, DocSelectorViewData> {

    /* renamed from: a */
    public AbstractC8069a f21609a;

    /* renamed from: b */
    private Context f21610b;

    /* renamed from: com.bytedance.ee.bear.lark.selector.DocsConfirmAdapter$a */
    public interface AbstractC8069a {
        /* renamed from: a */
        void mo31204a(int i);
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f21613a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ViewHolder viewHolder = this.f21613a;
            if (viewHolder != null) {
                this.f21613a = null;
                viewHolder.mSingleAvatorIV = null;
                viewHolder.mNameTV = null;
                viewHolder.mDescTV = null;
                viewHolder.mRmBtn = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f21613a = viewHolder;
            viewHolder.mSingleAvatorIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.group_avatar, "field 'mSingleAvatorIV'", ImageView.class);
            viewHolder.mNameTV = (TextView) Utils.findRequiredViewAsType(view, R.id.item_title, "field 'mNameTV'", TextView.class);
            viewHolder.mDescTV = (TextView) Utils.findRequiredViewAsType(view, R.id.item_desc, "field 'mDescTV'", TextView.class);
            viewHolder.mRmBtn = Utils.findRequiredView(view, R.id.rm_btn, "field 'mRmBtn'");
        }
    }

    /* renamed from: a */
    public void mo31202a(AbstractC8069a aVar) {
        this.f21609a = aVar;
    }

    /* access modifiers changed from: package-private */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(8856)
        TextView mDescTV;
        @BindView(8874)
        TextView mNameTV;
        @BindView(9614)
        View mRmBtn;
        @BindView(8736)
        ImageView mSingleAvatorIV;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    public DocsConfirmAdapter(Context context) {
        this.f21610b = context;
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.f21610b).inflate(R.layout.docs_confirm_item, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        final DocSelectorViewData docSelectorViewData = (DocSelectorViewData) getItem(i);
        if (LarkAvatar.m91600a()) {
            DocAvatarModel dVar = new DocAvatarModel();
            dVar.mo89008b(docSelectorViewData.icon.getValue());
            dVar.mo89006a(docSelectorViewData.getImageKeyType());
            dVar.mo89002a(docSelectorViewData.docType.getNumber());
            dVar.mo89003a(docSelectorViewData.title);
            LarkAvatar.m91597a(this.f21610b).mo89065a(dVar).mo89064a(new MiniIconModel(AvatarType.DOC)).mo89066a(viewHolder.mSingleAvatorIV);
        } else {
            viewHolder.mSingleAvatorIV.setImageResource(DocModuleInner.m32270a(docSelectorViewData.docType, docSelectorViewData.wikiSubType, docSelectorViewData.title));
        }
        if (TextUtils.isEmpty(docSelectorViewData.title)) {
            viewHolder.mNameTV.setText(R.string.Lark_Legacy_DefaultName);
        } else {
            viewHolder.mNameTV.setText(docSelectorViewData.title);
        }
        viewHolder.mDescTV.setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_ItemDesc, "owner", docSelectorViewData.ownerName));
        viewHolder.mDescTV.setVisibility(0);
        viewHolder.mRmBtn.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.lark.selector.DocsConfirmAdapter.View$OnClickListenerC80681 */

            public void onClick(View view) {
                DocsConfirmAdapter.this.remove(docSelectorViewData);
                if (DocsConfirmAdapter.this.f21609a != null) {
                    DocsConfirmAdapter.this.f21609a.mo31204a(DocsConfirmAdapter.this.getItemCount());
                }
            }
        });
    }
}
