package com.bytedance.lark.pb.im.v1;

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

public final class DetectTextsLanguageResponse extends Message<DetectTextsLanguageResponse, C17444a> {
    public static final ProtoAdapter<DetectTextsLanguageResponse> ADAPTER = new C17445b();
    private static final long serialVersionUID = 0;
    public final List<String> language;

    /* renamed from: com.bytedance.lark.pb.im.v1.DetectTextsLanguageResponse$b */
    private static final class C17445b extends ProtoAdapter<DetectTextsLanguageResponse> {
        C17445b() {
            super(FieldEncoding.LENGTH_DELIMITED, DetectTextsLanguageResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DetectTextsLanguageResponse detectTextsLanguageResponse) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, detectTextsLanguageResponse.language) + detectTextsLanguageResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DetectTextsLanguageResponse decode(ProtoReader protoReader) throws IOException {
            C17444a aVar = new C17444a();
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
                    aVar.f44336a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DetectTextsLanguageResponse detectTextsLanguageResponse) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, detectTextsLanguageResponse.language);
            protoWriter.writeBytes(detectTextsLanguageResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.DetectTextsLanguageResponse$a */
    public static final class C17444a extends Message.Builder<DetectTextsLanguageResponse, C17444a> {

        /* renamed from: a */
        public List<String> f44336a = Internal.newMutableList();

        /* renamed from: a */
        public DetectTextsLanguageResponse build() {
            return new DetectTextsLanguageResponse(this.f44336a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17444a newBuilder() {
        C17444a aVar = new C17444a();
        aVar.f44336a = Internal.copyOf("language", this.language);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "DetectTextsLanguageResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.language.isEmpty()) {
            sb.append(", language=");
            sb.append(this.language);
        }
        StringBuilder replace = sb.replace(0, 2, "DetectTextsLanguageResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DetectTextsLanguageResponse(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public DetectTextsLanguageResponse(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.language = Internal.immutableCopyOf("language", list);
    }
}
