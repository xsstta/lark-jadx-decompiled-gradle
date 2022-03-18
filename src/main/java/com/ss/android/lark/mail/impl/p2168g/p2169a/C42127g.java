package com.ss.android.lark.mail.impl.p2168g.p2169a;

import com.bytedance.lark.pb.email.client.v1.EmailClientConfig;
import com.ss.android.lark.mail.impl.entity.MailClientConfig;

/* renamed from: com.ss.android.lark.mail.impl.g.a.g */
public class C42127g extends C42128h<EmailClientConfig, MailClientConfig> {
    public C42127g(C42129i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public MailClientConfig mo152042b(EmailClientConfig emailClientConfig, MailClientConfig mailClientConfig) {
        if (mailClientConfig == null) {
            mailClientConfig = new MailClientConfig();
        }
        if (!(emailClientConfig == null || emailClientConfig == null)) {
            mailClientConfig.mo151294a(emailClientConfig.enabled.booleanValue());
            mailClientConfig.mo151293a(emailClientConfig.email_address);
            mailClientConfig.mo151292a(emailClientConfig.config_status);
        }
        return mailClientConfig;
    }

    /* renamed from: b */
    public EmailClientConfig mo152040a(EmailClientConfig emailClientConfig, MailClientConfig mailClientConfig) {
        if (mailClientConfig == null) {
            return null;
        }
        return new EmailClientConfig(Boolean.valueOf(mailClientConfig.mo151295a()), mailClientConfig.mo151296b(), mailClientConfig.mo151297c());
    }
}
