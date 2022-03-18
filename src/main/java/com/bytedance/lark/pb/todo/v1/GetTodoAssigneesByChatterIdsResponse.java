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

public final class GetTodoAssigneesByChatterIdsResponse extends Message<GetTodoAssigneesByChatterIdsResponse, C19537a> {
    public static final ProtoAdapter<GetTodoAssigneesByChatterIdsResponse> ADAPTER = new C19538b();
    private static final long serialVersionUID = 0;
    public final List<TodoAssignee> assignees;

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodoAssigneesByChatterIdsResponse$b */
    private static final class C19538b extends ProtoAdapter<GetTodoAssigneesByChatterIdsResponse> {
        C19538b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTodoAssigneesByChatterIdsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTodoAssigneesByChatterIdsResponse getTodoAssigneesByChatterIdsResponse) {
            return TodoAssignee.ADAPTER.asRepeated().encodedSizeWithTag(2, getTodoAssigneesByChatterIdsResponse.assignees) + getTodoAssigneesByChatterIdsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetTodoAssigneesByChatterIdsResponse decode(ProtoReader protoReader) throws IOException {
            C19537a aVar = new C19537a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47893a.add(TodoAssignee.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTodoAssigneesByChatterIdsResponse getTodoAssigneesByChatterIdsResponse) throws IOException {
            TodoAssignee.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getTodoAssigneesByChatterIdsResponse.assignees);
            protoWriter.writeBytes(getTodoAssigneesByChatterIdsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodoAssigneesByChatterIdsResponse$a */
    public static final class C19537a extends Message.Builder<GetTodoAssigneesByChatterIdsResponse, C19537a> {

        /* renamed from: a */
        public List<TodoAssignee> f47893a = Internal.newMutableList();

        /* renamed from: a */
        public GetTodoAssigneesByChatterIdsResponse build() {
            return new GetTodoAssigneesByChatterIdsResponse(this.f47893a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19537a newBuilder() {
        C19537a aVar = new C19537a();
        aVar.f47893a = Internal.copyOf("assignees", this.assignees);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "GetTodoAssigneesByChatterIdsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.assignees.isEmpty()) {
            sb.append(", assignees=");
            sb.append(this.assignees);
        }
        StringBuilder replace = sb.replace(0, 2, "GetTodoAssigneesByChatterIdsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetTodoAssigneesByChatterIdsResponse(List<TodoAssignee> list) {
        this(list, ByteString.EMPTY);
    }

    public GetTodoAssigneesByChatterIdsResponse(List<TodoAssignee> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.assignees = Internal.immutableCopyOf("assignees", list);
    }
}
