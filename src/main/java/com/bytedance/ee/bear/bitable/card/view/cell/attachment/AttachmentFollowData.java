package com.bytedance.ee.bear.bitable.card.view.cell.attachment;

import com.bytedance.ee.bear.contract.drive.sdk.entity.open.SpaceThirdPartyOpenEntity;
import com.bytedance.ee.util.io.NonProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/AttachmentFollowData;", "Lcom/bytedance/ee/util/io/NonProguard;", "fieldId", "", "index", "", "recordId", "thirdEntity", "Lcom/bytedance/ee/bear/contract/drive/sdk/entity/open/SpaceThirdPartyOpenEntity;", "(Ljava/lang/String;ILjava/lang/String;Lcom/bytedance/ee/bear/contract/drive/sdk/entity/open/SpaceThirdPartyOpenEntity;)V", "getFieldId", "()Ljava/lang/String;", "getIndex", "()I", "getRecordId", "getThirdEntity", "()Lcom/bytedance/ee/bear/contract/drive/sdk/entity/open/SpaceThirdPartyOpenEntity;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class AttachmentFollowData implements NonProguard {
    private final String fieldId;
    private final int index;
    private final String recordId;
    private final SpaceThirdPartyOpenEntity thirdEntity;

    public final String getFieldId() {
        return this.fieldId;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getRecordId() {
        return this.recordId;
    }

    public final SpaceThirdPartyOpenEntity getThirdEntity() {
        return this.thirdEntity;
    }

    public AttachmentFollowData(String str, int i, String str2, SpaceThirdPartyOpenEntity spaceThirdPartyOpenEntity) {
        this.fieldId = str;
        this.index = i;
        this.recordId = str2;
        this.thirdEntity = spaceThirdPartyOpenEntity;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AttachmentFollowData(String str, int i, String str2, SpaceThirdPartyOpenEntity spaceThirdPartyOpenEntity, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2, spaceThirdPartyOpenEntity);
    }
}
