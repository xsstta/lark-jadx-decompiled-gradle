package com.ss.android.lark.moments.impl.feed.nineimage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1356d;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.moments.v1.Media;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.media.MediaExtra;
import com.ss.android.lark.chat.entity.media.MediaImageSet;
import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost;
import com.ss.android.lark.moments.impl.feed.nineimage.NineImageBean;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 #2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001:\u0001#B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J\u0015\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u0016J$\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012H\u0016J\u001c\u0010\u001e\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016J\u0014\u0010\u001f\u001a\u00020\u00182\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u000fJ\u0006\u0010!\u001a\u00020\u0018J\u000e\u0010\"\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/nineimage/NineImageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Lcom/ss/android/lark/moments/impl/feed/nineimage/NineImageBean;", "Landroid/view/View;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isShowProfileRoundBg", "", "mDiffer", "Landroidx/recyclerview/widget/AsyncListDiffer;", "tag", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsPost;", "generateItemSetList", "", "Lcom/ss/android/lark/chat/entity/image/ImageSet;", "getItemCount", "", "getItemViewType", "position", "isSameItem", "(Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsPost;)Ljava/lang/Boolean;", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewRecycled", "setImageList", "images", "setShowProfileRoundBg", "setTag", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.feed.nineimage.a */
public final class NineImageAdapter extends RecyclerView.Adapter<AbstractC58967a<NineImageBean, View>> {

    /* renamed from: b */
    public static final Companion f119995b = new Companion(null);

    /* renamed from: a */
    public final Context f119996a;

    /* renamed from: c */
    private final C1356d<NineImageBean> f119997c = new C1356d<>(this, new C47558b());

    /* renamed from: d */
    private IMomentsPost f119998d;

    /* renamed from: e */
    private boolean f119999e;

