package com.ss.android.lark.mm.module.list.data;

import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.lark.mm.base.IMmSerializable;
import com.ss.android.lark.mm.module.list.widget.IProgressCalculator;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

public final class ListModel implements IMmSerializable {
    private ArrayList<MinutesSummaryData> duration;
    private MinutesListResponse homeList;
    private MinutesListResponse myList;
    private final Map<String, Pair<Integer, IProgressCalculator>> progressMap;
    private MinutesSummaryData recording;
    private MinutesListResponse shareList;
    private ArrayList<MinutesStatusData> status;
    private MinutesListResponse trashList;
    private final Integer uploadingProgress;
    private String uploadingToken;

    public ListModel() {
        this(null, null, null, null, null, null, null, null, null, null, IByteRtcError.BRERR_ADM_NO_MODIFY_PERMISSION, null);
    }

    public static /* synthetic */ ListModel copy$default(ListModel listModel, MinutesListResponse minutesListResponse, MinutesListResponse minutesListResponse2, MinutesListResponse minutesListResponse3, MinutesListResponse minutesListResponse4, ArrayList arrayList, ArrayList arrayList2, MinutesSummaryData minutesSummaryData, String str, Integer num, Map map, int i, Object obj) {
        return listModel.copy((i & 1) != 0 ? listModel.homeList : minutesListResponse, (i & 2) != 0 ? listModel.myList : minutesListResponse2, (i & 4) != 0 ? listModel.shareList : minutesListResponse3, (i & 8) != 0 ? listModel.trashList : minutesListResponse4, (i & 16) != 0 ? listModel.status : arrayList, (i & 32) != 0 ? listModel.duration : arrayList2, (i & 64) != 0 ? listModel.recording : minutesSummaryData, (i & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? listModel.uploadingToken : str, (i & DynamicModule.f58006b) != 0 ? listModel.uploadingProgress : num, (i & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0 ? listModel.progressMap : map);
    }

    public final MinutesListResponse component1() {
        return this.homeList;
    }

    public final Map<String, Pair<Integer, IProgressCalculator>> component10() {
        return this.progressMap;
    }

    public final MinutesListResponse component2() {
        return this.myList;
    }

    public final MinutesListResponse component3() {
        return this.shareList;
    }

    public final MinutesListResponse component4() {
        return this.trashList;
    }

    public final ArrayList<MinutesStatusData> component5() {
        return this.status;
    }

    public final ArrayList<MinutesSummaryData> component6() {
        return this.duration;
    }

    public final MinutesSummaryData component7() {
        return this.recording;
    }

    public final String component8() {
        return this.uploadingToken;
    }

    public final Integer component9() {
        return this.uploadingProgress;
    }

    public final ListModel copy(MinutesListResponse minutesListResponse, MinutesListResponse minutesListResponse2, MinutesListResponse minutesListResponse3, MinutesListResponse minutesListResponse4, ArrayList<MinutesStatusData> arrayList, ArrayList<MinutesSummaryData> arrayList2, MinutesSummaryData minutesSummaryData, String str, Integer num, Map<String, Pair<Integer, IProgressCalculator>> map) {
        Intrinsics.checkParameterIsNotNull(map, "progressMap");
        return new ListModel(minutesListResponse, minutesListResponse2, minutesListResponse3, minutesListResponse4, arrayList, arrayList2, minutesSummaryData, str, num, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListModel)) {
            return false;
        }
        ListModel listModel = (ListModel) obj;
        return Intrinsics.areEqual(this.homeList, listModel.homeList) && Intrinsics.areEqual(this.myList, listModel.myList) && Intrinsics.areEqual(this.shareList, listModel.shareList) && Intrinsics.areEqual(this.trashList, listModel.trashList) && Intrinsics.areEqual(this.status, listModel.status) && Intrinsics.areEqual(this.duration, listModel.duration) && Intrinsics.areEqual(this.recording, listModel.recording) && Intrinsics.areEqual(this.uploadingToken, listModel.uploadingToken) && Intrinsics.areEqual(this.uploadingProgress, listModel.uploadingProgress) && Intrinsics.areEqual(this.progressMap, listModel.progressMap);
    }

    public int hashCode() {
        MinutesListResponse minutesListResponse = this.homeList;
        int i = 0;
        int hashCode = (minutesListResponse != null ? minutesListResponse.hashCode() : 0) * 31;
        MinutesListResponse minutesListResponse2 = this.myList;
        int hashCode2 = (hashCode + (minutesListResponse2 != null ? minutesListResponse2.hashCode() : 0)) * 31;
        MinutesListResponse minutesListResponse3 = this.shareList;
        int hashCode3 = (hashCode2 + (minutesListResponse3 != null ? minutesListResponse3.hashCode() : 0)) * 31;
        MinutesListResponse minutesListResponse4 = this.trashList;
        int hashCode4 = (hashCode3 + (minutesListResponse4 != null ? minutesListResponse4.hashCode() : 0)) * 31;
        ArrayList<MinutesStatusData> arrayList = this.status;
        int hashCode5 = (hashCode4 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        ArrayList<MinutesSummaryData> arrayList2 = this.duration;
        int hashCode6 = (hashCode5 + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31;
        MinutesSummaryData minutesSummaryData = this.recording;
        int hashCode7 = (hashCode6 + (minutesSummaryData != null ? minutesSummaryData.hashCode() : 0)) * 31;
        String str = this.uploadingToken;
        int hashCode8 = (hashCode7 + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.uploadingProgress;
        int hashCode9 = (hashCode8 + (num != null ? num.hashCode() : 0)) * 31;
        Map<String, Pair<Integer, IProgressCalculator>> map = this.progressMap;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode9 + i;
    }

    public String toString() {
        return "ListModel(homeList=" + this.homeList + ", myList=" + this.myList + ", shareList=" + this.shareList + ", trashList=" + this.trashList + ", status=" + this.status + ", duration=" + this.duration + ", recording=" + this.recording + ", uploadingToken=" + this.uploadingToken + ", uploadingProgress=" + this.uploadingProgress + ", progressMap=" + this.progressMap + ")";
    }

    public final ArrayList<MinutesSummaryData> getDuration() {
        return this.duration;
    }

    public final MinutesListResponse getHomeList() {
        return this.homeList;
    }

    public final MinutesListResponse getMyList() {
        return this.myList;
    }

    public final Map<String, Pair<Integer, IProgressCalculator>> getProgressMap() {
        return this.progressMap;
    }

    public final MinutesSummaryData getRecording() {
        return this.recording;
    }

    public final MinutesListResponse getShareList() {
        return this.shareList;
    }

    public final ArrayList<MinutesStatusData> getStatus() {
        return this.status;
    }

    public final MinutesListResponse getTrashList() {
        return this.trashList;
    }

    public final Integer getUploadingProgress() {
        return this.uploadingProgress;
    }

    public final String getUploadingToken() {
        return this.uploadingToken;
    }

    public final void setDuration(ArrayList<MinutesSummaryData> arrayList) {
        this.duration = arrayList;
    }

    public final void setHomeList(MinutesListResponse minutesListResponse) {
        this.homeList = minutesListResponse;
    }

    public final void setMyList(MinutesListResponse minutesListResponse) {
        this.myList = minutesListResponse;
    }

    public final void setRecording(MinutesSummaryData minutesSummaryData) {
        this.recording = minutesSummaryData;
    }

    public final void setShareList(MinutesListResponse minutesListResponse) {
        this.shareList = minutesListResponse;
    }

    public final void setStatus(ArrayList<MinutesStatusData> arrayList) {
        this.status = arrayList;
    }

    public final void setTrashList(MinutesListResponse minutesListResponse) {
        this.trashList = minutesListResponse;
    }

    public final void setUploadingToken(String str) {
        this.uploadingToken = str;
    }

    public ListModel(MinutesListResponse minutesListResponse, MinutesListResponse minutesListResponse2, MinutesListResponse minutesListResponse3, MinutesListResponse minutesListResponse4, ArrayList<MinutesStatusData> arrayList, ArrayList<MinutesSummaryData> arrayList2, MinutesSummaryData minutesSummaryData, String str, Integer num, Map<String, Pair<Integer, IProgressCalculator>> map) {
        Intrinsics.checkParameterIsNotNull(map, "progressMap");
        this.homeList = minutesListResponse;
        this.myList = minutesListResponse2;
        this.shareList = minutesListResponse3;
        this.trashList = minutesListResponse4;
        this.status = arrayList;
        this.duration = arrayList2;
        this.recording = minutesSummaryData;
        this.uploadingToken = str;
        this.uploadingProgress = num;
        this.progressMap = map;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ListModel(com.ss.android.lark.mm.module.list.data.MinutesListResponse r12, com.ss.android.lark.mm.module.list.data.MinutesListResponse r13, com.ss.android.lark.mm.module.list.data.MinutesListResponse r14, com.ss.android.lark.mm.module.list.data.MinutesListResponse r15, java.util.ArrayList r16, java.util.ArrayList r17, com.ss.android.lark.mm.module.list.data.MinutesSummaryData r18, java.lang.String r19, java.lang.Integer r20, java.util.Map r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.module.list.data.ListModel.<init>(com.ss.android.lark.mm.module.list.data.MinutesListResponse, com.ss.android.lark.mm.module.list.data.MinutesListResponse, com.ss.android.lark.mm.module.list.data.MinutesListResponse, com.ss.android.lark.mm.module.list.data.MinutesListResponse, java.util.ArrayList, java.util.ArrayList, com.ss.android.lark.mm.module.list.data.MinutesSummaryData, java.lang.String, java.lang.Integer, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
