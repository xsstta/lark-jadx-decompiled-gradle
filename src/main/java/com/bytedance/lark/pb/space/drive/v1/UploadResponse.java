package com.bytedance.lark.pb.space.drive.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UploadResponse extends Message<UploadResponse, C19407a> {
    public static final ProtoAdapter<UploadResponse> ADAPTER = new C19408b();
    private static final long serialVersionUID = 0;
    public final String key;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.UploadResponse$b */
    private static final class C19408b extends ProtoAdapter<UploadResponse> {
        C19408b() {
            super(FieldEncoding.LENGTH_DELIMITED, UploadResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UploadResponse uploadResponse) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, uploadResponse.key) + uploadResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UploadResponse decode(ProtoReader protoReader) throws IOException {
            C19407a aVar = new C19407a();
            aVar.f47732a = "";
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
                    aVar.f47732a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UploadResponse uploadResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, uploadResponse.key);
            protoWriter.writeBytes(uploadResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.UploadResponse$a */
    public static final class C19407a extends Message.Builder<UploadResponse, C19407a> {

        /* renamed from: a */
        public String f47732a;

        /* renamed from: a */
        public UploadResponse build() {
            String str = this.f47732a;
            if (str != null) {
                return new UploadResponse(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "key");
        }
    }

    @Override // com.squareup.wire.Message
    public C19407a newBuilder() {
        C19407a aVar = new C19407a();
        aVar.f47732a = this.key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "UploadResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        StringBuilder replace = sb.replace(0, 2, "UploadResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UploadResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public UploadResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
    }
}
