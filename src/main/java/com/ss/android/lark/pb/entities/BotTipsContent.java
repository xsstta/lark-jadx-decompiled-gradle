package com.ss.android.lark.pb.entities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class BotTipsContent extends Message<BotTipsContent, C49646a> {
    public static final ProtoAdapter<BotTipsContent> ADAPTER = new C49647b();
    public static final Long DEFAULT_ADMIN_ID = 0L;
    public static final Long DEFAULT_VERSION = 0L;
    private static final long serialVersionUID = 0;
    public final Long madmin_id;
    public final Map<String, String> madmin_name;
    public final Map<String, String> mi18n_msg;
    public final Long mversion;

    /* renamed from: com.ss.android.lark.pb.entities.BotTipsContent$a */
    public static final class C49646a extends Message.Builder<BotTipsContent, C49646a> {

        /* renamed from: a */
        public Long f124317a;

        /* renamed from: b */
        public Map<String, String> f124318b = Internal.newMutableMap();

        /* renamed from: c */
        public Long f124319c;

        /* renamed from: d */
        public Map<String, String> f124320d = Internal.newMutableMap();

        /* renamed from: a */
        public BotTipsContent build() {
            return new BotTipsContent(this.f124317a, this.f124318b, this.f124319c, this.f124320d, super.buildUnknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.BotTipsContent$b */
    private static final class C49647b extends ProtoAdapter<BotTipsContent> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f124321a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, String>> f124322b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C49647b() {
            super(FieldEncoding.LENGTH_DELIMITED, BotTipsContent.class);
        }

        /* renamed from: a */
        public int encodedSize(BotTipsContent botTipsContent) {
            int i;
            int i2 = 0;
            if (botTipsContent.mversion != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, botTipsContent.mversion);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + this.f124321a.encodedSizeWithTag(2, botTipsContent.mi18n_msg);
            if (botTipsContent.madmin_id != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, botTipsContent.madmin_id);
            }
            return encodedSizeWithTag + i2 + this.f124322b.encodedSizeWithTag(4, botTipsContent.madmin_name) + botTipsContent.unknownFields().size();
        }

        /* renamed from: a */
        public BotTipsContent decode(ProtoReader protoReader) throws IOException {
            C49646a aVar = new C49646a();
            aVar.f124317a = 0L;
            aVar.f124319c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124317a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124318b.putAll(this.f124321a.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f124319c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124320d.putAll(this.f124322b.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BotTipsContent botTipsContent) throws IOException {
            if (botTipsContent.mversion != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, botTipsContent.mversion);
            }
            this.f124321a.encodeWithTag(protoWriter, 2, botTipsContent.mi18n_msg);
            if (botTipsContent.madmin_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, botTipsContent.madmin_id);
            }
            this.f124322b.encodeWithTag(protoWriter, 4, botTipsContent.madmin_name);
            protoWriter.writeBytes(botTipsContent.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49646a newBuilder() {
        C49646a aVar = new C49646a();
        aVar.f124317a = this.mversion;
        aVar.f124318b = Internal.copyOf("mi18n_msg", this.mi18n_msg);
        aVar.f124319c = this.madmin_id;
        aVar.f124320d = Internal.copyOf("madmin_name", this.madmin_name);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mversion != null) {
            sb.append(", version=");
            sb.append(this.mversion);
        }
        if (!this.mi18n_msg.isEmpty()) {
            sb.append(", i18n_msg=");
            sb.append(this.mi18n_msg);
        }
        if (this.madmin_id != null) {
            sb.append(", admin_id=");
            sb.append(this.madmin_id);
        }
        if (!this.madmin_name.isEmpty()) {
            sb.append(", admin_name=");
            sb.append(this.madmin_name);
        }
        StringBuilder replace = sb.replace(0, 2, "BotTipsContent{");
        replace.append('}');
        return replace.toString();
    }

    public BotTipsContent(Long l, Map<String, String> map, Long l2, Map<String, String> map2) {
        this(l, map, l2, map2, ByteString.EMPTY);
    }

    public BotTipsContent(Long l, Map<String, String> map, Long l2, Map<String, String> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mversion = l;
        this.mi18n_msg = Internal.immutableCopyOf("mi18n_msg", map);
        this.madmin_id = l2;
        this.madmin_name = Internal.immutableCopyOf("madmin_name", map2);
    }
}
