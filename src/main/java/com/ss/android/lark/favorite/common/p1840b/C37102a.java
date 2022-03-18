package com.ss.android.lark.favorite.common.p1840b;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.im.api.C29604ae;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatterInfo;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.utils.C34349o;
import com.ss.android.lark.chatwindow.C35228b;
import com.ss.android.lark.favorite.common.base.AbstractC37120b;
import com.ss.android.lark.favorite.common.base.ItemListCommonHolder;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b;
import com.ss.android.lark.threaddetail.C55831i;
import com.ss.android.lark.threadmergeforward.ThreadMergeForwardLauncher;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.C59031e;
import com.ss.android.lark.widget.richtext.Image;
import java.util.List;

/* renamed from: com.ss.android.lark.favorite.common.b.a */
public class C37102a implements AbstractC37120b<RecyclerView.ViewHolder, FavoriteMessageInfo> {

    /* renamed from: b */
    private static final int f95357b = UIHelper.dp2px(64.0f);

    /* renamed from: c */
    private static final int f95358c = UIHelper.dp2px(16.0f);

    /* renamed from: a */
    public Context f95359a;

    public C37102a(Context context) {
        this.f95359a = context;
    }

    /* renamed from: a */
    private String m146332a(Chat chat) {
        if (chat == null || !chat.isMember()) {
            return UIHelper.getString(R.string.Lark_Group_FromTopicGroup);
        }
        return chat.getName();
    }

    /* renamed from: a */
    private CharSequence m146331a(MergeForwardContent mergeForwardContent) {
        String subtitle = mergeForwardContent.getSubtitle();
        if (!TextUtils.isEmpty(subtitle)) {
            return new SpannableStringBuilder().append((CharSequence) subtitle);
        }
        List<Message> messages = mergeForwardContent.getMessages();
        if (!CollectionUtils.isNotEmpty(messages)) {
            return "";
        }
        return C34349o.m133200a(this.f95359a, messages.get(0), 0);
    }

    /* renamed from: b */
    private String m146334b(MergeForwardContent mergeForwardContent) {
        ChatterInfo chatterInfo;
        List<Message> messages = mergeForwardContent.getMessages();
        if (!CollectionUtils.isNotEmpty(messages) || (chatterInfo = mergeForwardContent.getChatters().get(messages.get(0).getFromId())) == null) {
            return "";
        }
        return UIHelper.mustacheFormat((int) R.string.Lark_Group_NamesTopic, "name", chatterInfo.getName());
    }

    /* renamed from: a */
    private String m146333a(List<Message> list) {
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        Message message = list.get(0);
        if (message.getType() == Message.Type.IMAGE) {
            return ((ImageContent) message.getContent()).getImageSet().getThumbnail().getKey();
        }
        if (message.getType() == Message.Type.POST) {
            List<Image> a = C59031e.m229179a(((PostContent) message.getContent()).getRichText());
            if (CollectionUtils.isNotEmpty(a)) {
                return a.get(0).getKey();
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo136750a(String str) {
        C35228b.m137564a().mo121114a(this.f95359a, ChatBundle.m109259a().mo105927a(str).mo105929a());
    }

    /* renamed from: a */
    public void mo136723a(RecyclerView.ViewHolder viewHolder, FavoriteMessageInfo favoriteMessageInfo, int i) {
        C37106b bVar = (C37106b) ((ItemListCommonHolder) viewHolder).mo136774a();
        final Message sourceMessage = favoriteMessageInfo.getSourceMessage();
        final MergeForwardContent mergeForwardContent = (MergeForwardContent) sourceMessage.getContent();
        mergeForwardContent.setMessageId(sourceMessage.getId());
        List<Message> messages = mergeForwardContent.getMessages();
        bVar.f95368a.setBackground(UIHelper.getDrawable(R.drawable.thread_item_white_bg));
        bVar.f95369b.setText(m146334b(mergeForwardContent));
        bVar.f95372e.setText(m146332a(mergeForwardContent.getOriginChat()));
        bVar.f95370c.setText(m146331a(mergeForwardContent));
        final Chat originChat = mergeForwardContent.getOriginChat();
        if (originChat == null || !originChat.isMember() || TextUtils.isEmpty(originChat.getAvatarKey()) || TextUtils.isEmpty(originChat.getEntityId())) {
            bVar.f95373f.setVisibility(8);
            bVar.f95373f.setOnClickListener(null);
            bVar.f95372e.setOnClickListener(null);
        } else {
            String avatarKey = originChat.getAvatarKey();
            String entityId = originChat.getEntityId();
            bVar.f95373f.setVisibility(0);
            IRequestCreator with = ImageLoader.with(this.f95359a);
            int i2 = f95358c;
            with.load(AvatarImage.Builder.obtain(avatarKey, entityId, i2, i2).build()).override(i2, i2).into(bVar.f95373f);
            bVar.f95372e.setOnClickListener(new AbstractView$OnClickListenerC52989b() {
                /* class com.ss.android.lark.favorite.common.p1840b.C37102a.C371031 */

                @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b
                /* renamed from: a */
                public void mo122732a(View view) {
                    C37102a.this.mo136750a(originChat.getId());
                }
            });
            bVar.f95373f.setOnClickListener(new AbstractView$OnClickListenerC52989b() {
                /* class com.ss.android.lark.favorite.common.p1840b.C37102a.C371042 */

                @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b
                /* renamed from: a */
                public void mo122732a(View view) {
                    C37102a.this.mo136750a(originChat.getId());
                }
            });
        }
        String a = m146333a(messages);
        if (TextUtils.isEmpty(a)) {
            bVar.f95371d.setVisibility(8);
        } else {
            bVar.f95371d.setVisibility(0);
            IRequestCreator dontAnimate = ImageLoader.with(this.f95359a).load(new C38824b(a)).dontAnimate(false);
            int i3 = f95357b;
            dontAnimate.override(i3, i3).centerCrop().into(bVar.f95371d);
        }
        bVar.f95368a.setOnClickListener(new AbstractView$OnClickListenerC52989b() {
            /* class com.ss.android.lark.favorite.common.p1840b.C37102a.C371053 */

            @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b
            /* renamed from: a */
            public void mo122732a(View view) {
                Chat chat = originChat;
                if (chat == null || !chat.isMember() || mergeForwardContent.getThread() == null) {
                    ThreadMergeForwardLauncher.f138288a.mo190745a(C37102a.this.f95359a, sourceMessage.getId(), sourceMessage);
                } else {
                    C55831i.m216682a(C37102a.this.f95359a, new C29604ae.C29606a().mo106670b(mergeForwardContent.getThread().id).mo106668a());
                }
            }
        });
    }
}
