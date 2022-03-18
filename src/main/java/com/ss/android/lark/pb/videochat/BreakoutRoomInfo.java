package com.ss.android.lark.pb.videochat;

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

public final class BreakoutRoomInfo extends Message<BreakoutRoomInfo, C50272a> {
    public static final ProtoAdapter<BreakoutRoomInfo> ADAPTER = new C50273b();
    public static final Long DEFAULT_COUNT_DOWN_FROM_START_TIME = 0L;
    public static final Long DEFAULT_SORT_ID = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String mbreakout_room_id;
    public final String mchannel_id;
    public final Long mcount_down_from_start_time;
    public final BreakoutRoomInfoSettings msettings;
    public final Long msort_id;
    public final Long mstart_time;
    public final Status mstatus;
    public final String mtopic;

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

    public static final class BreakoutRoomInfoSettings extends Message<BreakoutRoomInfoSettings, C50270a> {
        public static final ProtoAdapter<BreakoutRoomInfoSettings> ADAPTER = new C50271b();
        public static final Boolean DEFAULT_MUTE_ON_ENTRY = false;
        public static final Boolean DEFAULT_ONLY_PRESENTER_CAN_ANNOTATE = false;
        public static final Boolean DEFAULT_PARTICIPANT_UNMUTE_DENY = false;
        private static final long serialVersionUID = 0;
        public final Boolean mmute_on_entry;
        public final Boolean monly_presenter_can_annotate;
        public final Boolean mparticipant_unmute_deny;
        public final List<ByteviewUser> msnapshot_users;

        /* renamed from: com.ss.android.lark.pb.videochat.BreakoutRoomInfo$BreakoutRoomInfoSettings$b */
        private static final class C50271b extends ProtoAdapter<BreakoutRoomInfoSettings> {
            C50271b() {
                super(FieldEncoding.LENGTH_DELIMITED, BreakoutRoomInfoSettings.class);
            }

