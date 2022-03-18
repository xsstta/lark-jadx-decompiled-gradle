package com.bytedance.ee.bear.list.ownertype;

import com.bytedance.ee.bear.contract.NetService;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/list/ownertype/OwnerType;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Ljava/io/Serializable;", "ownerType", "", "(I)V", "getOwnerType", "()I", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class OwnerType extends NetService.Result<Serializable> {
    private final int ownerType;

    public final int getOwnerType() {
        return this.ownerType;
    }

    public OwnerType(int i) {
        this.ownerType = i;
    }
}
