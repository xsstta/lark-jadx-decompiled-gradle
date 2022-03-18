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

public final class DeleteWebNotTranslateLanguagesRequest extends Message<DeleteWebNotTranslateLanguagesRequest, C17434a> {
    public static final ProtoAdapter<DeleteWebNotTranslateLanguagesRequest> ADAPTER = new C17435b();
    private static final long serialVersionUID = 0;
    public final String not_translate_language;

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteWebNotTranslateLanguagesRequest$b */
    private static final class C17435b extends ProtoAdapter<DeleteWebNotTranslateLanguagesRequest> {
        C17435b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteWebNotTranslateLanguagesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteWebNotTranslateLanguagesRequest deleteWebNotTranslateLanguagesRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, deleteWebNotTranslateLanguagesRequest.not_translate_language) + deleteWebNotTranslateLanguagesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteWebNotTranslateLanguagesRequest decode(ProtoReader protoReader) throws IOException {
            C17434a aVar = new C17434a();
            aVar.f44331a = "";
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
                    aVar.f44331a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteWebNotTranslateLanguagesRequest deleteWebNotTranslateLanguagesRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deleteWebNotTranslateLanguagesRequest.not_translate_language);
            protoWriter.writeBytes(deleteWebNotTranslateLanguagesRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteWebNotTranslateLanguagesRequest$a */
    public static final class C17434a extends Message.Builder<DeleteWebNotTranslateLanguagesRequest, C17434a> {

        /* renamed from: a */
        public String f44331a;

        /* renamed from: a */
        public DeleteWebNotTranslateLanguagesRequest build() {
            String str = this.f44331a;
            if (str != null) {
                return new DeleteWebNotTranslateLanguagesRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "not_translate_language");
        }

        /* renamed from: a */
        public C17434a mo61148a(String str) {
            this.f44331a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17434a newBuilder() {
        C17434a aVar = new C17434a();
        aVar.f44331a = this.not_translate_language;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "DeleteWebNotTranslateLanguagesRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", not_translate_language=");
        sb.append(this.not_translate_language);
        StringBuilder replace = sb.replace(0, 2, "DeleteWebNotTranslateLanguagesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteWebNotTranslateLanguagesRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public DeleteWebNotTranslateLanguagesRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.not_translate_language = str;
    }
}
