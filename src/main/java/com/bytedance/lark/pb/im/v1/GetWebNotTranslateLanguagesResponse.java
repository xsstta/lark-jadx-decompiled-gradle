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

public final class GetWebNotTranslateLanguagesResponse extends Message<GetWebNotTranslateLanguagesResponse, C17773a> {
    public static final ProtoAdapter<GetWebNotTranslateLanguagesResponse> ADAPTER = new C17774b();
    private static final long serialVersionUID = 0;
    public final List<String> not_translate_languages;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetWebNotTranslateLanguagesResponse$b */
    private static final class C17774b extends ProtoAdapter<GetWebNotTranslateLanguagesResponse> {
        C17774b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetWebNotTranslateLanguagesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetWebNotTranslateLanguagesResponse getWebNotTranslateLanguagesResponse) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getWebNotTranslateLanguagesResponse.not_translate_languages) + getWebNotTranslateLanguagesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetWebNotTranslateLanguagesResponse decode(ProtoReader protoReader) throws IOException {
            C17773a aVar = new C17773a();
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
                    aVar.f44814a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetWebNotTranslateLanguagesResponse getWebNotTranslateLanguagesResponse) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getWebNotTranslateLanguagesResponse.not_translate_languages);
            protoWriter.writeBytes(getWebNotTranslateLanguagesResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetWebNotTranslateLanguagesResponse$a */
    public static final class C17773a extends Message.Builder<GetWebNotTranslateLanguagesResponse, C17773a> {

        /* renamed from: a */
        public List<String> f44814a = Internal.newMutableList();

        /* renamed from: a */
        public GetWebNotTranslateLanguagesResponse build() {
            return new GetWebNotTranslateLanguagesResponse(this.f44814a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17773a newBuilder() {
        C17773a aVar = new C17773a();
        aVar.f44814a = Internal.copyOf("not_translate_languages", this.not_translate_languages);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetWebNotTranslateLanguagesResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.not_translate_languages.isEmpty()) {
            sb.append(", not_translate_languages=");
            sb.append(this.not_translate_languages);
        }
        StringBuilder replace = sb.replace(0, 2, "GetWebNotTranslateLanguagesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetWebNotTranslateLanguagesResponse(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public GetWebNotTranslateLanguagesResponse(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.not_translate_languages = Internal.immutableCopyOf("not_translate_languages", list);
    }
}
