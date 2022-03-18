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

public final class CommentItem extends Message<CommentItem, C49849a> {
    public static final ProtoAdapter<CommentItem> ADAPTER = new C49850b();
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final List<CommentContentItem> mcomment_content_list;
    public final String mcomment_id;
    public final Long mcreate_time;
    public final List<String> mpid_list;
    public final String mquote;
    public final Long mupdate_time;
    public final String muuid;

    /* renamed from: com.ss.android.lark.pb.meeting_object.CommentItem$b */
    private static final class C49850b extends ProtoAdapter<CommentItem> {
        C49850b() {
            super(FieldEncoding.LENGTH_DELIMITED, CommentItem.class);
        }

        /* renamed from: a */
        public int encodedSize(CommentItem commentItem) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, commentItem.muuid) + ProtoAdapter.STRING.encodedSizeWithTag(2, commentItem.mcomment_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, commentItem.mquote) + ProtoAdapter.INT64.encodedSizeWithTag(4, commentItem.mcreate_time) + ProtoAdapter.INT64.encodedSizeWithTag(5, commentItem.mupdate_time) + CommentContentItem.ADAPTER.asRepeated().encodedSizeWithTag(6, commentItem.mcomment_content_list) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(7, commentItem.mpid_list) + commentItem.unknownFields().size();
        }

        /* renamed from: a */
        public CommentItem decode(ProtoReader protoReader) throws IOException {
            C49849a aVar = new C49849a();
            aVar.f124797a = "";
            aVar.f124798b = "";
            aVar.f124799c = "";
            aVar.f124800d = 0L;
            aVar.f124801e = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124797a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f124798b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f124799c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f124800d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f124801e = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f124802f.add(CommentContentItem.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            aVar.f124803g.add(ProtoAdapter.STRING.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, CommentItem commentItem) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, commentItem.muuid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, commentItem.mcomment_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, commentItem.mquote);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, commentItem.mcreate_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, commentItem.mupdate_time);
            CommentContentItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, commentItem.mcomment_content_list);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 7, commentItem.mpid_list);
            protoWriter.writeBytes(commentItem.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49849a newBuilder() {
        C49849a aVar = new C49849a();
        aVar.f124797a = this.muuid;
        aVar.f124798b = this.mcomment_id;
        aVar.f124799c = this.mquote;
        aVar.f124800d = this.mcreate_time;
        aVar.f124801e = this.mupdate_time;
        aVar.f124802f = Internal.copyOf("mcomment_content_list", this.mcomment_content_list);
        aVar.f124803g = Internal.copyOf("mpid_list", this.mpid_list);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.meeting_object.CommentItem$a */
    public static final class C49849a extends Message.Builder<CommentItem, C49849a> {

        /* renamed from: a */
        public String f124797a;

        /* renamed from: b */
        public String f124798b;

        /* renamed from: c */
        public String f124799c;

        /* renamed from: d */
        public Long f124800d;

        /* renamed from: e */
        public Long f124801e;

        /* renamed from: f */
        public List<CommentContentItem> f124802f = Internal.newMutableList();

        /* renamed from: g */
        public List<String> f124803g = Internal.newMutableList();

        /* renamed from: a */
        public CommentItem build() {
            String str;
            String str2;
            Long l;
            Long l2;
            String str3 = this.f124797a;
            if (str3 != null && (str = this.f124798b) != null && (str2 = this.f124799c) != null && (l = this.f124800d) != null && (l2 = this.f124801e) != null) {
                return new CommentItem(str3, str, str2, l, l2, this.f124802f, this.f124803g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str3, "muuid", this.f124798b, "mcomment_id", this.f124799c, "mquote", this.f124800d, "mcreate_time", this.f124801e, "mupdate_time");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", uuid=");
        sb.append(this.muuid);
        sb.append(", comment_id=");
        sb.append(this.mcomment_id);
        sb.append(", quote=");
        sb.append(this.mquote);
        sb.append(", create_time=");
        sb.append(this.mcreate_time);
        sb.append(", update_time=");
        sb.append(this.mupdate_time);
        if (!this.mcomment_content_list.isEmpty()) {
            sb.append(", comment_content_list=");
            sb.append(this.mcomment_content_list);
        }
        if (!this.mpid_list.isEmpty()) {
            sb.append(", pid_list=");
            sb.append(this.mpid_list);
        }
        StringBuilder replace = sb.replace(0, 2, "CommentItem{");
        replace.append('}');
        return replace.toString();
    }

    public CommentItem(String str, String str2, String str3, Long l, Long l2, List<CommentContentItem> list, List<String> list2) {
        this(str, str2, str3, l, l2, list, list2, ByteString.EMPTY);
    }

    public CommentItem(String str, String str2, String str3, Long l, Long l2, List<CommentContentItem> list, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.muuid = str;
        this.mcomment_id = str2;
        this.mquote = str3;
        this.mcreate_time = l;
        this.mupdate_time = l2;
        this.mcomment_content_list = Internal.immutableCopyOf("mcomment_content_list", list);
        this.mpid_list = Internal.immutableCopyOf("mpid_list", list2);
    }
}
