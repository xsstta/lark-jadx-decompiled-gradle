package com.bytedance.lark.pb.im.v1;

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

public final class DeleteStickerSetsRequest extends Message<DeleteStickerSetsRequest, C17426a> {
    public static final ProtoAdapter<DeleteStickerSetsRequest> ADAPTER = new C17427b();
    private static final long serialVersionUID = 0;
    public final List<String> sticker_set_ids;

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteStickerSetsRequest$b */
    private static final class C17427b extends ProtoAdapter<DeleteStickerSetsRequest> {
        C17427b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteStickerSetsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteStickerSetsRequest deleteStickerSetsRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, deleteStickerSetsRequest.sticker_set_ids) + deleteStickerSetsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteStickerSetsRequest decode(ProtoReader protoReader) throws IOException {
            C17426a aVar = new C17426a();
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
                    aVar.f44326a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteStickerSetsRequest deleteStickerSetsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, deleteStickerSetsRequest.sticker_set_ids);
            protoWriter.writeBytes(deleteStickerSetsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteStickerSetsRequest$a */
    public static final class C17426a extends Message.Builder<DeleteStickerSetsRequest, C17426a> {

        /* renamed from: a */
        public List<String> f44326a = Internal.newMutableList();

        /* renamed from: a */
        public DeleteStickerSetsRequest build() {
            return new DeleteStickerSetsRequest(this.f44326a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17426a mo61129a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44326a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17426a newBuilder() {
        C17426a aVar = new C17426a();
        aVar.f44326a = Internal.copyOf("sticker_set_ids", this.sticker_set_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "DeleteStickerSetsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.sticker_set_ids.isEmpty()) {
            sb.append(", sticker_set_ids=");
            sb.append(this.sticker_set_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteStickerSetsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteStickerSetsRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public DeleteStickerSetsRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sticker_set_ids = Internal.immutableCopyOf("sticker_set_ids", list);
    }
}
