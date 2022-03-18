package com.ss.android.lark.mail.impl.compose;

import android.content.Context;
import android.content.DialogInterface;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.C25644o;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.component.ui.dialog.LKUIListItemData;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDBaseListDialogAdapter;
import com.larksuite.component.universe_design.dialog.UDBaseListDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.C42092d;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.view.dialog.C43939b;
import com.ss.android.lark.mail.impl.view.dialog.C43943c;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.compose.a */
public class C41923a {

    /* renamed from: a */
    private final String f106404a = "ComposeMailDialogHelper";

    /* renamed from: b */
    private final int f106405b = 16;

    /* renamed from: c */
    private final int f106406c = 17;

    /* renamed from: d */
    private Context f106407d;

    /* renamed from: com.ss.android.lark.mail.impl.compose.a$a */
    enum EnumC41933a {
        RemovedByShareOwner,
        SentByShareOwner,
        DiscardedByShareOwner
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.compose.a$b */
    public interface AbstractC41934b {
        void onAddressSelected(MailAddress mailAddress);
    }

    /* renamed from: a */
    public void mo150730a(Context context, DialogInterface.OnClickListener onClickListener) {
        C25639g gVar = new C25639g(context);
        gVar.mo89250i(R.color.text_title).mo89249h(17).mo89252k(3).mo89248g(R.string.Mail_Attachment_AttachmentsBlocked).mo89256o(R.color.text_title).mo89254m(R.string.Mail_Attachment_AttachmentsBlockedReason).mo89255n(16);
        C25639g.C25640a aVar = new C25639g.C25640a();
        aVar.mo89266a(R.id.lkui_dialog_btn_left).mo89269b(R.string.Mail_Attachment_ScanAttachmentsBlockedMoreInfo).mo89271d(R.color.text_title).mo89270c(17).mo89267a(new DialogInterface.OnClickListener(onClickListener) {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$a$VXDKNfD9Nlof0vxPlXCjGthDI */
            public final /* synthetic */ DialogInterface.OnClickListener f$0;

            {
                this.f$0 = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C41923a.m166685l(this.f$0, dialogInterface, i);
            }
        });
        C25639g.C25640a aVar2 = new C25639g.C25640a();
        aVar2.mo89266a(R.id.lkui_dialog_btn_center).mo89269b(R.string.Mail_Attachment_ScanAttachmentsBlockedConfirm).mo89271d(R.color.primary_pri_500).mo89270c(17).mo89267a($$Lambda$a$CS_pW57pXuqHcJoo6FINx7Dmps.INSTANCE);
        gVar.mo89229a(aVar).mo89229a(aVar2).mo89239c();
        C42209j.m168612a("send_attachment_blocked", "alert");
    }

    /* renamed from: a */
    public void mo150732a(Context context, DialogInterface.OnClickListener onClickListener, final DialogInterface.OnCancelListener onCancelListener) {
        Log.m165389i("ComposeMailDialogHelper", "showAttachmentHarmfulLimitedDialog");
        C25639g gVar = new C25639g(context);
        gVar.mo89250i(R.color.text_title).mo89249h(17).mo89252k(3).mo89248g(R.string.Mail_Attachment_AttachmentsBlocked).mo89256o(R.color.text_title).mo89254m(R.string.Mail_Attachment_ScanAttachmentsBlockedSendWithout).mo89255n(16);
        C25639g.C25640a aVar = new C25639g.C25640a();
        aVar.mo89266a(R.id.lkui_dialog_btn_left).mo89269b(R.string.Mail_Attachment_ScanAttachmentsBlockedCancel).mo89271d(R.color.text_title).mo89270c(17).mo89267a(new DialogInterface.OnClickListener(onCancelListener) {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$a$e2g938Cmm9XBJagKQQoG84rrxQM */
            public final /* synthetic */ DialogInterface.OnCancelListener f$0;

            {
                this.f$0 = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C41923a.m166668b(this.f$0, dialogInterface, i);
            }
        });
        gVar.mo89226a(new DialogInterface.OnCancelListener() {
            /* class com.ss.android.lark.mail.impl.compose.C41923a.AnonymousClass11 */

            public void onCancel(DialogInterface dialogInterface) {
                onCancelListener.onCancel(dialogInterface);
            }
        });
        C25639g.C25640a aVar2 = new C25639g.C25640a();
        aVar2.mo89266a(R.id.lkui_dialog_btn_center).mo89269b(R.string.Mail_Attachment_ScanAttachmentsBlockedSend).mo89271d(R.color.primary_pri_500).mo89270c(17).mo89267a(new DialogInterface.OnClickListener(onClickListener) {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$a$gqX_7aaa7NKCV8OnYozloivjNA */
            public final /* synthetic */ DialogInterface.OnClickListener f$0;

            {
                this.f$0 = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C41923a.m166684k(this.f$0, dialogInterface, i);
            }
        });
        gVar.mo89229a(aVar).mo89229a(aVar2).mo89263v(R.color.bg_float).mo89239c();
        C42209j.m168612a("send_attachment_blocked", "alert");
    }

