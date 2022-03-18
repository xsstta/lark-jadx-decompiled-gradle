package com.bytedance.ee.bear.middleground.permission.setting.manager;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/manager/CollaboratorCountParser;", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/middleground/permission/setting/manager/CollaboratorCountResult;", "()V", "TAG", "", "parse", "json", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.manager.b */
public final class CollaboratorCountParser implements NetService.AbstractC5074c<CollaboratorCountResult> {

    /* renamed from: a */
    private final String f27275a = "CollaboratorCountParser";

    /* renamed from: a */
    public CollaboratorCountResult parse(String str) {
        int i;
        CollaboratorCountResult collaboratorCountResult = new CollaboratorCountResult();
        try {
            if (str == null) {
                str = "";
            }
            JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (optJSONObject != null) {
                i = optJSONObject.optInt("count");
            } else {
                i = 0;
            }
            collaboratorCountResult.data = Integer.valueOf(i);
        } catch (Throwable th) {
            C13479a.m54761a(this.f27275a, th);
            collaboratorCountResult.data = (Serializable) 0;
        }
        return collaboratorCountResult;
    }
}
