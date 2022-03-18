package com.ss.android.lark.member_manage.impl.atselector.view.adapter.p2257a;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.member_manage.impl.atselector.bean.LabelAtBean;
import com.ss.android.lark.member_manage.impl.atselector.view.adapter.AbstractC45032b;
import com.ss.android.lark.member_manage.impl.atselector.view.adapter.holder.AtLabelViewHolder;
import com.ss.android.lark.ui.p2892a.C57582a;

/* renamed from: com.ss.android.lark.member_manage.impl.atselector.view.adapter.a.h */
public class C45031h implements AbstractC45032b<LabelAtBean, AtLabelViewHolder> {

    /* renamed from: c */
    Context f114024c;

    /* renamed from: a */
    public long mo159267a(LabelAtBean labelAtBean) {
        return -1;
    }

    /* renamed from: b */
    public AtLabelViewHolder mo159268a(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        this.f114024c = context;
        return new AtLabelViewHolder(LayoutInflater.from(context).inflate(R.layout.item_chat_at_label, viewGroup, false));
    }

    /* renamed from: a */
    public void mo159269a(AtLabelViewHolder atLabelViewHolder, LabelAtBean labelAtBean, int i) {
        if (this.f114024c == null) {
            this.f114024c = atLabelViewHolder.itemView.getContext();
        }
        if (!DesktopUtil.m144301a(this.f114024c)) {
            atLabelViewHolder.mLabelTV.setBackgroundColor(C57582a.m223616d(this.f114024c, labelAtBean.getBgColorResId()));
        }
        atLabelViewHolder.mLabelTV.setTextSize((float) labelAtBean.getTextSize());
        atLabelViewHolder.mLabelTV.setHeight(labelAtBean.getHeight());
        if (TextUtils.isEmpty(labelAtBean.getSubLabel())) {
            atLabelViewHolder.mLabelTV.setText(labelAtBean.getDisplayName());
            return;
        }
        String displayName = labelAtBean.getDisplayName();
        String subLabel = labelAtBean.getSubLabel();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) displayName).append((CharSequence) "  ").append((CharSequence) subLabel);
        int length = displayName.length() + 2;
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C57582a.m223616d(this.f114024c, R.color.text_caption)), length, subLabel.length() + length, 33);
        atLabelViewHolder.mLabelTV.setText(spannableStringBuilder);
    }
}
