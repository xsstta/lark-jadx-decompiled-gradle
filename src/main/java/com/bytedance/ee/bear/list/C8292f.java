package com.bytedance.ee.bear.list;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1177w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.AbstractC4967c;
import com.bytedance.ee.bear.DocMetaInfo;
import com.bytedance.ee.bear.DocObjInfo;
import com.bytedance.ee.bear.NodeType;
import com.bytedance.ee.bear.WikiNavInfo;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AbstractC5094ag;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.am;
import com.bytedance.ee.bear.contract.drive.DriveOfflineDoc;
import com.bytedance.ee.bear.contract.icon.IconInfo;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.contract.route.parcelable.IWiki;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.bear.document.AbstractC6158t;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.drive.importfile.ImportFileEntity;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.DocVersion;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.folder.C8382u;
import com.bytedance.ee.bear.list.folder.complaint.FolderComplaintActivity;
import com.bytedance.ee.bear.list.offlinecache.ManualOfflineConfig;
import com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.DefaultDocPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.DocPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.FolderMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.p397h.AbstractC7825c;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.search.AbstractC10814b;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.templates.C11515d;
import com.bytedance.ee.bear.templates.TemplateReport;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.bytedance.ee.bear.widgets.dialog.inputdialog.BearUDInputDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p705h.C13666a;
import com.bytedance.ee.util.p716r.C13721c;
import com.bytedance.ee.util.p717s.C13723a;
import com.bytedance.ee.util.p718t.C13736c;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.al;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.f */
public class C8292f {

    /* renamed from: a */
    public static boolean f22431a;

    /* renamed from: b */
    public static boolean f22432b;

    /* renamed from: a */
    public static String m34128a() {
        return "/api/explorer/share/folder/newlist/";
    }

