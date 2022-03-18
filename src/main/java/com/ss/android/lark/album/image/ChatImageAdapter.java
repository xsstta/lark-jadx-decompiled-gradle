package com.ss.android.lark.album.image;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.lark.album.image.ChatImageGroup;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ChatImageAdapter extends LarkRecyclerViewBaseAdapter<RecyclerView.ViewHolder, ChatImageViewData> {

    /* renamed from: a */
    public AbstractC28661a f72113a;

    /* renamed from: b */
    public List<ChatImageViewData> f72114b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private Context f72115c;

    /* renamed from: d */
    private AbstractC28662b f72116d;

    /* renamed from: com.ss.android.lark.album.image.ChatImageAdapter$a */
    public interface AbstractC28661a {
        /* renamed from: a */
        void mo101968a(View view, ImageSet imageSet);
    }

    /* renamed from: com.ss.android.lark.album.image.ChatImageAdapter$b */
    public interface AbstractC28662b {
        /* renamed from: a */
        void mo101955a(boolean z);
    }

    /* renamed from: b */
    public List<ChatImageViewData> mo101962b() {
        return this.f72114b;
    }

    /* renamed from: c */
    public void mo101963c() {
        this.f72114b.clear();
        notifyItemRangeChanged(0, getItemCount());
    }

    public class HeaderHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private HeaderHolder f72118a;

        @Override // butterknife.Unbinder
        public void unbind() {
            HeaderHolder headerHolder = this.f72118a;
            if (headerHolder != null) {
                this.f72118a = null;
                headerHolder.mDataTV = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public HeaderHolder_ViewBinding(HeaderHolder headerHolder, View view) {
            this.f72118a = headerHolder;
            headerHolder.mDataTV = (TextView) Utils.findRequiredViewAsType(view, R.id.header, "field 'mDataTV'", TextView.class);
        }
    }

    public class ImageViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ImageViewHolder f72119a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ImageViewHolder imageViewHolder = this.f72119a;
            if (imageViewHolder != null) {
                this.f72119a = null;
                imageViewHolder.mImageGroup = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ImageViewHolder_ViewBinding(ImageViewHolder imageViewHolder, View view) {
            this.f72119a = imageViewHolder;
            imageViewHolder.mImageGroup = (ChatImageGroup) Utils.findRequiredViewAsType(view, R.id.image_group, "field 'mImageGroup'", ChatImageGroup.class);
        }
    }

    /* renamed from: a */
    public ArrayList<String> mo101957a() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(this.f72114b)) {
            for (ChatImageViewData chatImageViewData : this.f72114b) {
                arrayList.add(chatImageViewData.getMessageId());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo101958a(AbstractC28661a aVar) {
        this.f72113a = aVar;
    }

    static class HeaderHolder extends RecyclerView.ViewHolder {
        @BindView(7804)
        TextView mDataTV;

        public HeaderHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    static class ImageViewHolder extends RecyclerView.ViewHolder {
        @BindView(7847)
        public ChatImageGroup mImageGroup;

        public ImageViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    /* renamed from: a */
    public void mo101959a(AbstractC28662b bVar) {
        this.f72116d = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        C28682d.m105156a(recyclerView, this, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return ((ChatImageViewData) getItem(i)).getType();
    }

    public ChatImageAdapter(Context context) {
        this.f72115c = context;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
        if (viewHolder instanceof ImageViewHolder) {
            ImageLoader.clear(((ImageViewHolder) viewHolder).mImageGroup.getContentIV());
        }
    }

    /* renamed from: a */
    public void mo101960a(ChatImageViewData chatImageViewData) {
        if (this.f72114b.contains(chatImageViewData)) {
            this.f72114b.remove(chatImageViewData);
        } else if (chatImageViewData.isFromPostMessage()) {
            UDToast.show(this.f72115c, (int) R.string.Lark_Legacy_UnableSelectRichTextMedia);
        } else if (this.f72114b.size() < 9) {
            this.f72114b.add(chatImageViewData);
        } else {
            UDToast.show(this.f72115c, UIHelper.mustacheFormat((int) R.string.Lark_Legacy_Max9Items, "number", String.valueOf(9)));
        }
        notifyDataSetChanged();
        AbstractC28662b bVar = this.f72116d;
        if (bVar != null) {
            bVar.mo101955a(!CollectionUtils.isEmpty(this.f72114b));
        }
    }

    /* renamed from: a */
    public void mo101961a(boolean z) {
        for (ChatImageViewData chatImageViewData : getItems()) {
            chatImageViewData.setIsSelectStatus(z);
        }
        notifyItemRangeChanged(0, getItemCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int itemViewType = getItemViewType(i);
        ChatImageViewData chatImageViewData = (ChatImageViewData) getItem(i);
        if (itemViewType == 0) {
            ((HeaderHolder) viewHolder).mDataTV.setText(chatImageViewData.getLabelText());
            return;
        }
        ImageViewHolder imageViewHolder = (ImageViewHolder) viewHolder;
        imageViewHolder.mImageGroup.setOperationCallback(new ChatImageGroup.AbstractC28665a() {
            /* class com.ss.android.lark.album.image.ChatImageAdapter.C286601 */

            @Override // com.ss.android.lark.album.image.ChatImageGroup.AbstractC28665a
            /* renamed from: a */
            public void mo101965a(ChatImageViewData chatImageViewData) {
                ChatImageAdapter.this.mo101960a(chatImageViewData);
            }

            @Override // com.ss.android.lark.album.image.ChatImageGroup.AbstractC28665a
            /* renamed from: b */
            public boolean mo101966b(ChatImageViewData chatImageViewData) {
                return ChatImageAdapter.this.f72114b.contains(chatImageViewData);
            }

            @Override // com.ss.android.lark.album.image.ChatImageGroup.AbstractC28665a
            /* renamed from: c */
            public boolean mo101967c(ChatImageViewData chatImageViewData) {
                if (!ChatImageAdapter.this.f72114b.contains(chatImageViewData) && ChatImageAdapter.this.f72114b.size() >= 9) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.lark.album.image.ChatImageGroup.AbstractC28665a
            /* renamed from: a */
            public void mo101964a(View view, ImageSet imageSet) {
                if (ChatImageAdapter.this.f72113a != null) {
                    ChatImageAdapter.this.f72113a.mo101968a(view, imageSet);
                }
            }
        });
        imageViewHolder.mImageGroup.mo101969a(chatImageViewData);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new HeaderHolder(LayoutInflater.from(this.f72115c).inflate(R.layout.item_chat_image_header, viewGroup, false));
        }
        return new ImageViewHolder(LayoutInflater.from(this.f72115c).inflate(R.layout.item_chat_image, viewGroup, false));
    }
}
