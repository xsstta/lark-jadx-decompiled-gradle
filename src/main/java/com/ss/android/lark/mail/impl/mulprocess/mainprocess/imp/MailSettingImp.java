package com.ss.android.lark.mail.impl.mulprocess.mainprocess.imp;

import android.content.Context;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.mail.impl.entity.EmailAliasList;
import com.ss.android.lark.mail.impl.entity.EmailAutoReply;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41870b;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;

@RemoteServiceImpl(service = IMailSetting.class)
public class MailSettingImp implements IMailSetting {
    private Context mContext;

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting
    public EmailAliasList getAliasList() {
        return C43350d.m172098a().mo155044j();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting
    public EmailAutoReply getAutoReplyValue() {
        return C43350d.m172098a().mo155053s();
    }

    public MailSettingImp(Context context) {
        this.mContext = context;
    }

    private AbstractC41870b createIGetDataCallback(final IMailSetting.AbstractC43218a aVar) {
        return new AbstractC41870b() {
            /* class com.ss.android.lark.mail.impl.mulprocess.mainprocess.imp.MailSettingImp.C432201 */

            @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41870b
            /* renamed from: a */
            public void mo150434a(ErrorResult errorResult) {
                IMailSetting.AbstractC43218a aVar = aVar;
                if (aVar != null) {
                    aVar.onFail();
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.larksuite.framework.callback.IRequestCallback, com.ss.android.lark.mail.impl.p2164c.AbstractC41870b
            public void onError(ErrorResult errorResult) {
                IMailSetting.AbstractC43218a aVar = aVar;
                if (aVar != null) {
                    aVar.onFail();
                }
            }

            @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41870b
            /* renamed from: a */
            public void mo150435a(Object obj) {
                IMailSetting.AbstractC43218a aVar = aVar;
                if (aVar != null) {
                    aVar.onSuc(null);
                }
            }
        };
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting
    public void updateAutoReply(EmailAutoReply emailAutoReply, IMailSetting.AbstractC43218a aVar) {
        C43350d.m172098a().mo155029a(emailAutoReply, createIGetDataCallback(aVar));
    }
}
