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

public final class GetChannelThreadsResponse extends Message<GetChannelThreadsResponse, C17480a> {
    public static final ProtoAdapter<GetChannelThreadsResponse> ADAPTER = new C17481b();
    public static final Boolean DEFAULT_DATA_COMPLETE = false;
    public static final Integer DEFAULT_NEW_AT_REPLY_COUNT = 0;
    public static final Integer DEFAULT_NEW_REPLY_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final Boolean data_complete;
    public final C14928Entity entity;
    public final List<Integer> invalid_positions;
    public final List<Integer> missing_positions;
    public final Integer new_at_reply_count;
    public final List<String> new_at_reply_ids;
    public final Integer new_reply_count;
    public final List<ThreadItem> thread_items;

    public static final class ThreadItem extends Message<ThreadItem, C17478a> {
        public static final ProtoAdapter<ThreadItem> ADAPTER = new C17479b();
        public static final ChannelDataType DEFAULT_ITEM_TYPE = ChannelDataType.NORMAL_DATA;
        private static final long serialVersionUID = 0;
        public final String item_id;
        public final ChannelDataType item_type;

        /* renamed from: com.bytedance.lark.pb.im.v1.GetChannelThreadsResponse$ThreadItem$b */
        private static final class C17479b extends ProtoAdapter<ThreadItem> {
            C17479b() {
                super(FieldEncoding.LENGTH_DELIMITED, ThreadItem.class);
            }

            /* renamed from: a */
            public int encodedSize(ThreadItem threadItem) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, threadItem.item_id) + ChannelDataType.ADAPTER.encodedSizeWithTag(2, threadItem.item_type) + threadItem.unknownFields().size();
            }

