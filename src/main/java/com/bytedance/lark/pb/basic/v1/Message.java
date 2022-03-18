package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class Message extends com.squareup.wire.Message<Message, C15073a> {
    public static final ProtoAdapter<Message> ADAPTER = new C15074b();
    public static final Integer DEFAULT_BADGE_COUNT = 0;
    public static final Integer DEFAULT_BURN_LIFE = 0;
    public static final Long DEFAULT_BURN_TIME = 0L;
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final FileDeletedStatus DEFAULT_FILE_DELETED_STATUS = FileDeletedStatus.NORMAL;
    public static final Boolean DEFAULT_FORWARD_FROM_FRIEND = false;
    public static final FromType DEFAULT_FROM_TYPE = FromType.UNKNOWN_FROM_TYPE;
    public static final Boolean DEFAULT_IS_AT_ALL = false;
    public static final Boolean DEFAULT_IS_AT_ME = false;
    public static final Boolean DEFAULT_IS_AUTO_TRANSLATED_BY_RECEIVER = false;
    public static final Boolean DEFAULT_IS_BADGED = false;
    public static final Boolean DEFAULT_IS_BURNED = false;
    public static final Boolean DEFAULT_IS_CRYPTO_INTERMEDIATE = false;
    public static final Boolean DEFAULT_IS_DELETED = false;
    public static final Boolean DEFAULT_IS_EDITED = false;
    public static final Boolean DEFAULT_IS_FILE_DELETED = false;
    public static final Boolean DEFAULT_IS_MANUAL_TRANSLATED = false;
    public static final Boolean DEFAULT_IS_NO_TRACE_DELETED = false;
    public static final Boolean DEFAULT_IS_RECALLED = false;
    public static final Boolean DEFAULT_IS_REEDITABLE = false;
    public static final Boolean DEFAULT_IS_SPECIAL_FOCUS = false;
    public static final Boolean DEFAULT_IS_TRUNCATED = false;
    public static final Boolean DEFAULT_IS_UNTRANSLATEABLE = false;
    public static final Boolean DEFAULT_IS_URGENT = false;
    public static final Boolean DEFAULT_IS_VISIBLE = true;
    public static final Boolean DEFAULT_ME_READ = false;
    public static final Integer DEFAULT_ORIGIN_BADGE_COUNT = 0;
    public static final Integer DEFAULT_ORIGIN_THREAD_BADGE_COUNT = 0;
    public static final Integer DEFAULT_POSITION = 0;
    public static final Integer DEFAULT_READ_COUNT = 0;
    public static final RecallerIdentity DEFAULT_RECALLER_IDENTITY = RecallerIdentity.UNKNOWN_IDENTITY;
    public static final Integer DEFAULT_REPLY_COUNT = 0;
    public static final MessageSensitivity DEFAULT_SENSITIVITY = MessageSensitivity.UNKNOWN_SENSITIVITY;
    public static final Boolean DEFAULT_SHOULD_NOTIFY = true;
    public static final SourceType DEFAULT_SOURCE_TYPE = SourceType.TYPE_FROM_UNKONWN;
    public static final Boolean DEFAULT_STATIC_RESOURCE_MESSAGE_RECALLED = false;
    public static final Boolean DEFAULT_SYNC_DEPENDENCY = false;
    public static final Integer DEFAULT_THREAD_BADGE_COUNT = 0;
    public static final Integer DEFAULT_THREAD_POSITION = 0;
    public static final Integer DEFAULT_THREAD_REPLY_COUNT = 0;
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    public static final Integer DEFAULT_UNREAD_COUNT = 0;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final List<String> ack_urgent_chatter_ids;
    public final AnonymousInfo anonymous_info;
    public final List<String> at_out_chatter_ids;
    public final Integer badge_count;
    public final Integer burn_life;
    public final Long burn_time;
    public final Channel channel;
    public final String chat_id;
    public final String cid;
    public final Content content;
    public final Long create_time;
    public final String crypto_token;
    public final String doc_key;
    public final FileDeletedStatus file_deleted_status;
    public final Boolean forward_from_friend;
    public final String from_id;
    public final FromType from_type;
    public final String id;
    public final Map<String, ImageTranslationAbility> image_translation_ability;
    public final Boolean is_at_all;
    public final Boolean is_at_me;
    public final Boolean is_auto_translated_by_receiver;
    public final Boolean is_badged;
    public final Boolean is_burned;
    public final Boolean is_crypto_intermediate;
    public final Boolean is_deleted;
    public final Boolean is_edited;
    public final Boolean is_file_deleted;
    public final Boolean is_manual_translated;
    public final Boolean is_no_trace_deleted;
    public final Boolean is_recalled;
    public final Boolean is_reeditable;
    public final Boolean is_special_focus;
    public final Boolean is_truncated;
    public final Boolean is_untranslateable;
    public final Boolean is_urgent;
    public final Boolean is_visible;
    public final Boolean me_read;
    public final String message_language;
    public final Integer origin_badge_count;
    public final Integer origin_thread_badge_count;
    public final String original_sender_id;
    public final String parent_id;
    public final String parent_source_id;
    public final Pin pin;
    public final Integer position;
    public final String post_draft_id;
    public final List<Reaction> reactions;
    public final List<String> read_at_chatter_ids;
    public final Integer read_count;
    public final String recaller_id;
    public final RecallerIdentity recaller_identity;
    public final String reminder_id;
    public final Integer reply_count;
    public final String root_id;
    public final String root_source_id;
    public final MessageSensitivity sensitivity;
    public final Boolean should_notify;
    public final String source_id;
    public final SourceType source_type;
    public final Boolean static_resource_message_recalled;
    public final Boolean sync_dependency;
    public final String text_draft_id;
    public final Integer thread_badge_count;
    public final String thread_id;
    public final Integer thread_position;
    public final Integer thread_reply_count;
    public final String translate_language;
    public final TranslateMessageDisplayRule translate_message_display_rule;
    public final Type type;
    public final List<String> unack_urgent_chatter_ids;
    public final List<String> unread_chatter_ids;
    public final Integer unread_count;
    public final Long update_time;
    public final String urgent_id;

    public enum FileDeletedStatus implements WireEnum {
        NORMAL(0),
        RECOVERABLE(1),
        UNRECOVERABLE(2),
        RECALLED(3);
        
        public static final ProtoAdapter<FileDeletedStatus> ADAPTER = ProtoAdapter.newEnumAdapter(FileDeletedStatus.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static FileDeletedStatus fromValue(int i) {
            if (i == 0) {
                return NORMAL;
            }
            if (i == 1) {
                return RECOVERABLE;
            }
            if (i == 2) {
                return UNRECOVERABLE;
            }
            if (i != 3) {
                return null;
            }
            return RECALLED;
        }

        private FileDeletedStatus(int i) {
            this.value = i;
        }
    }

    public enum FromType implements WireEnum {
        UNKNOWN_FROM_TYPE(0),
        USER(1),
        BOT(2);
        
        public static final ProtoAdapter<FromType> ADAPTER = ProtoAdapter.newEnumAdapter(FromType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static FromType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_FROM_TYPE;
            }
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

    public enum RecallerIdentity implements WireEnum {
        UNKNOWN_IDENTITY(0),
        OWNER(1),
        ADMINISTRATOR(2),
        GROUP_ADMIN(3);
        
        public static final ProtoAdapter<RecallerIdentity> ADAPTER = ProtoAdapter.newEnumAdapter(RecallerIdentity.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static RecallerIdentity fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_IDENTITY;
            }
            if (i == 1) {
                return OWNER;
            }
            if (i == 2) {
                return ADMINISTRATOR;
            }
            if (i != 3) {
                return null;
            }
            return GROUP_ADMIN;
        }

        private RecallerIdentity(int i) {
            this.value = i;
        }
    }

    public enum SourceType implements WireEnum {
        TYPE_FROM_UNKONWN(0),
        TYPE_FROM_MESSAGE(1),
        TYPE_FROM_MERGEFORWARD(2),
        TYPE_FROM_FAVORITE(3),
        TYPE_FROM_TODO_REFER_RESOURCE(4);
        
        public static final ProtoAdapter<SourceType> ADAPTER = ProtoAdapter.newEnumAdapter(SourceType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static SourceType fromValue(int i) {
            if (i == 0) {
                return TYPE_FROM_UNKONWN;
            }
            if (i == 1) {
                return TYPE_FROM_MESSAGE;
            }
            if (i == 2) {
                return TYPE_FROM_MERGEFORWARD;
            }
            if (i == 3) {
                return TYPE_FROM_FAVORITE;
            }
            if (i != 4) {
                return null;
            }
            return TYPE_FROM_TODO_REFER_RESOURCE;
        }

        private SourceType(int i) {
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
        CARD(13),
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
                case 14:
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
                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                    return CALENDAR;
                case 13:
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
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                    return FOLDER;
            }
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public Message(String str, Type type2, String str2, String str3, Long l, Long l2, String str4, Content content2, List<Reaction> list, Integer num, String str5, Boolean bool, Boolean bool2, Boolean bool3, Integer num2, Integer num3, String str6, Boolean bool4, String str7, String str8, String str9, Boolean bool5, String str10, String str11, Boolean bool6, Boolean bool7, Boolean bool8, Integer num4, List<String> list2, String str12, String str13, Boolean bool9, Boolean bool10, FromType fromType, String str14, List<String> list3, List<String> list4, Channel channel2, Boolean bool11, Integer num5, Long l3, Integer num6, SourceType sourceType, String str15, String str16, String str17, RecallerIdentity recallerIdentity, Pin pin2, Integer num7, Boolean bool12, Boolean bool13, Boolean bool14, List<String> list5, Integer num8, Integer num9, List<String> list6, Boolean bool15, String str18, Boolean bool16, Boolean bool17, Integer num10, Integer num11, MessageSensitivity messageSensitivity, String str19, TranslateMessageDisplayRule translateMessageDisplayRule, Boolean bool18, String str20, Boolean bool19, Boolean bool20, Boolean bool21, Map<String, ImageTranslationAbility> map, Boolean bool22, FileDeletedStatus fileDeletedStatus, Boolean bool23, AnonymousInfo anonymousInfo) {
        this(str, type2, str2, str3, l, l2, str4, content2, list, num, str5, bool, bool2, bool3, num2, num3, str6, bool4, str7, str8, str9, bool5, str10, str11, bool6, bool7, bool8, num4, list2, str12, str13, bool9, bool10, fromType, str14, list3, list4, channel2, bool11, num5, l3, num6, sourceType, str15, str16, str17, recallerIdentity, pin2, num7, bool12, bool13, bool14, list5, num8, num9, list6, bool15, str18, bool16, bool17, num10, num11, messageSensitivity, str19, translateMessageDisplayRule, bool18, str20, bool19, bool20, bool21, map, bool22, fileDeletedStatus, bool23, anonymousInfo, ByteString.EMPTY);
    }

    public Message(String str, Type type2, String str2, String str3, Long l, Long l2, String str4, Content content2, List<Reaction> list, Integer num, String str5, Boolean bool, Boolean bool2, Boolean bool3, Integer num2, Integer num3, String str6, Boolean bool4, String str7, String str8, String str9, Boolean bool5, String str10, String str11, Boolean bool6, Boolean bool7, Boolean bool8, Integer num4, List<String> list2, String str12, String str13, Boolean bool9, Boolean bool10, FromType fromType, String str14, List<String> list3, List<String> list4, Channel channel2, Boolean bool11, Integer num5, Long l3, Integer num6, SourceType sourceType, String str15, String str16, String str17, RecallerIdentity recallerIdentity, Pin pin2, Integer num7, Boolean bool12, Boolean bool13, Boolean bool14, List<String> list5, Integer num8, Integer num9, List<String> list6, Boolean bool15, String str18, Boolean bool16, Boolean bool17, Integer num10, Integer num11, MessageSensitivity messageSensitivity, String str19, TranslateMessageDisplayRule translateMessageDisplayRule, Boolean bool18, String str20, Boolean bool19, Boolean bool20, Boolean bool21, Map<String, ImageTranslationAbility> map, Boolean bool22, FileDeletedStatus fileDeletedStatus, Boolean bool23, AnonymousInfo anonymousInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.type = type2;
        this.chat_id = str2;
        this.thread_id = str3;
        this.create_time = l;
        this.update_time = l2;
        this.root_id = str4;
        this.content = content2;
        this.reactions = Internal.immutableCopyOf("reactions", list);
        this.unread_count = num;
        this.from_id = str5;
        this.should_notify = bool;
        this.is_recalled = bool2;
        this.is_edited = bool3;
        this.reply_count = num2;
        this.position = num3;
        this.cid = str6;
        this.me_read = bool4;
        this.reminder_id = str7;
        this.parent_source_id = str8;
        this.root_source_id = str9;
        this.is_urgent = bool5;
        this.urgent_id = str10;
        this.parent_id = str11;
        this.is_at_me = bool6;
        this.is_at_all = bool7;
        this.is_truncated = bool8;
        this.read_count = num4;
        this.unread_chatter_ids = Internal.immutableCopyOf("unread_chatter_ids", list2);
        this.text_draft_id = str12;
        this.post_draft_id = str13;
        this.is_file_deleted = bool9;
        this.is_deleted = bool10;
        this.from_type = fromType;
        this.doc_key = str14;
        this.unack_urgent_chatter_ids = Internal.immutableCopyOf("unack_urgent_chatter_ids", list3);
        this.ack_urgent_chatter_ids = Internal.immutableCopyOf("ack_urgent_chatter_ids", list4);
        this.channel = channel2;
        this.is_visible = bool11;
        this.burn_life = num5;
        this.burn_time = l3;
        this.thread_position = num6;
        this.source_type = sourceType;
        this.source_id = str15;
        this.translate_language = str16;
        this.recaller_id = str17;
        this.recaller_identity = recallerIdentity;
        this.pin = pin2;
        this.badge_count = num7;
        this.is_reeditable = bool12;
        this.is_badged = bool13;
        this.is_untranslateable = bool14;
        this.read_at_chatter_ids = Internal.immutableCopyOf("read_at_chatter_ids", list5);
        this.thread_badge_count = num8;
        this.thread_reply_count = num9;
        this.at_out_chatter_ids = Internal.immutableCopyOf("at_out_chatter_ids", list6);
        this.is_burned = bool15;
        this.message_language = str18;
        this.is_auto_translated_by_receiver = bool16;
        this.is_no_trace_deleted = bool17;
        this.origin_badge_count = num10;
        this.origin_thread_badge_count = num11;
        this.sensitivity = messageSensitivity;
        this.crypto_token = str19;
        this.translate_message_display_rule = translateMessageDisplayRule;
        this.is_manual_translated = bool18;
        this.original_sender_id = str20;
        this.forward_from_friend = bool19;
        this.static_resource_message_recalled = bool20;
        this.is_crypto_intermediate = bool21;
        this.image_translation_ability = Internal.immutableCopyOf("image_translation_ability", map);
        this.is_special_focus = bool22;
        this.file_deleted_status = fileDeletedStatus;
        this.sync_dependency = bool23;
        this.anonymous_info = anonymousInfo;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Message$b */
    private static final class C15074b extends ProtoAdapter<Message> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, ImageTranslationAbility>> f39921a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ImageTranslationAbility.ADAPTER);

        /* renamed from: a */
        public Message decode(ProtoReader protoReader) throws IOException {
            C15073a aVar = new C15073a();
            aVar.f39895a = "";
            aVar.f39896b = Type.UNKNOWN;
            aVar.f39897c = "";
            aVar.f39898d = "";
            aVar.f39899e = 0L;
            aVar.f39900f = 0L;
            aVar.f39901g = "";
            aVar.f39904j = 0;
            aVar.f39905k = "";
            aVar.f39906l = true;
            aVar.f39907m = false;
            aVar.f39908n = false;
            aVar.f39909o = 0;
            aVar.f39910p = 0;
            aVar.f39911q = "";
            aVar.f39912r = false;
            aVar.f39913s = "";
            aVar.f39914t = "";
            aVar.f39915u = "";
            aVar.f39916v = false;
            aVar.f39917w = "";
            aVar.f39918x = "";
            aVar.f39919y = false;
            aVar.f39920z = false;
            aVar.f39869A = false;
            aVar.f39870B = 0;
            aVar.f39872D = "";
            aVar.f39873E = "";
            aVar.f39874F = false;
            aVar.f39875G = false;
            aVar.f39876H = FromType.UNKNOWN_FROM_TYPE;
            aVar.f39877I = "";
            aVar.f39881M = true;
            aVar.f39882N = 0;
            aVar.f39883O = 0L;
            aVar.f39884P = 0;
            aVar.f39885Q = SourceType.TYPE_FROM_UNKONWN;
            aVar.f39886R = "";
            aVar.f39887S = "";
            aVar.f39888T = "";
            aVar.f39889U = RecallerIdentity.UNKNOWN_IDENTITY;
            aVar.f39891W = 0;
            aVar.f39892X = false;
            aVar.f39893Y = false;
            aVar.f39894Z = false;
            aVar.ab = 0;
            aVar.ac = 0;
            aVar.ae = false;
            aVar.af = "";
            aVar.ag = false;
            aVar.ah = false;
            aVar.f175428ai = 0;
            aVar.aj = 0;
            aVar.ak = MessageSensitivity.UNKNOWN_SENSITIVITY;
            aVar.al = "";
            aVar.an = false;
            aVar.ao = "";
            aVar.ap = false;
            aVar.aq = false;
            aVar.ar = false;
            aVar.at = false;
            aVar.au = FileDeletedStatus.NORMAL;
            aVar.av = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 90) {
                    try {
                        aVar.au = FileDeletedStatus.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 100) {
                    aVar.av = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 101) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39895a = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 2:
                            try {
                                aVar.f39896b = Type.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 3:
                            aVar.f39897c = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 4:
                            aVar.f39898d = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 5:
                            aVar.f39899e = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 6:
                            aVar.f39900f = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 7:
                            aVar.f39901g = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 8:
                            aVar.f39902h = Content.ADAPTER.decode(protoReader);
                            continue;
                        case 9:
                            aVar.f39903i.add(Reaction.ADAPTER.decode(protoReader));
                            continue;
                        case 10:
                            aVar.f39904j = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        default:
                            switch (nextTag) {
                                case 20:
                                    aVar.f39905k = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 21:
                                    aVar.f39906l = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 22:
                                    aVar.f39907m = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 23:
                                    aVar.f39908n = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 24:
                                    aVar.f39909o = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                                    aVar.f39910p = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case 26:
                                    aVar.f39911q = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                                    aVar.f39912r = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                                    aVar.f39913s = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 29:
                                    aVar.f39914t = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 30:
                                    aVar.f39915u = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                                    aVar.f39916v = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 32:
                                    aVar.f39917w = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 33:
                                    aVar.f39918x = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 34:
                                    aVar.f39919y = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 35:
                                    aVar.f39920z = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 36:
                                    aVar.f39869A = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 37:
                                    aVar.f39870B = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case 38:
                                    aVar.f39871C.add(ProtoAdapter.STRING.decode(protoReader));
                                    continue;
                                case 39:
                                    aVar.f39872D = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 40:
                                    aVar.f39873E = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 41:
                                    aVar.f39874F = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 42:
                                    aVar.f39875G = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 43:
                                    try {
                                        aVar.f39876H = FromType.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                        break;
                                    }
                                case 44:
                                    aVar.f39877I = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 45:
                                    aVar.f39878J.add(ProtoAdapter.STRING.decode(protoReader));
                                    continue;
                                case 46:
                                    aVar.f39879K.add(ProtoAdapter.STRING.decode(protoReader));
                                    continue;
                                case 47:
                                    aVar.f39880L = Channel.ADAPTER.decode(protoReader);
                                    continue;
                                case 48:
                                    aVar.f39881M = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 49:
                                    aVar.f39882N = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case MmListControl.f116813f /*{ENCODED_INT: 50}*/:
                                    aVar.f39883O = ProtoAdapter.INT64.decode(protoReader);
                                    continue;
                                case 51:
                                    aVar.f39884P = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case 52:
                                    try {
                                        aVar.f39885Q = SourceType.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                        break;
                                    }
                                case 53:
                                    aVar.f39886R = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 54:
                                    aVar.f39887S = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 55:
                                    aVar.f39888T = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 56:
                                    try {
                                        aVar.f39889U = RecallerIdentity.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e5.value));
                                        break;
                                    }
                                case 57:
                                    aVar.f39890V = Pin.ADAPTER.decode(protoReader);
                                    continue;
                                case 58:
                                    aVar.f39891W = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case 59:
                                    aVar.f39892X = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 60:
                                    aVar.f39893Y = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 61:
                                    aVar.f39894Z = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 62:
                                    aVar.aa.add(ProtoAdapter.STRING.decode(protoReader));
                                    continue;
                                case 63:
                                    aVar.ab = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case 64:
                                    aVar.ac = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case 65:
                                    aVar.ad.add(ProtoAdapter.STRING.decode(protoReader));
                                    continue;
                                case 66:
                                    aVar.ae = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 67:
                                    aVar.af = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 68:
                                    aVar.ag = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 69:
                                    aVar.ah = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 70:
                                    aVar.f175428ai = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case 71:
                                    aVar.aj = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case 72:
                                    try {
                                        aVar.ak = MessageSensitivity.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e6.value));
                                        break;
                                    }
                                case 73:
                                    aVar.al = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                default:
                                    switch (nextTag) {
                                        case CalendarSearchResultRv.f82651b /*{ENCODED_INT: 80}*/:
                                            aVar.am = TranslateMessageDisplayRule.ADAPTER.decode(protoReader);
                                            continue;
                                        case 81:
                                            aVar.an = ProtoAdapter.BOOL.decode(protoReader);
                                            continue;
                                        case 82:
                                            aVar.ao = ProtoAdapter.STRING.decode(protoReader);
                                            continue;
                                        case 83:
                                            aVar.ap = ProtoAdapter.BOOL.decode(protoReader);
                                            continue;
                                        case 84:
                                            aVar.aq = ProtoAdapter.BOOL.decode(protoReader);
                                            continue;
                                        case 85:
                                            aVar.ar = ProtoAdapter.BOOL.decode(protoReader);
                                            continue;
                                        case 86:
                                            aVar.as.putAll(this.f39921a.decode(protoReader));
                                            continue;
                                        case 87:
                                            aVar.at = ProtoAdapter.BOOL.decode(protoReader);
                                            continue;
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
                    aVar.aw = AnonymousInfo.ADAPTER.decode(protoReader);
                }
            }
        }

        C15074b() {
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
            int i52;
            int i53;
            int i54;
            int i55;
            int i56;
            int i57;
            int i58;
            int i59;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, message.id) + Type.ADAPTER.encodedSizeWithTag(2, message.type) + ProtoAdapter.STRING.encodedSizeWithTag(3, message.chat_id);
            int i60 = 0;
            if (message.thread_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(4, message.thread_id);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + ProtoAdapter.INT64.encodedSizeWithTag(5, message.create_time) + ProtoAdapter.INT64.encodedSizeWithTag(6, message.update_time) + ProtoAdapter.STRING.encodedSizeWithTag(7, message.root_id) + Content.ADAPTER.encodedSizeWithTag(8, message.content) + Reaction.ADAPTER.asRepeated().encodedSizeWithTag(9, message.reactions) + ProtoAdapter.INT32.encodedSizeWithTag(10, message.unread_count);
            if (message.from_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(20, message.from_id);
            } else {
                i2 = 0;
            }
            int i61 = encodedSizeWithTag2 + i2;
            if (message.should_notify != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(21, message.should_notify);
            } else {
                i3 = 0;
            }
            int i62 = i61 + i3;
            if (message.is_recalled != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(22, message.is_recalled);
            } else {
                i4 = 0;
            }
            int i63 = i62 + i4;
            if (message.is_edited != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(23, message.is_edited);
            } else {
                i5 = 0;
            }
            int i64 = i63 + i5;
            if (message.reply_count != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(24, message.reply_count);
            } else {
                i6 = 0;
            }
            int i65 = i64 + i6;
            if (message.position != null) {
                i7 = ProtoAdapter.INT32.encodedSizeWithTag(25, message.position);
            } else {
                i7 = 0;
            }
            int i66 = i65 + i7;
            if (message.cid != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(26, message.cid);
            } else {
                i8 = 0;
            }
            int i67 = i66 + i8;
            if (message.me_read != null) {
                i9 = ProtoAdapter.BOOL.encodedSizeWithTag(27, message.me_read);
            } else {
                i9 = 0;
            }
            int i68 = i67 + i9;
            if (message.reminder_id != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(28, message.reminder_id);
            } else {
                i10 = 0;
            }
            int i69 = i68 + i10;
            if (message.parent_source_id != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(29, message.parent_source_id);
            } else {
                i11 = 0;
            }
            int i70 = i69 + i11;
            if (message.root_source_id != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(30, message.root_source_id);
            } else {
                i12 = 0;
            }
            int i71 = i70 + i12;
            if (message.is_urgent != null) {
                i13 = ProtoAdapter.BOOL.encodedSizeWithTag(31, message.is_urgent);
            } else {
                i13 = 0;
            }
            int i72 = i71 + i13;
            if (message.urgent_id != null) {
                i14 = ProtoAdapter.STRING.encodedSizeWithTag(32, message.urgent_id);
            } else {
                i14 = 0;
            }
            int i73 = i72 + i14;
            if (message.parent_id != null) {
                i15 = ProtoAdapter.STRING.encodedSizeWithTag(33, message.parent_id);
            } else {
                i15 = 0;
            }
            int i74 = i73 + i15;
            if (message.is_at_me != null) {
                i16 = ProtoAdapter.BOOL.encodedSizeWithTag(34, message.is_at_me);
            } else {
                i16 = 0;
            }
            int i75 = i74 + i16;
            if (message.is_at_all != null) {
                i17 = ProtoAdapter.BOOL.encodedSizeWithTag(35, message.is_at_all);
            } else {
                i17 = 0;
            }
            int i76 = i75 + i17;
            if (message.is_truncated != null) {
                i18 = ProtoAdapter.BOOL.encodedSizeWithTag(36, message.is_truncated);
            } else {
                i18 = 0;
            }
            int i77 = i76 + i18;
            if (message.read_count != null) {
                i19 = ProtoAdapter.INT32.encodedSizeWithTag(37, message.read_count);
            } else {
                i19 = 0;
            }
            int encodedSizeWithTag3 = i77 + i19 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(38, message.unread_chatter_ids);
            if (message.text_draft_id != null) {
                i20 = ProtoAdapter.STRING.encodedSizeWithTag(39, message.text_draft_id);
            } else {
                i20 = 0;
            }
            int i78 = encodedSizeWithTag3 + i20;
            if (message.post_draft_id != null) {
                i21 = ProtoAdapter.STRING.encodedSizeWithTag(40, message.post_draft_id);
            } else {
                i21 = 0;
            }
            int i79 = i78 + i21;
            if (message.is_file_deleted != null) {
                i22 = ProtoAdapter.BOOL.encodedSizeWithTag(41, message.is_file_deleted);
            } else {
                i22 = 0;
            }
            int i80 = i79 + i22;
            if (message.is_deleted != null) {
                i23 = ProtoAdapter.BOOL.encodedSizeWithTag(42, message.is_deleted);
            } else {
                i23 = 0;
            }
            int i81 = i80 + i23;
            if (message.from_type != null) {
                i24 = FromType.ADAPTER.encodedSizeWithTag(43, message.from_type);
            } else {
                i24 = 0;
            }
            int i82 = i81 + i24;
            if (message.doc_key != null) {
                i25 = ProtoAdapter.STRING.encodedSizeWithTag(44, message.doc_key);
            } else {
                i25 = 0;
            }
            int encodedSizeWithTag4 = i82 + i25 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(45, message.unack_urgent_chatter_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(46, message.ack_urgent_chatter_ids);
            if (message.channel != null) {
                i26 = Channel.ADAPTER.encodedSizeWithTag(47, message.channel);
            } else {
                i26 = 0;
            }
            int i83 = encodedSizeWithTag4 + i26;
            if (message.is_visible != null) {
                i27 = ProtoAdapter.BOOL.encodedSizeWithTag(48, message.is_visible);
            } else {
                i27 = 0;
            }
            int i84 = i83 + i27;
            if (message.burn_life != null) {
                i28 = ProtoAdapter.INT32.encodedSizeWithTag(49, message.burn_life);
            } else {
                i28 = 0;
            }
            int i85 = i84 + i28;
            if (message.burn_time != null) {
                i29 = ProtoAdapter.INT64.encodedSizeWithTag(50, message.burn_time);
            } else {
                i29 = 0;
            }
            int i86 = i85 + i29;
            if (message.thread_position != null) {
                i30 = ProtoAdapter.INT32.encodedSizeWithTag(51, message.thread_position);
            } else {
                i30 = 0;
            }
            int i87 = i86 + i30;
            if (message.source_type != null) {
                i31 = SourceType.ADAPTER.encodedSizeWithTag(52, message.source_type);
            } else {
                i31 = 0;
            }
            int i88 = i87 + i31;
            if (message.source_id != null) {
                i32 = ProtoAdapter.STRING.encodedSizeWithTag(53, message.source_id);
            } else {
                i32 = 0;
            }
            int i89 = i88 + i32;
            if (message.translate_language != null) {
                i33 = ProtoAdapter.STRING.encodedSizeWithTag(54, message.translate_language);
            } else {
                i33 = 0;
            }
            int i90 = i89 + i33;
            if (message.recaller_id != null) {
                i34 = ProtoAdapter.STRING.encodedSizeWithTag(55, message.recaller_id);
            } else {
                i34 = 0;
            }
            int i91 = i90 + i34;
            if (message.recaller_identity != null) {
                i35 = RecallerIdentity.ADAPTER.encodedSizeWithTag(56, message.recaller_identity);
            } else {
                i35 = 0;
            }
            int i92 = i91 + i35;
            if (message.pin != null) {
                i36 = Pin.ADAPTER.encodedSizeWithTag(57, message.pin);
            } else {
                i36 = 0;
            }
            int i93 = i92 + i36;
            if (message.badge_count != null) {
                i37 = ProtoAdapter.INT32.encodedSizeWithTag(58, message.badge_count);
            } else {
                i37 = 0;
            }
            int i94 = i93 + i37;
            if (message.is_reeditable != null) {
                i38 = ProtoAdapter.BOOL.encodedSizeWithTag(59, message.is_reeditable);
            } else {
                i38 = 0;
            }
            int i95 = i94 + i38;
            if (message.is_badged != null) {
                i39 = ProtoAdapter.BOOL.encodedSizeWithTag(60, message.is_badged);
            } else {
                i39 = 0;
            }
            int i96 = i95 + i39;
            if (message.is_untranslateable != null) {
                i40 = ProtoAdapter.BOOL.encodedSizeWithTag(61, message.is_untranslateable);
            } else {
                i40 = 0;
            }
            int encodedSizeWithTag5 = i96 + i40 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(62, message.read_at_chatter_ids);
            if (message.thread_badge_count != null) {
                i41 = ProtoAdapter.INT32.encodedSizeWithTag(63, message.thread_badge_count);
            } else {
                i41 = 0;
            }
            int i97 = encodedSizeWithTag5 + i41;
            if (message.thread_reply_count != null) {
                i42 = ProtoAdapter.INT32.encodedSizeWithTag(64, message.thread_reply_count);
            } else {
                i42 = 0;
            }
            int encodedSizeWithTag6 = i97 + i42 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(65, message.at_out_chatter_ids);
            if (message.is_burned != null) {
                i43 = ProtoAdapter.BOOL.encodedSizeWithTag(66, message.is_burned);
            } else {
                i43 = 0;
            }
            int i98 = encodedSizeWithTag6 + i43;
            if (message.message_language != null) {
                i44 = ProtoAdapter.STRING.encodedSizeWithTag(67, message.message_language);
            } else {
                i44 = 0;
            }
            int i99 = i98 + i44;
            if (message.is_auto_translated_by_receiver != null) {
                i45 = ProtoAdapter.BOOL.encodedSizeWithTag(68, message.is_auto_translated_by_receiver);
            } else {
                i45 = 0;
            }
            int i100 = i99 + i45;
            if (message.is_no_trace_deleted != null) {
                i46 = ProtoAdapter.BOOL.encodedSizeWithTag(69, message.is_no_trace_deleted);
            } else {
                i46 = 0;
            }
            int i101 = i100 + i46;
            if (message.origin_badge_count != null) {
                i47 = ProtoAdapter.INT32.encodedSizeWithTag(70, message.origin_badge_count);
            } else {
                i47 = 0;
            }
            int i102 = i101 + i47;
            if (message.origin_thread_badge_count != null) {
                i48 = ProtoAdapter.INT32.encodedSizeWithTag(71, message.origin_thread_badge_count);
            } else {
                i48 = 0;
            }
            int i103 = i102 + i48;
            if (message.sensitivity != null) {
                i49 = MessageSensitivity.ADAPTER.encodedSizeWithTag(72, message.sensitivity);
            } else {
                i49 = 0;
            }
            int i104 = i103 + i49;
            if (message.crypto_token != null) {
                i50 = ProtoAdapter.STRING.encodedSizeWithTag(73, message.crypto_token);
            } else {
                i50 = 0;
            }
            int i105 = i104 + i50;
            if (message.translate_message_display_rule != null) {
                i51 = TranslateMessageDisplayRule.ADAPTER.encodedSizeWithTag(80, message.translate_message_display_rule);
            } else {
                i51 = 0;
            }
            int i106 = i105 + i51;
            if (message.is_manual_translated != null) {
                i52 = ProtoAdapter.BOOL.encodedSizeWithTag(81, message.is_manual_translated);
            } else {
                i52 = 0;
            }
            int i107 = i106 + i52;
            if (message.original_sender_id != null) {
                i53 = ProtoAdapter.STRING.encodedSizeWithTag(82, message.original_sender_id);
            } else {
                i53 = 0;
            }
            int i108 = i107 + i53;
            if (message.forward_from_friend != null) {
                i54 = ProtoAdapter.BOOL.encodedSizeWithTag(83, message.forward_from_friend);
            } else {
                i54 = 0;
            }
            int i109 = i108 + i54;
            if (message.static_resource_message_recalled != null) {
                i55 = ProtoAdapter.BOOL.encodedSizeWithTag(84, message.static_resource_message_recalled);
            } else {
                i55 = 0;
            }
            int i110 = i109 + i55;
            if (message.is_crypto_intermediate != null) {
                i56 = ProtoAdapter.BOOL.encodedSizeWithTag(85, message.is_crypto_intermediate);
            } else {
                i56 = 0;
            }
            int encodedSizeWithTag7 = i110 + i56 + this.f39921a.encodedSizeWithTag(86, message.image_translation_ability);
            if (message.is_special_focus != null) {
                i57 = ProtoAdapter.BOOL.encodedSizeWithTag(87, message.is_special_focus);
            } else {
                i57 = 0;
            }
            int i111 = encodedSizeWithTag7 + i57;
            if (message.file_deleted_status != null) {
                i58 = FileDeletedStatus.ADAPTER.encodedSizeWithTag(90, message.file_deleted_status);
            } else {
                i58 = 0;
            }
            int i112 = i111 + i58;
            if (message.sync_dependency != null) {
                i59 = ProtoAdapter.BOOL.encodedSizeWithTag(100, message.sync_dependency);
            } else {
                i59 = 0;
            }
            int i113 = i112 + i59;
            if (message.anonymous_info != null) {
                i60 = AnonymousInfo.ADAPTER.encodedSizeWithTag(101, message.anonymous_info);
            }
            return i113 + i60 + message.unknownFields().size();
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Message message) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, message.id);
            Type.ADAPTER.encodeWithTag(protoWriter, 2, message.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, message.chat_id);
            if (message.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, message.thread_id);
            }
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, message.create_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, message.update_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, message.root_id);
            Content.ADAPTER.encodeWithTag(protoWriter, 8, message.content);
            Reaction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, message.reactions);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, message.unread_count);
            if (message.from_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 20, message.from_id);
            }
            if (message.should_notify != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 21, message.should_notify);
            }
            if (message.is_recalled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 22, message.is_recalled);
            }
            if (message.is_edited != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 23, message.is_edited);
            }
            if (message.reply_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 24, message.reply_count);
            }
            if (message.position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 25, message.position);
            }
            if (message.cid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 26, message.cid);
            }
            if (message.me_read != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 27, message.me_read);
            }
            if (message.reminder_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 28, message.reminder_id);
            }
            if (message.parent_source_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 29, message.parent_source_id);
            }
            if (message.root_source_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 30, message.root_source_id);
            }
            if (message.is_urgent != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 31, message.is_urgent);
            }
            if (message.urgent_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 32, message.urgent_id);
            }
            if (message.parent_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 33, message.parent_id);
            }
            if (message.is_at_me != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 34, message.is_at_me);
            }
            if (message.is_at_all != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 35, message.is_at_all);
            }
            if (message.is_truncated != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 36, message.is_truncated);
            }
            if (message.read_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 37, message.read_count);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 38, message.unread_chatter_ids);
            if (message.text_draft_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 39, message.text_draft_id);
            }
            if (message.post_draft_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 40, message.post_draft_id);
            }
            if (message.is_file_deleted != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 41, message.is_file_deleted);
            }
            if (message.is_deleted != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 42, message.is_deleted);
            }
            if (message.from_type != null) {
                FromType.ADAPTER.encodeWithTag(protoWriter, 43, message.from_type);
            }
            if (message.doc_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 44, message.doc_key);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 45, message.unack_urgent_chatter_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 46, message.ack_urgent_chatter_ids);
            if (message.channel != null) {
                Channel.ADAPTER.encodeWithTag(protoWriter, 47, message.channel);
            }
            if (message.is_visible != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 48, message.is_visible);
            }
            if (message.burn_life != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 49, message.burn_life);
            }
            if (message.burn_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 50, message.burn_time);
            }
            if (message.thread_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 51, message.thread_position);
            }
            if (message.source_type != null) {
                SourceType.ADAPTER.encodeWithTag(protoWriter, 52, message.source_type);
            }
            if (message.source_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 53, message.source_id);
            }
            if (message.translate_language != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 54, message.translate_language);
            }
            if (message.recaller_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 55, message.recaller_id);
            }
            if (message.recaller_identity != null) {
                RecallerIdentity.ADAPTER.encodeWithTag(protoWriter, 56, message.recaller_identity);
            }
            if (message.pin != null) {
                Pin.ADAPTER.encodeWithTag(protoWriter, 57, message.pin);
            }
            if (message.badge_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 58, message.badge_count);
            }
            if (message.is_reeditable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 59, message.is_reeditable);
            }
            if (message.is_badged != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 60, message.is_badged);
            }
            if (message.is_untranslateable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 61, message.is_untranslateable);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 62, message.read_at_chatter_ids);
            if (message.thread_badge_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 63, message.thread_badge_count);
            }
            if (message.thread_reply_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 64, message.thread_reply_count);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 65, message.at_out_chatter_ids);
            if (message.is_burned != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 66, message.is_burned);
            }
            if (message.message_language != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 67, message.message_language);
            }
            if (message.is_auto_translated_by_receiver != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 68, message.is_auto_translated_by_receiver);
            }
            if (message.is_no_trace_deleted != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 69, message.is_no_trace_deleted);
            }
            if (message.origin_badge_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 70, message.origin_badge_count);
            }
            if (message.origin_thread_badge_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 71, message.origin_thread_badge_count);
            }
            if (message.sensitivity != null) {
                MessageSensitivity.ADAPTER.encodeWithTag(protoWriter, 72, message.sensitivity);
            }
            if (message.crypto_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 73, message.crypto_token);
            }
            if (message.translate_message_display_rule != null) {
                TranslateMessageDisplayRule.ADAPTER.encodeWithTag(protoWriter, 80, message.translate_message_display_rule);
            }
            if (message.is_manual_translated != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 81, message.is_manual_translated);
            }
            if (message.original_sender_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 82, message.original_sender_id);
            }
            if (message.forward_from_friend != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 83, message.forward_from_friend);
            }
            if (message.static_resource_message_recalled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 84, message.static_resource_message_recalled);
            }
            if (message.is_crypto_intermediate != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 85, message.is_crypto_intermediate);
            }
            this.f39921a.encodeWithTag(protoWriter, 86, message.image_translation_ability);
            if (message.is_special_focus != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 87, message.is_special_focus);
            }
            if (message.file_deleted_status != null) {
                FileDeletedStatus.ADAPTER.encodeWithTag(protoWriter, 90, message.file_deleted_status);
            }
            if (message.sync_dependency != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 100, message.sync_dependency);
            }
            if (message.anonymous_info != null) {
                AnonymousInfo.ADAPTER.encodeWithTag(protoWriter, 101, message.anonymous_info);
            }
            protoWriter.writeBytes(message.unknownFields());
        }
    }

    public static final class AnonymousInfo extends com.squareup.wire.Message<AnonymousInfo, C15067a> {
        public static final ProtoAdapter<AnonymousInfo> ADAPTER = new C15068b();
        public static final Boolean DEFAULT_IS_ANONYMOUS = false;
        public static final Boolean DEFAULT_IS_SENDER = false;
        private static final long serialVersionUID = 0;
        public final Boolean is_anonymous;
        public final Boolean is_sender;

        /* renamed from: com.bytedance.lark.pb.basic.v1.Message$AnonymousInfo$b */
        private static final class C15068b extends ProtoAdapter<AnonymousInfo> {
            C15068b() {
                super(FieldEncoding.LENGTH_DELIMITED, AnonymousInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(AnonymousInfo anonymousInfo) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, anonymousInfo.is_anonymous);
                if (anonymousInfo.is_sender != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(2, anonymousInfo.is_sender);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + anonymousInfo.unknownFields().size();
            }

            /* renamed from: a */
            public AnonymousInfo decode(ProtoReader protoReader) throws IOException {
                C15067a aVar = new C15067a();
                aVar.f39861a = false;
                aVar.f39862b = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f39861a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39862b = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AnonymousInfo anonymousInfo) throws IOException {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, anonymousInfo.is_anonymous);
                if (anonymousInfo.is_sender != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, anonymousInfo.is_sender);
                }
                protoWriter.writeBytes(anonymousInfo.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Message$AnonymousInfo$a */
        public static final class C15067a extends Message.Builder<AnonymousInfo, C15067a> {

            /* renamed from: a */
            public Boolean f39861a;

            /* renamed from: b */
            public Boolean f39862b;

            /* renamed from: a */
            public AnonymousInfo build() {
                Boolean bool = this.f39861a;
                if (bool != null) {
                    return new AnonymousInfo(bool, this.f39862b, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(bool, "is_anonymous");
            }
        }

        @Override // com.squareup.wire.Message
        public C15067a newBuilder() {
            C15067a aVar = new C15067a();
            aVar.f39861a = this.is_anonymous;
            aVar.f39862b = this.is_sender;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "AnonymousInfo");
            StringBuilder sb = new StringBuilder();
            sb.append(", is_anonymous=");
            sb.append(this.is_anonymous);
            if (this.is_sender != null) {
                sb.append(", is_sender=");
                sb.append(this.is_sender);
            }
            StringBuilder replace = sb.replace(0, 2, "AnonymousInfo{");
            replace.append('}');
            return replace.toString();
        }

        public AnonymousInfo(Boolean bool, Boolean bool2) {
            this(bool, bool2, ByteString.EMPTY);
        }

        public AnonymousInfo(Boolean bool, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.is_anonymous = bool;
            this.is_sender = bool2;
        }
    }

    public static final class Pin extends com.squareup.wire.Message<Pin, C15069a> {
        public static final ProtoAdapter<Pin> ADAPTER = new C15070b();
        public static final Long DEFAULT_TIMESTAMP = 0L;
        private static final long serialVersionUID = 0;
        public final String id;
        public final String operator_id;
        public final Long timestamp;

        /* renamed from: com.bytedance.lark.pb.basic.v1.Message$Pin$b */
        private static final class C15070b extends ProtoAdapter<Pin> {
            C15070b() {
                super(FieldEncoding.LENGTH_DELIMITED, Pin.class);
            }

            /* renamed from: a */
            public int encodedSize(Pin pin) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, pin.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, pin.operator_id);
                if (pin.timestamp != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(3, pin.timestamp);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + pin.unknownFields().size();
            }

            /* renamed from: a */
            public Pin decode(ProtoReader protoReader) throws IOException {
                C15069a aVar = new C15069a();
                aVar.f39863a = "";
                aVar.f39864b = "";
                aVar.f39865c = 0L;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f39863a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f39864b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39865c = ProtoAdapter.INT64.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Pin pin) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pin.id);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pin.operator_id);
                if (pin.timestamp != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, pin.timestamp);
                }
                protoWriter.writeBytes(pin.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15069a newBuilder() {
            C15069a aVar = new C15069a();
            aVar.f39863a = this.id;
            aVar.f39864b = this.operator_id;
            aVar.f39865c = this.timestamp;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Message$Pin$a */
        public static final class C15069a extends Message.Builder<Pin, C15069a> {

            /* renamed from: a */
            public String f39863a;

            /* renamed from: b */
            public String f39864b;

            /* renamed from: c */
            public Long f39865c;

            /* renamed from: a */
            public Pin build() {
                String str;
                String str2 = this.f39863a;
                if (str2 != null && (str = this.f39864b) != null) {
                    return new Pin(str2, str, this.f39865c, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str2, "id", this.f39864b, "operator_id");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "Pin");
            StringBuilder sb = new StringBuilder();
            sb.append(", id=");
            sb.append(this.id);
            sb.append(", operator_id=");
            sb.append(this.operator_id);
            if (this.timestamp != null) {
                sb.append(", timestamp=");
                sb.append(this.timestamp);
            }
            StringBuilder replace = sb.replace(0, 2, "Pin{");
            replace.append('}');
            return replace.toString();
        }

        public Pin(String str, String str2, Long l) {
            this(str, str2, l, ByteString.EMPTY);
        }

        public Pin(String str, String str2, Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            this.id = str;
            this.operator_id = str2;
            this.timestamp = l;
        }
    }

    public static final class Reaction extends com.squareup.wire.Message<Reaction, C15071a> {
        public static final ProtoAdapter<Reaction> ADAPTER = new C15072b();
        public static final Integer DEFAULT_CHATTER_COUNT = 0;
        private static final long serialVersionUID = 0;
        public final Integer chatter_count;
        public final List<String> chatter_ids;
        public final String type;

        /* renamed from: com.bytedance.lark.pb.basic.v1.Message$Reaction$b */
        private static final class C15072b extends ProtoAdapter<Reaction> {
            C15072b() {
                super(FieldEncoding.LENGTH_DELIMITED, Reaction.class);
            }

            /* renamed from: a */
            public int encodedSize(Reaction reaction) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, reaction.type) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, reaction.chatter_ids);
                if (reaction.chatter_count != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(3, reaction.chatter_count);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + reaction.unknownFields().size();
            }

            /* renamed from: a */
            public Reaction decode(ProtoReader protoReader) throws IOException {
                C15071a aVar = new C15071a();
                aVar.f39866a = "";
                aVar.f39868c = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f39866a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f39867b.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39868c = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Reaction reaction) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, reaction.type);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, reaction.chatter_ids);
                if (reaction.chatter_count != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, reaction.chatter_count);
                }
                protoWriter.writeBytes(reaction.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15071a newBuilder() {
            C15071a aVar = new C15071a();
            aVar.f39866a = this.type;
            aVar.f39867b = Internal.copyOf("chatter_ids", this.chatter_ids);
            aVar.f39868c = this.chatter_count;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Message$Reaction$a */
        public static final class C15071a extends Message.Builder<Reaction, C15071a> {

            /* renamed from: a */
            public String f39866a;

            /* renamed from: b */
            public List<String> f39867b = Internal.newMutableList();

            /* renamed from: c */
            public Integer f39868c;

            /* renamed from: a */
            public Reaction build() {
                String str = this.f39866a;
                if (str != null) {
                    return new Reaction(str, this.f39867b, this.f39868c, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, ShareHitPoint.f121869d);
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "Reaction");
            StringBuilder sb = new StringBuilder();
            sb.append(", type=");
            sb.append(this.type);
            if (!this.chatter_ids.isEmpty()) {
                sb.append(", chatter_ids=");
                sb.append(this.chatter_ids);
            }
            if (this.chatter_count != null) {
                sb.append(", chatter_count=");
                sb.append(this.chatter_count);
            }
            StringBuilder replace = sb.replace(0, 2, "Reaction{");
            replace.append('}');
            return replace.toString();
        }

        public Reaction(String str, List<String> list, Integer num) {
            this(str, list, num, ByteString.EMPTY);
        }

        public Reaction(String str, List<String> list, Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            this.type = str;
            this.chatter_ids = Internal.immutableCopyOf("chatter_ids", list);
            this.chatter_count = num;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Message$a */
    public static final class C15073a extends Message.Builder<Message, C15073a> {

        /* renamed from: A */
        public Boolean f39869A;

        /* renamed from: B */
        public Integer f39870B;

        /* renamed from: C */
        public List<String> f39871C = Internal.newMutableList();

        /* renamed from: D */
        public String f39872D;

        /* renamed from: E */
        public String f39873E;

        /* renamed from: F */
        public Boolean f39874F;

        /* renamed from: G */
        public Boolean f39875G;

        /* renamed from: H */
        public FromType f39876H;

        /* renamed from: I */
        public String f39877I;

        /* renamed from: J */
        public List<String> f39878J = Internal.newMutableList();

        /* renamed from: K */
        public List<String> f39879K = Internal.newMutableList();

        /* renamed from: L */
        public Channel f39880L;

        /* renamed from: M */
        public Boolean f39881M;

        /* renamed from: N */
        public Integer f39882N;

        /* renamed from: O */
        public Long f39883O;

        /* renamed from: P */
        public Integer f39884P;

        /* renamed from: Q */
        public SourceType f39885Q;

        /* renamed from: R */
        public String f39886R;

        /* renamed from: S */
        public String f39887S;

        /* renamed from: T */
        public String f39888T;

        /* renamed from: U */
        public RecallerIdentity f39889U;

        /* renamed from: V */
        public Pin f39890V;

        /* renamed from: W */
        public Integer f39891W;

        /* renamed from: X */
        public Boolean f39892X;

        /* renamed from: Y */
        public Boolean f39893Y;

        /* renamed from: Z */
        public Boolean f39894Z;

        /* renamed from: a */
        public String f39895a;
        public List<String> aa = Internal.newMutableList();
        public Integer ab;
        public Integer ac;
        public List<String> ad = Internal.newMutableList();
        public Boolean ae;
        public String af;
        public Boolean ag;
        public Boolean ah;

        /* renamed from: ai  reason: collision with root package name */
        public Integer f175428ai;
        public Integer aj;
        public MessageSensitivity ak;
        public String al;
        public TranslateMessageDisplayRule am;
        public Boolean an;
        public String ao;
        public Boolean ap;
        public Boolean aq;
        public Boolean ar;
        public Map<String, ImageTranslationAbility> as = Internal.newMutableMap();
        public Boolean at;
        public FileDeletedStatus au;
        public Boolean av;
        public AnonymousInfo aw;

        /* renamed from: b */
        public Type f39896b;

        /* renamed from: c */
        public String f39897c;

        /* renamed from: d */
        public String f39898d;

        /* renamed from: e */
        public Long f39899e;

        /* renamed from: f */
        public Long f39900f;

        /* renamed from: g */
        public String f39901g;

        /* renamed from: h */
        public Content f39902h;

        /* renamed from: i */
        public List<Reaction> f39903i = Internal.newMutableList();

        /* renamed from: j */
        public Integer f39904j;

        /* renamed from: k */
        public String f39905k;

        /* renamed from: l */
        public Boolean f39906l;

        /* renamed from: m */
        public Boolean f39907m;

        /* renamed from: n */
        public Boolean f39908n;

        /* renamed from: o */
        public Integer f39909o;

        /* renamed from: p */
        public Integer f39910p;

        /* renamed from: q */
        public String f39911q;

        /* renamed from: r */
        public Boolean f39912r;

        /* renamed from: s */
        public String f39913s;

        /* renamed from: t */
        public String f39914t;

        /* renamed from: u */
        public String f39915u;

        /* renamed from: v */
        public Boolean f39916v;

        /* renamed from: w */
        public String f39917w;

        /* renamed from: x */
        public String f39918x;

        /* renamed from: y */
        public Boolean f39919y;

        /* renamed from: z */
        public Boolean f39920z;

        /* renamed from: a */
        public Message build() {
            Type type;
            String str;
            Long l;
            Long l2;
            String str2;
            Content content;
            Integer num;
            String str3 = this.f39895a;
            if (str3 != null && (type = this.f39896b) != null && (str = this.f39897c) != null && (l = this.f39899e) != null && (l2 = this.f39900f) != null && (str2 = this.f39901g) != null && (content = this.f39902h) != null && (num = this.f39904j) != null) {
                return new Message(str3, type, str, this.f39898d, l, l2, str2, content, this.f39903i, num, this.f39905k, this.f39906l, this.f39907m, this.f39908n, this.f39909o, this.f39910p, this.f39911q, this.f39912r, this.f39913s, this.f39914t, this.f39915u, this.f39916v, this.f39917w, this.f39918x, this.f39919y, this.f39920z, this.f39869A, this.f39870B, this.f39871C, this.f39872D, this.f39873E, this.f39874F, this.f39875G, this.f39876H, this.f39877I, this.f39878J, this.f39879K, this.f39880L, this.f39881M, this.f39882N, this.f39883O, this.f39884P, this.f39885Q, this.f39886R, this.f39887S, this.f39888T, this.f39889U, this.f39890V, this.f39891W, this.f39892X, this.f39893Y, this.f39894Z, this.aa, this.ab, this.ac, this.ad, this.ae, this.af, this.ag, this.ah, this.f175428ai, this.aj, this.ak, this.al, this.am, this.an, this.ao, this.ap, this.aq, this.ar, this.as, this.at, this.au, this.av, this.aw, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str3, "id", this.f39896b, ShareHitPoint.f121869d, this.f39897c, "chat_id", this.f39899e, "create_time", this.f39900f, "update_time", this.f39901g, "root_id", this.f39902h, "content", this.f39904j, "unread_count");
        }
    }

    @Override // com.squareup.wire.Message
    public C15073a newBuilder() {
        C15073a aVar = new C15073a();
        aVar.f39895a = this.id;
        aVar.f39896b = this.type;
        aVar.f39897c = this.chat_id;
        aVar.f39898d = this.thread_id;
        aVar.f39899e = this.create_time;
        aVar.f39900f = this.update_time;
        aVar.f39901g = this.root_id;
        aVar.f39902h = this.content;
        aVar.f39903i = Internal.copyOf("reactions", this.reactions);
        aVar.f39904j = this.unread_count;
        aVar.f39905k = this.from_id;
        aVar.f39906l = this.should_notify;
        aVar.f39907m = this.is_recalled;
        aVar.f39908n = this.is_edited;
        aVar.f39909o = this.reply_count;
        aVar.f39910p = this.position;
        aVar.f39911q = this.cid;
        aVar.f39912r = this.me_read;
        aVar.f39913s = this.reminder_id;
        aVar.f39914t = this.parent_source_id;
        aVar.f39915u = this.root_source_id;
        aVar.f39916v = this.is_urgent;
        aVar.f39917w = this.urgent_id;
        aVar.f39918x = this.parent_id;
        aVar.f39919y = this.is_at_me;
        aVar.f39920z = this.is_at_all;
        aVar.f39869A = this.is_truncated;
        aVar.f39870B = this.read_count;
        aVar.f39871C = Internal.copyOf("unread_chatter_ids", this.unread_chatter_ids);
        aVar.f39872D = this.text_draft_id;
        aVar.f39873E = this.post_draft_id;
        aVar.f39874F = this.is_file_deleted;
        aVar.f39875G = this.is_deleted;
        aVar.f39876H = this.from_type;
        aVar.f39877I = this.doc_key;
        aVar.f39878J = Internal.copyOf("unack_urgent_chatter_ids", this.unack_urgent_chatter_ids);
        aVar.f39879K = Internal.copyOf("ack_urgent_chatter_ids", this.ack_urgent_chatter_ids);
        aVar.f39880L = this.channel;
        aVar.f39881M = this.is_visible;
        aVar.f39882N = this.burn_life;
        aVar.f39883O = this.burn_time;
        aVar.f39884P = this.thread_position;
        aVar.f39885Q = this.source_type;
        aVar.f39886R = this.source_id;
        aVar.f39887S = this.translate_language;
        aVar.f39888T = this.recaller_id;
        aVar.f39889U = this.recaller_identity;
        aVar.f39890V = this.pin;
        aVar.f39891W = this.badge_count;
        aVar.f39892X = this.is_reeditable;
        aVar.f39893Y = this.is_badged;
        aVar.f39894Z = this.is_untranslateable;
        aVar.aa = Internal.copyOf("read_at_chatter_ids", this.read_at_chatter_ids);
        aVar.ab = this.thread_badge_count;
        aVar.ac = this.thread_reply_count;
        aVar.ad = Internal.copyOf("at_out_chatter_ids", this.at_out_chatter_ids);
        aVar.ae = this.is_burned;
        aVar.af = this.message_language;
        aVar.ag = this.is_auto_translated_by_receiver;
        aVar.ah = this.is_no_trace_deleted;
        aVar.f175428ai = this.origin_badge_count;
        aVar.aj = this.origin_thread_badge_count;
        aVar.ak = this.sensitivity;
        aVar.al = this.crypto_token;
        aVar.am = this.translate_message_display_rule;
        aVar.an = this.is_manual_translated;
        aVar.ao = this.original_sender_id;
        aVar.ap = this.forward_from_friend;
        aVar.aq = this.static_resource_message_recalled;
        aVar.ar = this.is_crypto_intermediate;
        aVar.as = Internal.copyOf("image_translation_ability", this.image_translation_ability);
        aVar.at = this.is_special_focus;
        aVar.au = this.file_deleted_status;
        aVar.av = this.sync_dependency;
        aVar.aw = this.anonymous_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Message");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        sb.append(", create_time=");
        sb.append(this.create_time);
        sb.append(", update_time=");
        sb.append(this.update_time);
        sb.append(", root_id=");
        sb.append(this.root_id);
        sb.append(", content=");
        sb.append(this.content);
        if (!this.reactions.isEmpty()) {
            sb.append(", reactions=");
            sb.append(this.reactions);
        }
        sb.append(", unread_count=");
        sb.append(this.unread_count);
        if (this.from_id != null) {
            sb.append(", from_id=");
            sb.append(this.from_id);
        }
        if (this.should_notify != null) {
            sb.append(", should_notify=");
            sb.append(this.should_notify);
        }
        if (this.is_recalled != null) {
            sb.append(", is_recalled=");
            sb.append(this.is_recalled);
        }
        if (this.is_edited != null) {
            sb.append(", is_edited=");
            sb.append(this.is_edited);
        }
        if (this.reply_count != null) {
            sb.append(", reply_count=");
            sb.append(this.reply_count);
        }
        if (this.position != null) {
            sb.append(", position=");
            sb.append(this.position);
        }
        if (this.cid != null) {
            sb.append(", cid=");
            sb.append(this.cid);
        }
        if (this.me_read != null) {
            sb.append(", me_read=");
            sb.append(this.me_read);
        }
        if (this.reminder_id != null) {
            sb.append(", reminder_id=");
            sb.append(this.reminder_id);
        }
        if (this.parent_source_id != null) {
            sb.append(", parent_source_id=");
            sb.append(this.parent_source_id);
        }
        if (this.root_source_id != null) {
            sb.append(", root_source_id=");
            sb.append(this.root_source_id);
        }
        if (this.is_urgent != null) {
            sb.append(", is_urgent=");
            sb.append(this.is_urgent);
        }
        if (this.urgent_id != null) {
            sb.append(", urgent_id=");
            sb.append(this.urgent_id);
        }
        if (this.parent_id != null) {
            sb.append(", parent_id=");
            sb.append(this.parent_id);
        }
        if (this.is_at_me != null) {
            sb.append(", is_at_me=");
            sb.append(this.is_at_me);
        }
        if (this.is_at_all != null) {
            sb.append(", is_at_all=");
            sb.append(this.is_at_all);
        }
        if (this.is_truncated != null) {
            sb.append(", is_truncated=");
            sb.append(this.is_truncated);
        }
        if (this.read_count != null) {
            sb.append(", read_count=");
            sb.append(this.read_count);
        }
        if (!this.unread_chatter_ids.isEmpty()) {
            sb.append(", unread_chatter_ids=");
            sb.append(this.unread_chatter_ids);
        }
        if (this.text_draft_id != null) {
            sb.append(", text_draft_id=");
            sb.append(this.text_draft_id);
        }
        if (this.post_draft_id != null) {
            sb.append(", post_draft_id=");
            sb.append(this.post_draft_id);
        }
        if (this.is_file_deleted != null) {
            sb.append(", is_file_deleted=");
            sb.append(this.is_file_deleted);
        }
        if (this.is_deleted != null) {
            sb.append(", is_deleted=");
            sb.append(this.is_deleted);
        }
        if (this.from_type != null) {
            sb.append(", from_type=");
            sb.append(this.from_type);
        }
        if (this.doc_key != null) {
            sb.append(", doc_key=");
            sb.append(this.doc_key);
        }
        if (!this.unack_urgent_chatter_ids.isEmpty()) {
            sb.append(", unack_urgent_chatter_ids=");
            sb.append(this.unack_urgent_chatter_ids);
        }
        if (!this.ack_urgent_chatter_ids.isEmpty()) {
            sb.append(", ack_urgent_chatter_ids=");
            sb.append(this.ack_urgent_chatter_ids);
        }
        if (this.channel != null) {
            sb.append(", channel=");
            sb.append(this.channel);
        }
        if (this.is_visible != null) {
            sb.append(", is_visible=");
            sb.append(this.is_visible);
        }
        if (this.burn_life != null) {
            sb.append(", burn_life=");
            sb.append(this.burn_life);
        }
        if (this.burn_time != null) {
            sb.append(", burn_time=");
            sb.append(this.burn_time);
        }
        if (this.thread_position != null) {
            sb.append(", thread_position=");
            sb.append(this.thread_position);
        }
        if (this.source_type != null) {
            sb.append(", source_type=");
            sb.append(this.source_type);
        }
        if (this.source_id != null) {
            sb.append(", source_id=");
            sb.append(this.source_id);
        }
        if (this.translate_language != null) {
            sb.append(", translate_language=");
            sb.append(this.translate_language);
        }
        if (this.recaller_id != null) {
            sb.append(", recaller_id=");
            sb.append(this.recaller_id);
        }
        if (this.recaller_identity != null) {
            sb.append(", recaller_identity=");
            sb.append(this.recaller_identity);
        }
        if (this.pin != null) {
            sb.append(", pin=");
            sb.append(this.pin);
        }
        if (this.badge_count != null) {
            sb.append(", badge_count=");
            sb.append(this.badge_count);
        }
        if (this.is_reeditable != null) {
            sb.append(", is_reeditable=");
            sb.append(this.is_reeditable);
        }
        if (this.is_badged != null) {
            sb.append(", is_badged=");
            sb.append(this.is_badged);
        }
        if (this.is_untranslateable != null) {
            sb.append(", is_untranslateable=");
            sb.append(this.is_untranslateable);
        }
        if (!this.read_at_chatter_ids.isEmpty()) {
            sb.append(", read_at_chatter_ids=");
            sb.append(this.read_at_chatter_ids);
        }
        if (this.thread_badge_count != null) {
            sb.append(", thread_badge_count=");
            sb.append(this.thread_badge_count);
        }
        if (this.thread_reply_count != null) {
            sb.append(", thread_reply_count=");
            sb.append(this.thread_reply_count);
        }
        if (!this.at_out_chatter_ids.isEmpty()) {
            sb.append(", at_out_chatter_ids=");
            sb.append(this.at_out_chatter_ids);
        }
        if (this.is_burned != null) {
            sb.append(", is_burned=");
            sb.append(this.is_burned);
        }
        if (this.message_language != null) {
            sb.append(", message_language=");
            sb.append(this.message_language);
        }
        if (this.is_auto_translated_by_receiver != null) {
            sb.append(", is_auto_translated_by_receiver=");
            sb.append(this.is_auto_translated_by_receiver);
        }
        if (this.is_no_trace_deleted != null) {
            sb.append(", is_no_trace_deleted=");
            sb.append(this.is_no_trace_deleted);
        }
        if (this.origin_badge_count != null) {
            sb.append(", origin_badge_count=");
            sb.append(this.origin_badge_count);
        }
        if (this.origin_thread_badge_count != null) {
            sb.append(", origin_thread_badge_count=");
            sb.append(this.origin_thread_badge_count);
        }
        if (this.sensitivity != null) {
            sb.append(", sensitivity=");
            sb.append(this.sensitivity);
        }
        if (this.crypto_token != null) {
            sb.append(", crypto_token=");
            sb.append(this.crypto_token);
        }
        if (this.translate_message_display_rule != null) {
            sb.append(", translate_message_display_rule=");
            sb.append(this.translate_message_display_rule);
        }
        if (this.is_manual_translated != null) {
            sb.append(", is_manual_translated=");
            sb.append(this.is_manual_translated);
        }
        if (this.original_sender_id != null) {
            sb.append(", original_sender_id=");
            sb.append(this.original_sender_id);
        }
        if (this.forward_from_friend != null) {
            sb.append(", forward_from_friend=");
            sb.append(this.forward_from_friend);
        }
        if (this.static_resource_message_recalled != null) {
            sb.append(", static_resource_message_recalled=");
            sb.append(this.static_resource_message_recalled);
        }
        if (this.is_crypto_intermediate != null) {
            sb.append(", is_crypto_intermediate=");
            sb.append(this.is_crypto_intermediate);
        }
        if (!this.image_translation_ability.isEmpty()) {
            sb.append(", image_translation_ability=");
            sb.append(this.image_translation_ability);
        }
        if (this.is_special_focus != null) {
            sb.append(", is_special_focus=");
            sb.append(this.is_special_focus);
        }
        if (this.file_deleted_status != null) {
            sb.append(", file_deleted_status=");
            sb.append(this.file_deleted_status);
        }
        if (this.sync_dependency != null) {
            sb.append(", sync_dependency=");
            sb.append(this.sync_dependency);
        }
        if (this.anonymous_info != null) {
            sb.append(", anonymous_info=");
            sb.append(this.anonymous_info);
        }
        StringBuilder replace = sb.replace(0, 2, "Message{");
        replace.append('}');
        return replace.toString();
    }
}
