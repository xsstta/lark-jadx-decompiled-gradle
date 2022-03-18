package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class GetEmojisResponse extends Message<GetEmojisResponse, C17576a> {
    public static final ProtoAdapter<GetEmojisResponse> ADAPTER = new C17577b();
    public static final Integer DEFAULT_VERSION = 0;
    private static final long serialVersionUID = 0;
    public final Map<String, Emoji> emojis;
    public final Integer version;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetEmojisResponse$a */
    public static final class C17576a extends Message.Builder<GetEmojisResponse, C17576a> {

        /* renamed from: a */
        public Map<String, Emoji> f44534a = Internal.newMutableMap();

        /* renamed from: b */
        public Integer f44535b;

        /* renamed from: a */
        public GetEmojisResponse build() {
            return new GetEmojisResponse(this.f44534a, this.f44535b, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetEmojisResponse$b */
    private static final class C17577b extends ProtoAdapter<GetEmojisResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Emoji>> f44536a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Emoji.ADAPTER);

        C17577b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetEmojisResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetEmojisResponse getEmojisResponse) {
            int i;
            int encodedSizeWithTag = this.f44536a.encodedSizeWithTag(1, getEmojisResponse.emojis);
            if (getEmojisResponse.version != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, getEmojisResponse.version);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getEmojisResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetEmojisResponse decode(ProtoReader protoReader) throws IOException {
            C17576a aVar = new C17576a();
            aVar.f44535b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44534a.putAll(this.f44536a.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44535b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetEmojisResponse getEmojisResponse) throws IOException {
            this.f44536a.encodeWithTag(protoWriter, 1, getEmojisResponse.emojis);
            if (getEmojisResponse.version != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getEmojisResponse.version);
            }
            protoWriter.writeBytes(getEmojisResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17576a newBuilder() {
        C17576a aVar = new C17576a();
        aVar.f44534a = Internal.copyOf("emojis", this.emojis);
        aVar.f44535b = this.version;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetEmojisResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.emojis.isEmpty()) {
            sb.append(", emojis=");
            sb.append(this.emojis);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        StringBuilder replace = sb.replace(0, 2, "GetEmojisResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetEmojisResponse(Map<String, Emoji> map, Integer num) {
        this(map, num, ByteString.EMPTY);
    }

    public GetEmojisResponse(Map<String, Emoji> map, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.emojis = Internal.immutableCopyOf("emojis", map);
        this.version = num;
    }
}
