package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class BoxData extends Message<BoxData, C17094a> {
    public static final ProtoAdapter<BoxData> ADAPTER = new C17095b();
    public static final Long DEFAULT_DISPLAY_TIME = 0L;
    public static final Boolean DEFAULT_HAS_FOCUS = false;
    public static final Boolean DEFAULT_IS_REMIND = false;
    public static final Boolean DEFAULT_IS_SHORTCUT = false;
    public static final Long DEFAULT_RANK_TIME = 0L;
    public static final Integer DEFAULT_UNREAD_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final AtInfo at_info;
    public final List<AtInfo> at_infos;
    public final Long display_time;
    public final Boolean has_focus;
    public final Boolean is_remind;
    public final Boolean is_shortcut;
    public final String localized_digest_message;
    public final Long rank_time;
    public final Integer unread_count;

    /* renamed from: com.bytedance.lark.pb.feed.v1.BoxData$b */
    private static final class C17095b extends ProtoAdapter<BoxData> {
        C17095b() {
            super(FieldEncoding.LENGTH_DELIMITED, BoxData.class);
        }

        /* renamed from: a */
        public int encodedSize(BoxData boxData) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, boxData.is_remind);
            int i7 = 0;
            if (boxData.rank_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(2, boxData.rank_time);
            } else {
                i = 0;
            }
            int i8 = encodedSizeWithTag + i;
            if (boxData.is_shortcut != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(4, boxData.is_shortcut);
            } else {
                i2 = 0;
            }
            int i9 = i8 + i2;
            if (boxData.unread_count != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(5, boxData.unread_count);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (boxData.display_time != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(6, boxData.display_time);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (boxData.localized_digest_message != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(7, boxData.localized_digest_message);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (boxData.at_info != null) {
                i6 = AtInfo.ADAPTER.encodedSizeWithTag(8, boxData.at_info);
            } else {
                i6 = 0;
            }
            int encodedSizeWithTag2 = i12 + i6 + AtInfo.ADAPTER.asRepeated().encodedSizeWithTag(9, boxData.at_infos);
            if (boxData.has_focus != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(10, boxData.has_focus);
            }
            return encodedSizeWithTag2 + i7 + boxData.unknownFields().size();
        }

        /* renamed from: a */
        public BoxData decode(ProtoReader protoReader) throws IOException {
            C17094a aVar = new C17094a();
            aVar.f43772a = false;
            aVar.f43773b = 0L;
            aVar.f43774c = false;
            aVar.f43775d = 0;
            aVar.f43776e = 0L;
            aVar.f43777f = "";
            aVar.f43780i = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f43772a = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            aVar.f43773b = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 4:
                            aVar.f43774c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f43775d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f43776e = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            aVar.f43777f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f43778g = AtInfo.ADAPTER.decode(protoReader);
                            break;
                        case 9:
                            aVar.f43779h.add(AtInfo.ADAPTER.decode(protoReader));
                            break;
                        case 10:
                            aVar.f43780i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BoxData boxData) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, boxData.is_remind);
            if (boxData.rank_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, boxData.rank_time);
            }
            if (boxData.is_shortcut != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, boxData.is_shortcut);
            }
            if (boxData.unread_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, boxData.unread_count);
            }
            if (boxData.display_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, boxData.display_time);
            }
            if (boxData.localized_digest_message != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, boxData.localized_digest_message);
            }
            if (boxData.at_info != null) {
                AtInfo.ADAPTER.encodeWithTag(protoWriter, 8, boxData.at_info);
            }
            AtInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, boxData.at_infos);
            if (boxData.has_focus != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, boxData.has_focus);
            }
            protoWriter.writeBytes(boxData.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.BoxData$a */
    public static final class C17094a extends Message.Builder<BoxData, C17094a> {

        /* renamed from: a */
        public Boolean f43772a;

        /* renamed from: b */
        public Long f43773b;

        /* renamed from: c */
        public Boolean f43774c;

        /* renamed from: d */
        public Integer f43775d;

        /* renamed from: e */
        public Long f43776e;

        /* renamed from: f */
        public String f43777f;

        /* renamed from: g */
        public AtInfo f43778g;

        /* renamed from: h */
        public List<AtInfo> f43779h = Internal.newMutableList();

        /* renamed from: i */
        public Boolean f43780i;

        /* renamed from: a */
        public BoxData build() {
            Boolean bool = this.f43772a;
            if (bool != null) {
                return new BoxData(bool, this.f43773b, this.f43774c, this.f43775d, this.f43776e, this.f43777f, this.f43778g, this.f43779h, this.f43780i, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "is_remind");
        }
    }

    @Override // com.squareup.wire.Message
    public C17094a newBuilder() {
        C17094a aVar = new C17094a();
        aVar.f43772a = this.is_remind;
        aVar.f43773b = this.rank_time;
        aVar.f43774c = this.is_shortcut;
        aVar.f43775d = this.unread_count;
        aVar.f43776e = this.display_time;
        aVar.f43777f = this.localized_digest_message;
        aVar.f43778g = this.at_info;
        aVar.f43779h = Internal.copyOf("at_infos", this.at_infos);
        aVar.f43780i = this.has_focus;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "BoxData");
        StringBuilder sb = new StringBuilder();
        sb.append(", is_remind=");
        sb.append(this.is_remind);
        if (this.rank_time != null) {
            sb.append(", rank_time=");
            sb.append(this.rank_time);
        }
        if (this.is_shortcut != null) {
            sb.append(", is_shortcut=");
            sb.append(this.is_shortcut);
        }
        if (this.unread_count != null) {
            sb.append(", unread_count=");
            sb.append(this.unread_count);
        }
        if (this.display_time != null) {
            sb.append(", display_time=");
            sb.append(this.display_time);
        }
        if (this.localized_digest_message != null) {
            sb.append(", localized_digest_message=");
            sb.append(this.localized_digest_message);
        }
        if (this.at_info != null) {
            sb.append(", at_info=");
            sb.append(this.at_info);
        }
        if (!this.at_infos.isEmpty()) {
            sb.append(", at_infos=");
            sb.append(this.at_infos);
        }
        if (this.has_focus != null) {
            sb.append(", has_focus=");
            sb.append(this.has_focus);
        }
        StringBuilder replace = sb.replace(0, 2, "BoxData{");
        replace.append('}');
        return replace.toString();
    }

    public BoxData(Boolean bool, Long l, Boolean bool2, Integer num, Long l2, String str, AtInfo atInfo, List<AtInfo> list, Boolean bool3) {
        this(bool, l, bool2, num, l2, str, atInfo, list, bool3, ByteString.EMPTY);
    }

    public BoxData(Boolean bool, Long l, Boolean bool2, Integer num, Long l2, String str, AtInfo atInfo, List<AtInfo> list, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_remind = bool;
        this.rank_time = l;
        this.is_shortcut = bool2;
        this.unread_count = num;
        this.display_time = l2;
        this.localized_digest_message = str;
        this.at_info = atInfo;
        this.at_infos = Internal.immutableCopyOf("at_infos", list);
        this.has_focus = bool3;
    }
}
