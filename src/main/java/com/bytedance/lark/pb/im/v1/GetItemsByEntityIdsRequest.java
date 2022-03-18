package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Item;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetItemsByEntityIdsRequest extends Message<GetItemsByEntityIdsRequest, C17601a> {
    public static final ProtoAdapter<GetItemsByEntityIdsRequest> ADAPTER = new C17602b();
    public static final SyncDataStrategy DEFAULT_STRATEGY = SyncDataStrategy.TRY_LOCAL;
    private static final long serialVersionUID = 0;
    public final List<ItemUniqId> item_entity_ids;
    public final SyncDataStrategy strategy;

    public static final class ItemUniqId extends Message<ItemUniqId, C17599a> {
        public static final ProtoAdapter<ItemUniqId> ADAPTER = new C17600b();
        public static final Item.Type DEFAULT_ENTITY_TYPE = Item.Type.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final String entity_id;
        public final Item.Type entity_type;

        /* renamed from: com.bytedance.lark.pb.im.v1.GetItemsByEntityIdsRequest$ItemUniqId$b */
        private static final class C17600b extends ProtoAdapter<ItemUniqId> {
            C17600b() {
                super(FieldEncoding.LENGTH_DELIMITED, ItemUniqId.class);
            }

            /* renamed from: a */
            public int encodedSize(ItemUniqId itemUniqId) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, itemUniqId.entity_id) + Item.Type.ADAPTER.encodedSizeWithTag(2, itemUniqId.entity_type) + itemUniqId.unknownFields().size();
            }

            /* renamed from: a */
            public ItemUniqId decode(ProtoReader protoReader) throws IOException {
                C17599a aVar = new C17599a();
                aVar.f44586a = "";
                aVar.f44587b = Item.Type.UNKNOWN;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f44586a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f44587b = Item.Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ItemUniqId itemUniqId) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, itemUniqId.entity_id);
                Item.Type.ADAPTER.encodeWithTag(protoWriter, 2, itemUniqId.entity_type);
                protoWriter.writeBytes(itemUniqId.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C17599a newBuilder() {
            C17599a aVar = new C17599a();
            aVar.f44586a = this.entity_id;
            aVar.f44587b = this.entity_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.GetItemsByEntityIdsRequest$ItemUniqId$a */
        public static final class C17599a extends Message.Builder<ItemUniqId, C17599a> {

            /* renamed from: a */
            public String f44586a;

            /* renamed from: b */
            public Item.Type f44587b;

            /* renamed from: a */
            public ItemUniqId build() {
                Item.Type type;
                String str = this.f44586a;
                if (str != null && (type = this.f44587b) != null) {
                    return new ItemUniqId(str, type, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "entity_id", this.f44587b, "entity_type");
            }

            /* renamed from: a */
            public C17599a mo61574a(Item.Type type) {
                this.f44587b = type;
                return this;
            }

            /* renamed from: a */
            public C17599a mo61575a(String str) {
                this.f44586a = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "ItemUniqId");
            StringBuilder sb = new StringBuilder();
            sb.append(", entity_id=");
            sb.append(this.entity_id);
            sb.append(", entity_type=");
            sb.append(this.entity_type);
            StringBuilder replace = sb.replace(0, 2, "ItemUniqId{");
            replace.append('}');
            return replace.toString();
        }

        public ItemUniqId(String str, Item.Type type) {
            this(str, type, ByteString.EMPTY);
        }

        public ItemUniqId(String str, Item.Type type, ByteString byteString) {
            super(ADAPTER, byteString);
            this.entity_id = str;
            this.entity_type = type;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetItemsByEntityIdsRequest$b */
    private static final class C17602b extends ProtoAdapter<GetItemsByEntityIdsRequest> {
        C17602b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetItemsByEntityIdsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetItemsByEntityIdsRequest getItemsByEntityIdsRequest) {
            int i;
            int encodedSizeWithTag = ItemUniqId.ADAPTER.asRepeated().encodedSizeWithTag(1, getItemsByEntityIdsRequest.item_entity_ids);
            if (getItemsByEntityIdsRequest.strategy != null) {
                i = SyncDataStrategy.ADAPTER.encodedSizeWithTag(2, getItemsByEntityIdsRequest.strategy);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getItemsByEntityIdsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetItemsByEntityIdsRequest decode(ProtoReader protoReader) throws IOException {
            C17601a aVar = new C17601a();
            aVar.f44589b = SyncDataStrategy.TRY_LOCAL;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44588a.add(ItemUniqId.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f44589b = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetItemsByEntityIdsRequest getItemsByEntityIdsRequest) throws IOException {
            ItemUniqId.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getItemsByEntityIdsRequest.item_entity_ids);
            if (getItemsByEntityIdsRequest.strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 2, getItemsByEntityIdsRequest.strategy);
            }
            protoWriter.writeBytes(getItemsByEntityIdsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetItemsByEntityIdsRequest$a */
    public static final class C17601a extends Message.Builder<GetItemsByEntityIdsRequest, C17601a> {

        /* renamed from: a */
        public List<ItemUniqId> f44588a = Internal.newMutableList();

        /* renamed from: b */
        public SyncDataStrategy f44589b;

        /* renamed from: a */
        public GetItemsByEntityIdsRequest build() {
            return new GetItemsByEntityIdsRequest(this.f44588a, this.f44589b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17601a mo61580a(List<ItemUniqId> list) {
            Internal.checkElementsNotNull(list);
            this.f44588a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17601a newBuilder() {
        C17601a aVar = new C17601a();
        aVar.f44588a = Internal.copyOf("item_entity_ids", this.item_entity_ids);
        aVar.f44589b = this.strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetItemsByEntityIdsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.item_entity_ids.isEmpty()) {
            sb.append(", item_entity_ids=");
            sb.append(this.item_entity_ids);
        }
        if (this.strategy != null) {
            sb.append(", strategy=");
            sb.append(this.strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetItemsByEntityIdsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetItemsByEntityIdsRequest(List<ItemUniqId> list, SyncDataStrategy syncDataStrategy) {
        this(list, syncDataStrategy, ByteString.EMPTY);
    }

    public GetItemsByEntityIdsRequest(List<ItemUniqId> list, SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.item_entity_ids = Internal.immutableCopyOf("item_entity_ids", list);
        this.strategy = syncDataStrategy;
    }
}
