package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class QuitTodoRequest extends Message<QuitTodoRequest, C19611a> {
    public static final ProtoAdapter<QuitTodoRequest> ADAPTER = new C19612b();
    public static final TodoSource DEFAULT_SOURCE = TodoSource.UNKNOWN_SOURCE;
    private static final long serialVersionUID = 0;
    public final TodoSource source;
    public final String todo_guid;

    /* renamed from: com.bytedance.lark.pb.todo.v1.QuitTodoRequest$b */
    private static final class C19612b extends ProtoAdapter<QuitTodoRequest> {
        C19612b() {
            super(FieldEncoding.LENGTH_DELIMITED, QuitTodoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(QuitTodoRequest quitTodoRequest) {
            int i;
            int i2 = 0;
            if (quitTodoRequest.todo_guid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, quitTodoRequest.todo_guid);
            } else {
                i = 0;
            }
            if (quitTodoRequest.source != null) {
                i2 = TodoSource.ADAPTER.encodedSizeWithTag(2, quitTodoRequest.source);
            }
            return i + i2 + quitTodoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public QuitTodoRequest decode(ProtoReader protoReader) throws IOException {
            C19611a aVar = new C19611a();
            aVar.f47963a = "";
            aVar.f47964b = TodoSource.UNKNOWN_SOURCE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47963a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f47964b = TodoSource.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, QuitTodoRequest quitTodoRequest) throws IOException {
            if (quitTodoRequest.todo_guid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, quitTodoRequest.todo_guid);
            }
            if (quitTodoRequest.source != null) {
                TodoSource.ADAPTER.encodeWithTag(protoWriter, 2, quitTodoRequest.source);
            }
            protoWriter.writeBytes(quitTodoRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.QuitTodoRequest$a */
    public static final class C19611a extends Message.Builder<QuitTodoRequest, C19611a> {

        /* renamed from: a */
        public String f47963a;

        /* renamed from: b */
        public TodoSource f47964b;

        /* renamed from: a */
        public QuitTodoRequest build() {
            return new QuitTodoRequest(this.f47963a, this.f47964b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19611a mo66562a(TodoSource todoSource) {
            this.f47964b = todoSource;
            return this;
        }

        /* renamed from: a */
        public C19611a mo66563a(String str) {
            this.f47963a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19611a newBuilder() {
        C19611a aVar = new C19611a();
        aVar.f47963a = this.todo_guid;
        aVar.f47964b = this.source;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "QuitTodoRequest");
        StringBuilder sb = new StringBuilder();
        if (this.todo_guid != null) {
            sb.append(", todo_guid=");
            sb.append(this.todo_guid);
        }
        if (this.source != null) {
            sb.append(", source=");
            sb.append(this.source);
        }
        StringBuilder replace = sb.replace(0, 2, "QuitTodoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public QuitTodoRequest(String str, TodoSource todoSource) {
        this(str, todoSource, ByteString.EMPTY);
    }

    public QuitTodoRequest(String str, TodoSource todoSource, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todo_guid = str;
        this.source = todoSource;
    }
}
