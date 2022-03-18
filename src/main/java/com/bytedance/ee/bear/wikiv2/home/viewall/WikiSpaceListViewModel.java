package com.bytedance.ee.bear.wikiv2.home.viewall;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.wikiv2.home.api.WikiSpaceRepository;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListViewModel;", "Landroidx/lifecycle/ViewModel;", "args", "Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListArgs;", "(Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListArgs;)V", "getArgs", "()Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListArgs;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "spaceList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/bytedance/ee/bear/list/dto/Document;", "getSpaceList", "()Landroidx/lifecycle/MutableLiveData;", "title", "", "getTitle", "getWikiSpace", "Lcom/bytedance/ee/bear/contract/route/parcelable/WikiDocument;", "spaceId", "", "loadSpaceList", "", "loadTitle", "onCleared", "Companion", "Factory", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall.b */
public final class WikiSpaceListViewModel extends AbstractC1142af {
    public static final Companion Companion = new Companion(null);
    private final WikiSpaceListArgs args;
    private final C68289a disposables = new C68289a();
    private final C1177w<List<Document>> spaceList = new C1177w<>();
    private final C1177w<Integer> title = new C1177w<>();

    @JvmStatic
    public static final WikiSpaceListViewModel get(ViewModelStoreOwner viewModelStoreOwner, WikiSpaceListArgs wikiSpaceListArgs) {
        return Companion.mo46943a(viewModelStoreOwner, wikiSpaceListArgs);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListViewModel$Companion;", "", "()V", "TAG", "", "get", "Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListViewModel;", "context", "Landroidx/lifecycle/ViewModelStoreOwner;", "args", "Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListArgs;", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final WikiSpaceListViewModel mo46943a(ViewModelStoreOwner viewModelStoreOwner, WikiSpaceListArgs wikiSpaceListArgs) {
            Intrinsics.checkParameterIsNotNull(viewModelStoreOwner, "context");
            Intrinsics.checkParameterIsNotNull(wikiSpaceListArgs, "args");
            AbstractC1142af a = new C1144ai(viewModelStoreOwner, new Factory(wikiSpaceListArgs)).mo6005a(WikiSpaceListViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProvider(contex…istViewModel::class.java)");
            return (WikiSpaceListViewModel) a;
        }
    }

    public final WikiSpaceListArgs getArgs() {
        return this.args;
    }

    public final C1177w<List<Document>> getSpaceList() {
        return this.spaceList;
    }

    public final C1177w<Integer> getTitle() {
        return this.title;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        super.onCleared();
        this.disposables.mo237935a();
    }

    private final void loadTitle() {
        Integer num;
        C1177w<Integer> wVar = this.title;
        int pageMode = this.args.getPageMode();
        if (pageMode == 1) {
            num = Integer.valueOf((int) R.string.Doc_Wiki_CreatePage);
        } else if (pageMode == 2 || pageMode == 3) {
            num = Integer.valueOf((int) R.string.CreationMobile_Wiki_Shortcuts_SelectWorkspace_Title);
        } else if (pageMode != 4) {
            num = Integer.valueOf((int) R.string.Doc_Wiki_Home_WorkspaceTitle);
        } else {
            num = Integer.valueOf((int) R.string.CreationMobile_Wiki_CreateCopy_CreateCopyTo_Title);
        }
        wVar.mo5929b(num);
    }

    public final void loadSpaceList() {
        C13479a.m54764b("WikiSpaceListViewModel", "loadSpaceList. ");
        this.disposables.mo237937a(WikiSpaceRepository.m51025a().mo237985a(C11678b.m48481e()).mo238001b(new C12307c(this), new C12308d(this)));
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J'\u0010\u0007\u001a\u0002H\b\"\n\b\u0000\u0010\b*\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016¢\u0006\u0002\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "args", "Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListArgs;", "(Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListArgs;)V", "getArgs", "()Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListArgs;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall.b$b */
    public static final class Factory implements C1144ai.AbstractC1146b {

        /* renamed from: a */
        private final WikiSpaceListArgs f33042a;

        public Factory(WikiSpaceListArgs wikiSpaceListArgs) {
            Intrinsics.checkParameterIsNotNull(wikiSpaceListArgs, "args");
            this.f33042a = wikiSpaceListArgs;
        }

        @Override // androidx.lifecycle.C1144ai.AbstractC1146b
        public <T extends AbstractC1142af> T create(Class<T> cls) {
            Intrinsics.checkParameterIsNotNull(cls, "modelClass");
            return cls.getConstructor(WikiSpaceListArgs.class).newInstance(this.f33042a);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "list", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/list/dto/Document;", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall.b$c */
    public static final class C12307c<T> implements Consumer<ArrayList<Document>> {

        /* renamed from: a */
        final /* synthetic */ WikiSpaceListViewModel f33043a;

        C12307c(WikiSpaceListViewModel bVar) {
            this.f33043a = bVar;
        }

        /* renamed from: a */
        public final void accept(ArrayList<Document> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "list");
            this.f33043a.getSpaceList().mo5929b(arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall.b$d */
    public static final class C12308d<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ WikiSpaceListViewModel f33044a;

        C12308d(WikiSpaceListViewModel bVar) {
            this.f33044a = bVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("WikiSpaceListViewModel", "pull space list fail. ", th);
            this.f33044a.getSpaceList().mo5929b(CollectionsKt.emptyList());
        }
    }

    public WikiSpaceListViewModel(WikiSpaceListArgs wikiSpaceListArgs) {
        Intrinsics.checkParameterIsNotNull(wikiSpaceListArgs, "args");
        this.args = wikiSpaceListArgs;
        loadTitle();
    }

    public final WikiDocument getWikiSpace(String str) {
        Intrinsics.checkParameterIsNotNull(str, "spaceId");
        List<Document> b = this.spaceList.mo5927b();
        WikiDocument wikiDocument = null;
        if (b == null) {
            return null;
        }
        for (Document document : b) {
            if (TextUtils.equals(document.mo32399O(), str)) {
                if (document instanceof WikiDocument) {
                    wikiDocument = document;
                }
                return wikiDocument;
            }
        }
        return null;
    }
}
