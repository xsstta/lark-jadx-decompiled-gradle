package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetItemsRequest extends Message<GetItemsRequest, C17170a> {
    public static final ProtoAdapter<GetItemsRequest> ADAPTER = new C17171b();
    private static final long serialVersionUID = 0;
    public final List<Param> params;

    public static final class Param extends Message<Param, C17168a> {
        public static final ProtoAdapter<Param> ADAPTER = new C17169b();
        public static final Integer DEFAULT_COUNT = 0;
        public static final Long DEFAULT_ORDER_CURSOR = 0L;
        public static final Long DEFAULT_PARENT_ID = 0L;
        private static final long serialVersionUID = 0;
        public final Integer count;
        public final Long order_cursor;
        public final Long parent_id;

        /* renamed from: com.bytedance.lark.pb.feed.v1.GetItemsRequest$Param$b */
        private static final class C17169b extends ProtoAdapter<Param> {
            C17169b() {
                super(FieldEncoding.LENGTH_DELIMITED, Param.class);
            }

            /* renamed from: a */
            public int encodedSize(Param param) {
                int i;
                int i2;
                int i3 = 0;
                if (param.parent_id != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, param.parent_id);
                } else {
                    i = 0;
                }
                if (param.order_cursor != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, param.order_cursor);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (param.count != null) {
                    i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, param.count);
                }
                return i4 + i3 + param.unknownFields().size();
            }

            /* renamed from: a */
            public Param decode(ProtoReader protoReader) throws IOException {
                C17168a aVar = new C17168a();
                aVar.f43924a = 0L;
                aVar.f43925b = 0L;
                aVar.f43926c = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f43924a = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f43925b = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f43926c = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Param param) throws IOException {
                if (param.parent_id != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, param.parent_id);
                }
                if (param.order_cursor != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, param.order_cursor);
                }
                if (param.count != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, param.count);
                }
                protoWriter.writeBytes(param.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.feed.v1.GetItemsRequest$Param$a */
        public static final class C17168a extends Message.Builder<Param, C17168a> {

            /* renamed from: a */
            public Long f43924a;

            /* renamed from: b */
            public Long f43925b;

            /* renamed from: c */
            public Integer f43926c;

            /* renamed from: a */
            public Param build() {
                return new Param(this.f43924a, this.f43925b, this.f43926c, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C17168a mo60458a(Long l) {
                this.f43924a = l;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C17168a newBuilder() {
            C17168a aVar = new C17168a();
            aVar.f43924a = this.parent_id;
            aVar.f43925b = this.order_cursor;
            aVar.f43926c = this.count;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("feed", "Param");
            StringBuilder sb = new StringBuilder();
            if (this.parent_id != null) {
                sb.append(", parent_id=");
                sb.append(this.parent_id);
            }
            if (this.order_cursor != null) {
                sb.append(", order_cursor=");
                sb.append(this.order_cursor);
            }
            if (this.count != null) {
                sb.append(", count=");
                sb.append(this.count);
            }
            StringBuilder replace = sb.replace(0, 2, "Param{");
            replace.append('}');
            return replace.toString();
        }

        public Param(Long l, Long l2, Integer num) {
            this(l, l2, num, ByteString.EMPTY);
        }

        public Param(Long l, Long l2, Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            this.parent_id = l;
            this.order_cursor = l2;
            this.count = num;
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetItemsRequest$b */
    private static final class C17171b extends ProtoAdapter<GetItemsRequest> {
        C17171b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetItemsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetItemsRequest getItemsRequest) {
            return Param.ADAPTER.asRepeated().encodedSizeWithTag(1, getItemsRequest.params) + getItemsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetItemsRequest decode(ProtoReader protoReader) throws IOException {
            C17170a aVar = new C17170a();
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
                    aVar.f43927a.add(Param.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetItemsRequest getItemsRequest) throws IOException {
            Param.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getItemsRequest.params);
            protoWriter.writeBytes(getItemsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetItemsRequest$a */
    public static final class C17170a extends Message.Builder<GetItemsRequest, C17170a> {

        /* renamed from: a */
        public List<Param> f43927a = Internal.newMutableList();

        /* renamed from: a */
        public GetItemsRequest build() {
            return new GetItemsRequest(this.f43927a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17170a mo60463a(List<Param> list) {
            Internal.checkElementsNotNull(list);
            this.f43927a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17170a newBuilder() {
        C17170a aVar = new C17170a();
        aVar.f43927a = Internal.copyOf("params", this.params);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "GetItemsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.params.isEmpty()) {
            sb.append(", params=");
            sb.append(this.params);
        }
        StringBuilder replace = sb.replace(0, 2, "GetItemsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetItemsRequest(List<Param> list) {
        this(list, ByteString.EMPTY);
    }

    public GetItemsRequest(List<Param> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.params = Internal.immutableCopyOf("params", list);
    }
}
