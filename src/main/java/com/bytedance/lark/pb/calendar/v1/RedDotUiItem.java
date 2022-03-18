package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class RedDotUiItem extends Message<RedDotUiItem, C15974a> {
    public static final ProtoAdapter<RedDotUiItem> ADAPTER = new C15975b();
    public static final Integer DEFAULT_ID = 0;
    private static final long serialVersionUID = 0;
    public final Integer id;
    public final String name;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.RedDotUiItem$b */
    private static final class C15975b extends ProtoAdapter<RedDotUiItem> {
        C15975b() {
            super(FieldEncoding.LENGTH_DELIMITED, RedDotUiItem.class);
        }

        /* renamed from: a */
        public int encodedSize(RedDotUiItem redDotUiItem) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, redDotUiItem.name) + ProtoAdapter.INT32.encodedSizeWithTag(2, redDotUiItem.id) + redDotUiItem.unknownFields().size();
        }

        /* renamed from: a */
        public RedDotUiItem decode(ProtoReader protoReader) throws IOException {
            C15974a aVar = new C15974a();
            aVar.f41973a = "";
            aVar.f41974b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41973a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41974b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RedDotUiItem redDotUiItem) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, redDotUiItem.name);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, redDotUiItem.id);
            protoWriter.writeBytes(redDotUiItem.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15974a newBuilder() {
        C15974a aVar = new C15974a();
        aVar.f41973a = this.name;
        aVar.f41974b = this.id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.RedDotUiItem$a */
    public static final class C15974a extends Message.Builder<RedDotUiItem, C15974a> {

        /* renamed from: a */
        public String f41973a;

        /* renamed from: b */
        public Integer f41974b;

        /* renamed from: a */
        public RedDotUiItem build() {
            Integer num;
            String str = this.f41973a;
            if (str != null && (num = this.f41974b) != null) {
                return new RedDotUiItem(str, num, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "name", this.f41974b, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "RedDotUiItem");
        StringBuilder sb = new StringBuilder();
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", id=");
        sb.append(this.id);
        StringBuilder replace = sb.replace(0, 2, "RedDotUiItem{");
        replace.append('}');
        return replace.toString();
    }

    public RedDotUiItem(String str, Integer num) {
        this(str, num, ByteString.EMPTY);
    }

    public RedDotUiItem(String str, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.id = num;
    }
}
