package com.ss.android.lark.ai.enterpriseTopic.p1337a;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.pb.ai.GetEnterpriseTopicRequest;
import com.ss.android.lark.pb.ai.GetEnterpriseTopicResponse;
import com.ss.android.lark.pb.ai.MGetEntityCardResponse;
import com.ss.android.lark.pb.ai.UserCardActionRequest;
import com.ss.android.lark.pb.ai.UserCardActionResponse;

/* renamed from: com.ss.android.lark.ai.enterpriseTopic.a.a */
public interface AbstractC28552a {
    /* renamed from: a */
    void mo101667a(String str, UserCardActionRequest.ActionType actionType, IGetDataCallback<UserCardActionResponse> iGetDataCallback);

    /* renamed from: a */
    void mo101668a(String str, String str2, String str3, GetEnterpriseTopicRequest.Method method, GetEnterpriseTopicRequest.Scene scene, IGetDataCallback<GetEnterpriseTopicResponse> iGetDataCallback);

    /* renamed from: a */
    void mo101669a(String str, String str2, String str3, String str4, IGetDataCallback<MGetEntityCardResponse> iGetDataCallback);
}
