package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class MeetingParticipantChange extends Message<MeetingParticipantChange, C50859a> {
    public static final ProtoAdapter<MeetingParticipantChange> ADAPTER = new C50860b();
    private static final long serialVersionUID = 0;
    public final String meeting_id;
    public final List<Participant> remove_participants;
    public final List<Participant> upsert_participants;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.MeetingParticipantChange$b */
    private static final class C50860b extends ProtoAdapter<MeetingParticipantChange> {
        C50860b() {
            super(FieldEncoding.LENGTH_DELIMITED, MeetingParticipantChange.class);
        }

        /* renamed from: a */
        public int encodedSize(MeetingParticipantChange meetingParticipantChange) {
            int i;
            if (meetingParticipantChange.meeting_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, meetingParticipantChange.meeting_id);
            } else {
                i = 0;
            }
            return i + Participant.ADAPTER.asRepeated().encodedSizeWithTag(3, meetingParticipantChange.upsert_participants) + Participant.ADAPTER.asRepeated().encodedSizeWithTag(4, meetingParticipantChange.remove_participants) + meetingParticipantChange.unknownFields().size();
        }

        /* renamed from: a */
        public MeetingParticipantChange decode(ProtoReader protoReader) throws IOException {
            C50859a aVar = new C50859a();
            aVar.f126765a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 2) {
                    aVar.f126765a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f126766b.add(Participant.ADAPTER.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126767c.add(Participant.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MeetingParticipantChange meetingParticipantChange) throws IOException {
            if (meetingParticipantChange.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, meetingParticipantChange.meeting_id);
            }
            Participant.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, meetingParticipantChange.upsert_participants);
            Participant.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, meetingParticipantChange.remove_participants);
            protoWriter.writeBytes(meetingParticipantChange.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.MeetingParticipantChange$a */
    public static final class C50859a extends Message.Builder<MeetingParticipantChange, C50859a> {

        /* renamed from: a */
        public String f126765a;

        /* renamed from: b */
        public List<Participant> f126766b = Internal.newMutableList();

        /* renamed from: c */
        public List<Participant> f126767c = Internal.newMutableList();

        /* renamed from: a */
        public MeetingParticipantChange build() {
            return new MeetingParticipantChange(this.f126765a, this.f126766b, this.f126767c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50859a newBuilder() {
        C50859a aVar = new C50859a();
        aVar.f126765a = this.meeting_id;
        aVar.f126766b = Internal.copyOf("upsert_participants", this.upsert_participants);
        aVar.f126767c = Internal.copyOf("remove_participants", this.remove_participants);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "MeetingParticipantChange");
        StringBuilder sb = new StringBuilder();
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        if (!this.upsert_participants.isEmpty()) {
            sb.append(", upsert_participants=");
            sb.append(this.upsert_participants);
        }
        if (!this.remove_participants.isEmpty()) {
            sb.append(", remove_participants=");
            sb.append(this.remove_participants);
        }
        StringBuilder replace = sb.replace(0, 2, "MeetingParticipantChange{");
        replace.append('}');
        return replace.toString();
    }

    public MeetingParticipantChange(String str, List<Participant> list, List<Participant> list2) {
        this(str, list, list2, ByteString.EMPTY);
    }

    public MeetingParticipantChange(String str, List<Participant> list, List<Participant> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.upsert_participants = Internal.immutableCopyOf("upsert_participants", list);
        this.remove_participants = Internal.immutableCopyOf("remove_participants", list2);
    }
}