    /* renamed from: a */
    public final void mo167091a() {
        this.f119999e = true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/nineimage/NineImageAdapter$Companion;", "", "()V", "LOG_TAG", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.nineimage.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/moments/impl/feed/nineimage/NineImageAdapter$mDiffer$1", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ss/android/lark/moments/impl/feed/nineimage/NineImageBean;", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.nineimage.a$b */
    public static final class C47558b extends C1374g.AbstractC1378c<NineImageBean> {
        C47558b() {
        }

        /* renamed from: a */
        public boolean areItemsTheSame(NineImageBean nineImageBean, NineImageBean nineImageBean2) {
            Intrinsics.checkParameterIsNotNull(nineImageBean, "oldItem");
            Intrinsics.checkParameterIsNotNull(nineImageBean2, "newItem");
            return nineImageBean.isItemSame(nineImageBean2);
        }

        /* renamed from: b */
        public boolean areContentsTheSame(NineImageBean nineImageBean, NineImageBean nineImageBean2) {
            Intrinsics.checkParameterIsNotNull(nineImageBean, "oldItem");
            Intrinsics.checkParameterIsNotNull(nineImageBean2, "newItem");
            return nineImageBean.isContentSame(nineImageBean2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f119997c.mo7374a().size();
    }

    /* renamed from: b */
    public final List<ImageSet> mo167097b() {
        long j;
        ArrayList arrayList = new ArrayList();
        for (NineImageBean nineImageBean : this.f119997c.mo7374a()) {
            if (nineImageBean.mo167081b() == NineImageBean.NineImageType.TYPE_VIDEO) {
                Media d = nineImageBean.mo167084d();
                if (d != null) {
                    com.bytedance.lark.pb.basic.v1.ImageSet imageSet = d.cover;
                    if (imageSet != null) {
                        Intrinsics.checkExpressionValueIsNotNull(imageSet, "media.cover ?: let {\n   …SetList\n                }");
                        MediaImageSet mediaImageSet = new MediaImageSet(MomentsDependencyHolder.f118998b.mo165899a().imageDependency().mo144713a(imageSet));
                        MediaExtra mediaExtra = new MediaExtra();
                        mediaExtra.setUrl(d.drive_url);
                        mediaExtra.setKey("");
                        Long l = d.size;
                        Intrinsics.checkExpressionValueIsNotNull(l, "media.size");
                        mediaExtra.setSize(l.longValue());
                        mediaExtra.setFilePath(d.local_url);
                        Integer num = d.duration_sec;
                        if (num != null) {
                            j = (long) num.intValue();
                        } else {
                            j = 0;
                        }
                        mediaExtra.setDuration(j);
                        mediaImageSet.setMediaExtra(mediaExtra);
                        mediaImageSet.setMessageIdentity(new MessageIdentity("", ""));
                        arrayList.add(mediaImageSet);
                    } else {
                        Log.m165383e("NineImageAdapter", "generateItemSetList media_cover=null");
                        return arrayList;
                    }
                } else {
                    Log.m165383e("NineImageAdapter", "generateItemSetList media=null");
                    return arrayList;
                }
            } else {
                com.bytedance.lark.pb.basic.v1.ImageSet c = nineImageBean.mo167083c();
                if (c != null) {
                    arrayList.add(MomentsDependencyHolder.f118998b.mo165899a().imageDependency().mo144713a(c));
                } else {
                    Log.m165383e("NineImageAdapter", "generateItemSetList image_set=null");
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo167092a(IMomentsPost bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "tag");
        this.f119998d = bVar;
    }

    /* renamed from: a */
    public final void mo167095a(List<NineImageBean> list) {
        Intrinsics.checkParameterIsNotNull(list, "images");
        this.f119997c.mo7376a(list);
    }

    public NineImageAdapter(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        this.f119996a = context;
    }

    /* renamed from: a */
    public void onViewRecycled(AbstractC58967a<NineImageBean, View> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        if (aVar instanceof NineVideoViewHolder) {
            ((NineVideoViewHolder) aVar).mo167107b();
        } else if (aVar instanceof NineImageViewHolder) {
            ((NineImageViewHolder) aVar).mo167101a();
        }
        super.onViewRecycled(aVar);
    }

    /* renamed from: b */
    public final Boolean mo167096b(IMomentsPost bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "tag");
        IMomentsPost bVar2 = this.f119998d;
        if (bVar2 != null) {
            return Boolean.valueOf(bVar2.isItemSame(bVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f119997c.mo7374a().get(i).mo167079a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/feed/nineimage/NineImageAdapter$onBindViewHolder$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.nineimage.a$c */
    public static final class C47559c extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ NineImageAdapter f120000a;

        /* renamed from: b */
        final /* synthetic */ int f120001b;

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x005e, code lost:
            if (r0.isVideo() == false) goto L_0x0060;
         */
        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSingleClick(android.view.View r5) {
            /*
            // Method dump skipped, instructions count: 145
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.feed.nineimage.NineImageAdapter.C47559c.onSingleClick(android.view.View):void");
        }

        C47559c(NineImageAdapter aVar, int i) {
            this.f120000a = aVar;
            this.f120001b = i;
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(AbstractC58967a<NineImageBean, View> aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        aVar.mo165944a(this.f119997c.mo7374a().get(i));
        aVar.itemView.setOnClickListener(new C47559c(this, i));
    }

    /* renamed from: a */
    public AbstractC58967a<NineImageBean, View> onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == (NineImageBean.NineImageType.TYPE_SINGLE_IMAGE.ordinal() | NineImageBean.NineImageType.TYPE_NORMAL_IMAGE.ordinal())) {
            View inflate = from.inflate(R.layout.moments_item_nine_image_layout, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(layout.…ge_layout, parent, false)");
            NineImageViewHolder cVar = new NineImageViewHolder(inflate);
            if (this.f119999e) {
                cVar.mo167103b();
            }
            return cVar;
        } else if (i == NineImageBean.NineImageType.TYPE_VIDEO.ordinal()) {
            View inflate2 = from.inflate(R.layout.moments_item_nine_video_layout, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate2, "inflater.inflate(layout.…eo_layout, parent, false)");
            NineVideoViewHolder dVar = new NineVideoViewHolder(inflate2);
            if (this.f119999e) {
                dVar.mo167105a();
            }
            return dVar;
        } else {
            View inflate3 = from.inflate(R.layout.moments_item_nine_image_layout, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate3, "inflater.inflate(layout.…ge_layout, parent, false)");
            NineImageViewHolder cVar2 = new NineImageViewHolder(inflate3);
            if (this.f119999e) {
                cVar2.mo167103b();
            }
            return cVar2;
        }
    }
}
