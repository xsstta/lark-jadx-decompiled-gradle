package com.he;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;

public final class Monitor {
    public static Impl impl = new Impl() {
        /* class com.he.Monitor.C233681 */

        @Override // com.he.Monitor.Impl
        public void onHeliumAddViewFail() {
            AppBrandLogger.m52829e("helium-monitor", "onHeliumAddViewFail");
        }

        @Override // com.he.Monitor.Impl
        public void onHeliumSetupFail() {
            AppBrandLogger.m52829e("helium-monitor", "onHeliumSetupFail");
        }

        @Override // com.he.Monitor.Impl
        public void onLoadEffectFail(Throwable th) {
            AppBrandLogger.eWithThrowable("helium-monitor", "onLoadEffectFail", th);
        }

        @Override // com.he.Monitor.Impl
        public void onRTCLogReport(String str, String str2) {
            AppBrandLogger.m52828d("helium-monitor", "onRTCLogReport" + str + str2);
        }

        @Override // com.he.Monitor.Impl
        public void onSmashModelMapFail(String str, Throwable th) {
            AppBrandLogger.eWithThrowable("helium-monitor", "onSmashModelMap:" + str, th);
        }

        @Override // com.he.Monitor.Impl
        public void onAurumInitFail(int i, int i2) {
            AppBrandLogger.m52829e("helium-monitor", "onAurumInitFail:" + i + ", result:" + i2);
        }

        @Override // com.he.Monitor.Impl
        public void onSmashModelDownloadSuccess(String str, long j) {
            AppBrandLogger.m52828d("helium-monitor", "onSmashModelDownload:" + str + ", duration:" + j);
        }

        @Override // com.he.Monitor.Impl
        public void onCameraOpenFail(int i, int i2, Throwable th) {
            AppBrandLogger.eWithThrowable("helium-monitor", "onCameraOpenFail:" + i + ", retries:" + i2, th);
        }

        @Override // com.he.Monitor.Impl
        public void onAsyncCompile(int i, int i2, int i3) {
            AppBrandLogger.m52828d("helium-monitor", "onAsyncCompile:" + i + ", duration:" + i2 + " cache_size:" + i3);
        }

        @Override // com.he.Monitor.Impl
        public void onSmashModelDownloadFail(String str, int i, long j, Throwable th) {
            AppBrandLogger.eWithThrowable("helium-monitor", "onSmashModelDownload:" + str + ", status:" + i + ", duration:" + j, th);
        }
    };

    public interface Impl {
        void onAsyncCompile(int i, int i2, int i3);

        void onAurumInitFail(int i, int i2);

        void onCameraOpenFail(int i, int i2, Throwable th);

        void onHeliumAddViewFail();

        void onHeliumSetupFail();

        void onLoadEffectFail(Throwable th);

        void onRTCLogReport(String str, String str2);

        void onSmashModelDownloadFail(String str, int i, long j, Throwable th);

        void onSmashModelDownloadSuccess(String str, long j);

        void onSmashModelMapFail(String str, Throwable th);
    }
}
