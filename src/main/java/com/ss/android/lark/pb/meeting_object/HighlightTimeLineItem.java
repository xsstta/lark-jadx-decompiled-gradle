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

public final class HighlightTimeLineItem extends Message<HighlightTimeLineItem, C49858a> {
    public static final ProtoAdapter<HighlightTimeLineItem> ADAPTER = new C49859b();
    public static final Long DEFAULT_START_TIME = 0L;
    public static final Long DEFAULT_STOP_TIME = 0L;
    public static final Integer DEFAULT_TYPE = 0;
    private static final long serialVersionUID = 0;
    public final String memoji_code;
    public final List<String> mpid_list;
    public final String msender_id;
    public final String msender_name;
    public final List<UserInfo> msender_user_list;
    public final Long mstart_time;
    public final Long mstop_time;
    public final Integer mtype;
    public final String muuid;

    /* renamed from: com.ss.android.lark.pb.meeting_object.HighlightTimeLineItem$b */
    private static final class C49859b extends ProtoAdapter<HighlightTimeLineItem> {
        C49859b() {
            super(FieldEncoding.LENGTH_DELIMITED, HighlightTimeLineItem.class);
        }

        /* renamed from: a */
        public int encodedSize(HighlightTimeLineItem highlightTimeLineItem) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, highlightTimeLineItem.mstart_time);
            int i5 = 0;
            if (highlightTimeLineItem.mstop_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(2, highlightTimeLineItem.mstop_time);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (highlightTimeLineItem.muuid != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, highlightTimeLineItem.muuid);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag2 = i6 + i2 + ProtoAdapter.INT32.encodedSizeWithTag(4, highlightTimeLineItem.mtype);
            if (highlightTimeLineItem.memoji_code != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, highlightTimeLineItem.memoji_code);
            } else {
                i3 = 0;
            }
            int i7 = encodedSizeWithTag2 + i3;
            if (highlightTimeLineItem.msender_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(6, highlightTimeLineItem.msender_id);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (highlightTimeLineItem.msender_name != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(7, highlightTimeLineItem.msender_name);
            }
            return i8 + i5 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(8, highlightTimeLineItem.mpid_list) + UserInfo.ADAPTER.asRepeated().encodedSizeWithTag(9, highlightTimeLineItem.msender_user_list) + highlightTimeLineItem.unknownFields().size();
        }

        /* renamed from: a */
        public HighlightTimeLineItem decode(ProtoReader protoReader) throws IOException {
            C49858a aVar = new C49858a();
            aVar.f124822a = 0L;
            aVar.f124823b = 0L;
            aVar.f124824c = "";
            aVar.f124825d = 0;
            aVar.f124826e = "";
            aVar.f124827f = "";
            aVar.f124828g = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124822a = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            aVar.f124823b = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            aVar.f124824c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f124825d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f124826e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f124827f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f124828g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f124829h.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            aVar.f124830i.add(UserInfo.ADAPTER.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, HighlightTimeLineItem highlightTimeLineItem) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, highlightTimeLineItem.mstart_time);
            if (highlightTimeLineItem.mstop_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, highlightTimeLineItem.mstop_time);
            }
            if (highlightTimeLineItem.muuid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, highlightTimeLineItem.muuid);
            }
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, highlightTimeLineItem.mtype);
            if (highlightTimeLineItem.memoji_code != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, highlightTimeLineItem.memoji_code);
            }
            if (highlightTimeLineItem.msender_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, highlightTimeLineItem.msender_id);
            }
            if (highlightTimeLineItem.msender_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, highlightTimeLineItem.msender_name);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 8, highlightTimeLineItem.mpid_list);
            UserInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, highlightTimeLineItem.msender_user_list);
            protoWriter.writeBytes(highlightTimeLineItem.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.meeting_object.HighlightTimeLineItem$a */
    public static final class C49858a extends Message.Builder<HighlightTimeLineItem, C49858a> {

        /* renamed from: a */
        public Long f124822a;

        /* renamed from: b */
        public Long f124823b;

        /* renamed from: c */
        public String f124824c;

        /* renamed from: d */
        public Integer f124825d;

        /* renamed from: e */
        public String f124826e;

        /* renamed from: f */
        public String f124827f;

        /* renamed from: g */
        public String f124828g;

        /* renamed from: h */
        public List<String> f124829h = Internal.newMutableList();

        /* renamed from: i */
        public List<UserInfo> f124830i = Internal.newMutableList();

        /* renamed from: a */
        public HighlightTimeLineItem build() {
            Integer num;
            Long l = this.f124822a;
            if (l != null && (num = this.f124825d) != null) {
                return new HighlightTimeLineItem(l, this.f124823b, this.f124824c, num, this.f124826e, this.f124827f, this.f124828g, this.f124829h, this.f124830i, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l, "mstart_time", this.f124825d, "mtype");
        }
    }

    @Override // com.squareup.wire.Message
    public C49858a newBuilder() {
        C49858a aVar = new C49858a();
        aVar.f124822a = this.mstart_time;
        aVar.f124823b = this.mstop_time;
        aVar.f124824c = this.muuid;
        aVar.f124825d = this.mtype;
        aVar.f124826e = this.memoji_code;
        aVar.f124827f = this.msender_id;
        aVar.f124828g = this.msender_name;
        aVar.f124829h = Internal.copyOf("mpid_list", this.mpid_list);
        aVar.f124830i = Internal.copyOf("msender_user_list", this.msender_user_list);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", start_time=");
        sb.append(this.mstart_time);
        if (this.mstop_time != null) {
            sb.append(", stop_time=");
            sb.append(this.mstop_time);
        }
        if (this.muuid != null) {
            sb.append(", uuid=");
            sb.append(this.muuid);
        }
        sb.append(", type=");
        sb.append(this.mtype);
        if (this.memoji_code != null) {
            sb.append(", emoji_code=");
            sb.append(this.memoji_code);
        }
        if (this.msender_id != null) {
            sb.append(", sender_id=");
            sb.append(this.msender_id);
        }
        if (this.msender_name != null) {
            sb.append(", sender_name=");
            sb.append(this.msender_name);
        }
        if (!this.mpid_list.isEmpty()) {
            sb.append(", pid_list=");
            sb.append(this.mpid_list);
        }
        if (!this.msender_user_list.isEmpty()) {
            sb.append(", sender_user_list=");
            sb.append(this.msender_user_list);
        }
        StringBuilder replace = sb.replace(0, 2, "HighlightTimeLineItem{");
        replace.append('}');
        return replace.toString();
    }

    public HighlightTimeLineItem(Long l, Long l2, String str, Integer num, String str2, String str3, String str4, List<String> list, List<UserInfo> list2) {
        this(l, l2, str, num, str2, str3, str4, list, list2, ByteString.EMPTY);
    }

    public HighlightTimeLineItem(Long l, Long l2, String str, Integer num, String str2, String str3, String str4, List<String> list, List<UserInfo> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mstart_time = l;
        this.mstop_time = l2;
        this.muuid = str;
        this.mtype = num;
        this.memoji_code = str2;
        this.msender_id = str3;
        this.msender_name = str4;
        this.mpid_list = Internal.immutableCopyOf("mpid_list", list);
        this.msender_user_list = Internal.immutableCopyOf("msender_user_list", list2);
    }
}
