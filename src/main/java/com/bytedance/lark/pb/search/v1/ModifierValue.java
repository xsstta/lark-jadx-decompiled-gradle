package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.search.v1.SearchResult;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ModifierValue extends Message<ModifierValue, C18845a> {
    public static final ProtoAdapter<ModifierValue> ADAPTER = new C18846b();
    public static final SearchResult.Type DEFAULT_ENTITY = SearchResult.Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final SearchResult.Type entity;
    public final String query;
    public final String value;

    /* renamed from: com.bytedance.lark.pb.search.v1.ModifierValue$b */
    private static final class C18846b extends ProtoAdapter<ModifierValue> {
        C18846b() {
            super(FieldEncoding.LENGTH_DELIMITED, ModifierValue.class);
        }

        /* renamed from: a */
        public int encodedSize(ModifierValue modifierValue) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, modifierValue.value);
            int i2 = 0;
            if (modifierValue.query != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, modifierValue.query);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (modifierValue.entity != null) {
                i2 = SearchResult.Type.ADAPTER.encodedSizeWithTag(3, modifierValue.entity);
            }
            return i3 + i2 + modifierValue.unknownFields().size();
        }

        /* renamed from: a */
        public ModifierValue decode(ProtoReader protoReader) throws IOException {
            C18845a aVar = new C18845a();
            aVar.f46524a = "";
            aVar.f46525b = "";
            aVar.f46526c = SearchResult.Type.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46524a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46525b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f46526c = SearchResult.Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ModifierValue modifierValue) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, modifierValue.value);
            if (modifierValue.query != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, modifierValue.query);
            }
            if (modifierValue.entity != null) {
                SearchResult.Type.ADAPTER.encodeWithTag(protoWriter, 3, modifierValue.entity);
            }
            protoWriter.writeBytes(modifierValue.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18845a newBuilder() {
        C18845a aVar = new C18845a();
        aVar.f46524a = this.value;
        aVar.f46525b = this.query;
        aVar.f46526c = this.entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.ModifierValue$a */
    public static final class C18845a extends Message.Builder<ModifierValue, C18845a> {

        /* renamed from: a */
        public String f46524a;

        /* renamed from: b */
        public String f46525b;

        /* renamed from: c */
        public SearchResult.Type f46526c;

        /* renamed from: a */
        public ModifierValue build() {
            String str = this.f46524a;
            if (str != null) {
                return new ModifierValue(str, this.f46525b, this.f46526c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "value");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "ModifierValue");
        StringBuilder sb = new StringBuilder();
        sb.append(", value=");
        sb.append(this.value);
        if (this.query != null) {
            sb.append(", query=");
            sb.append(this.query);
        }
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        StringBuilder replace = sb.replace(0, 2, "ModifierValue{");
        replace.append('}');
        return replace.toString();
    }

    public ModifierValue(String str, String str2, SearchResult.Type type) {
        this(str, str2, type, ByteString.EMPTY);
    }

    public ModifierValue(String str, String str2, SearchResult.Type type, ByteString byteString) {
        super(ADAPTER, byteString);
        this.value = str;
        this.query = str2;
        this.entity = type;
    }
}
