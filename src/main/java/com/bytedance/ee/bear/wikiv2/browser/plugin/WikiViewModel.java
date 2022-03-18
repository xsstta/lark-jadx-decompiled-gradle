package com.bytedance.ee.bear.wikiv2.browser.plugin;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.route.parcelable.WikNodePerm;
import com.bytedance.ee.bear.contract.route.parcelable.WikiInfo;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.wikiv2.common.p590a.C12239b;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.C12455c;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.GetNodePermPuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.GetNodePuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.TreeNode;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 62\u00020\u0001:\u00016B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010*\u001a\u00020\u000eJ\u0006\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020\u000eJ\b\u0010.\u001a\u00020/H\u0002J\u000e\u00100\u001a\u0002012\u0006\u00102\u001a\u000203J\b\u00104\u001a\u00020/H\u0014J\u0012\u00105\u001a\u00020/2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0010\"\u0004\b)\u0010\u0012¨\u00067"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/browser/plugin/WikiViewModel;", "Landroidx/lifecycle/ViewModel;", "args", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "bearUrl", "Lcom/bytedance/ee/bear/domain/BearUrl;", "getBearUrl", "()Lcom/bytedance/ee/bear/domain/BearUrl;", "setBearUrl", "(Lcom/bytedance/ee/bear/domain/BearUrl;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "spaceId", "", "getSpaceId", "()Ljava/lang/String;", "setSpaceId", "(Ljava/lang/String;)V", "spaceName", "getSpaceName", "setSpaceName", "wikiInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bytedance/ee/bear/contract/route/parcelable/WikiInfo;", "getWikiInfo", "()Landroidx/lifecycle/MutableLiveData;", "wikiMeta", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/bean/TreeNode;", "getWikiMeta", "()Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/bean/TreeNode;", "setWikiMeta", "(Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/bean/TreeNode;)V", "wikiPerm", "Lcom/bytedance/ee/bear/contract/route/parcelable/WikNodePerm;", "getWikiPerm", "()Lcom/bytedance/ee/bear/contract/route/parcelable/WikNodePerm;", "setWikiPerm", "(Lcom/bytedance/ee/bear/contract/route/parcelable/WikNodePerm;)V", "wikiToken", "getWikiToken", "setWikiToken", "getObjToken", "getObjTypeValue", "", "getObjTypeValueString", "init", "", "isType", "", ShareHitPoint.f121869d, "Lcom/bytedance/ee/bear/list/dto/DocumentType;", "onCleared", "readArgs", "Companion", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.h */
public final class WikiViewModel extends AbstractC1142af {
    public static final Companion Companion = new Companion(null);
    private BearUrl bearUrl;
    private final C68289a disposables = new C68289a();
    private String spaceId = "";
    private String spaceName;
    private final C1177w<WikiInfo> wikiInfo = new C1177w<>();
    private TreeNode wikiMeta;
    private WikNodePerm wikiPerm;
    private String wikiToken = "";

    @JvmStatic
    public static final C1144ai.AbstractC1146b newFactory(Bundle bundle) {
        return Companion.mo46753a(bundle);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/browser/plugin/WikiViewModel$Companion;", "", "()V", "TAG", "", "newFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "args", "Landroid/os/Bundle;", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.h$a */
    public static final class Companion {
        private Companion() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0002\u001a\u0002H\u0003\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/wikiv2/browser/plugin/WikiViewModel$Companion$newFactory$1", "Landroidx/lifecycle/ViewModelProvider$Factory;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.h$a$a */
        public static final class C12229a implements C1144ai.AbstractC1146b {

            /* renamed from: a */
            final /* synthetic */ Bundle f32874a;

            C12229a(Bundle bundle) {
                this.f32874a = bundle;
            }

            @Override // androidx.lifecycle.C1144ai.AbstractC1146b
            public <T extends AbstractC1142af> T create(Class<T> cls) {
                Intrinsics.checkParameterIsNotNull(cls, "modelClass");
                return new WikiViewModel(this.f32874a);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C1144ai.AbstractC1146b mo46753a(Bundle bundle) {
            return new C12229a(bundle);
        }
    }

    public final BearUrl getBearUrl() {
        return this.bearUrl;
    }

    public final String getSpaceId() {
        return this.spaceId;
    }

    public final String getSpaceName() {
        return this.spaceName;
    }

    public final C1177w<WikiInfo> getWikiInfo() {
        return this.wikiInfo;
    }

    public final TreeNode getWikiMeta() {
        return this.wikiMeta;
    }

    public final WikNodePerm getWikiPerm() {
        return this.wikiPerm;
    }

    public final String getWikiToken() {
        return this.wikiToken;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        super.onCleared();
        this.disposables.mo237935a();
    }

    public final String getObjToken() {
        String objToken;
        WikiInfo b = this.wikiInfo.mo5927b();
        if (b == null || (objToken = b.getObjToken()) == null) {
            return "";
        }
        return objToken;
    }

    public final int getObjTypeValue() {
        WikiInfo b = this.wikiInfo.mo5927b();
        if (b != null) {
            return b.getObjType();
        }
        return -1;
    }

    public final String getObjTypeValueString() {
        String objTypeString;
        WikiInfo b = this.wikiInfo.mo5927b();
        if (b == null || (objTypeString = b.getObjTypeString()) == null) {
            return "unknown";
        }
        return objTypeString;
    }

    private final void init() {
        boolean z;
        if (TextUtils.isEmpty(this.spaceId) || TextUtils.isEmpty(this.wikiToken)) {
            z = true;
        } else {
            z = false;
        }
        C13479a.m54772d("Wiki_WikiViewModel", "request WikiPerm and meta. emptyToken: " + z);
        if (!z) {
            Disposable b = C12455c.m51797h((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).pull(new GetNodePermPuller.Params(this.spaceId, this.wikiToken)).mo238001b(new C12230b(this), C12231c.f32876a);
            Intrinsics.checkExpressionValueIsNotNull(b, "WikiApi.getNodePermPulle… \", t)\n                })");
            C12239b.m50938a(b, this.disposables);
            Disposable b2 = C12455c.m51795f((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).pull(new GetNodePuller.Params(this.spaceId, this.wikiToken)).mo238001b(new C12232d(this), C12233e.f32878a);
            Intrinsics.checkExpressionValueIsNotNull(b2, "WikiApi.getNodePuller(Ko… \", t)\n                })");
            C12239b.m50938a(b2, this.disposables);
        }
    }

    public final void setBearUrl(BearUrl bearUrl2) {
        this.bearUrl = bearUrl2;
    }

    public final void setSpaceName(String str) {
        this.spaceName = str;
    }

    public final void setWikiMeta(TreeNode treeNode) {
        this.wikiMeta = treeNode;
    }

    public final void setWikiPerm(WikNodePerm wikNodePerm) {
        this.wikiPerm = wikNodePerm;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/route/parcelable/WikNodePerm;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.h$b */
    public static final class C12230b<T> implements Consumer<WikNodePerm> {

        /* renamed from: a */
        final /* synthetic */ WikiViewModel f32875a;

        C12230b(WikiViewModel hVar) {
            this.f32875a = hVar;
        }

        /* renamed from: a */
        public final void accept(WikNodePerm wikNodePerm) {
            this.f32875a.setWikiPerm(wikNodePerm);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "t", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.h$c */
    public static final class C12231c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C12231c f32876a = new C12231c();

        C12231c() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("Wiki_WikiViewModel", "requestWikiPerm err. ", th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/bean/TreeNode;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.h$d */
    public static final class C12232d<T> implements Consumer<TreeNode> {

        /* renamed from: a */
        final /* synthetic */ WikiViewModel f32877a;

        C12232d(WikiViewModel hVar) {
            this.f32877a = hVar;
        }

        /* renamed from: a */
        public final void accept(TreeNode treeNode) {
            this.f32877a.setWikiMeta(treeNode);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "t", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.h$e */
    public static final class C12233e<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C12233e f32878a = new C12233e();

        C12233e() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("Wiki_WikiViewModel", "requestWikiMeta err. ", th);
        }
    }

    public final void setSpaceId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.spaceId = str;
    }

    public final void setWikiToken(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.wikiToken = str;
    }

    public final boolean isType(C8275a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, ShareHitPoint.f121869d);
        if (aVar.mo32555b() == getObjTypeValue()) {
            return true;
        }
        return false;
    }

    public WikiViewModel(Bundle bundle) {
        C13479a.m54764b("Wiki_WikiViewModel", "onCreate");
        readArgs(bundle);
        init();
    }

    private final void readArgs(Bundle bundle) {
        String str;
        if (bundle != null) {
            BearUrl g = C6313i.m25327a().mo25399g(bundle.getString("url"));
            this.bearUrl = g;
            String str2 = "";
            if (g == null || (str = g.f17447b) == null) {
                str = str2;
            }
            this.wikiToken = str;
            String string = bundle.getString("space_id");
            if (string != null) {
                str2 = string;
            }
            this.spaceId = str2;
            this.spaceName = bundle.getString("space_name");
            WikiInfo wikiInfo2 = (WikiInfo) bundle.getSerializable("wiki_info");
            if (wikiInfo2 != null) {
                this.wikiInfo.mo5929b(wikiInfo2);
                String spaceId2 = wikiInfo2.getSpaceId();
                Intrinsics.checkExpressionValueIsNotNull(spaceId2, "info.spaceId");
                this.spaceId = spaceId2;
            }
        }
    }
}
