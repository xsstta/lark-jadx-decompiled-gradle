package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
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

public final class MailGetRecallDetailResponse extends Message<MailGetRecallDetailResponse, C16766a> {
    public static final ProtoAdapter<MailGetRecallDetailResponse> ADAPTER = new C16767b();
    public static final Long DEFAULT_NUMBER_OF_FAILURE = 0L;
    public static final Long DEFAULT_NUMBER_OF_PROCESSING = 0L;
    public static final Long DEFAULT_NUMBER_OF_SUCCESS = 0L;
    private static final long serialVersionUID = 0;
    public final List<Item> items;
    public final String message_id;
    public final Long number_of_failure;
    public final Long number_of_processing;
    public final Long number_of_success;

    public enum MailRecallDetailComment implements WireEnum {
        UNKNOWN(-1),
        NO_COMMENT(0),
        MESSAGE_HAS_BEEN_READ(1),
        NOT_USING_LARK_MAIL(2),
        NOT_IN_THE_SAME_TENANT(3),
        INVALID_ADDRESS(4);
        
        public static final ProtoAdapter<MailRecallDetailComment> ADAPTER = ProtoAdapter.newEnumAdapter(MailRecallDetailComment.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static MailRecallDetailComment fromValue(int i) {
            if (i == -1) {
                return UNKNOWN;
            }
            if (i == 0) {
                return NO_COMMENT;
            }
            if (i == 1) {
                return MESSAGE_HAS_BEEN_READ;
            }
            if (i == 2) {
                return NOT_USING_LARK_MAIL;
            }
            if (i == 3) {
                return NOT_IN_THE_SAME_TENANT;
            }
            if (i != 4) {
                return null;
            }
            return INVALID_ADDRESS;
        }

        private MailRecallDetailComment(int i) {
            this.value = i;
        }
    }

    public enum MailRecallDetailStatus implements WireEnum {
        RECALL_PROCESSING(0),
        RECALL_SUCCESS(1),
        RECALL_FAIL(2);
        
        public static final ProtoAdapter<MailRecallDetailStatus> ADAPTER = ProtoAdapter.newEnumAdapter(MailRecallDetailStatus.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static MailRecallDetailStatus fromValue(int i) {
            if (i == 0) {
                return RECALL_PROCESSING;
            }
            if (i == 1) {
                return RECALL_SUCCESS;
            }
            if (i != 2) {
                return null;
            }
            return RECALL_FAIL;
        }

        private MailRecallDetailStatus(int i) {
            this.value = i;
        }
    }

    public static final class Item extends Message<Item, C16764a> {
        public static final ProtoAdapter<Item> ADAPTER = new C16765b();
        public static final MailRecallDetailComment DEFAULT_COMMENT = MailRecallDetailComment.UNKNOWN;
        public static final Boolean DEFAULT_IS_MAILING_LIST = false;
        public static final Long DEFAULT_NUMBER_OF_FAILURE = 0L;
        public static final Long DEFAULT_NUMBER_OF_SUCCESS = 0L;
        public static final MailRecallDetailStatus DEFAULT_STATUS = MailRecallDetailStatus.RECALL_PROCESSING;
        private static final long serialVersionUID = 0;
        public final Address address;
        public final MailRecallDetailComment comment;
        public final Boolean is_mailing_list;
        public final Long number_of_failure;
        public final Long number_of_success;
        public final MailRecallDetailStatus status;

        /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetRecallDetailResponse$Item$b */
        private static final class C16765b extends ProtoAdapter<Item> {
            C16765b() {
                super(FieldEncoding.LENGTH_DELIMITED, Item.class);
            }

            /* renamed from: a */
            public int encodedSize(Item item) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6 = 0;
                if (item.address != null) {
                    i = Address.ADAPTER.encodedSizeWithTag(1, item.address);
                } else {
                    i = 0;
                }
                if (item.status != null) {
                    i2 = MailRecallDetailStatus.ADAPTER.encodedSizeWithTag(2, item.status);
                } else {
                    i2 = 0;
                }
                int i7 = i + i2;
                if (item.comment != null) {
                    i3 = MailRecallDetailComment.ADAPTER.encodedSizeWithTag(3, item.comment);
                } else {
                    i3 = 0;
                }
                int i8 = i7 + i3;
                if (item.is_mailing_list != null) {
                    i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, item.is_mailing_list);
                } else {
                    i4 = 0;
                }
                int i9 = i8 + i4;
                if (item.number_of_success != null) {
                    i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, item.number_of_success);
                } else {
                    i5 = 0;
                }
                int i10 = i9 + i5;
                if (item.number_of_failure != null) {
                    i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, item.number_of_failure);
                }
                return i10 + i6 + item.unknownFields().size();
            }

