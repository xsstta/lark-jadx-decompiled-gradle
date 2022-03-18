package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.LarkError;
import com.bytedance.lark.pb.moments.v1.Comment;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PushCommentCreateStatusChangeLocalNotification extends Message<PushCommentCreateStatusChangeLocalNotification, C18500a> {
    public static final ProtoAdapter<PushCommentCreateStatusChangeLocalNotification> ADAPTER = new C18501b();
    public static final Comment.CreateStatus DEFAULT_CREATE_STATUS = Comment.CreateStatus.SUCCESS;
    private static final long serialVersionUID = 0;
    public final List<String> category_ids;
    public final Comment.CreateStatus create_status;
    public final Entities entities;
    public final LarkError error;
    public final String local_comment_id;
    public final Comment success_server_comment;

    /* renamed from: com.bytedance.lark.pb.moments.v1.PushCommentCreateStatusChangeLocalNotification$b */
    private static final class C18501b extends ProtoAdapter<PushCommentCreateStatusChangeLocalNotification> {
        C18501b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushCommentCreateStatusChangeLocalNotification.class);
        }

        /* renamed from: a */
        public int encodedSize(PushCommentCreateStatusChangeLocalNotification pushCommentCreateStatusChangeLocalNotification) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (pushCommentCreateStatusChangeLocalNotification.local_comment_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, pushCommentCreateStatusChangeLocalNotification.local_comment_id);
            } else {
                i = 0;
            }
            if (pushCommentCreateStatusChangeLocalNotification.create_status != null) {
                i2 = Comment.CreateStatus.ADAPTER.encodedSizeWithTag(2, pushCommentCreateStatusChangeLocalNotification.create_status);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (pushCommentCreateStatusChangeLocalNotification.success_server_comment != null) {
                i3 = Comment.ADAPTER.encodedSizeWithTag(3, pushCommentCreateStatusChangeLocalNotification.success_server_comment);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (pushCommentCreateStatusChangeLocalNotification.entities != null) {
                i4 = Entities.ADAPTER.encodedSizeWithTag(4, pushCommentCreateStatusChangeLocalNotification.entities);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (pushCommentCreateStatusChangeLocalNotification.error != null) {
                i5 = LarkError.ADAPTER.encodedSizeWithTag(5, pushCommentCreateStatusChangeLocalNotification.error);
            }
            return i8 + i5 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(101, pushCommentCreateStatusChangeLocalNotification.category_ids) + pushCommentCreateStatusChangeLocalNotification.unknownFields().size();
        }

        /* renamed from: a */
        public PushCommentCreateStatusChangeLocalNotification decode(ProtoReader protoReader) throws IOException {
            C18500a aVar = new C18500a();
            aVar.f45964a = "";
            aVar.f45965b = Comment.CreateStatus.SUCCESS;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45964a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f45965b = Comment.CreateStatus.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f45966c = Comment.ADAPTER.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f45967d = Entities.ADAPTER.decode(protoReader);
                } else if (nextTag == 5) {
                    aVar.f45968e = LarkError.ADAPTER.decode(protoReader);
                } else if (nextTag != 101) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45969f.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushCommentCreateStatusChangeLocalNotification pushCommentCreateStatusChangeLocalNotification) throws IOException {
            if (pushCommentCreateStatusChangeLocalNotification.local_comment_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushCommentCreateStatusChangeLocalNotification.local_comment_id);
            }
            if (pushCommentCreateStatusChangeLocalNotification.create_status != null) {
                Comment.CreateStatus.ADAPTER.encodeWithTag(protoWriter, 2, pushCommentCreateStatusChangeLocalNotification.create_status);
            }
            if (pushCommentCreateStatusChangeLocalNotification.success_server_comment != null) {
                Comment.ADAPTER.encodeWithTag(protoWriter, 3, pushCommentCreateStatusChangeLocalNotification.success_server_comment);
            }
            if (pushCommentCreateStatusChangeLocalNotification.entities != null) {
                Entities.ADAPTER.encodeWithTag(protoWriter, 4, pushCommentCreateStatusChangeLocalNotification.entities);
            }
            if (pushCommentCreateStatusChangeLocalNotification.error != null) {
                LarkError.ADAPTER.encodeWithTag(protoWriter, 5, pushCommentCreateStatusChangeLocalNotification.error);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 101, pushCommentCreateStatusChangeLocalNotification.category_ids);
            protoWriter.writeBytes(pushCommentCreateStatusChangeLocalNotification.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.PushCommentCreateStatusChangeLocalNotification$a */
    public static final class C18500a extends Message.Builder<PushCommentCreateStatusChangeLocalNotification, C18500a> {

        /* renamed from: a */
        public String f45964a;

        /* renamed from: b */
        public Comment.CreateStatus f45965b;

        /* renamed from: c */
        public Comment f45966c;

        /* renamed from: d */
        public Entities f45967d;

        /* renamed from: e */
        public LarkError f45968e;

        /* renamed from: f */
        public List<String> f45969f = Internal.newMutableList();

        /* renamed from: a */
        public PushCommentCreateStatusChangeLocalNotification build() {
            return new PushCommentCreateStatusChangeLocalNotification(this.f45964a, this.f45965b, this.f45966c, this.f45967d, this.f45968e, this.f45969f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18500a newBuilder() {
        C18500a aVar = new C18500a();
        aVar.f45964a = this.local_comment_id;
        aVar.f45965b = this.create_status;
        aVar.f45966c = this.success_server_comment;
        aVar.f45967d = this.entities;
        aVar.f45968e = this.error;
        aVar.f45969f = Internal.copyOf("category_ids", this.category_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "PushCommentCreateStatusChangeLocalNotification");
        StringBuilder sb = new StringBuilder();
        if (this.local_comment_id != null) {
            sb.append(", local_comment_id=");
            sb.append(this.local_comment_id);
        }
        if (this.create_status != null) {
            sb.append(", create_status=");
            sb.append(this.create_status);
        }
        if (this.success_server_comment != null) {
            sb.append(", success_server_comment=");
            sb.append(this.success_server_comment);
        }
        if (this.entities != null) {
            sb.append(", entities=");
            sb.append(this.entities);
        }
        if (this.error != null) {
            sb.append(", error=");
            sb.append(this.error);
        }
        if (!this.category_ids.isEmpty()) {
            sb.append(", category_ids=");
            sb.append(this.category_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "PushCommentCreateStatusChangeLocalNotification{");
        replace.append('}');
        return replace.toString();
    }

    public PushCommentCreateStatusChangeLocalNotification(String str, Comment.CreateStatus createStatus, Comment comment, Entities entities2, LarkError larkError, List<String> list) {
        this(str, createStatus, comment, entities2, larkError, list, ByteString.EMPTY);
    }

    public PushCommentCreateStatusChangeLocalNotification(String str, Comment.CreateStatus createStatus, Comment comment, Entities entities2, LarkError larkError, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.local_comment_id = str;
        this.create_status = createStatus;
        this.success_server_comment = comment;
        this.entities = entities2;
        this.error = larkError;
        this.category_ids = Internal.immutableCopyOf("category_ids", list);
    }
}
