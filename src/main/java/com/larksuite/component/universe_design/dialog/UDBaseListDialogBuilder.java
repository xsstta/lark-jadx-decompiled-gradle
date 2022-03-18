package com.larksuite.component.universe_design.dialog;

import android.content.Context;
import com.larksuite.component.universe_design.dialog.UDBaseListDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u000267B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010&\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u0007¢\u0006\u0002\u0010'J\u0015\u0010(\u001a\u00028\u00002\b\u0010)\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00028\u00002\u0006\u0010)\u001a\u00020\u0013¢\u0006\u0002\u0010,J\u0015\u0010-\u001a\u00028\u00002\b\b\u0001\u0010)\u001a\u00020\u0013¢\u0006\u0002\u0010,J\u0019\u0010.\u001a\u00028\u00002\f\u0010/\u001a\b\u0012\u0004\u0012\u00020#00¢\u0006\u0002\u00101J\u0015\u00102\u001a\u00028\u00002\b\b\u0001\u0010)\u001a\u00020\u0013¢\u0006\u0002\u0010,J\u0013\u00103\u001a\u00028\u00002\u0006\u0010)\u001a\u00020\u0013¢\u0006\u0002\u0010,J\u0019\u00104\u001a\u00028\u00002\f\u0010/\u001a\b\u0012\u0004\u0012\u00020500¢\u0006\u0002\u00101R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00138\u0000@\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001e\u0010\u001b\u001a\u00020\u00138\u0000@\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00068"}, d2 = {"Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogBuilder;", "T", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mAdapter", "Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogAdapter;", "getMAdapter$universe_ui_dialog_release", "()Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogAdapter;", "setMAdapter$universe_ui_dialog_release", "(Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogAdapter;)V", "mItemClickListener", "Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "getMItemClickListener$universe_ui_dialog_release", "()Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "setMItemClickListener$universe_ui_dialog_release", "(Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;)V", "mItemHeight", "", "getMItemHeight$universe_ui_dialog_release", "()I", "setMItemHeight$universe_ui_dialog_release", "(I)V", "mItemLayoutRes", "getMItemLayoutRes$universe_ui_dialog_release", "setMItemLayoutRes$universe_ui_dialog_release", "mItemTextColorRes", "getMItemTextColorRes$universe_ui_dialog_release", "setMItemTextColorRes$universe_ui_dialog_release", "mItemTextSize", "getMItemTextSize$universe_ui_dialog_release", "setMItemTextSize$universe_ui_dialog_release", "mItems", "", "Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogBuilder$ListItem;", "getMItems$universe_ui_dialog_release", "()Ljava/util/List;", "adapter", "(Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogAdapter;)Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogBuilder;", "itemClickListener", "value", "(Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;)Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogBuilder;", "itemHeight", "(I)Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogBuilder;", "itemLayout", "itemList", "values", "", "(Ljava/util/List;)Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogBuilder;", "itemTextColor", "itemTextSize", "items", "", "ListItem", "ListItemBuilder", "universe-ui-dialog_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.dialog.b */
public abstract class UDBaseListDialogBuilder<T extends UDBaseListDialogBuilder<T>> extends UDBaseDialogBuilder<T> {

    /* renamed from: a */
    private UDListDialogController.OnItemClickListener f63301a;

    /* renamed from: b */
    private final List<ListItem> f63302b = new ArrayList();

    /* renamed from: c */
    private int f63303c = -1;

    /* renamed from: d */
    private int f63304d = -1;

    /* renamed from: e */
    private int f63305e = -1;

    /* renamed from: f */
    private int f63306f = -1;

    /* renamed from: g */
    private UDBaseListDialogAdapter f63307g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogBuilder$ListItem;", "", "builder", "Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogBuilder$ListItemBuilder;", "(Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogBuilder$ListItemBuilder;)V", "getBuilder", "()Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogBuilder$ListItemBuilder;", "text", "", "getText", "()Ljava/lang/CharSequence;", "textColor", "", "getTextColor", "()I", "textColorRes", "getTextColorRes", "universe-ui-dialog_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.dialog.b$a */
    public static final class ListItem {

        /* renamed from: a */
        private final CharSequence f63308a;

        /* renamed from: b */
        private final int f63309b;

        /* renamed from: c */
        private final int f63310c;

