package com.ss.android.lark.sticker.ui.emoticon.manager;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.sticker.p2714a.C55004f;
import com.ss.android.lark.sticker.ui.C55225f;
import com.ss.android.lark.sticker.ui.emoticon.manager.C55161b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StickerSetManagerAdapter extends RecyclerView.Adapter<ViewHolder> implements C55161b.AbstractC55162a {

    /* renamed from: a */
    public List<StickerSet> f136165a = new ArrayList();

    /* renamed from: b */
    public AbstractC55149b f136166b;

    /* renamed from: c */
    public AbstractC55150c f136167c;

    /* renamed from: d */
    public RunnableC55147a f136168d;

    /* renamed from: e */
    private boolean f136169e;

    /* renamed from: com.ss.android.lark.sticker.ui.emoticon.manager.StickerSetManagerAdapter$b */
    public interface AbstractC55149b {
        /* renamed from: a */
        void mo188097a(StickerSet stickerSet);

        /* renamed from: b */
        void mo188098b(StickerSet stickerSet);
    }

    /* renamed from: com.ss.android.lark.sticker.ui.emoticon.manager.StickerSetManagerAdapter$c */
    public interface AbstractC55150c {
        /* renamed from: a */
        void mo188099a(RecyclerView.ViewHolder viewHolder);
    }

    /* renamed from: a */
    public List<StickerSet> mo188084a() {
        return this.f136165a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f136165a.size();
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f136177a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ViewHolder viewHolder = this.f136177a;
            if (viewHolder != null) {
                this.f136177a = null;
                viewHolder.mTvTitle = null;
                viewHolder.mTvDesc = null;
                viewHolder.mLayoutImageGroup = null;
                viewHolder.mIvDelete = null;
                viewHolder.mIvSort = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f136177a = viewHolder;
            viewHolder.mTvTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.sticker_set_item_title, "field 'mTvTitle'", TextView.class);
            viewHolder.mTvDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.sticker_set_desc, "field 'mTvDesc'", TextView.class);
            viewHolder.mLayoutImageGroup = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.sticker_set_ll_image_group, "field 'mLayoutImageGroup'", LinearLayout.class);
            viewHolder.mIvDelete = (ImageView) Utils.findRequiredViewAsType(view, R.id.sticker_set_iv_delete, "field 'mIvDelete'", ImageView.class);
            viewHolder.mIvSort = (ImageView) Utils.findRequiredViewAsType(view, R.id.sticker_set_iv_sort, "field 'mIvSort'", ImageView.class);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.sticker.ui.emoticon.manager.StickerSetManagerAdapter$a */
    public class RunnableC55147a implements Runnable {

        /* renamed from: a */
        public List<StickerSet> f136178a;

        /* renamed from: c */
        private List<StickerSet> f136180c;

        public void run() {
            final C1374g.C1377b a = C1374g.m6298a(new C55225f(this.f136180c, this.f136178a), false);
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.sticker.ui.emoticon.manager.StickerSetManagerAdapter.RunnableC55147a.RunnableC551481 */

                public void run() {
                    StickerSetManagerAdapter.this.f136165a.clear();
                    StickerSetManagerAdapter.this.f136165a.addAll(RunnableC55147a.this.f136178a);
                    a.mo7412a(StickerSetManagerAdapter.this);
                    StickerSetManagerAdapter.this.f136168d = null;
                }
            });
        }

        public RunnableC55147a(List<StickerSet> list, List<StickerSet> list2) {
            this.f136180c = list;
            this.f136178a = list2;
        }
    }

    /* renamed from: a */
    public void mo188086a(AbstractC55149b bVar) {
        this.f136166b = bVar;
    }

    public StickerSetManagerAdapter(AbstractC55150c cVar) {
        this.f136167c = cVar;
    }

    /* renamed from: a */
    private StickerSet m214004a(int i) {
        return this.f136165a.get(i);
    }

    /* access modifiers changed from: package-private */
    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(7521)
        ImageView mIvDelete;
        @BindView(7522)
        ImageView mIvSort;
        @BindView(7525)
        LinearLayout mLayoutImageGroup;
        @BindView(7506)
        TextView mTvDesc;
        @BindView(7515)
        TextView mTvTitle;

        /* renamed from: a */
        public void mo188092a(final StickerSet stickerSet) {
            if (StickerSetManagerAdapter.this.f136166b != null) {
                this.itemView.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.sticker.ui.emoticon.manager.StickerSetManagerAdapter.ViewHolder.View$OnClickListenerC551451 */

                    public void onClick(View view) {
                        StickerSetManagerAdapter.this.f136166b.mo188097a(stickerSet);
                    }
                });
                this.mIvDelete.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.sticker.ui.emoticon.manager.StickerSetManagerAdapter.ViewHolder.View$OnClickListenerC551462 */

                    public void onClick(View view) {
                        StickerSetManagerAdapter.this.f136166b.mo188098b(stickerSet);
                    }
                });
            }
        }

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    /* renamed from: a */
    private void m214005a(final ViewHolder viewHolder) {
        if (this.f136167c != null) {
            viewHolder.mIvSort.setOnTouchListener(new View.OnTouchListener() {
                /* class com.ss.android.lark.sticker.ui.emoticon.manager.StickerSetManagerAdapter.View$OnTouchListenerC551441 */

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() != 0) {
                        return false;
                    }
                    StickerSetManagerAdapter.this.f136167c.mo188099a(viewHolder);
                    return false;
                }
            });
        }
    }

    /* renamed from: b */
    public void mo188090b(List<StickerSet> list) {
        this.f136169e = false;
        if (this.f136165a.size() == 0) {
            mo188087a(list);
            return;
        }
        this.f136168d = new RunnableC55147a(this.f136165a, list);
        CoreThreadPool.getSerialTaskHandler().post(this.f136168d);
    }

    /* renamed from: a */
    public void mo188087a(List<StickerSet> list) {
        this.f136165a.clear();
        this.f136165a.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void mo188088a(boolean z) {
        this.f136169e = z;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewHolder viewHolder = new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sticker_set_item_view_manager, viewGroup, false));
        m214005a(viewHolder);
        return viewHolder;
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        int i2;
        StickerSet a = m214004a(i);
        if (a != null) {
            if (this.f136166b != null) {
                viewHolder.mo188092a(a);
            }
            viewHolder.mTvTitle.setText(a.getTitle());
            viewHolder.mTvDesc.setText(a.getDescription());
            ImageView imageView = viewHolder.mIvSort;
            int i3 = 8;
            if (this.f136169e) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            imageView.setVisibility(i2);
            ImageView imageView2 = viewHolder.mIvDelete;
            if (!this.f136169e) {
                i3 = 0;
            }
            imageView2.setVisibility(i3);
            List<Sticker> stickers = a.getStickers();
            if (!CollectionUtils.isEmpty(stickers)) {
                int size = stickers.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Sticker sticker = stickers.get(i4);
                    if (sticker != null) {
                        ImageView imageView3 = (ImageView) viewHolder.mLayoutImageGroup.getChildAt(i4);
                        if (imageView3 != null && !TextUtils.equals((String) imageView3.getTag(R.id.sticker_thumbnail_image_key), sticker.getThumbnailImageKey())) {
                            C55004f.m213654a().mo187830a(imageView3.getContext(), true, imageView3.getMeasuredWidth(), imageView3.getMeasuredHeight(), sticker.getThumbnailImageKey(), imageView3, R.drawable.sticker_ic_icon_sticker_item_default, R.drawable.sticker_ic_icon_sticker_item_default, a.getStickerSetId());
                            imageView3.setTag(R.id.sticker_thumbnail_image_key, sticker.getThumbnailImageKey());
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // com.ss.android.lark.sticker.ui.emoticon.manager.C55161b.AbstractC55162a
    /* renamed from: a */
    public boolean mo188089a(int i, int i2) {
        Collections.swap(this.f136165a, i, i2);
        notifyItemMoved(i, i2);
        return true;
    }
}
