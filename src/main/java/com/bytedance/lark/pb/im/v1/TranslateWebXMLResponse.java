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

public final class TranslateWebXMLResponse extends Message<TranslateWebXMLResponse, C18111a> {
    public static final ProtoAdapter<TranslateWebXMLResponse> ADAPTER = new C18112b();
    private static final long serialVersionUID = 0;
    public final List<String> trg_contents;

    /* renamed from: com.bytedance.lark.pb.im.v1.TranslateWebXMLResponse$b */
    private static final class C18112b extends ProtoAdapter<TranslateWebXMLResponse> {
        C18112b() {
            super(FieldEncoding.LENGTH_DELIMITED, TranslateWebXMLResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(TranslateWebXMLResponse translateWebXMLResponse) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, translateWebXMLResponse.trg_contents) + translateWebXMLResponse.unknownFields().size();
        }

        /* renamed from: a */
        public TranslateWebXMLResponse decode(ProtoReader protoReader) throws IOException {
            C18111a aVar = new C18111a();
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
                    aVar.f45263a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TranslateWebXMLResponse translateWebXMLResponse) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, translateWebXMLResponse.trg_contents);
            protoWriter.writeBytes(translateWebXMLResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.TranslateWebXMLResponse$a */
    public static final class C18111a extends Message.Builder<TranslateWebXMLResponse, C18111a> {

        /* renamed from: a */
        public List<String> f45263a = Internal.newMutableList();

        /* renamed from: a */
        public TranslateWebXMLResponse build() {
            return new TranslateWebXMLResponse(this.f45263a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18111a newBuilder() {
        C18111a aVar = new C18111a();
        aVar.f45263a = Internal.copyOf("trg_contents", this.trg_contents);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "TranslateWebXMLResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.trg_contents.isEmpty()) {
            sb.append(", trg_contents=");
            sb.append(this.trg_contents);
        }
        StringBuilder replace = sb.replace(0, 2, "TranslateWebXMLResponse{");
        replace.append('}');
        return replace.toString();
    }

    public TranslateWebXMLResponse(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public TranslateWebXMLResponse(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.trg_contents = Internal.immutableCopyOf("trg_contents", list);
    }
}
