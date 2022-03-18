package com.ss.android.lark.feed.app.team.widget;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.component.ui.avatar.AvatarModel;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.binder.C37414l;
import com.ss.android.lark.feed.app.entity.IBadgeable;
import com.ss.android.lark.feed.app.model.p1863c.C37710a;
import com.ss.android.lark.feed.app.statistics.feed.FeedHitPointNew;
import com.ss.android.lark.feed.app.statistics.team.FeedTeamHitPoint;
import com.ss.android.lark.feed.app.team.entity.C37878g;
import com.ss.android.lark.feed.app.team.feed.ITeamFeedActionHandler;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.feed.app.team.widget.d */
public class C37894d {

    /* renamed from: a */
    private static final boolean f97208a = C37262a.m146726a().mo139198q().mo139256a("lark.feed.load_avatar.async");

    /* renamed from: a */
    public C37898e mo138830a(ViewGroup viewGroup) {
        return new C37898e(new TeamItemView(viewGroup.getContext()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AvatarModel mo138829a(Team team) {
        Drawable b = C37710a.m148265b(team.getAvatarKey());
        if (b == null) {
            C37710a.m148263a(team.getAvatarKey());
        }
        return new AvatarModel.Builder().mo88962a(team.getAvatarKey()).mo88959a(AvatarModel.Size.MIDDLE).mo88967b(String.valueOf(team.getId())).mo88958a(b).mo88963a(f97208a).mo88960a(Biz.Messenger).mo88961a(Scene.Feed).mo88976k();
    }

    /* renamed from: a */
    public void mo138831a(C37898e eVar, final C37878g gVar, final ITeamFeedActionHandler aVar, int i, int i2) {
        eVar.f97215a.f97183a.setSelected(gVar.mo138777d());
        eVar.f97215a.f97186d.setText(gVar.mo138771a().getName());
        C37414l.C37415a a = C37414l.m147241a((IBadgeable) gVar, false, false, false);
        LKUIBadgeView lKUIBadgeView = eVar.f97215a.f97187e;
        if (gVar.mo138777d()) {
            lKUIBadgeView.setVisibility(8);
        } else {
            eVar.f97215a.mo138816a(a.mo137306d(), a.mo137304c(), a.mo137302b(), a.mo137298a());
        }
        eVar.f97215a.f97185c.setOnClickListener(new OnSingleClickListener(1000) {
            /* class com.ss.android.lark.feed.app.team.widget.C37894d.C378951 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                FeedTeamHitPoint.m148841a(gVar.mo138776c());
                ITeamFeedActionHandler aVar = aVar;
                if (aVar != null) {
                    aVar.mo138618a(gVar.mo138771a());
                }
            }
        });
        eVar.f97215a.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.feed.app.team.widget.C37894d.C378962 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                FeedHitPointNew.m148848a(FeedHitPointNew.FeedMainClickParam.FEED_LEFTCLICK_CHAT, new HashMap<String, Long>() {
                    /* class com.ss.android.lark.feed.app.team.widget.C37894d.C378962.C378971 */

                    {
                        put("team_id", Long.valueOf(gVar.mo138771a().getId()));
                    }
                });
                FeedTeamHitPoint.m148843a(gVar.mo138776c(), !gVar.mo138777d());
                ITeamFeedActionHandler aVar = aVar;
                if (aVar != null) {
                    aVar.mo138617a(gVar);
                }
            }
        });
        if (gVar.mo138771a() == null) {
            return;
        }
        if (!TextUtils.isEmpty(gVar.mo138771a().getAvatarKey())) {
            eVar.f97215a.f97184b.setVisibility(0);
            eVar.f97215a.f97184b.mo89076a(mo138829a(gVar.mo138771a()));
            eVar.f97215a.f97184b.mo89073a((Drawable) null);
            return;
        }
        Log.m165397w("TeamGroupBinder", "team avatar key is empty!");
        eVar.f97215a.f97184b.setVisibility(4);
    }
}
