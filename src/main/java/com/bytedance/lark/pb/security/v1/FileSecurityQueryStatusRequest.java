package com.bytedance.lark.pb.security.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class FileSecurityQueryStatusRequest extends Message<FileSecurityQueryStatusRequest, C19121a> {
    public static final ProtoAdapter<FileSecurityQueryStatusRequest> ADAPTER = new C19122b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.security.v1.FileSecurityQueryStatusRequest$b */
    private static final class C19122b extends ProtoAdapter<FileSecurityQueryStatusRequest> {
        C19122b() {
            super(FieldEncoding.LENGTH_DELIMITED, FileSecurityQueryStatusRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(FileSecurityQueryStatusRequest fileSecurityQueryStatusRequest) {
            return fileSecurityQueryStatusRequest.unknownFields().size();
        }

        /* renamed from: a */
        public FileSecurityQueryStatusRequest decode(ProtoReader protoReader) throws IOException {
            C19121a aVar = new C19121a();
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
        public void encode(ProtoWriter protoWriter, FileSecurityQueryStatusRequest fileSecurityQueryStatusRequest) throws IOException {
            protoWriter.writeBytes(fileSecurityQueryStatusRequest.unknownFields());
        }
    }

    public FileSecurityQueryStatusRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.security.v1.FileSecurityQueryStatusRequest$a */
    public static final class C19121a extends Message.Builder<FileSecurityQueryStatusRequest, C19121a> {
        /* renamed from: a */
        public FileSecurityQueryStatusRequest build() {
            return new FileSecurityQueryStatusRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19121a newBuilder() {
        C19121a aVar = new C19121a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("security", "FileSecurityQueryStatusRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "FileSecurityQueryStatusRequest{");
        replace.append('}');
        return replace.toString();
    }

    public FileSecurityQueryStatusRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
