package com.ss.android.lark.moments.impl.nickname;

import androidx.lifecycle.C1143ag;
import androidx.lifecycle.C1177w;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.moments.impl.common.BaseViewModel;
import com.ss.android.lark.moments.impl.rustadapter.service.MomentsPassThroughService;
import com.ss.android.lark.pb.moments_entities.AnonymousNickname;
import com.ss.android.lark.pb.moments_entities.MomentUser;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010&\u001a\u00020'J\u0006\u0010(\u001a\u00020'J\u0006\u0010)\u001a\u00020'J\u0006\u0010*\u001a\u00020'J\u000e\u0010+\u001a\u00020'2\u0006\u0010\u0011\u001a\u00020\tJ\u0010\u0010,\u001a\u00020'2\b\u0010-\u001a\u0004\u0018\u00010.R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u001b\u0010\u000b\u001a\u00020\f8TX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0007R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007R\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0007R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0007R\u001c\u0010!\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006/"}, d2 = {"Lcom/ss/android/lark/moments/impl/nickname/NickIdentityChooseViewModel;", "Lcom/ss/android/lark/moments/impl/common/BaseViewModel;", "()V", "createFailToastStr", "Landroidx/lifecycle/MutableLiveData;", "", "getCreateFailToastStr", "()Landroidx/lifecycle/MutableLiveData;", "createNicknameUserSuccessFromReaction", "", "getCreateNicknameUserSuccessFromReaction", "dispatcher", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "dispatcher$delegate", "Lkotlin/Lazy;", "fromReaction", "loadInitDataIsSuccess", "getLoadInitDataIsSuccess", "momentUser", "Lcom/ss/android/lark/pb/moments_entities/MomentUser;", "getMomentUser", "nickAvatarKey", "getNickAvatarKey", "nickAvatarLoadFail", "getNickAvatarLoadFail", "nicknames", "", "Lcom/ss/android/lark/pb/moments_entities/AnonymousNickname;", "getNicknames", "nicknamesLoadFail", "getNicknamesLoadFail", "selectedAnonymousNickname", "getSelectedAnonymousNickname", "()Lcom/ss/android/lark/pb/moments_entities/AnonymousNickname;", "setSelectedAnonymousNickname", "(Lcom/ss/android/lark/pb/moments_entities/AnonymousNickname;)V", "createNickNameUser", "", "loadInitData", "pullNicknameAvatar", "pullNicknames", "setFromClickReaction", "setSelectedName", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/moments/impl/nickname/NicknameItemViewData;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.nickname.b */
public final class NickIdentityChooseViewModel extends BaseViewModel {
    private final C1177w<String> createFailToastStr = new C1177w<>();
    private final C1177w<Boolean> createNicknameUserSuccessFromReaction = new C1177w<>();
    private final Lazy dispatcher$delegate = LazyKt.lazy(C47778b.INSTANCE);
    public boolean fromReaction;
    private final C1177w<Boolean> loadInitDataIsSuccess = new C1177w<>();
    private final C1177w<MomentUser> momentUser = new C1177w<>();
    private final C1177w<String> nickAvatarKey = new C1177w<>();
    private final C1177w<Boolean> nickAvatarLoadFail = new C1177w<>();
    private final C1177w<List<AnonymousNickname>> nicknames = new C1177w<>();
    private final C1177w<Boolean> nicknamesLoadFail = new C1177w<>();
    private AnonymousNickname selectedAnonymousNickname;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.moments.impl.common.BaseViewModel
    public ExecutorCoroutineDispatcher getDispatcher() {
        return (ExecutorCoroutineDispatcher) this.dispatcher$delegate.getValue();
    }

    public final C1177w<String> getCreateFailToastStr() {
        return this.createFailToastStr;
    }

    public final C1177w<Boolean> getCreateNicknameUserSuccessFromReaction() {
        return this.createNicknameUserSuccessFromReaction;
    }

    public final C1177w<Boolean> getLoadInitDataIsSuccess() {
        return this.loadInitDataIsSuccess;
    }

    public final C1177w<MomentUser> getMomentUser() {
        return this.momentUser;
    }

    public final C1177w<String> getNickAvatarKey() {
        return this.nickAvatarKey;
    }

    public final C1177w<Boolean> getNickAvatarLoadFail() {
        return this.nickAvatarLoadFail;
    }

    public final C1177w<List<AnonymousNickname>> getNicknames() {
        return this.nicknames;
    }

    public final C1177w<Boolean> getNicknamesLoadFail() {
        return this.nicknamesLoadFail;
    }

