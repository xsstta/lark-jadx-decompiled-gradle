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

public final class DeleteUploadResourceRequest extends Message<DeleteUploadResourceRequest, C19333a> {
    public static final ProtoAdapter<DeleteUploadResourceRequest> ADAPTER = new C19334b();
    private static final long serialVersionUID = 0;
    public final String key;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DeleteUploadResourceRequest$b */
    private static final class C19334b extends ProtoAdapter<DeleteUploadResourceRequest> {
        C19334b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteUploadResourceRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteUploadResourceRequest deleteUploadResourceRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, deleteUploadResourceRequest.key) + deleteUploadResourceRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteUploadResourceRequest decode(ProtoReader protoReader) throws IOException {
            C19333a aVar = new C19333a();
            aVar.f47527a = "";
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
                    aVar.f47527a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteUploadResourceRequest deleteUploadResourceRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deleteUploadResourceRequest.key);
            protoWriter.writeBytes(deleteUploadResourceRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DeleteUploadResourceRequest$a */
    public static final class C19333a extends Message.Builder<DeleteUploadResourceRequest, C19333a> {

        /* renamed from: a */
        public String f47527a;

        /* renamed from: a */
        public DeleteUploadResourceRequest build() {
            String str = this.f47527a;
            if (str != null) {
                return new DeleteUploadResourceRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "key");
        }

        /* renamed from: a */
        public C19333a mo65884a(String str) {
            this.f47527a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19333a newBuilder() {
        C19333a aVar = new C19333a();
        aVar.f47527a = this.key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "DeleteUploadResourceRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        StringBuilder replace = sb.replace(0, 2, "DeleteUploadResourceRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteUploadResourceRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public DeleteUploadResourceRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
    }
}
