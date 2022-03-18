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

public final class GetPagingTodosRequest extends Message<GetPagingTodosRequest, C19521a> {
    public static final ProtoAdapter<GetPagingTodosRequest> ADAPTER = new C19522b();
    public static final Long DEFAULT_COUNT = 0L;
    public static final Boolean DEFAULT_DESC = true;
    public static final Boolean DEFAULT_IS_PREVIOUS = false;
    public static final Long DEFAULT_START_POSITION = 0L;
    public static final ReqType DEFAULT_TYPE = ReqType.UNKNOWN_TYPE;
    private static final long serialVersionUID = 0;
    public final Long count;
    public final Boolean desc;
    public final Boolean is_previous;
    public final String last_guid;
    public final Long start_position;
    public final ReqType type;

    public enum ReqType implements WireEnum {
        UNKNOWN_TYPE(0),
        COMPLETED_TODO(1),
        DELETED_TODO(2);
        
        public static final ProtoAdapter<ReqType> ADAPTER = ProtoAdapter.newEnumAdapter(ReqType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ReqType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_TYPE;
            }
            if (i == 1) {
                return COMPLETED_TODO;
            }
            if (i != 2) {
                return null;
            }
            return DELETED_TODO;
        }

        private ReqType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetPagingTodosRequest$b */
    private static final class C19522b extends ProtoAdapter<GetPagingTodosRequest> {
        C19522b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetPagingTodosRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetPagingTodosRequest getPagingTodosRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (getPagingTodosRequest.type != null) {
                i = ReqType.ADAPTER.encodedSizeWithTag(1, getPagingTodosRequest.type);
            } else {
                i = 0;
            }
            if (getPagingTodosRequest.start_position != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, getPagingTodosRequest.start_position);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (getPagingTodosRequest.is_previous != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, getPagingTodosRequest.is_previous);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (getPagingTodosRequest.count != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, getPagingTodosRequest.count);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (getPagingTodosRequest.desc != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, getPagingTodosRequest.desc);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (getPagingTodosRequest.last_guid != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, getPagingTodosRequest.last_guid);
            }
            return i10 + i6 + getPagingTodosRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetPagingTodosRequest decode(ProtoReader protoReader) throws IOException {
            C19521a aVar = new C19521a();
            aVar.f47872a = ReqType.UNKNOWN_TYPE;
            aVar.f47873b = 0L;
            aVar.f47874c = false;
            aVar.f47875d = 0L;
            aVar.f47876e = true;
            aVar.f47877f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f47872a = ReqType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f47873b = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            aVar.f47874c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            aVar.f47875d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f47876e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f47877f = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, GetPagingTodosRequest getPagingTodosRequest) throws IOException {
            if (getPagingTodosRequest.type != null) {
                ReqType.ADAPTER.encodeWithTag(protoWriter, 1, getPagingTodosRequest.type);
            }
            if (getPagingTodosRequest.start_position != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getPagingTodosRequest.start_position);
            }
            if (getPagingTodosRequest.is_previous != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getPagingTodosRequest.is_previous);
            }
            if (getPagingTodosRequest.count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, getPagingTodosRequest.count);
            }
            if (getPagingTodosRequest.desc != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, getPagingTodosRequest.desc);
            }
            if (getPagingTodosRequest.last_guid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, getPagingTodosRequest.last_guid);
            }
            protoWriter.writeBytes(getPagingTodosRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetPagingTodosRequest$a */
    public static final class C19521a extends Message.Builder<GetPagingTodosRequest, C19521a> {

        /* renamed from: a */
        public ReqType f47872a;

        /* renamed from: b */
        public Long f47873b;

        /* renamed from: c */
        public Boolean f47874c;

        /* renamed from: d */
        public Long f47875d;

        /* renamed from: e */
        public Boolean f47876e;

        /* renamed from: f */
        public String f47877f;

        /* renamed from: a */
        public GetPagingTodosRequest build() {
            return new GetPagingTodosRequest(this.f47872a, this.f47873b, this.f47874c, this.f47875d, this.f47876e, this.f47877f, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19521a mo66345a(ReqType reqType) {
            this.f47872a = reqType;
            return this;
        }

        /* renamed from: b */
        public C19521a mo66350b(Boolean bool) {
            this.f47876e = bool;
            return this;
        }

        /* renamed from: a */
        public C19521a mo66346a(Boolean bool) {
            this.f47874c = bool;
            return this;
        }

        /* renamed from: b */
        public C19521a mo66351b(Long l) {
            this.f47875d = l;
            return this;
        }

        /* renamed from: a */
        public C19521a mo66347a(Long l) {
            this.f47873b = l;
            return this;
        }

        /* renamed from: a */
        public C19521a mo66348a(String str) {
            this.f47877f = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19521a newBuilder() {
        C19521a aVar = new C19521a();
        aVar.f47872a = this.type;
        aVar.f47873b = this.start_position;
        aVar.f47874c = this.is_previous;
        aVar.f47875d = this.count;
        aVar.f47876e = this.desc;
        aVar.f47877f = this.last_guid;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "GetPagingTodosRequest");
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.start_position != null) {
            sb.append(", start_position=");
            sb.append(this.start_position);
        }
        if (this.is_previous != null) {
            sb.append(", is_previous=");
            sb.append(this.is_previous);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.desc != null) {
            sb.append(", desc=");
            sb.append(this.desc);
        }
        if (this.last_guid != null) {
            sb.append(", last_guid=");
            sb.append(this.last_guid);
        }
        StringBuilder replace = sb.replace(0, 2, "GetPagingTodosRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetPagingTodosRequest(ReqType reqType, Long l, Boolean bool, Long l2, Boolean bool2, String str) {
        this(reqType, l, bool, l2, bool2, str, ByteString.EMPTY);
    }

    public GetPagingTodosRequest(ReqType reqType, Long l, Boolean bool, Long l2, Boolean bool2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = reqType;
        this.start_position = l;
        this.is_previous = bool;
        this.count = l2;
        this.desc = bool2;
        this.last_guid = str;
    }
}
