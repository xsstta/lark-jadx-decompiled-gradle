package com.ss.android.lark.moments.impl.personal.follow.viewmodel;

import androidx.lifecycle.C1143ag;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.moments.impl.common.BaseViewModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.bl;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058TX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0011X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R0\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00170\u001aj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0017`\u001bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006$"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/follow/viewmodel/MomentsFollowBaseVM;", "Lcom/ss/android/lark/moments/impl/common/BaseViewModel;", "Lcom/ss/android/lark/moments/impl/personal/follow/viewmodel/IMomentsFollowVM;", "()V", "dispatcher", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "dispatcher$delegate", "Lkotlin/Lazy;", "pageToken", "", "getPageToken", "()Ljava/lang/String;", "setPageToken", "(Ljava/lang/String;)V", "toastResId", "Landroidx/lifecycle/MutableLiveData;", "", "getToastResId", "()Landroidx/lifecycle/MutableLiveData;", "userList", "", "Lcom/ss/android/lark/moments/impl/personal/follow/viewmodel/FollowMomentUser;", "getUserList", "userListData", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "getUserListData", "()Ljava/util/LinkedHashMap;", "changeFollowState", "", "user", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "hasNextUserPage", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.personal.follow.a.c */
public abstract class MomentsFollowBaseVM extends BaseViewModel implements IMomentsFollowVM {
    private final Lazy dispatcher$delegate = LazyKt.lazy(C47857b.INSTANCE);
    private String pageToken = "";
    private final C1177w<Integer> toastResId = new C1177w<>();
    private final C1177w<List<FollowMomentUser>> userList = new C1177w<>();
    private final LinkedHashMap<String, FollowMomentUser> userListData = new LinkedHashMap<>();

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.moments.impl.common.BaseViewModel
    public ExecutorCoroutineDispatcher getDispatcher() {
        return (ExecutorCoroutineDispatcher) this.dispatcher$delegate.getValue();
    }

    /* access modifiers changed from: protected */
    public final String getPageToken() {
        return this.pageToken;
    }

    @Override // com.ss.android.lark.moments.impl.personal.follow.viewmodel.IMomentsFollowVM
    public C1177w<Integer> getToastResId() {
        return this.toastResId;
    }

    @Override // com.ss.android.lark.moments.impl.personal.follow.viewmodel.IMomentsFollowVM
    public C1177w<List<FollowMomentUser>> getUserList() {
        return this.userList;
    }

    /* access modifiers changed from: protected */
    public final LinkedHashMap<String, FollowMomentUser> getUserListData() {
        return this.userListData;
    }

    @Override // com.ss.android.lark.moments.impl.personal.follow.viewmodel.IMomentsFollowVM
    public boolean hasNextUserPage() {
        return !StringsKt.isBlank(this.pageToken);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.follow.a.c$b */
    static final class C47857b extends Lambda implements Function0<ExecutorCoroutineDispatcher> {
        public static final C47857b INSTANCE = new C47857b();

        C47857b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ExecutorCoroutineDispatcher invoke() {
            ExecutorService newSerialIODensityThreadPool = CoreThreadPool.getDefault().newSerialIODensityThreadPool("lk-moment-follow");
            Intrinsics.checkExpressionValueIsNotNull(newSerialIODensityThreadPool, "CoreThreadPool.getDefaul…dPool(\"lk-moment-follow\")");
            return bl.m266382a(newSerialIODensityThreadPool);
        }
    }

    /* access modifiers changed from: protected */
    public final void setPageToken(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.pageToken = str;
    }

    @Override // com.ss.android.lark.moments.impl.personal.follow.viewmodel.IMomentsFollowVM
    public void changeFollowState(MomentUser momentUser) {
        Intrinsics.checkParameterIsNotNull(momentUser, "user");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47856a(this, momentUser, null), 2, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.personal.follow.viewmodel.MomentsFollowBaseVM$changeFollowState$1", mo239173f = "MomentsFollowBaseVM.kt", mo239174i = {0, 1}, mo239175l = {35, 37}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch"}, mo239178s = {"L$0", "L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.personal.follow.a.c$a */
    static final class C47856a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MomentUser $user;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsFollowBaseVM this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47856a(MomentsFollowBaseVM cVar, MomentUser momentUser, Continuation cVar2) {
            super(2, cVar2);
            this.this$0 = cVar;
            this.$user = momentUser;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47856a aVar = new C47856a(this.this$0, this.$user, cVar);
            aVar.p$ = (CoroutineScope) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47856a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0079  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0099  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00de  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00ec  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
            // Method dump skipped, instructions count: 290
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.personal.follow.viewmodel.MomentsFollowBaseVM.C47856a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
