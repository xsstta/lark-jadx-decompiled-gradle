package com.ss.android.lark.mail.impl.compose;

import android.app.Activity;
import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.aj;
import com.bytedance.lark.pb.email.client.v1.DocStruct;
import com.bytedance.lark.pb.email.client.v1.DocsPermissionConfig;
import com.bytedance.lark.pb.email.client.v1.Draft;
import com.bytedance.lark.pb.email.client.v1.MailGetDraftItemResponse;
import com.bytedance.lark.pb.email.client.v1.MailSendDraftResponse;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.LarkUriUtil;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.AbstractC41849c;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.action.ComposeMailAction;
import com.ss.android.lark.mail.impl.action.DiscardDraftAction;
import com.ss.android.lark.mail.impl.action.DraftMailAction;
import com.ss.android.lark.mail.impl.action.ForwardMailAction;
import com.ss.android.lark.mail.impl.action.NewMailAction;
import com.ss.android.lark.mail.impl.action.ReplyAllMailAction;
import com.ss.android.lark.mail.impl.action.ReplyMailAction;
import com.ss.android.lark.mail.impl.action.SaveDraftAction;
import com.ss.android.lark.mail.impl.compose.AbstractC41994h;
import com.ss.android.lark.mail.impl.compose.C41923a;
import com.ss.android.lark.mail.impl.compose.C41949c;
import com.ss.android.lark.mail.impl.compose.C41974f;
import com.ss.android.lark.mail.impl.compose.ComposeMailView;
import com.ss.android.lark.mail.impl.compose.attachment.C41936a;
import com.ss.android.lark.mail.impl.compose.attachment.LocalAttachment;
import com.ss.android.lark.mail.impl.compose.image.AbstractC42000a;
import com.ss.android.lark.mail.impl.compose.image.C42008f;
import com.ss.android.lark.mail.impl.compose.image.UploadImage;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.entity.DriveFileOperationMask;
import com.ss.android.lark.mail.impl.entity.EmailAliasList;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.entity.MailDocsPermissionConfig;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.entity.MailImage;
import com.ss.android.lark.mail.impl.entity.ShareMailAddress;
import com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2200b.C42787b;
import com.ss.android.lark.mail.impl.message.pageroute.intantinfo.MessageListIntenInfo;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41869a;
import com.ss.android.lark.mail.impl.p2168g.C42107a;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2168g.p2169a.C42130j;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.C42226b;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42256d;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42262e;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42272g;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42280i;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.service.C43307b;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.service.C43383h;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43315b;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43331r;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43332s;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43334u;
import com.ss.android.lark.mail.impl.share.C43645c;
import com.ss.android.lark.mail.impl.share.C43691h;
import com.ss.android.lark.mail.impl.utils.C43766i;
import com.ss.android.lark.mail.impl.utils.C43785p;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.recipient.SearchAddress;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.mail.impl.view.undo.IUndoMulProcess;
import com.ss.android.lark.mail.impl.view.undo.ScheduleSendCancelProcess;
import com.ss.android.lark.mail.impl.view.undo.SendUndoProcess;
import com.ss.android.lark.utils.C57788ai;
import com.tt.frontendapiinterface.ApiHandler;
import ee.android.framework.manis.C68183b;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.compose.c */
public class C41949c extends BasePresenter<AbstractC41994h.AbstractC41995a, AbstractC41994h.AbstractC41997b, AbstractC41994h.AbstractC41997b.AbstractC41998a> implements C41974f.AbstractC41985a, AbstractC41994h.AbstractC41995a.AbstractC41996a, AbstractC43315b, AbstractC43331r, AbstractC43332s, AbstractC43334u {

    /* renamed from: a */
    public Activity f106497a;

    /* renamed from: b */
    public int f106498b = 0;

    /* renamed from: c */
    public String f106499c;

    /* renamed from: d */
    public String f106500d;

    /* renamed from: e */
    public boolean f106501e;

    /* renamed from: f */
    public final C41974f f106502f;

    /* renamed from: g */
    C42008f f106503g = new C42008f();

    /* renamed from: h */
    private final String f106504h = "ComposeMailPresenter";

    /* renamed from: i */
    private ComposeMailAction f106505i = new NewMailAction(C43785p.m173536a(), "");

    /* renamed from: j */
    private C43645c f106506j;

    /* renamed from: k */
    private Handler f106507k = new Handler();

    /* renamed from: l */
    private boolean f106508l = true;

