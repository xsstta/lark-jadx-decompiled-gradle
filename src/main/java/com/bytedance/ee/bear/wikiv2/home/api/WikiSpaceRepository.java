package com.bytedance.ee.bear.wikiv2.home.api;

import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.contract.route.parcelable.IWiki;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.cache.C8213o;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.wikiv2.home.banner.WikiSpaceListParser;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl.AbstractC12448b;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.C12455c;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.GetSpaceInfoPuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.SpaceInfo;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0007J\u001e\u0010\r\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b0\u000ej\b\u0012\u0004\u0012\u00020\u000b`\u000f0\u0006H\u0007J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/api/WikiSpaceRepository;", "", "()V", "TAG", "", "getCacheRelationIdsWhenDisconnect", "Lio/reactivex/Flowable;", "", "networkState", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "getWikiSpace", "Lcom/bytedance/ee/bear/list/dto/Document;", "spaceId", "getWikiSpaces", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "loadSpacesFromDb", "Lcom/bytedance/ee/bear/wikiv2/home/api/SpaceBean;", "spaceType", "", "saveSpacesToDb", "", "spaces", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.home.api.b */
public final class WikiSpaceRepository {

    /* renamed from: a */
    public static final WikiSpaceRepository f32942a = new WikiSpaceRepository();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "accept", "(Lkotlin/Unit;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.api.b$g */
    static final class C12265g<T> implements Consumer<Unit> {

        /* renamed from: a */
        public static final C12265g f32951a = new C12265g();

        C12265g() {
        }

        /* renamed from: a */
        public final void accept(Unit unit) {
        }
    }

    private WikiSpaceRepository() {
    }

    @Deprecated(message = "")
    @JvmStatic
    /* renamed from: a */
    public static final AbstractC68307f<ArrayList<Document>> m51025a() {
        AbstractC68307f<ArrayList<Document>> c = AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238014c(C12260c.f32946a).mo238014c(C12261d.f32947a);
        Intrinsics.checkExpressionValueIsNotNull(c, "Flowable.just(\"\")\n      …      }\n                }");
        return c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.api.b$f */
    static final class C12264f<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ List f32950a;

        C12264f(List list) {
            this.f32950a = list;
        }

        @Override // io.reactivex.functions.Function
        public /* synthetic */ Object apply(Object obj) {
            mo46827a((String) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo46827a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            List<T> list = this.f32950a;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (T t : list) {
                arrayList.add(C12256a.m51022a((SpaceBean) t));
            }
            C8153a.m32844b().mo31637h(arrayList);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.api.b$h */
    static final class C12266h<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C12266h f32952a = new C12266h();

        C12266h() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54765b("WikiSpaceRepository", "saveSpacesToDb err. ", th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "", "obj", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/aidl/WikiDataService;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.api.b$a */
    static final class C12257a<T, R> implements Function<T, R> {

        /* renamed from: a */
        public static final C12257a f32943a = new C12257a();

        C12257a() {
        }

        /* renamed from: a */
        public final List<String> apply(AbstractC12448b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "obj");
            return bVar.getCachedRelationSpaceIds();
        }
    }

    /* renamed from: a */
    public final AbstractC68307f<List<SpaceBean>> mo46818a(int i) {
        AbstractC68307f<List<SpaceBean>> d = AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238020d(new C12263e(i));
        Intrinsics.checkExpressionValueIsNotNull(d, "Flowable.just(\"\")\n      …ean() }\n                }");
        return d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001aj\u0012.\u0012,\u0012\u0004\u0012\u00020\u0003 \u0005*\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00040\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004 \u0005*4\u0012.\u0012,\u0012\u0004\u0012\u00020\u0003 \u0005*\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00040\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/list/dto/Document;", "Lkotlin/collections/ArrayList;", "kotlin.jvm.PlatformType", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.api.b$c */
    static final class C12260c<T, R> implements Function<T, AbstractC70020b<? extends R>> {

        /* renamed from: a */
        public static final C12260c f32946a = new C12260c();

        C12260c() {
        }

        /* renamed from: a */
        public final AbstractC68307f<ArrayList<Document>> apply(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            if (((IWiki) KoinJavaComponent.m268613a(IWiki.class, null, null, 6, null)).mo21072d()) {
                return AbstractC68307f.m265083a((Object) new ArrayList(0));
            }
            return AbstractC68307f.m265083a((Object) C8213o.m33656a(C8153a.m32844b().mo31654r()));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/list/dto/Document;", "kotlin.jvm.PlatformType", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.api.b$b */
    public static final class C12258b<T, R> implements Function<T, AbstractC70020b<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ String f32944a;

        C12258b(String str) {
            this.f32944a = str;
        }

        /* renamed from: a */
        public final AbstractC68307f<? extends Document> apply(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            C8213o n = C8153a.m32844b().mo31648n(this.f32944a);
            if (n == null) {
                return C12455c.m51804o((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).pull(new GetSpaceInfoPuller.Params(this.f32944a)).mo238020d(new Function<T, R>(this) {
                    /* class com.bytedance.ee.bear.wikiv2.home.api.WikiSpaceRepository.C12258b.C122591 */

                    /* renamed from: a */
                    final /* synthetic */ C12258b f32945a;

                    {
                        this.f32945a = r1;
                    }

                    /* renamed from: a */
                    public final Document apply(SpaceInfo spaceInfo) {
                        Intrinsics.checkParameterIsNotNull(spaceInfo, "it");
                        WikiDocument wikiDocument = new WikiDocument();
                        wikiDocument.mo32376B(this.f32945a.f32944a);
                        wikiDocument.mo32443g(spaceInfo.space_name);
                        wikiDocument.mo32380D(spaceInfo.space_icon);
                        wikiDocument.mo32412a(spaceInfo.is_star);
                        wikiDocument.mo21007a(spaceInfo.description);
                        wikiDocument.mo21012c(spaceInfo.wiki_scope);
                        if (spaceInfo.space_cover != null) {
                            WikiDocument.SpaceCover spaceCover = new WikiDocument.SpaceCover();
                            spaceCover.mo21032c(spaceInfo.space_cover.key);
                            spaceCover.mo21033d(spaceInfo.space_cover.color_value);
                            spaceCover.mo21028a(spaceInfo.space_cover.is_graph_dark);
                            spaceCover.mo21027a(spaceInfo.space_cover.origin);
                            spaceCover.mo21030b(spaceInfo.space_cover.thumbnail);
                            wikiDocument.mo21006a(spaceCover);
                        }
                        return wikiDocument;
                    }
                });
            }
            C13479a.m54764b("WikiSpaceRepository", "getWikiSpace, found cache, return. ");
            return AbstractC68307f.m265083a(C8213o.m33654a(n));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001aj\u0012.\u0012,\u0012\u0004\u0012\u00020\u0003 \u0005*\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00040\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004 \u0005*4\u0012.\u0012,\u0012\u0004\u0012\u00020\u0003 \u0005*\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00040\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004\u0018\u00010\u00010\u00012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/list/dto/Document;", "Lkotlin/collections/ArrayList;", "kotlin.jvm.PlatformType", "spaces", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.api.b$d */
    static final class C12261d<T, R> implements Function<T, AbstractC70020b<? extends R>> {

        /* renamed from: a */
        public static final C12261d f32947a = new C12261d();

        C12261d() {
        }

        /* renamed from: a */
        public final AbstractC68307f<ArrayList<Document>> apply(ArrayList<Document> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "spaces");
            if (C13657b.m55421a(arrayList)) {
                return ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new WikiSpaceListParser()).mo20141a(new NetService.C5077f("/space/api/wiki/v2/space/get_all_space/")).mo238020d(C122621.f32948a);
            }
            C13479a.m54764b("WikiSpaceRepository", "getWikiSpaces, found cache, return. ");
            return AbstractC68307f.m265083a((Object) arrayList);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/ee/bear/wikiv2/home/api/SpaceBean;", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.api.b$e */
    static final class C12263e<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ int f32949a;

        C12263e(int i) {
            this.f32949a = i;
        }

        /* renamed from: a */
        public final List<SpaceBean> apply(String str) {
            List<C8213o> list;
            Intrinsics.checkParameterIsNotNull(str, "it");
            if (this.f32949a == -1) {
                list = C8153a.m32844b().mo31654r();
            } else {
                list = C8153a.m32844b().mo31623e(this.f32949a);
            }
            Intrinsics.checkExpressionValueIsNotNull(list, "db_spaces");
            List<C8213o> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (T t : list2) {
                Intrinsics.checkExpressionValueIsNotNull(t, "it");
                arrayList.add(C12256a.m51023a((C8213o) t));
            }
            return arrayList;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC68307f<List<String>> m51026a(ConnectionService.NetworkState networkState) {
        if (networkState == null || networkState.mo20041b()) {
            AbstractC68307f<List<String>> a = AbstractC68307f.m265083a((Object) new ArrayList());
            Intrinsics.checkExpressionValueIsNotNull(a, "Flowable.just(ArrayList())");
            return a;
        }
        AbstractC68307f<List<String>> d = ar.f14811a.mo41505a(AbstractC12448b.class, C11678b.m48479c()).mo238020d(C12257a.f32943a);
        Intrinsics.checkExpressionValueIsNotNull(d, "serviceContext.justServi….cachedRelationSpaceIds }");
        return d;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC68307f<Document> m51027a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "spaceId");
        AbstractC68307f<Document> a = AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238014c(new C12258b(str)).mo237985a(C11678b.m48481e());
        Intrinsics.checkExpressionValueIsNotNull(a, "Flowable.just(\"\")\n      …rSchedulers.mainThread())");
        return a;
    }

    /* renamed from: a */
    public final void mo46819a(List<? extends SpaceBean> list) {
        Intrinsics.checkParameterIsNotNull(list, "spaces");
        if (!C13657b.m55421a(list)) {
            AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238020d(new C12264f(list)).mo238001b(C12265g.f32951a, C12266h.f32952a);
        }
    }
}
