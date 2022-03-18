package com.ss.android.lark.pb.dynamic_resource;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CdnImageData extends Message<CdnImageData, C49618a> {
    public static final ProtoAdapter<CdnImageData> ADAPTER = new C49619b();
    private static final long serialVersionUID = 0;
    public final String murl;

    /* renamed from: com.ss.android.lark.pb.dynamic_resource.CdnImageData$b */
    private static final class C49619b extends ProtoAdapter<CdnImageData> {
        C49619b() {
            super(FieldEncoding.LENGTH_DELIMITED, CdnImageData.class);
        }

        /* renamed from: a */
        public int encodedSize(CdnImageData cdnImageData) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, cdnImageData.murl) + cdnImageData.unknownFields().size();
        }

        /* renamed from: a */
        public CdnImageData decode(ProtoReader protoReader) throws IOException {
            C49618a aVar = new C49618a();
            aVar.f124245a = "";
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
                    aVar.f124245a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CdnImageData cdnImageData) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, cdnImageData.murl);
            protoWriter.writeBytes(cdnImageData.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.dynamic_resource.CdnImageData$a */
    public static final class C49618a extends Message.Builder<CdnImageData, C49618a> {

        /* renamed from: a */
        public String f124245a;

        /* renamed from: a */
        public CdnImageData build() {
            String str = this.f124245a;
            if (str != null) {
                return new CdnImageData(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "murl");
        }
    }

    @Override // com.squareup.wire.Message
    public C49618a newBuilder() {
        C49618a aVar = new C49618a();
        aVar.f124245a = this.murl;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", url=");
        sb.append(this.murl);
        StringBuilder replace = sb.replace(0, 2, "CdnImageData{");
        replace.append('}');
        return replace.toString();
    }

    public CdnImageData(String str) {
        this(str, ByteString.EMPTY);
    }

    public CdnImageData(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.murl = str;
    }
}
