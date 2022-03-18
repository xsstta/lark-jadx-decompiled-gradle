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

public final class VCManageResult extends Message<VCManageResult, C51158a> {
    public static final ProtoAdapter<VCManageResult> ADAPTER = new C51159b();
    public static final Action DEFAULT_ACTION = Action.UNKNOWN;
    public static final Type DEFAULT_TYPE = Type.TYPEUNKNOWN;
    private static final long serialVersionUID = 0;
    public final Action action;
    public final BreakoutRoomCountdownInfo breakout_room_count_down_info;
    public final InterviewActionData interview_action_data;
    public final String meeting_id;
    public final Type type;

    public enum Action implements WireEnum {
        UNKNOWN(0),
        HOSTREJECT(1),
        MEETINGEND(2),
        HOSTALLOWED(3),
        VC_MEETING_NOT_SUPPORT(6),
        MEETING_START(7),
        INTERVIEW_CODING_ACTION(9);
        
        public static final ProtoAdapter<Action> ADAPTER = ProtoAdapter.newEnumAdapter(Action.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Action fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return HOSTREJECT;
            }
            if (i == 2) {
                return MEETINGEND;
            }
            if (i == 3) {
                return HOSTALLOWED;
            }
            if (i == 6) {
                return VC_MEETING_NOT_SUPPORT;
            }
            if (i == 7) {
                return MEETING_START;
            }
            if (i != 9) {
                return null;
            }
            return INTERVIEW_CODING_ACTION;
        }

