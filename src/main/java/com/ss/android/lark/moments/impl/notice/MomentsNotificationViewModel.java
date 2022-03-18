package com.ss.android.lark.moments.impl.notice;

import androidx.lifecycle.C1143ag;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.moments.v1.Entities;
import com.bytedance.lark.pb.moments.v1.ListNotificationsResponse;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.bytedance.lark.pb.moments.v1.Notification;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.moments.impl.common.BaseViewModel;
import com.ss.android.lark.moments.impl.commonvo.IMomentsUser;
import com.ss.android.lark.moments.impl.commonvo.IMomentsUserModel;
import com.ss.android.lark.moments.impl.commonvo.MomentsUserVM;
import com.ss.android.lark.moments.impl.feed.model.DataCacheLiveData;
import com.ss.android.lark.moments.impl.hitpoint.MomentsAppreciableHitPoint;
import com.ss.android.lark.moments.impl.mainview.badge.MomentsNotificationManager;
import com.ss.android.lark.moments.impl.notice.vo.IMomentsNotificationBaseVM;
import com.ss.android.lark.moments.impl.notice.vo.IMomentsNotificationVM;
import com.ss.android.lark.moments.impl.notice.vo.MomentsNotificationEmptyVM;
import com.ss.android.lark.moments.impl.notice.vo.MomentsNotificationVM;
import com.ss.android.lark.moments.impl.rustadapter.service.MomentsPassThroughService;
import com.ss.android.lark.moments.impl.rustadapter.service.MomentsSDKService;
import com.ss.android.lark.moments.impl.rustadapter.service.SdkResponse;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.bl;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 E2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001EB\u0005¢\u0006\u0002\u0010\u0004J\b\u00101\u001a\u00020\rH\u0016J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u00020+H\u0016J\u0012\u00105\u001a\u0004\u0018\u0001062\u0006\u00104\u001a\u00020+H\u0002J\u0016\u00107\u001a\u0002032\f\u00108\u001a\b\u0012\u0004\u0012\u00020:09H\u0002J\u001e\u0010;\u001a\u0002032\f\u00108\u001a\b\u0012\u0004\u0012\u00020:092\u0006\u0010<\u001a\u00020\rH\u0002J\u0006\u0010=\u001a\u000203J\b\u0010>\u001a\u000203H\u0016J\u0006\u0010?\u001a\u000203J\u0010\u0010@\u001a\u0002032\u0006\u0010<\u001a\u00020\rH\u0016J\u0010\u0010A\u001a\u0002032\u0006\u00104\u001a\u00020+H\u0016J\u0018\u0010B\u001a\u0002032\u0006\u00104\u001a\u00020+2\u0006\u0010C\u001a\u00020\rH\u0002J\u0010\u0010D\u001a\u0002032\u0006\u00104\u001a\u00020+H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178TX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u000fR \u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u001eR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u000fR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u000fR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u000fR\u000e\u0010*\u001a\u00020+X\u000e¢\u0006\u0002\n\u0000R\u001d\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020.0-¢\u0006\b\n\u0000\u001a\u0004\b/\u00100¨\u0006F"}, d2 = {"Lcom/ss/android/lark/moments/impl/notice/MomentsNotificationViewModel;", "Lcom/ss/android/lark/moments/impl/notice/IMomentsNotificationViewModel;", "Lcom/ss/android/lark/moments/impl/commonvo/IMomentsUserModel;", "Lcom/ss/android/lark/moments/impl/common/BaseViewModel;", "()V", "category", "", "getCategory", "()I", "setCategory", "(I)V", "completeRefresh", "Landroidx/lifecycle/MutableLiveData;", "", "getCompleteRefresh", "()Landroidx/lifecycle/MutableLiveData;", "dataList", "Lcom/ss/android/lark/moments/impl/feed/model/DataCacheLiveData;", "", "Lcom/ss/android/lark/moments/impl/notice/vo/IMomentsNotificationBaseVM;", "getDataList", "()Lcom/ss/android/lark/moments/impl/feed/model/DataCacheLiveData;", "dispatcher", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "dispatcher$delegate", "Lkotlin/Lazy;", "isVisible", "setVisible", "(Landroidx/lifecycle/MutableLiveData;)V", "loadFail", "getLoadFail", "needPutRead", "getNeedPutRead", "setNeedPutRead", "pageLoading", "getPageLoading", "scrollPosition", "getScrollPosition", "toastResId", "getToastResId", "token", "", "userMap", "", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "getUserMap", "()Ljava/util/Map;", "canLoadMore", "followUser", "", "userId", "getUser", "Lcom/ss/android/lark/moments/impl/commonvo/MomentsUserVM;", "handleListLoadMore", "result", "Lcom/ss/android/lark/moments/impl/rustadapter/service/SdkResponse;", "Lcom/bytedance/lark/pb/moments/v1/ListNotificationsResponse;", "handleListRefresh", "isFirst", "loadFirstPage", "loadMore", "putReadNotification", "refreshList", "unFollowUser", "updateUserFollowStatus", "isFollow", "userChanged", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.notice.d */
public final class MomentsNotificationViewModel extends BaseViewModel implements IMomentsUserModel {
    public static final Companion Companion = new Companion(null);
    private int category = 1;
    private final C1177w<Boolean> completeRefresh;
    private final DataCacheLiveData<List<IMomentsNotificationBaseVM>> dataList;
    private final Lazy dispatcher$delegate;
    private C1177w<Boolean> isVisible;
    private final C1177w<Boolean> loadFail;
    private C1177w<Boolean> needPutRead;
    private final C1177w<Boolean> pageLoading;
    private final C1177w<Integer> scrollPosition;
    private final C1177w<Integer> toastResId;
    public String token;
    private final Map<String, MomentUser> userMap;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.moments.impl.common.BaseViewModel
    public ExecutorCoroutineDispatcher getDispatcher() {
        return (ExecutorCoroutineDispatcher) this.dispatcher$delegate.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/moments/impl/notice/MomentsNotificationViewModel$Companion;", "", "()V", "LOG_TAG", "", "PAGE_COUNT", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getCategory() {
        return this.category;
    }

