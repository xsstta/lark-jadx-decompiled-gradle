package com.ss.android.lark.feed.app.team.feed;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.feed.app.model.common.C37730c;
import com.ss.android.lark.feed.app.team.entity.C37872c;
import com.ss.android.lark.feed.app.team.entity.C37874d;
import com.ss.android.lark.feed.app.team.entity.C37875e;
import com.ss.android.lark.feed.app.team.entity.C37876f;
import com.ss.android.lark.feed.app.team.entity.C37878g;
import com.ss.android.lark.feed.interfaces.AbstractC38096g;
import com.ss.android.lark.feed.interfaces.AbstractC38106o;
import com.ss.android.lark.feed.interfaces.IPushFeedEntityPreviewListener;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.feed.p1871b.AbstractC38067b;
import com.ss.android.lark.feed.service.impl.C38128e;
import com.ss.android.lark.feed.service.impl.C38166k;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.team.entity.C55442a;
import com.ss.android.lark.team.entity.Item;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.p2732b.AbstractC55358a;
import com.ss.android.lark.team.p2732b.AbstractC55359b;
import com.ss.android.lark.team.p2732b.AbstractC55360c;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C69121n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.C69364ai;
import kotlinx.coroutines.C69388e;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.cr;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\n*\u0001\u001c\u0018\u0000 C2\u00020\u0001:\u0002CDB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010'\u001a\u00020\u00102\b\u0010(\u001a\u0004\u0018\u00010\u0013H\u0002J\u0018\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020-H\u0002J\u0006\u0010.\u001a\u00020*J\u0011\u0010/\u001a\u00020*H@ø\u0001\u0000¢\u0006\u0002\u00100J\u0010\u00101\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u000fH\u0002J\u0010\u00102\u001a\u00020*2\u0006\u00103\u001a\u000204H\u0002J\u0010\u00105\u001a\u00020*2\u0006\u00106\u001a\u000207H\u0002J\u0010\u00108\u001a\u00020*2\u0006\u00106\u001a\u000207H\u0002J\u001c\u00109\u001a\u00020*2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020-0;H\u0002J\u0018\u0010<\u001a\u00020*2\u0006\u00106\u001a\u0002072\u0006\u0010=\u001a\u000204H\u0002J\u0006\u0010>\u001a\u00020*J\u0006\u0010?\u001a\u00020*J\u0006\u0010@\u001a\u00020*J\u0016\u0010A\u001a\u00020*2\u0006\u0010+\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n \u0018*\u0004\u0018\u00010\u00170\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0004\n\u0002\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010$\u001a\n \u0018*\u0004\u0018\u00010%0%X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0012X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006E"}, d2 = {"Lcom/ss/android/lark/feed/app/team/feed/TeamFeedModel;", "", "dependency", "Lcom/ss/android/lark/feed/app/team/feed/TeamFeedModel$Dependency;", "(Lcom/ss/android/lark/feed/app/team/feed/TeamFeedModel$Dependency;)V", "connStateListener", "Lcom/ss/android/lark/feed/interfaces/IConnStateListener;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "coroutineScope$delegate", "Lkotlin/Lazy;", "itemIdToExpandStatusMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "itemIdToTeamEntityMap", "", "Lcom/ss/android/lark/feed/app/team/entity/TeamItemEntity;", "mRetryStrategy", "Lcom/ss/android/lark/feed/app/model/common/RetryStrategy;", "pushDependency", "Lcom/ss/android/lark/feed/dependency/IPushDependency;", "kotlin.jvm.PlatformType", "pushFeedCardPreviewListener", "Lcom/ss/android/lark/feed/interfaces/IPushFeedCardPreviewListener;", "pushFeedEntityPreviewListener", "com/ss/android/lark/feed/app/team/feed/TeamFeedModel$pushFeedEntityPreviewListener$1", "Lcom/ss/android/lark/feed/app/team/feed/TeamFeedModel$pushFeedEntityPreviewListener$1;", "pushItemsChangeListener", "Lcom/ss/android/lark/team/listener/IPushItemsChangeListener;", "pushTeamItemExpiredListener", "Lcom/ss/android/lark/team/listener/IPushTeamItemExpiredListener;", "pushTeamsChangeListener", "Lcom/ss/android/lark/team/listener/IPushTeamsChangeListener;", "teamDependency", "Lcom/ss/android/lark/feed/dependency/IFeedModuleDependency$ITeamModuleDependency;", "teamIdToItemIdMap", "checkTeamEntityValid", "value", "fetchSingleTeamChatList", "", "teamItemId", "team", "Lcom/ss/android/lark/team/entity/Team;", "fetchTeamList", "getExpandStatusFromLocal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTeamExpand", "handleChatItemUpdate", "chatItem", "Lcom/ss/android/lark/team/entity/Item;", "handleItemDelete", "pushChangeItem", "Lcom/ss/android/lark/team/entity/PushChangeItem;", "handleItemUpdate", "handleTeamChange", "teamIdToTeamMap", "", "handleTeamItemUpdate", "teamItem", "onCreate", "onDestroy", "saveTeamExpandStatus", "updateExpandStatus", "isExpanded", "Companion", "Dependency", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.team.a.e */
public final class TeamFeedModel {

