package com.bytedance.ee.bear.bitable.pro.roledetail;

import com.bytedance.ee.bear.bitable.pro.TableRole;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.suite.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0005j\b\u0012\u0004\u0012\u00020\u0002`\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0014J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0005j\b\u0012\u0004\u0012\u00020\u0002`\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/bitable/pro/roledetail/BitableRoleTablePermAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/bytedance/ee/bear/bitable/pro/TableRole;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "tableRoleList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "convert", "", "helper", "tableRole", "getTablePermDesc", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.pro.b.b */
public final class BitableRoleTablePermAdapter extends BaseQuickAdapter<TableRole, C20923c> {

    /* renamed from: a */
    private final ArrayList<TableRole> f14195a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BitableRoleTablePermAdapter(ArrayList<TableRole> arrayList) {
        super(R.layout.bitable_pro_table_perm_item, arrayList);
        Intrinsics.checkParameterIsNotNull(arrayList, "tableRoleList");
        this.f14195a = arrayList;
    }

    /* renamed from: a */
    private final String m19955a(TableRole tableRole) {
        int i;
        if (tableRole.canEditAllRowAndColumn()) {
            i = R.string.Bitable_AdvancedPermission_CanEditFieldAndRecord;
        } else if (tableRole.canEditAllRow()) {
            i = R.string.Bitable_AdvancedPermission_CanEditAllRecord;
        } else if (tableRole.canEditPartAndReadOtherRow()) {
            i = R.string.Bitable_AdvancedPermission_CanEditSomeRecordAndViewOthers;
        } else if (tableRole.canEditPartAndInvisibleOtherRow()) {
            i = R.string.Bitable_AdvancedPermission_CanEditSomeRecordOnly;
        } else if (tableRole.canReadAllRow()) {
            i = R.string.Bitable_AdvancedPermission_CanViewAllRecord;
        } else if (tableRole.canReadPartRow()) {
            i = R.string.Bitable_AdvancedPermission_CanViewSomeRecord;
        } else {
            i = R.string.Bitable_AdvancedPermission_NoAccess;
        }
        String string = this.f51211q.getString(i);
        Intrinsics.checkExpressionValueIsNotNull(string, "mContext.getString(resId)");
        return string;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16806a(C20923c cVar, TableRole tableRole) {
        Intrinsics.checkParameterIsNotNull(cVar, "helper");
        Intrinsics.checkParameterIsNotNull(tableRole, "tableRole");
        cVar.mo70737a(R.id.tableName, tableRole.getTableName()).mo70737a(R.id.tablePermDesc, m19955a(tableRole));
    }
}
