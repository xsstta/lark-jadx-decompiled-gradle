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

public final class MeetingJoinInfo extends Message<MeetingJoinInfo, C50857a> {
    public static final ProtoAdapter<MeetingJoinInfo> ADAPTER = new C50858b();
    public static final JoinStatus DEFAULT_JOIN_STATUS = JoinStatus.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final JoinStatus join_status;
    public final String meeting_id;

    public enum JoinStatus implements WireEnum {
        UNKNOWN(0),
        JOINED(1),
        WAITING(2),
        JOINABLE(3),
        END(4);
        
        public static final ProtoAdapter<JoinStatus> ADAPTER = ProtoAdapter.newEnumAdapter(JoinStatus.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static JoinStatus fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return JOINED;
            }
            if (i == 2) {
                return WAITING;
            }
            if (i == 3) {
                return JOINABLE;
            }
            if (i != 4) {
                return null;
            }
            return END;
        }

        private JoinStatus(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.MeetingJoinInfo$b */
    private static final class C50858b extends ProtoAdapter<MeetingJoinInfo> {
        C50858b() {
            super(FieldEncoding.LENGTH_DELIMITED, MeetingJoinInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(MeetingJoinInfo meetingJoinInfo) {
            int i;
            int i2 = 0;
            if (meetingJoinInfo.meeting_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, meetingJoinInfo.meeting_id);
            } else {
                i = 0;
            }
            if (meetingJoinInfo.join_status != null) {
                i2 = JoinStatus.ADAPTER.encodedSizeWithTag(2, meetingJoinInfo.join_status);
            }
            return i + i2 + meetingJoinInfo.unknownFields().size();
        }

        /* renamed from: a */
        public MeetingJoinInfo decode(ProtoReader protoReader) throws IOException {
            C50857a aVar = new C50857a();
            aVar.f126763a = "";
            aVar.f126764b = JoinStatus.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126763a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f126764b = JoinStatus.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MeetingJoinInfo meetingJoinInfo) throws IOException {
            if (meetingJoinInfo.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, meetingJoinInfo.meeting_id);
            }
            if (meetingJoinInfo.join_status != null) {
                JoinStatus.ADAPTER.encodeWithTag(protoWriter, 2, meetingJoinInfo.join_status);
            }
            protoWriter.writeBytes(meetingJoinInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.MeetingJoinInfo$a */
    public static final class C50857a extends Message.Builder<MeetingJoinInfo, C50857a> {

        /* renamed from: a */
        public String f126763a;

        /* renamed from: b */
        public JoinStatus f126764b;

        /* renamed from: a */
        public MeetingJoinInfo build() {
            return new MeetingJoinInfo(this.f126763a, this.f126764b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50857a newBuilder() {
        C50857a aVar = new C50857a();
        aVar.f126763a = this.meeting_id;
        aVar.f126764b = this.join_status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "MeetingJoinInfo");
        StringBuilder sb = new StringBuilder();
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        if (this.join_status != null) {
            sb.append(", join_status=");
            sb.append(this.join_status);
        }
        StringBuilder replace = sb.replace(0, 2, "MeetingJoinInfo{");
        replace.append('}');
        return replace.toString();
    }

    public MeetingJoinInfo(String str, JoinStatus joinStatus) {
        this(str, joinStatus, ByteString.EMPTY);
    }

    public MeetingJoinInfo(String str, JoinStatus joinStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.join_status = joinStatus;
    }
}
