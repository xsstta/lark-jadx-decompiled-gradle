package com.ss.android.lark.pb.usearch;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class OncallMeta extends Message<OncallMeta, C50218a> {
    public static final ProtoAdapter<OncallMeta> ADAPTER = new C50219b();
    private static final long serialVersionUID = 0;
    public final String mfaq_id;
    public final String mfaq_title;
    public final String mid;
    public final List<Integer> mtags;

    /* renamed from: com.ss.android.lark.pb.usearch.OncallMeta$b */
    private static final class C50219b extends ProtoAdapter<OncallMeta> {
        C50219b() {
            super(FieldEncoding.LENGTH_DELIMITED, OncallMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(OncallMeta oncallMeta) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, oncallMeta.mid) + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(2, oncallMeta.mtags);
            int i2 = 0;
            if (oncallMeta.mfaq_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, oncallMeta.mfaq_id);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (oncallMeta.mfaq_title != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, oncallMeta.mfaq_title);
            }
            return i3 + i2 + oncallMeta.unknownFields().size();
        }

        /* renamed from: a */
        public OncallMeta decode(ProtoReader protoReader) throws IOException {
            C50218a aVar = new C50218a();
            aVar.f125482a = "";
            aVar.f125484c = "";
            aVar.f125485d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125482a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125483b.add(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f125484c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125485d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, OncallMeta oncallMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, oncallMeta.mid);
            ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 2, oncallMeta.mtags);
            if (oncallMeta.mfaq_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, oncallMeta.mfaq_id);
            }
            if (oncallMeta.mfaq_title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, oncallMeta.mfaq_title);
            }
            protoWriter.writeBytes(oncallMeta.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.usearch.OncallMeta$a */
    public static final class C50218a extends Message.Builder<OncallMeta, C50218a> {

        /* renamed from: a */
        public String f125482a;

        /* renamed from: b */
        public List<Integer> f125483b = Internal.newMutableList();

        /* renamed from: c */
        public String f125484c;

        /* renamed from: d */
        public String f125485d;

        /* renamed from: a */
        public OncallMeta build() {
            String str = this.f125482a;
            if (str != null) {
                return new OncallMeta(str, this.f125483b, this.f125484c, this.f125485d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mid");
        }
    }

    @Override // com.squareup.wire.Message
    public C50218a newBuilder() {
        C50218a aVar = new C50218a();
        aVar.f125482a = this.mid;
        aVar.f125483b = Internal.copyOf("mtags", this.mtags);
        aVar.f125484c = this.mfaq_id;
        aVar.f125485d = this.mfaq_title;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.mid);
        if (!this.mtags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.mtags);
        }
        if (this.mfaq_id != null) {
            sb.append(", faq_id=");
            sb.append(this.mfaq_id);
        }
        if (this.mfaq_title != null) {
            sb.append(", faq_title=");
            sb.append(this.mfaq_title);
        }
        StringBuilder replace = sb.replace(0, 2, "OncallMeta{");
        replace.append('}');
        return replace.toString();
    }

    public OncallMeta(String str, List<Integer> list, String str2, String str3) {
        this(str, list, str2, str3, ByteString.EMPTY);
    }

    public OncallMeta(String str, List<Integer> list, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mid = str;
        this.mtags = Internal.immutableCopyOf("mtags", list);
        this.mfaq_id = str2;
        this.mfaq_title = str3;
    }
}
