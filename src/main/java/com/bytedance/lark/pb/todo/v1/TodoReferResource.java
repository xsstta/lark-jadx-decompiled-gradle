package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class TodoReferResource extends Message<TodoReferResource, C19663a> {
    public static final ProtoAdapter<TodoReferResource> ADAPTER = new C19664b();
    public static final ResourceType DEFAULT_TYPE = ResourceType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String id;
    public final MessageResource msg;
    public final ResourceType type;

    public enum ResourceType implements WireEnum {
        UNKNOWN(0),
        MESSAGE(1);
        
        public static final ProtoAdapter<ResourceType> ADAPTER = ProtoAdapter.newEnumAdapter(ResourceType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ResourceType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return MESSAGE;
        }

        private ResourceType(int i) {
            this.value = i;
        }
    }

    public static final class MessageResource extends Message<MessageResource, C19661a> {
        public static final ProtoAdapter<MessageResource> ADAPTER = new C19662b();
        private static final long serialVersionUID = 0;
        public final C14928Entity entity;
        public final String msg_id;

        /* renamed from: com.bytedance.lark.pb.todo.v1.TodoReferResource$MessageResource$b */
        private static final class C19662b extends ProtoAdapter<MessageResource> {
            C19662b() {
                super(FieldEncoding.LENGTH_DELIMITED, MessageResource.class);
            }

            /* renamed from: a */
            public int encodedSize(MessageResource messageResource) {
                int i;
                int i2 = 0;
                if (messageResource.msg_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, messageResource.msg_id);
                } else {
                    i = 0;
                }
                if (messageResource.entity != null) {
                    i2 = C14928Entity.ADAPTER.encodedSizeWithTag(2, messageResource.entity);
                }
                return i + i2 + messageResource.unknownFields().size();
            }

            /* renamed from: a */
            public MessageResource decode(ProtoReader protoReader) throws IOException {
                C19661a aVar = new C19661a();
                aVar.f48101a = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f48101a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f48102b = C14928Entity.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MessageResource messageResource) throws IOException {
                if (messageResource.msg_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, messageResource.msg_id);
                }
                if (messageResource.entity != null) {
                    C14928Entity.ADAPTER.encodeWithTag(protoWriter, 2, messageResource.entity);
                }
                protoWriter.writeBytes(messageResource.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.todo.v1.TodoReferResource$MessageResource$a */
        public static final class C19661a extends Message.Builder<MessageResource, C19661a> {

            /* renamed from: a */
            public String f48101a;

            /* renamed from: b */
            public C14928Entity f48102b;

            /* renamed from: a */
            public MessageResource build() {
                return new MessageResource(this.f48101a, this.f48102b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19661a newBuilder() {
            C19661a aVar = new C19661a();
            aVar.f48101a = this.msg_id;
            aVar.f48102b = this.entity;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("todo", "MessageResource");
            StringBuilder sb = new StringBuilder();
            if (this.msg_id != null) {
                sb.append(", msg_id=");
                sb.append(this.msg_id);
            }
            if (this.entity != null) {
                sb.append(", entity=");
                sb.append(this.entity);
            }
            StringBuilder replace = sb.replace(0, 2, "MessageResource{");
            replace.append('}');
            return replace.toString();
        }

        public MessageResource(String str, C14928Entity entity2) {
            this(str, entity2, ByteString.EMPTY);
        }

        public MessageResource(String str, C14928Entity entity2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.msg_id = str;
            this.entity = entity2;
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoReferResource$b */
    private static final class C19664b extends ProtoAdapter<TodoReferResource> {
        C19664b() {
            super(FieldEncoding.LENGTH_DELIMITED, TodoReferResource.class);
        }

        /* renamed from: a */
        public int encodedSize(TodoReferResource todoReferResource) {
            int i;
            int i2;
            int i3 = 0;
            if (todoReferResource.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, todoReferResource.id);
            } else {
                i = 0;
            }
            if (todoReferResource.type != null) {
                i2 = ResourceType.ADAPTER.encodedSizeWithTag(2, todoReferResource.type);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (todoReferResource.msg != null) {
                i3 = MessageResource.ADAPTER.encodedSizeWithTag(100, todoReferResource.msg);
            }
            return i4 + i3 + todoReferResource.unknownFields().size();
        }

        /* renamed from: a */
        public TodoReferResource decode(ProtoReader protoReader) throws IOException {
            C19663a aVar = new C19663a();
            aVar.f48103a = "";
            aVar.f48104b = ResourceType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48103a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f48104b = ResourceType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 100) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.mo66699a(MessageResource.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TodoReferResource todoReferResource) throws IOException {
            if (todoReferResource.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, todoReferResource.id);
            }
            if (todoReferResource.type != null) {
                ResourceType.ADAPTER.encodeWithTag(protoWriter, 2, todoReferResource.type);
            }
            if (todoReferResource.msg != null) {
                MessageResource.ADAPTER.encodeWithTag(protoWriter, 100, todoReferResource.msg);
            }
            protoWriter.writeBytes(todoReferResource.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoReferResource$a */
    public static final class C19663a extends Message.Builder<TodoReferResource, C19663a> {

        /* renamed from: a */
        public String f48103a;

        /* renamed from: b */
        public ResourceType f48104b;

        /* renamed from: c */
        public MessageResource f48105c;

        /* renamed from: a */
        public TodoReferResource build() {
            return new TodoReferResource(this.f48103a, this.f48104b, this.f48105c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19663a mo66699a(MessageResource messageResource) {
            this.f48105c = messageResource;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19663a newBuilder() {
        C19663a aVar = new C19663a();
        aVar.f48103a = this.id;
        aVar.f48104b = this.type;
        aVar.f48105c = this.msg;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "TodoReferResource");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.msg != null) {
            sb.append(", msg=");
            sb.append(this.msg);
        }
        StringBuilder replace = sb.replace(0, 2, "TodoReferResource{");
        replace.append('}');
        return replace.toString();
    }

    public TodoReferResource(String str, ResourceType resourceType, MessageResource messageResource) {
        this(str, resourceType, messageResource, ByteString.EMPTY);
    }

    public TodoReferResource(String str, ResourceType resourceType, MessageResource messageResource, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.type = resourceType;
        this.msg = messageResource;
    }
}
