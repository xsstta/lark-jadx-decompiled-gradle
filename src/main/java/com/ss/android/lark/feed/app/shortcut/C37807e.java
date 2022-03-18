package com.ss.android.lark.feed.app.shortcut;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.avatar.v2.LarkAvatarView;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.desktopmode.view.C36592a;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.C37537e;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent;
import com.ss.android.lark.feed.app.p1849b.AbstractC37305b;
import com.ss.android.lark.feed.dto.ShortcutBtnPreView;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.p2932c.AbstractC58347e;
import com.ss.android.lark.widget.p2932c.C58348f;
import java.util.List;

/* renamed from: com.ss.android.lark.feed.app.shortcut.e */
public class C37807e extends LarkRecyclerViewBaseAdapter<C37814b, UIFeedCard> {

    /* renamed from: d */
    private static final boolean f96993d = C37262a.m146726a().mo139198q().mo139256a("lark.feed.load_avatar.async");

    /* renamed from: a */
    public Context f96994a;

    /* renamed from: b */
    public AbstractC37813a f96995b;

    /* renamed from: c */
    public C36592a f96996c;

    /* renamed from: e */
    private int f96997e = 40;

    /* renamed from: f */
    private AbstractC37305b f96998f;

    /* renamed from: g */
    private AbstractC38037a.AbstractC38051k f96999g = C37268c.m146766b().mo139207z();

    /* renamed from: com.ss.android.lark.feed.app.shortcut.e$a */
    public interface AbstractC37813a {
        /* renamed from: a */
        void mo137315a(int i, View view, FeedPreview feedPreview);

        /* renamed from: a */
        void mo137316a(View view, UIFeedCard uIFeedCard);

        /* renamed from: b */
        void mo137317b(View view, UIFeedCard uIFeedCard);
    }

    /* renamed from: a */
    public void mo138595a() {
        if (!ShortCutStausManager.m148791a().mo138575c()) {
            if (ShortCutStausManager.m148791a().mo138577d()) {
                EventBus.getDefault().trigger(new ShortcutAnimationEvent(ShortcutAnimationEvent.AnimationStatus.CLOSE));
            } else if (ShortCutStausManager.m148791a().mo138578e()) {
                EventBus.getDefault().trigger(new ShortcutAnimationEvent(ShortcutAnimationEvent.AnimationStatus.OPEN));
            }
        }
    }

    /* renamed from: a */
    public void mo138596a(AbstractC37813a aVar) {
        this.f96995b = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (getItem(i) instanceof ShortcutBtnPreView) {
            return 1;
        }
        return super.getItemViewType(i);
    }

    /* renamed from: com.ss.android.lark.feed.app.shortcut.e$b */
    public static class C37814b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public View f97012a;

        /* renamed from: b */
        public TextView f97013b;

        /* renamed from: c */
        public ImageView f97014c;

        /* renamed from: d */
        public LKUIBadgeView f97015d;

        /* renamed from: e */
        public LarkAvatarView f97016e;

