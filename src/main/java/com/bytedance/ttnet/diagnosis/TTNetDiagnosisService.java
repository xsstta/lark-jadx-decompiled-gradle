package com.bytedance.ttnet.diagnosis;

import com.bytedance.frameworks.baselib.network.http.cronet.impl.C13998f;
import com.bytedance.ttnet.HttpClient;
import com.bytedance.ttnet.TTNetInit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TTNetDiagnosisService {
    private static final Map<Integer, String> sTypeStringMap;

    private static C13998f getCronetHttpClient() throws Exception {
        if (HttpClient.isCronetClientEnable()) {
            return C13998f.m56620a(TTNetInit.getTTNetDepend().mo69984a());
        }
        throw new UnsupportedOperationException("Cronet is not enabled");
    }

    static {
        HashMap hashMap = new HashMap();
        sTypeStringMap = hashMap;
        hashMap.put(0, "DNS_RESOLVE_TARGET");
        hashMap.put(1, "RACE_TARGETS");
        hashMap.put(2, "ACCELERATE_TARGET");
        hashMap.put(3, "DIAGNOSE_TARGET");
        hashMap.put(4, "DIAGNOSE_V2_TARGET");
    }

    private static String requestTypeToString(int i) {
        return sTypeStringMap.get(Integer.valueOf(i));
    }

    public static void reportUserLog(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                C13998f cronetHttpClient = getCronetHttpClient();
                if (cronetHttpClient != null) {
                    cronetHttpClient.mo51560i(str);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static boolean isOneTargetRequestType(int i) {
        if (i != 0) {
            if (i == 1) {
                return false;
            }
            if (!(i == 2 || i == 3 || i == 4)) {
                throw new IllegalArgumentException("Illegal request type: " + i);
            }
        }
        return true;
    }

    private static boolean isValidNetDetect(int i, long j) {
        if (i == 0) {
            return true;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    return true;
                }
                throw new IllegalArgumentException("Illegal request type: " + i);
            } else if (j == 1 || j == 2 || j == 64) {
                return true;
            } else {
                return false;
            }
        } else if ((67 & j) == 0 || (j & -68) != 0) {
            return false;
        } else {
            return true;
        }
    }

    public static IDiagnosisRequest createRequest(int i, String str, int i2, int i3) throws Exception {
        if (!isOneTargetRequestType(i)) {
            throw new IllegalArgumentException("Type " + requestTypeToString(i) + " of request should be created with multiple targets.");
        } else if (!isValidNetDetect(i, (long) i2)) {
            throw new IllegalArgumentException("Illegal netDetectType: " + i2);
        } else if (i != 0 && i != 2 && i != 3 && i != 4) {
            return null;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            return new C20769a(i, arrayList, i2, i3);
        }
    }

    public static IDiagnosisRequest createRequest(int i, List<String> list, int i2, int i3) throws Exception {
        if (isOneTargetRequestType(i)) {
            throw new IllegalArgumentException("Type " + requestTypeToString(i) + " of request should be created with only one target.");
        } else if (!isValidNetDetect(i, (long) i2)) {
            throw new IllegalArgumentException("Illegal netDetectType: " + i2);
        } else if (i != 1) {
            return null;
        } else {
            return new C20769a(i, list, i2, i3);
        }
    }
}
