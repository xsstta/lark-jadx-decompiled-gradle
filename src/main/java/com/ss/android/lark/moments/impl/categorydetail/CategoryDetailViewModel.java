package com.ss.android.lark.moments.impl.categorydetail;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.lifecycle.C1143ag;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.moments.v1.Category;
import com.bytedance.lark.pb.moments.v1.CategoryStats;
import com.bytedance.lark.pb.moments.v1.Comment;
import com.bytedance.lark.pb.moments.v1.CommentSet;
import com.bytedance.lark.pb.moments.v1.Entities;
import com.bytedance.lark.pb.moments.v1.EntityType;
import com.bytedance.lark.pb.moments.v1.FeedOrder;
import com.bytedance.lark.pb.moments.v1.GetCategoryDetailResponse;
import com.bytedance.lark.pb.moments.v1.ManageMode;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.bytedance.lark.pb.moments.v1.Post;
import com.bytedance.lark.pb.moments.v1.ReactionSet;
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
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.bl;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u00062\u0006\u0010'\u001a\u00020(J\u0006\u0010\u000b\u001a\u00020%J\u0006\u0010$\u001a\u00020%J\b\u0010)\u001a\u00020%H\u0014J6\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\rH\u0016J\u0018\u00103\u001a\u00020%2\u0006\u00104\u001a\u00020\r2\u0006\u00105\u001a\u000206H\u0016J\u001a\u00107\u001a\u00020%2\u0006\u00108\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J6\u00109\u001a\u00020%2\u0006\u0010:\u001a\u00020\r2\b\u0010;\u001a\u0004\u0018\u00010<2\b\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u00020=2\b\u00102\u001a\u0004\u0018\u00010\rH\u0016J*\u0010>\u001a\u00020%2 \u0010?\u001a\u001c\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020A0@\u0018\u00010@H\u0016J0\u0010B\u001a\u00020%2\u0006\u0010C\u001a\u00020\r2\b\u0010D\u001a\u0004\u0018\u00010E2\u0014\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020G\u0018\u00010@H\u0016J\u0018\u0010H\u001a\u00020%2\u0006\u00108\u001a\u00020\r2\u0006\u0010I\u001a\u00020\u001fH\u0016R\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138TX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\bR%\u0010\u001d\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020\r0\u001e0\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\bRC\u0010!\u001a4\u00120\u0012.\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e0\"j\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e`#0\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\b¨\u0006J"}, d2 = {"Lcom/ss/android/lark/moments/impl/categorydetail/CategoryDetailViewModel;", "Lcom/ss/android/lark/moments/impl/common/BaseViewModel;", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler$IMomentsPushListener;", "()V", "backgroundImage", "Landroidx/lifecycle/MutableLiveData;", "Landroid/graphics/Bitmap;", "getBackgroundImage", "()Landroidx/lifecycle/MutableLiveData;", "categoryDetail", "Lcom/ss/android/lark/moments/impl/categorydetail/CategoryDetail;", "getCategoryDetail", "categoryId", "", "getCategoryId", "()Ljava/lang/String;", "setCategoryId", "(Ljava/lang/String;)V", "dispatcher", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "dispatcher$delegate", "Lkotlin/Lazy;", "mPushHandler", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler;", "refreshDetail", "", "getRefreshDetail", "showErrorPage", "Lkotlin/Pair;", "", "getShowErrorPage", "tabList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getTabList", "", "bitmap", "context", "Landroid/content/Context;", "onCleared", "onPushCommentStatusChanged", "localCommentId", "newComment", "Lcom/bytedance/lark/pb/moments/v1/Comment;", "entities", "Lcom/bytedance/lark/pb/moments/v1/Entities;", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/moments/v1/Comment$CreateStatus;", "errorMessage", "onPushEntityDeleted", "entityId", "entityType", "Lcom/bytedance/lark/pb/moments/v1/EntityType;", "onPushNewPostUpdate", "postId", "onPushPostStatusChanged", "localPostId", "newPost", "Lcom/bytedance/lark/pb/moments/v1/Post;", "Lcom/bytedance/lark/pb/moments/v1/Post$CreateStatus;", "onPushPreviewChanged", "updateMaps", "", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "onPushReaction", "id", "reactionSet", "Lcom/bytedance/lark/pb/moments/v1/ReactionSet;", "userMap", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "onPushShareCountChanged", "shareCount", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.categorydetail.h */
public final class CategoryDetailViewModel extends BaseViewModel implements MomentsPushHandler.IMomentsPushListener {
    private final C1177w<Bitmap> backgroundImage = new C1177w<>();
    private final C1177w<CategoryDetail> categoryDetail = new C1177w<>();
    private String categoryId;
    private final Lazy dispatcher$delegate;
    private final MomentsPushHandler mPushHandler;
    private final C1177w<Boolean> refreshDetail = new C1177w<>();
    private final C1177w<Pair<Integer, String>> showErrorPage;
    private final C1177w<ArrayList<Pair<Integer, Integer>>> tabList;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.moments.impl.common.BaseViewModel
    public ExecutorCoroutineDispatcher getDispatcher() {
        return (ExecutorCoroutineDispatcher) this.dispatcher$delegate.getValue();
    }

