package com.ss.android.lark.simple.switcher;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Process;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.simple.SimpleModule;
import com.ss.android.lark.simple.service.SimpleModeService;
import com.ss.android.lark.simple.ui.SimpleMainActivity;
import com.ss.android.lark.utils.UIHelper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\nH\u0002J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J \u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0012H\u0007J6\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00122\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019H\u0007J.\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00122\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019H\u0002J.\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00122\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019H\u0002J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J&\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019H\u0002J\u000e\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010!\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/lark/simple/switcher/SimpleModeSwitcher;", "", "()V", "TAG", "", "checkSimpleMode", "", "activity", "Landroid/app/Activity;", "currentMode", "", "getProcessName", "fullName", "restartToNormalMode", "context", "Landroid/content/Context;", "restartToSimpleMode", "shouldProcessKilled", "", "showSimpleModeUnMatchDialog", "target", "showSwitchFailedToast", "showSwitchModeDialog", "forceSwitch", "callback", "Lkotlin/Function1;", "showSwitchToNormalModeDialog", "showSwitchToSimpleModeDialog", "shutDownAllOtherProcessAsync", "", "shutDownAllOtherProcessSync", "shutDownOtherProcessOnSimpleMode", "shutDownSelf", "stopStickyServices", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.simple.a.a */
public final class SimpleModeSwitcher {

    /* renamed from: a */
    public static final SimpleModeSwitcher f135403a = new SimpleModeSwitcher();

    private SimpleModeSwitcher() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.a.a$e */
    public static final class RunnableC54851e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f135414a;

        RunnableC54851e(Context context) {
            this.f135414a = context;
        }

