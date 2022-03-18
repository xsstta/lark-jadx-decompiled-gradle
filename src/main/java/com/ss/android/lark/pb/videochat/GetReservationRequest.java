package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetReservationRequest extends Message<GetReservationRequest, C50334a> {
    public static final ProtoAdapter<GetReservationRequest> ADAPTER = new C50335b();
    private static final long serialVersionUID = 0;
    public final String mid;

    /* renamed from: com.ss.android.lark.pb.videochat.GetReservationRequest$b */
    private static final class C50335b extends ProtoAdapter<GetReservationRequest> {
        C50335b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetReservationRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetReservationRequest getReservationRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getReservationRequest.mid) + getReservationRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetReservationRequest decode(ProtoReader protoReader) throws IOException {
            C50334a aVar = new C50334a();
            aVar.f125714a = "";
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
                    aVar.f125714a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetReservationRequest getReservationRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getReservationRequest.mid);
            protoWriter.writeBytes(getReservationRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.GetReservationRequest$a */
    public static final class C50334a extends Message.Builder<GetReservationRequest, C50334a> {

        /* renamed from: a */
        public String f125714a;

        /* renamed from: a */
        public GetReservationRequest build() {
            String str = this.f125714a;
            if (str != null) {
                return new GetReservationRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mid");
        }

        /* renamed from: a */
        public C50334a mo174555a(String str) {
            this.f125714a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50334a newBuilder() {
        C50334a aVar = new C50334a();
        aVar.f125714a = this.mid;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.mid);
        StringBuilder replace = sb.replace(0, 2, "GetReservationRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetReservationRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetReservationRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mid = str;
    }
}
