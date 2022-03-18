package com.bytedance.ee.bear.wikiv2.home.viewall_multitab;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.route.parcelable.IWiki;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.wikiv2.home.api.GetSpacePuller;
import com.bytedance.ee.bear.wikiv2.home.api.SpaceBean;
import com.bytedance.ee.bear.wikiv2.home.api.WikiSpaceRepository;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 '2\u00020\u0001:\u0002'(B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rH\u0002J\b\u0010\"\u001a\u00020\rH\u0003J\u0006\u0010#\u001a\u00020\rJ\u0006\u0010$\u001a\u00020\u001eJ\u0006\u0010%\u001a\u00020\u001eJ\b\u0010&\u001a\u00020\u001eH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006)"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListViewModel;", "Landroidx/lifecycle/ViewModel;", "spaceType", "", "(I)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "failure", "Landroidx/lifecycle/MutableLiveData;", "", "getFailure", "()Landroidx/lifecycle/MutableLiveData;", "<set-?>", "", "fromDb", "getFromDb", "()Z", "hasmore", "getHasmore", "lastLabel", "", "puller", "Lcom/bytedance/ee/bear/wikiv2/home/api/GetSpacePuller;", "spaceList", "", "Lcom/bytedance/ee/bear/wikiv2/home/api/SpaceBean;", "getSpaceList", "getSpaceType", "()I", "doLoadFromDb", "", "doPull", "replace", "saveDb", "doPullForV3", "hasData", "load", "loadmore", "onCleared", "Companion", "Factory", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.e */
public final class WikiSpaceListViewModel extends AbstractC1142af {
    public static final Companion Companion = new Companion(null);
    private final C68289a disposable = new C68289a();
    private final C1177w<Throwable> failure = new C1177w<>();
    public boolean fromDb;
    public boolean hasmore;
    public String lastLabel = "";
    private final GetSpacePuller puller = new GetSpacePuller((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null));
    private final C1177w<List<SpaceBean>> spaceList = new C1177w<>();
    private final int spaceType;

    @JvmStatic
    public static final WikiSpaceListViewModel newInstance(ViewModelStoreOwner viewModelStoreOwner, int i) {
        return Companion.mo47004a(viewModelStoreOwner, i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListViewModel$Companion;", "", "()V", "DEFAULT_NUM", "", "TAG", "", "newInstance", "Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListViewModel;", "context", "Landroidx/lifecycle/ViewModelStoreOwner;", "spaceType", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final WikiSpaceListViewModel mo47004a(ViewModelStoreOwner viewModelStoreOwner, int i) {
            Intrinsics.checkParameterIsNotNull(viewModelStoreOwner, "context");
            AbstractC1142af a = new C1144ai(viewModelStoreOwner, new Factory(i)).mo6005a(WikiSpaceListViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProvider(contex…istViewModel::class.java)");
            return (WikiSpaceListViewModel) a;
        }
    }

    public final C1177w<Throwable> getFailure() {
        return this.failure;
    }

    public final boolean getFromDb() {
        return this.fromDb;
    }

    public final boolean getHasmore() {
        return this.hasmore;
    }

    public final C1177w<List<SpaceBean>> getSpaceList() {
        return this.spaceList;
    }

    public final int getSpaceType() {
        return this.spaceType;
    }

    public final boolean hasData() {
        return !C13657b.m55421a(this.spaceList.mo5927b());
    }

    public final void loadmore() {
        C13479a.m54764b("WikiSpaceListViewModel", "loadmore. ");
        doPull(false, false);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        super.onCleared();
        this.disposable.mo237935a();
    }

    @Deprecated(message = "Wiki2.0 GA后去掉")
    private final boolean doPullForV3() {
        if (!((IWiki) KoinJavaComponent.m268613a(IWiki.class, null, null, 6, null)).mo21072d()) {
            return false;
        }
        C13479a.m54764b("WikiSpaceListViewModel", "doPullForV3");
        doPull(true, false);
        return true;
    }

    private final void doLoadFromDb() {
        this.disposable.mo237937a(WikiSpaceRepository.f32942a.mo46818a(this.spaceType).mo237985a(C11678b.m48481e()).mo238001b(new C12325c(this), new C12326d(this)));
    }

    public final void load() {
        C13479a.m54764b("WikiSpaceListViewModel", "load. ");
        this.lastLabel = "";
        this.hasmore = false;
        if (!doPullForV3()) {
            ConnectionService d = C5084ad.m20847d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ConnectionServiceImp.getInstance()");
            ConnectionService.NetworkState b = d.mo20038b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ConnectionServiceImp.get…            .networkState");
            if (b.mo20041b()) {
                doPull(true, true);
            } else if (C13657b.m55421a(this.spaceList.mo5927b())) {
                doLoadFromDb();
            }
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J'\u0010\u0005\u001a\u0002H\u0006\"\n\b\u0000\u0010\u0006*\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "spaceType", "", "(I)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.e$b */
    public static final class Factory implements C1144ai.AbstractC1146b {

        /* renamed from: a */
        private final int f33099a;

        public Factory(int i) {
            this.f33099a = i;
        }

        @Override // androidx.lifecycle.C1144ai.AbstractC1146b
        public <T extends AbstractC1142af> T create(Class<T> cls) {
            Intrinsics.checkParameterIsNotNull(cls, "modelClass");
            return new WikiSpaceListViewModel(this.f33099a);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/bytedance/ee/bear/wikiv2/home/api/SpaceBean;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.e$c */
    public static final class C12325c<T> implements Consumer<List<? extends SpaceBean>> {

        /* renamed from: a */
        final /* synthetic */ WikiSpaceListViewModel f33100a;

        C12325c(WikiSpaceListViewModel eVar) {
            this.f33100a = eVar;
        }

        /* renamed from: a */
        public final void accept(List<? extends SpaceBean> list) {
            this.f33100a.fromDb = true;
            this.f33100a.getSpaceList().mo5929b((List<SpaceBean>) list);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.e$d */
    public static final class C12326d<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ WikiSpaceListViewModel f33101a;

        C12326d(WikiSpaceListViewModel eVar) {
            this.f33101a = eVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("WikiSpaceListViewModel", "doLoadFromDb fail. ", th);
            this.f33101a.getFailure().mo5929b(th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.e$f */
    public static final class C12328f<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ WikiSpaceListViewModel f33105a;

        C12328f(WikiSpaceListViewModel eVar) {
            this.f33105a = eVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "throwable");
            C13479a.m54759a("WikiSpaceListViewModel", "doPull space list fail. ", th);
            this.f33105a.getFailure().mo5929b(th);
        }
    }

    public WikiSpaceListViewModel(int i) {
        this.spaceType = i;
        load();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/wikiv2/home/api/GetSpacePuller$Result;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.e$e */
    public static final class C12327e<T> implements Consumer<GetSpacePuller.Result> {

        /* renamed from: a */
        final /* synthetic */ WikiSpaceListViewModel f33102a;

        /* renamed from: b */
        final /* synthetic */ boolean f33103b;

        /* renamed from: c */
        final /* synthetic */ boolean f33104c;

        C12327e(WikiSpaceListViewModel eVar, boolean z, boolean z2) {
            this.f33102a = eVar;
            this.f33103b = z;
            this.f33104c = z2;
        }

        /* renamed from: a */
        public final void accept(GetSpacePuller.Result result) {
            ArrayList arrayList;
            WikiSpaceListViewModel eVar = this.f33102a;
            String str = result.last_label;
            Intrinsics.checkExpressionValueIsNotNull(str, "it.last_label");
            eVar.lastLabel = str;
            this.f33102a.hasmore = result.has_more;
            this.f33102a.fromDb = false;
            if (this.f33103b) {
                arrayList = new ArrayList();
            } else {
                List<SpaceBean> b = this.f33102a.getSpaceList().mo5927b();
                if (!(b instanceof ArrayList)) {
                    b = null;
                }
                arrayList = (ArrayList) b;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
            }
            ArrayList arrayList2 = result.spaces;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            arrayList.addAll(arrayList2);
            this.f33102a.getSpaceList().mo5929b(arrayList);
            if (this.f33104c) {
                WikiSpaceRepository.f32942a.mo46819a(arrayList2);
            }
        }
    }

    private final void doPull(boolean z, boolean z2) {
        Integer num;
        GetSpacePuller.Params params = new GetSpacePuller.Params();
        int i = this.spaceType;
        if (i == -1) {
            num = null;
        } else {
            num = Integer.valueOf(i);
        }
        params.type = num;
        params.size = 40;
        params.last_label = this.lastLabel;
        this.disposable.mo237937a(this.puller.pull((Serializable) params).mo238001b(new C12327e(this, z, z2), new C12328f(this)));
    }
}
