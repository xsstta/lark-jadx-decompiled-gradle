package com.ss.android.lark.chat.service.impl;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.api.p1596c.C32813b;
import com.ss.android.lark.chat.api.perf.MessageSendHitPoint;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.AudioContent;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.chat.entity.message.content.MediaContent;
import com.ss.android.lark.chat.service.AbstractC34125f;
import com.ss.android.lark.chat.service.AbstractC34295j;
import com.ss.android.lark.chat.service.p1678a.p1679a.C34118b;
import com.ss.android.lark.dto.p1813b.C36866b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53234a;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.message.MessageHitPoint;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.compress.VideoCompressResult;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class MonitorMessageSendCallback implements AbstractC34125f, AbstractC34231l, AbstractC34295j {

    /* renamed from: a */
    private final MessageSendHitPoint f88317a = new MessageSendHitPoint();

    /* renamed from: b */
    private String f88318b = C53234a.m205877a();

    /* renamed from: c */
    private Chat f88319c = null;

    /* renamed from: d */
    private ChatChatter f88320d = null;

    /* renamed from: e */
    private Biz f88321e = Biz.Messenger;

    /* renamed from: f */
    private Scene f88322f = Scene.Chat;

    /* renamed from: g */
    private final C34130a f88323g = new C34130a();

    public @interface StateType {
    }

    @Override // com.ss.android.lark.chat.service.AbstractC34295j
    /* renamed from: a */
    public void mo121315a(Message message) {
    }

    @Override // com.ss.android.lark.chat.service.impl.AbstractC34231l
    /* renamed from: b */
    public void mo121318b(Message message) {
    }

    @Override // com.ss.android.lark.chat.service.AbstractC34125f
    /* renamed from: b */
    public String mo126560b() {
        return this.f88318b;
    }

    /* renamed from: a */
    public void mo126650a(boolean z, C36866b bVar) {
        this.f88323g.f88348h = z;
        if (bVar != null) {
            this.f88323g.f88357q = (long) bVar.mo136023a();
            this.f88323g.f88358r = (long) bVar.mo136024b();
        }
        if (!(bVar == null || bVar.f94737a == null)) {
            this.f88323g.f88356p = C26311p.m95281c(bVar.f94737a);
        }
        C32813b.m125959j(this.f88318b, null);
    }

    @Override // com.ss.android.lark.chat.service.AbstractC34125f
    /* renamed from: a */
    public void mo126559a(VideoCompressResult videoCompressResult) {
        this.f88323g.f88332F = SystemClock.elapsedRealtime() - this.f88323g.f88332F;
        m132551b(videoCompressResult);
        C32813b.m125961l(this.f88318b, null);
        MediaMessageMonitor.m132847a(this.f88323g.f88347g, videoCompressResult);
        if (videoCompressResult.mo196122b() != null && videoCompressResult.mo196122b().mo196162p() != 0) {
            m132550a(Message.Type.MEDIA, new ErrorResult(videoCompressResult.mo196122b().mo196162p()));
            MediaMessageMonitor.m132849a(this.f88323g.f88347g, "compress", Integer.valueOf(videoCompressResult.mo196122b().mo196162p()), "ve compress failed");
        }
    }

    @Override // com.ss.android.lark.chat.service.AbstractC34125f
    /* renamed from: a */
    public void mo121288a(C34118b bVar) {
        this.f88317a.mo120981a();
        Message message = bVar.f88300a;
        Message a = !TextUtils.isEmpty(message.getParentId()) ? C32848e.m126401b().mo121080a(message.getParentId()) : null;
        MessageHitPoint.f135779d.mo187525a(this.f88319c, this.f88320d, message);
        MessageHitPoint.f135779d.mo187526a(this.f88319c, this.f88320d, message, a);
        this.f88323g.f88334H = bVar.f88302c;
        this.f88323g.f88339M = bVar.mo126543a();
        m132550a(message.getType(), (ErrorResult) null);
        MediaMessageMonitor.m132846a(this.f88323g.f88347g, this.f88323g.f88334H);
    }

    @Override // com.ss.android.lark.chat.service.AbstractC34125f
    /* renamed from: e */
    public void mo126563e() {
        C32813b.m125952c(this.f88318b, null);
    }

    @Override // com.ss.android.lark.chat.service.AbstractC34125f
    /* renamed from: f */
    public void mo126564f() {
        C32813b.m125953d(this.f88318b, null);
    }

    /* renamed from: k */
    public void mo126652k() {
        C32813b.m125958i(this.f88318b, null);
    }

    @Override // com.ss.android.lark.chat.service.AbstractC34125f
    /* renamed from: c */
    public void mo126561c() {
        this.f88323g.f88331E = SystemClock.elapsedRealtime();
        C32813b.m125949a(this.f88318b, null);
    }

    @Override // com.ss.android.lark.chat.service.AbstractC34125f
    /* renamed from: g */
    public void mo126565g() {
        this.f88323g.f88336J = SystemClock.elapsedRealtime();
        C32813b.m125954e(this.f88318b, null);
    }

    @Override // com.ss.android.lark.chat.service.AbstractC34125f
    /* renamed from: i */
    public void mo126567i() {
        this.f88323g.f88333G = SystemClock.elapsedRealtime();
        C32813b.m125956g(this.f88318b, null);
    }

    @Override // com.ss.android.lark.chat.service.AbstractC34125f
    /* renamed from: d */
    public void mo126562d() {
        this.f88323g.f88331E = SystemClock.elapsedRealtime() - this.f88323g.f88331E;
        C32813b.m125951b(this.f88318b, null);
    }

    @Override // com.ss.android.lark.chat.service.AbstractC34125f
    /* renamed from: j */
    public void mo126568j() {
        this.f88323g.f88332F = SystemClock.elapsedRealtime();
        C32813b.m125960k(this.f88318b, null);
        MediaMessageMonitor.m132850b(this.f88323g.f88347g);
    }

    public MonitorMessageSendCallback() {
    }

    /* renamed from: a */
    private void mo123033a() {
        Chat chat = this.f88319c;
        if (chat == null) {
            return;
        }
        if (chat.isSecret()) {
            this.f88322f = Scene.SecretChat;
        } else if (this.f88319c.isThread()) {
            this.f88322f = Scene.Thread;
        } else {
            this.f88322f = Scene.Chat;
        }
    }

    /* renamed from: l */
    private void m132553l() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.f88323g.mo126656a(true, true));
        hashMap.putAll(this.f88323g.mo126654a());
        hashMap.putAll(this.f88323g.mo126657b());
        hashMap.putAll(this.f88323g.mo126655a(true));
        Statistics.sendEvent("perf_send_msg_dev", new JSONObject(hashMap));
    }

    @Override // com.ss.android.lark.chat.service.AbstractC34125f
    /* renamed from: h */
    public void mo126566h() {
        this.f88323g.f88336J = SystemClock.elapsedRealtime() - this.f88323g.f88336J;
        C32813b.m125955f(this.f88318b, null);
        AppreciableKit.m107394b().mo103523c(C57782ag.m224244b(this.f88323g.f88341a), this.f88323g.mo126656a(false, false), this.f88323g.mo126655a(false), this.f88323g.mo126657b(), this.f88323g.mo126654a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback$2 */
    public static /* synthetic */ class C341292 {

        /* renamed from: a */
        static final /* synthetic */ int[] f88326a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.lark.utils.compress.VideoCompressResult$ResultType[] r0 = com.ss.android.lark.utils.compress.VideoCompressResult.ResultType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback.C341292.f88326a = r0
                com.ss.android.lark.utils.compress.VideoCompressResult$ResultType r1 = com.ss.android.lark.utils.compress.VideoCompressResult.ResultType.COPY_SKIP_MUXER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback.C341292.f88326a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.utils.compress.VideoCompressResult$ResultType r1 = com.ss.android.lark.utils.compress.VideoCompressResult.ResultType.COPY_SKIP_PROCESS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback.C341292.f88326a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.utils.compress.VideoCompressResult$ResultType r1 = com.ss.android.lark.utils.compress.VideoCompressResult.ResultType.COPY_VE_NO_SUPPORT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback.C341292.f88326a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.utils.compress.VideoCompressResult$ResultType r1 = com.ss.android.lark.utils.compress.VideoCompressResult.ResultType.REUSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback.C341292.f88326a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.utils.compress.VideoCompressResult$ResultType r1 = com.ss.android.lark.utils.compress.VideoCompressResult.ResultType.MUXER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback.C341292.f88326a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.android.lark.utils.compress.VideoCompressResult$ResultType r1 = com.ss.android.lark.utils.compress.VideoCompressResult.ResultType.ENCODE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback.C341292.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback$a */
    public class C34130a {

        /* renamed from: A */
        int f88327A;

        /* renamed from: B */
        Chat.Type f88328B = Chat.Type.P2P;

        /* renamed from: C */
        int f88329C;

        /* renamed from: D */
        boolean f88330D;

        /* renamed from: E */
        long f88331E;

        /* renamed from: F */
        long f88332F;

        /* renamed from: G */
        long f88333G;

        /* renamed from: H */
        long f88334H;

        /* renamed from: I */
        long f88335I;

        /* renamed from: J */
        long f88336J;

        /* renamed from: K */
        long f88337K;

        /* renamed from: L */
        int f88338L;

        /* renamed from: M */
        Map<String, Object> f88339M;

        /* renamed from: a */
        String f88341a;

        /* renamed from: b */
        String f88342b;

        /* renamed from: c */
        String f88343c;

        /* renamed from: d */
        long f88344d;

        /* renamed from: e */
        long f88345e;

        /* renamed from: f */
        Message.Type f88346f = Message.Type.UNKNOWN;

        /* renamed from: g */
        String f88347g;

        /* renamed from: h */
        boolean f88348h = true;

        /* renamed from: i */
        boolean f88349i;

        /* renamed from: j */
        String f88350j = "";

        /* renamed from: k */
        String f88351k = "SRGB";

        /* renamed from: l */
        String f88352l = "RGBA_8888";

        /* renamed from: m */
        long f88353m;

        /* renamed from: n */
        long f88354n;

        /* renamed from: o */
        long f88355o;

        /* renamed from: p */
        long f88356p;

        /* renamed from: q */
        long f88357q;

        /* renamed from: r */
        long f88358r;

        /* renamed from: s */
        String f88359s;

        /* renamed from: t */
        long f88360t;

        /* renamed from: u */
        int f88361u;

        /* renamed from: v */
        int f88362v;

        /* renamed from: w */
        int f88363w;

        /* renamed from: x */
        int f88364x;

        /* renamed from: y */
        String f88365y;

        /* renamed from: z */
        boolean f88366z;

        /* renamed from: a */
        public Map<String, Object> mo126654a() {
            HashMap hashMap = new HashMap();
            hashMap.put("message_type", Integer.valueOf(this.f88346f.getNumber()));
            hashMap.put("chat_type", Integer.valueOf(this.f88328B.getNumber()));
            hashMap.put("is_crypto", Integer.valueOf(this.f88330D ? 1 : 0));
            hashMap.put("image_type", this.f88350j);
            hashMap.put("color_space", this.f88351k);
            hashMap.put("color_type", this.f88352l);
            hashMap.put("is_image_fallback_to_file", Boolean.valueOf(this.f88348h));
            hashMap.put("media_is_origin_type", Boolean.valueOf(this.f88349i));
            return hashMap;
        }

        /* renamed from: b */
        public Map<String, Object> mo126657b() {
            HashMap hashMap = new HashMap();
            hashMap.put("text_content_length", Long.valueOf(this.f88344d));
            hashMap.put("resource_content_length", Long.valueOf(this.f88345e));
            hashMap.put("file_size", Long.valueOf(this.f88345e));
            hashMap.put("chatter_count", Integer.valueOf(this.f88329C));
            hashMap.put("message_id", C57782ag.m224244b(this.f88347g));
            hashMap.put("resource_width", Long.valueOf(this.f88353m));
            hashMap.put("resource_height", Long.valueOf(this.f88354n));
            hashMap.put("resource_frames", Long.valueOf(this.f88355o));
            hashMap.put("upload_content_length", Long.valueOf(this.f88356p));
            hashMap.put("upload_content_width", Long.valueOf(this.f88357q));
            hashMap.put("upload_content_height", Long.valueOf(this.f88358r));
            return hashMap;
        }

        C34130a() {
        }

        /* renamed from: a */
        public Map<String, Object> mo126655a(boolean z) {
            HashMap hashMap = new HashMap();
            if (z) {
                hashMap.put("send_state", Integer.valueOf(this.f88338L));
                hashMap.put("on_screen_cost", Long.valueOf(this.f88336J));
                hashMap.put("total_cost", Long.valueOf(this.f88337K));
                hashMap.put("upload_cost", Long.valueOf(this.f88335I));
            }
            hashMap.put("context_id", C57782ag.m224244b(this.f88343c));
            return hashMap;
        }

        /* renamed from: a */
        public Map<String, Object> mo126656a(boolean z, boolean z2) {
            HashMap hashMap = new HashMap();
            hashMap.put("sdk_create_msg_cost", Long.valueOf(this.f88331E));
            hashMap.put("CreateQuasiMessageRequest", Long.valueOf(this.f88331E));
            if (z) {
                hashMap.put("compress_cost", Long.valueOf(this.f88332F));
                hashMap.put("sdk_send_msg_cost", Long.valueOf(this.f88333G));
                hashMap.put("net_cost", Long.valueOf(this.f88334H));
            }
            if (z2 && !CollectionUtils.isEmpty(this.f88339M)) {
                hashMap.putAll(this.f88339M);
            }
            return hashMap;
        }
    }

    /* renamed from: a */
    public void mo126648a(Chat chat) {
        this.f88319c = chat;
    }

    /* renamed from: a */
    public void mo126649a(ChatChatter chatChatter) {
        this.f88320d = chatChatter;
    }

    /* renamed from: b */
    public void mo126651b(Message.Type type) {
        C32813b.m125950b(type, this.f88318b, null);
    }

    public MonitorMessageSendCallback(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f88318b = str;
        }
    }

    /* renamed from: a */
    private void m132549a(final ErrorResult errorResult) {
        int errorCode = errorResult.getErrorCode();
        if (errorCode == 507 || errorCode == 5009 || errorCode == 6003 || errorCode == 321000 || errorCode == 260008 || errorCode == 260009) {
            Log.m165389i("MonitorMessageSendCallback", "handleUIMessageSendFail called, errorCode:" + errorCode);
            return;
        }
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback.RunnableC341281 */

            public void run() {
                String displayMsg = errorResult.getDisplayMsg();
                String string = UIUtils.getString(C29990c.m110930b().mo134528a(), R.string.Lark_Legacy_ErrorMessageTip);
                Context a = C29990c.m110930b().mo134528a();
                if (TextUtils.isEmpty(displayMsg)) {
                    displayMsg = string;
                }
                LKUIToast.show(a, displayMsg);
            }
        });
    }

    /* renamed from: c */
    private long m132552c(Message message) {
        long j = 0;
        if (message.getType() == Message.Type.AUDIO) {
            AudioContent audioContent = (AudioContent) message.getContent();
            if (!TextUtils.isEmpty(audioContent.getLocalFilePath())) {
                j = new File(audioContent.getLocalFilePath()).length();
            }
        } else if (message.getType() == Message.Type.FILE) {
            j = ((FileContent) message.getContent()).getSize();
        } else if (message.getType() == Message.Type.MEDIA) {
            j = ((MediaContent) message.getContent()).getSize();
        }
        C53241h.m205899c("MonitorMessageSendCallback", "getContentSize:" + message.getType() + "/" + j);
        return j;
    }

    /* renamed from: b */
    private void m132551b(VideoCompressResult videoCompressResult) {
        VideoCompressResult.C57816a b = videoCompressResult.mo196122b();
        if (b != null) {
            this.f88323g.f88359s = b.mo196129b();
            this.f88323g.f88360t = (long) (b.mo196161o() * 1000.0f);
            this.f88323g.f88361u = b.mo196141e();
            this.f88323g.f88362v = b.mo196145f();
            this.f88323g.f88363w = b.mo196133c();
            this.f88323g.f88364x = b.mo196137d();
            this.f88323g.f88366z = b.mo196128a();
            this.f88323g.f88327A = b.mo196162p();
        }
        switch (C341292.f88326a[videoCompressResult.mo196120a().ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.f88323g.f88365y = "origin";
                return;
            case 4:
                this.f88323g.f88365y = "reuse";
                return;
            case 5:
                this.f88323g.f88365y = "muxer";
                return;
            case 6:
                this.f88323g.f88365y = "encode";
                return;
            default:
                return;
        }
    }

    @Override // com.ss.android.lark.chat.service.AbstractC34125f
    /* renamed from: a */
    public void mo126558a(Message.Type type) {
        C32813b.m125948a(type, this.f88318b, null);
        this.f88323g.f88343c = this.f88318b;
        this.f88323g.f88337K = SystemClock.elapsedRealtime();
        mo123033a();
        this.f88323g.f88341a = AppreciableKit.m107394b().mo103508a(this.f88321e, this.f88322f, Event.message_on_screen, "chatWindow", false);
        this.f88323g.f88342b = AppreciableKit.m107394b().mo103508a(this.f88321e, this.f88322f, Event.message_send, "chatWindow", true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    @Override // com.ss.android.lark.chat.service.AbstractC34125f
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo123034a(com.ss.android.lark.chat.entity.message.MessageInfo r10) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback.mo123034a(com.ss.android.lark.chat.entity.message.MessageInfo):void");
    }

    /* renamed from: a */
    private void m132550a(Message.Type type, ErrorResult errorResult) {
        int i;
        this.f88323g.f88333G = SystemClock.elapsedRealtime() - this.f88323g.f88333G;
        this.f88323g.f88337K = SystemClock.elapsedRealtime() - this.f88323g.f88337K;
        C34130a aVar = this.f88323g;
        if (errorResult == null) {
            i = 1;
        } else {
            i = 2;
        }
        aVar.f88338L = i;
        C32813b.m125957h(this.f88318b, null);
        mo126651b(type);
        if (errorResult == null) {
            AppreciableKit.m107394b().mo103523c(C57782ag.m224244b(this.f88323g.f88342b), this.f88323g.mo126656a(true, false), this.f88323g.mo126655a(false), this.f88323g.mo126657b(), this.f88323g.mo126654a());
        } else {
            AppreciableKit.m107394b().mo103514a(new ErrorParams(this.f88321e, this.f88322f, Event.message_send, ErrorType.Network, ErrorLevel.Fatal, errorResult.getErrorCode(), null, "chatWindow", errorResult.getDisplayMsg(), true, this.f88323g.mo126655a(false), this.f88323g.mo126657b(), this.f88323g.mo126654a()));
        }
        m132553l();
    }

    @Override // com.ss.android.lark.chat.service.AbstractC34125f
    /* renamed from: a */
    public void mo121287a(ErrorResult errorResult, Message message) {
        C53241h.m205894a("MonitorMessageSendCallback", "send message failed:" + message.toString());
        this.f88317a.mo120983b();
        m132550a(message.getType(), errorResult);
        m132549a(errorResult);
        MediaMessageMonitor.m132849a(this.f88323g.f88347g, "rust", Integer.valueOf(errorResult.getErrorCode()), errorResult.getMessage());
    }

    /* renamed from: a */
    public void mo126647a(long j, long j2, long j3, String str, boolean z) {
        this.f88323g.f88345e = j;
        this.f88323g.f88356p = j;
        this.f88323g.f88353m = j2;
        this.f88323g.f88354n = j3;
        this.f88323g.f88350j = str;
        this.f88323g.f88349i = z;
    }
}
