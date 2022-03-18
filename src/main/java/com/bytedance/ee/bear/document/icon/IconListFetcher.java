package com.bytedance.ee.bear.document.icon;

import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.document.icon.DocIconNetResult;
import com.bytedance.ee.log.C13479a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.C69294l;
import kotlin.sequences.Sequence;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001e\u0010\u0015\u001a\u00020\u00162\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006J\"\u0010\u0018\u001a\u00020\b2\u001a\u0010\u0019\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\u001c\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/document/icon/IconListFetcher;", "", "netService", "Lcom/bytedance/ee/bear/contract/NetService;", "(Lcom/bytedance/ee/bear/contract/NetService;)V", "defaultErrorHandler", "Lkotlin/Function1;", "", "", "docToken", "", "getDocToken", "()Ljava/lang/String;", "setDocToken", "(Ljava/lang/String;)V", "iconListConsumer", "", "Lcom/bytedance/ee/bear/document/icon/DocIconNetResult$Icon;", "consumeResult", "result", "Lcom/bytedance/ee/bear/document/icon/DocIconNetResult;", "fetch", "Lio/reactivex/disposables/Disposable;", "onError", "setIconListConsumer", "consumer", "Companion", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.icon.c */
public final class IconListFetcher {

    /* renamed from: a */
    public static final Companion f16345a = new Companion(null);

    /* renamed from: b */
    private final Function1<Throwable, Unit> f16346b = C5826e.INSTANCE;

    /* renamed from: c */
    private Function1<? super List<? extends DocIconNetResult.Icon>, Unit> f16347c;

    /* renamed from: d */
    private String f16348d;

    /* renamed from: e */
    private final NetService f16349e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/document/icon/IconListFetcher$Companion;", "", "()V", "GET_ICON_LIST_URL", "", "TAG", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.icon.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo23404a(String str) {
        this.f16348d = str;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "t", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.icon.c$e */
    static final class C5826e extends Lambda implements Function1<Throwable, Unit> {
        public static final C5826e INSTANCE = new C5826e();

