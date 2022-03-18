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

public final class DeleteCommentRequest extends Message<DeleteCommentRequest, C18358a> {
    public static final ProtoAdapter<DeleteCommentRequest> ADAPTER = new C18359b();
    private static final long serialVersionUID = 0;
    public final String comment_id;
    public final CommentSet original_comment_set;
    public final String parent_entity_id;
    public final List<String> push_category_ids;

    /* renamed from: com.bytedance.lark.pb.moments.v1.DeleteCommentRequest$b */
    private static final class C18359b extends ProtoAdapter<DeleteCommentRequest> {
        C18359b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteCommentRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteCommentRequest deleteCommentRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (deleteCommentRequest.comment_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, deleteCommentRequest.comment_id);
            } else {
                i = 0;
            }
            if (deleteCommentRequest.parent_entity_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, deleteCommentRequest.parent_entity_id);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (deleteCommentRequest.original_comment_set != null) {
                i3 = CommentSet.ADAPTER.encodedSizeWithTag(41, deleteCommentRequest.original_comment_set);
            }
            return i4 + i3 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(101, deleteCommentRequest.push_category_ids) + deleteCommentRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteCommentRequest decode(ProtoReader protoReader) throws IOException {
            C18358a aVar = new C18358a();
            aVar.f45728a = "";
            aVar.f45729b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45728a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45729b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 41) {
                    aVar.f45730c = CommentSet.ADAPTER.decode(protoReader);
                } else if (nextTag != 101) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45731d.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteCommentRequest deleteCommentRequest) throws IOException {
            if (deleteCommentRequest.comment_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deleteCommentRequest.comment_id);
            }
            if (deleteCommentRequest.parent_entity_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, deleteCommentRequest.parent_entity_id);
            }
            if (deleteCommentRequest.original_comment_set != null) {
                CommentSet.ADAPTER.encodeWithTag(protoWriter, 41, deleteCommentRequest.original_comment_set);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 101, deleteCommentRequest.push_category_ids);
            protoWriter.writeBytes(deleteCommentRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.DeleteCommentRequest$a */
    public static final class C18358a extends Message.Builder<DeleteCommentRequest, C18358a> {

        /* renamed from: a */
        public String f45728a;

        /* renamed from: b */
        public String f45729b;

        /* renamed from: c */
        public CommentSet f45730c;

        /* renamed from: d */
        public List<String> f45731d = Internal.newMutableList();

        /* renamed from: a */
        public DeleteCommentRequest build() {
            return new DeleteCommentRequest(this.f45728a, this.f45729b, this.f45730c, this.f45731d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18358a mo63519a(CommentSet commentSet) {
            this.f45730c = commentSet;
            return this;
        }

        /* renamed from: b */
        public C18358a mo63522b(String str) {
            this.f45729b = str;
            return this;
        }

        /* renamed from: a */
        public C18358a mo63520a(String str) {
            this.f45728a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18358a newBuilder() {
        C18358a aVar = new C18358a();
        aVar.f45728a = this.comment_id;
        aVar.f45729b = this.parent_entity_id;
        aVar.f45730c = this.original_comment_set;
        aVar.f45731d = Internal.copyOf("push_category_ids", this.push_category_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "DeleteCommentRequest");
        StringBuilder sb = new StringBuilder();
        if (this.comment_id != null) {
            sb.append(", comment_id=");
            sb.append(this.comment_id);
        }
        if (this.parent_entity_id != null) {
            sb.append(", parent_entity_id=");
            sb.append(this.parent_entity_id);
        }
        if (this.original_comment_set != null) {
            sb.append(", original_comment_set=");
            sb.append(this.original_comment_set);
        }
        if (!this.push_category_ids.isEmpty()) {
            sb.append(", push_category_ids=");
            sb.append(this.push_category_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteCommentRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteCommentRequest(String str, String str2, CommentSet commentSet, List<String> list) {
        this(str, str2, commentSet, list, ByteString.EMPTY);
    }

    public DeleteCommentRequest(String str, String str2, CommentSet commentSet, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.comment_id = str;
        this.parent_entity_id = str2;
        this.original_comment_set = commentSet;
        this.push_category_ids = Internal.immutableCopyOf("push_category_ids", list);
    }
}
