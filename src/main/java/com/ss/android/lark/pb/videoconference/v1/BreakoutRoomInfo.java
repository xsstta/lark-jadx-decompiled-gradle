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

public final class BreakoutRoomInfo extends Message<BreakoutRoomInfo, C50473a> {
    public static final ProtoAdapter<BreakoutRoomInfo> ADAPTER = new C50474b();
    public static final Long DEFAULT_COUNT_DOWN_FROM_START_TIME = 0L;
    public static final Long DEFAULT_SORT_ID = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    public static final Status DEFAULT_STATUS = Status.UNKNWON;
    private static final long serialVersionUID = 0;
    public final String breakout_room_id;
    public final String channel_id;
    public final Long count_down_from_start_time;
    public final BreakoutRoomInfoSettings settings;
    public final Long sort_id;
    public final Long start_time;
    public final Status status;
    public final String topic;

    public enum Status implements WireEnum {
        UNKNWON(0),
        ON_THE_CALL(1),
        COUNT_DOWN(2),
        IDLE(3);
        
        public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            if (i == 0) {
                return UNKNWON;
            }
            if (i == 1) {
                return ON_THE_CALL;
            }
            if (i == 2) {
                return COUNT_DOWN;
            }
            if (i != 3) {
                return null;
            }
            return IDLE;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    public static final class BreakoutRoomInfoSettings extends Message<BreakoutRoomInfoSettings, C50471a> {
        public static final ProtoAdapter<BreakoutRoomInfoSettings> ADAPTER = new C50472b();
        public static final Boolean DEFAULT_MUTE_ON_ENTRY = false;
        public static final Boolean DEFAULT_ONLY_PRESENTER_CAN_ANNOTATE = false;
        public static final Boolean DEFAULT_PARTICIPANT_UNMUTE_DENY = false;
        private static final long serialVersionUID = 0;
        public final Boolean mute_on_entry;
        public final Boolean only_presenter_can_annotate;
        public final Boolean participant_unmute_deny;
        public final List<ByteviewUser> snapshot_users;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.BreakoutRoomInfo$BreakoutRoomInfoSettings$b */
        private static final class C50472b extends ProtoAdapter<BreakoutRoomInfoSettings> {
            C50472b() {
                super(FieldEncoding.LENGTH_DELIMITED, BreakoutRoomInfoSettings.class);
            }

            /* renamed from: a */
            public int encodedSize(BreakoutRoomInfoSettings breakoutRoomInfoSettings) {
                int i;
                int i2;
                int i3 = 0;
                if (breakoutRoomInfoSettings.mute_on_entry != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, breakoutRoomInfoSettings.mute_on_entry);
                } else {
                    i = 0;
                }
                if (breakoutRoomInfoSettings.participant_unmute_deny != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, breakoutRoomInfoSettings.participant_unmute_deny);
                } else {
                    i2 = 0;
                }
                int encodedSizeWithTag = i + i2 + ByteviewUser.ADAPTER.asRepeated().encodedSizeWithTag(3, breakoutRoomInfoSettings.snapshot_users);
                if (breakoutRoomInfoSettings.only_presenter_can_annotate != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, breakoutRoomInfoSettings.only_presenter_can_annotate);
                }
                return encodedSizeWithTag + i3 + breakoutRoomInfoSettings.unknownFields().size();
            }

