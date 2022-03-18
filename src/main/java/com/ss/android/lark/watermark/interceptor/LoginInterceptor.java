package com.ss.android.lark.watermark.interceptor;

import android.content.Context;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.watermark.C58275e;
import com.ss.android.lark.watermark.IWatermarkModuleDependency;
import com.ss.android.lark.watermark.interceptor.WatermarkInterceptor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/watermark/interceptor/LoginInterceptor;", "Lcom/ss/android/lark/watermark/interceptor/WatermarkInterceptor$IWatermarkInterceptor;", "()V", "mLoginDependency", "Lcom/ss/android/lark/watermark/IWatermarkModuleDependency$ILoginDependency;", "intercept", "", "context", "Landroid/content/Context;", "entity", "", "Companion", "core_watermark_watermark_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.watermark.d.a */
public final class LoginInterceptor implements WatermarkInterceptor.IWatermarkInterceptor {

    /* renamed from: a */
    public static final Companion f143280a = new Companion(null);

    /* renamed from: b */
    private final IWatermarkModuleDependency.ILoginDependency f143281b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/watermark/interceptor/LoginInterceptor$Companion;", "", "()V", "TAG", "", "core_watermark_watermark_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.watermark.d.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LoginInterceptor() {
        IWatermarkModuleDependency a = C58275e.m225982a();
        Intrinsics.checkExpressionValueIsNotNull(a, "WatermarkModule.getDependency()");
        IWatermarkModuleDependency.ILoginDependency e = a.mo177768e();
        Intrinsics.checkExpressionValueIsNotNull(e, "WatermarkModule.getDependency().loginDependency");
        this.f143281b = e;
    }

    @Override // com.ss.android.lark.watermark.interceptor.WatermarkInterceptor.IWatermarkInterceptor
    /* renamed from: a */
    public boolean mo197336a(Context context, Object obj) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        int b = this.f143281b.mo177776b();
        Log.m165389i("LoginInterceptor", "watermark intercept by login type: " + b);
        if (b == 2 || b == 0) {
            return true;
        }
        return false;
    }
}
