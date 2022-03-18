package com.ss.android.lark.sticker.ui.emoticon.shop;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
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
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.sticker.p2714a.C55004f;
import com.ss.android.lark.sticker.ui.C55226g;
import com.ss.android.lark.sticker.utils.ViewUtils;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;

public class StickerSetShopAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    public List<StickerSetProgressInfo> f136240a = new ArrayList();

    /* renamed from: b */
    public AbstractC55200b f136241b;

    /* renamed from: c */
    public RunnableC55198a f136242c;

    /* renamed from: d */
    private Context f136243d;

    /* renamed from: com.ss.android.lark.sticker.ui.emoticon.shop.StickerSetShopAdapter$b */
    public interface AbstractC55200b {
        /* renamed from: a */
        void mo188196a(StickerSetProgressInfo stickerSetProgressInfo);

        /* renamed from: b */
        void mo188197b(StickerSetProgressInfo stickerSetProgressInfo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f136240a.size();
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f136249a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ViewHolder viewHolder = this.f136249a;
            if (viewHolder != null) {
                this.f136249a = null;
                viewHolder.mTvTitle = null;
                viewHolder.mTvSubTitle = null;
                viewHolder.mTvAddStatus = null;
                viewHolder.mPbDownload = null;
                viewHolder.mLayoutImageGroup = null;
                viewHolder.mViewLine = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f136249a = viewHolder;
            viewHolder.mTvTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.sticker_set_item_view_title, "field 'mTvTitle'", TextView.class);
            viewHolder.mTvSubTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.sticker_set_item_view_sub_title, "field 'mTvSubTitle'", TextView.class);
            viewHolder.mTvAddStatus = (TextView) Utils.findRequiredViewAsType(view, R.id.sticker_tv_add, "field 'mTvAddStatus'", TextView.class);
            viewHolder.mPbDownload = (ProgressBar) Utils.findRequiredViewAsType(view, R.id.sticker_set_pb_download, "field 'mPbDownload'", ProgressBar.class);
            viewHolder.mLayoutImageGroup = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.sticker_set_ll_image_group, "field 'mLayoutImageGroup'", LinearLayout.class);
            viewHolder.mViewLine = Utils.findRequiredView(view, R.id.sticker_set_bottom_line, "field 'mViewLine'");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.sticker.ui.emoticon.shop.StickerSetShopAdapter$a */
    public class RunnableC55198a implements Runnable {

        /* renamed from: a */
        public List<StickerSetProgressInfo> f136250a;

        /* renamed from: c */
        private List<StickerSetProgressInfo> f136252c;

        public void run() {
            final C1374g.C1377b a = C1374g.m6298a(new C55226g(this.f136252c, this.f136250a), false);
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.sticker.ui.emoticon.shop.StickerSetShopAdapter.RunnableC55198a.RunnableC551991 */

                public void run() {
                    StickerSetShopAdapter.this.f136240a.clear();
                    StickerSetShopAdapter.this.f136240a.addAll(RunnableC55198a.this.f136250a);
                    a.mo7412a(StickerSetShopAdapter.this);
                    StickerSetShopAdapter.this.f136242c = null;
                }
            });
        }

        public RunnableC55198a(List<StickerSetProgressInfo> list, List<StickerSetProgressInfo> list2) {
            this.f136252c = list;
            this.f136250a = list2;
        }
    }

    /* renamed from: a */
    public void mo188188a(AbstractC55200b bVar) {
        this.f136241b = bVar;
    }

    public StickerSetShopAdapter(Context context) {
        this.f136243d = context;
    }

    /* renamed from: a */
    private StickerSetProgressInfo m214145a(int i) {
        return this.f136240a.get(i);
    }

    /* renamed from: b */
    private boolean m214149b(int i) {
        if (i == this.f136240a.size() - 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(7525)
        LinearLayout mLayoutImageGroup;
        @BindView(7528)
        ProgressBar mPbDownload;
        @BindView(7546)
        TextView mTvAddStatus;
        @BindView(7516)
        TextView mTvSubTitle;
        @BindView(7517)
        TextView mTvTitle;
        @BindView(7505)
        View mViewLine;

        /* renamed from: a */
        public void mo188191a(final StickerSetProgressInfo stickerSetProgressInfo) {
            if (StickerSetShopAdapter.this.f136241b != null) {
                this.itemView.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.sticker.ui.emoticon.shop.StickerSetShopAdapter.ViewHolder.View$OnClickListenerC551961 */

                    public void onClick(View view) {
                        StickerSetShopAdapter.this.f136241b.mo188197b(stickerSetProgressInfo);
                    }
                });
                this.mTvAddStatus.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.sticker.ui.emoticon.shop.StickerSetShopAdapter.ViewHolder.View$OnClickListenerC551972 */

                    public void onClick(View view) {
                        StickerSetShopAdapter.this.f136241b.mo188196a(stickerSetProgressInfo);
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
    private void m214146a(ViewHolder viewHolder) {
        ViewUtils.m214260a(0, viewHolder.mPbDownload);
        ViewUtils.m214260a(8, viewHolder.mTvAddStatus);
    }

    /* renamed from: b */
    private void m214148b(ViewHolder viewHolder) {
        ViewUtils.m214260a(0, viewHolder.mTvAddStatus);
        ViewUtils.m214260a(8, viewHolder.mPbDownload);
    }

    /* renamed from: b */
    public void mo188190b(List<StickerSetProgressInfo> list) {
        if (list != null) {
            this.f136240a.clear();
            this.f136240a.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo188189a(List<StickerSetProgressInfo> list) {
        if (this.f136240a.size() == 0) {
            mo188190b(list);
            return;
        }
        this.f136242c = new RunnableC55198a(this.f136240a, list);
        CoreThreadPool.getSerialTaskHandler().post(this.f136242c);
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sticker_item_view_sticker_set_shop, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(inflate);
        if (DesktopUtil.m144307b()) {
            inflate.getLayoutParams().height = UIHelper.dp2px((float) 108);
            DesktopUtil.m144299a(viewHolder.mTvTitle);
            DesktopUtil.m144306b(viewHolder.mTvSubTitle);
        }
        return viewHolder;
    }

    /* renamed from: a */
    public void mo188186a(int i, StickerSetProgressInfo stickerSetProgressInfo) {
        if (i >= 0 && i < this.f136240a.size()) {
            this.f136240a.set(i, stickerSetProgressInfo);
            notifyItemChanged(i);
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        StickerSet stickerSet;
        int i2;
        StickerSetProgressInfo a = m214145a(i);
        if (!(a == null || (stickerSet = a.getStickerSet()) == null)) {
            viewHolder.mTvTitle.setText(stickerSet.getTitle());
            viewHolder.mTvSubTitle.setText(stickerSet.getDescription());
            if (a.isDownloading()) {
                m214146a(viewHolder);
                viewHolder.mPbDownload.setMax((int) a.getTotalSize());
                viewHolder.mPbDownload.setProgress((int) a.getDownLoadProgress());
            } else if (stickerSet.isAdded()) {
                m214148b(viewHolder);
                m214147a(viewHolder, R.string.Lark_Chat_StickerPackAdded, R.color.text_disable, R.drawable.sticker_set_added_bg, false);
            } else if (!stickerSet.isHasPaid()) {
                m214148b(viewHolder);
                m214147a(viewHolder, R.string.Lark_Chat_StickerPackBuy, R.color.function_info_500, R.drawable.sticker_set_add_bg, true);
            } else {
                m214148b(viewHolder);
                m214147a(viewHolder, R.string.Lark_Chat_StickerPackAdd, R.color.function_info_500, R.drawable.sticker_set_add_bg, true);
            }
            View view = viewHolder.mViewLine;
            if (m214149b(i)) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            view.setVisibility(i2);
            if (this.f136241b != null) {
                viewHolder.mo188191a(a);
            }
            List<Sticker> stickers = stickerSet.getStickers();
            if (!CollectionUtils.isEmpty(stickers)) {
                int size = stickers.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Sticker sticker = stickers.get(i3);
                    if (sticker != null) {
                        ImageView imageView = (ImageView) viewHolder.mLayoutImageGroup.getChildAt(i3);
                        if (imageView != null && !TextUtils.equals((String) imageView.getTag(R.id.sticker_thumbnail_image_key), sticker.getThumbnailImageKey())) {
                            C55004f.m213654a().mo187830a(this.f136243d, true, imageView.getMeasuredWidth(), imageView.getMeasuredHeight(), sticker.getThumbnailImageKey(), imageView, R.drawable.sticker_ic_icon_sticker_item_default, R.drawable.sticker_ic_icon_sticker_item_default, stickerSet.getStickerSetId());
                            imageView.setTag(R.id.sticker_thumbnail_image_key, sticker.getThumbnailImageKey());
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m214147a(ViewHolder viewHolder, int i, int i2, int i3, boolean z) {
        viewHolder.mTvAddStatus.setText(i);
        viewHolder.mTvAddStatus.setTextColor(UIUtils.getColor(this.f136243d, i2));
        viewHolder.mTvAddStatus.setBackgroundResource(i3);
        viewHolder.mTvAddStatus.setEnabled(z);
    }
}