    public final C1177w<Bitmap> getBackgroundImage() {
        return this.backgroundImage;
    }

    public final C1177w<CategoryDetail> getCategoryDetail() {
        return this.categoryDetail;
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final C1177w<Boolean> getRefreshDetail() {
        return this.refreshDetail;
    }

    public final C1177w<Pair<Integer, String>> getShowErrorPage() {
        return this.showErrorPage;
    }

    public final C1177w<ArrayList<Pair<Integer, Integer>>> getTabList() {
        return this.tabList;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af, com.ss.android.lark.moments.impl.common.BaseViewModel
    public void onCleared() {
        super.onCleared();
        this.mPushHandler.mo167188b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.h$a */
    static final class C47228a extends Lambda implements Function0<ExecutorCoroutineDispatcher> {
        public static final C47228a INSTANCE = new C47228a();

        C47228a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ExecutorCoroutineDispatcher invoke() {
            ExecutorService newSerialIODensityThreadPool = CoreThreadPool.getDefault().newSerialIODensityThreadPool("lk-moment-category-detail");
            Intrinsics.checkExpressionValueIsNotNull(newSerialIODensityThreadPool, "CoreThreadPool.getDefaul…-moment-category-detail\")");
            return bl.m266382a(newSerialIODensityThreadPool);
        }
    }

    /* renamed from: getCategoryDetail  reason: collision with other method in class */
    public final void m270851getCategoryDetail() {
        String str = this.categoryId;
        if (str != null) {
            Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47230c(this, str, null), 2, null);
        }
    }

    /* renamed from: getTabList  reason: collision with other method in class */
    public final void m270852getTabList() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C47231d(this, null), 3, null);
    }

    public CategoryDetailViewModel() {
        MomentsPushHandler cVar = new MomentsPushHandler(this);
        this.mPushHandler = cVar;
        this.dispatcher$delegate = LazyKt.lazy(C47228a.INSTANCE);
        this.showErrorPage = new C1177w<>();
        this.tabList = new C1177w<>();
        cVar.mo167187a();
    }

