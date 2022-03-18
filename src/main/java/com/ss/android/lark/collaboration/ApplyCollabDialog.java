package com.ss.android.lark.collaboration;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.contact.IInitBuilder;
import com.ss.android.lark.collaboration.applydetail.mvp.C35348c;
import com.ss.android.lark.collaboration.p1730a.AbstractC35340a;
import com.ss.android.lark.collaboration.statics.CollaborationHitPoint;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.base.EmojiconEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\"B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u001b\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\fH\u0016J\u0018\u0010\n\u001a\u00020\u00002\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001cH\u0016J\u0012\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\u0016\u0010\u0018\u001a\u00020\u00002\f\u0010\u0018\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\bH\u0016J\u0017\u0010 \u001a\u00020\b*\u0004\u0018\u00010\b2\u0006\u0010!\u001a\u00020\bH\u0004R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/lark/collaboration/ApplyCollabDialog;", "Lcom/ss/android/lark/biz/core/api/contact/IInitBuilder$IApplyCollabDialogBuilder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "callback", "Lcom/ss/android/lark/biz/core/api/contact/IInitBuilder$IDialogBuilder$IDialogCallback;", "cancelText", "", "confirmText", "contactList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/contact/entity/Contact;", "Lkotlin/collections/ArrayList;", "contactSource", "Lcom/ss/android/lark/biz/core/api/ContactSource;", "content", "getContext", "()Landroid/content/Context;", "fromTag", "requestCode", "", "single", "", "sourceFragment", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "title", "contact", "", "jumpToProfileAdd", "", "show", "or", "default", "ViewHolder", "core_contact_contact-collaboration_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.collaboration.a */
public final class ApplyCollabDialog implements IInitBuilder.IApplyCollabDialogBuilder {

    /* renamed from: a */
    public ContactSource f91340a;

    /* renamed from: b */
    public String f91341b = "";

    /* renamed from: c */
    public IInitBuilder.IDialogBuilder.IDialogCallback f91342c;

    /* renamed from: d */
    public boolean f91343d;

    /* renamed from: e */
    public C36516a<?> f91344e;

    /* renamed from: f */
    private String f91345f;

    /* renamed from: g */
    private String f91346g;

    /* renamed from: h */
    private String f91347h;

    /* renamed from: i */
    private String f91348i;

    /* renamed from: j */
    private int f91349j;

    /* renamed from: k */
    private final ArrayList<Contact> f91350k = new ArrayList<>();

    /* renamed from: l */
    private final Context f91351l;

