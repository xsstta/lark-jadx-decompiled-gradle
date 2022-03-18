package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class TimeZone extends Message<TimeZone, C18935a> {
    public static final ProtoAdapter<TimeZone> ADAPTER = new C18936b();
    private static final long serialVersionUID = 0;
    public final String name;

    /* renamed from: com.bytedance.lark.pb.search.v1.TimeZone$b */
    private static final class C18936b extends ProtoAdapter<TimeZone> {
        C18936b() {
            super(FieldEncoding.LENGTH_DELIMITED, TimeZone.class);
        }

        /* renamed from: a */
        public int encodedSize(TimeZone timeZone) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, timeZone.name) + timeZone.unknownFields().size();
        }

        /* renamed from: a */
        public TimeZone decode(ProtoReader protoReader) throws IOException {
            C18935a aVar = new C18935a();
            aVar.f46817a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46817a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TimeZone timeZone) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, timeZone.name);
            protoWriter.writeBytes(timeZone.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.TimeZone$a */
    public static final class C18935a extends Message.Builder<TimeZone, C18935a> {

        /* renamed from: a */
        public String f46817a;

        /* renamed from: a */
        public TimeZone build() {
            String str = this.f46817a;
            if (str != null) {
                return new TimeZone(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "name");
        }
    }

    @Override // com.squareup.wire.Message
    public C18935a newBuilder() {
        C18935a aVar = new C18935a();
        aVar.f46817a = this.name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "TimeZone");
        StringBuilder sb = new StringBuilder();
        sb.append(", name=");
        sb.append(this.name);
        StringBuilder replace = sb.replace(0, 2, "TimeZone{");
        replace.append('}');
        return replace.toString();
    }

    public TimeZone(String str) {
        this(str, ByteString.EMPTY);
    }

    public TimeZone(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
    }
}
