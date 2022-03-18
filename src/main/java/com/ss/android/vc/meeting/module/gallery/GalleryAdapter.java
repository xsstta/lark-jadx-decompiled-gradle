package com.ss.android.vc.meeting.module.gallery;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60748b;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.popupwindow.InMeetingParticipantControlPopWindow;
import com.ss.android.vc.meeting.module.multi.presenter.InMeetingPresenter;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001*B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001bH\u0016J\u001c\u0010\u001f\u001a\u00020\u00192\n\u0010 \u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001bH\u0016J\u001c\u0010!\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001bH\u0016J\u0014\u0010%\u001a\u00020\u00192\n\u0010 \u001a\u00060\u0002R\u00020\u0000H\u0016J\u0014\u0010&\u001a\u00020\u00192\n\u0010 \u001a\u00060\u0002R\u00020\u0000H\u0016J\u0014\u0010'\u001a\u00020\u00192\n\u0010 \u001a\u00060\u0002R\u00020\u0000H\u0016J\u000e\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u000bR\u000e\u0010\n\u001a\u00020\u000bXD¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR*\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\b\u0012\u00060\u0002R\u00020\u00000\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006+"}, d2 = {"Lcom/ss/android/vc/meeting/module/gallery/GalleryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/vc/meeting/module/gallery/GalleryAdapter$GalleryViewHolder;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "presenter", "Lcom/ss/android/vc/meeting/module/multi/presenter/InMeetingPresenter;", "context", "Landroid/content/Context;", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Lcom/ss/android/vc/meeting/module/multi/presenter/InMeetingPresenter;Landroid/content/Context;)V", "TAG", "", "getContext", "()Landroid/content/Context;", "holderWeakMap", "Ljava/util/WeakHashMap;", "getHolderWeakMap", "()Ljava/util/WeakHashMap;", "setHolderWeakMap", "(Ljava/util/WeakHashMap;)V", "getMeeting", "()Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "getPresenter", "()Lcom/ss/android/vc/meeting/module/multi/presenter/InMeetingPresenter;", "destroy", "", "getItemCount", "", "getItemId", "", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewAttachedToWindow", "onViewDetachedFromWindow", "onViewRecycled", "refreshParticipantUI", "key", "GalleryViewHolder", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.gallery.b */
public final class GalleryAdapter extends RecyclerView.Adapter<GalleryViewHolder> {

    /* renamed from: a */
    private final String f155437a = "GalleryAdapter@";

    /* renamed from: b */
    private WeakHashMap<String, GalleryViewHolder> f155438b = new WeakHashMap<>();

    /* renamed from: c */
    private final C61303k f155439c;

    /* renamed from: d */
    private final InMeetingPresenter f155440d;

