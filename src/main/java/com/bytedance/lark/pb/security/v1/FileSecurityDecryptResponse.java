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

public final class FileSecurityDecryptResponse extends Message<FileSecurityDecryptResponse, C19115a> {
    public static final ProtoAdapter<FileSecurityDecryptResponse> ADAPTER = new C19116b();
    public static final Integer DEFAULT_ERROR = 0;
    private static final long serialVersionUID = 0;
    public final String decrypted_file_path;
    public final Integer error;

    /* renamed from: com.bytedance.lark.pb.security.v1.FileSecurityDecryptResponse$b */
    private static final class C19116b extends ProtoAdapter<FileSecurityDecryptResponse> {
        C19116b() {
            super(FieldEncoding.LENGTH_DELIMITED, FileSecurityDecryptResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(FileSecurityDecryptResponse fileSecurityDecryptResponse) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, fileSecurityDecryptResponse.decrypted_file_path) + ProtoAdapter.INT32.encodedSizeWithTag(2, fileSecurityDecryptResponse.error) + fileSecurityDecryptResponse.unknownFields().size();
        }

        /* renamed from: a */
        public FileSecurityDecryptResponse decode(ProtoReader protoReader) throws IOException {
            C19115a aVar = new C19115a();
            aVar.f47259a = "";
            aVar.f47260b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47259a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47260b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FileSecurityDecryptResponse fileSecurityDecryptResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, fileSecurityDecryptResponse.decrypted_file_path);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, fileSecurityDecryptResponse.error);
            protoWriter.writeBytes(fileSecurityDecryptResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19115a newBuilder() {
        C19115a aVar = new C19115a();
        aVar.f47259a = this.decrypted_file_path;
        aVar.f47260b = this.error;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.security.v1.FileSecurityDecryptResponse$a */
    public static final class C19115a extends Message.Builder<FileSecurityDecryptResponse, C19115a> {

        /* renamed from: a */
        public String f47259a;

        /* renamed from: b */
        public Integer f47260b;

        /* renamed from: a */
        public FileSecurityDecryptResponse build() {
            Integer num;
            String str = this.f47259a;
            if (str != null && (num = this.f47260b) != null) {
                return new FileSecurityDecryptResponse(str, num, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "decrypted_file_path", this.f47260b, "error");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("security", "FileSecurityDecryptResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", decrypted_file_path=");
        sb.append(this.decrypted_file_path);
        sb.append(", error=");
        sb.append(this.error);
        StringBuilder replace = sb.replace(0, 2, "FileSecurityDecryptResponse{");
        replace.append('}');
        return replace.toString();
    }

    public FileSecurityDecryptResponse(String str, Integer num) {
        this(str, num, ByteString.EMPTY);
    }

    public FileSecurityDecryptResponse(String str, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.decrypted_file_path = str;
        this.error = num;
    }
}
