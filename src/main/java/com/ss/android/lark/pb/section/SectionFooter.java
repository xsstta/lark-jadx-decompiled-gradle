package com.ss.android.lark.pb.section;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SectionFooter extends Message<SectionFooter, C50054a> {
    public static final ProtoAdapter<SectionFooter> ADAPTER = new C50055b();
    private static final long serialVersionUID = 0;
    public final Action maction;
    public final String mavatar_key;
    public final String mtext;

    /* renamed from: com.ss.android.lark.pb.section.SectionFooter$b */
    private static final class C50055b extends ProtoAdapter<SectionFooter> {
        C50055b() {
            super(FieldEncoding.LENGTH_DELIMITED, SectionFooter.class);
        }

        /* renamed from: a */
        public int encodedSize(SectionFooter sectionFooter) {
            int i;
            int i2;
            int i3 = 0;
            if (sectionFooter.mavatar_key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, sectionFooter.mavatar_key);
            } else {
                i = 0;
            }
            if (sectionFooter.mtext != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, sectionFooter.mtext);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (sectionFooter.maction != null) {
                i3 = Action.ADAPTER.encodedSizeWithTag(3, sectionFooter.maction);
            }
            return i4 + i3 + sectionFooter.unknownFields().size();
        }

        /* renamed from: a */
        public SectionFooter decode(ProtoReader protoReader) throws IOException {
            C50054a aVar = new C50054a();
            aVar.f125172a = "";
            aVar.f125173b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125172a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125173b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125174c = Action.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SectionFooter sectionFooter) throws IOException {
            if (sectionFooter.mavatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sectionFooter.mavatar_key);
            }
            if (sectionFooter.mtext != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, sectionFooter.mtext);
            }
            if (sectionFooter.maction != null) {
                Action.ADAPTER.encodeWithTag(protoWriter, 3, sectionFooter.maction);
            }
            protoWriter.writeBytes(sectionFooter.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.section.SectionFooter$a */
    public static final class C50054a extends Message.Builder<SectionFooter, C50054a> {

        /* renamed from: a */
        public String f125172a;

        /* renamed from: b */
        public String f125173b;

        /* renamed from: c */
        public Action f125174c;

        /* renamed from: a */
        public SectionFooter build() {
            return new SectionFooter(this.f125172a, this.f125173b, this.f125174c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50054a newBuilder() {
        C50054a aVar = new C50054a();
        aVar.f125172a = this.mavatar_key;
        aVar.f125173b = this.mtext;
        aVar.f125174c = this.maction;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mavatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.mavatar_key);
        }
        if (this.mtext != null) {
            sb.append(", text=");
            sb.append(this.mtext);
        }
        if (this.maction != null) {
            sb.append(", action=");
            sb.append(this.maction);
        }
        StringBuilder replace = sb.replace(0, 2, "SectionFooter{");
        replace.append('}');
        return replace.toString();
    }

    public SectionFooter(String str, String str2, Action action) {
        this(str, str2, action, ByteString.EMPTY);
    }

    public SectionFooter(String str, String str2, Action action, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mavatar_key = str;
        this.mtext = str2;
        this.maction = action;
    }
}
