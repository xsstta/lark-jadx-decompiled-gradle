package com.ss.android.lark.search.impl.func.chatinside.detail.image;

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
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.impl.func.chatinside.detail.image.view.ChatInsideSearchImageGroup;
import com.ss.android.lark.search.impl.func.chatinside.detail.image.viewdata.ChatInsideSearchImageViewData;
import com.ss.android.lark.utils.UIHelper;
import com.tonicartos.superslim.GridSLM;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ChatInsideSearchImageAdapter extends LarkRecyclerViewBaseAdapter<RecyclerView.ViewHolder, ChatInsideSearchImageViewData> {

    /* renamed from: a */
    public AbstractC53489a f132148a;

    /* renamed from: b */
    public List<ChatInsideSearchImageViewData> f132149b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private Context f132150c;

    /* renamed from: d */
    private boolean f132151d;

    /* renamed from: e */
    private AbstractC53490b f132152e;

    /* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.image.ChatInsideSearchImageAdapter$a */
    public interface AbstractC53489a {
        /* renamed from: a */
        void mo182627a(View view, ImageSet imageSet);

        /* renamed from: a */
        void mo182628a(View view, ChatInsideSearchImageViewData chatInsideSearchImageViewData);
    }

    /* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.image.ChatInsideSearchImageAdapter$b */
    public interface AbstractC53490b {
        /* renamed from: a */
        void mo182414a(boolean z);
    }

    /* renamed from: b */
    public List<ChatInsideSearchImageViewData> mo182620b() {
        return this.f132149b;
    }

    /* renamed from: c */
    public void mo182621c() {
        this.f132149b.clear();
        notifyItemRangeChanged(0, getItemCount());
    }

    public class HeaderHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private HeaderHolder f132154a;

        @Override // butterknife.Unbinder
        public void unbind() {
            HeaderHolder headerHolder = this.f132154a;
            if (headerHolder != null) {
                this.f132154a = null;
                headerHolder.mDataTV = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public HeaderHolder_ViewBinding(HeaderHolder headerHolder, View view) {
            this.f132154a = headerHolder;
            headerHolder.mDataTV = (TextView) Utils.findRequiredViewAsType(view, R.id.header, "field 'mDataTV'", TextView.class);
        }
    }

    public class ImageViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ImageViewHolder f132155a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ImageViewHolder imageViewHolder = this.f132155a;
            if (imageViewHolder != null) {
                this.f132155a = null;
                imageViewHolder.mImageGroup = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ImageViewHolder_ViewBinding(ImageViewHolder imageViewHolder, View view) {
            this.f132155a = imageViewHolder;
            imageViewHolder.mImageGroup = (ChatInsideSearchImageGroup) Utils.findRequiredViewAsType(view, R.id.image_group, "field 'mImageGroup'", ChatInsideSearchImageGroup.class);
        }
    }

    /* renamed from: a */
    public ArrayList<String> mo182615a() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(this.f132149b)) {
            for (ChatInsideSearchImageViewData chatInsideSearchImageViewData : this.f132149b) {
                arrayList.add(chatInsideSearchImageViewData.getMessageId());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo182616a(AbstractC53489a aVar) {
        this.f132148a = aVar;
    }

    static class HeaderHolder extends RecyclerView.ViewHolder {
        @BindView(7028)
        TextView mDataTV;

        public HeaderHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    static class ImageViewHolder extends RecyclerView.ViewHolder {
        @BindView(7056)
        public ChatInsideSearchImageGroup mImageGroup;

        public ImageViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    /* renamed from: a */
    public void mo182617a(AbstractC53490b bVar) {
        this.f132152e = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return ((ChatInsideSearchImageViewData) getItem(i)).getType();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
        if (viewHolder instanceof ImageViewHolder) {
            C53258a.m205939a().mo181739a(((ImageViewHolder) viewHolder).mImageGroup.getContentIV());
        }
    }

    /* renamed from: a */
    public void mo182618a(ChatInsideSearchImageViewData chatInsideSearchImageViewData) {
        if (this.f132149b.contains(chatInsideSearchImageViewData)) {
            this.f132149b.remove(chatInsideSearchImageViewData);
        } else if (chatInsideSearchImageViewData.isFromPostMessage()) {
            UDToast.show(this.f132150c, (int) R.string.Lark_Legacy_UnableSelectRichTextMedia);
        } else if (this.f132149b.size() < 9) {
            this.f132149b.add(chatInsideSearchImageViewData);
        } else {
            UDToast.show(this.f132150c, UIHelper.mustacheFormat((int) R.string.Lark_Legacy_Max9Items, "number", String.valueOf(9)));
        }
        notifyDataSetChanged();
        AbstractC53490b bVar = this.f132152e;
        if (bVar != null) {
            bVar.mo182414a(!CollectionUtils.isEmpty(this.f132149b));
        }
    }

    /* renamed from: a */
    public void mo182619a(boolean z) {
        for (ChatInsideSearchImageViewData chatInsideSearchImageViewData : getItems()) {
            chatInsideSearchImageViewData.setIsSelectStatus(z);
        }
        notifyItemRangeChanged(0, getItemCount());
    }

    public ChatInsideSearchImageAdapter(Context context, boolean z) {
        this.f132150c = context;
        this.f132151d = z;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new HeaderHolder(LayoutInflater.from(this.f132150c).inflate(R.layout.item_chat_inside_search_image_header, viewGroup, false));
        }
        return new ImageViewHolder(LayoutInflater.from(this.f132150c).inflate(R.layout.item_chat_inside_search_image, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int itemViewType = getItemViewType(i);
        ChatInsideSearchImageViewData chatInsideSearchImageViewData = (ChatInsideSearchImageViewData) getItem(i);
        if (itemViewType == 0) {
            HeaderHolder headerHolder = (HeaderHolder) viewHolder;
            headerHolder.mDataTV.setText(chatInsideSearchImageViewData.getLabelText());
            if (DesktopUtil.m144301a(this.f132150c)) {
                headerHolder.itemView.setPadding(0, 10, 0, 4);
            } else if (this.f132151d) {
                headerHolder.itemView.setPadding(12, 12, 12, 12);
            } else {
                headerHolder.itemView.setPadding(0, 12, 0, 12);
            }
        } else {
            ImageViewHolder imageViewHolder = (ImageViewHolder) viewHolder;
            if (DesktopUtil.m144301a(this.f132150c)) {
                imageViewHolder.itemView.getLayoutParams().height = UIUtils.dp2px(this.f132150c, 68.0f);
            } else if (this.f132151d) {
                imageViewHolder.itemView.getLayoutParams().height = UIUtils.dp2px(this.f132150c, 90.0f);
            } else {
                imageViewHolder.itemView.getLayoutParams().height = UIUtils.dp2px(this.f132150c, 83.0f);
            }
            imageViewHolder.mImageGroup.setOperationCallback(new ChatInsideSearchImageGroup.AbstractC53521a() {
                /* class com.ss.android.lark.search.impl.func.chatinside.detail.image.ChatInsideSearchImageAdapter.C534881 */

                @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.view.ChatInsideSearchImageGroup.AbstractC53521a
                /* renamed from: a */
                public void mo182624a(ChatInsideSearchImageViewData chatInsideSearchImageViewData) {
                    ChatInsideSearchImageAdapter.this.mo182618a(chatInsideSearchImageViewData);
                }

                @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.view.ChatInsideSearchImageGroup.AbstractC53521a
                /* renamed from: b */
                public boolean mo182625b(ChatInsideSearchImageViewData chatInsideSearchImageViewData) {
                    return ChatInsideSearchImageAdapter.this.f132149b.contains(chatInsideSearchImageViewData);
                }

                @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.view.ChatInsideSearchImageGroup.AbstractC53521a
                /* renamed from: c */
                public boolean mo182626c(ChatInsideSearchImageViewData chatInsideSearchImageViewData) {
                    if (!ChatInsideSearchImageAdapter.this.f132149b.contains(chatInsideSearchImageViewData) && ChatInsideSearchImageAdapter.this.f132149b.size() >= 9) {
                        return false;
                    }
                    return true;
                }

                @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.view.ChatInsideSearchImageGroup.AbstractC53521a
                /* renamed from: a */
                public void mo182622a(View view, ImageSet imageSet) {
                    if (ChatInsideSearchImageAdapter.this.f132148a != null) {
                        ChatInsideSearchImageAdapter.this.f132148a.mo182627a(view, imageSet);
                    }
                }

                @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.view.ChatInsideSearchImageGroup.AbstractC53521a
                /* renamed from: a */
                public void mo182623a(View view, ChatInsideSearchImageViewData chatInsideSearchImageViewData) {
                    if (ChatInsideSearchImageAdapter.this.f132148a != null) {
                        ChatInsideSearchImageAdapter.this.f132148a.mo182628a(view, chatInsideSearchImageViewData);
                    }
                }
            });
            imageViewHolder.mImageGroup.mo182691a(chatInsideSearchImageViewData, this.f132151d);
        }
        GridSLM.LayoutParams a = GridSLM.LayoutParams.m257453a(viewHolder.itemView.getLayoutParams());
        a.mo229889c(GridSLM.f165423a);
        a.mo229876a(4);
        a.mo229887b(chatInsideSearchImageViewData.getSectionFirstPosition());
        viewHolder.itemView.setLayoutParams(a);
    }
}
