package com.ss.android.lark.pb.meeting_object;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SubtitleWord extends Message<SubtitleWord, C49874a> {
    public static final ProtoAdapter<SubtitleWord> ADAPTER = new C49875b();
    private static final long serialVersionUID = 0;
    public final String mcid;
    public final String mcontent;
    public final String mlanguage;
    public final String mstart_time;
    public final String mstop_time;

    /* renamed from: com.ss.android.lark.pb.meeting_object.SubtitleWord$b */
    private static final class C49875b extends ProtoAdapter<SubtitleWord> {
        C49875b() {
            super(FieldEncoding.LENGTH_DELIMITED, SubtitleWord.class);
        }

        /* renamed from: a */
        public int encodedSize(SubtitleWord subtitleWord) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, subtitleWord.mcid) + ProtoAdapter.STRING.encodedSizeWithTag(2, subtitleWord.mlanguage) + ProtoAdapter.STRING.encodedSizeWithTag(3, subtitleWord.mstart_time) + ProtoAdapter.STRING.encodedSizeWithTag(4, subtitleWord.mstop_time) + ProtoAdapter.STRING.encodedSizeWithTag(5, subtitleWord.mcontent) + subtitleWord.unknownFields().size();
        }

        /* renamed from: a */
        public SubtitleWord decode(ProtoReader protoReader) throws IOException {
            C49874a aVar = new C49874a();
            aVar.f124878a = "";
            aVar.f124879b = "";
            aVar.f124880c = "";
            aVar.f124881d = "";
            aVar.f124882e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124878a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124879b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f124880c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f124881d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124882e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SubtitleWord subtitleWord) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, subtitleWord.mcid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, subtitleWord.mlanguage);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, subtitleWord.mstart_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, subtitleWord.mstop_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, subtitleWord.mcontent);
            protoWriter.writeBytes(subtitleWord.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49874a newBuilder() {
        C49874a aVar = new C49874a();
        aVar.f124878a = this.mcid;
        aVar.f124879b = this.mlanguage;
        aVar.f124880c = this.mstart_time;
        aVar.f124881d = this.mstop_time;
        aVar.f124882e = this.mcontent;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.meeting_object.SubtitleWord$a */
    public static final class C49874a extends Message.Builder<SubtitleWord, C49874a> {

        /* renamed from: a */
        public String f124878a;

        /* renamed from: b */
        public String f124879b;

        /* renamed from: c */
        public String f124880c;

        /* renamed from: d */
        public String f124881d;

        /* renamed from: e */
        public String f124882e;

        /* renamed from: a */
        public SubtitleWord build() {
            String str;
            String str2;
            String str3;
            String str4;
            String str5 = this.f124878a;
            if (str5 != null && (str = this.f124879b) != null && (str2 = this.f124880c) != null && (str3 = this.f124881d) != null && (str4 = this.f124882e) != null) {
                return new SubtitleWord(str5, str, str2, str3, str4, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str5, "mcid", this.f124879b, "mlanguage", this.f124880c, "mstart_time", this.f124881d, "mstop_time", this.f124882e, "mcontent");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", cid=");
        sb.append(this.mcid);
        sb.append(", language=");
        sb.append(this.mlanguage);
        sb.append(", start_time=");
        sb.append(this.mstart_time);
        sb.append(", stop_time=");
        sb.append(this.mstop_time);
        sb.append(", content=");
        sb.append(this.mcontent);
        StringBuilder replace = sb.replace(0, 2, "SubtitleWord{");
        replace.append('}');
        return replace.toString();
    }

    public SubtitleWord(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, ByteString.EMPTY);
    }

    public SubtitleWord(String str, String str2, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mcid = str;
        this.mlanguage = str2;
        this.mstart_time = str3;
        this.mstop_time = str4;
        this.mcontent = str5;
    }
}
