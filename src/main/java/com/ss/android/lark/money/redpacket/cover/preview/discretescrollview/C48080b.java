package com.ss.android.lark.money.redpacket.cover.preview.discretescrollview;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.PopupMenu;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.b */
public class C48080b {
    /* renamed from: a */
    public static int m189825a() {
        return 100;
    }

    /* renamed from: a */
    public static void m189826a(final DiscreteScrollView discreteScrollView, View view) {
        int i;
        PopupMenu popupMenu = new PopupMenu(discreteScrollView.getContext(), view, 8388611);
        Menu menu = popupMenu.getMenu();
        final RecyclerView.Adapter adapter = discreteScrollView.getAdapter();
        int i2 = 0;
        if (adapter instanceof C48082c) {
            i = ((C48082c) adapter).mo168371b();
        } else if (adapter != null) {
            i = adapter.getItemCount();
        } else {
            i = 0;
        }
        while (i2 < i) {
            i2++;
            menu.add(String.valueOf(i2));
        }
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            /* class com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.C48080b.C480811 */

            @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
            public boolean onMenuItemClick(MenuItem menuItem) {
                int parseInt = Integer.parseInt(String.valueOf(menuItem.getTitle())) - 1;
                RecyclerView.Adapter adapter = adapter;
                if (adapter instanceof C48082c) {
                    parseInt = ((C48082c) adapter).mo168370a(parseInt);
                }
                discreteScrollView.smoothScrollToPosition(parseInt);
                return true;
            }
        });
        popupMenu.show();
    }
}
