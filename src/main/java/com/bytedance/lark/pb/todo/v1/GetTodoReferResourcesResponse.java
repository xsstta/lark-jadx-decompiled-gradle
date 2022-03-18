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

public final class GetTodoReferResourcesResponse extends Message<GetTodoReferResourcesResponse, C19553a> {
    public static final ProtoAdapter<GetTodoReferResourcesResponse> ADAPTER = new C19554b();
    private static final long serialVersionUID = 0;
    public final List<TodoReferResource> resources;

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodoReferResourcesResponse$b */
    private static final class C19554b extends ProtoAdapter<GetTodoReferResourcesResponse> {
        C19554b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTodoReferResourcesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTodoReferResourcesResponse getTodoReferResourcesResponse) {
            return TodoReferResource.ADAPTER.asRepeated().encodedSizeWithTag(1, getTodoReferResourcesResponse.resources) + getTodoReferResourcesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetTodoReferResourcesResponse decode(ProtoReader protoReader) throws IOException {
            C19553a aVar = new C19553a();
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
                    aVar.f47906a.add(TodoReferResource.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTodoReferResourcesResponse getTodoReferResourcesResponse) throws IOException {
            TodoReferResource.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getTodoReferResourcesResponse.resources);
            protoWriter.writeBytes(getTodoReferResourcesResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodoReferResourcesResponse$a */
    public static final class C19553a extends Message.Builder<GetTodoReferResourcesResponse, C19553a> {

        /* renamed from: a */
        public List<TodoReferResource> f47906a = Internal.newMutableList();

        /* renamed from: a */
        public GetTodoReferResourcesResponse build() {
            return new GetTodoReferResourcesResponse(this.f47906a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19553a newBuilder() {
        C19553a aVar = new C19553a();
        aVar.f47906a = Internal.copyOf("resources", this.resources);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "GetTodoReferResourcesResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.resources.isEmpty()) {
            sb.append(", resources=");
            sb.append(this.resources);
        }
        StringBuilder replace = sb.replace(0, 2, "GetTodoReferResourcesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetTodoReferResourcesResponse(List<TodoReferResource> list) {
        this(list, ByteString.EMPTY);
    }

    public GetTodoReferResourcesResponse(List<TodoReferResource> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resources = Internal.immutableCopyOf("resources", list);
    }
}
