package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class TodoAssignee extends Message<TodoAssignee, C19639a> {
    public static final ProtoAdapter<TodoAssignee> ADAPTER = new C19640b();
    public static final Long DEFAULT_COMPLETED_MILLI_TIME = 0L;
    public static final TodoItemMemberType DEFAULT_TYPE = TodoItemMemberType.USER;
    private static final long serialVersionUID = 0;
    public final String assignee_id;
    public final String assigner_id;
    public final String avatar_key;
    public final Long completed_milli_time;
    public final String name;
    public final String tenant_id;
    public final TodoItemMemberType type;

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoAssignee$b */
    private static final class C19640b extends ProtoAdapter<TodoAssignee> {
        C19640b() {
            super(FieldEncoding.LENGTH_DELIMITED, TodoAssignee.class);
        }

        /* renamed from: a */
        public int encodedSize(TodoAssignee todoAssignee) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = 0;
            if (todoAssignee.assignee_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, todoAssignee.assignee_id);
            } else {
                i = 0;
            }
            if (todoAssignee.type != null) {
                i2 = TodoItemMemberType.ADAPTER.encodedSizeWithTag(2, todoAssignee.type);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (todoAssignee.name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, todoAssignee.name);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (todoAssignee.avatar_key != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, todoAssignee.avatar_key);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (todoAssignee.assigner_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, todoAssignee.assigner_id);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (todoAssignee.tenant_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, todoAssignee.tenant_id);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (todoAssignee.completed_milli_time != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(7, todoAssignee.completed_milli_time);
            }
            return i12 + i7 + todoAssignee.unknownFields().size();
        }

        /* renamed from: a */
        public TodoAssignee decode(ProtoReader protoReader) throws IOException {
            C19639a aVar = new C19639a();
            aVar.f48045a = "";
            aVar.f48046b = TodoItemMemberType.USER;
            aVar.f48047c = "";
            aVar.f48048d = "";
            aVar.f48049e = "";
            aVar.f48050f = "";
            aVar.f48051g = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f48045a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f48046b = TodoItemMemberType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f48047c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f48048d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f48049e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f48050f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f48051g = ProtoAdapter.INT64.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, TodoAssignee todoAssignee) throws IOException {
            if (todoAssignee.assignee_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, todoAssignee.assignee_id);
            }
            if (todoAssignee.type != null) {
                TodoItemMemberType.ADAPTER.encodeWithTag(protoWriter, 2, todoAssignee.type);
            }
            if (todoAssignee.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, todoAssignee.name);
            }
            if (todoAssignee.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, todoAssignee.avatar_key);
            }
            if (todoAssignee.assigner_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, todoAssignee.assigner_id);
            }
            if (todoAssignee.tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, todoAssignee.tenant_id);
            }
            if (todoAssignee.completed_milli_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, todoAssignee.completed_milli_time);
            }
            protoWriter.writeBytes(todoAssignee.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoAssignee$a */
    public static final class C19639a extends Message.Builder<TodoAssignee, C19639a> {

        /* renamed from: a */
        public String f48045a;

        /* renamed from: b */
        public TodoItemMemberType f48046b;

        /* renamed from: c */
        public String f48047c;

        /* renamed from: d */
        public String f48048d;

        /* renamed from: e */
        public String f48049e;

        /* renamed from: f */
        public String f48050f;

        /* renamed from: g */
        public Long f48051g;

        /* renamed from: a */
        public TodoAssignee build() {
            return new TodoAssignee(this.f48045a, this.f48046b, this.f48047c, this.f48048d, this.f48049e, this.f48050f, this.f48051g, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19639a mo66629a(TodoItemMemberType todoItemMemberType) {
            this.f48046b = todoItemMemberType;
            return this;
        }

        /* renamed from: b */
        public C19639a mo66632b(String str) {
            this.f48047c = str;
            return this;
        }

        /* renamed from: c */
        public C19639a mo66633c(String str) {
            this.f48048d = str;
            return this;
        }

        /* renamed from: d */
        public C19639a mo66634d(String str) {
            this.f48049e = str;
            return this;
        }

        /* renamed from: e */
        public C19639a mo66635e(String str) {
            this.f48050f = str;
            return this;
        }

        /* renamed from: a */
        public C19639a mo66630a(String str) {
            this.f48045a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19639a newBuilder() {
        C19639a aVar = new C19639a();
        aVar.f48045a = this.assignee_id;
        aVar.f48046b = this.type;
        aVar.f48047c = this.name;
        aVar.f48048d = this.avatar_key;
        aVar.f48049e = this.assigner_id;
        aVar.f48050f = this.tenant_id;
        aVar.f48051g = this.completed_milli_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "TodoAssignee");
        StringBuilder sb = new StringBuilder();
        if (this.assignee_id != null) {
            sb.append(", assignee_id=");
            sb.append(this.assignee_id);
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
        if (this.assigner_id != null) {
            sb.append(", assigner_id=");
            sb.append(this.assigner_id);
        }
        if (this.tenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.tenant_id);
        }
        if (this.completed_milli_time != null) {
            sb.append(", completed_milli_time=");
            sb.append(this.completed_milli_time);
        }
        StringBuilder replace = sb.replace(0, 2, "TodoAssignee{");
        replace.append('}');
        return replace.toString();
    }

    public TodoAssignee(String str, TodoItemMemberType todoItemMemberType, String str2, String str3, String str4, String str5, Long l) {
        this(str, todoItemMemberType, str2, str3, str4, str5, l, ByteString.EMPTY);
    }

    public TodoAssignee(String str, TodoItemMemberType todoItemMemberType, String str2, String str3, String str4, String str5, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.assignee_id = str;
        this.type = todoItemMemberType;
        this.name = str2;
        this.avatar_key = str3;
        this.assigner_id = str4;
        this.tenant_id = str5;
        this.completed_milli_time = l;
    }
}
