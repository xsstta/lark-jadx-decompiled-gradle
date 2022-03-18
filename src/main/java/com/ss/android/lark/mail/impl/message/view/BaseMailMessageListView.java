package com.ss.android.lark.mail.impl.message.view;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.lark.pb.email.client.v1.MailMoveToFolderResponse;
import com.bytedance.lark.pb.email.client.v1.MailMultiThreadDeletePermanentlyResponse;
import com.bytedance.lark.pb.email.client.v1.MailReplyCalendarEventRequest;
import com.bytedance.lark.pb.email.client.v1.MailReplyCalendarEventResponse;
import com.bytedance.lark.pb.email.client.v1.MailSmartReplyInfo;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.bytedance.lark.pb.email.v1.MailRecallDoneChange;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.component.ui.toast.C25707a;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.action.AbsChangeMailAction;
import com.ss.android.lark.mail.impl.action.ArchiveMailAction;
import com.ss.android.lark.mail.impl.action.CustomLabelThreadListMailAction;
import com.ss.android.lark.mail.impl.action.DeleteMessageAction;
import com.ss.android.lark.mail.impl.action.DiscardDraftAction;
import com.ss.android.lark.mail.impl.action.MoveToInboxMailAction;
import com.ss.android.lark.mail.impl.action.NotSpamAction;
import com.ss.android.lark.mail.impl.action.PushThreadAction;
import com.ss.android.lark.mail.impl.action.PushThreadChangeAction;
import com.ss.android.lark.mail.impl.action.ReadThreadListMailAction;
import com.ss.android.lark.mail.impl.action.SaveDraftAction;
import com.ss.android.lark.mail.impl.action.SentMailAction;
import com.ss.android.lark.mail.impl.action.TrashMailAction;
import com.ss.android.lark.mail.impl.compose.C41923a;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.entity.C42097j;
import com.ss.android.lark.mail.impl.entity.C42099l;
import com.ss.android.lark.mail.impl.entity.C42104p;
import com.ss.android.lark.mail.impl.entity.MailCalendar;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.entity.MailMessageRecallState;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.home.C42434b;
import com.ss.android.lark.mail.impl.message.p2204d.C42871i;
import com.ss.android.lark.mail.impl.message.p2204d.C42879j;
import com.ss.android.lark.mail.impl.message.p2205e.C42886a;
import com.ss.android.lark.mail.impl.message.p2207g.C42936a;
import com.ss.android.lark.mail.impl.message.recall.p2209a.C42981a;
import com.ss.android.lark.mail.impl.message.recall.sender.C42984a;
import com.ss.android.lark.mail.impl.message.template.C43067o;
import com.ss.android.lark.mail.impl.message.template.C43071p;
import com.ss.android.lark.mail.impl.message.template.C43075r;
import com.ss.android.lark.mail.impl.message.template.C43079u;
import com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView;
import com.ss.android.lark.mail.impl.message.view.p2210a.C43177b;
import com.ss.android.lark.mail.impl.p2166e.C42051a;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42207i;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42306q;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.service.C43307b;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43317d;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43320g;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43326m;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43327n;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43337y;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43338z;
import com.ss.android.lark.mail.impl.service.p2217b.p2219b.AbstractC43341c;
import com.ss.android.lark.mail.impl.utils.C43764g;
import com.ss.android.lark.mail.impl.utils.C43771m;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog;
import com.ss.android.lark.mail.impl.view.p2225a.C43909a;
import com.ss.android.lark.mail.impl.view.titlebar.AbsButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.FlagButton;
import com.ss.android.lark.mail.impl.view.titlebar.C43959a;
import com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar;
import com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener;
import com.ss.android.lark.utils.C57782ag;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class BaseMailMessageListView extends AbsMessageTemplateView implements AbstractC43317d, AbstractC43320g, AbstractC43326m, AbstractC43327n, AbstractC43337y, AbstractC43338z, AbstractC43341c {

    /* renamed from: V */
    C42051a f109793V;

    /* renamed from: W */
    public String f109794W;
    public List<MailSmartReplyInfo> aa;
    final List<String> ab = new ArrayList();
    DialogC25637f ac = null;
    private final String ad = "BaseMailMessageListActivity";
    private C43909a ae;

    /* renamed from: a */
    public void mo154443a(int i, String str, MailMessage mailMessage) {
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43337y
    /* renamed from: t */
    public void mo152896t() {
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    public String getCurrentThreadId() {
        return this.f109699g;
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: a */
    public void mo154320a(C42099l lVar, boolean z, boolean z2) {
        super.mo154320a(lVar, z, z2);
        this.f109673C = z2;
        this.f109705m.mo153780a(lVar);
        this.f109693a = lVar.mo151973a();
        m171458e(z);
        mo154295F();
        this.f109694b = new C42104p(this.f109699g, lVar.mo151983c(), lVar.mo151986d(), lVar.mo151988e(), lVar.mo151989f(), lVar.mo151990g(), lVar.mo151991h(), lVar.mo151994k());
        if (!C42871i.m170779b()) {
            return;
        }
        if ((getThreadType() == 1 || getThreadType() == 6) && !mo154367i()) {
            C43849u.m173826a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView.AnonymousClass15 */

                public void run() {
                    BaseMailMessageListView.this.mo154368j();
                    BaseMailMessageListView.this.f109681K.mo154537a(BaseMailMessageListView.this.f109686P, BaseMailMessageListView.this instanceof SearchResultMessageListView);
                }
            });
        }
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2219b.AbstractC43341c
    /* renamed from: a */
    public void mo154449a(final String str, ErrorResult errorResult) {
        Log.m165389i("BaseMailMessageListActivity", "onRecallFail | messageId = " + str);
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView.AnonymousClass20 */

            public void run() {
                BaseMailMessageListView.this.mo154448a(str, 0, "0", (MailRecallDoneChange) null);
            }
        });
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: a */
    public void mo154324a(String str, MailMessage mailMessage) {
        Log.m165389i("BaseMailMessageListActivity", "updateSendState:" + mailMessage.mo151561N());
        C43079u uVar = new C43079u();
        String a = uVar.mo154261a(mailMessage);
        if (TextUtils.isEmpty(a) || !uVar.mo154262a()) {
            mo154355f(str);
        } else {
            mo154313a((ValueCallback<String>) null, "updateSendState", str, a);
        }
        C42097j d = mo154349d(str);
        if (d != null) {
            d.mo151964g().mo151576a(mailMessage.mo151561N());
        }
    }

    /* renamed from: a */
    public void mo154448a(String str, int i, String str2, MailRecallDoneChange mailRecallDoneChange) {
        Log.m165389i("BaseMailMessageListActivity", "updateRecallIfNeeded | messageId = " + str + ",recallState = " + i + ", templateRecallState = " + str2);
        C42097j d = mo154349d(str);
        if (d != null) {
            int value = mailRecallDoneChange != null ? mailRecallDoneChange.status.getValue() : i;
            Log.m165389i("BaseMailMessageListActivity", "updateRecallState realyState : " + value);
            MailMessageRecallState mailMessageRecallState = new MailMessageRecallState();
            mailMessageRecallState.mo151641a(value);
            if (d.mo151964g().mo151551D().mo151640a() != 2 || value == 2 || value == 3 || value == 4 || value == 5) {
                String a = C42984a.m171086a().mo154136a(value);
                d.mo151964g().mo151574a(mailMessageRecallState);
                mo154313a((ValueCallback<String>) null, "updateRecallState", str, str2, a);
                if (i > 0) {
                    mo154355f(str);
                    return;
                }
                return;
            }
            Log.m165389i("BaseMailMessageListActivity", "updateRecallIfNeeded | ignore this realyState : " + value);
        }
    }

    /* renamed from: a */
    public void mo154447a(final Runnable runnable) {
        C42176e.m168344a().mo152235b(this.f109699g, this.f109700h, new IGetDataCallback<C42099l>() {
            /* class com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView.C431297 */

            /* renamed from: lambda$Wlbiaz-bFSwpHBeBzSW8ENYmmnw */
            public static /* synthetic */ void m270777lambda$WlbiazbFSwpHBeBzSW8ENYmmnw(C431297 r0, C42099l lVar, Runnable runnable) {
                r0.m171521a(lVar, runnable);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(C42099l lVar) {
                BaseMailMessageListView.this.f109706n.runOnUiThread(new Runnable(lVar, runnable) {
                    /* class com.ss.android.lark.mail.impl.message.view.$$Lambda$BaseMailMessageListView$7$WlbiazbFSwpHBeBzSW8ENYmmnw */
                    public final /* synthetic */ C42099l f$1;
                    public final /* synthetic */ Runnable f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        BaseMailMessageListView.C431297.m270777lambda$WlbiazbFSwpHBeBzSW8ENYmmnw(BaseMailMessageListView.C431297.this, this.f$1, this.f$2);
                    }
                });
            }

            /* renamed from: a */
            private /* synthetic */ void m171521a(C42099l lVar, Runnable runnable) {
                BaseMailMessageListView.this.mo154319a(lVar);
                Pair<C42097j, C42097j> a = BaseMailMessageListView.this.mo154442a(lVar.mo151973a(), BaseMailMessageListView.this.f109693a);
                Log.m165388i("MailMessageListActivity_run: " + a);
                if (a != null) {
                    if (!(a.first == null || BaseMailMessageListView.this.f109697e.getMailWebClient() == null)) {
                        BaseMailMessageListView.this.mo154464d((C42097j) a.first);
                        if (((C42097j) a.first).mo151964g() != null && !((C42097j) a.first).mo151964g().mo151616p()) {
                            BaseMailMessageListView.this.ae();
                        }
                        BaseMailMessageListView.this.ac();
                    }
                    if (a.second != null) {
                        BaseMailMessageListView.this.mo154462c((C42097j) a.second);
                    }
                }
                BaseMailMessageListView.this.aa();
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo154450a(List<MailLabelEntity> list, PermissionCode permissionCode) {
        Log.m165389i("BaseMailMessageListActivity", "updateLabelsCache");
        this.f109694b.mo152015a(list);
        this.f109694b.mo152012a(permissionCode);
        mo154459b(list, permissionCode);
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43338z
    /* renamed from: a */
    public void mo152867a(String str, List<String> list, boolean z) {
        if ((list != null && list.contains(this.f109699g)) || z) {
            this.f109679I.mo153894a(this.f109699g, this.f109700h, this.f109693a, this, this.f109697e);
            ah();
        }
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43337y
    /* renamed from: a */
    public void mo152868a(List<String> list, String str) {
        if (str != null && str.equals(this.f109699g)) {
            this.f109679I.mo153894a(this.f109699g, this.f109700h, this.f109693a, this, this.f109697e);
            ah();
        }
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: I */
    public void mo154298I() {
        super.mo154298I();
        Watchers.m167209b(this);
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: J */
    public void mo154299J() {
        super.mo154299J();
        aa();
    }

    /* renamed from: Z */
    public void mo154441Z() {
        mo154447a((Runnable) null);
    }

    private void ag() {
        this.f109695c.setListener(new ThreadActionButtonListener() {
            /* class com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView.C431255 */

            /* renamed from: lambda$4MC5xpe-O-yrPOTwRuVBpg85ueQ */
            public static /* synthetic */ void m270776lambda$4MC5xpeOyrPOTwRuVBpg85ueQ(C431255 r0, DialogInterface dialogInterface, int i) {
                r0.m171518b(dialogInterface, i);
            }

            public static /* synthetic */ void lambda$qteQ4ACtabMc1ntoc3el9J_H_0o(C431255 r0, DialogInterface dialogInterface, int i) {
                r0.m171517a(dialogInterface, i);
            }

            @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
            public void onReadMailSearchClick() {
                Log.m165389i("BaseMailMessageListActivity", "onReadMailSearchClick");
                BaseMailMessageListView.this.f109711s.mo153968a(false);
            }

            @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
            public void onCancelScheduleSendClick() {
                Log.m165389i("BaseMailMessageListActivity", "onCancelScheduleSendClick");
                C42434b.m169445d(BaseMailMessageListView.this.f109706n, new DialogInterface.OnClickListener() {
                    /* class com.ss.android.lark.mail.impl.message.view.$$Lambda$BaseMailMessageListView$5$qteQ4ACtabMc1ntoc3el9J_H_0o */

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        BaseMailMessageListView.C431255.lambda$qteQ4ACtabMc1ntoc3el9J_H_0o(BaseMailMessageListView.C431255.this, dialogInterface, i);
                    }
                });
            }

            @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
            public void onDeleteForeverClick() {
                Log.m165389i("BaseMailMessageListActivity", "onDeleteForeverClick");
                C42434b.m169444c(BaseMailMessageListView.this.f109706n, new DialogInterface.OnClickListener() {
                    /* class com.ss.android.lark.mail.impl.message.view.$$Lambda$BaseMailMessageListView$5$4MC5xpeOyrPOTwRuVBpg85ueQ */

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        BaseMailMessageListView.C431255.m270776lambda$4MC5xpeOyrPOTwRuVBpg85ueQ(BaseMailMessageListView.C431255.this, dialogInterface, i);
                    }
                });
                C42330c.m169071c(C42330c.C42333b.f107663p);
            }

            @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
            public void onMoveToLabelClick() {
                BaseMailMessageListView.this.mo154438W();
                C42187a.m168482a("email_thread_moveto", C43177b.m171626a());
                C42330c.m169071c(C42330c.C42333b.f107661n);
            }

            @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
            public void onReplyClick() {
                Log.m165389i("BaseMailMessageListActivity", "onReplyClick");
                BaseMailMessageListView.this.f109718z.mo154564a(1);
                C42187a.m168482a("email_thread_reply", C43177b.m171626a());
                C42330c.m169071c(C42330c.C42333b.f107672y);
            }

            @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
            public void onUnreadClick() {
                Log.m165389i("BaseMailMessageListActivity", "onUnreadClick");
                BaseMailMessageListView.this.ad();
                C42330c.m169071c(C42330c.C42333b.f107655h);
            }

            @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
            public void onArchiveClick() {
                Log.m165389i("BaseMailMessageListActivity", "onArchiveClick");
                BaseMailMessageListView.this.mo154302M();
                C43307b.m172030a().mo154977a(new ArchiveMailAction(BaseMailMessageListView.this.f109699g, BaseMailMessageListView.this.f109700h, "ARCHIVED"));
                C42187a.m168532f(BaseMailMessageListView.this.f109699g, C42187a.C42191c.f107465p, C43374f.m172261b(BaseMailMessageListView.this.f109700h));
                C42187a.m168469a(1, false, C42187a.C42191c.f107434K);
                C42330c.m169071c(C42330c.C42333b.f107650c);
            }

            @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
            public void onChangeLabelClick() {
                Log.m165389i("BaseMailMessageListActivity", "onChangeLabelClick");
                ArrayList arrayList = new ArrayList();
                for (MailLabelEntity mailLabelEntity : BaseMailMessageListView.this.f109694b.mo152018b()) {
                    arrayList.add(mailLabelEntity.mo151527k());
                }
                BaseMailMessageListView.this.mo154437V();
                C42187a.m168482a("email_thread_changelabel", C43177b.m171626a());
                C42330c.m169071c(C42330c.C42333b.f107656i);
            }

            @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
            public void onDeleteClick() {
                Log.m165389i("BaseMailMessageListActivity", "onDeleteClick");
                BaseMailMessageListView.this.mo154302M();
                C43307b.m172030a().mo154977a(new TrashMailAction(BaseMailMessageListView.this.f109699g, BaseMailMessageListView.this.f109700h));
                C42187a.m168527e(BaseMailMessageListView.this.f109699g, C42187a.C42191c.f107465p, C43374f.m172261b(BaseMailMessageListView.this.f109700h));
                C42187a.m168499b(1, false, C42187a.C42191c.f107434K);
                C42330c.m169071c(C42330c.C42333b.f107651d);
            }

            @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
            public void onMoveToFolderClick() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(BaseMailMessageListView.this.f109694b.mo152010a());
                C42187a.m168576w(C42187a.C42191c.f107434K);
                C42699a.m170281d(BaseMailMessageListView.this.getContext(), arrayList, BaseMailMessageListView.this.f109700h);
                C42330c.m169071c(C42330c.C42333b.f107645I);
            }

            @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
            public void onMoveToImportantClick() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(BaseMailMessageListView.this.f109694b.mo152010a());
                C42176e.m168344a().mo152225a(arrayList, "OTHER", "IMPORTANT", new IGetDataCallback<MailMoveToFolderResponse>() {
                    /* class com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView.C431255.C431261 */

                    /* renamed from: a */
                    public void onSuccess(MailMoveToFolderResponse mailMoveToFolderResponse) {
                        MailToast.m173697a((int) R.string.Mail_SmartInbox_MoveToImportant_Success);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        MailToast.m173697a((int) R.string.Mail_CustomLabels_FailedToast);
                        C42209j.m168612a("label_create_custom_fail", "toast");
                    }
                });
                C42187a.m168506b(C42187a.C42191c.f107446W, C42187a.C42191c.aa, BaseMailMessageListView.this.f109694b.mo152010a(), C42187a.C42191c.ae);
                C42330c.m169071c(C42330c.C42333b.f107670w);
            }

            @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
            public void onMoveToOtherClick() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(BaseMailMessageListView.this.f109694b.mo152010a());
                C42176e.m168344a().mo152225a(arrayList, "IMPORTANT", "OTHER", new IGetDataCallback<MailMoveToFolderResponse>() {
                    /* class com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView.C431255.C431272 */

                    /* renamed from: a */
                    public void onSuccess(MailMoveToFolderResponse mailMoveToFolderResponse) {
                        MailToast.m173697a((int) R.string.Mail_SmartInbox_MoveToOthers_Success);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        MailToast.m173697a((int) R.string.Mail_CustomLabels_FailedToast);
                        C42209j.m168612a("label_create_custom_fail", "toast");
                    }
                });
                C42187a.m168506b(C42187a.C42191c.f107447X, C42187a.C42191c.aa, BaseMailMessageListView.this.f109694b.mo152010a(), C42187a.C42191c.ae);
                C42330c.m169071c(C42330c.C42333b.f107669v);
            }

            @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
            public void onNotSpamClick() {
                Log.m165389i("BaseMailMessageListActivity", "onNotSpamClick");
                BaseMailMessageListView.this.mo154463c(false);
                C42187a.m168553l(BaseMailMessageListView.this.f109699g, C42187a.C42191c.f107465p, C43374f.m172261b(BaseMailMessageListView.this.f109700h));
                C42330c.m169071c(C42330c.C42333b.f107653f);
            }

            @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
            public void onSpamClick() {
                Log.m165389i("BaseMailMessageListActivity", "onSpamClick");
                BaseMailMessageListView.this.mo154463c(true);
                C42187a.m168536g(BaseMailMessageListView.this.f109699g, C42187a.C42191c.f107465p, C43374f.m172261b(BaseMailMessageListView.this.f109700h));
                C42330c.m169071c(C42330c.C42333b.f107646J);
            }

            @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
            public void onFlagClick() {
                Log.m165389i("BaseMailMessageListActivity", "onFlagClick");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (BaseMailMessageListView.this.f109694b.mo152023e()) {
                    arrayList2.add("FLAGGED");
                    BaseMailMessageListView.this.mo154460b(false);
                    C42330c.m169071c(C42330c.C42333b.f107660m);
                } else {
                    arrayList.add("FLAGGED");
                    BaseMailMessageListView.this.mo154460b(true);
                    C42330c.m169071c(C42330c.C42333b.f107659l);
                    C42187a.m168535g(C42187a.C42191c.f107434K);
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(BaseMailMessageListView.this.f109699g);
                Log.m165389i("BaseMailMessageListActivity", "CLICK_FLAG curLabelID:" + BaseMailMessageListView.this.f109700h);
                C43307b.m172030a().mo154977a(new CustomLabelThreadListMailAction(arrayList3, BaseMailMessageListView.this.f109700h, arrayList, arrayList2));
            }

            @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
            public void onForwardClick() {
                Log.m165389i("BaseMailMessageListActivity", "onForwardClick");
                if (!C13657b.m55421a(BaseMailMessageListView.this.f109693a)) {
                    C42097j jVar = (C42097j) BaseMailMessageListView.this.f109693a.get(BaseMailMessageListView.this.f109693a.size() - 1);
                    BaseMailMessageListView.this.mo154345c(jVar.mo151964g(), jVar.mo151959c(), "message_quick_action_forward");
                    C42187a.m168515c(BaseMailMessageListView.this.f109699g, jVar.mo151964g().mo151581b(), jVar.mo151959c());
                    C42187a.m168482a("email_thread_forward", C43177b.m171626a());
                    C42330c.m169071c(C42330c.C42333b.f107639C);
                }
            }

            @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
            public void onMoveToInboxClick() {
                Log.m165389i("BaseMailMessageListActivity", "onMoveToInboxButtonClick");
                BaseMailMessageListView.this.mo154440Y();
                String b = C43374f.m172261b(BaseMailMessageListView.this.f109700h);
                String str = BaseMailMessageListView.this.f109700h;
                str.hashCode();
                if (str.equals("ARCHIVED")) {
                    C42187a.m168550k(BaseMailMessageListView.this.f109699g, C42187a.C42191c.f107465p, b);
                } else if (str.equals("TRASH")) {
                    C42187a.m168547j(BaseMailMessageListView.this.f109699g, C42187a.C42191c.f107465p, b);
                }
                C42330c.m169071c(C42330c.C42333b.f107662o);
            }

            /* renamed from: b */
            private /* synthetic */ void m171518b(DialogInterface dialogInterface, int i) {
                BaseMailMessageListView.this.mo154466d(true);
                BaseMailMessageListView.this.af();
            }

            /* renamed from: a */
            private /* synthetic */ void m171517a(DialogInterface dialogInterface, int i) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(BaseMailMessageListView.this.f109694b.mo152010a());
                BaseMailMessageListView.this.mo154328a("thread_action", "", arrayList);
                C42330c.m169071c(C42330c.C42333b.f107641E);
            }
        });
    }

    /* access modifiers changed from: public */
    private /* synthetic */ void ai() {
        mo154313a((ValueCallback<String>) null, "hideSmartReply", "");
    }

    /* renamed from: U */
    public void mo154436U() {
        C42176e.m168345b(this.f109699g, this.f109703k, this.f109700h, new IGetDataCallback<C42099l>() {
            /* class com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView.AnonymousClass16 */

            /* renamed from: a */
            public void onSuccess(C42099l lVar) {
                BaseMailMessageListView.this.mo154458b(lVar, true, false);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("BaseMailMessageListActivity", "requestMessageListDataFromNet onError ");
                if (BaseMailMessageListView.this.f109674D != null) {
                    BaseMailMessageListView.this.f109674D.onError(errorResult);
                }
                BaseMailMessageListView.this.f109706n.runOnUiThread(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView.AnonymousClass16.RunnableC431191 */

                    public void run() {
                        BaseMailMessageListView.this.mo154374s();
                    }
                });
            }
        });
    }

    public void ab() {
        Log.m165389i("BaseMailMessageListActivity", "hideSmartReply");
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.view.$$Lambda$BaseMailMessageListView$xrBd5fVUgOTs6Ni1FpHsnJqamwc */

            public final void run() {
                BaseMailMessageListView.lambda$xrBd5fVUgOTs6Ni1FpHsnJqamwc(BaseMailMessageListView.this);
            }
        });
    }

    public void ac() {
        Log.m165389i("BaseMailMessageListActivity", "updateFooterIfNeeded");
        this.f109718z.mo154565a(this);
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: g */
    public void mo154356g() {
        super.mo154356g();
        ag();
        mo154366h();
        Watchers.m167206a(this);
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    public int getTemplateLayout() {
        if (C42871i.m170779b()) {
            return R.layout.mail_message_list_tab_item_frame;
        }
        return R.layout.mail_message_list_tab_item;
    }

    private void ah() {
        final String str = this.f109700h;
        final String str2 = this.f109699g;
        C42176e.m168344a().mo152243c(str2, str, new IGetDataCallback<MailThread>() {
            /* class com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView.AnonymousClass11 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(final MailThread mailThread) {
                C43849u.m173826a(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView.AnonymousClass11.RunnableC431181 */

                    public void run() {
                        BaseMailMessageListView.this.mo154446a(mailThread, str, str2);
                    }
                });
            }
        });
    }

    /* renamed from: W */
    public void mo154438W() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f109694b.mo152010a());
        C42699a.m170245a((Context) this.f109706n, (ArrayList<String>) arrayList, this.f109700h);
    }

    /* renamed from: X */
    public boolean mo154439X() {
        for (C42097j jVar : this.f109693a) {
            if (jVar.mo151967i()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Y */
    public void mo154440Y() {
        C43307b.m172030a().mo154977a(new MoveToInboxMailAction(this.f109699g, this.f109700h, "INBOX", true));
        mo154302M();
    }

    public void ae() {
        this.f109701i = true;
        C43307b.m172030a().mo154977a(new ReadThreadListMailAction(this.f109699g, this.f109700h, true));
    }

    public void af() {
        C42176e.m168344a().mo152244c(this.f109700h, Collections.singletonList(this.f109699g), new IGetDataCallback<MailMultiThreadDeletePermanentlyResponse>() {
            /* class com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView.AnonymousClass13 */

            /* renamed from: a */
            public void onSuccess(MailMultiThreadDeletePermanentlyResponse mailMultiThreadDeletePermanentlyResponse) {
                BaseMailMessageListView.this.mo154466d(false);
                MailToast.m173698a((int) R.string.Mail_Toast_DeleteThreadsSuccess, MailToast.Type.SUCCESS);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                BaseMailMessageListView.this.mo154466d(false);
                MailToast.m173698a((int) R.string.Mail_Toast_OperationFailed, MailToast.Type.SUCCESS);
                C42209j.m168613a("thread_delete_forever_fail", "toast", "messagelist");
            }
        });
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43338z
    /* renamed from: y */
    public void mo152901y() {
        this.f109679I.mo153894a(this.f109699g, this.f109700h, this.f109693a, this, this.f109697e);
        ah();
    }

    private int getMessageCount() {
        int i = 0;
        for (C42097j jVar : this.f109693a) {
            if (jVar.mo151965h()) {
                i++;
            }
        }
        return this.f109693a.size() + i;
    }

    /* renamed from: V */
    public void mo154437V() {
        MailThread mailThread = new MailThread();
        mailThread.mo151682a(this.f109694b.mo152010a());
        mailThread.mo151704e(this.f109694b.mo152018b());
        ArrayList arrayList = new ArrayList();
        arrayList.add(mailThread);
        C42699a.m170267b(this.f109706n, arrayList, this.f109700h);
    }

    public void ad() {
        Log.m165389i("BaseMailMessageListActivity", "markAsUnread");
        mo154302M();
        C43307b.m172030a().mo154977a(new ReadThreadListMailAction(this.f109699g, this.f109700h, false));
        C42187a.m168544i(this.f109699g, C42187a.C42191c.f107465p, C43374f.m172261b(this.f109700h));
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    public void getData() {
        Log.m165389i("BaseMailMessageListActivity", "BaseMailMessageListActivity initData ");
        C42306q qVar = (C42306q) C42344d.m169092a(C42306q.class, getContext(), this.f109699g);
        if (qVar != null) {
            qVar.mo152391h("key_get_rust_data_start");
        }
        C42176e.m168344a().mo152213a(this.f109699g, this.f109703k, this.f109700h, new IGetDataCallback<C42099l>() {
            /* class com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView.AnonymousClass14 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("BaseMailMessageListActivity", "BaseMailMessageListActivity getThreadInfoFromDB onError ");
                if (BaseMailMessageListView.this.f109705m != null) {
                    BaseMailMessageListView.this.mo154436U();
                }
            }

            /* renamed from: a */
            public void onSuccess(C42099l lVar) {
                BaseMailMessageListView.this.mo154458b(lVar, false, false);
                if (C41816b.m166115a().mo150143j()) {
                    for (C42097j jVar : BaseMailMessageListView.this.f109693a) {
                        if (jVar.mo151964g().mo151550C()) {
                            Log.m165389i("BaseMailMessageListActivity", "BodyClipped length = " + (((float) jVar.mo151964g().mo151606h().length()) / 1024.0f) + " KB");
                        }
                    }
                }
            }
        });
    }

    public List<String> getMsgIds() {
        ArrayList arrayList = new ArrayList();
        for (C42097j jVar : this.f109693a) {
            String b = jVar.mo151964g().mo151581b();
            if (!arrayList.contains(b)) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: h */
    public void mo154366h() {
        super.mo154366h();
        if (this.f109705m != null && this.f109705m.mo153785b() != null && this.f109705m.mo153785b().mo154056g() && this.f109695c != null) {
            Log.m165388i("BaseMessageListTabFragment initTitleBar webview:");
            mo154434S();
            if (!this.f109701i) {
                C42207i.m168608a(202105241, this.f109699g, 2000);
            }
            mo154465d(this.f109705m.mo153786c());
        }
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView, com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c
    /* renamed from: q */
    public void mo150632q() {
        super.mo150632q();
        long f = C42879j.m170799a().mo153881f(this.f109699g);
        if (f > 0) {
            ((C42306q) C42344d.m169092a(C42306q.class, getContext(), this.f109699g)).mo152435b(f);
            return;
        }
        C42306q qVar = (C42306q) C42344d.m169092a(C42306q.class, getContext(), this.f109699g);
        if (qVar != null) {
            qVar.mo152391h("key_render_page_finish");
        }
    }

    /* renamed from: S */
    public void mo154434S() {
        this.f109677G = (OperationTitleBar) this.f109706n.findViewById(R.id.message_list_operation_title_bar);
        if (this.f109677G != null) {
            this.f109677G.setListener(new OperationTitleBar.AbstractC43958a() {
                /* class com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView.C431171 */

                @Override // com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar.AbstractC43958a
                /* renamed from: a */
                public void mo150696a() {
                    BaseMailMessageListView.this.mo154302M();
                }
            });
            mo154435T();
            mo154460b(this.f109694b.mo152023e());
            if (C41816b.m166115a().mo150143j()) {
                this.f109793V = new C42051a();
                this.f109677G.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView.AnonymousClass12 */

                    public void onClick(View view) {
                        Log.m165389i("BaseMailMessageListActivity", "initTitleBar onClick");
                        if (BaseMailMessageListView.this.f109793V.mo151065a() && C41816b.m166115a().mo150143j() && CollectionUtils.isNotEmpty(BaseMailMessageListView.this.f109693a) && BaseMailMessageListView.this.f109693a.get(0) != null) {
                            C41816b.m166115a().mo150124a(BaseMailMessageListView.this.f109706n, ((C42097j) BaseMailMessageListView.this.f109693a.get(0)).mo151964g().mo151581b(), BaseMailMessageListView.this.f109699g);
                        }
                    }
                });
            }
        }
    }

    public void aa() {
        C42097j jVar;
        if (!CollectionUtils.isEmpty(this.f109693a) && (jVar = (C42097j) this.f109693a.get(this.f109693a.size() - 1)) != null && jVar.mo151964g() != null && !jVar.mo151964g().mo151621u()) {
            boolean z = !C41816b.m166115a().mo150154u().mo150161b("larkmail.cli.hide_ai_point");
            if (!TextUtils.isEmpty(this.f109794W) && (jVar.mo151965h() || z)) {
                this.f109794W = "";
                ab();
            }
            if (z) {
                mo154473m(jVar.mo151964g().mo151581b());
            }
        }
    }

    /* renamed from: T */
    public void mo154435T() {
        String str;
        if (this.f109705m.mo153785b().mo154056g() && this.f109695c != null) {
            Pair<List<AbsButton>, List<AbsButton>> buttons = this.f109695c.getButtons(this.f109694b, this.f109693a, this.f109700h);
            String str2 = null;
            if (this.f109693a == null || this.f109693a.size() <= 0 || this.f109693a.get(0) == null || ((C42097j) this.f109693a.get(0)).mo151964g() == null) {
                str = null;
            } else {
                MailMessage g = ((C42097j) this.f109693a.get(0)).mo151964g();
                String g2 = g.mo151604g();
                if (g.mo151586c() != null) {
                    str2 = g.mo151586c().mo151179c();
                }
                if (!TextUtils.isEmpty(str2)) {
                    str2 = C43819s.m173684a((int) R.string.Mail_Normal_FromColon) + str2;
                }
                str = str2;
                str2 = g2;
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = C43819s.m173684a((int) R.string.Mail_ThreadList_NoName);
            }
            this.f109677G.mo156419a((List) buttons.first, new C43959a(new ActionDialog.C43926b(R.drawable.ud_icon_mail_filled, str2, str), (List) buttons.second));
        }
    }

    /* renamed from: b */
    public String mo154457b(MailDraft mailDraft) {
        return mailDraft.mo151362o();
    }

    /* renamed from: d */
    private void m171456d(final JSONObject jSONObject) {
        C41923a.m166667b(this.f109706n, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView.DialogInterface$OnClickListenerC431286 */

            public void onClick(DialogInterface dialogInterface, int i) {
                String optString = jSONObject.optString("draftId");
                C42097j k = BaseMailMessageListView.this.mo154471k(optString);
                if (k != null) {
                    BaseMailMessageListView.this.mo154472l(optString);
                    k.mo151956a(optString);
                    if (k == BaseMailMessageListView.this.f109693a.get(BaseMailMessageListView.this.f109693a.size() - 1)) {
                        BaseMailMessageListView.this.ac();
                    }
                    C42187a.m168509b(false, C42187a.C42191c.f107428E);
                    DiscardDraftAction discardDraftAction = new DiscardDraftAction(optString, BaseMailMessageListView.this.f109699g);
                    discardDraftAction.mo150273a(true);
                    C43307b.m172030a().mo154977a(discardDraftAction);
                    if (!BaseMailMessageListView.this.mo154439X()) {
                        BaseMailMessageListView.this.mo154302M();
                    }
                }
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: o */
    private /* synthetic */ void m171459o(final String str) {
        C42176e.m168344a().mo152265n(str, new IGetDataCallback<List<MailSmartReplyInfo>>() {
            /* class com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView.C431319 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(final List<MailSmartReplyInfo> list) {
                C43849u.m173826a(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView.C431319.RunnableC431321 */

                    public void run() {
                        Log.m165389i("BaseMailMessageListActivity", "showSmartReply msg id ,get data success");
                        if (BaseMailMessageListView.this.aa == null) {
                            BaseMailMessageListView.this.aa = new ArrayList(3);
                        }
                        BaseMailMessageListView.this.aa.clear();
                        BaseMailMessageListView.this.aa.addAll(list);
                        ArrayList arrayList = new ArrayList(3);
                        for (MailSmartReplyInfo mailSmartReplyInfo : list) {
                            arrayList.add(mailSmartReplyInfo.reply_text);
                        }
                        BaseMailMessageListView.this.f109794W = str;
                        JSONArray jSONArray = new JSONArray((Collection) arrayList);
                        BaseMailMessageListView.this.f109697e.evaluateJavascript("showSmartReply(" + jSONArray.toString() + ")", null);
                    }
                });
            }
        });
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: f */
    public void mo154355f(String str) {
        mo154313a((ValueCallback<String>) null, "hideSendStatus", str);
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43320g
    /* renamed from: n */
    public void mo154474n(final String str) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView.AnonymousClass10 */

            public static /* synthetic */ void lambda$bJyiiLLuWNHEPrbmcEsl1J_WFCQ(AnonymousClass10 r0, String str) {
                r0.m171512a(str);
            }

            public void run() {
                BaseMailMessageListView.this.mo154447a((Runnable) new Runnable(str) {
                    /* class com.ss.android.lark.mail.impl.message.view.$$Lambda$BaseMailMessageListView$10$bJyiiLLuWNHEPrbmcEsl1J_WFCQ */
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        BaseMailMessageListView.AnonymousClass10.lambda$bJyiiLLuWNHEPrbmcEsl1J_WFCQ(BaseMailMessageListView.AnonymousClass10.this, this.f$1);
                    }
                });
            }

            /* renamed from: a */
            private /* synthetic */ void m171512a(String str) {
                C42097j d = BaseMailMessageListView.this.mo154349d(str);
                if (d != null) {
                    BaseMailMessageListView.this.mo154462c(d);
                }
            }
        });
    }

    public BaseMailMessageListView(Context context) {
        super(context);
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: a */
    public void mo154312a(ViewGroup viewGroup) {
        super.mo154312a(viewGroup);
        C42306q qVar = (C42306q) C42344d.m169092a(C42306q.class, getContext(), this.f109699g);
        if (qVar != null) {
            qVar.mo152391h("key_before_load_data");
        }
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2219b.AbstractC43341c
    /* renamed from: h */
    public void mo154468h(final String str) {
        Log.m165389i("BaseMailMessageListActivity", "onStartRecall | messageId = " + str);
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView.AnonymousClass19 */

            public void run() {
                BaseMailMessageListView.this.mo154448a(str, 1, "1", (MailRecallDoneChange) null);
            }
        });
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2219b.AbstractC43341c
    /* renamed from: i */
    public void mo154469i(final String str) {
        Log.m165389i("BaseMailMessageListActivity", "onRecallSuccess | messageId = " + str);
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView.RunnableC431202 */

            public void run() {
                C42097j d = BaseMailMessageListView.this.mo154349d(str);
                if (d != null) {
                    if (C42984a.m171086a().mo154140b(d.mo151964g())) {
                        BaseMailMessageListView.this.mo154448a(str, 2, "3", (MailRecallDoneChange) null);
                    } else {
                        BaseMailMessageListView.this.mo154448a(str, 1, "2", (MailRecallDoneChange) null);
                    }
                }
            }
        });
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43327n
    /* renamed from: j */
    public void mo154470j(final String str) {
        Log.m165389i("BaseMailMessageListActivity", "onRecalled | messageId = " + str);
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView.RunnableC431224 */

            public void run() {
                if (BaseMailMessageListView.this.mo154349d(str) != null) {
                    synchronized (BaseMailMessageListView.this.ab) {
                        if (!BaseMailMessageListView.this.ab.contains(str)) {
                            BaseMailMessageListView.this.ab.add(str);
                        }
                    }
                    final RunnableC431231 r0 = new Runnable() {
                        /* class com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView.RunnableC431224.RunnableC431231 */

                        public void run() {
                            ArrayList arrayList;
                            synchronized (BaseMailMessageListView.this.ab) {
                                arrayList = new ArrayList(BaseMailMessageListView.this.ab);
                                BaseMailMessageListView.this.ab.clear();
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                BaseMailMessageListView.this.mo154462c(BaseMailMessageListView.this.mo154349d((String) it.next()));
                            }
                        }
                    };
                    if (BaseMailMessageListView.this.f109705m.mo153785b().mo154056g()) {
                        DialogInterface$OnClickListenerC431242 r1 = new DialogInterface.OnClickListener() {
                            /* class com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView.RunnableC431224.DialogInterface$OnClickListenerC431242 */

                            public void onClick(DialogInterface dialogInterface, int i) {
                                r0.run();
                            }
                        };
                        if (BaseMailMessageListView.this.ac != null) {
                            BaseMailMessageListView.this.ac.dismiss();
                        }
                        Log.m165389i("BaseMailMessageListActivity", "onRecalled | show recalled tips : " + str);
                        BaseMailMessageListView.this.ac = C42981a.m171084a().mo154135a(BaseMailMessageListView.this.getContext(), BaseMailMessageListView.this.ab.size(), r1);
                        C42209j.m168613a("has_been_recall", "alert", "messagelist");
                        return;
                    }
                    r0.run();
                }
            }
        });
    }

    /* renamed from: l */
    public void mo154472l(String str) {
        Log.m165389i("BaseMailMessageListActivity", "deleteDraft");
        C42097j k = mo154471k(str);
        if (k != null) {
            k.mo151956a(str);
        }
        mo154313a((ValueCallback<String>) null, "deleteDraft", str);
    }

    /* renamed from: c */
    private boolean mo154549c(List<MailLabelEntity> list) {
        if (list != null) {
            for (MailLabelEntity mailLabelEntity : list) {
                if ("DRAFT".equals(mailLabelEntity.mo151527k())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    private void m171457e(C42097j jVar) {
        if (jVar != null) {
            this.f109693a.remove(jVar);
            DeleteMessageAction deleteMessageAction = new DeleteMessageAction(jVar.mo151964g().mo151581b(), this.f109699g);
            deleteMessageAction.mo150266b(jVar.mo151965h());
            deleteMessageAction.mo150265a(mo154439X());
            C43307b.m172030a().mo154977a(deleteMessageAction);
            if (!mo154439X()) {
                mo154302M();
            }
        }
    }

    /* renamed from: d */
    public void mo154465d(C42099l lVar) {
        Log.m165389i("BaseMailMessageListActivity", "doReadAction mIsThreadRead:" + this.f109701i);
        if (!this.f109701i && this.f109705m.mo153785b().mo154056g()) {
            ae();
        }
    }

    /* renamed from: a */
    private MailDraft mo150846a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (C42097j jVar : this.f109693a) {
            if (!(jVar == null || jVar.mo151950a() == null)) {
                for (MailDraft mailDraft : jVar.mo151950a()) {
                    if (mailDraft != null && C57782ag.m224242a(mailDraft.mo151321a(), str)) {
                        return mailDraft;
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* renamed from: e */
    private void m171458e(boolean z) {
        C42306q qVar = (C42306q) C42344d.m169092a(C42306q.class, getContext(), this.f109699g);
        if (qVar != null && !CollectionUtils.isEmpty(this.f109693a)) {
            if (this.f109673C) {
                z = C42879j.m170799a().mo153886i(this.f109699g);
                qVar.mo152430a(C42879j.m170799a().mo153877d(this.f109699g), C42879j.m170799a().mo153879e(this.f109699g));
            } else {
                qVar.mo152391h("key_get_rust_data_success");
            }
            int size = this.f109693a.size();
            boolean z2 = false;
            Iterator it = this.f109693a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C42097j) it.next()).mo151964g().mo151550C()) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            qVar.mo152432a(this.f109699g, size, z2, z);
            qVar.mo152433a(this.f109675E);
        }
    }

    /* renamed from: c */
    public void mo154462c(C42097j jVar) {
        String b = jVar.mo151964g().mo151581b();
        Log.m165389i("BaseMailMessageListActivity", "deleteMessageTemporary | messageId = " + b);
        mo154313a((ValueCallback<String>) null, "deleteMessage", b);
        this.f109693a.remove(jVar);
        if (!mo154439X()) {
            mo154302M();
        }
    }

    /* renamed from: d */
    public void mo154464d(C42097j jVar) {
        Log.m165389i("BaseMailMessageListActivity", "addMessage");
        if (jVar.mo151964g() != null) {
            jVar.mo151964g().mo151588c(jVar.mo151964g().mo151606h());
            this.f109693a.add(jVar);
            mo154336b(jVar);
            C43067o oVar = new C43067o(this.f109694b, this.f109700h);
            ArrayList arrayList = new ArrayList();
            arrayList.add(jVar);
            mo154313a((ValueCallback<String>) null, "updateMessage", oVar.mo154248a(arrayList));
        }
    }

    /* renamed from: k */
    public C42097j mo154471k(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (C42097j jVar : this.f109693a) {
            if (!(jVar == null || jVar.mo151950a() == null)) {
                for (MailDraft mailDraft : jVar.mo151950a()) {
                    if (mailDraft != null && C57782ag.m224242a(mailDraft.mo151321a(), str)) {
                        return jVar;
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* renamed from: m */
    public void mo154473m(String str) {
        Log.m165389i("BaseMailMessageListActivity", "showSmartReply msg id " + str);
        if (C43350d.m172098a().mo155049o() && this.f109694b != null && this.f109694b.mo152021c() == PermissionCode.NONE && !TextUtils.isEmpty(str)) {
            CoreThreadPool.getBackgroundHandler().post(new Runnable(str) {
                /* class com.ss.android.lark.mail.impl.message.view.$$Lambda$BaseMailMessageListView$khmiiZewEE6tRZwBpaj0taF9Ns0 */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    BaseMailMessageListView.lambda$khmiiZewEE6tRZwBpaj0taF9Ns0(BaseMailMessageListView.this, this.f$1);
                }
            });
        }
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: c */
    public void mo154346c(C42099l lVar) {
        super.mo154346c(lVar);
        mo154458b(lVar, false, true);
        if (C41816b.m166115a().mo150143j()) {
            for (C42097j jVar : this.f109693a) {
                if (jVar.mo151964g().mo151550C()) {
                    Log.m165389i("BaseMailMessageListActivity", "BodyClipped length = " + (((float) jVar.mo151964g().mo151606h().length()) / 1024.0f) + " KB");
                }
            }
        }
        C42306q qVar = (C42306q) C42344d.m169092a(C42306q.class, getContext(), this.f109699g);
        if (qVar != null) {
            qVar.mo152436b(this.f109701i);
        }
    }

    /* renamed from: d */
    public void mo154466d(boolean z) {
        if (this.ae == null) {
            this.ae = new C43909a(this.f109706n);
        }
        if (z) {
            this.ae.mo156327a(this.f109706n.getString(R.string.Mail_ThreadAction_DeleteLoading));
        } else {
            this.ae.mo156326a();
        }
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43326m
    /* renamed from: a */
    public void mo154444a(final MailRecallDoneChange mailRecallDoneChange) {
        if (mailRecallDoneChange != null) {
            final String str = mailRecallDoneChange.message_id;
            Log.m165389i("BaseMailMessageListActivity", "onRecallDone | messageId = " + str);
            C43849u.m173826a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView.RunnableC431213 */

                public void run() {
                    if (BaseMailMessageListView.this.mo154349d(str) != null) {
                        C42330c.m169075d(mailRecallDoneChange.status.getValue() + "");
                        BaseMailMessageListView.this.mo154448a(str, mailRecallDoneChange.status.getValue(), "3", mailRecallDoneChange);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public void mo154460b(boolean z) {
        this.f109694b.mo152016a(z);
        if (!C42871i.m170779b()) {
            FlagButton flagButton = (FlagButton) this.f109695c.getButton("FLAG");
            if (this.f109694b.mo152023e()) {
                flagButton.updateIcon(R.drawable.ud_icon_flag_filled);
                flagButton.updateTint(R.color.mail_icon_unflag_tint);
                return;
            }
            flagButton.updateIcon(R.drawable.ud_icon_flag_outlined);
            flagButton.updateTint(R.color.mail_icon_flag_tint);
        } else if (this.f109694b.mo152023e()) {
            this.f109684N.setImageResource(R.drawable.ud_icon_flag_filled);
            this.f109684N.setColorFilter(getContext().getResources().getColor(R.color.lkui_Y500));
        } else {
            this.f109684N.setImageResource(R.drawable.ud_icon_flag_outlined);
            this.f109684N.setColorFilter(getContext().getResources().getColor(R.color.lkui_N600));
        }
    }

    /* renamed from: c */
    public void mo154463c(boolean z) {
        mo154302M();
        if (z) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f109699g);
            C42886a aVar = this.f109679I;
            C42886a.m170828a(arrayList, (String) null, this.f109700h);
            C42187a.m168512c(1, false, C42187a.C42191c.f107434K);
            return;
        }
        C43307b.m172030a().mo154977a(new NotSpamAction(this.f109699g, this.f109700h, "INBOX", true));
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: a */
    public void mo154314a(AbsChangeMailAction absChangeMailAction) {
        Log.m165389i("BaseMailMessageListActivity", "onMailActionChange : " + absChangeMailAction);
        if (absChangeMailAction instanceof SaveDraftAction) {
            mo154445a(((SaveDraftAction) absChangeMailAction).mo150354e());
            if (this.f109694b != null && this.f109694b.mo152021c() != null && this.f109694b.mo152021c() != PermissionCode.NONE) {
                ac();
            }
        } else if (absChangeMailAction instanceof SentMailAction) {
            Log.m165388i("Compose_sent_mail_action");
            mo154472l(((SentMailAction) absChangeMailAction).mo150245a());
            mo154441Z();
        } else if (absChangeMailAction instanceof DiscardDraftAction) {
            mo154472l(absChangeMailAction.mo150245a());
        } else if (absChangeMailAction instanceof ReadThreadListMailAction) {
            C42207i.m168607a(202105241, absChangeMailAction.mo150245a());
        } else if (absChangeMailAction instanceof PushThreadChangeAction) {
            Log.m165388i("new_mail_changelog1");
            PushThreadAction pushThreadAction = (PushThreadAction) absChangeMailAction;
            if (TextUtils.equals(pushThreadAction.mo150245a(), this.f109699g)) {
                Log.m165388i("new_mail_changelog2");
                if (pushThreadAction.mo150336g()) {
                    if (TextUtils.equals(pushThreadAction.mo150335f(), this.f109700h)) {
                        synchronized (this.ab) {
                            if (this.ab.size() > 0) {
                                Log.m165388i("changeAction hasDelete but has recalled msg, ignore.");
                                return;
                            }
                            Log.m165388i("changeAction hasDelete");
                            mo154302M();
                        }
                    }
                } else if (pushThreadAction.mo150334e() != null) {
                    if (mo154461b(this.f109694b.mo152018b(), pushThreadAction.mo150334e().mo151723r())) {
                        Log.m165389i("BaseMailMessageListActivity", "onMailActionChange label change");
                        mo154450a(pushThreadAction.mo150334e().mo151723r(), pushThreadAction.mo150334e().mo151725t());
                    }
                    mo154441Z();
                    if (pushThreadAction.mo150334e().mo151727v() != this.f109694b.mo152023e()) {
                        mo154460b(pushThreadAction.mo150334e().mo151727v());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo154445a(MailDraft mailDraft) {
        Log.m165389i("BaseMailMessageListActivity", "updateDraft");
        if (mailDraft == null) {
            Log.m165383e("BaseMailMessageListActivity", "updateDraft empty data");
            return;
        }
        String b = mo154457b(mailDraft);
        if (TextUtils.isEmpty(b)) {
            Log.m165383e("BaseMailMessageListActivity", "updateDraft empty replyMailId");
            return;
        }
        C42097j d = mo154349d(b);
        if (d != null) {
            Boolean b2 = C43350d.m172098a().mo155055u().mo5927b();
            if (b2 == null || b2.booleanValue()) {
                d.mo151961e();
                Log.m165388i("MailMessageListActivity_updateDraft: " + d.mo151950a().toString());
                d.mo151952a(mailDraft);
                mo154313a((ValueCallback<String>) null, "updateDraft", b, new C43071p(this.f109694b.mo152021c()).mo154251a(mailDraft));
                return;
            }
            Log.m165383e("BaseMailMessageListActivity", "updateDraft in none conversation ");
        }
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43317d
    /* renamed from: a */
    public void mo152676a(final MailLabelEntity mailLabelEntity, final boolean z) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView.AnonymousClass18 */

            public void run() {
                if (z && TextUtils.equals(BaseMailMessageListView.this.f109700h, mailLabelEntity.mo151527k()) && !TextUtils.isEmpty(BaseMailMessageListView.this.f109700h)) {
                    BaseMailMessageListView.this.mo154302M();
                } else if (BaseMailMessageListView.this.f109694b.mo152017a(mailLabelEntity, z)) {
                    BaseMailMessageListView baseMailMessageListView = BaseMailMessageListView.this;
                    baseMailMessageListView.mo154459b(baseMailMessageListView.f109694b.mo152018b(), BaseMailMessageListView.this.f109694b.mo152021c());
                }
            }
        });
    }

    public BaseMailMessageListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private void m171454a(C42097j jVar, final MailReplyCalendarEventRequest.Option option) {
        if (jVar != null && jVar.mo151964g().mo151549B() && !TextUtils.isEmpty(jVar.mo151964g().mo151548A().mo151249a())) {
            C42176e.m168344a().mo152202a(jVar.mo151964g().mo151548A().mo151249a(), option, new IGetDataCallback<MailReplyCalendarEventResponse>() {
                /* class com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView.C431308 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    MailToast.m173698a((int) R.string.Mail_Toast_ReplyFailed, MailToast.Type.FAIL);
                    C42209j.m168612a("read_calendar_reply_fail", "toast");
                }

                /* renamed from: a */
                public void onSuccess(MailReplyCalendarEventResponse mailReplyCalendarEventResponse) {
                    MailToast.m173698a((int) R.string.Mail_Toast_ReplySuccess, MailToast.Type.SUCCESS);
                    if (MailReplyCalendarEventRequest.Option.ACCEPT == option) {
                        C42187a.m168513c("acpt");
                    } else if (MailReplyCalendarEventRequest.Option.REJECT == option) {
                        C42187a.m168513c("decl");
                    } else if (MailReplyCalendarEventRequest.Option.TENTATIVE == option) {
                        C42187a.m168513c("mayb");
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final boolean mo154461b(List<MailLabelEntity> list, List<MailLabelEntity> list2) {
        if (list.size() != list2.size()) {
            return true;
        }
        for (MailLabelEntity mailLabelEntity : list) {
            if (!list2.contains(mailLabelEntity)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public Pair<C42097j, C42097j> mo154442a(List<C42097j> list, List<C42097j> list2) {
        C42097j jVar;
        if (!(list == null || list2 == null)) {
            ArrayList<C42097j> arrayList = new ArrayList(list);
            ArrayList arrayList2 = new ArrayList(list2);
            arrayList.removeAll(arrayList2);
            arrayList2.removeAll(arrayList);
            try {
                C42097j jVar2 = null;
                for (C42097j jVar3 : arrayList) {
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            jVar = null;
                            break;
                        }
                        jVar = (C42097j) it.next();
                        if (jVar3.mo151964g().mo151581b().equals(jVar.mo151964g().mo151581b())) {
                            if (jVar3.mo151957b() < jVar.mo151957b()) {
                                mo154472l(jVar.mo151959c());
                            } else if (jVar3.mo151957b() > jVar.mo151957b()) {
                                mo154445a(jVar3.mo151960d());
                            } else if (jVar3.mo151955a(jVar)) {
                                mo154445a(jVar3.mo151960d());
                            }
                            if (jVar3.mo151964g().mo151561N() != jVar.mo151964g().mo151561N()) {
                                mo154324a(jVar3.mo151964g().mo151581b(), jVar3.mo151964g());
                            }
                        }
                    }
                    if (jVar == null) {
                        jVar2 = jVar3;
                    } else {
                        arrayList2.remove(jVar);
                    }
                }
                return new Pair<>(jVar2, !arrayList2.isEmpty() ? (C42097j) arrayList2.get(0) : null);
            } catch (Exception e) {
                Log.m165388i("MailMessageListActivity_getDeltaMessageItem: " + e);
            }
        }
        return null;
    }

    /* renamed from: b */
    public void mo154459b(List<MailLabelEntity> list, PermissionCode permissionCode) {
        if (C42871i.m170779b()) {
            if (this.f109683M != null) {
                mo154369k();
            } else {
                C42871i.f109175g = true;
            }
        } else if (list.isEmpty()) {
            mo154313a((ValueCallback<String>) null, "updateLabels", "\n");
        } else {
            mo154313a((ValueCallback<String>) null, "updateLabels", new C43075r(this.f109694b).mo154257a(C43374f.m172256a(permissionCode, list, this.f109700h)));
        }
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: b */
    public void mo154340b(String str, JSONObject jSONObject) {
        String str2;
        String str3;
        String str4;
        String str5;
        if (TextUtils.isEmpty(str)) {
            Log.m165383e("BaseMailMessageListActivity", "onHandleJsCallback empty method");
            return;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1965476588:
                if (str.equals("clickFlag")) {
                    c = 0;
                    break;
                }
                break;
            case -1845523354:
                if (str.equals("acceptCalendar")) {
                    c = 1;
                    break;
                }
                break;
            case -1818312031:
                if (str.equals("smartReply")) {
                    c = 2;
                    break;
                }
                break;
            case -1806802443:
                if (str.equals("pendingCalendar")) {
                    c = 3;
                    break;
                }
                break;
            case -1335458389:
                if (str.equals("delete")) {
                    c = 4;
                    break;
                }
                break;
            case -1146825034:
                if (str.equals("deleteDraft")) {
                    c = 5;
                    break;
                }
                break;
            case -934922479:
                if (str.equals("recall")) {
                    c = 6;
                    break;
                }
                break;
            case -801900295:
                if (str.equals("clickDraft")) {
                    c = 7;
                    break;
                }
                break;
            case -795017652:
                if (str.equals("clickLabel")) {
                    c = '\b';
                    break;
                }
                break;
            case -677145915:
                if (str.equals("forward")) {
                    c = '\t';
                    break;
                }
                break;
            case -429650345:
                if (str.equals("replyAll")) {
                    c = '\n';
                    break;
                }
                break;
            case 16378738:
                if (str.equals("refuseCalendar")) {
                    c = 11;
                    break;
                }
                break;
            case 108401386:
                if (str.equals("reply")) {
                    c = '\f';
                    break;
                }
                break;
            case 583281361:
                if (str.equals("unsubscribe")) {
                    c = '\r';
                    break;
                }
                break;
            case 1654198564:
                if (str.equals("forwardtoim")) {
                    c = 14;
                    break;
                }
                break;
            case 1721188748:
                if (str.equals("showCalendarDetail")) {
                    c = 15;
                    break;
                }
                break;
            case 1872358082:
                if (str.equals("recallDetail")) {
                    c = 16;
                    break;
                }
                break;
        }
        String str6 = null;
        switch (c) {
            case 0:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (this.f109694b.mo152023e()) {
                    arrayList2.add("FLAGGED");
                    this.f109694b.mo152016a(false);
                } else {
                    arrayList.add("FLAGGED");
                    this.f109694b.mo152016a(true);
                    C42187a.m168535g(C42187a.C42191c.f107434K);
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(this.f109699g);
                Log.m165389i("BaseMailMessageListActivity", "CLICK_FLAG curLabelID:" + this.f109700h);
                C43307b.m172030a().mo154977a(new CustomLabelThreadListMailAction(arrayList3, this.f109700h, arrayList, arrayList2));
                return;
            case 1:
                m171454a(mo154343c(jSONObject), MailReplyCalendarEventRequest.Option.ACCEPT);
                return;
            case 2:
                Log.m165389i("BaseMailMessageListActivity", "onHandleJsCallback SMART_REPLY_CLICK");
                if (jSONObject != null) {
                    String optString = jSONObject.optString("content");
                    int optInt = jSONObject.optInt("index");
                    if (!(TextUtils.isEmpty(optString) || CollectionUtils.isEmpty(this.f109693a) || CollectionUtils.isEmpty(this.aa))) {
                        mo154443a(this.aa.get(optInt).id.intValue(), optString, ((C42097j) this.f109693a.get(this.f109693a.size() - 1)).mo151964g());
                        return;
                    }
                    return;
                }
                return;
            case 3:
                m171454a(mo154343c(jSONObject), MailReplyCalendarEventRequest.Option.TENTATIVE);
                return;
            case 4:
                if (!C43764g.m173482b("BaseMailMessageListActivity" + str)) {
                    C42097j c2 = mo154343c(jSONObject);
                    C42187a.m168486a(this.f109699g, c2.mo151964g().mo151581b(), C42187a.C42191c.f107466q, C43374f.m172261b(this.f109700h));
                    m171457e(c2);
                    return;
                }
                return;
            case 5:
                if (!C43764g.m173482b("BaseMailMessageListActivity" + str)) {
                    m171456d(jSONObject);
                    return;
                }
                return;
            case 6:
                if (!C43764g.m173482b("BaseMailMessageListActivity" + str)) {
                    Log.m165389i("BaseMailMessageListActivity", "onHandleJsCallback RECALL_CLICK");
                    final C42097j c3 = mo154343c(jSONObject);
                    if (System.currentTimeMillis() - c3.mo151964g().mo151615o() > 86400000) {
                        C25707a newGlobal = LKUIToast.newGlobal(getContext(), (int) R.drawable.ud_icon_error_colorful, C43819s.m173684a((int) R.string.Mail_Recall_FailTimeout));
                        newGlobal.mo90190b(0);
                        newGlobal.mo90191c();
                        C42209j.m168612a("recall_mail_fail_timeout", "toast");
                        return;
                    }
                    C43771m.m173502a(getContext(), (int) R.string.Mail_Recall_ConfirmRecallAction, (int) R.string.Mail_Recall_ConfirmTitle, (int) R.string.Mail_Alert_Cancel, (int) R.color.text_title, (int) R.string.Mail_Alert_OK, (int) R.color.primary_pri_500, (DialogInterface.OnClickListener) null, new DialogInterface.OnClickListener() {
                        /* class com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView.AnonymousClass17 */

                        public void onClick(DialogInterface dialogInterface, int i) {
                            if (c3 != null) {
                                C42984a.m171086a().mo154137a(BaseMailMessageListView.this.getContext(), c3);
                            }
                        }
                    }).mo89239c();
                    C42330c.m169064b(C42330c.C42333b.f107673z);
                    return;
                }
                return;
            case 7:
                if (!C43764g.m173482b("BaseMailMessageListActivity" + str)) {
                    String optString2 = jSONObject.optString("draftId");
                    MailDraft a = mo150846a(optString2);
                    if (!(mo154471k(optString2) == null || a == null)) {
                        mo154316a(a, "message_item", "open_draft");
                        return;
                    }
                    return;
                }
                return;
            case '\b':
                ArrayList arrayList4 = new ArrayList();
                for (MailLabelEntity mailLabelEntity : this.f109694b.mo152018b()) {
                    arrayList4.add(mailLabelEntity.mo151527k());
                }
                mo154437V();
                return;
            case '\t':
                if (!C43764g.m173482b("BaseMailMessageListActivity" + str)) {
                    boolean optBoolean = jSONObject.optBoolean("isFromFootBtn");
                    C42097j c4 = mo154343c(jSONObject);
                    MailMessage g = c4.mo151964g();
                    String c5 = c4.mo151959c();
                    if (optBoolean) {
                        str2 = "message_quick_action_forward";
                    } else {
                        str2 = "message_action_forward";
                    }
                    mo154345c(g, c5, str2);
                    C42187a.m168515c(this.f109699g, c4.mo151964g().mo151581b(), c4.mo151959c());
                    return;
                }
                return;
            case '\n':
                if (!C43764g.m173482b("BaseMailMessageListActivity" + str)) {
                    boolean optBoolean2 = jSONObject.optBoolean("isFromFootBtn");
                    C42097j c6 = mo154343c(jSONObject);
                    MailMessage g2 = c6.mo151964g();
                    String c7 = c6.mo151959c();
                    if (optBoolean2) {
                        str3 = "message_quick_action_reply_all";
                    } else {
                        str3 = "message_action_reply_all";
                    }
                    mo154335b(g2, c7, str3);
                    C42187a.m168505b(this.f109699g, c6.mo151964g().mo151581b(), c6.mo151959c());
                    return;
                }
                return;
            case 11:
                m171454a(mo154343c(jSONObject), MailReplyCalendarEventRequest.Option.REJECT);
                return;
            case HwBuildEx.VersionCodes.EMUI_5_1:
                if (!C43764g.m173482b("BaseMailMessageListActivity" + str)) {
                    boolean optBoolean3 = jSONObject.optBoolean("isFromFootBtn");
                    C42097j c8 = mo154343c(jSONObject);
                    MailMessage g3 = c8.mo151964g();
                    String c9 = c8.mo151959c();
                    if (optBoolean3) {
                        str4 = "message_quick_action_reply";
                    } else {
                        str4 = "message_action_reply";
                    }
                    mo154318a(g3, c9, str4);
                    C42187a.m168485a(this.f109699g, c8.mo151964g().mo151581b(), c8.mo151959c());
                    return;
                }
                return;
            case '\r':
                Log.m165389i("BaseMailMessageListActivity", "onHandleJsCallback UNSUBSCRIBE: " + jSONObject);
                if (jSONObject != null) {
                    str6 = jSONObject.optString("messageID");
                }
                C42097j d = mo154349d(str6);
                if (d == null) {
                    Log.m165383e("BaseMailMessageListActivity", "UNSUBSCRIBE no matched message");
                    return;
                }
                C42187a.m168531f(this.f109699g, str6);
                C42936a.m170979a(getContext(), d.mo151964g());
                return;
            case 14:
                if (!C43764g.m173482b("BaseMailMessageListActivity" + str)) {
                    Log.m165389i("BaseMailMessageListActivity", "onHandleJsCallback FORWARD_TO_CHAT");
                    if (jSONObject != null) {
                        str6 = jSONObject.optString("messageId");
                    }
                    C42097j d2 = mo154349d(str6);
                    if (d2 == null) {
                        Log.m165383e("BaseMailMessageListActivity", "FORWARD_TO_CHAT no matched message");
                        return;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(str6);
                    Activity activity = this.f109706n;
                    String a2 = this.f109694b.mo152010a();
                    if (d2.mo151964g() == null) {
                        str5 = "";
                    } else {
                        str5 = d2.mo151964g().mo151604g();
                    }
                    C42699a.m170238a(activity, a2, arrayList5, str5);
                    C42187a.m168549k(C42187a.C42191c.f107437N);
                    return;
                }
                return;
            case 15:
                C42097j c10 = mo154343c(jSONObject);
                if (c10 != null && c10.mo151964g().mo151549B()) {
                    MailCalendar A = c10.mo151964g().mo151548A();
                    if (!(A.mo151275h() == null && A.mo151284q() == null)) {
                        C42699a.m170235a(this.f109706n, A.mo151262c(), A.mo151258b(), A.mo151265d());
                        return;
                    }
                    return;
                }
                return;
            case 16:
                C42699a.m170295n(getContext(), mo154343c(jSONObject).mo151964g().mo151581b());
                return;
            default:
                Log.m165383e("BaseMailMessageListActivity", "onHandleJsCallback switch to default");
                return;
        }
    }

    /* renamed from: b */
    public void mo154458b(C42099l lVar, boolean z, boolean z2) {
        Log.m165389i("BaseMailMessageListActivity", "initMailThreadInfo from net :" + z + " data from thread list :" + z2);
        List<MailDraft> b = lVar.mo151979b();
        if (CollectionUtils.isEmpty(lVar.mo151973a()) && !CollectionUtils.isEmpty(b)) {
            mo154337b(lVar);
        } else if (this.f109705m != null) {
            mo154319a(lVar);
            if (z || !CollectionUtils.isEmpty(lVar.mo151973a())) {
                if (!z2) {
                    mo154320a(lVar, z, z2);
                }
                this.f109701i = lVar.mo151992i();
                if (this.f109674D != null) {
                    this.f109674D.onSuccess(lVar);
                    return;
                }
                return;
            }
            mo154436U();
        }
    }

    /* renamed from: a */
    public void mo154446a(MailThread mailThread, String str, String str2) {
        Log.m165388i("updateUIByRefreshData1");
        if (TextUtils.equals(str2, this.f109699g)) {
            Log.m165388i("updateUIByRefreshData2");
            if (mailThread == null || TextUtils.isEmpty(mailThread.mo151676a())) {
                if (TextUtils.equals(str, this.f109700h)) {
                    mo154302M();
                }
            } else if (mailThread != null) {
                long b = mailThread.mo151686b();
                if (b > 0 && b != ((long) getMessageCount())) {
                    Log.m165389i("BaseMailMessageListActivity", "updateUIByRefreshData message change");
                    mo154441Z();
                } else if (mo154461b(this.f109694b.mo152018b(), mailThread.mo151723r())) {
                    Log.m165389i("BaseMailMessageListActivity", "updateUIByRefreshData label change");
                    if (mailThread.mo151727v() != this.f109694b.mo152023e()) {
                        this.f109694b.mo152016a(mailThread.mo151727v());
                        mo154460b(this.f109694b.mo152023e());
                    }
                    boolean c = mo154549c(this.f109694b.mo152018b());
                    boolean c2 = mo154549c(mailThread.mo151723r());
                    mo154450a(mailThread.mo151723r(), mailThread.mo151725t());
                    if ((c && !c2) || (!c && c2)) {
                        mo154441Z();
                    }
                } else if (mo154549c(mailThread.mo151723r())) {
                    Log.m165389i("BaseMailMessageListActivity", "onMailActionChange draft change");
                    mo154441Z();
                }
            }
        }
    }
}
