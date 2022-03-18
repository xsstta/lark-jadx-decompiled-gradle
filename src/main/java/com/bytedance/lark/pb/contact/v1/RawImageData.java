package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class RawImageData extends Message<RawImageData, C16356a> {
    public static final ProtoAdapter<RawImageData> ADAPTER = new C16357b();
    public static final ByteString DEFAULT_RAW_DATA = ByteString.EMPTY;
    private static final long serialVersionUID = 0;
    public final ByteString raw_data;

    /* renamed from: com.bytedance.lark.pb.contact.v1.RawImageData$b */
    private static final class C16357b extends ProtoAdapter<RawImageData> {
        C16357b() {
            super(FieldEncoding.LENGTH_DELIMITED, RawImageData.class);
        }

        /* renamed from: a */
        public int encodedSize(RawImageData rawImageData) {
            return ProtoAdapter.BYTES.encodedSizeWithTag(1, rawImageData.raw_data) + rawImageData.unknownFields().size();
        }

        /* renamed from: a */
        public RawImageData decode(ProtoReader protoReader) throws IOException {
            C16356a aVar = new C16356a();
            aVar.f42601a = ByteString.EMPTY;
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
                    aVar.f42601a = ProtoAdapter.BYTES.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RawImageData rawImageData) throws IOException {
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, rawImageData.raw_data);
            protoWriter.writeBytes(rawImageData.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.RawImageData$a */
    public static final class C16356a extends Message.Builder<RawImageData, C16356a> {

        /* renamed from: a */
        public ByteString f42601a;

        /* renamed from: a */
        public RawImageData build() {
            ByteString byteString = this.f42601a;
            if (byteString != null) {
                return new RawImageData(byteString, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(byteString, "raw_data");
        }
    }

    @Override // com.squareup.wire.Message
    public C16356a newBuilder() {
        C16356a aVar = new C16356a();
        aVar.f42601a = this.raw_data;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "RawImageData");
        StringBuilder sb = new StringBuilder();
        sb.append(", raw_data=");
        sb.append(this.raw_data);
        StringBuilder replace = sb.replace(0, 2, "RawImageData{");
        replace.append('}');
        return replace.toString();
    }

    public RawImageData(ByteString byteString) {
        this(byteString, ByteString.EMPTY);
    }

    public RawImageData(ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.raw_data = byteString;
    }
}
