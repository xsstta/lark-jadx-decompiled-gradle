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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b$\n\u0002\u0010\u0002\n\u0002\b\u0007\b\b\u0018\u0000 Z2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001ZB¥\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\nH\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u001b\u001a\u00020\nH\u0016J\t\u0010\u001c\u001a\u00020\u0005HÂ\u0003J\t\u0010\u001d\u001a\u00020\u0010HÂ\u0003J\t\u0010\u001e\u001a\u00020\nHÂ\u0003J\t\u0010\u001f\u001a\u00020\nHÂ\u0003J\t\u0010 \u001a\u00020\nHÂ\u0003J\t\u0010!\u001a\u00020\u0010HÂ\u0003J\t\u0010\"\u001a\u00020\u0016HÂ\u0003J\t\u0010#\u001a\u00020\u0018HÂ\u0003J\t\u0010$\u001a\u00020\u0005HÂ\u0003J\t\u0010%\u001a\u00020\u0005HÂ\u0003J\t\u0010&\u001a\u00020\u0005HÂ\u0003J\t\u0010'\u001a\u00020\nHÂ\u0003J\t\u0010(\u001a\u00020\nHÂ\u0003J\t\u0010)\u001a\u00020\nHÂ\u0003J\t\u0010*\u001a\u00020\nHÂ\u0003J\t\u0010+\u001a\u00020\nHÂ\u0003J©\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018HÆ\u0001J\u0013\u0010-\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\b\u0010\r\u001a\u00020\nH\u0016J\b\u00100\u001a\u00020\u0010H\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\t\u00101\u001a\u00020\u0005HÖ\u0001J\b\u0010\f\u001a\u00020\nH\u0016J\b\u00102\u001a\u00020\nH\u0016J\b\u00103\u001a\u00020\nH\u0016J\b\u00104\u001a\u00020\nH\u0016J\b\u00105\u001a\u00020\nH\u0016J\b\u00106\u001a\u00020\nH\u0016J\b\u00107\u001a\u00020\nH\u0016J\b\u00108\u001a\u00020\nH\u0016J\b\u00109\u001a\u00020\nH\u0016J\b\u0010:\u001a\u00020\nH\u0016J\b\u0010;\u001a\u00020\nH\u0016J\b\u0010<\u001a\u00020\nH\u0016J\b\u0010=\u001a\u00020\nH\u0016J\b\u0010>\u001a\u00020\nH\u0016J\b\u0010?\u001a\u00020\nH\u0016J\b\u0010@\u001a\u00020\nH\u0016J\b\u0010A\u001a\u00020\nH\u0016J\b\u0010B\u001a\u00020\nH\u0016J\b\u0010C\u001a\u00020\nH\u0016J\b\u0010D\u001a\u00020\nH\u0016J\b\u0010E\u001a\u00020\nH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010F\u001a\u00020\nH\u0016J\b\u0010G\u001a\u00020\nH\u0016J\b\u0010H\u001a\u00020\nH\u0016J\b\u0010I\u001a\u00020\nH\u0016J\b\u0010J\u001a\u00020\nH\u0016J\b\u0010K\u001a\u00020\nH\u0016J\b\u0010L\u001a\u00020\nH\u0016J\b\u0010M\u001a\u00020\nH\u0016J\b\u0010N\u001a\u00020\nH\u0016J\b\u0010O\u001a\u00020\nH\u0016J\b\u0010P\u001a\u00020\nH\u0016J\b\u0010Q\u001a\u00020\nH\u0016J\b\u0010R\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020\nH\u0016J\u0010\u0010V\u001a\u00020T2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010W\u001a\u00020T2\u0006\u0010X\u001a\u00020\u0010H\u0016J\t\u0010Y\u001a\u00020\u0010HÖ\u0001R\u000e\u0010\u0011\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006["}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocPublicPermission;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Ljava/io/Serializable;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocPublicPermission;", "linkShareEntity", "", "commentEntity", "shareEntity", "securityEntity", "isOwner", "", "canCross", "inviteExternal", "externalAccess", "hasLinkPassword", "linkPassword", "", "anonymousVerify", "lockState", "canUnlock", "reportPublicPermJson", "constraints", "Lcom/bytedance/ee/bear/middleground/permission/permission/doc/PermissionConstraints;", "constraintsValue", "Lcom/bytedance/ee/bear/middleground/permission/permission/doc/PermissionConstraintsValue;", "(IIIIZZZZZLjava/lang/String;ZZZLjava/lang/String;Lcom/bytedance/ee/bear/middleground/permission/permission/doc/PermissionConstraints;Lcom/bytedance/ee/bear/middleground/permission/permission/doc/PermissionConstraintsValue;)V", "adminCanCross", "canUnLock", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "getReportJson", "hashCode", "isCommentConstraintsEdit", "isCommentSettingDisableByContainer", "isCommentSettingEnable", "isCommentWithEdit", "isCommentWithRead", "isExternalAccessConstraintByContainer", "isExternalAccessEnable", "isExternalAccessPermTypeSinglePage", "isLinkShareAnyoneEdit", "isLinkShareAnyoneRead", "isLinkShareClose", "isLinkShareInternalEdit", "isLinkShareInternalRead", "isLinkSharePermTypeSinglePage", "isLock", "isManagerCollaboratorAnyone", "isManagerCollaboratorTenant", "isManagerCollaboratorWithEdit", "isManagerCollaboratorWithFA", "isManagerCollaboratorWithRead", "isSecurityConstraintsEdit", "isSecurityConstraintsFa", "isSecuritySettingDisableByContainer", "isSecuritySettingEnable", "isSecurityWithEdit", "isSecurityWithFA", "isSecurityWithRead", "isShareAnyone", "isShareExternalWithEdit", "isShareExternalWithFA", "isShareExternalWithRead", "isShareInternal", "isShareOnlyMe", "setHasPassword", "", "hasPassword", "setOwner", "setPassword", "password", "toString", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DocPublicPermission extends NetService.Result<Serializable> implements IDocPublicPermission {
    public static final Companion Companion = new Companion(null);
    private boolean anonymousVerify;
    private boolean canCross;
    private boolean canUnlock;
    private int commentEntity;
    private PermissionConstraints constraints;
    private PermissionConstraintsValue constraintsValue;
    private boolean externalAccess;
    private boolean hasLinkPassword;
    private boolean inviteExternal;
    private boolean isOwner;
    private String linkPassword;
    private int linkShareEntity;
    private boolean lockState;
    private String reportPublicPermJson;
    private int securityEntity;
    private int shareEntity;

    public DocPublicPermission() {
        this(0, 0, 0, 0, false, false, false, false, false, null, false, false, false, null, null, null, 65535, null);
    }

    private final int component1() {
        return this.linkShareEntity;
    }

    private final String component10() {
        return this.linkPassword;
    }

    private final boolean component11() {
        return this.anonymousVerify;
    }

    private final boolean component12() {
        return this.lockState;
    }

    private final boolean component13() {
        return this.canUnlock;
    }

    private final String component14() {
        return this.reportPublicPermJson;
    }

    private final PermissionConstraints component15() {
        return this.constraints;
    }

    private final PermissionConstraintsValue component16() {
        return this.constraintsValue;
    }

    private final int component2() {
        return this.commentEntity;
    }

    private final int component3() {
        return this.shareEntity;
    }

    private final int component4() {
        return this.securityEntity;
    }

    private final boolean component5() {
        return this.isOwner;
    }

    private final boolean component6() {
        return this.canCross;
    }

    private final boolean component7() {
        return this.inviteExternal;
    }

    private final boolean component8() {
        return this.externalAccess;
    }

    private final boolean component9() {
        return this.hasLinkPassword;
    }

    public static /* synthetic */ DocPublicPermission copy$default(DocPublicPermission docPublicPermission, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, boolean z6, boolean z7, boolean z8, String str2, PermissionConstraints permissionConstraints, PermissionConstraintsValue permissionConstraintsValue, int i5, Object obj) {
        return docPublicPermission.copy((i5 & 1) != 0 ? docPublicPermission.linkShareEntity : i, (i5 & 2) != 0 ? docPublicPermission.commentEntity : i2, (i5 & 4) != 0 ? docPublicPermission.shareEntity : i3, (i5 & 8) != 0 ? docPublicPermission.securityEntity : i4, (i5 & 16) != 0 ? docPublicPermission.isOwner : z, (i5 & 32) != 0 ? docPublicPermission.canCross : z2, (i5 & 64) != 0 ? docPublicPermission.inviteExternal : z3, (i5 & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? docPublicPermission.externalAccess : z4, (i5 & DynamicModule.f58006b) != 0 ? docPublicPermission.hasLinkPassword : z5, (i5 & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0 ? docPublicPermission.linkPassword : str, (i5 & 1024) != 0 ? docPublicPermission.anonymousVerify : z6, (i5 & 2048) != 0 ? docPublicPermission.lockState : z7, (i5 & 4096) != 0 ? docPublicPermission.canUnlock : z8, (i5 & 8192) != 0 ? docPublicPermission.reportPublicPermJson : str2, (i5 & 16384) != 0 ? docPublicPermission.constraints : permissionConstraints, (i5 & 32768) != 0 ? docPublicPermission.constraintsValue : permissionConstraintsValue);
    }

    public final DocPublicPermission copy(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, boolean z6, boolean z7, boolean z8, String str2, PermissionConstraints permissionConstraints, PermissionConstraintsValue permissionConstraintsValue) {
        Intrinsics.checkParameterIsNotNull(str, "linkPassword");
        Intrinsics.checkParameterIsNotNull(str2, "reportPublicPermJson");
        Intrinsics.checkParameterIsNotNull(permissionConstraints, "constraints");
        Intrinsics.checkParameterIsNotNull(permissionConstraintsValue, "constraintsValue");
        return new DocPublicPermission(i, i2, i3, i4, z, z2, z3, z4, z5, str, z6, z7, z8, str2, permissionConstraints, permissionConstraintsValue);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DocPublicPermission) {
                DocPublicPermission docPublicPermission = (DocPublicPermission) obj;
                if (this.linkShareEntity == docPublicPermission.linkShareEntity) {
                    if (this.commentEntity == docPublicPermission.commentEntity) {
                        if (this.shareEntity == docPublicPermission.shareEntity) {
                            if (this.securityEntity == docPublicPermission.securityEntity) {
                                if (this.isOwner == docPublicPermission.isOwner) {
                                    if (this.canCross == docPublicPermission.canCross) {
                                        if (this.inviteExternal == docPublicPermission.inviteExternal) {
                                            if (this.externalAccess == docPublicPermission.externalAccess) {
                                                if ((this.hasLinkPassword == docPublicPermission.hasLinkPassword) && Intrinsics.areEqual(this.linkPassword, docPublicPermission.linkPassword)) {
                                                    if (this.anonymousVerify == docPublicPermission.anonymousVerify) {
                                                        if (this.lockState == docPublicPermission.lockState) {
                                                            if (!(this.canUnlock == docPublicPermission.canUnlock) || !Intrinsics.areEqual(this.reportPublicPermJson, docPublicPermission.reportPublicPermJson) || !Intrinsics.areEqual(this.constraints, docPublicPermission.constraints) || !Intrinsics.areEqual(this.constraintsValue, docPublicPermission.constraintsValue)) {
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
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = ((((((this.linkShareEntity * 31) + this.commentEntity) * 31) + this.shareEntity) * 31) + this.securityEntity) * 31;
        boolean z = this.isOwner;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (i + i3) * 31;
        boolean z2 = this.canCross;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.inviteExternal;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        boolean z4 = this.externalAccess;
        if (z4) {
            z4 = true;
        }
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = (i14 + i15) * 31;
        boolean z5 = this.hasLinkPassword;
        if (z5) {
            z5 = true;
        }
        int i19 = z5 ? 1 : 0;
        int i20 = z5 ? 1 : 0;
        int i21 = z5 ? 1 : 0;
        int i22 = (i18 + i19) * 31;
        String str = this.linkPassword;
        int i23 = 0;
        int hashCode = (i22 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z6 = this.anonymousVerify;
        if (z6) {
            z6 = true;
        }
        int i24 = z6 ? 1 : 0;
        int i25 = z6 ? 1 : 0;
        int i26 = z6 ? 1 : 0;
        int i27 = (hashCode + i24) * 31;
        boolean z7 = this.lockState;
        if (z7) {
            z7 = true;
        }
        int i28 = z7 ? 1 : 0;
        int i29 = z7 ? 1 : 0;
        int i30 = z7 ? 1 : 0;
        int i31 = (i27 + i28) * 31;
        boolean z8 = this.canUnlock;
        if (!z8) {
            i2 = z8 ? 1 : 0;
        }
        int i32 = (i31 + i2) * 31;
        String str2 = this.reportPublicPermJson;
        int hashCode2 = (i32 + (str2 != null ? str2.hashCode() : 0)) * 31;
        PermissionConstraints permissionConstraints = this.constraints;
        int hashCode3 = (hashCode2 + (permissionConstraints != null ? permissionConstraints.hashCode() : 0)) * 31;
        PermissionConstraintsValue permissionConstraintsValue = this.constraintsValue;
        if (permissionConstraintsValue != null) {
            i23 = permissionConstraintsValue.hashCode();
        }
        return hashCode3 + i23;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isExternalAccessConstraintByContainer() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isExternalAccessEnable() {
        return true;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isExternalAccessPermTypeSinglePage() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isLinkSharePermTypeSinglePage() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isManagerCollaboratorAnyone() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isManagerCollaboratorTenant() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isManagerCollaboratorWithEdit() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isManagerCollaboratorWithFA() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isManagerCollaboratorWithRead() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isShareExternalWithEdit() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isShareExternalWithFA() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isShareExternalWithRead() {
        return false;
    }

    public String toString() {
        return "DocPublicPermission(linkShareEntity=" + this.linkShareEntity + ", commentEntity=" + this.commentEntity + ", shareEntity=" + this.shareEntity + ", securityEntity=" + this.securityEntity + ", isOwner=" + this.isOwner + ", canCross=" + this.canCross + ", inviteExternal=" + this.inviteExternal + ", externalAccess=" + this.externalAccess + ", hasLinkPassword=" + this.hasLinkPassword + ", linkPassword=" + this.linkPassword + ", anonymousVerify=" + this.anonymousVerify + ", lockState=" + this.lockState + ", canUnlock=" + this.canUnlock + ", reportPublicPermJson=" + this.reportPublicPermJson + ", constraints=" + this.constraints + ", constraintsValue=" + this.constraintsValue + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocPublicPermission$Companion;", "", "()V", "COMMENT_WITH_EDIT_PERM", "", "COMMENT_WITH_READ_PERM", "LINK_SHARE_ANYONE_EDIT", "LINK_SHARE_ANYONE_READ", "LINK_SHARE_CLOSE", "LINK_SHARE_INTERNAL_EDIT", "LINK_SHARE_INTERNAL_READ", "SECURITY_WITH_EDIT", "SECURITY_WITH_FA", "SECURITY_WITH_READ", "SHARE_ANYONE", "SHARE_INTERNAL", "SHARE_ONLY_ME", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.permission.doc.DocPublicPermission$a */
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
    public boolean inviteExternal() {
        return this.inviteExternal;
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
    public int getLinkShareAnyoneEditBlockValue() {
        return IDocPublicPermission.C10162a.m42291e(this);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public int getLinkShareAnyoneReadBlockValue() {
        return IDocPublicPermission.C10162a.m42289c(this);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public int getLinkShareConstrains() {
        return IDocPublicPermission.C10162a.m42292f(this);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isCommentSettingDisableByContainer() {
        return this.constraints.isCommentSettingDisabledByContainer();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isCommentSettingEnable() {
        return this.constraints.isCommentSettingEnabled();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isCommentWithEdit() {
        if (this.commentEntity == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isCommentWithRead() {
        if (this.commentEntity == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isLinkShareAnyoneEditDisable() {
        return IDocPublicPermission.C10162a.m42290d(this);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isLinkShareAnyoneReadDisable() {
        return IDocPublicPermission.C10162a.m42288b(this);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isLinkShareClose() {
        if (this.linkShareEntity == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isLinkShareInternalRead() {
        if (this.linkShareEntity == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isSecuritySettingDisableByContainer() {
        return this.constraints.isSecuritySettingDisabledByContainer();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isSecuritySettingEnable() {
        return this.constraints.isSecuritySettingEnabled();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isSecurityWithEdit() {
        if (this.securityEntity == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isSecurityWithRead() {
        if (this.securityEntity == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isShareInternal() {
        if (this.shareEntity == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isShareOnlyMe() {
        if (this.shareEntity == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isCommentConstraintsEdit() {
        if (this.constraintsValue.getComment() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isLinkShareAnyoneEdit() {
        if (this.linkShareEntity == 4) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isLinkShareAnyoneRead() {
        if (this.linkShareEntity == 3) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isLinkShareInternalEdit() {
        if (this.linkShareEntity == 2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isSecurityConstraintsEdit() {
        if (this.constraintsValue.getSecurity() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isSecurityConstraintsFa() {
        if (this.constraintsValue.getSecurity() == 2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isSecurityWithFA() {
        if (this.securityEntity == 2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isShareAnyone() {
        if (this.shareEntity == 2) {
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

    public DocPublicPermission(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, boolean z6, boolean z7, boolean z8, String str2, PermissionConstraints permissionConstraints, PermissionConstraintsValue permissionConstraintsValue) {
        Intrinsics.checkParameterIsNotNull(str, "linkPassword");
        Intrinsics.checkParameterIsNotNull(str2, "reportPublicPermJson");
        Intrinsics.checkParameterIsNotNull(permissionConstraints, "constraints");
        Intrinsics.checkParameterIsNotNull(permissionConstraintsValue, "constraintsValue");
        this.linkShareEntity = i;
        this.commentEntity = i2;
        this.shareEntity = i3;
        this.securityEntity = i4;
        this.isOwner = z;
        this.canCross = z2;
        this.inviteExternal = z3;
        this.externalAccess = z4;
        this.hasLinkPassword = z5;
        this.linkPassword = str;
        this.anonymousVerify = z6;
        this.lockState = z7;
        this.canUnlock = z8;
        this.reportPublicPermJson = str2;
        this.constraints = permissionConstraints;
        this.constraintsValue = permissionConstraintsValue;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DocPublicPermission(int r22, int r23, int r24, int r25, boolean r26, boolean r27, boolean r28, boolean r29, boolean r30, java.lang.String r31, boolean r32, boolean r33, boolean r34, java.lang.String r35, com.bytedance.ee.bear.middleground.permission.permission.doc.PermissionConstraints r36, com.bytedance.ee.bear.middleground.permission.permission.doc.PermissionConstraintsValue r37, int r38, kotlin.jvm.internal.DefaultConstructorMarker r39) {
        /*
        // Method dump skipped, instructions count: 207
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.permission.permission.doc.DocPublicPermission.<init>(int, int, int, int, boolean, boolean, boolean, boolean, boolean, java.lang.String, boolean, boolean, boolean, java.lang.String, com.bytedance.ee.bear.middleground.permission.permission.doc.PermissionConstraints, com.bytedance.ee.bear.middleground.permission.permission.doc.PermissionConstraintsValue, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
