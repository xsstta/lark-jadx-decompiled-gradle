package com.bytedance.lark.pb.moments.v1;

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

public final class DeletePostRequest extends Message<DeletePostRequest, C18360a> {
    public static final ProtoAdapter<DeletePostRequest> ADAPTER = new C18361b();
    private static final long serialVersionUID = 0;
    public final String post_id;
    public final List<String> push_category_ids;

    /* renamed from: com.bytedance.lark.pb.moments.v1.DeletePostRequest$b */
    private static final class C18361b extends ProtoAdapter<DeletePostRequest> {
        C18361b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeletePostRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeletePostRequest deletePostRequest) {
            int i;
            if (deletePostRequest.post_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, deletePostRequest.post_id);
            } else {
                i = 0;
            }
            return i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(101, deletePostRequest.push_category_ids) + deletePostRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeletePostRequest decode(ProtoReader protoReader) throws IOException {
            C18360a aVar = new C18360a();
            aVar.f45732a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45732a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 101) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45733b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeletePostRequest deletePostRequest) throws IOException {
            if (deletePostRequest.post_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deletePostRequest.post_id);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 101, deletePostRequest.push_category_ids);
            protoWriter.writeBytes(deletePostRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.DeletePostRequest$a */
    public static final class C18360a extends Message.Builder<DeletePostRequest, C18360a> {

        /* renamed from: a */
        public String f45732a;

        /* renamed from: b */
        public List<String> f45733b = Internal.newMutableList();

        /* renamed from: a */
        public DeletePostRequest build() {
            return new DeletePostRequest(this.f45732a, this.f45733b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18360a mo63526a(String str) {
            this.f45732a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18360a newBuilder() {
        C18360a aVar = new C18360a();
        aVar.f45732a = this.post_id;
        aVar.f45733b = Internal.copyOf("push_category_ids", this.push_category_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "DeletePostRequest");
        StringBuilder sb = new StringBuilder();
        if (this.post_id != null) {
            sb.append(", post_id=");
            sb.append(this.post_id);
        }
        if (!this.push_category_ids.isEmpty()) {
            sb.append(", push_category_ids=");
            sb.append(this.push_category_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "DeletePostRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeletePostRequest(String str, List<String> list) {
        this(str, list, ByteString.EMPTY);
    }

    public DeletePostRequest(String str, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.post_id = str;
        this.push_category_ids = Internal.immutableCopyOf("push_category_ids", list);
    }
}
