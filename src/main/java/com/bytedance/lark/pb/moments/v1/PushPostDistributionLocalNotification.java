package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.moments.v1.Post;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PushPostDistributionLocalNotification extends Message<PushPostDistributionLocalNotification, C18514a> {
    public static final ProtoAdapter<PushPostDistributionLocalNotification> ADAPTER = new C18515b();
    public static final Post.PostDistributionType DEFAULT_DISTRIBUTION_TYPE = Post.PostDistributionType.NORMAL;
    public static final Post.InCategoryDistributionType DEFAULT_IN_CATEGORY_DISTRIBUTION_TYPE = Post.InCategoryDistributionType.IN_CATEGORY_NORMAL;
    private static final long serialVersionUID = 0;
    public final List<String> category_ids;
    public final Post.PostDistributionType distribution_type;
    public final Post.InCategoryDistributionType in_category_distribution_type;
    public final String post_id;

    /* renamed from: com.bytedance.lark.pb.moments.v1.PushPostDistributionLocalNotification$b */
    private static final class C18515b extends ProtoAdapter<PushPostDistributionLocalNotification> {
        C18515b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushPostDistributionLocalNotification.class);
        }

        /* renamed from: a */
        public int encodedSize(PushPostDistributionLocalNotification pushPostDistributionLocalNotification) {
            int i;
            int i2;
            int i3 = 0;
            if (pushPostDistributionLocalNotification.post_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, pushPostDistributionLocalNotification.post_id);
            } else {
                i = 0;
            }
            if (pushPostDistributionLocalNotification.distribution_type != null) {
                i2 = Post.PostDistributionType.ADAPTER.encodedSizeWithTag(2, pushPostDistributionLocalNotification.distribution_type);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (pushPostDistributionLocalNotification.in_category_distribution_type != null) {
                i3 = Post.InCategoryDistributionType.ADAPTER.encodedSizeWithTag(3, pushPostDistributionLocalNotification.in_category_distribution_type);
            }
            return i4 + i3 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(101, pushPostDistributionLocalNotification.category_ids) + pushPostDistributionLocalNotification.unknownFields().size();
        }

        /* renamed from: a */
        public PushPostDistributionLocalNotification decode(ProtoReader protoReader) throws IOException {
            C18514a aVar = new C18514a();
            aVar.f45987a = "";
            aVar.f45988b = Post.PostDistributionType.NORMAL;
            aVar.f45989c = Post.InCategoryDistributionType.IN_CATEGORY_NORMAL;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45987a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f45988b = Post.PostDistributionType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    try {
                        aVar.f45989c = Post.InCategoryDistributionType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag != 101) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45990d.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushPostDistributionLocalNotification pushPostDistributionLocalNotification) throws IOException {
            if (pushPostDistributionLocalNotification.post_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushPostDistributionLocalNotification.post_id);
            }
            if (pushPostDistributionLocalNotification.distribution_type != null) {
                Post.PostDistributionType.ADAPTER.encodeWithTag(protoWriter, 2, pushPostDistributionLocalNotification.distribution_type);
            }
            if (pushPostDistributionLocalNotification.in_category_distribution_type != null) {
                Post.InCategoryDistributionType.ADAPTER.encodeWithTag(protoWriter, 3, pushPostDistributionLocalNotification.in_category_distribution_type);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 101, pushPostDistributionLocalNotification.category_ids);
            protoWriter.writeBytes(pushPostDistributionLocalNotification.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.PushPostDistributionLocalNotification$a */
    public static final class C18514a extends Message.Builder<PushPostDistributionLocalNotification, C18514a> {

        /* renamed from: a */
        public String f45987a;

        /* renamed from: b */
        public Post.PostDistributionType f45988b;

        /* renamed from: c */
        public Post.InCategoryDistributionType f45989c;

        /* renamed from: d */
        public List<String> f45990d = Internal.newMutableList();

        /* renamed from: a */
        public PushPostDistributionLocalNotification build() {
            return new PushPostDistributionLocalNotification(this.f45987a, this.f45988b, this.f45989c, this.f45990d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18514a newBuilder() {
        C18514a aVar = new C18514a();
        aVar.f45987a = this.post_id;
        aVar.f45988b = this.distribution_type;
        aVar.f45989c = this.in_category_distribution_type;
        aVar.f45990d = Internal.copyOf("category_ids", this.category_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "PushPostDistributionLocalNotification");
        StringBuilder sb = new StringBuilder();
        if (this.post_id != null) {
            sb.append(", post_id=");
            sb.append(this.post_id);
        }
        if (this.distribution_type != null) {
            sb.append(", distribution_type=");
            sb.append(this.distribution_type);
        }
        if (this.in_category_distribution_type != null) {
            sb.append(", in_category_distribution_type=");
            sb.append(this.in_category_distribution_type);
        }
        if (!this.category_ids.isEmpty()) {
            sb.append(", category_ids=");
            sb.append(this.category_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "PushPostDistributionLocalNotification{");
        replace.append('}');
        return replace.toString();
    }

    public PushPostDistributionLocalNotification(String str, Post.PostDistributionType postDistributionType, Post.InCategoryDistributionType inCategoryDistributionType, List<String> list) {
        this(str, postDistributionType, inCategoryDistributionType, list, ByteString.EMPTY);
    }

    public PushPostDistributionLocalNotification(String str, Post.PostDistributionType postDistributionType, Post.InCategoryDistributionType inCategoryDistributionType, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.post_id = str;
        this.distribution_type = postDistributionType;
        this.in_category_distribution_type = inCategoryDistributionType;
        this.category_ids = Internal.immutableCopyOf("category_ids", list);
    }
}