        C5826e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke(th);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th) {
            C13479a.m54759a("IconListFetcher", "error in fetching icon list", th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "t", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.icon.c$g */
    static final class C5828g<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ Function1 f16352a;

        C5828g(Function1 function1) {
            this.f16352a = function1;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            this.f16352a.invoke(th);
        }
    }

    /* renamed from: a */
    public final void mo23405a(Function1<? super List<? extends DocIconNetResult.Icon>, Unit> function1) {
        this.f16347c = function1;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "icon", "Lcom/bytedance/ee/bear/document/icon/DocIconNetResult$Icon;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.icon.c$d */
    public static final class C5825d extends Lambda implements Function1<DocIconNetResult.Icon, Boolean> {
        public static final C5825d INSTANCE = new C5825d();

        C5825d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(DocIconNetResult.Icon icon) {
            return Boolean.valueOf(invoke(icon));
        }

        public final boolean invoke(DocIconNetResult.Icon icon) {
            if (icon == null || icon.type != 2) {
                return false;
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/document/icon/DocIconNetResult;", "kotlin.jvm.PlatformType", "it", "", "parse"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.icon.c$h */
    static final class C5829h<T extends NetService.Result<Serializable>> implements NetService.AbstractC5074c<DocIconNetResult> {

        /* renamed from: a */
        public static final C5829h f16353a = new C5829h();

        C5829h() {
        }

        /* renamed from: a */
        public final DocIconNetResult parse(String str) {
            return (DocIconNetResult) JSON.parseObject(str, DocIconNetResult.class);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/sequences/Sequence;", "Lcom/bytedance/ee/bear/document/icon/DocIconNetResult$Section;", "kotlin.jvm.PlatformType", "category", "Lcom/bytedance/ee/bear/document/icon/DocIconNetResult$Category;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.icon.c$b */
    public static final class C5823b extends Lambda implements Function1<DocIconNetResult.Category, Sequence<? extends DocIconNetResult.Section>> {
        public static final C5823b INSTANCE = new C5823b();

        C5823b() {
            super(1);
        }

        public final Sequence<DocIconNetResult.Section> invoke(DocIconNetResult.Category category) {
            List<DocIconNetResult.Section> list;
            Sequence<DocIconNetResult.Section> asSequence;
            if (category == null || (list = category.data) == null || (asSequence = CollectionsKt.asSequence(list)) == null) {
                return C69294l.m266114a();
            }
            return asSequence;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/sequences/Sequence;", "Lcom/bytedance/ee/bear/document/icon/DocIconNetResult$Icon;", "kotlin.jvm.PlatformType", "section", "Lcom/bytedance/ee/bear/document/icon/DocIconNetResult$Section;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.icon.c$c */
    public static final class C5824c extends Lambda implements Function1<DocIconNetResult.Section, Sequence<? extends DocIconNetResult.Icon>> {
        public static final C5824c INSTANCE = new C5824c();

        C5824c() {
            super(1);
        }

        public final Sequence<DocIconNetResult.Icon> invoke(DocIconNetResult.Section section) {
            List<DocIconNetResult.Icon> list;
            Sequence<DocIconNetResult.Icon> asSequence;
            if (section == null || (list = section.data) == null || (asSequence = CollectionsKt.asSequence(list)) == null) {
                return C69294l.m266114a();
            }
            return asSequence;
        }
    }

    public IconListFetcher(NetService netService) {
        Intrinsics.checkParameterIsNotNull(netService, "netService");
        this.f16349e = netService;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "result", "Lcom/bytedance/ee/bear/document/icon/DocIconNetResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.icon.c$f */
    static final class C5827f<T> implements Consumer<DocIconNetResult> {

        /* renamed from: a */
        final /* synthetic */ IconListFetcher f16350a;

        /* renamed from: b */
        final /* synthetic */ Function1 f16351b;

        C5827f(IconListFetcher cVar, Function1 function1) {
            this.f16350a = cVar;
            this.f16351b = function1;
        }

        /* renamed from: a */
        public final void accept(DocIconNetResult docIconNetResult) {
            if (docIconNetResult.code == 0) {
                C13479a.m54772d("IconListFetcher", "receive icons " + ((DocIconNetResult.Data) docIconNetResult.data));
                IconListFetcher cVar = this.f16350a;
                Intrinsics.checkExpressionValueIsNotNull(docIconNetResult, "result");
                cVar.mo23403a(docIconNetResult);
                return;
            }
            Function1 function1 = this.f16351b;
            function1.invoke(new RuntimeException("server error: " + docIconNetResult.code));
        }
    }

    /* renamed from: a */
    public final void mo23403a(DocIconNetResult docIconNetResult) {
        ArrayList arrayList = new ArrayList();
        List<DocIconNetResult.Category> list = ((DocIconNetResult.Data) docIconNetResult.data).data;
        if (list != null && !list.isEmpty()) {
            CollectionsKt.addAll(arrayList, C69294l.m266131a(C69294l.m266138d(C69294l.m266138d(CollectionsKt.asSequence(list), C5823b.INSTANCE), C5824c.INSTANCE), (Function1) C5825d.INSTANCE));
            Function1<? super List<? extends DocIconNetResult.Icon>, Unit> function1 = this.f16347c;
            if (function1 != null) {
                function1.invoke(arrayList);
            }
        }
    }

    /* renamed from: b */
    public final Disposable mo23406b(Function1<? super Throwable, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "onError");
        NetService.C5077f fVar = new NetService.C5077f("/space/api/icon/get");
        fVar.mo20143a(2);
        fVar.mo20145a("token", this.f16348d);
        List<String> listOf = CollectionsKt.listOf(String.valueOf(2));
        Map<String, List<String>> i = fVar.mo20160i();
        Intrinsics.checkExpressionValueIsNotNull(i, "duplicatedUrlParams");
        i.put("icon_types", listOf);
        Disposable b = this.f16349e.mo20117a(C5829h.f16353a).mo20141a(fVar).mo238001b(new C5827f(this, function1), new C5828g(function1));
        Intrinsics.checkExpressionValueIsNotNull(b, "netService.createPuller(…or(t) }\n                )");
        return b;
    }
}
