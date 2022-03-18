package com.ss.android.lark.create.groupchat.impl.p2p.p1783a;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.create.groupchat.CreateGroupChatModule;
import com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b;
import com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.lark.create.groupchat.impl.p2p.a.a */
public abstract class AbstractC36345a extends BaseModel implements AbstractC36349b.AbstractC36350a {

    /* renamed from: a */
    protected Map<String, SearchBaseInfo> f93793a = new LinkedHashMap();

    /* renamed from: b */
    protected Map<String, SearchBaseInfo> f93794b = new HashMap();

    /* renamed from: c */
    protected Set<String> f93795c = new HashSet();

    /* renamed from: d */
    protected String f93796d;

    /* renamed from: e */
    AbstractC36248c.AbstractC36259k f93797e;

    /* renamed from: f */
    AbstractC36248c.AbstractC36252d f93798f;

    /* renamed from: g */
    AbstractC36248c.AbstractC36253e f93799g;

    /* renamed from: h */
    AbstractC36248c.AbstractC36249a f93800h;

    /* renamed from: i */
    AbstractC36346a f93801i;

    /* renamed from: j */
    private final boolean f93802j;

    /* renamed from: com.ss.android.lark.create.groupchat.impl.p2p.a.a$a */
    public interface AbstractC36346a {
        /* renamed from: a */
        void mo134099a();

        /* renamed from: a */
        void mo134100a(int i);

        /* renamed from: a */
        void mo134101a(List<SearchBaseInfo> list);
    }

    /* renamed from: a */
    public abstract void mo134090a(Intent intent);

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36350a
    /* renamed from: a */
    public Set<String> mo134089a() {
        return this.f93795c;
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36350a
    /* renamed from: c */
    public Map<String, SearchBaseInfo> mo134095c() {
        return this.f93793a;
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36350a
    /* renamed from: b */
    public List<String> mo134093b() {
        return new ArrayList(this.f93795c);
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36350a
    /* renamed from: e */
    public Map<String, SearchBaseInfo> mo134097e() {
        return new HashMap(this.f93794b);
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36350a, com.larksuite.framework.mvp.BaseModel
    public CallbackManager getCallbackManager() {
        return super.getCallbackManager();
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36350a
    /* renamed from: h */
    public boolean mo134098h() {
        return this.f93797e.mo133744a();
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36350a
    /* renamed from: d */
    public List<SearchBaseInfo> mo134096d() {
        return new ArrayList(this.f93793a.values());
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36350a
    /* renamed from: b */
    public void mo134094b(SearchBaseInfo searchBaseInfo) {
        if (this.f93793a.containsKey(searchBaseInfo.getId())) {
            this.f93793a.remove(searchBaseInfo.getId());
            this.f93794b.remove(searchBaseInfo.getId());
        }
    }

    /* renamed from: a */
    private void m143217a(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("department_id");
            if (!TextUtils.isEmpty(string)) {
                this.f93796d = string;
            }
            Map<String, SearchBaseInfo> map = (Map) bundle.getSerializable("selectedIds");
            if (!CollectionUtils.isEmpty(map)) {
                this.f93793a = map;
            }
            Set<String> set = (Set) bundle.getSerializable("requiredIds");
            if (!CollectionUtils.isEmpty(set)) {
                this.f93795c = set;
            }
        }
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36350a
    /* renamed from: a */
    public void mo134091a(SearchBaseInfo searchBaseInfo) {
        if (!this.f93793a.containsKey(searchBaseInfo.getId())) {
            this.f93793a.put(searchBaseInfo.getId(), searchBaseInfo);
            if ((searchBaseInfo instanceof SearchChatterInfo) && ((SearchChatterInfo) searchBaseInfo).isNotContact()) {
                this.f93794b.put(searchBaseInfo.getId(), searchBaseInfo);
            }
        }
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36350a
    /* renamed from: a */
    public void mo134092a(List<SearchBaseInfo> list) {
        this.f93793a.clear();
        this.f93794b.clear();
        for (SearchBaseInfo searchBaseInfo : list) {
            this.f93793a.put(searchBaseInfo.getId(), searchBaseInfo);
            searchBaseInfo.selected(true);
            if ((searchBaseInfo instanceof SearchChatterInfo) && ((SearchChatterInfo) searchBaseInfo).isNotContact()) {
                this.f93794b.put(searchBaseInfo.getId(), searchBaseInfo);
            }
        }
        this.f93801i.mo134101a(list);
        this.f93801i.mo134099a();
    }

    public AbstractC36345a(Intent intent, boolean z, AbstractC36346a aVar) {
        this.f93801i = aVar;
        this.f93802j = z;
        this.f93797e = CreateGroupChatModule.getDependency().getSettingDependency();
        this.f93798f = CreateGroupChatModule.getDependency().getChatDependency();
        this.f93799g = CreateGroupChatModule.getDependency().getChatterDependency();
        this.f93800h = CreateGroupChatModule.getDependency().getAccountDependency();
        m143217a(intent.getExtras());
        mo134090a(intent);
    }
}
