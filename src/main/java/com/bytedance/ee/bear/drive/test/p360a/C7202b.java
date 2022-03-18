package com.bytedance.ee.bear.drive.test.p360a;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.EditText;
import com.bytedance.ee.bear.drive.test.p361b.AbstractC7206b;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.service.C10917c;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.test.a.b */
public class C7202b implements AbstractC7206b {

    /* renamed from: a */
    private Context f19323a;

    /* renamed from: b */
    private C10917c f19324b;

    @Override // com.bytedance.ee.bear.drive.test.p361b.AbstractC7206b
    /* renamed from: a */
    public String mo28199a() {
        return "第三方附件预览";
    }

    @Override // com.bytedance.ee.bear.drive.test.p361b.AbstractC7206b
    /* renamed from: b */
    public View.OnClickListener mo28200b() {
        return new View.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.test.p360a.$$Lambda$b$VQiicUPpkD6D5mhFRidsv55T7Yg */

            public final void onClick(View view) {
                C7202b.this.m28852a(view);
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m28852a(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f19323a);
        builder.setTitle("输入链接打开第三方附件");
        EditText editText = new EditText(this.f19323a);
        builder.setView(editText);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener(editText) {
            /* class com.bytedance.ee.bear.drive.test.p360a.$$Lambda$b$QSJti2bZaL85abxSdViX0hP9Gsg */
            public final /* synthetic */ EditText f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C7202b.this.m28853a(this.f$1, dialogInterface, i);
            }
        });
        builder.setNegativeButton("Cancel", $$Lambda$b$5qiS5lzHvNsui58FkMJ1XAAYBT0.INSTANCE);
        builder.show();
    }

    public C7202b(Context context, C10917c cVar) {
        this.f19323a = context;
        this.f19324b = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m28853a(EditText editText, DialogInterface dialogInterface, int i) {
        String str = editText.getText().toString().trim() + "?from=mail_attachment&mountNodeToken=mountNodeToken&mountPoint=mountPoint";
        if (!URLUtil.isNetworkUrl(str)) {
            Toast.showFailureText(this.f19323a, "请输入正确链接", 0);
        } else {
            ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17292a(str);
        }
    }
}
