package com.ss.android.lark.pb.moments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetAnonymousInfoRequest extends Message<GetAnonymousInfoRequest, C49908a> {
    public static final ProtoAdapter<GetAnonymousInfoRequest> ADAPTER = new C49909b();
    private static final long serialVersionUID = 0;
    public final String mpost_id;

    /* renamed from: com.ss.android.lark.pb.moments.GetAnonymousInfoRequest$b */
    private static final class C49909b extends ProtoAdapter<GetAnonymousInfoRequest> {
        C49909b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAnonymousInfoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAnonymousInfoRequest getAnonymousInfoRequest) {
            int i;
            if (getAnonymousInfoRequest.mpost_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getAnonymousInfoRequest.mpost_id);
            } else {
                i = 0;
            }
            return i + getAnonymousInfoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetAnonymousInfoRequest decode(ProtoReader protoReader) throws IOException {
            C49908a aVar = new C49908a();
            aVar.f124928a = "";
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
                    aVar.f124928a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAnonymousInfoRequest getAnonymousInfoRequest) throws IOException {
            if (getAnonymousInfoRequest.mpost_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getAnonymousInfoRequest.mpost_id);
            }
            protoWriter.writeBytes(getAnonymousInfoRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments.GetAnonymousInfoRequest$a */
    public static final class C49908a extends Message.Builder<GetAnonymousInfoRequest, C49908a> {

        /* renamed from: a */
        public String f124928a;

        /* renamed from: a */
        public GetAnonymousInfoRequest build() {
            return new GetAnonymousInfoRequest(this.f124928a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49908a mo173587a(String str) {
            this.f124928a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49908a newBuilder() {
        C49908a aVar = new C49908a();
        aVar.f124928a = this.mpost_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mpost_id != null) {
            sb.append(", post_id=");
            sb.append(this.mpost_id);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAnonymousInfoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetAnonymousInfoRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetAnonymousInfoRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mpost_id = str;
    }
}
