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

public final class DetectTextsLanguageRequest extends Message<DetectTextsLanguageRequest, C17442a> {
    public static final ProtoAdapter<DetectTextsLanguageRequest> ADAPTER = new C17443b();
    private static final long serialVersionUID = 0;
    public final List<String> text_list;

    /* renamed from: com.bytedance.lark.pb.im.v1.DetectTextsLanguageRequest$b */
    private static final class C17443b extends ProtoAdapter<DetectTextsLanguageRequest> {
        C17443b() {
            super(FieldEncoding.LENGTH_DELIMITED, DetectTextsLanguageRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DetectTextsLanguageRequest detectTextsLanguageRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, detectTextsLanguageRequest.text_list) + detectTextsLanguageRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DetectTextsLanguageRequest decode(ProtoReader protoReader) throws IOException {
            C17442a aVar = new C17442a();
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
                    aVar.f44335a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DetectTextsLanguageRequest detectTextsLanguageRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, detectTextsLanguageRequest.text_list);
            protoWriter.writeBytes(detectTextsLanguageRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.DetectTextsLanguageRequest$a */
    public static final class C17442a extends Message.Builder<DetectTextsLanguageRequest, C17442a> {

        /* renamed from: a */
        public List<String> f44335a = Internal.newMutableList();

        /* renamed from: a */
        public DetectTextsLanguageRequest build() {
            return new DetectTextsLanguageRequest(this.f44335a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17442a mo61166a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44335a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17442a newBuilder() {
        C17442a aVar = new C17442a();
        aVar.f44335a = Internal.copyOf("text_list", this.text_list);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "DetectTextsLanguageRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.text_list.isEmpty()) {
            sb.append(", text_list=");
            sb.append(this.text_list);
        }
        StringBuilder replace = sb.replace(0, 2, "DetectTextsLanguageRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DetectTextsLanguageRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public DetectTextsLanguageRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.text_list = Internal.immutableCopyOf("text_list", list);
    }
}
