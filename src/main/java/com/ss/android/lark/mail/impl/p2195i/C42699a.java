package com.ss.android.lark.mail.impl.p2195i;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.lark.pb.email.client.v1.MailCreateDraftRequest;
import com.bytedance.lark.pb.email.client.v1.MailGetOAuthURLResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetThreadCollaboratorsInfoResponse;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.al;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.AbstractC41849c;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.action.ChatToDraftMailAction;
import com.ss.android.lark.mail.impl.action.ComposeMailAction;
import com.ss.android.lark.mail.impl.action.DraftMailAction;
import com.ss.android.lark.mail.impl.action.ForwardMailAction;
import com.ss.android.lark.mail.impl.action.NewMailAction;
import com.ss.android.lark.mail.impl.action.OpenDraftByMessageMailAction;
import com.ss.android.lark.mail.impl.action.ReplyAllMailAction;
import com.ss.android.lark.mail.impl.action.ReplyMailAction;
import com.ss.android.lark.mail.impl.client.AbstractC41895c;
import com.ss.android.lark.mail.impl.client.MigrationActivity;
import com.ss.android.lark.mail.impl.compose.ComposeMailActivity;
import com.ss.android.lark.mail.impl.entity.C42087a;
import com.ss.android.lark.mail.impl.entity.C42088b;
import com.ss.android.lark.mail.impl.entity.C42099l;
import com.ss.android.lark.mail.impl.entity.CreateDraft;
import com.ss.android.lark.mail.impl.entity.DriveFile;
import com.ss.android.lark.mail.impl.entity.DriveFileOperationMask;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.entity.MailAttachment;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.entity.MailEntSignature;
import com.ss.android.lark.mail.impl.entity.MailImage;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.entity.SearchRet;
import com.ss.android.lark.mail.impl.home.C42543h;
import com.ss.android.lark.mail.impl.home.aggregation.MailAggregationManageActivity;
import com.ss.android.lark.mail.impl.home.aggregation.folder.FolderEditActivity;
import com.ss.android.lark.mail.impl.home.aggregation.folder.FolderMoveToActivity;
import com.ss.android.lark.mail.impl.home.aggregation.folder.FolderSelectLocationActivity;
import com.ss.android.lark.mail.impl.home.aggregation.label.LabelEditActivity;
import com.ss.android.lark.mail.impl.home.aggregation.label.LabelMoveToActivity;
import com.ss.android.lark.mail.impl.home.aggregation.label.LabelMultiSelectActivity;
import com.ss.android.lark.mail.impl.home.aggregation.label.LabelSelectLocationActivity;
import com.ss.android.lark.mail.impl.message.file.ShareDriveFileInvisibleActivity;
import com.ss.android.lark.mail.impl.message.framework.MessageListActivity;
import com.ss.android.lark.mail.impl.message.framework.tabcontainer.MessageListTabActivity;
import com.ss.android.lark.mail.impl.message.p2204d.AbstractC42870h;
import com.ss.android.lark.mail.impl.message.p2204d.C42871i;
import com.ss.android.lark.mail.impl.message.p2204d.C42879j;
import com.ss.android.lark.mail.impl.message.pageroute.intantinfo.ForwardToChatMessageListIntentInfo;
import com.ss.android.lark.mail.impl.message.pageroute.intantinfo.MessageListIntenInfo;
import com.ss.android.lark.mail.impl.message.pageroute.intantinfo.SearchMessageListIntentInfo;
import com.ss.android.lark.mail.impl.message.recall.sender.detail.RecallDetailActivity;
import com.ss.android.lark.mail.impl.message.send.state.SendStatusDetailActivity;
import com.ss.android.lark.mail.impl.p2168g.C42107a;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.C42226b;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42272g;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.search.SearchActivity;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.service.C43345c;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.settings.mainpage.MailSettingActivity;
import com.ss.android.lark.mail.impl.settings.subsetting.accountdetail.AccountDetailSettingActivity;
import com.ss.android.lark.mail.impl.settings.subsetting.autoreply.AutoReplyActivity;
import com.ss.android.lark.mail.impl.settings.subsetting.autoreply.EditAutoReplyActivity;
import com.ss.android.lark.mail.impl.settings.subsetting.conversationmode.ConversationModeActivity;
import com.ss.android.lark.mail.impl.settings.subsetting.notification.NotificationActivity;
import com.ss.android.lark.mail.impl.settings.subsetting.notification.OldNotificationActivity;
import com.ss.android.lark.mail.impl.settings.subsetting.replylanguage.ReplyLanguageActivity;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.EditSignatureActivity;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.EntSignatureActivity;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.SelectEntSignatureActivity;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.SignatureActivity;
import com.ss.android.lark.mail.impl.settings.subsetting.undo.SendUndoActivity;
import com.ss.android.lark.mail.impl.share.ShareActivity;
import com.ss.android.lark.mail.impl.share.collaborate.CollaborateActivity;
import com.ss.android.lark.mail.impl.utils.C43783o;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.C43860w;
import com.ss.android.lark.mail.impl.utils.recipient.C43800a;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.permission.rxPermission.C51331a;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.mail.impl.i.a */
public class C42699a {

    /* renamed from: a */
    private static final String[] f108664a = {"android.permission.READ_EXTERNAL_STORAGE"};

    /* renamed from: b */
    public static boolean m170268b() {
        return true;
    }

    /* renamed from: a */
    public static void m170227a(Context context, MailMessage mailMessage, MailDraft mailDraft, ComposeMailAction composeMailAction, PermissionCode permissionCode, String str, String str2) {
        Log.m165389i("NavigationUtils", "gotoCompose");
        MailDraft a = composeMailAction.mo150260a(mailMessage, mailDraft);
        C42107a.m168074a().mo152035b(a.mo151321a(), a);
        m170219a(context, composeMailAction, permissionCode, str, str2);
        C42330c.m169077e(str2);
    }

