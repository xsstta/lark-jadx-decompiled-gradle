package com.ss.android.lark.create.groupchat.impl.inside;

import android.os.Bundle;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.create.groupchat.CreateGroupChatModule;
import com.ss.android.lark.create.groupchat.dto.CreateGroupMode;
import com.ss.android.lark.create.groupchat.dto.GroupCreateInfo;
import com.ss.android.lark.create.groupchat.impl.inside.C36332a;
import com.ss.android.lark.create.groupchat.impl.util.GroupFGUtils;
import com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.utils.SearchCommonUtils;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.lark.create.groupchat.impl.inside.c */
public class C36338c extends BaseModel implements C36332a.AbstractC36333a {

    /* renamed from: a */
    protected Map<String, SearchBaseInfo> f93772a = new LinkedHashMap();

    /* renamed from: b */
    protected Map<String, SearchBaseInfo> f93773b = new LinkedHashMap();

    /* renamed from: c */
    protected Map<String, SearchBaseInfo> f93774c = new HashMap();

    /* renamed from: d */
    protected String f93775d;

    /* renamed from: e */
    AbstractC36339a f93776e;

    /* renamed from: f */
    AbstractC36248c.AbstractC36252d f93777f = CreateGroupChatModule.getDependency().getChatDependency();

    /* renamed from: g */
    AbstractC36248c.AbstractC36253e f93778g = CreateGroupChatModule.getDependency().getChatterDependency();

    /* renamed from: h */
    AbstractC36248c.AbstractC36249a f93779h = CreateGroupChatModule.getDependency().getAccountDependency();

    /* renamed from: i */
    private GroupCreateInfo f93780i;

    /* renamed from: j */
    private volatile boolean f93781j;

    /* renamed from: k */
    private volatile boolean f93782k;

    /* renamed from: com.ss.android.lark.create.groupchat.impl.inside.c$a */
    public interface AbstractC36339a {
        /* renamed from: a */
        void mo134070a();

        /* renamed from: a */
        void mo134071a(List<SearchBaseInfo> list);

        /* renamed from: b */
        void mo134072b();

        /* renamed from: b */
        void mo134073b(List<SearchBaseInfo> list);
    }

    @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36333a
    /* renamed from: b */
    public Map<String, SearchBaseInfo> mo134046b() {
        return this.f93772a;
    }

    @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36333a
    /* renamed from: e */
    public Map<String, SearchBaseInfo> mo134051e() {
        return this.f93773b;
    }

    @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36333a
    /* renamed from: g */
    public GroupCreateInfo mo134053g() {
        return this.f93780i;
    }

