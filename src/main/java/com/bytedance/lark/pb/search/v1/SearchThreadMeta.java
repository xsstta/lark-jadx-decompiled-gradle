package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Channel;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class SearchThreadMeta extends Message<SearchThreadMeta, C18915a> {
    public static final ProtoAdapter<SearchThreadMeta> ADAPTER = new C18916b();
    public static final Boolean DEFAULT_IS_DELAYED = false;
    public static final Integer DEFAULT_NEW_MESSAGE_COUNT = 0;
    public static final Integer DEFAULT_NO_BADGED_NEW_MESSAGE_COUNT = 0;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final SearchAtInfo at_info;
    public final String avatar_key;
    public final String avatar_path;
    public final List<String> avatar_urls;
    public final Channel channel;
    public final String id;
    public final Boolean is_delayed;
    public final Integer new_message_count;
    public final Integer no_badged_new_message_count;
    public final String topic;
    public final Long update_time;

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchThreadMeta$b */
    private static final class C18916b extends ProtoAdapter<SearchThreadMeta> {
        C18916b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchThreadMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchThreadMeta searchThreadMeta) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, searchThreadMeta.id);
            int i9 = 0;
            if (searchThreadMeta.channel != null) {
                i = Channel.ADAPTER.encodedSizeWithTag(2, searchThreadMeta.channel);
            } else {
                i = 0;
            }
            int i10 = encodedSizeWithTag + i;
            if (searchThreadMeta.topic != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, searchThreadMeta.topic);
            } else {
                i2 = 0;
            }
            int i11 = i10 + i2;
            if (searchThreadMeta.new_message_count != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(5, searchThreadMeta.new_message_count);
            } else {
                i3 = 0;
            }
            int i12 = i11 + i3;
            if (searchThreadMeta.no_badged_new_message_count != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(6, searchThreadMeta.no_badged_new_message_count);
            } else {
                i4 = 0;
            }
            int i13 = i12 + i4;
            if (searchThreadMeta.avatar_key != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(7, searchThreadMeta.avatar_key);
            } else {
                i5 = 0;
            }
            int i14 = i13 + i5;
            if (searchThreadMeta.is_delayed != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(8, searchThreadMeta.is_delayed);
            } else {
                i6 = 0;
            }
            int i15 = i14 + i6;
            if (searchThreadMeta.update_time != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(9, searchThreadMeta.update_time);
            } else {
                i7 = 0;
            }
            int i16 = i15 + i7;
            if (searchThreadMeta.avatar_path != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(10, searchThreadMeta.avatar_path);
            } else {
                i8 = 0;
            }
            int encodedSizeWithTag2 = i16 + i8 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(11, searchThreadMeta.avatar_urls);
            if (searchThreadMeta.at_info != null) {
                i9 = SearchAtInfo.ADAPTER.encodedSizeWithTag(12, searchThreadMeta.at_info);
            }
            return encodedSizeWithTag2 + i9 + searchThreadMeta.unknownFields().size();
        }

        /* renamed from: a */
        public SearchThreadMeta decode(ProtoReader protoReader) throws IOException {
            C18915a aVar = new C18915a();
            aVar.f46784a = "";
            aVar.f46786c = "";
            aVar.f46787d = 0;
            aVar.f46788e = 0;
            aVar.f46789f = "";
            aVar.f46790g = false;
            aVar.f46791h = 0L;
            aVar.f46792i = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f46784a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f46785b = Channel.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 4:
                            aVar.f46786c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f46787d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f46788e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            aVar.f46789f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f46790g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f46791h = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 10:
                            aVar.f46792i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f46793j.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f46794k = SearchAtInfo.ADAPTER.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SearchThreadMeta searchThreadMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchThreadMeta.id);
            if (searchThreadMeta.channel != null) {
                Channel.ADAPTER.encodeWithTag(protoWriter, 2, searchThreadMeta.channel);
            }
            if (searchThreadMeta.topic != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, searchThreadMeta.topic);
            }
            if (searchThreadMeta.new_message_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, searchThreadMeta.new_message_count);
            }
            if (searchThreadMeta.no_badged_new_message_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, searchThreadMeta.no_badged_new_message_count);
            }
            if (searchThreadMeta.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, searchThreadMeta.avatar_key);
            }
            if (searchThreadMeta.is_delayed != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, searchThreadMeta.is_delayed);
            }
            if (searchThreadMeta.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 9, searchThreadMeta.update_time);
            }
            if (searchThreadMeta.avatar_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, searchThreadMeta.avatar_path);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 11, searchThreadMeta.avatar_urls);
            if (searchThreadMeta.at_info != null) {
                SearchAtInfo.ADAPTER.encodeWithTag(protoWriter, 12, searchThreadMeta.at_info);
            }
            protoWriter.writeBytes(searchThreadMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchThreadMeta$a */
    public static final class C18915a extends Message.Builder<SearchThreadMeta, C18915a> {

        /* renamed from: a */
        public String f46784a;

        /* renamed from: b */
        public Channel f46785b;

        /* renamed from: c */
        public String f46786c;

        /* renamed from: d */
        public Integer f46787d;

        /* renamed from: e */
        public Integer f46788e;

        /* renamed from: f */
        public String f46789f;

        /* renamed from: g */
        public Boolean f46790g;

        /* renamed from: h */
        public Long f46791h;

        /* renamed from: i */
        public String f46792i;

        /* renamed from: j */
        public List<String> f46793j = Internal.newMutableList();

        /* renamed from: k */
        public SearchAtInfo f46794k;

        /* renamed from: a */
        public SearchThreadMeta build() {
            String str = this.f46784a;
            if (str != null) {
                return new SearchThreadMeta(str, this.f46785b, this.f46786c, this.f46787d, this.f46788e, this.f46789f, this.f46790g, this.f46791h, this.f46792i, this.f46793j, this.f46794k, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C18915a newBuilder() {
        C18915a aVar = new C18915a();
        aVar.f46784a = this.id;
        aVar.f46785b = this.channel;
        aVar.f46786c = this.topic;
        aVar.f46787d = this.new_message_count;
        aVar.f46788e = this.no_badged_new_message_count;
        aVar.f46789f = this.avatar_key;
        aVar.f46790g = this.is_delayed;
        aVar.f46791h = this.update_time;
        aVar.f46792i = this.avatar_path;
        aVar.f46793j = Internal.copyOf("avatar_urls", this.avatar_urls);
        aVar.f46794k = this.at_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SearchThreadMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.channel != null) {
            sb.append(", channel=");
            sb.append(this.channel);
        }
        if (this.topic != null) {
            sb.append(", topic=");
            sb.append(this.topic);
        }
        if (this.new_message_count != null) {
            sb.append(", new_message_count=");
            sb.append(this.new_message_count);
        }
        if (this.no_badged_new_message_count != null) {
            sb.append(", no_badged_new_message_count=");
            sb.append(this.no_badged_new_message_count);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.is_delayed != null) {
            sb.append(", is_delayed=");
            sb.append(this.is_delayed);
        }
        if (this.update_time != null) {
            sb.append(", update_time=");
            sb.append(this.update_time);
        }
        if (this.avatar_path != null) {
            sb.append(", avatar_path=");
            sb.append(this.avatar_path);
        }
        if (!this.avatar_urls.isEmpty()) {
            sb.append(", avatar_urls=");
            sb.append(this.avatar_urls);
        }
        if (this.at_info != null) {
            sb.append(", at_info=");
            sb.append(this.at_info);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchThreadMeta{");
        replace.append('}');
        return replace.toString();
    }

    public SearchThreadMeta(String str, Channel channel2, String str2, Integer num, Integer num2, String str3, Boolean bool, Long l, String str4, List<String> list, SearchAtInfo searchAtInfo) {
        this(str, channel2, str2, num, num2, str3, bool, l, str4, list, searchAtInfo, ByteString.EMPTY);
    }

    public SearchThreadMeta(String str, Channel channel2, String str2, Integer num, Integer num2, String str3, Boolean bool, Long l, String str4, List<String> list, SearchAtInfo searchAtInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.channel = channel2;
        this.topic = str2;
        this.new_message_count = num;
        this.no_badged_new_message_count = num2;
        this.avatar_key = str3;
        this.is_delayed = bool;
        this.update_time = l;
        this.avatar_path = str4;
        this.avatar_urls = Internal.immutableCopyOf("avatar_urls", list);
        this.at_info = searchAtInfo;
    }
}