        /* renamed from: d */
        private final ListItemBuilder f63311d;

        /* renamed from: a */
        public final CharSequence mo90882a() {
            return this.f63308a;
        }

        /* renamed from: b */
        public final int mo90883b() {
            return this.f63309b;
        }

        /* renamed from: c */
        public final int mo90884c() {
            return this.f63310c;
        }

        public ListItem(ListItemBuilder bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "builder");
            this.f63311d = bVar;
            this.f63308a = bVar.mo90890d();
            this.f63309b = bVar.mo90885a();
            this.f63310c = bVar.mo90887b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\u0013\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\u0014\u001a\u00020\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogBuilder$ListItemBuilder;", "", "text", "", "(Ljava/lang/CharSequence;)V", "getText", "()Ljava/lang/CharSequence;", "setText", "textColor", "", "getTextColor", "()I", "setTextColor", "(I)V", "textColorRes", "getTextColorRes", "setTextColorRes", "build", "Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogBuilder$ListItem;", "color", "colorRes", "universe-ui-dialog_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.dialog.b$b */
    public static final class ListItemBuilder {

        /* renamed from: a */
        private int f63312a;

        /* renamed from: b */
        private int f63313b;

        /* renamed from: c */
        private CharSequence f63314c;

        /* renamed from: a */
        public final int mo90885a() {
            return this.f63312a;
        }

        /* renamed from: b */
        public final int mo90887b() {
            return this.f63313b;
        }

        /* renamed from: d */
        public final CharSequence mo90890d() {
            return this.f63314c;
        }

        /* renamed from: c */
        public final ListItem mo90889c() {
            return new ListItem(this);
        }

        /* renamed from: a */
        public final void mo90886a(int i) {
            this.f63312a = i;
        }

        /* renamed from: b */
        public final ListItemBuilder mo90888b(int i) {
            ListItemBuilder bVar = this;
            bVar.f63312a = i;
            return bVar;
        }

        public ListItemBuilder(CharSequence charSequence) {
            Intrinsics.checkParameterIsNotNull(charSequence, "text");
            this.f63314c = charSequence;
        }
    }

    /* renamed from: a */
    public final UDListDialogController.OnItemClickListener mo90871a() {
        return this.f63301a;
    }

    /* renamed from: b */
    public final List<ListItem> mo90874b() {
        return this.f63302b;
    }

    /* renamed from: c */
    public final int mo90875c() {
        return this.f63303c;
    }

    /* renamed from: d */
    public final int mo90877d() {
        return this.f63304d;
    }

    /* renamed from: e */
    public final int mo90879e() {
        return this.f63305e;
    }

    /* renamed from: f */
    public final int mo90880f() {
        return this.f63306f;
    }

    /* renamed from: g */
    public final UDBaseListDialogAdapter mo90881g() {
        return this.f63307g;
    }

    /* renamed from: a */
    public final T mo90867a(int i) {
        this.f63303c = i;
        return this;
    }

    /* renamed from: b */
    public final T mo90872b(int i) {
        this.f63305e = i;
        return this;
    }

    /* renamed from: c */
    public final T mo90876c(int i) {
        this.f63304d = i;
        return this;
    }

    /* renamed from: d */
    public final T mo90878d(int i) {
        this.f63306f = i;
        return this;
    }

    /* renamed from: a */
    public final T mo90868a(UDBaseListDialogAdapter aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "adapter");
        this.f63307g = aVar;
        return this;
    }

    /* renamed from: a */
    public final T mo90869a(UDListDialogController.OnItemClickListener aVar) {
        this.f63301a = aVar;
        return this;
    }

    /* renamed from: b */
    public final T mo90873b(List<ListItem> list) {
        Intrinsics.checkParameterIsNotNull(list, "values");
        this.f63302b.clear();
        this.f63302b.addAll(list);
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDBaseListDialogBuilder(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        setMController$universe_ui_dialog_release(new UDListDialogController(context));
        setMMarginInDp$universe_ui_dialog_release(12);
    }

    /* renamed from: a */
    public final T mo90870a(List<? extends CharSequence> list) {
        Intrinsics.checkParameterIsNotNull(list, "values");
        this.f63302b.clear();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.f63302b.add(new ListItemBuilder(it.next()).mo90889c());
        }
        return this;
    }
}
