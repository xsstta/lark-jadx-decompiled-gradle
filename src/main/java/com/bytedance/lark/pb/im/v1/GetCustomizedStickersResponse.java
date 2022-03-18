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

public final class GetCustomizedStickersResponse extends Message<GetCustomizedStickersResponse, C17564a> {
    public static final ProtoAdapter<GetCustomizedStickersResponse> ADAPTER = new C17565b();
    private static final long serialVersionUID = 0;
    public final List<Sticker> stickers;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetCustomizedStickersResponse$b */
    private static final class C17565b extends ProtoAdapter<GetCustomizedStickersResponse> {
        C17565b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCustomizedStickersResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCustomizedStickersResponse getCustomizedStickersResponse) {
            return Sticker.ADAPTER.asRepeated().encodedSizeWithTag(1, getCustomizedStickersResponse.stickers) + getCustomizedStickersResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetCustomizedStickersResponse decode(ProtoReader protoReader) throws IOException {
            C17564a aVar = new C17564a();
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
                    aVar.f44525a.add(Sticker.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCustomizedStickersResponse getCustomizedStickersResponse) throws IOException {
            Sticker.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getCustomizedStickersResponse.stickers);
            protoWriter.writeBytes(getCustomizedStickersResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetCustomizedStickersResponse$a */
    public static final class C17564a extends Message.Builder<GetCustomizedStickersResponse, C17564a> {

        /* renamed from: a */
        public List<Sticker> f44525a = Internal.newMutableList();

        /* renamed from: a */
        public GetCustomizedStickersResponse build() {
            return new GetCustomizedStickersResponse(this.f44525a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17564a newBuilder() {
        C17564a aVar = new C17564a();
        aVar.f44525a = Internal.copyOf("stickers", this.stickers);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetCustomizedStickersResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.stickers.isEmpty()) {
            sb.append(", stickers=");
            sb.append(this.stickers);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCustomizedStickersResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetCustomizedStickersResponse(List<Sticker> list) {
        this(list, ByteString.EMPTY);
    }

    public GetCustomizedStickersResponse(List<Sticker> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.stickers = Internal.immutableCopyOf("stickers", list);
    }
}
