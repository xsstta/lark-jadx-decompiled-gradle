package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ChatTodoInfo extends Message<ChatTodoInfo, C19455a> {
    public static final ProtoAdapter<ChatTodoInfo> ADAPTER = new C19456b();
    public static final Integer DEFAULT_MESSAGE_POSITION = 0;
    public static final Long DEFAULT_SEND_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String message_id;
    public final Integer message_position;
    public final Long send_time;
    public final Chatter sender;
    public final Todo todo;

    /* renamed from: com.bytedance.lark.pb.todo.v1.ChatTodoInfo$b */
    private static final class C19456b extends ProtoAdapter<ChatTodoInfo> {
        C19456b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatTodoInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatTodoInfo chatTodoInfo) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (chatTodoInfo.todo != null) {
                i = Todo.ADAPTER.encodedSizeWithTag(1, chatTodoInfo.todo);
            } else {
                i = 0;
            }
            if (chatTodoInfo.message_position != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, chatTodoInfo.message_position);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (chatTodoInfo.message_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, chatTodoInfo.message_id);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (chatTodoInfo.sender != null) {
                i4 = Chatter.ADAPTER.encodedSizeWithTag(4, chatTodoInfo.sender);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (chatTodoInfo.send_time != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, chatTodoInfo.send_time);
            }
            return i8 + i5 + chatTodoInfo.unknownFields().size();
        }

        /* renamed from: a */
        public ChatTodoInfo decode(ProtoReader protoReader) throws IOException {
            C19455a aVar = new C19455a();
            aVar.f47789b = 0;
            aVar.f47790c = "";
            aVar.f47792e = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47788a = Todo.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47789b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f47790c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f47791d = Chatter.ADAPTER.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47792e = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ChatTodoInfo chatTodoInfo) throws IOException {
            if (chatTodoInfo.todo != null) {
                Todo.ADAPTER.encodeWithTag(protoWriter, 1, chatTodoInfo.todo);
            }
            if (chatTodoInfo.message_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, chatTodoInfo.message_position);
            }
            if (chatTodoInfo.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, chatTodoInfo.message_id);
            }
            if (chatTodoInfo.sender != null) {
                Chatter.ADAPTER.encodeWithTag(protoWriter, 4, chatTodoInfo.sender);
            }
            if (chatTodoInfo.send_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, chatTodoInfo.send_time);
            }
            protoWriter.writeBytes(chatTodoInfo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19455a newBuilder() {
        C19455a aVar = new C19455a();
        aVar.f47788a = this.todo;
        aVar.f47789b = this.message_position;
        aVar.f47790c = this.message_id;
        aVar.f47791d = this.sender;
        aVar.f47792e = this.send_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.ChatTodoInfo$a */
    public static final class C19455a extends Message.Builder<ChatTodoInfo, C19455a> {

        /* renamed from: a */
        public Todo f47788a;

        /* renamed from: b */
        public Integer f47789b;

        /* renamed from: c */
        public String f47790c;

        /* renamed from: d */
        public Chatter f47791d;

        /* renamed from: e */
        public Long f47792e;

        /* renamed from: a */
        public ChatTodoInfo build() {
            return new ChatTodoInfo(this.f47788a, this.f47789b, this.f47790c, this.f47791d, this.f47792e, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19455a mo66195a(Chatter chatter) {
            this.f47791d = chatter;
            return this;
        }

        /* renamed from: a */
        public C19455a mo66196a(Todo todo) {
            this.f47788a = todo;
            return this;
        }

        /* renamed from: a */
        public C19455a mo66197a(Integer num) {
            this.f47789b = num;
            return this;
        }

        /* renamed from: a */
        public C19455a mo66198a(Long l) {
            this.f47792e = l;
            return this;
        }

        /* renamed from: a */
        public C19455a mo66199a(String str) {
            this.f47790c = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "ChatTodoInfo");
        StringBuilder sb = new StringBuilder();
        if (this.todo != null) {
            sb.append(", todo=");
            sb.append(this.todo);
        }
        if (this.message_position != null) {
            sb.append(", message_position=");
            sb.append(this.message_position);
        }
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.sender != null) {
            sb.append(", sender=");
            sb.append(this.sender);
        }
        if (this.send_time != null) {
            sb.append(", send_time=");
            sb.append(this.send_time);
        }
        StringBuilder replace = sb.replace(0, 2, "ChatTodoInfo{");
        replace.append('}');
        return replace.toString();
    }

    public ChatTodoInfo(Todo todo2, Integer num, String str, Chatter chatter, Long l) {
        this(todo2, num, str, chatter, l, ByteString.EMPTY);
    }

    public ChatTodoInfo(Todo todo2, Integer num, String str, Chatter chatter, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todo = todo2;
        this.message_position = num;
        this.message_id = str;
        this.sender = chatter;
        this.send_time = l;
    }
}
