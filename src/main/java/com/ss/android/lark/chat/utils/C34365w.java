package com.ss.android.lark.chat.utils;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.Content;
import com.bytedance.lark.pb.basic.v1.SendLarkCommandPayloadRequest;
import com.bytedance.lark.pb.im.v1.GetMessageActionPayloadRequest;
import com.bytedance.lark.pb.im.v1.GetMessageActionPayloadResponse;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.api.service.p1600b.C32835d;
import com.ss.android.lark.chat.entity.chat.AddChatChatterApply;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.PickChatEntity;
import com.ss.android.lark.chat.entity.message.content.SystemContent;
import com.ss.android.lark.chat.export.entity.message.content.ActionUrl;
import com.ss.android.lark.chat.export.entity.message.content.ContentValue;
import com.ss.android.lark.chat.export.entity.message.content.ContentValueType;
import com.ss.android.lark.chat.export.entity.message.content.InviteAtChatters;
import com.ss.android.lark.chat.export.entity.message.content.LarkCommand;
import com.ss.android.lark.chat.export.entity.message.content.SystemMessageAction;
import com.ss.android.lark.chat.export.entity.message.content.SystemMessageItemAction;
import com.ss.android.lark.chat.export.entity.message.content.SystemMessageType;
import com.ss.android.lark.chat.service.AbstractC34297l;
import com.ss.android.lark.chatwindow.AbstractC35250i;
import com.ss.android.lark.chatwindow.C35212a;
import com.ss.android.lark.chatwindow.C35228b;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36461ah;
import com.ss.android.lark.dependency.IBrowserDependency;
import com.ss.android.lark.dependency.IChatSettingDependency;
import com.ss.android.lark.dto.chat.ProfileSource;
import com.ss.android.lark.dto.group.GroupRecallEntity;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.share_group.RecallGroupChatterActivity;
import com.ss.android.lark.statistics.message.MessageHitPoint;
import com.ss.android.lark.statistics.system_content.SystemContentHitPoint;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;

/* renamed from: com.ss.android.lark.chat.utils.w */
public class C34365w {

    /* renamed from: a */
    public static IBrowserDependency f88719a = C29990c.m110930b().mo134593u();

    /* renamed from: b */
    public static AbstractC36461ah f88720b = C29990c.m110930b().mo134523V();

