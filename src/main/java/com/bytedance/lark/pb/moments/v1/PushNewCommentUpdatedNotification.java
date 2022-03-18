package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushNewCommentUpdatedNotification extends Message<PushNewCommentUpdatedNotification, C18508a> {
    public static final ProtoAdapter<PushNewCommentUpdatedNotification> ADAPTER = new C18509b();
    private static final long serialVersionUID = 0;
    public final String comment_id;
    public final Entities entities;

    /* renamed from: com.bytedance.lark.pb.moments.v1.PushNewCommentUpdatedNotification$b */
    private static final class C18509b extends ProtoAdapter<PushNewCommentUpdatedNotification> {
        C18509b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushNewCommentUpdatedNotification.class);
        }

        /* renamed from: a */
        public int encodedSize(PushNewCommentUpdatedNotification pushNewCommentUpdatedNotification) {
            int i;
            int i2 = 0;
            if (pushNewCommentUpdatedNotification.comment_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, pushNewCommentUpdatedNotification.comment_id);
            } else {
                i = 0;
            }
            if (pushNewCommentUpdatedNotification.entities != null) {
                i2 = Entities.ADAPTER.encodedSizeWithTag(2, pushNewCommentUpdatedNotification.entities);
            }
            return i + i2 + pushNewCommentUpdatedNotification.unknownFields().size();
        }

        /* renamed from: a */
        public PushNewCommentUpdatedNotification decode(ProtoReader protoReader) throws IOException {
            C18508a aVar = new C18508a();
            aVar.f45978a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45978a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45979b = Entities.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushNewCommentUpdatedNotification pushNewCommentUpdatedNotification) throws IOException {
            if (pushNewCommentUpdatedNotification.comment_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushNewCommentUpdatedNotification.comment_id);
            }
            if (pushNewCommentUpdatedNotification.entities != null) {
                Entities.ADAPTER.encodeWithTag(protoWriter, 2, pushNewCommentUpdatedNotification.entities);
            }
            protoWriter.writeBytes(pushNewCommentUpdatedNotification.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.PushNewCommentUpdatedNotification$a */
    public static final class C18508a extends Message.Builder<PushNewCommentUpdatedNotification, C18508a> {

        /* renamed from: a */
        public String f45978a;

        /* renamed from: b */
        public Entities f45979b;

        /* renamed from: a */
        public PushNewCommentUpdatedNotification build() {
            return new PushNewCommentUpdatedNotification(this.f45978a, this.f45979b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18508a newBuilder() {
        C18508a aVar = new C18508a();
        aVar.f45978a = this.comment_id;
        aVar.f45979b = this.entities;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "PushNewCommentUpdatedNotification");
        StringBuilder sb = new StringBuilder();
        if (this.comment_id != null) {
            sb.append(", comment_id=");
            sb.append(this.comment_id);
        }
        if (this.entities != null) {
            sb.append(", entities=");
            sb.append(this.entities);
        }
        StringBuilder replace = sb.replace(0, 2, "PushNewCommentUpdatedNotification{");
        replace.append('}');
        return replace.toString();
    }

    public PushNewCommentUpdatedNotification(String str, Entities entities2) {
        this(str, entities2, ByteString.EMPTY);
    }

    public PushNewCommentUpdatedNotification(String str, Entities entities2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.comment_id = str;
        this.entities = entities2;
    }
}
