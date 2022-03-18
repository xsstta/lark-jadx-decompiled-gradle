package com.ss.android.lark.mail.impl.service;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.email.client.v1.FilterType;
import com.bytedance.lark.pb.email.client.v1.MailGetLabelsResponse;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.action.PushDeleteThreadAction;
import com.ss.android.lark.mail.impl.action.PushThreadChangeAction;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.lark.C42723b;
import com.ss.android.lark.mail.impl.mulprocess.C43213b;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost;
import com.ss.android.lark.mail.impl.p2161a.C41772a;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2168g.p2169a.C42130j;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.C42226b;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42286k;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.service.data.AbsDataManager;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43316c;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43317d;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43334u;
import com.ss.android.lark.mail.impl.utils.C43779n;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.p2223a.C43751a;
import ee.android.framework.manis.C68183b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.mail.impl.service.f */
public class C43374f extends AbsDataManager<Map<Integer, List<MailLabelEntity>>> implements AbstractC43316c, AbstractC43317d, AbstractC43334u {

    /* renamed from: o */
    private static C43374f f110247o;

    /* renamed from: a */
    private final C43751a<MailLabelEntity> f110248a = new C43751a<>(new C41772a());

    /* renamed from: b */
    private final C43751a<FilterType> f110249b = new C43751a<>(new C41772a());

    /* renamed from: c */
    private final C43751a<List<MailLabelEntity>> f110250c = new C43751a<>(new C1177w());

    /* renamed from: d */
    private final C43751a<List<MailLabelEntity>> f110251d = new C43751a<>(new C1177w());

    /* renamed from: e */
    private boolean f110252e = false;

