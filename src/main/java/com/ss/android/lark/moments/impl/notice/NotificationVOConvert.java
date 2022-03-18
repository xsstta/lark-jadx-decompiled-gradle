package com.ss.android.lark.moments.impl.notice;

import com.bytedance.lark.pb.basic.v1.PreviewEntityPair;
import com.bytedance.lark.pb.basic.v1.UrlPreviewHangPoint;
import com.bytedance.lark.pb.moments.v1.Comment;
import com.bytedance.lark.pb.moments.v1.Entities;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.bytedance.lark.pb.moments.v1.Notification;
import com.bytedance.lark.pb.moments.v1.Post;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.dependency.idependency.IChatModuleDependency;
import com.ss.android.lark.moments.impl.commonvo.IMomentsUserModel;
import com.ss.android.lark.moments.impl.commonvo.MomentsUserVM;
import com.ss.android.lark.moments.impl.notice.vo.IMomentsNotificationVM;
import com.ss.android.lark.moments.impl.notice.vo.MomentsNotificationVM;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.base.EmojiHandler;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002J$\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/moments/impl/notice/NotificationVOConvert;", "", "()V", "convertToNotificationVM", "Lcom/ss/android/lark/moments/impl/notice/vo/IMomentsNotificationVM;", "notification", "Lcom/bytedance/lark/pb/moments/v1/Notification;", "entities", "Lcom/bytedance/lark/pb/moments/v1/Entities;", "model", "Lcom/ss/android/lark/moments/impl/commonvo/IMomentsUserModel;", "getReactionStr", "", "reactionKey", "getUser", "Lcom/ss/android/lark/moments/impl/commonvo/MomentsUserVM;", "userId", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.notice.e */
public final class NotificationVOConvert {

    /* renamed from: a */
    public static final NotificationVOConvert f120430a = new NotificationVOConvert();

    private NotificationVOConvert() {
    }

    /* renamed from: a */
    private final String m188923a(String str) {
        String e = EmojiHandler.m226952e(str);
        if (StringsKt.startsWith$default(e, "[", false, 2, (Object) null)) {
            return e;
        }
        return '[' + e + ']';
    }

