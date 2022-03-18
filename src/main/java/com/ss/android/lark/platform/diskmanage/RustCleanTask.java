package com.ss.android.lark.platform.diskmanage;

import com.bytedance.lark.pb.basic.v1.TriggerDataCleanRequest;
import com.bytedance.lark.pb.basic.v1.TriggerDataCleanResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.diskmanage.Biz;
import com.ss.android.lark.diskmanage.CleanResult;
import com.ss.android.lark.diskmanage.DefaultAutoCleanItem;
import com.ss.android.lark.diskmanage.RemoteConfig;
import com.ss.android.lark.diskmanage.clean.IDiskCleanTask;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.p2498r.C51947a;
import com.ss.android.lark.resource.C53138b;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/platform/diskmanage/RustCleanTask;", "Lcom/ss/android/lark/diskmanage/clean/IDiskCleanTask;", "()V", "getBiz", "Lcom/ss/android/lark/diskmanage/Biz;", "getCanManualSize", "", "getDefaultAutoCleanRegistry", "", "Lcom/ss/android/lark/diskmanage/DefaultAutoCleanItem;", "onManualClean", "Lcom/ss/android/lark/diskmanage/CleanResult;", "onRemoteClean", "remoteConfig", "Lcom/ss/android/lark/diskmanage/RemoteConfig;", "performRemoteClean", "", "cleanResult", "Companion", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.platform.h.e */
public final class RustCleanTask implements IDiskCleanTask {

    /* renamed from: a */
    public static final Companion f128765a = new Companion(null);

