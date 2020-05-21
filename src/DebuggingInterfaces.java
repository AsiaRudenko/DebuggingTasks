public class DebuggingInterfaces{
    public static void main(String[] args) {
        var o = DebuggingInternals.GetObject();
        DebuggingInternals.DoTheWork(o);
    }

    interface BaseInterface{
        void DoSomething();
        void DoSomethingElse();
    }
}


