package com.bytedance.ee.bear.middleground.permission.permission.doc;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b*\n\u0002\u0010\u0002\n\u0002\b\u0007\b\b\u0018\u0000 h2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001hBÅ\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016J\b\u0010 \u001a\u00020\fH\u0016J\t\u0010!\u001a\u00020\u0005HÂ\u0003J\t\u0010\"\u001a\u00020\fHÂ\u0003J\t\u0010#\u001a\u00020\fHÂ\u0003J\t\u0010$\u001a\u00020\fHÂ\u0003J\t\u0010%\u001a\u00020\fHÂ\u0003J\t\u0010&\u001a\u00020\fHÂ\u0003J\t\u0010'\u001a\u00020\u000fHÂ\u0003J\t\u0010(\u001a\u00020\u0017HÂ\u0003J\t\u0010)\u001a\u00020\u0019HÂ\u0003J\t\u0010*\u001a\u00020\u001bHÂ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u001dHÂ\u0003J\t\u0010,\u001a\u00020\u0005HÂ\u0003J\t\u0010-\u001a\u00020\u0005HÂ\u0003J\t\u0010.\u001a\u00020\u0005HÂ\u0003J\t\u0010/\u001a\u00020\u0005HÂ\u0003J\t\u00100\u001a\u00020\u0005HÂ\u0003J\t\u00101\u001a\u00020\fHÂ\u0003J\t\u00102\u001a\u00020\fHÂ\u0003J\t\u00103\u001a\u00020\u000fHÂ\u0003JÉ\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÆ\u0001J\u0013\u00105\u001a\u00020\f2\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u00108\u001a\u00020\u0005H\u0016J\b\u00109\u001a\u00020\u0005H\u0016J\b\u0010:\u001a\u00020\u0005H\u0016J\b\u0010;\u001a\u00020\u000fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\t\u0010<\u001a\u00020\u0005HÖ\u0001J\b\u0010=\u001a\u00020\fH\u0016J\b\u0010>\u001a\u00020\fH\u0016J\b\u0010?\u001a\u00020\fH\u0016J\b\u0010@\u001a\u00020\fH\u0016J\b\u0010A\u001a\u00020\fH\u0016J\b\u0010B\u001a\u00020\fH\u0016J\b\u0010C\u001a\u00020\fH\u0016J\b\u0010D\u001a\u00020\fH\u0016J\b\u0010E\u001a\u00020\fH\u0016J\b\u0010F\u001a\u00020\fH\u0016J\b\u0010G\u001a\u00020\fH\u0016J\b\u0010H\u001a\u00020\fH\u0016J\b\u0010I\u001a\u00020\fH\u0016J\b\u0010J\u001a\u00020\fH\u0016J\b\u0010K\u001a\u00020\fH\u0016J\b\u0010L\u001a\u00020\fH\u0016J\b\u0010M\u001a\u00020\fH\u0016J\b\u0010N\u001a\u00020\fH\u0016J\b\u0010O\u001a\u00020\fH\u0016J\b\u0010P\u001a\u00020\fH\u0016J\b\u0010Q\u001a\u00020\fH\u0016J\b\u0010R\u001a\u00020\fH\u0016J\b\u0010S\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016J\b\u0010T\u001a\u00020\fH\u0016J\b\u0010U\u001a\u00020\fH\u0016J\b\u0010V\u001a\u00020\fH\u0016J\b\u0010W\u001a\u00020\fH\u0016J\b\u0010X\u001a\u00020\fH\u0016J\b\u0010Y\u001a\u00020\fH\u0016J\b\u0010Z\u001a\u00020\fH\u0016J\b\u0010[\u001a\u00020\fH\u0016J\b\u0010\\\u001a\u00020\fH\u0016J\b\u0010]\u001a\u00020\fH\u0016J\b\u0010^\u001a\u00020\fH\u0016J\b\u0010_\u001a\u00020\fH\u0016J\b\u0010`\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020\fH\u0016J\u0010\u0010d\u001a\u00020b2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0010\u0010e\u001a\u00020b2\u0006\u0010f\u001a\u00020\u000fH\u0016J\t\u0010g\u001a\u00020\u000fHÖ\u0001R\u000e\u0010\u0012\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006i"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocPublicPermissionV2;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Ljava/io/Serializable;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocPublicPermission;", "shareExternalEntity", "", "linkShareEntity", "commentEntity", "shareEntity", "managerCollaboratorEntity", "securityEntity", "externalAccess", "", "hasLinkPassword", "linkPassword", "", "isOwner", "canCross", "anonymousVerify", "lockState", "canUnlock", "reportPublicPermJson", "constraints", "Lcom/bytedance/ee/bear/middleground/permission/permission/doc/PermissionConstraints;", "constraintsValue", "Lcom/bytedance/ee/bear/middleground/permission/permission/doc/PermissionConstraintsValue;", "permType", "Lcom/bytedance/ee/bear/middleground/permission/permission/doc/PermType;", "blockOptions", "Lcom/bytedance/ee/bear/middleground/permission/permission/doc/BlockOptions;", "(IIIIIIZZLjava/lang/String;ZZZZZLjava/lang/String;Lcom/bytedance/ee/bear/middleground/permission/permission/doc/PermissionConstraints;Lcom/bytedance/ee/bear/middleground/permission/permission/doc/PermissionConstraintsValue;Lcom/bytedance/ee/bear/middleground/permission/permission/doc/PermType;Lcom/bytedance/ee/bear/middleground/permission/permission/doc/BlockOptions;)V", "adminCanCross", "canUnLock", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "getLinkShareAnyoneEditBlockValue", "getLinkShareAnyoneReadBlockValue", "getLinkShareConstrains", "getReportJson", "hashCode", "inviteExternal", "isCommentConstraintsEdit", "isCommentSettingDisableByContainer", "isCommentSettingEnable", "isCommentWithEdit", "isCommentWithRead", "isExternalAccessConstraintByContainer", "isExternalAccessEnable", "isExternalAccessPermTypeSinglePage", "isLinkShareAnyoneEdit", "isLinkShareAnyoneEditDisable", "isLinkShareAnyoneRead", "isLinkShareAnyoneReadDisable", "isLinkShareClose", "isLinkShareInternalEdit", "isLinkShareInternalRead", "isLinkSharePermTypeSinglePage", "isLock", "isManagerCollaboratorAnyone", "isManagerCollaboratorTenant", "isManagerCollaboratorWithEdit", "isManagerCollaboratorWithFA", "isManagerCollaboratorWithRead", "isSecurityConstraintsEdit", "isSecurityConstraintsFa", "isSecuritySettingDisableByContainer", "isSecuritySettingEnable", "isSecurityWithEdit", "isSecurityWithFA", "isSecurityWithRead", "isShareAnyone", "isShareExternalWithEdit", "isShareExternalWithFA", "isShareExternalWithRead", "isShareInternal", "isShareOnlyMe", "setHasPassword", "", "hasPassword", "setOwner", "setPassword", "password", "toString", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DocPublicPermissionV2 extends NetService.Result<Serializable> implements IDocPublicPermission {
    public static final Companion Companion = new Companion(null);
    private boolean anonymousVerify;
    private final BlockOptions blockOptions;
    private boolean canCross;
    private boolean canUnlock;
    private int commentEntity;
    private PermissionConstraints constraints;
    private PermissionConstraintsValue constraintsValue;
    private boolean externalAccess;
    private boolean hasLinkPassword;
    private boolean isOwner;
    private String linkPassword;
    private int linkShareEntity;
    private boolean lockState;
    private int managerCollaboratorEntity;
    private final PermType permType;
    private String reportPublicPermJson;
    private int securityEntity;
    private int shareEntity;
    private int shareExternalEntity;

    public DocPublicPermissionV2() {
        this(0, 0, 0, 0, 0, 0, false, false, null, false, false, false, false, false, null, null, null, null, null, 524287, null);
    }

    private final int component1() {
        return this.shareExternalEntity;
    }

    private final boolean component10() {
        return this.isOwner;
    }

    private final boolean component11() {
        return this.canCross;
    }

    private final boolean component12() {
        return this.anonymousVerify;
    }

    private final boolean component13() {
        return this.lockState;
    }

    private final boolean component14() {
        return this.canUnlock;
    }

    private final String component15() {
        return this.reportPublicPermJson;
    }

    private final PermissionConstraints component16() {
        return this.constraints;
    }

    private final PermissionConstraintsValue component17() {
        return this.constraintsValue;
    }

    private final PermType component18() {
        return this.permType;
    }

    private final BlockOptions component19() {
        return this.blockOptions;
    }

    private final int component2() {
        return this.linkShareEntity;
    }

    private final int component3() {
        return this.commentEntity;
    }

    private final int component4() {
        return this.shareEntity;
    }

    private final int component5() {
        return this.managerCollaboratorEntity;
    }

    private final int component6() {
        return this.securityEntity;
    }

    private final boolean component7() {
        return this.externalAccess;
    }

    private final boolean component8() {
        return this.hasLinkPassword;
    }

    private final String component9() {
        return this.linkPassword;
    }

    public static /* synthetic */ DocPublicPermissionV2 copy$default(DocPublicPermissionV2 docPublicPermissionV2, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str2, PermissionConstraints permissionConstraints, PermissionConstraintsValue permissionConstraintsValue, PermType permType2, BlockOptions blockOptions2, int i7, Object obj) {
        return docPublicPermissionV2.copy((i7 & 1) != 0 ? docPublicPermissionV2.shareExternalEntity : i, (i7 & 2) != 0 ? docPublicPermissionV2.linkShareEntity : i2, (i7 & 4) != 0 ? docPublicPermissionV2.commentEntity : i3, (i7 & 8) != 0 ? docPublicPermissionV2.shareEntity : i4, (i7 & 16) != 0 ? docPublicPermissionV2.managerCollaboratorEntity : i5, (i7 & 32) != 0 ? docPublicPermissionV2.securityEntity : i6, (i7 & 64) != 0 ? docPublicPermissionV2.externalAccess : z, (i7 & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? docPublicPermissionV2.hasLinkPassword : z2, (i7 & DynamicModule.f58006b) != 0 ? docPublicPermissionV2.linkPassword : str, (i7 & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0 ? docPublicPermissionV2.isOwner : z3, (i7 & 1024) != 0 ? docPublicPermissionV2.canCross : z4, (i7 & 2048) != 0 ? docPublicPermissionV2.anonymousVerify : z5, (i7 & 4096) != 0 ? docPublicPermissionV2.lockState : z6, (i7 & 8192) != 0 ? docPublicPermissionV2.canUnlock : z7, (i7 & 16384) != 0 ? docPublicPermissionV2.reportPublicPermJson : str2, (i7 & 32768) != 0 ? docPublicPermissionV2.constraints : permissionConstraints, (i7 & 65536) != 0 ? docPublicPermissionV2.constraintsValue : permissionConstraintsValue, (i7 & 131072) != 0 ? docPublicPermissionV2.permType : permType2, (i7 & 262144) != 0 ? docPublicPermissionV2.blockOptions : blockOptions2);
    }

    public final DocPublicPermissionV2 copy(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str2, PermissionConstraints permissionConstraints, PermissionConstraintsValue permissionConstraintsValue, PermType permType2, BlockOptions blockOptions2) {
        Intrinsics.checkParameterIsNotNull(str, "linkPassword");
        Intrinsics.checkParameterIsNotNull(str2, "reportPublicPermJson");
        Intrinsics.checkParameterIsNotNull(permissionConstraints, "constraints");
        Intrinsics.checkParameterIsNotNull(permissionConstraintsValue, "constraintsValue");
        Intrinsics.checkParameterIsNotNull(permType2, "permType");
        return new DocPublicPermissionV2(i, i2, i3, i4, i5, i6, z, z2, str, z3, z4, z5, z6, z7, str2, permissionConstraints, permissionConstraintsValue, permType2, blockOptions2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DocPublicPermissionV2) {
                DocPublicPermissionV2 docPublicPermissionV2 = (DocPublicPermissionV2) obj;
                if (this.shareExternalEntity == docPublicPermissionV2.shareExternalEntity) {
                    if (this.linkShareEntity == docPublicPermissionV2.linkShareEntity) {
                        if (this.commentEntity == docPublicPermissionV2.commentEntity) {
                            if (this.shareEntity == docPublicPermissionV2.shareEntity) {
                                if (this.managerCollaboratorEntity == docPublicPermissionV2.managerCollaboratorEntity) {
                                    if (this.securityEntity == docPublicPermissionV2.securityEntity) {
                                        if (this.externalAccess == docPublicPermissionV2.externalAccess) {
                                            if ((this.hasLinkPassword == docPublicPermissionV2.hasLinkPassword) && Intrinsics.areEqual(this.linkPassword, docPublicPermissionV2.linkPassword)) {
                                                if (this.isOwner == docPublicPermissionV2.isOwner) {
                                                    if (this.canCross == docPublicPermissionV2.canCross) {
                                                        if (this.anonymousVerify == docPublicPermissionV2.anonymousVerify) {
                                                            if (this.lockState == docPublicPermissionV2.lockState) {
                                                                if (!(this.canUnlock == docPublicPermissionV2.canUnlock) || !Intrinsics.areEqual(this.reportPublicPermJson, docPublicPermissionV2.reportPublicPermJson) || !Intrinsics.areEqual(this.constraints, docPublicPermissionV2.constraints) || !Intrinsics.areEqual(this.constraintsValue, docPublicPermissionV2.constraintsValue) || !Intrinsics.areEqual(this.permType, docPublicPermissionV2.permType) || !Intrinsics.areEqual(this.blockOptions, docPublicPermissionV2.blockOptions)) {
                                                                    return false;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = ((((((((((this.shareExternalEntity * 31) + this.linkShareEntity) * 31) + this.commentEntity) * 31) + this.shareEntity) * 31) + this.managerCollaboratorEntity) * 31) + this.securityEntity) * 31;
        boolean z = this.externalAccess;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (i + i3) * 31;
        boolean z2 = this.hasLinkPassword;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        String str = this.linkPassword;
        int i11 = 0;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z3 = this.isOwner;
        if (z3) {
            z3 = true;
        }
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = (hashCode + i12) * 31;
        boolean z4 = this.canCross;
        if (z4) {
            z4 = true;
        }
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = z4 ? 1 : 0;
        int i19 = (i15 + i16) * 31;
        boolean z5 = this.anonymousVerify;
        if (z5) {
            z5 = true;
        }
        int i20 = z5 ? 1 : 0;
        int i21 = z5 ? 1 : 0;
        int i22 = z5 ? 1 : 0;
        int i23 = (i19 + i20) * 31;
        boolean z6 = this.lockState;
        if (z6) {
            z6 = true;
        }
        int i24 = z6 ? 1 : 0;
        int i25 = z6 ? 1 : 0;
        int i26 = z6 ? 1 : 0;
        int i27 = (i23 + i24) * 31;
        boolean z7 = this.canUnlock;
        if (!z7) {
            i2 = z7 ? 1 : 0;
        }
        int i28 = (i27 + i2) * 31;
        String str2 = this.reportPublicPermJson;
        int hashCode2 = (i28 + (str2 != null ? str2.hashCode() : 0)) * 31;
        PermissionConstraints permissionConstraints = this.constraints;
        int hashCode3 = (hashCode2 + (permissionConstraints != null ? permissionConstraints.hashCode() : 0)) * 31;
        PermissionConstraintsValue permissionConstraintsValue = this.constraintsValue;
        int hashCode4 = (hashCode3 + (permissionConstraintsValue != null ? permissionConstraintsValue.hashCode() : 0)) * 31;
        PermType permType2 = this.permType;
        int hashCode5 = (hashCode4 + (permType2 != null ? permType2.hashCode() : 0)) * 31;
        BlockOptions blockOptions2 = this.blockOptions;
        if (blockOptions2 != null) {
            i11 = blockOptions2.hashCode();
        }
        return hashCode5 + i11;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean inviteExternal() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isShareAnyone() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isShareInternal() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isShareOnlyMe() {
        return false;
    }

    public String toString() {
        return "DocPublicPermissionV2(shareExternalEntity=" + this.shareExternalEntity + ", linkShareEntity=" + this.linkShareEntity + ", commentEntity=" + this.commentEntity + ", shareEntity=" + this.shareEntity + ", managerCollaboratorEntity=" + this.managerCollaboratorEntity + ", securityEntity=" + this.securityEntity + ", externalAccess=" + this.externalAccess + ", hasLinkPassword=" + this.hasLinkPassword + ", linkPassword=" + this.linkPassword + ", isOwner=" + this.isOwner + ", canCross=" + this.canCross + ", anonymousVerify=" + this.anonymousVerify + ", lockState=" + this.lockState + ", canUnlock=" + this.canUnlock + ", reportPublicPermJson=" + this.reportPublicPermJson + ", constraints=" + this.constraints + ", constraintsValue=" + this.constraintsValue + ", permType=" + this.permType + ", blockOptions=" + this.blockOptions + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocPublicPermissionV2$Companion;", "", "()V", "COMMENT_WITH_EDIT_PERM", "", "COMMENT_WITH_READ_PERM", "LINK_SHARE_ANYONE_EDIT", "LINK_SHARE_ANYONE_READ", "LINK_SHARE_CLOSE", "LINK_SHARE_INTERNAL_EDIT", "LINK_SHARE_INTERNAL_READ", "MANAGER_COLLABORATOR_ANYONE", "MANAGER_COLLABORATOR_TENANT", "MANAGER_COLLABORATOR_WITH_EDIT", "MANAGER_COLLABORATOR_WITH_FA", "MANAGER_COLLABORATOR_WITH_READ", "SECURITY_WITH_EDIT", "SECURITY_WITH_FA", "SECURITY_WITH_READ", "SHARE_EXTERNAL_WITH_EDIT", "SHARE_EXTERNAL_WITH_FA", "SHARE_EXTERNAL_WITH_READ", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.permission.doc.DocPublicPermissionV2$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean adminCanCross() {
        return this.canCross;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean anonymousVerify() {
        return this.anonymousVerify;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean canUnLock() {
        return this.canUnlock;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean externalAccess() {
        return this.externalAccess;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public String getReportJson() {
        return this.reportPublicPermJson;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean hasLinkPassword() {
        return this.hasLinkPassword;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isLock() {
        return this.lockState;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isOwner() {
        return this.isOwner;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public String linkPassword() {
        return this.linkPassword;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public int getLinkShareConstrains() {
        return this.constraints.getLinkShareEntity();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isCommentSettingDisableByContainer() {
        return this.constraints.isCommentSettingDisabledByContainer();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isCommentWithRead() {
        if (this.commentEntity == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isLinkShareClose() {
        if (this.linkShareEntity == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isManagerCollaboratorTenant() {
        if (this.shareEntity == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isManagerCollaboratorWithRead() {
        if (this.managerCollaboratorEntity == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isSecuritySettingDisableByContainer() {
        return this.constraints.isSecuritySettingDisabledByContainer();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isSecurityWithRead() {
        if (this.securityEntity == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isShareExternalWithRead() {
        if (this.shareExternalEntity == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public int getLinkShareAnyoneEditBlockValue() {
        BlockOptions blockOptions2 = this.blockOptions;
        if (blockOptions2 != null) {
            return blockOptions2.getLinkShareAnyoneEditBlockValue();
        }
        return 0;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public int getLinkShareAnyoneReadBlockValue() {
        BlockOptions blockOptions2 = this.blockOptions;
        if (blockOptions2 != null) {
            return blockOptions2.getLinkShareAnyoneReadBlockValue();
        }
        return 0;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isCommentSettingEnable() {
        BlockOptions blockOptions2 = this.blockOptions;
        if (blockOptions2 != null) {
            return blockOptions2.isCommentEnable();
        }
        return this.constraints.isCommentSettingEnabled();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isCommentWithEdit() {
        if (this.commentEntity == 2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isExternalAccessPermTypeSinglePage() {
        if (this.permType.getExternalAccessSwitch() == 2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isLinkShareAnyoneEdit() {
        if (this.linkShareEntity == 5) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isLinkShareAnyoneEditDisable() {
        BlockOptions blockOptions2 = this.blockOptions;
        if (blockOptions2 != null) {
            return blockOptions2.isLinkShareAnyoneEditDisable();
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isLinkShareAnyoneRead() {
        if (this.linkShareEntity == 4) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isLinkShareAnyoneReadDisable() {
        BlockOptions blockOptions2 = this.blockOptions;
        if (blockOptions2 != null) {
            return blockOptions2.isLinkShareAnyoneReadDisable();
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isLinkShareInternalEdit() {
        if (this.linkShareEntity == 3) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isLinkShareInternalRead() {
        if (this.linkShareEntity == 2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isLinkSharePermTypeSinglePage() {
        if (this.permType.getLinkShareEntity() == 2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isManagerCollaboratorAnyone() {
        if (this.shareEntity == 2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isManagerCollaboratorWithEdit() {
        if (this.managerCollaboratorEntity == 2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isManagerCollaboratorWithFA() {
        if (this.managerCollaboratorEntity == 3) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isSecuritySettingEnable() {
        BlockOptions blockOptions2 = this.blockOptions;
        if (blockOptions2 != null) {
            return blockOptions2.isSecurityEnable();
        }
        return this.constraints.isSecuritySettingEnabled();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isSecurityWithEdit() {
        if (this.securityEntity == 2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isSecurityWithFA() {
        if (this.securityEntity == 3) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isShareExternalWithEdit() {
        if (this.shareExternalEntity == 2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isShareExternalWithFA() {
        if (this.shareExternalEntity == 3) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isCommentConstraintsEdit() {
        BlockOptions blockOptions2 = this.blockOptions;
        if (blockOptions2 != null) {
            return blockOptions2.isCommentReadDisable();
        }
        if (this.constraintsValue.getComment() == 2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isExternalAccessConstraintByContainer() {
        BlockOptions blockOptions2 = this.blockOptions;
        if (blockOptions2 == null) {
            return false;
        }
        if (blockOptions2.getExternalAccessOpenBlockValue() == 1 || this.blockOptions.getExternalAccessCloseBlockValue() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isExternalAccessEnable() {
        BlockOptions blockOptions2 = this.blockOptions;
        if (blockOptions2 == null) {
            return true;
        }
        if (blockOptions2.isExternalAccessOpenDisable() || this.blockOptions.isExternalAccessCloseDisable()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isSecurityConstraintsEdit() {
        BlockOptions blockOptions2 = this.blockOptions;
        if (blockOptions2 != null) {
            return blockOptions2.isSecurityReadDisable();
        }
        if (this.constraintsValue.getSecurity() == 2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isSecurityConstraintsFa() {
        BlockOptions blockOptions2 = this.blockOptions;
        if (blockOptions2 != null) {
            return blockOptions2.isSecurityEditDisable();
        }
        if (this.constraintsValue.getSecurity() == 3) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public void setOwner(boolean z) {
        this.isOwner = z;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public void setHasPassword(boolean z) {
        this.hasLinkPassword = this.hasLinkPassword;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public void setPassword(String str) {
        Intrinsics.checkParameterIsNotNull(str, "password");
        this.linkPassword = str;
    }

    public DocPublicPermissionV2(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str2, PermissionConstraints permissionConstraints, PermissionConstraintsValue permissionConstraintsValue, PermType permType2, BlockOptions blockOptions2) {
        Intrinsics.checkParameterIsNotNull(str, "linkPassword");
        Intrinsics.checkParameterIsNotNull(str2, "reportPublicPermJson");
        Intrinsics.checkParameterIsNotNull(permissionConstraints, "constraints");
        Intrinsics.checkParameterIsNotNull(permissionConstraintsValue, "constraintsValue");
        Intrinsics.checkParameterIsNotNull(permType2, "permType");
        this.shareExternalEntity = i;
        this.linkShareEntity = i2;
        this.commentEntity = i3;
        this.shareEntity = i4;
        this.managerCollaboratorEntity = i5;
        this.securityEntity = i6;
        this.externalAccess = z;
        this.hasLinkPassword = z2;
        this.linkPassword = str;
        this.isOwner = z3;
        this.canCross = z4;
        this.anonymousVerify = z5;
        this.lockState = z6;
        this.canUnlock = z7;
        this.reportPublicPermJson = str2;
        this.constraints = permissionConstraints;
        this.constraintsValue = permissionConstraintsValue;
        this.permType = permType2;
        this.blockOptions = blockOptions2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DocPublicPermissionV2(int r23, int r24, int r25, int r26, int r27, int r28, boolean r29, boolean r30, java.lang.String r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36, java.lang.String r37, com.bytedance.ee.bear.middleground.permission.permission.doc.PermissionConstraints r38, com.bytedance.ee.bear.middleground.permission.permission.doc.PermissionConstraintsValue r39, com.bytedance.ee.bear.middleground.permission.permission.doc.PermType r40, com.bytedance.ee.bear.middleground.permission.permission.doc.BlockOptions r41, int r42, kotlin.jvm.internal.DefaultConstructorMarker r43) {
        /*
        // Method dump skipped, instructions count: 268
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.permission.permission.doc.DocPublicPermissionV2.<init>(int, int, int, int, int, int, boolean, boolean, java.lang.String, boolean, boolean, boolean, boolean, boolean, java.lang.String, com.bytedance.ee.bear.middleground.permission.permission.doc.PermissionConstraints, com.bytedance.ee.bear.middleground.permission.permission.doc.PermissionConstraintsValue, com.bytedance.ee.bear.middleground.permission.permission.doc.PermType, com.bytedance.ee.bear.middleground.permission.permission.doc.BlockOptions, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
