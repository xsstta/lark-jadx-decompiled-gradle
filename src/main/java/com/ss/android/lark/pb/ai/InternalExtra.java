package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class InternalExtra extends Message<InternalExtra, C49491a> {
    public static final ProtoAdapter<InternalExtra> ADAPTER = new C49492b();
    public static final Boolean DEFAULT_ALLOW_HIGHLIGHT = false;
    private static final long serialVersionUID = 0;
    public final Boolean mallow_highlight;

    /* renamed from: com.ss.android.lark.pb.ai.InternalExtra$b */
    private static final class C49492b extends ProtoAdapter<InternalExtra> {
        C49492b() {
            super(FieldEncoding.LENGTH_DELIMITED, InternalExtra.class);
        }

        /* renamed from: a */
        public int encodedSize(InternalExtra internalExtra) {
            int i;
            if (internalExtra.mallow_highlight != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, internalExtra.mallow_highlight);
            } else {
                i = 0;
            }
            return i + internalExtra.unknownFields().size();
        }

        /* renamed from: a */
        public InternalExtra decode(ProtoReader protoReader) throws IOException {
            C49491a aVar = new C49491a();
            aVar.f124083a = false;
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
                    aVar.f124083a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, InternalExtra internalExtra) throws IOException {
            if (internalExtra.mallow_highlight != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, internalExtra.mallow_highlight);
            }
            protoWriter.writeBytes(internalExtra.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.InternalExtra$a */
    public static final class C49491a extends Message.Builder<InternalExtra, C49491a> {

        /* renamed from: a */
        public Boolean f124083a;

        /* renamed from: a */
        public InternalExtra build() {
            return new InternalExtra(this.f124083a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49491a newBuilder() {
        C49491a aVar = new C49491a();
        aVar.f124083a = this.mallow_highlight;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mallow_highlight != null) {
            sb.append(", allow_highlight=");
            sb.append(this.mallow_highlight);
        }
        StringBuilder replace = sb.replace(0, 2, "InternalExtra{");
        replace.append('}');
        return replace.toString();
    }

    public InternalExtra(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public InternalExtra(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mallow_highlight = bool;
    }
}
