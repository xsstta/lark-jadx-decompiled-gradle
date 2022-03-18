package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetWebNotTranslateLanguagesRequest extends Message<GetWebNotTranslateLanguagesRequest, C17771a> {
    public static final ProtoAdapter<GetWebNotTranslateLanguagesRequest> ADAPTER = new C17772b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetWebNotTranslateLanguagesRequest$b */
    private static final class C17772b extends ProtoAdapter<GetWebNotTranslateLanguagesRequest> {
        C17772b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetWebNotTranslateLanguagesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetWebNotTranslateLanguagesRequest getWebNotTranslateLanguagesRequest) {
            return getWebNotTranslateLanguagesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetWebNotTranslateLanguagesRequest decode(ProtoReader protoReader) throws IOException {
            C17771a aVar = new C17771a();
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
        public void encode(ProtoWriter protoWriter, GetWebNotTranslateLanguagesRequest getWebNotTranslateLanguagesRequest) throws IOException {
            protoWriter.writeBytes(getWebNotTranslateLanguagesRequest.unknownFields());
        }
    }

    public GetWebNotTranslateLanguagesRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetWebNotTranslateLanguagesRequest$a */
    public static final class C17771a extends Message.Builder<GetWebNotTranslateLanguagesRequest, C17771a> {
        /* renamed from: a */
        public GetWebNotTranslateLanguagesRequest build() {
            return new GetWebNotTranslateLanguagesRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17771a newBuilder() {
        C17771a aVar = new C17771a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetWebNotTranslateLanguagesRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetWebNotTranslateLanguagesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetWebNotTranslateLanguagesRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
