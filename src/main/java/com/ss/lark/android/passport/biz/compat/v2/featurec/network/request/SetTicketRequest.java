package com.ss.lark.android.passport.biz.compat.v2.featurec.network.request;

import com.ss.android.lark.http.model.http.HttpMethod;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a;
import com.ss.android.lark.passport.signinsdk_api.base.p2457c.C49349b;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.RefreshTicketData;
import com.ss.lark.android.passport.biz.compat.v2.http.base.AfterLoginBaseHttpRequest;

public class SetTicketRequest extends AfterLoginBaseHttpRequest<RefreshTicketData> {
    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public String getPath() {
        return "/suite/passport/v3/recover/change";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.AfterLoginBaseHttpRequest
    public boolean isNeedPassportToken() {
        return true;
    }

    public SetTicketRequest() {
        this.mHttpMethod = HttpMethod.POST;
    }

    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.BaseV3HttpRequest, com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public AbstractC49348a getMonitorCodeCreator() {
        return new AbstractC49348a() {
            /* class com.ss.lark.android.passport.biz.compat.v2.featurec.network.request.SetTicketRequest.C645041 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
            /* renamed from: a */
            public OPMonitorCode mo171971a() {
                return C49349b.C49350a.ao;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
            /* renamed from: b */
            public OPMonitorCode mo171972b() {
                return C49349b.C49350a.ap;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
            /* renamed from: c */
            public OPMonitorCode mo171973c() {
                return C49349b.C49350a.aq;
            }
        };
    }
}
