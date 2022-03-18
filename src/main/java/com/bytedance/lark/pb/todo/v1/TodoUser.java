package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class TodoUser extends Message<TodoUser, C19673a> {
    public static final ProtoAdapter<TodoUser> ADAPTER = new C19674b();
    private static final long serialVersionUID = 0;
    public final String avatar_key;
    public final String name;
    public final String tenant_id;
    public final String user_id;

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoUser$b */
    private static final class C19674b extends ProtoAdapter<TodoUser> {
        C19674b() {
            super(FieldEncoding.LENGTH_DELIMITED, TodoUser.class);
        }

        /* renamed from: a */
        public int encodedSize(TodoUser todoUser) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (todoUser.user_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, todoUser.user_id);
            } else {
                i = 0;
            }
            if (todoUser.name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, todoUser.name);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (todoUser.avatar_key != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, todoUser.avatar_key);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (todoUser.tenant_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, todoUser.tenant_id);
            }
            return i6 + i4 + todoUser.unknownFields().size();
        }

        /* renamed from: a */
        public TodoUser decode(ProtoReader protoReader) throws IOException {
            C19673a aVar = new C19673a();
            aVar.f48116a = "";
            aVar.f48117b = "";
            aVar.f48118c = "";
            aVar.f48119d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48116a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f48117b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f48118c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48119d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TodoUser todoUser) throws IOException {
            if (todoUser.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, todoUser.user_id);
            }
            if (todoUser.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, todoUser.name);
            }
            if (todoUser.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, todoUser.avatar_key);
            }
            if (todoUser.tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, todoUser.tenant_id);
            }
            protoWriter.writeBytes(todoUser.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoUser$a */
    public static final class C19673a extends Message.Builder<TodoUser, C19673a> {

        /* renamed from: a */
        public String f48116a;

        /* renamed from: b */
        public String f48117b;

        /* renamed from: c */
        public String f48118c;

        /* renamed from: d */
        public String f48119d;

        /* renamed from: a */
        public TodoUser build() {
            return new TodoUser(this.f48116a, this.f48117b, this.f48118c, this.f48119d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19673a newBuilder() {
        C19673a aVar = new C19673a();
        aVar.f48116a = this.user_id;
        aVar.f48117b = this.name;
        aVar.f48118c = this.avatar_key;
        aVar.f48119d = this.tenant_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "TodoUser");
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.tenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.tenant_id);
        }
        StringBuilder replace = sb.replace(0, 2, "TodoUser{");
        replace.append('}');
        return replace.toString();
    }

    public TodoUser(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, ByteString.EMPTY);
    }

    public TodoUser(String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = str;
        this.name = str2;
        this.avatar_key = str3;
        this.tenant_id = str4;
    }
}
