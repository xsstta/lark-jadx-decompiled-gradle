package com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.applink;

import android.content.Context;
import android.net.Uri;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.rucket.job.RucketJob;
import com.larksuite.rucket.job.base.RucketResult;
import com.larksuite.rucket.job.compat.RucketLauncher;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.C34456a;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingExtraParams;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.log.Log;
import java.lang.ref.WeakReference;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001c\u0010\u000e\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/applink/ApplyGroupLimitAppLinkHandler;", "Lcom/ss/android/lark/applink/AppLinkHandler;", "Lkotlinx/coroutines/CoroutineScope;", "()V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "canOpen", "", "context", "Landroid/content/Context;", "appLink", "Lcom/ss/android/lark/applink/AppLink;", "handle", "needBackToLark", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.a.a */
public final class ApplyGroupLimitAppLinkHandler extends AbstractC29186b implements CoroutineScope {

    /* renamed from: a */
    public static final Companion f89782a = new Companion(null);

    /* renamed from: b */
    private final CoroutineContext f89783b = Dispatchers.m266324b();

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: a */
    public boolean mo103482a() {
        return false;
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: d */
    public boolean mo103484d(Context context, AppLink appLink) {
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/applink/ApplyGroupLimitAppLinkHandler$Companion;", "", "()V", "PATH", "", "QUERY", "TAG", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f89783b;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.applink.ApplyGroupLimitAppLinkHandler$handle$1", mo239173f = "ApplyGroupLimitAppLinkHandler.kt", mo239174i = {0}, mo239175l = {47}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.a.a$b */
    public static final class C34749b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chatId;
        final /* synthetic */ WeakReference $contextRef;
        Object L$0;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34749b(String str, WeakReference weakReference, Continuation cVar) {
            super(2, cVar);
            this.$chatId = str;
            this.$contextRef = weakReference;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C34749b bVar = new C34749b(this.$chatId, this.$contextRef, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C34749b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.a.a$b$a */
        public static final class C34750a extends Lambda implements Function1<IGetDataCallback<Chat>, Unit> {
            final /* synthetic */ C34749b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34750a(C34749b bVar) {
                super(1);
                this.this$0 = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IGetDataCallback<Chat> iGetDataCallback) {
                invoke(iGetDataCallback);
                return Unit.INSTANCE;
            }

            public final void invoke(IGetDataCallback<Chat> iGetDataCallback) {
                Intrinsics.checkParameterIsNotNull(iGetDataCallback, "it");
                AbstractC34461c a = ChatSettingModule.m133639a();
                Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
                a.mo127274d().mo127365c(this.this$0.$chatId, iGetDataCallback);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                RucketJob a2 = RucketLauncher.m95449a(new C34750a(this));
                this.L$0 = ahVar;
                this.label = 1;
                obj = a2.mo93484a(this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RucketResult bVar = (RucketResult) obj;
            Context context = (Context) this.$contextRef.get();
            if ((bVar instanceof RucketResult.Error) || context == null) {
                Log.m165389i("ApplyGroupLimitAppLinkHandler", "handle: get Chat failed.");
                return Unit.INSTANCE;
            }
            C34456a.m133684b(context, (Chat) bVar.mo93490a());
            ChatSettingHitPointNew.m136654o(ChatSettingExtraParams.Click.APPLY_PERMISSION.plus(ChatSettingExtraParams.Target.IM_CHAT_MEMBER_TOPLIMIT_APPLY_VIEW));
            return Unit.INSTANCE;
        }
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: c */
    public boolean mo103483c(Context context, AppLink appLink) {
        boolean z;
        if (!(context == null || appLink == null)) {
            String queryParameter = Uri.parse(appLink.mo103435a()).getQueryParameter("chat_id");
            Log.m165389i("ApplyGroupLimitAppLinkHandler", "handle: appLink " + appLink.mo103435a() + " , chat id " + queryParameter);
            String str = queryParameter;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return false;
            }
            Job unused = C69553g.m266944a(this, null, null, new C34749b(queryParameter, new WeakReference(context), null), 3, null);
        }
        return true;
    }
}
