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

public final class FileSecurityEncryptRequest extends Message<FileSecurityEncryptRequest, C19117a> {
    public static final ProtoAdapter<FileSecurityEncryptRequest> ADAPTER = new C19118b();
    private static final long serialVersionUID = 0;
    public final String file_path;

    /* renamed from: com.bytedance.lark.pb.security.v1.FileSecurityEncryptRequest$b */
    private static final class C19118b extends ProtoAdapter<FileSecurityEncryptRequest> {
        C19118b() {
            super(FieldEncoding.LENGTH_DELIMITED, FileSecurityEncryptRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(FileSecurityEncryptRequest fileSecurityEncryptRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, fileSecurityEncryptRequest.file_path) + fileSecurityEncryptRequest.unknownFields().size();
        }

        /* renamed from: a */
        public FileSecurityEncryptRequest decode(ProtoReader protoReader) throws IOException {
            C19117a aVar = new C19117a();
            aVar.f47261a = "";
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
                    aVar.f47261a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FileSecurityEncryptRequest fileSecurityEncryptRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, fileSecurityEncryptRequest.file_path);
            protoWriter.writeBytes(fileSecurityEncryptRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.security.v1.FileSecurityEncryptRequest$a */
    public static final class C19117a extends Message.Builder<FileSecurityEncryptRequest, C19117a> {

        /* renamed from: a */
        public String f47261a;

        /* renamed from: a */
        public FileSecurityEncryptRequest build() {
            String str = this.f47261a;
            if (str != null) {
                return new FileSecurityEncryptRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "file_path");
        }

        /* renamed from: a */
        public C19117a mo65373a(String str) {
            this.f47261a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19117a newBuilder() {
        C19117a aVar = new C19117a();
        aVar.f47261a = this.file_path;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("security", "FileSecurityEncryptRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", file_path=");
        sb.append(this.file_path);
        StringBuilder replace = sb.replace(0, 2, "FileSecurityEncryptRequest{");
        replace.append('}');
        return replace.toString();
    }

    public FileSecurityEncryptRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public FileSecurityEncryptRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.file_path = str;
    }
}
