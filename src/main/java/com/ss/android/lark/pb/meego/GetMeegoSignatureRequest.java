package com.ss.android.lark.pb.meego;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetMeegoSignatureRequest extends Message<GetMeegoSignatureRequest, C49841a> {
    public static final ProtoAdapter<GetMeegoSignatureRequest> ADAPTER = new C49842b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.meego.GetMeegoSignatureRequest$b */
    private static final class C49842b extends ProtoAdapter<GetMeegoSignatureRequest> {
        C49842b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMeegoSignatureRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMeegoSignatureRequest getMeegoSignatureRequest) {
            return getMeegoSignatureRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetMeegoSignatureRequest decode(ProtoReader protoReader) throws IOException {
            C49841a aVar = new C49841a();
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
        public void encode(ProtoWriter protoWriter, GetMeegoSignatureRequest getMeegoSignatureRequest) throws IOException {
            protoWriter.writeBytes(getMeegoSignatureRequest.unknownFields());
        }
    }

    public GetMeegoSignatureRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.meego.GetMeegoSignatureRequest$a */
    public static final class C49841a extends Message.Builder<GetMeegoSignatureRequest, C49841a> {
        /* renamed from: a */
        public GetMeegoSignatureRequest build() {
            return new GetMeegoSignatureRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49841a newBuilder() {
        C49841a aVar = new C49841a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetMeegoSignatureRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetMeegoSignatureRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
