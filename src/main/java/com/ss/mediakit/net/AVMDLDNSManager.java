package com.ss.mediakit.net;

import java.util.HashMap;
import java.util.Map;

public class AVMDLDNSManager {
    public static Map<Integer, CreateConstructor> dnsMap;
    private static AVMDLDNSManager mInstance;

    private AVMDLDNSManager() throws Exception {
        dnsMap = new HashMap();
        initDnsMap();
    }

    public static AVMDLDNSManager getInstance() {
        if (mInstance == null) {
            synchronized (AVMDLDNSManager.class) {
                if (mInstance == null) {
                    try {
                        mInstance = new AVMDLDNSManager();
                    } catch (Exception e) {
                        e.printStackTrace();
                        mInstance = null;
                    }
                }
            }
        }
        return mInstance;
    }

    private void initDnsMap() throws Exception {
        DefaultConstructor defaultConstructor = new DefaultConstructor();
        dnsMap.put(1, defaultConstructor);
        dnsMap.put(2, defaultConstructor);
        dnsMap.put(3, defaultConstructor);
    }

    public synchronized CreateConstructor getCreateConstructor(int i) throws Exception {
        if (!dnsMap.containsKey(Integer.valueOf(i))) {
            return null;
        }
        return dnsMap.get(Integer.valueOf(i));
    }

    public synchronized void registerDnsConstructor(int i, CreateConstructor createConstructor) {
        try {
            dnsMap.put(Integer.valueOf(i), createConstructor);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return;
    }
}
