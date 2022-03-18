package com.ss.android.lark.chatwindow.view.preview;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.message.preview.NewUrlPreviewVO;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1633b.C33360a;
import com.ss.android.lark.chat.entity.preview.LocalUrlPreviewEntity;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.chat.entity.preview.Url;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.chatwindow.view.preview.IPreviewBinder;
import com.ss.android.lark.dependency.AbstractC36473g;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.IBrowserDependency;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001f B'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001c\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00130\u0013X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/chatwindow/view/preview/LocalPreviewBinder;", "Lcom/ss/android/lark/chatwindow/view/preview/IPreviewBinder;", "Lcom/ss/android/lark/chatwindow/view/preview/LocalPreviewBinder$LocalUrlPreviewViewHolder;", "Lcom/ss/android/lark/chat/base/view/vo/message/preview/NewUrlPreviewVO;", "context", "Landroid/content/Context;", "onLongClickListener", "Landroid/view/View$OnLongClickListener;", "dataProvider", "Lcom/ss/android/lark/chatwindow/view/preview/LocalPreviewBinder$IDataProvider;", "extraProvider", "Lcom/ss/android/lark/chatwindow/view/preview/IFontExtraProvider;", "(Landroid/content/Context;Landroid/view/View$OnLongClickListener;Lcom/ss/android/lark/chatwindow/view/preview/LocalPreviewBinder$IDataProvider;Lcom/ss/android/lark/chatwindow/view/preview/IFontExtraProvider;)V", "getDataProvider", "()Lcom/ss/android/lark/chatwindow/view/preview/LocalPreviewBinder$IDataProvider;", "mAuditDependency", "Lcom/ss/android/lark/dependency/IAuditDependency;", "kotlin.jvm.PlatformType", "mBrowserModule", "Lcom/ss/android/lark/dependency/IBrowserDependency;", "bindPreviewView", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "provider", "createPreviewView", "parent", "Landroid/view/ViewGroup;", "getPreviewType", "", "showPreview", "", "IDataProvider", "LocalUrlPreviewViewHolder", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatwindow.view.b.d */
public final class LocalPreviewBinder implements IPreviewBinder<LocalUrlPreviewViewHolder, NewUrlPreviewVO> {

    /* renamed from: a */
    public final IBrowserDependency f91062a;

    /* renamed from: b */
    public final AbstractC36473g f91063b;

    /* renamed from: c */
    public final Context f91064c;

    /* renamed from: d */
    private final View.OnLongClickListener f91065d;

    /* renamed from: e */
    private final IDataProvider f91066e;

    /* renamed from: f */
    private final IFontExtraProvider f91067f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chatwindow/view/preview/LocalPreviewBinder$IDataProvider;", "", "isGroup", "", "isSelf", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.b.d$a */
    public interface IDataProvider {
        /* renamed from: a */
        boolean mo129747a();

        /* renamed from: b */
        boolean mo129748b();
    }

