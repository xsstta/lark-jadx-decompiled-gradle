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

public final class GetLinkExtraDataResponse extends Message<GetLinkExtraDataResponse, C14975a> {
    public static final ProtoAdapter<GetLinkExtraDataResponse> ADAPTER = new C14976b();
    private static final long serialVersionUID = 0;
    public final SpaceLink space_link;
    public final ZendeskLink zendesk_link;

    public static final class SpaceLink extends Message<SpaceLink, C14971a> {
        public static final ProtoAdapter<SpaceLink> ADAPTER = new C14972b();
        private static final long serialVersionUID = 0;
        public final String app_id;

        /* renamed from: com.bytedance.lark.pb.basic.v1.GetLinkExtraDataResponse$SpaceLink$b */
        private static final class C14972b extends ProtoAdapter<SpaceLink> {
            C14972b() {
                super(FieldEncoding.LENGTH_DELIMITED, SpaceLink.class);
            }

            /* renamed from: a */
            public int encodedSize(SpaceLink spaceLink) {
                int i;
                if (spaceLink.app_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, spaceLink.app_id);
                } else {
                    i = 0;
                }
                return i + spaceLink.unknownFields().size();
            }

            /* renamed from: a */
            public SpaceLink decode(ProtoReader protoReader) throws IOException {
                C14971a aVar = new C14971a();
                aVar.f39624a = "";
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
                        aVar.f39624a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SpaceLink spaceLink) throws IOException {
                if (spaceLink.app_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, spaceLink.app_id);
                }
                protoWriter.writeBytes(spaceLink.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.GetLinkExtraDataResponse$SpaceLink$a */
        public static final class C14971a extends Message.Builder<SpaceLink, C14971a> {

            /* renamed from: a */
            public String f39624a;

            /* renamed from: a */
            public SpaceLink build() {
                return new SpaceLink(this.f39624a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14971a newBuilder() {
            C14971a aVar = new C14971a();
            aVar.f39624a = this.app_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "SpaceLink");
            StringBuilder sb = new StringBuilder();
            if (this.app_id != null) {
                sb.append(", app_id=");
                sb.append(this.app_id);
            }
            StringBuilder replace = sb.replace(0, 2, "SpaceLink{");
            replace.append('}');
            return replace.toString();
        }

        public SpaceLink(String str) {
            this(str, ByteString.EMPTY);
        }

        public SpaceLink(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.app_id = str;
        }
    }

    public static final class ZendeskLink extends Message<ZendeskLink, C14973a> {
        public static final ProtoAdapter<ZendeskLink> ADAPTER = new C14974b();
        private static final long serialVersionUID = 0;

        /* renamed from: com.bytedance.lark.pb.basic.v1.GetLinkExtraDataResponse$ZendeskLink$b */
        private static final class C14974b extends ProtoAdapter<ZendeskLink> {
            C14974b() {
                super(FieldEncoding.LENGTH_DELIMITED, ZendeskLink.class);
            }

            /* renamed from: a */
            public int encodedSize(ZendeskLink zendeskLink) {
                return zendeskLink.unknownFields().size();
            }

            /* renamed from: a */
            public ZendeskLink decode(ProtoReader protoReader) throws IOException {
                C14973a aVar = new C14973a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ZendeskLink zendeskLink) throws IOException {
                protoWriter.writeBytes(zendeskLink.unknownFields());
            }
        }

        public ZendeskLink() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.GetLinkExtraDataResponse$ZendeskLink$a */
        public static final class C14973a extends Message.Builder<ZendeskLink, C14973a> {
            /* renamed from: a */
            public ZendeskLink build() {
                return new ZendeskLink(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14973a newBuilder() {
            C14973a aVar = new C14973a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "ZendeskLink");
            StringBuilder replace = new StringBuilder().replace(0, 2, "ZendeskLink{");
            replace.append('}');
            return replace.toString();
        }

        public ZendeskLink(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetLinkExtraDataResponse$b */
    private static final class C14976b extends ProtoAdapter<GetLinkExtraDataResponse> {
        C14976b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetLinkExtraDataResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetLinkExtraDataResponse getLinkExtraDataResponse) {
            int i;
            int i2 = 0;
            if (getLinkExtraDataResponse.space_link != null) {
                i = SpaceLink.ADAPTER.encodedSizeWithTag(1, getLinkExtraDataResponse.space_link);
            } else {
                i = 0;
            }
            if (getLinkExtraDataResponse.zendesk_link != null) {
                i2 = ZendeskLink.ADAPTER.encodedSizeWithTag(2, getLinkExtraDataResponse.zendesk_link);
            }
            return i + i2 + getLinkExtraDataResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetLinkExtraDataResponse decode(ProtoReader protoReader) throws IOException {
            C14975a aVar = new C14975a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.mo54759a(SpaceLink.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.mo54760a(ZendeskLink.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetLinkExtraDataResponse getLinkExtraDataResponse) throws IOException {
            if (getLinkExtraDataResponse.space_link != null) {
                SpaceLink.ADAPTER.encodeWithTag(protoWriter, 1, getLinkExtraDataResponse.space_link);
            }
            if (getLinkExtraDataResponse.zendesk_link != null) {
                ZendeskLink.ADAPTER.encodeWithTag(protoWriter, 2, getLinkExtraDataResponse.zendesk_link);
            }
            protoWriter.writeBytes(getLinkExtraDataResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetLinkExtraDataResponse$a */
    public static final class C14975a extends Message.Builder<GetLinkExtraDataResponse, C14975a> {

        /* renamed from: a */
        public SpaceLink f39625a;

        /* renamed from: b */
        public ZendeskLink f39626b;

        /* renamed from: a */
        public GetLinkExtraDataResponse build() {
            return new GetLinkExtraDataResponse(this.f39625a, this.f39626b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C14975a mo54759a(SpaceLink spaceLink) {
            this.f39625a = spaceLink;
            this.f39626b = null;
            return this;
        }

        /* renamed from: a */
        public C14975a mo54760a(ZendeskLink zendeskLink) {
            this.f39626b = zendeskLink;
            this.f39625a = null;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C14975a newBuilder() {
        C14975a aVar = new C14975a();
        aVar.f39625a = this.space_link;
        aVar.f39626b = this.zendesk_link;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "GetLinkExtraDataResponse");
        StringBuilder sb = new StringBuilder();
        if (this.space_link != null) {
            sb.append(", space_link=");
            sb.append(this.space_link);
        }
        if (this.zendesk_link != null) {
            sb.append(", zendesk_link=");
            sb.append(this.zendesk_link);
        }
        StringBuilder replace = sb.replace(0, 2, "GetLinkExtraDataResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetLinkExtraDataResponse(SpaceLink spaceLink, ZendeskLink zendeskLink) {
        this(spaceLink, zendeskLink, ByteString.EMPTY);
    }

    public GetLinkExtraDataResponse(SpaceLink spaceLink, ZendeskLink zendeskLink, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(spaceLink, zendeskLink) <= 1) {
            this.space_link = spaceLink;
            this.zendesk_link = zendeskLink;
            return;
        }
        throw new IllegalArgumentException("at most one of space_link, zendesk_link may be non-null");
    }
}
