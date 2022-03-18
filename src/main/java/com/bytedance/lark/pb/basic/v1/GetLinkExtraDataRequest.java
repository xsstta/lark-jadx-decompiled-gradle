package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetLinkExtraDataRequest extends Message<GetLinkExtraDataRequest, C14969a> {
    public static final ProtoAdapter<GetLinkExtraDataRequest> ADAPTER = new C14970b();
    private static final long serialVersionUID = 0;
    public final String link;

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetLinkExtraDataRequest$b */
    private static final class C14970b extends ProtoAdapter<GetLinkExtraDataRequest> {
        C14970b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetLinkExtraDataRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetLinkExtraDataRequest getLinkExtraDataRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getLinkExtraDataRequest.link) + getLinkExtraDataRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetLinkExtraDataRequest decode(ProtoReader protoReader) throws IOException {
            C14969a aVar = new C14969a();
            aVar.f39623a = "";
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
                    aVar.f39623a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetLinkExtraDataRequest getLinkExtraDataRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getLinkExtraDataRequest.link);
            protoWriter.writeBytes(getLinkExtraDataRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetLinkExtraDataRequest$a */
    public static final class C14969a extends Message.Builder<GetLinkExtraDataRequest, C14969a> {

        /* renamed from: a */
        public String f39623a;

        /* renamed from: a */
        public GetLinkExtraDataRequest build() {
            String str = this.f39623a;
            if (str != null) {
                return new GetLinkExtraDataRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "link");
        }

        /* renamed from: a */
        public C14969a mo54746a(String str) {
            this.f39623a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C14969a newBuilder() {
        C14969a aVar = new C14969a();
        aVar.f39623a = this.link;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "GetLinkExtraDataRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", link=");
        sb.append(this.link);
        StringBuilder replace = sb.replace(0, 2, "GetLinkExtraDataRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetLinkExtraDataRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetLinkExtraDataRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.link = str;
    }
}