    public final AnonymousNickname getSelectedAnonymousNickname() {
        return this.selectedAnonymousNickname;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.nickname.b$b */
    static final class C47778b extends Lambda implements Function0<ExecutorCoroutineDispatcher> {
        public static final C47778b INSTANCE = new C47778b();

        C47778b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ExecutorCoroutineDispatcher invoke() {
            ExecutorService newSerialIODensityThreadPool = CoreThreadPool.getDefault().newSerialIODensityThreadPool("lk-moment-choose-nick-identity");
            Intrinsics.checkExpressionValueIsNotNull(newSerialIODensityThreadPool, "CoreThreadPool.getDefaul…nt-choose-nick-identity\")");
            return bl.m266382a(newSerialIODensityThreadPool);
        }
    }

    public final void createNickNameUser() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47777a(this, null), 2, null);
    }

    public final void loadInitData() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47779c(this, null), 2, null);
    }

    public final void pullNicknameAvatar() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47780d(this, null), 2, null);
    }

    public final void pullNicknames() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47781e(this, null), 2, null);
    }

    public final void setFromClickReaction(boolean z) {
        this.fromReaction = z;
    }

    public final void setSelectedAnonymousNickname(AnonymousNickname anonymousNickname) {
        this.selectedAnonymousNickname = anonymousNickname;
    }

    public final void setSelectedName(NicknameItemViewData dVar) {
        if (dVar != null) {
            this.selectedAnonymousNickname = new AnonymousNickname(dVar.mo167501a(), dVar.mo167503b(), Integer.valueOf(dVar.mo167504c()));
        } else {
            this.selectedAnonymousNickname = null;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.nickname.NickIdentityChooseViewModel$pullNicknameAvatar$1", mo239173f = "NickIdentityChooseViewModel.kt", mo239174i = {0}, mo239175l = {69}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.nickname.b$d */
    public static final class C47780d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ NickIdentityChooseViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47780d(NickIdentityChooseViewModel bVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47780d dVar = new C47780d(this.this$0, cVar);
            dVar.p$ = (CoroutineScope) obj;
            return dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47780d) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                MomentsPassThroughService aVar = MomentsPassThroughService.f120127a;
                this.L$0 = ahVar;
                this.label = 1;
                obj = aVar.mo167201c(this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = (String) obj;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.this$0.getNickAvatarKey().mo5926a(str);
            } else {
                this.this$0.getNickAvatarLoadFail().mo5926a(C69089a.m265837a(true));
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.nickname.NickIdentityChooseViewModel$pullNicknames$1", mo239173f = "NickIdentityChooseViewModel.kt", mo239174i = {0}, mo239175l = {58}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.nickname.b$e */
    public static final class C47781e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ NickIdentityChooseViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47781e(NickIdentityChooseViewModel bVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47781e eVar = new C47781e(this.this$0, cVar);
            eVar.p$ = (CoroutineScope) obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47781e) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                MomentsPassThroughService aVar = MomentsPassThroughService.f120127a;
                this.L$0 = ahVar;
                this.label = 1;
                obj = aVar.mo167199b(this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List<AnonymousNickname> list = (List) obj;
            List<AnonymousNickname> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.this$0.getNicknames().mo5926a(list);
            } else {
                this.this$0.getNicknamesLoadFail().mo5926a(C69089a.m265837a(true));
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.nickname.NickIdentityChooseViewModel$loadInitData$1", mo239173f = "NickIdentityChooseViewModel.kt", mo239174i = {0, 1, 1}, mo239175l = {43, 44}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch", "avatarKey"}, mo239178s = {"L$0", "L$0", "L$1"})
    /* renamed from: com.ss.android.lark.moments.impl.nickname.b$c */
    public static final class C47779c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ NickIdentityChooseViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47779c(NickIdentityChooseViewModel bVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47779c cVar2 = new C47779c(this.this$0, cVar);
            cVar2.p$ = (CoroutineScope) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47779c) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
            // Method dump skipped, instructions count: 171
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.nickname.NickIdentityChooseViewModel.C47779c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.nickname.NickIdentityChooseViewModel$createNickNameUser$1", mo239173f = "NickIdentityChooseViewModel.kt", mo239174i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2}, mo239175l = {82, 87, 96}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "avatarKey", "nickname", "$this$launch", "avatarKey", "nickname", "circleId", "$this$launch", "avatarKey", "nickname", "circleId", "response"}, mo239178s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4"})
    /* renamed from: com.ss.android.lark.moments.impl.nickname.b$a */
    public static final class C47777a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ NickIdentityChooseViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47777a(NickIdentityChooseViewModel bVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47777a aVar = new C47777a(this.this$0, cVar);
            aVar.p$ = (CoroutineScope) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47777a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x00f1  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
            // Method dump skipped, instructions count: 312
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.nickname.NickIdentityChooseViewModel.C47777a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
