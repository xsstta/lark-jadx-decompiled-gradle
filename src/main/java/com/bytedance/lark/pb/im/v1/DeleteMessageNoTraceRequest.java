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

public final class DeleteMessageNoTraceRequest extends Message<DeleteMessageNoTraceRequest, C17412a> {
    public static final ProtoAdapter<DeleteMessageNoTraceRequest> ADAPTER = new C17413b();
    private static final long serialVersionUID = 0;
    public final String message_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteMessageNoTraceRequest$b */
    private static final class C17413b extends ProtoAdapter<DeleteMessageNoTraceRequest> {
        C17413b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteMessageNoTraceRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteMessageNoTraceRequest deleteMessageNoTraceRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, deleteMessageNoTraceRequest.message_id) + deleteMessageNoTraceRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteMessageNoTraceRequest decode(ProtoReader protoReader) throws IOException {
            C17412a aVar = new C17412a();
            aVar.f44318a = "";
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
                    aVar.f44318a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteMessageNoTraceRequest deleteMessageNoTraceRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deleteMessageNoTraceRequest.message_id);
            protoWriter.writeBytes(deleteMessageNoTraceRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteMessageNoTraceRequest$a */
    public static final class C17412a extends Message.Builder<DeleteMessageNoTraceRequest, C17412a> {

        /* renamed from: a */
        public String f44318a;

        /* renamed from: a */
        public DeleteMessageNoTraceRequest build() {
            String str = this.f44318a;
            if (str != null) {
                return new DeleteMessageNoTraceRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "message_id");
        }

        /* renamed from: a */
        public C17412a mo61095a(String str) {
            this.f44318a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17412a newBuilder() {
        C17412a aVar = new C17412a();
        aVar.f44318a = this.message_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "DeleteMessageNoTraceRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", message_id=");
        sb.append(this.message_id);
        StringBuilder replace = sb.replace(0, 2, "DeleteMessageNoTraceRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteMessageNoTraceRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public DeleteMessageNoTraceRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
    }
}
