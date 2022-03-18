package com.ss.android.lark.favorite.common.p1841c;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.favorite.common.base.AbstractC37120b;
import com.ss.android.lark.favorite.common.base.C37122d;
import com.ss.android.lark.favorite.common.base.ItemListCommonHolder;

/* renamed from: com.ss.android.lark.favorite.common.c.a */
public class C37128a implements AbstractC37120b<RecyclerView.ViewHolder, FavoriteMessageInfo> {

    /* renamed from: a */
    private Context f95406a;

    public C37128a(Context context) {
        this.f95406a = context;
    }

    /* renamed from: a */
    public void mo136723a(RecyclerView.ViewHolder viewHolder, final FavoriteMessageInfo favoriteMessageInfo, int i) {
        final ItemListCommonHolder itemListCommonHolder = (ItemListCommonHolder) viewHolder;
        C37131b bVar = (C37131b) itemListCommonHolder.mo136774a();
        new View.OnClickListener() {
            /* class com.ss.android.lark.favorite.common.p1841c.C37128a.View$OnClickListenerC371291 */

            public void onClick(View view) {
                C37122d.m146374b(view, itemListCommonHolder, favoriteMessageInfo);
            }
        };
        View$OnLongClickListenerC371302 r0 = new View.OnLongClickListener() {
            /* class com.ss.android.lark.favorite.common.p1841c.C37128a.View$OnLongClickListenerC371302 */

            public boolean onLongClick(View view) {
                return C37122d.m146373a(view, itemListCommonHolder, favoriteMessageInfo);
            }
        };
        if (i == 1) {
            itemListCommonHolder.f95392a.setOnLongClickListener(r0);
            itemListCommonHolder.mContentViewGroup.setOnLongClickListener(r0);
        }
    }
}