    /* renamed from: a */
    public static void m170219a(Context context, ComposeMailAction composeMailAction, PermissionCode permissionCode, String str, String str2) {
        Intent intent = new Intent(context, ComposeMailActivity.class);
        intent.putExtra("scene_type", str2);
        if ("external_mail_to".equals(str2)) {
            intent.setFlags(603979776);
        }
        m170218a(context, composeMailAction, permissionCode, str, intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m170249a(Intent intent, Context context, ComposeMailAction composeMailAction, PermissionCode permissionCode, String str) {
        if (C43345c.m172076m().mo155004j()) {
            Log.m165389i("NavigationUtils", "gotoCompose but the compose page is running");
            if (intent == null || !"external_mail_to".equals(intent.getStringExtra("scene_type"))) {
                return;
            }
        }
        if (intent == null) {
            intent = new Intent(context, ComposeMailActivity.class);
        }
        intent.putExtra("mail_action_key", composeMailAction);
        intent.putExtra("share_permission_code", permissionCode);
        boolean z = context instanceof Activity;
        if (!z) {
            intent.addFlags(268435456);
        }
        intent.putExtra("chat_id", str);
        intent.putExtra(ShareHitPoint.f121868c, composeMailAction.mo150261e());
        if (composeMailAction instanceof ChatToDraftMailAction) {
            intent.addFlags(67108864);
        }
        if (!z) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m170223a(Context context, MailDraft mailDraft, PermissionCode permissionCode, String str, String str2) {
        m170221a(context, mailDraft, permissionCode, str, new DraftMailAction(mailDraft.mo151321a(), str2));
    }

    /* renamed from: a */
    public static void m170224a(Context context, MailDraft mailDraft, PermissionCode permissionCode, String str, String str2, String str3) {
        m170222a(context, mailDraft, permissionCode, str, new DraftMailAction(mailDraft.mo151321a(), str2), str3);
    }

    /* renamed from: a */
    public static void m170221a(Context context, MailDraft mailDraft, PermissionCode permissionCode, String str, DraftMailAction draftMailAction) {
        m170222a(context, mailDraft, permissionCode, str, draftMailAction, "open_draft");
    }

    /* renamed from: a */
    public static void m170222a(Context context, MailDraft mailDraft, PermissionCode permissionCode, String str, DraftMailAction draftMailAction, String str2) {
        C42226b.m168638a().mo152308a("mail_dev_draft_cost_time");
        C42107a.m168074a().mo152035b(mailDraft.mo151321a(), mailDraft);
        m170219a(context, draftMailAction, permissionCode, str, str2);
        C42330c.m169077e(str2);
    }

    /* renamed from: a */
    public static void m170226a(Context context, MailMessage mailMessage, MailDraft mailDraft, PermissionCode permissionCode, String str, String str2) {
        m170223a(context, new DraftMailAction(mailDraft.mo151321a(), str2).mo150260a(mailMessage, mailDraft), permissionCode, str, str2);
    }

    /* renamed from: a */
    public static void m170247a(final Context context, final boolean z) {
        C42226b.m168638a().mo152308a(C42226b.C42229b.f107485a);
        C42272g.m168835a(System.currentTimeMillis());
        C42176e.m168344a().mo152195a(new CreateDraft.C42054a().mo151085a("").mo151087b("").mo151083a(MailCreateDraftRequest.CreateDraftAction.COMPOSE.getValue()).mo151086a(), new IGetDataCallback<MailDraft>() {
            /* class com.ss.android.lark.mail.impl.p2195i.C42699a.C427001 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("NavigationUtils", "gotoNewCompose onError");
                C42699a.m170232a(context, "compose");
            }

            /* renamed from: a */
            public void onSuccess(MailDraft mailDraft) {
                C42226b.m168638a().mo152308a("mail_dev_send_page_cost_time");
                C42107a.m168074a().mo152035b(mailDraft.mo151321a(), mailDraft);
                C42699a.m170218a(context, new NewMailAction(mailDraft.mo151321a(), "compose_button"), PermissionCode.NONE, (String) null, (Intent) null);
                if (z) {
                    C42187a.m168479a(mailDraft.mo151321a());
                }
                C42330c.m169077e(C42330c.C42335d.f107685a);
            }
        });
    }

    /* renamed from: a */
    public static void m170251a(final MailThread mailThread, final Context context) {
        Log.m165389i("NavigationUtils", "gotoComposeDraft start");
        final String q = C43374f.m172264f().mo155129q();
        C42176e.m168344a().mo152213a(mailThread.mo151676a(), new ArrayList<>(), q, new IGetDataCallback<C42099l>() {
            /* class com.ss.android.lark.mail.impl.p2195i.C42699a.AnonymousClass10 */

            /* renamed from: a */
            public void onSuccess(C42099l lVar) {
                Log.m165389i("NavigationUtils", "gotoComposeDraft onSuccess");
                if (CollectionUtils.isEmpty(lVar.mo151979b())) {
                    Log.m165389i("NavigationUtils", "gotoComposeDraft onSuccess toNet");
                    C42699a.m170252a(mailThread, q, context);
                    return;
                }
                C42699a.m170253a(lVar, context);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("NavigationUtils", "gotoComposeDraft onError:" + errorResult.getMessage());
                C42699a.m170252a(mailThread, q, context);
            }
        });
    }

    /* renamed from: a */
    public static void m170252a(MailThread mailThread, String str, final Context context) {
        Log.m165389i("NavigationUtils", "gotoComposeDraft requestMessageListDataFromNet");
        C42176e.m168345b(mailThread.mo151676a(), new ArrayList(), str, new IGetDataCallback<C42099l>() {
            /* class com.ss.android.lark.mail.impl.p2195i.C42699a.AnonymousClass11 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("NavigationUtils", "gotoComposeDraft requestMessageListDataFromNet onError");
            }

            /* renamed from: a */
            public void onSuccess(C42099l lVar) {
                Log.m165389i("NavigationUtils", "gotoComposeDraft requestMessageListDataFromNet onSuccess");
                C42699a.m170253a(lVar, context);
            }
        });
    }

    /* renamed from: a */
    public static void m170253a(C42099l lVar, Context context) {
        Log.m165389i("NavigationUtils", "gotoComposeDraft doOpenComposeDraft 11 ");
        List<MailDraft> b = lVar.mo151979b();
        if (b != null && !b.isEmpty()) {
            Log.m165389i("NavigationUtils", "gotoComposeDraft doOpenComposeDraft 22 ");
            C42226b.m168638a().mo152308a(C42226b.C42229b.f107485a);
            m170223a(context, b.get(0), lVar.mo151988e(), (String) null, "inbox_draft");
        }
    }

    /* renamed from: a */
    public static void m170232a(Context context, String str) {
        ((C42272g) C42344d.m169091a(C42272g.class, context)).mo152374a(str, "normal");
        ((C42272g) C42344d.m169091a(C42272g.class, context)).mo152372a("rust_fail", 0);
    }

    /* renamed from: a */
    public static void m170220a(final Context context, final MailAddress mailAddress, final String str) {
        C42226b.m168638a().mo152308a(C42226b.C42229b.f107485a);
        C42272g.m168835a(System.currentTimeMillis());
        C42176e.m168344a().mo152195a(new CreateDraft.C42054a().mo151085a("").mo151087b("").mo151083a(MailCreateDraftRequest.CreateDraftAction.COMPOSE.getValue()).mo151086a(), new IGetDataCallback<MailDraft>() {
            /* class com.ss.android.lark.mail.impl.p2195i.C42699a.AnonymousClass12 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("NavigationUtils", "gotoReplyAddress onError");
                C42699a.m170232a(context, "mail_to");
            }

            /* renamed from: a */
            public void onSuccess(MailDraft mailDraft) {
                C42226b.m168638a().mo152308a("mail_dev_send_page_cost_time");
                MailAddress mailAddress = mailAddress;
                if (mailAddress != null && mailAddress.mo151185g()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(mailAddress);
                    mailDraft.mo151328a(arrayList);
                }
                C42107a.m168074a().mo152035b(mailDraft.mo151321a(), mailDraft);
                C42699a.m170219a(context, new ReplyMailAction(mailDraft.mo151321a(), str), PermissionCode.NONE, (String) null, "mail_to");
                C42330c.m169077e(C42330c.C42335d.f107693i);
            }
        });
    }

    /* renamed from: a */
    public static void m170239a(final Context context, final String str, Map<String, String> map) {
        C43783o oVar;
        C42226b.m168638a().mo152308a(C42226b.C42229b.f107485a);
        final Uri parse = Uri.parse(str);
        final boolean z = map != null && map.containsKey(C41816b.m166115a().mo150151r());
        if (m170256a()) {
            Intent intent = new Intent();
            if (C43783o.m173519a(parse)) {
                oVar = C43783o.m173520b(parse);
            } else {
                oVar = C43783o.m173520b(Uri.parse("mailto:" + str));
            }
            if (oVar != null && oVar.mo155944a() != null) {
                intent.putExtra("android.intent.extra.EMAIL", oVar.mo155945b());
                m170274c(context, intent);
                return;
            }
            return;
        }
        C42272g.m168835a(System.currentTimeMillis());
        C42176e.m168344a().mo152195a(new CreateDraft.C42054a().mo151085a("").mo151087b("").mo151083a(MailCreateDraftRequest.CreateDraftAction.COMPOSE.getValue()).mo151086a(), new IGetDataCallback<MailDraft>() {
            /* class com.ss.android.lark.mail.impl.p2195i.C42699a.AnonymousClass14 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("NavigationUtils", "gotoNewCompose onError");
                if (!z || !C42699a.m170256a()) {
                    C42699a.m170232a(context, "mail_to");
                } else {
                    C41816b.m166115a().mo150113C().mo150177a();
                }
            }

            /* renamed from: a */
            public void onSuccess(MailDraft mailDraft) {
                C43783o oVar;
                C42226b.m168638a().mo152308a("mail_dev_send_page_cost_time");
                if (C43783o.m173519a(parse)) {
                    oVar = C43783o.m173520b(parse);
                } else {
                    oVar = C43783o.m173520b(Uri.parse("mailto:" + str));
                }
                if (oVar != null) {
                    mailDraft.mo151326a(oVar);
                    C42699a.m170225a(context, mailDraft, z);
                }
                C42330c.m169077e(C42330c.C42335d.f107693i);
            }
        });
    }

    /* renamed from: a */
    public static boolean m170256a() {
        C42087a m = C43277a.m171921a().mo154949m();
        return !C41816b.m166115a().mo150148o() || m == null || m.f107030g != 0;
    }

    /* renamed from: a */
    public static void m170225a(final Context context, final MailDraft mailDraft, final boolean z) {
        C43800a.m173635a().mo156046a(mailDraft.mo151339d(), new IGetDataCallback<List<MailAddress>>() {
            /* class com.ss.android.lark.mail.impl.p2195i.C42699a.AnonymousClass15 */

            /* renamed from: a */
            public void onSuccess(List<MailAddress> list) {
                String str;
                if (list != null && !list.isEmpty()) {
                    mailDraft.mo151328a(list);
                }
                C42107a.m168074a().mo152035b(mailDraft.mo151321a(), mailDraft);
                Context context = context;
                ReplyMailAction replyMailAction = new ReplyMailAction(mailDraft.mo151321a(), "");
                PermissionCode permissionCode = PermissionCode.NONE;
                if (z) {
                    str = "external_mail_to";
                } else {
                    str = "mail_to";
                }
                C42699a.m170219a(context, replyMailAction, permissionCode, (String) null, str);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                String str;
                C42107a.m168074a().mo152035b(mailDraft.mo151321a(), mailDraft);
                Context context = context;
                ReplyMailAction replyMailAction = new ReplyMailAction(mailDraft.mo151321a(), "");
                PermissionCode permissionCode = PermissionCode.NONE;
                if (z) {
                    str = "external_mail_to";
                } else {
                    str = "mail_to";
                }
                C42699a.m170219a(context, replyMailAction, permissionCode, (String) null, str);
            }
        });
    }

    /* renamed from: a */
    public static void m170229a(final Context context, final MailMessage mailMessage, final String str, final String str2, final String str3) {
        C42226b.m168638a().mo152308a(C42226b.C42229b.f107485a);
        C42272g.m168835a(System.currentTimeMillis());
        final String G = mailMessage.mo151554G();
        C42176e.m168344a().mo152195a(new CreateDraft.C42054a().mo151085a(mailMessage.mo151627z()).mo151087b(mailMessage.mo151581b()).mo151084a(mailMessage.mo151615o()).mo151083a(MailCreateDraftRequest.CreateDraftAction.REPLY.getValue()).mo151089d(G).mo151086a(), new IGetDataCallback<MailDraft>() {
            /* class com.ss.android.lark.mail.impl.p2195i.C42699a.AnonymousClass16 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("NavigationUtils", "gotoReplyView onError");
                C42699a.m170232a(context, "reply");
            }

            /* renamed from: a */
            public void onSuccess(MailDraft mailDraft) {
                mailDraft.mo151353h(G);
                if (TextUtils.equals(mailDraft.mo151321a(), str)) {
                    C42699a.m170226a(context, mailMessage, mailDraft, PermissionCode.fromValue(mailDraft.mo151317B()), str2, str3);
                    return;
                }
                C42226b.m168638a().mo152308a("mail_dev_replay_in_detail_cost_time");
                C42699a.m170227a(context, mailMessage, mailDraft, new ReplyMailAction(mailDraft.mo151321a(), str3), PermissionCode.fromValue(mailDraft.mo151317B()), str2, "reply");
            }
        });
    }

    /* renamed from: a */
    public static void m170228a(Context context, MailMessage mailMessage, String str) {
        C42226b.m168638a().mo152308a(C42226b.C42229b.f107485a);
        C42226b.m168638a().mo152308a("mail_dev_forward_in_detail_cost_time");
        m170227a(context, mailMessage, new MailDraft(), new OpenDraftByMessageMailAction(mailMessage.mo151581b(), str), PermissionCode.NONE, (String) null, "open_draft");
    }

    /* renamed from: a */
    public static void m170237a(Context context, String str, String str2, String str3, boolean z) {
        Log.m165389i("NavigationUtils", "gotoThreadViewFromNotify threadID: " + str);
        if (!C42871i.m170783d() || z) {
            MessageListIntenInfo messageListIntenInfo = new MessageListIntenInfo(str3, str, str2, 1, "");
            messageListIntenInfo.mo154049b(true);
            Intent a = m170210a(context);
            Bundle bundle = new Bundle();
            bundle.putParcelable("key_thread", messageListIntenInfo);
            bundle.putInt("key_serve_creator_type", 9);
            bundle.putString("come_from", "come_from_notification");
            a.putExtras(bundle);
            context.startActivity(a);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new MessageListIntenInfo(str3, str, str2, 1, ""));
            context.startActivity(m170260b(context, 0, arrayList, 1, "come_from_notification", ""));
        }
        C42187a.m168539h("notification");
    }

    /* renamed from: a */
    public static void m170245a(Context context, ArrayList<String> arrayList, String str) {
        Intent intent = new Intent(context, LabelMoveToActivity.class);
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("select_thread_list", arrayList);
        bundle.putString("from_label_id", str);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m170246a(Context context, List<MailThread> list, String str) {
        Intent intent = new Intent(context, LabelMultiSelectActivity.class);
        C42107a.m168074a().mo152033a("select_threads", list);
        intent.putExtra("from_label_id", str);
        ((Activity) context).startActivityForResult(intent, 1);
    }

    /* renamed from: a */
    public static void m170250a(MailAttachment mailAttachment, String str) {
        C41816b.m166115a().mo150159z().mo150172a(mailAttachment, str);
    }

    /* renamed from: a */
    public static void m170242a(Context context, String str, boolean z, String str2, String str3, String str4, ArrayList<MailEntSignature> arrayList) {
        Intent intent = new Intent(context, SelectEntSignatureActivity.class);
        intent.putExtra("t_a_id", str).putExtra("isNew", z).putExtra("address", str2).putExtra("fixedId", str3).putExtra("currentId", str4).putParcelableArrayListExtra("signatureList", arrayList);
        ((Activity) context).startActivityForResult(intent, 0);
    }

    /* renamed from: a */
    public static void m170235a(Context context, String str, String str2, long j) {
        C41816b.m166115a().mo150125a(context, str, str2, j);
    }

    /* renamed from: a */
    public static boolean m170259a(String str, String str2, DriveFileOperationMask driveFileOperationMask, AbstractC41849c.AbstractC41850a aVar) {
        Log.m165389i("NavigationUtils", "viewFileByDrive");
        if (TextUtils.isEmpty(str)) {
            Log.m165383e("NavigationUtils", "viewFileByDrive invalid data");
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("mountPoint", "email");
        hashMap.put("mountNodeToken", "");
        hashMap.put("bussinessId", "mail");
        DriveFile driveFile = new DriveFile();
        driveFile.mo151094b(str2);
        driveFile.mo151092a(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(driveFile);
        if (driveFileOperationMask != null) {
            driveFileOperationMask.mo151101a(2);
        }
        return C41816b.m166115a().mo150131a(str, arrayList, driveFileOperationMask, hashMap, aVar);
    }

    /* renamed from: a */
    public static boolean m170257a(MailImage mailImage, ArrayList<MailImage> arrayList, DriveFileOperationMask driveFileOperationMask, AbstractC41849c.AbstractC41850a aVar) {
        Log.m165389i("NavigationUtils", "viewMultiImagesByDrive");
        if (CollectionUtils.isEmpty(arrayList)) {
            Log.m165383e("NavigationUtils", "viewMultiImagesByDrive invalid data");
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bussinessId", "mail");
        String f = mailImage != null ? mailImage.mo151480f() : "";
        ArrayList arrayList2 = new ArrayList();
        Iterator<MailImage> it = arrayList.iterator();
        while (it.hasNext()) {
            MailImage next = it.next();
            if (next != null && !TextUtils.isEmpty(next.mo151480f())) {
                DriveFile driveFile = new DriveFile();
                driveFile.mo151092a(next.mo151480f());
                driveFile.mo151094b(next.mo151477e());
                arrayList2.add(driveFile);
            }
        }
        if (driveFileOperationMask != null) {
            driveFileOperationMask.mo151101a(4);
        }
        return C41816b.m166115a().mo150131a(f, arrayList2, driveFileOperationMask, hashMap, aVar);
    }

    /* renamed from: a */
    public static void m170238a(Context context, String str, ArrayList<String> arrayList, String str2) {
        Log.m165389i("NavigationUtils", "sendToChat");
        Bundle bundle = new Bundle();
        bundle.putString("thread_id", str);
        bundle.putStringArrayList("intent_key_message_id_list", arrayList);
        C41816b.m166115a().mo150122a(context, 2890, bundle, R.drawable.mail_share_icon, str2);
    }

    /* renamed from: a */
    public static void m170233a(Context context, String str, PermissionCode permissionCode) {
        Log.m165389i("NavigationUtils", "collaborate");
        Intent intent = new Intent(context, ShareActivity.class);
        intent.putExtra("thread_id", str);
        intent.putExtra("share_permission_code", permissionCode);
        intent.putExtra("intent_key_share_mode", ShareActivity.Mode.Collaborate);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m170240a(final Context context, final String str, final boolean z) {
        Log.m165389i("NavigationUtils", "openShareMessageListActivity");
        if (TextUtils.isEmpty(str)) {
            Log.m165383e("NavigationUtils", "openShareMessageListActivity empty thread id");
        } else {
            C42176e.m168344a().mo152260i(str, new IGetDataCallback<MailGetThreadCollaboratorsInfoResponse>() {
                /* class com.ss.android.lark.mail.impl.p2195i.C42699a.C427023 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("NavigationUtils", "openShareMessageListActivity fetchCollaboratorList onError");
                    MailToast.m173697a((int) R.string.Mail_Share_CancelSharing);
                }

                /* renamed from: a */
                public void onSuccess(MailGetThreadCollaboratorsInfoResponse mailGetThreadCollaboratorsInfoResponse) {
                    Log.m165389i("NavigationUtils", "openShareMessageListActivity fetchCollaboratorList onSuccess");
                    C42699a.m170255a(C43277a.m171921a().mo154946j(), new IGetDataCallback<String>() {
                        /* class com.ss.android.lark.mail.impl.p2195i.C42699a.C427023.C427031 */

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            Log.m165383e("NavigationUtils", "openShareMessageListActivity switchToPrimaryAccount onError");
                        }

                        /* renamed from: a */
                        public void onSuccess(String str) {
                            Log.m165389i("NavigationUtils", "openShareMessageListActivity switchToPrimaryAccount onSuccess");
                            C42699a.m170241a(context, str, z, str);
                        }
                    });
                }
            });
        }
    }

    /* renamed from: a */
    public static void m170241a(Context context, String str, boolean z, String str2) {
        Log.m165389i("NavigationUtils", "enterShareMessageListActivity");
        C43849u.m173826a(new Runnable(str, context, z) {
            /* class com.ss.android.lark.mail.impl.p2195i.$$Lambda$a$jEvBZQfQHVBi3wALe5MRFVgxFkU */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ Context f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C42699a.m170254a(this.f$0, this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m170254a(String str, Context context, boolean z) {
        MessageListIntenInfo messageListIntenInfo = new MessageListIntenInfo("SHARE", str, "", 2, "");
        Intent a = m170210a(context);
        Bundle bundle = new Bundle();
        bundle.putString("come_from", "select_thread");
        bundle.putParcelable("key_thread", messageListIntenInfo);
        bundle.putInt("key_serve_creator_type", 4);
        a.putExtras(bundle);
        context.startActivity(a);
        if (z) {
            C42187a.m168539h("chat_side_bar");
        } else {
            C42187a.m168539h("im_card");
        }
    }

    /* renamed from: b */
    public static boolean m170271b(Context context, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            Log.m165389i("NavigationUtils", "dispatchUrl empty url");
            return false;
        } else if (C41816b.m166115a().mo150130a(C43860w.m173857a(str, "from", "mail")) || C41816b.m166115a().mo150135b(str)) {
            return true;
        } else {
            if (m170258a(str) && m170270b(context, str, new HashMap())) {
                return true;
            }
            if (z && C41816b.m166115a().mo150134b(context, str)) {
                C42187a.m168565r();
                return true;
            } else if (m170292k(context, str)) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: a */
    public static boolean m170258a(String str) {
        if (!m170268b()) {
            return false;
        }
        if ("mailto".equals(Uri.parse(str).getScheme())) {
            return true;
        }
        return MailAddress.m167321a(str).mo151185g();
    }

    /* renamed from: b */
    public static boolean m170270b(Context context, String str, Map<String, String> map) {
        boolean z = C43783o.m173519a(Uri.parse(str)) || MailAddress.m167321a(str).mo151185g();
        if (z) {
            m170239a(context, str, map);
        }
        return z;
    }

    /* renamed from: a */
    public static void m170248a(final Context context, boolean z, final AbstractC41895c cVar) {
        C42176e.m168344a().mo152227a(z, new IGetDataCallback<MailGetOAuthURLResponse>() {
            /* class com.ss.android.lark.mail.impl.p2195i.C42699a.C427044 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165384e("NavigationUtils", "requestOauthUrl err", errorResult);
            }

            /* renamed from: a */
            public void onSuccess(MailGetOAuthURLResponse mailGetOAuthURLResponse) {
                if (mailGetOAuthURLResponse == null) {
                    Log.m165383e("NavigationUtils", "requestOauthUrl response is null");
                } else if (mailGetOAuthURLResponse.access_denied.booleanValue()) {
                    AbstractC41895c cVar = cVar;
                    if (cVar != null) {
                        cVar.onAccessDenied();
                    } else {
                        Log.m165383e("NavigationUtils", "access_denied is true, but callback is null");
                    }
                } else {
                    C42699a.m170293l(context, mailGetOAuthURLResponse.oauth_url);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m170236a(final Context context, final String str, final String str2, final String str3, ArrayList<Integer> arrayList) {
        Log.m165389i("NavigationUtils", "forwardToChatCardOpenMail: " + str3);
        if (!C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.forwardmessage.navigator")) {
            Log.m165397w("NavigationUtils", "forwardToChatCardOpenMail fg denied");
        } else if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            Log.m165383e("NavigationUtils", "forwardToChatCardOpenMail invalid parameters");
        } else {
            m170255a(C43277a.m171921a().mo154946j(), new IGetDataCallback<String>() {
                /* class com.ss.android.lark.mail.impl.p2195i.C42699a.C427055 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("NavigationUtils", "forwardToChatCardOpenMail switchToPrimaryAccount onError");
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    Log.m165389i("NavigationUtils", "forwardToChatCardOpenMail switchToPrimaryAccount onSuccess");
                    C43849u.m173826a(new Runnable() {
                        /* class com.ss.android.lark.mail.impl.p2195i.C42699a.C427055.RunnableC427061 */

                        public void run() {
                            ForwardToChatMessageListIntentInfo forwardToChatMessageListIntentInfo = new ForwardToChatMessageListIntentInfo("SHARE", str3, "", 2, str, str2, "");
                            Intent a = C42699a.m170210a(context);
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("key_thread", forwardToChatMessageListIntentInfo);
                            bundle.putInt("key_serve_creator_type", 5);
                            bundle.putString("come_from", "come_from_forward");
                            a.putExtras(bundle);
                            context.startActivity(a);
                            C42187a.m168539h("im_card");
                        }
                    });
                }
            });
        }
    }

    /* renamed from: a */
    public static void m170243a(final Context context, final ArrayList<MessageListIntenInfo> arrayList, int i, AbstractC42870h hVar, String str, MailThread mailThread) {
        Log.m165389i("NavigationUtils", "gotoMessageListTabView: " + arrayList.size() + " defIndex:" + i);
        final int a = m170209a(arrayList, i);
        if (C42879j.m170799a().mo153874b() && arrayList.size() > a) {
            C42879j.m170799a().mo153869a(arrayList.get(a).mo154050c(), context, "come_from_threadlist");
        }
        C42871i.m170776a(context);
        if (C42871i.m170779b()) {
            Log.m165389i("NavigationUtils", "start gotoMessageListTabView");
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("key_threadid_list", arrayList);
            bundle.putInt("key_def_index", a);
            bundle.putInt("key_serve_creator_type", 1);
            bundle.putString("come_from", "come_from_threadlist");
            Log.m165389i("NavigationUtils", "end 11 gotoMessageListTabView");
            C42871i.m170775a().mo153851a(new C42871i.AbstractC42877a() {
                /* class com.ss.android.lark.mail.impl.p2195i.C42699a.C427076 */

                @Override // com.ss.android.lark.mail.impl.message.p2204d.C42871i.AbstractC42877a
                /* renamed from: a */
                public void mo153387a() {
                    C42879j.m170799a().mo153870a(arrayList, a, 1, "", context);
                }
            });
            C42871i.m170775a().mo153850a(bundle, hVar, context, str, mailThread, false);
            Log.m165389i("NavigationUtils", "end 22 gotoMessageListTabView");
        } else {
            context.startActivity(m170260b(context, a, arrayList, 1, "come_from_threadlist", ""));
        }
        C42187a.m168539h("thread_list");
    }

    /* renamed from: a */
    public static void m170244a(final Context context, final ArrayList<SearchMessageListIntentInfo> arrayList, final int i, AbstractC42870h hVar, String str, MailThread mailThread, String str2, SearchRet.C42082a aVar) {
        Log.m165389i("NavigationUtils", "gotoSearchThreadView");
        C42871i.m170776a(context);
        if (C42871i.m170779b()) {
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("key_threadid_list", arrayList);
            bundle.putInt("key_def_index", i);
            bundle.putInt("key_serve_creator_type", 2);
            bundle.putString("come_from", "come_from_search");
            bundle.putString("key_search_session_id", str2);
            bundle.putString("key_result_hint_from", C42330c.C42338g.m169084a(aVar));
            C42871i.m170775a().mo153851a(new C42871i.AbstractC42877a() {
                /* class com.ss.android.lark.mail.impl.p2195i.C42699a.C427098 */

                @Override // com.ss.android.lark.mail.impl.message.p2204d.C42871i.AbstractC42877a
                /* renamed from: a */
                public void mo153387a() {
                    C42879j.m170799a().mo153870a(arrayList, i, 2, "", context);
                }
            });
            C42871i.m170775a().mo153850a(bundle, hVar, context, str, mailThread, true);
        } else {
            Intent b = m170260b(context, i, arrayList, 2, "come_from_search", "");
            Bundle extras = b.getExtras();
            extras.putString("key_search_session_id", str2);
            extras.putString("key_result_hint_from", C42330c.C42338g.m169084a(aVar));
            context.startActivity(b);
        }
        C42187a.m168539h("thread_list");
    }

    /* renamed from: a */
    public static void m170230a(Context context, MessageListIntenInfo messageListIntenInfo) {
        Log.m165389i("NavigationUtils", "gotoOutboxView: " + messageListIntenInfo.mo154050c());
        Intent a = m170210a(context);
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_thread", messageListIntenInfo);
        bundle.putInt("key_serve_creator_type", 3);
        a.putExtras(bundle);
        context.startActivity(a);
    }

    /* renamed from: a */
    public static void m170231a(Context context, MessageListIntenInfo messageListIntenInfo, int i) {
        Log.m165389i("NavigationUtils", "gotoBigContentMessageView: " + messageListIntenInfo.mo154050c());
        Intent a = m170210a(context);
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_thread", messageListIntenInfo);
        bundle.putInt("key_serve_creator_type", i);
        bundle.putString("come_from", "come_from_threadlist");
        a.putExtras(bundle);
        context.startActivity(a);
    }

    /* renamed from: a */
    public static void m170234a(Context context, String str, String str2) {
        Intent intent = new Intent(context, FolderSelectLocationActivity.class);
        intent.putExtra("target_node_id", str);
        intent.putExtra("selected_node_id", str2);
        ((Activity) context).startActivityForResult(intent, 1);
    }

    /* renamed from: a */
    public static void m170255a(String str, final IGetDataCallback<String> iGetDataCallback) {
        if (iGetDataCallback == null) {
            Log.m165383e("NavigationUtils", "switchToTargetAccount empty callback");
            return;
        }
        final String n = C43277a.m171921a().mo154950n();
        if (TextUtils.isEmpty(n)) {
            Log.m165383e("NavigationUtils", "switchToTargetAccount get empty current account ID");
            iGetDataCallback.onError((ErrorResult) null);
        } else if (TextUtils.isEmpty(str)) {
            Log.m165383e("NavigationUtils", "switchToTargetAccount get empty target account ID");
            iGetDataCallback.onError((ErrorResult) null);
        } else if (n.equals(str)) {
            Log.m165389i("NavigationUtils", "switchToTargetAccount no need to switch");
            iGetDataCallback.onSuccess(n);
        } else {
            C43277a.m171921a().mo154931a(str, new IGetDataCallback<C42088b>() {
                /* class com.ss.android.lark.mail.impl.p2195i.C42699a.C427109 */

                /* renamed from: a */
                public void onSuccess(C42088b bVar) {
                    Log.m165389i("NavigationUtils", "switchToTargetAccount onSuccess");
                    iGetDataCallback.onSuccess(n);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("NavigationUtils", "switchToTargetAccount onError");
                    iGetDataCallback.onError((ErrorResult) null);
                }
            });
        }
    }

    /* renamed from: a */
    public static Intent m170210a(Context context) {
        return new Intent(context, MessageListActivity.class);
    }

    /* renamed from: b */
    public static void m170261b(Context context) {
        context.startActivity(new Intent(context, MailSettingActivity.class));
    }

    /* renamed from: c */
    public static void m170272c(Context context) {
        context.startActivity(new Intent(context, MigrationActivity.class));
    }

    /* renamed from: d */
    public static void m170279d(Context context) {
        context.startActivity(new Intent(context, NotificationActivity.class));
    }

    /* renamed from: e */
    public static void m170282e(Context context) {
        context.startActivity(new Intent(context, OldNotificationActivity.class));
    }

    /* renamed from: f */
    public static void m170284f(Context context) {
        context.startActivity(new Intent(context, SendUndoActivity.class));
    }

    /* renamed from: g */
    public static void m170286g(Context context) {
        context.startActivity(new Intent(context, ReplyLanguageActivity.class));
    }

    /* renamed from: h */
    public static void m170288h(Context context) {
        context.startActivity(new Intent(context, ConversationModeActivity.class));
    }

    /* renamed from: a */
    public static void m170212a(Activity activity) {
        Log.m165389i("NavigationUtils", "shareDriveFile");
        Intent intent = new Intent(activity, ShareDriveFileInvisibleActivity.class);
        intent.putExtra("purpose", 35484);
        activity.startActivity(intent);
    }

    /* renamed from: j */
    public static boolean m170291j(Context context, String str) {
        return m170271b(context, str, true);
    }

    /* renamed from: l */
    public static void m170293l(Context context, String str) {
        m170271b(context, str, false);
    }

    /* renamed from: m */
    public static void m170294m(Context context, String str) {
        m170277c(context, str, true);
    }

    /* renamed from: a */
    public static void m170215a(Context context, int i) {
        Intent intent = new Intent(context, MailAggregationManageActivity.class);
        intent.putExtra("come_from", i);
        context.startActivity(intent);
    }

    /* renamed from: i */
    public static void m170290i(Context context, String str) {
        Intent intent = new Intent(context, EditSignatureActivity.class);
        intent.putExtra("t_a_id", str);
        context.startActivity(intent);
    }

    /* renamed from: n */
    public static void m170295n(Context context, String str) {
        Intent intent = new Intent(context, RecallDetailActivity.class);
        intent.putExtra(RecallDetailActivity.f109466a, str);
        context.startActivity(intent);
    }

    /* renamed from: o */
    public static void m170296o(Context context, String str) {
        Intent intent = new Intent(context, SendStatusDetailActivity.class);
        intent.putExtra(SendStatusDetailActivity.f109501a, str);
        context.startActivity(intent);
    }

    /* renamed from: b */
    public static void m170262b(Context context, int i) {
        Intent intent = new Intent(context, LabelEditActivity.class);
        intent.putExtra("jump_from", i);
        context.startActivity(intent);
    }

    /* renamed from: c */
    public static void m170273c(Context context, int i) {
        Intent intent = new Intent(context, FolderEditActivity.class);
        intent.putExtra("jump_from", i);
        context.startActivity(intent);
    }

    /* renamed from: d */
    public static void m170280d(Context context, String str) {
        Intent intent = new Intent(context, AccountDetailSettingActivity.class);
        intent.putExtra("key_mail_account_id", str);
        context.startActivity(intent);
    }

    /* renamed from: e */
    public static void m170283e(Context context, String str) {
        Intent intent = new Intent(context, SignatureActivity.class);
        intent.putExtra("t_a_id", str);
        context.startActivity(intent);
    }

    /* renamed from: f */
    public static void m170285f(Context context, String str) {
        Intent intent = new Intent(context, EntSignatureActivity.class);
        intent.putExtra("t_a_id", str);
        context.startActivity(intent);
    }

    /* renamed from: g */
    public static void m170287g(Context context, String str) {
        Intent intent = new Intent(context, AutoReplyActivity.class);
        intent.putExtra("t_a_id", str);
        context.startActivity(intent);
    }

    /* renamed from: h */
    public static void m170289h(Context context, String str) {
        Intent intent = new Intent(context, EditAutoReplyActivity.class);
        intent.putExtra("t_a_id", str);
        context.startActivity(intent);
    }

    /* renamed from: p */
    public static void m170297p(Context context, String str) {
        Intent intent = new Intent(context, FolderEditActivity.class);
        intent.putExtra("target_id", str);
        intent.putExtra("jump_from", 2);
        context.startActivity(intent);
    }

    /* renamed from: a */
    private static int m170209a(ArrayList<MessageListIntenInfo> arrayList, int i) {
        MessageListIntenInfo messageListIntenInfo = arrayList.get(i);
        if (arrayList == null || messageListIntenInfo.mo154058i()) {
            return i;
        }
        boolean z = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).mo154058i()) {
                arrayList.remove(size);
                z = true;
            }
        }
        if (z) {
            return arrayList.indexOf(messageListIntenInfo);
        }
        return i;
    }

    /* renamed from: c */
    private static void m170274c(Context context, Intent intent) {
        intent.setAction("android.intent.action.SEND");
        intent.setType("plain/text");
        try {
            context.startActivity(intent);
        } catch (Exception e) {
            Log.m165384e("NavigationUtils", "startMailToAction error:", e);
        }
    }

    /* renamed from: k */
    public static boolean m170292k(Context context, String str) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
            return true;
        } catch (Throwable th) {
            Log.m165389i("NavigationUtils", "open activity err: " + th.getMessage());
            return false;
        }
    }

    /* renamed from: b */
    public static void m170264b(Context context, String str) {
        Intent intent = new Intent(context, LabelEditActivity.class);
        intent.putExtra("target_id", str);
        intent.putExtra("jump_from", 2);
        context.startActivity(intent);
    }

    /* renamed from: c */
    public static void m170276c(Context context, String str) {
        if (TextUtils.equals(str, "notification")) {
            m170279d(context);
            return;
        }
        Log.m165389i("NavigationUtils", "goToDetailSetting found unknown item: " + str);
    }

    /* renamed from: a */
    public static void m170216a(final Context context, final Intent intent) {
        final boolean booleanExtra = intent.getBooleanExtra(C41816b.m166115a().mo150151r(), false);
        if (m170256a()) {
            m170274c(context, intent);
            return;
        }
        C42226b.m168638a().mo152308a(C42226b.C42229b.f107485a);
        C42272g.m168835a(System.currentTimeMillis());
        C42176e.m168344a().mo152195a(new CreateDraft.C42054a().mo151085a("").mo151087b("").mo151083a(MailCreateDraftRequest.CreateDraftAction.COMPOSE.getValue()).mo151086a(), new IGetDataCallback<MailDraft>() {
            /* class com.ss.android.lark.mail.impl.p2195i.C42699a.AnonymousClass13 */

            /* renamed from: a */
            public void onSuccess(MailDraft mailDraft) {
                C42226b.m168638a().mo152308a("mail_dev_send_page_cost_time");
                Intent intent = intent;
                if (intent != null) {
                    mailDraft.mo151326a(C43783o.m173514a(intent));
                }
                C42699a.m170225a(context, mailDraft, booleanExtra);
                C42330c.m169077e(C42330c.C42335d.f107693i);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("NavigationUtils", "gotoNewCompose onError");
                if (!booleanExtra || !C42699a.m170256a()) {
                    C42699a.m170232a(context, "mail_to");
                } else {
                    C41816b.m166115a().mo150113C().mo150177a();
                }
            }
        });
    }

    /* renamed from: b */
    public static boolean m170269b(Context context, Intent intent) {
        Log.m165389i("NavigationUtils", "openMailFromNotify pushIntent: " + intent);
        C42543h.m169819a().mo153017a(context, intent);
        return true;
    }

    /* renamed from: d */
    public static void m170281d(Context context, ArrayList<String> arrayList, String str) {
        Log.m165389i("NavigationUtils", "gotoFolderMoveToView from LabelId: " + str);
        Intent intent = new Intent(context, FolderMoveToActivity.class);
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("select_thread_list", arrayList);
        bundle.putString("from_label_id", str);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    /* renamed from: b */
    public static void m170265b(Context context, String str, PermissionCode permissionCode) {
        Log.m165389i("NavigationUtils", "editCollaborator");
        Intent intent = new Intent(context, CollaborateActivity.class);
        intent.putExtra("thread_id", str);
        intent.putExtra("share_permission_code", permissionCode);
        intent.putExtra("intent_key_collaborate_mode", CollaborateActivity.CollaborateMode.Edit);
        context.startActivity(intent);
    }

    /* renamed from: c */
    public static void m170277c(final Context context, final String str, final boolean z) {
        if (context instanceof Activity) {
            new C51331a((Activity) context).mo176924c(f108664a).subscribe(new Consumer<Boolean>() {
                /* class com.ss.android.lark.mail.impl.p2195i.C42699a.C427087 */

                /* renamed from: a */
                public void accept(Boolean bool) {
                    String str;
                    String str2;
                    if (!bool.booleanValue()) {
                        ((Activity) context).finish();
                    } else if (TextUtils.isEmpty(str)) {
                        Log.m165389i("NavigationUtils", "gotoMessageListViewForEML filePath null return:");
                    } else {
                        int lastIndexOf = str.lastIndexOf("/");
                        int lastIndexOf2 = str.lastIndexOf(".");
                        if (lastIndexOf2 < 0) {
                            Log.m165389i("NavigationUtils", "gotoMessageListViewForEML filePath error return:");
                            return;
                        }
                        if (lastIndexOf < 0) {
                            str = str.substring(0, lastIndexOf2);
                        } else {
                            str = str.substring(lastIndexOf + 1, lastIndexOf2);
                        }
                        ArrayList arrayList = new ArrayList();
                        MessageListIntenInfo messageListIntenInfo = new MessageListIntenInfo("EML", str + "_eml", "", 3, str);
                        messageListIntenInfo.mo154048a(false);
                        messageListIntenInfo.mo154051c(false);
                        arrayList.add(messageListIntenInfo);
                        Log.m165389i("NavigationUtils", "gotoMessageListTabView: " + arrayList.size());
                        if (z) {
                            str2 = "come_from_eml_local";
                        } else {
                            str2 = "come_from_eml_other";
                        }
                        context.startActivity(C42699a.m170211a(context, 0, arrayList, 8, str2, str));
                        C42187a.m168539h("eml_local");
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public static void m170266b(Context context, String str, String str2) {
        Intent intent = new Intent(context, LabelSelectLocationActivity.class);
        intent.putExtra("target_node_id", str);
        intent.putExtra("selected_node_id", str2);
        ((Activity) context).startActivityForResult(intent, 1);
    }

    /* renamed from: c */
    public static void m170278c(Context context, ArrayList<MessageListIntenInfo> arrayList, String str) {
        Log.m165389i("NavigationUtils", "gotoMessageListTabViewForEmlAttachment: " + arrayList.size() + " defIndex:" + 0);
        context.startActivity(m170260b(context, 0, arrayList, 8, "come_from_eml_other", str));
        C42187a.m168539h("eml_attachment");
    }

    /* renamed from: a */
    public static void m170217a(Context context, Bitmap bitmap, int i) {
        Log.m165389i("NavigationUtils", "gotoSearchActivity");
        if (context == null) {
            Log.m165389i("NavigationUtils", "gotoSearchActivity context null");
            return;
        }
        if (bitmap != null) {
            al.m95028a().mo93366a("searchAnimationBitmap", bitmap);
        }
        Intent intent = new Intent(context, SearchActivity.class);
        intent.putExtra("searchAnimationBitmapHeight", i);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
            Log.m165385e("NavigationUtils", "open search activity exception.", new RuntimeException("ContextWrongError"), true);
        }
        try {
            context.startActivity(intent);
        } catch (Throwable th) {
            Log.m165385e("NavigationUtils", "open search activity fail.", th, true);
        }
    }

    /* renamed from: b */
    public static void m170267b(Context context, ArrayList<MailThread> arrayList, String str) {
        Intent intent = new Intent(context, LabelMultiSelectActivity.class);
        intent.putParcelableArrayListExtra("select_threads", arrayList);
        intent.putExtra("from_label_id", str);
        ((Activity) context).startActivityForResult(intent, 1);
    }

    /* renamed from: a */
    public static void m170214a(Activity activity, Bundle bundle, String str, int i) {
        Log.m165389i("NavigationUtils", "shareDriveFile");
        Intent intent = new Intent(activity, ShareDriveFileInvisibleActivity.class);
        intent.putExtra("purpose", 8383732);
        intent.putExtra("extra_data", bundle);
        intent.putExtra("sharing_title", str);
        intent.putExtra("sharing_icon_res_id", i);
        activity.startActivity(intent);
    }

    /* renamed from: b */
    public static void m170263b(final Context context, final MailMessage mailMessage, final String str, final String str2, final String str3) {
        C42226b.m168638a().mo152308a(C42226b.C42229b.f107485a);
        C42272g.m168835a(System.currentTimeMillis());
        final String G = mailMessage.mo151554G();
        C42176e.m168344a().mo152195a(new CreateDraft.C42054a().mo151085a(mailMessage.mo151627z()).mo151087b(mailMessage.mo151581b()).mo151084a(mailMessage.mo151615o()).mo151083a(MailCreateDraftRequest.CreateDraftAction.REPLY_ALL.getValue()).mo151089d(G).mo151086a(), new IGetDataCallback<MailDraft>() {
            /* class com.ss.android.lark.mail.impl.p2195i.C42699a.AnonymousClass17 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("NavigationUtils", "gotoReplyAllView onError");
                C42699a.m170232a(context, "reply_all");
            }

            /* renamed from: a */
            public void onSuccess(MailDraft mailDraft) {
                mailDraft.mo151353h(G);
                if (TextUtils.equals(mailDraft.mo151321a(), str)) {
                    C42699a.m170226a(context, mailMessage, mailDraft, PermissionCode.fromValue(mailDraft.mo151317B()), str2, str3);
                    return;
                }
                C42226b.m168638a().mo152308a("mail_dev_replay_all_in_detail_cost_time");
                C42699a.m170227a(context, mailMessage, mailDraft, new ReplyAllMailAction(mailDraft.mo151321a(), str3), PermissionCode.fromValue(mailDraft.mo151317B()), str2, "reply_all");
            }
        });
    }

    /* renamed from: c */
    public static void m170275c(final Context context, final MailMessage mailMessage, final String str, final String str2, final String str3) {
        C42226b.m168638a().mo152308a(C42226b.C42229b.f107485a);
        C42272g.m168835a(System.currentTimeMillis());
        final String G = mailMessage.mo151554G();
        C42176e.m168344a().mo152195a(new CreateDraft.C42054a().mo151085a(mailMessage.mo151627z()).mo151087b(mailMessage.mo151581b()).mo151084a(mailMessage.mo151615o()).mo151083a(MailCreateDraftRequest.CreateDraftAction.FORWARD.getValue()).mo151089d(G).mo151086a(), new IGetDataCallback<MailDraft>() {
            /* class com.ss.android.lark.mail.impl.p2195i.C42699a.C427012 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("NavigationUtils", "gotoForwardView onError");
                C42699a.m170232a(context, "forward");
            }

            /* renamed from: a */
            public void onSuccess(MailDraft mailDraft) {
                mailDraft.mo151353h(G);
                if (TextUtils.equals(mailDraft.mo151321a(), str)) {
                    C42699a.m170226a(context, mailMessage, mailDraft, PermissionCode.fromValue(mailDraft.mo151317B()), str2, str3);
                    return;
                }
                C42226b.m168638a().mo152308a("mail_dev_forward_in_detail_cost_time");
                C42699a.m170227a(context, mailMessage, mailDraft, new ForwardMailAction(mailDraft.mo151321a(), str3), PermissionCode.fromValue(mailDraft.mo151317B()), str2, "forward");
            }
        });
    }

    /* renamed from: a */
    public static void m170218a(Context context, ComposeMailAction composeMailAction, PermissionCode permissionCode, String str, Intent intent) {
        C43849u.m173826a(new Runnable(intent, context, composeMailAction, permissionCode, str) {
            /* class com.ss.android.lark.mail.impl.p2195i.$$Lambda$a$WycPF4VatMtuMBMLgfCWa41kk */
            public final /* synthetic */ Intent f$0;
            public final /* synthetic */ Context f$1;
            public final /* synthetic */ ComposeMailAction f$2;
            public final /* synthetic */ PermissionCode f$3;
            public final /* synthetic */ String f$4;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void run() {
                C42699a.m170249a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    /* renamed from: b */
    private static Intent m170260b(Context context, int i, ArrayList<? extends MessageListIntenInfo> arrayList, int i2, String str, String str2) {
        C42879j.m170799a().mo153870a(arrayList, i, i2, str2, context);
        Intent intent = new Intent(context, MessageListTabActivity.class);
        Bundle bundle = new Bundle();
        bundle.putInt("key_def_index", i);
        bundle.putParcelableArrayList("key_threadid_list", arrayList);
        bundle.putInt("key_serve_creator_type", i2);
        bundle.putBoolean("key_click_preload_ing", true);
        bundle.putString("come_from", str);
        intent.putExtras(bundle);
        return intent;
    }

    /* renamed from: a */
    public static Intent m170211a(Context context, int i, ArrayList<? extends MessageListIntenInfo> arrayList, int i2, String str, String str2) {
        C42879j.m170799a().mo153873b(arrayList, i, i2, str2, context);
        Intent intent = new Intent(context, MessageListTabActivity.class);
        Bundle bundle = new Bundle();
        bundle.putInt("key_def_index", i);
        bundle.putParcelableArrayList("key_threadid_list", arrayList);
        bundle.putInt("key_serve_creator_type", i2);
        bundle.putBoolean("key_click_preload_ing", true);
        bundle.putString("come_from", str);
        intent.putExtras(bundle);
        return intent;
    }

    /* renamed from: a */
    public static void m170213a(Activity activity, int i, String str, ArrayList<String> arrayList, String str2, PermissionCode permissionCode) {
        Log.m165389i("NavigationUtils", "shareCreateNewChat");
        Intent intent = new Intent(activity, ShareActivity.class);
        intent.putExtra("thread_id", str);
        intent.putExtra("share_permission_code", permissionCode);
        intent.putExtra("intent_key_share_mode", ShareActivity.Mode.CreateNewChat);
        intent.putStringArrayListExtra("intent_key_message_id_list", arrayList);
        intent.putExtra("intent_key_subject", str2);
        activity.startActivityForResult(intent, i);
    }
}
