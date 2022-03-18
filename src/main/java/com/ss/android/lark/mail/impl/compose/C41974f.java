package com.ss.android.lark.mail.impl.compose;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.email.client.v1.DocStruct;
import com.bytedance.lark.pb.email.client.v1.DocsPermissionConfig;
import com.bytedance.lark.pb.email.client.v1.MailGetDocsByUrlsRequest;
import com.bytedance.lark.pb.email.client.v1.MailGetDocsByUrlsResponse;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.C25644o;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.mail.impl.compose.f */
public class C41974f {

    /* renamed from: a */
    public Map<String, DocStruct> f106554a = new HashMap();

    /* renamed from: b */
    public long f106555b = 200;

    /* renamed from: c */
    public ArrayList<String> f106556c = new ArrayList<>();

    /* renamed from: d */
    public HashMap<String, ArrayList<AbstractC41987c>> f106557d = new HashMap<>();

    /* renamed from: e */
    public Runnable f106558e = new Runnable() {
        /* class com.ss.android.lark.mail.impl.compose.C41974f.RunnableC419751 */

        public void run() {
            Log.m165389i("DocLinkHandler", "start batch fetching");
            if (C41816b.m166115a().mo150143j() && Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new RuntimeException("DocLinkHandler batch fetching on the wrong thread");
            } else if (CollectionUtils.isEmpty(C41974f.this.f106556c)) {
                C41974f.this.f106559f = false;
            } else {
                C41974f fVar = C41974f.this;
                fVar.mo150959a(fVar.f106556c);
                C41974f.this.f106556c = new ArrayList<>();
                C41974f.this.f106559f = false;
            }
        }
    };

    /* renamed from: f */
    public boolean f106559f = false;

    /* renamed from: g */
    private Context f106560g;

    /* renamed from: h */
    private AbstractC41985a f106561h;

    /* renamed from: i */
    private String f106562i;

    /* renamed from: j */
    private String f106563j;

    /* renamed from: k */
    private String f106564k;

    /* renamed from: com.ss.android.lark.mail.impl.compose.f$a */
    public interface AbstractC41985a {
        /* renamed from: a */
        void mo150847a(String str, DocsPermissionConfig.Action action);
    }

    /* renamed from: com.ss.android.lark.mail.impl.compose.f$b */
    public interface AbstractC41986b {
        /* renamed from: a */
        void mo150662a();

        /* renamed from: a */
        void mo150663a(boolean z);
    }

    /* renamed from: com.ss.android.lark.mail.impl.compose.f$c */
    public interface AbstractC41987c {
        /* renamed from: a */
        void mo150944a(Map<String, DocStruct> map);
    }

    /* renamed from: a */
    private String m166951a() {
        if (TextUtils.isEmpty(this.f106562i)) {
            this.f106562i = this.f106560g.getString(R.string.Mail_DocPreview_RecipientsCanRead);
        }
        return this.f106562i;
    }

    /* renamed from: b */
    private String m166954b() {
        if (TextUtils.isEmpty(this.f106563j)) {
            this.f106563j = this.f106560g.getString(R.string.Mail_DocPreview_RecipientsCanEdit);
        }
        return this.f106563j;
    }

    /* renamed from: c */
    private String m166955c() {
        if (TextUtils.isEmpty(this.f106564k)) {
            this.f106564k = this.f106560g.getString(R.string.Mail_DocPreview_RecipientsExistingAccess);
        }
        return this.f106564k;
    }

    /* renamed from: a */
    private void m166953a(final boolean z) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.compose.C41974f.RunnableC419784 */

