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

public final class PushOfflineUpdatedChats extends Message<PushOfflineUpdatedChats, C17937a> {
    public static final ProtoAdapter<PushOfflineUpdatedChats> ADAPTER = new C17938b();
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;
    public final List<UpdatedItem> updated_items;

    public static final class UpdatedItem extends Message<UpdatedItem, C17935a> {
        public static final ProtoAdapter<UpdatedItem> ADAPTER = new C17936b();
        public static final Type DEFAULT_ITEM_TYPE = Type.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final String item_id;
        public final Type item_type;

        public enum Type implements WireEnum {
            UNKNOWN(0),
            CHAT(1),
            THREAD(2);
            
            public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Type fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return CHAT;
                }
                if (i != 2) {
                    return null;
                }
                return THREAD;
            }

            private Type(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.PushOfflineUpdatedChats$UpdatedItem$b */
        private static final class C17936b extends ProtoAdapter<UpdatedItem> {
            C17936b() {
                super(FieldEncoding.LENGTH_DELIMITED, UpdatedItem.class);
            }

            /* renamed from: a */
            public int encodedSize(UpdatedItem updatedItem) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, updatedItem.item_id) + Type.ADAPTER.encodedSizeWithTag(2, updatedItem.item_type) + updatedItem.unknownFields().size();
            }

            /* renamed from: a */
            public UpdatedItem decode(ProtoReader protoReader) throws IOException {
                C17935a aVar = new C17935a();
                aVar.f45027a = "";
                aVar.f45028b = Type.UNKNOWN;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f45027a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f45028b = Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, UpdatedItem updatedItem) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, updatedItem.item_id);
                Type.ADAPTER.encodeWithTag(protoWriter, 2, updatedItem.item_type);
                protoWriter.writeBytes(updatedItem.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C17935a newBuilder() {
            C17935a aVar = new C17935a();
            aVar.f45027a = this.item_id;
            aVar.f45028b = this.item_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.PushOfflineUpdatedChats$UpdatedItem$a */
        public static final class C17935a extends Message.Builder<UpdatedItem, C17935a> {

            /* renamed from: a */
            public String f45027a;

            /* renamed from: b */
            public Type f45028b;

            /* renamed from: a */
            public UpdatedItem build() {
                Type type;
                String str = this.f45027a;
                if (str != null && (type = this.f45028b) != null) {
                    return new UpdatedItem(str, type, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "item_id", this.f45028b, "item_type");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "UpdatedItem");
            StringBuilder sb = new StringBuilder();
            sb.append(", item_id=");
            sb.append(this.item_id);
            sb.append(", item_type=");
            sb.append(this.item_type);
            StringBuilder replace = sb.replace(0, 2, "UpdatedItem{");
            replace.append('}');
            return replace.toString();
        }

        public UpdatedItem(String str, Type type) {
            this(str, type, ByteString.EMPTY);
        }

        public UpdatedItem(String str, Type type, ByteString byteString) {
            super(ADAPTER, byteString);
            this.item_id = str;
            this.item_type = type;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushOfflineUpdatedChats$b */
    private static final class C17938b extends ProtoAdapter<PushOfflineUpdatedChats> {
        C17938b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushOfflineUpdatedChats.class);
        }

        /* renamed from: a */
        public int encodedSize(PushOfflineUpdatedChats pushOfflineUpdatedChats) {
            int i;
            int encodedSizeWithTag = UpdatedItem.ADAPTER.asRepeated().encodedSizeWithTag(1, pushOfflineUpdatedChats.updated_items);
            if (pushOfflineUpdatedChats.entity != null) {
                i = C14928Entity.ADAPTER.encodedSizeWithTag(2, pushOfflineUpdatedChats.entity);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + pushOfflineUpdatedChats.unknownFields().size();
        }

        /* renamed from: a */
        public PushOfflineUpdatedChats decode(ProtoReader protoReader) throws IOException {
            C17937a aVar = new C17937a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45029a.add(UpdatedItem.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45030b = C14928Entity.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushOfflineUpdatedChats pushOfflineUpdatedChats) throws IOException {
            UpdatedItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pushOfflineUpdatedChats.updated_items);
            if (pushOfflineUpdatedChats.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 2, pushOfflineUpdatedChats.entity);
            }
            protoWriter.writeBytes(pushOfflineUpdatedChats.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushOfflineUpdatedChats$a */
    public static final class C17937a extends Message.Builder<PushOfflineUpdatedChats, C17937a> {

        /* renamed from: a */
        public List<UpdatedItem> f45029a = Internal.newMutableList();

        /* renamed from: b */
        public C14928Entity f45030b;

        /* renamed from: a */
        public PushOfflineUpdatedChats build() {
            return new PushOfflineUpdatedChats(this.f45029a, this.f45030b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17937a newBuilder() {
        C17937a aVar = new C17937a();
        aVar.f45029a = Internal.copyOf("updated_items", this.updated_items);
        aVar.f45030b = this.entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushOfflineUpdatedChats");
        StringBuilder sb = new StringBuilder();
        if (!this.updated_items.isEmpty()) {
            sb.append(", updated_items=");
            sb.append(this.updated_items);
        }
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        StringBuilder replace = sb.replace(0, 2, "PushOfflineUpdatedChats{");
        replace.append('}');
        return replace.toString();
    }

    public PushOfflineUpdatedChats(List<UpdatedItem> list, C14928Entity entity2) {
        this(list, entity2, ByteString.EMPTY);
    }

    public PushOfflineUpdatedChats(List<UpdatedItem> list, C14928Entity entity2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.updated_items = Internal.immutableCopyOf("updated_items", list);
        this.entity = entity2;
    }
}
