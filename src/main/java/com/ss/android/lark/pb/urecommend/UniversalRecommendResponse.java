package com.ss.android.lark.pb.urecommend;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class UniversalRecommendResponse extends Message<UniversalRecommendResponse, C50172a> {
    public static final ProtoAdapter<UniversalRecommendResponse> ADAPTER = new C50173b();
    private static final long serialVersionUID = 0;
    public final UniversalRecommendResponseHeader mheader;
    public final List<RecommendSection> mrecommend_sections;

    /* renamed from: com.ss.android.lark.pb.urecommend.UniversalRecommendResponse$b */
    private static final class C50173b extends ProtoAdapter<UniversalRecommendResponse> {
        C50173b() {
            super(FieldEncoding.LENGTH_DELIMITED, UniversalRecommendResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UniversalRecommendResponse universalRecommendResponse) {
            return UniversalRecommendResponseHeader.ADAPTER.encodedSizeWithTag(1, universalRecommendResponse.mheader) + RecommendSection.ADAPTER.asRepeated().encodedSizeWithTag(2, universalRecommendResponse.mrecommend_sections) + universalRecommendResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UniversalRecommendResponse decode(ProtoReader protoReader) throws IOException {
            C50172a aVar = new C50172a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125370a = UniversalRecommendResponseHeader.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125371b.add(RecommendSection.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UniversalRecommendResponse universalRecommendResponse) throws IOException {
            UniversalRecommendResponseHeader.ADAPTER.encodeWithTag(protoWriter, 1, universalRecommendResponse.mheader);
            RecommendSection.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, universalRecommendResponse.mrecommend_sections);
            protoWriter.writeBytes(universalRecommendResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.urecommend.UniversalRecommendResponse$a */
    public static final class C50172a extends Message.Builder<UniversalRecommendResponse, C50172a> {

        /* renamed from: a */
        public UniversalRecommendResponseHeader f125370a;

        /* renamed from: b */
        public List<RecommendSection> f125371b = Internal.newMutableList();

        /* renamed from: a */
        public UniversalRecommendResponse build() {
            UniversalRecommendResponseHeader universalRecommendResponseHeader = this.f125370a;
            if (universalRecommendResponseHeader != null) {
                return new UniversalRecommendResponse(universalRecommendResponseHeader, this.f125371b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(universalRecommendResponseHeader, "mheader");
        }
    }

    @Override // com.squareup.wire.Message
    public C50172a newBuilder() {
        C50172a aVar = new C50172a();
        aVar.f125370a = this.mheader;
        aVar.f125371b = Internal.copyOf("mrecommend_sections", this.mrecommend_sections);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", header=");
        sb.append(this.mheader);
        if (!this.mrecommend_sections.isEmpty()) {
            sb.append(", recommend_sections=");
            sb.append(this.mrecommend_sections);
        }
        StringBuilder replace = sb.replace(0, 2, "UniversalRecommendResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UniversalRecommendResponse(UniversalRecommendResponseHeader universalRecommendResponseHeader, List<RecommendSection> list) {
        this(universalRecommendResponseHeader, list, ByteString.EMPTY);
    }

    public UniversalRecommendResponse(UniversalRecommendResponseHeader universalRecommendResponseHeader, List<RecommendSection> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mheader = universalRecommendResponseHeader;
        this.mrecommend_sections = Internal.immutableCopyOf("mrecommend_sections", list);
    }
}
