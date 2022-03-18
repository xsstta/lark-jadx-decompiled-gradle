package com.ss.android.lark.feed.app.binder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.p017a.p018a.C0215a;
import com.larksuite.component.ui.avatar.AvatarModel;
import com.larksuite.component.ui.avatar.AvatarType;
import com.larksuite.component.ui.avatar.v2.ChatterAvatar;
import com.larksuite.component.ui.badge.miniicon.MiniIconModel;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.MessageType;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.AbstractC37628k;
import com.ss.android.lark.feed.app.binder.C37414l;
import com.ss.android.lark.feed.app.binder.p1857a.AbstractC37378c;
import com.ss.android.lark.feed.app.entity.ChatFeedPreview;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.filter.C37548b;
import com.ss.android.lark.feed.app.model.p1863c.C37711b;
import com.ss.android.lark.feed.app.model.p1863c.C37712c;
import com.ss.android.lark.feed.app.model.p1863c.C37713d;
import com.ss.android.lark.feed.app.p1849b.AbstractC37305b;
import com.ss.android.lark.feed.app.view.C37968c;
import com.ss.android.lark.feed.app.view.FeedItemView;
import com.ss.android.lark.feed.p1847a.C37264a;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.feed.app.binder.c */
public class C37382c implements AbstractC37406i<ChatFeedPreview, C37968c, AbstractC37628k> {

    /* renamed from: a */
    public static final int f95916a = UIHelper.getColor(R.color.lkui_B600);

    /* renamed from: b */
    public static final boolean f95917b = C37262a.m146726a().mo139198q().mo139256a("lark.feed.load_avatar.async");

    /* renamed from: c */
    private final Context f95918c = C37268c.m146766b().mo139170a();

    /* renamed from: d */
    private final AbstractC37378c<ChatFeedPreview> f95919d;

    /* renamed from: e */
    private final C37394h<ChatFeedPreview> f95920e;

