package com.ss.android.lark.sticker.ui;

import android.text.TextUtils;
import androidx.recyclerview.widget.C1374g;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sticker.ui.emoticon.shop.StickerSetProgressInfo;
import java.util.List;

/* renamed from: com.ss.android.lark.sticker.ui.g */
public class C55226g extends C1374g.AbstractC1376a {

    /* renamed from: a */
    private List<StickerSetProgressInfo> f136294a;

    /* renamed from: b */
    private List<StickerSetProgressInfo> f136295b;

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: a */
    public int mo7380a() {
        if (CollectionUtils.isEmpty(this.f136294a)) {
            return 0;
        }
        return this.f136294a.size();
    }

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: b */
    public int mo7382b() {
        if (CollectionUtils.isEmpty(this.f136295b)) {
            return 0;
        }
        return this.f136295b.size();
    }

    public C55226g(List<StickerSetProgressInfo> list, List<StickerSetProgressInfo> list2) {
        this.f136294a = list;
        this.f136295b = list2;
    }

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: a */
    public boolean mo7381a(int i, int i2) {
        if (i >= mo7380a() || i < 0) {
            Log.m165383e("StickerSetProgressInfoDiffCallback", "areItemsTheSame called. oldItemPosition is illegal");
            return false;
        } else if (i2 < mo7382b() && i2 >= 0) {
            return TextUtils.equals(this.f136294a.get(i).getStickerSetId(), this.f136295b.get(i2).getStickerSetId());
        } else {
            Log.m165383e("StickerSetProgressInfoDiffCallback", "areItemsTheSame called. newItemPosition is illegal");
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: b */
    public boolean mo7383b(int i, int i2) {
        if (i >= mo7380a() || i < 0) {
            Log.m165383e("StickerSetProgressInfoDiffCallback", "areContentsTheSame called. oldItemPosition is illegal");
            return false;
        } else if (i2 < mo7382b() && i2 >= 0) {
            return this.f136294a.get(i).equals(this.f136295b.get(i2));
        } else {
            Log.m165383e("StickerSetProgressInfoDiffCallback", "areContentsTheSame called. newItemPosition is illegal");
            return false;
        }
    }
}
