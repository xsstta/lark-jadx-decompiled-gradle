package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class GetMyGroupChatsRequest extends Message<GetMyGroupChatsRequest, C17645a> {
    public static final ProtoAdapter<GetMyGroupChatsRequest> ADAPTER = new C17646b();
    public static final Integer DEFAULT_COUNT = 20;
    public static final SyncDataStrategy DEFAULT_STRATEGY = SyncDataStrategy.FORCE_SERVER;
    public static final Long DEFAULT_TIME = 0L;
    public static final Type DEFAULT_TYPE = Type.MANAGE;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final SyncDataStrategy strategy;
    public final Long time;
    public final Type type;

    public enum Type implements WireEnum {
        MANAGE(1),
        JOIN(2),
        ADMINISTRATE(3);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 1) {
                return MANAGE;
            }
            if (i == 2) {
                return JOIN;
            }
            if (i != 3) {
                return null;
            }
            return ADMINISTRATE;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMyGroupChatsRequest$b */
    private static final class C17646b extends ProtoAdapter<GetMyGroupChatsRequest> {
        C17646b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMyGroupChatsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMyGroupChatsRequest getMyGroupChatsRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = Type.ADAPTER.encodedSizeWithTag(1, getMyGroupChatsRequest.type);
            int i3 = 0;
            if (getMyGroupChatsRequest.time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(2, getMyGroupChatsRequest.time);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (getMyGroupChatsRequest.count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, getMyGroupChatsRequest.count);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (getMyGroupChatsRequest.strategy != null) {
                i3 = SyncDataStrategy.ADAPTER.encodedSizeWithTag(4, getMyGroupChatsRequest.strategy);
            }
            return i5 + i3 + getMyGroupChatsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetMyGroupChatsRequest decode(ProtoReader protoReader) throws IOException {
            C17645a aVar = new C17645a();
            aVar.f44651a = Type.MANAGE;
            aVar.f44652b = 0L;
            aVar.f44653c = 20;
            aVar.f44654d = SyncDataStrategy.FORCE_SERVER;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f44651a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f44652b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f44653c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f44654d = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMyGroupChatsRequest getMyGroupChatsRequest) throws IOException {
            Type.ADAPTER.encodeWithTag(protoWriter, 1, getMyGroupChatsRequest.type);
            if (getMyGroupChatsRequest.time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getMyGroupChatsRequest.time);
            }
            if (getMyGroupChatsRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getMyGroupChatsRequest.count);
            }
            if (getMyGroupChatsRequest.strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 4, getMyGroupChatsRequest.strategy);
            }
            protoWriter.writeBytes(getMyGroupChatsRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17645a newBuilder() {
        C17645a aVar = new C17645a();
        aVar.f44651a = this.type;
        aVar.f44652b = this.time;
        aVar.f44653c = this.count;
        aVar.f44654d = this.strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMyGroupChatsRequest$a */
    public static final class C17645a extends Message.Builder<GetMyGroupChatsRequest, C17645a> {

        /* renamed from: a */
        public Type f44651a;

        /* renamed from: b */
        public Long f44652b;

        /* renamed from: c */
        public Integer f44653c;

        /* renamed from: d */
        public SyncDataStrategy f44654d;

        /* renamed from: a */
        public GetMyGroupChatsRequest build() {
            Type type = this.f44651a;
            if (type != null) {
                return new GetMyGroupChatsRequest(type, this.f44652b, this.f44653c, this.f44654d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d);
        }

        /* renamed from: a */
        public C17645a mo61689a(Type type) {
            this.f44651a = type;
            return this;
        }

        /* renamed from: a */
        public C17645a mo61690a(Integer num) {
            this.f44653c = num;
            return this;
        }

        /* renamed from: a */
        public C17645a mo61691a(Long l) {
            this.f44652b = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetMyGroupChatsRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.type);
        if (this.time != null) {
            sb.append(", time=");
            sb.append(this.time);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.strategy != null) {
            sb.append(", strategy=");
            sb.append(this.strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMyGroupChatsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetMyGroupChatsRequest(Type type2, Long l, Integer num, SyncDataStrategy syncDataStrategy) {
        this(type2, l, num, syncDataStrategy, ByteString.EMPTY);
    }

    public GetMyGroupChatsRequest(Type type2, Long l, Integer num, SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.time = l;
        this.count = num;
        this.strategy = syncDataStrategy;
    }
}
