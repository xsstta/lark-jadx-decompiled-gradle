package com.bytedance.ee.bear.middleground_permission_export.model.form;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/middleground_permission_export/model/form/DefaultBitableSharePublicPermission;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/form/IBitableSharePublicPermission;", "()V", "getReportJson", "", "isLinkShareAnyoneEdit", "", "isLinkShareClose", "isLinkShareInternalEdit", "middleground-permission-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DefaultBitableSharePublicPermission implements IBitableSharePublicPermission {
    @Override // com.bytedance.ee.bear.middleground_permission_export.model.form.IBitableSharePublicPermission
    public String getReportJson() {
        return "";
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.form.IBitableSharePublicPermission
    public boolean isLinkShareAnyoneEdit() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.form.IBitableSharePublicPermission
    public boolean isLinkShareClose() {
        return true;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.form.IBitableSharePublicPermission
    public boolean isLinkShareInternalEdit() {
        return false;
    }
}
