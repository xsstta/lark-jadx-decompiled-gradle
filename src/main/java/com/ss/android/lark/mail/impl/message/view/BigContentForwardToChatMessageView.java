package com.ss.android.lark.mail.impl.message.view;

import android.content.Context;
import android.util.AttributeSet;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.C42097j;
import com.ss.android.lark.mail.impl.entity.C42099l;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.utils.C43849u;
import java.util.Collections;

public class BigContentForwardToChatMessageView extends ForwardToChatMessageListView {
    /* renamed from: y */
    private void m171525y() {
        this.f109676F = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: B */
    public boolean mo154291B() {
        return false;
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: I */
    public void mo154298I() {
        if (C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.bigmailkillprocess")) {
            if (!this.f109710r) {
                try {
                    mo150630o();
                    this.f109697e.evaluateJavascript("ttwebview:/*crashRenderProcess*/;", null);
                } catch (Exception unused) {
                }
            }
            super.mo154298I();
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView, com.ss.android.lark.mail.impl.message.view.ForwardToChatMessageListView
    public void getData() {
        int i;
        if (this.f109703k != null) {
            i = this.f109703k.size();
        } else {
            i = 0;
        }
        if (i != 0) {
            C43849u.m173826a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.message.view.$$Lambda$JSQ5aR8EB_yqL19UWbjkZihUkqo */

                public final void run() {
                    BigContentForwardToChatMessageView.this.mo154373r();
                }
            });
            C42176e.m168344a().mo152237b((String) this.f109703k.get(0), true, (IGetDataCallback<MailMessage>) new IGetDataCallback<MailMessage>() {
                /* class com.ss.android.lark.mail.impl.message.view.BigContentForwardToChatMessageView.C431331 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    if (BigContentForwardToChatMessageView.this.f109674D != null) {
                        BigContentForwardToChatMessageView.this.f109674D.onError(errorResult);
                    }
                }

                /* renamed from: a */
                public void onSuccess(MailMessage mailMessage) {
                    if (BigContentForwardToChatMessageView.this.f109674D != null && mailMessage != null) {
                        C42099l lVar = new C42099l();
                        C42097j jVar = new C42097j();
                        jVar.mo151953a(mailMessage);
                        lVar.mo151977a(Collections.singletonList(jVar));
                        lVar.mo151980b(mailMessage.mo151604g());
                        BigContentForwardToChatMessageView.this.mo154507d(lVar);
                        BigContentForwardToChatMessageView.this.f109674D.onSuccess(lVar);
                    }
                }
            });
        } else if (this.f109674D != null) {
            this.f109674D.onError(ErrorResult.TIMEOUT_ERROR);
        }
    }

    public BigContentForwardToChatMessageView(Context context) {
        super(context);
        m171525y();
    }

    public BigContentForwardToChatMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m171525y();
    }
}
