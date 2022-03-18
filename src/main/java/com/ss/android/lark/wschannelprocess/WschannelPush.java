package com.ss.android.lark.wschannelprocess;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.GetWebSocketStatusResponse;
import com.bytedance.lark.pb.basic.v1.PushBackgroundNotification;
import com.bytedance.lark.pb.statistics.v1.Track;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.wschannelprocess.pushtrack.C59313a;
import com.ss.android.lark.wschannelprocess.pushtrack.RustTrackEntity;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public class WschannelPush {

    /* renamed from: a */
    private List<AbstractC59293d> f147251a;

    /* renamed from: b */
    private List<AbstractC59292c> f147252b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.wschannelprocess.WschannelPush$b */
    public static class C59291b {

        /* renamed from: a */
        public static final WschannelPush f147264a = new WschannelPush();
    }

    /* renamed from: com.ss.android.lark.wschannelprocess.WschannelPush$c */
    public interface AbstractC59292c {
        /* renamed from: a */
        void mo133177a(C59290a aVar);
    }

    /* renamed from: com.ss.android.lark.wschannelprocess.WschannelPush$d */
    public interface AbstractC59293d {
        /* renamed from: a */
        void mo201566a(WebSocketStatus webSocketStatus);
    }

    public enum WebSocketStatus {
        OPENING(1),
        SUCCESS(2),
        CLOSE(3),
        CLOSED_FOR_LONG_TIME(4);
        
        private final int value;

        public int getValue() {
            return this.value;
        }

        public static WebSocketStatus fromValue(int i) {
            if (i == 1) {
                return OPENING;
            }
            if (i == 2) {
                return SUCCESS;
            }
            if (i == 3) {
                return CLOSE;
            }
            if (i != 4) {
                return null;
            }
            return CLOSED_FOR_LONG_TIME;
        }

        private WebSocketStatus(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.wschannelprocess.WschannelPush$a */
    public static final class C59290a {

        /* renamed from: a */
        private String f147259a;

        /* renamed from: b */
        private String f147260b;

        /* renamed from: c */
        private String f147261c;

        /* renamed from: d */
        private String f147262d;

        /* renamed from: e */
        private String f147263e;

        /* renamed from: a */
        public String mo201561a() {
            return this.f147259a;
        }

        /* renamed from: b */
        public String mo201562b() {
            return this.f147260b;
        }

        /* renamed from: c */
        public String mo201563c() {
            return this.f147261c;
        }

        /* renamed from: d */
        public String mo201564d() {
            return this.f147262d;
        }

        /* renamed from: e */
        public String mo201565e() {
            return this.f147263e;
        }

        public C59290a(String str, String str2, String str3, String str4, String str5) {
            this.f147259a = str;
            this.f147260b = str2;
            this.f147261c = str3;
            this.f147262d = str4;
            this.f147263e = str5;
        }
    }

    /* renamed from: a */
    public static final WschannelPush m230229a() {
        return C59291b.f147264a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.wschannelprocess.WschannelPush$4 */
    public static /* synthetic */ class C592894 {

        /* renamed from: a */
        static final /* synthetic */ int[] f147258a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.wschannelprocess.pushtrack.RustTrackEntity$TrackType[] r0 = com.ss.android.lark.wschannelprocess.pushtrack.RustTrackEntity.TrackType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.wschannelprocess.WschannelPush.C592894.f147258a = r0
                com.ss.android.lark.wschannelprocess.pushtrack.RustTrackEntity$TrackType r1 = com.ss.android.lark.wschannelprocess.pushtrack.RustTrackEntity.TrackType.TEA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.wschannelprocess.WschannelPush.C592894.f147258a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.wschannelprocess.pushtrack.RustTrackEntity$TrackType r1 = com.ss.android.lark.wschannelprocess.pushtrack.RustTrackEntity.TrackType.SLARDAR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.wschannelprocess.WschannelPush.C592894.<clinit>():void");
        }
    }

    private WschannelPush() {
        this.f147251a = new CopyOnWriteArrayList();
        this.f147252b = new CopyOnWriteArrayList();
    }

    /* renamed from: b */
    public void mo201558b() {
        C53248k.m205912a().mo181698a(Command.PUSH_TRACK, "rustPushTrack", new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.wschannelprocess.WschannelPush.C592883 */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                WschannelPush.this.mo201556a(bArr);
            }
        });
    }

    /* renamed from: a */
    public void mo201554a(AbstractC59292c cVar) {
        C53246j.m205910a(this.f147252b, cVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.wschannelprocess.WschannelPush.C592862 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181697a(Command.PUSH_BACKGROUND_NOTIFICATION, new C53248k.AbstractC53250a() {
                    /* class com.ss.android.lark.wschannelprocess.WschannelPush.C592862.C592871 */

                    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                        WschannelPush.this.mo201559b(bArr, str, z, z2);
                    }
                });
            }
        });
    }

    /* renamed from: b */
    private void m230232b(RustTrackEntity rustTrackEntity) {
        Log.m165397w("WschannelPush", "trackToSlardar receive unexcepted slardar hitpoint " + rustTrackEntity);
    }

    /* renamed from: a */
    public void mo201555a(AbstractC59293d dVar) {
        C53246j.m205910a(this.f147251a, dVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.wschannelprocess.WschannelPush.C592841 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181697a(Command.PUSH_WEB_SOCKET_STATUS, new C53248k.AbstractC53250a() {
                    /* class com.ss.android.lark.wschannelprocess.WschannelPush.C592841.C592851 */

                    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                        WschannelPush.this.mo201557a(bArr, str, z, z2);
                    }
                });
            }
        });
    }

    /* renamed from: a */
    private JSONObject m230230a(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (JSONException e) {
                Log.m165384e("WschannelPush", "generateJsonObj exeception", e);
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private void m230231a(RustTrackEntity rustTrackEntity) {
        String key = rustTrackEntity.getKey();
        Log.m165389i("WschannelPush", "trackToTea receive tea hitpoint, servicename is " + key);
        if (!key.equals("wschannel_push_monitor")) {
            Log.m165389i("WschannelPush", "trackToTea receive unexcepted tea hitpoint, so droped!");
        } else {
            C59304c.m230268a().mo201572a(key, m230230a(rustTrackEntity.getParams()));
        }
    }

    /* renamed from: a */
    public void mo201556a(byte[] bArr) {
        try {
            Track decode = Track.ADAPTER.decode(bArr);
            if (decode == null) {
                Log.m165383e("WschannelPush", "onPushRustTrack entity is null");
                return;
            }
            RustTrackEntity a = C59313a.m230312a(decode);
            RustTrackEntity.TrackType trackType = a.getTrackType();
            Log.m165389i("WschannelPush", "onPushRustTrack eventName:" + a.getKey() + " type:" + trackType);
            int i = C592894.f147258a[trackType.ordinal()];
            if (i == 1) {
                m230231a(a);
            } else if (i == 2) {
                m230232b(a);
            }
        } catch (Exception e) {
            Log.m165383e("WschannelPush", "onPushRustTrack " + e);
        }
    }

    /* renamed from: b */
    public void mo201559b(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            PushBackgroundNotification decode = PushBackgroundNotification.ADAPTER.decode(bArr);
            C59290a aVar = new C59290a(decode.title, decode.content, decode.extra, decode.collapse_id, decode.msg_type);
            for (AbstractC59292c cVar : this.f147252b) {
                cVar.mo133177a(aVar);
            }
        } catch (Exception e) {
            Log.m165383e("WschannelPush", e.getMessage());
        }
    }

    /* renamed from: a */
    public void mo201557a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            GetWebSocketStatusResponse.Status status = GetWebSocketStatusResponse.ADAPTER.decode(bArr).status;
            Log.m165389i("WschannelPush", "onPushWebSocketStatus status = " + status);
            WebSocketStatus fromValue = WebSocketStatus.fromValue(status.getValue());
            for (AbstractC59293d dVar : this.f147251a) {
                dVar.mo201566a(fromValue);
            }
        } catch (Exception e) {
            Log.m165383e("WschannelPush", e.getMessage());
        }
    }
}
