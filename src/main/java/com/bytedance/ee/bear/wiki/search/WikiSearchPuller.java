package com.bytedance.ee.bear.wiki.search;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.wiki.search.WikiSearchPuller;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import com.huawei.hms.actions.SearchIntents;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.util.List;
import java.util.Map;

public class WikiSearchPuller {

    /* renamed from: a */
    private C1177w<List<C12033c>> f32423a = new C1177w<>();

    /* renamed from: b */
    private NetService.AbstractC5075d<NetService.Result<Data>> f32424b;

    /* renamed from: c */
    private C68289a f32425c;

    /* renamed from: d */
    private C12031a f32426d;

    public static class Data implements NonProguard {
        public C12011Entity entities;
        public boolean has_more;
        public List<SpacesInfo> spaces;
        public List<String> tokens;
        public int total;

        /* renamed from: com.bytedance.ee.bear.wiki.search.WikiSearchPuller$Data$Entity */
        public static class C12011Entity implements NonProguard {
            public Map<String, ObjsBean> objs;
            public Map<String, UsersBean> users;

            /* renamed from: com.bytedance.ee.bear.wiki.search.WikiSearchPuller$Data$Entity$ObjsBean */
            public static class ObjsBean implements NonProguard {
                public String author;
                public String comment;
                public String create_uid;
                public String edit_name;
                public long edit_time;
                public String edit_uid;
                public boolean is_external;
                public long open_time;
                public String owner_id;
                public String preview;
                public String subtype;
                public String title;
                public String token;
                public int type;
                public String url;
                public long user_edit_time;
                public List<WikiInfo> wiki_infos;

                /* renamed from: com.bytedance.ee.bear.wiki.search.WikiSearchPuller$Data$Entity$ObjsBean$WikiInfo */
                public static class WikiInfo implements NonProguard {
                    public List<String> main_path;
                    public String space_id;
                    public String space_name;
                    public String wiki_token;
                    public String wiki_url;
                }
            }

            /* renamed from: com.bytedance.ee.bear.wiki.search.WikiSearchPuller$Data$Entity$UsersBean */
            public static class UsersBean implements NonProguard {
                public String avatar_url;
                public String cn_name;
                public String email;
                public String en_name;
                public String id;
                public String mobile;
                public String name;
                public String suid;
                public String tenant_id;
                public String tenant_name;
            }
        }

        public static class SpacesInfo implements NonProguard {
            public int attr;
            public String description;
            public HomePageInfo home_page;
            public boolean is_star;
            public String space_icon;
            public String space_id;
            public String space_name;

            public static class HomePageInfo implements NonProguard {
                public String obj_token;
                public int obj_type;
                public String wiki_token;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.wiki.search.WikiSearchPuller$a */
    public static class C12012a implements NetService.AbstractC5074c<NetService.Result<Data>> {
        private C12012a() {
        }

        @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
        public NetService.Result<Data> parse(String str) {
            return (NetService.Result) JSON.parseObject(str, new TypeReference<NetService.Result<Data>>() {
                /* class com.bytedance.ee.bear.wiki.search.WikiSearchPuller.C12012a.C120131 */
            }, new Feature[0]);
        }
    }

    /* renamed from: a */
    public LiveData<List<C12033c>> mo45982a() {
        return this.f32423a;
    }

    /* renamed from: b */
    public void mo45985b() {
        this.f32425c.mo237935a();
    }

    public static class WikiSearchParams implements NonProguard {
        public int count;
        public String group_id;
        public int need_main_path;
        public int offset;
        public String open_time;
        public String owner_id;
        public String query;
        public String search_field;
        public String search_location;
        public int search_type;
        public String source;
        public String space_id;

        public String toString() {
            return "query = " + this.query + " offset = " + this.offset + " space_id = " + this.space_id + " search_field = " + this.search_field + " search_type = " + this.search_type + " source = " + this.source;
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m49792a(Throwable th) {
        C13479a.m54761a("WikiSearchTAG", th);
        this.f32423a.mo5929b((List<C12033c>) null);
    }

    /* renamed from: a */
    public void mo45984a(WikiSearchParams wikiSearchParams) {
        if (wikiSearchParams == null) {
            C13479a.m54758a("WikiSearchTAG", "wiki tree search, params == null");
            return;
        }
        C13479a.m54772d("WikiSearchTAG", "query from net");
        if (!this.f32425c.isDisposed()) {
            C13479a.m54764b("WikiSearchTAG", "cancel last time search");
            this.f32425c.mo237935a();
        }
        this.f32425c.mo237937a(this.f32424b.mo20141a(mo45983a("/api/search/search_wiki/", wikiSearchParams)).mo238001b(new Consumer(wikiSearchParams) {
            /* class com.bytedance.ee.bear.wiki.search.$$Lambda$WikiSearchPuller$MUrBKVx18l91Eln4iyWfABUU */
            public final /* synthetic */ WikiSearchPuller.WikiSearchParams f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WikiSearchPuller.m270039lambda$MUrBKVx18l91Eln4iyWfABUU(WikiSearchPuller.this, this.f$1, (NetService.Result) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.wiki.search.$$Lambda$WikiSearchPuller$owns67rLy0TjsCuyeRPbTHX8PCk */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WikiSearchPuller.lambda$owns67rLy0TjsCuyeRPbTHX8PCk(WikiSearchPuller.this, (Throwable) obj);
            }
        }));
    }

    public WikiSearchPuller(NetService netService, Context context) {
        this.f32424b = netService.mo20117a(new C12012a());
        this.f32425c = new C68289a();
        this.f32426d = new C12031a(context);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m49791a(WikiSearchParams wikiSearchParams, NetService.Result result) {
        C13479a.m54764b("WikiSearchTAG", "query search result from net success");
        this.f32423a.mo5929b(this.f32426d.mo46043a((Data) result.getData(), wikiSearchParams.query, TextUtils.isEmpty(wikiSearchParams.space_id)));
    }

    /* renamed from: a */
    public NetService.C5077f mo45983a(String str, WikiSearchParams wikiSearchParams) {
        NetService.C5077f fVar = new NetService.C5077f(str);
        fVar.mo20143a(2);
        fVar.mo20145a(SearchIntents.EXTRA_QUERY, wikiSearchParams.query);
        fVar.mo20145a("offset", String.valueOf(wikiSearchParams.offset));
        fVar.mo20145a("count", String.valueOf(wikiSearchParams.count));
        fVar.mo20145a("space_id", wikiSearchParams.space_id);
        fVar.mo20145a("search_field", wikiSearchParams.search_field);
        fVar.mo20145a("search_type", String.valueOf(wikiSearchParams.search_type));
        fVar.mo20145a("need_main_path", String.valueOf(wikiSearchParams.need_main_path));
        return fVar;
    }
}
