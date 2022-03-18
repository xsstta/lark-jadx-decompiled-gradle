package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
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

public final class PushMessageResponse extends Message<PushMessageResponse, C17927a> {
    public static final ProtoAdapter<PushMessageResponse> ADAPTER = new C17928b();
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;
    public final List<MessageItem> message_items;

    public static final class MessageItem extends Message<MessageItem, C17925a> {
        public static final ProtoAdapter<MessageItem> ADAPTER = new C17926b();
        public static final ItemType DEFAULT_ITEM_TYPE = ItemType.UNKNOWN_MESSAGE;
        private static final long serialVersionUID = 0;
        public final String item_id;
        public final ItemType item_type;

        public enum ItemType implements WireEnum {
            UNKNOWN_MESSAGE(0),
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
                if (i == 0) {
                    return UNKNOWN_MESSAGE;
                }
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

        /* renamed from: com.bytedance.lark.pb.im.v1.PushMessageResponse$MessageItem$b */
        private static final class C17926b extends ProtoAdapter<MessageItem> {
            C17926b() {
                super(FieldEncoding.LENGTH_DELIMITED, MessageItem.class);
            }

            /* renamed from: a */
            public int encodedSize(MessageItem messageItem) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, messageItem.item_id) + ItemType.ADAPTER.encodedSizeWithTag(2, messageItem.item_type) + messageItem.unknownFields().size();
            }

            /* renamed from: a */
            public MessageItem decode(ProtoReader protoReader) throws IOException {
                C17925a aVar = new C17925a();
                aVar.f45015a = "";
                aVar.f45016b = ItemType.UNKNOWN_MESSAGE;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f45015a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f45016b = ItemType.ADAPTER.decode(protoReader);
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
        public C17925a newBuilder() {
            C17925a aVar = new C17925a();
            aVar.f45015a = this.item_id;
            aVar.f45016b = this.item_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.PushMessageResponse$MessageItem$a */
        public static final class C17925a extends Message.Builder<MessageItem, C17925a> {

            /* renamed from: a */
            public String f45015a;

            /* renamed from: b */
            public ItemType f45016b;

            /* renamed from: a */
            public MessageItem build() {
                ItemType itemType;
                String str = this.f45015a;
                if (str != null && (itemType = this.f45016b) != null) {
                    return new MessageItem(str, itemType, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "item_id", this.f45016b, "item_type");
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

    /* renamed from: com.bytedance.lark.pb.im.v1.PushMessageResponse$b */
    private static final class C17928b extends ProtoAdapter<PushMessageResponse> {
        C17928b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushMessageResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PushMessageResponse pushMessageResponse) {
            return MessageItem.ADAPTER.asRepeated().encodedSizeWithTag(1, pushMessageResponse.message_items) + C14928Entity.ADAPTER.encodedSizeWithTag(2, pushMessageResponse.entity) + pushMessageResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PushMessageResponse decode(ProtoReader protoReader) throws IOException {
            C17927a aVar = new C17927a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45017a.add(MessageItem.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45018b = C14928Entity.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushMessageResponse pushMessageResponse) throws IOException {
            MessageItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pushMessageResponse.message_items);
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 2, pushMessageResponse.entity);
            protoWriter.writeBytes(pushMessageResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushMessageResponse$a */
    public static final class C17927a extends Message.Builder<PushMessageResponse, C17927a> {

        /* renamed from: a */
        public List<MessageItem> f45017a = Internal.newMutableList();

        /* renamed from: b */
        public C14928Entity f45018b;

        /* renamed from: a */
        public PushMessageResponse build() {
            C14928Entity entity = this.f45018b;
            if (entity != null) {
                return new PushMessageResponse(this.f45017a, entity, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(entity, "entity");
        }
    }

    @Override // com.squareup.wire.Message
    public C17927a newBuilder() {
        C17927a aVar = new C17927a();
        aVar.f45017a = Internal.copyOf("message_items", this.message_items);
        aVar.f45018b = this.entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushMessageResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.message_items.isEmpty()) {
            sb.append(", message_items=");
            sb.append(this.message_items);
        }
        sb.append(", entity=");
        sb.append(this.entity);
        StringBuilder replace = sb.replace(0, 2, "PushMessageResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PushMessageResponse(List<MessageItem> list, C14928Entity entity2) {
        this(list, entity2, ByteString.EMPTY);
    }

    public PushMessageResponse(List<MessageItem> list, C14928Entity entity2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_items = Internal.immutableCopyOf("message_items", list);
        this.entity = entity2;
    }
}
