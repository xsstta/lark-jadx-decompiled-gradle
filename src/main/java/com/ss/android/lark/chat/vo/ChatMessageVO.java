package com.ss.android.lark.chat.vo;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.larksuite.framework.utils.p1203a.C26247a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.Pin;
import com.ss.android.lark.chat.entity.message.SendStatus;
import com.ss.android.lark.chat.entity.reaction.ReactionInfo;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.export.vo.GroupType;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.ding.entity.DingStatus;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\bE\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\u0004:\u0002¶\u0001Bÿ\u0002\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00028\u0000\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!\u0012\b\u0010#\u001a\u0004\u0018\u00010$\u0012\u0006\u0010%\u001a\u00020\u000f\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010(\u001a\u00020\u000f\u0012\u0006\u0010)\u001a\u00020\u000f\u0012\u0006\u0010*\u001a\u00020\u000f\u0012\b\u0010+\u001a\u0004\u0018\u00010,\u0012\u0006\u0010-\u001a\u00020\u000f\u0012\u0006\u0010.\u001a\u00020\u0013\u0012\u0006\u0010/\u001a\u00020\u000f\u0012\u0006\u00100\u001a\u00020\u0015\u0012\u0006\u00101\u001a\u00020\u0013\u0012\u0006\u00102\u001a\u000203\u0012\u0006\u00104\u001a\u00020\u0013\u0012\u0006\u00105\u001a\u00020\u0013\u0012\b\u00106\u001a\u0004\u0018\u00010\u001f\u0012\b\u00107\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u00108\u001a\u00020\u000f\u0012\u0006\u00109\u001a\u00020\u000f\u0012\b\u0010:\u001a\u0004\u0018\u00010\u001f\u0012\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u0006\u0010<\u001a\u00020\u000f¢\u0006\u0002\u0010=J\t\u0010\u0001\u001a\u00020\u0006H\u0016J\u000f\u0010\u0001\u001a\u00028\u0000H\u0016¢\u0006\u0003\u0010\u0001J\t\u0010\u0001\u001a\u00020\u0006H\u0016J\t\u0010\u0001\u001a\u00020\u0013H\u0017J\t\u0010\u0001\u001a\u00020\u0006H\u0016J\u0007\u0010\u0001\u001a\u00020\u0006J\u000b\u0010\u0001\u001a\u0004\u0018\u00010\u0006H\u0016J\t\u0010\u0001\u001a\u00020\u0013H\u0016J\u000b\u0010 \u0001\u001a\u0004\u0018\u00010\u001fH\u0016J\u000b\u0010¡\u0001\u001a\u0004\u0018\u00010\u0006H\u0016J\t\u0010¢\u0001\u001a\u00020\u0006H\u0016J\u0018\u0010£\u0001\u001a\u00020\u000f2\r\u0010¤\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000H\u0016J\u0007\u0010¥\u0001\u001a\u00020\u000fJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010¦\u0001\u001a\u00020\u000f2\r\u0010¤\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000H\u0016J\u0007\u0010§\u0001\u001a\u00020\u000fJ\u0007\u0010¨\u0001\u001a\u00020\u000fJ\u0007\u0010©\u0001\u001a\u00020\u000fJ\u0007\u0010ª\u0001\u001a\u00020\u000fJ\u0007\u0010«\u0001\u001a\u00020\u000fJ\b\u0010-\u001a\u00020\u000fH\u0016J\t\u0010¬\u0001\u001a\u00020\u000fH\u0016J\t\u0010­\u0001\u001a\u00020\u000fH\u0016J\u0007\u0010®\u0001\u001a\u00020\u000fJ\u0007\u0010¯\u0001\u001a\u00020\u000fJ\u0012\u0010°\u0001\u001a\u00020\u000f2\u0007\u0010±\u0001\u001a\u00020\u0015H\u0016J\u0011\u0010²\u0001\u001a\u00030³\u00012\u0007\u0010´\u0001\u001a\u00020\u000fJ\u0010\u0010µ\u0001\u001a\u00030³\u00012\u0006\u0010U\u001a\u00020\u0013R\u0014\u0010\u0018\u001a\u00020\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u00101\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b@\u0010?R\u0011\u00100\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u00028\u0000X\u000e¢\u0006\u0004\n\u0002\u0010CR\u0014\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010BR\u0013\u0010+\u001a\u0004\u0018\u00010,¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u001a\u00102\u001a\u000203X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001a\u0010K\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0014\u0010\f\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u000e\u0010\u000b\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010QR\u0018\u0010U\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\b\n\u0000\u0012\u0004\bV\u0010WR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010MR\u001a\u0010/\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010M\"\u0004\bX\u0010OR\u0014\u0010\u0010\u001a\u00020\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010MR\u0011\u0010(\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010MR\u0011\u0010)\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010MR\u0011\u0010*\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010MR\u001a\u00108\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010M\"\u0004\bY\u0010OR\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010Z\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010M\"\u0004\b[\u0010OR\u001a\u00109\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010M\"\u0004\b\\\u0010OR\u000e\u0010-\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u00020\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010MR\u001a\u0010]\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010M\"\u0004\b^\u0010OR\u001a\u0010_\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010M\"\u0004\b`\u0010OR\u001a\u0010a\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010M\"\u0004\bb\u0010OR\u001a\u0010c\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010M\"\u0004\bd\u0010OR\u001a\u0010e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010M\"\u0004\bf\u0010OR\u0014\u0010\u0011\u001a\u00020\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010MR\u001c\u00106\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010S\"\u0004\bh\u0010iR\u001c\u00107\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010Q\"\u0004\bk\u0010lR\u0010\u0010'\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010#\u001a\u0004\u0018\u00010$X\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010nR\u0014\u0010\u0016\u001a\u00020\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010?R\u001a\u0010p\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010?\"\u0004\br\u0010sR\u001c\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!X\u0004¢\u0006\b\n\u0000\u001a\u0004\bt\u0010uR\u001a\u00104\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010?\"\u0004\bw\u0010sR\u000e\u0010.\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010x\u001a\u0004\u0018\u00010yX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u0010?\"\u0004\b\u0010sR&\u0010;\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u0010\u0010&\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0001\u0010\u0001R\u001c\u0010<\u001a\u00020\u000fX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010M\"\u0005\b\u0001\u0010OR\u0016\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0001\u0010\u0001R\u001d\u0010\u0001\u001a\u00020\u0013X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010?\"\u0005\b\u0001\u0010sR\"\u0010\u0001\u001a\u0005\u0018\u00010\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u0016\u0010\t\u001a\u00020\nX\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0001\u0010\u0001R\u001c\u00105\u001a\u00020\u0013X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010?\"\u0005\b\u0001\u0010s¨\u0006·\u0001"}, d2 = {"Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "T", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "Lcom/larksuite/framework/utils/diff/Diffable;", "id", "", "cId", "chatId", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "fromId", "fromAvatarKey", "fromName", "isFromMe", "", "isDeleted", "isVisible", "replyCount", "", "createTime", "", "position", "contentVO", "badgeCount", "isBadged", UpdateKey.STATUS, "Lcom/ss/android/lark/chat/entity/message/Message$Status;", "sendStatus", "Lcom/ss/android/lark/chat/entity/message/SendStatus;", "fromChatter", "Lcom/ss/android/lark/chat/vo/ChatChatterVO;", "reactionInfoList", "", "Lcom/ss/android/lark/chat/entity/reaction/ReactionInfo;", "pin", "Lcom/ss/android/lark/chat/entity/message/Pin;", "isRecalledByAdmin", "rootId", "parentId", "isDing", "isEphemeral", "isForward", "dingStatus", "Lcom/ss/android/lark/ding/entity/DingStatus;", "isReEditable", "readState", "isBurned", "burnTime", "burnLife", "displayText", "", "readCount", "unReadCount", "originalSender", "originalSenderId", "isForwardFromFriend", "isRTlDisplay", "recallChatterVO", "replyMessageVO", "showReplyDesc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/chat/entity/message/Message$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZIJILcom/ss/android/lark/chat/export/vo/ContentVO;IZLcom/ss/android/lark/chat/entity/message/Message$Status;Lcom/ss/android/lark/chat/entity/message/SendStatus;Lcom/ss/android/lark/chat/vo/ChatChatterVO;Ljava/util/List;Lcom/ss/android/lark/chat/entity/message/Pin;ZLjava/lang/String;Ljava/lang/String;ZZZLcom/ss/android/lark/ding/entity/DingStatus;ZIZJILjava/lang/CharSequence;IILcom/ss/android/lark/chat/vo/ChatChatterVO;Ljava/lang/String;ZZLcom/ss/android/lark/chat/vo/ChatChatterVO;Lcom/ss/android/lark/chat/vo/ChatMessageVO;Z)V", "getBadgeCount", "()I", "getBurnLife", "getBurnTime", "()J", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "getCreateTime", "getDingStatus", "()Lcom/ss/android/lark/ding/entity/DingStatus;", "getDisplayText", "()Ljava/lang/CharSequence;", "setDisplayText", "(Ljava/lang/CharSequence;)V", "forceUpdate", "getForceUpdate", "()Z", "setForceUpdate", "(Z)V", "getFromAvatarKey", "()Ljava/lang/String;", "getFromChatter", "()Lcom/ss/android/lark/chat/vo/ChatChatterVO;", "getFromName", "groupType", "groupType$annotations", "()V", "setBurned", "setForwardFromFriend", "isInGroup", "setInGroup", "setRTlDisplay", "isShowTime", "setShowTime", "isThreadClosed", "setThreadClosed", "isThreadDetailOnboarding", "setThreadDetailOnboarding", "isThreadDividerView", "setThreadDividerView", "isThreadMergeForwardTips", "setThreadMergeForwardTips", "getOriginalSender", "setOriginalSender", "(Lcom/ss/android/lark/chat/vo/ChatChatterVO;)V", "getOriginalSenderId", "setOriginalSenderId", "(Ljava/lang/String;)V", "getPin", "()Lcom/ss/android/lark/chat/entity/message/Pin;", "getPosition", "preGroupType", "getPreGroupType", "setPreGroupType", "(I)V", "getReactionInfoList", "()Ljava/util/List;", "getReadCount", "setReadCount", "recallerIdentity", "Lcom/ss/android/lark/chat/entity/message/Message$RecallerIdentity;", "getRecallerIdentity", "()Lcom/ss/android/lark/chat/entity/message/Message$RecallerIdentity;", "setRecallerIdentity", "(Lcom/ss/android/lark/chat/entity/message/Message$RecallerIdentity;)V", "getReplyCount", "setReplyCount", "getReplyMessageVO", "()Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "setReplyMessageVO", "(Lcom/ss/android/lark/chat/vo/ChatMessageVO;)V", "getSendStatus", "()Lcom/ss/android/lark/chat/entity/message/SendStatus;", "getShowReplyDesc", "setShowReplyDesc", "getStatus", "()Lcom/ss/android/lark/chat/entity/message/Message$Status;", "threadPosition", "getThreadPosition", "setThreadPosition", "timeLabelVO", "Lcom/ss/android/lark/chat/vo/TimeLabelVO;", "getTimeLabelVO", "()Lcom/ss/android/lark/chat/vo/TimeLabelVO;", "setTimeLabelVO", "(Lcom/ss/android/lark/chat/vo/TimeLabelVO;)V", "getType", "()Lcom/ss/android/lark/chat/entity/message/Message$Type;", "getUnReadCount", "setUnReadCount", "getChatId", "getContentVO", "()Lcom/ss/android/lark/chat/export/vo/ContentVO;", "getFromId", "getGroupType", "getId", "getMessageAggregationId", "getParentId", "getReadState", "getRecallChatterVO", "getRootId", "getcId", "isContentSame", "diffable", "isEnable", "isItemSame", "isMeRead", "isMessageActionable", "isMessageMergeForwardable", "isMessageMultiSavable", "isMessageMultiSelectable", "isRecalled", "isSecret", "isSyncable", "isThreadDetailTopic", "needBurned", "ntpTime", "setFromMe", "", "fromMe", "setGroupType", "Builder", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.e.c */
public final class ChatMessageVO<T extends ContentVO<?>> extends AbsMessageVO<T> implements AbstractC26248b<ChatMessageVO<?>> {

