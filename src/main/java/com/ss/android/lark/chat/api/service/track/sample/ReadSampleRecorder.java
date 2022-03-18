package com.ss.android.lark.chat.api.service.track.sample;

import com.ss.android.lark.chat.api.service.track.sample.SampleConfigParser;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.message.ChatSampleIssueHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0002\u0010\u0017J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0002\u0010\u0017J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\tH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0012H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/chat/api/service/track/sample/ReadSampleRecorder;", "Lcom/ss/android/lark/chat/api/service/track/sample/BaseSampleRecorder;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "fetcher", "Lcom/ss/android/lark/chat/api/service/track/sample/MsgSampleIssueTracker$IMessageSourceFetcher;", "syncFetcher", "Lcom/ss/android/lark/chat/api/service/track/sample/MsgSampleIssueTracker$IMessagePipeSyncFetcher;", "messageId", "", "executor", "Ljava/util/concurrent/ScheduledExecutorService;", "(Lcom/ss/android/lark/chat/entity/chat/Chat;Lcom/ss/android/lark/chat/api/service/track/sample/MsgSampleIssueTracker$IMessageSourceFetcher;Lcom/ss/android/lark/chat/api/service/track/sample/MsgSampleIssueTracker$IMessagePipeSyncFetcher;Ljava/lang/String;Ljava/util/concurrent/ScheduledExecutorService;)V", "getChat", "()Lcom/ss/android/lark/chat/entity/chat/Chat;", "config", "Lcom/ss/android/lark/chat/api/service/track/sample/SampleConfigParser$ReadSampleReportConfig;", "checkSampleCondition", "", "messageInfo", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "getLastReportTimeInterval", "", "()Ljava/lang/Long;", "getUpdateTimeInterval", "getUploadDelay", "scene", "trackEvent", "", "isSyncPipeFinished", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.api.service.track.sample.e */
public final class ReadSampleRecorder extends BaseSampleRecorder {

    /* renamed from: d */
    public static final Companion f84563d = new Companion(null);

    /* renamed from: e */
    private final SampleConfigParser.ReadSampleReportConfig f84564e = SampleConfigParser.INSTANCE.getReadConfig();

    /* renamed from: f */
    private final Chat f84565f;

