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

public final class PushTodoViewsChangedNotification extends Message<PushTodoViewsChangedNotification, C19607a> {
    public static final ProtoAdapter<PushTodoViewsChangedNotification> ADAPTER = new C19608b();
    private static final long serialVersionUID = 0;
    public final List<TodoListView> changed_todo_views;

    /* renamed from: com.bytedance.lark.pb.todo.v1.PushTodoViewsChangedNotification$b */
    private static final class C19608b extends ProtoAdapter<PushTodoViewsChangedNotification> {
        C19608b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushTodoViewsChangedNotification.class);
        }

        /* renamed from: a */
        public int encodedSize(PushTodoViewsChangedNotification pushTodoViewsChangedNotification) {
            return TodoListView.ADAPTER.asRepeated().encodedSizeWithTag(1, pushTodoViewsChangedNotification.changed_todo_views) + pushTodoViewsChangedNotification.unknownFields().size();
        }

        /* renamed from: a */
        public PushTodoViewsChangedNotification decode(ProtoReader protoReader) throws IOException {
            C19607a aVar = new C19607a();
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
                    aVar.f47960a.add(TodoListView.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushTodoViewsChangedNotification pushTodoViewsChangedNotification) throws IOException {
            TodoListView.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pushTodoViewsChangedNotification.changed_todo_views);
            protoWriter.writeBytes(pushTodoViewsChangedNotification.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.PushTodoViewsChangedNotification$a */
    public static final class C19607a extends Message.Builder<PushTodoViewsChangedNotification, C19607a> {

        /* renamed from: a */
        public List<TodoListView> f47960a = Internal.newMutableList();

        /* renamed from: a */
        public PushTodoViewsChangedNotification build() {
            return new PushTodoViewsChangedNotification(this.f47960a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19607a newBuilder() {
        C19607a aVar = new C19607a();
        aVar.f47960a = Internal.copyOf("changed_todo_views", this.changed_todo_views);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "PushTodoViewsChangedNotification");
        StringBuilder sb = new StringBuilder();
        if (!this.changed_todo_views.isEmpty()) {
            sb.append(", changed_todo_views=");
            sb.append(this.changed_todo_views);
        }
        StringBuilder replace = sb.replace(0, 2, "PushTodoViewsChangedNotification{");
        replace.append('}');
        return replace.toString();
    }

    public PushTodoViewsChangedNotification(List<TodoListView> list) {
        this(list, ByteString.EMPTY);
    }

    public PushTodoViewsChangedNotification(List<TodoListView> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.changed_todo_views = Internal.immutableCopyOf("changed_todo_views", list);
    }
}
