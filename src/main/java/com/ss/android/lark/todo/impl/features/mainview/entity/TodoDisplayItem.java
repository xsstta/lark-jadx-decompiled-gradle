package com.ss.android.lark.todo.impl.features.mainview.entity;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.RichContent;
import com.bytedance.lark.pb.todo.v1.CustomComplete;
import com.bytedance.lark.pb.todo.v1.TodoAssignee;
import com.bytedance.lark.pb.todo.v1.TodoSource;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000w\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0003\b\u0001\b\b\u0018\u00002\u00020\u0001:\u0006¸\u0001¹\u0001º\u0001B×\u0002\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\t\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\t\u0012\b\b\u0002\u0010 \u001a\u00020!\u0012\b\b\u0002\u0010\"\u001a\u00020#\u0012\b\b\u0002\u0010$\u001a\u00020\t\u0012\b\b\u0002\u0010%\u001a\u00020\u0003\u0012\b\b\u0002\u0010&\u001a\u00020\r\u0012\b\b\u0002\u0010'\u001a\u00020\r\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010*\u001a\u00020\t\u0012\b\b\u0002\u0010+\u001a\u00020\t\u0012\b\b\u0002\u0010,\u001a\u00020\t\u0012\b\b\u0002\u0010-\u001a\u00020\t\u0012\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/\u0012\b\b\u0002\u00101\u001a\u00020\t¢\u0006\u0002\u00102J\n\u0010\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0001\u001a\u00020\rHÆ\u0003J\n\u0010\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010\u0001\u001a\u00020\u0015HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\n\u0010\u0001\u001a\u00020\tHÆ\u0003J\n\u0010\u0001\u001a\u00020\tHÆ\u0003J\n\u0010\u0001\u001a\u00020\u001bHÆ\u0003J\n\u0010\u0001\u001a\u00020\tHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\n\u0010\u0001\u001a\u00020\tHÆ\u0003J\n\u0010\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0001\u001a\u00020!HÆ\u0003J\n\u0010 \u0001\u001a\u00020#HÆ\u0003J\n\u0010¡\u0001\u001a\u00020\tHÆ\u0003J\n\u0010¢\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010£\u0001\u001a\u00020\rHÆ\u0003J\n\u0010¤\u0001\u001a\u00020\rHÆ\u0003J\f\u0010¥\u0001\u001a\u0004\u0018\u00010)HÆ\u0003J\n\u0010¦\u0001\u001a\u00020\tHÆ\u0003J\n\u0010§\u0001\u001a\u00020\tHÆ\u0003J\n\u0010¨\u0001\u001a\u00020\tHÆ\u0003J\f\u0010©\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\n\u0010ª\u0001\u001a\u00020\tHÆ\u0003J\u0012\u0010«\u0001\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/HÆ\u0003J\n\u0010¬\u0001\u001a\u00020\tHÆ\u0003J\n\u0010­\u0001\u001a\u00020\tHÆ\u0003J\n\u0010®\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010¯\u0001\u001a\u00020\rHÆ\u0003J\n\u0010°\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010±\u0001\u001a\u00020\tHÆ\u0003J\n\u0010²\u0001\u001a\u00020\u0003HÆ\u0003JÚ\u0002\u0010³\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\t2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\r2\b\b\u0002\u0010'\u001a\u00020\r2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\b\b\u0002\u0010*\u001a\u00020\t2\b\b\u0002\u0010+\u001a\u00020\t2\b\b\u0002\u0010,\u001a\u00020\t2\b\b\u0002\u0010-\u001a\u00020\t2\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/2\b\b\u0002\u00101\u001a\u00020\tHÆ\u0001J\u0015\u0010´\u0001\u001a\u00020\t2\t\u0010µ\u0001\u001a\u0004\u0018\u00010\u0001H\u0002J\n\u0010¶\u0001\u001a\u00020\rHÖ\u0001J\n\u0010·\u0001\u001a\u00020\u0003HÖ\u0001R\"\u0010.\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001a\u0010\"\u001a\u00020#X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001a\u0010\u0013\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010T\"\u0004\bX\u0010VR\u001a\u0010\u0012\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u00108\"\u0004\bZ\u0010:R\u001a\u0010\u0011\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0011\u0010_\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b`\u0010\\R\u0011\u0010a\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bb\u00108R\u0011\u0010c\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bd\u00108R\u0011\u0010e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bf\u00108R\u0011\u0010g\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bh\u00108R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010\\\"\u0004\bj\u0010^R\u001a\u0010\u0010\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010k\"\u0004\bl\u0010mR\u000e\u0010n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010k\"\u0004\bo\u0010mR\u001a\u0010\u0019\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010k\"\u0004\bp\u0010mR\u001a\u0010\u001c\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010k\"\u0004\bq\u0010mR\u000e\u0010r\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010k\"\u0004\bs\u0010mR\u001a\u0010+\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010k\"\u0004\bt\u0010mR\u001a\u0010\u0018\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010k\"\u0004\bu\u0010mR\u001a\u0010,\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010k\"\u0004\bv\u0010mR\u001a\u0010*\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010k\"\u0004\bw\u0010mR\u0011\u0010x\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bx\u0010kR\u001a\u0010\u001f\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010k\"\u0004\by\u0010mR\u001a\u0010$\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010k\"\u0004\bz\u0010mR\u001a\u00101\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010k\"\u0004\b|\u0010mR\u001a\u0010&\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u00108\"\u0004\b~\u0010:R\u001b\u0010'\u001a\u00020\rX\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u00108\"\u0005\b\u0001\u0010:R \u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001c\u0010%\u001a\u00020\u0003X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010\\\"\u0005\b\u0001\u0010^R\u001e\u0010 \u001a\u00020!X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R \u0010(\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001¨\u0006»\u0001"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem;", "", "guid", "", "titleRichText", "Lcom/ss/android/lark/widget/richtext/RichText;", "titleRichContent", "Lcom/bytedance/lark/pb/basic/v1/RichContent;", "isCompleted", "", "attendeeStr", "", "attendeeCount", "", "endMilliTime", "", "isAllDay", "endTimeStr", "endTimeColor", "createMilliTime", "completeType", "Lcom/ss/android/lark/todo/impl/features/common/helper/MultiCompleteHelper$MultiCompleteType;", "completeAction", "Lcom/bytedance/lark/pb/todo/v1/CustomComplete$Action;", "isFollowerCheckable", "isCountBadge", "changeStatus", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem$ChangeStatus;", "isDeletable", "chatItem", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoChatItem;", "isTitle", "titleType", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem$TitleType;", "chatListTitleType", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem$ChatListTitleType;", "isTitleExpand", "titleStr", "titleCount", "titleRedCount", "todoSource", "Lcom/bytedance/lark/pb/todo/v1/TodoSource;", "isLastItem", "isFirstItem", "isLastInSection", "isFirstInSection", "assignees", "", "Lcom/bytedance/lark/pb/todo/v1/TodoAssignee;", "timeNewLine", "(Ljava/lang/String;Lcom/ss/android/lark/widget/richtext/RichText;Lcom/bytedance/lark/pb/basic/v1/RichContent;ZLjava/lang/CharSequence;IJZLjava/lang/String;IJLcom/ss/android/lark/todo/impl/features/common/helper/MultiCompleteHelper$MultiCompleteType;Lcom/bytedance/lark/pb/todo/v1/CustomComplete$Action;ZZLcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem$ChangeStatus;ZLcom/ss/android/lark/todo/impl/features/mainview/entity/TodoChatItem;ZLcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem$TitleType;Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem$ChatListTitleType;ZLjava/lang/String;IILcom/bytedance/lark/pb/todo/v1/TodoSource;ZZZZLjava/util/List;Z)V", "getAssignees", "()Ljava/util/List;", "setAssignees", "(Ljava/util/List;)V", "getAttendeeCount", "()I", "setAttendeeCount", "(I)V", "getAttendeeStr", "()Ljava/lang/CharSequence;", "setAttendeeStr", "(Ljava/lang/CharSequence;)V", "getChangeStatus", "()Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem$ChangeStatus;", "setChangeStatus", "(Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem$ChangeStatus;)V", "getChatItem", "()Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoChatItem;", "setChatItem", "(Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoChatItem;)V", "getChatListTitleType", "()Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem$ChatListTitleType;", "setChatListTitleType", "(Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem$ChatListTitleType;)V", "getCompleteAction", "()Lcom/bytedance/lark/pb/todo/v1/CustomComplete$Action;", "setCompleteAction", "(Lcom/bytedance/lark/pb/todo/v1/CustomComplete$Action;)V", "getCompleteType", "()Lcom/ss/android/lark/todo/impl/features/common/helper/MultiCompleteHelper$MultiCompleteType;", "setCompleteType", "(Lcom/ss/android/lark/todo/impl/features/common/helper/MultiCompleteHelper$MultiCompleteType;)V", "getCreateMilliTime", "()J", "setCreateMilliTime", "(J)V", "getEndMilliTime", "setEndMilliTime", "getEndTimeColor", "setEndTimeColor", "getEndTimeStr", "()Ljava/lang/String;", "setEndTimeStr", "(Ljava/lang/String;)V", "getAttendeeCountStr", "getGetAttendeeCountStr", "getAttendeeCountVisibility", "getGetAttendeeCountVisibility", "getAttendeeVisibility", "getGetAttendeeVisibility", "getEndTimeVisibility", "getGetEndTimeVisibility", "getFinishLineVisibility", "getGetFinishLineVisibility", "getGuid", "setGuid", "()Z", "setAllDay", "(Z)V", "isAttendeeShow", "setCompleted", "setCountBadge", "setDeletable", "isEndTimeShow", "setFirstInSection", "setFirstItem", "setFollowerCheckable", "setLastInSection", "setLastItem", "isShowSingeLine", "setTitle", "setTitleExpand", "getTimeNewLine", "setTimeNewLine", "getTitleCount", "setTitleCount", "getTitleRedCount", "setTitleRedCount", "getTitleRichContent", "()Lcom/bytedance/lark/pb/basic/v1/RichContent;", "setTitleRichContent", "(Lcom/bytedance/lark/pb/basic/v1/RichContent;)V", "getTitleRichText", "()Lcom/ss/android/lark/widget/richtext/RichText;", "setTitleRichText", "(Lcom/ss/android/lark/widget/richtext/RichText;)V", "getTitleStr", "setTitleStr", "getTitleType", "()Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem$TitleType;", "setTitleType", "(Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem$TitleType;)V", "getTodoSource", "()Lcom/bytedance/lark/pb/todo/v1/TodoSource;", "setTodoSource", "(Lcom/bytedance/lark/pb/todo/v1/TodoSource;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "ChangeStatus", "ChatListTitleType", "TitleType", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TodoDisplayItem {

    /* renamed from: A */
    private boolean f140289A;

    /* renamed from: B */
    private TitleType f140290B;

    /* renamed from: C */
    private ChatListTitleType f140291C;

    /* renamed from: D */
    private boolean f140292D;

    /* renamed from: E */
    private String f140293E;

    /* renamed from: F */
    private int f140294F;

    /* renamed from: G */
    private int f140295G;

    /* renamed from: H */
    private TodoSource f140296H;

    /* renamed from: I */
    private boolean f140297I;

    /* renamed from: J */
    private boolean f140298J;

    /* renamed from: K */
    private boolean f140299K;

    /* renamed from: L */
    private boolean f140300L;

    /* renamed from: M */
    private List<TodoAssignee> f140301M;

    /* renamed from: N */
    private boolean f140302N;

    /* renamed from: a */
    private final boolean f140303a;

    /* renamed from: b */
    private final boolean f140304b;

    /* renamed from: c */
    private final boolean f140305c;

    /* renamed from: d */
    private final int f140306d;

    /* renamed from: e */
    private final int f140307e;

    /* renamed from: f */
    private final String f140308f;

    /* renamed from: g */
    private final int f140309g;

    /* renamed from: h */
    private final int f140310h;

    /* renamed from: i */
    private String f140311i;

    /* renamed from: j */
    private RichText f140312j;

    /* renamed from: k */
    private RichContent f140313k;

    /* renamed from: l */
    private boolean f140314l;

    /* renamed from: m */
    private CharSequence f140315m;

    /* renamed from: n */
    private int f140316n;

    /* renamed from: o */
    private long f140317o;

    /* renamed from: p */
    private boolean f140318p;

    /* renamed from: q */
    private String f140319q;

    /* renamed from: r */
    private int f140320r;

    /* renamed from: s */
    private long f140321s;

    /* renamed from: t */
    private MultiCompleteHelper.MultiCompleteType f140322t;

    /* renamed from: u */
    private CustomComplete.Action f140323u;

    /* renamed from: v */
    private boolean f140324v;

    /* renamed from: w */
    private boolean f140325w;

    /* renamed from: x */
    private ChangeStatus f140326x;

    /* renamed from: y */
    private boolean f140327y;

    /* renamed from: z */
    private TodoChatItem f140328z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem$ChangeStatus;", "", "(Ljava/lang/String;I)V", "DELETE", "QUIT", "UNFOLLOWED", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ChangeStatus {
        DELETE,
        QUIT,
        UNFOLLOWED
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem$ChatListTitleType;", "", "(Ljava/lang/String;I)V", "ASSIGN_TO_ME", "ASSIGN_OTHER", "COMPLETED", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ChatListTitleType {
        ASSIGN_TO_ME,
        ASSIGN_OTHER,
        COMPLETED
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem$TitleType;", "", "(Ljava/lang/String;I)V", "OVER_DUE", "TODAY", "IN_WEEK", "OTHER", "DOING", "DONE", "COMPLETED", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum TitleType {
        OVER_DUE,
        TODAY,
        IN_WEEK,
        OTHER,
        DOING,
        DONE,
        COMPLETED
    }

    public TodoDisplayItem() {
        this(null, null, null, false, null, 0, 0, false, null, 0, 0, null, null, false, false, null, false, null, false, null, null, false, null, 0, 0, null, false, false, false, false, null, false, -1, null);
    }

    public int hashCode() {
        String str = this.f140311i;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        RichText richText = this.f140312j;
        int hashCode2 = (hashCode + (richText != null ? richText.hashCode() : 0)) * 31;
        RichContent richContent = this.f140313k;
        int hashCode3 = (hashCode2 + (richContent != null ? richContent.hashCode() : 0)) * 31;
        boolean z = this.f140314l;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode3 + i3) * 31;
        CharSequence charSequence = this.f140315m;
        int hashCode4 = (((((i6 + (charSequence != null ? charSequence.hashCode() : 0)) * 31) + this.f140316n) * 31) + C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f140317o)) * 31;
        boolean z2 = this.f140318p;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (hashCode4 + i7) * 31;
        String str2 = this.f140319q;
        int hashCode5 = (((((i10 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f140320r) * 31) + C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f140321s)) * 31;
        MultiCompleteHelper.MultiCompleteType multiCompleteType = this.f140322t;
        int hashCode6 = (hashCode5 + (multiCompleteType != null ? multiCompleteType.hashCode() : 0)) * 31;
        CustomComplete.Action action = this.f140323u;
        int hashCode7 = (hashCode6 + (action != null ? action.hashCode() : 0)) * 31;
        boolean z3 = this.f140324v;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (hashCode7 + i11) * 31;
        boolean z4 = this.f140325w;
        if (z4) {
            z4 = true;
        }
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = (i14 + i15) * 31;
        ChangeStatus changeStatus = this.f140326x;
        int hashCode8 = (i18 + (changeStatus != null ? changeStatus.hashCode() : 0)) * 31;
        boolean z5 = this.f140327y;
        if (z5) {
            z5 = true;
        }
        int i19 = z5 ? 1 : 0;
        int i20 = z5 ? 1 : 0;
        int i21 = z5 ? 1 : 0;
        int i22 = (hashCode8 + i19) * 31;
        TodoChatItem aVar = this.f140328z;
        int hashCode9 = (i22 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        boolean z6 = this.f140289A;
        if (z6) {
            z6 = true;
        }
        int i23 = z6 ? 1 : 0;
        int i24 = z6 ? 1 : 0;
        int i25 = z6 ? 1 : 0;
        int i26 = (hashCode9 + i23) * 31;
        TitleType titleType = this.f140290B;
        int hashCode10 = (i26 + (titleType != null ? titleType.hashCode() : 0)) * 31;
        ChatListTitleType chatListTitleType = this.f140291C;
        int hashCode11 = (hashCode10 + (chatListTitleType != null ? chatListTitleType.hashCode() : 0)) * 31;
        boolean z7 = this.f140292D;
        if (z7) {
            z7 = true;
        }
        int i27 = z7 ? 1 : 0;
        int i28 = z7 ? 1 : 0;
        int i29 = z7 ? 1 : 0;
        int i30 = (hashCode11 + i27) * 31;
        String str3 = this.f140293E;
        int hashCode12 = (((((i30 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f140294F) * 31) + this.f140295G) * 31;
        TodoSource todoSource = this.f140296H;
        int hashCode13 = (hashCode12 + (todoSource != null ? todoSource.hashCode() : 0)) * 31;
        boolean z8 = this.f140297I;
        if (z8) {
            z8 = true;
        }
        int i31 = z8 ? 1 : 0;
        int i32 = z8 ? 1 : 0;
        int i33 = z8 ? 1 : 0;
        int i34 = (hashCode13 + i31) * 31;
        boolean z9 = this.f140298J;
        if (z9) {
            z9 = true;
        }
        int i35 = z9 ? 1 : 0;
        int i36 = z9 ? 1 : 0;
        int i37 = z9 ? 1 : 0;
        int i38 = (i34 + i35) * 31;
        boolean z10 = this.f140299K;
        if (z10) {
            z10 = true;
        }
        int i39 = z10 ? 1 : 0;
        int i40 = z10 ? 1 : 0;
        int i41 = z10 ? 1 : 0;
        int i42 = (i38 + i39) * 31;
        boolean z11 = this.f140300L;
        if (z11) {
            z11 = true;
        }
        int i43 = z11 ? 1 : 0;
        int i44 = z11 ? 1 : 0;
        int i45 = z11 ? 1 : 0;
        int i46 = (i42 + i43) * 31;
        List<TodoAssignee> list = this.f140301M;
        if (list != null) {
            i = list.hashCode();
        }
        int i47 = (i46 + i) * 31;
        boolean z12 = this.f140302N;
        if (!z12) {
            i2 = z12 ? 1 : 0;
        }
        return i47 + i2;
    }

    public String toString() {
        return "TodoDisplayItem(guid=" + this.f140311i + ", titleRichText=" + this.f140312j + ", titleRichContent=" + this.f140313k + ", isCompleted=" + this.f140314l + ", attendeeStr=" + this.f140315m + ", attendeeCount=" + this.f140316n + ", endMilliTime=" + this.f140317o + ", isAllDay=" + this.f140318p + ", endTimeStr=" + this.f140319q + ", endTimeColor=" + this.f140320r + ", createMilliTime=" + this.f140321s + ", completeType=" + this.f140322t + ", completeAction=" + this.f140323u + ", isFollowerCheckable=" + this.f140324v + ", isCountBadge=" + this.f140325w + ", changeStatus=" + this.f140326x + ", isDeletable=" + this.f140327y + ", chatItem=" + this.f140328z + ", isTitle=" + this.f140289A + ", titleType=" + this.f140290B + ", chatListTitleType=" + this.f140291C + ", isTitleExpand=" + this.f140292D + ", titleStr=" + this.f140293E + ", titleCount=" + this.f140294F + ", titleRedCount=" + this.f140295G + ", todoSource=" + this.f140296H + ", isLastItem=" + this.f140297I + ", isFirstItem=" + this.f140298J + ", isLastInSection=" + this.f140299K + ", isFirstInSection=" + this.f140300L + ", assignees=" + this.f140301M + ", timeNewLine=" + this.f140302N + ")";
    }

    /* renamed from: A */
    public final boolean mo193155A() {
        return this.f140299K;
    }

    /* renamed from: B */
    public final List<TodoAssignee> mo193156B() {
        return this.f140301M;
    }

    /* renamed from: C */
    public final boolean mo193157C() {
        return this.f140302N;
    }

    /* renamed from: b */
    public final int mo193161b() {
        return this.f140306d;
    }

    /* renamed from: c */
    public final int mo193163c() {
        return this.f140309g;
    }

    /* renamed from: d */
    public final int mo193165d() {
        return this.f140310h;
    }

    /* renamed from: e */
    public final String mo193167e() {
        return this.f140311i;
    }

    /* renamed from: f */
    public final RichText mo193169f() {
        return this.f140312j;
    }

    /* renamed from: g */
    public final RichContent mo193170g() {
        return this.f140313k;
    }

    /* renamed from: h */
    public final boolean mo193171h() {
        return this.f140314l;
    }

    /* renamed from: i */
    public final String mo193173i() {
        return this.f140319q;
    }

    /* renamed from: j */
    public final int mo193174j() {
        return this.f140320r;
    }

    /* renamed from: k */
    public final MultiCompleteHelper.MultiCompleteType mo193175k() {
        return this.f140322t;
    }

    /* renamed from: l */
    public final CustomComplete.Action mo193176l() {
        return this.f140323u;
    }

    /* renamed from: m */
    public final boolean mo193177m() {
        return this.f140324v;
    }

    /* renamed from: n */
    public final boolean mo193178n() {
        return this.f140325w;
    }

    /* renamed from: o */
    public final ChangeStatus mo193179o() {
        return this.f140326x;
    }

    /* renamed from: p */
    public final TodoChatItem mo193180p() {
        return this.f140328z;
    }

    /* renamed from: q */
    public final boolean mo193181q() {
        return this.f140289A;
    }

    /* renamed from: r */
    public final TitleType mo193182r() {
        return this.f140290B;
    }

    /* renamed from: s */
    public final ChatListTitleType mo193183s() {
        return this.f140291C;
    }

    /* renamed from: t */
    public final boolean mo193184t() {
        return this.f140292D;
    }

    /* renamed from: u */
    public final String mo193186u() {
        return this.f140293E;
    }

    /* renamed from: v */
    public final int mo193187v() {
        return this.f140294F;
    }

    /* renamed from: w */
    public final int mo193188w() {
        return this.f140295G;
    }

    /* renamed from: x */
    public final TodoSource mo193189x() {
        return this.f140296H;
    }

    /* renamed from: y */
    public final boolean mo193190y() {
        return this.f140297I;
    }

    /* renamed from: z */
    public final boolean mo193191z() {
        return this.f140298J;
    }

    /* renamed from: a */
    public final boolean mo193160a() {
        return this.f140305c;
    }

    /* renamed from: a */
    public final void mo193158a(int i) {
        this.f140295G = i;
    }

    /* renamed from: a */
    public final void mo193159a(boolean z) {
        this.f140297I = z;
    }

    /* renamed from: b */
    public final void mo193162b(boolean z) {
        this.f140298J = z;
    }

    /* renamed from: c */
    public final void mo193164c(boolean z) {
        this.f140299K = z;
    }

    /* renamed from: d */
    public final void mo193166d(boolean z) {
        this.f140300L = z;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof TodoDisplayItem)) {
            return false;
        }
        boolean z = this.f140289A;
        TodoDisplayItem todoDisplayItem = (TodoDisplayItem) obj;
        if (z != todoDisplayItem.f140289A) {
            return false;
        }
        if (!z) {
            if (!(Intrinsics.areEqual(this.f140312j, todoDisplayItem.f140312j) && Intrinsics.areEqual(this.f140313k, todoDisplayItem.f140313k) && Intrinsics.areEqual(this.f140315m, todoDisplayItem.f140315m) && this.f140314l == todoDisplayItem.f140314l && Intrinsics.areEqual(this.f140319q, todoDisplayItem.f140319q) && this.f140320r == todoDisplayItem.f140320r && this.f140324v == todoDisplayItem.f140324v && this.f140327y == todoDisplayItem.f140327y && this.f140297I == todoDisplayItem.f140297I && this.f140298J == todoDisplayItem.f140298J && this.f140299K == todoDisplayItem.f140299K && this.f140300L == todoDisplayItem.f140300L && this.f140302N == todoDisplayItem.f140302N)) {
                return false;
            }
        } else if (!(this.f140290B == todoDisplayItem.f140290B && this.f140292D == todoDisplayItem.f140292D && Intrinsics.areEqual(this.f140293E, todoDisplayItem.f140293E) && this.f140294F == todoDisplayItem.f140294F && this.f140295G == todoDisplayItem.f140295G)) {
            return false;
        }
        return true;
    }

    public TodoDisplayItem(String str, RichText richText, RichContent richContent, boolean z, CharSequence charSequence, int i, long j, boolean z2, String str2, int i2, long j2, MultiCompleteHelper.MultiCompleteType multiCompleteType, CustomComplete.Action action, boolean z3, boolean z4, ChangeStatus changeStatus, boolean z5, TodoChatItem aVar, boolean z6, TitleType titleType, ChatListTitleType chatListTitleType, boolean z7, String str3, int i3, int i4, TodoSource todoSource, boolean z8, boolean z9, boolean z10, boolean z11, List<TodoAssignee> list, boolean z12) {
        int i5;
        int i6;
        String str4;
        int i7;
        Intrinsics.checkParameterIsNotNull(str, "guid");
        Intrinsics.checkParameterIsNotNull(richText, "titleRichText");
        Intrinsics.checkParameterIsNotNull(charSequence, "attendeeStr");
        Intrinsics.checkParameterIsNotNull(str2, "endTimeStr");
        Intrinsics.checkParameterIsNotNull(multiCompleteType, "completeType");
        Intrinsics.checkParameterIsNotNull(changeStatus, "changeStatus");
        Intrinsics.checkParameterIsNotNull(titleType, "titleType");
        Intrinsics.checkParameterIsNotNull(chatListTitleType, "chatListTitleType");
        Intrinsics.checkParameterIsNotNull(str3, "titleStr");
        this.f140311i = str;
        this.f140312j = richText;
        this.f140313k = richContent;
        this.f140314l = z;
        this.f140315m = charSequence;
        this.f140316n = i;
        this.f140317o = j;
        this.f140318p = z2;
        this.f140319q = str2;
        this.f140320r = i2;
        this.f140321s = j2;
        this.f140322t = multiCompleteType;
        this.f140323u = action;
        this.f140324v = z3;
        this.f140325w = z4;
        this.f140326x = changeStatus;
        this.f140327y = z5;
        this.f140328z = aVar;
        this.f140289A = z6;
        this.f140290B = titleType;
        this.f140291C = chatListTitleType;
        this.f140292D = z7;
        this.f140293E = str3;
        this.f140294F = i3;
        this.f140295G = i4;
        this.f140296H = todoSource;
        this.f140297I = z8;
        this.f140298J = z9;
        this.f140299K = z10;
        this.f140300L = z11;
        this.f140301M = list;
        this.f140302N = z12;
        boolean z13 = true;
        boolean z14 = !TextUtils.isEmpty(charSequence);
        this.f140303a = z14;
        boolean z15 = !TextUtils.isEmpty(this.f140319q);
        this.f140304b = z15;
        int i8 = 0;
        this.f140305c = (z14 || z15) ? false : z13;
        if (z14) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        this.f140306d = i5;
        int i9 = this.f140316n;
        if (i9 >= 5) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        this.f140307e = i6;
        if (i9 >= 5) {
            str4 = ResUtil.f139261a.mo191778a(R.string.Todo_CollabTask_NumberPeopleInTotal, "number", String.valueOf(this.f140316n));
        } else {
            str4 = "";
        }
        this.f140308f = str4;
        if (z15) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f140309g = i7;
        this.f140310h = !this.f140314l ? 8 : i8;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TodoDisplayItem(java.lang.String r36, com.ss.android.lark.widget.richtext.RichText r37, com.bytedance.lark.pb.basic.v1.RichContent r38, boolean r39, java.lang.CharSequence r40, int r41, long r42, boolean r44, java.lang.String r45, int r46, long r47, com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper.MultiCompleteType r49, com.bytedance.lark.pb.todo.v1.CustomComplete.Action r50, boolean r51, boolean r52, com.ss.android.lark.todo.impl.features.mainview.entity.TodoDisplayItem.ChangeStatus r53, boolean r54, com.ss.android.lark.todo.impl.features.mainview.entity.TodoChatItem r55, boolean r56, com.ss.android.lark.todo.impl.features.mainview.entity.TodoDisplayItem.TitleType r57, com.ss.android.lark.todo.impl.features.mainview.entity.TodoDisplayItem.ChatListTitleType r58, boolean r59, java.lang.String r60, int r61, int r62, com.bytedance.lark.pb.todo.v1.TodoSource r63, boolean r64, boolean r65, boolean r66, boolean r67, java.util.List r68, boolean r69, int r70, kotlin.jvm.internal.DefaultConstructorMarker r71) {
        /*
        // Method dump skipped, instructions count: 415
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.mainview.entity.TodoDisplayItem.<init>(java.lang.String, com.ss.android.lark.widget.richtext.RichText, com.bytedance.lark.pb.basic.v1.RichContent, boolean, java.lang.CharSequence, int, long, boolean, java.lang.String, int, long, com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper$MultiCompleteType, com.bytedance.lark.pb.todo.v1.CustomComplete$Action, boolean, boolean, com.ss.android.lark.todo.impl.features.mainview.entity.TodoDisplayItem$ChangeStatus, boolean, com.ss.android.lark.todo.impl.features.mainview.entity.a, boolean, com.ss.android.lark.todo.impl.features.mainview.entity.TodoDisplayItem$TitleType, com.ss.android.lark.todo.impl.features.mainview.entity.TodoDisplayItem$ChatListTitleType, boolean, java.lang.String, int, int, com.bytedance.lark.pb.todo.v1.TodoSource, boolean, boolean, boolean, boolean, java.util.List, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
