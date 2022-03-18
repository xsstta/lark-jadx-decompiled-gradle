package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ShareAppCardResponse extends Message<ShareAppCardResponse, C18057a> {
    public static final ProtoAdapter<ShareAppCardResponse> ADAPTER = new C18058b();
    private static final long serialVersionUID = 0;
    public final String cid;
    public final C14928Entity entity;

    /* renamed from: com.bytedance.lark.pb.im.v1.ShareAppCardResponse$b */
    private static final class C18058b extends ProtoAdapter<ShareAppCardResponse> {
        C18058b() {
            super(FieldEncoding.LENGTH_DELIMITED, ShareAppCardResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ShareAppCardResponse shareAppCardResponse) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, shareAppCardResponse.cid) + C14928Entity.ADAPTER.encodedSizeWithTag(2, shareAppCardResponse.entity) + shareAppCardResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ShareAppCardResponse decode(ProtoReader protoReader) throws IOException {
            C18057a aVar = new C18057a();
            aVar.f45179a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45179a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45180b = C14928Entity.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ShareAppCardResponse shareAppCardResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, shareAppCardResponse.cid);
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 2, shareAppCardResponse.entity);
            protoWriter.writeBytes(shareAppCardResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18057a newBuilder() {
        C18057a aVar = new C18057a();
        aVar.f45179a = this.cid;
        aVar.f45180b = this.entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.ShareAppCardResponse$a */
    public static final class C18057a extends Message.Builder<ShareAppCardResponse, C18057a> {

        /* renamed from: a */
        public String f45179a;

        /* renamed from: b */
        public C14928Entity f45180b;

        /* renamed from: a */
        public ShareAppCardResponse build() {
            C14928Entity entity;
            String str = this.f45179a;
            if (str != null && (entity = this.f45180b) != null) {
                return new ShareAppCardResponse(str, entity, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "cid", this.f45180b, "entity");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "ShareAppCardResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", cid=");
        sb.append(this.cid);
        sb.append(", entity=");
        sb.append(this.entity);
        StringBuilder replace = sb.replace(0, 2, "ShareAppCardResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ShareAppCardResponse(String str, C14928Entity entity2) {
        this(str, entity2, ByteString.EMPTY);
    }

    public ShareAppCardResponse(String str, C14928Entity entity2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cid = str;
        this.entity = entity2;
    }
}
