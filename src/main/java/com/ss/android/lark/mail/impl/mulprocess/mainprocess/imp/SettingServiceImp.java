package com.ss.android.lark.mail.impl.mulprocess.mainprocess.imp;

import android.content.Context;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.lark.pb.email.client.v1.MailUpdateAccountResponse;
import com.ss.android.lark.mail.impl.entity.EmailAliasList;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.ISettingService;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41870b;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.settings.AbstractC43396c;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.EmailSignature;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;

@RemoteServiceImpl(service = ISettingService.class)
public class SettingServiceImp implements ISettingService {
    private Context mContext;
    public AbstractC1178x mSignatureObserver;

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.ISettingService
    public void removeSignatureChangeCallback(String str) {
        doRemoveSignatureChangeCallback(str);
    }

    public SettingServiceImp(Context context) {
        this.mContext = context;
    }

    private void doRemoveSignatureChangeCallback(final String str) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.mulprocess.mainprocess.imp.SettingServiceImp.RunnableC432252 */

            public void run() {
                C43350d.m172099a(str).mo155038c(true).mo5928b(SettingServiceImp.this.mSignatureObserver);
            }
        });
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.ISettingService
    public boolean isSmartReplyEnable(String str) {
        return C43350d.m172099a(str).mo155049o();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.ISettingService
    public EmailAliasList getAliasList(String str) {
        if (C43350d.m172099a(str).mo155041f() == null) {
            return null;
        }
        return C43350d.m172099a(str).mo155041f().mo151896j();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.ISettingService
    public void addSignatureChangeCallback(String str, AbstractC43396c cVar) {
        doAddSignatureChangeCallback(str, cVar);
    }

    private void doAddSignatureChangeCallback(final String str, final AbstractC43396c cVar) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.mulprocess.mainprocess.imp.SettingServiceImp.RunnableC432231 */

            public void run() {
                SettingServiceImp.this.mSignatureObserver = new AbstractC1178x<EmailSignature>() {
                    /* class com.ss.android.lark.mail.impl.mulprocess.mainprocess.imp.SettingServiceImp.RunnableC432231.C432241 */

                    /* renamed from: a */
                    public void onChanged(EmailSignature emailSignature) {
                        if (cVar != null) {
                            cVar.onChanged(emailSignature);
                        }
                    }
                };
                C43350d.m172099a(str).mo155038c(true).mo5925a(SettingServiceImp.this.mSignatureObserver);
            }
        });
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.ISettingService
    public void updateSignature(String str, EmailSignature emailSignature) {
        C43350d.m172099a(str).mo155033a(emailSignature, (AbstractC41870b<MailUpdateAccountResponse>) null);
    }
}