    /* renamed from: c */
    private static final int[] f88721c = {SystemMessageType.SystemContent_CHECK_USER_PHONE_NUMBER.getNumber(), SystemMessageType.USER_CHECK_OTHERS_TELEPHONE.getNumber(), SystemMessageType.USER_MODIFY_GROUP_NAME.getNumber(), SystemMessageType.USER_MODIFY_GROUP_AVATAR.getNumber(), SystemMessageType.USER_MODIFY_GROUP_DESCRIPTION.getNumber(), SystemMessageType.USER_MODIFY_GROUP_SETTINGS.getNumber(), SystemMessageType.USER_START_GROUP_AND_INVITE.getNumber(), SystemMessageType.SYSTEM_WELCOME_USER.getNumber(), SystemMessageType.USER_INVITE_OTHERS_JOIN.getNumber(), SystemMessageType.USER_QUIT_GROUP.getNumber(), SystemMessageType.USER_REMOVE_OTHERS.getNumber(), SystemMessageType.DERIVE_FROM_P2P_CHAT.getNumber(), SystemMessageType.USER_JOIN_VIA_SHARE.getNumber(), SystemMessageType.TRANSFER_GROUP_CHAT_OWNER.getNumber(), SystemMessageType.TRANSFER_GROUP_CHAT_OWNER_AND_QUIT.getNumber(), SystemMessageType.USER_SYNC_MESSAGE.getNumber(), SystemMessageType.USER_INVITE_OTHERS_JOIN_CRYPTO_CHAT.getNumber(), SystemMessageType.USER_START_CRYPTO_GROUP_AND_INVITE.getNumber(), SystemMessageType.USER_START_GROUP.getNumber(), SystemMessageType.USER_JOIN_VIA_QR_CODE.getNumber(), SystemMessageType.USER_SHARE_DOC_PERMISSION.getNumber(), SystemMessageType.USER_CHANGE_DOC_PERMISSION.getNumber(), SystemMessageType.USER_SHARE_DOC_FOLDER.getNumber(), SystemMessageType.USER_OPEN_ONLY_ADMIN_POST.getNumber(), SystemMessageType.USER_SEPECIFY_MEMBERS_POST.getNumber(), SystemMessageType.USER_OPEN_ANYONE_POST.getNumber(), SystemMessageType.USER_INVITE_OTHERS_JOIN_MEETING.getNumber(), SystemMessageType.USER_QUIT_MEETING_CHAT.getNumber(), SystemMessageType.USER_DISMISSED_MEETING_CHAT.getNumber(), SystemMessageType.USER_REMOVE_OTHERS_FROM_MEETING.getNumber(), SystemMessageType.USER_ADD_MEETING_CHAT.getNumber(), SystemMessageType.USER_START_MEETING_GROUP_AND_INVITE.getNumber(), SystemMessageType.INVITE_CHAT_MEMBER_2_OUT_CHAT.getNumber(), SystemMessageType.CREATE_CHAT_AND_INVITE_FROM_CHAT_MEMBER.getNumber(), SystemMessageType.USER_START_MEETING_GROUP_AND_INVITE.getNumber(), SystemMessageType.AUTO_TRANSLATE_GUIDANCE.getNumber(), SystemMessageType.WITHDRAW_ADDED_USER.getNumber(), SystemMessageType.SAIPAN_REMIND_ONCALL_REPLY.getNumber(), SystemMessageType.SAIPAN_REMIND_ONCALL_DONE.getNumber(), SystemMessageType.SAIPAN_REMIND_ONCALL_AUTO_DONE.getNumber(), SystemMessageType.SAIPAN_ADD_ONCALL.getNumber(), SystemMessageType.USER_OPEN_ONLY_ADMIN_POST_THREAD.getNumber(), SystemMessageType.USER_SPECIFY_MEMBERS_POST_THREAD.getNumber(), SystemMessageType.USER_OPEN_ANYONE_POST_THREAD.getNumber(), SystemMessageType.INVITE_AT_CHATTERS.getNumber(), SystemMessageType.USER_OPEN_ANYONE_POST_THREAD.getNumber(), SystemMessageType.VC_MEETING_STARTED.getNumber(), SystemMessageType.VC_MEETING_ENDED_OVER_ONE_HOUR.getNumber(), SystemMessageType.VC_MEETING_ENDED_LESS_ONE_HOUR.getNumber(), SystemMessageType.VC_MEETING_ENDED_LESS_ONE_MINUTE.getNumber(), SystemMessageType.VC_DEFAULT_MEETING_ENDED_OVER_ONE_HOUR.getNumber(), SystemMessageType.VC_DEFAULT_MEETING_ENDED_LESS_ONE_HOUR.getNumber(), SystemMessageType.VC_DEFAULT_MEETING_ENDED_LESS_ONE_MIN.getNumber(), SystemMessageType.VC_CALL_INTERVIEWEE_NO_ANSWER.getNumber(), SystemMessageType.VC_CALL_INTERVIEWEE_REFUSE.getNumber(), SystemMessageType.VC_CALL_INTERVIEWER_CANCEL.getNumber(), SystemMessageType.VC_CALL_INTERVIEWEE_BUSY.getNumber(), SystemMessageType.VOIP_INTERVIEWEE_NO_ANSWER.getNumber(), SystemMessageType.VOIP_INTERVIEWEE_REFUSE.getNumber(), SystemMessageType.VOIP_INTERVIEWER_CANCEL.getNumber(), SystemMessageType.VOIP_INTERVIEWEE_BUSY.getNumber(), SystemMessageType.CANCEL_EMERGENCY_CALL.getNumber(), SystemMessageType.HANGUP_EMERGENCY_CALL.getNumber(), SystemMessageType.START_EMERGENCY_CALL.getNumber(), SystemMessageType.EMERGENCY_CALL_NOTANSWER.getNumber(), SystemMessageType.MEETING_TRANSFER_TO_CHAT.getNumber(), SystemMessageType.MEETING_TRANSFER_TO_CHAT_WITH_DOC_URL.getNumber(), SystemMessageType.VC_CALL_INTERVIEWEE_NOT_ONLINE.getNumber(), SystemMessageType.VOIP_INTERVIEWEE_NOT_ONLINE.getNumber(), SystemMessageType.USER_JOIN_CHAT_AUTO_MUTE.getNumber(), SystemMessageType.INVITE_CHATTERS_TO_CHAT_NO_PERMISSION_LESS_THRESHOLD.getNumber(), SystemMessageType.INVITE_CHATTERS_TO_CHAT_NO_PERMISSION_OVER_THRESHOLD.getNumber(), SystemMessageType.USER_CHANGE_TURN_ON_GROUP_MAIL.getNumber(), SystemMessageType.USER_CHANGE_TURN_OFF_GROUP_MAIL.getNumber(), SystemMessageType.USER_CHANGE_GROUP_MAIL_PERMISSION_OWNER.getNumber(), SystemMessageType.USER_CHANGE_GROUP_MAIL_PERMISSION_MEMBERS.getNumber(), SystemMessageType.USER_CHANGE_GROUP_MAIL_PERMISSION_TENANT.getNumber(), SystemMessageType.USER_CHANGE_GROUP_MAIL_PERMISSION_EVERYONE.getNumber(), SystemMessageType.USER_JOIN_VIA_GROUP_LINK.getNumber(), SystemMessageType.USER_INVITE_BOT_JOIN.getNumber(), SystemMessageType.DOC_TEMPLATE_GROUP_SHARE.getNumber(), SystemMessageType.SHEET_TEMPLATE_GROUP_SHARE.getNumber(), SystemMessageType.MIND_NOTE_TEMPLATE_GROUP_SHARE.getNumber(), SystemMessageType.BUILD_ONE_WAY_RELATION.getNumber(), SystemMessageType.INVITE_FRIENDS_SUCCESS.getNumber(), SystemMessageType.CREATE_P2P_SOURCE.getNumber(), SystemMessageType.CREATE_CIRCLE_AND_INVITE_OTHERS_FROM_CHAT.getNumber(), SystemMessageType.MENTIONED_PERSON_NOT_IN_CIRCLE.getNumber(), SystemMessageType.INVITE_MEMBERS_TO_JOIN_EXTERNAL_CIRCLE.getNumber(), SystemMessageType.INVITE_CHATTERS_TO_CHAT_NO_PERMISSION_LESS_THRESHOLD.getNumber(), SystemMessageType.INVITE_CHATTERS_TO_CHAT_NO_PERMISSION_OVER_THRESHOLD.getNumber(), SystemMessageType.JOIN_CIRCLE_VIA_HELP_DESK_MSG_CARD.getNumber(), SystemMessageType.CIRCLE_WELCOME_NEW_MEMBERS.getNumber(), SystemMessageType.TRANSFER_CIRCLE_OWNER.getNumber(), SystemMessageType.TRANSFER_CIRCLE_OWNER_AND_LEAVE.getNumber(), SystemMessageType.CIRCLE_USER_CHANGE_DOC_PERMISSION.getNumber(), SystemMessageType.USER_INVITE_BOT_JOIN_CIRCLE.getNumber(), SystemMessageType.USER_INVITE_OTHERS_JOIN_CIRCLE.getNumber(), SystemMessageType.USER_INVITE_OTHERS_JOIN_CIRCLE_BY_LINK.getNumber(), SystemMessageType.CIRCLE_TOO_MANY_MEMBERS_NOTIFICATION_MUTED.getNumber(), SystemMessageType.USER_INVITE_OTHERS_JOIN_CIRCLE_BY_QR_CODE.getNumber(), SystemMessageType.USER_INVITE_OTHERS_JOIN_CIRCLE_BY_INVITATION_CARD.getNumber(), SystemMessageType.USER_MODIFY_CIRCLE_AVATAR.getNumber(), SystemMessageType.USER_MODIFY_CIRCLE_DESCRIPTION.getNumber(), SystemMessageType.USER_MODIFY_CIRCLE_NAME.getNumber(), SystemMessageType.USER_MODIFY_CIRCLE_OWNER.getNumber(), SystemMessageType.USER_MODIFY_CIRCLE_SETTINGS.getNumber(), SystemMessageType.USER_SET_ONLY_CIRCLE_OWNER_CAN_POST.getNumber(), SystemMessageType.USER_SET_ONLY_CIRCLE_OWNER_CAN_CREATE_NEW_TOPICS.getNumber(), SystemMessageType.USER_LEAVE_CIRCLE.getNumber(), SystemMessageType.USER_REMOVE_CIRCLE_MEMBERS.getNumber(), SystemMessageType.USER_REMOVE_CIRCLE_MEMBERS.getNumber(), SystemMessageType.USER_CREATE_CIRCLE.getNumber(), SystemMessageType.USER_CREATE_CIRCLE_AND_INVITE.getNumber(), SystemMessageType.USER_SYNC_MESSAGE_TO_CIRCLE.getNumber(), SystemMessageType.USER_WITHDRAW_CIRCLE_INVITATION.getNumber(), SystemMessageType.CIRCLE_ANONYMOUS_ON.getNumber(), SystemMessageType.CIRCLE_ANONYMOUS_OFF.getNumber(), SystemMessageType.USER_CLEAR_CIRCLE_ANNOUNCEMENT.getNumber(), SystemMessageType.USER_REMOVE_CIRCLE_DESCRIPTION.getNumber(), SystemMessageType.USER_CREATE_FACE_TO_FACE_CHAT.getNumber(), SystemMessageType.WELCOME_USER_JOIN_FACE_TO_FACE_CHAT.getNumber(), SystemMessageType.INVITE_CHAT_MEMBER_2_CHAT.getNumber(), SystemMessageType.WILL_REACH_CHAT_CHATTER_COUNT_LIMIT.getNumber(), SystemMessageType.ALREADY_REACH_CHAT_CHATTER_COUNT_LIMIT.getNumber(), SystemMessageType.USER_CREATED_GROUP_AND_INVITED_OTHER_CHATTER_CHAT_DEPARTMENT.getNumber(), SystemMessageType.USER_INVITE_OTHERS_CHATTER_CHAT_DEPARTMENT_JOIN.getNumber(), SystemMessageType.CREATE_CHAT_AND_INVITE_FROM_CHAT_DEPARTMENT_MEMBER.getNumber(), SystemMessageType.USER_OPEN_ONLY_SPECIFY_MEMBERS_POST.getNumber(), SystemMessageType.USER_OPEN_ONLY_SPECIFY_MEMBERS_POST_THREAD.getNumber(), SystemMessageType.USER_REMOVE_SPECIFY_MEMBERS_POST.getNumber(), SystemMessageType.USER_REMOVE_SPECIFY_MEMBERS_POST_THREAD.getNumber(), SystemMessageType.ADD_MEMBER_TO_ADMIN_LIST.getNumber(), SystemMessageType.REMOVE_MEMBER_FROM_ADMIN_LIST.getNumber(), SystemMessageType.USER_OPEN_ONLY_OWNER_AND_ADMIN_POST.getNumber(), SystemMessageType.USER_OPEN_ONLY_OWNER_AND_ADMIN_POST_THREAD.getNumber(), SystemMessageType.ADMIN_OPEN_ANYONE_POST.getNumber(), SystemMessageType.ADMIN_OPEN_ANYONE_POST_THREAD.getNumber(), SystemMessageType.USER_CHANGE_GROUP_MAIL_PERMISSION_OWNER_OR_ADMIN.getNumber(), SystemMessageType.GROUP_NEW_MEMBERS_VIEW_CHAT_HISTORY_ON.getNumber(), SystemMessageType.GROUP_NEW_MEMBERS_VIEW_CHAT_HISTORY_OFF.getNumber(), SystemMessageType.GROUP_NEW_MEMBERS_CAN_VIEW_HISTORY_MESSAGES.getNumber(), SystemMessageType.CIRCLE_WELCOME_NEW_MEMBERS_NO_HISTORY.getNumber(), SystemMessageType.JOIN_CIRCLE_VIA_HELP_DESK_MSG_CARD_NO_HISTORY.getNumber(), SystemMessageType.USER_INVITE_OTHERS_JOIN_CIRCLE_NO_HISTORY.getNumber(), SystemMessageType.USER_INVITE_OTHERS_JOIN_CIRCLE_BY_INVITATION_CARD_NO_HISTORY.getNumber(), SystemMessageType.USER_INVITE_OTHERS_JOIN_CIRCLE_BY_LINK_NO_HISTORY.getNumber(), SystemMessageType.USER_INVITE_OTHERS_JOIN_CIRCLE_BY_QR_CODE_NO_HISTORY.getNumber(), SystemMessageType.USER_INVITE_OTHERS_CHATTER_CHAT_DEPARTMENT_JOIN_NO_HIStORY.getNumber(), SystemMessageType.USER_JOIN_VIA_QR_CODE_NO_HISTORY.getNumber(), SystemMessageType.USER_JOIN_CHAT_WELCOME_MESSAGE.getNumber(), SystemMessageType.USER_JOIN_CHAT_WELCOME_MESSAGE_NO_HISTORY.getNumber(), SystemMessageType.USER_INVITE_OTHERS_JOIN_CHAT_MESSAGE.getNumber(), SystemMessageType.USER_INVITE_OTHERS_JOIN_CHAT_MESSAGE_NO_HISTORY.getNumber(), SystemMessageType.USER_INVITE_OTHERS_CHATTER_CHAT_DEPARTMENT_JOIN_NEW.getNumber(), SystemMessageType.USER_JOIN_VIA_QR_NEW.getNumber(), SystemMessageType.USER_JOIN_VIA_SHARE_NEW.getNumber(), SystemMessageType.USER_JOIN_VIA_SHARE_NO_HISTORY.getNumber(), SystemMessageType.USER_JOIN_CHAT_BY_LINK.getNumber(), SystemMessageType.USER_JOIN_CHAT_BY_LINK_NO_HISTORY.getNumber(), SystemMessageType.HELP_DESK_USER_JOIN_CHAT.getNumber(), SystemMessageType.HELP_DESK_USER_JOIN_CHAT_NO_HISTORY.getNumber(), SystemMessageType.BITABLE_TEMPLATE_GROUP_SHARE_SYSTEM_MESSAGE.getNumber(), SystemMessageType.UPGRADE_SUPER_CHAT.getNumber(), SystemMessageType.CREATE_TEAM_AND_INVITE_MEMBERS.getNumber(), SystemMessageType.INVITE_MEMBERS_JOIN_TEAM.getNumber(), SystemMessageType.MEMBERS_JOIN_TEAM_FAIL.getNumber(), SystemMessageType.KICK_MEMBERS_OUT_TEAM.getNumber(), SystemMessageType.MEMBER_LEAVE_TEAM.getNumber(), SystemMessageType.TRANSFER_TEAM_OWNER.getNumber(), SystemMessageType.MODIFY_TEAM_NAME.getNumber(), SystemMessageType.ENABLE_TEAM_CREATE_CHAT_PERMISSION.getNumber(), SystemMessageType.CLOSE_TEAM_CREATE_CHAT_PERMISSION.getNumber(), SystemMessageType.ENABLE_TEAM_ADD_MEMBERS_PERMISSION.getNumber(), SystemMessageType.CLOSE_TEAM_ADD_MEMBERS_PERMISSION.getNumber(), SystemMessageType.DISSOLVE_TEAM_AND_UNBIND_CHAT.getNumber(), SystemMessageType.CREATE_TEAM_CHAT.getNumber(), SystemMessageType.BIND_CHAT_INTO_TEAM.getNumber(), SystemMessageType.UNBIND_CHAT_WITH_TEAM.getNumber(), SystemMessageType.MEMBERS_JOIN_TEAM_CHAT_SEE_HISTORICAL.getNumber(), SystemMessageType.MEMBERS_JOIN_TEAM_CHAT_SEE_NEW_MESSAGES.getNumber(), SystemMessageType.MEMBERS_JOIN_TEAM_CHAT_FAIL.getNumber(), SystemMessageType.UPDATE_CHAT_TO_TEAM.getNumber(), SystemMessageType.MEMBERS_LEAVE_AND_TRANSFER.getNumber(), SystemMessageType.USER_CREATE_TEAM.getNumber(), SystemMessageType.MODIFY_TEAM_AVATAR.getNumber(), SystemMessageType.MODIFY_TEAM_DESCRIPTION.getNumber(), SystemMessageType.DELETE_TEAM_DESCRIPTION.getNumber(), SystemMessageType.CREATE_URGENT_ONLY_OWNER_AND_ADMIN_ON.getNumber(), SystemMessageType.CREATE_URGENT_ONLY_OWNER_AND_ADMIN_OFF.getNumber()};

