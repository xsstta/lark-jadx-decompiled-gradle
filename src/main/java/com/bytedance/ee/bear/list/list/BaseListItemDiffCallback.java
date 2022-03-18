package com.bytedance.ee.bear.list.list;

import androidx.recyclerview.widget.C1374g;
import com.bytedance.ee.bear.list.dto.Document;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/list/list/BaseListItemDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldList", "", "Lcom/bytedance/ee/bear/list/dto/Document;", "newList", "(Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.list.list.a */
public class BaseListItemDiffCallback extends C1374g.AbstractC1376a {

    /* renamed from: a */
    private final List<Document> f23118a;

    /* renamed from: b */
    private final List<Document> f23119b;

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: a */
    public int mo7380a() {
        List<Document> list = this.f23118a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: b */
    public int mo7382b() {
        List<Document> list = this.f23119b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.bytedance.ee.bear.list.dto.Document> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.bytedance.ee.bear.list.dto.Document> */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseListItemDiffCallback(List<? extends Document> list, List<? extends Document> list2) {
        this.f23118a = list;
        this.f23119b = list2;
    }

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: a */
    public boolean mo7381a(int i, int i2) {
        boolean z;
        List<Document> list = this.f23118a;
        boolean z2 = true;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            List<Document> list2 = this.f23119b;
            if (list2 != null && !list2.isEmpty()) {
                z2 = false;
            }
            if (!z2) {
                return Intrinsics.areEqual(this.f23118a.get(i).mo32472o(), this.f23119b.get(i2).mo32472o());
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: b */
    public boolean mo7383b(int i, int i2) {
        boolean z;
        boolean z2;
        List<Document> list = this.f23118a;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            List<Document> list2 = this.f23119b;
            if (list2 == null || list2.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                Document document = this.f23118a.get(i);
                Document document2 = this.f23119b.get(i2);
                if (Intrinsics.areEqual(document.mo32469n(), document2.mo32469n()) && document.mo32483t() == document2.mo32483t() && Intrinsics.areEqual(document.mo32377C(), document2.mo32377C()) && document.mo32404T() == document2.mo32404T() && document.mo32456j() == document2.mo32456j() && document.am() == document2.am() && document.an() == document2.an()) {
                    Document.DocumentIcon ag = document.ag();
                    Intrinsics.checkExpressionValueIsNotNull(ag, "oldItem.documentIcon");
                    String a = ag.mo32502a();
                    Document.DocumentIcon ag2 = document2.ag();
                    Intrinsics.checkExpressionValueIsNotNull(ag2, "newItem.documentIcon");
                    if (Intrinsics.areEqual(a, ag2.mo32502a())) {
                        Document.DocumentIcon ag3 = document.ag();
                        Intrinsics.checkExpressionValueIsNotNull(ag3, "oldItem.documentIcon");
                        int b = ag3.mo32505b();
                        Document.DocumentIcon ag4 = document2.ag();
                        Intrinsics.checkExpressionValueIsNotNull(ag4, "newItem.documentIcon");
                        if (b == ag4.mo32505b()) {
                            Document.DocumentIcon ag5 = document.ag();
                            Intrinsics.checkExpressionValueIsNotNull(ag5, "oldItem.documentIcon");
                            String c = ag5.mo32507c();
                            Document.DocumentIcon ag6 = document2.ag();
                            Intrinsics.checkExpressionValueIsNotNull(ag6, "newItem.documentIcon");
                            if (!Intrinsics.areEqual(c, ag6.mo32507c()) || !Intrinsics.areEqual(document.mo32479r(), document2.mo32479r()) || !Intrinsics.areEqual(document.mo32373A(), document2.mo32373A()) || document.mo32456j() != document2.mo32456j() || document.mo32400P() != document2.mo32400P() || !Intrinsics.areEqual(document.mo32403S(), document2.mo32403S()) || !Intrinsics.areEqual(document.mo32379D(), document2.mo32379D()) || !Intrinsics.areEqual(document.mo32381E(), document2.mo32381E()) || !Intrinsics.areEqual(document.mo32383F(), document2.mo32383F()) || document.mo32385G() != document2.mo32385G() || !Intrinsics.areEqual(document.ac(), document2.ac()) || document.af() != document2.af() || !Intrinsics.areEqual(document.ad(), document2.ad()) || !Intrinsics.areEqual(document.ae(), document2.ae()) || !Intrinsics.areEqual(document.aj(), document2.aj()) || document.mo32486u() != document2.mo32486u() || document.mo32409Y() != document2.mo32409Y() || document.mo32410Z() != document2.mo32410Z() || document.mo32464l() != document2.mo32464l() || !Intrinsics.areEqual(document.al(), document2.al())) {
                                return false;
                            }
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        return false;
    }
}
