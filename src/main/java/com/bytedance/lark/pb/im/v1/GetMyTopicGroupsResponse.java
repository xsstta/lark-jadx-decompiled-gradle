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

public final class GetMyTopicGroupsResponse extends Message<GetMyTopicGroupsResponse, C17655a> {
    public static final ProtoAdapter<GetMyTopicGroupsResponse> ADAPTER = new C17656b();
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;
    public final ItemList item_list;
    public final String next_cursor;

    public static final class GroupItem extends Message<GroupItem, C17651a> {
        public static final ProtoAdapter<GroupItem> ADAPTER = new C17652b();
        private static final long serialVersionUID = 0;
        public final String item_id;

        /* renamed from: com.bytedance.lark.pb.im.v1.GetMyTopicGroupsResponse$GroupItem$b */
        private static final class C17652b extends ProtoAdapter<GroupItem> {
            C17652b() {
                super(FieldEncoding.LENGTH_DELIMITED, GroupItem.class);
            }

            /* renamed from: a */
            public int encodedSize(GroupItem groupItem) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, groupItem.item_id) + groupItem.unknownFields().size();
            }

            /* renamed from: a */
            public GroupItem decode(ProtoReader protoReader) throws IOException {
                C17651a aVar = new C17651a();
                aVar.f44661a = "";
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
                        aVar.f44661a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, GroupItem groupItem) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, groupItem.item_id);
                protoWriter.writeBytes(groupItem.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.GetMyTopicGroupsResponse$GroupItem$a */
        public static final class C17651a extends Message.Builder<GroupItem, C17651a> {

            /* renamed from: a */
            public String f44661a;

            /* renamed from: a */
            public GroupItem build() {
                String str = this.f44661a;
                if (str != null) {
                    return new GroupItem(str, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "item_id");
            }
        }

        @Override // com.squareup.wire.Message
        public C17651a newBuilder() {
            C17651a aVar = new C17651a();
            aVar.f44661a = this.item_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "GroupItem");
            StringBuilder sb = new StringBuilder();
            sb.append(", item_id=");
            sb.append(this.item_id);
            StringBuilder replace = sb.replace(0, 2, "GroupItem{");
            replace.append('}');
            return replace.toString();
        }

        public GroupItem(String str) {
            this(str, ByteString.EMPTY);
        }

        public GroupItem(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.item_id = str;
        }
    }

    public static final class ItemList extends Message<ItemList, C17653a> {
        public static final ProtoAdapter<ItemList> ADAPTER = new C17654b();
        private static final long serialVersionUID = 0;
        public final List<GroupItem> items;

        /* renamed from: com.bytedance.lark.pb.im.v1.GetMyTopicGroupsResponse$ItemList$b */
        private static final class C17654b extends ProtoAdapter<ItemList> {
            C17654b() {
                super(FieldEncoding.LENGTH_DELIMITED, ItemList.class);
            }

            /* renamed from: a */
            public int encodedSize(ItemList itemList) {
                return GroupItem.ADAPTER.asRepeated().encodedSizeWithTag(1, itemList.items) + itemList.unknownFields().size();
            }

            /* renamed from: a */
            public ItemList decode(ProtoReader protoReader) throws IOException {
                C17653a aVar = new C17653a();
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
                        aVar.f44662a.add(GroupItem.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ItemList itemList) throws IOException {
                GroupItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, itemList.items);
                protoWriter.writeBytes(itemList.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.GetMyTopicGroupsResponse$ItemList$a */
        public static final class C17653a extends Message.Builder<ItemList, C17653a> {

            /* renamed from: a */
            public List<GroupItem> f44662a = Internal.newMutableList();

            /* renamed from: a */
            public ItemList build() {
                return new ItemList(this.f44662a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C17653a newBuilder() {
            C17653a aVar = new C17653a();
            aVar.f44662a = Internal.copyOf("items", this.items);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "ItemList");
            StringBuilder sb = new StringBuilder();
            if (!this.items.isEmpty()) {
                sb.append(", items=");
                sb.append(this.items);
            }
            StringBuilder replace = sb.replace(0, 2, "ItemList{");
            replace.append('}');
            return replace.toString();
        }

        public ItemList(List<GroupItem> list) {
            this(list, ByteString.EMPTY);
        }

        public ItemList(List<GroupItem> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.items = Internal.immutableCopyOf("items", list);
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMyTopicGroupsResponse$b */
    private static final class C17656b extends ProtoAdapter<GetMyTopicGroupsResponse> {
        C17656b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMyTopicGroupsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMyTopicGroupsResponse getMyTopicGroupsResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (getMyTopicGroupsResponse.entity != null) {
                i = C14928Entity.ADAPTER.encodedSizeWithTag(1, getMyTopicGroupsResponse.entity);
            } else {
                i = 0;
            }
            if (getMyTopicGroupsResponse.next_cursor != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getMyTopicGroupsResponse.next_cursor);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (getMyTopicGroupsResponse.item_list != null) {
                i3 = ItemList.ADAPTER.encodedSizeWithTag(3, getMyTopicGroupsResponse.item_list);
            }
            return i4 + i3 + getMyTopicGroupsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetMyTopicGroupsResponse decode(ProtoReader protoReader) throws IOException {
            C17655a aVar = new C17655a();
            aVar.f44664b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44663a = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44664b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.mo61712a(ItemList.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMyTopicGroupsResponse getMyTopicGroupsResponse) throws IOException {
            if (getMyTopicGroupsResponse.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 1, getMyTopicGroupsResponse.entity);
            }
            if (getMyTopicGroupsResponse.next_cursor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getMyTopicGroupsResponse.next_cursor);
            }
            if (getMyTopicGroupsResponse.item_list != null) {
                ItemList.ADAPTER.encodeWithTag(protoWriter, 3, getMyTopicGroupsResponse.item_list);
            }
            protoWriter.writeBytes(getMyTopicGroupsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMyTopicGroupsResponse$a */
    public static final class C17655a extends Message.Builder<GetMyTopicGroupsResponse, C17655a> {

        /* renamed from: a */
        public C14928Entity f44663a;

        /* renamed from: b */
        public String f44664b;

        /* renamed from: c */
        public ItemList f44665c;

        /* renamed from: a */
        public GetMyTopicGroupsResponse build() {
            return new GetMyTopicGroupsResponse(this.f44663a, this.f44664b, this.f44665c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17655a mo61712a(ItemList itemList) {
            this.f44665c = itemList;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17655a newBuilder() {
        C17655a aVar = new C17655a();
        aVar.f44663a = this.entity;
        aVar.f44664b = this.next_cursor;
        aVar.f44665c = this.item_list;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetMyTopicGroupsResponse");
        StringBuilder sb = new StringBuilder();
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        if (this.item_list != null) {
            sb.append(", item_list=");
            sb.append(this.item_list);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMyTopicGroupsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetMyTopicGroupsResponse(C14928Entity entity2, String str, ItemList itemList) {
        this(entity2, str, itemList, ByteString.EMPTY);
    }

    public GetMyTopicGroupsResponse(C14928Entity entity2, String str, ItemList itemList, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity = entity2;
        this.next_cursor = str;
        this.item_list = itemList;
    }
}
