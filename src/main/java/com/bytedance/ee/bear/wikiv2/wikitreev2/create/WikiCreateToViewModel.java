package com.bytedance.ee.bear.wikiv2.wikitreev2.create;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.C12455c;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.CreateNodePuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.TreeNode;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/create/WikiCreateToViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "createWiki", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/bean/TreeNode;", "spaceId", "", "wikiToken", "documentType", "", "Companion", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.a.c */
public final class WikiCreateToViewModel extends AbstractC1142af {
    public static final Companion Companion = new Companion(null);
    private final C68289a disposable = new C68289a();
    private final C10917c serviceContext = new C10917c(new C10929e());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/bean/TreeNode;", "it", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.a.c$b */
    static final class C12402b<T, R> implements Function<T, R> {

        /* renamed from: a */
        public static final C12402b f33280a = new C12402b();

        C12402b() {
        }

        /* renamed from: a */
        public final TreeNode apply(TreeNode treeNode) {
            Intrinsics.checkParameterIsNotNull(treeNode, "it");
            return treeNode;
        }
    }

    @JvmStatic
    public static final WikiCreateToViewModel get(Fragment fragment) {
        return Companion.mo47265a(fragment);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/create/WikiCreateToViewModel$Companion;", "", "()V", "TAG", "", "get", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/create/WikiCreateToViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final WikiCreateToViewModel mo47265a(Fragment fragment) {
            Intrinsics.checkParameterIsNotNull(fragment, "fragment");
            AbstractC1142af a = aj.m5364a(fragment).mo6005a(WikiCreateToViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(fr…eToViewModel::class.java)");
            return (WikiCreateToViewModel) a;
        }
    }

    public final AbstractC68307f<TreeNode> createWiki(String str, String str2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "spaceId");
        Intrinsics.checkParameterIsNotNull(str2, "wikiToken");
        AbstractC68307f<R> d = C12455c.m51768a((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).pull(new CreateNodePuller.Params(str, str2, "", i, "")).mo238020d(C12402b.f33280a);
        Intrinsics.checkExpressionValueIsNotNull(d, "WikiApi.createNodePuller…@map it\n                }");
        return d;
    }
}
