package com.ss.android.lark.sticker.ui.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sticker.dto.UISticker;
import com.ss.android.lark.sticker.p2714a.C55004f;
import com.ss.android.lark.sticker.ui.C55095c;
import com.ss.android.lark.sticker.ui.C55227h;
import java.util.ArrayList;
import java.util.List;
import pl.droidsonroids.gif.GifImageView;

public class StickerGridAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public List<UISticker> f136045a = new ArrayList();

    /* renamed from: b */
    public List<UISticker> f136046b;

    /* renamed from: c */
    public RunnableC55087a f136047c;

    /* renamed from: d */
    public AbstractC55089b f136048d;

    /* renamed from: e */
    private RecyclerView f136049e;

    /* renamed from: f */
    private Context f136050f;

    /* renamed from: com.ss.android.lark.sticker.ui.adapter.StickerGridAdapter$b */
    public interface AbstractC55089b {
        /* renamed from: a */
        void mo188002a(int i);
    }

    /* renamed from: a */
    public List<UISticker> mo187993a() {
        return this.f136045a;
    }

    /* renamed from: b */
    public List<Sticker> mo187996b() {
        return C55227h.m214225c(this.f136045a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f136045a.size();
    }

    public class StickerViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private StickerViewHolder f136053a;

        @Override // butterknife.Unbinder
        public void unbind() {
            StickerViewHolder stickerViewHolder = this.f136053a;
            if (stickerViewHolder != null) {
                this.f136053a = null;
                stickerViewHolder.mUnSelectIV = null;
                stickerViewHolder.mSelectIndexTV = null;
                stickerViewHolder.mSticker = null;
                stickerViewHolder.mMaskView = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public StickerViewHolder_ViewBinding(StickerViewHolder stickerViewHolder, View view) {
            this.f136053a = stickerViewHolder;
            stickerViewHolder.mUnSelectIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.unselect_label, "field 'mUnSelectIV'", ImageView.class);
            stickerViewHolder.mSelectIndexTV = (TextView) Utils.findRequiredViewAsType(view, R.id.select_index, "field 'mSelectIndexTV'", TextView.class);
            stickerViewHolder.mSticker = (GifImageView) Utils.findRequiredViewAsType(view, R.id.sticker, "field 'mSticker'", GifImageView.class);
            stickerViewHolder.mMaskView = Utils.findRequiredView(view, R.id.mask, "field 'mMaskView'");
        }
    }

    /* renamed from: com.ss.android.lark.sticker.ui.adapter.StickerGridAdapter$a */
    class RunnableC55087a implements Runnable {

        /* renamed from: a */
        List<UISticker> f136054a;

        /* renamed from: b */
        List<UISticker> f136055b;

        public void run() {
            final C1374g.C1377b a = C1374g.m6298a(new C55095c(this.f136054a, this.f136055b), false);
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.sticker.ui.adapter.StickerGridAdapter.RunnableC55087a.RunnableC550881 */

                public void run() {
                    StickerGridAdapter.this.f136045a.clear();
                    StickerGridAdapter.this.f136045a.addAll(RunnableC55087a.this.f136055b);
                    a.mo7412a(StickerGridAdapter.this);
                    if (StickerGridAdapter.this.f136046b != null) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        arrayList.addAll(StickerGridAdapter.this.f136045a);
                        arrayList2.addAll(StickerGridAdapter.this.f136046b);
                        StickerGridAdapter.this.f136047c = new RunnableC55087a(arrayList, arrayList2);
                        CoreThreadPool.getSerialTaskHandler().postDelayed(StickerGridAdapter.this.f136047c, 200);
                        StickerGridAdapter.this.f136046b = null;
                        return;
                    }
                    StickerGridAdapter.this.f136047c = null;
                }
            });
        }

        public RunnableC55087a(List<UISticker> list, List<UISticker> list2) {
            this.f136054a = list;
            this.f136055b = list2;
        }
    }

    /* renamed from: a */
    public void mo187994a(AbstractC55089b bVar) {
        this.f136048d = bVar;
    }

    /* renamed from: a */
    public UISticker mo187992a(int i) {
        return this.f136045a.get(i);
    }

    public StickerGridAdapter(Context context) {
        this.f136050f = context;
        setHasStableIds(true);
    }

    /* renamed from: a */
    public int mo187991a(UISticker uISticker) {
        int i = 0;
        for (UISticker uISticker2 : this.f136045a) {
            if (uISticker.equals(uISticker2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return (long) mo187992a(i).getSticker().getOriginImageKey().hashCode();
    }

    /* renamed from: a */
    public void mo187995a(List<UISticker> list) {
        this.f136045a.clear();
        this.f136045a.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public void mo187998b(List<UISticker> list) {
        if (this.f136045a.size() == 0) {
            mo187995a(list);
        } else if (this.f136047c == null) {
            this.f136046b = null;
            this.f136047c = new RunnableC55087a(this.f136045a, list);
            CoreThreadPool.getSerialTaskHandler().post(this.f136047c);
        } else {
            this.f136046b = list;
        }
    }

    /* renamed from: b */
    public void mo187997b(int i) {
        UISticker a = mo187992a(i);
        if (a.isSelected()) {
            a.setSelected(-1);
            notifyItemChanged(i);
            for (UISticker uISticker : C55227h.m214224b(this.f136045a)) {
                if (uISticker.getSticker() != null) {
                    notifyItemChanged(this.f136045a.indexOf(uISticker));
                }
            }
            return;
        }
        a.setSelected(C55227h.m214223a(this.f136045a).size() + 1);
        notifyItemChanged(i);
    }

    protected class StickerViewHolder extends RecyclerView.ViewHolder {
        @BindView(7077)
        public View mMaskView;
        @BindView(7417)
        public TextView mSelectIndexTV;
        @BindView(7499)
        public GifImageView mSticker;
        @BindView(7754)
        public ImageView mUnSelectIV;

        public StickerViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        this.f136049e = (RecyclerView) viewGroup;
        return new StickerViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_sticker_manager, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        viewHolder.itemView.setTag(mo187992a(i));
        StickerViewHolder stickerViewHolder = (StickerViewHolder) viewHolder;
        UISticker a = mo187992a(i);
        if (a.getSelected() == -1) {
            stickerViewHolder.mUnSelectIV.setVisibility(0);
            stickerViewHolder.mSelectIndexTV.setVisibility(8);
            stickerViewHolder.mMaskView.setVisibility(8);
        } else {
            stickerViewHolder.mUnSelectIV.setVisibility(8);
            stickerViewHolder.mSelectIndexTV.setVisibility(0);
            TextView textView = stickerViewHolder.mSelectIndexTV;
            textView.setText(a.getSelected() + "");
            TextView textView2 = stickerViewHolder.mSelectIndexTV;
            if (a.getSelected() > 9) {
                i2 = R.drawable.ic_icon_select_picture_ok_long_bg;
            } else {
                i2 = R.drawable.ic_icon_select_picture_ok_bg;
            }
            textView2.setBackgroundResource(i2);
            stickerViewHolder.mMaskView.setVisibility(0);
        }
        String filePath = a.getFilePath();
        if (!TextUtils.isEmpty(filePath)) {
            ImageLoader.with(this.f136050f).load(filePath).override(UIUtils.dp2px(this.f136050f, 60.0f), UIUtils.dp2px(this.f136050f, 60.0f)).error(R.drawable.common_failed_chat_picture).dontAnimate(false).into(stickerViewHolder.mSticker);
        } else {
            Log.m165379d("StickerGridAdapter", "onBind: filePath is empty, download sticker.");
            C55004f a2 = C55004f.m213654a();
            Context context = this.f136050f;
            a2.mo187829a(context, true, UIUtils.dp2px(context, 60.0f), UIUtils.dp2px(this.f136050f, 60.0f), a.getSticker().getOriginImageKey(), stickerViewHolder.mSticker, R.drawable.sticker_load_holder, R.drawable.common_failed_chat_picture);
        }
        stickerViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.sticker.ui.adapter.StickerGridAdapter.View$OnClickListenerC550861 */

            public void onClick(View view) {
                int a = StickerGridAdapter.this.mo187991a((UISticker) view.getTag());
                if (a > -1) {
                    StickerGridAdapter.this.mo187997b(a);
                    if (StickerGridAdapter.this.f136048d != null) {
                        StickerGridAdapter.this.f136048d.mo188002a(a);
                    }
                }
            }
        });
    }
}