    /* renamed from: a */
    private static String m34134a(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: a */
    public static String m34136a(boolean z) {
        return z ? "grid_more" : "left_slide";
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m34171b(Boolean bool) throws Exception {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m34181c(Boolean bool) throws Exception {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m34186d(Boolean bool) throws Exception {
    }

    /* renamed from: a */
    public static String m34130a(Context context, Document document) {
        return C10539a.m43639a(context, R.string.Doc_List_LastUpdateTime, "time", C13723a.m55662c(context, C13721c.m55642a(document.mo32479r(), 0L) * 1000));
    }

    /* renamed from: a */
    public static String m34131a(Context context, Document document, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("ownerName", C13666a.m55443a(str, document.mo32488v(), document.mo32490w()));
        hashMap.put("time", C13723a.m55662c(context, C13721c.m55642a(document.mo32494y(), 0L) * 1000));
        return C10539a.m43640a(context, R.string.Doc_List_ShareBy, hashMap);
    }

    /* renamed from: a */
    public static boolean m34162a(Document document) {
        if (document.mo32483t() != C8275a.f22375h.mo32555b()) {
            return false;
        }
        long a = C13721c.m55642a(document.mo32492x(), 0L);
        long a2 = C13721c.m55642a(document.mo32373A(), 0L);
        long j = a - a2;
        if (a == 0 || a2 == 0 || j < 0 || j >= 3) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m34145a(Context context, String str, String str2, String str3, BearUDInputDialogBuilder.OnBtnClickListener aVar) {
        ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40652b(((BearUDInputDialogBuilder) new BearUDInputDialogBuilder(context).title(R.string.Doc_Facade_CreateFolder)).mo45395b(R.string.Doc_Facade_InputName).mo45399c(R.string.Doc_Facade_Create).mo45391a(new BearUDInputDialogBuilder.OnBtnClickListener(str, str2, str3) {
            /* class com.bytedance.ee.bear.list.$$Lambda$f$XWHgY49MH89NLPGe5EDGtbC1TiA */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.bytedance.ee.bear.widgets.dialog.inputdialog.BearUDInputDialogBuilder.OnBtnClickListener
            public final void onClick(String str) {
                C8292f.m34159a(BearUDInputDialogBuilder.OnBtnClickListener.this, this.f$1, this.f$2, this.f$3, str);
            }
        }).mo45402d(R.string.Doc_Facade_Cancel).mo45396b(new BearUDInputDialogBuilder.OnBtnClickListener(str, str2, str3) {
            /* class com.bytedance.ee.bear.list.$$Lambda$f$NuK3XplacwJzkfFxkZb31SI6WDQ */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.bytedance.ee.bear.widgets.dialog.inputdialog.BearUDInputDialogBuilder.OnBtnClickListener
            public final void onClick(String str) {
                C8292f.m34161a(this.f$0, this.f$1, this.f$2, str);
            }
        }).show());
        ListAnalysis.m32534d(str, str2, str3);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m34159a(BearUDInputDialogBuilder.OnBtnClickListener aVar, String str, String str2, String str3, String str4) {
        if (aVar != null) {
            aVar.onClick(str4);
        }
        ListAnalysis.m32530b(str, str2, "create", "ccm_space_folder_view", str3);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m34161a(String str, String str2, String str3, String str4) {
        ListAnalysis.m32530b(str, str2, "cancel", ListAnalysis.m32525b(str), str3);
    }

    /* renamed from: a */
    public static boolean m34164a(Document document, IMoreInfo dVar) {
        if (document.mo32483t() != C8275a.f22375h.mo32555b() || !((AbstractC7825c) KoinJavaComponent.m268610a(AbstractC7825c.class)).mo8425a()) {
            return false;
        }
        if (dVar instanceof DocMoreInfo) {
            C13479a.m54764b("DocumentUtils", "isOpenFileInOtherAppEnable() is DocMoreInfo canExport=" + dVar.mo39051r());
            return dVar.mo39051r();
        }
        C13479a.m54764b("DocumentUtils", "isOpenFileInOtherAppEnable() not DocMoreInfo isCopiable=" + document.mo32405U());
        return document.mo32405U();
    }

    /* renamed from: a */
    public static boolean m34163a(Document document, AccountService.Account account) {
        if ((!document.mo32402R() || account == null || TextUtils.equals(document.mo32457k(), account.f14584a)) && m34175b(document) && TextUtils.equals(document.mo32401Q(), m34132a(account))) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v16, resolved type: com.bytedance.ee.bear.share.export.ShareParams$ShareParamsBuilder */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [int, boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m34147a(androidx.fragment.app.FragmentActivity r7, com.bytedance.ee.bear.service.C10917c r8, com.bytedance.ee.bear.list.dto.Document r9, com.bytedance.ee.bear.contract.AccountService.Account r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 393
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.list.C8292f.m34147a(androidx.fragment.app.FragmentActivity, com.bytedance.ee.bear.service.c, com.bytedance.ee.bear.list.dto.Document, com.bytedance.ee.bear.contract.AccountService$Account, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public static void m34155a(C10917c cVar, Document document, String str, String str2) {
        ListAnalysis.m32503a(C5234y.m21391b(), str2, str, "pin", document);
        cVar.mo41508c(am.class).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.$$Lambda$f$gs99FfXiKiq3Mx2OG7AQgG8OqQ */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8292f.m34167b(Document.this, (am) obj);
            }
        }).mo238001b($$Lambda$f$yJCfSTPeoAqGVnF90pJmHpCWD_w.INSTANCE, $$Lambda$f$WgvgRc1nXOTp6er0azCH4SiX8SI.INSTANCE);
    }

    /* renamed from: a */
    public static String m34133a(Document document, String str) {
        String d = m34185d(document);
        if (TextUtils.isEmpty(d) || TextUtils.isEmpty(str)) {
            return d;
        }
        Uri.Builder buildUpon = Uri.parse(d).buildUpon();
        return buildUpon.appendQueryParameter("from", "tab_" + str).build().toString();
    }

    /* renamed from: a */
    public static void m34138a(Activity activity, C10917c cVar, Document document, boolean z, RouteBean routeBean, String str, int i, boolean z2) {
        m34139a(activity, cVar, document, z, routeBean, str, i, z2, 0);
    }

    /* renamed from: a */
    public static void m34139a(Activity activity, C10917c cVar, Document document, boolean z, RouteBean routeBean, String str, int i, boolean z2, int i2) {
        if (document != null) {
            if (z || m34183c(document)) {
                ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17293a(m34133a(document, str), routeBean);
                ListAnalysis.m32495a(C5234y.m21391b(), document.mo32483t());
                ListAnalysis.m32498a(C5234y.m21391b(), str, i, z2, document, i2);
                return;
            }
            C13479a.m54764b("DocumentUtils", "onItemClick()...can not open offline");
            if (document.mo32409Y() || !ManualOfflineConfig.isEnable(document.mo32483t())) {
                Toast.showText(activity, activity.getString(R.string.Doc_List_OfflineClickTips), 0);
            } else {
                m34140a(activity, cVar, document, z2, str);
            }
        }
    }

    /* renamed from: a */
    public static void m34140a(Activity activity, C10917c cVar, Document document, boolean z, String str) {
        String string = activity.getString(R.string.Doc_List_OfflineSetAvailable);
        new BearUDDialogBuilder(activity).mo45353a(string).mo45357b(activity.getString(R.string.Doc_List_OfflineDownloadTip)).mo45360c(8388611).mo45351a(BearUDDialogBuilder.ActionBottomOrientation.VERTICAL).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_OfflineMakeAvailable, new DialogInterface.OnClickListener(activity, cVar, document, z, str) {
            /* class com.bytedance.ee.bear.list.$$Lambda$f$pBNF22lBuWcwRoQOKIm9bP2YgDU */
            public final /* synthetic */ Activity f$0;
            public final /* synthetic */ C10917c f$1;
            public final /* synthetic */ Document f$2;
            public final /* synthetic */ boolean f$3;
            public final /* synthetic */ String f$4;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C8292f.m34142a(this.f$0, this.f$1, (Document) false, (boolean) this.f$2, (String) this.f$3, (DialogInterface) this.f$4);
            }
        }).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_List_OfflineNeedNot, (DialogInterface.OnClickListener) null).mo45355a().show();
    }

    /* renamed from: a */
    public static void m34142a(Activity activity, C10917c cVar, boolean z, Document document, boolean z2, String str) {
        cVar.mo41508c(am.class).mo237985a(C11678b.m48481e()).mo238020d(new Function(z, document, z2, str, activity) {
            /* class com.bytedance.ee.bear.list.$$Lambda$f$rLwYZPXj3iEio8SWGJVjOiFnI4 */
            public final /* synthetic */ boolean f$0;
            public final /* synthetic */ Document f$1;
            public final /* synthetic */ boolean f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ Activity f$4;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8292f.m34127a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (am) obj);
            }
        }).mo238001b($$Lambda$f$vv9qwAqjHGEC9JPmcLN6LVF3o.INSTANCE, $$Lambda$f$wzGqbgh8kvbPlwdisiiLLT8MmiM.INSTANCE);
    }

    /* renamed from: a */
    public static void m34144a(Context context, C10917c cVar, Document document, boolean z, AccountService.Account account, String str, String str2) {
        if (!z) {
            Toast.showFailureText(context, context.getString(R.string.Doc_Facade_OperateFailed), 0);
            return;
        }
        String s = document.mo32481s();
        if (cVar == null) {
            C13479a.m54764b("DocumentUtils", "openFile()...serviceContext is null");
            return;
        }
        ((AbstractC4967c) KoinJavaComponent.m268610a(AbstractC4967c.class)).mo19653a(s);
        ListAnalysis.m32496a(C5234y.m21391b(), account, "open_with_other_app", document, str2, str);
    }

    /* renamed from: a */
    public static void m34156a(C10917c cVar, Document document, boolean z) {
        if (cVar == null) {
            C13479a.m54764b("DocumentUtils", "importAsDocument()...serviceContext is null");
            return;
        }
        ImportFileEntity importFileEntity = new ImportFileEntity(document.mo32472o(), document.mo32469n());
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("module", "favorites");
        hashMap.put("is_grid", String.valueOf(z));
        importFileEntity.mo27486a(hashMap);
        ((AbstractC4967c) KoinJavaComponent.m268610a(AbstractC4967c.class)).mo19651a(importFileEntity);
    }

    /* renamed from: a */
    public static void m34157a(C10917c cVar, List<Document> list, boolean z) {
        if (cVar == null || CollectionUtils.isEmpty(list) || !z) {
            C13479a.m54764b("DocumentUtils", "preloadFiles()...fail for illegal arguments");
            return;
        }
        ArrayList<DriveOfflineDoc> arrayList = new ArrayList<>();
        for (Document document : list) {
            if (document.mo32483t() == C8275a.f22375h.mo32555b() && !document.mo32464l()) {
                arrayList.add(new DriveOfflineDoc(document.mo32472o(), document.mo32481s(), document.mo32377C()).mo20395a(TextUtils.isEmpty(document.mo32395L()) ? "explorer" : document.mo32395L()));
            }
        }
        ((AbstractC4967c) KoinJavaComponent.m268610a(AbstractC4967c.class)).mo19646a(4, arrayList).mo238001b($$Lambda$f$sZudFVA_hRhmnQBIlwJQ2ED9jZU.INSTANCE, $$Lambda$f$JISgCHkKAWgU8wQtyWhN55LcQS8.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m34160a(Boolean bool) throws Exception {
        C13479a.m54764b("DocumentUtils", " preloadDriveFiles in list: ret:" + bool);
    }

    /* renamed from: a */
    public static void m34158a(C10917c cVar, List<Document> list, boolean z, String str) {
        if (CollectionUtils.isEmpty(list) || !z) {
            C13479a.m54764b("DocumentUtils", "preloadDocuments()...fail for illegal arguments");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Document document : list) {
            String o = document.mo32472o();
            int t = document.mo32483t();
            if (document instanceof WikiDocument) {
                o = ((WikiDocument) document).mo21011c();
                t = C8275a.f22377j.mo32555b();
            }
            if (((AbstractC6158t) KoinJavaComponent.m268610a(AbstractC6158t.class)).mo20316a(t) && !document.mo32464l()) {
                String a = m34133a(document, str);
                arrayList.add(new OfflineDoc(o, a, t, "tab_" + str));
            }
        }
        cVar.mo41508c(AbstractC5094ag.class).mo238020d(new Function(arrayList) {
            /* class com.bytedance.ee.bear.list.$$Lambda$f$gAIf4aTe7Ir_LsELQEPVZySY7Og */
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ((AbstractC5094ag) obj).preloadDocs(this.f$0);
            }
        }).mo238001b($$Lambda$f$DZydHkjoykgatQLA73ypAjgRq9o.INSTANCE, $$Lambda$f$Iuwqy9OsY3ngVcAdv7kJDzIX2aU.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ List m34137a(RecyclerView recyclerView, List list, int i, Boolean bool) throws Exception {
        ArrayList arrayList = new ArrayList();
        if (recyclerView == null || CollectionUtils.isEmpty(list)) {
            C13479a.m54764b("DocumentUtils", "getRecyclerViewVisibleDocuments()...empty for illegal arguments");
            return arrayList;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (findFirstVisibleItemPosition < 0 || findLastVisibleItemPosition < 0) {
            if (i <= 0) {
                return arrayList;
            }
            findFirstVisibleItemPosition = 0;
            findLastVisibleItemPosition = Math.min(i, list.size() - 1);
        }
        return list.subList(findFirstVisibleItemPosition, findLastVisibleItemPosition);
    }

    /* renamed from: a */
    public static boolean m34165a(boolean z, Document document) {
        return z && FolderVersion.isShareFolderV1(document.an()) && document.ai();
    }

    /* renamed from: a */
    public static void m34143a(Context context, Document document, AccountService.Account account, AbstractC10169g gVar) {
        if (m34176b(document, account)) {
            new BearUDDialogBuilder(context).mo45344a(R.string.Doc_Widget_Tip).mo45354a(true).mo45357b(C10539a.m43639a(context, R.string.Doc_List_PermTipAlertContent, "doc_type", m34168b(context, document.mo32483t()))).mo45360c(8388611).mo45364e(14).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_Ok, new DialogInterface.OnClickListener(gVar) {
                /* class com.bytedance.ee.bear.list.$$Lambda$f$ZTO6R1AAxJn9LwjJW9uQiWUI6E */
                public final /* synthetic */ AbstractC10169g f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C8292f.m34149a(Document.this, this.f$1, dialogInterface, i);
                }
            }).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, (DialogInterface.OnClickListener) null).mo45359b();
            return;
        }
        Toast.showText(context, (int) R.string.Doc_List_PermTipMemberContent);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m34149a(Document document, AbstractC10169g gVar, DialogInterface dialogInterface, int i) {
        ((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36638a().mo36647a(document.mo32483t(), document.mo32472o(), true, gVar);
    }

    /* renamed from: a */
    public static String m34129a(Context context, int i) {
        if (i == C8275a.f22371d.mo32555b()) {
            return context.getString(R.string.Doc_List_DocumentTypeDocs);
        }
        if (i == C8275a.f22373f.mo32555b()) {
            return context.getString(R.string.Doc_List_DocumentTypeBase);
        }
        if (i == C8275a.f22375h.mo32555b()) {
            return context.getString(R.string.Doc_List_DocumentTypeFile);
        }
        if (i == C8275a.f22370c.mo32555b()) {
            return context.getString(R.string.Doc_List_DocumentTypeFolder);
        }
        if (i == C8275a.f22374g.mo32555b()) {
            return context.getString(R.string.Doc_List_DocumentTypeMindNotes);
        }
        if (i == C8275a.f22372e.mo32555b()) {
            return context.getString(R.string.Doc_List_DocumentTypeSheets);
        }
        if (i == C8275a.f22376i.mo32555b()) {
            return context.getString(R.string.Doc_List_DocumentTypeSlides);
        }
        if (i == C8275a.f22377j.mo32555b()) {
            return context.getString(R.string.Doc_List_DocumentTypeWiki);
        }
        return context.getString(R.string.Doc_List_DocumentTypeDocs);
    }

    /* renamed from: a */
    public static void m34152a(AbstractC10740f fVar, String str, String str2, String str3) {
        m34153a(fVar, str, str2, "", str3);
    }

    /* renamed from: a */
    public static void m34153a(AbstractC10740f fVar, String str, String str2, String str3, String str4) {
        m34154a(fVar, str, str2, (String) null, (String) null, str3, str4);
    }

    /* renamed from: a */
    public static void m34151a(AbstractC10740f fVar, String str, String str2) {
        TemplateReport.f31011b.mo44233c("from_activity_banner");
        m34154a(fVar, str, str2, "system", "1104", "", "space_banner");
    }

    /* renamed from: a */
    public static void m34154a(AbstractC10740f fVar, String str, String str2, String str3, String str4, String str5, String str6) {
        String str7 = "https://" + C6313i.f17509a + "/drive/template_center/";
        HashMap hashMap = new HashMap();
        hashMap.put("MODULE", str);
        hashMap.put("ROOT_TOKEN", str2);
        hashMap.put("openTemplateCenter", str3);
        hashMap.put("templateCategory", str4);
        hashMap.put("enterSource", str5);
        hashMap.put(C11515d.f31005b, str6);
        RouteBean routeBean = new RouteBean();
        routeBean.mo40612a(hashMap);
        fVar.mo17293a(str7, routeBean);
        C13479a.m54764b("DocumentUtils", "jumpTemplateCenter()...templateCenterUrl = " + str7);
    }

    /* renamed from: a */
    public static void m34146a(Bitmap bitmap) {
        if (bitmap == null) {
            C13479a.m54758a("DocumentUtils", "putViewSnapshot()...failed for bitmap  is null");
            return;
        }
        al.m95028a().mo93366a("search_title_bitmap", C13736c.m55689a(bitmap, ParticipantRepo.f117150c));
    }

    /* renamed from: a */
    public static void m34148a(Document document, Fragment fragment) {
        Intent intent = new Intent(fragment.getContext(), FolderComplaintActivity.class);
        intent.putExtra("token", document.mo32472o());
        intent.putExtra("title", document.mo32469n());
        intent.putExtra("desc", document.ar());
        fragment.startActivityForResult(intent, 1);
    }

    /* renamed from: a */
    public static void m34150a(AbstractC10740f fVar) {
        fVar.mo17292a("https://applink.feishu.cn/TdSgr1y9");
    }

    /* renamed from: c */
    public static List<String> m34180c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.valueOf(C8275a.f22370c.mo32555b()));
        arrayList.add(String.valueOf(C8275a.f22371d.mo32555b()));
        arrayList.add(String.valueOf(C8275a.f22372e.mo32555b()));
        arrayList.add(String.valueOf(C8275a.f22373f.mo32555b()));
        arrayList.add(String.valueOf(C8275a.f22374g.mo32555b()));
        arrayList.add(String.valueOf(C8275a.f22375h.mo32555b()));
        arrayList.add(String.valueOf(C8275a.f22376i.mo32555b()));
        arrayList.add(String.valueOf(C8275a.f22378k.mo32555b()));
        return arrayList;
    }

    /* renamed from: b */
    public static boolean m34174b() {
        if (C4511g.m18594d().mo17345F()) {
            return C4211a.m17514a().mo16536a("mindnote_enabled", false);
        }
        return true;
    }

    /* renamed from: a */
    public static String m34132a(AccountService.Account account) {
        if (account == null) {
            return "";
        }
        return account.f14592i;
    }

    /* renamed from: a */
    public static Bitmap m34121a(View view) {
        if (view == null) {
            C13479a.m54758a("DocumentUtils", "getViewSnapshot()...failed for view is null");
            return null;
        }
        view.invalidate();
        Bitmap a = C13736c.m55691a(view);
        if (a != null) {
            return a;
        }
        C13479a.m54758a("DocumentUtils", "getViewSnapshot()...failed for getBitmapFromView");
        return null;
    }

    /* renamed from: c */
    public static boolean m34183c(Document document) {
        if (!TextUtils.isEmpty(document.mo32375B()) || document.mo32483t() == C8275a.f22370c.mo32555b() || (document.mo32464l() && document.mo32483t() != C8275a.f22377j.mo32555b() && document.mo32483t() != C8275a.f22373f.mo32555b())) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static String m34185d(Document document) {
        String str;
        if (!TextUtils.isEmpty(document.mo32481s())) {
            return document.mo32481s();
        }
        C6313i a = C6313i.m25327a();
        String a2 = C8275a.m34050a(document.mo32483t());
        if (!TextUtils.isEmpty(document.mo32472o())) {
            str = document.mo32472o();
        } else {
            str = document.mo32375B();
        }
        return a.mo25382a(a2, str, null);
    }

    /* renamed from: e */
    public static C1177w<IconInfo> m34188e(Document document) {
        C1177w<IconInfo> wVar = new C1177w<>();
        if (TextUtils.isEmpty(document.ag().mo32502a()) && TextUtils.isEmpty(document.ag().mo32507c())) {
            return wVar;
        }
        IconInfo iconInfo = new IconInfo();
        iconInfo.setType(document.ag().mo32505b());
        iconInfo.setKey(document.ag().mo32502a());
        iconInfo.setFs_unit(document.ag().mo32507c());
        wVar.mo5929b(iconInfo);
        return wVar;
    }

    /* renamed from: a */
    public static C8382u m34123a(Throwable th) {
        if (th instanceof NetService.ServerErrorException) {
            try {
                C13479a.m54764b("DocumentUtils", "throwable:" + th);
                C8382u uVar = new C8382u();
                JSONObject jSONObject = new JSONObject(new JSONObject(new JSONObject(((NetService.ServerErrorException) th).getJson()).optString("meta")).optString("owner"));
                uVar.mo32815b(jSONObject.optString("tenant_id"));
                uVar.mo32813a(jSONObject.optString("name", ""));
                uVar.mo32814a(jSONObject.optBoolean("can_apply_perm"));
                return uVar;
            } catch (JSONException e) {
                C13479a.m54758a("DocumentUtils", "parse name form throwable error, error msg:" + e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m34175b(Document document) {
        if (!FolderVersion.isShareFolderV1(document.an()) || document.mo32398N() > 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Boolean m34167b(Document document, am amVar) throws Exception {
        amVar.pinDoc(document.mo32472o(), document.mo32483t(), document.mo32404T());
        return true;
    }

    /* renamed from: c */
    public static String m34179c(Context context, Document document) {
        return C10539a.m43639a(context, R.string.Doc_List_LastOpenTime, "time", C13723a.m55662c(context, C13721c.m55642a(document.mo32391J(), 0L) * 1000));
    }

    /* renamed from: d */
    public static String m34184d(Context context, Document document) {
        return C10539a.m43639a(context, R.string.Doc_List_Create_At, "time", C13723a.m55662c(context, C13721c.m55642a(document.mo32373A(), 0L) * 1000));
    }

    /* renamed from: e */
    public static String m34189e(Context context, Document document) {
        return C10539a.m43639a(context, R.string.Doc_List_UploadTime, "time", C13723a.m55662c(context, C13721c.m55642a(document.mo32492x(), 0L) * 1000));
    }

    /* renamed from: f */
    public static String m34191f(Context context, Document document) {
        return C10539a.m43639a(context, R.string.Doc_List_LastOpenTime, "time", C13723a.m55662c(context, C13721c.m55642a(document.mo32492x(), 0L) * 1000));
    }

    /* renamed from: g */
    public static String m34193g(Context context, Document document) {
        if (TextUtils.isEmpty(document.mo32469n())) {
            return m34178c(context, document.mo32483t());
        }
        return document.mo32469n();
    }

    /* renamed from: a */
    public static int m34120a(int i, Document document) {
        if (document.mo32483t() != C8275a.f22375h.mo32555b()) {
            return Integer.MAX_VALUE;
        }
        switch (i) {
            case 101:
                return R.string.Doc_Facade_ImportAsDoc;
            case 102:
                return R.string.Doc_Facade_ImportAsSheet;
            case 103:
                return R.string.Doc_Facade_ImportAsMindnote;
            default:
                return Integer.MAX_VALUE;
        }
    }

    /* renamed from: b */
    public static String m34168b(Context context, int i) {
        if (i == C8275a.f22370c.mo32555b()) {
            return context.getString(R.string.Doc_List_TypeSimpleNameFolder);
        }
        if (i == C8275a.f22379l.mo32555b()) {
            return context.getString(R.string.CreationMobile_Minutes_name);
        }
        return context.getString(R.string.Doc_List_TypeSimpleNameDoc);
    }

    /* renamed from: b */
    public static String m34169b(Context context, Document document) {
        long a = C13721c.m55642a(document.mo32389I(), 0L);
        if (a == 0) {
            a = C13721c.m55642a(document.mo32391J(), 0L);
        }
        return C10539a.m43639a(context, R.string.Doc_List_LastUpdateTime, "time", C13723a.m55662c(context, a * 1000));
    }

    /* renamed from: b */
    private static DocMoreInfo m34166b(C10917c cVar, Document document) {
        String a = C13666a.m55443a(C4484g.m18494b().mo17252c(), document.mo32488v(), document.mo32490w());
        DocMoreInfo aVar = new DocMoreInfo(document.mo32483t(), m34134a(document.mo32481s()), m34134a(document.mo32472o()), m34134a(document.mo32496z()), false, document.mo32409Y(), new DocMetaInfo(m34134a(((AbstractC10814b) KoinJavaComponent.m268610a(AbstractC10814b.class)).mo40909a(document.mo32469n())), m34134a(document.mo32457k()), m34134a(a), m34134a(document.mo32401Q()), m34134a(document.mo32457k()), m34134a(a), m34134a(document.mo32373A()), m34134a(document.mo32377C()), document.mo32404T(), document.mo32456j(), m34134a(document.aj()), "", false, m34134a(document.mo32379D()), document.ak()), new DocObjInfo(document.mo32404T(), document.mo32456j(), document.am(), new WikiNavInfo()), new DocPermission(new DocumentUtils$2(document), new DefaultDocPublicPermission()), new DocVersion(document.an()), false, ((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21069b(document.al()));
        if (NodeType.isShortcut(document.ao())) {
            aVar.mo39037e(true);
            aVar.mo39034d(true);
        }
        return aVar;
    }

    /* renamed from: c */
    private static FolderMoreInfo m34177c(C10917c cVar, Document document) {
        String e = C4511g.m18594d().mo17356e();
        String a = C13666a.m55443a(C4484g.m18494b().mo17252c(), document.mo32488v(), document.mo32490w());
        FolderMoreInfo bVar = new FolderMoreInfo(document.mo32483t(), m34134a(document.mo32481s()), m34134a(document.mo32472o()), m34134a(((AbstractC10814b) KoinJavaComponent.m268610a(AbstractC10814b.class)).mo40909a(document.mo32469n())), m34134a(document.mo32457k()), m34134a(document.mo32457k()), m34134a(a), m34134a(document.mo32401Q()), m34134a(document.mo32373A()), m34134a(document.mo32399O()), m34134a(document.mo32496z()), TextUtils.equals(e, document.mo32457k()), document.mo32404T(), document.mo32456j(), new FolderVersion(document.an(), document.mo32397M(), document.ap()), FolderVersion.isShareFolder(document.an(), document.ap()));
        if (!NodeType.isShortcut(document.ao())) {
            return bVar;
        }
        bVar.mo39065d(true);
        bVar.mo39066e(true);
        return bVar;
    }

    /* renamed from: a */
    public static IMoreInfo m34124a(C10917c cVar, Document document) {
        if (document.mo32483t() == C8275a.f22370c.mo32555b()) {
            return m34177c(cVar, document);
        }
        return m34166b(cVar, document);
    }

    /* renamed from: c */
    public static String m34178c(Context context, int i) {
        if (context == null) {
            C13479a.m54764b("DocumentUtils", "context is null");
            return "";
        } else if (i == C8275a.f22371d.mo32555b()) {
            return context.getResources().getString(R.string.Doc_List_UntitledDocument);
        } else {
            if (i == C8275a.f22372e.mo32555b()) {
                return context.getResources().getString(R.string.Doc_List_UntitledSheet);
            }
            if (i == C8275a.f22373f.mo32555b()) {
                return context.getResources().getString(R.string.Doc_List_UntitledBitable);
            }
            if (i == C8275a.f22374g.mo32555b()) {
                return context.getResources().getString(R.string.Doc_List_UntitledMindnote);
            }
            if (i == C8275a.f22375h.mo32555b()) {
                return context.getResources().getString(R.string.Doc_List_UntitledFile);
            }
            if (i == C8275a.f22376i.mo32555b()) {
                return context.getResources().getString(R.string.Doc_List_UntitledSlide);
            }
            if (i == C8275a.f22370c.mo32555b()) {
                return context.getResources().getString(R.string.Doc_List_TypeSimpleNameFolder);
            }
            return context.getResources().getString(R.string.Doc_List_UntitledDocument);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m34126a(Document document, am amVar) throws Exception {
        amVar.starDoc(document.mo32472o(), document.mo32483t(), document.mo32456j());
        return true;
    }

    /* renamed from: b */
    public static boolean m34176b(Document document, AccountService.Account account) {
        if (document == null || account == null || !TextUtils.equals(document.mo32457k(), account.f14584a)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static NetService.C5076e m34122a(C10917c cVar, Context context, NetService.C5076e eVar) {
        if (eVar == null) {
            C13479a.m54764b("DocumentUtils", "addThumbnailParams()...request is null");
            return null;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.list_grid_item_height);
        eVar.mo20145a("thumbnail_width", String.valueOf(C13749l.m55736a() / 2));
        eVar.mo20145a("thumbnail_height", String.valueOf(dimensionPixelSize));
        eVar.mo20145a("thumbnail_policy", String.valueOf(1));
        return eVar;
    }

    /* renamed from: a */
    public static AbstractC68307f<List<Document>> m34125a(RecyclerView recyclerView, List<Document> list, int i) {
        return AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48480d()).mo238020d(new Function(list, i) {
            /* class com.bytedance.ee.bear.list.$$Lambda$f$HweMTVKL0GJwL0ad2N33A9IEU */
            public final /* synthetic */ List f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8292f.m34137a(RecyclerView.this, this.f$1, this.f$2, (Boolean) obj);
            }
        });
    }

    /* renamed from: b */
    public static void m34170b(C10917c cVar, Document document, String str, String str2) {
        ListAnalysis.m32503a(C5234y.m21391b(), str2, str, "star", document);
        cVar.mo41508c(am.class).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.$$Lambda$f$WZaOPBYvqG7eazbCiTw73jGM */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8292f.m34126a(Document.this, (am) obj);
            }
        }).mo238001b($$Lambda$f$vtJnYnPfMF1znkOhVj_pkUsl0jw.INSTANCE, $$Lambda$f$EJ23TCB4DAZ1vfNlA0rVzzWOj8.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m34127a(boolean z, Document document, boolean z2, String str, Activity activity, am amVar) throws Exception {
        if (z) {
            amVar.cancelManualOffline(document.mo32472o(), document.mo32483t(), z2, str);
        } else {
            amVar.manualOfflineDownload(true, z2, str, true, document, new DocumentUtils$1(activity));
        }
        return true;
    }
}