        private Action(int i) {
            this.value = i;
        }
    }

    public enum Type implements WireEnum {
        TYPEUNKNOWN(0),
        MEETINGLOBBY(1),
        MEETINGPRELOBBY(2),
        BREAKOUT_ROOM_NEED_HELP(3),
        BREAKOUT_ROOM_COUNT_DOWN(4),
        INTERVIEW_CODING(5);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return TYPEUNKNOWN;
            }
            if (i == 1) {
                return MEETINGLOBBY;
            }
            if (i == 2) {
                return MEETINGPRELOBBY;
            }
            if (i == 3) {
                return BREAKOUT_ROOM_NEED_HELP;
            }
            if (i == 4) {
                return BREAKOUT_ROOM_COUNT_DOWN;
            }
            if (i != 5) {
                return null;
            }
            return INTERVIEW_CODING;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public static final class BreakoutRoomCountdownInfo extends Message<BreakoutRoomCountdownInfo, C51156a> {
        public static final ProtoAdapter<BreakoutRoomCountdownInfo> ADAPTER = new C51157b();
        public static final Long DEFAULT_COUNT_DOWN_FROM_START_TIME = 0L;
        private static final long serialVersionUID = 0;
        public final Long count_down_from_start_time;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCManageResult$BreakoutRoomCountdownInfo$b */
        private static final class C51157b extends ProtoAdapter<BreakoutRoomCountdownInfo> {
            C51157b() {
                super(FieldEncoding.LENGTH_DELIMITED, BreakoutRoomCountdownInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(BreakoutRoomCountdownInfo breakoutRoomCountdownInfo) {
                int i;
                if (breakoutRoomCountdownInfo.count_down_from_start_time != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, breakoutRoomCountdownInfo.count_down_from_start_time);
                } else {
                    i = 0;
                }
                return i + breakoutRoomCountdownInfo.unknownFields().size();
            }

            /* renamed from: a */
            public BreakoutRoomCountdownInfo decode(ProtoReader protoReader) throws IOException {
                C51156a aVar = new C51156a();
                aVar.f127305a = 0L;
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
                        aVar.f127305a = ProtoAdapter.INT64.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, BreakoutRoomCountdownInfo breakoutRoomCountdownInfo) throws IOException {
                if (breakoutRoomCountdownInfo.count_down_from_start_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, breakoutRoomCountdownInfo.count_down_from_start_time);
                }
                protoWriter.writeBytes(breakoutRoomCountdownInfo.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCManageResult$BreakoutRoomCountdownInfo$a */
        public static final class C51156a extends Message.Builder<BreakoutRoomCountdownInfo, C51156a> {

            /* renamed from: a */
            public Long f127305a;

            /* renamed from: a */
            public BreakoutRoomCountdownInfo build() {
                return new BreakoutRoomCountdownInfo(this.f127305a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C51156a newBuilder() {
            C51156a aVar = new C51156a();
            aVar.f127305a = this.count_down_from_start_time;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "BreakoutRoomCountdownInfo");
            StringBuilder sb = new StringBuilder();
            if (this.count_down_from_start_time != null) {
                sb.append(", count_down_from_start_time=");
                sb.append(this.count_down_from_start_time);
            }
            StringBuilder replace = sb.replace(0, 2, "BreakoutRoomCountdownInfo{");
            replace.append('}');
            return replace.toString();
        }

        public BreakoutRoomCountdownInfo(Long l) {
            this(l, ByteString.EMPTY);
        }

        public BreakoutRoomCountdownInfo(Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            this.count_down_from_start_time = l;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCManageResult$b */
    private static final class C51159b extends ProtoAdapter<VCManageResult> {
        C51159b() {
            super(FieldEncoding.LENGTH_DELIMITED, VCManageResult.class);
        }

        /* renamed from: a */
        public int encodedSize(VCManageResult vCManageResult) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (vCManageResult.meeting_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, vCManageResult.meeting_id);
            } else {
                i = 0;
            }
            if (vCManageResult.type != null) {
                i2 = Type.ADAPTER.encodedSizeWithTag(2, vCManageResult.type);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (vCManageResult.action != null) {
                i3 = Action.ADAPTER.encodedSizeWithTag(3, vCManageResult.action);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (vCManageResult.breakout_room_count_down_info != null) {
                i4 = BreakoutRoomCountdownInfo.ADAPTER.encodedSizeWithTag(4, vCManageResult.breakout_room_count_down_info);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (vCManageResult.interview_action_data != null) {
                i5 = InterviewActionData.ADAPTER.encodedSizeWithTag(5, vCManageResult.interview_action_data);
            }
            return i8 + i5 + vCManageResult.unknownFields().size();
        }

        /* renamed from: a */
        public VCManageResult decode(ProtoReader protoReader) throws IOException {
            C51158a aVar = new C51158a();
            aVar.f127306a = "";
            aVar.f127307b = Type.TYPEUNKNOWN;
            aVar.f127308c = Action.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127306a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f127307b = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    try {
                        aVar.f127308c = Action.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag == 4) {
                    aVar.f127309d = BreakoutRoomCountdownInfo.ADAPTER.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127310e = InterviewActionData.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VCManageResult vCManageResult) throws IOException {
            if (vCManageResult.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, vCManageResult.meeting_id);
            }
            if (vCManageResult.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 2, vCManageResult.type);
            }
            if (vCManageResult.action != null) {
                Action.ADAPTER.encodeWithTag(protoWriter, 3, vCManageResult.action);
            }
            if (vCManageResult.breakout_room_count_down_info != null) {
                BreakoutRoomCountdownInfo.ADAPTER.encodeWithTag(protoWriter, 4, vCManageResult.breakout_room_count_down_info);
            }
            if (vCManageResult.interview_action_data != null) {
                InterviewActionData.ADAPTER.encodeWithTag(protoWriter, 5, vCManageResult.interview_action_data);
            }
            protoWriter.writeBytes(vCManageResult.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCManageResult$a */
    public static final class C51158a extends Message.Builder<VCManageResult, C51158a> {

        /* renamed from: a */
        public String f127306a;

        /* renamed from: b */
        public Type f127307b;

        /* renamed from: c */
        public Action f127308c;

        /* renamed from: d */
        public BreakoutRoomCountdownInfo f127309d;

        /* renamed from: e */
        public InterviewActionData f127310e;

        /* renamed from: a */
        public VCManageResult build() {
            return new VCManageResult(this.f127306a, this.f127307b, this.f127308c, this.f127309d, this.f127310e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51158a newBuilder() {
        C51158a aVar = new C51158a();
        aVar.f127306a = this.meeting_id;
        aVar.f127307b = this.type;
        aVar.f127308c = this.action;
        aVar.f127309d = this.breakout_room_count_down_info;
        aVar.f127310e = this.interview_action_data;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VCManageResult");
        StringBuilder sb = new StringBuilder();
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.action != null) {
            sb.append(", action=");
            sb.append(this.action);
        }
        if (this.breakout_room_count_down_info != null) {
            sb.append(", breakout_room_count_down_info=");
            sb.append(this.breakout_room_count_down_info);
        }
        if (this.interview_action_data != null) {
            sb.append(", interview_action_data=");
            sb.append(this.interview_action_data);
        }
        StringBuilder replace = sb.replace(0, 2, "VCManageResult{");
        replace.append('}');
        return replace.toString();
    }

    public VCManageResult(String str, Type type2, Action action2, BreakoutRoomCountdownInfo breakoutRoomCountdownInfo, InterviewActionData interviewActionData) {
        this(str, type2, action2, breakoutRoomCountdownInfo, interviewActionData, ByteString.EMPTY);
    }

    public VCManageResult(String str, Type type2, Action action2, BreakoutRoomCountdownInfo breakoutRoomCountdownInfo, InterviewActionData interviewActionData, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.type = type2;
        this.action = action2;
        this.breakout_room_count_down_info = breakoutRoomCountdownInfo;
        this.interview_action_data = interviewActionData;
    }
}
