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

public final class GetParticipantsByIdsResponse extends Message<GetParticipantsByIdsResponse, C50667a> {
    public static final ProtoAdapter<GetParticipantsByIdsResponse> ADAPTER = new C50668b();
    private static final long serialVersionUID = 0;
    public final List<Participant> participants;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetParticipantsByIdsResponse$b */
    private static final class C50668b extends ProtoAdapter<GetParticipantsByIdsResponse> {
        C50668b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetParticipantsByIdsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetParticipantsByIdsResponse getParticipantsByIdsResponse) {
            return Participant.ADAPTER.asRepeated().encodedSizeWithTag(1, getParticipantsByIdsResponse.participants) + getParticipantsByIdsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetParticipantsByIdsResponse decode(ProtoReader protoReader) throws IOException {
            C50667a aVar = new C50667a();
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
                    aVar.f126396a.add(Participant.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetParticipantsByIdsResponse getParticipantsByIdsResponse) throws IOException {
            Participant.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getParticipantsByIdsResponse.participants);
            protoWriter.writeBytes(getParticipantsByIdsResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetParticipantsByIdsResponse$a */
    public static final class C50667a extends Message.Builder<GetParticipantsByIdsResponse, C50667a> {

        /* renamed from: a */
        public List<Participant> f126396a = Internal.newMutableList();

        /* renamed from: a */
        public GetParticipantsByIdsResponse build() {
            return new GetParticipantsByIdsResponse(this.f126396a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50667a newBuilder() {
        C50667a aVar = new C50667a();
        aVar.f126396a = Internal.copyOf("participants", this.participants);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetParticipantsByIdsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.participants.isEmpty()) {
            sb.append(", participants=");
            sb.append(this.participants);
        }
        StringBuilder replace = sb.replace(0, 2, "GetParticipantsByIdsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetParticipantsByIdsResponse(List<Participant> list) {
        this(list, ByteString.EMPTY);
    }

    public GetParticipantsByIdsResponse(List<Participant> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.participants = Internal.immutableCopyOf("participants", list);
    }
}
