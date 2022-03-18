package com.ss.android.lark.pb.meego;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetMeegoSignatureResponse extends Message<GetMeegoSignatureResponse, C49843a> {
    public static final ProtoAdapter<GetMeegoSignatureResponse> ADAPTER = new C49844b();
    private static final long serialVersionUID = 0;
    public final String msignature;

    /* renamed from: com.ss.android.lark.pb.meego.GetMeegoSignatureResponse$b */
    private static final class C49844b extends ProtoAdapter<GetMeegoSignatureResponse> {
        C49844b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMeegoSignatureResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMeegoSignatureResponse getMeegoSignatureResponse) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getMeegoSignatureResponse.msignature) + getMeegoSignatureResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetMeegoSignatureResponse decode(ProtoReader protoReader) throws IOException {
            C49843a aVar = new C49843a();
            aVar.f124787a = "";
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
                    aVar.f124787a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMeegoSignatureResponse getMeegoSignatureResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getMeegoSignatureResponse.msignature);
            protoWriter.writeBytes(getMeegoSignatureResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.meego.GetMeegoSignatureResponse$a */
    public static final class C49843a extends Message.Builder<GetMeegoSignatureResponse, C49843a> {

        /* renamed from: a */
        public String f124787a;

        /* renamed from: a */
        public GetMeegoSignatureResponse build() {
            String str = this.f124787a;
            if (str != null) {
                return new GetMeegoSignatureResponse(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "msignature");
        }
    }

    @Override // com.squareup.wire.Message
    public C49843a newBuilder() {
        C49843a aVar = new C49843a();
        aVar.f124787a = this.msignature;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", signature=");
        sb.append(this.msignature);
        StringBuilder replace = sb.replace(0, 2, "GetMeegoSignatureResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetMeegoSignatureResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetMeegoSignatureResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.msignature = str;
    }
}
