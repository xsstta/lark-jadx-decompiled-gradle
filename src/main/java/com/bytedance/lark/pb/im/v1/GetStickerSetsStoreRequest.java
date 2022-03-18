package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class GetStickerSetsStoreRequest extends Message<GetStickerSetsStoreRequest, C17689a> {
    public static final ProtoAdapter<GetStickerSetsStoreRequest> ADAPTER = new C17690b();
    public static final Integer DEFAULT_COUNT = 10;
    public static final Integer DEFAULT_POSITION = 0;
    public static final FilterType DEFAULT_TYPE = FilterType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final Integer position;
    public final FilterType type;

    public enum FilterType implements WireEnum {
        UNKNOWN(0),
        ALL(1),
        FREE(2);
        
        public static final ProtoAdapter<FilterType> ADAPTER = ProtoAdapter.newEnumAdapter(FilterType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static FilterType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return ALL;
            }
            if (i != 2) {
                return null;
            }
            return FREE;
        }

        private FilterType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetStickerSetsStoreRequest$b */
    private static final class C17690b extends ProtoAdapter<GetStickerSetsStoreRequest> {
        C17690b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetStickerSetsStoreRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetStickerSetsStoreRequest getStickerSetsStoreRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (getStickerSetsStoreRequest.type != null) {
                i = FilterType.ADAPTER.encodedSizeWithTag(1, getStickerSetsStoreRequest.type);
            } else {
                i = 0;
            }
            if (getStickerSetsStoreRequest.count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, getStickerSetsStoreRequest.count);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (getStickerSetsStoreRequest.position != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, getStickerSetsStoreRequest.position);
            }
            return i4 + i3 + getStickerSetsStoreRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetStickerSetsStoreRequest decode(ProtoReader protoReader) throws IOException {
            C17689a aVar = new C17689a();
            aVar.f44706a = FilterType.UNKNOWN;
            aVar.f44707b = 10;
            aVar.f44708c = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f44706a = FilterType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f44707b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44708c = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetStickerSetsStoreRequest getStickerSetsStoreRequest) throws IOException {
            if (getStickerSetsStoreRequest.type != null) {
                FilterType.ADAPTER.encodeWithTag(protoWriter, 1, getStickerSetsStoreRequest.type);
            }
            if (getStickerSetsStoreRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getStickerSetsStoreRequest.count);
            }
            if (getStickerSetsStoreRequest.position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getStickerSetsStoreRequest.position);
            }
            protoWriter.writeBytes(getStickerSetsStoreRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetStickerSetsStoreRequest$a */
    public static final class C17689a extends Message.Builder<GetStickerSetsStoreRequest, C17689a> {

        /* renamed from: a */
        public FilterType f44706a;

        /* renamed from: b */
        public Integer f44707b;

        /* renamed from: c */
        public Integer f44708c;

        /* renamed from: a */
        public GetStickerSetsStoreRequest build() {
            return new GetStickerSetsStoreRequest(this.f44706a, this.f44707b, this.f44708c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17689a mo61791a(FilterType filterType) {
            this.f44706a = filterType;
            return this;
        }

        /* renamed from: b */
        public C17689a mo61794b(Integer num) {
            this.f44708c = num;
            return this;
        }

        /* renamed from: a */
        public C17689a mo61792a(Integer num) {
            this.f44707b = num;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17689a newBuilder() {
        C17689a aVar = new C17689a();
        aVar.f44706a = this.type;
        aVar.f44707b = this.count;
        aVar.f44708c = this.position;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetStickerSetsStoreRequest");
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.position != null) {
            sb.append(", position=");
            sb.append(this.position);
        }
        StringBuilder replace = sb.replace(0, 2, "GetStickerSetsStoreRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetStickerSetsStoreRequest(FilterType filterType, Integer num, Integer num2) {
        this(filterType, num, num2, ByteString.EMPTY);
    }

    public GetStickerSetsStoreRequest(FilterType filterType, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = filterType;
        this.count = num;
        this.position = num2;
    }
}
