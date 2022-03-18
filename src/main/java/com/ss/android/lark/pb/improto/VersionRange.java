package com.ss.android.lark.pb.improto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class VersionRange extends Message<VersionRange, C49815a> {
    public static final ProtoAdapter<VersionRange> ADAPTER = new C49816b();
    private static final long serialVersionUID = 0;
    public final String mend;
    public final String mstart;

    /* renamed from: com.ss.android.lark.pb.improto.VersionRange$b */
    private static final class C49816b extends ProtoAdapter<VersionRange> {
        C49816b() {
            super(FieldEncoding.LENGTH_DELIMITED, VersionRange.class);
        }

        /* renamed from: a */
        public int encodedSize(VersionRange versionRange) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, versionRange.mstart) + ProtoAdapter.STRING.encodedSizeWithTag(2, versionRange.mend) + versionRange.unknownFields().size();
        }

        /* renamed from: a */
        public VersionRange decode(ProtoReader protoReader) throws IOException {
            C49815a aVar = new C49815a();
            aVar.f124755a = "";
            aVar.f124756b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124755a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124756b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VersionRange versionRange) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, versionRange.mstart);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, versionRange.mend);
            protoWriter.writeBytes(versionRange.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49815a newBuilder() {
        C49815a aVar = new C49815a();
        aVar.f124755a = this.mstart;
        aVar.f124756b = this.mend;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.improto.VersionRange$a */
    public static final class C49815a extends Message.Builder<VersionRange, C49815a> {

        /* renamed from: a */
        public String f124755a;

        /* renamed from: b */
        public String f124756b;

        /* renamed from: a */
        public VersionRange build() {
            String str;
            String str2 = this.f124755a;
            if (str2 != null && (str = this.f124756b) != null) {
                return new VersionRange(str2, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "mstart", this.f124756b, "mend");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", start=");
        sb.append(this.mstart);
        sb.append(", end=");
        sb.append(this.mend);
        StringBuilder replace = sb.replace(0, 2, "VersionRange{");
        replace.append('}');
        return replace.toString();
    }

    public VersionRange(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public VersionRange(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mstart = str;
        this.mend = str2;
    }
}
