package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class LevelContent extends Message<LevelContent, C15832a> {
    public static final ProtoAdapter<LevelContent> ADAPTER = new C15833b();
    private static final long serialVersionUID = 0;
    public final String level_id;
    public final String name;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.LevelContent$b */
    private static final class C15833b extends ProtoAdapter<LevelContent> {
        C15833b() {
            super(FieldEncoding.LENGTH_DELIMITED, LevelContent.class);
        }

        /* renamed from: a */
        public int encodedSize(LevelContent levelContent) {
            int i;
            int i2 = 0;
            if (levelContent.name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, levelContent.name);
            } else {
                i = 0;
            }
            if (levelContent.level_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, levelContent.level_id);
            }
            return i + i2 + levelContent.unknownFields().size();
        }

        /* renamed from: a */
        public LevelContent decode(ProtoReader protoReader) throws IOException {
            C15832a aVar = new C15832a();
            aVar.f41638a = "";
            aVar.f41639b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41638a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41639b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, LevelContent levelContent) throws IOException {
            if (levelContent.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, levelContent.name);
            }
            if (levelContent.level_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, levelContent.level_id);
            }
            protoWriter.writeBytes(levelContent.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.LevelContent$a */
    public static final class C15832a extends Message.Builder<LevelContent, C15832a> {

        /* renamed from: a */
        public String f41638a;

        /* renamed from: b */
        public String f41639b;

        /* renamed from: a */
        public LevelContent build() {
            return new LevelContent(this.f41638a, this.f41639b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15832a newBuilder() {
        C15832a aVar = new C15832a();
        aVar.f41638a = this.name;
        aVar.f41639b = this.level_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "LevelContent");
        StringBuilder sb = new StringBuilder();
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.level_id != null) {
            sb.append(", level_id=");
            sb.append(this.level_id);
        }
        StringBuilder replace = sb.replace(0, 2, "LevelContent{");
        replace.append('}');
        return replace.toString();
    }

    public LevelContent(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public LevelContent(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.level_id = str2;
    }
}
