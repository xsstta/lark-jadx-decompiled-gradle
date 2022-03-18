package com.ss.android.lark.notification.setting.impl.zen;

import android.content.DialogInterface;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.notification.dto.C48444c;
import com.ss.android.lark.notification.setting.impl.zen.C48675a;
import com.ss.android.lark.notification.statistics.ZenHitPoint;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.Weak;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0012\u001a\u00020\u0013J\u001f\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\u0013J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0016H\u0002J\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u0004\u0018\u00010\u00038BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u00058BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u000f\u0010\u0010¨\u0006 "}, d2 = {"Lcom/ss/android/lark/notification/setting/impl/zen/ZenSettingSelectHandler;", "", "model", "Lcom/ss/android/lark/notification/setting/impl/zen/IZenSettingContract$IModel;", "view", "Lcom/ss/android/lark/notification/setting/impl/zen/IZenSettingContract$IView;", "(Lcom/ss/android/lark/notification/setting/impl/zen/IZenSettingContract$IModel;Lcom/ss/android/lark/notification/setting/impl/zen/IZenSettingContract$IView;)V", "mCallbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "mModelRef", "getMModelRef", "()Lcom/ss/android/lark/notification/setting/impl/zen/IZenSettingContract$IModel;", "mModelRef$delegate", "Lcom/ss/android/lark/utils/Weak;", "mViewRef", "getMViewRef", "()Lcom/ss/android/lark/notification/setting/impl/zen/IZenSettingContract$IView;", "mViewRef$delegate", "cancelCallbacks", "", "handleZenSettingSelected", "additionTime", "", "timeText", "", "(Ljava/lang/Long;Ljava/lang/String;)V", "handleZenSettingTurnOffSelected", "millis2Minutes", "", "millis", "showNeverInZenModeView", "Companion", "core_notification_notification_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.notification.setting.impl.zen.e */
public final class ZenSettingSelectHandler {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f122417a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ZenSettingSelectHandler.class), "mModelRef", "getMModelRef()Lcom/ss/android/lark/notification/setting/impl/zen/IZenSettingContract$IModel;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ZenSettingSelectHandler.class), "mViewRef", "getMViewRef()Lcom/ss/android/lark/notification/setting/impl/zen/IZenSettingContract$IView;"))};

    /* renamed from: c */
    public static final Companion f122418c = new Companion(null);

    /* renamed from: b */
    public final CallbackManager f122419b = new CallbackManager();

    /* renamed from: d */
    private final Weak f122420d;

    /* renamed from: e */
    private final Weak f122421e;

    /* renamed from: a */
    public final C48675a.AbstractC48676a mo169902a() {
        return (C48675a.AbstractC48676a) this.f122420d.mo196112a(this, f122417a[0]);
    }

    /* renamed from: b */
    public final C48675a.AbstractC48678b mo169905b() {
        return (C48675a.AbstractC48678b) this.f122421e.mo196112a(this, f122417a[1]);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/notification/setting/impl/zen/ZenSettingSelectHandler$Companion;", "", "()V", "TAG", "", "core_notification_notification_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.notification.setting.impl.zen.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/notification/setting/impl/zen/IZenSettingContract$IModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.notification.setting.impl.zen.e$d */
    static final class C48693d extends Lambda implements Function0<C48675a.AbstractC48676a> {
        final /* synthetic */ C48675a.AbstractC48676a $model;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48693d(C48675a.AbstractC48676a aVar) {
            super(0);
            this.$model = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C48675a.AbstractC48676a invoke() {
            return this.$model;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/notification/setting/impl/zen/IZenSettingContract$IView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.notification.setting.impl.zen.e$e */
    static final class C48694e extends Lambda implements Function0<C48675a.AbstractC48678b> {
        final /* synthetic */ C48675a.AbstractC48678b $view;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48694e(C48675a.AbstractC48678b bVar) {
            super(0);
            this.$view = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C48675a.AbstractC48678b invoke() {
            return this.$view;
        }
    }

    /* renamed from: d */
    public final void mo169907d() {
        this.f122419b.cancelCallbacks();
    }

    /* renamed from: c */
    public final void mo169906c() {
        CoreThreadPool.getSerialTaskHandler().post(new RunnableC48691c(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.notification.setting.impl.zen.e$b */
    public static final class RunnableC48689b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ZenSettingSelectHandler f122422a;

        /* renamed from: b */
        final /* synthetic */ Long f122423b;

        /* renamed from: c */
        final /* synthetic */ String f122424c;

        RunnableC48689b(ZenSettingSelectHandler eVar, Long l, String str) {
            this.f122422a = eVar;
            this.f122423b = l;
            this.f122424c = str;
        }

        public final void run() {
            long j;
            Long l = this.f122423b;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            String str = this.f122424c;
            if (str == null) {
                str = "";
            }
            int a = this.f122422a.mo169901a(j);
            C48675a.AbstractC48676a a2 = this.f122422a.mo169902a();
            if (a2 != null) {
                if (a2.mo169892b()) {
                    ZenHitPoint.m191358c(a);
                } else {
                    ZenHitPoint.m191356a(a);
                }
                a2.mo169894d();
                a2.mo169889a(j, (IGetDataCallback) this.f122422a.f122419b.wrapAndAddCallback(new UIGetDataCallback(new C48690a(this, a, j, str))));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/notification/setting/impl/zen/ZenSettingSelectHandler$handleZenSettingSelected$1$1$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "core_notification_notification_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.notification.setting.impl.zen.e$b$a */
        public static final class C48690a implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ RunnableC48689b f122425a;

            /* renamed from: b */
            final /* synthetic */ int f122426b;

            /* renamed from: c */
            final /* synthetic */ long f122427c;

            /* renamed from: d */
            final /* synthetic */ String f122428d;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                C53241h.m205894a("ZenSettingSelectHandler", "set Zen Setting error " + errorResult.getDebugMsg());
                C48675a.AbstractC48678b b = this.f122425a.f122422a.mo169905b();
                if (b != null) {
                    b.mo169873b();
                    b.mo169872a(UIHelper.getString(R.string.Lark_Legacy_NetworkErrorRetry));
                }
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                C48675a.AbstractC48678b b = this.f122425a.f122422a.mo169905b();
                if (b != null) {
                    b.mo169873b();
                }
                C48675a.AbstractC48676a a = this.f122425a.f122422a.mo169902a();
                if (a == null) {
                    return;
                }
                if (!a.mo169893c()) {
                    C48675a.AbstractC48678b b2 = this.f122425a.f122422a.mo169905b();
                    if (b2 != null) {
                        b2.mo169872a(UIHelper.mustacheFormat((int) R.string.Lark_Notification_DndOnToast, "Time", this.f122428d));
                    }
                    C48675a.AbstractC48678b b3 = this.f122425a.f122422a.mo169905b();
                    if (b3 != null) {
                        b3.mo169866a();
                        return;
                    }
                    return;
                }
                this.f122425a.f122422a.mo169904a(this.f122428d);
            }

            C48690a(RunnableC48689b bVar, int i, long j, String str) {
                this.f122425a = bVar;
                this.f122426b = i;
                this.f122427c = j;
                this.f122428d = str;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.notification.setting.impl.zen.e$c */
    public static final class RunnableC48691c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ZenSettingSelectHandler f122429a;

        RunnableC48691c(ZenSettingSelectHandler eVar) {
            this.f122429a = eVar;
        }

        public final void run() {
            C48444c cVar;
            C48675a.AbstractC48676a a = this.f122429a.mo169902a();
            if (a != null) {
                cVar = a.mo169888a();
            } else {
                cVar = null;
            }
            if (cVar != null) {
                ZenHitPoint.m191357b(this.f122429a.mo169901a(cVar.f121912c));
            }
            C48675a.AbstractC48676a a2 = this.f122429a.mo169902a();
            if (a2 != null) {
                a2.mo169894d();
                a2.mo169890a((IGetDataCallback) this.f122429a.f122419b.wrapAndAddCallback(new UIGetDataCallback(new C48692a(this))));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/notification/setting/impl/zen/ZenSettingSelectHandler$handleZenSettingTurnOffSelected$1$2$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "core_notification_notification_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.notification.setting.impl.zen.e$c$a */
        public static final class C48692a implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ RunnableC48691c f122430a;

            C48692a(RunnableC48691c cVar) {
                this.f122430a = cVar;
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                C48675a.AbstractC48678b b = this.f122430a.f122429a.mo169905b();
                if (b != null) {
                    b.mo169875c();
                    b.mo169872a(UIHelper.getString(R.string.Lark_Notification_DndResume));
                    b.mo169866a();
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                C53241h.m205894a("ZenSettingSelectHandler", "clear Zen Setting error " + errorResult.getDebugMsg());
                C48675a.AbstractC48678b b = this.f122430a.f122429a.mo169905b();
                if (b != null) {
                    b.mo169872a(UIHelper.getString(R.string.Lark_Legacy_NetworkErrorRetry));
                    b.mo169875c();
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo169901a(long j) {
        return (int) Math.ceil((double) (((float) j) / 60000.0f));
    }

    /* renamed from: a */
    public final void mo169904a(String str) {
        C48675a.AbstractC48678b b = mo169905b();
        if (b != null) {
            b.mo169868a(new DialogInterface$OnClickListenerC48695f(this, str));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.notification.setting.impl.zen.e$f */
    public static final class DialogInterface$OnClickListenerC48695f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ZenSettingSelectHandler f122431a;

        /* renamed from: b */
        final /* synthetic */ String f122432b;

        DialogInterface$OnClickListenerC48695f(ZenSettingSelectHandler eVar, String str) {
            this.f122431a = eVar;
            this.f122432b = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            C48675a.AbstractC48678b b = this.f122431a.mo169905b();
            if (b != null) {
                b.mo169872a(UIHelper.mustacheFormat((int) R.string.Lark_Notification_DndOnToast, "Time", this.f122432b));
            }
            C48675a.AbstractC48678b b2 = this.f122431a.mo169905b();
            if (b2 != null) {
                b2.mo169866a();
            }
        }
    }

    public ZenSettingSelectHandler(C48675a.AbstractC48676a aVar, C48675a.AbstractC48678b bVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        this.f122420d = new Weak(new C48693d(aVar));
        this.f122421e = new Weak(new C48694e(bVar));
    }

    /* renamed from: a */
    public final void mo169903a(Long l, String str) {
        CoreThreadPool.getSerialTaskHandler().post(new RunnableC48689b(this, l, str));
    }
}
