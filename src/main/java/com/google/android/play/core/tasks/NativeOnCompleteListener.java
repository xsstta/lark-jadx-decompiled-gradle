package com.google.android.play.core.tasks;

public class NativeOnCompleteListener implements AbstractC22729a<Object> {

    /* renamed from: a */
    private final long f56244a;

    /* renamed from: b */
    private final int f56245b;

    public native void nativeOnComplete(long j, int i, Object obj, int i2);

    @Override // com.google.android.play.core.tasks.AbstractC22729a
    public void onComplete(Task<Object> task) {
        if (!task.isComplete()) {
            int i = this.f56245b;
            StringBuilder sb = new StringBuilder(50);
            sb.append("onComplete called for incomplete task: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        } else if (task.isSuccessful()) {
            nativeOnComplete(this.f56244a, this.f56245b, task.getResult(), 0);
        } else {
            Exception exception = task.getException();
            if (!(exception instanceof AbstractC22738j)) {
                nativeOnComplete(this.f56244a, this.f56245b, null, -100);
                return;
            }
            int errorCode = ((AbstractC22738j) exception).getErrorCode();
            if (errorCode != 0) {
                nativeOnComplete(this.f56244a, this.f56245b, null, errorCode);
                return;
            }
            int i2 = this.f56245b;
            StringBuilder sb2 = new StringBuilder(51);
            sb2.append("TaskException has error code 0 on task: ");
            sb2.append(i2);
            throw new IllegalStateException(sb2.toString());
        }
    }
}
