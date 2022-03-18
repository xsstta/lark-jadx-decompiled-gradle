package com.bytedance.lark.pb.contact.v1;

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

public final class DeleteUserCustomStatusRequest extends Message<DeleteUserCustomStatusRequest, C16162a> {
    public static final ProtoAdapter<DeleteUserCustomStatusRequest> ADAPTER = new C16163b();
    private static final long serialVersionUID = 0;
    public final List<Long> delete_ids;

    /* renamed from: com.bytedance.lark.pb.contact.v1.DeleteUserCustomStatusRequest$b */
    private static final class C16163b extends ProtoAdapter<DeleteUserCustomStatusRequest> {
        C16163b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteUserCustomStatusRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteUserCustomStatusRequest deleteUserCustomStatusRequest) {
            return ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(1, deleteUserCustomStatusRequest.delete_ids) + deleteUserCustomStatusRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteUserCustomStatusRequest decode(ProtoReader protoReader) throws IOException {
            C16162a aVar = new C16162a();
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
                    aVar.f42280a.add(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteUserCustomStatusRequest deleteUserCustomStatusRequest) throws IOException {
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 1, deleteUserCustomStatusRequest.delete_ids);
            protoWriter.writeBytes(deleteUserCustomStatusRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.DeleteUserCustomStatusRequest$a */
    public static final class C16162a extends Message.Builder<DeleteUserCustomStatusRequest, C16162a> {

        /* renamed from: a */
        public List<Long> f42280a = Internal.newMutableList();

        /* renamed from: a */
        public DeleteUserCustomStatusRequest build() {
            return new DeleteUserCustomStatusRequest(this.f42280a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16162a mo57990a(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.f42280a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16162a newBuilder() {
        C16162a aVar = new C16162a();
        aVar.f42280a = Internal.copyOf("delete_ids", this.delete_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "DeleteUserCustomStatusRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.delete_ids.isEmpty()) {
            sb.append(", delete_ids=");
            sb.append(this.delete_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteUserCustomStatusRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteUserCustomStatusRequest(List<Long> list) {
        this(list, ByteString.EMPTY);
    }

    public DeleteUserCustomStatusRequest(List<Long> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.delete_ids = Internal.immutableCopyOf("delete_ids", list);
    }
}
