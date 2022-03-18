package com.ss.android.lark.chat.api.service.track.sample;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.log.Log;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u0004H\u0007J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0014\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/chat/api/service/track/sample/SampleConfigParser;", "", "()V", "TAG", "", "reactionConfig", "Lcom/ss/android/lark/chat/api/service/track/sample/SampleConfigParser$ReactionSampleReportConfig;", "getReactionConfig", "()Lcom/ss/android/lark/chat/api/service/track/sample/SampleConfigParser$ReactionSampleReportConfig;", "setReactionConfig", "(Lcom/ss/android/lark/chat/api/service/track/sample/SampleConfigParser$ReactionSampleReportConfig;)V", "readConfig", "Lcom/ss/android/lark/chat/api/service/track/sample/SampleConfigParser$ReadSampleReportConfig;", "getReadConfig", "()Lcom/ss/android/lark/chat/api/service/track/sample/SampleConfigParser$ReadSampleReportConfig;", "setReadConfig", "(Lcom/ss/android/lark/chat/api/service/track/sample/SampleConfigParser$ReadSampleReportConfig;)V", "initConfig", "", "parseReactionConfig", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "parseReadConfig", "ReactionSampleReportConfig", "ReadSampleReportConfig", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class SampleConfigParser {
    public static final SampleConfigParser INSTANCE = new SampleConfigParser();
    private static ReactionSampleReportConfig reactionConfig;
    private static ReadSampleReportConfig readConfig;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013¨\u0006%"}, d2 = {"Lcom/ss/android/lark/chat/api/service/track/sample/SampleConfigParser$ReactionSampleReportConfig;", "Ljava/io/Serializable;", "reportTimeIntervalInMs", "", "steadyStatePeriodInSeconds", "maxChatMemberCount", "", "quantileCount", "syncMsgDepLatencyInMs", "(JJIIJ)V", "getMaxChatMemberCount", "()I", "setMaxChatMemberCount", "(I)V", "getQuantileCount", "setQuantileCount", "getReportTimeIntervalInMs", "()J", "setReportTimeIntervalInMs", "(J)V", "getSteadyStatePeriodInSeconds", "setSteadyStatePeriodInSeconds", "getSyncMsgDepLatencyInMs", "setSyncMsgDepLatencyInMs", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class ReactionSampleReportConfig implements Serializable {
        private int maxChatMemberCount;
        private int quantileCount;
        private long reportTimeIntervalInMs;
        private long steadyStatePeriodInSeconds;
        private long syncMsgDepLatencyInMs;

        public ReactionSampleReportConfig() {
            this(0, 0, 0, 0, 0, 31, null);
        }

        public static /* synthetic */ ReactionSampleReportConfig copy$default(ReactionSampleReportConfig reactionSampleReportConfig, long j, long j2, int i, int i2, long j3, int i3, Object obj) {
            return reactionSampleReportConfig.copy((i3 & 1) != 0 ? reactionSampleReportConfig.reportTimeIntervalInMs : j, (i3 & 2) != 0 ? reactionSampleReportConfig.steadyStatePeriodInSeconds : j2, (i3 & 4) != 0 ? reactionSampleReportConfig.maxChatMemberCount : i, (i3 & 8) != 0 ? reactionSampleReportConfig.quantileCount : i2, (i3 & 16) != 0 ? reactionSampleReportConfig.syncMsgDepLatencyInMs : j3);
        }

        public final long component1() {
            return this.reportTimeIntervalInMs;
        }

        public final long component2() {
            return this.steadyStatePeriodInSeconds;
        }

        public final int component3() {
            return this.maxChatMemberCount;
        }

        public final int component4() {
            return this.quantileCount;
        }

        public final long component5() {
            return this.syncMsgDepLatencyInMs;
        }

        public final ReactionSampleReportConfig copy(@JSONField(name = "report_time_internal_ms") long j, @JSONField(name = "steady_state_period_s") long j2, @JSONField(name = "max_chat_member_count") int i, @JSONField(name = "quantile_count") int i2, @JSONField(name = "sync_msg_dep_latency_ms") long j3) {
            return new ReactionSampleReportConfig(j, j2, i, i2, j3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReactionSampleReportConfig)) {
                return false;
            }
            ReactionSampleReportConfig reactionSampleReportConfig = (ReactionSampleReportConfig) obj;
            return this.reportTimeIntervalInMs == reactionSampleReportConfig.reportTimeIntervalInMs && this.steadyStatePeriodInSeconds == reactionSampleReportConfig.steadyStatePeriodInSeconds && this.maxChatMemberCount == reactionSampleReportConfig.maxChatMemberCount && this.quantileCount == reactionSampleReportConfig.quantileCount && this.syncMsgDepLatencyInMs == reactionSampleReportConfig.syncMsgDepLatencyInMs;
        }

        public int hashCode() {
            return (((((((C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.reportTimeIntervalInMs) * 31) + C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.steadyStatePeriodInSeconds)) * 31) + this.maxChatMemberCount) * 31) + this.quantileCount) * 31) + C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.syncMsgDepLatencyInMs);
        }

        public String toString() {
            return "ReactionSampleReportConfig(reportTimeIntervalInMs=" + this.reportTimeIntervalInMs + ", steadyStatePeriodInSeconds=" + this.steadyStatePeriodInSeconds + ", maxChatMemberCount=" + this.maxChatMemberCount + ", quantileCount=" + this.quantileCount + ", syncMsgDepLatencyInMs=" + this.syncMsgDepLatencyInMs + ")";
        }

        public final int getMaxChatMemberCount() {
            return this.maxChatMemberCount;
        }

        public final int getQuantileCount() {
            return this.quantileCount;
        }

        public final long getReportTimeIntervalInMs() {
            return this.reportTimeIntervalInMs;
        }

        public final long getSteadyStatePeriodInSeconds() {
            return this.steadyStatePeriodInSeconds;
        }

        public final long getSyncMsgDepLatencyInMs() {
            return this.syncMsgDepLatencyInMs;
        }

        public final void setMaxChatMemberCount(int i) {
            this.maxChatMemberCount = i;
        }

        public final void setQuantileCount(int i) {
            this.quantileCount = i;
        }

        public final void setReportTimeIntervalInMs(long j) {
            this.reportTimeIntervalInMs = j;
        }

        public final void setSteadyStatePeriodInSeconds(long j) {
            this.steadyStatePeriodInSeconds = j;
        }

        public final void setSyncMsgDepLatencyInMs(long j) {
            this.syncMsgDepLatencyInMs = j;
        }

        public ReactionSampleReportConfig(@JSONField(name = "report_time_internal_ms") long j, @JSONField(name = "steady_state_period_s") long j2, @JSONField(name = "max_chat_member_count") int i, @JSONField(name = "quantile_count") int i2, @JSONField(name = "sync_msg_dep_latency_ms") long j3) {
            this.reportTimeIntervalInMs = j;
            this.steadyStatePeriodInSeconds = j2;
            this.maxChatMemberCount = i;
            this.quantileCount = i2;
            this.syncMsgDepLatencyInMs = j3;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ ReactionSampleReportConfig(long r10, long r12, int r14, int r15, long r16, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
            /*
                r9 = this;
                r0 = r18 & 1
                r1 = 0
                if (r0 == 0) goto L_0x0008
                r3 = r1
                goto L_0x0009
            L_0x0008:
                r3 = r10
            L_0x0009:
                r0 = r18 & 2
                if (r0 == 0) goto L_0x000f
                r5 = r1
                goto L_0x0010
            L_0x000f:
                r5 = r12
            L_0x0010:
                r0 = r18 & 4
                r7 = 0
                if (r0 == 0) goto L_0x0017
                r0 = 0
                goto L_0x0018
            L_0x0017:
                r0 = r14
            L_0x0018:
                r8 = r18 & 8
                if (r8 == 0) goto L_0x001d
                goto L_0x001e
            L_0x001d:
                r7 = r15
            L_0x001e:
                r8 = r18 & 16
                if (r8 == 0) goto L_0x0023
                goto L_0x0025
            L_0x0023:
                r1 = r16
            L_0x0025:
                r10 = r9
                r11 = r3
                r13 = r5
                r15 = r0
                r16 = r7
                r17 = r1
                r10.<init>(r11, r13, r15, r16, r17)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.api.service.track.sample.SampleConfigParser.ReactionSampleReportConfig.<init>(long, long, int, int, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\t\u0012\b\b\u0003\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003JE\u0010$\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u0006HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019¨\u0006,"}, d2 = {"Lcom/ss/android/lark/chat/api/service/track/sample/SampleConfigParser$ReadSampleReportConfig;", "Ljava/io/Serializable;", "reportTimeIntervalInMs", "", "steadyStatePeriodInSeconds", "maxChatMemberCount", "", "readCountLowerThreshold", "readCountUpperFact", "", "syncMsgDepLatencyInMs", "(JJIIFJ)V", "getMaxChatMemberCount", "()I", "setMaxChatMemberCount", "(I)V", "getReadCountLowerThreshold", "setReadCountLowerThreshold", "getReadCountUpperFact", "()F", "setReadCountUpperFact", "(F)V", "getReportTimeIntervalInMs", "()J", "setReportTimeIntervalInMs", "(J)V", "getSteadyStatePeriodInSeconds", "setSteadyStatePeriodInSeconds", "getSyncMsgDepLatencyInMs", "setSyncMsgDepLatencyInMs", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class ReadSampleReportConfig implements Serializable {
        private int maxChatMemberCount;
        private int readCountLowerThreshold;
        private float readCountUpperFact;
        private long reportTimeIntervalInMs;
        private long steadyStatePeriodInSeconds;
        private long syncMsgDepLatencyInMs;

        public ReadSampleReportConfig() {
            this(0, 0, 0, 0, BitmapDescriptorFactory.HUE_RED, 0, 63, null);
        }

        public static /* synthetic */ ReadSampleReportConfig copy$default(ReadSampleReportConfig readSampleReportConfig, long j, long j2, int i, int i2, float f, long j3, int i3, Object obj) {
            return readSampleReportConfig.copy((i3 & 1) != 0 ? readSampleReportConfig.reportTimeIntervalInMs : j, (i3 & 2) != 0 ? readSampleReportConfig.steadyStatePeriodInSeconds : j2, (i3 & 4) != 0 ? readSampleReportConfig.maxChatMemberCount : i, (i3 & 8) != 0 ? readSampleReportConfig.readCountLowerThreshold : i2, (i3 & 16) != 0 ? readSampleReportConfig.readCountUpperFact : f, (i3 & 32) != 0 ? readSampleReportConfig.syncMsgDepLatencyInMs : j3);
        }

        public final long component1() {
            return this.reportTimeIntervalInMs;
        }

        public final long component2() {
            return this.steadyStatePeriodInSeconds;
        }

        public final int component3() {
            return this.maxChatMemberCount;
        }

        public final int component4() {
            return this.readCountLowerThreshold;
        }

        public final float component5() {
            return this.readCountUpperFact;
        }

        public final long component6() {
            return this.syncMsgDepLatencyInMs;
        }

        public final ReadSampleReportConfig copy(@JSONField(name = "report_time_internal_ms") long j, @JSONField(name = "steady_state_period_s") long j2, @JSONField(name = "max_chat_member_count") int i, @JSONField(name = "read_count_lower_threshold") int i2, @JSONField(name = "read_count_upper_fact") float f, @JSONField(name = "sync_msg_dep_latency_ms") long j3) {
            return new ReadSampleReportConfig(j, j2, i, i2, f, j3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReadSampleReportConfig)) {
                return false;
            }
            ReadSampleReportConfig readSampleReportConfig = (ReadSampleReportConfig) obj;
            return this.reportTimeIntervalInMs == readSampleReportConfig.reportTimeIntervalInMs && this.steadyStatePeriodInSeconds == readSampleReportConfig.steadyStatePeriodInSeconds && this.maxChatMemberCount == readSampleReportConfig.maxChatMemberCount && this.readCountLowerThreshold == readSampleReportConfig.readCountLowerThreshold && Float.compare(this.readCountUpperFact, readSampleReportConfig.readCountUpperFact) == 0 && this.syncMsgDepLatencyInMs == readSampleReportConfig.syncMsgDepLatencyInMs;
        }

        public int hashCode() {
            return (((((((((C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.reportTimeIntervalInMs) * 31) + C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.steadyStatePeriodInSeconds)) * 31) + this.maxChatMemberCount) * 31) + this.readCountLowerThreshold) * 31) + Float.floatToIntBits(this.readCountUpperFact)) * 31) + C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.syncMsgDepLatencyInMs);
        }

        public String toString() {
            return "ReadSampleReportConfig(reportTimeIntervalInMs=" + this.reportTimeIntervalInMs + ", steadyStatePeriodInSeconds=" + this.steadyStatePeriodInSeconds + ", maxChatMemberCount=" + this.maxChatMemberCount + ", readCountLowerThreshold=" + this.readCountLowerThreshold + ", readCountUpperFact=" + this.readCountUpperFact + ", syncMsgDepLatencyInMs=" + this.syncMsgDepLatencyInMs + ")";
        }

        public final int getMaxChatMemberCount() {
            return this.maxChatMemberCount;
        }

        public final int getReadCountLowerThreshold() {
            return this.readCountLowerThreshold;
        }

        public final float getReadCountUpperFact() {
            return this.readCountUpperFact;
        }

        public final long getReportTimeIntervalInMs() {
            return this.reportTimeIntervalInMs;
        }

        public final long getSteadyStatePeriodInSeconds() {
            return this.steadyStatePeriodInSeconds;
        }

        public final long getSyncMsgDepLatencyInMs() {
            return this.syncMsgDepLatencyInMs;
        }

        public final void setMaxChatMemberCount(int i) {
            this.maxChatMemberCount = i;
        }

        public final void setReadCountLowerThreshold(int i) {
            this.readCountLowerThreshold = i;
        }

        public final void setReadCountUpperFact(float f) {
            this.readCountUpperFact = f;
        }

        public final void setReportTimeIntervalInMs(long j) {
            this.reportTimeIntervalInMs = j;
        }

        public final void setSteadyStatePeriodInSeconds(long j) {
            this.steadyStatePeriodInSeconds = j;
        }

        public final void setSyncMsgDepLatencyInMs(long j) {
            this.syncMsgDepLatencyInMs = j;
        }

        public ReadSampleReportConfig(@JSONField(name = "report_time_internal_ms") long j, @JSONField(name = "steady_state_period_s") long j2, @JSONField(name = "max_chat_member_count") int i, @JSONField(name = "read_count_lower_threshold") int i2, @JSONField(name = "read_count_upper_fact") float f, @JSONField(name = "sync_msg_dep_latency_ms") long j3) {
            this.reportTimeIntervalInMs = j;
            this.steadyStatePeriodInSeconds = j2;
            this.maxChatMemberCount = i;
            this.readCountLowerThreshold = i2;
            this.readCountUpperFact = f;
            this.syncMsgDepLatencyInMs = j3;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ ReadSampleReportConfig(long r11, long r13, int r15, int r16, float r17, long r18, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
            /*
                r10 = this;
                r0 = r20 & 1
                r1 = 0
                if (r0 == 0) goto L_0x0008
                r3 = r1
                goto L_0x0009
            L_0x0008:
                r3 = r11
            L_0x0009:
                r0 = r20 & 2
                if (r0 == 0) goto L_0x000f
                r5 = r1
                goto L_0x0010
            L_0x000f:
                r5 = r13
            L_0x0010:
                r0 = r20 & 4
                r7 = 0
                if (r0 == 0) goto L_0x0017
                r0 = 0
                goto L_0x0018
            L_0x0017:
                r0 = r15
            L_0x0018:
                r8 = r20 & 8
                if (r8 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r7 = r16
            L_0x001f:
                r8 = r20 & 16
                if (r8 == 0) goto L_0x0026
                r8 = 1065353216(0x3f800000, float:1.0)
                goto L_0x0028
            L_0x0026:
                r8 = r17
            L_0x0028:
                r9 = r20 & 32
                if (r9 == 0) goto L_0x002d
                goto L_0x002f
            L_0x002d:
                r1 = r18
            L_0x002f:
                r11 = r10
                r12 = r3
                r14 = r5
                r16 = r0
                r17 = r7
                r18 = r8
                r19 = r1
                r11.<init>(r12, r14, r16, r17, r18, r19)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.api.service.track.sample.SampleConfigParser.ReadSampleReportConfig.<init>(long, long, int, int, float, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    private SampleConfigParser() {
    }

    public final ReactionSampleReportConfig getReactionConfig() {
        return reactionConfig;
    }

    public final ReadSampleReportConfig getReadConfig() {
        return readConfig;
    }

    @JvmStatic
    public static final void initConfig() {
        if (reactionConfig == null) {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36474h.AbstractC36475a ab = b.ab();
            Intrinsics.checkExpressionValueIsNotNull(ab, "ChatModuleInstanceHolder…ncy().appConfigDependency");
            String c = ab.mo134604c();
            Intrinsics.checkExpressionValueIsNotNull(c, "ChatModuleInstanceHolder…ency.reactionSampleConfig");
            reactionConfig = parseReactionConfig(c);
        }
        if (readConfig == null) {
            AbstractC36474h b2 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36474h.AbstractC36475a ab2 = b2.ab();
            Intrinsics.checkExpressionValueIsNotNull(ab2, "ChatModuleInstanceHolder…ncy().appConfigDependency");
            String d = ab2.mo134605d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ChatModuleInstanceHolder…pendency.readSampleConfig");
            readConfig = parseReadConfig(d);
        }
    }

    public final void setReactionConfig(ReactionSampleReportConfig reactionSampleReportConfig) {
        reactionConfig = reactionSampleReportConfig;
    }

    public final void setReadConfig(ReadSampleReportConfig readSampleReportConfig) {
        readConfig = readSampleReportConfig;
    }

    @JvmStatic
    public static final ReactionSampleReportConfig parseReactionConfig(String str) {
        Intrinsics.checkParameterIsNotNull(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        try {
            Log.m165389i("SampleConfigParser", "SampleConfigParser: " + str);
            return (ReactionSampleReportConfig) JSONObject.parseObject(str, ReactionSampleReportConfig.class);
        } catch (Exception e) {
            Log.m165383e("SampleConfigParser", "error: +" + e.getMessage() + ')');
            return null;
        }
    }

    @JvmStatic
    public static final ReadSampleReportConfig parseReadConfig(String str) {
        Intrinsics.checkParameterIsNotNull(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        try {
            Log.m165389i("SampleConfigParser", "SampleConfigParser: " + str);
            return (ReadSampleReportConfig) JSONObject.parseObject(str, ReadSampleReportConfig.class);
        } catch (Exception e) {
            Log.m165383e("SampleConfigParser", "error: +" + e.getMessage() + ')');
            return null;
        }
    }
}
