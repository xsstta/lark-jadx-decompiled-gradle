package com.ss.android.lark.contact.impl.p1760e;

import com.bytedance.lark.pb.basic.v1.Contact;
import com.bytedance.lark.pb.basic.v1.ContactInfo;
import com.bytedance.lark.pb.basic.v1.ContactOperation;
import com.bytedance.lark.pb.basic.v1.ContactSummary;
import com.larksuite.framework.utils.C26249aa;
import com.ss.android.lark.contact.impl.entity.ExternalContact;
import com.ss.android.lark.contact.impl.entity.ExternalContactSummary;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.impl.e.c */
public class C35877c {
    /* renamed from: b */
    public static List<ExternalContact> m140605b(List<ContactInfo> list) {
        return C26249aa.m94984a(list, $$Lambda$c$VgjwRkqjPweozaI2MKpDfuFEtJo.INSTANCE);
    }

    /* renamed from: a */
    public static List<ExternalContact> m140604a(List<Contact> list) {
        return C26249aa.m94984a(list, $$Lambda$ZGH_3Hwtl7UlOc40oLJloKNmu28.INSTANCE);
    }

    /* renamed from: a */
    public static ExternalContact m140600a(Contact contact) {
        if (contact == null) {
            return null;
        }
        ExternalContact externalContact = new ExternalContact();
        externalContact.setChatterId(contact.chatter_id);
        externalContact.setId(contact.id);
        externalContact.setDeleted(contact.is_deleted.booleanValue());
        return externalContact;
    }

    /* renamed from: a */
    public static ExternalContactSummary m140603a(ContactSummary contactSummary) {
        if (contactSummary == null) {
            return null;
        }
        ExternalContactSummary externalContactSummary = new ExternalContactSummary();
        externalContactSummary.setAvatarKey(contactSummary.avatar_key);
        externalContactSummary.setDepartmentName(contactSummary.department_name);
        externalContactSummary.setTenantName(contactSummary.tenant_name);
        externalContactSummary.setUseId(contactSummary.user_id);
        externalContactSummary.setUserEnName(contactSummary.user_en_name);
        externalContactSummary.setUserName(contactSummary.user_name);
        return externalContactSummary;
    }

    /* renamed from: a */
    public static ExternalContact m140602a(ContactInfo contactInfo, boolean z) {
        boolean z2;
        if (contactInfo == null || contactInfo.user_info == null) {
            return null;
        }
        ExternalContact externalContact = new ExternalContact();
        externalContact.setChatterId(contactInfo.user_info.user_id);
        externalContact.setId(contactInfo.user_info.user_id);
        if (!z || contactInfo.op != ContactOperation.OPERATION_DELETE) {
            z2 = false;
        } else {
            z2 = true;
        }
        externalContact.setDeleted(z2);
        return externalContact;
    }
}
