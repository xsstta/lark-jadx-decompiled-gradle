package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SendShareStickerSetResponse extends Message<SendShareStickerSetResponse, C18029a> {
    public static final ProtoAdapter<SendShareStickerSetResponse> ADAPTER = new C18030b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.im.v1.SendShareStickerSetResponse$b */
    private static final class C18030b extends ProtoAdapter<SendShareStickerSetResponse> {
        C18030b() {
            super(FieldEncoding.LENGTH_DELIMITED, SendShareStickerSetResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SendShareStickerSetResponse sendShareStickerSetResponse) {
            return sendShareStickerSetResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SendShareStickerSetResponse decode(ProtoReader protoReader) throws IOException {
            C18029a aVar = new C18029a();
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
        public void encode(ProtoWriter protoWriter, SendShareStickerSetResponse sendShareStickerSetResponse) throws IOException {
            protoWriter.writeBytes(sendShareStickerSetResponse.unknownFields());
        }
    }

    public SendShareStickerSetResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.SendShareStickerSetResponse$a */
    public static final class C18029a extends Message.Builder<SendShareStickerSetResponse, C18029a> {
        /* renamed from: a */
        public SendShareStickerSetResponse build() {
            return new SendShareStickerSetResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18029a newBuilder() {
        C18029a aVar = new C18029a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "SendShareStickerSetResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SendShareStickerSetResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SendShareStickerSetResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
