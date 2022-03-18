package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetUploadIdResponse extends Message<GetUploadIdResponse, C18268a> {
    public static final ProtoAdapter<GetUploadIdResponse> ADAPTER = new C18269b();
    private static final long serialVersionUID = 0;
    public final String upload_id;

    /* renamed from: com.bytedance.lark.pb.media.v1.GetUploadIdResponse$b */
    private static final class C18269b extends ProtoAdapter<GetUploadIdResponse> {
        C18269b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUploadIdResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUploadIdResponse getUploadIdResponse) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getUploadIdResponse.upload_id) + getUploadIdResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUploadIdResponse decode(ProtoReader protoReader) throws IOException {
            C18268a aVar = new C18268a();
            aVar.f45518a = "";
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
                    aVar.f45518a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUploadIdResponse getUploadIdResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getUploadIdResponse.upload_id);
            protoWriter.writeBytes(getUploadIdResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.GetUploadIdResponse$a */
    public static final class C18268a extends Message.Builder<GetUploadIdResponse, C18268a> {

        /* renamed from: a */
        public String f45518a;

        /* renamed from: a */
        public GetUploadIdResponse build() {
            String str = this.f45518a;
            if (str != null) {
                return new GetUploadIdResponse(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "upload_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C18268a newBuilder() {
        C18268a aVar = new C18268a();
        aVar.f45518a = this.upload_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "GetUploadIdResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", upload_id=");
        sb.append(this.upload_id);
        StringBuilder replace = sb.replace(0, 2, "GetUploadIdResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUploadIdResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetUploadIdResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.upload_id = str;
    }
}
