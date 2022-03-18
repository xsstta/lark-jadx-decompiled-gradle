package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetHashtagDetailRequest extends Message<GetHashtagDetailRequest, C18380a> {
    public static final ProtoAdapter<GetHashtagDetailRequest> ADAPTER = new C18381b();
    private static final long serialVersionUID = 0;
    public final String hashtag_id;

    /* renamed from: com.bytedance.lark.pb.moments.v1.GetHashtagDetailRequest$b */
    private static final class C18381b extends ProtoAdapter<GetHashtagDetailRequest> {
        C18381b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetHashtagDetailRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetHashtagDetailRequest getHashtagDetailRequest) {
            int i;
            if (getHashtagDetailRequest.hashtag_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getHashtagDetailRequest.hashtag_id);
            } else {
                i = 0;
            }
            return i + getHashtagDetailRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetHashtagDetailRequest decode(ProtoReader protoReader) throws IOException {
            C18380a aVar = new C18380a();
            aVar.f45763a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45763a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetHashtagDetailRequest getHashtagDetailRequest) throws IOException {
            if (getHashtagDetailRequest.hashtag_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getHashtagDetailRequest.hashtag_id);
            }
            protoWriter.writeBytes(getHashtagDetailRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.GetHashtagDetailRequest$a */
    public static final class C18380a extends Message.Builder<GetHashtagDetailRequest, C18380a> {

        /* renamed from: a */
        public String f45763a;

        /* renamed from: a */
        public GetHashtagDetailRequest build() {
            return new GetHashtagDetailRequest(this.f45763a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18380a mo63574a(String str) {
            this.f45763a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18380a newBuilder() {
        C18380a aVar = new C18380a();
        aVar.f45763a = this.hashtag_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "GetHashtagDetailRequest");
        StringBuilder sb = new StringBuilder();
        if (this.hashtag_id != null) {
            sb.append(", hashtag_id=");
            sb.append(this.hashtag_id);
        }
        StringBuilder replace = sb.replace(0, 2, "GetHashtagDetailRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetHashtagDetailRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetHashtagDetailRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.hashtag_id = str;
    }
}
