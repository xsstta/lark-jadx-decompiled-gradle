package com.ss.android.lark.ai.enterpriseTopic.p1337a.p1338a;

import com.larksuite.framework.callback.IGetDataCallback;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.ai.enterpriseTopic.p1337a.AbstractC28552a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.ai.GetEnterpriseTopicRequest;
import com.ss.android.lark.pb.ai.GetEnterpriseTopicResponse;
import com.ss.android.lark.pb.ai.MGetEntityCardRequest;
import com.ss.android.lark.pb.ai.MGetEntityCardResponse;
import com.ss.android.lark.pb.ai.RenderType;
import com.ss.android.lark.pb.ai.UserCardActionRequest;
import com.ss.android.lark.pb.ai.UserCardActionResponse;
import com.ss.android.lark.pb.improto.Command;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.C57782ag;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.ai.enterpriseTopic.a.a.a */
public class C28553a implements AbstractC28552a {
    @Override // com.ss.android.lark.ai.enterpriseTopic.p1337a.AbstractC28552a
    /* renamed from: a */
    public void mo101667a(String str, UserCardActionRequest.ActionType actionType, IGetDataCallback<UserCardActionResponse> iGetDataCallback) {
        UserCardActionRequest.C49533a aVar = new UserCardActionRequest.C49533a();
        aVar.mo172750a(str);
        aVar.mo172749a(actionType);
        Command command = Command.ENTERPRISE_TOPIC_USER_CARD_ACTION;
        ProtoAdapter<UserCardActionResponse> protoAdapter = UserCardActionResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.sendPassThroughRequest(command, aVar, iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.ai.enterpriseTopic.p1337a.p1338a.$$Lambda$LxYHtKWnfYuxu2wgRsfPuQk612Q */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (UserCardActionResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    @Override // com.ss.android.lark.ai.enterpriseTopic.p1337a.AbstractC28552a
    /* renamed from: a */
    public void mo101669a(String str, String str2, String str3, String str4, IGetDataCallback<MGetEntityCardResponse> iGetDataCallback) {
        if (C57782ag.m224241a(str)) {
            Log.m165383e("AI.EnterpriseTopicAPI", "getEnterpriseTopicV2 err! entityId is invalid!");
            return;
        }
        MGetEntityCardRequest.C49495a aVar = new MGetEntityCardRequest.C49495a();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(str);
        aVar.mo172660a(arrayList).mo172659a(str2).mo172658a((Boolean) true).mo172657a(RenderType.GECKO).mo172662b(str3).mo172663c(str4);
        Command command = Command.GET_ABBREVIATION_CARD;
        ProtoAdapter<MGetEntityCardResponse> protoAdapter = MGetEntityCardResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.sendPassThroughRequest(command, aVar, iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.ai.enterpriseTopic.p1337a.p1338a.$$Lambda$L5_9IMJnC0RE6O1KKuFPbhr7fMg */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (MGetEntityCardResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    @Override // com.ss.android.lark.ai.enterpriseTopic.p1337a.AbstractC28552a
    /* renamed from: a */
    public void mo101668a(String str, String str2, String str3, GetEnterpriseTopicRequest.Method method, GetEnterpriseTopicRequest.Scene scene, IGetDataCallback<GetEnterpriseTopicResponse> iGetDataCallback) {
        GetEnterpriseTopicRequest.C49471a aVar = new GetEnterpriseTopicRequest.C49471a();
        aVar.mo172607c(str3);
        aVar.mo172604a(str);
        if (scene != null) {
            aVar.mo172603a(scene);
        } else {
            aVar.mo172603a(GetEnterpriseTopicRequest.Scene.MESSENGER);
        }
        aVar.mo172606b(str2);
        aVar.mo172602a(method);
        Command command = Command.GET_ENTERPRISE_TOPIC;
        ProtoAdapter<GetEnterpriseTopicResponse> protoAdapter = GetEnterpriseTopicResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.sendPassThroughRequest(command, aVar, iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.ai.enterpriseTopic.p1337a.p1338a.$$Lambda$AWamKzs0uwB4gz46WA_lNh_LHqI */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (GetEnterpriseTopicResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }
}
