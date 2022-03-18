package com.ss.android.lark.pin.impl.v3.binder.p2472a;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatterInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.pin.PinModule;
import com.ss.android.lark.pin.impl.C51502e;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b;
import com.ss.android.lark.pin.impl.v3.binder.viewholder.C51622h;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.richtext.C59031e;
import com.ss.android.lark.widget.richtext.Image;
import java.util.List;

/* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.t */
public class C51586t extends AbstractC51540b<C51622h> {

    /* renamed from: a */
    private static final int f128390a = UIHelper.dp2px(64.0f);

    /* renamed from: b */
    private static final int f128391b = UIHelper.dp2px(16.0f);

    /* renamed from: a */
    private String m200183a(Chat chat) {
        if (chat == null || !chat.isMember()) {
            return UIHelper.getString(R.string.Lark_Group_FromTopicGroup);
        }
        return chat.getName();
    }

    /* renamed from: a */
    private String m200184a(MergeForwardContent mergeForwardContent) {
        ChatterInfo chatterInfo;
        List<Message> messages = mergeForwardContent.getMessages();
        if (!CollectionUtils.isNotEmpty(messages) || (chatterInfo = mergeForwardContent.getChatters().get(messages.get(0).getFromId())) == null) {
            return "";
        }
        return UIHelper.mustacheFormat((int) R.string.Lark_Group_NamesTopic, "name", chatterInfo.getName());
    }

    /* renamed from: b */
    private CharSequence m200186b(MergeForwardContent mergeForwardContent) {
        String subtitle = mergeForwardContent.getSubtitle();
        if (!TextUtils.isEmpty(subtitle)) {
            return new SpannableStringBuilder().append((CharSequence) subtitle);
        }
        List<Message> messages = mergeForwardContent.getMessages();
        if (!CollectionUtils.isNotEmpty(messages)) {
            return "";
        }
        return PinModule.m199585b().mo144035i().mo144080b(this.f146181d, messages.get(0));
    }

    /* renamed from: a */
    private String m200185a(List<Message> list) {
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
    public void mo177601a(String str) {
        PinModule.m199585b().mo144035i().mo144071a(this.f146181d, str, -1, false);
    }

    public C51586t(Context context, C51502e.AbstractC51506c cVar) {
        super(context, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo177530a(C51622h hVar, PinInfo bVar) {
        super.mo177530a((AbstractC51540b.C51541a) hVar, bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C51622h mo31176b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C51622h.C51623a.m200249a(layoutInflater, viewGroup);
    }

    /* renamed from: a */
    public void mo177520a(C51622h hVar, int i, PinInfo bVar) {
        super.mo31174a((AbstractC51540b.C51541a) hVar, i, bVar);
        final Message g = bVar.mo177396g();
        final MergeForwardContent mergeForwardContent = (MergeForwardContent) g.getContent();
        List<Message> messages = mergeForwardContent.getMessages();
        hVar.f128446m.setBackground(UIHelper.getDrawable(R.drawable.item_bg_corner10_white_1dp_border));
        hVar.f128447n.setText(m200184a(mergeForwardContent));
        hVar.f128450q.setText(m200183a(mergeForwardContent.getOriginChat()));
        hVar.f128448o.setText(m200186b(mergeForwardContent));
        final Chat originChat = mergeForwardContent.getOriginChat();
        if (originChat == null || !originChat.isMember() || TextUtils.isEmpty(originChat.getAvatarKey()) || TextUtils.isEmpty(originChat.getEntityId())) {
            hVar.f128451r.setVisibility(8);
            hVar.f128451r.setOnClickListener(null);
            hVar.f128450q.setOnClickListener(null);
        } else {
            String avatarKey = originChat.getAvatarKey();
            String entityId = originChat.getEntityId();
            hVar.f128451r.setVisibility(0);
            IRequestCreator with = ImageLoader.with(this.f146181d);
            int i2 = f128391b;
            with.load(AvatarImage.Builder.obtain(avatarKey, entityId, i2, i2).build()).override(i2, i2).into(hVar.f128451r);
            hVar.f128451r.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.C51586t.C515871 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    C51586t.this.mo177601a(originChat.getId());
                }
            });
            hVar.f128450q.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.C51586t.C515882 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    C51586t.this.mo177601a(originChat.getId());
                }
            });
        }
        String a = m200185a(messages);
        if (TextUtils.isEmpty(a)) {
            hVar.f128449p.setVisibility(8);
        } else {
            hVar.f128449p.setVisibility(0);
            IRequestCreator dontAnimate = ImageLoader.with(this.f146181d).load(new C38824b(a)).dontAnimate(false);
            int i3 = f128390a;
            dontAnimate.override(i3, i3).centerCrop().into(hVar.f128449p);
        }
        hVar.f128313g.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.C51586t.C515893 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                Chat chat = originChat;
                if (chat == null || !chat.isMember() || mergeForwardContent.getThread() == null) {
                    PinModule.m199585b().mo144035i().mo144072a(C51586t.this.f146181d, g.getId(), g);
                } else {
                    PinModule.m199585b().mo144035i().mo144070a(C51586t.this.f146181d, mergeForwardContent.getThread().id, -2);
                }
            }
        });
    }
}
