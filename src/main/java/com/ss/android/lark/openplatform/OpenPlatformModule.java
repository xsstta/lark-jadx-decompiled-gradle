package com.ss.android.lark.openplatform;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.ee.webapp.C13802g;
import com.bytedance.ee.webapp.v2.AbstractC13836d;
import com.bytedance.ee.webapp.v2.WebAppContainerDelegate;
import com.bytedance.lark.pb.basic.v1.CardContent;
import com.larksuite.component.openplatform.plugins.config.LKPluginConfig;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.dto.TabAppInfo;
import com.ss.android.lark.openplatform.common.C48825b;
import com.ss.android.lark.openplatform.common.C48828c;
import com.ss.android.lark.openplatform.common.C48830g;
import com.ss.android.lark.openplatform.common.bean.TriggerBizType;
import com.ss.android.lark.openplatform.openapp.AppOpenService;
import com.ss.android.lark.openplatform.openapp.BotOpenData;
import com.ss.android.lark.openplatform.p2399a.AbstractC48793a;
import com.ss.android.lark.openplatform.p2400b.C48801a;
import com.ss.android.lark.openplatform.p2401c.C48807b;
import com.ss.android.lark.openplatform.p2403d.C48831a;
import com.ss.android.lark.openplatform.plus.C48835a;
import com.ss.android.lark.openplatform.plus.C48843d;
import com.ss.android.lark.openplatform.plus.C48850e;
import com.ss.android.lark.openplatform.plus.C48852g;
import com.ss.android.lark.openplatform.plus.TriggerCodeManager;
import com.ss.android.lark.openplatform.shareApp.dto.AbstractC48867a;
import com.ss.android.lark.openplatform.shareApp.dto.C48869c;
import com.ss.android.lark.openplatform.shareApp.dto.ShareAppDataV2;
import com.ss.android.lark.openplatform.shareApp.dto.ShareAppType;
import com.ss.android.lark.openplatform.shareApp.p2404a.C48853a;
import com.ss.android.lark.openplatform.webapp.p2406a.C48870a;
import com.ss.android.lark.openplatform.webapp.p2408c.AbstractC48875a;
import com.ss.android.lark.openplatform.webapp.p2408c.p2409a.C48876a;
import com.ss.android.lark.openplatform.webapp.tab.C48893d;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.openbusiness.OpbScene;
import com.ss.android.openbusiness.bot.GroupBotRouter;
import com.ss.android.openbusiness.data.AppShortCutChatData;
import com.ss.android.openbusiness.data.netdata.C59572d;
import com.ss.android.openbusiness.event.p3008a.C59597e;
import com.ss.android.openbusiness.p3004b.AbstractC59482a;
import com.ss.android.openbusiness.p3004b.C59492c;
import com.ss.android.openbusiness.p3004b.p3005a.AbstractC59484a;
import com.ss.android.openbusiness.p3004b.p3005a.C59485b;
import com.ss.android.openbusiness.p3006c.C59541d;
import com.ss.android.openbusiness.p3006c.C59545e;
import com.ss.android.openbusiness.p3006c.C59549f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class OpenPlatformModule {

    /* renamed from: a */
    public volatile boolean f122574a;

    /* renamed from: b */
    private final C48807b f122575b = new C48807b(m192198d());

    /* renamed from: c */
    private final AbstractC48875a f122576c = new C48876a();

    /* renamed from: d */
    private final AppOpenService f122577d = new AppOpenService(m192198d());

    /* renamed from: e */
    private HashMap<String, WeakReference<AbstractC13836d>> f122578e = new HashMap<>();

    /* renamed from: f */
    private C48835a f122579f;

    @Retention(RetentionPolicy.SOURCE)
    public @interface EnvTypes {
    }

    /* renamed from: com.ss.android.lark.openplatform.OpenPlatformModule$a */
    public interface AbstractC48791a {
        /* renamed from: a */
        void mo144864a(String str);

        /* renamed from: a */
        void mo144865a(List<IPlusItem> list);

        /* renamed from: a */
        void mo144866a(List<IPlusItem> list, List<IPlusItem> list2);
    }

    /* renamed from: com.ss.android.lark.openplatform.OpenPlatformModule$b */
    public interface AbstractC48792b {
        void onResult(boolean z, boolean z2, String str);
    }

    /* renamed from: f */
    public AbstractC48875a mo170514f() {
        return this.f122576c;
    }

    /* renamed from: a */
    public void mo170500a(Context context, List<String> list, CardContent cardContent, boolean z, AbstractC48792b bVar) {
        new C48843d().mo170635a(context, list, cardContent, z, bVar);
    }

    /* renamed from: a */
    public void mo170505a(AppShortCutChatData appShortCutChatData, AbstractC48791a aVar) {
        if (appShortCutChatData != null) {
            C48835a aVar2 = new C48835a(appShortCutChatData);
            this.f122579f = aVar2;
            aVar2.mo170623a(aVar, new C48835a.AbstractC48839a() {
                /* class com.ss.android.lark.openplatform.OpenPlatformModule.C487892 */

                @Override // com.ss.android.lark.openplatform.plus.C48835a.AbstractC48839a
                /* renamed from: a */
                public void mo170519a(OpbScene opbScene) {
                    C53241h.m205898b("OpenPlatformModule", "consumed update");
                    OpenPlatformModule.this.f122574a = false;
                }
            });
        }
    }

    /* renamed from: a */
    public void mo170504a(AppShortCutChatData appShortCutChatData) {
        if (this.f122579f != null && TextUtils.equals(appShortCutChatData.mo202946e(), this.f122579f.mo170618a().mo202946e()) && this.f122574a) {
            this.f122579f.mo170626b();
            this.f122574a = false;
        }
    }

    /* renamed from: a */
    public void mo170502a(BotOpenData bVar) {
        this.f122577d.mo170591a(bVar);
    }

    /* renamed from: a */
    public void mo170506a(String str, WebAppContainerDelegate webAppContainerDelegate) {
        this.f122578e.put(str, new WeakReference<>(webAppContainerDelegate));
    }

    /* renamed from: a */
    public void mo170501a(Context context, List<String> list, List<Integer> list2, String str) {
        m192198d().getAppCenterDependency().mo144967a(m192198d().getContext());
        C59549f.m231038a(OpbScene.MESSAGE_ACTION);
        C48831a.m192403a().mo170580a(context, list, list2, str);
    }

    /* renamed from: a */
    public void mo170503a(OpbScene opbScene, final C59597e eVar) {
        if (opbScene == OpbScene.MESSAGE_ACTION) {
            final C48831a.C48833b b = C48831a.m192403a().mo170581b(eVar.mo203010a());
            if (b == null) {
                C53241h.m205894a("OpenPlatformModule", "get null MessageActionData, uuid: " + eVar.mo203010a());
                return;
            }
            m192198d().getTriggerCode(new Function1<String, Unit>() {
                /* class com.ss.android.lark.openplatform.OpenPlatformModule.C487903 */

                /* renamed from: a */
                public Unit invoke(String str) {
                    String generateUrlWithAction = OpenPlatformModule.m192198d().generateUrlWithAction(eVar.mo203011b(), str);
                    TriggerCodeManager.f122716b.mo170647a().mo170646a(str, new C48852g(eVar.mo203012c(), b.mo170583b(), b.mo170584c()));
                    TriggerCodeManager.f122716b.mo170647a().mo170645a(str, new C48850e(new AppShortCutChatData(b.mo170582a()), OpenPlatformModule.m192198d().getContext(), TriggerBizType.MESSAGE_ACTION));
                    OpenPlatformModule.m192198d().openByAppLinkWithScene(OpenPlatformModule.m192198d().getContext(), generateUrlWithAction, 1516);
                    return null;
                }
            });
            return;
        }
        C48835a a = C48831a.m192403a().mo170578a(eVar.mo203010a());
        if (a == null) {
            C53241h.m205894a("OpenPlatformModule", "get null gadgetManager, uuid: " + eVar.mo203010a());
            return;
        }
        a.mo170622a(m192198d().getContext(), eVar.mo203012c(), eVar.mo203011b(), eVar.mo203013d());
    }

    /* renamed from: b */
    public static Map<String, Boolean> m192196b() {
        return C48828c.m192372a();
    }

    /* renamed from: c */
    public static Map<String, Boolean> m192197c() {
        return C48825b.m192365a();
    }

    /* renamed from: g */
    public static List<LKPluginConfig> m192199g() {
        return new LinkedList();
    }

    /* renamed from: d */
    public static AbstractC48793a m192198d() {
        return (AbstractC48793a) ApiUtils.getApi(AbstractC48793a.class);
    }

    /* renamed from: a */
    public void mo170493a() {
        C59485b.m230885a().mo202791a(new AbstractC59484a() {
            /* class com.ss.android.lark.openplatform.OpenPlatformModule.C487871 */

            @Override // com.ss.android.openbusiness.p3004b.p3005a.AbstractC59484a
            /* renamed from: a */
            public void mo170515a(String str, long j) {
                if (TextUtils.equals(str, "plus_menu")) {
                    C53241h.m205898b("OpenPlatformModule", "receive push, fetch config apps, timestamp: " + j);
                    C59541d.m231037a(C59545e.f147831r).flush();
                    C59492c.m230889a().mo202797b(LarkContext.getApplication(), OpbScene.PLUS_MENU_SINGLE, new AbstractC59482a.AbstractC59483a<List<C59572d>>() {
                        /* class com.ss.android.lark.openplatform.OpenPlatformModule.C487871.C487881 */

                        @Override // com.ss.android.openbusiness.p3004b.AbstractC59482a.AbstractC59483a
                        /* renamed from: a */
                        public void mo170517a(String str) {
                        }

                        /* renamed from: a */
                        public void mo170516a(List<C59572d> list) {
                            OpenPlatformModule.this.f122574a = true;
                        }
                    });
                }
            }
        });
    }

    /* renamed from: e */
    public boolean mo170513e() {
        return m192198d().getFgValue("message.action.entry.enable");
    }

    public OpenPlatformModule() {
        mo170493a();
    }

    /* renamed from: a */
    public void mo170494a(Context context) {
        mo170508b(context);
    }

    /* renamed from: d */
    public boolean mo170511d(Context context) {
        return C48801a.m192257a(context);
    }

    /* renamed from: b */
    public String mo170507b(String str) {
        return C48830g.m192396a(str);
    }

    /* renamed from: c */
    public WeakReference<AbstractC13836d> mo170509c(String str) {
        return this.f122578e.get(str);
    }

    /* renamed from: b */
    public void mo170508b(Context context) {
        if (C13802g.m55926a().mo50866b() == null) {
            C13802g.m55926a().mo50865a(new C48870a(context, m192198d()));
        }
    }

    /* renamed from: d */
    public boolean mo170512d(String str) {
        WeakReference<AbstractC13836d> weakReference;
        if (!TextUtils.isEmpty(str) && (weakReference = this.f122578e.get(str)) != null && weakReference.get() != null && weakReference.get().mo50991a()) {
            return weakReference.get().mo51011i();
        }
        return false;
    }

    /* renamed from: a */
    public C48850e mo170492a(String str) {
        C53241h.m205898b("GADGET_SENG_MSG", "OpenPlatformModule getChatByTriggerCode tc:" + str);
        if (m192198d().getFgValue("lark.app.plus") || mo170513e()) {
            C48850e a = TriggerCodeManager.f122716b.mo170647a().mo170643a(str);
            if (a == null || a.mo170641a() == null) {
                C53241h.m205898b("GADGET_SENG_MSG", "get triggerBean. bean is null or chat is null");
                return null;
            }
            C53241h.m205898b("GADGET_SENG_MSG", "get triggerBean. bean is not null. chat id is " + a.mo170641a().mo202946e());
            return a;
        }
        C53241h.m205898b("GADGET_SENG_MSG", "plus menu fg is false");
        return null;
    }

    /* renamed from: c */
    public Map<String, AbstractC29186b> mo170510c(Context context) {
        HashMap hashMap = new HashMap();
        this.f122575b.mo170539a(context, hashMap);
        this.f122575b.mo170546d(context, hashMap);
        this.f122575b.mo170551i(context, hashMap);
        this.f122575b.mo170547e(context, hashMap);
        this.f122575b.mo170544b(context, hashMap);
        this.f122575b.mo170545c(context, hashMap);
        this.f122575b.mo170552j(context, hashMap);
        this.f122575b.mo170542a(hashMap);
        this.f122575b.mo170540a(this, hashMap);
        this.f122575b.mo170549g(context, hashMap);
        this.f122575b.mo170550h(context, hashMap);
        this.f122575b.mo170548f(context, hashMap);
        this.f122575b.mo170553k(context, hashMap);
        return hashMap;
    }

    /* renamed from: a */
    public void mo170495a(Context context, IGetDataCallback<String> iGetDataCallback) {
        this.f122575b.mo170536a(context, iGetDataCallback);
    }

    /* renamed from: a */
    public Pair<Long, List<String>> mo170490a(String str, String str2) {
        C48852g a = TriggerCodeManager.f122716b.mo170647a().mo170644a(str, str2);
        if (a == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(a.mo170650c()), a.mo170649b());
    }

    /* renamed from: a */
    public AbstractC44552i mo170491a(Context context, ITitleController iTitleController, TabAppInfo tabAppInfo) {
        m192198d().getGadgetDependency().mo144960a();
        C53241h.m205898b("OpenPlatformModule", "createWebAppPageSpec and waitInit");
        return new C48893d(context, iTitleController, tabAppInfo);
    }

    /* renamed from: a */
    public void mo170499a(Context context, String str, boolean z) {
        GroupBotRouter.f147721a.mo202820a(context, str, z);
    }

    /* renamed from: a */
    public void mo170496a(Context context, ShareAppDataV2 shareAppDataV2, ShareAppType shareAppType, int i) {
        m192198d().sendShareAppV2(context, shareAppDataV2, shareAppType, i);
    }

    /* renamed from: a */
    public void mo170497a(Context context, String str, C48869c cVar, AbstractC48867a aVar) {
        C48853a.m192476a(context, str, cVar, aVar);
    }

    /* renamed from: a */
    public void mo170498a(Context context, String str, String str2, CardContent cardContent, boolean z, AbstractC48792b bVar) {
        new C48843d().mo170634a(context, str, str2, cardContent, z, bVar);
    }
}
