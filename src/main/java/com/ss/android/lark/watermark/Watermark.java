package com.ss.android.lark.watermark;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.watermark.core.IAttachResultCallback;
import com.ss.android.lark.watermark.core.IAttachToBitmapCallback;
import com.ss.android.lark.watermark.core.WatermarkCache;
import com.ss.android.lark.watermark.dto.WatermarkInfo;
import com.ss.android.lark.watermark.mysterious.MysteriousWatermarkContentComposer;
import com.ss.android.lark.watermark.mysterious.MysteriousWatermarkCreator;
import com.ss.android.lark.watermark.p2924a.AbstractC58221a;
import com.ss.android.lark.watermark.p2925b.C58244b;
import com.ss.android.lark.watermark.p2926c.C58249a;
import com.ss.android.lark.watermark.p2929f.AbstractC58289c;
import com.ss.android.lark.watermark.p2929f.C58286a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function0;

public class Watermark {
    private boolean isInited;
    public Context mContext;
    private ExecutorService mExecutor;
    private final Map<String, Boolean> mFeatureGatingMap;
    private AbstractC58218b mIs24Hours;
    private WatermarkCache mWatermarkCache;
    public C58244b mWatermarkCreator;
    private C58249a mWatermarkDisplayer;
    private final WatermarkCache.IWatermarkInfoListener mWatermarkInfoListener;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.watermark.Watermark$a */
    public static class C58217a {

        /* renamed from: a */
        static Watermark f143151a = new Watermark();
    }

    /* renamed from: com.ss.android.lark.watermark.Watermark$b */
    public interface AbstractC58218b {
        boolean is24Hours();
    }

    public static Watermark inst() {
        return C58217a.f143151a;
    }

    private boolean checkInit() {
        if (!this.isInited) {
            Log.m165383e("Watermark", "Watermark init not ready");
        }
        return this.isInited;
    }

    /* access modifiers changed from: private */
    public boolean is24Hours() {
        AbstractC58218b bVar = this.mIs24Hours;
        if (bVar != null) {
            return bVar.is24Hours();
        }
        return false;
    }

    public WatermarkInfo get() {
        if (!checkInit()) {
            return null;
        }
        return this.mWatermarkCache.get();
    }

    private Watermark() {
        this.mFeatureGatingMap = new HashMap();
        this.mWatermarkInfoListener = new WatermarkCache.IWatermarkInfoListener() {
            /* class com.ss.android.lark.watermark.Watermark.C582121 */

            @Override // com.ss.android.lark.watermark.core.WatermarkCache.IWatermarkInfoListener
            public void onWatermarkChanged(WatermarkInfo watermarkInfo) {
                Log.m165379d("Watermark", "watermark changed: " + watermarkInfo.toString());
            }
        };
    }

    public void unInit() {
        this.mWatermarkCache.removeWatermarkInfoListener(this.mWatermarkInfoListener);
        this.mWatermarkCache.clear();
        this.mWatermarkCache = null;
        this.mExecutor.shutdown();
        this.isInited = false;
    }

    public void setIs24Hours(AbstractC58218b bVar) {
        this.mIs24Hours = bVar;
    }

    public void detachWatermark(Activity activity) {
        if (checkInit()) {
            this.mWatermarkDisplayer.mo197304a(activity);
        }
    }

    public void setWatermarkCompressor(AbstractC58221a aVar) {
        if (checkInit()) {
            this.mWatermarkCreator.mo197295a(aVar);
        }
    }

    public void update(WatermarkInfo watermarkInfo) {
        if (checkInit()) {
            this.mWatermarkCache.update(watermarkInfo);
        }
    }

    public void detachWatermark(Dialog dialog) {
        if (checkInit()) {
            this.mWatermarkDisplayer.mo197306a(dialog);
        }
    }

