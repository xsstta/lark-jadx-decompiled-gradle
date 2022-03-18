package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.basic.v1.RichText;
import com.bytedance.lark.pb.basic.v1.UrlPreviewHangPoint;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class Post extends Message<Post, C18496a> {
    public static final ProtoAdapter<Post> ADAPTER = new C18497b();
    public static final Boolean DEFAULT_CAN_ADMINISTRATE = false;
    public static final Boolean DEFAULT_CAN_ADMINISTRATE_AS_CATEGORY_ADMINISTRATOR = false;
    public static final Boolean DEFAULT_CAN_COMMENT = false;
    public static final Boolean DEFAULT_CAN_DELETE = false;
    public static final Boolean DEFAULT_CAN_REACTION = false;
    public static final Boolean DEFAULT_CAN_REPORT = false;
    public static final Long DEFAULT_CREATE_TIME_MSEC = 0L;
    public static final PostDistributionType DEFAULT_DISTRIBUTION_TYPE = PostDistributionType.NORMAL;
    public static final InCategoryDistributionType DEFAULT_IN_CATEGORY_DISTRIBUTION_TYPE = InCategoryDistributionType.IN_CATEGORY_NORMAL;
    public static final Boolean DEFAULT_IN_CATEGORY_WAIT_APPROVAL = false;
    public static final Boolean DEFAULT_IS_ANONYMOUS = false;
    public static final Boolean DEFAULT_IS_BROADCAST = false;
    public static final Boolean DEFAULT_IS_DELETED = false;
    public static final Boolean DEFAULT_IS_HIGHLIGHT = false;
    public static final Boolean DEFAULT_IS_SELF_OWNER = false;
    public static final Boolean DEFAULT_IS_UNDER_REVIEW = false;
    public static final CreateStatus DEFAULT_LOCAL_STATUS = CreateStatus.SUCCESS;
    public static final Integer DEFAULT_MODEL_VERSION = 0;
    public static final Long DEFAULT_PUBLISH_TIME_MSEC = 0L;
    public static final Integer DEFAULT_SHARE_COUNT = 0;
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    public static final Visibility DEFAULT_VISIBILITY = Visibility.ALL;
    private static final long serialVersionUID = 0;
    public final Boolean can_administrate;
    public final Boolean can_administrate_as_category_administrator;
    public final Boolean can_comment;
    public final Boolean can_delete;
    public final Boolean can_reaction;
    public final Boolean can_report;
    public final List<String> category_ids;
    public final String cid;
    public final String circle_id;
    public final CommentSet comment_set;
    public final Long create_time_msec;
    public final DistributionStats distribution_stats;
    public final PostDistributionType distribution_type;
    public final String id;
    public final InCategoryDistributionType in_category_distribution_type;
    public final Boolean in_category_wait_approval;
    public final IncompatibleAction incompatible_action;
    public final Boolean is_anonymous;
    public final Boolean is_broadcast;
    public final Boolean is_deleted;
    public final Boolean is_highlight;
    public final Boolean is_self_owner;
    public final Boolean is_under_review;
    public final CreateStatus local_status;
    public final Integer model_version;
    public final PostContent post_content;
    public final Long publish_time_msec;
    public final ReactionSet reaction_set;
    public final Integer share_count;
    public final Type type;
    public final Map<String, UrlPreviewHangPoint> url_preview_hang_point_map;
    public final String user_id;
    public final Visibility visibility;

    public enum CreateStatus implements WireEnum {
        SUCCESS(0),
        SENDING(1),
        FAILED(2),
        ERROR(3);
        
        public static final ProtoAdapter<CreateStatus> ADAPTER = ProtoAdapter.newEnumAdapter(CreateStatus.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static CreateStatus fromValue(int i) {
            if (i == 0) {
                return SUCCESS;
            }
            if (i == 1) {
                return SENDING;
            }
            if (i == 2) {
                return FAILED;
            }
            if (i != 3) {
                return null;
            }
            return ERROR;
        }

        private CreateStatus(int i) {
            this.value = i;
        }
    }

    public enum InCategoryDistributionType implements WireEnum {
        IN_CATEGORY_NORMAL(0),
        IN_CATEGORY_APPROVED(1),
        IN_CATEGORY_BLOCKED(2),
        IN_CATEGORY_INCREASE_DISTRIBUTION(3);
        
        public static final ProtoAdapter<InCategoryDistributionType> ADAPTER = ProtoAdapter.newEnumAdapter(InCategoryDistributionType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static InCategoryDistributionType fromValue(int i) {
            if (i == 0) {
                return IN_CATEGORY_NORMAL;
            }
            if (i == 1) {
                return IN_CATEGORY_APPROVED;
            }
            if (i == 2) {
                return IN_CATEGORY_BLOCKED;
            }
            if (i != 3) {
                return null;
            }
            return IN_CATEGORY_INCREASE_DISTRIBUTION;
        }

        private InCategoryDistributionType(int i) {
            this.value = i;
        }
    }

    public enum PostDistributionType implements WireEnum {
        NORMAL(0),
        INCREASE_DISTRIBUTION(1),
        REDUCE_DISTRIBUTION(2),
        NOT_DISTRIBUTION(3),
        ONLY_AUTHOR_VISIBLE(4),
        INCREASE_DISTRIBUTION_FOLLOW_PERMISSION(5);
        
        public static final ProtoAdapter<PostDistributionType> ADAPTER = ProtoAdapter.newEnumAdapter(PostDistributionType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static PostDistributionType fromValue(int i) {
            if (i == 0) {
                return NORMAL;
            }
            if (i == 1) {
                return INCREASE_DISTRIBUTION;
            }
            if (i == 2) {
                return REDUCE_DISTRIBUTION;
            }
            if (i == 3) {
                return NOT_DISTRIBUTION;
            }
            if (i == 4) {
                return ONLY_AUTHOR_VISIBLE;
            }
            if (i != 5) {
                return null;
            }
            return INCREASE_DISTRIBUTION_FOLLOW_PERMISSION;
        }

        private PostDistributionType(int i) {
            this.value = i;
        }
    }

    public enum Type implements WireEnum {
        UNKNOWN(0),
        POST(1);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return POST;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public static final class DistributionStats extends Message<DistributionStats, C18492a> {
        public static final ProtoAdapter<DistributionStats> ADAPTER = new C18493b();
        public static final Integer DEFAULT_COUNT = 0;
        public static final Integer DEFAULT_THRESHOLD = 0;
        private static final long serialVersionUID = 0;
        public final Integer count;
        public final Integer threshold;

        /* renamed from: com.bytedance.lark.pb.moments.v1.Post$DistributionStats$b */
        private static final class C18493b extends ProtoAdapter<DistributionStats> {
            C18493b() {
                super(FieldEncoding.LENGTH_DELIMITED, DistributionStats.class);
            }

            /* renamed from: a */
            public int encodedSize(DistributionStats distributionStats) {
                int i;
                int i2 = 0;
                if (distributionStats.threshold != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(1, distributionStats.threshold);
                } else {
                    i = 0;
                }
                if (distributionStats.count != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, distributionStats.count);
                }
                return i + i2 + distributionStats.unknownFields().size();
            }

            /* renamed from: a */
            public DistributionStats decode(ProtoReader protoReader) throws IOException {
                C18492a aVar = new C18492a();
                aVar.f45923a = 0;
                aVar.f45924b = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f45923a = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f45924b = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, DistributionStats distributionStats) throws IOException {
                if (distributionStats.threshold != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, distributionStats.threshold);
                }
                if (distributionStats.count != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, distributionStats.count);
                }
                protoWriter.writeBytes(distributionStats.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.moments.v1.Post$DistributionStats$a */
        public static final class C18492a extends Message.Builder<DistributionStats, C18492a> {

            /* renamed from: a */
            public Integer f45923a;

            /* renamed from: b */
            public Integer f45924b;

            /* renamed from: a */
            public DistributionStats build() {
                return new DistributionStats(this.f45923a, this.f45924b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18492a newBuilder() {
            C18492a aVar = new C18492a();
            aVar.f45923a = this.threshold;
            aVar.f45924b = this.count;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("moments", "DistributionStats");
            StringBuilder sb = new StringBuilder();
            if (this.threshold != null) {
                sb.append(", threshold=");
                sb.append(this.threshold);
            }
            if (this.count != null) {
                sb.append(", count=");
                sb.append(this.count);
            }
            StringBuilder replace = sb.replace(0, 2, "DistributionStats{");
            replace.append('}');
            return replace.toString();
        }

        public DistributionStats(Integer num, Integer num2) {
            this(num, num2, ByteString.EMPTY);
        }

        public DistributionStats(Integer num, Integer num2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.threshold = num;
            this.count = num2;
        }
    }

    public static final class PostContent extends Message<PostContent, C18494a> {
        public static final ProtoAdapter<PostContent> ADAPTER = new C18495b();
        private static final long serialVersionUID = 0;
        public final RichText content;
        public final List<ImageSet> image_set_list;
        public final List<Link> link_list;
        public final Media media;

        /* renamed from: com.bytedance.lark.pb.moments.v1.Post$PostContent$b */
        private static final class C18495b extends ProtoAdapter<PostContent> {
            C18495b() {
                super(FieldEncoding.LENGTH_DELIMITED, PostContent.class);
            }

            /* renamed from: a */
            public int encodedSize(PostContent postContent) {
                int i;
                int i2 = 0;
                if (postContent.content != null) {
                    i = RichText.ADAPTER.encodedSizeWithTag(1, postContent.content);
                } else {
                    i = 0;
                }
                int encodedSizeWithTag = i + Link.ADAPTER.asRepeated().encodedSizeWithTag(2, postContent.link_list) + ImageSet.ADAPTER.asRepeated().encodedSizeWithTag(3, postContent.image_set_list);
                if (postContent.media != null) {
                    i2 = Media.ADAPTER.encodedSizeWithTag(4, postContent.media);
                }
                return encodedSizeWithTag + i2 + postContent.unknownFields().size();
            }

            /* renamed from: a */
            public PostContent decode(ProtoReader protoReader) throws IOException {
                C18494a aVar = new C18494a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f45925a = RichText.ADAPTER.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f45926b.add(Link.ADAPTER.decode(protoReader));
                    } else if (nextTag == 3) {
                        aVar.f45927c.add(ImageSet.ADAPTER.decode(protoReader));
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f45928d = Media.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, PostContent postContent) throws IOException {
                if (postContent.content != null) {
                    RichText.ADAPTER.encodeWithTag(protoWriter, 1, postContent.content);
                }
                Link.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, postContent.link_list);
                ImageSet.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, postContent.image_set_list);
                if (postContent.media != null) {
                    Media.ADAPTER.encodeWithTag(protoWriter, 4, postContent.media);
                }
                protoWriter.writeBytes(postContent.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.moments.v1.Post$PostContent$a */
        public static final class C18494a extends Message.Builder<PostContent, C18494a> {

            /* renamed from: a */
            public RichText f45925a;

            /* renamed from: b */
            public List<Link> f45926b = Internal.newMutableList();

            /* renamed from: c */
            public List<ImageSet> f45927c = Internal.newMutableList();

            /* renamed from: d */
            public Media f45928d;

            /* renamed from: a */
            public PostContent build() {
                return new PostContent(this.f45925a, this.f45926b, this.f45927c, this.f45928d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18494a newBuilder() {
            C18494a aVar = new C18494a();
            aVar.f45925a = this.content;
            aVar.f45926b = Internal.copyOf("link_list", this.link_list);
            aVar.f45927c = Internal.copyOf("image_set_list", this.image_set_list);
            aVar.f45928d = this.media;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("moments", "PostContent");
            StringBuilder sb = new StringBuilder();
            if (this.content != null) {
                sb.append(", content=");
                sb.append(this.content);
            }
            if (!this.link_list.isEmpty()) {
                sb.append(", link_list=");
                sb.append(this.link_list);
            }
            if (!this.image_set_list.isEmpty()) {
                sb.append(", image_set_list=");
                sb.append(this.image_set_list);
            }
            if (this.media != null) {
                sb.append(", media=");
                sb.append(this.media);
            }
            StringBuilder replace = sb.replace(0, 2, "PostContent{");
            replace.append('}');
            return replace.toString();
        }

        public PostContent(RichText richText, List<Link> list, List<ImageSet> list2, Media media2) {
            this(richText, list, list2, media2, ByteString.EMPTY);
        }

        public PostContent(RichText richText, List<Link> list, List<ImageSet> list2, Media media2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.content = richText;
            this.link_list = Internal.immutableCopyOf("link_list", list);
            this.image_set_list = Internal.immutableCopyOf("image_set_list", list2);
            this.media = media2;
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.Post$b */
    private static final class C18497b extends ProtoAdapter<Post> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, UrlPreviewHangPoint>> f45962a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, UrlPreviewHangPoint.ADAPTER);

        C18497b() {
            super(FieldEncoding.LENGTH_DELIMITED, Post.class);
        }

        /* renamed from: a */
        public int encodedSize(Post post) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            int i28;
            int i29;
            int i30;
            int i31 = 0;
            if (post.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, post.id);
            } else {
                i = 0;
            }
            if (post.circle_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, post.circle_id);
            } else {
                i2 = 0;
            }
            int i32 = i + i2;
            if (post.user_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, post.user_id);
            } else {
                i3 = 0;
            }
            int i33 = i32 + i3;
            if (post.cid != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, post.cid);
            } else {
                i4 = 0;
            }
            int i34 = i33 + i4;
            if (post.type != null) {
                i5 = Type.ADAPTER.encodedSizeWithTag(10, post.type);
            } else {
                i5 = 0;
            }
            int i35 = i34 + i5;
            if (post.post_content != null) {
                i6 = PostContent.ADAPTER.encodedSizeWithTag(11, post.post_content);
            } else {
                i6 = 0;
            }
            int encodedSizeWithTag = i35 + i6 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(12, post.category_ids);
            if (post.model_version != null) {
                i7 = ProtoAdapter.INT32.encodedSizeWithTag(21, post.model_version);
            } else {
                i7 = 0;
            }
            int i36 = encodedSizeWithTag + i7;
            if (post.incompatible_action != null) {
                i8 = IncompatibleAction.ADAPTER.encodedSizeWithTag(22, post.incompatible_action);
            } else {
                i8 = 0;
            }
            int i37 = i36 + i8;
            if (post.create_time_msec != null) {
                i9 = ProtoAdapter.INT64.encodedSizeWithTag(23, post.create_time_msec);
            } else {
                i9 = 0;
            }
            int i38 = i37 + i9;
            if (post.publish_time_msec != null) {
                i10 = ProtoAdapter.INT64.encodedSizeWithTag(24, post.publish_time_msec);
            } else {
                i10 = 0;
            }
            int i39 = i38 + i10;
            if (post.visibility != null) {
                i11 = Visibility.ADAPTER.encodedSizeWithTag(25, post.visibility);
            } else {
                i11 = 0;
            }
            int i40 = i39 + i11;
            if (post.is_anonymous != null) {
                i12 = ProtoAdapter.BOOL.encodedSizeWithTag(26, post.is_anonymous);
            } else {
                i12 = 0;
            }
            int i41 = i40 + i12;
            if (post.is_highlight != null) {
                i13 = ProtoAdapter.BOOL.encodedSizeWithTag(27, post.is_highlight);
            } else {
                i13 = 0;
            }
            int i42 = i41 + i13;
            if (post.is_broadcast != null) {
                i14 = ProtoAdapter.BOOL.encodedSizeWithTag(28, post.is_broadcast);
            } else {
                i14 = 0;
            }
            int i43 = i42 + i14;
            if (post.is_under_review != null) {
                i15 = ProtoAdapter.BOOL.encodedSizeWithTag(29, post.is_under_review);
            } else {
                i15 = 0;
            }
            int i44 = i43 + i15;
            if (post.is_self_owner != null) {
                i16 = ProtoAdapter.BOOL.encodedSizeWithTag(30, post.is_self_owner);
            } else {
                i16 = 0;
            }
            int i45 = i44 + i16;
            if (post.share_count != null) {
                i17 = ProtoAdapter.INT32.encodedSizeWithTag(31, post.share_count);
            } else {
                i17 = 0;
            }
            int i46 = i45 + i17;
            if (post.is_deleted != null) {
                i18 = ProtoAdapter.BOOL.encodedSizeWithTag(32, post.is_deleted);
            } else {
                i18 = 0;
            }
            int i47 = i46 + i18;
            if (post.distribution_type != null) {
                i19 = PostDistributionType.ADAPTER.encodedSizeWithTag(33, post.distribution_type);
            } else {
                i19 = 0;
            }
            int i48 = i47 + i19;
            if (post.in_category_distribution_type != null) {
                i20 = InCategoryDistributionType.ADAPTER.encodedSizeWithTag(34, post.in_category_distribution_type);
            } else {
                i20 = 0;
            }
            int i49 = i48 + i20;
            if (post.distribution_stats != null) {
                i21 = DistributionStats.ADAPTER.encodedSizeWithTag(35, post.distribution_stats);
            } else {
                i21 = 0;
            }
            int i50 = i49 + i21;
            if (post.local_status != null) {
                i22 = CreateStatus.ADAPTER.encodedSizeWithTag(51, post.local_status);
            } else {
                i22 = 0;
            }
            int i51 = i50 + i22;
            if (post.can_comment != null) {
                i23 = ProtoAdapter.BOOL.encodedSizeWithTag(101, post.can_comment);
            } else {
                i23 = 0;
            }
            int i52 = i51 + i23;
            if (post.can_reaction != null) {
                i24 = ProtoAdapter.BOOL.encodedSizeWithTag(102, post.can_reaction);
            } else {
                i24 = 0;
            }
            int i53 = i52 + i24;
            if (post.can_report != null) {
                i25 = ProtoAdapter.BOOL.encodedSizeWithTag(103, post.can_report);
            } else {
                i25 = 0;
            }
            int i54 = i53 + i25;
            if (post.can_delete != null) {
                i26 = ProtoAdapter.BOOL.encodedSizeWithTag(104, post.can_delete);
            } else {
                i26 = 0;
            }
            int i55 = i54 + i26;
            if (post.can_administrate != null) {
                i27 = ProtoAdapter.BOOL.encodedSizeWithTag(LocationRequest.PRIORITY_NO_POWER, post.can_administrate);
            } else {
                i27 = 0;
            }
            int i56 = i55 + i27;
            if (post.can_administrate_as_category_administrator != null) {
                i28 = ProtoAdapter.BOOL.encodedSizeWithTag(106, post.can_administrate_as_category_administrator);
            } else {
                i28 = 0;
            }
            int i57 = i56 + i28;
            if (post.in_category_wait_approval != null) {
                i29 = ProtoAdapter.BOOL.encodedSizeWithTag(ActivityIdentificationData.WALKING, post.in_category_wait_approval);
            } else {
                i29 = 0;
            }
            int i58 = i57 + i29;
            if (post.comment_set != null) {
                i30 = CommentSet.ADAPTER.encodedSizeWithTag(SmActions.ACTION_RINGING_ENTRY, post.comment_set);
            } else {
                i30 = 0;
            }
            int i59 = i58 + i30;
            if (post.reaction_set != null) {
                i31 = ReactionSet.ADAPTER.encodedSizeWithTag(SmActions.ACTION_RINGING_EXIT, post.reaction_set);
            }
            return i59 + i31 + this.f45962a.encodedSizeWithTag(SmActions.ACTION_ONTHECALL_ENTRY, post.url_preview_hang_point_map) + post.unknownFields().size();
        }

        /* renamed from: a */
        public Post decode(ProtoReader protoReader) throws IOException {
            C18496a aVar = new C18496a();
            aVar.f45936a = "";
            aVar.f45937b = "";
            aVar.f45938c = "";
            aVar.f45939d = "";
            aVar.f45940e = Type.UNKNOWN;
            aVar.f45943h = 0;
            aVar.f45945j = 0L;
            aVar.f45946k = 0L;
            aVar.f45947l = Visibility.ALL;
            aVar.f45948m = false;
            aVar.f45949n = false;
            aVar.f45950o = false;
            aVar.f45951p = false;
            aVar.f45952q = false;
            aVar.f45953r = 0;
            aVar.f45954s = false;
            aVar.f45955t = PostDistributionType.NORMAL;
            aVar.f45956u = InCategoryDistributionType.IN_CATEGORY_NORMAL;
            aVar.f45958w = CreateStatus.SUCCESS;
            aVar.f45959x = false;
            aVar.f45960y = false;
            aVar.f45961z = false;
            aVar.f45929A = false;
            aVar.f45930B = false;
            aVar.f45931C = false;
            aVar.f45932D = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45936a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45937b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45938c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f45939d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 51) {
                    switch (nextTag) {
                        case 10:
                            try {
                                aVar.f45940e = Type.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 11:
                            aVar.f45941f = PostContent.ADAPTER.decode(protoReader);
                            continue;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f45942g.add(ProtoAdapter.STRING.decode(protoReader));
                            continue;
                        default:
                            switch (nextTag) {
                                case 21:
                                    aVar.f45943h = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case 22:
                                    aVar.f45944i = IncompatibleAction.ADAPTER.decode(protoReader);
                                    continue;
                                case 23:
                                    aVar.f45945j = ProtoAdapter.INT64.decode(protoReader);
                                    continue;
                                case 24:
                                    aVar.f45946k = ProtoAdapter.INT64.decode(protoReader);
                                    continue;
                                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                                    try {
                                        aVar.f45947l = Visibility.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                        break;
                                    }
                                case 26:
                                    aVar.f45948m = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                                    aVar.f45949n = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                                    aVar.f45950o = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 29:
                                    aVar.f45951p = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 30:
                                    aVar.f45952q = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                                    aVar.f45953r = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case 32:
                                    aVar.f45954s = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 33:
                                    try {
                                        aVar.f45955t = PostDistributionType.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                        break;
                                    }
                                case 34:
                                    try {
                                        aVar.f45956u = InCategoryDistributionType.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                        break;
                                    }
                                case 35:
                                    aVar.f45957v = DistributionStats.ADAPTER.decode(protoReader);
                                    continue;
                                default:
                                    switch (nextTag) {
                                        case 101:
                                            aVar.f45959x = ProtoAdapter.BOOL.decode(protoReader);
                                            continue;
                                        case 102:
                                            aVar.f45960y = ProtoAdapter.BOOL.decode(protoReader);
                                            continue;
                                        case 103:
                                            aVar.f45961z = ProtoAdapter.BOOL.decode(protoReader);
                                            continue;
                                        case 104:
                                            aVar.f45929A = ProtoAdapter.BOOL.decode(protoReader);
                                            continue;
                                        case LocationRequest.PRIORITY_NO_POWER /*{ENCODED_INT: 105}*/:
                                            aVar.f45930B = ProtoAdapter.BOOL.decode(protoReader);
                                            continue;
                                        case 106:
                                            aVar.f45931C = ProtoAdapter.BOOL.decode(protoReader);
                                            continue;
                                        case ActivityIdentificationData.WALKING /*{ENCODED_INT: 107}*/:
                                            aVar.f45932D = ProtoAdapter.BOOL.decode(protoReader);
                                            continue;
                                        default:
                                            switch (nextTag) {
                                                case SmActions.ACTION_RINGING_ENTRY /*{ENCODED_INT: 125}*/:
                                                    aVar.f45933E = CommentSet.ADAPTER.decode(protoReader);
                                                    continue;
                                                case SmActions.ACTION_RINGING_EXIT /*{ENCODED_INT: 126}*/:
                                                    aVar.f45934F = ReactionSet.ADAPTER.decode(protoReader);
                                                    continue;
                                                case SmActions.ACTION_ONTHECALL_ENTRY /*{ENCODED_INT: 127}*/:
                                                    aVar.f45935G.putAll(this.f45962a.decode(protoReader));
                                                    continue;
                                                default:
                                                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                            }
                                    }
                            }
                    }
                } else {
                    try {
                        aVar.f45958w = CreateStatus.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e5.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Post post) throws IOException {
            if (post.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, post.id);
            }
            if (post.circle_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, post.circle_id);
            }
            if (post.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, post.user_id);
            }
            if (post.cid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, post.cid);
            }
            if (post.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 10, post.type);
            }
            if (post.post_content != null) {
                PostContent.ADAPTER.encodeWithTag(protoWriter, 11, post.post_content);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 12, post.category_ids);
            if (post.model_version != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 21, post.model_version);
            }
            if (post.incompatible_action != null) {
                IncompatibleAction.ADAPTER.encodeWithTag(protoWriter, 22, post.incompatible_action);
            }
            if (post.create_time_msec != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 23, post.create_time_msec);
            }
            if (post.publish_time_msec != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 24, post.publish_time_msec);
            }
            if (post.visibility != null) {
                Visibility.ADAPTER.encodeWithTag(protoWriter, 25, post.visibility);
            }
            if (post.is_anonymous != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 26, post.is_anonymous);
            }
            if (post.is_highlight != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 27, post.is_highlight);
            }
            if (post.is_broadcast != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 28, post.is_broadcast);
            }
            if (post.is_under_review != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 29, post.is_under_review);
            }
            if (post.is_self_owner != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 30, post.is_self_owner);
            }
            if (post.share_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 31, post.share_count);
            }
            if (post.is_deleted != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 32, post.is_deleted);
            }
            if (post.distribution_type != null) {
                PostDistributionType.ADAPTER.encodeWithTag(protoWriter, 33, post.distribution_type);
            }
            if (post.in_category_distribution_type != null) {
                InCategoryDistributionType.ADAPTER.encodeWithTag(protoWriter, 34, post.in_category_distribution_type);
            }
            if (post.distribution_stats != null) {
                DistributionStats.ADAPTER.encodeWithTag(protoWriter, 35, post.distribution_stats);
            }
            if (post.local_status != null) {
                CreateStatus.ADAPTER.encodeWithTag(protoWriter, 51, post.local_status);
            }
            if (post.can_comment != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 101, post.can_comment);
            }
            if (post.can_reaction != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 102, post.can_reaction);
            }
            if (post.can_report != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 103, post.can_report);
            }
            if (post.can_delete != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 104, post.can_delete);
            }
            if (post.can_administrate != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, LocationRequest.PRIORITY_NO_POWER, post.can_administrate);
            }
            if (post.can_administrate_as_category_administrator != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 106, post.can_administrate_as_category_administrator);
            }
            if (post.in_category_wait_approval != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, ActivityIdentificationData.WALKING, post.in_category_wait_approval);
            }
            if (post.comment_set != null) {
                CommentSet.ADAPTER.encodeWithTag(protoWriter, SmActions.ACTION_RINGING_ENTRY, post.comment_set);
            }
            if (post.reaction_set != null) {
                ReactionSet.ADAPTER.encodeWithTag(protoWriter, SmActions.ACTION_RINGING_EXIT, post.reaction_set);
            }
            this.f45962a.encodeWithTag(protoWriter, SmActions.ACTION_ONTHECALL_ENTRY, post.url_preview_hang_point_map);
            protoWriter.writeBytes(post.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.Post$a */
    public static final class C18496a extends Message.Builder<Post, C18496a> {

        /* renamed from: A */
        public Boolean f45929A;

        /* renamed from: B */
        public Boolean f45930B;

        /* renamed from: C */
        public Boolean f45931C;

        /* renamed from: D */
        public Boolean f45932D;

        /* renamed from: E */
        public CommentSet f45933E;

        /* renamed from: F */
        public ReactionSet f45934F;

        /* renamed from: G */
        public Map<String, UrlPreviewHangPoint> f45935G = Internal.newMutableMap();

        /* renamed from: a */
        public String f45936a;

        /* renamed from: b */
        public String f45937b;

        /* renamed from: c */
        public String f45938c;

        /* renamed from: d */
        public String f45939d;

        /* renamed from: e */
        public Type f45940e;

        /* renamed from: f */
        public PostContent f45941f;

        /* renamed from: g */
        public List<String> f45942g = Internal.newMutableList();

        /* renamed from: h */
        public Integer f45943h;

        /* renamed from: i */
        public IncompatibleAction f45944i;

        /* renamed from: j */
        public Long f45945j;

        /* renamed from: k */
        public Long f45946k;

        /* renamed from: l */
        public Visibility f45947l;

        /* renamed from: m */
        public Boolean f45948m;

        /* renamed from: n */
        public Boolean f45949n;

        /* renamed from: o */
        public Boolean f45950o;

        /* renamed from: p */
        public Boolean f45951p;

        /* renamed from: q */
        public Boolean f45952q;

        /* renamed from: r */
        public Integer f45953r;

        /* renamed from: s */
        public Boolean f45954s;

        /* renamed from: t */
        public PostDistributionType f45955t;

        /* renamed from: u */
        public InCategoryDistributionType f45956u;

        /* renamed from: v */
        public DistributionStats f45957v;

        /* renamed from: w */
        public CreateStatus f45958w;

        /* renamed from: x */
        public Boolean f45959x;

        /* renamed from: y */
        public Boolean f45960y;

        /* renamed from: z */
        public Boolean f45961z;

        /* renamed from: a */
        public Post build() {
            return new Post(this.f45936a, this.f45937b, this.f45938c, this.f45939d, this.f45940e, this.f45941f, this.f45942g, this.f45943h, this.f45944i, this.f45945j, this.f45946k, this.f45947l, this.f45948m, this.f45949n, this.f45950o, this.f45951p, this.f45952q, this.f45953r, this.f45954s, this.f45955t, this.f45956u, this.f45957v, this.f45958w, this.f45959x, this.f45960y, this.f45961z, this.f45929A, this.f45930B, this.f45931C, this.f45932D, this.f45933E, this.f45934F, this.f45935G, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18496a mo63857a(CommentSet commentSet) {
            this.f45933E = commentSet;
            return this;
        }

        /* renamed from: a */
        public C18496a mo63858a(CreateStatus createStatus) {
            this.f45958w = createStatus;
            return this;
        }

        /* renamed from: a */
        public C18496a mo63859a(PostDistributionType postDistributionType) {
            this.f45955t = postDistributionType;
            return this;
        }

        /* renamed from: a */
        public C18496a mo63860a(ReactionSet reactionSet) {
            this.f45934F = reactionSet;
            return this;
        }

        /* renamed from: a */
        public C18496a mo63861a(Boolean bool) {
            this.f45950o = bool;
            return this;
        }

        /* renamed from: a */
        public C18496a mo63862a(Integer num) {
            this.f45953r = num;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18496a newBuilder() {
        C18496a aVar = new C18496a();
        aVar.f45936a = this.id;
        aVar.f45937b = this.circle_id;
        aVar.f45938c = this.user_id;
        aVar.f45939d = this.cid;
        aVar.f45940e = this.type;
        aVar.f45941f = this.post_content;
        aVar.f45942g = Internal.copyOf("category_ids", this.category_ids);
        aVar.f45943h = this.model_version;
        aVar.f45944i = this.incompatible_action;
        aVar.f45945j = this.create_time_msec;
        aVar.f45946k = this.publish_time_msec;
        aVar.f45947l = this.visibility;
        aVar.f45948m = this.is_anonymous;
        aVar.f45949n = this.is_highlight;
        aVar.f45950o = this.is_broadcast;
        aVar.f45951p = this.is_under_review;
        aVar.f45952q = this.is_self_owner;
        aVar.f45953r = this.share_count;
        aVar.f45954s = this.is_deleted;
        aVar.f45955t = this.distribution_type;
        aVar.f45956u = this.in_category_distribution_type;
        aVar.f45957v = this.distribution_stats;
        aVar.f45958w = this.local_status;
        aVar.f45959x = this.can_comment;
        aVar.f45960y = this.can_reaction;
        aVar.f45961z = this.can_report;
        aVar.f45929A = this.can_delete;
        aVar.f45930B = this.can_administrate;
        aVar.f45931C = this.can_administrate_as_category_administrator;
        aVar.f45932D = this.in_category_wait_approval;
        aVar.f45933E = this.comment_set;
        aVar.f45934F = this.reaction_set;
        aVar.f45935G = Internal.copyOf("url_preview_hang_point_map", this.url_preview_hang_point_map);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "Post");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.circle_id != null) {
            sb.append(", circle_id=");
            sb.append(this.circle_id);
        }
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.cid != null) {
            sb.append(", cid=");
            sb.append(this.cid);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.post_content != null) {
            sb.append(", post_content=");
            sb.append(this.post_content);
        }
        if (!this.category_ids.isEmpty()) {
            sb.append(", category_ids=");
            sb.append(this.category_ids);
        }
        if (this.model_version != null) {
            sb.append(", model_version=");
            sb.append(this.model_version);
        }
        if (this.incompatible_action != null) {
            sb.append(", incompatible_action=");
            sb.append(this.incompatible_action);
        }
        if (this.create_time_msec != null) {
            sb.append(", create_time_msec=");
            sb.append(this.create_time_msec);
        }
        if (this.publish_time_msec != null) {
            sb.append(", publish_time_msec=");
            sb.append(this.publish_time_msec);
        }
        if (this.visibility != null) {
            sb.append(", visibility=");
            sb.append(this.visibility);
        }
        if (this.is_anonymous != null) {
            sb.append(", is_anonymous=");
            sb.append(this.is_anonymous);
        }
        if (this.is_highlight != null) {
            sb.append(", is_highlight=");
            sb.append(this.is_highlight);
        }
        if (this.is_broadcast != null) {
            sb.append(", is_broadcast=");
            sb.append(this.is_broadcast);
        }
        if (this.is_under_review != null) {
            sb.append(", is_under_review=");
            sb.append(this.is_under_review);
        }
        if (this.is_self_owner != null) {
            sb.append(", is_self_owner=");
            sb.append(this.is_self_owner);
        }
        if (this.share_count != null) {
            sb.append(", share_count=");
            sb.append(this.share_count);
        }
        if (this.is_deleted != null) {
            sb.append(", is_deleted=");
            sb.append(this.is_deleted);
        }
        if (this.distribution_type != null) {
            sb.append(", distribution_type=");
            sb.append(this.distribution_type);
        }
        if (this.in_category_distribution_type != null) {
            sb.append(", in_category_distribution_type=");
            sb.append(this.in_category_distribution_type);
        }
        if (this.distribution_stats != null) {
            sb.append(", distribution_stats=");
            sb.append(this.distribution_stats);
        }
        if (this.local_status != null) {
            sb.append(", local_status=");
            sb.append(this.local_status);
        }
        if (this.can_comment != null) {
            sb.append(", can_comment=");
            sb.append(this.can_comment);
        }
        if (this.can_reaction != null) {
            sb.append(", can_reaction=");
            sb.append(this.can_reaction);
        }
        if (this.can_report != null) {
            sb.append(", can_report=");
            sb.append(this.can_report);
        }
        if (this.can_delete != null) {
            sb.append(", can_delete=");
            sb.append(this.can_delete);
        }
        if (this.can_administrate != null) {
            sb.append(", can_administrate=");
            sb.append(this.can_administrate);
        }
        if (this.can_administrate_as_category_administrator != null) {
            sb.append(", can_administrate_as_category_administrator=");
            sb.append(this.can_administrate_as_category_administrator);
        }
        if (this.in_category_wait_approval != null) {
            sb.append(", in_category_wait_approval=");
            sb.append(this.in_category_wait_approval);
        }
        if (this.comment_set != null) {
            sb.append(", comment_set=");
            sb.append(this.comment_set);
        }
        if (this.reaction_set != null) {
            sb.append(", reaction_set=");
            sb.append(this.reaction_set);
        }
        if (!this.url_preview_hang_point_map.isEmpty()) {
            sb.append(", url_preview_hang_point_map=");
            sb.append(this.url_preview_hang_point_map);
        }
        StringBuilder replace = sb.replace(0, 2, "Post{");
        replace.append('}');
        return replace.toString();
    }

    public Post(String str, String str2, String str3, String str4, Type type2, PostContent postContent, List<String> list, Integer num, IncompatibleAction incompatibleAction, Long l, Long l2, Visibility visibility2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num2, Boolean bool6, PostDistributionType postDistributionType, InCategoryDistributionType inCategoryDistributionType, DistributionStats distributionStats, CreateStatus createStatus, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, CommentSet commentSet, ReactionSet reactionSet, Map<String, UrlPreviewHangPoint> map) {
        this(str, str2, str3, str4, type2, postContent, list, num, incompatibleAction, l, l2, visibility2, bool, bool2, bool3, bool4, bool5, num2, bool6, postDistributionType, inCategoryDistributionType, distributionStats, createStatus, bool7, bool8, bool9, bool10, bool11, bool12, bool13, commentSet, reactionSet, map, ByteString.EMPTY);
    }

    public Post(String str, String str2, String str3, String str4, Type type2, PostContent postContent, List<String> list, Integer num, IncompatibleAction incompatibleAction, Long l, Long l2, Visibility visibility2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num2, Boolean bool6, PostDistributionType postDistributionType, InCategoryDistributionType inCategoryDistributionType, DistributionStats distributionStats, CreateStatus createStatus, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, CommentSet commentSet, ReactionSet reactionSet, Map<String, UrlPreviewHangPoint> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.circle_id = str2;
        this.user_id = str3;
        this.cid = str4;
        this.type = type2;
        this.post_content = postContent;
        this.category_ids = Internal.immutableCopyOf("category_ids", list);
        this.model_version = num;
        this.incompatible_action = incompatibleAction;
        this.create_time_msec = l;
        this.publish_time_msec = l2;
        this.visibility = visibility2;
        this.is_anonymous = bool;
        this.is_highlight = bool2;
        this.is_broadcast = bool3;
        this.is_under_review = bool4;
        this.is_self_owner = bool5;
        this.share_count = num2;
        this.is_deleted = bool6;
        this.distribution_type = postDistributionType;
        this.in_category_distribution_type = inCategoryDistributionType;
        this.distribution_stats = distributionStats;
        this.local_status = createStatus;
        this.can_comment = bool7;
        this.can_reaction = bool8;
        this.can_report = bool9;
        this.can_delete = bool10;
        this.can_administrate = bool11;
        this.can_administrate_as_category_administrator = bool12;
        this.in_category_wait_approval = bool13;
        this.comment_set = commentSet;
        this.reaction_set = reactionSet;
        this.url_preview_hang_point_map = Internal.immutableCopyOf("url_preview_hang_point_map", map);
    }
}