    /* renamed from: a */
    public void mo150734a(Context context, String str, final DialogInterface.OnClickListener onClickListener) {
        C25639g gVar = new C25639g(context);
        gVar.mo89250i(R.color.text_title).mo89249h(17).mo89252k(3).mo89256o(R.color.text_title).mo89255n(16);
        C25639g.C25640a aVar = new C25639g.C25640a();
        aVar.mo89266a(R.id.lkui_dialog_btn_center);
        aVar.mo89268a(context.getString(R.string.Mail_Alert_OK));
        aVar.mo89272e(context.getResources().getColor(R.color.primary_pri_500));
        aVar.mo89270c(17);
        aVar.mo89267a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.compose.C41923a.AnonymousClass12 */

            public void onClick(DialogInterface dialogInterface, int i) {
                onClickListener.onClick(dialogInterface, i);
                dialogInterface.dismiss();
            }
        });
        gVar.mo89248g(R.string.Mail_Alert_TitleInvaildEmailAddress);
        gVar.mo89242c(str).mo89229a(aVar);
        gVar.mo89263v(R.color.bg_float);
        gVar.mo89239c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo150736a(EnumC41933a aVar, DialogInterface.OnClickListener onClickListener) {
        String str;
        Log.m165389i("ComposeMailDialogHelper", "showInterruptEditingDialog");
        if (aVar != null) {
            int i = C419329.f106433a[aVar.ordinal()];
            if (i == 1) {
                str = C43819s.m173684a((int) R.string.Mail_Share_CoeditMessageSentByOwnerAlert);
                C42209j.m168612a("share_draft_sent_by_owner", "alert");
            } else if (i == 2) {
                str = C43819s.m173684a((int) R.string.Mail_Share_CoeditThreadNotReachableAlert);
                C42209j.m168612a("share_mail_not_reachable", "alert");
            } else if (i == 3) {
                str = C43819s.m173684a((int) R.string.Mail_Share_CoeditDraftDiscardedByOwnerAlert);
                C42209j.m168612a("share_draft_discarded_by_owner", "alert");
            } else {
                return;
            }
            new C25639g(this.f106407d).mo89242c(str).mo89246d(false).mo89247e(false).mo89224a(R.id.lkui_dialog_btn_center, R.string.Mail_Alert_OK, onClickListener).mo89263v(R.color.bg_float).mo89239c();
        }
    }

    /* renamed from: a */
    public void mo150737a(C43943c cVar, List<MailAddress> list, MailAddress mailAddress, final AbstractC41934b bVar) {
        if (cVar != null) {
            ArrayList arrayList = new ArrayList();
            for (final MailAddress mailAddress2 : list) {
                if (mailAddress2 != null) {
                    arrayList.add(new C43943c.C43945a(mailAddress2.mo151197r(), new Runnable() {
                        /* class com.ss.android.lark.mail.impl.compose.C41923a.RunnableC419263 */

                        public void run() {
                            bVar.onAddressSelected(mailAddress2);
                        }
                    }, mailAddress2.equals(mailAddress)));
                }
            }
            cVar.mo156390a(arrayList);
        }
    }

