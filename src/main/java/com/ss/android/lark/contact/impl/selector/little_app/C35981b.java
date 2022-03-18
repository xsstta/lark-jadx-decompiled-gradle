package com.ss.android.lark.contact.impl.selector.little_app;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.utils.SearchCommonUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.lark.contact.impl.selector.little_app.b */
public class C35981b extends BaseModel implements AbstractC35977a.AbstractC35978a {

    /* renamed from: a */
    public List<SearchBaseInfo> f93011a = new ArrayList();

    /* renamed from: b */
    public AbstractC35984a f93012b;

    /* renamed from: c */
    List<SearchBaseInfo> f93013c = new ArrayList();

    /* renamed from: d */
    private Map<String, SearchBaseInfo> f93014d = new LinkedHashMap();

    /* renamed from: e */
    private Set<String> f93015e = new HashSet();

    /* renamed from: f */
    private String f93016f;

    /* renamed from: g */
    private AbstractC35361b.AbstractC35376o f93017g;

    /* renamed from: h */
    private AbstractC35361b.AbstractC35380s f93018h;

    /* renamed from: i */
    private Chat f93019i;

    /* renamed from: j */
    private boolean f93020j;

    /* renamed from: com.ss.android.lark.contact.impl.selector.little_app.b$a */
    public interface AbstractC35984a {
        /* renamed from: a */
        void mo132370a();

        /* renamed from: a */
        void mo132371a(List<SearchBaseInfo> list);

        /* renamed from: b */
        void mo132372b();

        /* renamed from: b */
        void mo132373b(List<SearchBaseInfo> list);
    }

    @Override // com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a.AbstractC35978a
    /* renamed from: c */
    public Map<String, SearchBaseInfo> mo132350c() {
        return this.f93014d;
    }

    @Override // com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a.AbstractC35978a
    /* renamed from: d */
    public Chat mo132351d() {
        return this.f93019i;
    }

    @Override // com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a.AbstractC35978a
    /* renamed from: e */
    public List<SearchBaseInfo> mo132352e() {
        return this.f93013c;
    }

    @Override // com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a.AbstractC35978a
    /* renamed from: f */
    public String mo132353f() {
        return this.f93016f;
    }

    @Override // com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a.AbstractC35978a
    /* renamed from: g */
    public boolean mo132354g() {
        return this.f93020j;
    }

    @Override // com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a.AbstractC35978a
    /* renamed from: b */
    public List<String> mo132348b() {
        return new ArrayList(this.f93015e);
    }

    @Override // com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a.AbstractC35978a
    /* renamed from: a */
    public List<String> mo132344a() {
        return new ArrayList(this.f93014d.keySet());
    }

    @Override // com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a.AbstractC35978a
    /* renamed from: a */
    public void mo132345a(SearchBaseInfo searchBaseInfo) {
        if (!this.f93014d.containsKey(searchBaseInfo.getId())) {
            this.f93014d.put(searchBaseInfo.getId(), searchBaseInfo);
        }
    }

    @Override // com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a.AbstractC35978a
    /* renamed from: b */
    public boolean mo132349b(SearchBaseInfo searchBaseInfo) {
        if (!this.f93014d.containsKey(searchBaseInfo.getId())) {
            return false;
        }
        this.f93014d.remove(searchBaseInfo.getId());
        return true;
    }

