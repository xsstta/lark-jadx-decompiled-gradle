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

public final class GetAllTodoViewsResponse extends Message<GetAllTodoViewsResponse, C19507a> {
    public static final ProtoAdapter<GetAllTodoViewsResponse> ADAPTER = new C19508b();
    private static final long serialVersionUID = 0;
    public final List<TodoListView> todo_views;
    public final List<TodoListViewSetting> view_settings;

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetAllTodoViewsResponse$b */
    private static final class C19508b extends ProtoAdapter<GetAllTodoViewsResponse> {
        C19508b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAllTodoViewsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAllTodoViewsResponse getAllTodoViewsResponse) {
            return TodoListView.ADAPTER.asRepeated().encodedSizeWithTag(1, getAllTodoViewsResponse.todo_views) + TodoListViewSetting.ADAPTER.asRepeated().encodedSizeWithTag(2, getAllTodoViewsResponse.view_settings) + getAllTodoViewsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetAllTodoViewsResponse decode(ProtoReader protoReader) throws IOException {
            C19507a aVar = new C19507a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47858a.add(TodoListView.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47859b.add(TodoListViewSetting.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAllTodoViewsResponse getAllTodoViewsResponse) throws IOException {
            TodoListView.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getAllTodoViewsResponse.todo_views);
            TodoListViewSetting.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getAllTodoViewsResponse.view_settings);
            protoWriter.writeBytes(getAllTodoViewsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetAllTodoViewsResponse$a */
    public static final class C19507a extends Message.Builder<GetAllTodoViewsResponse, C19507a> {

        /* renamed from: a */
        public List<TodoListView> f47858a = Internal.newMutableList();

        /* renamed from: b */
        public List<TodoListViewSetting> f47859b = Internal.newMutableList();

        /* renamed from: a */
        public GetAllTodoViewsResponse build() {
            return new GetAllTodoViewsResponse(this.f47858a, this.f47859b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19507a newBuilder() {
        C19507a aVar = new C19507a();
        aVar.f47858a = Internal.copyOf("todo_views", this.todo_views);
        aVar.f47859b = Internal.copyOf("view_settings", this.view_settings);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "GetAllTodoViewsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.todo_views.isEmpty()) {
            sb.append(", todo_views=");
            sb.append(this.todo_views);
        }
        if (!this.view_settings.isEmpty()) {
            sb.append(", view_settings=");
            sb.append(this.view_settings);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAllTodoViewsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetAllTodoViewsResponse(List<TodoListView> list, List<TodoListViewSetting> list2) {
        this(list, list2, ByteString.EMPTY);
    }

    public GetAllTodoViewsResponse(List<TodoListView> list, List<TodoListViewSetting> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todo_views = Internal.immutableCopyOf("todo_views", list);
        this.view_settings = Internal.immutableCopyOf("view_settings", list2);
    }
}
