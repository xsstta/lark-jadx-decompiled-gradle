package com.ss.android.lark.pb.videoconference.v1;

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

public final class GetViewI18nTemplateRequest extends Message<GetViewI18nTemplateRequest, C50725a> {
    public static final ProtoAdapter<GetViewI18nTemplateRequest> ADAPTER = new C50726b();
    private static final long serialVersionUID = 0;
    public final List<String> keys;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetViewI18nTemplateRequest$b */
    private static final class C50726b extends ProtoAdapter<GetViewI18nTemplateRequest> {
        C50726b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetViewI18nTemplateRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetViewI18nTemplateRequest getViewI18nTemplateRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getViewI18nTemplateRequest.keys) + getViewI18nTemplateRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetViewI18nTemplateRequest decode(ProtoReader protoReader) throws IOException {
            C50725a aVar = new C50725a();
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
                    aVar.f126470a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetViewI18nTemplateRequest getViewI18nTemplateRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getViewI18nTemplateRequest.keys);
            protoWriter.writeBytes(getViewI18nTemplateRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetViewI18nTemplateRequest$a */
    public static final class C50725a extends Message.Builder<GetViewI18nTemplateRequest, C50725a> {

        /* renamed from: a */
        public List<String> f126470a = Internal.newMutableList();

        /* renamed from: a */
        public GetViewI18nTemplateRequest build() {
            return new GetViewI18nTemplateRequest(this.f126470a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50725a mo175438a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f126470a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50725a newBuilder() {
        C50725a aVar = new C50725a();
        aVar.f126470a = Internal.copyOf("keys", this.keys);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetViewI18nTemplateRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.keys.isEmpty()) {
            sb.append(", keys=");
            sb.append(this.keys);
        }
        StringBuilder replace = sb.replace(0, 2, "GetViewI18nTemplateRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetViewI18nTemplateRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public GetViewI18nTemplateRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.keys = Internal.immutableCopyOf("keys", list);
    }
}
