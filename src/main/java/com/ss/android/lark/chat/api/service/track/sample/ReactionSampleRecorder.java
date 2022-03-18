package com.ss.android.lark.chat.api.service.track.sample;

import android.util.ArrayMap;
import com.ss.android.lark.chat.api.service.track.sample.SampleConfigParser;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.reaction.Reaction;
import com.ss.android.lark.chat.entity.reaction.ReactionInfo;
import com.ss.android.lark.statistics.message.ChatSampleIssueHitPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 &2\u00020\u0001:\u0001&B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0002\u0010\u001cJ\u001c\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00130\u001e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J*\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00120\u001e2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J\u000f\u0010 \u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0002\u0010\u001cJ\b\u0010!\u001a\u00020\u001bH\u0016J\b\u0010\"\u001a\u00020\tH\u0016J\u0018\u0010#\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u0017H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/lark/chat/api/service/track/sample/ReactionSampleRecorder;", "Lcom/ss/android/lark/chat/api/service/track/sample/BaseSampleRecorder;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "fetcher", "Lcom/ss/android/lark/chat/api/service/track/sample/MsgSampleIssueTracker$IMessageSourceFetcher;", "syncFetcher", "Lcom/ss/android/lark/chat/api/service/track/sample/MsgSampleIssueTracker$IMessagePipeSyncFetcher;", "messageId", "", "executor", "Ljava/util/concurrent/ScheduledExecutorService;", "(Lcom/ss/android/lark/chat/entity/chat/Chat;Lcom/ss/android/lark/chat/api/service/track/sample/MsgSampleIssueTracker$IMessageSourceFetcher;Lcom/ss/android/lark/chat/api/service/track/sample/MsgSampleIssueTracker$IMessagePipeSyncFetcher;Ljava/lang/String;Ljava/util/concurrent/ScheduledExecutorService;)V", "getChat", "()Lcom/ss/android/lark/chat/entity/chat/Chat;", "config", "Lcom/ss/android/lark/chat/api/service/track/sample/SampleConfigParser$ReactionSampleReportConfig;", "calculateQuantilePosition", "", "", "reactionCount", "quantile", "checkSampleCondition", "", "messageInfo", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "getLastReportTimeInterval", "", "()Ljava/lang/Long;", "getReactionCountMap", "Landroid/util/ArrayMap;", "getReactionUserIdMap", "getUpdateTimeInterval", "getUploadDelay", "scene", "trackEvent", "", "isSyncPipeFinished", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.api.service.track.sample.d */
public final class ReactionSampleRecorder extends BaseSampleRecorder {

    /* renamed from: d */
    public static final Companion f84560d = new Companion(null);

    /* renamed from: e */
    private final SampleConfigParser.ReactionSampleReportConfig f84561e = SampleConfigParser.INSTANCE.getReactionConfig();

    /* renamed from: f */
    private final Chat f84562f;

    @Override // com.ss.android.lark.chat.api.service.track.sample.BaseSampleRecorder
    /* renamed from: a */
    public String mo121430a() {
        return "Reaction";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/api/service/track/sample/ReactionSampleRecorder$Companion;", "", "()V", "DEFAULT_QUANTILE", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.api.service.track.sample.d$a */
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
        SampleConfigParser.ReactionSampleReportConfig reactionSampleReportConfig = this.f84561e;
        if (reactionSampleReportConfig != null) {
            return Long.valueOf(reactionSampleReportConfig.getSteadyStatePeriodInSeconds());
        }
        return null;
    }

    @Override // com.ss.android.lark.chat.api.service.track.sample.BaseSampleRecorder
    /* renamed from: f */
    public Long mo121437f() {
        SampleConfigParser.ReactionSampleReportConfig reactionSampleReportConfig = this.f84561e;
        if (reactionSampleReportConfig != null) {
            return Long.valueOf(reactionSampleReportConfig.getReportTimeIntervalInMs());
        }
        return null;
    }

    @Override // com.ss.android.lark.chat.api.service.track.sample.BaseSampleRecorder
    /* renamed from: d */
    public long mo121435d() {
        SampleConfigParser.ReactionSampleReportConfig reactionSampleReportConfig = this.f84561e;
        if (reactionSampleReportConfig == null) {
            return 2000;
        }
        long syncMsgDepLatencyInMs = reactionSampleReportConfig.getSyncMsgDepLatencyInMs();
        if (syncMsgDepLatencyInMs != 0) {
            return syncMsgDepLatencyInMs;
        }
        return 2000;
    }

