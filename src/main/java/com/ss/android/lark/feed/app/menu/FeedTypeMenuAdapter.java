package com.ss.android.lark.feed.app.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.internal.Utils;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.feed.app.binder.C37414l;
import com.ss.android.lark.feed.app.menu.BaseMenuAdapter;
import com.ss.android.lark.feed.app.menu.entity.MenuItem;

public class FeedTypeMenuAdapter extends BaseMenuAdapter {

    public class FeedMenuViewHolder_ViewBinding extends BaseMenuAdapter.MenuViewHolder_ViewBinding {

        /* renamed from: a */
        private FeedMenuViewHolder f96529a;

        @Override // butterknife.Unbinder, com.ss.android.lark.feed.app.menu.BaseMenuAdapter.MenuViewHolder_ViewBinding
        public void unbind() {
            FeedMenuViewHolder feedMenuViewHolder = this.f96529a;
            if (feedMenuViewHolder != null) {
                this.f96529a = null;
                feedMenuViewHolder.mBadgeView = null;
                feedMenuViewHolder.divider = null;
                super.unbind();
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public FeedMenuViewHolder_ViewBinding(FeedMenuViewHolder feedMenuViewHolder, View view) {
            super(feedMenuViewHolder, view);
            this.f96529a = feedMenuViewHolder;
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
        int i2;
        this.f96479c = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (DesktopUtil.m144301a(this.f96479c)) {
            i2 = R.layout.activity_feed_type_menu_list_item_desktop;
        } else {
            i2 = R.layout.activity_feed_type_menu_list_item;
        }
        View inflate = from.inflate(i2, viewGroup, false);
        inflate.setOnClickListener(this.f96481e);
        return new FeedMenuViewHolder(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.itemView.setTag(Integer.valueOf(i));
        FeedMenuViewHolder feedMenuViewHolder = (FeedMenuViewHolder) viewHolder;
        MenuItem menuItem = (MenuItem) this.f96477a.get(i);
        mo138044a(feedMenuViewHolder, menuItem.f96555a);
        mo138048b(feedMenuViewHolder, menuItem.f96555a);
        boolean z = true;
        if (menuItem.f96555a == this.f96478b) {
            feedMenuViewHolder.itemView.setSelected(true);
            feedMenuViewHolder.mLabelTV.setTextColor(this.f96479c.getResources().getColor(R.color.lkui_B500));
        } else {
            feedMenuViewHolder.itemView.setSelected(false);
            feedMenuViewHolder.itemView.setBackgroundResource(R.drawable.item_bg_selector_c11);
            feedMenuViewHolder.mLabelTV.setTextColor(this.f96479c.getResources().getColorStateList(R.drawable.feed_menu_textcolor_selector));
        }
        if (i <= 0 || DesktopUtil.m144301a(this.f96479c)) {
            feedMenuViewHolder.divider.setVisibility(8);
        } else {
            feedMenuViewHolder.divider.setVisibility(0);
        }
        if (menuItem.f96555a != MenuItem.MenuType.DONE) {
            z = false;
        }
        C37414l.C37415a a = C37414l.m147240a(menuItem, z, false);
        feedMenuViewHolder.mBadgeView.setVisibility(a.mo137306d());
        if (a.mo137306d() == 0) {
            feedMenuViewHolder.mBadgeView.mo89321b(a.mo137307e()).mo89319a(a.mo137304c()).mo89317a(a.mo137302b()).mo89322b(a.mo137298a()).mo89320a();
        }
    }
}
