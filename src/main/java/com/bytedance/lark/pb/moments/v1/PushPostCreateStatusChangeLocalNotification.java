package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.LarkError;
import com.bytedance.lark.pb.moments.v1.Post;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushPostCreateStatusChangeLocalNotification extends Message<PushPostCreateStatusChangeLocalNotification, C18512a> {
    public static final ProtoAdapter<PushPostCreateStatusChangeLocalNotification> ADAPTER = new C18513b();
    public static final Post.CreateStatus DEFAULT_CREATE_STATUS = Post.CreateStatus.SUCCESS;
    private static final long serialVersionUID = 0;
    public final Post.CreateStatus create_status;
    public final Entities entities;
    public final LarkError error;
    public final String local_post_id;
    public final Post success_server_post;

    /* renamed from: com.bytedance.lark.pb.moments.v1.PushPostCreateStatusChangeLocalNotification$b */
    private static final class C18513b extends ProtoAdapter<PushPostCreateStatusChangeLocalNotification> {
        C18513b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushPostCreateStatusChangeLocalNotification.class);
        }

        /* renamed from: a */
        public int encodedSize(PushPostCreateStatusChangeLocalNotification pushPostCreateStatusChangeLocalNotification) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (pushPostCreateStatusChangeLocalNotification.local_post_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, pushPostCreateStatusChangeLocalNotification.local_post_id);
            } else {
                i = 0;
            }
            if (pushPostCreateStatusChangeLocalNotification.create_status != null) {
                i2 = Post.CreateStatus.ADAPTER.encodedSizeWithTag(2, pushPostCreateStatusChangeLocalNotification.create_status);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (pushPostCreateStatusChangeLocalNotification.success_server_post != null) {
                i3 = Post.ADAPTER.encodedSizeWithTag(3, pushPostCreateStatusChangeLocalNotification.success_server_post);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (pushPostCreateStatusChangeLocalNotification.entities != null) {
                i4 = Entities.ADAPTER.encodedSizeWithTag(4, pushPostCreateStatusChangeLocalNotification.entities);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (pushPostCreateStatusChangeLocalNotification.error != null) {
                i5 = LarkError.ADAPTER.encodedSizeWithTag(5, pushPostCreateStatusChangeLocalNotification.error);
            }
            return i8 + i5 + pushPostCreateStatusChangeLocalNotification.unknownFields().size();
        }

        /* renamed from: a */
        public PushPostCreateStatusChangeLocalNotification decode(ProtoReader protoReader) throws IOException {
            C18512a aVar = new C18512a();
            aVar.f45982a = "";
            aVar.f45983b = Post.CreateStatus.SUCCESS;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45982a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f45983b = Post.CreateStatus.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f45984c = Post.ADAPTER.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f45985d = Entities.ADAPTER.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45986e = LarkError.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushPostCreateStatusChangeLocalNotification pushPostCreateStatusChangeLocalNotification) throws IOException {
            if (pushPostCreateStatusChangeLocalNotification.local_post_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushPostCreateStatusChangeLocalNotification.local_post_id);
            }
            if (pushPostCreateStatusChangeLocalNotification.create_status != null) {
                Post.CreateStatus.ADAPTER.encodeWithTag(protoWriter, 2, pushPostCreateStatusChangeLocalNotification.create_status);
            }
            if (pushPostCreateStatusChangeLocalNotification.success_server_post != null) {
                Post.ADAPTER.encodeWithTag(protoWriter, 3, pushPostCreateStatusChangeLocalNotification.success_server_post);
            }
            if (pushPostCreateStatusChangeLocalNotification.entities != null) {
                Entities.ADAPTER.encodeWithTag(protoWriter, 4, pushPostCreateStatusChangeLocalNotification.entities);
            }
            if (pushPostCreateStatusChangeLocalNotification.error != null) {
                LarkError.ADAPTER.encodeWithTag(protoWriter, 5, pushPostCreateStatusChangeLocalNotification.error);
            }
            protoWriter.writeBytes(pushPostCreateStatusChangeLocalNotification.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.PushPostCreateStatusChangeLocalNotification$a */
    public static final class C18512a extends Message.Builder<PushPostCreateStatusChangeLocalNotification, C18512a> {

        /* renamed from: a */
        public String f45982a;

        /* renamed from: b */
        public Post.CreateStatus f45983b;

        /* renamed from: c */
        public Post f45984c;

        /* renamed from: d */
        public Entities f45985d;

        /* renamed from: e */
        public LarkError f45986e;

        /* renamed from: a */
        public PushPostCreateStatusChangeLocalNotification build() {
            return new PushPostCreateStatusChangeLocalNotification(this.f45982a, this.f45983b, this.f45984c, this.f45985d, this.f45986e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18512a newBuilder() {
        C18512a aVar = new C18512a();
        aVar.f45982a = this.local_post_id;
        aVar.f45983b = this.create_status;
        aVar.f45984c = this.success_server_post;
        aVar.f45985d = this.entities;
        aVar.f45986e = this.error;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "PushPostCreateStatusChangeLocalNotification");
        StringBuilder sb = new StringBuilder();
        if (this.local_post_id != null) {
            sb.append(", local_post_id=");
            sb.append(this.local_post_id);
        }
        if (this.create_status != null) {
            sb.append(", create_status=");
            sb.append(this.create_status);
        }
        if (this.success_server_post != null) {
            sb.append(", success_server_post=");
            sb.append(this.success_server_post);
        }
        if (this.entities != null) {
            sb.append(", entities=");
            sb.append(this.entities);
        }
        if (this.error != null) {
            sb.append(", error=");
            sb.append(this.error);
        }
        StringBuilder replace = sb.replace(0, 2, "PushPostCreateStatusChangeLocalNotification{");
        replace.append('}');
        return replace.toString();
    }

    public PushPostCreateStatusChangeLocalNotification(String str, Post.CreateStatus createStatus, Post post, Entities entities2, LarkError larkError) {
        this(str, createStatus, post, entities2, larkError, ByteString.EMPTY);
    }

    public PushPostCreateStatusChangeLocalNotification(String str, Post.CreateStatus createStatus, Post post, Entities entities2, LarkError larkError, ByteString byteString) {
        super(ADAPTER, byteString);
        this.local_post_id = str;
        this.create_status = createStatus;
        this.success_server_post = post;
        this.entities = entities2;
        this.error = larkError;
    }
}
