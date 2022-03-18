package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetExternalContactListRequest extends Message<GetExternalContactListRequest, C16458a> {
    public static final ProtoAdapter<GetExternalContactListRequest> ADAPTER = new C16459b();
    public static final Long DEFAULT_LIMIT = 0L;
    public static final Long DEFAULT_OFFSET = 0L;
    public static final SyncDataStrategy DEFAULT_STRATEGY = SyncDataStrategy.FORCE_SERVER;
    private static final long serialVersionUID = 0;
    public final Long limit;
    public final Long offset;
    public final SyncDataStrategy strategy;

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetExternalContactListRequest$b */
    private static final class C16459b extends ProtoAdapter<GetExternalContactListRequest> {
        C16459b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetExternalContactListRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetExternalContactListRequest getExternalContactListRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (getExternalContactListRequest.strategy != null) {
                i = SyncDataStrategy.ADAPTER.encodedSizeWithTag(1, getExternalContactListRequest.strategy);
            } else {
                i = 0;
            }
            if (getExternalContactListRequest.offset != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, getExternalContactListRequest.offset);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (getExternalContactListRequest.limit != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, getExternalContactListRequest.limit);
            }
            return i4 + i3 + getExternalContactListRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetExternalContactListRequest decode(ProtoReader protoReader) throws IOException {
            C16458a aVar = new C16458a();
            aVar.f42760a = SyncDataStrategy.FORCE_SERVER;
            aVar.f42761b = 0L;
            aVar.f42762c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f42760a = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f42761b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42762c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetExternalContactListRequest getExternalContactListRequest) throws IOException {
            if (getExternalContactListRequest.strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 1, getExternalContactListRequest.strategy);
            }
            if (getExternalContactListRequest.offset != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getExternalContactListRequest.offset);
            }
            if (getExternalContactListRequest.limit != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getExternalContactListRequest.limit);
            }
            protoWriter.writeBytes(getExternalContactListRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetExternalContactListRequest$a */
    public static final class C16458a extends Message.Builder<GetExternalContactListRequest, C16458a> {

        /* renamed from: a */
        public SyncDataStrategy f42760a;

        /* renamed from: b */
        public Long f42761b;

        /* renamed from: c */
        public Long f42762c;

        /* renamed from: a */
        public GetExternalContactListRequest build() {
            return new GetExternalContactListRequest(this.f42760a, this.f42761b, this.f42762c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16458a mo58699a(SyncDataStrategy syncDataStrategy) {
            this.f42760a = syncDataStrategy;
            return this;
        }

        /* renamed from: b */
        public C16458a mo58702b(Long l) {
            this.f42762c = l;
            return this;
        }

        /* renamed from: a */
        public C16458a mo58700a(Long l) {
            this.f42761b = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16458a newBuilder() {
        C16458a aVar = new C16458a();
        aVar.f42760a = this.strategy;
        aVar.f42761b = this.offset;
        aVar.f42762c = this.limit;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetExternalContactListRequest");
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
        StringBuilder replace = sb.replace(0, 2, "GetExternalContactListRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetExternalContactListRequest(SyncDataStrategy syncDataStrategy, Long l, Long l2) {
        this(syncDataStrategy, l, l2, ByteString.EMPTY);
    }

    public GetExternalContactListRequest(SyncDataStrategy syncDataStrategy, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.strategy = syncDataStrategy;
        this.offset = l;
        this.limit = l2;
    }
}