    /* renamed from: a */
    private void m141068a(Bundle bundle) {
        if (bundle != null) {
            this.f93016f = bundle.getString("department_id", "");
            Map<? extends String, ? extends SearchBaseInfo> map = (Map) bundle.getSerializable("selectedIds");
            if (!CollectionUtils.isEmpty(map)) {
                this.f93014d.putAll(map);
            }
            List list = (List) bundle.getSerializable("preSelectableChatters");
            if (!CollectionUtils.isEmpty(list)) {
                this.f93013c.addAll(list);
            }
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m141069b(Bundle bundle) {
        if (!this.f93014d.isEmpty()) {
            this.f93012b.mo132372b();
        }
        List list = (List) bundle.getSerializable("disableIds");
        if (!CollectionUtils.isEmpty(list)) {
            this.f93015e.addAll(list);
            this.f93012b.mo132370a();
        }
    }

    /* renamed from: a */
    public void mo132366a(Intent intent) {
        Bundle extras = intent.getExtras();
        this.f93019i = (Chat) extras.get("chat");
        this.f93020j = intent.getBooleanExtra("ignore", false);
        if (this.f93013c.isEmpty()) {
            final List<String> list = (List) extras.getSerializable("displayBackMembersId");
            if (!CollectionUtils.isEmpty(list)) {
                C35358a.m138143a().mo130165j().mo130201a(list, getCallbackManager().wrapAndAddGetDataCallback(new UIGetDataCallback<Map<String, Chatter>>() {
                    /* class com.ss.android.lark.contact.impl.selector.little_app.C35981b.C359821 */

                    @Override // com.larksuite.framework.callback.UIGetDataCallback
                    public void onErrored(ErrorResult errorResult) {
                        super.onErrored(errorResult);
                        Log.m165382e("get display back chatter by id failed:" + C35981b.this.f93011a.toString());
                    }

                    /* renamed from: a */
                    public void onSuccessed(Map<String, Chatter> map) {
                        if (map != null) {
                            for (String str : list) {
                                Chatter chatter = map.get(str);
                                if (chatter != null) {
                                    SearchChatterInfo a = SearchCommonUtils.m209224a(chatter);
                                    C35981b.this.f93013c.add(a);
                                    C35981b.this.mo132345a(a);
                                }
                            }
                            C35981b.this.f93012b.mo132372b();
                            if (!C35981b.this.f93013c.isEmpty()) {
                                Log.m165389i("LittleAppSelectMemberModel", "onUpdatePreSelectData...");
                                C35981b.this.f93012b.mo132373b(C35981b.this.f93013c);
                            }
                        }
                    }
                }));
            }
        }
        UICallbackExecutor.post(new Runnable(extras) {
            /* class com.ss.android.lark.contact.impl.selector.little_app.$$Lambda$b$OGvZei6aAj5lIgwI2_1fJDVQFY */
            public final /* synthetic */ Bundle f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C35981b.m270503lambda$OGvZei6aAj5lIgwI2_1fJDVQFY(C35981b.this, this.f$1);
            }
        });
    }

    @Override // com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a.AbstractC35978a
    /* renamed from: a */
    public void mo132347a(List<SearchBaseInfo> list) {
        this.f93014d.clear();
        for (SearchBaseInfo searchBaseInfo : list) {
            this.f93014d.put(searchBaseInfo.getId(), searchBaseInfo);
        }
        for (int i = 0; i < this.f93011a.size(); i++) {
            SearchBaseInfo searchBaseInfo2 = this.f93011a.get(i);
            searchBaseInfo2.selected(mo132367a(searchBaseInfo2.getId()));
        }
        this.f93012b.mo132371a(list);
        this.f93012b.mo132372b();
    }

    /* renamed from: a */
    public boolean mo132367a(String str) {
        return mo132344a().contains(str);
    }

    public C35981b(Intent intent, Bundle bundle, AbstractC35984a aVar) {
        this.f93012b = aVar;
        this.f93017g = C35358a.m138143a().mo130163h();
        this.f93018h = C35358a.m138143a().mo130166k();
        m141068a(bundle);
        mo132366a(intent);
    }

    @Override // com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a.AbstractC35978a
    /* renamed from: a */
    public void mo132346a(String str, Chat chat, List<String> list) {
        if (!TextUtils.isEmpty(str)) {
            this.f93018h.mo130252a(str, chat, list, new IGetDataCallback<Void>() {
                /* class com.ss.android.lark.contact.impl.selector.little_app.C35981b.C359832 */

                /* renamed from: a */
                public void onSuccess(Void r1) {
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165382e("put search history failed: " + errorResult.toString());
                }
            });
        }
    }
}
