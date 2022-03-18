package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class TodoExtra extends Message<TodoExtra, C19649a> {
    public static final ProtoAdapter<TodoExtra> ADAPTER = new C19650b();
    public static final ByteString DEFAULT_EXTRA = ByteString.EMPTY;
    private static final long serialVersionUID = 0;
    public final ByteString extra;

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoExtra$b */
    private static final class C19650b extends ProtoAdapter<TodoExtra> {
        C19650b() {
            super(FieldEncoding.LENGTH_DELIMITED, TodoExtra.class);
        }

        /* renamed from: a */
        public int encodedSize(TodoExtra todoExtra) {
            int i;
            if (todoExtra.extra != null) {
                i = ProtoAdapter.BYTES.encodedSizeWithTag(1, todoExtra.extra);
            } else {
                i = 0;
            }
            return i + todoExtra.unknownFields().size();
        }

        /* renamed from: a */
        public TodoExtra decode(ProtoReader protoReader) throws IOException {
            C19649a aVar = new C19649a();
            aVar.f48077a = ByteString.EMPTY;
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
                    aVar.f48077a = ProtoAdapter.BYTES.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TodoExtra todoExtra) throws IOException {
            if (todoExtra.extra != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, todoExtra.extra);
            }
            protoWriter.writeBytes(todoExtra.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoExtra$a */
    public static final class C19649a extends Message.Builder<TodoExtra, C19649a> {

        /* renamed from: a */
        public ByteString f48077a;

        /* renamed from: a */
        public TodoExtra build() {
            return new TodoExtra(this.f48077a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19649a newBuilder() {
        C19649a aVar = new C19649a();
        aVar.f48077a = this.extra;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "TodoExtra");
        StringBuilder sb = new StringBuilder();
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        StringBuilder replace = sb.replace(0, 2, "TodoExtra{");
        replace.append('}');
        return replace.toString();
    }

    public TodoExtra(ByteString byteString) {
        this(byteString, ByteString.EMPTY);
    }

    public TodoExtra(ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.extra = byteString;
    }
}