    /* renamed from: A */
    private final int f87638A;

    /* renamed from: B */
    private final boolean f87639B;

    /* renamed from: C */
    private final Message.Status f87640C;

    /* renamed from: D */
    private final SendStatus f87641D;

    /* renamed from: E */
    private final C33973b f87642E;

    /* renamed from: F */
    private final List<ReactionInfo> f87643F;

    /* renamed from: G */
    private final Pin f87644G;

    /* renamed from: H */
    private final boolean f87645H;

    /* renamed from: I */
    private final String f87646I;

    /* renamed from: J */
    private final String f87647J;

    /* renamed from: K */
    private final boolean f87648K;

    /* renamed from: L */
    private final boolean f87649L;

    /* renamed from: M */
    private final boolean f87650M;

    /* renamed from: N */
    private final DingStatus f87651N;

    /* renamed from: O */
    private boolean f87652O;

    /* renamed from: P */
    private int f87653P;

    /* renamed from: Q */
    private boolean f87654Q;

    /* renamed from: R */
    private final long f87655R;

    /* renamed from: S */
    private final int f87656S;

    /* renamed from: T */
    private CharSequence f87657T;

    /* renamed from: U */
    private int f87658U;

    /* renamed from: V */
    private int f87659V;

    /* renamed from: W */
    private C33973b f87660W;

