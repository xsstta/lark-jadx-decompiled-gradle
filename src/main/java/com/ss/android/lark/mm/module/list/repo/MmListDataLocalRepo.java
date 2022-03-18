package com.ss.android.lark.mm.module.list.repo;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.external.MmSp;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.android.lark.mm.module.list.data.MinutesListResponse;
import com.ss.android.lark.mm.module.list.data.MinutesSummaryData;
import com.ss.android.lark.mm.module.list.data.MmOwnerType;
import com.ss.android.lark.mm.module.list.repo.IMmListDataRepo;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45857i;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.p3457e.C68296b;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0002J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0002J@\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\r0\u0017H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0002JN\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\r0 2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\r0\u0017H\u0016J\b\u0010!\u001a\u00020\rH\u0003J\u0012\u0010\"\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010$\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u000bH\u0017R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\n0\tX\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/lark/mm/module/list/repo/MmListDataLocalRepo;", "Lcom/ss/android/lark/mm/module/list/repo/IMmListDataRepo;", "()V", "disposable", "Lio/reactivex/disposables/Disposable;", "homeListCacheKey", "", "myListCacheKey", "updateSubject", "Lio/reactivex/subjects/PublishSubject;", "Lkotlin/Pair;", "Lcom/ss/android/lark/mm/module/list/data/MinutesListResponse;", "cleanCache", "", "clear", "getCacheData", "cacheKey", "getHomeListCacheKey", "getHomeListData", "timestamp", "ownerType", "Lcom/ss/android/lark/mm/module/list/data/MmOwnerType;", "onSucceed", "Lkotlin/Function1;", "onFailed", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "getMyListCacheKey", "getMyListData", "rank", "", "isAsc", "", "Lkotlin/Function2;", "subscribeUpdate", "updateHomeListFirstPageData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "updateMyListFirstPageData", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.list.repo.b */
public final class MmListDataLocalRepo implements IMmListDataRepo {

    /* renamed from: a */
    public static final Companion f116893a = new Companion(null);

    /* renamed from: f */
    private static final long f116894f = TimeUnit.DAYS.toMillis(1);

    /* renamed from: b */
    private String f116895b;

    /* renamed from: c */
    private String f116896c;

    /* renamed from: d */
    private C68296b<Pair<String, MinutesListResponse>> f116897d;

