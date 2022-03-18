package com.ss.android.vc.meeting.module.share.selected;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.reaction.p2557b.C52977a;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.dependency.AbstractC60882ag;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.CalendarInfo;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.meeting.module.share.ShareItemType;
import com.ss.android.vc.meeting.module.share.VideoChatShareItem;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\u0002\u0010\tJ\b\u0010\u001a\u001a\u00020\u000bH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u000bH\u0016J\u0018\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000bH\u0016J\u001e\u0010#\u001a\u00020\u001c2\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bJ\u000e\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lcom/ss/android/vc/meeting/module/share/selected/VideoChatShareSelectListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/vc/meeting/module/share/selected/VideoChatShareSelectListAdapter$ViewHolder;", "context", "Landroid/content/Context;", "datas", "Ljava/util/ArrayList;", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "Lkotlin/collections/ArrayList;", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "SIZE", "", "getSIZE", "()I", "getContext", "()Landroid/content/Context;", "getDatas", "()Ljava/util/ArrayList;", "setDatas", "(Ljava/util/ArrayList;)V", "mListener", "Lcom/ss/android/vc/meeting/module/share/selected/OnVideoChatShareSelectedItemClickListener;", "getMListener", "()Lcom/ss/android/vc/meeting/module/share/selected/OnVideoChatShareSelectedItemClickListener;", "setMListener", "(Lcom/ss/android/vc/meeting/module/share/selected/OnVideoChatShareSelectedItemClickListener;)V", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "setOnDeleteListener", "listener", "ViewHolder", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.share.a.c */
public final class VideoChatShareSelectListAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    public OnVideoChatShareSelectedItemClickListener f158564a;

    /* renamed from: b */
    private final int f158565b;

    /* renamed from: c */
    private final Context f158566c;

    /* renamed from: d */
    private ArrayList<VideoChatShareItem> f158567d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\u0014\u001a\n \u0007*\u0004\u0018\u00010\u00150\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0018\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/selected/VideoChatShareSelectListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "acceptStatus", "Landroidx/appcompat/widget/AppCompatImageView;", "kotlin.jvm.PlatformType", "getAcceptStatus", "()Landroidx/appcompat/widget/AppCompatImageView;", "avatar", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView;", "getAvatar", "()Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView;", "close", "Lcom/ss/android/vc/common/widget/IconFontView;", "getClose", "()Lcom/ss/android/vc/common/widget/IconFontView;", "groupAvatar", "getGroupAvatar", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", UpdateKey.STATUS, "getStatus", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.a.c$a */
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final IconFontView f158568a;

        /* renamed from: b */
        private final LKUIRoundedImageView f158569b;

        /* renamed from: c */
        private final TextView f158570c;

        /* renamed from: d */
        private final AppCompatImageView f158571d;

        /* renamed from: e */
        private final AppCompatImageView f158572e;

        /* renamed from: f */
        private final IconFontView f158573f;

        /* renamed from: a */
        public final IconFontView mo217565a() {
            return this.f158568a;
        }

        /* renamed from: b */
        public final LKUIRoundedImageView mo217566b() {
            return this.f158569b;
        }

        /* renamed from: c */
        public final TextView mo217567c() {
            return this.f158570c;
        }

        /* renamed from: d */
        public final AppCompatImageView mo217568d() {
            return this.f158571d;
        }

        /* renamed from: e */
        public final AppCompatImageView mo217569e() {
            return this.f158572e;
        }

        /* renamed from: f */
        public final IconFontView mo217570f() {
            return this.f158573f;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f158568a = (IconFontView) view.findViewById(R.id.image_close);
            this.f158569b = (LKUIRoundedImageView) view.findViewById(R.id.avatar);
            this.f158570c = (TextView) view.findViewById(R.id.name);
            this.f158571d = (AppCompatImageView) view.findViewById(R.id.status);
            this.f158572e = (AppCompatImageView) view.findViewById(R.id.selected_calendar_accept_state);
            this.f158573f = (IconFontView) view.findViewById(R.id.calendar_group_view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f158567d.size();
    }

    /* renamed from: a */
    public final OnVideoChatShareSelectedItemClickListener mo217560a() {
        OnVideoChatShareSelectedItemClickListener bVar = this.f158564a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mListener");
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo217562a(OnVideoChatShareSelectedItemClickListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f158564a = bVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.a.c$b */
    public static final class View$OnClickListenerC62946b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareSelectListAdapter f158574a;

        /* renamed from: b */
        final /* synthetic */ Ref.ObjectRef f158575b;

        /* renamed from: c */
        final /* synthetic */ int f158576c;

        View$OnClickListenerC62946b(VideoChatShareSelectListAdapter cVar, Ref.ObjectRef objectRef, int i) {
            this.f158574a = cVar;
            this.f158575b = objectRef;
            this.f158576c = i;
        }

        public final void onClick(View view) {
            this.f158574a.mo217560a().mo217559a(this.f158575b.element, this.f158576c);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "iconKey", "", "kotlin.jvm.PlatformType", "onStatus"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.a.c$c */
    public static final class C62947c implements AbstractC60882ag.AbstractC60883a {

        /* renamed from: a */
        final /* synthetic */ ViewHolder f158577a;

        C62947c(ViewHolder aVar) {
            this.f158577a = aVar;
        }

        @Override // com.ss.android.vc.dependency.AbstractC60882ag.AbstractC60883a
        public final void onStatus(String str) {
            boolean z;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C52977a.m205190a().mo180995a(this.f158577a.mo217568d(), str);
                return;
            }
            AppCompatImageView d = this.f158577a.mo217568d();
            Intrinsics.checkExpressionValueIsNotNull(d, "holder.status");
            d.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo217564a(ArrayList<VideoChatShareItem> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f158567d = arrayList;
        notifyDataSetChanged();
    }

    public VideoChatShareSelectListAdapter(Context context, ArrayList<VideoChatShareItem> arrayList) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(arrayList, "datas");
        this.f158566c = context;
        this.f158567d = arrayList;
        this.f158565b = DeviceUtils.getDpFromDimenXml(context, R.dimen.avatar_width_resize);
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.videochat_share_selected_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "v");
        return new ViewHolder(inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        VideoChatShareItem videoChatShareItem = this.f158567d.get(i);
        Intrinsics.checkExpressionValueIsNotNull(videoChatShareItem, "datas.get(position)");
        objectRef.element = (T) videoChatShareItem;
        aVar.mo217565a().setOnClickListener(new View$OnClickListenerC62946b(this, objectRef, i));
        if (objectRef.element.getType() != ShareItemType.CALENDAR_GROUP) {
            LKUIRoundedImageView b = aVar.mo217566b();
            Intrinsics.checkExpressionValueIsNotNull(b, "holder.avatar");
            b.setVisibility(0);
            IconFontView f = aVar.mo217570f();
            Intrinsics.checkExpressionValueIsNotNull(f, "holder.groupAvatar");
            f.setVisibility(8);
            String imageKey = objectRef.element.getImageKey();
            String id = objectRef.element.getId();
            ParticipantType participantType = ParticipantType.LARK_USER;
            LKUIRoundedImageView b2 = aVar.mo217566b();
            int i2 = this.f158565b;
            C60783v.m236230a(imageKey, id, participantType, b2, i2, i2);
            TextView c = aVar.mo217567c();
            Intrinsics.checkExpressionValueIsNotNull(c, "holder.name");
            ViewGroup.LayoutParams layoutParams = c.getLayoutParams();
            if (layoutParams != null) {
                ((ConstraintLayout.LayoutParams) layoutParams).f2813e = R.id.avatar;
                AbstractC60882ag g = VideoChatModuleDependency.m236634g();
                Intrinsics.checkExpressionValueIsNotNull(g, "VideoChatModuleDependency.getProfileDependency()");
                if (g.mo196512b()) {
                    AppCompatImageView d = aVar.mo217568d();
                    Intrinsics.checkExpressionValueIsNotNull(d, "holder.status");
                    d.setVisibility(0);
                    VideoChatModuleDependency.m236634g().mo196511a(objectRef.element.getCustomStatuses(), new C62947c(aVar));
                } else {
                    AppCompatImageView d2 = aVar.mo217568d();
                    Intrinsics.checkExpressionValueIsNotNull(d2, "holder.status");
                    d2.setVisibility(8);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        } else {
            LKUIRoundedImageView b3 = aVar.mo217566b();
            Intrinsics.checkExpressionValueIsNotNull(b3, "holder.avatar");
            b3.setVisibility(8);
            IconFontView f2 = aVar.mo217570f();
            Intrinsics.checkExpressionValueIsNotNull(f2, "holder.groupAvatar");
            f2.setVisibility(0);
            TextView c2 = aVar.mo217567c();
            Intrinsics.checkExpressionValueIsNotNull(c2, "holder.name");
            ViewGroup.LayoutParams layoutParams2 = c2.getLayoutParams();
            if (layoutParams2 != null) {
                ((ConstraintLayout.LayoutParams) layoutParams2).f2813e = R.id.calendar_group_view;
                AppCompatImageView d3 = aVar.mo217568d();
                Intrinsics.checkExpressionValueIsNotNull(d3, "holder.status");
                d3.setVisibility(8);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        TextView c3 = aVar.mo217567c();
        Intrinsics.checkExpressionValueIsNotNull(c3, "holder.name");
        c3.setText(objectRef.element.getName());
        CalendarInfo.CalendarAcceptStatus acceptStatus = objectRef.element.getAcceptStatus();
        if (acceptStatus != null) {
            int i3 = C62948d.f158578a[acceptStatus.ordinal()];
            if (i3 == 1) {
                aVar.mo217569e().setImageResource(R.drawable.calendar_accept_state_accept);
            } else if (i3 == 2) {
                aVar.mo217569e().setImageResource(R.drawable.ud_icon_delete_colorful);
            } else if (i3 == 3) {
                aVar.mo217569e().setImageResource(R.drawable.ud_icon_file_round_unknow_colorful);
            }
        }
    }
}