    /* renamed from: f */
    private MailLabelEntity f110253f;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager
    /* renamed from: b */
    public String mo154935b() {
        return "MailAggregationService";
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.service.f$a */
    public static class C43378a {

        /* renamed from: a */
        C43379a<String, MailLabelEntity> f110260a;

        private C43378a() {
        }

        /* renamed from: a */
        public List<MailLabelEntity> mo155141a() {
            m172306c(this.f110260a);
            return m172302a(this.f110260a);
        }

        /* renamed from: a */
        public static C43378a m172301a(List<MailLabelEntity> list) {
            C43378a aVar = new C43378a();
            aVar.m172305b(list);
            return aVar;
        }

        /* renamed from: b */
        private List<String> m172304b(C43379a<String, MailLabelEntity> aVar) {
            ArrayList arrayList = new ArrayList();
            if (aVar.f110261a != null) {
                arrayList.addAll(m172304b(aVar.f110261a));
                arrayList.add(aVar.f110263c.mo151528l());
            }
            return arrayList;
        }

        /* renamed from: a */
        private List<MailLabelEntity> m172302a(C43379a<String, MailLabelEntity> aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.f110263c.mo151498a(m172304b(aVar));
            if (aVar.f110261a != null) {
                arrayList.add(aVar.f110263c);
            }
            for (C43379a<K, V> aVar2 : aVar.f110264d) {
                arrayList.addAll(m172302a(aVar2));
            }
            return arrayList;
        }

        /* renamed from: c */
        private int m172306c(C43379a<String, MailLabelEntity> aVar) {
            int i = 0;
            for (C43379a<K, V> aVar2 : aVar.f110264d) {
                int c = m172306c(aVar2);
                if (c > i) {
                    i = c;
                }
            }
            int i2 = i + 1;
            aVar.f110263c.mo151519f(i2);
            return i2;
        }

        /* renamed from: b */
        private void m172305b(List<MailLabelEntity> list) {
            this.f110260a = new C43379a<>(null, "", new MailLabelEntity());
            HashMap hashMap = new HashMap();
            for (MailLabelEntity mailLabelEntity : list) {
                C43379a aVar = new C43379a(null, mailLabelEntity.mo151527k(), mailLabelEntity);
                hashMap.put(aVar.f110262b, aVar);
            }
            for (C43379a<String, MailLabelEntity> aVar2 : hashMap.values()) {
                if (TextUtils.isEmpty(aVar2.f110263c.mo151492A())) {
                    m172303a(this.f110260a, aVar2);
                } else {
                    C43379a<String, MailLabelEntity> aVar3 = (C43379a) hashMap.get(aVar2.f110263c.mo151492A());
                    if (aVar3 != null) {
                        m172303a(aVar3, aVar2);
                    } else {
                        Log.m165383e("MailAggregationService", "unknown node");
                        m172303a(this.f110260a, aVar2);
                    }
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: com.ss.android.lark.mail.impl.service.f$a$a<java.lang.String, com.ss.android.lark.mail.impl.entity.MailLabelEntity> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        private void m172303a(C43379a<String, MailLabelEntity> aVar, C43379a<String, MailLabelEntity> aVar2) {
            int i = 0;
            int i2 = 0;
            while (i < aVar.f110264d.size() && aVar2.f110263c.mo151533q() >= aVar.f110264d.get(i).f110263c.mo151533q()) {
                i2++;
                i++;
            }
            aVar2.f110261a = aVar;
            aVar.f110264d.add(i2, aVar2);
        }

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.lark.mail.impl.service.f$a$a */
        public static class C43379a<K, V> {

            /* renamed from: a */
            C43379a<K, V> f110261a;

            /* renamed from: b */
            K f110262b;

            /* renamed from: c */
            V f110263c;

            /* renamed from: d */
            final List<C43379a<K, V>> f110264d = new ArrayList();

            public C43379a(C43379a aVar, K k, V v) {
                this.f110262b = k;
                this.f110263c = v;
            }
        }
    }

    /* renamed from: i */
    public C1177w<List<MailLabelEntity>> mo155121i() {
        return this.f110251d;
    }

    /* renamed from: k */
    public C1177w<List<MailLabelEntity>> mo155123k() {
        return this.f110250c;
    }

    /* renamed from: s */
    public C1177w<MailLabelEntity> mo155131s() {
        return this.f110248a;
    }

    /* renamed from: x */
    public C1177w<FilterType> mo155136x() {
        return this.f110249b;
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43316c
    /* renamed from: a */
    public void mo154985a(final List<MailLabelEntity> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("onLabelChange result : ");
        sb.append(list != null ? list.size() : 0);
        Log.m165388i(sb.toString());
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.service.C43374f.RunnableC433762 */

            public void run() {
                C43374f fVar = C43374f.this;
                fVar.mo154938b(fVar.mo155115b(list), AbsDataManager.f110206i);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo154938b(Map<Integer, List<MailLabelEntity>> map, int i) {
        if (map == null || map.isEmpty()) {
            Log.m165388i("onLabelChange empty param");
            return false;
        }
        for (Integer num : map.keySet()) {
            List<MailLabelEntity> list = map.get(num);
            StringBuilder sb = new StringBuilder();
            sb.append("label list type = ");
            sb.append(num);
            sb.append(" size = ");
            sb.append(list != null ? list.size() : 0);
            Log.m165388i(sb.toString());
        }
        m172263d(map.get(1));
        boolean b = super.mo154938b(map, i);
        this.f110251d.mo5929b(map.get(1));
        this.f110250c.mo5929b(map.get(2));
        mo155128p();
        m172265z();
        return b;
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43334u
    /* renamed from: a */
    public void mo150850a(String str, String str2) {
        m172260a(str, true);
    }

    @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager
    /* renamed from: e */
    public void mo154941e() {
        Watchers.m167209b(this);
        f110247o = null;
    }

    /* renamed from: a */
    public static void m172258a() {
        if (f110247o == null) {
            f110247o = new C43374f();
        }
    }

    /* renamed from: f */
    public static C43374f m172264f() {
        if (f110247o == null) {
            f110247o = new C43374f();
        }
        return f110247o;
    }

    /* renamed from: j */
    public List<MailLabelEntity> mo155122j() {
        return mo155121i().mo5927b();
    }

    /* renamed from: l */
    public List<MailLabelEntity> mo155124l() {
        return this.f110250c.mo5927b();
    }

    /* renamed from: r */
    public MailLabelEntity mo155130r() {
        return this.f110248a.mo5927b();
    }

    /* renamed from: w */
    public FilterType mo155135w() {
        FilterType b = this.f110249b.mo5927b();
        if (b != null) {
            return b;
        }
        return FilterType.ALL_MAIL;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m172255A() {
        mo155112a(FilterType.ALL_MAIL);
        C43350d.m172098a().mo155051q().mo5925a(new AbstractC1178x() {
            /* class com.ss.android.lark.mail.impl.service.$$Lambda$f$jIMxrZ_qXHarC0kvFFhP39YKIJ4 */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C43374f.this.m172259a((C43374f) ((Boolean) obj));
            }
        });
    }

    /* renamed from: g */
    public void mo155120g() {
        this.f110251d.mo5929b((List<MailLabelEntity>) null);
        this.f110250c.mo5929b((List<MailLabelEntity>) null);
        this.f110248a.mo5929b((MailLabelEntity) null);
        this.f110249b.mo5929b(FilterType.ALL_MAIL);
        this.f110253f = null;
    }

    /* renamed from: n */
    public void mo155126n() {
        Log.m165389i("MailAggregationService", "hideOutboxLabel");
        this.f110252e = false;
        MailLabelEntity mailLabelEntity = this.f110253f;
        if (mailLabelEntity != null) {
            mailLabelEntity.mo151509c(false);
        }
        mo154938b((Map) mo155069Q(), f110206i);
    }

    /* renamed from: o */
    public void mo155127o() {
        Log.m165389i("MailAggregationService", "showOutboxLabel");
        this.f110252e = true;
        MailLabelEntity mailLabelEntity = this.f110253f;
        if (mailLabelEntity != null) {
            mailLabelEntity.mo151509c(true);
        }
        mo154938b((Map) mo155069Q(), f110206i);
    }

    /* renamed from: t */
    public String mo155132t() {
        MailLabelEntity b = this.f110248a.mo5927b();
        if (b != null) {
            return b.mo151528l();
        }
        return C42187a.C42191c.f107469t;
    }

    /* renamed from: u */
    public boolean mo155133u() {
        MailLabelEntity r = mo155130r();
        if (r == null) {
            return false;
        }
        if (r == null || mo155116b(r) || r.mo151543z() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public String mo155137y() {
        String r = C43277a.m171921a().mo154954r();
        if (TextUtils.isEmpty(r)) {
            return null;
        }
        return C43779n.m173508a(r).getString("key_first_label_id", null);
    }

    /* renamed from: m */
    public boolean mo155125m() {
        if (C43350d.m172098a().mo155014F()) {
            return true;
        }
        if (C43350d.m172098a().mo155015G()) {
            return C41816b.m166115a().mo150154u().mo150161b("larkmail.cli.folder_gmail");
        }
        return C41816b.m166115a().mo150154u().mo150161b("larkmail.cli.folder");
    }

    /* renamed from: q */
    public String mo155129q() {
        if (C41816b.m166115a().mo150120a() != C43213b.f109974a) {
            return ((IHost) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IHost.class)).getCurrentLabelId();
        }
        MailLabelEntity r = mo155130r();
        if (r != null) {
            return r.mo151527k();
        }
        return "INBOX";
    }

    /* renamed from: v */
    public boolean mo155134v() {
        if (C41816b.m166115a().mo150154u().mo150161b("larkmail.cli.hide_ai_point")) {
            Log.m165383e("MailAggregationService", "observeSmartInboxSwitch ai fg abort");
            return false;
        }
        Boolean b = C43350d.m172098a().mo155051q().mo5927b();
        if (b != null) {
            return b.booleanValue();
        }
        return false;
    }

    private C43374f() {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.service.$$Lambda$f$r7_Jh5qaoTH2rs8N6I8VZBybB8c */

            public final void run() {
                C43374f.this.m172255A();
            }
        });
        Watchers.m167206a(this);
    }

    /* renamed from: z */
    private boolean m172265z() {
        MailLabelEntity mailLabelEntity;
        String str;
        List<MailLabelEntity> b = this.f110251d.mo5927b();
        String n = C43277a.m171921a().mo154950n();
        if (TextUtils.isEmpty(n)) {
            return false;
        }
        if (b == null || b.size() <= 0) {
            mailLabelEntity = null;
        } else {
            mailLabelEntity = b.get(0);
        }
        if (mailLabelEntity == null) {
            return false;
        }
        if (!mailLabelEntity.mo151529m()) {
            str = mailLabelEntity.mo151527k();
        } else if (mo155134v()) {
            str = "IMPORTANT";
        } else {
            str = "INBOX";
        }
        if (TextUtils.equals(str, mo155137y()) || TextUtils.isEmpty(n)) {
            return false;
        }
        Log.m165389i("MailAggregationService", "updateFirstLabelCache: " + str);
        C43779n.m173508a(n).putString("key_first_label_id", str);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0129 A[EDGE_INSN: B:69:0x0129->B:59:0x0129 ?: BREAK  , SYNTHETIC] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo155128p() {
        /*
        // Method dump skipped, instructions count: 308
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.service.C43374f.mo155128p():boolean");
    }

    /* renamed from: a */
    public void mo155112a(FilterType filterType) {
        this.f110249b.mo5929b(filterType);
    }

    /* renamed from: d */
    public boolean mo155119d(MailLabelEntity mailLabelEntity) {
        if (mo155118c(mailLabelEntity)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m172259a(Boolean bool) {
        Log.m165389i("MailAggregationService", "SmartInbox switch change");
        mo154938b((Map) mo155069Q(), f110206i);
    }

    /* renamed from: c */
    public static String m172262c(List<String> list) {
        StringBuffer stringBuffer = new StringBuffer();
        if (!CollectionUtils.isEmpty(list)) {
            for (int i = 0; i < list.size(); i++) {
                stringBuffer.append(list.get(i));
                if (i < list.size() - 1) {
                    stringBuffer.append("/");
                }
            }
        }
        return stringBuffer.toString().toLowerCase();
    }

    /* renamed from: d */
    private void m172263d(List<MailLabelEntity> list) {
        if (!CollectionUtils.isEmpty(list)) {
            for (int i = 0; i < list.size(); i++) {
                MailLabelEntity mailLabelEntity = list.get(i);
                if (mailLabelEntity.mo151529m() && list.get(i).mo151527k().equals("OUTBOX")) {
                    this.f110253f = mailLabelEntity;
                    if (this.f110252e) {
                        if (mailLabelEntity != null) {
                            mailLabelEntity.mo151509c(true);
                            return;
                        }
                        return;
                    } else if (mailLabelEntity != null) {
                        mailLabelEntity.mo151509c(false);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo155113a(MailLabelEntity mailLabelEntity) {
        this.f110248a.mo5929b(mailLabelEntity);
    }

    /* renamed from: b */
    public Map<Integer, List<MailLabelEntity>> mo155115b(List<MailLabelEntity> list) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (MailLabelEntity mailLabelEntity : list) {
            if (mailLabelEntity.mo151494a() == 1) {
                if (mailLabelEntity.mo151529m()) {
                    arrayList3.add(mailLabelEntity);
                } else {
                    arrayList4.add(mailLabelEntity);
                }
            }
            if (mailLabelEntity.mo151494a() == 2) {
                arrayList2.add(mailLabelEntity);
            }
        }
        List<MailLabelEntity> a = C43378a.m172301a(arrayList4).mo155141a();
        arrayList.addAll(arrayList3);
        arrayList.addAll(a);
        List<MailLabelEntity> a2 = C43378a.m172301a(arrayList2).mo155141a();
        hashMap.put(1, arrayList);
        hashMap.put(2, a2);
        return hashMap;
    }

    /* renamed from: c */
    public MailLabelEntity mo155117c(String str) {
        Map map = (Map) mo155069Q();
        if (map == null) {
            Log.m165384e("MailAggregationService", "folder list empty", new RuntimeException("MailFolderError"));
            return null;
        }
        for (Integer num : map.keySet()) {
            List list = (List) map.get(num);
            int i = 0;
            while (true) {
                if (i < list.size()) {
                    MailLabelEntity mailLabelEntity = (MailLabelEntity) list.get(i);
                    if (TextUtils.equals(mailLabelEntity.mo151527k(), str)) {
                        return mailLabelEntity;
                    }
                    i++;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m172261b(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -933681182:
                if (str.equals("ARCHIVED")) {
                    c = 0;
                    break;
                }
                break;
            case 2541464:
                if (str.equals("SENT")) {
                    c = 1;
                    break;
                }
                break;
            case 2551625:
                if (str.equals("SPAM")) {
                    c = 2;
                    break;
                }
                break;
            case 65307009:
                if (str.equals("DRAFT")) {
                    c = 3;
                    break;
                }
                break;
            case 69806694:
                if (str.equals("INBOX")) {
                    c = 4;
                    break;
                }
                break;
            case 80083736:
                if (str.equals("TRASH")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return C42187a.C42191c.f107472w;
            case 1:
                return C42187a.C42191c.f107471v;
            case 2:
                return C42187a.C42191c.f107474y;
            case 3:
                return C42187a.C42191c.f107470u;
            case 4:
                return C42187a.C42191c.f107469t;
            case 5:
                return C42187a.C42191c.f107473x;
            default:
                return C42187a.C42191c.f107469t;
        }
    }

    /* renamed from: c */
    public boolean mo155118c(MailLabelEntity mailLabelEntity) {
        if (!mailLabelEntity.mo151529m() || "INBOX".equals(mailLabelEntity.mo151527k()) || "IMPORTANT".equals(mailLabelEntity.mo151527k()) || "OTHER".equals(mailLabelEntity.mo151527k()) || "SPAM".equals(mailLabelEntity.mo151527k()) || "SHARE".equals(mailLabelEntity.mo151527k())) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo155116b(MailLabelEntity mailLabelEntity) {
        if (mailLabelEntity == null) {
            return false;
        }
        if (!mailLabelEntity.mo151529m()) {
            return true;
        }
        String k = mailLabelEntity.mo151527k();
        k.hashCode();
        char c = 65535;
        switch (k.hashCode()) {
            case -1952196675:
                if (k.equals("OUTBOX")) {
                    c = 0;
                    break;
                }
                break;
            case -1853007448:
                if (k.equals("SEARCH")) {
                    c = 1;
                    break;
                }
                break;
            case -1786943569:
                if (k.equals("UNREAD")) {
                    c = 2;
                    break;
                }
                break;
            case -1716897790:
                if (k.equals("IMPORTANT")) {
                    c = 3;
                    break;
                }
                break;
            case -933681182:
                if (k.equals("ARCHIVED")) {
                    c = 4;
                    break;
                }
                break;
            case -61221830:
                if (k.equals("FLAGGED")) {
                    c = 5;
                    break;
                }
                break;
            case 2541464:
                if (k.equals("SENT")) {
                    c = 6;
                    break;
                }
                break;
            case 2551625:
                if (k.equals("SPAM")) {
                    c = 7;
                    break;
                }
                break;
            case 65307009:
                if (k.equals("DRAFT")) {
                    c = '\b';
                    break;
                }
                break;
            case 69806694:
                if (k.equals("INBOX")) {
                    c = '\t';
                    break;
                }
                break;
            case 75532016:
                if (k.equals("OTHER")) {
                    c = '\n';
                    break;
                }
                break;
            case 78862271:
                if (k.equals("SHARE")) {
                    c = 11;
                    break;
                }
                break;
            case 80083736:
                if (k.equals("TRASH")) {
                    c = '\f';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return true;
            default:
                return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager
    /* renamed from: a */
    public void mo154929a(final AbsDataManager.AbstractC43360b<Map<Integer, List<MailLabelEntity>>> bVar) {
        Log.m165388i("MailAggregationService fetchLabelMap");
        Map<Integer, List<MailLabelEntity>> a = C42723b.m170356a().mo153409a(C43350d.m172098a().mo155011C());
        if (a == null) {
            C42226b.m168638a().mo152308a("mail_dev_labels_cost_time");
            C42176e.m168344a().mo152193a(new IGetDataCallback<MailGetLabelsResponse>() {
                /* class com.ss.android.lark.mail.impl.service.C43374f.C433751 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165388i("MailAggregationService fetchLabelMap error");
                    C42226b.m168638a().mo152310b("mail_dev_labels_cost_time");
                    bVar.mo152965a(errorResult);
                }

                /* renamed from: a */
                public void onSuccess(MailGetLabelsResponse mailGetLabelsResponse) {
                    int i;
                    Log.m165388i("MailAggregationService fetchLabelMap success");
                    C42226b.m168638a().mo152312c("mail_dev_labels_cost_time");
                    if (bVar != null) {
                        List<MailLabelEntity> d = C42130j.m168150a().mo152088d(mailGetLabelsResponse.labels);
                        StringBuilder sb = new StringBuilder();
                        sb.append("MailAggregationService fetchLabelMap result : ");
                        if (d != null) {
                            i = d.size();
                        } else {
                            i = 0;
                        }
                        sb.append(i);
                        Log.m165388i(sb.toString());
                        bVar.mo152967a(C43374f.this.mo155115b(d));
                    }
                }
            });
        } else if (bVar != null) {
            ((C42286k) C42344d.m169091a(C42286k.class, C41816b.m166115a().mo150132b())).mo152403l();
            bVar.mo152967a(a);
        }
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43334u
    /* renamed from: a */
    public void mo150846a(String str) {
        m172260a(str, false);
    }

    /* renamed from: a */
    private void m172260a(String str, boolean z) {
        String q = mo155129q();
        if (!z) {
            C43307b.m172030a().mo154977a(new PushThreadChangeAction(str, q));
        } else if ("SHARE".equals(q)) {
            C43307b.m172030a().mo154977a(new PushDeleteThreadAction(str, q));
        } else {
            C43307b.m172030a().mo154977a(new PushThreadChangeAction(str, q));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.ss.android.lark.mail.impl.entity.MailLabelEntity> m172257a(com.ss.android.lark.mail.impl.entity.MailThread r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 219
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.service.C43374f.m172257a(com.ss.android.lark.mail.impl.entity.MailThread, java.lang.String):java.util.List");
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43317d
    /* renamed from: a */
    public void mo152676a(final MailLabelEntity mailLabelEntity, boolean z) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.service.C43374f.RunnableC433773 */

            public void run() {
                if (C43374f.this.mo155129q().equals(mailLabelEntity.mo151527k())) {
                    C43374f.this.mo155113a(mailLabelEntity);
                }
            }
        });
    }

    /* renamed from: a */
    public static List<MailLabelEntity> m172256a(PermissionCode permissionCode, List<MailLabelEntity> list, String str) {
        boolean z;
        MailLabelEntity mailLabelEntity;
        ArrayList arrayList = new ArrayList();
        if (!str.equals("OUTBOX") && !str.equals("UNREAD")) {
            if (permissionCode != null) {
                z = true;
            } else {
                z = false;
            }
            MailLabelEntity mailLabelEntity2 = null;
            String str2 = (str.equals("ARCHIVED") || str.equals("TRASH") || str.equals("SPAM")) ? str : null;
            if (list != null) {
                MailLabelEntity mailLabelEntity3 = null;
                for (int i = 0; i < list.size(); i++) {
                    MailLabelEntity mailLabelEntity4 = list.get(i);
                    if (mailLabelEntity4.mo151494a() == 1) {
                        if (!mailLabelEntity4.mo151529m()) {
                            arrayList.add(mailLabelEntity4);
                        }
                        if (z && mailLabelEntity4.mo151527k().equals("SHARE")) {
                            mailLabelEntity2 = mailLabelEntity4;
                        }
                        if ((str2 != null && mailLabelEntity4.mo151527k().equals(str2)) || (str2 == null && (mailLabelEntity4.mo151527k().equals("INBOX") || mailLabelEntity4.mo151527k().equals("ARCHIVED")))) {
                            mailLabelEntity3 = mailLabelEntity4;
                        }
                    }
                }
                mailLabelEntity = mailLabelEntity2;
                mailLabelEntity2 = mailLabelEntity3;
            } else {
                mailLabelEntity = null;
            }
            if (str.equals("FLAGGED")) {
                if (mailLabelEntity != null) {
                    arrayList.add(0, mailLabelEntity);
                }
                if (mailLabelEntity2 != null) {
                    arrayList.add(0, mailLabelEntity2);
                }
            } else {
                if (mailLabelEntity2 != null) {
                    arrayList.add(0, mailLabelEntity2);
                }
                if (mailLabelEntity != null) {
                    arrayList.add(0, mailLabelEntity);
                }
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((MailLabelEntity) arrayList.get(size)).mo151529m()) {
                    arrayList.remove(size);
                }
            }
        }
        return arrayList;
    }
}
