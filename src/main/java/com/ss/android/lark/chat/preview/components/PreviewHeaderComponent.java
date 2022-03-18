package com.ss.android.lark.chat.preview.components;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.component.ui.tag.TextTag;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.preview.ColorUtils;
import com.ss.android.lark.chat.entity.preview.FontLevel;
import com.ss.android.lark.chat.entity.preview.FontType;
import com.ss.android.lark.chat.entity.preview.Style;
import com.ss.android.lark.chat.entity.preview.ThemeColor;
import com.ss.android.lark.chat.preview.components.utils.FontUtils;
import com.ss.android.lark.chat.preview.components.view.CenterSpaceRemoteImageSpan;
import com.ss.android.lark.chat.preview.components.view.PreviewHeaderView;
import com.ss.android.lark.chat.preview.components.view.TailDrawableTextView;
import com.ss.android.lark.chat.preview.entity.component.ImageSet;
import com.ss.android.lark.chat.preview.entity.component.Tag;
import com.ss.android.lark.chat.preview.entity.component.Theme;
import com.ss.android.lark.chat.preview.entity.component.property.PreviewHeaderProperty;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.C38818i;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.tangram.base.action.Action;
import com.ss.android.lark.tangram.base.component.RenderComponent;
import com.ss.android.lark.tangram.base.dependency.Dependency;
import com.ss.android.lark.tangram.base.node.IVirtualNode;
import com.ss.android.lark.tangram.base.style.TCStyle;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.C58513g;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 H2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001HB9\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\u0010\rJ\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020%H\u0002J\u0018\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0011H\u0002J\u0018\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0011H\u0002J\u0010\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u00020%H\u0002J\u0010\u00100\u001a\u00020#2\u0006\u00101\u001a\u000202H\u0002J\u0018\u00103\u001a\u00020\u00192\u0006\u00104\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J \u00105\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u0019H\u0002J\u0012\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020>H\u0002J\b\u0010?\u001a\u00020\u000fH\u0002J\u0012\u0010@\u001a\u0004\u0018\u00010>2\u0006\u00108\u001a\u00020\u0019H\u0002J\n\u0010A\u001a\u0004\u0018\u00010>H\u0002J\u0010\u0010B\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020DH\u0003J\u0010\u0010E\u001a\u00020\u00172\u0006\u0010;\u001a\u00020\u0017H\u0016J\u0010\u0010F\u001a\u00020#2\u0006\u0010G\u001a\u00020\u0003H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R$\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u001c8V@VX\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006I"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/PreviewHeaderComponent;", "Lcom/ss/android/lark/tangram/base/component/RenderComponent;", "Lcom/ss/android/lark/chat/preview/entity/component/property/PreviewHeaderProperty;", "Lcom/ss/android/lark/chat/preview/components/view/PreviewHeaderView;", "Lcom/ss/android/lark/tangram/base/dependency/Dependency;", "customerComponent", "Lcom/ss/android/lark/tangram/base/node/IVirtualNode;", "props", "style", "Lcom/ss/android/lark/chat/entity/preview/Style;", "dependency", "action", "Lcom/ss/android/lark/tangram/base/action/Action;", "(Lcom/ss/android/lark/tangram/base/node/IVirtualNode;Lcom/ss/android/lark/chat/preview/entity/component/property/PreviewHeaderProperty;Lcom/ss/android/lark/chat/entity/preview/Style;Lcom/ss/android/lark/tangram/base/dependency/Dependency;Lcom/ss/android/lark/tangram/base/action/Action;)V", "iconSize", "", "value", "", "isSelfSizing", "()Z", "setSelfSizing", "(Z)V", "mCustomRectSize", "Lcom/ss/android/lark/tangram/base/node/IVirtualNode$RectSize;", "mPreviewType", "Lcom/ss/android/lark/chat/preview/components/view/PreviewHeaderView$Type;", "showCloseBtn", "showCopyBtn", "", "viewTypeIdentity", "getViewTypeIdentity", "()Ljava/lang/String;", "setViewTypeIdentity", "(Ljava/lang/String;)V", "bindCloseBtn", "", "closeBtn", "Landroid/widget/ImageView;", "bindCopyBtn", "copyBtn", "bindCustomComponent", "customContainer", "Landroid/widget/FrameLayout;", "isUpdate", "bindPreviewTitle", "previewTitleView", "bindTitleIcon", "imageView", "bindTitleView", "titleView", "Lcom/ss/android/lark/chat/preview/components/view/TailDrawableTextView;", "calPreViewType", "widthAvailable", "calTextViewHeight", "maxWidth", "maxHeight", "previewType", "createView", "Landroid/view/View;", "size", "Landroid/graphics/RectF;", "getDefaultIconPlaceHolder", "Landroid/graphics/drawable/Drawable;", "getIconSize", "getLeftDrawablePlaceHolder", "getRightTagDrawable", "getTextColor", "context", "Landroid/content/Context;", "sizeToFit", "update", "view", "Companion", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.preview.components.h */
public final class PreviewHeaderComponent extends RenderComponent<PreviewHeaderProperty, PreviewHeaderView, Dependency> {

