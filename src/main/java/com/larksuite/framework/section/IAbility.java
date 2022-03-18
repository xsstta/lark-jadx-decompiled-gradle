package com.larksuite.framework.section;

import android.content.Context;
import android.content.Intent;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&JW\u0010\u0006\u001a\u00020\u00032M\u0010\u0007\u001aI\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00030\bH&¨\u0006\u0010"}, d2 = {"Lcom/larksuite/framework/section/IAbility;", "", "onDestroy", "", "provideContext", "Landroid/content/Context;", "registerActivityResult", "block", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "requestCode", "resultCode", "Landroid/content/Intent;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.framework.a.a */
public interface IAbility {
    /* renamed from: a */
    Context mo92048a();

    /* renamed from: a */
    void mo92049a(Function3<? super Integer, ? super Integer, ? super Intent, Unit> oVar);
}
