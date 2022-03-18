package com.bytedance.ee.bear.middleground_permission_export.model.folder;

import com.bytedance.ee.bear.contract.NetService;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 Z2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001ZB\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004¢\u0006\u0002\u0010\u0013J\u0006\u00104\u001a\u000205J\u0006\u00106\u001a\u000205J\u0006\u00107\u001a\u000205J\u0006\u00108\u001a\u000205J\u0006\u00109\u001a\u000205J\u0006\u0010:\u001a\u000205J\u0006\u0010;\u001a\u000205J\u0006\u0010<\u001a\u000205J\u0006\u0010=\u001a\u000205J\u0006\u0010>\u001a\u000205J\u0006\u0010?\u001a\u000205J\u0006\u0010@\u001a\u000205J\u0006\u0010A\u001a\u000205J\u0006\u0010B\u001a\u000205J\u0006\u0010C\u001a\u000205J\t\u0010D\u001a\u00020\u0004HÆ\u0003J\t\u0010E\u001a\u00020\u0004HÆ\u0003J\t\u0010F\u001a\u00020\u0004HÆ\u0003J\t\u0010G\u001a\u00020\u0004HÆ\u0003J\t\u0010H\u001a\u00020\u0004HÆ\u0003J\t\u0010I\u001a\u00020\u0004HÆ\u0003J\t\u0010J\u001a\u00020\u0004HÆ\u0003J\t\u0010K\u001a\u00020\u0004HÆ\u0003J\t\u0010L\u001a\u00020\u0004HÆ\u0003J\t\u0010M\u001a\u00020\u0004HÆ\u0003J\t\u0010N\u001a\u00020\u0004HÆ\u0003J\t\u0010O\u001a\u00020\u0004HÆ\u0003J\t\u0010P\u001a\u00020\u0004HÆ\u0003J\t\u0010Q\u001a\u00020\u0004HÆ\u0003J\t\u0010R\u001a\u00020\u0004HÆ\u0003J\u0001\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0004HÆ\u0001J\u0013\u0010T\u001a\u0002052\b\u0010U\u001a\u0004\u0018\u00010VHÖ\u0003J\t\u0010W\u001a\u00020\u0004HÖ\u0001J\t\u0010X\u001a\u00020YHÖ\u0001R\u001a\u0010\u0010\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001a\u0010\u000e\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u001a\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001a\u0010\r\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0015\"\u0004\b'\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R\u001a\u0010\u0011\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R\u001a\u0010\u0012\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0015\"\u0004\b-\u0010\u0017R\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0015\"\u0004\b/\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0015\"\u0004\b1\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0015\"\u0004\b3\u0010\u0017¨\u0006["}, d2 = {"Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/PermissionAction;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Ljava/io/Serializable;", "view", "", "edit", "manage_collaborator", "manage_meta", "create_sub_node", "download", "collect", "operate_from_dusbin", "operate_entity", "invite_full_access", "invite_can_edit", "invite_can_view", "be_moved", "move_from", "move_to", "(IIIIIIIIIIIIIII)V", "getBe_moved", "()I", "setBe_moved", "(I)V", "getCollect", "setCollect", "getCreate_sub_node", "setCreate_sub_node", "getDownload", "setDownload", "getEdit", "setEdit", "getInvite_can_edit", "setInvite_can_edit", "getInvite_can_view", "setInvite_can_view", "getInvite_full_access", "setInvite_full_access", "getManage_collaborator", "setManage_collaborator", "getManage_meta", "setManage_meta", "getMove_from", "setMove_from", "getMove_to", "setMove_to", "getOperate_entity", "setOperate_entity", "getOperate_from_dusbin", "setOperate_from_dusbin", "getView", "setView", "canCollect", "", "canCreate", "canDownload", "canEdit", "canInviteEdit", "canInviteFullAccess", "canInviteView", "canManageCollaborator", "canManagePermissionMeta", "canMoveSubNode", "canMoveThisNode", "canMoveToHere", "canOperateEntity", "canUpload", "canView", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "", "Companion", "middleground-permission-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class PermissionAction extends NetService.Result<Serializable> {
    public static final Companion Companion = new Companion(null);
    private int be_moved;
    private int collect;
    private int create_sub_node;
    private int download;
    private int edit;
    private int invite_can_edit;
    private int invite_can_view;
    private int invite_full_access;
    private int manage_collaborator;
    private int manage_meta;
    private int move_from;
    private int move_to;
    private int operate_entity;
    private int operate_from_dusbin;
    private int view;

    public PermissionAction() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32767, null);
    }

    public static /* synthetic */ PermissionAction copy$default(PermissionAction permissionAction, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Object obj) {
        return permissionAction.copy((i16 & 1) != 0 ? permissionAction.view : i, (i16 & 2) != 0 ? permissionAction.edit : i2, (i16 & 4) != 0 ? permissionAction.manage_collaborator : i3, (i16 & 8) != 0 ? permissionAction.manage_meta : i4, (i16 & 16) != 0 ? permissionAction.create_sub_node : i5, (i16 & 32) != 0 ? permissionAction.download : i6, (i16 & 64) != 0 ? permissionAction.collect : i7, (i16 & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? permissionAction.operate_from_dusbin : i8, (i16 & DynamicModule.f58006b) != 0 ? permissionAction.operate_entity : i9, (i16 & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0 ? permissionAction.invite_full_access : i10, (i16 & 1024) != 0 ? permissionAction.invite_can_edit : i11, (i16 & 2048) != 0 ? permissionAction.invite_can_view : i12, (i16 & 4096) != 0 ? permissionAction.be_moved : i13, (i16 & 8192) != 0 ? permissionAction.move_from : i14, (i16 & 16384) != 0 ? permissionAction.move_to : i15);
    }

    public final int component1() {
        return this.view;
    }

    public final int component10() {
        return this.invite_full_access;
    }

    public final int component11() {
        return this.invite_can_edit;
    }

    public final int component12() {
        return this.invite_can_view;
    }

    public final int component13() {
        return this.be_moved;
    }

    public final int component14() {
        return this.move_from;
    }

    public final int component15() {
        return this.move_to;
    }

    public final int component2() {
        return this.edit;
    }

    public final int component3() {
        return this.manage_collaborator;
    }

    public final int component4() {
        return this.manage_meta;
    }

    public final int component5() {
        return this.create_sub_node;
    }

    public final int component6() {
        return this.download;
    }

    public final int component7() {
        return this.collect;
    }

    public final int component8() {
        return this.operate_from_dusbin;
    }

    public final int component9() {
        return this.operate_entity;
    }

    public final PermissionAction copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        return new PermissionAction(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PermissionAction) {
                PermissionAction permissionAction = (PermissionAction) obj;
                if (this.view == permissionAction.view) {
                    if (this.edit == permissionAction.edit) {
                        if (this.manage_collaborator == permissionAction.manage_collaborator) {
                            if (this.manage_meta == permissionAction.manage_meta) {
                                if (this.create_sub_node == permissionAction.create_sub_node) {
                                    if (this.download == permissionAction.download) {
                                        if (this.collect == permissionAction.collect) {
                                            if (this.operate_from_dusbin == permissionAction.operate_from_dusbin) {
                                                if (this.operate_entity == permissionAction.operate_entity) {
                                                    if (this.invite_full_access == permissionAction.invite_full_access) {
                                                        if (this.invite_can_edit == permissionAction.invite_can_edit) {
                                                            if (this.invite_can_view == permissionAction.invite_can_view) {
                                                                if (this.be_moved == permissionAction.be_moved) {
                                                                    if (this.move_from == permissionAction.move_from) {
                                                                        if (this.move_to == permissionAction.move_to) {
                                                                            return true;
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
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.view * 31) + this.edit) * 31) + this.manage_collaborator) * 31) + this.manage_meta) * 31) + this.create_sub_node) * 31) + this.download) * 31) + this.collect) * 31) + this.operate_from_dusbin) * 31) + this.operate_entity) * 31) + this.invite_full_access) * 31) + this.invite_can_edit) * 31) + this.invite_can_view) * 31) + this.be_moved) * 31) + this.move_from) * 31) + this.move_to;
    }

    public String toString() {
        return "PermissionAction(view=" + this.view + ", edit=" + this.edit + ", manage_collaborator=" + this.manage_collaborator + ", manage_meta=" + this.manage_meta + ", create_sub_node=" + this.create_sub_node + ", download=" + this.download + ", collect=" + this.collect + ", operate_from_dusbin=" + this.operate_from_dusbin + ", operate_entity=" + this.operate_entity + ", invite_full_access=" + this.invite_full_access + ", invite_can_edit=" + this.invite_can_edit + ", invite_can_view=" + this.invite_can_view + ", be_moved=" + this.be_moved + ", move_from=" + this.move_from + ", move_to=" + this.move_to + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/PermissionAction$Companion;", "", "()V", "ACTION_ALLOW", "", "ACTION_DENY", "ACTION_NONE", "buildOwnerPermissionAction", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/PermissionAction;", "middleground-permission-export_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground_permission_export.model.folder.PermissionAction$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final PermissionAction mo38686a() {
            PermissionAction permissionAction = new PermissionAction(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32767, null);
            permissionAction.setView(1);
            permissionAction.setEdit(1);
            permissionAction.setManage_collaborator(1);
            permissionAction.setManage_meta(1);
            permissionAction.setCreate_sub_node(1);
            permissionAction.setDownload(1);
            permissionAction.setCollect(1);
            permissionAction.setOperate_from_dusbin(1);
            permissionAction.setOperate_entity(1);
            permissionAction.setInvite_full_access(1);
            permissionAction.setInvite_can_edit(1);
            permissionAction.setInvite_can_view(1);
            permissionAction.setBe_moved(1);
            permissionAction.setMove_from(1);
            permissionAction.setMove_to(1);
            return permissionAction;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getBe_moved() {
        return this.be_moved;
    }

    public final int getCollect() {
        return this.collect;
    }

    public final int getCreate_sub_node() {
        return this.create_sub_node;
    }

    public final int getDownload() {
        return this.download;
    }

    public final int getEdit() {
        return this.edit;
    }

    public final int getInvite_can_edit() {
        return this.invite_can_edit;
    }

    public final int getInvite_can_view() {
        return this.invite_can_view;
    }

    public final int getInvite_full_access() {
        return this.invite_full_access;
    }

    public final int getManage_collaborator() {
        return this.manage_collaborator;
    }

    public final int getManage_meta() {
        return this.manage_meta;
    }

    public final int getMove_from() {
        return this.move_from;
    }

    public final int getMove_to() {
        return this.move_to;
    }

    public final int getOperate_entity() {
        return this.operate_entity;
    }

    public final int getOperate_from_dusbin() {
        return this.operate_from_dusbin;
    }

    public final int getView() {
        return this.view;
    }

    public final boolean canCollect() {
        if (this.collect == 1) {
            return true;
        }
        return false;
    }

    public final boolean canCreate() {
        if (this.create_sub_node == 1) {
            return true;
        }
        return false;
    }

    public final boolean canDownload() {
        if (this.download == 1) {
            return true;
        }
        return false;
    }

    public final boolean canEdit() {
        if (this.edit == 1) {
            return true;
        }
        return false;
    }

    public final boolean canInviteEdit() {
        if (this.invite_can_edit == 1) {
            return true;
        }
        return false;
    }

    public final boolean canInviteFullAccess() {
        if (this.invite_full_access == 1) {
            return true;
        }
        return false;
    }

    public final boolean canInviteView() {
        if (this.invite_can_view == 1) {
            return true;
        }
        return false;
    }

    public final boolean canManageCollaborator() {
        if (this.manage_collaborator == 1) {
            return true;
        }
        return false;
    }

    public final boolean canManagePermissionMeta() {
        if (this.manage_meta == 1) {
            return true;
        }
        return false;
    }

    public final boolean canMoveSubNode() {
        if (this.move_from == 1) {
            return true;
        }
        return false;
    }

    public final boolean canMoveThisNode() {
        if (this.be_moved == 1) {
            return true;
        }
        return false;
    }

    public final boolean canMoveToHere() {
        if (this.move_to == 1) {
            return true;
        }
        return false;
    }

    public final boolean canOperateEntity() {
        if (this.operate_entity == 1) {
            return true;
        }
        return false;
    }

    public final boolean canUpload() {
        if (this.create_sub_node == 1) {
            return true;
        }
        return false;
    }

    public final boolean canView() {
        if (this.view == 1) {
            return true;
        }
        return false;
    }

    public final void setBe_moved(int i) {
        this.be_moved = i;
    }

    public final void setCollect(int i) {
        this.collect = i;
    }

    public final void setCreate_sub_node(int i) {
        this.create_sub_node = i;
    }

    public final void setDownload(int i) {
        this.download = i;
    }

    public final void setEdit(int i) {
        this.edit = i;
    }

    public final void setInvite_can_edit(int i) {
        this.invite_can_edit = i;
    }

    public final void setInvite_can_view(int i) {
        this.invite_can_view = i;
    }

    public final void setInvite_full_access(int i) {
        this.invite_full_access = i;
    }

    public final void setManage_collaborator(int i) {
        this.manage_collaborator = i;
    }

    public final void setManage_meta(int i) {
        this.manage_meta = i;
    }

    public final void setMove_from(int i) {
        this.move_from = i;
    }

    public final void setMove_to(int i) {
        this.move_to = i;
    }

    public final void setOperate_entity(int i) {
        this.operate_entity = i;
    }

    public final void setOperate_from_dusbin(int i) {
        this.operate_from_dusbin = i;
    }

    public final void setView(int i) {
        this.view = i;
    }

    public PermissionAction(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.view = i;
        this.edit = i2;
        this.manage_collaborator = i3;
        this.manage_meta = i4;
        this.create_sub_node = i5;
        this.download = i6;
        this.collect = i7;
        this.operate_from_dusbin = i8;
        this.operate_entity = i9;
        this.invite_full_access = i10;
        this.invite_can_edit = i11;
        this.invite_can_view = i12;
        this.be_moved = i13;
        this.move_from = i14;
        this.move_to = i15;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PermissionAction(int r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground_permission_export.model.folder.PermissionAction.<init>(int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
