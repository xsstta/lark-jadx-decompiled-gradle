package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.basic.v1.RichText;
import com.bytedance.lark.pb.basic.v1.UrlPreviewHangPoint;
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
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class Comment extends Message<Comment, C18338a> {
    public static final ProtoAdapter<Comment> ADAPTER = new C18339b();
    public static final Boolean DEFAULT_CAN_ADMINISTRATE = false;
    public static final Boolean DEFAULT_CAN_COMMENT = false;
    public static final Boolean DEFAULT_CAN_DELETE = false;
    public static final Boolean DEFAULT_CAN_REACTION = false;
    public static final Boolean DEFAULT_CAN_REPORT = false;
    public static final Long DEFAULT_CREATE_TIME_MSEC = 0L;
    public static final Boolean DEFAULT_IS_ANONYMOUS = false;
    public static final Boolean DEFAULT_IS_DELETED = false;
    public static final Boolean DEFAULT_IS_HOT = false;
    public static final Boolean DEFAULT_IS_SELF_OWNER = false;
    public static final Boolean DEFAULT_IS_UNDER_REVIEW = false;
    public static final CreateStatus DEFAULT_LOCAL_STATUS = CreateStatus.SUCCESS;
    public static final Integer DEFAULT_MODEL_VERSION = 0;
    public static final Long DEFAULT_PUBLISH_TIME_MSEC = 0L;
    public static final Visibility DEFAULT_VISIBILITY = Visibility.ALL;
    private static final long serialVersionUID = 0;
    public final Boolean can_administrate;
    public final Boolean can_comment;
    public final Boolean can_delete;
    public final Boolean can_reaction;
    public final Boolean can_report;
    public final String cid;
    public final String circle_id;
    public final CommentSet comment_set;
    public final CommentContent content;
    public final Long create_time_msec;
    public final String id;
    public final IncompatibleAction incompatible_action;
    public final Boolean is_anonymous;
    public final Boolean is_deleted;
    public final Boolean is_hot;
    public final Boolean is_self_owner;
    public final Boolean is_under_review;
    public final CreateStatus local_status;
    public final Integer model_version;
    public final String post_id;
    public final Long publish_time_msec;
    public final ReactionSet reaction_set;
    public final String reply_comment_id;
    public final String reply_comment_user_id;
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

    public static final class CommentContent extends Message<CommentContent, C18336a> {
        public static final ProtoAdapter<CommentContent> ADAPTER = new C18337b();
        private static final long serialVersionUID = 0;
        public final RichText content;
        public final ImageSet image_set;
        public final List<Link> link_list;

        /* renamed from: com.bytedance.lark.pb.moments.v1.Comment$CommentContent$b */
        private static final class C18337b extends ProtoAdapter<CommentContent> {
            C18337b() {
                super(FieldEncoding.LENGTH_DELIMITED, CommentContent.class);
            }

            /* renamed from: a */
            public int encodedSize(CommentContent commentContent) {
                int i;
                int i2 = 0;
                if (commentContent.content != null) {
                    i = RichText.ADAPTER.encodedSizeWithTag(1, commentContent.content);
                } else {
                    i = 0;
                }
                if (commentContent.image_set != null) {
                    i2 = ImageSet.ADAPTER.encodedSizeWithTag(2, commentContent.image_set);
                }
                return i + i2 + Link.ADAPTER.asRepeated().encodedSizeWithTag(3, commentContent.link_list) + commentContent.unknownFields().size();
            }

            /* renamed from: a */
            public CommentContent decode(ProtoReader protoReader) throws IOException {
                C18336a aVar = new C18336a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f45667a = RichText.ADAPTER.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f45668b = ImageSet.ADAPTER.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f45669c.add(Link.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, CommentContent commentContent) throws IOException {
                if (commentContent.content != null) {
                    RichText.ADAPTER.encodeWithTag(protoWriter, 1, commentContent.content);
                }
                if (commentContent.image_set != null) {
                    ImageSet.ADAPTER.encodeWithTag(protoWriter, 2, commentContent.image_set);
                }
                Link.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, commentContent.link_list);
                protoWriter.writeBytes(commentContent.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.moments.v1.Comment$CommentContent$a */
        public static final class C18336a extends Message.Builder<CommentContent, C18336a> {

            /* renamed from: a */
            public RichText f45667a;

            /* renamed from: b */
            public ImageSet f45668b;

            /* renamed from: c */
            public List<Link> f45669c = Internal.newMutableList();

            /* renamed from: a */
            public CommentContent build() {
                return new CommentContent(this.f45667a, this.f45668b, this.f45669c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18336a newBuilder() {
            C18336a aVar = new C18336a();
            aVar.f45667a = this.content;
            aVar.f45668b = this.image_set;
            aVar.f45669c = Internal.copyOf("link_list", this.link_list);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("moments", "CommentContent");
            StringBuilder sb = new StringBuilder();
            if (this.content != null) {
                sb.append(", content=");
                sb.append(this.content);
            }
            if (this.image_set != null) {
                sb.append(", image_set=");
                sb.append(this.image_set);
            }
            if (!this.link_list.isEmpty()) {
                sb.append(", link_list=");
                sb.append(this.link_list);
            }
            StringBuilder replace = sb.replace(0, 2, "CommentContent{");
            replace.append('}');
            return replace.toString();
        }

        public CommentContent(RichText richText, ImageSet imageSet, List<Link> list) {
            this(richText, imageSet, list, ByteString.EMPTY);
        }

        public CommentContent(RichText richText, ImageSet imageSet, List<Link> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.content = richText;
            this.image_set = imageSet;
            this.link_list = Internal.immutableCopyOf("link_list", list);
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.Comment$b */
    private static final class C18339b extends ProtoAdapter<Comment> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, UrlPreviewHangPoint>> f45697a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, UrlPreviewHangPoint.ADAPTER);

        C18339b() {
            super(FieldEncoding.LENGTH_DELIMITED, Comment.class);
        }

        /* renamed from: a */
        public int encodedSize(Comment comment) {
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
            int i26 = 0;
            if (comment.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, comment.id);
            } else {
                i = 0;
            }
            if (comment.user_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, comment.user_id);
            } else {
                i2 = 0;
            }
            int i27 = i + i2;
            if (comment.post_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, comment.post_id);
            } else {
                i3 = 0;
            }
            int i28 = i27 + i3;
            if (comment.circle_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, comment.circle_id);
            } else {
                i4 = 0;
            }
            int i29 = i28 + i4;
            if (comment.cid != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, comment.cid);
            } else {
                i5 = 0;
            }
            int i30 = i29 + i5;
            if (comment.content != null) {
                i6 = CommentContent.ADAPTER.encodedSizeWithTag(11, comment.content);
            } else {
                i6 = 0;
            }
            int i31 = i30 + i6;
            if (comment.reply_comment_id != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(13, comment.reply_comment_id);
            } else {
                i7 = 0;
            }
            int i32 = i31 + i7;
            if (comment.reply_comment_user_id != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(14, comment.reply_comment_user_id);
            } else {
                i8 = 0;
            }
            int i33 = i32 + i8;
            if (comment.model_version != null) {
                i9 = ProtoAdapter.INT32.encodedSizeWithTag(31, comment.model_version);
            } else {
                i9 = 0;
            }
            int i34 = i33 + i9;
            if (comment.incompatible_action != null) {
                i10 = IncompatibleAction.ADAPTER.encodedSizeWithTag(32, comment.incompatible_action);
            } else {
                i10 = 0;
            }
            int i35 = i34 + i10;
            if (comment.create_time_msec != null) {
                i11 = ProtoAdapter.INT64.encodedSizeWithTag(33, comment.create_time_msec);
            } else {
                i11 = 0;
            }
            int i36 = i35 + i11;
            if (comment.publish_time_msec != null) {
                i12 = ProtoAdapter.INT64.encodedSizeWithTag(34, comment.publish_time_msec);
            } else {
                i12 = 0;
            }
            int i37 = i36 + i12;
            if (comment.visibility != null) {
                i13 = Visibility.ADAPTER.encodedSizeWithTag(35, comment.visibility);
            } else {
                i13 = 0;
            }
            int i38 = i37 + i13;
            if (comment.is_anonymous != null) {
                i14 = ProtoAdapter.BOOL.encodedSizeWithTag(36, comment.is_anonymous);
            } else {
                i14 = 0;
            }
            int i39 = i38 + i14;
            if (comment.is_under_review != null) {
                i15 = ProtoAdapter.BOOL.encodedSizeWithTag(37, comment.is_under_review);
            } else {
                i15 = 0;
            }
            int i40 = i39 + i15;
            if (comment.is_hot != null) {
                i16 = ProtoAdapter.BOOL.encodedSizeWithTag(38, comment.is_hot);
            } else {
                i16 = 0;
            }
            int i41 = i40 + i16;
            if (comment.is_self_owner != null) {
                i17 = ProtoAdapter.BOOL.encodedSizeWithTag(39, comment.is_self_owner);
            } else {
                i17 = 0;
            }
            int i42 = i41 + i17;
            if (comment.is_deleted != null) {
                i18 = ProtoAdapter.BOOL.encodedSizeWithTag(40, comment.is_deleted);
            } else {
                i18 = 0;
            }
            int i43 = i42 + i18;
            if (comment.local_status != null) {
                i19 = CreateStatus.ADAPTER.encodedSizeWithTag(51, comment.local_status);
            } else {
                i19 = 0;
            }
            int i44 = i43 + i19;
            if (comment.can_comment != null) {
                i20 = ProtoAdapter.BOOL.encodedSizeWithTag(101, comment.can_comment);
            } else {
                i20 = 0;
            }
            int i45 = i44 + i20;
            if (comment.can_reaction != null) {
                i21 = ProtoAdapter.BOOL.encodedSizeWithTag(102, comment.can_reaction);
            } else {
                i21 = 0;
            }
            int i46 = i45 + i21;
            if (comment.can_report != null) {
                i22 = ProtoAdapter.BOOL.encodedSizeWithTag(103, comment.can_report);
            } else {
                i22 = 0;
            }
            int i47 = i46 + i22;
            if (comment.can_delete != null) {
                i23 = ProtoAdapter.BOOL.encodedSizeWithTag(104, comment.can_delete);
            } else {
                i23 = 0;
            }
            int i48 = i47 + i23;
            if (comment.can_administrate != null) {
                i24 = ProtoAdapter.BOOL.encodedSizeWithTag(LocationRequest.PRIORITY_NO_POWER, comment.can_administrate);
            } else {
                i24 = 0;
            }
            int i49 = i48 + i24;
            if (comment.comment_set != null) {
                i25 = CommentSet.ADAPTER.encodedSizeWithTag(SmActions.ACTION_RINGING_ENTRY, comment.comment_set);
            } else {
                i25 = 0;
            }
            int i50 = i49 + i25;
            if (comment.reaction_set != null) {
                i26 = ReactionSet.ADAPTER.encodedSizeWithTag(SmActions.ACTION_RINGING_EXIT, comment.reaction_set);
            }
            return i50 + i26 + this.f45697a.encodedSizeWithTag(SmActions.ACTION_ONTHECALL_ENTRY, comment.url_preview_hang_point_map) + comment.unknownFields().size();
        }

        /* renamed from: a */
        public Comment decode(ProtoReader protoReader) throws IOException {
            C18338a aVar = new C18338a();
            aVar.f45671a = "";
            aVar.f45672b = "";
            aVar.f45673c = "";
            aVar.f45674d = "";
            aVar.f45675e = "";
            aVar.f45677g = "";
            aVar.f45678h = "";
            aVar.f45679i = 0;
            aVar.f45681k = 0L;
            aVar.f45682l = 0L;
            aVar.f45683m = Visibility.ALL;
            aVar.f45684n = false;
            aVar.f45685o = false;
            aVar.f45686p = false;
            aVar.f45687q = false;
            aVar.f45688r = false;
            aVar.f45689s = CreateStatus.SUCCESS;
            aVar.f45690t = false;
            aVar.f45691u = false;
            aVar.f45692v = false;
            aVar.f45693w = false;
            aVar.f45694x = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45671a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45672b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45673c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f45674d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 5) {
                    aVar.f45675e = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 11) {
                    aVar.f45676f = CommentContent.ADAPTER.decode(protoReader);
                } else if (nextTag == 51) {
                    try {
                        aVar.f45689s = CreateStatus.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 13) {
                    aVar.f45677g = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 14) {
                    switch (nextTag) {
                        case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                            aVar.f45679i = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 32:
                            aVar.f45680j = IncompatibleAction.ADAPTER.decode(protoReader);
                            continue;
                        case 33:
                            aVar.f45681k = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 34:
                            aVar.f45682l = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 35:
                            try {
                                aVar.f45683m = Visibility.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 36:
                            aVar.f45684n = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 37:
                            aVar.f45685o = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 38:
                            aVar.f45686p = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 39:
                            aVar.f45687q = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 40:
                            aVar.f45688r = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        default:
                            switch (nextTag) {
                                case 101:
                                    aVar.f45690t = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 102:
                                    aVar.f45691u = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 103:
                                    aVar.f45692v = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 104:
                                    aVar.f45693w = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case LocationRequest.PRIORITY_NO_POWER /*{ENCODED_INT: 105}*/:
                                    aVar.f45694x = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                default:
                                    switch (nextTag) {
                                        case SmActions.ACTION_RINGING_ENTRY /*{ENCODED_INT: 125}*/:
                                            aVar.f45695y = CommentSet.ADAPTER.decode(protoReader);
                                            continue;
                                        case SmActions.ACTION_RINGING_EXIT /*{ENCODED_INT: 126}*/:
                                            aVar.f45696z = ReactionSet.ADAPTER.decode(protoReader);
                                            continue;
                                        case SmActions.ACTION_ONTHECALL_ENTRY /*{ENCODED_INT: 127}*/:
                                            aVar.f45670A.putAll(this.f45697a.decode(protoReader));
                                            continue;
                                        default:
                                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                            continue;
                                            continue;
                                            continue;
                                    }
                            }
                    }
                } else {
                    aVar.f45678h = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Comment comment) throws IOException {
            if (comment.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, comment.id);
            }
            if (comment.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, comment.user_id);
            }
            if (comment.post_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, comment.post_id);
            }
            if (comment.circle_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, comment.circle_id);
            }
            if (comment.cid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, comment.cid);
            }
            if (comment.content != null) {
                CommentContent.ADAPTER.encodeWithTag(protoWriter, 11, comment.content);
            }
            if (comment.reply_comment_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, comment.reply_comment_id);
            }
            if (comment.reply_comment_user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, comment.reply_comment_user_id);
            }
            if (comment.model_version != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 31, comment.model_version);
            }
            if (comment.incompatible_action != null) {
                IncompatibleAction.ADAPTER.encodeWithTag(protoWriter, 32, comment.incompatible_action);
            }
            if (comment.create_time_msec != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 33, comment.create_time_msec);
            }
            if (comment.publish_time_msec != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 34, comment.publish_time_msec);
            }
            if (comment.visibility != null) {
                Visibility.ADAPTER.encodeWithTag(protoWriter, 35, comment.visibility);
            }
            if (comment.is_anonymous != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 36, comment.is_anonymous);
            }
            if (comment.is_under_review != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 37, comment.is_under_review);
            }
            if (comment.is_hot != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 38, comment.is_hot);
            }
            if (comment.is_self_owner != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 39, comment.is_self_owner);
            }
            if (comment.is_deleted != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 40, comment.is_deleted);
            }
            if (comment.local_status != null) {
                CreateStatus.ADAPTER.encodeWithTag(protoWriter, 51, comment.local_status);
            }
            if (comment.can_comment != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 101, comment.can_comment);
            }
            if (comment.can_reaction != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 102, comment.can_reaction);
            }
            if (comment.can_report != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 103, comment.can_report);
            }
            if (comment.can_delete != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 104, comment.can_delete);
            }
            if (comment.can_administrate != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, LocationRequest.PRIORITY_NO_POWER, comment.can_administrate);
            }
            if (comment.comment_set != null) {
                CommentSet.ADAPTER.encodeWithTag(protoWriter, SmActions.ACTION_RINGING_ENTRY, comment.comment_set);
            }
            if (comment.reaction_set != null) {
                ReactionSet.ADAPTER.encodeWithTag(protoWriter, SmActions.ACTION_RINGING_EXIT, comment.reaction_set);
            }
            this.f45697a.encodeWithTag(protoWriter, SmActions.ACTION_ONTHECALL_ENTRY, comment.url_preview_hang_point_map);
            protoWriter.writeBytes(comment.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.Comment$a */
    public static final class C18338a extends Message.Builder<Comment, C18338a> {

        /* renamed from: A */
        public Map<String, UrlPreviewHangPoint> f45670A = Internal.newMutableMap();

        /* renamed from: a */
        public String f45671a;

        /* renamed from: b */
        public String f45672b;

        /* renamed from: c */
        public String f45673c;

        /* renamed from: d */
        public String f45674d;

        /* renamed from: e */
        public String f45675e;

        /* renamed from: f */
        public CommentContent f45676f;

        /* renamed from: g */
        public String f45677g;

        /* renamed from: h */
        public String f45678h;

        /* renamed from: i */
        public Integer f45679i;

        /* renamed from: j */
        public IncompatibleAction f45680j;

        /* renamed from: k */
        public Long f45681k;

        /* renamed from: l */
        public Long f45682l;

        /* renamed from: m */
        public Visibility f45683m;

        /* renamed from: n */
        public Boolean f45684n;

        /* renamed from: o */
        public Boolean f45685o;

        /* renamed from: p */
        public Boolean f45686p;

        /* renamed from: q */
        public Boolean f45687q;

        /* renamed from: r */
        public Boolean f45688r;

        /* renamed from: s */
        public CreateStatus f45689s;

        /* renamed from: t */
        public Boolean f45690t;

        /* renamed from: u */
        public Boolean f45691u;

        /* renamed from: v */
        public Boolean f45692v;

        /* renamed from: w */
        public Boolean f45693w;

        /* renamed from: x */
        public Boolean f45694x;

        /* renamed from: y */
        public CommentSet f45695y;

        /* renamed from: z */
        public ReactionSet f45696z;

        /* renamed from: a */
        public Comment build() {
            return new Comment(this.f45671a, this.f45672b, this.f45673c, this.f45674d, this.f45675e, this.f45676f, this.f45677g, this.f45678h, this.f45679i, this.f45680j, this.f45681k, this.f45682l, this.f45683m, this.f45684n, this.f45685o, this.f45686p, this.f45687q, this.f45688r, this.f45689s, this.f45690t, this.f45691u, this.f45692v, this.f45693w, this.f45694x, this.f45695y, this.f45696z, this.f45670A, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18338a mo63457a(CreateStatus createStatus) {
            this.f45689s = createStatus;
            return this;
        }

        /* renamed from: a */
        public C18338a mo63458a(ReactionSet reactionSet) {
            this.f45696z = reactionSet;
            return this;
        }

        /* renamed from: a */
        public C18338a mo63459a(Boolean bool) {
            this.f45688r = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18338a newBuilder() {
        C18338a aVar = new C18338a();
        aVar.f45671a = this.id;
        aVar.f45672b = this.user_id;
        aVar.f45673c = this.post_id;
        aVar.f45674d = this.circle_id;
        aVar.f45675e = this.cid;
        aVar.f45676f = this.content;
        aVar.f45677g = this.reply_comment_id;
        aVar.f45678h = this.reply_comment_user_id;
        aVar.f45679i = this.model_version;
        aVar.f45680j = this.incompatible_action;
        aVar.f45681k = this.create_time_msec;
        aVar.f45682l = this.publish_time_msec;
        aVar.f45683m = this.visibility;
        aVar.f45684n = this.is_anonymous;
        aVar.f45685o = this.is_under_review;
        aVar.f45686p = this.is_hot;
        aVar.f45687q = this.is_self_owner;
        aVar.f45688r = this.is_deleted;
        aVar.f45689s = this.local_status;
        aVar.f45690t = this.can_comment;
        aVar.f45691u = this.can_reaction;
        aVar.f45692v = this.can_report;
        aVar.f45693w = this.can_delete;
        aVar.f45694x = this.can_administrate;
        aVar.f45695y = this.comment_set;
        aVar.f45696z = this.reaction_set;
        aVar.f45670A = Internal.copyOf("url_preview_hang_point_map", this.url_preview_hang_point_map);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "Comment");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.post_id != null) {
            sb.append(", post_id=");
            sb.append(this.post_id);
        }
        if (this.circle_id != null) {
            sb.append(", circle_id=");
            sb.append(this.circle_id);
        }
        if (this.cid != null) {
            sb.append(", cid=");
            sb.append(this.cid);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.reply_comment_id != null) {
            sb.append(", reply_comment_id=");
            sb.append(this.reply_comment_id);
        }
        if (this.reply_comment_user_id != null) {
            sb.append(", reply_comment_user_id=");
            sb.append(this.reply_comment_user_id);
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
        if (this.is_under_review != null) {
            sb.append(", is_under_review=");
            sb.append(this.is_under_review);
        }
        if (this.is_hot != null) {
            sb.append(", is_hot=");
            sb.append(this.is_hot);
        }
        if (this.is_self_owner != null) {
            sb.append(", is_self_owner=");
            sb.append(this.is_self_owner);
        }
        if (this.is_deleted != null) {
            sb.append(", is_deleted=");
            sb.append(this.is_deleted);
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
        StringBuilder replace = sb.replace(0, 2, "Comment{");
        replace.append('}');
        return replace.toString();
    }

    public Comment(String str, String str2, String str3, String str4, String str5, CommentContent commentContent, String str6, String str7, Integer num, IncompatibleAction incompatibleAction, Long l, Long l2, Visibility visibility2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, CreateStatus createStatus, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, CommentSet commentSet, ReactionSet reactionSet, Map<String, UrlPreviewHangPoint> map) {
        this(str, str2, str3, str4, str5, commentContent, str6, str7, num, incompatibleAction, l, l2, visibility2, bool, bool2, bool3, bool4, bool5, createStatus, bool6, bool7, bool8, bool9, bool10, commentSet, reactionSet, map, ByteString.EMPTY);
    }

    public Comment(String str, String str2, String str3, String str4, String str5, CommentContent commentContent, String str6, String str7, Integer num, IncompatibleAction incompatibleAction, Long l, Long l2, Visibility visibility2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, CreateStatus createStatus, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, CommentSet commentSet, ReactionSet reactionSet, Map<String, UrlPreviewHangPoint> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.user_id = str2;
        this.post_id = str3;
        this.circle_id = str4;
        this.cid = str5;
        this.content = commentContent;
        this.reply_comment_id = str6;
        this.reply_comment_user_id = str7;
        this.model_version = num;
        this.incompatible_action = incompatibleAction;
        this.create_time_msec = l;
        this.publish_time_msec = l2;
        this.visibility = visibility2;
        this.is_anonymous = bool;
        this.is_under_review = bool2;
        this.is_hot = bool3;
        this.is_self_owner = bool4;
        this.is_deleted = bool5;
        this.local_status = createStatus;
        this.can_comment = bool6;
        this.can_reaction = bool7;
        this.can_report = bool8;
        this.can_delete = bool9;
        this.can_administrate = bool10;
        this.comment_set = commentSet;
        this.reaction_set = reactionSet;
        this.url_preview_hang_point_map = Internal.immutableCopyOf("url_preview_hang_point_map", map);
    }
}
