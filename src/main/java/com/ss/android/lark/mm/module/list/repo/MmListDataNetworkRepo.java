package com.ss.android.lark.mm.module.list.repo;

import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.android.lark.mm.module.list.data.MinutesListResponse;
import com.ss.android.lark.mm.module.list.data.MmOwnerType;
import com.ss.android.lark.mm.module.list.repo.IMmListDataRepo;
import com.ss.android.lark.mm.module.record.audiorecorder.MmAudioFileHelper;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.p2333b.AbstractC47071d;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.net.parse.MmStringResp;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45857i;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.utils.ResString;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002JB\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u000eH\u0016J@\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\u000eH\u0016JN\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u00192\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\u000eH\u0016JH\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\u000eH\u0016J8\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\u000eH\u0016J4\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eH\u0016J4\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eH\u0016JS\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f2#\u0010\r\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eH\u0016J.\u0010$\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\fH\u0016¨\u0006&"}, d2 = {"Lcom/ss/android/lark/mm/module/list/repo/MmListDataNetworkRepo;", "Lcom/ss/android/lark/mm/module/list/repo/IMmListDataRepo;", "()V", "deleteItem", "", "ds", "Lcom/ss/android/lark/mm/module/list/control/MmListControl$DataSource;", "token", "", "isPermanentlyDelete", "", "onSucceed", "Lkotlin/Function0;", "onFailed", "Lkotlin/Function1;", "getHomeListData", "timestamp", "ownerType", "Lcom/ss/android/lark/mm/module/list/data/MmOwnerType;", "Lcom/ss/android/lark/mm/module/list/data/MinutesListResponse;", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "getMyListData", "rank", "", "isAsc", "Lkotlin/Function2;", "getSharedListData", "getTrashListData", "removeFromHomeSpace", "objectTokens", "removeFromSharedSpace", "rename", "newName", "Lkotlin/ParameterName;", "name", "errorMsg", "restore", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.list.repo.c */
public final class MmListDataNetworkRepo implements IMmListDataRepo {

