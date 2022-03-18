package com.bytedance.ee.bear.share.export;

import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.share.DefaultShareMeta;
import com.bytedance.ee.bear.share.IShareMeta;
import com.bytedance.ee.util.io.NonProguard;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\bE\u0018\u00002\u00020\u0001:\u0001xB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R.\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR.\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001a\u0010!\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR\u001a\u0010$\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001a\u0010'\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010\u001aR\u001a\u0010*\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR\u001a\u0010-\u001a\u00020.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u000204X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00105\"\u0004\b6\u00107R\u001a\u00108\u001a\u000204X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00105\"\u0004\b9\u00107R\u001a\u0010:\u001a\u000204X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u00105\"\u0004\b;\u00107R\u001a\u0010<\u001a\u000204X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u00105\"\u0004\b=\u00107R\u001a\u0010>\u001a\u000204X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00105\"\u0004\b?\u00107R\u001a\u0010@\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0018\"\u0004\bB\u0010\u001aR\u001a\u0010C\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0018\"\u0004\bE\u0010\u001aR\u001a\u0010F\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0018\"\u0004\bH\u0010\u001aR\u001a\u0010I\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u0018\"\u0004\bK\u0010\u001aR\u001a\u0010L\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0018\"\u0004\bN\u0010\u001aR\u001a\u0010O\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u0018\"\u0004\bQ\u0010\u001aR\u001a\u0010R\u001a\u000204X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u00105\"\u0004\bT\u00107R\u001a\u0010U\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001a\u0010Z\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010W\"\u0004\b\\\u0010YR\u001a\u0010]\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0018\"\u0004\b_\u0010\u001aR\u001a\u0010`\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u0018\"\u0004\bb\u0010\u001aR\u001a\u0010c\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u0018\"\u0004\be\u0010\u001aR\u001a\u0010f\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u0018\"\u0004\bh\u0010\u001aR\u001a\u0010i\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u0018\"\u0004\bk\u0010\u001aR\u001a\u0010l\u001a\u000204X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u00105\"\u0004\bn\u00107R\u001a\u0010o\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010W\"\u0004\bq\u0010YR\u001a\u0010r\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\u0018\"\u0004\bt\u0010\u001aR\u001a\u0010u\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\u0018\"\u0004\bw\u0010\u001a¨\u0006y"}, d2 = {"Lcom/bytedance/ee/bear/share/export/ShareParams;", "Lcom/bytedance/ee/util/io/NonProguard;", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "badgeShareTypes", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getBadgeShareTypes", "()Ljava/util/ArrayList;", "setBadgeShareTypes", "(Ljava/util/ArrayList;)V", "bitableShareMeta", "Lcom/bytedance/ee/bear/share/IShareMeta;", "getBitableShareMeta", "()Lcom/bytedance/ee/bear/share/IShareMeta;", "setBitableShareMeta", "(Lcom/bytedance/ee/bear/share/IShareMeta;)V", "bitableType", "", "getBitableType", "()Ljava/lang/String;", "setBitableType", "(Ljava/lang/String;)V", "createTime", "getCreateTime", "setCreateTime", "disabledShareTypes", "getDisabledShareTypes", "setDisabledShareTypes", "docContent", "getDocContent", "setDocContent", "docName", "getDocName", "setDocName", "docTopic", "getDocTopic", "setDocTopic", "feedId", "getFeedId", "setFeedId", "folderVersion", "Lcom/bytedance/ee/bear/list/dto/FolderVersion;", "getFolderVersion", "()Lcom/bytedance/ee/bear/list/dto/FolderVersion;", "setFolderVersion", "(Lcom/bytedance/ee/bear/list/dto/FolderVersion;)V", "isAtVC", "", "()Z", "setAtVC", "(Z)V", "isOwner", "setOwner", "isShareRoot", "setShareRoot", "isWiki", "setWiki", "isWikiVersionV2", "setWikiVersionV2", "mindnoteViewType", "getMindnoteViewType", "setMindnoteViewType", "module", "getModule", "setModule", "originUrl", "getOriginUrl", "setOriginUrl", "ownerName", "getOwnerName", "setOwnerName", "ownerTenantId", "getOwnerTenantId", "setOwnerTenantId", "ownerUid", "getOwnerUid", "setOwnerUid", "passwordSharingEnable", "getPasswordSharingEnable", "setPasswordSharingEnable", "shareType", "getShareType", "()I", "setShareType", "(I)V", ShareHitPoint.f121868c, "getSource", "setSource", "spaceId", "getSpaceId", "setSpaceId", "subModule", "getSubModule", "setSubModule", "subType", "getSubType", "setSubType", "tableId", "getTableId", "setTableId", "token", "getToken", "setToken", "transferOwnerEnable", "getTransferOwnerEnable", "setTransferOwnerEnable", ShareHitPoint.f121869d, "getType", "setType", "url", "getUrl", "setUrl", "viewId", "getViewId", "setViewId", "ShareParamsBuilder", "share-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ShareParams implements NonProguard {
    private final transient FragmentActivity activity;
    private ArrayList<Integer> badgeShareTypes;
    private IShareMeta bitableShareMeta = new DefaultShareMeta();
    private String bitableType = "";
    private String createTime = "";
    private ArrayList<Integer> disabledShareTypes;
    private String docContent = "";
    private String docName = "";
    private String docTopic = "";
    private String feedId = "";
    private FolderVersion folderVersion = new FolderVersion(0, 0, false, 7, null);
    private boolean isAtVC;
    private boolean isOwner;
    private boolean isShareRoot;
    private boolean isWiki;
    private boolean isWikiVersionV2;
    private String mindnoteViewType = "";
    private String module = "";
    private String originUrl = "";
    private String ownerName = "";
    private String ownerTenantId = "";
    private String ownerUid = "";
    private boolean passwordSharingEnable = true;
    private int shareType = 1;
    private int source;
    private String spaceId = "";
    private String subModule = "";
    private String subType = "";
    private String tableId = "";
    private String token = "";
    private boolean transferOwnerEnable = true;
    private int type;
    private String url = "";
    private String viewId = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b/\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\u00020\u00002\u001a\u0010R\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010R\u001a\u00020\fJ\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010R\u001a\u0004\u0018\u00010\u0012J\u0006\u0010S\u001a\u00020TJ\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010R\u001a\u0004\u0018\u00010\u0012J\"\u0010\u0018\u001a\u00020\u00002\u001a\u0010R\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nJ\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010R\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010R\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010R\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010R\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010R\u001a\u0004\u0018\u00010\u001eJ\u000e\u0010#\u001a\u00020\u00002\u0006\u0010R\u001a\u00020$J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010R\u001a\u00020$J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010R\u001a\u00020$J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010R\u001a\u00020$J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010R\u001a\u00020$J\u0010\u0010,\u001a\u00020\u00002\b\u0010R\u001a\u0004\u0018\u00010\u0012J\u0010\u0010-\u001a\u00020\u00002\b\u0010R\u001a\u0004\u0018\u00010\u0012J\u0010\u0010.\u001a\u00020\u00002\b\u0010R\u001a\u0004\u0018\u00010\u0012J\u0010\u0010/\u001a\u00020\u00002\b\u0010R\u001a\u0004\u0018\u00010\u0012J\u0010\u00102\u001a\u00020\u00002\b\u0010R\u001a\u0004\u0018\u00010\u0012J\u0010\u00105\u001a\u00020\u00002\b\u0010R\u001a\u0004\u0018\u00010\u0012J\u000e\u00106\u001a\u00020\u00002\u0006\u0010R\u001a\u00020$J\u000e\u00109\u001a\u00020\u00002\u0006\u0010R\u001a\u00020\tJ\u000e\u0010>\u001a\u00020\u00002\u0006\u0010R\u001a\u00020\tJ\u0010\u0010A\u001a\u00020\u00002\b\u0010R\u001a\u0004\u0018\u00010\u0012J\u0010\u0010D\u001a\u00020\u00002\b\u0010R\u001a\u0004\u0018\u00010\u0012J\u0010\u0010E\u001a\u00020\u00002\b\u0010R\u001a\u0004\u0018\u00010\u0012J\u0010\u0010F\u001a\u00020\u00002\b\u0010R\u001a\u0004\u0018\u00010\u0012J\u0010\u0010I\u001a\u00020\u00002\b\u0010R\u001a\u0004\u0018\u00010\u0012J\u000e\u0010J\u001a\u00020\u00002\u0006\u0010R\u001a\u00020$J\u000e\u0010M\u001a\u00020\u00002\u0006\u0010R\u001a\u00020\tJ\u0010\u0010N\u001a\u00020\u00002\b\u0010R\u001a\u0004\u0018\u00010\u0012J\u0010\u0010O\u001a\u00020\u00002\b\u0010R\u001a\u0004\u0018\u00010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u00020$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010/\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0014\"\u0004\b1\u0010\u0016R\u001a\u00102\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0014\"\u0004\b4\u0010\u0016R\u000e\u00105\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u001a\u00106\u001a\u00020$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010'\"\u0004\b8\u0010)R\u001a\u00109\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010;\"\u0004\b@\u0010=R\u001a\u0010A\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0014\"\u0004\bC\u0010\u0016R\u000e\u0010D\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010F\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0014\"\u0004\bH\u0010\u0016R\u000e\u0010I\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010J\u001a\u00020$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010'\"\u0004\bL\u0010)R\u000e\u0010M\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010O\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u0014\"\u0004\bQ\u0010\u0016¨\u0006U"}, d2 = {"Lcom/bytedance/ee/bear/share/export/ShareParams$ShareParamsBuilder;", "Lcom/bytedance/ee/util/io/NonProguard;", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "badgeShareTypes", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "bitableShareMeta", "Lcom/bytedance/ee/bear/share/IShareMeta;", "getBitableShareMeta", "()Lcom/bytedance/ee/bear/share/IShareMeta;", "setBitableShareMeta", "(Lcom/bytedance/ee/bear/share/IShareMeta;)V", "bitableType", "", "getBitableType", "()Ljava/lang/String;", "setBitableType", "(Ljava/lang/String;)V", "createTime", "disabledShareTypes", "docContent", "docName", "docTopic", "feedId", "folderVersion", "Lcom/bytedance/ee/bear/list/dto/FolderVersion;", "getFolderVersion", "()Lcom/bytedance/ee/bear/list/dto/FolderVersion;", "setFolderVersion", "(Lcom/bytedance/ee/bear/list/dto/FolderVersion;)V", "isAtVC", "", "isOwner", "isShareRoot", "()Z", "setShareRoot", "(Z)V", "isWiki", "isWikiVersionV2", "mindnoteViewType", "module", "originUrl", "ownerName", "getOwnerName", "setOwnerName", "ownerTenantId", "getOwnerTenantId", "setOwnerTenantId", "ownerUid", "passwordSharingEnable", "getPasswordSharingEnable", "setPasswordSharingEnable", "shareType", "getShareType", "()I", "setShareType", "(I)V", ShareHitPoint.f121868c, "getSource", "setSource", "spaceId", "getSpaceId", "setSpaceId", "subModule", "subType", "tableId", "getTableId", "setTableId", "token", "transferOwnerEnable", "getTransferOwnerEnable", "setTransferOwnerEnable", ShareHitPoint.f121869d, "url", "viewId", "getViewId", "setViewId", "value", "build", "Lcom/bytedance/ee/bear/share/export/ShareParams;", "share-export_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class ShareParamsBuilder implements NonProguard {
        private final FragmentActivity activity;
        private ArrayList<Integer> badgeShareTypes;
        private IShareMeta bitableShareMeta = new DefaultShareMeta();
        private String bitableType = "";
        private String createTime = "";
        private ArrayList<Integer> disabledShareTypes;
        private String docContent = "";
        private String docName = "";
        private String docTopic = "";
        private String feedId = "";
        private FolderVersion folderVersion = new FolderVersion(0, 0, false, 7, null);
        private boolean isAtVC;
        private boolean isOwner;
        private boolean isShareRoot;
        private boolean isWiki;
        private boolean isWikiVersionV2;
        private String mindnoteViewType = "";
        private String module = "";
        private String originUrl = "";
        private String ownerName = "";
        private String ownerTenantId = "";
        private String ownerUid = "";
        private boolean passwordSharingEnable = true;
        private int shareType = 1;
        private int source;
        private String spaceId = "";
        private String subModule = "";
        private String subType = "";
        private String tableId = "";
        private String token = "";
        private boolean transferOwnerEnable = true;
        private int type;
        private String url = "";
        private String viewId = "";

        public final FragmentActivity getActivity() {
            return this.activity;
        }

        public final IShareMeta getBitableShareMeta() {
            return this.bitableShareMeta;
        }

        public final String getBitableType() {
            return this.bitableType;
        }

        public final FolderVersion getFolderVersion() {
            return this.folderVersion;
        }

        public final String getOwnerName() {
            return this.ownerName;
        }

        public final String getOwnerTenantId() {
            return this.ownerTenantId;
        }

        public final boolean getPasswordSharingEnable() {
            return this.passwordSharingEnable;
        }

        public final int getShareType() {
            return this.shareType;
        }

        public final int getSource() {
            return this.source;
        }

        public final String getSpaceId() {
            return this.spaceId;
        }

        public final String getTableId() {
            return this.tableId;
        }

        public final boolean getTransferOwnerEnable() {
            return this.transferOwnerEnable;
        }

        public final String getViewId() {
            return this.viewId;
        }

        public final boolean isShareRoot() {
            return this.isShareRoot;
        }

        public final ShareParams build() {
            boolean z;
            ShareParams shareParams = new ShareParams(this.activity);
            shareParams.setToken(this.token);
            shareParams.setType(this.type);
            shareParams.setOwner(this.isOwner);
            shareParams.setUrl(this.url);
            shareParams.setDocName(this.docName);
            shareParams.setModule(this.module);
            shareParams.setWiki(this.isWiki);
            shareParams.setOriginUrl(this.originUrl);
            shareParams.setCreateTime(this.createTime);
            shareParams.setOwnerUid(this.ownerUid);
            shareParams.setSubModule(this.subModule);
            shareParams.setDocContent(this.docContent);
            shareParams.setDocTopic(this.docTopic);
            shareParams.setMindnoteViewType(this.mindnoteViewType);
            shareParams.setSubType(this.subType);
            shareParams.setFeedId(this.feedId);
            shareParams.setAtVC(this.isAtVC);
            shareParams.setDisabledShareTypes(this.disabledShareTypes);
            shareParams.setBadgeShareTypes(this.badgeShareTypes);
            shareParams.setPasswordSharingEnable(this.passwordSharingEnable);
            shareParams.setTransferOwnerEnable(this.transferOwnerEnable);
            shareParams.setOwnerName(this.ownerName);
            shareParams.setSpaceId(this.spaceId);
            shareParams.setShareRoot(this.isShareRoot);
            shareParams.setOwnerTenantId(this.ownerTenantId);
            shareParams.setFolderVersion(this.folderVersion);
            shareParams.setSource(this.source);
            shareParams.setTableId(this.tableId);
            shareParams.setViewId(this.viewId);
            shareParams.setBitableType(this.bitableType);
            shareParams.setShareType(this.shareType);
            shareParams.setBitableShareMeta(this.bitableShareMeta);
            shareParams.setWikiVersionV2(this.isWikiVersionV2);
            if (this.originUrl.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.originUrl = this.url;
            }
            return shareParams;
        }

        public final void setPasswordSharingEnable(boolean z) {
            this.passwordSharingEnable = z;
        }

        public final void setShareRoot(boolean z) {
            this.isShareRoot = z;
        }

        public final void setShareType(int i) {
            this.shareType = i;
        }

        public final void setSource(int i) {
            this.source = i;
        }

        public final void setTransferOwnerEnable(boolean z) {
            this.transferOwnerEnable = z;
        }

        public final ShareParamsBuilder badgeShareTypes(ArrayList<Integer> arrayList) {
            ShareParamsBuilder shareParamsBuilder = this;
            shareParamsBuilder.badgeShareTypes = arrayList;
            return shareParamsBuilder;
        }

        public final ShareParamsBuilder disabledShareTypes(ArrayList<Integer> arrayList) {
            ShareParamsBuilder shareParamsBuilder = this;
            shareParamsBuilder.disabledShareTypes = arrayList;
            return shareParamsBuilder;
        }

        public final ShareParamsBuilder isAtVC(boolean z) {
            ShareParamsBuilder shareParamsBuilder = this;
            shareParamsBuilder.isAtVC = z;
            return shareParamsBuilder;
        }

        public final ShareParamsBuilder isOwner(boolean z) {
            ShareParamsBuilder shareParamsBuilder = this;
            shareParamsBuilder.isOwner = z;
            return shareParamsBuilder;
        }

        public final ShareParamsBuilder isShareRoot(boolean z) {
            ShareParamsBuilder shareParamsBuilder = this;
            shareParamsBuilder.isShareRoot = z;
            return shareParamsBuilder;
        }

        public final ShareParamsBuilder isWiki(boolean z) {
            ShareParamsBuilder shareParamsBuilder = this;
            shareParamsBuilder.isWiki = z;
            return shareParamsBuilder;
        }

        public final ShareParamsBuilder isWikiVersionV2(boolean z) {
            ShareParamsBuilder shareParamsBuilder = this;
            shareParamsBuilder.isWikiVersionV2 = z;
            return shareParamsBuilder;
        }

        public final ShareParamsBuilder passwordSharingEnable(boolean z) {
            ShareParamsBuilder shareParamsBuilder = this;
            shareParamsBuilder.passwordSharingEnable = z;
            return shareParamsBuilder;
        }

        public final void setBitableShareMeta(IShareMeta iShareMeta) {
            Intrinsics.checkParameterIsNotNull(iShareMeta, "<set-?>");
            this.bitableShareMeta = iShareMeta;
        }

        public final void setBitableType(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.bitableType = str;
        }

        public final void setFolderVersion(FolderVersion folderVersion2) {
            Intrinsics.checkParameterIsNotNull(folderVersion2, "<set-?>");
            this.folderVersion = folderVersion2;
        }

        public final void setOwnerName(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.ownerName = str;
        }

        public final void setOwnerTenantId(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.ownerTenantId = str;
        }

        public final void setSpaceId(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.spaceId = str;
        }

        public final void setTableId(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.tableId = str;
        }

        public final void setViewId(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.viewId = str;
        }

        public final ShareParamsBuilder shareType(int i) {
            ShareParamsBuilder shareParamsBuilder = this;
            shareParamsBuilder.shareType = i;
            return shareParamsBuilder;
        }

        public final ShareParamsBuilder source(int i) {
            ShareParamsBuilder shareParamsBuilder = this;
            shareParamsBuilder.source = i;
            return shareParamsBuilder;
        }

        public final ShareParamsBuilder transferOwnerEnable(boolean z) {
            ShareParamsBuilder shareParamsBuilder = this;
            shareParamsBuilder.transferOwnerEnable = z;
            return shareParamsBuilder;
        }

        public final ShareParamsBuilder type(int i) {
            ShareParamsBuilder shareParamsBuilder = this;
            shareParamsBuilder.type = i;
            return shareParamsBuilder;
        }

        public final ShareParamsBuilder bitableShareMeta(IShareMeta iShareMeta) {
            Intrinsics.checkParameterIsNotNull(iShareMeta, "value");
            ShareParamsBuilder shareParamsBuilder = this;
            shareParamsBuilder.bitableShareMeta = iShareMeta;
            return shareParamsBuilder;
        }

        public final ShareParamsBuilder bitableType(String str) {
            ShareParamsBuilder shareParamsBuilder = this;
            if (str == null) {
                str = "";
            }
            shareParamsBuilder.bitableType = str;
            return shareParamsBuilder;
        }

        public final ShareParamsBuilder createTime(String str) {
            ShareParamsBuilder shareParamsBuilder = this;
            if (str == null) {
                str = "";
            }
            shareParamsBuilder.createTime = str;
            return shareParamsBuilder;
        }

        public final ShareParamsBuilder docContent(String str) {
            ShareParamsBuilder shareParamsBuilder = this;
            if (str == null) {
                str = "";
            }
            shareParamsBuilder.docContent = str;
            return shareParamsBuilder;
        }

        public final ShareParamsBuilder docName(String str) {
            ShareParamsBuilder shareParamsBuilder = this;
            if (str == null) {
                str = "";
            }
            shareParamsBuilder.docName = str;
            return shareParamsBuilder;
        }

        public final ShareParamsBuilder docTopic(String str) {
            ShareParamsBuilder shareParamsBuilder = this;
            if (str == null) {
                str = "";
            }
            shareParamsBuilder.docTopic = str;
            return shareParamsBuilder;
        }

        public final ShareParamsBuilder feedId(String str) {
            ShareParamsBuilder shareParamsBuilder = this;
            if (str == null) {
                str = "";
            }
            shareParamsBuilder.feedId = str;
            return shareParamsBuilder;
        }

        public final ShareParamsBuilder mindnoteViewType(String str) {
            ShareParamsBuilder shareParamsBuilder = this;
            if (str == null) {
                str = "";
            }
            shareParamsBuilder.mindnoteViewType = str;
            return shareParamsBuilder;
        }

        public final ShareParamsBuilder module(String str) {
            ShareParamsBuilder shareParamsBuilder = this;
            if (str == null) {
                str = "";
            }
            shareParamsBuilder.module = str;
            return shareParamsBuilder;
        }

        public final ShareParamsBuilder originUrl(String str) {
            ShareParamsBuilder shareParamsBuilder = this;
            if (str == null) {
                str = "";
            }
            shareParamsBuilder.originUrl = str;
            return shareParamsBuilder;
        }

        public final ShareParamsBuilder ownerName(String str) {
            ShareParamsBuilder shareParamsBuilder = this;
            if (str == null) {
                str = "";
            }
            shareParamsBuilder.ownerName = str;
            return shareParamsBuilder;
        }

        public final ShareParamsBuilder ownerTenantId(String str) {
            ShareParamsBuilder shareParamsBuilder = this;
            if (str == null) {
                str = "";
            }
            shareParamsBuilder.ownerTenantId = str;
            return shareParamsBuilder;
        }

        public final ShareParamsBuilder ownerUid(String str) {
            ShareParamsBuilder shareParamsBuilder = this;
            if (str == null) {
                str = "";
            }
            shareParamsBuilder.ownerUid = str;
            return shareParamsBuilder;
        }

        public final ShareParamsBuilder spaceId(String str) {
            ShareParamsBuilder shareParamsBuilder = this;
            if (str == null) {
                str = "";
            }
            shareParamsBuilder.spaceId = str;
            return shareParamsBuilder;
        }

        public final ShareParamsBuilder subModule(String str) {
            ShareParamsBuilder shareParamsBuilder = this;
            if (str == null) {
                str = "";
            }
            shareParamsBuilder.subModule = str;
            return shareParamsBuilder;
        }

        public final ShareParamsBuilder subType(String str) {
            ShareParamsBuilder shareParamsBuilder = this;
            if (str == null) {
                str = "";
            }
            shareParamsBuilder.subType = str;
            return shareParamsBuilder;
        }

        public final ShareParamsBuilder tableId(String str) {
            ShareParamsBuilder shareParamsBuilder = this;
            if (str == null) {
                str = "";
            }
            shareParamsBuilder.tableId = str;
            return shareParamsBuilder;
        }

        public final ShareParamsBuilder token(String str) {
            ShareParamsBuilder shareParamsBuilder = this;
            if (str == null) {
                str = "";
            }
            shareParamsBuilder.token = str;
            return shareParamsBuilder;
        }

        public final ShareParamsBuilder url(String str) {
            ShareParamsBuilder shareParamsBuilder = this;
            if (str == null) {
                str = "";
            }
            shareParamsBuilder.url = str;
            return shareParamsBuilder;
        }

        public final ShareParamsBuilder viewId(String str) {
            ShareParamsBuilder shareParamsBuilder = this;
            if (str == null) {
                str = "";
            }
            shareParamsBuilder.viewId = str;
            return shareParamsBuilder;
        }

        public final ShareParamsBuilder folderVersion(FolderVersion folderVersion2) {
            ShareParamsBuilder shareParamsBuilder = this;
            if (folderVersion2 == null) {
                folderVersion2 = new FolderVersion(0, 0, false, 7, null);
            }
            shareParamsBuilder.folderVersion = folderVersion2;
            return shareParamsBuilder;
        }

        public ShareParamsBuilder(FragmentActivity fragmentActivity) {
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
            this.activity = fragmentActivity;
        }
    }

    public final FragmentActivity getActivity() {
        return this.activity;
    }

    public final ArrayList<Integer> getBadgeShareTypes() {
        return this.badgeShareTypes;
    }

    public final IShareMeta getBitableShareMeta() {
        return this.bitableShareMeta;
    }

    public final String getBitableType() {
        return this.bitableType;
    }

    public final String getCreateTime() {
        return this.createTime;
    }

    public final ArrayList<Integer> getDisabledShareTypes() {
        return this.disabledShareTypes;
    }

    public final String getDocContent() {
        return this.docContent;
    }

    public final String getDocName() {
        return this.docName;
    }

    public final String getDocTopic() {
        return this.docTopic;
    }

    public final String getFeedId() {
        return this.feedId;
    }

    public final FolderVersion getFolderVersion() {
        return this.folderVersion;
    }

    public final String getMindnoteViewType() {
        return this.mindnoteViewType;
    }

    public final String getModule() {
        return this.module;
    }

    public final String getOriginUrl() {
        return this.originUrl;
    }

    public final String getOwnerName() {
        return this.ownerName;
    }

    public final String getOwnerTenantId() {
        return this.ownerTenantId;
    }

    public final String getOwnerUid() {
        return this.ownerUid;
    }

    public final boolean getPasswordSharingEnable() {
        return this.passwordSharingEnable;
    }

    public final int getShareType() {
        return this.shareType;
    }

    public final int getSource() {
        return this.source;
    }

    public final String getSpaceId() {
        return this.spaceId;
    }

    public final String getSubModule() {
        return this.subModule;
    }

    public final String getSubType() {
        return this.subType;
    }

    public final String getTableId() {
        return this.tableId;
    }

    public final String getToken() {
        return this.token;
    }

    public final boolean getTransferOwnerEnable() {
        return this.transferOwnerEnable;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getViewId() {
        return this.viewId;
    }

    public final boolean isAtVC() {
        return this.isAtVC;
    }

    public final boolean isOwner() {
        return this.isOwner;
    }

    public final boolean isShareRoot() {
        return this.isShareRoot;
    }

    public final boolean isWiki() {
        return this.isWiki;
    }

    public final boolean isWikiVersionV2() {
        return this.isWikiVersionV2;
    }

    public final void setAtVC(boolean z) {
        this.isAtVC = z;
    }

    public final void setBadgeShareTypes(ArrayList<Integer> arrayList) {
        this.badgeShareTypes = arrayList;
    }

    public final void setDisabledShareTypes(ArrayList<Integer> arrayList) {
        this.disabledShareTypes = arrayList;
    }

    public final void setOwner(boolean z) {
        this.isOwner = z;
    }

    public final void setPasswordSharingEnable(boolean z) {
        this.passwordSharingEnable = z;
    }

    public final void setShareRoot(boolean z) {
        this.isShareRoot = z;
    }

    public final void setShareType(int i) {
        this.shareType = i;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    public final void setTransferOwnerEnable(boolean z) {
        this.transferOwnerEnable = z;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setWiki(boolean z) {
        this.isWiki = z;
    }

    public final void setWikiVersionV2(boolean z) {
        this.isWikiVersionV2 = z;
    }

    public final void setBitableShareMeta(IShareMeta iShareMeta) {
        Intrinsics.checkParameterIsNotNull(iShareMeta, "<set-?>");
        this.bitableShareMeta = iShareMeta;
    }

    public final void setBitableType(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.bitableType = str;
    }

    public final void setCreateTime(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.createTime = str;
    }

    public final void setDocContent(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.docContent = str;
    }

    public final void setDocName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.docName = str;
    }

    public final void setDocTopic(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.docTopic = str;
    }

    public final void setFeedId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.feedId = str;
    }

    public final void setFolderVersion(FolderVersion folderVersion2) {
        Intrinsics.checkParameterIsNotNull(folderVersion2, "<set-?>");
        this.folderVersion = folderVersion2;
    }

    public final void setMindnoteViewType(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.mindnoteViewType = str;
    }

    public final void setModule(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.module = str;
    }

    public final void setOriginUrl(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.originUrl = str;
    }

    public final void setOwnerName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.ownerName = str;
    }

    public final void setOwnerTenantId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.ownerTenantId = str;
    }

    public final void setOwnerUid(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.ownerUid = str;
    }

    public final void setSpaceId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.spaceId = str;
    }

    public final void setSubModule(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.subModule = str;
    }

    public final void setSubType(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.subType = str;
    }

    public final void setTableId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.tableId = str;
    }

    public final void setToken(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.token = str;
    }

    public final void setUrl(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.url = str;
    }

    public final void setViewId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.viewId = str;
    }

    public ShareParams(FragmentActivity fragmentActivity) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        this.activity = fragmentActivity;
    }
}
