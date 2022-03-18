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

public final class DeleteWebNotTranslateLanguagesResponse extends Message<DeleteWebNotTranslateLanguagesResponse, C17436a> {
    public static final ProtoAdapter<DeleteWebNotTranslateLanguagesResponse> ADAPTER = new C17437b();
    private static final long serialVersionUID = 0;
    public final List<String> not_translate_languages;

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteWebNotTranslateLanguagesResponse$b */
    private static final class C17437b extends ProtoAdapter<DeleteWebNotTranslateLanguagesResponse> {
        C17437b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteWebNotTranslateLanguagesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteWebNotTranslateLanguagesResponse deleteWebNotTranslateLanguagesResponse) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, deleteWebNotTranslateLanguagesResponse.not_translate_languages) + deleteWebNotTranslateLanguagesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteWebNotTranslateLanguagesResponse decode(ProtoReader protoReader) throws IOException {
            C17436a aVar = new C17436a();
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
                    aVar.f44332a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteWebNotTranslateLanguagesResponse deleteWebNotTranslateLanguagesResponse) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, deleteWebNotTranslateLanguagesResponse.not_translate_languages);
            protoWriter.writeBytes(deleteWebNotTranslateLanguagesResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteWebNotTranslateLanguagesResponse$a */
    public static final class C17436a extends Message.Builder<DeleteWebNotTranslateLanguagesResponse, C17436a> {

        /* renamed from: a */
        public List<String> f44332a = Internal.newMutableList();

        /* renamed from: a */
        public DeleteWebNotTranslateLanguagesResponse build() {
            return new DeleteWebNotTranslateLanguagesResponse(this.f44332a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17436a newBuilder() {
        C17436a aVar = new C17436a();
        aVar.f44332a = Internal.copyOf("not_translate_languages", this.not_translate_languages);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "DeleteWebNotTranslateLanguagesResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.not_translate_languages.isEmpty()) {
            sb.append(", not_translate_languages=");
            sb.append(this.not_translate_languages);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteWebNotTranslateLanguagesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteWebNotTranslateLanguagesResponse(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public DeleteWebNotTranslateLanguagesResponse(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.not_translate_languages = Internal.immutableCopyOf("not_translate_languages", list);
    }
}
