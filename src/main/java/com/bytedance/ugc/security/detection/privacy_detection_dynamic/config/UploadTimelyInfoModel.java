package com.bytedance.ugc.security.detection.privacy_detection_dynamic.config;

import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B{\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00072\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0007HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006/"}, d2 = {"Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/config/UploadTimelyInfoModel;", "", "anchorPage", "", "anchorLifeCycle", "", "monitorEvents", "", "anchorTimeDelay", "", "advancedAnchorTimeDelay", "midAnchorTimeDelay", "maxAnchorTimeDelay", "detectionPage", "timeLineEventLimit", "removeTaskLifeCycle", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;JJJJLjava/lang/String;ILjava/util/List;)V", "getAdvancedAnchorTimeDelay", "()J", "getAnchorLifeCycle", "()Ljava/util/List;", "getAnchorPage", "()Ljava/lang/String;", "getAnchorTimeDelay", "getDetectionPage", "getMaxAnchorTimeDelay", "getMidAnchorTimeDelay", "getMonitorEvents", "getRemoveTaskLifeCycle", "getTimeLineEventLimit", "()I", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "privacy-detection-dynamic_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UploadTimelyInfoModel {
    private final long advancedAnchorTimeDelay;
    private final List<String> anchorLifeCycle;
    private final String anchorPage;
    private final long anchorTimeDelay;
    private final String detectionPage;
    private final long maxAnchorTimeDelay;
    private final long midAnchorTimeDelay;
    private final List<Integer> monitorEvents;
    private final List<String> removeTaskLifeCycle;
    private final int timeLineEventLimit;

    public UploadTimelyInfoModel() {
        this(null, null, null, 0, 0, 0, 0, null, 0, null, IByteRtcError.BRERR_ADM_NO_MODIFY_PERMISSION, null);
    }

    public static /* synthetic */ UploadTimelyInfoModel copy$default(UploadTimelyInfoModel uploadTimelyInfoModel, String str, List list, List list2, long j, long j2, long j3, long j4, String str2, int i, List list3, int i2, Object obj) {
        return uploadTimelyInfoModel.copy((i2 & 1) != 0 ? uploadTimelyInfoModel.anchorPage : str, (i2 & 2) != 0 ? uploadTimelyInfoModel.anchorLifeCycle : list, (i2 & 4) != 0 ? uploadTimelyInfoModel.monitorEvents : list2, (i2 & 8) != 0 ? uploadTimelyInfoModel.anchorTimeDelay : j, (i2 & 16) != 0 ? uploadTimelyInfoModel.advancedAnchorTimeDelay : j2, (i2 & 32) != 0 ? uploadTimelyInfoModel.midAnchorTimeDelay : j3, (i2 & 64) != 0 ? uploadTimelyInfoModel.maxAnchorTimeDelay : j4, (i2 & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? uploadTimelyInfoModel.detectionPage : str2, (i2 & DynamicModule.f58006b) != 0 ? uploadTimelyInfoModel.timeLineEventLimit : i, (i2 & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0 ? uploadTimelyInfoModel.removeTaskLifeCycle : list3);
    }

    public final String component1() {
        return this.anchorPage;
    }

    public final List<String> component10() {
        return this.removeTaskLifeCycle;
    }

    public final List<String> component2() {
        return this.anchorLifeCycle;
    }

    public final List<Integer> component3() {
        return this.monitorEvents;
    }

    public final long component4() {
        return this.anchorTimeDelay;
    }

    public final long component5() {
        return this.advancedAnchorTimeDelay;
    }

    public final long component6() {
        return this.midAnchorTimeDelay;
    }

    public final long component7() {
        return this.maxAnchorTimeDelay;
    }

    public final String component8() {
        return this.detectionPage;
    }

    public final int component9() {
        return this.timeLineEventLimit;
    }

    public final UploadTimelyInfoModel copy(String str, List<String> list, List<Integer> list2, long j, long j2, long j3, long j4, String str2, int i, List<String> list3) {
        Intrinsics.checkParameterIsNotNull(str, "anchorPage");
        Intrinsics.checkParameterIsNotNull(list, "anchorLifeCycle");
        Intrinsics.checkParameterIsNotNull(list2, "monitorEvents");
        Intrinsics.checkParameterIsNotNull(str2, "detectionPage");
        Intrinsics.checkParameterIsNotNull(list3, "removeTaskLifeCycle");
        return new UploadTimelyInfoModel(str, list, list2, j, j2, j3, j4, str2, i, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadTimelyInfoModel)) {
            return false;
        }
        UploadTimelyInfoModel uploadTimelyInfoModel = (UploadTimelyInfoModel) obj;
        return Intrinsics.areEqual(this.anchorPage, uploadTimelyInfoModel.anchorPage) && Intrinsics.areEqual(this.anchorLifeCycle, uploadTimelyInfoModel.anchorLifeCycle) && Intrinsics.areEqual(this.monitorEvents, uploadTimelyInfoModel.monitorEvents) && this.anchorTimeDelay == uploadTimelyInfoModel.anchorTimeDelay && this.advancedAnchorTimeDelay == uploadTimelyInfoModel.advancedAnchorTimeDelay && this.midAnchorTimeDelay == uploadTimelyInfoModel.midAnchorTimeDelay && this.maxAnchorTimeDelay == uploadTimelyInfoModel.maxAnchorTimeDelay && Intrinsics.areEqual(this.detectionPage, uploadTimelyInfoModel.detectionPage) && this.timeLineEventLimit == uploadTimelyInfoModel.timeLineEventLimit && Intrinsics.areEqual(this.removeTaskLifeCycle, uploadTimelyInfoModel.removeTaskLifeCycle);
    }

    public int hashCode() {
        String str = this.anchorPage;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.anchorLifeCycle;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<Integer> list2 = this.monitorEvents;
        int hashCode3 = list2 != null ? list2.hashCode() : 0;
        long j = this.anchorTimeDelay;
        long j2 = this.advancedAnchorTimeDelay;
        long j3 = this.midAnchorTimeDelay;
        long j4 = this.maxAnchorTimeDelay;
        int i2 = (((((((((hashCode2 + hashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        String str2 = this.detectionPage;
        int hashCode4 = (((i2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.timeLineEventLimit) * 31;
        List<String> list3 = this.removeTaskLifeCycle;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "UploadTimelyInfoModel(anchorPage=" + this.anchorPage + ", anchorLifeCycle=" + this.anchorLifeCycle + ", monitorEvents=" + this.monitorEvents + ", anchorTimeDelay=" + this.anchorTimeDelay + ", advancedAnchorTimeDelay=" + this.advancedAnchorTimeDelay + ", midAnchorTimeDelay=" + this.midAnchorTimeDelay + ", maxAnchorTimeDelay=" + this.maxAnchorTimeDelay + ", detectionPage=" + this.detectionPage + ", timeLineEventLimit=" + this.timeLineEventLimit + ", removeTaskLifeCycle=" + this.removeTaskLifeCycle + ")";
    }

    public final long getAdvancedAnchorTimeDelay() {
        return this.advancedAnchorTimeDelay;
    }

    public final List<String> getAnchorLifeCycle() {
        return this.anchorLifeCycle;
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

    public final List<Integer> getMonitorEvents() {
        return this.monitorEvents;
    }

    public final List<String> getRemoveTaskLifeCycle() {
        return this.removeTaskLifeCycle;
    }

    public final int getTimeLineEventLimit() {
        return this.timeLineEventLimit;
    }

    public UploadTimelyInfoModel(String str, List<String> list, List<Integer> list2, long j, long j2, long j3, long j4, String str2, int i, List<String> list3) {
        Intrinsics.checkParameterIsNotNull(str, "anchorPage");
        Intrinsics.checkParameterIsNotNull(list, "anchorLifeCycle");
        Intrinsics.checkParameterIsNotNull(list2, "monitorEvents");
        Intrinsics.checkParameterIsNotNull(str2, "detectionPage");
        Intrinsics.checkParameterIsNotNull(list3, "removeTaskLifeCycle");
        this.anchorPage = str;
        this.anchorLifeCycle = list;
        this.monitorEvents = list2;
        this.anchorTimeDelay = j;
        this.advancedAnchorTimeDelay = j2;
        this.midAnchorTimeDelay = j3;
        this.maxAnchorTimeDelay = j4;
        this.detectionPage = str2;
        this.timeLineEventLimit = i;
        this.removeTaskLifeCycle = list3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UploadTimelyInfoModel(java.lang.String r15, java.util.List r16, java.util.List r17, long r18, long r20, long r22, long r24, java.lang.String r26, int r27, java.util.List r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
        /*
        // Method dump skipped, instructions count: 130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.UploadTimelyInfoModel.<init>(java.lang.String, java.util.List, java.util.List, long, long, long, long, java.lang.String, int, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
