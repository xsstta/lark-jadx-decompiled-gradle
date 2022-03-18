package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class FilterPushInfo extends Message<FilterPushInfo, C17136a> {
    public static final ProtoAdapter<FilterPushInfo> ADAPTER = new C17137b();
    public static final Integer DEFAULT_MUTE_UNREAD = 0;
    public static final Integer DEFAULT_UNREAD = 0;
    private static final long serialVersionUID = 0;
    public final Integer mute_unread;
    public final Integer unread;

    /* renamed from: com.bytedance.lark.pb.feed.v1.FilterPushInfo$b */
    private static final class C17137b extends ProtoAdapter<FilterPushInfo> {
        C17137b() {
            super(FieldEncoding.LENGTH_DELIMITED, FilterPushInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(FilterPushInfo filterPushInfo) {
            int i;
            int i2 = 0;
            if (filterPushInfo.unread != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, filterPushInfo.unread);
            } else {
                i = 0;
            }
            if (filterPushInfo.mute_unread != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, filterPushInfo.mute_unread);
            }
            return i + i2 + filterPushInfo.unknownFields().size();
        }

        /* renamed from: a */
        public FilterPushInfo decode(ProtoReader protoReader) throws IOException {
            C17136a aVar = new C17136a();
            aVar.f43884a = 0;
            aVar.f43885b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43884a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43885b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FilterPushInfo filterPushInfo) throws IOException {
            if (filterPushInfo.unread != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, filterPushInfo.unread);
            }
            if (filterPushInfo.mute_unread != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, filterPushInfo.mute_unread);
            }
            protoWriter.writeBytes(filterPushInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.FilterPushInfo$a */
    public static final class C17136a extends Message.Builder<FilterPushInfo, C17136a> {

        /* renamed from: a */
        public Integer f43884a;

        /* renamed from: b */
        public Integer f43885b;

        /* renamed from: a */
        public FilterPushInfo build() {
            return new FilterPushInfo(this.f43884a, this.f43885b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17136a newBuilder() {
        C17136a aVar = new C17136a();
        aVar.f43884a = this.unread;
        aVar.f43885b = this.mute_unread;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "FilterPushInfo");
        StringBuilder sb = new StringBuilder();
        if (this.unread != null) {
            sb.append(", unread=");
            sb.append(this.unread);
        }
        if (this.mute_unread != null) {
            sb.append(", mute_unread=");
            sb.append(this.mute_unread);
        }
        StringBuilder replace = sb.replace(0, 2, "FilterPushInfo{");
        replace.append('}');
        return replace.toString();
    }

    public FilterPushInfo(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public FilterPushInfo(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.unread = num;
        this.mute_unread = num2;
    }
}