            /* renamed from: a */
            public Item decode(ProtoReader protoReader) throws IOException {
                C16764a aVar = new C16764a();
                aVar.f43234b = MailRecallDetailStatus.RECALL_PROCESSING;
                aVar.f43235c = MailRecallDetailComment.UNKNOWN;
                aVar.f43236d = false;
                aVar.f43237e = 0L;
                aVar.f43238f = 0L;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f43233a = Address.ADAPTER.decode(protoReader);
                                break;
                            case 2:
                                try {
                                    aVar.f43234b = MailRecallDetailStatus.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 3:
                                try {
                                    aVar.f43235c = MailRecallDetailComment.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                    break;
                                }
                            case 4:
                                aVar.f43236d = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 5:
                                aVar.f43237e = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 6:
                                aVar.f43238f = ProtoAdapter.INT64.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, Item item) throws IOException {
                if (item.address != null) {
                    Address.ADAPTER.encodeWithTag(protoWriter, 1, item.address);
                }
                if (item.status != null) {
                    MailRecallDetailStatus.ADAPTER.encodeWithTag(protoWriter, 2, item.status);
                }
                if (item.comment != null) {
                    MailRecallDetailComment.ADAPTER.encodeWithTag(protoWriter, 3, item.comment);
                }
                if (item.is_mailing_list != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, item.is_mailing_list);
                }
                if (item.number_of_success != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, item.number_of_success);
                }
                if (item.number_of_failure != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, item.number_of_failure);
                }
                protoWriter.writeBytes(item.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetRecallDetailResponse$Item$a */
        public static final class C16764a extends Message.Builder<Item, C16764a> {

            /* renamed from: a */
            public Address f43233a;

            /* renamed from: b */
            public MailRecallDetailStatus f43234b;

            /* renamed from: c */
            public MailRecallDetailComment f43235c;

            /* renamed from: d */
            public Boolean f43236d;

            /* renamed from: e */
            public Long f43237e;

            /* renamed from: f */
            public Long f43238f;

            /* renamed from: a */
            public Item build() {
                return new Item(this.f43233a, this.f43234b, this.f43235c, this.f43236d, this.f43237e, this.f43238f, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16764a newBuilder() {
            C16764a aVar = new C16764a();
            aVar.f43233a = this.address;
            aVar.f43234b = this.status;
            aVar.f43235c = this.comment;
            aVar.f43236d = this.is_mailing_list;
            aVar.f43237e = this.number_of_success;
            aVar.f43238f = this.number_of_failure;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("email", "Item");
            StringBuilder sb = new StringBuilder();
            if (this.address != null) {
                sb.append(", address=");
                sb.append(this.address);
            }
            if (this.status != null) {
                sb.append(", status=");
                sb.append(this.status);
            }
            if (this.comment != null) {
                sb.append(", comment=");
                sb.append(this.comment);
            }
            if (this.is_mailing_list != null) {
                sb.append(", is_mailing_list=");
                sb.append(this.is_mailing_list);
            }
            if (this.number_of_success != null) {
                sb.append(", number_of_success=");
                sb.append(this.number_of_success);
            }
            if (this.number_of_failure != null) {
                sb.append(", number_of_failure=");
                sb.append(this.number_of_failure);
            }
            StringBuilder replace = sb.replace(0, 2, "Item{");
            replace.append('}');
            return replace.toString();
        }

        public Item(Address address2, MailRecallDetailStatus mailRecallDetailStatus, MailRecallDetailComment mailRecallDetailComment, Boolean bool, Long l, Long l2) {
            this(address2, mailRecallDetailStatus, mailRecallDetailComment, bool, l, l2, ByteString.EMPTY);
        }

        public Item(Address address2, MailRecallDetailStatus mailRecallDetailStatus, MailRecallDetailComment mailRecallDetailComment, Boolean bool, Long l, Long l2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.address = address2;
            this.status = mailRecallDetailStatus;
            this.comment = mailRecallDetailComment;
            this.is_mailing_list = bool;
            this.number_of_success = l;
            this.number_of_failure = l2;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetRecallDetailResponse$b */
    private static final class C16767b extends ProtoAdapter<MailGetRecallDetailResponse> {
        C16767b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetRecallDetailResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetRecallDetailResponse mailGetRecallDetailResponse) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (mailGetRecallDetailResponse.message_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailGetRecallDetailResponse.message_id);
            } else {
                i = 0;
            }
            if (mailGetRecallDetailResponse.number_of_success != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, mailGetRecallDetailResponse.number_of_success);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (mailGetRecallDetailResponse.number_of_failure != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, mailGetRecallDetailResponse.number_of_failure);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (mailGetRecallDetailResponse.number_of_processing != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, mailGetRecallDetailResponse.number_of_processing);
            }
            return i6 + i4 + Item.ADAPTER.asRepeated().encodedSizeWithTag(5, mailGetRecallDetailResponse.items) + mailGetRecallDetailResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetRecallDetailResponse decode(ProtoReader protoReader) throws IOException {
            C16766a aVar = new C16766a();
            aVar.f43239a = "";
            aVar.f43240b = 0L;
            aVar.f43241c = 0L;
            aVar.f43242d = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43239a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43240b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f43241c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f43242d = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43243e.add(Item.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetRecallDetailResponse mailGetRecallDetailResponse) throws IOException {
            if (mailGetRecallDetailResponse.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailGetRecallDetailResponse.message_id);
            }
            if (mailGetRecallDetailResponse.number_of_success != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, mailGetRecallDetailResponse.number_of_success);
            }
            if (mailGetRecallDetailResponse.number_of_failure != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, mailGetRecallDetailResponse.number_of_failure);
            }
            if (mailGetRecallDetailResponse.number_of_processing != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, mailGetRecallDetailResponse.number_of_processing);
            }
            Item.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, mailGetRecallDetailResponse.items);
            protoWriter.writeBytes(mailGetRecallDetailResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetRecallDetailResponse$a */
    public static final class C16766a extends Message.Builder<MailGetRecallDetailResponse, C16766a> {

        /* renamed from: a */
        public String f43239a;

        /* renamed from: b */
        public Long f43240b;

        /* renamed from: c */
        public Long f43241c;

        /* renamed from: d */
        public Long f43242d;

        /* renamed from: e */
        public List<Item> f43243e = Internal.newMutableList();

        /* renamed from: a */
        public MailGetRecallDetailResponse build() {
            return new MailGetRecallDetailResponse(this.f43239a, this.f43240b, this.f43241c, this.f43242d, this.f43243e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16766a newBuilder() {
        C16766a aVar = new C16766a();
        aVar.f43239a = this.message_id;
        aVar.f43240b = this.number_of_success;
        aVar.f43241c = this.number_of_failure;
        aVar.f43242d = this.number_of_processing;
        aVar.f43243e = Internal.copyOf("items", this.items);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetRecallDetailResponse");
        StringBuilder sb = new StringBuilder();
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.number_of_success != null) {
            sb.append(", number_of_success=");
            sb.append(this.number_of_success);
        }
        if (this.number_of_failure != null) {
            sb.append(", number_of_failure=");
            sb.append(this.number_of_failure);
        }
        if (this.number_of_processing != null) {
            sb.append(", number_of_processing=");
            sb.append(this.number_of_processing);
        }
        if (!this.items.isEmpty()) {
            sb.append(", items=");
            sb.append(this.items);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetRecallDetailResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetRecallDetailResponse(String str, Long l, Long l2, Long l3, List<Item> list) {
        this(str, l, l2, l3, list, ByteString.EMPTY);
    }

    public MailGetRecallDetailResponse(String str, Long l, Long l2, Long l3, List<Item> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.number_of_success = l;
        this.number_of_failure = l2;
        this.number_of_processing = l3;
        this.items = Internal.immutableCopyOf("items", list);
    }
}
