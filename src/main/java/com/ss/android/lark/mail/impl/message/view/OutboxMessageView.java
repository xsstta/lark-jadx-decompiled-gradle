package com.ss.android.lark.mail.impl.message.view;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.lark.pb.email.client.v1.MailUpdateOutboxActionRequest;
import com.bytedance.lark.pb.email.client.v1.MailUpdateOutboxActionResponse;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.action.OutboxMailAction;
import com.ss.android.lark.mail.impl.action.ReadThreadListMailAction;
import com.ss.android.lark.mail.impl.entity.C42097j;
import com.ss.android.lark.mail.impl.entity.C42099l;
import com.ss.android.lark.mail.impl.entity.C42104p;
import com.ss.android.lark.mail.impl.message.p2204d.C42871i;
import com.ss.android.lark.mail.impl.message.view.OutboxMessageView;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.service.C43307b;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.view.titlebar.AbsButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.OpenDraftButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.ReadMailSearchButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.TrashButton;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class OutboxMessageView extends BaseMailMessageListView {
    public C42097j ad;
    private final String ae = "MailMessageActivity";

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: G */
    public boolean mo154296G() {
        return false;
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: a */
    public void mo154311a(int i, int i2, Intent intent) {
    }

    @Override // com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView, com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: b */
    public void mo154340b(String str, JSONObject jSONObject) {
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    public int getThreadType() {
        return 4;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView, com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: g */
    public void mo154356g() {
        super.mo154356g();
    }

    @Override // com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView, com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    public String getCurrentThreadId() {
        return this.ad.mo151964g().mo151581b();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView, com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    public int getTemplateLayout() {
        if (C42871i.m170779b()) {
            return R.layout.mail_message_list_tab_item_frame;
        }
        return R.layout.mail_message_list_tab_item;
    }

    public void ai() {
        this.f109706n.finish();
        C43307b.m172030a().mo154977a(new OutboxMailAction(this.ad.mo151964g().mo151627z(), false));
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView, com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    public void getData() {
        C42176e.m168344a().mo152235b(this.f109699g, this.f109700h, new IGetDataCallback<C42099l>() {
            /* class com.ss.android.lark.mail.impl.message.view.OutboxMessageView.C431631 */

            /* renamed from: a */
            public void onSuccess(C42099l lVar) {
                OutboxMessageView.this.mo154542e(lVar);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (OutboxMessageView.this.f109674D != null) {
                    OutboxMessageView.this.f109674D.onError(errorResult);
                }
            }
        });
    }

    public void ag() {
        C42176e.m168344a().mo152206a(this.ad.mo151964g().mo151581b(), this.ad.mo151964g().mo151627z(), MailUpdateOutboxActionRequest.OutboxAction.EDIT, new IGetDataCallback<MailUpdateOutboxActionResponse>() {
            /* class com.ss.android.lark.mail.impl.message.view.OutboxMessageView.C431686 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("outboxAction", "requestOutboxAction");
            }

            /* renamed from: a */
            public void onSuccess(MailUpdateOutboxActionResponse mailUpdateOutboxActionResponse) {
                C43849u.m173826a(new Runnable(mailUpdateOutboxActionResponse) {
                    /* class com.ss.android.lark.mail.impl.message.view.$$Lambda$OutboxMessageView$6$QEINWGocpYbSVlJtTpFG3BeCLxs */
                    public final /* synthetic */ MailUpdateOutboxActionResponse f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        OutboxMessageView.C431686.this.m171612b(this.f$1);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m171612b(MailUpdateOutboxActionResponse mailUpdateOutboxActionResponse) {
                OutboxMessageView.this.ad.mo151964g().mo151605g(mailUpdateOutboxActionResponse.reply_to_mail_id);
                C42699a.m170228a(OutboxMessageView.this.f109706n, OutboxMessageView.this.ad.mo151964g(), "outbox");
                OutboxMessageView.this.f109706n.finish();
                C43307b.m172030a().mo154977a(new OutboxMailAction(OutboxMessageView.this.ad.mo151964g().mo151627z(), false));
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView
    /* renamed from: T */
    public void mo154435T() {
        ArrayList arrayList = new ArrayList();
        TrashButton trashButton = new TrashButton(new AbsButton.AbstractC43948a() {
            /* class com.ss.android.lark.mail.impl.message.view.OutboxMessageView.C431653 */

            @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton.AbstractC43948a
            public void onButtonClick(View view) {
                OutboxMessageView.this.ah();
            }
        });
        OpenDraftButton openDraftButton = new OpenDraftButton(new AbsButton.AbstractC43948a() {
            /* class com.ss.android.lark.mail.impl.message.view.OutboxMessageView.C431664 */

            @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton.AbstractC43948a
            public void onButtonClick(View view) {
                OutboxMessageView.this.ag();
            }
        });
        arrayList.add(trashButton);
        arrayList.add(openDraftButton);
        if (C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.readmail.contentsearch")) {
            arrayList.add(new ReadMailSearchButton(new AbsButton.AbstractC43948a() {
                /* class com.ss.android.lark.mail.impl.message.view.OutboxMessageView.C431675 */

                @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton.AbstractC43948a
                public void onButtonClick(View view) {
                    if (OutboxMessageView.this.f109710r) {
                        OutboxMessageView.this.f109711s.mo153968a(false);
                    }
                }
            }));
        }
        this.f109677G.mo156419a(arrayList, null);
    }

    public void ah() {
        C25639g gVar = new C25639g(this.f109706n);
        gVar.mo89256o(R.color.text_title).mo89253l(3).mo89242c(getResources().getString(R.string.Mail_Alert_DiscardThisMessage)).mo89255n(16);
        C25639g.C25640a aVar = new C25639g.C25640a();
        aVar.mo89266a(R.id.lkui_dialog_btn_center);
        aVar.mo89268a(getResources().getString(R.string.Mail_Alert_Discard));
        aVar.mo89272e(getResources().getColor(R.color.function_danger_500));
        aVar.mo89270c(17);
        aVar.mo89267a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.message.view.OutboxMessageView.DialogInterface$OnClickListenerC431697 */

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                C42176e.m168344a().mo152206a(OutboxMessageView.this.ad.mo151964g().mo151581b(), OutboxMessageView.this.ad.mo151964g().mo151627z(), MailUpdateOutboxActionRequest.OutboxAction.DELETE, new IGetDataCallback<MailUpdateOutboxActionResponse>() {
                    /* class com.ss.android.lark.mail.impl.message.view.OutboxMessageView.DialogInterface$OnClickListenerC431697.C431701 */

                    /* renamed from: a */
                    public void onSuccess(MailUpdateOutboxActionResponse mailUpdateOutboxActionResponse) {
                        OutboxMessageView.this.ai();
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165389i("outboxAction", "requestOutboxAction");
                    }
                });
            }
        });
        C25639g.C25640a aVar2 = new C25639g.C25640a();
        aVar2.mo89266a(R.id.lkui_dialog_btn_left);
        aVar2.mo89268a(getResources().getString(R.string.Mail_Alert_Cancel));
        aVar2.mo89272e(getResources().getColor(R.color.text_title));
        aVar2.mo89270c(17);
        aVar2.mo89267a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.message.view.OutboxMessageView.DialogInterface$OnClickListenerC431718 */

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        gVar.mo89229a(aVar).mo89229a(aVar2);
        gVar.mo89239c();
    }

    public OutboxMessageView(Context context) {
        super(context);
    }

    /* renamed from: e */
    public void mo154542e(C42099l lVar) {
        if (this.f109705m != null) {
            this.f109705m.mo153780a(lVar);
            lVar.mo151985c(true);
            if (!lVar.mo151992i()) {
                C43307b.m172030a().mo154977a(new ReadThreadListMailAction(this.f109699g, this.f109700h, true));
            }
            this.f109705m.mo153780a(lVar);
            List<C42097j> a = lVar.mo151973a();
            if (a.size() > 0) {
                C42097j jVar = a.get(0);
                this.ad = jVar;
                jVar.mo151964g().mo151585b(false);
                this.f109693a.add(this.ad);
                this.f109694b = new C42104p(this.f109699g, lVar.mo151983c(), lVar.mo151986d(), lVar.mo151988e(), lVar.mo151989f(), lVar.mo151990g(), lVar.mo151991h(), lVar.mo151994k());
                if (C42871i.m170779b()) {
                    C43849u.m173826a(new Runnable() {
                        /* class com.ss.android.lark.mail.impl.message.view.OutboxMessageView.RunnableC431642 */

                        public void run() {
                            OutboxMessageView.this.mo154368j();
                            OutboxMessageView.this.f109681K.mo154537a(OutboxMessageView.this.f109686P, false);
                        }
                    });
                }
                if (this.f109674D != null) {
                    this.f109674D.onSuccess(lVar);
                }
            } else if (this.f109674D != null) {
                this.f109674D.onError(new ErrorResult("no message"));
            }
        }
    }

    public OutboxMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
