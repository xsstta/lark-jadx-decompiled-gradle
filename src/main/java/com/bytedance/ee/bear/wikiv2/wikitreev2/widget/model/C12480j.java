package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model;

import android.text.TextUtils;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.wikiv2.common.p590a.C12239b;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.AbstractC12454b;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.C12455c;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.CreateNodePuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.DelNodePuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.GetChildPuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.GetFavoriteRelationPuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.GetNodePuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.GetRelationPuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.GetRootPermPuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.MoveNodePuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.C12459b;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.SpacePerm;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.TreeNode;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.WikiRelation;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.AbstractC12467b;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.C12465a;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.C12475d;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.WikiDatabase;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p716r.C13721c;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.p3459a.C68326a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import org.p3511d.AbstractC70020b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\u001a\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u0003\u001a\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a.\u0010\t\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0007\u001a\u0012\u0010\u0010\u001a\u00020\u0001*\u00020\n2\u0006\u0010\b\u001a\u00020\u0001\u001a\u0012\u0010\u0011\u001a\u00020\u0012*\u00020\n2\u0006\u0010\b\u001a\u00020\u0001\u001a\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0001H\u0002\u001a\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u00020\n2\u0006\u0010\b\u001a\u00020\u0001H\u0002\u001a \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004*\u00020\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0002\u001a.\u0010\u0018\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0003\u001aR\u0010\u001b\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u00012\b\u0010!\u001a\u0004\u0018\u00010\r2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0007\u001aJ\u0010$\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u00012\b\u0010&\u001a\u0004\u0018\u00010\r2\b\u0010'\u001a\u0004\u0018\u00010#H\u0003\u001a2\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010)\u001a\u00020*2\u0006\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u001a\u0018\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003*\u00020\n2\u0006\u0010\b\u001a\u00020\u0001\u001a\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003*\u00020\n2\u0006\u0010\b\u001a\u00020\u0001\u001a\u0010\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003*\u00020\n\u001a:\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003*\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0001\u001a \u00101\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003*\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u0014\u00102\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0001H\u0002\u001a\u001a\u00103\u001a\u00020\u0012*\u00020\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0002\u001a\u0012\u00104\u001a\u00020\u0012*\u00020\n2\u0006\u0010\b\u001a\u00020\u0001\u001a\u001c\u00105\u001a\u00020\u0012*\u00020\n2\u0006\u0010\b\u001a\u00020\u00012\b\u00106\u001a\u0004\u0018\u00010\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"TAG", "", "getCachedRelationSpaceIds", "Lio/reactivex/Flowable;", "", "isRelationCached", "", "spaceId", "wikiToken", "addNode", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/WikiTreeModel;", "parentToken", "newInsertNode", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/bean/TreeNode;", "forceExpand", "uid", "delNode", "favoriteNode", "", "getDbChildren", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/db/DBTreeNode;", "getDbTreeNode", "getDbTreeNodes", "wikiTokens", "insert", "srcToken", "toInsertNode", "movNode", "srcParent", "destParent", "newSortId", "", "expandToToken", "spareNode", "spareRelation", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/bean/WikiRelation;", "moveTo", "destToken", "_spareNode", "_spareRelation", "requestAddNode", "documentType", "", "requestChildren", "requestDelNode", "requestFavoriteTree", "requestMovNode", "destSpaceId", "destParentToken", "requestWikiTree", "syncCacheChildrenToDb", "syncCacheNodeToDb", "unfavoriteNode", "updateNodeTitle", "newTitle", "wiki-implv2_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.j */
public final class C12480j {
    /* renamed from: a */
    public static final String m51930a(C12479i iVar, String str, TreeNode treeNode, boolean z, String str2) {
        Intrinsics.checkParameterIsNotNull(iVar, "$this$addNode");
        Intrinsics.checkParameterIsNotNull(str, "parentToken");
        Intrinsics.checkParameterIsNotNull(treeNode, "newInsertNode");
        C13479a.m54764b("WikiTreeRepository", "addNode start. ");
        m51936b(iVar, str, treeNode, z, str2);
        AbstractC68307f.m265099b((Callable) new CallableC12481a(iVar, str)).mo238004b(C11678b.m48482f()).mo238001b(C68326a.m265193b(), C12239b.C12240a.f32886a);
        String str3 = treeNode.wiki_token;
        Intrinsics.checkExpressionValueIsNotNull(str3, "newInsertNode.wiki_token");
        return str3;
    }

    /* renamed from: a */
    public static final void m51932a(C12479i iVar, String str, String str2, String str3, double d, boolean z, String str4, TreeNode treeNode, WikiRelation wikiRelation) {
        Intrinsics.checkParameterIsNotNull(iVar, "$this$movNode");
        Intrinsics.checkParameterIsNotNull(str, "srcToken");
        Intrinsics.checkParameterIsNotNull(str2, "srcParent");
        Intrinsics.checkParameterIsNotNull(str3, "destParent");
        C13479a.m54764b("WikiTreeRepository", "movNode start. ");
        boolean i = iVar.workspace.mo47628i(str3);
        m51931a(iVar, str, str3, d, z, str4, treeNode, wikiRelation);
        AbstractC68307f.m265099b((Callable) new CallableC12485e(iVar, str, str2, i, str3)).mo238004b(C11678b.m48482f()).mo238001b(C68326a.m265193b(), C12239b.C12240a.f32886a);
    }

