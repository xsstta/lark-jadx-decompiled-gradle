package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.search.v1.SearchAtInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SimpleP2PChatInfo extends Message<SimpleP2PChatInfo, C19029a> {
    public static final ProtoAdapter<SimpleP2PChatInfo> ADAPTER = new C19030b();
    public static final Boolean DEFAULT_IS_REMIND = false;
    public static final Integer DEFAULT_LAST_MESSAGE_POSITION = 0;
    public static final Integer DEFAULT_LAST_MESSAGE_POSITION_BADGE_COUNT = 0;
    public static final Integer DEFAULT_READ_POSITION = 0;
    public static final Integer DEFAULT_READ_POSITION_BADGE_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final SearchAtInfo at_info;
    public final String chat_id;
    public final Boolean is_remind;
    public final String last_message_id;
    public final Integer last_message_position;
    public final Integer last_message_position_badge_count;
    public final Integer read_position;
    public final Integer read_position_badge_count;

    /* renamed from: com.bytedance.lark.pb.search.v2.SimpleP2PChatInfo$b */
    private static final class C19030b extends ProtoAdapter<SimpleP2PChatInfo> {
        C19030b() {
            super(FieldEncoding.LENGTH_DELIMITED, SimpleP2PChatInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(SimpleP2PChatInfo simpleP2PChatInfo) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = 0;
            if (simpleP2PChatInfo.chat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, simpleP2PChatInfo.chat_id);
            } else {
                i = 0;
            }
            if (simpleP2PChatInfo.read_position != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, simpleP2PChatInfo.read_position);
            } else {
                i2 = 0;
            }
            int i9 = i + i2;
            if (simpleP2PChatInfo.read_position_badge_count != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, simpleP2PChatInfo.read_position_badge_count);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (simpleP2PChatInfo.last_message_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, simpleP2PChatInfo.last_message_id);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (simpleP2PChatInfo.last_message_position != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(5, simpleP2PChatInfo.last_message_position);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (simpleP2PChatInfo.last_message_position_badge_count != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(6, simpleP2PChatInfo.last_message_position_badge_count);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (simpleP2PChatInfo.at_info != null) {
                i7 = SearchAtInfo.ADAPTER.encodedSizeWithTag(7, simpleP2PChatInfo.at_info);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (simpleP2PChatInfo.is_remind != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(8, simpleP2PChatInfo.is_remind);
            }
            return i14 + i8 + simpleP2PChatInfo.unknownFields().size();
        }

        /* renamed from: a */
        public SimpleP2PChatInfo decode(ProtoReader protoReader) throws IOException {
            C19029a aVar = new C19029a();
            aVar.f47080a = "";
            aVar.f47081b = 0;
            aVar.f47082c = 0;
            aVar.f47083d = "";
            aVar.f47084e = 0;
            aVar.f47085f = 0;
            aVar.f47087h = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f47080a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f47081b = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            aVar.f47082c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f47083d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f47084e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f47085f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            aVar.f47086g = SearchAtInfo.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f47087h = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, SimpleP2PChatInfo simpleP2PChatInfo) throws IOException {
            if (simpleP2PChatInfo.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, simpleP2PChatInfo.chat_id);
            }
            if (simpleP2PChatInfo.read_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, simpleP2PChatInfo.read_position);
            }
            if (simpleP2PChatInfo.read_position_badge_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, simpleP2PChatInfo.read_position_badge_count);
            }
            if (simpleP2PChatInfo.last_message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, simpleP2PChatInfo.last_message_id);
            }
            if (simpleP2PChatInfo.last_message_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, simpleP2PChatInfo.last_message_position);
            }
            if (simpleP2PChatInfo.last_message_position_badge_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, simpleP2PChatInfo.last_message_position_badge_count);
            }
            if (simpleP2PChatInfo.at_info != null) {
                SearchAtInfo.ADAPTER.encodeWithTag(protoWriter, 7, simpleP2PChatInfo.at_info);
            }
            if (simpleP2PChatInfo.is_remind != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, simpleP2PChatInfo.is_remind);
            }
            protoWriter.writeBytes(simpleP2PChatInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.SimpleP2PChatInfo$a */
    public static final class C19029a extends Message.Builder<SimpleP2PChatInfo, C19029a> {

        /* renamed from: a */
        public String f47080a;

        /* renamed from: b */
        public Integer f47081b;

        /* renamed from: c */
        public Integer f47082c;

        /* renamed from: d */
        public String f47083d;

        /* renamed from: e */
        public Integer f47084e;

        /* renamed from: f */
        public Integer f47085f;

        /* renamed from: g */
        public SearchAtInfo f47086g;

        /* renamed from: h */
        public Boolean f47087h;

        /* renamed from: a */
        public SimpleP2PChatInfo build() {
            return new SimpleP2PChatInfo(this.f47080a, this.f47081b, this.f47082c, this.f47083d, this.f47084e, this.f47085f, this.f47086g, this.f47087h, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19029a newBuilder() {
        C19029a aVar = new C19029a();
        aVar.f47080a = this.chat_id;
        aVar.f47081b = this.read_position;
        aVar.f47082c = this.read_position_badge_count;
        aVar.f47083d = this.last_message_id;
        aVar.f47084e = this.last_message_position;
        aVar.f47085f = this.last_message_position_badge_count;
        aVar.f47086g = this.at_info;
        aVar.f47087h = this.is_remind;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SimpleP2PChatInfo");
        StringBuilder sb = new StringBuilder();
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.read_position != null) {
            sb.append(", read_position=");
            sb.append(this.read_position);
        }
        if (this.read_position_badge_count != null) {
            sb.append(", read_position_badge_count=");
            sb.append(this.read_position_badge_count);
        }
        if (this.last_message_id != null) {
            sb.append(", last_message_id=");
            sb.append(this.last_message_id);
        }
        if (this.last_message_position != null) {
            sb.append(", last_message_position=");
            sb.append(this.last_message_position);
        }
        if (this.last_message_position_badge_count != null) {
            sb.append(", last_message_position_badge_count=");
            sb.append(this.last_message_position_badge_count);
        }
        if (this.at_info != null) {
            sb.append(", at_info=");
            sb.append(this.at_info);
        }
        if (this.is_remind != null) {
            sb.append(", is_remind=");
            sb.append(this.is_remind);
        }
        StringBuilder replace = sb.replace(0, 2, "SimpleP2PChatInfo{");
        replace.append('}');
        return replace.toString();
    }

    public SimpleP2PChatInfo(String str, Integer num, Integer num2, String str2, Integer num3, Integer num4, SearchAtInfo searchAtInfo, Boolean bool) {
        this(str, num, num2, str2, num3, num4, searchAtInfo, bool, ByteString.EMPTY);
    }

    public SimpleP2PChatInfo(String str, Integer num, Integer num2, String str2, Integer num3, Integer num4, SearchAtInfo searchAtInfo, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.read_position = num;
        this.read_position_badge_count = num2;
        this.last_message_id = str2;
        this.last_message_position = num3;
        this.last_message_position_badge_count = num4;
        this.at_info = searchAtInfo;
        this.is_remind = bool;
    }
}