    public boolean isFgEnable(String str) {
        Boolean bool = this.mFeatureGatingMap.get(str);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public void detachWatermark(FrameLayout frameLayout) {
        if (checkInit()) {
            this.mWatermarkDisplayer.mo197310a(frameLayout);
        }
    }

    public void init(Context context) {
        C58244b bVar;
        if (this.isInited) {
            unInit();
        }
        this.mContext = context.getApplicationContext();
        this.mExecutor = CoreThreadPool.getDefault().newSerialCpuDensityThreadPool("pool_Watermark");
        this.mWatermarkCache = new WatermarkCache();
        if (isFgEnable("lark.core.mysterious.watermark")) {
            bVar = new MysteriousWatermarkCreator(new MysteriousWatermarkContentComposer(this.mContext, new Function0() {
                /* class com.ss.android.lark.watermark.$$Lambda$Watermark$dnVVHZTuel_WmbdiYoDDmaGtImg */

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(Watermark.this.is24Hours());
                }
            }));
        } else {
            bVar = new C58244b();
        }
        this.mWatermarkCreator = bVar;
        this.mWatermarkDisplayer = new C58249a(this.mContext, this.mWatermarkCache, bVar, this.mExecutor);
        this.mWatermarkCache.addWatermarkInfoListener(this.mWatermarkInfoListener);
        this.isInited = true;
    }

    public void addWatermarkToBitmap(Bitmap bitmap, IAttachToBitmapCallback iAttachToBitmapCallback) {
        if (checkInit()) {
            this.mWatermarkDisplayer.mo197308a(bitmap, iAttachToBitmapCallback);
        }
    }

    public void attachBackgroundWatermark(View view, IAttachResultCallback iAttachResultCallback) {
        if (checkInit()) {
            this.mWatermarkDisplayer.mo197309a(view, iAttachResultCallback);
        }
    }

    public void attachWatermark(Dialog dialog, IAttachResultCallback iAttachResultCallback) {
        if (checkInit()) {
            this.mWatermarkDisplayer.mo197307a(dialog, iAttachResultCallback);
        }
    }

    public void putFgData(String str, boolean z) {
        this.mFeatureGatingMap.put(str, Boolean.valueOf(z));
    }

    public void attachWatermark(Activity activity, IAttachResultCallback iAttachResultCallback) {
        if (checkInit()) {
            this.mWatermarkDisplayer.mo197305a(activity, iAttachResultCallback, C58219a.m225864a());
        }
    }

    public void generateDrawable(final WatermarkInfo watermarkInfo, final AbstractC58289c<Drawable> cVar) {
        if (checkInit()) {
            this.mExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.watermark.Watermark.RunnableC582132 */

                public void run() {
                    Watermark.this.mWatermarkCreator.mo197292a(Watermark.this.mContext, watermarkInfo, new AbstractC58289c<Drawable>() {
                        /* class com.ss.android.lark.watermark.Watermark.RunnableC582132.C582141 */

                        /* renamed from: a */
                        public void mo197242a(final Drawable drawable) {
                            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                                /* class com.ss.android.lark.watermark.Watermark.RunnableC582132.C582141.RunnableC582151 */

                                public void run() {
                                    if (cVar != null) {
                                        cVar.mo197242a(drawable);
                                    }
                                }
                            });
                        }

                        @Override // com.ss.android.lark.watermark.p2929f.AbstractC58289c
                        /* renamed from: a */
                        public void mo197241a(final C58286a aVar) {
                            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                                /* class com.ss.android.lark.watermark.Watermark.RunnableC582132.C582141.RunnableC582162 */

                                public void run() {
                                    if (cVar != null) {
                                        cVar.mo197241a(aVar);
                                    }
                                }
                            });
                        }
                    });
                }
            });
        }
    }

    public void attachWatermark(FrameLayout frameLayout, IAttachResultCallback iAttachResultCallback) {
        if (checkInit()) {
            this.mWatermarkDisplayer.mo197311a(frameLayout, iAttachResultCallback);
        }
    }
}
