package com.ss.ttvideoengine.abr;

import android.text.TextUtils;
import com.bytedance.vcloud.abrmodule.AbstractC20879g;
import com.bytedance.vcloud.abrmodule.DefaultABRModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ABRPool {
    private static boolean mEnabled;
    private static ABRPool singleton;
    private int mCreated;
    private final List<AbstractC20879g> mListCache = new ArrayList();
    private final Lock mLock = new ReentrantLock();
    private final Map<String, AbstractC20879g> mMapCache = new HashMap();
    private final List<String> mMapOrder = new ArrayList();

    public static void clear() {
        getInstance().clearPool();
    }

    private ABRPool() {
    }

    public static ABRPool getInstance() {
        if (singleton == null) {
            synchronized (ABRPool.class) {
                if (singleton == null) {
                    singleton = new ABRPool();
                }
            }
        }
        return singleton;
    }

    private void clearPool() {
        ArrayList<AbstractC20879g> arrayList = new ArrayList();
        this.mLock.lock();
        arrayList.addAll(this.mListCache);
        arrayList.addAll(this.mMapCache.values());
        this.mListCache.clear();
        this.mMapCache.clear();
        this.mMapOrder.clear();
        this.mLock.unlock();
        for (AbstractC20879g gVar : arrayList) {
            gVar.mo70553d();
        }
        arrayList.clear();
    }

    public AbstractC20879g getFromCache() {
        AbstractC20879g gVar = null;
        if (!mEnabled) {
            return null;
        }
        this.mLock.lock();
        if (this.mListCache.size() > 0) {
            gVar = this.mListCache.remove(0);
        } else if (this.mCreated < 8) {
            gVar = new DefaultABRModule();
            this.mCreated++;
        } else if (this.mMapOrder.size() >= 6) {
            gVar = this.mMapCache.remove(this.mMapOrder.remove(0));
        }
        this.mLock.unlock();
        return gVar;
    }

    public static void setEnabled(boolean z) {
        mEnabled = z;
    }

    public void giveBack(AbstractC20879g gVar) {
        this.mLock.lock();
        gVar.mo70551c();
        this.mListCache.add(gVar);
        this.mLock.unlock();
    }

    public AbstractC20879g getFromPreloaded(String str) {
        if (!mEnabled || TextUtils.isEmpty(str)) {
            return null;
        }
        this.mLock.lock();
        AbstractC20879g remove = this.mMapCache.remove(str);
        this.mMapOrder.remove(str);
        this.mLock.unlock();
        return remove;
    }

    public void preloadDone(String str, AbstractC20879g gVar) {
        this.mLock.lock();
        gVar.mo70551c();
        this.mMapCache.put(str, gVar);
        this.mMapOrder.remove(str);
        this.mMapOrder.add(str);
        this.mLock.unlock();
    }
}
