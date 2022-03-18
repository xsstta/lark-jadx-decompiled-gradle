package com.ss.android.lark.edu.util;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eJ\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bJ\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0006H\u0002J\u0015\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0014J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0018\u001a\u00020\tJ \u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005R\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/edu/util/CallBackBuilder;", "T", "", "()V", "error", "Lkotlin/Function1;", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "", "executeOnMainThread", "", "finally", "Lkotlin/Function0;", "success", "build", "Lcom/larksuite/framework/callback/IGetDataCallback;", "callback", "invokeFailed", "err", "invokeSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Object;)V", "onError", "failed", "onMainThread", "value", "onSuccess", "features_edu_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.edu.d.a */
public final class CallBackBuilder<T> {

    /* renamed from: a */
    public boolean f94992a;

    /* renamed from: b */
    private Function1<? super T, Unit> f94993b;

    /* renamed from: c */
    private Function1<? super ErrorResult, Unit> f94994c;

    /* renamed from: d */
    private Function0<Unit> f94995d;

    /* renamed from: a */
    public final IGetDataCallback<T> mo136377a() {
        return new C36954a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0015\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"com/ss/android/lark/edu/util/CallBackBuilder$build$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Object;)V", "features_edu_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.d.a$a */
    public static final class C36954a implements IGetDataCallback<T> {

        /* renamed from: a */
        final /* synthetic */ CallBackBuilder f94996a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "run"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.edu.d.a$a$a */
        public static final class RunnableC36955a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C36954a f94997a;

            /* renamed from: b */
            final /* synthetic */ ErrorResult f94998b;

            RunnableC36955a(C36954a aVar, ErrorResult errorResult) {
                this.f94997a = aVar;
                this.f94998b = errorResult;
            }

            public final void run() {
                this.f94997a.f94996a.mo136381a(this.f94998b);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "run"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.edu.d.a$a$b */
        static final class RunnableC36956b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C36954a f94999a;

            /* renamed from: b */
            final /* synthetic */ Object f95000b;

            RunnableC36956b(C36954a aVar, Object obj) {
                this.f94999a = aVar;
                this.f95000b = obj;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.ss.android.lark.edu.d.a */
            /* JADX WARN: Multi-variable type inference failed */
            public final void run() {
                this.f94999a.f94996a.mo136382a(this.f95000b);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36954a(CallBackBuilder aVar) {
            this.f94996a = aVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            if (this.f94996a.f94992a) {
                UICallbackExecutor.execute(new RunnableC36955a(this, errorResult));
            } else {
                this.f94996a.mo136381a(errorResult);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public void onSuccess(T t) {
            if (this.f94996a.f94992a) {
                UICallbackExecutor.execute(new RunnableC36956b(this, t));
            } else {
                this.f94996a.mo136382a((Object) t);
            }
        }
    }

    /* renamed from: a */
    public final CallBackBuilder<T> mo136378a(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "callback");
        CallBackBuilder<T> aVar = this;
        aVar.f94995d = function0;
        return aVar;
    }

    /* renamed from: b */
    public final CallBackBuilder<T> mo136383b(Function1<? super ErrorResult, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "failed");
        CallBackBuilder<T> aVar = this;
        aVar.f94994c = function1;
        return aVar;
    }

    /* renamed from: a */
    public final CallBackBuilder<T> mo136379a(Function1<? super T, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "success");
        CallBackBuilder<T> aVar = this;
        aVar.f94993b = function1;
        return aVar;
    }

    /* renamed from: a */
    public final CallBackBuilder<T> mo136380a(boolean z) {
        CallBackBuilder<T> aVar = this;
        aVar.f94992a = z;
        return aVar;
    }

    /* renamed from: a */
    public final void mo136381a(ErrorResult errorResult) {
        Function1<? super ErrorResult, Unit> function1 = this.f94994c;
        if (function1 != null) {
            function1.invoke(errorResult);
        }
        Function0<Unit> function0 = this.f94995d;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* renamed from: a */
    public final void mo136382a(T t) {
        Function1<? super T, Unit> function1 = this.f94993b;
        if (function1 != null) {
            function1.invoke(t);
        }
        Function0<Unit> function0 = this.f94995d;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
