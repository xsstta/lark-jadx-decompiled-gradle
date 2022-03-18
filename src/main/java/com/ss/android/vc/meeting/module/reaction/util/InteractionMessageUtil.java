package com.ss.android.vc.meeting.module.reaction.util;

import com.ss.android.lark.pb.videoconference.v1.ParticipantRole;
import com.ss.android.lark.pb.videoconference.v1.ParticipantType;
import com.ss.android.lark.pb.videoconference.v1.PushVideoChatInteractionMessages;
import com.ss.android.lark.pb.videoconference.v1.SystemMessageContent;
import com.ss.android.lark.pb.videoconference.v1.VideoChatInteractionMessage;
import com.ss.android.lark.pb.videoconference.v1.VideoChatParticipant;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.vc.C60657a;
import com.ss.android.vc.meeting.module.reaction.entity.InteractionMessage;
import com.ss.android.vc.meeting.module.reaction.entity.InteractionMessageType;
import com.ss.android.vc.meeting.module.reaction.entity.ReactionContent;
import com.ss.android.vc.meeting.module.reaction.entity.SystemContent;
import com.ss.android.vc.meeting.module.reaction.entity.SystemType;
import com.ss.android.vc.meeting.module.reaction.entity.TextContent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00040\bj\b\u0012\u0004\u0012\u00020\u0004`\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/meeting/module/reaction/util/InteractionMessageUtil;", "", "()V", "parseMessageFromPb", "Lcom/ss/android/vc/meeting/module/reaction/entity/InteractionMessage;", "pbMessage", "Lcom/ss/android/lark/pb/videoconference/v1/VideoChatInteractionMessage;", "parseMessagesFromPb", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "interactionMessages", "Lcom/ss/android/lark/pb/videoconference/v1/PushVideoChatInteractionMessages;", "lib_vc_network_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.reaction.b.a */
public final class InteractionMessageUtil {

    /* renamed from: a */
    public static final InteractionMessageUtil f157976a = new InteractionMessageUtil();

    private InteractionMessageUtil() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final ArrayList<InteractionMessage> m245785a(PushVideoChatInteractionMessages pushVideoChatInteractionMessages) {
        Intrinsics.checkParameterIsNotNull(pushVideoChatInteractionMessages, "interactionMessages");
        ArrayList<InteractionMessage> arrayList = new ArrayList<>();
        List<VideoChatInteractionMessage> list = pushVideoChatInteractionMessages.messages;
        Intrinsics.checkExpressionValueIsNotNull(list, "interactionMessages.messages");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            VideoChatInteractionMessage videoChatInteractionMessage = pushVideoChatInteractionMessages.messages.get(i);
            Intrinsics.checkExpressionValueIsNotNull(videoChatInteractionMessage, "pbMessage");
            InteractionMessage a = m245784a(videoChatInteractionMessage);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    @JvmStatic
    /* renamed from: a */
    public static final InteractionMessage m245784a(VideoChatInteractionMessage videoChatInteractionMessage) {
        Intrinsics.checkParameterIsNotNull(videoChatInteractionMessage, "pbMessage");
        VideoChatParticipant videoChatParticipant = videoChatInteractionMessage.from_user;
        if (videoChatParticipant == null) {
            return null;
        }
        Intrinsics.checkExpressionValueIsNotNull(videoChatParticipant, "pbMessage.from_user ?: return null");
        String str = videoChatParticipant.user_id;
        Intrinsics.checkExpressionValueIsNotNull(str, "pbParticipant.user_id");
        String str2 = videoChatParticipant.device_id;
        Intrinsics.checkExpressionValueIsNotNull(str2, "pbParticipant.device_id");
        String str3 = videoChatParticipant.name;
        Intrinsics.checkExpressionValueIsNotNull(str3, "pbParticipant.name");
        String str4 = videoChatParticipant.avatar_key;
        Intrinsics.checkExpressionValueIsNotNull(str4, "pbParticipant.avatar_key");
        ParticipantType participantType = videoChatParticipant.type;
        Intrinsics.checkExpressionValueIsNotNull(participantType, "pbParticipant.type");
        com.ss.android.vc.entity.ParticipantType forNumber = com.ss.android.vc.entity.ParticipantType.forNumber(participantType.getValue());
        Intrinsics.checkExpressionValueIsNotNull(forNumber, "ParticipantType.forNumbe…pbParticipant.type.value)");
        ParticipantRole participantRole = videoChatParticipant.role;
        Intrinsics.checkExpressionValueIsNotNull(participantRole, "pbParticipant.role");
        com.ss.android.vc.entity.ParticipantRole forNumber2 = com.ss.android.vc.entity.ParticipantRole.forNumber(participantRole.getValue());
        Intrinsics.checkExpressionValueIsNotNull(forNumber2, "ParticipantRole.forNumbe…pbParticipant.role.value)");
        Boolean bool = videoChatParticipant.is_bot;
        Intrinsics.checkExpressionValueIsNotNull(bool, "pbParticipant.is_bot");
        com.ss.android.vc.meeting.module.reaction.entity.VideoChatParticipant eVar = new com.ss.android.vc.meeting.module.reaction.entity.VideoChatParticipant(str, str2, str3, str4, forNumber, forNumber2, bool.booleanValue());
        TextContent dVar = null;
        ReactionContent bVar = null;
        SystemContent cVar = null;
        VideoChatInteractionMessage.Type type = videoChatInteractionMessage.type;
        Intrinsics.checkExpressionValueIsNotNull(type, "pbMessage.type");
        if (type.getValue() == InteractionMessageType.TEXT.getNumber()) {
            RichText a = C60657a.m235732a().mo208737a(videoChatInteractionMessage.text_content.content);
            Intrinsics.checkExpressionValueIsNotNull(a, "NetWorkModule.getVcNetWo…age.text_content.content)");
            dVar = new TextContent(a);
        } else {
            VideoChatInteractionMessage.Type type2 = videoChatInteractionMessage.type;
            Intrinsics.checkExpressionValueIsNotNull(type2, "pbMessage.type");
            if (type2.getValue() == InteractionMessageType.REACTION.getNumber()) {
                String str5 = videoChatInteractionMessage.reaction_content.content;
                Intrinsics.checkExpressionValueIsNotNull(str5, "pbMessage.reaction_content.content");
                bVar = new ReactionContent(str5);
            } else {
                VideoChatInteractionMessage.Type type3 = videoChatInteractionMessage.type;
                Intrinsics.checkExpressionValueIsNotNull(type3, "pbMessage.type");
                if (type3.getValue() == InteractionMessageType.SYSTEM.getNumber()) {
                    SystemType.Companion aVar = SystemType.Companion;
                    SystemMessageContent.SystemMessageType systemMessageType = videoChatInteractionMessage.system_content.type;
                    Intrinsics.checkExpressionValueIsNotNull(systemMessageType, "pbMessage.system_content.type");
                    cVar = new SystemContent(aVar.mo216909a(systemMessageType.getValue()));
                }
            }
        }
        boolean z = false;
        for (VideoChatInteractionMessage.Tag tag : videoChatInteractionMessage.tags) {
            if (tag == VideoChatInteractionMessage.Tag.GUEST) {
                z = true;
            }
        }
        String str6 = videoChatInteractionMessage.id;
        Intrinsics.checkExpressionValueIsNotNull(str6, "pbMessage.id");
        InteractionMessageType.Companion aVar2 = InteractionMessageType.Companion;
        VideoChatInteractionMessage.Type type4 = videoChatInteractionMessage.type;
        Intrinsics.checkExpressionValueIsNotNull(type4, "pbMessage.type");
        InteractionMessageType a2 = aVar2.mo216907a(type4.getValue());
        String str7 = videoChatInteractionMessage.cid;
        Intrinsics.checkExpressionValueIsNotNull(str7, "pbMessage.cid");
        Integer num = videoChatInteractionMessage.position;
        Intrinsics.checkExpressionValueIsNotNull(num, "pbMessage.position");
        int intValue = num.intValue();
        String str8 = videoChatInteractionMessage.create_milli_time;
        Intrinsics.checkExpressionValueIsNotNull(str8, "pbMessage.create_milli_time");
        String str9 = videoChatInteractionMessage.meeting_id;
        Intrinsics.checkExpressionValueIsNotNull(str9, "pbMessage.meeting_id");
        Long l = videoChatInteractionMessage.tenant_id;
        Intrinsics.checkExpressionValueIsNotNull(l, "pbMessage.tenant_id");
        return new InteractionMessage(str6, a2, eVar, str7, intValue, str8, str9, bVar, dVar, cVar, z, l.longValue());
    }
}
