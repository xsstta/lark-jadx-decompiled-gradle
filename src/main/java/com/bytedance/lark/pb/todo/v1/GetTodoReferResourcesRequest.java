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

public final class GetTodoReferResourcesRequest extends Message<GetTodoReferResourcesRequest, C19551a> {
    public static final ProtoAdapter<GetTodoReferResourcesRequest> ADAPTER = new C19552b();
    private static final long serialVersionUID = 0;
    public final List<String> resource_ids;

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodoReferResourcesRequest$b */
    private static final class C19552b extends ProtoAdapter<GetTodoReferResourcesRequest> {
        C19552b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTodoReferResourcesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTodoReferResourcesRequest getTodoReferResourcesRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getTodoReferResourcesRequest.resource_ids) + getTodoReferResourcesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetTodoReferResourcesRequest decode(ProtoReader protoReader) throws IOException {
            C19551a aVar = new C19551a();
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
                    aVar.f47905a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTodoReferResourcesRequest getTodoReferResourcesRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getTodoReferResourcesRequest.resource_ids);
            protoWriter.writeBytes(getTodoReferResourcesRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodoReferResourcesRequest$a */
    public static final class C19551a extends Message.Builder<GetTodoReferResourcesRequest, C19551a> {

        /* renamed from: a */
        public List<String> f47905a = Internal.newMutableList();

        /* renamed from: a */
        public GetTodoReferResourcesRequest build() {
            return new GetTodoReferResourcesRequest(this.f47905a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19551a mo66420a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f47905a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19551a newBuilder() {
        C19551a aVar = new C19551a();
        aVar.f47905a = Internal.copyOf("resource_ids", this.resource_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "GetTodoReferResourcesRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.resource_ids.isEmpty()) {
            sb.append(", resource_ids=");
            sb.append(this.resource_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "GetTodoReferResourcesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetTodoReferResourcesRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public GetTodoReferResourcesRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resource_ids = Internal.immutableCopyOf("resource_ids", list);
    }
}
