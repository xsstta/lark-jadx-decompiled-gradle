package com.bytedance.ee.bear.middleground.permission.permission.bitableshare;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/bitableshare/BitableShareUserPermissionParser;", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/middleground/permission/permission/bitableshare/BitableShareUserPermission;", "()V", "parse", "json", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.permission.bitableshare.c */
public final class BitableShareUserPermissionParser implements NetService.AbstractC5074c<BitableShareUserPermission> {
    /* renamed from: a */
    public BitableShareUserPermission parse(String str) {
        boolean z;
        try {
            if (str == null) {
                str = "";
            }
            JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (optJSONObject != null) {
                z = optJSONObject.optBoolean("permitted");
            } else {
                z = false;
            }
            return new BitableShareUserPermission(z);
        } catch (Throwable th) {
            C13479a.m54759a("BitableSharePermissionParser", "parseUserPerm()...error", th);
            return new BitableShareUserPermission(false);
        }
    }
}
