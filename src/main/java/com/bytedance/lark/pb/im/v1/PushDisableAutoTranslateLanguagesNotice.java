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

public final class PushDisableAutoTranslateLanguagesNotice extends Message<PushDisableAutoTranslateLanguagesNotice, C17889a> {
    public static final ProtoAdapter<PushDisableAutoTranslateLanguagesNotice> ADAPTER = new C17890b();
    private static final long serialVersionUID = 0;
    public final List<String> language_keys;

    /* renamed from: com.bytedance.lark.pb.im.v1.PushDisableAutoTranslateLanguagesNotice$b */
    private static final class C17890b extends ProtoAdapter<PushDisableAutoTranslateLanguagesNotice> {
        C17890b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushDisableAutoTranslateLanguagesNotice.class);
        }

        /* renamed from: a */
        public int encodedSize(PushDisableAutoTranslateLanguagesNotice pushDisableAutoTranslateLanguagesNotice) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, pushDisableAutoTranslateLanguagesNotice.language_keys) + pushDisableAutoTranslateLanguagesNotice.unknownFields().size();
        }

        /* renamed from: a */
        public PushDisableAutoTranslateLanguagesNotice decode(ProtoReader protoReader) throws IOException {
            C17889a aVar = new C17889a();
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
                    aVar.f44966a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushDisableAutoTranslateLanguagesNotice pushDisableAutoTranslateLanguagesNotice) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, pushDisableAutoTranslateLanguagesNotice.language_keys);
            protoWriter.writeBytes(pushDisableAutoTranslateLanguagesNotice.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushDisableAutoTranslateLanguagesNotice$a */
    public static final class C17889a extends Message.Builder<PushDisableAutoTranslateLanguagesNotice, C17889a> {

        /* renamed from: a */
        public List<String> f44966a = Internal.newMutableList();

        /* renamed from: a */
        public PushDisableAutoTranslateLanguagesNotice build() {
            return new PushDisableAutoTranslateLanguagesNotice(this.f44966a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17889a newBuilder() {
        C17889a aVar = new C17889a();
        aVar.f44966a = Internal.copyOf("language_keys", this.language_keys);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushDisableAutoTranslateLanguagesNotice");
        StringBuilder sb = new StringBuilder();
        if (!this.language_keys.isEmpty()) {
            sb.append(", language_keys=");
            sb.append(this.language_keys);
        }
        StringBuilder replace = sb.replace(0, 2, "PushDisableAutoTranslateLanguagesNotice{");
        replace.append('}');
        return replace.toString();
    }

    public PushDisableAutoTranslateLanguagesNotice(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public PushDisableAutoTranslateLanguagesNotice(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.language_keys = Internal.immutableCopyOf("language_keys", list);
    }
}
