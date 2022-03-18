package com.ss.android.lark.calendar.impl.features.search.calendar.vh;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32634ae;

public class CalendarListSubHeaderViewHolder extends RecyclerView.ViewHolder {
    @BindView(11111)
    TextView mTvTitle;
    @BindView(10756)
    View rootView;

    /* renamed from: a */
    public void mo118144a() {
        this.mTvTitle.setTextColor(C32634ae.m125178a(R.color.text_title));
        this.mTvTitle.setTextSize(1, 14.0f);
        TextView textView = this.mTvTitle;
        textView.setPadding(UIUtils.dp2px(textView.getContext(), 20.0f), UIUtils.dp2px(this.mTvTitle.getContext(), 20.0f), UIUtils.dp2px(this.mTvTitle.getContext(), 20.0f), UIUtils.dp2px(this.mTvTitle.getContext(), 12.0f));
        ViewGroup.LayoutParams layoutParams = this.rootView.getLayoutParams();
        layoutParams.height = UIUtils.dp2px(this.mTvTitle.getContext(), 52.0f);
        this.rootView.setLayoutParams(layoutParams);
    }

    public CalendarListSubHeaderViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }

    /* renamed from: a */
    public void mo118145a(DataListItem dataListItem) {
        this.mTvTitle.setText(dataListItem.mo118154d());
    }
}