    /* renamed from: f */
    public static final Companion f97082f = new Companion(null);

    /* renamed from: a */
    public final Map<Long, Long> f97083a = new LinkedHashMap();

    /* renamed from: b */
    public final Map<Long, C37875e> f97084b = new LinkedHashMap();

    /* renamed from: c */
    public final ConcurrentHashMap<Long, Boolean> f97085c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public final C37730c f97086d;

    /* renamed from: e */
    public final Dependency f97087e;

    /* renamed from: g */
    private final Lazy f97088g = LazyKt.lazy(C37842d.INSTANCE);

    /* renamed from: h */
    private final AbstractC38037a.AbstractC38063w f97089h;

    /* renamed from: i */
    private final AbstractC38067b f97090i;

    /* renamed from: j */
    private final AbstractC55359b f97091j;

    /* renamed from: k */
    private AbstractC55360c f97092k;

    /* renamed from: l */
    private final AbstractC55358a f97093l;

    /* renamed from: m */
    private final AbstractC38106o f97094m;

    /* renamed from: n */
    private final C37854k f97095n;

    /* renamed from: o */
    private final AbstractC38096g f97096o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H&J\u001e\u0010\u0015\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0017H&J\u0016\u0010\u0018\u001a\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H&J\u001e\u0010\u0018\u001a\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00172\u0006\u0010\u001a\u001a\u00020\u001bH&¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/feed/app/team/feed/TeamFeedModel$Dependency;", "", "onAddTeam", "", "team", "Lcom/ss/android/lark/feed/app/team/entity/TeamVO;", "position", "", "onChatChanged", "teamId", "", "chat", "Lcom/ss/android/lark/feed/app/team/entity/TeamChatVO;", "onRemoveChat", "chatId", "", "onRemoveTeam", "onTeamChanged", "onTeamPositionChanged", "fromPosition", "toPosition", "resetChatList", "chatList", "", "resetTeamList", "teamList", "clearChatList", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.a.e$b */
    public interface Dependency {
        /* renamed from: a */
        void mo138677a(long j);

        /* renamed from: a */
        void mo138678a(long j, C37874d dVar);

        /* renamed from: a */
        void mo138679a(long j, String str);

        /* renamed from: a */
        void mo138680a(long j, List<? extends C37874d> list);

        /* renamed from: a */
        void mo138681a(C37878g gVar);

        /* renamed from: a */
        void mo138682a(List<? extends C37878g> list);

        /* renamed from: a */
        void mo138683a(List<? extends C37878g> list, boolean z);
    }

