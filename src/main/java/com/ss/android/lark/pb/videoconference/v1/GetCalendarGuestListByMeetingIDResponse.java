package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
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

public final class GetCalendarGuestListByMeetingIDResponse extends Message<GetCalendarGuestListByMeetingIDResponse, C50625a> {
    public static final ProtoAdapter<GetCalendarGuestListByMeetingIDResponse> ADAPTER = new C50626b();
    public static final Status DEFAULT_STATUS = Status.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final List<Result> result_list;
    public final Status status;

    public enum Status implements WireEnum {
        UNKNOWN(0),
        SUCCESS(1),
        NOT_IN_CALENDAR(2),
        NO_PERMISSION(3);
        
        public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return SUCCESS;
            }
            if (i == 2) {
                return NOT_IN_CALENDAR;
            }
            if (i != 3) {
                return null;
            }
            return NO_PERMISSION;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    public static final class RoomUserInfo extends Message<RoomUserInfo, C50623a> {
        public static final ProtoAdapter<RoomUserInfo> ADAPTER = new C50624b();
        private static final long serialVersionUID = 0;
        public final String avatar_key;
        public final String full_name;
        public final Location location;

        public static final class Location extends Message<Location, C50621a> {
            public static final ProtoAdapter<Location> ADAPTER = new C50622b();
            private static final long serialVersionUID = 0;
            public final String building_name;
            public final String floor_name;

            /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetCalendarGuestListByMeetingIDResponse$RoomUserInfo$Location$b */
            private static final class C50622b extends ProtoAdapter<Location> {
                C50622b() {
                    super(FieldEncoding.LENGTH_DELIMITED, Location.class);
                }

                /* renamed from: a */
                public int encodedSize(Location location) {
                    int i;
                    int i2 = 0;
                    if (location.floor_name != null) {
                        i = ProtoAdapter.STRING.encodedSizeWithTag(1, location.floor_name);
                    } else {
                        i = 0;
                    }
                    if (location.building_name != null) {
                        i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, location.building_name);
                    }
                    return i + i2 + location.unknownFields().size();
                }

                /* renamed from: a */
                public Location decode(ProtoReader protoReader) throws IOException {
                    C50621a aVar = new C50621a();
                    aVar.f126361a = "";
                    aVar.f126362b = "";
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag == -1) {
                            protoReader.endMessage(beginMessage);
                            return aVar.build();
                        } else if (nextTag == 1) {
                            aVar.f126361a = ProtoAdapter.STRING.decode(protoReader);
                        } else if (nextTag != 2) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            aVar.f126362b = ProtoAdapter.STRING.decode(protoReader);
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, Location location) throws IOException {
                    if (location.floor_name != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, location.floor_name);
                    }
                    if (location.building_name != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, location.building_name);
                    }
                    protoWriter.writeBytes(location.unknownFields());
                }
            }

            /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetCalendarGuestListByMeetingIDResponse$RoomUserInfo$Location$a */
            public static final class C50621a extends Message.Builder<Location, C50621a> {

                /* renamed from: a */
                public String f126361a;

                /* renamed from: b */
                public String f126362b;

                /* renamed from: a */
                public Location build() {
                    return new Location(this.f126361a, this.f126362b, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C50621a newBuilder() {
                C50621a aVar = new C50621a();
                aVar.f126361a = this.floor_name;
                aVar.f126362b = this.building_name;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("videoconference", "Location");
                StringBuilder sb = new StringBuilder();
                if (this.floor_name != null) {
                    sb.append(", floor_name=");
                    sb.append(this.floor_name);
                }
                if (this.building_name != null) {
                    sb.append(", building_name=");
                    sb.append(this.building_name);
                }
                StringBuilder replace = sb.replace(0, 2, "Location{");
                replace.append('}');
                return replace.toString();
            }

            public Location(String str, String str2) {
                this(str, str2, ByteString.EMPTY);
            }

            public Location(String str, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                this.floor_name = str;
                this.building_name = str2;
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetCalendarGuestListByMeetingIDResponse$RoomUserInfo$b */
        private static final class C50624b extends ProtoAdapter<RoomUserInfo> {
            C50624b() {
                super(FieldEncoding.LENGTH_DELIMITED, RoomUserInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(RoomUserInfo roomUserInfo) {
                int i;
                int i2;
                int i3 = 0;
                if (roomUserInfo.location != null) {
                    i = Location.ADAPTER.encodedSizeWithTag(2, roomUserInfo.location);
                } else {
                    i = 0;
                }
                if (roomUserInfo.full_name != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, roomUserInfo.full_name);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (roomUserInfo.avatar_key != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, roomUserInfo.avatar_key);
                }
                return i4 + i3 + roomUserInfo.unknownFields().size();
            }

            /* renamed from: a */
            public RoomUserInfo decode(ProtoReader protoReader) throws IOException {
                C50623a aVar = new C50623a();
                aVar.f126364b = "";
                aVar.f126365c = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 2) {
                        aVar.f126363a = Location.ADAPTER.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f126364b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126365c = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, RoomUserInfo roomUserInfo) throws IOException {
                if (roomUserInfo.location != null) {
                    Location.ADAPTER.encodeWithTag(protoWriter, 2, roomUserInfo.location);
                }
                if (roomUserInfo.full_name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, roomUserInfo.full_name);
                }
                if (roomUserInfo.avatar_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, roomUserInfo.avatar_key);
                }
                protoWriter.writeBytes(roomUserInfo.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetCalendarGuestListByMeetingIDResponse$RoomUserInfo$a */
        public static final class C50623a extends Message.Builder<RoomUserInfo, C50623a> {

            /* renamed from: a */
            public Location f126363a;

            /* renamed from: b */
            public String f126364b;

            /* renamed from: c */
            public String f126365c;

            /* renamed from: a */
            public RoomUserInfo build() {
                return new RoomUserInfo(this.f126363a, this.f126364b, this.f126365c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50623a newBuilder() {
            C50623a aVar = new C50623a();
            aVar.f126363a = this.location;
            aVar.f126364b = this.full_name;
            aVar.f126365c = this.avatar_key;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "RoomUserInfo");
            StringBuilder sb = new StringBuilder();
            if (this.location != null) {
                sb.append(", location=");
                sb.append(this.location);
            }
            if (this.full_name != null) {
                sb.append(", full_name=");
                sb.append(this.full_name);
            }
            if (this.avatar_key != null) {
                sb.append(", avatar_key=");
                sb.append(this.avatar_key);
            }
            StringBuilder replace = sb.replace(0, 2, "RoomUserInfo{");
            replace.append('}');
            return replace.toString();
        }

        public RoomUserInfo(Location location2, String str, String str2) {
            this(location2, str, str2, ByteString.EMPTY);
        }

        public RoomUserInfo(Location location2, String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.location = location2;
            this.full_name = str;
            this.avatar_key = str2;
        }
    }

    public static final class ChatInfo extends Message<ChatInfo, C50615a> {
        public static final ProtoAdapter<ChatInfo> ADAPTER = new C50616b();
        public static final Long DEFAULT_CHAT_ID = 0L;
        public static final Boolean DEFAULT_CROSS_TENANT = false;
        public static final Long DEFAULT_MEMBER_COUNT = 0L;
        private static final long serialVersionUID = 0;
        public final String avatar_key;
        public final Long chat_id;
        public final String chat_name;
        public final Boolean cross_tenant;
        public final Long member_count;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetCalendarGuestListByMeetingIDResponse$ChatInfo$b */
        private static final class C50616b extends ProtoAdapter<ChatInfo> {
            C50616b() {
                super(FieldEncoding.LENGTH_DELIMITED, ChatInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(ChatInfo chatInfo) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 0;
                if (chatInfo.chat_id != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, chatInfo.chat_id);
                } else {
                    i = 0;
                }
                if (chatInfo.chat_name != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, chatInfo.chat_name);
                } else {
                    i2 = 0;
                }
                int i6 = i + i2;
                if (chatInfo.cross_tenant != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, chatInfo.cross_tenant);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (chatInfo.member_count != null) {
                    i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, chatInfo.member_count);
                } else {
                    i4 = 0;
                }
                int i8 = i7 + i4;
                if (chatInfo.avatar_key != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, chatInfo.avatar_key);
                }
                return i8 + i5 + chatInfo.unknownFields().size();
            }

            /* renamed from: a */
            public ChatInfo decode(ProtoReader protoReader) throws IOException {
                C50615a aVar = new C50615a();
                aVar.f126348a = 0L;
                aVar.f126349b = "";
                aVar.f126350c = false;
                aVar.f126351d = 0L;
                aVar.f126352e = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126348a = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f126349b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f126350c = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f126351d = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126352e = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ChatInfo chatInfo) throws IOException {
                if (chatInfo.chat_id != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, chatInfo.chat_id);
                }
                if (chatInfo.chat_name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, chatInfo.chat_name);
                }
                if (chatInfo.cross_tenant != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, chatInfo.cross_tenant);
                }
                if (chatInfo.member_count != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, chatInfo.member_count);
                }
                if (chatInfo.avatar_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, chatInfo.avatar_key);
                }
                protoWriter.writeBytes(chatInfo.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetCalendarGuestListByMeetingIDResponse$ChatInfo$a */
        public static final class C50615a extends Message.Builder<ChatInfo, C50615a> {

            /* renamed from: a */
            public Long f126348a;

            /* renamed from: b */
            public String f126349b;

            /* renamed from: c */
            public Boolean f126350c;

            /* renamed from: d */
            public Long f126351d;

            /* renamed from: e */
            public String f126352e;

            /* renamed from: a */
            public ChatInfo build() {
                return new ChatInfo(this.f126348a, this.f126349b, this.f126350c, this.f126351d, this.f126352e, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50615a newBuilder() {
            C50615a aVar = new C50615a();
            aVar.f126348a = this.chat_id;
            aVar.f126349b = this.chat_name;
            aVar.f126350c = this.cross_tenant;
            aVar.f126351d = this.member_count;
            aVar.f126352e = this.avatar_key;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "ChatInfo");
            StringBuilder sb = new StringBuilder();
            if (this.chat_id != null) {
                sb.append(", chat_id=");
                sb.append(this.chat_id);
            }
            if (this.chat_name != null) {
                sb.append(", chat_name=");
                sb.append(this.chat_name);
            }
            if (this.cross_tenant != null) {
                sb.append(", cross_tenant=");
                sb.append(this.cross_tenant);
            }
            if (this.member_count != null) {
                sb.append(", member_count=");
                sb.append(this.member_count);
            }
            if (this.avatar_key != null) {
                sb.append(", avatar_key=");
                sb.append(this.avatar_key);
            }
            StringBuilder replace = sb.replace(0, 2, "ChatInfo{");
            replace.append('}');
            return replace.toString();
        }

        public ChatInfo(Long l, String str, Boolean bool, Long l2, String str2) {
            this(l, str, bool, l2, str2, ByteString.EMPTY);
        }

        public ChatInfo(Long l, String str, Boolean bool, Long l2, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.chat_id = l;
            this.chat_name = str;
            this.cross_tenant = bool;
            this.member_count = l2;
            this.avatar_key = str2;
        }
    }

    public static final class LarkUserInfo extends Message<LarkUserInfo, C50617a> {
        public static final ProtoAdapter<LarkUserInfo> ADAPTER = new C50618b();
        public static final Boolean DEFAULT_CROSS_TENANT = false;
        private static final long serialVersionUID = 0;
        public final String avatar_key;
        public final Boolean cross_tenant;
        public final String department;
        public final String user_name;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetCalendarGuestListByMeetingIDResponse$LarkUserInfo$b */
        private static final class C50618b extends ProtoAdapter<LarkUserInfo> {
            C50618b() {
                super(FieldEncoding.LENGTH_DELIMITED, LarkUserInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(LarkUserInfo larkUserInfo) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (larkUserInfo.department != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, larkUserInfo.department);
                } else {
                    i = 0;
                }
                if (larkUserInfo.cross_tenant != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, larkUserInfo.cross_tenant);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (larkUserInfo.user_name != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, larkUserInfo.user_name);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (larkUserInfo.avatar_key != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, larkUserInfo.avatar_key);
                }
                return i6 + i4 + larkUserInfo.unknownFields().size();
            }

            /* renamed from: a */
            public LarkUserInfo decode(ProtoReader protoReader) throws IOException {
                C50617a aVar = new C50617a();
                aVar.f126353a = "";
                aVar.f126354b = false;
                aVar.f126355c = "";
                aVar.f126356d = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126353a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f126354b = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f126355c = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126356d = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, LarkUserInfo larkUserInfo) throws IOException {
                if (larkUserInfo.department != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, larkUserInfo.department);
                }
                if (larkUserInfo.cross_tenant != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, larkUserInfo.cross_tenant);
                }
                if (larkUserInfo.user_name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, larkUserInfo.user_name);
                }
                if (larkUserInfo.avatar_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, larkUserInfo.avatar_key);
                }
                protoWriter.writeBytes(larkUserInfo.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetCalendarGuestListByMeetingIDResponse$LarkUserInfo$a */
        public static final class C50617a extends Message.Builder<LarkUserInfo, C50617a> {

            /* renamed from: a */
            public String f126353a;

            /* renamed from: b */
            public Boolean f126354b;

            /* renamed from: c */
            public String f126355c;

            /* renamed from: d */
            public String f126356d;

            /* renamed from: a */
            public LarkUserInfo build() {
                return new LarkUserInfo(this.f126353a, this.f126354b, this.f126355c, this.f126356d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50617a newBuilder() {
            C50617a aVar = new C50617a();
            aVar.f126353a = this.department;
            aVar.f126354b = this.cross_tenant;
            aVar.f126355c = this.user_name;
            aVar.f126356d = this.avatar_key;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "LarkUserInfo");
            StringBuilder sb = new StringBuilder();
            if (this.department != null) {
                sb.append(", department=");
                sb.append(this.department);
            }
            if (this.cross_tenant != null) {
                sb.append(", cross_tenant=");
                sb.append(this.cross_tenant);
            }
            if (this.user_name != null) {
                sb.append(", user_name=");
                sb.append(this.user_name);
            }
            if (this.avatar_key != null) {
                sb.append(", avatar_key=");
                sb.append(this.avatar_key);
            }
            StringBuilder replace = sb.replace(0, 2, "LarkUserInfo{");
            replace.append('}');
            return replace.toString();
        }

        public LarkUserInfo(String str, Boolean bool, String str2, String str3) {
            this(str, bool, str2, str3, ByteString.EMPTY);
        }

        public LarkUserInfo(String str, Boolean bool, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.department = str;
            this.cross_tenant = bool;
            this.user_name = str2;
            this.avatar_key = str3;
        }
    }

    public static final class Result extends Message<Result, C50619a> {
        public static final ProtoAdapter<Result> ADAPTER = new C50620b();
        private static final long serialVersionUID = 0;
        public final ChatInfo chat_info;
        public final LarkUserInfo lark_user_info;
        public final RoomUserInfo room_user_info;
        public final ByteviewUser user;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetCalendarGuestListByMeetingIDResponse$Result$b */
        private static final class C50620b extends ProtoAdapter<Result> {
            C50620b() {
                super(FieldEncoding.LENGTH_DELIMITED, Result.class);
            }

            /* renamed from: a */
            public int encodedSize(Result result) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (result.user != null) {
                    i = ByteviewUser.ADAPTER.encodedSizeWithTag(1, result.user);
                } else {
                    i = 0;
                }
                if (result.lark_user_info != null) {
                    i2 = LarkUserInfo.ADAPTER.encodedSizeWithTag(2, result.lark_user_info);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (result.room_user_info != null) {
                    i3 = RoomUserInfo.ADAPTER.encodedSizeWithTag(3, result.room_user_info);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (result.chat_info != null) {
                    i4 = ChatInfo.ADAPTER.encodedSizeWithTag(4, result.chat_info);
                }
                return i6 + i4 + result.unknownFields().size();
            }

            /* renamed from: a */
            public Result decode(ProtoReader protoReader) throws IOException {
                C50619a aVar = new C50619a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126357a = ByteviewUser.ADAPTER.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f126358b = LarkUserInfo.ADAPTER.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f126359c = RoomUserInfo.ADAPTER.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126360d = ChatInfo.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Result result) throws IOException {
                if (result.user != null) {
                    ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 1, result.user);
                }
                if (result.lark_user_info != null) {
                    LarkUserInfo.ADAPTER.encodeWithTag(protoWriter, 2, result.lark_user_info);
                }
                if (result.room_user_info != null) {
                    RoomUserInfo.ADAPTER.encodeWithTag(protoWriter, 3, result.room_user_info);
                }
                if (result.chat_info != null) {
                    ChatInfo.ADAPTER.encodeWithTag(protoWriter, 4, result.chat_info);
                }
                protoWriter.writeBytes(result.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetCalendarGuestListByMeetingIDResponse$Result$a */
        public static final class C50619a extends Message.Builder<Result, C50619a> {

            /* renamed from: a */
            public ByteviewUser f126357a;

            /* renamed from: b */
            public LarkUserInfo f126358b;

            /* renamed from: c */
            public RoomUserInfo f126359c;

            /* renamed from: d */
            public ChatInfo f126360d;

            /* renamed from: a */
            public Result build() {
                return new Result(this.f126357a, this.f126358b, this.f126359c, this.f126360d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50619a newBuilder() {
            C50619a aVar = new C50619a();
            aVar.f126357a = this.user;
            aVar.f126358b = this.lark_user_info;
            aVar.f126359c = this.room_user_info;
            aVar.f126360d = this.chat_info;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "Result");
            StringBuilder sb = new StringBuilder();
            if (this.user != null) {
                sb.append(", user=");
                sb.append(this.user);
            }
            if (this.lark_user_info != null) {
                sb.append(", lark_user_info=");
                sb.append(this.lark_user_info);
            }
            if (this.room_user_info != null) {
                sb.append(", room_user_info=");
                sb.append(this.room_user_info);
            }
            if (this.chat_info != null) {
                sb.append(", chat_info=");
                sb.append(this.chat_info);
            }
            StringBuilder replace = sb.replace(0, 2, "Result{");
            replace.append('}');
            return replace.toString();
        }

        public Result(ByteviewUser byteviewUser, LarkUserInfo larkUserInfo, RoomUserInfo roomUserInfo, ChatInfo chatInfo) {
            this(byteviewUser, larkUserInfo, roomUserInfo, chatInfo, ByteString.EMPTY);
        }

        public Result(ByteviewUser byteviewUser, LarkUserInfo larkUserInfo, RoomUserInfo roomUserInfo, ChatInfo chatInfo, ByteString byteString) {
            super(ADAPTER, byteString);
            this.user = byteviewUser;
            this.lark_user_info = larkUserInfo;
            this.room_user_info = roomUserInfo;
            this.chat_info = chatInfo;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetCalendarGuestListByMeetingIDResponse$b */
    private static final class C50626b extends ProtoAdapter<GetCalendarGuestListByMeetingIDResponse> {
        C50626b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCalendarGuestListByMeetingIDResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCalendarGuestListByMeetingIDResponse getCalendarGuestListByMeetingIDResponse) {
            int i;
            if (getCalendarGuestListByMeetingIDResponse.status != null) {
                i = Status.ADAPTER.encodedSizeWithTag(1, getCalendarGuestListByMeetingIDResponse.status);
            } else {
                i = 0;
            }
            return i + Result.ADAPTER.asRepeated().encodedSizeWithTag(2, getCalendarGuestListByMeetingIDResponse.result_list) + getCalendarGuestListByMeetingIDResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetCalendarGuestListByMeetingIDResponse decode(ProtoReader protoReader) throws IOException {
            C50625a aVar = new C50625a();
            aVar.f126366a = Status.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f126366a = Status.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126367b.add(Result.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCalendarGuestListByMeetingIDResponse getCalendarGuestListByMeetingIDResponse) throws IOException {
            if (getCalendarGuestListByMeetingIDResponse.status != null) {
                Status.ADAPTER.encodeWithTag(protoWriter, 1, getCalendarGuestListByMeetingIDResponse.status);
            }
            Result.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getCalendarGuestListByMeetingIDResponse.result_list);
            protoWriter.writeBytes(getCalendarGuestListByMeetingIDResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetCalendarGuestListByMeetingIDResponse$a */
    public static final class C50625a extends Message.Builder<GetCalendarGuestListByMeetingIDResponse, C50625a> {

        /* renamed from: a */
        public Status f126366a;

        /* renamed from: b */
        public List<Result> f126367b = Internal.newMutableList();

        /* renamed from: a */
        public GetCalendarGuestListByMeetingIDResponse build() {
            return new GetCalendarGuestListByMeetingIDResponse(this.f126366a, this.f126367b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50625a newBuilder() {
        C50625a aVar = new C50625a();
        aVar.f126366a = this.status;
        aVar.f126367b = Internal.copyOf("result_list", this.result_list);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetCalendarGuestListByMeetingIDResponse");
        StringBuilder sb = new StringBuilder();
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (!this.result_list.isEmpty()) {
            sb.append(", result_list=");
            sb.append(this.result_list);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCalendarGuestListByMeetingIDResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetCalendarGuestListByMeetingIDResponse(Status status2, List<Result> list) {
        this(status2, list, ByteString.EMPTY);
    }

    public GetCalendarGuestListByMeetingIDResponse(Status status2, List<Result> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status = status2;
        this.result_list = Internal.immutableCopyOf("result_list", list);
    }
}
