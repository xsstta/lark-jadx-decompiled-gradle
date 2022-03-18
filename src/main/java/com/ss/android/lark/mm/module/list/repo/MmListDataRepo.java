package com.ss.android.lark.mm.module.list.repo;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.android.lark.mm.module.list.data.MinutesListResponse;
import com.ss.android.lark.mm.module.list.data.MinutesSummaryData;
import com.ss.android.lark.mm.module.list.data.MmListRankType;
import com.ss.android.lark.mm.module.list.data.MmOwnerType;
import com.ss.android.lark.mm.module.list.repo.IMmListDataRepo;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u00016B\u0005¢\u0006\u0002\u0010\u0002J5\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0002\u0010\u0013JB\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u001aH\u0016J@\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\f0\u001a2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\f0\u001aH\u0016JN\u0010!\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00042\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0%2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\f0\u001aH\u0016JH\u0010&\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00042\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\f0\u001a2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\f0\u001aH\u0016J8\u0010'\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00102\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\f0\u001a2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\f0\u001aH\u0016J4\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00182\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u001aH\u0016J4\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00182\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u001aH\u0016JS\u0010+\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00182#\u0010\u0019\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\f\u0018\u00010\u001aH\u0016J.\u00100\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00182\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0018H\u0016J\u0012\u00101\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u00010\u001fH\u0016J\u0012\u00103\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u00104\u001a\u00020\f2\u0006\u00105\u001a\u00020\u001fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/ss/android/lark/mm/module/list/repo/MmListDataRepo;", "Lcom/ss/android/lark/mm/module/list/repo/IMmListDataRepo;", "()V", "isHomeListInitNetwork", "", "isMyListInitNetwork", "localRepo", "networkRepo", "tempChangedItems", "", "Lcom/ss/android/lark/mm/module/list/repo/MmListDataRepo$TempSummaryData;", "addTempChangedItems", "", "ds", "Lcom/ss/android/lark/mm/module/list/control/MmListControl$DataSource;", "objectToken", "", ChatTypeStateKeeper.f135670e, "isDeleted", "(Lcom/ss/android/lark/mm/module/list/control/MmListControl$DataSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "deleteItem", "token", "isPermanentlyDelete", "onSucceed", "Lkotlin/Function0;", "onFailed", "Lkotlin/Function1;", "getHomeListData", "timestamp", "ownerType", "Lcom/ss/android/lark/mm/module/list/data/MmOwnerType;", "Lcom/ss/android/lark/mm/module/list/data/MinutesListResponse;", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "getMyListData", "rank", "", "isAsc", "Lkotlin/Function2;", "getSharedListData", "getTrashListData", "removeFromHomeSpace", "objectTokens", "removeFromSharedSpace", "rename", "newName", "Lkotlin/ParameterName;", "name", "errorMsg", "restore", "updateHomeListFirstPageData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "updateMyListFirstPageData", "updateTempChanges", "res", "TempSummaryData", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.list.repo.d */
public final class MmListDataRepo implements IMmListDataRepo {

    /* renamed from: a */
    public final IMmListDataRepo f116943a = new MmListDataLocalRepo();

    /* renamed from: b */
    public boolean f116944b;

    /* renamed from: c */
    public boolean f116945c;

    /* renamed from: d */
    private final IMmListDataRepo f116946d = new MmListDataNetworkRepo();

    /* renamed from: e */
    private final List<TempSummaryData> f116947e = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\bJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/mm/module/list/repo/MmListDataRepo$TempSummaryData;", "", "token", "", ChatTypeStateKeeper.f135670e, "isDeleted", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getToken", "()Ljava/lang/String;", "getTopic", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/ss/android/lark/mm/module/list/repo/MmListDataRepo$TempSummaryData;", "equals", "other", "hashCode", "", "toString", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.repo.d$a */
    public static final class TempSummaryData {

        /* renamed from: a */
        private final String f116948a;

        /* renamed from: b */
        private final String f116949b;

