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

public final class GetTopicGroupsToPostResponse extends Message<GetTopicGroupsToPostResponse, C17727a> {
    public static final ProtoAdapter<GetTopicGroupsToPostResponse> ADAPTER = new C17728b();
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;
    public final ItemList item_list;
    public final String next_cursor;

    public static final class GroupItem extends Message<GroupItem, C17723a> {
        public static final ProtoAdapter<GroupItem> ADAPTER = new C17724b();
        private static final long serialVersionUID = 0;
        public final String item_id;

        /* renamed from: com.bytedance.lark.pb.im.v1.GetTopicGroupsToPostResponse$GroupItem$b */
        private static final class C17724b extends ProtoAdapter<GroupItem> {
            C17724b() {
                super(FieldEncoding.LENGTH_DELIMITED, GroupItem.class);
            }

            /* renamed from: a */
            public int encodedSize(GroupItem groupItem) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, groupItem.item_id) + groupItem.unknownFields().size();
            }

            /* renamed from: a */
            public GroupItem decode(ProtoReader protoReader) throws IOException {
                C17723a aVar = new C17723a();
                aVar.f44755a = "";
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
                        aVar.f44755a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, GroupItem groupItem) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, groupItem.item_id);
                protoWriter.writeBytes(groupItem.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.GetTopicGroupsToPostResponse$GroupItem$a */
        public static final class C17723a extends Message.Builder<GroupItem, C17723a> {

            /* renamed from: a */
            public String f44755a;

            /* renamed from: a */
            public GroupItem build() {
                String str = this.f44755a;
                if (str != null) {
                    return new GroupItem(str, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "item_id");
            }
        }

        @Override // com.squareup.wire.Message
        public C17723a newBuilder() {
            C17723a aVar = new C17723a();
            aVar.f44755a = this.item_id;
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

    public static final class ItemList extends Message<ItemList, C17725a> {
        public static final ProtoAdapter<ItemList> ADAPTER = new C17726b();
        private static final long serialVersionUID = 0;
        public final List<GroupItem> items;

        /* renamed from: com.bytedance.lark.pb.im.v1.GetTopicGroupsToPostResponse$ItemList$b */
        private static final class C17726b extends ProtoAdapter<ItemList> {
            C17726b() {
                super(FieldEncoding.LENGTH_DELIMITED, ItemList.class);
            }

            /* renamed from: a */
            public int encodedSize(ItemList itemList) {
                return GroupItem.ADAPTER.asRepeated().encodedSizeWithTag(1, itemList.items) + itemList.unknownFields().size();
            }

            /* renamed from: a */
            public ItemList decode(ProtoReader protoReader) throws IOException {
                C17725a aVar = new C17725a();
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
                        aVar.f44756a.add(GroupItem.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ItemList itemList) throws IOException {
                GroupItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, itemList.items);
                protoWriter.writeBytes(itemList.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.GetTopicGroupsToPostResponse$ItemList$a */
        public static final class C17725a extends Message.Builder<ItemList, C17725a> {

            /* renamed from: a */
            public List<GroupItem> f44756a = Internal.newMutableList();

            /* renamed from: a */
            public ItemList build() {
                return new ItemList(this.f44756a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C17725a newBuilder() {
            C17725a aVar = new C17725a();
            aVar.f44756a = Internal.copyOf("items", this.items);
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

    /* renamed from: com.bytedance.lark.pb.im.v1.GetTopicGroupsToPostResponse$b */
    private static final class C17728b extends ProtoAdapter<GetTopicGroupsToPostResponse> {
        C17728b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTopicGroupsToPostResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTopicGroupsToPostResponse getTopicGroupsToPostResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (getTopicGroupsToPostResponse.entity != null) {
                i = C14928Entity.ADAPTER.encodedSizeWithTag(1, getTopicGroupsToPostResponse.entity);
            } else {
                i = 0;
            }
            if (getTopicGroupsToPostResponse.next_cursor != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getTopicGroupsToPostResponse.next_cursor);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (getTopicGroupsToPostResponse.item_list != null) {
                i3 = ItemList.ADAPTER.encodedSizeWithTag(3, getTopicGroupsToPostResponse.item_list);
            }
            return i4 + i3 + getTopicGroupsToPostResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetTopicGroupsToPostResponse decode(ProtoReader protoReader) throws IOException {
            C17727a aVar = new C17727a();
            aVar.f44758b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44757a = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44758b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.mo61891a(ItemList.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTopicGroupsToPostResponse getTopicGroupsToPostResponse) throws IOException {
            if (getTopicGroupsToPostResponse.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 1, getTopicGroupsToPostResponse.entity);
            }
            if (getTopicGroupsToPostResponse.next_cursor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getTopicGroupsToPostResponse.next_cursor);
            }
            if (getTopicGroupsToPostResponse.item_list != null) {
                ItemList.ADAPTER.encodeWithTag(protoWriter, 3, getTopicGroupsToPostResponse.item_list);
            }
            protoWriter.writeBytes(getTopicGroupsToPostResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetTopicGroupsToPostResponse$a */
    public static final class C17727a extends Message.Builder<GetTopicGroupsToPostResponse, C17727a> {

        /* renamed from: a */
        public C14928Entity f44757a;

        /* renamed from: b */
        public String f44758b;

        /* renamed from: c */
        public ItemList f44759c;

        /* renamed from: a */
        public GetTopicGroupsToPostResponse build() {
            return new GetTopicGroupsToPostResponse(this.f44757a, this.f44758b, this.f44759c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17727a mo61891a(ItemList itemList) {
            this.f44759c = itemList;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17727a newBuilder() {
        C17727a aVar = new C17727a();
        aVar.f44757a = this.entity;
        aVar.f44758b = this.next_cursor;
        aVar.f44759c = this.item_list;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetTopicGroupsToPostResponse");
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
        StringBuilder replace = sb.replace(0, 2, "GetTopicGroupsToPostResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetTopicGroupsToPostResponse(C14928Entity entity2, String str, ItemList itemList) {
        this(entity2, str, itemList, ByteString.EMPTY);
    }

    public GetTopicGroupsToPostResponse(C14928Entity entity2, String str, ItemList itemList, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity = entity2;
        this.next_cursor = str;
        this.item_list = itemList;
    }
}
