package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.route.parcelable.WikNodePerm;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.CopyNodePuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.CreateNodePuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.DelNodePuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.FavoritePuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.GetChildPuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.GetFavoriteRelationPuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.GetNodePermPuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.GetNodePuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.GetRelationPuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.GetRootPermPuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.GetSpaceInfoPuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.GetWikiVersionPuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.MoveNodePuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.StarSpacePuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.UnStarSpacePuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.UnfavoritePuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.WikiBrowseReportPuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.SpaceInfo;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.SpacePerm;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.TreeNode;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.WikiRelation;
import com.larksuite.framework.utils.CollectionUtils;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.c */
public final class C12455c {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ List m51788a(GetChildPuller.Params params, HashMap hashMap) throws Exception {
        return CollectionUtils.checkListNull((List) hashMap.get(params.wiki_token));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m51790a(WikiRelation wikiRelation) throws Exception {
        if (wikiRelation.isValid()) {
            return AbstractC68307f.m265083a(wikiRelation);
        }
        return AbstractC68307f.m265084a(new Throwable("getRelationPuller, invalid relation. "));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m51789a(GetFavoriteRelationPuller.Result result) throws Exception {
        if (result.favorite_node_list == null) {
            return AbstractC68307f.m265084a(new Throwable("getFavoriteRelationPuller, favorite_node_list is null. "));
        }
        return AbstractC68307f.m265083a(result);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC68307f m51780a(UnfavoritePuller unfavoritePuller, UnfavoritePuller.Params params) {
        return unfavoritePuller.pull((Serializable) params).mo238020d($$Lambda$c$jckdX3zpuBWj5NNZWNM4cQz8aBI.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m51785a(UnfavoritePuller.Result result) throws Exception {
        return Boolean.valueOf(result.is_success);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m51782a(FavoritePuller.Result result) throws Exception {
        return Boolean.valueOf(result.is_success);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC68307f m51778a(StarSpacePuller starSpacePuller, StarSpacePuller.Params params) {
        return starSpacePuller.pull((Serializable) params).mo238020d($$Lambda$c$bgYPbUV0M3UW0oTi2mwJDODc8Bw.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m51783a(StarSpacePuller.Result result) throws Exception {
        return Boolean.valueOf(result.is_success);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC68307f m51779a(UnStarSpacePuller unStarSpacePuller, UnStarSpacePuller.Params params) {
        return unStarSpacePuller.pull((Serializable) params).mo238020d($$Lambda$c$S1s7qNK1Bn2ohqRQ5xy4RU8N30.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m51784a(UnStarSpacePuller.Result result) throws Exception {
        return Boolean.valueOf(result.is_success);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC68307f m51781a(WikiBrowseReportPuller wikiBrowseReportPuller, WikiBrowseReportPuller.Params params) {
        return wikiBrowseReportPuller.pull((Serializable) params).mo238020d($$Lambda$c$bKOFfoI8DeYB92f762nzI20jo.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m51786a(WikiBrowseReportPuller.Result result) throws Exception {
        return Boolean.valueOf(result.is_success);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC68307f m51777a(GetWikiVersionPuller getWikiVersionPuller, GetWikiVersionPuller.Params params) {
        return getWikiVersionPuller.pull((Serializable) params).mo238020d($$Lambda$c$qxTDzPiZ10V1WAvPPCvF3L_3LEU.INSTANCE);
    }

    /* renamed from: a */
    public static AbstractC12454b<CreateNodePuller.Params, TreeNode> m51768a(NetService netService) {
        return new CreateNodePuller(netService);
    }

    /* renamed from: b */
    public static AbstractC12454b<CopyNodePuller.Params, TreeNode> m51791b(NetService netService) {
        return new CopyNodePuller(netService);
    }

    /* renamed from: c */
    public static AbstractC12454b<DelNodePuller.Params, DelNodePuller.Result> m51792c(NetService netService) {
        return new DelNodePuller(netService);
    }

    /* renamed from: d */
    public static AbstractC12454b<MoveNodePuller.Params, MoveNodePuller.Result> m51793d(NetService netService) {
        return new MoveNodePuller(netService);
    }

    /* renamed from: f */
    public static AbstractC12454b<GetNodePuller.Params, TreeNode> m51795f(NetService netService) {
        return new GetNodePuller(netService);
    }

    /* renamed from: g */
    public static AbstractC12454b<GetRelationPuller.Params, WikiRelation> m51796g(NetService netService) {
        return new AbstractC12454b() {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.$$Lambda$c$0iljreLtugI9lGDnbQEda2WgfWg */

            @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.AbstractC12454b
            public final AbstractC68307f pull(Object obj) {
                return C12455c.m51771a(NetService.this, (GetRelationPuller.Params) obj);
            }
        };
    }

    /* renamed from: h */
    public static AbstractC12454b<GetNodePermPuller.Params, WikNodePerm> m51797h(NetService netService) {
        return new GetNodePermPuller(netService);
    }

    /* renamed from: e */
    public static AbstractC12454b<GetChildPuller.Params, List<TreeNode>> m51794e(NetService netService) {
        return new AbstractC12454b() {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.$$Lambda$c$kyOuIEKzYn3STxPYRPPGiOQRXsk */

            @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.AbstractC12454b
            public final AbstractC68307f pull(Object obj) {
                return C12455c.m51773a(GetChildPuller.this, (GetChildPuller.Params) obj);
            }
        };
    }

    /* renamed from: i */
    public static AbstractC12454b<GetRootPermPuller.Params, SpacePerm> m51798i(NetService netService) {
        return new AbstractC12454b() {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.$$Lambda$c$qwfPDa37y7i8ydNTxwJYtfPD4iE */

            @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.AbstractC12454b
            public final AbstractC68307f pull(Object obj) {
                return C12455c.m51775a(GetRootPermPuller.this, (GetRootPermPuller.Params) obj);
            }
        };
    }

    /* renamed from: j */
    public static AbstractC12454b<GetFavoriteRelationPuller.Params, GetFavoriteRelationPuller.Result> m51799j(NetService netService) {
        return new AbstractC12454b() {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.$$Lambda$c$0ymyIIaMsBj_xS6X4OyBz8w4pc */

            @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.AbstractC12454b
            public final AbstractC68307f pull(Object obj) {
                return C12455c.m51774a(GetFavoriteRelationPuller.this, (GetFavoriteRelationPuller.Params) obj);
            }
        };
    }

    /* renamed from: k */
    public static AbstractC12454b<UnfavoritePuller.Params, Boolean> m51800k(NetService netService) {
        return new AbstractC12454b() {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.$$Lambda$c$rR2uXuYE09m74IOn_YfJbHSeNzg */

            @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.AbstractC12454b
            public final AbstractC68307f pull(Object obj) {
                return C12455c.m51780a(UnfavoritePuller.this, (UnfavoritePuller.Params) obj);
            }
        };
    }

    /* renamed from: l */
    public static AbstractC12454b<FavoritePuller.Params, Boolean> m51801l(NetService netService) {
        return new AbstractC12454b() {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.$$Lambda$c$4n4zW9ZLWw28wicEpBr_CzPUMzQ */

            @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.AbstractC12454b
            public final AbstractC68307f pull(Object obj) {
                return C12455c.m51772a(FavoritePuller.this, (FavoritePuller.Params) obj);
            }
        };
    }

    /* renamed from: m */
    public static AbstractC12454b<StarSpacePuller.Params, Boolean> m51802m(NetService netService) {
        return new AbstractC12454b() {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.$$Lambda$c$0oGPoLcmy4B9N6350608vo2bLOE */

            @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.AbstractC12454b
            public final AbstractC68307f pull(Object obj) {
                return C12455c.m51778a(StarSpacePuller.this, (StarSpacePuller.Params) obj);
            }
        };
    }

    /* renamed from: n */
    public static AbstractC12454b<UnStarSpacePuller.Params, Boolean> m51803n(NetService netService) {
        return new AbstractC12454b() {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.$$Lambda$c$fuzfMZaooMBM4TFd6QgnrJ5GqX8 */

            @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.AbstractC12454b
            public final AbstractC68307f pull(Object obj) {
                return C12455c.m51779a(UnStarSpacePuller.this, (UnStarSpacePuller.Params) obj);
            }
        };
    }

    /* renamed from: o */
    public static AbstractC12454b<GetSpaceInfoPuller.Params, SpaceInfo> m51804o(NetService netService) {
        return new AbstractC12454b() {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.$$Lambda$c$4D1t8WKNN_BkQD0vfQTzFB9xmhc */

            @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.AbstractC12454b
            public final AbstractC68307f pull(Object obj) {
                return C12455c.m51776a(GetSpaceInfoPuller.this, (GetSpaceInfoPuller.Params) obj);
            }
        };
    }

    /* renamed from: p */
    public static AbstractC12454b<WikiBrowseReportPuller.Params, Boolean> m51805p(NetService netService) {
        return new AbstractC12454b() {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.$$Lambda$c$ZK84NKdsRR2_Ay1Fk7qCfi4S2LY */

            @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.AbstractC12454b
            public final AbstractC68307f pull(Object obj) {
                return C12455c.m51781a(WikiBrowseReportPuller.this, (WikiBrowseReportPuller.Params) obj);
            }
        };
    }

    /* renamed from: q */
    public static AbstractC12454b<GetWikiVersionPuller.Params, String> m51806q(NetService netService) {
        return new AbstractC12454b() {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.$$Lambda$c$TZ8SyEIchYJLpbTTaKWf7tQT8o */

            @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.AbstractC12454b
            public final AbstractC68307f pull(Object obj) {
                return C12455c.m51777a(GetWikiVersionPuller.this, (GetWikiVersionPuller.Params) obj);
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ SpaceInfo m51769a(GetSpaceInfoPuller.Params params, HashMap hashMap) throws Exception {
        return (SpaceInfo) hashMap.get(params.space_id);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ SpacePerm m51770a(GetRootPermPuller.Params params, HashMap hashMap) throws Exception {
        return (SpacePerm) hashMap.get(params.space_id);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC68307f m51771a(NetService netService, GetRelationPuller.Params params) {
        return new GetRelationPuller(netService).pull((Serializable) params).mo238014c($$Lambda$c$yC8IxPH380FX3fAlLoA0NcAQs.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC68307f m51772a(FavoritePuller favoritePuller, FavoritePuller.Params params) {
        return favoritePuller.pull((Serializable) params).mo238020d($$Lambda$c$6CkIsgGihLFPbj9FeL9NqUrFBg.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC68307f m51773a(GetChildPuller getChildPuller, GetChildPuller.Params params) {
        return getChildPuller.pull((Serializable) params).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.$$Lambda$c$2xl17sGwySBojA9T23Vjssfb_JU */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C12455c.m51788a(GetChildPuller.Params.this, (HashMap) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC68307f m51774a(GetFavoriteRelationPuller getFavoriteRelationPuller, GetFavoriteRelationPuller.Params params) {
        return getFavoriteRelationPuller.pull((Serializable) params).mo238014c($$Lambda$c$whaupHChNIzJFBi5O6WCnB4Dmg.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC68307f m51775a(GetRootPermPuller getRootPermPuller, GetRootPermPuller.Params params) {
        return getRootPermPuller.pull((Serializable) params).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.$$Lambda$c$gM7DiESYuJmgdNpbcrMht78TpoU */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C12455c.m51770a(GetRootPermPuller.Params.this, (HashMap) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC68307f m51776a(GetSpaceInfoPuller getSpaceInfoPuller, GetSpaceInfoPuller.Params params) {
        return getSpaceInfoPuller.pull((Serializable) params).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.$$Lambda$c$ugJIDpsxqJkFku450dHrsoAU9Ig */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C12455c.m51769a(GetSpaceInfoPuller.Params.this, (HashMap) obj);
            }
        });
    }
}
