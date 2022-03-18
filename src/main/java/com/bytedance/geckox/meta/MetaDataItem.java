package com.bytedance.geckox.meta;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/geckox/meta/MetaDataItem;", "Ljava/io/Serializable;", "lastReadTimeStamp", "", "allowUpdate", "", "(JZ)V", "geckox_noasanRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class MetaDataItem implements Serializable {
    public boolean allowUpdate;
    public long lastReadTimeStamp;

    public MetaDataItem(long j, boolean z) {
        this.lastReadTimeStamp = j;
        this.allowUpdate = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MetaDataItem(long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? true : z);
    }
}