    /* renamed from: X */
    private String f87661X;

    /* renamed from: Y */
    private boolean f87662Y;

    /* renamed from: Z */
    private boolean f87663Z;

    /* renamed from: a */
    private boolean f87664a;
    private C33973b aa;
    private ChatMessageVO<T> ab;
    private boolean ac;

    /* renamed from: b */
    private boolean f87665b;

    /* renamed from: c */
    private int f87666c;

    /* renamed from: d */
    private C33974e f87667d;

    /* renamed from: e */
    private int f87668e;

    /* renamed from: f */
    private boolean f87669f;

    /* renamed from: g */
    private boolean f87670g;

    /* renamed from: h */
    private boolean f87671h;

    /* renamed from: i */
    private boolean f87672i;

    /* renamed from: j */
    private boolean f87673j;

    /* renamed from: k */
    private Message.RecallerIdentity f87674k;

    /* renamed from: l */
    private int f87675l;

    /* renamed from: m */
    private final String f87676m;

    /* renamed from: n */
    private final String f87677n;

    /* renamed from: o */
    private final String f87678o;

    /* renamed from: p */
    private final Message.Type f87679p;

    /* renamed from: q */
    private final String f87680q;

    /* renamed from: r */
    private final String f87681r;

    /* renamed from: s */
    private final String f87682s;

