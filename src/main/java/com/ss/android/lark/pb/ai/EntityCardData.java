package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class EntityCardData extends Message<EntityCardData, C49447a> {
    public static final ProtoAdapter<EntityCardData> ADAPTER = new C49448b();
    private static final long serialVersionUID = 0;
    public final String mcard;
    public final CardType mcard_type;
    public final String mid;
    public final String mkey;
    public final String mtemplate_name;

    /* renamed from: com.ss.android.lark.pb.ai.EntityCardData$b */
    private static final class C49448b extends ProtoAdapter<EntityCardData> {
        C49448b() {
            super(FieldEncoding.LENGTH_DELIMITED, EntityCardData.class);
        }

        /* renamed from: a */
        public int encodedSize(EntityCardData entityCardData) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, entityCardData.mcard) + ProtoAdapter.STRING.encodedSizeWithTag(2, entityCardData.mid) + ProtoAdapter.STRING.encodedSizeWithTag(3, entityCardData.mkey);
            int i2 = 0;
            if (entityCardData.mcard_type != null) {
                i = CardType.ADAPTER.encodedSizeWithTag(4, entityCardData.mcard_type);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (entityCardData.mtemplate_name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(100, entityCardData.mtemplate_name);
            }
            return i3 + i2 + entityCardData.unknownFields().size();
        }

        /* renamed from: a */
        public EntityCardData decode(ProtoReader protoReader) throws IOException {
            C49447a aVar = new C49447a();
            aVar.f124021a = "";
            aVar.f124022b = "";
            aVar.f124023c = "";
            aVar.f124025e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124021a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124022b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f124023c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    try {
                        aVar.f124024d = CardType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 100) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124025e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EntityCardData entityCardData) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, entityCardData.mcard);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, entityCardData.mid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, entityCardData.mkey);
            if (entityCardData.mcard_type != null) {
                CardType.ADAPTER.encodeWithTag(protoWriter, 4, entityCardData.mcard_type);
            }
            if (entityCardData.mtemplate_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 100, entityCardData.mtemplate_name);
            }
            protoWriter.writeBytes(entityCardData.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.EntityCardData$a */
    public static final class C49447a extends Message.Builder<EntityCardData, C49447a> {

        /* renamed from: a */
        public String f124021a;

        /* renamed from: b */
        public String f124022b;

        /* renamed from: c */
        public String f124023c;

        /* renamed from: d */
        public CardType f124024d;

        /* renamed from: e */
        public String f124025e;

        /* renamed from: a */
        public EntityCardData build() {
            String str;
            String str2;
            String str3 = this.f124021a;
            if (str3 != null && (str = this.f124022b) != null && (str2 = this.f124023c) != null) {
                return new EntityCardData(str3, str, str2, this.f124024d, this.f124025e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str3, "mcard", this.f124022b, "mid", this.f124023c, "mkey");
        }
    }

    @Override // com.squareup.wire.Message
    public C49447a newBuilder() {
        C49447a aVar = new C49447a();
        aVar.f124021a = this.mcard;
        aVar.f124022b = this.mid;
        aVar.f124023c = this.mkey;
        aVar.f124024d = this.mcard_type;
        aVar.f124025e = this.mtemplate_name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", card=");
        sb.append(this.mcard);
        sb.append(", id=");
        sb.append(this.mid);
        sb.append(", key=");
        sb.append(this.mkey);
        if (this.mcard_type != null) {
            sb.append(", card_type=");
            sb.append(this.mcard_type);
        }
        if (this.mtemplate_name != null) {
            sb.append(", template_name=");
            sb.append(this.mtemplate_name);
        }
        StringBuilder replace = sb.replace(0, 2, "EntityCardData{");
        replace.append('}');
        return replace.toString();
    }

    public EntityCardData(String str, String str2, String str3, CardType cardType, String str4) {
        this(str, str2, str3, cardType, str4, ByteString.EMPTY);
    }

    public EntityCardData(String str, String str2, String str3, CardType cardType, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mcard = str;
        this.mid = str2;
        this.mkey = str3;
        this.mcard_type = cardType;
        this.mtemplate_name = str4;
    }
}
