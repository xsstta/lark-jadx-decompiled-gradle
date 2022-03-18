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

public final class CreateCustomizedStickersResponse extends Message<CreateCustomizedStickersResponse, C17346a> {
    public static final ProtoAdapter<CreateCustomizedStickersResponse> ADAPTER = new C17347b();
    private static final long serialVersionUID = 0;
    public final List<DuplicateSticker> dup_stickers;
    public final List<String> failed_paths;

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateCustomizedStickersResponse$b */
    private static final class C17347b extends ProtoAdapter<CreateCustomizedStickersResponse> {
        C17347b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateCustomizedStickersResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateCustomizedStickersResponse createCustomizedStickersResponse) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, createCustomizedStickersResponse.failed_paths) + DuplicateSticker.ADAPTER.asRepeated().encodedSizeWithTag(2, createCustomizedStickersResponse.dup_stickers) + createCustomizedStickersResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CreateCustomizedStickersResponse decode(ProtoReader protoReader) throws IOException {
            C17346a aVar = new C17346a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44223a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44224b.add(DuplicateSticker.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateCustomizedStickersResponse createCustomizedStickersResponse) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, createCustomizedStickersResponse.failed_paths);
            DuplicateSticker.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, createCustomizedStickersResponse.dup_stickers);
            protoWriter.writeBytes(createCustomizedStickersResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateCustomizedStickersResponse$a */
    public static final class C17346a extends Message.Builder<CreateCustomizedStickersResponse, C17346a> {

        /* renamed from: a */
        public List<String> f44223a = Internal.newMutableList();

        /* renamed from: b */
        public List<DuplicateSticker> f44224b = Internal.newMutableList();

        /* renamed from: a */
        public CreateCustomizedStickersResponse build() {
            return new CreateCustomizedStickersResponse(this.f44223a, this.f44224b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17346a newBuilder() {
        C17346a aVar = new C17346a();
        aVar.f44223a = Internal.copyOf("failed_paths", this.failed_paths);
        aVar.f44224b = Internal.copyOf("dup_stickers", this.dup_stickers);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CreateCustomizedStickersResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.failed_paths.isEmpty()) {
            sb.append(", failed_paths=");
            sb.append(this.failed_paths);
        }
        if (!this.dup_stickers.isEmpty()) {
            sb.append(", dup_stickers=");
            sb.append(this.dup_stickers);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateCustomizedStickersResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CreateCustomizedStickersResponse(List<String> list, List<DuplicateSticker> list2) {
        this(list, list2, ByteString.EMPTY);
    }

    public CreateCustomizedStickersResponse(List<String> list, List<DuplicateSticker> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.failed_paths = Internal.immutableCopyOf("failed_paths", list);
        this.dup_stickers = Internal.immutableCopyOf("dup_stickers", list2);
    }
}
