package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.File;
import com.google.android.gms.common.ConnectionResult;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.CameraPosition;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttm.player.MediaPlayer;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class Content extends Message<Content, C14856a> {
    public static final ProtoAdapter<Content> ADAPTER = new C14857b();
    public static final Integer DEFAULT_AUDIO2TEXT_START_TIME = 0;
    public static final FileType DEFAULT_DEPRECATED = FileType.DEFAULT;
    public static final Integer DEFAULT_DURATION = 0;
    public static final Long DEFAULT_EXPIRE_TIME = 0L;
    public static final File.Source DEFAULT_FILE_SOURCE = File.Source.LARK_SERVER;
    public static final Integer DEFAULT_HEIGHT = 0;
    public static final Boolean DEFAULT_HIDE_VOICE2TEXT = false;
    public static final Boolean DEFAULT_IS_ABLE_LAN_TRANS = false;
    public static final Boolean DEFAULT_IS_AUDIO_RECOGNIZE_FINISH = false;
    public static final Boolean DEFAULT_IS_AUDIO_WITH_TEXT = false;
    public static final Boolean DEFAULT_IS_FRIEND = false;
    public static final Boolean DEFAULT_IS_GROUP_ANNOUNCEMENT = false;
    public static final Boolean DEFAULT_IS_IN_MY_NUT_STORE = false;
    public static final Boolean DEFAULT_IS_ORIGIN_SOURCE = false;
    public static final Boolean DEFAULT_IS_TRY_USE_LAN_TRANS = false;
    public static final Boolean DEFAULT_IS_VOICE_CALL = false;
    public static final TransStatus DEFAULT_LAN_TRANS_STATUS = TransStatus.PENDING;
    public static final Long DEFAULT_ORIGIN_SENDER_ID = 0L;
    public static final Long DEFAULT_ORIGIN_SIZE = 0L;
    public static final Integer DEFAULT_SHARE_CHAT_LAST_STATE = 0;
    public static final Long DEFAULT_SIZE = 0L;
    public static final Integer DEFAULT_SYSTEM_MESSAGE_VERSION = 0;
    public static final SystemType DEFAULT_SYSTEM_TYPE = SystemType.UNKNOWN;
    public static final Integer DEFAULT_SYSTEM_TYPE_VALUE = 0;
    public static final TransIdentity DEFAULT_TRANS_IDENTITY = TransIdentity.OTHER;
    public static final Integer DEFAULT_WIDTH = 0;
    private static final long serialVersionUID = 0;
    public final Abbreviation abbreviation;
    public final List<File> attachments;
    public final Integer audio2text_start_time;
    public final String cache_file_path;
    public final CalendarContent calendar_content;
    public final CardContent card_content;
    public final Map<String, ContentValue> content_values;
    public final String crypto_token;
    public final FileType deprecated;
    public final DocEntity doc_entity;
    public final Integer duration;
    public final String e2ee_from_id;
    public final String e2ee_to_id;
    public final EmailSystemEvent event;
    public final Long expire_time;
    public final String file_path;
    public final File.Source file_source;
    public final String file_uri;
    public final String fs_unit;
    public final GeneralCalendarContent general_calendar_content;
    public final Integer height;
    public final Boolean hide_voice2text;
    public final HongbaoContent hongbao_content;
    public final HongbaoSystemContent hongbao_system_content;
    public final String i18n_title_key;
    public final ImageSet image;
    public final Boolean is_able_lan_trans;
    public final Boolean is_audio_recognize_finish;
    public final Boolean is_audio_with_text;
    public final Boolean is_friend;
    public final Boolean is_group_announcement;
    public final Boolean is_in_my_nut_store;
    public final Boolean is_origin_source;
    public final Boolean is_try_use_lan_trans;
    public final Boolean is_voice_call;
    public final Map<Integer, SystemMessageItemAction> item_actions;
    public final String join_token;
    public final String key;
    public final String lan_receiver_device_id;
    public final String lan_sender_device_id;
    public final TransStatus lan_trans_status;
    public final String lan_trans_status_text;
    public final String local_upload_id;
    public final LocationContent location_content;
    public final MediaContent media_content;
    public final MergeForwardContent merge_forward_content;
    public final String mime;
    public final String name;
    public final String namespace;
    public final Long origin_sender_id;
    public final String origin_sender_id_str;
    public final String origin_sender_name;
    public final Long origin_size;
    public final String origin_tos_key;
    public final List<PreviewUrlContent> preview_urls;
    public final List<String> resource_urls;
    public final RichText rich_text;
    public final ShareCalendarEventContent share_calendar_event_content;
    public final String share_chat_id;
    public final Integer share_chat_last_state;
    public final String share_chatter_id;
    public final ShareUserCardInfo share_user_card_info;
    public final Long size;
    public final String sticker_id;
    public final StickerInfo sticker_info;
    public final String sticker_set_id;
    public final Map<String, SystemContentValue> system_content_values;
    public final Integer system_message_version;
    public final SystemType system_type;
    public final Integer system_type_value;
    public final String template;
    public final String text;
    public final List<TextUrlContent> text_url_contents;
    public final String title;
    public final TodoOperationContent todo_operation_content;
    public final TransIdentity trans_identity;
    public final TransmitInfo transmit_info;
    public final String trigger_id;
    public final Map<String, ElementRefs> typed_element_refs;
    public final Map<String, UrlPreviewHangPoint> url_preview_hang_point_map;
    public final Map<String, String> values;
    public final String vc_duration_time;
    public final String vc_feedback_status;
    public final String vc_from_feedback_status;
    public final String vc_from_id;
    public final String vc_meeting_id;
    public final String vc_passcode;
    public final String vc_to_feedback_status;
    public final String vc_to_id;
    public final VideoChatContent videochat_content;
    public final String voice2text;
    public final Integer width;

    public static final class SystemMessageAction extends Message<SystemMessageAction, C14852a> {
        public static final ProtoAdapter<SystemMessageAction> ADAPTER = new C14853b();
        public static final ByteString DEFAULT_PAYLOAD = ByteString.EMPTY;
        public static final ActType DEFAULT_TYPE = ActType.UNKNOWN_ACT_TYPE;
        public static final Integer DEFAULT_TYPE_NUM = 0;
        private static final long serialVersionUID = 0;
        public final ByteString payload;
        public final ActType type;
        public final Integer type_num;

        public enum ActType implements WireEnum {
            UNKNOWN_ACT_TYPE(0),
            INVITE_AT_CHATTERS(1),
            URL(2);
            
            public static final ProtoAdapter<ActType> ADAPTER = ProtoAdapter.newEnumAdapter(ActType.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static ActType fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN_ACT_TYPE;
                }
                if (i == 1) {
                    return INVITE_AT_CHATTERS;
                }
                if (i != 2) {
                    return null;
                }
                return URL;
            }

            private ActType(int i) {
                this.value = i;
            }
        }

        public static final class InviteAtChatters extends Message<InviteAtChatters, C14848a> {
            public static final ProtoAdapter<InviteAtChatters> ADAPTER = new C14849b();
            private static final long serialVersionUID = 0;
            public final List<Long> at_chatter_ids;

            /* renamed from: com.bytedance.lark.pb.basic.v1.Content$SystemMessageAction$InviteAtChatters$b */
            private static final class C14849b extends ProtoAdapter<InviteAtChatters> {
                C14849b() {
                    super(FieldEncoding.LENGTH_DELIMITED, InviteAtChatters.class);
                }

                /* renamed from: a */
                public int encodedSize(InviteAtChatters inviteAtChatters) {
                    return ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(1, inviteAtChatters.at_chatter_ids) + inviteAtChatters.unknownFields().size();
                }

                /* renamed from: a */
                public InviteAtChatters decode(ProtoReader protoReader) throws IOException {
                    C14848a aVar = new C14848a();
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
                            aVar.f39221a.add(ProtoAdapter.INT64.decode(protoReader));
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, InviteAtChatters inviteAtChatters) throws IOException {
                    ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 1, inviteAtChatters.at_chatter_ids);
                    protoWriter.writeBytes(inviteAtChatters.unknownFields());
                }
            }

            /* renamed from: com.bytedance.lark.pb.basic.v1.Content$SystemMessageAction$InviteAtChatters$a */
            public static final class C14848a extends Message.Builder<InviteAtChatters, C14848a> {

                /* renamed from: a */
                public List<Long> f39221a = Internal.newMutableList();

                /* renamed from: a */
                public InviteAtChatters build() {
                    return new InviteAtChatters(this.f39221a, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C14848a newBuilder() {
                C14848a aVar = new C14848a();
                aVar.f39221a = Internal.copyOf("at_chatter_ids", this.at_chatter_ids);
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("basic", "InviteAtChatters");
                StringBuilder sb = new StringBuilder();
                if (!this.at_chatter_ids.isEmpty()) {
                    sb.append(", at_chatter_ids=");
                    sb.append(this.at_chatter_ids);
                }
                StringBuilder replace = sb.replace(0, 2, "InviteAtChatters{");
                replace.append('}');
                return replace.toString();
            }

            public InviteAtChatters(List<Long> list) {
                this(list, ByteString.EMPTY);
            }

            public InviteAtChatters(List<Long> list, ByteString byteString) {
                super(ADAPTER, byteString);
                this.at_chatter_ids = Internal.immutableCopyOf("at_chatter_ids", list);
            }
        }

        public static final class Url extends Message<Url, C14850a> {
            public static final ProtoAdapter<Url> ADAPTER = new C14851b();
            private static final long serialVersionUID = 0;

            /* renamed from: android  reason: collision with root package name */
            public final String f175426android;
            public final String common;
            public final String ios;
            public final String pc;
            public final String web;

            /* renamed from: com.bytedance.lark.pb.basic.v1.Content$SystemMessageAction$Url$b */
            private static final class C14851b extends ProtoAdapter<Url> {
                C14851b() {
                    super(FieldEncoding.LENGTH_DELIMITED, Url.class);
                }

                /* renamed from: a */
                public int encodedSize(Url url) {
                    int i;
                    int i2;
                    int i3;
                    int i4 = 0;
                    if (url.ios != null) {
                        i = ProtoAdapter.STRING.encodedSizeWithTag(1, url.ios);
                    } else {
                        i = 0;
                    }
                    if (url.f175426android != null) {
                        i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, url.f175426android);
                    } else {
                        i2 = 0;
                    }
                    int i5 = i + i2;
                    if (url.pc != null) {
                        i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, url.pc);
                    } else {
                        i3 = 0;
                    }
                    int i6 = i5 + i3;
                    if (url.web != null) {
                        i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, url.web);
                    }
                    return i6 + i4 + ProtoAdapter.STRING.encodedSizeWithTag(100, url.common) + url.unknownFields().size();
                }

                /* renamed from: a */
                public Url decode(ProtoReader protoReader) throws IOException {
                    C14850a aVar = new C14850a();
                    aVar.f39222a = "";
                    aVar.f39223b = "";
                    aVar.f39224c = "";
                    aVar.f39225d = "";
                    aVar.f39226e = "";
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag == -1) {
                            protoReader.endMessage(beginMessage);
                            return aVar.build();
                        } else if (nextTag == 1) {
                            aVar.f39222a = ProtoAdapter.STRING.decode(protoReader);
                        } else if (nextTag == 2) {
                            aVar.f39223b = ProtoAdapter.STRING.decode(protoReader);
                        } else if (nextTag == 3) {
                            aVar.f39224c = ProtoAdapter.STRING.decode(protoReader);
                        } else if (nextTag == 4) {
                            aVar.f39225d = ProtoAdapter.STRING.decode(protoReader);
                        } else if (nextTag != 100) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            aVar.f39226e = ProtoAdapter.STRING.decode(protoReader);
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, Url url) throws IOException {
                    if (url.ios != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, url.ios);
                    }
                    if (url.f175426android != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, url.f175426android);
                    }
                    if (url.pc != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, url.pc);
                    }
                    if (url.web != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, url.web);
                    }
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 100, url.common);
                    protoWriter.writeBytes(url.unknownFields());
                }
            }

            /* renamed from: com.bytedance.lark.pb.basic.v1.Content$SystemMessageAction$Url$a */
            public static final class C14850a extends Message.Builder<Url, C14850a> {

                /* renamed from: a */
                public String f39222a;

                /* renamed from: b */
                public String f39223b;

                /* renamed from: c */
                public String f39224c;

                /* renamed from: d */
                public String f39225d;

                /* renamed from: e */
                public String f39226e;

                /* renamed from: a */
                public Url build() {
                    String str = this.f39226e;
                    if (str != null) {
                        return new Url(this.f39222a, this.f39223b, this.f39224c, this.f39225d, str, super.buildUnknownFields());
                    }
                    throw Internal.missingRequiredFields(str, "common");
                }
            }

            @Override // com.squareup.wire.Message
            public C14850a newBuilder() {
                C14850a aVar = new C14850a();
                aVar.f39222a = this.ios;
                aVar.f39223b = this.f175426android;
                aVar.f39224c = this.pc;
                aVar.f39225d = this.web;
                aVar.f39226e = this.common;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("basic", "Url");
                StringBuilder sb = new StringBuilder();
                if (this.ios != null) {
                    sb.append(", ios=");
                    sb.append(this.ios);
                }
                if (this.f175426android != null) {
                    sb.append(", android=");
                    sb.append(this.f175426android);
                }
                if (this.pc != null) {
                    sb.append(", pc=");
                    sb.append(this.pc);
                }
                if (this.web != null) {
                    sb.append(", web=");
                    sb.append(this.web);
                }
                sb.append(", common=");
                sb.append(this.common);
                StringBuilder replace = sb.replace(0, 2, "Url{");
                replace.append('}');
                return replace.toString();
            }

            public Url(String str, String str2, String str3, String str4, String str5) {
                this(str, str2, str3, str4, str5, ByteString.EMPTY);
            }

            public Url(String str, String str2, String str3, String str4, String str5, ByteString byteString) {
                super(ADAPTER, byteString);
                this.ios = str;
                this.f175426android = str2;
                this.pc = str3;
                this.web = str4;
                this.common = str5;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Content$SystemMessageAction$b */
        private static final class C14853b extends ProtoAdapter<SystemMessageAction> {
            C14853b() {
                super(FieldEncoding.LENGTH_DELIMITED, SystemMessageAction.class);
            }

            /* renamed from: a */
            public int encodedSize(SystemMessageAction systemMessageAction) {
                int i;
                int i2;
                int i3 = 0;
                if (systemMessageAction.type != null) {
                    i = ActType.ADAPTER.encodedSizeWithTag(1, systemMessageAction.type);
                } else {
                    i = 0;
                }
                if (systemMessageAction.type_num != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, systemMessageAction.type_num);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (systemMessageAction.payload != null) {
                    i3 = ProtoAdapter.BYTES.encodedSizeWithTag(3, systemMessageAction.payload);
                }
                return i4 + i3 + systemMessageAction.unknownFields().size();
            }

            /* renamed from: a */
            public SystemMessageAction decode(ProtoReader protoReader) throws IOException {
                C14852a aVar = new C14852a();
                aVar.f39227a = ActType.UNKNOWN_ACT_TYPE;
                aVar.f39228b = 0;
                aVar.f39229c = ByteString.EMPTY;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f39227a = ActType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 2) {
                        aVar.f39228b = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39229c = ProtoAdapter.BYTES.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SystemMessageAction systemMessageAction) throws IOException {
                if (systemMessageAction.type != null) {
                    ActType.ADAPTER.encodeWithTag(protoWriter, 1, systemMessageAction.type);
                }
                if (systemMessageAction.type_num != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, systemMessageAction.type_num);
                }
                if (systemMessageAction.payload != null) {
                    ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, systemMessageAction.payload);
                }
                protoWriter.writeBytes(systemMessageAction.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Content$SystemMessageAction$a */
        public static final class C14852a extends Message.Builder<SystemMessageAction, C14852a> {

            /* renamed from: a */
            public ActType f39227a;

            /* renamed from: b */
            public Integer f39228b;

            /* renamed from: c */
            public ByteString f39229c;

            /* renamed from: a */
            public SystemMessageAction build() {
                return new SystemMessageAction(this.f39227a, this.f39228b, this.f39229c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14852a newBuilder() {
            C14852a aVar = new C14852a();
            aVar.f39227a = this.type;
            aVar.f39228b = this.type_num;
            aVar.f39229c = this.payload;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "SystemMessageAction");
            StringBuilder sb = new StringBuilder();
            if (this.type != null) {
                sb.append(", type=");
                sb.append(this.type);
            }
            if (this.type_num != null) {
                sb.append(", type_num=");
                sb.append(this.type_num);
            }
            if (this.payload != null) {
                sb.append(", payload=");
                sb.append(this.payload);
            }
            StringBuilder replace = sb.replace(0, 2, "SystemMessageAction{");
            replace.append('}');
            return replace.toString();
        }

        public SystemMessageAction(ActType actType, Integer num, ByteString byteString) {
            this(actType, num, byteString, ByteString.EMPTY);
        }

        public SystemMessageAction(ActType actType, Integer num, ByteString byteString, ByteString byteString2) {
            super(ADAPTER, byteString2);
            this.type = actType;
            this.type_num = num;
            this.payload = byteString;
        }
    }

    public enum ContentValueType implements WireEnum {
        CONTENT_VALUE_TYPE_UNKNOWN(0),
        USER(1),
        BOT(2),
        TEXT(3),
        CHAT(4),
        CHATTER(5),
        URL(6),
        ACTION(7),
        DEPARTMENT(8);
        
        public static final ProtoAdapter<ContentValueType> ADAPTER = ProtoAdapter.newEnumAdapter(ContentValueType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ContentValueType fromValue(int i) {
            switch (i) {
                case 0:
                    return CONTENT_VALUE_TYPE_UNKNOWN;
                case 1:
                    return USER;
                case 2:
                    return BOT;
                case 3:
                    return TEXT;
                case 4:
                    return CHAT;
                case 5:
                    return CHATTER;
                case 6:
                    return URL;
                case 7:
                    return ACTION;
                case 8:
                    return DEPARTMENT;
                default:
                    return null;
            }
        }

        private ContentValueType(int i) {
            this.value = i;
        }
    }

    public enum SystemType implements WireEnum {
        UNKNOWN(0),
        USER_MODIFY_GROUP_NAME(1),
        USER_MODIFY_GROUP_AVATAR(2),
        USER_MODIFY_GROUP_DESCRIPTION(3),
        USER_MODIFY_GROUP_SETTINGS(4),
        USER_START_GROUP_AND_INVITE(5),
        SYSTEM_WELCOME_USER(6),
        USER_INVITE_OTHERS_JOIN(7),
        USER_QUIT_GROUP(8),
        USER_REMOVE_OTHERS(9),
        USER_REMOVE_GROUP_DESCRIPTION(10),
        USER_CHECK_OTHERS_TELEPHONE(11),
        DERIVE_FROM_P2P_CHAT(12),
        USER_JOIN_VIA_SHARE(13),
        TRANSFER_GROUP_CHAT_OWNER(14),
        TRANSFER_GROUP_CHAT_OWNER_AND_QUIT(15),
        WIPE_ANNOUNCEMENT(16),
        ADD_EMAIL_MEMBERS(17),
        REMOVE_EMAIL_MEMBERS(18),
        MODIFY_EMAIL_MEMBERS(19),
        USER_MODIFY_EMAIL_SUBJECT(20),
        USER_SYNC_MESSAGE(21),
        USER_MODIFY_THREAD_TOPIC(22),
        USER_INVITE_OTHERS_JOIN_CRYPTO_CHAT(23),
        USER_START_CRYPTO_GROUP_AND_INVITE(24),
        USER_CALL_E2EE_VOICE_ON_CANCELL(25),
        USER_CALL_E2EE_VOICE_ON_MISSING(26),
        USER_CALL_E2EE_VOICE_DURATION(27),
        VC_CALL_HOST_CANCEL(28),
        VC_CALL_PARTI_NO_ANSWER(29),
        VC_CALL_PARTI_CANCEL(30),
        VC_CALL_HOST_BUSY(31),
        VC_CALL_PARTI_BUSY(32),
        VC_CALL_FINISH_NOTICE(33),
        VC_CALL_DURATION(34),
        USER_START_MEETING_GROUP_AND_INVITE(35),
        USER_INVITE_OTHERS_JOIN_MEETING(36),
        USER_QUIT_MEETING_CHAT(37),
        USER_DISMISSED_MEETING_CHAT(38),
        USER_START_GROUP(39),
        USER_REMOVE_OTHERS_FROM_MEETING(40),
        USER_ADD_MEETING_CHAT(41),
        JOIN_DEPARTMENT_GROUP(42),
        BUILD_FRIENDSHIP(43),
        NON_FRIENDS_NOTICE(44),
        DECLINE_INVITATION(45),
        DECLINE_SPEC_INVITATION(46),
        USER_JOIN_VIA_QR_CODE(47),
        VC_CALL_CONNECT_FAIL(48),
        VC_CALL_DISCONNECT(49),
        USER_CALL_E2EE_VOICE_WHEN_REFUSED(52),
        USER_CALL_E2EE_VOICE_WHEN_OCCUPY(53),
        GRAB_OTHER_HONGBAO(54),
        OTHER_GRAB_MY_HONGBAO(55),
        LAST_HONGBAO_IS_GRABBED(56),
        SEND_HONGBAO_MESSAGE_FAILED(57),
        USER_SYNC_MESSAGE_V2(58),
        USER_SHARE_DOC_PERMISSION(59),
        USER_CHANGE_DOC_PERMISSION(60),
        USER_SHARE_DOC_FOLDER(61),
        USER_OPEN_ONLY_ADMIN_POST(62),
        USER_SEPECIFY_MEMBERS_POST(63),
        USER_LOW_VERSION_HINT(64),
        USER_THREAD_CLEAR_TITLE(65),
        USER_OPEN_ANYONE_POST(66),
        CRYPTO_MESSAGE_NOTICE_NO_TRANSMIT(67),
        CRYPTO_MESSAGE_NOTICE_SEVEN_DAYS(68),
        CRYPTO_MESSAGE_NOTICE_BURN_AFTER_READING(69),
        USER_SET_CRYPTO_MESSAGE_BURN_LIFE(70),
        USER_TOOK_SCREENSHOT_IN_CRYPTO_CHAT(71),
        CRYPTO_LOW_VERSION_HINT(72),
        INVITE_CHAT_MEMBER_2_OUT_CHAT(73),
        CREATE_CHAT_AND_INVITE_FROM_CHAT_MEMBER(74),
        AUTO_TRANSLATE_GUIDANCE(75),
        WITHDRAW_ADDED_USER(76),
        SAIPAN_REMIND_ONCALL_REPLY(77),
        SAIPAN_REMIND_ONCALL_DONE(78),
        SAIPAN_REMIND_ONCALL_AUTO_DONE(79),
        SAIPAN_ADD_ONCALL(80),
        VC_MEETING_STARTED(83),
        USER_OPEN_ONLY_ADMIN_POST_THREAD(84),
        USER_SPECIFY_MEMBERS_POST_THREAD(85),
        USER_OPEN_ANYONE_POST_THREAD(86),
        VC_MEETING_ENDED_OVER_ONE_HOUR(87),
        INVITE_AT_CHATTERS(88),
        VC_MEETING_ENDED_LESS_ONE_HOUR(89),
        VC_MEETING_ENDED_LESS_ONE_MIN(90),
        VC_DEFAULT_MEETING_ENDED_OVER_ONE_HOUR(91),
        VC_DEFAULT_MEETING_ENDED_LESS_ONE_HOUR(92),
        VC_DEFAULT_MEETING_ENDED_LESS_ONE_MIN(93),
        VC_VIDEO_CHAT_STARTED(94),
        VC_CALL_ENDED_OVER_ONE_HOUR(95),
        VC_CALL_ENDED_LESS_ONE_HOUR(96),
        VC_CALL_ENDED_LESS_ONE_MIN(97),
        VC_CALL_DISCONNECTED_ENDED_OVER_ONE_HOUR(98),
        VC_CALL_DISCONNECTED_ENDED_LESS_ONE_HOUR(99),
        VC_CALL_DISCONNECTED_ENDED_LESS_ONE_MIN(100),
        VC_CALL_INTERVIEWEE_NO_ANSWER(101),
        VC_CALL_INTERVIEWEE_REFUSE(102),
        VC_CALL_INTERVIEWER_CANCEL(103),
        VC_CALL_INTERVIEWEE_BUSY(104),
        VOIP_ENDED_OVER_ONE_HOUR(LocationRequest.PRIORITY_NO_POWER),
        VOIP_ENDED_LESS_ONE_HOUR(106),
        VOIP_ENDED_LESS_ONE_MIN(ActivityIdentificationData.WALKING),
        VOIP_DISCONNECTED_ENDED_OVER_ONE_HOUR(108),
        VOIP_DISCONNECTED_ENDED_LESS_ONE_HOUR(SmEvents.EVENT_NR),
        VOIP_DISCONNECTED_ENDED_LESS_ONE_MIN(SmEvents.EVENT_NO),
        VOIP_INTERVIEWEE_NO_ANSWER(SmEvents.EVENT_NT),
        VOIP_INTERVIEWEE_REFUSE(SmEvents.EVENT_NE_RR),
        VOIP_INTERVIEWER_CANCEL(SmEvents.EVENT_RE),
        VOIP_INTERVIEWEE_BUSY(SmEvents.EVENT_TO),
        SAIPAN_SELECT_CARD_CONTENT(115),
        SAIPAN_USER_QUEUEING(SmEvents.EVENT_RS),
        SAIPAN_NOTIFY_AGENT_QUEUEING(117),
        SAIPAN_RESERVED_3(118),
        SAIPAN_RESERVED_4(119),
        SAIPAN_RESERVED_5(SmEvents.EVENT_NW),
        CANCEL_EMERGENCY_CALL(SmActions.ACTION_INIT_ENTRY),
        HANGUP_EMERGENCY_CALL(SmActions.ACTION_INIT_EXIT),
        START_EMERGENCY_CALL(SmActions.ACTION_CALLING_ENTRY),
        MEETING_TRANSFER_TO_CHAT(SmActions.ACTION_CALLING_EXIT),
        MEETING_TRANSFER_TO_CHAT_WITH_DOC_URL(SmActions.ACTION_RINGING_ENTRY),
        VC_CALL_INTERVIEWEE_NOT_ONLINE(131),
        VOIP_INTERVIEWEE_NOT_ONLINE(132),
        USER_JOIN_CHAT_AUTO_MUTE(138),
        EMERGENCY_CALL_NOTANSWER(139),
        INVITE_CHATTERS_TO_CHAT_NO_PERMISSION_LESS_THRESHOLD(140),
        INVITE_CHATTERS_TO_CHAT_NO_PERMISSION_OVER_THRESHOLD(SmActions.ACTION_IDLE_ENTRY),
        CHAT_ROOM_START(143),
        USER_TURN_ON_GROUP_MAIL(148),
        USER_TURN_OFF_GROUP_MAIL(149),
        USER_CHANGE_GROUP_MAIL_PERMISSION_OWNER(150),
        USER_CHANGE_GROUP_MAIL_PERMISSION_MEMBERS(151),
        USER_CHANGE_GROUP_MAIL_PERMISSION_TENANT(152),
        USER_CHANGE_GROUP_MAIL_PERMISSION_EVERYONE(153),
        USER_JOIN_VIA_GROUP_LINK(154),
        CHAT_ROOM_END(155),
        CHAT_ROOM_START_V2(156),
        SYSTEM_EPHEMERAL_NOTIFY(157),
        BUILD_ONEWAY_RELATION(158),
        INVITE_FRIENDS_SUCCESS(159),
        CREATE_P2P_SOURCE(160),
        SEND_MESSAGE_COLLABORATION_AUTH_FAILED(161),
        NOT_COLLABORATION_AUTH_SEND_MSG_LIMIT_NOTIFY(162),
        NOT_COLLABORATION_AUTH_SEND_MSG_REACH_LIMIT(163),
        USER_INVITE_BOT_JOIN(169),
        DOC_TEMPLATE_GROUP_SHARE(170),
        SHEET_TEMPLATE_GROUP_SHARE(171),
        MIND_NOTE_TEMPLATE_GROUP_SHARE(172),
        CREATE_CIRCLE_AND_INVITE_OTHERS_FROM_CHAT(185),
        MENTIONED_PERSON_NOT_IN_CIRCLE(186),
        INVITE_MEMBERS_TO_JOIN_EXTERNAL_CIRCLE(187),
        CIRCLE_CANT_ADD_MEMBERS_DUE_TO_ADMIN_SETTINGS(188),
        CIRCLE_CANT_ADD_MANY_MEMBERS_DUE_TO_ADMIN_SETTINGS(189),
        JOIN_CIRCLE_VIA_HELP_DESK_MSG_CARD(190),
        CIRCLE_WELCOME_NEW_MEMBERS(191),
        TRANSFER_CIRCLE_OWNER(192),
        TRANSFER_CIRCLE_OWNER_AND_LEAVE(193),
        CIRCLE_USER_CHANGE_DOC_PERMISSION(194),
        USER_INVITE_BOT_JOIN_CIRCLE(195),
        USER_INVITE_OTHERS_JOIN_CIRCLE(196),
        USER_INVITE_OTHERS_JOIN_CIRCLE_BY_LINK(197),
        CIRCLE_TOO_MANY_MEMBERS_NOTIFICATION_MUTED(198),
        USER_INVITE_OTHERS_JOIN_CIRCLE_BY_QR_CODE(199),
        USER_INVITE_OTHERS_JOIN_CIRCLE_BY_INVITATION_CARD(LocationRequest.PRIORITY_HD_ACCURACY),
        USER_MODIFY_CIRCLE_AVATAR(201),
        USER_MODIFY_CIRCLE_DESCRIPTION(202),
        USER_MODIFY_CIRCLE_NAME(SmEvents.EVENT_HBRESET),
        USER_MODIFY_CIRCLE_OWNER(204),
        USER_MODIFY_CIRCLE_SETTINGS(SmEvents.EVENT_HB_NOTICE_DISCONNECT),
        USER_SET_ONLY_CIRCLE_OWNER_CAN_POST(SmEvents.EVENT_NONET),
        USER_SET_ONLY_CIRCLE_OWNER_CAN_CREATE_NEW_TOPICS(207),
        USER_LEAVE_CIRCLE(208),
        USER_REMOVE_CIRCLE_DESCRIPTION(209),
        USER_REMOVE_CIRCLE_MEMBERS(210),
        USER_CREATE_CIRCLE(211),
        USER_CREATE_CIRCLE_AND_INVITE(TTVideoEngine.PLAYER_OPTION_SET_SUPER_RES_STRENGTH),
        USER_SYNC_MESSAGE_TO_CIRCLE(213),
        USER_CLEAR_CIRCLE_ANNOUNCEMENT(SmEvents.EVENT_FT),
        USER_WITHDRAW_CIRCLE_INVITATION(SmEvents.EVENT_HEARTBEAT_INVALID),
        CIRCLE_ANONYMOUS_ON(SmEvents.EVENT_MEETING_LICENSE_TIME_OUT),
        CIRCLE_ANONYMOUS_OFF(SmEvents.EVENT_LOCAL_BUSY_FORCE_END_LAST),
        INVITE_CHAT_MEMBER_2_CHAT(LocationRequest.PRIORITY_INDOOR),
        WILL_REACH_CHAT_CHATTER_COUNT_LIMIT(301),
        ALREADY_REACH_CHAT_CHATTER_COUNT_LIMIT(302),
        USER_CREATE_FACE_TO_FACE_CHAT(303),
        USER_JOIN_FACE_TO_FACE_CHAT(304),
        WELCOME_USER_JOIN_FACE_TO_FACE_CHAT(305),
        USER_CREATED_GROUP_AND_INVITED_OTHER_CHATTER_CHAT_DEPARTMENT(306),
        USER_INVITE_OTHERS_CHATTER_CHAT_DEPARTMENT_JOIN(307),
        CREATE_CHAT_AND_INVITE_FROM_CHAT_DEPARTMENT_MEMBER(308),
        USER_OPEN_ONLY_SEPECIFY_MEMBERS_POST(309),
        USER_OPEN_ONLY_SEPECIFY_MEMBERS_POST_THREAD(310),
        USER_REMOVE_SEPECIFY_MEMBERS_POST(311),
        USER_REMOVE_SEPECIFY_MEMBERS_POST_THREAD(312),
        ADD_MEMBER_TO_ADMIN_LIST(313),
        REMOVE_MEMBER_FROM_ADMIN_LIST(314),
        USER_OPEN_ONLY_OWNER_AND_ADMIN_POST(317),
        USER_OPEN_ONLY_OWNER_AND_ADMIN_POST_THREAD(318),
        ADMIN_OPEN_ANYONE_POST(319),
        ADMIN_OPEN_ANYONE_POST_THREAD(320),
        USER_CHANGE_GROUP_MAIL_PERMISSION_OWNER_OR_ADMIN(322),
        GROUP_NEW_MEMBERS_VIEW_CHAT_HISTORY_ON(323),
        GROUP_NEW_MEMBERS_VIEW_CHAT_HISTORY_OFF(324),
        GROUP_NEW_MEMBERS_CAN_VIEW_HISTORY_MESSAGES(325),
        CIRCLE_WELCOME_NEW_MEMBERS_NO_HISTORY(326),
        JOIN_CIRCLE_VIA_HELP_DESK_MSG_CARD_NO_HISTORY(327),
        USER_INVITE_OTHERS_JOIN_CIRCLE_NO_HISTORY(328),
        USER_INVITE_OTHERS_JOIN_CIRCLE_BY_INVITATION_CARD_NO_HISTORY(329),
        USER_INVITE_OTHERS_JOIN_CIRCLE_BY_LINK_NO_HISTORY(330),
        USER_INVITE_OTHERS_JOIN_CIRCLE_BY_QR_CODE_NO_HISTORY(331),
        USER_INVITE_OTHERS_CHATTER_CHAT_DEPARTMENT_JOIN_NEW(338),
        USER_INVITE_OTHERS_CHATTER_CHAT_DEPARTMENT_JOIN_NO_HISTORY(332),
        USER_JOIN_VIA_QR_NEW(339),
        USER_JOIN_VIA_QR_CODE_NO_HISTORY(333),
        USER_JOIN_CHAT_WELCOME_MESSAGE(334),
        USER_JOIN_CHAT_WELCOME_MESSAGE_NO_HISTORY(335),
        USER_INVITE_OTHERS_JOIN_CHAT_MESSAGE(336),
        USER_INVITE_OTHERS_JOIN_CHAT_MESSAGE_NO_HISTORY(337),
        USER_JOIN_VIA_SHARE_NEW(340),
        USER_JOIN_VIA_SHARE_NO_HISTORY(341),
        USER_JOIN_CHAT_BY_LINK(342),
        USER_JOIN_CHAT_BY_LINK_NO_HISTORY(343),
        HELP_DESK_USER_JOIN_CHAT(344),
        HELP_DESK_USER_JOIN_CHAT_NO_HISTORY(345),
        UPGRADE_SUPER_CHAT(348),
        CREATE_URGENT_ONLY_OWNER_AND_ADMIN_ON(346),
        CREATE_URGENT_ONLY_OWNER_AND_ADMIN_OFF(347),
        EXTERNAL_COORDINATE_CTL(401),
        TARGET_EXTERNAL_COORDINATE_CTL(402),
        CHAT_OPEN_CAN_SEARCH_SYSTEM_MESSAGE(403),
        CHAT_CLOSED_CAN_SEARCH_SYSTEM_MESSAGE(404),
        BITABLE_TEMPLATE_GROUP_SHARE_SYSTEM_MESSAGE(405),
        CREATE_TEAM_AND_INVITE_MEMBERS(501),
        UPDATE_CHAT_TO_TEAM(502),
        INVITE_MEMBERS_JOIN_TEAM(503),
        MEMBERS_JOIN_TEAM_FAIL(504),
        KICK_MEMBERS_OUT_TEAM(505),
        MEMBER_LEAVE_TEAM(506),
        TRANSFER_TEAM_OWNER(507),
        MODIFY_TEAM_NAME(508),
        ENABLE_TEAM_CREATE_CHAT_PERMISSION(509),
        CLOSE_TEAM_CREATE_CHAT_PERMISSION(MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_DIR),
        ENABLE_TEAM_ADD_MEMBERS_PERMISSION(MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME),
        CLOSE_TEAM_ADD_MEMBERS_PERMISSION(MediaPlayer.MEDIA_PLAYER_OPTION_APPID),
        DISSOLVE_TEAM_AND_UNBIND_CHAT(MediaPlayer.MEDIA_PLAYER_OPTION_MODULE_ID),
        CREATE_TEAM_CHAT(MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_EXPIRED_LICENSE),
        BIND_CHAT_INTO_TEAM(515),
        UNBIND_CHAT_WITH_TEAM(516),
        MEMBERS_JOIN_TEAM_CHAT_SEE_HISTORICAL(517),
        MEMBERS_JOIN_TEAM_CHAT_SEE_NEW_MESSAGES(518),
        MEMBERS_JOIN_TEAM_CHAT_FAIL(519),
        MEMBERS_LEAVE_AND_TRANSFER(520),
        USER_CREATE_TEAM(521),
        CHECK_USER_PHONE_NUMBER(522),
        CHECK_USER_PHONE_USER_IN_WHITELIST(523),
        CantBuzzEmptyPhoneNumber(524),
        CantBuzzEmptyName(525),
        BuzzLimit(526),
        BuzzSystemError(527),
        BuzzTimeOut(528),
        CantBuzzMembers(529),
        BuzzNotAnswer(530),
        MultiItemSystemContent(531),
        VC_ENTERPRISE_PHONE_CREATE(TTVideoEngine.PLAYER_OPTION_SUB_LANG_IDS),
        MODIFY_TEAM_AVATAR(533),
        MODIFY_TEAM_DESCRIPTION(534),
        DELETE_TEAM_DESCRIPTION(535);
        
        public static final ProtoAdapter<SystemType> ADAPTER = ProtoAdapter.newEnumAdapter(SystemType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static SystemType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return USER_MODIFY_GROUP_NAME;
            }
            if (i == 2) {
                return USER_MODIFY_GROUP_AVATAR;
            }
            if (i == 3) {
                return USER_MODIFY_GROUP_DESCRIPTION;
            }
            if (i == 4) {
                return USER_MODIFY_GROUP_SETTINGS;
            }
            if (i == 5) {
                return USER_START_GROUP_AND_INVITE;
            }
            if (i == 6) {
                return SYSTEM_WELCOME_USER;
            }
            if (i != 7) {
                if (i == 131) {
                    return VC_CALL_INTERVIEWEE_NOT_ONLINE;
                }
                if (i == 132) {
                    return VOIP_INTERVIEWEE_NOT_ONLINE;
                }
                switch (i) {
                    case 7:
                        break;
                    case 8:
                        return USER_QUIT_GROUP;
                    case 9:
                        return USER_REMOVE_OTHERS;
                    case 10:
                        return USER_REMOVE_GROUP_DESCRIPTION;
                    case 11:
                        return USER_CHECK_OTHERS_TELEPHONE;
                    case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                        return DERIVE_FROM_P2P_CHAT;
                    case 13:
                        return USER_JOIN_VIA_SHARE;
                    case 14:
                        return TRANSFER_GROUP_CHAT_OWNER;
                    case 15:
                        return TRANSFER_GROUP_CHAT_OWNER_AND_QUIT;
                    case 16:
                        return WIPE_ANNOUNCEMENT;
                    case 17:
                        return ADD_EMAIL_MEMBERS;
                    case 18:
                        return REMOVE_EMAIL_MEMBERS;
                    case 19:
                        return MODIFY_EMAIL_MEMBERS;
                    case 20:
                        return USER_MODIFY_EMAIL_SUBJECT;
                    case 21:
                        return USER_SYNC_MESSAGE;
                    case 22:
                        return USER_MODIFY_THREAD_TOPIC;
                    case 23:
                        return USER_INVITE_OTHERS_JOIN_CRYPTO_CHAT;
                    case 24:
                        return USER_START_CRYPTO_GROUP_AND_INVITE;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                        return USER_CALL_E2EE_VOICE_ON_CANCELL;
                    case 26:
                        return USER_CALL_E2EE_VOICE_ON_MISSING;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                        return USER_CALL_E2EE_VOICE_DURATION;
                    case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                        return VC_CALL_HOST_CANCEL;
                    case 29:
                        return VC_CALL_PARTI_NO_ANSWER;
                    case 30:
                        return VC_CALL_PARTI_CANCEL;
                    case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                        return VC_CALL_HOST_BUSY;
                    case 32:
                        return VC_CALL_PARTI_BUSY;
                    case 33:
                        return VC_CALL_FINISH_NOTICE;
                    case 34:
                        return VC_CALL_DURATION;
                    case 35:
                        return USER_START_MEETING_GROUP_AND_INVITE;
                    case 36:
                        return USER_INVITE_OTHERS_JOIN_MEETING;
                    case 37:
                        return USER_QUIT_MEETING_CHAT;
                    case 38:
                        return USER_DISMISSED_MEETING_CHAT;
                    case 39:
                        return USER_START_GROUP;
                    case 40:
                        return USER_REMOVE_OTHERS_FROM_MEETING;
                    case 41:
                        return USER_ADD_MEETING_CHAT;
                    case 42:
                        return JOIN_DEPARTMENT_GROUP;
                    case 43:
                        return BUILD_FRIENDSHIP;
                    case 44:
                        return NON_FRIENDS_NOTICE;
                    case 45:
                        return DECLINE_INVITATION;
                    case 46:
                        return DECLINE_SPEC_INVITATION;
                    case 47:
                        return USER_JOIN_VIA_QR_CODE;
                    case 48:
                        return VC_CALL_CONNECT_FAIL;
                    case 49:
                        return VC_CALL_DISCONNECT;
                    case 143:
                        return CHAT_ROOM_START;
                    case 322:
                        return USER_CHANGE_GROUP_MAIL_PERMISSION_OWNER_OR_ADMIN;
                    case 323:
                        return GROUP_NEW_MEMBERS_VIEW_CHAT_HISTORY_ON;
                    case 324:
                        return GROUP_NEW_MEMBERS_VIEW_CHAT_HISTORY_OFF;
                    case 325:
                        return GROUP_NEW_MEMBERS_CAN_VIEW_HISTORY_MESSAGES;
                    case 326:
                        return CIRCLE_WELCOME_NEW_MEMBERS_NO_HISTORY;
                    case 327:
                        return JOIN_CIRCLE_VIA_HELP_DESK_MSG_CARD_NO_HISTORY;
                    case 328:
                        return USER_INVITE_OTHERS_JOIN_CIRCLE_NO_HISTORY;
                    case 329:
                        return USER_INVITE_OTHERS_JOIN_CIRCLE_BY_INVITATION_CARD_NO_HISTORY;
                    case 330:
                        return USER_INVITE_OTHERS_JOIN_CIRCLE_BY_LINK_NO_HISTORY;
                    case 331:
                        return USER_INVITE_OTHERS_JOIN_CIRCLE_BY_QR_CODE_NO_HISTORY;
                    case 332:
                        return USER_INVITE_OTHERS_CHATTER_CHAT_DEPARTMENT_JOIN_NO_HISTORY;
                    case 333:
                        return USER_JOIN_VIA_QR_CODE_NO_HISTORY;
                    case 334:
                        return USER_JOIN_CHAT_WELCOME_MESSAGE;
                    case 335:
                        return USER_JOIN_CHAT_WELCOME_MESSAGE_NO_HISTORY;
                    case 336:
                        return USER_INVITE_OTHERS_JOIN_CHAT_MESSAGE;
                    case 337:
                        return USER_INVITE_OTHERS_JOIN_CHAT_MESSAGE_NO_HISTORY;
                    case 338:
                        return USER_INVITE_OTHERS_CHATTER_CHAT_DEPARTMENT_JOIN_NEW;
                    case 339:
                        return USER_JOIN_VIA_QR_NEW;
                    case 340:
                        return USER_JOIN_VIA_SHARE_NEW;
                    case 341:
                        return USER_JOIN_VIA_SHARE_NO_HISTORY;
                    case 342:
                        return USER_JOIN_CHAT_BY_LINK;
                    case 343:
                        return USER_JOIN_CHAT_BY_LINK_NO_HISTORY;
                    case 344:
                        return HELP_DESK_USER_JOIN_CHAT;
                    case 345:
                        return HELP_DESK_USER_JOIN_CHAT_NO_HISTORY;
                    case 346:
                        return CREATE_URGENT_ONLY_OWNER_AND_ADMIN_ON;
                    case 347:
                        return CREATE_URGENT_ONLY_OWNER_AND_ADMIN_OFF;
                    case 348:
                        return UPGRADE_SUPER_CHAT;
                    case 401:
                        return EXTERNAL_COORDINATE_CTL;
                    case 402:
                        return TARGET_EXTERNAL_COORDINATE_CTL;
                    case 403:
                        return CHAT_OPEN_CAN_SEARCH_SYSTEM_MESSAGE;
                    case 404:
                        return CHAT_CLOSED_CAN_SEARCH_SYSTEM_MESSAGE;
                    case 405:
                        return BITABLE_TEMPLATE_GROUP_SHARE_SYSTEM_MESSAGE;
                    case 501:
                        return CREATE_TEAM_AND_INVITE_MEMBERS;
                    case 502:
                        return UPDATE_CHAT_TO_TEAM;
                    case 503:
                        return INVITE_MEMBERS_JOIN_TEAM;
                    case 504:
                        return MEMBERS_JOIN_TEAM_FAIL;
                    case 505:
                        return KICK_MEMBERS_OUT_TEAM;
                    case 506:
                        return MEMBER_LEAVE_TEAM;
                    case 507:
                        return TRANSFER_TEAM_OWNER;
                    case 508:
                        return MODIFY_TEAM_NAME;
                    case 509:
                        return ENABLE_TEAM_CREATE_CHAT_PERMISSION;
                    case MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_DIR /*{ENCODED_INT: 510}*/:
                        return CLOSE_TEAM_CREATE_CHAT_PERMISSION;
                    case MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME /*{ENCODED_INT: 511}*/:
                        return ENABLE_TEAM_ADD_MEMBERS_PERMISSION;
                    case MediaPlayer.MEDIA_PLAYER_OPTION_APPID /*{ENCODED_INT: 512}*/:
                        return CLOSE_TEAM_ADD_MEMBERS_PERMISSION;
                    case MediaPlayer.MEDIA_PLAYER_OPTION_MODULE_ID /*{ENCODED_INT: 513}*/:
                        return DISSOLVE_TEAM_AND_UNBIND_CHAT;
                    case MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_EXPIRED_LICENSE /*{ENCODED_INT: 514}*/:
                        return CREATE_TEAM_CHAT;
                    case 515:
                        return BIND_CHAT_INTO_TEAM;
                    case 516:
                        return UNBIND_CHAT_WITH_TEAM;
                    case 517:
                        return MEMBERS_JOIN_TEAM_CHAT_SEE_HISTORICAL;
                    case 518:
                        return MEMBERS_JOIN_TEAM_CHAT_SEE_NEW_MESSAGES;
                    case 519:
                        return MEMBERS_JOIN_TEAM_CHAT_FAIL;
                    case 520:
                        return MEMBERS_LEAVE_AND_TRANSFER;
                    case 521:
                        return USER_CREATE_TEAM;
                    case 522:
                        return CHECK_USER_PHONE_NUMBER;
                    case 523:
                        return CHECK_USER_PHONE_USER_IN_WHITELIST;
                    case 524:
                        return CantBuzzEmptyPhoneNumber;
                    case 525:
                        return CantBuzzEmptyName;
                    case 526:
                        return BuzzLimit;
                    case 527:
                        return BuzzSystemError;
                    case 528:
                        return BuzzTimeOut;
                    case 529:
                        return CantBuzzMembers;
                    case 530:
                        return BuzzNotAnswer;
                    case 531:
                        return MultiItemSystemContent;
                    case TTVideoEngine.PLAYER_OPTION_SUB_LANG_IDS /*{ENCODED_INT: 532}*/:
                        return VC_ENTERPRISE_PHONE_CREATE;
                    case 533:
                        return MODIFY_TEAM_AVATAR;
                    case 534:
                        return MODIFY_TEAM_DESCRIPTION;
                    case 535:
                        return DELETE_TEAM_DESCRIPTION;
                    default:
                        switch (i) {
                            case 52:
                                return USER_CALL_E2EE_VOICE_WHEN_REFUSED;
                            case 53:
                                return USER_CALL_E2EE_VOICE_WHEN_OCCUPY;
                            case 54:
                                return GRAB_OTHER_HONGBAO;
                            case 55:
                                return OTHER_GRAB_MY_HONGBAO;
                            case 56:
                                return LAST_HONGBAO_IS_GRABBED;
                            case 57:
                                return SEND_HONGBAO_MESSAGE_FAILED;
                            case 58:
                                return USER_SYNC_MESSAGE_V2;
                            case 59:
                                return USER_SHARE_DOC_PERMISSION;
                            case 60:
                                return USER_CHANGE_DOC_PERMISSION;
                            case 61:
                                return USER_SHARE_DOC_FOLDER;
                            case 62:
                                return USER_OPEN_ONLY_ADMIN_POST;
                            case 63:
                                return USER_SEPECIFY_MEMBERS_POST;
                            case 64:
                                return USER_LOW_VERSION_HINT;
                            case 65:
                                return USER_THREAD_CLEAR_TITLE;
                            case 66:
                                return USER_OPEN_ANYONE_POST;
                            case 67:
                                return CRYPTO_MESSAGE_NOTICE_NO_TRANSMIT;
                            case 68:
                                return CRYPTO_MESSAGE_NOTICE_SEVEN_DAYS;
                            case 69:
                                return CRYPTO_MESSAGE_NOTICE_BURN_AFTER_READING;
                            case 70:
                                return USER_SET_CRYPTO_MESSAGE_BURN_LIFE;
                            case 71:
                                return USER_TOOK_SCREENSHOT_IN_CRYPTO_CHAT;
                            case 72:
                                return CRYPTO_LOW_VERSION_HINT;
                            case 73:
                                return INVITE_CHAT_MEMBER_2_OUT_CHAT;
                            case 74:
                                return CREATE_CHAT_AND_INVITE_FROM_CHAT_MEMBER;
                            case 75:
                                return AUTO_TRANSLATE_GUIDANCE;
                            case 76:
                                return WITHDRAW_ADDED_USER;
                            case 77:
                                return SAIPAN_REMIND_ONCALL_REPLY;
                            case 78:
                                return SAIPAN_REMIND_ONCALL_DONE;
                            case 79:
                                return SAIPAN_REMIND_ONCALL_AUTO_DONE;
                            case CalendarSearchResultRv.f82651b /*{ENCODED_INT: 80}*/:
                                return SAIPAN_ADD_ONCALL;
                            default:
                                switch (i) {
                                    case 83:
                                        return VC_MEETING_STARTED;
                                    case 84:
                                        return USER_OPEN_ONLY_ADMIN_POST_THREAD;
                                    case 85:
                                        return USER_SPECIFY_MEMBERS_POST_THREAD;
                                    case 86:
                                        return USER_OPEN_ANYONE_POST_THREAD;
                                    case 87:
                                        return VC_MEETING_ENDED_OVER_ONE_HOUR;
                                    case 88:
                                        return INVITE_AT_CHATTERS;
                                    case 89:
                                        return VC_MEETING_ENDED_LESS_ONE_HOUR;
                                    case CameraPosition.TILT_90 /*{ENCODED_INT: 90}*/:
                                        return VC_MEETING_ENDED_LESS_ONE_MIN;
                                    case 91:
                                        return VC_DEFAULT_MEETING_ENDED_OVER_ONE_HOUR;
                                    case 92:
                                        return VC_DEFAULT_MEETING_ENDED_LESS_ONE_HOUR;
                                    case 93:
                                        return VC_DEFAULT_MEETING_ENDED_LESS_ONE_MIN;
                                    case 94:
                                        return VC_VIDEO_CHAT_STARTED;
                                    case 95:
                                        return VC_CALL_ENDED_OVER_ONE_HOUR;
                                    case 96:
                                        return VC_CALL_ENDED_LESS_ONE_HOUR;
                                    case 97:
                                        return VC_CALL_ENDED_LESS_ONE_MIN;
                                    case 98:
                                        return VC_CALL_DISCONNECTED_ENDED_OVER_ONE_HOUR;
                                    case SmEvents.EVENT_UE /*{ENCODED_INT: 99}*/:
                                        return VC_CALL_DISCONNECTED_ENDED_LESS_ONE_HOUR;
                                    case 100:
                                        return VC_CALL_DISCONNECTED_ENDED_LESS_ONE_MIN;
                                    case 101:
                                        return VC_CALL_INTERVIEWEE_NO_ANSWER;
                                    case 102:
                                        return VC_CALL_INTERVIEWEE_REFUSE;
                                    case 103:
                                        return VC_CALL_INTERVIEWER_CANCEL;
                                    case 104:
                                        return VC_CALL_INTERVIEWEE_BUSY;
                                    case LocationRequest.PRIORITY_NO_POWER /*{ENCODED_INT: 105}*/:
                                        return VOIP_ENDED_OVER_ONE_HOUR;
                                    case 106:
                                        return VOIP_ENDED_LESS_ONE_HOUR;
                                    case ActivityIdentificationData.WALKING /*{ENCODED_INT: 107}*/:
                                        return VOIP_ENDED_LESS_ONE_MIN;
                                    case 108:
                                        return VOIP_DISCONNECTED_ENDED_OVER_ONE_HOUR;
                                    case SmEvents.EVENT_NR /*{ENCODED_INT: 109}*/:
                                        return VOIP_DISCONNECTED_ENDED_LESS_ONE_HOUR;
                                    case SmEvents.EVENT_NO /*{ENCODED_INT: 110}*/:
                                        return VOIP_DISCONNECTED_ENDED_LESS_ONE_MIN;
                                    case SmEvents.EVENT_NT /*{ENCODED_INT: 111}*/:
                                        return VOIP_INTERVIEWEE_NO_ANSWER;
                                    case SmEvents.EVENT_NE_RR /*{ENCODED_INT: 112}*/:
                                        return VOIP_INTERVIEWEE_REFUSE;
                                    case SmEvents.EVENT_RE /*{ENCODED_INT: 113}*/:
                                        return VOIP_INTERVIEWER_CANCEL;
                                    case SmEvents.EVENT_TO /*{ENCODED_INT: 114}*/:
                                        return VOIP_INTERVIEWEE_BUSY;
                                    case 115:
                                        return SAIPAN_SELECT_CARD_CONTENT;
                                    case SmEvents.EVENT_RS /*{ENCODED_INT: 116}*/:
                                        return SAIPAN_USER_QUEUEING;
                                    case 117:
                                        return SAIPAN_NOTIFY_AGENT_QUEUEING;
                                    case 118:
                                        return SAIPAN_RESERVED_3;
                                    case 119:
                                        return SAIPAN_RESERVED_4;
                                    case SmEvents.EVENT_NW /*{ENCODED_INT: 120}*/:
                                        return SAIPAN_RESERVED_5;
                                    case SmActions.ACTION_INIT_ENTRY /*{ENCODED_INT: 121}*/:
                                        return CANCEL_EMERGENCY_CALL;
                                    case SmActions.ACTION_INIT_EXIT /*{ENCODED_INT: 122}*/:
                                        return HANGUP_EMERGENCY_CALL;
                                    case SmActions.ACTION_CALLING_ENTRY /*{ENCODED_INT: 123}*/:
                                        return START_EMERGENCY_CALL;
                                    case SmActions.ACTION_CALLING_EXIT /*{ENCODED_INT: 124}*/:
                                        return MEETING_TRANSFER_TO_CHAT;
                                    case SmActions.ACTION_RINGING_ENTRY /*{ENCODED_INT: 125}*/:
                                        return MEETING_TRANSFER_TO_CHAT_WITH_DOC_URL;
                                    default:
                                        switch (i) {
                                            case 138:
                                                return USER_JOIN_CHAT_AUTO_MUTE;
                                            case 139:
                                                return EMERGENCY_CALL_NOTANSWER;
                                            case 140:
                                                return INVITE_CHATTERS_TO_CHAT_NO_PERMISSION_LESS_THRESHOLD;
                                            case SmActions.ACTION_IDLE_ENTRY /*{ENCODED_INT: 141}*/:
                                                return INVITE_CHATTERS_TO_CHAT_NO_PERMISSION_OVER_THRESHOLD;
                                            default:
                                                switch (i) {
                                                    case 148:
                                                        return USER_TURN_ON_GROUP_MAIL;
                                                    case 149:
                                                        return USER_TURN_OFF_GROUP_MAIL;
                                                    case 150:
                                                        return USER_CHANGE_GROUP_MAIL_PERMISSION_OWNER;
                                                    case 151:
                                                        return USER_CHANGE_GROUP_MAIL_PERMISSION_MEMBERS;
                                                    case 152:
                                                        return USER_CHANGE_GROUP_MAIL_PERMISSION_TENANT;
                                                    case 153:
                                                        return USER_CHANGE_GROUP_MAIL_PERMISSION_EVERYONE;
                                                    case 154:
                                                        return USER_JOIN_VIA_GROUP_LINK;
                                                    case 155:
                                                        return CHAT_ROOM_END;
                                                    case 156:
                                                        return CHAT_ROOM_START_V2;
                                                    case 157:
                                                        return SYSTEM_EPHEMERAL_NOTIFY;
                                                    case 158:
                                                        return BUILD_ONEWAY_RELATION;
                                                    case 159:
                                                        return INVITE_FRIENDS_SUCCESS;
                                                    case 160:
                                                        return CREATE_P2P_SOURCE;
                                                    case 161:
                                                        return SEND_MESSAGE_COLLABORATION_AUTH_FAILED;
                                                    case 162:
                                                        return NOT_COLLABORATION_AUTH_SEND_MSG_LIMIT_NOTIFY;
                                                    case 163:
                                                        return NOT_COLLABORATION_AUTH_SEND_MSG_REACH_LIMIT;
                                                    default:
                                                        switch (i) {
                                                            case 169:
                                                                return USER_INVITE_BOT_JOIN;
                                                            case 170:
                                                                return DOC_TEMPLATE_GROUP_SHARE;
                                                            case 171:
                                                                return SHEET_TEMPLATE_GROUP_SHARE;
                                                            case 172:
                                                                return MIND_NOTE_TEMPLATE_GROUP_SHARE;
                                                            default:
                                                                switch (i) {
                                                                    case 185:
                                                                        return CREATE_CIRCLE_AND_INVITE_OTHERS_FROM_CHAT;
                                                                    case 186:
                                                                        return MENTIONED_PERSON_NOT_IN_CIRCLE;
                                                                    case 187:
                                                                        return INVITE_MEMBERS_TO_JOIN_EXTERNAL_CIRCLE;
                                                                    case 188:
                                                                        return CIRCLE_CANT_ADD_MEMBERS_DUE_TO_ADMIN_SETTINGS;
                                                                    case 189:
                                                                        return CIRCLE_CANT_ADD_MANY_MEMBERS_DUE_TO_ADMIN_SETTINGS;
                                                                    case 190:
                                                                        return JOIN_CIRCLE_VIA_HELP_DESK_MSG_CARD;
                                                                    case 191:
                                                                        return CIRCLE_WELCOME_NEW_MEMBERS;
                                                                    case 192:
                                                                        return TRANSFER_CIRCLE_OWNER;
                                                                    case 193:
                                                                        return TRANSFER_CIRCLE_OWNER_AND_LEAVE;
                                                                    case 194:
                                                                        return CIRCLE_USER_CHANGE_DOC_PERMISSION;
                                                                    case 195:
                                                                        return USER_INVITE_BOT_JOIN_CIRCLE;
                                                                    case 196:
                                                                        return USER_INVITE_OTHERS_JOIN_CIRCLE;
                                                                    case 197:
                                                                        return USER_INVITE_OTHERS_JOIN_CIRCLE_BY_LINK;
                                                                    case 198:
                                                                        return CIRCLE_TOO_MANY_MEMBERS_NOTIFICATION_MUTED;
                                                                    case 199:
                                                                        return USER_INVITE_OTHERS_JOIN_CIRCLE_BY_QR_CODE;
                                                                    case LocationRequest.PRIORITY_HD_ACCURACY /*{ENCODED_INT: 200}*/:
                                                                        return USER_INVITE_OTHERS_JOIN_CIRCLE_BY_INVITATION_CARD;
                                                                    case 201:
                                                                        return USER_MODIFY_CIRCLE_AVATAR;
                                                                    case 202:
                                                                        return USER_MODIFY_CIRCLE_DESCRIPTION;
                                                                    case SmEvents.EVENT_HBRESET /*{ENCODED_INT: 203}*/:
                                                                        return USER_MODIFY_CIRCLE_NAME;
                                                                    case 204:
                                                                        return USER_MODIFY_CIRCLE_OWNER;
                                                                    case SmEvents.EVENT_HB_NOTICE_DISCONNECT /*{ENCODED_INT: 205}*/:
                                                                        return USER_MODIFY_CIRCLE_SETTINGS;
                                                                    case SmEvents.EVENT_NONET /*{ENCODED_INT: 206}*/:
                                                                        return USER_SET_ONLY_CIRCLE_OWNER_CAN_POST;
                                                                    case 207:
                                                                        return USER_SET_ONLY_CIRCLE_OWNER_CAN_CREATE_NEW_TOPICS;
                                                                    case 208:
                                                                        return USER_LEAVE_CIRCLE;
                                                                    case 209:
                                                                        return USER_REMOVE_CIRCLE_DESCRIPTION;
                                                                    case 210:
                                                                        return USER_REMOVE_CIRCLE_MEMBERS;
                                                                    case 211:
                                                                        return USER_CREATE_CIRCLE;
                                                                    case TTVideoEngine.PLAYER_OPTION_SET_SUPER_RES_STRENGTH /*{ENCODED_INT: 212}*/:
                                                                        return USER_CREATE_CIRCLE_AND_INVITE;
                                                                    case 213:
                                                                        return USER_SYNC_MESSAGE_TO_CIRCLE;
                                                                    case SmEvents.EVENT_FT /*{ENCODED_INT: 214}*/:
                                                                        return USER_CLEAR_CIRCLE_ANNOUNCEMENT;
                                                                    case SmEvents.EVENT_HEARTBEAT_INVALID /*{ENCODED_INT: 215}*/:
                                                                        return USER_WITHDRAW_CIRCLE_INVITATION;
                                                                    case SmEvents.EVENT_MEETING_LICENSE_TIME_OUT /*{ENCODED_INT: 216}*/:
                                                                        return CIRCLE_ANONYMOUS_ON;
                                                                    case SmEvents.EVENT_LOCAL_BUSY_FORCE_END_LAST /*{ENCODED_INT: 217}*/:
                                                                        return CIRCLE_ANONYMOUS_OFF;
                                                                    default:
                                                                        switch (i) {
                                                                            case LocationRequest.PRIORITY_INDOOR /*{ENCODED_INT: 300}*/:
                                                                                return INVITE_CHAT_MEMBER_2_CHAT;
                                                                            case 301:
                                                                                return WILL_REACH_CHAT_CHATTER_COUNT_LIMIT;
                                                                            case 302:
                                                                                return ALREADY_REACH_CHAT_CHATTER_COUNT_LIMIT;
                                                                            case 303:
                                                                                return USER_CREATE_FACE_TO_FACE_CHAT;
                                                                            case 304:
                                                                                return USER_JOIN_FACE_TO_FACE_CHAT;
                                                                            case 305:
                                                                                return WELCOME_USER_JOIN_FACE_TO_FACE_CHAT;
                                                                            case 306:
                                                                                return USER_CREATED_GROUP_AND_INVITED_OTHER_CHATTER_CHAT_DEPARTMENT;
                                                                            case 307:
                                                                                return USER_INVITE_OTHERS_CHATTER_CHAT_DEPARTMENT_JOIN;
                                                                            case 308:
                                                                                return CREATE_CHAT_AND_INVITE_FROM_CHAT_DEPARTMENT_MEMBER;
                                                                            case 309:
                                                                                return USER_OPEN_ONLY_SEPECIFY_MEMBERS_POST;
                                                                            case 310:
                                                                                return USER_OPEN_ONLY_SEPECIFY_MEMBERS_POST_THREAD;
                                                                            case 311:
                                                                                return USER_REMOVE_SEPECIFY_MEMBERS_POST;
                                                                            case 312:
                                                                                return USER_REMOVE_SEPECIFY_MEMBERS_POST_THREAD;
                                                                            case 313:
                                                                                return ADD_MEMBER_TO_ADMIN_LIST;
                                                                            case 314:
                                                                                return REMOVE_MEMBER_FROM_ADMIN_LIST;
                                                                            default:
                                                                                switch (i) {
                                                                                    case 317:
                                                                                        return USER_OPEN_ONLY_OWNER_AND_ADMIN_POST;
                                                                                    case 318:
                                                                                        return USER_OPEN_ONLY_OWNER_AND_ADMIN_POST_THREAD;
                                                                                    case 319:
                                                                                        return ADMIN_OPEN_ANYONE_POST;
                                                                                    case 320:
                                                                                        return ADMIN_OPEN_ANYONE_POST_THREAD;
                                                                                    default:
                                                                                        return null;
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
            return USER_INVITE_OTHERS_JOIN;
        }

        private SystemType(int i) {
            this.value = i;
        }
    }

    public Content(String str, String str2, ImageSet imageSet, Boolean bool, Long l, String str3, String str4, Long l2, String str5, String str6, Map<String, String> map, Integer num, FileType fileType, SystemType systemType, EmailSystemEvent emailSystemEvent, Map<String, ContentValue> map2, Integer num2, String str7, Map<String, SystemContentValue> map3, Map<Integer, SystemMessageItemAction> map4, Integer num3, String str8, Boolean bool2, Long l3, String str9, String str10, String str11, Boolean bool3, String str12, Boolean bool4, Integer num4, Boolean bool5, Map<String, UrlPreviewHangPoint> map5, Boolean bool6, DocEntity docEntity, String str13, File.Source source, String str14, Boolean bool7, String str15, TransStatus transStatus, TransIdentity transIdentity, String str16, String str17, String str18, Boolean bool8, Boolean bool9, String str19, List<File> list, String str20, String str21, Long l4, Integer num5, Integer num6, Integer num7, String str22, MergeForwardContent mergeForwardContent, TransmitInfo transmitInfo, List<PreviewUrlContent> list2, RichText richText, CalendarContent calendarContent, ShareCalendarEventContent shareCalendarEventContent, GeneralCalendarContent generalCalendarContent, List<TextUrlContent> list3, CardContent cardContent, LocationContent locationContent, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, Boolean bool10, MediaContent mediaContent, HongbaoContent hongbaoContent, HongbaoSystemContent hongbaoSystemContent, VideoChatContent videoChatContent, List<String> list4, String str34, StickerInfo stickerInfo, String str35, String str36, ShareUserCardInfo shareUserCardInfo, String str37, Abbreviation abbreviation2, Map<String, ElementRefs> map6, TodoOperationContent todoOperationContent) {
        this(str, str2, imageSet, bool, l, str3, str4, l2, str5, str6, map, num, fileType, systemType, emailSystemEvent, map2, num2, str7, map3, map4, num3, str8, bool2, l3, str9, str10, str11, bool3, str12, bool4, num4, bool5, map5, bool6, docEntity, str13, source, str14, bool7, str15, transStatus, transIdentity, str16, str17, str18, bool8, bool9, str19, list, str20, str21, l4, num5, num6, num7, str22, mergeForwardContent, transmitInfo, list2, richText, calendarContent, shareCalendarEventContent, generalCalendarContent, list3, cardContent, locationContent, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, bool10, mediaContent, hongbaoContent, hongbaoSystemContent, videoChatContent, list4, str34, stickerInfo, str35, str36, shareUserCardInfo, str37, abbreviation2, map6, todoOperationContent, ByteString.EMPTY);
    }

    public Content(String str, String str2, ImageSet imageSet, Boolean bool, Long l, String str3, String str4, Long l2, String str5, String str6, Map<String, String> map, Integer num, FileType fileType, SystemType systemType, EmailSystemEvent emailSystemEvent, Map<String, ContentValue> map2, Integer num2, String str7, Map<String, SystemContentValue> map3, Map<Integer, SystemMessageItemAction> map4, Integer num3, String str8, Boolean bool2, Long l3, String str9, String str10, String str11, Boolean bool3, String str12, Boolean bool4, Integer num4, Boolean bool5, Map<String, UrlPreviewHangPoint> map5, Boolean bool6, DocEntity docEntity, String str13, File.Source source, String str14, Boolean bool7, String str15, TransStatus transStatus, TransIdentity transIdentity, String str16, String str17, String str18, Boolean bool8, Boolean bool9, String str19, List<File> list, String str20, String str21, Long l4, Integer num5, Integer num6, Integer num7, String str22, MergeForwardContent mergeForwardContent, TransmitInfo transmitInfo, List<PreviewUrlContent> list2, RichText richText, CalendarContent calendarContent, ShareCalendarEventContent shareCalendarEventContent, GeneralCalendarContent generalCalendarContent, List<TextUrlContent> list3, CardContent cardContent, LocationContent locationContent, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, Boolean bool10, MediaContent mediaContent, HongbaoContent hongbaoContent, HongbaoSystemContent hongbaoSystemContent, VideoChatContent videoChatContent, List<String> list4, String str34, StickerInfo stickerInfo, String str35, String str36, ShareUserCardInfo shareUserCardInfo, String str37, Abbreviation abbreviation2, Map<String, ElementRefs> map6, TodoOperationContent todoOperationContent, ByteString byteString) {
        super(ADAPTER, byteString);
        this.title = str;
        this.text = str2;
        this.image = imageSet;
        this.is_origin_source = bool;
        this.origin_size = l;
        this.key = str3;
        this.name = str4;
        this.size = l2;
        this.mime = str5;
        this.template = str6;
        this.values = Internal.immutableCopyOf("values", map);
        this.duration = num;
        this.deprecated = fileType;
        this.system_type = systemType;
        this.event = emailSystemEvent;
        this.content_values = Internal.immutableCopyOf("content_values", map2);
        this.system_type_value = num2;
        this.i18n_title_key = str7;
        this.system_content_values = Internal.immutableCopyOf("system_content_values", map3);
        this.item_actions = Internal.immutableCopyOf("item_actions", map4);
        this.system_message_version = num3;
        this.voice2text = str8;
        this.hide_voice2text = bool2;
        this.origin_sender_id = l3;
        this.local_upload_id = str9;
        this.origin_tos_key = str10;
        this.origin_sender_name = str11;
        this.is_friend = bool3;
        this.origin_sender_id_str = str12;
        this.is_audio_recognize_finish = bool4;
        this.audio2text_start_time = num4;
        this.is_audio_with_text = bool5;
        this.url_preview_hang_point_map = Internal.immutableCopyOf("url_preview_hang_point_map", map5);
        this.is_group_announcement = bool6;
        this.doc_entity = docEntity;
        this.file_path = str13;
        this.file_source = source;
        this.namespace = str14;
        this.is_in_my_nut_store = bool7;
        this.cache_file_path = str15;
        this.lan_trans_status = transStatus;
        this.trans_identity = transIdentity;
        this.lan_trans_status_text = str16;
        this.lan_sender_device_id = str17;
        this.lan_receiver_device_id = str18;
        this.is_try_use_lan_trans = bool8;
        this.is_able_lan_trans = bool9;
        this.file_uri = str19;
        this.attachments = Internal.immutableCopyOf("attachments", list);
        this.share_chat_id = str20;
        this.join_token = str21;
        this.expire_time = l4;
        this.share_chat_last_state = num5;
        this.width = num6;
        this.height = num7;
        this.crypto_token = str22;
        this.merge_forward_content = mergeForwardContent;
        this.transmit_info = transmitInfo;
        this.preview_urls = Internal.immutableCopyOf("preview_urls", list2);
        this.rich_text = richText;
        this.calendar_content = calendarContent;
        this.share_calendar_event_content = shareCalendarEventContent;
        this.general_calendar_content = generalCalendarContent;
        this.text_url_contents = Internal.immutableCopyOf("text_url_contents", list3);
        this.card_content = cardContent;
        this.location_content = locationContent;
        this.e2ee_from_id = str23;
        this.e2ee_to_id = str24;
        this.trigger_id = str25;
        this.vc_from_id = str26;
        this.vc_to_id = str27;
        this.vc_duration_time = str28;
        this.vc_meeting_id = str29;
        this.vc_passcode = str30;
        this.vc_feedback_status = str31;
        this.vc_from_feedback_status = str32;
        this.vc_to_feedback_status = str33;
        this.is_voice_call = bool10;
        this.media_content = mediaContent;
        this.hongbao_content = hongbaoContent;
        this.hongbao_system_content = hongbaoSystemContent;
        this.videochat_content = videoChatContent;
        this.resource_urls = Internal.immutableCopyOf("resource_urls", list4);
        this.fs_unit = str34;
        this.sticker_info = stickerInfo;
        this.sticker_id = str35;
        this.sticker_set_id = str36;
        this.share_user_card_info = shareUserCardInfo;
        this.share_chatter_id = str37;
        this.abbreviation = abbreviation2;
        this.typed_element_refs = Internal.immutableCopyOf("typed_element_refs", map6);
        this.todo_operation_content = todoOperationContent;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Content$b */
    private static final class C14857b extends ProtoAdapter<Content> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f39283a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, ContentValue>> f39284b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ContentValue.ADAPTER);

        /* renamed from: c */
        private final ProtoAdapter<Map<String, SystemContentValue>> f39285c = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SystemContentValue.ADAPTER);

        /* renamed from: d */
        private final ProtoAdapter<Map<Integer, SystemMessageItemAction>> f39286d = ProtoAdapter.newMapAdapter(ProtoAdapter.INT32, SystemMessageItemAction.ADAPTER);

        /* renamed from: e */
        private final ProtoAdapter<Map<String, UrlPreviewHangPoint>> f39287e = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, UrlPreviewHangPoint.ADAPTER);

        /* renamed from: f */
        private final ProtoAdapter<Map<String, ElementRefs>> f39288f = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ElementRefs.ADAPTER);

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Content content) throws IOException {
            if (content.title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, content.title);
            }
            if (content.text != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, content.text);
            }
            if (content.image != null) {
                ImageSet.ADAPTER.encodeWithTag(protoWriter, 3, content.image);
            }
            if (content.is_origin_source != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 31, content.is_origin_source);
            }
            if (content.origin_size != null) {
                ProtoAdapter.UINT64.encodeWithTag(protoWriter, 32, content.origin_size);
            }
            if (content.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, content.key);
            }
            if (content.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, content.name);
            }
            if (content.size != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, content.size);
            }
            if (content.mime != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, content.mime);
            }
            if (content.template != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, content.template);
            }
            this.f39283a.encodeWithTag(protoWriter, 9, content.values);
            if (content.duration != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, content.duration);
            }
            if (content.deprecated != null) {
                FileType.ADAPTER.encodeWithTag(protoWriter, 11, content.deprecated);
            }
            if (content.system_type != null) {
                SystemType.ADAPTER.encodeWithTag(protoWriter, 12, content.system_type);
            }
            if (content.event != null) {
                EmailSystemEvent.ADAPTER.encodeWithTag(protoWriter, 13, content.event);
            }
            this.f39284b.encodeWithTag(protoWriter, 14, content.content_values);
            if (content.system_type_value != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 15, content.system_type_value);
            }
            if (content.i18n_title_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 16, content.i18n_title_key);
            }
            this.f39285c.encodeWithTag(protoWriter, 17, content.system_content_values);
            this.f39286d.encodeWithTag(protoWriter, 30, content.item_actions);
            if (content.system_message_version != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 52, content.system_message_version);
            }
            if (content.voice2text != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 18, content.voice2text);
            }
            if (content.hide_voice2text != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 19, content.hide_voice2text);
            }
            if (content.origin_sender_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 20, content.origin_sender_id);
            }
            if (content.local_upload_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 21, content.local_upload_id);
            }
            if (content.origin_tos_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 22, content.origin_tos_key);
            }
            if (content.origin_sender_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 23, content.origin_sender_name);
            }
            if (content.is_friend != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 24, content.is_friend);
            }
            if (content.origin_sender_id_str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 25, content.origin_sender_id_str);
            }
            if (content.is_audio_recognize_finish != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 26, content.is_audio_recognize_finish);
            }
            if (content.audio2text_start_time != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 27, content.audio2text_start_time);
            }
            if (content.is_audio_with_text != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 28, content.is_audio_with_text);
            }
            this.f39287e.encodeWithTag(protoWriter, 29, content.url_preview_hang_point_map);
            if (content.is_group_announcement != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 50, content.is_group_announcement);
            }
            if (content.doc_entity != null) {
                DocEntity.ADAPTER.encodeWithTag(protoWriter, 51, content.doc_entity);
            }
            if (content.file_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 100, content.file_path);
            }
            if (content.file_source != null) {
                File.Source.ADAPTER.encodeWithTag(protoWriter, 101, content.file_source);
            }
            if (content.namespace != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 102, content.namespace);
            }
            if (content.is_in_my_nut_store != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 103, content.is_in_my_nut_store);
            }
            if (content.cache_file_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 104, content.cache_file_path);
            }
            if (content.lan_trans_status != null) {
                TransStatus.ADAPTER.encodeWithTag(protoWriter, LocationRequest.PRIORITY_NO_POWER, content.lan_trans_status);
            }
            if (content.trans_identity != null) {
                TransIdentity.ADAPTER.encodeWithTag(protoWriter, 106, content.trans_identity);
            }
            if (content.lan_trans_status_text != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, ActivityIdentificationData.WALKING, content.lan_trans_status_text);
            }
            if (content.lan_sender_device_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 108, content.lan_sender_device_id);
            }
            if (content.lan_receiver_device_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, SmEvents.EVENT_NR, content.lan_receiver_device_id);
            }
            if (content.is_try_use_lan_trans != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, SmEvents.EVENT_NO, content.is_try_use_lan_trans);
            }
            if (content.is_able_lan_trans != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, SmEvents.EVENT_NT, content.is_able_lan_trans);
            }
            if (content.file_uri != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, SmEvents.EVENT_NE_RR, content.file_uri);
            }
            File.ADAPTER.asRepeated().encodeWithTag(protoWriter, LocationRequest.PRIORITY_HD_ACCURACY, content.attachments);
            if (content.share_chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, LocationRequest.PRIORITY_INDOOR, content.share_chat_id);
            }
            if (content.join_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 301, content.join_token);
            }
            if (content.expire_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 302, content.expire_time);
            }
            if (content.share_chat_last_state != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 303, content.share_chat_last_state);
            }
            if (content.width != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, content.width);
            }
            if (content.height != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 401, content.height);
            }
            if (content.crypto_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, ParticipantRepo.f117150c, content.crypto_token);
            }
            if (content.merge_forward_content != null) {
                MergeForwardContent.ADAPTER.encodeWithTag(protoWriter, 600, content.merge_forward_content);
            }
            if (content.transmit_info != null) {
                TransmitInfo.ADAPTER.encodeWithTag(protoWriter, 601, content.transmit_info);
            }
            PreviewUrlContent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 700, content.preview_urls);
            if (content.rich_text != null) {
                RichText.ADAPTER.encodeWithTag(protoWriter, 800, content.rich_text);
            }
            if (content.calendar_content != null) {
                CalendarContent.ADAPTER.encodeWithTag(protoWriter, 900, content.calendar_content);
            }
            if (content.share_calendar_event_content != null) {
                ShareCalendarEventContent.ADAPTER.encodeWithTag(protoWriter, 901, content.share_calendar_event_content);
            }
            if (content.general_calendar_content != null) {
                GeneralCalendarContent.ADAPTER.encodeWithTag(protoWriter, 902, content.general_calendar_content);
            }
            TextUrlContent.ADAPTER.asRepeated().encodeWithTag(protoWriter, HwBuildEx.VersionCodes.CUR_DEVELOPMENT, content.text_url_contents);
            if (content.card_content != null) {
                CardContent.ADAPTER.encodeWithTag(protoWriter, 1000, content.card_content);
            }
            if (content.location_content != null) {
                LocationContent.ADAPTER.encodeWithTag(protoWriter, 1010, content.location_content);
            }
            if (content.e2ee_from_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1100, content.e2ee_from_id);
            }
            if (content.e2ee_to_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1101, content.e2ee_to_id);
            }
            if (content.trigger_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, ExceptionCode.NETWORK_IO_EXCEPTION, content.trigger_id);
            }
            if (content.vc_from_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1200, content.vc_from_id);
            }
            if (content.vc_to_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1201, content.vc_to_id);
            }
            if (content.vc_duration_time != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1202, content.vc_duration_time);
            }
            if (content.vc_meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1203, content.vc_meeting_id);
            }
            if (content.vc_passcode != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1204, content.vc_passcode);
            }
            if (content.vc_feedback_status != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1205, content.vc_feedback_status);
            }
            if (content.vc_from_feedback_status != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1206, content.vc_from_feedback_status);
            }
            if (content.vc_to_feedback_status != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1207, content.vc_to_feedback_status);
            }
            if (content.is_voice_call != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1208, content.is_voice_call);
            }
            if (content.media_content != null) {
                MediaContent.ADAPTER.encodeWithTag(protoWriter, 1300, content.media_content);
            }
            if (content.hongbao_content != null) {
                HongbaoContent.ADAPTER.encodeWithTag(protoWriter, 1301, content.hongbao_content);
            }
            if (content.hongbao_system_content != null) {
                HongbaoSystemContent.ADAPTER.encodeWithTag(protoWriter, 1302, content.hongbao_system_content);
            }
            if (content.videochat_content != null) {
                VideoChatContent.ADAPTER.encodeWithTag(protoWriter, 1401, content.videochat_content);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, content.resource_urls);
            if (content.fs_unit != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1501, content.fs_unit);
            }
            if (content.sticker_info != null) {
                StickerInfo.ADAPTER.encodeWithTag(protoWriter, 1502, content.sticker_info);
            }
            if (content.sticker_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1503, content.sticker_id);
            }
            if (content.sticker_set_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1504, content.sticker_set_id);
            }
            if (content.share_user_card_info != null) {
                ShareUserCardInfo.ADAPTER.encodeWithTag(protoWriter, 1600, content.share_user_card_info);
            }
            if (content.share_chatter_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1601, content.share_chatter_id);
            }
            if (content.abbreviation != null) {
                Abbreviation.ADAPTER.encodeWithTag(protoWriter, 2000, content.abbreviation);
            }
            this.f39288f.encodeWithTag(protoWriter, 2001, content.typed_element_refs);
            if (content.todo_operation_content != null) {
                TodoOperationContent.ADAPTER.encodeWithTag(protoWriter, 2010, content.todo_operation_content);
            }
            protoWriter.writeBytes(content.unknownFields());
        }

        /* renamed from: a */
        public Content decode(ProtoReader protoReader) throws IOException {
            C14856a aVar = new C14856a();
            aVar.f39257a = "";
            aVar.f39258b = "";
            aVar.f39260d = false;
            aVar.f39261e = 0L;
            aVar.f39262f = "";
            aVar.f39263g = "";
            aVar.f39264h = 0L;
            aVar.f39265i = "";
            aVar.f39266j = "";
            aVar.f39268l = 0;
            aVar.f39269m = FileType.DEFAULT;
            aVar.f39270n = SystemType.UNKNOWN;
            aVar.f39273q = 0;
            aVar.f39274r = "";
            aVar.f39277u = 0;
            aVar.f39278v = "";
            aVar.f39279w = false;
            aVar.f39280x = 0L;
            aVar.f39281y = "";
            aVar.f39282z = "";
            aVar.f39231A = "";
            aVar.f39232B = false;
            aVar.f39233C = "";
            aVar.f39234D = false;
            aVar.f39235E = 0;
            aVar.f39236F = false;
            aVar.f39238H = false;
            aVar.f39240J = "";
            aVar.f39241K = File.Source.LARK_SERVER;
            aVar.f39242L = "";
            aVar.f39243M = false;
            aVar.f39244N = "";
            aVar.f39245O = TransStatus.PENDING;
            aVar.f39246P = TransIdentity.OTHER;
            aVar.f39247Q = "";
            aVar.f39248R = "";
            aVar.f39249S = "";
            aVar.f39250T = false;
            aVar.f39251U = false;
            aVar.f39252V = "";
            aVar.f39254X = "";
            aVar.f39255Y = "";
            aVar.f39256Z = 0L;
            aVar.aa = 0;
            aVar.ab = 0;
            aVar.ac = 0;
            aVar.ad = "";
            aVar.ao = "";
            aVar.ap = "";
            aVar.aq = "";
            aVar.ar = "";
            aVar.as = "";
            aVar.at = "";
            aVar.au = "";
            aVar.av = "";
            aVar.aw = "";
            aVar.ax = "";
            aVar.ay = "";
            aVar.az = false;
            aVar.aF = "";
            aVar.aH = "";
            aVar.aI = "";
            aVar.aK = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39257a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f39258b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f39259c = ImageSet.ADAPTER.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f39262f = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 5) {
                    aVar.f39263g = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 6) {
                    if (nextTag != 7) {
                        if (nextTag == 400) {
                            aVar.ab = ProtoAdapter.INT32.decode(protoReader);
                        } else if (nextTag == 401) {
                            aVar.ac = ProtoAdapter.INT32.decode(protoReader);
                        } else if (nextTag == 600) {
                            aVar.ae = MergeForwardContent.ADAPTER.decode(protoReader);
                        } else if (nextTag != 601) {
                            switch (nextTag) {
                                case 7:
                                    break;
                                case 8:
                                    aVar.f39266j = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 9:
                                    aVar.f39267k.putAll(this.f39283a.decode(protoReader));
                                    break;
                                case 10:
                                    aVar.f39268l = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 11:
                                    try {
                                        aVar.f39269m = FileType.ADAPTER.decode(protoReader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                        break;
                                    }
                                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                                    try {
                                        aVar.f39270n = SystemType.ADAPTER.decode(protoReader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                        break;
                                    }
                                case 13:
                                    aVar.f39271o = EmailSystemEvent.ADAPTER.decode(protoReader);
                                    break;
                                case 14:
                                    aVar.f39272p.putAll(this.f39284b.decode(protoReader));
                                    break;
                                case 15:
                                    aVar.f39273q = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 16:
                                    aVar.f39274r = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 17:
                                    aVar.f39275s.putAll(this.f39285c.decode(protoReader));
                                    break;
                                case 18:
                                    aVar.f39278v = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 19:
                                    aVar.f39279w = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 20:
                                    aVar.f39280x = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                case 21:
                                    aVar.f39281y = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 22:
                                    aVar.f39282z = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 23:
                                    aVar.f39231A = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 24:
                                    aVar.f39232B = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                                    aVar.f39233C = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 26:
                                    aVar.f39234D = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                                    aVar.f39235E = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                                    aVar.f39236F = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 29:
                                    aVar.f39237G.putAll(this.f39287e.decode(protoReader));
                                    break;
                                case 30:
                                    aVar.f39276t.putAll(this.f39286d.decode(protoReader));
                                    break;
                                case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                                    aVar.f39260d = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 32:
                                    aVar.f39261e = ProtoAdapter.UINT64.decode(protoReader);
                                    break;
                                case LocationRequest.PRIORITY_HD_ACCURACY /*{ENCODED_INT: 200}*/:
                                    aVar.f39253W.add(File.ADAPTER.decode(protoReader));
                                    break;
                                case ParticipantRepo.f117150c /*{ENCODED_INT: 500}*/:
                                    aVar.ad = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 700:
                                    aVar.ag.add(PreviewUrlContent.ADAPTER.decode(protoReader));
                                    break;
                                case 800:
                                    aVar.ah = RichText.ADAPTER.decode(protoReader);
                                    break;
                                case 1000:
                                    aVar.am = CardContent.ADAPTER.decode(protoReader);
                                    break;
                                case 1010:
                                    aVar.an = LocationContent.ADAPTER.decode(protoReader);
                                    break;
                                case 1401:
                                    aVar.aD = VideoChatContent.ADAPTER.decode(protoReader);
                                    break;
                                case ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED /*{ENCODED_INT: 1500}*/:
                                    aVar.aE.add(ProtoAdapter.STRING.decode(protoReader));
                                    break;
                                case 1501:
                                    aVar.aF = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 1502:
                                    aVar.aG = StickerInfo.ADAPTER.decode(protoReader);
                                    break;
                                case 1503:
                                    aVar.aH = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 1504:
                                    aVar.aI = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 1600:
                                    aVar.aJ = ShareUserCardInfo.ADAPTER.decode(protoReader);
                                    break;
                                case 1601:
                                    aVar.aK = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 2000:
                                    aVar.aL = Abbreviation.ADAPTER.decode(protoReader);
                                    break;
                                case 2001:
                                    aVar.aM.putAll(this.f39288f.decode(protoReader));
                                    break;
                                case 2010:
                                    aVar.aN = TodoOperationContent.ADAPTER.decode(protoReader);
                                    break;
                                case HwBuildEx.VersionCodes.CUR_DEVELOPMENT /*{ENCODED_INT: 10000}*/:
                                    aVar.al.add(TextUrlContent.ADAPTER.decode(protoReader));
                                    break;
                                default:
                                    switch (nextTag) {
                                        case MmListControl.f116813f /*{ENCODED_INT: 50}*/:
                                            aVar.f39238H = ProtoAdapter.BOOL.decode(protoReader);
                                            continue;
                                        case 51:
                                            aVar.f39239I = DocEntity.ADAPTER.decode(protoReader);
                                            continue;
                                        case 52:
                                            aVar.f39277u = ProtoAdapter.INT32.decode(protoReader);
                                            continue;
                                        default:
                                            switch (nextTag) {
                                                case 100:
                                                    aVar.f39240J = ProtoAdapter.STRING.decode(protoReader);
                                                    continue;
                                                case 101:
                                                    try {
                                                        aVar.f39241K = File.Source.ADAPTER.decode(protoReader);
                                                        continue;
                                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                                        break;
                                                    }
                                                case 102:
                                                    aVar.f39242L = ProtoAdapter.STRING.decode(protoReader);
                                                    continue;
                                                case 103:
                                                    aVar.f39243M = ProtoAdapter.BOOL.decode(protoReader);
                                                    continue;
                                                case 104:
                                                    aVar.f39244N = ProtoAdapter.STRING.decode(protoReader);
                                                    continue;
                                                case LocationRequest.PRIORITY_NO_POWER /*{ENCODED_INT: 105}*/:
                                                    try {
                                                        aVar.f39245O = TransStatus.ADAPTER.decode(protoReader);
                                                        continue;
                                                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                                        break;
                                                    }
                                                case 106:
                                                    try {
                                                        aVar.f39246P = TransIdentity.ADAPTER.decode(protoReader);
                                                        continue;
                                                    } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e5.value));
                                                        break;
                                                    }
                                                case ActivityIdentificationData.WALKING /*{ENCODED_INT: 107}*/:
                                                    aVar.f39247Q = ProtoAdapter.STRING.decode(protoReader);
                                                    continue;
                                                case 108:
                                                    aVar.f39248R = ProtoAdapter.STRING.decode(protoReader);
                                                    continue;
                                                case SmEvents.EVENT_NR /*{ENCODED_INT: 109}*/:
                                                    aVar.f39249S = ProtoAdapter.STRING.decode(protoReader);
                                                    continue;
                                                case SmEvents.EVENT_NO /*{ENCODED_INT: 110}*/:
                                                    aVar.f39250T = ProtoAdapter.BOOL.decode(protoReader);
                                                    continue;
                                                case SmEvents.EVENT_NT /*{ENCODED_INT: 111}*/:
                                                    aVar.f39251U = ProtoAdapter.BOOL.decode(protoReader);
                                                    continue;
                                                case SmEvents.EVENT_NE_RR /*{ENCODED_INT: 112}*/:
                                                    aVar.f39252V = ProtoAdapter.STRING.decode(protoReader);
                                                    continue;
                                                default:
                                                    switch (nextTag) {
                                                        case LocationRequest.PRIORITY_INDOOR /*{ENCODED_INT: 300}*/:
                                                            aVar.f39254X = ProtoAdapter.STRING.decode(protoReader);
                                                            continue;
                                                        case 301:
                                                            aVar.f39255Y = ProtoAdapter.STRING.decode(protoReader);
                                                            continue;
                                                        case 302:
                                                            aVar.f39256Z = ProtoAdapter.INT64.decode(protoReader);
                                                            continue;
                                                        case 303:
                                                            aVar.aa = ProtoAdapter.INT32.decode(protoReader);
                                                            continue;
                                                        default:
                                                            switch (nextTag) {
                                                                case 900:
                                                                    aVar.f175427ai = CalendarContent.ADAPTER.decode(protoReader);
                                                                    continue;
                                                                case 901:
                                                                    aVar.aj = ShareCalendarEventContent.ADAPTER.decode(protoReader);
                                                                    continue;
                                                                case 902:
                                                                    aVar.ak = GeneralCalendarContent.ADAPTER.decode(protoReader);
                                                                    continue;
                                                                default:
                                                                    switch (nextTag) {
                                                                        case 1100:
                                                                            aVar.ao = ProtoAdapter.STRING.decode(protoReader);
                                                                            continue;
                                                                        case 1101:
                                                                            aVar.ap = ProtoAdapter.STRING.decode(protoReader);
                                                                            continue;
                                                                        case ExceptionCode.NETWORK_IO_EXCEPTION /*{ENCODED_INT: 1102}*/:
                                                                            aVar.aq = ProtoAdapter.STRING.decode(protoReader);
                                                                            continue;
                                                                        default:
                                                                            switch (nextTag) {
                                                                                case 1200:
                                                                                    aVar.ar = ProtoAdapter.STRING.decode(protoReader);
                                                                                    continue;
                                                                                case 1201:
                                                                                    aVar.as = ProtoAdapter.STRING.decode(protoReader);
                                                                                    continue;
                                                                                case 1202:
                                                                                    aVar.at = ProtoAdapter.STRING.decode(protoReader);
                                                                                    continue;
                                                                                case 1203:
                                                                                    aVar.au = ProtoAdapter.STRING.decode(protoReader);
                                                                                    continue;
                                                                                case 1204:
                                                                                    aVar.av = ProtoAdapter.STRING.decode(protoReader);
                                                                                    continue;
                                                                                case 1205:
                                                                                    aVar.aw = ProtoAdapter.STRING.decode(protoReader);
                                                                                    continue;
                                                                                case 1206:
                                                                                    aVar.ax = ProtoAdapter.STRING.decode(protoReader);
                                                                                    continue;
                                                                                case 1207:
                                                                                    aVar.ay = ProtoAdapter.STRING.decode(protoReader);
                                                                                    continue;
                                                                                case 1208:
                                                                                    aVar.az = ProtoAdapter.BOOL.decode(protoReader);
                                                                                    continue;
                                                                                default:
                                                                                    switch (nextTag) {
                                                                                        case 1300:
                                                                                            aVar.aA = MediaContent.ADAPTER.decode(protoReader);
                                                                                            continue;
                                                                                        case 1301:
                                                                                            aVar.aB = HongbaoContent.ADAPTER.decode(protoReader);
                                                                                            continue;
                                                                                        case 1302:
                                                                                            aVar.aC = HongbaoSystemContent.ADAPTER.decode(protoReader);
                                                                                            continue;
                                                                                        default:
                                                                                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                                                                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                        } else {
                            aVar.af = TransmitInfo.ADAPTER.decode(protoReader);
                        }
                    }
                    aVar.f39265i = ProtoAdapter.STRING.decode(protoReader);
                } else {
                    aVar.f39264h = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        C14857b() {
            super(FieldEncoding.LENGTH_DELIMITED, Content.class);
        }

        /* renamed from: a */
        public int encodedSize(Content content) {
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
            int i60;
            int i61;
            int i62;
            int i63;
            int i64;
            int i65;
            int i66;
            int i67;
            int i68;
            int i69;
            int i70;
            int i71;
            int i72;
            int i73;
            int i74;
            int i75;
            int i76;
            int i77;
            int i78;
            int i79;
            int i80;
            int i81;
            int i82 = 0;
            if (content.title != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, content.title);
            } else {
                i = 0;
            }
            if (content.text != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, content.text);
            } else {
                i2 = 0;
            }
            int i83 = i + i2;
            if (content.image != null) {
                i3 = ImageSet.ADAPTER.encodedSizeWithTag(3, content.image);
            } else {
                i3 = 0;
            }
            int i84 = i83 + i3;
            if (content.is_origin_source != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(31, content.is_origin_source);
            } else {
                i4 = 0;
            }
            int i85 = i84 + i4;
            if (content.origin_size != null) {
                i5 = ProtoAdapter.UINT64.encodedSizeWithTag(32, content.origin_size);
            } else {
                i5 = 0;
            }
            int i86 = i85 + i5;
            if (content.key != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(4, content.key);
            } else {
                i6 = 0;
            }
            int i87 = i86 + i6;
            if (content.name != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(5, content.name);
            } else {
                i7 = 0;
            }
            int i88 = i87 + i7;
            if (content.size != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(6, content.size);
            } else {
                i8 = 0;
            }
            int i89 = i88 + i8;
            if (content.mime != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(7, content.mime);
            } else {
                i9 = 0;
            }
            int i90 = i89 + i9;
            if (content.template != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(8, content.template);
            } else {
                i10 = 0;
            }
            int encodedSizeWithTag = i90 + i10 + this.f39283a.encodedSizeWithTag(9, content.values);
            if (content.duration != null) {
                i11 = ProtoAdapter.INT32.encodedSizeWithTag(10, content.duration);
            } else {
                i11 = 0;
            }
            int i91 = encodedSizeWithTag + i11;
            if (content.deprecated != null) {
                i12 = FileType.ADAPTER.encodedSizeWithTag(11, content.deprecated);
            } else {
                i12 = 0;
            }
            int i92 = i91 + i12;
            if (content.system_type != null) {
                i13 = SystemType.ADAPTER.encodedSizeWithTag(12, content.system_type);
            } else {
                i13 = 0;
            }
            int i93 = i92 + i13;
            if (content.event != null) {
                i14 = EmailSystemEvent.ADAPTER.encodedSizeWithTag(13, content.event);
            } else {
                i14 = 0;
            }
            int encodedSizeWithTag2 = i93 + i14 + this.f39284b.encodedSizeWithTag(14, content.content_values);
            if (content.system_type_value != null) {
                i15 = ProtoAdapter.INT32.encodedSizeWithTag(15, content.system_type_value);
            } else {
                i15 = 0;
            }
            int i94 = encodedSizeWithTag2 + i15;
            if (content.i18n_title_key != null) {
                i16 = ProtoAdapter.STRING.encodedSizeWithTag(16, content.i18n_title_key);
            } else {
                i16 = 0;
            }
            int encodedSizeWithTag3 = i94 + i16 + this.f39285c.encodedSizeWithTag(17, content.system_content_values) + this.f39286d.encodedSizeWithTag(30, content.item_actions);
            if (content.system_message_version != null) {
                i17 = ProtoAdapter.INT32.encodedSizeWithTag(52, content.system_message_version);
            } else {
                i17 = 0;
            }
            int i95 = encodedSizeWithTag3 + i17;
            if (content.voice2text != null) {
                i18 = ProtoAdapter.STRING.encodedSizeWithTag(18, content.voice2text);
            } else {
                i18 = 0;
            }
            int i96 = i95 + i18;
            if (content.hide_voice2text != null) {
                i19 = ProtoAdapter.BOOL.encodedSizeWithTag(19, content.hide_voice2text);
            } else {
                i19 = 0;
            }
            int i97 = i96 + i19;
            if (content.origin_sender_id != null) {
                i20 = ProtoAdapter.INT64.encodedSizeWithTag(20, content.origin_sender_id);
            } else {
                i20 = 0;
            }
            int i98 = i97 + i20;
            if (content.local_upload_id != null) {
                i21 = ProtoAdapter.STRING.encodedSizeWithTag(21, content.local_upload_id);
            } else {
                i21 = 0;
            }
            int i99 = i98 + i21;
            if (content.origin_tos_key != null) {
                i22 = ProtoAdapter.STRING.encodedSizeWithTag(22, content.origin_tos_key);
            } else {
                i22 = 0;
            }
            int i100 = i99 + i22;
            if (content.origin_sender_name != null) {
                i23 = ProtoAdapter.STRING.encodedSizeWithTag(23, content.origin_sender_name);
            } else {
                i23 = 0;
            }
            int i101 = i100 + i23;
            if (content.is_friend != null) {
                i24 = ProtoAdapter.BOOL.encodedSizeWithTag(24, content.is_friend);
            } else {
                i24 = 0;
            }
            int i102 = i101 + i24;
            if (content.origin_sender_id_str != null) {
                i25 = ProtoAdapter.STRING.encodedSizeWithTag(25, content.origin_sender_id_str);
            } else {
                i25 = 0;
            }
            int i103 = i102 + i25;
            if (content.is_audio_recognize_finish != null) {
                i26 = ProtoAdapter.BOOL.encodedSizeWithTag(26, content.is_audio_recognize_finish);
            } else {
                i26 = 0;
            }
            int i104 = i103 + i26;
            if (content.audio2text_start_time != null) {
                i27 = ProtoAdapter.INT32.encodedSizeWithTag(27, content.audio2text_start_time);
            } else {
                i27 = 0;
            }
            int i105 = i104 + i27;
            if (content.is_audio_with_text != null) {
                i28 = ProtoAdapter.BOOL.encodedSizeWithTag(28, content.is_audio_with_text);
            } else {
                i28 = 0;
            }
            int encodedSizeWithTag4 = i105 + i28 + this.f39287e.encodedSizeWithTag(29, content.url_preview_hang_point_map);
            if (content.is_group_announcement != null) {
                i29 = ProtoAdapter.BOOL.encodedSizeWithTag(50, content.is_group_announcement);
            } else {
                i29 = 0;
            }
            int i106 = encodedSizeWithTag4 + i29;
            if (content.doc_entity != null) {
                i30 = DocEntity.ADAPTER.encodedSizeWithTag(51, content.doc_entity);
            } else {
                i30 = 0;
            }
            int i107 = i106 + i30;
            if (content.file_path != null) {
                i31 = ProtoAdapter.STRING.encodedSizeWithTag(100, content.file_path);
            } else {
                i31 = 0;
            }
            int i108 = i107 + i31;
            if (content.file_source != null) {
                i32 = File.Source.ADAPTER.encodedSizeWithTag(101, content.file_source);
            } else {
                i32 = 0;
            }
            int i109 = i108 + i32;
            if (content.namespace != null) {
                i33 = ProtoAdapter.STRING.encodedSizeWithTag(102, content.namespace);
            } else {
                i33 = 0;
            }
            int i110 = i109 + i33;
            if (content.is_in_my_nut_store != null) {
                i34 = ProtoAdapter.BOOL.encodedSizeWithTag(103, content.is_in_my_nut_store);
            } else {
                i34 = 0;
            }
            int i111 = i110 + i34;
            if (content.cache_file_path != null) {
                i35 = ProtoAdapter.STRING.encodedSizeWithTag(104, content.cache_file_path);
            } else {
                i35 = 0;
            }
            int i112 = i111 + i35;
            if (content.lan_trans_status != null) {
                i36 = TransStatus.ADAPTER.encodedSizeWithTag(LocationRequest.PRIORITY_NO_POWER, content.lan_trans_status);
            } else {
                i36 = 0;
            }
            int i113 = i112 + i36;
            if (content.trans_identity != null) {
                i37 = TransIdentity.ADAPTER.encodedSizeWithTag(106, content.trans_identity);
            } else {
                i37 = 0;
            }
            int i114 = i113 + i37;
            if (content.lan_trans_status_text != null) {
                i38 = ProtoAdapter.STRING.encodedSizeWithTag(ActivityIdentificationData.WALKING, content.lan_trans_status_text);
            } else {
                i38 = 0;
            }
            int i115 = i114 + i38;
            if (content.lan_sender_device_id != null) {
                i39 = ProtoAdapter.STRING.encodedSizeWithTag(108, content.lan_sender_device_id);
            } else {
                i39 = 0;
            }
            int i116 = i115 + i39;
            if (content.lan_receiver_device_id != null) {
                i40 = ProtoAdapter.STRING.encodedSizeWithTag(SmEvents.EVENT_NR, content.lan_receiver_device_id);
            } else {
                i40 = 0;
            }
            int i117 = i116 + i40;
            if (content.is_try_use_lan_trans != null) {
                i41 = ProtoAdapter.BOOL.encodedSizeWithTag(SmEvents.EVENT_NO, content.is_try_use_lan_trans);
            } else {
                i41 = 0;
            }
            int i118 = i117 + i41;
            if (content.is_able_lan_trans != null) {
                i42 = ProtoAdapter.BOOL.encodedSizeWithTag(SmEvents.EVENT_NT, content.is_able_lan_trans);
            } else {
                i42 = 0;
            }
            int i119 = i118 + i42;
            if (content.file_uri != null) {
                i43 = ProtoAdapter.STRING.encodedSizeWithTag(SmEvents.EVENT_NE_RR, content.file_uri);
            } else {
                i43 = 0;
            }
            int encodedSizeWithTag5 = i119 + i43 + File.ADAPTER.asRepeated().encodedSizeWithTag(LocationRequest.PRIORITY_HD_ACCURACY, content.attachments);
            if (content.share_chat_id != null) {
                i44 = ProtoAdapter.STRING.encodedSizeWithTag(LocationRequest.PRIORITY_INDOOR, content.share_chat_id);
            } else {
                i44 = 0;
            }
            int i120 = encodedSizeWithTag5 + i44;
            if (content.join_token != null) {
                i45 = ProtoAdapter.STRING.encodedSizeWithTag(301, content.join_token);
            } else {
                i45 = 0;
            }
            int i121 = i120 + i45;
            if (content.expire_time != null) {
                i46 = ProtoAdapter.INT64.encodedSizeWithTag(302, content.expire_time);
            } else {
                i46 = 0;
            }
            int i122 = i121 + i46;
            if (content.share_chat_last_state != null) {
                i47 = ProtoAdapter.INT32.encodedSizeWithTag(303, content.share_chat_last_state);
            } else {
                i47 = 0;
            }
            int i123 = i122 + i47;
            if (content.width != null) {
                i48 = ProtoAdapter.INT32.encodedSizeWithTag(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, content.width);
            } else {
                i48 = 0;
            }
            int i124 = i123 + i48;
            if (content.height != null) {
                i49 = ProtoAdapter.INT32.encodedSizeWithTag(401, content.height);
            } else {
                i49 = 0;
            }
            int i125 = i124 + i49;
            if (content.crypto_token != null) {
                i50 = ProtoAdapter.STRING.encodedSizeWithTag(ParticipantRepo.f117150c, content.crypto_token);
            } else {
                i50 = 0;
            }
            int i126 = i125 + i50;
            if (content.merge_forward_content != null) {
                i51 = MergeForwardContent.ADAPTER.encodedSizeWithTag(600, content.merge_forward_content);
            } else {
                i51 = 0;
            }
            int i127 = i126 + i51;
            if (content.transmit_info != null) {
                i52 = TransmitInfo.ADAPTER.encodedSizeWithTag(601, content.transmit_info);
            } else {
                i52 = 0;
            }
            int encodedSizeWithTag6 = i127 + i52 + PreviewUrlContent.ADAPTER.asRepeated().encodedSizeWithTag(700, content.preview_urls);
            if (content.rich_text != null) {
                i53 = RichText.ADAPTER.encodedSizeWithTag(800, content.rich_text);
            } else {
                i53 = 0;
            }
            int i128 = encodedSizeWithTag6 + i53;
            if (content.calendar_content != null) {
                i54 = CalendarContent.ADAPTER.encodedSizeWithTag(900, content.calendar_content);
            } else {
                i54 = 0;
            }
            int i129 = i128 + i54;
            if (content.share_calendar_event_content != null) {
                i55 = ShareCalendarEventContent.ADAPTER.encodedSizeWithTag(901, content.share_calendar_event_content);
            } else {
                i55 = 0;
            }
            int i130 = i129 + i55;
            if (content.general_calendar_content != null) {
                i56 = GeneralCalendarContent.ADAPTER.encodedSizeWithTag(902, content.general_calendar_content);
            } else {
                i56 = 0;
            }
            int encodedSizeWithTag7 = i130 + i56 + TextUrlContent.ADAPTER.asRepeated().encodedSizeWithTag(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, content.text_url_contents);
            if (content.card_content != null) {
                i57 = CardContent.ADAPTER.encodedSizeWithTag(1000, content.card_content);
            } else {
                i57 = 0;
            }
            int i131 = encodedSizeWithTag7 + i57;
            if (content.location_content != null) {
                i58 = LocationContent.ADAPTER.encodedSizeWithTag(1010, content.location_content);
            } else {
                i58 = 0;
            }
            int i132 = i131 + i58;
            if (content.e2ee_from_id != null) {
                i59 = ProtoAdapter.STRING.encodedSizeWithTag(1100, content.e2ee_from_id);
            } else {
                i59 = 0;
            }
            int i133 = i132 + i59;
            if (content.e2ee_to_id != null) {
                i60 = ProtoAdapter.STRING.encodedSizeWithTag(1101, content.e2ee_to_id);
            } else {
                i60 = 0;
            }
            int i134 = i133 + i60;
            if (content.trigger_id != null) {
                i61 = ProtoAdapter.STRING.encodedSizeWithTag(ExceptionCode.NETWORK_IO_EXCEPTION, content.trigger_id);
            } else {
                i61 = 0;
            }
            int i135 = i134 + i61;
            if (content.vc_from_id != null) {
                i62 = ProtoAdapter.STRING.encodedSizeWithTag(1200, content.vc_from_id);
            } else {
                i62 = 0;
            }
            int i136 = i135 + i62;
            if (content.vc_to_id != null) {
                i63 = ProtoAdapter.STRING.encodedSizeWithTag(1201, content.vc_to_id);
            } else {
                i63 = 0;
            }
            int i137 = i136 + i63;
            if (content.vc_duration_time != null) {
                i64 = ProtoAdapter.STRING.encodedSizeWithTag(1202, content.vc_duration_time);
            } else {
                i64 = 0;
            }
            int i138 = i137 + i64;
            if (content.vc_meeting_id != null) {
                i65 = ProtoAdapter.STRING.encodedSizeWithTag(1203, content.vc_meeting_id);
            } else {
                i65 = 0;
            }
            int i139 = i138 + i65;
            if (content.vc_passcode != null) {
                i66 = ProtoAdapter.STRING.encodedSizeWithTag(1204, content.vc_passcode);
            } else {
                i66 = 0;
            }
            int i140 = i139 + i66;
            if (content.vc_feedback_status != null) {
                i67 = ProtoAdapter.STRING.encodedSizeWithTag(1205, content.vc_feedback_status);
            } else {
                i67 = 0;
            }
            int i141 = i140 + i67;
            if (content.vc_from_feedback_status != null) {
                i68 = ProtoAdapter.STRING.encodedSizeWithTag(1206, content.vc_from_feedback_status);
            } else {
                i68 = 0;
            }
            int i142 = i141 + i68;
            if (content.vc_to_feedback_status != null) {
                i69 = ProtoAdapter.STRING.encodedSizeWithTag(1207, content.vc_to_feedback_status);
            } else {
                i69 = 0;
            }
            int i143 = i142 + i69;
            if (content.is_voice_call != null) {
                i70 = ProtoAdapter.BOOL.encodedSizeWithTag(1208, content.is_voice_call);
            } else {
                i70 = 0;
            }
            int i144 = i143 + i70;
            if (content.media_content != null) {
                i71 = MediaContent.ADAPTER.encodedSizeWithTag(1300, content.media_content);
            } else {
                i71 = 0;
            }
            int i145 = i144 + i71;
            if (content.hongbao_content != null) {
                i72 = HongbaoContent.ADAPTER.encodedSizeWithTag(1301, content.hongbao_content);
            } else {
                i72 = 0;
            }
            int i146 = i145 + i72;
            if (content.hongbao_system_content != null) {
                i73 = HongbaoSystemContent.ADAPTER.encodedSizeWithTag(1302, content.hongbao_system_content);
            } else {
                i73 = 0;
            }
            int i147 = i146 + i73;
            if (content.videochat_content != null) {
                i74 = VideoChatContent.ADAPTER.encodedSizeWithTag(1401, content.videochat_content);
            } else {
                i74 = 0;
            }
            int encodedSizeWithTag8 = i147 + i74 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, content.resource_urls);
            if (content.fs_unit != null) {
                i75 = ProtoAdapter.STRING.encodedSizeWithTag(1501, content.fs_unit);
            } else {
                i75 = 0;
            }
            int i148 = encodedSizeWithTag8 + i75;
            if (content.sticker_info != null) {
                i76 = StickerInfo.ADAPTER.encodedSizeWithTag(1502, content.sticker_info);
            } else {
                i76 = 0;
            }
            int i149 = i148 + i76;
            if (content.sticker_id != null) {
                i77 = ProtoAdapter.STRING.encodedSizeWithTag(1503, content.sticker_id);
            } else {
                i77 = 0;
            }
            int i150 = i149 + i77;
            if (content.sticker_set_id != null) {
                i78 = ProtoAdapter.STRING.encodedSizeWithTag(1504, content.sticker_set_id);
            } else {
                i78 = 0;
            }
            int i151 = i150 + i78;
            if (content.share_user_card_info != null) {
                i79 = ShareUserCardInfo.ADAPTER.encodedSizeWithTag(1600, content.share_user_card_info);
            } else {
                i79 = 0;
            }
            int i152 = i151 + i79;
            if (content.share_chatter_id != null) {
                i80 = ProtoAdapter.STRING.encodedSizeWithTag(1601, content.share_chatter_id);
            } else {
                i80 = 0;
            }
            int i153 = i152 + i80;
            if (content.abbreviation != null) {
                i81 = Abbreviation.ADAPTER.encodedSizeWithTag(2000, content.abbreviation);
            } else {
                i81 = 0;
            }
            int encodedSizeWithTag9 = i153 + i81 + this.f39288f.encodedSizeWithTag(2001, content.typed_element_refs);
            if (content.todo_operation_content != null) {
                i82 = TodoOperationContent.ADAPTER.encodedSizeWithTag(2010, content.todo_operation_content);
            }
            return encodedSizeWithTag9 + i82 + content.unknownFields().size();
        }
    }

    public static final class SystemContentValue extends Message<SystemContentValue, C14846a> {
        public static final ProtoAdapter<SystemContentValue> ADAPTER = new C14847b();
        public static final ContentValueType DEFAULT_TYPE = ContentValueType.CONTENT_VALUE_TYPE_UNKNOWN;
        private static final long serialVersionUID = 0;
        public final List<ContentValue> content_values;
        public final ContentValueType type;

        public static final class ContentValue extends Message<ContentValue, C14844a> {
            public static final ProtoAdapter<ContentValue> ADAPTER = new C14845b();
            public static final Integer DEFAULT_ACTION_ID = 0;
            public static final SystemMessageAction.ActType DEFAULT_ACTION_TYPE = SystemMessageAction.ActType.UNKNOWN_ACT_TYPE;
            public static final Boolean DEFAULT_IS_ANONYMOUS = false;
            public static final Boolean DEFAULT_IS_CLICKABLE = false;
            public static final ContentValueType DEFAULT_TYPE = ContentValueType.CONTENT_VALUE_TYPE_UNKNOWN;
            private static final long serialVersionUID = 0;
            public final Integer action_id;
            public final SystemMessageAction.ActType action_type;
            public final String id;
            public final Boolean is_anonymous;
            public final Boolean is_clickable;
            public final String link;
            public final ContentValueType type;
            public final String value;

            /* renamed from: com.bytedance.lark.pb.basic.v1.Content$SystemContentValue$ContentValue$b */
            private static final class C14845b extends ProtoAdapter<ContentValue> {
                C14845b() {
                    super(FieldEncoding.LENGTH_DELIMITED, ContentValue.class);
                }

                /* renamed from: a */
                public int encodedSize(ContentValue contentValue) {
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    int i7;
                    int i8 = 0;
                    if (contentValue.value != null) {
                        i = ProtoAdapter.STRING.encodedSizeWithTag(1, contentValue.value);
                    } else {
                        i = 0;
                    }
                    if (contentValue.id != null) {
                        i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, contentValue.id);
                    } else {
                        i2 = 0;
                    }
                    int i9 = i + i2;
                    if (contentValue.link != null) {
                        i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, contentValue.link);
                    } else {
                        i3 = 0;
                    }
                    int i10 = i9 + i3;
                    if (contentValue.type != null) {
                        i4 = ContentValueType.ADAPTER.encodedSizeWithTag(4, contentValue.type);
                    } else {
                        i4 = 0;
                    }
                    int i11 = i10 + i4;
                    if (contentValue.action_type != null) {
                        i5 = SystemMessageAction.ActType.ADAPTER.encodedSizeWithTag(5, contentValue.action_type);
                    } else {
                        i5 = 0;
                    }
                    int i12 = i11 + i5;
                    if (contentValue.is_anonymous != null) {
                        i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, contentValue.is_anonymous);
                    } else {
                        i6 = 0;
                    }
                    int i13 = i12 + i6;
                    if (contentValue.action_id != null) {
                        i7 = ProtoAdapter.INT32.encodedSizeWithTag(7, contentValue.action_id);
                    } else {
                        i7 = 0;
                    }
                    int i14 = i13 + i7;
                    if (contentValue.is_clickable != null) {
                        i8 = ProtoAdapter.BOOL.encodedSizeWithTag(8, contentValue.is_clickable);
                    }
                    return i14 + i8 + contentValue.unknownFields().size();
                }

                /* renamed from: a */
                public ContentValue decode(ProtoReader protoReader) throws IOException {
                    C14844a aVar = new C14844a();
                    aVar.f39211a = "";
                    aVar.f39212b = "";
                    aVar.f39213c = "";
                    aVar.f39214d = ContentValueType.CONTENT_VALUE_TYPE_UNKNOWN;
                    aVar.f39215e = SystemMessageAction.ActType.UNKNOWN_ACT_TYPE;
                    aVar.f39216f = false;
                    aVar.f39217g = 0;
                    aVar.f39218h = false;
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag != -1) {
                            switch (nextTag) {
                                case 1:
                                    aVar.f39211a = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 2:
                                    aVar.f39212b = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 3:
                                    aVar.f39213c = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 4:
                                    try {
                                        aVar.f39214d = ContentValueType.ADAPTER.decode(protoReader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                        break;
                                    }
                                case 5:
                                    try {
                                        aVar.f39215e = SystemMessageAction.ActType.ADAPTER.decode(protoReader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                        break;
                                    }
                                case 6:
                                    aVar.f39216f = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 7:
                                    aVar.f39217g = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 8:
                                    aVar.f39218h = ProtoAdapter.BOOL.decode(protoReader);
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

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, ContentValue contentValue) throws IOException {
                    if (contentValue.value != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, contentValue.value);
                    }
                    if (contentValue.id != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, contentValue.id);
                    }
                    if (contentValue.link != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, contentValue.link);
                    }
                    if (contentValue.type != null) {
                        ContentValueType.ADAPTER.encodeWithTag(protoWriter, 4, contentValue.type);
                    }
                    if (contentValue.action_type != null) {
                        SystemMessageAction.ActType.ADAPTER.encodeWithTag(protoWriter, 5, contentValue.action_type);
                    }
                    if (contentValue.is_anonymous != null) {
                        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, contentValue.is_anonymous);
                    }
                    if (contentValue.action_id != null) {
                        ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, contentValue.action_id);
                    }
                    if (contentValue.is_clickable != null) {
                        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, contentValue.is_clickable);
                    }
                    protoWriter.writeBytes(contentValue.unknownFields());
                }
            }

            /* renamed from: com.bytedance.lark.pb.basic.v1.Content$SystemContentValue$ContentValue$a */
            public static final class C14844a extends Message.Builder<ContentValue, C14844a> {

                /* renamed from: a */
                public String f39211a;

                /* renamed from: b */
                public String f39212b;

                /* renamed from: c */
                public String f39213c;

                /* renamed from: d */
                public ContentValueType f39214d;

                /* renamed from: e */
                public SystemMessageAction.ActType f39215e;

                /* renamed from: f */
                public Boolean f39216f;

                /* renamed from: g */
                public Integer f39217g;

                /* renamed from: h */
                public Boolean f39218h;

                /* renamed from: a */
                public ContentValue build() {
                    return new ContentValue(this.f39211a, this.f39212b, this.f39213c, this.f39214d, this.f39215e, this.f39216f, this.f39217g, this.f39218h, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C14844a newBuilder() {
                C14844a aVar = new C14844a();
                aVar.f39211a = this.value;
                aVar.f39212b = this.id;
                aVar.f39213c = this.link;
                aVar.f39214d = this.type;
                aVar.f39215e = this.action_type;
                aVar.f39216f = this.is_anonymous;
                aVar.f39217g = this.action_id;
                aVar.f39218h = this.is_clickable;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("basic", "ContentValue");
                StringBuilder sb = new StringBuilder();
                if (this.value != null) {
                    sb.append(", value=");
                    sb.append(this.value);
                }
                if (this.id != null) {
                    sb.append(", id=");
                    sb.append(this.id);
                }
                if (this.link != null) {
                    sb.append(", link=");
                    sb.append(this.link);
                }
                if (this.type != null) {
                    sb.append(", type=");
                    sb.append(this.type);
                }
                if (this.action_type != null) {
                    sb.append(", action_type=");
                    sb.append(this.action_type);
                }
                if (this.is_anonymous != null) {
                    sb.append(", is_anonymous=");
                    sb.append(this.is_anonymous);
                }
                if (this.action_id != null) {
                    sb.append(", action_id=");
                    sb.append(this.action_id);
                }
                if (this.is_clickable != null) {
                    sb.append(", is_clickable=");
                    sb.append(this.is_clickable);
                }
                StringBuilder replace = sb.replace(0, 2, "ContentValue{");
                replace.append('}');
                return replace.toString();
            }

            public ContentValue(String str, String str2, String str3, ContentValueType contentValueType, SystemMessageAction.ActType actType, Boolean bool, Integer num, Boolean bool2) {
                this(str, str2, str3, contentValueType, actType, bool, num, bool2, ByteString.EMPTY);
            }

            public ContentValue(String str, String str2, String str3, ContentValueType contentValueType, SystemMessageAction.ActType actType, Boolean bool, Integer num, Boolean bool2, ByteString byteString) {
                super(ADAPTER, byteString);
                this.value = str;
                this.id = str2;
                this.link = str3;
                this.type = contentValueType;
                this.action_type = actType;
                this.is_anonymous = bool;
                this.action_id = num;
                this.is_clickable = bool2;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Content$SystemContentValue$b */
        private static final class C14847b extends ProtoAdapter<SystemContentValue> {
            C14847b() {
                super(FieldEncoding.LENGTH_DELIMITED, SystemContentValue.class);
            }

            /* renamed from: a */
            public int encodedSize(SystemContentValue systemContentValue) {
                int i;
                if (systemContentValue.type != null) {
                    i = ContentValueType.ADAPTER.encodedSizeWithTag(1, systemContentValue.type);
                } else {
                    i = 0;
                }
                return i + ContentValue.ADAPTER.asRepeated().encodedSizeWithTag(2, systemContentValue.content_values) + systemContentValue.unknownFields().size();
            }

            /* renamed from: a */
            public SystemContentValue decode(ProtoReader protoReader) throws IOException {
                C14846a aVar = new C14846a();
                aVar.f39219a = ContentValueType.CONTENT_VALUE_TYPE_UNKNOWN;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f39219a = ContentValueType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39220b.add(ContentValue.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SystemContentValue systemContentValue) throws IOException {
                if (systemContentValue.type != null) {
                    ContentValueType.ADAPTER.encodeWithTag(protoWriter, 1, systemContentValue.type);
                }
                ContentValue.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, systemContentValue.content_values);
                protoWriter.writeBytes(systemContentValue.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Content$SystemContentValue$a */
        public static final class C14846a extends Message.Builder<SystemContentValue, C14846a> {

            /* renamed from: a */
            public ContentValueType f39219a;

            /* renamed from: b */
            public List<ContentValue> f39220b = Internal.newMutableList();

            /* renamed from: a */
            public SystemContentValue build() {
                return new SystemContentValue(this.f39219a, this.f39220b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14846a newBuilder() {
            C14846a aVar = new C14846a();
            aVar.f39219a = this.type;
            aVar.f39220b = Internal.copyOf("content_values", this.content_values);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "SystemContentValue");
            StringBuilder sb = new StringBuilder();
            if (this.type != null) {
                sb.append(", type=");
                sb.append(this.type);
            }
            if (!this.content_values.isEmpty()) {
                sb.append(", content_values=");
                sb.append(this.content_values);
            }
            StringBuilder replace = sb.replace(0, 2, "SystemContentValue{");
            replace.append('}');
            return replace.toString();
        }

        public SystemContentValue(ContentValueType contentValueType, List<ContentValue> list) {
            this(contentValueType, list, ByteString.EMPTY);
        }

        public SystemContentValue(ContentValueType contentValueType, List<ContentValue> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.type = contentValueType;
            this.content_values = Internal.immutableCopyOf("content_values", list);
        }
    }

    public static final class ContentValue extends Message<ContentValue, C14838a> {
        public static final ProtoAdapter<ContentValue> ADAPTER = new C14839b();
        public static final ContentValueType DEFAULT_TYPE = ContentValueType.CONTENT_VALUE_TYPE_UNKNOWN;
        private static final long serialVersionUID = 0;
        public final SystemMessageAction action;
        public final String id;
        public final List<String> ids;
        public final List<Item> items;
        public final String link;
        public final String text;
        public final ContentValueType type;

        /* renamed from: com.bytedance.lark.pb.basic.v1.Content$ContentValue$b */
        private static final class C14839b extends ProtoAdapter<ContentValue> {
            C14839b() {
                super(FieldEncoding.LENGTH_DELIMITED, ContentValue.class);
            }

            /* renamed from: a */
            public int encodedSize(ContentValue contentValue) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 0;
                if (contentValue.id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, contentValue.id);
                } else {
                    i = 0;
                }
                if (contentValue.type != null) {
                    i2 = ContentValueType.ADAPTER.encodedSizeWithTag(2, contentValue.type);
                } else {
                    i2 = 0;
                }
                int encodedSizeWithTag = i + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, contentValue.ids);
                if (contentValue.text != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, contentValue.text);
                } else {
                    i3 = 0;
                }
                int i6 = encodedSizeWithTag + i3;
                if (contentValue.link != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, contentValue.link);
                } else {
                    i4 = 0;
                }
                int i7 = i6 + i4;
                if (contentValue.action != null) {
                    i5 = SystemMessageAction.ADAPTER.encodedSizeWithTag(6, contentValue.action);
                }
                return i7 + i5 + Item.ADAPTER.asRepeated().encodedSizeWithTag(7, contentValue.items) + contentValue.unknownFields().size();
            }

            /* renamed from: a */
            public ContentValue decode(ProtoReader protoReader) throws IOException {
                C14838a aVar = new C14838a();
                aVar.f39195a = "";
                aVar.f39196b = ContentValueType.CONTENT_VALUE_TYPE_UNKNOWN;
                aVar.f39198d = "";
                aVar.f39199e = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f39195a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                try {
                                    aVar.f39196b = ContentValueType.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 3:
                                aVar.f39197c.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 4:
                                aVar.f39198d = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                aVar.f39199e = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                aVar.f39200f = SystemMessageAction.ADAPTER.decode(protoReader);
                                break;
                            case 7:
                                aVar.f39201g.add(Item.ADAPTER.decode(protoReader));
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

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ContentValue contentValue) throws IOException {
                if (contentValue.id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, contentValue.id);
                }
                if (contentValue.type != null) {
                    ContentValueType.ADAPTER.encodeWithTag(protoWriter, 2, contentValue.type);
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, contentValue.ids);
                if (contentValue.text != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, contentValue.text);
                }
                if (contentValue.link != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, contentValue.link);
                }
                if (contentValue.action != null) {
                    SystemMessageAction.ADAPTER.encodeWithTag(protoWriter, 6, contentValue.action);
                }
                Item.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, contentValue.items);
                protoWriter.writeBytes(contentValue.unknownFields());
            }
        }

        public static final class Item extends Message<Item, C14836a> {
            public static final ProtoAdapter<Item> ADAPTER = new C14837b();
            public static final Integer DEFAULT_ACTION_ID = 0;
            public static final Boolean DEFAULT_IS_CLICKABLE = false;
            public static final ContentValueType DEFAULT_TYPE = ContentValueType.CONTENT_VALUE_TYPE_UNKNOWN;
            private static final long serialVersionUID = 0;
            public final Integer action_id;
            public final Map<String, String> i18n_text;
            public final String id;
            public final Boolean is_clickable;
            public final String link;
            public final String text;
            public final ContentValueType type;

            /* renamed from: com.bytedance.lark.pb.basic.v1.Content$ContentValue$Item$a */
            public static final class C14836a extends Message.Builder<Item, C14836a> {

                /* renamed from: a */
                public String f39187a;

                /* renamed from: b */
                public String f39188b;

                /* renamed from: c */
                public Map<String, String> f39189c = Internal.newMutableMap();

                /* renamed from: d */
                public ContentValueType f39190d;

                /* renamed from: e */
                public String f39191e;

                /* renamed from: f */
                public Integer f39192f;

                /* renamed from: g */
                public Boolean f39193g;

                /* renamed from: a */
                public Item build() {
                    return new Item(this.f39187a, this.f39188b, this.f39189c, this.f39190d, this.f39191e, this.f39192f, this.f39193g, super.buildUnknownFields());
                }
            }

            /* renamed from: com.bytedance.lark.pb.basic.v1.Content$ContentValue$Item$b */
            private static final class C14837b extends ProtoAdapter<Item> {

                /* renamed from: a */
                private final ProtoAdapter<Map<String, String>> f39194a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

                C14837b() {
                    super(FieldEncoding.LENGTH_DELIMITED, Item.class);
                }

                /* renamed from: a */
                public int encodedSize(Item item) {
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    int i6 = 0;
                    if (item.id != null) {
                        i = ProtoAdapter.STRING.encodedSizeWithTag(1, item.id);
                    } else {
                        i = 0;
                    }
                    if (item.text != null) {
                        i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, item.text);
                    } else {
                        i2 = 0;
                    }
                    int encodedSizeWithTag = i + i2 + this.f39194a.encodedSizeWithTag(3, item.i18n_text);
                    if (item.type != null) {
                        i3 = ContentValueType.ADAPTER.encodedSizeWithTag(4, item.type);
                    } else {
                        i3 = 0;
                    }
                    int i7 = encodedSizeWithTag + i3;
                    if (item.link != null) {
                        i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, item.link);
                    } else {
                        i4 = 0;
                    }
                    int i8 = i7 + i4;
                    if (item.action_id != null) {
                        i5 = ProtoAdapter.INT32.encodedSizeWithTag(6, item.action_id);
                    } else {
                        i5 = 0;
                    }
                    int i9 = i8 + i5;
                    if (item.is_clickable != null) {
                        i6 = ProtoAdapter.BOOL.encodedSizeWithTag(7, item.is_clickable);
                    }
                    return i9 + i6 + item.unknownFields().size();
                }

                /* renamed from: a */
                public Item decode(ProtoReader protoReader) throws IOException {
                    C14836a aVar = new C14836a();
                    aVar.f39187a = "";
                    aVar.f39188b = "";
                    aVar.f39190d = ContentValueType.CONTENT_VALUE_TYPE_UNKNOWN;
                    aVar.f39191e = "";
                    aVar.f39192f = 0;
                    aVar.f39193g = false;
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag != -1) {
                            switch (nextTag) {
                                case 1:
                                    aVar.f39187a = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 2:
                                    aVar.f39188b = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 3:
                                    aVar.f39189c.putAll(this.f39194a.decode(protoReader));
                                    break;
                                case 4:
                                    try {
                                        aVar.f39190d = ContentValueType.ADAPTER.decode(protoReader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                        break;
                                    }
                                case 5:
                                    aVar.f39191e = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 6:
                                    aVar.f39192f = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 7:
                                    aVar.f39193g = ProtoAdapter.BOOL.decode(protoReader);
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

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, Item item) throws IOException {
                    if (item.id != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, item.id);
                    }
                    if (item.text != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, item.text);
                    }
                    this.f39194a.encodeWithTag(protoWriter, 3, item.i18n_text);
                    if (item.type != null) {
                        ContentValueType.ADAPTER.encodeWithTag(protoWriter, 4, item.type);
                    }
                    if (item.link != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, item.link);
                    }
                    if (item.action_id != null) {
                        ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, item.action_id);
                    }
                    if (item.is_clickable != null) {
                        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, item.is_clickable);
                    }
                    protoWriter.writeBytes(item.unknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C14836a newBuilder() {
                C14836a aVar = new C14836a();
                aVar.f39187a = this.id;
                aVar.f39188b = this.text;
                aVar.f39189c = Internal.copyOf("i18n_text", this.i18n_text);
                aVar.f39190d = this.type;
                aVar.f39191e = this.link;
                aVar.f39192f = this.action_id;
                aVar.f39193g = this.is_clickable;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("basic", "Item");
                StringBuilder sb = new StringBuilder();
                if (this.id != null) {
                    sb.append(", id=");
                    sb.append(this.id);
                }
                if (this.text != null) {
                    sb.append(", text=");
                    sb.append(this.text);
                }
                if (!this.i18n_text.isEmpty()) {
                    sb.append(", i18n_text=");
                    sb.append(this.i18n_text);
                }
                if (this.type != null) {
                    sb.append(", type=");
                    sb.append(this.type);
                }
                if (this.link != null) {
                    sb.append(", link=");
                    sb.append(this.link);
                }
                if (this.action_id != null) {
                    sb.append(", action_id=");
                    sb.append(this.action_id);
                }
                if (this.is_clickable != null) {
                    sb.append(", is_clickable=");
                    sb.append(this.is_clickable);
                }
                StringBuilder replace = sb.replace(0, 2, "Item{");
                replace.append('}');
                return replace.toString();
            }

            public Item(String str, String str2, Map<String, String> map, ContentValueType contentValueType, String str3, Integer num, Boolean bool) {
                this(str, str2, map, contentValueType, str3, num, bool, ByteString.EMPTY);
            }

            public Item(String str, String str2, Map<String, String> map, ContentValueType contentValueType, String str3, Integer num, Boolean bool, ByteString byteString) {
                super(ADAPTER, byteString);
                this.id = str;
                this.text = str2;
                this.i18n_text = Internal.immutableCopyOf("i18n_text", map);
                this.type = contentValueType;
                this.link = str3;
                this.action_id = num;
                this.is_clickable = bool;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Content$ContentValue$a */
        public static final class C14838a extends Message.Builder<ContentValue, C14838a> {

            /* renamed from: a */
            public String f39195a;

            /* renamed from: b */
            public ContentValueType f39196b;

            /* renamed from: c */
            public List<String> f39197c = Internal.newMutableList();

            /* renamed from: d */
            public String f39198d;

            /* renamed from: e */
            public String f39199e;

            /* renamed from: f */
            public SystemMessageAction f39200f;

            /* renamed from: g */
            public List<Item> f39201g = Internal.newMutableList();

            /* renamed from: a */
            public ContentValue build() {
                return new ContentValue(this.f39195a, this.f39196b, this.f39197c, this.f39198d, this.f39199e, this.f39200f, this.f39201g, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14838a newBuilder() {
            C14838a aVar = new C14838a();
            aVar.f39195a = this.id;
            aVar.f39196b = this.type;
            aVar.f39197c = Internal.copyOf("ids", this.ids);
            aVar.f39198d = this.text;
            aVar.f39199e = this.link;
            aVar.f39200f = this.action;
            aVar.f39201g = Internal.copyOf("items", this.items);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "ContentValue");
            StringBuilder sb = new StringBuilder();
            if (this.id != null) {
                sb.append(", id=");
                sb.append(this.id);
            }
            if (this.type != null) {
                sb.append(", type=");
                sb.append(this.type);
            }
            if (!this.ids.isEmpty()) {
                sb.append(", ids=");
                sb.append(this.ids);
            }
            if (this.text != null) {
                sb.append(", text=");
                sb.append(this.text);
            }
            if (this.link != null) {
                sb.append(", link=");
                sb.append(this.link);
            }
            if (this.action != null) {
                sb.append(", action=");
                sb.append(this.action);
            }
            if (!this.items.isEmpty()) {
                sb.append(", items=");
                sb.append(this.items);
            }
            StringBuilder replace = sb.replace(0, 2, "ContentValue{");
            replace.append('}');
            return replace.toString();
        }

        public ContentValue(String str, ContentValueType contentValueType, List<String> list, String str2, String str3, SystemMessageAction systemMessageAction, List<Item> list2) {
            this(str, contentValueType, list, str2, str3, systemMessageAction, list2, ByteString.EMPTY);
        }

        public ContentValue(String str, ContentValueType contentValueType, List<String> list, String str2, String str3, SystemMessageAction systemMessageAction, List<Item> list2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.id = str;
            this.type = contentValueType;
            this.ids = Internal.immutableCopyOf("ids", list);
            this.text = str2;
            this.link = str3;
            this.action = systemMessageAction;
            this.items = Internal.immutableCopyOf("items", list2);
        }
    }

    public static final class StickerInfo extends Message<StickerInfo, C14842a> {
        public static final ProtoAdapter<StickerInfo> ADAPTER = new C14843b();
        public static final Boolean DEFAULT_IS_PAID = false;
        private static final long serialVersionUID = 0;
        public final String description;
        public final Boolean is_paid;
        public final String title;

        /* renamed from: com.bytedance.lark.pb.basic.v1.Content$StickerInfo$b */
        private static final class C14843b extends ProtoAdapter<StickerInfo> {
            C14843b() {
                super(FieldEncoding.LENGTH_DELIMITED, StickerInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(StickerInfo stickerInfo) {
                int i;
                int i2;
                int i3 = 0;
                if (stickerInfo.title != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, stickerInfo.title);
                } else {
                    i = 0;
                }
                if (stickerInfo.description != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, stickerInfo.description);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (stickerInfo.is_paid != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, stickerInfo.is_paid);
                }
                return i4 + i3 + stickerInfo.unknownFields().size();
            }

            /* renamed from: a */
            public StickerInfo decode(ProtoReader protoReader) throws IOException {
                C14842a aVar = new C14842a();
                aVar.f39208a = "";
                aVar.f39209b = "";
                aVar.f39210c = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 2) {
                        aVar.f39208a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f39209b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39210c = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, StickerInfo stickerInfo) throws IOException {
                if (stickerInfo.title != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, stickerInfo.title);
                }
                if (stickerInfo.description != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, stickerInfo.description);
                }
                if (stickerInfo.is_paid != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, stickerInfo.is_paid);
                }
                protoWriter.writeBytes(stickerInfo.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Content$StickerInfo$a */
        public static final class C14842a extends Message.Builder<StickerInfo, C14842a> {

            /* renamed from: a */
            public String f39208a;

            /* renamed from: b */
            public String f39209b;

            /* renamed from: c */
            public Boolean f39210c;

            /* renamed from: a */
            public StickerInfo build() {
                return new StickerInfo(this.f39208a, this.f39209b, this.f39210c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14842a newBuilder() {
            C14842a aVar = new C14842a();
            aVar.f39208a = this.title;
            aVar.f39209b = this.description;
            aVar.f39210c = this.is_paid;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "StickerInfo");
            StringBuilder sb = new StringBuilder();
            if (this.title != null) {
                sb.append(", title=");
                sb.append(this.title);
            }
            if (this.description != null) {
                sb.append(", description=");
                sb.append(this.description);
            }
            if (this.is_paid != null) {
                sb.append(", is_paid=");
                sb.append(this.is_paid);
            }
            StringBuilder replace = sb.replace(0, 2, "StickerInfo{");
            replace.append('}');
            return replace.toString();
        }

        public StickerInfo(String str, String str2, Boolean bool) {
            this(str, str2, bool, ByteString.EMPTY);
        }

        public StickerInfo(String str, String str2, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.title = str;
            this.description = str2;
            this.is_paid = bool;
        }
    }

    public static final class TransmitInfo extends Message<TransmitInfo, C14854a> {
        public static final ProtoAdapter<TransmitInfo> ADAPTER = new C14855b();
        private static final long serialVersionUID = 0;
        public final String origin_merge_forward_id;

        /* renamed from: com.bytedance.lark.pb.basic.v1.Content$TransmitInfo$b */
        private static final class C14855b extends ProtoAdapter<TransmitInfo> {
            C14855b() {
                super(FieldEncoding.LENGTH_DELIMITED, TransmitInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(TransmitInfo transmitInfo) {
                int i;
                if (transmitInfo.origin_merge_forward_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, transmitInfo.origin_merge_forward_id);
                } else {
                    i = 0;
                }
                return i + transmitInfo.unknownFields().size();
            }

            /* renamed from: a */
            public TransmitInfo decode(ProtoReader protoReader) throws IOException {
                C14854a aVar = new C14854a();
                aVar.f39230a = "";
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
                        aVar.f39230a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, TransmitInfo transmitInfo) throws IOException {
                if (transmitInfo.origin_merge_forward_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, transmitInfo.origin_merge_forward_id);
                }
                protoWriter.writeBytes(transmitInfo.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Content$TransmitInfo$a */
        public static final class C14854a extends Message.Builder<TransmitInfo, C14854a> {

            /* renamed from: a */
            public String f39230a;

            /* renamed from: a */
            public TransmitInfo build() {
                return new TransmitInfo(this.f39230a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14854a newBuilder() {
            C14854a aVar = new C14854a();
            aVar.f39230a = this.origin_merge_forward_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "TransmitInfo");
            StringBuilder sb = new StringBuilder();
            if (this.origin_merge_forward_id != null) {
                sb.append(", origin_merge_forward_id=");
                sb.append(this.origin_merge_forward_id);
            }
            StringBuilder replace = sb.replace(0, 2, "TransmitInfo{");
            replace.append('}');
            return replace.toString();
        }

        public TransmitInfo(String str) {
            this(str, ByteString.EMPTY);
        }

        public TransmitInfo(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.origin_merge_forward_id = str;
        }
    }

    public static final class ShareUserCardInfo extends Message<ShareUserCardInfo, C14840a> {
        public static final ProtoAdapter<ShareUserCardInfo> ADAPTER = new C14841b();
        private static final long serialVersionUID = 0;
        public final Image avatar_image;
        public final String chatter_id;
        public final String en_us_name;
        public final Map<String, String> international_name;
        public final String name;

        /* renamed from: com.bytedance.lark.pb.basic.v1.Content$ShareUserCardInfo$a */
        public static final class C14840a extends Message.Builder<ShareUserCardInfo, C14840a> {

            /* renamed from: a */
            public String f39202a;

            /* renamed from: b */
            public Image f39203b;

            /* renamed from: c */
            public String f39204c;

            /* renamed from: d */
            public String f39205d;

            /* renamed from: e */
            public Map<String, String> f39206e = Internal.newMutableMap();

            /* renamed from: a */
            public ShareUserCardInfo build() {
                return new ShareUserCardInfo(this.f39202a, this.f39203b, this.f39204c, this.f39205d, this.f39206e, super.buildUnknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Content$ShareUserCardInfo$b */
        private static final class C14841b extends ProtoAdapter<ShareUserCardInfo> {

            /* renamed from: a */
            private final ProtoAdapter<Map<String, String>> f39207a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

            C14841b() {
                super(FieldEncoding.LENGTH_DELIMITED, ShareUserCardInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(ShareUserCardInfo shareUserCardInfo) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (shareUserCardInfo.chatter_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, shareUserCardInfo.chatter_id);
                } else {
                    i = 0;
                }
                if (shareUserCardInfo.avatar_image != null) {
                    i2 = Image.ADAPTER.encodedSizeWithTag(2, shareUserCardInfo.avatar_image);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (shareUserCardInfo.name != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, shareUserCardInfo.name);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (shareUserCardInfo.en_us_name != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, shareUserCardInfo.en_us_name);
                }
                return i6 + i4 + this.f39207a.encodedSizeWithTag(5, shareUserCardInfo.international_name) + shareUserCardInfo.unknownFields().size();
            }

            /* renamed from: a */
            public ShareUserCardInfo decode(ProtoReader protoReader) throws IOException {
                C14840a aVar = new C14840a();
                aVar.f39202a = "";
                aVar.f39204c = "";
                aVar.f39205d = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f39202a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f39203b = Image.ADAPTER.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f39204c = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f39205d = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39206e.putAll(this.f39207a.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ShareUserCardInfo shareUserCardInfo) throws IOException {
                if (shareUserCardInfo.chatter_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, shareUserCardInfo.chatter_id);
                }
                if (shareUserCardInfo.avatar_image != null) {
                    Image.ADAPTER.encodeWithTag(protoWriter, 2, shareUserCardInfo.avatar_image);
                }
                if (shareUserCardInfo.name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, shareUserCardInfo.name);
                }
                if (shareUserCardInfo.en_us_name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, shareUserCardInfo.en_us_name);
                }
                this.f39207a.encodeWithTag(protoWriter, 5, shareUserCardInfo.international_name);
                protoWriter.writeBytes(shareUserCardInfo.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14840a newBuilder() {
            C14840a aVar = new C14840a();
            aVar.f39202a = this.chatter_id;
            aVar.f39203b = this.avatar_image;
            aVar.f39204c = this.name;
            aVar.f39205d = this.en_us_name;
            aVar.f39206e = Internal.copyOf("international_name", this.international_name);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "ShareUserCardInfo");
            StringBuilder sb = new StringBuilder();
            if (this.chatter_id != null) {
                sb.append(", chatter_id=");
                sb.append(this.chatter_id);
            }
            if (this.avatar_image != null) {
                sb.append(", avatar_image=");
                sb.append(this.avatar_image);
            }
            if (this.name != null) {
                sb.append(", name=");
                sb.append(this.name);
            }
            if (this.en_us_name != null) {
                sb.append(", en_us_name=");
                sb.append(this.en_us_name);
            }
            if (!this.international_name.isEmpty()) {
                sb.append(", international_name=");
                sb.append(this.international_name);
            }
            StringBuilder replace = sb.replace(0, 2, "ShareUserCardInfo{");
            replace.append('}');
            return replace.toString();
        }

        public ShareUserCardInfo(String str, Image image, String str2, String str3, Map<String, String> map) {
            this(str, image, str2, str3, map, ByteString.EMPTY);
        }

        public ShareUserCardInfo(String str, Image image, String str2, String str3, Map<String, String> map, ByteString byteString) {
            super(ADAPTER, byteString);
            this.chatter_id = str;
            this.avatar_image = image;
            this.name = str2;
            this.en_us_name = str3;
            this.international_name = Internal.immutableCopyOf("international_name", map);
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Content$a */
    public static final class C14856a extends Message.Builder<Content, C14856a> {

        /* renamed from: A */
        public String f39231A;

        /* renamed from: B */
        public Boolean f39232B;

        /* renamed from: C */
        public String f39233C;

        /* renamed from: D */
        public Boolean f39234D;

        /* renamed from: E */
        public Integer f39235E;

        /* renamed from: F */
        public Boolean f39236F;

        /* renamed from: G */
        public Map<String, UrlPreviewHangPoint> f39237G = Internal.newMutableMap();

        /* renamed from: H */
        public Boolean f39238H;

        /* renamed from: I */
        public DocEntity f39239I;

        /* renamed from: J */
        public String f39240J;

        /* renamed from: K */
        public File.Source f39241K;

        /* renamed from: L */
        public String f39242L;

        /* renamed from: M */
        public Boolean f39243M;

        /* renamed from: N */
        public String f39244N;

        /* renamed from: O */
        public TransStatus f39245O;

        /* renamed from: P */
        public TransIdentity f39246P;

        /* renamed from: Q */
        public String f39247Q;

        /* renamed from: R */
        public String f39248R;

        /* renamed from: S */
        public String f39249S;

        /* renamed from: T */
        public Boolean f39250T;

        /* renamed from: U */
        public Boolean f39251U;

        /* renamed from: V */
        public String f39252V;

        /* renamed from: W */
        public List<File> f39253W = Internal.newMutableList();

        /* renamed from: X */
        public String f39254X;

        /* renamed from: Y */
        public String f39255Y;

        /* renamed from: Z */
        public Long f39256Z;

        /* renamed from: a */
        public String f39257a;
        public MediaContent aA;
        public HongbaoContent aB;
        public HongbaoSystemContent aC;
        public VideoChatContent aD;
        public List<String> aE = Internal.newMutableList();
        public String aF;
        public StickerInfo aG;
        public String aH;
        public String aI;
        public ShareUserCardInfo aJ;
        public String aK;
        public Abbreviation aL;
        public Map<String, ElementRefs> aM = Internal.newMutableMap();
        public TodoOperationContent aN;
        public Integer aa;
        public Integer ab;
        public Integer ac;
        public String ad;
        public MergeForwardContent ae;
        public TransmitInfo af;
        public List<PreviewUrlContent> ag = Internal.newMutableList();
        public RichText ah;

        /* renamed from: ai  reason: collision with root package name */
        public CalendarContent f175427ai;
        public ShareCalendarEventContent aj;
        public GeneralCalendarContent ak;
        public List<TextUrlContent> al = Internal.newMutableList();
        public CardContent am;
        public LocationContent an;
        public String ao;
        public String ap;
        public String aq;
        public String ar;
        public String as;
        public String at;
        public String au;
        public String av;
        public String aw;
        public String ax;
        public String ay;
        public Boolean az;

        /* renamed from: b */
        public String f39258b;

        /* renamed from: c */
        public ImageSet f39259c;

        /* renamed from: d */
        public Boolean f39260d;

        /* renamed from: e */
        public Long f39261e;

        /* renamed from: f */
        public String f39262f;

        /* renamed from: g */
        public String f39263g;

        /* renamed from: h */
        public Long f39264h;

        /* renamed from: i */
        public String f39265i;

        /* renamed from: j */
        public String f39266j;

        /* renamed from: k */
        public Map<String, String> f39267k = Internal.newMutableMap();

        /* renamed from: l */
        public Integer f39268l;

        /* renamed from: m */
        public FileType f39269m;

        /* renamed from: n */
        public SystemType f39270n;

        /* renamed from: o */
        public EmailSystemEvent f39271o;

        /* renamed from: p */
        public Map<String, ContentValue> f39272p = Internal.newMutableMap();

        /* renamed from: q */
        public Integer f39273q;

        /* renamed from: r */
        public String f39274r;

        /* renamed from: s */
        public Map<String, SystemContentValue> f39275s = Internal.newMutableMap();

        /* renamed from: t */
        public Map<Integer, SystemMessageItemAction> f39276t = Internal.newMutableMap();

        /* renamed from: u */
        public Integer f39277u;

        /* renamed from: v */
        public String f39278v;

        /* renamed from: w */
        public Boolean f39279w;

        /* renamed from: x */
        public Long f39280x;

        /* renamed from: y */
        public String f39281y;

        /* renamed from: z */
        public String f39282z;

        /* renamed from: a */
        public Content build() {
            return new Content(this.f39257a, this.f39258b, this.f39259c, this.f39260d, this.f39261e, this.f39262f, this.f39263g, this.f39264h, this.f39265i, this.f39266j, this.f39267k, this.f39268l, this.f39269m, this.f39270n, this.f39271o, this.f39272p, this.f39273q, this.f39274r, this.f39275s, this.f39276t, this.f39277u, this.f39278v, this.f39279w, this.f39280x, this.f39281y, this.f39282z, this.f39231A, this.f39232B, this.f39233C, this.f39234D, this.f39235E, this.f39236F, this.f39237G, this.f39238H, this.f39239I, this.f39240J, this.f39241K, this.f39242L, this.f39243M, this.f39244N, this.f39245O, this.f39246P, this.f39247Q, this.f39248R, this.f39249S, this.f39250T, this.f39251U, this.f39252V, this.f39253W, this.f39254X, this.f39255Y, this.f39256Z, this.aa, this.ab, this.ac, this.ad, this.ae, this.af, this.ag, this.ah, this.f175427ai, this.aj, this.ak, this.al, this.am, this.an, this.ao, this.ap, this.aq, this.ar, this.as, this.at, this.au, this.av, this.aw, this.ax, this.ay, this.az, this.aA, this.aB, this.aC, this.aD, this.aE, this.aF, this.aG, this.aH, this.aI, this.aJ, this.aK, this.aL, this.aM, this.aN, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C14856a mo54490a(RichText richText) {
            this.ah = richText;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C14856a newBuilder() {
        C14856a aVar = new C14856a();
        aVar.f39257a = this.title;
        aVar.f39258b = this.text;
        aVar.f39259c = this.image;
        aVar.f39260d = this.is_origin_source;
        aVar.f39261e = this.origin_size;
        aVar.f39262f = this.key;
        aVar.f39263g = this.name;
        aVar.f39264h = this.size;
        aVar.f39265i = this.mime;
        aVar.f39266j = this.template;
        aVar.f39267k = Internal.copyOf("values", this.values);
        aVar.f39268l = this.duration;
        aVar.f39269m = this.deprecated;
        aVar.f39270n = this.system_type;
        aVar.f39271o = this.event;
        aVar.f39272p = Internal.copyOf("content_values", this.content_values);
        aVar.f39273q = this.system_type_value;
        aVar.f39274r = this.i18n_title_key;
        aVar.f39275s = Internal.copyOf("system_content_values", this.system_content_values);
        aVar.f39276t = Internal.copyOf("item_actions", this.item_actions);
        aVar.f39277u = this.system_message_version;
        aVar.f39278v = this.voice2text;
        aVar.f39279w = this.hide_voice2text;
        aVar.f39280x = this.origin_sender_id;
        aVar.f39281y = this.local_upload_id;
        aVar.f39282z = this.origin_tos_key;
        aVar.f39231A = this.origin_sender_name;
        aVar.f39232B = this.is_friend;
        aVar.f39233C = this.origin_sender_id_str;
        aVar.f39234D = this.is_audio_recognize_finish;
        aVar.f39235E = this.audio2text_start_time;
        aVar.f39236F = this.is_audio_with_text;
        aVar.f39237G = Internal.copyOf("url_preview_hang_point_map", this.url_preview_hang_point_map);
        aVar.f39238H = this.is_group_announcement;
        aVar.f39239I = this.doc_entity;
        aVar.f39240J = this.file_path;
        aVar.f39241K = this.file_source;
        aVar.f39242L = this.namespace;
        aVar.f39243M = this.is_in_my_nut_store;
        aVar.f39244N = this.cache_file_path;
        aVar.f39245O = this.lan_trans_status;
        aVar.f39246P = this.trans_identity;
        aVar.f39247Q = this.lan_trans_status_text;
        aVar.f39248R = this.lan_sender_device_id;
        aVar.f39249S = this.lan_receiver_device_id;
        aVar.f39250T = this.is_try_use_lan_trans;
        aVar.f39251U = this.is_able_lan_trans;
        aVar.f39252V = this.file_uri;
        aVar.f39253W = Internal.copyOf("attachments", this.attachments);
        aVar.f39254X = this.share_chat_id;
        aVar.f39255Y = this.join_token;
        aVar.f39256Z = this.expire_time;
        aVar.aa = this.share_chat_last_state;
        aVar.ab = this.width;
        aVar.ac = this.height;
        aVar.ad = this.crypto_token;
        aVar.ae = this.merge_forward_content;
        aVar.af = this.transmit_info;
        aVar.ag = Internal.copyOf("preview_urls", this.preview_urls);
        aVar.ah = this.rich_text;
        aVar.f175427ai = this.calendar_content;
        aVar.aj = this.share_calendar_event_content;
        aVar.ak = this.general_calendar_content;
        aVar.al = Internal.copyOf("text_url_contents", this.text_url_contents);
        aVar.am = this.card_content;
        aVar.an = this.location_content;
        aVar.ao = this.e2ee_from_id;
        aVar.ap = this.e2ee_to_id;
        aVar.aq = this.trigger_id;
        aVar.ar = this.vc_from_id;
        aVar.as = this.vc_to_id;
        aVar.at = this.vc_duration_time;
        aVar.au = this.vc_meeting_id;
        aVar.av = this.vc_passcode;
        aVar.aw = this.vc_feedback_status;
        aVar.ax = this.vc_from_feedback_status;
        aVar.ay = this.vc_to_feedback_status;
        aVar.az = this.is_voice_call;
        aVar.aA = this.media_content;
        aVar.aB = this.hongbao_content;
        aVar.aC = this.hongbao_system_content;
        aVar.aD = this.videochat_content;
        aVar.aE = Internal.copyOf("resource_urls", this.resource_urls);
        aVar.aF = this.fs_unit;
        aVar.aG = this.sticker_info;
        aVar.aH = this.sticker_id;
        aVar.aI = this.sticker_set_id;
        aVar.aJ = this.share_user_card_info;
        aVar.aK = this.share_chatter_id;
        aVar.aL = this.abbreviation;
        aVar.aM = Internal.copyOf("typed_element_refs", this.typed_element_refs);
        aVar.aN = this.todo_operation_content;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Content");
        StringBuilder sb = new StringBuilder();
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        if (this.image != null) {
            sb.append(", image=");
            sb.append(this.image);
        }
        if (this.is_origin_source != null) {
            sb.append(", is_origin_source=");
            sb.append(this.is_origin_source);
        }
        if (this.origin_size != null) {
            sb.append(", origin_size=");
            sb.append(this.origin_size);
        }
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.size != null) {
            sb.append(", size=");
            sb.append(this.size);
        }
        if (this.mime != null) {
            sb.append(", mime=");
            sb.append(this.mime);
        }
        if (this.template != null) {
            sb.append(", template=");
            sb.append(this.template);
        }
        if (!this.values.isEmpty()) {
            sb.append(", values=");
            sb.append(this.values);
        }
        if (this.duration != null) {
            sb.append(", duration=");
            sb.append(this.duration);
        }
        if (this.deprecated != null) {
            sb.append(", deprecated=");
            sb.append(this.deprecated);
        }
        if (this.system_type != null) {
            sb.append(", system_type=");
            sb.append(this.system_type);
        }
        if (this.event != null) {
            sb.append(", event=");
            sb.append(this.event);
        }
        if (!this.content_values.isEmpty()) {
            sb.append(", content_values=");
            sb.append(this.content_values);
        }
        if (this.system_type_value != null) {
            sb.append(", system_type_value=");
            sb.append(this.system_type_value);
        }
        if (this.i18n_title_key != null) {
            sb.append(", i18n_title_key=");
            sb.append(this.i18n_title_key);
        }
        if (!this.system_content_values.isEmpty()) {
            sb.append(", system_content_values=");
            sb.append(this.system_content_values);
        }
        if (!this.item_actions.isEmpty()) {
            sb.append(", item_actions=");
            sb.append(this.item_actions);
        }
        if (this.system_message_version != null) {
            sb.append(", system_message_version=");
            sb.append(this.system_message_version);
        }
        if (this.voice2text != null) {
            sb.append(", voice2text=");
            sb.append(this.voice2text);
        }
        if (this.hide_voice2text != null) {
            sb.append(", hide_voice2text=");
            sb.append(this.hide_voice2text);
        }
        if (this.origin_sender_id != null) {
            sb.append(", origin_sender_id=");
            sb.append(this.origin_sender_id);
        }
        if (this.local_upload_id != null) {
            sb.append(", local_upload_id=");
            sb.append(this.local_upload_id);
        }
        if (this.origin_tos_key != null) {
            sb.append(", origin_tos_key=");
            sb.append(this.origin_tos_key);
        }
        if (this.origin_sender_name != null) {
            sb.append(", origin_sender_name=");
            sb.append(this.origin_sender_name);
        }
        if (this.is_friend != null) {
            sb.append(", is_friend=");
            sb.append(this.is_friend);
        }
        if (this.origin_sender_id_str != null) {
            sb.append(", origin_sender_id_str=");
            sb.append(this.origin_sender_id_str);
        }
        if (this.is_audio_recognize_finish != null) {
            sb.append(", is_audio_recognize_finish=");
            sb.append(this.is_audio_recognize_finish);
        }
        if (this.audio2text_start_time != null) {
            sb.append(", audio2text_start_time=");
            sb.append(this.audio2text_start_time);
        }
        if (this.is_audio_with_text != null) {
            sb.append(", is_audio_with_text=");
            sb.append(this.is_audio_with_text);
        }
        if (!this.url_preview_hang_point_map.isEmpty()) {
            sb.append(", url_preview_hang_point_map=");
            sb.append(this.url_preview_hang_point_map);
        }
        if (this.is_group_announcement != null) {
            sb.append(", is_group_announcement=");
            sb.append(this.is_group_announcement);
        }
        if (this.doc_entity != null) {
            sb.append(", doc_entity=");
            sb.append(this.doc_entity);
        }
        if (this.file_path != null) {
            sb.append(", file_path=");
            sb.append(this.file_path);
        }
        if (this.file_source != null) {
            sb.append(", file_source=");
            sb.append(this.file_source);
        }
        if (this.namespace != null) {
            sb.append(", namespace=");
            sb.append(this.namespace);
        }
        if (this.is_in_my_nut_store != null) {
            sb.append(", is_in_my_nut_store=");
            sb.append(this.is_in_my_nut_store);
        }
        if (this.cache_file_path != null) {
            sb.append(", cache_file_path=");
            sb.append(this.cache_file_path);
        }
        if (this.lan_trans_status != null) {
            sb.append(", lan_trans_status=");
            sb.append(this.lan_trans_status);
        }
        if (this.trans_identity != null) {
            sb.append(", trans_identity=");
            sb.append(this.trans_identity);
        }
        if (this.lan_trans_status_text != null) {
            sb.append(", lan_trans_status_text=");
            sb.append(this.lan_trans_status_text);
        }
        if (this.lan_sender_device_id != null) {
            sb.append(", lan_sender_device_id=");
            sb.append(this.lan_sender_device_id);
        }
        if (this.lan_receiver_device_id != null) {
            sb.append(", lan_receiver_device_id=");
            sb.append(this.lan_receiver_device_id);
        }
        if (this.is_try_use_lan_trans != null) {
            sb.append(", is_try_use_lan_trans=");
            sb.append(this.is_try_use_lan_trans);
        }
        if (this.is_able_lan_trans != null) {
            sb.append(", is_able_lan_trans=");
            sb.append(this.is_able_lan_trans);
        }
        if (this.file_uri != null) {
            sb.append(", file_uri=");
            sb.append(this.file_uri);
        }
        if (!this.attachments.isEmpty()) {
            sb.append(", attachments=");
            sb.append(this.attachments);
        }
        if (this.share_chat_id != null) {
            sb.append(", share_chat_id=");
            sb.append(this.share_chat_id);
        }
        if (this.join_token != null) {
            sb.append(", join_token=");
            sb.append(this.join_token);
        }
        if (this.expire_time != null) {
            sb.append(", expire_time=");
            sb.append(this.expire_time);
        }
        if (this.share_chat_last_state != null) {
            sb.append(", share_chat_last_state=");
            sb.append(this.share_chat_last_state);
        }
        if (this.width != null) {
            sb.append(", width=");
            sb.append(this.width);
        }
        if (this.height != null) {
            sb.append(", height=");
            sb.append(this.height);
        }
        if (this.crypto_token != null) {
            sb.append(", crypto_token=");
            sb.append(this.crypto_token);
        }
        if (this.merge_forward_content != null) {
            sb.append(", merge_forward_content=");
            sb.append(this.merge_forward_content);
        }
        if (this.transmit_info != null) {
            sb.append(", transmit_info=");
            sb.append(this.transmit_info);
        }
        if (!this.preview_urls.isEmpty()) {
            sb.append(", preview_urls=");
            sb.append(this.preview_urls);
        }
        if (this.rich_text != null) {
            sb.append(", rich_text=");
            sb.append(this.rich_text);
        }
        if (this.calendar_content != null) {
            sb.append(", calendar_content=");
            sb.append(this.calendar_content);
        }
        if (this.share_calendar_event_content != null) {
            sb.append(", share_calendar_event_content=");
            sb.append(this.share_calendar_event_content);
        }
        if (this.general_calendar_content != null) {
            sb.append(", general_calendar_content=");
            sb.append(this.general_calendar_content);
        }
        if (!this.text_url_contents.isEmpty()) {
            sb.append(", text_url_contents=");
            sb.append(this.text_url_contents);
        }
        if (this.card_content != null) {
            sb.append(", card_content=");
            sb.append(this.card_content);
        }
        if (this.location_content != null) {
            sb.append(", location_content=");
            sb.append(this.location_content);
        }
        if (this.e2ee_from_id != null) {
            sb.append(", e2ee_from_id=");
            sb.append(this.e2ee_from_id);
        }
        if (this.e2ee_to_id != null) {
            sb.append(", e2ee_to_id=");
            sb.append(this.e2ee_to_id);
        }
        if (this.trigger_id != null) {
            sb.append(", trigger_id=");
            sb.append(this.trigger_id);
        }
        if (this.vc_from_id != null) {
            sb.append(", vc_from_id=");
            sb.append(this.vc_from_id);
        }
        if (this.vc_to_id != null) {
            sb.append(", vc_to_id=");
            sb.append(this.vc_to_id);
        }
        if (this.vc_duration_time != null) {
            sb.append(", vc_duration_time=");
            sb.append(this.vc_duration_time);
        }
        if (this.vc_meeting_id != null) {
            sb.append(", vc_meeting_id=");
            sb.append(this.vc_meeting_id);
        }
        if (this.vc_passcode != null) {
            sb.append(", vc_passcode=");
            sb.append(this.vc_passcode);
        }
        if (this.vc_feedback_status != null) {
            sb.append(", vc_feedback_status=");
            sb.append(this.vc_feedback_status);
        }
        if (this.vc_from_feedback_status != null) {
            sb.append(", vc_from_feedback_status=");
            sb.append(this.vc_from_feedback_status);
        }
        if (this.vc_to_feedback_status != null) {
            sb.append(", vc_to_feedback_status=");
            sb.append(this.vc_to_feedback_status);
        }
        if (this.is_voice_call != null) {
            sb.append(", is_voice_call=");
            sb.append(this.is_voice_call);
        }
        if (this.media_content != null) {
            sb.append(", media_content=");
            sb.append(this.media_content);
        }
        if (this.hongbao_content != null) {
            sb.append(", hongbao_content=");
            sb.append(this.hongbao_content);
        }
        if (this.hongbao_system_content != null) {
            sb.append(", hongbao_system_content=");
            sb.append(this.hongbao_system_content);
        }
        if (this.videochat_content != null) {
            sb.append(", videochat_content=");
            sb.append(this.videochat_content);
        }
        if (!this.resource_urls.isEmpty()) {
            sb.append(", resource_urls=");
            sb.append(this.resource_urls);
        }
        if (this.fs_unit != null) {
            sb.append(", fs_unit=");
            sb.append(this.fs_unit);
        }
        if (this.sticker_info != null) {
            sb.append(", sticker_info=");
            sb.append(this.sticker_info);
        }
        if (this.sticker_id != null) {
            sb.append(", sticker_id=");
            sb.append(this.sticker_id);
        }
        if (this.sticker_set_id != null) {
            sb.append(", sticker_set_id=");
            sb.append(this.sticker_set_id);
        }
        if (this.share_user_card_info != null) {
            sb.append(", share_user_card_info=");
            sb.append(this.share_user_card_info);
        }
        if (this.share_chatter_id != null) {
            sb.append(", share_chatter_id=");
            sb.append(this.share_chatter_id);
        }
        if (this.abbreviation != null) {
            sb.append(", abbreviation=");
            sb.append(this.abbreviation);
        }
        if (!this.typed_element_refs.isEmpty()) {
            sb.append(", typed_element_refs=");
            sb.append(this.typed_element_refs);
        }
        if (this.todo_operation_content != null) {
            sb.append(", todo_operation_content=");
            sb.append(this.todo_operation_content);
        }
        StringBuilder replace = sb.replace(0, 2, "Content{");
        replace.append('}');
        return replace.toString();
    }
}
