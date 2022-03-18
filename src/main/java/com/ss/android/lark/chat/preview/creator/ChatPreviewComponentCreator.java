package com.ss.android.lark.chat.preview.creator;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.preview.BaseProperty;
import com.ss.android.lark.chat.entity.preview.Style;
import com.ss.android.lark.chat.entity.preview.Type;
import com.ss.android.lark.chat.entity.preview.UrlPreviewAction;
import com.ss.android.lark.chat.entity.preview.UrlPreviewBody;
import com.ss.android.lark.chat.entity.preview.UrlPreviewComponent;
import com.ss.android.lark.chat.entity.preview.UrlPreviewComponents;
import com.ss.android.lark.chat.preview.ChatPreviewInit;
import com.ss.android.lark.chat.preview.actions.ActionCreator;
import com.ss.android.lark.chat.preview.components.AvatarComponent;
import com.ss.android.lark.chat.preview.components.ChattersPreviewComponent;
import com.ss.android.lark.chat.preview.components.FrameLayoutComponent;
import com.ss.android.lark.chat.preview.components.IGLayoutComponent;
import com.ss.android.lark.chat.preview.components.ImageViewComponent;
import com.ss.android.lark.chat.preview.components.LinearLayoutComponent;
import com.ss.android.lark.chat.preview.components.PreviewHeaderComponent;
import com.ss.android.lark.chat.preview.components.RichTextComponent;
import com.ss.android.lark.chat.preview.components.SpinButtonComponent;
import com.ss.android.lark.chat.preview.components.TagListComponent;
import com.ss.android.lark.chat.preview.components.TextViewComponent;
import com.ss.android.lark.chat.preview.components.TimingComponent;
import com.ss.android.lark.chat.preview.components.UDButtonComponent;
import com.ss.android.lark.chat.preview.components.VideoComponent;
import com.ss.android.lark.chat.preview.components.baseview.CrescentAvatarListView;
import com.ss.android.lark.chat.preview.components.view.SpinButton;
import com.ss.android.lark.chat.preview.components.view.UDListDialogAdapter;
import com.ss.android.lark.chat.preview.components.view.VideoCoverView;
import com.ss.android.lark.chat.preview.entity.component.ImageSet;
import com.ss.android.lark.chat.preview.entity.component.Item;
import com.ss.android.lark.chat.preview.entity.component.property.AvatarProperty;
import com.ss.android.lark.chat.preview.entity.component.property.ButtonProperty;
import com.ss.android.lark.chat.preview.entity.component.property.ChattersPreviewProperty;
import com.ss.android.lark.chat.preview.entity.component.property.EmptyProperty;
import com.ss.android.lark.chat.preview.entity.component.property.IGProperty;
import com.ss.android.lark.chat.preview.entity.component.property.ImageProperty;
import com.ss.android.lark.chat.preview.entity.component.property.LinearLayoutProperty;
import com.ss.android.lark.chat.preview.entity.component.property.PreviewHeaderProperty;
import com.ss.android.lark.chat.preview.entity.component.property.RichTextProperty;
import com.ss.android.lark.chat.preview.entity.component.property.SpinButtonProperty;
import com.ss.android.lark.chat.preview.entity.component.property.TagListProperty;
import com.ss.android.lark.chat.preview.entity.component.property.TextViewProperty;
import com.ss.android.lark.chat.preview.entity.component.property.TimeProperty;
import com.ss.android.lark.chat.preview.entity.component.property.VideoProperty;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.tangram.base.action.Action;
import com.ss.android.lark.tangram.base.component.ComponentWithDependency;
import com.ss.android.lark.tangram.base.component.IComponent;
import com.ss.android.lark.tangram.base.component.LayoutComponent;
import com.ss.android.lark.tangram.base.component.RenderComponent;
import com.ss.android.lark.tangram.base.dependency.Dependency;
import com.ss.android.lark.tangram.base.node.IVirtualNode;
import com.ss.android.lark.tangram.base.render.IRender;
import com.ss.android.lark.tangram.base.render.Render;
import com.ss.android.lark.tangram.base.style.Value;
import com.ss.android.lark.tangram.base.style.ValueType;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 ;2\u00020\u0001:\u0001;B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ$\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016JJ\u0010\u001c\u001a\u00020\u001d2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u00052\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020#0\"2\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020%\u0018\u00010\"H\u0002J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0002J\u0014\u0010*\u001a\u0004\u0018\u00010\u00192\b\u0010+\u001a\u0004\u0018\u00010,H\u0016JD\u0010-\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001f2\b\u0010.\u001a\u0004\u0018\u00010\u00052\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020#0\"2\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020%\u0018\u00010\"H\u0002JO\u0010/\u001a\u00020\u001d2\b\u00100\u001a\u0004\u0018\u0001012\u000e\u00102\u001a\n\u0012\u0004\u0012\u000204\u0018\u0001032\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020%\u0018\u00010\"2\b\u00105\u001a\u0004\u0018\u0001062\u0006\u00107\u001a\u000208H\u0002¢\u0006\u0002\u00109J\b\u0010:\u001a\u00020\u001dH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006<"}, d2 = {"Lcom/ss/android/lark/chat/preview/creator/ChatPreviewComponentCreator;", "Lcom/ss/android/lark/chat/preview/creator/IChatPreviewComponentCreator;", "context", "Landroid/content/Context;", "previewId", "", "url", "isGroup", "", "onLongClickListener", "Landroid/view/View$OnLongClickListener;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLandroid/view/View$OnLongClickListener;)V", "getContext", "()Landroid/content/Context;", "dependency", "Lcom/ss/android/lark/tangram/base/dependency/Dependency;", "()Z", "getPreviewId", "()Ljava/lang/String;", "getUrl", "bindTree", "Lcom/ss/android/lark/tangram/base/render/Render;", "parent", "Landroid/view/ViewGroup;", "rootComponent", "Lcom/ss/android/lark/tangram/base/component/IComponent;", "calculateChatItemWidth", "", "buildTree", "", "rootNode", "Lcom/ss/android/lark/tangram/base/component/ComponentWithDependency;", "rootId", "components", "", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewComponent;", "actions", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewAction;", "createFakeRoot", "Lcom/ss/android/lark/chat/preview/components/FrameLayoutComponent;", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/preview/Type;", "createTree", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewBody;", "createTreeNode", "id", "generatePermChangeDialog", "selectIndex", "", "items", "", "Lcom/ss/android/lark/chat/preview/entity/component/Item;", "view", "Lcom/ss/android/lark/chat/preview/components/view/SpinButton;", "props", "Lcom/ss/android/lark/chat/preview/entity/component/property/SpinButtonProperty;", "(Ljava/lang/Long;Ljava/util/List;Ljava/util/Map;Lcom/ss/android/lark/chat/preview/components/view/SpinButton;Lcom/ss/android/lark/chat/preview/entity/component/property/SpinButtonProperty;)V", "getUrlPreviewChatterList", "Companion", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.preview.b.a */
public final class ChatPreviewComponentCreator {

