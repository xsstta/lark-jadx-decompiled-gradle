package com.bytedance.ee.bear.middleground.permission.permission.doc;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\bM\n\u0002\u0010\u000b\n\u0002\b0\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0001Bÿ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0004¢\u0006\u0002\u0010\u001dJ\u0006\u0010Q\u001a\u00020RJ\u0006\u0010S\u001a\u00020RJ\u0006\u0010T\u001a\u00020RJ\u0006\u0010U\u001a\u00020RJ\u0006\u0010V\u001a\u00020RJ\u0006\u0010W\u001a\u00020RJ\u0006\u0010X\u001a\u00020RJ\u0006\u0010Y\u001a\u00020RJ\u0006\u0010Z\u001a\u00020RJ\u0006\u0010[\u001a\u00020RJ\u0006\u0010\\\u001a\u00020RJ\u0006\u0010]\u001a\u00020RJ\u0006\u0010^\u001a\u00020RJ\u0006\u0010_\u001a\u00020RJ\u0006\u0010`\u001a\u00020RJ\u0006\u0010a\u001a\u00020RJ\u0006\u0010b\u001a\u00020RJ\u0006\u0010c\u001a\u00020RJ\u0006\u0010d\u001a\u00020RJ\u0006\u0010e\u001a\u00020RJ\u0006\u0010f\u001a\u00020RJ\u0006\u0010g\u001a\u00020RJ\t\u0010h\u001a\u00020\u0004HÆ\u0003J\t\u0010i\u001a\u00020\u0004HÆ\u0003J\t\u0010j\u001a\u00020\u0004HÆ\u0003J\t\u0010k\u001a\u00020\u0004HÆ\u0003J\t\u0010l\u001a\u00020\u0004HÆ\u0003J\t\u0010m\u001a\u00020\u0004HÆ\u0003J\t\u0010n\u001a\u00020\u0004HÆ\u0003J\t\u0010o\u001a\u00020\u0004HÆ\u0003J\t\u0010p\u001a\u00020\u0004HÆ\u0003J\t\u0010q\u001a\u00020\u0004HÆ\u0003J\t\u0010r\u001a\u00020\u0004HÆ\u0003J\t\u0010s\u001a\u00020\u0004HÆ\u0003J\t\u0010t\u001a\u00020\u0004HÆ\u0003J\t\u0010u\u001a\u00020\u0004HÆ\u0003J\t\u0010v\u001a\u00020\u0004HÆ\u0003J\t\u0010w\u001a\u00020\u0004HÆ\u0003J\t\u0010x\u001a\u00020\u0004HÆ\u0003J\t\u0010y\u001a\u00020\u0004HÆ\u0003J\t\u0010z\u001a\u00020\u0004HÆ\u0003J\t\u0010{\u001a\u00020\u0004HÆ\u0003J\t\u0010|\u001a\u00020\u0004HÆ\u0003J\t\u0010}\u001a\u00020\u0004HÆ\u0003J\t\u0010~\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0004HÆ\u0003J\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u0004HÆ\u0001J\u0016\u0010\u0001\u001a\u00020R2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0001\u001a\u00020\u0004HÖ\u0001J\u000b\u0010\u0001\u001a\u00030\u0001HÖ\u0001R\u001a\u0010\u0017\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0011\u0010\u001c\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\u001a\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001f\"\u0004\b&\u0010!R\u001a\u0010\u000b\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001f\"\u0004\b(\u0010!R\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!R\u001a\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001f\"\u0004\b,\u0010!R\u001a\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001f\"\u0004\b.\u0010!R\u001a\u0010\u0012\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001f\"\u0004\b0\u0010!R\u001a\u0010\u0013\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001f\"\u0004\b2\u0010!R\u001a\u0010\u0011\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001f\"\u0004\b4\u0010!R\u001a\u0010\u0015\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001f\"\u0004\b6\u0010!R\u001a\u0010\u0016\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001f\"\u0004\b8\u0010!R\u001a\u0010\u0014\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001f\"\u0004\b:\u0010!R\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001f\"\u0004\b<\u0010!R\u001a\u0010\u001a\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001f\"\u0004\b>\u0010!R\u001a\u0010\n\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001f\"\u0004\b@\u0010!R\u001a\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001f\"\u0004\bB\u0010!R\u001a\u0010\u0010\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u001f\"\u0004\bD\u0010!R\u001a\u0010\u0018\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u001f\"\u0004\bF\u0010!R\u001a\u0010\u0019\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u001f\"\u0004\bH\u0010!R\u001a\u0010\u000e\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u001f\"\u0004\bJ\u0010!R\u001a\u0010\r\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u001f\"\u0004\bL\u0010!R\u001a\u0010\u001b\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u001f\"\u0004\bN\u0010!R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u001f\"\u0004\bP\u0010!¨\u0006\u0001"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocPermissionAction;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Ljava/io/Serializable;", "view", "", "edit", Comment.f24093e, "copy", "export", "manage_collaborator", "manage_meta", "create_sub_node", "download", "operate_from_dusbin", "operate_entity", "manage_single_page_collaborator", "manage_single_page_meta", "invite_full_access", "invite_can_edit", "invite_can_view", "invite_single_page_full_access", "invite_single_page_can_edit", "invite_single_page_can_view", "be_moved", "move_from", "move_to", "manage_history_record", "print", "collect", "(IIIIIIIIIIIIIIIIIIIIIIIII)V", "getBe_moved", "()I", "setBe_moved", "(I)V", "getCollect", "getComment", "setComment", "getCopy", "setCopy", "getCreate_sub_node", "setCreate_sub_node", "getDownload", "setDownload", "getEdit", "setEdit", "getExport", "setExport", "getInvite_can_edit", "setInvite_can_edit", "getInvite_can_view", "setInvite_can_view", "getInvite_full_access", "setInvite_full_access", "getInvite_single_page_can_edit", "setInvite_single_page_can_edit", "getInvite_single_page_can_view", "setInvite_single_page_can_view", "getInvite_single_page_full_access", "setInvite_single_page_full_access", "getManage_collaborator", "setManage_collaborator", "getManage_history_record", "setManage_history_record", "getManage_meta", "setManage_meta", "getManage_single_page_collaborator", "setManage_single_page_collaborator", "getManage_single_page_meta", "setManage_single_page_meta", "getMove_from", "setMove_from", "getMove_to", "setMove_to", "getOperate_entity", "setOperate_entity", "getOperate_from_dusbin", "setOperate_from_dusbin", "getPrint", "setPrint", "getView", "setView", "canComment", "", "canCopy", "canCreate", "canDownload", "canEdit", "canExport", "canInviteEdit", "canInviteFullAccess", "canInviteSinglePageEdit", "canInviteSinglePageFullAccess", "canInviteSinglePageView", "canInviteView", "canManageContainerCollaborator", "canManageContainerPermissionMeta", "canManageSinglePageCollaborator", "canManageSinglePagePermissionMeta", "canMoveSubNode", "canMoveThisNode", "canMoveToHere", "canOperateEntity", "canUpload", "canView", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "equals", "other", "", "hashCode", "toString", "", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DocPermissionAction extends NetService.Result<Serializable> {
    public static final Companion Companion = new Companion(null);
    private int be_moved;
    private final int collect;
    private int comment;
    private int copy;
    private int create_sub_node;
    private int download;
    private int edit;
    private int export;
    private int invite_can_edit;
    private int invite_can_view;
    private int invite_full_access;
    private int invite_single_page_can_edit;
    private int invite_single_page_can_view;
    private int invite_single_page_full_access;
    private int manage_collaborator;
    private int manage_history_record;
    private int manage_meta;
    private int manage_single_page_collaborator;
    private int manage_single_page_meta;
    private int move_from;
    private int move_to;
    private int operate_entity;
    private int operate_from_dusbin;
    private int print;
    private int view;

    public DocPermissionAction() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 33554431, null);
    }

    public static /* synthetic */ DocPermissionAction copy$default(DocPermissionAction docPermissionAction, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, Object obj) {
        return docPermissionAction.copy((i26 & 1) != 0 ? docPermissionAction.view : i, (i26 & 2) != 0 ? docPermissionAction.edit : i2, (i26 & 4) != 0 ? docPermissionAction.comment : i3, (i26 & 8) != 0 ? docPermissionAction.copy : i4, (i26 & 16) != 0 ? docPermissionAction.export : i5, (i26 & 32) != 0 ? docPermissionAction.manage_collaborator : i6, (i26 & 64) != 0 ? docPermissionAction.manage_meta : i7, (i26 & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? docPermissionAction.create_sub_node : i8, (i26 & DynamicModule.f58006b) != 0 ? docPermissionAction.download : i9, (i26 & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0 ? docPermissionAction.operate_from_dusbin : i10, (i26 & 1024) != 0 ? docPermissionAction.operate_entity : i11, (i26 & 2048) != 0 ? docPermissionAction.manage_single_page_collaborator : i12, (i26 & 4096) != 0 ? docPermissionAction.manage_single_page_meta : i13, (i26 & 8192) != 0 ? docPermissionAction.invite_full_access : i14, (i26 & 16384) != 0 ? docPermissionAction.invite_can_edit : i15, (i26 & 32768) != 0 ? docPermissionAction.invite_can_view : i16, (i26 & 65536) != 0 ? docPermissionAction.invite_single_page_full_access : i17, (i26 & 131072) != 0 ? docPermissionAction.invite_single_page_can_edit : i18, (i26 & 262144) != 0 ? docPermissionAction.invite_single_page_can_view : i19, (i26 & 524288) != 0 ? docPermissionAction.be_moved : i20, (i26 & 1048576) != 0 ? docPermissionAction.move_from : i21, (i26 & 2097152) != 0 ? docPermissionAction.move_to : i22, (i26 & 4194304) != 0 ? docPermissionAction.manage_history_record : i23, (i26 & 8388608) != 0 ? docPermissionAction.print : i24, (i26 & 16777216) != 0 ? docPermissionAction.collect : i25);
    }

    public final int component1() {
        return this.view;
    }

    public final int component10() {
        return this.operate_from_dusbin;
    }

    public final int component11() {
        return this.operate_entity;
    }

    public final int component12() {
        return this.manage_single_page_collaborator;
    }

    public final int component13() {
        return this.manage_single_page_meta;
    }

    public final int component14() {
        return this.invite_full_access;
    }

    public final int component15() {
        return this.invite_can_edit;
    }

    public final int component16() {
        return this.invite_can_view;
    }

    public final int component17() {
        return this.invite_single_page_full_access;
    }

    public final int component18() {
        return this.invite_single_page_can_edit;
    }

    public final int component19() {
        return this.invite_single_page_can_view;
    }

    public final int component2() {
        return this.edit;
    }

    public final int component20() {
        return this.be_moved;
    }

    public final int component21() {
        return this.move_from;
    }

    public final int component22() {
        return this.move_to;
    }

    public final int component23() {
        return this.manage_history_record;
    }

    public final int component24() {
        return this.print;
    }

    public final int component25() {
        return this.collect;
    }

    public final int component3() {
        return this.comment;
    }

    public final int component4() {
        return this.copy;
    }

    public final int component5() {
        return this.export;
    }

    public final int component6() {
        return this.manage_collaborator;
    }

    public final int component7() {
        return this.manage_meta;
    }

    public final int component8() {
        return this.create_sub_node;
    }

    public final int component9() {
        return this.download;
    }

    public final DocPermissionAction copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25) {
        return new DocPermissionAction(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DocPermissionAction) {
                DocPermissionAction docPermissionAction = (DocPermissionAction) obj;
                if (this.view == docPermissionAction.view) {
                    if (this.edit == docPermissionAction.edit) {
                        if (this.comment == docPermissionAction.comment) {
                            if (this.copy == docPermissionAction.copy) {
                                if (this.export == docPermissionAction.export) {
                                    if (this.manage_collaborator == docPermissionAction.manage_collaborator) {
                                        if (this.manage_meta == docPermissionAction.manage_meta) {
                                            if (this.create_sub_node == docPermissionAction.create_sub_node) {
                                                if (this.download == docPermissionAction.download) {
                                                    if (this.operate_from_dusbin == docPermissionAction.operate_from_dusbin) {
                                                        if (this.operate_entity == docPermissionAction.operate_entity) {
                                                            if (this.manage_single_page_collaborator == docPermissionAction.manage_single_page_collaborator) {
                                                                if (this.manage_single_page_meta == docPermissionAction.manage_single_page_meta) {
                                                                    if (this.invite_full_access == docPermissionAction.invite_full_access) {
                                                                        if (this.invite_can_edit == docPermissionAction.invite_can_edit) {
                                                                            if (this.invite_can_view == docPermissionAction.invite_can_view) {
                                                                                if (this.invite_single_page_full_access == docPermissionAction.invite_single_page_full_access) {
                                                                                    if (this.invite_single_page_can_edit == docPermissionAction.invite_single_page_can_edit) {
                                                                                        if (this.invite_single_page_can_view == docPermissionAction.invite_single_page_can_view) {
                                                                                            if (this.be_moved == docPermissionAction.be_moved) {
                                                                                                if (this.move_from == docPermissionAction.move_from) {
                                                                                                    if (this.move_to == docPermissionAction.move_to) {
                                                                                                        if (this.manage_history_record == docPermissionAction.manage_history_record) {
                                                                                                            if (this.print == docPermissionAction.print) {
                                                                                                                if (this.collect == docPermissionAction.collect) {
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
        return (((((((((((((((((((((((((((((((((((((((((((((((this.view * 31) + this.edit) * 31) + this.comment) * 31) + this.copy) * 31) + this.export) * 31) + this.manage_collaborator) * 31) + this.manage_meta) * 31) + this.create_sub_node) * 31) + this.download) * 31) + this.operate_from_dusbin) * 31) + this.operate_entity) * 31) + this.manage_single_page_collaborator) * 31) + this.manage_single_page_meta) * 31) + this.invite_full_access) * 31) + this.invite_can_edit) * 31) + this.invite_can_view) * 31) + this.invite_single_page_full_access) * 31) + this.invite_single_page_can_edit) * 31) + this.invite_single_page_can_view) * 31) + this.be_moved) * 31) + this.move_from) * 31) + this.move_to) * 31) + this.manage_history_record) * 31) + this.print) * 31) + this.collect;
    }

    public String toString() {
        return "DocPermissionAction(view=" + this.view + ", edit=" + this.edit + ", comment=" + this.comment + ", copy=" + this.copy + ", export=" + this.export + ", manage_collaborator=" + this.manage_collaborator + ", manage_meta=" + this.manage_meta + ", create_sub_node=" + this.create_sub_node + ", download=" + this.download + ", operate_from_dusbin=" + this.operate_from_dusbin + ", operate_entity=" + this.operate_entity + ", manage_single_page_collaborator=" + this.manage_single_page_collaborator + ", manage_single_page_meta=" + this.manage_single_page_meta + ", invite_full_access=" + this.invite_full_access + ", invite_can_edit=" + this.invite_can_edit + ", invite_can_view=" + this.invite_can_view + ", invite_single_page_full_access=" + this.invite_single_page_full_access + ", invite_single_page_can_edit=" + this.invite_single_page_can_edit + ", invite_single_page_can_view=" + this.invite_single_page_can_view + ", be_moved=" + this.be_moved + ", move_from=" + this.move_from + ", move_to=" + this.move_to + ", manage_history_record=" + this.manage_history_record + ", print=" + this.print + ", collect=" + this.collect + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocPermissionAction$Companion;", "", "()V", "ACTION_ALLOW", "", "ACTION_DENY", "ACTION_NONE", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.permission.doc.DocPermissionAction$a */
    public static final class Companion {
        private Companion() {
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

    public final int getComment() {
        return this.comment;
    }

    public final int getCopy() {
        return this.copy;
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

    public final int getExport() {
        return this.export;
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

    public final int getInvite_single_page_can_edit() {
        return this.invite_single_page_can_edit;
    }

    public final int getInvite_single_page_can_view() {
        return this.invite_single_page_can_view;
    }

    public final int getInvite_single_page_full_access() {
        return this.invite_single_page_full_access;
    }

    public final int getManage_collaborator() {
        return this.manage_collaborator;
    }

    public final int getManage_history_record() {
        return this.manage_history_record;
    }

    public final int getManage_meta() {
        return this.manage_meta;
    }

    public final int getManage_single_page_collaborator() {
        return this.manage_single_page_collaborator;
    }

    public final int getManage_single_page_meta() {
        return this.manage_single_page_meta;
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

    public final int getPrint() {
        return this.print;
    }

    public final int getView() {
        return this.view;
    }

    public final boolean canComment() {
        if (this.comment == 1) {
            return true;
        }
        return false;
    }

    public final boolean canCopy() {
        if (this.copy == 1) {
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

    public final boolean canExport() {
        if (this.export == 1) {
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

    public final boolean canInviteSinglePageEdit() {
        if (this.invite_single_page_can_edit == 1) {
            return true;
        }
        return false;
    }

    public final boolean canInviteSinglePageFullAccess() {
        if (this.invite_single_page_full_access == 1) {
            return true;
        }
        return false;
    }

    public final boolean canInviteSinglePageView() {
        if (this.invite_single_page_can_view == 1) {
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

    public final boolean canManageContainerCollaborator() {
        if (this.manage_collaborator == 1) {
            return true;
        }
        return false;
    }

    public final boolean canManageContainerPermissionMeta() {
        if (this.manage_meta == 1) {
            return true;
        }
        return false;
    }

    public final boolean canManageSinglePageCollaborator() {
        if (this.manage_single_page_collaborator == 1) {
            return true;
        }
        return false;
    }

    public final boolean canManageSinglePagePermissionMeta() {
        if (this.manage_single_page_meta == 1) {
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

    public final void setComment(int i) {
        this.comment = i;
    }

    public final void setCopy(int i) {
        this.copy = i;
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

    public final void setExport(int i) {
        this.export = i;
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

    public final void setInvite_single_page_can_edit(int i) {
        this.invite_single_page_can_edit = i;
    }

    public final void setInvite_single_page_can_view(int i) {
        this.invite_single_page_can_view = i;
    }

    public final void setInvite_single_page_full_access(int i) {
        this.invite_single_page_full_access = i;
    }

    public final void setManage_collaborator(int i) {
        this.manage_collaborator = i;
    }

    public final void setManage_history_record(int i) {
        this.manage_history_record = i;
    }

    public final void setManage_meta(int i) {
        this.manage_meta = i;
    }

    public final void setManage_single_page_collaborator(int i) {
        this.manage_single_page_collaborator = i;
    }

    public final void setManage_single_page_meta(int i) {
        this.manage_single_page_meta = i;
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

    public final void setPrint(int i) {
        this.print = i;
    }

    public final void setView(int i) {
        this.view = i;
    }

    public DocPermissionAction(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25) {
        this.view = i;
        this.edit = i2;
        this.comment = i3;
        this.copy = i4;
        this.export = i5;
        this.manage_collaborator = i6;
        this.manage_meta = i7;
        this.create_sub_node = i8;
        this.download = i9;
        this.operate_from_dusbin = i10;
        this.operate_entity = i11;
        this.manage_single_page_collaborator = i12;
        this.manage_single_page_meta = i13;
        this.invite_full_access = i14;
        this.invite_can_edit = i15;
        this.invite_can_view = i16;
        this.invite_single_page_full_access = i17;
        this.invite_single_page_can_edit = i18;
        this.invite_single_page_can_view = i19;
        this.be_moved = i20;
        this.move_from = i21;
        this.move_to = i22;
        this.manage_history_record = i23;
        this.print = i24;
        this.collect = i25;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DocPermissionAction(int r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, int r41, int r42, int r43, int r44, int r45, int r46, int r47, int r48, int r49, int r50, int r51, int r52, kotlin.jvm.internal.DefaultConstructorMarker r53) {
        /*
        // Method dump skipped, instructions count: 288
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.permission.permission.doc.DocPermissionAction.<init>(int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
