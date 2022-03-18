package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class JoinInterviewGroupMeetingRequest extends Message<JoinInterviewGroupMeetingRequest, C50815a> {
    public static final ProtoAdapter<JoinInterviewGroupMeetingRequest> ADAPTER = new C50816b();
    public static final Boolean DEFAULT_FORCE = false;
    public static final ParticipantType DEFAULT_PARTI_TYPE = ParticipantType.UNKNOW;
    public static final ParticipantRole DEFAULT_ROLE = ParticipantRole.UNKNOW_ROLE;
    private static final long serialVersionUID = 0;
    public final Boolean force;
    public final String interview_unique_id;
    public final ParticipantType parti_type;
    public final ParticipantSettings participant_settings;
    public final ParticipantRole role;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.JoinInterviewGroupMeetingRequest$b */
    private static final class C50816b extends ProtoAdapter<JoinInterviewGroupMeetingRequest> {
        C50816b() {
            super(FieldEncoding.LENGTH_DELIMITED, JoinInterviewGroupMeetingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(JoinInterviewGroupMeetingRequest joinInterviewGroupMeetingRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, joinInterviewGroupMeetingRequest.interview_unique_id) + ParticipantType.ADAPTER.encodedSizeWithTag(2, joinInterviewGroupMeetingRequest.parti_type);
            int i3 = 0;
            if (joinInterviewGroupMeetingRequest.force != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(3, joinInterviewGroupMeetingRequest.force);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (joinInterviewGroupMeetingRequest.role != null) {
                i2 = ParticipantRole.ADAPTER.encodedSizeWithTag(4, joinInterviewGroupMeetingRequest.role);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (joinInterviewGroupMeetingRequest.participant_settings != null) {
                i3 = ParticipantSettings.ADAPTER.encodedSizeWithTag(5, joinInterviewGroupMeetingRequest.participant_settings);
            }
            return i5 + i3 + joinInterviewGroupMeetingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public JoinInterviewGroupMeetingRequest decode(ProtoReader protoReader) throws IOException {
            C50815a aVar = new C50815a();
            aVar.f126680a = "";
            aVar.f126681b = ParticipantType.UNKNOW;
            aVar.f126682c = false;
            aVar.f126683d = ParticipantRole.UNKNOW_ROLE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126680a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f126681b = ParticipantType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f126682c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 4) {
                    try {
                        aVar.f126683d = ParticipantRole.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126684e = ParticipantSettings.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, JoinInterviewGroupMeetingRequest joinInterviewGroupMeetingRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, joinInterviewGroupMeetingRequest.interview_unique_id);
            ParticipantType.ADAPTER.encodeWithTag(protoWriter, 2, joinInterviewGroupMeetingRequest.parti_type);
            if (joinInterviewGroupMeetingRequest.force != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, joinInterviewGroupMeetingRequest.force);
            }
            if (joinInterviewGroupMeetingRequest.role != null) {
                ParticipantRole.ADAPTER.encodeWithTag(protoWriter, 4, joinInterviewGroupMeetingRequest.role);
            }
            if (joinInterviewGroupMeetingRequest.participant_settings != null) {
                ParticipantSettings.ADAPTER.encodeWithTag(protoWriter, 5, joinInterviewGroupMeetingRequest.participant_settings);
            }
            protoWriter.writeBytes(joinInterviewGroupMeetingRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50815a newBuilder() {
        C50815a aVar = new C50815a();
        aVar.f126680a = this.interview_unique_id;
        aVar.f126681b = this.parti_type;
        aVar.f126682c = this.force;
        aVar.f126683d = this.role;
        aVar.f126684e = this.participant_settings;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.JoinInterviewGroupMeetingRequest$a */
    public static final class C50815a extends Message.Builder<JoinInterviewGroupMeetingRequest, C50815a> {

        /* renamed from: a */
        public String f126680a;

        /* renamed from: b */
        public ParticipantType f126681b;

        /* renamed from: c */
        public Boolean f126682c;

        /* renamed from: d */
        public ParticipantRole f126683d;

        /* renamed from: e */
        public ParticipantSettings f126684e;

        /* renamed from: a */
        public JoinInterviewGroupMeetingRequest build() {
            ParticipantType participantType;
            String str = this.f126680a;
            if (str != null && (participantType = this.f126681b) != null) {
                return new JoinInterviewGroupMeetingRequest(str, participantType, this.f126682c, this.f126683d, this.f126684e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "interview_unique_id", this.f126681b, "parti_type");
        }

        /* renamed from: a */
        public C50815a mo175656a(ParticipantRole participantRole) {
            this.f126683d = participantRole;
            return this;
        }

        /* renamed from: a */
        public C50815a mo175657a(ParticipantSettings participantSettings) {
            this.f126684e = participantSettings;
            return this;
        }

        /* renamed from: a */
        public C50815a mo175658a(ParticipantType participantType) {
            this.f126681b = participantType;
            return this;
        }

        /* renamed from: a */
        public C50815a mo175659a(Boolean bool) {
            this.f126682c = bool;
            return this;
        }

        /* renamed from: a */
        public C50815a mo175660a(String str) {
            this.f126680a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "JoinInterviewGroupMeetingRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", interview_unique_id=");
        sb.append(this.interview_unique_id);
        sb.append(", parti_type=");
        sb.append(this.parti_type);
        if (this.force != null) {
            sb.append(", force=");
            sb.append(this.force);
        }
        if (this.role != null) {
            sb.append(", role=");
            sb.append(this.role);
        }
        if (this.participant_settings != null) {
            sb.append(", participant_settings=");
            sb.append(this.participant_settings);
        }
        StringBuilder replace = sb.replace(0, 2, "JoinInterviewGroupMeetingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public JoinInterviewGroupMeetingRequest(String str, ParticipantType participantType, Boolean bool, ParticipantRole participantRole, ParticipantSettings participantSettings) {
        this(str, participantType, bool, participantRole, participantSettings, ByteString.EMPTY);
    }

    public JoinInterviewGroupMeetingRequest(String str, ParticipantType participantType, Boolean bool, ParticipantRole participantRole, ParticipantSettings participantSettings, ByteString byteString) {
        super(ADAPTER, byteString);
        this.interview_unique_id = str;
        this.parti_type = participantType;
        this.force = bool;
        this.role = participantRole;
        this.participant_settings = participantSettings;
    }
}
