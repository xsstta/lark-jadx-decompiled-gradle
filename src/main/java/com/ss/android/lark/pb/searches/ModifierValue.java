package com.ss.android.lark.pb.searches;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.searches.SearchResult;
import java.io.IOException;
import okio.ByteString;

public final class ModifierValue extends Message<ModifierValue, C50024a> {
    public static final ProtoAdapter<ModifierValue> ADAPTER = new C50025b();
    private static final long serialVersionUID = 0;
    public final SearchResult.Type mentity;
    public final String mquery;
    public final String mvalue;

    /* renamed from: com.ss.android.lark.pb.searches.ModifierValue$b */
    private static final class C50025b extends ProtoAdapter<ModifierValue> {
        C50025b() {
            super(FieldEncoding.LENGTH_DELIMITED, ModifierValue.class);
        }

        /* renamed from: a */
        public int encodedSize(ModifierValue modifierValue) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, modifierValue.mvalue);
            int i2 = 0;
            if (modifierValue.mquery != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, modifierValue.mquery);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (modifierValue.mentity != null) {
                i2 = SearchResult.Type.ADAPTER.encodedSizeWithTag(3, modifierValue.mentity);
            }
            return i3 + i2 + modifierValue.unknownFields().size();
        }

        /* renamed from: a */
        public ModifierValue decode(ProtoReader protoReader) throws IOException {
            C50024a aVar = new C50024a();
            aVar.f125120a = "";
            aVar.f125121b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125120a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125121b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f125122c = SearchResult.Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ModifierValue modifierValue) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, modifierValue.mvalue);
            if (modifierValue.mquery != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, modifierValue.mquery);
            }
            if (modifierValue.mentity != null) {
                SearchResult.Type.ADAPTER.encodeWithTag(protoWriter, 3, modifierValue.mentity);
            }
            protoWriter.writeBytes(modifierValue.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50024a newBuilder() {
        C50024a aVar = new C50024a();
        aVar.f125120a = this.mvalue;
        aVar.f125121b = this.mquery;
        aVar.f125122c = this.mentity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.searches.ModifierValue$a */
    public static final class C50024a extends Message.Builder<ModifierValue, C50024a> {

        /* renamed from: a */
        public String f125120a;

        /* renamed from: b */
        public String f125121b;

        /* renamed from: c */
        public SearchResult.Type f125122c;

        /* renamed from: a */
        public ModifierValue build() {
            String str = this.f125120a;
            if (str != null) {
                return new ModifierValue(str, this.f125121b, this.f125122c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mvalue");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", value=");
        sb.append(this.mvalue);
        if (this.mquery != null) {
            sb.append(", query=");
            sb.append(this.mquery);
        }
        if (this.mentity != null) {
            sb.append(", entity=");
            sb.append(this.mentity);
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
        this.mvalue = str;
        this.mquery = str2;
        this.mentity = type;
    }
}
