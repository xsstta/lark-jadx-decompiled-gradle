package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushItemExpired extends Message<PushItemExpired, C17897a> {
    public static final ProtoAdapter<PushItemExpired> ADAPTER = new C17898b();
    public static final Long DEFAULT_PARENT_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Long parent_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.PushItemExpired$b */
    private static final class C17898b extends ProtoAdapter<PushItemExpired> {
        C17898b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushItemExpired.class);
        }

        /* renamed from: a */
        public int encodedSize(PushItemExpired pushItemExpired) {
            int i;
            if (pushItemExpired.parent_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, pushItemExpired.parent_id);
            } else {
                i = 0;
            }
            return i + pushItemExpired.unknownFields().size();
        }

        /* renamed from: a */
        public PushItemExpired decode(ProtoReader protoReader) throws IOException {
            C17897a aVar = new C17897a();
            aVar.f44976a = 0L;
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
                    aVar.f44976a = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushItemExpired pushItemExpired) throws IOException {
            if (pushItemExpired.parent_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, pushItemExpired.parent_id);
            }
            protoWriter.writeBytes(pushItemExpired.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushItemExpired$a */
    public static final class C17897a extends Message.Builder<PushItemExpired, C17897a> {

        /* renamed from: a */
        public Long f44976a;

        /* renamed from: a */
        public PushItemExpired build() {
            return new PushItemExpired(this.f44976a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17897a newBuilder() {
        C17897a aVar = new C17897a();
        aVar.f44976a = this.parent_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushItemExpired");
        StringBuilder sb = new StringBuilder();
        if (this.parent_id != null) {
            sb.append(", parent_id=");
            sb.append(this.parent_id);
        }
        StringBuilder replace = sb.replace(0, 2, "PushItemExpired{");
        replace.append('}');
        return replace.toString();
    }

    public PushItemExpired(Long l) {
        this(l, ByteString.EMPTY);
    }

    public PushItemExpired(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.parent_id = l;
    }
}
