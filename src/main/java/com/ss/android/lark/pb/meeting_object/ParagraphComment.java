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

public final class ParagraphComment extends Message<ParagraphComment, C49862a> {
    public static final ProtoAdapter<ParagraphComment> ADAPTER = new C49863b();
    public static final Integer DEFAULT_COMMENT_NUM = 0;
    private static final long serialVersionUID = 0;
    public final List<CommentItem> mcomment_list;
    public final Integer mcomment_num;
    public final String mpid;

    /* renamed from: com.ss.android.lark.pb.meeting_object.ParagraphComment$b */
    private static final class C49863b extends ProtoAdapter<ParagraphComment> {
        C49863b() {
            super(FieldEncoding.LENGTH_DELIMITED, ParagraphComment.class);
        }

        /* renamed from: a */
        public int encodedSize(ParagraphComment paragraphComment) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, paragraphComment.mpid) + ProtoAdapter.INT32.encodedSizeWithTag(2, paragraphComment.mcomment_num) + CommentItem.ADAPTER.asRepeated().encodedSizeWithTag(3, paragraphComment.mcomment_list) + paragraphComment.unknownFields().size();
        }

        /* renamed from: a */
        public ParagraphComment decode(ProtoReader protoReader) throws IOException {
            C49862a aVar = new C49862a();
            aVar.f124835a = "";
            aVar.f124836b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124835a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124836b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124837c.add(CommentItem.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ParagraphComment paragraphComment) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, paragraphComment.mpid);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, paragraphComment.mcomment_num);
            CommentItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, paragraphComment.mcomment_list);
            protoWriter.writeBytes(paragraphComment.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49862a newBuilder() {
        C49862a aVar = new C49862a();
        aVar.f124835a = this.mpid;
        aVar.f124836b = this.mcomment_num;
        aVar.f124837c = Internal.copyOf("mcomment_list", this.mcomment_list);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.meeting_object.ParagraphComment$a */
    public static final class C49862a extends Message.Builder<ParagraphComment, C49862a> {

        /* renamed from: a */
        public String f124835a;

        /* renamed from: b */
        public Integer f124836b;

        /* renamed from: c */
        public List<CommentItem> f124837c = Internal.newMutableList();

        /* renamed from: a */
        public ParagraphComment build() {
            Integer num;
            String str = this.f124835a;
            if (str != null && (num = this.f124836b) != null) {
                return new ParagraphComment(str, num, this.f124837c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mpid", this.f124836b, "mcomment_num");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", pid=");
        sb.append(this.mpid);
        sb.append(", comment_num=");
        sb.append(this.mcomment_num);
        if (!this.mcomment_list.isEmpty()) {
            sb.append(", comment_list=");
            sb.append(this.mcomment_list);
        }
        StringBuilder replace = sb.replace(0, 2, "ParagraphComment{");
        replace.append('}');
        return replace.toString();
    }

    public ParagraphComment(String str, Integer num, List<CommentItem> list) {
        this(str, num, list, ByteString.EMPTY);
    }

    public ParagraphComment(String str, Integer num, List<CommentItem> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mpid = str;
        this.mcomment_num = num;
        this.mcomment_list = Internal.immutableCopyOf("mcomment_list", list);
    }
}