            /* renamed from: a */
            public BreakoutRoomInfoSettings decode(ProtoReader protoReader) throws IOException {
                C50471a aVar = new C50471a();
                aVar.f126016a = false;
                aVar.f126017b = false;
                aVar.f126019d = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126016a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f126017b = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f126018c.add(ByteviewUser.ADAPTER.decode(protoReader));
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126019d = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, BreakoutRoomInfoSettings breakoutRoomInfoSettings) throws IOException {
                if (breakoutRoomInfoSettings.mute_on_entry != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, breakoutRoomInfoSettings.mute_on_entry);
                }
                if (breakoutRoomInfoSettings.participant_unmute_deny != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, breakoutRoomInfoSettings.participant_unmute_deny);
                }
                ByteviewUser.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, breakoutRoomInfoSettings.snapshot_users);
                if (breakoutRoomInfoSettings.only_presenter_can_annotate != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, breakoutRoomInfoSettings.only_presenter_can_annotate);
                }
                protoWriter.writeBytes(breakoutRoomInfoSettings.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.BreakoutRoomInfo$BreakoutRoomInfoSettings$a */
        public static final class C50471a extends Message.Builder<BreakoutRoomInfoSettings, C50471a> {

            /* renamed from: a */
            public Boolean f126016a;

            /* renamed from: b */
            public Boolean f126017b;

            /* renamed from: c */
            public List<ByteviewUser> f126018c = Internal.newMutableList();

            /* renamed from: d */
            public Boolean f126019d;

            /* renamed from: a */
            public BreakoutRoomInfoSettings build() {
                return new BreakoutRoomInfoSettings(this.f126016a, this.f126017b, this.f126018c, this.f126019d, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C50471a mo174847a(Boolean bool) {
                this.f126016a = bool;
                return this;
            }

            /* renamed from: b */
            public C50471a mo174850b(Boolean bool) {
                this.f126017b = bool;
                return this;
            }

            /* renamed from: c */
            public C50471a mo174851c(Boolean bool) {
                this.f126019d = bool;
                return this;
            }

            /* renamed from: a */
            public C50471a mo174848a(List<ByteviewUser> list) {
                Internal.checkElementsNotNull(list);
                this.f126018c = list;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C50471a newBuilder() {
            C50471a aVar = new C50471a();
            aVar.f126016a = this.mute_on_entry;
            aVar.f126017b = this.participant_unmute_deny;
            aVar.f126018c = Internal.copyOf("snapshot_users", this.snapshot_users);
            aVar.f126019d = this.only_presenter_can_annotate;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "BreakoutRoomInfoSettings");
            StringBuilder sb = new StringBuilder();
            if (this.mute_on_entry != null) {
                sb.append(", mute_on_entry=");
                sb.append(this.mute_on_entry);
            }
            if (this.participant_unmute_deny != null) {
                sb.append(", participant_unmute_deny=");
                sb.append(this.participant_unmute_deny);
            }
            if (!this.snapshot_users.isEmpty()) {
                sb.append(", snapshot_users=");
                sb.append(this.snapshot_users);
            }
            if (this.only_presenter_can_annotate != null) {
                sb.append(", only_presenter_can_annotate=");
                sb.append(this.only_presenter_can_annotate);
            }
            StringBuilder replace = sb.replace(0, 2, "BreakoutRoomInfoSettings{");
            replace.append('}');
            return replace.toString();
        }

        public BreakoutRoomInfoSettings(Boolean bool, Boolean bool2, List<ByteviewUser> list, Boolean bool3) {
            this(bool, bool2, list, bool3, ByteString.EMPTY);
        }

        public BreakoutRoomInfoSettings(Boolean bool, Boolean bool2, List<ByteviewUser> list, Boolean bool3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mute_on_entry = bool;
            this.participant_unmute_deny = bool2;
            this.snapshot_users = Internal.immutableCopyOf("snapshot_users", list);
            this.only_presenter_can_annotate = bool3;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.BreakoutRoomInfo$b */
    private static final class C50474b extends ProtoAdapter<BreakoutRoomInfo> {
        C50474b() {
            super(FieldEncoding.LENGTH_DELIMITED, BreakoutRoomInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(BreakoutRoomInfo breakoutRoomInfo) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, breakoutRoomInfo.breakout_room_id);
            int i7 = 0;
            if (breakoutRoomInfo.topic != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, breakoutRoomInfo.topic);
            } else {
                i = 0;
            }
            int i8 = encodedSizeWithTag + i;
            if (breakoutRoomInfo.start_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, breakoutRoomInfo.start_time);
            } else {
                i2 = 0;
            }
            int i9 = i8 + i2;
            if (breakoutRoomInfo.settings != null) {
                i3 = BreakoutRoomInfoSettings.ADAPTER.encodedSizeWithTag(4, breakoutRoomInfo.settings);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (breakoutRoomInfo.channel_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, breakoutRoomInfo.channel_id);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (breakoutRoomInfo.status != null) {
                i5 = Status.ADAPTER.encodedSizeWithTag(6, breakoutRoomInfo.status);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (breakoutRoomInfo.count_down_from_start_time != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(7, breakoutRoomInfo.count_down_from_start_time);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (breakoutRoomInfo.sort_id != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(8, breakoutRoomInfo.sort_id);
            }
            return i13 + i7 + breakoutRoomInfo.unknownFields().size();
        }

        /* renamed from: a */
        public BreakoutRoomInfo decode(ProtoReader protoReader) throws IOException {
            C50473a aVar = new C50473a();
            aVar.f126020a = "";
            aVar.f126021b = "";
            aVar.f126022c = 0L;
            aVar.f126024e = "";
            aVar.f126025f = Status.UNKNWON;
            aVar.f126026g = 0L;
            aVar.f126027h = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f126020a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f126021b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f126022c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f126023d = BreakoutRoomInfoSettings.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f126024e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            try {
                                aVar.f126025f = Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 7:
                            aVar.f126026g = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            aVar.f126027h = ProtoAdapter.INT64.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, BreakoutRoomInfo breakoutRoomInfo) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, breakoutRoomInfo.breakout_room_id);
            if (breakoutRoomInfo.topic != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, breakoutRoomInfo.topic);
            }
            if (breakoutRoomInfo.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, breakoutRoomInfo.start_time);
            }
            if (breakoutRoomInfo.settings != null) {
                BreakoutRoomInfoSettings.ADAPTER.encodeWithTag(protoWriter, 4, breakoutRoomInfo.settings);
            }
            if (breakoutRoomInfo.channel_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, breakoutRoomInfo.channel_id);
            }
            if (breakoutRoomInfo.status != null) {
                Status.ADAPTER.encodeWithTag(protoWriter, 6, breakoutRoomInfo.status);
            }
            if (breakoutRoomInfo.count_down_from_start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, breakoutRoomInfo.count_down_from_start_time);
            }
            if (breakoutRoomInfo.sort_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, breakoutRoomInfo.sort_id);
            }
            protoWriter.writeBytes(breakoutRoomInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.BreakoutRoomInfo$a */
    public static final class C50473a extends Message.Builder<BreakoutRoomInfo, C50473a> {

        /* renamed from: a */
        public String f126020a;

        /* renamed from: b */
        public String f126021b;

        /* renamed from: c */
        public Long f126022c;

        /* renamed from: d */
        public BreakoutRoomInfoSettings f126023d;

        /* renamed from: e */
        public String f126024e;

        /* renamed from: f */
        public Status f126025f;

        /* renamed from: g */
        public Long f126026g;

        /* renamed from: h */
        public Long f126027h;

        /* renamed from: a */
        public BreakoutRoomInfo build() {
            String str = this.f126020a;
            if (str != null) {
                return new BreakoutRoomInfo(str, this.f126021b, this.f126022c, this.f126023d, this.f126024e, this.f126025f, this.f126026g, this.f126027h, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "breakout_room_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C50473a newBuilder() {
        C50473a aVar = new C50473a();
        aVar.f126020a = this.breakout_room_id;
        aVar.f126021b = this.topic;
        aVar.f126022c = this.start_time;
        aVar.f126023d = this.settings;
        aVar.f126024e = this.channel_id;
        aVar.f126025f = this.status;
        aVar.f126026g = this.count_down_from_start_time;
        aVar.f126027h = this.sort_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "BreakoutRoomInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", breakout_room_id=");
        sb.append(this.breakout_room_id);
        if (this.topic != null) {
            sb.append(", topic=");
            sb.append(this.topic);
        }
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.settings != null) {
            sb.append(", settings=");
            sb.append(this.settings);
        }
        if (this.channel_id != null) {
            sb.append(", channel_id=");
            sb.append(this.channel_id);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.count_down_from_start_time != null) {
            sb.append(", count_down_from_start_time=");
            sb.append(this.count_down_from_start_time);
        }
        if (this.sort_id != null) {
            sb.append(", sort_id=");
            sb.append(this.sort_id);
        }
        StringBuilder replace = sb.replace(0, 2, "BreakoutRoomInfo{");
        replace.append('}');
        return replace.toString();
    }

    public BreakoutRoomInfo(String str, String str2, Long l, BreakoutRoomInfoSettings breakoutRoomInfoSettings, String str3, Status status2, Long l2, Long l3) {
        this(str, str2, l, breakoutRoomInfoSettings, str3, status2, l2, l3, ByteString.EMPTY);
    }

    public BreakoutRoomInfo(String str, String str2, Long l, BreakoutRoomInfoSettings breakoutRoomInfoSettings, String str3, Status status2, Long l2, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.breakout_room_id = str;
        this.topic = str2;
        this.start_time = l;
        this.settings = breakoutRoomInfoSettings;
        this.channel_id = str3;
        this.status = status2;
        this.count_down_from_start_time = l2;
        this.sort_id = l3;
    }
}