    /* renamed from: d */
    private static final int[] f88722d = {SystemMessageType.CRYPTO_MESSAGE_NOTICE_NO_TRANSMIT.getNumber(), SystemMessageType.CRYPTO_MESSAGE_NOTICE_SEVEN_DAYS.getNumber(), SystemMessageType.CRYPTO_MESSAGE_NOTICE_BURN_AFTER_READING.getNumber()};

    /* renamed from: e */
    private static final Integer[] f88723e;

    /* renamed from: f */
    private static final Set<Integer> f88724f;

    /* renamed from: g */
    private static final Integer[] f88725g;

    /* renamed from: h */
    private static final Set<Integer> f88726h;

    /* renamed from: i */
    private static AbstractC36450aa f88727i = C29990c.m110930b().mo134515N();

    /* renamed from: j */
    private static AbstractC34297l f88728j = C32835d.m126323c();

    /* renamed from: com.ss.android.lark.chat.utils.w$a */
    public interface AbstractC34377a {
        /* renamed from: a */
        void mo123349a(String str, List<GroupRecallEntity> list);

        /* renamed from: a */
        void mo123350a(String str, List<GroupRecallEntity> list, IGetDataCallback<List<GroupRecallEntity>> iGetDataCallback);

        void f_(String str);
    }

