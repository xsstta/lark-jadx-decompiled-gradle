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

public final class ChatterStatusIcon extends Message<ChatterStatusIcon, C16136a> {
    public static final ProtoAdapter<ChatterStatusIcon> ADAPTER = new C16137b();
    private static final long serialVersionUID = 0;
    public final String icon_key;

    /* renamed from: com.bytedance.lark.pb.contact.v1.ChatterStatusIcon$b */
    private static final class C16137b extends ProtoAdapter<ChatterStatusIcon> {
        C16137b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatterStatusIcon.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatterStatusIcon chatterStatusIcon) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, chatterStatusIcon.icon_key) + chatterStatusIcon.unknownFields().size();
        }

        /* renamed from: a */
        public ChatterStatusIcon decode(ProtoReader protoReader) throws IOException {
            C16136a aVar = new C16136a();
            aVar.f42250a = "";
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
                    aVar.f42250a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ChatterStatusIcon chatterStatusIcon) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, chatterStatusIcon.icon_key);
            protoWriter.writeBytes(chatterStatusIcon.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.ChatterStatusIcon$a */
    public static final class C16136a extends Message.Builder<ChatterStatusIcon, C16136a> {

        /* renamed from: a */
        public String f42250a;

        /* renamed from: a */
        public ChatterStatusIcon build() {
            String str = this.f42250a;
            if (str != null) {
                return new ChatterStatusIcon(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "icon_key");
        }
    }

    @Override // com.squareup.wire.Message
    public C16136a newBuilder() {
        C16136a aVar = new C16136a();
        aVar.f42250a = this.icon_key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "ChatterStatusIcon");
        StringBuilder sb = new StringBuilder();
        sb.append(", icon_key=");
        sb.append(this.icon_key);
        StringBuilder replace = sb.replace(0, 2, "ChatterStatusIcon{");
        replace.append('}');
        return replace.toString();
    }

    public ChatterStatusIcon(String str) {
        this(str, ByteString.EMPTY);
    }

    public ChatterStatusIcon(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.icon_key = str;
    }
}
