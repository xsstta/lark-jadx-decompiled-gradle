package com.ss.android.lark.feed.app.team.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.p017a.p018a.C0215a;
import com.larksuite.component.ui.avatar.AvatarModel;
import com.larksuite.component.ui.avatar.v2.ChatterAvatar;
import com.larksuite.component.ui.avatar.v2.LarkAvatarView;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.entity.chat.TeamChatType;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.binder.C37414l;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.IBadgeable;
import com.ss.android.lark.feed.app.statistics.feed.FeedHitPointNew;
import com.ss.android.lark.feed.app.statistics.team.FeedTeamHitPoint;
import com.ss.android.lark.feed.app.team.entity.C37874d;
import com.ss.android.lark.feed.app.team.feed.ITeamFeedActionHandler;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.ss.android.lark.feed.app.team.widget.f */
public class C37899f {

    /* renamed from: a */
    public static final boolean f97216a = C37262a.m146726a().mo139198q().mo139256a("lark.feed.load_avatar.async");

    /* renamed from: b */
    private final Context f97217b = C37268c.m146766b().mo139170a();

    /* renamed from: a */
    public C37904g mo138832a(ViewGroup viewGroup) {
        return new C37904g(new TeamShownChatView(viewGroup.getContext()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo138833a(C37904g gVar, C37874d dVar) {
        C37414l.C37415a a = C37414l.m147241a((IBadgeable) dVar, false, false, false);
        gVar.f97230a.mo138822a(a.mo137306d(), a.mo137304c(), a.mo137302b(), a.mo137298a());
    }

    /* renamed from: b */
    private void m149135b(C37904g gVar, C37874d dVar) {
        TextView textView = gVar.f97230a.f97192b;
        if (dVar.mo138753j()) {
            textView.setText(dVar.mo138746c() + " ");
            textView.setTypeface(textView.getTypeface(), 2);
        } else {
            textView.setText(dVar.mo138746c());
            textView.setTypeface(null, 0);
        }
        if (TeamChatType.TEAM_CHAT_TYPE_PRIVATE == dVar.mo138755l()) {
            Context context = gVar.f97230a.getContext();
            gVar.f97230a.f97193c.setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_lock_outlined, C57582a.m223616d(context, R.color.icon_n3)));
            gVar.f97230a.f97193c.setVisibility(0);
            return;
        }
        gVar.f97230a.f97193c.setVisibility(8);
    }

    /* renamed from: c */
    private void m149137c(C37904g gVar, C37874d dVar) {
        Drawable drawable;
        LarkAvatarView larkAvatarView = gVar.f97230a.f97194d;
        larkAvatarView.setVisibility(0);
        if (dVar.mo138741a(FeedPreview.MarkType.AT_USER)) {
            drawable = C0215a.m655b(this.f97217b, R.drawable.feed_at_user);
        } else if (dVar.mo138741a(FeedPreview.MarkType.AT_ALL)) {
            drawable = C0215a.m655b(this.f97217b, R.drawable.feed_at_all);
        } else {
            drawable = null;
        }
        if (drawable == null || dVar.mo138748e() == null || TextUtils.isEmpty(dVar.mo138748e().getAvatarKey())) {
            larkAvatarView.setVisibility(8);
            return;
        }
        larkAvatarView.mo89076a(((ChatterAvatar.Builder) ((ChatterAvatar.Builder) ((ChatterAvatar.Builder) ((ChatterAvatar.Builder) ((ChatterAvatar.Builder) ((ChatterAvatar.Builder) new ChatterAvatar.Builder().mo88962a(dVar.mo138748e().getAvatarKey())).mo88967b(dVar.mo138748e().getId())).mo88959a(AvatarModel.Size.MINI)).mo88963a(f97216a)).mo88960a(Biz.Messenger)).mo88961a(Scene.Feed)).mo88976k());
        larkAvatarView.mo89073a(drawable);
    }

    /* renamed from: b */
    private void m149136b(final C37904g gVar, final C37874d dVar, final ITeamFeedActionHandler aVar) {
        gVar.mo138837a(new View.OnClickListener() {
            /* class com.ss.android.lark.feed.app.team.widget.C37899f.View$OnClickListenerC379022 */

            public void onClick(View view) {
                aVar.mo138615a(gVar, dVar, false);
            }
        });
        gVar.mo138838b(new View.OnClickListener() {
            /* class com.ss.android.lark.feed.app.team.widget.C37899f.View$OnClickListenerC379033 */

            public void onClick(View view) {
                aVar.mo138615a(gVar, dVar, true);
            }
        });
    }

    /* renamed from: a */
    public void mo138834a(final C37904g gVar, final C37874d dVar, final ITeamFeedActionHandler aVar) {
        gVar.f97231b.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.feed.app.team.widget.C37899f.C379001 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                int i;
                String b = dVar.mo138742b();
                String lowerCase = dVar.mo138749f().name().toLowerCase(Locale.ROOT);
                long g = dVar.mo138750g();
                FeedHitPointNew.m148848a(FeedHitPointNew.FeedMainClickParam.FEED_LEFTCLICK_CHAT, new HashMap<String, Object>(b, lowerCase, g) {
                    /* class com.ss.android.lark.feed.app.team.widget.C37899f.C379001.C379011 */
                    final /* synthetic */ String val$feedType;
                    final /* synthetic */ String val$id;
                    final /* synthetic */ long val$teamId;

                    {
                        this.val$id = r2;
                        this.val$feedType = r3;
                        this.val$teamId = r4;
                        put("chat_id", r2);
                        put("feed_type", r3);
                        put("team_id", Long.valueOf(r4));
                    }
                });
                if (dVar.getBadgeCount() <= 0) {
                    i = 0;
                } else if (dVar.isRemind()) {
                    i = dVar.getBadgeCount();
                } else {
                    i = -1;
                }
                FeedTeamHitPoint.m148842a(g, Long.parseLong(b), dVar.mo138751h(), i);
                gVar.f97230a.setHovered(false);
                ITeamFeedActionHandler aVar = aVar;
                if (aVar != null) {
                    aVar.mo138616a(dVar);
                }
            }
        });
        m149135b(gVar, dVar);
        mo138833a(gVar, dVar);
        m149137c(gVar, dVar);
        m149136b(gVar, dVar, aVar);
    }
}
