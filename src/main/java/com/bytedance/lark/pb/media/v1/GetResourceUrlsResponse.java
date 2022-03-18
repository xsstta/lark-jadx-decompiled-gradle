package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetResourceUrlsResponse extends Message<GetResourceUrlsResponse, C18256a> {
    public static final ProtoAdapter<GetResourceUrlsResponse> ADAPTER = new C18257b();
    private static final long serialVersionUID = 0;
    public final List<String> urls;

    /* renamed from: com.bytedance.lark.pb.media.v1.GetResourceUrlsResponse$b */
    private static final class C18257b extends ProtoAdapter<GetResourceUrlsResponse> {
        C18257b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetResourceUrlsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetResourceUrlsResponse getResourceUrlsResponse) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getResourceUrlsResponse.urls) + getResourceUrlsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetResourceUrlsResponse decode(ProtoReader protoReader) throws IOException {
            C18256a aVar = new C18256a();
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
                    aVar.f45508a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetResourceUrlsResponse getResourceUrlsResponse) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getResourceUrlsResponse.urls);
            protoWriter.writeBytes(getResourceUrlsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.GetResourceUrlsResponse$a */
    public static final class C18256a extends Message.Builder<GetResourceUrlsResponse, C18256a> {

        /* renamed from: a */
        public List<String> f45508a = Internal.newMutableList();

        /* renamed from: a */
        public GetResourceUrlsResponse build() {
            return new GetResourceUrlsResponse(this.f45508a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18256a newBuilder() {
        C18256a aVar = new C18256a();
        aVar.f45508a = Internal.copyOf("urls", this.urls);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "GetResourceUrlsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.urls.isEmpty()) {
            sb.append(", urls=");
            sb.append(this.urls);
        }
        StringBuilder replace = sb.replace(0, 2, "GetResourceUrlsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetResourceUrlsResponse(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public GetResourceUrlsResponse(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.urls = Internal.immutableCopyOf("urls", list);
    }
}