        /* renamed from: c */
        private final Boolean f116950c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TempSummaryData)) {
                return false;
            }
            TempSummaryData aVar = (TempSummaryData) obj;
            return Intrinsics.areEqual(this.f116948a, aVar.f116948a) && Intrinsics.areEqual(this.f116949b, aVar.f116949b) && Intrinsics.areEqual(this.f116950c, aVar.f116950c);
        }

        public int hashCode() {
            String str = this.f116948a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f116949b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            Boolean bool = this.f116950c;
            if (bool != null) {
                i = bool.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "TempSummaryData(token=" + this.f116948a + ", topic=" + this.f116949b + ", isDeleted=" + this.f116950c + ")";
        }

        /* renamed from: a */
        public final String mo163278a() {
            return this.f116948a;
        }

        /* renamed from: b */
        public final String mo163279b() {
            return this.f116949b;
        }

        /* renamed from: c */
        public final Boolean mo163280c() {
            return this.f116950c;
        }

        public TempSummaryData(String str, String str2, Boolean bool) {
            Intrinsics.checkParameterIsNotNull(str, "token");
            this.f116948a = str;
            this.f116949b = str2;
            this.f116950c = bool;
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
        this.f116946d.mo163249a(str, function1, function12);
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: a */
    public void mo163248a(String str, Function0<Unit> function0, Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(str, "objectTokens");
        Intrinsics.checkParameterIsNotNull(function0, "onSucceed");
        this.f116946d.mo163248a(str, new C46448f(this, str, function0), function1);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.repo.d$b */
    static final class C46444b extends Lambda implements Function0<Unit> {
        final /* synthetic */ MmListControl.DataSource $ds;
        final /* synthetic */ Function0 $onSucceed;
        final /* synthetic */ String $token;
        final /* synthetic */ MmListDataRepo this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46444b(MmListDataRepo dVar, MmListControl.DataSource dataSource, String str, Function0 function0) {
            super(0);
            this.this$0 = dVar;
            this.$ds = dataSource;
            this.$token = str;
            this.$onSucceed = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            MmListDataRepo.m183754a(this.this$0, this.$ds, this.$token, null, true, 4, null);
            this.$onSucceed.invoke();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.repo.d$f */
    static final class C46448f extends Lambda implements Function0<Unit> {
        final /* synthetic */ String $objectTokens;
        final /* synthetic */ Function0 $onSucceed;
        final /* synthetic */ MmListDataRepo this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46448f(MmListDataRepo dVar, String str, Function0 function0) {
            super(0);
            this.this$0 = dVar;
            this.$objectTokens = str;
            this.$onSucceed = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            MmListDataRepo.m183754a(this.this$0, MmListControl.DataSource.HomeList, this.$objectTokens, null, true, 4, null);
            this.$onSucceed.invoke();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.repo.d$g */
    static final class C46449g extends Lambda implements Function0<Unit> {
        final /* synthetic */ MmListControl.DataSource $ds;
        final /* synthetic */ String $newName;
        final /* synthetic */ Function0 $onSucceed;
        final /* synthetic */ String $token;
        final /* synthetic */ MmListDataRepo this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46449g(MmListDataRepo dVar, MmListControl.DataSource dataSource, String str, String str2, Function0 function0) {
            super(0);
            this.this$0 = dVar;
            this.$ds = dataSource;
            this.$token = str;
            this.$newName = str2;
            this.$onSucceed = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            MmListDataRepo.m183754a(this.this$0, this.$ds, this.$token, this.$newName, null, 8, null);
            this.$onSucceed.invoke();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/list/data/MinutesListResponse;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.repo.d$c */
    static final class C46445c extends Lambda implements Function1<MinutesListResponse, Unit> {
        final /* synthetic */ boolean $isValidCacheDataCondition;
        final /* synthetic */ Function1 $onSucceed;
        final /* synthetic */ MmListDataRepo this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46445c(MmListDataRepo dVar, boolean z, Function1 function1) {
            super(1);
            this.this$0 = dVar;
            this.$isValidCacheDataCondition = z;
            this.$onSucceed = function1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MinutesListResponse minutesListResponse) {
            invoke(minutesListResponse);
            return Unit.INSTANCE;
        }

        public final void invoke(MinutesListResponse minutesListResponse) {
            Intrinsics.checkParameterIsNotNull(minutesListResponse, "it");
            this.this$0.mo163277c(minutesListResponse);
            if (this.$isValidCacheDataCondition) {
                this.this$0.f116943a.mo163243a(minutesListResponse);
            }
            this.this$0.f116945c = true;
            this.$onSucceed.invoke(minutesListResponse);
        }
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: a */
    public void mo163243a(MinutesListResponse minutesListResponse) {
        this.f116943a.mo163243a(minutesListResponse);
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: b */
    public void mo163250b(MinutesListResponse minutesListResponse) {
        this.f116943a.mo163250b(minutesListResponse);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/list/data/MinutesSummaryData;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.repo.d$h */
    public static final class C46450h extends Lambda implements Function1<MinutesSummaryData, Boolean> {
        final /* synthetic */ List $toRemovedItems;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46450h(List list) {
            super(1);
            this.$toRemovedItems = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(MinutesSummaryData minutesSummaryData) {
            return Boolean.valueOf(invoke(minutesSummaryData));
        }

        public final boolean invoke(MinutesSummaryData minutesSummaryData) {
            Object obj;
            Intrinsics.checkParameterIsNotNull(minutesSummaryData, "it");
            Iterator it = this.$toRemovedItems.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((TempSummaryData) obj).mo163278a(), minutesSummaryData.getObjectToken())) {
                    break;
                }
            }
            if (obj != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: c */
    public final void mo163277c(MinutesListResponse minutesListResponse) {
        List<MinutesSummaryData> list;
        T t;
        List<MinutesSummaryData> list2;
        StringBuilder sb = new StringBuilder();
        sb.append("updateTempChanges, before list: ");
        List<MinutesSummaryData> list3 = minutesListResponse.getList();
        Integer num = null;
        sb.append(list3 != null ? Integer.valueOf(list3.size()) : null);
        C45855f.m181663b("MmListDataRepo", sb.toString());
        if (!this.f116947e.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (T t2 : this.f116947e) {
                if (Intrinsics.areEqual((Object) t2.mo163280c(), (Object) true)) {
                    arrayList.add(t2);
                }
            }
            ArrayList arrayList2 = arrayList;
            if ((!arrayList2.isEmpty()) && (list2 = minutesListResponse.getList()) != null) {
                CollectionsKt.removeAll((List) list2, (Function1) new C46450h(arrayList2));
            }
            for (T t3 : this.f116947e) {
                if (!(t3.mo163279b() == null || (list = minutesListResponse.getList()) == null)) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (Intrinsics.areEqual(t.getObjectToken(), t3.mo163278a())) {
                            break;
                        }
                    }
                    T t4 = t;
                    if (t4 != null) {
                        t4.setTopic(t3.mo163279b());
                    }
                }
            }
        }
        this.f116947e.clear();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updateTempChanges, after list: ");
        List<MinutesSummaryData> list4 = minutesListResponse.getList();
        if (list4 != null) {
            num = Integer.valueOf(list4.size());
        }
        sb2.append(num);
        C45855f.m181663b("MmListDataRepo", sb2.toString());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "listData", "Lcom/ss/android/lark/mm/module/list/data/MinutesListResponse;", "<anonymous parameter 1>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.repo.d$d */
    static final class C46446d extends Lambda implements Function2<MinutesListResponse, Boolean, Unit> {
        final /* synthetic */ Function2 $onSucceed;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46446d(Function2 kVar) {
            super(2);
            this.$onSucceed = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(MinutesListResponse minutesListResponse, Boolean bool) {
            invoke(minutesListResponse, bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(MinutesListResponse minutesListResponse, boolean z) {
            Intrinsics.checkParameterIsNotNull(minutesListResponse, "listData");
            this.$onSucceed.invoke(minutesListResponse, false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "res", "Lcom/ss/android/lark/mm/module/list/data/MinutesListResponse;", "<anonymous parameter 1>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.repo.d$e */
    static final class C46447e extends Lambda implements Function2<MinutesListResponse, Boolean, Unit> {
        final /* synthetic */ boolean $isValidCacheDataCondition;
        final /* synthetic */ Function2 $onSucceed;
        final /* synthetic */ MmListDataRepo this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46447e(MmListDataRepo dVar, boolean z, Function2 kVar) {
            super(2);
            this.this$0 = dVar;
            this.$isValidCacheDataCondition = z;
            this.$onSucceed = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(MinutesListResponse minutesListResponse, Boolean bool) {
            invoke(minutesListResponse, bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(MinutesListResponse minutesListResponse, boolean z) {
            Intrinsics.checkParameterIsNotNull(minutesListResponse, "res");
            this.this$0.f116944b = true;
            this.this$0.mo163277c(minutesListResponse);
            if (this.$isValidCacheDataCondition) {
                this.this$0.f116943a.mo163250b(minutesListResponse);
            }
            this.$onSucceed.invoke(minutesListResponse, true);
        }
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: a */
    public void mo163247a(String str, Function0<Unit> function0, Function0<Unit> function02) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(function0, "onSucceed");
        this.f116946d.mo163247a(str, function0, function02);
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: b */
    public void mo163251b(String str, Function0<Unit> function0, Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(str, "objectTokens");
        Intrinsics.checkParameterIsNotNull(function0, "onSucceed");
        this.f116946d.mo163251b(str, function0, function1);
    }

    /* renamed from: a */
    private final void m183753a(MmListControl.DataSource dataSource, String str, String str2, Boolean bool) {
        boolean z;
        boolean z2 = true;
        if (dataSource != MmListControl.DataSource.MyList || this.f116944b) {
            z = false;
        } else {
            z = true;
        }
        if (dataSource != MmListControl.DataSource.HomeList || this.f116945c) {
            z2 = false;
        }
        if (z || z2) {
            this.f116947e.add(new TempSummaryData(str, str2, bool));
        }
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: a */
    public void mo163246a(String str, MmOwnerType mmOwnerType, Function1<? super MinutesListResponse, Unit> function1, Function1<? super C47068a, Unit> function12) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "timestamp");
        Intrinsics.checkParameterIsNotNull(mmOwnerType, "ownerType");
        Intrinsics.checkParameterIsNotNull(function1, "onSucceed");
        Intrinsics.checkParameterIsNotNull(function12, "onFailed");
        if (!Intrinsics.areEqual(str, "0") || mmOwnerType != MmOwnerType.OWNED_BY_ANYONE) {
            z = false;
        } else {
            z = true;
        }
        if (z && !this.f116945c) {
            C45855f.m181663b("MmListDataRepo", "getHomeListData from local");
            this.f116943a.mo163246a(str, mmOwnerType, function1, function12);
        }
        this.f116946d.mo163246a(str, mmOwnerType, new C46445c(this, z, function1), function12);
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: a */
    public void mo163241a(MmListControl.DataSource dataSource, String str, String str2, Function0<Unit> function0, Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(dataSource, "ds");
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "newName");
        Intrinsics.checkParameterIsNotNull(function0, "onSucceed");
        this.f116946d.mo163241a(dataSource, str, str2, new C46449g(this, dataSource, str, str2, function0), function1);
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: a */
    public void mo163242a(MmListControl.DataSource dataSource, String str, boolean z, Function0<Unit> function0, Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(dataSource, "ds");
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(function0, "onSucceed");
        Intrinsics.checkParameterIsNotNull(function1, "onFailed");
        this.f116946d.mo163242a(dataSource, str, z, new C46444b(this, dataSource, str, function0), function1);
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: a */
    public void mo163244a(String str, int i, boolean z, Function1<? super MinutesListResponse, Unit> function1, Function1<? super C47068a, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(str, "timestamp");
        Intrinsics.checkParameterIsNotNull(function1, "onSucceed");
        Intrinsics.checkParameterIsNotNull(function12, "onFailed");
        this.f116946d.mo163244a(str, i, z, function1, function12);
    }

    @Override // com.ss.android.lark.mm.module.list.repo.IMmListDataRepo
    /* renamed from: a */
    public void mo163245a(String str, int i, boolean z, Function2<? super MinutesListResponse, ? super Boolean, Unit> kVar, Function1<? super C47068a, Unit> function1) {
        boolean z2;
        Intrinsics.checkParameterIsNotNull(str, "timestamp");
        Intrinsics.checkParameterIsNotNull(kVar, "onSucceed");
        Intrinsics.checkParameterIsNotNull(function1, "onFailed");
        if (i != MmListRankType.CREATE_TIME.getValue() || z || !Intrinsics.areEqual(str, "0")) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 && !this.f116944b) {
            C45855f.m181663b("MmListDataRepo", "getMyListData from local");
            this.f116943a.mo163245a(str, i, z, new C46446d(kVar), function1);
        }
        this.f116946d.mo163245a(str, i, z, new C46447e(this, z2, kVar), function1);
    }

    /* renamed from: a */
    static /* synthetic */ void m183754a(MmListDataRepo dVar, MmListControl.DataSource dataSource, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        dVar.m183753a(dataSource, str, str2, bool);
    }
}
