package com.bytedance.ee.bear.lark.selector;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ee.bear.lark.p414b.AbstractC7988a;
import com.larksuite.component.ui.avatar.AvatarType;
import com.larksuite.component.ui.avatar.DocAvatarModel;
import com.larksuite.component.ui.avatar.LarkAvatar;
import com.larksuite.component.ui.badge.miniicon.MiniIconModel;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.AbstractC58992f;
import com.ss.android.lark.widget.recyclerview.AbstractC59013i;
import com.ss.android.lark.widget.recyclerview.C58984d;
import org.koin.java.KoinJavaComponent;

public class DocSearchItemHolderView extends AbstractC58992f<DocSelectorViewData, DocSearchItemViewHolder> {

    /* renamed from: a */
    private C58984d f21594a;

    public class DocSearchItemViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private DocSearchItemViewHolder f21595a;

        @Override // butterknife.Unbinder
        public void unbind() {
            DocSearchItemViewHolder docSearchItemViewHolder = this.f21595a;
            if (docSearchItemViewHolder != null) {
                this.f21595a = null;
                docSearchItemViewHolder.mSingleAvatorIV = null;
                docSearchItemViewHolder.mNameTV = null;
                docSearchItemViewHolder.mDescTV = null;
                docSearchItemViewHolder.mCheckBox = null;
                docSearchItemViewHolder.mTagTv = null;
                docSearchItemViewHolder.mDividingLine = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public DocSearchItemViewHolder_ViewBinding(DocSearchItemViewHolder docSearchItemViewHolder, View view) {
            this.f21595a = docSearchItemViewHolder;
            docSearchItemViewHolder.mSingleAvatorIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.group_avatar, "field 'mSingleAvatorIV'", ImageView.class);
            docSearchItemViewHolder.mNameTV = (TextView) Utils.findRequiredViewAsType(view, R.id.item_title, "field 'mNameTV'", TextView.class);
            docSearchItemViewHolder.mDescTV = (TextView) Utils.findRequiredViewAsType(view, R.id.item_desc, "field 'mDescTV'", TextView.class);
            docSearchItemViewHolder.mCheckBox = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.select_box, "field 'mCheckBox'", UDCheckBox.class);
            docSearchItemViewHolder.mTagTv = (TextView) Utils.findRequiredViewAsType(view, R.id.doc_tag, "field 'mTagTv'", TextView.class);
            docSearchItemViewHolder.mDividingLine = Utils.findRequiredView(view, R.id.dividing_line, "field 'mDividingLine'");
        }
    }

    public static class DocSearchItemViewHolder extends AbstractC59013i {
        @BindView(9743)
        UDCheckBox mCheckBox;
        @BindView(8856)
        TextView mDescTV;
        @BindView(8526)
        View mDividingLine;
        @BindView(8874)
        TextView mNameTV;
        @BindView(8736)
        ImageView mSingleAvatorIV;
        @BindView(8563)
        TextView mTagTv;

        public DocSearchItemViewHolder(View view, C58984d dVar) {
            super(view, dVar);
            ButterKnife.bind(this, view);
        }

        /* renamed from: a */
        public static DocSearchItemViewHolder m32278a(LayoutInflater layoutInflater, ViewGroup viewGroup, C58984d dVar) {
            return new DocSearchItemViewHolder(LayoutInflater.from(layoutInflater.getContext()).inflate(R.layout.activity_selector_docs_item, viewGroup, false), dVar);
        }
    }

    public DocSearchItemHolderView(Context context, C58984d dVar) {
        super(context);
        this.f21594a = dVar;
    }

    /* renamed from: a */
    public DocSearchItemViewHolder mo31176b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return DocSearchItemViewHolder.m32278a(layoutInflater, viewGroup, this.f21594a);
    }

    /* renamed from: a */
    public void mo31174a(DocSearchItemViewHolder docSearchItemViewHolder, int i, DocSelectorViewData docSelectorViewData) {
        boolean z;
        if (!docSelectorViewData.isShowCrossTenantTag || ((AbstractC7988a) KoinJavaComponent.m268610a(AbstractC7988a.class)).mo30978a()) {
            z = false;
        } else {
            z = true;
        }
        int i2 = 8;
        if (LarkAvatar.m91600a()) {
            DocAvatarModel dVar = new DocAvatarModel();
            dVar.mo89008b(docSelectorViewData.icon.getValue());
            dVar.mo89006a(docSelectorViewData.getImageKeyType());
            dVar.mo89002a(docSelectorViewData.docType.getNumber());
            dVar.mo89003a(docSelectorViewData.title);
            LarkAvatar.m91597a(this.f146181d).mo89065a(dVar).mo89064a(new MiniIconModel(AvatarType.DOC)).mo89066a(docSearchItemViewHolder.mSingleAvatorIV);
            LarkNameTag.m92208d(this.f146181d).mo90059a(z).mo90027e().mo90003a((View) docSearchItemViewHolder.mTagTv);
        } else {
            docSearchItemViewHolder.mSingleAvatorIV.setImageResource(DocModuleInner.m32270a(docSelectorViewData.docType, docSelectorViewData.wikiSubType, docSelectorViewData.title));
            if (z) {
                docSearchItemViewHolder.mTagTv.setVisibility(0);
                docSearchItemViewHolder.mTagTv.setText(R.string.Lark_Legacy_External);
                docSearchItemViewHolder.mTagTv.setBackgroundResource(R.drawable.red_tag_bg);
                docSearchItemViewHolder.mTagTv.setTextColor(UIHelper.getColor(R.color.function_danger_500));
            } else {
                docSearchItemViewHolder.mTagTv.setVisibility(8);
            }
        }
        UDCheckBox uDCheckBox = docSearchItemViewHolder.mCheckBox;
        if (docSearchItemViewHolder.mo200151b()) {
            i2 = 0;
        }
        uDCheckBox.setVisibility(i2);
        docSearchItemViewHolder.mCheckBox.setChecked(docSearchItemViewHolder.mo200150a());
        if (TextUtils.isEmpty(docSelectorViewData.title)) {
            docSearchItemViewHolder.mNameTV.setText(R.string.Lark_Legacy_DefaultName);
        } else {
            docSearchItemViewHolder.mNameTV.setText(C57782ag.m224235a(docSelectorViewData.title, docSelectorViewData.nameHitTerms, UIHelper.getColor(R.color.primary_pri_500)));
        }
        docSearchItemViewHolder.mDescTV.setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_ItemDesc, "owner", docSelectorViewData.ownerName));
        docSearchItemViewHolder.mDescTV.setVisibility(0);
    }
}
