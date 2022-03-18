package com.ss.android.lark.calendar.impl.features.search.calendar.vh;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.UIUtils;

public class CalendarListShowMoreViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    View f82806a;
    @BindView(9800)
    ImageView mIvShowMore;
    @BindView(11447)
    TextView mTvShowMore;

    /* renamed from: a */
    public void mo118142a(DataListItem dataListItem) {
        this.mTvShowMore.setText(dataListItem.mo118154d());
    }

    public CalendarListShowMoreViewHolder(View view, final View.OnClickListener onClickListener) {
        super(view);
        this.f82806a = view;
        ButterKnife.bind(this, view);
        this.mTvShowMore.setWidth(UIUtils.dp2px(this.f82806a.getContext(), 300.0f));
        view.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.search.calendar.vh.CalendarListShowMoreViewHolder.View$OnClickListenerC323471 */

            public void onClick(View view) {
                onClickListener.onClick(view);
            }
        });
    }
}
