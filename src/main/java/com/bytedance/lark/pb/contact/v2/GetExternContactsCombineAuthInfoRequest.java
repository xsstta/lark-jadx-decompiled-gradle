package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ActionType;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetExternContactsCombineAuthInfoRequest extends Message<GetExternContactsCombineAuthInfoRequest, C16454a> {
    public static final ProtoAdapter<GetExternContactsCombineAuthInfoRequest> ADAPTER = new C16455b();
    public static final ActionType DEFAULT_ACTION_TYPE = ActionType.UNKNOWN_ACTION;
    public static final Long DEFAULT_LIMIT = 0L;
    public static final Integer DEFAULT_OFFSET = 0;
    public static final SyncDataStrategy DEFAULT_STRATEGY = SyncDataStrategy.FORCE_SERVER;
    private static final long serialVersionUID = 0;
    public final ActionType action_type;
    public final String chat_id;
    public final Long limit;
    public final Integer offset;
    public final SyncDataStrategy strategy;

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetExternContactsCombineAuthInfoRequest$b */
    private static final class C16455b extends ProtoAdapter<GetExternContactsCombineAuthInfoRequest> {
        C16455b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetExternContactsCombineAuthInfoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetExternContactsCombineAuthInfoRequest getExternContactsCombineAuthInfoRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (getExternContactsCombineAuthInfoRequest.strategy != null) {
                i = SyncDataStrategy.ADAPTER.encodedSizeWithTag(1, getExternContactsCombineAuthInfoRequest.strategy);
            } else {
                i = 0;
            }
            if (getExternContactsCombineAuthInfoRequest.offset != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, getExternContactsCombineAuthInfoRequest.offset);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (getExternContactsCombineAuthInfoRequest.limit != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, getExternContactsCombineAuthInfoRequest.limit);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (getExternContactsCombineAuthInfoRequest.chat_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, getExternContactsCombineAuthInfoRequest.chat_id);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (getExternContactsCombineAuthInfoRequest.action_type != null) {
                i5 = ActionType.ADAPTER.encodedSizeWithTag(5, getExternContactsCombineAuthInfoRequest.action_type);
            }
            return i8 + i5 + getExternContactsCombineAuthInfoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetExternContactsCombineAuthInfoRequest decode(ProtoReader protoReader) throws IOException {
            C16454a aVar = new C16454a();
            aVar.f42749a = SyncDataStrategy.FORCE_SERVER;
            aVar.f42750b = 0;
            aVar.f42751c = 0L;
            aVar.f42752d = "";
            aVar.f42753e = ActionType.UNKNOWN_ACTION;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f42749a = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f42750b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f42751c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f42752d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f42753e = ActionType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetExternContactsCombineAuthInfoRequest getExternContactsCombineAuthInfoRequest) throws IOException {
            if (getExternContactsCombineAuthInfoRequest.strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 1, getExternContactsCombineAuthInfoRequest.strategy);
            }
            if (getExternContactsCombineAuthInfoRequest.offset != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getExternContactsCombineAuthInfoRequest.offset);
            }
            if (getExternContactsCombineAuthInfoRequest.limit != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getExternContactsCombineAuthInfoRequest.limit);
            }
            if (getExternContactsCombineAuthInfoRequest.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getExternContactsCombineAuthInfoRequest.chat_id);
            }
            if (getExternContactsCombineAuthInfoRequest.action_type != null) {
                ActionType.ADAPTER.encodeWithTag(protoWriter, 5, getExternContactsCombineAuthInfoRequest.action_type);
            }
            protoWriter.writeBytes(getExternContactsCombineAuthInfoRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetExternContactsCombineAuthInfoRequest$a */
    public static final class C16454a extends Message.Builder<GetExternContactsCombineAuthInfoRequest, C16454a> {

        /* renamed from: a */
        public SyncDataStrategy f42749a;

        /* renamed from: b */
        public Integer f42750b;

        /* renamed from: c */
        public Long f42751c;

        /* renamed from: d */
        public String f42752d;

        /* renamed from: e */
        public ActionType f42753e;

        /* renamed from: a */
        public GetExternContactsCombineAuthInfoRequest build() {
            return new GetExternContactsCombineAuthInfoRequest(this.f42749a, this.f42750b, this.f42751c, this.f42752d, this.f42753e, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16454a mo58687a(ActionType actionType) {
            this.f42753e = actionType;
            return this;
        }

        /* renamed from: a */
        public C16454a mo58688a(Integer num) {
            this.f42750b = num;
            return this;
        }

        /* renamed from: a */
        public C16454a mo58689a(Long l) {
            this.f42751c = l;
            return this;
        }

        /* renamed from: a */
        public C16454a mo58690a(String str) {
            this.f42752d = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16454a newBuilder() {
        C16454a aVar = new C16454a();
        aVar.f42749a = this.strategy;
        aVar.f42750b = this.offset;
        aVar.f42751c = this.limit;
        aVar.f42752d = this.chat_id;
        aVar.f42753e = this.action_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetExternContactsCombineAuthInfoRequest");
        StringBuilder sb = new StringBuilder();
        if (this.strategy != null) {
            sb.append(", strategy=");
            sb.append(this.strategy);
        }
        if (this.offset != null) {
            sb.append(", offset=");
            sb.append(this.offset);
        }
        if (this.limit != null) {
            sb.append(", limit=");
            sb.append(this.limit);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.action_type != null) {
            sb.append(", action_type=");
            sb.append(this.action_type);
        }
        StringBuilder replace = sb.replace(0, 2, "GetExternContactsCombineAuthInfoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetExternContactsCombineAuthInfoRequest(SyncDataStrategy syncDataStrategy, Integer num, Long l, String str, ActionType actionType) {
        this(syncDataStrategy, num, l, str, actionType, ByteString.EMPTY);
    }

    public GetExternContactsCombineAuthInfoRequest(SyncDataStrategy syncDataStrategy, Integer num, Long l, String str, ActionType actionType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.strategy = syncDataStrategy;
        this.offset = num;
        this.limit = l;
        this.chat_id = str;
        this.action_type = actionType;
    }
}
