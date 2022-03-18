package com.bytedance.ee.bear.wiki.wikitree.api;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.wiki.spacedetail.SpaceBean;
import com.bytedance.ee.bear.wiki.wikitree.api.C12061c;
import com.bytedance.ee.bear.wiki.wikitree.api.CreateWikiRelationPuller;
import com.bytedance.ee.bear.wiki.wikitree.api.DelWikiRelationPuller;
import com.bytedance.ee.bear.wiki.wikitree.api.GetNodePuller;
import com.bytedance.ee.bear.wiki.wikitree.api.GetSpaceInfoPuller;
import com.bytedance.ee.bear.wiki.wikitree.api.GetUserRolePuller;
import com.bytedance.ee.bear.wiki.wikitree.api.GetWikiChildPuller;
import com.bytedance.ee.bear.wiki.wikitree.api.GetWikiRelationPuller;
import com.bytedance.ee.bear.wiki.wikitree.api.MoveWikiRelationV2Puller;
import com.bytedance.ee.bear.wiki.wikitree.bean.C12075a;
import com.bytedance.ee.bear.wiki.wikitree.bean.HomePage;
import com.bytedance.ee.bear.wiki.wikitree.bean.TreeNode;
import com.bytedance.ee.util.p702e.C13659d;
import com.larksuite.framework.utils.CollectionUtils;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.wiki.wikitree.api.c */
public final class C12061c {
    /* renamed from: g */
    public static AbstractC12060b<String, HomePage> m49943g(final NetService netService) {
        return new AbstractC12060b<String, HomePage>() {
            /* class com.bytedance.ee.bear.wiki.wikitree.api.C12061c.C120687 */

            /* renamed from: a */
            public AbstractC68307f<HomePage> mo46192a(String str) {
                return C12061c.m49944h(netService).mo46192a(new GetSpaceInfoPuller.Params(str)).mo238020d($$Lambda$c$7$svSWt5du_P7be7HNcLxyHNFYZck.INSTANCE);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ HomePage m49965a(SpaceBean spaceBean) throws Exception {
                return new HomePage(spaceBean.getHome_page().getWiki_token(), spaceBean.getHome_page().getObj_token(), spaceBean.getHome_page().getObj_type(), spaceBean.getSpace_id(), spaceBean.getSpace_name(), spaceBean.getSpace_icon());
            }
        };
    }

    /* renamed from: j */
    public static AbstractC12060b<GetWikiRelationPuller.Params, GetWikiRelationPuller.Result> m49946j(NetService netService) {
        return new GetWikiRelationPuller(netService);
    }

    /* renamed from: a */
    public static AbstractC12060b<CreateWikiRelationPuller.Params, TreeNode> m49937a(NetService netService) {
        final CreateWikiRelationPuller createWikiRelationPuller = new CreateWikiRelationPuller(netService);
        return new AbstractC12060b<CreateWikiRelationPuller.Params, TreeNode>() {
            /* class com.bytedance.ee.bear.wiki.wikitree.api.C12061c.C120621 */

            /* renamed from: a */
            public AbstractC68307f<TreeNode> mo46192a(CreateWikiRelationPuller.Params params) {
                return createWikiRelationPuller.mo46192a((Serializable) params).mo238020d($$Lambda$c$1$m8LwbDwL6x5W11Pd4vFJkgcUxU.INSTANCE);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ TreeNode m49947a(CreateWikiRelationPuller.Result result) throws Exception {
                return TreeNode.create(result.child_num, result.obj_token, result.obj_type, 0, result.space_id, "", result.wikiToken, result.parent, "", false, result.area_id, result.sort_id, null);
            }
        };
    }

    /* renamed from: b */
    public static AbstractC12060b<DelWikiRelationPuller.Params, DelWikiRelationPuller.Result> m49938b(NetService netService) {
        final DelWikiRelationPuller delWikiRelationPuller = new DelWikiRelationPuller(netService);
        return new AbstractC12060b<DelWikiRelationPuller.Params, DelWikiRelationPuller.Result>() {
            /* class com.bytedance.ee.bear.wiki.wikitree.api.C12061c.C120632 */

            /* renamed from: a */
            public AbstractC68307f<DelWikiRelationPuller.Result> mo46192a(DelWikiRelationPuller.Params params) {
                return delWikiRelationPuller.mo46192a((Serializable) params).mo238014c($$Lambda$c$2$M9dSVPquW_7FlRZauldHsdG7BM8.INSTANCE);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ AbstractC70020b m49950a(DelWikiRelationPuller.Result result) throws Exception {
                if (result.is_success) {
                    return AbstractC68307f.m265083a(result);
                }
                return AbstractC68307f.m265084a((Throwable) new Exception("delWikiRelationPuller return is_success= false"));
            }
        };
    }

    /* renamed from: c */
    public static AbstractC12060b<MoveWikiRelationV2Puller.Params, MoveWikiRelationV2Puller.Result> m49939c(NetService netService) {
        final MoveWikiRelationV2Puller moveWikiRelationV2Puller = new MoveWikiRelationV2Puller(netService);
        return new AbstractC12060b<MoveWikiRelationV2Puller.Params, MoveWikiRelationV2Puller.Result>() {
            /* class com.bytedance.ee.bear.wiki.wikitree.api.C12061c.C120643 */

            /* renamed from: a */
            public AbstractC68307f<MoveWikiRelationV2Puller.Result> mo46192a(MoveWikiRelationV2Puller.Params params) {
                return moveWikiRelationV2Puller.mo46192a((Serializable) params).mo238014c($$Lambda$c$3$HoLTpiOp8N0tpjkAB4R_JjA2L0.INSTANCE);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ AbstractC70020b m49953a(MoveWikiRelationV2Puller.Result result) throws Exception {
                if (result.is_success) {
                    return AbstractC68307f.m265083a(result);
                }
                return AbstractC68307f.m265084a((Throwable) new Exception("moveWikiRelationV2Puller return is_success= false"));
            }
        };
    }

    /* renamed from: d */
    public static AbstractC12060b<GetUserRolePuller.Params, C12075a> m49940d(NetService netService) {
        final GetUserRolePuller getUserRolePuller = new GetUserRolePuller(netService);
        return new AbstractC12060b<GetUserRolePuller.Params, C12075a>() {
            /* class com.bytedance.ee.bear.wiki.wikitree.api.C12061c.C120654 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ C12075a m49956a(GetUserRolePuller.Result result) throws Exception {
                return new C12075a(result.role, result.prop);
            }

            /* renamed from: a */
            public AbstractC68307f<C12075a> mo46192a(GetUserRolePuller.Params params) {
                return getUserRolePuller.mo46192a((Serializable) params).mo238020d($$Lambda$c$4$VSNkTS3MIQxfd4fQF7K8xbid5WM.INSTANCE);
            }
        };
    }

    /* renamed from: e */
    public static AbstractC12060b<GetWikiChildPuller.Params, List<TreeNode>> m49941e(NetService netService) {
        final GetWikiChildPuller getWikiChildPuller = new GetWikiChildPuller(netService);
        return new AbstractC12060b<GetWikiChildPuller.Params, List<TreeNode>>() {
            /* class com.bytedance.ee.bear.wiki.wikitree.api.C12061c.C120665 */

            /* renamed from: a */
            public AbstractC68307f<List<TreeNode>> mo46192a(GetWikiChildPuller.Params params) {
                return getWikiChildPuller.mo46192a((Serializable) params).mo238020d(new Function() {
                    /* class com.bytedance.ee.bear.wiki.wikitree.api.$$Lambda$c$5$ID53WdwxBJS2dyY4QQLGi9Rdkn0 */

                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return C12061c.C120665.m49959a(GetWikiChildPuller.Params.this, (HashMap) obj);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ List m49959a(GetWikiChildPuller.Params params, HashMap hashMap) throws Exception {
                List list = (List) hashMap.get(params.wiki_token);
                C13659d.m55432a(list, $$Lambda$NQ46uIPwmmwSalyatK_Ct72_cv4.INSTANCE);
                return CollectionUtils.checkListNull(list);
            }
        };
    }

    /* renamed from: f */
    public static AbstractC12060b<String, HomePage> m49942f(NetService netService) {
        final GetNodePuller getNodePuller = new GetNodePuller(netService);
        return new AbstractC12060b<String, HomePage>() {
            /* class com.bytedance.ee.bear.wiki.wikitree.api.C12061c.C120676 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ HomePage m49962a(GetNodePuller.Result result) throws Exception {
                return new HomePage(result.home_page.wiki_token, result.home_page.obj_token, result.home_page.obj_type, result.space_id, result.space_name, result.space_icon);
            }

            /* renamed from: a */
            public AbstractC68307f<HomePage> mo46192a(String str) {
                return getNodePuller.mo46192a((Serializable) new GetNodePuller.Params(str)).mo238020d($$Lambda$c$6$j5ZgEOXNoQoQbjGQHWjvDSpEus.INSTANCE);
            }
        };
    }

    /* renamed from: h */
    public static AbstractC12060b<GetSpaceInfoPuller.Params, SpaceBean> m49944h(NetService netService) {
        final GetSpaceInfoPuller getSpaceInfoPuller = new GetSpaceInfoPuller(netService);
        return new AbstractC12060b<GetSpaceInfoPuller.Params, SpaceBean>() {
            /* class com.bytedance.ee.bear.wiki.wikitree.api.C12061c.C120698 */

            /* renamed from: a */
            public AbstractC68307f<SpaceBean> mo46192a(GetSpaceInfoPuller.Params params) {
                return getSpaceInfoPuller.mo46192a((Serializable) params).mo238014c(new Function() {
                    /* class com.bytedance.ee.bear.wiki.wikitree.api.$$Lambda$c$8$Rm0rJxxniL_YG2K57ZBfk3gFzYY */

                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return C12061c.C120698.m49968a(GetSpaceInfoPuller.Params.this, (HashMap) obj);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ AbstractC70020b m49968a(GetSpaceInfoPuller.Params params, HashMap hashMap) throws Exception {
                SpaceBean spaceBean = (SpaceBean) hashMap.get(params.space_id);
                if (spaceBean == null) {
                    return AbstractC68307f.m265084a((Throwable) new Exception("getSpaceInfoPuller return null. "));
                }
                spaceBean.setSpace_id(params.space_id);
                return AbstractC68307f.m265083a(spaceBean);
            }
        };
    }

    /* renamed from: i */
    public static AbstractC12060b<GetNodePuller.Params, TreeNode> m49945i(NetService netService) {
        final GetNodePuller getNodePuller = new GetNodePuller(netService);
        return new AbstractC12060b<GetNodePuller.Params, TreeNode>() {
            /* class com.bytedance.ee.bear.wiki.wikitree.api.C12061c.C120709 */

            /* renamed from: a */
            public AbstractC68307f<TreeNode> mo46192a(GetNodePuller.Params params) {
                return getNodePuller.mo46192a((Serializable) params).mo238020d($$Lambda$c$9$KSKNQ7TuTCLqD4IG7yc5n3Iw1Y.INSTANCE);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ TreeNode m49971a(GetNodePuller.Result result) throws Exception {
                return TreeNode.create(result.child_num, result.obj_token, result.obj_type, 0, result.space_id, result.title, result.wiki_token, result.parent, "", false, result.area_id, result.sort_id, null);
            }
        };
    }
}
