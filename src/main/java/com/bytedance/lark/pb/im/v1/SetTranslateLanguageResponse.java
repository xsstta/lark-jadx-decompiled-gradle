package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetTranslateLanguageResponse extends Message<SetTranslateLanguageResponse, C18047a> {
    public static final ProtoAdapter<SetTranslateLanguageResponse> ADAPTER = new C18048b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.im.v1.SetTranslateLanguageResponse$b */
    private static final class C18048b extends ProtoAdapter<SetTranslateLanguageResponse> {
        C18048b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetTranslateLanguageResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetTranslateLanguageResponse setTranslateLanguageResponse) {
            return setTranslateLanguageResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetTranslateLanguageResponse decode(ProtoReader protoReader) throws IOException {
            C18047a aVar = new C18047a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetTranslateLanguageResponse setTranslateLanguageResponse) throws IOException {
            protoWriter.writeBytes(setTranslateLanguageResponse.unknownFields());
        }
    }

    public SetTranslateLanguageResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.SetTranslateLanguageResponse$a */
    public static final class C18047a extends Message.Builder<SetTranslateLanguageResponse, C18047a> {
        /* renamed from: a */
        public SetTranslateLanguageResponse build() {
            return new SetTranslateLanguageResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18047a newBuilder() {
        C18047a aVar = new C18047a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "SetTranslateLanguageResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SetTranslateLanguageResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetTranslateLanguageResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
