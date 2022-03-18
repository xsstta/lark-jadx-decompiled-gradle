package com.bytedance.lark.pb.todo.v1;

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

public final class GetTodoAssigneesByChatterIdsRequest extends Message<GetTodoAssigneesByChatterIdsRequest, C19535a> {
    public static final ProtoAdapter<GetTodoAssigneesByChatterIdsRequest> ADAPTER = new C19536b();
    private static final long serialVersionUID = 0;
    public final List<String> chatter_ids;

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodoAssigneesByChatterIdsRequest$b */
    private static final class C19536b extends ProtoAdapter<GetTodoAssigneesByChatterIdsRequest> {
        C19536b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTodoAssigneesByChatterIdsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTodoAssigneesByChatterIdsRequest getTodoAssigneesByChatterIdsRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getTodoAssigneesByChatterIdsRequest.chatter_ids) + getTodoAssigneesByChatterIdsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetTodoAssigneesByChatterIdsRequest decode(ProtoReader protoReader) throws IOException {
            C19535a aVar = new C19535a();
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
                    aVar.f47892a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTodoAssigneesByChatterIdsRequest getTodoAssigneesByChatterIdsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getTodoAssigneesByChatterIdsRequest.chatter_ids);
            protoWriter.writeBytes(getTodoAssigneesByChatterIdsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodoAssigneesByChatterIdsRequest$a */
    public static final class C19535a extends Message.Builder<GetTodoAssigneesByChatterIdsRequest, C19535a> {

        /* renamed from: a */
        public List<String> f47892a = Internal.newMutableList();

        /* renamed from: a */
        public GetTodoAssigneesByChatterIdsRequest build() {
            return new GetTodoAssigneesByChatterIdsRequest(this.f47892a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19535a mo66382a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f47892a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19535a newBuilder() {
        C19535a aVar = new C19535a();
        aVar.f47892a = Internal.copyOf("chatter_ids", this.chatter_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "GetTodoAssigneesByChatterIdsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.chatter_ids.isEmpty()) {
            sb.append(", chatter_ids=");
            sb.append(this.chatter_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "GetTodoAssigneesByChatterIdsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetTodoAssigneesByChatterIdsRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public GetTodoAssigneesByChatterIdsRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chatter_ids = Internal.immutableCopyOf("chatter_ids", list);
    }
}
