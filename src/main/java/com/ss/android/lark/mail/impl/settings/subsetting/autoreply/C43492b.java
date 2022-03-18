package com.ss.android.lark.mail.impl.settings.subsetting.autoreply;

import android.content.Context;
import androidx.lifecycle.AbstractC1178x;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.mail.impl.entity.EmailAutoReply;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.settings.subsetting.autoreply.AbstractC43500e;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.autoreply.b */
public class C43492b extends BasePresenter<AbstractC43500e.AbstractC43501a, AutoReplyView, AbstractC43500e.AbstractC43502b.AbstractC43503a> {
    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC43500e.AbstractC43502b.AbstractC43503a createViewDelegate() {
        return new AbstractC43500e.AbstractC43502b.AbstractC43503a() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.autoreply.C43492b.C434931 */

            @Override // com.ss.android.lark.mail.impl.settings.subsetting.autoreply.AbstractC43500e.AbstractC43502b.AbstractC43503a
            /* renamed from: a */
            public void mo155353a() {
                C42699a.m170289h((Context) ((AutoReplyView) C43492b.this.getView()).mo155315b(), ((AbstractC43500e.AbstractC43501a) C43492b.this.getModel()).mo155349a());
            }

            @Override // com.ss.android.lark.mail.impl.settings.subsetting.autoreply.AbstractC43500e.AbstractC43502b.AbstractC43503a
            /* renamed from: a */
            public void mo155354a(EmailAutoReply emailAutoReply) {
                ((AbstractC43500e.AbstractC43501a) C43492b.this.getModel()).mo155350a(emailAutoReply);
            }
        };
    }

    /* renamed from: b */
    public void mo155352b() {
        ((AutoReplyView) getView()).mo155316c();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((AbstractC43500e.AbstractC43501a) getModel()).mo155348a(true).mo5923a(((AutoReplyView) getView()).mo155315b(), new AbstractC1178x<EmailAutoReply>() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.autoreply.C43492b.C434942 */

            /* renamed from: a */
            public void onChanged(EmailAutoReply emailAutoReply) {
                if (emailAutoReply != null) {
                    ((AutoReplyView) C43492b.this.getView()).mo155313a(emailAutoReply);
                }
            }
        });
    }

    public C43492b(AbstractC43500e.AbstractC43501a aVar, AutoReplyView autoReplyView) {
        super(aVar, autoReplyView);
    }
}