    public static /* synthetic */ Boolean lambda$VpLR3fpQgGnCcJ6ofK71wLwEs3A(byte[] bArr) {
        return true;
    }

    static {
        Integer[] numArr = {Integer.valueOf(SystemMessageType.USER_INVITE_OTHERS_JOIN.getNumber()), Integer.valueOf(SystemMessageType.USER_INVITE_OTHERS_JOIN_CRYPTO_CHAT.getNumber()), Integer.valueOf(SystemMessageType.USER_JOIN_VIA_SHARE.getNumber()), Integer.valueOf(SystemMessageType.USER_JOIN_VIA_QR_CODE.getNumber()), Integer.valueOf(SystemMessageType.USER_JOIN_VIA_GROUP_LINK.getNumber()), Integer.valueOf(SystemMessageType.USER_INVITE_BOT_JOIN.getNumber()), Integer.valueOf(SystemMessageType.USER_INVITE_OTHERS_JOIN_CIRCLE.getNumber()), Integer.valueOf(SystemMessageType.USER_INVITE_OTHERS_JOIN_CIRCLE_BY_INVITATION_CARD.getNumber()), Integer.valueOf(SystemMessageType.USER_INVITE_OTHERS_JOIN_CIRCLE_BY_QR_CODE.getNumber()), Integer.valueOf(SystemMessageType.USER_INVITE_BOT_JOIN_CIRCLE.getNumber()), Integer.valueOf(SystemMessageType.USER_INVITE_OTHERS_JOIN_CIRCLE_BY_LINK.getNumber()), Integer.valueOf(SystemMessageType.USER_INVITE_OTHERS_CHATTER_CHAT_DEPARTMENT_JOIN.getNumber()), Integer.valueOf(SystemMessageType.GROUP_NEW_MEMBERS_CAN_VIEW_HISTORY_MESSAGES.getNumber()), Integer.valueOf(SystemMessageType.USER_INVITE_OTHERS_JOIN_CIRCLE_NO_HISTORY.getNumber()), Integer.valueOf(SystemMessageType.USER_INVITE_OTHERS_JOIN_CIRCLE_BY_INVITATION_CARD_NO_HISTORY.getNumber()), Integer.valueOf(SystemMessageType.USER_INVITE_OTHERS_JOIN_CIRCLE_BY_QR_CODE_NO_HISTORY.getNumber()), Integer.valueOf(SystemMessageType.USER_INVITE_OTHERS_JOIN_CIRCLE_BY_LINK_NO_HISTORY.getNumber()), Integer.valueOf(SystemMessageType.USER_INVITE_OTHERS_CHATTER_CHAT_DEPARTMENT_JOIN_NO_HIStORY.getNumber()), Integer.valueOf(SystemMessageType.USER_JOIN_VIA_QR_CODE_NO_HISTORY.getNumber()), Integer.valueOf(SystemMessageType.USER_INVITE_OTHERS_JOIN_CHAT_MESSAGE.getNumber()), Integer.valueOf(SystemMessageType.USER_INVITE_OTHERS_JOIN_CHAT_MESSAGE_NO_HISTORY.getNumber()), Integer.valueOf(SystemMessageType.USER_INVITE_OTHERS_CHATTER_CHAT_DEPARTMENT_JOIN_NEW.getNumber()), Integer.valueOf(SystemMessageType.USER_JOIN_VIA_QR_NEW.getNumber()), Integer.valueOf(SystemMessageType.USER_JOIN_VIA_SHARE_NEW.getNumber()), Integer.valueOf(SystemMessageType.USER_JOIN_VIA_SHARE_NO_HISTORY.getNumber()), Integer.valueOf(SystemMessageType.USER_JOIN_CHAT_BY_LINK.getNumber()), Integer.valueOf(SystemMessageType.USER_JOIN_CHAT_BY_LINK_NO_HISTORY.getNumber())};
        f88723e = numArr;
        f88724f = new HashSet(Arrays.asList(numArr));
        Integer[] numArr2 = {Integer.valueOf(SystemMessageType.BUILD_ONE_WAY_RELATION.getNumber()), Integer.valueOf(SystemMessageType.INVITE_FRIENDS_SUCCESS.getNumber()), Integer.valueOf(SystemMessageType.SEND_MESSAGE_COLLABORATION_AUTH_FAILED.getNumber()), Integer.valueOf(SystemMessageType.NOT_COLLABORATION_AUTH_SEND_MSG_LIMIT_NOTIFY.getNumber()), Integer.valueOf(SystemMessageType.NOT_COLLABORATION_AUTH_SEND_MSG_REACH_LIMIT.getNumber())};
        f88725g = numArr2;
        f88726h = new HashSet(Arrays.asList(numArr2));
    }

