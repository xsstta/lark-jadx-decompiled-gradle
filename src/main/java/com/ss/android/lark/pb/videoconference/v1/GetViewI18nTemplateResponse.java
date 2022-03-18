package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class GetViewI18nTemplateResponse extends Message<GetViewI18nTemplateResponse, C50727a> {
    public static final ProtoAdapter<GetViewI18nTemplateResponse> ADAPTER = new C50728b();
    private static final long serialVersionUID = 0;
    public final Map<String, String> templates;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetViewI18nTemplateResponse$a */
    public static final class C50727a extends Message.Builder<GetViewI18nTemplateResponse, C50727a> {

        /* renamed from: a */
        public Map<String, String> f126471a = Internal.newMutableMap();

        /* renamed from: a */
        public GetViewI18nTemplateResponse build() {
            return new GetViewI18nTemplateResponse(this.f126471a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetViewI18nTemplateResponse$b */
    private static final class C50728b extends ProtoAdapter<GetViewI18nTemplateResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f126472a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C50728b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetViewI18nTemplateResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetViewI18nTemplateResponse getViewI18nTemplateResponse) {
            return this.f126472a.encodedSizeWithTag(1, getViewI18nTemplateResponse.templates) + getViewI18nTemplateResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetViewI18nTemplateResponse decode(ProtoReader protoReader) throws IOException {
            C50727a aVar = new C50727a();
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
                    aVar.f126471a.putAll(this.f126472a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetViewI18nTemplateResponse getViewI18nTemplateResponse) throws IOException {
            this.f126472a.encodeWithTag(protoWriter, 1, getViewI18nTemplateResponse.templates);
            protoWriter.writeBytes(getViewI18nTemplateResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50727a newBuilder() {
        C50727a aVar = new C50727a();
        aVar.f126471a = Internal.copyOf("templates", this.templates);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetViewI18nTemplateResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.templates.isEmpty()) {
            sb.append(", templates=");
            sb.append(this.templates);
        }
        StringBuilder replace = sb.replace(0, 2, "GetViewI18nTemplateResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetViewI18nTemplateResponse(Map<String, String> map) {
        this(map, ByteString.EMPTY);
    }

    public GetViewI18nTemplateResponse(Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.templates = Internal.immutableCopyOf("templates", map);
    }
}
