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
import java.util.Map;
import okio.ByteString;

public final class GetChatMessagesResponse extends Message<GetChatMessagesResponse, C17532a> {
    public static final ProtoAdapter<GetChatMessagesResponse> ADAPTER = new C17533b();
    public static final Long DEFAULT_COST = 0L;
    public static final Boolean DEFAULT_DATA_COMPLETE = false;
    private static final long serialVersionUID = 0;
    public final Long cost;
    public final Boolean data_complete;
    public final C14928Entity entity;
    public final List<Integer> invalid_positions;
    public final List<MessageItem> message_items;
    public final Map<String, Boolean> messages_sync_pipe_finished;
    public final List<Integer> missing_positions;
    public final List<Long> net_costs;

    public static final class MessageItem extends Message<MessageItem, C17530a> {
        public static final ProtoAdapter<MessageItem> ADAPTER = new C17531b();
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

        /* renamed from: com.bytedance.lark.pb.im.v1.GetChatMessagesResponse$MessageItem$b */
        private static final class C17531b extends ProtoAdapter<MessageItem> {
            C17531b() {
                super(FieldEncoding.LENGTH_DELIMITED, MessageItem.class);
            }

            /* renamed from: a */
            public int encodedSize(MessageItem messageItem) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, messageItem.item_id) + ItemType.ADAPTER.encodedSizeWithTag(2, messageItem.item_type) + messageItem.unknownFields().size();
            }

