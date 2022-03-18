package com.bytedance.lark.pb.contact.v1;

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

public final class GetChatterStatusIconsResponse extends Message<GetChatterStatusIconsResponse, C16210a> {
    public static final ProtoAdapter<GetChatterStatusIconsResponse> ADAPTER = new C16211b();
    private static final long serialVersionUID = 0;
    public final List<ChatterStatusIcon> icons;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetChatterStatusIconsResponse$b */
    private static final class C16211b extends ProtoAdapter<GetChatterStatusIconsResponse> {
        C16211b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatterStatusIconsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatterStatusIconsResponse getChatterStatusIconsResponse) {
            return ChatterStatusIcon.ADAPTER.asRepeated().encodedSizeWithTag(1, getChatterStatusIconsResponse.icons) + getChatterStatusIconsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatterStatusIconsResponse decode(ProtoReader protoReader) throws IOException {
            C16210a aVar = new C16210a();
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
                    aVar.f42380a.add(ChatterStatusIcon.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatterStatusIconsResponse getChatterStatusIconsResponse) throws IOException {
            ChatterStatusIcon.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getChatterStatusIconsResponse.icons);
            protoWriter.writeBytes(getChatterStatusIconsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetChatterStatusIconsResponse$a */
    public static final class C16210a extends Message.Builder<GetChatterStatusIconsResponse, C16210a> {

        /* renamed from: a */
        public List<ChatterStatusIcon> f42380a = Internal.newMutableList();

        /* renamed from: a */
        public GetChatterStatusIconsResponse build() {
            return new GetChatterStatusIconsResponse(this.f42380a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16210a newBuilder() {
        C16210a aVar = new C16210a();
        aVar.f42380a = Internal.copyOf("icons", this.icons);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetChatterStatusIconsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.icons.isEmpty()) {
            sb.append(", icons=");
            sb.append(this.icons);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatterStatusIconsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatterStatusIconsResponse(List<ChatterStatusIcon> list) {
        this(list, ByteString.EMPTY);
    }

    public GetChatterStatusIconsResponse(List<ChatterStatusIcon> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.icons = Internal.immutableCopyOf("icons", list);
    }
}
