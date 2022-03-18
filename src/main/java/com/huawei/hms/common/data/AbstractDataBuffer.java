package com.huawei.hms.common.data;

import android.os.Bundle;
import com.huawei.hms.support.api.client.Result;
import java.util.Iterator;

public abstract class AbstractDataBuffer<T> extends Result implements DataBuffer<T> {
    protected final DataHolder mDataHolder;

    @Override // com.huawei.hms.common.data.DataBuffer
    public abstract T get(int i);

    @Override // com.huawei.hms.common.data.DataBuffer
    public final void close() {
        release();
    }

    @Override // com.huawei.hms.common.data.DataBuffer
    public Bundle getMetadata() {
        return this.mDataHolder.getMetadata();
    }

    @Override // com.huawei.hms.common.data.DataBuffer, java.lang.Iterable
    public Iterator<T> iterator() {
        return new DBInnerIter(this);
    }

    @Override // com.huawei.hms.common.api.Releasable, com.huawei.hms.common.data.DataBuffer
    public void release() {
        DataHolder dataHolder = this.mDataHolder;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override // com.huawei.hms.common.data.DataBuffer
    public Iterator<T> singleRefIterator() {
        return new SingleRefDBInnerIter(this);
    }

    @Override // com.huawei.hms.common.data.DataBuffer
    public int getCount() {
        DataHolder dataHolder = this.mDataHolder;
        if (dataHolder == null) {
            return 0;
        }
        return dataHolder.getCount();
    }

    @Override // com.huawei.hms.common.data.DataBuffer
    public boolean isClosed() {
        DataHolder dataHolder = this.mDataHolder;
        if (dataHolder == null) {
            return true;
        }
        return dataHolder.isClosed();
    }

    protected AbstractDataBuffer(DataHolder dataHolder) {
        this.mDataHolder = dataHolder;
    }
}
