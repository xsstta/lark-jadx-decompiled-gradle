package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class MeetingSourceAppLinkInfo extends Message<MeetingSourceAppLinkInfo, C50865a> {
    public static final ProtoAdapter<MeetingSourceAppLinkInfo> ADAPTER = new C50866b();
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final ParamFromCalendar param_calendar;
    public final ParamFromGroup param_group;
    public final Type type;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        CALENDAR(1),
        GROUP(2);
        
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
                return CALENDAR;
            }
            if (i != 2) {
                return null;
            }
            return GROUP;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public static final class ParamFromCalendar extends Message<ParamFromCalendar, C50861a> {
        public static final ProtoAdapter<ParamFromCalendar> ADAPTER = new C50862b();
        public static final Integer DEFAULT_ORIGINAL_TIME = 0;
        public static final Integer DEFAULT_START_TIME = 0;
        private static final long serialVersionUID = 0;
        public final String calendar_id;
        public final String key;
        public final Integer original_time;
        public final Integer start_time;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.MeetingSourceAppLinkInfo$ParamFromCalendar$b */
        private static final class C50862b extends ProtoAdapter<ParamFromCalendar> {
            C50862b() {
                super(FieldEncoding.LENGTH_DELIMITED, ParamFromCalendar.class);
            }

            /* renamed from: a */
            public int encodedSize(ParamFromCalendar paramFromCalendar) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (paramFromCalendar.calendar_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, paramFromCalendar.calendar_id);
                } else {
                    i = 0;
                }
                if (paramFromCalendar.key != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, paramFromCalendar.key);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (paramFromCalendar.original_time != null) {
                    i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, paramFromCalendar.original_time);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (paramFromCalendar.start_time != null) {
                    i4 = ProtoAdapter.INT32.encodedSizeWithTag(4, paramFromCalendar.start_time);
                }
                return i6 + i4 + paramFromCalendar.unknownFields().size();
            }

            /* renamed from: a */
            public ParamFromCalendar decode(ProtoReader protoReader) throws IOException {
                C50861a aVar = new C50861a();
                aVar.f126768a = "";
                aVar.f126769b = "";
                aVar.f126770c = 0;
                aVar.f126771d = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126768a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f126769b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f126770c = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126771d = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ParamFromCalendar paramFromCalendar) throws IOException {
                if (paramFromCalendar.calendar_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, paramFromCalendar.calendar_id);
                }
                if (paramFromCalendar.key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, paramFromCalendar.key);
                }
                if (paramFromCalendar.original_time != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, paramFromCalendar.original_time);
                }
                if (paramFromCalendar.start_time != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, paramFromCalendar.start_time);
                }
                protoWriter.writeBytes(paramFromCalendar.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.MeetingSourceAppLinkInfo$ParamFromCalendar$a */
        public static final class C50861a extends Message.Builder<ParamFromCalendar, C50861a> {

            /* renamed from: a */
            public String f126768a;

            /* renamed from: b */
            public String f126769b;

            /* renamed from: c */
            public Integer f126770c;

            /* renamed from: d */
            public Integer f126771d;

            /* renamed from: a */
            public ParamFromCalendar build() {
                return new ParamFromCalendar(this.f126768a, this.f126769b, this.f126770c, this.f126771d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50861a newBuilder() {
            C50861a aVar = new C50861a();
            aVar.f126768a = this.calendar_id;
            aVar.f126769b = this.key;
            aVar.f126770c = this.original_time;
            aVar.f126771d = this.start_time;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "ParamFromCalendar");
            StringBuilder sb = new StringBuilder();
            if (this.calendar_id != null) {
                sb.append(", calendar_id=");
                sb.append(this.calendar_id);
            }
            if (this.key != null) {
                sb.append(", key=");
                sb.append(this.key);
            }
            if (this.original_time != null) {
                sb.append(", original_time=");
                sb.append(this.original_time);
            }
            if (this.start_time != null) {
                sb.append(", start_time=");
                sb.append(this.start_time);
            }
            StringBuilder replace = sb.replace(0, 2, "ParamFromCalendar{");
            replace.append('}');
            return replace.toString();
        }

        public ParamFromCalendar(String str, String str2, Integer num, Integer num2) {
            this(str, str2, num, num2, ByteString.EMPTY);
        }

        public ParamFromCalendar(String str, String str2, Integer num, Integer num2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.calendar_id = str;
            this.key = str2;
            this.original_time = num;
            this.start_time = num2;
        }
    }

    public static final class ParamFromGroup extends Message<ParamFromGroup, C50863a> {
        public static final ProtoAdapter<ParamFromGroup> ADAPTER = new C50864b();
        private static final long serialVersionUID = 0;
        public final String chat_id;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.MeetingSourceAppLinkInfo$ParamFromGroup$b */
        private static final class C50864b extends ProtoAdapter<ParamFromGroup> {
            C50864b() {
                super(FieldEncoding.LENGTH_DELIMITED, ParamFromGroup.class);
            }

            /* renamed from: a */
            public int encodedSize(ParamFromGroup paramFromGroup) {
                int i;
                if (paramFromGroup.chat_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, paramFromGroup.chat_id);
                } else {
                    i = 0;
                }
                return i + paramFromGroup.unknownFields().size();
            }

            /* renamed from: a */
            public ParamFromGroup decode(ProtoReader protoReader) throws IOException {
                C50863a aVar = new C50863a();
                aVar.f126772a = "";
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
                        aVar.f126772a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ParamFromGroup paramFromGroup) throws IOException {
                if (paramFromGroup.chat_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, paramFromGroup.chat_id);
                }
                protoWriter.writeBytes(paramFromGroup.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.MeetingSourceAppLinkInfo$ParamFromGroup$a */
        public static final class C50863a extends Message.Builder<ParamFromGroup, C50863a> {

            /* renamed from: a */
            public String f126772a;

            /* renamed from: a */
            public ParamFromGroup build() {
                return new ParamFromGroup(this.f126772a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50863a newBuilder() {
            C50863a aVar = new C50863a();
            aVar.f126772a = this.chat_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "ParamFromGroup");
            StringBuilder sb = new StringBuilder();
            if (this.chat_id != null) {
                sb.append(", chat_id=");
                sb.append(this.chat_id);
            }
            StringBuilder replace = sb.replace(0, 2, "ParamFromGroup{");
            replace.append('}');
            return replace.toString();
        }

        public ParamFromGroup(String str) {
            this(str, ByteString.EMPTY);
        }

        public ParamFromGroup(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.chat_id = str;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.MeetingSourceAppLinkInfo$b */
    private static final class C50866b extends ProtoAdapter<MeetingSourceAppLinkInfo> {
        C50866b() {
            super(FieldEncoding.LENGTH_DELIMITED, MeetingSourceAppLinkInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(MeetingSourceAppLinkInfo meetingSourceAppLinkInfo) {
            int i;
            int i2;
            int i3 = 0;
            if (meetingSourceAppLinkInfo.type != null) {
                i = Type.ADAPTER.encodedSizeWithTag(1, meetingSourceAppLinkInfo.type);
            } else {
                i = 0;
            }
            if (meetingSourceAppLinkInfo.param_calendar != null) {
                i2 = ParamFromCalendar.ADAPTER.encodedSizeWithTag(2, meetingSourceAppLinkInfo.param_calendar);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (meetingSourceAppLinkInfo.param_group != null) {
                i3 = ParamFromGroup.ADAPTER.encodedSizeWithTag(3, meetingSourceAppLinkInfo.param_group);
            }
            return i4 + i3 + meetingSourceAppLinkInfo.unknownFields().size();
        }

        /* renamed from: a */
        public MeetingSourceAppLinkInfo decode(ProtoReader protoReader) throws IOException {
            C50865a aVar = new C50865a();
            aVar.f126773a = Type.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f126773a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f126774b = ParamFromCalendar.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126775c = ParamFromGroup.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MeetingSourceAppLinkInfo meetingSourceAppLinkInfo) throws IOException {
            if (meetingSourceAppLinkInfo.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, meetingSourceAppLinkInfo.type);
            }
            if (meetingSourceAppLinkInfo.param_calendar != null) {
                ParamFromCalendar.ADAPTER.encodeWithTag(protoWriter, 2, meetingSourceAppLinkInfo.param_calendar);
            }
            if (meetingSourceAppLinkInfo.param_group != null) {
                ParamFromGroup.ADAPTER.encodeWithTag(protoWriter, 3, meetingSourceAppLinkInfo.param_group);
            }
            protoWriter.writeBytes(meetingSourceAppLinkInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.MeetingSourceAppLinkInfo$a */
    public static final class C50865a extends Message.Builder<MeetingSourceAppLinkInfo, C50865a> {

        /* renamed from: a */
        public Type f126773a;

        /* renamed from: b */
        public ParamFromCalendar f126774b;

        /* renamed from: c */
        public ParamFromGroup f126775c;

        /* renamed from: a */
        public MeetingSourceAppLinkInfo build() {
            return new MeetingSourceAppLinkInfo(this.f126773a, this.f126774b, this.f126775c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50865a newBuilder() {
        C50865a aVar = new C50865a();
        aVar.f126773a = this.type;
        aVar.f126774b = this.param_calendar;
        aVar.f126775c = this.param_group;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "MeetingSourceAppLinkInfo");
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.param_calendar != null) {
            sb.append(", param_calendar=");
            sb.append(this.param_calendar);
        }
        if (this.param_group != null) {
            sb.append(", param_group=");
            sb.append(this.param_group);
        }
        StringBuilder replace = sb.replace(0, 2, "MeetingSourceAppLinkInfo{");
        replace.append('}');
        return replace.toString();
    }

    public MeetingSourceAppLinkInfo(Type type2, ParamFromCalendar paramFromCalendar, ParamFromGroup paramFromGroup) {
        this(type2, paramFromCalendar, paramFromGroup, ByteString.EMPTY);
    }

    public MeetingSourceAppLinkInfo(Type type2, ParamFromCalendar paramFromCalendar, ParamFromGroup paramFromGroup, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.param_calendar = paramFromCalendar;
        this.param_group = paramFromGroup;
    }
}
