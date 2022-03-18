package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.CardContent;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.Content;
import com.bytedance.lark.pb.basic.v1.Icon;
import com.bytedance.lark.pb.basic.v1.Item;
import com.bytedance.lark.pb.basic.v1.Message;
import com.bytedance.lark.pb.basic.v1.Tag;
import com.bytedance.lark.pb.basic.v1.TeamChatType;
import com.bytedance.lark.pb.basic.v1.Urgent;
import com.bytedance.lark.pb.basic.v1.VideoChatContent;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.ttm.player.MediaPlayer;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ChatData extends Message<ChatData, C17098a> {
    public static final ProtoAdapter<ChatData> ADAPTER = new C17099b();
    public static final Integer DEFAULT_AT_INFOS_COUNT = 0;
    public static final CardContent.Type DEFAULT_CARD_TYPE = CardContent.Type.UNKNOWN_TYPE;
    public static final Chatter.Type DEFAULT_CHATTER_TYPE = Chatter.Type.UNKNOWN;
    public static final Chat.ChatMode DEFAULT_CHAT_MODE = Chat.ChatMode.DEFAULT;
    public static final Boolean DEFAULT_CHAT_MUTEABLE = false;
    public static final Chat.Role DEFAULT_CHAT_ROLE = Chat.Role.IGNORE;
    public static final Chat.Type DEFAULT_CHAT_TYPE = Chat.Type.P2P;
    public static final Boolean DEFAULT_CROSS_TENANT = false;
    public static final Long DEFAULT_DISPLAY_TIME = 0L;
    public static final Long DEFAULT_DO_NOT_DISTURB_END_TIME = 0L;
    public static final EntityStatus DEFAULT_ENTITY_STATUS = EntityStatus.NORMAL;
    public static final Boolean DEFAULT_IS_CROSS_WITH_KA = false;
    public static final Boolean DEFAULT_IS_CRYPTO = false;
    public static final Boolean DEFAULT_IS_DEPARTMENT = false;
    public static final Boolean DEFAULT_IS_EDU = false;
    public static final Boolean DEFAULT_IS_MEETING = false;
    public static final Boolean DEFAULT_IS_MEMBER = true;
    public static final Boolean DEFAULT_IS_MY_THREADS_UPDATED = false;
    public static final Boolean DEFAULT_IS_OFFICIAL_ONCALL = false;
    public static final Boolean DEFAULT_IS_OFFLINE_ONCALL = false;
    public static final Boolean DEFAULT_IS_PUBLIC_V2 = false;
    public static final Boolean DEFAULT_IS_REMIND = false;
    public static final Boolean DEFAULT_IS_SHORTCUT = false;
    public static final Boolean DEFAULT_IS_SUPER = false;
    public static final Boolean DEFAULT_IS_SUPPORT_VIEW = false;
    public static final Boolean DEFAULT_IS_VOICE_CALL = false;
    public static final Integer DEFAULT_LAST_MESSAGE_POSITION = 0;
    public static final Message.Type DEFAULT_LAST_MESSAGE_TYPE = Message.Type.UNKNOWN;
    public static final Long DEFAULT_RANK_TIME = 0L;
    public static final Content.SystemType DEFAULT_SYSTEM_MESSAGE_TYPE = Content.SystemType.UNKNOWN;
    public static final TeamChatType DEFAULT_TEAM_CHAT_TYPE = TeamChatType.TEAM_CHAT_TYPE_UNKNOWN;
    public static final Boolean DEFAULT_TENANT_CHAT = false;
    public static final Integer DEFAULT_UNREAD_COUNT = 0;
    public static final Integer DEFAULT_USER_COUNT = 0;
    public static final VideoChatContent.Type DEFAULT_VIDEO_CHAT_TYPE = VideoChatContent.Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final AtInfo at_info;
    public final List<AtInfo> at_infos;
    public final Integer at_infos_count;
    public final String avatar_key;
    public final String avatar_path;
    public final List<String> avatar_urls;
    public final CardContent.Type card_type;
    public final String chat_description;
    public final Chat.ChatMode chat_mode;
    public final Boolean chat_muteable;
    public final Chat.Role chat_role;
    public final Chat.Type chat_type;
    public final String chatter_id;
    public final List<Chatter.ChatterCustomStatus> chatter_status;
    public final Chatter.Type chatter_type;
    public final Boolean cross_tenant;
    public final HighPriorityDisplay display;
    public final Long display_time;
    public final Long do_not_disturb_end_time;
    public final DraftPreview draft_preview;
    public final EntityStatus entity_status;
    public final FocusInfo focus_info;
    public final Icon icon;
    public final Boolean is_cross_with_ka;
    public final Boolean is_crypto;
    public final Boolean is_department;
    public final Boolean is_edu;
    public final Boolean is_meeting;
    public final Boolean is_member;
    public final Boolean is_my_threads_updated;
    public final Boolean is_official_oncall;
    public final Boolean is_offline_oncall;
    public final Boolean is_public_v2;
    public final Boolean is_remind;
    public final Boolean is_shortcut;
    public final Boolean is_super;
    public final Boolean is_support_view;
    public final Boolean is_voice_call;
    public final Item item;
    public final Integer last_message_position;
    public final Message.Type last_message_type;
    public final String last_visible_message_id;
    public final String localized_digest_message;
    public final String mini_avatar_key;
    public final String name;
    public final String oncall_id;
    public final String original_digest_message;
    public final Long rank_time;
    public final List<Message.Reaction> reactions;
    public final Content.SystemType system_message_type;
    public final List<Tag> tags;
    public final TeamChatType team_chat_type;
    public final String team_name;
    public final Boolean tenant_chat;
    public final Integer unread_count;
    public final UrgentInfo urgent_info;
    public final List<Urgent> urgents;
    public final Integer user_count;
    public final VideoChatContent.Type video_chat_type;
    public final String with_bot_tag;

    /* renamed from: com.bytedance.lark.pb.feed.v1.ChatData$b */
    private static final class C17099b extends ProtoAdapter<ChatData> {
        C17099b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatData.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatData chatData) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            int i28;
            int i29;
            int i30;
            int i31;
            int i32;
            int i33;
            int i34;
            int i35;
            int i36;
            int i37;
            int i38;
            int i39;
            int i40;
            int i41;
            int i42;
            int i43;
            int i44;
            int i45;
            int i46;
            int i47;
            int i48;
            int i49;
            int i50;
            int i51;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, chatData.name);
            int i52 = 0;
            if (chatData.avatar_key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, chatData.avatar_key);
            } else {
                i = 0;
            }
            int i53 = encodedSizeWithTag + i;
            if (chatData.avatar_path != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, chatData.avatar_path);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag2 = i53 + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, chatData.avatar_urls);
            if (chatData.unread_count != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(5, chatData.unread_count);
            } else {
                i3 = 0;
            }
            int encodedSizeWithTag3 = encodedSizeWithTag2 + i3 + ProtoAdapter.BOOL.encodedSizeWithTag(6, chatData.is_remind);
            if (chatData.is_shortcut != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(7, chatData.is_shortcut);
            } else {
                i4 = 0;
            }
            int i54 = encodedSizeWithTag3 + i4;
            if (chatData.draft_preview != null) {
                i5 = DraftPreview.ADAPTER.encodedSizeWithTag(8, chatData.draft_preview);
            } else {
                i5 = 0;
            }
            int i55 = i54 + i5;
            if (chatData.at_info != null) {
                i6 = AtInfo.ADAPTER.encodedSizeWithTag(9, chatData.at_info);
            } else {
                i6 = 0;
            }
            int encodedSizeWithTag4 = i55 + i6 + AtInfo.ADAPTER.asRepeated().encodedSizeWithTag(10, chatData.at_infos);
            if (chatData.localized_digest_message != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(11, chatData.localized_digest_message);
            } else {
                i7 = 0;
            }
            int i56 = encodedSizeWithTag4 + i7;
            if (chatData.entity_status != null) {
                i8 = EntityStatus.ADAPTER.encodedSizeWithTag(12, chatData.entity_status);
            } else {
                i8 = 0;
            }
            int i57 = i56 + i8;
            if (chatData.display_time != null) {
                i9 = ProtoAdapter.INT64.encodedSizeWithTag(13, chatData.display_time);
            } else {
                i9 = 0;
            }
            int i58 = i57 + i9;
            if (chatData.rank_time != null) {
                i10 = ProtoAdapter.INT64.encodedSizeWithTag(14, chatData.rank_time);
            } else {
                i10 = 0;
            }
            int i59 = i58 + i10;
            if (chatData.cross_tenant != null) {
                i11 = ProtoAdapter.BOOL.encodedSizeWithTag(15, chatData.cross_tenant);
            } else {
                i11 = 0;
            }
            int encodedSizeWithTag5 = i59 + i11 + Message.Reaction.ADAPTER.asRepeated().encodedSizeWithTag(16, chatData.reactions);
            if (chatData.do_not_disturb_end_time != null) {
                i12 = ProtoAdapter.INT64.encodedSizeWithTag(17, chatData.do_not_disturb_end_time);
            } else {
                i12 = 0;
            }
            int i60 = encodedSizeWithTag5 + i12;
            if (chatData.mini_avatar_key != null) {
                i13 = ProtoAdapter.STRING.encodedSizeWithTag(18, chatData.mini_avatar_key);
            } else {
                i13 = 0;
            }
            int i61 = i60 + i13;
            if (chatData.original_digest_message != null) {
                i14 = ProtoAdapter.STRING.encodedSizeWithTag(19, chatData.original_digest_message);
            } else {
                i14 = 0;
            }
            int i62 = i61 + i14;
            if (chatData.chat_type != null) {
                i15 = Chat.Type.ADAPTER.encodedSizeWithTag(20, chatData.chat_type);
            } else {
                i15 = 0;
            }
            int i63 = i62 + i15;
            if (chatData.chatter_type != null) {
                i16 = Chatter.Type.ADAPTER.encodedSizeWithTag(21, chatData.chatter_type);
            } else {
                i16 = 0;
            }
            int i64 = i63 + i16;
            if (chatData.chatter_id != null) {
                i17 = ProtoAdapter.STRING.encodedSizeWithTag(22, chatData.chatter_id);
            } else {
                i17 = 0;
            }
            int i65 = i64 + i17;
            if (chatData.is_crypto != null) {
                i18 = ProtoAdapter.BOOL.encodedSizeWithTag(23, chatData.is_crypto);
            } else {
                i18 = 0;
            }
            int i66 = i65 + i18;
            if (chatData.chat_mode != null) {
                i19 = Chat.ChatMode.ADAPTER.encodedSizeWithTag(24, chatData.chat_mode);
            } else {
                i19 = 0;
            }
            int i67 = i66 + i19;
            if (chatData.is_meeting != null) {
                i20 = ProtoAdapter.BOOL.encodedSizeWithTag(25, chatData.is_meeting);
            } else {
                i20 = 0;
            }
            int encodedSizeWithTag6 = i67 + i20 + Urgent.ADAPTER.asRepeated().encodedSizeWithTag(26, chatData.urgents);
            if (chatData.with_bot_tag != null) {
                i21 = ProtoAdapter.STRING.encodedSizeWithTag(27, chatData.with_bot_tag);
            } else {
                i21 = 0;
            }
            int i68 = encodedSizeWithTag6 + i21;
            if (chatData.last_message_position != null) {
                i22 = ProtoAdapter.INT32.encodedSizeWithTag(28, chatData.last_message_position);
            } else {
                i22 = 0;
            }
            int i69 = i68 + i22;
            if (chatData.is_department != null) {
                i23 = ProtoAdapter.BOOL.encodedSizeWithTag(29, chatData.is_department);
            } else {
                i23 = 0;
            }
            int i70 = i69 + i23;
            if (chatData.tenant_chat != null) {
                i24 = ProtoAdapter.BOOL.encodedSizeWithTag(30, chatData.tenant_chat);
            } else {
                i24 = 0;
            }
            int i71 = i70 + i24;
            if (chatData.chat_description != null) {
                i25 = ProtoAdapter.STRING.encodedSizeWithTag(31, chatData.chat_description);
            } else {
                i25 = 0;
            }
            int i72 = i71 + i25;
            if (chatData.is_support_view != null) {
                i26 = ProtoAdapter.BOOL.encodedSizeWithTag(33, chatData.is_support_view);
            } else {
                i26 = 0;
            }
            int i73 = i72 + i26;
            if (chatData.oncall_id != null) {
                i27 = ProtoAdapter.STRING.encodedSizeWithTag(34, chatData.oncall_id);
            } else {
                i27 = 0;
            }
            int i74 = i73 + i27;
            if (chatData.last_message_type != null) {
                i28 = Message.Type.ADAPTER.encodedSizeWithTag(35, chatData.last_message_type);
            } else {
                i28 = 0;
            }
            int i75 = i74 + i28;
            if (chatData.system_message_type != null) {
                i29 = Content.SystemType.ADAPTER.encodedSizeWithTag(36, chatData.system_message_type);
            } else {
                i29 = 0;
            }
            int i76 = i75 + i29;
            if (chatData.card_type != null) {
                i30 = CardContent.Type.ADAPTER.encodedSizeWithTag(37, chatData.card_type);
            } else {
                i30 = 0;
            }
            int i77 = i76 + i30;
            if (chatData.is_public_v2 != null) {
                i31 = ProtoAdapter.BOOL.encodedSizeWithTag(38, chatData.is_public_v2);
            } else {
                i31 = 0;
            }
            int i78 = i77 + i31;
            if (chatData.is_member != null) {
                i32 = ProtoAdapter.BOOL.encodedSizeWithTag(39, chatData.is_member);
            } else {
                i32 = 0;
            }
            int i79 = i78 + i32;
            if (chatData.last_visible_message_id != null) {
                i33 = ProtoAdapter.STRING.encodedSizeWithTag(40, chatData.last_visible_message_id);
            } else {
                i33 = 0;
            }
            int i80 = i79 + i33;
            if (chatData.chat_muteable != null) {
                i34 = ProtoAdapter.BOOL.encodedSizeWithTag(41, chatData.chat_muteable);
            } else {
                i34 = 0;
            }
            int i81 = i80 + i34;
            if (chatData.chat_role != null) {
                i35 = Chat.Role.ADAPTER.encodedSizeWithTag(42, chatData.chat_role);
            } else {
                i35 = 0;
            }
            int i82 = i81 + i35;
            if (chatData.icon != null) {
                i36 = Icon.ADAPTER.encodedSizeWithTag(43, chatData.icon);
            } else {
                i36 = 0;
            }
            int i83 = i82 + i36;
            if (chatData.is_edu != null) {
                i37 = ProtoAdapter.BOOL.encodedSizeWithTag(44, chatData.is_edu);
            } else {
                i37 = 0;
            }
            int i84 = i83 + i37;
            if (chatData.is_cross_with_ka != null) {
                i38 = ProtoAdapter.BOOL.encodedSizeWithTag(45, chatData.is_cross_with_ka);
            } else {
                i38 = 0;
            }
            int i85 = i84 + i38;
            if (chatData.user_count != null) {
                i39 = ProtoAdapter.INT32.encodedSizeWithTag(46, chatData.user_count);
            } else {
                i39 = 0;
            }
            int i86 = i85 + i39;
            if (chatData.urgent_info != null) {
                i40 = UrgentInfo.ADAPTER.encodedSizeWithTag(47, chatData.urgent_info);
            } else {
                i40 = 0;
            }
            int i87 = i86 + i40;
            if (chatData.at_infos_count != null) {
                i41 = ProtoAdapter.INT32.encodedSizeWithTag(48, chatData.at_infos_count);
            } else {
                i41 = 0;
            }
            int encodedSizeWithTag7 = i87 + i41 + Chatter.ChatterCustomStatus.ADAPTER.asRepeated().encodedSizeWithTag(49, chatData.chatter_status);
            if (chatData.focus_info != null) {
                i42 = FocusInfo.ADAPTER.encodedSizeWithTag(50, chatData.focus_info);
            } else {
                i42 = 0;
            }
            int i88 = encodedSizeWithTag7 + i42;
            if (chatData.display != null) {
                i43 = HighPriorityDisplay.ADAPTER.encodedSizeWithTag(51, chatData.display);
            } else {
                i43 = 0;
            }
            int i89 = i88 + i43;
            if (chatData.is_official_oncall != null) {
                i44 = ProtoAdapter.BOOL.encodedSizeWithTag(100, chatData.is_official_oncall);
            } else {
                i44 = 0;
            }
            int i90 = i89 + i44;
            if (chatData.is_offline_oncall != null) {
                i45 = ProtoAdapter.BOOL.encodedSizeWithTag(101, chatData.is_offline_oncall);
            } else {
                i45 = 0;
            }
            int i91 = i90 + i45;
            if (chatData.video_chat_type != null) {
                i46 = VideoChatContent.Type.ADAPTER.encodedSizeWithTag(150, chatData.video_chat_type);
            } else {
                i46 = 0;
            }
            int i92 = i91 + i46;
            if (chatData.is_voice_call != null) {
                i47 = ProtoAdapter.BOOL.encodedSizeWithTag(151, chatData.is_voice_call);
            } else {
                i47 = 0;
            }
            int i93 = i92 + i47;
            if (chatData.is_my_threads_updated != null) {
                i48 = ProtoAdapter.BOOL.encodedSizeWithTag(152, chatData.is_my_threads_updated);
            } else {
                i48 = 0;
            }
            int i94 = i93 + i48;
            if (chatData.is_super != null) {
                i49 = ProtoAdapter.BOOL.encodedSizeWithTag(153, chatData.is_super);
            } else {
                i49 = 0;
            }
            int i95 = i94 + i49;
            if (chatData.item != null) {
                i50 = Item.ADAPTER.encodedSizeWithTag(154, chatData.item);
            } else {
                i50 = 0;
            }
            int i96 = i95 + i50;
            if (chatData.team_name != null) {
                i51 = ProtoAdapter.STRING.encodedSizeWithTag(155, chatData.team_name);
            } else {
                i51 = 0;
            }
            int i97 = i96 + i51;
            if (chatData.team_chat_type != null) {
                i52 = TeamChatType.ADAPTER.encodedSizeWithTag(156, chatData.team_chat_type);
            }
            return i97 + i52 + Tag.ADAPTER.asRepeated().encodedSizeWithTag(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, chatData.tags) + chatData.unknownFields().size();
        }

        /* renamed from: a */
        public ChatData decode(ProtoReader protoReader) throws IOException {
            C17098a aVar = new C17098a();
            aVar.f43809a = "";
            aVar.f43810b = "";
            aVar.f43811c = "";
            aVar.f43813e = 0;
            aVar.f43814f = false;
            aVar.f43815g = false;
            aVar.f43819k = "";
            aVar.f43820l = EntityStatus.NORMAL;
            aVar.f43821m = 0L;
            aVar.f43822n = 0L;
            aVar.f43823o = false;
            aVar.f43825q = 0L;
            aVar.f43826r = "";
            aVar.f43827s = "";
            aVar.f43828t = Chat.Type.P2P;
            aVar.f43829u = Chatter.Type.UNKNOWN;
            aVar.f43830v = "";
            aVar.f43831w = false;
            aVar.f43832x = Chat.ChatMode.DEFAULT;
            aVar.f43833y = false;
            aVar.f43783A = "bot";
            aVar.f43784B = 0;
            aVar.f43785C = false;
            aVar.f43786D = false;
            aVar.f43787E = "";
            aVar.f43788F = false;
            aVar.f43789G = "";
            aVar.f43790H = Message.Type.UNKNOWN;
            aVar.f43791I = Content.SystemType.UNKNOWN;
            aVar.f43792J = CardContent.Type.UNKNOWN_TYPE;
            aVar.f43793K = false;
            aVar.f43794L = true;
            aVar.f43795M = "";
            aVar.f43796N = false;
            aVar.f43797O = Chat.Role.IGNORE;
            aVar.f43799Q = false;
            aVar.f43800R = false;
            aVar.f43801S = 0;
            aVar.f43803U = 0;
            aVar.f43807Y = false;
            aVar.f43808Z = false;
            aVar.aa = VideoChatContent.Type.UNKNOWN;
            aVar.ab = false;
            aVar.ac = false;
            aVar.ad = false;
            aVar.af = "";
            aVar.ag = TeamChatType.TEAM_CHAT_TYPE_UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 100) {
                    aVar.f43807Y = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 101) {
                    aVar.f43808Z = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 400) {
                    switch (nextTag) {
                        case 1:
                            aVar.f43809a = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 2:
                            aVar.f43810b = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 3:
                            aVar.f43811c = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 4:
                            aVar.f43812d.add(ProtoAdapter.STRING.decode(protoReader));
                            continue;
                        case 5:
                            aVar.f43813e = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 6:
                            aVar.f43814f = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 7:
                            aVar.f43815g = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 8:
                            aVar.f43816h = DraftPreview.ADAPTER.decode(protoReader);
                            continue;
                        case 9:
                            aVar.f43817i = AtInfo.ADAPTER.decode(protoReader);
                            continue;
                        case 10:
                            aVar.f43818j.add(AtInfo.ADAPTER.decode(protoReader));
                            continue;
                        case 11:
                            aVar.f43819k = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            try {
                                aVar.f43820l = EntityStatus.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 13:
                            aVar.f43821m = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 14:
                            aVar.f43822n = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 15:
                            aVar.f43823o = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 16:
                            aVar.f43824p.add(Message.Reaction.ADAPTER.decode(protoReader));
                            continue;
                        case 17:
                            aVar.f43825q = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 18:
                            aVar.f43826r = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 19:
                            aVar.f43827s = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 20:
                            try {
                                aVar.f43828t = Chat.Type.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 21:
                            try {
                                aVar.f43829u = Chatter.Type.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 22:
                            aVar.f43830v = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 23:
                            aVar.f43831w = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 24:
                            try {
                                aVar.f43832x = Chat.ChatMode.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                            aVar.f43833y = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 26:
                            aVar.f43834z.add(Urgent.ADAPTER.decode(protoReader));
                            continue;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                            aVar.f43783A = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                            aVar.f43784B = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 29:
                            aVar.f43785C = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 30:
                            aVar.f43786D = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                            aVar.f43787E = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        default:
                            switch (nextTag) {
                                case 33:
                                    aVar.f43788F = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 34:
                                    aVar.f43789G = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 35:
                                    try {
                                        aVar.f43790H = Message.Type.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e5.value));
                                        break;
                                    }
                                case 36:
                                    try {
                                        aVar.f43791I = Content.SystemType.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e6.value));
                                        break;
                                    }
                                case 37:
                                    try {
                                        aVar.f43792J = CardContent.Type.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e7.value));
                                        break;
                                    }
                                case 38:
                                    aVar.f43793K = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 39:
                                    aVar.f43794L = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 40:
                                    aVar.f43795M = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 41:
                                    aVar.f43796N = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 42:
                                    try {
                                        aVar.f43797O = Chat.Role.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e8) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e8.value));
                                        break;
                                    }
                                case 43:
                                    aVar.f43798P = Icon.ADAPTER.decode(protoReader);
                                    continue;
                                case 44:
                                    aVar.f43799Q = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 45:
                                    aVar.f43800R = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 46:
                                    aVar.f43801S = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case 47:
                                    aVar.f43802T = UrgentInfo.ADAPTER.decode(protoReader);
                                    continue;
                                case 48:
                                    aVar.f43803U = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case 49:
                                    aVar.f43804V.add(Chatter.ChatterCustomStatus.ADAPTER.decode(protoReader));
                                    continue;
                                case MmListControl.f116813f /*{ENCODED_INT: 50}*/:
                                    aVar.f43805W = FocusInfo.ADAPTER.decode(protoReader);
                                    continue;
                                case 51:
                                    aVar.f43806X = HighPriorityDisplay.ADAPTER.decode(protoReader);
                                    continue;
                                default:
                                    switch (nextTag) {
                                        case 150:
                                            try {
                                                aVar.aa = VideoChatContent.Type.ADAPTER.decode(protoReader);
                                                continue;
                                            } catch (ProtoAdapter.EnumConstantNotFoundException e9) {
                                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e9.value));
                                                break;
                                            }
                                        case 151:
                                            aVar.ab = ProtoAdapter.BOOL.decode(protoReader);
                                            continue;
                                        case 152:
                                            aVar.ac = ProtoAdapter.BOOL.decode(protoReader);
                                            continue;
                                        case 153:
                                            aVar.ad = ProtoAdapter.BOOL.decode(protoReader);
                                            continue;
                                        case 154:
                                            aVar.ae = Item.ADAPTER.decode(protoReader);
                                            continue;
                                        case 155:
                                            aVar.af = ProtoAdapter.STRING.decode(protoReader);
                                            continue;
                                        case 156:
                                            try {
                                                aVar.ag = TeamChatType.ADAPTER.decode(protoReader);
                                                continue;
                                            } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e10.value));
                                                break;
                                            }
                                        default:
                                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                            continue;
                                            continue;
                                            continue;
                                    }
                            }
                    }
                } else {
                    try {
                        aVar.ah.add(Tag.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e11.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ChatData chatData) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, chatData.name);
            if (chatData.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, chatData.avatar_key);
            }
            if (chatData.avatar_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, chatData.avatar_path);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 4, chatData.avatar_urls);
            if (chatData.unread_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, chatData.unread_count);
            }
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, chatData.is_remind);
            if (chatData.is_shortcut != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, chatData.is_shortcut);
            }
            if (chatData.draft_preview != null) {
                DraftPreview.ADAPTER.encodeWithTag(protoWriter, 8, chatData.draft_preview);
            }
            if (chatData.at_info != null) {
                AtInfo.ADAPTER.encodeWithTag(protoWriter, 9, chatData.at_info);
            }
            AtInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 10, chatData.at_infos);
            if (chatData.localized_digest_message != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, chatData.localized_digest_message);
            }
            if (chatData.entity_status != null) {
                EntityStatus.ADAPTER.encodeWithTag(protoWriter, 12, chatData.entity_status);
            }
            if (chatData.display_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 13, chatData.display_time);
            }
            if (chatData.rank_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 14, chatData.rank_time);
            }
            if (chatData.cross_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 15, chatData.cross_tenant);
            }
            Message.Reaction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 16, chatData.reactions);
            if (chatData.do_not_disturb_end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 17, chatData.do_not_disturb_end_time);
            }
            if (chatData.mini_avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 18, chatData.mini_avatar_key);
            }
            if (chatData.original_digest_message != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 19, chatData.original_digest_message);
            }
            if (chatData.chat_type != null) {
                Chat.Type.ADAPTER.encodeWithTag(protoWriter, 20, chatData.chat_type);
            }
            if (chatData.chatter_type != null) {
                Chatter.Type.ADAPTER.encodeWithTag(protoWriter, 21, chatData.chatter_type);
            }
            if (chatData.chatter_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 22, chatData.chatter_id);
            }
            if (chatData.is_crypto != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 23, chatData.is_crypto);
            }
            if (chatData.chat_mode != null) {
                Chat.ChatMode.ADAPTER.encodeWithTag(protoWriter, 24, chatData.chat_mode);
            }
            if (chatData.is_meeting != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 25, chatData.is_meeting);
            }
            Urgent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 26, chatData.urgents);
            if (chatData.with_bot_tag != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 27, chatData.with_bot_tag);
            }
            if (chatData.last_message_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 28, chatData.last_message_position);
            }
            if (chatData.is_department != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 29, chatData.is_department);
            }
            if (chatData.tenant_chat != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 30, chatData.tenant_chat);
            }
            if (chatData.chat_description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 31, chatData.chat_description);
            }
            if (chatData.is_support_view != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 33, chatData.is_support_view);
            }
            if (chatData.oncall_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 34, chatData.oncall_id);
            }
            if (chatData.last_message_type != null) {
                Message.Type.ADAPTER.encodeWithTag(protoWriter, 35, chatData.last_message_type);
            }
            if (chatData.system_message_type != null) {
                Content.SystemType.ADAPTER.encodeWithTag(protoWriter, 36, chatData.system_message_type);
            }
            if (chatData.card_type != null) {
                CardContent.Type.ADAPTER.encodeWithTag(protoWriter, 37, chatData.card_type);
            }
            if (chatData.is_public_v2 != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 38, chatData.is_public_v2);
            }
            if (chatData.is_member != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 39, chatData.is_member);
            }
            if (chatData.last_visible_message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 40, chatData.last_visible_message_id);
            }
            if (chatData.chat_muteable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 41, chatData.chat_muteable);
            }
            if (chatData.chat_role != null) {
                Chat.Role.ADAPTER.encodeWithTag(protoWriter, 42, chatData.chat_role);
            }
            if (chatData.icon != null) {
                Icon.ADAPTER.encodeWithTag(protoWriter, 43, chatData.icon);
            }
            if (chatData.is_edu != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 44, chatData.is_edu);
            }
            if (chatData.is_cross_with_ka != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 45, chatData.is_cross_with_ka);
            }
            if (chatData.user_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 46, chatData.user_count);
            }
            if (chatData.urgent_info != null) {
                UrgentInfo.ADAPTER.encodeWithTag(protoWriter, 47, chatData.urgent_info);
            }
            if (chatData.at_infos_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 48, chatData.at_infos_count);
            }
            Chatter.ChatterCustomStatus.ADAPTER.asRepeated().encodeWithTag(protoWriter, 49, chatData.chatter_status);
            if (chatData.focus_info != null) {
                FocusInfo.ADAPTER.encodeWithTag(protoWriter, 50, chatData.focus_info);
            }
            if (chatData.display != null) {
                HighPriorityDisplay.ADAPTER.encodeWithTag(protoWriter, 51, chatData.display);
            }
            if (chatData.is_official_oncall != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 100, chatData.is_official_oncall);
            }
            if (chatData.is_offline_oncall != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 101, chatData.is_offline_oncall);
            }
            if (chatData.video_chat_type != null) {
                VideoChatContent.Type.ADAPTER.encodeWithTag(protoWriter, 150, chatData.video_chat_type);
            }
            if (chatData.is_voice_call != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 151, chatData.is_voice_call);
            }
            if (chatData.is_my_threads_updated != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 152, chatData.is_my_threads_updated);
            }
            if (chatData.is_super != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 153, chatData.is_super);
            }
            if (chatData.item != null) {
                Item.ADAPTER.encodeWithTag(protoWriter, 154, chatData.item);
            }
            if (chatData.team_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 155, chatData.team_name);
            }
            if (chatData.team_chat_type != null) {
                TeamChatType.ADAPTER.encodeWithTag(protoWriter, 156, chatData.team_chat_type);
            }
            Tag.ADAPTER.asRepeated().encodeWithTag(protoWriter, MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, chatData.tags);
            protoWriter.writeBytes(chatData.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.ChatData$a */
    public static final class C17098a extends Message.Builder<ChatData, C17098a> {

        /* renamed from: A */
        public String f43783A;

        /* renamed from: B */
        public Integer f43784B;

        /* renamed from: C */
        public Boolean f43785C;

        /* renamed from: D */
        public Boolean f43786D;

        /* renamed from: E */
        public String f43787E;

        /* renamed from: F */
        public Boolean f43788F;

        /* renamed from: G */
        public String f43789G;

        /* renamed from: H */
        public Message.Type f43790H;

        /* renamed from: I */
        public Content.SystemType f43791I;

        /* renamed from: J */
        public CardContent.Type f43792J;

        /* renamed from: K */
        public Boolean f43793K;

        /* renamed from: L */
        public Boolean f43794L;

        /* renamed from: M */
        public String f43795M;

        /* renamed from: N */
        public Boolean f43796N;

        /* renamed from: O */
        public Chat.Role f43797O;

        /* renamed from: P */
        public Icon f43798P;

        /* renamed from: Q */
        public Boolean f43799Q;

        /* renamed from: R */
        public Boolean f43800R;

        /* renamed from: S */
        public Integer f43801S;

        /* renamed from: T */
        public UrgentInfo f43802T;

        /* renamed from: U */
        public Integer f43803U;

        /* renamed from: V */
        public List<Chatter.ChatterCustomStatus> f43804V = Internal.newMutableList();

        /* renamed from: W */
        public FocusInfo f43805W;

        /* renamed from: X */
        public HighPriorityDisplay f43806X;

        /* renamed from: Y */
        public Boolean f43807Y;

        /* renamed from: Z */
        public Boolean f43808Z;

        /* renamed from: a */
        public String f43809a;
        public VideoChatContent.Type aa;
        public Boolean ab;
        public Boolean ac;
        public Boolean ad;
        public Item ae;
        public String af;
        public TeamChatType ag;
        public List<Tag> ah = Internal.newMutableList();

        /* renamed from: b */
        public String f43810b;

        /* renamed from: c */
        public String f43811c;

        /* renamed from: d */
        public List<String> f43812d = Internal.newMutableList();

        /* renamed from: e */
        public Integer f43813e;

        /* renamed from: f */
        public Boolean f43814f;

        /* renamed from: g */
        public Boolean f43815g;

        /* renamed from: h */
        public DraftPreview f43816h;

        /* renamed from: i */
        public AtInfo f43817i;

        /* renamed from: j */
        public List<AtInfo> f43818j = Internal.newMutableList();

        /* renamed from: k */
        public String f43819k;

        /* renamed from: l */
        public EntityStatus f43820l;

        /* renamed from: m */
        public Long f43821m;

        /* renamed from: n */
        public Long f43822n;

        /* renamed from: o */
        public Boolean f43823o;

        /* renamed from: p */
        public List<Message.Reaction> f43824p = Internal.newMutableList();

        /* renamed from: q */
        public Long f43825q;

        /* renamed from: r */
        public String f43826r;

        /* renamed from: s */
        public String f43827s;

        /* renamed from: t */
        public Chat.Type f43828t;

        /* renamed from: u */
        public Chatter.Type f43829u;

        /* renamed from: v */
        public String f43830v;

        /* renamed from: w */
        public Boolean f43831w;

        /* renamed from: x */
        public Chat.ChatMode f43832x;

        /* renamed from: y */
        public Boolean f43833y;

        /* renamed from: z */
        public List<Urgent> f43834z = Internal.newMutableList();

        /* renamed from: a */
        public ChatData build() {
            Boolean bool;
            String str = this.f43809a;
            if (str != null && (bool = this.f43814f) != null) {
                return new ChatData(str, this.f43810b, this.f43811c, this.f43812d, this.f43813e, bool, this.f43815g, this.f43816h, this.f43817i, this.f43818j, this.f43819k, this.f43820l, this.f43821m, this.f43822n, this.f43823o, this.f43824p, this.f43825q, this.f43826r, this.f43827s, this.f43828t, this.f43829u, this.f43830v, this.f43831w, this.f43832x, this.f43833y, this.f43834z, this.f43783A, this.f43784B, this.f43785C, this.f43786D, this.f43787E, this.f43788F, this.f43789G, this.f43790H, this.f43791I, this.f43792J, this.f43793K, this.f43794L, this.f43795M, this.f43796N, this.f43797O, this.f43798P, this.f43799Q, this.f43800R, this.f43801S, this.f43802T, this.f43803U, this.f43804V, this.f43805W, this.f43806X, this.f43807Y, this.f43808Z, this.aa, this.ab, this.ac, this.ad, this.ae, this.af, this.ag, this.ah, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "name", this.f43814f, "is_remind");
        }
    }

    @Override // com.squareup.wire.Message
    public C17098a newBuilder() {
        C17098a aVar = new C17098a();
        aVar.f43809a = this.name;
        aVar.f43810b = this.avatar_key;
        aVar.f43811c = this.avatar_path;
        aVar.f43812d = Internal.copyOf("avatar_urls", this.avatar_urls);
        aVar.f43813e = this.unread_count;
        aVar.f43814f = this.is_remind;
        aVar.f43815g = this.is_shortcut;
        aVar.f43816h = this.draft_preview;
        aVar.f43817i = this.at_info;
        aVar.f43818j = Internal.copyOf("at_infos", this.at_infos);
        aVar.f43819k = this.localized_digest_message;
        aVar.f43820l = this.entity_status;
        aVar.f43821m = this.display_time;
        aVar.f43822n = this.rank_time;
        aVar.f43823o = this.cross_tenant;
        aVar.f43824p = Internal.copyOf("reactions", this.reactions);
        aVar.f43825q = this.do_not_disturb_end_time;
        aVar.f43826r = this.mini_avatar_key;
        aVar.f43827s = this.original_digest_message;
        aVar.f43828t = this.chat_type;
        aVar.f43829u = this.chatter_type;
        aVar.f43830v = this.chatter_id;
        aVar.f43831w = this.is_crypto;
        aVar.f43832x = this.chat_mode;
        aVar.f43833y = this.is_meeting;
        aVar.f43834z = Internal.copyOf("urgents", this.urgents);
        aVar.f43783A = this.with_bot_tag;
        aVar.f43784B = this.last_message_position;
        aVar.f43785C = this.is_department;
        aVar.f43786D = this.tenant_chat;
        aVar.f43787E = this.chat_description;
        aVar.f43788F = this.is_support_view;
        aVar.f43789G = this.oncall_id;
        aVar.f43790H = this.last_message_type;
        aVar.f43791I = this.system_message_type;
        aVar.f43792J = this.card_type;
        aVar.f43793K = this.is_public_v2;
        aVar.f43794L = this.is_member;
        aVar.f43795M = this.last_visible_message_id;
        aVar.f43796N = this.chat_muteable;
        aVar.f43797O = this.chat_role;
        aVar.f43798P = this.icon;
        aVar.f43799Q = this.is_edu;
        aVar.f43800R = this.is_cross_with_ka;
        aVar.f43801S = this.user_count;
        aVar.f43802T = this.urgent_info;
        aVar.f43803U = this.at_infos_count;
        aVar.f43804V = Internal.copyOf("chatter_status", this.chatter_status);
        aVar.f43805W = this.focus_info;
        aVar.f43806X = this.display;
        aVar.f43807Y = this.is_official_oncall;
        aVar.f43808Z = this.is_offline_oncall;
        aVar.aa = this.video_chat_type;
        aVar.ab = this.is_voice_call;
        aVar.ac = this.is_my_threads_updated;
        aVar.ad = this.is_super;
        aVar.ae = this.item;
        aVar.af = this.team_name;
        aVar.ag = this.team_chat_type;
        aVar.ah = Internal.copyOf("tags", this.tags);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "ChatData");
        StringBuilder sb = new StringBuilder();
        sb.append(", name=");
        sb.append(this.name);
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.avatar_path != null) {
            sb.append(", avatar_path=");
            sb.append(this.avatar_path);
        }
        if (!this.avatar_urls.isEmpty()) {
            sb.append(", avatar_urls=");
            sb.append(this.avatar_urls);
        }
        if (this.unread_count != null) {
            sb.append(", unread_count=");
            sb.append(this.unread_count);
        }
        sb.append(", is_remind=");
        sb.append(this.is_remind);
        if (this.is_shortcut != null) {
            sb.append(", is_shortcut=");
            sb.append(this.is_shortcut);
        }
        if (this.draft_preview != null) {
            sb.append(", draft_preview=");
            sb.append(this.draft_preview);
        }
        if (this.at_info != null) {
            sb.append(", at_info=");
            sb.append(this.at_info);
        }
        if (!this.at_infos.isEmpty()) {
            sb.append(", at_infos=");
            sb.append(this.at_infos);
        }
        if (this.localized_digest_message != null) {
            sb.append(", localized_digest_message=");
            sb.append(this.localized_digest_message);
        }
        if (this.entity_status != null) {
            sb.append(", entity_status=");
            sb.append(this.entity_status);
        }
        if (this.display_time != null) {
            sb.append(", display_time=");
            sb.append(this.display_time);
        }
        if (this.rank_time != null) {
            sb.append(", rank_time=");
            sb.append(this.rank_time);
        }
        if (this.cross_tenant != null) {
            sb.append(", cross_tenant=");
            sb.append(this.cross_tenant);
        }
        if (!this.reactions.isEmpty()) {
            sb.append(", reactions=");
            sb.append(this.reactions);
        }
        if (this.do_not_disturb_end_time != null) {
            sb.append(", do_not_disturb_end_time=");
            sb.append(this.do_not_disturb_end_time);
        }
        if (this.mini_avatar_key != null) {
            sb.append(", mini_avatar_key=");
            sb.append(this.mini_avatar_key);
        }
        if (this.original_digest_message != null) {
            sb.append(", original_digest_message=");
            sb.append(this.original_digest_message);
        }
        if (this.chat_type != null) {
            sb.append(", chat_type=");
            sb.append(this.chat_type);
        }
        if (this.chatter_type != null) {
            sb.append(", chatter_type=");
            sb.append(this.chatter_type);
        }
        if (this.chatter_id != null) {
            sb.append(", chatter_id=");
            sb.append(this.chatter_id);
        }
        if (this.is_crypto != null) {
            sb.append(", is_crypto=");
            sb.append(this.is_crypto);
        }
        if (this.chat_mode != null) {
            sb.append(", chat_mode=");
            sb.append(this.chat_mode);
        }
        if (this.is_meeting != null) {
            sb.append(", is_meeting=");
            sb.append(this.is_meeting);
        }
        if (!this.urgents.isEmpty()) {
            sb.append(", urgents=");
            sb.append(this.urgents);
        }
        if (this.with_bot_tag != null) {
            sb.append(", with_bot_tag=");
            sb.append(this.with_bot_tag);
        }
        if (this.last_message_position != null) {
            sb.append(", last_message_position=");
            sb.append(this.last_message_position);
        }
        if (this.is_department != null) {
            sb.append(", is_department=");
            sb.append(this.is_department);
        }
        if (this.tenant_chat != null) {
            sb.append(", tenant_chat=");
            sb.append(this.tenant_chat);
        }
        if (this.chat_description != null) {
            sb.append(", chat_description=");
            sb.append(this.chat_description);
        }
        if (this.is_support_view != null) {
            sb.append(", is_support_view=");
            sb.append(this.is_support_view);
        }
        if (this.oncall_id != null) {
            sb.append(", oncall_id=");
            sb.append(this.oncall_id);
        }
        if (this.last_message_type != null) {
            sb.append(", last_message_type=");
            sb.append(this.last_message_type);
        }
        if (this.system_message_type != null) {
            sb.append(", system_message_type=");
            sb.append(this.system_message_type);
        }
        if (this.card_type != null) {
            sb.append(", card_type=");
            sb.append(this.card_type);
        }
        if (this.is_public_v2 != null) {
            sb.append(", is_public_v2=");
            sb.append(this.is_public_v2);
        }
        if (this.is_member != null) {
            sb.append(", is_member=");
            sb.append(this.is_member);
        }
        if (this.last_visible_message_id != null) {
            sb.append(", last_visible_message_id=");
            sb.append(this.last_visible_message_id);
        }
        if (this.chat_muteable != null) {
            sb.append(", chat_muteable=");
            sb.append(this.chat_muteable);
        }
        if (this.chat_role != null) {
            sb.append(", chat_role=");
            sb.append(this.chat_role);
        }
        if (this.icon != null) {
            sb.append(", icon=");
            sb.append(this.icon);
        }
        if (this.is_edu != null) {
            sb.append(", is_edu=");
            sb.append(this.is_edu);
        }
        if (this.is_cross_with_ka != null) {
            sb.append(", is_cross_with_ka=");
            sb.append(this.is_cross_with_ka);
        }
        if (this.user_count != null) {
            sb.append(", user_count=");
            sb.append(this.user_count);
        }
        if (this.urgent_info != null) {
            sb.append(", urgent_info=");
            sb.append(this.urgent_info);
        }
        if (this.at_infos_count != null) {
            sb.append(", at_infos_count=");
            sb.append(this.at_infos_count);
        }
        if (!this.chatter_status.isEmpty()) {
            sb.append(", chatter_status=");
            sb.append(this.chatter_status);
        }
        if (this.focus_info != null) {
            sb.append(", focus_info=");
            sb.append(this.focus_info);
        }
        if (this.display != null) {
            sb.append(", display=");
            sb.append(this.display);
        }
        if (this.is_official_oncall != null) {
            sb.append(", is_official_oncall=");
            sb.append(this.is_official_oncall);
        }
        if (this.is_offline_oncall != null) {
            sb.append(", is_offline_oncall=");
            sb.append(this.is_offline_oncall);
        }
        if (this.video_chat_type != null) {
            sb.append(", video_chat_type=");
            sb.append(this.video_chat_type);
        }
        if (this.is_voice_call != null) {
            sb.append(", is_voice_call=");
            sb.append(this.is_voice_call);
        }
        if (this.is_my_threads_updated != null) {
            sb.append(", is_my_threads_updated=");
            sb.append(this.is_my_threads_updated);
        }
        if (this.is_super != null) {
            sb.append(", is_super=");
            sb.append(this.is_super);
        }
        if (this.item != null) {
            sb.append(", item=");
            sb.append(this.item);
        }
        if (this.team_name != null) {
            sb.append(", team_name=");
            sb.append(this.team_name);
        }
        if (this.team_chat_type != null) {
            sb.append(", team_chat_type=");
            sb.append(this.team_chat_type);
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        StringBuilder replace = sb.replace(0, 2, "ChatData{");
        replace.append('}');
        return replace.toString();
    }

    public ChatData(String str, String str2, String str3, List<String> list, Integer num, Boolean bool, Boolean bool2, DraftPreview draftPreview, AtInfo atInfo, List<AtInfo> list2, String str4, EntityStatus entityStatus, Long l, Long l2, Boolean bool3, List<Message.Reaction> list3, Long l3, String str5, String str6, Chat.Type type, Chatter.Type type2, String str7, Boolean bool4, Chat.ChatMode chatMode, Boolean bool5, List<Urgent> list4, String str8, Integer num2, Boolean bool6, Boolean bool7, String str9, Boolean bool8, String str10, Message.Type type3, Content.SystemType systemType, CardContent.Type type4, Boolean bool9, Boolean bool10, String str11, Boolean bool11, Chat.Role role, Icon icon2, Boolean bool12, Boolean bool13, Integer num3, UrgentInfo urgentInfo, Integer num4, List<Chatter.ChatterCustomStatus> list5, FocusInfo focusInfo, HighPriorityDisplay highPriorityDisplay, Boolean bool14, Boolean bool15, VideoChatContent.Type type5, Boolean bool16, Boolean bool17, Boolean bool18, Item item2, String str12, TeamChatType teamChatType, List<Tag> list6) {
        this(str, str2, str3, list, num, bool, bool2, draftPreview, atInfo, list2, str4, entityStatus, l, l2, bool3, list3, l3, str5, str6, type, type2, str7, bool4, chatMode, bool5, list4, str8, num2, bool6, bool7, str9, bool8, str10, type3, systemType, type4, bool9, bool10, str11, bool11, role, icon2, bool12, bool13, num3, urgentInfo, num4, list5, focusInfo, highPriorityDisplay, bool14, bool15, type5, bool16, bool17, bool18, item2, str12, teamChatType, list6, ByteString.EMPTY);
    }

    public ChatData(String str, String str2, String str3, List<String> list, Integer num, Boolean bool, Boolean bool2, DraftPreview draftPreview, AtInfo atInfo, List<AtInfo> list2, String str4, EntityStatus entityStatus, Long l, Long l2, Boolean bool3, List<Message.Reaction> list3, Long l3, String str5, String str6, Chat.Type type, Chatter.Type type2, String str7, Boolean bool4, Chat.ChatMode chatMode, Boolean bool5, List<Urgent> list4, String str8, Integer num2, Boolean bool6, Boolean bool7, String str9, Boolean bool8, String str10, Message.Type type3, Content.SystemType systemType, CardContent.Type type4, Boolean bool9, Boolean bool10, String str11, Boolean bool11, Chat.Role role, Icon icon2, Boolean bool12, Boolean bool13, Integer num3, UrgentInfo urgentInfo, Integer num4, List<Chatter.ChatterCustomStatus> list5, FocusInfo focusInfo, HighPriorityDisplay highPriorityDisplay, Boolean bool14, Boolean bool15, VideoChatContent.Type type5, Boolean bool16, Boolean bool17, Boolean bool18, Item item2, String str12, TeamChatType teamChatType, List<Tag> list6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.avatar_key = str2;
        this.avatar_path = str3;
        this.avatar_urls = Internal.immutableCopyOf("avatar_urls", list);
        this.unread_count = num;
        this.is_remind = bool;
        this.is_shortcut = bool2;
        this.draft_preview = draftPreview;
        this.at_info = atInfo;
        this.at_infos = Internal.immutableCopyOf("at_infos", list2);
        this.localized_digest_message = str4;
        this.entity_status = entityStatus;
        this.display_time = l;
        this.rank_time = l2;
        this.cross_tenant = bool3;
        this.reactions = Internal.immutableCopyOf("reactions", list3);
        this.do_not_disturb_end_time = l3;
        this.mini_avatar_key = str5;
        this.original_digest_message = str6;
        this.chat_type = type;
        this.chatter_type = type2;
        this.chatter_id = str7;
        this.is_crypto = bool4;
        this.chat_mode = chatMode;
        this.is_meeting = bool5;
        this.urgents = Internal.immutableCopyOf("urgents", list4);
        this.with_bot_tag = str8;
        this.last_message_position = num2;
        this.is_department = bool6;
        this.tenant_chat = bool7;
        this.chat_description = str9;
        this.is_support_view = bool8;
        this.oncall_id = str10;
        this.last_message_type = type3;
        this.system_message_type = systemType;
        this.card_type = type4;
        this.is_public_v2 = bool9;
        this.is_member = bool10;
        this.last_visible_message_id = str11;
        this.chat_muteable = bool11;
        this.chat_role = role;
        this.icon = icon2;
        this.is_edu = bool12;
        this.is_cross_with_ka = bool13;
        this.user_count = num3;
        this.urgent_info = urgentInfo;
        this.at_infos_count = num4;
        this.chatter_status = Internal.immutableCopyOf("chatter_status", list5);
        this.focus_info = focusInfo;
        this.display = highPriorityDisplay;
        this.is_official_oncall = bool14;
        this.is_offline_oncall = bool15;
        this.video_chat_type = type5;
        this.is_voice_call = bool16;
        this.is_my_threads_updated = bool17;
        this.is_super = bool18;
        this.item = item2;
        this.team_name = str12;
        this.team_chat_type = teamChatType;
        this.tags = Internal.immutableCopyOf("tags", list6);
    }
}
