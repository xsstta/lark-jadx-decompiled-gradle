package com.ss.android.lark.integrator.im.chat.dependency;

import com.bytedance.lark.pb.contact.v2.PushContactApplicationBannerAffectEvent;
import com.ss.android.lark.biz.core.api.AbstractC29543ag;
import com.ss.android.lark.biz.core.api.AbstractC29544ah;
import com.ss.android.lark.biz.core.api.resource.AbstractC29581c;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.p1667g.AbstractC33992b;
import com.ss.android.lark.dependency.AbstractC36462ai;
import com.ss.android.lark.ding.dto.C36636a;
import com.ss.android.lark.ding.p1803a.AbstractC36620b;
import com.ss.android.lark.ding.p1803a.AbstractC36621c;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.integrator.im.p2026f.C39587a;
import com.ss.android.lark.integrator.im.p2040r.C39766a;
import com.ss.android.lark.listener.IPushDingConfirmListener;
import com.ss.android.lark.listener.IPushDingListener;
import com.ss.android.lark.p2392o.AbstractC48700g;
import com.ss.android.lark.p2392o.AbstractC48701j;
import com.ss.android.lark.p2392o.AbstractC48704m;
import com.ss.android.lark.p2392o.AbstractC48706p;
import com.ss.android.lark.sticker.dto.Sticker;
import com.ss.android.lark.sticker.p2714a.C55013i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.integrator.im.chat.dependency.aa */
class C39489aa implements AbstractC36462ai {

    /* renamed from: a */
    private static Map<Object, Object> f100903a = new ConcurrentHashMap();

    /* renamed from: b */
    private static Map<IPushDingListener, AbstractC36621c> f100904b = new ConcurrentHashMap();

    /* renamed from: c */
    private static Map<AbstractC48701j, AbstractC29544ah> f100905c = new ConcurrentHashMap();

    /* renamed from: d */
    private static Map<AbstractC48704m, AbstractC29581c> f100906d = new ConcurrentHashMap();

    /* renamed from: e */
    private static Map<IPushDingConfirmListener, AbstractC36620b> f100907e = new ConcurrentHashMap();

    /* renamed from: f */
    private static Map<AbstractC48706p, C55013i.AbstractC55018a> f100908f = new ConcurrentHashMap();

    /* renamed from: g */
    private static Map<AbstractC48700g, AbstractC29543ag> f100909g = new ConcurrentHashMap();

    /* renamed from: h */
    private static Map<AbstractC48700g, AbstractC29543ag> f100910h = new ConcurrentHashMap();

    C39489aa() {
    }

