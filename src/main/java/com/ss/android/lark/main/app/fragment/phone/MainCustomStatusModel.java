package com.ss.android.lark.main.app.fragment.phone;

import com.bytedance.lark.pb.basic.v1.Chatter;
import com.google.firebase.messaging.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.interfaces.AbstractC44499a;
import com.ss.android.lark.main.interfaces.AbstractC44500b;
import com.ss.android.lark.main.interfaces.IChatterPushListener;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import com.ss.android.lark.main.p2231a.AbstractC44177c;
import com.ss.android.lark.newemoji.EmojiMapManager;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\n\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/main/app/fragment/phone/MainCustomStatusModel;", "", "updater", "Lcom/ss/android/lark/main/app/fragment/phone/MainCustomStatusModel$ICustomStatusUpdater;", "(Lcom/ss/android/lark/main/app/fragment/phone/MainCustomStatusModel$ICustomStatusUpdater;)V", "accountChangeListener", "Lcom/ss/android/lark/main/interfaces/IAccountChangeListener;", "backToFrontListener", "Lcom/ss/android/lark/main/interfaces/IBackToFrontEventListener;", "chatterPushListener", "com/ss/android/lark/main/app/fragment/phone/MainCustomStatusModel$chatterPushListener$1", "Lcom/ss/android/lark/main/app/fragment/phone/MainCustomStatusModel$chatterPushListener$1;", "currentStatus", "Lcom/bytedance/lark/pb/basic/v1/Chatter$ChatterCustomStatus;", "getCurrentStatus", "()Lcom/bytedance/lark/pb/basic/v1/Chatter$ChatterCustomStatus;", "loadReactionCallback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "statusList", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "fetchChatterData", "", "init", "unInit", "updateIfNeed", "Companion", "ICustomStatusUpdater", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.main.app.fragment.phone.a */
public final class MainCustomStatusModel {

    /* renamed from: c */
    public static final Companion f112345c = new Companion(null);

    /* renamed from: a */
    public final ConcurrentLinkedQueue<Chatter.ChatterCustomStatus> f112346a = new ConcurrentLinkedQueue<>();

    /* renamed from: b */
    public final ICustomStatusUpdater f112347b;

    /* renamed from: d */
    private IGetDataCallback<Boolean> f112348d;

    /* renamed from: e */
    private final C44298e f112349e = new C44298e(this);

    /* renamed from: f */
    private final AbstractC44500b f112350f = new C44297d(this);

