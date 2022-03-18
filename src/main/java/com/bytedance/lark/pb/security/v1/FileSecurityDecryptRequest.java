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

public final class FileSecurityDecryptRequest extends Message<FileSecurityDecryptRequest, C19113a> {
    public static final ProtoAdapter<FileSecurityDecryptRequest> ADAPTER = new C19114b();
    private static final long serialVersionUID = 0;
    public final String file_path;

    /* renamed from: com.bytedance.lark.pb.security.v1.FileSecurityDecryptRequest$b */
    private static final class C19114b extends ProtoAdapter<FileSecurityDecryptRequest> {
        C19114b() {
            super(FieldEncoding.LENGTH_DELIMITED, FileSecurityDecryptRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(FileSecurityDecryptRequest fileSecurityDecryptRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, fileSecurityDecryptRequest.file_path) + fileSecurityDecryptRequest.unknownFields().size();
        }

        /* renamed from: a */
        public FileSecurityDecryptRequest decode(ProtoReader protoReader) throws IOException {
            C19113a aVar = new C19113a();
            aVar.f47258a = "";
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
                    aVar.f47258a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FileSecurityDecryptRequest fileSecurityDecryptRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, fileSecurityDecryptRequest.file_path);
            protoWriter.writeBytes(fileSecurityDecryptRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.security.v1.FileSecurityDecryptRequest$a */
    public static final class C19113a extends Message.Builder<FileSecurityDecryptRequest, C19113a> {

        /* renamed from: a */
        public String f47258a;

        /* renamed from: a */
        public FileSecurityDecryptRequest build() {
            String str = this.f47258a;
            if (str != null) {
                return new FileSecurityDecryptRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "file_path");
        }

        /* renamed from: a */
        public C19113a mo65364a(String str) {
            this.f47258a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19113a newBuilder() {
        C19113a aVar = new C19113a();
        aVar.f47258a = this.file_path;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("security", "FileSecurityDecryptRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", file_path=");
        sb.append(this.file_path);
        StringBuilder replace = sb.replace(0, 2, "FileSecurityDecryptRequest{");
        replace.append('}');
        return replace.toString();
    }

    public FileSecurityDecryptRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public FileSecurityDecryptRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.file_path = str;
    }
}
