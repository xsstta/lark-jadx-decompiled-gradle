package com.ss.android.lark.userprotocol.impl.p2902a;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.GetNewestPoliciesRequest;
import com.bytedance.lark.pb.basic.v1.GetNewestPoliciesResponse;
import com.bytedance.lark.pb.basic.v1.SendAffirmNewestPoliciesRequest;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.userprotocol.C57712a;
import com.ss.android.lark.userprotocol.impl.p2902a.AbstractC57715a;
import java.io.IOException;

/* renamed from: com.ss.android.lark.userprotocol.impl.a.b */
public class C57717b implements AbstractC57715a {
    @Override // com.ss.android.lark.userprotocol.impl.p2902a.AbstractC57715a
    /* renamed from: a */
    public void mo195872a(IGetDataCallback<AbstractC57715a.C57716a> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_NEWEST_POLICIES, new GetNewestPoliciesRequest.C14981a(), iGetDataCallback, new SdkSender.IParser<AbstractC57715a.C57716a>() {
            /* class com.ss.android.lark.userprotocol.impl.p2902a.C57717b.C577181 */

            /* renamed from: a */
            public AbstractC57715a.C57716a parse(byte[] bArr) throws IOException {
                GetNewestPoliciesResponse decode = GetNewestPoliciesResponse.ADAPTER.decode(bArr);
                if (decode == null) {
                    return null;
                }
                AbstractC57715a.C57716a aVar = new AbstractC57715a.C57716a();
                aVar.mo195876a(decode.need_sign);
                aVar.mo195877a(decode.version);
                aVar.mo195880b(decode.title);
                aVar.mo195875a(C57712a.m224049a().mo177758a(decode.display_content));
                aVar.mo195879b(decode.has_updated);
                aVar.mo195882c(decode.terms);
                aVar.mo195884d(decode.privacy);
                return aVar;
            }
        });
    }

    @Override // com.ss.android.lark.userprotocol.impl.p2902a.AbstractC57715a
    /* renamed from: a */
    public void mo195873a(String str, IGetDataCallback<String> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.SEND_AFFIRM_NEWEST_POLICIES, new SendAffirmNewestPoliciesRequest.C15251a().mo55521a(str), iGetDataCallback, new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.userprotocol.impl.p2902a.C57717b.C577192 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return "";
            }
        });
    }
}