    @Override // com.ss.android.lark.chat.api.service.track.sample.BaseSampleRecorder
    /* renamed from: a */
    public String mo121430a() {
        return "Read";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/api/service/track/sample/ReadSampleRecorder$Companion;", "", "()V", "TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.api.service.track.sample.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.chat.api.service.track.sample.BaseSampleRecorder
    /* renamed from: e */
    public Long mo121436e() {
        SampleConfigParser.ReadSampleReportConfig readSampleReportConfig = this.f84564e;
        if (readSampleReportConfig != null) {
            return Long.valueOf(readSampleReportConfig.getSteadyStatePeriodInSeconds());
        }
        return null;
    }

    @Override // com.ss.android.lark.chat.api.service.track.sample.BaseSampleRecorder
    /* renamed from: f */
    public Long mo121437f() {
        SampleConfigParser.ReadSampleReportConfig readSampleReportConfig = this.f84564e;
        if (readSampleReportConfig != null) {
            return Long.valueOf(readSampleReportConfig.getReportTimeIntervalInMs());
        }
        return null;
    }

    @Override // com.ss.android.lark.chat.api.service.track.sample.BaseSampleRecorder
    /* renamed from: d */
    public long mo121435d() {
        SampleConfigParser.ReadSampleReportConfig readSampleReportConfig = this.f84564e;
        if (readSampleReportConfig == null) {
            return 2000;
        }
        long syncMsgDepLatencyInMs = readSampleReportConfig.getSyncMsgDepLatencyInMs();
        if (syncMsgDepLatencyInMs != 0) {
            return syncMsgDepLatencyInMs;
        }
        return 2000;
    }

    @Override // com.ss.android.lark.chat.api.service.track.sample.BaseSampleRecorder
    /* renamed from: a */
    public boolean mo121432a(MessageInfo messageInfo) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        int i2;
        Intrinsics.checkParameterIsNotNull(messageInfo, "messageInfo");
        SampleConfigParser.ReadSampleReportConfig readSampleReportConfig = this.f84564e;
        if (readSampleReportConfig == null) {
            Log.m165383e("ReadSampleRecorder", "config is invalid");
            return false;
        }
        Message message = messageInfo.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
        if (!message.isFromMe() || this.f84565f.getMemberCount() > readSampleReportConfig.getMaxChatMemberCount()) {
            z = false;
        } else {
            z = true;
        }
        if (this.f84565f.getMemberCount() <= 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            Message message2 = messageInfo.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message2, "messageInfo.getMessage()");
            i = message2.getReadCount();
        } else {
            Message message3 = messageInfo.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message3, "messageInfo.getMessage()");
            i = message3.getReadCount() - 1;
        }
        Message message4 = messageInfo.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message4, "messageInfo.getMessage()");
        int unReadCount = message4.getUnReadCount();
        if (i <= readSampleReportConfig.getReadCountLowerThreshold() || (i < (i2 = unReadCount + i) && ((float) i) >= ((float) Math.floor((double) (((float) i2) * readSampleReportConfig.getReadCountUpperFact()))))) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z || !z3) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.chat.api.service.track.sample.BaseSampleRecorder
    /* renamed from: a */
    public void mo121431a(MessageInfo messageInfo, boolean z) {
        boolean z2;
        int i;
        Intrinsics.checkParameterIsNotNull(messageInfo, "messageInfo");
        if (this.f84565f.getMemberCount() <= 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            Message message = messageInfo.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
            i = message.getReadCount();
        } else {
            Message message2 = messageInfo.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message2, "messageInfo.getMessage()");
            i = message2.getReadCount() - 1;
        }
        Message message3 = messageInfo.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message3, "messageInfo.getMessage()");
        int unReadCount = message3.getUnReadCount();
        String id = messageInfo.getId();
        ChatSampleIssueHitPoint.ReadParam.Builder b = new ChatSampleIssueHitPoint.ReadParam.Builder().mo187510a(i).mo187514b(unReadCount);
        Message message4 = messageInfo.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message4, "messageInfo.getMessage()");
        ChatSampleIssueHitPoint.ReadParam.Builder b2 = b.mo187512a(message4.isSyncMsgDep()).mo187515b(z);
        Intrinsics.checkExpressionValueIsNotNull(id, "messageId");
        b2.mo187511a(id).mo187513a().mo187509a();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ReadSampleRecorder(com.ss.android.lark.chat.entity.chat.Chat r8, com.ss.android.lark.chat.api.service.track.sample.MsgSampleIssueTracker.IMessageSourceFetcher r9, com.ss.android.lark.chat.api.service.track.sample.MsgSampleIssueTracker.IMessagePipeSyncFetcher r10, java.lang.String r11, java.util.concurrent.ScheduledExecutorService r12) {
        /*
            r7 = this;
            java.lang.String r0 = "chat"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            java.lang.String r0 = "fetcher"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r0)
            java.lang.String r0 = "syncFetcher"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            java.lang.String r0 = "messageId"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r11, r0)
            java.lang.String r0 = "executor"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r12, r0)
            java.lang.String r2 = r8.getId()
            java.lang.String r0 = "chat.getId()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r0)
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f84565f = r8
            com.ss.android.lark.chat.api.service.track.sample.SampleConfigParser r8 = com.ss.android.lark.chat.api.service.track.sample.SampleConfigParser.INSTANCE
            com.ss.android.lark.chat.api.service.track.sample.SampleConfigParser$ReadSampleReportConfig r8 = r8.getReadConfig()
            r7.f84564e = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.api.service.track.sample.ReadSampleRecorder.<init>(com.ss.android.lark.chat.entity.chat.Chat, com.ss.android.lark.chat.api.service.track.sample.a$c, com.ss.android.lark.chat.api.service.track.sample.a$b, java.lang.String, java.util.concurrent.ScheduledExecutorService):void");
    }
}
