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

public final class ChangedTodoCollection extends Message<ChangedTodoCollection, C19453a> {
    public static final ProtoAdapter<ChangedTodoCollection> ADAPTER = new C19454b();
    private static final long serialVersionUID = 0;
    public final List<String> added_todo_idents;
    public final List<String> deleted_todo_idents;
    public final List<String> updated_todo_idents;

    /* renamed from: com.bytedance.lark.pb.todo.v1.ChangedTodoCollection$b */
    private static final class C19454b extends ProtoAdapter<ChangedTodoCollection> {
        C19454b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChangedTodoCollection.class);
        }

        /* renamed from: a */
        public int encodedSize(ChangedTodoCollection changedTodoCollection) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, changedTodoCollection.added_todo_idents) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, changedTodoCollection.updated_todo_idents) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, changedTodoCollection.deleted_todo_idents) + changedTodoCollection.unknownFields().size();
        }

        /* renamed from: a */
        public ChangedTodoCollection decode(ProtoReader protoReader) throws IOException {
            C19453a aVar = new C19453a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47785a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f47786b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47787c.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ChangedTodoCollection changedTodoCollection) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, changedTodoCollection.added_todo_idents);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, changedTodoCollection.updated_todo_idents);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, changedTodoCollection.deleted_todo_idents);
            protoWriter.writeBytes(changedTodoCollection.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.ChangedTodoCollection$a */
    public static final class C19453a extends Message.Builder<ChangedTodoCollection, C19453a> {

        /* renamed from: a */
        public List<String> f47785a = Internal.newMutableList();

        /* renamed from: b */
        public List<String> f47786b = Internal.newMutableList();

        /* renamed from: c */
        public List<String> f47787c = Internal.newMutableList();

        /* renamed from: a */
        public ChangedTodoCollection build() {
            return new ChangedTodoCollection(this.f47785a, this.f47786b, this.f47787c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19453a newBuilder() {
        C19453a aVar = new C19453a();
        aVar.f47785a = Internal.copyOf("added_todo_idents", this.added_todo_idents);
        aVar.f47786b = Internal.copyOf("updated_todo_idents", this.updated_todo_idents);
        aVar.f47787c = Internal.copyOf("deleted_todo_idents", this.deleted_todo_idents);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "ChangedTodoCollection");
        StringBuilder sb = new StringBuilder();
        if (!this.added_todo_idents.isEmpty()) {
            sb.append(", added_todo_idents=");
            sb.append(this.added_todo_idents);
        }
        if (!this.updated_todo_idents.isEmpty()) {
            sb.append(", updated_todo_idents=");
            sb.append(this.updated_todo_idents);
        }
        if (!this.deleted_todo_idents.isEmpty()) {
            sb.append(", deleted_todo_idents=");
            sb.append(this.deleted_todo_idents);
        }
        StringBuilder replace = sb.replace(0, 2, "ChangedTodoCollection{");
        replace.append('}');
        return replace.toString();
    }

    public ChangedTodoCollection(List<String> list, List<String> list2, List<String> list3) {
        this(list, list2, list3, ByteString.EMPTY);
    }

    public ChangedTodoCollection(List<String> list, List<String> list2, List<String> list3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.added_todo_idents = Internal.immutableCopyOf("added_todo_idents", list);
        this.updated_todo_idents = Internal.immutableCopyOf("updated_todo_idents", list2);
        this.deleted_todo_idents = Internal.immutableCopyOf("deleted_todo_idents", list3);
    }
}
