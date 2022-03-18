package com.ss.android.lark.rust.track.impl;

import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.rust.track.impl.RustTrackEntity;
import com.ss.android.lark.rust.track.service.AbstractC53193a;
import com.ss.android.lark.statistics.Statistics;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.rust.track.impl.e */
public class C53177e {

    /* renamed from: a */
    private AbstractC53193a f131485a = new AbstractC53193a() {
        /* class com.ss.android.lark.rust.track.impl.C53177e.C531781 */

        @Override // com.ss.android.lark.rust.track.service.AbstractC53193a
        /* renamed from: a */
        public void mo181602a(RustTrackEntity rustTrackEntity) {
            C53177e.this.mo181601a(rustTrackEntity);
        }
    };

    /* renamed from: a */
    public AbstractC53193a mo181600a() {
        return this.f131485a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.rust.track.impl.e$2 */
    public static /* synthetic */ class C531792 {

        /* renamed from: a */
        static final /* synthetic */ int[] f131487a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.rust.track.impl.RustTrackEntity$TrackType[] r0 = com.ss.android.lark.rust.track.impl.RustTrackEntity.TrackType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.rust.track.impl.C53177e.C531792.f131487a = r0
                com.ss.android.lark.rust.track.impl.RustTrackEntity$TrackType r1 = com.ss.android.lark.rust.track.impl.RustTrackEntity.TrackType.TEA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.rust.track.impl.C53177e.C531792.f131487a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.rust.track.impl.RustTrackEntity$TrackType r1 = com.ss.android.lark.rust.track.impl.RustTrackEntity.TrackType.SLARDAR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.rust.track.impl.C53177e.C531792.<clinit>():void");
        }
    }

    /* renamed from: b */
    private void m205800b(RustTrackEntity rustTrackEntity) {
        Statistics.sendEvent(rustTrackEntity.getKey(), m205799a(rustTrackEntity.getParams()));
    }

    /* renamed from: a */
    private JSONObject m205799a(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* renamed from: c */
    private void m205801c(RustTrackEntity rustTrackEntity) {
        String key = rustTrackEntity.getKey();
        int status = rustTrackEntity.getStatus();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", m205799a(rustTrackEntity.getCategory()));
            jSONObject.put("metric", m205799a(rustTrackEntity.getMetric()));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("placeholder", 1);
            MonitorUtils.monitorStatusAndDuration(key, status, jSONObject2, jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo181601a(RustTrackEntity rustTrackEntity) {
        if (rustTrackEntity != null) {
            RustTrackEntity.TrackType trackType = rustTrackEntity.getTrackType();
            Log.m165389i("RustPushTrack", "onPushRustTrack eventName:" + rustTrackEntity.getKey() + " type:" + trackType);
            int i = C531792.f131487a[trackType.ordinal()];
            if (i == 1) {
                m205800b(rustTrackEntity);
            } else if (i == 2) {
                m205801c(rustTrackEntity);
            }
        }
    }
}
