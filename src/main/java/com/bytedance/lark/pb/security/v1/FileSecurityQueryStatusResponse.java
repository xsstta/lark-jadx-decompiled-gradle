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

public final class FileSecurityQueryStatusResponse extends Message<FileSecurityQueryStatusResponse, C19123a> {
    public static final ProtoAdapter<FileSecurityQueryStatusResponse> ADAPTER = new C19124b();
    public static final Integer DEFAULT_MODE = 0;
    private static final long serialVersionUID = 0;
    public final Integer mode;

    /* renamed from: com.bytedance.lark.pb.security.v1.FileSecurityQueryStatusResponse$b */
    private static final class C19124b extends ProtoAdapter<FileSecurityQueryStatusResponse> {
        C19124b() {
            super(FieldEncoding.LENGTH_DELIMITED, FileSecurityQueryStatusResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(FileSecurityQueryStatusResponse fileSecurityQueryStatusResponse) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, fileSecurityQueryStatusResponse.mode) + fileSecurityQueryStatusResponse.unknownFields().size();
        }

        /* renamed from: a */
        public FileSecurityQueryStatusResponse decode(ProtoReader protoReader) throws IOException {
            C19123a aVar = new C19123a();
            aVar.f47264a = 0;
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
                    aVar.f47264a = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FileSecurityQueryStatusResponse fileSecurityQueryStatusResponse) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, fileSecurityQueryStatusResponse.mode);
            protoWriter.writeBytes(fileSecurityQueryStatusResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.security.v1.FileSecurityQueryStatusResponse$a */
    public static final class C19123a extends Message.Builder<FileSecurityQueryStatusResponse, C19123a> {

        /* renamed from: a */
        public Integer f47264a;

        /* renamed from: a */
        public FileSecurityQueryStatusResponse build() {
            Integer num = this.f47264a;
            if (num != null) {
                return new FileSecurityQueryStatusResponse(num, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num, "mode");
        }
    }

    @Override // com.squareup.wire.Message
    public C19123a newBuilder() {
        C19123a aVar = new C19123a();
        aVar.f47264a = this.mode;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("security", "FileSecurityQueryStatusResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", mode=");
        sb.append(this.mode);
        StringBuilder replace = sb.replace(0, 2, "FileSecurityQueryStatusResponse{");
        replace.append('}');
        return replace.toString();
    }

    public FileSecurityQueryStatusResponse(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public FileSecurityQueryStatusResponse(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mode = num;
    }
}
