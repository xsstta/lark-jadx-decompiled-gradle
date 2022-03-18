package com.bytedance.ee.bear.bitable.card.viewmodel.fetch;

import com.bytedance.ee.bear.bitable.card.model.enums.EFieldType;
import com.bytedance.ee.bear.bitable.card.model.enums.EViewType;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.TableMetaModel;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4535b;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4536c;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4526a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4527b;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4528c;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4529d;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4530e;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4532f;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4533g;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4534h;
import com.huawei.hms.android.HwBuildEx;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\u001e\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J>\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0011\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u001bH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/viewmodel/fetch/STTableFunc;", "Lio/reactivex/functions/Function;", "Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/TableMetaModel;", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/STTable;", "baseId", "", "tableId", "viewId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBaseId", "()Ljava/lang/String;", "getTableId", "getViewId", "apply", "tableMetaModel", "buildLinkField", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/field/LinkField;", "stTable", "field", "Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/TableMetaModel$FieldBean;", "colors", "", "Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/TableMetaModel$ColorsMap;", "buildLinkTable", "property", "Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/TableMetaModel$FieldBean$PropertyBean;", "buildSTFields", "", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/field/STField;", "fields", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.card.viewmodel.fetch.c */
public final class STTableFunc implements Function<TableMetaModel, C4535b> {

    /* renamed from: a */
    private final String f14037a;

    /* renamed from: b */
    private final String f14038b;

    /* renamed from: c */
    private final String f14039c;

    /* renamed from: a */
    public C4535b apply(TableMetaModel tableMetaModel) {
        Intrinsics.checkParameterIsNotNull(tableMetaModel, "tableMetaModel");
        C4535b bVar = new C4535b(this.f14037a, this.f14038b);
        bVar.mo17771c(tableMetaModel.tableName);
        bVar.mo17759a(tableMetaModel.bizType);
        bVar.mo17762a(new C4536c(bVar, this.f14039c, tableMetaModel.currentViewName, tableMetaModel.viewType));
        List<TableMetaModel.ColorsMap> list = tableMetaModel.colors;
        Intrinsics.checkExpressionValueIsNotNull(list, "tableMetaModel.colors");
        Map<String, TableMetaModel.FieldBean> map = tableMetaModel.fields;
        Intrinsics.checkExpressionValueIsNotNull(map, "tableMetaModel.fields");
        bVar.mo17765a(m19756a(bVar, list, map));
        bVar.mo17774d(tableMetaModel.primaryFieldId);
        bVar.mo17766a(tableMetaModel.recordAddable);
        bVar.mo17769b(tableMetaModel.isPro);
        return bVar;
    }

    /* renamed from: a */
    private final C4535b m19755a(TableMetaModel.FieldBean.PropertyBean propertyBean, List<? extends TableMetaModel.ColorsMap> list) {
        C4535b bVar = new C4535b(propertyBean.baseId, propertyBean.tableId);
        Map<String, TableMetaModel.FieldBean> map = propertyBean.fields;
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        bVar.mo17765a(m19756a(bVar, list, map));
        bVar.mo17762a(new C4536c(bVar, propertyBean.viewId, "", EViewType.GRID));
        bVar.mo17774d(propertyBean.primaryFieldId);
        return bVar;
    }

