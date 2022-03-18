package com.ss.android.lark.sticker.ui;

import android.text.TextUtils;
import androidx.recyclerview.widget.C1374g;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.log.Log;
import java.util.List;

/* renamed from: com.ss.android.lark.sticker.ui.f */
public class C55225f extends C1374g.AbstractC1376a {

    /* renamed from: a */
    private List<StickerSet> f136292a;

    /* renamed from: b */
    private List<StickerSet> f136293b;

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: a */
    public int mo7380a() {
        if (CollectionUtils.isEmpty(this.f136292a)) {
            return 0;
        }
        return this.f136292a.size();
    }

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: b */
    public int mo7382b() {
        if (CollectionUtils.isEmpty(this.f136293b)) {
            return 0;
        }
        return this.f136293b.size();
    }

    public C55225f(List<StickerSet> list, List<StickerSet> list2) {
        this.f136292a = list;
        this.f136293b = list2;
    }

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: a */
    public boolean mo7381a(int i, int i2) {
        if (i >= mo7380a() || i < 0) {
            Log.m165383e("StickerSetDiffCallback", "areItemsTheSame called. oldItemPosition is illegal");
            return false;
        } else if (i2 < mo7382b() && i2 >= 0) {
            return TextUtils.equals(this.f136292a.get(i).getStickerSetId(), this.f136293b.get(i2).getStickerSetId());
        } else {
            Log.m165383e("StickerSetDiffCallback", "areItemsTheSame called. newItemPosition is illegal");
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: b */
    public boolean mo7383b(int i, int i2) {
        if (i >= mo7380a() || i < 0) {
            Log.m165383e("StickerSetDiffCallback", "areContentsTheSame called. oldItemPosition is illegal");
            return false;
        } else if (i2 < mo7382b() && i2 >= 0) {
            return this.f136292a.get(i).equals(this.f136293b.get(i2));
        } else {
            Log.m165383e("StickerSetDiffCallback", "areContentsTheSame called. newItemPosition is illegal");
            return false;
        }
    }
}
