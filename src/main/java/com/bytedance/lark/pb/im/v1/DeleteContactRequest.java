package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DeleteContactRequest extends Message<DeleteContactRequest, C17402a> {
    public static final ProtoAdapter<DeleteContactRequest> ADAPTER = new C17403b();
    private static final long serialVersionUID = 0;
    public final String user_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteContactRequest$b */
    private static final class C17403b extends ProtoAdapter<DeleteContactRequest> {
        C17403b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteContactRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteContactRequest deleteContactRequest) {
            int i;
            if (deleteContactRequest.user_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, deleteContactRequest.user_id);
            } else {
                i = 0;
            }
            return i + deleteContactRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteContactRequest decode(ProtoReader protoReader) throws IOException {
            C17402a aVar = new C17402a();
            aVar.f44313a = "";
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
                    aVar.f44313a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteContactRequest deleteContactRequest) throws IOException {
            if (deleteContactRequest.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deleteContactRequest.user_id);
            }
            protoWriter.writeBytes(deleteContactRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteContactRequest$a */
    public static final class C17402a extends Message.Builder<DeleteContactRequest, C17402a> {

        /* renamed from: a */
        public String f44313a;

        /* renamed from: a */
        public DeleteContactRequest build() {
            return new DeleteContactRequest(this.f44313a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17402a mo61071a(String str) {
            this.f44313a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17402a newBuilder() {
        C17402a aVar = new C17402a();
        aVar.f44313a = this.user_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "DeleteContactRequest");
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteContactRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteContactRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public DeleteContactRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = str;
    }
}