    /* renamed from: b */
    public static final Companion f88094b = new Companion(null);

    /* renamed from: a */
    public final View.OnLongClickListener f88095a;

    /* renamed from: c */
    private final Dependency f88096c;

    /* renamed from: d */
    private final Context f88097d;

    /* renamed from: e */
    private final String f88098e;

    /* renamed from: f */
    private final String f88099f;

    /* renamed from: g */
    private final boolean f88100g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/preview/creator/ChatPreviewComponentCreator$Companion;", "", "()V", "TAG", "", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final Context mo126253b() {
        return this.f88097d;
    }

    /* renamed from: c */
    public final String mo126254c() {
        return this.f88098e;
    }

    /* renamed from: d */
    public final String mo126255d() {
        return this.f88099f;
    }

    /* renamed from: e */
    public final boolean mo126256e() {
        return this.f88100g;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/tangram/base/render/Render;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.b.a$b */
    static final class C34080b extends Lambda implements Function0<Render> {
        final /* synthetic */ int $calculateChatItemWidth;
        final /* synthetic */ IComponent $rootComponent;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34080b(IComponent cVar, int i) {
            super(0);
            this.$rootComponent = cVar;
            this.$calculateChatItemWidth = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Render invoke() {
            IComponent cVar = this.$rootComponent;
            if (cVar == null) {
                return null;
            }
            return new Render(cVar, new Render.OnAnchorViewDestroyCallback() {
                /* class com.ss.android.lark.chat.preview.creator.ChatPreviewComponentCreator.C34080b.C340811 */

                @Override // com.ss.android.lark.tangram.base.render.Render.OnAnchorViewDestroyCallback
                /* renamed from: a */
                public void mo122981a() {
                    Log.m165389i("TangramCreator", "anchor view is destroyed");
                }
            }, UIHelper.px2dp((float) this.$calculateChatItemWidth), Integer.MAX_VALUE);
        }
    }

    /* renamed from: a */
    public final void mo126251a() {
        ChatPreviewInit.IChatPreviewModuleDependency a = ChatPreviewInit.f88086a.mo126246a();
        if (a != null) {
            a.mo102700a(this.f88098e, new C34087h(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/chat/preview/creator/ChatPreviewComponentCreator$createTreeNode$node$1", "Lcom/ss/android/lark/tangram/base/action/Action;", "Lcom/ss/android/lark/chat/preview/components/baseview/CrescentAvatarListView;", "onClick", "", "view", "onLongClick", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.b.a$c */
    public static final class C34082c implements Action<CrescentAvatarListView> {

        /* renamed from: a */
        final /* synthetic */ ChatPreviewComponentCreator f88101a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34082c(ChatPreviewComponentCreator aVar) {
            this.f88101a = aVar;
        }

        /* renamed from: a */
        public void mo126248a(CrescentAvatarListView crescentAvatarListView) {
            ChatPreviewInit.IChatPreviewModuleDependency.IActionDependency b;
            this.f88101a.mo126251a();
            ChatPreviewInit.IChatPreviewModuleDependency a = ChatPreviewInit.f88086a.mo126246a();
            if (a != null && (b = a.mo102702b()) != null) {
                b.mo102705a(this.f88101a.mo126255d(), this.f88101a.mo126254c(), "icon");
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss", "com/ss/android/lark/chat/preview/creator/ChatPreviewComponentCreator$generatePermChangeDialog$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.b.a$g */
    public static final class DialogInterface$OnDismissListenerC34086g implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ ChatPreviewComponentCreator f88115a;

        /* renamed from: b */
        final /* synthetic */ List f88116b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f88117c;

        /* renamed from: d */
        final /* synthetic */ Long f88118d;

        /* renamed from: e */
        final /* synthetic */ List f88119e;

        /* renamed from: f */
        final /* synthetic */ Map f88120f;

        /* renamed from: g */
        final /* synthetic */ SpinButtonProperty f88121g;

        /* renamed from: h */
        final /* synthetic */ SpinButton f88122h;

        DialogInterface$OnDismissListenerC34086g(ChatPreviewComponentCreator aVar, List list, ArrayList arrayList, Long l, List list2, Map map, SpinButtonProperty spinButtonProperty, SpinButton spinButton) {
            this.f88115a = aVar;
            this.f88116b = list;
            this.f88117c = arrayList;
            this.f88118d = l;
            this.f88119e = list2;
            this.f88120f = map;
            this.f88121g = spinButtonProperty;
            this.f88122h = spinButton;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            SpinButton spinButton = this.f88122h;
            if (spinButton != null) {
                spinButton.mo126325a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00040\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J$\u0010\t\u001a\u00020\u00062\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0004H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/chat/preview/creator/ChatPreviewComponentCreator$getUrlPreviewChatterList$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.b.a$h */
    public static final class C34087h implements IGetDataCallback<ArrayList<String>> {

        /* renamed from: a */
        final /* synthetic */ ChatPreviewComponentCreator f88123a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34087h(ChatPreviewComponentCreator aVar) {
            this.f88123a = aVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("TangramCreator", "UrlPreviewChatterList request error:" + errorResult.getDisplayMsg());
        }

        /* renamed from: a */
        public void onSuccess(ArrayList<String> arrayList) {
            ChatPreviewInit.IChatPreviewModuleDependency a;
            if ((this.f88123a.mo126253b() instanceof Activity) && arrayList != null && (a = ChatPreviewInit.f88086a.mo126246a()) != null) {
                a.mo102698a((Activity) this.f88123a.mo126253b(), arrayList);
            }
        }
    }

    /* renamed from: a */
    private final FrameLayoutComponent m132247a(Type type) {
        return new FrameLayoutComponent(new EmptyProperty(type), Style.Companion.mo125774a(), this.f88096c, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/chat/preview/creator/ChatPreviewComponentCreator$createTreeNode$node$2", "Lcom/ss/android/lark/tangram/base/action/Action;", "Lcom/ss/android/lark/chat/preview/components/view/SpinButton;", "onClick", "", "view", "onLongClick", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.b.a$d */
    public static final class C34083d implements Action<SpinButton> {

        /* renamed from: a */
        final /* synthetic */ ChatPreviewComponentCreator f88102a;

        /* renamed from: b */
        final /* synthetic */ SpinButtonProperty f88103b;

        /* renamed from: c */
        final /* synthetic */ Map f88104c;

        /* renamed from: a */
        public void mo126248a(SpinButton spinButton) {
            ChatPreviewInit.IChatPreviewModuleDependency.IActionDependency b;
            this.f88102a.mo126252a(this.f88103b.getSelectedIndex(), this.f88103b.getItems(), this.f88104c, spinButton, this.f88103b);
            ChatPreviewInit.IChatPreviewModuleDependency a = ChatPreviewInit.f88086a.mo126246a();
            if (a != null && (b = a.mo102702b()) != null) {
                b.mo102705a(this.f88102a.mo126255d(), this.f88102a.mo126254c(), "select_item");
            }
        }

        C34083d(ChatPreviewComponentCreator aVar, SpinButtonProperty spinButtonProperty, Map map) {
            this.f88102a = aVar;
            this.f88103b = spinButtonProperty;
            this.f88104c = map;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/chat/preview/creator/ChatPreviewComponentCreator$generatePermChangeDialog$1$2", "Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "onItemClick", "", "index", "", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.b.a$f */
    public static final class C34085f implements UDListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatPreviewComponentCreator f88107a;

        /* renamed from: b */
        final /* synthetic */ List f88108b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f88109c;

        /* renamed from: d */
        final /* synthetic */ Long f88110d;

        /* renamed from: e */
        final /* synthetic */ List f88111e;

        /* renamed from: f */
        final /* synthetic */ Map f88112f;

        /* renamed from: g */
        final /* synthetic */ SpinButtonProperty f88113g;

        /* renamed from: h */
        final /* synthetic */ SpinButton f88114h;

        @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
        public void onItemClick(int i) {
            UrlPreviewAction urlPreviewAction;
            String actionId = ((Item) this.f88111e.get(i)).getActionId();
            if (actionId != null) {
                Map map = this.f88112f;
                if (map != null) {
                    urlPreviewAction = (UrlPreviewAction) map.get(actionId);
                } else {
                    urlPreviewAction = null;
                }
                ActionCreator.m132244a(urlPreviewAction, actionId, (View.OnLongClickListener) null).mo126248a(null);
                this.f88113g.setSelectedIndex(Long.valueOf((long) i));
                SpinButton spinButton = this.f88114h;
                if (spinButton != null) {
                    spinButton.setTextContent(((Item) this.f88111e.get(i)).getText());
                }
            }
        }

        C34085f(ChatPreviewComponentCreator aVar, List list, ArrayList arrayList, Long l, List list2, Map map, SpinButtonProperty spinButtonProperty, SpinButton spinButton) {
            this.f88107a = aVar;
            this.f88108b = list;
            this.f88109c = arrayList;
            this.f88110d = l;
            this.f88111e = list2;
            this.f88112f = map;
            this.f88113g = spinButtonProperty;
            this.f88114h = spinButton;
        }
    }

    /* renamed from: a */
    public IComponent mo126249a(UrlPreviewBody urlPreviewBody) {
        UrlPreviewComponents urlPreviewComponents;
        if (urlPreviewBody == null || (urlPreviewComponents = urlPreviewBody.getUrlPreviewComponents()) == null) {
            return null;
        }
        Map<String, UrlPreviewAction> actions = urlPreviewBody.getActions();
        if (urlPreviewComponents.getRootIds().isEmpty()) {
            return null;
        }
        String str = urlPreviewComponents.getRootIds().get(0);
        ComponentWithDependency<Dependency> a = m132248a(str, urlPreviewComponents.getElements(), actions);
        m132249a(a, str, urlPreviewComponents.getElements(), actions);
        return a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/chat/preview/creator/ChatPreviewComponentCreator$createTreeNode$node$3", "Lcom/ss/android/lark/tangram/base/action/Action;", "Lcom/ss/android/lark/chat/preview/components/view/VideoCoverView;", "onClick", "", "view", "onLongClick", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.b.a$e */
    public static final class C34084e implements Action<VideoCoverView> {

        /* renamed from: a */
        final /* synthetic */ ChatPreviewComponentCreator f88105a;

        /* renamed from: b */
        final /* synthetic */ VideoProperty f88106b;

        /* renamed from: a */
        public void mo126248a(VideoCoverView hVar) {
            ChatPreviewInit.IChatPreviewModuleDependency.IActionDependency b;
            Image image;
            ChatPreviewInit.IChatPreviewModuleDependency a = ChatPreviewInit.f88086a.mo126246a();
            if (a != null) {
                Context b2 = this.f88105a.mo126253b();
                VideoCoverView hVar2 = hVar;
                String srcUrl = this.f88106b.getSrcUrl();
                String iframeUrl = this.f88106b.getIframeUrl();
                String d = this.f88105a.mo126255d();
                String vid = this.f88106b.getVid();
                int value = this.f88106b.getSite().getValue();
                ImageSet coverImage = this.f88106b.getCoverImage();
                if (coverImage != null) {
                    image = coverImage.getOrigin();
                } else {
                    image = null;
                }
                a.mo102699a(b2, hVar2, srcUrl, iframeUrl, d, vid, value, image, this.f88105a.mo126256e());
            }
            ChatPreviewInit.IChatPreviewModuleDependency a2 = ChatPreviewInit.f88086a.mo126246a();
            if (a2 != null && (b = a2.mo102702b()) != null) {
                b.mo102705a(this.f88105a.mo126255d(), this.f88105a.mo126254c(), "play_video");
            }
        }

        C34084e(ChatPreviewComponentCreator aVar, VideoProperty videoProperty) {
            this.f88105a = aVar;
            this.f88106b = videoProperty;
        }
    }

    /* renamed from: a */
    public Render mo126250a(ViewGroup viewGroup, IComponent cVar, int i) {
        IRender a;
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Lazy lazy = LazyKt.lazy(new C34080b(cVar, i));
        Render dVar = (Render) lazy.getValue();
        if (!(dVar == null || (a = dVar.mo188792a(viewGroup)) == null)) {
            a.mo188789a();
        }
        return (Render) lazy.getValue();
    }

    /* renamed from: a */
    private final ComponentWithDependency<Dependency> m132248a(String str, Map<String, UrlPreviewComponent> map, Map<String, UrlPreviewAction> map2) {
        UrlPreviewComponent urlPreviewComponent;
        FrameLayoutComponent cVar;
        PreviewHeaderComponent hVar;
        float f;
        Value scaleHeight;
        Float value;
        Value scaleWidth;
        Float value2;
        float f2;
        Float value3;
        float f3;
        Float value4;
        Float value5;
        float f4;
        Float value6;
        Action aVar = null;
        UrlPreviewAction urlPreviewAction = null;
        Action aVar2 = null;
        UrlPreviewAction urlPreviewAction2 = null;
        Action aVar3 = null;
        UrlPreviewAction urlPreviewAction3 = null;
        if (str == null || (urlPreviewComponent = map.get(str)) == null) {
            return null;
        }
        int i = C34088b.f88124a[urlPreviewComponent.getType().ordinal()];
        float f5 = BitmapDescriptorFactory.HUE_RED;
        switch (i) {
            case 1:
                cVar = m132247a(Type.UNKNOWN);
                break;
            case 2:
                BaseProperty property = urlPreviewComponent.getProperty();
                if (property != null) {
                    cVar = new FrameLayoutComponent((EmptyProperty) property, urlPreviewComponent.getStyle(), this.f88096c, null);
                    break;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.preview.entity.component.property.EmptyProperty");
                }
            case 3:
                BaseProperty property2 = urlPreviewComponent.getProperty();
                if (property2 != null) {
                    cVar = new IGLayoutComponent((IGProperty) property2, urlPreviewComponent.getStyle(), this.f88096c, null);
                    break;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.preview.entity.component.property.IGProperty");
                }
            case 4:
                BaseProperty property3 = urlPreviewComponent.getProperty();
                if (property3 != null) {
                    cVar = new LinearLayoutComponent((LinearLayoutProperty) property3, urlPreviewComponent.getStyle(), this.f88096c);
                    break;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.preview.entity.component.property.LinearLayoutProperty");
                }
            case 5:
                BaseProperty property4 = urlPreviewComponent.getProperty();
                if (property4 != null) {
                    PreviewHeaderProperty previewHeaderProperty = (PreviewHeaderProperty) property4;
                    ComponentWithDependency<Dependency> a = m132248a(previewHeaderProperty.getChildComponentId(), map, map2);
                    if (a instanceof IVirtualNode) {
                        hVar = new PreviewHeaderComponent((IVirtualNode) a, previewHeaderProperty, urlPreviewComponent.getStyle(), this.f88096c, null);
                    } else {
                        hVar = new PreviewHeaderComponent(null, previewHeaderProperty, urlPreviewComponent.getStyle(), this.f88096c, null);
                    }
                    cVar = hVar;
                    break;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.preview.entity.component.property.PreviewHeaderProperty");
                }
            case 6:
                BaseProperty property5 = urlPreviewComponent.getProperty();
                if (property5 != null) {
                    cVar = new RichTextComponent((RichTextProperty) property5, urlPreviewComponent.getStyle(), this.f88096c, null);
                    break;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.preview.entity.component.property.RichTextProperty");
                }
            case 7:
                BaseProperty property6 = urlPreviewComponent.getProperty();
                if (property6 != null) {
                    cVar = new ImageViewComponent((ImageProperty) property6, urlPreviewComponent.getStyle(), this.f88096c, null);
                    break;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.preview.entity.component.property.ImageProperty");
                }
            case 8:
                BaseProperty property7 = urlPreviewComponent.getProperty();
                if (property7 != null) {
                    cVar = new ChattersPreviewComponent((ChattersPreviewProperty) property7, urlPreviewComponent.getStyle(), this.f88096c, new C34082c(this));
                    break;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.preview.entity.component.property.ChattersPreviewProperty");
                }
            case 9:
                BaseProperty property8 = urlPreviewComponent.getProperty();
                if (property8 != null) {
                    ButtonProperty buttonProperty = (ButtonProperty) property8;
                    String actionId = buttonProperty.getActionId();
                    if (actionId != null) {
                        if (map2 != null) {
                            urlPreviewAction3 = map2.get(actionId);
                        }
                        aVar = ActionCreator.m132244a(urlPreviewAction3, actionId, this.f88095a);
                    }
                    cVar = new UDButtonComponent(Integer.valueOf(UIHelper.dp2px(16.0f)), Integer.valueOf(UIHelper.dp2px(11.0f)), buttonProperty, urlPreviewComponent.getStyle(), this.f88096c, aVar);
                    break;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.preview.entity.component.property.ButtonProperty");
                }
            case 10:
            case 11:
                BaseProperty property9 = urlPreviewComponent.getProperty();
                if (property9 != null) {
                    ButtonProperty buttonProperty2 = (ButtonProperty) property9;
                    String actionId2 = buttonProperty2.getActionId();
                    if (actionId2 != null) {
                        if (map2 != null) {
                            urlPreviewAction2 = map2.get(actionId2);
                        }
                        aVar3 = ActionCreator.m132244a(urlPreviewAction2, actionId2, this.f88095a);
                    }
                    Style style = urlPreviewComponent.getStyle();
                    if (style != null) {
                        ValueType valueType = ValueType.POINT;
                        float multiplier = LKUIDisplayManager.m91870a().getMultiplier();
                        Value width = style.getWidth();
                        if (width == null || (value4 = width.getValue()) == null) {
                            f3 = BitmapDescriptorFactory.HUE_RED;
                        } else {
                            f3 = value4.floatValue();
                        }
                        style.setScaleWidth(new Value(valueType, Float.valueOf(multiplier * f3)));
                    }
                    if (style != null) {
                        ValueType valueType2 = ValueType.POINT;
                        float multiplier2 = LKUIDisplayManager.m91870a().getMultiplier();
                        Value height = style.getHeight();
                        if (height == null || (value3 = height.getValue()) == null) {
                            f2 = BitmapDescriptorFactory.HUE_RED;
                        } else {
                            f2 = value3.floatValue();
                        }
                        style.setScaleHeight(new Value(valueType2, Float.valueOf(multiplier2 * f2)));
                    }
                    if (style == null || (scaleWidth = style.getScaleWidth()) == null || (value2 = scaleWidth.getValue()) == null) {
                        f = BitmapDescriptorFactory.HUE_RED;
                    } else {
                        f = value2.floatValue();
                    }
                    Integer valueOf = Integer.valueOf(UIHelper.dp2px(f));
                    if (!(style == null || (scaleHeight = style.getScaleHeight()) == null || (value = scaleHeight.getValue()) == null)) {
                        f5 = value.floatValue();
                    }
                    cVar = new UDButtonComponent(valueOf, Integer.valueOf(UIHelper.dp2px(f5)), buttonProperty2, style, this.f88096c, aVar3);
                    break;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.preview.entity.component.property.ButtonProperty");
                }
            case HwBuildEx.VersionCodes.EMUI_5_1:
                BaseProperty property10 = urlPreviewComponent.getProperty();
                if (property10 != null) {
                    TimeProperty timeProperty = (TimeProperty) property10;
                    String ntpActionId = timeProperty.getNtpActionId();
                    if (ntpActionId != null) {
                        if (map2 != null) {
                            urlPreviewAction = map2.get(ntpActionId);
                        }
                        aVar2 = ActionCreator.m132244a(urlPreviewAction, ntpActionId, this.f88095a);
                    }
                    cVar = new TimingComponent(timeProperty, urlPreviewComponent.getStyle(), this.f88096c, aVar2);
                    break;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.preview.entity.component.property.TimeProperty");
                }
            case 13:
                BaseProperty property11 = urlPreviewComponent.getProperty();
                if (property11 != null) {
                    cVar = new TextViewComponent((TextViewProperty) property11, urlPreviewComponent.getStyle(), this.f88096c, null);
                    break;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.preview.entity.component.property.TextViewProperty");
                }
            case 14:
                BaseProperty property12 = urlPreviewComponent.getProperty();
                if (property12 != null) {
                    cVar = new TagListComponent((TagListProperty) property12, urlPreviewComponent.getStyle(), this.f88096c, null);
                    break;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.preview.entity.component.property.TagListProperty");
                }
            case 15:
                BaseProperty property13 = urlPreviewComponent.getProperty();
                if (property13 != null) {
                    SpinButtonProperty spinButtonProperty = (SpinButtonProperty) property13;
                    cVar = new SpinButtonComponent(spinButtonProperty, urlPreviewComponent.getStyle(), this.f88096c, new C34083d(this, spinButtonProperty, map2));
                    break;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.preview.entity.component.property.SpinButtonProperty");
                }
            case 16:
                BaseProperty property14 = urlPreviewComponent.getProperty();
                if (property14 != null) {
                    AvatarProperty avatarProperty = (AvatarProperty) property14;
                    Style style2 = urlPreviewComponent.getStyle();
                    if (style2 != null) {
                        ValueType valueType3 = ValueType.POINT;
                        float multiplier3 = LKUIDisplayManager.m91870a().getMultiplier();
                        Value width2 = style2.getWidth();
                        if (width2 == null || (value6 = width2.getValue()) == null) {
                            f4 = BitmapDescriptorFactory.HUE_RED;
                        } else {
                            f4 = value6.floatValue();
                        }
                        style2.setScaleWidth(new Value(valueType3, Float.valueOf(multiplier3 * f4)));
                    }
                    if (style2 != null) {
                        ValueType valueType4 = ValueType.POINT;
                        float multiplier4 = LKUIDisplayManager.m91870a().getMultiplier();
                        Value height2 = style2.getHeight();
                        if (!(height2 == null || (value5 = height2.getValue()) == null)) {
                            f5 = value5.floatValue();
                        }
                        style2.setScaleHeight(new Value(valueType4, Float.valueOf(multiplier4 * f5)));
                    }
                    cVar = new AvatarComponent(avatarProperty, urlPreviewComponent.getStyle(), this.f88096c, null);
                    break;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.preview.entity.component.property.AvatarProperty");
                }
                break;
            case 17:
                BaseProperty property15 = urlPreviewComponent.getProperty();
                if (property15 != null) {
                    VideoProperty videoProperty = (VideoProperty) property15;
                    cVar = new VideoComponent(videoProperty, urlPreviewComponent.getStyle(), this.f88096c, new C34084e(this, videoProperty));
                    break;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.preview.entity.component.property.VideoProperty");
                }
            default:
                throw new NoWhenBranchMatchedException();
        }
        return cVar;
    }

    /* renamed from: a */
    private final void m132249a(ComponentWithDependency<Dependency> aVar, String str, Map<String, UrlPreviewComponent> map, Map<String, UrlPreviewAction> map2) {
        List<String> childIds;
        UrlPreviewComponent urlPreviewComponent = map.get(str);
        if (!(urlPreviewComponent == null || (childIds = urlPreviewComponent.getChildIds()) == null)) {
            for (T t : childIds) {
                ComponentWithDependency<Dependency> a = m132248a(t, map, map2);
                if (a != null) {
                    if (aVar instanceof RenderComponent) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(a);
                        ((RenderComponent) aVar).mo188737b(arrayList);
                    } else if (aVar instanceof LayoutComponent) {
                        ((LayoutComponent) aVar).mo188734a(a);
                    }
                    m132249a(a, t, map, map2);
                }
            }
        }
    }

    public ChatPreviewComponentCreator(Context context, String str, String str2, boolean z, View.OnLongClickListener onLongClickListener) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f88097d = context;
        this.f88098e = str;
        this.f88099f = str2;
        this.f88100g = z;
        this.f88095a = onLongClickListener;
        this.f88096c = new Dependency(context);
    }

    /* renamed from: a */
    public final void mo126252a(Long l, List<Item> list, Map<String, UrlPreviewAction> map, SpinButton spinButton, SpinButtonProperty spinButtonProperty) {
        ArrayList<String> arrayList;
        int i;
        if (list != null) {
            List<Item> list2 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().getText());
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        ArrayList arrayList3 = new ArrayList();
        if (arrayList != null) {
            for (String str : arrayList) {
                if (str != null) {
                    arrayList3.add(str);
                }
            }
            UDActionPanelBuilder aVar = (UDActionPanelBuilder) new UDActionPanelBuilder(this.f88096c.mo188743a()).mo90870a(arrayList3);
            Context a = this.f88096c.mo188743a();
            if (l != null) {
                i = (int) l.longValue();
            } else {
                i = 0;
            }
            String string = this.f88096c.mo188743a().getString(R.string.Lark_Legacy_Cancel);
            Intrinsics.checkExpressionValueIsNotNull(string, "dependency.context.getSt…tring.Lark_Legacy_Cancel)");
            ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) aVar.mo90868a(new UDListDialogAdapter(a, i))).mo90869a(new C34085f(this, arrayList, arrayList3, l, list, map, spinButtonProperty, spinButton))).addActionButton(R.id.ud_dialog_btn_cancel, string, (DialogInterface.OnClickListener) null)).onDismissListener(new DialogInterface$OnDismissListenerC34086g(this, arrayList, arrayList3, l, list, map, spinButtonProperty, spinButton))).show();
        }
    }
}
