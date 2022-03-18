package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PushCommentSetLocalNotification extends Message<PushCommentSetLocalNotification, C18502a> {
    public static final ProtoAdapter<PushCommentSetLocalNotification> ADAPTER = new C18503b();
    private static final long serialVersionUID = 0;
    public final List<String> category_ids;
    public final CommentSet comment_set;
    public final String entity_id;

    /* renamed from: com.bytedance.lark.pb.moments.v1.PushCommentSetLocalNotification$b */
    private static final class C18503b extends ProtoAdapter<PushCommentSetLocalNotification> {
        C18503b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushCommentSetLocalNotification.class);
        }

        /* renamed from: a */
        public int encodedSize(PushCommentSetLocalNotification pushCommentSetLocalNotification) {
            int i;
            int i2 = 0;
            if (pushCommentSetLocalNotification.entity_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, pushCommentSetLocalNotification.entity_id);
            } else {
                i = 0;
            }
            if (pushCommentSetLocalNotification.comment_set != null) {
                i2 = CommentSet.ADAPTER.encodedSizeWithTag(2, pushCommentSetLocalNotification.comment_set);
            }
            return i + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(101, pushCommentSetLocalNotification.category_ids) + pushCommentSetLocalNotification.unknownFields().size();
        }

        /* renamed from: a */
        public PushCommentSetLocalNotification decode(ProtoReader protoReader) throws IOException {
            C18502a aVar = new C18502a();
            aVar.f45970a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45970a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45971b = CommentSet.ADAPTER.decode(protoReader);
                } else if (nextTag != 101) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45972c.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushCommentSetLocalNotification pushCommentSetLocalNotification) throws IOException {
            if (pushCommentSetLocalNotification.entity_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushCommentSetLocalNotification.entity_id);
            }
            if (pushCommentSetLocalNotification.comment_set != null) {
                CommentSet.ADAPTER.encodeWithTag(protoWriter, 2, pushCommentSetLocalNotification.comment_set);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 101, pushCommentSetLocalNotification.category_ids);
            protoWriter.writeBytes(pushCommentSetLocalNotification.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.PushCommentSetLocalNotification$a */
    public static final class C18502a extends Message.Builder<PushCommentSetLocalNotification, C18502a> {

        /* renamed from: a */
        public String f45970a;

        /* renamed from: b */
        public CommentSet f45971b;

        /* renamed from: c */
        public List<String> f45972c = Internal.newMutableList();

        /* renamed from: a */
        public PushCommentSetLocalNotification build() {
            return new PushCommentSetLocalNotification(this.f45970a, this.f45971b, this.f45972c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18502a newBuilder() {
        C18502a aVar = new C18502a();
        aVar.f45970a = this.entity_id;
        aVar.f45971b = this.comment_set;
        aVar.f45972c = Internal.copyOf("category_ids", this.category_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "PushCommentSetLocalNotification");
        StringBuilder sb = new StringBuilder();
        if (this.entity_id != null) {
            sb.append(", entity_id=");
            sb.append(this.entity_id);
        }
        if (this.comment_set != null) {
            sb.append(", comment_set=");
            sb.append(this.comment_set);
        }
        if (!this.category_ids.isEmpty()) {
            sb.append(", category_ids=");
            sb.append(this.category_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "PushCommentSetLocalNotification{");
        replace.append('}');
        return replace.toString();
    }

    public PushCommentSetLocalNotification(String str, CommentSet commentSet, List<String> list) {
        this(str, commentSet, list, ByteString.EMPTY);
    }

    public PushCommentSetLocalNotification(String str, CommentSet commentSet, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity_id = str;
        this.comment_set = commentSet;
        this.category_ids = Internal.immutableCopyOf("category_ids", list);
    }
}
