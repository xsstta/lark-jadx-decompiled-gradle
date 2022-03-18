package com.bytedance.ee.bear.wiki.favourite;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.wiki.favourite.WikiSpaceFavouritePuller;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;

public class WikiSpaceFavouritePuller {

    /* renamed from: a */
    private NetService.AbstractC5075d<NetService.Result<Data>> f32295a;

    /* renamed from: b */
    private C68289a f32296b = new C68289a();

    /* renamed from: c */
    private String f32297c;

    /* renamed from: com.bytedance.ee.bear.wiki.favourite.WikiSpaceFavouritePuller$a */
    public interface AbstractC11946a {
        /* renamed from: a */
        void mo45884a();

        /* renamed from: a */
        void mo45885a(int i, Throwable th);
    }

    /* access modifiers changed from: private */
    public static class Data implements NonProguard {
        public boolean is_success;

        private Data() {
        }
    }

    /* renamed from: com.bytedance.ee.bear.wiki.favourite.WikiSpaceFavouritePuller$b */
    private static class C11947b implements NetService.AbstractC5074c<NetService.Result<Data>> {
        private C11947b() {
        }

        @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
        public NetService.Result<Data> parse(String str) throws NetService.ParseException {
            return (NetService.Result) JSON.parseObject(str, new TypeReference<NetService.Result<Data>>() {
                /* class com.bytedance.ee.bear.wiki.favourite.WikiSpaceFavouritePuller.C11947b.C119481 */
            }, new Feature[0]);
        }
    }

    public static class WikiFavouriteParams implements NonProguard {
        public String space_id;
        public int star_type;
        public String wiki_token;

        public String toString() {
            return "space_id= " + this.space_id + "wiki_token= " + this.wiki_token + "star_type= " + this.star_type;
        }
    }

    public WikiSpaceFavouritePuller(NetService netService) {
        this.f32295a = netService.mo20117a(new C11947b());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m49502a(AbstractC11946a aVar, Throwable th) throws Exception {
        if (aVar != null) {
            aVar.mo45885a(-1, th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m49501a(AbstractC11946a aVar, NetService.Result result) throws Exception {
        if (aVar == null) {
            return;
        }
        if (result.data == null || !((Data) result.data).is_success) {
            aVar.mo45885a(result.code, null);
        } else {
            aVar.mo45884a();
        }
    }

    /* renamed from: a */
    public NetService.C5077f mo45881a(String str, WikiFavouriteParams wikiFavouriteParams) {
        NetService.C5077f fVar = new NetService.C5077f(str);
        fVar.mo20143a(1);
        fVar.mo20153c(JSON.toJSONString(wikiFavouriteParams));
        return fVar;
    }

    /* renamed from: a */
    public void mo45882a(WikiFavouriteParams wikiFavouriteParams, boolean z, AbstractC11946a aVar) {
        if (wikiFavouriteParams == null) {
            C13479a.m54758a("WikiStar", "wikiFavouriteParams == null, cancel star wiki");
            return;
        }
        if (!this.f32296b.isDisposed()) {
            C13479a.m54764b("WikiStar", "cancel last star request");
            this.f32296b.mo237935a();
        }
        if (z) {
            this.f32297c = "/api/wiki/space/star/add/";
        } else {
            this.f32297c = "/api/wiki/space/star/delete/";
        }
        this.f32296b.mo237937a(this.f32295a.mo20141a(mo45881a(this.f32297c, wikiFavouriteParams)).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.wiki.favourite.$$Lambda$WikiSpaceFavouritePuller$_QFa9OgcBJlBgRqnOHDz_FyfL6M */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WikiSpaceFavouritePuller.lambda$_QFa9OgcBJlBgRqnOHDz_FyfL6M(WikiSpaceFavouritePuller.AbstractC11946a.this, (NetService.Result) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.wiki.favourite.$$Lambda$WikiSpaceFavouritePuller$cf2xqgEmQ05UVGDRgYFyDPO04PY */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WikiSpaceFavouritePuller.lambda$cf2xqgEmQ05UVGDRgYFyDPO04PY(WikiSpaceFavouritePuller.AbstractC11946a.this, (Throwable) obj);
            }
        }));
    }
}
