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

public final class SetTranslateLanguageRequest extends Message<SetTranslateLanguageRequest, C18045a> {
    public static final ProtoAdapter<SetTranslateLanguageRequest> ADAPTER = new C18046b();
    private static final long serialVersionUID = 0;
    public final String language;

    /* renamed from: com.bytedance.lark.pb.im.v1.SetTranslateLanguageRequest$b */
    private static final class C18046b extends ProtoAdapter<SetTranslateLanguageRequest> {
        C18046b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetTranslateLanguageRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetTranslateLanguageRequest setTranslateLanguageRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, setTranslateLanguageRequest.language) + setTranslateLanguageRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetTranslateLanguageRequest decode(ProtoReader protoReader) throws IOException {
            C18045a aVar = new C18045a();
            aVar.f45164a = "";
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
                    aVar.f45164a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetTranslateLanguageRequest setTranslateLanguageRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setTranslateLanguageRequest.language);
            protoWriter.writeBytes(setTranslateLanguageRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.SetTranslateLanguageRequest$a */
    public static final class C18045a extends Message.Builder<SetTranslateLanguageRequest, C18045a> {

        /* renamed from: a */
        public String f45164a;

        /* renamed from: a */
        public SetTranslateLanguageRequest build() {
            String str = this.f45164a;
            if (str != null) {
                return new SetTranslateLanguageRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "language");
        }

        /* renamed from: a */
        public C18045a mo62663a(String str) {
            this.f45164a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18045a newBuilder() {
        C18045a aVar = new C18045a();
        aVar.f45164a = this.language;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "SetTranslateLanguageRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", language=");
        sb.append(this.language);
        StringBuilder replace = sb.replace(0, 2, "SetTranslateLanguageRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetTranslateLanguageRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public SetTranslateLanguageRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.language = str;
    }
}
