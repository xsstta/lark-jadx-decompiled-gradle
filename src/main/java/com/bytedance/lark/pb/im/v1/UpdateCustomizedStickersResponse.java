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

public final class UpdateCustomizedStickersResponse extends Message<UpdateCustomizedStickersResponse, C18151a> {
    public static final ProtoAdapter<UpdateCustomizedStickersResponse> ADAPTER = new C18152b();
    private static final long serialVersionUID = 0;
    public final List<Sticker> stickers;

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateCustomizedStickersResponse$b */
    private static final class C18152b extends ProtoAdapter<UpdateCustomizedStickersResponse> {
        C18152b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateCustomizedStickersResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateCustomizedStickersResponse updateCustomizedStickersResponse) {
            return Sticker.ADAPTER.asRepeated().encodedSizeWithTag(1, updateCustomizedStickersResponse.stickers) + updateCustomizedStickersResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateCustomizedStickersResponse decode(ProtoReader protoReader) throws IOException {
            C18151a aVar = new C18151a();
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
                    aVar.f45348a.add(Sticker.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateCustomizedStickersResponse updateCustomizedStickersResponse) throws IOException {
            Sticker.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, updateCustomizedStickersResponse.stickers);
            protoWriter.writeBytes(updateCustomizedStickersResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateCustomizedStickersResponse$a */
    public static final class C18151a extends Message.Builder<UpdateCustomizedStickersResponse, C18151a> {

        /* renamed from: a */
        public List<Sticker> f45348a = Internal.newMutableList();

        /* renamed from: a */
        public UpdateCustomizedStickersResponse build() {
            return new UpdateCustomizedStickersResponse(this.f45348a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18151a newBuilder() {
        C18151a aVar = new C18151a();
        aVar.f45348a = Internal.copyOf("stickers", this.stickers);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "UpdateCustomizedStickersResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.stickers.isEmpty()) {
            sb.append(", stickers=");
            sb.append(this.stickers);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateCustomizedStickersResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateCustomizedStickersResponse(List<Sticker> list) {
        this(list, ByteString.EMPTY);
    }

    public UpdateCustomizedStickersResponse(List<Sticker> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.stickers = Internal.immutableCopyOf("stickers", list);
    }
}