        public C37814b(ShortcutItemView shortcutItemView) {
            super(shortcutItemView);
            this.f97012a = shortcutItemView;
            this.f97013b = shortcutItemView.f96981a;
            this.f97014c = shortcutItemView.f96982b;
            this.f97016e = shortcutItemView.f96984d;
            this.f97015d = shortcutItemView.f96983c;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public long getItemId(int i) {
        try {
            return Long.parseLong(((UIFeedCard) getItems().get(i)).getId());
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        if (DesktopUtil.m144307b()) {
            this.f96996c = new C36592a.C36593a().mo135003a(this.f96994a);
        }
    }

    /* renamed from: a */
    private Drawable m148819a(int i) {
        Drawable findDrawableByLayerId;
        Drawable b = C0215a.m655b(this.f96994a, i);
        if ((b instanceof LayerDrawable) && (findDrawableByLayerId = ((LayerDrawable) b).findDrawableByLayerId(R.id.layer_icon)) != null) {
            findDrawableByLayerId.mutate();
            findDrawableByLayerId.setTint(UIHelper.getColor(R.color.static_white));
        }
        return b;
    }

    public C37807e(Context context, AbstractC37305b bVar) {
        this.f96994a = context;
        this.f96998f = bVar;
    }

    /* renamed from: a */
    private void m148820a(View view, final FeedPreview feedPreview) {
        if (DesktopUtil.m144301a(this.f96994a) && !(view instanceof ShortcutBtnItemView)) {
            ((ShortcutItemView) view).setOnShowMenuListener(new AbstractC58347e() {
                /* class com.ss.android.lark.feed.app.shortcut.C37807e.C378114 */

                @Override // com.ss.android.lark.widget.p2932c.AbstractC58347e
                /* renamed from: a */
                public void mo137287a(View view, float f, float f2) {
                    if (f != -1.0f && f2 != -1.0f) {
                        Rect rect = new Rect();
                        view.getGlobalVisibleRect(rect);
                        new C58348f.C58350a(C37807e.this.f96994a).mo197585a(1, C37807e.this.f96994a.getString(R.string.Lark_Chat_FeedClickTipsUnpin), C37807e.this.f96994a.getDrawable(R.drawable.feed_menu_shortcut), true).mo197582a(14.0f).mo197583a(UIHelper.dp2px(10.0f)).mo197586a(C37807e.this.f96994a.getDrawable(R.drawable.desktop_menu_bg)).mo197587a(new C58348f.AbstractC58353d() {
                            /* class com.ss.android.lark.feed.app.shortcut.C37807e.C378114.C378121 */

                            @Override // com.ss.android.lark.widget.p2932c.C58348f.AbstractC58353d
                            public void onMenuItemClick(int i, View view) {
                                C37807e.this.f96995b.mo137315a(i, view, feedPreview);
                            }
                        }).mo197581a().showAtLocation(view, 51, rect.left + ((int) f), rect.top + ((int) f2));
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public C37814b onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != 1) {
            return new C37814b((ShortcutItemView) this.f96998f.mo137128a(ShortcutItemView.class, viewGroup.getContext()));
        }
        return new C37814b((ShortcutBtnItemView) this.f96998f.mo137128a(ShortcutBtnItemView.class, viewGroup.getContext()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v25, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m148821a(com.ss.android.lark.feed.app.shortcut.C37807e.C37814b r7, com.ss.android.lark.feed.app.entity.FeedPreview r8) {
        /*
        // Method dump skipped, instructions count: 212
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.feed.app.shortcut.C37807e.m148821a(com.ss.android.lark.feed.app.shortcut.e$b, com.ss.android.lark.feed.app.entity.FeedPreview):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.larksuite.component.ui.avatar.v2.LarkAvatarView] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r2v18, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m148822b(final com.ss.android.lark.feed.app.shortcut.C37807e.C37814b r8, final com.ss.android.lark.feed.app.entity.FeedPreview r9) {
        /*
        // Method dump skipped, instructions count: 362
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.feed.app.shortcut.C37807e.m148822b(com.ss.android.lark.feed.app.shortcut.e$b, com.ss.android.lark.feed.app.entity.FeedPreview):void");
    }

    /* renamed from: a */
    public void onBindViewHolder(final C37814b bVar, int i) {
        bVar.f97014c.setVisibility(8);
        final FeedPreview feedPreview = (FeedPreview) getItem(i);
        if (feedPreview == null) {
            Log.m165389i("FeedModule_ShortcutAdapter", "Shortcut FeedPreview count=" + getItemCount() + " position=" + i);
        }
        m148821a(bVar, feedPreview);
        m148822b(bVar, feedPreview);
        bVar.itemView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.feed.app.shortcut.C37807e.View$OnClickListenerC378081 */

            public void onClick(View view) {
                if (C37807e.this.f96996c != null && C37807e.this.f96996c.isShowing()) {
                    C37807e.this.f96996c.dismiss();
                }
                if (bVar.f97012a instanceof ShortcutBtnItemView) {
                    C37807e.this.mo138595a();
                } else if (C37807e.this.f96995b != null) {
                    C37807e.this.f96995b.mo137316a(view, feedPreview);
                }
            }
        });
        bVar.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.android.lark.feed.app.shortcut.C37807e.View$OnLongClickListenerC378092 */

            public boolean onLongClick(View view) {
                Log.m165389i("FeedModule_ShortcutAdapter", "onShortCutLongClick: " + feedPreview.getId());
                if (C37807e.this.f96995b == null) {
                    return true;
                }
                C37807e.this.f96995b.mo137317b(bVar.itemView, feedPreview);
                return true;
            }
        });
        C37537e.m147608a(bVar.f97012a, feedPreview, i);
        m148820a(bVar.itemView, feedPreview);
    }

    /* renamed from: a */
    public void mo138598a(List<UIFeedCard> list, boolean z) {
        if (getItems().size() == 0 || z) {
            resetAll(list);
            return;
        }
        this.items.clear();
        this.items.addAll(list);
        notifyDataSetChanged();
        EventBus.getDefault().trigger(new ShortcutAnimationEvent(ShortcutAnimationEvent.AnimationStatus.UPDATE_SHORTCUT));
    }
}