    @Override // com.ss.android.lark.diskmanage.clean.IDiskCleanTask
    /* renamed from: d */
    public List<DefaultAutoCleanItem> mo135619d() {
        return null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/platform/diskmanage/RustCleanTask$Companion;", "", "()V", "MAX_RETRY_NUM", "", "TAG", "", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.platform.h.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.diskmanage.clean.IDiskCleanTask
    /* renamed from: a */
    public Biz mo135615a() {
        return Biz.RUST;
    }

    @Override // com.ss.android.lark.diskmanage.clean.IDiskCleanTask
    /* renamed from: b */
    public CleanResult mo135617b() {
        CleanResult aVar = new CleanResult(false, 0, null, 7, null);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C53138b a = C51947a.m201491a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ResourceModuleProvider.getModule()");
        a.mo181472a().mo105871a((Integer) 30, (Integer) 30, TriggerDataCleanRequest.CleanType.USER, (IGetDataCallback<TriggerDataCleanResponse>) new C51814c(aVar, countDownLatch));
        countDownLatch.await();
        return aVar;
    }

    @Override // com.ss.android.lark.diskmanage.clean.IDiskCleanTask
    /* renamed from: c */
    public double mo135618c() {
        Ref.DoubleRef doubleRef = new Ref.DoubleRef();
        doubleRef.element = 0.0d;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C53138b a = C51947a.m201491a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ResourceModuleProvider.getModule()");
        a.mo181472a().mo105880b(new C51813b(doubleRef, countDownLatch));
        countDownLatch.await();
        return doubleRef.element;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/platform/diskmanage/RustCleanTask$getCanManualSize$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "sizeInMB", "(Ljava/lang/Float;)V", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.platform.h.e$b */
    public static final class C51813b implements IGetDataCallback<Float> {

        /* renamed from: a */
        final /* synthetic */ Ref.DoubleRef f128766a;

        /* renamed from: b */
        final /* synthetic */ CountDownLatch f128767b;

        /* renamed from: a */
        public void onSuccess(Float f) {
            if (f != null) {
                f.floatValue();
                Log.m165389i("RustCleanTask", "getCanManualSize success");
                this.f128766a.element = (double) (f.floatValue() * 1024.0f * 1024.0f);
            }
            this.f128767b.countDown();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("RustCleanTask", "getCanManualSize error: " + errorResult.getDisplayMsg());
            this.f128766a.element = 0.0d;
            this.f128767b.countDown();
        }

        C51813b(Ref.DoubleRef doubleRef, CountDownLatch countDownLatch) {
            this.f128766a = doubleRef;
            this.f128767b = countDownLatch;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/platform/diskmanage/RustCleanTask$onManualClean$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/basic/v1/TriggerDataCleanResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.platform.h.e$c */
    public static final class C51814c implements IGetDataCallback<TriggerDataCleanResponse> {

        /* renamed from: a */
        final /* synthetic */ CleanResult f128768a;

        /* renamed from: b */
        final /* synthetic */ CountDownLatch f128769b;

        /* renamed from: a */
        public void onSuccess(TriggerDataCleanResponse triggerDataCleanResponse) {
            if (triggerDataCleanResponse != null) {
                Log.m165389i("RustCleanTask", "triggerDataClean success: " + triggerDataCleanResponse);
                CleanResult aVar = this.f128768a;
                aVar.mo135501a(aVar.mo135504b() + ((long) triggerDataCleanResponse.cleaned.size()));
            }
            this.f128769b.countDown();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("RustCleanTask", "triggerDataClean error: " + errorResult.getDisplayMsg());
            this.f128768a.mo135502a(false);
            this.f128769b.countDown();
        }

        C51814c(CleanResult aVar, CountDownLatch countDownLatch) {
            this.f128768a = aVar;
            this.f128769b = countDownLatch;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/platform/diskmanage/RustCleanTask$performRemoteClean$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/basic/v1/TriggerDataCleanResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.platform.h.e$d */
    public static final class C51815d implements IGetDataCallback<TriggerDataCleanResponse> {

        /* renamed from: a */
        final /* synthetic */ CleanResult f128770a;

        /* renamed from: b */
        final /* synthetic */ Ref.BooleanRef f128771b;

        /* renamed from: c */
        final /* synthetic */ CountDownLatch f128772c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165389i("RustCleanTask", "onRemoteClean error: " + errorResult.getDisplayMsg());
            this.f128771b.element = true;
            this.f128770a.mo135502a(false);
            this.f128772c.countDown();
        }

        /* renamed from: a */
        public void onSuccess(TriggerDataCleanResponse triggerDataCleanResponse) {
            List<TriggerDataCleanResponse.Cleaned> list;
            int i;
            Boolean bool;
            Integer num;
            if (!(triggerDataCleanResponse == null || (list = triggerDataCleanResponse.cleaned) == null)) {
                Log.m165389i("RustCleanTask", "onRemoteClean success: " + triggerDataCleanResponse);
                for (TriggerDataCleanResponse.Cleaned cleaned : list) {
                    CleanResult aVar = this.f128770a;
                    long b = aVar.mo135504b();
                    if (cleaned == null || (num = cleaned.bytes) == null) {
                        i = 0;
                    } else {
                        i = num.intValue();
                    }
                    aVar.mo135501a(b + ((long) i));
                    if (cleaned != null) {
                        bool = cleaned.completed;
                    } else {
                        bool = null;
                    }
                    if (!Intrinsics.areEqual((Object) bool, (Object) true)) {
                        this.f128771b.element = true;
                    }
                }
            }
            this.f128770a.mo135502a(true);
            this.f128772c.countDown();
        }

        C51815d(CleanResult aVar, Ref.BooleanRef booleanRef, CountDownLatch countDownLatch) {
            this.f128770a = aVar;
            this.f128771b = booleanRef;
            this.f128772c = countDownLatch;
        }
    }

    @Override // com.ss.android.lark.diskmanage.clean.IDiskCleanTask
    /* renamed from: a */
    public CleanResult mo135616a(RemoteConfig dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "remoteConfig");
        CleanResult aVar = new CleanResult(false, 0, null, 7, null);
        int i = 0;
        while (true) {
            if (i < 3) {
                if (!m200864a(dVar, aVar)) {
                    Log.m165389i("RustCleanTask", "finish remote clean");
                    break;
                }
                Log.m165389i("RustCleanTask", "retry perform remote clean");
                i++;
            } else {
                break;
            }
        }
        return aVar;
    }

    /* renamed from: a */
    private final boolean m200864a(RemoteConfig dVar, CleanResult aVar) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = false;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        int c = (int) dVar.mo135639a().mo135568c();
        C53138b a = C51947a.m201491a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ResourceModuleProvider.getModule()");
        a.mo181472a().mo105871a(Integer.valueOf(c), Integer.valueOf((int) dVar.mo135639a().mo135566b()), TriggerDataCleanRequest.CleanType.AUTO, new C51815d(aVar, booleanRef, countDownLatch));
        countDownLatch.await();
        return booleanRef.element;
    }
}
