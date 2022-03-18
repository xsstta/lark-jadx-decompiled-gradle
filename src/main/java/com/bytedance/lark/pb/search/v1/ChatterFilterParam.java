package com.bytedance.lark.pb.search.v1;

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

public final class ChatterFilterParam extends Message<ChatterFilterParam, C18815a> {
    public static final ProtoAdapter<ChatterFilterParam> ADAPTER = new C18816b();
    private static final long serialVersionUID = 0;
    public final String field_key;
    public final List<String> filters;

    /* renamed from: com.bytedance.lark.pb.search.v1.ChatterFilterParam$b */
    private static final class C18816b extends ProtoAdapter<ChatterFilterParam> {
        C18816b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatterFilterParam.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatterFilterParam chatterFilterParam) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, chatterFilterParam.field_key) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, chatterFilterParam.filters) + chatterFilterParam.unknownFields().size();
        }

        /* renamed from: a */
        public ChatterFilterParam decode(ProtoReader protoReader) throws IOException {
            C18815a aVar = new C18815a();
            aVar.f46385a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46385a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46386b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ChatterFilterParam chatterFilterParam) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, chatterFilterParam.field_key);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, chatterFilterParam.filters);
            protoWriter.writeBytes(chatterFilterParam.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.ChatterFilterParam$a */
    public static final class C18815a extends Message.Builder<ChatterFilterParam, C18815a> {

        /* renamed from: a */
        public String f46385a;

        /* renamed from: b */
        public List<String> f46386b = Internal.newMutableList();

        /* renamed from: a */
        public ChatterFilterParam build() {
            String str = this.f46385a;
            if (str != null) {
                return new ChatterFilterParam(str, this.f46386b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "field_key");
        }
    }

    @Override // com.squareup.wire.Message
    public C18815a newBuilder() {
        C18815a aVar = new C18815a();
        aVar.f46385a = this.field_key;
        aVar.f46386b = Internal.copyOf("filters", this.filters);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "ChatterFilterParam");
        StringBuilder sb = new StringBuilder();
        sb.append(", field_key=");
        sb.append(this.field_key);
        if (!this.filters.isEmpty()) {
            sb.append(", filters=");
            sb.append(this.filters);
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
        this.field_key = str;
        this.filters = Internal.immutableCopyOf("filters", list);
    }
}