    /* renamed from: a */
    public void mo150735a(Context context, final List<C42092d> list, DialogInterface.OnClickListener onClickListener) {
        C419274 r8 = new ArrayList<UDBaseListDialogBuilder.ListItem>() {
            /* class com.ss.android.lark.mail.impl.compose.C41923a.C419274 */
        };
        Iterator<C42092d> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            int i = R.color.text_title;
            if (hasNext) {
                C42092d next = it.next();
                UDBaseListDialogBuilder.ListItemBuilder bVar = new UDBaseListDialogBuilder.ListItemBuilder(next.mo89285a());
                if (!next.mo151842d()) {
                    i = R.color.text_disable;
                }
                bVar.mo90886a(i);
                r8.add(bVar.mo90889c());
            } else {
                ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(context).title("")).mo90873b(r8)).mo90869a(new UDListDialogController.OnItemClickListener() {
                    /* class com.ss.android.lark.mail.impl.compose.C41923a.C419296 */

                    @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
                    public void onItemClick(int i) {
                        C42092d dVar = (C42092d) list.get(i);
                        if (dVar != null) {
                            dVar.mo151841c();
                        }
                    }
                })).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_cancel).mo90704a(this.f106407d.getResources().getString(R.string.Mail_Alert_Cancel)).mo90707c(17).mo90712e(UIHelper.getColor(R.color.text_title)))).mo90868a(new UDBaseListDialogAdapter(this.f106407d) {
                    /* class com.ss.android.lark.mail.impl.compose.C41923a.C419285 */

                    @Override // com.larksuite.component.universe_design.dialog.UDBaseListDialogAdapter
                    /* renamed from: a */
                    public void onBindViewHolder(UDBaseListDialogAdapter.UDDialogListItemViewHolder aVar, int i) {
                        super.onBindViewHolder(aVar, i);
                        C42092d dVar = (C42092d) list.get(i);
                        if (dVar != null) {
                            aVar.itemView.setFocusable(dVar.mo151842d());
                            aVar.itemView.setClickable(dVar.mo151842d());
                            aVar.itemView.setEnabled(dVar.mo151842d());
                        }
                    }
                })).show();
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo150731a(Context context, DialogInterface.OnClickListener onClickListener, int i) {
        C25639g gVar = new C25639g(context);
        gVar.mo89256o(R.color.text_title).mo89254m(R.string.Mail_Normal_Uploadimagefailed).mo89255n(16);
        C25639g.C25640a aVar = new C25639g.C25640a();
        aVar.mo89266a(R.id.lkui_dialog_btn_center).mo89269b(i).mo89271d(R.color.primary_pri_500).mo89270c(17).mo89267a(new DialogInterface.OnClickListener(onClickListener) {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$a$uWJvj1JymYOxV3zU3rMQoU8tQ */
            public final /* synthetic */ DialogInterface.OnClickListener f$0;

            {
                this.f$0 = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C41923a.m166682i(this.f$0, dialogInterface, i);
            }
        });
        C25639g.C25640a aVar2 = new C25639g.C25640a();
        aVar2.mo89266a(R.id.lkui_dialog_btn_left).mo89269b(R.string.Mail_Compose_LFActionCancel).mo89271d(R.color.text_title).mo89270c(17).mo89267a($$Lambda$a$JOdtJ0s8fizIOb0RnODCXMX0e4.INSTANCE);
        gVar.mo89229a(aVar).mo89229a(aVar2).mo89263v(R.color.bg_float).mo89239c();
        C42209j.m168612a("send_save_draft_image_uploading", "alert");
    }

    /* renamed from: a */
    public void mo150733a(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        C25639g gVar = new C25639g(context);
        gVar.mo89250i(R.color.text_title).mo89248g(R.string.Mail_Compose_LFDeleteTitle).mo89249h(17);
        C25639g.C25640a aVar = new C25639g.C25640a();
        aVar.mo89266a(R.id.lkui_dialog_btn_left).mo89269b(R.string.Mail_Compose_LFActionCancel).mo89271d(R.color.text_title).mo89270c(17).mo89267a(new DialogInterface.OnClickListener(onClickListener) {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$a$tzZpsKAki6389P4lG2ysp8x2iTU */
            public final /* synthetic */ DialogInterface.OnClickListener f$0;

            {
                this.f$0 = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C41923a.m166681h(this.f$0, dialogInterface, i);
            }
        });
        C25639g.C25640a aVar2 = new C25639g.C25640a();
        aVar2.mo89266a(R.id.lkui_dialog_btn_right).mo89269b(R.string.Mail_Compose_LFActionDelete).mo89271d(R.color.primary_pri_500).mo89270c(17).mo89267a(new DialogInterface.OnClickListener(onClickListener2) {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$a$AqHGiCVaBcjqOqa3GvJpsWHD6Og */
            public final /* synthetic */ DialogInterface.OnClickListener f$0;

            {
                this.f$0 = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C41923a.m166680g(this.f$0, dialogInterface, i);
            }
        });
        gVar.mo89229a(aVar).mo89229a(aVar2).mo89263v(R.color.bg_float).mo89239c();
    }

    /* renamed from: b */
    private C25639g m166666b() {
        C25639g gVar = new C25639g(this.f106407d);
        gVar.mo89256o(R.color.text_title).mo89253l(3).mo89255n(16).mo89263v(R.color.bg_float);
        return gVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.compose.a$9 */
    public static /* synthetic */ class C419329 {

        /* renamed from: a */
        static final /* synthetic */ int[] f106433a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.lark.mail.impl.compose.a$a[] r0 = com.ss.android.lark.mail.impl.compose.C41923a.EnumC41933a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.compose.C41923a.C419329.f106433a = r0
                com.ss.android.lark.mail.impl.compose.a$a r1 = com.ss.android.lark.mail.impl.compose.C41923a.EnumC41933a.SentByShareOwner     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.compose.C41923a.C419329.f106433a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.mail.impl.compose.a$a r1 = com.ss.android.lark.mail.impl.compose.C41923a.EnumC41933a.RemovedByShareOwner     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.mail.impl.compose.C41923a.C419329.f106433a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.mail.impl.compose.a$a r1 = com.ss.android.lark.mail.impl.compose.C41923a.EnumC41933a.DiscardedByShareOwner     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.compose.C41923a.C419329.<clinit>():void");
        }
    }

    /* renamed from: c */
    private C25639g.C25640a m166671c() {
        C25639g.C25640a aVar = new C25639g.C25640a();
        aVar.mo89266a(R.id.lkui_dialog_btn_center);
        aVar.mo89268a(this.f106407d.getString(R.string.Mail_Alert_OK));
        aVar.mo89272e(this.f106407d.getResources().getColor(R.color.primary_pri_500));
        aVar.mo89270c(17);
        aVar.mo89267a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.compose.C41923a.DialogInterface$OnClickListenerC419241 */

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m165389i("ComposeMailDialogHelper", "showWaitForUploadHint send email onClick OK");
                dialogInterface.dismiss();
            }
        });
        return aVar;
    }

    /* renamed from: d */
    private C25639g.C25640a m166675d() {
        C25639g.C25640a aVar = new C25639g.C25640a();
        aVar.mo89266a(R.id.lkui_dialog_btn_left);
        aVar.mo89268a(this.f106407d.getResources().getString(R.string.Mail_Alert_Cancel));
        aVar.mo89272e(this.f106407d.getResources().getColor(R.color.text_title));
        aVar.mo89270c(17);
        aVar.mo89267a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.compose.C41923a.AnonymousClass10 */

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m165389i("ComposeMailDialogHelper", "showWaitForUploadHint save draft onClick cancel");
                dialogInterface.dismiss();
            }
        });
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public DialogC25637f mo150724a() {
        C25639g b = m166666b();
        b.mo89229a(m166671c());
        b.mo89242c(this.f106407d.getString(R.string.Mail_Alert_SendAttachmentUnfinished));
        b.mo89263v(R.color.bg_float);
        return b.mo89233b();
    }

    public C41923a(Context context) {
        this.f106407d = context;
    }

    /* renamed from: c */
    private C25639g.C25640a m166672c(DialogInterface.OnClickListener onClickListener) {
        C25639g.C25640a aVar = new C25639g.C25640a();
        aVar.mo89266a(R.id.lkui_dialog_btn_right);
        aVar.mo89268a(this.f106407d.getResources().getString(R.string.Mail_Alert_CloseAnyway));
        aVar.mo89272e(this.f106407d.getResources().getColor(R.color.function_danger_500));
        aVar.mo89270c(17);
        aVar.mo89267a(onClickListener);
        return aVar;
    }

    /* renamed from: b */
    public void mo150738b(Context context) {
        C25639g gVar = new C25639g(context);
        gVar.mo89250i(R.color.text_title).mo89248g(R.string.Mail_Compose_SendAttachmentUploadFailedTitle).mo89249h(17).mo89256o(R.color.text_title).mo89254m(R.string.Mail_Compose_SendAttachmentUploadFailed).mo89255n(16);
        C25639g.C25640a aVar = new C25639g.C25640a();
        aVar.mo89266a(R.id.lkui_dialog_btn_center).mo89269b(R.string.Mail_Compose_ConfirmDialog).mo89271d(R.color.primary_pri_500).mo89270c(17).mo89267a($$Lambda$a$Z8JaDeU4lh4XqIvpZ2EW69Hxu7E.INSTANCE);
        gVar.mo89229a(aVar).mo89263v(R.color.bg_float).mo89239c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public DialogC25637f mo150725a(DialogInterface.OnClickListener onClickListener) {
        C25639g b = m166666b();
        b.mo89229a(m166675d());
        b.mo89229a(m166672c(onClickListener));
        b.mo89242c(this.f106407d.getString(R.string.Mail_Alert_QuitAttachmentUnfinished));
        b.mo89263v(R.color.bg_float);
        return b.mo89233b();
    }

    /* renamed from: c */
    public void mo150742c(Context context) {
        C25639g gVar = new C25639g(context);
        gVar.mo89256o(R.color.text_title).mo89254m(R.string.Mail_Attachment_ExpiredDeletedUploadItAgain).mo89255n(16);
        C25639g.C25640a aVar = new C25639g.C25640a();
        aVar.mo89266a(R.id.lkui_dialog_btn_center).mo89269b(R.string.Mail_Compose_ConfirmDialog).mo89271d(R.color.primary_pri_500).mo89270c(17).mo89267a($$Lambda$a$dO42X71t8j1oBPqMwhYLoCLuvSY.INSTANCE);
        gVar.mo89229a(aVar).mo89263v(R.color.bg_float).mo89239c();
    }

    /* renamed from: a */
    public void mo150727a(Context context) {
        C25639g gVar = new C25639g(context);
        gVar.mo89256o(R.color.text_title).mo89237b(context.getResources().getString(R.string.Mail_Compose_OversizeDialogTitle)).mo89242c(C43819s.m173686a(R.string.Mail_Compose_OversizeDialog, "SizeLimit", "25MB")).mo89255n(16);
        C25639g.C25640a aVar = new C25639g.C25640a();
        aVar.mo89266a(R.id.lkui_dialog_btn_left);
        aVar.mo89268a(context.getResources().getString(R.string.Mail_Common_Confirm));
        aVar.mo89272e(context.getResources().getColor(R.color.text_title));
        aVar.mo89270c(17);
        aVar.mo89267a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.compose.C41923a.DialogInterface$OnClickListenerC419307 */

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        gVar.mo89229a(aVar);
        gVar.mo89263v(R.color.bg_float);
        gVar.mo89239c();
    }

    /* renamed from: b */
    public void mo150741b(DialogInterface.OnClickListener onClickListener) {
        C25639g gVar = new C25639g(this.f106407d);
        gVar.mo89250i(R.color.text_title).mo89256o(R.color.text_title).mo89254m(R.string.Mail_Compose_DraftDeleteed).mo89255n(16);
        C25639g.C25640a aVar = new C25639g.C25640a();
        aVar.mo89266a(R.id.lkui_dialog_btn_center).mo89269b(R.string.Mail_Compose_ConfirmDialog).mo89271d(R.color.primary_pri_500).mo89270c(17).mo89267a(new DialogInterface.OnClickListener(onClickListener) {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$a$4qljOMfssEmnZ1d4qAs6DvR1v4 */
            public final /* synthetic */ DialogInterface.OnClickListener f$0;

            {
                this.f$0 = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C41923a.m166664a(this.f$0, dialogInterface, i);
            }
        });
        gVar.mo89229a(aVar).mo89246d(false).mo89263v(R.color.bg_float).mo89239c();
        C42209j.m168612a("send_compose_has_been_deleted", "alert");
    }

    /* renamed from: a */
    public static void m166662a(Context context, int i) {
        C25639g gVar = new C25639g(context);
        gVar.mo89250i(R.color.text_title).mo89249h(17).mo89252k(3).mo89256o(R.color.text_title).mo89255n(16);
        C25639g.C25640a aVar = new C25639g.C25640a();
        aVar.mo89266a(R.id.lkui_dialog_btn_center);
        aVar.mo89268a(context.getString(R.string.Mail_Share_TitleBarDone));
        aVar.mo89272e(context.getResources().getColor(R.color.primary_pri_500));
        aVar.mo89270c(17);
        aVar.mo89267a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.compose.C41923a.AnonymousClass14 */

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        gVar.mo89248g(R.string.Mail_Contacts_RecipientLimit);
        gVar.mo89242c(C43819s.m173686a(R.string.Mail_Contacts_MaximumNumRecipients, "num", String.valueOf(i))).mo89229a(aVar);
        gVar.mo89263v(R.color.bg_float);
        gVar.mo89239c();
    }

    /* renamed from: b */
    public static void m166667b(Context context, DialogInterface.OnClickListener onClickListener) {
        C25639g gVar = new C25639g(context);
        gVar.mo89256o(R.color.text_title).mo89253l(3).mo89242c(context.getResources().getString(R.string.Mail_Alert_DiscardThisMessage)).mo89255n(16);
        C25639g.C25640a aVar = new C25639g.C25640a();
        aVar.mo89266a(R.id.lkui_dialog_btn_center);
        aVar.mo89268a(context.getResources().getString(R.string.Mail_Alert_Discard));
        aVar.mo89272e(context.getResources().getColor(R.color.function_danger_500));
        aVar.mo89270c(17);
        aVar.mo89267a(onClickListener);
        C25639g.C25640a aVar2 = new C25639g.C25640a();
        aVar2.mo89266a(R.id.lkui_dialog_btn_left);
        aVar2.mo89268a(context.getResources().getString(R.string.Mail_Alert_Cancel));
        aVar2.mo89272e(context.getResources().getColor(R.color.text_title));
        aVar2.mo89270c(17);
        aVar2.mo89267a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.compose.C41923a.AnonymousClass17 */

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        gVar.mo89229a(aVar).mo89229a(aVar2).mo89263v(R.color.bg_float);
        gVar.mo89239c();
    }

    /* renamed from: c */
    public void mo150743c(Context context, DialogInterface.OnClickListener onClickListener) {
        C25644o oVar = new C25644o(context);
        ArrayList arrayList = new ArrayList(2);
        LKUIListItemData nVar = new LKUIListItemData(context.getResources().getString(R.string.Mail_Compose_ImageUploadFailedReload));
        nVar.mo89289b(R.color.text_title);
        nVar.mo89286a(17);
        LKUIListItemData nVar2 = new LKUIListItemData(context.getResources().getString(R.string.Mail_Compose_ImageUploadFailedDelete));
        nVar2.mo89289b(R.color.function_danger_500);
        nVar2.mo89286a(17);
        arrayList.add(nVar);
        arrayList.add(nVar2);
        ((C25644o) ((C25644o) ((C25644o) ((C25644o) ((C25644o) oVar.mo89205a(arrayList)).mo89290y(0).mo89210d(R.layout.mail_compose_menu_dialog_item)).mo89207b((int) context.getResources().getDimension(R.dimen.mail_divider_height))).mo89202a(new DialogInterface.OnClickListener(onClickListener) {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$a$IudHuz47Q_cEIT61hnFA5SfvF8 */
            public final /* synthetic */ DialogInterface.OnClickListener f$0;

            {
                this.f$0 = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C41923a.m166683j(this.f$0, dialogInterface, i);
            }
        })).mo89263v(R.color.bg_float)).mo89239c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m166664a(DialogInterface.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        onClickListener.onClick(dialogInterface, i);
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m166668b(DialogInterface.OnCancelListener onCancelListener, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        onCancelListener.onCancel(dialogInterface);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m166678e(DialogInterface.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        onClickListener.onClick(dialogInterface, i);
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m166679f(DialogInterface.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        onClickListener.onClick(dialogInterface, i);
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m166680g(DialogInterface.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        onClickListener.onClick(dialogInterface, i);
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m166681h(DialogInterface.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        onClickListener.onClick(dialogInterface, i);
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ void m166682i(DialogInterface.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        onClickListener.onClick(dialogInterface, i);
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ void m166683j(DialogInterface.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        onClickListener.onClick(dialogInterface, i);
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ void m166684k(DialogInterface.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        onClickListener.onClick(dialogInterface, i);
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ void m166685l(DialogInterface.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        onClickListener.onClick(dialogInterface, i);
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m166663a(DialogInterface.OnCancelListener onCancelListener, DialogInterface dialogInterface, int i) {
        Log.m165389i("ComposeMailDialogHelper", "showExternalWarningDialog cancel");
        dialogInterface.dismiss();
        onCancelListener.onCancel(dialogInterface);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m166669b(DialogInterface.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        Log.m165389i("ComposeMailDialogHelper", "showExternalChangePermissionDialog change and send");
        onClickListener.onClick(dialogInterface, i);
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m166673c(DialogInterface.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        Log.m165389i("ComposeMailDialogHelper", "showExternalChangePermissionDialog send anyway");
        onClickListener.onClick(dialogInterface, i);
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m166676d(DialogInterface.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        Log.m165389i("ComposeMailDialogHelper", "showExternalWarningDialog send anyway");
        onClickListener.onClick(dialogInterface, i);
        dialogInterface.dismiss();
    }

    /* renamed from: b */
    public void mo150739b(Context context, DialogInterface.OnClickListener onClickListener, final DialogInterface.OnCancelListener onCancelListener) {
        Log.m165389i("ComposeMailDialogHelper", "showSubjectAndTextNullDialog");
        C25639g gVar = new C25639g(context);
        gVar.mo89250i(R.color.text_title).mo89249h(17).mo89252k(3);
        gVar.mo89254m(R.string.Mail_Alert_NoSubAndConTipTitle);
        C25639g.C25640a aVar = new C25639g.C25640a();
        aVar.mo89266a(R.id.lkui_dialog_btn_left);
        aVar.mo89268a(context.getResources().getString(R.string.Mail_Alert_Cancel));
        aVar.mo89272e(context.getResources().getColor(R.color.text_title));
        aVar.mo89270c(17);
        aVar.mo89267a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.compose.C41923a.AnonymousClass15 */

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m165389i("ComposeMailDialogHelper", "showSubjectAndTextNullDialog save draft onClick cancel");
                dialogInterface.dismiss();
                onCancelListener.onCancel(dialogInterface);
            }
        });
        gVar.mo89226a(new DialogInterface.OnCancelListener() {
            /* class com.ss.android.lark.mail.impl.compose.C41923a.AnonymousClass16 */

            public void onCancel(DialogInterface dialogInterface) {
                onCancelListener.onCancel(dialogInterface);
            }
        });
        C25639g.C25640a aVar2 = new C25639g.C25640a();
        aVar2.mo89266a(R.id.lkui_dialog_btn_right);
        aVar2.mo89268a(context.getString(R.string.Lark_Legacy_DialogOk));
        aVar2.mo89272e(context.getResources().getColor(R.color.primary_pri_500));
        aVar2.mo89270c(17);
        aVar2.mo89267a(onClickListener);
        gVar.mo89229a(aVar).mo89229a(aVar2);
        gVar.mo89263v(R.color.bg_float);
        gVar.mo89239c();
    }

    /* renamed from: b */
    public void mo150740b(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        C25639g gVar = new C25639g(context);
        gVar.mo89256o(R.color.text_title).mo89254m(R.string.Mail_RestrictOutbound_NoteDesc).mo89255n(16);
        C25639g.C25640a aVar = new C25639g.C25640a();
        aVar.mo89266a(R.id.lkui_dialog_btn_left).mo89269b(R.string.Mail_RestrictOutbound_Cancel).mo89271d(R.color.text_title).mo89270c(17).mo89267a(new DialogInterface.OnClickListener(onClickListener) {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$a$TOrfeOLze1emC1ULNq7EdjumY8I */
            public final /* synthetic */ DialogInterface.OnClickListener f$0;

            {
                this.f$0 = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C41923a.m166679f(this.f$0, dialogInterface, i);
            }
        });
        C25639g.C25640a aVar2 = new C25639g.C25640a();
        aVar2.mo89266a(R.id.lkui_dialog_btn_right).mo89269b(R.string.Mail_RestrictOutbound_Delete).mo89271d(R.color.function_danger_500).mo89270c(17).mo89267a(new DialogInterface.OnClickListener(onClickListener2) {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$a$eRJFiom42mRV0_YyteUCT3VsT78 */
            public final /* synthetic */ DialogInterface.OnClickListener f$0;

            {
                this.f$0 = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C41923a.m166678e(this.f$0, dialogInterface, i);
            }
        });
        gVar.mo89229a(aVar).mo89229a(aVar2).mo89263v(R.color.bg_float).mo89239c();
        C42209j.m168612a("send_largefile_external_cannot_access", "alert");
    }

    /* renamed from: c */
    public void mo150744c(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        Log.m165389i("ComposeMailDialogHelper", "showExternalChangePermissionDialog");
        C25639g gVar = new C25639g(context);
        gVar.mo89250i(R.color.text_title).mo89248g(R.string.Mail_Compose_LFChangePermissionTitle).mo89249h(17).mo89256o(R.color.text_title).mo89254m(R.string.Mail_Compose_LFChangePermissionBody).mo89255n(16);
        C25639g.C25640a aVar = new C25639g.C25640a();
        aVar.mo89266a(R.id.lkui_dialog_btn_left).mo89269b(R.string.Mail_Compose_LFActionSendAnyway).mo89271d(R.color.text_title).mo89270c(17).mo89267a(new DialogInterface.OnClickListener(onClickListener) {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$a$B4JUPC_mZcwp21uW8Agf4wQT2iM */
            public final /* synthetic */ DialogInterface.OnClickListener f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C41923a.this.m166673c((C41923a) this.f$1, (DialogInterface.OnClickListener) dialogInterface, (DialogInterface) i);
            }
        });
        C25639g.C25640a aVar2 = new C25639g.C25640a();
        aVar2.mo89266a(R.id.lkui_dialog_btn_right).mo89269b(R.string.Mail_Compose_LFActionChangeAndSend).mo89271d(R.color.primary_pri_500).mo89270c(17).mo89267a(new DialogInterface.OnClickListener(onClickListener2) {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$a$WQ2ZCjiMWxDa2fzxk4GmUUIw0BM */
            public final /* synthetic */ DialogInterface.OnClickListener f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C41923a.this.m166669b((C41923a) this.f$1, (DialogInterface.OnClickListener) dialogInterface, (DialogInterface) i);
            }
        });
        gVar.mo89229a(aVar).mo89229a(aVar2).mo89263v(R.color.bg_float).mo89239c();
        C42209j.m168612a("send_largefile_external_permission_change", "alert");
    }

    /* renamed from: a */
    public void mo150728a(Context context, int i, final DialogInterface.OnClickListener onClickListener) {
        C25639g gVar = new C25639g(context);
        gVar.mo89250i(R.color.text_title).mo89249h(17).mo89252k(3).mo89256o(R.color.text_title).mo89255n(16);
        C25639g.C25640a aVar = new C25639g.C25640a();
        aVar.mo89266a(R.id.lkui_dialog_btn_center);
        aVar.mo89268a(context.getString(R.string.Mail_Recipients_Confirm));
        aVar.mo89272e(context.getResources().getColor(R.color.primary_pri_500));
        aVar.mo89270c(17);
        aVar.mo89267a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.compose.C41923a.AnonymousClass13 */

            public void onClick(DialogInterface dialogInterface, int i) {
                onClickListener.onClick(dialogInterface, i);
                dialogInterface.dismiss();
            }
        });
        gVar.mo89248g(R.string.Mail_Recipients_TooManyRecipients);
        gVar.mo89242c(C43819s.m173686a(R.string.Mail_Recipients_MaximumRecipients, "number", String.valueOf(i))).mo89229a(aVar);
        gVar.mo89263v(R.color.bg_float);
        gVar.mo89239c();
    }

    /* renamed from: a */
    public void mo150729a(Context context, final DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        Log.m165389i("ComposeMailDialogHelper", "showExternalWarningDialog");
        C25639g gVar = new C25639g(context);
        gVar.mo89250i(R.color.text_title).mo89248g(R.string.Mail_Compose_LFAdminTurnOffExternalTitle).mo89249h(17).mo89256o(R.color.text_title).mo89254m(R.string.Mail_Compose_LFAdminTurnOffExternalBody).mo89255n(16);
        C25639g.C25640a aVar = new C25639g.C25640a();
        aVar.mo89266a(R.id.lkui_dialog_btn_left).mo89269b(R.string.Mail_Compose_LFActionCancel).mo89271d(R.color.text_title).mo89270c(17).mo89267a(new DialogInterface.OnClickListener(onCancelListener) {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$a$6g2sr8TrOrgAN4R07NEZQzdd6N4 */
            public final /* synthetic */ DialogInterface.OnCancelListener f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C41923a.this.m166663a((C41923a) this.f$1, (DialogInterface.OnCancelListener) dialogInterface, (DialogInterface) i);
            }
        });
        gVar.mo89226a(new DialogInterface.OnCancelListener() {
            /* class com.ss.android.lark.mail.impl.compose.C41923a.DialogInterface$OnCancelListenerC419318 */

            public void onCancel(DialogInterface dialogInterface) {
                onCancelListener.onCancel(dialogInterface);
            }
        });
        C25639g.C25640a aVar2 = new C25639g.C25640a();
        aVar2.mo89266a(R.id.lkui_dialog_btn_right).mo89269b(R.string.Mail_Compose_LFActionSendAnyway).mo89271d(R.color.primary_pri_500).mo89270c(17).mo89267a(new DialogInterface.OnClickListener(onClickListener) {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$a$WmElg4dbnT8531WS4v21pBBsQwU */
            public final /* synthetic */ DialogInterface.OnClickListener f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C41923a.this.m166676d(this.f$1, dialogInterface, i);
            }
        });
        gVar.mo89229a(aVar).mo89229a(aVar2).mo89263v(R.color.bg_float).mo89239c();
        C42209j.m168612a("send_largefile_external_cannot_access", "alert");
    }

    /* renamed from: a */
    public C43943c mo150726a(Context context, List<MailAddress> list, MailAddress mailAddress, final AbstractC41934b bVar) {
        ArrayList arrayList = new ArrayList();
        for (final MailAddress mailAddress2 : list) {
            if (mailAddress2 != null) {
                arrayList.add(new C43943c.C43945a(mailAddress2.mo151197r(), new Runnable() {
                    /* class com.ss.android.lark.mail.impl.compose.C41923a.RunnableC419252 */

                    public void run() {
                        bVar.onAddressSelected(mailAddress2);
                    }
                }, mailAddress2.equals(mailAddress)));
            }
        }
        return C43939b.m174083b(new C43939b.C43942a(context).mo156385a(arrayList).mo156384a(UIHelper.getString(R.string.Mail_Edit_SelectSendAddress)));
    }
}
