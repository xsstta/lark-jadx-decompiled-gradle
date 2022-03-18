package com.ss.android.lark.audit.model;

import android.text.TextUtils;
import com.larksuite.framework.http.p1191f.C26003a;
import com.ss.android.lark.audit.db.AbstractC29316c;
import com.ss.android.lark.audit.security_event.SecurityEvent;
import com.ss.android.lark.log.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AuditEvent implements AbstractC29316c, Serializable {
    public Env env;
    public Extend extend;
    public int moduleType;
    public List<ObjectEntity> objectEntitys;
    public int operationType;
    public OperatorEntity operator;
    public List<RecipientEntity> recipients;
    public String tenantId;
    public String timeStamp;

    public AuditEvent() {
    }

    public String parseToString() {
        return C26003a.m94121a(this);
    }

    public static AuditEvent parseToEntity(String str) {
        return (AuditEvent) C26003a.m94120a(str, AuditEvent.class);
    }

    public static boolean checkAuditEvent(AuditEvent auditEvent) {
        if (auditEvent.moduleType < 1) {
            Log.m165383e("AuditEvent", "convertPbEvent moduleType is wrong " + auditEvent.moduleType);
            return false;
        } else if (auditEvent.operationType < 1) {
            Log.m165383e("AuditEvent", "convertPbEvent operationType is wrong " + auditEvent.operationType);
            return false;
        } else if (TextUtils.isEmpty(auditEvent.timeStamp)) {
            Log.m165383e("AuditEvent", "convertPbEvent timeStamp is wrong " + auditEvent.timeStamp);
            return false;
        } else if (auditEvent.operator == null) {
            Log.m165383e("AuditEvent", "convertPbEvent operator is null ");
            return false;
        } else {
            List<ObjectEntity> list = auditEvent.objectEntitys;
            if (list == null || list.size() == 0) {
                Log.m165383e("AuditEvent", "convertPbEvent objectEntitys is empty ");
                return false;
            }
            List<ObjectEntity> list2 = auditEvent.objectEntitys;
            if (list2 != null && list2.size() != 0) {
                return true;
            }
            Log.m165383e("AuditEvent", "convertPbEvent objectEntitys is empty ");
            return false;
        }
    }

    public static SecurityEvent.C29354c convertPbEvent(AuditEvent auditEvent) {
        if (auditEvent == null) {
            Log.m165383e("AuditEvent", "convertPB AuditEvent is null");
            return null;
        } else if (!checkAuditEvent(auditEvent)) {
            Log.m165383e("AuditEvent", "auditEvent is not permitted upLoad");
            return null;
        } else {
            SecurityEvent.C29354c.C29355a A = SecurityEvent.C29354c.m107823A();
            if (auditEvent.env != null) {
                SecurityEvent.C29351a.C29352a y = SecurityEvent.C29351a.m107796y();
                y.mo103952a(auditEvent.env.did);
                y.mo103950a(SecurityEvent.ClientType.forNumber(auditEvent.env.clientType));
                y.mo103955d(auditEvent.env.ip);
                y.mo103953b(auditEvent.env.location);
                y.mo103951a(SecurityEvent.FlagType.forNumber(auditEvent.env.flagType));
                y.mo103954c(auditEvent.env.ua);
                A.mo103979a((SecurityEvent.C29351a) y.mo80148i());
            }
            if (auditEvent.extend != null) {
                SecurityEvent.C29360g.C29361a s = SecurityEvent.C29360g.m107871s();
                s.mo103995a(SecurityEvent.AppDetail.forNumber(auditEvent.extend.appDetail));
                s.mo103996a(SecurityEvent.CommentType.forNumber(auditEvent.extend.commentType));
                s.mo103994a((long) auditEvent.extend.createGroup);
                s.mo103997b((long) auditEvent.extend.dissGroup);
                A.mo103980a((SecurityEvent.C29360g) s.mo80148i());
            }
            A.mo103977a(SecurityEvent.ModuleType.forNumber(auditEvent.moduleType));
            A.mo103978a(SecurityEvent.OperationType.forNumber(auditEvent.operationType));
            if (auditEvent.operator != null) {
                SecurityEvent.C29369m.C29370a o = SecurityEvent.C29369m.m107940o();
                SecurityEvent.C29372o.C29373a s2 = SecurityEvent.C29372o.m107946s();
                s2.mo104037a(SecurityEvent.EntityType.forNumber(auditEvent.operator.entityType));
                s2.mo103952a(auditEvent.operator.value);
                s2.mo104038a((SecurityEvent.C29369m) o.mo80148i());
                A.mo103981a((SecurityEvent.C29372o) s2.mo80148i());
            }
            if (auditEvent.recipients != null) {
                ArrayList arrayList = new ArrayList();
                for (RecipientEntity recipientEntity : auditEvent.recipients) {
                    SecurityEvent.C29378s.C29379a s3 = SecurityEvent.C29378s.m107971s();
                    s3.mo103952a(recipientEntity.value);
                    s3.mo104046a(SecurityEvent.EntityType.forNumber(recipientEntity.entityType));
                    if (recipientEntity.detail != null) {
                        SecurityEvent.C29375q.C29376a p = SecurityEvent.C29375q.m107962p();
                        p.mo104040a(SecurityEvent.PermissionActionType.forNumber(recipientEntity.detail.permissionActionType));
                        s3.mo104047a((SecurityEvent.C29375q) p.mo80148i());
                    }
                    arrayList.add(s3.mo80148i());
                }
                A.mo103982a((Iterable<? extends SecurityEvent.C29378s>) arrayList);
            }
            A.mo103984b(auditEvent.tenantId);
            A.mo103952a(auditEvent.timeStamp);
            if (auditEvent.objectEntitys != null) {
                ArrayList arrayList2 = new ArrayList();
                for (ObjectEntity objectEntity : auditEvent.objectEntitys) {
                    SecurityEvent.C29366k.C29367a s4 = SecurityEvent.C29366k.m107925s();
                    s4.mo103952a(objectEntity.value);
                    s4.mo104030a(SecurityEvent.EntityType.forNumber(objectEntity.entityType));
                    if (objectEntity.detail != null) {
                        SecurityEvent.C29363i.C29364a C = SecurityEvent.C29363i.m107889C();
                        C.mo104019a(SecurityEvent.PermissionSettingType.forNumber(objectEntity.detail.permissionSettingType));
                        C.mo104020b(objectEntity.detail.textDetail);
                        C.mo103952a(objectEntity.detail.cloneSource);
                        C.mo104021c(objectEntity.detail.fileName);
                        C.mo104022d(objectEntity.detail.thridPartyAppId);
                        C.mo104018a(SecurityEvent.ContainerType.forNumber(objectEntity.detail.containerType));
                        C.mo104023e(objectEntity.detail.containerID);
                        C.mo104024f(objectEntity.detail.currentPage);
                        s4.mo104031a((SecurityEvent.C29363i) C.mo80148i());
                    }
                    arrayList2.add(s4.mo80148i());
                }
                A.mo103983b(arrayList2);
            }
            return (SecurityEvent.C29354c) A.mo80148i();
        }
    }

    public AuditEvent(int i, int i2, String str, OperatorEntity operatorEntity, List<RecipientEntity> list, List<ObjectEntity> list2, Env env2, Extend extend2, long j) {
        this.moduleType = i;
        this.operationType = i2;
        this.tenantId = str;
        this.operator = operatorEntity;
        this.recipients = list;
        this.objectEntitys = list2;
        this.env = env2;
        this.extend = extend2;
        this.timeStamp = "" + j;
    }
}
