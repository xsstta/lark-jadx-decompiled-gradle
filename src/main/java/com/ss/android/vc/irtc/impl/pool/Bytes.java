package com.ss.android.vc.irtc.impl.pool;

import android.os.Handler;
import com.ss.android.vc.irtc.C61064p;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Bytes {
    private List<byte[]> mByteList = new LinkedList();
    private int mByteSize;
    private Handler mHandler;

    public long size() {
        return (long) (this.mByteList.size() * this.mByteSize);
    }

    private void countDownClear() {
        this.mHandler.removeMessages(this.mByteSize);
        this.mHandler.sendEmptyMessageDelayed(this.mByteSize, 1000);
    }

    public void clear() {
        this.mByteList.clear();
        C61064p.m237485a("Bytes", "[Memory-Clear]Size:" + this.mByteSize + " - Pool:" + this.mByteList.size());
    }

    public byte[] obtain() {
        byte[] bArr;
        if (this.mByteList.size() > 0) {
            bArr = this.mByteList.remove(0);
        } else if (!MemUtils.isMemoryLow((long) this.mByteSize)) {
            bArr = new byte[this.mByteSize];
        } else {
            bArr = null;
        }
        countDownClear();
        return bArr;
    }

    public void trimToHalf() {
        int size = this.mByteList.size();
        if (this.mByteList.size() < 2) {
            this.mByteList.clear();
            C61064p.m237485a("Bytes", "[Memory-Half]Size:" + this.mByteSize + " - Pool-Before:" + size + ", Pool-After:" + this.mByteList.size());
            return;
        }
        int size2 = this.mByteList.size() / 2;
        while (this.mByteList.size() > size2) {
            List<byte[]> list = this.mByteList;
            list.remove(list.size() - 1);
        }
        C61064p.m237485a("Bytes", "[Memory-Half]Size:" + this.mByteSize + " - Pool-Before:" + size + ", Pool-After:" + this.mByteList.size());
    }

    public void recycle(byte[] bArr) {
        if (bArr == null || bArr.length != this.mByteSize) {
            C61064p.m237487c("Bytes", "[Memory-Recycle]Invalid array.");
            return;
        }
        this.mByteList.size();
        Iterator<byte[]> it = this.mByteList.iterator();
        while (it.hasNext()) {
            if (System.currentTimeMillis() - ByteUtils.byteArrayToLong(it.next()) >= 1000) {
                it.remove();
            }
        }
        if (!this.mByteList.contains(bArr)) {
            ByteUtils.longToByteArray(System.currentTimeMillis(), bArr);
            this.mByteList.add(0, bArr);
        }
        countDownClear();
    }

    public Bytes(int i, Handler handler) {
        this.mByteSize = i;
        this.mHandler = handler;
    }
}
