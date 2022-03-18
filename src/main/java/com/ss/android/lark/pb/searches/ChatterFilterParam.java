package com.ss.android.lark.pb.searches;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ChatterFilterParam extends Message<ChatterFilterParam, C50010a> {
    public static final ProtoAdapter<ChatterFilterParam> ADAPTER = new C50011b();
    private static final long serialVersionUID = 0;
    public final String mfield_key;
    public final List<String> mfilters;

    /* renamed from: com.ss.android.lark.pb.searches.ChatterFilterParam$b */
    private static final class C50011b extends ProtoAdapter<ChatterFilterParam> {
        C50011b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatterFilterParam.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatterFilterParam chatterFilterParam) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, chatterFilterParam.mfield_key) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, chatterFilterParam.mfilters) + chatterFilterParam.unknownFields().size();
        }

        /* renamed from: a */
        public ChatterFilterParam decode(ProtoReader protoReader) throws IOException {
            C50010a aVar = new C50010a();
            aVar.f125065a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125065a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125066b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ChatterFilterParam chatterFilterParam) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, chatterFilterParam.mfield_key);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, chatterFilterParam.mfilters);
            protoWriter.writeBytes(chatterFilterParam.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.searches.ChatterFilterParam$a */
    public static final class C50010a extends Message.Builder<ChatterFilterParam, C50010a> {

        /* renamed from: a */
        public String f125065a;

        /* renamed from: b */
        public List<String> f125066b = Internal.newMutableList();

        /* renamed from: a */
        public ChatterFilterParam build() {
            String str = this.f125065a;
            if (str != null) {
                return new ChatterFilterParam(str, this.f125066b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mfield_key");
        }
    }

    @Override // com.squareup.wire.Message
    public C50010a newBuilder() {
        C50010a aVar = new C50010a();
        aVar.f125065a = this.mfield_key;
        aVar.f125066b = Internal.copyOf("mfilters", this.mfilters);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", field_key=");
        sb.append(this.mfield_key);
        if (!this.mfilters.isEmpty()) {
            sb.append(", filters=");
            sb.append(this.mfilters);
        }
        StringBuilder replace = sb.replace(0, 2, "ChatterFilterParam{");
        replace.append('}');
        return replace.toString();
    }

    public ChatterFilterParam(String str, List<String> list) {
        this(str, list, ByteString.EMPTY);
    }

    public ChatterFilterParam(String str, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mfield_key = str;
        this.mfilters = Internal.immutableCopyOf("mfilters", list);
    }
}
