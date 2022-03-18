package com.bytedance.lark.pb.security.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class FileSecurityWriteBackResponse extends Message<FileSecurityWriteBackResponse, C19127a> {
    public static final ProtoAdapter<FileSecurityWriteBackResponse> ADAPTER = new C19128b();
    public static final Integer DEFAULT_ERROR = 0;
    private static final long serialVersionUID = 0;
    public final String encrypted_path;
    public final Integer error;

    /* renamed from: com.bytedance.lark.pb.security.v1.FileSecurityWriteBackResponse$b */
    private static final class C19128b extends ProtoAdapter<FileSecurityWriteBackResponse> {
        C19128b() {
            super(FieldEncoding.LENGTH_DELIMITED, FileSecurityWriteBackResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(FileSecurityWriteBackResponse fileSecurityWriteBackResponse) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, fileSecurityWriteBackResponse.encrypted_path) + ProtoAdapter.INT32.encodedSizeWithTag(2, fileSecurityWriteBackResponse.error) + fileSecurityWriteBackResponse.unknownFields().size();
        }

        /* renamed from: a */
        public FileSecurityWriteBackResponse decode(ProtoReader protoReader) throws IOException {
            C19127a aVar = new C19127a();
            aVar.f47266a = "";
            aVar.f47267b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47266a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47267b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FileSecurityWriteBackResponse fileSecurityWriteBackResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, fileSecurityWriteBackResponse.encrypted_path);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, fileSecurityWriteBackResponse.error);
            protoWriter.writeBytes(fileSecurityWriteBackResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19127a newBuilder() {
        C19127a aVar = new C19127a();
        aVar.f47266a = this.encrypted_path;
        aVar.f47267b = this.error;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.security.v1.FileSecurityWriteBackResponse$a */
    public static final class C19127a extends Message.Builder<FileSecurityWriteBackResponse, C19127a> {

        /* renamed from: a */
        public String f47266a;

        /* renamed from: b */
        public Integer f47267b;

        /* renamed from: a */
        public FileSecurityWriteBackResponse build() {
            Integer num;
            String str = this.f47266a;
            if (str != null && (num = this.f47267b) != null) {
                return new FileSecurityWriteBackResponse(str, num, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "encrypted_path", this.f47267b, "error");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("security", "FileSecurityWriteBackResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", encrypted_path=");
        sb.append(this.encrypted_path);
        sb.append(", error=");
        sb.append(this.error);
        StringBuilder replace = sb.replace(0, 2, "FileSecurityWriteBackResponse{");
        replace.append('}');
        return replace.toString();
    }

    public FileSecurityWriteBackResponse(String str, Integer num) {
        this(str, num, ByteString.EMPTY);
    }

    public FileSecurityWriteBackResponse(String str, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.encrypted_path = str;
        this.error = num;
    }
}
