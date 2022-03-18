package com.ss.ttvideoengine;

import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import java.util.HashMap;

public class VideoInfoCollector {
    private static final VideoInfoCollector ourInstance = new VideoInfoCollector();
    private HashMap<Long, TTVideoEngine> mActiveEngines = new HashMap<>();
    private long mPlayConsumedSize;
    private long mWastedDataSize;

    public static VideoInfoCollector getInstance() {
        return ourInstance;
    }

    public static class myVideoCollectorAddConsumeSize implements Runnable {
        long mConsumeSize;

        public void run() {
            VideoInfoCollector instance = VideoInfoCollector.getInstance();
            if (instance != null) {
                instance.addPlayConsumedSize(this.mConsumeSize);
            }
        }

        public myVideoCollectorAddConsumeSize(long j) {
            this.mConsumeSize = j;
        }
    }

    /* access modifiers changed from: package-private */
    public static class myVideoCollectorUnregister implements Runnable {
        long mSerial;

        public void run() {
            VideoInfoCollector instance = VideoInfoCollector.getInstance();
            if (instance != null) {
                instance.unregistEngine(this.mSerial);
            }
        }

        public myVideoCollectorUnregister(long j) {
            this.mSerial = j;
        }
    }

    private VideoInfoCollector() {
    }

    public synchronized long getPlayConsumedSize() {
        long j;
        j = this.mPlayConsumedSize;
        this.mPlayConsumedSize = 0;
        return j;
    }

    /* access modifiers changed from: package-private */
    public static class myVideoCollectorRegister implements Runnable {
        long mSerial;
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public void run() {
            VideoInfoCollector instance;
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine != null && (instance = VideoInfoCollector.getInstance()) != null) {
                instance.registEngine(this.mSerial, tTVideoEngine);
            }
        }

        public myVideoCollectorRegister(TTVideoEngine tTVideoEngine, long j) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
            this.mSerial = j;
        }
    }

    public synchronized long getPlayWastDataSize() {
        long j;
        j = this.mWastedDataSize;
        this.mWastedDataSize = 0;
        try {
            for (TTVideoEngine tTVideoEngine : this.mActiveEngines.values()) {
                long longOption = tTVideoEngine.getLongOption(81);
                if (longOption > 0) {
                    j += longOption;
                }
            }
            TTVideoEngineLog.m256500d("VideoInfoCollecor", "get play waste data size: " + j);
        } catch (Exception unused) {
            return j;
        }
        return j;
    }

    public synchronized void addPlayConsumedSize(long j) {
        if (j > 0) {
            this.mPlayConsumedSize += j;
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void unregistEngine(long r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.HashMap<java.lang.Long, com.ss.ttvideoengine.TTVideoEngine> r0 = r5.mActiveEngines     // Catch:{ Exception -> 0x0055, all -> 0x0052 }
            java.lang.Long r1 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x0055, all -> 0x0052 }
            boolean r0 = r0.containsKey(r1)     // Catch:{ Exception -> 0x0055, all -> 0x0052 }
            if (r0 == 0) goto L_0x0055
            java.util.HashMap<java.lang.Long, com.ss.ttvideoengine.TTVideoEngine> r0 = r5.mActiveEngines     // Catch:{ Exception -> 0x0055, all -> 0x0052 }
            java.lang.Long r1 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x0055, all -> 0x0052 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x0055, all -> 0x0052 }
            com.ss.ttvideoengine.TTVideoEngine r0 = (com.ss.ttvideoengine.TTVideoEngine) r0     // Catch:{ Exception -> 0x0055, all -> 0x0052 }
            r1 = 81
            long r0 = r0.getLongOption(r1)     // Catch:{ Exception -> 0x0055, all -> 0x0052 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x002a
            long r2 = r5.mWastedDataSize     // Catch:{ Exception -> 0x0055, all -> 0x0052 }
            long r2 = r2 + r0
            r5.mWastedDataSize = r2     // Catch:{ Exception -> 0x0055, all -> 0x0052 }
        L_0x002a:
            java.util.HashMap<java.lang.Long, com.ss.ttvideoengine.TTVideoEngine> r2 = r5.mActiveEngines     // Catch:{ Exception -> 0x0055, all -> 0x0052 }
            java.lang.Long r3 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x0055, all -> 0x0052 }
            r2.remove(r3)     // Catch:{ Exception -> 0x0055, all -> 0x0052 }
            java.lang.String r2 = "VideoInfoCollecor"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0055, all -> 0x0052 }
            r3.<init>()     // Catch:{ Exception -> 0x0055, all -> 0x0052 }
            java.lang.String r4 = "delete engine: "
            r3.append(r4)     // Catch:{ Exception -> 0x0055, all -> 0x0052 }
            r3.append(r6)     // Catch:{ Exception -> 0x0055, all -> 0x0052 }
            java.lang.String r6 = ", waste data: "
            r3.append(r6)     // Catch:{ Exception -> 0x0055, all -> 0x0052 }
            r3.append(r0)     // Catch:{ Exception -> 0x0055, all -> 0x0052 }
            java.lang.String r6 = r3.toString()     // Catch:{ Exception -> 0x0055, all -> 0x0052 }
            com.ss.ttvideoengine.utils.TTVideoEngineLog.m256500d(r2, r6)     // Catch:{ Exception -> 0x0055, all -> 0x0052 }
            goto L_0x0055
        L_0x0052:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L_0x0055:
            monitor-exit(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.VideoInfoCollector.unregistEngine(long):void");
    }

    public synchronized void registEngine(long j, TTVideoEngine tTVideoEngine) {
        if (!this.mActiveEngines.containsKey(Long.valueOf(j))) {
            this.mActiveEngines.put(Long.valueOf(j), tTVideoEngine);
            TTVideoEngineLog.m256500d("VideoInfoCollecor", "new engine: " + j);
        }
    }
}
