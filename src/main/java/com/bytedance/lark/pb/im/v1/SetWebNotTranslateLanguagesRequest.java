package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SetWebNotTranslateLanguagesRequest extends Message<SetWebNotTranslateLanguagesRequest, C18049a> {
    public static final ProtoAdapter<SetWebNotTranslateLanguagesRequest> ADAPTER = new C18050b();
    private static final long serialVersionUID = 0;
    public final String not_translate_language;

    /* renamed from: com.bytedance.lark.pb.im.v1.SetWebNotTranslateLanguagesRequest$b */
    private static final class C18050b extends ProtoAdapter<SetWebNotTranslateLanguagesRequest> {
        C18050b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetWebNotTranslateLanguagesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetWebNotTranslateLanguagesRequest setWebNotTranslateLanguagesRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, setWebNotTranslateLanguagesRequest.not_translate_language) + setWebNotTranslateLanguagesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetWebNotTranslateLanguagesRequest decode(ProtoReader protoReader) throws IOException {
            C18049a aVar = new C18049a();
            aVar.f45165a = "";
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
                    aVar.f45165a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetWebNotTranslateLanguagesRequest setWebNotTranslateLanguagesRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setWebNotTranslateLanguagesRequest.not_translate_language);
            protoWriter.writeBytes(setWebNotTranslateLanguagesRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.SetWebNotTranslateLanguagesRequest$a */
    public static final class C18049a extends Message.Builder<SetWebNotTranslateLanguagesRequest, C18049a> {

        /* renamed from: a */
        public String f45165a;

        /* renamed from: a */
        public SetWebNotTranslateLanguagesRequest build() {
            String str = this.f45165a;
            if (str != null) {
                return new SetWebNotTranslateLanguagesRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "not_translate_language");
        }

        /* renamed from: a */
        public C18049a mo62672a(String str) {
            this.f45165a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18049a newBuilder() {
        C18049a aVar = new C18049a();
        aVar.f45165a = this.not_translate_language;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "SetWebNotTranslateLanguagesRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", not_translate_language=");
        sb.append(this.not_translate_language);
        StringBuilder replace = sb.replace(0, 2, "SetWebNotTranslateLanguagesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetWebNotTranslateLanguagesRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public SetWebNotTranslateLanguagesRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.not_translate_language = str;
    }
}
