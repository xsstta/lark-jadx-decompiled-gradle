package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class DeleteQuasiMessageRequest extends Message<DeleteQuasiMessageRequest, C17420a> {
    public static final ProtoAdapter<DeleteQuasiMessageRequest> ADAPTER = new C17421b();
    private static final long serialVersionUID = 0;
    public final String cid;

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteQuasiMessageRequest$b */
    private static final class C17421b extends ProtoAdapter<DeleteQuasiMessageRequest> {
        C17421b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteQuasiMessageRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteQuasiMessageRequest deleteQuasiMessageRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, deleteQuasiMessageRequest.cid) + deleteQuasiMessageRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteQuasiMessageRequest decode(ProtoReader protoReader) throws IOException {
            C17420a aVar = new C17420a();
            aVar.f44323a = "";
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
                    aVar.f44323a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteQuasiMessageRequest deleteQuasiMessageRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deleteQuasiMessageRequest.cid);
            protoWriter.writeBytes(deleteQuasiMessageRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteQuasiMessageRequest$a */
    public static final class C17420a extends Message.Builder<DeleteQuasiMessageRequest, C17420a> {

        /* renamed from: a */
        public String f44323a;

        /* renamed from: a */
        public DeleteQuasiMessageRequest build() {
            String str = this.f44323a;
            if (str != null) {
                return new DeleteQuasiMessageRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "cid");
        }

        /* renamed from: a */
        public C17420a mo61114a(String str) {
            this.f44323a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17420a newBuilder() {
        C17420a aVar = new C17420a();
        aVar.f44323a = this.cid;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "DeleteQuasiMessageRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", cid=");
        sb.append(this.cid);
        StringBuilder replace = sb.replace(0, 2, "DeleteQuasiMessageRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteQuasiMessageRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public DeleteQuasiMessageRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cid = str;
    }
}