            /* renamed from: a */
            public MessageItem decode(ProtoReader protoReader) throws IOException {
                C17530a aVar = new C17530a();
                aVar.f44473a = "";
                aVar.f44474b = ItemType.NORMAL_MESSAGE;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f44473a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f44474b = ItemType.ADAPTER.decode(protoReader);
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
        public C17530a newBuilder() {
            C17530a aVar = new C17530a();
            aVar.f44473a = this.item_id;
            aVar.f44474b = this.item_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.GetChatMessagesResponse$MessageItem$a */
        public static final class C17530a extends Message.Builder<MessageItem, C17530a> {

            /* renamed from: a */
            public String f44473a;

            /* renamed from: b */
            public ItemType f44474b;

            /* renamed from: a */
            public MessageItem build() {
                ItemType itemType;
                String str = this.f44473a;
                if (str != null && (itemType = this.f44474b) != null) {
                    return new MessageItem(str, itemType, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "item_id", this.f44474b, "item_type");
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

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatMessagesResponse$a */
    public static final class C17532a extends Message.Builder<GetChatMessagesResponse, C17532a> {

        /* renamed from: a */
        public List<MessageItem> f44475a = Internal.newMutableList();

        /* renamed from: b */
        public List<Integer> f44476b = Internal.newMutableList();

        /* renamed from: c */
        public C14928Entity f44477c;

        /* renamed from: d */
        public Boolean f44478d;

        /* renamed from: e */
        public List<Integer> f44479e = Internal.newMutableList();

        /* renamed from: f */
        public Long f44480f;

        /* renamed from: g */
        public Map<String, Boolean> f44481g = Internal.newMutableMap();

        /* renamed from: h */
        public List<Long> f44482h = Internal.newMutableList();

        /* renamed from: a */
        public GetChatMessagesResponse build() {
            return new GetChatMessagesResponse(this.f44475a, this.f44476b, this.f44477c, this.f44478d, this.f44479e, this.f44480f, this.f44481g, this.f44482h, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatMessagesResponse$b */
    private static final class C17533b extends ProtoAdapter<GetChatMessagesResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Boolean>> f44483a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.BOOL);

        C17533b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatMessagesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatMessagesResponse getChatMessagesResponse) {
            int i;
            int i2;
            int encodedSizeWithTag = MessageItem.ADAPTER.asRepeated().encodedSizeWithTag(1, getChatMessagesResponse.message_items) + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(2, getChatMessagesResponse.invalid_positions);
            int i3 = 0;
            if (getChatMessagesResponse.entity != null) {
                i = C14928Entity.ADAPTER.encodedSizeWithTag(3, getChatMessagesResponse.entity);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (getChatMessagesResponse.data_complete != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(4, getChatMessagesResponse.data_complete);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag2 = i4 + i2 + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(5, getChatMessagesResponse.missing_positions);
            if (getChatMessagesResponse.cost != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(100, getChatMessagesResponse.cost);
            }
            return encodedSizeWithTag2 + i3 + this.f44483a.encodedSizeWithTag(101, getChatMessagesResponse.messages_sync_pipe_finished) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(102, getChatMessagesResponse.net_costs) + getChatMessagesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatMessagesResponse decode(ProtoReader protoReader) throws IOException {
            C17532a aVar = new C17532a();
            aVar.f44478d = false;
            aVar.f44480f = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44475a.add(MessageItem.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f44476b.add(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f44477c = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f44478d = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 5) {
                    switch (nextTag) {
                        case 100:
                            aVar.f44480f = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 101:
                            aVar.f44481g.putAll(this.f44483a.decode(protoReader));
                            continue;
                        case 102:
                            aVar.f44482h.add(ProtoAdapter.INT64.decode(protoReader));
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    aVar.f44479e.add(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatMessagesResponse getChatMessagesResponse) throws IOException {
            MessageItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getChatMessagesResponse.message_items);
            ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 2, getChatMessagesResponse.invalid_positions);
            if (getChatMessagesResponse.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 3, getChatMessagesResponse.entity);
            }
            if (getChatMessagesResponse.data_complete != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, getChatMessagesResponse.data_complete);
            }
            ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 5, getChatMessagesResponse.missing_positions);
            if (getChatMessagesResponse.cost != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 100, getChatMessagesResponse.cost);
            }
            this.f44483a.encodeWithTag(protoWriter, 101, getChatMessagesResponse.messages_sync_pipe_finished);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 102, getChatMessagesResponse.net_costs);
            protoWriter.writeBytes(getChatMessagesResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17532a newBuilder() {
        C17532a aVar = new C17532a();
        aVar.f44475a = Internal.copyOf("message_items", this.message_items);
        aVar.f44476b = Internal.copyOf("invalid_positions", this.invalid_positions);
        aVar.f44477c = this.entity;
        aVar.f44478d = this.data_complete;
        aVar.f44479e = Internal.copyOf("missing_positions", this.missing_positions);
        aVar.f44480f = this.cost;
        aVar.f44481g = Internal.copyOf("messages_sync_pipe_finished", this.messages_sync_pipe_finished);
        aVar.f44482h = Internal.copyOf("net_costs", this.net_costs);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatMessagesResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.message_items.isEmpty()) {
            sb.append(", message_items=");
            sb.append(this.message_items);
        }
        if (!this.invalid_positions.isEmpty()) {
            sb.append(", invalid_positions=");
            sb.append(this.invalid_positions);
        }
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        if (this.data_complete != null) {
            sb.append(", data_complete=");
            sb.append(this.data_complete);
        }
        if (!this.missing_positions.isEmpty()) {
            sb.append(", missing_positions=");
            sb.append(this.missing_positions);
        }
        if (this.cost != null) {
            sb.append(", cost=");
            sb.append(this.cost);
        }
        if (!this.messages_sync_pipe_finished.isEmpty()) {
            sb.append(", messages_sync_pipe_finished=");
            sb.append(this.messages_sync_pipe_finished);
        }
        if (!this.net_costs.isEmpty()) {
            sb.append(", net_costs=");
            sb.append(this.net_costs);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatMessagesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatMessagesResponse(List<MessageItem> list, List<Integer> list2, C14928Entity entity2, Boolean bool, List<Integer> list3, Long l, Map<String, Boolean> map, List<Long> list4) {
        this(list, list2, entity2, bool, list3, l, map, list4, ByteString.EMPTY);
    }

    public GetChatMessagesResponse(List<MessageItem> list, List<Integer> list2, C14928Entity entity2, Boolean bool, List<Integer> list3, Long l, Map<String, Boolean> map, List<Long> list4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_items = Internal.immutableCopyOf("message_items", list);
        this.invalid_positions = Internal.immutableCopyOf("invalid_positions", list2);
        this.entity = entity2;
        this.data_complete = bool;
        this.missing_positions = Internal.immutableCopyOf("missing_positions", list3);
        this.cost = l;
        this.messages_sync_pipe_finished = Internal.immutableCopyOf("messages_sync_pipe_finished", map);
        this.net_costs = Internal.immutableCopyOf("net_costs", list4);
    }
}
