package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CreateTodoRequest extends Message<CreateTodoRequest, C19481a> {
    public static final ProtoAdapter<CreateTodoRequest> ADAPTER = new C19482b();
    private static final long serialVersionUID = 0;
    public final String chat_to_send;
    public final String prev_sibling_ident;
    public final Todo todo;

    /* renamed from: com.bytedance.lark.pb.todo.v1.CreateTodoRequest$b */
    private static final class C19482b extends ProtoAdapter<CreateTodoRequest> {
        C19482b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateTodoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateTodoRequest createTodoRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (createTodoRequest.todo != null) {
                i = Todo.ADAPTER.encodedSizeWithTag(1, createTodoRequest.todo);
            } else {
                i = 0;
            }
            if (createTodoRequest.prev_sibling_ident != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, createTodoRequest.prev_sibling_ident);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (createTodoRequest.chat_to_send != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, createTodoRequest.chat_to_send);
            }
            return i4 + i3 + createTodoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateTodoRequest decode(ProtoReader protoReader) throws IOException {
            C19481a aVar = new C19481a();
            aVar.f47835b = "";
            aVar.f47836c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47834a = Todo.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47835b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47836c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateTodoRequest createTodoRequest) throws IOException {
            if (createTodoRequest.todo != null) {
                Todo.ADAPTER.encodeWithTag(protoWriter, 1, createTodoRequest.todo);
            }
            if (createTodoRequest.prev_sibling_ident != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, createTodoRequest.prev_sibling_ident);
            }
            if (createTodoRequest.chat_to_send != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, createTodoRequest.chat_to_send);
            }
            protoWriter.writeBytes(createTodoRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.CreateTodoRequest$a */
    public static final class C19481a extends Message.Builder<CreateTodoRequest, C19481a> {

        /* renamed from: a */
        public Todo f47834a;

        /* renamed from: b */
        public String f47835b;

        /* renamed from: c */
        public String f47836c;

        /* renamed from: a */
        public CreateTodoRequest build() {
            return new CreateTodoRequest(this.f47834a, this.f47835b, this.f47836c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19481a mo66252a(Todo todo) {
            this.f47834a = todo;
            return this;
        }

        /* renamed from: a */
        public C19481a mo66253a(String str) {
            this.f47836c = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19481a newBuilder() {
        C19481a aVar = new C19481a();
        aVar.f47834a = this.todo;
        aVar.f47835b = this.prev_sibling_ident;
        aVar.f47836c = this.chat_to_send;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "CreateTodoRequest");
        StringBuilder sb = new StringBuilder();
        if (this.todo != null) {
            sb.append(", todo=");
            sb.append(this.todo);
        }
        if (this.prev_sibling_ident != null) {
            sb.append(", prev_sibling_ident=");
            sb.append(this.prev_sibling_ident);
        }
        if (this.chat_to_send != null) {
            sb.append(", chat_to_send=");
            sb.append(this.chat_to_send);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateTodoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateTodoRequest(Todo todo2, String str, String str2) {
        this(todo2, str, str2, ByteString.EMPTY);
    }

    public CreateTodoRequest(Todo todo2, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todo = todo2;
        this.prev_sibling_ident = str;
        this.chat_to_send = str2;
    }
}
