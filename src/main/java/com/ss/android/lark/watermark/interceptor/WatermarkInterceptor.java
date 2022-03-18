package com.ss.android.lark.watermark.interceptor;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/watermark/interceptor/WatermarkInterceptor;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mInterceptors", "", "Lcom/ss/android/lark/watermark/interceptor/WatermarkInterceptor$IWatermarkInterceptor;", "interceptWatermark", "", "entity", "registerInterceptor", "", "interceptor", "unRegisterInterceptor", "IWatermarkInterceptor", "core_watermark_watermark_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.watermark.d.b */
public final class WatermarkInterceptor {

    /* renamed from: a */
    private final Map<IWatermarkInterceptor, Object> f143282a = new ConcurrentHashMap();

    /* renamed from: b */
    private final Context f143283b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/watermark/interceptor/WatermarkInterceptor$IWatermarkInterceptor;", "", "intercept", "", "context", "Landroid/content/Context;", "entity", "core_watermark_watermark_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.watermark.d.b$a */
    public interface IWatermarkInterceptor {
        /* renamed from: a */
        boolean mo197336a(Context context, Object obj);
    }

    /* renamed from: a */
    public final void mo197337a(IWatermarkInterceptor aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "interceptor");
        this.f143282a.put(aVar, new Object());
    }

    public WatermarkInterceptor(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f143283b = context;
    }

    /* renamed from: a */
    public final boolean mo197338a(Object obj) {
        Iterator<Map.Entry<IWatermarkInterceptor, Object>> it = this.f143282a.entrySet().iterator();
        if (it.hasNext()) {
            return it.next().getKey().mo197336a(this.f143283b, obj);
        }
        return false;
    }
}
