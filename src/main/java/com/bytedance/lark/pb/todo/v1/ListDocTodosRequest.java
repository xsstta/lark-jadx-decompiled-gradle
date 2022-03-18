package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class ListDocTodosRequest extends Message<ListDocTodosRequest, C19577a> {
    public static final ProtoAdapter<ListDocTodosRequest> ADAPTER = new C19578b();
    public static final Long DEFAULT_COUNT = 0L;
    public static final Long DEFAULT_POSITION = 0L;
    public static final Status DEFAULT_STATUS = Status.DEFAULT;
    private static final long serialVersionUID = 0;
    public final Long count;
    public final Order order;
    public final Long position;
    public final Status status;

    public static final class Order extends Message<Order, C19575a> {
        public static final ProtoAdapter<Order> ADAPTER = new C19576b();
        public static final By DEFAULT_BY = By.DEFAULT;
        public static final Boolean DEFAULT_DESC = false;
        private static final long serialVersionUID = 0;
        public final By by;
        public final Boolean desc;

        public enum By implements WireEnum {
            DEFAULT(0),
            CREATE_TIME(1),
            DUE_TIME(2),
            COMPLETED_TIME(3);
            
            public static final ProtoAdapter<By> ADAPTER = ProtoAdapter.newEnumAdapter(By.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static By fromValue(int i) {
                if (i == 0) {
                    return DEFAULT;
                }
                if (i == 1) {
                    return CREATE_TIME;
                }
                if (i == 2) {
                    return DUE_TIME;
                }
                if (i != 3) {
                    return null;
                }
                return COMPLETED_TIME;
            }

            private By(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.todo.v1.ListDocTodosRequest$Order$b */
        private static final class C19576b extends ProtoAdapter<Order> {
            C19576b() {
                super(FieldEncoding.LENGTH_DELIMITED, Order.class);
            }

            /* renamed from: a */
            public int encodedSize(Order order) {
                int i;
                int i2 = 0;
                if (order.by != null) {
                    i = By.ADAPTER.encodedSizeWithTag(1, order.by);
                } else {
                    i = 0;
                }
                if (order.desc != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, order.desc);
                }
                return i + i2 + order.unknownFields().size();
            }

            /* renamed from: a */
            public Order decode(ProtoReader protoReader) throws IOException {
                C19575a aVar = new C19575a();
                aVar.f47923a = By.DEFAULT;
                aVar.f47924b = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f47923a = By.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f47924b = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Order order) throws IOException {
                if (order.by != null) {
                    By.ADAPTER.encodeWithTag(protoWriter, 1, order.by);
                }
                if (order.desc != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, order.desc);
                }
                protoWriter.writeBytes(order.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.todo.v1.ListDocTodosRequest$Order$a */
        public static final class C19575a extends Message.Builder<Order, C19575a> {

            /* renamed from: a */
            public By f47923a;

            /* renamed from: b */
            public Boolean f47924b;

            /* renamed from: a */
            public Order build() {
                return new Order(this.f47923a, this.f47924b, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C19575a mo66474a(By by) {
                this.f47923a = by;
                return this;
            }

            /* renamed from: a */
            public C19575a mo66475a(Boolean bool) {
                this.f47924b = bool;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C19575a newBuilder() {
            C19575a aVar = new C19575a();
            aVar.f47923a = this.by;
            aVar.f47924b = this.desc;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("todo", "Order");
            StringBuilder sb = new StringBuilder();
            if (this.by != null) {
                sb.append(", by=");
                sb.append(this.by);
            }
            if (this.desc != null) {
                sb.append(", desc=");
                sb.append(this.desc);
            }
            StringBuilder replace = sb.replace(0, 2, "Order{");
            replace.append('}');
            return replace.toString();
        }

        public Order(By by2, Boolean bool) {
            this(by2, bool, ByteString.EMPTY);
        }

        public Order(By by2, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.by = by2;
            this.desc = bool;
        }
    }

    public enum Status implements WireEnum {
        DEFAULT(0),
        UNCOMPLETED(1),
        COMPLETED(2);
        
        public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            if (i == 0) {
                return DEFAULT;
            }
            if (i == 1) {
                return UNCOMPLETED;
            }
            if (i != 2) {
                return null;
            }
            return COMPLETED;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.ListDocTodosRequest$b */
    private static final class C19578b extends ProtoAdapter<ListDocTodosRequest> {
        C19578b() {
            super(FieldEncoding.LENGTH_DELIMITED, ListDocTodosRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ListDocTodosRequest listDocTodosRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (listDocTodosRequest.count != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, listDocTodosRequest.count);
            } else {
                i = 0;
            }
            if (listDocTodosRequest.position != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, listDocTodosRequest.position);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (listDocTodosRequest.order != null) {
                i3 = Order.ADAPTER.encodedSizeWithTag(3, listDocTodosRequest.order);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (listDocTodosRequest.status != null) {
                i4 = Status.ADAPTER.encodedSizeWithTag(4, listDocTodosRequest.status);
            }
            return i6 + i4 + listDocTodosRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ListDocTodosRequest decode(ProtoReader protoReader) throws IOException {
            C19577a aVar = new C19577a();
            aVar.f47925a = 0L;
            aVar.f47926b = 0L;
            aVar.f47928d = Status.DEFAULT;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47925a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47926b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f47927c = Order.ADAPTER.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f47928d = Status.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ListDocTodosRequest listDocTodosRequest) throws IOException {
            if (listDocTodosRequest.count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, listDocTodosRequest.count);
            }
            if (listDocTodosRequest.position != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, listDocTodosRequest.position);
            }
            if (listDocTodosRequest.order != null) {
                Order.ADAPTER.encodeWithTag(protoWriter, 3, listDocTodosRequest.order);
            }
            if (listDocTodosRequest.status != null) {
                Status.ADAPTER.encodeWithTag(protoWriter, 4, listDocTodosRequest.status);
            }
            protoWriter.writeBytes(listDocTodosRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.ListDocTodosRequest$a */
    public static final class C19577a extends Message.Builder<ListDocTodosRequest, C19577a> {

        /* renamed from: a */
        public Long f47925a;

        /* renamed from: b */
        public Long f47926b;

        /* renamed from: c */
        public Order f47927c;

        /* renamed from: d */
        public Status f47928d;

        /* renamed from: a */
        public ListDocTodosRequest build() {
            return new ListDocTodosRequest(this.f47925a, this.f47926b, this.f47927c, this.f47928d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19577a mo66480a(Order order) {
            this.f47927c = order;
            return this;
        }

        /* renamed from: b */
        public C19577a mo66484b(Long l) {
            this.f47926b = l;
            return this;
        }

        /* renamed from: a */
        public C19577a mo66481a(Status status) {
            this.f47928d = status;
            return this;
        }

        /* renamed from: a */
        public C19577a mo66482a(Long l) {
            this.f47925a = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19577a newBuilder() {
        C19577a aVar = new C19577a();
        aVar.f47925a = this.count;
        aVar.f47926b = this.position;
        aVar.f47927c = this.order;
        aVar.f47928d = this.status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "ListDocTodosRequest");
        StringBuilder sb = new StringBuilder();
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.position != null) {
            sb.append(", position=");
            sb.append(this.position);
        }
        if (this.order != null) {
            sb.append(", order=");
            sb.append(this.order);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        StringBuilder replace = sb.replace(0, 2, "ListDocTodosRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ListDocTodosRequest(Long l, Long l2, Order order2, Status status2) {
        this(l, l2, order2, status2, ByteString.EMPTY);
    }

    public ListDocTodosRequest(Long l, Long l2, Order order2, Status status2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.count = l;
        this.position = l2;
        this.order = order2;
        this.status = status2;
    }
}
