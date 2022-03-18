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

public final class FileSecurityWriteBackRequest extends Message<FileSecurityWriteBackRequest, C19125a> {
    public static final ProtoAdapter<FileSecurityWriteBackRequest> ADAPTER = new C19126b();
    private static final long serialVersionUID = 0;
    public final String stage_path;

    /* renamed from: com.bytedance.lark.pb.security.v1.FileSecurityWriteBackRequest$b */
    private static final class C19126b extends ProtoAdapter<FileSecurityWriteBackRequest> {
        C19126b() {
            super(FieldEncoding.LENGTH_DELIMITED, FileSecurityWriteBackRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(FileSecurityWriteBackRequest fileSecurityWriteBackRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, fileSecurityWriteBackRequest.stage_path) + fileSecurityWriteBackRequest.unknownFields().size();
        }

        /* renamed from: a */
        public FileSecurityWriteBackRequest decode(ProtoReader protoReader) throws IOException {
            C19125a aVar = new C19125a();
            aVar.f47265a = "";
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
                    aVar.f47265a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FileSecurityWriteBackRequest fileSecurityWriteBackRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, fileSecurityWriteBackRequest.stage_path);
            protoWriter.writeBytes(fileSecurityWriteBackRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.security.v1.FileSecurityWriteBackRequest$a */
    public static final class C19125a extends Message.Builder<FileSecurityWriteBackRequest, C19125a> {

        /* renamed from: a */
        public String f47265a;

        /* renamed from: a */
        public FileSecurityWriteBackRequest build() {
            String str = this.f47265a;
            if (str != null) {
                return new FileSecurityWriteBackRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "stage_path");
        }

        /* renamed from: a */
        public C19125a mo65390a(String str) {
            this.f47265a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19125a newBuilder() {
        C19125a aVar = new C19125a();
        aVar.f47265a = this.stage_path;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("security", "FileSecurityWriteBackRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", stage_path=");
        sb.append(this.stage_path);
        StringBuilder replace = sb.replace(0, 2, "FileSecurityWriteBackRequest{");
        replace.append('}');
        return replace.toString();
    }

    public FileSecurityWriteBackRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public FileSecurityWriteBackRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.stage_path = str;
    }
}
