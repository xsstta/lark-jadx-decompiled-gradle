package com.ss.android.lark.widget.drag;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.DragEvent;
import android.view.View;
import androidx.core.graphics.C0768a;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.RomUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.C57788ai;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.UIHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003#$%B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J4\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\tH\u0007J\u001a\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\u0018\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\"*\b\u0012\u0004\u0012\u00020\u00040\"H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8BX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\t8BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\nR\u000e\u0010\u000e\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/lark/widget/drag/DragDropController;", "", "()V", "IMAGE_MIME_TYPE_PREFIX", "", "TAG", "TEXT_MIME_TYPE", "VIDEO_MIME_TYPE_PREFIX", "isDesktopMode", "", "()Z", "isDragDropEnabled", "isOneStep", "isOneStepEnabled", "sIsSmartisan", "buildDropFilePaths", "", "activity", "Landroid/app/Activity;", "event", "Landroid/view/DragEvent;", "callback", "Lcom/ss/android/lark/widget/drag/DragDropController$PermissionRequestCallBack2;", "consumeDragEvent", "view", "Landroid/view/View;", "currentChatterName", "listener", "Lcom/ss/android/lark/widget/drag/DragDropController$OnDragDropListener;", "hasMask", "setForeground", "drawable", "Landroid/graphics/drawable/Drawable;", "filterImage", "", "IOnUploadPhotoAPI", "OnDragDropListener", "PermissionRequestCallBack2", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.a.a */
public final class DragDropController {

    /* renamed from: a */
    public static final DragDropController f143463a = new DragDropController();

