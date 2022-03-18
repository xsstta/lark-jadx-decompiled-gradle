package com.ss.android.lark.chat.api.service.track.sample;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ss.android.lark.chat.api.service.track.C32910f;
import com.ss.android.lark.chat.api.service.track.sample.MsgSampleIssueTracker;
import com.ss.android.lark.chat.api.service.track.sample.MsgSampleRecordCache;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.log.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\b&\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0017H&¢\u0006\u0002\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0017H&¢\u0006\u0002\u0010\u0018J\b\u0010\u001a\u001a\u00020\u0017H&J\b\u0010\u001b\u001a\u00020\u0003H'J\u0018\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0011H&J\u0006\u0010\u001e\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\b\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/chat/api/service/track/sample/BaseSampleRecorder;", "", "chatId", "", "fetcher", "Lcom/ss/android/lark/chat/api/service/track/sample/MsgSampleIssueTracker$IMessageSourceFetcher;", "syncFetcher", "Lcom/ss/android/lark/chat/api/service/track/sample/MsgSampleIssueTracker$IMessagePipeSyncFetcher;", "messageId", "executor", "Ljava/util/concurrent/ScheduledExecutorService;", "(Ljava/lang/String;Lcom/ss/android/lark/chat/api/service/track/sample/MsgSampleIssueTracker$IMessageSourceFetcher;Lcom/ss/android/lark/chat/api/service/track/sample/MsgSampleIssueTracker$IMessagePipeSyncFetcher;Ljava/lang/String;Ljava/util/concurrent/ScheduledExecutorService;)V", "getFetcher", "()Lcom/ss/android/lark/chat/api/service/track/sample/MsgSampleIssueTracker$IMessageSourceFetcher;", "messageInfo", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "checkLastTime", "", "checkSampleCondition", "checkUpdateTime", "doUpdate", "", "getLastReportTimeInterval", "", "()Ljava/lang/Long;", "getUpdateTimeInterval", "getUploadDelay", "scene", "trackEvent", "isSyncPipeFinished", "upload", "Companion", "Scene", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class BaseSampleRecorder {

    /* renamed from: c */
    public static final Companion f84535c = new Companion(null);

    /* renamed from: a */
    public final String f84536a;

    /* renamed from: b */
    public final String f84537b;

    /* renamed from: d */
    private MessageInfo f84538d;

    /* renamed from: e */
    private final MsgSampleIssueTracker.IMessageSourceFetcher f84539e;

    /* renamed from: f */
    private final MsgSampleIssueTracker.IMessagePipeSyncFetcher f84540f;

    /* renamed from: g */
    private final ScheduledExecutorService f84541g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/chat/api/service/track/sample/BaseSampleRecorder$Scene;", "", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Scene {
        public static final Companion Companion = Companion.f84542a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chat/api/service/track/sample/BaseSampleRecorder$Scene$Companion;", "", "()V", "REACTION", "", "READ", GrsBaseInfo.CountryCodeSource.UNKNOWN, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.api.service.track.sample.BaseSampleRecorder$Scene$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f84542a = new Companion();

            private Companion() {
            }
        }
    }

    @Scene
    /* renamed from: a */
    public abstract String mo121430a();

    /* renamed from: a */
    public abstract void mo121431a(MessageInfo messageInfo, boolean z);

    /* renamed from: a */
    public abstract boolean mo121432a(MessageInfo messageInfo);

    /* renamed from: d */
    public abstract long mo121435d();

    /* renamed from: e */
    public abstract Long mo121436e();

    /* renamed from: f */
    public abstract Long mo121437f();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chat/api/service/track/sample/BaseSampleRecorder$Companion;", "", "()V", "DEFAULT_MAX_LAST_TIME", "", "DEFAULT_MAX_UPDATE_TIME", "DEFAULT_UP_LOAD_LATENCY", "NEAR_MAX_SCAN_RANG", "", "TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.api.service.track.sample.BaseSampleRecorder$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.api.service.track.sample.BaseSampleRecorder$b */
    static final class RunnableC32913b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BaseSampleRecorder f84543a;

        RunnableC32913b(BaseSampleRecorder baseSampleRecorder) {
            this.f84543a = baseSampleRecorder;
        }

        public final void run() {
            this.f84543a.mo121434c();
            MsgSampleRecordCache a = MsgSampleRecordCachePool.m126735a(this.f84543a.mo121430a());
            if (a == null) {
                Log.m165383e("BaseSampleRecorder", "cache: " + this.f84543a.mo121430a() + " is not init");
                return;
            }
            a.mo121489a(this.f84543a.f84537b, this.f84543a.f84536a);
        }
    }

    /* renamed from: b */
    public final void mo121433b() {
        try {
            this.f84541g.schedule(new RunnableC32913b(this), mo121435d(), TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            Log.m165384e("BaseSampleRecorder", "message sample fail due to: " + e.getMessage(), e);
        }
    }

    /* renamed from: c */
    public final void mo121434c() {
        boolean z;
        C32910f a = this.f84539e.mo121487a().mo121414a(this.f84537b, 2);
        if (!a.mo121423a()) {
            Log.m165383e("BaseSampleRecorder", "message block is invalid, check failed");
            return;
        }
        MessageInfo b = a.mo121424b();
        Intrinsics.checkExpressionValueIsNotNull(b, "this");
        boolean z2 = false;
        if (!m126711b(b) || !m126712c(b)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            Log.m165379d("BaseSampleRecorder", "messageId: " + b.getId() + " scene: " + mo121430a() + " sample skip for time");
        } else if (!mo121432a(b)) {
            Log.m165379d("BaseSampleRecorder", "messageId: " + b.getId() + " scene: " + mo121430a() + " don't meet condition");
        } else {
            Boolean bool = this.f84540f.mo121486a().get(this.f84537b);
            if (bool != null) {
                z2 = bool.booleanValue();
            }
            mo121431a(b, z2);
            this.f84538d = b;
        }
    }

    /* renamed from: b */
    private final boolean m126711b(MessageInfo messageInfo) {
        MsgSampleRecordCache.MsgSampleRecord bVar;
        long j;
        MsgSampleRecordCache a = MsgSampleRecordCachePool.m126735a(mo121430a());
        if (a != null) {
            String id = messageInfo.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "messageInfo.id");
            bVar = a.mo121488a(id);
        } else {
            bVar = null;
        }
        boolean z = true;
        if (bVar == null) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long a2 = currentTimeMillis - bVar.mo121490a();
        Long f = mo121437f();
        if (f != null) {
            j = f.longValue();
        } else {
            j = 600000;
        }
        if (a2 <= j) {
            z = false;
        }
        Log.m165379d("BaseSampleRecorder", "last time check messageId : " + messageInfo.getId() + " curTime : " + currentTimeMillis + " lastTime : " + bVar.mo121490a() + ", interval: " + j + "  result = " + z);
        return z;
    }

    /* renamed from: c */
    private final boolean m126712c(MessageInfo messageInfo) {
        long j;
        boolean z;
        long currentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        Message message = messageInfo.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
        long updateTime = currentTimeMillis - message.getUpdateTime();
        Long e = mo121436e();
        if (e != null) {
            j = e.longValue();
        } else {
            j = 1800;
        }
        if (updateTime > j) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("update time check messageId : ");
        sb.append(messageInfo.getId());
        sb.append(" curTime : ");
        sb.append(currentTimeMillis);
        sb.append(" updateTime : ");
        Message message2 = messageInfo.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message2, "messageInfo.getMessage()");
        sb.append(message2.getUpdateTime());
        sb.append(", interval: ");
        sb.append(j);
        sb.append(" result = ");
        sb.append(z);
        Log.m165379d("BaseSampleRecorder", sb.toString());
        return z;
    }

    public BaseSampleRecorder(String str, MsgSampleIssueTracker.IMessageSourceFetcher cVar, MsgSampleIssueTracker.IMessagePipeSyncFetcher bVar, String str2, ScheduledExecutorService scheduledExecutorService) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(cVar, "fetcher");
        Intrinsics.checkParameterIsNotNull(bVar, "syncFetcher");
        Intrinsics.checkParameterIsNotNull(str2, "messageId");
        Intrinsics.checkParameterIsNotNull(scheduledExecutorService, "executor");
        this.f84536a = str;
        this.f84539e = cVar;
        this.f84540f = bVar;
        this.f84537b = str2;
        this.f84541g = scheduledExecutorService;
    }
}
