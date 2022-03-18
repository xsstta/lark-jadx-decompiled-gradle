package com.bytedance.ee.bear.middleground.permission.setting.manager;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/manager/CheckLockParser;", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/middleground/permission/setting/manager/CheckLockResult;", "()V", "TAG", "", "parse", "json", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.manager.a */
public final class CheckLockParser implements NetService.AbstractC5074c<CheckLockResult> {

    /* renamed from: a */
    private final String f27274a = "CheckLockParser";

    /* renamed from: a */
    public CheckLockResult parse(String str) {
        boolean z;
        String str2 = str;
        boolean z2 = false;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C13479a.m54758a(this.f27274a, "json is null or empty");
            return new CheckLockResult();
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (optJSONObject != null) {
                z2 = optJSONObject.optBoolean("need_lock");
            }
            return new CheckLockResult(z2);
        } catch (Throwable th) {
            C13479a.m54761a(this.f27274a, th);
            return new CheckLockResult();
        }
    }
}
