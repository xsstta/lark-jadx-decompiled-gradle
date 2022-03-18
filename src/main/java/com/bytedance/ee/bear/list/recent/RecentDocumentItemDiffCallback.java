package com.bytedance.ee.bear.list.recent;

import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.BaseListItemDiffCallback;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/list/recent/RecentDocumentItemDiffCallback;", "Lcom/bytedance/ee/bear/list/list/BaseListItemDiffCallback;", "oldList", "", "Lcom/bytedance/ee/bear/list/dto/Document;", "newList", "(Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.list.recent.f */
public final class RecentDocumentItemDiffCallback extends BaseListItemDiffCallback {

    /* renamed from: a */
    private final List<Document> f23496a;

    /* renamed from: b */
    private final List<Document> f23497b;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.bytedance.ee.bear.list.dto.Document> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.bytedance.ee.bear.list.dto.Document> */
    /* JADX WARN: Multi-variable type inference failed */
    public RecentDocumentItemDiffCallback(List<? extends Document> list, List<? extends Document> list2) {
        super(list, list2);
        this.f23496a = list;
        this.f23497b = list2;
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListItemDiffCallback, androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: b */
    public boolean mo7383b(int i, int i2) {
        boolean z;
        boolean z2;
        List<Document> list = this.f23496a;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            List<Document> list2 = this.f23497b;
            if (list2 == null || list2.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                Document document = this.f23496a.get(i);
                Document document2 = this.f23497b.get(i2);
                if (!super.mo7383b(i, i2) || !Intrinsics.areEqual(document.mo32492x(), document2.mo32492x()) || !Intrinsics.areEqual(document.mo32391J(), document2.mo32391J()) || !Intrinsics.areEqual(document.mo32389I(), document2.mo32389I())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
