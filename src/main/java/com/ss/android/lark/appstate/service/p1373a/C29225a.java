package com.ss.android.lark.appstate.service.p1373a;

import android.os.SystemClock;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.NoticeClientEventRequest;
import com.bytedance.lark.pb.basic.v1.SetInOfflineModeRequest;
import com.bytedance.lark.pb.basic.v1.SetInofflineModeResponse;
import com.bytedance.lark.pb.basic.v1.TrafficData;
import com.bytedance.lark.pb.statistics.v1.SetTrafficDataRequest;
import com.bytedance.lark.pb.statistics.v1.SetTrafficDataResponse;
import com.bytedance.lark.pb.tool.v1.TakeTrafficDataRequest;
import com.bytedance.lark.pb.tool.v1.TakeTrafficDataResponse;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.appstate.p1372a.C29224a;
import com.ss.android.lark.appstate.service.IClientService;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;

/* renamed from: com.ss.android.lark.appstate.service.a.a */
public class C29225a implements IClientService {

    /* renamed from: a */
    private volatile boolean f73174a = true;

    /* renamed from: com.ss.android.lark.appstate.service.a.a$a */
    private static final class C29230a {

        /* renamed from: a */
        public static final C29225a f73179a = new C29225a();
    }

    /* renamed from: c */
    public static C29225a m107494c() {
        return C29230a.f73179a;
    }

    @Override // com.ss.android.lark.appstate.service.IClientService
    /* renamed from: a */
    public void mo103632a() {
        m107493a(IClientService.ClientEvent.MEMORY_WARNING, null);
    }

    /* renamed from: d */
    private long m107496d() {
        long elapsedRealtimeNanos;
        synchronized (this) {
            elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        }
        return elapsedRealtimeNanos;
    }

    @Override // com.ss.android.lark.appstate.service.IClientService
    /* renamed from: b */
    public C29224a mo103635b() {
        return SdkSender.syncSendMayError(Command.TAKE_TRAFFIC_DATA, new TakeTrafficDataRequest.C19761a(), new SdkSender.IParser<C29224a>() {
            /* class com.ss.android.lark.appstate.service.p1373a.C29225a.C292294 */

            /* renamed from: a */
            public C29224a parse(byte[] bArr) throws IOException {
                TrafficData trafficData = TakeTrafficDataResponse.ADAPTER.decode(bArr).data;
                if (trafficData != null) {
                    return new C29224a(trafficData.wifi_recv.longValue(), trafficData.wifi_send.longValue(), trafficData.mobile_recv.longValue(), trafficData.mobile_send.longValue());
                }
                return null;
            }
        }).f131572a;
    }

    @Override // com.ss.android.lark.appstate.service.IClientService
    /* renamed from: a */
    public void mo103633a(IClientService.ClientEvent clientEvent) {
        m107493a(clientEvent, null);
    }

    /* renamed from: c */
    private void m107495c(boolean z) {
        IClientService.ClientEvent clientEvent;
        long d = m107496d();
        if (z) {
            clientEvent = IClientService.ClientEvent.ENTER_FOREGROUND;
        } else {
            clientEvent = IClientService.ClientEvent.ENTER_BACKGROUND;
        }
        m107493a(clientEvent.updateTime(d), null);
    }

    @Override // com.ss.android.lark.appstate.service.IClientService
    /* renamed from: a */
    public void mo103634a(boolean z) {
        synchronized (this) {
            if (this.f73174a == z) {
                C53241h.m205898b("ClientService", "notice client event: isAppFont equal last, isAppFont: " + z);
                return;
            }
            this.f73174a = z;
            m107495c(z);
        }
    }

    @Override // com.ss.android.lark.appstate.service.IClientService
    /* renamed from: b */
    public void mo103636b(boolean z) {
        SetInOfflineModeRequest.C15272a a = new SetInOfflineModeRequest.C15272a().mo55585a(Boolean.valueOf(z));
        C53241h.m205898b("ClientService", "setOfflineMode isOffline = " + z);
        SdkSender.syncSendMayError(Command.SET_IN_OFFLINE_MODE, a, new SdkSender.IParser<SetInofflineModeResponse>() {
            /* class com.ss.android.lark.appstate.service.p1373a.C29225a.C292272 */

            /* renamed from: a */
            public SetInofflineModeResponse parse(byte[] bArr) throws IOException {
                return SetInofflineModeResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* renamed from: a */
    private void m107493a(IClientService.ClientEvent clientEvent, IGetDataCallback<Boolean> iGetDataCallback) {
        C53241h.m205898b("ClientService", "notice client event: " + clientEvent.name());
        NoticeClientEventRequest.C15097a a = new NoticeClientEventRequest.C15097a().mo55075a(NoticeClientEventRequest.Event.fromValue(clientEvent.getNumber()));
        if (clientEvent.updateTime() != 0) {
            a.mo55076a(Long.valueOf(clientEvent.updateTime()));
        }
        SdkSender.asynSendRequestNonWrap(Command.NOTICE_CLIENT_EVENT, a, iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.appstate.service.p1373a.C29225a.C292261 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                return true;
            }
        });
    }

    @Override // com.ss.android.lark.appstate.service.IClientService
    /* renamed from: a */
    public C29224a mo103631a(long j, long j2, long j3, long j4) {
        return SdkSender.syncSendMayError(Command.SET_TRAFFIC_DATA, new SetTrafficDataRequest.C19417a().mo66110a(new TrafficData.C15350a().mo55759a(Long.valueOf(j)).mo55761b(Long.valueOf(j2)).mo55762c(Long.valueOf(j3)).mo55763d(Long.valueOf(j4)).build()), new SdkSender.IParser<C29224a>() {
            /* class com.ss.android.lark.appstate.service.p1373a.C29225a.C292283 */

            /* renamed from: a */
            public C29224a parse(byte[] bArr) throws IOException {
                TrafficData trafficData = SetTrafficDataResponse.ADAPTER.decode(bArr).sdk_traffic_data;
                if (trafficData != null) {
                    return new C29224a(trafficData.wifi_recv.longValue(), trafficData.wifi_send.longValue(), trafficData.mobile_recv.longValue(), trafficData.mobile_send.longValue());
                }
                return null;
            }
        }).f131572a;
    }
}
