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

public final class JoinMeetingPreCheckRequest extends Message<JoinMeetingPreCheckRequest, C50821a> {
    public static final ProtoAdapter<JoinMeetingPreCheckRequest> ADAPTER = new C50822b();
    public static final JoinMeetingCheckIDType DEFAULT_ID_TYPE = JoinMeetingCheckIDType.UNKNOWN;
    public static final ParticipantRole DEFAULT_INTERVIEW_ROLE = ParticipantRole.UNKNOW_ROLE;
    public static final Boolean DEFAULT_IS_NEED_ASSOCIATED_VC_INFO = false;
    private static final long serialVersionUID = 0;
    public final String id;
    public final JoinMeetingCheckIDType id_type;
    public final ParticipantRole interview_role;
    public final Boolean is_need_associated_vc_info;

    public enum JoinMeetingCheckIDType implements WireEnum {
        UNKNOWN(0),
        MEETINGID(1),
        UNIQUEID(2),
        GROUPID(3),
        MEETINGNO(4),
        INTERVIEWUID(5),
        CALL_TARGET_USER(6),
        RESERVATION_ID(7);
        
        public static final ProtoAdapter<JoinMeetingCheckIDType> ADAPTER = ProtoAdapter.newEnumAdapter(JoinMeetingCheckIDType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static JoinMeetingCheckIDType fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return MEETINGID;
                case 2:
                    return UNIQUEID;
                case 3:
                    return GROUPID;
                case 4:
                    return MEETINGNO;
                case 5:
                    return INTERVIEWUID;
                case 6:
                    return CALL_TARGET_USER;
                case 7:
                    return RESERVATION_ID;
                default:
                    return null;
            }
        }

        private JoinMeetingCheckIDType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.JoinMeetingPreCheckRequest$b */
    private static final class C50822b extends ProtoAdapter<JoinMeetingPreCheckRequest> {
        C50822b() {
            super(FieldEncoding.LENGTH_DELIMITED, JoinMeetingPreCheckRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(JoinMeetingPreCheckRequest joinMeetingPreCheckRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (joinMeetingPreCheckRequest.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, joinMeetingPreCheckRequest.id);
            } else {
                i = 0;
            }
            if (joinMeetingPreCheckRequest.id_type != null) {
                i2 = JoinMeetingCheckIDType.ADAPTER.encodedSizeWithTag(2, joinMeetingPreCheckRequest.id_type);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (joinMeetingPreCheckRequest.is_need_associated_vc_info != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, joinMeetingPreCheckRequest.is_need_associated_vc_info);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (joinMeetingPreCheckRequest.interview_role != null) {
                i4 = ParticipantRole.ADAPTER.encodedSizeWithTag(4, joinMeetingPreCheckRequest.interview_role);
            }
            return i6 + i4 + joinMeetingPreCheckRequest.unknownFields().size();
        }

        /* renamed from: a */
        public JoinMeetingPreCheckRequest decode(ProtoReader protoReader) throws IOException {
            C50821a aVar = new C50821a();
            aVar.f126691a = "";
            aVar.f126692b = JoinMeetingCheckIDType.UNKNOWN;
            aVar.f126693c = false;
            aVar.f126694d = ParticipantRole.UNKNOW_ROLE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126691a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f126692b = JoinMeetingCheckIDType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f126693c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f126694d = ParticipantRole.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, JoinMeetingPreCheckRequest joinMeetingPreCheckRequest) throws IOException {
            if (joinMeetingPreCheckRequest.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, joinMeetingPreCheckRequest.id);
            }
            if (joinMeetingPreCheckRequest.id_type != null) {
                JoinMeetingCheckIDType.ADAPTER.encodeWithTag(protoWriter, 2, joinMeetingPreCheckRequest.id_type);
            }
            if (joinMeetingPreCheckRequest.is_need_associated_vc_info != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, joinMeetingPreCheckRequest.is_need_associated_vc_info);
            }
            if (joinMeetingPreCheckRequest.interview_role != null) {
                ParticipantRole.ADAPTER.encodeWithTag(protoWriter, 4, joinMeetingPreCheckRequest.interview_role);
            }
            protoWriter.writeBytes(joinMeetingPreCheckRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50821a newBuilder() {
        C50821a aVar = new C50821a();
        aVar.f126691a = this.id;
        aVar.f126692b = this.id_type;
        aVar.f126693c = this.is_need_associated_vc_info;
        aVar.f126694d = this.interview_role;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.JoinMeetingPreCheckRequest$a */
    public static final class C50821a extends Message.Builder<JoinMeetingPreCheckRequest, C50821a> {

        /* renamed from: a */
        public String f126691a;

        /* renamed from: b */
        public JoinMeetingCheckIDType f126692b;

        /* renamed from: c */
        public Boolean f126693c;

        /* renamed from: d */
        public ParticipantRole f126694d;

        /* renamed from: a */
        public JoinMeetingPreCheckRequest build() {
            return new JoinMeetingPreCheckRequest(this.f126691a, this.f126692b, this.f126693c, this.f126694d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50821a mo175673a(JoinMeetingCheckIDType joinMeetingCheckIDType) {
            this.f126692b = joinMeetingCheckIDType;
            return this;
        }

        /* renamed from: a */
        public C50821a mo175674a(ParticipantRole participantRole) {
            this.f126694d = participantRole;
            return this;
        }

        /* renamed from: a */
        public C50821a mo175675a(Boolean bool) {
            this.f126693c = bool;
            return this;
        }

        /* renamed from: a */
        public C50821a mo175676a(String str) {
            this.f126691a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "JoinMeetingPreCheckRequest");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.id_type != null) {
            sb.append(", id_type=");
            sb.append(this.id_type);
        }
        if (this.is_need_associated_vc_info != null) {
            sb.append(", is_need_associated_vc_info=");
            sb.append(this.is_need_associated_vc_info);
        }
        if (this.interview_role != null) {
            sb.append(", interview_role=");
            sb.append(this.interview_role);
        }
        StringBuilder replace = sb.replace(0, 2, "JoinMeetingPreCheckRequest{");
        replace.append('}');
        return replace.toString();
    }

    public JoinMeetingPreCheckRequest(String str, JoinMeetingCheckIDType joinMeetingCheckIDType, Boolean bool, ParticipantRole participantRole) {
        this(str, joinMeetingCheckIDType, bool, participantRole, ByteString.EMPTY);
    }

    public JoinMeetingPreCheckRequest(String str, JoinMeetingCheckIDType joinMeetingCheckIDType, Boolean bool, ParticipantRole participantRole, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.id_type = joinMeetingCheckIDType;
        this.is_need_associated_vc_info = bool;
        this.interview_role = participantRole;
    }
}
