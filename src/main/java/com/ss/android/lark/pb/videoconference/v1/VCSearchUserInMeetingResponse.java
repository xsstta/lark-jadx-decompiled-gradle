package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.Image;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
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

public final class VCSearchUserInMeetingResponse extends Message<VCSearchUserInMeetingResponse, C51182a> {
    public static final ProtoAdapter<VCSearchUserInMeetingResponse> ADAPTER = new C51183b();
    private static final long serialVersionUID = 0;
    public final List<SearchResult> users;

    public static final class LarkUserInfo extends Message<LarkUserInfo, C51172a> {
        public static final ProtoAdapter<LarkUserInfo> ADAPTER = new C51173b();
        public static final CollaborationType DEFAULT_COLLABORATION_TYPE = CollaborationType.DEFAULT;
        public static final Boolean DEFAULT_CROSS_TENANT = false;
        public static final Long DEFAULT_DONOT_DISTURB_BEFORE_MS = 0L;
        public static final Boolean DEFAULT_EXECUTIVE_MODE = false;
        public static final Boolean DEFAULT_IS_VOIP_BUSY = false;
        public static final Boolean DEFAULT_VERSION_SUPPORT = false;
        public static final UserWorkStatusType DEFAULT_WORK_STATUS = UserWorkStatusType.ON_DEFAULT;
        private static final long serialVersionUID = 0;
        public final CollaborationType collaboration_type;
        public final Boolean cross_tenant;
        public final List<Chatter.ChatterCustomStatus> custom_statuses;
        public final String department;
        public final Long donot_disturb_before_ms;
        public final Boolean executive_mode;
        public final Boolean is_voip_busy;
        public final Boolean version_support;
        public final UserWorkStatusType work_status;

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

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCSearchUserInMeetingResponse$LarkUserInfo$b */
        private static final class C51173b extends ProtoAdapter<LarkUserInfo> {
            C51173b() {
                super(FieldEncoding.LENGTH_DELIMITED, LarkUserInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(LarkUserInfo larkUserInfo) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8 = 0;
                if (larkUserInfo.department != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, larkUserInfo.department);
                } else {
                    i = 0;
                }
                if (larkUserInfo.work_status != null) {
                    i2 = UserWorkStatusType.ADAPTER.encodedSizeWithTag(2, larkUserInfo.work_status);
                } else {
                    i2 = 0;
                }
                int i9 = i + i2;
                if (larkUserInfo.cross_tenant != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, larkUserInfo.cross_tenant);
                } else {
                    i3 = 0;
                }
                int i10 = i9 + i3;
                if (larkUserInfo.version_support != null) {
                    i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, larkUserInfo.version_support);
                } else {
                    i4 = 0;
                }
                int i11 = i10 + i4;
                if (larkUserInfo.executive_mode != null) {
                    i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, larkUserInfo.executive_mode);
                } else {
                    i5 = 0;
                }
                int i12 = i11 + i5;
                if (larkUserInfo.donot_disturb_before_ms != null) {
                    i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, larkUserInfo.donot_disturb_before_ms);
                } else {
                    i6 = 0;
                }
                int i13 = i12 + i6;
                if (larkUserInfo.is_voip_busy != null) {
                    i7 = ProtoAdapter.BOOL.encodedSizeWithTag(7, larkUserInfo.is_voip_busy);
                } else {
                    i7 = 0;
                }
                int i14 = i13 + i7;
                if (larkUserInfo.collaboration_type != null) {
                    i8 = CollaborationType.ADAPTER.encodedSizeWithTag(8, larkUserInfo.collaboration_type);
                }
                return i14 + i8 + Chatter.ChatterCustomStatus.ADAPTER.asRepeated().encodedSizeWithTag(10, larkUserInfo.custom_statuses) + larkUserInfo.unknownFields().size();
            }

            /* renamed from: a */
            public LarkUserInfo decode(ProtoReader protoReader) throws IOException {
                C51172a aVar = new C51172a();
                aVar.f127357a = "";
                aVar.f127358b = UserWorkStatusType.ON_DEFAULT;
                aVar.f127359c = false;
                aVar.f127360d = false;
                aVar.f127361e = false;
                aVar.f127362f = 0L;
                aVar.f127363g = false;
                aVar.f127364h = CollaborationType.DEFAULT;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f127357a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                try {
                                    aVar.f127358b = UserWorkStatusType.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 3:
                                aVar.f127359c = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 4:
                                aVar.f127360d = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 5:
                                aVar.f127361e = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 6:
                                aVar.f127362f = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 7:
                                aVar.f127363g = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 8:
                                try {
                                    aVar.f127364h = CollaborationType.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                    break;
                                }
                            case 9:
                            default:
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            case 10:
                                aVar.f127365i.add(Chatter.ChatterCustomStatus.ADAPTER.decode(protoReader));
                                break;
                        }
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, LarkUserInfo larkUserInfo) throws IOException {
                if (larkUserInfo.department != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, larkUserInfo.department);
                }
                if (larkUserInfo.work_status != null) {
                    UserWorkStatusType.ADAPTER.encodeWithTag(protoWriter, 2, larkUserInfo.work_status);
                }
                if (larkUserInfo.cross_tenant != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, larkUserInfo.cross_tenant);
                }
                if (larkUserInfo.version_support != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, larkUserInfo.version_support);
                }
                if (larkUserInfo.executive_mode != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, larkUserInfo.executive_mode);
                }
                if (larkUserInfo.donot_disturb_before_ms != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, larkUserInfo.donot_disturb_before_ms);
                }
                if (larkUserInfo.is_voip_busy != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, larkUserInfo.is_voip_busy);
                }
                if (larkUserInfo.collaboration_type != null) {
                    CollaborationType.ADAPTER.encodeWithTag(protoWriter, 8, larkUserInfo.collaboration_type);
                }
                Chatter.ChatterCustomStatus.ADAPTER.asRepeated().encodeWithTag(protoWriter, 10, larkUserInfo.custom_statuses);
                protoWriter.writeBytes(larkUserInfo.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCSearchUserInMeetingResponse$LarkUserInfo$a */
        public static final class C51172a extends Message.Builder<LarkUserInfo, C51172a> {

            /* renamed from: a */
            public String f127357a;

            /* renamed from: b */
            public UserWorkStatusType f127358b;

            /* renamed from: c */
            public Boolean f127359c;

            /* renamed from: d */
            public Boolean f127360d;

            /* renamed from: e */
            public Boolean f127361e;

            /* renamed from: f */
            public Long f127362f;

            /* renamed from: g */
            public Boolean f127363g;

            /* renamed from: h */
            public CollaborationType f127364h;

            /* renamed from: i */
            public List<Chatter.ChatterCustomStatus> f127365i = Internal.newMutableList();

            /* renamed from: a */
            public LarkUserInfo build() {
                return new LarkUserInfo(this.f127357a, this.f127358b, this.f127359c, this.f127360d, this.f127361e, this.f127362f, this.f127363g, this.f127364h, this.f127365i, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C51172a newBuilder() {
            C51172a aVar = new C51172a();
            aVar.f127357a = this.department;
            aVar.f127358b = this.work_status;
            aVar.f127359c = this.cross_tenant;
            aVar.f127360d = this.version_support;
            aVar.f127361e = this.executive_mode;
            aVar.f127362f = this.donot_disturb_before_ms;
            aVar.f127363g = this.is_voip_busy;
            aVar.f127364h = this.collaboration_type;
            aVar.f127365i = Internal.copyOf("custom_statuses", this.custom_statuses);
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
            if (this.work_status != null) {
                sb.append(", work_status=");
                sb.append(this.work_status);
            }
            if (this.cross_tenant != null) {
                sb.append(", cross_tenant=");
                sb.append(this.cross_tenant);
            }
            if (this.version_support != null) {
                sb.append(", version_support=");
                sb.append(this.version_support);
            }
            if (this.executive_mode != null) {
                sb.append(", executive_mode=");
                sb.append(this.executive_mode);
            }
            if (this.donot_disturb_before_ms != null) {
                sb.append(", donot_disturb_before_ms=");
                sb.append(this.donot_disturb_before_ms);
            }
            if (this.is_voip_busy != null) {
                sb.append(", is_voip_busy=");
                sb.append(this.is_voip_busy);
            }
            if (this.collaboration_type != null) {
                sb.append(", collaboration_type=");
                sb.append(this.collaboration_type);
            }
            if (!this.custom_statuses.isEmpty()) {
                sb.append(", custom_statuses=");
                sb.append(this.custom_statuses);
            }
            StringBuilder replace = sb.replace(0, 2, "LarkUserInfo{");
            replace.append('}');
            return replace.toString();
        }

        public LarkUserInfo(String str, UserWorkStatusType userWorkStatusType, Boolean bool, Boolean bool2, Boolean bool3, Long l, Boolean bool4, CollaborationType collaborationType, List<Chatter.ChatterCustomStatus> list) {
            this(str, userWorkStatusType, bool, bool2, bool3, l, bool4, collaborationType, list, ByteString.EMPTY);
        }

        public LarkUserInfo(String str, UserWorkStatusType userWorkStatusType, Boolean bool, Boolean bool2, Boolean bool3, Long l, Boolean bool4, CollaborationType collaborationType, List<Chatter.ChatterCustomStatus> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.department = str;
            this.work_status = userWorkStatusType;
            this.cross_tenant = bool;
            this.version_support = bool2;
            this.executive_mode = bool3;
            this.donot_disturb_before_ms = l;
            this.is_voip_busy = bool4;
            this.collaboration_type = collaborationType;
            this.custom_statuses = Internal.immutableCopyOf("custom_statuses", list);
        }
    }

    public enum UserStatus implements WireEnum {
        UNKNOWN(0),
        IN_MEETING(1),
        IN_LOBBY(2),
        NOT_IN_MEETING(3);
        
        public static final ProtoAdapter<UserStatus> ADAPTER = ProtoAdapter.newEnumAdapter(UserStatus.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static UserStatus fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return IN_MEETING;
            }
            if (i == 2) {
                return IN_LOBBY;
            }
            if (i != 3) {
                return null;
            }
            return NOT_IN_MEETING;
        }

        private UserStatus(int i) {
            this.value = i;
        }
    }

    public static final class RoomInfo extends Message<RoomInfo, C51176a> {
        public static final ProtoAdapter<RoomInfo> ADAPTER = new C51177b();
        public static final Integer DEFAULT_CAPACITY = 0;
        public static final Boolean DEFAULT_IS_ROOM_BUSY = false;
        private static final long serialVersionUID = 0;
        public final Integer capacity;
        public final String full_name;
        public final String full_name_participant;
        public final String full_name_site;
        public final Boolean is_room_busy;
        public final Location location;
        public final String primary_name_participant;
        public final String primary_name_site;
        public final String secondary_name;

        public static final class Location extends Message<Location, C51174a> {
            public static final ProtoAdapter<Location> ADAPTER = new C51175b();
            private static final long serialVersionUID = 0;
            public final String building_name;
            public final String floor_name;

            /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCSearchUserInMeetingResponse$RoomInfo$Location$b */
            private static final class C51175b extends ProtoAdapter<Location> {
                C51175b() {
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
                    C51174a aVar = new C51174a();
                    aVar.f127366a = "";
                    aVar.f127367b = "";
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag == -1) {
                            protoReader.endMessage(beginMessage);
                            return aVar.build();
                        } else if (nextTag == 1) {
                            aVar.f127366a = ProtoAdapter.STRING.decode(protoReader);
                        } else if (nextTag != 2) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            aVar.f127367b = ProtoAdapter.STRING.decode(protoReader);
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

            /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCSearchUserInMeetingResponse$RoomInfo$Location$a */
            public static final class C51174a extends Message.Builder<Location, C51174a> {

                /* renamed from: a */
                public String f127366a;

                /* renamed from: b */
                public String f127367b;

                /* renamed from: a */
                public Location build() {
                    return new Location(this.f127366a, this.f127367b, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C51174a newBuilder() {
                C51174a aVar = new C51174a();
                aVar.f127366a = this.floor_name;
                aVar.f127367b = this.building_name;
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

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCSearchUserInMeetingResponse$RoomInfo$b */
        private static final class C51177b extends ProtoAdapter<RoomInfo> {
            C51177b() {
                super(FieldEncoding.LENGTH_DELIMITED, RoomInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(RoomInfo roomInfo) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, roomInfo.capacity);
                int i8 = 0;
                if (roomInfo.location != null) {
                    i = Location.ADAPTER.encodedSizeWithTag(2, roomInfo.location);
                } else {
                    i = 0;
                }
                int i9 = encodedSizeWithTag + i;
                if (roomInfo.full_name != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, roomInfo.full_name);
                } else {
                    i2 = 0;
                }
                int i10 = i9 + i2;
                if (roomInfo.full_name_participant != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, roomInfo.full_name_participant);
                } else {
                    i3 = 0;
                }
                int i11 = i10 + i3;
                if (roomInfo.full_name_site != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, roomInfo.full_name_site);
                } else {
                    i4 = 0;
                }
                int i12 = i11 + i4;
                if (roomInfo.primary_name_participant != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, roomInfo.primary_name_participant);
                } else {
                    i5 = 0;
                }
                int i13 = i12 + i5;
                if (roomInfo.primary_name_site != null) {
                    i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, roomInfo.primary_name_site);
                } else {
                    i6 = 0;
                }
                int i14 = i13 + i6;
                if (roomInfo.secondary_name != null) {
                    i7 = ProtoAdapter.STRING.encodedSizeWithTag(8, roomInfo.secondary_name);
                } else {
                    i7 = 0;
                }
                int i15 = i14 + i7;
                if (roomInfo.is_room_busy != null) {
                    i8 = ProtoAdapter.BOOL.encodedSizeWithTag(9, roomInfo.is_room_busy);
                }
                return i15 + i8 + roomInfo.unknownFields().size();
            }

            /* renamed from: a */
            public RoomInfo decode(ProtoReader protoReader) throws IOException {
                C51176a aVar = new C51176a();
                aVar.f127368a = 0;
                aVar.f127370c = "";
                aVar.f127371d = "";
                aVar.f127372e = "";
                aVar.f127373f = "";
                aVar.f127374g = "";
                aVar.f127375h = "";
                aVar.f127376i = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f127368a = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 2:
                                aVar.f127369b = Location.ADAPTER.decode(protoReader);
                                break;
                            case 3:
                                aVar.f127370c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                aVar.f127371d = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                aVar.f127372e = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                aVar.f127373f = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                aVar.f127374g = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 8:
                                aVar.f127375h = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 9:
                                aVar.f127376i = ProtoAdapter.BOOL.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, RoomInfo roomInfo) throws IOException {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, roomInfo.capacity);
                if (roomInfo.location != null) {
                    Location.ADAPTER.encodeWithTag(protoWriter, 2, roomInfo.location);
                }
                if (roomInfo.full_name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, roomInfo.full_name);
                }
                if (roomInfo.full_name_participant != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, roomInfo.full_name_participant);
                }
                if (roomInfo.full_name_site != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, roomInfo.full_name_site);
                }
                if (roomInfo.primary_name_participant != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, roomInfo.primary_name_participant);
                }
                if (roomInfo.primary_name_site != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, roomInfo.primary_name_site);
                }
                if (roomInfo.secondary_name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, roomInfo.secondary_name);
                }
                if (roomInfo.is_room_busy != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, roomInfo.is_room_busy);
                }
                protoWriter.writeBytes(roomInfo.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCSearchUserInMeetingResponse$RoomInfo$a */
        public static final class C51176a extends Message.Builder<RoomInfo, C51176a> {

            /* renamed from: a */
            public Integer f127368a;

            /* renamed from: b */
            public Location f127369b;

            /* renamed from: c */
            public String f127370c;

            /* renamed from: d */
            public String f127371d;

            /* renamed from: e */
            public String f127372e;

            /* renamed from: f */
            public String f127373f;

            /* renamed from: g */
            public String f127374g;

            /* renamed from: h */
            public String f127375h;

            /* renamed from: i */
            public Boolean f127376i;

            /* renamed from: a */
            public RoomInfo build() {
                Integer num = this.f127368a;
                if (num != null) {
                    return new RoomInfo(num, this.f127369b, this.f127370c, this.f127371d, this.f127372e, this.f127373f, this.f127374g, this.f127375h, this.f127376i, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(num, "capacity");
            }
        }

        @Override // com.squareup.wire.Message
        public C51176a newBuilder() {
            C51176a aVar = new C51176a();
            aVar.f127368a = this.capacity;
            aVar.f127369b = this.location;
            aVar.f127370c = this.full_name;
            aVar.f127371d = this.full_name_participant;
            aVar.f127372e = this.full_name_site;
            aVar.f127373f = this.primary_name_participant;
            aVar.f127374g = this.primary_name_site;
            aVar.f127375h = this.secondary_name;
            aVar.f127376i = this.is_room_busy;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "RoomInfo");
            StringBuilder sb = new StringBuilder();
            sb.append(", capacity=");
            sb.append(this.capacity);
            if (this.location != null) {
                sb.append(", location=");
                sb.append(this.location);
            }
            if (this.full_name != null) {
                sb.append(", full_name=");
                sb.append(this.full_name);
            }
            if (this.full_name_participant != null) {
                sb.append(", full_name_participant=");
                sb.append(this.full_name_participant);
            }
            if (this.full_name_site != null) {
                sb.append(", full_name_site=");
                sb.append(this.full_name_site);
            }
            if (this.primary_name_participant != null) {
                sb.append(", primary_name_participant=");
                sb.append(this.primary_name_participant);
            }
            if (this.primary_name_site != null) {
                sb.append(", primary_name_site=");
                sb.append(this.primary_name_site);
            }
            if (this.secondary_name != null) {
                sb.append(", secondary_name=");
                sb.append(this.secondary_name);
            }
            if (this.is_room_busy != null) {
                sb.append(", is_room_busy=");
                sb.append(this.is_room_busy);
            }
            StringBuilder replace = sb.replace(0, 2, "RoomInfo{");
            replace.append('}');
            return replace.toString();
        }

        public RoomInfo(Integer num, Location location2, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool) {
            this(num, location2, str, str2, str3, str4, str5, str6, bool, ByteString.EMPTY);
        }

        public RoomInfo(Integer num, Location location2, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.capacity = num;
            this.location = location2;
            this.full_name = str;
            this.full_name_participant = str2;
            this.full_name_site = str3;
            this.primary_name_participant = str4;
            this.primary_name_site = str5;
            this.secondary_name = str6;
            this.is_room_busy = bool;
        }
    }

    public static final class DisplayName extends Message<DisplayName, C51170a> {
        public static final ProtoAdapter<DisplayName> ADAPTER = new C51171b();
        private static final long serialVersionUID = 0;
        public final String primary_name;
        public final String secondary_name;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCSearchUserInMeetingResponse$DisplayName$b */
        private static final class C51171b extends ProtoAdapter<DisplayName> {
            C51171b() {
                super(FieldEncoding.LENGTH_DELIMITED, DisplayName.class);
            }

            /* renamed from: a */
            public int encodedSize(DisplayName displayName) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, displayName.primary_name) + ProtoAdapter.STRING.encodedSizeWithTag(2, displayName.secondary_name) + displayName.unknownFields().size();
            }

            /* renamed from: a */
            public DisplayName decode(ProtoReader protoReader) throws IOException {
                C51170a aVar = new C51170a();
                aVar.f127355a = "";
                aVar.f127356b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f127355a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f127356b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, DisplayName displayName) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, displayName.primary_name);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, displayName.secondary_name);
                protoWriter.writeBytes(displayName.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C51170a newBuilder() {
            C51170a aVar = new C51170a();
            aVar.f127355a = this.primary_name;
            aVar.f127356b = this.secondary_name;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCSearchUserInMeetingResponse$DisplayName$a */
        public static final class C51170a extends Message.Builder<DisplayName, C51170a> {

            /* renamed from: a */
            public String f127355a;

            /* renamed from: b */
            public String f127356b;

            /* renamed from: a */
            public DisplayName build() {
                String str;
                String str2 = this.f127355a;
                if (str2 != null && (str = this.f127356b) != null) {
                    return new DisplayName(str2, str, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str2, "primary_name", this.f127356b, "secondary_name");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "DisplayName");
            StringBuilder sb = new StringBuilder();
            sb.append(", primary_name=");
            sb.append(this.primary_name);
            sb.append(", secondary_name=");
            sb.append(this.secondary_name);
            StringBuilder replace = sb.replace(0, 2, "DisplayName{");
            replace.append('}');
            return replace.toString();
        }

        public DisplayName(String str, String str2) {
            this(str, str2, ByteString.EMPTY);
        }

        public DisplayName(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.primary_name = str;
            this.secondary_name = str2;
        }
    }

    public static final class SearchResult extends Message<SearchResult, C51178a> {
        public static final ProtoAdapter<SearchResult> ADAPTER = new C51179b();
        public static final UserStatus DEFAULT_STATUS = UserStatus.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final Image avatar_image;
        public final String avatar_key;
        public final LarkUserInfo lark_user_info;
        public final VCLobbyParticipant lobby;
        public final String name;
        public final List<String> name_hit_terms;
        public final Participant participant;
        public final RoomInfo room_info;
        public final SipInfo sip_info;
        public final UserStatus status;
        public final ByteviewUser user;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCSearchUserInMeetingResponse$SearchResult$b */
        private static final class C51179b extends ProtoAdapter<SearchResult> {
            C51179b() {
                super(FieldEncoding.LENGTH_DELIMITED, SearchResult.class);
            }

            /* renamed from: a */
            public int encodedSize(SearchResult searchResult) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int encodedSizeWithTag = ByteviewUser.ADAPTER.encodedSizeWithTag(1, searchResult.user) + UserStatus.ADAPTER.encodedSizeWithTag(2, searchResult.status);
                int i8 = 0;
                if (searchResult.name != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(3, searchResult.name);
                } else {
                    i = 0;
                }
                int encodedSizeWithTag2 = encodedSizeWithTag + i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, searchResult.name_hit_terms);
                if (searchResult.avatar_image != null) {
                    i2 = Image.ADAPTER.encodedSizeWithTag(5, searchResult.avatar_image);
                } else {
                    i2 = 0;
                }
                int i9 = encodedSizeWithTag2 + i2;
                if (searchResult.avatar_key != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(6, searchResult.avatar_key);
                } else {
                    i3 = 0;
                }
                int i10 = i9 + i3;
                if (searchResult.participant != null) {
                    i4 = Participant.ADAPTER.encodedSizeWithTag(7, searchResult.participant);
                } else {
                    i4 = 0;
                }
                int i11 = i10 + i4;
                if (searchResult.lobby != null) {
                    i5 = VCLobbyParticipant.ADAPTER.encodedSizeWithTag(8, searchResult.lobby);
                } else {
                    i5 = 0;
                }
                int i12 = i11 + i5;
                if (searchResult.lark_user_info != null) {
                    i6 = LarkUserInfo.ADAPTER.encodedSizeWithTag(9, searchResult.lark_user_info);
                } else {
                    i6 = 0;
                }
                int i13 = i12 + i6;
                if (searchResult.room_info != null) {
                    i7 = RoomInfo.ADAPTER.encodedSizeWithTag(10, searchResult.room_info);
                } else {
                    i7 = 0;
                }
                int i14 = i13 + i7;
                if (searchResult.sip_info != null) {
                    i8 = SipInfo.ADAPTER.encodedSizeWithTag(11, searchResult.sip_info);
                }
                return i14 + i8 + searchResult.unknownFields().size();
            }

            /* renamed from: a */
            public SearchResult decode(ProtoReader protoReader) throws IOException {
                C51178a aVar = new C51178a();
                aVar.f127378b = UserStatus.UNKNOWN;
                aVar.f127379c = "";
                aVar.f127382f = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f127377a = ByteviewUser.ADAPTER.decode(protoReader);
                                break;
                            case 2:
                                try {
                                    aVar.f127378b = UserStatus.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 3:
                                aVar.f127379c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                aVar.f127380d.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 5:
                                aVar.f127381e = Image.ADAPTER.decode(protoReader);
                                break;
                            case 6:
                                aVar.f127382f = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                aVar.f127383g = Participant.ADAPTER.decode(protoReader);
                                break;
                            case 8:
                                aVar.f127384h = VCLobbyParticipant.ADAPTER.decode(protoReader);
                                break;
                            case 9:
                                aVar.f127385i = LarkUserInfo.ADAPTER.decode(protoReader);
                                break;
                            case 10:
                                aVar.f127386j = RoomInfo.ADAPTER.decode(protoReader);
                                break;
                            case 11:
                                aVar.f127387k = SipInfo.ADAPTER.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, SearchResult searchResult) throws IOException {
                ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 1, searchResult.user);
                UserStatus.ADAPTER.encodeWithTag(protoWriter, 2, searchResult.status);
                if (searchResult.name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, searchResult.name);
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 4, searchResult.name_hit_terms);
                if (searchResult.avatar_image != null) {
                    Image.ADAPTER.encodeWithTag(protoWriter, 5, searchResult.avatar_image);
                }
                if (searchResult.avatar_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, searchResult.avatar_key);
                }
                if (searchResult.participant != null) {
                    Participant.ADAPTER.encodeWithTag(protoWriter, 7, searchResult.participant);
                }
                if (searchResult.lobby != null) {
                    VCLobbyParticipant.ADAPTER.encodeWithTag(protoWriter, 8, searchResult.lobby);
                }
                if (searchResult.lark_user_info != null) {
                    LarkUserInfo.ADAPTER.encodeWithTag(protoWriter, 9, searchResult.lark_user_info);
                }
                if (searchResult.room_info != null) {
                    RoomInfo.ADAPTER.encodeWithTag(protoWriter, 10, searchResult.room_info);
                }
                if (searchResult.sip_info != null) {
                    SipInfo.ADAPTER.encodeWithTag(protoWriter, 11, searchResult.sip_info);
                }
                protoWriter.writeBytes(searchResult.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCSearchUserInMeetingResponse$SearchResult$a */
        public static final class C51178a extends Message.Builder<SearchResult, C51178a> {

            /* renamed from: a */
            public ByteviewUser f127377a;

            /* renamed from: b */
            public UserStatus f127378b;

            /* renamed from: c */
            public String f127379c;

            /* renamed from: d */
            public List<String> f127380d = Internal.newMutableList();

            /* renamed from: e */
            public Image f127381e;

            /* renamed from: f */
            public String f127382f;

            /* renamed from: g */
            public Participant f127383g;

            /* renamed from: h */
            public VCLobbyParticipant f127384h;

            /* renamed from: i */
            public LarkUserInfo f127385i;

            /* renamed from: j */
            public RoomInfo f127386j;

            /* renamed from: k */
            public SipInfo f127387k;

            /* renamed from: a */
            public SearchResult build() {
                UserStatus userStatus;
                ByteviewUser byteviewUser = this.f127377a;
                if (byteviewUser != null && (userStatus = this.f127378b) != null) {
                    return new SearchResult(byteviewUser, userStatus, this.f127379c, this.f127380d, this.f127381e, this.f127382f, this.f127383g, this.f127384h, this.f127385i, this.f127386j, this.f127387k, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(byteviewUser, "user", this.f127378b, UpdateKey.STATUS);
            }
        }

        @Override // com.squareup.wire.Message
        public C51178a newBuilder() {
            C51178a aVar = new C51178a();
            aVar.f127377a = this.user;
            aVar.f127378b = this.status;
            aVar.f127379c = this.name;
            aVar.f127380d = Internal.copyOf("name_hit_terms", this.name_hit_terms);
            aVar.f127381e = this.avatar_image;
            aVar.f127382f = this.avatar_key;
            aVar.f127383g = this.participant;
            aVar.f127384h = this.lobby;
            aVar.f127385i = this.lark_user_info;
            aVar.f127386j = this.room_info;
            aVar.f127387k = this.sip_info;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "SearchResult");
            StringBuilder sb = new StringBuilder();
            sb.append(", user=");
            sb.append(this.user);
            sb.append(", status=");
            sb.append(this.status);
            if (this.name != null) {
                sb.append(", name=");
                sb.append(this.name);
            }
            if (!this.name_hit_terms.isEmpty()) {
                sb.append(", name_hit_terms=");
                sb.append(this.name_hit_terms);
            }
            if (this.avatar_image != null) {
                sb.append(", avatar_image=");
                sb.append(this.avatar_image);
            }
            if (this.avatar_key != null) {
                sb.append(", avatar_key=");
                sb.append(this.avatar_key);
            }
            if (this.participant != null) {
                sb.append(", participant=");
                sb.append(this.participant);
            }
            if (this.lobby != null) {
                sb.append(", lobby=");
                sb.append(this.lobby);
            }
            if (this.lark_user_info != null) {
                sb.append(", lark_user_info=");
                sb.append(this.lark_user_info);
            }
            if (this.room_info != null) {
                sb.append(", room_info=");
                sb.append(this.room_info);
            }
            if (this.sip_info != null) {
                sb.append(", sip_info=");
                sb.append(this.sip_info);
            }
            StringBuilder replace = sb.replace(0, 2, "SearchResult{");
            replace.append('}');
            return replace.toString();
        }

        public SearchResult(ByteviewUser byteviewUser, UserStatus userStatus, String str, List<String> list, Image image, String str2, Participant participant2, VCLobbyParticipant vCLobbyParticipant, LarkUserInfo larkUserInfo, RoomInfo roomInfo, SipInfo sipInfo) {
            this(byteviewUser, userStatus, str, list, image, str2, participant2, vCLobbyParticipant, larkUserInfo, roomInfo, sipInfo, ByteString.EMPTY);
        }

        public SearchResult(ByteviewUser byteviewUser, UserStatus userStatus, String str, List<String> list, Image image, String str2, Participant participant2, VCLobbyParticipant vCLobbyParticipant, LarkUserInfo larkUserInfo, RoomInfo roomInfo, SipInfo sipInfo, ByteString byteString) {
            super(ADAPTER, byteString);
            this.user = byteviewUser;
            this.status = userStatus;
            this.name = str;
            this.name_hit_terms = Internal.immutableCopyOf("name_hit_terms", list);
            this.avatar_image = image;
            this.avatar_key = str2;
            this.participant = participant2;
            this.lobby = vCLobbyParticipant;
            this.lark_user_info = larkUserInfo;
            this.room_info = roomInfo;
            this.sip_info = sipInfo;
        }
    }

    public static final class SipInfo extends Message<SipInfo, C51180a> {
        public static final ProtoAdapter<SipInfo> ADAPTER = new C51181b();
        private static final long serialVersionUID = 0;
        public final String address;
        public final DisplayName display_name_for_mobile;
        public final DisplayName display_name_for_pc;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCSearchUserInMeetingResponse$SipInfo$b */
        private static final class C51181b extends ProtoAdapter<SipInfo> {
            C51181b() {
                super(FieldEncoding.LENGTH_DELIMITED, SipInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(SipInfo sipInfo) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, sipInfo.address);
                int i2 = 0;
                if (sipInfo.display_name_for_pc != null) {
                    i = DisplayName.ADAPTER.encodedSizeWithTag(2, sipInfo.display_name_for_pc);
                } else {
                    i = 0;
                }
                int i3 = encodedSizeWithTag + i;
                if (sipInfo.display_name_for_mobile != null) {
                    i2 = DisplayName.ADAPTER.encodedSizeWithTag(3, sipInfo.display_name_for_mobile);
                }
                return i3 + i2 + sipInfo.unknownFields().size();
            }

            /* renamed from: a */
            public SipInfo decode(ProtoReader protoReader) throws IOException {
                C51180a aVar = new C51180a();
                aVar.f127388a = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f127388a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f127389b = DisplayName.ADAPTER.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f127390c = DisplayName.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SipInfo sipInfo) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sipInfo.address);
                if (sipInfo.display_name_for_pc != null) {
                    DisplayName.ADAPTER.encodeWithTag(protoWriter, 2, sipInfo.display_name_for_pc);
                }
                if (sipInfo.display_name_for_mobile != null) {
                    DisplayName.ADAPTER.encodeWithTag(protoWriter, 3, sipInfo.display_name_for_mobile);
                }
                protoWriter.writeBytes(sipInfo.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C51180a newBuilder() {
            C51180a aVar = new C51180a();
            aVar.f127388a = this.address;
            aVar.f127389b = this.display_name_for_pc;
            aVar.f127390c = this.display_name_for_mobile;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCSearchUserInMeetingResponse$SipInfo$a */
        public static final class C51180a extends Message.Builder<SipInfo, C51180a> {

            /* renamed from: a */
            public String f127388a;

            /* renamed from: b */
            public DisplayName f127389b;

            /* renamed from: c */
            public DisplayName f127390c;

            /* renamed from: a */
            public SipInfo build() {
                String str = this.f127388a;
                if (str != null) {
                    return new SipInfo(str, this.f127389b, this.f127390c, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "address");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "SipInfo");
            StringBuilder sb = new StringBuilder();
            sb.append(", address=");
            sb.append(this.address);
            if (this.display_name_for_pc != null) {
                sb.append(", display_name_for_pc=");
                sb.append(this.display_name_for_pc);
            }
            if (this.display_name_for_mobile != null) {
                sb.append(", display_name_for_mobile=");
                sb.append(this.display_name_for_mobile);
            }
            StringBuilder replace = sb.replace(0, 2, "SipInfo{");
            replace.append('}');
            return replace.toString();
        }

        public SipInfo(String str, DisplayName displayName, DisplayName displayName2) {
            this(str, displayName, displayName2, ByteString.EMPTY);
        }

        public SipInfo(String str, DisplayName displayName, DisplayName displayName2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.address = str;
            this.display_name_for_pc = displayName;
            this.display_name_for_mobile = displayName2;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCSearchUserInMeetingResponse$b */
    private static final class C51183b extends ProtoAdapter<VCSearchUserInMeetingResponse> {
        C51183b() {
            super(FieldEncoding.LENGTH_DELIMITED, VCSearchUserInMeetingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(VCSearchUserInMeetingResponse vCSearchUserInMeetingResponse) {
            return SearchResult.ADAPTER.asRepeated().encodedSizeWithTag(1, vCSearchUserInMeetingResponse.users) + vCSearchUserInMeetingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public VCSearchUserInMeetingResponse decode(ProtoReader protoReader) throws IOException {
            C51182a aVar = new C51182a();
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
                    aVar.f127391a.add(SearchResult.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VCSearchUserInMeetingResponse vCSearchUserInMeetingResponse) throws IOException {
            SearchResult.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, vCSearchUserInMeetingResponse.users);
            protoWriter.writeBytes(vCSearchUserInMeetingResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCSearchUserInMeetingResponse$a */
    public static final class C51182a extends Message.Builder<VCSearchUserInMeetingResponse, C51182a> {

        /* renamed from: a */
        public List<SearchResult> f127391a = Internal.newMutableList();

        /* renamed from: a */
        public VCSearchUserInMeetingResponse build() {
            return new VCSearchUserInMeetingResponse(this.f127391a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51182a newBuilder() {
        C51182a aVar = new C51182a();
        aVar.f127391a = Internal.copyOf("users", this.users);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VCSearchUserInMeetingResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.users.isEmpty()) {
            sb.append(", users=");
            sb.append(this.users);
        }
        StringBuilder replace = sb.replace(0, 2, "VCSearchUserInMeetingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public VCSearchUserInMeetingResponse(List<SearchResult> list) {
        this(list, ByteString.EMPTY);
    }

    public VCSearchUserInMeetingResponse(List<SearchResult> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.users = Internal.immutableCopyOf("users", list);
    }
}
