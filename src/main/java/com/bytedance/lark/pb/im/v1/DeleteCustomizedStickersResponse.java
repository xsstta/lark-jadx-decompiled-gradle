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

public final class DeleteCustomizedStickersResponse extends Message<DeleteCustomizedStickersResponse, C17406a> {
    public static final ProtoAdapter<DeleteCustomizedStickersResponse> ADAPTER = new C17407b();
    private static final long serialVersionUID = 0;
    public final List<Sticker> stickers;

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteCustomizedStickersResponse$b */
    private static final class C17407b extends ProtoAdapter<DeleteCustomizedStickersResponse> {
        C17407b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteCustomizedStickersResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteCustomizedStickersResponse deleteCustomizedStickersResponse) {
            return Sticker.ADAPTER.asRepeated().encodedSizeWithTag(1, deleteCustomizedStickersResponse.stickers) + deleteCustomizedStickersResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteCustomizedStickersResponse decode(ProtoReader protoReader) throws IOException {
            C17406a aVar = new C17406a();
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
                    aVar.f44315a.add(Sticker.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteCustomizedStickersResponse deleteCustomizedStickersResponse) throws IOException {
            Sticker.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, deleteCustomizedStickersResponse.stickers);
            protoWriter.writeBytes(deleteCustomizedStickersResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteCustomizedStickersResponse$a */
    public static final class C17406a extends Message.Builder<DeleteCustomizedStickersResponse, C17406a> {

        /* renamed from: a */
        public List<Sticker> f44315a = Internal.newMutableList();

        /* renamed from: a */
        public DeleteCustomizedStickersResponse build() {
            return new DeleteCustomizedStickersResponse(this.f44315a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17406a newBuilder() {
        C17406a aVar = new C17406a();
        aVar.f44315a = Internal.copyOf("stickers", this.stickers);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "DeleteCustomizedStickersResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.stickers.isEmpty()) {
            sb.append(", stickers=");
            sb.append(this.stickers);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteCustomizedStickersResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteCustomizedStickersResponse(List<Sticker> list) {
        this(list, ByteString.EMPTY);
    }

    public DeleteCustomizedStickersResponse(List<Sticker> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.stickers = Internal.immutableCopyOf("stickers", list);
    }
}
