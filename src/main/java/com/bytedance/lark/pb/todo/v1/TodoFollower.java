package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class TodoFollower extends Message<TodoFollower, C19651a> {
    public static final ProtoAdapter<TodoFollower> ADAPTER = new C19652b();
    public static final TodoItemMemberType DEFAULT_TYPE = TodoItemMemberType.USER;
    private static final long serialVersionUID = 0;
    public final String avatar_key;
    public final String follower_id;
    public final String inviter_id;
    public final String name;
    public final String tenant_id;
    public final TodoItemMemberType type;

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoFollower$b */
    private static final class C19652b extends ProtoAdapter<TodoFollower> {
        C19652b() {
            super(FieldEncoding.LENGTH_DELIMITED, TodoFollower.class);
        }

        /* renamed from: a */
        public int encodedSize(TodoFollower todoFollower) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (todoFollower.follower_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, todoFollower.follower_id);
            } else {
                i = 0;
            }
            if (todoFollower.type != null) {
                i2 = TodoItemMemberType.ADAPTER.encodedSizeWithTag(2, todoFollower.type);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (todoFollower.name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, todoFollower.name);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (todoFollower.avatar_key != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, todoFollower.avatar_key);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (todoFollower.inviter_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, todoFollower.inviter_id);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (todoFollower.tenant_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, todoFollower.tenant_id);
            }
            return i10 + i6 + todoFollower.unknownFields().size();
        }

        /* renamed from: a */
        public TodoFollower decode(ProtoReader protoReader) throws IOException {
            C19651a aVar = new C19651a();
            aVar.f48078a = "";
            aVar.f48079b = TodoItemMemberType.USER;
            aVar.f48080c = "";
            aVar.f48081d = "";
            aVar.f48082e = "";
            aVar.f48083f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f48078a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f48079b = TodoItemMemberType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f48080c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f48081d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f48082e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f48083f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TodoFollower todoFollower) throws IOException {
            if (todoFollower.follower_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, todoFollower.follower_id);
            }
            if (todoFollower.type != null) {
                TodoItemMemberType.ADAPTER.encodeWithTag(protoWriter, 2, todoFollower.type);
            }
            if (todoFollower.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, todoFollower.name);
            }
            if (todoFollower.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, todoFollower.avatar_key);
            }
            if (todoFollower.inviter_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, todoFollower.inviter_id);
            }
            if (todoFollower.tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, todoFollower.tenant_id);
            }
            protoWriter.writeBytes(todoFollower.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoFollower$a */
    public static final class C19651a extends Message.Builder<TodoFollower, C19651a> {

        /* renamed from: a */
        public String f48078a;

        /* renamed from: b */
        public TodoItemMemberType f48079b;

        /* renamed from: c */
        public String f48080c;

        /* renamed from: d */
        public String f48081d;

        /* renamed from: e */
        public String f48082e;

        /* renamed from: f */
        public String f48083f;

        /* renamed from: a */
        public TodoFollower build() {
            return new TodoFollower(this.f48078a, this.f48079b, this.f48080c, this.f48081d, this.f48082e, this.f48083f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19651a newBuilder() {
        C19651a aVar = new C19651a();
        aVar.f48078a = this.follower_id;
        aVar.f48079b = this.type;
        aVar.f48080c = this.name;
        aVar.f48081d = this.avatar_key;
        aVar.f48082e = this.inviter_id;
        aVar.f48083f = this.tenant_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "TodoFollower");
        StringBuilder sb = new StringBuilder();
        if (this.follower_id != null) {
            sb.append(", follower_id=");
            sb.append(this.follower_id);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.inviter_id != null) {
            sb.append(", inviter_id=");
            sb.append(this.inviter_id);
        }
        if (this.tenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.tenant_id);
        }
        StringBuilder replace = sb.replace(0, 2, "TodoFollower{");
        replace.append('}');
        return replace.toString();
    }

    public TodoFollower(String str, TodoItemMemberType todoItemMemberType, String str2, String str3, String str4, String str5) {
        this(str, todoItemMemberType, str2, str3, str4, str5, ByteString.EMPTY);
    }

    public TodoFollower(String str, TodoItemMemberType todoItemMemberType, String str2, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.follower_id = str;
        this.type = todoItemMemberType;
        this.name = str2;
        this.avatar_key = str3;
        this.inviter_id = str4;
        this.tenant_id = str5;
    }
}
