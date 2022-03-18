package com.ss.android.lark.audit.http;

import com.ss.android.lark.audit.AbstractC29324f;
import com.ss.android.lark.audit.C29304b;
import com.ss.android.lark.audit.model.AuditEvent;
import com.ss.android.lark.audit.security_event.SecurityEvent;
import com.ss.android.lark.http.model.http.HttpMethod;
import com.ss.android.lark.http.model.http.HttpRequestBody;
import com.ss.android.lark.log.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AuditRequest extends BaseRequest implements Serializable {
    public List<AuditEvent> events;

    @Override // com.ss.android.lark.audit.http.IRequest
    public HttpRequestBody getRequestBody() {
        return null;
    }

    @Override // com.ss.android.lark.audit.http.IRequest
    public void onProcessResponseHeaders(Map map) {
    }

    @Override // com.ss.android.lark.audit.http.IRequest
    public HttpMethod getMethod() {
        return HttpMethod.POST;
    }

    @Override // com.ss.android.lark.audit.http.IRequest
    public String getUrl() {
        String str;
        AbstractC29324f d = C29304b.m107713a().mo103858d();
        if (d == null) {
            str = "";
        } else {
            str = d.mo103860a();
        }
        return str + "/suite/admin/security/events/";
    }

    @Override // com.ss.android.lark.audit.http.IRequest
    public byte[] getRequestBytes() {
        try {
            SecurityEvent.C29357e.C29358a p = SecurityEvent.C29357e.m107862p();
            if (this.events != null) {
                ArrayList arrayList = new ArrayList();
                for (AuditEvent auditEvent : this.events) {
                    arrayList.add(AuditEvent.convertPbEvent(auditEvent));
                }
                p.mo103982a((Iterable<? extends SecurityEvent.C29354c>) arrayList);
            }
            return ((SecurityEvent.C29357e) p.mo80148i()).mo80225b();
        } catch (Exception e) {
            Log.m165383e("AuditRequest", "getRequestBytes error " + e.getMessage());
            return new byte[0];
        }
    }
}