    /* renamed from: g */
    private final AbstractC44499a f112351g = new C44296c(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/main/app/fragment/phone/MainCustomStatusModel$ICustomStatusUpdater;", "", "updateCustomStatus", "", "icon", "Landroid/graphics/drawable/Drawable;", "title", "", "iconKey", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.fragment.phone.a$b */
    public interface ICustomStatusUpdater {
        /* renamed from: a */
        void mo157409a(String str, String str2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/main/app/fragment/phone/MainCustomStatusModel$Companion;", "", "()V", "TAG", "", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.fragment.phone.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onAccountChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.fragment.phone.a$c */
    static final class C44296c implements AbstractC44499a {

        /* renamed from: a */
        final /* synthetic */ MainCustomStatusModel f112352a;

        C44296c(MainCustomStatusModel aVar) {
            this.f112352a = aVar;
        }

        @Override // com.ss.android.lark.main.interfaces.AbstractC44499a
        /* renamed from: a */
        public final void mo157172a() {
            this.f112352a.mo157407c();
        }
    }

    /* renamed from: e */
    private final Chatter.ChatterCustomStatus m175776e() {
        AbstractC44136a a = C44134a.m174959a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MainModule.getDependency()");
        return a.mo133250f().mo133310a(CollectionsKt.toList(this.f112346a));
    }

    /* renamed from: c */
    public final void mo157407c() {
        AbstractC44136a a = C44134a.m174959a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MainModule.getDependency()");
        a.mo133260p().mo133359a(this.f112349e);
    }

    /* renamed from: a */
    public final void mo157405a() {
        AbstractC44136a a = C44134a.m174959a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MainModule.getDependency()");
        AbstractC44177c N = a.mo133194N();
        N.mo133385a(this.f112349e);
        N.mo133384a(this.f112350f);
        N.mo133383a(this.f112351g);
        mo157407c();
    }

    /* renamed from: b */
    public final void mo157406b() {
        AbstractC44136a a = C44134a.m174959a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MainModule.getDependency()");
        AbstractC44177c N = a.mo133194N();
        N.mo133389b(this.f112349e);
        N.mo133388b(this.f112350f);
        N.mo133387b(this.f112351g);
        this.f112348d = null;
    }

    /* renamed from: d */
    public final void mo157408d() {
        Chatter.ChatterCustomStatus e = m175776e();
        if (e == null) {
            this.f112347b.mo157409a(null, null);
        } else if (e.title == null) {
            this.f112347b.mo157409a(null, null);
        } else {
            EmojiMapManager bVar = EmojiMapManager.f136337c;
            String str = e.icon_key;
            Intrinsics.checkExpressionValueIsNotNull(str, "it.icon_key");
            if (bVar.mo188270b(str)) {
                this.f112347b.mo157409a(e.title, e.icon_key);
                return;
            }
            this.f112347b.mo157409a(null, null);
            if (this.f112348d == null) {
                this.f112348d = new C44299f(e, this);
            }
            IGetDataCallback<Boolean> iGetDataCallback = this.f112348d;
            if (iGetDataCallback != null) {
                EmojiMapManager bVar2 = EmojiMapManager.f136337c;
                String str2 = e.icon_key;
                Intrinsics.checkExpressionValueIsNotNull(str2, "it.icon_key");
                bVar2.mo188265a(str2, false, iGetDataCallback);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u000b\u0012\u0002\b\u0003\u0018\u00010\u0003¨\u0006\u00010\u0003¨\u0006\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Class;", "", "kotlin.jvm.PlatformType", "onBackToFrontEvent"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.fragment.phone.a$d */
    static final class C44297d implements AbstractC44500b {

        /* renamed from: a */
        final /* synthetic */ MainCustomStatusModel f112353a;

        C44297d(MainCustomStatusModel aVar) {
            this.f112353a = aVar;
        }

        @Override // com.ss.android.lark.main.interfaces.AbstractC44500b
        /* renamed from: a */
        public final void mo157410a(Class<Object> cls) {
            this.f112353a.mo157407c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/main/app/fragment/phone/MainCustomStatusModel$chatterPushListener$1", "Lcom/ss/android/lark/main/interfaces/IChatterPushListener;", "onChatterPush", "", "id", "", UpdateKey.STATUS, "", "Lcom/bytedance/lark/pb/basic/v1/Chatter$ChatterCustomStatus;", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.fragment.phone.a$e */
    public static final class C44298e implements IChatterPushListener {

        /* renamed from: a */
        final /* synthetic */ MainCustomStatusModel f112354a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44298e(MainCustomStatusModel aVar) {
            this.f112354a = aVar;
        }

        @Override // com.ss.android.lark.main.interfaces.IChatterPushListener
        /* renamed from: a */
        public void mo157411a(String str, List<Chatter.ChatterCustomStatus> list) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            AbstractC44136a a = C44134a.m174959a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MainModule.getDependency()");
            AbstractC44136a.AbstractC44137a g = a.mo133251g();
            Intrinsics.checkExpressionValueIsNotNull(g, "MainModule.getDependency().accountDependency");
            if (!(!Intrinsics.areEqual(g.mo133318a(), str))) {
                if (list == null) {
                    Log.m165379d("MainCustomStatusModel", "status is null");
                    return;
                }
                this.f112354a.f112346a.clear();
                this.f112354a.f112346a.addAll(list);
                this.f112354a.mo157408d();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/main/app/fragment/phone/MainCustomStatusModel$updateIfNeed$1$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.fragment.phone.a$f */
    public static final class C44299f implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Chatter.ChatterCustomStatus f112355a;

        /* renamed from: b */
        final /* synthetic */ MainCustomStatusModel f112356b;

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            this.f112356b.f112347b.mo157409a(this.f112355a.title, this.f112355a.icon_key);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165379d("MainCustomStatusModel", errorResult.getDebugMsg());
        }

        C44299f(Chatter.ChatterCustomStatus chatterCustomStatus, MainCustomStatusModel aVar) {
            this.f112355a = chatterCustomStatus;
            this.f112356b = aVar;
        }
    }

    public MainCustomStatusModel(ICustomStatusUpdater bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "updater");
        this.f112347b = bVar;
    }
}
