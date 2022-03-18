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

public final class PushTopicGroups extends Message<PushTopicGroups, C17961a> {
    public static final ProtoAdapter<PushTopicGroups> ADAPTER = new C17962b();
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;
    public final List<Item> items;

    public static final class Item extends Message<Item, C17959a> {
        public static final ProtoAdapter<Item> ADAPTER = new C17960b();
        private static final long serialVersionUID = 0;
        public final String item_id;

        /* renamed from: com.bytedance.lark.pb.im.v1.PushTopicGroups$Item$b */
        private static final class C17960b extends ProtoAdapter<Item> {
            C17960b() {
                super(FieldEncoding.LENGTH_DELIMITED, Item.class);
            }

            /* renamed from: a */
            public int encodedSize(Item item) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, item.item_id) + item.unknownFields().size();
            }

            /* renamed from: a */
            public Item decode(ProtoReader protoReader) throws IOException {
                C17959a aVar = new C17959a();
                aVar.f45050a = "";
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
                        aVar.f45050a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Item item) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, item.item_id);
                protoWriter.writeBytes(item.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.PushTopicGroups$Item$a */
        public static final class C17959a extends Message.Builder<Item, C17959a> {

            /* renamed from: a */
            public String f45050a;

            /* renamed from: a */
            public Item build() {
                String str = this.f45050a;
                if (str != null) {
                    return new Item(str, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "item_id");
            }
        }

        @Override // com.squareup.wire.Message
        public C17959a newBuilder() {
            C17959a aVar = new C17959a();
            aVar.f45050a = this.item_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "Item");
            StringBuilder sb = new StringBuilder();
            sb.append(", item_id=");
            sb.append(this.item_id);
            StringBuilder replace = sb.replace(0, 2, "Item{");
            replace.append('}');
            return replace.toString();
        }

        public Item(String str) {
            this(str, ByteString.EMPTY);
        }

        public Item(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.item_id = str;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushTopicGroups$b */
    private static final class C17962b extends ProtoAdapter<PushTopicGroups> {
        C17962b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushTopicGroups.class);
        }

        /* renamed from: a */
        public int encodedSize(PushTopicGroups pushTopicGroups) {
            return C14928Entity.ADAPTER.encodedSizeWithTag(1, pushTopicGroups.entity) + Item.ADAPTER.asRepeated().encodedSizeWithTag(2, pushTopicGroups.items) + pushTopicGroups.unknownFields().size();
        }

        /* renamed from: a */
        public PushTopicGroups decode(ProtoReader protoReader) throws IOException {
            C17961a aVar = new C17961a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45051a = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45052b.add(Item.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushTopicGroups pushTopicGroups) throws IOException {
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 1, pushTopicGroups.entity);
            Item.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, pushTopicGroups.items);
            protoWriter.writeBytes(pushTopicGroups.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushTopicGroups$a */
    public static final class C17961a extends Message.Builder<PushTopicGroups, C17961a> {

        /* renamed from: a */
        public C14928Entity f45051a;

        /* renamed from: b */
        public List<Item> f45052b = Internal.newMutableList();

        /* renamed from: a */
        public PushTopicGroups build() {
            C14928Entity entity = this.f45051a;
            if (entity != null) {
                return new PushTopicGroups(entity, this.f45052b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(entity, "entity");
        }
    }

    @Override // com.squareup.wire.Message
    public C17961a newBuilder() {
        C17961a aVar = new C17961a();
        aVar.f45051a = this.entity;
        aVar.f45052b = Internal.copyOf("items", this.items);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushTopicGroups");
        StringBuilder sb = new StringBuilder();
        sb.append(", entity=");
        sb.append(this.entity);
        if (!this.items.isEmpty()) {
            sb.append(", items=");
            sb.append(this.items);
        }
        StringBuilder replace = sb.replace(0, 2, "PushTopicGroups{");
        replace.append('}');
        return replace.toString();
    }

    public PushTopicGroups(C14928Entity entity2, List<Item> list) {
        this(entity2, list, ByteString.EMPTY);
    }

    public PushTopicGroups(C14928Entity entity2, List<Item> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity = entity2;
        this.items = Internal.immutableCopyOf("items", list);
    }
}
