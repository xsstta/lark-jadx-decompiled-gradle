package com.ss.android.lark.calendar.impl.features.search.calendar.vh;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.component.ui.p1151c.C25633a;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.search.calendar.vh.DataListItem;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30026d;

public class CalendarListHeaderViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    Context f82804a;
    @BindView(8767)
    ImageView mAvatarIV;
    @BindView(8964)
    ImageView mCalendarKindIv;
    @BindView(11725)
    View mDivider;
    @BindView(10194)
    View mMarginTopSpace;
    @BindView(10392)
    TextView mTvName;

    /* renamed from: a */
    public void mo118140a() {
        this.mDivider.setVisibility(8);
        this.mMarginTopSpace.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = this.mMarginTopSpace.getLayoutParams();
        layoutParams.height = UIUtils.dp2px(this.f82804a, 20.0f);
        this.mMarginTopSpace.setLayoutParams(layoutParams);
    }

    public CalendarListHeaderViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
        this.f82804a = view.getContext();
    }

    /* renamed from: a */
    public void mo118141a(DataListItem dataListItem) {
        AbstractC30026d b = dataListItem.mo118151b();
        Drawable d = C32634ae.m125184d(R.drawable.bg_enable_change_color_circle);
        this.mAvatarIV.setImageBitmap(null);
        if (dataListItem.mo118157g()) {
            this.mAvatarIV.setBackground(d);
            ((GradientDrawable) this.mAvatarIV.getBackground()).setColor(C25633a.m91708b(C32634ae.m125178a(R.color.primary_pri_500), 0.08f));
            this.mCalendarKindIv.setBackgroundColor(C25633a.m91708b(C32634ae.m125178a(R.color.primary_pri_500), 0.08f));
            this.mCalendarKindIv.setVisibility(0);
            this.mCalendarKindIv.setBackgroundResource(R.color.ud_N00);
            this.mCalendarKindIv.setImageResource(R.drawable.ud_icon_phone_colorful);
            this.mTvName.setText(dataListItem.mo118154d());
        } else if (dataListItem.mo118160j()) {
            this.mAvatarIV.setBackground(d);
            ((GradientDrawable) this.mAvatarIV.getBackground()).setColor(C25633a.m91708b(C32634ae.m125178a(R.color.primary_pri_500), 0.08f));
            this.mCalendarKindIv.setBackgroundColor(C25633a.m91708b(C32634ae.m125178a(R.color.primary_pri_500), 0.08f));
            this.mCalendarKindIv.setVisibility(0);
            this.mCalendarKindIv.setImageResource(R.drawable.ud_icon_exchange_colorful);
            this.mTvName.setText(dataListItem.mo118154d());
        } else if (dataListItem.mo118159i()) {
            this.mAvatarIV.setBackground(d);
            ((GradientDrawable) this.mAvatarIV.getBackground()).setColor(C32634ae.m125178a(R.color.bg_base));
            this.mCalendarKindIv.setBackgroundResource(R.color.bg_base);
            this.mCalendarKindIv.setVisibility(0);
            this.mCalendarKindIv.setImageResource(R.drawable.ud_icon_google_colorful);
            this.mTvName.setText(dataListItem.mo118154d());
        } else if (b != null) {
            this.mCalendarKindIv.setVisibility(8);
            this.mTvName.setText(C30022a.f74882a.chatModuleDependency().mo108219a(b));
            C30022a.f74882a.imageDependency().mo108246a(this.f82804a, b.getAvatarKey(), b.getId(), this.mAvatarIV, 48, 48);
        } else {
            return;
        }
        if (dataListItem.mo118153c() != DataListItem.TYPE.HEADER) {
            return;
        }
        if (dataListItem.mo118155e()) {
            this.mDivider.setVisibility(8);
            this.mMarginTopSpace.setVisibility(0);
            return;
        }
        this.mDivider.setVisibility(0);
        this.mMarginTopSpace.setVisibility(8);
    }
}