    public C37382c() {
        C373831 r0 = new AbstractC37378c<ChatFeedPreview>() {
            /* class com.ss.android.lark.feed.app.binder.C37382c.C373831 */

            /* renamed from: c */
            public boolean mo137237b(ChatFeedPreview chatFeedPreview) {
                return true;
            }

            /* renamed from: a */
            public boolean mo137239d(ChatFeedPreview chatFeedPreview) {
                return C37264a.m146753b();
            }

            /* renamed from: e */
            private boolean m147138e(ChatFeedPreview chatFeedPreview) {
                if (chatFeedPreview.getChatType() != Chat.Type.GROUP || chatFeedPreview.isSecret()) {
                    return false;
                }
                return true;
            }

            /* renamed from: f */
            private boolean m147139f(ChatFeedPreview chatFeedPreview) {
                if (chatFeedPreview.getChatType() != Chat.Type.P2P) {
                    return false;
                }
                if (chatFeedPreview.isBotChat()) {
                    return chatFeedPreview.isShowBotTag();
                }
                return true;
            }

            /* renamed from: b */
            public boolean mo137238c(ChatFeedPreview chatFeedPreview) {
                if (chatFeedPreview.getChatType() == Chat.Type.GROUP || m147139f(chatFeedPreview)) {
                    return true;
                }
                return false;
            }

            /* renamed from: d */
            public boolean mo137236a(ChatFeedPreview chatFeedPreview) {
                if (m147138e(chatFeedPreview) || m147139f(chatFeedPreview)) {
                    return true;
                }
                return false;
            }
        };
        this.f95919d = r0;
        this.f95920e = new C37394h<ChatFeedPreview>(r0) {
            /* class com.ss.android.lark.feed.app.binder.C37382c.C373842 */

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.feed.app.binder.C37394h
            /* renamed from: a */
            public void mo137257a(C37968c cVar) {
                if (C37713d.f96676f) {
                    super.mo137257a(cVar);
                }
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.feed.app.binder.C37394h
            /* renamed from: b */
            public void mo137259b(C37968c cVar) {
                if (C37713d.f96676f) {
                    super.mo137259b(cVar);
                }
            }

            /* renamed from: c */
            private boolean m147149c(FeedPreview feedPreview) {
                if (C37548b.m147657a().mo137792b() != FeedFilter.MESSAGE || feedPreview.isRemind()) {
                    return false;
                }
                return true;
            }

            /* renamed from: a */
            private Drawable m147148a(int i) {
                Drawable findDrawableByLayerId;
                Drawable b = C0215a.m655b(this.f95942d, i);
                if ((b instanceof LayerDrawable) && (findDrawableByLayerId = ((LayerDrawable) b).findDrawableByLayerId(R.id.layer_icon)) != null) {
                    findDrawableByLayerId.mutate();
                    findDrawableByLayerId.setTint(UIHelper.getColor(R.color.static_white));
                }
                return b;
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.feed.app.binder.C37394h
            /* renamed from: b */
            public MiniIconModel mo137258b(FeedPreview feedPreview) {
                ChatFeedPreview chatFeedPreview = (ChatFeedPreview) feedPreview;
                if (!TextUtils.isEmpty(chatFeedPreview.getMiniAvatarKey())) {
                    return new MiniIconModel().mo88916a(chatFeedPreview.getMiniAvatarKey());
                }
                if (feedPreview.getChatMode() == Chat.ChatMode.THREAD_V2) {
                    return new MiniIconModel(AvatarType.THRED);
                }
                return null;
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.feed.app.binder.C37394h
            /* renamed from: a */
            public AvatarModel mo137256a(FeedPreview feedPreview) {
                ChatFeedPreview chatFeedPreview = (ChatFeedPreview) feedPreview;
                if (chatFeedPreview.getChatType() == Chat.Type.P2P) {
                    return ((ChatterAvatar.Builder) ((ChatterAvatar.Builder) ((ChatterAvatar.Builder) ((ChatterAvatar.Builder) ((ChatterAvatar.Builder) new ChatterAvatar.Builder().mo89081c(chatFeedPreview.getP2pChatterId()).mo88962a(chatFeedPreview.getAvatarKey())).mo88967b(chatFeedPreview.getP2pChatterId())).mo88963a(C37382c.f95917b)).mo88960a(Biz.Messenger)).mo88961a(Scene.Thread)).mo88976k();
                }
                return super.mo137256a(feedPreview);
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.feed.app.binder.C37394h
            /* renamed from: e */
            public void mo137260e(C37968c cVar, FeedPreview feedPreview) {
                if (feedPreview instanceof ChatFeedPreview) {
                    ChatFeedPreview chatFeedPreview = (ChatFeedPreview) feedPreview;
                    if (!m147149c(feedPreview)) {
                        super.mo137260e(cVar, feedPreview);
                    } else if (chatFeedPreview.getHighPriorityDisplay() != null && chatFeedPreview.getHighPriorityDisplay().mo106714b() != null) {
                        cVar.f97476a.setLastChatTime(0, C37712c.m148276a(chatFeedPreview.getHighPriorityDisplay().mo106714b().longValue()));
                    }
                }
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.feed.app.binder.C37394h
            /* renamed from: b */
            public void mo137247b(C37968c cVar, FeedPreview feedPreview) {
                super.mo137247b(cVar, feedPreview);
                if (feedPreview instanceof ChatFeedPreview) {
                    ChatFeedPreview chatFeedPreview = (ChatFeedPreview) feedPreview;
                    if (chatFeedPreview.isMyThreadUpdated()) {
                        cVar.f97476a.setMarkTv(0, C37382c.f95916a, chatFeedPreview.getMarkText());
                    } else if (chatFeedPreview.getFocusInfo() == null) {
                        cVar.f97476a.setMarkTv(8, 0, "");
                    } else if (m147149c(feedPreview) || feedPreview.getMutexMarkType(mo137281g(cVar, feedPreview)) != FeedPreview.MutexMarkType.DRAFT) {
                        cVar.f97476a.setMarkTv(0, C37382c.f95916a, chatFeedPreview.getMarkText());
                    } else {
                        cVar.f97476a.setMarkTv(8, 0, "");
                    }
                }
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.feed.app.binder.C37394h
            /* renamed from: d */
            public void mo137249d(C37968c cVar, FeedPreview feedPreview) {
                boolean z;
                if (feedPreview instanceof ChatFeedPreview) {
                    ChatFeedPreview chatFeedPreview = (ChatFeedPreview) feedPreview;
                    if (m147149c(feedPreview) && chatFeedPreview.hasHighPriorityDisplay(MessageType.URGENT)) {
                        cVar.f97476a.setBadge(0, (String) null, (Drawable) null, m147148a(R.drawable.feed_shortcut_ding_icon));
                    } else if (!m147149c(feedPreview) || !chatFeedPreview.hasHighPriorityDisplay(MessageType.AT)) {
                        super.mo137249d(cVar, feedPreview);
                    } else {
                        if (feedPreview.getFeedType() == FeedCard.FeedType.DONE) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C37414l.C37415a a = C37414l.m147242a(feedPreview, z, false, false, true);
                        a.mo137301a("@");
                        cVar.f97476a.setBadge(a.mo137306d(), a.mo137304c(), a.mo137302b(), a.mo137298a());
                    }
                }
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.feed.app.binder.C37394h
            /* renamed from: a */
            public void mo137246a(C37968c cVar, FeedPreview feedPreview) {
                super.mo137246a(cVar, feedPreview);
                if (TextUtils.isEmpty(feedPreview.getName()) && ((ChatFeedPreview) feedPreview).isMeeting()) {
                    cVar.f97476a.setChatName(0, UIHelper.getString(R.string.Lark_Legacy_EventNoTitle));
                }
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.feed.app.binder.C37394h
            /* renamed from: c */
            public void mo137248c(C37968c cVar, FeedPreview feedPreview) {
                if (feedPreview instanceof ChatFeedPreview) {
                    ChatFeedPreview chatFeedPreview = (ChatFeedPreview) feedPreview;
                    if (m147149c(feedPreview)) {
                        cVar.f97476a.setLastMessageRightView(0, UDIconUtils.getIconDrawable(this.f95942d, (int) R.drawable.ud_icon_alerts_off_outlined, this.f95942d.getResources().getColor(R.color.icon_n3)));
                        if (chatFeedPreview.getHighPriorityDisplay() == null || TextUtils.isEmpty(chatFeedPreview.getHighPriorityDisplay().mo106713a())) {
                            cVar.f97476a.updateLastMessageTvView();
                        } else {
                            cVar.f97476a.setLastMessageTv(0, chatFeedPreview.getHighPriorityDisplay().mo106713a(), feedPreview.isTranslateEmojiCode(), false);
                        }
                    } else {
                        if (feedPreview.isRemind() || C37548b.m147657a().mo137792b() != FeedFilter.MUTE) {
                            cVar.f97476a.setLastMessageRightView(8, UDIconUtils.getIconDrawable(this.f95942d, (int) R.drawable.ud_icon_alerts_off_outlined, this.f95942d.getResources().getColor(R.color.icon_n3)));
                        } else {
                            cVar.f97476a.setLastMessageRightView(0, UDIconUtils.getIconDrawable(this.f95942d, (int) R.drawable.ud_icon_alerts_off_outlined, this.f95942d.getResources().getColor(R.color.icon_n3)));
                        }
                        super.mo137248c(cVar, feedPreview);
                    }
                }
            }
        };
        Log.m165389i("ChatItemBinder", "ASYNC_LOAD_AVATAR=" + f95917b);
    }

    /* renamed from: a */
    private void m147133a(C37968c cVar, ChatFeedPreview chatFeedPreview) {
        Drawable a = C37711b.m148269a().mo138226a(chatFeedPreview.getFeedNameTag());
        if (a == null && !chatFeedPreview.getFeedNameTag().mo90005a()) {
            a = C37711b.m148266a(this.f95918c, chatFeedPreview).mo90006b();
        }
        cVar.f97476a.setFeedTagTV(true, a);
    }

    /* renamed from: b */
    public C37968c mo137224a(LayoutInflater layoutInflater, ViewGroup viewGroup, AbstractC37305b bVar) {
        return new C37968c((FeedItemView) bVar.mo137128a(FeedItemView.class, viewGroup.getContext()), bVar);
    }

    /* renamed from: a */
    public void mo137226a(C37968c cVar, ChatFeedPreview chatFeedPreview, AbstractC37628k kVar, int i) {
        this.f95920e.mo137226a(cVar, chatFeedPreview, kVar, i);
        this.f95920e.mo137259b(cVar);
        m147133a(cVar, chatFeedPreview);
        cVar.mo139029b(true);
    }
}
