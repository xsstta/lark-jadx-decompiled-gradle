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

public final class GetVerificationTicketResponse extends Message<GetVerificationTicketResponse, C50723a> {
    public static final ProtoAdapter<GetVerificationTicketResponse> ADAPTER = new C50724b();
    private static final long serialVersionUID = 0;
    public final String ticket;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetVerificationTicketResponse$b */
    private static final class C50724b extends ProtoAdapter<GetVerificationTicketResponse> {
        C50724b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetVerificationTicketResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetVerificationTicketResponse getVerificationTicketResponse) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getVerificationTicketResponse.ticket) + getVerificationTicketResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetVerificationTicketResponse decode(ProtoReader protoReader) throws IOException {
            C50723a aVar = new C50723a();
            aVar.f126469a = "";
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
                    aVar.f126469a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetVerificationTicketResponse getVerificationTicketResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getVerificationTicketResponse.ticket);
            protoWriter.writeBytes(getVerificationTicketResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetVerificationTicketResponse$a */
    public static final class C50723a extends Message.Builder<GetVerificationTicketResponse, C50723a> {

        /* renamed from: a */
        public String f126469a;

        /* renamed from: a */
        public GetVerificationTicketResponse build() {
            String str = this.f126469a;
            if (str != null) {
                return new GetVerificationTicketResponse(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "ticket");
        }
    }

    @Override // com.squareup.wire.Message
    public C50723a newBuilder() {
        C50723a aVar = new C50723a();
        aVar.f126469a = this.ticket;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetVerificationTicketResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", ticket=");
        sb.append(this.ticket);
        StringBuilder replace = sb.replace(0, 2, "GetVerificationTicketResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetVerificationTicketResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetVerificationTicketResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ticket = str;
    }
}
