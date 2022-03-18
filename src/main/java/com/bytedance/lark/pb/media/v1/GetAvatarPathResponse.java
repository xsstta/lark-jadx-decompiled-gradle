package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetAvatarPathResponse extends Message<GetAvatarPathResponse, C18222a> {
    public static final ProtoAdapter<GetAvatarPathResponse> ADAPTER = new C18223b();
    private static final long serialVersionUID = 0;
    public final String path;

    /* renamed from: com.bytedance.lark.pb.media.v1.GetAvatarPathResponse$b */
    private static final class C18223b extends ProtoAdapter<GetAvatarPathResponse> {
        C18223b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAvatarPathResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAvatarPathResponse getAvatarPathResponse) {
            int i;
            if (getAvatarPathResponse.path != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getAvatarPathResponse.path);
            } else {
                i = 0;
            }
            return i + getAvatarPathResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetAvatarPathResponse decode(ProtoReader protoReader) throws IOException {
            C18222a aVar = new C18222a();
            aVar.f45459a = "";
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
                    aVar.f45459a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAvatarPathResponse getAvatarPathResponse) throws IOException {
            if (getAvatarPathResponse.path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getAvatarPathResponse.path);
            }
            protoWriter.writeBytes(getAvatarPathResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.GetAvatarPathResponse$a */
    public static final class C18222a extends Message.Builder<GetAvatarPathResponse, C18222a> {

        /* renamed from: a */
        public String f45459a;

        /* renamed from: a */
        public GetAvatarPathResponse build() {
            return new GetAvatarPathResponse(this.f45459a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18222a newBuilder() {
        C18222a aVar = new C18222a();
        aVar.f45459a = this.path;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "GetAvatarPathResponse");
        StringBuilder sb = new StringBuilder();
        if (this.path != null) {
            sb.append(", path=");
            sb.append(this.path);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAvatarPathResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetAvatarPathResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetAvatarPathResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.path = str;
    }
}
