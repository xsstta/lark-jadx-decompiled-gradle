package com.ss.android.lark.passport.infra.util.storage;

import java.util.concurrent.ConcurrentHashMap;

public class InternalPassportStorageServiceImpl implements IPassportStorageService {
    private static InternalPassportStorageServiceImpl sInstance;
    private ConcurrentHashMap<String, String> mStorage = new ConcurrentHashMap<>();

    private InternalPassportStorageServiceImpl() {
    }

    public static InternalPassportStorageServiceImpl getInstance() {
        if (sInstance == null) {
            synchronized (InternalPassportStorageServiceImpl.class) {
                if (sInstance == null) {
                    sInstance = new InternalPassportStorageServiceImpl();
                }
            }
        }
        return sInstance;
    }

    @Override // com.ss.android.lark.passport.infra.util.storage.IPassportStorageService
    public String getData(String str) {
        ConcurrentHashMap<String, String> concurrentHashMap = this.mStorage;
        if (concurrentHashMap != null) {
            return concurrentHashMap.get(str);
        }
        return "";
    }

    @Override // com.ss.android.lark.passport.infra.util.storage.IPassportStorageService
    public String remove(String str) {
        ConcurrentHashMap<String, String> concurrentHashMap = this.mStorage;
        if (concurrentHashMap == null || !concurrentHashMap.contains(str)) {
            return "";
        }
        return this.mStorage.remove(str);
    }

    @Override // com.ss.android.lark.passport.infra.util.storage.IPassportStorageService
    public void setData(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap = this.mStorage;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(str, str2);
        }
    }
}
