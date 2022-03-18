package com.bytedance.ttnet.http;

import com.bytedance.frameworks.baselib.network.http.BaseHttpRequestInfo;

public class HttpRequestInfo extends BaseHttpRequestInfo<RequestContext> {
    public int cdnVerifyValue = -1;
    public boolean reqTicketUnmatch;

    public static void injectCreate() {
        BaseHttpRequestInfo.setCreate(new BaseHttpRequestInfo.AbstractC13966a() {
            /* class com.bytedance.ttnet.http.HttpRequestInfo.C207711 */

            @Override // com.bytedance.frameworks.baselib.network.http.BaseHttpRequestInfo.AbstractC13966a
            /* renamed from: a */
            public BaseHttpRequestInfo mo51360a() {
                return new HttpRequestInfo();
            }
        });
    }
}
