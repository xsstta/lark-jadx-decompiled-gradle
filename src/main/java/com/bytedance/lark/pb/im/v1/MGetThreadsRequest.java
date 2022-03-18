package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class MGetThreadsRequest extends Message<MGetThreadsRequest, C17807a> {
    public static final ProtoAdapter<MGetThreadsRequest> ADAPTER = new C17808b();
    public static final Boolean DEFAULT_SHOULD_AUTH = false;
    public static final SyncDataStrategy DEFAULT_STRATEGY = SyncDataStrategy.TRY_LOCAL;
    private static final long serialVersionUID = 0;
    public final Boolean should_auth;
    public final SyncDataStrategy strategy;
    public final List<String> thread_ids;

    /* renamed from: com.bytedance.lark.pb.im.v1.MGetThreadsRequest$b */
    private static final class C17808b extends ProtoAdapter<MGetThreadsRequest> {
        C17808b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetThreadsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetThreadsRequest mGetThreadsRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mGetThreadsRequest.thread_ids);
            int i2 = 0;
            if (mGetThreadsRequest.should_auth != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, mGetThreadsRequest.should_auth);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (mGetThreadsRequest.strategy != null) {
                i2 = SyncDataStrategy.ADAPTER.encodedSizeWithTag(3, mGetThreadsRequest.strategy);
            }
            return i3 + i2 + mGetThreadsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MGetThreadsRequest decode(ProtoReader protoReader) throws IOException {
            C17807a aVar = new C17807a();
            aVar.f44851b = false;
            aVar.f44852c = SyncDataStrategy.TRY_LOCAL;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44850a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f44851b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f44852c = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetThreadsRequest mGetThreadsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mGetThreadsRequest.thread_ids);
            if (mGetThreadsRequest.should_auth != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, mGetThreadsRequest.should_auth);
            }
            if (mGetThreadsRequest.strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 3, mGetThreadsRequest.strategy);
            }
            protoWriter.writeBytes(mGetThreadsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.MGetThreadsRequest$a */
    public static final class C17807a extends Message.Builder<MGetThreadsRequest, C17807a> {

        /* renamed from: a */
        public List<String> f44850a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f44851b;

        /* renamed from: c */
        public SyncDataStrategy f44852c;

        /* renamed from: a */
        public MGetThreadsRequest build() {
            return new MGetThreadsRequest(this.f44850a, this.f44851b, this.f44852c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17807a mo62080a(SyncDataStrategy syncDataStrategy) {
            this.f44852c = syncDataStrategy;
            return this;
        }

        /* renamed from: a */
        public C17807a mo62081a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44850a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17807a newBuilder() {
        C17807a aVar = new C17807a();
        aVar.f44850a = Internal.copyOf("thread_ids", this.thread_ids);
        aVar.f44851b = this.should_auth;
        aVar.f44852c = this.strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "MGetThreadsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.thread_ids.isEmpty()) {
            sb.append(", thread_ids=");
            sb.append(this.thread_ids);
        }
        if (this.should_auth != null) {
            sb.append(", should_auth=");
            sb.append(this.should_auth);
        }
        if (this.strategy != null) {
            sb.append(", strategy=");
            sb.append(this.strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetThreadsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MGetThreadsRequest(List<String> list, Boolean bool, SyncDataStrategy syncDataStrategy) {
        this(list, bool, syncDataStrategy, ByteString.EMPTY);
    }

    public MGetThreadsRequest(List<String> list, Boolean bool, SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thread_ids = Internal.immutableCopyOf("thread_ids", list);
        this.should_auth = bool;
        this.strategy = syncDataStrategy;
    }
}
