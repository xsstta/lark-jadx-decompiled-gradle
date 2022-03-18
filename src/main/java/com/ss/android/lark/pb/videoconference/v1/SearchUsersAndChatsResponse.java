package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class SearchUsersAndChatsResponse extends Message<SearchUsersAndChatsResponse, C51006a> {
    public static final ProtoAdapter<SearchUsersAndChatsResponse> ADAPTER = new C51007b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Long DEFAULT_TOTAL_COUNT = 0L;
    private static final long serialVersionUID = 0;
    public final Boolean has_more;
    public final List<UserAndCardItem> items;
    public final String search_key;
    public final Long total_count;

    public enum IDType implements WireEnum {
        USER(0),
        CHAT(1),
        ROOM(2);
        
        public static final ProtoAdapter<IDType> ADAPTER = ProtoAdapter.newEnumAdapter(IDType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static IDType fromValue(int i) {
            if (i == 0) {
                return USER;
            }
            if (i == 1) {
                return CHAT;
            }
            if (i != 2) {
                return null;
            }
            return ROOM;
        }

        private IDType(int i) {
            this.value = i;
        }
    }

    public enum UserWorkStatusType implements WireEnum {
        ON_DEFAULT(0),
        ON_BUSINESS(1),
        ON_LEAVE(2),
        ON_MEETING(3);
        
        public static final ProtoAdapter<UserWorkStatusType> ADAPTER = ProtoAdapter.newEnumAdapter(UserWorkStatusType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static UserWorkStatusType fromValue(int i) {
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

        private UserWorkStatusType(int i) {
            this.value = i;
        }
    }

    public static final class ChatInfo extends Message<ChatInfo, C50998a> {
        public static final ProtoAdapter<ChatInfo> ADAPTER = new C50999b();
        public static final Long DEFAULT_MEMBER_COUNT = 0L;
        private static final long serialVersionUID = 0;
        public final Long member_count;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.SearchUsersAndChatsResponse$ChatInfo$b */
        private static final class C50999b extends ProtoAdapter<ChatInfo> {
            C50999b() {
                super(FieldEncoding.LENGTH_DELIMITED, ChatInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(ChatInfo chatInfo) {
                int i;
                if (chatInfo.member_count != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, chatInfo.member_count);
                } else {
                    i = 0;
                }
                return i + chatInfo.unknownFields().size();
            }

            /* renamed from: a */
            public ChatInfo decode(ProtoReader protoReader) throws IOException {
                C50998a aVar = new C50998a();
                aVar.f127049a = 0L;
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
                        aVar.f127049a = ProtoAdapter.INT64.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ChatInfo chatInfo) throws IOException {
                if (chatInfo.member_count != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, chatInfo.member_count);
                }
                protoWriter.writeBytes(chatInfo.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.SearchUsersAndChatsResponse$ChatInfo$a */
        public static final class C50998a extends Message.Builder<ChatInfo, C50998a> {

            /* renamed from: a */
            public Long f127049a;

            /* renamed from: a */
            public ChatInfo build() {
                return new ChatInfo(this.f127049a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50998a newBuilder() {
            C50998a aVar = new C50998a();
            aVar.f127049a = this.member_count;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "ChatInfo");
            StringBuilder sb = new StringBuilder();
            if (this.member_count != null) {
                sb.append(", member_count=");
                sb.append(this.member_count);
            }
            StringBuilder replace = sb.replace(0, 2, "ChatInfo{");
            replace.append('}');
            return replace.toString();
        }

        public ChatInfo(Long l) {
            this(l, ByteString.EMPTY);
        }

        public ChatInfo(Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            this.member_count = l;
        }
    }

    public static final class RoomInfo extends Message<RoomInfo, C51000a> {
        public static final ProtoAdapter<RoomInfo> ADAPTER = new C51001b();
        private static final long serialVersionUID = 0;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.SearchUsersAndChatsResponse$RoomInfo$b */
        private static final class C51001b extends ProtoAdapter<RoomInfo> {
            C51001b() {
                super(FieldEncoding.LENGTH_DELIMITED, RoomInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(RoomInfo roomInfo) {
                return roomInfo.unknownFields().size();
            }

            /* renamed from: a */
            public RoomInfo decode(ProtoReader protoReader) throws IOException {
                C51000a aVar = new C51000a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, RoomInfo roomInfo) throws IOException {
                protoWriter.writeBytes(roomInfo.unknownFields());
            }
        }

        public RoomInfo() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.SearchUsersAndChatsResponse$RoomInfo$a */
        public static final class C51000a extends Message.Builder<RoomInfo, C51000a> {
            /* renamed from: a */
            public RoomInfo build() {
                return new RoomInfo(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C51000a newBuilder() {
            C51000a aVar = new C51000a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "RoomInfo");
            StringBuilder replace = new StringBuilder().replace(0, 2, "RoomInfo{");
            replace.append('}');
            return replace.toString();
        }

        public RoomInfo(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class UserAndCardItem extends Message<UserAndCardItem, C51002a> {
        public static final ProtoAdapter<UserAndCardItem> ADAPTER = new C51003b();
        public static final IDType DEFAULT_ID_TYPE = IDType.USER;
        public static final Boolean DEFAULT_IS_EXTERNAL = false;
        private static final long serialVersionUID = 0;
        public final ChatInfo chat_info;
        public final String desc;
        public final List<String> hit_terms;
        public final String id;
        public final IDType id_type;
        public final String imageKey;
        public final Boolean is_external;
        public final String name;
        public final RoomInfo room_info;
        public final List<String> subtitle_hit_terms;
        public final UserInfo user_info;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.SearchUsersAndChatsResponse$UserAndCardItem$b */
        private static final class C51003b extends ProtoAdapter<UserAndCardItem> {
            C51003b() {
                super(FieldEncoding.LENGTH_DELIMITED, UserAndCardItem.class);
            }

            /* renamed from: a */
            public int encodedSize(UserAndCardItem userAndCardItem) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9 = 0;
                if (userAndCardItem.id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, userAndCardItem.id);
                } else {
                    i = 0;
                }
                if (userAndCardItem.id_type != null) {
                    i2 = IDType.ADAPTER.encodedSizeWithTag(2, userAndCardItem.id_type);
                } else {
                    i2 = 0;
                }
                int i10 = i + i2;
                if (userAndCardItem.name != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, userAndCardItem.name);
                } else {
                    i3 = 0;
                }
                int i11 = i10 + i3;
                if (userAndCardItem.imageKey != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, userAndCardItem.imageKey);
                } else {
                    i4 = 0;
                }
                int i12 = i11 + i4;
                if (userAndCardItem.desc != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, userAndCardItem.desc);
                } else {
                    i5 = 0;
                }
                int encodedSizeWithTag = i12 + i5 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, userAndCardItem.hit_terms);
                if (userAndCardItem.is_external != null) {
                    i6 = ProtoAdapter.BOOL.encodedSizeWithTag(7, userAndCardItem.is_external);
                } else {
                    i6 = 0;
                }
                int encodedSizeWithTag2 = encodedSizeWithTag + i6 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(8, userAndCardItem.subtitle_hit_terms);
                if (userAndCardItem.user_info != null) {
                    i7 = UserInfo.ADAPTER.encodedSizeWithTag(9, userAndCardItem.user_info);
                } else {
                    i7 = 0;
                }
                int i13 = encodedSizeWithTag2 + i7;
                if (userAndCardItem.chat_info != null) {
                    i8 = ChatInfo.ADAPTER.encodedSizeWithTag(10, userAndCardItem.chat_info);
                } else {
                    i8 = 0;
                }
                int i14 = i13 + i8;
                if (userAndCardItem.room_info != null) {
                    i9 = RoomInfo.ADAPTER.encodedSizeWithTag(12, userAndCardItem.room_info);
                }
                return i14 + i9 + userAndCardItem.unknownFields().size();
            }

            /* renamed from: a */
            public UserAndCardItem decode(ProtoReader protoReader) throws IOException {
                C51002a aVar = new C51002a();
                aVar.f127050a = "";
                aVar.f127051b = IDType.USER;
                aVar.f127052c = "";
                aVar.f127053d = "";
                aVar.f127054e = "";
                aVar.f127056g = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f127050a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                try {
                                    aVar.f127051b = IDType.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 3:
                                aVar.f127052c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                aVar.f127053d = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                aVar.f127054e = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                aVar.f127055f.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 7:
                                aVar.f127056g = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 8:
                                aVar.f127057h.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 9:
                                aVar.f127058i = UserInfo.ADAPTER.decode(protoReader);
                                break;
                            case 10:
                                aVar.f127059j = ChatInfo.ADAPTER.decode(protoReader);
                                break;
                            case 11:
                            default:
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            case HwBuildEx.VersionCodes.EMUI_5_1:
                                aVar.f127060k = RoomInfo.ADAPTER.decode(protoReader);
                                break;
                        }
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, UserAndCardItem userAndCardItem) throws IOException {
                if (userAndCardItem.id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, userAndCardItem.id);
                }
                if (userAndCardItem.id_type != null) {
                    IDType.ADAPTER.encodeWithTag(protoWriter, 2, userAndCardItem.id_type);
                }
                if (userAndCardItem.name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, userAndCardItem.name);
                }
                if (userAndCardItem.imageKey != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, userAndCardItem.imageKey);
                }
                if (userAndCardItem.desc != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, userAndCardItem.desc);
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 6, userAndCardItem.hit_terms);
                if (userAndCardItem.is_external != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, userAndCardItem.is_external);
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 8, userAndCardItem.subtitle_hit_terms);
                if (userAndCardItem.user_info != null) {
                    UserInfo.ADAPTER.encodeWithTag(protoWriter, 9, userAndCardItem.user_info);
                }
                if (userAndCardItem.chat_info != null) {
                    ChatInfo.ADAPTER.encodeWithTag(protoWriter, 10, userAndCardItem.chat_info);
                }
                if (userAndCardItem.room_info != null) {
                    RoomInfo.ADAPTER.encodeWithTag(protoWriter, 12, userAndCardItem.room_info);
                }
                protoWriter.writeBytes(userAndCardItem.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.SearchUsersAndChatsResponse$UserAndCardItem$a */
        public static final class C51002a extends Message.Builder<UserAndCardItem, C51002a> {

            /* renamed from: a */
            public String f127050a;

            /* renamed from: b */
            public IDType f127051b;

            /* renamed from: c */
            public String f127052c;

            /* renamed from: d */
            public String f127053d;

            /* renamed from: e */
            public String f127054e;

            /* renamed from: f */
            public List<String> f127055f = Internal.newMutableList();

            /* renamed from: g */
            public Boolean f127056g;

            /* renamed from: h */
            public List<String> f127057h = Internal.newMutableList();

            /* renamed from: i */
            public UserInfo f127058i;

            /* renamed from: j */
            public ChatInfo f127059j;

            /* renamed from: k */
            public RoomInfo f127060k;

            /* renamed from: a */
            public UserAndCardItem build() {
                return new UserAndCardItem(this.f127050a, this.f127051b, this.f127052c, this.f127053d, this.f127054e, this.f127055f, this.f127056g, this.f127057h, this.f127058i, this.f127059j, this.f127060k, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C51002a newBuilder() {
            C51002a aVar = new C51002a();
            aVar.f127050a = this.id;
            aVar.f127051b = this.id_type;
            aVar.f127052c = this.name;
            aVar.f127053d = this.imageKey;
            aVar.f127054e = this.desc;
            aVar.f127055f = Internal.copyOf("hit_terms", this.hit_terms);
            aVar.f127056g = this.is_external;
            aVar.f127057h = Internal.copyOf("subtitle_hit_terms", this.subtitle_hit_terms);
            aVar.f127058i = this.user_info;
            aVar.f127059j = this.chat_info;
            aVar.f127060k = this.room_info;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "UserAndCardItem");
            StringBuilder sb = new StringBuilder();
            if (this.id != null) {
                sb.append(", id=");
                sb.append(this.id);
            }
            if (this.id_type != null) {
                sb.append(", id_type=");
                sb.append(this.id_type);
            }
            if (this.name != null) {
                sb.append(", name=");
                sb.append(this.name);
            }
            if (this.imageKey != null) {
                sb.append(", imageKey=");
                sb.append(this.imageKey);
            }
            if (this.desc != null) {
                sb.append(", desc=");
                sb.append(this.desc);
            }
            if (!this.hit_terms.isEmpty()) {
                sb.append(", hit_terms=");
                sb.append(this.hit_terms);
            }
            if (this.is_external != null) {
                sb.append(", is_external=");
                sb.append(this.is_external);
            }
            if (!this.subtitle_hit_terms.isEmpty()) {
                sb.append(", subtitle_hit_terms=");
                sb.append(this.subtitle_hit_terms);
            }
            if (this.user_info != null) {
                sb.append(", user_info=");
                sb.append(this.user_info);
            }
            if (this.chat_info != null) {
                sb.append(", chat_info=");
                sb.append(this.chat_info);
            }
            if (this.room_info != null) {
                sb.append(", room_info=");
                sb.append(this.room_info);
            }
            StringBuilder replace = sb.replace(0, 2, "UserAndCardItem{");
            replace.append('}');
            return replace.toString();
        }

        public UserAndCardItem(String str, IDType iDType, String str2, String str3, String str4, List<String> list, Boolean bool, List<String> list2, UserInfo userInfo, ChatInfo chatInfo, RoomInfo roomInfo) {
            this(str, iDType, str2, str3, str4, list, bool, list2, userInfo, chatInfo, roomInfo, ByteString.EMPTY);
        }

        public UserAndCardItem(String str, IDType iDType, String str2, String str3, String str4, List<String> list, Boolean bool, List<String> list2, UserInfo userInfo, ChatInfo chatInfo, RoomInfo roomInfo, ByteString byteString) {
            super(ADAPTER, byteString);
            this.id = str;
            this.id_type = iDType;
            this.name = str2;
            this.imageKey = str3;
            this.desc = str4;
            this.hit_terms = Internal.immutableCopyOf("hit_terms", list);
            this.is_external = bool;
            this.subtitle_hit_terms = Internal.immutableCopyOf("subtitle_hit_terms", list2);
            this.user_info = userInfo;
            this.chat_info = chatInfo;
            this.room_info = roomInfo;
        }
    }

    public static final class UserInfo extends Message<UserInfo, C51004a> {
        public static final ProtoAdapter<UserInfo> ADAPTER = new C51005b();
        public static final CollaborationType DEFAULT_COLLABORATION_TYPE = CollaborationType.DEFAULT;
        public static final UserWorkStatusType DEFAULT_DESCRIPTION_FLAG = UserWorkStatusType.ON_DEFAULT;
        public static final Boolean DEFAULT_HAS_PERMISSION = false;
        public static final Long DEFAULT_ZEN_MODE_END_TIME = 0L;
        private static final long serialVersionUID = 0;
        public final CollaborationType collaboration_type;
        public final List<Chatter.ChatterCustomStatus> custom_statuses;
        public final UserWorkStatusType description_flag;
        public final Boolean has_permission;
        public final Long zen_mode_end_time;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.SearchUsersAndChatsResponse$UserInfo$b */
        private static final class C51005b extends ProtoAdapter<UserInfo> {
            C51005b() {
                super(FieldEncoding.LENGTH_DELIMITED, UserInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(UserInfo userInfo) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (userInfo.description_flag != null) {
                    i = UserWorkStatusType.ADAPTER.encodedSizeWithTag(1, userInfo.description_flag);
                } else {
                    i = 0;
                }
                if (userInfo.zen_mode_end_time != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, userInfo.zen_mode_end_time);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (userInfo.has_permission != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, userInfo.has_permission);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (userInfo.collaboration_type != null) {
                    i4 = CollaborationType.ADAPTER.encodedSizeWithTag(4, userInfo.collaboration_type);
                }
                return i6 + i4 + Chatter.ChatterCustomStatus.ADAPTER.asRepeated().encodedSizeWithTag(6, userInfo.custom_statuses) + userInfo.unknownFields().size();
            }

            /* renamed from: a */
            public UserInfo decode(ProtoReader protoReader) throws IOException {
                C51004a aVar = new C51004a();
                aVar.f127061a = UserWorkStatusType.ON_DEFAULT;
                aVar.f127062b = 0L;
                aVar.f127063c = false;
                aVar.f127064d = CollaborationType.DEFAULT;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f127061a = UserWorkStatusType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 2) {
                        aVar.f127062b = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f127063c = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 4) {
                        try {
                            aVar.f127064d = CollaborationType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                        }
                    } else if (nextTag != 6) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f127065e.add(Chatter.ChatterCustomStatus.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, UserInfo userInfo) throws IOException {
                if (userInfo.description_flag != null) {
                    UserWorkStatusType.ADAPTER.encodeWithTag(protoWriter, 1, userInfo.description_flag);
                }
                if (userInfo.zen_mode_end_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, userInfo.zen_mode_end_time);
                }
                if (userInfo.has_permission != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, userInfo.has_permission);
                }
                if (userInfo.collaboration_type != null) {
                    CollaborationType.ADAPTER.encodeWithTag(protoWriter, 4, userInfo.collaboration_type);
                }
                Chatter.ChatterCustomStatus.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, userInfo.custom_statuses);
                protoWriter.writeBytes(userInfo.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.SearchUsersAndChatsResponse$UserInfo$a */
        public static final class C51004a extends Message.Builder<UserInfo, C51004a> {

            /* renamed from: a */
            public UserWorkStatusType f127061a;

            /* renamed from: b */
            public Long f127062b;

            /* renamed from: c */
            public Boolean f127063c;

            /* renamed from: d */
            public CollaborationType f127064d;

            /* renamed from: e */
            public List<Chatter.ChatterCustomStatus> f127065e = Internal.newMutableList();

            /* renamed from: a */
            public UserInfo build() {
                return new UserInfo(this.f127061a, this.f127062b, this.f127063c, this.f127064d, this.f127065e, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C51004a newBuilder() {
            C51004a aVar = new C51004a();
            aVar.f127061a = this.description_flag;
            aVar.f127062b = this.zen_mode_end_time;
            aVar.f127063c = this.has_permission;
            aVar.f127064d = this.collaboration_type;
            aVar.f127065e = Internal.copyOf("custom_statuses", this.custom_statuses);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "UserInfo");
            StringBuilder sb = new StringBuilder();
            if (this.description_flag != null) {
                sb.append(", description_flag=");
                sb.append(this.description_flag);
            }
            if (this.zen_mode_end_time != null) {
                sb.append(", zen_mode_end_time=");
                sb.append(this.zen_mode_end_time);
            }
            if (this.has_permission != null) {
                sb.append(", has_permission=");
                sb.append(this.has_permission);
            }
            if (this.collaboration_type != null) {
                sb.append(", collaboration_type=");
                sb.append(this.collaboration_type);
            }
            if (!this.custom_statuses.isEmpty()) {
                sb.append(", custom_statuses=");
                sb.append(this.custom_statuses);
            }
            StringBuilder replace = sb.replace(0, 2, "UserInfo{");
            replace.append('}');
            return replace.toString();
        }

        public UserInfo(UserWorkStatusType userWorkStatusType, Long l, Boolean bool, CollaborationType collaborationType, List<Chatter.ChatterCustomStatus> list) {
            this(userWorkStatusType, l, bool, collaborationType, list, ByteString.EMPTY);
        }

        public UserInfo(UserWorkStatusType userWorkStatusType, Long l, Boolean bool, CollaborationType collaborationType, List<Chatter.ChatterCustomStatus> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.description_flag = userWorkStatusType;
            this.zen_mode_end_time = l;
            this.has_permission = bool;
            this.collaboration_type = collaborationType;
            this.custom_statuses = Internal.immutableCopyOf("custom_statuses", list);
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SearchUsersAndChatsResponse$b */
    private static final class C51007b extends ProtoAdapter<SearchUsersAndChatsResponse> {
        C51007b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchUsersAndChatsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchUsersAndChatsResponse searchUsersAndChatsResponse) {
            int i;
            int i2;
            int encodedSizeWithTag = UserAndCardItem.ADAPTER.asRepeated().encodedSizeWithTag(1, searchUsersAndChatsResponse.items);
            int i3 = 0;
            if (searchUsersAndChatsResponse.has_more != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, searchUsersAndChatsResponse.has_more);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (searchUsersAndChatsResponse.total_count != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, searchUsersAndChatsResponse.total_count);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (searchUsersAndChatsResponse.search_key != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, searchUsersAndChatsResponse.search_key);
            }
            return i5 + i3 + searchUsersAndChatsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SearchUsersAndChatsResponse decode(ProtoReader protoReader) throws IOException {
            C51006a aVar = new C51006a();
            aVar.f127067b = false;
            aVar.f127068c = 0L;
            aVar.f127069d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127066a.add(UserAndCardItem.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f127067b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f127068c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127069d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SearchUsersAndChatsResponse searchUsersAndChatsResponse) throws IOException {
            UserAndCardItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, searchUsersAndChatsResponse.items);
            if (searchUsersAndChatsResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, searchUsersAndChatsResponse.has_more);
            }
            if (searchUsersAndChatsResponse.total_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, searchUsersAndChatsResponse.total_count);
            }
            if (searchUsersAndChatsResponse.search_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, searchUsersAndChatsResponse.search_key);
            }
            protoWriter.writeBytes(searchUsersAndChatsResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SearchUsersAndChatsResponse$a */
    public static final class C51006a extends Message.Builder<SearchUsersAndChatsResponse, C51006a> {

        /* renamed from: a */
        public List<UserAndCardItem> f127066a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f127067b;

        /* renamed from: c */
        public Long f127068c;

        /* renamed from: d */
        public String f127069d;

        /* renamed from: a */
        public SearchUsersAndChatsResponse build() {
            return new SearchUsersAndChatsResponse(this.f127066a, this.f127067b, this.f127068c, this.f127069d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51006a newBuilder() {
        C51006a aVar = new C51006a();
        aVar.f127066a = Internal.copyOf("items", this.items);
        aVar.f127067b = this.has_more;
        aVar.f127068c = this.total_count;
        aVar.f127069d = this.search_key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "SearchUsersAndChatsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.items.isEmpty()) {
            sb.append(", items=");
            sb.append(this.items);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.total_count != null) {
            sb.append(", total_count=");
            sb.append(this.total_count);
        }
        if (this.search_key != null) {
            sb.append(", search_key=");
            sb.append(this.search_key);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchUsersAndChatsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SearchUsersAndChatsResponse(List<UserAndCardItem> list, Boolean bool, Long l, String str) {
        this(list, bool, l, str, ByteString.EMPTY);
    }

    public SearchUsersAndChatsResponse(List<UserAndCardItem> list, Boolean bool, Long l, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.items = Internal.immutableCopyOf("items", list);
        this.has_more = bool;
        this.total_count = l;
        this.search_key = str;
    }
}
