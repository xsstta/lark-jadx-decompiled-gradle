package com.ss.android.lark.moments.impl.publish.grid;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency;
import com.ss.android.lark.moments.impl.common.utils.MomentsPreviewHelper;
import com.ss.android.lark.moments.impl.publish.draft.ImageData;
import com.ss.android.lark.moments.impl.publish.draft.VideoGridInfo;
import com.ss.android.lark.moments.impl.publish.grid.OnGridItemActionListener;
import com.ss.android.lark.moments.impl.publish.grid.item.MomentsPublishAdderViewHolder;
import com.ss.android.lark.moments.impl.publish.grid.item.MomentsPublishPhotoViewHolder;
import com.ss.android.lark.moments.impl.publish.grid.item.MomentsPublishVideoViewHolder;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 X2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001:\u0001XB\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJN\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\b\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020&2$\b\u0002\u0010'\u001a\u001e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(j\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*`+J\u0016\u0010,\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020$J\u0016\u00100\u001a\u0012\u0012\u0004\u0012\u0002010\u0015j\b\u0012\u0004\u0012\u000201`\u0016J\b\u00102\u001a\u000203H\u0016J\u0010\u00104\u001a\u0002032\u0006\u00105\u001a\u000203H\u0016J\u000e\u00106\u001a\b\u0012\u0004\u0012\u00020807H\u0002J\u0006\u00109\u001a\u000203J\b\u0010:\u001a\u0004\u0018\u00010.J\u0006\u0010;\u001a\u00020&J\u0006\u0010<\u001a\u00020&J\u0006\u0010=\u001a\u00020&J$\u0010>\u001a\u00020\u001f2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u00105\u001a\u000203H\u0016J$\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u000203H\u0016J\u0016\u0010D\u001a\u00020\u001f2\u0006\u0010E\u001a\u00020*2\u0006\u0010%\u001a\u00020&J\u0006\u0010F\u001a\u00020\u001fJ\u0014\u0010G\u001a\u00020\u001f2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020)0!J\u000e\u0010I\u001a\u00020\u001f2\u0006\u0010J\u001a\u00020\u0003J\u000e\u0010K\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020.J\u0014\u0010K\u001a\u00020\u001f2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020M07J\u0006\u0010N\u001a\u00020\u001fJ\u0010\u0010O\u001a\u00020\u001f2\u0006\u00105\u001a\u000203H\u0002J\u0018\u0010P\u001a\u00020\u001f2\u0006\u0010Q\u001a\u0002032\u0006\u0010R\u001a\u000203H\u0002J\u0014\u0010S\u001a\u00020\u001f2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020)07J\u0016\u0010U\u001a\u00020&2\u0006\u0010Q\u001a\u0002032\u0006\u0010R\u001a\u000203J\u0016\u0010V\u001a\u00020\u001f2\u0006\u0010W\u001a\u00020.2\u0006\u0010/\u001a\u00020$R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0015j\b\u0012\u0004\u0012\u00020\u0003`\u0016X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001b\u0010\u001c¨\u0006Y"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/grid/MomentsPublishGridAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Lcom/ss/android/lark/moments/impl/publish/grid/MediaData;", "Landroid/view/View;", "activity", "Landroid/app/Activity;", "helper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "listener", "Lcom/ss/android/lark/moments/impl/publish/grid/OnMediaStateChangedListener;", "(Landroid/app/Activity;Landroidx/recyclerview/widget/ItemTouchHelper;Lcom/ss/android/lark/moments/impl/publish/grid/OnMediaStateChangedListener;)V", "getActivity", "()Landroid/app/Activity;", "adderData", "Lcom/ss/android/lark/moments/impl/publish/grid/AdderData;", "getAdderData", "()Lcom/ss/android/lark/moments/impl/publish/grid/AdderData;", "adderData$delegate", "Lkotlin/Lazy;", "list", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getListener", "()Lcom/ss/android/lark/moments/impl/publish/grid/OnMediaStateChangedListener;", "notifyHandler", "Landroid/os/Handler;", "getNotifyHandler", "()Landroid/os/Handler;", "notifyHandler$delegate", "addPhotos", "", "photos", "", "Lcom/ss/android/lark/widget/photo_picker/entity/Photo;", "imageState", "Lcom/ss/android/lark/moments/impl/publish/grid/MediaState;", "isKeepOriginPhoto", "", "imageMap", "Ljava/util/HashMap;", "", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "Lkotlin/collections/HashMap;", "addVideo", "videoInfo", "Lcom/ss/android/lark/moments/impl/publish/draft/VideoGridInfo;", "state", "getImages", "Lcom/ss/android/lark/moments/impl/publish/grid/GridImageData;", "getItemCount", "", "getItemViewType", "position", "getPhotoItems", "", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "getSelectedCount", "getVideoGridInfo", "hasImage", "hasVideo", "mediaIsReady", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onUploadSuccess", "image", "refreshAdderView", "refreshImages", "photoUrls", "removePhoto", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "resetFromDraft", "photoViewList", "Lcom/ss/android/lark/moments/impl/publish/draft/ImageData;", "safeNotifyDataSetChanged", "safeNotifyItemChanged", "safeNotifyItemMoved", "fromPosition", "toPosition", "setErrorPhoto", "paths", "swapItem", "updateVideoState", "videoGridInfo", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.publish.grid.g */
public final class MomentsPublishGridAdapter extends RecyclerView.Adapter<AbstractC58967a<MediaData, View>> {

