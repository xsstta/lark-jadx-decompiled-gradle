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

public final class DeleteCustomizedStickersRequest extends Message<DeleteCustomizedStickersRequest, C17404a> {
    public static final ProtoAdapter<DeleteCustomizedStickersRequest> ADAPTER = new C17405b();
    private static final long serialVersionUID = 0;
    public final List<Sticker> stickers;

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteCustomizedStickersRequest$b */
    private static final class C17405b extends ProtoAdapter<DeleteCustomizedStickersRequest> {
        C17405b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteCustomizedStickersRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteCustomizedStickersRequest deleteCustomizedStickersRequest) {
            return Sticker.ADAPTER.asRepeated().encodedSizeWithTag(1, deleteCustomizedStickersRequest.stickers) + deleteCustomizedStickersRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteCustomizedStickersRequest decode(ProtoReader protoReader) throws IOException {
            C17404a aVar = new C17404a();
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
                    aVar.f44314a.add(Sticker.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteCustomizedStickersRequest deleteCustomizedStickersRequest) throws IOException {
            Sticker.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, deleteCustomizedStickersRequest.stickers);
            protoWriter.writeBytes(deleteCustomizedStickersRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteCustomizedStickersRequest$a */
    public static final class C17404a extends Message.Builder<DeleteCustomizedStickersRequest, C17404a> {

        /* renamed from: a */
        public List<Sticker> f44314a = Internal.newMutableList();

        /* renamed from: a */
        public DeleteCustomizedStickersRequest build() {
            return new DeleteCustomizedStickersRequest(this.f44314a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17404a mo61076a(List<Sticker> list) {
            Internal.checkElementsNotNull(list);
            this.f44314a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17404a newBuilder() {
        C17404a aVar = new C17404a();
        aVar.f44314a = Internal.copyOf("stickers", this.stickers);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "DeleteCustomizedStickersRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.stickers.isEmpty()) {
            sb.append(", stickers=");
            sb.append(this.stickers);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteCustomizedStickersRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteCustomizedStickersRequest(List<Sticker> list) {
        this(list, ByteString.EMPTY);
    }

    public DeleteCustomizedStickersRequest(List<Sticker> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.stickers = Internal.immutableCopyOf("stickers", list);
    }
}
