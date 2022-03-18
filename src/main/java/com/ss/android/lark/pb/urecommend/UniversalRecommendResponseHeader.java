package com.ss.android.lark.pb.urecommend;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UniversalRecommendResponseHeader extends Message<UniversalRecommendResponseHeader, C50174a> {
    public static final ProtoAdapter<UniversalRecommendResponseHeader> ADAPTER = new C50175b();
    private static final long serialVersionUID = 0;
    public final String msession_id;

    /* renamed from: com.ss.android.lark.pb.urecommend.UniversalRecommendResponseHeader$b */
    private static final class C50175b extends ProtoAdapter<UniversalRecommendResponseHeader> {
        C50175b() {
            super(FieldEncoding.LENGTH_DELIMITED, UniversalRecommendResponseHeader.class);
        }

        /* renamed from: a */
        public int encodedSize(UniversalRecommendResponseHeader universalRecommendResponseHeader) {
            int i;
            if (universalRecommendResponseHeader.msession_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, universalRecommendResponseHeader.msession_id);
            } else {
                i = 0;
            }
            return i + universalRecommendResponseHeader.unknownFields().size();
        }

        /* renamed from: a */
        public UniversalRecommendResponseHeader decode(ProtoReader protoReader) throws IOException {
            C50174a aVar = new C50174a();
            aVar.f125372a = "";
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
                    aVar.f125372a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UniversalRecommendResponseHeader universalRecommendResponseHeader) throws IOException {
            if (universalRecommendResponseHeader.msession_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, universalRecommendResponseHeader.msession_id);
            }
            protoWriter.writeBytes(universalRecommendResponseHeader.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.urecommend.UniversalRecommendResponseHeader$a */
    public static final class C50174a extends Message.Builder<UniversalRecommendResponseHeader, C50174a> {

        /* renamed from: a */
        public String f125372a;

        /* renamed from: a */
        public UniversalRecommendResponseHeader build() {
            return new UniversalRecommendResponseHeader(this.f125372a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50174a newBuilder() {
        C50174a aVar = new C50174a();
        aVar.f125372a = this.msession_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.msession_id != null) {
            sb.append(", session_id=");
            sb.append(this.msession_id);
        }
        StringBuilder replace = sb.replace(0, 2, "UniversalRecommendResponseHeader{");
        replace.append('}');
        return replace.toString();
    }

    public UniversalRecommendResponseHeader(String str) {
        this(str, ByteString.EMPTY);
    }

    public UniversalRecommendResponseHeader(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.msession_id = str;
    }
}
