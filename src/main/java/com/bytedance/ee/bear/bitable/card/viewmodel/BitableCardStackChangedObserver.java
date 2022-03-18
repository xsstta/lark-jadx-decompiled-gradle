package com.bytedance.ee.bear.bitable.card.viewmodel;

import com.bytedance.ee.bear.bitable.card.model.stmodel.C4535b;
import java.util.Stack;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J&\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fH&¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/viewmodel/BitableCardStackChangedObserver;", "", "onTableContentUpdated", "", "tableIndex", "", "updatedTable", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/STTable;", "onTableCountChanged", "oldCount", "newCount", "tableStack", "Ljava/util/Stack;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.card.viewmodel.a */
public interface BitableCardStackChangedObserver {
    /* renamed from: a */
    void mo17945a(int i, int i2, Stack<C4535b> stack);

    /* renamed from: a */
    void mo17946a(int i, C4535b bVar);
}
