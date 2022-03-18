package com.ss.android.lark.chatwindow.view.preview;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.chat.base.view.vo.message.preview.NormalUrlPreviewVO;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1633b.C33360a;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.message.MessageUrlPreview;
import com.ss.android.lark.chat.entity.message.PreviewVideo;
import com.ss.android.lark.chat.utils.C34336c;
import com.ss.android.lark.chat.video.VideoPreviewActivity;
import com.ss.android.lark.chatwindow.view.preview.IPreviewBinder;
import com.ss.android.lark.dependency.AbstractC36473g;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.IBrowserDependency;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.StandAloneParam;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.DiskCacheStrategy;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.statistics.video_site.VideoSiteHitPoint;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002*+B'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001c\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J@\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020!2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0002J\u0012\u0010)\u001a\u00020!2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00130\u0013X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/ss/android/lark/chatwindow/view/preview/NormalPreviewBinder;", "Lcom/ss/android/lark/chatwindow/view/preview/IPreviewBinder;", "Lcom/ss/android/lark/chatwindow/view/preview/NormalPreviewBinder$NormalUrlPreviewViewHolder;", "Lcom/ss/android/lark/chat/base/view/vo/message/preview/NormalUrlPreviewVO;", "context", "Landroid/content/Context;", "onLongClickListener", "Landroid/view/View$OnLongClickListener;", "dataProvider", "Lcom/ss/android/lark/chatwindow/view/preview/NormalPreviewBinder$IDataProvider;", "extraProvider", "Lcom/ss/android/lark/chatwindow/view/preview/IFontExtraProvider;", "(Landroid/content/Context;Landroid/view/View$OnLongClickListener;Lcom/ss/android/lark/chatwindow/view/preview/NormalPreviewBinder$IDataProvider;Lcom/ss/android/lark/chatwindow/view/preview/IFontExtraProvider;)V", "getDataProvider", "()Lcom/ss/android/lark/chatwindow/view/preview/NormalPreviewBinder$IDataProvider;", "mAuditDependency", "Lcom/ss/android/lark/dependency/IAuditDependency;", "kotlin.jvm.PlatformType", "mBrowserModule", "Lcom/ss/android/lark/dependency/IBrowserDependency;", "bindPreviewView", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "provider", "createPreviewView", "parent", "Landroid/view/ViewGroup;", "getPreviewType", "", "sendVideoPreviewClick", "urlPreview", "Lcom/ss/android/lark/chat/entity/message/MessageUrlPreview;", "finalShowVideoPreview", "", "setupVideoPreview", "holder", "showVideoPreview", "coverImage", "Lcom/ss/android/lark/chat/entity/image/ImageSet;", "finalPreViewUrl", "", "showPreview", "IDataProvider", "NormalUrlPreviewViewHolder", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatwindow.view.b.f */
public final class NormalPreviewBinder implements IPreviewBinder<NormalUrlPreviewViewHolder, NormalUrlPreviewVO> {

    /* renamed from: a */
    public final IBrowserDependency f91081a;

    /* renamed from: b */
    public final AbstractC36473g f91082b;

    /* renamed from: c */
    public final Context f91083c;

    /* renamed from: d */
    private final View.OnLongClickListener f91084d;

    /* renamed from: e */
    private final IDataProvider f91085e;

    /* renamed from: f */
    private final IFontExtraProvider f91086f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chatwindow/view/preview/NormalPreviewBinder$IDataProvider;", "", "isGroup", "", "isSelf", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.b.f$a */
    public interface IDataProvider {
        /* renamed from: a */
        boolean mo129758a();

        /* renamed from: b */
        boolean mo129759b();
    }

