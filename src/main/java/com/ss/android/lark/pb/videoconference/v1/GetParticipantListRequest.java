package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetParticipantListRequest extends Message<GetParticipantListRequest, C50661a> {
    public static final ProtoAdapter<GetParticipantListRequest> ADAPTER = new C50662b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetParticipantListRequest$b */
    private static final class C50662b extends ProtoAdapter<GetParticipantListRequest> {
        C50662b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetParticipantListRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetParticipantListRequest getParticipantListRequest) {
            return getParticipantListRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetParticipantListRequest decode(ProtoReader protoReader) throws IOException {
            C50661a aVar = new C50661a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetParticipantListRequest getParticipantListRequest) throws IOException {
            protoWriter.writeBytes(getParticipantListRequest.unknownFields());
        }
    }

    public GetParticipantListRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetParticipantListRequest$a */
    public static final class C50661a extends Message.Builder<GetParticipantListRequest, C50661a> {
        /* renamed from: a */
        public GetParticipantListRequest build() {
            return new GetParticipantListRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50661a newBuilder() {
        C50661a aVar = new C50661a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetParticipantListRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetParticipantListRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetParticipantListRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
