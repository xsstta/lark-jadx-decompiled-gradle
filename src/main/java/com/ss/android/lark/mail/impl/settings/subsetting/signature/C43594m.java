package com.ss.android.lark.mail.impl.settings.subsetting.signature;

import android.content.Context;
import androidx.lifecycle.AbstractC1178x;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.mulprocess.C43213b;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.ISettingService;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.settings.AbstractC43396c;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43585h;
import com.ss.android.lark.mail.impl.utils.C43849u;
import ee.android.framework.manis.C68183b;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.m */
public class C43594m extends BasePresenter<AbstractC43585h.AbstractC43586a, SignatureView, AbstractC43585h.AbstractC43587b.AbstractC43588a> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC43585h.AbstractC43587b.AbstractC43588a createViewDelegate() {
        return new AbstractC43585h.AbstractC43587b.AbstractC43588a() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.C43594m.C435951 */

            @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43585h.AbstractC43587b.AbstractC43588a
            /* renamed from: a */
            public void mo155583a() {
                C42699a.m170290i((Context) ((SignatureView) C43594m.this.getView()).mo155544a(), ((AbstractC43585h.AbstractC43586a) C43594m.this.getModel()).mo155581a());
            }

            @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43585h.AbstractC43587b.AbstractC43588a
            /* renamed from: a */
            public void mo155584a(EmailSignature emailSignature) {
                ((AbstractC43585h.AbstractC43586a) C43594m.this.getModel()).mo155582a(emailSignature);
            }
        };
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        if (C41816b.m166115a().mo150120a() != C43213b.f109974a) {
            ((ISettingService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), ISettingService.class)).removeSignatureChangeCallback(((AbstractC43585h.AbstractC43586a) getModel()).mo155581a());
        }
        super.destroy();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            ((AbstractC43585h.AbstractC43586a) getModel()).mo155580a(true).mo5923a(((SignatureView) getView()).mo155544a(), new AbstractC1178x<EmailSignature>() {
                /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.C43594m.C435962 */

                /* renamed from: a */
                public void onChanged(EmailSignature emailSignature) {
                    if (emailSignature != null) {
                        ((SignatureView) C43594m.this.getView()).mo155546a(emailSignature);
                    }
                }
            });
        } else {
            ((ISettingService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), ISettingService.class)).addSignatureChangeCallback(((AbstractC43585h.AbstractC43586a) getModel()).mo155581a(), new AbstractC43396c() {
                /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.C43594m.C435973 */

                @Override // com.ss.android.lark.mail.impl.settings.AbstractC43396c
                public void onChanged(final EmailSignature emailSignature) {
                    if (emailSignature != null) {
                        C43849u.m173826a(new Runnable() {
                            /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.C43594m.C435973.RunnableC435981 */

                            public void run() {
                                ((SignatureView) C43594m.this.getView()).mo155546a(emailSignature);
                            }
                        });
                    }
                }
            });
        }
    }

    public C43594m(AbstractC43585h.AbstractC43586a aVar, SignatureView signatureView) {
        super(aVar, signatureView);
    }
}