            public void run() {
                long j;
                if (C41974f.this.f106559f) {
                    Log.m165389i("DocLinkHandler", "scheduleBatchFetch wait for next fetch");
                    return;
                }
                Log.m165389i("DocLinkHandler", "scheduleBatchFetch schedule one fetch");
                C41974f.this.f106559f = true;
                Runnable runnable = C41974f.this.f106558e;
                if (z) {
                    j = C41974f.this.f106555b;
                } else {
                    j = 0;
                }
                C43849u.m173827a(runnable, j);
            }
        });
    }

    /* renamed from: a */
    public void mo150959a(ArrayList<String> arrayList) {
        MailGetDocsByUrlsRequest.C16708a aVar = new MailGetDocsByUrlsRequest.C16708a();
        aVar.mo59338a(arrayList);
        SdkSender.asynSendRequestNonWrap(Command.MAIL_GET_DOCS_BY_URLS, aVar, new IGetDataCallback<MailGetDocsByUrlsResponse>() {
            /* class com.ss.android.lark.mail.impl.compose.C41974f.C419795 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("DocLinkHandler", "fetchPermission onError");
            }

            /* renamed from: a */
            public void onSuccess(final MailGetDocsByUrlsResponse mailGetDocsByUrlsResponse) {
                Log.m165389i("DocLinkHandler", "fetchPermission onSuccess");
                if (mailGetDocsByUrlsResponse != null && CollectionUtils.isNotEmpty(mailGetDocsByUrlsResponse.docs)) {
                    C43849u.m173826a(new Runnable() {
                        /* class com.ss.android.lark.mail.impl.compose.C41974f.C419795.RunnableC419801 */

                        public void run() {
                            C41974f.this.f106554a.putAll(mailGetDocsByUrlsResponse.docs);
                            if (C41974f.this.f106557d != null) {
                                for (String str : mailGetDocsByUrlsResponse.docs.keySet()) {
                                    ArrayList<AbstractC41987c> remove = C41974f.this.f106557d.remove(str);
                                    if (!CollectionUtils.isEmpty(remove)) {
                                        for (int i = 0; i < remove.size(); i++) {
                                            AbstractC41987c cVar = remove.get(i);
                                            if (cVar != null) {
                                                cVar.mo150944a(mailGetDocsByUrlsResponse.docs);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    });
                }
            }
        }, new SdkSender.IParser<MailGetDocsByUrlsResponse>() {
            /* class com.ss.android.lark.mail.impl.compose.C41974f.C419816 */

            /* renamed from: a */
            public MailGetDocsByUrlsResponse parse(byte[] bArr) throws IOException {
                return MailGetDocsByUrlsResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* renamed from: b */
    public void mo150960b(String str, DocsPermissionConfig.Action action) {
        AbstractC41985a aVar = this.f106561h;
        if (aVar != null) {
            aVar.mo150847a(str, action);
        }
    }

    public C41974f(Context context, AbstractC41985a aVar) {
        this.f106560g = context;
        this.f106561h = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo150956a(MailDraft mailDraft, AbstractC41986b bVar) {
        byte b;
        Log.m165389i("DocLinkHandler", "confirmPermission");
        if (bVar != null) {
            if (CollectionUtils.isEmpty(mailDraft.mo151347f())) {
                b = 0;
            } else {
                b = (byte) 1;
            }
            if (mailDraft.mo151371w()) {
                b = (byte) (b | 2);
            }
            if (b != 0) {
                int i = R.string.Mail_Compose_NoPermissionDesc;
                if (b == 1) {
                    Log.m165389i("DocLinkHandler", "confirmPermission CONFIRM_BCC_NOT_SAME_DOMAIN");
                    bVar.mo150662a();
                    Context context = this.f106560g;
                    if (!mailDraft.mo151366s()) {
                        i = R.string.Mail_DocPreview_HasBccAndExtContacts;
                    }
                    m166952a(context, i, bVar);
                    C42209j.m168611a("send_docsurl_contacts_cannot_access", 40001, "alert", "", "both", 1);
                } else if (b == 2) {
                    Log.m165389i("DocLinkHandler", "confirmPermission CONFIRM_NO_BCC_SAME_DOMAIN");
                    bVar.mo150663a(true);
                } else if (b != 3) {
                    bVar.mo150663a(false);
                } else {
                    Log.m165389i("DocLinkHandler", "confirmPermission CONFIRM_BCC_SAME_DOMAIN");
                    bVar.mo150662a();
                    Context context2 = this.f106560g;
                    if (!mailDraft.mo151366s()) {
                        i = R.string.Mail_DocPreview_HasBcc;
                    }
                    m166952a(context2, i, bVar);
                    C42209j.m168611a("send_docsurl_contacts_cannot_access", 40001, "alert", "", "bcc", 1);
                }
            } else {
                Log.m165389i("DocLinkHandler", "confirmPermission CONFIRM_NO_BCC_NOT_SAME_DOMAIN");
                bVar.mo150662a();
                m166952a(this.f106560g, R.string.Mail_DocPreview_HasExternalContacts, bVar);
                C42209j.m168611a("send_docsurl_contacts_cannot_access", 40001, "alert", "", "external", 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo150957a(final String str, DocsPermissionConfig.Action action) {
        int i;
        int i2;
        Log.m165389i("DocLinkHandler", "showSelectPermissionDialog");
        if (TextUtils.isEmpty(str)) {
            Log.m165383e("DocLinkHandler", "showSelectPermissionDialog empty docLink");
            return;
        }
        DocStruct docStruct = this.f106554a.get(str);
        if (docStruct == null) {
            Log.m165383e("DocLinkHandler", "showSelectPermissionDialog no data");
            return;
        }
        final C25644o oVar = new C25644o(this.f106560g);
        ((C25644o) ((C25644o) oVar.mo89248g(R.string.Mail_DocPreview_Recipients)).mo89210d(R.layout.mail_compose_select_doc_permission_item_layout)).mo89225a(R.id.lkui_dialog_btn_cancel, this.f106560g.getString(R.string.Mail_Alert_Cancel), (DialogInterface.OnClickListener) null);
        if (docStruct.user_perm == null) {
            oVar.mo89290y(0).mo89206a(m166955c());
        } else if (docStruct.user_perm.contains(DocStruct.Permission.EDIT)) {
            if (action == DocsPermissionConfig.Action.READ) {
                i2 = 0;
            } else if (action == DocsPermissionConfig.Action.EDIT) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            ((C25644o) oVar.mo89290y(i2).mo89206a(m166951a(), m166954b(), m166955c())).mo89202a(new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.compose.C41974f.DialogInterface$OnClickListenerC419827 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    if (i == 0) {
                        C41974f.this.mo150960b(str, DocsPermissionConfig.Action.READ);
                    } else if (i == 1) {
                        C41974f.this.mo150960b(str, DocsPermissionConfig.Action.EDIT);
                    } else if (i == 2) {
                        C41974f.this.mo150960b(str, DocsPermissionConfig.Action.KEEP);
                    }
                }
            });
        } else if (docStruct.user_perm.contains(DocStruct.Permission.VIEW)) {
            if (action == DocsPermissionConfig.Action.READ) {
                i = 0;
            } else {
                i = 1;
            }
            ((C25644o) oVar.mo89290y(i).mo89206a(m166951a(), m166955c())).mo89202a(new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.compose.C41974f.DialogInterface$OnClickListenerC419838 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    if (i == 0) {
                        C41974f.this.mo150960b(str, DocsPermissionConfig.Action.READ);
                    } else if (i == 1) {
                        C41974f.this.mo150960b(str, DocsPermissionConfig.Action.KEEP);
                    }
                }
            });
        } else {
            oVar.mo89290y(0).mo89206a(m166955c());
        }
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.compose.C41974f.RunnableC419849 */

            public void run() {
                oVar.mo89239c();
            }
        });
    }

    /* renamed from: a */
    private void m166952a(Context context, int i, final AbstractC41986b bVar) {
        Log.m165389i("DocLinkHandler", "showConfirmPermissionDialog");
        new C25639g(context).mo89248g(R.string.Mail_DocPreview_NotificationTitle).mo89238b(true).mo89254m(i).mo89224a(R.id.lkui_dialog_btn_right, R.string.Mail_Alert_OK, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.compose.C41974f.DialogInterface$OnClickListenerC419762 */

            public void onClick(DialogInterface dialogInterface, int i) {
                AbstractC41986b bVar = bVar;
                if (bVar != null) {
                    bVar.mo150663a(true);
                }
            }
        }).mo89224a(R.id.lkui_dialog_btn_left, R.string.Mail_Alert_Cancel, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.compose.C41974f.AnonymousClass10 */

            public void onClick(DialogInterface dialogInterface, int i) {
                AbstractC41986b bVar = bVar;
                if (bVar != null) {
                    bVar.mo150663a(false);
                }
            }
        }).mo89239c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo150958a(final String str, boolean z, final AbstractC41987c cVar) {
        Log.m165389i("DocLinkHandler", "fetchDocInfo");
        if (TextUtils.isEmpty(str)) {
            Log.m165383e("DocLinkHandler", "fetchDocInfo empty link");
        } else if (this.f106554a.get(str) != null) {
            Log.m165389i("DocLinkHandler", "fetchDocInfo fetched");
            if (cVar != null) {
                cVar.mo150944a(this.f106554a);
            }
        } else {
            C43849u.m173826a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.compose.C41974f.RunnableC419773 */

                public void run() {
                    C41974f.this.f106556c.add(str);
                    ArrayList<AbstractC41987c> arrayList = C41974f.this.f106557d.get(str);
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                        C41974f.this.f106557d.put(str, arrayList);
                    }
                    arrayList.add(cVar);
                }
            });
            m166953a(z);
        }
    }
}
