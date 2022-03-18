package com.ss.android.lark.chat.preview.components;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.preview.ColorUtils;
import com.ss.android.lark.chat.entity.preview.Gradient;
import com.ss.android.lark.chat.entity.preview.Style;
import com.ss.android.lark.chat.entity.preview.ThemeColor;
import com.ss.android.lark.chat.preview.ChatPreviewInit;
import com.ss.android.lark.chat.preview.components.baseview.CrescentAvatarListView;
import com.ss.android.lark.chat.preview.components.utils.FontUtils;
import com.ss.android.lark.chat.preview.entity.component.property.ChattersPreviewProperty;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.tangram.base.action.Action;
import com.ss.android.lark.tangram.base.component.RenderComponent;
import com.ss.android.lark.tangram.base.dependency.Dependency;
import com.ss.android.lark.tangram.base.node.IVirtualNode;
import com.ss.android.lark.tangram.base.style.TCStyle;
import com.ss.android.lark.tangram.base.style.Value;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p3466b.C69029a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \"2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\"B/\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003H\u0016R$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00138V@VX\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006#"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/ChattersPreviewComponent;", "Lcom/ss/android/lark/tangram/base/component/RenderComponent;", "Lcom/ss/android/lark/chat/preview/entity/component/property/ChattersPreviewProperty;", "Lcom/ss/android/lark/chat/preview/components/baseview/CrescentAvatarListView;", "Lcom/ss/android/lark/tangram/base/dependency/Dependency;", "props", "style", "Lcom/ss/android/lark/chat/entity/preview/Style;", "dependency", "action", "Lcom/ss/android/lark/tangram/base/action/Action;", "(Lcom/ss/android/lark/chat/preview/entity/component/property/ChattersPreviewProperty;Lcom/ss/android/lark/chat/entity/preview/Style;Lcom/ss/android/lark/tangram/base/dependency/Dependency;Lcom/ss/android/lark/tangram/base/action/Action;)V", "value", "", "isSelfSizing", "()Z", "setSelfSizing", "(Z)V", "list", "", "viewTypeIdentity", "getViewTypeIdentity", "()Ljava/lang/String;", "setViewTypeIdentity", "(Ljava/lang/String;)V", "createView", "Landroid/view/View;", "size", "Landroid/graphics/RectF;", "sizeToFit", "Lcom/ss/android/lark/tangram/base/node/IVirtualNode$RectSize;", "update", "", "view", "Companion", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.preview.components.b */
public final class ChattersPreviewComponent extends RenderComponent<ChattersPreviewProperty, CrescentAvatarListView, Dependency> {

    /* renamed from: a */
    public static final Companion f88134a = new Companion(null);

    /* renamed from: c */
    private CrescentAvatarListView f88135c;

    @Override // com.ss.android.lark.tangram.base.component.RenderComponent
    /* renamed from: a */
    public boolean mo126265a() {
        return true;
    }