    /* renamed from: a */
    private final MomentsUserVM m188922a(String str, Entities entities, IMomentsUserModel dVar) {
        Map<String, MomentUser> map;
        MomentUser momentUser;
        if (entities == null || (map = entities.users) == null || (momentUser = map.get(str)) == null) {
            return null;
        }
        return new MomentsUserVM(momentUser, dVar);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final IMomentsNotificationVM mo167582a(Notification notification, Entities entities, IMomentsUserModel dVar) {
        String str;
        Comment comment;
        String str2;
        Post post;
        Map<String, PreviewHangPoint> map;
        Post post2;
        Map<String, UrlPreviewHangPoint> map2;
        Map<String, Post> map3;
        Map<String, UrlPreviewHangPoint> map4;
        Map<String, Comment> map5;
        Comment comment2;
        Map<String, PreviewHangPoint> map6;
        Map<String, PreviewHangPoint> map7;
        Map<String, UrlPreviewHangPoint> map8;
        Map<String, PreviewEntityPair> map9;
        Map<String, UrlPreviewHangPoint> map10;
        Map<String, Comment> map11;
        Map<String, Post> map12;
        Comment comment3;
        Comment comment4;
        Map<String, UrlPreviewHangPoint> map13;
        Map<String, Comment> map14;
        Map<String, Comment> map15;
        Post post3;
        Map<String, UrlPreviewHangPoint> map16;
        Map<String, PreviewEntityPair> map17;
        Post post4;
        Map<String, UrlPreviewHangPoint> map18;
        Map<String, Post> map19;
        Map<String, Post> map20;
        Map<String, UrlPreviewHangPoint> map21;
        Map<String, PreviewEntityPair> map22;
        Map<String, UrlPreviewHangPoint> map23;
        Map<String, Comment> map24;
        Map<String, Post> map25;
        Intrinsics.checkParameterIsNotNull(notification, "notification");
        Intrinsics.checkParameterIsNotNull(dVar, "model");
        Map<String, PreviewEntityPair> map26 = null;
        Post post5 = null;
        Comment comment5 = null;
        Map<String, PreviewHangPoint> map27 = null;
        MomentsUserVM gVar = null;
        String str3 = null;
        Notification.Type type = notification.type;
        if (type != null) {
            switch (C47817f.f120431a[type.ordinal()]) {
                case 1:
                    Notification.FollowerData followerData = notification.follower_data;
                    if (followerData != null) {
                        NotificationVOConvert eVar = f120430a;
                        String str4 = followerData.follower_id;
                        Intrinsics.checkExpressionValueIsNotNull(str4, "it.follower_id");
                        gVar = eVar.m188922a(str4, entities, dVar);
                        String string = UIHelper.getString(R.string.Lark_Community_NotificationFollowYou);
                        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…ty_NotificationFollowYou)");
                        r8 = string;
                        break;
                    }
                    break;
                case 2:
                    Notification.PostReactionData postReactionData = notification.post_reaction_data;
                    if (postReactionData != null) {
                        NotificationVOConvert eVar2 = f120430a;
                        String str5 = postReactionData.reaction_user_id;
                        Intrinsics.checkExpressionValueIsNotNull(str5, "it.reaction_user_id");
                        MomentsUserVM a = eVar2.m188922a(str5, entities, dVar);
                        if (entities == null || (map3 = entities.posts) == null) {
                            post2 = null;
                        } else {
                            post2 = map3.get(postReactionData.post_id);
                        }
                        IChatModuleDependency chatModuleDependency = MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency();
                        String str6 = postReactionData.post_id;
                        Intrinsics.checkExpressionValueIsNotNull(str6, "it.post_id");
                        if (post2 != null) {
                            map2 = post2.url_preview_hang_point_map;
                        } else {
                            map2 = null;
                        }
                        if (entities != null) {
                            map26 = entities.preview_entities;
                        }
                        map = chatModuleDependency.mo144697a(str6, map2, map26);
                        StringBuilder sb = new StringBuilder();
                        sb.append(UIHelper.getString(R.string.Lark_Community_NotificationReactYourMoment));
                        String str7 = postReactionData.action_type;
                        Intrinsics.checkExpressionValueIsNotNull(str7, "it.action_type");
                        sb.append(eVar2.m188923a(str7));
                        str2 = sb.toString();
                        String str8 = postReactionData.post_id;
                        str = str3;
                        str3 = str8;
                        gVar = a;
                        post = post2;
                        comment = comment5;
                        break;
                    }
                    break;
                case 3:
                    Notification.CommentReactionData commentReactionData = notification.comment_reaction_data;
                    if (commentReactionData != null) {
                        NotificationVOConvert eVar3 = f120430a;
                        String str9 = commentReactionData.reaction_user_id;
                        Intrinsics.checkExpressionValueIsNotNull(str9, "it.reaction_user_id");
                        MomentsUserVM a2 = eVar3.m188922a(str9, entities, dVar);
                        if (entities == null || (map5 = entities.comments) == null) {
                            comment = null;
                        } else {
                            comment = map5.get(commentReactionData.comment_id);
                        }
                        IChatModuleDependency chatModuleDependency2 = MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency();
                        String str10 = commentReactionData.comment_id;
                        Intrinsics.checkExpressionValueIsNotNull(str10, "it.comment_id");
                        if (comment != null) {
                            map4 = comment.url_preview_hang_point_map;
                        } else {
                            map4 = null;
                        }
                        if (entities != null) {
                            map26 = entities.preview_entities;
                        }
                        map = chatModuleDependency2.mo144697a(str10, map4, map26);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(UIHelper.getString(R.string.Lark_Community_NotificationReactYourComment));
                        String str11 = commentReactionData.action_type;
                        Intrinsics.checkExpressionValueIsNotNull(str11, "it.action_type");
                        sb2.append(eVar3.m188923a(str11));
                        str2 = sb2.toString();
                        str3 = commentReactionData.post_id;
                        str = commentReactionData.comment_id;
                        gVar = a2;
                        post = post5;
                        break;
                    }
                    break;
                case 4:
                    Notification.CommentData commentData = notification.comment_data;
                    if (commentData != null) {
                        NotificationVOConvert eVar4 = f120430a;
                        String str12 = commentData.user_id;
                        Intrinsics.checkExpressionValueIsNotNull(str12, "it.user_id");
                        gVar = eVar4.m188922a(str12, entities, dVar);
                        if (entities == null || (map12 = entities.posts) == null) {
                            post = null;
                        } else {
                            post = map12.get(commentData.post_id);
                        }
                        IChatModuleDependency chatModuleDependency3 = MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency();
                        String str13 = commentData.post_id;
                        Intrinsics.checkExpressionValueIsNotNull(str13, "it.post_id");
                        if (post != null) {
                            map8 = post.url_preview_hang_point_map;
                        } else {
                            map8 = null;
                        }
                        if (entities != null) {
                            map9 = entities.preview_entities;
                        } else {
                            map9 = null;
                        }
                        map6 = chatModuleDependency3.mo144697a(str13, map8, map9);
                        if (entities == null || (map11 = entities.comments) == null) {
                            comment2 = null;
                        } else {
                            comment2 = map11.get(commentData.comment_id);
                        }
                        IChatModuleDependency chatModuleDependency4 = MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency();
                        String str14 = commentData.comment_id;
                        Intrinsics.checkExpressionValueIsNotNull(str14, "it.comment_id");
                        if (comment2 != null) {
                            map10 = comment2.url_preview_hang_point_map;
                        } else {
                            map10 = null;
                        }
                        if (entities != null) {
                            map26 = entities.preview_entities;
                        }
                        map7 = chatModuleDependency4.mo144697a(str14, map10, map26);
                        String string2 = UIHelper.getString(R.string.Lark_Community_NotificationReplyYourMoment);
                        Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(R.str…ificationReplyYourMoment)");
                        str2 = string2;
                        str3 = commentData.post_id;
                        str = commentData.comment_id;
                        map27 = map7;
                        map = map6;
                        comment = comment5;
                        comment5 = comment2;
                        break;
                    }
                    break;
                case 5:
                    Notification.ReplyData replyData = notification.reply_data;
                    if (replyData != null) {
                        NotificationVOConvert eVar5 = f120430a;
                        String str15 = replyData.user_id;
                        Intrinsics.checkExpressionValueIsNotNull(str15, "it.user_id");
                        gVar = eVar5.m188922a(str15, entities, dVar);
                        if (entities == null || (map15 = entities.comments) == null) {
                            comment3 = null;
                        } else {
                            comment3 = map15.get(replyData.reply_comment_id);
                        }
                        if (entities == null || (map14 = entities.comments) == null) {
                            comment4 = null;
                        } else {
                            comment4 = map14.get(replyData.comment_id);
                        }
                        IChatModuleDependency chatModuleDependency5 = MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency();
                        String str16 = replyData.comment_id;
                        Intrinsics.checkExpressionValueIsNotNull(str16, "it.comment_id");
                        if (comment4 != null) {
                            map13 = comment4.url_preview_hang_point_map;
                        } else {
                            map13 = null;
                        }
                        if (entities != null) {
                            map26 = entities.preview_entities;
                        }
                        Map<String, PreviewHangPoint> a3 = chatModuleDependency5.mo144697a(str16, map13, map26);
                        String string3 = UIHelper.getString(R.string.Lark_Community_NotificationReplyYourComment);
                        Intrinsics.checkExpressionValueIsNotNull(string3, "UIHelper.getString(R.str…ficationReplyYourComment)");
                        str3 = replyData.post_id;
                        str = replyData.comment_id;
                        str2 = string3;
                        comment = comment3;
                        comment5 = comment4;
                        post = post5;
                        map27 = a3;
                        map = map27;
                        break;
                    }
                    break;
                case 6:
                    Notification.AtInPostData atInPostData = notification.at_in_post_data;
                    if (atInPostData != null) {
                        NotificationVOConvert eVar6 = f120430a;
                        String str17 = atInPostData.post_user_id;
                        Intrinsics.checkExpressionValueIsNotNull(str17, "it.post_user_id");
                        gVar = eVar6.m188922a(str17, entities, dVar);
                        if (entities == null || (map20 = entities.posts) == null) {
                            post3 = null;
                        } else {
                            post3 = map20.get(atInPostData.post_id);
                        }
                        IChatModuleDependency chatModuleDependency6 = MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency();
                        String str18 = atInPostData.post_id;
                        Intrinsics.checkExpressionValueIsNotNull(str18, "it.post_id");
                        if (post3 != null) {
                            map16 = post3.url_preview_hang_point_map;
                        } else {
                            map16 = null;
                        }
                        if (entities != null) {
                            map17 = entities.preview_entities;
                        } else {
                            map17 = null;
                        }
                        Map<String, PreviewHangPoint> a4 = chatModuleDependency6.mo144697a(str18, map16, map17);
                        if (entities == null || (map19 = entities.posts) == null) {
                            post4 = null;
                        } else {
                            post4 = map19.get(atInPostData.post_id);
                        }
                        IChatModuleDependency chatModuleDependency7 = MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency();
                        String str19 = atInPostData.post_id;
                        Intrinsics.checkExpressionValueIsNotNull(str19, "it.post_id");
                        if (post4 != null) {
                            map18 = post4.url_preview_hang_point_map;
                        } else {
                            map18 = null;
                        }
                        if (entities != null) {
                            map26 = entities.preview_entities;
                        }
                        Map<String, PreviewHangPoint> a5 = chatModuleDependency7.mo144697a(str19, map18, map26);
                        String string4 = UIHelper.getString(R.string.Lark_Community_NotificationMomentMention);
                        Intrinsics.checkExpressionValueIsNotNull(string4, "UIHelper.getString(R.str…otificationMomentMention)");
                        String str20 = string4;
                        String str21 = atInPostData.post_id;
                        str = str3;
                        str3 = str21;
                        str2 = str20;
                        comment = comment5;
                        map27 = a5;
                        map = a4;
                        post5 = post4;
                        post = post3;
                        break;
                    }
                    break;
                case 7:
                    Notification.AtInCommentData atInCommentData = notification.at_in_comment_data;
                    if (atInCommentData != null) {
                        NotificationVOConvert eVar7 = f120430a;
                        String str22 = atInCommentData.comment_user_id;
                        Intrinsics.checkExpressionValueIsNotNull(str22, "it.comment_user_id");
                        gVar = eVar7.m188922a(str22, entities, dVar);
                        if (entities == null || (map25 = entities.posts) == null) {
                            post = null;
                        } else {
                            post = map25.get(atInCommentData.post_id);
                        }
                        IChatModuleDependency chatModuleDependency8 = MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency();
                        String str23 = atInCommentData.post_id;
                        Intrinsics.checkExpressionValueIsNotNull(str23, "it.post_id");
                        if (post != null) {
                            map21 = post.url_preview_hang_point_map;
                        } else {
                            map21 = null;
                        }
                        if (entities != null) {
                            map22 = entities.preview_entities;
                        } else {
                            map22 = null;
                        }
                        map6 = chatModuleDependency8.mo144697a(str23, map21, map22);
                        if (entities == null || (map24 = entities.comments) == null) {
                            comment2 = null;
                        } else {
                            comment2 = map24.get(atInCommentData.comment_id);
                        }
                        IChatModuleDependency chatModuleDependency9 = MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency();
                        String str24 = atInCommentData.comment_id;
                        Intrinsics.checkExpressionValueIsNotNull(str24, "it.comment_id");
                        if (comment2 != null) {
                            map23 = comment2.url_preview_hang_point_map;
                        } else {
                            map23 = null;
                        }
                        if (entities != null) {
                            map26 = entities.preview_entities;
                        }
                        map7 = chatModuleDependency9.mo144697a(str24, map23, map26);
                        String string5 = UIHelper.getString(R.string.Lark_Community_NotificationCommentMention);
                        Intrinsics.checkExpressionValueIsNotNull(string5, "UIHelper.getString(R.str…tificationCommentMention)");
                        str2 = string5;
                        str3 = atInCommentData.post_id;
                        str = atInCommentData.comment_id;
                        map27 = map7;
                        map = map6;
                        comment = comment5;
                        comment5 = comment2;
                        break;
                    }
                    break;
            }
            return new MomentsNotificationVM.Builder(notification, str2).mo167611a(gVar).mo167610a(post5).mo167609a(comment5).mo167613a(map27).mo167612a(str3).mo167616b(str).mo167615b(post).mo167614b(comment).mo167617b(map).mo167608a();
        }
        post = post5;
        map = map27;
        str2 = r8;
        str = str3;
        comment = comment5;
        return new MomentsNotificationVM.Builder(notification, str2).mo167611a(gVar).mo167610a(post5).mo167609a(comment5).mo167613a(map27).mo167612a(str3).mo167616b(str).mo167615b(post).mo167614b(comment).mo167617b(map).mo167608a();
    }
}
