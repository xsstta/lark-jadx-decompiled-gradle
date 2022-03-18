package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushTodoComment extends Message<PushTodoComment, C19599a> {
    public static final ProtoAdapter<PushTodoComment> ADAPTER = new C19600b();
    private static final long serialVersionUID = 0;
    public final TodoComment comment;
    public final String todo_guid;

    /* renamed from: com.bytedance.lark.pb.todo.v1.PushTodoComment$b */
    private static final class C19600b extends ProtoAdapter<PushTodoComment> {
        C19600b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushTodoComment.class);
        }

        /* renamed from: a */
        public int encodedSize(PushTodoComment pushTodoComment) {
            int i;
            int i2 = 0;
            if (pushTodoComment.todo_guid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, pushTodoComment.todo_guid);
            } else {
                i = 0;
            }
            if (pushTodoComment.comment != null) {
                i2 = TodoComment.ADAPTER.encodedSizeWithTag(2, pushTodoComment.comment);
            }
            return i + i2 + pushTodoComment.unknownFields().size();
        }

        /* renamed from: a */
        public PushTodoComment decode(ProtoReader protoReader) throws IOException {
            C19599a aVar = new C19599a();
            aVar.f47947a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47947a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47948b = TodoComment.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushTodoComment pushTodoComment) throws IOException {
            if (pushTodoComment.todo_guid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushTodoComment.todo_guid);
            }
            if (pushTodoComment.comment != null) {
                TodoComment.ADAPTER.encodeWithTag(protoWriter, 2, pushTodoComment.comment);
            }
            protoWriter.writeBytes(pushTodoComment.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.PushTodoComment$a */
    public static final class C19599a extends Message.Builder<PushTodoComment, C19599a> {

        /* renamed from: a */
        public String f47947a;

        /* renamed from: b */
        public TodoComment f47948b;

        /* renamed from: a */
        public PushTodoComment build() {
            return new PushTodoComment(this.f47947a, this.f47948b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19599a newBuilder() {
        C19599a aVar = new C19599a();
        aVar.f47947a = this.todo_guid;
        aVar.f47948b = this.comment;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "PushTodoComment");
        StringBuilder sb = new StringBuilder();
        if (this.todo_guid != null) {
            sb.append(", todo_guid=");
            sb.append(this.todo_guid);
        }
        if (this.comment != null) {
            sb.append(", comment=");
            sb.append(this.comment);
        }
        StringBuilder replace = sb.replace(0, 2, "PushTodoComment{");
        replace.append('}');
        return replace.toString();
    }

    public PushTodoComment(String str, TodoComment todoComment) {
        this(str, todoComment, ByteString.EMPTY);
    }

    public PushTodoComment(String str, TodoComment todoComment, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todo_guid = str;
        this.comment = todoComment;
    }
}
