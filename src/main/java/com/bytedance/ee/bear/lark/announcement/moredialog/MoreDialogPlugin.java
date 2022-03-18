package com.bytedance.ee.bear.lark.announcement.moredialog;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.lark.announcement.moredialog.MoreDialogModel;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13747j;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.p2905b.C57810a;
import com.ss.android.lark.utils.p2905b.C57811b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0018\u00010\tR\u00020\u0000X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/lark/announcement/moredialog/MoreDialogPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "()V", "dividerList", "", "Landroid/view/View;", "moreDialog", "Landroid/app/Dialog;", "showMoreDialogHandler", "Lcom/bytedance/ee/bear/lark/announcement/moredialog/MoreDialogPlugin$ShowMoreDialogHandler;", "createItem", "iconRes", "", "item", "Lcom/bytedance/ee/bear/lark/announcement/moredialog/MoreDialogModel$MoreDialogItem;", "dismissDialog", "", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "onDetachFromUIContainer", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "showMoreDialog", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ee/bear/lark/announcement/moredialog/MoreDialogModel;", "Companion", "ShowMoreDialogHandler", "lark-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class MoreDialogPlugin extends DocumentPlugin {
    public static final Companion Companion = new Companion(null);
    public static final Map<String, Integer> moreDialogItemConfigs = MapsKt.hashMapOf(new Pair("PUBLISH_ANNOUNCEMENT", Integer.valueOf((int) R.drawable.icon_announce_outlined_nor)), new Pair("HISTORY_RECORD", Integer.valueOf((int) R.drawable.ud_icon_history_outlined)));
    private final List<View> dividerList = new ArrayList();
    private Dialog moreDialog;
    public ShowMoreDialogHandler showMoreDialogHandler;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/lark/announcement/moredialog/MoreDialogPlugin$Companion;", "", "()V", "BIZ_NAVIGATION_SHOW_MORE_DIALOG", "", "HISTORY_RECORD", "POP_WINDOW_MARGIN_RIGHT_IN_DP", "", "POP_WINDOW_MARGIN_TOP_IN_DP", "PUBLISH_ANNOUNCEMENT", "TAG", "moreDialogItemConfigs", "", "", "getMoreDialogItemConfigs", "()Ljava/util/Map;", "lark-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lark.announcement.moredialog.MoreDialogPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void dismissDialog() {
        Dialog dialog = this.moreDialog;
        if (dialog != null && dialog.isShowing()) {
            Dialog dialog2 = this.moreDialog;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            this.moreDialog = null;
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/lark/announcement/moredialog/MoreDialogPlugin$ShowMoreDialogHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/lark/announcement/moredialog/MoreDialogModel;", "(Lcom/bytedance/ee/bear/lark/announcement/moredialog/MoreDialogPlugin;)V", "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onClickItem", "id", "", "lark-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lark.announcement.moredialog.MoreDialogPlugin$b */
    public final class ShowMoreDialogHandler implements AbstractC7945d<MoreDialogModel> {

        /* renamed from: b */
        private AbstractC7947h f21452b;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ShowMoreDialogHandler() {
        }

        /* renamed from: a */
        public final void mo30957a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            C13479a.m54764b("MoreDialogPlugin", "onClickMoreDialogItem: " + str);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((Object) "id", (Object) str);
            AbstractC7947h hVar = this.f21452b;
            if (hVar != null) {
                hVar.mo17188a(jSONObject);
            }
        }

        /* renamed from: a */
        public void handle(MoreDialogModel moreDialogModel, AbstractC7947h hVar) {
            C13479a.m54764b("MoreDialogPlugin", "Show more dialog.");
            if (moreDialogModel != null) {
                this.f21452b = hVar;
                MoreDialogPlugin.this.showMoreDialog(moreDialogModel);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/lark/announcement/moredialog/MoreDialogPlugin$createItem$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "lark-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lark.announcement.moredialog.MoreDialogPlugin$c */
    public static final class C7982c extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ MoreDialogPlugin f21453a;

        /* renamed from: b */
        final /* synthetic */ MoreDialogModel.MoreDialogItem f21454b;

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            ShowMoreDialogHandler bVar = this.f21453a.showMoreDialogHandler;
            if (bVar != null) {
                String id = this.f21454b.getId();
                Intrinsics.checkExpressionValueIsNotNull(id, "item.id");
                bVar.mo30957a(id);
            }
            this.f21453a.dismissDialog();
        }

        C7982c(MoreDialogPlugin moreDialogPlugin, MoreDialogModel.MoreDialogItem moreDialogItem) {
            this.f21453a = moreDialogPlugin;
            this.f21454b = moreDialogItem;
        }
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        ShowMoreDialogHandler bVar = new ShowMoreDialogHandler();
        this.showMoreDialogHandler = bVar;
        bindBridgeHandler("biz.navigation.showMoreDialog", bVar);
    }

    public final void showMoreDialog(MoreDialogModel moreDialogModel) {
        dismissDialog();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.more_popup_dialog_content_container, (ViewGroup) null);
        if (inflate != null) {
            LinearLayout linearLayout = (LinearLayout) inflate;
            int size = moreDialogModel.getItems().size() - 1;
            List<MoreDialogModel.MoreDialogItem> items = moreDialogModel.getItems();
            Intrinsics.checkExpressionValueIsNotNull(items, "data.items");
            int i = 0;
            for (T t : items) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                T t2 = t;
                Map<String, Integer> map = moreDialogItemConfigs;
                Intrinsics.checkExpressionValueIsNotNull(t2, "item");
                Integer num = map.get(t2.getId());
                if (num != null) {
                    View createItem = createItem(num.intValue(), t2);
                    View findViewById = createItem.findViewById(R.id.more_dialog_item_divider);
                    if (i == size) {
                        Intrinsics.checkExpressionValueIsNotNull(findViewById, "divider");
                        findViewById.setVisibility(8);
                    }
                    List<View> list = this.dividerList;
                    Intrinsics.checkExpressionValueIsNotNull(findViewById, "divider");
                    list.add(findViewById);
                    linearLayout.addView(createItem);
                }
                i = i2;
            }
            linearLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredWidth = linearLayout.getMeasuredWidth();
            for (T t3 : this.dividerList) {
                ViewGroup.LayoutParams layoutParams = t3.getLayoutParams();
                layoutParams.width = measuredWidth;
                t3.setLayoutParams(layoutParams);
            }
            this.moreDialog = C57811b.m224342a(getContext(), (View) linearLayout, (int) R.style.customDialog, true);
            C57810a.m224337a(getContext(), this.moreDialog, new float[]{12.0f, 49.0f});
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        dismissDialog();
    }

    private final View createItem(int i, MoreDialogModel.MoreDialogItem moreDialogItem) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.more_popup_dialog_content_item, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
        inflate.setTag(moreDialogItem.getId());
        ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_more_dialog_item_icon);
        imageView.setImageResource(i);
        C13747j.m55728a(imageView, (int) R.color.icon_n1);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_more_dialog_item_text);
        Intrinsics.checkExpressionValueIsNotNull(textView, "textView");
        textView.setText(moreDialogItem.getText());
        inflate.setEnabled(moreDialogItem.isEnable());
        inflate.setOnClickListener(new C7982c(this, moreDialogItem));
        return inflate;
    }
}