    public C1177w<Boolean> getCompleteRefresh() {
        return this.completeRefresh;
    }

    public DataCacheLiveData<List<IMomentsNotificationBaseVM>> getDataList() {
        return this.dataList;
    }

    public C1177w<Boolean> getLoadFail() {
        return this.loadFail;
    }

    public C1177w<Boolean> getNeedPutRead() {
        return this.needPutRead;
    }

    public C1177w<Boolean> getPageLoading() {
        return this.pageLoading;
    }

    public C1177w<Integer> getScrollPosition() {
        return this.scrollPosition;
    }

    public C1177w<Integer> getToastResId() {
        return this.toastResId;
    }

    public final Map<String, MomentUser> getUserMap() {
        return this.userMap;
    }

    public C1177w<Boolean> isVisible() {
        return this.isVisible;
    }

    public boolean canLoadMore() {
        if (this.token.length() > 0) {
            return true;
        }
        return false;
    }

    public final void loadFirstPage() {
        getPageLoading().mo5926a((Boolean) true);
        refreshList(true);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.d$b */
    static final class C47810b extends Lambda implements Function0<ExecutorCoroutineDispatcher> {
        public static final C47810b INSTANCE = new C47810b();

        C47810b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ExecutorCoroutineDispatcher invoke() {
            ExecutorService newSerialIODensityThreadPool = CoreThreadPool.getDefault().newSerialIODensityThreadPool("lk-moment-notification");
            Intrinsics.checkExpressionValueIsNotNull(newSerialIODensityThreadPool, "CoreThreadPool.getDefaul…\"lk-moment-notification\")");
            return bl.m266382a(newSerialIODensityThreadPool);
        }
    }

    public void loadMore() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47812d(this, null), 2, null);
    }

    public final void putReadNotification() {
        getNeedPutRead().mo5926a((Boolean) false);
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47813e(this, null), 2, null);
    }

    public MomentsNotificationViewModel() {
        C1177w<Boolean> wVar = new C1177w<>();
        wVar.mo5929b((Boolean) false);
        this.isVisible = wVar;
        C1177w<Boolean> wVar2 = new C1177w<>();
        wVar2.mo5929b((Boolean) false);
        this.needPutRead = wVar2;
        this.token = "";
        this.dispatcher$delegate = LazyKt.lazy(C47810b.INSTANCE);
        this.completeRefresh = new C1177w<>();
        this.pageLoading = new C1177w<>();
        this.dataList = new DataCacheLiveData<>();
        this.loadFail = new C1177w<>();
        this.toastResId = new C1177w<>();
        this.userMap = new LinkedHashMap();
        this.scrollPosition = new C1177w<>();
    }

    public final void setCategory(int i) {
        this.category = i;
    }

    public void setNeedPutRead(C1177w<Boolean> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.needPutRead = wVar;
    }

    public void setVisible(C1177w<Boolean> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.isVisible = wVar;
    }

    private final void userChanged(String str) {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47816h(this, str, null), 2, null);
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.IMomentsUserModel
    public void followUser(String str) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47811c(this, str, null), 2, null);
    }

    public final MomentsUserVM getUser(String str) {
        MomentUser momentUser = this.userMap.get(str);
        if (momentUser != null) {
            return new MomentsUserVM(momentUser, this);
        }
        return null;
    }

    public void refreshList(boolean z) {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47814f(this, z, null), 2, null);
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.IMomentsUserModel
    public void unFollowUser(String str) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47815g(this, str, null), 2, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.notice.MomentsNotificationViewModel$followUser$1", mo239173f = "MomentsNotificationViewModel.kt", mo239174i = {0}, mo239175l = {167}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.notice.d$c */
    static final class C47811c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $userId;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsNotificationViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47811c(MomentsNotificationViewModel dVar, String str, Continuation cVar) {
            super(2, cVar);
            this.this$0 = dVar;
            this.$userId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47811c cVar2 = new C47811c(this.this$0, this.$userId, cVar);
            cVar2.p$ = (CoroutineScope) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47811c) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                MomentsSDKService bVar = MomentsSDKService.f120147a;
                String str = this.$userId;
                this.L$0 = ahVar;
                this.label = 1;
                obj = bVar.mo167232a(str, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((Boolean) obj).booleanValue()) {
                Log.m165389i("moments_notification", "followUser success, userId is:" + this.$userId);
                this.this$0.updateUserFollowStatus(this.$userId, true);
            } else {
                this.this$0.getToastResId().mo5926a(C69089a.m265839a((int) R.string.Lark_Community_FollowFailed));
                this.this$0.updateUserFollowStatus(this.$userId, false);
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.notice.MomentsNotificationViewModel$loadMore$1", mo239173f = "MomentsNotificationViewModel.kt", mo239174i = {0}, mo239175l = {SmActions.ACTION_INIT_EXIT}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.notice.d$d */
    public static final class C47812d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsNotificationViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47812d(MomentsNotificationViewModel dVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47812d dVar = new C47812d(this.this$0, cVar);
            dVar.p$ = (CoroutineScope) obj;
            return dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47812d) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                MomentsSDKService bVar = MomentsSDKService.f120147a;
                String str = this.this$0.token;
                int category = this.this$0.getCategory();
                this.L$0 = ahVar;
                this.label = 1;
                obj = bVar.mo167224a(str, 20, category, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.handleListLoadMore((SdkResponse) obj);
            this.this$0.getCompleteRefresh().mo5926a(C69089a.m265837a(true));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.notice.MomentsNotificationViewModel$unFollowUser$1", mo239173f = "MomentsNotificationViewModel.kt", mo239174i = {0}, mo239175l = {204}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.notice.d$g */
    static final class C47815g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $userId;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsNotificationViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47815g(MomentsNotificationViewModel dVar, String str, Continuation cVar) {
            super(2, cVar);
            this.this$0 = dVar;
            this.$userId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47815g gVar = new C47815g(this.this$0, this.$userId, cVar);
            gVar.p$ = (CoroutineScope) obj;
            return gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47815g) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                MomentsSDKService bVar = MomentsSDKService.f120147a;
                String str = this.$userId;
                this.L$0 = ahVar;
                this.label = 1;
                obj = bVar.mo167243b(str, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((Boolean) obj).booleanValue()) {
                Log.m165389i("moments_notification", "unFollwUser success, userId:" + this.$userId);
                this.this$0.updateUserFollowStatus(this.$userId, false);
            } else {
                this.this$0.getToastResId().mo5926a(C69089a.m265839a((int) R.string.Lark_Community_FailedToUnfollow));
                this.this$0.updateUserFollowStatus(this.$userId, true);
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.notice.MomentsNotificationViewModel$putReadNotification$1", mo239173f = "MomentsNotificationViewModel.kt", mo239174i = {0, 0, 0}, mo239175l = {222}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "currentList", "notificationId"}, mo239178s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.moments.impl.notice.d$e */
    public static final class C47813e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsNotificationViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47813e(MomentsNotificationViewModel dVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47813e eVar = new C47813e(this.this$0, cVar);
            eVar.p$ = (CoroutineScope) obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47813e) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AbstractC26248b bVar;
            String b;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                List<IMomentsNotificationBaseVM> b2 = this.this$0.getDataList().mo5927b();
                if (CollectionUtils.isEmpty(b2)) {
                    return Unit.INSTANCE;
                }
                AbstractC26248b bVar2 = null;
                if (b2 != null) {
                    bVar = (IMomentsNotificationBaseVM) b2.get(0);
                } else {
                    bVar = null;
                }
                if (bVar instanceof IMomentsNotificationVM) {
                    bVar2 = bVar;
                }
                IMomentsNotificationVM bVar3 = (IMomentsNotificationVM) bVar2;
                if (bVar3 == null || (b = bVar3.mo167584b()) == null) {
                    return Unit.INSTANCE;
                }
                MomentsPassThroughService aVar = MomentsPassThroughService.f120127a;
                int category = this.this$0.getCategory();
                this.L$0 = ahVar;
                this.L$1 = b2;
                this.L$2 = b;
                this.label = 1;
                obj = aVar.mo167190a(b, category, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                String str = (String) this.L$2;
                List list = (List) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (Intrinsics.areEqual((Boolean) obj, C69089a.m265837a(true))) {
                if (this.this$0.getCategory() == 1) {
                    MomentsNotificationManager.f120258a.mo167390d();
                } else if (this.this$0.getCategory() == 2) {
                    MomentsNotificationManager.f120258a.mo167392e();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.notice.MomentsNotificationViewModel$refreshList$1", mo239173f = "MomentsNotificationViewModel.kt", mo239174i = {0}, mo239175l = {74}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.notice.d$f */
    public static final class C47814f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isFirst;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsNotificationViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47814f(MomentsNotificationViewModel dVar, boolean z, Continuation cVar) {
            super(2, cVar);
            this.this$0 = dVar;
            this.$isFirst = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47814f fVar = new C47814f(this.this$0, this.$isFirst, cVar);
            fVar.p$ = (CoroutineScope) obj;
            return fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47814f) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z;
            boolean z2;
            boolean z3;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                if (this.$isFirst) {
                    MomentsAppreciableHitPoint aVar = MomentsAppreciableHitPoint.f119684a;
                    if (this.this$0.getCategory() == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    aVar.mo166745b(z3);
                }
                MomentsSDKService bVar = MomentsSDKService.f120147a;
                int category = this.this$0.getCategory();
                this.L$0 = ahVar;
                this.label = 1;
                obj = bVar.mo167224a("", 20, category, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkResponse<ListNotificationsResponse> cVar = (SdkResponse) obj;
            if (this.$isFirst) {
                MomentsAppreciableHitPoint aVar2 = MomentsAppreciableHitPoint.f119684a;
                if (this.this$0.getCategory() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                aVar2.mo166748c(z2);
            }
            this.this$0.handleListRefresh(cVar, this.$isFirst);
            if (this.$isFirst) {
                MomentsAppreciableHitPoint aVar3 = MomentsAppreciableHitPoint.f119684a;
                if (this.this$0.getCategory() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                aVar3.mo166750d(z);
            }
            this.this$0.getNeedPutRead().mo5926a(C69089a.m265837a(true));
            this.this$0.getPageLoading().mo5926a(C69089a.m265837a(false));
            this.this$0.getCompleteRefresh().mo5926a(C69089a.m265837a(true));
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.notice.MomentsNotificationViewModel$userChanged$1", mo239173f = "MomentsNotificationViewModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.moments.impl.notice.d$h */
    public static final class C47816h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $userId;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsNotificationViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47816h(MomentsNotificationViewModel dVar, String str, Continuation cVar) {
            super(2, cVar);
            this.this$0 = dVar;
            this.$userId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47816h hVar = new C47816h(this.this$0, this.$userId, cVar);
            hVar.p$ = (CoroutineScope) obj;
            return hVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47816h) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                List<IMomentsNotificationBaseVM> b = this.this$0.getDataList().mo5927b();
                if (b == null) {
                    return Unit.INSTANCE;
                }
                List<IMomentsNotificationBaseVM> list = b;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (T t : list) {
                    if (t instanceof MomentsNotificationVM) {
                        T t2 = t;
                        IMomentsUser e = t2.mo167587e();
                        if (e != null) {
                            str = e.mo166364c();
                        } else {
                            str = null;
                        }
                        if (Intrinsics.areEqual(str, this.$userId)) {
                            t = (T) t2.mo167607u().mo167611a(this.this$0.getUser(this.$userId)).mo167608a();
                        }
                    }
                    arrayList.add(t);
                }
                this.this$0.getDataList().mo5926a(arrayList);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void handleListLoadMore(SdkResponse<ListNotificationsResponse> cVar) {
        boolean z;
        Map<String, MomentUser> map;
        if (cVar.mo167292b() != null) {
            Log.m165383e("moments_notification", "load more failed, err:" + cVar.mo167292b());
            return;
        }
        ListNotificationsResponse a = cVar.mo167291a();
        if (a == null) {
            Log.m165383e("moments_notification", "load more failed, response is null");
            return;
        }
        String str = a.next_page_token;
        Intrinsics.checkExpressionValueIsNotNull(str, "response.next_page_token");
        this.token = str;
        Entities entities = a.entities;
        if (!(entities == null || (map = entities.users) == null)) {
            this.userMap.putAll(map);
        }
        List<Notification> list = a.notifications;
        Intrinsics.checkExpressionValueIsNotNull(list, "response.notifications");
        List<Notification> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (T t : list2) {
            NotificationVOConvert eVar = NotificationVOConvert.f120430a;
            Intrinsics.checkExpressionValueIsNotNull(t, "it");
            arrayList.add(eVar.mo167582a((Notification) t, a.entities, (IMomentsUserModel) this));
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList();
        List<IMomentsNotificationBaseVM> b = getDataList().mo5927b();
        if (b != null) {
            arrayList3.addAll(b);
        }
        arrayList3.addAll(arrayList2);
        if (this.token.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            arrayList3.add(new MomentsNotificationEmptyVM());
        }
        getDataList().mo5926a(arrayList3);
    }

    public final void updateUserFollowStatus(String str, boolean z) {
        MomentUser momentUser = this.userMap.get(str);
        if (momentUser != null) {
            Map<String, MomentUser> map = this.userMap;
            MomentUser a = momentUser.newBuilder().mo63791a(Boolean.valueOf(z)).build();
            Intrinsics.checkExpressionValueIsNotNull(a, "it.newBuilder().is_curre…llowing(isFollow).build()");
            map.put(str, a);
            userChanged(str);
        }
    }

    public final void handleListRefresh(SdkResponse<ListNotificationsResponse> cVar, boolean z) {
        boolean z2;
        Map<String, MomentUser> map;
        if (cVar.mo167292b() != null) {
            MomentsAppreciableHitPoint.f119684a.mo166741a(MomentsAppreciableHitPoint.f119684a.mo166753f(), true, ErrorType.SDK, cVar.mo167292b().getErrorCode());
            Log.m165383e("moments_notification", "refresh list failed, err:" + cVar.mo167292b());
            if (z) {
                getLoadFail().mo5926a((Boolean) true);
                return;
            }
            return;
        }
        ListNotificationsResponse a = cVar.mo167291a();
        if (a == null) {
            MomentsAppreciableHitPoint.m187967a(MomentsAppreciableHitPoint.f119684a, MomentsAppreciableHitPoint.f119684a.mo166753f(), true, ErrorType.SDK, 0, 8, null);
            Log.m165383e("moments_notification", "refresh list failed, response is null");
            if (z) {
                getLoadFail().mo5926a((Boolean) true);
                return;
            }
            return;
        }
        String str = a.next_page_token;
        Intrinsics.checkExpressionValueIsNotNull(str, "response.next_page_token");
        this.token = str;
        this.userMap.clear();
        Entities entities = a.entities;
        if (!(entities == null || (map = entities.users) == null)) {
            this.userMap.putAll(map);
        }
        List<Notification> list = a.notifications;
        Intrinsics.checkExpressionValueIsNotNull(list, "response.notifications");
        List<Notification> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (T t : list2) {
            NotificationVOConvert eVar = NotificationVOConvert.f120430a;
            Intrinsics.checkExpressionValueIsNotNull(t, "it");
            arrayList.add(eVar.mo167582a((Notification) t, a.entities, (IMomentsUserModel) this));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (this.token.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && (!arrayList2.isEmpty())) {
            arrayList2.add(new MomentsNotificationEmptyVM());
        }
        getDataList().mo5926a(arrayList2);
        getScrollPosition().mo5926a((Integer) 0);
    }
}
