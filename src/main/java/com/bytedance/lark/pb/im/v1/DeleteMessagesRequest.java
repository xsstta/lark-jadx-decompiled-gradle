package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class DeleteMessagesRequest extends Message<DeleteMessagesRequest, C17414a> {
    public static final ProtoAdapter<DeleteMessagesRequest> ADAPTER = new C17415b();
    private static final long serialVersionUID = 0;
    public final String cid;
    public final List<String> ids;

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteMessagesRequest$b */
    private static final class C17415b extends ProtoAdapter<DeleteMessagesRequest> {
        C17415b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteMessagesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteMessagesRequest deleteMessagesRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, deleteMessagesRequest.ids);
            if (deleteMessagesRequest.cid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, deleteMessagesRequest.cid);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + deleteMessagesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteMessagesRequest decode(ProtoReader protoReader) throws IOException {
            C17414a aVar = new C17414a();
            aVar.f44320b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44319a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44320b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteMessagesRequest deleteMessagesRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, deleteMessagesRequest.ids);
            if (deleteMessagesRequest.cid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, deleteMessagesRequest.cid);
            }
            protoWriter.writeBytes(deleteMessagesRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteMessagesRequest$a */
    public static final class C17414a extends Message.Builder<DeleteMessagesRequest, C17414a> {

        /* renamed from: a */
        public List<String> f44319a = Internal.newMutableList();

        /* renamed from: b */
        public String f44320b;

        /* renamed from: a */
        public DeleteMessagesRequest build() {
            return new DeleteMessagesRequest(this.f44319a, this.f44320b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17414a mo61100a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44319a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17414a newBuilder() {
        C17414a aVar = new C17414a();
        aVar.f44319a = Internal.copyOf("ids", this.ids);
        aVar.f44320b = this.cid;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "DeleteMessagesRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.ids.isEmpty()) {
            sb.append(", ids=");
            sb.append(this.ids);
        }
        if (this.cid != null) {
            sb.append(", cid=");
            sb.append(this.cid);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteMessagesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteMessagesRequest(List<String> list, String str) {
        this(list, str, ByteString.EMPTY);
    }

    public DeleteMessagesRequest(List<String> list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ids = Internal.immutableCopyOf("ids", list);
        this.cid = str;
    }
}
