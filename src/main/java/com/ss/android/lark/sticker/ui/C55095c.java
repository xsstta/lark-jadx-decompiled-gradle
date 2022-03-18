package com.ss.android.lark.sticker.ui;

import androidx.recyclerview.widget.C1374g;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sticker.dto.UISticker;
import java.util.List;

/* renamed from: com.ss.android.lark.sticker.ui.c */
public class C55095c extends C1374g.AbstractC1376a {

    /* renamed from: a */
    private List<UISticker> f136068a;

    /* renamed from: b */
    private List<UISticker> f136069b;

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: a */
    public int mo7380a() {
        if (CollectionUtils.isEmpty(this.f136068a)) {
            return 0;
        }
        return this.f136068a.size();
    }

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: b */
    public int mo7382b() {
        if (CollectionUtils.isEmpty(this.f136069b)) {
            return 0;
        }
        return this.f136069b.size();
    }

    public C55095c(List<UISticker> list, List<UISticker> list2) {
        this.f136068a = list;
        this.f136069b = list2;
    }

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: a */
    public boolean mo7381a(int i, int i2) {
        if (i >= mo7380a() || i < 0) {
            Log.m165383e("StickerDiffCallback", "areItemsTheSame called. oldItemPosition is illegal");
            return false;
        } else if (i2 < mo7382b() && i2 >= 0) {
            return this.f136068a.get(i).equals(this.f136069b.get(i2));
        } else {
            Log.m165383e("StickerDiffCallback", "areItemsTheSame called. newItemPosition is illegal");
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: b */
    public boolean mo7383b(int i, int i2) {
        if (i >= mo7380a() || i < 0) {
            Log.m165383e("StickerDiffCallback", "areContentsTheSame called. oldItemPosition is illegal");
            return false;
        } else if (i2 < mo7382b() && i2 >= 0) {
            return this.f136068a.get(i).isExactlySame(this.f136069b.get(i2));
        } else {
            Log.m165383e("StickerDiffCallback", "areContentsTheSame called. newItemPosition is illegal");
            return false;
        }
    }
}
