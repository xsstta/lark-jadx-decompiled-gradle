package com.ss.android.lark.pb.todo_comments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CreateTodoCommentReactionRequest extends Message<CreateTodoCommentReactionRequest, C50078a> {
    public static final ProtoAdapter<CreateTodoCommentReactionRequest> ADAPTER = new C50079b();
    private static final long serialVersionUID = 0;
    public final String mcomment_id;
    public final String mreaction_type;
    public final String mtodo_guid;

    /* renamed from: com.ss.android.lark.pb.todo_comments.CreateTodoCommentReactionRequest$b */
    private static final class C50079b extends ProtoAdapter<CreateTodoCommentReactionRequest> {
        C50079b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateTodoCommentReactionRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateTodoCommentReactionRequest createTodoCommentReactionRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (createTodoCommentReactionRequest.mtodo_guid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, createTodoCommentReactionRequest.mtodo_guid);
            } else {
                i = 0;
            }
            if (createTodoCommentReactionRequest.mcomment_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, createTodoCommentReactionRequest.mcomment_id);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (createTodoCommentReactionRequest.mreaction_type != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, createTodoCommentReactionRequest.mreaction_type);
            }
            return i4 + i3 + createTodoCommentReactionRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateTodoCommentReactionRequest decode(ProtoReader protoReader) throws IOException {
            C50078a aVar = new C50078a();
            aVar.f125198a = "";
            aVar.f125199b = "";
            aVar.f125200c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125198a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125199b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125200c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateTodoCommentReactionRequest createTodoCommentReactionRequest) throws IOException {
            if (createTodoCommentReactionRequest.mtodo_guid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createTodoCommentReactionRequest.mtodo_guid);
            }
            if (createTodoCommentReactionRequest.mcomment_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, createTodoCommentReactionRequest.mcomment_id);
            }
            if (createTodoCommentReactionRequest.mreaction_type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, createTodoCommentReactionRequest.mreaction_type);
            }
            protoWriter.writeBytes(createTodoCommentReactionRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.todo_comments.CreateTodoCommentReactionRequest$a */
    public static final class C50078a extends Message.Builder<CreateTodoCommentReactionRequest, C50078a> {

        /* renamed from: a */
        public String f125198a;

        /* renamed from: b */
        public String f125199b;

        /* renamed from: c */
        public String f125200c;

        /* renamed from: a */
        public CreateTodoCommentReactionRequest build() {
            return new CreateTodoCommentReactionRequest(this.f125198a, this.f125199b, this.f125200c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50078a newBuilder() {
        C50078a aVar = new C50078a();
        aVar.f125198a = this.mtodo_guid;
        aVar.f125199b = this.mcomment_id;
        aVar.f125200c = this.mreaction_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mtodo_guid != null) {
            sb.append(", todo_guid=");
            sb.append(this.mtodo_guid);
        }
        if (this.mcomment_id != null) {
            sb.append(", comment_id=");
            sb.append(this.mcomment_id);
        }
        if (this.mreaction_type != null) {
            sb.append(", reaction_type=");
            sb.append(this.mreaction_type);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateTodoCommentReactionRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateTodoCommentReactionRequest(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public CreateTodoCommentReactionRequest(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtodo_guid = str;
        this.mcomment_id = str2;
        this.mreaction_type = str3;
    }
}
