package com.ss.android.lark.feed;

import android.view.View;
import com.bytedance.ee.lark.plugin_annotation.bean.LKOpenApiBizDomain;
import com.larksuite.component.openplatform.plugins.config.LKOpenApiAccessConfig;
import com.larksuite.component.openplatform.plugins.config.LKPluginConfig;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.biz.im.api.AbstractC29620m;
import com.ss.android.lark.featuregating.service.util.FeedFgSyncUtil;
import com.ss.android.lark.feed.app.C37480d;
import com.ss.android.lark.feed.app.conversationbox.C37434c;
import com.ss.android.lark.feed.app.guide.C37609c;
import com.ss.android.lark.feed.app.model.C37668a;
import com.ss.android.lark.feed.app.model.event.ChatStartEvent;
import com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent;
import com.ss.android.lark.feed.app.plugin.ChatBadgePlugin;
import com.ss.android.lark.feed.interfaces.AbstractC38093d;
import com.ss.android.lark.feed.interfaces.AbstractC38094e;
import com.ss.android.lark.feed.interfaces.AbstractC38095f;
import com.ss.android.lark.feed.interfaces.AbstractC38098i;
import com.ss.android.lark.feed.interfaces.AbstractC38109s;
import com.ss.android.lark.feed.interfaces.AbstractC38114x;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.p1847a.C37269d;
import com.ss.android.lark.feed.p1847a.C37270f;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.feed.p1874e.C38083a;
import com.ss.android.lark.feed.service.impl.C38146f;
import com.ss.android.lark.feed.service.impl.C38167l;
import com.ss.android.lark.feed.service.impl.C38173m;
import com.ss.android.lark.feed.service.p1884a.AbstractC38117a;
import com.ss.android.lark.larkconfig.export.C41149a;
import com.ss.android.lark.utils.C57762aa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.feed.a */
public class C37262a {

    /* renamed from: a */
    C57762aa f95667a = new C57762aa();

    /* renamed from: k */
    public String mo136987k() {
        return "mobile_switch_team_guidance_v2";
    }

    /* renamed from: l */
    public String mo136988l() {
        return "mobile_setting_sidebar";
    }

    /* renamed from: m */
    public String mo136989m() {
        return "mobile_ug_team_join_switch";
    }

    /* renamed from: n */
    public String mo136990n() {
        return "pc_multi_tenant";
    }

    /* renamed from: r */
    public void mo136992r() {
        FeedFgSyncUtil.m146723c();
    }

    /* renamed from: a */
    public static AbstractC38037a m146726a() {
        return C37268c.m146766b();
    }

    /* renamed from: o */
    public static Map<String, Boolean> m146727o() {
        return C37269d.m146768a();
    }

    /* renamed from: d */
    public AbstractC38095f mo136980d() {
        return C38146f.m149976a();
    }

    /* renamed from: e */
    public AbstractC38117a mo136981e() {
        return C38146f.m149976a();
    }

    /* renamed from: f */
    public AbstractC38114x mo136982f() {
        return C38173m.m150043b();
    }

    /* renamed from: g */
    public AbstractC38098i mo136983g() {
        return C37480d.m147447a();
    }

    /* renamed from: i */
    public AbstractC38093d mo136985i() {
        return C37668a.m148111a();
    }

    /* renamed from: j */
    public List<String> mo136986j() {
        return C37270f.m146778a();
    }

    /* renamed from: p */
    public View mo136991p() {
        return C37609c.C37610a.m147868a();
    }

    /* renamed from: q */
    public static Map<String, C41149a> m146728q() {
        HashMap hashMap = new HashMap();
        hashMap.put("messenger_feed_load_count", C41149a.f104927a);
        return hashMap;
    }

    /* renamed from: b */
    public void mo136977b() {
        mo136983g().mo137450b();
        C37668a.m148111a().mo138103b();
    }

    /* renamed from: c */
    public void mo136979c() {
        C37668a.m148111a().mo138105c();
        mo136983g().mo137454c();
    }

    /* renamed from: h */
    public AbstractC38094e mo136984h() {
        return (AbstractC38094e) this.f95667a.mo196049a(AbstractC38094e.class, new C57762aa.AbstractC57763a<AbstractC38094e>() {
            /* class com.ss.android.lark.feed.C37262a.C372631 */

            /* renamed from: a */
            public AbstractC38094e mo133374b(Class<AbstractC38094e> cls) {
                return new C37434c();
            }
        });
    }

    /* renamed from: s */
    public static List<LKPluginConfig> m146729s() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new LKPluginConfig.C25571a().mo88745a(new ChatBadgePlugin()).mo88741a(LKOpenApiBizDomain.MESSENGER).mo88744a(new LKOpenApiAccessConfig.C25569a().mo88733a(LKOpenApiBizDomain.OPEN_PLATFORM).mo88736a(false).mo88737a()).mo88744a(new LKOpenApiAccessConfig.C25569a().mo88733a(LKOpenApiBizDomain.PANO).mo88737a()).mo88749a());
        return arrayList;
    }

    /* renamed from: b */
    public void mo136978b(AbstractC38109s sVar) {
        C38167l.m150039a().mo139531b(sVar);
    }

    /* renamed from: a */
    public void mo136973a(AbstractC29620m mVar) {
        C38083a.m149814a().mo139405a(mVar);
    }

    public C37262a(AbstractC38037a aVar) {
        C37268c.m146764a(this);
        C37268c.m146765a(aVar);
    }

    /* renamed from: a */
    public void mo136974a(AbstractC38109s sVar) {
        C38167l.m150039a().mo139529a(sVar);
    }

    /* renamed from: a */
    public void mo136975a(String str) {
        EventBus.getDefault().trigger(new ChatStartEvent(str));
    }

    /* renamed from: a */
    public void mo136976a(boolean z) {
        EventBus.getDefault().trigger(new ShortcutAnimationEvent(ShortcutAnimationEvent.AnimationStatus.TENANT_CHANGE));
    }
}
