package android.ss.com.vboost;

public enum Status {
    BEGIN(1),
    END(2);
    
    private int status;

    public int getStatus() {
        return this.status;
    }

    private Status(int i) {
        this.status = i;
    }
}
