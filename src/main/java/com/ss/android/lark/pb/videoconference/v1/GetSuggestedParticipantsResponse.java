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

public final class GetSuggestedParticipantsResponse extends Message<GetSuggestedParticipantsResponse, C50677a> {
    public static final ProtoAdapter<GetSuggestedParticipantsResponse> ADAPTER = new C50678b();
    private static final long serialVersionUID = 0;
    public final List<Participant> suggested_participants;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetSuggestedParticipantsResponse$b */
    private static final class C50678b extends ProtoAdapter<GetSuggestedParticipantsResponse> {
        C50678b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetSuggestedParticipantsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetSuggestedParticipantsResponse getSuggestedParticipantsResponse) {
            return Participant.ADAPTER.asRepeated().encodedSizeWithTag(1, getSuggestedParticipantsResponse.suggested_participants) + getSuggestedParticipantsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetSuggestedParticipantsResponse decode(ProtoReader protoReader) throws IOException {
            C50677a aVar = new C50677a();
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
                    aVar.f126402a.add(Participant.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetSuggestedParticipantsResponse getSuggestedParticipantsResponse) throws IOException {
            Participant.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getSuggestedParticipantsResponse.suggested_participants);
            protoWriter.writeBytes(getSuggestedParticipantsResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetSuggestedParticipantsResponse$a */
    public static final class C50677a extends Message.Builder<GetSuggestedParticipantsResponse, C50677a> {

        /* renamed from: a */
        public List<Participant> f126402a = Internal.newMutableList();

        /* renamed from: a */
        public GetSuggestedParticipantsResponse build() {
            return new GetSuggestedParticipantsResponse(this.f126402a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50677a newBuilder() {
        C50677a aVar = new C50677a();
        aVar.f126402a = Internal.copyOf("suggested_participants", this.suggested_participants);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetSuggestedParticipantsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.suggested_participants.isEmpty()) {
            sb.append(", suggested_participants=");
            sb.append(this.suggested_participants);
        }
        StringBuilder replace = sb.replace(0, 2, "GetSuggestedParticipantsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetSuggestedParticipantsResponse(List<Participant> list) {
        this(list, ByteString.EMPTY);
    }

    public GetSuggestedParticipantsResponse(List<Participant> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.suggested_participants = Internal.immutableCopyOf("suggested_participants", list);
    }
}