            /* renamed from: a */
            public int encodedSize(BreakoutRoomInfoSettings breakoutRoomInfoSettings) {
                int i;
                int i2;
                int i3 = 0;
                if (breakoutRoomInfoSettings.mmute_on_entry != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, breakoutRoomInfoSettings.mmute_on_entry);
                } else {
                    i = 0;
                }
                if (breakoutRoomInfoSettings.mparticipant_unmute_deny != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, breakoutRoomInfoSettings.mparticipant_unmute_deny);
                } else {
                    i2 = 0;
                }
                int encodedSizeWithTag = i + i2 + ByteviewUser.ADAPTER.asRepeated().encodedSizeWithTag(3, breakoutRoomInfoSettings.msnapshot_users);
                if (breakoutRoomInfoSettings.monly_presenter_can_annotate != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, breakoutRoomInfoSettings.monly_presenter_can_annotate);
                }
                return encodedSizeWithTag + i3 + breakoutRoomInfoSettings.unknownFields().size();
            }

            /* renamed from: a */
            public BreakoutRoomInfoSettings decode(ProtoReader protoReader) throws IOException {
                C50270a aVar = new C50270a();
                aVar.f125620a = false;
                aVar.f125621b = false;
                aVar.f125623d = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f125620a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f125621b = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f125622c.add(ByteviewUser.ADAPTER.decode(protoReader));
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f125623d = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, BreakoutRoomInfoSettings breakoutRoomInfoSettings) throws IOException {
                if (breakoutRoomInfoSettings.mmute_on_entry != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, breakoutRoomInfoSettings.mmute_on_entry);
                }
                if (breakoutRoomInfoSettings.mparticipant_unmute_deny != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, breakoutRoomInfoSettings.mparticipant_unmute_deny);
                }
                ByteviewUser.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, breakoutRoomInfoSettings.msnapshot_users);
                if (breakoutRoomInfoSettings.monly_presenter_can_annotate != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, breakoutRoomInfoSettings.monly_presenter_can_annotate);
                }
                protoWriter.writeBytes(breakoutRoomInfoSettings.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videochat.BreakoutRoomInfo$BreakoutRoomInfoSettings$a */
        public static final class C50270a extends Message.Builder<BreakoutRoomInfoSettings, C50270a> {

            /* renamed from: a */
            public Boolean f125620a;

            /* renamed from: b */
            public Boolean f125621b;

            /* renamed from: c */
            public List<ByteviewUser> f125622c = Internal.newMutableList();

            /* renamed from: d */
            public Boolean f125623d;

            /* renamed from: a */
            public BreakoutRoomInfoSettings build() {
                return new BreakoutRoomInfoSettings(this.f125620a, this.f125621b, this.f125622c, this.f125623d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50270a newBuilder() {
            C50270a aVar = new C50270a();
            aVar.f125620a = this.mmute_on_entry;
            aVar.f125621b = this.mparticipant_unmute_deny;
            aVar.f125622c = Internal.copyOf("msnapshot_users", this.msnapshot_users);
            aVar.f125623d = this.monly_presenter_can_annotate;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mmute_on_entry != null) {
                sb.append(", mute_on_entry=");
                sb.append(this.mmute_on_entry);
            }
            if (this.mparticipant_unmute_deny != null) {
                sb.append(", participant_unmute_deny=");
                sb.append(this.mparticipant_unmute_deny);
            }
            if (!this.msnapshot_users.isEmpty()) {
                sb.append(", snapshot_users=");
                sb.append(this.msnapshot_users);
            }
            if (this.monly_presenter_can_annotate != null) {
                sb.append(", only_presenter_can_annotate=");
                sb.append(this.monly_presenter_can_annotate);
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
            this.mmute_on_entry = bool;
            this.mparticipant_unmute_deny = bool2;
            this.msnapshot_users = Internal.immutableCopyOf("msnapshot_users", list);
            this.monly_presenter_can_annotate = bool3;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.BreakoutRoomInfo$b */
    private static final class C50273b extends ProtoAdapter<BreakoutRoomInfo> {
        C50273b() {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, breakoutRoomInfo.mbreakout_room_id);
            int i7 = 0;
            if (breakoutRoomInfo.mtopic != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, breakoutRoomInfo.mtopic);
            } else {
                i = 0;
            }
            int i8 = encodedSizeWithTag + i;
            if (breakoutRoomInfo.mstart_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, breakoutRoomInfo.mstart_time);
            } else {
                i2 = 0;
            }
            int i9 = i8 + i2;
            if (breakoutRoomInfo.msettings != null) {
                i3 = BreakoutRoomInfoSettings.ADAPTER.encodedSizeWithTag(4, breakoutRoomInfo.msettings);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (breakoutRoomInfo.mchannel_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, breakoutRoomInfo.mchannel_id);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (breakoutRoomInfo.mstatus != null) {
                i5 = Status.ADAPTER.encodedSizeWithTag(6, breakoutRoomInfo.mstatus);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (breakoutRoomInfo.mcount_down_from_start_time != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(7, breakoutRoomInfo.mcount_down_from_start_time);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (breakoutRoomInfo.msort_id != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(8, breakoutRoomInfo.msort_id);
            }
            return i13 + i7 + breakoutRoomInfo.unknownFields().size();
        }

        /* renamed from: a */
        public BreakoutRoomInfo decode(ProtoReader protoReader) throws IOException {
            C50272a aVar = new C50272a();
            aVar.f125624a = "";
            aVar.f125625b = "";
            aVar.f125626c = 0L;
            aVar.f125628e = "";
            aVar.f125630g = 0L;
            aVar.f125631h = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125624a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f125625b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f125626c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f125627d = BreakoutRoomInfoSettings.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125628e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            try {
                                aVar.f125629f = Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 7:
                            aVar.f125630g = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            aVar.f125631h = ProtoAdapter.INT64.decode(protoReader);
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
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, breakoutRoomInfo.mbreakout_room_id);
            if (breakoutRoomInfo.mtopic != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, breakoutRoomInfo.mtopic);
            }
            if (breakoutRoomInfo.mstart_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, breakoutRoomInfo.mstart_time);
            }
            if (breakoutRoomInfo.msettings != null) {
                BreakoutRoomInfoSettings.ADAPTER.encodeWithTag(protoWriter, 4, breakoutRoomInfo.msettings);
            }
            if (breakoutRoomInfo.mchannel_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, breakoutRoomInfo.mchannel_id);
            }
            if (breakoutRoomInfo.mstatus != null) {
                Status.ADAPTER.encodeWithTag(protoWriter, 6, breakoutRoomInfo.mstatus);
            }
            if (breakoutRoomInfo.mcount_down_from_start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, breakoutRoomInfo.mcount_down_from_start_time);
            }
            if (breakoutRoomInfo.msort_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, breakoutRoomInfo.msort_id);
            }
            protoWriter.writeBytes(breakoutRoomInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.BreakoutRoomInfo$a */
    public static final class C50272a extends Message.Builder<BreakoutRoomInfo, C50272a> {

        /* renamed from: a */
        public String f125624a;

        /* renamed from: b */
        public String f125625b;

        /* renamed from: c */
        public Long f125626c;

        /* renamed from: d */
        public BreakoutRoomInfoSettings f125627d;

        /* renamed from: e */
        public String f125628e;

        /* renamed from: f */
        public Status f125629f;

        /* renamed from: g */
        public Long f125630g;

        /* renamed from: h */
        public Long f125631h;

        /* renamed from: a */
        public BreakoutRoomInfo build() {
            String str = this.f125624a;
            if (str != null) {
                return new BreakoutRoomInfo(str, this.f125625b, this.f125626c, this.f125627d, this.f125628e, this.f125629f, this.f125630g, this.f125631h, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mbreakout_room_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C50272a newBuilder() {
        C50272a aVar = new C50272a();
        aVar.f125624a = this.mbreakout_room_id;
        aVar.f125625b = this.mtopic;
        aVar.f125626c = this.mstart_time;
        aVar.f125627d = this.msettings;
        aVar.f125628e = this.mchannel_id;
        aVar.f125629f = this.mstatus;
        aVar.f125630g = this.mcount_down_from_start_time;
        aVar.f125631h = this.msort_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", breakout_room_id=");
        sb.append(this.mbreakout_room_id);
        if (this.mtopic != null) {
            sb.append(", topic=");
            sb.append(this.mtopic);
        }
        if (this.mstart_time != null) {
            sb.append(", start_time=");
            sb.append(this.mstart_time);
        }
        if (this.msettings != null) {
            sb.append(", settings=");
            sb.append(this.msettings);
        }
        if (this.mchannel_id != null) {
            sb.append(", channel_id=");
            sb.append(this.mchannel_id);
        }
        if (this.mstatus != null) {
            sb.append(", status=");
            sb.append(this.mstatus);
        }
        if (this.mcount_down_from_start_time != null) {
            sb.append(", count_down_from_start_time=");
            sb.append(this.mcount_down_from_start_time);
        }
        if (this.msort_id != null) {
            sb.append(", sort_id=");
            sb.append(this.msort_id);
        }
        StringBuilder replace = sb.replace(0, 2, "BreakoutRoomInfo{");
        replace.append('}');
        return replace.toString();
    }

    public BreakoutRoomInfo(String str, String str2, Long l, BreakoutRoomInfoSettings breakoutRoomInfoSettings, String str3, Status status, Long l2, Long l3) {
        this(str, str2, l, breakoutRoomInfoSettings, str3, status, l2, l3, ByteString.EMPTY);
    }

    public BreakoutRoomInfo(String str, String str2, Long l, BreakoutRoomInfoSettings breakoutRoomInfoSettings, String str3, Status status, Long l2, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mbreakout_room_id = str;
        this.mtopic = str2;
        this.mstart_time = l;
        this.msettings = breakoutRoomInfoSettings;
        this.mchannel_id = str3;
        this.mstatus = status;
        this.mcount_down_from_start_time = l2;
        this.msort_id = l3;
    }
}
