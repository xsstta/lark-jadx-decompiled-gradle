package com.ss.android.lark.feed.app.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.internal.Utils;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.suite.R;
import com.ss.android.lark.feed.app.menu.BaseMenuAdapter;
import com.ss.android.lark.feed.app.menu.entity.MenuItem;
import com.ss.android.lark.utils.UIHelper;

public class FilterTypeMenuAdapterV2 extends BaseMenuAdapter {

    public class FeedMenuViewHolder_ViewBinding extends BaseMenuAdapter.MenuViewHolder_ViewBinding {

        /* renamed from: a */
        private FeedMenuViewHolder f96531a;

        @Override // butterknife.Unbinder, com.ss.android.lark.feed.app.menu.BaseMenuAdapter.MenuViewHolder_ViewBinding
        public void unbind() {
            FeedMenuViewHolder feedMenuViewHolder = this.f96531a;
            if (feedMenuViewHolder != null) {
                this.f96531a = null;
                feedMenuViewHolder.mBadgeView = null;
                feedMenuViewHolder.divider = null;
                super.unbind();
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public FeedMenuViewHolder_ViewBinding(FeedMenuViewHolder feedMenuViewHolder, View view) {
            super(feedMenuViewHolder, view);
            this.f96531a = feedMenuViewHolder;
            feedMenuViewHolder.mBadgeView = (LKUIBadgeView) Utils.findRequiredViewAsType(view, R.id.message_count, "field 'mBadgeView'", LKUIBadgeView.class);
            feedMenuViewHolder.divider = Utils.findRequiredView(view, R.id.feed_type_divider, "field 'divider'");
        }
    }

    static class FeedMenuViewHolder extends BaseMenuAdapter.MenuViewHolder {
        @BindView(6407)
        View divider;
        @BindView(6666)
        LKUIBadgeView mBadgeView;

        FeedMenuViewHolder(View view) {
            super(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        this.f96479c = viewGroup.getContext();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_feed_type_menu_list_item, viewGroup, false);
        inflate.setOnClickListener(this.f96481e);
        return new FeedMenuViewHolder(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.itemView.setTag(Integer.valueOf(i));
        FeedMenuViewHolder feedMenuViewHolder = (FeedMenuViewHolder) viewHolder;
        MenuItem menuItem = (MenuItem) this.f96477a.get(i);
        mo138048b(feedMenuViewHolder, menuItem.f96555a);
        feedMenuViewHolder.itemView.setBackgroundResource(R.drawable.feed_menu_bg_item_pressed);
        if (menuItem.f96555a == this.f96478b) {
            feedMenuViewHolder.mLabelTV.setTextColor(this.f96479c.getResources().getColor(R.color.lkui_B500));
        } else {
            feedMenuViewHolder.mLabelTV.setTextColor(this.f96479c.getResources().getColor(R.color.lkui_N900));
        }
        if (i > 0) {
            feedMenuViewHolder.divider.setVisibility(0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) feedMenuViewHolder.divider.getLayoutParams();
            marginLayoutParams.leftMargin = UIHelper.dp2px(16.0f);
            feedMenuViewHolder.divider.setLayoutParams(marginLayoutParams);
        } else {
            feedMenuViewHolder.divider.setVisibility(8);
        }
        feedMenuViewHolder.mBadgeView.setVisibility(8);
    }
}
