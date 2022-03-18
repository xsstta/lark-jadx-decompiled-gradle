package com.ss.android.lark.contact.feat.common;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\b\u0010\u000b\u001a\u00020\tH\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0014\u0010\u000f\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010J\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/contact/feat/common/SimpleItemListAdapter;", "Lcom/ss/android/lark/contact/feat/common/BaseItemListAdapter;", "()V", "dataList", "", "Lcom/ss/android/lark/contact/feat/common/ItemData;", "addItemData", "", "pos", "", "item", "getItemCount", "getItemData", "", "position", "setItemDataList", "", "updateItemData", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.feat.common.g */
public final class SimpleItemListAdapter extends BaseItemListAdapter {

    /* renamed from: b */
    private final List<ItemData> f91603b = new ArrayList();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f91603b.size();
    }

    @Override // com.ss.android.lark.contact.feat.common.BaseItemListAdapter
    /* renamed from: a */
    public Object mo130752a(int i) {
        if (i < getItemCount()) {
            return this.f91603b.get(i);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo130761a(List<? extends ItemData> list) {
        Intrinsics.checkParameterIsNotNull(list, "dataList");
        this.f91603b.clear();
        this.f91603b.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo130760a(ItemData dVar) {
        T t;
        int indexOf;
        Intrinsics.checkParameterIsNotNull(dVar, "item");
        int indexOf2 = this.f91603b.indexOf(dVar);
        if (indexOf2 == -1) {
            Iterator<T> it = this.f91603b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (TextUtils.equals(dVar.mo130668a(), t.mo130668a())) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null && (indexOf = this.f91603b.indexOf(t2)) != -1) {
                this.f91603b.remove(indexOf);
                this.f91603b.add(indexOf, dVar);
            } else {
                return;
            }
        }
        notifyItemChanged(indexOf2);
    }
}
