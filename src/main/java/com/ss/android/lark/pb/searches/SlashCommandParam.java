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

public final class SlashCommandParam extends Message<SlashCommandParam, C50046a> {
    public static final ProtoAdapter<SlashCommandParam> ADAPTER = new C50047b();
    private static final long serialVersionUID = 0;
    public final String mcommand_id;
    public final List<String> mextras;

    /* renamed from: com.ss.android.lark.pb.searches.SlashCommandParam$b */
    private static final class C50047b extends ProtoAdapter<SlashCommandParam> {
        C50047b() {
            super(FieldEncoding.LENGTH_DELIMITED, SlashCommandParam.class);
        }

        /* renamed from: a */
        public int encodedSize(SlashCommandParam slashCommandParam) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, slashCommandParam.mcommand_id) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, slashCommandParam.mextras) + slashCommandParam.unknownFields().size();
        }

        /* renamed from: a */
        public SlashCommandParam decode(ProtoReader protoReader) throws IOException {
            C50046a aVar = new C50046a();
            aVar.f125161a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125161a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125162b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SlashCommandParam slashCommandParam) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, slashCommandParam.mcommand_id);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, slashCommandParam.mextras);
            protoWriter.writeBytes(slashCommandParam.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.searches.SlashCommandParam$a */
    public static final class C50046a extends Message.Builder<SlashCommandParam, C50046a> {

        /* renamed from: a */
        public String f125161a;

        /* renamed from: b */
        public List<String> f125162b = Internal.newMutableList();

        /* renamed from: a */
        public SlashCommandParam build() {
            String str = this.f125161a;
            if (str != null) {
                return new SlashCommandParam(str, this.f125162b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mcommand_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C50046a newBuilder() {
        C50046a aVar = new C50046a();
        aVar.f125161a = this.mcommand_id;
        aVar.f125162b = Internal.copyOf("mextras", this.mextras);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", command_id=");
        sb.append(this.mcommand_id);
        if (!this.mextras.isEmpty()) {
            sb.append(", extras=");
            sb.append(this.mextras);
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
        this.mcommand_id = str;
        this.mextras = Internal.immutableCopyOf("mextras", list);
    }
}