    @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36333a
    /* renamed from: h */
    public String mo134055h() {
        return this.f93775d;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m143156n() {
        this.f93776e.mo134070a();
    }

    @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36333a
    /* renamed from: f */
    public boolean mo134052f() {
        return this.f93779h.mo133719a();
    }

    @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36333a, com.larksuite.framework.mvp.BaseModel
    public CallbackManager getCallbackManager() {
        return super.getCallbackManager();
    }

    /* renamed from: i */
    public String mo134069i() {
        return this.f93779h.mo133721b();
    }

    @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36333a
    /* renamed from: a */
    public List<String> mo134041a() {
        return new ArrayList(this.f93773b.keySet());
    }

    @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36333a
    /* renamed from: d */
    public Set<SearchBaseInfo> mo134050d() {
        return new HashSet(this.f93774c.values());
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        GroupCreateInfo groupCreateInfo = this.f93780i;
        if (groupCreateInfo != null) {
            groupCreateInfo.setTypeChangeListener(null);
        }
        GroupFGUtils.m142835a(false);
    }

    /* renamed from: j */
    private void m143152j() {
        if (this.f93773b.isEmpty()) {
            C57865c.m224574a(new C57865c.AbstractC57873d() {
                /* class com.ss.android.lark.create.groupchat.impl.inside.$$Lambda$c$SgUQpEIB8d2iLTonQgjEpnSOtwc */

                @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
                public final Object produce() {
                    return C36338c.lambda$SgUQpEIB8d2iLTonQgjEpnSOtwc(C36338c.this);
                }
            }, new C57865c.AbstractC57871b() {
                /* class com.ss.android.lark.create.groupchat.impl.inside.$$Lambda$c$GYGhUb8G4_z_3d5RUaNiAl0JKLM */

                @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
                public final void consume(Object obj) {
                    C36338c.lambda$GYGhUb8G4_z_3d5RUaNiAl0JKLM(C36338c.this, (Chatter) obj);
                }
            });
        } else {
            UICallbackExecutor.post(new Runnable() {
                /* class com.ss.android.lark.create.groupchat.impl.inside.$$Lambda$c$KDP1V2sk3MCUzZnqdmXg9QzAxJo */

                public final void run() {
                    C36338c.lambda$KDP1V2sk3MCUzZnqdmXg9QzAxJo(C36338c.this);
                }
            });
        }
    }

    /* renamed from: l */
    private void m143154l() {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.create.groupchat.impl.inside.$$Lambda$c$KIrL0eKB3r_HKTbs0q8cgnD4UE */

            public final void run() {
                C36338c.m270514lambda$KIrL0eKB3r_HKTbs0q8cgnD4UE(C36338c.this);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Chatter m143157o() {
        String i = mo134069i();
        Map<String, Chatter> b = mo134068b(Collections.singletonList(i));
        if (b != null) {
            return b.get(i);
        }
        return null;
    }

    @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36333a
    /* renamed from: c */
    public List<SearchBaseInfo> mo134049c() {
        return new ArrayList(this.f93772a.values());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0020 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x0010  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m143153k() {
        /*
            r3 = this;
            java.util.Map<java.lang.String, com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo> r0 = r3.f93772a
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0020
            java.lang.Object r1 = r0.next()
            com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo r1 = (com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo) r1
            boolean r2 = r1 instanceof com.ss.android.lark.searchcommon.dto.info.SearchChatInfo
            if (r2 != 0) goto L_0x001e
            boolean r1 = r1 instanceof com.ss.android.lark.searchcommon.dto.info.SearchDepartmentInfo
            if (r1 == 0) goto L_0x000a
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            com.ss.android.lark.create.groupchat.dto.GroupCreateInfo r1 = r3.f93780i
            r1.setHasMultiEntity(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.create.groupchat.impl.inside.C36338c.m143153k():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m143155m() {
        Iterator<SearchBaseInfo> it = this.f93772a.values().iterator();
        while (true) {
            if (it.hasNext()) {
                if (m143151d(it.next())) {
                    this.f93781j = true;
                    break;
                }
            } else {
                break;
            }
        }
        this.f93780i.setCrossTenant(this.f93781j);
        this.f93782k = CreateGroupChatModule.getDependency().getAccountDependency().mo133720a(new ArrayList(m143147a(this.f93772a)));
        this.f93780i.setCrossWithKa(this.f93782k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Map<String, Chatter> mo134068b(List<String> list) {
        return this.f93778g.mo133736a(list);
    }

    /* renamed from: c */
    private boolean m143150c(SearchBaseInfo searchBaseInfo) {
        if (searchBaseInfo instanceof SearchChatterInfo) {
            return ((SearchChatterInfo) searchBaseInfo).isNotContact();
        }
        return false;
    }

    @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36333a
    /* renamed from: b */
    public void mo134048b(boolean z) {
        GroupCreateInfo groupCreateInfo = this.f93780i;
        if (groupCreateInfo != null) {
            groupCreateInfo.setPublic(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m143149a(Chatter chatter) {
        if (chatter != null) {
            this.f93773b.put(chatter.getId(), SearchCommonUtils.m209224a(chatter));
        }
        this.f93776e.mo134070a();
    }

    /* renamed from: a */
    private Set<String> m143147a(Map<String, SearchBaseInfo> map) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<String, SearchBaseInfo> entry : map.entrySet()) {
            if (entry.getValue() instanceof SearchChatterInfo) {
                linkedHashSet.add(((SearchChatterInfo) entry.getValue()).getTenantId());
            }
        }
        return linkedHashSet;
    }

    /* renamed from: d */
    private boolean m143151d(SearchBaseInfo searchBaseInfo) {
        boolean z;
        if (searchBaseInfo instanceof SearchChatterInfo) {
            z = ((SearchChatterInfo) searchBaseInfo).isCrossTenant();
        } else {
            z = false;
        }
        if (searchBaseInfo instanceof SearchChatInfo) {
            z = ((SearchChatInfo) searchBaseInfo).isCrossTenant();
        }
        if (!z || mo134052f() || this.f93779h.mo133722c()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36333a
    /* renamed from: b */
    public void mo134047b(SearchBaseInfo searchBaseInfo) {
        if (!this.f93773b.containsKey(searchBaseInfo.getId())) {
            this.f93772a.remove(searchBaseInfo.getId());
            if (m143150c(searchBaseInfo)) {
                this.f93774c.remove(searchBaseInfo.getId());
            }
            m143153k();
            m143154l();
        }
    }

    /* renamed from: a */
    private void m143148a(Bundle bundle) {
        Log.m165379d("InsideGroupModel", "bundle: " + bundle);
        if (bundle != null) {
            this.f93775d = bundle.getString("department_id", "");
            Map<? extends String, ? extends SearchBaseInfo> map = (Map) bundle.getSerializable("selectedIds");
            if (!CollectionUtils.isEmpty(map)) {
                this.f93772a.putAll(map);
            }
            Map<? extends String, ? extends SearchBaseInfo> map2 = (Map) bundle.getSerializable("requiredIds");
            if (!CollectionUtils.isEmpty(map2)) {
                this.f93773b.putAll(map2);
            }
        }
    }

    @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36333a
    /* renamed from: a */
    public void mo134042a(GroupCreateInfo groupCreateInfo) {
        boolean z;
        boolean z2 = true;
        if (this.f93780i.getMode() != groupCreateInfo.getMode()) {
            z = true;
        } else {
            z = false;
        }
        this.f93780i = groupCreateInfo;
        if (groupCreateInfo.getMode() != CreateGroupMode.SECRET_MODE) {
            z2 = false;
        }
        GroupFGUtils.m142835a(z2);
        if (z) {
            this.f93776e.mo134072b();
        }
    }

    @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36333a
    /* renamed from: a */
    public void mo134043a(SearchBaseInfo searchBaseInfo) {
        if (!this.f93772a.containsKey(searchBaseInfo.getId())) {
            this.f93772a.put(searchBaseInfo.getId(), searchBaseInfo);
            if (m143150c(searchBaseInfo)) {
                this.f93774c.put(searchBaseInfo.getId(), searchBaseInfo);
            }
            m143153k();
            m143154l();
        }
    }

    @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36333a
    /* renamed from: a */
    public void mo134044a(List<SearchBaseInfo> list) {
        this.f93772a.clear();
        for (SearchBaseInfo searchBaseInfo : list) {
            this.f93772a.put(searchBaseInfo.getId(), searchBaseInfo);
            searchBaseInfo.selected(true);
        }
        m143153k();
        m143154l();
        this.f93776e.mo134071a(list);
    }

    @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36333a
    /* renamed from: a */
    public void mo134045a(boolean z) {
        if (z) {
            ArrayList arrayList = new ArrayList();
            Iterator<SearchBaseInfo> it = this.f93772a.values().iterator();
            while (it.hasNext()) {
                SearchBaseInfo next = it.next();
                if (m143151d(next)) {
                    this.f93781j = true;
                    arrayList.add(next);
                    it.remove();
                }
            }
            this.f93776e.mo134073b(arrayList);
        }
    }

    public C36338c(Bundle bundle, GroupCreateInfo groupCreateInfo, AbstractC36339a aVar) {
        boolean z;
        this.f93776e = aVar;
        this.f93780i = groupCreateInfo;
        if (groupCreateInfo.getMode() == CreateGroupMode.SECRET_MODE) {
            z = true;
        } else {
            z = false;
        }
        GroupFGUtils.m142835a(z);
        m143148a(bundle);
        m143152j();
    }
}
