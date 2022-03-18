package com.ss.android.lark.feed.app.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.feed.app.menu.BaseMenuAdapter;
import com.ss.android.lark.feed.app.menu.entity.MenuItem;

/* renamed from: com.ss.android.lark.feed.app.menu.c */
public class C37659c extends BaseMenuAdapter {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        this.f96479c = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (DesktopUtil.m144301a(viewGroup.getContext())) {
            i2 = R.layout.activity_filter_type_menu_list_item_desktop;
        } else {
            i2 = R.layout.activity_filter_type_menu_list_item;
        }
        View inflate = from.inflate(i2, viewGroup, false);
        inflate.setOnClickListener(this.f96481e);
        return new BaseMenuAdapter.MenuViewHolder(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.itemView.setTag(Integer.valueOf(i));
        BaseMenuAdapter.MenuViewHolder menuViewHolder = (BaseMenuAdapter.MenuViewHolder) viewHolder;
        MenuItem menuItem = (MenuItem) this.f96477a.get(i);
        mo138044a(menuViewHolder, menuItem.f96555a);
        mo138048b(menuViewHolder, menuItem.f96555a);
        if (menuItem.f96555a == this.f96478b) {
            menuViewHolder.itemView.setSelected(true);
            menuViewHolder.mLabelTV.setTextColor(this.f96479c.getResources().getColor(R.color.lkui_B500));
            return;
        }
        menuViewHolder.itemView.setSelected(false);
        menuViewHolder.mLabelTV.setTextColor(this.f96479c.getResources().getColorStateList(R.drawable.filter_type_menu_textcolor_selector));
    }
}