            /* renamed from: a */
            public ThreadItem decode(ProtoReader protoReader) throws IOException {
                C17478a aVar = new C17478a();
                aVar.f44378a = "";
                aVar.f44379b = ChannelDataType.NORMAL_DATA;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f44378a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f44379b = ChannelDataType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ThreadItem threadItem) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, threadItem.item_id);
                ChannelDataType.ADAPTER.encodeWithTag(protoWriter, 2, threadItem.item_type);
                protoWriter.writeBytes(threadItem.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C17478a newBuilder() {
            C17478a aVar = new C17478a();
            aVar.f44378a = this.item_id;
            aVar.f44379b = this.item_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.GetChannelThreadsResponse$ThreadItem$a */
        public static final class C17478a extends Message.Builder<ThreadItem, C17478a> {

            /* renamed from: a */
            public String f44378a;

            /* renamed from: b */
            public ChannelDataType f44379b;

            /* renamed from: a */
            public ThreadItem build() {
                ChannelDataType channelDataType;
                String str = this.f44378a;
                if (str != null && (channelDataType = this.f44379b) != null) {
                    return new ThreadItem(str, channelDataType, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "item_id", this.f44379b, "item_type");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "ThreadItem");
            StringBuilder sb = new StringBuilder();
            sb.append(", item_id=");
            sb.append(this.item_id);
            sb.append(", item_type=");
            sb.append(this.item_type);
            StringBuilder replace = sb.replace(0, 2, "ThreadItem{");
            replace.append('}');
            return replace.toString();
        }

        public ThreadItem(String str, ChannelDataType channelDataType) {
            this(str, channelDataType, ByteString.EMPTY);
        }

        public ThreadItem(String str, ChannelDataType channelDataType, ByteString byteString) {
            super(ADAPTER, byteString);
            this.item_id = str;
            this.item_type = channelDataType;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChannelThreadsResponse$b */
    private static final class C17481b extends ProtoAdapter<GetChannelThreadsResponse> {
        C17481b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChannelThreadsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChannelThreadsResponse getChannelThreadsResponse) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = ThreadItem.ADAPTER.asRepeated().encodedSizeWithTag(1, getChannelThreadsResponse.thread_items) + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(2, getChannelThreadsResponse.invalid_positions);
            int i4 = 0;
            if (getChannelThreadsResponse.entity != null) {
                i = C14928Entity.ADAPTER.encodedSizeWithTag(3, getChannelThreadsResponse.entity);
            } else {
                i = 0;
            }
            int i5 = encodedSizeWithTag + i;
            if (getChannelThreadsResponse.data_complete != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(4, getChannelThreadsResponse.data_complete);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag2 = i5 + i2 + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(5, getChannelThreadsResponse.missing_positions);
            if (getChannelThreadsResponse.new_reply_count != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(6, getChannelThreadsResponse.new_reply_count);
            } else {
                i3 = 0;
            }
            int encodedSizeWithTag3 = encodedSizeWithTag2 + i3 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(7, getChannelThreadsResponse.new_at_reply_ids);
            if (getChannelThreadsResponse.new_at_reply_count != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(8, getChannelThreadsResponse.new_at_reply_count);
            }
            return encodedSizeWithTag3 + i4 + getChannelThreadsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetChannelThreadsResponse decode(ProtoReader protoReader) throws IOException {
            C17480a aVar = new C17480a();
            aVar.f44383d = false;
            aVar.f44385f = 0;
            aVar.f44387h = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f44380a.add(ThreadItem.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            aVar.f44381b.add(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            aVar.f44382c = C14928Entity.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f44383d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f44384e.add(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 6:
                            aVar.f44385f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            aVar.f44386g.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            aVar.f44387h = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChannelThreadsResponse getChannelThreadsResponse) throws IOException {
            ThreadItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getChannelThreadsResponse.thread_items);
            ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 2, getChannelThreadsResponse.invalid_positions);
            if (getChannelThreadsResponse.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 3, getChannelThreadsResponse.entity);
            }
            if (getChannelThreadsResponse.data_complete != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, getChannelThreadsResponse.data_complete);
            }
            ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 5, getChannelThreadsResponse.missing_positions);
            if (getChannelThreadsResponse.new_reply_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, getChannelThreadsResponse.new_reply_count);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 7, getChannelThreadsResponse.new_at_reply_ids);
            if (getChannelThreadsResponse.new_at_reply_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, getChannelThreadsResponse.new_at_reply_count);
            }
            protoWriter.writeBytes(getChannelThreadsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChannelThreadsResponse$a */
    public static final class C17480a extends Message.Builder<GetChannelThreadsResponse, C17480a> {

        /* renamed from: a */
        public List<ThreadItem> f44380a = Internal.newMutableList();

        /* renamed from: b */
        public List<Integer> f44381b = Internal.newMutableList();

        /* renamed from: c */
        public C14928Entity f44382c;

        /* renamed from: d */
        public Boolean f44383d;

        /* renamed from: e */
        public List<Integer> f44384e = Internal.newMutableList();

        /* renamed from: f */
        public Integer f44385f;

        /* renamed from: g */
        public List<String> f44386g = Internal.newMutableList();

        /* renamed from: h */
        public Integer f44387h;

        /* renamed from: a */
        public GetChannelThreadsResponse build() {
            return new GetChannelThreadsResponse(this.f44380a, this.f44381b, this.f44382c, this.f44383d, this.f44384e, this.f44385f, this.f44386g, this.f44387h, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17480a newBuilder() {
        C17480a aVar = new C17480a();
        aVar.f44380a = Internal.copyOf("thread_items", this.thread_items);
        aVar.f44381b = Internal.copyOf("invalid_positions", this.invalid_positions);
        aVar.f44382c = this.entity;
        aVar.f44383d = this.data_complete;
        aVar.f44384e = Internal.copyOf("missing_positions", this.missing_positions);
        aVar.f44385f = this.new_reply_count;
        aVar.f44386g = Internal.copyOf("new_at_reply_ids", this.new_at_reply_ids);
        aVar.f44387h = this.new_at_reply_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChannelThreadsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.thread_items.isEmpty()) {
            sb.append(", thread_items=");
            sb.append(this.thread_items);
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
        if (this.new_reply_count != null) {
            sb.append(", new_reply_count=");
            sb.append(this.new_reply_count);
        }
        if (!this.new_at_reply_ids.isEmpty()) {
            sb.append(", new_at_reply_ids=");
            sb.append(this.new_at_reply_ids);
        }
        if (this.new_at_reply_count != null) {
            sb.append(", new_at_reply_count=");
            sb.append(this.new_at_reply_count);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChannelThreadsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetChannelThreadsResponse(List<ThreadItem> list, List<Integer> list2, C14928Entity entity2, Boolean bool, List<Integer> list3, Integer num, List<String> list4, Integer num2) {
        this(list, list2, entity2, bool, list3, num, list4, num2, ByteString.EMPTY);
    }

    public GetChannelThreadsResponse(List<ThreadItem> list, List<Integer> list2, C14928Entity entity2, Boolean bool, List<Integer> list3, Integer num, List<String> list4, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thread_items = Internal.immutableCopyOf("thread_items", list);
        this.invalid_positions = Internal.immutableCopyOf("invalid_positions", list2);
        this.entity = entity2;
        this.data_complete = bool;
        this.missing_positions = Internal.immutableCopyOf("missing_positions", list3);
        this.new_reply_count = num;
        this.new_at_reply_ids = Internal.immutableCopyOf("new_at_reply_ids", list4);
        this.new_at_reply_count = num2;
    }
}