    /* renamed from: e */
    private final Context f155441e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ss/android/vc/meeting/module/gallery/GalleryAdapter$GalleryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/ss/android/vc/meeting/module/gallery/GalleryAdapter;Landroid/view/View;)V", "galleryItemView", "Lcom/ss/android/vc/meeting/module/gallery/GalleryItemView;", "getGalleryItemView", "()Lcom/ss/android/vc/meeting/module/gallery/GalleryItemView;", "setGalleryItemView", "(Lcom/ss/android/vc/meeting/module/gallery/GalleryItemView;)V", "getView", "()Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.gallery.b$a */
    public final class GalleryViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ GalleryAdapter f155442a;

        /* renamed from: b */
        private GalleryItemView f155443b;

        /* renamed from: c */
        private final View f155444c;

        /* renamed from: a */
        public final GalleryItemView mo214354a() {
            return this.f155443b;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GalleryViewHolder(GalleryAdapter bVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f155442a = bVar;
            this.f155444c = view;
            this.f155443b = (GalleryItemView) view.findViewById(R.id.stream_list_grid_item);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f155439c.ax().mo214329b();
    }

    /* renamed from: a */
    public final void mo214348a() {
        GalleryItemView a;
        C60700b.m235851b(this.f155437a, "[destroy]", "destroy");
        for (Map.Entry<String, GalleryViewHolder> entry : this.f155438b.entrySet()) {
            GalleryViewHolder value = entry.getValue();
            if (!(value == null || (a = value.mo214354a()) == null)) {
                a.mo215960y();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        Participant participant = this.f155439c.ax().mo214334c().get(i);
        return (long) Objects.hash(participant.getId(), participant.getDeviceId(), participant.getParticipantType());
    }

    /* renamed from: a */
    public void onViewRecycled(GalleryViewHolder aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        super.onViewRecycled(aVar);
        int adapterPosition = aVar.getAdapterPosition();
        GalleryItemView a = aVar.mo214354a();
        if (a != null) {
            a.mo215914c(true);
            String str = this.f155437a;
            C60700b.m235851b(str, "[onViewRecycled]", "position: " + adapterPosition);
        }
    }

    /* renamed from: b */
    public void onViewAttachedToWindow(GalleryViewHolder aVar) {
        Object obj;
        InMeetingParticipantControlPopWindow popWindow;
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        super.onViewAttachedToWindow(aVar);
        aVar.getAdapterPosition();
        GalleryItemView a = aVar.mo214354a();
        Object obj2 = null;
        if (a != null) {
            obj = a.getTag();
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            obj2 = obj;
        }
        String str = (String) obj2;
        if (str != null) {
            GalleryModel c = this.f155439c.ax().mo214333c(str);
            if (c != null) {
                c.mo214364a(true);
            }
            if (this.f155439c.ax().mo214340e()) {
                this.f155439c.ax().mo214332b(str);
                mo214351a(str);
            }
            GalleryItemView a2 = aVar.mo214354a();
            if (a2 != null && (popWindow = a2.getPopWindow()) != null) {
                popWindow.dismiss();
            }
        }
    }

    /* renamed from: c */
    public void onViewDetachedFromWindow(GalleryViewHolder aVar) {
        Object obj;
        InMeetingParticipantControlPopWindow popWindow;
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        super.onViewDetachedFromWindow(aVar);
        aVar.getAdapterPosition();
        GalleryItemView a = aVar.mo214354a();
        Object obj2 = null;
        if (a != null) {
            obj = a.getTag();
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            obj2 = obj;
        }
        String str = (String) obj2;
        if (str != null) {
            GalleryModel c = this.f155439c.ax().mo214333c(str);
            if (c != null) {
                c.mo214364a(false);
            }
            if (this.f155439c.ax().mo214340e()) {
                this.f155439c.ax().mo214332b(str);
                mo214351a(str);
            }
            GalleryItemView a2 = aVar.mo214354a();
            if (a2 != null && (popWindow = a2.getPopWindow()) != null) {
                popWindow.dismiss();
            }
        }
    }

    /* renamed from: a */
    public final void mo214351a(String str) {
        Object obj;
        GalleryModel c;
        GalleryItemView a;
        Intrinsics.checkParameterIsNotNull(str, "key");
        GalleryViewHolder aVar = this.f155438b.get(str);
        if (aVar != null) {
            String str2 = str;
            GalleryItemView a2 = aVar.mo214354a();
            String str3 = null;
            if (a2 != null) {
                obj = a2.getTag();
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str3 = obj;
            }
            if (TextUtils.equals(str2, str3) && (c = this.f155439c.ax().mo214333c(str)) != null && c.mo214367d() && (a = aVar.mo214354a()) != null) {
                a.mo215937r();
            }
        }
    }

    /* renamed from: a */
    public GalleryViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View a = C60748b.m236068a(this.f155441e, R.layout.layout_stream_list_item2, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(a, "rootView");
        return new GalleryViewHolder(this, a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0097  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(com.ss.android.vc.meeting.module.gallery.GalleryAdapter.GalleryViewHolder r6, int r7) {
        /*
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.gallery.GalleryAdapter.onBindViewHolder(com.ss.android.vc.meeting.module.gallery.b$a, int):void");
    }

    public GalleryAdapter(C61303k kVar, InMeetingPresenter bVar, Context context) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(bVar, "presenter");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f155439c = kVar;
        this.f155440d = bVar;
        this.f155441e = context;
        setHasStableIds(true);
    }
}
