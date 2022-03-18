package com.ss.android.vc.entity.parser;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.pb.videochat.ParticipantSettings;
import com.ss.android.lark.pb.videoconference.v1.ParticipantSettings;
import com.ss.android.vc.entity.ParticipantSettings;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010\u0003\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/vc/entity/parser/ModelHelper;", "", "()V", "transferEquipmentStatus", "Lcom/ss/android/vc/entity/ParticipantSettings$EquipmentStatus;", UpdateKey.STATUS, "Lcom/ss/android/lark/pb/videochat/ParticipantSettings$EquipmentStatus;", "Lcom/ss/android/lark/pb/videoconference/v1/ParticipantSettings$EquipmentStatus;", "lib_vc_network_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.entity.a.a */
public final class ModelHelper {

    /* renamed from: a */
    public static final ModelHelper f152476a = new ModelHelper();

    private ModelHelper() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final ParticipantSettings.EquipmentStatus m236798a(ParticipantSettings.EquipmentStatus equipmentStatus) {
        if (equipmentStatus == null) {
            return ParticipantSettings.EquipmentStatus.UNKNOWN;
        }
        int i = C60929b.f152477a[equipmentStatus.ordinal()];
        if (i == 1) {
            return ParticipantSettings.EquipmentStatus.NORMAL;
        }
        if (i == 2) {
            return ParticipantSettings.EquipmentStatus.NOT_EXIST;
        }
        if (i == 3) {
            return ParticipantSettings.EquipmentStatus.UNAVAILABLE;
        }
        if (i != 4) {
            return ParticipantSettings.EquipmentStatus.UNKNOWN;
        }
        return ParticipantSettings.EquipmentStatus.NO_PERMISSION;
    }

    @JvmStatic
    /* renamed from: a */
    public static final ParticipantSettings.EquipmentStatus m236799a(ParticipantSettings.EquipmentStatus equipmentStatus) {
        if (equipmentStatus == null) {
            return ParticipantSettings.EquipmentStatus.UNKNOWN;
        }
        int i = C60929b.f152479c[equipmentStatus.ordinal()];
        if (i == 1) {
            return ParticipantSettings.EquipmentStatus.NORMAL;
        }
        if (i == 2) {
            return ParticipantSettings.EquipmentStatus.NOT_EXIST;
        }
        if (i == 3) {
            return ParticipantSettings.EquipmentStatus.UNAVAILABLE;
        }
        if (i != 4) {
            return ParticipantSettings.EquipmentStatus.UNKNOWN;
        }
        return ParticipantSettings.EquipmentStatus.NO_PERMISSION;
    }

    @JvmStatic
    /* renamed from: a */
    public static final ParticipantSettings.EquipmentStatus m236800a(ParticipantSettings.EquipmentStatus equipmentStatus) {
        if (equipmentStatus == null) {
            return ParticipantSettings.EquipmentStatus.UNKNOWN;
        }
        int i = C60929b.f152478b[equipmentStatus.ordinal()];
        if (i == 1) {
            return ParticipantSettings.EquipmentStatus.NORMAL;
        }
        if (i == 2) {
            return ParticipantSettings.EquipmentStatus.NOT_EXIST;
        }
        if (i == 3) {
            return ParticipantSettings.EquipmentStatus.UNAVAILABLE;
        }
        if (i != 4) {
            return ParticipantSettings.EquipmentStatus.UNKNOWN;
        }
        return ParticipantSettings.EquipmentStatus.NO_PERMISSION;
    }
}
