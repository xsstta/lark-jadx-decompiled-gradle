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

public final class SendShareStickerSetRequest extends Message<SendShareStickerSetRequest, C18027a> {
    public static final ProtoAdapter<SendShareStickerSetRequest> ADAPTER = new C18028b();
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final String sticker_set_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.SendShareStickerSetRequest$b */
    private static final class C18028b extends ProtoAdapter<SendShareStickerSetRequest> {
        C18028b() {
            super(FieldEncoding.LENGTH_DELIMITED, SendShareStickerSetRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SendShareStickerSetRequest sendShareStickerSetRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, sendShareStickerSetRequest.sticker_set_id);
            if (sendShareStickerSetRequest.chat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, sendShareStickerSetRequest.chat_id);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + sendShareStickerSetRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SendShareStickerSetRequest decode(ProtoReader protoReader) throws IOException {
            C18027a aVar = new C18027a();
            aVar.f45139a = "";
            aVar.f45140b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45139a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45140b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SendShareStickerSetRequest sendShareStickerSetRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sendShareStickerSetRequest.sticker_set_id);
            if (sendShareStickerSetRequest.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, sendShareStickerSetRequest.chat_id);
            }
            protoWriter.writeBytes(sendShareStickerSetRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.SendShareStickerSetRequest$a */
    public static final class C18027a extends Message.Builder<SendShareStickerSetRequest, C18027a> {

        /* renamed from: a */
        public String f45139a;

        /* renamed from: b */
        public String f45140b;

        /* renamed from: a */
        public SendShareStickerSetRequest build() {
            String str = this.f45139a;
            if (str != null) {
                return new SendShareStickerSetRequest(str, this.f45140b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "sticker_set_id");
        }

        /* renamed from: a */
        public C18027a mo62609a(String str) {
            this.f45139a = str;
            return this;
        }

        /* renamed from: b */
        public C18027a mo62611b(String str) {
            this.f45140b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18027a newBuilder() {
        C18027a aVar = new C18027a();
        aVar.f45139a = this.sticker_set_id;
        aVar.f45140b = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "SendShareStickerSetRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", sticker_set_id=");
        sb.append(this.sticker_set_id);
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        StringBuilder replace = sb.replace(0, 2, "SendShareStickerSetRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SendShareStickerSetRequest(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public SendShareStickerSetRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sticker_set_id = str;
        this.chat_id = str2;
    }
}
