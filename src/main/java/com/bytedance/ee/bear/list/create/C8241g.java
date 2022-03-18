package com.bytedance.ee.bear.list.create;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.contract.create.DocumentCreateInfo;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.contract.p283g.C5174a;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.C8522k;
import com.bytedance.ee.bear.list.DocumentCreateHelper;
import com.bytedance.ee.bear.list.dto.AbstractC8276b;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.quoto.AbstractC10575k;
import com.bytedance.ee.bear.quoto.FullQuotoConfig;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.create.g */
public class C8241g {
    /* renamed from: a */
    private static void m33841a(C8237e eVar, String str) {
        AbstractC10740f fVar = (AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class);
        int b = C8275a.f22371d.mo32555b();
        if ("action_doc_create".equals(str)) {
            b = C8275a.f22371d.mo32555b();
        } else if ("action_sheet_create".equals(str)) {
            b = C8275a.f22372e.mo32555b();
        } else if ("action_bitable_create".equals(str)) {
            b = C8275a.f22373f.mo32555b();
        } else if ("action_docx_create".equals(str)) {
            b = C8275a.f22378k.mo32555b();
        } else if ("action_mindnote_create".equals(str)) {
            b = C8275a.f22374g.mo32555b();
        } else if ("action_slide_open".equals(str)) {
            b = C8275a.f22376i.mo32555b();
        } else if ("action_docx_open".equals(str)) {
            b = C8275a.f22378k.mo32555b();
        } else if ("action_bitable_open".equals(str)) {
            b = C8275a.f22373f.mo32555b();
        }
        C8522k.m35387a().mo33287a(eVar.mo32334b(), b, eVar.mo32335c(), eVar.mo32337e()).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(b, fVar, eVar) {
            /* class com.bytedance.ee.bear.list.create.$$Lambda$g$g7cIWgeWykWrbGvNySD8V7kmU */
            public final /* synthetic */ int f$0;
            public final /* synthetic */ AbstractC10740f f$1;
            public final /* synthetic */ C8237e f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8241g.m33833a(this.f$0, this.f$1, this.f$2, (OfflineDoc) obj);
            }
        }, $$Lambda$g$LGfPnqu_PnWZQtvllv6AAtmE8.INSTANCE);
    }

    /* renamed from: a */
    public static void m33842a(C10917c cVar, String str, String str2) {
        RouteBean routeBean = new RouteBean();
        routeBean.mo40622h(str);
        routeBean.mo40615d(str2);
        routeBean.mo40620g(SmEvents.EVENT_HB_NOTICE_DISCONNECT);
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17293a(str, routeBean);
    }

    /* renamed from: a */
    public static void m33834a(Context context, C8237e eVar) {
        m33841a(eVar, "action_doc_create");
    }

    /* renamed from: a */
    public static AbstractC68307f<OfflineDoc> m33831a(int i, String str, String str2, boolean z) {
        C13479a.m54764b("DocumentCreator", "createOfflineDocumentFlow()...type = " + i + ", module = " + str2 + "isSpaceV2 " + z);
        return C8522k.m35387a().mo33287a(str, i, str2, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m33833a(int i, AbstractC10740f fVar, C8237e eVar, OfflineDoc offlineDoc) throws Exception {
        if (!TextUtils.isEmpty(offlineDoc.getFakeToken())) {
            String a = C6313i.m25327a().mo25382a(C8275a.m34050a(i), offlineDoc.getFakeToken(), "tab_create");
            RouteBean routeBean = new RouteBean();
            routeBean.mo40622h(a);
            routeBean.mo40615d(offlineDoc.getName());
            fVar.mo17293a(a, routeBean);
            C8228a.m33793a(C5234y.m21391b(), C8275a.m34050a(i), offlineDoc.getObj_token(), C5174a.m21161a(C4511g.m18594d().mo17344E()), eVar.mo32334b(), eVar.mo32335c());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m33839a(Context context, String str, String str2, C10917c cVar, DocumentCreateInfo documentCreateInfo) throws Exception {
        C13479a.m54764b("DocumentCreator", "onChanged: create doc successfully, show it.");
        m33840a(context, str, str2, cVar, documentCreateInfo.mo20275c());
    }

    /* renamed from: a */
    public static AbstractC68307f<DocumentCreateInfo> m33832a(C10917c cVar, int i, String str, String str2, boolean z) {
        C13479a.m54764b("DocumentCreator", "createOnlineDocumentFlow()...type = " + i + ", module = " + str2 + "isSpaceV2 " + z);
        return new DocumentCreateHelper(cVar).mo31350a(i, "", "", str, str2, z);
    }

    /* renamed from: a */
    public static void m33840a(Context context, String str, String str2, C10917c cVar, String str3) {
        m33842a(cVar, Uri.parse(str3).buildUpon().appendQueryParameter("from", str2).toString(), str);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m33844b(Context context, C8237e eVar, String str, AbstractC8276b bVar, C10917c cVar, Throwable th) throws Exception {
        C13479a.m54759a("DocumentCreator", "createDocument(): fail", th);
        m33835a(context, eVar, str, bVar, cVar, th);
    }

    /* renamed from: a */
    public static void m33835a(Context context, C8237e eVar, String str, AbstractC8276b bVar, C10917c cVar, Throwable th) {
        m33836a(context, eVar, str, bVar, cVar, th, context.getString(R.string.Doc_Facade_CreateFailed));
    }

    /* renamed from: a */
    public static void m33836a(Context context, C8237e eVar, String str, AbstractC8276b bVar, C10917c cVar, Throwable th, String str2) {
        C13479a.m54759a("DocumentCreator", "template create fail", th);
        AbstractC5233x b = C5234y.m21391b();
        al d = C4511g.m18594d();
        if (th instanceof NetService.ServerErrorException) {
            NetService.ServerErrorException serverErrorException = (NetService.ServerErrorException) th;
            int code = serverErrorException.getCode();
            String msg = serverErrorException.getMsg();
            if (code == 11001) {
                if (C4511g.m18594d().mo17345F()) {
                    CreateErrorDialogUtils.m33808a((Activity) context, cVar, eVar, serverErrorException.getMsg());
                } else {
                    ((AbstractC10575k) KoinJavaComponent.m268610a(AbstractC10575k.class)).mo40012a((FragmentActivity) context, FullQuotoConfig.CREATE_TEMPLATE);
                }
                CreateErrorDialogUtils.m33810a(eVar, cVar, "popup_window");
                return;
            } else if (code == 900011002) {
                ((AbstractC10575k) KoinJavaComponent.m268610a(AbstractC10575k.class)).mo40013a((FragmentActivity) context, null, null, !TextUtils.isEmpty(eVar.mo32334b()));
                return;
            } else if (code == 4202) {
                Toast.showFailureText(context, (int) R.string.CreationMobile_DataUpgrade_Locked_toast);
                return;
            } else {
                C8228a.m33792a(b, eVar.mo32335c(), str, code, msg, C5174a.m21161a(d.mo17344E()));
            }
        } else {
            C8228a.m33792a(b, eVar.mo32335c(), str, -1, "unknown", C5174a.m21161a(d.mo17344E()));
        }
        Toast.showFailureText(context, str2, 0);
        if (bVar != null) {
            bVar.mo32559a(th);
        }
    }

    /* renamed from: a */
    private static void m33837a(Context context, C8237e eVar, String str, String str2, String str3, AbstractC68307f<DocumentCreateInfo> fVar, AbstractC8276b bVar) {
        if (!(context instanceof Activity)) {
            C13479a.m54758a("DocumentCreator", "createDocument(): context not is Activity");
        } else if (fVar == null) {
            C13479a.m54758a("DocumentCreator", "createInfoFlowable NULL");
        } else {
            C13479a.m54764b("DocumentCreator", "createDocument(): documentType = " + str);
            C10917c a = eVar.mo32333a();
            fVar.mo237985a(C11678b.m48481e()).mo238001b(new Consumer(context, str2, str3, a) {
                /* class com.bytedance.ee.bear.list.create.$$Lambda$g$UDPx43M1FZy60NmPsnchGCfvYYo */
                public final /* synthetic */ Context f$0;
                public final /* synthetic */ String f$1;
                public final /* synthetic */ String f$2;
                public final /* synthetic */ C10917c f$3;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C8241g.m33839a(this.f$0, this.f$1, this.f$2, this.f$3, (DocumentCreateInfo) obj);
                }
            }, new Consumer(context, eVar, str, bVar, a) {
                /* class com.bytedance.ee.bear.list.create.$$Lambda$g$qtqZVopXhcpQZ4o7fQ7vVvqOVE4 */
                public final /* synthetic */ Context f$0;
                public final /* synthetic */ C8237e f$1;
                public final /* synthetic */ String f$2;
                public final /* synthetic */ AbstractC8276b f$3;
                public final /* synthetic */ C10917c f$4;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C8241g.m33844b(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Throwable) obj);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m33838a(Context context, String str, int i, boolean z, boolean z2, boolean z3, C8237e eVar, AbstractC8276b bVar, boolean z4) {
        String str2;
        AbstractC68307f<DocumentCreateInfo> a = new DocumentCreateHelper(eVar.mo32333a()).mo31353a(str, i, eVar.mo32334b(), z, z2, z3, eVar.mo32335c(), z4, null, false, "");
        if (z) {
            str2 = "space_template";
        } else {
            str2 = "new_template";
        }
        m33837a(context, eVar, C8275a.m34050a(i), "", str2, a, bVar);
    }
}
