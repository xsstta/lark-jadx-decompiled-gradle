package com.ss.android.lark.larkconfig.larksetting.handler.privacydetection;

import com.google.gson.annotations.SerializedName;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b$\b\u0007\u0018\u00002\u00020\u0001B{\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0010R\u001e\u0010\n\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001e\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001e\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\u001e\u0010\f\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R\u001e\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018R\u001e\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/ss/android/lark/larkconfig/larksetting/handler/privacydetection/Anchor;", "", "anchorLifecycle", "", "", "anchorMonitorEvents", "", "anchorPage", "anchorTimeDelay", "", "advancedAnchorTimeDelay", "midAnchorTimeDelay", "maxAnchorTimeDelay", "detectionPage", "timeLineEventLimit", "removeTaskLifecycle", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;JJJJLjava/lang/String;ILjava/util/List;)V", "getAdvancedAnchorTimeDelay", "()J", "setAdvancedAnchorTimeDelay", "(J)V", "getAnchorLifecycle", "()Ljava/util/List;", "setAnchorLifecycle", "(Ljava/util/List;)V", "getAnchorMonitorEvents", "setAnchorMonitorEvents", "getAnchorPage", "()Ljava/lang/String;", "setAnchorPage", "(Ljava/lang/String;)V", "getAnchorTimeDelay", "setAnchorTimeDelay", "getDetectionPage", "setDetectionPage", "getMaxAnchorTimeDelay", "setMaxAnchorTimeDelay", "getMidAnchorTimeDelay", "setMidAnchorTimeDelay", "getRemoveTaskLifecycle", "setRemoveTaskLifecycle", "getTimeLineEventLimit", "()I", "setTimeLineEventLimit", "(I)V", "larksetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class Anchor {
    @SerializedName("advanced_anchor_time_delay")
    private long advancedAnchorTimeDelay;
    @SerializedName("anchor_lifecycle")
    private List<String> anchorLifecycle;
    @SerializedName("anchor_monitor_events")
    private List<Integer> anchorMonitorEvents;
    @SerializedName("anchor_page")
    private String anchorPage;
    @SerializedName("anchor_time_delay")
    private long anchorTimeDelay;
    @SerializedName("detection_page")
    private String detectionPage;
    @SerializedName("max_anchor_time_delay")
    private long maxAnchorTimeDelay;
    @SerializedName("mid_anchor_time_delay")
    private long midAnchorTimeDelay;
    @SerializedName("remove_task_lifecycle")
    private List<String> removeTaskLifecycle;
    @SerializedName("timeLine_event_limit")
    private int timeLineEventLimit;

    public Anchor() {
        this(null, null, null, 0, 0, 0, 0, null, 0, null, IByteRtcError.BRERR_ADM_NO_MODIFY_PERMISSION, null);
    }

    public final long getAdvancedAnchorTimeDelay() {
        return this.advancedAnchorTimeDelay;
    }

    public final List<String> getAnchorLifecycle() {
        return this.anchorLifecycle;
    }

    public final List<Integer> getAnchorMonitorEvents() {
        return this.anchorMonitorEvents;
    }

    public final String getAnchorPage() {
        return this.anchorPage;
    }

    public final long getAnchorTimeDelay() {
        return this.anchorTimeDelay;
    }

    public final String getDetectionPage() {
        return this.detectionPage;
    }

    public final long getMaxAnchorTimeDelay() {
        return this.maxAnchorTimeDelay;
    }

    public final long getMidAnchorTimeDelay() {
        return this.midAnchorTimeDelay;
    }

    public final List<String> getRemoveTaskLifecycle() {
        return this.removeTaskLifecycle;
    }

    public final int getTimeLineEventLimit() {
        return this.timeLineEventLimit;
    }

    public final void setAdvancedAnchorTimeDelay(long j) {
        this.advancedAnchorTimeDelay = j;
    }

    public final void setAnchorTimeDelay(long j) {
        this.anchorTimeDelay = j;
    }

    public final void setMaxAnchorTimeDelay(long j) {
        this.maxAnchorTimeDelay = j;
    }

    public final void setMidAnchorTimeDelay(long j) {
        this.midAnchorTimeDelay = j;
    }

    public final void setTimeLineEventLimit(int i) {
        this.timeLineEventLimit = i;
    }

    public final void setAnchorLifecycle(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.anchorLifecycle = list;
    }

    public final void setAnchorMonitorEvents(List<Integer> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.anchorMonitorEvents = list;
    }

    public final void setAnchorPage(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.anchorPage = str;
    }

    public final void setDetectionPage(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.detectionPage = str;
    }

    public final void setRemoveTaskLifecycle(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.removeTaskLifecycle = list;
    }

    public Anchor(List<String> list, List<Integer> list2, String str, long j, long j2, long j3, long j4, String str2, int i, List<String> list3) {
        Intrinsics.checkParameterIsNotNull(list, "anchorLifecycle");
        Intrinsics.checkParameterIsNotNull(list2, "anchorMonitorEvents");
        Intrinsics.checkParameterIsNotNull(str, "anchorPage");
        Intrinsics.checkParameterIsNotNull(str2, "detectionPage");
        Intrinsics.checkParameterIsNotNull(list3, "removeTaskLifecycle");
        this.anchorLifecycle = list;
        this.anchorMonitorEvents = list2;
        this.anchorPage = str;
        this.anchorTimeDelay = j;
        this.advancedAnchorTimeDelay = j2;
        this.midAnchorTimeDelay = j3;
        this.maxAnchorTimeDelay = j4;
        this.detectionPage = str2;
        this.timeLineEventLimit = i;
        this.removeTaskLifecycle = list3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Anchor(java.util.List r15, java.util.List r16, java.lang.String r17, long r18, long r20, long r22, long r24, java.lang.String r26, int r27, java.util.List r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
        /*
        // Method dump skipped, instructions count: 130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.larkconfig.larksetting.handler.privacydetection.Anchor.<init>(java.util.List, java.util.List, java.lang.String, long, long, long, long, java.lang.String, int, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
