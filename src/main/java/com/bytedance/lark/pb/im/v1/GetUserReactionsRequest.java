package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetUserReactionsRequest extends Message<GetUserReactionsRequest, C17763a> {
    public static final ProtoAdapter<GetUserReactionsRequest> ADAPTER = new C17764b();
    public static final Boolean DEFAULT_IS_FROM_LOCAL = true;
    public static final Integer DEFAULT_VERSION = 0;
    private static final long serialVersionUID = 0;
    public final Boolean is_from_local;
    public final Integer version;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetUserReactionsRequest$b */
    private static final class C17764b extends ProtoAdapter<GetUserReactionsRequest> {
        C17764b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserReactionsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserReactionsRequest getUserReactionsRequest) {
            int i;
            int i2 = 0;
            if (getUserReactionsRequest.version != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, getUserReactionsRequest.version);
            } else {
                i = 0;
            }
            if (getUserReactionsRequest.is_from_local != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, getUserReactionsRequest.is_from_local);
            }
            return i + i2 + getUserReactionsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserReactionsRequest decode(ProtoReader protoReader) throws IOException {
            C17763a aVar = new C17763a();
            aVar.f44809a = 0;
            aVar.f44810b = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44809a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44810b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUserReactionsRequest getUserReactionsRequest) throws IOException {
            if (getUserReactionsRequest.version != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, getUserReactionsRequest.version);
            }
            if (getUserReactionsRequest.is_from_local != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getUserReactionsRequest.is_from_local);
            }
            protoWriter.writeBytes(getUserReactionsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetUserReactionsRequest$a */
    public static final class C17763a extends Message.Builder<GetUserReactionsRequest, C17763a> {

        /* renamed from: a */
        public Integer f44809a;

        /* renamed from: b */
        public Boolean f44810b;

        /* renamed from: a */
        public GetUserReactionsRequest build() {
            return new GetUserReactionsRequest(this.f44809a, this.f44810b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17763a mo61974a(Boolean bool) {
            this.f44810b = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17763a newBuilder() {
        C17763a aVar = new C17763a();
        aVar.f44809a = this.version;
        aVar.f44810b = this.is_from_local;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetUserReactionsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (this.is_from_local != null) {
            sb.append(", is_from_local=");
            sb.append(this.is_from_local);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUserReactionsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserReactionsRequest(Integer num, Boolean bool) {
        this(num, bool, ByteString.EMPTY);
    }

    public GetUserReactionsRequest(Integer num, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.version = num;
        this.is_from_local = bool;
    }
}