    /* renamed from: e */
    private final CoroutineScope m148967e() {
        return (CoroutineScope) this.f97088g.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/feed/app/team/feed/TeamFeedModel$Companion;", "", "()V", "TAG", "", "USER_SP_LAST_ALL_TEAM_EXPAND_STATUS_KEY", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.a.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo138671a(Map<Long, ? extends Team> map) {
        Team d;
        for (Map.Entry<Long, ? extends Team> entry : map.entrySet()) {
            long longValue = entry.getKey().longValue();
            Team team = (Team) entry.getValue();
            Log.m165389i("TeamFeedModel", "push team change, team id: " + longValue);
            Long l = this.f97083a.get(Long.valueOf(longValue));
            if (l != null) {
                long longValue2 = l.longValue();
                C37875e eVar = this.f97084b.get(Long.valueOf(longValue2));
                if (!(eVar == null || (d = eVar.mo138766d()) == null)) {
                    Log.m165389i("TeamFeedModel", "local team version: " + d.getVersion() + ", name: " + d.getName() + "; " + "push team version:" + team.getVersion() + ", push team name: " + team.getName());
                    if (d.getVersion() < team.getVersion()) {
                        eVar.mo138758a(team);
                        this.f97087e.mo138681a(new C37878g(longValue2, team, mo138672a(eVar.mo138762b())));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo138670a(C55442a aVar) {
        List<Item> b = aVar.mo189194b();
        Intrinsics.checkExpressionValueIsNotNull(b, "pushChangeItem.itemList");
        boolean z = false;
        for (Item item : CollectionsKt.filterNotNull(b)) {
            Item.Type entityType = item.getEntityType();
            if (entityType != null) {
                int i = C37859f.f97109b[entityType.ordinal()];
                if (i == 1) {
                    m148965a(aVar, item);
                    z = true;
                } else if (i == 2) {
                    m148964a(item);
                }
            }
            Log.m165397w("TeamFeedModel", "push item update type: UNKNOWN");
        }
        if (z) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : CollectionsKt.toList(this.f97084b.entrySet())) {
                if (m148966a((C37875e) ((Map.Entry) obj).getValue())) {
                    arrayList.add(obj);
                }
            }
            List<Map.Entry> sortedWith = CollectionsKt.sortedWith(arrayList, new C37851h());
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(sortedWith, 10));
            for (Map.Entry entry : sortedWith) {
                long longValue = ((Number) entry.getKey()).longValue();
                arrayList2.add(new C37878g(longValue, ((C37875e) entry.getValue()).mo138766d(), mo138672a(longValue)));
            }
            Log.m165389i("TeamFeedModel", "notify team list changed");
            this.f97087e.mo138683a((List<? extends C37878g>) arrayList2, false);
        }
    }

    /* renamed from: a */
    public final boolean mo138672a(long j) {
        Boolean bool = this.f97085c.get(Long.valueOf(j));
        if (bool != null) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            return bool.booleanValue();
        }
        this.f97085c.put(Long.valueOf(j), true);
        return true;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.feed.app.team.feed.TeamFeedModel$fetchTeamList$1", mo239173f = "TeamFeedModel.kt", mo239174i = {0}, mo239175l = {179}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.feed.app.team.a.e$f */
    public static final class C37845f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TeamFeedModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37845f(TeamFeedModel eVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C37845f fVar = new C37845f(this.this$0, cVar);
            fVar.p$ = (CoroutineScope) obj;
            return fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C37845f) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/feed/app/team/feed/TeamFeedModel$fetchTeamList$1$3$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.feed.app.team.a.e$f$a */
        public static final class RunnableC37847a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ long f97098a;

            /* renamed from: b */
            final /* synthetic */ Team f97099b;

            /* renamed from: c */
            final /* synthetic */ C37845f f97100c;

            /* renamed from: d */
            final /* synthetic */ C37876f f97101d;

            /* renamed from: e */
            final /* synthetic */ List f97102e;

            RunnableC37847a(long j, Team team, C37845f fVar, C37876f fVar2, List list) {
                this.f97098a = j;
                this.f97099b = team;
                this.f97100c = fVar;
                this.f97101d = fVar2;
                this.f97102e = list;
            }

            public final void run() {
                this.f97100c.this$0.mo138668a(this.f97098a, this.f97099b);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                this.L$0 = this.p$;
                this.label = 1;
                obj = C69388e.m266829a(Dispatchers.m266326d(), new Function2<CoroutineScope, Continuation<? super C37876f>, Object>(null) {
                    /* class com.ss.android.lark.feed.app.team.feed.TeamFeedModel.C37845f.C378461 */
                    Object L$0;
                    int label;
                    private CoroutineScope p$;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                        Intrinsics.checkParameterIsNotNull(cVar, "completion");
                        C378461 r0 = 

                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/CoroutineScope;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.feed.app.team.a.e$d */
                        static final class C37842d extends Lambda implements Function0<CoroutineScope> {
                            public static final C37842d INSTANCE = new C37842d();

                            C37842d() {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final CoroutineScope invoke() {
                                return C69364ai.m266265a(cr.m266795a(null, 1, null).plus(Dispatchers.m266324b()));
                            }
                        }

                        /* renamed from: c */
                        public final void mo138675c() {
                            Log.m165389i("TeamFeedModel", "start fetch team list");
                            Job unused = C69553g.m266944a(m148967e(), null, null, new C37845f(this, null), 3, null);
                        }

                        /* renamed from: d */
                        public final void mo138676d() {
                            Job unused = C69553g.m266944a(GlobalScope.f173453a, Dispatchers.m266326d(), null, new C37858o(this, null), 2, null);
                        }

                        /* renamed from: b */
                        public final void mo138673b() {
                            this.f97089h.mo139312b(this.f97091j);
                            this.f97089h.mo139313b(this.f97092k);
                            this.f97089h.mo139311b(this.f97093l);
                            this.f97090i.mo139348b(this.f97096o);
                            C38128e.m149952a().mo139483b(this.f97094m);
                            C38128e.m149952a().mo139485b(this.f97095n);
                            C69364ai.m266267a(m148967e(), null, 1, null);
                        }

                        /* renamed from: a */
                        public final void mo138667a() {
                            Job unused = C69553g.m266944a(m148967e(), null, null, new C37852i(this, null), 3, null);
                            this.f97089h.mo139308a(this.f97091j);
                            this.f97089h.mo139309a(this.f97092k);
                            this.f97089h.mo139307a(this.f97093l);
                            this.f97090i.mo139335a(this.f97096o);
                            C38128e.m149952a().mo139474a(this.f97094m);
                            C38128e.m149952a().mo139476a(this.f97095n);
                        }

                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/feed/app/team/feed/TeamFeedModel$pushFeedEntityPreviewListener$1", "Lcom/ss/android/lark/feed/interfaces/IPushFeedEntityPreviewListener;", "onPushFeedEntityPreview", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/alibaba/fastjson/JSONObject;", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.feed.app.team.a.e$k */
                        public static final class C37854k implements IPushFeedEntityPreviewListener {

                            /* renamed from: a */
                            final /* synthetic */ TeamFeedModel f97104a;

                            /* JADX WARN: Incorrect args count in method signature: ()V */
                            C37854k(TeamFeedModel eVar) {
                                this.f97104a = eVar;
                            }

                            @Override // com.ss.android.lark.feed.interfaces.IPushFeedEntityPreviewListener
                            /* renamed from: a */
                            public void mo137415a(JSONObject jSONObject) {
                                List<FeedPreviewInfo> list;
                                List filterNotNull;
                                boolean z;
                                if (jSONObject != null) {
                                    Object obj = jSONObject.get("params_feed_preview_update_info");
                                    if (!(obj instanceof C38166k)) {
                                        obj = null;
                                    }
                                    C38166k kVar = (C38166k) obj;
                                    if (!(kVar == null || (list = kVar.f97854a) == null || (filterNotNull = CollectionsKt.filterNotNull(list)) == null)) {
                                        ArrayList<FeedPreviewInfo> arrayList = new ArrayList();
                                        for (Object obj2 : filterNotNull) {
                                            FeedPreviewInfo feedPreviewInfo = (FeedPreviewInfo) obj2;
                                            if (feedPreviewInfo.mo106109w() == FeedCard.FeedType.INBOX && (feedPreviewInfo.mo106051c() == Chat.Type.GROUP || feedPreviewInfo.mo106051c() == Chat.Type.TOPIC_GROUP)) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            if (z) {
                                                arrayList.add(obj2);
                                            }
                                        }
                                        for (FeedPreviewInfo feedPreviewInfo2 : arrayList) {
                                            for (C37875e eVar : CollectionsKt.toList(this.f97104a.f97084b.values())) {
                                                if (eVar.mo138761a(feedPreviewInfo2.mo106098p())) {
                                                    C37874d c = eVar.mo138765c(feedPreviewInfo2.mo106098p());
                                                    C37860g.m148992a(c, feedPreviewInfo2);
                                                    Dependency bVar = this.f97104a.f97087e;
                                                    long c2 = eVar.mo138764c();
                                                    Intrinsics.checkExpressionValueIsNotNull(c, "teamChatVO");
                                                    bVar.mo138678a(c2, c);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }

                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\u0010\u0000\u001a\u00020\u00012D\u0010\u0002\u001a@\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005*\u001e\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u00060\u00070\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "teamIdToTeamMap", "", "", "kotlin.jvm.PlatformType", "Lcom/ss/android/lark/team/entity/Team;", "", "onTeamsChange"}, mo238835k = 3, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.feed.app.team.a.e$n */
                        static final class C37857n implements AbstractC55360c {

                            /* renamed from: a */
                            final /* synthetic */ TeamFeedModel f97107a;

                            C37857n(TeamFeedModel eVar) {
                                this.f97107a = eVar;
                            }

                            @Override // com.ss.android.lark.team.p2732b.AbstractC55360c
                            /* renamed from: a */
                            public final void mo138689a(Map<Long, Team> map) {
                                Intrinsics.checkParameterIsNotNull(map, "teamIdToTeamMap");
                                this.f97107a.mo138671a(map);
                            }
                        }

                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isConnected", "", "onConnStateChanged"}, mo238835k = 3, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.feed.app.team.a.e$c */
                        static final class C37841c implements AbstractC38096g {

                            /* renamed from: a */
                            final /* synthetic */ TeamFeedModel f97097a;

                            C37841c(TeamFeedModel eVar) {
                                this.f97097a = eVar;
                            }

                            @Override // com.ss.android.lark.feed.interfaces.AbstractC38096g
                            /* renamed from: a */
                            public final void mo138502a(boolean z) {
                                if (z && this.f97097a.f97086d.mo138392c(2048)) {
                                    this.f97097a.f97086d.mo138391b(2048);
                                    this.f97097a.mo138675c();
                                }
                            }
                        }

                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onTeamItemExpired"}, mo238835k = 3, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.feed.app.team.a.e$m */
                        static final class C37856m implements AbstractC55359b {

                            /* renamed from: a */
                            final /* synthetic */ TeamFeedModel f97106a;

                            C37856m(TeamFeedModel eVar) {
                                this.f97106a = eVar;
                            }

                            @Override // com.ss.android.lark.team.p2732b.AbstractC55359b
                            /* renamed from: a */
                            public final void mo138688a(long j) {
                                Log.m165389i("TeamFeedModel", "push team item expired, id: " + j);
                                this.f97106a.mo138675c();
                            }
                        }

                        /* renamed from: a */
                        private final boolean m148966a(C37875e eVar) {
                            if (eVar == null || eVar.mo138766d() == null || eVar.mo138756a() == null) {
                                return false;
                            }
                            return true;
                        }

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
                        @DebugMetadata(mo239172c = "com.ss.android.lark.feed.app.team.feed.TeamFeedModel$onCreate$1", mo239173f = "TeamFeedModel.kt", mo239174i = {0}, mo239175l = {153}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
                        /* renamed from: com.ss.android.lark.feed.app.team.a.e$i */
                        public static final class C37852i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            Object L$0;
                            int label;
                            private CoroutineScope p$;
                            final /* synthetic */ TeamFeedModel this$0;

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C37852i(TeamFeedModel eVar, Continuation cVar) {
                                super(2, cVar);
                                this.this$0 = eVar;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                                Intrinsics.checkParameterIsNotNull(cVar, "completion");
                                C37852i iVar = new C37852i(this.this$0, cVar);
                                iVar.p$ = (CoroutineScope) obj;
                                return iVar;
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                                return ((C37852i) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Object a = C69086a.m265828a();
                                int i = this.label;
                                if (i == 0) {
                                    C69097g.m265891a(obj);
                                    CoroutineScope ahVar = this.p$;
                                    TeamFeedModel eVar = this.this$0;
                                    this.L$0 = ahVar;
                                    this.label = 1;
                                    if (eVar.mo138666a(this) == a) {
                                        return a;
                                    }
                                } else if (i == 1) {
                                    CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                                    C69097g.m265891a(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "pushChangeItem", "Lcom/ss/android/lark/team/entity/PushChangeItem;", "onItemsChange"}, mo238835k = 3, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.feed.app.team.a.e$l */
                        static final class C37855l implements AbstractC55358a {

                            /* renamed from: a */
                            final /* synthetic */ TeamFeedModel f97105a;

                            C37855l(TeamFeedModel eVar) {
                                this.f97105a = eVar;
                            }

                            @Override // com.ss.android.lark.team.p2732b.AbstractC55358a
                            /* renamed from: a */
                            public final void mo138687a(C55442a aVar) {
                                Intrinsics.checkParameterIsNotNull(aVar, "pushChangeItem");
                                int i = C37859f.f97108a[aVar.mo189193a().ordinal()];
                                if (i == 1) {
                                    this.f97105a.mo138670a(aVar);
                                } else if (i != 2) {
                                    Log.m165397w("TeamFeedModel", "push items action is not update or delete");
                                } else {
                                    this.f97105a.mo138674b(aVar);
                                }
                            }
                        }

                        /* access modifiers changed from: package-private */
                        /* renamed from: a */
                        public final /* synthetic */ Object mo138666a(Continuation<? super Unit> cVar) {
                            Object a = C69388e.m266829a(Dispatchers.m266326d(), new C37849g(this, null), cVar);
                            if (a == C69086a.m265828a()) {
                                return a;
                            }
                            return Unit.INSTANCE;
                        }

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
                        @DebugMetadata(mo239172c = "com.ss.android.lark.feed.app.team.feed.TeamFeedModel$saveTeamExpandStatus$1", mo239173f = "TeamFeedModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
                        /* renamed from: com.ss.android.lark.feed.app.team.a.e$o */
                        public static final class C37858o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            int label;
                            private CoroutineScope p$;
                            final /* synthetic */ TeamFeedModel this$0;

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C37858o(TeamFeedModel eVar, Continuation cVar) {
                                super(2, cVar);
                                this.this$0 = eVar;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                                Intrinsics.checkParameterIsNotNull(cVar, "completion");
                                C37858o oVar = new C37858o(this.this$0, cVar);
                                oVar.p$ = (CoroutineScope) obj;
                                return oVar;
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                                return ((C37858o) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                C69086a.m265828a();
                                if (this.label == 0) {
                                    C69097g.m265891a(obj);
                                    try {
                                        Log.m165389i("TeamFeedModel", "save expand sp");
                                        UserSP.getInstance().putString("last_all_team_expand_status", JSON.toJSONString(this.this$0.f97085c));
                                    } catch (Throwable th) {
                                        Log.m165383e("TeamFeedModel", "save team expand status failed: " + th);
                                    }
                                    return Unit.INSTANCE;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }

                        /* renamed from: a */
                        private final void m148964a(Item item) {
                            C37874d c;
                            long id = item.getId();
                            String entityId = item.getEntityId();
                            Log.m165389i("TeamFeedModel", "push chat update, item id: " + id + ", chat id: " + entityId);
                            C37875e eVar = this.f97084b.get(Long.valueOf(item.getParentId()));
                            if (eVar != null && (c = eVar.mo138765c(entityId)) != null) {
                                c.mo138737a(item);
                                this.f97087e.mo138678a(eVar.mo138764c(), c);
                            }
                        }

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
                        @DebugMetadata(mo239172c = "com.ss.android.lark.feed.app.team.feed.TeamFeedModel$fetchSingleTeamChatList$1", mo239173f = "TeamFeedModel.kt", mo239174i = {0}, mo239175l = {213}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
                        /* renamed from: com.ss.android.lark.feed.app.team.a.e$e */
                        public static final class C37843e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ Team $team;
                            final /* synthetic */ long $teamItemId;
                            Object L$0;
                            int label;
                            private CoroutineScope p$;
                            final /* synthetic */ TeamFeedModel this$0;

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C37843e(TeamFeedModel eVar, long j, Team team, Continuation cVar) {
                                super(2, cVar);
                                this.this$0 = eVar;
                                this.$teamItemId = j;
                                this.$team = team;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                                Intrinsics.checkParameterIsNotNull(cVar, "completion");
                                C37843e eVar = new C37843e(this.this$0, this.$teamItemId, this.$team, cVar);
                                eVar.p$ = (CoroutineScope) obj;
                                return eVar;
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                                return ((C37843e) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Object a = C69086a.m265828a();
                                int i = this.label;
                                if (i == 0) {
                                    C69097g.m265891a(obj);
                                    this.L$0 = this.p$;
                                    this.label = 1;
                                    obj = C69388e.m266829a(Dispatchers.m266326d(), new Function2<CoroutineScope, Continuation<? super C37872c>, Object>(this, null) {
                                        /* class com.ss.android.lark.feed.app.team.feed.TeamFeedModel.C37843e.C378441 */
                                        Object L$0;
                                        int label;
                                        private CoroutineScope p$;
                                        final /* synthetic */ C37843e this$0;

                                        {
                                            this.this$0 = r1;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                                            Intrinsics.checkParameterIsNotNull(cVar, "completion");
                                            C378441 r0 = 

                                            /* access modifiers changed from: package-private */
                                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
                                            @DebugMetadata(mo239172c = "com.ss.android.lark.feed.app.team.feed.TeamFeedModel$getExpandStatusFromLocal$2", mo239173f = "TeamFeedModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
                                            /* renamed from: com.ss.android.lark.feed.app.team.a.e$g */
                                            public static final class C37849g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                int label;
                                                private CoroutineScope p$;
                                                final /* synthetic */ TeamFeedModel this$0;

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                C37849g(TeamFeedModel eVar, Continuation cVar) {
                                                    super(2, cVar);
                                                    this.this$0 = eVar;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                                                    Intrinsics.checkParameterIsNotNull(cVar, "completion");
                                                    C37849g gVar = new C37849g(this.this$0, cVar);
                                                    gVar.p$ = (CoroutineScope) obj;
                                                    return gVar;
                                                }

                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                                                    return ((C37849g) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Object invokeSuspend(Object obj) {
                                                    C69086a.m265828a();
                                                    if (this.label == 0) {
                                                        C69097g.m265891a(obj);
                                                        CoroutineScope ahVar = this.p$;
                                                        String string = UserSP.getInstance().getString("last_all_team_expand_status");
                                                        if (TextUtils.isEmpty(string)) {
                                                            Log.m165389i("TeamFeedModel", "getExpandStatusFromLocal local expand status is empty");
                                                            return Unit.INSTANCE;
                                                        }
                                                        try {
                                                            JSONObject parseObject = JSONObject.parseObject(string);
                                                            Intrinsics.checkExpressionValueIsNotNull(parseObject, "JSONObject.parseObject(statusString)");
                                                            final LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                            if (parseObject != null) {
                                                                for (Map.Entry entry : C69121n.m265993j(parseObject).entrySet()) {
                                                                    Long longOrNull = StringsKt.toLongOrNull((String) entry.getKey());
                                                                    if (longOrNull != null) {
                                                                        linkedHashMap.put(C69089a.m265840a(longOrNull.longValue()), C69089a.m265837a(Boolean.parseBoolean(entry.getValue().toString())));
                                                                    }
                                                                }
                                                                Job unused = C69553g.m266944a(ahVar, Dispatchers.m266324b(), null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, null) {
                                                                    /* class com.ss.android.lark.feed.app.team.feed.TeamFeedModel.C37849g.C378501 */
                                                                    int label;
                                                                    private CoroutineScope p$;
                                                                    final /* synthetic */ C37849g this$0;

                                                                    {
                                                                        this.this$0 = r1;
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                                                                        Intrinsics.checkParameterIsNotNull(cVar, "completion");
                                                                        C378501 r0 = 

                                                                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/alibaba/fastjson/JSONObject;", "kotlin.jvm.PlatformType", "onPushFeedPreview"}, mo238835k = 3, mv = {1, 1, 16})
                                                                        /* renamed from: com.ss.android.lark.feed.app.team.a.e$j */
                                                                        static final class C37853j implements AbstractC38106o {

                                                                            /* renamed from: a */
                                                                            final /* synthetic */ TeamFeedModel f97103a;

                                                                            C37853j(TeamFeedModel eVar) {
                                                                                this.f97103a = eVar;
                                                                            }

                                                                            @Override // com.ss.android.lark.feed.interfaces.AbstractC38106o
                                                                            /* renamed from: a */
                                                                            public final void mo137401a(JSONObject jSONObject) {
                                                                                List filterNotNull;
                                                                                if (jSONObject == null) {
                                                                                    Log.m165397w("TeamFeedModel", "data = null");
                                                                                    return;
                                                                                }
                                                                                Object obj = jSONObject.get("params_feed_preview_update_info");
                                                                                if (!(obj instanceof C38166k)) {
                                                                                    obj = null;
                                                                                }
                                                                                C38166k kVar = (C38166k) obj;
                                                                                if (kVar == null) {
                                                                                    Log.m165397w("TeamFeedModel", "pushFeedInfo=null");
                                                                                    return;
                                                                                }
                                                                                List<FeedPreviewInfo> list = kVar.f97854a;
                                                                                if (!(list == null || (filterNotNull = CollectionsKt.filterNotNull(list)) == null)) {
                                                                                    ArrayList<FeedPreviewInfo> arrayList = new ArrayList();
                                                                                    Iterator it = filterNotNull.iterator();
                                                                                    while (true) {
                                                                                        boolean z = true;
                                                                                        if (!it.hasNext()) {
                                                                                            break;
                                                                                        }
                                                                                        Object next = it.next();
                                                                                        FeedPreviewInfo feedPreviewInfo = (FeedPreviewInfo) next;
                                                                                        if (!(feedPreviewInfo.mo106109w() == FeedCard.FeedType.INBOX && (feedPreviewInfo.mo106051c() == Chat.Type.GROUP || feedPreviewInfo.mo106051c() == Chat.Type.TOPIC_GROUP))) {
                                                                                            z = false;
                                                                                        }
                                                                                        if (!z) {
                                                                                            Log.m165397w("TeamFeedModel", "unsupported info id=" + feedPreviewInfo.mo106098p() + ",name=" + feedPreviewInfo.mo106105s());
                                                                                        }
                                                                                        if (z) {
                                                                                            arrayList.add(next);
                                                                                        }
                                                                                    }
                                                                                    for (FeedPreviewInfo feedPreviewInfo2 : arrayList) {
                                                                                        boolean z2 = false;
                                                                                        for (T t : this.f97103a.f97084b.values()) {
                                                                                            if (t.mo138761a(feedPreviewInfo2.mo106098p())) {
                                                                                                C37874d c = t.mo138765c(feedPreviewInfo2.mo106098p());
                                                                                                C37860g.m148992a(c, feedPreviewInfo2);
                                                                                                Dependency bVar = this.f97103a.f97087e;
                                                                                                long c2 = t.mo138764c();
                                                                                                Intrinsics.checkExpressionValueIsNotNull(c, "teamChatVO");
                                                                                                bVar.mo138678a(c2, c);
                                                                                                z2 = true;
                                                                                            }
                                                                                        }
                                                                                        if (!z2) {
                                                                                            Log.m165397w("TeamFeedModel", "not matched id=" + feedPreviewInfo2.mo106098p());
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }

                                                                        public TeamFeedModel(Dependency bVar) {
                                                                            Intrinsics.checkParameterIsNotNull(bVar, "dependency");
                                                                            this.f97087e = bVar;
                                                                            AbstractC38037a b = C37268c.m146766b();
                                                                            Intrinsics.checkExpressionValueIsNotNull(b, "FeedContext.getDependency()");
                                                                            this.f97089h = b.mo139157D();
                                                                            AbstractC38037a b2 = C37268c.m146766b();
                                                                            Intrinsics.checkExpressionValueIsNotNull(b2, "FeedContext.getDependency()");
                                                                            this.f97090i = b2.mo139161H();
                                                                            this.f97091j = new C37856m(this);
                                                                            this.f97092k = new C37857n(this);
                                                                            this.f97093l = new C37855l(this);
                                                                            this.f97094m = new C37853j(this);
                                                                            this.f97095n = new C37854k(this);
                                                                            this.f97096o = new C37841c(this);
                                                                            this.f97086d = new C37730c();
                                                                        }

                                                                        /* renamed from: b */
                                                                        public final void mo138674b(C55442a aVar) {
                                                                            Team d;
                                                                            Long longOrNull;
                                                                            List<Item> b = aVar.mo189194b();
                                                                            Intrinsics.checkExpressionValueIsNotNull(b, "pushChangeItem.itemList");
                                                                            for (Item item : CollectionsKt.filterNotNull(b)) {
                                                                                Item.Type entityType = item.getEntityType();
                                                                                if (entityType != null) {
                                                                                    int i = C37859f.f97110c[entityType.ordinal()];
                                                                                    if (i == 1) {
                                                                                        Log.m165389i("TeamFeedModel", "push team delete, item id: " + item.getId());
                                                                                        C37875e remove = this.f97084b.remove(Long.valueOf(item.getId()));
                                                                                        if (!(remove == null || (d = remove.mo138766d()) == null)) {
                                                                                            Log.m165389i("TeamFeedModel", "delete team, team id: " + d.getId() + ", team name: " + d.getName());
                                                                                            this.f97083a.remove(Long.valueOf(d.getId()));
                                                                                            this.f97085c.remove(Long.valueOf(item.getId()));
                                                                                            this.f97087e.mo138677a(d.getId());
                                                                                        }
                                                                                    } else if (i == 2) {
                                                                                        Log.m165389i("TeamFeedModel", "push chat delete, item id: " + item.getId() + ", parent item id: " + item.getParentId());
                                                                                        String entityId = item.getEntityId();
                                                                                        if (!(entityId == null || (longOrNull = StringsKt.toLongOrNull(entityId)) == null)) {
                                                                                            long longValue = longOrNull.longValue();
                                                                                            C37875e eVar = this.f97084b.get(Long.valueOf(item.getParentId()));
                                                                                            if (eVar != null) {
                                                                                                Log.m165389i("TeamFeedModel", "delete chat, chat id: " + longValue);
                                                                                                eVar.mo138763b(item.getEntityId());
                                                                                                this.f97087e.mo138679a(eVar.mo138764c(), String.valueOf(longValue));
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                Log.m165397w("TeamFeedModel", "push item delete type : UNKNOWN");
                                                                            }
                                                                        }

                                                                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, mo238835k = 3, mv = {1, 1, 16})
                                                                        /* renamed from: com.ss.android.lark.feed.app.team.a.e$h */
                                                                        public static final class C37851h<T> implements Comparator<T> {
                                                                            @Override // java.util.Comparator
                                                                            public final int compare(T t, T t2) {
                                                                                Item a = ((C37875e) t.getValue()).mo138756a();
                                                                                Intrinsics.checkExpressionValueIsNotNull(a, "it.value.item");
                                                                                Item a2 = ((C37875e) t2.getValue()).mo138756a();
                                                                                Intrinsics.checkExpressionValueIsNotNull(a2, "it.value.item");
                                                                                return ComparisonsKt.compareValues(Long.valueOf(a.getOrderWeight()), Long.valueOf(a2.getOrderWeight()));
                                                                            }
                                                                        }

                                                                        /* renamed from: a */
                                                                        private final void m148965a(C55442a aVar, Item item) {
                                                                            Team team;
                                                                            long id = item.getId();
                                                                            String entityId = item.getEntityId();
                                                                            Intrinsics.checkExpressionValueIsNotNull(entityId, "teamItem.entityId");
                                                                            Long longOrNull = StringsKt.toLongOrNull(entityId);
                                                                            if (longOrNull != null) {
                                                                                long longValue = longOrNull.longValue();
                                                                                Log.m165389i("TeamFeedModel", "push team update, item id: " + id + ", team id: " + longValue);
                                                                                C37875e eVar = this.f97084b.get(Long.valueOf(id));
                                                                                if (eVar != null) {
                                                                                    Log.m165389i("TeamFeedModel", "push team found in local");
                                                                                    Item a = eVar.mo138756a();
                                                                                    if (a != null) {
                                                                                        Log.m165389i("TeamFeedModel", "local item version: " + a.getVersion() + ", push item version: " + item.getVersion());
                                                                                        if (a.getVersion() < item.getVersion() && (team = aVar.mo189195c().get(Long.valueOf(longValue))) != null) {
                                                                                            Log.m165389i("TeamFeedModel", "notify team update, team id: " + longValue);
                                                                                            eVar.mo138757a(item);
                                                                                            eVar.mo138758a(team);
                                                                                            mo138668a(id, team);
                                                                                            return;
                                                                                        }
                                                                                        return;
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                Log.m165389i("TeamFeedModel", "push team not found in local");
                                                                                Team team2 = aVar.mo189195c().get(Long.valueOf(longValue));
                                                                                if (team2 != null) {
                                                                                    Log.m165389i("TeamFeedModel", "notify team add, team id: " + longValue);
                                                                                    C37875e eVar2 = new C37875e(item, team2);
                                                                                    this.f97085c.put(Long.valueOf(id), true);
                                                                                    this.f97084b.put(Long.valueOf(id), eVar2);
                                                                                    this.f97083a.put(Long.valueOf(longValue), Long.valueOf(id));
                                                                                    mo138668a(id, team2);
                                                                                }
                                                                            }
                                                                        }

                                                                        /* renamed from: a */
                                                                        public final void mo138668a(long j, Team team) {
                                                                            Log.m165389i("TeamFeedModel", "fetch team chat list, item id: " + j + ", team id: " + team.getId());
                                                                            Job unused = C69553g.m266944a(m148967e(), null, null, new C37843e(this, j, team, null), 3, null);
                                                                        }

                                                                        /* renamed from: a */
                                                                        public final void mo138669a(long j, boolean z) {
                                                                            C37875e eVar = this.f97084b.get(Long.valueOf(j));
                                                                            if (eVar != null) {
                                                                                eVar.mo138760a(z);
                                                                            }
                                                                            this.f97085c.put(Long.valueOf(j), Boolean.valueOf(z));
                                                                        }
                                                                    }
