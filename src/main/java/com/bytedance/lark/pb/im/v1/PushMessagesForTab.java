package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PushMessagesForTab extends Message<PushMessagesForTab, C17931a> {
    public static final ProtoAdapter<PushMessagesForTab> ADAPTER = new C17932b();
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;
    public final List<MessageItem> message_items;

    public static final class MessageItem extends Message<MessageItem, C17929a> {
        public static final ProtoAdapter<MessageItem> ADAPTER = new C17930b();
        private static final long serialVersionUID = 0;
        public final String item_id;

        /* renamed from: com.bytedance.lark.pb.im.v1.PushMessagesForTab$MessageItem$b */
        private static final class C17930b extends ProtoAdapter<MessageItem> {
            C17930b() {
                super(FieldEncoding.LENGTH_DELIMITED, MessageItem.class);
            }

            /* renamed from: a */
            public int encodedSize(MessageItem messageItem) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, messageItem.item_id) + messageItem.unknownFields().size();
            }

            /* renamed from: a */
            public MessageItem decode(ProtoReader protoReader) throws IOException {
                C17929a aVar = new C17929a();
                aVar.f45019a = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag != 1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f45019a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MessageItem messageItem) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, messageItem.item_id);
                protoWriter.writeBytes(messageItem.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.PushMessagesForTab$MessageItem$a */
        public static final class C17929a extends Message.Builder<MessageItem, C17929a> {

            /* renamed from: a */
            public String f45019a;

            /* renamed from: a */
            public MessageItem build() {
                String str = this.f45019a;
                if (str != null) {
                    return new MessageItem(str, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "item_id");
            }
        }

        @Override // com.squareup.wire.Message
        public C17929a newBuilder() {
            C17929a aVar = new C17929a();
            aVar.f45019a = this.item_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "MessageItem");
            StringBuilder sb = new StringBuilder();
            sb.append(", item_id=");
            sb.append(this.item_id);
            StringBuilder replace = sb.replace(0, 2, "MessageItem{");
            replace.append('}');
            return replace.toString();
        }

        public MessageItem(String str) {
            this(str, ByteString.EMPTY);
        }

        public MessageItem(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.item_id = str;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushMessagesForTab$b */
    private static final class C17932b extends ProtoAdapter<PushMessagesForTab> {
        C17932b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushMessagesForTab.class);
        }

        /* renamed from: a */
        public int encodedSize(PushMessagesForTab pushMessagesForTab) {
            return C14928Entity.ADAPTER.encodedSizeWithTag(1, pushMessagesForTab.entity) + MessageItem.ADAPTER.asRepeated().encodedSizeWithTag(2, pushMessagesForTab.message_items) + pushMessagesForTab.unknownFields().size();
        }

        /* renamed from: a */
        public PushMessagesForTab decode(ProtoReader protoReader) throws IOException {
            C17931a aVar = new C17931a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45020a = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45021b.add(MessageItem.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushMessagesForTab pushMessagesForTab) throws IOException {
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 1, pushMessagesForTab.entity);
            MessageItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, pushMessagesForTab.message_items);
            protoWriter.writeBytes(pushMessagesForTab.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushMessagesForTab$a */
    public static final class C17931a extends Message.Builder<PushMessagesForTab, C17931a> {

        /* renamed from: a */
        public C14928Entity f45020a;

        /* renamed from: b */
        public List<MessageItem> f45021b = Internal.newMutableList();

        /* renamed from: a */
        public PushMessagesForTab build() {
            C14928Entity entity = this.f45020a;
            if (entity != null) {
                return new PushMessagesForTab(entity, this.f45021b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(entity, "entity");
        }
    }

    @Override // com.squareup.wire.Message
    public C17931a newBuilder() {
        C17931a aVar = new C17931a();
        aVar.f45020a = this.entity;
        aVar.f45021b = Internal.copyOf("message_items", this.message_items);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushMessagesForTab");
        StringBuilder sb = new StringBuilder();
        sb.append(", entity=");
        sb.append(this.entity);
        if (!this.message_items.isEmpty()) {
            sb.append(", message_items=");
            sb.append(this.message_items);
        }
        StringBuilder replace = sb.replace(0, 2, "PushMessagesForTab{");
        replace.append('}');
        return replace.toString();
    }

    public PushMessagesForTab(C14928Entity entity2, List<MessageItem> list) {
        this(entity2, list, ByteString.EMPTY);
    }

    public PushMessagesForTab(C14928Entity entity2, List<MessageItem> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity = entity2;
        this.message_items = Internal.immutableCopyOf("message_items", list);
    }
}
