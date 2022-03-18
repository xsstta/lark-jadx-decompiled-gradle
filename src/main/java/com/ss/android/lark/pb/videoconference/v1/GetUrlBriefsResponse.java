package com.ss.android.lark.pb.videoconference.v1;

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

public final class GetUrlBriefsResponse extends Message<GetUrlBriefsResponse, C50691a> {
    public static final ProtoAdapter<GetUrlBriefsResponse> ADAPTER = new C50692b();
    private static final long serialVersionUID = 0;
    public final Map<String, UrlBrief> url_briefs;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetUrlBriefsResponse$a */
    public static final class C50691a extends Message.Builder<GetUrlBriefsResponse, C50691a> {

        /* renamed from: a */
        public Map<String, UrlBrief> f126420a = Internal.newMutableMap();

        /* renamed from: a */
        public GetUrlBriefsResponse build() {
            return new GetUrlBriefsResponse(this.f126420a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetUrlBriefsResponse$b */
    private static final class C50692b extends ProtoAdapter<GetUrlBriefsResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, UrlBrief>> f126421a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, UrlBrief.ADAPTER);

        C50692b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUrlBriefsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUrlBriefsResponse getUrlBriefsResponse) {
            return this.f126421a.encodedSizeWithTag(1, getUrlBriefsResponse.url_briefs) + getUrlBriefsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUrlBriefsResponse decode(ProtoReader protoReader) throws IOException {
            C50691a aVar = new C50691a();
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
                    aVar.f126420a.putAll(this.f126421a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUrlBriefsResponse getUrlBriefsResponse) throws IOException {
            this.f126421a.encodeWithTag(protoWriter, 1, getUrlBriefsResponse.url_briefs);
            protoWriter.writeBytes(getUrlBriefsResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50691a newBuilder() {
        C50691a aVar = new C50691a();
        aVar.f126420a = Internal.copyOf("url_briefs", this.url_briefs);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetUrlBriefsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.url_briefs.isEmpty()) {
            sb.append(", url_briefs=");
            sb.append(this.url_briefs);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUrlBriefsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUrlBriefsResponse(Map<String, UrlBrief> map) {
        this(map, ByteString.EMPTY);
    }

    public GetUrlBriefsResponse(Map<String, UrlBrief> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.url_briefs = Internal.immutableCopyOf("url_briefs", map);
    }
}
