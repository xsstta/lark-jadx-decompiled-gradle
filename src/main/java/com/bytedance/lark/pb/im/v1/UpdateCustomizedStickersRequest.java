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

public final class UpdateCustomizedStickersRequest extends Message<UpdateCustomizedStickersRequest, C18149a> {
    public static final ProtoAdapter<UpdateCustomizedStickersRequest> ADAPTER = new C18150b();
    private static final long serialVersionUID = 0;
    public final List<Sticker> stickers;

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateCustomizedStickersRequest$b */
    private static final class C18150b extends ProtoAdapter<UpdateCustomizedStickersRequest> {
        C18150b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateCustomizedStickersRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateCustomizedStickersRequest updateCustomizedStickersRequest) {
            return Sticker.ADAPTER.asRepeated().encodedSizeWithTag(1, updateCustomizedStickersRequest.stickers) + updateCustomizedStickersRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateCustomizedStickersRequest decode(ProtoReader protoReader) throws IOException {
            C18149a aVar = new C18149a();
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
                    aVar.f45347a.add(Sticker.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateCustomizedStickersRequest updateCustomizedStickersRequest) throws IOException {
            Sticker.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, updateCustomizedStickersRequest.stickers);
            protoWriter.writeBytes(updateCustomizedStickersRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateCustomizedStickersRequest$a */
    public static final class C18149a extends Message.Builder<UpdateCustomizedStickersRequest, C18149a> {

        /* renamed from: a */
        public List<Sticker> f45347a = Internal.newMutableList();

        /* renamed from: a */
        public UpdateCustomizedStickersRequest build() {
            return new UpdateCustomizedStickersRequest(this.f45347a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18149a mo62953a(List<Sticker> list) {
            Internal.checkElementsNotNull(list);
            this.f45347a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18149a newBuilder() {
        C18149a aVar = new C18149a();
        aVar.f45347a = Internal.copyOf("stickers", this.stickers);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "UpdateCustomizedStickersRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.stickers.isEmpty()) {
            sb.append(", stickers=");
            sb.append(this.stickers);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateCustomizedStickersRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateCustomizedStickersRequest(List<Sticker> list) {
        this(list, ByteString.EMPTY);
    }

    public UpdateCustomizedStickersRequest(List<Sticker> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.stickers = Internal.immutableCopyOf("stickers", list);
    }
}