    /* renamed from: a */
    public static final Companion f116908a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mm/module/list/repo/MmListDataNetworkRepo$Companion;", "", "()V", "TAG", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.repo.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: a */
    public void mo163240a() {
        IMmListDataRepo.C46422a.m183685a(this);
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: a */
    public void mo163249a(String str, Function1<? super MinutesListResponse, Unit> function1, Function1<? super C47068a, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(str, "timestamp");
        Intrinsics.checkParameterIsNotNull(function1, "onSucceed");
        Intrinsics.checkParameterIsNotNull(function12, "onFailed");
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45875c domainDepend = a.getDomainDepend();
        Intrinsics.checkExpressionValueIsNotNull(domainDepend, "MmDepend.impl().domainDepend");
        C47057a.m186271b(domainDepend.mo144616a(), str, 20, new C46437f(function1, function12));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/list/repo/MmListDataNetworkRepo$getHomeListData$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.repo.c$c */
    public static final class C46429c extends AbstractC47070c<String> {

        /* renamed from: a */
        final /* synthetic */ Function1 f116913a;

        /* renamed from: b */
        final /* synthetic */ Function1 f116914b;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.list.repo.c$c$a */
        public static final class RunnableC46430a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C46429c f116915a;

            /* renamed from: b */
            final /* synthetic */ String f116916b;

            RunnableC46430a(C46429c cVar, String str) {
                this.f116915a = cVar;
                this.f116916b = str;
            }

            public final void run() {
                try {
                    final MinutesListResponse minutesListResponse = (MinutesListResponse) new Gson().fromJson(this.f116916b, MinutesListResponse.class);
                    minutesListResponse.setFromNetwork(true);
                    C45859k.m181685a(new Runnable(this) {
                        /* class com.ss.android.lark.mm.module.list.repo.MmListDataNetworkRepo.C46429c.RunnableC46430a.RunnableC464311 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC46430a f116917a;

                        {
                            this.f116917a = r1;
                        }

                        public final void run() {
                            Function1 function1 = this.f116917a.f116915a.f116913a;
                            MinutesListResponse minutesListResponse = minutesListResponse;
                            Intrinsics.checkExpressionValueIsNotNull(minutesListResponse, "response");
                            function1.invoke(minutesListResponse);
                        }
                    });
                } catch (Exception e) {
                    C45855f.m181666e("MmListNetworkRepo", "[getHomeListData] JsonSyntaxException ex: " + e);
                }
            }
        }

        /* renamed from: a */
        public void mo161289a(String str) {
            C45857i.m181676a(new RunnableC46430a(this, str));
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "errorResult");
            C45855f.m181666e("MmListNetworkRepo", "[getMyList] [onError] error: " + aVar);
            this.f116914b.invoke(aVar);
        }

        C46429c(Function1 function1, Function1 function12) {
            this.f116913a = function1;
            this.f116914b = function12;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/list/repo/MmListDataNetworkRepo$getMyListData$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.repo.c$d */
    public static final class C46432d extends AbstractC47070c<String> {

        /* renamed from: a */
        final /* synthetic */ Function2 f116919a;

        /* renamed from: b */
        final /* synthetic */ Function1 f116920b;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.list.repo.c$d$a */
        public static final class RunnableC46433a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C46432d f116921a;

            /* renamed from: b */
            final /* synthetic */ String f116922b;

            RunnableC46433a(C46432d dVar, String str) {
                this.f116921a = dVar;
                this.f116922b = str;
            }

            public final void run() {
                try {
                    final MinutesListResponse minutesListResponse = (MinutesListResponse) new Gson().fromJson(this.f116922b, MinutesListResponse.class);
                    minutesListResponse.setFromNetwork(true);
                    C45859k.m181685a(new Runnable(this) {
                        /* class com.ss.android.lark.mm.module.list.repo.MmListDataNetworkRepo.C46432d.RunnableC46433a.RunnableC464341 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC46433a f116923a;

                        {
                            this.f116923a = r1;
                        }

                        public final void run() {
                            Function2 kVar = this.f116923a.f116921a.f116919a;
                            MinutesListResponse minutesListResponse = minutesListResponse;
                            Intrinsics.checkExpressionValueIsNotNull(minutesListResponse, "response");
                            kVar.invoke(minutesListResponse, true);
                        }
                    });
                } catch (Exception e) {
                    C45855f.m181666e("MmListNetworkRepo", "[getMyList] JsonSyntaxException ex: " + e);
                }
            }
        }

        /* renamed from: a */
        public void mo161289a(String str) {
            C45857i.m181676a(new RunnableC46433a(this, str));
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "errorResult");
            C45855f.m181666e("MmListNetworkRepo", "[getMyList] [onError] error: " + aVar);
            this.f116920b.invoke(aVar);
        }

        C46432d(Function2 kVar, Function1 function1) {
            this.f116919a = kVar;
            this.f116920b = function1;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/list/repo/MmListDataNetworkRepo$getSharedListData$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.repo.c$e */
    public static final class C46435e extends AbstractC47070c<String> {

        /* renamed from: a */
        final /* synthetic */ Function1 f116925a;

        /* renamed from: b */
        final /* synthetic */ Function1 f116926b;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.list.repo.c$e$a */
        public static final class RunnableC46436a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C46435e f116927a;

            /* renamed from: b */
            final /* synthetic */ String f116928b;

            RunnableC46436a(C46435e eVar, String str) {
                this.f116927a = eVar;
                this.f116928b = str;
            }

            public final void run() {
                try {
                    MinutesListResponse minutesListResponse = (MinutesListResponse) new Gson().fromJson(this.f116928b, MinutesListResponse.class);
                    minutesListResponse.setFromNetwork(true);
                    Function1 function1 = this.f116927a.f116925a;
                    Intrinsics.checkExpressionValueIsNotNull(minutesListResponse, "response");
                    function1.invoke(minutesListResponse);
                } catch (Exception e) {
                    C45855f.m181666e("MmListNetworkRepo", "[getSharedListData] JsonSyntaxException ex: " + e);
                }
            }
        }

        /* renamed from: a */
        public void mo161289a(String str) {
            C45857i.m181676a(new RunnableC46436a(this, str));
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "errorResult");
            C45855f.m181666e("MmListNetworkRepo", "[getSharedListData] [onError] error: " + aVar);
            this.f116926b.invoke(aVar);
        }

        C46435e(Function1 function1, Function1 function12) {
            this.f116925a = function1;
            this.f116926b = function12;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/list/repo/MmListDataNetworkRepo$getTrashListData$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.repo.c$f */
    public static final class C46437f extends AbstractC47070c<String> {

        /* renamed from: a */
        final /* synthetic */ Function1 f116929a;

        /* renamed from: b */
        final /* synthetic */ Function1 f116930b;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.list.repo.c$f$a */
        public static final class RunnableC46438a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C46437f f116931a;

            /* renamed from: b */
            final /* synthetic */ String f116932b;

            RunnableC46438a(C46437f fVar, String str) {
                this.f116931a = fVar;
                this.f116932b = str;
            }

            public final void run() {
                try {
                    C45855f.m181663b("MmListNetworkRepo", "getTrashListData Data: " + this.f116932b);
                    final MinutesListResponse minutesListResponse = (MinutesListResponse) new Gson().fromJson(this.f116932b, MinutesListResponse.class);
                    minutesListResponse.setFromNetwork(true);
                    C45859k.m181685a(new Runnable(this) {
                        /* class com.ss.android.lark.mm.module.list.repo.MmListDataNetworkRepo.C46437f.RunnableC46438a.RunnableC464391 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC46438a f116933a;

                        {
                            this.f116933a = r1;
                        }

                        public final void run() {
                            Function1 function1 = this.f116933a.f116931a.f116929a;
                            MinutesListResponse minutesListResponse = minutesListResponse;
                            Intrinsics.checkExpressionValueIsNotNull(minutesListResponse, "response");
                            function1.invoke(minutesListResponse);
                        }
                    });
                } catch (Exception e) {
                    C45855f.m181666e("MmListNetworkRepo", "[getTrashListData] JsonSyntaxException ex: " + e);
                }
            }
        }

        /* renamed from: a */
        public void mo161289a(String str) {
            C45857i.m181676a(new RunnableC46438a(this, str));
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "errorResult");
            C45855f.m181666e("MmListNetworkRepo", "[getMyList] [onError] error: " + aVar);
            this.f116930b.invoke(aVar);
        }

        C46437f(Function1 function1, Function1 function12) {
            this.f116929a = function1;
            this.f116930b = function12;
        }
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: b */
    public void mo163250b(MinutesListResponse minutesListResponse) {
        IMmListDataRepo.C46422a.m183694b(this, minutesListResponse);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/list/repo/MmListDataNetworkRepo$restore$1", "Lcom/ss/android/lark/mm/net/callback/IHttpRespCallback;", "Lcom/ss/android/lark/mm/net/parse/MmStringResp;", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.repo.c$j */
    public static final class C46443j extends AbstractC47071d<MmStringResp> {

        /* renamed from: a */
        final /* synthetic */ Function0 f116941a;

        /* renamed from: b */
        final /* synthetic */ Function0 f116942b;

        /* renamed from: a */
        public void mo161289a(MmStringResp mmStringResp) {
            this.f116941a.invoke();
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            Function0 function0 = this.f116942b;
            if (function0 != null) {
                Unit unit = (Unit) function0.invoke();
            }
        }

        C46443j(Function0 function0, Function0 function02) {
            this.f116941a = function0;
            this.f116942b = function02;
        }
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: a */
    public void mo163243a(MinutesListResponse minutesListResponse) {
        IMmListDataRepo.C46422a.m183688a(this, minutesListResponse);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/list/repo/MmListDataNetworkRepo$removeFromHomeSpace$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.repo.c$g */
    public static final class C46440g extends AbstractC47070c<String> {

        /* renamed from: a */
        final /* synthetic */ Function0 f116935a;

        /* renamed from: b */
        final /* synthetic */ Function1 f116936b;

        /* renamed from: a */
        public void mo161289a(String str) {
            this.f116935a.invoke();
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "errorResult");
            Function1 function1 = this.f116936b;
            if (function1 != null) {
                String string = C45851c.m181646a().getString(R.string.MMWeb_W_SomethingWentWrongRefresh_Toast);
                Intrinsics.checkExpressionValueIsNotNull(string, "MmContext.getContext().g…ngWentWrongRefresh_Toast)");
                Unit unit = (Unit) function1.invoke(string);
            }
        }

        C46440g(Function0 function0, Function1 function1) {
            this.f116935a = function0;
            this.f116936b = function1;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/list/repo/MmListDataNetworkRepo$removeFromSharedSpace$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.repo.c$h */
    public static final class C46441h extends AbstractC47070c<String> {

        /* renamed from: a */
        final /* synthetic */ Function0 f116937a;

        /* renamed from: b */
        final /* synthetic */ Function1 f116938b;

        /* renamed from: a */
        public void mo161289a(String str) {
            this.f116937a.invoke();
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "errorResult");
            Function1 function1 = this.f116938b;
            if (function1 != null) {
                String string = C45851c.m181646a().getString(R.string.MMWeb_W_SomethingWentWrongRefresh_Toast);
                Intrinsics.checkExpressionValueIsNotNull(string, "MmContext.getContext().g…ngWentWrongRefresh_Toast)");
                Unit unit = (Unit) function1.invoke(string);
            }
        }

        C46441h(Function0 function0, Function1 function1) {
            this.f116937a = function0;
            this.f116938b = function1;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/list/repo/MmListDataNetworkRepo$rename$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.repo.c$i */
    public static final class C46442i extends AbstractC47070c<String> {

        /* renamed from: a */
        final /* synthetic */ Function0 f116939a;

        /* renamed from: b */
        final /* synthetic */ Function1 f116940b;

        /* renamed from: a */
        public void mo161289a(String str) {
            this.f116939a.invoke();
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            String str;
            Function1 function1 = this.f116940b;
            if (function1 != null) {
                if (aVar == null || (str = aVar.mo165308c()) == null) {
                    str = "error";
                }
                Unit unit = (Unit) function1.invoke(str);
            }
        }

        C46442i(Function0 function0, Function1 function1) {
            this.f116939a = function0;
            this.f116940b = function1;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/list/repo/MmListDataNetworkRepo$deleteItem$1", "Lcom/ss/android/lark/mm/net/callback/IHttpRespCallback;", "Lcom/ss/android/lark/mm/net/parse/MmStringResp;", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", "resp", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.repo.c$b */
    public static final class C46428b extends AbstractC47071d<MmStringResp> {

        /* renamed from: a */
        final /* synthetic */ Function0 f116909a;

        /* renamed from: b */
        final /* synthetic */ boolean f116910b;

        /* renamed from: c */
        final /* synthetic */ String f116911c;

        /* renamed from: d */
        final /* synthetic */ Function1 f116912d;

        /* renamed from: a */
        public void mo161289a(MmStringResp mmStringResp) {
            this.f116909a.invoke();
            if (this.f116910b) {
                MmAudioFileHelper.m185633a(MmAudioFileHelper.f117976a, this.f116911c, true, null, 4, null);
            }
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            C45855f.m181666e("MmListNetworkRepo", "delete error: " + aVar);
            this.f116912d.invoke(ResString.f118656a.mo165504a(R.string.MMWeb_W_SomethingWentWrongRefresh_Toast));
        }

        C46428b(Function0 function0, boolean z, String str, Function1 function1) {
            this.f116909a = function0;
            this.f116910b = z;
            this.f116911c = str;
            this.f116912d = function1;
        }
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: b */
    public void mo163251b(String str, Function0<Unit> function0, Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(str, "objectTokens");
        Intrinsics.checkParameterIsNotNull(function0, "onSucceed");
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45875c domainDepend = a.getDomainDepend();
        Intrinsics.checkExpressionValueIsNotNull(domainDepend, "MmDepend.impl().domainDepend");
        C47057a.m186249a(domainDepend.mo144616a(), str, 3, new C46441h(function0, function1));
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: a */
    public void mo163247a(String str, Function0<Unit> function0, Function0<Unit> function02) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(function0, "onSucceed");
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45875c domainDepend = a.getDomainDepend();
        Intrinsics.checkExpressionValueIsNotNull(domainDepend, "MmDepend.impl().domainDepend");
        C47057a.m186283d(domainDepend.mo144616a(), str, new C46443j(function0, function02));
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: a */
    public void mo163248a(String str, Function0<Unit> function0, Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(str, "objectTokens");
        Intrinsics.checkParameterIsNotNull(function0, "onSucceed");
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45875c domainDepend = a.getDomainDepend();
        Intrinsics.checkExpressionValueIsNotNull(domainDepend, "MmDepend.impl().domainDepend");
        C47057a.m186249a(domainDepend.mo144616a(), str, 1, new C46440g(function0, function1));
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: a */
    public void mo163246a(String str, MmOwnerType mmOwnerType, Function1<? super MinutesListResponse, Unit> function1, Function1<? super C47068a, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(str, "timestamp");
        Intrinsics.checkParameterIsNotNull(mmOwnerType, "ownerType");
        Intrinsics.checkParameterIsNotNull(function1, "onSucceed");
        Intrinsics.checkParameterIsNotNull(function12, "onFailed");
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45875c domainDepend = a.getDomainDepend();
        Intrinsics.checkExpressionValueIsNotNull(domainDepend, "MmDepend.impl().domainDepend");
        C47057a.m186269b(domainDepend.mo144616a(), str, 20, mmOwnerType.getValue(), new C46429c(function1, function12));
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: a */
    public void mo163241a(MmListControl.DataSource dataSource, String str, String str2, Function0<Unit> function0, Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(dataSource, "ds");
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "newName");
        Intrinsics.checkParameterIsNotNull(function0, "onSucceed");
        C47057a.m186291h(str, str2, new C46442i(function0, function1));
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: a */
    public void mo163242a(MmListControl.DataSource dataSource, String str, boolean z, Function0<Unit> function0, Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(dataSource, "ds");
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(function0, "onSucceed");
        Intrinsics.checkParameterIsNotNull(function1, "onFailed");
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45875c domainDepend = a.getDomainDepend();
        Intrinsics.checkExpressionValueIsNotNull(domainDepend, "MmDepend.impl().domainDepend");
        C47057a.m186265a(domainDepend.mo144616a(), str, z, new C46428b(function0, z, str, function1));
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: a */
    public void mo163244a(String str, int i, boolean z, Function1<? super MinutesListResponse, Unit> function1, Function1<? super C47068a, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(str, "timestamp");
        Intrinsics.checkParameterIsNotNull(function1, "onSucceed");
        Intrinsics.checkParameterIsNotNull(function12, "onFailed");
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45875c domainDepend = a.getDomainDepend();
        Intrinsics.checkExpressionValueIsNotNull(domainDepend, "MmDepend.impl().domainDepend");
        C47057a.m186270b(domainDepend.mo144616a(), str, 20, i, z, new C46435e(function1, function12));
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: a */
    public void mo163245a(String str, int i, boolean z, Function2<? super MinutesListResponse, ? super Boolean, Unit> kVar, Function1<? super C47068a, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(str, "timestamp");
        Intrinsics.checkParameterIsNotNull(kVar, "onSucceed");
        Intrinsics.checkParameterIsNotNull(function1, "onFailed");
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45875c domainDepend = a.getDomainDepend();
        Intrinsics.checkExpressionValueIsNotNull(domainDepend, "MmDepend.impl().domainDepend");
        C47057a.m186248a(domainDepend.mo144616a(), str, 20, i, z, new C46432d(kVar, function1));
    }
}
