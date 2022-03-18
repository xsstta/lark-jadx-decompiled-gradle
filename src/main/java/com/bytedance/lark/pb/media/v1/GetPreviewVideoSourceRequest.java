package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetPreviewVideoSourceRequest extends Message<GetPreviewVideoSourceRequest, C18250a> {
    public static final ProtoAdapter<GetPreviewVideoSourceRequest> ADAPTER = new C18251b();
    public static final Boolean DEFAULT_FORCE_UPDATE = false;
    private static final long serialVersionUID = 0;
    public final Boolean force_update;
    public final String url;

    /* renamed from: com.bytedance.lark.pb.media.v1.GetPreviewVideoSourceRequest$b */
    private static final class C18251b extends ProtoAdapter<GetPreviewVideoSourceRequest> {
        C18251b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetPreviewVideoSourceRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetPreviewVideoSourceRequest getPreviewVideoSourceRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getPreviewVideoSourceRequest.url);
            if (getPreviewVideoSourceRequest.force_update != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, getPreviewVideoSourceRequest.force_update);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getPreviewVideoSourceRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetPreviewVideoSourceRequest decode(ProtoReader protoReader) throws IOException {
            C18250a aVar = new C18250a();
            aVar.f45502a = "";
            aVar.f45503b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45502a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45503b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetPreviewVideoSourceRequest getPreviewVideoSourceRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getPreviewVideoSourceRequest.url);
            if (getPreviewVideoSourceRequest.force_update != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getPreviewVideoSourceRequest.force_update);
            }
            protoWriter.writeBytes(getPreviewVideoSourceRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.GetPreviewVideoSourceRequest$a */
    public static final class C18250a extends Message.Builder<GetPreviewVideoSourceRequest, C18250a> {

        /* renamed from: a */
        public String f45502a;

        /* renamed from: b */
        public Boolean f45503b;

        /* renamed from: a */
        public GetPreviewVideoSourceRequest build() {
            String str = this.f45502a;
            if (str != null) {
                return new GetPreviewVideoSourceRequest(str, this.f45503b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "url");
        }

        /* renamed from: a */
        public C18250a mo63237a(Boolean bool) {
            this.f45503b = bool;
            return this;
        }

        /* renamed from: a */
        public C18250a mo63238a(String str) {
            this.f45502a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18250a newBuilder() {
        C18250a aVar = new C18250a();
        aVar.f45502a = this.url;
        aVar.f45503b = this.force_update;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "GetPreviewVideoSourceRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", url=");
        sb.append(this.url);
        if (this.force_update != null) {
            sb.append(", force_update=");
            sb.append(this.force_update);
        }
        StringBuilder replace = sb.replace(0, 2, "GetPreviewVideoSourceRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetPreviewVideoSourceRequest(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public GetPreviewVideoSourceRequest(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.url = str;
        this.force_update = bool;
    }
}
