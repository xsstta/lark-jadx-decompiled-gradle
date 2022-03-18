package com.ss.android.lark.todo.impl.features.common.share.helper;

import android.text.TextUtils;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.lark.pb.todo.v1.ShareTodoMessageRequest;
import com.bytedance.lark.pb.todo.v1.ShareTodoMessageResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.common.share.entity.ShareEntity;
import com.ss.android.lark.todo.impl.features.common.share.entity.ShareStatus;
import com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0007\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u0006H\u0002JD\u0010\u000e\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0013j\b\u0012\u0004\u0012\u00020\u0006`\u00142\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017J$\u0010\u0018\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/common/share/helper/ShareProcess;", "", "()V", "FORBIDDEN_SPEECH_ERROR_CODE", "", "TAG", "", "sendShareComment", "", "chatId2messageIds", "", "message2threads", "Lcom/bytedance/lark/pb/todo/v1/ShareTodoMessageResponse$Share2ThreadTarget;", Comment.f24093e, "shareTodo", "shareEntity", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/lark/todo/impl/features/common/share/entity/ShareEntity;", "chatIds", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "guid", "viewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "showFailedChatToast", "failedChats", "", "Lcom/bytedance/lark/pb/todo/v1/ShareTodoMessageResponse$ShareFailedChat;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.common.share.a.a */
public final class ShareProcess {

    /* renamed from: a */
    public static final ShareProcess f139407a = new ShareProcess();

    private ShareProcess() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.common.share.helper.ShareProcess$shareTodo$1", mo239173f = "ShareProcess.kt", mo239174i = {0}, mo239175l = {45}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.common.share.a.a$a */
    static final class C56338a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $apiName;
        final /* synthetic */ ArrayList $chatIds;
        final /* synthetic */ String $comment;
        final /* synthetic */ String $contextId;
        final /* synthetic */ String $guid;
        final /* synthetic */ C1177w $shareEntity;
        Object L$0;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56338a(String str, ArrayList arrayList, String str2, String str3, C1177w wVar, String str4, Continuation cVar) {
            super(2, cVar);
            this.$guid = str;
            this.$chatIds = arrayList;
            this.$contextId = str2;
            this.$apiName = str3;
            this.$shareEntity = wVar;
            this.$comment = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56338a aVar = new C56338a(this.$guid, this.$chatIds, this.$contextId, this.$apiName, this.$shareEntity, this.$comment, cVar);
            aVar.p$ = (CoroutineScope) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56338a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z;
            Object a = C69086a.m265828a();
            int i = this.label;
            boolean z2 = true;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                ShareTodoMessageRequest.ShareType shareType = ShareTodoMessageRequest.ShareType.SHARE;
                this.L$0 = ahVar;
                this.label = 1;
                obj = TodoRustCRUD.f141115a.mo194308a(this.$guid, this.$chatIds, shareType, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ShareTodoMessageResponse shareTodoMessageResponse = (ShareTodoMessageResponse) obj;
            if (shareTodoMessageResponse != null) {
                Log.m165389i("ShareProcess", LogMessageUtil.f139260a.mo191768a(this.$contextId, this.$apiName, new String[0]));
                List<ShareTodoMessageResponse.ShareFailedChat> list = shareTodoMessageResponse.failed_chats;
                if (list == null || list.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.$shareEntity.mo5926a(new ShareEntity(ShareStatus.SHARE_SUCCESS, null, 2, null));
                } else {
                    ShareProcess aVar = ShareProcess.f139407a;
                    C1177w<ShareEntity> wVar = this.$shareEntity;
                    List<ShareTodoMessageResponse.ShareFailedChat> list2 = shareTodoMessageResponse.failed_chats;
                    Intrinsics.checkExpressionValueIsNotNull(list2, "it.failed_chats");
                    aVar.mo192006a(wVar, list2);
                }
                if (this.$comment.length() <= 0) {
                    z2 = false;
                }
                if (z2) {
                    ShareProcess.f139407a.mo192007a(shareTodoMessageResponse.chat_id2message_ids, shareTodoMessageResponse.message2threads, this.$comment);
                }
            } else {
                Log.m165383e("ShareProcess", LogMessageUtil.f139260a.mo191766a(this.$contextId, this.$apiName, new ErrorResult("")));
                this.$shareEntity.mo5926a(new ShareEntity(ShareStatus.SHARE_FAILURE, null, 2, null));
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public final void mo192006a(C1177w<ShareEntity> wVar, List<ShareTodoMessageResponse.ShareFailedChat> list) {
        wVar.mo5926a(new ShareEntity(ShareStatus.NO_LOADING, null, 2, null));
        StringBuilder sb = new StringBuilder();
        String c = ResUtil.f139261a.mo191781c(R.string.Todo_Common_DivideSymbol);
        boolean z = false;
        for (ShareTodoMessageResponse.ShareFailedChat shareFailedChat : list) {
            Integer num = shareFailedChat.error_code;
            if (num != null && num.intValue() == 4042) {
                if (z) {
                    sb.append(c);
                }
                sb.append(shareFailedChat.chat_name);
                z = true;
            }
        }
        if (z) {
            ShareStatus shareStatus = ShareStatus.SHARE_FAILURE;
            ResUtil eVar = ResUtil.f139261a;
            String sb2 = sb.toString();
            Intrinsics.checkExpressionValueIsNotNull(sb2, "restrictionGroups.toString()");
            wVar.mo5926a(new ShareEntity(shareStatus, eVar.mo191778a(R.string.Todo_Task_RestrictionContent, "group_name", sb2)));
            return;
        }
        wVar.mo5926a(new ShareEntity(ShareStatus.SHARE_FAILURE, null, 2, null));
    }

    /* renamed from: a */
    public final void mo192007a(Map<String, String> map, Map<String, ShareTodoMessageResponse.Share2ThreadTarget> map2, String str) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        if (map2 != null) {
            for (Map.Entry<String, ShareTodoMessageResponse.Share2ThreadTarget> entry : map2.entrySet()) {
                String key = entry.getKey();
                String str2 = entry.getValue().channel_id;
                if (str2 == null) {
                    str2 = "";
                }
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(str2) && !arrayList.contains(str2)) {
                    hashMap.put(str2, key);
                    arrayList.add(str2);
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        if (map != null) {
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                if (!TextUtils.isEmpty(entry2.getKey()) && !TextUtils.isEmpty(entry2.getValue()) && !arrayList.contains(entry2.getKey())) {
                    hashMap2.put(entry2.getKey(), entry2.getValue());
                    arrayList.add(entry2.getKey());
                }
            }
        }
        TodoDependencyHolder.f139242a.mo191730a().chatModuleDependency().mo145377a(str, hashMap2, hashMap);
    }

    /* renamed from: a */
    public final void mo192005a(C1177w<ShareEntity> wVar, ArrayList<String> arrayList, String str, String str2, CoroutineScope ahVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "shareEntity");
        Intrinsics.checkParameterIsNotNull(arrayList, "chatIds");
        Intrinsics.checkParameterIsNotNull(str, Comment.f24093e);
        Intrinsics.checkParameterIsNotNull(str2, "guid");
        Intrinsics.checkParameterIsNotNull(ahVar, "viewModelScope");
        if (!arrayList.isEmpty()) {
            wVar.mo5929b(new ShareEntity(ShareStatus.SHARE_LOADING, null, 2, null));
            String valueOf = String.valueOf(new Date().getTime());
            String valueOf2 = String.valueOf(arrayList.size());
            Log.m165389i("ShareProcess", LogMessageUtil.f139260a.mo191770b(valueOf, "shareTodo", "chat_ids_size", valueOf2, "todoId", str2));
            Job unused = C69553g.m266944a(ahVar, Dispatchers.m266326d(), null, new C56338a(str2, arrayList, valueOf, "shareTodo", wVar, str, null), 2, null);
        }
    }
}
