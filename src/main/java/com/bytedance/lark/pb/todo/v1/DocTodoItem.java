package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DocTodoItem extends Message<DocTodoItem, C19497a> {
    public static final ProtoAdapter<DocTodoItem> ADAPTER = new C19498b();
    private static final long serialVersionUID = 0;
    public final Todo todo;

    /* renamed from: com.bytedance.lark.pb.todo.v1.DocTodoItem$b */
    private static final class C19498b extends ProtoAdapter<DocTodoItem> {
        C19498b() {
            super(FieldEncoding.LENGTH_DELIMITED, DocTodoItem.class);
        }

        /* renamed from: a */
        public int encodedSize(DocTodoItem docTodoItem) {
            int i;
            if (docTodoItem.todo != null) {
                i = Todo.ADAPTER.encodedSizeWithTag(1, docTodoItem.todo);
            } else {
                i = 0;
            }
            return i + docTodoItem.unknownFields().size();
        }

        /* renamed from: a */
        public DocTodoItem decode(ProtoReader protoReader) throws IOException {
            C19497a aVar = new C19497a();
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
                    aVar.f47850a = Todo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DocTodoItem docTodoItem) throws IOException {
            if (docTodoItem.todo != null) {
                Todo.ADAPTER.encodeWithTag(protoWriter, 1, docTodoItem.todo);
            }
            protoWriter.writeBytes(docTodoItem.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.DocTodoItem$a */
    public static final class C19497a extends Message.Builder<DocTodoItem, C19497a> {

        /* renamed from: a */
        public Todo f47850a;

        /* renamed from: a */
        public DocTodoItem build() {
            return new DocTodoItem(this.f47850a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19497a newBuilder() {
        C19497a aVar = new C19497a();
        aVar.f47850a = this.todo;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "DocTodoItem");
        StringBuilder sb = new StringBuilder();
        if (this.todo != null) {
            sb.append(", todo=");
            sb.append(this.todo);
        }
        StringBuilder replace = sb.replace(0, 2, "DocTodoItem{");
        replace.append('}');
        return replace.toString();
    }

    public DocTodoItem(Todo todo2) {
        this(todo2, ByteString.EMPTY);
    }

    public DocTodoItem(Todo todo2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todo = todo2;
    }
}
