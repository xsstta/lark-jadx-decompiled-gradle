package com.bytedance.ee.bear.middleground_permission_export.model.form;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/middleground_permission_export/model/form/IBitableSharePublicPermission;", "Ljava/io/Serializable;", "getReportJson", "", "isLinkShareAnyoneEdit", "", "isLinkShareClose", "isLinkShareInternalEdit", "middleground-permission-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public interface IBitableSharePublicPermission extends Serializable {
    String getReportJson();

    boolean isLinkShareAnyoneEdit();

    boolean isLinkShareClose();

    boolean isLinkShareInternalEdit();
}
