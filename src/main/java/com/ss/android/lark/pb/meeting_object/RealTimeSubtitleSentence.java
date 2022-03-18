package com.ss.android.lark.pb.meeting_object;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class RealTimeSubtitleSentence extends Message<RealTimeSubtitleSentence, C49868a> {
    public static final ProtoAdapter<RealTimeSubtitleSentence> ADAPTER = new C49869b();
    public static final Boolean DEFAULT_IS_FINAL = false;
    private static final long serialVersionUID = 0;
    public final BaseInfo mbase_info;
    public final List<SubtitleWord> mcontents;
    public final Boolean mis_final;
    public final String mlanguage;
    public final String mpid;
    public final String msid;
    public final String mstart_time;
    public final String mstop_time;

    /* renamed from: com.ss.android.lark.pb.meeting_object.RealTimeSubtitleSentence$b */
    private static final class C49869b extends ProtoAdapter<RealTimeSubtitleSentence> {
        C49869b() {
            super(FieldEncoding.LENGTH_DELIMITED, RealTimeSubtitleSentence.class);
        }

        /* renamed from: a */
        public int encodedSize(RealTimeSubtitleSentence realTimeSubtitleSentence) {
            return BaseInfo.ADAPTER.encodedSizeWithTag(1, realTimeSubtitleSentence.mbase_info) + ProtoAdapter.STRING.encodedSizeWithTag(2, realTimeSubtitleSentence.mpid) + ProtoAdapter.STRING.encodedSizeWithTag(3, realTimeSubtitleSentence.msid) + ProtoAdapter.STRING.encodedSizeWithTag(4, realTimeSubtitleSentence.mlanguage) + ProtoAdapter.STRING.encodedSizeWithTag(5, realTimeSubtitleSentence.mstart_time) + ProtoAdapter.STRING.encodedSizeWithTag(6, realTimeSubtitleSentence.mstop_time) + SubtitleWord.ADAPTER.asRepeated().encodedSizeWithTag(7, realTimeSubtitleSentence.mcontents) + ProtoAdapter.BOOL.encodedSizeWithTag(8, realTimeSubtitleSentence.mis_final) + realTimeSubtitleSentence.unknownFields().size();
        }

        /* renamed from: a */
        public RealTimeSubtitleSentence decode(ProtoReader protoReader) throws IOException {
            C49868a aVar = new C49868a();
            aVar.f124859b = "";
            aVar.f124860c = "";
            aVar.f124861d = "";
            aVar.f124862e = "";
            aVar.f124863f = "";
            aVar.f124865h = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124858a = BaseInfo.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            aVar.f124859b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f124860c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f124861d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f124862e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f124863f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f124864g.add(SubtitleWord.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            aVar.f124865h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RealTimeSubtitleSentence realTimeSubtitleSentence) throws IOException {
            BaseInfo.ADAPTER.encodeWithTag(protoWriter, 1, realTimeSubtitleSentence.mbase_info);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, realTimeSubtitleSentence.mpid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, realTimeSubtitleSentence.msid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, realTimeSubtitleSentence.mlanguage);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, realTimeSubtitleSentence.mstart_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, realTimeSubtitleSentence.mstop_time);
            SubtitleWord.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, realTimeSubtitleSentence.mcontents);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, realTimeSubtitleSentence.mis_final);
            protoWriter.writeBytes(realTimeSubtitleSentence.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49868a newBuilder() {
        C49868a aVar = new C49868a();
        aVar.f124858a = this.mbase_info;
        aVar.f124859b = this.mpid;
        aVar.f124860c = this.msid;
        aVar.f124861d = this.mlanguage;
        aVar.f124862e = this.mstart_time;
        aVar.f124863f = this.mstop_time;
        aVar.f124864g = Internal.copyOf("mcontents", this.mcontents);
        aVar.f124865h = this.mis_final;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.meeting_object.RealTimeSubtitleSentence$a */
    public static final class C49868a extends Message.Builder<RealTimeSubtitleSentence, C49868a> {

        /* renamed from: a */
        public BaseInfo f124858a;

        /* renamed from: b */
        public String f124859b;

        /* renamed from: c */
        public String f124860c;

        /* renamed from: d */
        public String f124861d;

        /* renamed from: e */
        public String f124862e;

        /* renamed from: f */
        public String f124863f;

        /* renamed from: g */
        public List<SubtitleWord> f124864g = Internal.newMutableList();

        /* renamed from: h */
        public Boolean f124865h;

        /* renamed from: a */
        public RealTimeSubtitleSentence build() {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Boolean bool;
            BaseInfo baseInfo = this.f124858a;
            if (baseInfo != null && (str = this.f124859b) != null && (str2 = this.f124860c) != null && (str3 = this.f124861d) != null && (str4 = this.f124862e) != null && (str5 = this.f124863f) != null && (bool = this.f124865h) != null) {
                return new RealTimeSubtitleSentence(baseInfo, str, str2, str3, str4, str5, this.f124864g, bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(baseInfo, "mbase_info", this.f124859b, "mpid", this.f124860c, "msid", this.f124861d, "mlanguage", this.f124862e, "mstart_time", this.f124863f, "mstop_time", this.f124865h, "mis_final");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", base_info=");
        sb.append(this.mbase_info);
        sb.append(", pid=");
        sb.append(this.mpid);
        sb.append(", sid=");
        sb.append(this.msid);
        sb.append(", language=");
        sb.append(this.mlanguage);
        sb.append(", start_time=");
        sb.append(this.mstart_time);
        sb.append(", stop_time=");
        sb.append(this.mstop_time);
        if (!this.mcontents.isEmpty()) {
            sb.append(", contents=");
            sb.append(this.mcontents);
        }
        sb.append(", is_final=");
        sb.append(this.mis_final);
        StringBuilder replace = sb.replace(0, 2, "RealTimeSubtitleSentence{");
        replace.append('}');
        return replace.toString();
    }

    public RealTimeSubtitleSentence(BaseInfo baseInfo, String str, String str2, String str3, String str4, String str5, List<SubtitleWord> list, Boolean bool) {
        this(baseInfo, str, str2, str3, str4, str5, list, bool, ByteString.EMPTY);
    }

    public RealTimeSubtitleSentence(BaseInfo baseInfo, String str, String str2, String str3, String str4, String str5, List<SubtitleWord> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mbase_info = baseInfo;
        this.mpid = str;
        this.msid = str2;
        this.mlanguage = str3;
        this.mstart_time = str4;
        this.mstop_time = str5;
        this.mcontents = Internal.immutableCopyOf("mcontents", list);
        this.mis_final = bool;
    }
}
