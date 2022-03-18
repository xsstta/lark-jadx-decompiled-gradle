package com.ss.android.lark.moments.impl.hashtag;

import androidx.lifecycle.C1143ag;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.basic.v1.RichText;
import com.bytedance.lark.pb.basic.v1.RichTextElement;
import com.bytedance.lark.pb.moments.v1.Comment;
import com.bytedance.lark.pb.moments.v1.CommentSet;
import com.bytedance.lark.pb.moments.v1.Entities;
import com.bytedance.lark.pb.moments.v1.EntityType;
import com.bytedance.lark.pb.moments.v1.GetHashtagDetailResponse;
import com.bytedance.lark.pb.moments.v1.Hashtag;
import com.bytedance.lark.pb.moments.v1.HashtagStats;
import com.bytedance.lark.pb.moments.v1.ListHashtagPostsRequest;
import com.bytedance.lark.pb.moments.v1.ManageMode;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.bytedance.lark.pb.moments.v1.Post;
import com.bytedance.lark.pb.moments.v1.ReactionSet;
import com.huawei.hms.location.LocationRequest;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.moments.impl.common.BaseViewModel;
import com.ss.android.lark.moments.impl.mainview.MomentsAppNameHolder;
import com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler;
import com.ss.android.lark.moments.impl.rustadapter.service.MomentsSDKService;
import com.ss.android.lark.moments.impl.rustadapter.service.SdkResponse;
import com.ss.android.lark.moments.impl.rustadapter.setting.UserGlobalConfigAndSettingsManager;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
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
import kotlinx.coroutines.C69388e;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.ar;
import kotlinx.coroutines.bl;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 L2\u00020\u00012\u00020\u0002:\u0001LB\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020)J\b\u0010+\u001a\u00020)H\u0014J6\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u0001012\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\bH\u0016J\u0018\u00105\u001a\u00020)2\u0006\u00106\u001a\u00020\b2\u0006\u00107\u001a\u000208H\u0016J\u001a\u00109\u001a\u00020)2\u0006\u0010:\u001a\u00020\b2\b\u00100\u001a\u0004\u0018\u000101H\u0016J6\u0010;\u001a\u00020)2\u0006\u0010<\u001a\u00020\b2\b\u0010=\u001a\u0004\u0018\u00010>2\b\u00100\u001a\u0004\u0018\u0001012\u0006\u00102\u001a\u00020?2\b\u00104\u001a\u0004\u0018\u00010\bH\u0016J*\u0010@\u001a\u00020)2 \u0010A\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020C0B\u0018\u00010BH\u0016J0\u0010D\u001a\u00020)2\u0006\u0010E\u001a\u00020\b2\b\u0010F\u001a\u0004\u0018\u00010G2\u0014\u0010H\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020I\u0018\u00010BH\u0016J\u0018\u0010J\u001a\u00020)2\u0006\u0010:\u001a\u00020\b2\u0006\u0010K\u001a\u00020\u001fH\u0016R)\u0010\u0004\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8TX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\nR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\nR\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R#\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\b0\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\nRC\u0010!\u001a4\u00120\u0012.\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00070\"j\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u0007`#0\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\nR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\n¨\u0006M"}, d2 = {"Lcom/ss/android/lark/moments/impl/hashtag/HashTagFeedViewModel;", "Lcom/ss/android/lark/moments/impl/common/BaseViewModel;", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler$IMomentsPushListener;", "()V", "avatarKeys", "Landroidx/lifecycle/MutableLiveData;", "", "Lkotlin/Pair;", "", "getAvatarKeys", "()Landroidx/lifecycle/MutableLiveData;", "content", "getContent", "dispatcher", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "dispatcher$delegate", "Lkotlin/Lazy;", "hashTagId", "getHashTagId", "()Ljava/lang/String;", "setHashTagId", "(Ljava/lang/String;)V", "participateCount", "getParticipateCount", "postCount", "getPostCount", "pushHandler", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler;", "showErrorPage", "", "getShowErrorPage", "tabList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getTabList", "toTimeOrderTab", "", "getToTimeOrderTab", "getHashTagDetail", "", "getTabsList", "onCleared", "onPushCommentStatusChanged", "localCommentId", "newComment", "Lcom/bytedance/lark/pb/moments/v1/Comment;", "entities", "Lcom/bytedance/lark/pb/moments/v1/Entities;", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/moments/v1/Comment$CreateStatus;", "errorMessage", "onPushEntityDeleted", "entityId", "entityType", "Lcom/bytedance/lark/pb/moments/v1/EntityType;", "onPushNewPostUpdate", "postId", "onPushPostStatusChanged", "localPostId", "newPost", "Lcom/bytedance/lark/pb/moments/v1/Post;", "Lcom/bytedance/lark/pb/moments/v1/Post$CreateStatus;", "onPushPreviewChanged", "updateMaps", "", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "onPushReaction", "id", "reactionSet", "Lcom/bytedance/lark/pb/moments/v1/ReactionSet;", "userMap", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "onPushShareCountChanged", "shareCount", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.hashtag.a */
public final class HashTagFeedViewModel extends BaseViewModel implements MomentsPushHandler.IMomentsPushListener {
    public static final Companion Companion = new Companion(null);
    private final C1177w<List<Pair<String, String>>> avatarKeys = new C1177w<>();
    private final C1177w<String> content = new C1177w<>();
    private final Lazy dispatcher$delegate = LazyKt.lazy(C47692b.INSTANCE);
    private String hashTagId = "";
    private final C1177w<String> participateCount = new C1177w<>();
    private final C1177w<String> postCount = new C1177w<>();
    private final MomentsPushHandler pushHandler;
    private final C1177w<Pair<Integer, String>> showErrorPage = new C1177w<>();
    private final C1177w<ArrayList<Pair<Integer, Integer>>> tabList;
    private final C1177w<Boolean> toTimeOrderTab = new C1177w<>();

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.moments.impl.common.BaseViewModel
    public ExecutorCoroutineDispatcher getDispatcher() {
        return (ExecutorCoroutineDispatcher) this.dispatcher$delegate.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/moments/impl/hashtag/HashTagFeedViewModel$Companion;", "", "()V", "REQUEST_DELAY_TIME", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.hashtag.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final C1177w<List<Pair<String, String>>> getAvatarKeys() {
        return this.avatarKeys;
    }