    @Override // com.ss.android.lark.dependency.AbstractC36462ai
    /* renamed from: a */
    public void mo134443a(AbstractC33992b bVar) {
        C39603g.m157159a().getCCMDependency().mo143295a(bVar);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36462ai
    /* renamed from: b */
    public void mo134450b(AbstractC33992b bVar) {
        C39603g.m157159a().getCCMDependency().mo143301b(bVar);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36462ai
    /* renamed from: a */
    public void mo134444a(AbstractC48700g gVar) {
        if (gVar != null) {
            gVar.getClass();
            $$Lambda$JElkgxlXFSpwMJMZO2WXOgLHIyc r0 = new AbstractC29543ag() {
                /* class com.ss.android.lark.integrator.im.chat.dependency.$$Lambda$JElkgxlXFSpwMJMZO2WXOgLHIyc */

                @Override // com.ss.android.lark.biz.core.api.AbstractC29543ag
                public final void onPushContactStateChanged(PushContactApplicationBannerAffectEvent pushContactApplicationBannerAffectEvent) {
                    AbstractC48700g.this.mo123084a(pushContactApplicationBannerAffectEvent);
                }
            };
            f100909g.put(gVar, r0);
            C39603g.m157159a().getCoreDependency().mo143467a(r0);
        }
    }

    @Override // com.ss.android.lark.dependency.AbstractC36462ai
    /* renamed from: b */
    public void mo134451b(AbstractC48700g gVar) {
        Map<AbstractC48700g, AbstractC29543ag> map;
        AbstractC29543ag remove;
        if (gVar != null && (map = f100909g) != null && (remove = map.remove(gVar)) != null) {
            C39603g.m157159a().getCoreDependency().mo143537b(remove);
        }
    }

    @Override // com.ss.android.lark.dependency.AbstractC36462ai
    /* renamed from: a */
    public void mo134445a(final IPushDingConfirmListener hVar) {
        C394934 r0 = new AbstractC36620b() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39489aa.C394934 */

            @Override // com.ss.android.lark.ding.p1803a.AbstractC36620b
            /* renamed from: a */
            public void mo135094a(C36636a aVar, MessageInfo messageInfo) {
                hVar.mo123068a(messageInfo);
            }
        };
        f100907e.put(hVar, r0);
        C39587a.m157080a().mo135083a(r0);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36462ai
    /* renamed from: b */
    public void mo134452b(IPushDingConfirmListener hVar) {
        AbstractC36620b bVar = f100907e.get(hVar);
        f100907e.remove(hVar);
        if (bVar != null) {
            C39587a.m157080a().mo135087b(bVar);
        }
    }

    @Override // com.ss.android.lark.dependency.AbstractC36462ai
    /* renamed from: a */
    public void mo134446a(final IPushDingListener iVar) {
        C394923 r0 = new AbstractC36621c() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39489aa.C394923 */

            @Override // com.ss.android.lark.ding.p1803a.AbstractC36621c
            /* renamed from: a */
            public void mo135095a(C36636a aVar, MessageInfo messageInfo) {
                iVar.mo123069a(messageInfo);
            }
        };
        f100904b.put(iVar, r0);
        C39587a.m157080a().mo135084a(r0);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36462ai
    /* renamed from: b */
    public void mo134453b(IPushDingListener iVar) {
        AbstractC36621c cVar = f100904b.get(iVar);
        f100904b.remove(iVar);
        if (cVar != null) {
            C39587a.m157080a().mo135088b(cVar);
        }
    }

    @Override // com.ss.android.lark.dependency.AbstractC36462ai
    /* renamed from: a */
    public void mo134447a(final AbstractC48701j jVar) {
        C394912 r0 = new AbstractC29544ah() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39489aa.C394912 */

            @Override // com.ss.android.lark.biz.core.api.AbstractC29544ah
            /* renamed from: a */
            public void mo105589a(String str, String str2, boolean z, int i) {
                jVar.mo123077a(str, str2, z, i);
            }
        };
        f100905c.put(jVar, r0);
        C39603g.m157159a().getCoreDependency().mo143468a(r0);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36462ai
    /* renamed from: b */
    public void mo134454b(AbstractC48701j jVar) {
        AbstractC29544ah ahVar = f100905c.get(jVar);
        f100905c.remove(jVar);
        if (ahVar != null) {
            C39603g.m157159a().getCoreDependency().mo143538b(ahVar);
        }
    }

    @Override // com.ss.android.lark.dependency.AbstractC36462ai
    /* renamed from: a */
    public void mo134448a(final AbstractC48704m mVar) {
        C394901 r0 = new AbstractC29581c() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39489aa.C394901 */

            @Override // com.ss.android.lark.biz.core.api.resource.AbstractC29581c
            /* renamed from: a */
            public void mo105862a(String str, int i, long j, long j2) {
                mVar.mo123078a(str, i);
            }
        };
        f100906d.put(mVar, r0);
        C39603g.m157159a().getCoreDependency().mo143478a(r0);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36462ai
    /* renamed from: b */
    public void mo134455b(AbstractC48704m mVar) {
        AbstractC29581c cVar = f100906d.get(mVar);
        f100906d.remove(mVar);
        if (cVar != null) {
            C39603g.m157159a().getCoreDependency().mo143546b(cVar);
        }
    }

    @Override // com.ss.android.lark.dependency.AbstractC36462ai
    /* renamed from: a */
    public void mo134449a(final AbstractC48706p pVar) {
        if (pVar != null) {
            C394945 r0 = new C55013i.AbstractC55018a() {
                /* class com.ss.android.lark.integrator.im.chat.dependency.C39489aa.C394945 */

                @Override // com.ss.android.lark.sticker.p2714a.C55013i.AbstractC55018a
                /* renamed from: a */
                public void mo143353a(boolean z, boolean z2, List<Sticker> list) {
                    ArrayList arrayList = new ArrayList();
                    for (Sticker sticker : list) {
                        if (sticker != null) {
                            arrayList.add(sticker.getKey());
                        }
                    }
                    pVar.mo123108a(arrayList);
                }
            };
            f100908f.put(pVar, r0);
            C39766a.m157868a().mo187807a(r0);
        }
    }

    @Override // com.ss.android.lark.dependency.AbstractC36462ai
    /* renamed from: b */
    public void mo134456b(AbstractC48706p pVar) {
        C55013i.AbstractC55018a aVar;
        if (pVar != null && (aVar = f100908f.get(pVar)) != null) {
            f100908f.remove(pVar);
            C39766a.m157868a().mo187812b(aVar);
        }
    }
}
