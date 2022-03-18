package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ReactionMessageContent extends Message<ReactionMessageContent, C50956a> {
    public static final ProtoAdapter<ReactionMessageContent> ADAPTER = new C50957b();
    private static final long serialVersionUID = 0;
    public final String content;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ReactionMessageContent$b */
    private static final class C50957b extends ProtoAdapter<ReactionMessageContent> {
        C50957b() {
            super(FieldEncoding.LENGTH_DELIMITED, ReactionMessageContent.class);
        }

        /* renamed from: a */
        public int encodedSize(ReactionMessageContent reactionMessageContent) {
            int i;
            if (reactionMessageContent.content != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, reactionMessageContent.content);
            } else {
                i = 0;
            }
            return i + reactionMessageContent.unknownFields().size();
        }

        /* renamed from: a */
        public ReactionMessageContent decode(ProtoReader protoReader) throws IOException {
            C50956a aVar = new C50956a();
            aVar.f126980a = "";
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
                    aVar.f126980a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ReactionMessageContent reactionMessageContent) throws IOException {
            if (reactionMessageContent.content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, reactionMessageContent.content);
            }
            protoWriter.writeBytes(reactionMessageContent.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ReactionMessageContent$a */
    public static final class C50956a extends Message.Builder<ReactionMessageContent, C50956a> {

        /* renamed from: a */
        public String f126980a;

        /* renamed from: a */
        public ReactionMessageContent build() {
            return new ReactionMessageContent(this.f126980a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50956a mo175992a(String str) {
            this.f126980a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50956a newBuilder() {
        C50956a aVar = new C50956a();
        aVar.f126980a = this.content;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ReactionMessageContent");
        StringBuilder sb = new StringBuilder();
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        StringBuilder replace = sb.replace(0, 2, "ReactionMessageContent{");
        replace.append('}');
        return replace.toString();
    }

    public ReactionMessageContent(String str) {
        this(str, ByteString.EMPTY);
    }

    public ReactionMessageContent(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.content = str;
    }
}
