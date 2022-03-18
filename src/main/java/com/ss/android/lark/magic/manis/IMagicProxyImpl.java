package com.ss.android.lark.magic.manis;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ss.android.lark.biz.core.api.MagicViewContainer;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.magic.C41707a;
import com.ss.android.lark.magic.p2152b.AbstractC41708a;
import com.ss.android.lark.magic.provider.IMagicProvider;
import com.ss.android.lark.magic.provider.TriggerResponse;
import com.ss.android.lark.magic.provider.impl.FeelGoodMagicProvider;
import com.ss.android.lark.magic.service.MagicLifecycleService;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@RemoteServiceImpl(service = IMagicProxy.class)
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J(\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/magic/manis/IMagicProxyImpl;", "Lcom/ss/android/lark/magic/manis/IMagicProxy;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "gson", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "showMagic", "", "responseStr", "", "transferLifecycleToMain", "uniqueTag", "event", "onPreCheckTime", "", "onCheckedTime", "Companion", "core_magic_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class IMagicProxyImpl implements IMagicProxy {
    public static final Companion Companion = new Companion(null);
    private final Context context;
    private final Gson gson = new GsonBuilder().disableHtmlEscaping().create();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/magic/manis/IMagicProxyImpl$Companion;", "", "()V", "TAG", "", "core_magic_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.magic.manis.IMagicProxyImpl$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public IMagicProxyImpl(Context context2) {
        Intrinsics.checkParameterIsNotNull(context2, "context");
        this.context = context2;
    }

    @Override // com.ss.android.lark.magic.manis.IMagicProxy
    public void showMagic(String str) {
        Activity activity;
        Intrinsics.checkParameterIsNotNull(str, "responseStr");
        TriggerResponse eVar = (TriggerResponse) this.gson.fromJson(str, TriggerResponse.class);
        AbstractC41708a b = C41707a.m165544b();
        if (b != null) {
            activity = b.mo150007j();
        } else {
            activity = null;
        }
        if (activity instanceof AppCompatActivity) {
            Lifecycle lifecycle = ((AppCompatActivity) activity).getLifecycle();
            Intrinsics.checkExpressionValueIsNotNull(lifecycle, "activity.lifecycle");
            if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                eVar.mo150035a(new MagicViewContainer(activity));
                IMagicProvider a = FeelGoodMagicProvider.f105933b.mo150026a();
                Intrinsics.checkExpressionValueIsNotNull(eVar, "triggerResponse");
                a.mo150025a(eVar);
                return;
            }
        }
        Log.m165389i("MagicService", "topActivity is null or not resumed.");
    }

    @Override // com.ss.android.lark.magic.manis.IMagicProxy
    public void transferLifecycleToMain(String str, String str2, long j, long j2) {
        Intrinsics.checkParameterIsNotNull(str, "uniqueTag");
        Intrinsics.checkParameterIsNotNull(str2, "event");
        MagicLifecycleService.f105961b.mo150060a().mo150050a(str, str2, j, j2);
    }
}
