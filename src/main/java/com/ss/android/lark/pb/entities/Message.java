package com.ss.android.lark.pb.entities;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class Message extends com.squareup.wire.Message<Message, C49734a> {
    public static final ProtoAdapter<Message> ADAPTER = new C49735b();
    public static final Integer DEFAULT_BADGE_COUNT = 0;
    public static final ByteString DEFAULT_CONTENT = ByteString.EMPTY;
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Boolean DEFAULT_IS_AUTO_TRANSLATED_BY_RECEIVER = false;
    public static final Boolean DEFAULT_IS_BADGED = false;
    public static final Boolean DEFAULT_IS_BATCH_COPY_MESSAGES = false;
    public static final Boolean DEFAULT_IS_DING = false;
    public static final Boolean DEFAULT_IS_NOTIFIED = false;
    public static final Boolean DEFAULT_IS_NO_TRACE_REMOVED = false;
    public static final Boolean DEFAULT_IS_REMOVED = false;
    public static final Boolean DEFAULT_IS_SPECIAL_FOCUS = false;
    public static final Boolean DEFAULT_IS_STATIC_RESOURCE_MESSAGE_DELETED = false;
    public static final Boolean DEFAULT_IS_TRUNCATED = false;
    public static final Boolean DEFAULT_IS_VISIBLE = true;
    public static final Boolean DEFAULT_IS_VISIBLE_V2 = true;
    public static final Long DEFAULT_LAST_MODIFY_TIME = 0L;
    public static final Long DEFAULT_MESSAGE_PIPE_VERSION = 0L;
    public static final Integer DEFAULT_NO_BADGED_COUNT = 0;
    public static final Integer DEFAULT_POSITION = 0;
    public static final Long DEFAULT_REMOVER_ID = 0L;
    public static final Boolean DEFAULT_SEND_TO_CHAT = false;
    public static final Integer DEFAULT_THREAD_BADGE_COUNT = 0;
    public static final Integer DEFAULT_THREAD_POSITION = 0;
    public static final Integer DEFAULT_THREAD_REPLY_COUNT = 0;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final AnonymousInfo manonymous_info;
    public final List<String> mat_out_chatter_ids;
    public final Integer mbadge_count;
    public final String mchannel_id;
    public final ChannelType mchannel_type;
    public final String mchat_id;
    public final ChatType mchat_type;
    public final String mcid;
    public final ByteString mcontent;
    public final Long mcreate_time;
    public final CryptoInfo mcrypto_info;
    public final String mfrom_id;
    public final FromType mfrom_type;
    public final I18nInfo mi18n_info;
    public final String mid;
    public final Map<String, ImageTranslationAbility> mimages_translation_ability;
    public final Map<String, ImageTranslationAbilityV2> mimages_translation_ability_v2;
    public final Boolean mis_auto_translated_by_receiver;
    public final Boolean mis_badged;
    public final Boolean mis_batch_copy_messages;
    public final Boolean mis_ding;
    public final Boolean mis_no_trace_removed;
    public final Boolean mis_notified;
    public final Boolean mis_removed;
    public final Boolean mis_special_focus;
    public final Boolean mis_static_resource_message_deleted;
    public final Boolean mis_truncated;
    public final Boolean mis_visible;
    public final Boolean mis_visible_v2;
    public final Long mlast_modify_time;
    public final String mmessage_language;
    public final Long mmessage_pipe_version;
    public final Integer mno_badged_count;
    public final String moriginal_sender_id;
    public final String mparent_id;
    public final String mparent_source_message_id;
    public final Integer mposition;
    public final Long mremover_id;
    public final RemoverType mremover_type;
    public final String mreply_count;
    public final String mroot_id;
    public final String mroot_source_message_id;
    public final Boolean msend_to_chat;
    public final MessageSensitivity msensitivity;
    public final Status mstatus;
    public final Integer mthread_badge_count;
    public final String mthread_id;
    public final Integer mthread_position;
    public final Integer mthread_reply_count;
    public final String mtranslate_language;
    public final TranslateMessageDisplayRule mtranslate_message_display_rule;
    public final TranslateSource mtranslate_source;
    public final Type mtype;
    public final Long mupdate_time;
    public final Map<String, UrlPreviewHangPoint> murl_preview_hang_point_map;
    public final Version mversion;

    public enum ChatType implements WireEnum {
        UNKNOWN_CHAT_TYPE(0),
        P2P(1),
        GROUP(2),
        TOPIC_GROUP(3);
        
        public static final ProtoAdapter<ChatType> ADAPTER = ProtoAdapter.newEnumAdapter(ChatType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ChatType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_CHAT_TYPE;
            }
            if (i == 1) {
                return P2P;
            }
            if (i == 2) {
                return GROUP;
            }
            if (i != 3) {
                return null;
            }
            return TOPIC_GROUP;
        }

        private ChatType(int i) {
            this.value = i;
        }
    }

    public enum FromType implements WireEnum {
        USER(1),
        BOT(2);
        
        public static final ProtoAdapter<FromType> ADAPTER = ProtoAdapter.newEnumAdapter(FromType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static FromType fromValue(int i) {
            if (i == 1) {
                return USER;
            }
            if (i != 2) {
                return null;
            }
            return BOT;
        }

        private FromType(int i) {
            this.value = i;
        }
    }

    public enum MessageSensitivity implements WireEnum {
        UNKNOWN_SENSITIVITY(0),
        SAFE(1),
        DANGEROUS(2);
        
        public static final ProtoAdapter<MessageSensitivity> ADAPTER = ProtoAdapter.newEnumAdapter(MessageSensitivity.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static MessageSensitivity fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_SENSITIVITY;
            }
            if (i == 1) {
                return SAFE;
            }
            if (i != 2) {
                return null;
            }
            return DANGEROUS;
        }

        private MessageSensitivity(int i) {
            this.value = i;
        }
    }

    public enum RemoverType implements WireEnum {
        UNKNOWN_REMOVERTYPE(0),
        GROUPOWNER(1),
        SYSADMIN(2),
        GROUPADMIN(3);
        
        public static final ProtoAdapter<RemoverType> ADAPTER = ProtoAdapter.newEnumAdapter(RemoverType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static RemoverType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_REMOVERTYPE;
            }
            if (i == 1) {
                return GROUPOWNER;
            }
            if (i == 2) {
                return SYSADMIN;
            }
            if (i != 3) {
                return null;
            }
            return GROUPADMIN;
        }

        private RemoverType(int i) {
            this.value = i;
        }
    }

    public enum Status implements WireEnum {
        UNKNOWN_STATUS(0),
        NORMAL(1),
        DELETED(2),
        MODIFIED(3);
        
        public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_STATUS;
            }
            if (i == 1) {
                return NORMAL;
            }
            if (i == 2) {
                return DELETED;
            }
            if (i != 3) {
                return null;
            }
            return MODIFIED;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    public enum Type implements WireEnum {
        UNKNOWN(0),
        POST(2),
        FILE(3),
        TEXT(4),
        IMAGE(5),
        SYSTEM(6),
        AUDIO(7),
        EMAIL(8),
        SHARE_GROUP_CHAT(9),
        STICKER(10),
        MERGE_FORWARD(11),
        CALENDAR(12),
        CLOUD_FILE(13),
        CARD(14),
        MEDIA(15),
        SHARE_CALENDAR_EVENT(16),
        HONGBAO(17),
        GENERAL_CALENDAR(18),
        VIDEO_CHAT(19),
        LOCATION(20),
        COMMERCIALIZED_HONGBAO(22),
        SHARE_USER_CARD(23),
        TODO(24),
        FOLDER(25);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                case 21:
                default:
                    return null;
                case 2:
                    return POST;
                case 3:
                    return FILE;
                case 4:
                    return TEXT;
                case 5:
                    return IMAGE;
                case 6:
                    return SYSTEM;
                case 7:
                    return AUDIO;
                case 8:
                    return EMAIL;
                case 9:
                    return SHARE_GROUP_CHAT;
                case 10:
                    return STICKER;
                case 11:
                    return MERGE_FORWARD;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return CALENDAR;
                case 13:
                    return CLOUD_FILE;
                case 14:
                    return CARD;
                case 15:
                    return MEDIA;
                case 16:
                    return SHARE_CALENDAR_EVENT;
                case 17:
                    return HONGBAO;
                case 18:
                    return GENERAL_CALENDAR;
                case 19:
                    return VIDEO_CHAT;
                case 20:
                    return LOCATION;
                case 22:
                    return COMMERCIALIZED_HONGBAO;
                case 23:
                    return SHARE_USER_CARD;
                case 24:
                    return TODO;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                    return FOLDER;
            }
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.Message$b */
    private static final class C49735b extends ProtoAdapter<Message> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, ImageTranslationAbility>> f124563a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ImageTranslationAbility.ADAPTER);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, ImageTranslationAbilityV2>> f124564b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ImageTranslationAbilityV2.ADAPTER);

        /* renamed from: c */
        private final ProtoAdapter<Map<String, UrlPreviewHangPoint>> f124565c = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, UrlPreviewHangPoint.ADAPTER);

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Message message) throws IOException {
            if (message.mid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, message.mid);
            }
            if (message.mtype != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 2, message.mtype);
            }
            if (message.mfrom_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, message.mfrom_id);
            }
            if (message.mcreate_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, message.mcreate_time);
            }
            if (message.mcontent != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 5, message.mcontent);
            }
            if (message.mstatus != null) {
                Status.ADAPTER.encodeWithTag(protoWriter, 6, message.mstatus);
            }
            if (message.mfrom_type != null) {
                FromType.ADAPTER.encodeWithTag(protoWriter, 7, message.mfrom_type);
            }
            if (message.mroot_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, message.mroot_id);
            }
            if (message.mparent_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, message.mparent_id);
            }
            if (message.mchat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, message.mchat_id);
            }
            if (message.mlast_modify_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 11, message.mlast_modify_time);
            }
            if (message.mcid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, message.mcid);
            }
            if (message.mposition != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 13, message.mposition);
            }
            if (message.mupdate_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 14, message.mupdate_time);
            }
            if (message.mis_notified != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 15, message.mis_notified);
            }
            if (message.mreply_count != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 16, message.mreply_count);
            }
            if (message.mparent_source_message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 17, message.mparent_source_message_id);
            }
            if (message.mroot_source_message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 18, message.mroot_source_message_id);
            }
            if (message.mis_ding != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 19, message.mis_ding);
            }
            if (message.mthread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 20, message.mthread_id);
            }
            if (message.msend_to_chat != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 21, message.msend_to_chat);
            }
            if (message.mis_truncated != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 22, message.mis_truncated);
            }
            if (message.mis_removed != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 23, message.mis_removed);
            }
            if (message.mchannel_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 24, message.mchannel_id);
            }
            if (message.mchannel_type != null) {
                ChannelType.ADAPTER.encodeWithTag(protoWriter, 25, message.mchannel_type);
            }
            if (message.mis_visible != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 26, message.mis_visible);
            }
            if (message.mcrypto_info != null) {
                CryptoInfo.ADAPTER.encodeWithTag(protoWriter, 27, message.mcrypto_info);
            }
            if (message.mthread_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 28, message.mthread_position);
            }
            if (message.mremover_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 29, message.mremover_id);
            }
            if (message.mtranslate_language != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 30, message.mtranslate_language);
            }
            if (message.mremover_type != null) {
                RemoverType.ADAPTER.encodeWithTag(protoWriter, 31, message.mremover_type);
            }
            if (message.mi18n_info != null) {
                I18nInfo.ADAPTER.encodeWithTag(protoWriter, 32, message.mi18n_info);
            }
            if (message.mno_badged_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 33, message.mno_badged_count);
            }
            if (message.mis_badged != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 34, message.mis_badged);
            }
            if (message.mbadge_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 35, message.mbadge_count);
            }
            if (message.mthread_badge_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 36, message.mthread_badge_count);
            }
            if (message.mthread_reply_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 37, message.mthread_reply_count);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 38, message.mat_out_chatter_ids);
            if (message.mmessage_language != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 39, message.mmessage_language);
            }
            if (message.mtranslate_message_display_rule != null) {
                TranslateMessageDisplayRule.ADAPTER.encodeWithTag(protoWriter, 40, message.mtranslate_message_display_rule);
            }
            if (message.mis_no_trace_removed != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 41, message.mis_no_trace_removed);
            }
            if (message.mis_auto_translated_by_receiver != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 42, message.mis_auto_translated_by_receiver);
            }
            if (message.msensitivity != null) {
                MessageSensitivity.ADAPTER.encodeWithTag(protoWriter, 43, message.msensitivity);
            }
            if (message.mis_visible_v2 != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 44, message.mis_visible_v2);
            }
            if (message.mtranslate_source != null) {
                TranslateSource.ADAPTER.encodeWithTag(protoWriter, 45, message.mtranslate_source);
            }
            if (message.mchat_type != null) {
                ChatType.ADAPTER.encodeWithTag(protoWriter, 46, message.mchat_type);
            }
            if (message.moriginal_sender_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 47, message.moriginal_sender_id);
            }
            if (message.mis_static_resource_message_deleted != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 48, message.mis_static_resource_message_deleted);
            }
            this.f124563a.encodeWithTag(protoWriter, 49, message.mimages_translation_ability);
            if (message.mversion != null) {
                Version.ADAPTER.encodeWithTag(protoWriter, 50, message.mversion);
            }
            this.f124564b.encodeWithTag(protoWriter, 51, message.mimages_translation_ability_v2);
            if (message.mmessage_pipe_version != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 52, message.mmessage_pipe_version);
            }
            if (message.mis_batch_copy_messages != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 53, message.mis_batch_copy_messages);
            }
            if (message.manonymous_info != null) {
                AnonymousInfo.ADAPTER.encodeWithTag(protoWriter, 54, message.manonymous_info);
            }
            this.f124565c.encodeWithTag(protoWriter, 55, message.murl_preview_hang_point_map);
            if (message.mis_special_focus != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 56, message.mis_special_focus);
            }
            protoWriter.writeBytes(message.unknownFields());
        }

        C49735b() {
            super(FieldEncoding.LENGTH_DELIMITED, Message.class);
        }

        /* renamed from: a */
        public int encodedSize(Message message) {
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
            int i52 = 0;
            if (message.mid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, message.mid);
            } else {
                i = 0;
            }
            if (message.mtype != null) {
                i2 = Type.ADAPTER.encodedSizeWithTag(2, message.mtype);
            } else {
                i2 = 0;
            }
            int i53 = i + i2;
            if (message.mfrom_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, message.mfrom_id);
            } else {
                i3 = 0;
            }
            int i54 = i53 + i3;
            if (message.mcreate_time != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, message.mcreate_time);
            } else {
                i4 = 0;
            }
            int i55 = i54 + i4;
            if (message.mcontent != null) {
                i5 = ProtoAdapter.BYTES.encodedSizeWithTag(5, message.mcontent);
            } else {
                i5 = 0;
            }
            int i56 = i55 + i5;
            if (message.mstatus != null) {
                i6 = Status.ADAPTER.encodedSizeWithTag(6, message.mstatus);
            } else {
                i6 = 0;
            }
            int i57 = i56 + i6;
            if (message.mfrom_type != null) {
                i7 = FromType.ADAPTER.encodedSizeWithTag(7, message.mfrom_type);
            } else {
                i7 = 0;
            }
            int i58 = i57 + i7;
            if (message.mroot_id != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(8, message.mroot_id);
            } else {
                i8 = 0;
            }
            int i59 = i58 + i8;
            if (message.mparent_id != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(9, message.mparent_id);
            } else {
                i9 = 0;
            }
            int i60 = i59 + i9;
            if (message.mchat_id != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(10, message.mchat_id);
            } else {
                i10 = 0;
            }
            int i61 = i60 + i10;
            if (message.mlast_modify_time != null) {
                i11 = ProtoAdapter.INT64.encodedSizeWithTag(11, message.mlast_modify_time);
            } else {
                i11 = 0;
            }
            int i62 = i61 + i11;
            if (message.mcid != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(12, message.mcid);
            } else {
                i12 = 0;
            }
            int i63 = i62 + i12;
            if (message.mposition != null) {
                i13 = ProtoAdapter.INT32.encodedSizeWithTag(13, message.mposition);
            } else {
                i13 = 0;
            }
            int i64 = i63 + i13;
            if (message.mupdate_time != null) {
                i14 = ProtoAdapter.INT64.encodedSizeWithTag(14, message.mupdate_time);
            } else {
                i14 = 0;
            }
            int i65 = i64 + i14;
            if (message.mis_notified != null) {
                i15 = ProtoAdapter.BOOL.encodedSizeWithTag(15, message.mis_notified);
            } else {
                i15 = 0;
            }
            int i66 = i65 + i15;
            if (message.mreply_count != null) {
                i16 = ProtoAdapter.STRING.encodedSizeWithTag(16, message.mreply_count);
            } else {
                i16 = 0;
            }
            int i67 = i66 + i16;
            if (message.mparent_source_message_id != null) {
                i17 = ProtoAdapter.STRING.encodedSizeWithTag(17, message.mparent_source_message_id);
            } else {
                i17 = 0;
            }
            int i68 = i67 + i17;
            if (message.mroot_source_message_id != null) {
                i18 = ProtoAdapter.STRING.encodedSizeWithTag(18, message.mroot_source_message_id);
            } else {
                i18 = 0;
            }
            int i69 = i68 + i18;
            if (message.mis_ding != null) {
                i19 = ProtoAdapter.BOOL.encodedSizeWithTag(19, message.mis_ding);
            } else {
                i19 = 0;
            }
            int i70 = i69 + i19;
            if (message.mthread_id != null) {
                i20 = ProtoAdapter.STRING.encodedSizeWithTag(20, message.mthread_id);
            } else {
                i20 = 0;
            }
            int i71 = i70 + i20;
            if (message.msend_to_chat != null) {
                i21 = ProtoAdapter.BOOL.encodedSizeWithTag(21, message.msend_to_chat);
            } else {
                i21 = 0;
            }
            int i72 = i71 + i21;
            if (message.mis_truncated != null) {
                i22 = ProtoAdapter.BOOL.encodedSizeWithTag(22, message.mis_truncated);
            } else {
                i22 = 0;
            }
            int i73 = i72 + i22;
            if (message.mis_removed != null) {
                i23 = ProtoAdapter.BOOL.encodedSizeWithTag(23, message.mis_removed);
            } else {
                i23 = 0;
            }
            int i74 = i73 + i23;
            if (message.mchannel_id != null) {
                i24 = ProtoAdapter.STRING.encodedSizeWithTag(24, message.mchannel_id);
            } else {
                i24 = 0;
            }
            int i75 = i74 + i24;
            if (message.mchannel_type != null) {
                i25 = ChannelType.ADAPTER.encodedSizeWithTag(25, message.mchannel_type);
            } else {
                i25 = 0;
            }
            int i76 = i75 + i25;
            if (message.mis_visible != null) {
                i26 = ProtoAdapter.BOOL.encodedSizeWithTag(26, message.mis_visible);
            } else {
                i26 = 0;
            }
            int i77 = i76 + i26;
            if (message.mcrypto_info != null) {
                i27 = CryptoInfo.ADAPTER.encodedSizeWithTag(27, message.mcrypto_info);
            } else {
                i27 = 0;
            }
            int i78 = i77 + i27;
            if (message.mthread_position != null) {
                i28 = ProtoAdapter.INT32.encodedSizeWithTag(28, message.mthread_position);
            } else {
                i28 = 0;
            }
            int i79 = i78 + i28;
            if (message.mremover_id != null) {
                i29 = ProtoAdapter.INT64.encodedSizeWithTag(29, message.mremover_id);
            } else {
                i29 = 0;
            }
            int i80 = i79 + i29;
            if (message.mtranslate_language != null) {
                i30 = ProtoAdapter.STRING.encodedSizeWithTag(30, message.mtranslate_language);
            } else {
                i30 = 0;
            }
            int i81 = i80 + i30;
            if (message.mremover_type != null) {
                i31 = RemoverType.ADAPTER.encodedSizeWithTag(31, message.mremover_type);
            } else {
                i31 = 0;
            }
            int i82 = i81 + i31;
            if (message.mi18n_info != null) {
                i32 = I18nInfo.ADAPTER.encodedSizeWithTag(32, message.mi18n_info);
            } else {
                i32 = 0;
            }
            int i83 = i82 + i32;
            if (message.mno_badged_count != null) {
                i33 = ProtoAdapter.INT32.encodedSizeWithTag(33, message.mno_badged_count);
            } else {
                i33 = 0;
            }
            int i84 = i83 + i33;
            if (message.mis_badged != null) {
                i34 = ProtoAdapter.BOOL.encodedSizeWithTag(34, message.mis_badged);
            } else {
                i34 = 0;
            }
            int i85 = i84 + i34;
            if (message.mbadge_count != null) {
                i35 = ProtoAdapter.INT32.encodedSizeWithTag(35, message.mbadge_count);
            } else {
                i35 = 0;
            }
            int i86 = i85 + i35;
            if (message.mthread_badge_count != null) {
                i36 = ProtoAdapter.INT32.encodedSizeWithTag(36, message.mthread_badge_count);
            } else {
                i36 = 0;
            }
            int i87 = i86 + i36;
            if (message.mthread_reply_count != null) {
                i37 = ProtoAdapter.INT32.encodedSizeWithTag(37, message.mthread_reply_count);
            } else {
                i37 = 0;
            }
            int encodedSizeWithTag = i87 + i37 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(38, message.mat_out_chatter_ids);
            if (message.mmessage_language != null) {
                i38 = ProtoAdapter.STRING.encodedSizeWithTag(39, message.mmessage_language);
            } else {
                i38 = 0;
            }
            int i88 = encodedSizeWithTag + i38;
            if (message.mtranslate_message_display_rule != null) {
                i39 = TranslateMessageDisplayRule.ADAPTER.encodedSizeWithTag(40, message.mtranslate_message_display_rule);
            } else {
                i39 = 0;
            }
            int i89 = i88 + i39;
            if (message.mis_no_trace_removed != null) {
                i40 = ProtoAdapter.BOOL.encodedSizeWithTag(41, message.mis_no_trace_removed);
            } else {
                i40 = 0;
            }
            int i90 = i89 + i40;
            if (message.mis_auto_translated_by_receiver != null) {
                i41 = ProtoAdapter.BOOL.encodedSizeWithTag(42, message.mis_auto_translated_by_receiver);
            } else {
                i41 = 0;
            }
            int i91 = i90 + i41;
            if (message.msensitivity != null) {
                i42 = MessageSensitivity.ADAPTER.encodedSizeWithTag(43, message.msensitivity);
            } else {
                i42 = 0;
            }
            int i92 = i91 + i42;
            if (message.mis_visible_v2 != null) {
                i43 = ProtoAdapter.BOOL.encodedSizeWithTag(44, message.mis_visible_v2);
            } else {
                i43 = 0;
            }
            int i93 = i92 + i43;
            if (message.mtranslate_source != null) {
                i44 = TranslateSource.ADAPTER.encodedSizeWithTag(45, message.mtranslate_source);
            } else {
                i44 = 0;
            }
            int i94 = i93 + i44;
            if (message.mchat_type != null) {
                i45 = ChatType.ADAPTER.encodedSizeWithTag(46, message.mchat_type);
            } else {
                i45 = 0;
            }
            int i95 = i94 + i45;
            if (message.moriginal_sender_id != null) {
                i46 = ProtoAdapter.STRING.encodedSizeWithTag(47, message.moriginal_sender_id);
            } else {
                i46 = 0;
            }
            int i96 = i95 + i46;
            if (message.mis_static_resource_message_deleted != null) {
                i47 = ProtoAdapter.BOOL.encodedSizeWithTag(48, message.mis_static_resource_message_deleted);
            } else {
                i47 = 0;
            }
            int encodedSizeWithTag2 = i96 + i47 + this.f124563a.encodedSizeWithTag(49, message.mimages_translation_ability);
            if (message.mversion != null) {
                i48 = Version.ADAPTER.encodedSizeWithTag(50, message.mversion);
            } else {
                i48 = 0;
            }
            int encodedSizeWithTag3 = encodedSizeWithTag2 + i48 + this.f124564b.encodedSizeWithTag(51, message.mimages_translation_ability_v2);
            if (message.mmessage_pipe_version != null) {
                i49 = ProtoAdapter.INT64.encodedSizeWithTag(52, message.mmessage_pipe_version);
            } else {
                i49 = 0;
            }
            int i97 = encodedSizeWithTag3 + i49;
            if (message.mis_batch_copy_messages != null) {
                i50 = ProtoAdapter.BOOL.encodedSizeWithTag(53, message.mis_batch_copy_messages);
            } else {
                i50 = 0;
            }
            int i98 = i97 + i50;
            if (message.manonymous_info != null) {
                i51 = AnonymousInfo.ADAPTER.encodedSizeWithTag(54, message.manonymous_info);
            } else {
                i51 = 0;
            }
            int encodedSizeWithTag4 = i98 + i51 + this.f124565c.encodedSizeWithTag(55, message.murl_preview_hang_point_map);
            if (message.mis_special_focus != null) {
                i52 = ProtoAdapter.BOOL.encodedSizeWithTag(56, message.mis_special_focus);
            }
            return encodedSizeWithTag4 + i52 + message.unknownFields().size();
        }

        /* renamed from: a */
        public Message decode(ProtoReader protoReader) throws IOException {
            C49734a aVar = new C49734a();
            aVar.f124537a = "";
            aVar.f124539c = "";
            aVar.f124540d = 0L;
            aVar.f124541e = ByteString.EMPTY;
            aVar.f124544h = "";
            aVar.f124545i = "";
            aVar.f124546j = "";
            aVar.f124547k = 0L;
            aVar.f124548l = "";
            aVar.f124549m = 0;
            aVar.f124550n = 0L;
            aVar.f124551o = false;
            aVar.f124552p = "";
            aVar.f124553q = "";
            aVar.f124554r = "";
            aVar.f124555s = false;
            aVar.f124556t = "";
            aVar.f124557u = false;
            aVar.f124558v = false;
            aVar.f124559w = false;
            aVar.f124560x = "";
            aVar.f124562z = true;
            aVar.f124512B = 0;
            aVar.f124513C = 0L;
            aVar.f124514D = "";
            aVar.f124517G = 0;
            aVar.f124518H = false;
            aVar.f124519I = 0;
            aVar.f124520J = 0;
            aVar.f124521K = 0;
            aVar.f124523M = "";
            aVar.f124525O = false;
            aVar.f124526P = false;
            aVar.f124528R = true;
            aVar.f124531U = "";
            aVar.f124532V = false;
            aVar.f124536Z = 0L;
            aVar.aa = false;
            aVar.ad = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124537a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f124538b = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f124539c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f124540d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f124541e = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case 6:
                            try {
                                aVar.f124542f = Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 7:
                            try {
                                aVar.f124543g = FromType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 8:
                            aVar.f124544h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f124545i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f124546j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f124547k = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f124548l = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 13:
                            aVar.f124549m = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 14:
                            aVar.f124550n = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 15:
                            aVar.f124551o = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 16:
                            aVar.f124552p = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 17:
                            aVar.f124553q = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 18:
                            aVar.f124554r = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 19:
                            aVar.f124555s = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 20:
                            aVar.f124556t = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 21:
                            aVar.f124557u = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 22:
                            aVar.f124558v = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 23:
                            aVar.f124559w = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 24:
                            aVar.f124560x = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                            try {
                                aVar.f124561y = ChannelType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
                        case 26:
                            aVar.f124562z = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                            aVar.f124511A = CryptoInfo.ADAPTER.decode(protoReader);
                            break;
                        case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                            aVar.f124512B = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 29:
                            aVar.f124513C = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 30:
                            aVar.f124514D = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                            try {
                                aVar.f124515E = RemoverType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e5.value));
                                break;
                            }
                        case 32:
                            aVar.f124516F = I18nInfo.ADAPTER.decode(protoReader);
                            break;
                        case 33:
                            aVar.f124517G = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 34:
                            aVar.f124518H = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 35:
                            aVar.f124519I = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 36:
                            aVar.f124520J = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 37:
                            aVar.f124521K = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 38:
                            aVar.f124522L.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 39:
                            aVar.f124523M = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 40:
                            aVar.f124524N = TranslateMessageDisplayRule.ADAPTER.decode(protoReader);
                            break;
                        case 41:
                            aVar.f124525O = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 42:
                            aVar.f124526P = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 43:
                            try {
                                aVar.f124527Q = MessageSensitivity.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e6.value));
                                break;
                            }
                        case 44:
                            aVar.f124528R = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 45:
                            try {
                                aVar.f124529S = TranslateSource.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e7.value));
                                break;
                            }
                        case 46:
                            try {
                                aVar.f124530T = ChatType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e8) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e8.value));
                                break;
                            }
                        case 47:
                            aVar.f124531U = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 48:
                            aVar.f124532V = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 49:
                            aVar.f124533W.putAll(this.f124563a.decode(protoReader));
                            break;
                        case MmListControl.f116813f:
                            aVar.f124534X = Version.ADAPTER.decode(protoReader);
                            break;
                        case 51:
                            aVar.f124535Y.putAll(this.f124564b.decode(protoReader));
                            break;
                        case 52:
                            aVar.f124536Z = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 53:
                            aVar.aa = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 54:
                            aVar.ab = AnonymousInfo.ADAPTER.decode(protoReader);
                            break;
                        case 55:
                            aVar.ac.putAll(this.f124565c.decode(protoReader));
                            break;
                        case 56:
                            aVar.ad = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }
    }

    public static final class AnonymousInfo extends com.squareup.wire.Message<AnonymousInfo, C49730a> {
        public static final ProtoAdapter<AnonymousInfo> ADAPTER = new C49731b();
        public static final Boolean DEFAULT_IS_ANONYMOUS = false;
        public static final Boolean DEFAULT_IS_SENDER = false;
        private static final long serialVersionUID = 0;
        public final String manonymous_chatter_id;
        public final Boolean mis_anonymous;
        public final Boolean mis_sender;

        /* renamed from: com.ss.android.lark.pb.entities.Message$AnonymousInfo$b */
        private static final class C49731b extends ProtoAdapter<AnonymousInfo> {
            C49731b() {
                super(FieldEncoding.LENGTH_DELIMITED, AnonymousInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(AnonymousInfo anonymousInfo) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, anonymousInfo.mis_anonymous);
                int i2 = 0;
                if (anonymousInfo.mis_sender != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(2, anonymousInfo.mis_sender);
                } else {
                    i = 0;
                }
                int i3 = encodedSizeWithTag + i;
                if (anonymousInfo.manonymous_chatter_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, anonymousInfo.manonymous_chatter_id);
                }
                return i3 + i2 + anonymousInfo.unknownFields().size();
            }

            /* renamed from: a */
            public AnonymousInfo decode(ProtoReader protoReader) throws IOException {
                C49730a aVar = new C49730a();
                aVar.f124507a = false;
                aVar.f124508b = false;
                aVar.f124509c = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f124507a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f124508b = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f124509c = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AnonymousInfo anonymousInfo) throws IOException {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, anonymousInfo.mis_anonymous);
                if (anonymousInfo.mis_sender != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, anonymousInfo.mis_sender);
                }
                if (anonymousInfo.manonymous_chatter_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, anonymousInfo.manonymous_chatter_id);
                }
                protoWriter.writeBytes(anonymousInfo.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49730a newBuilder() {
            C49730a aVar = new C49730a();
            aVar.f124507a = this.mis_anonymous;
            aVar.f124508b = this.mis_sender;
            aVar.f124509c = this.manonymous_chatter_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.ss.android.lark.pb.entities.Message$AnonymousInfo$a */
        public static final class C49730a extends Message.Builder<AnonymousInfo, C49730a> {

            /* renamed from: a */
            public Boolean f124507a;

            /* renamed from: b */
            public Boolean f124508b;

            /* renamed from: c */
            public String f124509c;

            /* renamed from: a */
            public AnonymousInfo build() {
                Boolean bool = this.f124507a;
                if (bool != null) {
                    return new AnonymousInfo(bool, this.f124508b, this.f124509c, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(bool, "mis_anonymous");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", is_anonymous=");
            sb.append(this.mis_anonymous);
            if (this.mis_sender != null) {
                sb.append(", is_sender=");
                sb.append(this.mis_sender);
            }
            if (this.manonymous_chatter_id != null) {
                sb.append(", anonymous_chatter_id=");
                sb.append(this.manonymous_chatter_id);
            }
            StringBuilder replace = sb.replace(0, 2, "AnonymousInfo{");
            replace.append('}');
            return replace.toString();
        }

        public AnonymousInfo(Boolean bool, Boolean bool2, String str) {
            this(bool, bool2, str, ByteString.EMPTY);
        }

        public AnonymousInfo(Boolean bool, Boolean bool2, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mis_anonymous = bool;
            this.mis_sender = bool2;
            this.manonymous_chatter_id = str;
        }
    }

    public static final class Version extends com.squareup.wire.Message<Version, C49732a> {
        public static final ProtoAdapter<Version> ADAPTER = new C49733b();
        public static final Integer DEFAULT_CONTENT_VERSION = 0;
        private static final long serialVersionUID = 0;
        public final Integer mcontent_version;

        /* renamed from: com.ss.android.lark.pb.entities.Message$Version$b */
        private static final class C49733b extends ProtoAdapter<Version> {
            C49733b() {
                super(FieldEncoding.LENGTH_DELIMITED, Version.class);
            }

            /* renamed from: a */
            public int encodedSize(Version version) {
                int i;
                if (version.mcontent_version != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(1, version.mcontent_version);
                } else {
                    i = 0;
                }
                return i + version.unknownFields().size();
            }

            /* renamed from: a */
            public Version decode(ProtoReader protoReader) throws IOException {
                C49732a aVar = new C49732a();
                aVar.f124510a = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag != 1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f124510a = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Version version) throws IOException {
                if (version.mcontent_version != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, version.mcontent_version);
                }
                protoWriter.writeBytes(version.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.entities.Message$Version$a */
        public static final class C49732a extends Message.Builder<Version, C49732a> {

            /* renamed from: a */
            public Integer f124510a;

            /* renamed from: a */
            public Version build() {
                return new Version(this.f124510a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49732a newBuilder() {
            C49732a aVar = new C49732a();
            aVar.f124510a = this.mcontent_version;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mcontent_version != null) {
                sb.append(", content_version=");
                sb.append(this.mcontent_version);
            }
            StringBuilder replace = sb.replace(0, 2, "Version{");
            replace.append('}');
            return replace.toString();
        }

        public Version(Integer num) {
            this(num, ByteString.EMPTY);
        }

        public Version(Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mcontent_version = num;
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.Message$a */
    public static final class C49734a extends Message.Builder<Message, C49734a> {

        /* renamed from: A */
        public CryptoInfo f124511A;

        /* renamed from: B */
        public Integer f124512B;

        /* renamed from: C */
        public Long f124513C;

        /* renamed from: D */
        public String f124514D;

        /* renamed from: E */
        public RemoverType f124515E;

        /* renamed from: F */
        public I18nInfo f124516F;

        /* renamed from: G */
        public Integer f124517G;

        /* renamed from: H */
        public Boolean f124518H;

        /* renamed from: I */
        public Integer f124519I;

        /* renamed from: J */
        public Integer f124520J;

        /* renamed from: K */
        public Integer f124521K;

        /* renamed from: L */
        public List<String> f124522L = Internal.newMutableList();

        /* renamed from: M */
        public String f124523M;

        /* renamed from: N */
        public TranslateMessageDisplayRule f124524N;

        /* renamed from: O */
        public Boolean f124525O;

        /* renamed from: P */
        public Boolean f124526P;

        /* renamed from: Q */
        public MessageSensitivity f124527Q;

        /* renamed from: R */
        public Boolean f124528R;

        /* renamed from: S */
        public TranslateSource f124529S;

        /* renamed from: T */
        public ChatType f124530T;

        /* renamed from: U */
        public String f124531U;

        /* renamed from: V */
        public Boolean f124532V;

        /* renamed from: W */
        public Map<String, ImageTranslationAbility> f124533W = Internal.newMutableMap();

        /* renamed from: X */
        public Version f124534X;

        /* renamed from: Y */
        public Map<String, ImageTranslationAbilityV2> f124535Y = Internal.newMutableMap();

        /* renamed from: Z */
        public Long f124536Z;

        /* renamed from: a */
        public String f124537a;
        public Boolean aa;
        public AnonymousInfo ab;
        public Map<String, UrlPreviewHangPoint> ac = Internal.newMutableMap();
        public Boolean ad;

        /* renamed from: b */
        public Type f124538b;

        /* renamed from: c */
        public String f124539c;

        /* renamed from: d */
        public Long f124540d;

        /* renamed from: e */
        public ByteString f124541e;

        /* renamed from: f */
        public Status f124542f;

        /* renamed from: g */
        public FromType f124543g;

        /* renamed from: h */
        public String f124544h;

        /* renamed from: i */
        public String f124545i;

        /* renamed from: j */
        public String f124546j;

        /* renamed from: k */
        public Long f124547k;

        /* renamed from: l */
        public String f124548l;

        /* renamed from: m */
        public Integer f124549m;

        /* renamed from: n */
        public Long f124550n;

        /* renamed from: o */
        public Boolean f124551o;

        /* renamed from: p */
        public String f124552p;

        /* renamed from: q */
        public String f124553q;

        /* renamed from: r */
        public String f124554r;

        /* renamed from: s */
        public Boolean f124555s;

        /* renamed from: t */
        public String f124556t;

        /* renamed from: u */
        public Boolean f124557u;

        /* renamed from: v */
        public Boolean f124558v;

        /* renamed from: w */
        public Boolean f124559w;

        /* renamed from: x */
        public String f124560x;

        /* renamed from: y */
        public ChannelType f124561y;

        /* renamed from: z */
        public Boolean f124562z;

        /* renamed from: a */
        public Message build() {
            return new Message(this.f124537a, this.f124538b, this.f124539c, this.f124540d, this.f124541e, this.f124542f, this.f124543g, this.f124544h, this.f124545i, this.f124546j, this.f124547k, this.f124548l, this.f124549m, this.f124550n, this.f124551o, this.f124552p, this.f124553q, this.f124554r, this.f124555s, this.f124556t, this.f124557u, this.f124558v, this.f124559w, this.f124560x, this.f124561y, this.f124562z, this.f124511A, this.f124512B, this.f124513C, this.f124514D, this.f124515E, this.f124516F, this.f124517G, this.f124518H, this.f124519I, this.f124520J, this.f124521K, this.f124522L, this.f124523M, this.f124524N, this.f124525O, this.f124526P, this.f124527Q, this.f124528R, this.f124529S, this.f124530T, this.f124531U, this.f124532V, this.f124533W, this.f124534X, this.f124535Y, this.f124536Z, this.aa, this.ab, this.ac, this.ad, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49734a newBuilder() {
        C49734a aVar = new C49734a();
        aVar.f124537a = this.mid;
        aVar.f124538b = this.mtype;
        aVar.f124539c = this.mfrom_id;
        aVar.f124540d = this.mcreate_time;
        aVar.f124541e = this.mcontent;
        aVar.f124542f = this.mstatus;
        aVar.f124543g = this.mfrom_type;
        aVar.f124544h = this.mroot_id;
        aVar.f124545i = this.mparent_id;
        aVar.f124546j = this.mchat_id;
        aVar.f124547k = this.mlast_modify_time;
        aVar.f124548l = this.mcid;
        aVar.f124549m = this.mposition;
        aVar.f124550n = this.mupdate_time;
        aVar.f124551o = this.mis_notified;
        aVar.f124552p = this.mreply_count;
        aVar.f124553q = this.mparent_source_message_id;
        aVar.f124554r = this.mroot_source_message_id;
        aVar.f124555s = this.mis_ding;
        aVar.f124556t = this.mthread_id;
        aVar.f124557u = this.msend_to_chat;
        aVar.f124558v = this.mis_truncated;
        aVar.f124559w = this.mis_removed;
        aVar.f124560x = this.mchannel_id;
        aVar.f124561y = this.mchannel_type;
        aVar.f124562z = this.mis_visible;
        aVar.f124511A = this.mcrypto_info;
        aVar.f124512B = this.mthread_position;
        aVar.f124513C = this.mremover_id;
        aVar.f124514D = this.mtranslate_language;
        aVar.f124515E = this.mremover_type;
        aVar.f124516F = this.mi18n_info;
        aVar.f124517G = this.mno_badged_count;
        aVar.f124518H = this.mis_badged;
        aVar.f124519I = this.mbadge_count;
        aVar.f124520J = this.mthread_badge_count;
        aVar.f124521K = this.mthread_reply_count;
        aVar.f124522L = Internal.copyOf("mat_out_chatter_ids", this.mat_out_chatter_ids);
        aVar.f124523M = this.mmessage_language;
        aVar.f124524N = this.mtranslate_message_display_rule;
        aVar.f124525O = this.mis_no_trace_removed;
        aVar.f124526P = this.mis_auto_translated_by_receiver;
        aVar.f124527Q = this.msensitivity;
        aVar.f124528R = this.mis_visible_v2;
        aVar.f124529S = this.mtranslate_source;
        aVar.f124530T = this.mchat_type;
        aVar.f124531U = this.moriginal_sender_id;
        aVar.f124532V = this.mis_static_resource_message_deleted;
        aVar.f124533W = Internal.copyOf("mimages_translation_ability", this.mimages_translation_ability);
        aVar.f124534X = this.mversion;
        aVar.f124535Y = Internal.copyOf("mimages_translation_ability_v2", this.mimages_translation_ability_v2);
        aVar.f124536Z = this.mmessage_pipe_version;
        aVar.aa = this.mis_batch_copy_messages;
        aVar.ab = this.manonymous_info;
        aVar.ac = Internal.copyOf("murl_preview_hang_point_map", this.murl_preview_hang_point_map);
        aVar.ad = this.mis_special_focus;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mid != null) {
            sb.append(", id=");
            sb.append(this.mid);
        }
        if (this.mtype != null) {
            sb.append(", type=");
            sb.append(this.mtype);
        }
        if (this.mfrom_id != null) {
            sb.append(", from_id=");
            sb.append(this.mfrom_id);
        }
        if (this.mcreate_time != null) {
            sb.append(", create_time=");
            sb.append(this.mcreate_time);
        }
        if (this.mcontent != null) {
            sb.append(", content=");
            sb.append(this.mcontent);
        }
        if (this.mstatus != null) {
            sb.append(", status=");
            sb.append(this.mstatus);
        }
        if (this.mfrom_type != null) {
            sb.append(", from_type=");
            sb.append(this.mfrom_type);
        }
        if (this.mroot_id != null) {
            sb.append(", root_id=");
            sb.append(this.mroot_id);
        }
        if (this.mparent_id != null) {
            sb.append(", parent_id=");
            sb.append(this.mparent_id);
        }
        if (this.mchat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.mchat_id);
        }
        if (this.mlast_modify_time != null) {
            sb.append(", last_modify_time=");
            sb.append(this.mlast_modify_time);
        }
        if (this.mcid != null) {
            sb.append(", cid=");
            sb.append(this.mcid);
        }
        if (this.mposition != null) {
            sb.append(", position=");
            sb.append(this.mposition);
        }
        if (this.mupdate_time != null) {
            sb.append(", update_time=");
            sb.append(this.mupdate_time);
        }
        if (this.mis_notified != null) {
            sb.append(", is_notified=");
            sb.append(this.mis_notified);
        }
        if (this.mreply_count != null) {
            sb.append(", reply_count=");
            sb.append(this.mreply_count);
        }
        if (this.mparent_source_message_id != null) {
            sb.append(", parent_source_message_id=");
            sb.append(this.mparent_source_message_id);
        }
        if (this.mroot_source_message_id != null) {
            sb.append(", root_source_message_id=");
            sb.append(this.mroot_source_message_id);
        }
        if (this.mis_ding != null) {
            sb.append(", is_ding=");
            sb.append(this.mis_ding);
        }
        if (this.mthread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.mthread_id);
        }
        if (this.msend_to_chat != null) {
            sb.append(", send_to_chat=");
            sb.append(this.msend_to_chat);
        }
        if (this.mis_truncated != null) {
            sb.append(", is_truncated=");
            sb.append(this.mis_truncated);
        }
        if (this.mis_removed != null) {
            sb.append(", is_removed=");
            sb.append(this.mis_removed);
        }
        if (this.mchannel_id != null) {
            sb.append(", channel_id=");
            sb.append(this.mchannel_id);
        }
        if (this.mchannel_type != null) {
            sb.append(", channel_type=");
            sb.append(this.mchannel_type);
        }
        if (this.mis_visible != null) {
            sb.append(", is_visible=");
            sb.append(this.mis_visible);
        }
        if (this.mcrypto_info != null) {
            sb.append(", crypto_info=");
            sb.append(this.mcrypto_info);
        }
        if (this.mthread_position != null) {
            sb.append(", thread_position=");
            sb.append(this.mthread_position);
        }
        if (this.mremover_id != null) {
            sb.append(", remover_id=");
            sb.append(this.mremover_id);
        }
        if (this.mtranslate_language != null) {
            sb.append(", translate_language=");
            sb.append(this.mtranslate_language);
        }
        if (this.mremover_type != null) {
            sb.append(", remover_type=");
            sb.append(this.mremover_type);
        }
        if (this.mi18n_info != null) {
            sb.append(", i18n_info=");
            sb.append(this.mi18n_info);
        }
        if (this.mno_badged_count != null) {
            sb.append(", no_badged_count=");
            sb.append(this.mno_badged_count);
        }
        if (this.mis_badged != null) {
            sb.append(", is_badged=");
            sb.append(this.mis_badged);
        }
        if (this.mbadge_count != null) {
            sb.append(", badge_count=");
            sb.append(this.mbadge_count);
        }
        if (this.mthread_badge_count != null) {
            sb.append(", thread_badge_count=");
            sb.append(this.mthread_badge_count);
        }
        if (this.mthread_reply_count != null) {
            sb.append(", thread_reply_count=");
            sb.append(this.mthread_reply_count);
        }
        if (!this.mat_out_chatter_ids.isEmpty()) {
            sb.append(", at_out_chatter_ids=");
            sb.append(this.mat_out_chatter_ids);
        }
        if (this.mmessage_language != null) {
            sb.append(", message_language=");
            sb.append(this.mmessage_language);
        }
        if (this.mtranslate_message_display_rule != null) {
            sb.append(", translate_message_display_rule=");
            sb.append(this.mtranslate_message_display_rule);
        }
        if (this.mis_no_trace_removed != null) {
            sb.append(", is_no_trace_removed=");
            sb.append(this.mis_no_trace_removed);
        }
        if (this.mis_auto_translated_by_receiver != null) {
            sb.append(", is_auto_translated_by_receiver=");
            sb.append(this.mis_auto_translated_by_receiver);
        }
        if (this.msensitivity != null) {
            sb.append(", sensitivity=");
            sb.append(this.msensitivity);
        }
        if (this.mis_visible_v2 != null) {
            sb.append(", is_visible_v2=");
            sb.append(this.mis_visible_v2);
        }
        if (this.mtranslate_source != null) {
            sb.append(", translate_source=");
            sb.append(this.mtranslate_source);
        }
        if (this.mchat_type != null) {
            sb.append(", chat_type=");
            sb.append(this.mchat_type);
        }
        if (this.moriginal_sender_id != null) {
            sb.append(", original_sender_id=");
            sb.append(this.moriginal_sender_id);
        }
        if (this.mis_static_resource_message_deleted != null) {
            sb.append(", is_static_resource_message_deleted=");
            sb.append(this.mis_static_resource_message_deleted);
        }
        if (!this.mimages_translation_ability.isEmpty()) {
            sb.append(", images_translation_ability=");
            sb.append(this.mimages_translation_ability);
        }
        if (this.mversion != null) {
            sb.append(", version=");
            sb.append(this.mversion);
        }
        if (!this.mimages_translation_ability_v2.isEmpty()) {
            sb.append(", images_translation_ability_v2=");
            sb.append(this.mimages_translation_ability_v2);
        }
        if (this.mmessage_pipe_version != null) {
            sb.append(", message_pipe_version=");
            sb.append(this.mmessage_pipe_version);
        }
        if (this.mis_batch_copy_messages != null) {
            sb.append(", is_batch_copy_messages=");
            sb.append(this.mis_batch_copy_messages);
        }
        if (this.manonymous_info != null) {
            sb.append(", anonymous_info=");
            sb.append(this.manonymous_info);
        }
        if (!this.murl_preview_hang_point_map.isEmpty()) {
            sb.append(", url_preview_hang_point_map=");
            sb.append(this.murl_preview_hang_point_map);
        }
        if (this.mis_special_focus != null) {
            sb.append(", is_special_focus=");
            sb.append(this.mis_special_focus);
        }
        StringBuilder replace = sb.replace(0, 2, "Message{");
        replace.append('}');
        return replace.toString();
    }

    public Message(String str, Type type, String str2, Long l, ByteString byteString, Status status, FromType fromType, String str3, String str4, String str5, Long l2, String str6, Integer num, Long l3, Boolean bool, String str7, String str8, String str9, Boolean bool2, String str10, Boolean bool3, Boolean bool4, Boolean bool5, String str11, ChannelType channelType, Boolean bool6, CryptoInfo cryptoInfo, Integer num2, Long l4, String str12, RemoverType removerType, I18nInfo i18nInfo, Integer num3, Boolean bool7, Integer num4, Integer num5, Integer num6, List<String> list, String str13, TranslateMessageDisplayRule translateMessageDisplayRule, Boolean bool8, Boolean bool9, MessageSensitivity messageSensitivity, Boolean bool10, TranslateSource translateSource, ChatType chatType, String str14, Boolean bool11, Map<String, ImageTranslationAbility> map, Version version, Map<String, ImageTranslationAbilityV2> map2, Long l5, Boolean bool12, AnonymousInfo anonymousInfo, Map<String, UrlPreviewHangPoint> map3, Boolean bool13) {
        this(str, type, str2, l, byteString, status, fromType, str3, str4, str5, l2, str6, num, l3, bool, str7, str8, str9, bool2, str10, bool3, bool4, bool5, str11, channelType, bool6, cryptoInfo, num2, l4, str12, removerType, i18nInfo, num3, bool7, num4, num5, num6, list, str13, translateMessageDisplayRule, bool8, bool9, messageSensitivity, bool10, translateSource, chatType, str14, bool11, map, version, map2, l5, bool12, anonymousInfo, map3, bool13, ByteString.EMPTY);
    }

    public Message(String str, Type type, String str2, Long l, ByteString byteString, Status status, FromType fromType, String str3, String str4, String str5, Long l2, String str6, Integer num, Long l3, Boolean bool, String str7, String str8, String str9, Boolean bool2, String str10, Boolean bool3, Boolean bool4, Boolean bool5, String str11, ChannelType channelType, Boolean bool6, CryptoInfo cryptoInfo, Integer num2, Long l4, String str12, RemoverType removerType, I18nInfo i18nInfo, Integer num3, Boolean bool7, Integer num4, Integer num5, Integer num6, List<String> list, String str13, TranslateMessageDisplayRule translateMessageDisplayRule, Boolean bool8, Boolean bool9, MessageSensitivity messageSensitivity, Boolean bool10, TranslateSource translateSource, ChatType chatType, String str14, Boolean bool11, Map<String, ImageTranslationAbility> map, Version version, Map<String, ImageTranslationAbilityV2> map2, Long l5, Boolean bool12, AnonymousInfo anonymousInfo, Map<String, UrlPreviewHangPoint> map3, Boolean bool13, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.mid = str;
        this.mtype = type;
        this.mfrom_id = str2;
        this.mcreate_time = l;
        this.mcontent = byteString;
        this.mstatus = status;
        this.mfrom_type = fromType;
        this.mroot_id = str3;
        this.mparent_id = str4;
        this.mchat_id = str5;
        this.mlast_modify_time = l2;
        this.mcid = str6;
        this.mposition = num;
        this.mupdate_time = l3;
        this.mis_notified = bool;
        this.mreply_count = str7;
        this.mparent_source_message_id = str8;
        this.mroot_source_message_id = str9;
        this.mis_ding = bool2;
        this.mthread_id = str10;
        this.msend_to_chat = bool3;
        this.mis_truncated = bool4;
        this.mis_removed = bool5;
        this.mchannel_id = str11;
        this.mchannel_type = channelType;
        this.mis_visible = bool6;
        this.mcrypto_info = cryptoInfo;
        this.mthread_position = num2;
        this.mremover_id = l4;
        this.mtranslate_language = str12;
        this.mremover_type = removerType;
        this.mi18n_info = i18nInfo;
        this.mno_badged_count = num3;
        this.mis_badged = bool7;
        this.mbadge_count = num4;
        this.mthread_badge_count = num5;
        this.mthread_reply_count = num6;
        this.mat_out_chatter_ids = Internal.immutableCopyOf("mat_out_chatter_ids", list);
        this.mmessage_language = str13;
        this.mtranslate_message_display_rule = translateMessageDisplayRule;
        this.mis_no_trace_removed = bool8;
        this.mis_auto_translated_by_receiver = bool9;
        this.msensitivity = messageSensitivity;
        this.mis_visible_v2 = bool10;
        this.mtranslate_source = translateSource;
        this.mchat_type = chatType;
        this.moriginal_sender_id = str14;
        this.mis_static_resource_message_deleted = bool11;
        this.mimages_translation_ability = Internal.immutableCopyOf("mimages_translation_ability", map);
        this.mversion = version;
        this.mimages_translation_ability_v2 = Internal.immutableCopyOf("mimages_translation_ability_v2", map2);
        this.mmessage_pipe_version = l5;
        this.mis_batch_copy_messages = bool12;
        this.manonymous_info = anonymousInfo;
        this.murl_preview_hang_point_map = Internal.immutableCopyOf("murl_preview_hang_point_map", map3);
        this.mis_special_focus = bool13;
    }
}
