package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class VideoChatExtraInfo extends Message<VideoChatExtraInfo, C51230a> {
    public static final ProtoAdapter<VideoChatExtraInfo> ADAPTER = new C51231b();
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final ActionTime action_time;
    public final List<InMeetingData> in_meeting_data;
    public final LiveExtraInfo live_extra_info;
    public final RingingReceivedData ringing_received_data;
    public final MeetingSubtitleData subtitle;
    public final Type type;
    public final String version;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        RINGING_RECEIVED(1),
        IN_MEETING_CHANGED(2),
        SUBTITLE(3),
        UPDATE_LIVE_EXTRA_INFO(4);
        
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
                return RINGING_RECEIVED;
            }
            if (i == 2) {
                return IN_MEETING_CHANGED;
            }
            if (i == 3) {
                return SUBTITLE;
            }
            if (i != 4) {
                return null;
            }
            return UPDATE_LIVE_EXTRA_INFO;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public static final class LiveExtraInfo extends Message<LiveExtraInfo, C51226a> {
        public static final ProtoAdapter<LiveExtraInfo> ADAPTER = new C51227b();
        public static final Integer DEFAULT_ONLINE_USERS_COUNT = 0;
        private static final long serialVersionUID = 0;
        public final Integer online_users_count;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatExtraInfo$LiveExtraInfo$b */
        private static final class C51227b extends ProtoAdapter<LiveExtraInfo> {
            C51227b() {
                super(FieldEncoding.LENGTH_DELIMITED, LiveExtraInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(LiveExtraInfo liveExtraInfo) {
                int i;
                if (liveExtraInfo.online_users_count != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(1, liveExtraInfo.online_users_count);
                } else {
                    i = 0;
                }
                return i + liveExtraInfo.unknownFields().size();
            }

            /* renamed from: a */
            public LiveExtraInfo decode(ProtoReader protoReader) throws IOException {
                C51226a aVar = new C51226a();
                aVar.f127520a = 0;
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
                        aVar.f127520a = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, LiveExtraInfo liveExtraInfo) throws IOException {
                if (liveExtraInfo.online_users_count != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, liveExtraInfo.online_users_count);
                }
                protoWriter.writeBytes(liveExtraInfo.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatExtraInfo$LiveExtraInfo$a */
        public static final class C51226a extends Message.Builder<LiveExtraInfo, C51226a> {

            /* renamed from: a */
            public Integer f127520a;

            /* renamed from: a */
            public LiveExtraInfo build() {
                return new LiveExtraInfo(this.f127520a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C51226a newBuilder() {
            C51226a aVar = new C51226a();
            aVar.f127520a = this.online_users_count;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "LiveExtraInfo");
            StringBuilder sb = new StringBuilder();
            if (this.online_users_count != null) {
                sb.append(", online_users_count=");
                sb.append(this.online_users_count);
            }
            StringBuilder replace = sb.replace(0, 2, "LiveExtraInfo{");
            replace.append('}');
            return replace.toString();
        }

        public LiveExtraInfo(Integer num) {
            this(num, ByteString.EMPTY);
        }

        public LiveExtraInfo(Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            this.online_users_count = num;
        }
    }

    public static final class RingingReceivedData extends Message<RingingReceivedData, C51228a> {
        public static final ProtoAdapter<RingingReceivedData> ADAPTER = new C51229b();
        private static final long serialVersionUID = 0;
        public final String meeting_id;
        public final Participant participant;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatExtraInfo$RingingReceivedData$b */
        private static final class C51229b extends ProtoAdapter<RingingReceivedData> {
            C51229b() {
                super(FieldEncoding.LENGTH_DELIMITED, RingingReceivedData.class);
            }

            /* renamed from: a */
            public int encodedSize(RingingReceivedData ringingReceivedData) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, ringingReceivedData.meeting_id) + Participant.ADAPTER.encodedSizeWithTag(2, ringingReceivedData.participant) + ringingReceivedData.unknownFields().size();
            }

            /* renamed from: a */
            public RingingReceivedData decode(ProtoReader protoReader) throws IOException {
                C51228a aVar = new C51228a();
                aVar.f127521a = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f127521a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f127522b = Participant.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, RingingReceivedData ringingReceivedData) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, ringingReceivedData.meeting_id);
                Participant.ADAPTER.encodeWithTag(protoWriter, 2, ringingReceivedData.participant);
                protoWriter.writeBytes(ringingReceivedData.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C51228a newBuilder() {
            C51228a aVar = new C51228a();
            aVar.f127521a = this.meeting_id;
            aVar.f127522b = this.participant;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatExtraInfo$RingingReceivedData$a */
        public static final class C51228a extends Message.Builder<RingingReceivedData, C51228a> {

            /* renamed from: a */
            public String f127521a;

            /* renamed from: b */
            public Participant f127522b;

            /* renamed from: a */
            public RingingReceivedData build() {
                Participant participant;
                String str = this.f127521a;
                if (str != null && (participant = this.f127522b) != null) {
                    return new RingingReceivedData(str, participant, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "meeting_id", this.f127522b, "participant");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "RingingReceivedData");
            StringBuilder sb = new StringBuilder();
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
            sb.append(", participant=");
            sb.append(this.participant);
            StringBuilder replace = sb.replace(0, 2, "RingingReceivedData{");
            replace.append('}');
            return replace.toString();
        }

        public RingingReceivedData(String str, Participant participant2) {
            this(str, participant2, ByteString.EMPTY);
        }

        public RingingReceivedData(String str, Participant participant2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.meeting_id = str;
            this.participant = participant2;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatExtraInfo$b */
    private static final class C51231b extends ProtoAdapter<VideoChatExtraInfo> {
        C51231b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatExtraInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatExtraInfo videoChatExtraInfo) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = Type.ADAPTER.encodedSizeWithTag(1, videoChatExtraInfo.type);
            int i5 = 0;
            if (videoChatExtraInfo.ringing_received_data != null) {
                i = RingingReceivedData.ADAPTER.encodedSizeWithTag(2, videoChatExtraInfo.ringing_received_data);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (videoChatExtraInfo.action_time != null) {
                i2 = ActionTime.ADAPTER.encodedSizeWithTag(3, videoChatExtraInfo.action_time);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag2 = i6 + i2 + InMeetingData.ADAPTER.asRepeated().encodedSizeWithTag(4, videoChatExtraInfo.in_meeting_data);
            if (videoChatExtraInfo.version != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, videoChatExtraInfo.version);
            } else {
                i3 = 0;
            }
            int i7 = encodedSizeWithTag2 + i3;
            if (videoChatExtraInfo.subtitle != null) {
                i4 = MeetingSubtitleData.ADAPTER.encodedSizeWithTag(6, videoChatExtraInfo.subtitle);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (videoChatExtraInfo.live_extra_info != null) {
                i5 = LiveExtraInfo.ADAPTER.encodedSizeWithTag(7, videoChatExtraInfo.live_extra_info);
            }
            return i8 + i5 + videoChatExtraInfo.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatExtraInfo decode(ProtoReader protoReader) throws IOException {
            C51230a aVar = new C51230a();
            aVar.f127523a = Type.UNKNOWN;
            aVar.f127527e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f127523a = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f127524b = RingingReceivedData.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f127525c = ActionTime.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f127526d.add(InMeetingData.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            aVar.f127527e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f127528f = MeetingSubtitleData.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f127529g = LiveExtraInfo.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, VideoChatExtraInfo videoChatExtraInfo) throws IOException {
            Type.ADAPTER.encodeWithTag(protoWriter, 1, videoChatExtraInfo.type);
            if (videoChatExtraInfo.ringing_received_data != null) {
                RingingReceivedData.ADAPTER.encodeWithTag(protoWriter, 2, videoChatExtraInfo.ringing_received_data);
            }
            if (videoChatExtraInfo.action_time != null) {
                ActionTime.ADAPTER.encodeWithTag(protoWriter, 3, videoChatExtraInfo.action_time);
            }
            InMeetingData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, videoChatExtraInfo.in_meeting_data);
            if (videoChatExtraInfo.version != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, videoChatExtraInfo.version);
            }
            if (videoChatExtraInfo.subtitle != null) {
                MeetingSubtitleData.ADAPTER.encodeWithTag(protoWriter, 6, videoChatExtraInfo.subtitle);
            }
            if (videoChatExtraInfo.live_extra_info != null) {
                LiveExtraInfo.ADAPTER.encodeWithTag(protoWriter, 7, videoChatExtraInfo.live_extra_info);
            }
            protoWriter.writeBytes(videoChatExtraInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatExtraInfo$a */
    public static final class C51230a extends Message.Builder<VideoChatExtraInfo, C51230a> {

        /* renamed from: a */
        public Type f127523a;

        /* renamed from: b */
        public RingingReceivedData f127524b;

        /* renamed from: c */
        public ActionTime f127525c;

        /* renamed from: d */
        public List<InMeetingData> f127526d = Internal.newMutableList();

        /* renamed from: e */
        public String f127527e;

        /* renamed from: f */
        public MeetingSubtitleData f127528f;

        /* renamed from: g */
        public LiveExtraInfo f127529g;

        /* renamed from: a */
        public VideoChatExtraInfo build() {
            Type type = this.f127523a;
            if (type != null) {
                return new VideoChatExtraInfo(type, this.f127524b, this.f127525c, this.f127526d, this.f127527e, this.f127528f, this.f127529g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d);
        }
    }

    @Override // com.squareup.wire.Message
    public C51230a newBuilder() {
        C51230a aVar = new C51230a();
        aVar.f127523a = this.type;
        aVar.f127524b = this.ringing_received_data;
        aVar.f127525c = this.action_time;
        aVar.f127526d = Internal.copyOf("in_meeting_data", this.in_meeting_data);
        aVar.f127527e = this.version;
        aVar.f127528f = this.subtitle;
        aVar.f127529g = this.live_extra_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VideoChatExtraInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.type);
        if (this.ringing_received_data != null) {
            sb.append(", ringing_received_data=");
            sb.append(this.ringing_received_data);
        }
        if (this.action_time != null) {
            sb.append(", action_time=");
            sb.append(this.action_time);
        }
        if (!this.in_meeting_data.isEmpty()) {
            sb.append(", in_meeting_data=");
            sb.append(this.in_meeting_data);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (this.subtitle != null) {
            sb.append(", subtitle=");
            sb.append(this.subtitle);
        }
        if (this.live_extra_info != null) {
            sb.append(", live_extra_info=");
            sb.append(this.live_extra_info);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoChatExtraInfo{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatExtraInfo(Type type2, RingingReceivedData ringingReceivedData, ActionTime actionTime, List<InMeetingData> list, String str, MeetingSubtitleData meetingSubtitleData, LiveExtraInfo liveExtraInfo) {
        this(type2, ringingReceivedData, actionTime, list, str, meetingSubtitleData, liveExtraInfo, ByteString.EMPTY);
    }

    public VideoChatExtraInfo(Type type2, RingingReceivedData ringingReceivedData, ActionTime actionTime, List<InMeetingData> list, String str, MeetingSubtitleData meetingSubtitleData, LiveExtraInfo liveExtraInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.ringing_received_data = ringingReceivedData;
        this.action_time = actionTime;
        this.in_meeting_data = Internal.immutableCopyOf("in_meeting_data", list);
        this.version = str;
        this.subtitle = meetingSubtitleData;
        this.live_extra_info = liveExtraInfo;
    }
}