    @Override // com.ss.android.lark.chatwindow.view.preview.IPreviewBinder
    /* renamed from: a */
    public int mo129762a() {
        return 1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000eR\u0011\u0010\u001b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/chatwindow/view/preview/NormalPreviewBinder$NormalUrlPreviewViewHolder;", "Lcom/ss/android/lark/chatwindow/view/preview/IPreviewBinder$PreviewViewHolder;", "itemView", "Landroid/view/ViewGroup;", "extraProvider", "Lcom/ss/android/lark/chatwindow/view/preview/IFontExtraProvider;", "(Landroid/view/ViewGroup;Lcom/ss/android/lark/chatwindow/view/preview/IFontExtraProvider;)V", "mPlayIcon", "Landroid/widget/ImageView;", "getMPlayIcon", "()Landroid/widget/ImageView;", "mUrlDescriptionTv", "Landroid/widget/TextView;", "getMUrlDescriptionTv", "()Landroid/widget/TextView;", "mUrlIconIv", "getMUrlIconIv", "mUrlPreviewDivider", "Landroid/view/View;", "getMUrlPreviewDivider", "()Landroid/view/View;", "mUrlPreviewLayout", "Landroid/widget/LinearLayout;", "getMUrlPreviewLayout", "()Landroid/widget/LinearLayout;", "mUrlTitleTv", "getMUrlTitleTv", "mVideoPreview", "getMVideoPreview", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.b.f$b */
    public static final class NormalUrlPreviewViewHolder extends IPreviewBinder.PreviewViewHolder {

        /* renamed from: a */
        private final LinearLayout f91087a;

        /* renamed from: b */
        private final View f91088b;

        /* renamed from: c */
        private final TextView f91089c;

        /* renamed from: d */
        private final TextView f91090d;

        /* renamed from: e */
        private final ImageView f91091e;

        /* renamed from: f */
        private final ImageView f91092f;

        /* renamed from: g */
        private final ImageView f91093g;

        /* renamed from: a */
        public final LinearLayout mo129789a() {
            return this.f91087a;
        }

        /* renamed from: c */
        public final View mo129790c() {
            return this.f91088b;
        }

        /* renamed from: d */
        public final TextView mo129791d() {
            return this.f91089c;
        }

        /* renamed from: e */
        public final TextView mo129792e() {
            return this.f91090d;
        }

        /* renamed from: f */
        public final ImageView mo129793f() {
            return this.f91091e;
        }

        /* renamed from: g */
        public final ImageView mo129794g() {
            return this.f91092f;
        }

        /* renamed from: h */
        public final ImageView mo129795h() {
            return this.f91093g;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NormalUrlPreviewViewHolder(ViewGroup viewGroup, IFontExtraProvider bVar) {
            super(viewGroup);
            Intrinsics.checkParameterIsNotNull(viewGroup, "itemView");
            Intrinsics.checkParameterIsNotNull(bVar, "extraProvider");
            View findViewById = viewGroup.findViewById(R.id.url_preview_layout);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.url_preview_layout)");
            this.f91087a = (LinearLayout) findViewById;
            View findViewById2 = viewGroup.findViewById(R.id.divider_preview);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.divider_preview)");
            this.f91088b = findViewById2;
            View findViewById3 = viewGroup.findViewById(R.id.url_title);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.url_title)");
            TextView textView = (TextView) findViewById3;
            this.f91089c = textView;
            View findViewById4 = viewGroup.findViewById(R.id.url_description);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "itemView.findViewById(R.id.url_description)");
            TextView textView2 = (TextView) findViewById4;
            this.f91090d = textView2;
            View findViewById5 = viewGroup.findViewById(R.id.url_icon);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "itemView.findViewById(R.id.url_icon)");
            ImageView imageView = (ImageView) findViewById5;
            this.f91091e = imageView;
            View findViewById6 = viewGroup.findViewById(R.id.video_preview);
            Intrinsics.checkExpressionValueIsNotNull(findViewById6, "itemView.findViewById(R.id.video_preview)");
            this.f91092f = (ImageView) findViewById6;
            View findViewById7 = viewGroup.findViewById(R.id.play_video);
            Intrinsics.checkExpressionValueIsNotNull(findViewById7, "itemView.findViewById(R.id.play_video)");
            this.f91093g = (ImageView) findViewById7;
            if (!DesktopUtil.m144307b()) {
                C25649b.m91853a(imageView, bVar.mo129749a());
                C25649b.m91857a(textView, bVar.mo129750b());
                C25649b.m91857a(textView2, bVar.mo129751c());
            }
        }
    }

    /* renamed from: b */
    public final IDataProvider mo129788b() {
        return this.f91085e;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "onClick", "com/ss/android/lark/chatwindow/view/preview/NormalPreviewBinder$bindPreviewView$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.b.f$c */
    public static final class View$OnClickListenerC35262c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MessageUrlPreview f91094a;

        /* renamed from: b */
        final /* synthetic */ boolean f91095b;

        /* renamed from: c */
        final /* synthetic */ String f91096c;

        /* renamed from: d */
        final /* synthetic */ NormalPreviewBinder f91097d;

        /* renamed from: e */
        final /* synthetic */ NormalUrlPreviewViewHolder f91098e;

        View$OnClickListenerC35262c(MessageUrlPreview messageUrlPreview, boolean z, String str, NormalPreviewBinder fVar, NormalUrlPreviewViewHolder bVar) {
            this.f91094a = messageUrlPreview;
            this.f91095b = z;
            this.f91096c = str;
            this.f91097d = fVar;
            this.f91098e = bVar;
        }

        public final void onClick(View view) {
            this.f91097d.mo129786a(this.f91094a, this.f91095b);
            if (!TextUtils.isEmpty(this.f91096c)) {
                this.f91097d.f91082b.mo134496a(this.f91096c);
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                b.mo134577e().mo120952a();
                this.f91097d.f91081a.mo134333b(this.f91097d.f91083c, this.f91096c, this.f91097d.mo129788b().mo129758a() ? 1 : 0);
            }
        }
    }

    /* renamed from: a */
    public boolean mo129787a(NormalUrlPreviewVO dVar) {
        MessageUrlPreview messageUrlPreview;
        if (dVar != null) {
            messageUrlPreview = dVar.mo121800a();
        } else {
            messageUrlPreview = null;
        }
        if (messageUrlPreview != null) {
            return true;
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatwindow/view/preview/NormalPreviewBinder$setupVideoPreview$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.b.f$d */
    public static final class C35263d extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ NormalPreviewBinder f91099a;

        /* renamed from: b */
        final /* synthetic */ String f91100b;

        /* renamed from: c */
        final /* synthetic */ PreviewVideo f91101c;

        /* renamed from: d */
        final /* synthetic */ ImageSet f91102d;

        /* renamed from: e */
        final /* synthetic */ NormalUrlPreviewViewHolder f91103e;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            Intent intent = new Intent(this.f91099a.f91083c, VideoPreviewActivity.class);
            intent.putExtra("preview_origin_url", this.f91100b);
            if (this.f91101c != null) {
                VideoSiteHitPoint.f135914a.mo187769a(this.f91101c.getSite());
                intent.putExtra("preview_i_frame_url", this.f91101c.getIFrameUrl());
                intent.putExtra("preview_vid", this.f91101c.getVid());
            }
            intent.putExtra("preview_cover", this.f91102d.getOrigin());
            if (DesktopUtil.m144301a(this.f91099a.f91083c)) {
                intent.setFlags(402653184);
                if (this.f91099a.f91083c instanceof Activity) {
                    C36512a.m144041a().mo134756a((Activity) this.f91099a.f91083c, new StandAloneParam.C36572a(intent, DesktopConstants.UIType.WINDOW_CENTER_D3).mo134967a());
                }
            } else if (this.f91099a.f91083c instanceof Activity) {
                this.f91099a.f91083c.startActivity(intent, ActivityOptions.makeSceneTransitionAnimation((Activity) this.f91099a.f91083c, this.f91103e.mo129794g(), "show_video_share_element").toBundle());
            } else {
                this.f91099a.f91083c.startActivity(intent);
            }
        }

        C35263d(NormalPreviewBinder fVar, String str, PreviewVideo previewVideo, ImageSet imageSet, NormalUrlPreviewViewHolder bVar) {
            this.f91099a = fVar;
            this.f91100b = str;
            this.f91101c = previewVideo;
            this.f91102d = imageSet;
            this.f91103e = bVar;
        }
    }

    /* renamed from: a */
    public NormalUrlPreviewViewHolder mo129764a(NormalUrlPreviewVO dVar, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (!mo129787a(dVar)) {
            return null;
        }
        return new NormalUrlPreviewViewHolder(viewGroup, this.f91086f);
    }

    /* renamed from: a */
    public final void mo129786a(MessageUrlPreview messageUrlPreview, boolean z) {
        PreviewVideo previewVideo;
        if (z && (previewVideo = messageUrlPreview.getPreviewVideo()) != null) {
            VideoSiteHitPoint.f135914a.mo187770b(previewVideo.getSite());
        }
    }

    /* renamed from: a */
    public void mo129765a(NormalUrlPreviewVO dVar, NormalUrlPreviewViewHolder bVar) {
        MessageUrlPreview a;
        int i;
        int i2;
        LinearLayout a2;
        TextView e;
        TextView e2;
        int i3;
        TextView e3;
        TextView d;
        int i4;
        TextView d2;
        if (mo129787a(dVar) && dVar != null && (a = dVar.mo121800a()) != null) {
            ImageView imageView = null;
            String str = null;
            ImageSet icon = a.getIcon();
            Intrinsics.checkExpressionValueIsNotNull(icon, "icon");
            Image origin = icon.getOrigin();
            Intrinsics.checkExpressionValueIsNotNull(origin, "imageSet.origin");
            if (CollectionUtils.isNotEmpty(origin.getUrls())) {
                Image origin2 = icon.getOrigin();
                Intrinsics.checkExpressionValueIsNotNull(origin2, "imageSet.origin");
                str = origin2.getUrls().get(0);
                i = R.drawable.url_preview_icon;
            } else {
                i = 0;
            }
            String title = a.getTitle();
            String description = a.getDescription();
            Context context = this.f91083c;
            if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                IRequestCreator error = ImageLoader.with(this.f91083c).load(str).error(i);
                if (bVar != null) {
                    imageView = bVar.mo129793f();
                }
                error.into(imageView);
            }
            if (!(bVar == null || (d2 = bVar.mo129791d()) == null)) {
                d2.setText(title);
            }
            int i5 = 8;
            if (!(bVar == null || (d = bVar.mo129791d()) == null)) {
                if (!TextUtils.isEmpty(title)) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                d.setVisibility(i4);
            }
            if (!(bVar == null || (e3 = bVar.mo129792e()) == null)) {
                e3.setText(description);
            }
            if (!(bVar == null || (e2 = bVar.mo129792e()) == null)) {
                if (!TextUtils.isEmpty(description)) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                e2.setVisibility(i3);
            }
            if (!(bVar == null || (e = bVar.mo129792e()) == null)) {
                e.setTextColor(C33360a.m129174r(this.f91085e.mo129759b()));
            }
            ImageSet coverImage = a.getCoverImage();
            Intrinsics.checkExpressionValueIsNotNull(coverImage, "coverImage");
            String url = a.getUrl();
            Intrinsics.checkExpressionValueIsNotNull(url, "url");
            boolean a3 = m137734a(bVar, this.f91084d, a, false, coverImage, url);
            if (!(bVar == null || (a2 = bVar.mo129789a()) == null)) {
                a2.setOnClickListener(new View$OnClickListenerC35262c(a, a3, url, this, bVar));
            }
            if (bVar != null) {
                LinearLayout a4 = bVar.mo129789a();
                a4.setVisibility(0);
                ImageView g = bVar.mo129794g();
                if (a3) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                g.setVisibility(i2);
                ImageView h = bVar.mo129795h();
                if (a3) {
                    i5 = 0;
                }
                h.setVisibility(i5);
                bVar.mo129790c().setBackgroundColor(C33360a.m129165i(this.f91085e.mo129759b()));
                a4.setPadding(0, UIHelper.dp2px(7.5f), 0, 0);
            }
        }
    }

    public NormalPreviewBinder(Context context, View.OnLongClickListener onLongClickListener, IDataProvider aVar, IFontExtraProvider bVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "dataProvider");
        Intrinsics.checkParameterIsNotNull(bVar, "extraProvider");
        this.f91083c = context;
        this.f91084d = onLongClickListener;
        this.f91085e = aVar;
        this.f91086f = bVar;
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        this.f91081a = b.mo134593u();
        AbstractC36474h b2 = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
        this.f91082b = b2.mo134594v();
    }

    /* renamed from: a */
    private final boolean m137734a(NormalUrlPreviewViewHolder bVar, View.OnLongClickListener onLongClickListener, MessageUrlPreview messageUrlPreview, boolean z, ImageSet imageSet, String str) {
        ImageView imageView;
        ImageView g;
        ImageView g2;
        if (imageSet != null) {
            Image origin = imageSet.getOrigin();
            Intrinsics.checkExpressionValueIsNotNull(origin, "coverImage.origin");
            if (CollectionUtils.isNotEmpty(origin.getUrls())) {
                Drawable drawable = UIHelper.getDrawable(R.drawable.common_chat_window_image_item_holder);
                LoadParams a = new LoadParams().mo105414a(drawable).mo105423b(drawable).mo105415a(ImageView.ScaleType.FIT_CENTER).mo105417a(DiskCacheStrategy.ALL).mo105416a(new ListenerParams.Builder().mo105396a(Biz.Messenger).mo105397a(Scene.Chat).mo105398a(ListenerParams.FromType.URL_PREVIEW).mo105402a());
                Context context = this.f91083c;
                if (bVar != null) {
                    imageView = bVar.mo129794g();
                } else {
                    imageView = null;
                }
                C34336c.m133127a(context, imageView, imageSet.getOrigin(), a);
                PreviewVideo previewVideo = messageUrlPreview.getPreviewVideo();
                if (!(bVar == null || (g2 = bVar.mo129794g()) == null)) {
                    g2.setOnLongClickListener(onLongClickListener);
                }
                if (bVar == null || (g = bVar.mo129794g()) == null) {
                    return true;
                }
                g.setOnClickListener(new C35263d(this, str, previewVideo, imageSet, bVar));
                return true;
            }
        }
        return z;
    }
}