    /* renamed from: h */
    public boolean mo150865h() {
        return false;
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43315b
    /* renamed from: l */
    public void mo150869l() {
        m166823r();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo150853a(boolean z, boolean z2) {
        mo150854a(z, z2, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo150854a(boolean z, boolean z2, boolean z3) {
        if (!z3 || !((AbstractC41994h.AbstractC41997b) getView()).mo150614e()) {
            if (!z) {
                m166817c(z2);
            } else if (!((AbstractC41994h.AbstractC41995a) getModel()).mo150836m()) {
                ((AbstractC41994h.AbstractC41997b) getView()).mo150596b(new DialogInterface.OnClickListener() {
                    /* class com.ss.android.lark.mail.impl.compose.C41949c.DialogInterface$OnClickListenerC419588 */

                    public void onClick(DialogInterface dialogInterface, int i) {
                        C41949c.this.mo150866i();
                    }
                });
                return;
            } else {
                mo150866i();
            }
            ((C42272g) C42344d.m169091a(C42272g.class, this.f106497a)).mo152384d();
        }
    }

    /* renamed from: a */
    public void mo150852a(final boolean z) {
        ((AbstractC41994h.AbstractC41997b) getView()).mo150593a(true, (IGetDataCallback) new IGetDataCallback() {
            /* class com.ss.android.lark.mail.impl.compose.C41949c.AnonymousClass10 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.larksuite.framework.callback.IRequestCallback
            public void onError(ErrorResult errorResult) {
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
            public void onSuccess(Object obj) {
                MailDraft a = ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150799a();
                if (a != null && obj != null) {
                    String n = a.mo151361n();
                    if (TextUtils.isEmpty(n)) {
                        n = a.mo151321a();
                    }
                    if (z) {
                        MailToast.m173698a((int) R.string.Mail_Toast_DraftSaved, MailToast.Type.SUCCESS);
                    }
                    SaveDraftAction saveDraftAction = new SaveDraftAction(n);
                    saveDraftAction.mo150353a(a);
                    C43307b.m172030a().mo154977a(saveDraftAction);
                }
            }
        }, (LifecycleOwner) ((AppCompatActivity) this.f106497a));
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.compose.c$a */
    public class C41960a implements AbstractC41994h.AbstractC41997b.AbstractC41998a {
        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: a */
        public void mo150895a(String str) {
            Log.m165389i("ComposeMailPresenter", "onDeleteAttachment");
            int a = ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150798a(str);
            if (((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150835l() && a >= 0) {
                ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150557a(a);
            }
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: a */
        public void mo150902a(boolean z) {
            C41949c.this.mo150853a(false, z);
            C42330c.m169079f("draft_abort");
        }

        @Override // com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
        /* renamed from: a */
        public void mo150900a(List<MailImage> list) {
            ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150818b(list);
        }

        @Override // com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
        /* renamed from: a */
        public void mo150896a(final String str, final DocsPermissionConfig.Action action) {
            Log.m165389i("ComposeMailPresenter", "selectDocPermission");
            C41949c.this.mo150845a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.compose.C41949c.C41960a.RunnableC419654 */

                public void run() {
                    C41949c.this.f106502f.mo150957a(str, action);
                }
            });
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: a */
        public void mo150901a(List<MailDocsPermissionConfig> list, MailDraft mailDraft, C41974f.AbstractC41986b bVar) {
            Log.m165389i("ComposeMailPresenter", "updateAndCheckDocLinkPermission");
            ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150813a(list);
            if (CollectionUtils.isEmpty(list)) {
                bVar.mo150663a(true);
            } else {
                C41949c.this.f106502f.mo150956a(mailDraft, bVar);
            }
        }

        @Override // com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
        /* renamed from: a */
        public void mo150893a(MailImage mailImage) {
            Log.m165389i("ComposeMailPresenter", "onImageAddedInSharedDraft");
            ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150804a(mailImage);
        }

        @Override // com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
        /* renamed from: a */
        public void mo150898a(String str, String str2) {
            Log.m165389i("ComposeMailPresenter", "retryUploadImage " + str2);
            if (TextUtils.isEmpty(str2)) {
                Log.m165383e("ComposeMailPresenter", "retryUploadImage empty uuid");
                return;
            }
            AbstractC42000a<UploadImage> g = ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150828g(str2);
            if (g == null) {
                Log.m165383e("ComposeMailPresenter", "retryUploadImage upload task not found");
            } else {
                ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150559a(new DialogInterface.OnClickListener(str2, g, str) {
                    /* class com.ss.android.lark.mail.impl.compose.$$Lambda$c$a$LbgR7diU0grNsJ66qAGKh_C7cw */
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ AbstractC42000a f$2;
                    public final /* synthetic */ String f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C41949c.C41960a.this.m166870a((C41949c.C41960a) this.f$1, (String) this.f$2, (AbstractC42000a) this.f$3, (String) dialogInterface, (DialogInterface) i);
                    }
                });
            }
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: a */
        public void mo150897a(String str, MailAddress mailAddress) {
            Log.m165389i("ComposeMailPresenter", "onRecipientAdded");
            if (TextUtils.isEmpty(str) || mailAddress == null) {
                Log.m165383e("ComposeMailPresenter", "onRecipientAdded invalid parameter");
                return;
            }
            PermissionCode k = ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150834k();
            if (k != null && k != PermissionCode.NONE) {
                if (mailAddress instanceof ShareMailAddress) {
                    ShareMailAddress shareMailAddress = (ShareMailAddress) mailAddress;
                    if (!((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150814a(str, shareMailAddress.f107008k)) {
                        ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150581a(str, shareMailAddress);
                        return;
                    }
                    return;
                }
                ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150581a(str, ShareMailAddress.m167847a(mailAddress));
            }
        }

        @Override // com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
        /* renamed from: a */
        public void mo150899a(String str, String str2, String str3, String str4, int i) {
            Log.m165389i("ComposeMailPresenter", "onImageDomChange");
            PermissionCode k = ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150834k();
            boolean z = (k == null || k == PermissionCode.NONE) ? false : true;
            C42226b.m168638a().mo152308a("mail_dev_upload_image_cost_time");
            C42187a.m168542i();
            C41949c.this.f106503g.mo151006a(C41949c.this.f106497a, str, str2, str3, C43785p.m173538a(z ? ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150799a().mo151361n() : ""), str4, C41949c.this.mo150864g(), new C42008f.AbstractC42009a() {
                /* class com.ss.android.lark.mail.impl.compose.$$Lambda$c$a$2cMEB_q4YmmeOTdMUIw8nzfKafA */

                @Override // com.ss.android.lark.mail.impl.compose.image.C42008f.AbstractC42009a
                public final void addImageUploadingTask(String str, AbstractC42000a aVar) {
                    C41949c.C41960a.this.m166871b((C41949c.C41960a) str, (String) aVar);
                }
            }, i);
        }

        @Override // com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
        /* renamed from: a */
        public void mo150894a(SearchAddress searchAddress) {
            Log.m165389i("ComposeMailPresenter", "addMentionedRecipient");
            if (searchAddress != null) {
                ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150592a(searchAddress);
            }
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: c */
        public void mo150911c() {
            C41949c.this.mo150853a(true, false);
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: e */
        public void mo150917e() {
            C41949c.this.mo150860d();
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: d */
        public void mo150914d() {
            Log.m165389i("ComposeMailPresenter", "onUploadNotFinishedHintCloseButtonClick");
            C41949c.this.mo150866i();
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a, com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
        /* renamed from: g */
        public List<MailImage> mo150922g() {
            return ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150816b();
        }

        @Override // com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
        /* renamed from: h */
        public List<LocalAttachment> mo150924h() {
            return ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150826f();
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: i */
        public boolean mo150926i() {
            return ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150832i();
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: j */
        public boolean mo150927j() {
            return ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150833j();
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: k */
        public boolean mo150928k() {
            return ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150836m();
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: l */
        public String[] mo150929l() {
            return ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150837n();
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: m */
        public void mo150930m() {
            ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150838o();
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: q */
        public void mo150934q() {
            Log.m165389i("ComposeMailPresenter", "onDiscardedByShareOwnerConfirmed");
            mo150920f();
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: r */
        public void mo150935r() {
            Log.m165389i("ComposeMailPresenter", "onSentByShareOwnerConfirmed");
            mo150920f();
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: s */
        public void mo150936s() {
            Log.m165389i("ComposeMailPresenter", "onRemovedByShareOwnerConfirmed");
            mo150920f();
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: b */
        public long mo150903b() {
            return ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150824e();
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: f */
        public void mo150920f() {
            ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150588a(false);
            C41949c.this.f106501e = true;
            C41949c.this.f106497a.finish();
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: p */
        public void mo150933p() {
            Log.m165389i("ComposeMailPresenter", "onShareDiscussButtonClick");
            C41816b.m166115a().mo150115E().mo150186a(C41949c.this.f106497a, C41949c.this.f106500d);
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: u */
        public String mo150938u() {
            Log.m165389i("ComposeMailPresenter", "requestThreadID");
            return ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150799a().mo151361n();
        }

        @Override // com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
        /* renamed from: w */
        public String mo150940w() {
            Log.m165389i("ComposeMailPresenter", "getSubject");
            return ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150799a().mo151350g();
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: a */
        public long mo150887a() {
            return ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150822d();
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: n */
        public void mo150931n() {
            Log.m165389i("ComposeMailPresenter", "onCreateShareButtonClick");
            ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150607d();
            ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150593a(false, (IGetDataCallback) new IGetDataCallback() {
                /* class com.ss.android.lark.mail.impl.compose.C41949c.C41960a.C419665 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165389i("ComposeMailPresenter", "onCreateShareButtonClick fetchDraftData onError");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.larksuite.framework.callback.IRequestCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165389i("ComposeMailPresenter", "onCreateShareButtonClick fetchDraftData onError");
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
                public void onSuccess(Object obj) {
                    Log.m165389i("ComposeMailPresenter", "onCreateShareButtonClick fetchDraftData onSuccess");
                    C41949c.this.mo150845a(new Runnable() {
                        /* class com.ss.android.lark.mail.impl.compose.C41949c.C41960a.C419665.RunnableC419671 */

                        public void run() {
                            C41949c.this.mo150867j().mo155705a(((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150834k(), C42130j.m168150a().mo152073a(((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150799a()));
                        }
                    });
                }
            }, (LifecycleOwner) ((AppCompatActivity) C41949c.this.f106497a));
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: o */
        public void mo150932o() {
            Log.m165389i("ComposeMailPresenter", "onShareMemberButtonClick");
            ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150607d();
            C41949c.this.mo150867j().mo155704a(((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150834k());
        }

        @Override // com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
        /* renamed from: t */
        public void mo150937t() {
            Log.m165389i("ComposeMailPresenter", "onWebViewRenderDone");
            C42187a.m168503b(C41949c.this.f106499c, C41949c.this.f106498b);
            ((C42272g) C42344d.m169091a(C42272g.class, C41949c.this.f106497a)).mo152372a("success", (long) C41949c.this.f106498b);
            ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150594b();
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: y */
        public void mo150942y() {
            if (!CollectionUtils.isEmpty(((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150826f())) {
                Iterator<LocalAttachment> it = ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150826f().iterator();
                while (it.hasNext()) {
                    LocalAttachment next = it.next();
                    if (next.mo151237m()) {
                        next.mo151225c(false);
                        next.mo151221b(0L);
                    }
                }
            }
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: v */
        public void mo150939v() {
            boolean z;
            ArrayList<LocalAttachment> f = ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150826f();
            ArrayList<LocalAttachment> arrayList = new ArrayList<>();
            if (f != null && !f.isEmpty()) {
                Iterator<LocalAttachment> it = f.iterator();
                while (it.hasNext()) {
                    LocalAttachment next = it.next();
                    if (!C43766i.m173487b(C26311p.m95284d(next.mo151229f()))) {
                        arrayList.add(next);
                    }
                }
                ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150812a(arrayList);
                ArrayList<LocalAttachment> a = LocalAttachment.m166710a(arrayList);
                AbstractC41994h.AbstractC41997b bVar = (AbstractC41994h.AbstractC41997b) C41949c.this.getView();
                if (((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150834k() != PermissionCode.VIEW) {
                    z = true;
                } else {
                    z = false;
                }
                bVar.mo150585a(a, z);
            }
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: x */
        public void mo150941x() {
            if (!CollectionUtils.isEmpty(((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150826f())) {
                long currentTimeMillis = System.currentTimeMillis() + 1296000000;
                Iterator<LocalAttachment> it = ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150826f().iterator();
                while (it.hasNext()) {
                    LocalAttachment next = it.next();
                    if (next.mo151233i() != 0) {
                        next.mo151225c(true);
                        next.mo151221b(currentTimeMillis);
                    }
                }
            }
        }

        private C41960a() {
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: b */
        public void mo150910b(boolean z) {
            C42187a.m168493a(z, C41949c.this.f106499c);
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: c */
        public void mo150913c(List<MailImage> list) {
            ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150818b(list);
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: e */
        public void mo150919e(List<Uri> list) {
            Log.m165389i("ComposeMailPresenter", "uploadUriAttachment");
            C41949c.this.mo150855b(list, false);
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: d */
        public void mo150916d(List<String> list) {
            Log.m165389i("ComposeMailPresenter", "uploadAttachment");
            C41949c.this.mo150841a(list, false);
        }

        @Override // com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
        /* renamed from: e */
        public void mo150918e(final String str) {
            Log.m165389i("ComposeMailPresenter", "fetchDocPermission");
            C41949c.this.f106502f.mo150958a(str, true, (C41974f.AbstractC41987c) new C41974f.AbstractC41987c() {
                /* class com.ss.android.lark.mail.impl.compose.C41949c.C41960a.C419633 */

                /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
                    r4 = r4.get(r4);
                 */
                @Override // com.ss.android.lark.mail.impl.compose.C41974f.AbstractC41987c
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void mo150944a(java.util.Map<java.lang.String, com.bytedance.lark.pb.email.client.v1.DocStruct> r4) {
                    /*
                        r3 = this;
                        java.lang.String r0 = "ComposeMailPresenter"
                        java.lang.String r1 = "onDocInfoFetched"
                        com.ss.android.lark.log.Log.m165389i(r0, r1)
                        boolean r0 = com.larksuite.framework.utils.CollectionUtils.isNotEmpty(r4)
                        if (r0 == 0) goto L_0x0021
                        java.lang.String r0 = r4
                        java.lang.Object r4 = r4.get(r0)
                        com.bytedance.lark.pb.email.client.v1.DocStruct r4 = (com.bytedance.lark.pb.email.client.v1.DocStruct) r4
                        if (r4 == 0) goto L_0x0021
                        com.ss.android.lark.mail.impl.compose.c$a$3$1 r0 = new com.ss.android.lark.mail.impl.compose.c$a$3$1
                        r0.<init>(r4)
                        r1 = 200(0xc8, double:9.9E-322)
                        com.ss.android.lark.mail.impl.utils.C43849u.m173827a(r0, r1)
                    L_0x0021:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.compose.C41949c.C41960a.C419633.mo150944a(java.util.Map):void");
                }
            });
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: b */
        public void mo150904b(MailDraft mailDraft) {
            ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150817b(mailDraft);
        }

        @Override // com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
        /* renamed from: d */
        public void mo150915d(final String str) {
            Log.m165389i("ComposeMailPresenter", "addDocPermission");
            ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150805a(str, DocsPermissionConfig.Action.KEEP);
            C41949c.this.f106502f.mo150958a(str, false, (C41974f.AbstractC41987c) new C41974f.AbstractC41987c() {
                /* class com.ss.android.lark.mail.impl.compose.C41949c.C41960a.C419622 */

                @Override // com.ss.android.lark.mail.impl.compose.C41974f.AbstractC41987c
                /* renamed from: a */
                public void mo150944a(Map<String, DocStruct> map) {
                    DocStruct docStruct;
                    Log.m165389i("ComposeMailPresenter", "onDocInfoFetched");
                    if (CollectionUtils.isNotEmpty(map) && (docStruct = map.get(str)) != null) {
                        C41988g.m166978i().mo153445a(docStruct, ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150823d(str));
                    }
                }
            });
            C42330c.m169079f("add_doc_link");
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: f */
        public void mo150921f(final String str) {
            Log.m165389i("ComposeMailPresenter", "onSharedContentUpdated");
            PermissionCode k = ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150834k();
            if (k == null || k == PermissionCode.NONE) {
                Log.m165383e("ComposeMailPresenter", "onSharedContentUpdated");
            } else {
                C43849u.m173826a(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.compose.C41949c.C41960a.RunnableC419686 */

                    /* JADX WARNING: Removed duplicated region for block: B:42:0x0089  */
                    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ca  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void run() {
                        /*
                        // Method dump skipped, instructions count: 365
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.compose.C41949c.C41960a.RunnableC419686.run():void");
                    }
                });
            }
        }

        @Override // com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
        /* renamed from: g */
        public void mo150923g(String str) {
            Log.m165389i("ComposeMailPresenter", "deleteImage");
            if (TextUtils.isEmpty(str)) {
                Log.m165383e("ComposeMailPresenter", "deleteImage empty uuid");
            } else if (((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150825e(str)) {
                Log.m165389i("ComposeMailPresenter", "deleteImage success");
            } else {
                Log.m165389i("ComposeMailPresenter", "deleteImage fail");
            }
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: h */
        public void mo150925h(String str) {
            Log.m165389i("ComposeMailPresenter", "onSubjectDefocus");
            PermissionCode k = ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150834k();
            if (k == PermissionCode.OWNER || k == PermissionCode.EDIT) {
                ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150576a(str);
            }
        }

        @Override // com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
        /* renamed from: b */
        public void mo150905b(SearchAddress searchAddress) {
            Log.m165389i("ComposeMailPresenter", "removeMentionedRecipient");
            if (searchAddress != null) {
                ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150598b(searchAddress);
            }
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: a */
        public MailAddress mo150888a(MailAddress mailAddress) {
            Log.m165389i("ComposeMailPresenter", "processNewRecipient");
            PermissionCode k = ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150834k();
            if (k == null || k == PermissionCode.NONE) {
                return mailAddress;
            }
            if (mailAddress == null) {
                return null;
            }
            return ShareMailAddress.m167847a(mailAddress);
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: b */
        public void mo150906b(String str) {
            Log.m165389i("ComposeMailPresenter", "retryUploadAttachment");
            if (((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150834k() == PermissionCode.VIEW) {
                Log.m165383e("ComposeMailPresenter", "retryUploadAttachment you have not permission to do it");
                return;
            }
            C41936a c = ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150819c(str);
            if (c == null) {
                Log.m165383e("ComposeMailPresenter", "retryUploadAttachment task is null");
                return;
            }
            c.mo150989f();
            ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150807a(str, c);
            ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150578a(str, 0, 0);
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: c */
        public void mo150912c(String str) {
            boolean z;
            int lastIndexOf;
            Log.m165389i("ComposeMailPresenter", "onOpenAttachment id:" + str);
            LocalAttachment b = ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150815b(str);
            if (b == null) {
                Log.m165389i("ComposeMailPresenter", "onOpenAttachment attachment is uploading, no preview");
                return;
            }
            if (!TextUtils.isEmpty(b.mo151229f()) && (lastIndexOf = b.mo151229f().lastIndexOf(".")) >= 0) {
                String substring = b.mo151229f().substring(lastIndexOf);
                if (!TextUtils.isEmpty(substring) && ".eml".equals(substring.toLowerCase())) {
                    m166872c(b.mo151229f(), b.mo151234j());
                    C42187a.m168559o();
                    return;
                }
            }
            Log.m165389i("ComposeMailPresenter", "onOpenAttachment via drive");
            String c = C26311p.m95283c(b.mo151229f());
            DriveFileOperationMask driveFileOperationMask = new DriveFileOperationMask();
            if (b.mo151239o() && b.mo151236l() == 0) {
                driveFileOperationMask.mo151102a(true);
            }
            if (C26311p.m95292l(c)) {
                Log.m165389i("ComposeMailPresenter", "onOpenAttachment multi image");
                z = C42699a.m170257a(C41969d.m166936a(b), C41969d.m166938a(((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150826f()), driveFileOperationMask, (AbstractC41849c.AbstractC41850a) null);
            } else {
                Log.m165389i("ComposeMailPresenter", "onOpenAttachment single file");
                z = C42699a.m170259a(b.mo151234j(), b.mo151229f(), driveFileOperationMask, (AbstractC41849c.AbstractC41850a) null);
            }
            if (!z) {
                Log.m165383e("ComposeMailPresenter", "onOpenAttachment failed to open by drive");
            }
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: a */
        public void mo150889a(EmailAliasList emailAliasList) {
            ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150568a(emailAliasList);
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: a */
        public void mo150890a(MailDraft mailDraft) {
            ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150801a(mailDraft);
        }

        @Override // com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
        /* renamed from: b */
        public void mo150909b(List<MailImage> list) {
            ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150821c(list);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m166871b(String str, AbstractC42000a aVar) {
            ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150808a(str, aVar);
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: a */
        public int mo150886a(MailDraft mailDraft, long j) {
            return ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150797a(mailDraft, j);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m166869a(String str, AbstractC42000a aVar) {
            ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150808a(str, aVar);
            C42330c.m169079f("image");
        }

        /* renamed from: c */
        private void m166872c(String str, String str2) {
            ArrayList arrayList = new ArrayList();
            MessageListIntenInfo messageListIntenInfo = new MessageListIntenInfo("EML", str + "_eml", "", 3, str);
            messageListIntenInfo.mo154048a(false);
            arrayList.add(messageListIntenInfo);
            C42699a.m170278c(C41949c.this.f106497a, arrayList, str2);
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: b */
        public void mo150907b(String str, MailAddress mailAddress) {
            Log.m165389i("ComposeMailPresenter", "onRemovingRecipient");
            PermissionCode k = ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150834k();
            if (k != null && k != PermissionCode.NONE) {
                if (TextUtils.isEmpty(str) || !(mailAddress instanceof ShareMailAddress)) {
                    Log.m165383e("ComposeMailPresenter", "onRemovingRecipient invalid parameter");
                } else {
                    ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150600b(str, (ShareMailAddress) mailAddress);
                }
            }
        }

        @Override // com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
        /* renamed from: b */
        public void mo150908b(String str, String str2) {
            String str3;
            Log.m165389i("ComposeMailPresenter", "uploadImage");
            C42226b.m168638a().mo152308a("mail_dev_upload_image_cost_time");
            C42187a.m168542i();
            C42008f fVar = C41949c.this.f106503g;
            if (((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150835l()) {
                str3 = ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150799a().mo151361n();
            } else {
                str3 = "";
            }
            fVar.mo151007a(str, str2, C43785p.m173538a(str3), C41949c.this.mo150864g(), new C42008f.AbstractC42009a() {
                /* class com.ss.android.lark.mail.impl.compose.$$Lambda$c$a$G0JmtvQHEMfAE8ZBINwxvA_YoY */

                @Override // com.ss.android.lark.mail.impl.compose.image.C42008f.AbstractC42009a
                public final void addImageUploadingTask(String str, AbstractC42000a aVar) {
                    C41949c.C41960a.this.m166869a((C41949c.C41960a) str, (String) aVar);
                }
            });
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: a */
        public void mo150891a(final MailDraft mailDraft, boolean z) {
            Log.m165389i("ComposeMailPresenter", "onSendInfoFetched");
            mo150920f();
            ((C42280i) C42344d.m169091a(C42280i.class, C41949c.this.f106497a)).mo152405n();
            ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150802a(mailDraft, new AbstractC41869a<MailSendDraftResponse>() {
                /* class com.ss.android.lark.mail.impl.compose.C41949c.C41960a.C419611 */

                /* renamed from: a */
                private void m166930a(MailDraft mailDraft) {
                    if (mailDraft.mo151316A()) {
                        C42107a.m168074a().mo152037d(mailDraft.mo151321a());
                    } else {
                        C42107a.m168074a().mo152035b(mailDraft.mo151321a(), mailDraft);
                    }
                }

                /* renamed from: a */
                public void mo150433a(MailSendDraftResponse mailSendDraftResponse) {
                    String str;
                    int i;
                    LKUIToast.cancelLoading();
                    IUndoMulProcess iUndoMulProcess = (IUndoMulProcess) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IUndoMulProcess.class);
                    if (mailDraft.mo151319D() <= 0 || iUndoMulProcess == null || !iUndoMulProcess.isScheduleSendCancelEnable()) {
                        if (iUndoMulProcess == null || !iUndoMulProcess.isUndoSendEnable()) {
                            MailToast.m173698a((int) R.string.Mail_Toast_EmailSent, MailToast.Type.SUCCESS);
                        } else {
                            m166930a(mailDraft);
                            C43383h.m172311a().mo155143a(new SendUndoProcess(mailSendDraftResponse.uuid, mailDraft.mo151321a()));
                        }
                        str = "send";
                    } else {
                        C42187a.m168510c();
                        m166930a(mailDraft);
                        C43383h.m172311a().mo155143a(new ScheduleSendCancelProcess(mailDraft.mo151321a(), mailDraft.mo151319D()));
                        str = "time_send";
                    }
                    C42280i iVar = (C42280i) C42344d.m169091a(C42280i.class, C41949c.this.f106497a);
                    MailDraft mailDraft = mailDraft;
                    if (mailDraft != null) {
                        i = mailDraft.mo151370v();
                    } else {
                        i = C41949c.this.f106498b;
                    }
                    iVar.mo152372a("success", (long) i);
                    C42344d.m169096b(C41949c.this.f106497a);
                    C42330c.m169049a(str, mailDraft, true);
                    C42330c.m169069b(true);
                }

                @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41869a
                /* renamed from: a */
                public void mo150432a(ErrorResult errorResult) {
                    int i;
                    LKUIToast.cancelLoading();
                    String str = "time_send";
                    if (errorResult != null && errorResult.getErrorCode() == 440) {
                        C42187a.m168465a(errorResult.getErrorCode());
                        MailToast.m173698a((int) R.string.Mail_SendLater_ServerLimit, MailToast.Type.FAIL);
                        C42209j.m168612a("schedule_send_server_limit", "toast");
                    } else if (errorResult == null || errorResult.getErrorCode() != 439) {
                        MailToast.m173698a((int) R.string.Mail_Toast_CouldNotBeSent, MailToast.Type.FAIL);
                        str = "send";
                    } else {
                        C42187a.m168465a(errorResult.getErrorCode());
                        MailToast.m173698a((int) R.string.Mail_SendLater_AlreadyScheduled, MailToast.Type.FAIL);
                        C42209j.m168612a("schedule_send_already_exist_fail", "toast");
                    }
                    if (errorResult != null) {
                        ((C42280i) C42344d.m169091a(C42280i.class, C41949c.this.f106497a)).mo152369a(errorResult.getErrorCode(), errorResult.getDebugMsg());
                    }
                    C42280i iVar = (C42280i) C42344d.m169091a(C42280i.class, C41949c.this.f106497a);
                    MailDraft mailDraft = mailDraft;
                    if (mailDraft != null) {
                        i = mailDraft.mo151370v();
                    } else {
                        i = C41949c.this.f106498b;
                    }
                    iVar.mo152372a("rust_fail", (long) i);
                    C42344d.m169096b(C41949c.this.f106497a);
                    C42330c.m169049a(str, mailDraft, false);
                    C42330c.m169069b(false);
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m166870a(String str, AbstractC42000a aVar, String str2, DialogInterface dialogInterface, int i) {
            if (i == 0) {
                ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150827f(str);
                ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150808a(str, aVar);
                ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150582a(str2, str);
                ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150577a(str, 0);
                aVar.mo150989f();
            } else if (i == 1) {
                ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150591a(new String[]{str2});
                ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150827f(str);
            }
        }

        @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b.AbstractC41998a
        /* renamed from: a */
        public void mo150892a(MailDraft mailDraft, boolean z, String str, long j, IGetDataCallback iGetDataCallback) {
            if (!TextUtils.isEmpty(str)) {
                ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150818b(C41969d.m166937a(str));
            }
            ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150803a(mailDraft, z, j, iGetDataCallback);
        }
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43334u
    /* renamed from: a */
    public void mo150850a(String str, String str2) {
        Log.m165389i("ComposeMailPresenter", "onUnShareThread");
        if (TextUtils.equals(str, ((AbstractC41994h.AbstractC41995a) getModel()).mo150799a().mo151361n())) {
            int i = C419556.f106523a[((AbstractC41994h.AbstractC41995a) getModel()).mo150834k().ordinal()];
            if (i == 1 || i == 2) {
                mo150845a(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.compose.C41949c.AnonymousClass14 */

                    public void run() {
                        ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150565a(C41923a.EnumC41933a.RemovedByShareOwner);
                    }
                });
            } else if (i != 3) {
                Log.m165397w("ComposeMailPresenter", "onUnShareThread switch to default");
            } else {
                C43849u.m173826a(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.compose.$$Lambda$c$TOxk8xlcXz12HTdNPqFXae065K4 */

                    public final void run() {
                        C41949c.this.m166824s();
                    }
                });
            }
        }
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43315b
    /* renamed from: a */
    public void mo150851a(List<String> list) {
        if (!CollectionUtils.isEmpty(list)) {
            String n = ((AbstractC41994h.AbstractC41995a) getModel()).mo150799a().mo151361n();
            for (String str : list) {
                if (TextUtils.equals(n, str)) {
                    m166823r();
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43332s
    /* renamed from: a */
    public void mo150849a(String str, final PermissionCode permissionCode) {
        Log.m165389i("ComposeMailPresenter", "onSharePermissionChange: " + permissionCode);
        if (TextUtils.isEmpty(str) || !str.equals(((AbstractC41994h.AbstractC41995a) getModel()).mo150799a().mo151361n())) {
            Log.m165383e("ComposeMailPresenter", "onSharePermissionChange not matched");
        } else if (permissionCode == null || permissionCode == PermissionCode.NONE) {
            Log.m165383e("ComposeMailPresenter", "onSharePermissionChange invalid code");
        } else {
            ((AbstractC41994h.AbstractC41995a) getModel()).mo150800a(permissionCode);
            C43849u.m173826a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.compose.C41949c.RunnableC419545 */

                public void run() {
                    ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150563a(permissionCode);
                    if (C419556.f106523a[permissionCode.ordinal()] != 1) {
                        ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150601b(true);
                        ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150617f(true);
                        return;
                    }
                    ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150601b(false);
                    ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150617f(false);
                    ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150607d();
                }
            });
        }
    }

    /* renamed from: p */
    private AbstractC41999i<LocalAttachment> m166821p() {
        return new AbstractC41999i<LocalAttachment>() {
            /* class com.ss.android.lark.mail.impl.compose.C41949c.AnonymousClass12 */

            /* renamed from: a */
            int f106514a = -1;

            @Override // com.ss.android.lark.mail.impl.compose.AbstractC41999i
            /* renamed from: a */
            public void mo150871a() {
                ((C42256d) C42344d.m169091a(C42256d.class, C41949c.this.f106497a)).mo152368a();
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m166861b(String str, int i) {
                ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150578a(str, 0, i);
            }

            @Override // com.ss.android.lark.mail.impl.compose.AbstractC41999i
            /* renamed from: a */
            public void mo150872a(String str, int i) {
                C43849u.m173826a(new Runnable(str, i) {
                    /* class com.ss.android.lark.mail.impl.compose.$$Lambda$c$12$BPT1xcSsmwZMO5rJ4hiE2Q28NQ */
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ int f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C41949c.AnonymousClass12.this.m166861b(this.f$1, this.f$2);
                    }
                });
                if (this.f106514a != i) {
                    this.f106514a = i;
                    if (C41949c.this.f106497a != null) {
                        ((C42256d) C42344d.m169091a(C42256d.class, C41949c.this.f106497a)).mo152378b();
                    }
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m166860a(boolean z, LocalAttachment localAttachment, String str) {
                int i;
                int i2;
                long j;
                if (z && localAttachment != null && localAttachment.mo150765b()) {
                    Log.m165379d("ComposeMailPresenter", "upload attachment is share" + localAttachment.mo150765b());
                    ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150566a(localAttachment);
                }
                if (z && localAttachment != null && localAttachment.mo151239o()) {
                    localAttachment.mo151221b(System.currentTimeMillis() + 1296000000);
                }
                AbstractC41994h.AbstractC41997b bVar = (AbstractC41994h.AbstractC41997b) C41949c.this.getView();
                if (z) {
                    i = 1;
                } else {
                    i = -1;
                }
                if (z) {
                    i2 = 100;
                } else {
                    i2 = 0;
                }
                if (localAttachment != null) {
                    j = localAttachment.mo151236l();
                } else {
                    j = 0;
                }
                bVar.mo150579a(str, i, i2, j);
                ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150810a(str, z, localAttachment);
            }

            /* renamed from: a */
            public void mo150874a(String str, LocalAttachment localAttachment, boolean z, long j) {
                String str2;
                Log.m165379d("ComposeMailPresenter", "upload attachment id:" + str + " isSuccess:" + z);
                C43849u.m173826a(new Runnable(z, localAttachment, str) {
                    /* class com.ss.android.lark.mail.impl.compose.$$Lambda$c$12$5fl61Dl4wzqw24m3bVJcR3pDh_c */
                    public final /* synthetic */ boolean f$1;
                    public final /* synthetic */ LocalAttachment f$2;
                    public final /* synthetic */ String f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    public final void run() {
                        C41949c.AnonymousClass12.this.m166860a(this.f$1, this.f$2, this.f$3);
                    }
                });
                if (z) {
                    if (C41949c.this.f106497a != null) {
                        ((C42256d) C42344d.m169091a(C42256d.class, C41949c.this.f106497a)).mo152372a("success", j);
                    }
                } else if (C41949c.this.f106497a != null) {
                    C42256d dVar = (C42256d) C42344d.m169091a(C42256d.class, C41949c.this.f106497a);
                    if (localAttachment == null || !localAttachment.mo150768e()) {
                        str2 = "error";
                    } else {
                        str2 = "cancel";
                    }
                    dVar.mo152372a(str2, j);
                }
            }
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public AbstractC41994h.AbstractC41997b.AbstractC41998a createViewDelegate() {
        return new C41960a();
    }

    /* renamed from: g */
    public AbstractC41999i<UploadImage> mo150864g() {
        return new AbstractC41999i<UploadImage>() {
            /* class com.ss.android.lark.mail.impl.compose.C41949c.AnonymousClass11 */

            /* renamed from: a */
            int f106512a = -1;

            @Override // com.ss.android.lark.mail.impl.compose.AbstractC41999i
            /* renamed from: a */
            public void mo150871a() {
                ((C42262e) C42344d.m169091a(C42262e.class, C41949c.this.f106497a)).mo152368a();
            }

            @Override // com.ss.android.lark.mail.impl.compose.AbstractC41999i
            /* renamed from: a */
            public void mo150872a(String str, int i) {
                boolean z;
                UploadImage h = ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150830h(str);
                boolean z2 = false;
                if (h != null) {
                    z2 = h.mo150982a();
                    z = h.mo150984b();
                } else {
                    z = false;
                }
                Log.m165379d("ComposeMailPresenter", "uploadImg " + i + " uuid ," + str + " is share " + z2);
                if (z || !z2) {
                    ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150577a(str, i);
                }
                if (this.f106512a != i) {
                    this.f106512a = i;
                    if (C41949c.this.f106497a != null) {
                        ((C42262e) C42344d.m169091a(C42262e.class, C41949c.this.f106497a)).mo152378b();
                    }
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m166855a(String str, boolean z, UploadImage uploadImage) {
                ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150811a(str, z, uploadImage);
            }

            /* renamed from: a */
            public void mo150874a(String str, UploadImage uploadImage, boolean z, long j) {
                boolean z2;
                String str2;
                long j2;
                String str3;
                Log.m165379d("ComposeMailPresenter", "uploadImg " + z + " uuid " + str);
                if (uploadImage != null) {
                    z2 = uploadImage.mo150982a();
                } else {
                    z2 = false;
                }
                if (z) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("uuid", str);
                    } catch (JSONException e) {
                        Log.m165384e("ComposeMailPresenter", "uploadImg updateProgress success", e);
                    }
                    C42226b.m168638a().mo152309a("mail_dev_upload_image_cost_time", jSONObject);
                    if (!z2) {
                        AbstractC41994h.AbstractC41997b bVar = (AbstractC41994h.AbstractC41997b) C41949c.this.getView();
                        String f = uploadImage.mo151480f();
                        if (uploadImage == null) {
                            j2 = 0;
                        } else {
                            j2 = uploadImage.mo151482h();
                        }
                        if (uploadImage == null) {
                            str3 = "";
                        } else {
                            str3 = uploadImage.mo151477e();
                        }
                        bVar.mo150584a(str, true, f, j2, str3);
                    } else {
                        ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150572a(uploadImage);
                    }
                    if (C41949c.this.f106497a != null) {
                        ((C42262e) C42344d.m169091a(C42262e.class, C41949c.this.f106497a)).mo152372a("success", j);
                    }
                } else {
                    C42226b.m168638a().mo152310b("mail_dev_upload_image_cost_time");
                    if (!z2) {
                        ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150584a(str, false, (String) null, 0L, "");
                    }
                    if (C41949c.this.f106497a != null) {
                        C42262e eVar = (C42262e) C42344d.m169091a(C42262e.class, C41949c.this.f106497a);
                        if (uploadImage == null || !uploadImage.mo150986c()) {
                            str2 = "error";
                        } else {
                            str2 = "cancel";
                        }
                        eVar.mo152372a(str2, j);
                    }
                }
                C42187a.m168523d(z);
                C43849u.m173826a(new Runnable(str, z, uploadImage) {
                    /* class com.ss.android.lark.mail.impl.compose.$$Lambda$c$11$xcIuwxhyEd41pDDRUKDQHSHHTPI */
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ boolean f$2;
                    public final /* synthetic */ UploadImage f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    public final void run() {
                        C41949c.AnonymousClass11.this.m166855a(this.f$1, this.f$2, this.f$3);
                    }
                });
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m166824s() {
        C43691h.m173278a(this.f106497a, new C43691h.AbstractC43693a() {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$c$mYrF9Mwl7oaFfgEG77ixt8hZYTc */

            @Override // com.ss.android.lark.mail.impl.share.C43691h.AbstractC43693a
            public final void onOKButtonClick() {
                C41949c.this.m166825t();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m166825t() {
        if (C43785p.m173546b(this.f106497a)) {
            this.f106497a.finish();
        }
    }

    /* renamed from: f */
    public void mo150863f() {
        ((AbstractC41994h.AbstractC41997b) getView()).mo150622h();
    }

    /* renamed from: i */
    public void mo150866i() {
        m166820o();
        this.f106501e = true;
        this.f106497a.finish();
    }

    /* renamed from: k */
    public void mo150868k() {
        ((AbstractC41994h.AbstractC41997b) getView()).mo150624i();
    }

    /* renamed from: n */
    private void m166819n() {
        m166814a(((AbstractC41994h.AbstractC41995a) getModel()).mo150799a().mo151331b());
    }

    /* renamed from: o */
    private void m166820o() {
        boolean z;
        if (((AbstractC41994h.AbstractC41995a) getModel()).mo150834k() != PermissionCode.VIEW) {
            z = true;
        } else {
            z = false;
        }
        mo150852a(z);
    }

    /* renamed from: r */
    private void m166823r() {
        C42176e.m168344a().mo152266o(((AbstractC41994h.AbstractC41995a) getModel()).mo150799a().mo151321a(), new IGetDataCallback<MailGetDraftItemResponse>() {
            /* class com.ss.android.lark.mail.impl.compose.C41949c.C419534 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m166866a() {
                ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150625j();
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m166867b() {
                ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150625j();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C43849u.m173826a(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.compose.$$Lambda$c$4$MPyidBFu3i54HQhcU1iv6f5KVmA */

                    public final void run() {
                        C41949c.C419534.this.m166866a();
                    }
                });
            }

            /* renamed from: a */
            public void onSuccess(MailGetDraftItemResponse mailGetDraftItemResponse) {
                if (mailGetDraftItemResponse == null || mailGetDraftItemResponse.draft == null) {
                    C43849u.m173826a(new Runnable() {
                        /* class com.ss.android.lark.mail.impl.compose.$$Lambda$c$4$n0Q9SDGqpSP5ZNcOCsXvRBxlc1Q */

                        public final void run() {
                            C41949c.C419534.this.m166867b();
                        }
                    });
                }
            }
        });
    }

    /* renamed from: com.ss.android.lark.mail.impl.compose.c$6 */
    static /* synthetic */ class C419556 {

        /* renamed from: a */
        static final /* synthetic */ int[] f106523a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.lark.pb.email.client.v1.PermissionCode[] r0 = com.bytedance.lark.pb.email.client.v1.PermissionCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.compose.C41949c.C419556.f106523a = r0
                com.bytedance.lark.pb.email.client.v1.PermissionCode r1 = com.bytedance.lark.pb.email.client.v1.PermissionCode.VIEW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.compose.C41949c.C419556.f106523a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.lark.pb.email.client.v1.PermissionCode r1 = com.bytedance.lark.pb.email.client.v1.PermissionCode.EDIT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.mail.impl.compose.C41949c.C419556.f106523a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.lark.pb.email.client.v1.PermissionCode r1 = com.bytedance.lark.pb.email.client.v1.PermissionCode.OWNER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.compose.C41949c.C419556.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo150858c() {
        if (!((AbstractC41994h.AbstractC41995a) getModel()).mo150836m()) {
            ((AbstractC41994h.AbstractC41997b) getView()).mo150596b(new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.compose.C41949c.DialogInterface$OnClickListenerC419599 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    C41949c.this.mo150852a(true);
                }
            });
            return;
        }
        mo150852a(true);
        ((C42272g) C42344d.m169091a(C42272g.class, this.f106497a)).mo152384d();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C41988g.m166978i().mo155850j();
        C41988g.m166978i().mo153471d();
        C41988g.m166978i().mo153465b(0, true);
        C41988g.m166972c();
        Watchers.m167209b(this);
        if (!(super.getView() == null || super.getModel() == null)) {
            super.destroy();
        }
        this.f106507k.removeCallbacksAndMessages(null);
        this.f106507k = null;
    }

    /* renamed from: m */
    private void m166818m() {
        boolean z;
        if (!(this.f106505i instanceof NewMailAction)) {
            List<MailAddress> e = ((AbstractC41994h.AbstractC41995a) getModel()).mo150799a().mo151343e();
            List<MailAddress> f = ((AbstractC41994h.AbstractC41995a) getModel()).mo150799a().mo151347f();
            if (e.size() > 0 || f.size() > 0) {
                z = true;
            } else {
                z = false;
            }
            ((AbstractC41994h.AbstractC41997b) getView()).mo150590a(((AbstractC41994h.AbstractC41995a) getModel()).mo150799a().mo151366s(), z, ((AbstractC41994h.AbstractC41995a) getModel()).mo150799a().mo151339d(), e, f);
            ((AbstractC41994h.AbstractC41997b) getView()).mo150605c(((AbstractC41994h.AbstractC41995a) getModel()).mo150799a().mo151350g());
        }
        m166819n();
    }

    /* renamed from: q */
    private void m166822q() {
        ComposeMailAction composeMailAction = this.f106505i;
        if (composeMailAction instanceof NewMailAction) {
            C42226b.m168638a().mo152312c("mail_dev_send_page_cost_time");
        } else if (composeMailAction instanceof DraftMailAction) {
            C42226b.m168638a().mo152312c("mail_dev_draft_cost_time");
        } else if (composeMailAction instanceof ReplyMailAction) {
            C42226b.m168638a().mo152312c("mail_dev_replay_in_detail_cost_time");
        } else if (composeMailAction instanceof ReplyAllMailAction) {
            C42226b.m168638a().mo152312c("mail_dev_replay_all_in_detail_cost_time");
        } else if (composeMailAction instanceof ForwardMailAction) {
            C42226b.m168638a().mo152312c("mail_dev_forward_in_detail_cost_time");
        }
    }

    /* renamed from: a */
    public void mo150842a() {
        if (this.f106508l) {
            boolean z = false;
            this.f106508l = false;
            AbstractC41994h.AbstractC41997b bVar = (AbstractC41994h.AbstractC41997b) getView();
            ArrayList<LocalAttachment> a = LocalAttachment.m166710a(((AbstractC41994h.AbstractC41995a) getModel()).mo150826f());
            if (((AbstractC41994h.AbstractC41995a) getModel()).mo150834k() != PermissionCode.VIEW) {
                z = true;
            }
            bVar.mo150585a(a, z);
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        long j;
        if (getView() != null) {
            super.create();
            Watchers.m167206a(this);
            m166818m();
            ((AbstractC41994h.AbstractC41997b) getView()).mo150563a(((AbstractC41994h.AbstractC41995a) getModel()).mo150834k());
            boolean z = true;
            if (mo150865h()) {
                Log.m165389i("ComposeMailPresenter", "create trigger transform");
                ((AbstractC41994h.AbstractC41997b) getView()).mo150613e(true);
            } else {
                mo150860d();
            }
            RunnableC419501 r0 = new Runnable() {
                /* class com.ss.android.lark.mail.impl.compose.C41949c.RunnableC419501 */

                public void run() {
                    C41949c.this.mo150842a();
                }
            };
            if (TextUtils.isEmpty(((AbstractC41994h.AbstractC41995a) getModel()).mo150820c())) {
                j = 0;
            } else {
                j = 1500;
            }
            C43849u.m173827a(r0, j);
            AbstractC41994h.AbstractC41997b bVar = (AbstractC41994h.AbstractC41997b) getView();
            if (((AbstractC41994h.AbstractC41995a) getModel()).mo150834k() == PermissionCode.VIEW) {
                z = false;
            }
            bVar.mo150606c(z);
        }
    }

    /* renamed from: j */
    public C43645c mo150867j() {
        if (this.f106506j == null) {
            if (TextUtils.isEmpty(((AbstractC41994h.AbstractC41995a) getModel()).mo150799a().mo151361n())) {
                ((AbstractC41994h.AbstractC41995a) getModel()).mo150799a().mo151344e(((AbstractC41994h.AbstractC41995a) getModel()).mo150799a().mo151321a());
            }
            this.f106506j = new C43645c(this.f106497a, null, ((AbstractC41994h.AbstractC41997b) getView()).mo150602c(), ((AbstractC41994h.AbstractC41995a) getModel()).mo150799a().mo151361n(), this.f106500d, ((AbstractC41994h.AbstractC41995a) getModel()).mo150834k());
        }
        return this.f106506j;
    }

    /* renamed from: b */
    public void mo150856b() {
        Activity activity = this.f106497a;
        if (activity != null) {
            ((C42272g) C42344d.m169091a(C42272g.class, activity)).mo152372a("cancel", (long) this.f106498b);
        }
        if (!this.f106501e && ((AbstractC41994h.AbstractC41995a) getModel()).mo150836m()) {
            mo150852a(false);
        }
    }

    /* renamed from: d */
    public void mo150860d() {
        Log.m165389i("ComposeMailPresenter", "renderWebView");
        PermissionCode k = ((AbstractC41994h.AbstractC41995a) getModel()).mo150834k();
        if (k == null || k == PermissionCode.NONE || TextUtils.isEmpty(((AbstractC41994h.AbstractC41995a) getModel()).mo150799a().mo151365r())) {
            MailDraft a = ((AbstractC41994h.AbstractC41995a) getModel()).mo150799a();
            if (a != null) {
                if (C41970e.m166941d().mo150951a()) {
                    ((C42787b) aj.m5366a((FragmentActivity) this.f106497a).mo6005a(C42787b.class)).setNewMail(TextUtils.isEmpty(a.mo151362o()));
                }
                ((AbstractC41994h.AbstractC41997b) getView()).mo150573a(new ComposeWebView.C42751a.C42752a().mo153533a(((AbstractC41994h.AbstractC41995a) getModel()).mo150820c()).mo153534a(a.mo151358k()).mo153536b(a.mo151355i()).mo153537c(a.mo151363p()).mo153535a());
            } else {
                Log.m165383e("ComposeMailPresenter", "renderWebView draft null");
            }
        } else {
            ((AbstractC41994h.AbstractC41997b) getView()).mo150580a(((AbstractC41994h.AbstractC41995a) getModel()).mo150799a().mo151365r(), ((AbstractC41994h.AbstractC41995a) getModel()).mo150834k());
        }
        m166822q();
    }

    /* renamed from: c */
    private void m166817c(boolean z) {
        m166816b(z);
        this.f106501e = true;
        this.f106497a.finish();
    }

    /* renamed from: a */
    public void mo150844a(View view) {
        ((AbstractC41994h.AbstractC41997b) getView()).mo150560a(view);
    }

    /* renamed from: a */
    public void mo150845a(Runnable runnable) {
        Handler handler = this.f106507k;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    /* renamed from: a */
    private void m166814a(MailAddress mailAddress) {
        EmailAliasList emailAliasList;
        if (!C43350d.m172098a().mo155043i() || !C43277a.m171921a().mo154951o()) {
            emailAliasList = null;
        } else {
            emailAliasList = C43350d.m172098a().mo155044j();
            if (emailAliasList != null) {
                mailAddress = emailAliasList.mo151121c(mailAddress);
            }
        }
        ((AbstractC41994h.AbstractC41997b) getView()).mo150569a(mailAddress, emailAliasList, C43277a.m171921a().mo154952p(), true);
    }

    /* renamed from: b */
    private void m166816b(boolean z) {
        MailDraft a = ((AbstractC41994h.AbstractC41995a) getModel()).mo150799a();
        if (a != null) {
            DiscardDraftAction discardDraftAction = new DiscardDraftAction(a.mo151321a(), a.mo151361n());
            discardDraftAction.mo150273a(z);
            C43307b.m172030a().mo154977a(discardDraftAction);
            C42187a.m168509b(false, C42187a.C42191c.f107427D);
        }
    }

    /* renamed from: b */
    private void m166815b(String str) {
        PermissionCode k = ((AbstractC41994h.AbstractC41995a) getModel()).mo150834k();
        if (k == null || k == PermissionCode.NONE || TextUtils.isEmpty(((AbstractC41994h.AbstractC41995a) getModel()).mo150799a().mo151365r())) {
            ((C42272g) C42344d.m169091a(C42272g.class, this.f106497a)).mo152374a(str, "normal");
        } else {
            ((C42272g) C42344d.m169091a(C42272g.class, this.f106497a)).mo152374a(str, "collaboration");
        }
        C42187a.m168463G();
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43334u
    /* renamed from: a */
    public void mo150846a(String str) {
        Log.m165389i("ComposeMailPresenter", "onShareThread");
        if (TextUtils.equals(str, ((AbstractC41994h.AbstractC41995a) getModel()).mo150799a().mo151361n())) {
            C43849u.m173826a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.compose.C41949c.AnonymousClass13 */

                public void run() {
                    ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150800a(PermissionCode.OWNER);
                    ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150563a(PermissionCode.OWNER);
                    C41949c.this.mo150865h();
                }
            });
        }
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43331r
    /* renamed from: a */
    public void mo150848a(String str, Draft draft) {
        Log.m165389i("ComposeMailPresenter", "onShareDraftAdd");
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43331r
    /* renamed from: d */
    public void mo150861d(String str, Draft draft) {
        Log.m165389i("ComposeMailPresenter", "onShareDraftUpdate");
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43331r
    /* renamed from: c */
    public void mo150859c(String str, Draft draft) {
        Log.m165389i("ComposeMailPresenter", "onShareDraftSend");
        if (TextUtils.equals(str, ((AbstractC41994h.AbstractC41995a) getModel()).mo150799a().mo151361n()) && TextUtils.equals(draft.id, ((AbstractC41994h.AbstractC41995a) getModel()).mo150799a().mo151321a())) {
            mo150845a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.compose.C41949c.RunnableC419523 */

                public void run() {
                    ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150565a(C41923a.EnumC41933a.SentByShareOwner);
                }
            });
        }
    }

    /* renamed from: a */
    public long mo150841a(List<String> list, boolean z) {
        String str;
        int a;
        boolean z2;
        boolean z3;
        String str2;
        boolean z4;
        boolean z5;
        Log.m165389i("ComposeMailPresenter", "appendAttachments");
        if (list == null || list.size() == 0) {
            Log.m165389i("ComposeMailPresenter", "appendAttachments no file selected");
            return 0;
        }
        C42187a.m168538h();
        boolean l = ((AbstractC41994h.AbstractC41995a) getModel()).mo150835l();
        if (l) {
            str = ((AbstractC41994h.AbstractC41995a) getModel()).mo150799a().mo151361n();
        } else {
            str = "";
        }
        String a2 = C43785p.m173538a(str);
        ArrayList<LocalAttachment> arrayList = new ArrayList<>(list.size());
        boolean a3 = C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.harmfulattachment");
        long j = 0;
        for (String str3 : list) {
            File file = new File(str3);
            if (file.exists()) {
                j += file.length();
            }
        }
        int a4 = C43785p.m173531a(j, ((AbstractC41994h.AbstractC41995a) getModel()).mo150824e());
        if (a4 != 0) {
            boolean z6 = false;
            for (String str4 : list) {
                File file2 = new File(str4);
                if (!file2.exists()) {
                    z3 = l;
                    str2 = a2;
                    z4 = z6;
                } else if (!a3 || !C43766i.m173484a(file2)) {
                    if (a4 == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    C42330c.m169068b("attachment", z5);
                    LocalAttachment localAttachment = new LocalAttachment();
                    String a5 = C43785p.m173536a();
                    localAttachment.mo150762a(a5);
                    localAttachment.mo151223c(a4);
                    localAttachment.mo150763a(l);
                    str2 = a2;
                    localAttachment.mo151218a(file2.length());
                    localAttachment.mo151222b(file2.getName());
                    z3 = l;
                    z4 = z6;
                    C41936a aVar = new C41936a(null, str4, a5, str2, localAttachment, m166821p());
                    ((AbstractC41994h.AbstractC41995a) getModel()).mo150807a(a5, aVar);
                    arrayList.add(localAttachment);
                    aVar.mo150988e();
                } else {
                    z6 = true;
                }
                z6 = z4;
                a2 = str2;
                l = z3;
            }
            AbstractC41994h.AbstractC41997b bVar = (AbstractC41994h.AbstractC41997b) getView();
            if (((AbstractC41994h.AbstractC41995a) getModel()).mo150834k() != PermissionCode.VIEW) {
                z2 = true;
            } else {
                z2 = false;
            }
            bVar.mo150589a(z6, arrayList, z2);
            return j;
        }
        if (z && (a = C43785p.m173532a(j, 0, ((AbstractC41994h.AbstractC41995a) getModel()).mo150824e())) != 0) {
            MailToast.m173700a(C43819s.m173686a(a, "size", String.valueOf(3)));
        }
        return 0;
    }

    /* renamed from: b */
    public long mo150855b(List<Uri> list, boolean z) {
        String str;
        int a;
        boolean z2;
        boolean z3;
        Log.m165389i("ComposeMailPresenter", "appendAttachments");
        if (list == null || list.size() == 0) {
            Log.m165389i("ComposeMailPresenter", "appendAttachments no file selected");
            return 0;
        }
        C42187a.m168538h();
        boolean l = ((AbstractC41994h.AbstractC41995a) getModel()).mo150835l();
        if (l) {
            str = ((AbstractC41994h.AbstractC41995a) getModel()).mo150799a().mo151361n();
        } else {
            str = "";
        }
        String a2 = C43785p.m173538a(str);
        ArrayList<LocalAttachment> arrayList = new ArrayList<>(list.size());
        boolean a3 = C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.harmfulattachment");
        long j = 0;
        for (Uri uri : list) {
            j += LarkUriUtil.m95302b(C41816b.m166115a().mo150132b(), uri);
        }
        int a4 = C43785p.m173531a(j, ((AbstractC41994h.AbstractC41995a) getModel()).mo150824e());
        if (a4 != 0) {
            boolean z4 = false;
            for (Uri uri2 : list) {
                String a5 = LarkUriUtil.m95300a(C41816b.m166115a().mo150132b(), uri2);
                if (!a3 || !C43766i.m173485a(a5)) {
                    if (a4 == 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    C42330c.m169068b("attachment", z3);
                    LocalAttachment localAttachment = new LocalAttachment();
                    String a6 = C43785p.m173536a();
                    localAttachment.mo150762a(a6);
                    localAttachment.mo151223c(a4);
                    localAttachment.mo150763a(l);
                    localAttachment.mo151218a(LarkUriUtil.m95302b(C41816b.m166115a().mo150132b(), uri2));
                    localAttachment.mo151222b(a5);
                    C41936a aVar = new C41936a(uri2, null, a6, a2, localAttachment, m166821p());
                    ((AbstractC41994h.AbstractC41995a) getModel()).mo150807a(a6, aVar);
                    arrayList.add(localAttachment);
                    aVar.mo150988e();
                    z4 = z4;
                    l = l;
                } else {
                    z4 = true;
                }
            }
            AbstractC41994h.AbstractC41997b bVar = (AbstractC41994h.AbstractC41997b) getView();
            if (((AbstractC41994h.AbstractC41995a) getModel()).mo150834k() != PermissionCode.VIEW) {
                z2 = true;
            } else {
                z2 = false;
            }
            bVar.mo150589a(z4, arrayList, z2);
            return j;
        }
        if (z && (a = C43785p.m173532a(j, 0, ((AbstractC41994h.AbstractC41995a) getModel()).mo150824e())) != 0) {
            MailToast.m173700a(C43819s.m173686a(a, "size", String.valueOf(3)));
        }
        return 0;
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43331r
    /* renamed from: b */
    public void mo150857b(String str, Draft draft) {
        Log.m165389i("ComposeMailPresenter", "onShareDraftDelete");
        if (TextUtils.equals(str, ((AbstractC41994h.AbstractC41995a) getModel()).mo150799a().mo151361n()) && TextUtils.equals(draft.id, ((AbstractC41994h.AbstractC41995a) getModel()).mo150799a().mo151321a())) {
            mo150845a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.compose.C41949c.RunnableC419512 */

                public void run() {
                    ((AbstractC41994h.AbstractC41997b) C41949c.this.getView()).mo150565a(C41923a.EnumC41933a.DiscardedByShareOwner);
                }
            });
        }
    }

    @Override // com.ss.android.lark.mail.impl.compose.C41974f.AbstractC41985a
    /* renamed from: a */
    public void mo150847a(String str, DocsPermissionConfig.Action action) {
        Log.m165389i("ComposeMailPresenter", "onUpdateDocPermission: " + action);
        C41988g.m166978i().mo153455a(str, action);
        ((AbstractC41994h.AbstractC41995a) getModel()).mo150805a(str, action);
    }

    public C41949c(Activity activity, ComposeMailView.AbstractC41920b bVar, Intent intent) {
        m166813a(activity, bVar, intent);
        this.f106502f = new C41974f(activity, this);
    }

    /* renamed from: a */
    private void m166813a(Activity activity, ComposeMailView.AbstractC41920b bVar, Intent intent) {
        String str;
        this.f106497a = activity;
        C41988g.m166976g();
        setModel(new C41946b(this));
        if (intent != null) {
            ComposeMailAction composeMailAction = (ComposeMailAction) intent.getParcelableExtra("mail_action_key");
            this.f106505i = composeMailAction;
            if (composeMailAction == null) {
                activity.finish();
                return;
            } else {
                str = composeMailAction.mo150245a();
                this.f106500d = intent.getStringExtra("chat_id");
            }
        } else {
            str = null;
        }
        MailDraft mailDraft = (MailDraft) C42107a.m168074a().mo152036c(str);
        if (mailDraft == null) {
            mailDraft = (MailDraft) intent.getParcelableExtra("new_draft");
            if (mailDraft != null) {
                C42107a.m168074a().mo152035b(str, mailDraft);
            } else {
                activity.finish();
                return;
            }
        }
        this.f106498b = mailDraft.mo151370v();
        this.f106499c = intent.getStringExtra(ShareHitPoint.f121868c);
        ((AbstractC41994h.AbstractC41995a) getModel()).mo150806a(str, this.f106505i, this.f106499c);
        ((AbstractC41994h.AbstractC41995a) getModel()).mo150800a((PermissionCode) intent.getSerializableExtra("share_permission_code"));
        String stringExtra = intent.getStringExtra("scene_type");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = "compose";
        }
        m166815b(stringExtra);
        ComposeMailView composeMailView = new ComposeMailView(activity, bVar, this.f106505i);
        setView(composeMailView);
        composeMailView.setViewDelegate(new C41960a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo150843a(int i, int i2, final Intent intent) {
        if (i == 2333) {
            Log.m165389i("ComposeMailPresenter", "onActivityResult REQUEST_CODE_FILE_PICKER");
            if (((AbstractC41994h.AbstractC41995a) getModel()).mo150834k() == PermissionCode.VIEW) {
                Log.m165389i("ComposeMailPresenter", "onActivityResult REQUEST_CODE_FILE_PICKER VIEW, skip");
                return;
            }
            if (i2 != -1) {
                Log.m165389i("ComposeMailPresenter", "onActivityResult REQUEST_CODE_FILE_PICKER not RESULT_OK");
            }
            if (intent == null) {
                Log.m165389i("ComposeMailPresenter", "onActivityResult REQUEST_CODE_FILE_PICKER no data");
                return;
            }
            ClipData clipData = intent.getClipData();
            if (clipData == null) {
                Log.m165389i("ComposeMailPresenter", "onActivityResult REQUEST_CODE_FILE_PICKER no clipdata");
                return;
            }
            Activity activity = this.f106497a;
            if (activity != null) {
                ((C42256d) C42344d.m169091a(C42256d.class, activity)).mo152376a((String) null, false);
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                Uri uri = clipData.getItemAt(i3).getUri();
                if (uri != null) {
                    arrayList.add(uri);
                }
            }
            mo150855b((List<Uri>) arrayList, true);
        } else if (i != 2334) {
            Log.m165383e("ComposeMailPresenter", "switch to default");
        } else {
            Log.m165389i("ComposeMailPresenter", "onActivityResult REQUEST_CODE_SYSTEM_FILE_CHOOSER");
            if (((AbstractC41994h.AbstractC41995a) getModel()).mo150834k() == PermissionCode.VIEW) {
                Log.m165389i("ComposeMailPresenter", "REQUEST_CODE_SYSTEM_FILE_CHOOSER VIEW, skip");
            } else if (i2 != -1 || intent == null || intent.getData() == null) {
                Log.m165389i("ComposeMailPresenter", "REQUEST_CODE_SYSTEM_FILE_CHOOSER abort");
            } else {
                CoreThreadPool.getBackgroundHandler().post(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.compose.C41949c.RunnableC419567 */

                    public void run() {
                        if (C41949c.this.f106497a != null) {
                            ((C42256d) C42344d.m169091a(C42256d.class, C41949c.this.f106497a)).mo152376a((String) null, false);
                        }
                        try {
                            Uri data = intent.getData();
                            String a = C26311p.m95264a(C41949c.this.f106497a, data);
                            if (a == null) {
                                a = C57788ai.m224261b(C41949c.this.f106497a, data);
                            }
                            if (TextUtils.isEmpty(a)) {
                                Log.m165383e("ComposeMailPresenter", "onActivityResult REQUEST_CODE_SYSTEM_FILE_CHOOSER empty file path");
                                if (C41949c.this.f106497a != null) {
                                    ((C42256d) C42344d.m169091a(C42256d.class, C41949c.this.f106497a)).mo152372a(ApiHandler.API_CALLBACK_EXCEPTION, 0);
                                    return;
                                }
                                return;
                            }
                            try {
                                File file = new File(a);
                                if (!file.exists()) {
                                    Log.m165383e("ComposeMailPresenter", "REQUEST_CODE_SYSTEM_FILE_CHOOSER file not exist");
                                    if (C41949c.this.f106497a != null) {
                                        ((C42256d) C42344d.m169091a(C42256d.class, C41949c.this.f106497a)).mo152372a(ApiHandler.API_CALLBACK_EXCEPTION, 0);
                                        return;
                                    }
                                    return;
                                }
                                long length = file.length();
                                int a2 = C43785p.m173532a(file.length(), ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150822d(), ((AbstractC41994h.AbstractC41995a) C41949c.this.getModel()).mo150824e());
                                if (a2 != 0) {
                                    Log.m165383e("ComposeMailPresenter", "REQUEST_CODE_SYSTEM_FILE_CHOOSER file size exceed");
                                    MailToast.m173700a(C43819s.m173686a(a2, "size", String.valueOf(3)));
                                    if (C41949c.this.f106497a != null) {
                                        ((C42256d) C42344d.m169091a(C42256d.class, C41949c.this.f106497a)).mo152372a("cancel", length);
                                        return;
                                    }
                                    return;
                                }
                                final ArrayList arrayList = new ArrayList();
                                arrayList.add(a);
                                C43849u.m173826a(new Runnable() {
                                    /* class com.ss.android.lark.mail.impl.compose.C41949c.RunnableC419567.RunnableC419571 */

                                    public void run() {
                                        C41949c.this.mo150841a(arrayList, false);
                                    }
                                });
                            } catch (Exception e) {
                                Log.m165384e("ComposeMailPresenter", "REQUEST_CODE_SYSTEM_FILE_CHOOSER check file size", e);
                                if (C41949c.this.f106497a != null) {
                                    ((C42256d) C42344d.m169091a(C42256d.class, C41949c.this.f106497a)).mo152372a(ApiHandler.API_CALLBACK_EXCEPTION, 0);
                                }
                            }
                        } catch (Exception e2) {
                            Log.m165384e("ComposeMailPresenter", "REQUEST_CODE_SYSTEM_FILE_CHOOSER parse file path", e2);
                            if (C41949c.this.f106497a != null) {
                                ((C42256d) C42344d.m169091a(C42256d.class, C41949c.this.f106497a)).mo152372a(ApiHandler.API_CALLBACK_EXCEPTION, 0);
                            }
                        }
                    }
                });
            }
        }
    }
}