    @Override // com.ss.android.lark.chat.api.service.track.sample.BaseSampleRecorder
    /* renamed from: a */
    public boolean mo121432a(MessageInfo messageInfo) {
        int i;
        Intrinsics.checkParameterIsNotNull(messageInfo, "messageInfo");
        int memberCount = this.f84562f.getMemberCount();
        SampleConfigParser.ReactionSampleReportConfig reactionSampleReportConfig = this.f84561e;
        if (reactionSampleReportConfig != null) {
            i = reactionSampleReportConfig.getMaxChatMemberCount();
        } else {
            i = 0;
        }
        if (memberCount > i || messageInfo.isPreMessage()) {
            return false;
        }
        Message message = messageInfo.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
        if (message.getType() != Message.Type.SYSTEM) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final ArrayMap<String, Integer> m126738b(MessageInfo messageInfo) {
        ArrayMap<String, Integer> arrayMap = new ArrayMap<>();
        List<ReactionInfo> reactionInfoList = messageInfo.getReactionInfoList();
        if (reactionInfoList != null) {
            for (T t : reactionInfoList) {
                Intrinsics.checkExpressionValueIsNotNull(t, "it");
                Reaction reaction = t.getReaction();
                Intrinsics.checkExpressionValueIsNotNull(reaction, "it.reaction");
                String type = reaction.getType();
                Reaction reaction2 = t.getReaction();
                Intrinsics.checkExpressionValueIsNotNull(reaction2, "it.reaction");
                arrayMap.put(type, Integer.valueOf(reaction2.getCount()));
            }
        }
        return arrayMap;
    }

    /* renamed from: a */
    private final List<Integer> m126737a(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        if (i == 0) {
            return arrayList;
        }
        if (i != 1) {
            arrayList.add(0);
            int i3 = i2 - 2;
            if (1 <= i3) {
                int i4 = 1;
                while (true) {
                    int ceil = (int) ((float) Math.ceil((double) (((((float) i) - ((float) 2)) / (((float) i2) - ((float) 1))) * ((float) i4))));
                    if (!arrayList.contains(Integer.valueOf(ceil))) {
                        arrayList.add(Integer.valueOf(ceil));
                    }
                    if (i4 == i3) {
                        break;
                    }
                    i4++;
                }
            }
            int i5 = i - 1;
            if (!arrayList.contains(Integer.valueOf(i5))) {
                arrayList.add(Integer.valueOf(i5));
            }
            return arrayList;
        }
        arrayList.add(0);
        return arrayList;
    }

    /* renamed from: a */
    private final ArrayMap<String, List<String>> m126736a(MessageInfo messageInfo, int i) {
        ArrayMap<String, List<String>> arrayMap = new ArrayMap<>();
        List<ReactionInfo> reactionInfoList = messageInfo.getReactionInfoList();
        if (reactionInfoList != null) {
            for (T t : reactionInfoList) {
                Intrinsics.checkExpressionValueIsNotNull(t, "reactionInfo");
                Reaction reaction = t.getReaction();
                Intrinsics.checkExpressionValueIsNotNull(reaction, "reactionInfo.reaction");
                String type = reaction.getType();
                Reaction reaction2 = t.getReaction();
                Intrinsics.checkExpressionValueIsNotNull(reaction2, "reactionInfo.reaction");
                int count = reaction2.getCount();
                Reaction reaction3 = t.getReaction();
                Intrinsics.checkExpressionValueIsNotNull(reaction3, "reactionInfo.reaction");
                List<String> chatterIds = reaction3.getChatterIds();
                ArrayMap arrayMap2 = new ArrayMap();
                int size = chatterIds.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayMap2.put(Integer.valueOf(i2), chatterIds.get(i2));
                }
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = m126737a(count, i).iterator();
                while (it.hasNext()) {
                    String str = (String) arrayMap2.get(Integer.valueOf(it.next().intValue()));
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                arrayMap.put(type, arrayList);
            }
        }
        return arrayMap;
    }

    @Override // com.ss.android.lark.chat.api.service.track.sample.BaseSampleRecorder
    /* renamed from: a */
    public void mo121431a(MessageInfo messageInfo, boolean z) {
        int i;
        Intrinsics.checkParameterIsNotNull(messageInfo, "messageInfo");
        ArrayMap<String, Integer> b = m126738b(messageInfo);
        SampleConfigParser.ReactionSampleReportConfig reactionSampleReportConfig = this.f84561e;
        if (reactionSampleReportConfig != null) {
            i = reactionSampleReportConfig.getQuantileCount();
        } else {
            i = 4;
        }
        ArrayMap<String, List<String>> a = m126736a(messageInfo, i);
        ChatSampleIssueHitPoint.ReactionParam.Builder aVar = new ChatSampleIssueHitPoint.ReactionParam.Builder();
        String id = messageInfo.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "messageInfo.id");
        ChatSampleIssueHitPoint.ReactionParam.Builder a2 = aVar.mo187504a(id).mo187503a(b).mo187507b(a).mo187502a(i);
        Message message = messageInfo.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
        a2.mo187505a(message.isSyncMsgDep()).mo187508b(z).mo187506a().mo187501a();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ReactionSampleRecorder(com.ss.android.lark.chat.entity.chat.Chat r8, com.ss.android.lark.chat.api.service.track.sample.MsgSampleIssueTracker.IMessageSourceFetcher r9, com.ss.android.lark.chat.api.service.track.sample.MsgSampleIssueTracker.IMessagePipeSyncFetcher r10, java.lang.String r11, java.util.concurrent.ScheduledExecutorService r12) {
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
            r7.f84562f = r8
            com.ss.android.lark.chat.api.service.track.sample.SampleConfigParser r8 = com.ss.android.lark.chat.api.service.track.sample.SampleConfigParser.INSTANCE
            com.ss.android.lark.chat.api.service.track.sample.SampleConfigParser$ReactionSampleReportConfig r8 = r8.getReactionConfig()
            r7.f84561e = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.api.service.track.sample.ReactionSampleRecorder.<init>(com.ss.android.lark.chat.entity.chat.Chat, com.ss.android.lark.chat.api.service.track.sample.a$c, com.ss.android.lark.chat.api.service.track.sample.a$b, java.lang.String, java.util.concurrent.ScheduledExecutorService):void");
    }
}
