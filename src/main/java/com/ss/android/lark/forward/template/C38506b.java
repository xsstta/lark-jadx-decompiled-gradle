package com.ss.android.lark.forward.template;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.CardContent;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.chat.entity.message.content.FolderContent;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.chat.entity.message.content.MediaContent;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.message.content.ProfileContent;
import com.ss.android.lark.chat.entity.message.content.ShareGroupChatContent;
import com.ss.android.lark.chat.entity.message.content.StickerContent;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.StickImage;
import com.ss.android.lark.forward.dto.template.BasicDialogContent;
import com.ss.android.lark.forward.impl.utils.ContentUtils;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.utils.C57814c;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.C59035h;

/* renamed from: com.ss.android.lark.forward.template.b */
public class C38506b {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.forward.template.b$1 */
    public static /* synthetic */ class C385071 {

        /* renamed from: a */
        static final /* synthetic */ int[] f98991a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 133
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.forward.template.C38506b.C385071.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static String m151887a(MergeForwardContent mergeForwardContent) {
        StringBuilder sb = new StringBuilder();
        if (mergeForwardContent == null) {
            return sb.toString();
        }
        if (!TextUtils.isEmpty(mergeForwardContent.getQuasiTitle())) {
            return mergeForwardContent.getQuasiTitle();
        }
        if (mergeForwardContent.getType() == Chat.Type.P2P) {
            String p2pCreatorName = mergeForwardContent.getP2pCreatorName();
            String p2pPartnerName = mergeForwardContent.getP2pPartnerName();
            sb.append(p2pCreatorName);
            if (!TextUtils.isEmpty(p2pPartnerName)) {
                sb.append(UIHelper.getString(R.string.Lark_Legacy_MergeForwardAnd));
                sb.append(p2pPartnerName);
            }
            sb.append(UIHelper.getString(R.string.Lark_Legacy_MergeForwardTitleSuffix));
        } else {
            sb.append(mergeForwardContent.getGroupChatName());
            sb.append(UIHelper.getString(R.string.Lark_Legacy_MergeForwardTitleSuffix));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static BasicDialogContent m151886a(Context context, Message message) {
        ShareGroupChatContent shareGroupChatContent;
        BasicDialogContent.C38391a aVar = new BasicDialogContent.C38391a();
        if (message == null || message.getType() == null) {
            return aVar.mo140732a();
        }
        Content content = message.getContent();
        String str = "";
        switch (C385071.f98991a[message.getType().ordinal()]) {
            case 1:
                if (content instanceof TextContent) {
                    aVar.mo140735b(C59035h.m229212c(((TextContent) content).getRichText()));
                    break;
                }
                break;
            case 2:
                if (content instanceof ImageContent) {
                    aVar.mo140734b(C38364a.m151054a().mo140442d().mo140470a((ImageContent) content));
                    aVar.mo140730a(UIUtils.getString(context, R.string.Lark_Legacy_ImageMessageHolder));
                    break;
                }
                break;
            case 3:
                if (content instanceof MediaContent) {
                    MediaContent mediaContent = (MediaContent) content;
                    aVar.mo140734b(C38364a.m151054a().mo140442d().mo140471a(mediaContent));
                    aVar.mo140730a(UIUtils.getString(context, R.string.Lark_Legacy_MediaMessageHolder));
                    aVar.mo140736c(C26311p.m95262a(mediaContent.getSize()));
                    aVar.mo140731a(true);
                    aVar.mo140733b(R.drawable.ic_svg_forward_video_time_icon);
                    break;
                }
                break;
            case 4:
                if (content instanceof PostContent) {
                    PostContent postContent = (PostContent) content;
                    String titleWithFilter = postContent.getTitleWithFilter(context);
                    String text = postContent.getText();
                    aVar.mo140730a(titleWithFilter);
                    aVar.mo140727a(R.drawable.forward_icon_post);
                    aVar.mo140735b(C57814c.m224352c(text));
                    break;
                }
                break;
            case 5:
                if (content instanceof FileContent) {
                    FileContent fileContent = (FileContent) content;
                    aVar.mo140727a(C57881t.m224626c(fileContent.getMime(), fileContent.getName()));
                    aVar.mo140730a(fileContent.getName());
                    aVar.mo140736c(C26311p.m95262a(fileContent.getSize()));
                    break;
                }
                break;
            case 6:
                if (!(!(content instanceof ShareGroupChatContent) || (shareGroupChatContent = (ShareGroupChatContent) content) == null || shareGroupChatContent.getChat() == null)) {
                    aVar.mo140735b(C38364a.m151054a().mo140442d().mo140473a(message));
                    break;
                }
            case 7:
                if (content instanceof StickerContent) {
                    StickerContent stickerContent = (StickerContent) content;
                    StickImage stickImage = new StickImage();
                    stickImage.setKey(stickerContent.getKey());
                    stickImage.setWidth(stickerContent.getWidth());
                    stickImage.setHeight(stickerContent.getHeight());
                    aVar.mo140728a(stickImage);
                    aVar.mo140730a(ContentUtils.m151532a(stickerContent));
                    break;
                }
                break;
            case 8:
                if (content instanceof MergeForwardContent) {
                    MergeForwardContent mergeForwardContent = (MergeForwardContent) content;
                    if (!mergeForwardContent.isFromPrivateTopic()) {
                        aVar.mo140735b(UIUtils.getString(context, R.string.Lark_Legacy_MergeForwardDialogPrefix) + m151887a(mergeForwardContent));
                        break;
                    } else {
                        aVar.mo140735b(UIUtils.getString(context, R.string.Lark_Legacy_TextCardContentHolder));
                        break;
                    }
                }
                break;
            case 9:
                if (content instanceof CardContent) {
                    CardContent cardContent = (CardContent) content;
                    if (cardContent.getType() == CardContent.Type.VOTE) {
                        str = UIUtils.getString(context, R.string.Lark_Legacy_ForwardConfirmVoteMessage);
                    } else if (cardContent.getType() == CardContent.Type.TEXT) {
                        str = UIUtils.getString(context, R.string.Lark_Legacy_TextCardContentHolder);
                    }
                    aVar.mo140735b(str);
                    break;
                }
                break;
            case 10:
                if (content instanceof ProfileContent) {
                    ProfileContent profileContent = (ProfileContent) message.getContent();
                    String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_PreviewUserCard, "user_name", profileContent.getDisplayName());
                    Image image = new Image();
                    image.setKey(profileContent.getAvatarKey());
                    image.setToken(profileContent.getId());
                    aVar.mo140729a(image);
                    aVar.mo140735b(mustacheFormat);
                    break;
                }
                break;
            case 11:
                if (content instanceof FolderContent) {
                    FolderContent folderContent = (FolderContent) content;
                    aVar.mo140727a(C57881t.m224622b(str, folderContent.getName(), true));
                    aVar.mo140730a(folderContent.getName());
                    aVar.mo140736c(C26311p.m95262a(folderContent.getSize()));
                    break;
                }
                break;
        }
        return aVar.mo140732a();
    }
}
