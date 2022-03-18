package com.ss.android.lark.moments.impl.personal.follow.viewmodel;

import androidx.lifecycle.C1143ag;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.moments.v1.Entities;
import com.bytedance.lark.pb.moments.v1.Follower;
import com.bytedance.lark.pb.moments.v1.ListUserFollowersResponse;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.ss.android.lark.moments.impl.rustadapter.service.MomentsSDKService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/follow/viewmodel/MomentsFollowersListVM;", "Lcom/ss/android/lark/moments/impl/personal/follow/viewmodel/MomentsFollowBaseVM;", "Lcom/ss/android/lark/moments/impl/personal/follow/viewmodel/IMomentsFollowVM;", "()V", "getUserList", "", "userId", "", "count", "", "refreshUserList", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.personal.follow.a.d */
public final class MomentsFollowersListVM extends MomentsFollowBaseVM implements IMomentsFollowVM {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.personal.follow.viewmodel.MomentsFollowersListVM$getUserList$1", mo239173f = "MomentsFollowersListVM.kt", mo239174i = {0}, mo239175l = {18}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.personal.follow.a.d$a */
    public static final class C47858a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $count;
        final /* synthetic */ String $userId;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsFollowersListVM this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47858a(MomentsFollowersListVM dVar, String str, int i, Continuation cVar) {
            super(2, cVar);
            this.this$0 = dVar;
            this.$userId = str;
            this.$count = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47858a aVar = new C47858a(this.this$0, this.$userId, this.$count, cVar);
            aVar.p$ = (CoroutineScope) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47858a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Entities entities;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                MomentsSDKService bVar = MomentsSDKService.f120147a;
                String pageToken = this.this$0.getPageToken();
                String str = this.$userId;
                int i2 = this.$count;
                this.L$0 = ahVar;
                this.label = 1;
                obj = bVar.mo167245c(pageToken, str, i2, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ListUserFollowersResponse listUserFollowersResponse = (ListUserFollowersResponse) obj;
            Map<String, MomentUser> map = (listUserFollowersResponse == null || (entities = listUserFollowersResponse.entities) == null) ? null : entities.users;
            List<Follower> list = listUserFollowersResponse != null ? listUserFollowersResponse.followers : null;
            if (map == null || list == null) {
                return Unit.INSTANCE;
            }
            MomentsFollowersListVM dVar = this.this$0;
            String str2 = listUserFollowersResponse.next_page_token;
            Intrinsics.checkExpressionValueIsNotNull(str2, "response.next_page_token");
            dVar.setPageToken(str2);
            ArrayList<MomentUser> arrayList = new ArrayList();
            for (Follower follower : list) {
                MomentUser momentUser = map.get(follower.user_id);
                if (momentUser != null) {
                    arrayList.add(momentUser);
                }
            }
            for (MomentUser momentUser2 : arrayList) {
                String str3 = momentUser2.user_id;
                Intrinsics.checkExpressionValueIsNotNull(str3, "it.user_id");
                this.this$0.getUserListData().put(str3, new FollowMomentUser(momentUser2, false, 2, null));
            }
            C1177w userList = this.this$0.getUserList();
            Collection<FollowMomentUser> values = this.this$0.getUserListData().values();
            Intrinsics.checkExpressionValueIsNotNull(values, "userListData.values");
            userList.mo5926a(CollectionsKt.toList(values));
            return Unit.INSTANCE;
        }
    }

    @Override // com.ss.android.lark.moments.impl.personal.follow.viewmodel.IMomentsFollowVM
    public void getUserList(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47858a(this, str, i, null), 2, null);
    }

    @Override // com.ss.android.lark.moments.impl.personal.follow.viewmodel.IMomentsFollowVM
    public void refreshUserList(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        setPageToken("");
        getUserListData().clear();
        getUserList(str, i);
    }
}
