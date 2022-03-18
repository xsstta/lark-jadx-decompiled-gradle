package com.bytedance.ee.bear.drive.services;

import com.bytedance.ee.bear.binder.annotation.NewRemoteService;
import com.bytedance.ee.bear.contract.drive.DriveCache;
import java.util.List;

@NewRemoteService
/* renamed from: com.bytedance.ee.bear.drive.services.i */
public interface AbstractC7181i {
    boolean convertCacheType(String str, int i, int i2);

    DriveCache get(String str, boolean z);

    List<DriveCache> getAll();

    List<DriveCache> getCacheByTypeAndCacheHost(int i, int i2);

    List<DriveCache> getCacheByTypeBeforeModTime(int i, int i2, long j, String str, String str2);

    long getCacheSizeByType(int i);

    long getCleanableCacheSize();

    boolean put(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, boolean z2);

    boolean remove(String str);

    int removeAll(Long l);

    boolean removeAll();

    boolean removeAll(int i);

    int removeCleanableCache();

    boolean removeList(List<String> list);

    int removeUpTimeMills(long j, long j2);

    int trimLruCacheToSize(long j);

    boolean updateCacheName(String str, String str2);
}
