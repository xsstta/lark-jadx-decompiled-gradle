package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class FavoritesObject extends Message<FavoritesObject, C14941a> {
    public static final ProtoAdapter<FavoritesObject> ADAPTER = new C14942b();
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final FavoritesType DEFAULT_TYPE = FavoritesType.FAVORITES_UNKNOWN;
    private static final long serialVersionUID = 0;
    public final FavoritesContent content;
    public final Long create_time;
    public final String id;
    public final Content translation_content;
    public final FavoritesType type;

    public static final class FavoritesContent extends Message<FavoritesContent, C14939a> {
        public static final ProtoAdapter<FavoritesContent> ADAPTER = new C14940b();
        private static final long serialVersionUID = 0;
        public final String message_id;

        /* renamed from: com.bytedance.lark.pb.basic.v1.FavoritesObject$FavoritesContent$b */
        private static final class C14940b extends ProtoAdapter<FavoritesContent> {
            C14940b() {
                super(FieldEncoding.LENGTH_DELIMITED, FavoritesContent.class);
            }

            /* renamed from: a */
            public int encodedSize(FavoritesContent favoritesContent) {
                int i;
                if (favoritesContent.message_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, favoritesContent.message_id);
                } else {
                    i = 0;
                }
                return i + favoritesContent.unknownFields().size();
            }

            /* renamed from: a */
            public FavoritesContent decode(ProtoReader protoReader) throws IOException {
                C14939a aVar = new C14939a();
                aVar.f39582a = "";
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
                        aVar.f39582a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, FavoritesContent favoritesContent) throws IOException {
                if (favoritesContent.message_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, favoritesContent.message_id);
                }
                protoWriter.writeBytes(favoritesContent.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.FavoritesObject$FavoritesContent$a */
        public static final class C14939a extends Message.Builder<FavoritesContent, C14939a> {

            /* renamed from: a */
            public String f39582a;

            /* renamed from: a */
            public FavoritesContent build() {
                return new FavoritesContent(this.f39582a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14939a newBuilder() {
            C14939a aVar = new C14939a();
            aVar.f39582a = this.message_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "FavoritesContent");
            StringBuilder sb = new StringBuilder();
            if (this.message_id != null) {
                sb.append(", message_id=");
                sb.append(this.message_id);
            }
            StringBuilder replace = sb.replace(0, 2, "FavoritesContent{");
            replace.append('}');
            return replace.toString();
        }

        public FavoritesContent(String str) {
            this(str, ByteString.EMPTY);
        }

        public FavoritesContent(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.message_id = str;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.FavoritesObject$b */
    private static final class C14942b extends ProtoAdapter<FavoritesObject> {
        C14942b() {
            super(FieldEncoding.LENGTH_DELIMITED, FavoritesObject.class);
        }

        /* renamed from: a */
        public int encodedSize(FavoritesObject favoritesObject) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, favoritesObject.id) + ProtoAdapter.INT64.encodedSizeWithTag(2, favoritesObject.create_time) + FavoritesType.ADAPTER.encodedSizeWithTag(3, favoritesObject.type);
            int i2 = 0;
            if (favoritesObject.content != null) {
                i = FavoritesContent.ADAPTER.encodedSizeWithTag(4, favoritesObject.content);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (favoritesObject.translation_content != null) {
                i2 = Content.ADAPTER.encodedSizeWithTag(5, favoritesObject.translation_content);
            }
            return i3 + i2 + favoritesObject.unknownFields().size();
        }

        /* renamed from: a */
        public FavoritesObject decode(ProtoReader protoReader) throws IOException {
            C14941a aVar = new C14941a();
            aVar.f39583a = "";
            aVar.f39584b = 0L;
            aVar.f39585c = FavoritesType.FAVORITES_UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39583a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f39584b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f39585c = FavoritesType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 4) {
                    aVar.f39586d = FavoritesContent.ADAPTER.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39587e = Content.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FavoritesObject favoritesObject) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, favoritesObject.id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, favoritesObject.create_time);
            FavoritesType.ADAPTER.encodeWithTag(protoWriter, 3, favoritesObject.type);
            if (favoritesObject.content != null) {
                FavoritesContent.ADAPTER.encodeWithTag(protoWriter, 4, favoritesObject.content);
            }
            if (favoritesObject.translation_content != null) {
                Content.ADAPTER.encodeWithTag(protoWriter, 5, favoritesObject.translation_content);
            }
            protoWriter.writeBytes(favoritesObject.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.FavoritesObject$a */
    public static final class C14941a extends Message.Builder<FavoritesObject, C14941a> {

        /* renamed from: a */
        public String f39583a;

        /* renamed from: b */
        public Long f39584b;

        /* renamed from: c */
        public FavoritesType f39585c;

        /* renamed from: d */
        public FavoritesContent f39586d;

        /* renamed from: e */
        public Content f39587e;

        /* renamed from: a */
        public FavoritesObject build() {
            Long l;
            FavoritesType favoritesType;
            String str = this.f39583a;
            if (str != null && (l = this.f39584b) != null && (favoritesType = this.f39585c) != null) {
                return new FavoritesObject(str, l, favoritesType, this.f39586d, this.f39587e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id", this.f39584b, "create_time", this.f39585c, ShareHitPoint.f121869d);
        }
    }

    @Override // com.squareup.wire.Message
    public C14941a newBuilder() {
        C14941a aVar = new C14941a();
        aVar.f39583a = this.id;
        aVar.f39584b = this.create_time;
        aVar.f39585c = this.type;
        aVar.f39586d = this.content;
        aVar.f39587e = this.translation_content;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "FavoritesObject");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", create_time=");
        sb.append(this.create_time);
        sb.append(", type=");
        sb.append(this.type);
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.translation_content != null) {
            sb.append(", translation_content=");
            sb.append(this.translation_content);
        }
        StringBuilder replace = sb.replace(0, 2, "FavoritesObject{");
        replace.append('}');
        return replace.toString();
    }

    public FavoritesObject(String str, Long l, FavoritesType favoritesType, FavoritesContent favoritesContent, Content content2) {
        this(str, l, favoritesType, favoritesContent, content2, ByteString.EMPTY);
    }

    public FavoritesObject(String str, Long l, FavoritesType favoritesType, FavoritesContent favoritesContent, Content content2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.create_time = l;
        this.type = favoritesType;
        this.content = favoritesContent;
        this.translation_content = content2;
    }
}
