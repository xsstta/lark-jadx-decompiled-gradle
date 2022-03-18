package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ExternalSearch extends Message<ExternalSearch, C14937a> {
    public static final ProtoAdapter<ExternalSearch> ADAPTER = new C14938b();
    private static final long serialVersionUID = 0;
    public final String icon_url;
    public final String id;
    public final String title;

    /* renamed from: com.bytedance.lark.pb.basic.v1.ExternalSearch$b */
    private static final class C14938b extends ProtoAdapter<ExternalSearch> {
        C14938b() {
            super(FieldEncoding.LENGTH_DELIMITED, ExternalSearch.class);
        }

        /* renamed from: a */
        public int encodedSize(ExternalSearch externalSearch) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, externalSearch.id);
            int i2 = 0;
            if (externalSearch.title != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, externalSearch.title);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (externalSearch.icon_url != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, externalSearch.icon_url);
            }
            return i3 + i2 + externalSearch.unknownFields().size();
        }

        /* renamed from: a */
        public ExternalSearch decode(ProtoReader protoReader) throws IOException {
            C14937a aVar = new C14937a();
            aVar.f39579a = "";
            aVar.f39580b = "";
            aVar.f39581c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39579a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f39580b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39581c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ExternalSearch externalSearch) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, externalSearch.id);
            if (externalSearch.title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, externalSearch.title);
            }
            if (externalSearch.icon_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, externalSearch.icon_url);
            }
            protoWriter.writeBytes(externalSearch.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14937a newBuilder() {
        C14937a aVar = new C14937a();
        aVar.f39579a = this.id;
        aVar.f39580b = this.title;
        aVar.f39581c = this.icon_url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.ExternalSearch$a */
    public static final class C14937a extends Message.Builder<ExternalSearch, C14937a> {

        /* renamed from: a */
        public String f39579a;

        /* renamed from: b */
        public String f39580b;

        /* renamed from: c */
        public String f39581c;

        /* renamed from: a */
        public ExternalSearch build() {
            String str = this.f39579a;
            if (str != null) {
                return new ExternalSearch(str, this.f39580b, this.f39581c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "ExternalSearch");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.icon_url != null) {
            sb.append(", icon_url=");
            sb.append(this.icon_url);
        }
        StringBuilder replace = sb.replace(0, 2, "ExternalSearch{");
        replace.append('}');
        return replace.toString();
    }

    public ExternalSearch(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public ExternalSearch(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.title = str2;
        this.icon_url = str3;
    }
}
