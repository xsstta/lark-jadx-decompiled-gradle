package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CdnImageData extends Message<CdnImageData, C16132a> {
    public static final ProtoAdapter<CdnImageData> ADAPTER = new C16133b();
    private static final long serialVersionUID = 0;
    public final String url;

    /* renamed from: com.bytedance.lark.pb.contact.v1.CdnImageData$b */
    private static final class C16133b extends ProtoAdapter<CdnImageData> {
        C16133b() {
            super(FieldEncoding.LENGTH_DELIMITED, CdnImageData.class);
        }

        /* renamed from: a */
        public int encodedSize(CdnImageData cdnImageData) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, cdnImageData.url) + cdnImageData.unknownFields().size();
        }

        /* renamed from: a */
        public CdnImageData decode(ProtoReader protoReader) throws IOException {
            C16132a aVar = new C16132a();
            aVar.f42246a = "";
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
                    aVar.f42246a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CdnImageData cdnImageData) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, cdnImageData.url);
            protoWriter.writeBytes(cdnImageData.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.CdnImageData$a */
    public static final class C16132a extends Message.Builder<CdnImageData, C16132a> {

        /* renamed from: a */
        public String f42246a;

        /* renamed from: a */
        public CdnImageData build() {
            String str = this.f42246a;
            if (str != null) {
                return new CdnImageData(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "url");
        }
    }

    @Override // com.squareup.wire.Message
    public C16132a newBuilder() {
        C16132a aVar = new C16132a();
        aVar.f42246a = this.url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "CdnImageData");
        StringBuilder sb = new StringBuilder();
        sb.append(", url=");
        sb.append(this.url);
        StringBuilder replace = sb.replace(0, 2, "CdnImageData{");
        replace.append('}');
        return replace.toString();
    }

    public CdnImageData(String str) {
        this(str, ByteString.EMPTY);
    }

    public CdnImageData(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.url = str;
    }
}
