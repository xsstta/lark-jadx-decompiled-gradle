package com.ss.android.lark.pb.dynamic_resource;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class RawImageData extends Message<RawImageData, C49628a> {
    public static final ProtoAdapter<RawImageData> ADAPTER = new C49629b();
    public static final ByteString DEFAULT_RAW_DATA = ByteString.EMPTY;
    private static final long serialVersionUID = 0;
    public final ByteString mraw_data;
    public final String msignature;

    /* renamed from: com.ss.android.lark.pb.dynamic_resource.RawImageData$b */
    private static final class C49629b extends ProtoAdapter<RawImageData> {
        C49629b() {
            super(FieldEncoding.LENGTH_DELIMITED, RawImageData.class);
        }

        /* renamed from: a */
        public int encodedSize(RawImageData rawImageData) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.BYTES.encodedSizeWithTag(1, rawImageData.mraw_data);
            if (rawImageData.msignature != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, rawImageData.msignature);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + rawImageData.unknownFields().size();
        }

        /* renamed from: a */
        public RawImageData decode(ProtoReader protoReader) throws IOException {
            C49628a aVar = new C49628a();
            aVar.f124265a = ByteString.EMPTY;
            aVar.f124266b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124265a = ProtoAdapter.BYTES.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124266b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RawImageData rawImageData) throws IOException {
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, rawImageData.mraw_data);
            if (rawImageData.msignature != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, rawImageData.msignature);
            }
            protoWriter.writeBytes(rawImageData.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.dynamic_resource.RawImageData$a */
    public static final class C49628a extends Message.Builder<RawImageData, C49628a> {

        /* renamed from: a */
        public ByteString f124265a;

        /* renamed from: b */
        public String f124266b;

        /* renamed from: a */
        public RawImageData build() {
            ByteString byteString = this.f124265a;
            if (byteString != null) {
                return new RawImageData(byteString, this.f124266b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(byteString, "mraw_data");
        }
    }

    @Override // com.squareup.wire.Message
    public C49628a newBuilder() {
        C49628a aVar = new C49628a();
        aVar.f124265a = this.mraw_data;
        aVar.f124266b = this.msignature;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", raw_data=");
        sb.append(this.mraw_data);
        if (this.msignature != null) {
            sb.append(", signature=");
            sb.append(this.msignature);
        }
        StringBuilder replace = sb.replace(0, 2, "RawImageData{");
        replace.append('}');
        return replace.toString();
    }

    public RawImageData(ByteString byteString, String str) {
        this(byteString, str, ByteString.EMPTY);
    }

    public RawImageData(ByteString byteString, String str, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.mraw_data = byteString;
        this.msignature = str;
    }
}
