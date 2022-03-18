package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.RichText;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class CreateCommentRequest extends Message<CreateCommentRequest, C18346a> {
    public static final ProtoAdapter<CreateCommentRequest> ADAPTER = new C18347b();
    public static final Boolean DEFAULT_IS_ANONYMOUS = false;
    private static final long serialVersionUID = 0;
    public final String circle_id;
    public final RichText content;
    public final ImageInfo image_info;
    public final Boolean is_anonymous;
    public final CommentSet original_comment_set;
    public final String post_id;
    public final List<String> push_category_ids;
    public final Comment reply_comment;

    /* renamed from: com.bytedance.lark.pb.moments.v1.CreateCommentRequest$b */
    private static final class C18347b extends ProtoAdapter<CreateCommentRequest> {
        C18347b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateCommentRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateCommentRequest createCommentRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = 0;
            if (createCommentRequest.post_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, createCommentRequest.post_id);
            } else {
                i = 0;
            }
            if (createCommentRequest.content != null) {
                i2 = RichText.ADAPTER.encodedSizeWithTag(2, createCommentRequest.content);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (createCommentRequest.image_info != null) {
                i3 = ImageInfo.ADAPTER.encodedSizeWithTag(3, createCommentRequest.image_info);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (createCommentRequest.reply_comment != null) {
                i4 = Comment.ADAPTER.encodedSizeWithTag(4, createCommentRequest.reply_comment);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (createCommentRequest.circle_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, createCommentRequest.circle_id);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (createCommentRequest.is_anonymous != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(31, createCommentRequest.is_anonymous);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (createCommentRequest.original_comment_set != null) {
                i7 = CommentSet.ADAPTER.encodedSizeWithTag(41, createCommentRequest.original_comment_set);
            }
            return i12 + i7 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(101, createCommentRequest.push_category_ids) + createCommentRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateCommentRequest decode(ProtoReader protoReader) throws IOException {
            C18346a aVar = new C18346a();
            aVar.f45701a = "";
            aVar.f45705e = "";
            aVar.f45706f = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45701a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45702b = RichText.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45703c = ImageInfo.ADAPTER.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f45704d = Comment.ADAPTER.decode(protoReader);
                } else if (nextTag == 5) {
                    aVar.f45705e = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 31) {
                    aVar.f45706f = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 41) {
                    aVar.f45707g = CommentSet.ADAPTER.decode(protoReader);
                } else if (nextTag != 101) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45708h.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateCommentRequest createCommentRequest) throws IOException {
            if (createCommentRequest.post_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createCommentRequest.post_id);
            }
            if (createCommentRequest.content != null) {
                RichText.ADAPTER.encodeWithTag(protoWriter, 2, createCommentRequest.content);
            }
            if (createCommentRequest.image_info != null) {
                ImageInfo.ADAPTER.encodeWithTag(protoWriter, 3, createCommentRequest.image_info);
            }
            if (createCommentRequest.reply_comment != null) {
                Comment.ADAPTER.encodeWithTag(protoWriter, 4, createCommentRequest.reply_comment);
            }
            if (createCommentRequest.circle_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, createCommentRequest.circle_id);
            }
            if (createCommentRequest.is_anonymous != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 31, createCommentRequest.is_anonymous);
            }
            if (createCommentRequest.original_comment_set != null) {
                CommentSet.ADAPTER.encodeWithTag(protoWriter, 41, createCommentRequest.original_comment_set);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 101, createCommentRequest.push_category_ids);
            protoWriter.writeBytes(createCommentRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18346a newBuilder() {
        C18346a aVar = new C18346a();
        aVar.f45701a = this.post_id;
        aVar.f45702b = this.content;
        aVar.f45703c = this.image_info;
        aVar.f45704d = this.reply_comment;
        aVar.f45705e = this.circle_id;
        aVar.f45706f = this.is_anonymous;
        aVar.f45707g = this.original_comment_set;
        aVar.f45708h = Internal.copyOf("push_category_ids", this.push_category_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.CreateCommentRequest$a */
    public static final class C18346a extends Message.Builder<CreateCommentRequest, C18346a> {

        /* renamed from: a */
        public String f45701a;

        /* renamed from: b */
        public RichText f45702b;

        /* renamed from: c */
        public ImageInfo f45703c;

        /* renamed from: d */
        public Comment f45704d;

        /* renamed from: e */
        public String f45705e;

        /* renamed from: f */
        public Boolean f45706f;

        /* renamed from: g */
        public CommentSet f45707g;

        /* renamed from: h */
        public List<String> f45708h = Internal.newMutableList();

        /* renamed from: a */
        public CreateCommentRequest build() {
            return new CreateCommentRequest(this.f45701a, this.f45702b, this.f45703c, this.f45704d, this.f45705e, this.f45706f, this.f45707g, this.f45708h, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18346a mo63478a(RichText richText) {
            this.f45702b = richText;
            return this;
        }

        /* renamed from: a */
        public C18346a mo63479a(Comment comment) {
            this.f45704d = comment;
            return this;
        }

        /* renamed from: a */
        public C18346a mo63480a(CommentSet commentSet) {
            this.f45707g = commentSet;
            return this;
        }

        /* renamed from: a */
        public C18346a mo63481a(ImageInfo imageInfo) {
            this.f45703c = imageInfo;
            return this;
        }

        /* renamed from: a */
        public C18346a mo63482a(Boolean bool) {
            this.f45706f = bool;
            return this;
        }

        /* renamed from: a */
        public C18346a mo63483a(String str) {
            this.f45701a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "CreateCommentRequest");
        StringBuilder sb = new StringBuilder();
        if (this.post_id != null) {
            sb.append(", post_id=");
            sb.append(this.post_id);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.image_info != null) {
            sb.append(", image_info=");
            sb.append(this.image_info);
        }
        if (this.reply_comment != null) {
            sb.append(", reply_comment=");
            sb.append(this.reply_comment);
        }
        if (this.circle_id != null) {
            sb.append(", circle_id=");
            sb.append(this.circle_id);
        }
        if (this.is_anonymous != null) {
            sb.append(", is_anonymous=");
            sb.append(this.is_anonymous);
        }
        if (this.original_comment_set != null) {
            sb.append(", original_comment_set=");
            sb.append(this.original_comment_set);
        }
        if (!this.push_category_ids.isEmpty()) {
            sb.append(", push_category_ids=");
            sb.append(this.push_category_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateCommentRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateCommentRequest(String str, RichText richText, ImageInfo imageInfo, Comment comment, String str2, Boolean bool, CommentSet commentSet, List<String> list) {
        this(str, richText, imageInfo, comment, str2, bool, commentSet, list, ByteString.EMPTY);
    }

    public CreateCommentRequest(String str, RichText richText, ImageInfo imageInfo, Comment comment, String str2, Boolean bool, CommentSet commentSet, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.post_id = str;
        this.content = richText;
        this.image_info = imageInfo;
        this.reply_comment = comment;
        this.circle_id = str2;
        this.is_anonymous = bool;
        this.original_comment_set = commentSet;
        this.push_category_ids = Internal.immutableCopyOf("push_category_ids", list);
    }
}
