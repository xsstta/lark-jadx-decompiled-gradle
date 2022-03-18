package com.ss.android.vc.irtc.impl.pool;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.vc.irtc.C61064p;
import java.util.HashMap;
import java.util.Map;

public class ByteArrayPool {
    private static long lastDumpTime = System.currentTimeMillis();
    private boolean isLowMemory;
    private volatile boolean mEnable;
    private Handler mHandler;
    private long mMaxPoolSize;
    public Map<Integer, Bytes> mSizePoolMap;
    private HandlerThread mThread;

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    public ByteArrayPool() {
        this(-1);
    }

    public void dump() {
        if (System.currentTimeMillis() - lastDumpTime >= 15000) {
            lastDumpTime = System.currentTimeMillis();
            long j = 0;
            synchronized (this.mSizePoolMap) {
                for (Bytes bytes : this.mSizePoolMap.values()) {
                    j += bytes.size();
                }
            }
            C61064p.m237485a("ByteArrayPool", "Pool Size: " + ((((float) j) / 1024.0f) / 1024.0f) + " MB");
            MemUtils.dumpMemoryInfo();
        }
    }

    public void enable(boolean z) {
        this.mEnable = z;
    }

    public ByteArrayPool(long j) {
        this.mSizePoolMap = new HashMap();
        this.mMaxPoolSize = -1;
        HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot("thread_vc_egl_byte_pool");
        this.mThread = new_android_os_HandlerThread_by_knot;
        this.isLowMemory = false;
        if (j > 0) {
            this.mMaxPoolSize = j * 1024 * 1024;
        }
        new_android_os_HandlerThread_by_knot.start();
        this.mHandler = new Handler(this.mThread.getLooper()) {
            /* class com.ss.android.vc.irtc.impl.pool.ByteArrayPool.HandlerC610451 */

            public void handleMessage(Message message) {
                try {
                    super.handleMessage(message);
                    int i = message.what;
                    synchronized (ByteArrayPool.this.mSizePoolMap) {
                        Bytes bytes = ByteArrayPool.this.mSizePoolMap.get(Integer.valueOf(i));
                        if (bytes != null) {
                            bytes.clear();
                        }
                    }
                } catch (Exception e) {
                    C61064p.m237487c("ByteArrayPool", e.getMessage());
                }
            }
        };
    }

    public byte[] getByteArray(int i) {
        byte[] obtain;
        if (!this.mEnable || i < 0) {
            return null;
        }
        if (i < 1024) {
            return new byte[i];
        }
        Bytes bytes = this.mSizePoolMap.get(Integer.valueOf(i));
        if (bytes == null) {
            synchronized (this.mSizePoolMap) {
                bytes = this.mSizePoolMap.get(Integer.valueOf(i));
                if (bytes == null) {
                    bytes = new Bytes(i, this.mHandler);
                    C61064p.m237485a("ByteArrayPool", "[New Bytes]Size: " + i);
                }
                this.mSizePoolMap.put(Integer.valueOf(i), bytes);
            }
        }
        synchronized (this.mSizePoolMap) {
            obtain = bytes.obtain();
        }
        return obtain;
    }

    public void recycle(byte[] bArr) {
        if (this.mEnable && bArr != null) {
            synchronized (this.mSizePoolMap) {
                Bytes bytes = this.mSizePoolMap.get(Integer.valueOf(bArr.length));
                if (bytes != null) {
                    if (MemUtils.isMemoryLow()) {
                        if (!this.isLowMemory) {
                            dump();
                        }
                        this.isLowMemory = true;
                        return;
                    }
                    this.isLowMemory = false;
                    bytes.recycle(bArr);
                    long j = 0;
                    if (this.mMaxPoolSize > 0) {
                        for (Bytes bytes2 : this.mSizePoolMap.values()) {
                            j += bytes2.size();
                        }
                        if (j > this.mMaxPoolSize) {
                            C61064p.m237485a("ByteArrayPool", "[recycle]Memory is too large: " + j);
                            for (Bytes bytes3 : this.mSizePoolMap.values()) {
                                bytes3.trimToHalf();
                            }
                        }
                    }
                }
            }
        }
    }
}
