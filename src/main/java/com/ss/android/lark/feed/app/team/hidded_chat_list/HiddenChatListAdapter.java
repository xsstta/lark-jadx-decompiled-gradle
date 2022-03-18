package com.ss.android.lark.feed.app.team.hidded_chat_list;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.AbstractC23297g;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.AbstractC23277a;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.C23278b;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.C23279c;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.C23280d;
import com.larksuite.component.ui.avatar.AvatarModel;
import com.larksuite.component.ui.avatar.v2.ChatterAvatar;
import com.larksuite.component.ui.avatar.v2.LarkAvatarView;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.entity.chat.TeamChatType;
import com.ss.android.lark.feed.app.binder.C37414l;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.IBadgeable;
import com.ss.android.lark.feed.app.team.entity.C37874d;
import com.ss.android.lark.feed.app.team.widget.C37899f;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.team.entity.Item;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001+B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\tH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tH\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011H\u0016J\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0011H\u0016J\u000e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\tJ\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011H\u0016J*\u0010\u001e\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0011H\u0016J \u0010!\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0016J\"\u0010#\u001a\u00020$2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u0011H\u0016J\u001a\u0010&\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u0011H\u0016J\u000e\u0010'\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\tJ\u0014\u0010(\u001a\u00020\r2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0*R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/ss/android/lark/feed/app/team/hidded_chat_list/HiddenChatListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/feed/app/team/hidded_chat_list/HiddenChatViewHolder;", "Lcom/h6ah4i/android/widget/advrecyclerview/swipeable/SwipeableItemAdapter;", "dependency", "Lcom/ss/android/lark/feed/app/team/hidded_chat_list/HiddenChatListAdapter$Dependency;", "(Lcom/ss/android/lark/feed/app/team/hidded_chat_list/HiddenChatListAdapter$Dependency;)V", "chatList", "", "Lcom/ss/android/lark/feed/app/team/entity/TeamChatVO;", "onChatClickListener", "Landroid/view/View$OnClickListener;", "bindMarkView", "", "viewHolder", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getChatIndex", "", "chat", "getItemCount", "getItemId", "", "position", "onBindViewHolder", "holder", "onChatUpdate", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onGetSwipeReactionType", "x", "y", "onSetSwipeBackground", ShareHitPoint.f121869d, "onSwipeItem", "Lcom/h6ah4i/android/widget/advrecyclerview/swipeable/action/SwipeResultAction;", "result", "onSwipeItemStarted", "removeChat", "resetChatList", "list", "", "Dependency", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.team.hidded_chat_list.a */
public final class HiddenChatListAdapter extends RecyclerView.Adapter<HiddenChatViewHolder> implements AbstractC23297g<HiddenChatViewHolder> {

    /* renamed from: a */
    public final Dependency f97167a;

    /* renamed from: b */
    private final List<C37874d> f97168b = new ArrayList();

    /* renamed from: c */
    private final View.OnClickListener f97169c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/feed/app/team/hidded_chat_list/HiddenChatListAdapter$Dependency;", "", "openChat", "", "chat", "Lcom/ss/android/lark/feed/app/team/entity/TeamChatVO;", "setChatVisible", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.hidded_chat_list.a$a */
    public interface Dependency {
        /* renamed from: a */
        void mo138781a(RecyclerView.ViewHolder viewHolder, C37874d dVar);

        /* renamed from: a */
        void mo138782a(C37874d dVar);
    }

    /* renamed from: a */
    public int mo80756a(HiddenChatViewHolder cVar, int i, int i2, int i3) {
        return 2;
    }

