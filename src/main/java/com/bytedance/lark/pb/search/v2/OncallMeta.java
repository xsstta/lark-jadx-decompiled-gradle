package com.bytedance.lark.pb.search.v2;

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

public final class OncallMeta extends Message<OncallMeta, C18999a> {
    public static final ProtoAdapter<OncallMeta> ADAPTER = new C19000b();
    public static final Boolean DEFAULT_IS_OFFICIAL = false;
    private static final long serialVersionUID = 0;
    public final String faq_identity;
    public final String faq_title;
    public final String id;
    public final Boolean is_official;
    public final List<Integer> tags;

    /* renamed from: com.bytedance.lark.pb.search.v2.OncallMeta$b */
    private static final class C19000b extends ProtoAdapter<OncallMeta> {
        C19000b() {
            super(FieldEncoding.LENGTH_DELIMITED, OncallMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(OncallMeta oncallMeta) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, oncallMeta.id) + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(2, oncallMeta.tags);
            int i3 = 0;
            if (oncallMeta.faq_identity != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(6, oncallMeta.faq_identity);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (oncallMeta.faq_title != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, oncallMeta.faq_title);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (oncallMeta.is_official != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(5, oncallMeta.is_official);
            }
            return i5 + i3 + oncallMeta.unknownFields().size();
        }

        /* renamed from: a */
        public OncallMeta decode(ProtoReader protoReader) throws IOException {
            C18999a aVar = new C18999a();
            aVar.f46989a = "";
            aVar.f46991c = "";
            aVar.f46992d = "";
            aVar.f46993e = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46989a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46990b.add(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 4) {
                    aVar.f46992d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 5) {
                    aVar.f46993e = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 6) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46991c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, OncallMeta oncallMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, oncallMeta.id);
            ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 2, oncallMeta.tags);
            if (oncallMeta.faq_identity != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, oncallMeta.faq_identity);
            }
            if (oncallMeta.faq_title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, oncallMeta.faq_title);
            }
            if (oncallMeta.is_official != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, oncallMeta.is_official);
            }
            protoWriter.writeBytes(oncallMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.OncallMeta$a */
    public static final class C18999a extends Message.Builder<OncallMeta, C18999a> {

        /* renamed from: a */
        public String f46989a;

        /* renamed from: b */
        public List<Integer> f46990b = Internal.newMutableList();

        /* renamed from: c */
        public String f46991c;

        /* renamed from: d */
        public String f46992d;

        /* renamed from: e */
        public Boolean f46993e;

        /* renamed from: a */
        public OncallMeta build() {
            String str = this.f46989a;
            if (str != null) {
                return new OncallMeta(str, this.f46990b, this.f46991c, this.f46992d, this.f46993e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C18999a newBuilder() {
        C18999a aVar = new C18999a();
        aVar.f46989a = this.id;
        aVar.f46990b = Internal.copyOf("tags", this.tags);
        aVar.f46991c = this.faq_identity;
        aVar.f46992d = this.faq_title;
        aVar.f46993e = this.is_official;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "OncallMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        if (this.faq_identity != null) {
            sb.append(", faq_identity=");
            sb.append(this.faq_identity);
        }
        if (this.faq_title != null) {
            sb.append(", faq_title=");
            sb.append(this.faq_title);
        }
        if (this.is_official != null) {
            sb.append(", is_official=");
            sb.append(this.is_official);
        }
        StringBuilder replace = sb.replace(0, 2, "OncallMeta{");
        replace.append('}');
        return replace.toString();
    }

    public OncallMeta(String str, List<Integer> list, String str2, String str3, Boolean bool) {
        this(str, list, str2, str3, bool, ByteString.EMPTY);
    }

    public OncallMeta(String str, List<Integer> list, String str2, String str3, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.tags = Internal.immutableCopyOf("tags", list);
        this.faq_identity = str2;
        this.faq_title = str3;
        this.is_official = bool;
    }
}