    /* renamed from: a */
    private static final void m51931a(C12479i iVar, String str, String str2, double d, boolean z, String str3, TreeNode treeNode, WikiRelation wikiRelation) {
        TreeNode treeNode2;
        StringCompanionObject mVar = StringCompanionObject.f173215a;
        String format = String.format("moveTo, srcToken: %s, destToken: %s, newSortId: %s, forceExpand: %s, expandToToken: %s", Arrays.copyOf(new Object[]{C13721c.m55650d(str), C13721c.m55650d(str2), String.valueOf(d), String.valueOf(z), str3}, 5));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
        C13479a.m54764b("WikiTreeRepository", format);
        iVar.workspace.mo47605a(str, d);
        if (!iVar.workspace.mo47626h(str2) || !iVar.workspace.mo47630j(str2)) {
            if (!z) {
                C13479a.m54772d("WikiTreeRepository", "moveTo case5");
                iVar.workspace.mo47602a(str);
            } else {
                C13479a.m54772d("WikiTreeRepository", "moveTo case4");
                WikiRelation d2 = wikiRelation == null ? C12455c.m51796g(iVar.netService).pull(new GetRelationPuller.Params(iVar.workspace.mo47627i(), str2)).mo238023d() : wikiRelation;
                C12504l lVar = iVar.workspace;
                if (d2 == null) {
                    Intrinsics.throwNpe();
                }
                lVar.mo47603a(d2.space, d2.tree.root_token, d2.tree.child_map, d2.tree.nodes, str);
                iVar.workspace.mo47608a(str, str2, d);
            }
        } else if (iVar.workspace.mo47626h(str)) {
            C13479a.m54772d("WikiTreeRepository", "moveTo case6");
            iVar.workspace.mo47608a(str, str2, d);
        } else {
            C13479a.m54772d("WikiTreeRepository", "moveTo case3");
            if (treeNode == null) {
                AbstractC12454b<GetNodePuller.Params, TreeNode> f = C12455c.m51795f(iVar.netService);
                C12504l lVar2 = iVar.workspace;
                Intrinsics.checkExpressionValueIsNotNull(lVar2, "workspace");
                treeNode2 = f.pull(new GetNodePuller.Params(lVar2.mo47627i(), str)).mo238023d();
            } else {
                treeNode2 = treeNode;
            }
            iVar.workspace.mo47606a(str2, treeNode2);
        }
        if (z) {
            iVar.workspace.mo47610a(str3, true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "call", "com/bytedance/ee/bear/wikiv2/common/util/RxUtilsKt$postCallSerial$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.j$a */
    public static final class CallableC12481a<V> implements Callable<T> {

        /* renamed from: a */
        final /* synthetic */ C12479i f33458a;

        /* renamed from: b */
        final /* synthetic */ String f33459b;

        public CallableC12481a(C12479i iVar, String str) {
            this.f33458a = iVar;
            this.f33459b = str;
        }

        @Override // java.util.concurrent.Callable
        public /* synthetic */ Object call() {
            mo47563a();
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo47563a() {
            C13479a.m54764b("WikiTreeRepository", "addNode, save children to db. ");
            C12480j.m51941f(this.f33458a, this.f33459b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "call", "com/bytedance/ee/bear/wikiv2/common/util/RxUtilsKt$postCallSerial$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.j$c */
    public static final class CallableC12483c<V> implements Callable<T> {

        /* renamed from: a */
        final /* synthetic */ C12479i f33463a;

        public CallableC12483c(C12479i iVar) {
            this.f33463a = iVar;
        }

        @Override // java.util.concurrent.Callable
        public /* synthetic */ Object call() {
            mo47567a();
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo47567a() {
            C12479i iVar = this.f33463a;
            C12504l lVar = iVar.workspace;
            Intrinsics.checkExpressionValueIsNotNull(lVar, "workspace");
            C12480j.m51933a(iVar, CollectionsKt.listOf(lVar.mo47629j()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "call", "com/bytedance/ee/bear/wikiv2/common/util/RxUtilsKt$postCallSerial$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.j$s */
    public static final class CallableC12502s<V> implements Callable<T> {

        /* renamed from: a */
        final /* synthetic */ C12479i f33501a;

        public CallableC12502s(C12479i iVar) {
            this.f33501a = iVar;
        }

        @Override // java.util.concurrent.Callable
        public /* synthetic */ Object call() {
            mo47588a();
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo47588a() {
            C12479i iVar = this.f33501a;
            C12504l lVar = iVar.workspace;
            Intrinsics.checkExpressionValueIsNotNull(lVar, "workspace");
            C12480j.m51933a(iVar, CollectionsKt.listOf(lVar.mo47629j()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "call", "com/bytedance/ee/bear/wikiv2/common/util/RxUtilsKt$postCallSerial$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.j$t */
    public static final class CallableC12503t<V> implements Callable<T> {

        /* renamed from: a */
        final /* synthetic */ C12479i f33502a;

        /* renamed from: b */
        final /* synthetic */ String f33503b;

        /* renamed from: c */
        final /* synthetic */ String f33504c;

        public CallableC12503t(C12479i iVar, String str, String str2) {
            this.f33502a = iVar;
            this.f33503b = str;
            this.f33504c = str2;
        }

        @Override // java.util.concurrent.Callable
        public /* synthetic */ Object call() {
            mo47590a();
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo47590a() {
            AbstractC12467b m = WikiDatabase.m51821n().mo16369m();
            C12504l lVar = this.f33502a.workspace;
            Intrinsics.checkExpressionValueIsNotNull(lVar, "workspace");
            m.mo47448a(lVar.mo47627i(), this.f33503b, this.f33504c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "call", "com/bytedance/ee/bear/wikiv2/common/util/RxUtilsKt$postCallSerial$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.j$b */
    public static final class CallableC12482b<V> implements Callable<T> {

        /* renamed from: a */
        final /* synthetic */ C12479i f33460a;

        /* renamed from: b */
        final /* synthetic */ List f33461b;

        /* renamed from: c */
        final /* synthetic */ String f33462c;

        public CallableC12482b(C12479i iVar, List list, String str) {
            this.f33460a = iVar;
            this.f33461b = list;
            this.f33462c = str;
        }

        @Override // java.util.concurrent.Callable
        public /* synthetic */ Object call() {
            mo47565a();
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo47565a() {
            C13479a.m54764b("WikiTreeRepository", "delNode, del children to db. ");
            AbstractC12467b m = WikiDatabase.m51821n().mo16369m();
            C12504l lVar = this.f33460a.workspace;
            Intrinsics.checkExpressionValueIsNotNull(lVar, "workspace");
            String i = lVar.mo47627i();
            List<String> list = this.f33461b;
            C12479i iVar = this.f33460a;
            C12504l lVar2 = iVar.workspace;
            Intrinsics.checkExpressionValueIsNotNull(lVar2, "workspace");
            m.mo47450a(i, list, C12480j.m51935b(iVar, CollectionsKt.listOf((Object[]) new String[]{this.f33462c, lVar2.mo47629j()})));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "call", "com/bytedance/ee/bear/wikiv2/common/util/RxUtilsKt$postCallSerial$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.j$e */
    public static final class CallableC12485e<V> implements Callable<T> {

        /* renamed from: a */
        final /* synthetic */ C12479i f33466a;

        /* renamed from: b */
        final /* synthetic */ String f33467b;

        /* renamed from: c */
        final /* synthetic */ String f33468c;

        /* renamed from: d */
        final /* synthetic */ boolean f33469d;

        /* renamed from: e */
        final /* synthetic */ String f33470e;

        public CallableC12485e(C12479i iVar, String str, String str2, boolean z, String str3) {
            this.f33466a = iVar;
            this.f33467b = str;
            this.f33468c = str2;
            this.f33469d = z;
            this.f33470e = str3;
        }

        @Override // java.util.concurrent.Callable
        public /* synthetic */ Object call() {
            mo47570a();
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo47570a() {
            C13479a.m54764b("WikiTreeRepository", "movNode, update children to db. ");
            List mutableListOf = CollectionsKt.mutableListOf(this.f33467b, this.f33468c);
            if (this.f33469d) {
                mutableListOf.add(this.f33470e);
            }
            C12480j.m51933a(this.f33466a, mutableListOf);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/api/DelNodePuller$Result;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.j$j */
    static final class C12491j<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ C12479i f33480a;

        /* renamed from: b */
        final /* synthetic */ String f33481b;

        C12491j(C12479i iVar, String str) {
            this.f33480a = iVar;
            this.f33481b = str;
        }

        /* renamed from: a */
        public final String apply(DelNodePuller.Result result) {
            Intrinsics.checkParameterIsNotNull(result, "it");
            return C12480j.m51938c(this.f33480a, this.f33481b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.j$d */
    public static final class C12484d<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ String f33464a;

        /* renamed from: b */
        final /* synthetic */ String f33465b;

        C12484d(String str, String str2) {
            this.f33464a = str;
            this.f33465b = str2;
        }

        @Override // io.reactivex.functions.Function
        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo47569a((String) obj));
        }

        /* renamed from: a */
        public final boolean mo47569a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            return WikiDatabase.m51821n().mo16369m().mo47455b(this.f33464a, this.f33465b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newInsertNode", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/bean/TreeNode;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.j$f */
    static final class C12486f<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ C12479i f33471a;

        /* renamed from: b */
        final /* synthetic */ String f33472b;

        /* renamed from: c */
        final /* synthetic */ boolean f33473c;

        /* renamed from: d */
        final /* synthetic */ String f33474d;

        C12486f(C12479i iVar, String str, boolean z, String str2) {
            this.f33471a = iVar;
            this.f33472b = str;
            this.f33473c = z;
            this.f33474d = str2;
        }

        /* renamed from: a */
        public final String apply(TreeNode treeNode) {
            Intrinsics.checkParameterIsNotNull(treeNode, "newInsertNode");
            return C12480j.m51930a(this.f33471a, this.f33472b, treeNode, this.f33473c, this.f33474d);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "T", "it", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "com/bytedance/ee/bear/wikiv2/common/util/RxUtilsKt$postSerial$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.j$g */
    public static final class C12487g<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ C12479i f33475a;

        /* renamed from: b */
        final /* synthetic */ String f33476b;

        public C12487g(C12479i iVar, String str) {
            this.f33475a = iVar;
            this.f33476b = str;
        }

        @Override // io.reactivex.functions.Function
        public final T apply(final T t) {
            AbstractC68307f.m265099b((Callable) new Callable<T>(this) {
                /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.C12480j.C12487g.CallableC124881 */

                /* renamed from: a */
                final /* synthetic */ C12487g f33477a;

                {
                    this.f33477a = r1;
                }

                @Override // java.util.concurrent.Callable
                public /* synthetic */ Object call() {
                    mo47573a();
                    return Unit.INSTANCE;
                }

                /* renamed from: a */
                public final void mo47573a() {
                    Boolean bool = (Boolean) t;
                    C12480j.m51941f(this.f33477a.f33475a, this.f33477a.f33476b);
                }
            }).mo238004b(C11678b.m48482f()).mo238001b(C68326a.m265193b(), C12239b.C12240a.f32886a);
            return t;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012(\u0010\u0002\u001a$\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "children", "", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/bean/TreeNode;", "kotlin.jvm.PlatformType", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.j$i */
    static final class C12490i<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ Function2 f33479a;

        C12490i(Function2 kVar) {
            this.f33479a = kVar;
        }

        @Override // io.reactivex.functions.Function
        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo47576a((List) obj));
        }

        /* renamed from: a */
        public final boolean mo47576a(List<TreeNode> list) {
            Intrinsics.checkParameterIsNotNull(list, "children");
            C13479a.m54764b("WikiTreeRepository", "requestWikiTree, load relation from network. ");
            return ((Boolean) this.f33479a.invoke(list, false)).booleanValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "T", "it", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "com/bytedance/ee/bear/wikiv2/common/util/RxUtilsKt$postSerial$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.j$k */
    public static final class C12492k<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ C12479i f33482a;

        public C12492k(C12479i iVar) {
            this.f33482a = iVar;
        }

        @Override // io.reactivex.functions.Function
        public final T apply(final T t) {
            AbstractC68307f.m265099b((Callable) new Callable<T>(this) {
                /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.C12480j.C12492k.CallableC124931 */

                /* renamed from: a */
                final /* synthetic */ C12492k f33483a;

                {
                    this.f33483a = r1;
                }

                @Override // java.util.concurrent.Callable
                public /* synthetic */ Object call() {
                    mo47578a();
                    return Unit.INSTANCE;
                }

                /* renamed from: a */
                public final void mo47578a() {
                    Boolean bool = (Boolean) t;
                    C12479i iVar = this.f33483a.f33482a;
                    C12504l lVar = this.f33483a.f33482a.workspace;
                    Intrinsics.checkExpressionValueIsNotNull(lVar, "workspace");
                    String j = lVar.mo47629j();
                    Intrinsics.checkExpressionValueIsNotNull(j, "workspace.favoriteRootToken");
                    C12480j.m51941f(iVar, j);
                }
            }).mo238004b(C11678b.m48482f()).mo238001b(C68326a.m265193b(), C12239b.C12240a.f32886a);
            return t;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "T", "it", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "com/bytedance/ee/bear/wikiv2/common/util/RxUtilsKt$postSerial$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.j$n */
    public static final class C12496n<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ String f33493a;

        public C12496n(String str) {
            this.f33493a = str;
        }

        @Override // io.reactivex.functions.Function
        public final T apply(final T t) {
            AbstractC68307f.m265099b((Callable) new Callable<T>(this) {
                /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.C12480j.C12496n.CallableC124971 */

                /* renamed from: a */
                final /* synthetic */ C12496n f33494a;

                {
                    this.f33494a = r1;
                }

                @Override // java.util.concurrent.Callable
                public /* synthetic */ Object call() {
                    mo47582a();
                    return Unit.INSTANCE;
                }

                /* renamed from: a */
                public final void mo47582a() {
                    WikiRelation wikiRelation = (WikiRelation) t;
                    if (!C12459b.m51818b(wikiRelation.tree.root_token)) {
                        C13479a.m54764b("WikiTreeRepository", "requestWikiTree, save relation to db. ");
                        AbstractC12467b m = WikiDatabase.m51821n().mo16369m();
                        String str = this.f33494a.f33493a;
                        Intrinsics.checkExpressionValueIsNotNull(wikiRelation, "it");
                        m.mo47449a(str, C12475d.m51883a(wikiRelation));
                    }
                }
            }).mo238004b(C11678b.m48482f()).mo238001b(C68326a.m265193b(), C12239b.C12240a.f32886a);
            return t;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/bean/WikiRelation;", "kotlin.jvm.PlatformType", "throwable", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.j$q */
    static final class C12500q<T, R> implements Function<Throwable, AbstractC70020b<? extends WikiRelation>> {

        /* renamed from: a */
        public static final C12500q f33499a = new C12500q();

        C12500q() {
        }

        /* renamed from: a */
        public final AbstractC68307f<WikiRelation> apply(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "throwable");
            C13479a.m54759a("WikiTreeRepository", "requestWikiTree, load relation from db err. ", th);
            return AbstractC68307f.m265083a(C12475d.m51880a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/api/MoveNodePuller$Result;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.j$m */
    static final class C12495m<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ C12479i f33486a;

        /* renamed from: b */
        final /* synthetic */ boolean f33487b;

        /* renamed from: c */
        final /* synthetic */ String f33488c;

        /* renamed from: d */
        final /* synthetic */ String f33489d;

        /* renamed from: e */
        final /* synthetic */ String f33490e;

        /* renamed from: f */
        final /* synthetic */ boolean f33491f;

        /* renamed from: g */
        final /* synthetic */ String f33492g;

        C12495m(C12479i iVar, boolean z, String str, String str2, String str3, boolean z2, String str4) {
            this.f33486a = iVar;
            this.f33487b = z;
            this.f33488c = str;
            this.f33489d = str2;
            this.f33490e = str3;
            this.f33491f = z2;
            this.f33492g = str4;
        }

        @Override // io.reactivex.functions.Function
        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo47581a((MoveNodePuller.Result) obj));
        }

        /* renamed from: a */
        public final boolean mo47581a(MoveNodePuller.Result result) {
            Intrinsics.checkParameterIsNotNull(result, "result");
            if (!this.f33487b) {
                C12480j.m51938c(this.f33486a, this.f33488c);
                return true;
            }
            C12479i iVar = this.f33486a;
            String str = this.f33488c;
            String str2 = this.f33489d;
            Intrinsics.checkExpressionValueIsNotNull(str2, "originParentToken");
            C12480j.m51932a(iVar, str, str2, this.f33490e, result.sort_id, this.f33491f, this.f33492g, null, null);
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/bean/WikiRelation;", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.j$p */
    static final class C12499p<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ String f33497a;

        /* renamed from: b */
        final /* synthetic */ String f33498b;

        C12499p(String str, String str2) {
            this.f33497a = str;
            this.f33498b = str2;
        }

        /* renamed from: a */
        public final WikiRelation apply(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            List<C12465a> a = WikiDatabase.m51821n().mo16369m().mo47446a(this.f33497a);
            Intrinsics.checkExpressionValueIsNotNull(a, "WikiDatabase.getDb().wik…ao().getRelation(spaceId)");
            WikiRelation a2 = C12475d.m51881a(a, this.f33498b);
            C13479a.m54764b("WikiTreeRepository", "requestWikiTree, load relation from db. valid: " + a2.isValid());
            return a2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/api/GetFavoriteRelationPuller$Result;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.j$l */
    static final class C12494l<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ C12479i f33485a;

        C12494l(C12479i iVar) {
            this.f33485a = iVar;
        }

        @Override // io.reactivex.functions.Function
        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo47580a((GetFavoriteRelationPuller.Result) obj));
        }

        /* renamed from: a */
        public final boolean mo47580a(GetFavoriteRelationPuller.Result result) {
            Intrinsics.checkParameterIsNotNull(result, "result");
            if (C13657b.m55421a(result.favorite_node_list.root_list)) {
                return true;
            }
            List<String> list = result.favorite_node_list.root_list;
            HashMap<String, TreeNode> hashMap = result.favorite_node_list.nodes;
            Intrinsics.checkExpressionValueIsNotNull(hashMap, "result.favorite_node_list.nodes");
            HashMap<String, TreeNode> hashMap2 = hashMap;
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                TreeNode treeNode = hashMap2.get(str);
                if (treeNode != null) {
                    arrayList.add(treeNode);
                }
            }
            C12504l lVar = this.f33485a.workspace;
            C12504l lVar2 = this.f33485a.workspace;
            Intrinsics.checkExpressionValueIsNotNull(lVar2, "workspace");
            lVar.mo47609a(lVar2.mo47629j(), arrayList);
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "relation", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/bean/WikiRelation;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.j$o */
    static final class C12498o<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ C12479i f33496a;

        C12498o(C12479i iVar) {
            this.f33496a = iVar;
        }

        @Override // io.reactivex.functions.Function
        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo47584a((WikiRelation) obj));
        }

        /* renamed from: a */
        public final boolean mo47584a(WikiRelation wikiRelation) {
            Intrinsics.checkParameterIsNotNull(wikiRelation, "relation");
            boolean isValid = wikiRelation.isValid();
            if (isValid) {
                this.f33496a.workspace = new C12504l(wikiRelation);
                C12504l lVar = this.f33496a.workspace;
                Intrinsics.checkExpressionValueIsNotNull(lVar, "workspace");
                if (lVar.mo47618d()) {
                    C12504l lVar2 = this.f33496a.workspace;
                    C12504l lVar3 = this.f33496a.workspace;
                    Intrinsics.checkExpressionValueIsNotNull(lVar3, "workspace");
                    lVar2.mo47609a(lVar3.mo47632k(), new ArrayList(0));
                }
                C12504l lVar4 = this.f33496a.workspace;
                C12504l lVar5 = this.f33496a.workspace;
                Intrinsics.checkExpressionValueIsNotNull(lVar5, "workspace");
                if (!lVar4.mo47628i(lVar5.mo47629j())) {
                    C12504l lVar6 = this.f33496a.workspace;
                    C12504l lVar7 = this.f33496a.workspace;
                    Intrinsics.checkExpressionValueIsNotNull(lVar7, "workspace");
                    lVar6.mo47609a(lVar7.mo47629j(), new ArrayList(0));
                }
            }
            C13479a.m54764b("WikiTreeRepository", "requestWikiTree, init workspace completed. ");
            return isValid;
        }
    }

    /* renamed from: a */
    public static final AbstractC68307f<Boolean> m51924a(C12479i iVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "$this$requestFavoriteTree");
        C13479a.m54764b("WikiTreeRepository", "requestFavoriteTree start. ");
        AbstractC12454b<GetFavoriteRelationPuller.Params, GetFavoriteRelationPuller.Result> j = C12455c.m51799j(iVar.netService);
        C12504l lVar = iVar.workspace;
        Intrinsics.checkExpressionValueIsNotNull(lVar, "workspace");
        AbstractC68307f<R> d = j.pull(new GetFavoriteRelationPuller.Params(lVar.mo47627i())).mo238020d(new C12494l(iVar));
        Intrinsics.checkExpressionValueIsNotNull(d, "WikiApi.getFavoriteRelat…rn@map true\n            }");
        AbstractC68307f<R> d2 = d.mo238020d(new C12492k(iVar));
        Intrinsics.checkExpressionValueIsNotNull(d2, "WikiApi.getFavoriteRelat…pace.favoriteRootToken) }");
        return d2;
    }

    /* renamed from: h */
    private static final List<C12465a> m51943h(C12479i iVar, String str) {
        List<TreeNode> c = iVar.workspace.mo47615c(str);
        Intrinsics.checkExpressionValueIsNotNull(c, "workspace.getNodeChildren(parentToken)");
        return C12475d.m51884a(c);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/bean/WikiRelation;", "relation", "rootPermInfo", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/bean/SpacePerm;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.j$r */
    static final class C12501r<T1, T2, R> implements BiFunction<WikiRelation, SpacePerm, WikiRelation> {

        /* renamed from: a */
        public static final C12501r f33500a = new C12501r();

        C12501r() {
        }

        /* renamed from: a */
        public final WikiRelation apply(WikiRelation wikiRelation, SpacePerm spacePerm) {
            Intrinsics.checkParameterIsNotNull(wikiRelation, "relation");
            Intrinsics.checkParameterIsNotNull(spacePerm, "rootPermInfo");
            wikiRelation.root_perm_info = spacePerm;
            wikiRelation.checkFree();
            C13479a.m54764b("WikiTreeRepository", "requestWikiTree, load relation from network. ");
            return wikiRelation;
        }
    }

    /* renamed from: a */
    public static final void m51933a(C12479i iVar, List<String> list) {
        WikiDatabase.m51821n().mo16369m().mo47451a(m51935b(iVar, list));
        C13479a.m54764b("WikiTreeRepository", "syncCacheNodeToDb ok. ");
    }

    /* renamed from: g */
    private static final C12465a m51942g(C12479i iVar, String str) {
        TreeNode b = iVar.workspace.mo47611b(str);
        if (b != null) {
            return C12475d.m51882a(b, iVar.workspace.mo47617d(str));
        }
        return null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "children", "", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/bean/TreeNode;", "fromCache", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.j$h */
    static final class C12489h extends Lambda implements Function2<List<? extends TreeNode>, Boolean, Boolean> {
        final /* synthetic */ C12479i $this_requestChildren;
        final /* synthetic */ String $wikiToken;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12489h(C12479i iVar, String str) {
            super(2);
            this.$this_requestChildren = iVar;
            this.$wikiToken = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Boolean invoke(List<? extends TreeNode> list, Boolean bool) {
            return Boolean.valueOf(invoke((List<TreeNode>) list, bool.booleanValue()));
        }

        public final boolean invoke(List<TreeNode> list, boolean z) {
            boolean z2;
            Intrinsics.checkParameterIsNotNull(list, "children");
            if (!C13657b.m55421a(list) || !z) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.$this_requestChildren.workspace.mo47609a(this.$wikiToken, list);
            }
            C13479a.m54764b("WikiTreeRepository", "requestChildren, insert children completed. ");
            return z2;
        }
    }

    /* renamed from: a */
    public static final AbstractC68307f<Boolean> m51929a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "spaceId");
        Intrinsics.checkParameterIsNotNull(str2, "wikiToken");
        AbstractC68307f<Boolean> d = AbstractC68307f.m265083a("").mo237985a(C11678b.m48477a()).mo238020d(new C12484d(str, str2));
        Intrinsics.checkExpressionValueIsNotNull(d, "Flowable.just(\"\")\n      … wikiToken)\n            }");
        return d;
    }

    /* renamed from: b */
    public static final AbstractC68307f<String> m51934b(C12479i iVar, String str) {
        Intrinsics.checkParameterIsNotNull(iVar, "$this$requestDelNode");
        Intrinsics.checkParameterIsNotNull(str, "wikiToken");
        AbstractC12454b<DelNodePuller.Params, DelNodePuller.Result> c = C12455c.m51792c(iVar.netService);
        C12504l lVar = iVar.workspace;
        Intrinsics.checkExpressionValueIsNotNull(lVar, "workspace");
        AbstractC68307f<R> d = c.pull(new DelNodePuller.Params(lVar.mo47627i(), str, iVar.synergyUuid)).mo237985a(C11678b.m48478b()).mo238020d(new C12491j(iVar, str));
        Intrinsics.checkExpressionValueIsNotNull(d, "WikiApi.delNodePuller(ne…(wikiToken)\n            }");
        return d;
    }

    /* renamed from: d */
    public static final void m51939d(C12479i iVar, String str) {
        Intrinsics.checkParameterIsNotNull(iVar, "$this$favoriteNode");
        Intrinsics.checkParameterIsNotNull(str, "wikiToken");
        C13479a.m54764b("WikiTreeRepository", "favoriteNode start. ");
        iVar.workspace.mo47619e(str);
        AbstractC68307f.m265099b((Callable) new CallableC12483c(iVar)).mo238004b(C11678b.m48482f()).mo238001b(C68326a.m265193b(), C12239b.C12240a.f32886a);
    }

    /* renamed from: e */
    public static final void m51940e(C12479i iVar, String str) {
        Intrinsics.checkParameterIsNotNull(iVar, "$this$unfavoriteNode");
        Intrinsics.checkParameterIsNotNull(str, "wikiToken");
        C13479a.m54764b("WikiTreeRepository", "unfavoriteNode start. ");
        iVar.workspace.mo47621f(str);
        AbstractC68307f.m265099b((Callable) new CallableC12502s(iVar)).mo238004b(C11678b.m48482f()).mo238001b(C68326a.m265193b(), C12239b.C12240a.f32886a);
    }

    /* renamed from: f */
    public static final void m51941f(C12479i iVar, String str) {
        C12465a g = m51942g(iVar, str);
        List<C12465a> h = m51943h(iVar, str);
        if (g != null) {
            AbstractC12467b m = WikiDatabase.m51821n().mo16369m();
            C12504l lVar = iVar.workspace;
            Intrinsics.checkExpressionValueIsNotNull(lVar, "workspace");
            m.mo47447a(lVar.mo47627i(), g, h);
        }
        C13479a.m54764b("WikiTreeRepository", "syncCacheChildrenToDb ok. ");
    }

    /* renamed from: b */
    public static final List<C12465a> m51935b(C12479i iVar, List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            C12465a g = m51942g(iVar, str);
            if (g != null) {
                arrayList.add(g);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static final String m51938c(C12479i iVar, String str) {
        String str2;
        Intrinsics.checkParameterIsNotNull(iVar, "$this$delNode");
        Intrinsics.checkParameterIsNotNull(str, "wikiToken");
        C13479a.m54764b("WikiTreeRepository", "delNode start. ");
        TreeNode b = iVar.workspace.mo47611b(str);
        if (b == null || (str2 = b.parent_wiki_token) == null) {
            return "";
        }
        AbstractC68307f.m265099b((Callable) new CallableC12482b(iVar, iVar.workspace.mo47602a(str), str2)).mo238004b(C11678b.m48482f()).mo238001b(C68326a.m265193b(), C12239b.C12240a.f32886a);
        return str2;
    }

    /* renamed from: a */
    public static final AbstractC68307f<Boolean> m51925a(C12479i iVar, String str) {
        Intrinsics.checkParameterIsNotNull(iVar, "$this$requestChildren");
        Intrinsics.checkParameterIsNotNull(str, "wikiToken");
        C12504l lVar = iVar.workspace;
        Intrinsics.checkExpressionValueIsNotNull(lVar, "workspace");
        if (TextUtils.equals(str, lVar.mo47629j()) || iVar.workspace.mo47628i(str)) {
            AbstractC68307f<Boolean> a = AbstractC68307f.m265083a((Object) true);
            Intrinsics.checkExpressionValueIsNotNull(a, "Flowable.just(true)");
            return a;
        }
        AbstractC12454b<GetChildPuller.Params, List<TreeNode>> e = C12455c.m51794e(iVar.netService);
        C12504l lVar2 = iVar.workspace;
        Intrinsics.checkExpressionValueIsNotNull(lVar2, "workspace");
        AbstractC68307f<R> d = e.pull(new GetChildPuller.Params(lVar2.mo47627i(), str)).mo238020d(new C12490i(new C12489h(iVar, str)));
        Intrinsics.checkExpressionValueIsNotNull(d, "WikiApi.getChildPuller(n…ren, false)\n            }");
        AbstractC68307f<R> d2 = d.mo238020d(new C12487g(iVar, str));
        Intrinsics.checkExpressionValueIsNotNull(d2, "networkDataFlow");
        return d2;
    }

    /* renamed from: b */
    public static final void m51937b(C12479i iVar, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(iVar, "$this$updateNodeTitle");
        Intrinsics.checkParameterIsNotNull(str, "wikiToken");
        TreeNode b = iVar.workspace.mo47611b(str);
        Intrinsics.checkExpressionValueIsNotNull(b, "workspace.getNode(wikiToken)");
        b.title = str2;
        AbstractC68307f.m265099b((Callable) new CallableC12503t(iVar, str, str2)).mo238004b(C11678b.m48482f()).mo238001b(C68326a.m265193b(), C12239b.C12240a.f32886a);
    }

    /* renamed from: a */
    public static final AbstractC68307f<Boolean> m51927a(C12479i iVar, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(iVar, "$this$requestWikiTree");
        Intrinsics.checkParameterIsNotNull(str, "spaceId");
        Intrinsics.checkParameterIsNotNull(str2, "wikiToken");
        C13479a.m54764b("WikiTreeRepository", "requestWikiTree start. ");
        AbstractC68307f e = AbstractC68307f.m265083a("").mo237985a(C11678b.m48477a()).mo238020d(new C12499p(str, str2)).mo238026e(C12500q.f33499a);
        AbstractC68307f a = AbstractC68307f.m265092a(C12455c.m51796g(iVar.netService).pull(new GetRelationPuller.Params(str, str2)), C12455c.m51798i(iVar.netService).pull(new GetRootPermPuller.Params(str)), C12501r.f33500a);
        Intrinsics.checkExpressionValueIsNotNull(a, "Flowable.zip(\n          …n relation\n            })");
        AbstractC68307f<Boolean> d = AbstractC68307f.m265091a(e, a.mo238020d(new C12496n(str))).mo237985a(C11678b.m48481e()).mo238020d(new C12498o(iVar));
        Intrinsics.checkExpressionValueIsNotNull(d, "Flowable.concat(cacheDat…@map valid\n\n            }");
        return d;
    }

    /* renamed from: b */
    private static final void m51936b(C12479i iVar, String str, TreeNode treeNode, boolean z, String str2) {
        StringCompanionObject mVar = StringCompanionObject.f173215a;
        String format = String.format("insert, srcToken: %s, toInsertNode: %s, forceExpand: %s", Arrays.copyOf(new Object[]{C13721c.m55650d(str), C13721c.m55650d(treeNode.wiki_token), String.valueOf(z)}, 3));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
        C13479a.m54764b("WikiTreeRepository", format);
        if (iVar.workspace.mo47630j(str)) {
            iVar.workspace.mo47606a(str, treeNode);
        } else if (z) {
            AbstractC12454b<GetChildPuller.Params, List<TreeNode>> e = C12455c.m51794e(iVar.netService);
            C12504l lVar = iVar.workspace;
            Intrinsics.checkExpressionValueIsNotNull(lVar, "workspace");
            iVar.workspace.mo47609a(str, e.pull(new GetChildPuller.Params(lVar.mo47627i(), str)).mo238023d());
        }
        if (z) {
            iVar.workspace.mo47607a(str, str2);
        }
    }

    /* renamed from: a */
    public static final AbstractC68307f<String> m51926a(C12479i iVar, String str, int i, boolean z, String str2) {
        Intrinsics.checkParameterIsNotNull(iVar, "$this$requestAddNode");
        Intrinsics.checkParameterIsNotNull(str, "parentToken");
        AbstractC12454b<CreateNodePuller.Params, TreeNode> a = C12455c.m51768a(iVar.netService);
        C12504l lVar = iVar.workspace;
        Intrinsics.checkExpressionValueIsNotNull(lVar, "workspace");
        AbstractC68307f<R> d = a.pull(new CreateNodePuller.Params(lVar.mo47627i(), str, "", i, iVar.synergyUuid)).mo237985a(C11678b.m48478b()).mo238020d(new C12486f(iVar, str, z, str2));
        Intrinsics.checkExpressionValueIsNotNull(d, "WikiApi.createNodePuller…xpand, uid)\n            }");
        return d;
    }

    /* renamed from: a */
    public static final AbstractC68307f<Boolean> m51928a(C12479i iVar, String str, String str2, String str3, boolean z, String str4) {
        Intrinsics.checkParameterIsNotNull(iVar, "$this$requestMovNode");
        Intrinsics.checkParameterIsNotNull(str, "srcToken");
        Intrinsics.checkParameterIsNotNull(str2, "destSpaceId");
        Intrinsics.checkParameterIsNotNull(str3, "destParentToken");
        boolean isSameSpace = iVar.isSameSpace(str2);
        C12504l lVar = iVar.workspace;
        Intrinsics.checkExpressionValueIsNotNull(lVar, "workspace");
        String i = lVar.mo47627i();
        String str5 = iVar.workspace.mo47611b(str).parent_wiki_token;
        AbstractC68307f<R> d = C12455c.m51793d(iVar.netService).pull(new MoveNodePuller.Params(i, str5, str2, str3, str, iVar.synergyUuid)).mo237985a(C11678b.m48478b()).mo238020d(new C12495m(iVar, isSameSpace, str, str5, str3, z, str4));
        Intrinsics.checkExpressionValueIsNotNull(d, "WikiApi.moveNodePuller(n…rn@map true\n            }");
        return d;
    }
}
