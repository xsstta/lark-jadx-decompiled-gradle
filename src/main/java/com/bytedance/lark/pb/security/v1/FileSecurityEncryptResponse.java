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

public final class FileSecurityEncryptResponse extends Message<FileSecurityEncryptResponse, C19119a> {
    public static final ProtoAdapter<FileSecurityEncryptResponse> ADAPTER = new C19120b();
    public static final Integer DEFAULT_ERROR = 0;
    private static final long serialVersionUID = 0;
    public final String encrypted_file_path;
    public final Integer error;

    /* renamed from: com.bytedance.lark.pb.security.v1.FileSecurityEncryptResponse$b */
    private static final class C19120b extends ProtoAdapter<FileSecurityEncryptResponse> {
        C19120b() {
            super(FieldEncoding.LENGTH_DELIMITED, FileSecurityEncryptResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(FileSecurityEncryptResponse fileSecurityEncryptResponse) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, fileSecurityEncryptResponse.encrypted_file_path) + ProtoAdapter.INT32.encodedSizeWithTag(2, fileSecurityEncryptResponse.error) + fileSecurityEncryptResponse.unknownFields().size();
        }

        /* renamed from: a */
        public FileSecurityEncryptResponse decode(ProtoReader protoReader) throws IOException {
            C19119a aVar = new C19119a();
            aVar.f47262a = "";
            aVar.f47263b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47262a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47263b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FileSecurityEncryptResponse fileSecurityEncryptResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, fileSecurityEncryptResponse.encrypted_file_path);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, fileSecurityEncryptResponse.error);
            protoWriter.writeBytes(fileSecurityEncryptResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19119a newBuilder() {
        C19119a aVar = new C19119a();
        aVar.f47262a = this.encrypted_file_path;
        aVar.f47263b = this.error;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.security.v1.FileSecurityEncryptResponse$a */
    public static final class C19119a extends Message.Builder<FileSecurityEncryptResponse, C19119a> {

        /* renamed from: a */
        public String f47262a;

        /* renamed from: b */
        public Integer f47263b;

        /* renamed from: a */
        public FileSecurityEncryptResponse build() {
            Integer num;
            String str = this.f47262a;
            if (str != null && (num = this.f47263b) != null) {
                return new FileSecurityEncryptResponse(str, num, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "encrypted_file_path", this.f47263b, "error");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("security", "FileSecurityEncryptResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", encrypted_file_path=");
        sb.append(this.encrypted_file_path);
        sb.append(", error=");
        sb.append(this.error);
        StringBuilder replace = sb.replace(0, 2, "FileSecurityEncryptResponse{");
        replace.append('}');
        return replace.toString();
    }

    public FileSecurityEncryptResponse(String str, Integer num) {
        this(str, num, ByteString.EMPTY);
    }

    public FileSecurityEncryptResponse(String str, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.encrypted_file_path = str;
        this.error = num;
    }
}