    /* renamed from: a */
    private static void m133286a(final Context context, final SystemMessageType systemMessageType, SpannableStringBuilder spannableStringBuilder, final ContentValueType contentValueType, final ContentValue contentValue, final String str, final String str2, final boolean z, final int i, final SystemMessageItemAction dVar) {
        if (contentValueType == ContentValueType.USER || contentValueType == ContentValueType.URL || contentValueType == ContentValueType.CHAT || contentValueType == ContentValueType.ACTION || contentValueType == ContentValueType.CHATTER || contentValueType == ContentValueType.BOT) {
            int length = spannableStringBuilder.length() - contentValue.getValue().length();
            int length2 = spannableStringBuilder.length();
            C343661 r14 = new AbstractC35250i(context) {
                /* class com.ss.android.lark.chat.utils.C34365w.C343661 */

                /* renamed from: k */
                private long f88738k;

                public void onClick(View view) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    this.f88738k = uptimeMillis;
                    if (uptimeMillis - this.f88738k < 500) {
                        Log.m165389i("SystemContentUtil", "elapsedTime is short than LENGTH_SHORT");
                        return;
                    }
                    C34365w.m133293a(systemMessageType, contentValueType);
                    switch (C343683.f88742a[contentValueType.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                            if (!contentValue.isAnonymous().booleanValue()) {
                                C34365w.f88720b.mo134436a(context, new ProfileSource.C36868a().mo136066c(contentValue.getId()).mo136065b(str).mo136060a(2).mo136063a());
                                return;
                            }
                            Log.m165389i("SystemContentUtil", "clicked on anonymous chatter " + contentValue.getId() + ", suppress jump to profile");
                            return;
                        case 4:
                            C34365w.f88719a.mo134333b(context, contentValue.getLink(), z ? 1 : 0);
                            return;
                        case 5:
                            String str = str;
                            if (str == null || !str.equals(contentValue.getId())) {
                                C35228b.m137564a().mo121114a(context, ChatBundle.m109259a().mo105927a(contentValue.getId()).mo105939f(false).mo105938e(false).mo105945l(true).mo105929a());
                                return;
                            }
                            return;
                        case 6:
                            if (i == 0) {
                                C34365w.m133287a(context, systemMessageType, contentValue.getAction(), str, str2);
                                return;
                            } else {
                                C34365w.m133289a(context, str, dVar, z);
                                return;
                            }
                        default:
                            return;
                    }
                }
            };
            if ((contentValueType == ContentValueType.CHATTER || contentValueType == ContentValueType.USER) && systemMessageType == SystemMessageType.INVITE_AT_CHATTERS) {
                r14.mo129710a(R.color.text_caption);
            }
            spannableStringBuilder.setSpan(r14, length, length2, 17);
        }
    }

    /* renamed from: a */
    public static void m133293a(SystemMessageType systemMessageType, ContentValueType contentValueType) {
        int i = C343683.f88742a[contentValueType.ordinal()];
        if (i == 1 || i == 2) {
            MessageHitPoint.f135779d.mo187551e();
            if (f88726h.contains(systemMessageType)) {
                MessageHitPoint.f135779d.mo187557h();
            }
        } else if (i == 4 && systemMessageType == SystemMessageType.CREATE_P2P_SOURCE) {
            MessageHitPoint.f135779d.mo187559i();
        }
    }