    /* renamed from: e */
    private Disposable f116898e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mm/module/list/repo/MmListDataLocalRepo$Companion;", "", "()V", "HOME_LIST", "", "MAX_CACHE_VALID_DURATION", "", "MY_LIST", "TAG", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.repo.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: a */
    public void mo163247a(String str, Function0<Unit> function0, Function0<Unit> function02) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(function0, "onSucceed");
        IMmListDataRepo.C46422a.m183690a(this, str, function0, function02);
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: a */
    public void mo163248a(String str, Function0<Unit> function0, Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(str, "objectTokens");
        Intrinsics.checkParameterIsNotNull(function0, "onSucceed");
        IMmListDataRepo.C46422a.m183692a(this, str, function0, function1);
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: a */
    public void mo163249a(String str, Function1<? super MinutesListResponse, Unit> function1, Function1<? super C47068a, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(str, "timestamp");
        Intrinsics.checkParameterIsNotNull(function1, "onSucceed");
        Intrinsics.checkParameterIsNotNull(function12, "onFailed");
        IMmListDataRepo.C46422a.m183693a(this, str, function1, function12);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.repo.b$b */
    static final class RunnableC46423b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmListDataLocalRepo f116899a;

        /* renamed from: b */
        final /* synthetic */ Function1 f116900b;

        RunnableC46423b(MmListDataLocalRepo bVar, Function1 function1) {
            this.f116899a = bVar;
            this.f116900b = function1;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/mm/module/list/repo/MmListDataLocalRepo$getHomeListData$1$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.list.repo.b$b$a */
        static final class RunnableC46424a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ MinutesListResponse f116901a;

            /* renamed from: b */
            final /* synthetic */ RunnableC46423b f116902b;

            RunnableC46424a(MinutesListResponse minutesListResponse, RunnableC46423b bVar) {
                this.f116901a = minutesListResponse;
                this.f116902b = bVar;
            }

            public final void run() {
                this.f116901a.setFromNetwork(false);
                this.f116902b.f116900b.invoke(this.f116901a);
            }
        }

        public final void run() {
            MmListDataLocalRepo bVar = this.f116899a;
            MinutesListResponse a = bVar.mo163252a(bVar.mo163254c());
            if (a != null) {
                C45859k.m181685a(new RunnableC46424a(a, this));
            }
        }
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: a */
    public void mo163240a() {
        IMmListDataRepo.C46422a.m183685a(this);
        Disposable disposable = this.f116898e;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.repo.b$c */
    static final class RunnableC46425c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmListDataLocalRepo f116903a;

        /* renamed from: b */
        final /* synthetic */ Function2 f116904b;

        RunnableC46425c(MmListDataLocalRepo bVar, Function2 kVar) {
            this.f116903a = bVar;
            this.f116904b = kVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/mm/module/list/repo/MmListDataLocalRepo$getMyListData$1$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.list.repo.b$c$a */
        static final class RunnableC46426a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ MinutesListResponse f116905a;

            /* renamed from: b */
            final /* synthetic */ RunnableC46425c f116906b;

            RunnableC46426a(MinutesListResponse minutesListResponse, RunnableC46425c cVar) {
                this.f116905a = minutesListResponse;
                this.f116906b = cVar;
            }

            public final void run() {
                this.f116905a.setFromNetwork(false);
                this.f116906b.f116904b.invoke(this.f116905a, false);
            }
        }

        public final void run() {
            MmListDataLocalRepo bVar = this.f116903a;
            MinutesListResponse a = bVar.mo163252a(bVar.mo163253b());
            if (a != null) {
                C45859k.m181685a(new RunnableC46426a(a, this));
            }
        }
    }

    public MmListDataLocalRepo() {
        C68296b<Pair<String, MinutesListResponse>> a = C68296b.m265052a();
        Intrinsics.checkExpressionValueIsNotNull(a, "PublishSubject.create()");
        this.f116897d = a;
        m183696e();
    }

    /* renamed from: e */
    private final void m183696e() {
        this.f116898e = this.f116897d.debounce(200, TimeUnit.MILLISECONDS).observeOn(LarkRxSchedulers.computation()).subscribe(new C46427d(this));
    }

    /* renamed from: d */
    public final void mo163255d() {
        String b = mo163253b();
        if (b != null) {
            MmSp.f115679a.mo161157a(b);
        }
        String c = mo163254c();
        if (c != null) {
            MmSp.f115679a.mo161157a(c);
        }
    }

    /* renamed from: b */
    public final String mo163253b() {
        boolean z;
        if (this.f116895b == null) {
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            IMmDepend.ILoginDepend loginDepend = a.getLoginDepend();
            Intrinsics.checkExpressionValueIsNotNull(loginDepend, "MmDepend.impl().loginDepend");
            String b = loginDepend.mo144650b();
            IMmDepend a2 = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "MmDepend.impl()");
            IMmDepend.ILoginDepend loginDepend2 = a2.getLoginDepend();
            Intrinsics.checkExpressionValueIsNotNull(loginDepend2, "MmDepend.impl().loginDepend");
            String a3 = loginDepend2.mo144647a();
            String str = b;
            boolean z2 = false;
            if (str == null || StringsKt.isBlank(str)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            String str2 = a3;
            if (str2 == null || StringsKt.isBlank(str2)) {
                z2 = true;
            }
            if (z2) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Minutes_My_List_");
            sb.append((b + a3).hashCode());
            this.f116895b = sb.toString();
        }
        return this.f116895b;
    }

    /* renamed from: c */
    public final String mo163254c() {
        boolean z;
        if (this.f116896c == null) {
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            IMmDepend.ILoginDepend loginDepend = a.getLoginDepend();
            Intrinsics.checkExpressionValueIsNotNull(loginDepend, "MmDepend.impl().loginDepend");
            String b = loginDepend.mo144650b();
            IMmDepend a2 = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "MmDepend.impl()");
            IMmDepend.ILoginDepend loginDepend2 = a2.getLoginDepend();
            Intrinsics.checkExpressionValueIsNotNull(loginDepend2, "MmDepend.impl().loginDepend");
            String a3 = loginDepend2.mo144647a();
            String str = b;
            boolean z2 = false;
            if (str == null || StringsKt.isBlank(str)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            String str2 = a3;
            if (str2 == null || StringsKt.isBlank(str2)) {
                z2 = true;
            }
            if (z2) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Minutes_Home_List_");
            sb.append((b + a3).hashCode());
            this.f116896c = sb.toString();
        }
        return this.f116896c;
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: b */
    public void mo163250b(MinutesListResponse minutesListResponse) {
        if (minutesListResponse != null) {
            this.f116897d.onNext(TuplesKt.to("my_list", minutesListResponse));
        }
    }

    /* renamed from: a */
    public final MinutesListResponse mo163252a(String str) {
        boolean z;
        MmListCacheData mmListCacheData;
        String str2 = str;
        boolean z2 = false;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || (mmListCacheData = (MmListCacheData) MmSp.f115679a.mo161155a(str, MmListCacheData.class)) == null) {
            return null;
        }
        String appVersionName = mmListCacheData.getAppVersionName();
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45879g hostDepend = a.getHostDepend();
        Intrinsics.checkExpressionValueIsNotNull(hostDepend, "MmDepend.impl().hostDepend");
        boolean areEqual = Intrinsics.areEqual(appVersionName, hostDepend.mo144640h());
        if (System.currentTimeMillis() - mmListCacheData.getCacheTime() <= f116894f) {
            z2 = true;
        }
        if (areEqual && z2) {
            return mmListCacheData.getListData();
        }
        C45855f.m181663b("MmListDataLocalRepo", "cache time beyond 1 day or not sameAppVersionName, invalid cache data");
        mo163255d();
        return null;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lkotlin/Pair;", "", "Lcom/ss/android/lark/mm/module/list/data/MinutesListResponse;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.repo.b$d */
    public static final class C46427d<T> implements Consumer<Pair<? extends String, ? extends MinutesListResponse>> {

        /* renamed from: a */
        final /* synthetic */ MmListDataLocalRepo f116907a;

        C46427d(MmListDataLocalRepo bVar) {
            this.f116907a = bVar;
        }

        /* renamed from: a */
        public final void accept(Pair<String, MinutesListResponse> pair) {
            String str;
            boolean z;
            String str2;
            MinutesListResponse second;
            List<MinutesSummaryData> list = null;
            if (pair != null) {
                str = pair.getFirst();
            } else {
                str = null;
            }
            if (!(pair == null || (second = pair.getSecond()) == null)) {
                list = second.getList();
            }
            if (pair != null) {
                List<MinutesSummaryData> list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (Intrinsics.areEqual(str, "home_list")) {
                        str2 = this.f116907a.mo163254c();
                    } else {
                        str2 = this.f116907a.mo163253b();
                    }
                    if (str2 != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        List<MinutesSummaryData> subList = list.subList(0, Math.min(list.size(), 20));
                        MinutesListResponse copy$default = MinutesListResponse.copy$default(pair.getSecond(), null, null, null, null, null, subList, 0, false, 223, null);
                        IMmDepend a = C45899c.m181859a();
                        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
                        IMmDepend.AbstractC45879g hostDepend = a.getHostDepend();
                        Intrinsics.checkExpressionValueIsNotNull(hostDepend, "MmDepend.impl().hostDepend");
                        String h = hostDepend.mo144640h();
                        Intrinsics.checkExpressionValueIsNotNull(h, "MmDepend.impl().hostDepend.appVersionName");
                        MmSp.f115679a.mo161158a(str2, new MmListCacheData(copy$default, h, System.currentTimeMillis()));
                        C45855f.m181664c("MmListDataLocalRepo", "[updateFirstPageData] cacheKey:" + str2 + ", size: " + subList.size() + ", time: " + (System.currentTimeMillis() - currentTimeMillis) + ' ');
                        return;
                    }
                    return;
                }
            }
            this.f116907a.mo163255d();
        }
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: a */
    public void mo163243a(MinutesListResponse minutesListResponse) {
        IMmListDataRepo.C46422a.m183688a(this, minutesListResponse);
        if (minutesListResponse != null) {
            this.f116897d.onNext(TuplesKt.to("home_list", minutesListResponse));
        }
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: b */
    public void mo163251b(String str, Function0<Unit> function0, Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(str, "objectTokens");
        Intrinsics.checkParameterIsNotNull(function0, "onSucceed");
        IMmListDataRepo.C46422a.m183695b(this, str, function0, function1);
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: a */
    public void mo163246a(String str, MmOwnerType mmOwnerType, Function1<? super MinutesListResponse, Unit> function1, Function1<? super C47068a, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(str, "timestamp");
        Intrinsics.checkParameterIsNotNull(mmOwnerType, "ownerType");
        Intrinsics.checkParameterIsNotNull(function1, "onSucceed");
        Intrinsics.checkParameterIsNotNull(function12, "onFailed");
        if (!Intrinsics.areEqual(str, "0")) {
            C45855f.m181663b("MmListDataLocalRepo", "not first page data, ignore cache");
        } else {
            C45857i.m181676a(new RunnableC46423b(this, function1));
        }
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: a */
    public void mo163241a(MmListControl.DataSource dataSource, String str, String str2, Function0<Unit> function0, Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(dataSource, "ds");
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "newName");
        Intrinsics.checkParameterIsNotNull(function0, "onSucceed");
        IMmListDataRepo.C46422a.m183686a(this, dataSource, str, str2, function0, function1);
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: a */
    public void mo163242a(MmListControl.DataSource dataSource, String str, boolean z, Function0<Unit> function0, Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(dataSource, "ds");
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(function0, "onSucceed");
        Intrinsics.checkParameterIsNotNull(function1, "onFailed");
        IMmListDataRepo.C46422a.m183687a(this, dataSource, str, z, function0, function1);
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: a */
    public void mo163244a(String str, int i, boolean z, Function1<? super MinutesListResponse, Unit> function1, Function1<? super C47068a, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(str, "timestamp");
        Intrinsics.checkParameterIsNotNull(function1, "onSucceed");
        Intrinsics.checkParameterIsNotNull(function12, "onFailed");
        IMmListDataRepo.C46422a.m183689a(this, str, i, z, function1, function12);
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: a */
    public void mo163245a(String str, int i, boolean z, Function2<? super MinutesListResponse, ? super Boolean, Unit> kVar, Function1<? super C47068a, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(str, "timestamp");
        Intrinsics.checkParameterIsNotNull(kVar, "onSucceed");
        Intrinsics.checkParameterIsNotNull(function1, "onFailed");
        if (!Intrinsics.areEqual(str, "0")) {
            C45855f.m181663b("MmListDataLocalRepo", "not first page data, ignore cache");
        } else {
            C45857i.m181676a(new RunnableC46425c(this, kVar));
        }
    }
}