        public final void run() {
            LKUIToast.show(this.f135414a, (int) R.string.Lark_Settings_BasicModeSwitchFailed);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.a.a$m */
    public static final class RunnableC54865m implements Runnable {

        /* renamed from: a */
        public static final RunnableC54865m f135440a = new RunnableC54865m();

        RunnableC54865m() {
        }

        public final void run() {
            Runtime.getRuntime().exit(0);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.a.a$b */
    public static final class RunnableC54846b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f135408a;

        RunnableC54846b(Context context) {
            this.f135408a = context;
        }

        public final void run() {
            Intent intent;
            SimpleModule.IMainDependency c;
            SimpleModule.ISimpleModuleDependency a = SimpleModule.f135402b.mo187078a();
            if (a == null || (c = a.mo187092c()) == null) {
                intent = null;
            } else {
                intent = c.mo187088a(this.f135408a);
            }
            if (intent != null) {
                SimpleModeSwitcher.f135403a.mo187102a(this.f135408a, new C54847a(this, intent));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/simple/switcher/SimpleModeSwitcher$restartToNormalMode$1$1$1"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.simple.a.a$b$a */
        static final class C54847a extends Lambda implements Function1<String, Unit> {
            final /* synthetic */ Intent $intent$inlined;
            final /* synthetic */ RunnableC54846b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C54847a(RunnableC54846b bVar, Intent intent) {
                super(1);
                this.this$0 = bVar;
                this.$intent$inlined = intent;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke(str);
                return Unit.INSTANCE;
            }

            public final void invoke(final String str) {
                Intrinsics.checkParameterIsNotNull(str, "it");
                UICallbackExecutor.execute(new Runnable(this) {
                    /* class com.ss.android.lark.simple.switcher.SimpleModeSwitcher.RunnableC54846b.C54847a.RunnableC548481 */

                    /* renamed from: a */
                    final /* synthetic */ C54847a f135409a;

                    {
                        this.f135409a = r1;
                    }

                    public final void run() {
                        if (Intrinsics.areEqual(SimpleModeSwitcher.f135403a.mo187100a(str), "main")) {
                            this.f135409a.this$0.f135408a.startActivity(this.f135409a.$intent$inlined);
                            SimpleModeSwitcher.f135403a.mo187107f(this.f135409a.this$0.f135408a);
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.a.a$c */
    public static final class RunnableC54849c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f135411a;

        RunnableC54849c(Context context) {
            this.f135411a = context;
        }

        public final void run() {
            Intent intent = new Intent(this.f135411a, SimpleMainActivity.class);
            intent.addFlags(32768);
            intent.addFlags(268435456);
            SimpleModeSwitcher.f135403a.mo187105d(this.f135411a);
            this.f135411a.startActivity(intent);
            SimpleModeSwitcher.f135403a.mo187107f(this.f135411a);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.a.a$l */
    public static final class RunnableC54864l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ActivityManager.RunningAppProcessInfo f135437a;

        /* renamed from: b */
        final /* synthetic */ Context f135438b;

        /* renamed from: c */
        final /* synthetic */ Function1 f135439c;

        RunnableC54864l(ActivityManager.RunningAppProcessInfo runningAppProcessInfo, Context context, Function1 function1) {
            this.f135437a = runningAppProcessInfo;
            this.f135438b = context;
            this.f135439c = function1;
        }

        public final void run() {
            if (!Intrinsics.areEqual(this.f135437a.processName, C26252ad.m94992a(this.f135438b))) {
                Runtime runtime = Runtime.getRuntime();
                runtime.exec("kill -9 " + this.f135437a.pid);
                Function1 function1 = this.f135439c;
                if (function1 != null) {
                    String str = this.f135437a.processName;
                    Intrinsics.checkExpressionValueIsNotNull(str, "info.processName");
                    Unit unit = (Unit) function1.invoke(str);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/simple/switcher/SimpleModeSwitcher$checkSimpleMode$1$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.a.a$a */
    public static final class C54844a implements IGetDataCallback<Integer> {

        /* renamed from: a */
        final /* synthetic */ Activity f135404a;

        /* renamed from: b */
        final /* synthetic */ int f135405b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
        }

        /* renamed from: a */
        public void mo187108a(final int i) {
            if (i != this.f135405b) {
                UICallbackExecutor.execute(new Runnable(this) {
                    /* class com.ss.android.lark.simple.switcher.SimpleModeSwitcher.C54844a.RunnableC548451 */

                    /* renamed from: a */
                    final /* synthetic */ C54844a f135406a;

                    {
                        this.f135406a = r1;
                    }

                    public final void run() {
                        SimpleModeSwitcher.f135403a.mo187103b(this.f135406a.f135404a, i);
                    }
                });
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Integer num) {
            mo187108a(num.intValue());
        }

        C54844a(Activity activity, int i) {
            this.f135404a = activity;
            this.f135405b = i;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onCancel", "com/ss/android/lark/simple/switcher/SimpleModeSwitcher$showSwitchToNormalModeDialog$1$3"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.a.a$g */
    public static final class DialogInterface$OnCancelListenerC54856g implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ boolean f135422a;

        /* renamed from: b */
        final /* synthetic */ Activity f135423b;

        /* renamed from: c */
        final /* synthetic */ Function1 f135424c;

        DialogInterface$OnCancelListenerC54856g(boolean z, Activity activity, Function1 function1) {
            this.f135422a = z;
            this.f135423b = activity;
            this.f135424c = function1;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            Function1 function1 = this.f135424c;
            if (function1 != null) {
                Unit unit = (Unit) function1.invoke(false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onCancel", "com/ss/android/lark/simple/switcher/SimpleModeSwitcher$showSwitchToSimpleModeDialog$1$3"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.a.a$j */
    public static final class DialogInterface$OnCancelListenerC54862j implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ boolean f135433a;

        /* renamed from: b */
        final /* synthetic */ Activity f135434b;

        /* renamed from: c */
        final /* synthetic */ Function1 f135435c;

        DialogInterface$OnCancelListenerC54862j(boolean z, Activity activity, Function1 function1) {
            this.f135433a = z;
            this.f135434b = activity;
            this.f135435c = function1;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            Function1 function1 = this.f135435c;
            if (function1 != null) {
                Unit unit = (Unit) function1.invoke(false);
            }
        }
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m212751c(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        UICallbackExecutor.execute(new RunnableC54846b(context));
    }

    /* renamed from: b */
    public final void mo187104b(Context context) {
        m212752g(context);
        UICallbackExecutor.execute(new RunnableC54849c(context));
    }

    /* renamed from: f */
    public final void mo187107f(Context context) {
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
        UICallbackExecutor.executeDelayed(RunnableC54865m.f135440a, 1000);
    }

    /* renamed from: b */
    private final boolean m212750b(String str) {
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, ":", 0, false, 6, (Object) null);
        if (lastIndexOf$default == -1) {
            return false;
        }
        if (str != null) {
            String substring = str.substring(lastIndexOf$default);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
            if (Intrinsics.areEqual(substring, ":simple")) {
                return false;
            }
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: g */
    private final void m212752g(Context context) {
        SimpleModule.IDocDependency h;
        SimpleModule.IWsChannelDependency g;
        SimpleModule.ISimpleModuleDependency a = SimpleModule.f135402b.mo187078a();
        if (!(a == null || (g = a.mo187096g()) == null)) {
            g.mo187099a(context);
        }
        SimpleModule.ISimpleModuleDependency a2 = SimpleModule.f135402b.mo187078a();
        if (a2 != null && (h = a2.mo187097h()) != null) {
            h.mo187081a(context);
        }
    }

    /* renamed from: d */
    public final List<String> mo187105d(Context context) {
        Object systemService = context.getSystemService("activity");
        if (systemService != null) {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            ArrayList arrayList = new ArrayList();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                String str = runningAppProcessInfo.processName;
                if (!Intrinsics.areEqual(str, C26252ad.m94992a(context))) {
                    arrayList.add(runningAppProcessInfo.processName);
                    Process.killProcess(runningAppProcessInfo.pid);
                    Log.m165389i("SimpleModeService", "kill process " + str + " pid = " + runningAppProcessInfo.pid);
                }
            }
            return arrayList;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.ActivityManager");
    }

    /* renamed from: e */
    public final void mo187106e(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Object systemService = context.getSystemService("activity");
        if (systemService != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) systemService).getRunningAppProcesses()) {
                String str = runningAppProcessInfo.processName;
                Intrinsics.checkExpressionValueIsNotNull(str, "processName");
                if (m212750b(str)) {
                    Process.killProcess(runningAppProcessInfo.pid);
                    Log.m165389i("SimpleModeService", "kill process " + str + " pid = " + runningAppProcessInfo.pid);
                }
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.ActivityManager");
    }

    /* renamed from: a */
    public final String mo187100a(String str) {
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, ":", 0, false, 6, (Object) null);
        if (lastIndexOf$default == -1) {
            return "main";
        }
        if (str != null) {
            String substring = str.substring(lastIndexOf$default);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    public final void mo187101a(Context context) {
        UICallbackExecutor.execute(new RunnableC54851e(context));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.a.a$h */
    public static final class DialogInterface$OnClickListenerC54857h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC54857h f135425a = new DialogInterface$OnClickListenerC54857h();

        DialogInterface$OnClickListenerC54857h() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.a.a$k */
    public static final class DialogInterface$OnClickListenerC54863k implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC54863k f135436a = new DialogInterface$OnClickListenerC54863k();

        DialogInterface$OnClickListenerC54863k() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick", "com/ss/android/lark/simple/switcher/SimpleModeSwitcher$showSwitchToNormalModeDialog$1$2"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.a.a$f */
    public static final class DialogInterface$OnClickListenerC54852f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ boolean f135415a;

        /* renamed from: b */
        final /* synthetic */ Activity f135416b;

        /* renamed from: c */
        final /* synthetic */ Function1 f135417c;

        DialogInterface$OnClickListenerC54852f(boolean z, Activity activity, Function1 function1) {
            this.f135415a = z;
            this.f135416b = activity;
            this.f135417c = function1;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            SimpleModeService.f135451c.mo187138a().mo187132a(this.f135416b, 0, new IGetDataCallback<Boolean>(this) {
                /* class com.ss.android.lark.simple.switcher.SimpleModeSwitcher.DialogInterface$OnClickListenerC54852f.C548531 */

                /* renamed from: a */
                final /* synthetic */ DialogInterface$OnClickListenerC54852f f135418a;

                {
                    this.f135418a = r1;
                }

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    UICallbackExecutor.execute(new Runnable(this) {
                        /* class com.ss.android.lark.simple.switcher.SimpleModeSwitcher.DialogInterface$OnClickListenerC54852f.C548531.RunnableC548541 */

                        /* renamed from: a */
                        final /* synthetic */ C548531 f135419a;

                        {
                            this.f135419a = r1;
                        }

                        public final void run() {
                            Log.m165389i("SimpleModeService", "set basic mode setting success to normal");
                            Function1 function1 = this.f135419a.f135418a.f135417c;
                            if (function1 != null) {
                                Unit unit = (Unit) function1.invoke(true);
                            }
                            SimpleModeSwitcher.m212751c(this.f135419a.f135418a.f135416b);
                        }
                    });
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(final ErrorResult errorResult) {
                    Intrinsics.checkParameterIsNotNull(errorResult, "err");
                    UICallbackExecutor.execute(new Runnable(this) {
                        /* class com.ss.android.lark.simple.switcher.SimpleModeSwitcher.DialogInterface$OnClickListenerC54852f.C548531.RunnableC548552 */

                        /* renamed from: a */
                        final /* synthetic */ C548531 f135420a;

                        {
                            this.f135420a = r1;
                        }

                        public final void run() {
                            Log.m165383e("SimpleModeService", "set basic mode setting fail " + errorResult.getDisplayMsg());
                            Function1 function1 = this.f135420a.f135418a.f135417c;
                            if (function1 != null) {
                                Unit unit = (Unit) function1.invoke(false);
                            }
                            SimpleModeSwitcher.f135403a.mo187101a(this.f135420a.f135418a.f135416b);
                        }
                    });
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick", "com/ss/android/lark/simple/switcher/SimpleModeSwitcher$showSwitchToSimpleModeDialog$1$2"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.a.a$i */
    public static final class DialogInterface$OnClickListenerC54858i implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ boolean f135426a;

        /* renamed from: b */
        final /* synthetic */ Activity f135427b;

        /* renamed from: c */
        final /* synthetic */ Function1 f135428c;

        DialogInterface$OnClickListenerC54858i(boolean z, Activity activity, Function1 function1) {
            this.f135426a = z;
            this.f135427b = activity;
            this.f135428c = function1;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            SimpleModeService.f135451c.mo187138a().mo187132a(this.f135427b, 1, new IGetDataCallback<Boolean>(this) {
                /* class com.ss.android.lark.simple.switcher.SimpleModeSwitcher.DialogInterface$OnClickListenerC54858i.C548591 */

                /* renamed from: a */
                final /* synthetic */ DialogInterface$OnClickListenerC54858i f135429a;

                {
                    this.f135429a = r1;
                }

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    UICallbackExecutor.execute(new Runnable(this) {
                        /* class com.ss.android.lark.simple.switcher.SimpleModeSwitcher.DialogInterface$OnClickListenerC54858i.C548591.RunnableC548601 */

                        /* renamed from: a */
                        final /* synthetic */ C548591 f135430a;

                        {
                            this.f135430a = r1;
                        }

                        public final void run() {
                            Log.m165389i("SimpleModeService", "set basic mode setting success to simple");
                            Function1 function1 = this.f135430a.f135429a.f135428c;
                            if (function1 != null) {
                                Unit unit = (Unit) function1.invoke(true);
                            }
                            SimpleModeSwitcher.f135403a.mo187104b(this.f135430a.f135429a.f135427b);
                        }
                    });
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(final ErrorResult errorResult) {
                    Intrinsics.checkParameterIsNotNull(errorResult, "err");
                    UICallbackExecutor.execute(new Runnable(this) {
                        /* class com.ss.android.lark.simple.switcher.SimpleModeSwitcher.DialogInterface$OnClickListenerC54858i.C548591.RunnableC548612 */

                        /* renamed from: a */
                        final /* synthetic */ C548591 f135431a;

                        {
                            this.f135431a = r1;
                        }

                        public final void run() {
                            Log.m165383e("SimpleModeService", "set basic mode setting fail " + errorResult.getDisplayMsg());
                            Function1 function1 = this.f135431a.f135429a.f135428c;
                            if (function1 != null) {
                                Unit unit = (Unit) function1.invoke(false);
                            }
                            SimpleModeSwitcher.f135403a.mo187101a(this.f135431a.f135429a.f135427b);
                        }
                    });
                }
            });
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m212745a(Activity activity, int i) {
        if (UIUtils.isActivityRunning(activity) && activity != null) {
            SimpleModeService.f135451c.mo187138a().mo187133a(activity, new C54844a(activity, i));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "<anonymous parameter 1>", "", "onClick", "com/ss/android/lark/simple/switcher/SimpleModeSwitcher$showSimpleModeUnMatchDialog$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.a.a$d */
    public static final class DialogInterface$OnClickListenerC54850d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WeakReference f135412a;

        /* renamed from: b */
        final /* synthetic */ int f135413b;

        DialogInterface$OnClickListenerC54850d(WeakReference weakReference, int i) {
            this.f135412a = weakReference;
            this.f135413b = i;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Intrinsics.checkParameterIsNotNull(dialogInterface, "<anonymous parameter 0>");
            Activity activity = (Activity) this.f135412a.get();
            if (activity == null) {
                return;
            }
            if (this.f135413b == 0) {
                Intrinsics.checkExpressionValueIsNotNull(activity, "this");
                SimpleModeSwitcher.m212751c(activity);
                return;
            }
            SimpleModeSwitcher aVar = SimpleModeSwitcher.f135403a;
            Intrinsics.checkExpressionValueIsNotNull(activity, "this");
            aVar.mo187104b(activity);
        }
    }

    /* renamed from: b */
    public final void mo187103b(Activity activity, int i) {
        WeakReference weakReference = new WeakReference(activity);
        C25639g gVar = new C25639g((Context) weakReference.get());
        gVar.mo89237b(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_BasicModeErrorOccurredPlsRestart));
        gVar.mo89246d(false);
        gVar.mo89247e(false);
        gVar.mo89238b(true);
        gVar.mo89249h(17);
        gVar.mo89250i(R.color.lkui_N900);
        gVar.mo89224a(R.id.lkui_dialog_btn_center, R.string.Lark_Settings_BasicModeOnConfirmButton, new DialogInterface$OnClickListenerC54850d(weakReference, i));
        gVar.mo89239c();
    }

    /* renamed from: a */
    public final void mo187102a(Context context, Function1<? super String, Unit> function1) {
        Object systemService = context.getSystemService("activity");
        if (systemService != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) systemService).getRunningAppProcesses()) {
                CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
                Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
                coreThreadPool.getFixedThreadPool().submit(new RunnableC54864l(runningAppProcessInfo, context, function1));
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.ActivityManager");
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m212746a(Activity activity, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        m212747a(activity, i, z, null);
    }

    /* renamed from: a */
    private final void m212748a(Activity activity, boolean z, Function1<? super Boolean, Unit> function1) {
        C25639g gVar = new C25639g((Context) new WeakReference(activity).get());
        gVar.mo89248g(R.string.Lark_Settings_BasicModeOnConfirmTitle);
        gVar.mo89242c(UIHelper.mustacheFormat((int) R.string.Lark_Settings_BasicModeOnConfirmDesc));
        gVar.mo89246d(!z);
        gVar.mo89247e(!z);
        gVar.mo89238b(true);
        gVar.mo89249h(17);
        gVar.mo89250i(R.color.lkui_N900);
        gVar.mo89256o(R.color.lkui_N900);
        gVar.mo89255n(16);
        if (!z) {
            gVar.mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Settings_Cancel, DialogInterface$OnClickListenerC54863k.f135436a);
        }
        gVar.mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Settings_BasicModeOnConfirmButton, new DialogInterface$OnClickListenerC54858i(z, activity, function1));
        gVar.mo89226a(new DialogInterface$OnCancelListenerC54862j(z, activity, function1));
        gVar.mo89239c();
    }

    /* renamed from: b */
    private final void m212749b(Activity activity, boolean z, Function1<? super Boolean, Unit> function1) {
        C25639g gVar = new C25639g((Context) new WeakReference(activity).get());
        gVar.mo89237b(UIHelper.mustacheFormat((int) R.string.Lark_Settings_BasicModeOffConfirmTitle));
        gVar.mo89238b(true);
        gVar.mo89249h(17);
        gVar.mo89246d(!z);
        gVar.mo89247e(!z);
        if (!z) {
            gVar.mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Settings_Cancel, DialogInterface$OnClickListenerC54857h.f135425a);
        }
        gVar.mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Settings_BasicModeOnConfirmButton, new DialogInterface$OnClickListenerC54852f(z, activity, function1));
        gVar.mo89226a(new DialogInterface$OnCancelListenerC54856g(z, activity, function1));
        gVar.mo89239c();
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m212747a(Activity activity, int i, boolean z, Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        if (i == 0) {
            f135403a.m212749b(activity, z, function1);
        } else if (i == 1) {
            f135403a.m212748a(activity, z, function1);
        }
    }
}
