package com.bytedance.ee.bear.list.folder;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.net.C5203d;
import com.bytedance.ee.log.C13479a;
import org.json.JSONException;
import org.json.JSONObject;

public class ap {
    /* renamed from: a */
    public static boolean m34441a(Throwable th) {
        if (C5203d.m21235a(th, 4)) {
            try {
                if (new JSONObject(((NetService.ServerErrorException) th).getData()).optInt("permission_status_code") == 10016) {
                    return true;
                }
                return false;
            } catch (JSONException e) {
                C13479a.m54759a("PermissionErrorHelper", "isForbiddenForPassword()...throwable = " + th, e);
            }
        }
        return false;
    }
}
