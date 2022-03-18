package com.ss.android.lark.pb.moments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetAnonymousInfoResponse extends Message<GetAnonymousInfoResponse, C49910a> {
    public static final ProtoAdapter<GetAnonymousInfoResponse> ADAPTER = new C49911b();
    public static final Boolean DEFAULT_HAS_QUOTA = false;
    private static final long serialVersionUID = 0;
    public final Boolean mhas_quota;

    /* renamed from: com.ss.android.lark.pb.moments.GetAnonymousInfoResponse$b */
    private static final class C49911b extends ProtoAdapter<GetAnonymousInfoResponse> {
        C49911b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAnonymousInfoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAnonymousInfoResponse getAnonymousInfoResponse) {
            int i;
            if (getAnonymousInfoResponse.mhas_quota != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, getAnonymousInfoResponse.mhas_quota);
            } else {
                i = 0;
            }
            return i + getAnonymousInfoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetAnonymousInfoResponse decode(ProtoReader protoReader) throws IOException {
            C49910a aVar = new C49910a();
            aVar.f124929a = false;
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
                    aVar.f124929a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAnonymousInfoResponse getAnonymousInfoResponse) throws IOException {
            if (getAnonymousInfoResponse.mhas_quota != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getAnonymousInfoResponse.mhas_quota);
            }
            protoWriter.writeBytes(getAnonymousInfoResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments.GetAnonymousInfoResponse$a */
    public static final class C49910a extends Message.Builder<GetAnonymousInfoResponse, C49910a> {

        /* renamed from: a */
        public Boolean f124929a;

        /* renamed from: a */
        public GetAnonymousInfoResponse build() {
            return new GetAnonymousInfoResponse(this.f124929a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49910a newBuilder() {
        C49910a aVar = new C49910a();
        aVar.f124929a = this.mhas_quota;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mhas_quota != null) {
            sb.append(", has_quota=");
            sb.append(this.mhas_quota);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAnonymousInfoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetAnonymousInfoResponse(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public GetAnonymousInfoResponse(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mhas_quota = bool;
    }
}
