package com.bytedance.ee.bear.drive.services;

import android.app.Application;
import com.bytedance.ee.bear.contract.drive.DriveCache;
import com.bytedance.ee.bear.drive.services.BinderDriveDataService;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderDriveDataServiceImp extends BinderDriveDataService.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private AbstractC7181i mDriveDataService;

    @Override // com.bytedance.ee.bear.drive.services.BinderDriveDataService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.drive.services.BinderDriveDataService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.drive.services.BinderDriveDataService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public List<DriveCache> getAll() {
        lazyInit();
        return this.mDriveDataService.getAll();
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public long getCleanableCacheSize() {
        lazyInit();
        return this.mDriveDataService.getCleanableCacheSize();
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public int removeCleanableCache() {
        lazyInit();
        return this.mDriveDataService.removeCleanableCache();
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public boolean removeAll() {
        lazyInit();
        return this.mDriveDataService.removeAll();
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mDriveDataService;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderDriveDataServiceImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public long getCacheSizeByType(int i) {
        lazyInit();
        return this.mDriveDataService.getCacheSizeByType(i);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public boolean remove(String str) {
        lazyInit();
        return this.mDriveDataService.remove(str);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public int removeAll(Long l) {
        lazyInit();
        return this.mDriveDataService.removeAll(l);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public boolean removeList(List<String> list) {
        lazyInit();
        return this.mDriveDataService.removeList(list);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public int trimLruCacheToSize(long j) {
        lazyInit();
        return this.mDriveDataService.trimLruCacheToSize(j);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public boolean removeAll(int i) {
        lazyInit();
        return this.mDriveDataService.removeAll(i);
    }

    public BinderDriveDataServiceImp(AbstractC7181i iVar, Application application) {
        this.mDriveDataService = iVar;
        this.mApplication = application;
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public DriveCache get(String str, boolean z) {
        lazyInit();
        return this.mDriveDataService.get(str, z);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public List<DriveCache> getCacheByTypeAndCacheHost(int i, int i2) {
        lazyInit();
        return this.mDriveDataService.getCacheByTypeAndCacheHost(i, i2);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public int removeUpTimeMills(long j, long j2) {
        lazyInit();
        return this.mDriveDataService.removeUpTimeMills(j, j2);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public boolean updateCacheName(String str, String str2) {
        lazyInit();
        return this.mDriveDataService.updateCacheName(str, str2);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public boolean convertCacheType(String str, int i, int i2) {
        lazyInit();
        return this.mDriveDataService.convertCacheType(str, i, i2);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public List<DriveCache> getCacheByTypeBeforeModTime(int i, int i2, long j, String str, String str2) {
        lazyInit();
        return this.mDriveDataService.getCacheByTypeBeforeModTime(i, i2, j, str, str2);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public boolean put(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, boolean z2) {
        lazyInit();
        return this.mDriveDataService.put(i, i2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, z, z2);
    }
}