    /* renamed from: a */
    public static void m133287a(Context context, SystemMessageType systemMessageType, SystemMessageAction systemMessageAction, String str, String str2) {
        if (systemMessageAction != null && systemMessageAction.getActType() != null) {
            SystemMessageAction.ActType actType = systemMessageAction.getActType();
            if (actType == SystemMessageAction.ActType.INVITE_AT_CHATTERS || actType == SystemMessageAction.ActType.URL) {
                SdkSender.syncSend(Command.GET_MESSAGE_ACTION_PAYLOAD, new GetMessageActionPayloadRequest.C17609a().mo61601a(str2).mo61600a(Content.SystemMessageAction.ActType.fromValue(actType.getValue())), new SdkSender.IParser(context, str) {
                    /* class com.ss.android.lark.chat.utils.$$Lambda$w$_JwEArROtQ4Bq4oM0ZlUHk2dSQ */
                    public final /* synthetic */ Context f$1;
                    public final /* synthetic */ String f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    @Override // com.ss.android.lark.sdk.SdkSender.IParser
                    public final Object parse(byte[] bArr) {
                        return C34365w.m133280a(SystemMessageAction.ActType.this, this.f$1, this.f$2, bArr);
                    }
                });
                if (actType == SystemMessageAction.ActType.INVITE_AT_CHATTERS) {
                    SystemContentHitPoint.f135905a.mo187709a();
                } else {
                    SystemContentHitPoint.f135905a.mo187710a(systemMessageType);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m133289a(Context context, String str, SystemMessageItemAction dVar, boolean z) {
        if (dVar != null && dVar.mo126126c() == 0) {
            ActionUrl aVar = (ActionUrl) dVar;
            C29990c.m110930b().mo134592t().mo134416b(context, TextUtils.isEmpty(aVar.mo126112a()) ? aVar.mo126113b() : aVar.mo126112a());
        } else if (dVar != null && dVar.mo126126c() == 2) {
            m133297b(context, str, ((InviteAtChatters) dVar).mo126117a());
        } else if (dVar != null && dVar.mo126126c() == 1) {
            CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.chat.utils.$$Lambda$w$aY0u51DQjPscwhFYtbnel1Fh8is */

                public final void run() {
                    C34365w.m133294a(LarkCommand.this);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m133294a(LarkCommand cVar) {
        SdkSender.syncSendMayError(Command.SEND_LARKCOMMAND_PAYLOAD, new SendLarkCommandPayloadRequest.C15257a().mo55541a(Integer.valueOf(cVar.mo126121a())).mo55542a(cVar.mo126122b()), $$Lambda$w$VpLR3fpQgGnCcJ6ofK71wLwEs3A.INSTANCE);
    }

    /* renamed from: a */
    public static ArrayList<String> m133282a(SystemContent systemContent) {
        List<ContentValue> list;
        ArrayList<String> arrayList = new ArrayList<>();
        if (!(systemContent == null || (list = systemContent.getSystemContents().get("to_chatters")) == null || list.isEmpty())) {
            for (ContentValue contentValue : list) {
                arrayList.add(contentValue.getId());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m133285a(Context context, SystemContent systemContent, SpannableStringBuilder spannableStringBuilder, final View.OnClickListener onClickListener, boolean z) {
        if (onClickListener == null) {
            return;
        }
        if (m133299d(systemContent) || m133300e(systemContent)) {
            int length = spannableStringBuilder.length();
            if (m133299d(systemContent)) {
                if (length > 0) {
                    length--;
                }
                spannableStringBuilder.append(" ");
                spannableStringBuilder.append((CharSequence) C57582a.m223604a(context, (int) R.string.Lark_Groups_RevokeInvite));
            } else {
                spannableStringBuilder.append(" ");
                if (z) {
                    spannableStringBuilder.append((CharSequence) C57582a.m223604a(context, (int) R.string.Lark_Legacy_ClickToCall));
                } else {
                    spannableStringBuilder.append((CharSequence) C57582a.m223604a(context, (int) R.string.Lark_Legacy_ClickToCallBack));
                }
            }
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.setSpan(new AbstractC35250i(context, R.color.text_placeholder) {
                /* class com.ss.android.lark.chat.utils.C34365w.C343736 */

                public void onClick(View view) {
                    onClickListener.onClick(view);
                }
            }, length, length2, 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C57582a.m223616d(context, R.color.text_link_normal)), length + 1, length2, 33);
        }
    }

    /* renamed from: a */
    public static void m133292a(final Context context, String str, final List<GroupRecallEntity> list, final Chat chat, final AbstractC34377a aVar) {
        if (aVar != null) {
            aVar.mo123350a(str, list, new UIGetDataCallback<List<GroupRecallEntity>>() {
                /* class com.ss.android.lark.chat.utils.C34365w.C343747 */

                @Override // com.larksuite.framework.callback.UIGetDataCallback
                public void onErrored(ErrorResult errorResult) {
                    super.onErrored(errorResult);
                }

                /* renamed from: a */
                public void onSuccessed(List<GroupRecallEntity> list) {
                    if (list.isEmpty()) {
                        int a = C34365w.m133274a(list, chat.isThread());
                        Context context = context;
                        C35212a.m137531a(context, (String) null, C25653b.m91895a(context, a));
                        return;
                    }
                    C34365w.m133284a(context, chat, list, aVar);
                }
            });
        }
    }

    /* renamed from: a */
    private static Map<Integer, List<PickChatEntity>> m133283a(List<? extends PickChatEntity> list) {
        HashMap hashMap = new HashMap(list.size());
        for (PickChatEntity pickChatEntity : list) {
            List list2 = (List) hashMap.get(Integer.valueOf(pickChatEntity.mo124689a()));
            if (list2 == null) {
                list2 = new ArrayList(list.size() / 3);
                hashMap.put(Integer.valueOf(pickChatEntity.mo124689a()), list2);
            }
            list2.add(pickChatEntity);
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m133284a(Context context, final Chat chat, final List<GroupRecallEntity> list, final AbstractC34377a aVar) {
        if (list.size() > 1) {
            Intent intent = new Intent(context, RecallGroupChatterActivity.class);
            intent.putExtra("key_chatId", chat.getId());
            intent.putExtra("key_is_thread", chat.isThread());
            intent.putParcelableArrayListExtra("key_entities", new ArrayList<>(list));
            context.startActivity(intent);
            return;
        }
        C35212a.m137529a(context, new C35212a.AbstractC35215a() {
            /* class com.ss.android.lark.chat.utils.C34365w.C343758 */

            @Override // com.ss.android.lark.chatwindow.C35212a.AbstractC35215a
            /* renamed from: b */
            public void mo122373b() {
            }

            @Override // com.ss.android.lark.chatwindow.C35212a.AbstractC35215a
            /* renamed from: a */
            public void mo122372a() {
                AbstractC34377a aVar = aVar;
                if (aVar != null) {
                    aVar.mo123349a(chat.getId(), list);
                }
            }
        });
    }

    /* renamed from: a */
    public static boolean m133295a(long j, int i) {
        return System.currentTimeMillis() - j > ((long) i) * 3600000;
    }

    /* renamed from: a */
    public static String m133281a(int i) {
        if (i > 24) {
            return UIHelper.mustacheFormat((int) R.string.Lark_Group_RevokeTimeOutDays, "time", String.format("%.1f", Double.valueOf(((double) i) / 24.0d)));
        } else if (i == 24) {
            return UIHelper.mustacheFormat((int) R.string.Lark_Group_RevokeTimeOutOneDay, "time", String.valueOf(1));
        } else {
            if (i == 1) {
                return UIHelper.mustacheFormat((int) R.string.Lark_Group_RevokeTimeOutOneHour, "time", String.valueOf(1));
            }
            return UIHelper.mustacheFormat((int) R.string.Lark_Group_RevokeTimeOutHours, "time", String.valueOf(i));
        }
    }

    /* renamed from: a */
    public static void m133290a(final Context context, final String str, final String str2) {
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                /* class com.ss.android.lark.chat.utils.C34365w.RunnableC343672 */

                public void run() {
                    C35212a.m137531a(context, str, str2);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chat.utils.w$3 */
    public static /* synthetic */ class C343683 {

        /* renamed from: a */
        static final /* synthetic */ int[] f88742a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.lark.chat.export.entity.message.content.ContentValueType[] r0 = com.ss.android.lark.chat.export.entity.message.content.ContentValueType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.chat.utils.C34365w.C343683.f88742a = r0
                com.ss.android.lark.chat.export.entity.message.content.ContentValueType r1 = com.ss.android.lark.chat.export.entity.message.content.ContentValueType.USER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.chat.utils.C34365w.C343683.f88742a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.chat.export.entity.message.content.ContentValueType r1 = com.ss.android.lark.chat.export.entity.message.content.ContentValueType.CHATTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.chat.utils.C34365w.C343683.f88742a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.chat.export.entity.message.content.ContentValueType r1 = com.ss.android.lark.chat.export.entity.message.content.ContentValueType.BOT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.chat.utils.C34365w.C343683.f88742a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.chat.export.entity.message.content.ContentValueType r1 = com.ss.android.lark.chat.export.entity.message.content.ContentValueType.URL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.chat.utils.C34365w.C343683.f88742a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.chat.export.entity.message.content.ContentValueType r1 = com.ss.android.lark.chat.export.entity.message.content.ContentValueType.CHAT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.android.lark.chat.utils.C34365w.C343683.f88742a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.android.lark.chat.export.entity.message.content.ContentValueType r1 = com.ss.android.lark.chat.export.entity.message.content.ContentValueType.ACTION     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.utils.C34365w.C343683.<clinit>():void");
        }
    }

    /* renamed from: e */
    private static boolean m133300e(SystemContent systemContent) {
        if (systemContent == null || (systemContent.getType() != SystemMessageType.USER_CHECK_OTHERS_TELEPHONE && systemContent.getType() != SystemMessageType.SystemContent_CHECK_USER_PHONE_NUMBER)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m133299d(SystemContent systemContent) {
        List<ContentValue> list;
        if (systemContent == null || !f88724f.contains(Integer.valueOf(systemContent.getType().getNumber())) || (list = systemContent.getSystemContents().get("from_user")) == null || list.isEmpty()) {
            return false;
        }
        return f88727i.mo134398a(list.get(0).getId());
    }

    /* renamed from: c */
    private static String m133298c(SystemContent systemContent) {
        String messageTemplate = systemContent.getMessageTemplate();
        Set<String> keySet = systemContent.getSystemContents().keySet();
        for (Map.Entry<String, String> entry : systemContent.getContents().entrySet()) {
            if (!keySet.contains(entry.getKey())) {
                messageTemplate = messageTemplate.replaceAll("\\{" + entry.getKey() + "\\}", Matcher.quoteReplacement(entry.getValue()));
            }
        }
        return messageTemplate;
    }

    /* renamed from: b */
    public static ArrayList<GroupRecallEntity> m133296b(SystemContent systemContent) {
        if (systemContent == null) {
            return new ArrayList<>();
        }
        ArrayList<GroupRecallEntity> arrayList = new ArrayList<>();
        List<ContentValue> list = systemContent.getSystemContents().get("to_chatters");
        if (list != null && !list.isEmpty()) {
            for (ContentValue contentValue : list) {
                arrayList.add(new GroupRecallEntity(1, contentValue.getId()));
            }
        }
        List<ContentValue> list2 = systemContent.getSystemContents().get("from_chat");
        if (list2 != null && !list2.isEmpty()) {
            for (ContentValue contentValue2 : list2) {
                arrayList.add(new GroupRecallEntity(2, contentValue2.getId()));
            }
        }
        List<ContentValue> list3 = systemContent.getSystemContents().get("from_dept");
        if (list3 != null && !list3.isEmpty()) {
            for (ContentValue contentValue3 : list3) {
                arrayList.add(new GroupRecallEntity(3, contentValue3.getId(), contentValue3.getValue()));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m133288a(final Context context, final String str) {
        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
            /* class com.ss.android.lark.chat.utils.C34365w.RunnableC343769 */

            public void run() {
                UDToast.show(context, str);
            }
        });
    }

    /* renamed from: a */
    public static int m133274a(List<? extends PickChatEntity> list, boolean z) {
        Map<Integer, List<PickChatEntity>> a = m133283a(list);
        if (a.size() == 1) {
            boolean z2 = false;
            int intValue = ((Integer) new ArrayList(a.keySet()).get(0)).intValue();
            if (a.get(Integer.valueOf(intValue)).size() > 1) {
                z2 = true;
            }
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        if (z2) {
                            return R.string.Lark_Server_AllDepartmentsMembersNoLongerInTheGroup;
                        }
                        return R.string.Lark_Server_DepartmentMemberNoLongerInTheGroup;
                    }
                } else if (z2) {
                    return R.string.Lark_Server_AllGroupsMembersNoLongerInTheGroup;
                } else {
                    return R.string.Lark_Server_GroupMemberNoLongerInTheGroup;
                }
            } else if (z2) {
                if (z) {
                    return R.string.Lark_Groups_RevokeFailedDialogContentManyMember;
                }
                return R.string.Lark_Group_RevokeMoreMemberNotExist;
            } else if (z) {
                return R.string.Lark_Groups_RevokeFailedDialogContent;
            } else {
                return R.string.Lark_Group_RevokeOneMemberNotExist;
            }
        }
        return R.string.Lark_Group_RevokeMoreMemberNotExist;
    }

    /* renamed from: a */
    public static void m133291a(final Context context, final String str, final List<String> list) {
        C32821b.m126120a().mo121007a(str, list, new IGetDataCallback<Chat>() {
            /* class com.ss.android.lark.chat.utils.C34365w.C343705 */

            /* renamed from: a */
            public void onSuccess(Chat chat) {
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (errorResult.getErrorCode() == 5020) {
                    C29990c.m110930b().mo134595w().mo134355a(context, new IChatSettingDependency.AbstractC36448a() {
                        /* class com.ss.android.lark.chat.utils.C34365w.C343705.C343711 */

                        @Override // com.ss.android.lark.dependency.IChatSettingDependency.AbstractC36448a
                        public void onClick(View view, String str) {
                            C32821b.m126120a().mo120995a(str, AddChatChatterApply.Ways.VIA_INVITATION, list, str, C29990c.m110930b().mo134515N().mo134394a(), (String) null, new UIGetDataCallback(new IGetDataCallback<Boolean>() {
                                /* class com.ss.android.lark.chat.utils.C34365w.C343705.C343711.C343721 */

                                /* renamed from: a */
                                public void onSuccess(Boolean bool) {
                                    C34365w.m133288a(context, context.getString(R.string.Lark_Legacy_RequestSentApprovalPendingToast));
                                }

                                @Override // com.larksuite.framework.callback.IGetDataCallback
                                public void onError(ErrorResult errorResult) {
                                    if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                                        C34365w.m133288a(context, errorResult.getDisplayMsg());
                                        Log.m165382e(errorResult.toString());
                                    }
                                }
                            }));
                        }
                    });
                } else if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                    C34365w.m133290a(context, (String) null, errorResult.getDisplayMsg());
                }
            }
        });
    }

    /* renamed from: b */
    private static void m133297b(final Context context, final String str, List<String> list) {
        if (!CollectionUtils.isEmpty(list)) {
            C32821b.m126120a().mo121029a(list, str, new IGetDataCallback<Map<String, Boolean>>() {
                /* class com.ss.android.lark.chat.utils.C34365w.C343694 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165382e(errorResult.toString());
                }

                /* renamed from: a */
                public void onSuccess(Map<String, Boolean> map) {
                    if (map == null || map.size() == 0) {
                        Context context = context;
                        C34365w.m133288a(context, context.getString(R.string.Lark_Group_MembersAreInTheGroup));
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry<String, Boolean> entry : map.entrySet()) {
                        if (!entry.getValue().booleanValue()) {
                            arrayList.add(entry.getKey());
                        }
                    }
                    if (arrayList.size() == 0) {
                        Context context2 = context;
                        C34365w.m133288a(context2, context2.getString(R.string.Lark_Group_MembersAreInTheGroup));
                        return;
                    }
                    C34365w.m133291a(context, str, arrayList);
                }
            });
        }
    }

    /* renamed from: a */
    private static SpannableStringBuilder m133277a(SpannableStringBuilder spannableStringBuilder, String str, SpannableStringBuilder spannableStringBuilder2) {
        if (spannableStringBuilder == null || str == null || spannableStringBuilder2 == null) {
            return spannableStringBuilder;
        }
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        String spannableStringBuilder4 = spannableStringBuilder.toString();
        int i = 0;
        int i2 = -1;
        while (true) {
            i2 = spannableStringBuilder4.indexOf(str, i2 + 1);
            if (i2 == -1) {
                return spannableStringBuilder3.append(spannableStringBuilder.subSequence(i, spannableStringBuilder.length()));
            }
            spannableStringBuilder3 = spannableStringBuilder3.append(spannableStringBuilder.subSequence(i, i2)).append((CharSequence) spannableStringBuilder2);
            i = str.length() + i2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Object m133280a(SystemMessageAction.ActType actType, Context context, String str, byte[] bArr) throws IOException {
        GetMessageActionPayloadResponse decode = GetMessageActionPayloadResponse.ADAPTER.decode(bArr);
        if (actType == SystemMessageAction.ActType.INVITE_AT_CHATTERS) {
            m133297b(context, str, decode.at_chatter_ids);
            return decode.at_chatter_ids;
        }
        C29990c.m110930b().mo134592t().mo134416b(context, decode.url);
        return decode.url;
    }

    /* renamed from: a */
    private static SpannableStringBuilder m133275a(Context context, SystemContent systemContent, String str, String str2, boolean z) {
        if (systemContent == null) {
            return null;
        }
        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) m133298c(systemContent));
        for (Map.Entry<String, List<ContentValue>> entry : systemContent.getSystemContents().entrySet()) {
            append = m133277a(append, "{" + entry.getKey() + "}", m133276a(context, systemContent.getType(), entry.getValue(), str, str2, z, systemContent.getVersion(), systemContent.getItemActions()));
        }
        return append;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r8.isMsgClickable() != false) goto L_0x002c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence m133279a(android.content.Context r7, com.ss.android.lark.chat.entity.message.content.SystemContent r8, java.lang.String r9, java.lang.String r10, boolean r11, android.view.View.OnClickListener r12, boolean r13) {
        /*
            int r0 = r8.getVersion()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0020
            int[] r0 = com.ss.android.lark.chat.utils.C34365w.f88721c
            int r3 = r0.length
            r4 = 0
        L_0x000c:
            if (r4 >= r3) goto L_0x001e
            r5 = r0[r4]
            com.ss.android.lark.chat.export.entity.message.content.SystemMessageType r6 = r8.getType()
            int r6 = r6.getNumber()
            if (r6 != r5) goto L_0x001b
            goto L_0x002c
        L_0x001b:
            int r4 = r4 + 1
            goto L_0x000c
        L_0x001e:
            r1 = 0
            goto L_0x002c
        L_0x0020:
            int r0 = r8.getVersion()
            if (r0 <= 0) goto L_0x001e
            boolean r0 = r8.isMsgClickable()
            if (r0 == 0) goto L_0x001e
        L_0x002c:
            if (r1 == 0) goto L_0x0036
            android.text.SpannableStringBuilder r9 = m133275a(r7, r8, r9, r10, r11)
            m133285a(r7, r8, r9, r12, r13)
            return r9
        L_0x0036:
            java.lang.String r7 = r8.getFormattedContent()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.utils.C34365w.m133279a(android.content.Context, com.ss.android.lark.chat.entity.message.content.SystemContent, java.lang.String, java.lang.String, boolean, android.view.View$OnClickListener, boolean):java.lang.CharSequence");
    }

    /* renamed from: a */
    private static SpannableStringBuilder m133276a(Context context, SystemMessageType systemMessageType, List<ContentValue> list, String str, String str2, boolean z, int i, Map<Integer, SystemMessageItemAction> map) {
        if (list == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String a = C34357v.m133268a();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ContentValue contentValue = list.get(i2);
            if (i2 != 0) {
                spannableStringBuilder.append((CharSequence) a);
            }
            spannableStringBuilder.append((CharSequence) contentValue.getValue());
            if (systemMessageType == SystemMessageType.USER_CHECK_OTHERS_TELEPHONE) {
                contentValue.setContentValueType(ContentValueType.USER);
            }
            ContentValueType contentValueType = contentValue.getContentValueType();
            if (i == 0 || contentValue.isClickable()) {
                m133286a(context, systemMessageType, spannableStringBuilder, contentValueType, contentValue, str, str2, z, i, map.get(Integer.valueOf(contentValue.getActionId())));
            }
        }
        return spannableStringBuilder;
    }
}