    /* renamed from: t */
    private boolean f87683t;

    /* renamed from: u */
    private final boolean f87684u;

    /* renamed from: v */
    private final boolean f87685v;

    /* renamed from: w */
    private int f87686w;

    /* renamed from: x */
    private final long f87687x;

    /* renamed from: y */
    private final int f87688y;

    /* renamed from: z */
    private T f87689z;

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: A */
    public Message.Status mo121655A() {
        return this.f87640C;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: B */
    public SendStatus mo121656B() {
        return this.f87641D;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: C */
    public C33973b mo121657C() {
        return this.f87642E;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: D */
    public List<ReactionInfo> mo121658D() {
        return this.f87643F;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: E */
    public Pin mo121659E() {
        return this.f87644G;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: F */
    public boolean mo121660F() {
        return this.f87645H;
    }

    /* renamed from: G */
    public final boolean mo124234G() {
        return this.f87670g;
    }

    /* renamed from: H */
    public final boolean mo124235H() {
        return this.f87671h;
    }

    /* renamed from: I */
    public final boolean mo124236I() {
        return this.f87672i;
    }

    /* renamed from: J */
    public final boolean mo124237J() {
        return this.f87673j;
    }

    /* renamed from: K */
    public final Message.RecallerIdentity mo124238K() {
        return this.f87674k;
    }

    /* renamed from: L */
    public final int mo124239L() {
        return this.f87675l;
    }

    /* renamed from: S */
    public boolean mo124246S() {
        return this.f87639B;
    }

    /* renamed from: T */
    public final boolean mo124247T() {
        return this.f87648K;
    }

    /* renamed from: U */
    public final boolean mo124248U() {
        return this.f87649L;
    }

    /* renamed from: V */
    public final boolean mo124249V() {
        return this.f87650M;
    }

    /* renamed from: W */
    public final DingStatus mo124250W() {
        return this.f87651N;
    }

    /* renamed from: X */
    public final boolean mo124251X() {
        return this.f87654Q;
    }

    /* renamed from: Y */
    public final long mo124252Y() {
        return this.f87655R;
    }

    /* renamed from: Z */
    public final int mo124253Z() {
        return this.f87656S;
    }

    @Override // com.ss.android.lark.chat.export.vo.OpenMessageVO
    /* renamed from: a */
    public String mo121681a() {
        return this.f87676m;
    }

    public final CharSequence aa() {
        return this.f87657T;
    }

    public final int ab() {
        return this.f87658U;
    }

    public final int ac() {
        return this.f87659V;
    }

    public final C33973b ad() {
        return this.f87660W;
    }

    public final String ae() {
        return this.f87661X;
    }

    public final boolean af() {
        return this.f87662Y;
    }

    public final boolean ag() {
        return this.f87663Z;
    }

    public final ChatMessageVO<T> aj() {
        return this.ab;
    }

    public final boolean ak() {
        return this.ac;
    }

    @Override // com.ss.android.lark.chat.export.vo.OpenMessageVO
    /* renamed from: b */
    public String mo121692b() {
        return this.f87678o;
    }

    @Override // com.ss.android.lark.chat.export.vo.OpenMessageVO
    /* renamed from: d */
    public String mo121696d() {
        return this.f87677n;
    }

    @Override // com.ss.android.lark.chat.export.vo.OpenMessageVO
    /* renamed from: e */
    public String mo121697e() {
        return this.f87680q;
    }

    @Override // com.ss.android.lark.chat.export.vo.OpenMessageVO
    /* renamed from: g */
    public T mo121699g() {
        return this.f87689z;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: h */
    public String mo121700h() {
        return this.f87646I;
    }

    @Override // com.ss.android.lark.chat.export.vo.OpenMessageVO
    /* renamed from: i */
    public String mo121701i() {
        return this.f87647J;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: j */
    public int mo121702j() {
        return this.f87653P;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: k */
    public boolean mo121703k() {
        return this.f87652O;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: l */
    public C33973b mo121704l() {
        return this.aa;
    }

    @Override // com.ss.android.lark.chat.export.vo.OpenMessageVO
    @GroupType
    /* renamed from: m */
    public int mo121705m() {
        return this.f87666c;
    }

    /* renamed from: o */
    public final boolean mo124280o() {
        return this.f87664a;
    }

    /* renamed from: p */
    public final boolean mo124281p() {
        return this.f87665b;
    }

    /* renamed from: q */
    public final C33974e mo124282q() {
        return this.f87667d;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: r */
    public Message.Type mo121710r() {
        return this.f87679p;
    }

    /* renamed from: s */
    public final boolean mo124283s() {
        return this.f87669f;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: t */
    public String mo121712t() {
        return this.f87682s;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: u */
    public boolean mo121713u() {
        return this.f87684u;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: v */
    public boolean mo121714v() {
        return this.f87685v;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: w */
    public int mo121715w() {
        return this.f87686w;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: x */
    public long mo121716x() {
        return this.f87687x;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: y */
    public int mo121717y() {
        return this.f87688y;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: z */
    public int mo121718z() {
        return this.f87638A;
    }

    /* renamed from: N */
    public final boolean mo124241N() {
        if (this.f87653P > 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: n */
    public boolean mo121706n() {
        if (this.f87656S > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public final String mo124240M() {
        return this.f87689z.mo121898a(this);
    }

    /* renamed from: O */
    public final boolean mo124242O() {
        if (mo121698f() || this.f87654Q) {
            return false;
        }
        return true;
    }

    /* renamed from: P */
    public final boolean mo124243P() {
        if (this.f87675l >= 0 || ai()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.chat.export.vo.OpenMessageVO
    /* renamed from: c */
    public boolean mo121695c() {
        return this.f87683t;
    }

    @Override // com.ss.android.lark.chat.export.vo.OpenMessageVO
    /* renamed from: f */
    public boolean mo121698f() {
        if (mo121655A() == Message.Status.DELETED) {
            return true;
        }
        return false;
    }

    /* renamed from: R */
    public final boolean mo124245R() {
        if (ai() || mo121698f() || mo121710r() == Message.Type.SYSTEM || this.f87649L) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    public final boolean mo124244Q() {
        if (ai() || mo121698f() || mo121710r() == Message.Type.SYSTEM || mo121710r() == Message.Type.RED_PACKET || mo121710r() == Message.Type.UNKNOWN) {
            return false;
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000*\f\b\u0001\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022 \u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00000\u0003B\u0005¢\u0006\u0002\u0010\u0005J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\f\u001a\u00020\rJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0010\u001a\u00020\u000fJ\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0011\u001a\u00020\u000fJ\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u000fJ\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0013\u001a\u00020\u000fJ\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0014\u001a\u00020\u000fJ\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0015\u001a\u00020\u000fJ\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u000fJ\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001b\u001a\u00020\u001aJ\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001c\u001a\u00020\u0007J\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001d\u001a\u00020\u0007J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u0018J\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004J\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010!\u001a\u00020\u001aJ\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\"\u001a\u00020\u000fJ\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010#\u001a\u00020\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u0007X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u001e\u0010\u0005R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/lark/chat/vo/ChatMessageVO$Builder;", "T", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "Lcom/ss/android/lark/chat/vo/AbsMessageVO$Builder;", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "()V", "burnLife", "", "burnTime", "", "dingStatus", "Lcom/ss/android/lark/ding/entity/DingStatus;", "displayText", "", "isBurned", "", "isDing", "isEphemeral", "isForward", "isForwardFromFriend", "isRTLDisplay", "isReEditable", "isRecalledByAdmin", "originalSender", "Lcom/ss/android/lark/chat/vo/ChatChatterVO;", "originalSenderId", "", "parentId", "readCount", "readState", "readState$annotations", "recallChatterVO", "replyMessageVO", "rootId", "showReplyDesc", "unReadCount", "build", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.e.c$a */
    public static final class Builder<T extends ContentVO<?>> extends AbsMessageVO.Builder<T, ChatMessageVO<T>, Builder<T>> {

        /* renamed from: a */
        private String f87690a = "";

        /* renamed from: b */
        private String f87691b = "";

        /* renamed from: c */
        private boolean f87692c;

        /* renamed from: d */
        private boolean f87693d;

        /* renamed from: e */
        private boolean f87694e;

        /* renamed from: f */
        private DingStatus f87695f;

        /* renamed from: g */
        private boolean f87696g;

        /* renamed from: h */
        private long f87697h;

        /* renamed from: i */
        private int f87698i;

        /* renamed from: j */
        private CharSequence f87699j = "";

        /* renamed from: k */
        private int f87700k;

        /* renamed from: l */
        private int f87701l;

        /* renamed from: m */
        private int f87702m;

        /* renamed from: n */
        private boolean f87703n;

        /* renamed from: o */
        private C33973b f87704o;

        /* renamed from: p */
        private ChatMessageVO<T> f87705p;

        /* renamed from: q */
        private boolean f87706q;

        /* renamed from: r */
        private C33973b f87707r;

        /* renamed from: s */
        private String f87708s;

        /* renamed from: t */
        private boolean f87709t;

        /* renamed from: u */
        private boolean f87710u;

        /* renamed from: v */
        private boolean f87711v;

        /* renamed from: a */
        public ChatMessageVO<T> mo124291a() {
            String b = mo124152b();
            if (b == null) {
                Intrinsics.throwNpe();
            }
            String c = mo124153c();
            if (c == null) {
                Intrinsics.throwNpe();
            }
            Message.Type d = mo124154d();
            if (d == null) {
                Intrinsics.throwNpe();
            }
            String e = mo124157e();
            if (e == null) {
                Intrinsics.throwNpe();
            }
            String f = mo124159f();
            if (f == null) {
                Intrinsics.throwNpe();
            }
            String g = mo124161g();
            String h = mo124163h();
            boolean i = mo124165i();
            boolean j = mo124167j();
            boolean k = mo124169k();
            int l = mo124170l();
            boolean z = this.f87706q;
            long m = mo124172m();
            int n = mo124174n();
            int o = mo124175o();
            boolean p = mo124176p();
            Message.Status q = mo124177q();
            if (q == null) {
                q = Message.Status.NORMAL;
            }
            SendStatus r = mo124178r();
            C33973b s = mo124180s();
            List<ReactionInfo> t = mo124182t();
            ContentVO u = mo124184u();
            if (u == null) {
                Intrinsics.throwNpe();
            }
            Pin v = mo124186v();
            String str = this.f87690a;
            String str2 = this.f87691b;
            boolean z2 = this.f87692c;
            boolean z3 = this.f87693d;
            boolean z4 = this.f87694e;
            DingStatus dingStatus = this.f87695f;
            int i2 = this.f87702m;
            boolean z5 = this.f87696g;
            long j2 = this.f87697h;
            int i3 = this.f87698i;
            CharSequence charSequence = this.f87699j;
            int i4 = this.f87700k;
            boolean z6 = this.f87709t;
            String str3 = this.f87708s;
            C33973b bVar = this.f87707r;
            int i5 = this.f87701l;
            return new ChatMessageVO<>(b, c, e, d, f, h, g, i, j, k, l, m, n, u, o, p, q, r, s, t, v, this.f87710u, str, str2, z2, z3, z4, dingStatus, this.f87703n, i2, z5, j2, i3, charSequence, i4, i5, bVar, str3, z6, this.f87711v, this.f87704o, this.f87705p, z, null);
        }

        /* renamed from: a */
        public final Builder<T> mo124284a(int i) {
            Builder<T> aVar = this;
            aVar.f87698i = i;
            return aVar;
        }

        /* renamed from: b */
        public final Builder<T> mo124292b(int i) {
            Builder<T> aVar = this;
            aVar.f87700k = i;
            return aVar;
        }

        /* renamed from: c */
        public final Builder<T> mo124296c(int i) {
            Builder<T> aVar = this;
            aVar.f87701l = i;
            return aVar;
        }

        /* renamed from: d */
        public final Builder<T> mo124300d(int i) {
            Builder<T> aVar = this;
            aVar.f87702m = i;
            return aVar;
        }

        /* renamed from: e */
        public final Builder<T> mo124302e(boolean z) {
            Builder<T> aVar = this;
            aVar.f87703n = z;
            return aVar;
        }

        /* renamed from: f */
        public final Builder<T> mo124303f(boolean z) {
            Builder<T> aVar = this;
            aVar.f87709t = z;
            return aVar;
        }

        /* renamed from: g */
        public final Builder<T> mo124304g(boolean z) {
            Builder<T> aVar = this;
            aVar.f87710u = z;
            return aVar;
        }

        /* renamed from: h */
        public final Builder<T> mo124305h(boolean z) {
            Builder<T> aVar = this;
            aVar.f87711v = z;
            return aVar;
        }

        /* renamed from: a */
        public final Builder<T> mo124285a(long j) {
            Builder<T> aVar = this;
            aVar.f87697h = j;
            return aVar;
        }

        /* renamed from: b */
        public final Builder<T> mo124293b(C33973b bVar) {
            Builder<T> aVar = this;
            aVar.f87704o = bVar;
            return aVar;
        }

        /* renamed from: c */
        public final Builder<T> mo124297c(C33973b bVar) {
            Builder<T> aVar = this;
            aVar.f87707r = bVar;
            return aVar;
        }

        /* renamed from: d */
        public final Builder<T> mo124301d(boolean z) {
            Builder<T> aVar = this;
            aVar.f87696g = z;
            return aVar;
        }

        /* renamed from: a */
        public final Builder<T> mo124286a(ChatMessageVO<T> cVar) {
            Builder<T> aVar = this;
            aVar.f87705p = cVar;
            return aVar;
        }

        /* renamed from: b */
        public final Builder<T> mo124294b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "parentId");
            Builder<T> aVar = this;
            aVar.f87691b = str;
            return aVar;
        }

        /* renamed from: c */
        public final Builder<T> mo124298c(String str) {
            Builder<T> aVar = this;
            aVar.f87708s = str;
            return aVar;
        }

        /* renamed from: a */
        public final Builder<T> mo124287a(DingStatus dingStatus) {
            Builder<T> aVar = this;
            aVar.f87695f = dingStatus;
            return aVar;
        }

        /* renamed from: b */
        public final Builder<T> mo124295b(boolean z) {
            Builder<T> aVar = this;
            aVar.f87693d = z;
            return aVar;
        }

        /* renamed from: c */
        public final Builder<T> mo124299c(boolean z) {
            Builder<T> aVar = this;
            aVar.f87694e = z;
            return aVar;
        }

        /* renamed from: a */
        public final Builder<T> mo124288a(CharSequence charSequence) {
            Intrinsics.checkParameterIsNotNull(charSequence, "displayText");
            Builder<T> aVar = this;
            aVar.f87699j = charSequence;
            return aVar;
        }

        /* renamed from: a */
        public final Builder<T> mo124289a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "rootId");
            Builder<T> aVar = this;
            aVar.f87690a = str;
            return aVar;
        }

        /* renamed from: a */
        public final Builder<T> mo124290a(boolean z) {
            Builder<T> aVar = this;
            aVar.f87692c = z;
            return aVar;
        }
    }

    /* renamed from: c */
    public final void mo124271c(int i) {
        this.f87666c = i;
    }

    /* renamed from: f */
    public final void mo124276f(boolean z) {
        this.f87671h = z;
    }

    /* renamed from: a */
    public final void mo124254a(int i) {
        this.f87668e = i;
    }

    /* renamed from: b */
    public final void mo124268b(int i) {
        this.f87675l = i;
    }

    /* renamed from: c */
    public final void mo124272c(boolean z) {
        this.f87665b = z;
    }

    /* renamed from: d */
    public void mo124273d(int i) {
        this.f87686w = i;
    }

    /* renamed from: e */
    public final void mo124275e(boolean z) {
        this.f87670g = z;
    }

    /* renamed from: g */
    public final void mo124277g(boolean z) {
        this.f87672i = z;
    }

    /* renamed from: h */
    public final void mo124278h(boolean z) {
        this.f87673j = z;
    }

    /* renamed from: i */
    public final void mo124279i(boolean z) {
        this.ac = z;
    }

    /* renamed from: a */
    public final void mo124255a(C33974e eVar) {
        this.f87667d = eVar;
    }

    /* renamed from: b */
    public final void mo124269b(boolean z) {
        this.f87664a = z;
    }

    /* renamed from: d */
    public final void mo124274d(boolean z) {
        this.f87669f = z;
    }

    /* renamed from: a */
    public final void mo124256a(Message.RecallerIdentity recallerIdentity) {
        this.f87674k = recallerIdentity;
    }

    /* renamed from: a */
    public final void mo124257a(boolean z) {
        this.f87683t = z;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: a */
    public boolean mo121683a(long j) {
        if (!this.f87654Q) {
            long j2 = this.f87655R;
            if (1 <= j2 && j >= j2) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean isItemSame(ChatMessageVO<?> cVar) {
        return super.mo124140a((AbsMessageVO<?>) cVar);
    }

    /* renamed from: b */
    public boolean isContentSame(ChatMessageVO<?> cVar) {
        boolean z;
        boolean z2;
        if (cVar != null && super.mo124143b((AbsMessageVO<?>) cVar) && this.f87648K == cVar.f87648K && this.f87649L == cVar.f87649L && C26247a.m94983b(this.f87651N, cVar.f87651N) && this.f87652O == cVar.f87652O && this.f87653P == cVar.f87653P && this.f87654Q == cVar.f87654Q && this.f87655R == cVar.f87655R && this.f87656S == cVar.f87656S && C26247a.m94981a(this.f87657T, cVar.f87657T) && this.f87658U == cVar.f87658U && this.f87659V == cVar.f87659V && this.f87664a == cVar.f87664a && this.f87665b == cVar.f87665b && this.f87666c == cVar.f87666c && this.f87662Y == cVar.f87662Y && Intrinsics.areEqual(this.f87661X, cVar.f87661X) && C26247a.m94983b(this.f87660W, cVar.f87660W) && C26247a.m94983b(this.f87667d, cVar.f87667d) && C26247a.m94983b(this.aa, cVar.aa) && C26247a.m94983b(this.ab, cVar.ab) && this.f87670g == cVar.f87670g && (z = this.ac) == (z2 = cVar.ac) && this.f87675l == cVar.f87675l && this.f87674k == cVar.f87674k && z == z2 && this.f87663Z == cVar.f87663Z) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r24v0, resolved type: java.util.List<? extends com.ss.android.lark.chat.entity.reaction.ReactionInfo> */
    /* JADX WARN: Multi-variable type inference failed */
    private ChatMessageVO(String str, String str2, String str3, Message.Type type, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, int i, long j, int i2, T t, int i3, boolean z4, Message.Status status, SendStatus sendStatus, C33973b bVar, List<? extends ReactionInfo> list, Pin pin, boolean z5, String str7, String str8, boolean z6, boolean z7, boolean z8, DingStatus dingStatus, boolean z9, int i4, boolean z10, long j2, int i5, CharSequence charSequence, int i6, int i7, C33973b bVar2, String str9, boolean z11, boolean z12, C33973b bVar3, ChatMessageVO<T> cVar, boolean z13) {
        this.f87676m = str;
        this.f87677n = str2;
        this.f87678o = str3;
        this.f87679p = type;
        this.f87680q = str4;
        this.f87681r = str5;
        this.f87682s = str6;
        this.f87683t = z;
        this.f87684u = z2;
        this.f87685v = z3;
        this.f87686w = i;
        this.f87687x = j;
        this.f87688y = i2;
        this.f87689z = t;
        this.f87638A = i3;
        this.f87639B = z4;
        this.f87640C = status;
        this.f87641D = sendStatus;
        this.f87642E = bVar;
        this.f87643F = list;
        this.f87644G = pin;
        this.f87645H = z5;
        this.f87646I = str7;
        this.f87647J = str8;
        this.f87648K = z6;
        this.f87649L = z7;
        this.f87650M = z8;
        this.f87651N = dingStatus;
        this.f87652O = z9;
        this.f87653P = i4;
        this.f87654Q = z10;
        this.f87655R = j2;
        this.f87656S = i5;
        this.f87657T = charSequence;
        this.f87658U = i6;
        this.f87659V = i7;
        this.f87660W = bVar2;
        this.f87661X = str9;
        this.f87662Y = z11;
        this.f87663Z = z12;
        this.aa = bVar3;
        this.ab = cVar;
        this.ac = z13;
        this.f87668e = -1;
    }

    public /* synthetic */ ChatMessageVO(String str, String str2, String str3, Message.Type type, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, int i, long j, int i2, ContentVO aVar, int i3, boolean z4, Message.Status status, SendStatus sendStatus, C33973b bVar, List list, Pin pin, boolean z5, String str7, String str8, boolean z6, boolean z7, boolean z8, DingStatus dingStatus, boolean z9, int i4, boolean z10, long j2, int i5, CharSequence charSequence, int i6, int i7, C33973b bVar2, String str9, boolean z11, boolean z12, C33973b bVar3, ChatMessageVO cVar, boolean z13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, type, str4, str5, str6, z, z2, z3, i, j, i2, aVar, i3, z4, status, sendStatus, bVar, list, pin, z5, str7, str8, z6, z7, z8, dingStatus, z9, i4, z10, j2, i5, charSequence, i6, i7, bVar2, str9, z11, z12, bVar3, cVar, z13);
    }
}