    /* renamed from: a */
    public static final Companion f88158a = new Companion(null);

    /* renamed from: c */
    private PreviewHeaderView.Type f88159c = PreviewHeaderView.Type.ONELINE;

    /* renamed from: d */
    private IVirtualNode.RectSize f88160d;

    /* renamed from: e */
    private final int f88161e = m132362m();

    /* renamed from: f */
    private boolean f88162f;

    /* renamed from: g */
    private boolean f88163g;

    /* renamed from: h */
    private final IVirtualNode f88164h;

    @Override // com.ss.android.lark.tangram.base.component.RenderComponent
    /* renamed from: a */
    public boolean mo126265a() {
        return true;
    }

    @Override // com.ss.android.lark.tangram.base.component.ComponentWithDependency
    /* renamed from: b */
    public String mo126266b() {
        return "com.ss.android.lark.chat.preview.components.view.PreviewHeaderView";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/PreviewHeaderComponent$Companion;", "", "()V", "LOG_TAG", "", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.components.h$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.tangram.base.component.RenderComponent, com.ss.android.lark.tangram.base.node.IVirtualNode
    /* renamed from: a */
    public View mo126262a(RectF rectF) {
        Context a;
        Intrinsics.checkParameterIsNotNull(rectF, "size");
        Dependency f = mo188730f();
        if (f == null || (a = f.mo188743a()) == null) {
            return super.mo126262a(rectF);
        }
        PreviewHeaderView previewHeaderView = new PreviewHeaderView(a, this.f88159c);
        m132356a(previewHeaderView, false);
        return previewHeaderView;
    }

    /* renamed from: a */
    private final void m132357a(TailDrawableTextView tailDrawableTextView) {
        int i;
        String str;
        tailDrawableTextView.setMaxLines(PreviewHeaderView.f88213j.mo126323i());
        if (((PreviewHeaderProperty) mo188739i()).getHeaderType() == PreviewHeaderProperty.HeaderType.NORMAL) {
            FontUtils aVar = FontUtils.f88131a;
            Context context = tailDrawableTextView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "titleView.context");
            tailDrawableTextView.setTextSize(0, aVar.mo126267a(context, new FontLevel(null, 0, 3, null)));
        } else {
            FontUtils aVar2 = FontUtils.f88131a;
            Context context2 = tailDrawableTextView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "titleView.context");
            tailDrawableTextView.setTextSize(0, aVar2.mo126267a(context2, new FontLevel(FontType.HEADLINE, 0, 2, null)));
        }
        TextPaint paint = tailDrawableTextView.getPaint();
        Intrinsics.checkExpressionValueIsNotNull(paint, "titleView.paint");
        paint.setFakeBoldText(true);
        Context context3 = tailDrawableTextView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context3, "titleView.context");
        tailDrawableTextView.setTextColor(m132351a(context3));
        String title = ((PreviewHeaderProperty) mo188739i()).getTitle();
        tailDrawableTextView.setTailContent("…");
        Drawable a = m132352a(this.f88159c);
        Drawable d = m132361d();
        if (a == null && d == null) {
            tailDrawableTextView.setText(title);
            return;
        }
        C58513g gVar = new C58513g(tailDrawableTextView.getContext());
        if (a != null) {
            Context context4 = tailDrawableTextView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context4, "titleView.context");
            ImageSet iconKey = ((PreviewHeaderProperty) mo188739i()).getIconKey();
            if (iconKey == null || (str = iconKey.getKey()) == null) {
                str = ((PreviewHeaderProperty) mo188739i()).getFaviconUrl();
            }
            int i2 = this.f88161e;
            i = 33;
            gVar.append(r13, new CenterSpaceRemoteImageSpan(context4, str, i2, i2, 0, PreviewHeaderView.f88213j.mo126322h(), a, ((PreviewHeaderProperty) mo188739i()).getIconColor()), 33);
        } else {
            i = 33;
        }
        gVar.append(title);
        if (d != null) {
            Context context5 = tailDrawableTextView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context5, "titleView.context");
            gVar.append("$", new CenterSpaceRemoteImageSpan(context5, null, d.getIntrinsicWidth(), d.getIntrinsicHeight(), PreviewHeaderView.f88213j.mo126322h(), 0, d, null, SmActions.ACTION_ONTHECALL_EXIT, null), i);
            tailDrawableTextView.mo126329a(d, PreviewHeaderView.f88213j.mo126322h(), 0);
        }
        tailDrawableTextView.setText(gVar);
    }

    @Override // com.ss.android.lark.tangram.base.component.RenderComponent, com.ss.android.lark.tangram.base.node.IVirtualNode
    /* renamed from: a */
    public IVirtualNode.RectSize mo126270a(IVirtualNode.RectSize aVar) {
        int i;
        Intrinsics.checkParameterIsNotNull(aVar, "size");
        int dp2px = UIHelper.dp2px(aVar.mo188782a());
        int dp2px2 = UIHelper.dp2px(aVar.mo188783b());
        IVirtualNode bVar = this.f88164h;
        IVirtualNode.RectSize a = bVar != null ? bVar.mo126270a(new IVirtualNode.RectSize((float) PreviewHeaderView.f88213j.mo126318d(), (float) dp2px2)) : null;
        float f = BitmapDescriptorFactory.HUE_RED;
        int dp2px3 = UIHelper.dp2px(a != null ? a.mo188782a() : BitmapDescriptorFactory.HUE_RED);
        if (a != null) {
            f = a.mo188783b();
        }
        int dp2px4 = UIHelper.dp2px(f);
        this.f88160d = a;
        Log.m165379d("PreviewTitleComponent", "CustomRectSize is:" + a);
        if (TextUtils.isEmpty(((PreviewHeaderProperty) mo188739i()).getTitle())) {
            IVirtualNode.RectSize aVar2 = new IVirtualNode.RectSize((float) UIHelper.px2dp((float) dp2px), (float) UIHelper.px2dp((float) RangesKt.coerceAtLeast(this.f88161e, dp2px4)));
            Log.m165379d("PreviewTitleComponent", "title is empty, size is:" + aVar2);
            return aVar2;
        }
        int e = ((dp2px - PreviewHeaderView.f88213j.mo126319e()) - PreviewHeaderView.f88213j.mo126320f()) - PreviewHeaderView.f88213j.mo126317c();
        if (this.f88162f) {
            e -= this.f88161e;
        }
        if (this.f88163g) {
            e = (e - this.f88161e) - PreviewHeaderView.f88213j.mo126315a();
        }
        if (this.f88164h != null) {
            e = (e - dp2px3) - PreviewHeaderView.f88213j.mo126316b();
        }
        PreviewHeaderView.Type a2 = m132353a(e, (PreviewHeaderProperty) mo188739i());
        this.f88159c = a2;
        if (a2 == PreviewHeaderView.Type.NEXLINE) {
            e = ((dp2px - PreviewHeaderView.f88213j.mo126319e()) - PreviewHeaderView.f88213j.mo126320f()) - PreviewHeaderView.f88213j.mo126317c();
        }
        int a3 = m132350a(e, dp2px2, this.f88159c);
        if (this.f88159c == PreviewHeaderView.Type.ONELINE) {
            i = RangesKt.coerceAtLeast(RangesKt.coerceAtLeast(this.f88161e, dp2px4), a3);
        } else {
            i = a3 + RangesKt.coerceAtLeast(this.f88161e, dp2px4);
        }
        Log.m165389i("PreviewTitleComponent", "sizeToFit, width is:" + dp2px + ", height is:" + i);
        return new IVirtualNode.RectSize((float) UIHelper.px2dp((float) dp2px), (float) UIHelper.px2dp((float) i));
    }

    /* renamed from: c */
    private final Drawable m132359c() {
        Drawable drawable = UIHelper.getDrawable(R.drawable.ic_chat_preview_header_placeholder);
        int i = this.f88161e;
        drawable.setBounds(0, 0, i, i);
        Intrinsics.checkExpressionValueIsNotNull(drawable, "drawable");
        return drawable;
    }

    /* renamed from: m */
    private final int m132362m() {
        float f = 18.0f;
        switch (C34101i.f88170b[LKUIDisplayManager.m91870a().ordinal()]) {
            case 1:
                f = 15.0f;
                break;
            case 2:
                f = 16.0f;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return UIHelper.dp2px(f);
    }

    /* renamed from: d */
    private final Drawable m132361d() {
        Context a;
        Context a2;
        boolean z;
        Integer num;
        FontType fontType;
        int i = 0;
        Integer num2 = null;
        if (((PreviewHeaderProperty) mo188739i()).getLarkTag() == null) {
            Dependency f = mo188730f();
            if (f == null || (a2 = f.mo188743a()) == null) {
                return null;
            }
            String headerTag = ((PreviewHeaderProperty) mo188739i()).getHeaderTag();
            if (headerTag == null || headerTag.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            String headerTag2 = ((PreviewHeaderProperty) mo188739i()).getHeaderTag();
            TextTag.Companion bVar = TextTag.f62987a;
            TextTag.Builder aVar = new TextTag.Builder();
            aVar.mo90136a(headerTag2);
            ThemeColor tagTextColor = ((PreviewHeaderProperty) mo188739i()).getTagTextColor();
            if (tagTextColor != null) {
                num = Integer.valueOf(ColorUtils.f87906a.mo125874a(tagTextColor, a2));
            } else {
                num = null;
            }
            aVar.mo90135a(num);
            ThemeColor tagColor = ((PreviewHeaderProperty) mo188739i()).getTagColor();
            if (tagColor != null) {
                num2 = Integer.valueOf(ColorUtils.f87906a.mo125874a(tagColor, a2));
            }
            aVar.mo90140b(num2);
            TextTag l = aVar.mo90154l();
            LarkNameTag.ChatTagBuilder b = LarkNameTag.f62897a.mo90053b(a2);
            if (mo188733h() instanceof Style) {
                TCStyle h = mo188733h();
                if (h != null) {
                    FontLevel fontLevel = ((Style) h).getFontLevel();
                    if (fontLevel == null || (fontType = fontLevel.getType()) == null) {
                        fontType = FontType.CAPTION;
                    }
                    if (fontLevel != null) {
                        i = fontLevel.getLevel();
                    }
                    b.mo90014a(UIHelper.sp2px((float) FontUtils.f88131a.mo126268a(fontType, i).getNormal()));
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.Style");
                }
            }
            b.mo89985b(l, true);
            return b.mo90027e().mo90006b();
        }
        Dependency f2 = mo188730f();
        if (f2 == null || (a = f2.mo188743a()) == null) {
            return null;
        }
        int dp2px = UIHelper.dp2px(12.0f);
        LarkNameTag.ChatTagBuilder b2 = LarkNameTag.f62897a.mo90053b(a);
        b2.mo90014a((float) dp2px);
        Tag larkTag = ((PreviewHeaderProperty) mo188739i()).getLarkTag();
        if (larkTag != null) {
            int i2 = C34101i.f88169a[larkTag.ordinal()];
            if (i2 == 1) {
                b2.mo90031a(true);
            } else if (i2 == 2) {
                b2.mo90033b(true);
            } else if (i2 == 3) {
                b2.mo90032a(true, false);
            } else if (i2 == 4) {
                b2.mo90032a(false, true);
            } else if (i2 == 5) {
                b2.mo90037h(true);
            }
        }
        return b2.mo90027e().mo90006b();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.components.h$b */
    public static final class View$OnClickListenerC34098b implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC34098b f88165a = new View$OnClickListenerC34098b();

        View$OnClickListenerC34098b() {
        }

        public final void onClick(View view) {
            Log.m165379d("PreviewTitleComponent", "click close");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.components.h$c */
    public static final class View$OnClickListenerC34099c implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC34099c f88166a = new View$OnClickListenerC34099c();

        View$OnClickListenerC34099c() {
        }

        public final void onClick(View view) {
            Log.m165379d("PreviewTitleComponent", "click copy");
        }
    }

    /* renamed from: a */
    public void mo126263a(PreviewHeaderView previewHeaderView) {
        Intrinsics.checkParameterIsNotNull(previewHeaderView, "view");
        super.mo126263a((View) previewHeaderView);
        m132356a(previewHeaderView, true);
    }

    /* renamed from: a */
    private final Drawable m132352a(PreviewHeaderView.Type type) {
        if ((((PreviewHeaderProperty) mo188739i()).getIconKey() != null || !TextUtils.isEmpty(((PreviewHeaderProperty) mo188739i()).getFaviconUrl())) && type == PreviewHeaderView.Type.ONELINE) {
            return m132359c();
        }
        return null;
    }

    /* renamed from: b */
    private final void m132358b(ImageView imageView) {
        int i;
        if (this.f88162f) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        if (((PreviewHeaderProperty) mo188739i()).getTheme() == Theme.LIGHT) {
            imageView.setImageResource(R.drawable.ic_svg_preview_title_close_dark);
        } else if (((PreviewHeaderProperty) mo188739i()).getTheme() == Theme.DARK) {
            imageView.setImageResource(R.drawable.ic_svg_preview_title_close);
        }
        imageView.setOnClickListener(View$OnClickListenerC34098b.f88165a);
    }

    /* renamed from: c */
    private final void m132360c(ImageView imageView) {
        int i;
        if (this.f88163g) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        if (((PreviewHeaderProperty) mo188739i()).getTheme() == Theme.LIGHT) {
            imageView.setImageResource(R.drawable.ic_svg_preview_title_copy_dark);
        } else if (((PreviewHeaderProperty) mo188739i()).getTheme() == Theme.DARK) {
            imageView.setImageResource(R.drawable.ic_svg_preview_title_copy);
        }
        imageView.setOnClickListener(View$OnClickListenerC34099c.f88166a);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/preview/components/PreviewHeaderComponent$bindTitleIcon$1", "Lcom/ss/android/lark/image/api/SimpleTarget;", "Landroid/graphics/drawable/Drawable;", "onResourceReady", "", "resource", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.components.h$d */
    public static final class C34100d extends C38818i<Drawable> {

        /* renamed from: a */
        final /* synthetic */ PreviewHeaderComponent f88167a;

        /* renamed from: b */
        final /* synthetic */ ImageView f88168b;

        /* renamed from: g_ */
        public void mo49248a(Drawable drawable) {
            super.mo49248a((Object) drawable);
            if (!(drawable == null || ((PreviewHeaderProperty) this.f88167a.mo188739i()).getIconColor() == null)) {
                drawable.mutate();
                ColorUtils aVar = ColorUtils.f87906a;
                ThemeColor iconColor = ((PreviewHeaderProperty) this.f88167a.mo188739i()).getIconColor();
                if (iconColor == null) {
                    Intrinsics.throwNpe();
                }
                Context context = this.f88168b.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "imageView.context");
                drawable.setTint(aVar.mo125874a(iconColor, context));
            }
            this.f88168b.setImageDrawable(drawable);
        }

        C34100d(PreviewHeaderComponent hVar, ImageView imageView) {
            this.f88167a = hVar;
            this.f88168b = imageView;
        }
    }

    /* renamed from: a */
    private final int m132351a(Context context) {
        if (mo188733h() instanceof Style) {
            TCStyle h = mo188733h();
            if (h != null) {
                ThemeColor textColorV2 = ((Style) h).getTextColorV2();
                if (textColorV2 != null) {
                    return ColorUtils.f87906a.mo125874a(textColorV2, context);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.Style");
            }
        }
        if (((PreviewHeaderProperty) mo188739i()).getHeaderType() == PreviewHeaderProperty.HeaderType.NORMAL && ((PreviewHeaderProperty) mo188739i()).getTheme() == Theme.LIGHT) {
            return UIHelper.getColor(R.color.text_placeholder);
        }
        if (((PreviewHeaderProperty) mo188739i()).getHeaderType() == PreviewHeaderProperty.HeaderType.NORMAL && ((PreviewHeaderProperty) mo188739i()).getTheme() == Theme.DARK) {
            return UIHelper.getColor(R.color.static_white);
        }
        if (((PreviewHeaderProperty) mo188739i()).getHeaderType() == PreviewHeaderProperty.HeaderType.HEADLINES && ((PreviewHeaderProperty) mo188739i()).getTheme() == Theme.LIGHT) {
            return UIHelper.getColor(R.color.text_title);
        }
        return UIHelper.getColor(R.color.static_white);
    }

    /* renamed from: a */
    private final void m132355a(ImageView imageView) {
        String str;
        ImageSet iconKey = ((PreviewHeaderProperty) mo188739i()).getIconKey();
        String str2 = null;
        if (iconKey != null) {
            str = iconKey.getKey();
        } else {
            str = null;
        }
        if (str == null || this.f88159c == PreviewHeaderView.Type.ONELINE) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        IRequestCreator with = ImageLoader.with(imageView.getContext());
        ImageSet iconKey2 = ((PreviewHeaderProperty) mo188739i()).getIconKey();
        if (iconKey2 != null) {
            str2 = iconKey2.getKey();
        }
        if (str2 == null) {
            Intrinsics.throwNpe();
        }
        IRequestCreator placeholder = with.load(new C38824b(str2)).placeholder(m132359c());
        int i = this.f88161e;
        placeholder.override(i, i).into(new C34100d(this, imageView));
    }

    /* renamed from: a */
    private final PreviewHeaderView.Type m132353a(int i, PreviewHeaderProperty previewHeaderProperty) {
        if (previewHeaderProperty.getHeaderType() == PreviewHeaderProperty.HeaderType.NORMAL) {
            return PreviewHeaderView.Type.ONELINE;
        }
        if (i >= PreviewHeaderView.f88213j.mo126321g()) {
            return PreviewHeaderView.Type.ONELINE;
        }
        return PreviewHeaderView.Type.NEXLINE;
    }

    /* renamed from: a */
    private final void m132354a(FrameLayout frameLayout, boolean z) {
        IVirtualNode bVar = this.f88164h;
        if (bVar == null) {
            frameLayout.setVisibility(8);
            return;
        }
        frameLayout.setVisibility(0);
        if (!z || frameLayout.getChildCount() <= 0) {
            IVirtualNode.RectSize aVar = this.f88160d;
            if (aVar != null) {
                int dp2px = UIHelper.dp2px(aVar.mo188782a());
                int dp2px2 = UIHelper.dp2px(aVar.mo188783b());
                View a = bVar.mo126262a(new RectF(BitmapDescriptorFactory.HUE_RED, (float) dp2px, BitmapDescriptorFactory.HUE_RED, (float) dp2px2));
                if (a != null) {
                    frameLayout.addView(a, new FrameLayout.LayoutParams(dp2px, dp2px2));
                    bVar.mo188738c(a);
                    return;
                }
                return;
            }
            return;
        }
        View childAt = frameLayout.getChildAt(0);
        Intrinsics.checkExpressionValueIsNotNull(childAt, "customContainer.getChildAt(0)");
        bVar.mo188738c(childAt);
    }

    /* renamed from: a */
    private final void m132356a(PreviewHeaderView previewHeaderView, boolean z) {
        m132357a(previewHeaderView.getTitleView());
        m132355a(previewHeaderView.getTitleIconView());
        m132354a(previewHeaderView.getCustomContainer(), z);
        m132360c(previewHeaderView.getCopyBtn());
        m132358b(previewHeaderView.getCloseBtn());
    }

    /* renamed from: a */
    private final int m132350a(int i, int i2, PreviewHeaderView.Type type) {
        Context a;
        String str;
        Drawable drawable;
        Drawable drawable2;
        C58513g gVar;
        TailDrawableTextView tailDrawableTextView;
        C58513g gVar2;
        Dependency f = mo188730f();
        if (f == null || (a = f.mo188743a()) == null) {
            return 0;
        }
        TailDrawableTextView tailDrawableTextView2 = new TailDrawableTextView(a);
        if (((PreviewHeaderProperty) mo188739i()).getHeaderType() == PreviewHeaderProperty.HeaderType.NORMAL) {
            FontUtils aVar = FontUtils.f88131a;
            Context context = tailDrawableTextView2.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "textView.context");
            tailDrawableTextView2.setTextSize(0, aVar.mo126267a(context, new FontLevel(null, 0, 3, null)));
        } else {
            FontUtils aVar2 = FontUtils.f88131a;
            Context context2 = tailDrawableTextView2.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "textView.context");
            tailDrawableTextView2.setTextSize(0, aVar2.mo126267a(context2, new FontLevel(FontType.HEADLINE, 0, 2, null)));
        }
        TextPaint paint = tailDrawableTextView2.getPaint();
        Intrinsics.checkExpressionValueIsNotNull(paint, "textView.paint");
        paint.setFakeBoldText(true);
        tailDrawableTextView2.setTailContent("…");
        tailDrawableTextView2.setMaxLines(PreviewHeaderView.f88213j.mo126323i());
        Log.m165379d("PreviewTitleComponent", "Title is:" + ((PreviewHeaderProperty) mo188739i()).getTitle() + ", maxLines:" + tailDrawableTextView2.getMaxLines());
        Drawable a2 = m132352a(type);
        Drawable d = m132361d();
        C58513g gVar3 = new C58513g(a);
        if (a2 != null) {
            int i3 = this.f88161e;
            drawable2 = d;
            drawable = a2;
            str = "PreviewTitleComponent";
            tailDrawableTextView = tailDrawableTextView2;
            gVar = gVar3;
            gVar.append("$", new CenterSpaceRemoteImageSpan(a, null, i3, i3, 0, PreviewHeaderView.f88213j.mo126322h(), a2, null, SmActions.ACTION_ONTHECALL_EXIT, null), 33);
        } else {
            drawable2 = d;
            drawable = a2;
            str = "PreviewTitleComponent";
            tailDrawableTextView = tailDrawableTextView2;
            gVar = gVar3;
        }
        gVar.append(((PreviewHeaderProperty) mo188739i()).getTitle());
        if (drawable2 != null) {
            gVar.append(" ");
            gVar2 = gVar;
            gVar2.append("$", new CenterSpaceRemoteImageSpan(a, null, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight(), PreviewHeaderView.f88213j.mo126322h(), 0, drawable2, null, SmActions.ACTION_ONTHECALL_EXIT, null), 33);
            tailDrawableTextView.mo126329a(drawable2, PreviewHeaderView.f88213j.mo126322h(), 0);
        } else {
            gVar2 = gVar;
        }
        tailDrawableTextView.setText(gVar2);
        Log.m165379d(str, "leftDrawable" + drawable + ", rightDrawable" + drawable2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        tailDrawableTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        tailDrawableTextView.measure(makeMeasureSpec, makeMeasureSpec2);
        Log.m165379d(str, "maxWidth is:" + i + ", maxHeight is:" + i2 + ", measureWidth is " + tailDrawableTextView.getMeasuredWidth() + ", measureHeight is " + tailDrawableTextView.getMeasuredHeight());
        return tailDrawableTextView.getMeasuredHeight();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreviewHeaderComponent(IVirtualNode bVar, PreviewHeaderProperty previewHeaderProperty, Style style, Dependency aVar, Action<PreviewHeaderView> aVar2) {
        super(previewHeaderProperty, style, aVar, aVar2);
        Intrinsics.checkParameterIsNotNull(previewHeaderProperty, "props");
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        this.f88164h = bVar;
    }
}
