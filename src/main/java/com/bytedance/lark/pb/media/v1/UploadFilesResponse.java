package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UploadFilesResponse extends Message<UploadFilesResponse, C18302a> {
    public static final ProtoAdapter<UploadFilesResponse> ADAPTER = new C18303b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.media.v1.UploadFilesResponse$b */
    private static final class C18303b extends ProtoAdapter<UploadFilesResponse> {
        C18303b() {
            super(FieldEncoding.LENGTH_DELIMITED, UploadFilesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UploadFilesResponse uploadFilesResponse) {
            return uploadFilesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UploadFilesResponse decode(ProtoReader protoReader) throws IOException {
            C18302a aVar = new C18302a();
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
        public void encode(ProtoWriter protoWriter, UploadFilesResponse uploadFilesResponse) throws IOException {
            protoWriter.writeBytes(uploadFilesResponse.unknownFields());
        }
    }

    public UploadFilesResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.UploadFilesResponse$a */
    public static final class C18302a extends Message.Builder<UploadFilesResponse, C18302a> {
        /* renamed from: a */
        public UploadFilesResponse build() {
            return new UploadFilesResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18302a newBuilder() {
        C18302a aVar = new C18302a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "UploadFilesResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "UploadFilesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UploadFilesResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
