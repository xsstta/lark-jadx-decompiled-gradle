package com.bytedance.ee.bear.wikiv2.home.api;

import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.bear.list.cache.C8213o;
import com.bytedance.ee.bear.wikiv2.searchv2.C12360b;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0007\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0007"}, d2 = {"toDbSpaceBean", "Lcom/bytedance/ee/bear/list/cache/WikiSpace;", "Lcom/bytedance/ee/bear/wikiv2/home/api/SpaceBean;", "toDocument", "Lcom/bytedance/ee/bear/contract/route/parcelable/WikiDocument;", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchResult;", "toSpaceBean", "wiki-implv2_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.home.api.a */
public final class C12256a {
    /* renamed from: a */
    public static final WikiDocument m51021a(C12360b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "$this$toDocument");
        WikiDocument wikiDocument = new WikiDocument();
        wikiDocument.mo32376B(bVar.f33160e);
        wikiDocument.mo32443g(bVar.f33164i);
        wikiDocument.mo32380D(bVar.f33165j);
        wikiDocument.mo21007a(bVar.f33166k);
        wikiDocument.mo32412a(bVar.f33167l);
        wikiDocument.mo21012c(bVar.f33170o);
        SpaceCover spaceCover = bVar.f33169n;
        if (spaceCover != null) {
            WikiDocument.SpaceCover spaceCover2 = new WikiDocument.SpaceCover();
            spaceCover2.mo21027a(spaceCover.origin);
            spaceCover2.mo21030b(spaceCover.thumbnail);
            spaceCover2.mo21033d(spaceCover.color_value);
            spaceCover2.mo21028a(spaceCover.is_graph_dark);
            spaceCover2.mo21032c(spaceCover.key);
            wikiDocument.mo21006a(spaceCover2);
        }
        return wikiDocument;
    }

    @Deprecated(message = "")
    /* renamed from: b */
    public static final WikiDocument m51024b(SpaceBean spaceBean) {
        Intrinsics.checkParameterIsNotNull(spaceBean, "$this$toDocument");
        WikiDocument wikiDocument = new WikiDocument();
        wikiDocument.mo32376B(spaceBean.space_id);
        wikiDocument.mo32443g(spaceBean.space_name);
        wikiDocument.mo32380D(spaceBean.space_icon);
        wikiDocument.mo21007a(spaceBean.description);
        wikiDocument.mo32412a(spaceBean.is_star);
        wikiDocument.mo32476p(spaceBean.browse_time);
        wikiDocument.mo21012c(spaceBean.wiki_scope);
        SpaceCover spaceCover = spaceBean.space_cover;
        if (spaceCover != null) {
            WikiDocument.SpaceCover spaceCover2 = new WikiDocument.SpaceCover();
            spaceCover2.mo21027a(spaceCover.origin);
            spaceCover2.mo21030b(spaceCover.thumbnail);
            spaceCover2.mo21033d(spaceCover.color_value);
            spaceCover2.mo21028a(spaceCover.is_graph_dark);
            spaceCover2.mo21032c(spaceCover.key);
            wikiDocument.mo21006a(spaceCover2);
        }
        return wikiDocument;
    }

    /* renamed from: a */
    public static final C8213o m51022a(SpaceBean spaceBean) {
        Intrinsics.checkParameterIsNotNull(spaceBean, "$this$toDbSpaceBean");
        C8213o oVar = new C8213o();
        oVar.mo32178a(spaceBean.space_id);
        oVar.mo32186c(spaceBean.space_name);
        oVar.mo32189d(spaceBean.space_icon);
        oVar.mo32179a(spaceBean.is_star);
        oVar.mo32193f(spaceBean.browse_time);
        oVar.mo32191e(spaceBean.description);
        oVar.mo32185c(spaceBean.wiki_scope);
        oVar.mo32188d(spaceBean.space_type);
        SpaceCover spaceCover = spaceBean.space_cover;
        if (spaceCover != null) {
            oVar.mo32199i(spaceCover.origin);
            oVar.mo32201j(spaceCover.thumbnail);
            oVar.mo32205l(spaceCover.color_value);
            oVar.mo32183b(spaceCover.is_graph_dark);
            oVar.mo32203k(spaceCover.key);
        }
        return oVar;
    }

    /* renamed from: a */
    public static final SpaceBean m51023a(C8213o oVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "$this$toSpaceBean");
        SpaceBean spaceBean = new SpaceBean();
        spaceBean.space_id = oVar.mo32176a();
        spaceBean.space_name = oVar.mo32184c();
        spaceBean.space_icon = oVar.mo32187d();
        spaceBean.description = oVar.mo32192f();
        spaceBean.is_star = oVar.mo32195g();
        spaceBean.browse_time = oVar.mo32196h();
        spaceBean.wiki_scope = oVar.mo32210q();
        spaceBean.space_type = oVar.mo32211r();
        SpaceCover spaceCover = new SpaceCover();
        spaceCover.origin = oVar.mo32204l();
        spaceCover.thumbnail = oVar.mo32206m();
        spaceCover.key = oVar.mo32207n();
        spaceCover.is_graph_dark = oVar.mo32208o();
        spaceCover.color_value = oVar.mo32209p();
        spaceBean.space_cover = spaceCover;
        return spaceBean;
    }
}
