package com.larksuite.component.blockit.p1068c;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.sync.v1.SubscribeStatusCode;
import com.bytedance.lark.pb.sync.v1.SubscribeTopicRequest;
import com.bytedance.lark.pb.sync.v1.SubscribeTopicResponse;
import com.bytedance.lark.pb.sync.v1.SyncEventType;
import com.bytedance.lark.pb.sync.v1.SyncHeader;
import com.bytedance.lark.pb.sync.v1.SyncPushEvent;
import com.bytedance.lark.pb.sync.v1.SyncPushMessage;
import com.bytedance.lark.pb.sync.v1.UnsubscribeSyncTopicRequest;
import com.bytedance.lark.pb.sync.v1.UnsubscribeSyncTopicResponse;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.blockit.entity.BlockEntityResp;
import com.larksuite.component.blockit.entity.OpenMessageResp;
import com.larksuite.component.blockit.service.AbstractC24149b;
import com.larksuite.component.blockit.service.AbstractC24150c;
import com.larksuite.component.blockit.service.C24141a;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.sdk.SdkSender;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.blockit.c.a */
public class C24053a implements AbstractC24150c {

    /* renamed from: a */
    public final List<String> f59456a;

    /* renamed from: b */
    public final ConcurrentHashMap<String, C24061b> f59457b;

    /* renamed from: c */
    public int f59458c;

    /* renamed from: d */
    private ScheduledFuture f59459d;

    /* renamed from: e */
    private HashMap<String, List<AbstractC24149b>> f59460e;

    /* renamed from: f */
    private final Runnable f59461f;

    /* renamed from: com.larksuite.component.blockit.c.a$a */
    public static final class C24060a {

        /* renamed from: a */
        public static final C24053a f59475a = new C24053a();
    }

    /* renamed from: a */
    public static C24053a m87874a() {
        return C24060a.f59475a;
    }

