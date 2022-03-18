package com.ss.android.lark.pb.meeting_object;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class HighlightItemInSubtitle extends Message<HighlightItemInSubtitle, C49856a> {
    public static final ProtoAdapter<HighlightItemInSubtitle> ADAPTER = new C49857b();
    public static final Integer DEFAULT_OFFSET = 0;
    public static final Integer DEFAULT_SIZE = 0;
    public static final Integer DEFAULT_TYPE = 0;
    private static final long serialVersionUID = 0;
    public final String mcomment_id;
    public final String mhighlight_id;
    public final Integer moffset;
    public final Integer msize;
    public final Integer mtype;
    public final String muuid;

    /* renamed from: com.ss.android.lark.pb.meeting_object.HighlightItemInSubtitle$b */
    private static final class C49857b extends ProtoAdapter<HighlightItemInSubtitle> {
        C49857b() {
            super(FieldEncoding.LENGTH_DELIMITED, HighlightItemInSubtitle.class);
        }

        /* renamed from: a */
        public int encodedSize(HighlightItemInSubtitle highlightItemInSubtitle) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, highlightItemInSubtitle.moffset) + ProtoAdapter.INT32.encodedSizeWithTag(2, highlightItemInSubtitle.msize) + ProtoAdapter.INT32.encodedSizeWithTag(3, highlightItemInSubtitle.mtype) + ProtoAdapter.STRING.encodedSizeWithTag(4, highlightItemInSubtitle.muuid) + ProtoAdapter.STRING.encodedSizeWithTag(5, highlightItemInSubtitle.mhighlight_id) + ProtoAdapter.STRING.encodedSizeWithTag(6, highlightItemInSubtitle.mcomment_id) + highlightItemInSubtitle.unknownFields().size();
        }

        /* renamed from: a */
        public HighlightItemInSubtitle decode(ProtoReader protoReader) throws IOException {
            C49856a aVar = new C49856a();
            aVar.f124816a = 0;
            aVar.f124817b = 0;
            aVar.f124818c = 0;
            aVar.f124819d = "";
            aVar.f124820e = "";
            aVar.f124821f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124816a = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            aVar.f124817b = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            aVar.f124818c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f124819d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f124820e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f124821f = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, HighlightItemInSubtitle highlightItemInSubtitle) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, highlightItemInSubtitle.moffset);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, highlightItemInSubtitle.msize);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, highlightItemInSubtitle.mtype);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, highlightItemInSubtitle.muuid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, highlightItemInSubtitle.mhighlight_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, highlightItemInSubtitle.mcomment_id);
            protoWriter.writeBytes(highlightItemInSubtitle.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49856a newBuilder() {
        C49856a aVar = new C49856a();
        aVar.f124816a = this.moffset;
        aVar.f124817b = this.msize;
        aVar.f124818c = this.mtype;
        aVar.f124819d = this.muuid;
        aVar.f124820e = this.mhighlight_id;
        aVar.f124821f = this.mcomment_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.meeting_object.HighlightItemInSubtitle$a */
    public static final class C49856a extends Message.Builder<HighlightItemInSubtitle, C49856a> {

        /* renamed from: a */
        public Integer f124816a;

        /* renamed from: b */
        public Integer f124817b;

        /* renamed from: c */
        public Integer f124818c;

        /* renamed from: d */
        public String f124819d;

        /* renamed from: e */
        public String f124820e;

        /* renamed from: f */
        public String f124821f;

        /* renamed from: a */
        public HighlightItemInSubtitle build() {
            Integer num;
            Integer num2;
            String str;
            String str2;
            String str3;
            Integer num3 = this.f124816a;
            if (num3 != null && (num = this.f124817b) != null && (num2 = this.f124818c) != null && (str = this.f124819d) != null && (str2 = this.f124820e) != null && (str3 = this.f124821f) != null) {
                return new HighlightItemInSubtitle(num3, num, num2, str, str2, str3, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num3, "moffset", this.f124817b, "msize", this.f124818c, "mtype", this.f124819d, "muuid", this.f124820e, "mhighlight_id", this.f124821f, "mcomment_id");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", offset=");
        sb.append(this.moffset);
        sb.append(", size=");
        sb.append(this.msize);
        sb.append(", type=");
        sb.append(this.mtype);
        sb.append(", uuid=");
        sb.append(this.muuid);
        sb.append(", highlight_id=");
        sb.append(this.mhighlight_id);
        sb.append(", comment_id=");
        sb.append(this.mcomment_id);
        StringBuilder replace = sb.replace(0, 2, "HighlightItemInSubtitle{");
        replace.append('}');
        return replace.toString();
    }

    public HighlightItemInSubtitle(Integer num, Integer num2, Integer num3, String str, String str2, String str3) {
        this(num, num2, num3, str, str2, str3, ByteString.EMPTY);
    }

    public HighlightItemInSubtitle(Integer num, Integer num2, Integer num3, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.moffset = num;
        this.msize = num2;
        this.mtype = num3;
        this.muuid = str;
        this.mhighlight_id = str2;
        this.mcomment_id = str3;
    }
}