    /* renamed from: b */
    public static final Companion f120773b = new Companion(null);

    /* renamed from: a */
    public final ArrayList<MediaData> f120774a = new ArrayList<>();

    /* renamed from: c */
    private final Lazy f120775c = LazyKt.lazy(C47978e.INSTANCE);

    /* renamed from: d */
    private final Lazy f120776d = LazyKt.lazy(new C47976d(this));

    /* renamed from: e */
    private final Activity f120777e;

    /* renamed from: f */
    private final ItemTouchHelper f120778f;

    /* renamed from: g */
    private final OnMediaStateChangedListener f120779g;

    /* renamed from: l */
    private final Handler m189391l() {
        return (Handler) this.f120775c.getValue();
    }

    /* renamed from: m */
    private final AdderData m189392m() {
        return (AdderData) this.f120776d.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/grid/MomentsPublishGridAdapter$Companion;", "", "()V", "TAG", "", "column_count", "", "row_count", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.grid.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: j */
    public final Activity mo168087j() {
        return this.f120777e;
    }

    /* renamed from: k */
    public final OnMediaStateChangedListener mo168088k() {
        return this.f120779g;
    }

    /* renamed from: a */
    public void onBindViewHolder(AbstractC58967a<MediaData, View> aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        aVar.mo165944a(this.f120774a.get(i));
    }

    /* renamed from: a */
    public final void mo168073a(List<ImageData> list) {
        Intrinsics.checkParameterIsNotNull(list, "photoViewList");
        ArrayList arrayList = new ArrayList();
        HashMap<String, IPhotoDependency.Image> hashMap = new HashMap<>();
        for (T t : list) {
            hashMap.put(t.getLocalPath(), new IPhotoDependency.Image(new ArrayList(), t.getWidth(), t.getHeight(), t.getToken()));
            Photo photo = new Photo();
            photo.setPath(t.getLocalPath());
            arrayList.add(photo);
        }
        mo168074a(arrayList, null, false, hashMap);
    }

    /* renamed from: a */
    public final void mo168074a(List<Photo> list, MediaState mediaState, boolean z, HashMap<String, IPhotoDependency.Image> hashMap) {
        String str;
        MediaState mediaState2;
        MediaState mediaState3;
        Intrinsics.checkParameterIsNotNull(list, "photos");
        Intrinsics.checkParameterIsNotNull(hashMap, "imageMap");
        if (list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (T t : this.f120774a) {
                if (t instanceof GridImageData) {
                    arrayList.add(t);
                }
            }
            Iterator<T> it = list.iterator();
            while (true) {
                boolean z2 = false;
                if (it.hasNext()) {
                    T next = it.next();
                    IPhotoDependency.Image image = hashMap.get(next.getPath());
                    String path = next.getPath();
                    Intrinsics.checkExpressionValueIsNotNull(path, "it.path");
                    int width = image != null ? image.getWidth() : 0;
                    int height = image != null ? image.getHeight() : 0;
                    if (image == null || (str = image.getToken()) == null) {
                        str = "";
                    }
                    ImageData imageData = new ImageData(path, width, height, str);
                    if (mediaState != null) {
                        mediaState2 = mediaState;
                    } else {
                        if (imageData.getToken().length() == 0) {
                            z2 = true;
                        }
                        if (z2) {
                            mediaState3 = MediaState.TYPE_FAIL;
                        } else {
                            mediaState3 = MediaState.TYPE_SUCCESS;
                        }
                        mediaState2 = mediaState3;
                    }
                    String path2 = next.getPath();
                    Intrinsics.checkExpressionValueIsNotNull(path2, "it.path");
                    arrayList.add(new GridImageData(path2, imageData, mediaState2, z, new C47974b(this, hashMap, mediaState, z, arrayList)));
                } else {
                    this.f120774a.clear();
                    this.f120774a.addAll(arrayList.subList(0, RangesKt.coerceAtMost(arrayList.size(), 9)));
                    mo168067a();
                    this.f120779g.mo168098b();
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo168075a(int i, int i2) {
        if (this.f120774a.get(i2) instanceof AdderData) {
            return false;
        }
        if (i < i2) {
            int i3 = i;
            while (i3 < i2) {
                int i4 = i3 + 1;
                Collections.swap(this.f120774a, i3, i4);
                i3 = i4;
            }
        } else {
            int i5 = i2 + 1;
            if (i >= i5) {
                int i6 = i;
                while (true) {
                    Collections.swap(this.f120774a, i6, i6 - 1);
                    if (i6 == i5) {
                        break;
                    }
                    i6--;
                }
            }
        }
        m189390b(i, i2);
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/Handler;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.grid.g$e */
    static final class C47978e extends Lambda implements Function0<Handler> {
        public static final C47978e INSTANCE = new C47978e();

        C47978e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Handler invoke() {
            return new Handler();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.grid.g$h */
    public static final class RunnableC47981h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MomentsPublishGridAdapter f120789a;

        RunnableC47981h(MomentsPublishGridAdapter gVar) {
            this.f120789a = gVar;
        }

        public final void run() {
            this.f120789a.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.grid.g$i */
    public static final class RunnableC47982i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MomentsPublishGridAdapter f120790a;

        /* renamed from: b */
        final /* synthetic */ int f120791b;

        RunnableC47982i(MomentsPublishGridAdapter gVar, int i) {
            this.f120790a = gVar;
            this.f120791b = i;
        }

        public final void run() {
            this.f120790a.notifyItemChanged(this.f120791b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/moments/impl/publish/grid/AdderData;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.grid.g$d */
    static final class C47976d extends Lambda implements Function0<AdderData> {
        final /* synthetic */ MomentsPublishGridAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47976d(MomentsPublishGridAdapter gVar) {
            super(0);
            this.this$0 = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AdderData invoke() {
            return new AdderData(new OnGridItemActionListener(this) {
                /* class com.ss.android.lark.moments.impl.publish.grid.MomentsPublishGridAdapter.C47976d.C479771 */

                /* renamed from: a */
                final /* synthetic */ C47976d f120786a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f120786a = r1;
                }

                @Override // com.ss.android.lark.moments.impl.publish.grid.OnGridItemActionListener
                /* renamed from: a */
                public void mo168090a(View view, MediaData fVar) {
                    Intrinsics.checkParameterIsNotNull(view, "view");
                    Intrinsics.checkParameterIsNotNull(fVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    OnGridItemActionListener.C47984a.m189431a(this, view, fVar);
                }

                @Override // com.ss.android.lark.moments.impl.publish.grid.OnGridItemActionListener
                /* renamed from: b */
                public void mo168091b(View view, MediaData fVar) {
                    Intrinsics.checkParameterIsNotNull(view, "view");
                    Intrinsics.checkParameterIsNotNull(fVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    OnGridItemActionListener.C47984a.m189432b(this, view, fVar);
                }

                @Override // com.ss.android.lark.moments.impl.publish.grid.OnGridItemActionListener
                /* renamed from: a */
                public void mo168089a(View view, int i) {
                    Intrinsics.checkParameterIsNotNull(view, "view");
                    MomentsPreviewHelper.f119251a.mo166205a(this.f120786a.this$0.mo168087j(), 9 - this.f120786a.this$0.mo168076b(), 9);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.grid.g$j */
    public static final class RunnableC47983j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MomentsPublishGridAdapter f120792a;

        /* renamed from: b */
        final /* synthetic */ int f120793b;

        /* renamed from: c */
        final /* synthetic */ int f120794c;

        RunnableC47983j(MomentsPublishGridAdapter gVar, int i, int i2) {
            this.f120792a = gVar;
            this.f120793b = i;
            this.f120794c = i2;
        }

        public final void run() {
            this.f120792a.notifyItemMoved(this.f120793b, this.f120794c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f120774a.size();
    }

    /* renamed from: i */
    public final void mo168086i() {
        m189391l().post(new RunnableC47981h(this));
    }

    /* renamed from: b */
    public final int mo168076b() {
        Iterator<T> it = this.f120774a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!(it.next() instanceof AdderData)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public final boolean mo168080c() {
        Iterator<T> it = this.f120774a.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof GridVideoData) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo168081d() {
        Iterator<T> it = this.f120774a.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof GridImageData) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo168085h() {
        Iterator<T> it = this.f120774a.iterator();
        while (it.hasNext()) {
            if (it.next().mo168065f() != MediaState.TYPE_SUCCESS) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final ArrayList<GridImageData> mo168082e() {
        ArrayList<GridImageData> arrayList = new ArrayList<>();
        for (T t : this.f120774a) {
            if (t instanceof GridImageData) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final VideoGridInfo mo168083f() {
        for (T t : this.f120774a) {
            if (t instanceof GridVideoData) {
                return t.mo168057a();
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo168067a() {
        if (this.f120774a.size() != 1 || !(this.f120774a.get(0) instanceof AdderData)) {
            int size = this.f120774a.size();
            if (1 <= size && 9 > size && !(CollectionsKt.last((List) this.f120774a) instanceof AdderData)) {
                this.f120774a.add(m189392m());
                mo168086i();
                return;
            }
            return;
        }
        this.f120774a.clear();
        mo168086i();
    }

    /* renamed from: g */
    public final List<PhotoItem> mo168084g() {
        PhotoItem photoItem;
        ArrayList arrayList = new ArrayList();
        for (T t : this.f120774a) {
            if (t instanceof GridImageData) {
                ImageData b = t.mo168054b();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(b.getLocalPath());
                photoItem = new PhotoItem().setPaths(arrayList2).setType(2).setToken(b.getToken()).setWidth(b.getWidth()).setHeight(b.getHeight());
                PhotoItem.TranslateProperty translateProperty = photoItem.getTranslateProperty();
                Intrinsics.checkExpressionValueIsNotNull(translateProperty, "translateProperty");
                translateProperty.setTranslated(false);
            } else {
                photoItem = null;
            }
            if (photoItem != null) {
                arrayList.add(photoItem);
            }
        }
        return arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/moments/impl/publish/grid/MomentsPublishGridAdapter$addVideo$videoData$1", "Lcom/ss/android/lark/moments/impl/publish/grid/OnGridItemActionListener;", "onDeleteClickListener", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/moments/impl/publish/grid/MediaData;", "onPreviewClickListener", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.grid.g$c */
    public static final class C47975c implements OnGridItemActionListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPublishGridAdapter f120785a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47975c(MomentsPublishGridAdapter gVar) {
            this.f120785a = gVar;
        }

        @Override // com.ss.android.lark.moments.impl.publish.grid.OnGridItemActionListener
        /* renamed from: a */
        public void mo168089a(View view, int i) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            OnGridItemActionListener.C47984a.m189430a(this, view, i);
        }

        @Override // com.ss.android.lark.moments.impl.publish.grid.OnGridItemActionListener
        /* renamed from: b */
        public void mo168091b(View view, MediaData fVar) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(fVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f120785a.f120774a.clear();
            this.f120785a.mo168086i();
            this.f120785a.mo168088k().mo168095a();
        }

        @Override // com.ss.android.lark.moments.impl.publish.grid.OnGridItemActionListener
        /* renamed from: a */
        public void mo168090a(View view, MediaData fVar) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(fVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (fVar instanceof GridVideoData) {
                MomentsPreviewHelper.f119251a.mo166207a(this.f120785a.mo168087j(), view, MomentsPreviewHelper.f119251a.mo166204a(((GridVideoData) fVar).mo168057a().getVideoInfo().getPath()));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/publish/grid/MomentsPublishGridAdapter$onCreateViewHolder$1", "Lcom/ss/android/lark/moments/impl/publish/grid/IPublishMediaRetryUpload;", "retryUploadMedia", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/moments/impl/publish/grid/MediaData;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.grid.g$f */
    public static final class C47979f implements IPublishMediaRetryUpload {

        /* renamed from: a */
        final /* synthetic */ MomentsPublishGridAdapter f120787a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47979f(MomentsPublishGridAdapter gVar) {
            this.f120787a = gVar;
        }

        @Override // com.ss.android.lark.moments.impl.publish.grid.IPublishMediaRetryUpload
        /* renamed from: a */
        public void mo168061a(MediaData fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (fVar instanceof GridImageData) {
                fVar.mo168063a(MediaState.TYPE_UPLOADING);
                this.f120787a.mo168086i();
                this.f120787a.mo168088k().mo168096a((GridImageData) fVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/publish/grid/MomentsPublishGridAdapter$onCreateViewHolder$2", "Lcom/ss/android/lark/moments/impl/publish/grid/IPublishMediaRetryUpload;", "retryUploadMedia", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/moments/impl/publish/grid/MediaData;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.grid.g$g */
    public static final class C47980g implements IPublishMediaRetryUpload {

        /* renamed from: a */
        final /* synthetic */ MomentsPublishGridAdapter f120788a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47980g(MomentsPublishGridAdapter gVar) {
            this.f120788a = gVar;
        }

        @Override // com.ss.android.lark.moments.impl.publish.grid.IPublishMediaRetryUpload
        /* renamed from: a */
        public void mo168061a(MediaData fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (fVar instanceof GridVideoData) {
                fVar.mo168063a(MediaState.TYPE_UPLOADING);
                this.f120788a.mo168086i();
                this.f120788a.mo168088k().mo168097a((GridVideoData) fVar);
            }
        }
    }

    /* renamed from: a */
    private final void m189388a(int i) {
        m189391l().post(new RunnableC47982i(this, i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f120774a.get(i).mo168064e().ordinal();
    }

    /* renamed from: b */
    public final void mo168078b(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "paths");
        boolean z = false;
        for (T t : this.f120774a) {
            if ((t instanceof GridImageData) && list.contains(t.mo168052a()) && t.mo168065f() == MediaState.TYPE_UPLOADING) {
                t.mo168063a(MediaState.TYPE_FAIL);
                z = true;
            }
        }
        if (z) {
            mo168086i();
            this.f120779g.mo168098b();
            LKUIToast.loadFail(this.f120777e, (int) R.string.Lark_CommunityUnableToUploadToast);
        }
    }

    /* renamed from: c */
    public final void mo168079c(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "photoUrls");
        if (list.size() == 0) {
            this.f120774a.clear();
            mo168086i();
        } else if (list.size() != this.f120774a.size()) {
            int i = 0;
            int i2 = 0;
            while (i < this.f120774a.size()) {
                MediaData fVar = this.f120774a.get(i);
                Intrinsics.checkExpressionValueIsNotNull(fVar, "list[i]");
                MediaData fVar2 = fVar;
                if (i2 >= list.size() || ((fVar2 instanceof GridImageData) && (!Intrinsics.areEqual(((GridImageData) fVar2).mo168054b().getLocalPath(), list.get(i2))))) {
                    this.f120774a.remove(i);
                } else {
                    i++;
                    i2++;
                }
            }
            mo168067a();
            mo168086i();
            this.f120779g.mo168098b();
        }
    }

    /* renamed from: a */
    public final void mo168069a(VideoGridInfo videoGridInfo) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(videoGridInfo, "videoInfo");
        String fileToken = videoGridInfo.getFileToken();
        if (fileToken == null || fileToken.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || videoGridInfo.getCover() == null) {
            mo168077b(videoGridInfo, MediaState.TYPE_FAIL);
        } else {
            mo168077b(videoGridInfo, MediaState.TYPE_SUCCESS);
        }
    }

    /* renamed from: a */
    public final void mo168071a(MediaData fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f120774a.remove(fVar);
        mo168067a();
        mo168086i();
        this.f120779g.mo168098b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/moments/impl/publish/grid/MomentsPublishGridAdapter$addPhotos$2$data$1", "Lcom/ss/android/lark/moments/impl/publish/grid/OnGridItemActionListener;", "onDeleteClickListener", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/moments/impl/publish/grid/MediaData;", "onPreviewClickListener", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.grid.g$b */
    public static final class C47974b implements OnGridItemActionListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPublishGridAdapter f120780a;

        /* renamed from: b */
        final /* synthetic */ HashMap f120781b;

        /* renamed from: c */
        final /* synthetic */ MediaState f120782c;

        /* renamed from: d */
        final /* synthetic */ boolean f120783d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f120784e;

        @Override // com.ss.android.lark.moments.impl.publish.grid.OnGridItemActionListener
        /* renamed from: a */
        public void mo168089a(View view, int i) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            OnGridItemActionListener.C47984a.m189430a(this, view, i);
        }

        @Override // com.ss.android.lark.moments.impl.publish.grid.OnGridItemActionListener
        /* renamed from: b */
        public void mo168091b(View view, MediaData fVar) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(fVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f120780a.mo168071a(fVar);
            this.f120780a.mo168067a();
            this.f120780a.mo168088k().mo168095a();
        }

        @Override // com.ss.android.lark.moments.impl.publish.grid.OnGridItemActionListener
        /* renamed from: a */
        public void mo168090a(View view, MediaData fVar) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(fVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            MomentsPreviewHelper.f119251a.mo166206a(this.f120780a.mo168087j(), view, this.f120780a.f120774a.indexOf(fVar), new ArrayList<>(this.f120780a.mo168084g()));
        }

        C47974b(MomentsPublishGridAdapter gVar, HashMap hashMap, MediaState mediaState, boolean z, ArrayList arrayList) {
            this.f120780a = gVar;
            this.f120781b = hashMap;
            this.f120782c = mediaState;
            this.f120783d = z;
            this.f120784e = arrayList;
        }
    }

    /* renamed from: b */
    private final void m189390b(int i, int i2) {
        m189391l().post(new RunnableC47983j(this, i, i2));
    }

    /* renamed from: a */
    public AbstractC58967a<MediaData, View> onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i == MediaType.TYPE_IMAGE.ordinal()) {
            return MomentsPublishPhotoViewHolder.f120732c.mo168041a(viewGroup, this.f120778f, new C47979f(this));
        }
        if (i == MediaType.TYPE_VIDEO.ordinal()) {
            return MomentsPublishVideoViewHolder.f120749b.mo168048a(viewGroup, new C47980g(this));
        }
        return MomentsPublishAdderViewHolder.f120729a.mo168037a(viewGroup);
    }

    /* renamed from: b */
    public final void mo168077b(VideoGridInfo videoGridInfo, MediaState mediaState) {
        Intrinsics.checkParameterIsNotNull(videoGridInfo, "videoInfo");
        Intrinsics.checkParameterIsNotNull(mediaState, "state");
        GridVideoData cVar = new GridVideoData(videoGridInfo, videoGridInfo.getFrameInfo().getPath(), mediaState, new C47975c(this));
        this.f120774a.clear();
        this.f120774a.add(cVar);
        mo168086i();
        this.f120779g.mo168098b();
    }

    /* renamed from: a */
    public final void mo168068a(IPhotoDependency.Image image, boolean z) {
        boolean z2;
        Intrinsics.checkParameterIsNotNull(image, "image");
        int i = 0;
        for (T t : this.f120774a) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            T t2 = t;
            if (t2 instanceof GridImageData) {
                T t3 = t2;
                if (!image.getUrls().contains(t3.mo168052a()) || t3.mo168055c() != z || t2.mo168065f() == MediaState.TYPE_SUCCESS) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    t2.mo168063a(MediaState.TYPE_SUCCESS);
                    t3.mo168053a(new ImageData(t3.mo168052a(), image.getWidth(), image.getHeight(), image.getToken()));
                    m189388a(i);
                    this.f120779g.mo168098b();
                }
            }
            i = i2;
        }
    }

    /* renamed from: a */
    public final void mo168070a(VideoGridInfo videoGridInfo, MediaState mediaState) {
        Intrinsics.checkParameterIsNotNull(videoGridInfo, "videoGridInfo");
        Intrinsics.checkParameterIsNotNull(mediaState, "state");
        if (!this.f120774a.isEmpty()) {
            MediaData fVar = this.f120774a.get(0);
            Intrinsics.checkExpressionValueIsNotNull(fVar, "list[0]");
            MediaData fVar2 = fVar;
            if (fVar2 instanceof GridVideoData) {
                GridVideoData cVar = (GridVideoData) fVar2;
                if (Intrinsics.areEqual(cVar.mo168057a().getVideoInfo().getPath(), videoGridInfo.getVideoInfo().getPath()) && fVar2.mo168065f() == MediaState.TYPE_UPLOADING) {
                    fVar2.mo168063a(mediaState);
                    cVar.mo168058a(videoGridInfo);
                    m189388a(0);
                    this.f120779g.mo168098b();
                    if (mediaState == MediaState.TYPE_FAIL) {
                        LKUIToast.loadFail(this.f120777e, (int) R.string.Lark_CommunityUnableToUploadToast);
                    }
                }
            }
        }
    }

    public MomentsPublishGridAdapter(Activity activity, ItemTouchHelper itemTouchHelper, OnMediaStateChangedListener iVar) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(itemTouchHelper, "helper");
        Intrinsics.checkParameterIsNotNull(iVar, "listener");
        this.f120777e = activity;
        this.f120778f = itemTouchHelper;
        this.f120779g = iVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.moments.impl.publish.grid.g */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ void m189389a(MomentsPublishGridAdapter gVar, List list, MediaState mediaState, boolean z, HashMap hashMap, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            hashMap = new HashMap();
        }
        gVar.mo168074a(list, mediaState, z, hashMap);
    }
}