    @Override // com.ss.android.lark.chatwindow.view.preview.IPreviewBinder
    /* renamed from: a */
    public int mo129762a() {
        return 3;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/chatwindow/view/preview/LocalPreviewBinder$LocalUrlPreviewViewHolder;", "Lcom/ss/android/lark/chatwindow/view/preview/IPreviewBinder$PreviewViewHolder;", "itemView", "Landroid/view/ViewGroup;", "extraProvider", "Lcom/ss/android/lark/chatwindow/view/preview/IFontExtraProvider;", "(Landroid/view/ViewGroup;Lcom/ss/android/lark/chatwindow/view/preview/IFontExtraProvider;)V", "mUrlDescriptionTv", "Landroid/widget/TextView;", "getMUrlDescriptionTv", "()Landroid/widget/TextView;", "mUrlIconIv", "Landroid/widget/ImageView;", "getMUrlIconIv", "()Landroid/widget/ImageView;", "mUrlPreviewDivider", "Landroid/view/View;", "getMUrlPreviewDivider", "()Landroid/view/View;", "mUrlPreviewLayout", "Landroid/widget/LinearLayout;", "getMUrlPreviewLayout", "()Landroid/widget/LinearLayout;", "mUrlTitleTv", "getMUrlTitleTv", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.b.d$b */
    public static final class LocalUrlPreviewViewHolder extends IPreviewBinder.PreviewViewHolder {

        /* renamed from: a */
        private final LinearLayout f91068a;

        /* renamed from: b */
        private final View f91069b;

        /* renamed from: c */
        private final TextView f91070c;

        /* renamed from: d */
        private final TextView f91071d;

        /* renamed from: e */
        private final ImageView f91072e;

        /* renamed from: a */
        public final LinearLayout mo129775a() {
            return this.f91068a;
        }

        /* renamed from: c */
        public final View mo129776c() {
            return this.f91069b;
        }

        /* renamed from: d */
        public final TextView mo129777d() {
            return this.f91070c;
        }

        /* renamed from: e */
        public final TextView mo129778e() {
            return this.f91071d;
        }

        /* renamed from: f */
        public final ImageView mo129779f() {
            return this.f91072e;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LocalUrlPreviewViewHolder(ViewGroup viewGroup, IFontExtraProvider bVar) {
            super(viewGroup);
            Intrinsics.checkParameterIsNotNull(viewGroup, "itemView");
            Intrinsics.checkParameterIsNotNull(bVar, "extraProvider");
            View findViewById = viewGroup.findViewById(R.id.url_preview_layout);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.url_preview_layout)");
            this.f91068a = (LinearLayout) findViewById;
            View findViewById2 = viewGroup.findViewById(R.id.divider_preview);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.divider_preview)");
            this.f91069b = findViewById2;
            View findViewById3 = viewGroup.findViewById(R.id.url_title);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.url_title)");
            TextView textView = (TextView) findViewById3;
            this.f91070c = textView;
            View findViewById4 = viewGroup.findViewById(R.id.url_description);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "itemView.findViewById(R.id.url_description)");
            TextView textView2 = (TextView) findViewById4;
            this.f91071d = textView2;
            View findViewById5 = viewGroup.findViewById(R.id.url_icon);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "itemView.findViewById(R.id.url_icon)");
            ImageView imageView = (ImageView) findViewById5;
            this.f91072e = imageView;
            if (!DesktopUtil.m144307b()) {
                C25649b.m91853a(imageView, bVar.mo129749a());
                C25649b.m91857a(textView, bVar.mo129750b());
                C25649b.m91857a(textView2, bVar.mo129751c());
            }
        }
    }

    /* renamed from: b */
    public final IDataProvider mo129774b() {
        return this.f91066e;
    }

    /* renamed from: a */
    public boolean mo129773a(NewUrlPreviewVO cVar) {
        PreviewHangPoint previewHangPoint;
        if (cVar != null) {
            previewHangPoint = cVar.mo121797a();
        } else {
            previewHangPoint = null;
        }
        if (previewHangPoint == null || !(cVar.mo121797a().getUrlPreviewEntity() instanceof LocalUrlPreviewEntity)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "onClick", "com/ss/android/lark/chatwindow/view/preview/LocalPreviewBinder$bindPreviewView$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.b.d$c */
    public static final class View$OnClickListenerC35261c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UrlPreviewEntity f91073a;

        /* renamed from: b */
        final /* synthetic */ LocalPreviewBinder f91074b;

        /* renamed from: c */
        final /* synthetic */ LocalUrlPreviewViewHolder f91075c;

        View$OnClickListenerC35261c(UrlPreviewEntity urlPreviewEntity, LocalPreviewBinder dVar, LocalUrlPreviewViewHolder bVar) {
            this.f91073a = urlPreviewEntity;
            this.f91074b = dVar;
            this.f91075c = bVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            Url url = this.f91073a.getUrl();
            String str3 = null;
            if (url != null) {
                str = url.getAndroidUrl();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                AbstractC36473g gVar = this.f91074b.f91063b;
                Url url2 = this.f91073a.getUrl();
                if (url2 != null) {
                    str2 = url2.getAndroidUrl();
                } else {
                    str2 = null;
                }
                gVar.mo134496a(str2);
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                b.mo134577e().mo120952a();
                IBrowserDependency iBrowserDependency = this.f91074b.f91062a;
                Context context = this.f91074b.f91064c;
                Url url3 = this.f91073a.getUrl();
                if (url3 != null) {
                    str3 = url3.getAndroidUrl();
                }
                iBrowserDependency.mo134333b(context, str3, this.f91074b.mo129774b().mo129747a() ? 1 : 0);
            }
        }
    }

    /* renamed from: a */
    public LocalUrlPreviewViewHolder mo129764a(NewUrlPreviewVO cVar, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (!mo129773a(cVar)) {
            return null;
        }
        return new LocalUrlPreviewViewHolder(viewGroup, this.f91067f);
    }

    /* renamed from: a */
    public void mo129765a(NewUrlPreviewVO cVar, LocalUrlPreviewViewHolder bVar) {
        PreviewHangPoint a;
        UrlPreviewEntity urlPreviewEntity;
        LinearLayout a2;
        TextView e;
        TextView e2;
        TextView e3;
        TextView d;
        int i;
        TextView d2;
        ImageView imageView;
        if (mo129773a(cVar) && cVar != null && (a = cVar.mo121797a()) != null && (urlPreviewEntity = a.getUrlPreviewEntity()) != null) {
            if (urlPreviewEntity != null) {
                LocalUrlPreviewEntity localUrlPreviewEntity = (LocalUrlPreviewEntity) urlPreviewEntity;
                String localIconUrl = localUrlPreviewEntity.getLocalIconUrl();
                Context context = this.f91064c;
                if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                    IRequestCreator load = ImageLoader.with(this.f91064c).load(localIconUrl);
                    if (bVar != null) {
                        imageView = bVar.mo129779f();
                    } else {
                        imageView = null;
                    }
                    load.into(imageView);
                }
                if (!(bVar == null || (d2 = bVar.mo129777d()) == null)) {
                    d2.setText(localUrlPreviewEntity.getLocalTitle());
                }
                int i2 = 8;
                if (!(bVar == null || (d = bVar.mo129777d()) == null)) {
                    if (!TextUtils.isEmpty(localUrlPreviewEntity.getLocalTitle())) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    d.setVisibility(i);
                }
                if (!(bVar == null || (e3 = bVar.mo129778e()) == null)) {
                    e3.setText(localUrlPreviewEntity.getLocalDescription());
                }
                if (!(bVar == null || (e2 = bVar.mo129778e()) == null)) {
                    if (!TextUtils.isEmpty(localUrlPreviewEntity.getLocalDescription())) {
                        i2 = 0;
                    }
                    e2.setVisibility(i2);
                }
                if (!(bVar == null || (e = bVar.mo129778e()) == null)) {
                    e.setTextColor(C33360a.m129174r(this.f91066e.mo129748b()));
                }
                if (!(bVar == null || (a2 = bVar.mo129775a()) == null)) {
                    a2.setOnClickListener(new View$OnClickListenerC35261c(urlPreviewEntity, this, bVar));
                }
                if (bVar != null) {
                    LinearLayout a3 = bVar.mo129775a();
                    a3.setVisibility(0);
                    bVar.mo129776c().setBackgroundColor(C33360a.m129165i(this.f91066e.mo129748b()));
                    a3.setPadding(0, UIHelper.dp2px(7.5f), 0, 0);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.LocalUrlPreviewEntity");
        }
    }

    public LocalPreviewBinder(Context context, View.OnLongClickListener onLongClickListener, IDataProvider aVar, IFontExtraProvider bVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "dataProvider");
        Intrinsics.checkParameterIsNotNull(bVar, "extraProvider");
        this.f91064c = context;
        this.f91065d = onLongClickListener;
        this.f91066e = aVar;
        this.f91067f = bVar;
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        this.f91062a = b.mo134593u();
        AbstractC36474h b2 = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
        this.f91063b = b2.mo134594v();
    }
}
