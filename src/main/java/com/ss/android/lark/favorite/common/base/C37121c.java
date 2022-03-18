package com.ss.android.lark.favorite.common.base;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.favorite.common.audio.C37099a;
import com.ss.android.lark.favorite.common.base.FavoriteItemAdapter;
import com.ss.android.lark.favorite.common.file.C37132a;
import com.ss.android.lark.favorite.common.header.C37138a;
import com.ss.android.lark.favorite.common.image.C37140a;
import com.ss.android.lark.favorite.common.media.image.C37144a;
import com.ss.android.lark.favorite.common.mergeforward.C37148a;
import com.ss.android.lark.favorite.common.p1839a.C37091a;
import com.ss.android.lark.favorite.common.p1840b.C37102a;
import com.ss.android.lark.favorite.common.p1841c.C37128a;
import com.ss.android.lark.favorite.common.post.C37154a;
import com.ss.android.lark.favorite.common.sticker.C37165a;
import com.ss.android.lark.favorite.common.text.C37170b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.favorite.common.base.c */
public class C37121c {

    /* renamed from: a */
    private Context f95396a;

    /* renamed from: b */
    private Map<Integer, AbstractC37120b<RecyclerView.ViewHolder, FavoriteMessageInfo>> f95397b;

    /* renamed from: c */
    private C37138a f95398c = new C37138a(this.f95396a);

    /* renamed from: d */
    private AbstractC37120b<RecyclerView.ViewHolder, FavoriteMessageInfo> f95399d = new C37128a(this.f95396a);

    /* renamed from: a */
    public void mo136777a(FavoriteItemAdapter.AbstractC37113a aVar) {
        this.f95398c.mo136789a(aVar);
    }

    public C37121c(Context context) {
        this.f95396a = context;
        HashMap hashMap = new HashMap();
        this.f95397b = hashMap;
        hashMap.put(2, new C37170b(this.f95396a));
        this.f95397b.put(3, new C37140a(this.f95396a));
        this.f95397b.put(4, new C37165a(this.f95396a));
        this.f95397b.put(5, new C37154a(this.f95396a));
        this.f95397b.put(6, new C37099a(this.f95396a));
        this.f95397b.put(7, new C37148a(this.f95396a));
        this.f95397b.put(8, new C37132a(this.f95396a));
        this.f95397b.put(9, new C37144a(this.f95396a));
        this.f95397b.put(10, new C37091a(this.f95396a));
        this.f95397b.put(11, new C37132a(this.f95396a));
        this.f95397b.put(12, new C37102a(this.f95396a));
    }

    /* renamed from: a */
    public void mo136776a(RecyclerView.ViewHolder viewHolder, FavoriteMessageInfo favoriteMessageInfo, int i) {
        this.f95398c.mo136788a(viewHolder, favoriteMessageInfo, i);
    }

    /* renamed from: a */
    public void mo136775a(RecyclerView.ViewHolder viewHolder, int i, FavoriteMessageInfo favoriteMessageInfo, int i2) {
        C37122d.m146370a(this.f95396a, viewHolder, favoriteMessageInfo, i2);
        AbstractC37120b<RecyclerView.ViewHolder, FavoriteMessageInfo> bVar = this.f95397b.get(Integer.valueOf(i));
        if (bVar == null) {
            bVar = this.f95399d;
        }
        try {
            bVar.mo136723a(viewHolder, favoriteMessageInfo, i2);
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }
}
