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

public final class GetParticipantListResponse extends Message<GetParticipantListResponse, C50663a> {
    public static final ProtoAdapter<GetParticipantListResponse> ADAPTER = new C50664b();
    private static final long serialVersionUID = 0;
    public final List<ByteviewUser> Participant_list;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetParticipantListResponse$b */
    private static final class C50664b extends ProtoAdapter<GetParticipantListResponse> {
        C50664b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetParticipantListResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetParticipantListResponse getParticipantListResponse) {
            return ByteviewUser.ADAPTER.asRepeated().encodedSizeWithTag(1, getParticipantListResponse.Participant_list) + getParticipantListResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetParticipantListResponse decode(ProtoReader protoReader) throws IOException {
            C50663a aVar = new C50663a();
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
                    aVar.f126394a.add(ByteviewUser.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetParticipantListResponse getParticipantListResponse) throws IOException {
            ByteviewUser.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getParticipantListResponse.Participant_list);
            protoWriter.writeBytes(getParticipantListResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetParticipantListResponse$a */
    public static final class C50663a extends Message.Builder<GetParticipantListResponse, C50663a> {

        /* renamed from: a */
        public List<ByteviewUser> f126394a = Internal.newMutableList();

        /* renamed from: a */
        public GetParticipantListResponse build() {
            return new GetParticipantListResponse(this.f126394a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50663a newBuilder() {
        C50663a aVar = new C50663a();
        aVar.f126394a = Internal.copyOf("Participant_list", this.Participant_list);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetParticipantListResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.Participant_list.isEmpty()) {
            sb.append(", Participant_list=");
            sb.append(this.Participant_list);
        }
        StringBuilder replace = sb.replace(0, 2, "GetParticipantListResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetParticipantListResponse(List<ByteviewUser> list) {
        this(list, ByteString.EMPTY);
    }

    public GetParticipantListResponse(List<ByteviewUser> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.Participant_list = Internal.immutableCopyOf("Participant_list", list);
    }
}
