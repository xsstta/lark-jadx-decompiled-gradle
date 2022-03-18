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

public final class PutDisableAutoTranslateLanguagesRequest extends Message<PutDisableAutoTranslateLanguagesRequest, C17973a> {
    public static final ProtoAdapter<PutDisableAutoTranslateLanguagesRequest> ADAPTER = new C17974b();
    private static final long serialVersionUID = 0;
    public final List<String> language_keys;

    /* renamed from: com.bytedance.lark.pb.im.v1.PutDisableAutoTranslateLanguagesRequest$b */
    private static final class C17974b extends ProtoAdapter<PutDisableAutoTranslateLanguagesRequest> {
        C17974b() {
            super(FieldEncoding.LENGTH_DELIMITED, PutDisableAutoTranslateLanguagesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PutDisableAutoTranslateLanguagesRequest putDisableAutoTranslateLanguagesRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, putDisableAutoTranslateLanguagesRequest.language_keys) + putDisableAutoTranslateLanguagesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PutDisableAutoTranslateLanguagesRequest decode(ProtoReader protoReader) throws IOException {
            C17973a aVar = new C17973a();
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
                    aVar.f45071a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PutDisableAutoTranslateLanguagesRequest putDisableAutoTranslateLanguagesRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, putDisableAutoTranslateLanguagesRequest.language_keys);
            protoWriter.writeBytes(putDisableAutoTranslateLanguagesRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PutDisableAutoTranslateLanguagesRequest$a */
    public static final class C17973a extends Message.Builder<PutDisableAutoTranslateLanguagesRequest, C17973a> {

        /* renamed from: a */
        public List<String> f45071a = Internal.newMutableList();

        /* renamed from: a */
        public PutDisableAutoTranslateLanguagesRequest build() {
            return new PutDisableAutoTranslateLanguagesRequest(this.f45071a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17973a mo62466a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f45071a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17973a newBuilder() {
        C17973a aVar = new C17973a();
        aVar.f45071a = Internal.copyOf("language_keys", this.language_keys);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PutDisableAutoTranslateLanguagesRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.language_keys.isEmpty()) {
            sb.append(", language_keys=");
            sb.append(this.language_keys);
        }
        StringBuilder replace = sb.replace(0, 2, "PutDisableAutoTranslateLanguagesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PutDisableAutoTranslateLanguagesRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public PutDisableAutoTranslateLanguagesRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.language_keys = Internal.immutableCopyOf("language_keys", list);
    }
}