    /* renamed from: b */
    public void mo80774e(HiddenChatViewHolder cVar, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f97168b.size();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.hidded_chat_list.a$b */
    public static final class View$OnClickListenerC37887b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ HiddenChatListAdapter f97170a;

        /* renamed from: b */
        final /* synthetic */ HiddenChatViewHolder f97171b;

        /* renamed from: c */
        final /* synthetic */ C37874d f97172c;

        View$OnClickListenerC37887b(HiddenChatListAdapter aVar, HiddenChatViewHolder cVar, C37874d dVar) {
            this.f97170a = aVar;
            this.f97171b = cVar;
            this.f97172c = dVar;
        }

        public final void onClick(View view) {
            this.f97170a.f97167a.mo138781a(this.f97171b, this.f97172c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.hidded_chat_list.a$c */
    static final class View$OnClickListenerC37888c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ HiddenChatListAdapter f97173a;

        View$OnClickListenerC37888c(HiddenChatListAdapter aVar) {
            this.f97173a = aVar;
        }

        public final void onClick(View view) {
            Object tag = view.getTag(R.id.team_feed_chat_tag);
            if (!(tag instanceof C37874d)) {
                tag = null;
            }
            C37874d dVar = (C37874d) tag;
            if (dVar != null) {
                this.f97173a.f97167a.mo138782a(dVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        Item k = this.f97168b.get(i).mo138754k();
        Intrinsics.checkExpressionValueIsNotNull(k, "chatList[position].item");
        return k.getId();
    }

    public HiddenChatListAdapter(Dependency aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        this.f97167a = aVar;
        setHasStableIds(true);
        this.f97169c = new View$OnClickListenerC37888c(this);
    }

    /* renamed from: c */
    private final int m149091c(C37874d dVar) {
        int i = 0;
        for (T t : this.f97168b) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(dVar.mo138742b(), t.mo138742b())) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo138794a(C37874d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chat");
        int c = m149091c(dVar);
        if (c >= 0) {
            this.f97168b.remove(c);
            notifyItemRemoved(c);
        }
    }

    /* renamed from: b */
    public final void mo138799b(C37874d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chat");
        int c = m149091c(dVar);
        if (c >= 0) {
            this.f97168b.set(c, dVar);
            notifyItemChanged(c);
        }
    }

    /* renamed from: a */
    public final void mo138797a(List<? extends C37874d> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        this.f97168b.clear();
        this.f97168b.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public HiddenChatViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_hidden_chat_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
        return new HiddenChatViewHolder(inflate);
    }

    /* renamed from: a */
    private final void m149090a(HiddenChatViewHolder cVar, C37874d dVar) {
        LarkAvatarView q = cVar.mo138813q();
        q.setVisibility(0);
        Drawable drawable = null;
        if (dVar.mo138741a(FeedPreview.MarkType.AT_USER)) {
            drawable = C0215a.m655b(q.getContext(), R.drawable.feed_at_user);
        } else if (dVar.mo138741a(FeedPreview.MarkType.AT_ALL)) {
            drawable = C0215a.m655b(q.getContext(), R.drawable.feed_at_all);
        }
        if (!(drawable == null || dVar.mo138748e() == null)) {
            FeedPreview.AtInfo e = dVar.mo138748e();
            Intrinsics.checkExpressionValueIsNotNull(e, "data.atInfo");
            if (!TextUtils.isEmpty(e.getAvatarKey())) {
                ChatterAvatar.Builder aVar = new ChatterAvatar.Builder();
                FeedPreview.AtInfo e2 = dVar.mo138748e();
                Intrinsics.checkExpressionValueIsNotNull(e2, "data.atInfo");
                FeedPreview.AtInfo e3 = dVar.mo138748e();
                Intrinsics.checkExpressionValueIsNotNull(e3, "data.atInfo");
                q.mo89076a(((ChatterAvatar.Builder) ((ChatterAvatar.Builder) ((ChatterAvatar.Builder) ((ChatterAvatar.Builder) ((ChatterAvatar.Builder) ((ChatterAvatar.Builder) aVar.mo88962a(e2.getAvatarKey())).mo88967b(e3.getId())).mo88959a(AvatarModel.Size.MINI)).mo88963a(C37899f.f97216a)).mo88960a(Biz.Messenger)).mo88961a(Scene.Feed)).mo88976k());
                q.mo89073a(drawable);
                return;
            }
        }
        q.setVisibility(8);
    }

    /* renamed from: a */
    public void onBindViewHolder(HiddenChatViewHolder cVar, int i) {
        Intrinsics.checkParameterIsNotNull(cVar, "holder");
        C37874d dVar = this.f97168b.get(i);
        cVar.mo138811o().setText(dVar.mo138746c());
        cVar.mo138810n().setTag(R.id.team_feed_chat_tag, dVar);
        cVar.mo138810n().setOnClickListener(this.f97169c);
        if (TeamChatType.TEAM_CHAT_TYPE_PRIVATE == dVar.mo138755l()) {
            cVar.mo138812p().setVisibility(0);
        } else {
            cVar.mo138812p().setVisibility(8);
        }
        C37414l.C37415a a = C37414l.m147241a((IBadgeable) dVar, false, false, false);
        Intrinsics.checkExpressionValueIsNotNull(a, "remindUIInfo");
        if (a.mo137306d() == 0) {
            cVar.mo138814r().setVisibility(0);
            cVar.mo138814r().mo89317a(a.mo137302b()).mo89319a(a.mo137304c()).mo89322b(a.mo137298a()).mo89320a();
        } else {
            cVar.mo138814r().setVisibility(8);
        }
        m149090a(cVar, dVar);
        cVar.mo138809m().setTag(R.id.team_feed_chat_tag, dVar);
        cVar.mo138809m().setOnClickListener(new View$OnClickListenerC37887b(this, cVar, dVar));
    }

    /* renamed from: b */
    public AbstractC23277a mo80765b(HiddenChatViewHolder cVar, int i, int i2) {
        if (i2 == 1) {
            return new C23280d();
        }
        if (i2 != 2) {
            return new C23278b();
        }
        return new C23279c();
    }

    /* renamed from: a */
    public void mo80760a(HiddenChatViewHolder cVar, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(cVar, "holder");
        if (i2 == 0) {
            cVar.mo138808l().setVisibility(8);
            return;
        }
        cVar.mo138808l().setVisibility(0);
        cVar.mo138815s();
    }
}