    /* renamed from: b */
    private static final boolean f143464b = RomUtils.m94953h();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/widget/drag/DragDropController$OnDragDropListener;", "", "onDrop", "", "filePaths", "", "", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.a.a$a */
    public interface OnDragDropListener {
        /* renamed from: a */
        void mo122119a(List<String> list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/widget/drag/DragDropController$PermissionRequestCallBack2;", "", "onSuccess", "", "filePaths", "", "", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.a.a$b */
    public interface PermissionRequestCallBack2 {
        /* renamed from: a */
        void mo197517a(List<String> list);
    }

    /* renamed from: a */
    public final boolean mo197514a(View view, DragEvent dragEvent, String str, OnDragDropListener aVar) {
        return m226111a(this, view, dragEvent, str, aVar, false, 16, null);
    }

    private DragDropController() {
    }

    /* renamed from: d */
    private final boolean m226113d() {
        return f143464b;
    }

    /* renamed from: c */
    private final boolean m226112c() {
        return DesktopUtil.m144307b();
    }

    /* renamed from: b */
    public final boolean mo197516b() {
        if (m226112c() || m226113d()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo197513a() {
        if (m226112c() || !m226113d()) {
            return false;
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/ss/android/lark/widget/drag/DragDropController$consumeDragEvent$1$1", "Lcom/ss/android/lark/widget/drag/DragDropController$PermissionRequestCallBack2;", "onSuccess", "", "filePaths", "", "", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.a.a$d */
    public static final class C58317d implements PermissionRequestCallBack2 {

        /* renamed from: a */
        final /* synthetic */ Activity f143469a;

        /* renamed from: b */
        final /* synthetic */ DragEvent f143470b;

        /* renamed from: c */
        final /* synthetic */ OnDragDropListener f143471c;

        @Override // com.ss.android.lark.widget.drag.DragDropController.PermissionRequestCallBack2
        /* renamed from: a */
        public void mo197517a(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "filePaths");
            this.f143471c.mo122119a(list);
        }

        C58317d(Activity activity, DragEvent dragEvent, OnDragDropListener aVar) {
            this.f143469a = activity;
            this.f143470b = dragEvent;
            this.f143471c = aVar;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final List<String> m226108a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "$this$filterImage");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            T t2 = t;
            boolean z = false;
            if (C26311p.m95292l(C26311p.m95283c((String) t2)) || StringsKt.endsWith$default((String) t2, ".0", false, 2, (Object) null)) {
                z = true;
            }
            if (z) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isGranted", "", "permissionGranted"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.a.a$c */
    public static final class C58316c implements C57805b.AbstractC57809a {

        /* renamed from: a */
        final /* synthetic */ int f143465a;

        /* renamed from: b */
        final /* synthetic */ Activity f143466b;

        /* renamed from: c */
        final /* synthetic */ ClipData f143467c;

        /* renamed from: d */
        final /* synthetic */ PermissionRequestCallBack2 f143468d;

        C58316c(int i, Activity activity, ClipData clipData, PermissionRequestCallBack2 bVar) {
            this.f143465a = i;
            this.f143466b = activity;
            this.f143467c = clipData;
            this.f143468d = bVar;
        }

        @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
        public final void permissionGranted(boolean z) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                Iterator it = RangesKt.until(0, this.f143465a).iterator();
                while (it.hasNext()) {
                    ClipData.Item itemAt = this.f143467c.getItemAt(((IntIterator) it).mo238946b());
                    Intrinsics.checkExpressionValueIsNotNull(itemAt, "fileData.getItemAt(index)");
                    String a = C57788ai.m224257a(this.f143466b, itemAt.getUri());
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
                ArrayList arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (!new File((String) obj).isDirectory()) {
                        arrayList3.add(obj);
                    }
                }
                ArrayList arrayList4 = arrayList3;
                if (arrayList4.isEmpty() && (!arrayList2.isEmpty())) {
                    LKUIToast.show(this.f143466b, (int) R.string.Lark_Legacy_FileBrowserNotSupport);
                }
                this.f143468d.mo197517a(arrayList4);
            }
        }
    }

    /* renamed from: a */
    private final void m226110a(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setForeground(drawable);
        }
    }

    /* renamed from: a */
    private final void m226109a(Activity activity, DragEvent dragEvent, PermissionRequestCallBack2 bVar) {
        ClipData clipData = dragEvent.getClipData();
        Intrinsics.checkExpressionValueIsNotNull(clipData, "fileData");
        int itemCount = clipData.getItemCount();
        if (itemCount == 0) {
            bVar.mo197517a(new ArrayList());
        } else {
            C57805b.m224333d(activity, new C58316c(itemCount, activity, clipData, bVar));
        }
    }

    /* renamed from: a */
    public final boolean mo197515a(View view, DragEvent dragEvent, String str, OnDragDropListener aVar, boolean z) {
        boolean z2;
        String str2;
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(dragEvent, "event");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        if (mo197513a() || !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!mo197516b()) {
            return false;
        }
        int action = dragEvent.getAction();
        if (action == 1) {
            return !dragEvent.getClipDescription().hasMimeType("text/plain");
        }
        Activity activity = null;
        if (action == 3) {
            if (z2) {
                m226110a(view, null);
            }
            Context context = view.getContext();
            if (context instanceof Activity) {
                Context context2 = view.getContext();
                if (context2 != null) {
                    activity = (Activity) context2;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                }
            } else if (context instanceof MutableContextWrapper) {
                Context context3 = view.getContext();
                if (context3 != null) {
                    Context baseContext = ((MutableContextWrapper) context3).getBaseContext();
                    if (baseContext instanceof Activity) {
                        activity = baseContext;
                    }
                    activity = activity;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.content.MutableContextWrapper");
                }
            }
            if (activity != null) {
                f143463a.m226109a(activity, dragEvent, new C58317d(activity, dragEvent, aVar));
            }
        } else if (action != 5) {
            if (action == 6 && z2) {
                m226110a(view, null);
            }
        } else if (z2) {
            int c = C0768a.m3716c(-1, (int) 229.5f);
            if (str == null) {
                str2 = UIHelper.getString(R.string.Lark_Legacy_DragAndDropFilesHere);
            } else {
                String string = UIHelper.getString(R.string.Lark_Chat_FileSendTo);
                str2 = UIHelper.mustacheFormat(string, "ChatName", ' ' + str);
            }
            m226110a(view, new C58318b(c, str2, UIHelper.getColor(R.color.lkui_N600), UIHelper.dp2px((float) 16)));
        }
        return true;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m226111a(DragDropController aVar, View view, DragEvent dragEvent, String str, OnDragDropListener aVar2, boolean z, int i, Object obj) {
        boolean z2;
        if ((i & 16) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        return aVar.mo197515a(view, dragEvent, str, aVar2, z2);
    }
}
