package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushNewPostUpdatedNotification extends Message<PushNewPostUpdatedNotification, C18510a> {
    public static final ProtoAdapter<PushNewPostUpdatedNotification> ADAPTER = new C18511b();
    private static final long serialVersionUID = 0;
    public final Entities entities;
    public final String post_id;

    /* renamed from: com.bytedance.lark.pb.moments.v1.PushNewPostUpdatedNotification$b */
    private static final class C18511b extends ProtoAdapter<PushNewPostUpdatedNotification> {
        C18511b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushNewPostUpdatedNotification.class);
        }

        /* renamed from: a */
        public int encodedSize(PushNewPostUpdatedNotification pushNewPostUpdatedNotification) {
            int i;
            int i2 = 0;
            if (pushNewPostUpdatedNotification.post_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, pushNewPostUpdatedNotification.post_id);
            } else {
                i = 0;
            }
            if (pushNewPostUpdatedNotification.entities != null) {
                i2 = Entities.ADAPTER.encodedSizeWithTag(2, pushNewPostUpdatedNotification.entities);
            }
            return i + i2 + pushNewPostUpdatedNotification.unknownFields().size();
        }

        /* renamed from: a */
        public PushNewPostUpdatedNotification decode(ProtoReader protoReader) throws IOException {
            C18510a aVar = new C18510a();
            aVar.f45980a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45980a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45981b = Entities.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushNewPostUpdatedNotification pushNewPostUpdatedNotification) throws IOException {
            if (pushNewPostUpdatedNotification.post_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushNewPostUpdatedNotification.post_id);
            }
            if (pushNewPostUpdatedNotification.entities != null) {
                Entities.ADAPTER.encodeWithTag(protoWriter, 2, pushNewPostUpdatedNotification.entities);
            }
            protoWriter.writeBytes(pushNewPostUpdatedNotification.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.PushNewPostUpdatedNotification$a */
    public static final class C18510a extends Message.Builder<PushNewPostUpdatedNotification, C18510a> {

        /* renamed from: a */
        public String f45980a;

        /* renamed from: b */
        public Entities f45981b;

        /* renamed from: a */
        public PushNewPostUpdatedNotification build() {
            return new PushNewPostUpdatedNotification(this.f45980a, this.f45981b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18510a newBuilder() {
        C18510a aVar = new C18510a();
        aVar.f45980a = this.post_id;
        aVar.f45981b = this.entities;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "PushNewPostUpdatedNotification");
        StringBuilder sb = new StringBuilder();
        if (this.post_id != null) {
            sb.append(", post_id=");
            sb.append(this.post_id);
        }
        if (this.entities != null) {
            sb.append(", entities=");
            sb.append(this.entities);
        }
        StringBuilder replace = sb.replace(0, 2, "PushNewPostUpdatedNotification{");
        replace.append('}');
        return replace.toString();
    }

    public PushNewPostUpdatedNotification(String str, Entities entities2) {
        this(str, entities2, ByteString.EMPTY);
    }

    public PushNewPostUpdatedNotification(String str, Entities entities2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.post_id = str;
        this.entities = entities2;
    }
}
