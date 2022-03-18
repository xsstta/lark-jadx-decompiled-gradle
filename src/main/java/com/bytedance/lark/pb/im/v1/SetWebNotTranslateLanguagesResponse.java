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

public final class SetWebNotTranslateLanguagesResponse extends Message<SetWebNotTranslateLanguagesResponse, C18051a> {
    public static final ProtoAdapter<SetWebNotTranslateLanguagesResponse> ADAPTER = new C18052b();
    private static final long serialVersionUID = 0;
    public final List<String> not_translate_languages;

    /* renamed from: com.bytedance.lark.pb.im.v1.SetWebNotTranslateLanguagesResponse$b */
    private static final class C18052b extends ProtoAdapter<SetWebNotTranslateLanguagesResponse> {
        C18052b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetWebNotTranslateLanguagesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetWebNotTranslateLanguagesResponse setWebNotTranslateLanguagesResponse) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, setWebNotTranslateLanguagesResponse.not_translate_languages) + setWebNotTranslateLanguagesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetWebNotTranslateLanguagesResponse decode(ProtoReader protoReader) throws IOException {
            C18051a aVar = new C18051a();
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
                    aVar.f45166a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetWebNotTranslateLanguagesResponse setWebNotTranslateLanguagesResponse) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, setWebNotTranslateLanguagesResponse.not_translate_languages);
            protoWriter.writeBytes(setWebNotTranslateLanguagesResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.SetWebNotTranslateLanguagesResponse$a */
    public static final class C18051a extends Message.Builder<SetWebNotTranslateLanguagesResponse, C18051a> {

        /* renamed from: a */
        public List<String> f45166a = Internal.newMutableList();

        /* renamed from: a */
        public SetWebNotTranslateLanguagesResponse build() {
            return new SetWebNotTranslateLanguagesResponse(this.f45166a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18051a newBuilder() {
        C18051a aVar = new C18051a();
        aVar.f45166a = Internal.copyOf("not_translate_languages", this.not_translate_languages);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "SetWebNotTranslateLanguagesResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.not_translate_languages.isEmpty()) {
            sb.append(", not_translate_languages=");
            sb.append(this.not_translate_languages);
        }
        StringBuilder replace = sb.replace(0, 2, "SetWebNotTranslateLanguagesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetWebNotTranslateLanguagesResponse(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public SetWebNotTranslateLanguagesResponse(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.not_translate_languages = Internal.immutableCopyOf("not_translate_languages", list);
    }
}
