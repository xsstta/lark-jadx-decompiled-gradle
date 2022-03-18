package com.bytedance.lark.pb.search.slash.v1;

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

public final class SlashCommandParam extends Message<SlashCommandParam, C18809a> {
    public static final ProtoAdapter<SlashCommandParam> ADAPTER = new C18810b();
    private static final long serialVersionUID = 0;
    public final String command_id;
    public final List<String> extras;

    /* renamed from: com.bytedance.lark.pb.search.slash.v1.SlashCommandParam$b */
    private static final class C18810b extends ProtoAdapter<SlashCommandParam> {
        C18810b() {
            super(FieldEncoding.LENGTH_DELIMITED, SlashCommandParam.class);
        }

        /* renamed from: a */
        public int encodedSize(SlashCommandParam slashCommandParam) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, slashCommandParam.command_id) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, slashCommandParam.extras) + slashCommandParam.unknownFields().size();
        }

        /* renamed from: a */
        public SlashCommandParam decode(ProtoReader protoReader) throws IOException {
            C18809a aVar = new C18809a();
            aVar.f46375a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46375a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46376b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SlashCommandParam slashCommandParam) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, slashCommandParam.command_id);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, slashCommandParam.extras);
            protoWriter.writeBytes(slashCommandParam.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.slash.v1.SlashCommandParam$a */
    public static final class C18809a extends Message.Builder<SlashCommandParam, C18809a> {

        /* renamed from: a */
        public String f46375a;

        /* renamed from: b */
        public List<String> f46376b = Internal.newMutableList();

        /* renamed from: a */
        public SlashCommandParam build() {
            String str = this.f46375a;
            if (str != null) {
                return new SlashCommandParam(str, this.f46376b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "command_id");
        }

        /* renamed from: a */
        public C18809a mo64586a(String str) {
            this.f46375a = str;
            return this;
        }

        /* renamed from: a */
        public C18809a mo64587a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f46376b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18809a newBuilder() {
        C18809a aVar = new C18809a();
        aVar.f46375a = this.command_id;
        aVar.f46376b = Internal.copyOf("extras", this.extras);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SlashCommandParam");
        StringBuilder sb = new StringBuilder();
        sb.append(", command_id=");
        sb.append(this.command_id);
        if (!this.extras.isEmpty()) {
            sb.append(", extras=");
            sb.append(this.extras);
        }
        StringBuilder replace = sb.replace(0, 2, "SlashCommandParam{");
        replace.append('}');
        return replace.toString();
    }

    public SlashCommandParam(String str, List<String> list) {
        this(str, list, ByteString.EMPTY);
    }

    public SlashCommandParam(String str, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.command_id = str;
        this.extras = Internal.immutableCopyOf("extras", list);
    }
}