    public final void setCategoryId(String str) {
        this.categoryId = str;
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushMomentUser(Map<String, MomentUser> map) {
        Intrinsics.checkParameterIsNotNull(map, "userMap");
        MomentsPushHandler.IMomentsPushListener.C47594a.m188470a(this, map);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushPreviewChanged(Map<String, ? extends Map<String, ? extends UrlPreviewEntity>> map) {
        this.refreshDetail.mo5926a((Boolean) true);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.categorydetail.CategoryDetailViewModel$getBackgroundImage$2", mo239173f = "CategoryDetailViewModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.h$b */
    static final class C47229b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ Context $context;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ CategoryDetailViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47229b(CategoryDetailViewModel hVar, Bitmap bitmap, Context context, Continuation cVar) {
            super(2, cVar);
            this.this$0 = hVar;
            this.$bitmap = bitmap;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47229b bVar = new C47229b(this.this$0, this.$bitmap, this.$context, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47229b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                this.this$0.getBackgroundImage().mo5926a(CategoryBackgroundUtils.f119124a.mo165996a(this.$bitmap, this.$context));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.categorydetail.CategoryDetailViewModel$getCategoryDetail$1", mo239173f = "CategoryDetailViewModel.kt", mo239174i = {0}, mo239175l = {62}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.h$c */
    static final class C47230c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $id;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ CategoryDetailViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47230c(CategoryDetailViewModel hVar, String str, Continuation cVar) {
            super(2, cVar);
            this.this$0 = hVar;
            this.$id = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47230c cVar2 = new C47230c(this.this$0, this.$id, cVar);
            cVar2.p$ = (CoroutineScope) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47230c) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Category category;
            CategoryStats categoryStats;
            Entities entities;
            Entities entities2;
            Map<String, Category> map;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                MomentsSDKService bVar = MomentsSDKService.f120147a;
                String str = this.$id;
                this.L$0 = ahVar;
                this.label = 1;
                obj = bVar.mo167254h(str, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkResponse cVar = (SdkResponse) obj;
            GetCategoryDetailResponse getCategoryDetailResponse = (GetCategoryDetailResponse) cVar.mo167291a();
            ErrorResult b = cVar.mo167292b();
            Map<String, MomentUser> map2 = null;
            if (b != null) {
                int errorCode = b.getErrorCode();
                if (errorCode == 330300) {
                    this.this$0.getShowErrorPage().mo5926a(TuplesKt.to(C69089a.m265839a((int) R.drawable.illustration_empty_neutral_no_access), UIHelper.mustacheFormat((int) R.string.Lark_Community_NoCommunityPermissionContactAdministratorCustomized, "ExclusiveCommunityName", MomentsAppNameHolder.m188686a())));
                } else if (errorCode != 330503) {
                    this.this$0.getShowErrorPage().mo5926a(TuplesKt.to(C69089a.m265839a((int) R.drawable.illustration_empty_negative_load_failed), UIHelper.getString(R.string.Lark_Community_LoadingFailed)));
                } else {
                    String displayMsg = b.getDisplayMsg();
                    if (displayMsg == null) {
                        displayMsg = UIHelper.getString(R.string.Lark_Community_NoAccessToCategoryToast);
                    }
                    this.this$0.getShowErrorPage().mo5926a(TuplesKt.to(null, displayMsg));
                }
                return Unit.INSTANCE;
            }
            C1177w<CategoryDetail> categoryDetail = this.this$0.getCategoryDetail();
            String str2 = this.$id;
            if (getCategoryDetailResponse == null || (entities2 = getCategoryDetailResponse.entities) == null || (map = entities2.categories) == null) {
                category = null;
            } else {
                category = map.get(this.$id);
            }
            if (getCategoryDetailResponse != null) {
                categoryStats = getCategoryDetailResponse.stats;
            } else {
                categoryStats = null;
            }
            if (!(getCategoryDetailResponse == null || (entities = getCategoryDetailResponse.entities) == null)) {
                map2 = entities.users;
            }
            categoryDetail.mo5926a(new CategoryDetail(str2, category, categoryStats, map2));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.categorydetail.CategoryDetailViewModel$getTabList$1", mo239173f = "CategoryDetailViewModel.kt", mo239174i = {0, 0}, mo239175l = {103}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "tabs"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.h$d */
    static final class C47231d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ CategoryDetailViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47231d(CategoryDetailViewModel hVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47231d dVar = new C47231d(this.this$0, cVar);
            dVar.p$ = (CoroutineScope) obj;
            return dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47231d) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
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
                arrayList.add(TuplesKt.to(C69089a.m265839a(FeedOrder.RECOMMEND.getValue()), null));
            } else {
                arrayList.add(TuplesKt.to(C69089a.m265839a(FeedOrder.LAST_REPLIED.getValue()), C69089a.m265839a((int) R.string.Lark_Community_RecentlyCommented)));
                arrayList.add(TuplesKt.to(C69089a.m265839a(FeedOrder.LAST_PUBLISH.getValue()), C69089a.m265839a((int) R.string.Lark_Community_Recents)));
            }
            this.this$0.getTabList().mo5926a(arrayList);
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
    public void onPushNewPostUpdate(String str, Entities entities) {
        Intrinsics.checkParameterIsNotNull(str, "postId");
        this.refreshDetail.mo5926a((Boolean) true);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushPostEntityChanged(Post post, Entities entities) {
        Intrinsics.checkParameterIsNotNull(post, "post");
        Intrinsics.checkParameterIsNotNull(entities, "entities");
        MomentsPushHandler.IMomentsPushListener.C47594a.m188461a(this, post, entities);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushShareCountChanged(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "postId");
        this.refreshDetail.mo5926a((Boolean) true);
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
        this.refreshDetail.mo5926a((Boolean) true);
    }

    public final void getBackgroundImage(Bitmap bitmap, Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (bitmap != null) {
            Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47229b(this, bitmap, context, null), 2, null);
        } else {
            this.backgroundImage.mo5926a((Bitmap) null);
        }
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushReaction(String str, ReactionSet reactionSet, Map<String, MomentUser> map) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        this.refreshDetail.mo5926a((Boolean) true);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushCommentStatusChanged(String str, Comment comment, Entities entities, Comment.CreateStatus createStatus, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "localCommentId");
        Intrinsics.checkParameterIsNotNull(createStatus, UpdateKey.STATUS);
        if (createStatus == Comment.CreateStatus.SUCCESS) {
            this.refreshDetail.mo5926a((Boolean) true);
        }
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushPostStatusChanged(String str, Post post, Entities entities, Post.CreateStatus createStatus, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "localPostId");
        Intrinsics.checkParameterIsNotNull(createStatus, UpdateKey.STATUS);
        if (createStatus == Post.CreateStatus.SUCCESS) {
            this.refreshDetail.mo5926a((Boolean) true);
        }
    }
}
