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

public final class GetThreadMessagesV2Response extends Message<GetThreadMessagesV2Response, C17707a> {
    public static final ProtoAdapter<GetThreadMessagesV2Response> ADAPTER = new C17708b();
    public static final Boolean DEFAULT_DATA_COMPLETE = false;
    private static final long serialVersionUID = 0;
    public final Boolean data_complete;
    public final C14928Entity entity;
    public final List<Integer> invalid_positions;
    public final List<MessageItem> message_items;
    public final List<Integer> missing_positions;

    public static final class MessageItem extends Message<MessageItem, C17705a> {
        public static final ProtoAdapter<MessageItem> ADAPTER = new C17706b();
        public static final ChannelDataType DEFAULT_ITEM_TYPE = ChannelDataType.NORMAL_DATA;
        private static final long serialVersionUID = 0;
        public final String item_id;
        public final ChannelDataType item_type;

        /* renamed from: com.bytedance.lark.pb.im.v1.GetThreadMessagesV2Response$MessageItem$b */
        private static final class C17706b extends ProtoAdapter<MessageItem> {
            C17706b() {
                super(FieldEncoding.LENGTH_DELIMITED, MessageItem.class);
            }

            /* renamed from: a */
            public int encodedSize(MessageItem messageItem) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, messageItem.item_id) + ChannelDataType.ADAPTER.encodedSizeWithTag(2, messageItem.item_type) + messageItem.unknownFields().size();
            }

            /* renamed from: a */
            public MessageItem decode(ProtoReader protoReader) throws IOException {
                C17705a aVar = new C17705a();
                aVar.f44733a = "";
                aVar.f44734b = ChannelDataType.NORMAL_DATA;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f44733a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f44734b = ChannelDataType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MessageItem messageItem) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, messageItem.item_id);
                ChannelDataType.ADAPTER.encodeWithTag(protoWriter, 2, messageItem.item_type);
                protoWriter.writeBytes(messageItem.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C17705a newBuilder() {
            C17705a aVar = new C17705a();
            aVar.f44733a = this.item_id;
            aVar.f44734b = this.item_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.GetThreadMessagesV2Response$MessageItem$a */
        public static final class C17705a extends Message.Builder<MessageItem, C17705a> {

            /* renamed from: a */
            public String f44733a;

            /* renamed from: b */
            public ChannelDataType f44734b;

            /* renamed from: a */
            public MessageItem build() {
                ChannelDataType channelDataType;
                String str = this.f44733a;
                if (str != null && (channelDataType = this.f44734b) != null) {
                    return new MessageItem(str, channelDataType, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "item_id", this.f44734b, "item_type");
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

        public MessageItem(String str, ChannelDataType channelDataType) {
            this(str, channelDataType, ByteString.EMPTY);
        }

        public MessageItem(String str, ChannelDataType channelDataType, ByteString byteString) {
            super(ADAPTER, byteString);
            this.item_id = str;
            this.item_type = channelDataType;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetThreadMessagesV2Response$b */
    private static final class C17708b extends ProtoAdapter<GetThreadMessagesV2Response> {
        C17708b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetThreadMessagesV2Response.class);
        }

        /* renamed from: a */
        public int encodedSize(GetThreadMessagesV2Response getThreadMessagesV2Response) {
            int i;
            int encodedSizeWithTag = MessageItem.ADAPTER.asRepeated().encodedSizeWithTag(1, getThreadMessagesV2Response.message_items) + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(2, getThreadMessagesV2Response.invalid_positions);
            int i2 = 0;
            if (getThreadMessagesV2Response.entity != null) {
                i = C14928Entity.ADAPTER.encodedSizeWithTag(3, getThreadMessagesV2Response.entity);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getThreadMessagesV2Response.data_complete != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(4, getThreadMessagesV2Response.data_complete);
            }
            return i3 + i2 + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(5, getThreadMessagesV2Response.missing_positions) + getThreadMessagesV2Response.unknownFields().size();
        }

        /* renamed from: a */
        public GetThreadMessagesV2Response decode(ProtoReader protoReader) throws IOException {
            C17707a aVar = new C17707a();
            aVar.f44738d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44735a.add(MessageItem.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f44736b.add(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f44737c = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f44738d = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44739e.add(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetThreadMessagesV2Response getThreadMessagesV2Response) throws IOException {
            MessageItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getThreadMessagesV2Response.message_items);
            ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 2, getThreadMessagesV2Response.invalid_positions);
            if (getThreadMessagesV2Response.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 3, getThreadMessagesV2Response.entity);
            }
            if (getThreadMessagesV2Response.data_complete != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, getThreadMessagesV2Response.data_complete);
            }
            ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 5, getThreadMessagesV2Response.missing_positions);
            protoWriter.writeBytes(getThreadMessagesV2Response.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetThreadMessagesV2Response$a */
    public static final class C17707a extends Message.Builder<GetThreadMessagesV2Response, C17707a> {

        /* renamed from: a */
        public List<MessageItem> f44735a = Internal.newMutableList();

        /* renamed from: b */
        public List<Integer> f44736b = Internal.newMutableList();

        /* renamed from: c */
        public C14928Entity f44737c;

        /* renamed from: d */
        public Boolean f44738d;

        /* renamed from: e */
        public List<Integer> f44739e = Internal.newMutableList();

        /* renamed from: a */
        public GetThreadMessagesV2Response build() {
            return new GetThreadMessagesV2Response(this.f44735a, this.f44736b, this.f44737c, this.f44738d, this.f44739e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17707a newBuilder() {
        C17707a aVar = new C17707a();
        aVar.f44735a = Internal.copyOf("message_items", this.message_items);
        aVar.f44736b = Internal.copyOf("invalid_positions", this.invalid_positions);
        aVar.f44737c = this.entity;
        aVar.f44738d = this.data_complete;
        aVar.f44739e = Internal.copyOf("missing_positions", this.missing_positions);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetThreadMessagesV2Response");
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
        StringBuilder replace = sb.replace(0, 2, "GetThreadMessagesV2Response{");
        replace.append('}');
        return replace.toString();
    }

    public GetThreadMessagesV2Response(List<MessageItem> list, List<Integer> list2, C14928Entity entity2, Boolean bool, List<Integer> list3) {
        this(list, list2, entity2, bool, list3, ByteString.EMPTY);
    }

    public GetThreadMessagesV2Response(List<MessageItem> list, List<Integer> list2, C14928Entity entity2, Boolean bool, List<Integer> list3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_items = Internal.immutableCopyOf("message_items", list);
        this.invalid_positions = Internal.immutableCopyOf("invalid_positions", list2);
        this.entity = entity2;
        this.data_complete = bool;
        this.missing_positions = Internal.immutableCopyOf("missing_positions", list3);
    }
}
