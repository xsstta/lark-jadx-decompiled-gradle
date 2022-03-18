package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.PreviewEntityPair;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class Entities extends Message<Entities, C18366a> {
    public static final ProtoAdapter<Entities> ADAPTER = new C18367b();
    private static final long serialVersionUID = 0;
    public final Map<String, Category> categories;
    public final Map<String, Circle> circles;
    public final Map<String, Comment> comments;
    public final Map<String, Post> posts;
    public final Map<String, PreviewEntityPair> preview_entities;
    public final Map<String, MomentUser> users;

    /* renamed from: com.bytedance.lark.pb.moments.v1.Entities$a */
    public static final class C18366a extends Message.Builder<Entities, C18366a> {

        /* renamed from: a */
        public Map<String, Circle> f45742a = Internal.newMutableMap();

        /* renamed from: b */
        public Map<String, MomentUser> f45743b = Internal.newMutableMap();

        /* renamed from: c */
        public Map<String, Post> f45744c = Internal.newMutableMap();

        /* renamed from: d */
        public Map<String, Comment> f45745d = Internal.newMutableMap();

        /* renamed from: e */
        public Map<String, Category> f45746e = Internal.newMutableMap();

        /* renamed from: f */
        public Map<String, PreviewEntityPair> f45747f = Internal.newMutableMap();

        /* renamed from: a */
        public Entities build() {
            return new Entities(this.f45742a, this.f45743b, this.f45744c, this.f45745d, this.f45746e, this.f45747f, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.Entities$b */
    private static final class C18367b extends ProtoAdapter<Entities> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Circle>> f45748a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Circle.ADAPTER);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, MomentUser>> f45749b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, MomentUser.ADAPTER);

        /* renamed from: c */
        private final ProtoAdapter<Map<String, Post>> f45750c = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Post.ADAPTER);

        /* renamed from: d */
        private final ProtoAdapter<Map<String, Comment>> f45751d = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Comment.ADAPTER);

        /* renamed from: e */
        private final ProtoAdapter<Map<String, Category>> f45752e = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Category.ADAPTER);

        /* renamed from: f */
        private final ProtoAdapter<Map<String, PreviewEntityPair>> f45753f = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, PreviewEntityPair.ADAPTER);

        C18367b() {
            super(FieldEncoding.LENGTH_DELIMITED, Entities.class);
        }

        /* renamed from: a */
        public int encodedSize(Entities entities) {
            return this.f45748a.encodedSizeWithTag(1, entities.circles) + this.f45749b.encodedSizeWithTag(2, entities.users) + this.f45750c.encodedSizeWithTag(3, entities.posts) + this.f45751d.encodedSizeWithTag(4, entities.comments) + this.f45752e.encodedSizeWithTag(5, entities.categories) + this.f45753f.encodedSizeWithTag(6, entities.preview_entities) + entities.unknownFields().size();
        }

        /* renamed from: a */
        public Entities decode(ProtoReader protoReader) throws IOException {
            C18366a aVar = new C18366a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f45742a.putAll(this.f45748a.decode(protoReader));
                            break;
                        case 2:
                            aVar.f45743b.putAll(this.f45749b.decode(protoReader));
                            break;
                        case 3:
                            aVar.f45744c.putAll(this.f45750c.decode(protoReader));
                            break;
                        case 4:
                            aVar.f45745d.putAll(this.f45751d.decode(protoReader));
                            break;
                        case 5:
                            aVar.f45746e.putAll(this.f45752e.decode(protoReader));
                            break;
                        case 6:
                            aVar.f45747f.putAll(this.f45753f.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Entities entities) throws IOException {
            this.f45748a.encodeWithTag(protoWriter, 1, entities.circles);
            this.f45749b.encodeWithTag(protoWriter, 2, entities.users);
            this.f45750c.encodeWithTag(protoWriter, 3, entities.posts);
            this.f45751d.encodeWithTag(protoWriter, 4, entities.comments);
            this.f45752e.encodeWithTag(protoWriter, 5, entities.categories);
            this.f45753f.encodeWithTag(protoWriter, 6, entities.preview_entities);
            protoWriter.writeBytes(entities.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18366a newBuilder() {
        C18366a aVar = new C18366a();
        aVar.f45742a = Internal.copyOf("circles", this.circles);
        aVar.f45743b = Internal.copyOf("users", this.users);
        aVar.f45744c = Internal.copyOf("posts", this.posts);
        aVar.f45745d = Internal.copyOf("comments", this.comments);
        aVar.f45746e = Internal.copyOf("categories", this.categories);
        aVar.f45747f = Internal.copyOf("preview_entities", this.preview_entities);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "Entities");
        StringBuilder sb = new StringBuilder();
        if (!this.circles.isEmpty()) {
            sb.append(", circles=");
            sb.append(this.circles);
        }
        if (!this.users.isEmpty()) {
            sb.append(", users=");
            sb.append(this.users);
        }
        if (!this.posts.isEmpty()) {
            sb.append(", posts=");
            sb.append(this.posts);
        }
        if (!this.comments.isEmpty()) {
            sb.append(", comments=");
            sb.append(this.comments);
        }
        if (!this.categories.isEmpty()) {
            sb.append(", categories=");
            sb.append(this.categories);
        }
        if (!this.preview_entities.isEmpty()) {
            sb.append(", preview_entities=");
            sb.append(this.preview_entities);
        }
        StringBuilder replace = sb.replace(0, 2, "Entities{");
        replace.append('}');
        return replace.toString();
    }

    public Entities(Map<String, Circle> map, Map<String, MomentUser> map2, Map<String, Post> map3, Map<String, Comment> map4, Map<String, Category> map5, Map<String, PreviewEntityPair> map6) {
        this(map, map2, map3, map4, map5, map6, ByteString.EMPTY);
    }

    public Entities(Map<String, Circle> map, Map<String, MomentUser> map2, Map<String, Post> map3, Map<String, Comment> map4, Map<String, Category> map5, Map<String, PreviewEntityPair> map6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.circles = Internal.immutableCopyOf("circles", map);
        this.users = Internal.immutableCopyOf("users", map2);
        this.posts = Internal.immutableCopyOf("posts", map3);
        this.comments = Internal.immutableCopyOf("comments", map4);
        this.categories = Internal.immutableCopyOf("categories", map5);
        this.preview_entities = Internal.immutableCopyOf("preview_entities", map6);
    }
}