    /* renamed from: a */
    public void mo86306a(String str, String str2, long j, C24061b bVar) {
        try {
            if (j > bVar.f59477b) {
                bVar.f59477b = j;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ShareHitPoint.f121869d, "customMessage");
                jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, str2);
                mo86307a(str, "onTypedMessage", jSONObject.toString());
            }
        } catch (JSONException e) {
            AppBrandLogger.m52829e("BlockSync", e.getMessage());
        }
    }

    /* renamed from: a */
    public synchronized void mo86307a(String str, String str2, String str3) {
        List<AbstractC24149b> list = this.f59460e.get(str);
        if (list != null) {
            for (AbstractC24149b bVar : list) {
                bVar.mo86663b(str2, str3);
            }
        }
    }

    /* renamed from: b */
    private void m87879b() {
        C53248k.m205912a().mo181697a(Command.SYNC_PUSH_MESSAGE_BLOCK, new C53248k.AbstractC53250a() {
            /* class com.larksuite.component.blockit.p1068c.$$Lambda$a$tQBblgbDqg5pVXjFk0hqdt8MLx8 */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C24053a.lambda$tQBblgbDqg5pVXjFk0hqdt8MLx8(C24053a.this, bArr, str, z, z2);
            }
        });
    }

    /* renamed from: c */
    private void m87882c() {
        C53248k.m205912a().mo181697a(Command.SYNC_PUSH_EVENT_BLOCK, new C53248k.AbstractC53250a() {
            /* class com.larksuite.component.blockit.p1068c.$$Lambda$a$txVbk1u9I6yhYCpuSlneUtPEGCc */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C24053a.lambda$txVbk1u9I6yhYCpuSlneUtPEGCc(C24053a.this, bArr, str, z, z2);
            }
        });
    }

    private C24053a() {
        this.f59456a = new CopyOnWriteArrayList();
        this.f59457b = new ConcurrentHashMap<>();
        this.f59458c = 3;
        this.f59460e = new HashMap<>();
        this.f59461f = new Runnable() {
            /* class com.larksuite.component.blockit.p1068c.$$Lambda$a$dOWlnQ1hvZWTkh_eRPZo8WxiyEA */

            public final void run() {
                C24053a.lambda$dOWlnQ1hvZWTkh_eRPZo8WxiyEA(C24053a.this);
            }
        };
        m87879b();
        m87882c();
    }

    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m87883d() {
        this.f59458c += 3;
        this.f59459d = null;
        for (String str : new ArrayList(this.f59456a)) {
            m87876a(str, this.f59458c);
        }
    }

    /* renamed from: a */
    private void m87875a(final String str) {
        C24141a.m88173a().mo86656b(str, new IGetDataCallback<BlockEntityResp>() {
            /* class com.larksuite.component.blockit.p1068c.C24053a.C240552 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C24053a.this.mo86305a(str, (Long) 0L, (Long) -1L);
            }

            /* renamed from: a */
            public void onSuccess(BlockEntityResp blockEntityResp) {
                long j;
                if (blockEntityResp == null) {
                    j = 0;
                } else {
                    j = blockEntityResp.version;
                }
                C24053a.this.mo86305a(str, Long.valueOf(j), (Long) -1L);
                if (blockEntityResp != null && blockEntityResp.entity != null) {
                    C24053a.this.mo86307a(str, "onResourceChange", blockEntityResp.entity.getSourceData());
                }
            }
        });
        C24141a.m88173a().mo86657c(str, new IGetDataCallback<OpenMessageResp>() {
            /* class com.larksuite.component.blockit.p1068c.C24053a.C240563 */

            /* renamed from: a */
            public void onSuccess(OpenMessageResp openMessageResp) {
                long j;
                C24053a aVar = C24053a.this;
                String str = str;
                if (openMessageResp == null) {
                    j = 0;
                } else {
                    j = openMessageResp.version;
                }
                aVar.mo86305a(str, (Long) -1L, Long.valueOf(j));
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C24053a.this.mo86305a(str, (Long) -1L, (Long) 0L);
            }
        });
    }

    /* renamed from: b */
    private void m87880b(final String str) {
        C24141a.m88173a().mo86656b(str, new IGetDataCallback<BlockEntityResp>() {
            /* class com.larksuite.component.blockit.p1068c.C24053a.C240585 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(BlockEntityResp blockEntityResp) {
                C24061b bVar;
                if (blockEntityResp != null && blockEntityResp.entity != null && (bVar = C24053a.this.f59457b.get(str)) != null && blockEntityResp.version > bVar.f59476a) {
                    bVar.f59476a = blockEntityResp.version;
                    C24053a.this.mo86307a(str, "onResourceChange", blockEntityResp.entity.getSourceData());
                }
            }
        });
        C24141a.m88173a().mo86657c(str, new IGetDataCallback<OpenMessageResp>() {
            /* class com.larksuite.component.blockit.p1068c.C24053a.C240596 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(OpenMessageResp openMessageResp) {
                C24061b bVar;
                if (openMessageResp != null && openMessageResp.content != null && (bVar = C24053a.this.f59457b.get(str)) != null) {
                    C24053a.this.mo86306a(str, openMessageResp.content, openMessageResp.version, bVar);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo86303a(int i) {
        AppBrandLogger.m52830i("BlockSync", "subscribeFail");
        this.f59458c = i;
        if (this.f59459d == null) {
            this.f59459d = CoreThreadPool.getDefault().getScheduleThreadPool().schedule(this.f59461f, (long) i, TimeUnit.SECONDS);
        }
    }

    /* renamed from: a */
    private void m87876a(final String str, final int i) {
        AppBrandLogger.m52830i("BlockSync", "doSubscribe:", str);
        if (this.f59456a.contains(str)) {
            SubscribeTopicRequest.C19431a a = new SubscribeTopicRequest.C19431a().mo66141a(new SyncHeader("lark_block_server", "e9971a63-1873-4248-bf60-cee84990b60c")).mo66142a(str);
            Command command = Command.SYNC_SUBSCRIBE_TOPIC;
            C240574 r2 = new IGetDataCallback<SubscribeTopicResponse>() {
                /* class com.larksuite.component.blockit.p1068c.C24053a.C240574 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C24053a.this.mo86303a(i);
                }

                /* renamed from: a */
                public void onSuccess(SubscribeTopicResponse subscribeTopicResponse) {
                    if (subscribeTopicResponse.code == SubscribeStatusCode.SUCCESS) {
                        C24053a.this.f59456a.remove(str);
                        if (C24053a.this.f59456a.size() == 0) {
                            C24053a.this.f59458c = 3;
                            return;
                        }
                        return;
                    }
                    C24053a.this.mo86303a(i);
                }
            };
            ProtoAdapter<SubscribeTopicResponse> protoAdapter = SubscribeTopicResponse.ADAPTER;
            protoAdapter.getClass();
            SdkSender.asynSendRequestNonWrap(command, a, r2, new SdkSender.IParser() {
                /* class com.larksuite.component.blockit.p1068c.$$Lambda$DJiLGdYZ5NRfLl06ktEgGKdbIC4 */

                @Override // com.ss.android.lark.sdk.SdkSender.IParser
                public final Object parse(byte[] bArr) {
                    return (SubscribeTopicResponse) ProtoAdapter.this.decode(bArr);
                }
            });
        }
    }

    @Override // com.larksuite.component.blockit.service.AbstractC24150c
    /* renamed from: b */
    public synchronized void mo86308b(final String str, AbstractC24149b bVar) {
        AppBrandLogger.m52830i("BlockSync", "unSubscribe:", str);
        List<AbstractC24149b> list = this.f59460e.get(str);
        if (list != null) {
            list.remove(bVar);
            if (list.size() <= 0) {
                this.f59460e.remove(str);
                this.f59456a.remove(str);
                UnsubscribeSyncTopicRequest.C19447a a = new UnsubscribeSyncTopicRequest.C19447a().mo66175a(new SyncHeader("lark_block_server", "e9971a63-1873-4248-bf60-cee84990b60c")).mo66176a(str);
                Command command = Command.SYNC_UNSUBSCRIBE_TOPIC;
                C240541 r1 = new IGetDataCallback<UnsubscribeSyncTopicResponse>() {
                    /* class com.larksuite.component.blockit.p1068c.C24053a.C240541 */

                    /* renamed from: a */
                    public void onSuccess(UnsubscribeSyncTopicResponse unsubscribeSyncTopicResponse) {
                        AppBrandLogger.m52830i("BlockSync", "unSubscribe success:", str);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        AppBrandLogger.m52830i("BlockSync", "unSubscribe fail:", str);
                    }
                };
                ProtoAdapter<UnsubscribeSyncTopicResponse> protoAdapter = UnsubscribeSyncTopicResponse.ADAPTER;
                protoAdapter.getClass();
                SdkSender.asynSendRequestNonWrap(command, a, r1, new SdkSender.IParser() {
                    /* class com.larksuite.component.blockit.p1068c.$$Lambda$tNRwO4k9W4hvY2u7xypVwxeXMqQ */

                    @Override // com.ss.android.lark.sdk.SdkSender.IParser
                    public final Object parse(byte[] bArr) {
                        return (UnsubscribeSyncTopicResponse) ProtoAdapter.this.decode(bArr);
                    }
                });
                this.f59457b.remove(str);
            }
        }
    }

    @Override // com.larksuite.component.blockit.service.AbstractC24150c
    /* renamed from: a */
    public synchronized void mo86304a(String str, AbstractC24149b bVar) {
        AppBrandLogger.m52830i("BlockSync", "subscribe:", str);
        if (!this.f59456a.contains(str)) {
            this.f59456a.add(str);
        }
        if (this.f59457b.get(str) == null) {
            this.f59457b.put(str, new C24061b());
            m87875a(str);
        }
        List<AbstractC24149b> list = this.f59460e.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f59460e.put(str, list);
            m87876a(str, 3);
        }
        list.add(bVar);
    }

    /* renamed from: a */
    public void mo86305a(String str, Long l, Long l2) {
        C24061b bVar = this.f59457b.get(str);
        if (bVar != null) {
            if (l.longValue() != -1) {
                bVar.f59476a = l.longValue();
            }
            if (l2.longValue() != -1) {
                bVar.f59477b = l2.longValue();
            }
            if (bVar.f59476a != -1 && bVar.f59477b != -1) {
                m87876a(str, 3);
            }
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m87881b(byte[] bArr, String str, boolean z, boolean z2) {
        String optString;
        try {
            SyncPushMessage decode = SyncPushMessage.ADAPTER.decode(bArr);
            if ("lark_block_server".equals(decode.app_name)) {
                String utf8 = decode.message.payload.utf8();
                AppBrandLogger.m52830i("BlockSync", utf8);
                JSONObject jSONObject = new JSONObject(utf8);
                String optString2 = jSONObject.optString("command");
                JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("header");
                String optString3 = optJSONObject2.optString("blockID");
                long optLong = optJSONObject2.optLong(HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
                if ("pushOpenMessage".equals(optString2)) {
                    optString = optJSONObject.optString("event");
                } else {
                    optString = optJSONObject.optJSONObject("event").optString("sourceData");
                }
                m87877a(optString3, optString2, optLong, optString);
            }
        } catch (Exception e) {
            AppBrandLogger.m52829e("BlockSync", e.getMessage());
        }
    }

    /* renamed from: a */
    private void m87877a(String str, String str2, long j, String str3) {
        C24061b bVar = this.f59457b.get(str);
        if (bVar == null) {
            bVar = new C24061b();
            if ("pushBlockEvent".equals(str2)) {
                bVar.f59476a = j;
            } else if ("pushOpenMessage".equals(str2)) {
                bVar.f59477b = j;
            } else {
                return;
            }
            this.f59457b.put(str, bVar);
        }
        if (!"pushBlockEvent".equals(str2)) {
            mo86306a(str, str3, j, bVar);
        } else if (j > bVar.f59476a) {
            bVar.f59476a = j;
            mo86307a(str, "onResourceChange", str3);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m87878a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            SyncPushEvent decode = SyncPushEvent.ADAPTER.decode(bArr);
            AppBrandLogger.m52830i("BlockSync", "SyncPushEvent:", decode.topic_id);
            if ("lark_block_server".equals(decode.app_name) && !TextUtils.isEmpty(decode.topic_id)) {
                if (decode.sync_event.type == SyncEventType.BIZ_RESET) {
                    m87880b(decode.topic_id);
                }
            }
        } catch (Exception e) {
            AppBrandLogger.m52829e("BlockSync", e.getMessage());
        }
    }
}
