package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushTodosChangedNotification extends Message<PushTodosChangedNotification, C19609a> {
    public static final ProtoAdapter<PushTodosChangedNotification> ADAPTER = new C19610b();
    public static final Boolean DEFAULT_REFRESH_ALL = false;
    private static final long serialVersionUID = 0;
    public final ChangedTodoCollection changed_todos;
    public final Boolean refresh_all;

    /* renamed from: com.bytedance.lark.pb.todo.v1.PushTodosChangedNotification$b */
    private static final class C19610b extends ProtoAdapter<PushTodosChangedNotification> {
        C19610b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushTodosChangedNotification.class);
        }

        /* renamed from: a */
        public int encodedSize(PushTodosChangedNotification pushTodosChangedNotification) {
            int i;
            int i2 = 0;
            if (pushTodosChangedNotification.changed_todos != null) {
                i = ChangedTodoCollection.ADAPTER.encodedSizeWithTag(1, pushTodosChangedNotification.changed_todos);
            } else {
                i = 0;
            }
            if (pushTodosChangedNotification.refresh_all != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, pushTodosChangedNotification.refresh_all);
            }
            return i + i2 + pushTodosChangedNotification.unknownFields().size();
        }

        /* renamed from: a */
        public PushTodosChangedNotification decode(ProtoReader protoReader) throws IOException {
            C19609a aVar = new C19609a();
            aVar.f47962b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47961a = ChangedTodoCollection.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47962b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushTodosChangedNotification pushTodosChangedNotification) throws IOException {
            if (pushTodosChangedNotification.changed_todos != null) {
                ChangedTodoCollection.ADAPTER.encodeWithTag(protoWriter, 1, pushTodosChangedNotification.changed_todos);
            }
            if (pushTodosChangedNotification.refresh_all != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, pushTodosChangedNotification.refresh_all);
            }
            protoWriter.writeBytes(pushTodosChangedNotification.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.PushTodosChangedNotification$a */
    public static final class C19609a extends Message.Builder<PushTodosChangedNotification, C19609a> {

        /* renamed from: a */
        public ChangedTodoCollection f47961a;

        /* renamed from: b */
        public Boolean f47962b;

        /* renamed from: a */
        public PushTodosChangedNotification build() {
            return new PushTodosChangedNotification(this.f47961a, this.f47962b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19609a newBuilder() {
        C19609a aVar = new C19609a();
        aVar.f47961a = this.changed_todos;
        aVar.f47962b = this.refresh_all;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "PushTodosChangedNotification");
        StringBuilder sb = new StringBuilder();
        if (this.changed_todos != null) {
            sb.append(", changed_todos=");
            sb.append(this.changed_todos);
        }
        if (this.refresh_all != null) {
            sb.append(", refresh_all=");
            sb.append(this.refresh_all);
        }
        StringBuilder replace = sb.replace(0, 2, "PushTodosChangedNotification{");
        replace.append('}');
        return replace.toString();
    }

    public PushTodosChangedNotification(ChangedTodoCollection changedTodoCollection, Boolean bool) {
        this(changedTodoCollection, bool, ByteString.EMPTY);
    }

    public PushTodosChangedNotification(ChangedTodoCollection changedTodoCollection, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.changed_todos = changedTodoCollection;
        this.refresh_all = bool;
    }
}
