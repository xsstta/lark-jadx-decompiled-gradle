package com.bytedance.ee.bear.middleground.permission.collaborator.invite.existmember;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.existmember.a */
public class C9712a implements NetService.AbstractC5074c<ExistMemberResult> {
    /* renamed from: a */
    public ExistMemberResult parse(String str) {
        ExistMemberResult existMemberResult = new ExistMemberResult();
        ArrayList arrayList = new ArrayList();
        existMemberResult.setExistMembers(arrayList);
        try {
            JSONArray optJSONArray = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).optJSONArray("existed_collaborators");
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = optJSONArray.getJSONObject(i);
                arrayList.add(new Member(jSONObject.optInt("collaborator_type"), jSONObject.optString("collaborator_id")));
            }
            C13479a.m54764b("ExistCollaboratorResultParser", "parse(): result = " + arrayList);
        } catch (Exception e) {
            C13479a.m54774d("ExistCollaboratorResultParser", e);
        }
        return existMemberResult;
    }
}
