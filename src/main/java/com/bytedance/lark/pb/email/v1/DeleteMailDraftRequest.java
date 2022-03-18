package com.bytedance.lark.pb.email.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DeleteMailDraftRequest extends Message<DeleteMailDraftRequest, C17002a> {
    public static final ProtoAdapter<DeleteMailDraftRequest> ADAPTER = new C17003b();
    private static final long serialVersionUID = 0;
    public final String message_id;
    public final String thread_id;

    /* renamed from: com.bytedance.lark.pb.email.v1.DeleteMailDraftRequest$b */
    private static final class C17003b extends ProtoAdapter<DeleteMailDraftRequest> {
        C17003b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteMailDraftRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteMailDraftRequest deleteMailDraftRequest) {
            int i;
            int i2 = 0;
            if (deleteMailDraftRequest.message_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, deleteMailDraftRequest.message_id);
            } else {
                i = 0;
            }
            if (deleteMailDraftRequest.thread_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, deleteMailDraftRequest.thread_id);
            }
            return i + i2 + deleteMailDraftRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteMailDraftRequest decode(ProtoReader protoReader) throws IOException {
            C17002a aVar = new C17002a();
            aVar.f43640a = "";
            aVar.f43641b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43640a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43641b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteMailDraftRequest deleteMailDraftRequest) throws IOException {
            if (deleteMailDraftRequest.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deleteMailDraftRequest.message_id);
            }
            if (deleteMailDraftRequest.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, deleteMailDraftRequest.thread_id);
            }
            protoWriter.writeBytes(deleteMailDraftRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.DeleteMailDraftRequest$a */
    public static final class C17002a extends Message.Builder<DeleteMailDraftRequest, C17002a> {

        /* renamed from: a */
        public String f43640a;

        /* renamed from: b */
        public String f43641b;

        /* renamed from: a */
        public DeleteMailDraftRequest build() {
            return new DeleteMailDraftRequest(this.f43640a, this.f43641b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17002a mo60066a(String str) {
            this.f43640a = str;
            return this;
        }

        /* renamed from: b */
        public C17002a mo60068b(String str) {
            this.f43641b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17002a newBuilder() {
        C17002a aVar = new C17002a();
        aVar.f43640a = this.message_id;
        aVar.f43641b = this.thread_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "DeleteMailDraftRequest");
        StringBuilder sb = new StringBuilder();
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteMailDraftRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteMailDraftRequest(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public DeleteMailDraftRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.thread_id = str2;
    }
}
