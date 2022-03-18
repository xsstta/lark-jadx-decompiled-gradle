package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Item;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PatchItemResponse extends Message<PatchItemResponse, C17827a> {
    public static final ProtoAdapter<PatchItemResponse> ADAPTER = new C17828b();
    private static final long serialVersionUID = 0;
    public final Item item;

    /* renamed from: com.bytedance.lark.pb.im.v1.PatchItemResponse$b */
    private static final class C17828b extends ProtoAdapter<PatchItemResponse> {
        C17828b() {
            super(FieldEncoding.LENGTH_DELIMITED, PatchItemResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PatchItemResponse patchItemResponse) {
            int i;
            if (patchItemResponse.item != null) {
                i = Item.ADAPTER.encodedSizeWithTag(1, patchItemResponse.item);
            } else {
                i = 0;
            }
            return i + patchItemResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PatchItemResponse decode(ProtoReader protoReader) throws IOException {
            C17827a aVar = new C17827a();
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
                    aVar.f44887a = Item.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PatchItemResponse patchItemResponse) throws IOException {
            if (patchItemResponse.item != null) {
                Item.ADAPTER.encodeWithTag(protoWriter, 1, patchItemResponse.item);
            }
            protoWriter.writeBytes(patchItemResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PatchItemResponse$a */
    public static final class C17827a extends Message.Builder<PatchItemResponse, C17827a> {

        /* renamed from: a */
        public Item f44887a;

        /* renamed from: a */
        public PatchItemResponse build() {
            return new PatchItemResponse(this.f44887a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17827a newBuilder() {
        C17827a aVar = new C17827a();
        aVar.f44887a = this.item;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PatchItemResponse");
        StringBuilder sb = new StringBuilder();
        if (this.item != null) {
            sb.append(", item=");
            sb.append(this.item);
        }
        StringBuilder replace = sb.replace(0, 2, "PatchItemResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PatchItemResponse(Item item2) {
        this(item2, ByteString.EMPTY);
    }

    public PatchItemResponse(Item item2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.item = item2;
    }
}
