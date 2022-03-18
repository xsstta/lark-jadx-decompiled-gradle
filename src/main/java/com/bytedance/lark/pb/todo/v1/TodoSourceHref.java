package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class TodoSourceHref extends Message<TodoSourceHref, C19671a> {
    public static final ProtoAdapter<TodoSourceHref> ADAPTER = new C19672b();
    private static final long serialVersionUID = 0;
    public final String title;
    public final String url;

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoSourceHref$b */
    private static final class C19672b extends ProtoAdapter<TodoSourceHref> {
        C19672b() {
            super(FieldEncoding.LENGTH_DELIMITED, TodoSourceHref.class);
        }

        /* renamed from: a */
        public int encodedSize(TodoSourceHref todoSourceHref) {
            int i;
            int i2 = 0;
            if (todoSourceHref.title != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, todoSourceHref.title);
            } else {
                i = 0;
            }
            if (todoSourceHref.url != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, todoSourceHref.url);
            }
            return i + i2 + todoSourceHref.unknownFields().size();
        }

        /* renamed from: a */
        public TodoSourceHref decode(ProtoReader protoReader) throws IOException {
            C19671a aVar = new C19671a();
            aVar.f48114a = "";
            aVar.f48115b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48114a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48115b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TodoSourceHref todoSourceHref) throws IOException {
            if (todoSourceHref.title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, todoSourceHref.title);
            }
            if (todoSourceHref.url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, todoSourceHref.url);
            }
            protoWriter.writeBytes(todoSourceHref.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoSourceHref$a */
    public static final class C19671a extends Message.Builder<TodoSourceHref, C19671a> {

        /* renamed from: a */
        public String f48114a;

        /* renamed from: b */
        public String f48115b;

        /* renamed from: a */
        public TodoSourceHref build() {
            return new TodoSourceHref(this.f48114a, this.f48115b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19671a newBuilder() {
        C19671a aVar = new C19671a();
        aVar.f48114a = this.title;
        aVar.f48115b = this.url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "TodoSourceHref");
        StringBuilder sb = new StringBuilder();
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        StringBuilder replace = sb.replace(0, 2, "TodoSourceHref{");
        replace.append('}');
        return replace.toString();
    }

    public TodoSourceHref(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public TodoSourceHref(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.title = str;
        this.url = str2;
    }
}
