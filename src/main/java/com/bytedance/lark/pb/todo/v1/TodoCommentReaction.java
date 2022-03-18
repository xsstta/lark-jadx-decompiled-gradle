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

public final class TodoCommentReaction extends Message<TodoCommentReaction, C19647a> {
    public static final ProtoAdapter<TodoCommentReaction> ADAPTER = new C19648b();
    private static final long serialVersionUID = 0;
    public final String type;
    public final List<TodoUser> users;

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoCommentReaction$b */
    private static final class C19648b extends ProtoAdapter<TodoCommentReaction> {
        C19648b() {
            super(FieldEncoding.LENGTH_DELIMITED, TodoCommentReaction.class);
        }

        /* renamed from: a */
        public int encodedSize(TodoCommentReaction todoCommentReaction) {
            int i;
            if (todoCommentReaction.type != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, todoCommentReaction.type);
            } else {
                i = 0;
            }
            return i + TodoUser.ADAPTER.asRepeated().encodedSizeWithTag(2, todoCommentReaction.users) + todoCommentReaction.unknownFields().size();
        }

        /* renamed from: a */
        public TodoCommentReaction decode(ProtoReader protoReader) throws IOException {
            C19647a aVar = new C19647a();
            aVar.f48075a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48075a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48076b.add(TodoUser.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TodoCommentReaction todoCommentReaction) throws IOException {
            if (todoCommentReaction.type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, todoCommentReaction.type);
            }
            TodoUser.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, todoCommentReaction.users);
            protoWriter.writeBytes(todoCommentReaction.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoCommentReaction$a */
    public static final class C19647a extends Message.Builder<TodoCommentReaction, C19647a> {

        /* renamed from: a */
        public String f48075a;

        /* renamed from: b */
        public List<TodoUser> f48076b = Internal.newMutableList();

        /* renamed from: a */
        public TodoCommentReaction build() {
            return new TodoCommentReaction(this.f48075a, this.f48076b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19647a newBuilder() {
        C19647a aVar = new C19647a();
        aVar.f48075a = this.type;
        aVar.f48076b = Internal.copyOf("users", this.users);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "TodoCommentReaction");
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (!this.users.isEmpty()) {
            sb.append(", users=");
            sb.append(this.users);
        }
        StringBuilder replace = sb.replace(0, 2, "TodoCommentReaction{");
        replace.append('}');
        return replace.toString();
    }

    public TodoCommentReaction(String str, List<TodoUser> list) {
        this(str, list, ByteString.EMPTY);
    }

    public TodoCommentReaction(String str, List<TodoUser> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = str;
        this.users = Internal.immutableCopyOf("users", list);
    }
}
