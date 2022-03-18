package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class Chatter extends Message<Chatter, C14823a> {
    public static final ProtoAdapter<Chatter> ADAPTER = new C14824b();
    public static final Boolean DEFAULT_ACCEPT_SMS_PHONE_URGENT = false;
    public static final Boolean DEFAULT_CAN_JOIN_GROUP = true;
    public static final Long DEFAULT_DO_NOT_DISTURB_END_TIME = 0L;
    public static final Boolean DEFAULT_IN_CONTACTS = true;
    public static final Boolean DEFAULT_IS_ANONYMOUS = false;
    public static final Boolean DEFAULT_IS_FROZEN = false;
    public static final Boolean DEFAULT_IS_REGISTERED = true;
    public static final Boolean DEFAULT_IS_RESIGNED = false;
    public static final Boolean DEFAULT_PROFILE_ENABLED = true;
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Boolean accept_sms_phone_urgent;
    public final AccessInfo access_info;
    public final String account_id;
    public final String alias;
    public final ImageSet avatar;
    public final String avatar_key;
    public final AvatarMedal avatar_medal;
    public final String avatar_path;
    public final List<String> avatar_urls;
    public final Boolean can_join_group;
    public final ChatExtra chat_extra;
    public final String creator_id;
    public final Description description;
    public final Long do_not_disturb_end_time;
    public final String email;
    public final String en_us_name;
    public final String id;
    public final Boolean in_contacts;
    public final Boolean is_anonymous;
    public final Boolean is_frozen;
    public final Boolean is_registered;
    public final Boolean is_resigned;
    public final String localized_name;
    public final String name;
    public final String name_pinyin;
    public final String open_app_id;
    public final Boolean profile_enabled;
    public final List<ChatterCustomStatus> status;
    public final List<Tag> tags;
    public final String tenant_id;
    public final TimeZone time_zone;
    public final Type type;
    public final Long update_time;
    public final String with_bot_tag;
    public final WorkStatus work_status;

    public static final class ChatExtra extends Message<ChatExtra, C14815a> {
        public static final ProtoAdapter<ChatExtra> ADAPTER = new C14816b();
        public static final OncallRole DEFAULT_ONCALL_ROLE = OncallRole.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final String chat_id;
        public final String nick_name;
        public final String nick_name_pinyin;
        public final OncallRole oncall_role;
        public final ChatChatterTagInfo tag_infos;

        public enum OncallRole implements WireEnum {
            UNKNOWN(0),
            USER(3),
            ONCALL(4),
            ONCALL_HELPER(5),
            USER_HELPER(6);
            
            public static final ProtoAdapter<OncallRole> ADAPTER = ProtoAdapter.newEnumAdapter(OncallRole.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static OncallRole fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 3) {
                    return USER;
                }
                if (i == 4) {
                    return ONCALL;
                }
                if (i == 5) {
                    return ONCALL_HELPER;
                }
                if (i != 6) {
                    return null;
                }
                return USER_HELPER;
            }

            private OncallRole(int i) {
                this.value = i;
            }
        }

        public static final class ChatChatterTagInfo extends Message<ChatChatterTagInfo, C14813a> {
            public static final ProtoAdapter<ChatChatterTagInfo> ADAPTER = new C14814b();
            private static final long serialVersionUID = 0;
            public final List<TagInfo> tags;

            public static final class TagInfo extends Message<TagInfo, C14811a> {
                public static final ProtoAdapter<TagInfo> ADAPTER = new C14812b();
                public static final TagType DEFAULT_TAG_TYPE = TagType.UNKNOWN;
                private static final long serialVersionUID = 0;
                public final String description;
                public final TagType tag_type;

                public enum TagType implements WireEnum {
                    UNKNOWN(0),
                    CLASS_TEACHER(1),
                    DISCIPLINE_TEACHER(2),
                    ADMIN_USER(3);
                    
                    public static final ProtoAdapter<TagType> ADAPTER = ProtoAdapter.newEnumAdapter(TagType.class);
                    private final int value;

                    @Override // com.squareup.wire.WireEnum
                    public int getValue() {
                        return this.value;
                    }

                    public static TagType fromValue(int i) {
                        if (i == 0) {
                            return UNKNOWN;
                        }
                        if (i == 1) {
                            return CLASS_TEACHER;
                        }
                        if (i == 2) {
                            return DISCIPLINE_TEACHER;
                        }
                        if (i != 3) {
                            return null;
                        }
                        return ADMIN_USER;
                    }

                    private TagType(int i) {
                        this.value = i;
                    }
                }

                /* renamed from: com.bytedance.lark.pb.basic.v1.Chatter$ChatExtra$ChatChatterTagInfo$TagInfo$b */
                private static final class C14812b extends ProtoAdapter<TagInfo> {
                    C14812b() {
                        super(FieldEncoding.LENGTH_DELIMITED, TagInfo.class);
                    }

                    /* renamed from: a */
                    public int encodedSize(TagInfo tagInfo) {
                        int i;
                        int i2 = 0;
                        if (tagInfo.tag_type != null) {
                            i = TagType.ADAPTER.encodedSizeWithTag(1, tagInfo.tag_type);
                        } else {
                            i = 0;
                        }
                        if (tagInfo.description != null) {
                            i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, tagInfo.description);
                        }
                        return i + i2 + tagInfo.unknownFields().size();
                    }

                    /* renamed from: a */
                    public TagInfo decode(ProtoReader protoReader) throws IOException {
                        C14811a aVar = new C14811a();
                        aVar.f39120a = TagType.UNKNOWN;
                        aVar.f39121b = "";
                        long beginMessage = protoReader.beginMessage();
                        while (true) {
                            int nextTag = protoReader.nextTag();
                            if (nextTag == -1) {
                                protoReader.endMessage(beginMessage);
                                return aVar.build();
                            } else if (nextTag == 1) {
                                try {
                                    aVar.f39120a = TagType.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                }
                            } else if (nextTag != 2) {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                aVar.f39121b = ProtoAdapter.STRING.decode(protoReader);
                            }
                        }
                    }

                    /* renamed from: a */
                    public void encode(ProtoWriter protoWriter, TagInfo tagInfo) throws IOException {
                        if (tagInfo.tag_type != null) {
                            TagType.ADAPTER.encodeWithTag(protoWriter, 1, tagInfo.tag_type);
                        }
                        if (tagInfo.description != null) {
                            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, tagInfo.description);
                        }
                        protoWriter.writeBytes(tagInfo.unknownFields());
                    }
                }

                /* renamed from: com.bytedance.lark.pb.basic.v1.Chatter$ChatExtra$ChatChatterTagInfo$TagInfo$a */
                public static final class C14811a extends Message.Builder<TagInfo, C14811a> {

                    /* renamed from: a */
                    public TagType f39120a;

                    /* renamed from: b */
                    public String f39121b;

                    /* renamed from: a */
                    public TagInfo build() {
                        return new TagInfo(this.f39120a, this.f39121b, super.buildUnknownFields());
                    }
                }

                @Override // com.squareup.wire.Message
                public C14811a newBuilder() {
                    C14811a aVar = new C14811a();
                    aVar.f39120a = this.tag_type;
                    aVar.f39121b = this.description;
                    aVar.addUnknownFields(unknownFields());
                    return aVar;
                }

                @Override // com.squareup.wire.Message
                public String toString() {
                    C1911a.m8540a("basic", "TagInfo");
                    StringBuilder sb = new StringBuilder();
                    if (this.tag_type != null) {
                        sb.append(", tag_type=");
                        sb.append(this.tag_type);
                    }
                    if (this.description != null) {
                        sb.append(", description=");
                        sb.append(this.description);
                    }
                    StringBuilder replace = sb.replace(0, 2, "TagInfo{");
                    replace.append('}');
                    return replace.toString();
                }

                public TagInfo(TagType tagType, String str) {
                    this(tagType, str, ByteString.EMPTY);
                }

                public TagInfo(TagType tagType, String str, ByteString byteString) {
                    super(ADAPTER, byteString);
                    this.tag_type = tagType;
                    this.description = str;
                }
            }

            /* renamed from: com.bytedance.lark.pb.basic.v1.Chatter$ChatExtra$ChatChatterTagInfo$b */
            private static final class C14814b extends ProtoAdapter<ChatChatterTagInfo> {
                C14814b() {
                    super(FieldEncoding.LENGTH_DELIMITED, ChatChatterTagInfo.class);
                }

                /* renamed from: a */
                public int encodedSize(ChatChatterTagInfo chatChatterTagInfo) {
                    return TagInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, chatChatterTagInfo.tags) + chatChatterTagInfo.unknownFields().size();
                }

                /* renamed from: a */
                public ChatChatterTagInfo decode(ProtoReader protoReader) throws IOException {
                    C14813a aVar = new C14813a();
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
                            aVar.f39122a.add(TagInfo.ADAPTER.decode(protoReader));
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, ChatChatterTagInfo chatChatterTagInfo) throws IOException {
                    TagInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, chatChatterTagInfo.tags);
                    protoWriter.writeBytes(chatChatterTagInfo.unknownFields());
                }
            }

            /* renamed from: com.bytedance.lark.pb.basic.v1.Chatter$ChatExtra$ChatChatterTagInfo$a */
            public static final class C14813a extends Message.Builder<ChatChatterTagInfo, C14813a> {

                /* renamed from: a */
                public List<TagInfo> f39122a = Internal.newMutableList();

                /* renamed from: a */
                public ChatChatterTagInfo build() {
                    return new ChatChatterTagInfo(this.f39122a, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C14813a newBuilder() {
                C14813a aVar = new C14813a();
                aVar.f39122a = Internal.copyOf("tags", this.tags);
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("basic", "ChatChatterTagInfo");
                StringBuilder sb = new StringBuilder();
                if (!this.tags.isEmpty()) {
                    sb.append(", tags=");
                    sb.append(this.tags);
                }
                StringBuilder replace = sb.replace(0, 2, "ChatChatterTagInfo{");
                replace.append('}');
                return replace.toString();
            }

            public ChatChatterTagInfo(List<TagInfo> list) {
                this(list, ByteString.EMPTY);
            }

            public ChatChatterTagInfo(List<TagInfo> list, ByteString byteString) {
                super(ADAPTER, byteString);
                this.tags = Internal.immutableCopyOf("tags", list);
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chatter$ChatExtra$b */
        private static final class C14816b extends ProtoAdapter<ChatExtra> {
            C14816b() {
                super(FieldEncoding.LENGTH_DELIMITED, ChatExtra.class);
            }

            /* renamed from: a */
            public int encodedSize(ChatExtra chatExtra) {
                int i;
                int i2;
                int i3;
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, chatExtra.chat_id);
                int i4 = 0;
                if (chatExtra.nick_name != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, chatExtra.nick_name);
                } else {
                    i = 0;
                }
                int i5 = encodedSizeWithTag + i;
                if (chatExtra.oncall_role != null) {
                    i2 = OncallRole.ADAPTER.encodedSizeWithTag(3, chatExtra.oncall_role);
                } else {
                    i2 = 0;
                }
                int i6 = i5 + i2;
                if (chatExtra.nick_name_pinyin != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, chatExtra.nick_name_pinyin);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (chatExtra.tag_infos != null) {
                    i4 = ChatChatterTagInfo.ADAPTER.encodedSizeWithTag(5, chatExtra.tag_infos);
                }
                return i7 + i4 + chatExtra.unknownFields().size();
            }

            /* renamed from: a */
            public ChatExtra decode(ProtoReader protoReader) throws IOException {
                C14815a aVar = new C14815a();
                aVar.f39123a = "";
                aVar.f39124b = "";
                aVar.f39125c = OncallRole.UNKNOWN;
                aVar.f39126d = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f39123a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f39124b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        try {
                            aVar.f39125c = OncallRole.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 4) {
                        aVar.f39126d = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39127e = ChatChatterTagInfo.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ChatExtra chatExtra) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, chatExtra.chat_id);
                if (chatExtra.nick_name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, chatExtra.nick_name);
                }
                if (chatExtra.oncall_role != null) {
                    OncallRole.ADAPTER.encodeWithTag(protoWriter, 3, chatExtra.oncall_role);
                }
                if (chatExtra.nick_name_pinyin != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, chatExtra.nick_name_pinyin);
                }
                if (chatExtra.tag_infos != null) {
                    ChatChatterTagInfo.ADAPTER.encodeWithTag(protoWriter, 5, chatExtra.tag_infos);
                }
                protoWriter.writeBytes(chatExtra.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chatter$ChatExtra$a */
        public static final class C14815a extends Message.Builder<ChatExtra, C14815a> {

            /* renamed from: a */
            public String f39123a;

            /* renamed from: b */
            public String f39124b;

            /* renamed from: c */
            public OncallRole f39125c;

            /* renamed from: d */
            public String f39126d;

            /* renamed from: e */
            public ChatChatterTagInfo f39127e;

            /* renamed from: a */
            public ChatExtra build() {
                String str = this.f39123a;
                if (str != null) {
                    return new ChatExtra(str, this.f39124b, this.f39125c, this.f39126d, this.f39127e, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "chat_id");
            }
        }

        @Override // com.squareup.wire.Message
        public C14815a newBuilder() {
            C14815a aVar = new C14815a();
            aVar.f39123a = this.chat_id;
            aVar.f39124b = this.nick_name;
            aVar.f39125c = this.oncall_role;
            aVar.f39126d = this.nick_name_pinyin;
            aVar.f39127e = this.tag_infos;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "ChatExtra");
            StringBuilder sb = new StringBuilder();
            sb.append(", chat_id=");
            sb.append(this.chat_id);
            if (this.nick_name != null) {
                sb.append(", nick_name=");
                sb.append(this.nick_name);
            }
            if (this.oncall_role != null) {
                sb.append(", oncall_role=");
                sb.append(this.oncall_role);
            }
            if (this.nick_name_pinyin != null) {
                sb.append(", nick_name_pinyin=");
                sb.append(this.nick_name_pinyin);
            }
            if (this.tag_infos != null) {
                sb.append(", tag_infos=");
                sb.append(this.tag_infos);
            }
            StringBuilder replace = sb.replace(0, 2, "ChatExtra{");
            replace.append('}');
            return replace.toString();
        }

        public ChatExtra(String str, String str2, OncallRole oncallRole, String str3, ChatChatterTagInfo chatChatterTagInfo) {
            this(str, str2, oncallRole, str3, chatChatterTagInfo, ByteString.EMPTY);
        }

        public ChatExtra(String str, String str2, OncallRole oncallRole, String str3, ChatChatterTagInfo chatChatterTagInfo, ByteString byteString) {
            super(ADAPTER, byteString);
            this.chat_id = str;
            this.nick_name = str2;
            this.oncall_role = oncallRole;
            this.nick_name_pinyin = str3;
            this.tag_infos = chatChatterTagInfo;
        }
    }

    public static final class Description extends Message<Description, C14819a> {
        public static final ProtoAdapter<Description> ADAPTER = new C14820b();
        public static final Type DEFAULT_TYPE = Type.ON_DEFAULT;
        private static final long serialVersionUID = 0;
        public final String text;
        public final Type type;

        public enum Type implements WireEnum {
            ON_DEFAULT(0),
            ON_BUSINESS(1),
            ON_LEAVE(2),
            ON_MEETING(3);
            
            public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Type fromValue(int i) {
                if (i == 0) {
                    return ON_DEFAULT;
                }
                if (i == 1) {
                    return ON_BUSINESS;
                }
                if (i == 2) {
                    return ON_LEAVE;
                }
                if (i != 3) {
                    return null;
                }
                return ON_MEETING;
            }

            private Type(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chatter$Description$b */
        private static final class C14820b extends ProtoAdapter<Description> {
            C14820b() {
                super(FieldEncoding.LENGTH_DELIMITED, Description.class);
            }

            /* renamed from: a */
            public int encodedSize(Description description) {
                int i;
                int i2 = 0;
                if (description.text != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, description.text);
                } else {
                    i = 0;
                }
                if (description.type != null) {
                    i2 = Type.ADAPTER.encodedSizeWithTag(2, description.type);
                }
                return i + i2 + description.unknownFields().size();
            }

            /* renamed from: a */
            public Description decode(ProtoReader protoReader) throws IOException {
                C14819a aVar = new C14819a();
                aVar.f39133a = "";
                aVar.f39134b = Type.ON_DEFAULT;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f39133a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f39134b = Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Description description) throws IOException {
                if (description.text != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, description.text);
                }
                if (description.type != null) {
                    Type.ADAPTER.encodeWithTag(protoWriter, 2, description.type);
                }
                protoWriter.writeBytes(description.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chatter$Description$a */
        public static final class C14819a extends Message.Builder<Description, C14819a> {

            /* renamed from: a */
            public String f39133a;

            /* renamed from: b */
            public Type f39134b;

            /* renamed from: a */
            public Description build() {
                return new Description(this.f39133a, this.f39134b, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C14819a mo54404a(Type type) {
                this.f39134b = type;
                return this;
            }

            /* renamed from: a */
            public C14819a mo54405a(String str) {
                this.f39133a = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C14819a newBuilder() {
            C14819a aVar = new C14819a();
            aVar.f39133a = this.text;
            aVar.f39134b = this.type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "Description");
            StringBuilder sb = new StringBuilder();
            if (this.text != null) {
                sb.append(", text=");
                sb.append(this.text);
            }
            if (this.type != null) {
                sb.append(", type=");
                sb.append(this.type);
            }
            StringBuilder replace = sb.replace(0, 2, "Description{");
            replace.append('}');
            return replace.toString();
        }

        public Description(String str, Type type2) {
            this(str, type2, ByteString.EMPTY);
        }

        public Description(String str, Type type2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.text = str;
            this.type = type2;
        }
    }

    public enum Type implements WireEnum {
        UNKNOWN(0),
        USER(1),
        BOT(2);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return USER;
            }
            if (i != 2) {
                return null;
            }
            return BOT;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public static final class AccessInfo extends Message<AccessInfo, C14809a> {
        public static final ProtoAdapter<AccessInfo> ADAPTER = new C14810b();
        public static final Boolean DEFAULT_PHONE_CALL = true;
        public static final Boolean DEFAULT_VIDEO_CALL = true;
        public static final Boolean DEFAULT_VOICE_CALL = true;
        private static final long serialVersionUID = 0;
        public final AccessProfile access_profile;
        public final Boolean phone_call;
        public final Boolean video_call;
        public final Boolean voice_call;

        public static final class AccessProfile extends Message<AccessProfile, C14807a> {
            public static final ProtoAdapter<AccessProfile> ADAPTER = new C14808b();
            private static final long serialVersionUID = 0;
            public final AccessMessage access_message_phone_call;
            public final AccessMessage access_message_urgent;
            public final AccessMessage access_message_video_call;
            public final AccessMessage access_message_voice_call;

            public static final class AccessMessage extends Message<AccessMessage, C14805a> {
                public static final ProtoAdapter<AccessMessage> ADAPTER = new C14806b();
                public static final InaccessibleCode DEFAULT_INACCESSIBLE_CODE = InaccessibleCode.DEFAULT;
                public static final Boolean DEFAULT_IS_ACCESSIBLE = true;
                private static final long serialVersionUID = 0;
                public final InaccessibleCode inaccessible_code;
                public final Boolean is_accessible;

                public enum InaccessibleCode implements WireEnum {
                    DEFAULT(0),
                    EXECUTIVES(1);
                    
                    public static final ProtoAdapter<InaccessibleCode> ADAPTER = ProtoAdapter.newEnumAdapter(InaccessibleCode.class);
                    private final int value;

                    @Override // com.squareup.wire.WireEnum
                    public int getValue() {
                        return this.value;
                    }

                    public static InaccessibleCode fromValue(int i) {
                        if (i == 0) {
                            return DEFAULT;
                        }
                        if (i != 1) {
                            return null;
                        }
                        return EXECUTIVES;
                    }

                    private InaccessibleCode(int i) {
                        this.value = i;
                    }
                }

                /* renamed from: com.bytedance.lark.pb.basic.v1.Chatter$AccessInfo$AccessProfile$AccessMessage$b */
                private static final class C14806b extends ProtoAdapter<AccessMessage> {
                    C14806b() {
                        super(FieldEncoding.LENGTH_DELIMITED, AccessMessage.class);
                    }

                    /* renamed from: a */
                    public int encodedSize(AccessMessage accessMessage) {
                        int i;
                        int i2 = 0;
                        if (accessMessage.is_accessible != null) {
                            i = ProtoAdapter.BOOL.encodedSizeWithTag(1, accessMessage.is_accessible);
                        } else {
                            i = 0;
                        }
                        if (accessMessage.inaccessible_code != null) {
                            i2 = InaccessibleCode.ADAPTER.encodedSizeWithTag(2, accessMessage.inaccessible_code);
                        }
                        return i + i2 + accessMessage.unknownFields().size();
                    }

                    /* renamed from: a */
                    public AccessMessage decode(ProtoReader protoReader) throws IOException {
                        C14805a aVar = new C14805a();
                        aVar.f39110a = true;
                        aVar.f39111b = InaccessibleCode.DEFAULT;
                        long beginMessage = protoReader.beginMessage();
                        while (true) {
                            int nextTag = protoReader.nextTag();
                            if (nextTag == -1) {
                                protoReader.endMessage(beginMessage);
                                return aVar.build();
                            } else if (nextTag == 1) {
                                aVar.f39110a = ProtoAdapter.BOOL.decode(protoReader);
                            } else if (nextTag != 2) {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                try {
                                    aVar.f39111b = InaccessibleCode.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                }
                            }
                        }
                    }

                    /* renamed from: a */
                    public void encode(ProtoWriter protoWriter, AccessMessage accessMessage) throws IOException {
                        if (accessMessage.is_accessible != null) {
                            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, accessMessage.is_accessible);
                        }
                        if (accessMessage.inaccessible_code != null) {
                            InaccessibleCode.ADAPTER.encodeWithTag(protoWriter, 2, accessMessage.inaccessible_code);
                        }
                        protoWriter.writeBytes(accessMessage.unknownFields());
                    }
                }

                /* renamed from: com.bytedance.lark.pb.basic.v1.Chatter$AccessInfo$AccessProfile$AccessMessage$a */
                public static final class C14805a extends Message.Builder<AccessMessage, C14805a> {

                    /* renamed from: a */
                    public Boolean f39110a;

                    /* renamed from: b */
                    public InaccessibleCode f39111b;

                    /* renamed from: a */
                    public AccessMessage build() {
                        return new AccessMessage(this.f39110a, this.f39111b, super.buildUnknownFields());
                    }
                }

                @Override // com.squareup.wire.Message
                public C14805a newBuilder() {
                    C14805a aVar = new C14805a();
                    aVar.f39110a = this.is_accessible;
                    aVar.f39111b = this.inaccessible_code;
                    aVar.addUnknownFields(unknownFields());
                    return aVar;
                }

                @Override // com.squareup.wire.Message
                public String toString() {
                    C1911a.m8540a("basic", "AccessMessage");
                    StringBuilder sb = new StringBuilder();
                    if (this.is_accessible != null) {
                        sb.append(", is_accessible=");
                        sb.append(this.is_accessible);
                    }
                    if (this.inaccessible_code != null) {
                        sb.append(", inaccessible_code=");
                        sb.append(this.inaccessible_code);
                    }
                    StringBuilder replace = sb.replace(0, 2, "AccessMessage{");
                    replace.append('}');
                    return replace.toString();
                }

                public AccessMessage(Boolean bool, InaccessibleCode inaccessibleCode) {
                    this(bool, inaccessibleCode, ByteString.EMPTY);
                }

                public AccessMessage(Boolean bool, InaccessibleCode inaccessibleCode, ByteString byteString) {
                    super(ADAPTER, byteString);
                    this.is_accessible = bool;
                    this.inaccessible_code = inaccessibleCode;
                }
            }

            /* renamed from: com.bytedance.lark.pb.basic.v1.Chatter$AccessInfo$AccessProfile$b */
            private static final class C14808b extends ProtoAdapter<AccessProfile> {
                C14808b() {
                    super(FieldEncoding.LENGTH_DELIMITED, AccessProfile.class);
                }

                /* renamed from: a */
                public int encodedSize(AccessProfile accessProfile) {
                    int i;
                    int i2;
                    int i3;
                    int i4 = 0;
                    if (accessProfile.access_message_phone_call != null) {
                        i = AccessMessage.ADAPTER.encodedSizeWithTag(1, accessProfile.access_message_phone_call);
                    } else {
                        i = 0;
                    }
                    if (accessProfile.access_message_voice_call != null) {
                        i2 = AccessMessage.ADAPTER.encodedSizeWithTag(2, accessProfile.access_message_voice_call);
                    } else {
                        i2 = 0;
                    }
                    int i5 = i + i2;
                    if (accessProfile.access_message_video_call != null) {
                        i3 = AccessMessage.ADAPTER.encodedSizeWithTag(3, accessProfile.access_message_video_call);
                    } else {
                        i3 = 0;
                    }
                    int i6 = i5 + i3;
                    if (accessProfile.access_message_urgent != null) {
                        i4 = AccessMessage.ADAPTER.encodedSizeWithTag(4, accessProfile.access_message_urgent);
                    }
                    return i6 + i4 + accessProfile.unknownFields().size();
                }

                /* renamed from: a */
                public AccessProfile decode(ProtoReader protoReader) throws IOException {
                    C14807a aVar = new C14807a();
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag == -1) {
                            protoReader.endMessage(beginMessage);
                            return aVar.build();
                        } else if (nextTag == 1) {
                            aVar.f39112a = AccessMessage.ADAPTER.decode(protoReader);
                        } else if (nextTag == 2) {
                            aVar.f39113b = AccessMessage.ADAPTER.decode(protoReader);
                        } else if (nextTag == 3) {
                            aVar.f39114c = AccessMessage.ADAPTER.decode(protoReader);
                        } else if (nextTag != 4) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            aVar.f39115d = AccessMessage.ADAPTER.decode(protoReader);
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, AccessProfile accessProfile) throws IOException {
                    if (accessProfile.access_message_phone_call != null) {
                        AccessMessage.ADAPTER.encodeWithTag(protoWriter, 1, accessProfile.access_message_phone_call);
                    }
                    if (accessProfile.access_message_voice_call != null) {
                        AccessMessage.ADAPTER.encodeWithTag(protoWriter, 2, accessProfile.access_message_voice_call);
                    }
                    if (accessProfile.access_message_video_call != null) {
                        AccessMessage.ADAPTER.encodeWithTag(protoWriter, 3, accessProfile.access_message_video_call);
                    }
                    if (accessProfile.access_message_urgent != null) {
                        AccessMessage.ADAPTER.encodeWithTag(protoWriter, 4, accessProfile.access_message_urgent);
                    }
                    protoWriter.writeBytes(accessProfile.unknownFields());
                }
            }

            /* renamed from: com.bytedance.lark.pb.basic.v1.Chatter$AccessInfo$AccessProfile$a */
            public static final class C14807a extends Message.Builder<AccessProfile, C14807a> {

                /* renamed from: a */
                public AccessMessage f39112a;

                /* renamed from: b */
                public AccessMessage f39113b;

                /* renamed from: c */
                public AccessMessage f39114c;

                /* renamed from: d */
                public AccessMessage f39115d;

                /* renamed from: a */
                public AccessProfile build() {
                    return new AccessProfile(this.f39112a, this.f39113b, this.f39114c, this.f39115d, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C14807a newBuilder() {
                C14807a aVar = new C14807a();
                aVar.f39112a = this.access_message_phone_call;
                aVar.f39113b = this.access_message_voice_call;
                aVar.f39114c = this.access_message_video_call;
                aVar.f39115d = this.access_message_urgent;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("basic", "AccessProfile");
                StringBuilder sb = new StringBuilder();
                if (this.access_message_phone_call != null) {
                    sb.append(", access_message_phone_call=");
                    sb.append(this.access_message_phone_call);
                }
                if (this.access_message_voice_call != null) {
                    sb.append(", access_message_voice_call=");
                    sb.append(this.access_message_voice_call);
                }
                if (this.access_message_video_call != null) {
                    sb.append(", access_message_video_call=");
                    sb.append(this.access_message_video_call);
                }
                if (this.access_message_urgent != null) {
                    sb.append(", access_message_urgent=");
                    sb.append(this.access_message_urgent);
                }
                StringBuilder replace = sb.replace(0, 2, "AccessProfile{");
                replace.append('}');
                return replace.toString();
            }

            public AccessProfile(AccessMessage accessMessage, AccessMessage accessMessage2, AccessMessage accessMessage3, AccessMessage accessMessage4) {
                this(accessMessage, accessMessage2, accessMessage3, accessMessage4, ByteString.EMPTY);
            }

            public AccessProfile(AccessMessage accessMessage, AccessMessage accessMessage2, AccessMessage accessMessage3, AccessMessage accessMessage4, ByteString byteString) {
                super(ADAPTER, byteString);
                this.access_message_phone_call = accessMessage;
                this.access_message_voice_call = accessMessage2;
                this.access_message_video_call = accessMessage3;
                this.access_message_urgent = accessMessage4;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chatter$AccessInfo$b */
        private static final class C14810b extends ProtoAdapter<AccessInfo> {
            C14810b() {
                super(FieldEncoding.LENGTH_DELIMITED, AccessInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(AccessInfo accessInfo) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (accessInfo.phone_call != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, accessInfo.phone_call);
                } else {
                    i = 0;
                }
                if (accessInfo.voice_call != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, accessInfo.voice_call);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (accessInfo.video_call != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, accessInfo.video_call);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (accessInfo.access_profile != null) {
                    i4 = AccessProfile.ADAPTER.encodedSizeWithTag(4, accessInfo.access_profile);
                }
                return i6 + i4 + accessInfo.unknownFields().size();
            }

            /* renamed from: a */
            public AccessInfo decode(ProtoReader protoReader) throws IOException {
                C14809a aVar = new C14809a();
                aVar.f39116a = true;
                aVar.f39117b = true;
                aVar.f39118c = true;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f39116a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f39117b = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f39118c = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39119d = AccessProfile.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AccessInfo accessInfo) throws IOException {
                if (accessInfo.phone_call != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, accessInfo.phone_call);
                }
                if (accessInfo.voice_call != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, accessInfo.voice_call);
                }
                if (accessInfo.video_call != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, accessInfo.video_call);
                }
                if (accessInfo.access_profile != null) {
                    AccessProfile.ADAPTER.encodeWithTag(protoWriter, 4, accessInfo.access_profile);
                }
                protoWriter.writeBytes(accessInfo.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chatter$AccessInfo$a */
        public static final class C14809a extends Message.Builder<AccessInfo, C14809a> {

            /* renamed from: a */
            public Boolean f39116a;

            /* renamed from: b */
            public Boolean f39117b;

            /* renamed from: c */
            public Boolean f39118c;

            /* renamed from: d */
            public AccessProfile f39119d;

            /* renamed from: a */
            public AccessInfo build() {
                return new AccessInfo(this.f39116a, this.f39117b, this.f39118c, this.f39119d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14809a newBuilder() {
            C14809a aVar = new C14809a();
            aVar.f39116a = this.phone_call;
            aVar.f39117b = this.voice_call;
            aVar.f39118c = this.video_call;
            aVar.f39119d = this.access_profile;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "AccessInfo");
            StringBuilder sb = new StringBuilder();
            if (this.phone_call != null) {
                sb.append(", phone_call=");
                sb.append(this.phone_call);
            }
            if (this.voice_call != null) {
                sb.append(", voice_call=");
                sb.append(this.voice_call);
            }
            if (this.video_call != null) {
                sb.append(", video_call=");
                sb.append(this.video_call);
            }
            if (this.access_profile != null) {
                sb.append(", access_profile=");
                sb.append(this.access_profile);
            }
            StringBuilder replace = sb.replace(0, 2, "AccessInfo{");
            replace.append('}');
            return replace.toString();
        }

        public AccessInfo(Boolean bool, Boolean bool2, Boolean bool3, AccessProfile accessProfile) {
            this(bool, bool2, bool3, accessProfile, ByteString.EMPTY);
        }

        public AccessInfo(Boolean bool, Boolean bool2, Boolean bool3, AccessProfile accessProfile, ByteString byteString) {
            super(ADAPTER, byteString);
            this.phone_call = bool;
            this.voice_call = bool2;
            this.video_call = bool3;
            this.access_profile = accessProfile;
        }
    }

    public static final class ChatterCustomStatus extends Message<ChatterCustomStatus, C14817a> {
        public static final ProtoAdapter<ChatterCustomStatus> ADAPTER = new C14818b();
        public static final Boolean DEFAULT_IS_NOT_DISTURB_MODE = false;
        private static final long serialVersionUID = 0;
        public final StatusEffectiveInterval effective_interval;
        public final String fs_unit;
        public final String icon_key;
        public final Boolean is_not_disturb_mode;
        public final String title;

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chatter$ChatterCustomStatus$b */
        private static final class C14818b extends ProtoAdapter<ChatterCustomStatus> {
            C14818b() {
                super(FieldEncoding.LENGTH_DELIMITED, ChatterCustomStatus.class);
            }

            /* renamed from: a */
            public int encodedSize(ChatterCustomStatus chatterCustomStatus) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 0;
                if (chatterCustomStatus.title != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, chatterCustomStatus.title);
                } else {
                    i = 0;
                }
                if (chatterCustomStatus.icon_key != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, chatterCustomStatus.icon_key);
                } else {
                    i2 = 0;
                }
                int i6 = i + i2;
                if (chatterCustomStatus.fs_unit != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, chatterCustomStatus.fs_unit);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (chatterCustomStatus.is_not_disturb_mode != null) {
                    i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, chatterCustomStatus.is_not_disturb_mode);
                } else {
                    i4 = 0;
                }
                int i8 = i7 + i4;
                if (chatterCustomStatus.effective_interval != null) {
                    i5 = StatusEffectiveInterval.ADAPTER.encodedSizeWithTag(5, chatterCustomStatus.effective_interval);
                }
                return i8 + i5 + chatterCustomStatus.unknownFields().size();
            }

            /* renamed from: a */
            public ChatterCustomStatus decode(ProtoReader protoReader) throws IOException {
                C14817a aVar = new C14817a();
                aVar.f39128a = "";
                aVar.f39129b = "";
                aVar.f39130c = "";
                aVar.f39131d = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f39128a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f39129b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f39130c = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f39131d = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39132e = StatusEffectiveInterval.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ChatterCustomStatus chatterCustomStatus) throws IOException {
                if (chatterCustomStatus.title != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, chatterCustomStatus.title);
                }
                if (chatterCustomStatus.icon_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, chatterCustomStatus.icon_key);
                }
                if (chatterCustomStatus.fs_unit != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, chatterCustomStatus.fs_unit);
                }
                if (chatterCustomStatus.is_not_disturb_mode != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, chatterCustomStatus.is_not_disturb_mode);
                }
                if (chatterCustomStatus.effective_interval != null) {
                    StatusEffectiveInterval.ADAPTER.encodeWithTag(protoWriter, 5, chatterCustomStatus.effective_interval);
                }
                protoWriter.writeBytes(chatterCustomStatus.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chatter$ChatterCustomStatus$a */
        public static final class C14817a extends Message.Builder<ChatterCustomStatus, C14817a> {

            /* renamed from: a */
            public String f39128a;

            /* renamed from: b */
            public String f39129b;

            /* renamed from: c */
            public String f39130c;

            /* renamed from: d */
            public Boolean f39131d;

            /* renamed from: e */
            public StatusEffectiveInterval f39132e;

            /* renamed from: a */
            public ChatterCustomStatus build() {
                return new ChatterCustomStatus(this.f39128a, this.f39129b, this.f39130c, this.f39131d, this.f39132e, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C14817a mo54395a(StatusEffectiveInterval statusEffectiveInterval) {
                this.f39132e = statusEffectiveInterval;
                return this;
            }

            /* renamed from: b */
            public C14817a mo54399b(String str) {
                this.f39129b = str;
                return this;
            }

            /* renamed from: c */
            public C14817a mo54400c(String str) {
                this.f39130c = str;
                return this;
            }

            /* renamed from: a */
            public C14817a mo54396a(Boolean bool) {
                this.f39131d = bool;
                return this;
            }

            /* renamed from: a */
            public C14817a mo54397a(String str) {
                this.f39128a = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C14817a newBuilder() {
            C14817a aVar = new C14817a();
            aVar.f39128a = this.title;
            aVar.f39129b = this.icon_key;
            aVar.f39130c = this.fs_unit;
            aVar.f39131d = this.is_not_disturb_mode;
            aVar.f39132e = this.effective_interval;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "ChatterCustomStatus");
            StringBuilder sb = new StringBuilder();
            if (this.title != null) {
                sb.append(", title=");
                sb.append(this.title);
            }
            if (this.icon_key != null) {
                sb.append(", icon_key=");
                sb.append(this.icon_key);
            }
            if (this.fs_unit != null) {
                sb.append(", fs_unit=");
                sb.append(this.fs_unit);
            }
            if (this.is_not_disturb_mode != null) {
                sb.append(", is_not_disturb_mode=");
                sb.append(this.is_not_disturb_mode);
            }
            if (this.effective_interval != null) {
                sb.append(", effective_interval=");
                sb.append(this.effective_interval);
            }
            StringBuilder replace = sb.replace(0, 2, "ChatterCustomStatus{");
            replace.append('}');
            return replace.toString();
        }

        public ChatterCustomStatus(String str, String str2, String str3, Boolean bool, StatusEffectiveInterval statusEffectiveInterval) {
            this(str, str2, str3, bool, statusEffectiveInterval, ByteString.EMPTY);
        }

        public ChatterCustomStatus(String str, String str2, String str3, Boolean bool, StatusEffectiveInterval statusEffectiveInterval, ByteString byteString) {
            super(ADAPTER, byteString);
            this.title = str;
            this.icon_key = str2;
            this.fs_unit = str3;
            this.is_not_disturb_mode = bool;
            this.effective_interval = statusEffectiveInterval;
        }
    }

    public static final class TimeZone extends Message<TimeZone, C14821a> {
        public static final ProtoAdapter<TimeZone> ADAPTER = new C14822b();
        private static final long serialVersionUID = 0;
        public final String time_zone_id;

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chatter$TimeZone$b */
        private static final class C14822b extends ProtoAdapter<TimeZone> {
            C14822b() {
                super(FieldEncoding.LENGTH_DELIMITED, TimeZone.class);
            }

            /* renamed from: a */
            public int encodedSize(TimeZone timeZone) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, timeZone.time_zone_id) + timeZone.unknownFields().size();
            }

            /* renamed from: a */
            public TimeZone decode(ProtoReader protoReader) throws IOException {
                C14821a aVar = new C14821a();
                aVar.f39135a = "";
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
                        aVar.f39135a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, TimeZone timeZone) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, timeZone.time_zone_id);
                protoWriter.writeBytes(timeZone.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chatter$TimeZone$a */
        public static final class C14821a extends Message.Builder<TimeZone, C14821a> {

            /* renamed from: a */
            public String f39135a;

            /* renamed from: a */
            public TimeZone build() {
                String str = this.f39135a;
                if (str != null) {
                    return new TimeZone(str, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "time_zone_id");
            }
        }

        @Override // com.squareup.wire.Message
        public C14821a newBuilder() {
            C14821a aVar = new C14821a();
            aVar.f39135a = this.time_zone_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "TimeZone");
            StringBuilder sb = new StringBuilder();
            sb.append(", time_zone_id=");
            sb.append(this.time_zone_id);
            StringBuilder replace = sb.replace(0, 2, "TimeZone{");
            replace.append('}');
            return replace.toString();
        }

        public TimeZone(String str) {
            this(str, ByteString.EMPTY);
        }

        public TimeZone(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.time_zone_id = str;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Chatter$b */
    private static final class C14824b extends ProtoAdapter<Chatter> {
        C14824b() {
            super(FieldEncoding.LENGTH_DELIMITED, Chatter.class);
        }

        /* renamed from: a */
        public int encodedSize(Chatter chatter) {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, chatter.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, chatter.name) + Type.ADAPTER.encodedSizeWithTag(3, chatter.type);
            int i27 = 0;
            if (chatter.avatar != null) {
                i = ImageSet.ADAPTER.encodedSizeWithTag(4, chatter.avatar);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + ProtoAdapter.INT64.encodedSizeWithTag(5, chatter.update_time) + ProtoAdapter.STRING.encodedSizeWithTag(6, chatter.name_pinyin);
            if (chatter.creator_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(7, chatter.creator_id);
            } else {
                i2 = 0;
            }
            int i28 = encodedSizeWithTag2 + i2;
            if (chatter.is_resigned != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(8, chatter.is_resigned);
            } else {
                i3 = 0;
            }
            int i29 = i28 + i3;
            if (chatter.is_registered != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(9, chatter.is_registered);
            } else {
                i4 = 0;
            }
            int i30 = i29 + i4;
            if (chatter.en_us_name != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(10, chatter.en_us_name);
            } else {
                i5 = 0;
            }
            int i31 = i30 + i5;
            if (chatter.description != null) {
                i6 = Description.ADAPTER.encodedSizeWithTag(11, chatter.description);
            } else {
                i6 = 0;
            }
            int i32 = i31 + i6;
            if (chatter.avatar_key != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(12, chatter.avatar_key);
            } else {
                i7 = 0;
            }
            int i33 = i32 + i7;
            if (chatter.tenant_id != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(13, chatter.tenant_id);
            } else {
                i8 = 0;
            }
            int i34 = i33 + i8;
            if (chatter.localized_name != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(14, chatter.localized_name);
            } else {
                i9 = 0;
            }
            int i35 = i34 + i9;
            if (chatter.alias != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(15, chatter.alias);
            } else {
                i10 = 0;
            }
            int i36 = i35 + i10;
            if (chatter.work_status != null) {
                i11 = WorkStatus.ADAPTER.encodedSizeWithTag(16, chatter.work_status);
            } else {
                i11 = 0;
            }
            int i37 = i36 + i11;
            if (chatter.profile_enabled != null) {
                i12 = ProtoAdapter.BOOL.encodedSizeWithTag(17, chatter.profile_enabled);
            } else {
                i12 = 0;
            }
            int i38 = i37 + i12;
            if (chatter.account_id != null) {
                i13 = ProtoAdapter.STRING.encodedSizeWithTag(18, chatter.account_id);
            } else {
                i13 = 0;
            }
            int i39 = i38 + i13;
            if (chatter.access_info != null) {
                i14 = AccessInfo.ADAPTER.encodedSizeWithTag(19, chatter.access_info);
            } else {
                i14 = 0;
            }
            int i40 = i39 + i14;
            if (chatter.open_app_id != null) {
                i15 = ProtoAdapter.STRING.encodedSizeWithTag(20, chatter.open_app_id);
            } else {
                i15 = 0;
            }
            int i41 = i40 + i15;
            if (chatter.avatar_path != null) {
                i16 = ProtoAdapter.STRING.encodedSizeWithTag(21, chatter.avatar_path);
            } else {
                i16 = 0;
            }
            int i42 = i41 + i16;
            if (chatter.email != null) {
                i17 = ProtoAdapter.STRING.encodedSizeWithTag(22, chatter.email);
            } else {
                i17 = 0;
            }
            int i43 = i42 + i17;
            if (chatter.do_not_disturb_end_time != null) {
                i18 = ProtoAdapter.INT64.encodedSizeWithTag(23, chatter.do_not_disturb_end_time);
            } else {
                i18 = 0;
            }
            int encodedSizeWithTag3 = i43 + i18 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(24, chatter.avatar_urls);
            if (chatter.time_zone != null) {
                i19 = TimeZone.ADAPTER.encodedSizeWithTag(25, chatter.time_zone);
            } else {
                i19 = 0;
            }
            int i44 = encodedSizeWithTag3 + i19;
            if (chatter.is_frozen != null) {
                i20 = ProtoAdapter.BOOL.encodedSizeWithTag(26, chatter.is_frozen);
            } else {
                i20 = 0;
            }
            int i45 = i44 + i20;
            if (chatter.is_anonymous != null) {
                i21 = ProtoAdapter.BOOL.encodedSizeWithTag(27, chatter.is_anonymous);
            } else {
                i21 = 0;
            }
            int i46 = i45 + i21;
            if (chatter.avatar_medal != null) {
                i22 = AvatarMedal.ADAPTER.encodedSizeWithTag(28, chatter.avatar_medal);
            } else {
                i22 = 0;
            }
            int i47 = i46 + i22;
            if (chatter.with_bot_tag != null) {
                i23 = ProtoAdapter.STRING.encodedSizeWithTag(100, chatter.with_bot_tag);
            } else {
                i23 = 0;
            }
            int i48 = i47 + i23;
            if (chatter.in_contacts != null) {
                i24 = ProtoAdapter.BOOL.encodedSizeWithTag(101, chatter.in_contacts);
            } else {
                i24 = 0;
            }
            int i49 = i48 + i24;
            if (chatter.can_join_group != null) {
                i25 = ProtoAdapter.BOOL.encodedSizeWithTag(102, chatter.can_join_group);
            } else {
                i25 = 0;
            }
            int encodedSizeWithTag4 = i49 + i25 + ChatterCustomStatus.ADAPTER.asRepeated().encodedSizeWithTag(150, chatter.status);
            if (chatter.chat_extra != null) {
                i26 = ChatExtra.ADAPTER.encodedSizeWithTag(1000, chatter.chat_extra);
            } else {
                i26 = 0;
            }
            int i50 = encodedSizeWithTag4 + i26;
            if (chatter.accept_sms_phone_urgent != null) {
                i27 = ProtoAdapter.BOOL.encodedSizeWithTag(CommonCode.StatusCode.API_CLIENT_EXPIRED, chatter.accept_sms_phone_urgent);
            }
            return i50 + i27 + Tag.ADAPTER.asRepeated().encodedSizeWithTag(LocationRequest.PRIORITY_HD_ACCURACY, chatter.tags) + chatter.unknownFields().size();
        }

        /* renamed from: a */
        public Chatter decode(ProtoReader protoReader) throws IOException {
            C14823a aVar = new C14823a();
            aVar.f39145a = "";
            aVar.f39146b = "";
            aVar.f39147c = Type.UNKNOWN;
            aVar.f39149e = 0L;
            aVar.f39150f = "";
            aVar.f39151g = "";
            aVar.f39152h = false;
            aVar.f39153i = true;
            aVar.f39154j = "";
            aVar.f39156l = "";
            aVar.f39157m = "";
            aVar.f39158n = "";
            aVar.f39159o = "";
            aVar.f39161q = true;
            aVar.f39162r = "";
            aVar.f39164t = "";
            aVar.f39165u = "";
            aVar.f39166v = "";
            aVar.f39167w = 0L;
            aVar.f39170z = false;
            aVar.f39136A = false;
            aVar.f39138C = "bot";
            aVar.f39139D = true;
            aVar.f39140E = true;
            aVar.f39143H = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 150) {
                    aVar.f39141F.add(ChatterCustomStatus.ADAPTER.decode(protoReader));
                } else if (nextTag == 200) {
                    try {
                        aVar.f39144I.add(Tag.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 1000) {
                    aVar.f39142G = ChatExtra.ADAPTER.decode(protoReader);
                } else if (nextTag != 1001) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39145a = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 2:
                            aVar.f39146b = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 3:
                            try {
                                aVar.f39147c = Type.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 4:
                            aVar.f39148d = ImageSet.ADAPTER.decode(protoReader);
                            continue;
                        case 5:
                            aVar.f39149e = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 6:
                            aVar.f39150f = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 7:
                            aVar.f39151g = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 8:
                            aVar.f39152h = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 9:
                            aVar.f39153i = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 10:
                            aVar.f39154j = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 11:
                            aVar.f39155k = Description.ADAPTER.decode(protoReader);
                            continue;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f39156l = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 13:
                            aVar.f39157m = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 14:
                            aVar.f39158n = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 15:
                            aVar.f39159o = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 16:
                            aVar.f39160p = WorkStatus.ADAPTER.decode(protoReader);
                            continue;
                        case 17:
                            aVar.f39161q = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 18:
                            aVar.f39162r = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 19:
                            aVar.f39163s = AccessInfo.ADAPTER.decode(protoReader);
                            continue;
                        case 20:
                            aVar.f39164t = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 21:
                            aVar.f39165u = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 22:
                            aVar.f39166v = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 23:
                            aVar.f39167w = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 24:
                            aVar.f39168x.add(ProtoAdapter.STRING.decode(protoReader));
                            continue;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                            aVar.f39169y = TimeZone.ADAPTER.decode(protoReader);
                            continue;
                        case 26:
                            aVar.f39170z = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                            aVar.f39136A = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                            aVar.f39137B = AvatarMedal.ADAPTER.decode(protoReader);
                            continue;
                        default:
                            switch (nextTag) {
                                case 100:
                                    aVar.f39138C = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 101:
                                    aVar.f39139D = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 102:
                                    aVar.f39140E = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                default:
                                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    continue;
                                    continue;
                            }
                    }
                } else {
                    aVar.f39143H = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Chatter chatter) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, chatter.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, chatter.name);
            Type.ADAPTER.encodeWithTag(protoWriter, 3, chatter.type);
            if (chatter.avatar != null) {
                ImageSet.ADAPTER.encodeWithTag(protoWriter, 4, chatter.avatar);
            }
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, chatter.update_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, chatter.name_pinyin);
            if (chatter.creator_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, chatter.creator_id);
            }
            if (chatter.is_resigned != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, chatter.is_resigned);
            }
            if (chatter.is_registered != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, chatter.is_registered);
            }
            if (chatter.en_us_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, chatter.en_us_name);
            }
            if (chatter.description != null) {
                Description.ADAPTER.encodeWithTag(protoWriter, 11, chatter.description);
            }
            if (chatter.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, chatter.avatar_key);
            }
            if (chatter.tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, chatter.tenant_id);
            }
            if (chatter.localized_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, chatter.localized_name);
            }
            if (chatter.alias != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, chatter.alias);
            }
            if (chatter.work_status != null) {
                WorkStatus.ADAPTER.encodeWithTag(protoWriter, 16, chatter.work_status);
            }
            if (chatter.profile_enabled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 17, chatter.profile_enabled);
            }
            if (chatter.account_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 18, chatter.account_id);
            }
            if (chatter.access_info != null) {
                AccessInfo.ADAPTER.encodeWithTag(protoWriter, 19, chatter.access_info);
            }
            if (chatter.open_app_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 20, chatter.open_app_id);
            }
            if (chatter.avatar_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 21, chatter.avatar_path);
            }
            if (chatter.email != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 22, chatter.email);
            }
            if (chatter.do_not_disturb_end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 23, chatter.do_not_disturb_end_time);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 24, chatter.avatar_urls);
            if (chatter.time_zone != null) {
                TimeZone.ADAPTER.encodeWithTag(protoWriter, 25, chatter.time_zone);
            }
            if (chatter.is_frozen != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 26, chatter.is_frozen);
            }
            if (chatter.is_anonymous != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 27, chatter.is_anonymous);
            }
            if (chatter.avatar_medal != null) {
                AvatarMedal.ADAPTER.encodeWithTag(protoWriter, 28, chatter.avatar_medal);
            }
            if (chatter.with_bot_tag != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 100, chatter.with_bot_tag);
            }
            if (chatter.in_contacts != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 101, chatter.in_contacts);
            }
            if (chatter.can_join_group != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 102, chatter.can_join_group);
            }
            ChatterCustomStatus.ADAPTER.asRepeated().encodeWithTag(protoWriter, 150, chatter.status);
            if (chatter.chat_extra != null) {
                ChatExtra.ADAPTER.encodeWithTag(protoWriter, 1000, chatter.chat_extra);
            }
            if (chatter.accept_sms_phone_urgent != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, CommonCode.StatusCode.API_CLIENT_EXPIRED, chatter.accept_sms_phone_urgent);
            }
            Tag.ADAPTER.asRepeated().encodeWithTag(protoWriter, LocationRequest.PRIORITY_HD_ACCURACY, chatter.tags);
            protoWriter.writeBytes(chatter.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Chatter$a */
    public static final class C14823a extends Message.Builder<Chatter, C14823a> {

        /* renamed from: A */
        public Boolean f39136A;

        /* renamed from: B */
        public AvatarMedal f39137B;

        /* renamed from: C */
        public String f39138C;

        /* renamed from: D */
        public Boolean f39139D;

        /* renamed from: E */
        public Boolean f39140E;

        /* renamed from: F */
        public List<ChatterCustomStatus> f39141F = Internal.newMutableList();

        /* renamed from: G */
        public ChatExtra f39142G;

        /* renamed from: H */
        public Boolean f39143H;

        /* renamed from: I */
        public List<Tag> f39144I = Internal.newMutableList();

        /* renamed from: a */
        public String f39145a;

        /* renamed from: b */
        public String f39146b;

        /* renamed from: c */
        public Type f39147c;

        /* renamed from: d */
        public ImageSet f39148d;

        /* renamed from: e */
        public Long f39149e;

        /* renamed from: f */
        public String f39150f;

        /* renamed from: g */
        public String f39151g;

        /* renamed from: h */
        public Boolean f39152h;

        /* renamed from: i */
        public Boolean f39153i;

        /* renamed from: j */
        public String f39154j;

        /* renamed from: k */
        public Description f39155k;

        /* renamed from: l */
        public String f39156l;

        /* renamed from: m */
        public String f39157m;

        /* renamed from: n */
        public String f39158n;

        /* renamed from: o */
        public String f39159o;

        /* renamed from: p */
        public WorkStatus f39160p;

        /* renamed from: q */
        public Boolean f39161q;

        /* renamed from: r */
        public String f39162r;

        /* renamed from: s */
        public AccessInfo f39163s;

        /* renamed from: t */
        public String f39164t;

        /* renamed from: u */
        public String f39165u;

        /* renamed from: v */
        public String f39166v;

        /* renamed from: w */
        public Long f39167w;

        /* renamed from: x */
        public List<String> f39168x = Internal.newMutableList();

        /* renamed from: y */
        public TimeZone f39169y;

        /* renamed from: z */
        public Boolean f39170z;

        /* renamed from: a */
        public Chatter build() {
            String str;
            Type type;
            Long l;
            String str2;
            String str3 = this.f39145a;
            if (str3 != null && (str = this.f39146b) != null && (type = this.f39147c) != null && (l = this.f39149e) != null && (str2 = this.f39150f) != null) {
                return new Chatter(str3, str, type, this.f39148d, l, str2, this.f39151g, this.f39152h, this.f39153i, this.f39154j, this.f39155k, this.f39156l, this.f39157m, this.f39158n, this.f39159o, this.f39160p, this.f39161q, this.f39162r, this.f39163s, this.f39164t, this.f39165u, this.f39166v, this.f39167w, this.f39168x, this.f39169y, this.f39170z, this.f39136A, this.f39137B, this.f39138C, this.f39139D, this.f39140E, this.f39141F, this.f39142G, this.f39143H, this.f39144I, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str3, "id", this.f39146b, "name", this.f39147c, ShareHitPoint.f121869d, this.f39149e, "update_time", this.f39150f, "name_pinyin");
        }

        /* renamed from: a */
        public C14823a mo54414a(Type type) {
            this.f39147c = type;
            return this;
        }

        /* renamed from: b */
        public C14823a mo54418b(String str) {
            this.f39146b = str;
            return this;
        }

        /* renamed from: c */
        public C14823a mo54419c(String str) {
            this.f39150f = str;
            return this;
        }

        /* renamed from: d */
        public C14823a mo54420d(String str) {
            this.f39158n = str;
            return this;
        }

        /* renamed from: a */
        public C14823a mo54415a(Long l) {
            this.f39149e = l;
            return this;
        }

        /* renamed from: a */
        public C14823a mo54416a(String str) {
            this.f39145a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C14823a newBuilder() {
        C14823a aVar = new C14823a();
        aVar.f39145a = this.id;
        aVar.f39146b = this.name;
        aVar.f39147c = this.type;
        aVar.f39148d = this.avatar;
        aVar.f39149e = this.update_time;
        aVar.f39150f = this.name_pinyin;
        aVar.f39151g = this.creator_id;
        aVar.f39152h = this.is_resigned;
        aVar.f39153i = this.is_registered;
        aVar.f39154j = this.en_us_name;
        aVar.f39155k = this.description;
        aVar.f39156l = this.avatar_key;
        aVar.f39157m = this.tenant_id;
        aVar.f39158n = this.localized_name;
        aVar.f39159o = this.alias;
        aVar.f39160p = this.work_status;
        aVar.f39161q = this.profile_enabled;
        aVar.f39162r = this.account_id;
        aVar.f39163s = this.access_info;
        aVar.f39164t = this.open_app_id;
        aVar.f39165u = this.avatar_path;
        aVar.f39166v = this.email;
        aVar.f39167w = this.do_not_disturb_end_time;
        aVar.f39168x = Internal.copyOf("avatar_urls", this.avatar_urls);
        aVar.f39169y = this.time_zone;
        aVar.f39170z = this.is_frozen;
        aVar.f39136A = this.is_anonymous;
        aVar.f39137B = this.avatar_medal;
        aVar.f39138C = this.with_bot_tag;
        aVar.f39139D = this.in_contacts;
        aVar.f39140E = this.can_join_group;
        aVar.f39141F = Internal.copyOf(UpdateKey.STATUS, this.status);
        aVar.f39142G = this.chat_extra;
        aVar.f39143H = this.accept_sms_phone_urgent;
        aVar.f39144I = Internal.copyOf("tags", this.tags);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Chatter");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", type=");
        sb.append(this.type);
        if (this.avatar != null) {
            sb.append(", avatar=");
            sb.append(this.avatar);
        }
        sb.append(", update_time=");
        sb.append(this.update_time);
        sb.append(", name_pinyin=");
        sb.append(this.name_pinyin);
        if (this.creator_id != null) {
            sb.append(", creator_id=");
            sb.append(this.creator_id);
        }
        if (this.is_resigned != null) {
            sb.append(", is_resigned=");
            sb.append(this.is_resigned);
        }
        if (this.is_registered != null) {
            sb.append(", is_registered=");
            sb.append(this.is_registered);
        }
        if (this.en_us_name != null) {
            sb.append(", en_us_name=");
            sb.append(this.en_us_name);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.tenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.tenant_id);
        }
        if (this.localized_name != null) {
            sb.append(", localized_name=");
            sb.append(this.localized_name);
        }
        if (this.alias != null) {
            sb.append(", alias=");
            sb.append(this.alias);
        }
        if (this.work_status != null) {
            sb.append(", work_status=");
            sb.append(this.work_status);
        }
        if (this.profile_enabled != null) {
            sb.append(", profile_enabled=");
            sb.append(this.profile_enabled);
        }
        if (this.account_id != null) {
            sb.append(", account_id=");
            sb.append(this.account_id);
        }
        if (this.access_info != null) {
            sb.append(", access_info=");
            sb.append(this.access_info);
        }
        if (this.open_app_id != null) {
            sb.append(", open_app_id=");
            sb.append(this.open_app_id);
        }
        if (this.avatar_path != null) {
            sb.append(", avatar_path=");
            sb.append(this.avatar_path);
        }
        if (this.email != null) {
            sb.append(", email=");
            sb.append(this.email);
        }
        if (this.do_not_disturb_end_time != null) {
            sb.append(", do_not_disturb_end_time=");
            sb.append(this.do_not_disturb_end_time);
        }
        if (!this.avatar_urls.isEmpty()) {
            sb.append(", avatar_urls=");
            sb.append(this.avatar_urls);
        }
        if (this.time_zone != null) {
            sb.append(", time_zone=");
            sb.append(this.time_zone);
        }
        if (this.is_frozen != null) {
            sb.append(", is_frozen=");
            sb.append(this.is_frozen);
        }
        if (this.is_anonymous != null) {
            sb.append(", is_anonymous=");
            sb.append(this.is_anonymous);
        }
        if (this.avatar_medal != null) {
            sb.append(", avatar_medal=");
            sb.append(this.avatar_medal);
        }
        if (this.with_bot_tag != null) {
            sb.append(", with_bot_tag=");
            sb.append(this.with_bot_tag);
        }
        if (this.in_contacts != null) {
            sb.append(", in_contacts=");
            sb.append(this.in_contacts);
        }
        if (this.can_join_group != null) {
            sb.append(", can_join_group=");
            sb.append(this.can_join_group);
        }
        if (!this.status.isEmpty()) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.chat_extra != null) {
            sb.append(", chat_extra=");
            sb.append(this.chat_extra);
        }
        if (this.accept_sms_phone_urgent != null) {
            sb.append(", accept_sms_phone_urgent=");
            sb.append(this.accept_sms_phone_urgent);
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        StringBuilder replace = sb.replace(0, 2, "Chatter{");
        replace.append('}');
        return replace.toString();
    }

    public Chatter(String str, String str2, Type type2, ImageSet imageSet, Long l, String str3, String str4, Boolean bool, Boolean bool2, String str5, Description description2, String str6, String str7, String str8, String str9, WorkStatus workStatus, Boolean bool3, String str10, AccessInfo accessInfo, String str11, String str12, String str13, Long l2, List<String> list, TimeZone timeZone, Boolean bool4, Boolean bool5, AvatarMedal avatarMedal, String str14, Boolean bool6, Boolean bool7, List<ChatterCustomStatus> list2, ChatExtra chatExtra, Boolean bool8, List<Tag> list3) {
        this(str, str2, type2, imageSet, l, str3, str4, bool, bool2, str5, description2, str6, str7, str8, str9, workStatus, bool3, str10, accessInfo, str11, str12, str13, l2, list, timeZone, bool4, bool5, avatarMedal, str14, bool6, bool7, list2, chatExtra, bool8, list3, ByteString.EMPTY);
    }

    public Chatter(String str, String str2, Type type2, ImageSet imageSet, Long l, String str3, String str4, Boolean bool, Boolean bool2, String str5, Description description2, String str6, String str7, String str8, String str9, WorkStatus workStatus, Boolean bool3, String str10, AccessInfo accessInfo, String str11, String str12, String str13, Long l2, List<String> list, TimeZone timeZone, Boolean bool4, Boolean bool5, AvatarMedal avatarMedal, String str14, Boolean bool6, Boolean bool7, List<ChatterCustomStatus> list2, ChatExtra chatExtra, Boolean bool8, List<Tag> list3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.name = str2;
        this.type = type2;
        this.avatar = imageSet;
        this.update_time = l;
        this.name_pinyin = str3;
        this.creator_id = str4;
        this.is_resigned = bool;
        this.is_registered = bool2;
        this.en_us_name = str5;
        this.description = description2;
        this.avatar_key = str6;
        this.tenant_id = str7;
        this.localized_name = str8;
        this.alias = str9;
        this.work_status = workStatus;
        this.profile_enabled = bool3;
        this.account_id = str10;
        this.access_info = accessInfo;
        this.open_app_id = str11;
        this.avatar_path = str12;
        this.email = str13;
        this.do_not_disturb_end_time = l2;
        this.avatar_urls = Internal.immutableCopyOf("avatar_urls", list);
        this.time_zone = timeZone;
        this.is_frozen = bool4;
        this.is_anonymous = bool5;
        this.avatar_medal = avatarMedal;
        this.with_bot_tag = str14;
        this.in_contacts = bool6;
        this.can_join_group = bool7;
        this.status = Internal.immutableCopyOf(UpdateKey.STATUS, list2);
        this.chat_extra = chatExtra;
        this.accept_sms_phone_urgent = bool8;
        this.tags = Internal.immutableCopyOf("tags", list3);
    }
}
