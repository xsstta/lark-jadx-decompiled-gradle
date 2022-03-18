package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PushChatMessageChanged extends Message<PushChatMessageChanged, C17877a> {
    public static final ProtoAdapter<PushChatMessageChanged> ADAPTER = new C17878b();
    private static final long serialVersionUID = 0;
    public final List<MessageItem> message_items;

    public static final class MessageItem extends Message<MessageItem, C17875a> {
        public static final ProtoAdapter<MessageItem> ADAPTER = new C17876b();
        public static final ItemType DEFAULT_ITEM_TYPE = ItemType.NORMAL_MESSAGE;
        private static final long serialVersionUID = 0;
        public final String item_id;
        public final ItemType item_type;

        public enum ItemType implements WireEnum {
            NORMAL_MESSAGE(1),
            QUASI_MESSAGE(2),
            EPHEMERAL_MESSAGE(3);
            
            public static final ProtoAdapter<ItemType> ADAPTER = ProtoAdapter.newEnumAdapter(ItemType.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static ItemType fromValue(int i) {
                if (i == 1) {
                    return NORMAL_MESSAGE;
                }
                if (i == 2) {
                    return QUASI_MESSAGE;
                }
                if (i != 3) {
                    return null;
                }
                return EPHEMERAL_MESSAGE;
            }

            private ItemType(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.PushChatMessageChanged$MessageItem$b */
        private static final class C17876b extends ProtoAdapter<MessageItem> {
            C17876b() {
                super(FieldEncoding.LENGTH_DELIMITED, MessageItem.class);
            }

            /* renamed from: a */
            public int encodedSize(MessageItem messageItem) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, messageItem.item_id) + ItemType.ADAPTER.encodedSizeWithTag(2, messageItem.item_type) + messageItem.unknownFields().size();
            }

            /* renamed from: a */
            public MessageItem decode(ProtoReader protoReader) throws IOException {
                C17875a aVar = new C17875a();
                aVar.f44950a = "";
                aVar.f44951b = ItemType.NORMAL_MESSAGE;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f44950a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f44951b = ItemType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MessageItem messageItem) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, messageItem.item_id);
                ItemType.ADAPTER.encodeWithTag(protoWriter, 2, messageItem.item_type);
                protoWriter.writeBytes(messageItem.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C17875a newBuilder() {
            C17875a aVar = new C17875a();
            aVar.f44950a = this.item_id;
            aVar.f44951b = this.item_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.PushChatMessageChanged$MessageItem$a */
        public static final class C17875a extends Message.Builder<MessageItem, C17875a> {

            /* renamed from: a */
            public String f44950a;

            /* renamed from: b */
            public ItemType f44951b;

            /* renamed from: a */
            public MessageItem build() {
                ItemType itemType;
                String str = this.f44950a;
                if (str != null && (itemType = this.f44951b) != null) {
                    return new MessageItem(str, itemType, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "item_id", this.f44951b, "item_type");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "MessageItem");
            StringBuilder sb = new StringBuilder();
            sb.append(", item_id=");
            sb.append(this.item_id);
            sb.append(", item_type=");
            sb.append(this.item_type);
            StringBuilder replace = sb.replace(0, 2, "MessageItem{");
            replace.append('}');
            return replace.toString();
        }

        public MessageItem(String str, ItemType itemType) {
            this(str, itemType, ByteString.EMPTY);
        }

        public MessageItem(String str, ItemType itemType, ByteString byteString) {
            super(ADAPTER, byteString);
            this.item_id = str;
            this.item_type = itemType;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushChatMessageChanged$b */
    private static final class C17878b extends ProtoAdapter<PushChatMessageChanged> {
        C17878b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushChatMessageChanged.class);
        }

        /* renamed from: a */
        public int encodedSize(PushChatMessageChanged pushChatMessageChanged) {
            return MessageItem.ADAPTER.asRepeated().encodedSizeWithTag(1, pushChatMessageChanged.message_items) + pushChatMessageChanged.unknownFields().size();
        }

        /* renamed from: a */
        public PushChatMessageChanged decode(ProtoReader protoReader) throws IOException {
            C17877a aVar = new C17877a();
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
                    aVar.f44952a.add(MessageItem.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushChatMessageChanged pushChatMessageChanged) throws IOException {
            MessageItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pushChatMessageChanged.message_items);
            protoWriter.writeBytes(pushChatMessageChanged.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushChatMessageChanged$a */
    public static final class C17877a extends Message.Builder<PushChatMessageChanged, C17877a> {

        /* renamed from: a */
        public List<MessageItem> f44952a = Internal.newMutableList();

        /* renamed from: a */
        public PushChatMessageChanged build() {
            return new PushChatMessageChanged(this.f44952a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17877a newBuilder() {
        C17877a aVar = new C17877a();
        aVar.f44952a = Internal.copyOf("message_items", this.message_items);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushChatMessageChanged");
        StringBuilder sb = new StringBuilder();
        if (!this.message_items.isEmpty()) {
            sb.append(", message_items=");
            sb.append(this.message_items);
        }
        StringBuilder replace = sb.replace(0, 2, "PushChatMessageChanged{");
        replace.append('}');
        return replace.toString();
    }

    public PushChatMessageChanged(List<MessageItem> list) {
        this(list, ByteString.EMPTY);
    }

    public PushChatMessageChanged(List<MessageItem> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_items = Internal.immutableCopyOf("message_items", list);
    }
}
