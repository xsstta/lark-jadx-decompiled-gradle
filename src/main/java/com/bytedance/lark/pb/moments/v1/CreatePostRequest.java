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

public final class CreatePostRequest extends Message<CreatePostRequest, C18350a> {
    public static final ProtoAdapter<CreatePostRequest> ADAPTER = new C18351b();
    public static final Boolean DEFAULT_IS_ANONYMOUS = false;
    private static final long serialVersionUID = 0;
    public final List<String> category_ids;
    public final String circle_id;
    public final RichText content;
    public final List<ImageInfo> image_info_list;
    public final Boolean is_anonymous;
    public final MediaInfo media_info;

    /* renamed from: com.bytedance.lark.pb.moments.v1.CreatePostRequest$b */
    private static final class C18351b extends ProtoAdapter<CreatePostRequest> {
        C18351b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreatePostRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreatePostRequest createPostRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (createPostRequest.circle_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, createPostRequest.circle_id);
            } else {
                i = 0;
            }
            if (createPostRequest.content != null) {
                i2 = RichText.ADAPTER.encodedSizeWithTag(2, createPostRequest.content);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + ImageInfo.ADAPTER.asRepeated().encodedSizeWithTag(3, createPostRequest.image_info_list);
            if (createPostRequest.media_info != null) {
                i3 = MediaInfo.ADAPTER.encodedSizeWithTag(4, createPostRequest.media_info);
            } else {
                i3 = 0;
            }
            int i5 = encodedSizeWithTag + i3;
            if (createPostRequest.is_anonymous != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(31, createPostRequest.is_anonymous);
            }
            return i5 + i4 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(32, createPostRequest.category_ids) + createPostRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreatePostRequest decode(ProtoReader protoReader) throws IOException {
            C18350a aVar = new C18350a();
            aVar.f45712a = "";
            aVar.f45716e = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45712a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45713b = RichText.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45714c.add(ImageInfo.ADAPTER.decode(protoReader));
                } else if (nextTag == 4) {
                    aVar.f45715d = MediaInfo.ADAPTER.decode(protoReader);
                } else if (nextTag == 31) {
                    aVar.f45716e = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 32) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45717f.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreatePostRequest createPostRequest) throws IOException {
            if (createPostRequest.circle_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createPostRequest.circle_id);
            }
            if (createPostRequest.content != null) {
                RichText.ADAPTER.encodeWithTag(protoWriter, 2, createPostRequest.content);
            }
            ImageInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, createPostRequest.image_info_list);
            if (createPostRequest.media_info != null) {
                MediaInfo.ADAPTER.encodeWithTag(protoWriter, 4, createPostRequest.media_info);
            }
            if (createPostRequest.is_anonymous != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 31, createPostRequest.is_anonymous);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 32, createPostRequest.category_ids);
            protoWriter.writeBytes(createPostRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18350a newBuilder() {
        C18350a aVar = new C18350a();
        aVar.f45712a = this.circle_id;
        aVar.f45713b = this.content;
        aVar.f45714c = Internal.copyOf("image_info_list", this.image_info_list);
        aVar.f45715d = this.media_info;
        aVar.f45716e = this.is_anonymous;
        aVar.f45717f = Internal.copyOf("category_ids", this.category_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.CreatePostRequest$a */
    public static final class C18350a extends Message.Builder<CreatePostRequest, C18350a> {

        /* renamed from: a */
        public String f45712a;

        /* renamed from: b */
        public RichText f45713b;

        /* renamed from: c */
        public List<ImageInfo> f45714c = Internal.newMutableList();

        /* renamed from: d */
        public MediaInfo f45715d;

        /* renamed from: e */
        public Boolean f45716e;

        /* renamed from: f */
        public List<String> f45717f = Internal.newMutableList();

        /* renamed from: a */
        public CreatePostRequest build() {
            return new CreatePostRequest(this.f45712a, this.f45713b, this.f45714c, this.f45715d, this.f45716e, this.f45717f, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18350a mo63492a(RichText richText) {
            this.f45713b = richText;
            return this;
        }

        /* renamed from: a */
        public C18350a mo63493a(MediaInfo mediaInfo) {
            this.f45715d = mediaInfo;
            return this;
        }

        /* renamed from: b */
        public C18350a mo63498b(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f45717f = list;
            return this;
        }

        /* renamed from: a */
        public C18350a mo63494a(Boolean bool) {
            this.f45716e = bool;
            return this;
        }

        /* renamed from: a */
        public C18350a mo63495a(String str) {
            this.f45712a = str;
            return this;
        }

        /* renamed from: a */
        public C18350a mo63496a(List<ImageInfo> list) {
            Internal.checkElementsNotNull(list);
            this.f45714c = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "CreatePostRequest");
        StringBuilder sb = new StringBuilder();
        if (this.circle_id != null) {
            sb.append(", circle_id=");
            sb.append(this.circle_id);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (!this.image_info_list.isEmpty()) {
            sb.append(", image_info_list=");
            sb.append(this.image_info_list);
        }
        if (this.media_info != null) {
            sb.append(", media_info=");
            sb.append(this.media_info);
        }
        if (this.is_anonymous != null) {
            sb.append(", is_anonymous=");
            sb.append(this.is_anonymous);
        }
        if (!this.category_ids.isEmpty()) {
            sb.append(", category_ids=");
            sb.append(this.category_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "CreatePostRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreatePostRequest(String str, RichText richText, List<ImageInfo> list, MediaInfo mediaInfo, Boolean bool, List<String> list2) {
        this(str, richText, list, mediaInfo, bool, list2, ByteString.EMPTY);
    }

    public CreatePostRequest(String str, RichText richText, List<ImageInfo> list, MediaInfo mediaInfo, Boolean bool, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.circle_id = str;
        this.content = richText;
        this.image_info_list = Internal.immutableCopyOf("image_info_list", list);
        this.media_info = mediaInfo;
        this.is_anonymous = bool;
        this.category_ids = Internal.immutableCopyOf("category_ids", list2);
    }
}
