package com.bytedance.lark.pb.contact.v2;

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

public final class GetNamecardsByIDsResponse extends Message<GetNamecardsByIDsResponse, C16482a> {
    public static final ProtoAdapter<GetNamecardsByIDsResponse> ADAPTER = new C16483b();
    private static final long serialVersionUID = 0;
    public final Map<String, NamecardMetaInfo> namecards;

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetNamecardsByIDsResponse$a */
    public static final class C16482a extends Message.Builder<GetNamecardsByIDsResponse, C16482a> {

        /* renamed from: a */
        public Map<String, NamecardMetaInfo> f42791a = Internal.newMutableMap();

        /* renamed from: a */
        public GetNamecardsByIDsResponse build() {
            return new GetNamecardsByIDsResponse(this.f42791a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetNamecardsByIDsResponse$b */
    private static final class C16483b extends ProtoAdapter<GetNamecardsByIDsResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, NamecardMetaInfo>> f42792a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, NamecardMetaInfo.ADAPTER);

        C16483b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetNamecardsByIDsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetNamecardsByIDsResponse getNamecardsByIDsResponse) {
            return this.f42792a.encodedSizeWithTag(1, getNamecardsByIDsResponse.namecards) + getNamecardsByIDsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetNamecardsByIDsResponse decode(ProtoReader protoReader) throws IOException {
            C16482a aVar = new C16482a();
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
                    aVar.f42791a.putAll(this.f42792a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetNamecardsByIDsResponse getNamecardsByIDsResponse) throws IOException {
            this.f42792a.encodeWithTag(protoWriter, 1, getNamecardsByIDsResponse.namecards);
            protoWriter.writeBytes(getNamecardsByIDsResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16482a newBuilder() {
        C16482a aVar = new C16482a();
        aVar.f42791a = Internal.copyOf("namecards", this.namecards);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetNamecardsByIDsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.namecards.isEmpty()) {
            sb.append(", namecards=");
            sb.append(this.namecards);
        }
        StringBuilder replace = sb.replace(0, 2, "GetNamecardsByIDsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetNamecardsByIDsResponse(Map<String, NamecardMetaInfo> map) {
        this(map, ByteString.EMPTY);
    }

    public GetNamecardsByIDsResponse(Map<String, NamecardMetaInfo> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.namecards = Internal.immutableCopyOf("namecards", map);
    }
}
