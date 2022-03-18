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

public final class MGetChatsRequest extends Message<MGetChatsRequest, C17799a> {
    public static final ProtoAdapter<MGetChatsRequest> ADAPTER = new C17800b();
    public static final Boolean DEFAULT_SHOULD_AUTH = false;
    public static final SyncDataStrategy DEFAULT_STRATEGY = SyncDataStrategy.TRY_LOCAL;
    private static final long serialVersionUID = 0;
    public final List<String> chat_ids;
    public final Boolean should_auth;
    public final SyncDataStrategy strategy;

    /* renamed from: com.bytedance.lark.pb.im.v1.MGetChatsRequest$b */
    private static final class C17800b extends ProtoAdapter<MGetChatsRequest> {
        C17800b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetChatsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetChatsRequest mGetChatsRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mGetChatsRequest.chat_ids);
            int i2 = 0;
            if (mGetChatsRequest.should_auth != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, mGetChatsRequest.should_auth);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (mGetChatsRequest.strategy != null) {
                i2 = SyncDataStrategy.ADAPTER.encodedSizeWithTag(3, mGetChatsRequest.strategy);
            }
            return i3 + i2 + mGetChatsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MGetChatsRequest decode(ProtoReader protoReader) throws IOException {
            C17799a aVar = new C17799a();
            aVar.f44842b = false;
            aVar.f44843c = SyncDataStrategy.TRY_LOCAL;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44841a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f44842b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f44843c = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetChatsRequest mGetChatsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mGetChatsRequest.chat_ids);
            if (mGetChatsRequest.should_auth != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, mGetChatsRequest.should_auth);
            }
            if (mGetChatsRequest.strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 3, mGetChatsRequest.strategy);
            }
            protoWriter.writeBytes(mGetChatsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.MGetChatsRequest$a */
    public static final class C17799a extends Message.Builder<MGetChatsRequest, C17799a> {

        /* renamed from: a */
        public List<String> f44841a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f44842b;

        /* renamed from: c */
        public SyncDataStrategy f44843c;

        /* renamed from: a */
        public MGetChatsRequest build() {
            return new MGetChatsRequest(this.f44841a, this.f44842b, this.f44843c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17799a mo62059a(SyncDataStrategy syncDataStrategy) {
            this.f44843c = syncDataStrategy;
            return this;
        }

        /* renamed from: a */
        public C17799a mo62060a(Boolean bool) {
            this.f44842b = bool;
            return this;
        }

        /* renamed from: a */
        public C17799a mo62061a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44841a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17799a newBuilder() {
        C17799a aVar = new C17799a();
        aVar.f44841a = Internal.copyOf("chat_ids", this.chat_ids);
        aVar.f44842b = this.should_auth;
        aVar.f44843c = this.strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "MGetChatsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.chat_ids.isEmpty()) {
            sb.append(", chat_ids=");
            sb.append(this.chat_ids);
        }
        if (this.should_auth != null) {
            sb.append(", should_auth=");
            sb.append(this.should_auth);
        }
        if (this.strategy != null) {
            sb.append(", strategy=");
            sb.append(this.strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetChatsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MGetChatsRequest(List<String> list, Boolean bool, SyncDataStrategy syncDataStrategy) {
        this(list, bool, syncDataStrategy, ByteString.EMPTY);
    }

    public MGetChatsRequest(List<String> list, Boolean bool, SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_ids = Internal.immutableCopyOf("chat_ids", list);
        this.should_auth = bool;
        this.strategy = syncDataStrategy;
    }
}
