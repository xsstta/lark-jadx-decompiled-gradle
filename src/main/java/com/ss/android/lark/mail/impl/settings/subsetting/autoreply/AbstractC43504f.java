package com.ss.android.lark.mail.impl.settings.subsetting.autoreply;

import com.bytedance.lark.pb.email.client.v1.MailUpdateAccountResponse;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.mail.impl.entity.EmailAutoReply;
import com.ss.android.lark.mail.impl.entity.MailImage;
import com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41870b;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.autoreply.f */
public interface AbstractC43504f {

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.autoreply.f$a */
    public interface AbstractC43505a extends IModel {
        /* renamed from: a */
        EmailAutoReply mo155356a();

        /* renamed from: a */
        void mo155357a(EmailAutoReply emailAutoReply, AbstractC41870b<MailUpdateAccountResponse> bVar);

        /* renamed from: b */
        String mo155358b();
    }

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.autoreply.f$b */
    public interface AbstractC43506b extends IView<AbstractC43507a> {

        /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.autoreply.f$b$a */
        public interface AbstractC43507a extends AbstractC42759b {
            /* renamed from: a */
            EmailAutoReply mo155367a();

            /* renamed from: a */
            void mo155368a(EmailAutoReply emailAutoReply, List<MailImage> list, AbstractC41870b<MailUpdateAccountResponse> bVar);

            /* renamed from: b */
            boolean mo155369b();

            /* renamed from: c */
            String[] mo155370c();

            /* renamed from: d */
            void mo155371d();
        }
    }
}
