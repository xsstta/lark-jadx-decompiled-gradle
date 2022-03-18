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

public final class GetDynamicMediaResponse extends Message<GetDynamicMediaResponse, C16238a> {
    public static final ProtoAdapter<GetDynamicMediaResponse> ADAPTER = new C16239b();
    private static final long serialVersionUID = 0;
    public final List<ImageConfiguration> image_configurations;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetDynamicMediaResponse$b */
    private static final class C16239b extends ProtoAdapter<GetDynamicMediaResponse> {
        C16239b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetDynamicMediaResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetDynamicMediaResponse getDynamicMediaResponse) {
            return ImageConfiguration.ADAPTER.asRepeated().encodedSizeWithTag(1, getDynamicMediaResponse.image_configurations) + getDynamicMediaResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetDynamicMediaResponse decode(ProtoReader protoReader) throws IOException {
            C16238a aVar = new C16238a();
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
                    aVar.f42435a.add(ImageConfiguration.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetDynamicMediaResponse getDynamicMediaResponse) throws IOException {
            ImageConfiguration.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getDynamicMediaResponse.image_configurations);
            protoWriter.writeBytes(getDynamicMediaResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetDynamicMediaResponse$a */
    public static final class C16238a extends Message.Builder<GetDynamicMediaResponse, C16238a> {

        /* renamed from: a */
        public List<ImageConfiguration> f42435a = Internal.newMutableList();

        /* renamed from: a */
        public GetDynamicMediaResponse build() {
            return new GetDynamicMediaResponse(this.f42435a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16238a newBuilder() {
        C16238a aVar = new C16238a();
        aVar.f42435a = Internal.copyOf("image_configurations", this.image_configurations);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetDynamicMediaResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.image_configurations.isEmpty()) {
            sb.append(", image_configurations=");
            sb.append(this.image_configurations);
        }
        StringBuilder replace = sb.replace(0, 2, "GetDynamicMediaResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetDynamicMediaResponse(List<ImageConfiguration> list) {
        this(list, ByteString.EMPTY);
    }

    public GetDynamicMediaResponse(List<ImageConfiguration> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.image_configurations = Internal.immutableCopyOf("image_configurations", list);
    }
}
