package com.bytedance.ee.bear.bitable.card.viewmodel.fetch;

import android.text.TextUtils;
import com.bytedance.ee.bear.bitable.card.model.enums.EFieldType;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.TableDataModel;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4525a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4535b;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4533g;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J.\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J:\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u00062\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/viewmodel/fetch/STRecordsFunc;", "Lio/reactivex/functions/Function;", "Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/TableDataModel;", "", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/STRecord;", "currentTable", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/STTable;", "(Lcom/bytedance/ee/bear/bitable/card/model/stmodel/STTable;)V", "apply", "listModel", "fieldToSTCell", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/cell/STCell;", "table", "record", "field", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/field/STField;", "cell", "Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/TableDataModel$RecordsBean$ContentBean;", "recordsToSTRecords", "fields", "", "", "records", "", "Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/TableDataModel$RecordsBean;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.card.viewmodel.fetch.a */
public final class STRecordsFunc implements Function<TableDataModel, List<C4525a>> {

    /* renamed from: a */
    private final C4535b f14035a;

    public STRecordsFunc(C4535b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "currentTable");
        this.f14035a = bVar;
    }

    /* renamed from: a */
    public List<C4525a> apply(TableDataModel tableDataModel) {
        Intrinsics.checkParameterIsNotNull(tableDataModel, "listModel");
        C4535b bVar = this.f14035a;
        Map<String, C4533g> f = bVar.mo17777f();
        Intrinsics.checkExpressionValueIsNotNull(f, "currentTable.fields");
        List<TableDataModel.RecordsBean> list = tableDataModel.records;
        Intrinsics.checkExpressionValueIsNotNull(list, "listModel.records");
        return m19752a(bVar, f, list);
    }

    /* renamed from: a */
    private final List<C4525a> m19752a(C4535b bVar, Map<String, ? extends C4533g> map, List<? extends TableDataModel.RecordsBean> list) {
        EFieldType eFieldType;
        List<? extends TableDataModel.RecordsBean> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (T t : list2) {
            C4525a aVar = new C4525a(bVar, t.recordId, bVar.mo17780g(), t.headerBarColor, t.isFiltered, t.deletable, t.visible, t.editable);
            List<TableDataModel.RecordsBean.ContentBean> list3 = t.fields;
            Intrinsics.checkExpressionValueIsNotNull(list3, "record.fields");
            List<TableDataModel.RecordsBean.ContentBean> list4 = list3;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            for (T t2 : list4) {
                EFieldType valueOf = EFieldType.valueOf(t2.type);
                C4533g gVar = (C4533g) map.get(t2.fieldId);
                if (gVar != null) {
                    eFieldType = gVar.mo17752i();
                } else {
                    eFieldType = null;
                }
                if (valueOf == eFieldType) {
                    Intrinsics.checkExpressionValueIsNotNull(t2, "cell");
                    C4537a<?> a = m19751a(bVar, aVar, (C4533g) map.get(t2.fieldId), t2);
                    a.mo17832a((C4533g) map.get(t2.fieldId));
                    C4533g a2 = a.mo17829a();
                    Intrinsics.checkExpressionValueIsNotNull(a2, "field");
                    if (!TextUtils.isEmpty(a2.mo17754k())) {
                        a.mo17831a(2);
                    }
                    arrayList2.add(a);
                } else {
                    throw new EFieldTypeUnMatchException("recordsToSTRecords() failed because records data doesn't match the current meta");
                }
            }
            aVar.mo17706a(arrayList2);
            arrayList.add(aVar);
        }
        return CollectionsKt.toMutableList((Collection) arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0070  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a<?> m19751a(com.bytedance.ee.bear.bitable.card.model.stmodel.C4535b r5, com.bytedance.ee.bear.bitable.card.model.stmodel.C4525a r6, com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4533g r7, com.bytedance.ee.bear.bitable.card.model.jsmodel.TableDataModel.RecordsBean.ContentBean r8) {
        /*
        // Method dump skipped, instructions count: 362
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.bitable.card.viewmodel.fetch.STRecordsFunc.m19751a(com.bytedance.ee.bear.bitable.card.model.stmodel.b, com.bytedance.ee.bear.bitable.card.model.stmodel.a, com.bytedance.ee.bear.bitable.card.model.stmodel.a.g, com.bytedance.ee.bear.bitable.card.model.jsmodel.TableDataModel$RecordsBean$ContentBean):com.bytedance.ee.bear.bitable.card.model.stmodel.cell.a");
    }
}
