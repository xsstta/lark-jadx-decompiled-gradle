package com.ss.android.lark.mail.impl.message.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.lark.pb.email.client.v1.MailGetMessageFullBodyResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.C42097j;
import com.ss.android.lark.mail.impl.entity.C42099l;
import com.ss.android.lark.mail.impl.message.p2204d.C42871i;
import com.ss.android.lark.mail.impl.monitor.event.detail.BigMessageMonitor;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.view.titlebar.AbsButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.ReadMailSearchButton;
import java.util.ArrayList;

public class BigContentMessageView extends MailMessageListView {
    public String ad;

    /* renamed from: ai  reason: collision with root package name */
    private BigMessageMonitor f175449ai = new BigMessageMonitor();

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: B */
    public boolean mo154291B() {
        return false;
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    public int getThreadType() {
        return 2;
    }

    private void ah() {
        this.f109676F = true;
        BigMessageMonitor bVar = this.f175449ai;
        if (bVar != null) {
            bVar.mo152342c();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: D */
    public void mo154293D() {
        super.mo154293D();
        BigMessageMonitor bVar = this.f175449ai;
        if (bVar != null) {
            bVar.mo152339a("render_start");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: v */
    public void mo154379v() {
        BigMessageMonitor bVar = this.f175449ai;
        if (bVar != null) {
            bVar.mo152339a("parse_start");
        }
        super.mo154379v();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: C */
    public String mo154292C() {
        String C = super.mo154292C();
        BigMessageMonitor bVar = this.f175449ai;
        if (bVar != null) {
            bVar.mo152339a("parse_end");
            this.f175449ai.mo152345a((long) (C.length() / 1024));
        }
        return C;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: E */
    public void mo154294E() {
        super.mo154294E();
        BigMessageMonitor bVar = this.f175449ai;
        if (bVar != null) {
            bVar.mo152339a("render_end");
            this.f175449ai.mo152344e();
        }
    }

    @Override // com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView, com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView, com.ss.android.lark.mail.impl.message.view.MailMessageListView
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

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView
    /* renamed from: T */
    public void mo154435T() {
        if (C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.readmail.contentsearch") && this.f109705m.mo153785b().mo154056g() && this.f109695c != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new ReadMailSearchButton(new AbsButton.AbstractC43948a() {
                /* class com.ss.android.lark.mail.impl.message.view.BigContentMessageView.C431341 */

                @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton.AbstractC43948a
                public void onButtonClick(View view) {
                    if (BigContentMessageView.this.f109710r) {
                        BigContentMessageView.this.f109711s.mo153968a(false);
                    }
                }
            }));
            this.f109677G.mo156419a(arrayList, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView, com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    public void getData() {
        int i;
        if (this.f109703k != null) {
            i = this.f109703k.size();
        } else {
            i = 0;
        }
        if (i != 0) {
            BigMessageMonitor bVar = this.f175449ai;
            if (bVar != null) {
                bVar.mo152339a("rust_start");
            }
            C42176e.m168344a().mo152222a((String) this.f109703k.get(0), false, (IGetDataCallback<MailGetMessageFullBodyResponse>) new IGetDataCallback<MailGetMessageFullBodyResponse>() {
                /* class com.ss.android.lark.mail.impl.message.view.BigContentMessageView.C431352 */

                /* renamed from: a */
                public void onSuccess(MailGetMessageFullBodyResponse mailGetMessageFullBodyResponse) {
                    BigContentMessageView.this.ad = mailGetMessageFullBodyResponse.full_body_html;
                    BigContentMessageView.super.getData();
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    if (BigContentMessageView.this.f109674D != null) {
                        BigContentMessageView.this.f109674D.onError(errorResult);
                    }
                }
            });
        } else if (this.f109674D != null) {
            this.f109674D.onError(ErrorResult.TIMEOUT_ERROR);
        }
    }

    public BigContentMessageView(Context context) {
        super(context);
        ah();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView, com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: a */
    public void mo154312a(ViewGroup viewGroup) {
        if (C42871i.m170779b()) {
            this.f109683M = (TextView) findViewById(R.id.message_list_mail_title_bar_text);
            mo154368j();
        }
        BigMessageMonitor bVar = this.f175449ai;
        if (bVar != null) {
            bVar.mo152339a("init_event");
        }
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: a */
    public void mo154319a(C42099l lVar) {
        if (lVar != null) {
            for (C42097j jVar : lVar.mo151973a()) {
                if (TextUtils.equals(jVar.mo151964g().mo151581b(), (CharSequence) this.f109703k.get(0))) {
                    jVar.mo151964g().mo151590c(false);
                    jVar.mo151964g().mo151588c(this.ad);
                    jVar.mo151961e();
                    lVar.mo151977a(new ArrayList<C42097j>(jVar) {
                        /* class com.ss.android.lark.mail.impl.message.view.BigContentMessageView.C431363 */
                        final /* synthetic */ C42097j val$mailMessageItem;

                        {
                            this.val$mailMessageItem = r2;
                            add(r2);
                        }
                    });
                }
            }
        }
    }

    public BigContentMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ah();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView, com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: a */
    public void mo154320a(C42099l lVar, boolean z, boolean z2) {
        super.mo154320a(lVar, z, z2);
        BigMessageMonitor bVar = this.f175449ai;
        if (bVar != null) {
            bVar.mo152339a("rust_end");
        }
    }
}
