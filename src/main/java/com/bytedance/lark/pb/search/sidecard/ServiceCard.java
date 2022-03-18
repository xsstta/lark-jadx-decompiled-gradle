package com.bytedance.lark.pb.search.sidecard;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ServiceCard extends Message<ServiceCard, C18801a> {
    public static final ProtoAdapter<ServiceCard> ADAPTER = new C18802b();
    private static final long serialVersionUID = 0;
    public final String id;
    public final String render_content;

    /* renamed from: com.bytedance.lark.pb.search.sidecard.ServiceCard$b */
    private static final class C18802b extends ProtoAdapter<ServiceCard> {
        C18802b() {
            super(FieldEncoding.LENGTH_DELIMITED, ServiceCard.class);
        }

        /* renamed from: a */
        public int encodedSize(ServiceCard serviceCard) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, serviceCard.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, serviceCard.render_content) + serviceCard.unknownFields().size();
        }

        /* renamed from: a */
        public ServiceCard decode(ProtoReader protoReader) throws IOException {
            C18801a aVar = new C18801a();
            aVar.f46365a = "";
            aVar.f46366b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46365a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46366b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ServiceCard serviceCard) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, serviceCard.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, serviceCard.render_content);
            protoWriter.writeBytes(serviceCard.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18801a newBuilder() {
        C18801a aVar = new C18801a();
        aVar.f46365a = this.id;
        aVar.f46366b = this.render_content;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.search.sidecard.ServiceCard$a */
    public static final class C18801a extends Message.Builder<ServiceCard, C18801a> {

        /* renamed from: a */
        public String f46365a;

        /* renamed from: b */
        public String f46366b;

        /* renamed from: a */
        public ServiceCard build() {
            String str;
            String str2 = this.f46365a;
            if (str2 != null && (str = this.f46366b) != null) {
                return new ServiceCard(str2, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "id", this.f46366b, "render_content");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "ServiceCard");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", render_content=");
        sb.append(this.render_content);
        StringBuilder replace = sb.replace(0, 2, "ServiceCard{");
        replace.append('}');
        return replace.toString();
    }

    public ServiceCard(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public ServiceCard(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.render_content = str2;
    }
}
