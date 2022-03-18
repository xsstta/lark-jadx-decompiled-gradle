package com.ss.android.lark.mail.impl.p2168g.p2169a;

import com.bytedance.lark.pb.email.client.v1.DocsPermissionConfig;
import com.ss.android.lark.mail.impl.entity.MailDocsPermissionConfig;

/* renamed from: com.ss.android.lark.mail.impl.g.a.l */
public class C42135l extends C42128h<DocsPermissionConfig, MailDocsPermissionConfig> {
    public C42135l(C42129i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public MailDocsPermissionConfig mo152042b(DocsPermissionConfig docsPermissionConfig, MailDocsPermissionConfig mailDocsPermissionConfig) {
        super.mo152042b((Object) docsPermissionConfig, (Object) mailDocsPermissionConfig);
        if (mailDocsPermissionConfig == null) {
            mailDocsPermissionConfig = new MailDocsPermissionConfig();
        }
        mailDocsPermissionConfig.mo151308a(docsPermissionConfig.doc_url);
        mailDocsPermissionConfig.mo151307a(docsPermissionConfig.action);
        return mailDocsPermissionConfig;
    }

    /* renamed from: b */
    public DocsPermissionConfig mo152040a(DocsPermissionConfig docsPermissionConfig, MailDocsPermissionConfig mailDocsPermissionConfig) {
        super.mo152040a((Object) docsPermissionConfig, (Object) mailDocsPermissionConfig);
        return new DocsPermissionConfig(mailDocsPermissionConfig.mo151306a(), mailDocsPermissionConfig.mo151309b());
    }
}
