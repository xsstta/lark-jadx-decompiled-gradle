package com.ss.android.lark.guide.ui.component.dialog;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.suite.R;
import com.ss.android.lark.guide.ui.config.ButtonConfig;
import com.ss.android.lark.guide.ui.config.GuideDelegate;
import com.ss.android.lark.guide.ui.config.ImageDialogConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\u0012\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0014J\u0006\u0010\u0014\u001a\u00020\u000eJ\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/guide/ui/component/dialog/ImageDialog;", "Lcom/larksuite/component/ui/dialog/LKUIDialogBuilder$LifecycleCallback;", "Lcom/larksuite/component/ui/dialog/LKUIDialog;", "activity", "Landroid/app/Activity;", "config", "Lcom/ss/android/lark/guide/ui/config/ImageDialogConfig;", "(Landroid/app/Activity;Lcom/ss/android/lark/guide/ui/config/ImageDialogConfig;)V", "uiDialog", "getUiDialog", "()Lcom/larksuite/component/ui/dialog/LKUIDialog;", "setUiDialog", "(Lcom/larksuite/component/ui/dialog/LKUIDialog;)V", "initViews", "", "rootView", "Landroid/view/View;", "internalStart", "onCreated", "dialog", "start", "start2", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.guide.ui.a.b.a */
public final class ImageDialog extends C25639g.AbstractC25641b<DialogC25637f> {

    /* renamed from: a */
    public final ImageDialogConfig f99421a;

    /* renamed from: b */
    private DialogC25637f f99422b;

    /* renamed from: c */
    private final Activity f99423c;

    /* renamed from: a */
    public final DialogC25637f mo141669a() {
        return this.f99422b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/guide/ui/component/dialog/ImageDialog$start2$1", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "close", "", "isShow", "", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.guide.ui.a.b.a$c */
    public static final class C38687c implements GuideDelegate {

        /* renamed from: a */
        final /* synthetic */ DialogC25637f f99427a;

        @Override // com.ss.android.lark.guide.ui.config.GuideDelegate
        /* renamed from: a */
        public boolean mo141658a() {
            return this.f99427a.isShowing();
        }

        @Override // com.ss.android.lark.guide.ui.config.GuideDelegate
        /* renamed from: b */
        public void mo141659b() {
            this.f99427a.dismiss();
        }

        C38687c(DialogC25637f fVar) {
            this.f99427a = fVar;
        }
    }

    /* renamed from: b */
    public final GuideDelegate mo141670b() {
        return new C38687c(m152676c());
    }

    /* renamed from: c */
    private final DialogC25637f m152676c() {
        DialogC25637f c = new C25639g(this.f99423c).mo89260s(R.layout.guide_ui_image_dialog).mo89230a(this).mo89227a(this.f99421a.mo141777a()).mo89239c();
        Intrinsics.checkExpressionValueIsNotNull(c, "LKUIDialogBuilder<LKUIDi…ener)\n            .show()");
        return c;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.guide.ui.a.b.a$b */
    public static final class View$OnClickListenerC38686b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageDialog f99426a;

        View$OnClickListenerC38686b(ImageDialog aVar) {
            this.f99426a = aVar;
        }

        public final void onClick(View view) {
            DialogC25637f a = this.f99426a.mo141669a();
            if (a != null) {
                a.dismiss();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/guide/ui/component/dialog/ImageDialog$initViews$5$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.guide.ui.a.b.a$a */
    public static final class View$OnClickListenerC38684a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageDialog f99424a;

        View$OnClickListenerC38684a(ImageDialog aVar) {
            this.f99424a = aVar;
        }

        public final void onClick(View view) {
            ButtonConfig.ButtonAction b = this.f99424a.f99421a.mo141782e().mo141769b();
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            b.onClick(view, new GuideDelegate(this) {
                /* class com.ss.android.lark.guide.ui.component.dialog.ImageDialog.View$OnClickListenerC38684a.C386851 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC38684a f99425a;

                @Override // com.ss.android.lark.guide.ui.config.GuideDelegate
                /* renamed from: b */
                public void mo141659b() {
                    DialogC25637f a = this.f99425a.f99424a.mo141669a();
                    if (a != null) {
                        a.dismiss();
                    }
                }

                @Override // com.ss.android.lark.guide.ui.config.GuideDelegate
                /* renamed from: a */
                public boolean mo141658a() {
                    DialogC25637f a = this.f99425a.f99424a.mo141669a();
                    if (a != null) {
                        return a.isShowing();
                    }
                    return false;
                }

                {
                    this.f99425a = r1;
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.ui.dialog.C25639g.AbstractC25641b
    /* renamed from: b */
    public void mo89274b(DialogC25637f fVar) {
        if (fVar != null && fVar.getWindow() != null) {
            this.f99422b = fVar;
            View b = fVar.mo89219b();
            Intrinsics.checkExpressionValueIsNotNull(b, "dialog.contentView");
            m152675a(b);
        }
    }

    /* renamed from: a */
    private final void m152675a(View view) {
        boolean z;
        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        if (imageView != null) {
            imageView.setImageDrawable(this.f99421a.mo141779b());
        }
        ImageView imageView2 = (ImageView) view.findViewById(R.id.close);
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View$OnClickListenerC38686b(this));
        }
        TextView textView = (TextView) view.findViewById(R.id.title);
        String str = null;
        boolean z2 = true;
        if (textView != null) {
            String c = this.f99421a.mo141780c();
            if (c != null) {
                if (c.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    c = null;
                }
                if (c != null) {
                    textView.setText(c);
                }
            }
            textView.setVisibility(8);
        }
        TextView textView2 = (TextView) view.findViewById(R.id.detail);
        if (textView2 != null) {
            String d = this.f99421a.mo141781d();
            if (d != null) {
                if (d.length() <= 0) {
                    z2 = false;
                }
                if (z2) {
                    str = d;
                }
                if (str != null) {
                    textView2.setText(str);
                }
            }
            textView2.setVisibility(8);
        }
        TextView textView3 = (TextView) view.findViewById(R.id.button);
        if (textView3 != null) {
            textView3.setText(this.f99421a.mo141782e().mo141768a());
            textView3.setOnClickListener(new View$OnClickListenerC38684a(this));
        }
    }

    public ImageDialog(Activity activity, ImageDialogConfig iVar) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(iVar, "config");
        this.f99423c = activity;
        this.f99421a = iVar;
    }
}
