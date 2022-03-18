package com.bytedance.ee.bear.middleground.permission.permission.bitableshare;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.middleground_permission_export.model.form.IBitableSharePublicPermission;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/bitableshare/BitableSharePublicPermission;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/form/IBitableSharePublicPermission;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "", "linkShareEntity", "reportJson", "", "(ILjava/lang/String;)V", "getReportJson", "isLinkShareAnyoneEdit", "", "isLinkShareClose", "isLinkShareInternalEdit", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BitableSharePublicPermission extends NetService.Result<Integer> implements IBitableSharePublicPermission {
    private final int linkShareEntity;
    private final String reportJson;

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.form.IBitableSharePublicPermission
    public String getReportJson() {
        return this.reportJson;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.form.IBitableSharePublicPermission
    public boolean isLinkShareClose() {
        if (this.linkShareEntity == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.form.IBitableSharePublicPermission
    public boolean isLinkShareAnyoneEdit() {
        if (this.linkShareEntity == 4) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.form.IBitableSharePublicPermission
    public boolean isLinkShareInternalEdit() {
        if (this.linkShareEntity == 2) {
            return true;
        }
        return false;
    }

    public BitableSharePublicPermission(int i, String str) {
        Intrinsics.checkParameterIsNotNull(str, "reportJson");
        this.linkShareEntity = i;
        this.reportJson = str;
    }
}
