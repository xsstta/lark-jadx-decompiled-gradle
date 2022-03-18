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

public final class GetSuggestedParticipantsRequest extends Message<GetSuggestedParticipantsRequest, C50675a> {
    public static final ProtoAdapter<GetSuggestedParticipantsRequest> ADAPTER = new C50676b();
    private static final long serialVersionUID = 0;
    public final String meeting_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetSuggestedParticipantsRequest$b */
    private static final class C50676b extends ProtoAdapter<GetSuggestedParticipantsRequest> {
        C50676b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetSuggestedParticipantsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetSuggestedParticipantsRequest getSuggestedParticipantsRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getSuggestedParticipantsRequest.meeting_id) + getSuggestedParticipantsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetSuggestedParticipantsRequest decode(ProtoReader protoReader) throws IOException {
            C50675a aVar = new C50675a();
            aVar.f126401a = "";
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
                    aVar.f126401a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetSuggestedParticipantsRequest getSuggestedParticipantsRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getSuggestedParticipantsRequest.meeting_id);
            protoWriter.writeBytes(getSuggestedParticipantsRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetSuggestedParticipantsRequest$a */
    public static final class C50675a extends Message.Builder<GetSuggestedParticipantsRequest, C50675a> {

        /* renamed from: a */
        public String f126401a;

        /* renamed from: a */
        public GetSuggestedParticipantsRequest build() {
            String str = this.f126401a;
            if (str != null) {
                return new GetSuggestedParticipantsRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "meeting_id");
        }

        /* renamed from: a */
        public C50675a mo175328a(String str) {
            this.f126401a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50675a newBuilder() {
        C50675a aVar = new C50675a();
        aVar.f126401a = this.meeting_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetSuggestedParticipantsRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", meeting_id=");
        sb.append(this.meeting_id);
        StringBuilder replace = sb.replace(0, 2, "GetSuggestedParticipantsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetSuggestedParticipantsRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetSuggestedParticipantsRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
    }
}
