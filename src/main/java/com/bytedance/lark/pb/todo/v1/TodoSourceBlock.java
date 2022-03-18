package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class TodoSourceBlock extends Message<TodoSourceBlock, C19669a> {
    public static final ProtoAdapter<TodoSourceBlock> ADAPTER = new C19670b();
    private static final long serialVersionUID = 0;
    public final String id;

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoSourceBlock$b */
    private static final class C19670b extends ProtoAdapter<TodoSourceBlock> {
        C19670b() {
            super(FieldEncoding.LENGTH_DELIMITED, TodoSourceBlock.class);
        }

        /* renamed from: a */
        public int encodedSize(TodoSourceBlock todoSourceBlock) {
            int i;
            if (todoSourceBlock.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, todoSourceBlock.id);
            } else {
                i = 0;
            }
            return i + todoSourceBlock.unknownFields().size();
        }

        /* renamed from: a */
        public TodoSourceBlock decode(ProtoReader protoReader) throws IOException {
            C19669a aVar = new C19669a();
            aVar.f48113a = "";
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
                    aVar.f48113a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TodoSourceBlock todoSourceBlock) throws IOException {
            if (todoSourceBlock.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, todoSourceBlock.id);
            }
            protoWriter.writeBytes(todoSourceBlock.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoSourceBlock$a */
    public static final class C19669a extends Message.Builder<TodoSourceBlock, C19669a> {

        /* renamed from: a */
        public String f48113a;

        /* renamed from: a */
        public TodoSourceBlock build() {
            return new TodoSourceBlock(this.f48113a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19669a mo66714a(String str) {
            this.f48113a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19669a newBuilder() {
        C19669a aVar = new C19669a();
        aVar.f48113a = this.id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "TodoSourceBlock");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        StringBuilder replace = sb.replace(0, 2, "TodoSourceBlock{");
        replace.append('}');
        return replace.toString();
    }

    public TodoSourceBlock(String str) {
        this(str, ByteString.EMPTY);
    }

    public TodoSourceBlock(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
    }
}
