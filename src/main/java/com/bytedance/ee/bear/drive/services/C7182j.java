package com.bytedance.ee.bear.drive.services;

import android.app.Application;
import android.os.SystemClock;
import com.bytedance.ee.bear.contract.drive.DriveCache;
import com.bytedance.ee.bear.drive.cache.AbstractC6882b;
import com.bytedance.ee.bear.drive.cache.p340a.C6881a;
import com.bytedance.ee.log.C13479a;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.services.j */
public class C7182j extends AbstractC7173a {

    /* renamed from: a */
    private volatile AbstractC6882b f19300a;

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.service.AbstractC10933f, com.bytedance.ee.bear.drive.services.AbstractC7173a
    /* renamed from: b */
    public Class<?>[] mo16351b() {
        return super.mo16351b();
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public List<DriveCache> getAll() {
        return this.f19300a.mo27102a();
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public long getCleanableCacheSize() {
        return this.f19300a.mo27113c();
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public int removeCleanableCache() {
        return this.f19300a.mo27114d();
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public boolean removeAll() {
        return this.f19300a.mo27112b();
    }

    /* renamed from: d */
    private void m28793d() {
        if (this.f19300a == null) {
            synchronized (C7182j.class) {
                if (this.f19300a == null) {
                    this.f19300a = new C6881a(mo28167c());
                }
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public long getCacheSizeByType(int i) {
        return this.f19300a.mo27111b(i);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public boolean remove(String str) {
        return this.f19300a.mo27107a(str);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public int removeAll(Long l) {
        return this.f19300a.mo27100a(l);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public boolean removeList(List<String> list) {
        return this.f19300a.mo27110a(list);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public int trimLruCacheToSize(long j) {
        return this.f19300a.mo27098a(j);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public boolean removeAll(int i) {
        return this.f19300a.mo27105a(i);
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.drive.services.AbstractC7173a
    public void lazyInit(Application application) {
        super.lazyInit(application);
        long uptimeMillis = SystemClock.uptimeMillis();
        m28793d();
        C13479a.m54764b("DriveDataServiceImpl", "lazyInit timeCost=" + (SystemClock.uptimeMillis() - uptimeMillis));
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public DriveCache get(String str, boolean z) {
        return this.f19300a.mo27101a(str, z);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public List<DriveCache> getCacheByTypeAndCacheHost(int i, int i2) {
        return this.f19300a.mo27103a(i, i2);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public boolean updateCacheName(String str, String str2) {
        return this.f19300a.mo27109a(str, str2);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public int removeUpTimeMills(long j, long j2) {
        int a = this.f19300a.mo27099a(j, j2);
        C13479a.m54764b("DriveDataServiceImpl", "DriveDataServiceImpl.clearUpTimeMills, upTimeMills: " + j + ", maxSizeBytes: " + j2 + ", cleanSize: " + a);
        return a;
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public boolean convertCacheType(String str, int i, int i2) {
        return this.f19300a.mo27108a(str, i, i2);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public List<DriveCache> getCacheByTypeBeforeModTime(int i, int i2, long j, String str, String str2) {
        return this.f19300a.mo27104a(i, i2, j, str, str2);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
    public boolean put(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, boolean z2) {
        return this.f19300a.mo27106a(i, i2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, z, z2);
    }
}