    /* renamed from: a */
    public final String mo130043a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str2, "default");
        return str != null ? str : str2;
    }

    /* renamed from: b */
    public final void mo130051b() {
        int i;
        int i2;
        ContactSource contactSource = this.f91340a;
        if (contactSource != null) {
            i = contactSource.getSourceType();
        } else {
            i = 2;
        }
        if (i == 0) {
            i2 = 2;
        } else {
            i2 = i;
        }
        AbstractC35340a b = ContactCollaborationModule.f91399b.mo130104b();
        if (b != null) {
            b.mo130064a(this.f91351l, this.f91350k.get(0), this.f91341b, i2, this.f91349j, this.f91344e);
        }
    }

    /* renamed from: a */
    public void mo130044a() {
        boolean z;
        if (this.f91350k.isEmpty()) {
            Log.m165379d("ApplyCollabUtils", "contact list is empty");
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) null;
        if (this.f91350k.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f91343d = z;
        C25639g gVar = new C25639g(this.f91351l);
        gVar.mo89249h(17);
        gVar.mo89238b(true);
        gVar.mo89237b(this.f91345f);
        if (this.f91343d) {
            gVar.mo89242c(mo130043a(this.f91346g, this.f91345f));
        } else {
            View inflate = LayoutInflater.from(this.f91351l).inflate(R.layout.dialog_apply_collab_contact_layout, (ViewGroup) null);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "customView");
            T t = (T) new ViewHolder(this, inflate);
            ArrayList<Contact> arrayList = this.f91350k;
            String str = this.f91346g;
            if (str == null) {
                str = "";
            }
            t.mo130057a(arrayList, str);
            objectRef.element = t;
            gVar.mo89236b(inflate);
        }
        gVar.mo89245d(0.3f);
        gVar.mo89247e(false);
        gVar.mo89225a(R.id.lkui_dialog_btn_left, this.f91348i, new DialogInterface$OnClickListenerC35337b(this, objectRef));
        C25639g.C25640a aVar = new C25639g.C25640a();
        aVar.mo89266a(R.id.lkui_dialog_btn_right);
        aVar.mo89271d(R.color.lkui_B500);
        aVar.mo89268a(this.f91347h);
        aVar.mo89267a(new DialogInterface$OnClickListenerC35338c(this, objectRef));
        gVar.mo89229a(aVar);
        gVar.mo89227a(new DialogInterface$OnDismissListenerC35339d(this, objectRef));
        gVar.mo89239c();
        CollaborationHitPoint.f91388a.mo130089a(this.f91350k.size(), this.f91341b);
    }

    /* renamed from: e */
    public ApplyCollabDialog mo105552a(String str) {
        ApplyCollabDialog aVar = this;
        if (str != null) {
            aVar.f91345f = str;
        }
        return aVar;
    }

    /* renamed from: f */
    public ApplyCollabDialog mo105553b(String str) {
        ApplyCollabDialog aVar = this;
        if (str != null) {
            aVar.f91346g = str;
        }
        return aVar;
    }

    /* renamed from: g */
    public ApplyCollabDialog mo105554c(String str) {
        ApplyCollabDialog aVar = this;
        if (str != null) {
            aVar.f91348i = str;
        }
        return aVar;
    }

    /* renamed from: h */
    public ApplyCollabDialog mo105555d(String str) {
        ApplyCollabDialog aVar = this;
        if (str != null) {
            aVar.f91341b = str;
        }
        return aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J!\u0010\u0015\u001a\u0002H\u0016\"\b\b\u0000\u0010\u0016*\u00020\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u0018H\u0002¢\u0006\u0002\u0010\u0019J\"\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!J!\u0010\"\u001a\u00020\u001b2\u0012\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030$\"\u00020\u0003H\u0002¢\u0006\u0002\u0010%J&\u0010&\u001a\u00020\u001b2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0'j\b\u0012\u0004\u0012\u00020\f`(2\u0006\u0010)\u001a\u00020\u001dR\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ss/android/lark/collaboration/ApplyCollabDialog$ViewHolder;", "", "itemView", "Landroid/view/View;", "(Lcom/ss/android/lark/collaboration/ApplyCollabDialog;Landroid/view/View;)V", "applyCommentET", "Lcom/ss/android/lark/widget/linked_emojicon/base/EmojiconEditText;", "applyContactListArea", "applyDescTV", "Landroid/widget/TextView;", "contactList", "", "Lcom/ss/android/lark/contact/entity/Contact;", "contactListAdapter", "Lcom/ss/android/lark/collaboration/applydetail/mvp/ContactListAdapter;", "contactListArrowIV", "Landroid/widget/ImageView;", "contactListRV", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "bind", "T", "id", "", "(I)Landroid/view/View;", "doAction", "", "fromTag", "", "contactSource", "Lcom/ss/android/lark/biz/core/api/ContactSource;", "callback", "Lcom/ss/android/lark/biz/core/api/contact/IInitBuilder$IDialogBuilder$IDialogCallback;", "hide", "views", "", "([Landroid/view/View;)V", "initViews", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "content", "core_contact_contact-collaboration_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.collaboration.a$a */
    public final class ViewHolder {

        /* renamed from: a */
        public Context f91352a;

        /* renamed from: b */
        final /* synthetic */ ApplyCollabDialog f91353b;

        /* renamed from: c */
        private List<? extends Contact> f91354c;

        /* renamed from: d */
        private TextView f91355d = ((TextView) m138079a(R.id.apply_desc));

        /* renamed from: e */
        private RecyclerView f91356e = ((RecyclerView) m138079a(R.id.apply_contact_list));

        /* renamed from: f */
        private ImageView f91357f = ((ImageView) m138079a(R.id.apply_contact_list_arrow));

        /* renamed from: g */
        private EmojiconEditText f91358g = ((EmojiconEditText) m138079a(R.id.apply_comment));

        /* renamed from: h */
        private View f91359h = m138079a(R.id.apply_contact_list_area);

        /* renamed from: i */
        private C35348c f91360i;

        /* renamed from: j */
        private View f91361j;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/collaboration/ApplyCollabDialog$ViewHolder$doAction$2", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "core_contact_contact-collaboration_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.collaboration.a$a$a */
        public static final class C35335a implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ IInitBuilder.IDialogBuilder.IDialogCallback f91362a;

            /* renamed from: b */
            final /* synthetic */ String f91363b;

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                IInitBuilder.IDialogBuilder.IDialogCallback aVar = this.f91362a;
                if (aVar != null) {
                    aVar.mo105557a(true, this.f91363b);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                IInitBuilder.IDialogBuilder.IDialogCallback aVar = this.f91362a;
                if (aVar != null) {
                    aVar.mo105557a(false, this.f91363b);
                }
            }

            C35335a(IInitBuilder.IDialogBuilder.IDialogCallback aVar, String str) {
                this.f91362a = aVar;
                this.f91363b = str;
            }
        }

        /* renamed from: a */
        private final <T extends View> T m138079a(int i) {
            T t = (T) this.f91361j.findViewById(i);
            Intrinsics.checkExpressionValueIsNotNull(t, "itemView.findViewById(id)");
            return t;
        }

        /* renamed from: a */
        private final void m138080a(View... viewArr) {
            for (View view : viewArr) {
                view.setVisibility(8);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.collaboration.a$a$b */
        public static final class View$OnClickListenerC35336b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ ViewHolder f91364a;

            /* renamed from: b */
            final /* synthetic */ ArrayList f91365b;

            View$OnClickListenerC35336b(ViewHolder aVar, ArrayList arrayList) {
                this.f91364a = aVar;
                this.f91365b = arrayList;
            }

            public final void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("extra_key_contact_list", this.f91365b);
                Context context = this.f91364a.f91352a;
                if (context != null) {
                    C35355b.m138122a((Activity) context, this.f91364a.f91353b.f91344e, bundle, 1);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }
        }

        public ViewHolder(ApplyCollabDialog aVar, View view) {
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f91353b = aVar;
            this.f91361j = view;
            Context context = this.f91361j.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
            this.f91352a = context;
        }

        /* renamed from: a */
        public final void mo130057a(ArrayList<Contact> arrayList, String str) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(arrayList, "contactList");
            Intrinsics.checkParameterIsNotNull(str, "content");
            this.f91354c = arrayList;
            if (arrayList.size() == 1) {
                z = true;
            } else {
                z = false;
            }
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                this.f91355d.setText(str2);
            } else if (z) {
                TextView textView = this.f91355d;
                Contact contact = arrayList.get(0);
                Intrinsics.checkExpressionValueIsNotNull(contact, "contactList[0]");
                textView.setText(UIHelper.mustacheFormat((int) R.string.Lark_NewContacts_NeedToAddToContactstGroupOneDialogContent, "Name", contact.mo130408c()));
            }
            if (z) {
                m138080a(this.f91357f, this.f91356e, this.f91359h, this.f91358g);
                return;
            }
            this.f91357f.setOnClickListener(new View$OnClickListenerC35336b(this, arrayList));
            C35348c cVar = new C35348c(this.f91352a, R.layout.apply_collab_contact_item_layout);
            this.f91360i = cVar;
            this.f91356e.setAdapter(cVar);
            this.f91356e.setLayoutManager(new LinearLayoutManager(this.f91352a, 0, false));
            C35348c cVar2 = this.f91360i;
            if (cVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contactListAdapter");
            }
            cVar2.resetAll(arrayList);
        }

        /* renamed from: a */
        public final void mo130056a(String str, ContactSource contactSource, IInitBuilder.IDialogBuilder.IDialogCallback aVar) {
            String str2;
            Intrinsics.checkParameterIsNotNull(str, "fromTag");
            KeyboardUtils.hideKeyboard(this.f91352a, this.f91358g);
            Editable text = this.f91358g.getText();
            if (text == null || (str2 = text.toString()) == null) {
                str2 = "";
            }
            CollaborationHitPoint.Companion aVar2 = CollaborationHitPoint.f91388a;
            List<? extends Contact> list = this.f91354c;
            if (list == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contactList");
            }
            aVar2.mo130091a(list, str);
            AbstractC35340a b = ContactCollaborationModule.f91399b.mo130104b();
            if (b != null) {
                List<? extends Contact> list2 = this.f91354c;
                if (list2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("contactList");
                }
                List<? extends Contact> list3 = list2;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().mo130406a());
                }
                b.mo130065a(arrayList, str2, contactSource, new C35335a(aVar, str2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss", "com/ss/android/lark/collaboration/ApplyCollabDialog$show$1$4"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.collaboration.a$d */
    public static final class DialogInterface$OnDismissListenerC35339d implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ ApplyCollabDialog f91370a;

        /* renamed from: b */
        final /* synthetic */ Ref.ObjectRef f91371b;

        DialogInterface$OnDismissListenerC35339d(ApplyCollabDialog aVar, Ref.ObjectRef objectRef) {
            this.f91370a = aVar;
            this.f91371b = objectRef;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            IInitBuilder.IDialogBuilder.IDialogCallback aVar = this.f91370a.f91342c;
            if (aVar != null) {
                aVar.mo105558b();
            }
        }
    }

    /* renamed from: b */
    public ApplyCollabDialog mo105546a(int i) {
        ApplyCollabDialog aVar = this;
        aVar.f91349j = i;
        return aVar;
    }

    /* renamed from: b */
    public ApplyCollabDialog mo105547a(ContactSource contactSource) {
        ApplyCollabDialog aVar = this;
        if (contactSource != null) {
            aVar.f91340a = contactSource;
        }
        return aVar;
    }

    public ApplyCollabDialog(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f91351l = context;
        String string = UIHelper.getString(R.string.Lark_NewContacts_NeedToAddToContactsDialogTitle);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(\n    …AddToContactsDialogTitle)");
        this.f91345f = string;
        String string2 = UIHelper.getString(R.string.Lark_Legacy_Add);
        Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(\n    …  string.Lark_Legacy_Add)");
        this.f91347h = string2;
        String string3 = UIHelper.getString(R.string.Lark_Legacy_Cancel);
        Intrinsics.checkExpressionValueIsNotNull(string3, "UIHelper.getString(\n    …tring.Lark_Legacy_Cancel)");
        this.f91348i = string3;
    }

    /* renamed from: b */
    public ApplyCollabDialog mo105551a(IInitBuilder.IDialogBuilder.IDialogCallback aVar) {
        ApplyCollabDialog aVar2 = this;
        if (aVar != null) {
            aVar2.f91342c = aVar;
        }
        return aVar2;
    }

    /* renamed from: b */
    public ApplyCollabDialog mo105548a(Contact contact) {
        ApplyCollabDialog aVar = this;
        if (contact != null) {
            aVar.f91350k.add(contact);
        }
        return aVar;
    }

    /* renamed from: b */
    public ApplyCollabDialog mo105549a(C36516a<?> aVar) {
        ApplyCollabDialog aVar2 = this;
        if (aVar != null) {
            aVar2.f91344e = aVar;
        }
        return aVar2;
    }

    /* renamed from: b */
    public ApplyCollabDialog mo105550a(List<? extends Contact> list) {
        ApplyCollabDialog aVar = this;
        if (list != null) {
            aVar.f91350k.addAll(list);
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick", "com/ss/android/lark/collaboration/ApplyCollabDialog$show$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.collaboration.a$b */
    public static final class DialogInterface$OnClickListenerC35337b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ApplyCollabDialog f91366a;

        /* renamed from: b */
        final /* synthetic */ Ref.ObjectRef f91367b;

        DialogInterface$OnClickListenerC35337b(ApplyCollabDialog aVar, Ref.ObjectRef objectRef) {
            this.f91366a = aVar;
            this.f91367b = objectRef;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            IInitBuilder.IDialogBuilder.IDialogCallback aVar = this.f91366a.f91342c;
            if (aVar != null) {
                aVar.mo105556a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick", "com/ss/android/lark/collaboration/ApplyCollabDialog$show$1$3$1", "com/ss/android/lark/collaboration/ApplyCollabDialog$$special$$inlined$apply$lambda$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.collaboration.a$c */
    public static final class DialogInterface$OnClickListenerC35338c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ApplyCollabDialog f91368a;

        /* renamed from: b */
        final /* synthetic */ Ref.ObjectRef f91369b;

        DialogInterface$OnClickListenerC35338c(ApplyCollabDialog aVar, Ref.ObjectRef objectRef) {
            this.f91368a = aVar;
            this.f91369b = objectRef;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (this.f91368a.f91343d) {
                this.f91368a.mo130051b();
                return;
            }
            T t = this.f91369b.element;
            if (t != null) {
                t.mo130056a(this.f91368a.f91341b, this.f91368a.f91340a, this.f91368a.f91342c);
            }
        }
    }
}