    public STTableFunc(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "baseId");
        Intrinsics.checkParameterIsNotNull(str2, "tableId");
        Intrinsics.checkParameterIsNotNull(str3, "viewId");
        this.f14037a = str;
        this.f14038b = str2;
        this.f14039c = str3;
    }

    /* renamed from: a */
    private final C4528c m19754a(C4535b bVar, TableMetaModel.FieldBean fieldBean, List<? extends TableMetaModel.ColorsMap> list) {
        TableMetaModel.FieldBean.PropertyBean propertyBean = fieldBean.property;
        Intrinsics.checkExpressionValueIsNotNull(propertyBean, "field.property");
        return new C4528c(bVar, fieldBean.id, fieldBean.getFieldName(), EFieldType.valueOf(fieldBean.type), fieldBean.required, m19755a(propertyBean, list), fieldBean.property.multiple, fieldBean.property.tableVisible);
    }

    /* renamed from: a */
    private final Map<String, C4533g> m19756a(C4535b bVar, List<? extends TableMetaModel.ColorsMap> list, Map<String, ? extends TableMetaModel.FieldBean> map) {
        C4527b bVar2;
        boolean z;
        C4529d dVar;
        List<TableMetaModel.FieldBean.PropertyBean.OptionInfo> list2;
        boolean z2;
        TableMetaModel.FieldBean.PropertyBean propertyBean;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        for (T t : map.entrySet()) {
            Object key = t.getKey();
            TableMetaModel.FieldBean fieldBean = (TableMetaModel.FieldBean) t.getValue();
            TableMetaModel.FieldBean.PropertyBean propertyBean2 = fieldBean.property;
            EFieldType valueOf = EFieldType.valueOf(fieldBean.type);
            if (valueOf != null) {
                String str = null;
                List<String> list3 = null;
                r5 = null;
                ArrayList arrayList = null;
                String str2 = null;
                switch (C4777d.f14040a[valueOf.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        EFieldType valueOf2 = EFieldType.valueOf(fieldBean.type);
                        String str3 = fieldBean.id;
                        String fieldName = fieldBean.getFieldName();
                        if (propertyBean2 != null) {
                            z = propertyBean2.autoFill;
                        } else {
                            z = false;
                        }
                        String str4 = propertyBean2 != null ? propertyBean2.dateFormat : null;
                        if (propertyBean2 != null) {
                            str = propertyBean2.timeFormat;
                        }
                        bVar2 = new C4527b(bVar, valueOf2, str3, fieldName, z, str4, str, fieldBean.required);
                        break;
                    case 4:
                    case 5:
                        bVar2 = m19754a(bVar, fieldBean, list);
                        break;
                    case 6:
                        String str5 = fieldBean.id;
                        String fieldName2 = fieldBean.getFieldName();
                        if (propertyBean2 != null) {
                            str2 = propertyBean2.formatter;
                        }
                        dVar = new C4529d(bVar, str5, fieldName2, str2, fieldBean.required);
                        bVar2 = dVar;
                        break;
                    case 7:
                    case 8:
                        String str6 = fieldBean.id;
                        String fieldName3 = fieldBean.getFieldName();
                        EFieldType valueOf3 = EFieldType.valueOf(fieldBean.type);
                        if (!(propertyBean2 == null || (list2 = propertyBean2.options) == null)) {
                            List<TableMetaModel.FieldBean.PropertyBean.OptionInfo> list4 = list2;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                            for (Iterator<T> it = list4.iterator(); it.hasNext(); it = it) {
                                T next = it.next();
                                int size = next.index % list.size();
                                arrayList2.add(new C4530e.C4531a(next.id, next.name, size, ((TableMetaModel.ColorsMap) list.get(size)).color, ((TableMetaModel.ColorsMap) list.get(size)).textColor));
                            }
                            arrayList = arrayList2;
                        }
                        dVar = new C4530e(bVar, str6, fieldName3, valueOf3, arrayList, fieldBean.required);
                        bVar2 = dVar;
                        break;
                    case 9:
                    case 10:
                    case 11:
                        EFieldType valueOf4 = EFieldType.valueOf(fieldBean.type);
                        String str7 = fieldBean.id;
                        String fieldName4 = fieldBean.getFieldName();
                        if (propertyBean2 != null) {
                            z2 = propertyBean2.multiple;
                        } else {
                            z2 = false;
                        }
                        dVar = new C4534h(bVar, valueOf4, str7, fieldName4, z2, fieldBean.required);
                        bVar2 = dVar;
                        break;
                    case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                    case 13:
                        C4532f fVar = new C4532f(bVar, EFieldType.valueOf(fieldBean.type), fieldBean.id, fieldBean.getFieldName(), propertyBean2 != null ? propertyBean2.formula : null, propertyBean2 != null ? propertyBean2.formatter : null, propertyBean2 != null ? propertyBean2.proxyFieldMeta : null, list, fieldBean.required);
                        TableMetaModel.FieldBean a = fVar.mo17740a();
                        if (!(a == null || (propertyBean = a.property) == null)) {
                            fVar.mo17743a(m19755a(propertyBean, list));
                        }
                        dVar = fVar;
                        bVar2 = dVar;
                        break;
                    case 14:
                        String str8 = fieldBean.id;
                        String fieldName5 = fieldBean.getFieldName();
                        boolean z3 = fieldBean.required;
                        if (propertyBean2 != null) {
                            list3 = propertyBean2.capture;
                        }
                        dVar = new C4526a(bVar, str8, fieldName5, z3, list3);
                        bVar2 = dVar;
                        break;
                }
                linkedHashMap.put(key, bVar2);
            }
            bVar2 = new C4533g(bVar, EFieldType.valueOf(fieldBean.type), fieldBean.id, fieldBean.getFieldName(), fieldBean.required);
            linkedHashMap.put(key, bVar2);
        }
        return linkedHashMap;
    }
}
