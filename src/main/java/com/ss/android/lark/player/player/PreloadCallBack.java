package com.ss.android.lark.player.player;

import androidx.lifecycle.C1177w;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.player.entity.DataSource;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.IPreLoaderItemCallBackListener;
import com.ss.ttvideoengine.PreLoaderItemCallBackInfo;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/player/player/PreloadCallBack;", "Lcom/ss/ttvideoengine/IPreLoaderItemCallBackListener;", "player", "Lcom/ss/android/lark/player/player/TTEnginePlayer;", "dataSource", "Lcom/ss/android/lark/player/entity/DataSource;", "position", "", "(Lcom/ss/android/lark/player/player/TTEnginePlayer;Lcom/ss/android/lark/player/entity/DataSource;I)V", "getDataSource", "()Lcom/ss/android/lark/player/entity/DataSource;", "playerRef", "Ljava/lang/ref/WeakReference;", "getPosition", "()I", "preloadItemInfo", "", "info", "Lcom/ss/ttvideoengine/PreLoaderItemCallBackInfo;", "videoview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.player.c.n */
final class PreloadCallBack implements IPreLoaderItemCallBackListener {

    /* renamed from: a */
    public final WeakReference<C52114o> f129291a;

    /* renamed from: b */
    private final DataSource f129292b;

    /* renamed from: c */
    private final int f129293c;

    /* renamed from: a */
    public final DataSource mo178516a() {
        return this.f129292b;
    }

    /* renamed from: b */
    public final int mo178517b() {
        return this.f129293c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.player.c.n$a */
    static final class RunnableC52113a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PreloadCallBack f129294a;

        RunnableC52113a(PreloadCallBack nVar) {
            this.f129294a = nVar;
        }

        public final void run() {
            C1177w<Boolean> showPreloading = this.f129294a.mo178516a().getShowPreloading();
            Intrinsics.checkExpressionValueIsNotNull(showPreloading, "dataSource.showPreloading");
            showPreloading.mo5929b((Boolean) false);
            Log.m165389i("TTEnginePlayerListeners", "restart play, and seek to: " + this.f129294a.mo178517b());
            C52114o oVar = this.f129294a.f129291a.get();
            if (oVar != null) {
                oVar.mo178491a(this.f129294a.mo178516a());
            }
            C52114o oVar2 = this.f129294a.f129291a.get();
            if (oVar2 != null) {
                oVar2.mo178496b(this.f129294a.mo178517b());
            }
        }
    }

    @Override // com.ss.ttvideoengine.IPreLoaderItemCallBackListener
    public void preloadItemInfo(PreLoaderItemCallBackInfo preLoaderItemCallBackInfo) {
        Integer num;
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("preload back code: ");
        Long l = null;
        if (preLoaderItemCallBackInfo != null) {
            num = Integer.valueOf(preLoaderItemCallBackInfo.getKey());
        } else {
            num = null;
        }
        sb.append(num);
        Log.m165389i("TTEnginePlayerListeners", sb.toString());
        if (preLoaderItemCallBackInfo != null && preLoaderItemCallBackInfo.getKey() == 2) {
            DataLoaderHelper.DataLoaderTaskProgressInfo dataLoaderTaskProgressInfo = preLoaderItemCallBackInfo.preloadDataInfo;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("preload success, cache info: ");
            if (dataLoaderTaskProgressInfo != null) {
                str = dataLoaderTaskProgressInfo.mKey;
            } else {
                str = null;
            }
            sb2.append(str);
            sb2.append(", ");
            if (dataLoaderTaskProgressInfo != null) {
                str2 = dataLoaderTaskProgressInfo.mLocalFilePath;
            } else {
                str2 = null;
            }
            sb2.append(str2);
            sb2.append(", ");
            if (dataLoaderTaskProgressInfo != null) {
                l = Long.valueOf(dataLoaderTaskProgressInfo.mMediaSize);
            }
            sb2.append(l);
            sb2.append('}');
            Log.m165389i("TTEnginePlayerListeners", sb2.toString());
            UICallbackExecutor.execute(new RunnableC52113a(this));
        }
    }

    public PreloadCallBack(C52114o oVar, DataSource dataSource, int i) {
        Intrinsics.checkParameterIsNotNull(oVar, "player");
        Intrinsics.checkParameterIsNotNull(dataSource, "dataSource");
        this.f129292b = dataSource;
        this.f129293c = i;
        this.f129291a = new WeakReference<>(oVar);
    }
}
