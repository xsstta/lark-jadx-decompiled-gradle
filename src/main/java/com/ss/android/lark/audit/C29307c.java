package com.ss.android.lark.audit;

import com.ss.android.lark.audit.db.AbstractC29317d;
import com.ss.android.lark.audit.model.AuditEvent;

/* renamed from: com.ss.android.lark.audit.c */
public class C29307c implements AbstractC29317d<AuditEvent> {
    /* renamed from: a */
    public AuditEvent mo103876b(String str) {
        return AuditEvent.parseToEntity(str);
    }

    /* renamed from: a */
    public String mo103875a(AuditEvent auditEvent) {
        return auditEvent.parseToString();
    }
}