    public final C1177w<String> getContent() {
        return this.content;
    }

    public final String getHashTagId() {
        return this.hashTagId;
    }

    public final C1177w<String> getParticipateCount() {
        return this.participateCount;
    }

    public final C1177w<String> getPostCount() {
        return this.postCount;
    }

    public final C1177w<Pair<Integer, String>> getShowErrorPage() {
        return this.showErrorPage;
    }

    public final C1177w<ArrayList<Pair<Integer, Integer>>> getTabList() {
        return this.tabList;
    }

    public final C1177w<Boolean> getToTimeOrderTab() {
        return this.toTimeOrderTab;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af, com.ss.android.lark.moments.impl.common.BaseViewModel
    public void onCleared() {
        this.pushHandler.mo167188b();
        super.onCleared();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.hashtag.a$b */
    static final class C47692b extends Lambda implements Function0<ExecutorCoroutineDispatcher> {
        public static final C47692b INSTANCE = new C47692b();

        C47692b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ExecutorCoroutineDispatcher invoke() {
            ExecutorService newSerialIODensityThreadPool = CoreThreadPool.getDefault().newSerialIODensityThreadPool("lk-moment-hash-tag-detail");
            Intrinsics.checkExpressionValueIsNotNull(newSerialIODensityThreadPool, "CoreThreadPool.getDefaul…-moment-hash-tag-detail\")");
            return bl.m266382a(newSerialIODensityThreadPool);
        }
    }

    public final void getHashTagDetail() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C47693c(this, null), 3, null);
    }

