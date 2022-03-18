package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.TranslateInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetMessageTranslateInfosResponse extends Message<GetMessageTranslateInfosResponse, C17635a> {
    public static final ProtoAdapter<GetMessageTranslateInfosResponse> ADAPTER = new C17636b();
    private static final long serialVersionUID = 0;
    public final List<TranslateInfo> message_translate_infos;
    public final TranslateInfo origin_message;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMessageTranslateInfosResponse$b */
    private static final class C17636b extends ProtoAdapter<GetMessageTranslateInfosResponse> {
        C17636b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMessageTranslateInfosResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMessageTranslateInfosResponse getMessageTranslateInfosResponse) {
            int i;
            int encodedSizeWithTag = TranslateInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, getMessageTranslateInfosResponse.message_translate_infos);
            if (getMessageTranslateInfosResponse.origin_message != null) {
                i = TranslateInfo.ADAPTER.encodedSizeWithTag(2, getMessageTranslateInfosResponse.origin_message);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getMessageTranslateInfosResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetMessageTranslateInfosResponse decode(ProtoReader protoReader) throws IOException {
            C17635a aVar = new C17635a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44644a.add(TranslateInfo.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44645b = TranslateInfo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMessageTranslateInfosResponse getMessageTranslateInfosResponse) throws IOException {
            TranslateInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getMessageTranslateInfosResponse.message_translate_infos);
            if (getMessageTranslateInfosResponse.origin_message != null) {
                TranslateInfo.ADAPTER.encodeWithTag(protoWriter, 2, getMessageTranslateInfosResponse.origin_message);
            }
            protoWriter.writeBytes(getMessageTranslateInfosResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMessageTranslateInfosResponse$a */
    public static final class C17635a extends Message.Builder<GetMessageTranslateInfosResponse, C17635a> {

        /* renamed from: a */
        public List<TranslateInfo> f44644a = Internal.newMutableList();

        /* renamed from: b */
        public TranslateInfo f44645b;

        /* renamed from: a */
        public GetMessageTranslateInfosResponse build() {
            return new GetMessageTranslateInfosResponse(this.f44644a, this.f44645b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17635a newBuilder() {
        C17635a aVar = new C17635a();
        aVar.f44644a = Internal.copyOf("message_translate_infos", this.message_translate_infos);
        aVar.f44645b = this.origin_message;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetMessageTranslateInfosResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.message_translate_infos.isEmpty()) {
            sb.append(", message_translate_infos=");
            sb.append(this.message_translate_infos);
        }
        if (this.origin_message != null) {
            sb.append(", origin_message=");
            sb.append(this.origin_message);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMessageTranslateInfosResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetMessageTranslateInfosResponse(List<TranslateInfo> list, TranslateInfo translateInfo) {
        this(list, translateInfo, ByteString.EMPTY);
    }

    public GetMessageTranslateInfosResponse(List<TranslateInfo> list, TranslateInfo translateInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_translate_infos = Internal.immutableCopyOf("message_translate_infos", list);
        this.origin_message = translateInfo;
    }
}
