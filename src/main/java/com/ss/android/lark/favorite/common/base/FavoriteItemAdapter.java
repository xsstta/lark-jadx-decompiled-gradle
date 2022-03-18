package com.ss.android.lark.favorite.common.base;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.dependency.ChatFGUtils;
import com.ss.android.lark.favorite.common.audio.AudioMessageNewHolder;
import com.ss.android.lark.favorite.common.file.FileMessageHolder;
import com.ss.android.lark.favorite.common.header.DetailHeaderHolder;
import com.ss.android.lark.favorite.common.image.ImageMessageHolder;
import com.ss.android.lark.favorite.common.media.image.MediaMessageHolder;
import com.ss.android.lark.favorite.common.mergeforward.MergeForwardMessageHolder;
import com.ss.android.lark.favorite.common.p1839a.C37097b;
import com.ss.android.lark.favorite.common.p1840b.C37106b;
import com.ss.android.lark.favorite.common.p1841c.C37131b;
import com.ss.android.lark.favorite.common.post.PostMessageHolder;
import com.ss.android.lark.favorite.common.sticker.StickerMessageHolder;
import com.ss.android.lark.favorite.common.text.TextMessageHolder;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class FavoriteItemAdapter extends LarkRecyclerViewBaseAdapter<RecyclerView.ViewHolder, FavoriteMessageInfo> {

    /* renamed from: a */
    public AbstractC37114b f95378a;

    /* renamed from: b */
    public AbstractC37118f f95379b;

    /* renamed from: c */
    public AbstractC37116d f95380c;

    /* renamed from: d */
    int f95381d;

    /* renamed from: e */
    public AbstractC37117e f95382e;

    /* renamed from: f */
    public AbstractC37115c f95383f;

    /* renamed from: g */
    private C37121c f95384g;

    /* renamed from: h */
    private Activity f95385h;

    /* renamed from: i */
    private RecyclerView f95386i;

    /* renamed from: j */
    private View.OnLongClickListener f95387j = new View.OnLongClickListener() {
        /* class com.ss.android.lark.favorite.common.base.FavoriteItemAdapter.View$OnLongClickListenerC371101 */

        public boolean onLongClick(View view) {
            if (FavoriteItemAdapter.this.f95382e == null || view.getTag() == null) {
                return false;
            }
            return FavoriteItemAdapter.this.f95382e.mo136772a(view, (FavoriteMessageInfo) view.getTag());
        }
    };

    /* renamed from: k */
    private View.OnClickListener f95388k = new View.OnClickListener() {
        /* class com.ss.android.lark.favorite.common.base.FavoriteItemAdapter.View$OnClickListenerC371112 */

        public void onClick(View view) {
            if (FavoriteItemAdapter.this.f95383f != null && view.getTag() != null) {
                FavoriteItemAdapter.this.f95383f.mo136769a(view, (FavoriteMessageInfo) view.getTag());
            }
        }
    };

    @Retention(RetentionPolicy.SOURCE)
    public @interface ITEM_TYPE {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ShowType {
    }

    /* renamed from: com.ss.android.lark.favorite.common.base.FavoriteItemAdapter$a */
    public interface AbstractC37113a {
        /* renamed from: a */
        void mo136767a(View view, FavoriteMessageInfo favoriteMessageInfo);
    }

    /* renamed from: com.ss.android.lark.favorite.common.base.FavoriteItemAdapter$b */
    public interface AbstractC37114b {
        /* renamed from: a */
        void mo136768a(View view, FavoriteMessageInfo favoriteMessageInfo);
    }

    /* renamed from: com.ss.android.lark.favorite.common.base.FavoriteItemAdapter$c */
    public interface AbstractC37115c {
        /* renamed from: a */
        void mo136769a(View view, FavoriteMessageInfo favoriteMessageInfo);
    }

    /* renamed from: com.ss.android.lark.favorite.common.base.FavoriteItemAdapter$d */
    public interface AbstractC37116d {
        /* renamed from: a */
        void mo136770a(View view, FavoriteMessageInfo favoriteMessageInfo);

        /* renamed from: b */
        void mo136771b(View view, FavoriteMessageInfo favoriteMessageInfo);
    }

    /* renamed from: com.ss.android.lark.favorite.common.base.FavoriteItemAdapter$e */
    public interface AbstractC37117e {
        /* renamed from: a */
        boolean mo136772a(View view, FavoriteMessageInfo favoriteMessageInfo);
    }

    /* renamed from: com.ss.android.lark.favorite.common.base.FavoriteItemAdapter$f */
    public interface AbstractC37118f {
        /* renamed from: a */
        void mo136773a(View view, FavoriteMessageInfo favoriteMessageInfo);
    }

    /* renamed from: a */
    public View.OnLongClickListener mo136757a() {
        return this.f95387j;
    }

    /* renamed from: b */
    public View.OnClickListener mo136764b() {
        return this.f95388k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.favorite.common.base.FavoriteItemAdapter$3 */
    public static /* synthetic */ class C371123 {

        /* renamed from: a */
        static final /* synthetic */ int[] f95391a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 121
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.favorite.common.base.FavoriteItemAdapter.C371123.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo136758a(AbstractC37113a aVar) {
        this.f95384g.mo136777a(aVar);
    }

    /* renamed from: a */
    public void mo136759a(AbstractC37114b bVar) {
        this.f95378a = bVar;
    }

    /* renamed from: a */
    public void mo136760a(AbstractC37115c cVar) {
        this.f95383f = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        Message sourceMessage = ((FavoriteMessageInfo) getItem(i)).getSourceMessage();
        if (this.f95381d == 2 && i == 0) {
            return 1;
        }
        if (sourceMessage == null) {
            return 0;
        }
        switch (C371123.f95391a[sourceMessage.getType().ordinal()]) {
            case 1:
                return 8;
            case 2:
                if (ChatFGUtils.m143689a()) {
                    return 11;
                }
                return 0;
            case 3:
                if (((MergeForwardContent) sourceMessage.getContent()).isFromPrivateTopic()) {
                    return 12;
                }
                return 7;
            case 4:
                return 5;
            case 5:
                return 2;
            case 6:
                return 3;
            case 7:
                return 4;
            case 8:
                return 6;
            case 9:
                return 9;
            case 10:
                return 10;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public void mo136761a(AbstractC37116d dVar) {
        this.f95380c = dVar;
    }

    /* renamed from: a */
    public void mo136762a(AbstractC37117e eVar) {
        this.f95382e = eVar;
    }

    /* renamed from: a */
    public void mo136763a(AbstractC37118f fVar) {
        this.f95379b = fVar;
    }

    /* renamed from: a */
    private RecyclerView.ViewHolder m146346a(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new DetailHeaderHolder(layoutInflater.inflate(R.layout.savebox_detail_header, viewGroup, false), layoutInflater);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        FavoriteMessageInfo favoriteMessageInfo = (FavoriteMessageInfo) getItem(i);
        int i2 = this.f95381d;
        if (i2 == 2 && i == 0) {
            this.f95384g.mo136776a(viewHolder, favoriteMessageInfo, i2);
        } else {
            this.f95384g.mo136775a(viewHolder, getItemViewType(i), favoriteMessageInfo, this.f95381d);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        switch (i) {
            case 1:
                return m146346a(viewGroup, from);
            case 2:
                return m146347a(viewGroup, from, new TextMessageHolder());
            case 3:
                return m146347a(viewGroup, from, new ImageMessageHolder());
            case 4:
                return m146347a(viewGroup, from, new StickerMessageHolder());
            case 5:
                return m146347a(viewGroup, from, new PostMessageHolder());
            case 6:
                return m146347a(viewGroup, from, new AudioMessageNewHolder());
            case 7:
                return m146347a(viewGroup, from, new MergeForwardMessageHolder());
            case 8:
            case 11:
                return m146347a(viewGroup, from, new FileMessageHolder());
            case 9:
                return m146347a(viewGroup, from, new MediaMessageHolder());
            case 10:
                return m146347a(viewGroup, from, new C37097b());
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return m146347a(viewGroup, from, new C37106b());
            default:
                return m146347a(viewGroup, from, new C37131b());
        }
    }

    public FavoriteItemAdapter(Activity activity, RecyclerView recyclerView, int i) {
        this.f95381d = i;
        this.f95385h = activity;
        this.f95386i = recyclerView;
        this.f95384g = new C37121c(activity);
    }

    /* renamed from: a */
    private ItemListCommonHolder m146347a(ViewGroup viewGroup, LayoutInflater layoutInflater, AbstractC37119a aVar) {
        return new ItemListCommonHolder(layoutInflater.inflate(R.layout.save_items_common_holer_layout, viewGroup, false), layoutInflater, this, aVar);
    }
}
