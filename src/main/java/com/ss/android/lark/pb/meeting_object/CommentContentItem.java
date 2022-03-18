package com.ss.android.lark.pb.meeting_object;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CommentContentItem extends Message<CommentContentItem, C49847a> {
    public static final ProtoAdapter<CommentContentItem> ADAPTER = new C49848b();
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String mavatar_url;
    public final String mcontent;
    public final String mcontent_id;
    public final Long mcreate_time;
    public final Long mupdate_time;
    public final String muser_id;
    public final String muser_name;

    /* renamed from: com.ss.android.lark.pb.meeting_object.CommentContentItem$b */
    private static final class C49848b extends ProtoAdapter<CommentContentItem> {
        C49848b() {
            super(FieldEncoding.LENGTH_DELIMITED, CommentContentItem.class);
        }

        /* renamed from: a */
        public int encodedSize(CommentContentItem commentContentItem) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, commentContentItem.mcontent) + ProtoAdapter.STRING.encodedSizeWithTag(2, commentContentItem.mcontent_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, commentContentItem.muser_id) + ProtoAdapter.STRING.encodedSizeWithTag(4, commentContentItem.muser_name) + ProtoAdapter.STRING.encodedSizeWithTag(5, commentContentItem.mavatar_url);
            if (commentContentItem.mcreate_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(6, commentContentItem.mcreate_time);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + ProtoAdapter.INT64.encodedSizeWithTag(7, commentContentItem.mupdate_time) + commentContentItem.unknownFields().size();
        }

        /* renamed from: a */
        public CommentContentItem decode(ProtoReader protoReader) throws IOException {
            C49847a aVar = new C49847a();
            aVar.f124790a = "";
            aVar.f124791b = "";
            aVar.f124792c = "";
            aVar.f124793d = "";
            aVar.f124794e = "";
            aVar.f124795f = 0L;
            aVar.f124796g = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124790a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f124791b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f124792c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f124793d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f124794e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f124795f = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            aVar.f124796g = ProtoAdapter.INT64.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, CommentContentItem commentContentItem) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, commentContentItem.mcontent);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, commentContentItem.mcontent_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, commentContentItem.muser_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, commentContentItem.muser_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, commentContentItem.mavatar_url);
            if (commentContentItem.mcreate_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, commentContentItem.mcreate_time);
            }
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, commentContentItem.mupdate_time);
            protoWriter.writeBytes(commentContentItem.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49847a newBuilder() {
        C49847a aVar = new C49847a();
        aVar.f124790a = this.mcontent;
        aVar.f124791b = this.mcontent_id;
        aVar.f124792c = this.muser_id;
        aVar.f124793d = this.muser_name;
        aVar.f124794e = this.mavatar_url;
        aVar.f124795f = this.mcreate_time;
        aVar.f124796g = this.mupdate_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.meeting_object.CommentContentItem$a */
    public static final class C49847a extends Message.Builder<CommentContentItem, C49847a> {

        /* renamed from: a */
        public String f124790a;

        /* renamed from: b */
        public String f124791b;

        /* renamed from: c */
        public String f124792c;

        /* renamed from: d */
        public String f124793d;

        /* renamed from: e */
        public String f124794e;

        /* renamed from: f */
        public Long f124795f;

        /* renamed from: g */
        public Long f124796g;

        /* renamed from: a */
        public CommentContentItem build() {
            String str;
            String str2;
            String str3;
            String str4;
            Long l;
            String str5 = this.f124790a;
            if (str5 != null && (str = this.f124791b) != null && (str2 = this.f124792c) != null && (str3 = this.f124793d) != null && (str4 = this.f124794e) != null && (l = this.f124796g) != null) {
                return new CommentContentItem(str5, str, str2, str3, str4, this.f124795f, l, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str5, "mcontent", this.f124791b, "mcontent_id", this.f124792c, "muser_id", this.f124793d, "muser_name", this.f124794e, "mavatar_url", this.f124796g, "mupdate_time");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", content=");
        sb.append(this.mcontent);
        sb.append(", content_id=");
        sb.append(this.mcontent_id);
        sb.append(", user_id=");
        sb.append(this.muser_id);
        sb.append(", user_name=");
        sb.append(this.muser_name);
        sb.append(", avatar_url=");
        sb.append(this.mavatar_url);
        if (this.mcreate_time != null) {
            sb.append(", create_time=");
            sb.append(this.mcreate_time);
        }
        sb.append(", update_time=");
        sb.append(this.mupdate_time);
        StringBuilder replace = sb.replace(0, 2, "CommentContentItem{");
        replace.append('}');
        return replace.toString();
    }

    public CommentContentItem(String str, String str2, String str3, String str4, String str5, Long l, Long l2) {
        this(str, str2, str3, str4, str5, l, l2, ByteString.EMPTY);
    }

    public CommentContentItem(String str, String str2, String str3, String str4, String str5, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mcontent = str;
        this.mcontent_id = str2;
        this.muser_id = str3;
        this.muser_name = str4;
        this.mavatar_url = str5;
        this.mcreate_time = l;
        this.mupdate_time = l2;
    }
}
