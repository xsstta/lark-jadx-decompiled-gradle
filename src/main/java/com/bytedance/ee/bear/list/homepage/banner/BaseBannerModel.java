package com.bytedance.ee.bear.list.homepage.banner;

import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.AbstractC8457h;
import com.bytedance.ee.bear.list.C8277e;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.homepage.banner.IBannerContract;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\b&\u0018\u0000 8*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u00018B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0016J\r\u0010&\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0017J\u001e\u0010'\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n0\fH&J\b\u0010(\u001a\u00020)H&J\b\u0010*\u001a\u00020+H&J\b\u0010,\u001a\u00020$H\u0016J\u0018\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nH\u0016J\b\u0010.\u001a\u00020$H\u0016J\u001e\u0010/\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n0\fH\u0016J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020201H\u0016J\b\u00103\u001a\u00020\u001bH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J$\u00104\u001a\u00020$2\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nH\u0004J\u0018\u00106\u001a\u00020$2\u000e\u00105\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u000107H\u0016R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u000e¢\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00028\u00008DX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\u0006¨\u00069"}, d2 = {"Lcom/bytedance/ee/bear/list/homepage/banner/BaseBannerModel;", "T", "Lcom/bytedance/ee/bear/list/ListCache;", "Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract$IModel;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "(Lcom/bytedance/ee/bear/service/ServiceContext;)V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/list/dto/Document;", "Lkotlin/collections/ArrayList;", "dataLiveData", "Landroidx/lifecycle/LiveData;", "disposable", "Lio/reactivex/disposables/Disposable;", "getDisposable", "()Lio/reactivex/disposables/Disposable;", "setDisposable", "(Lio/reactivex/disposables/Disposable;)V", "hasMore", "", "listCache", "getListCache", "()Lcom/bytedance/ee/bear/list/ListCache;", "listCache$delegate", "Lkotlin/Lazy;", "maxNum", "", "getMaxNum", "()I", "setMaxNum", "(I)V", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "setServiceContext", "clearListLiveData", "", "create", "createListCache", "createLiveData", "createParser", "Lcom/bytedance/ee/bear/list/DocumentListParser;", "createRequest", "Lcom/bytedance/ee/bear/contract/NetService$Request;", "destroy", "getList", "getListFromNet", "getListLiveData", "getRequestListFlowable", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/list/DocumentListInfo;", "getSize", "saveToDB", "list", "setList", "", "Companion", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.list.homepage.banner.c */
public abstract class BaseBannerModel<T extends AbstractC8457h> implements IBannerContract.IModel {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f22855a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BaseBannerModel.class), "listCache", "getListCache()Lcom/bytedance/ee/bear/list/ListCache;"))};

    /* renamed from: b */
    public static final Companion f22856b = new Companion(null);

    /* renamed from: c */
    private final Lazy f22857c = LazyKt.lazy(new C8466d(this));

    /* renamed from: d */
    private LiveData<ArrayList<Document>> f22858d;

    /* renamed from: e */
    private Disposable f22859e;

    /* renamed from: f */
    private ArrayList<Document> f22860f = new ArrayList<>();

    /* renamed from: g */
    private boolean f22861g;

    /* renamed from: h */
    private int f22862h = 6;

    /* renamed from: i */
    private C10917c f22863i;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final T mo33080a() {
        Lazy lazy = this.f22857c;
        KProperty kProperty = f22855a[0];
        return (T) ((AbstractC8457h) lazy.getValue());
    }

    /* renamed from: b */
    public abstract T mo33085b();

    /* renamed from: c */
    public abstract LiveData<ArrayList<Document>> mo33086c();

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    /* renamed from: g */
    public abstract C8277e mo33090g();

    /* renamed from: h */
    public abstract NetService.C5076e mo33091h();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/list/homepage/banner/BaseBannerModel$Companion;", "", "()V", "TAG", "", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.homepage.banner.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.IBannerContract.IModel
    /* renamed from: e */
    public ArrayList<Document> mo33088e() {
        return this.f22860f;
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.IBannerContract.IModel
    /* renamed from: f */
    public boolean mo33089f() {
        return this.f22861g;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "Lcom/bytedance/ee/bear/list/ListCache;", "invoke", "()Lcom/bytedance/ee/bear/list/ListCache;"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.homepage.banner.c$d */
    static final class C8466d extends Lambda implements Function0<T> {
        final /* synthetic */ BaseBannerModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8466d(BaseBannerModel cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return (T) this.this$0.mo33085b();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        Disposable disposable = this.f22859e;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.IBannerContract.IModel
    /* renamed from: k */
    public void mo33094k() {
        C13479a.m54764b("BaseBannerModel", "clearListLiveData()...");
        this.f22858d = null;
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.IBannerContract.IModel
    /* renamed from: d */
    public void mo33087d() {
        ConnectionService d = C5084ad.m20847d();
        Intrinsics.checkExpressionValueIsNotNull(d, "connectionService");
        ConnectionService.NetworkState b = d.mo20038b();
        Intrinsics.checkExpressionValueIsNotNull(b, "connectionService.networkState");
        if (b.mo20041b()) {
            this.f22859e = mo33092i().mo238001b(new C8464b(this), C8465c.f22865a);
        }
    }

    /* renamed from: i */
    public AbstractC68307f<DocumentListInfo> mo33092i() {
        AbstractC68307f<DocumentListInfo> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(mo33090g()).mo20141a(mo33091h());
        Intrinsics.checkExpressionValueIsNotNull(a, "puller.pull(createRequest())");
        return a;
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.IBannerContract.IModel
    /* renamed from: j */
    public LiveData<ArrayList<Document>> mo33093j() {
        if (this.f22858d == null) {
            this.f22858d = mo33086c();
        }
        C13479a.m54764b("BaseBannerModel", "getListLiveData()...liveData = " + this.f22858d);
        LiveData<ArrayList<Document>> liveData = this.f22858d;
        if (liveData == null) {
            Intrinsics.throwNpe();
        }
        return liveData;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33081a(int i) {
        this.f22862h = i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "T", "Lcom/bytedance/ee/bear/list/ListCache;", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.homepage.banner.c$c */
    static final class C8465c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C8465c f22865a = new C8465c();

        C8465c() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54761a("BaseBannerModel", th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33082a(Disposable disposable) {
        this.f22859e = disposable;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "T", "Lcom/bytedance/ee/bear/list/ListCache;", "it", "Lcom/bytedance/ee/bear/list/DocumentListInfo;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.homepage.banner.c$b */
    static final class C8464b<T> implements Consumer<DocumentListInfo> {

        /* renamed from: a */
        final /* synthetic */ BaseBannerModel f22864a;

        C8464b(BaseBannerModel cVar) {
            this.f22864a = cVar;
        }

        /* renamed from: a */
        public final void accept(DocumentListInfo documentListInfo) {
            BaseBannerModel cVar = this.f22864a;
            Intrinsics.checkExpressionValueIsNotNull(documentListInfo, "it");
            cVar.mo33083a(documentListInfo.getDocumentList());
        }
    }

    public BaseBannerModel(C10917c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        this.f22863i = cVar;
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.IBannerContract.IModel
    /* renamed from: a */
    public void mo33084a(List<? extends Document> list) {
        boolean z;
        this.f22860f.clear();
        List<? extends Document> list2 = list;
        boolean z2 = false;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C13479a.m54764b("BaseBannerModel", "data is null");
        } else {
            int size = list.size();
            int i = this.f22862h;
            if (size <= i) {
                this.f22860f.addAll(list2);
            } else {
                this.f22860f.addAll(list.subList(0, i));
            }
            z2 = true;
        }
        this.f22861g = z2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33083a(ArrayList<Document> arrayList) {
        Integer num;
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("saveToDB()...list = ");
        if (arrayList != null) {
            num = Integer.valueOf(arrayList.size());
        } else {
            num = null;
        }
        sb.append(num);
        C13479a.m54764b("BaseBannerModel", sb.toString());
        ArrayList<Document> arrayList2 = arrayList;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Iterator<Document> it = arrayList.iterator();
            while (it.hasNext()) {
                Document next = it.next();
                Intrinsics.checkExpressionValueIsNotNull(next, "node");
                next.mo32480r("");
            }
        }
        mo33080a().mo32620a(arrayList);
    }
}