    public final void getTabsList() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C47695d(this, null), 3, null);
    }

    public HashTagFeedViewModel() {
        MomentsPushHandler cVar = new MomentsPushHandler(this);
        this.pushHandler = cVar;
        this.tabList = new C1177w<>();
        cVar.mo167187a();
    }

    public final void setHashTagId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.hashTagId = str;
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushMomentUser(Map<String, MomentUser> map) {
        Intrinsics.checkParameterIsNotNull(map, "userMap");
        MomentsPushHandler.IMomentsPushListener.C47594a.m188470a(this, map);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushPreviewChanged(Map<String, ? extends Map<String, ? extends UrlPreviewEntity>> map) {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C47700i(this, null), 3, null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.hashtag.HashTagFeedViewModel$getHashTagDetail$1", mo239173f = "HashTagFeedViewModel.kt", mo239174i = {0}, mo239175l = {63}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.hashtag.a$c */
    public static final class C47693c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ HashTagFeedViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47693c(HashTagFeedViewModel aVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47693c cVar2 = new C47693c(this.this$0, cVar);
            cVar2.p$ = (CoroutineScope) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47693c) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/moments/impl/rustadapter/service/SdkResponse;", "Lcom/bytedance/lark/pb/moments/v1/GetHashtagDetailResponse;", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
        @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.hashtag.HashTagFeedViewModel$getHashTagDetail$1$response$1", mo239173f = "HashTagFeedViewModel.kt", mo239174i = {0}, mo239175l = {63}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext"}, mo239178s = {"L$0"})
        /* renamed from: com.ss.android.lark.moments.impl.hashtag.a$c$a */
        public static final class C47694a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SdkResponse<GetHashtagDetailResponse>>, Object> {
            Object L$0;
            int label;
            private CoroutineScope p$;
            final /* synthetic */ C47693c this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C47694a(C47693c cVar, Continuation cVar2) {
                super(2, cVar2);
                this.this$0 = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                Intrinsics.checkParameterIsNotNull(cVar, "completion");
                C47694a aVar = new C47694a(this.this$0, cVar);
                aVar.p$ = (CoroutineScope) obj;
                return aVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope ahVar, Continuation<? super SdkResponse<GetHashtagDetailResponse>> cVar) {
                return ((C47694a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object a = C69086a.m265828a();
                int i = this.label;
                if (i == 0) {
                    C69097g.m265891a(obj);
                    CoroutineScope ahVar = this.p$;
                    MomentsSDKService bVar = MomentsSDKService.f120147a;
                    String hashTagId = this.this$0.this$0.getHashTagId();
                    this.L$0 = ahVar;
                    this.label = 1;
                    obj = bVar.mo167253g(hashTagId, this);
                    if (obj == a) {
                        return a;
                    }
                } else if (i == 1) {
                    CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                    C69097g.m265891a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<MomentUser> list;
            Integer num;
            String str;
            Integer num2;
            String str2;
            String str3;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                this.L$0 = this.p$;
                this.label = 1;
                obj = C69388e.m266829a(this.this$0.getDispatcher(), new C47694a(this, null), this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkResponse cVar = (SdkResponse) obj;
            GetHashtagDetailResponse getHashtagDetailResponse = (GetHashtagDetailResponse) cVar.mo167291a();
            ErrorResult b = cVar.mo167292b();
            if (b != null || getHashtagDetailResponse == null) {
                if (b == null || b.getErrorCode() != 330300) {
                    this.this$0.getShowErrorPage().mo5926a(TuplesKt.to(C69089a.m265839a((int) R.drawable.illustration_empty_negative_load_failed), UIHelper.getString(R.string.Lark_Community_LoadingFailed)));
                } else {
                    this.this$0.getShowErrorPage().mo5926a(TuplesKt.to(C69089a.m265839a((int) R.drawable.illustration_empty_neutral_no_access), UIHelper.mustacheFormat((int) R.string.Lark_Community_NoCommunityPermissionContactAdministratorCustomized, "ExclusiveCommunityName", MomentsAppNameHolder.m188686a())));
                }
                return Unit.INSTANCE;
            }
            Hashtag hashtag = getHashtagDetailResponse.hashtag;
            if (!(hashtag == null || (str3 = hashtag.content) == null)) {
                this.this$0.getContent().mo5929b(str3);
            }
            HashtagStats hashtagStats = getHashtagDetailResponse.hashtag_stats;
            if (!(hashtagStats == null || (num2 = hashtagStats.participate_count) == null)) {
                int intValue = num2.intValue();
                C1177w<String> participateCount = this.this$0.getParticipateCount();
                if (intValue > 9999) {
                    str2 = UIHelper.getString(R.string.Lark_Community_Topic_9999PlusReactions);
                } else {
                    str2 = UIHelper.getQuantityString(R.plurals.Lark_Community_TopicsNumberEngagement, intValue);
                }
                participateCount.mo5929b(str2);
            }
            HashtagStats hashtagStats2 = getHashtagDetailResponse.hashtag_stats;
            if (!(hashtagStats2 == null || (num = hashtagStats2.post_count) == null)) {
                int intValue2 = num.intValue();
                C1177w<String> postCount = this.this$0.getPostCount();
                if (intValue2 > 9999) {
                    str = UIHelper.getString(R.string.Lark_Community_Topic_9999PlusMoments);
                } else {
                    str = UIHelper.getQuantityString(R.plurals.Lark_Community_TopicsNumberMoments, intValue2);
                }
                postCount.mo5929b(str);
            }
            HashtagStats hashtagStats3 = getHashtagDetailResponse.hashtag_stats;
            if (!(hashtagStats3 == null || (list = hashtagStats3.visible_users) == null)) {
                List<MomentUser> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (T t : list2) {
                    arrayList.add(new Pair(t.user_id, t.avatar_key));
                }
                this.this$0.getAvatarKeys().mo5929b(arrayList);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.hashtag.HashTagFeedViewModel$onPushCommentStatusChanged$1", mo239173f = "HashTagFeedViewModel.kt", mo239174i = {0}, mo239175l = {146}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.hashtag.a$e */
    static final class C47696e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ HashTagFeedViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47696e(HashTagFeedViewModel aVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47696e eVar = new C47696e(this.this$0, cVar);
            eVar.p$ = (CoroutineScope) obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47696e) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                this.L$0 = this.p$;
                this.label = 1;
                if (ar.m266295a(1000, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.getHashTagDetail();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.hashtag.HashTagFeedViewModel$onPushEntityDeleted$1", mo239173f = "HashTagFeedViewModel.kt", mo239174i = {0}, mo239175l = {98}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.hashtag.a$f */
    static final class C47697f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ HashTagFeedViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47697f(HashTagFeedViewModel aVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47697f fVar = new C47697f(this.this$0, cVar);
            fVar.p$ = (CoroutineScope) obj;
            return fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47697f) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                this.L$0 = this.p$;
                this.label = 1;
                if (ar.m266295a(1000, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.getHashTagDetail();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.hashtag.HashTagFeedViewModel$onPushNewPostUpdate$1", mo239173f = "HashTagFeedViewModel.kt", mo239174i = {0}, mo239175l = {SmEvents.EVENT_NE_RR}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.hashtag.a$g */
    static final class C47698g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ HashTagFeedViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47698g(HashTagFeedViewModel aVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47698g gVar = new C47698g(this.this$0, cVar);
            gVar.p$ = (CoroutineScope) obj;
            return gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47698g) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                this.L$0 = this.p$;
                this.label = 1;
                if (ar.m266295a(1000, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.getHashTagDetail();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.hashtag.HashTagFeedViewModel$onPushPreviewChanged$1", mo239173f = "HashTagFeedViewModel.kt", mo239174i = {0}, mo239175l = {LocationRequest.PRIORITY_NO_POWER}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.hashtag.a$i */
    static final class C47700i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ HashTagFeedViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47700i(HashTagFeedViewModel aVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47700i iVar = new C47700i(this.this$0, cVar);
            iVar.p$ = (CoroutineScope) obj;
            return iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47700i) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                this.L$0 = this.p$;
                this.label = 1;
                if (ar.m266295a(1000, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.getHashTagDetail();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.hashtag.HashTagFeedViewModel$onPushReaction$1", mo239173f = "HashTagFeedViewModel.kt", mo239174i = {0}, mo239175l = {137}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.hashtag.a$j */
    static final class C47701j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ HashTagFeedViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47701j(HashTagFeedViewModel aVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47701j jVar = new C47701j(this.this$0, cVar);
            jVar.p$ = (CoroutineScope) obj;
            return jVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47701j) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                this.L$0 = this.p$;
                this.label = 1;
                if (ar.m266295a(1000, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.getHashTagDetail();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.hashtag.HashTagFeedViewModel$onPushShareCountChanged$1", mo239173f = "HashTagFeedViewModel.kt", mo239174i = {0}, mo239175l = {154}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.hashtag.a$k */
    static final class C47702k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ HashTagFeedViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47702k(HashTagFeedViewModel aVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47702k kVar = new C47702k(this.this$0, cVar);
            kVar.p$ = (CoroutineScope) obj;
            return kVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47702k) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                this.L$0 = this.p$;
                this.label = 1;
                if (ar.m266295a(1000, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.getHashTagDetail();
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.hashtag.HashTagFeedViewModel$getTabsList$1", mo239173f = "HashTagFeedViewModel.kt", mo239174i = {0, 0}, mo239175l = {162}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "tabs"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.ss.android.lark.moments.impl.hashtag.a$d */
    public static final class C47695d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ HashTagFeedViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47695d(HashTagFeedViewModel aVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47695d dVar = new C47695d(this.this$0, cVar);
            dVar.p$ = (CoroutineScope) obj;
            return dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47695d) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ArrayList<Pair<Integer, Integer>> arrayList;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                ArrayList<Pair<Integer, Integer>> arrayList2 = new ArrayList<>();
                UserGlobalConfigAndSettingsManager aVar = UserGlobalConfigAndSettingsManager.f120180a;
                this.L$0 = ahVar;
                this.L$1 = arrayList2;
                this.label = 1;
                obj = aVar.mo167305e(this);
                if (obj == a) {
                    return a;
                }
                arrayList = arrayList2;
            } else if (i == 1) {
                arrayList = (ArrayList) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((ManageMode) obj) == ManageMode.STRONG_INTERVENTION) {
                arrayList.add(TuplesKt.to(C69089a.m265839a(ListHashtagPostsRequest.HashtagPostOrder.RECOMMEND.getValue()), null));
            } else {
                arrayList.add(TuplesKt.to(C69089a.m265839a(ListHashtagPostsRequest.HashtagPostOrder.PARTICIPATE_COUNT.getValue()), C69089a.m265839a((int) R.string.Lark_Community_TopicsPopularTab)));
                arrayList.add(TuplesKt.to(C69089a.m265839a(ListHashtagPostsRequest.HashtagPostOrder.CREATE_TIME_DESC.getValue()), C69089a.m265839a((int) R.string.Lark_Community_TopicsNewTab)));
            }
            this.this$0.getTabList().mo5926a(arrayList);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.hashtag.HashTagFeedViewModel$onPushPostStatusChanged$1", mo239173f = "HashTagFeedViewModel.kt", mo239174i = {0}, mo239175l = {SmActions.ACTION_INIT_ENTRY}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.hashtag.a$h */
    static final class C47699h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Post $newPost;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ HashTagFeedViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47699h(HashTagFeedViewModel aVar, Post post, Continuation cVar) {
            super(2, cVar);
            this.this$0 = aVar;
            this.$newPost = post;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47699h hVar = new C47699h(this.this$0, this.$newPost, cVar);
            hVar.p$ = (CoroutineScope) obj;
            return hVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47699h) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Post.PostContent postContent;
            RichText richText;
            String str;
            RichTextElement.PropertySet propertySet;
            RichTextElement.MentionProperty mentionProperty;
            RichTextElement.MentionItem mentionItem;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                this.L$0 = this.p$;
                this.label = 1;
                if (ar.m266295a(1000, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.getHashTagDetail();
            Post post = this.$newPost;
            if (post == null || (postContent = post.post_content) == null || (richText = postContent.content) == null) {
                return Unit.INSTANCE;
            }
            Intrinsics.checkExpressionValueIsNotNull(richText, "newPost?.post_content?.content ?: return@launch");
            List<String> list = richText.mention_ids;
            if (list == null) {
                return Unit.INSTANCE;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                RichTextElement richTextElement = richText.elements.get(it.next());
                if (richTextElement == null || (propertySet = richTextElement.property) == null || (mentionProperty = propertySet.mention) == null || (mentionItem = mentionProperty.item) == null) {
                    str = null;
                } else {
                    str = mentionItem.id;
                }
                if (Intrinsics.areEqual(str, this.this$0.getHashTagId())) {
                    this.this$0.getToTimeOrderTab().mo5926a(C69089a.m265837a(true));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushBroadcastChanged(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "postId");
        MomentsPushHandler.IMomentsPushListener.C47594a.m188472b(this, str, z);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushCommentSetChanged(String str, CommentSet commentSet) {
        Intrinsics.checkParameterIsNotNull(str, "postId");
        MomentsPushHandler.IMomentsPushListener.C47594a.m188464a(this, str, commentSet);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushDistributionChanged(String str, Post.PostDistributionType postDistributionType) {
        Intrinsics.checkParameterIsNotNull(str, "postId");
        Intrinsics.checkParameterIsNotNull(postDistributionType, "distributionType");
        MomentsPushHandler.IMomentsPushListener.C47594a.m188466a(this, str, postDistributionType);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushNewCommentUpdate(String str, Entities entities) {
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        MomentsPushHandler.IMomentsPushListener.C47594a.m188471b(this, str, entities);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushPostEntityChanged(Post post, Entities entities) {
        Intrinsics.checkParameterIsNotNull(post, "post");
        Intrinsics.checkParameterIsNotNull(entities, "entities");
        MomentsPushHandler.IMomentsPushListener.C47594a.m188461a(this, post, entities);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushUserFollow(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        MomentsPushHandler.IMomentsPushListener.C47594a.m188469a(this, str, z);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushEntityDeleted(String str, EntityType entityType) {
        Intrinsics.checkParameterIsNotNull(str, "entityId");
        Intrinsics.checkParameterIsNotNull(entityType, "entityType");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C47697f(this, null), 3, null);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushNewPostUpdate(String str, Entities entities) {
        Intrinsics.checkParameterIsNotNull(str, "postId");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C47698g(this, null), 3, null);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushShareCountChanged(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "postId");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C47702k(this, null), 3, null);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushReaction(String str, ReactionSet reactionSet, Map<String, MomentUser> map) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C47701j(this, null), 3, null);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushCommentStatusChanged(String str, Comment comment, Entities entities, Comment.CreateStatus createStatus, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "localCommentId");
        Intrinsics.checkParameterIsNotNull(createStatus, UpdateKey.STATUS);
        if (createStatus == Comment.CreateStatus.SUCCESS) {
            Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C47696e(this, null), 3, null);
        }
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushPostStatusChanged(String str, Post post, Entities entities, Post.CreateStatus createStatus, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "localPostId");
        Intrinsics.checkParameterIsNotNull(createStatus, UpdateKey.STATUS);
        if (createStatus == Post.CreateStatus.SUCCESS) {
            Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C47699h(this, post, null), 3, null);
        }
    }
}
