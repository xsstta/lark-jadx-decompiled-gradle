package com.ss.android.vc.meeting.module.tab3.list.mvp.repo;

import com.bytedance.lark.pb.basic.v1.Command;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.GrootCell;
import com.ss.android.vc.entity.tab.PushVcSyncUpcomingInstances;
import com.ss.android.vc.entity.tab.VCTabListHistoryListEntity;
import com.ss.android.vc.entity.tab.VCTabListItem;
import com.ss.android.vc.meeting.module.tab3.list.mvp.repo.C63389b;
import com.ss.android.vc.meeting.module.tab3.list.mvp.repo.utils.MeetingListUtil;
import com.ss.android.vc.net.push.PushListener;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.service.VcBizService;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.Consumer;
import io.reactivex.p3457e.C68296b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0002\u000b\u0015\u0018\u0000 -2\u00020\u0001:\u0003-./B\u0007\b\u0016¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u001aH\u0002J\u0006\u0010\u001c\u001a\u00020\u001aJ\u0012\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u001f\u001a\u00020\u001a2\b\b\u0002\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020\u001aJ\u0006\u0010#\u001a\u00020\u001aJ9\u0010$\u001a\u00020%\"\u0004\b\u0000\u0010&2\u0006\u0010'\u001a\u00020\b2#\u0010(\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u0001H&¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u001a0)R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R0\u0010\u0005\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\b\u0012\u0002\b\u0003 \t*\u000e\u0012\u0004\u0012\u00020\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0004\n\u0002\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/ss/android/vc/meeting/module/tab3/list/mvp/repo/ListRepo;", "", "()V", "TAG", "", "dataSubject", "Lio/reactivex/subjects/PublishSubject;", "Lkotlin/Pair;", "Lcom/ss/android/vc/meeting/module/tab3/list/mvp/repo/ListRepo$DataSource;", "kotlin.jvm.PlatformType", "historyGrootListener", "com/ss/android/vc/meeting/module/tab3/list/mvp/repo/ListRepo$historyGrootListener$1", "Lcom/ss/android/vc/meeting/module/tab3/list/mvp/repo/ListRepo$historyGrootListener$1;", "model", "Lcom/ss/android/vc/meeting/module/tab3/list/mvp/repo/ListModel;", "getModel", "()Lcom/ss/android/vc/meeting/module/tab3/list/mvp/repo/ListModel;", "upcomingList", "", "Lcom/ss/android/vc/entity/tab/VCTabListItem;", "upcomingPushListener", "com/ss/android/vc/meeting/module/tab3/list/mvp/repo/ListRepo$upcomingPushListener$1", "Lcom/ss/android/vc/meeting/module/tab3/list/mvp/repo/ListRepo$upcomingPushListener$1;", "upcomingSN", "", "dispose", "", "getCalendarServerId", "loadMoreHistory", "loadOngoingAndHistory", "historyId", "loadUpcoming", "loadHistoryAfter", "", "reInit", "reload", "subscribeData", "Lio/reactivex/disposables/Disposable;", "T", ShareHitPoint.f121868c, "onData", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Companion", "DataSource", "UpcomingPushListener", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class ListRepo {

    /* renamed from: e */
    public static final long f160014e = 50;

    /* renamed from: f */
    public static final long f160015f = 2;

    /* renamed from: g */
    public static final ConcurrentHashMap<String, ListRepo> f160016g = new ConcurrentHashMap<>();

    /* renamed from: h */
    public static final Companion f160017h = new Companion(null);

    /* renamed from: a */
    public final String f160018a = "ListRepo";

    /* renamed from: b */
    public final C68296b<Pair<DataSource, ?>> f160019b;

    /* renamed from: c */
    public int f160020c;

    /* renamed from: d */
    public List<? extends VCTabListItem> f160021d;

    /* renamed from: i */
    private final ListModel f160022i;

    /* renamed from: j */
    private final C63377d f160023j;

    /* renamed from: k */
    private final C63382i f160024k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/vc/meeting/module/tab3/list/mvp/repo/ListRepo$DataSource;", "", "(Ljava/lang/String;I)V", "ListError", "MeetingList", "UpcomingList", "HistoryList", "HistoryListError", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum DataSource {
        ListError,
        MeetingList,
        UpcomingList,
        HistoryList,
        HistoryListError
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000bR\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/vc/meeting/module/tab3/list/mvp/repo/ListRepo$Companion;", "", "()V", "PAGE_SIZE", "", "getPAGE_SIZE", "()J", "UPCOMING_NUMBER", "getUPCOMING_NUMBER", "repos", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/ss/android/vc/meeting/module/tab3/list/mvp/repo/ListRepo;", "create", "delete", "", "id", "get", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.tab3.list.mvp.repo.ListRepo$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final long mo219338a() {
            return ListRepo.f160015f;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final ListModel mo219330a() {
        return this.f160022i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/vc/meeting/module/tab3/list/mvp/repo/ListRepo$UpcomingPushListener;", "Lcom/ss/android/vc/net/push/PushListener;", "Lcom/ss/android/vc/entity/tab/PushVcSyncUpcomingInstances;", "()V", "decode", "request", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.tab3.list.mvp.repo.ListRepo$b */
    public static final class UpcomingPushListener extends PushListener<PushVcSyncUpcomingInstances> {

        /* renamed from: a */
        public static final UpcomingPushListener f160025a = new UpcomingPushListener();

        private UpcomingPushListener() {
            super(Command.PUSH_VC_SYNC_UPCOMING_INSTANCES);
        }

        /* renamed from: a */
        public PushVcSyncUpcomingInstances mo219340b(byte[] bArr) {
            return new PushVcSyncUpcomingInstances();
        }
    }

    /* renamed from: d */
    public final void mo219336d() {
        mo219333a(true);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u0005\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0016¨\u0006\n"}, d2 = {"com/ss/android/vc/meeting/module/tab3/list/mvp/repo/ListRepo$historyGrootListener$1", "Lcom/ss/android/vc/meeting/module/tab3/list/mvp/repo/GrootRepo$IGrootChannelDelegate;", "onOpenError", "", "onOpenSuccess", "onPushHistoryListCells", "cells", "", "Lcom/ss/android/vc/entity/GrootCell;", "onPushUserCells", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.tab3.list.mvp.repo.ListRepo$d */
    public static final class C63377d implements C63389b.AbstractC63394a {

        /* renamed from: a */
        final /* synthetic */ ListRepo f160027a;

        @Override // com.ss.android.vc.meeting.module.tab3.list.mvp.repo.C63389b.AbstractC63394a
        /* renamed from: a */
        public void mo219342a() {
        }

        @Override // com.ss.android.vc.meeting.module.tab3.list.mvp.repo.C63389b.AbstractC63394a
        /* renamed from: b */
        public void mo219344b() {
            this.f160027a.f160019b.onNext(TuplesKt.to(DataSource.ListError, null));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63377d(ListRepo listRepo) {
            this.f160027a = listRepo;
        }

        @Override // com.ss.android.vc.meeting.module.tab3.list.mvp.repo.C63389b.AbstractC63394a
        /* renamed from: a */
        public void mo219343a(List<GrootCell> list) {
            C60700b.m235851b(this.f160027a.f160018a, "[onPushHistoryListCells]", "start");
            this.f160027a.mo219330a().mo219373a(list);
            this.f160027a.f160019b.onNext(TuplesKt.to(DataSource.MeetingList, this.f160027a.mo219330a().mo219381e()));
        }
    }

    /* renamed from: f */
    private final void m248337f() {
        VcBizService.getBriefPrimaryCalendar(true, new C63376c(this));
    }

    /* renamed from: e */
    public final void mo219337e() {
        mo219332a(this.f160022i.mo219379c());
    }

    /* renamed from: c */
    public final void mo219335c() {
        C60700b.m235851b(this.f160018a, "[dispose]", "dispose");
        this.f160019b.onComplete();
        UpcomingPushListener.f160025a.mo219802b(this.f160024k);
        C63389b.m248367b().mo219366c();
    }

    public ListRepo() {
        C68296b<Pair<DataSource, ?>> a = C68296b.m265052a();
        Intrinsics.checkExpressionValueIsNotNull(a, "PublishSubject.create<Pair<DataSource, *>>()");
        this.f160019b = a;
        this.f160022i = new ListModel();
        this.f160023j = new C63377d(this);
        this.f160024k = new C63382i(this);
        mo219334b();
    }

    /* renamed from: b */
    public final void mo219334b() {
        C60700b.m235851b(this.f160018a, "[reInit]", "reset listeners");
        C63389b.m248367b().mo219361a(this.f160023j);
        UpcomingPushListener.f160025a.mo219802b(this.f160024k);
        UpcomingPushListener.f160025a.mo219800a(this.f160024k);
        m248337f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/tab3/list/mvp/repo/ListRepo$getCalendarServerId$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "", "onError", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", "serverId", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.tab3.list.mvp.repo.ListRepo$c */
    public static final class C63376c implements AbstractC63598b<String> {

        /* renamed from: a */
        final /* synthetic */ ListRepo f160026a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63376c(ListRepo listRepo) {
            this.f160026a = listRepo;
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            Intrinsics.checkParameterIsNotNull(str, "serverId");
            this.f160026a.mo219330a().mo219372a(str);
        }

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "error");
            String str = this.f160026a.f160018a;
            C60700b.m235864f(str, "[getCalendarServerId]", "onError: " + eVar.mo219902b());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/tab3/list/mvp/repo/ListRepo$upcomingPushListener$1", "Lcom/ss/android/vc/net/push/PushListener$DataHandler;", "Lcom/ss/android/vc/entity/tab/PushVcSyncUpcomingInstances;", "onData", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.tab3.list.mvp.repo.ListRepo$i */
    public static final class C63382i implements PushListener.DataHandler<PushVcSyncUpcomingInstances> {

        /* renamed from: a */
        final /* synthetic */ ListRepo f160035a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63382i(ListRepo listRepo) {
            this.f160035a = listRepo;
        }

        /* renamed from: a */
        public void mo219350a(PushVcSyncUpcomingInstances pushVcSyncUpcomingInstances) {
            Intrinsics.checkParameterIsNotNull(pushVcSyncUpcomingInstances, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            ListRepo.m248336a(this.f160035a, false, 1, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\"\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003 \u0006*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "T", "it", "Lkotlin/Pair;", "Lcom/ss/android/vc/meeting/module/tab3/list/mvp/repo/ListRepo$DataSource;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.tab3.list.mvp.repo.ListRepo$h */
    public static final class C63381h<T> implements Consumer<Pair<? extends DataSource, ?>> {

        /* renamed from: a */
        final /* synthetic */ Function1 f160034a;

        C63381h(Function1 function1) {
            this.f160034a = function1;
        }

        /* renamed from: a */
        public final void accept(Pair<? extends DataSource, ?> pair) {
            this.f160034a.invoke(pair.getSecond());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "it", "Lkotlin/Pair;", "Lcom/ss/android/vc/meeting/module/tab3/list/mvp/repo/ListRepo$DataSource;", "test"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.tab3.list.mvp.repo.ListRepo$g */
    public static final class C63380g<T> implements AbstractC68322n<Pair<? extends DataSource, ?>> {

        /* renamed from: a */
        final /* synthetic */ DataSource f160033a;

        C63380g(DataSource dataSource) {
            this.f160033a = dataSource;
        }

        /* renamed from: a */
        public final boolean test(Pair<? extends DataSource, ?> pair) {
            Intrinsics.checkParameterIsNotNull(pair, "it");
            if (((DataSource) pair.getFirst()) == this.f160033a) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public final synchronized void mo219333a(boolean z) {
        int i = this.f160020c + 1;
        this.f160020c = i;
        VcBizService.getVCTabListUpcoming(Long.valueOf(f160015f + 1), new C63379f(this, z, i));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/vc/meeting/module/tab3/list/mvp/repo/ListRepo$loadUpcoming$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "", "Lcom/ss/android/vc/entity/tab/VCTabListItem;", "onError", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", "list", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.tab3.list.mvp.repo.ListRepo$f */
    public static final class C63379f implements AbstractC63598b<List<? extends VCTabListItem>> {

        /* renamed from: a */
        final /* synthetic */ ListRepo f160030a;

        /* renamed from: b */
        final /* synthetic */ boolean f160031b;

        /* renamed from: c */
        final /* synthetic */ int f160032c;

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "error");
            String str = this.f160030a.f160018a;
            C60700b.m235864f(str, "[loadUpcoming]", "onError: " + eVar.mo219902b());
            if (this.f160031b) {
                this.f160030a.mo219332a((String) null);
            }
        }

        /* renamed from: a */
        public void onSuccess(List<? extends VCTabListItem> list) {
            int i;
            Intrinsics.checkParameterIsNotNull(list, "list");
            if (this.f160031b) {
                this.f160030a.f160021d = list;
                this.f160030a.mo219332a((String) null);
            } else if (this.f160032c >= this.f160030a.f160020c) {
                this.f160030a.f160021d = list;
                MeetingListUtil.f160042a.mo219356a(list);
                this.f160030a.mo219330a().mo219374a(list, (int) ListRepo.f160017h.mo219338a());
                C68296b<Pair<DataSource, ?>> bVar = this.f160030a.f160019b;
                DataSource dataSource = DataSource.UpcomingList;
                if (this.f160030a.mo219330a().mo219377a()) {
                    i = (int) ListRepo.f160017h.mo219338a();
                } else {
                    i = list.size();
                }
                bVar.onNext(TuplesKt.to(dataSource, list.subList(0, i)));
            }
        }

        C63379f(ListRepo listRepo, boolean z, int i) {
            this.f160030a = listRepo;
            this.f160031b = z;
            this.f160032c = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/tab3/list/mvp/repo/ListRepo$loadOngoingAndHistory$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/tab/VCTabListHistoryListEntity;", "onError", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", "entity", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.tab3.list.mvp.repo.ListRepo$e */
    public static final class C63378e implements AbstractC63598b<VCTabListHistoryListEntity> {

        /* renamed from: a */
        final /* synthetic */ ListRepo f160028a;

        /* renamed from: b */
        final /* synthetic */ boolean f160029b;

        /* renamed from: a */
        public void onSuccess(VCTabListHistoryListEntity vCTabListHistoryListEntity) {
            List<? extends VCTabListItem> list;
            Pair<DataSource, ?> pair;
            Intrinsics.checkParameterIsNotNull(vCTabListHistoryListEntity, "entity");
            this.f160028a.mo219330a().mo219375a(vCTabListHistoryListEntity.hasMore);
            ListModel a = this.f160028a.mo219330a();
            boolean z = this.f160029b;
            if (z) {
                list = this.f160028a.f160021d;
            } else {
                list = null;
            }
            a.mo219376a(z, vCTabListHistoryListEntity, list, (int) ListRepo.f160017h.mo219338a());
            this.f160028a.f160021d = null;
            C63389b.m248367b().mo219360a(vCTabListHistoryListEntity.downVersion);
            C68296b<Pair<DataSource, ?>> bVar = this.f160028a.f160019b;
            if (this.f160029b) {
                pair = TuplesKt.to(DataSource.MeetingList, this.f160028a.mo219330a().mo219381e());
            } else {
                pair = TuplesKt.to(DataSource.HistoryList, vCTabListHistoryListEntity.getTabListItems());
            }
            bVar.onNext(pair);
        }

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(eVar, "error");
            String str = this.f160028a.f160018a;
            C60700b.m235864f(str, "[loadOngoingAndHistory]", "onError: " + eVar.mo219902b());
            if (this.f160029b) {
                List<? extends VCTabListItem> list = this.f160028a.f160021d;
                if (list == null || list.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    this.f160028a.mo219330a().mo219375a(false);
                    VCTabListHistoryListEntity vCTabListHistoryListEntity = new VCTabListHistoryListEntity();
                    vCTabListHistoryListEntity.setTabListItems(new ArrayList());
                    vCTabListHistoryListEntity.hasMore = false;
                    vCTabListHistoryListEntity.downVersion = 0;
                    this.f160028a.mo219330a().mo219376a(this.f160029b, vCTabListHistoryListEntity, this.f160028a.f160021d, (int) ListRepo.f160017h.mo219338a());
                    this.f160028a.f160021d = null;
                    this.f160028a.f160019b.onNext(TuplesKt.to(DataSource.MeetingList, this.f160028a.mo219330a().mo219381e()));
                    return;
                }
            }
            if (this.f160029b) {
                this.f160028a.f160019b.onNext(TuplesKt.to(DataSource.ListError, null));
            } else {
                this.f160028a.f160019b.onNext(TuplesKt.to(DataSource.HistoryListError, null));
            }
        }

        C63378e(ListRepo listRepo, boolean z) {
            this.f160028a = listRepo;
            this.f160029b = z;
        }
    }

    /* renamed from: a */
    public final void mo219332a(String str) {
        boolean z;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        VcBizService.getVCTabListHistory(str, Long.valueOf(f160014e), true, new C63378e(this, z), false);
    }

    /* renamed from: a */
    public final <T> Disposable mo219331a(DataSource dataSource, Function1<? super T, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(dataSource, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(function1, "onData");
        Disposable subscribe = this.f160019b.filter(new C63380g(dataSource)).subscribeOn(LarkRxSchedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new C63381h(function1));
        Intrinsics.checkExpressionValueIsNotNull(subscribe, "dataSubject\n            …cond as T?)\n            }");
        return subscribe;
    }

    /* renamed from: a */
    public static /* synthetic */ void m248336a(ListRepo listRepo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        listRepo.mo219333a(z);
    }
}
