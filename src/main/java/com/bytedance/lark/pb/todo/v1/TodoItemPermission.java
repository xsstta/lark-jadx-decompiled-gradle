package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class TodoItemPermission extends Message<TodoItemPermission, C19653a> {
    public static final ProtoAdapter<TodoItemPermission> ADAPTER = new C19654b();
    public static final Boolean DEFAULT_IS_ASSIGNABLE = false;
    public static final Boolean DEFAULT_IS_EDITABLE = false;
    public static final Boolean DEFAULT_IS_READABLE = false;
    private static final long serialVersionUID = 0;
    public final Map<Integer, Boolean> can_edit_commit_keys;
    public final Map<Integer, Boolean> can_read_commit_keys;
    public final Boolean is_assignable;
    public final Boolean is_editable;
    public final Boolean is_readable;

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoItemPermission$a */
    public static final class C19653a extends Message.Builder<TodoItemPermission, C19653a> {

        /* renamed from: a */
        public Map<Integer, Boolean> f48084a = Internal.newMutableMap();

        /* renamed from: b */
        public Map<Integer, Boolean> f48085b = Internal.newMutableMap();

        /* renamed from: c */
        public Boolean f48086c;

        /* renamed from: d */
        public Boolean f48087d;

        /* renamed from: e */
        public Boolean f48088e;

        /* renamed from: a */
        public TodoItemPermission build() {
            return new TodoItemPermission(this.f48084a, this.f48085b, this.f48086c, this.f48087d, this.f48088e, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19653a mo66673a(Boolean bool) {
            this.f48086c = bool;
            return this;
        }

        /* renamed from: b */
        public C19653a mo66675b(Boolean bool) {
            this.f48087d = bool;
            return this;
        }

        /* renamed from: c */
        public C19653a mo66676c(Boolean bool) {
            this.f48088e = bool;
            return this;
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoItemPermission$b */
    private static final class C19654b extends ProtoAdapter<TodoItemPermission> {

        /* renamed from: a */
        private final ProtoAdapter<Map<Integer, Boolean>> f48089a = ProtoAdapter.newMapAdapter(ProtoAdapter.INT32, ProtoAdapter.BOOL);

        /* renamed from: b */
        private final ProtoAdapter<Map<Integer, Boolean>> f48090b = ProtoAdapter.newMapAdapter(ProtoAdapter.INT32, ProtoAdapter.BOOL);

        C19654b() {
            super(FieldEncoding.LENGTH_DELIMITED, TodoItemPermission.class);
        }

        /* renamed from: a */
        public int encodedSize(TodoItemPermission todoItemPermission) {
            int i;
            int i2;
            int encodedSizeWithTag = this.f48089a.encodedSizeWithTag(1, todoItemPermission.can_edit_commit_keys) + this.f48090b.encodedSizeWithTag(2, todoItemPermission.can_read_commit_keys);
            int i3 = 0;
            if (todoItemPermission.is_editable != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(100, todoItemPermission.is_editable);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (todoItemPermission.is_assignable != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(101, todoItemPermission.is_assignable);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (todoItemPermission.is_readable != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(102, todoItemPermission.is_readable);
            }
            return i5 + i3 + todoItemPermission.unknownFields().size();
        }

        /* renamed from: a */
        public TodoItemPermission decode(ProtoReader protoReader) throws IOException {
            C19653a aVar = new C19653a();
            aVar.f48086c = false;
            aVar.f48087d = false;
            aVar.f48088e = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48084a.putAll(this.f48089a.decode(protoReader));
                } else if (nextTag != 2) {
                    switch (nextTag) {
                        case 100:
                            aVar.f48086c = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 101:
                            aVar.f48087d = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 102:
                            aVar.f48088e = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    aVar.f48085b.putAll(this.f48090b.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TodoItemPermission todoItemPermission) throws IOException {
            this.f48089a.encodeWithTag(protoWriter, 1, todoItemPermission.can_edit_commit_keys);
            this.f48090b.encodeWithTag(protoWriter, 2, todoItemPermission.can_read_commit_keys);
            if (todoItemPermission.is_editable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 100, todoItemPermission.is_editable);
            }
            if (todoItemPermission.is_assignable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 101, todoItemPermission.is_assignable);
            }
            if (todoItemPermission.is_readable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 102, todoItemPermission.is_readable);
            }
            protoWriter.writeBytes(todoItemPermission.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19653a newBuilder() {
        C19653a aVar = new C19653a();
        aVar.f48084a = Internal.copyOf("can_edit_commit_keys", this.can_edit_commit_keys);
        aVar.f48085b = Internal.copyOf("can_read_commit_keys", this.can_read_commit_keys);
        aVar.f48086c = this.is_editable;
        aVar.f48087d = this.is_assignable;
        aVar.f48088e = this.is_readable;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "TodoItemPermission");
        StringBuilder sb = new StringBuilder();
        if (!this.can_edit_commit_keys.isEmpty()) {
            sb.append(", can_edit_commit_keys=");
            sb.append(this.can_edit_commit_keys);
        }
        if (!this.can_read_commit_keys.isEmpty()) {
            sb.append(", can_read_commit_keys=");
            sb.append(this.can_read_commit_keys);
        }
        if (this.is_editable != null) {
            sb.append(", is_editable=");
            sb.append(this.is_editable);
        }
        if (this.is_assignable != null) {
            sb.append(", is_assignable=");
            sb.append(this.is_assignable);
        }
        if (this.is_readable != null) {
            sb.append(", is_readable=");
            sb.append(this.is_readable);
        }
        StringBuilder replace = sb.replace(0, 2, "TodoItemPermission{");
        replace.append('}');
        return replace.toString();
    }

    public TodoItemPermission(Map<Integer, Boolean> map, Map<Integer, Boolean> map2, Boolean bool, Boolean bool2, Boolean bool3) {
        this(map, map2, bool, bool2, bool3, ByteString.EMPTY);
    }

    public TodoItemPermission(Map<Integer, Boolean> map, Map<Integer, Boolean> map2, Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.can_edit_commit_keys = Internal.immutableCopyOf("can_edit_commit_keys", map);
        this.can_read_commit_keys = Internal.immutableCopyOf("can_read_commit_keys", map2);
        this.is_editable = bool;
        this.is_assignable = bool2;
        this.is_readable = bool3;
    }
}