    @Override // com.ss.android.lark.tangram.base.component.ComponentWithDependency
    /* renamed from: b */
    public String mo126266b() {
        return "com.ss.android.lark.chat.preview.components.baseview.CrescentAvatarListView";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/ChattersPreviewComponent$Companion;", "", "()V", "TAG", "", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.components.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/chat/preview/components/ChattersPreviewComponent$update$5$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.components.b$c */
    public static final class View$OnClickListenerC34092c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Action f88138a;

        /* renamed from: b */
        final /* synthetic */ CrescentAvatarListView f88139b;

        View$OnClickListenerC34092c(Action aVar, CrescentAvatarListView crescentAvatarListView) {
            this.f88138a = aVar;
            this.f88139b = crescentAvatarListView;
        }

        public final void onClick(View view) {
            this.f88138a.mo126248a(this.f88139b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/chat/preview/components/ChattersPreviewComponent$update$1$2", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/chat/preview/entity/component/property/ChattersPreviewProperty$ChatterInfo;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.components.b$b */
    public static final class C34091b implements IGetDataCallback<List<? extends ChattersPreviewProperty.ChatterInfo>> {

        /* renamed from: a */
        final /* synthetic */ ChattersPreviewComponent f88136a;

        /* renamed from: b */
        final /* synthetic */ CrescentAvatarListView f88137b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f88137b.setData((ChattersPreviewProperty) this.f88136a.mo188739i());
        }

        /* renamed from: a */
        public void onSuccess(List<ChattersPreviewProperty.ChatterInfo> list) {
            if (list == null || list.size() <= 0) {
                this.f88137b.setData((ChattersPreviewProperty) this.f88136a.mo188739i());
                return;
            }
            ((ChattersPreviewProperty) this.f88136a.mo188739i()).setChatterInfoList(list);
            this.f88137b.setData((ChattersPreviewProperty) this.f88136a.mo188739i());
        }

        C34091b(ChattersPreviewComponent bVar, CrescentAvatarListView crescentAvatarListView) {
            this.f88136a = bVar;
            this.f88137b = crescentAvatarListView;
        }
    }

    @Override // com.ss.android.lark.tangram.base.component.RenderComponent, com.ss.android.lark.tangram.base.node.IVirtualNode
    /* renamed from: a */
    public View mo126262a(RectF rectF) {
        Intrinsics.checkParameterIsNotNull(rectF, "size");
        Context context = null;
        if (mo188730f() == null) {
            return null;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(UIHelper.dp2px(rectF.width()), UIHelper.dp2px(rectF.height()));
        layoutParams.leftMargin = UIHelper.dp2px(rectF.left);
        layoutParams.topMargin = UIHelper.dp2px(rectF.top);
        Dependency f = mo188730f();
        if (f != null) {
            context = f.mo188743a();
        }
        CrescentAvatarListView crescentAvatarListView = new CrescentAvatarListView(context);
        this.f88135c = crescentAvatarListView;
        if (crescentAvatarListView != null) {
            crescentAvatarListView.setLayoutParams(layoutParams);
        }
        CrescentAvatarListView crescentAvatarListView2 = this.f88135c;
        if (crescentAvatarListView2 != null) {
            crescentAvatarListView2.setData((ChattersPreviewProperty) mo188739i());
        }
        return this.f88135c;
    }

    @Override // com.ss.android.lark.tangram.base.component.RenderComponent, com.ss.android.lark.tangram.base.node.IVirtualNode
    /* renamed from: a */
    public IVirtualNode.RectSize mo126270a(IVirtualNode.RectSize aVar) {
        float f;
        int i;
        int i2;
        Value width;
        Float value;
        Intrinsics.checkParameterIsNotNull(aVar, "size");
        int i3 = CrescentAvatarListView.f88140c;
        TCStyle h = mo188733h();
        if (h == null || (width = h.getWidth()) == null || (value = width.getValue()) == null) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = value.floatValue();
        }
        float dp2px = (float) UIHelper.dp2px(f);
        if (dp2px > ((float) 0)) {
            i = (int) dp2px;
        } else {
            int i4 = CrescentAvatarListView.f88140c;
            Integer maxShowCount = ((ChattersPreviewProperty) mo188739i()).getMaxShowCount();
            if (maxShowCount != null) {
                i2 = maxShowCount.intValue();
            } else {
                i2 = 5;
            }
            i = i4 * (i2 + 1);
        }
        return new IVirtualNode.RectSize((float) UIHelper.px2dp(LKUIDisplayManager.m91861a((float) i)), (float) UIHelper.px2dp(LKUIDisplayManager.m91861a((float) i3)));
    }

    /* renamed from: a */
    public void mo126263a(CrescentAvatarListView crescentAvatarListView) {
        boolean z;
        boolean z2;
        Intrinsics.checkParameterIsNotNull(crescentAvatarListView, "view");
        ((ChattersPreviewProperty) mo188739i()).setMaxShowCount(Integer.valueOf(C69029a.m265653a((((float) crescentAvatarListView.getLayoutParams().width) / (LKUIDisplayManager.m91870a().getMultiplier() * ((float) CrescentAvatarListView.f88140c))) - ((float) 1))));
        List<ChattersPreviewProperty.ChatterInfo> chatterInfoList = ((ChattersPreviewProperty) mo188739i()).getChatterInfoList();
        if (chatterInfoList != null) {
            Iterator<ChattersPreviewProperty.ChatterInfo> it = chatterInfoList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                String avatarKey = it.next().getAvatarKey();
                if (avatarKey == null || avatarKey.length() == 0) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    ChatPreviewInit.IChatPreviewModuleDependency a = ChatPreviewInit.f88086a.mo126246a();
                    if (a != null) {
                        List<ChattersPreviewProperty.ChatterInfo> list = chatterInfoList;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(it2.next().getChatterId());
                        }
                        a.mo102701a(arrayList, new C34091b(this, crescentAvatarListView));
                    }
                    z = true;
                }
            }
            if (!z) {
                crescentAvatarListView.setData((ChattersPreviewProperty) mo188739i());
            }
        }
        if (mo188733h() instanceof Style) {
            TCStyle h = mo188733h();
            if (h != null) {
                Gradient backgroundColor = ((Style) h).getBackgroundColor();
                if (backgroundColor != null) {
                    Gradient.Content content = backgroundColor.getContent();
                    if (content != null) {
                        List<ThemeColor> themeColors = ((Gradient.Linear) content).getThemeColors();
                        if (themeColors != null) {
                            int[] iArr = new int[themeColors.size()];
                            int size = themeColors.size();
                            for (int i = 0; i < size; i++) {
                                ColorUtils aVar = ColorUtils.f87906a;
                                Context context = crescentAvatarListView.getContext();
                                Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
                                int a2 = aVar.mo125874a(themeColors.get(i), context);
                                if (a2 == 0) {
                                    a2 = UIUtils.getColor(crescentAvatarListView.getContext(), R.color.bg_filler);
                                }
                                iArr[i] = a2;
                            }
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            if (themeColors.size() == 1) {
                                gradientDrawable.setColor(iArr[0]);
                            } else if (themeColors.size() > 1) {
                                gradientDrawable.setColors(iArr);
                            }
                            gradientDrawable.setShape(1);
                            gradientDrawable.setCornerRadius((float) UIHelper.dp2px(4.0f));
                            TextView participantsNumbView = crescentAvatarListView.getParticipantsNumbView();
                            Intrinsics.checkExpressionValueIsNotNull(participantsNumbView, "view.getParticipantsNumbView()");
                            participantsNumbView.setBackground(gradientDrawable);
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.Gradient.Linear");
                    }
                }
                TCStyle h2 = mo188733h();
                if (h2 != null) {
                    ThemeColor textColorV2 = ((Style) h2).getTextColorV2();
                    if (textColorV2 != null) {
                        ColorUtils aVar2 = ColorUtils.f87906a;
                        Context context2 = crescentAvatarListView.getContext();
                        Intrinsics.checkExpressionValueIsNotNull(context2, "view.context");
                        int a3 = aVar2.mo125874a(textColorV2, context2);
                        Log.m165389i("ChattersPreviewComponent", "style.textColor = " + a3);
                        crescentAvatarListView.getParticipantsNumbView().setTextColor(a3);
                    }
                    TCStyle h3 = mo188733h();
                    if (h3 != null) {
                        TextView participantsNumbView2 = crescentAvatarListView.getParticipantsNumbView();
                        Intrinsics.checkExpressionValueIsNotNull(participantsNumbView2, "view.getParticipantsNumbView()");
                        TextPaint paint = participantsNumbView2.getPaint();
                        Intrinsics.checkExpressionValueIsNotNull(paint, "view.getParticipantsNumbView().paint");
                        paint.setFakeBoldText(FontUtils.f88131a.mo126269a(((Style) h3).getFontLevel()));
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.Style");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.Style");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.Style");
            }
        }
        Action l = mo188742l();
        if (l != null) {
            crescentAvatarListView.setOnClickListener(new View$OnClickListenerC34092c(l, crescentAvatarListView));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChattersPreviewComponent(ChattersPreviewProperty chattersPreviewProperty, Style style, Dependency aVar, Action<CrescentAvatarListView> aVar2) {
        super(chattersPreviewProperty, style, aVar, aVar2);
        Intrinsics.checkParameterIsNotNull(chattersPreviewProperty, "props");
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
    }
}
