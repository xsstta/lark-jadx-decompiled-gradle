package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class Archive extends Message<Archive, C17290a> {
    public static final ProtoAdapter<Archive> ADAPTER = new C17291b();
    public static final Long DEFAULT_SIZE = 0L;
    private static final long serialVersionUID = 0;
    public final String checksum;
    public final String key;
    public final String mime;
    public final Map<String, String> params;
    public final Long size;
    public final List<String> urls;

    /* renamed from: com.bytedance.lark.pb.im.v1.Archive$a */
    public static final class C17290a extends Message.Builder<Archive, C17290a> {

        /* renamed from: a */
        public String f44128a;

        /* renamed from: b */
        public List<String> f44129b = Internal.newMutableList();

        /* renamed from: c */
        public Long f44130c;

        /* renamed from: d */
        public String f44131d;

        /* renamed from: e */
        public String f44132e;

        /* renamed from: f */
        public Map<String, String> f44133f = Internal.newMutableMap();

        /* renamed from: a */
        public Archive build() {
            return new Archive(this.f44128a, this.f44129b, this.f44130c, this.f44131d, this.f44132e, this.f44133f, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.Archive$b */
    private static final class C17291b extends ProtoAdapter<Archive> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f44134a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C17291b() {
            super(FieldEncoding.LENGTH_DELIMITED, Archive.class);
        }

        /* renamed from: a */
        public int encodedSize(Archive archive) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (archive.key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, archive.key);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, archive.urls);
            if (archive.size != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, archive.size);
            } else {
                i2 = 0;
            }
            int i5 = encodedSizeWithTag + i2;
            if (archive.checksum != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, archive.checksum);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (archive.mime != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, archive.mime);
            }
            return i6 + i4 + this.f44134a.encodedSizeWithTag(6, archive.params) + archive.unknownFields().size();
        }

        /* renamed from: a */
        public Archive decode(ProtoReader protoReader) throws IOException {
            C17290a aVar = new C17290a();
            aVar.f44128a = "";
            aVar.f44130c = 0L;
            aVar.f44131d = "";
            aVar.f44132e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f44128a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f44129b.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            aVar.f44130c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f44131d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f44132e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f44133f.putAll(this.f44134a.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, Archive archive) throws IOException {
            if (archive.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, archive.key);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, archive.urls);
            if (archive.size != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, archive.size);
            }
            if (archive.checksum != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, archive.checksum);
            }
            if (archive.mime != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, archive.mime);
            }
            this.f44134a.encodeWithTag(protoWriter, 6, archive.params);
            protoWriter.writeBytes(archive.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17290a newBuilder() {
        C17290a aVar = new C17290a();
        aVar.f44128a = this.key;
        aVar.f44129b = Internal.copyOf("urls", this.urls);
        aVar.f44130c = this.size;
        aVar.f44131d = this.checksum;
        aVar.f44132e = this.mime;
        aVar.f44133f = Internal.copyOf("params", this.params);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "Archive");
        StringBuilder sb = new StringBuilder();
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (!this.urls.isEmpty()) {
            sb.append(", urls=");
            sb.append(this.urls);
        }
        if (this.size != null) {
            sb.append(", size=");
            sb.append(this.size);
        }
        if (this.checksum != null) {
            sb.append(", checksum=");
            sb.append(this.checksum);
        }
        if (this.mime != null) {
            sb.append(", mime=");
            sb.append(this.mime);
        }
        if (!this.params.isEmpty()) {
            sb.append(", params=");
            sb.append(this.params);
        }
        StringBuilder replace = sb.replace(0, 2, "Archive{");
        replace.append('}');
        return replace.toString();
    }

    public Archive(String str, List<String> list, Long l, String str2, String str3, Map<String, String> map) {
        this(str, list, l, str2, str3, map, ByteString.EMPTY);
    }

    public Archive(String str, List<String> list, Long l, String str2, String str3, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.urls = Internal.immutableCopyOf("urls", list);
        this.size = l;
        this.checksum = str2;
        this.mime = str3;
        this.params = Internal.immutableCopyOf("params", map);
    }
}
