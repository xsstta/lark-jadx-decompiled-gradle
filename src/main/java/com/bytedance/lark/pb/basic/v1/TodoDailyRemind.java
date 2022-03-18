package com.bytedance.lark.pb.basic.v1;

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

public final class TodoDailyRemind extends Message<TodoDailyRemind, C15334a> {
    public static final ProtoAdapter<TodoDailyRemind> ADAPTER = new C15335b();
    private static final long serialVersionUID = 0;
    public final List<TodoDetail> todos;

    /* renamed from: com.bytedance.lark.pb.basic.v1.TodoDailyRemind$b */
    private static final class C15335b extends ProtoAdapter<TodoDailyRemind> {
        C15335b() {
            super(FieldEncoding.LENGTH_DELIMITED, TodoDailyRemind.class);
        }

        /* renamed from: a */
        public int encodedSize(TodoDailyRemind todoDailyRemind) {
            return TodoDetail.ADAPTER.asRepeated().encodedSizeWithTag(1, todoDailyRemind.todos) + todoDailyRemind.unknownFields().size();
        }

        /* renamed from: a */
        public TodoDailyRemind decode(ProtoReader protoReader) throws IOException {
            C15334a aVar = new C15334a();
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
                    aVar.f40615a.add(TodoDetail.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TodoDailyRemind todoDailyRemind) throws IOException {
            TodoDetail.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, todoDailyRemind.todos);
            protoWriter.writeBytes(todoDailyRemind.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.TodoDailyRemind$a */
    public static final class C15334a extends Message.Builder<TodoDailyRemind, C15334a> {

        /* renamed from: a */
        public List<TodoDetail> f40615a = Internal.newMutableList();

        /* renamed from: a */
        public TodoDailyRemind build() {
            return new TodoDailyRemind(this.f40615a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15334a newBuilder() {
        C15334a aVar = new C15334a();
        aVar.f40615a = Internal.copyOf("todos", this.todos);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "TodoDailyRemind");
        StringBuilder sb = new StringBuilder();
        if (!this.todos.isEmpty()) {
            sb.append(", todos=");
            sb.append(this.todos);
        }
        StringBuilder replace = sb.replace(0, 2, "TodoDailyRemind{");
        replace.append('}');
        return replace.toString();
    }

    public TodoDailyRemind(List<TodoDetail> list) {
        this(list, ByteString.EMPTY);
    }

    public TodoDailyRemind(List<TodoDetail> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todos = Internal.immutableCopyOf("todos", list);
    }
}
